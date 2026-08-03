package p000;

/* JADX INFO: renamed from: Qo */
/* JADX INFO: loaded from: classes.dex */
public class C0719Qo extends AbstractC2580uE {

    /* JADX INFO: renamed from: e */
    public static final C0111Ci f2303e = null;

    /* JADX INFO: renamed from: d */
    public final C0471Ky f2304d;

    static {
        f2303e = new C0111Ci(1);
    }

    public C0719Qo() {
        this.f2304d = new C0471Ky();
    }

    @Override // p000.AbstractC2580uE
    /* JADX INFO: renamed from: b */
    public final void mo297b() {
        C0471Ky r0 = this.f2304d;
        int r1 = r0.f1531c;
        if (r1 > 0) goto L9;
        Object[] r3 = r0.f1530b;
        int r4 = 0;
    L5:
        if (r4 >= r1) goto L7;
        r3[r4] = null;
        r4 = r4 + 1;
        goto L5
    L7:
        r0.f1531c = 0;
        return;
    L9:
        r0.f1530b[0].getClass();
        throw new ClassCastException();
    }
}
