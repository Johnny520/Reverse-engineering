package p342;

import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子楪兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8823 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f24813 = 0;

    static {
        AbstractC3056.m6668(-3937677346212152743L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m14467(String str, String str2) {
        int length = str.length();
        int i = length / 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
        }
        String str3 = new String(bArr2, StandardCharsets.UTF_8);
        if (str3.startsWith(AbstractC3056.m6668(-3937677346212152743L))) {
            return str3.substring(AbstractC3056.m6668(-3937677346212152743L).length());
        }
        C2632.m5294(AbstractC3056.m6668(-3937677238837970343L).concat(str));
        return null;
    }
}
