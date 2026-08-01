package kotlinx.coroutines.selects;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.InterfaceC5398;
import kotlinx.coroutines.internal.AbstractC5361;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6551 f14971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SuspendLambda f14972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f14973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6551 f14974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6551 f14975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f14976;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f14977 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object f14978;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ C5369 f14979;

    public C5370(C5369 c5369, Object obj, InterfaceC6551 interfaceC6551, InterfaceC6551 interfaceC65512, C4485 c4485, SuspendLambda suspendLambda, InterfaceC6551 interfaceC65513) {
        this.f14979 = c5369;
        this.f14976 = obj;
        this.f14975 = interfaceC6551;
        this.f14974 = interfaceC65512;
        this.f14973 = c4485;
        this.f14972 = suspendLambda;
        this.f14971 = interfaceC65513;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10425() {
        Object obj = this.f14978;
        if (obj instanceof AbstractC5361) {
            ((AbstractC5361) obj).mo10267(this.f14977, this.f14979.f14970);
            return;
        }
        InterfaceC5398 interfaceC5398 = obj instanceof InterfaceC5398 ? (InterfaceC5398) obj : null;
        if (interfaceC5398 != null) {
            interfaceC5398.dispose();
        }
    }
}
