package p000A;

import p041H0.C0566K;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p203n.C2663k;
import p211o0.C2747f;
import p211o0.C2753l;
import p211o0.InterfaceC2760s;
import p222q0.C2901b;
import p227r.C2962L0;

/* JADX INFO: renamed from: A.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0061g implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f287d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f288e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f289f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f290g;

    public /* synthetic */ C0061g(float f2, C2747f c2747f, C2753l c2753l) {
        this.f288e = f2;
        this.f289f = c2747f;
        this.f290g = c2753l;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f287d) {
            case 0:
                float f2 = this.f288e;
                C2747f c2747f = (C2747f) this.f289f;
                C2753l c2753l = (C2753l) this.f290g;
                C0566K c0566k = (C0566K) obj;
                c0566k.m857a();
                C2901b c2901b = c0566k.f1742d;
                C0072l0 c0072l0 = c2901b.f9185e;
                long jM110n = c0072l0.m110n();
                c0072l0.m106j().mo4852n();
                try {
                    C1753n c1753n = (C1753n) c0072l0.f307e;
                    c1753n.m3115L(f2, 0.0f);
                    InterfaceC2760s interfaceC2760sM106j = ((C0072l0) c1753n.f6028e).m106j();
                    int i5 = (int) 0;
                    interfaceC2760sM106j.mo4846g(Float.intBitsToFloat(i5), Float.intBitsToFloat(i5));
                    interfaceC2760sM106j.mo4847h();
                    interfaceC2760sM106j.mo4846g(-Float.intBitsToFloat(i5), -Float.intBitsToFloat(i5));
                    c2901b.m5098e(c2747f, c2753l);
                } finally {
                    c0072l0.m106j().mo4851l();
                    c0072l0.m119y(jM110n);
                }
                break;
            default:
                C2962L0 c2962l0 = (C2962L0) this.f289f;
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f290g;
                long jLongValue = ((Long) obj).longValue();
                if (c2962l0.f9377b == Long.MIN_VALUE) {
                    c2962l0.f9377b = jLongValue;
                }
                float f5 = c2962l0.f9380e;
                C2663k c2663k = new C2663k(f5);
                float f6 = this.f288e;
                C2663k c2663k2 = C2962L0.f9375f;
                long jMo247b = f6 == 0.0f ? c2962l0.f9376a.mo247b(new C2663k(f5), c2663k2, c2962l0.f9378c) : AbstractC1784a.m3201O((jLongValue - c2962l0.f9377b) / f6);
                float f7 = ((C2663k) c2962l0.f9376a.mo259r(jMo247b, c2663k, c2663k2, c2962l0.f9378c)).f8483a;
                c2962l0.f9378c = (C2663k) c2962l0.f9376a.mo258o(jMo247b, c2663k, c2663k2, c2962l0.f9378c);
                c2962l0.f9377b = jLongValue;
                float f8 = c2962l0.f9380e - f7;
                c2962l0.f9380e = f7;
                interfaceC1601c.mo1h(Float.valueOf(f8));
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0061g(C2962L0 c2962l0, float f2, InterfaceC1601c interfaceC1601c) {
        this.f289f = c2962l0;
        this.f288e = f2;
        this.f290g = interfaceC1601c;
    }
}
