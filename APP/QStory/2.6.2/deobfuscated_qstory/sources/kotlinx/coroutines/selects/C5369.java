package kotlinx.coroutines.selects;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.InterfaceC5397;
import kotlinx.coroutines.internal.AbstractC5360;
import p052.InterfaceC6550;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5369 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6550 f14971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SuspendLambda f14972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f14973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6550 f14974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6550 f14975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f14976;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f14977 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object f14978;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ C5368 f14979;

    public C5369(C5368 c5368, Object obj, InterfaceC6550 interfaceC6550, InterfaceC6550 interfaceC65502, C4484 c4484, SuspendLambda suspendLambda, InterfaceC6550 interfaceC65503) {
        this.f14979 = c5368;
        this.f14976 = obj;
        this.f14975 = interfaceC6550;
        this.f14974 = interfaceC65502;
        this.f14973 = c4484;
        this.f14972 = suspendLambda;
        this.f14971 = interfaceC65503;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10421() {
        Object obj = this.f14978;
        if (obj instanceof AbstractC5360) {
            ((AbstractC5360) obj).mo10263(this.f14977, this.f14979.f14970);
            return;
        }
        InterfaceC5397 interfaceC5397 = obj instanceof InterfaceC5397 ? (InterfaceC5397) obj : null;
        if (interfaceC5397 != null) {
            interfaceC5397.dispose();
        }
    }
}
