package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1169 implements InterfaceC1206 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f1432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final RepeatMode f1433;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long f1434;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1168 f1435;

    public C1169(InterfaceC1168 interfaceC1168, RepeatMode repeatMode, long j) {
        this.f1435 = interfaceC1168;
        this.f1433 = repeatMode;
        this.f1434 = ((long) (interfaceC1168.mo1504() + interfaceC1168.mo1505())) * 1000000;
        this.f1432 = j * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo998(AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC1189 m1514(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        long j2 = this.f1432;
        long j3 = j + j2;
        long j4 = this.f1434;
        return j3 > j4 ? this.f1435.mo1006(j4 - j2, abstractC1189, abstractC11893, abstractC11892) : abstractC11892;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m1515(long j) {
        long j2 = this.f1432;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.f1434;
        long j5 = j3 / j4;
        return (this.f1433 == RepeatMode.Restart || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1000() {
        return true;
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC1189 mo1003(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return this.f1435.mo1003(m1515(j), abstractC1189, abstractC11892, m1514(j, abstractC1189, abstractC11893, abstractC11892));
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC1189 mo1006(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return this.f1435.mo1006(m1515(j), abstractC1189, abstractC11892, m1514(j, abstractC1189, abstractC11893, abstractC11892));
    }
}
