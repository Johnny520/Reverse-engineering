package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ja1 implements InterfaceC0643q8 {

    /* JADX INFO: renamed from: a */
    public final Object f2779a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2780b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public Object f2781c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ja1(b60 b60Var) {
        this.f2779a = b60Var;
        this.f2781c = b60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: a */
    public final void mo1681a(int i, Object obj) {
        ((b60) this.f2781c).m266B(i, (b60) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: b */
    public final void mo1682b(Object obj) {
        this.f2780b.add(this.f2781c);
        this.f2781c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: c */
    public final void mo1683c() {
        ut0 rectManager;
        C0004a3 c0004a3;
        ut0 rectManager2;
        b60 b60Var = (b60) this.f2781c;
        mj0 mj0Var = b60Var.f395I;
        if (!b60Var.m272H()) {
            w10.m4823a("onReuse is only expected on attached node");
        }
        q60 q60Var = b60Var.f397K;
        if (q60Var != null) {
            q60Var.m3201i(false);
        }
        b60Var.f424w = false;
        if (b60Var.f404R) {
            b60Var.f404R = false;
        } else {
            oe0 oe0Var = b60Var.f395I.f3997e;
            for (oe0 oe0Var2 = oe0Var; oe0Var2 != null; oe0Var2 = oe0Var2.f4533h) {
                if (oe0Var2.f4542q) {
                    oe0Var2.mo2882r0();
                }
            }
            for (oe0 oe0Var3 = oe0Var; oe0Var3 != null; oe0Var3 = oe0Var3.f4533h) {
                if (oe0Var3.f4542q) {
                    oe0Var3.mo2884t0();
                }
            }
            while (oe0Var != null) {
                if (oe0Var.f4542q) {
                    oe0Var.mo2881n0();
                }
                oe0Var = oe0Var.f4533h;
            }
        }
        int i = b60Var.f406e;
        dn0 dn0Var = b60Var.f419r;
        if (dn0Var != null && (rectManager2 = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0Var).getRectManager()) != null) {
            rectManager2.m4353h(b60Var);
        }
        b60Var.f406e = uz0.f6358a.addAndGet(1);
        dn0 dn0Var2 = b60Var.f419r;
        if (dn0Var2 != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = (ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0Var2;
            viewTreeObserverOnGlobalLayoutListenerC0875w3.getLayoutNodes().m4328g(i);
            viewTreeObserverOnGlobalLayoutListenerC0875w3.getLayoutNodes().m4330i(b60Var.f406e, b60Var);
        }
        for (oe0 oe0Var4 = mj0Var.f3998f; oe0Var4 != null; oe0Var4 = oe0Var4.f4534i) {
            oe0Var4.mo2880m0();
        }
        mj0Var.m2601e();
        if (mj0Var.m2600d(8)) {
            b60Var.m270F();
        }
        b60.m263Y(b60Var);
        dn0 dn0Var3 = b60Var.f419r;
        if (dn0Var3 != null && (c0004a3 = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0Var3).f6934N) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w32 = c0004a3.f32f;
            C0910x1 c0910x1 = c0004a3.f30d;
            vg0 vg0Var = c0004a3.f36j;
            if (vg0Var.m4748e(i)) {
                c0910x1.m5076p(viewTreeObserverOnGlobalLayoutListenerC0875w32, i, false);
            }
            sz0 sz0VarM317x = b60Var.m317x();
            if (sz0VarM317x != null && sz0VarM317x.f5877d.m1696b(b01.f338q)) {
                vg0Var.m4744a(b60Var.f406e);
                c0910x1.m5076p(viewTreeObserverOnGlobalLayoutListenerC0875w32, b60Var.f406e, true);
            }
        }
        dn0 dn0Var4 = b60Var.f419r;
        if (dn0Var4 == null || (rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0Var4).getRectManager()) == null) {
            return;
        }
        rectManager.m4352f(b60Var, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo1684d(int i, Object obj) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: e */
    public final void mo1685e() {
        dn0 dn0Var = ((b60) this.f2779a).f419r;
        if (dn0Var != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0Var).m4861u();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: f */
    public final void mo1686f(int i, int i2, int i3) {
        ((b60) this.f2781c).m276L(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: g */
    public final Object mo1687g() {
        return this.f2781c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: h */
    public final void mo1688h(int i, int i2) {
        ((b60) this.f2781c).m282S(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: j */
    public final void mo1689j() {
        this.f2781c = this.f2780b.remove(r0.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1690k() {
        this.f2780b.clear();
        this.f2781c = this.f2779a;
        ((b60) this.f2779a).m281R();
    }
}
