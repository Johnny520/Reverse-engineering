// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.content.Context;
import android.text.TextUtils;
import b.ⁱᵔ.CLS431;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public final class CLS26 {
    public final String FLD92;
    public String FLD93;
    public final WeakReference FLD94;
    public PublicKey FLD95;
    public String FLD96;
    public byte[] FLD97;

    public CLS26(Context context0, String s) {
        if(context0 != null) {
            this.FLD94 = new WeakReference(context0);
        }
        this.FLD92 = s;
    }

    public final String MTH874() {
        if(TextUtils.isEmpty(this.FLD96)) {
            this.FLD96 = CLS431.MTH6161(this.MTH875().getEncoded());
        }
        return this.FLD96;
    }

    // 此方法包含解密的字符串
    public final PublicKey MTH875() {
        if(this.FLD95 == null) {
            try {
                this.FLD95 = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(this.FLD97)).getPublicKey();
                return this.FLD95;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return this.FLD95;
    }

    // 此方法包含解密的字符串
    public final String MTH876() {
        if(!TextUtils.isEmpty(this.FLD93)) {
            return this.FLD93;
        }
        String s = this.FLD92;
        byte[] arr_b = null;
        if(TextUtils.isEmpty(s)) {
            s = (this.FLD94 == null ? null : ((Context)this.FLD94.get())) == null ? null : (this.FLD94 == null ? null : ((Context)this.FLD94.get())).getPackageCodePath();
        }
        if(!TextUtils.isEmpty(s)) {
            try {
                JarFile jarFile0 = new JarFile(s);
                JarEntry jarEntry0 = jarFile0.getJarEntry("classes.dex");
                if(jarEntry0 != null) {
                    InputStream inputStream0 = jarFile0.getInputStream(jarEntry0);
                    byte[] arr_b1 = new byte[inputStream0.available()];
                    while(inputStream0.read(arr_b1) != -1) {
                    }
                    inputStream0.close();
                    Certificate[] arr_certificate = jarEntry0.getCertificates();
                    byte[] arr_b2 = arr_certificate == null || arr_certificate.length <= 0 ? null : arr_certificate[0].getEncoded();
                    jarFile0.close();
                    arr_b = arr_b2;
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        if(arr_b == null) {
            return "";
        }
        String s1 = CLS431.MTH6161(arr_b);
        this.FLD93 = s1;
        return s1;
    }

    // 此方法包含解密的字符串
    public final boolean MTH877(File file0) {
        if(!CLS31.MTH1001(file0)) {
            return false;
        }
        try {
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            byte[] arr_b = CLS31.MTH1020(new FileInputStream(file0.getAbsolutePath() + "_s"));
            if(arr_b != null) {
                Signature signature0 = Signature.getInstance("SHA1withRSA");
                signature0.initVerify(this.MTH875());
                BufferedInputStream bufferedInputStream0 = new BufferedInputStream(fileInputStream0);
                byte[] arr_b1 = new byte[0x800];
                while(bufferedInputStream0.available() != 0) {
                    signature0.update(arr_b1, 0, bufferedInputStream0.read(arr_b1));
                }
                fileInputStream0.close();
                bufferedInputStream0.close();
                return signature0.verify(arr_b);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }
}

