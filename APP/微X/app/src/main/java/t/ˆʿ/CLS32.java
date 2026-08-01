// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import t.ˊﾞ.CLS113;
import t.ˊﾞ.CLS293;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS130;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS139.CLS138;
import t.ᵔʾ.CLS304;

public final class CLS32 {
    public static final CLS32 FLD447;
    public final CLS113 FLD448;
    public String FLD449;
    public final CLS113 FLD450;
    public final CLS113 FLD451;
    public HashSet FLD452;
    public boolean FLD453;
    public String FLD454;

    static {
        CLS32.FLD447 = new CLS32();
    }

    // 此方法包含解密的字符串
    public CLS32() {
        this.FLD449 = "";
        this.FLD454 = "";
        this.FLD453 = true;
        this.FLD452 = new HashSet();
        this.FLD448 = new CLS113(300000L);
        this.FLD451 = new CLS113(300000L);
        this.FLD450 = new CLS113(300000L);
        CLS293 ᐧⁱ0 = new CLS293(this, 1);
        CLS123.FLD912.MTH2002("updateLicense", ((CLS138)ᐧⁱ0));
        try {
            this.MTH1340();
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1336() {
        String s = CLS123.FLD912.MTH2005("getLicData", new Object[0]);
        if(!TextUtils.isEmpty(s)) {
            this.FLD449 = s;
            return s;
        }
        return CLS133.MTH2103().MTH2134("LIC", this.FLD449);
    }

    // 此方法包含解密的字符串
    public final void MTH1337() {
        this.FLD448.MTH1895();
        String s = CLS133.MTH2112();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Object object0 = CLS133.MTH2102(150, new Object[]{6, s});
        String s1 = object0 == null ? "" : ((String)object0);
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        CLS304 ﾞᐧ0 = new CLS304(this, s1, 14);
        CLS137.FLD972.MTH2141(((CLS136)ﾞᐧ0));
    }

    // 此方法包含解密的字符串
    public final boolean MTH1338() {
        String s = (String)CLS123.FLD912.MTH2011("getVerifierData", new Object[0]);
        if(TextUtils.isEmpty(s)) {
            s = CLS133.MTH2103().MTH2134("verifier6", this.FLD454);
        }
        else {
            this.FLD454 = s;
        }
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            if(!TextUtils.isEmpty(s)) {
                Object object0 = CLS133.MTH2102(0x84, new Object[]{"verifier6", s, CLS133.MTH2112()});
                if(object0 != null) {
                    return ((Boolean)object0).booleanValue();
                }
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return false;
    }

    public final boolean MTH1339(String s) {
        boolean z = true;
        if(!this.FLD452.contains(1)) {
            return false;
        }
        CLS113 ﾞᐧ0 = this.FLD448;
        if(ﾞᐧ0.MTH1897(s)) {
            return ((Boolean)ﾞᐧ0.MTH1896(s)).booleanValue();
        }
        String s1 = CLS133.MTH2112();
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        Object object0 = CLS133.MTH2102(150, new Object[]{2, s1, s});
        if(object0 == null || !((Boolean)object0).booleanValue()) {
            z = false;
        }
        ﾞᐧ0.MTH1898(s, Boolean.valueOf(z), ﾞᐧ0.FLD838);
        return z;
    }

    // 此方法包含解密的字符串
    public final void MTH1340() {
        String s3;
        String s = this.MTH1336();
        if(!TextUtils.isEmpty(s) && s.contains("#")) {
            String[] arr_s = s.split("#");
            if(arr_s.length != 3) {
                return;
            }
            this.FLD452.clear();
            this.FLD448.MTH1895();
            this.FLD451.MTH1895();
            this.FLD450.MTH1895();
            try {
                String s1 = CLS133.MTH2112();
                String s2 = arr_s[2];
                try {
                    if(TextUtils.isEmpty(s2)) {
                        s3 = "";
                    }
                    else {
                        SecretKeySpec secretKeySpec0 = CLS130.MTH2073(s1);
                        byte[] arr_b = Base64.decode(s2, 2);
                        Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS7Padding");
                        cipher0.init(2, secretKeySpec0, new IvParameterSpec(CLS130.FLD936));
                        s3 = new String(cipher0.doFinal(arr_b), "UTF-8");
                    }
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new GeneralSecurityException(unsupportedEncodingException0);
                }
                JSONArray jSONArray0 = new JSONArray(s3);
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    this.FLD452.add(jSONArray0.getInt(v));
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            this.MTH1337();
        }
    }
}

