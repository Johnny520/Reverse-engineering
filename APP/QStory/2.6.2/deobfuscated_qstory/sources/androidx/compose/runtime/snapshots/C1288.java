package androidx.compose.runtime.snapshots;

import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1288 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6557 f3768;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6557 f3769;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3770;

    public /* synthetic */ C1288(InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, int i) {
        this.f3770 = i;
        this.f3768 = interfaceC6557;
        this.f3769 = interfaceC65572;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f3770;
        C5175 c5175 = C5175.f14739;
        InterfaceC6557 interfaceC6557 = this.f3769;
        InterfaceC6557 interfaceC65572 = this.f3768;
        switch (i) {
            case 0:
                interfaceC65572.invoke(obj);
                interfaceC6557.invoke(obj);
                break;
            default:
                interfaceC65572.invoke(obj);
                interfaceC6557.invoke(obj);
                break;
        }
        return c5175;
    }
}
