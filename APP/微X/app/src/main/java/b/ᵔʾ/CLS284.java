// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import b.ʾᵢ.CLS27;
import java.net.HttpURLConnection;
import java.net.URL;

public final class CLS284 implements Runnable {
    public final CLS286 FLD2957;
    public final String FLD2958;

    public CLS284(CLS286 ˆʿ0, String s) {
        this.FLD2957 = ˆʿ0;
        this.FLD2958 = s;
    }

    // 此方法包含解密的字符串
    @Override
    public final void run() {
        String s = this.FLD2958;
        CLS286 ˆʿ0 = this.FLD2957;
        ˆʿ0.getClass();
        try {
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)new URL(s).openConnection();
            httpURLConnection0.setReadTimeout(5000);
            httpURLConnection0.setConnectTimeout(5000);
            httpURLConnection0.setRequestMethod("POST");
            httpURLConnection0.setInstanceFollowRedirects(true);
            httpURLConnection0.setRequestProperty("User-Agent", CLS27.MTH882("useragent"));
            httpURLConnection0.addRequestProperty("Content-Type", CLS27.MTH882("contenttype"));
            httpURLConnection0.setDoInput(true);
            httpURLConnection0.setDoOutput(true);
            httpURLConnection0.connect();
            try {
                httpURLConnection0.getResponseCode();
            }
            catch(Throwable unused_ex) {
            }
            ˆʿ0.FLD2965.add(s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

