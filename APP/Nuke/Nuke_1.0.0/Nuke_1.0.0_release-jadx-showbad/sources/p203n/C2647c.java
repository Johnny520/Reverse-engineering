package p203n;

import com.bumptech.glide.AbstractC1926h;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2647c {

    /* JADX INFO: renamed from: a */
    public final C2652e0 f8426a;

    /* JADX INFO: renamed from: b */
    public final Object f8427b;

    /* JADX INFO: renamed from: c */
    public final C2661j f8428c;

    /* JADX INFO: renamed from: d */
    public final C1366i0 f8429d;

    /* JADX INFO: renamed from: e */
    public final C1366i0 f8430e;

    /* JADX INFO: renamed from: f */
    public final C2623F f8431f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2670o f8432g;

    /* JADX INFO: renamed from: h */
    public final AbstractC2670o f8433h;

    /* JADX INFO: renamed from: i */
    public final AbstractC2670o f8434i;

    /* JADX INFO: renamed from: j */
    public final AbstractC2670o f8435j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2647c(Object obj, C2652e0 c2652e0, Object obj2) {
        this.f8426a = c2652e0;
        this.f8427b = obj2;
        C2661j c2661j = new C2661j(c2652e0, obj, null, 60);
        this.f8428c = c2661j;
        this.f8429d = AbstractC1385s.m2629s(Boolean.FALSE);
        this.f8430e = AbstractC1385s.m2629s(obj);
        this.f8431f = new C2623F();
        new C2626I(obj2);
        AbstractC2670o abstractC2670o = c2661j.f8479f;
        boolean z5 = abstractC2670o instanceof C2663k;
        AbstractC2670o abstractC2670o2 = z5 ? AbstractC2649d.f8441e : abstractC2670o instanceof C2665l ? AbstractC2649d.f8442f : abstractC2670o instanceof C2667m ? AbstractC2649d.f8443g : AbstractC2649d.f8444h;
        this.f8432g = abstractC2670o2;
        AbstractC2670o abstractC2670o3 = z5 ? AbstractC2649d.f8437a : abstractC2670o instanceof C2665l ? AbstractC2649d.f8438b : abstractC2670o instanceof C2667m ? AbstractC2649d.f8439c : AbstractC2649d.f8440d;
        this.f8433h = abstractC2670o3;
        this.f8434i = abstractC2670o2;
        this.f8435j = abstractC2670o3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Object m4602a(C2647c c2647c, Object obj) {
        C2652e0 c2652e0 = c2647c.f8426a;
        AbstractC2670o abstractC2670o = c2647c.f8435j;
        AbstractC2670o abstractC2670o2 = c2647c.f8434i;
        if (!AbstractC1665j.m2981a(abstractC2670o2, c2647c.f8432g) || !AbstractC1665j.m2981a(abstractC2670o, c2647c.f8433h)) {
            AbstractC2670o abstractC2670o3 = (AbstractC2670o) c2652e0.f8459a.mo1h(obj);
            int iMo4625b = abstractC2670o3.mo4625b();
            boolean z5 = false;
            for (int i5 = 0; i5 < iMo4625b; i5++) {
                if (abstractC2670o3.mo4624a(i5) < abstractC2670o2.mo4624a(i5) || abstractC2670o3.mo4624a(i5) > abstractC2670o.mo4624a(i5)) {
                    abstractC2670o3.mo4628e(AbstractC1926h.m3567j(abstractC2670o3.mo4624a(i5), abstractC2670o2.mo4624a(i5), abstractC2670o.mo4624a(i5)), i5);
                    z5 = true;
                }
            }
            if (z5) {
                return c2652e0.f8460b.mo1h(abstractC2670o3);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4603b(C2647c c2647c) {
        C2661j c2661j = c2647c.f8428c;
        c2661j.f8479f.mo4627d();
        c2661j.f8480g = Long.MIN_VALUE;
        c2647c.f8429d.setValue(Boolean.FALSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Object m4604c(C2647c c2647c, Object obj, InterfaceC2659i interfaceC2659i, InterfaceC1601c interfaceC1601c, AbstractC1184i abstractC1184i, int i5) {
        Object objMo1h = c2647c.f8426a.f8460b.mo1h(c2647c.f8428c.f8479f);
        InterfaceC1601c interfaceC1601c2 = (i5 & 8) != 0 ? null : interfaceC1601c;
        Object objM4605d = c2647c.m4605d();
        C2652e0 c2652e0 = c2647c.f8426a;
        return C2623F.m4573a(c2647c.f8431f, new C2643a(c2647c, objMo1h, new C2633P(interfaceC2659i, c2652e0, objM4605d, obj, (AbstractC2670o) c2652e0.f8459a.mo1h(objMo1h)), c2647c.f8428c.f8480g, interfaceC1601c2, null), abstractC1184i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m4605d() {
        return this.f8428c.f8478e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m4606e(InterfaceC1046d interfaceC1046d, Object obj) {
        Object objM4573a = C2623F.m4573a(this.f8431f, new C2645b(this, obj, null), interfaceC1046d);
        return objM4573a == EnumC1152a.f3788d ? objM4573a : C0891q.f2780a;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Object)
  (r2v0 n.e0)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r3v0 java.lang.Object))
 A[MD:(java.lang.Object, n.e0, java.lang.Object):void (m)] (LINE:22) call: n.c.<init>(java.lang.Object, n.e0, java.lang.Object):void type: THIS */
    public /* synthetic */ C2647c(Object obj, C2652e0 c2652e0, Object obj2, int i5) {
        this(obj, c2652e0, (i5 & 4) != 0 ? null : obj2);
    }
}
