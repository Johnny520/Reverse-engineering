package p000a;

import java.util.ArrayList;
import p000a.C0029B9;
import p000a.C0693le;

/* JADX INFO: renamed from: a.K1 */
/* JADX INFO: loaded from: classes.dex */
public class C0184K1 implements C0029B9.a {

    /* JADX INFO: renamed from: d */
    public a f636d;

    /* JADX INFO: renamed from: a */
    public C0693le f633a = null;

    /* JADX INFO: renamed from: b */
    public float f634b = 0.0f;

    /* JADX INFO: renamed from: c */
    public final ArrayList<C0693le> f635c = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public boolean f637e = false;

    /* JADX INFO: renamed from: a.K1$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        float mo341a(int i);

        /* JADX INFO: renamed from: b */
        float mo342b(C0184K1 c0184k1, boolean z);

        /* JADX INFO: renamed from: c */
        void mo343c(C0693le c0693le, float f);

        void clear();

        /* JADX INFO: renamed from: d */
        boolean mo344d(C0693le c0693le);

        /* JADX INFO: renamed from: e */
        void mo345e(C0693le c0693le, float f, boolean z);

        /* JADX INFO: renamed from: f */
        C0693le mo346f(int i);

        /* JADX INFO: renamed from: g */
        void mo347g(float f);

        /* JADX INFO: renamed from: h */
        float mo348h(C0693le c0693le, boolean z);

        /* JADX INFO: renamed from: i */
        float mo349i(C0693le c0693le);

        /* JADX INFO: renamed from: j */
        void mo350j();

        /* JADX INFO: renamed from: k */
        int mo351k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0184K1() {
    }

    @Override // p000a.C0029B9.a
    /* JADX INFO: renamed from: a */
    public C0693le mo87a(boolean[] zArr) {
        return m497e(zArr, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m494b(C0029B9 c0029b9, int i) {
        this.f636d.mo343c(c0029b9.m78i(i), 1.0f);
        this.f636d.mo343c(c0029b9.m78i(i), -1.0f);
    }

    /* JADX INFO: renamed from: c */
    public final void m495c(C0693le c0693le, C0693le c0693le2, C0693le c0693le3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f634b = i;
        }
        if (z) {
            this.f636d.mo343c(c0693le, 1.0f);
            this.f636d.mo343c(c0693le2, -1.0f);
            this.f636d.mo343c(c0693le3, -1.0f);
        } else {
            this.f636d.mo343c(c0693le, -1.0f);
            this.f636d.mo343c(c0693le2, 1.0f);
            this.f636d.mo343c(c0693le3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m496d(C0693le c0693le, C0693le c0693le2, C0693le c0693le3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f634b = i;
        }
        if (z) {
            this.f636d.mo343c(c0693le, 1.0f);
            this.f636d.mo343c(c0693le2, -1.0f);
            this.f636d.mo343c(c0693le3, 1.0f);
        } else {
            this.f636d.mo343c(c0693le, -1.0f);
            this.f636d.mo343c(c0693le2, 1.0f);
            this.f636d.mo343c(c0693le3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    public final C0693le m497e(boolean[] zArr, C0693le c0693le) {
        C0693le.a aVar;
        int iMo351k = this.f636d.mo351k();
        C0693le c0693le2 = null;
        float f = 0.0f;
        for (int i = 0; i < iMo351k; i++) {
            float fMo341a = this.f636d.mo341a(i);
            if (fMo341a < 0.0f) {
                C0693le c0693leMo346f = this.f636d.mo346f(i);
                if ((zArr == null || !zArr[c0693leMo346f.f2581b]) && c0693leMo346f != c0693le && (((aVar = c0693leMo346f.f2588i) == C0693le.a.f2593b || aVar == C0693le.a.f2594c) && fMo341a < f)) {
                    f = fMo341a;
                    c0693le2 = c0693leMo346f;
                }
            }
        }
        return c0693le2;
    }

    /* JADX INFO: renamed from: f */
    public final void m498f(C0693le c0693le) {
        C0693le c0693le2 = this.f633a;
        if (c0693le2 != null) {
            this.f636d.mo343c(c0693le2, -1.0f);
            this.f633a = null;
        }
        float fMo348h = this.f636d.mo348h(c0693le, true) * (-1.0f);
        this.f633a = c0693le;
        if (fMo348h == 1.0f) {
            return;
        }
        this.f634b /= fMo348h;
        this.f636d.mo347g(fMo348h);
    }

    /* JADX INFO: renamed from: g */
    public final void m499g(C0693le c0693le, boolean z) {
        if (c0693le.f2585f) {
            float fMo349i = this.f636d.mo349i(c0693le);
            this.f634b = (c0693le.f2584e * fMo349i) + this.f634b;
            this.f636d.mo348h(c0693le, z);
            if (z) {
                c0693le.m1560b(this);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo367h(C0184K1 c0184k1, boolean z) {
        float fMo342b = this.f636d.mo342b(c0184k1, z);
        this.f634b = (c0184k1.f634b * fMo342b) + this.f634b;
        if (z) {
            c0184k1.f633a.m1560b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String strM2226f = C0944z.m2226f(this.f633a == null ? "0" : "" + this.f633a, " = ");
        if (this.f634b != 0.0f) {
            strM2226f = strM2226f + this.f634b;
            z = true;
        } else {
            z = false;
        }
        int iMo351k = this.f636d.mo351k();
        for (int i = 0; i < iMo351k; i++) {
            C0693le c0693leMo346f = this.f636d.mo346f(i);
            if (c0693leMo346f != null) {
                float fMo341a = this.f636d.mo341a(i);
                if (fMo341a != 0.0f) {
                    String string = c0693leMo346f.toString();
                    if (!z) {
                        if (fMo341a < 0.0f) {
                            strM2226f = C0944z.m2226f(strM2226f, "- ");
                            fMo341a *= -1.0f;
                        }
                        strM2226f = fMo341a == 1.0f ? C0944z.m2226f(strM2226f, string) : strM2226f + fMo341a + " " + string;
                        z = true;
                    } else if (fMo341a > 0.0f) {
                        strM2226f = C0944z.m2226f(strM2226f, " + ");
                        if (fMo341a == 1.0f) {
                        }
                        z = true;
                    } else {
                        strM2226f = C0944z.m2226f(strM2226f, " - ");
                        fMo341a *= -1.0f;
                        if (fMo341a == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? C0944z.m2226f(strM2226f, "0.0") : strM2226f;
    }

    public C0184K1(C0003A2 c0003a2) {
        this.f636d = new C0130H1(this, c0003a2);
    }
}
