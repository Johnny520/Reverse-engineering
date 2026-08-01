package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1333;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0355 implements InterfaceC1333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C0354 f1220;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC6558 f1221;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC6558 f1222;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0351 f1223;

    public C0355(C0354 c0354, C0351 c0351, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        this.f1220 = c0354;
        this.f1223 = c0351;
        this.f1221 = interfaceC6558;
        this.f1222 = interfaceC65582;
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        m1060(this.f1220.f1217.m1063());
        return ((AbstractC1347) this.f1223.f1208).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1060(InterfaceC0353 interfaceC0353) {
        Object objInvoke = this.f1222.invoke(interfaceC0353.mo1056());
        boolean zM1070 = this.f1220.f1217.m1070();
        C0351 c0351 = this.f1223;
        if (zM1070) {
            c0351.m1053(this.f1222.invoke(interfaceC0353.mo1057()), objInvoke, (InterfaceC0311) this.f1221.invoke(interfaceC0353));
        } else {
            c0351.m1055(objInvoke, (InterfaceC0311) this.f1221.invoke(interfaceC0353));
        }
    }
}
