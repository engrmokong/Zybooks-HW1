public class Laptop extends Computer{
   /* public void setWiFiStatus(String wifiStatus) {
        wifiQuality = wifiStatus;
    }

    @Override
    public void printStatus() {
       /* System.out.println("WiFi: " + wifiQuality);
        //System.out.println("CPU: " + cpuUsage);


        super.printStatus();
        System.out.println("WiFi: " + wifiQuality);
    }

    */
   public void setComputerStatus(String cpuStatus, String internetStatus,
                                 String wifiStatus) {
       cpuUsage = cpuStatus;
       internet = internetStatus;
       wifiQuality = wifiStatus;
   }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("WiFi: " + wifiQuality);
    }



    private String wifiQuality;
}
