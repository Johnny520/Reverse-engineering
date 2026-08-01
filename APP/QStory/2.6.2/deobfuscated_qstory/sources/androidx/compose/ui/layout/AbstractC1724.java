package androidx.compose.ui.layout;

import p000.AbstractC6087;
import p052.InterfaceC6557;
import p205.C7897;
import p205.C7905;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1724 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f4996;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f4998;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f4997 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f4995 = AbstractC1725.f4999;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f4994 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m3127() {
        this.f4998 = AbstractC6087.m11420((int) (this.f4997 >> 32), C7897.m13313(this.f4995), C7897.m13309(this.f4995));
        int iM11420 = AbstractC6087.m11420((int) (this.f4997 & 4294967295L), C7897.m13312(this.f4995), C7897.m13310(this.f4995));
        this.f4996 = iM11420;
        int i = this.f4998;
        long j = this.f4997;
        this.f4994 = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM11420 - ((int) (j & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public int mo3128() {
        return (int) (this.f4997 & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int mo3129() {
        return (int) (this.f4997 >> 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public Object mo3046() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m3130(long j) {
        if (C7897.m13307(this.f4995, j)) {
            return;
        }
        this.f4995 = j;
        m3127();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m3131(long j) {
        if (C7905.m13329(this.f4997, j)) {
            return;
        }
        this.f4997 = j;
        m3127();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public abstract void mo3118(long j, float f, InterfaceC6557 interfaceC6557);
}
