package p183;

import androidx.emoji2.text.flatbuffer.C3135;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8534 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f21241;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f21242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8526 f21243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8526 f21244;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8526 f21245;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21246 = 1;

    public C8534(C8526 c8526) {
        this.f21245 = c8526;
        this.f21244 = c8526;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m13562() {
        C3135 c3135M13554 = this.f21244.f21225.m13554();
        int iM4561 = c3135M13554.m4561(6);
        return !(iM4561 == 0 || ((ByteBuffer) c3135M13554.f6809).get(iM4561 + c3135M13554.f6812) == 0) || this.f21242 == 65039;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13563() {
        this.f21246 = 1;
        this.f21244 = this.f21245;
        this.f21241 = 0;
    }
}
