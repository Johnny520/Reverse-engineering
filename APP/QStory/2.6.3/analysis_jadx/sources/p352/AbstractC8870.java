package p352;

import bsh.C2633;
import java.nio.charset.StandardCharsets;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8870 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f25015 = 0;

    static {
        AbstractC8405.m13973(AbstractC8405.m13972(1238));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m14536(String str, String str2) {
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
        if (str3.startsWith(AbstractC8405.m13973("喵喵呜呜喵喵喵喵~喵喵呜呜呜呜喵呜~喵喵呜呜呜呜呜呜~喵喵呜喵呜喵呜呜~喵喵呜喵呜呜呜喵~喵喵呜呜喵喵呜呜"))) {
            return str3.substring(AbstractC8405.m13973("喵喵呜呜喵喵喵喵~喵喵呜呜呜呜喵呜~喵喵呜呜呜呜呜呜~喵喵呜喵呜喵呜呜~喵喵呜喵呜呜呜喵~喵喵呜呜喵喵呜呜").length());
        }
        C2633.m5339(AbstractC8405.m13972(1237).concat(str));
        return null;
    }
}
