package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ay */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0035ay extends bb1 {

    /* JADX INFO: renamed from: b */
    public float[] f287b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f288c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f289d = true;

    /* JADX INFO: renamed from: e */
    public long f290e = C0207ff.f1707g;

    /* JADX INFO: renamed from: f */
    public List f291f;

    /* JADX INFO: renamed from: g */
    public boolean f292g;

    /* JADX INFO: renamed from: h */
    public C0118d6 f293h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0742sw f294i;

    /* JADX INFO: renamed from: j */
    public final C0711s2 f295j;

    /* JADX INFO: renamed from: k */
    public String f296k;

    /* JADX INFO: renamed from: l */
    public float f297l;

    /* JADX INFO: renamed from: m */
    public float f298m;

    /* JADX INFO: renamed from: n */
    public boolean f299n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0035ay() {
        int i = ib1.f2505a;
        this.f291f = C0294hs.f2354d;
        this.f292g = true;
        this.f295j = new C0711s2(14, this);
        this.f296k = "";
        this.f297l = 1.0f;
        this.f298m = 1.0f;
        this.f299n = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.bb1
    /* JADX INFO: renamed from: a */
    public final void mo218a(InterfaceC0812uq interfaceC0812uq) {
        if (this.f299n) {
            float[] fArrM3406h = this.f287b;
            if (fArrM3406h == null) {
                fArrM3406h = r60.m3406h();
                this.f287b = fArrM3406h;
            } else {
                r60.m3392A(fArrM3406h);
            }
            r60.m3394C(fArrM3406h, 0.0f, 0.0f);
            if (fArrM3406h.length >= 16) {
                float fSin = (float) Math.sin(0.0d);
                float fCos = (float) Math.cos(0.0d);
                float f = fArrM3406h[0];
                float f2 = fArrM3406h[4];
                float f3 = (fSin * f2) + (fCos * f);
                float f4 = -fSin;
                float f5 = (f2 * fCos) + (f * f4);
                float f6 = fArrM3406h[1];
                float f7 = fArrM3406h[5];
                float f8 = (fSin * f7) + (fCos * f6);
                float f9 = (f7 * fCos) + (f6 * f4);
                float f10 = fArrM3406h[2];
                float f11 = fArrM3406h[6];
                float f12 = (fSin * f11) + (fCos * f10);
                float f13 = (f11 * fCos) + (f10 * f4);
                float f14 = fArrM3406h[3];
                float f15 = fArrM3406h[7];
                float f16 = (fSin * f15) + (fCos * f14);
                fArrM3406h[0] = f3;
                fArrM3406h[1] = f8;
                fArrM3406h[2] = f12;
                fArrM3406h[3] = f16;
                fArrM3406h[4] = f5;
                fArrM3406h[5] = f9;
                fArrM3406h[6] = f13;
                fArrM3406h[7] = (fCos * f15) + (f4 * f14);
            }
            float f17 = this.f297l;
            float f18 = this.f298m;
            if (fArrM3406h.length >= 16) {
                fArrM3406h[0] = fArrM3406h[0] * f17;
                fArrM3406h[1] = fArrM3406h[1] * f17;
                fArrM3406h[2] = fArrM3406h[2] * f17;
                fArrM3406h[3] = fArrM3406h[3] * f17;
                fArrM3406h[4] = fArrM3406h[4] * f18;
                fArrM3406h[5] = fArrM3406h[5] * f18;
                fArrM3406h[6] = fArrM3406h[6] * f18;
                fArrM3406h[7] = fArrM3406h[7] * f18;
                fArrM3406h[8] = fArrM3406h[8] * 1.0f;
                fArrM3406h[9] = fArrM3406h[9] * 1.0f;
                fArrM3406h[10] = fArrM3406h[10] * 1.0f;
                fArrM3406h[11] = fArrM3406h[11] * 1.0f;
            }
            r60.m3394C(fArrM3406h, -0.0f, -0.0f);
            this.f299n = false;
        }
        if (this.f292g) {
            if (!this.f291f.isEmpty()) {
                C0118d6 c0118d6M1030a = this.f293h;
                if (c0118d6M1030a == null) {
                    c0118d6M1030a = AbstractC0198f6.m1030a();
                    this.f293h = c0118d6M1030a;
                }
                r60.m3393B(this.f291f, c0118d6M1030a);
            }
            this.f292g = false;
        }
        C0541o8 c0541o8Mo655t = interfaceC0812uq.mo655t();
        long jM2803h = c0541o8Mo655t.m2803h();
        c0541o8Mo655t.m2802f().mo243i();
        try {
            C0541o8 c0541o8 = (C0541o8) ((C0910x1) c0541o8Mo655t.f4480a).f7232e;
            float[] fArr = this.f287b;
            if (fArr != null) {
                c0541o8.m2802f().mo248n(fArr);
            }
            C0118d6 c0118d6 = this.f293h;
            if (!this.f291f.isEmpty() && c0118d6 != null) {
                c0541o8.m2802f().mo250p(c0118d6);
            }
            ArrayList arrayList = this.f288c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bb1) arrayList.get(i)).mo218a(interfaceC0812uq);
            }
        } finally {
            c0541o8Mo655t.m2802f().mo241g();
            c0541o8Mo655t.m2812q(jM2803h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.bb1
    /* JADX INFO: renamed from: b */
    public final InterfaceC0742sw mo219b() {
        return this.f294i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.bb1
    /* JADX INFO: renamed from: d */
    public final void mo220d(C0711s2 c0711s2) {
        this.f294i = c0711s2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m221e(int i, bb1 bb1Var) {
        ArrayList arrayList = this.f288c;
        if (i < arrayList.size()) {
            arrayList.set(i, bb1Var);
        } else {
            arrayList.add(bb1Var);
        }
        m223g(bb1Var);
        bb1Var.mo220d(this.f295j);
        m337c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m222f(long j) {
        if (this.f289d && j != 16) {
            long j2 = this.f290e;
            if (j2 == 16) {
                this.f290e = j;
                return;
            }
            int i = ib1.f2505a;
            if (C0207ff.m1099h(j2) == C0207ff.m1099h(j) && C0207ff.m1098g(j2) == C0207ff.m1098g(j) && C0207ff.m1096e(j2) == C0207ff.m1096e(j)) {
                return;
            }
            this.f289d = false;
            this.f290e = C0207ff.f1707g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m223g(bb1 bb1Var) {
        if (bb1Var instanceof kp0) {
            g31 g31Var = ((kp0) bb1Var).f3249b;
            if (this.f289d && g31Var != null) {
                m222f(g31Var.f1852l);
                return;
            }
            return;
        }
        if (bb1Var instanceof C0035ay) {
            C0035ay c0035ay = (C0035ay) bb1Var;
            if (c0035ay.f289d && this.f289d) {
                m222f(c0035ay.f290e);
            } else {
                this.f289d = false;
                this.f290e = C0207ff.f1707g;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f296k);
        ArrayList arrayList = this.f288c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bb1 bb1Var = (bb1) arrayList.get(i);
            sb.append("\t");
            sb.append(bb1Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
