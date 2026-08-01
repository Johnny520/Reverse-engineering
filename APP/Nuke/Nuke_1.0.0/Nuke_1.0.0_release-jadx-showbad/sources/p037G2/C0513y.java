package p037G2;

import p000A.C0072l0;
import p041H0.C0566K;
import p056K2.C0891q;
import p095T.InterfaceC1339T0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p211o0.AbstractC2767z;
import p211o0.C2735J;
import p211o0.C2747f;
import p211o0.C2753l;
import p222q0.C2901b;

/* JADX INFO: renamed from: G2.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0513y implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1639d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f1640e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1641f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f1642g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1643h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0513y(InterfaceC1599a interfaceC1599a, boolean z5, C2747f c2747f, C2753l c2753l) {
        this.f1641f = interfaceC1599a;
        this.f1640e = z5;
        this.f1642g = c2747f;
        this.f1643h = c2753l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f1639d) {
            case 0:
                InterfaceC1339T0 interfaceC1339T0 = (InterfaceC1339T0) this.f1641f;
                InterfaceC1339T0 interfaceC1339T02 = (InterfaceC1339T0) this.f1642g;
                InterfaceC1339T0 interfaceC1339T03 = (InterfaceC1339T0) this.f1643h;
                C2735J c2735j = (C2735J) obj;
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4792d(((Number) interfaceC1339T0.getValue()).floatValue());
                c2735j.m4800s(((Number) interfaceC1339T02.getValue()).floatValue());
                c2735j.m4801v(((Number) interfaceC1339T03.getValue()).floatValue());
                c2735j.m4789B(AbstractC2767z.m4938h(0.82f, this.f1640e ? 1.0f : 0.0f));
                return C0891q.f2780a;
            default:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f1641f;
                C2747f c2747f = (C2747f) this.f1642g;
                C2753l c2753l = (C2753l) this.f1643h;
                C0566K c0566k = (C0566K) obj;
                c0566k.m857a();
                C2901b c2901b = c0566k.f1742d;
                if (((Boolean) interfaceC1599a.mo6a()).booleanValue()) {
                    if (this.f1640e) {
                        long jMo856Y = c2901b.mo856Y();
                        C0072l0 c0072l0 = c2901b.f9185e;
                        long jM110n = c0072l0.m110n();
                        c0072l0.m106j().mo4852n();
                        try {
                            ((C1753n) c0072l0.f307e).m3113I(-1.0f, 1.0f, jMo856Y);
                            c2901b.m5098e(c2747f, c2753l);
                        } finally {
                            c0072l0.m106j().mo4851l();
                            c0072l0.m119y(jM110n);
                        }
                    } else {
                        c2901b.m5098e(c2747f, c2753l);
                    }
                }
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0513y(boolean z5, InterfaceC1339T0 interfaceC1339T0, InterfaceC1339T0 interfaceC1339T02, InterfaceC1339T0 interfaceC1339T03) {
        this.f1640e = z5;
        this.f1641f = interfaceC1339T0;
        this.f1642g = interfaceC1339T02;
        this.f1643h = interfaceC1339T03;
    }
}
