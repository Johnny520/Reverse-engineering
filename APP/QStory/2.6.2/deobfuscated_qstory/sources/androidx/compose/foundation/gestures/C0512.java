package androidx.compose.foundation.gestures;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0512 implements InterfaceC0507 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0557 f1511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0502 f1512;

    public C0512(C0502 c0502, InterfaceC0557 interfaceC0557) {
        this.f1512 = c0502;
        this.f1511 = interfaceC0557;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0507
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final float mo1241(float f) {
        float fAbs = Math.abs(f);
        C0502 c0502 = this.f1512;
        if (fAbs != 0.0f && !((Boolean) c0502.f1493.invoke()).booleanValue()) {
            throw new FlingCancellationException();
        }
        return c0502.m1254(c0502.m1259(((C0515) this.f1511).m1279(2, c0502.m1253(c0502.m1258(f)))));
    }
}
