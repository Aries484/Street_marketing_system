public class Campaign {

    private String campaignName;
    private String productName;

    public Campaign(String campaignName, String productName) {
        this.campaignName = campaignName;
        this.productName = productName;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void showCampaign() {
        System.out.println("Campaign: " + campaignName);
        System.out.println("Product: " + productName);
    }
}