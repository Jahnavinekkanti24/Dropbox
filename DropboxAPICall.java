import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class DropboxAPICall {

    private static final String ACCESS_TOKEN = "sl.u.AGAUndDFiGLlyOtgxu0c09TjXjFqTkzcl76juWOkxSIeeFoHnu-o1Ga6qhRAXjG2RJ5nSzRP_sE064eH-wHmBEWoa-xEAhN_QH_opNdQvMiQGxXWvvXAtTZAY6fior1lugZjJJcXySit6GABYrI4zr_WMJHzKMV11P2rYlzg1WOBqxnViAGWkVoIv_IT7IzTglWsqdaLXcl0AxNHJ8gMwnhaNRYPHAX2Xh4IqlhjTGpVq8nlNwgHHteGaWt4TQRz1oBEOsrQMbVYG0aUcsQExWWn0IZ0-AixM7GbWHO5m0anczDy8apY-bjyAKiAXIL0S6CwwHk1OXMOpdx2gcJEAV_j-iB6brZ7xsR55u9VPLVQfl2O5_HVzVF2xaVHWBVRUNWoSUlbrbWyY_SsG4IXnVYmXdM_CCSB7suiBHHdVcLJIdD6RREELQ_Lwb5KaPGdy4GA_RFZrC1gt5bmveC4aCSAAIw40oCaGjTizk4JLO50pRiC8yrr589NoVZKPanHL28CY_mOStqy09p60APPImHzY9D_7ZUFj4BuJtnxYLGcvYfekA7ftTQqvDZIWVDBt6QIaGPBP5UvT53pTLrL6fB-axu51nj_CmYJEbmKM3IUkmxBKd-IxZkfvxV1MlYzUVh9_y4NSYiYBexvlOITGImDFzFF4a1TiCFARW6p9btwa3To6U8Hm6f_iM1Uesg8NdKIZ0M7Nitgss1VufG2Kz7KGfmGZ0IcULNbUBZdXFheDSr6ApKHbpPm2qCh5POcCUVBuoc0PT-i_kHazywZHvdgwvtKEV8FZH861N8R05CYHFpzlLF8OQVDQ-1u7xCFEIKKrJ80ojwYuld6nEsrUkQL0wnzAzTXM47mD_ghpjRlpTOEQ-QqrzcmlfZCxK81UxOy6viDs92lKtv8OhBxoLDWPfLRU5RvIXK5nvabuTSsJDzEFApFxOLnbpVFsBUKeazX_nKY8E-N2QOIgxAB2QHbC8FIUgKYuWVcvLUo7iknwSrv643mpksW_D3cIVX-w9S10cvgvlmu8hbU7DHONyHmts0eu-7R-qtyrpwhKixEFvHXwNIuY20L96gK6V8MYacFtxOugyoxRSki23gJ68n64j1NYjGegL3GDDXtz0uN8WBco6wzuLtjKVmHHn1SXDgbAoSTyXdnG0arByVyIIs7_XcxAo5G0P7T60FzXZm5-0OE4cjrr6TpFtfd3M5h5-jzvE3hVCogCmLBp4w0UISr6314fCd4psf62DIiu7mYX5NhuytMCD9tznOS7nipuC7mB7fySLatRdV3W4ccKKvSZ68HZ2ukcaqvE1AACpMzOAGfEFLLL4hiYFgs0cSYuDbTLkTBYKsGgTRJrcq8X_wGefbRCG0EPvbn_NTZ13m8vBPx7f6_Rp4krxv2Qs-DqS2AJ6mVLg1S2M8NfuZ-awU0XRy0WBcr6LDdEzedrxFbD7pezCjeXkJkbtT7GLxKS_QF";

    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.dropboxapi.com/2/users/get_current_account");
            
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Bearer " + ACCESS_TOKEN);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.getOutputStream().close();
          
            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println("Dropbox Account Info:");
            System.out.println(response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
