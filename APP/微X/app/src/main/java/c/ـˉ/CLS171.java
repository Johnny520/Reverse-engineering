// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

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

public class CLS171 {
    public PublicKey FLD839;
    public String FLD840;
    public final String FLD841;
    public WeakReference FLD842;
    public byte[] FLD843;
    public String FLD844;
    public String FLD845;

    public CLS171(Context context0, String s) {
        if(context0 != null) {
            this.FLD842 = new WeakReference(context0);
        }
        this.FLD841 = s;
    }

    public final Context MTH3013() {
        return this.FLD842 == null ? null : ((Context)this.FLD842.get());
    }

    public String MTH3014() {
        if(!TextUtils.isEmpty(this.FLD840)) {
            return this.FLD840;
        }
        String s = CLS181.MTH3086(CLS181.MTH3089(this.MTH3021()));
        this.FLD840 = s;
        return s;
    }

    public String MTH3015() {
        if(!TextUtils.isEmpty(this.FLD844)) {
            return this.FLD844;
        }
        String s = CLS262.MTH4054(this.MTH3021());
        this.FLD844 = s;
        return s;
    }

    // 此方法包含解密的字符串
    public boolean MTH3016(InputStream inputStream0, InputStream inputStream1) {
        byte[] arr_b = CLS262.MTH4044(inputStream1);
        byte[] arr_b1 = CLS262.MTH4044(inputStream0);
        if(arr_b1 != null && arr_b != null) {
            Signature signature0 = Signature.getInstance("\uD8E3HA1withRSA");
            signature0.initVerify(this.MTH3020());
            signature0.update(arr_b1);
            return signature0.verify(arr_b);
        }
        return false;
    }

    public String MTH3017() {
        if(TextUtils.isEmpty(this.FLD845)) {
            this.FLD845 = CLS181.MTH3086(this.MTH3020().getEncoded());
        }
        return this.FLD845;
    }

    public void MTH3018(byte[] arr_b) {
        this.FLD843 = arr_b;
    }

    // 此方法包含解密的字符串
    public boolean MTH3019(File file0) {
        if(!CLS262.MTH4050(file0)) {
            return false;
        }
        try {
            return this.MTH3016(new FileInputStream(file0), new FileInputStream(file0.getAbsolutePath() + "\uD8E3s"));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public final PublicKey MTH3020() {
        if(this.FLD839 == null) {
            try {
                this.FLD839 = CertificateFactory.getInstance("\uD8E3.509").generateCertificate(new ByteArrayInputStream(this.FLD843)).getPublicKey();
                return this.FLD839;
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return this.FLD839;
    }

    public final String MTH3021() {
        if(!TextUtils.isEmpty(this.FLD841)) {
            return this.FLD841;
        }
        return this.MTH3013() == null ? null : this.MTH3013().getPackageCodePath();
    }
}

