package p167;

import androidx.compose.animation.core.C0325;
import androidx.emoji2.text.flatbuffer.C2301;
import androidx.emoji2.text.flatbuffer.C2302;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ThreadLocal f20883 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile int f20884 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0325 f20885;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20886;

    public C7699(C0325 c0325, int i) {
        this.f20885 = c0325;
        this.f20886 = i;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C2302 c2302M12995 = m12995();
        int iM4001 = c2302M12995.m4001(4);
        sb.append(Integer.toHexString(iM4001 != 0 ? ((ByteBuffer) c2302M12995.f6464).getInt(iM4001 + c2302M12995.f6467) : 0));
        sb.append(", codepoints:");
        C2302 c2302M129952 = m12995();
        int iM40012 = c2302M129952.m4001(16);
        if (iM40012 != 0) {
            int i2 = iM40012 + c2302M129952.f6467;
            i = ((ByteBuffer) c2302M129952.f6464).getInt(((ByteBuffer) c2302M129952.f6464).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m12996(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2302 m12995() {
        ThreadLocal threadLocal = f20883;
        C2302 c2302 = (C2302) threadLocal.get();
        if (c2302 == null) {
            c2302 = new C2302();
            threadLocal.set(c2302);
        }
        C2301 c2301 = (C2301) this.f20885.f1095;
        int iM4001 = c2301.m4001(6);
        if (iM4001 != 0) {
            int i = iM4001 + c2301.f6467;
            int i2 = (this.f20886 * 4) + ((ByteBuffer) c2301.f6464).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c2301.f6464).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c2301.f6464;
            c2302.f6464 = byteBuffer;
            if (byteBuffer != null) {
                c2302.f6467 = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c2302.f6465 = i4;
                c2302.f6466 = ((ByteBuffer) c2302.f6464).getShort(i4);
                return c2302;
            }
            c2302.f6467 = 0;
            c2302.f6465 = 0;
            c2302.f6466 = 0;
        }
        return c2302;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12996(int i) {
        C2302 c2302M12995 = m12995();
        int iM4001 = c2302M12995.m4001(16);
        if (iM4001 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2302M12995.f6464;
        int i2 = iM4001 + c2302M12995.f6467;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }
}
