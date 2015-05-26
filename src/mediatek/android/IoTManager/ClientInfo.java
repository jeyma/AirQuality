package mediatek.android.IoTManager;

/**
 * Created by admin on 2015/5/11.
 */
public class ClientInfo
{
    public int ClientID;
    public String VendorName;
    public String IPAddress;
    public String ProductType;
    public String ProductName;

    public void setClientID(int clientID)
    {
        ClientID = clientID;
    }

    public void setVendorName(String vendorName)
    {
        VendorName = vendorName;
    }

    public void setIPAddress(String IPAddress)
    {
        this.IPAddress = IPAddress;
    }

    public void setProductType(String productType)
    {
        ProductType = productType;
    }

    public void setProductName(String productName)
    {
        ProductName = productName;
    }
}
