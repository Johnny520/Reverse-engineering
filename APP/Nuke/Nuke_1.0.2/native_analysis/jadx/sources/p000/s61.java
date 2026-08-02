package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s61 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0835w5 f9936a;

    /* JADX INFO: renamed from: c */
    public boolean f9938c;

    /* JADX INFO: renamed from: d */
    public boolean f9939d;

    /* JADX INFO: renamed from: e */
    public boolean f9940e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0835w5 f9941f;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9943h;

    /* JADX INFO: renamed from: b */
    public boolean f9937b = true;

    /* JADX INFO: renamed from: g */
    public final HashMap f9942g = new HashMap();

    public s61(InterfaceC0835w5 interfaceC0835w5, int i) {
        this.f9943h = i;
        this.f9936a = interfaceC0835w5;
    }

    /* JADX INFO: renamed from: a */
    public static final void m4738a(s61 s61Var, du0 du0Var, int i, zn1 zn1Var) {
        HashMap map = s61Var.f9942g;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jM5342D = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (s61Var.f9943h) {
                    case 0:
                        yv1 yv1Var = zn1Var.f13984S;
                        if (yv1Var != null) {
                            sq0 sq0Var = (sq0) yv1Var;
                            float[] fArrM4968b = sq0Var.m4968b();
                            if (!sq0Var.f10304z) {
                                jM5342D = hf1.m2156b(jM5342D, fArrM4968b);
                            }
                        }
                        jM5342D = tp0.m5342D(jM5342D, zn1Var.f13972G);
                        break;
                    default:
                        md1 md1VarMo2842Q0 = zn1Var.mo2842Q0();
                        md1VarMo2842Q0.getClass();
                        long j = md1VarMo2842Q0.f6573w;
                        jM5342D = rs1.m4612e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jM5342D);
                        break;
                }
                zn1Var = zn1Var.f13987x;
                zn1Var.getClass();
                if (zn1Var.equals(s61Var.f9936a.mo3075n())) {
                    int iRound = Math.round(du0Var instanceof du0 ? Float.intBitsToFloat((int) (jM5342D & 4294967295L)) : Float.intBitsToFloat((int) (jM5342D >> 32)));
                    if (map.containsKey(du0Var)) {
                        int iIntValue = ((Number) we1.m5875p0(du0Var, map)).intValue();
                        du0 du0Var2 = AbstractC0761u5.f11107a;
                        iRound = ((Number) du0Var.f2227a.mo12g(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(du0Var, Integer.valueOf(iRound));
                    return;
                }
            } while (!s61Var.m4739b(zn1Var).containsKey(du0Var));
            float fM4740c = s61Var.m4740c(zn1Var, du0Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fM4740c);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fM4740c);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Map m4739b(zn1 zn1Var) {
        switch (this.f9943h) {
            case 0:
                return zn1Var.mo2630A0().mo104a();
            default:
                md1 md1VarMo2842Q0 = zn1Var.mo2842Q0();
                md1VarMo2842Q0.getClass();
                return md1VarMo2842Q0.mo2630A0().mo104a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m4740c(zn1 zn1Var, du0 du0Var) {
        switch (this.f9943h) {
            case 0:
                return zn1Var.m2640q0(du0Var);
            default:
                md1 md1VarMo2842Q0 = zn1Var.mo2842Q0();
                md1VarMo2842Q0.getClass();
                return md1VarMo2842Q0.m2640q0(du0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4741d() {
        return this.f9938c || this.f9939d || this.f9940e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4742e() {
        m4745h();
        return this.f9941f != null;
    }

    /* JADX INFO: renamed from: f */
    public final void m4743f() {
        this.f9937b = true;
        InterfaceC0835w5 interfaceC0835w5 = this.f9936a;
        InterfaceC0835w5 interfaceC0835w5Mo3078p = interfaceC0835w5.mo3078p();
        if (interfaceC0835w5Mo3078p == null) {
            return;
        }
        if (this.f9938c) {
            interfaceC0835w5Mo3078p.requestLayout();
        }
        if (this.f9939d) {
            interfaceC0835w5.mo3068U();
        }
        if (this.f9940e) {
            interfaceC0835w5.requestLayout();
        }
        interfaceC0835w5Mo3078p.mo3070a().m4743f();
    }

    /* JADX INFO: renamed from: g */
    public final void m4744g() {
        HashMap map = this.f9942g;
        map.clear();
        C0798v5 c0798v5 = new C0798v5(0, this);
        InterfaceC0835w5 interfaceC0835w5 = this.f9936a;
        interfaceC0835w5.mo3072k(c0798v5);
        map.putAll(m4739b(interfaceC0835w5.mo3075n()));
        this.f9937b = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m4745h() {
        s61 s61VarMo3070a;
        s61 s61VarMo3070a2;
        boolean zM4741d = m4741d();
        InterfaceC0835w5 interfaceC0835w5 = this.f9936a;
        if (!zM4741d) {
            InterfaceC0835w5 interfaceC0835w5Mo3078p = interfaceC0835w5.mo3078p();
            if (interfaceC0835w5Mo3078p == null) {
                return;
            }
            interfaceC0835w5 = interfaceC0835w5Mo3078p.mo3070a().f9941f;
            if (interfaceC0835w5 == null || !interfaceC0835w5.mo3070a().m4741d()) {
                InterfaceC0835w5 interfaceC0835w52 = this.f9941f;
                if (interfaceC0835w52 == null || interfaceC0835w52.mo3070a().m4741d()) {
                    return;
                }
                InterfaceC0835w5 interfaceC0835w5Mo3078p2 = interfaceC0835w52.mo3078p();
                if (interfaceC0835w5Mo3078p2 != null && (s61VarMo3070a2 = interfaceC0835w5Mo3078p2.mo3070a()) != null) {
                    s61VarMo3070a2.m4745h();
                }
                InterfaceC0835w5 interfaceC0835w5Mo3078p3 = interfaceC0835w52.mo3078p();
                interfaceC0835w5 = (interfaceC0835w5Mo3078p3 == null || (s61VarMo3070a = interfaceC0835w5Mo3078p3.mo3070a()) == null) ? null : s61VarMo3070a.f9941f;
            }
        }
        this.f9941f = interfaceC0835w5;
    }
}
