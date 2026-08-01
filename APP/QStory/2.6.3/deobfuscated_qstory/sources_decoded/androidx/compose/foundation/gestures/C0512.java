package androidx.compose.foundation.gestures;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0512 implements InterfaceC0507 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0557 f1512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0502 f1513;

    public C0512(C0502 c0502, InterfaceC0557 interfaceC0557) {
        this.f1513 = c0502;
        this.f1512 = interfaceC0557;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0507
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final float mo1251(float f) {
        float fAbs = Math.abs(f);
        C0502 c0502 = this.f1513;
        if (fAbs != 0.0f && !((Boolean) c0502.f1494.invoke()).booleanValue()) {
            throw new FlingCancellationException();
        }
        return c0502.m1264(c0502.m1269(((C0515) this.f1512).m1289(2, c0502.m1263(c0502.m1268(f)))));
    }
}
