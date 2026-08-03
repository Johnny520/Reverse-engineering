package p116i;

import gg.AbstractC1416l;
import p085fg.InterfaceC1231l;
import p100h0.C1557w0;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: i.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1739c {

    /* JADX INFO: renamed from: a */
    public final C1771m1 f5784a;

    /* JADX INFO: renamed from: b */
    public final Object f5785b;

    /* JADX INFO: renamed from: c */
    public final C1766l f5786c;

    /* JADX INFO: renamed from: d */
    public final C1845j1 f5787d;

    /* JADX INFO: renamed from: e */
    public final C1845j1 f5788e;

    /* JADX INFO: renamed from: f */
    public final C1773n0 f5789f;

    /* JADX INFO: renamed from: g */
    public final AbstractC1781q f5790g;

    /* JADX INFO: renamed from: h */
    public final AbstractC1781q f5791h;

    /* JADX INFO: renamed from: i */
    public final AbstractC1781q f5792i;

    /* JADX INFO: renamed from: j */
    public final AbstractC1781q f5793j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1739c(Object obj, C1771m1 c1771m1, Object obj2) {
        this.f5784a = c1771m1;
        this.f5785b = obj2;
        C1766l c1766l = new C1766l(c1771m1, obj, null, 60);
        this.f5786c = c1766l;
        this.f5787d = AbstractC1874r.m4639u(Boolean.FALSE);
        this.f5788e = AbstractC1874r.m4639u(obj);
        this.f5789f = new C1773n0();
        new C1785r0(obj2);
        AbstractC1781q abstractC1781q = c1766l.f5902i;
        boolean z9 = abstractC1781q instanceof C1769m;
        AbstractC1781q abstractC1781q2 = z9 ? AbstractC1742d.f5805e : abstractC1781q instanceof C1772n ? AbstractC1742d.f5806f : abstractC1781q instanceof C1775o ? AbstractC1742d.f5807g : AbstractC1742d.f5808h;
        this.f5790g = abstractC1781q2;
        AbstractC1781q abstractC1781q3 = z9 ? AbstractC1742d.f5801a : abstractC1781q instanceof C1772n ? AbstractC1742d.f5802b : abstractC1781q instanceof C1775o ? AbstractC1742d.f5803c : AbstractC1742d.f5804d;
        this.f5791h = abstractC1781q3;
        this.f5792i = abstractC1781q2;
        this.f5793j = abstractC1781q3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Object m4357a(C1739c c1739c, Object obj) {
        C1771m1 c1771m1 = c1739c.f5784a;
        AbstractC1781q abstractC1781q = c1739c.f5793j;
        AbstractC1781q abstractC1781q2 = c1739c.f5792i;
        if (!AbstractC1416l.m3825a(abstractC1781q2, c1739c.f5790g) || !AbstractC1416l.m3825a(abstractC1781q, c1739c.f5791h)) {
            AbstractC1781q abstractC1781q3 = (AbstractC1781q) c1771m1.f5912a.invoke(obj);
            int iMo4424b = abstractC1781q3.mo4424b();
            boolean z9 = false;
            for (int i9 = 0; i9 < iMo4424b; i9++) {
                if (abstractC1781q3.mo4423a(i9) < abstractC1781q2.mo4423a(i9) || abstractC1781q3.mo4423a(i9) > abstractC1781q.mo4423a(i9)) {
                    abstractC1781q3.mo4427e(i9, AbstractC3754e0.m7907q(abstractC1781q3.mo4423a(i9), abstractC1781q2.mo4423a(i9), abstractC1781q.mo4423a(i9)));
                    z9 = true;
                }
            }
            if (z9) {
                return c1771m1.f5913b.invoke(abstractC1781q3);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4358b(C1739c c1739c) {
        C1766l c1766l = c1739c.f5786c;
        c1766l.f5902i.mo4426d();
        c1766l.f5903j = Long.MIN_VALUE;
        c1739c.f5787d.setValue(Boolean.FALSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Object m4359c(C1739c c1739c, Object obj, InterfaceC1763k interfaceC1763k, InterfaceC1231l interfaceC1231l, InterfaceC5557c interfaceC5557c, int i9) {
        Object objInvoke = c1739c.f5784a.f5913b.invoke(c1739c.f5786c.f5902i);
        InterfaceC1231l interfaceC1231l2 = (i9 & 8) != 0 ? null : interfaceC1231l;
        Object objM4360d = c1739c.m4360d();
        C1771m1 c1771m1 = c1739c.f5784a;
        return C1773n0.m4428a(c1739c.f5789f, new C1733a(c1739c, objInvoke, new C1806z0(interfaceC1763k, c1771m1, objM4360d, obj, (AbstractC1781q) c1771m1.f5912a.invoke(objInvoke)), c1739c.f5786c.f5903j, interfaceC1231l2, null), interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m4360d() {
        return this.f5786c.f5901h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m4361e(Object obj, InterfaceC5557c interfaceC5557c) {
        Object objM4428a = C1773n0.m4428a(this.f5789f, new C1736b(this, obj, null), interfaceC5557c);
        return objM4428a == EnumC5799a.f23547g ? objM4428a : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m4362f(AbstractC6044i abstractC6044i) {
        Object objM4428a = C1773n0.m4428a(this.f5789f, new C1557w0(this, null, 4), abstractC6044i);
        return objM4428a == EnumC5799a.f23547g ? objM4428a : C3967n.f12976a;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Object)
  (r2v0 i.m1)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r3v0 java.lang.Object))
 A[MD:(java.lang.Object, i.m1, java.lang.Object):void (m)] (LINE:99) call: i.c.<init>(java.lang.Object, i.m1, java.lang.Object):void type: THIS */
    public /* synthetic */ C1739c(Object obj, C1771m1 c1771m1, Object obj2, int i9) {
        this(obj, c1771m1, (i9 & 4) != 0 ? null : obj2);
    }
}
