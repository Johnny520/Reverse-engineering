package p167;

import androidx.emoji2.text.flatbuffer.C2302;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7704 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f20901;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f20902;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7696 f20903;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7696 f20904;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7696 f20905;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f20906 = 1;

    public C7704(C7696 c7696) {
        this.f20905 = c7696;
        this.f20904 = c7696;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m12973() {
        C2302 c2302M12965 = this.f20904.f20885.m12965();
        int iM3991 = c2302M12965.m3991(6);
        return !(iM3991 == 0 || ((ByteBuffer) c2302M12965.f6463).get(iM3991 + c2302M12965.f6466) == 0) || this.f20902 == 65039;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12974() {
        this.f20906 = 1;
        this.f20904 = this.f20905;
        this.f20901 = 0;
    }
}
