package p000;

/* JADX INFO: renamed from: Qo */
/* JADX INFO: loaded from: classes.dex */
public class C0719Qo extends AbstractC2580uE {

    /* JADX INFO: renamed from: e */
    public static final C0111Ci f2303e = new C0111Ci(1);

    /* JADX INFO: renamed from: d */
    public final C0471Ky f2304d = new C0471Ky();

    @Override // p000.AbstractC2580uE
    /* JADX INFO: renamed from: b */
    public final void mo297b() {
        C0471Ky c0471Ky = this.f2304d;
        int i = c0471Ky.f1531c;
        if (i > 0) {
            c0471Ky.f1530b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = c0471Ky.f1530b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c0471Ky.f1531c = 0;
    }
}
