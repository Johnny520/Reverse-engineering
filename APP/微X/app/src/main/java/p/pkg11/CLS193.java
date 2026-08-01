// Decompiled by JEB v5.42.0.202606242140

package p.pkg11;

import java.net.HttpURLConnection;
import java.net.URL;
import p.pkg12.CLS75;
import p.pkg12.CLS76;
import p.pkg5.CLS183;
import p.pkg8.CLS43.CLS42;
import p.pkg8.CLS43;
import p.pkg8.CLS44;

public final class CLS193 implements CLS42, CLS70 {
    public final Object FLD430;
    public final Object FLD431;
    public final Object FLD432;

    public CLS193(Object object0, CLS75 ٴʼ0, Object object1) {
        this.FLD430 = object0;
        this.FLD432 = ٴʼ0;
        this.FLD431 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // p.pkg8.CLS43$CLS42
    public final void run() {
        String s = (String)this.FLD430;
        CLS75 ٴʼ0 = (CLS75)this.FLD432;
        CLS75 ٴʼ1 = (CLS75)this.FLD431;
        try {
            URL uRL0 = new URL(s);
            try {
                HttpURLConnection.setFollowRedirects(true);
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                httpURLConnection0.setConnectTimeout(5000);
                httpURLConnection0.setRequestMethod("HEAD");
                httpURLConnection0.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");
                if(httpURLConnection0.getResponseCode() == 200) {
                    goto label_17;
                }
                else {
                    goto label_19;
                }
                goto label_20;
            }
            catch(Throwable throwable1) {
                CLS44.MTH897(throwable1);
                goto label_19;
            }
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
            goto label_19;
        }
    label_17:
        boolean z = true;
        goto label_20;
    label_19:
        z = false;
    label_20:
        if(z) {
            ٴʼ0.getClass();
            CLS183 ᐧᴵ0 = new CLS183(ٴʼ0, 0);
            CLS43.FLD320.MTH880(((CLS42)ᐧᴵ0));
            return;
        }
        ٴʼ1.getClass();
        CLS183 ᐧᴵ1 = new CLS183(ٴʼ1, 1);
        CLS43.FLD320.MTH880(((CLS42)ᐧᴵ1));
    }

    @Override  // p.pkg11.CLS72$CLS70
    public final boolean MTH1130(String s) {
        CLS73 ٴʼ0 = (CLS73)this.FLD430;
        CLS76 ﾞᵢ0 = (CLS76)this.FLD432;
        CLS72 ˎᵔ0 = (CLS72)this.FLD431;
        try {
            boolean z = ٴʼ0.MTH1146(s, ﾞᵢ0);
            if(z) {
                CLS197 ﹳˑ0 = new CLS197(1, ˎᵔ0);
                CLS43.FLD320.MTH880(((CLS42)ﹳˑ0));
            }
            return z;
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
            return true;
        }
    }
}

