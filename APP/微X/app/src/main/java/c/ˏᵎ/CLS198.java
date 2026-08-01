// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateFactory;

public class CLS198 {
    public WeakReference FLD837;
    public String FLD838;
    public String FLD839;
    public String FLD840;
    public final String FLD841;
    public byte[] FLD842;
    public PublicKey FLD843;

    public CLS198(Context context0, String s) {
        if(context0 != null) {
            this.FLD837 = new WeakReference(context0);
        }
        this.FLD841 = s;
    }

    public String MTH2948() {
        if(TextUtils.isEmpty(this.FLD839)) {
            this.FLD839 = CLS224.MTH3091(this.MTH2952().getEncoded());
        }
        return this.FLD839;
    }

    // 此方法包含解密的字符串
    public boolean MTH2949(InputStream inputStream0, InputStream inputStream1) {
        byte[] arr_b = CLS176.MTH2585(inputStream1);
        byte[] arr_b1 = CLS176.MTH2585(inputStream0);
        if(arr_b1 != null && arr_b != null) {
            Signature signature0 = Signature.getInstance("SHA1withRSA");
            signature0.initVerify(this.MTH2952());
            signature0.update(arr_b1);
            return signature0.verify(arr_b);
        }
        return false;
    }

    public String MTH2950() {
        if(!TextUtils.isEmpty(this.FLD838)) {
            return this.FLD838;
        }
        String s = CLS224.MTH3091(CLS224.MTH3086(this.MTH2951()));
        this.FLD838 = s;
        return s;
    }

    public final String MTH2951() {
        if(!TextUtils.isEmpty(this.FLD841)) {
            return this.FLD841;
        }
        return this.MTH2956() == null ? null : this.MTH2956().getPackageCodePath();
    }

    // 此方法包含解密的字符串
    public final PublicKey MTH2952() {
        if(this.FLD843 == null) {
            try {
                this.FLD843 = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(this.FLD842)).getPublicKey();
                return this.FLD843;
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return this.FLD843;
    }

    // 此方法包含解密的字符串
    public boolean MTH2953(File file0) {
        if(!CLS176.MTH2570(file0)) {
            return false;
        }
        try {
            return this.MTH2949(new FileInputStream(file0), new FileInputStream(file0.getAbsolutePath() + "_s"));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    public String MTH2954() {
        if(!TextUtils.isEmpty(this.FLD840)) {
            return this.FLD840;
        }
        String s = CLS176.MTH2586(this.MTH2951());
        this.FLD840 = s;
        return s;
    }

    public void MTH2955(byte[] arr_b) {
        this.FLD842 = arr_b;
    }

    public final Context MTH2956() {
        return this.FLD837 == null ? null : ((Context)this.FLD837.get());
    }
}

