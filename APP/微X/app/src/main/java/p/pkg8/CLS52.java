// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateFactory;

public final class CLS52 {
    public String FLD356;
    public byte[] FLD357;
    public final String FLD358;
    public final WeakReference FLD359;
    public PublicKey FLD360;

    public CLS52(Context context0, String s) {
        if(context0 != null) {
            this.FLD359 = new WeakReference(context0);
        }
        this.FLD358 = s;
    }

    // 此方法包含解密的字符串
    public final boolean MTH932(FileInputStream fileInputStream0, FileInputStream fileInputStream1) {
        byte[] arr_b;
        try {
            arr_b = new byte[fileInputStream1.available()];
            fileInputStream1.read(arr_b);
            fileInputStream1.close();
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
            arr_b = null;
        }
        if(arr_b == null) {
            return false;
        }
        Signature signature0 = Signature.getInstance("SHA1withRSA");
        if(this.FLD360 == null) {
            try {
                this.FLD360 = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(this.FLD357)).getPublicKey();
            }
            catch(Throwable throwable1) {
                CLS44.MTH897(throwable1);
            }
        }
        signature0.initVerify(this.FLD360);
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

