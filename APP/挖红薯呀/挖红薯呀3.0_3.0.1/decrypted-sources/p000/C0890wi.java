package p000;

import java.util.List;

/* JADX INFO: renamed from: wi */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0890wi implements qm0, InterfaceC0515nk {

    /* JADX INFO: renamed from: e */
    public static final C0675r3 f7133e = new C0675r3(11);

    /* JADX INFO: renamed from: d */
    public final C0616pi f7134d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0890wi(C0616pi c0616pi) {
        this.f7134d = c0616pi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qm0
    /* JADX INFO: renamed from: e */
    public final List mo610e(Integer num) {
        return this.f7134d.m3073E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0515nk
    public final InterfaceC0554ok getKey() {
        return f7133e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: h */
    public final /* bridge */ InterfaceC0618pk mo63h(InterfaceC0618pk interfaceC0618pk) {
        return pf1.m3034J(this, interfaceC0618pk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: l */
    public final /* bridge */ InterfaceC0515nk mo64l(InterfaceC0554ok interfaceC0554ok) {
        return pf1.m3062v(this, interfaceC0554ok);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: p */
    public final Object mo65p(InterfaceC0904ww interfaceC0904ww, Object obj) {
        return interfaceC0904ww.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: t */
    public final /* bridge */ InterfaceC0618pk mo66t(InterfaceC0554ok interfaceC0554ok) {
        return pf1.m3030F(this, interfaceC0554ok);
    }
}
