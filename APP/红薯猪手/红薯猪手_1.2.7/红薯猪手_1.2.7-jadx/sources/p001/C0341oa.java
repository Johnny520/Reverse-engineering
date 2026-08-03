package p001;

import android.os.Build;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: ۟.oa */
/* JADX INFO: loaded from: classes.dex */
public final class C0341oa {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public static String m915(byte[] bArr, byte[] bArr2) {
        if (C0354pa.f1030 == 0) {
            C0354pa.f1030 = 1;
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (stackTrace[i].getClassName().startsWith(C0341oa.class.getName())) {
                    C0354pa.f1030 = 2;
                    break;
                }
                i++;
            }
        }
        if (C0354pa.f1030 != 2) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        int i2 = Build.VERSION.SDK_INT + 99;
        if (i2 < 120) {
            bArr = new byte[0];
        } else {
            int length2 = bArr.length;
            int length3 = bArr2.length;
            int i3 = 0;
            while (i3 < length2) {
                if (i2 >= length3) {
                    i2 = 0;
                }
                bArr[i3] = (byte) (bArr[i3] ^ bArr2[i2]);
                i3++;
                i2++;
            }
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
