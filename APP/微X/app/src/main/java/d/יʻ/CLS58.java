// Decompiled by JEB v5.42.0.202606242140

package d.יʻ;

import android.content.Context;
import android.text.TextUtils;
import d.ˑʽ.CLS37;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public final class CLS58 {
    public PublicKey FLD291;
    public String FLD292;
    public final String FLD293;
    public String FLD294;
    public final WeakReference FLD295;
    public byte[] FLD296;

    public CLS58(Context context0, String s) {
        if(context0 != null) {
            this.FLD295 = new WeakReference(context0);
        }
        this.FLD293 = s;
    }

    // 此方法包含解密的字符串
    public final String MTH725() {
        if(!TextUtils.isEmpty(this.FLD292)) {
            return this.FLD292;
        }
        String s = this.FLD293;
        byte[] arr_b = null;
        if(TextUtils.isEmpty(s)) {
            s = (this.FLD295 == null ? null : ((Context)this.FLD295.get())) == null ? null : (this.FLD295 == null ? null : ((Context)this.FLD295.get())).getPackageCodePath();
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
                    if(arr_certificate != null && arr_certificate.length > 0) {
                        arr_b = arr_certificate[0].getEncoded();
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        if(arr_b == null) {
            return "";
        }
        String s1 = CLS37.MTH600(arr_b);
        this.FLD292 = s1;
        return s1;
    }

    // 此方法包含解密的字符串
    public final String MTH726() {
        if(TextUtils.isEmpty(this.FLD294)) {
            if(this.FLD291 == null) {
                try {
                    this.FLD291 = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(this.FLD296)).getPublicKey();
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
            }
            this.FLD294 = CLS37.MTH600(this.FLD291.getEncoded());
        }
        return this.FLD294;
    }
}

