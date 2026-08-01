// Decompiled by JEB v5.42.0.202606242140

package p.pkg5;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import p.pkg11.CLS69;
import p.pkg8.CLS185;
import p.pkg8.CLS186;
import p.pkg8.CLS43.CLS42;
import p.pkg8.CLS43;
import p.pkg8.CLS44;
import p.pkg8.CLS47;
import p.pkg8.CLS53;
import p.pkg8.CLS55.CLS54;
import p.pkg8.CLS56;

public final class CLS25 {
    public HashSet FLD281;
    public String FLD282;
    public String FLD283;
    public final CLS69 FLD284;
    public static final CLS25 FLD285;
    public final CLS69 FLD286;
    public boolean FLD287;
    public final CLS69 FLD288;

    static {
        CLS25.FLD285 = new CLS25();
    }

    // 此方法包含解密的字符串
    public CLS25() {
        String s3;
        this.FLD283 = "";
        this.FLD282 = "";
        this.FLD287 = true;
        this.FLD281 = new HashSet();
        CLS69 ˋˈ0 = new CLS69();
        this.FLD284 = ˋˈ0;
        CLS69 ˋˈ1 = new CLS69();
        this.FLD288 = ˋˈ1;
        CLS69 ˋˈ2 = new CLS69();
        this.FLD286 = ˋˈ2;
        CLS186 ˏﹳ0 = new CLS186(2, this);
        CLS53.FLD362.MTH938("updateLicense", ((CLS54)ˏﹳ0));
        String s = this.MTH819();
        if(!TextUtils.isEmpty(s) && s.contains("#")) {
            String[] arr_s = s.split("#");
            if(arr_s.length != 3) {
                return;
            }
            this.FLD281.clear();
            ˋˈ0.MTH1127();
            ˋˈ1.MTH1127();
            ˋˈ2.MTH1127();
            try {
                String s1 = CLS44.MTH886();
                String s2 = arr_s[2];
                try {
                    if(TextUtils.isEmpty(s2)) {
                        s3 = "";
                    }
                    else {
                        SecretKeySpec secretKeySpec0 = CLS56.MTH954(s1);
                        byte[] arr_b = Base64.decode(s2, 2);
                        Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS7Padding");
                        cipher0.init(2, secretKeySpec0, new IvParameterSpec(CLS56.FLD370));
                        s3 = new String(cipher0.doFinal(arr_b), "UTF-8");
                    }
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new GeneralSecurityException(unsupportedEncodingException0);
                }
                JSONArray jSONArray0 = new JSONArray(s3);
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    this.FLD281.add(jSONArray0.getInt(v));
                }
            }
            catch(Throwable throwable0) {
                CLS44.MTH897(throwable0);
            }
            this.MTH818();
        }
    }

    // 此方法包含解密的字符串
    public final void MTH818() {
        this.FLD284.MTH1127();
        String s = CLS44.MTH886();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Object object0 = CLS44.MTH893(150, new Object[]{6, s});
        String s1 = object0 == null ? "" : ((String)object0);
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        CLS185 ˋˈ0 = new CLS185(this, s1, 3);
        CLS43.FLD320.MTH879(((CLS42)ˋˈ0));
    }

    // 此方法包含解密的字符串
    public final String MTH819() {
        String s = CLS53.FLD362.MTH940("getLicData", new Object[0]);
        if(!TextUtils.isEmpty(s)) {
            this.FLD283 = s;
            return s;
        }
        return CLS44.MTH891().MTH924("LIC", this.FLD283);
    }

    // 此方法包含解密的字符串
    public final boolean MTH820() {
        Object object0;
        CLS53 ᴵᐧ0 = CLS53.FLD362;
        Object[] arr_object = new Object[0];
        if(ᴵᐧ0.FLD366.containsKey("getVerifierData")) {
            CLS47 ˎᵔ0 = (CLS47)ᴵᐧ0.FLD366.get("getVerifierData");
            if(ˎᵔ0 == null) {
                goto label_14;
            }
            else {
                ArrayList arrayList0 = ˎᵔ0.MTH907(arr_object);
                if(arrayList0.isEmpty()) {
                    goto label_14;
                }
                else {
                    object0 = arrayList0.get(0);
                }
            }
        }
        else if(ᴵᐧ0.FLD363 == null) {
        label_14:
            object0 = null;
        }
        else {
            Method method0 = ᴵᐧ0.MTH945("gof");
            if(method0 != null) {
                try {
                    object0 = method0.invoke(ᴵᐧ0.FLD363, "getVerifierData", arr_object);
                    goto label_15;
                }
                catch(Throwable unused_ex) {
                }
            }
            goto label_14;
        }
    label_15:
        String s = (String)object0;
        if(TextUtils.isEmpty(s)) {
            s = CLS44.MTH891().MTH924("verifier6", this.FLD282);
        }
        else {
            this.FLD282 = s;
        }
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            if(!TextUtils.isEmpty(s)) {
                Object object1 = CLS44.MTH893(0x84, new Object[]{"verifier6", s, CLS44.MTH886()});
                if(object1 != null) {
                    return ((Boolean)object1).booleanValue();
                }
            }
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
        }
        return false;
    }

    public final boolean MTH821(String s) {
        boolean z = true;
        if(!this.FLD281.contains(1)) {
            return false;
        }
        CLS69 ˋˈ0 = this.FLD284;
        if(ˋˈ0.MTH1129(s)) {
            if(ˋˈ0.MTH1129(s)) {
                Pair pair0 = (Pair)ˋˈ0.FLD423.get(s);
                if(pair0 != null) {
                    return ((Boolean)pair0.second).booleanValue();
                }
            }
            throw new NullPointerException();
        }
        String s1 = CLS44.MTH886();
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        Object object0 = CLS44.MTH893(150, new Object[]{2, s1, s});
        if(object0 == null || !((Boolean)object0).booleanValue()) {
            z = false;
        }
        ˋˈ0.MTH1128(s, Boolean.valueOf(z));
        return z;
    }
}

