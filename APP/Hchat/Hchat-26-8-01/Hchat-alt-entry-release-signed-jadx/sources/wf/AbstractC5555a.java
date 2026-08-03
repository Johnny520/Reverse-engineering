package wf;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;

/* JADX INFO: renamed from: wf.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5555a implements InterfaceC5559e {

    /* JADX INFO: renamed from: g */
    public final InterfaceC5560f f22657g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC5555a(InterfaceC5560f interfaceC5560f) {
        this.f22657g = interfaceC5560f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: e */
    public final /* bridge */ InterfaceC5561g mo2059e(InterfaceC5561g interfaceC5561g) {
        return AbstractC1089i.m2786q0(this, interfaceC5561g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5559e
    public final InterfaceC5560f getKey() {
        return this.f22657g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: k */
    public final Object mo2061k(InterfaceC1235p interfaceC1235p, Object obj) {
        return interfaceC1235p.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: s */
    public /* bridge */ InterfaceC5559e mo2062s(InterfaceC5560f interfaceC5560f) {
        return AbstractC1089i.m2797w(this, interfaceC5560f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: t */
    public /* bridge */ InterfaceC5561g mo2063t(InterfaceC5560f interfaceC5560f) {
        return AbstractC1089i.m2777l0(this, interfaceC5560f);
    }
}
