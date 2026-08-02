package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ar0 extends i93 {

    /* JADX INFO: renamed from: b */
    public float[] f341b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f342c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f343d = true;

    /* JADX INFO: renamed from: e */
    public long f344e = C0363ju.f5217g;

    /* JADX INFO: renamed from: f */
    public List f345f;

    /* JADX INFO: renamed from: g */
    public boolean f346g;

    /* JADX INFO: renamed from: h */
    public C0915y9 f347h;

    /* JADX INFO: renamed from: i */
    public in0 f348i;

    /* JADX INFO: renamed from: j */
    public final C0798v5 f349j;

    /* JADX INFO: renamed from: k */
    public String f350k;

    /* JADX INFO: renamed from: l */
    public float f351l;

    /* JADX INFO: renamed from: m */
    public float f352m;

    /* JADX INFO: renamed from: n */
    public float f353n;

    /* JADX INFO: renamed from: o */
    public float f354o;

    /* JADX INFO: renamed from: p */
    public float f355p;

    /* JADX INFO: renamed from: q */
    public float f356q;

    /* JADX INFO: renamed from: r */
    public float f357r;

    /* JADX INFO: renamed from: s */
    public boolean f358s;

    public ar0() {
        int i = s93.f9998a;
        this.f345f = be0.f819h;
        this.f346g = true;
        this.f349j = new C0798v5(14, this);
        this.f350k = "";
        this.f354o = 1.0f;
        this.f355p = 1.0f;
        this.f358s = true;
    }

    @Override // p000.i93
    /* JADX INFO: renamed from: a */
    public final void mo260a(nc0 nc0Var) {
        if (this.f358s) {
            float[] fArrM2155a = this.f341b;
            if (fArrM2155a == null) {
                fArrM2155a = hf1.m2155a();
                this.f341b = fArrM2155a;
            } else {
                hf1.m2158d(fArrM2155a);
            }
            hf1.m2160f(fArrM2155a, this.f356q + this.f352m, this.f357r + this.f353n);
            float f = this.f351l;
            if (fArrM2155a.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrM2155a[0];
                float f3 = fArrM2155a[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrM2155a[1];
                float f8 = fArrM2155a[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrM2155a[2];
                float f12 = fArrM2155a[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrM2155a[3];
                float f16 = fArrM2155a[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrM2155a[0] = f4;
                fArrM2155a[1] = f9;
                fArrM2155a[2] = f13;
                fArrM2155a[3] = f17;
                fArrM2155a[4] = f6;
                fArrM2155a[5] = f10;
                fArrM2155a[6] = f14;
                fArrM2155a[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.f354o;
            float f19 = this.f355p;
            if (fArrM2155a.length >= 16) {
                fArrM2155a[0] = fArrM2155a[0] * f18;
                fArrM2155a[1] = fArrM2155a[1] * f18;
                fArrM2155a[2] = fArrM2155a[2] * f18;
                fArrM2155a[3] = fArrM2155a[3] * f18;
                fArrM2155a[4] = fArrM2155a[4] * f19;
                fArrM2155a[5] = fArrM2155a[5] * f19;
                fArrM2155a[6] = fArrM2155a[6] * f19;
                fArrM2155a[7] = fArrM2155a[7] * f19;
                fArrM2155a[8] = fArrM2155a[8] * 1.0f;
                fArrM2155a[9] = fArrM2155a[9] * 1.0f;
                fArrM2155a[10] = fArrM2155a[10] * 1.0f;
                fArrM2155a[11] = fArrM2155a[11] * 1.0f;
            }
            hf1.m2160f(fArrM2155a, -this.f352m, -this.f353n);
            this.f358s = false;
        }
        if (this.f346g) {
            if (!this.f345f.isEmpty()) {
                C0915y9 c0915y9M117a = this.f347h;
                if (c0915y9M117a == null) {
                    c0915y9M117a = AbstractC0011aa.m117a();
                    this.f347h = c0915y9M117a;
                }
                pp0.m3896H(this.f345f, c0915y9M117a);
            }
            this.f346g = false;
        }
        C0043b5 c0043b5Mo3274E = nc0Var.mo3274E();
        long jM434u = c0043b5Mo3274E.m434u();
        c0043b5Mo3274E.m430q().mo1522l();
        try {
            C0043b5 c0043b5 = (C0043b5) ((C0485n4) c0043b5Mo3274E.f562i).f6983i;
            float[] fArr = this.f341b;
            if (fArr != null) {
                c0043b5.m430q().mo1527q(fArr);
            }
            C0915y9 c0915y9 = this.f347h;
            if (!this.f345f.isEmpty() && c0915y9 != null) {
                c0043b5.m430q().mo1529s(c0915y9);
            }
            ArrayList arrayList = this.f342c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((i93) arrayList.get(i)).mo260a(nc0Var);
            }
        } finally {
            vi0.m5699r(c0043b5Mo3274E, jM434u);
        }
    }

    @Override // p000.i93
    /* JADX INFO: renamed from: b */
    public final in0 mo261b() {
        return this.f348i;
    }

    @Override // p000.i93
    /* JADX INFO: renamed from: d */
    public final void mo262d(C0798v5 c0798v5) {
        this.f348i = c0798v5;
    }

    /* JADX INFO: renamed from: e */
    public final void m263e(int i, i93 i93Var) {
        ArrayList arrayList = this.f342c;
        if (i < arrayList.size()) {
            arrayList.set(i, i93Var);
        } else {
            arrayList.add(i93Var);
        }
        m265g(i93Var);
        i93Var.mo262d(this.f349j);
        m2307c();
    }

    /* JADX INFO: renamed from: f */
    public final void m264f(long j) {
        if (this.f343d && j != 16) {
            long j2 = this.f344e;
            if (j2 == 16) {
                this.f344e = j;
                return;
            }
            int i = s93.f9998a;
            if (C0363ju.m2571h(j2) == C0363ju.m2571h(j) && C0363ju.m2570g(j2) == C0363ju.m2570g(j) && C0363ju.m2568e(j2) == C0363ju.m2568e(j)) {
                return;
            }
            this.f343d = false;
            this.f344e = C0363ju.f5217g;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m265g(i93 i93Var) {
        if (!(i93Var instanceof wx1)) {
            if (i93Var instanceof ar0) {
                ar0 ar0Var = (ar0) i93Var;
                if (ar0Var.f343d && this.f343d) {
                    m264f(ar0Var.f344e);
                    return;
                } else {
                    this.f343d = false;
                    this.f344e = C0363ju.f5217g;
                    return;
                }
            }
            return;
        }
        wx1 wx1Var = (wx1) i93Var;
        AbstractC0024an abstractC0024an = wx1Var.f12705b;
        if (this.f343d && abstractC0024an != null) {
            if (abstractC0024an instanceof ft2) {
                m264f(((ft2) abstractC0024an).f3140a);
            } else {
                this.f343d = false;
                this.f344e = C0363ju.f5217g;
            }
        }
        AbstractC0024an abstractC0024an2 = wx1Var.f12710g;
        if (this.f343d && abstractC0024an2 != null) {
            if (abstractC0024an2 instanceof ft2) {
                m264f(((ft2) abstractC0024an2).f3140a);
            } else {
                this.f343d = false;
                this.f344e = C0363ju.f5217g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f350k);
        ArrayList arrayList = this.f342c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i93 i93Var = (i93) arrayList.get(i);
            sb.append("\t");
            sb.append(i93Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
