package p167;

import androidx.emoji2.text.flatbuffer.C2302;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f20896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f20897;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7697 f20898;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7697 f20899;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7697 f20900;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f20901 = 1;

    public C7705(C7697 c7697) {
        this.f20900 = c7697;
        this.f20899 = c7697;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m13003() {
        C2302 c2302M12995 = this.f20899.f20880.m12995();
        int iM4001 = c2302M12995.m4001(6);
        return !(iM4001 == 0 || ((ByteBuffer) c2302M12995.f6464).get(iM4001 + c2302M12995.f6467) == 0) || this.f20897 == 65039;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13004() {
        this.f20901 = 1;
        this.f20899 = this.f20900;
        this.f20896 = 0;
    }
}
