package p176m1;

import androidx.lifecycle.C0119x;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p016b1.C0166f;
import p020b5.C0184c;
import p071f1.AbstractC1013l;
import p071f1.AbstractC1027s;
import p071f1.C1008i0;
import p071f1.C1009j;
import p071f1.C1030t0;
import p071f1.C1034w;
import p085fg.InterfaceC1231l;
import p101h1.InterfaceC1567d;
import tf.C4173t;

/* JADX INFO: renamed from: m1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2724c extends AbstractC2725c0 {

    /* JADX INFO: renamed from: b */
    public float[] f8808b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f8809c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f8810d = true;

    /* JADX INFO: renamed from: e */
    public long f8811e = C1034w.f3263g;

    /* JADX INFO: renamed from: f */
    public List f8812f;

    /* JADX INFO: renamed from: g */
    public boolean f8813g;

    /* JADX INFO: renamed from: h */
    public C1009j f8814h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1231l f8815i;

    /* JADX INFO: renamed from: j */
    public final C0166f f8816j;

    /* JADX INFO: renamed from: k */
    public String f8817k;

    /* JADX INFO: renamed from: l */
    public float f8818l;

    /* JADX INFO: renamed from: m */
    public float f8819m;

    /* JADX INFO: renamed from: n */
    public float f8820n;

    /* JADX INFO: renamed from: o */
    public float f8821o;

    /* JADX INFO: renamed from: p */
    public float f8822p;

    /* JADX INFO: renamed from: q */
    public float f8823q;

    /* JADX INFO: renamed from: r */
    public float f8824r;

    /* JADX INFO: renamed from: s */
    public boolean f8825s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2724c() {
        int i9 = AbstractC2735h0.f8909a;
        this.f8812f = C4173t.f13710g;
        this.f8813g = true;
        this.f8816j = new C0166f(this, 14);
        this.f8817k = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f8821o = 1.0f;
        this.f8822p = 1.0f;
        this.f8825s = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p176m1.AbstractC2725c0
    /* JADX INFO: renamed from: a */
    public final void mo6141a(InterfaceC1567d interfaceC1567d) {
        if (this.f8825s) {
            float[] fArrM2593a = this.f8808b;
            if (fArrM2593a == null) {
                fArrM2593a = C1008i0.m2593a();
                this.f8808b = fArrM2593a;
            } else {
                C1008i0.m2596d(fArrM2593a);
            }
            C1008i0.m2598f(fArrM2593a, this.f8823q + this.f8819m, this.f8824r + this.f8820n);
            float f3 = this.f8818l;
            if (fArrM2593a.length >= 16) {
                double d10 = ((double) f3) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d10);
                float fCos = (float) Math.cos(d10);
                float f10 = fArrM2593a[0];
                float f11 = fArrM2593a[4];
                float f12 = (fSin * f11) + (fCos * f10);
                float f13 = -fSin;
                float f14 = (f11 * fCos) + (f10 * f13);
                float f15 = fArrM2593a[1];
                float f16 = fArrM2593a[5];
                float f17 = (fSin * f16) + (fCos * f15);
                float f18 = (f16 * fCos) + (f15 * f13);
                float f19 = fArrM2593a[2];
                float f20 = fArrM2593a[6];
                float f21 = (fSin * f20) + (fCos * f19);
                float f22 = (f20 * fCos) + (f19 * f13);
                float f23 = fArrM2593a[3];
                float f24 = fArrM2593a[7];
                float f25 = (fSin * f24) + (fCos * f23);
                fArrM2593a[0] = f12;
                fArrM2593a[1] = f17;
                fArrM2593a[2] = f21;
                fArrM2593a[3] = f25;
                fArrM2593a[4] = f14;
                fArrM2593a[5] = f18;
                fArrM2593a[6] = f22;
                fArrM2593a[7] = (fCos * f24) + (f13 * f23);
            }
            float f26 = this.f8821o;
            float f27 = this.f8822p;
            if (fArrM2593a.length >= 16) {
                fArrM2593a[0] = fArrM2593a[0] * f26;
                fArrM2593a[1] = fArrM2593a[1] * f26;
                fArrM2593a[2] = fArrM2593a[2] * f26;
                fArrM2593a[3] = fArrM2593a[3] * f26;
                fArrM2593a[4] = fArrM2593a[4] * f27;
                fArrM2593a[5] = fArrM2593a[5] * f27;
                fArrM2593a[6] = fArrM2593a[6] * f27;
                fArrM2593a[7] = fArrM2593a[7] * f27;
                fArrM2593a[8] = fArrM2593a[8] * 1.0f;
                fArrM2593a[9] = fArrM2593a[9] * 1.0f;
                fArrM2593a[10] = fArrM2593a[10] * 1.0f;
                fArrM2593a[11] = fArrM2593a[11] * 1.0f;
            }
            C1008i0.m2598f(fArrM2593a, -this.f8819m, -this.f8820n);
            this.f8825s = false;
        }
        if (this.f8813g) {
            if (!this.f8812f.isEmpty()) {
                C1009j c1009jM2609a = this.f8814h;
                if (c1009jM2609a == null) {
                    c1009jM2609a = AbstractC1013l.m2609a();
                    this.f8814h = c1009jM2609a;
                }
                AbstractC2722b.m6140d(this.f8812f, c1009jM2609a);
            }
            this.f8813g = false;
        }
        C0184c c0184cMo4081z0 = interfaceC1567d.mo4081z0();
        long jM825v = c0184cMo4081z0.m825v();
        c0184cMo4081z0.m819p().mo2487e();
        try {
            C0184c c0184c = (C0184c) ((C0119x) c0184cMo4081z0.f469a).f310h;
            float[] fArr = this.f8808b;
            if (fArr != null) {
                c0184c.m819p().mo2490h(fArr);
            }
            C1009j c1009j = this.f8814h;
            if (!this.f8812f.isEmpty() && c1009j != null) {
                c0184c.m819p().mo2486d(c1009j);
            }
            ArrayList arrayList = this.f8809c;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((AbstractC2725c0) arrayList.get(i9)).mo6141a(interfaceC1567d);
            }
        } finally {
            c0184cMo4081z0.m819p().mo2497p();
            c0184cMo4081z0.m803U(jM825v);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p176m1.AbstractC2725c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC1231l mo6142b() {
        return this.f8815i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p176m1.AbstractC2725c0
    /* JADX INFO: renamed from: d */
    public final void mo6143d(C0166f c0166f) {
        this.f8815i = c0166f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m6144e(int i9, AbstractC2725c0 abstractC2725c0) {
        ArrayList arrayList = this.f8809c;
        if (i9 < arrayList.size()) {
            arrayList.set(i9, abstractC2725c0);
        } else {
            arrayList.add(abstractC2725c0);
        }
        m6146g(abstractC2725c0);
        abstractC2725c0.mo6143d(this.f8816j);
        m6147c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m6145f(long j3) {
        if (this.f8810d && j3 != 16) {
            long j4 = this.f8811e;
            if (j4 == 16) {
                this.f8811e = j3;
                return;
            }
            int i9 = AbstractC2735h0.f8909a;
            if (C1034w.m2640h(j4) == C1034w.m2640h(j3) && C1034w.m2639g(j4) == C1034w.m2639g(j3) && C1034w.m2637e(j4) == C1034w.m2637e(j3)) {
                return;
            }
            this.f8810d = false;
            this.f8811e = C1034w.f3263g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m6146g(AbstractC2725c0 abstractC2725c0) {
        if (!(abstractC2725c0 instanceof C2734h)) {
            if (abstractC2725c0 instanceof C2724c) {
                C2724c c2724c = (C2724c) abstractC2725c0;
                if (c2724c.f8810d && this.f8810d) {
                    m6145f(c2724c.f8811e);
                    return;
                } else {
                    this.f8810d = false;
                    this.f8811e = C1034w.f3263g;
                    return;
                }
            }
            return;
        }
        C2734h c2734h = (C2734h) abstractC2725c0;
        AbstractC1027s abstractC1027s = c2734h.f8889b;
        if (this.f8810d && abstractC1027s != null) {
            if (abstractC1027s instanceof C1030t0) {
                m6145f(((C1030t0) abstractC1027s).f3253a);
            } else {
                this.f8810d = false;
                this.f8811e = C1034w.f3263g;
            }
        }
        AbstractC1027s abstractC1027s2 = c2734h.f8894g;
        if (this.f8810d && abstractC1027s2 != null) {
            if (abstractC1027s2 instanceof C1030t0) {
                m6145f(((C1030t0) abstractC1027s2).f3253a);
            } else {
                this.f8810d = false;
                this.f8811e = C1034w.f3263g;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f8817k);
        ArrayList arrayList = this.f8809c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC2725c0 abstractC2725c0 = (AbstractC2725c0) arrayList.get(i9);
            sb2.append("\t");
            sb2.append(abstractC2725c0.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
