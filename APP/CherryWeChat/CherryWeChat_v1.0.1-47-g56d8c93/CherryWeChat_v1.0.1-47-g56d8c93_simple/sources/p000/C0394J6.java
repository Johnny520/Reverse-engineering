package p000;

/* JADX INFO: renamed from: J6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0394J6 implements InterfaceC0980Ws {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1331a;

    /* JADX INFO: renamed from: b */
    public final Object f1332b;

    public /* synthetic */ C0394J6(int r1, Object r2) {
        this.f1331a = r1;
        this.f1332b = r2;
    }

    public final String toString() {
        switch(this.f1331a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return "DisposeOnCancel[" + ((C2416qg) this.f1332b) + ']';
    L7:
        return "CancelHandler.UserSupplied[" + C2240mk.class.getSimpleName() + '@' + AbstractC0148Dc.m278l(this) + ']';
    }
}
