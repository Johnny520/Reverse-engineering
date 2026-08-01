package p245u0;

import java.util.ArrayList;
import java.util.List;
import p000A.C0072l0;
import p007B0.C0172E;
import p061L2.C0981u;
import p112W2.InterfaceC1601c;
import p121Y1.C1753n;
import p211o0.AbstractC2752k;
import p211o0.AbstractC2758q;
import p211o0.C2730E;
import p211o0.C2740O;
import p211o0.C2750i;
import p211o0.C2762u;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: u0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3306c extends AbstractC3296C {

    /* JADX INFO: renamed from: b */
    public float[] f10236b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f10237c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f10238d = true;

    /* JADX INFO: renamed from: e */
    public long f10239e = C2762u.f8762g;

    /* JADX INFO: renamed from: f */
    public List f10240f;

    /* JADX INFO: renamed from: g */
    public boolean f10241g;

    /* JADX INFO: renamed from: h */
    public C2750i f10242h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1601c f10243i;

    /* JADX INFO: renamed from: j */
    public final C0172E f10244j;

    /* JADX INFO: renamed from: k */
    public String f10245k;

    /* JADX INFO: renamed from: l */
    public float f10246l;

    /* JADX INFO: renamed from: m */
    public float f10247m;

    /* JADX INFO: renamed from: n */
    public float f10248n;

    /* JADX INFO: renamed from: o */
    public float f10249o;

    /* JADX INFO: renamed from: p */
    public float f10250p;

    /* JADX INFO: renamed from: q */
    public float f10251q;

    /* JADX INFO: renamed from: r */
    public float f10252r;

    /* JADX INFO: renamed from: s */
    public boolean f10253s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3306c() {
        int i5 = AbstractC3300G.f10208a;
        this.f10240f = C0981u.f3047d;
        this.f10241g = true;
        this.f10244j = new C0172E(26, this);
        this.f10245k = "";
        this.f10249o = 1.0f;
        this.f10250p = 1.0f;
        this.f10253s = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p245u0.AbstractC3296C
    /* JADX INFO: renamed from: a */
    public final void mo5565a(InterfaceC2903d interfaceC2903d) {
        if (this.f10253s) {
            float[] fArrM4782a = this.f10236b;
            if (fArrM4782a == null) {
                fArrM4782a = C2730E.m4782a();
                this.f10236b = fArrM4782a;
            } else {
                C2730E.m4785d(fArrM4782a);
            }
            C2730E.m4787f(fArrM4782a, this.f10251q + this.f10247m, this.f10252r + this.f10248n);
            float f2 = this.f10246l;
            if (fArrM4782a.length >= 16) {
                double d5 = ((double) f2) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d5);
                float fCos = (float) Math.cos(d5);
                float f5 = fArrM4782a[0];
                float f6 = fArrM4782a[4];
                float f7 = (fSin * f6) + (fCos * f5);
                float f8 = -fSin;
                float f9 = (f6 * fCos) + (f5 * f8);
                float f10 = fArrM4782a[1];
                float f11 = fArrM4782a[5];
                float f12 = (fSin * f11) + (fCos * f10);
                float f13 = (f11 * fCos) + (f10 * f8);
                float f14 = fArrM4782a[2];
                float f15 = fArrM4782a[6];
                float f16 = (fSin * f15) + (fCos * f14);
                float f17 = (f15 * fCos) + (f14 * f8);
                float f18 = fArrM4782a[3];
                float f19 = fArrM4782a[7];
                float f20 = (fSin * f19) + (fCos * f18);
                fArrM4782a[0] = f7;
                fArrM4782a[1] = f12;
                fArrM4782a[2] = f16;
                fArrM4782a[3] = f20;
                fArrM4782a[4] = f9;
                fArrM4782a[5] = f13;
                fArrM4782a[6] = f17;
                fArrM4782a[7] = (fCos * f19) + (f8 * f18);
            }
            float f21 = this.f10249o;
            float f22 = this.f10250p;
            if (fArrM4782a.length >= 16) {
                fArrM4782a[0] = fArrM4782a[0] * f21;
                fArrM4782a[1] = fArrM4782a[1] * f21;
                fArrM4782a[2] = fArrM4782a[2] * f21;
                fArrM4782a[3] = fArrM4782a[3] * f21;
                fArrM4782a[4] = fArrM4782a[4] * f22;
                fArrM4782a[5] = fArrM4782a[5] * f22;
                fArrM4782a[6] = fArrM4782a[6] * f22;
                fArrM4782a[7] = fArrM4782a[7] * f22;
                fArrM4782a[8] = fArrM4782a[8] * 1.0f;
                fArrM4782a[9] = fArrM4782a[9] * 1.0f;
                fArrM4782a[10] = fArrM4782a[10] * 1.0f;
                fArrM4782a[11] = fArrM4782a[11] * 1.0f;
            }
            C2730E.m4787f(fArrM4782a, -this.f10247m, -this.f10248n);
            this.f10253s = false;
        }
        if (this.f10241g) {
            if (!this.f10240f.isEmpty()) {
                C2750i c2750iM4885a = this.f10242h;
                if (c2750iM4885a == null) {
                    c2750iM4885a = AbstractC2752k.m4885a();
                    this.f10242h = c2750iM4885a;
                }
                AbstractC3305b.m5574e(this.f10240f, c2750iM4885a);
            }
            this.f10241g = false;
        }
        C0072l0 c0072l0Mo854L = interfaceC2903d.mo854L();
        long jM110n = c0072l0Mo854L.m110n();
        c0072l0Mo854L.m106j().mo4852n();
        try {
            C0072l0 c0072l0 = (C0072l0) ((C1753n) c0072l0Mo854L.f307e).f6028e;
            float[] fArr = this.f10236b;
            if (fArr != null) {
                c0072l0.m106j().mo4856r(fArr);
            }
            C2750i c2750i = this.f10242h;
            if (!this.f10240f.isEmpty() && c2750i != null) {
                c0072l0.m106j().mo4844e(c2750i);
            }
            ArrayList arrayList = this.f10237c;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((AbstractC3296C) arrayList.get(i5)).mo5565a(interfaceC2903d);
            }
        } finally {
            c0072l0Mo854L.m106j().mo4851l();
            c0072l0Mo854L.m119y(jM110n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p245u0.AbstractC3296C
    /* JADX INFO: renamed from: b */
    public final InterfaceC1601c mo5566b() {
        return this.f10243i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p245u0.AbstractC3296C
    /* JADX INFO: renamed from: d */
    public final void mo5568d(C0172E c0172e) {
        this.f10243i = c0172e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5575e(int i5, AbstractC3296C abstractC3296C) {
        ArrayList arrayList = this.f10237c;
        if (i5 < arrayList.size()) {
            arrayList.set(i5, abstractC3296C);
        } else {
            arrayList.add(abstractC3296C);
        }
        m5577g(abstractC3296C);
        abstractC3296C.mo5568d(this.f10244j);
        m5567c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5576f(long j5) {
        if (this.f10238d && j5 != 16) {
            long j6 = this.f10239e;
            if (j6 == 16) {
                this.f10239e = j5;
                return;
            }
            int i5 = AbstractC3300G.f10208a;
            if (C2762u.m4926h(j6) == C2762u.m4926h(j5) && C2762u.m4925g(j6) == C2762u.m4925g(j5) && C2762u.m4923e(j6) == C2762u.m4923e(j5)) {
                return;
            }
            this.f10238d = false;
            this.f10239e = C2762u.f8762g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m5577g(AbstractC3296C abstractC3296C) {
        if (!(abstractC3296C instanceof C3311h)) {
            if (abstractC3296C instanceof C3306c) {
                C3306c c3306c = (C3306c) abstractC3296C;
                if (c3306c.f10238d && this.f10238d) {
                    m5576f(c3306c.f10239e);
                    return;
                } else {
                    this.f10238d = false;
                    this.f10239e = C2762u.f8762g;
                    return;
                }
            }
            return;
        }
        C3311h c3311h = (C3311h) abstractC3296C;
        AbstractC2758q abstractC2758q = c3311h.f10290b;
        if (this.f10238d && abstractC2758q != null) {
            if (abstractC2758q instanceof C2740O) {
                m5576f(((C2740O) abstractC2758q).f8719a);
            } else {
                this.f10238d = false;
                this.f10239e = C2762u.f8762g;
            }
        }
        AbstractC2758q abstractC2758q2 = c3311h.f10295g;
        if (this.f10238d && abstractC2758q2 != null) {
            if (abstractC2758q2 instanceof C2740O) {
                m5576f(((C2740O) abstractC2758q2).f8719a);
            } else {
                this.f10238d = false;
                this.f10239e = C2762u.f8762g;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f10245k);
        ArrayList arrayList = this.f10237c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC3296C abstractC3296C = (AbstractC3296C) arrayList.get(i5);
            sb.append("\t");
            sb.append(abstractC3296C.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
