package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1333;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0355 implements InterfaceC1333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C0354 f1220;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC6557 f1221;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC6557 f1222;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0351 f1223;

    public C0355(C0354 c0354, C0351 c0351, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        this.f1220 = c0354;
        this.f1223 = c0351;
        this.f1221 = interfaceC6557;
        this.f1222 = interfaceC65572;
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        m1059(this.f1220.f1217.m1062());
        return ((AbstractC1347) this.f1223.f1208).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1059(InterfaceC0353 interfaceC0353) {
        Object objInvoke = this.f1222.invoke(interfaceC0353.mo1055());
        boolean zM1069 = this.f1220.f1217.m1069();
        C0351 c0351 = this.f1223;
        if (zM1069) {
            c0351.m1052(this.f1222.invoke(interfaceC0353.mo1056()), objInvoke, (InterfaceC0311) this.f1221.invoke(interfaceC0353));
        } else {
            c0351.m1054(objInvoke, (InterfaceC0311) this.f1221.invoke(interfaceC0353));
        }
    }
}
