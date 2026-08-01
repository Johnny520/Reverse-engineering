package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0323 implements InterfaceC0360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f1087;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final RepeatMode f1088;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long f1089;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0322 f1090;

    public C0323(InterfaceC0322 interfaceC0322, RepeatMode repeatMode, long j) {
        this.f1090 = interfaceC0322;
        this.f1088 = repeatMode;
        this.f1089 = ((long) (interfaceC0322.mo944() + interfaceC0322.mo945())) * 1000000;
        this.f1087 = j * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo438(AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC0343 m954(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        long j2 = this.f1087;
        long j3 = j + j2;
        long j4 = this.f1089;
        return j3 > j4 ? this.f1090.mo446(j4 - j2, abstractC0343, abstractC03433, abstractC03432) : abstractC03432;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m955(long j) {
        long j2 = this.f1087;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.f1089;
        long j5 = j3 / j4;
        return (this.f1088 == RepeatMode.Restart || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo440() {
        return true;
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC0343 mo443(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return this.f1090.mo443(m955(j), abstractC0343, abstractC03432, m954(j, abstractC0343, abstractC03433, abstractC03432));
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC0343 mo446(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return this.f1090.mo446(m955(j), abstractC0343, abstractC03432, m954(j, abstractC0343, abstractC03433, abstractC03432));
    }
}
