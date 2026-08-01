package p183;

import androidx.compose.animation.core.C1171;
import androidx.emoji2.text.flatbuffer.C3134;
import androidx.emoji2.text.flatbuffer.C3135;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ThreadLocal f21228 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile int f21229 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1171 f21230;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21231;

    public C8528(C1171 c1171, int i) {
        this.f21230 = c1171;
        this.f21231 = i;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C3135 c3135M13554 = m13554();
        int iM4561 = c3135M13554.m4561(4);
        sb.append(Integer.toHexString(iM4561 != 0 ? ((ByteBuffer) c3135M13554.f6809).getInt(iM4561 + c3135M13554.f6812) : 0));
        sb.append(", codepoints:");
        C3135 c3135M135542 = m13554();
        int iM45612 = c3135M135542.m4561(16);
        if (iM45612 != 0) {
            int i2 = iM45612 + c3135M135542.f6812;
            i = ((ByteBuffer) c3135M135542.f6809).getInt(((ByteBuffer) c3135M135542.f6809).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m13555(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3135 m13554() {
        ThreadLocal threadLocal = f21228;
        C3135 c3135 = (C3135) threadLocal.get();
        if (c3135 == null) {
            c3135 = new C3135();
            threadLocal.set(c3135);
        }
        C3134 c3134 = (C3134) this.f21230.f1440;
        int iM4561 = c3134.m4561(6);
        if (iM4561 != 0) {
            int i = iM4561 + c3134.f6812;
            int i2 = (this.f21231 * 4) + ((ByteBuffer) c3134.f6809).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c3134.f6809).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c3134.f6809;
            c3135.f6809 = byteBuffer;
            if (byteBuffer != null) {
                c3135.f6812 = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c3135.f6810 = i4;
                c3135.f6811 = ((ByteBuffer) c3135.f6809).getShort(i4);
                return c3135;
            }
            c3135.f6812 = 0;
            c3135.f6810 = 0;
            c3135.f6811 = 0;
        }
        return c3135;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m13555(int i) {
        C3135 c3135M13554 = m13554();
        int iM4561 = c3135M13554.m4561(16);
        if (iM4561 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c3135M13554.f6809;
        int i2 = iM4561 + c3135M13554.f6812;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }
}
