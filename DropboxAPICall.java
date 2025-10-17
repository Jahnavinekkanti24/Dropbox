import java.io.*;
import java.net.*;
import javax.net.ssl.HttpsURLConnection;

public class DropboxAPICall {
    public static void main(String[] args) {
        String ACCESS_TOKEN = "sl.u.AGCgnXTq4c2nhOcrGJ6CG0uceRvVmW9qVVT6rUj_oxHsm2Dsx-Zs99Ju9uLY7eGdiL8CmIrjCSmyZQuIIgVT7gNO91qy2v_LEcvSQSpvgNQvBsd0sn1c2FEeeOr62JYSjY-WAYnZ7grpoTemD5uphd8tgP0IfXk87WTZffHV3TR47crh2j4nqMet0KxueFbmYHrj0RErC5LjzgURiXbRgmjHsJ-BCBYAxSah1gh1m_90r20TgSvk4iQh3ezO5Z2Pje3bTizzTTOqlnEmGL8zMeM6yYC8DL1JGR7axR7-UkdjHDDNZ6uwbZEk8V0Y8vYhoHrc-NdUXY5hgascrw5mhhx8ZNKZMk3i_wLraasgmjcqfyfSGWoINKAyDhdelWHT9V9fZ9_uCxz1owNzbwxnkzZujcTqr-hgf3tSPE1UYeK_7Hb_Csva6WRpYXD9MM0t4K3abf5a_5WSCxvpEp6IZZcA609RW7NXHI5qnDN5TgmK0r33mJ1HnCGaYYbCC6Ydj-M1UwlF1S9NmTsJohSb9DdSDPE9pb_ZeSkTdK_nmeBpJYJHS83pRfofucYPaL94lB_kdvHUsRFt44UZYD69J_5jS8_4CAs8F8zGSRohxQr_jbpthvwmsLzWjlz10UFopirNVbhP0H_1F2BPrS6tQm1VtXWwkzVRz3T8_QInocw7G74LWQg76VfLBzrZPLJO6WatlOecM2iY5rXaGpSLwxZCOvnOssskGQn-ztskQpnYV_CRPwU5bkCSjIUolDKYzOd6nD1aRI-SbTMMLYPXc3WoEh1jYKKU7KqM-bi5tUaN3HukQg3eI2P_cqfl1Y28WIxQ7UkojHqFHwHSAaGRh81xaIQ-F93HauyZCQVcz7iway4S0P62WPzCRjrzszp-HHJuNIP-kBaGeSmHQGD6a3WJ_2Ni57jZo9xRnWU0TY1Md4oHG3h2zKO2kxHO4R6wDgLMbUB3IrQytHWGj-v10y9NjpsLhpz6GXm5PkH9YVdIKmirIvZrQ-50rx7zJ_JyQOcL7do_mak9_You3jFmvnBGs9f8PFnqcpRXv9BkHri8y21chVWgd8LOR60Kf4z5dwjuKTm7Mj44RI5N20_n90-Of4XaZ1_1d1ucPfiJDPX_jdn2yPFpX5twIE7yUOLi9Cj5vaFsUcXZYEbxxV9Q5A3qVk9d-tbC5u_B2dL8APBGJ0PRpPLU6hpaQY3J3SPZNMrN_R7JHa9_C0y5LVk7e0b3vx-HaBvyz7KKS8ksUjD6J45ZkNImUlUP7poz5REM9Q72UA04XaiIze2MWC8CWaxUWAd3hPrs3hymmGbYUVWkp_UOAOuMEz7A3o4M6UBRuZ6-988tJKeiNA8QFCRXNCdSzx05K_4bPyDmlxXXVh96hx51JMgy7sFBceIV397zqqGmzDPf5bRGcj0D2GMufgifY-1n9niVeI4R2qFgHxx-01d7j5jqVK5-jhy36iwOPj4";
        String url = "https://api.dropboxapi.com/2/users/get_current_account";

        try {
            URL obj = new URL(url);
            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

            con.setRequestMethod("POST");
            con.setRequestProperty("Authorization", "Bearer " + ACCESS_TOKEN);
            con.setRequestProperty("Content-Type", "application/json");

            con.setDoOutput(true);

            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println("Response: " + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
