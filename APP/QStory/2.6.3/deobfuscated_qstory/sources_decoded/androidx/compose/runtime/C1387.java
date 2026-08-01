package androidx.compose.runtime;

import kotlin.coroutines.InterfaceC4360;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1387 implements InterfaceC1388, InterfaceC1395 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4360 f4030;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f4031;

    public C1387(InterfaceC1395 interfaceC1395, InterfaceC4360 interfaceC4360) {
        this.f4031 = interfaceC1395;
        this.f4030 = interfaceC4360;
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        return this.f4031.getValue();
    }

    @Override // androidx.compose.runtime.InterfaceC1395
    public final void setValue(Object obj) {
        this.f4031.setValue(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f4030;
    }
}
