package p326;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import p287.AbstractC8405;
import p392.C9102;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰楪子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8742 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8742 f24636;

    static {
        AbstractC8405.m13972(2635);
        AbstractC8405.m13972(2636);
        f24636 = new C8742();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class m14438() {
        C9102 c9102 = new C9102();
        c9102.m14695(AbstractC8405.m13972(2643), AbstractC8405.m13972(2644));
        c9102.f25526 = AbstractC8405.m13972(313);
        Class clsM14696 = c9102.m14696();
        AbstractC8405.m13972(1549);
        clsM14696.getClass();
        return clsM14696;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static byte[] m14439(byte[] bArr) {
        AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵呜呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵呜喵");
        bArr.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 4);
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeInt(bArr.length + 4);
                dataOutputStream.write(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArrayOutputStream.close();
                AbstractC8405.m13972(2641);
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }
}
