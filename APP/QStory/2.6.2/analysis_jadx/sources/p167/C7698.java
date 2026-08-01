package p167;

import androidx.compose.animation.core.C0325;
import androidx.emoji2.text.flatbuffer.C2301;
import androidx.emoji2.text.flatbuffer.C2302;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7698 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ThreadLocal f20888 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile int f20889 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0325 f20890;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20891;

    public C7698(C0325 c0325, int i) {
        this.f20890 = c0325;
        this.f20891 = i;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C2302 c2302M12965 = m12965();
        int iM3991 = c2302M12965.m3991(4);
        sb.append(Integer.toHexString(iM3991 != 0 ? ((ByteBuffer) c2302M12965.f6463).getInt(iM3991 + c2302M12965.f6466) : 0));
        sb.append(", codepoints:");
        C2302 c2302M129652 = m12965();
        int iM39912 = c2302M129652.m3991(16);
        if (iM39912 != 0) {
            int i2 = iM39912 + c2302M129652.f6466;
            i = ((ByteBuffer) c2302M129652.f6463).getInt(((ByteBuffer) c2302M129652.f6463).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m12966(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2302 m12965() {
        ThreadLocal threadLocal = f20888;
        C2302 c2302 = (C2302) threadLocal.get();
        if (c2302 == null) {
            c2302 = new C2302();
            threadLocal.set(c2302);
        }
        C2301 c2301 = (C2301) this.f20890.f1095;
        int iM3991 = c2301.m3991(6);
        if (iM3991 != 0) {
            int i = iM3991 + c2301.f6466;
            int i2 = (this.f20891 * 4) + ((ByteBuffer) c2301.f6463).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c2301.f6463).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c2301.f6463;
            c2302.f6463 = byteBuffer;
            if (byteBuffer != null) {
                c2302.f6466 = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c2302.f6464 = i4;
                c2302.f6465 = ((ByteBuffer) c2302.f6463).getShort(i4);
                return c2302;
            }
            c2302.f6466 = 0;
            c2302.f6464 = 0;
            c2302.f6465 = 0;
        }
        return c2302;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12966(int i) {
        C2302 c2302M12965 = m12965();
        int iM3991 = c2302M12965.m3991(16);
        if (iM3991 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2302M12965.f6463;
        int i2 = iM3991 + c2302M12965.f6466;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }
}
