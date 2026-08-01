package p074O2;

import p112W2.InterfaceC1603e;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: O2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1043a implements InterfaceC1049g {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1050h f3281d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1043a(InterfaceC1050h interfaceC1050h) {
        this.f3281d = interfaceC1050h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: A */
    public final Object mo1165A(InterfaceC1603e interfaceC1603e, Object obj) {
        return interfaceC1603e.mo0g(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: C */
    public /* bridge */ InterfaceC1049g mo1166C(InterfaceC1050h interfaceC1050h) {
        return AbstractC1785a.m3250j(this, interfaceC1050h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1049g
    public final InterfaceC1050h getKey() {
        return this.f3281d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: j */
    public /* bridge */ InterfaceC1051i mo1167j(InterfaceC1050h interfaceC1050h) {
        return AbstractC1785a.m3253n(this, interfaceC1050h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: m */
    public final /* bridge */ InterfaceC1051i mo1168m(InterfaceC1051i interfaceC1051i) {
        return AbstractC1785a.m3254o(this, interfaceC1051i);
    }
}
