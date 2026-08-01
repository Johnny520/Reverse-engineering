package p000;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* JADX INFO: renamed from: n */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0493n extends AbstractC0731sm implements qr0, a50, vz0, h91, InterfaceC1005zi, mk0, q10 {

    /* JADX INFO: renamed from: N */
    public static final C0496n2 f4090N = new C0496n2(29);

    /* JADX INFO: renamed from: A */
    public f10 f4091A;

    /* JADX INFO: renamed from: B */
    public s51 f4092B;

    /* JADX INFO: renamed from: C */
    public InterfaceC0694rm f4093C;

    /* JADX INFO: renamed from: D */
    public js0 f4094D;

    /* JADX INFO: renamed from: E */
    public C0264gz f4095E;

    /* JADX INFO: renamed from: F */
    public final zg0 f4096F;

    /* JADX INFO: renamed from: G */
    public long f4097G;

    /* JADX INFO: renamed from: H */
    public js0 f4098H;

    /* JADX INFO: renamed from: I */
    public xg0 f4099I;

    /* JADX INFO: renamed from: J */
    public boolean f4100J;

    /* JADX INFO: renamed from: K */
    public C0111d f4101K;

    /* JADX INFO: renamed from: L */
    public r31 f4102L;

    /* JADX INFO: renamed from: M */
    public final C0496n2 f4103M;

    /* JADX INFO: renamed from: t */
    public xg0 f4104t;

    /* JADX INFO: renamed from: u */
    public f10 f4105u;

    /* JADX INFO: renamed from: v */
    public boolean f4106v;

    /* JADX INFO: renamed from: w */
    public xv0 f4107w;

    /* JADX INFO: renamed from: x */
    public boolean f4108x;

    /* JADX INFO: renamed from: y */
    public InterfaceC0298hw f4109y;

    /* JADX INFO: renamed from: z */
    public final C0260gv f4110z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0493n(xg0 xg0Var, f10 f10Var, boolean z, boolean z2, xv0 xv0Var, InterfaceC0298hw interfaceC0298hw) {
        this.f4104t = xg0Var;
        this.f4105u = f10Var;
        this.f4106v = z;
        this.f4107w = xv0Var;
        this.f4108x = z2;
        this.f4109y = interfaceC0298hw;
        this.f4110z = new C0260gv(xg0Var, new C0191f(1, this, AbstractC0493n.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        int i = mb0.f3910a;
        this.f4096F = new zg0(6);
        this.f4097G = 0L;
        xg0 xg0Var2 = this.f4104t;
        this.f4099I = xg0Var2;
        this.f4100J = xg0Var2 == null;
        this.f4103M = f4090N;
    }

    /* JADX INFO: renamed from: A0 */
    public abstract s51 mo689A0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public final boolean m2611B0() {
        vt0 vt0Var = new vt0();
        r60.m3395D(this, sy0.f5860s, new C0532o(3, vt0Var));
        if (vt0Var.f6825d) {
            return true;
        }
        int i = AbstractC0686re.f5383b;
        if (!this.f4529d.f4542q) {
            w10.m4824b("Cannot get View because the Modifier node is not currently attached.");
        }
        ViewParent parent = ((View) e60.m789a(pf1.m3039Q(this))).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX INFO: renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2612C0() {
        xg0 xg0Var = this.f4104t;
        zg0 zg0Var = this.f4096F;
        if (xg0Var != null) {
            js0 js0Var = this.f4094D;
            if (js0Var != null) {
                xg0Var.m5136c(new is0(js0Var));
            }
            js0 js0Var2 = this.f4098H;
            if (js0Var2 != null) {
                xg0Var.m5136c(new is0(js0Var2));
            }
            C0264gz c0264gz = this.f4095E;
            if (c0264gz != null) {
                xg0Var.m5136c(new C0301hz(c0264gz));
            }
            Object[] objArr = zg0Var.f7889c;
            long[] jArr = zg0Var.f7887a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                xg0Var.m5136c(new is0((js0) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.f4094D = null;
        this.f4098H = null;
        this.f4095E = null;
        zg0Var.m5586a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public final void m2613D0(boolean z) {
        xg0 xg0Var = this.f4104t;
        if (xg0Var != null) {
            r31 r31Var = this.f4102L;
            InterfaceC0322ik interfaceC0322ik = null;
            if (r31Var == null || !r31Var.mo479b()) {
                js0 js0Var = z ? this.f4098H : this.f4094D;
                if (js0Var != null) {
                    is0 is0Var = new is0(js0Var);
                    c40 c40Var = (c40) ((C0286hk) m2879k0()).f2274d.mo64l(C0496n2.f4129I);
                    AbstractC0307i4.m1547w(m2879k0(), null, new C0302i(xg0Var, is0Var, c40Var != null ? c40Var.mo482r(new C0073c(0, xg0Var, is0Var)) : null, interfaceC0322ik, 0), 3);
                }
            } else {
                r31 r31Var2 = this.f4102L;
                if (r31Var2 != null) {
                    r31Var2.mo478a(null);
                }
            }
            if (z) {
                this.f4098H = null;
            } else {
                this.f4094D = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public final void m2614E0(long j, boolean z) {
        xg0 xg0Var = this.f4104t;
        if (xg0Var != null) {
            r31 r31Var = this.f4102L;
            if (r31Var == null || !r31Var.mo479b()) {
                js0 js0Var = z ? this.f4098H : this.f4094D;
                if (js0Var != null) {
                    AbstractC0307i4.m1547w(m2879k0(), null, new C0337j(js0Var, xg0Var, (InterfaceC0322ik) null), 3);
                }
            } else {
                r31Var.mo478a(null);
                AbstractC0307i4.m1547w(m2879k0(), null, new C0228g(r31Var, j, xg0Var, null, 1), 3);
            }
            if (z) {
                this.f4098H = null;
            } else {
                this.f4094D = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public final void m2615F0(long j, boolean z) {
        xg0 xg0Var = this.f4104t;
        if (xg0Var != null) {
            js0 js0Var = new js0(j);
            if (m2611B0()) {
                this.f4102L = AbstractC0307i4.m1547w(m2879k0(), null, new C0374k(xg0Var, js0Var, z, this, null), 3);
                return;
            }
            if (z) {
                this.f4098H = js0Var;
            } else {
                this.f4094D = js0Var;
            }
            AbstractC0307i4.m1547w(m2879k0(), null, new C0337j(xg0Var, js0Var, (InterfaceC0322ik) null), 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public final void m2616G0() {
        if (this.f4093C != null) {
            return;
        }
        f10 f10Var = this.f4106v ? this.f4091A : this.f4105u;
        if (f10Var != null) {
            if (this.f4104t == null) {
                this.f4104t = new xg0();
            }
            this.f4110z.m1256B0(this.f4104t);
            xg0 xg0Var = this.f4104t;
            xg0Var.getClass();
            InterfaceC0694rm interfaceC0694rmMo979a = f10Var.mo979a(xg0Var);
            m4086w0(interfaceC0694rmMo979a);
            this.f4093C = interfaceC0694rmMo979a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.a50
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo22I(KeyEvent keyEvent) {
        boolean z;
        m2616G0();
        long jM2968D = p30.m2968D(keyEvent);
        boolean z2 = this.f4108x;
        int i = 3;
        InterfaceC0322ik interfaceC0322ik = null;
        zg0 zg0Var = this.f4096F;
        if (z2) {
            int i2 = 2;
            if (p30.m2971G(keyEvent) == 2 && rd0.m3442A(keyEvent)) {
                if (zg0Var.m5587b(jM2968D)) {
                    z = false;
                } else {
                    js0 js0Var = new js0(this.f4097G);
                    zg0Var.m5592g(jM2968D, js0Var);
                    if (this.f4104t != null) {
                        AbstractC0307i4.m1547w(m2879k0(), null, new C0413l(this, js0Var, interfaceC0322ik, i2), 3);
                    }
                    z = true;
                }
                return mo691I0(keyEvent) || z;
            }
        }
        if (this.f4108x && p30.m2971G(keyEvent) == 1 && rd0.m3442A(keyEvent)) {
            js0 js0Var2 = (js0) zg0Var.m5591f(jM2968D);
            if (js0Var2 != null) {
                if (this.f4104t != null) {
                    AbstractC0307i4.m1547w(m2879k0(), null, new C0413l(this, js0Var2, interfaceC0322ik, i), 3);
                }
                mo692J0(keyEvent);
            }
            if (js0Var2 != null) {
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    public abstract boolean mo691I0(KeyEvent keyEvent);

    /* JADX INFO: renamed from: J0 */
    public abstract void mo692J0(KeyEvent keyEvent);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX INFO: renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2617K0(xg0 xg0Var, f10 f10Var, boolean z, boolean z2, xv0 xv0Var, InterfaceC0298hw interfaceC0298hw) {
        boolean z3;
        InterfaceC0694rm interfaceC0694rm;
        boolean z4 = true;
        if (p30.m3002l(this.f4099I, xg0Var)) {
            z3 = false;
        } else {
            m2612C0();
            this.f4099I = xg0Var;
            this.f4104t = xg0Var;
            z3 = true;
        }
        if (!p30.m3002l(this.f4105u, f10Var)) {
            this.f4105u = f10Var;
            z3 = true;
        }
        if (this.f4106v != z) {
            this.f4106v = z;
            if (z) {
                mo734z();
            }
            z3 = true;
        }
        boolean z5 = this.f4108x;
        C0260gv c0260gv = this.f4110z;
        if (z5 != z2) {
            if (z2) {
                m4086w0(c0260gv);
            } else {
                m4087x0(c0260gv);
                m2612C0();
            }
            z60.m5417D(this);
            this.f4108x = z2;
        }
        if (!p30.m3002l(this.f4107w, xv0Var)) {
            this.f4107w = xv0Var;
            z60.m5417D(this);
        }
        this.f4109y = interfaceC0298hw;
        boolean z6 = this.f4100J;
        xg0 xg0Var2 = this.f4099I;
        if (z6 == (xg0Var2 == null)) {
            z4 = z3;
        } else {
            boolean z7 = xg0Var2 == null;
            this.f4100J = z7;
            if (z7 || this.f4093C != null) {
            }
        }
        if (z4 && ((interfaceC0694rm = this.f4093C) != null || !this.f4100J)) {
            if (interfaceC0694rm != null) {
                m4087x0(interfaceC0694rm);
            }
            this.f4093C = null;
            m2616G0();
        }
        c0260gv.m1256B0(this.f4104t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: S */
    public final void mo757S(f01 f01Var) {
        xv0 xv0Var = this.f4107w;
        if (xv0Var != null) {
            d01.m620a(f01Var, xv0Var.f7427a);
        }
        C0037b c0037b = new C0037b(this, 1);
        u40[] u40VarArr = d01.f923a;
        f01Var.mo17a(rz0.f5589b, new C0533o0(null, c0037b));
        if (this.f4108x) {
            this.f4110z.mo757S(f01Var);
        } else {
            f01Var.mo17a(b01.f330i, na1.f4229a);
        }
        mo695z0(f01Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qr0
    /* JADX INFO: renamed from: U */
    public void mo758U() {
        C0264gz c0264gz;
        xg0 xg0Var = this.f4104t;
        if (xg0Var != null && (c0264gz = this.f4095E) != null) {
            xg0Var.m5136c(new C0301hz(c0264gz));
        }
        this.f4095E = null;
        s51 s51Var = this.f4092B;
        if (s51Var != null) {
            s51Var.mo758U();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: X */
    public final boolean mo2022X() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.h91
    /* JADX INFO: renamed from: k */
    public final Object mo1247k() {
        return this.f4103M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: o0 */
    public final void mo656o0() {
        mo734z();
        if (!this.f4100J) {
            m2616G0();
        }
        if (this.f4108x) {
            m4086w0(this.f4110z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
        m2612C0();
        if (this.f4099I == null) {
            this.f4104t = null;
        }
        InterfaceC0694rm interfaceC0694rm = this.f4093C;
        if (interfaceC0694rm != null) {
            m4087x0(interfaceC0694rm);
        }
        this.f4093C = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.q10
    /* JADX INFO: renamed from: r */
    public final void mo760r() {
        C0111d c0111d = this.f4101K;
        if (c0111d != null) {
            c0111d.m618o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.q10
    /* JADX INFO: renamed from: u */
    public final void mo761u(C0791u5 c0791u5, jr0 jr0Var) {
        ArrayList arrayList = (ArrayList) c0791u5.f6135b;
        m2616G0();
        if (this.f4108x) {
            if (this.f4101K == null) {
                this.f4101K = new C0111d(this);
            }
            C0111d c0111d = this.f4101K;
            if (c0111d != null) {
                InterfaceC0298hw interfaceC0298hw = this.f4109y;
                AbstractC0493n abstractC0493n = (AbstractC0493n) c0111d.f919e;
                int i = 0;
                if (jr0Var != jr0.f2934e) {
                    if (jr0Var != jr0.f2935f || ((h10) c0111d.f920f) == null) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        h10 h10Var = (h10) arrayList.get(i);
                        if (h10Var.f2122i && h10Var != ((h10) c0111d.f920f)) {
                            c0111d.m618o();
                            return;
                        }
                        i++;
                    }
                    return;
                }
                h10 h10Var2 = (h10) c0111d.f920f;
                if (h10Var2 == null) {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        h10 h10Var3 = (h10) arrayList.get(i2);
                        if (!h10Var3.f2121h && h10Var3.f2117d) {
                            h10 h10Var4 = (h10) arrayList.get(0);
                            c0111d.f920f = h10Var4;
                            abstractC0493n.m2615F0(h10Var4.f2116c, true);
                            h10Var4.f2122i = true;
                            return;
                        }
                    }
                    return;
                }
                long j = h10Var2.f2116c;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    h10 h10Var5 = (h10) arrayList.get(i3);
                    if (h10Var5.f2121h && h10Var5.f2117d) {
                        if (Math.abs(ok0.m2932c(ok0.m2933d(((h10) arrayList.get(0)).f2116c, j))) > ((nc1) pf1.m3058r(abstractC0493n, AbstractC0131dj.f1132s)).mo2691d()) {
                            c0111d.m618o();
                            return;
                        }
                        return;
                    }
                }
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    h10 h10Var6 = (h10) arrayList.get(i4);
                    if (h10Var6.f2122i || !h10Var6.f2121h || h10Var6.f2117d) {
                        int size5 = arrayList.size();
                        while (i < size5) {
                            if (((h10) arrayList.get(i)).f2122i) {
                                c0111d.m618o();
                                return;
                            }
                            i++;
                        }
                        return;
                    }
                }
                ((h10) arrayList.get(0)).f2122i = true;
                abstractC0493n.m2614E0(j, true);
                interfaceC0298hw.invoke();
                c0111d.f920f = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qr0
    /* JADX INFO: renamed from: x */
    public void mo762x(ir0 ir0Var, jr0 jr0Var, long j) {
        s51 s51VarMo689A0;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.f4097G = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        m2616G0();
        if (this.f4108x && jr0Var == jr0.f2934e) {
            int i = ir0Var.f2613d;
            InterfaceC0322ik interfaceC0322ik = null;
            if (i == 4) {
                AbstractC0307i4.m1547w(m2879k0(), null, new C0450m(this, interfaceC0322ik, 0), 3);
            } else if (i == 5) {
                AbstractC0307i4.m1547w(m2879k0(), null, new C0450m(this, interfaceC0322ik, 1), 3);
            }
        }
        if (this.f4092B == null && (s51VarMo689A0 = mo689A0()) != null) {
            m4086w0(s51VarMo689A0);
            this.f4092B = s51VarMo689A0;
        }
        s51 s51Var = this.f4092B;
        if (s51Var != null) {
            s51Var.mo762x(ir0Var, jr0Var, j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mk0
    /* JADX INFO: renamed from: z */
    public final void mo734z() {
        if (this.f4106v) {
            r60.m3420v(this, new C0037b(this, 0));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void mo690H0() {
    }

    /* JADX INFO: renamed from: z0 */
    public void mo695z0(f01 f01Var) {
    }
}
