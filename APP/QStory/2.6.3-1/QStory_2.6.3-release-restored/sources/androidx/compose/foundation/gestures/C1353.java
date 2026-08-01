package androidx.compose.foundation.gestures;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1353 implements InterfaceC1348 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1398 f1857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1343 f1858;

    public C1353(C1343 c1343, InterfaceC1398 interfaceC1398) {
        this.f1858 = c1343;
        this.f1857 = interfaceC1398;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1348
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final float mo1811(float f) {
        float fAbs = Math.abs(f);
        C1343 c1343 = this.f1858;
        if (fAbs != 0.0f && !((Boolean) c1343.f1839.invoke()).booleanValue()) {
            throw new FlingCancellationException();
        }
        return c1343.m1824(c1343.m1829(((C1356) this.f1857).m1849(2, c1343.m1823(c1343.m1828(f)))));
    }
}
