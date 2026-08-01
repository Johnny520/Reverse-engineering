package androidx.compose.runtime;

import kotlin.coroutines.InterfaceC4359;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1387 implements InterfaceC1388, InterfaceC1395 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4359 f4029;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f4030;

    public C1387(InterfaceC1395 interfaceC1395, InterfaceC4359 interfaceC4359) {
        this.f4030 = interfaceC1395;
        this.f4029 = interfaceC4359;
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        return this.f4030.getValue();
    }

    @Override // androidx.compose.runtime.InterfaceC1395
    public final void setValue(Object obj) {
        this.f4030.setValue(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f4029;
    }
}
