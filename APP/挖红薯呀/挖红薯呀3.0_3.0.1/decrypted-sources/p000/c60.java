package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class c60 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0749t2 f707a;

    /* JADX INFO: renamed from: c */
    public boolean f709c;

    /* JADX INFO: renamed from: d */
    public boolean f710d;

    /* JADX INFO: renamed from: e */
    public boolean f711e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0749t2 f712f;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f714h;

    /* JADX INFO: renamed from: b */
    public boolean f708b = true;

    /* JADX INFO: renamed from: g */
    public final HashMap f713g = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c60(InterfaceC0749t2 interfaceC0749t2, int i) {
        this.f714h = i;
        this.f707a = interfaceC0749t2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m491a(c60 c60Var, AbstractC0535o2 abstractC0535o2, int i, qj0 qj0Var) {
        HashMap map = c60Var.f713g;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jM1549y = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (c60Var.f714h) {
                    case 0:
                        cn0 cn0Var = qj0Var.f5179O;
                        if (cn0Var != null) {
                            C0942xx c0942xx = (C0942xx) cn0Var;
                            float[] fArrM5172b = c0942xx.m5172b();
                            if (!c0942xx.f7449v) {
                                jM1549y = r60.m3417s(fArrM5172b, jM1549y);
                            }
                        }
                        jM1549y = AbstractC0307i4.m1549y(jM1549y, qj0Var.f5167C);
                        break;
                    default:
                        ac0 ac0VarMo435E0 = qj0Var.mo435E0();
                        ac0VarMo435E0.getClass();
                        long j = ac0VarMo435E0.f102s;
                        jM1549y = ok0.m2934e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jM1549y);
                        break;
                }
                qj0Var = qj0Var.f5182t;
                qj0Var.getClass();
                if (qj0Var.equals(c60Var.f707a.mo840r())) {
                    int iRound = Math.round(abstractC0535o2 instanceof C0110cz ? Float.intBitsToFloat((int) (jM1549y & 4294967295L)) : Float.intBitsToFloat((int) (jM1549y >> 32)));
                    if (map.containsKey(abstractC0535o2)) {
                        map.getClass();
                        Object obj = map.get(abstractC0535o2);
                        if (obj == null && !map.containsKey(abstractC0535o2)) {
                            throw new NoSuchElementException("Key " + abstractC0535o2 + " is missing in the map.");
                        }
                        int iIntValue = ((Number) obj).intValue();
                        C0110cz c0110cz = AbstractC0674r2.f5280a;
                        iRound = ((Number) abstractC0535o2.f4407a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(abstractC0535o2, Integer.valueOf(iRound));
                    return;
                }
            } while (!c60Var.m492b(qj0Var).containsKey(abstractC0535o2));
            float fM493c = c60Var.m493c(qj0Var, abstractC0535o2);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fM493c);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fM493c);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Map m492b(qj0 qj0Var) {
        switch (this.f714h) {
            case 0:
                return qj0Var.mo56o0().mo667a();
            default:
                ac0 ac0VarMo435E0 = qj0Var.mo435E0();
                ac0VarMo435E0.getClass();
                return ac0VarMo435E0.mo56o0().mo667a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m493c(qj0 qj0Var, AbstractC0535o2 abstractC0535o2) {
        switch (this.f714h) {
            case 0:
                return qj0Var.m5235g0(abstractC0535o2);
            default:
                ac0 ac0VarMo435E0 = qj0Var.mo435E0();
                ac0VarMo435E0.getClass();
                return ac0VarMo435E0.m5235g0(abstractC0535o2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m494d() {
        return this.f709c || this.f710d || this.f711e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m495e() {
        m498h();
        return this.f712f != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m496f() {
        this.f708b = true;
        InterfaceC0749t2 interfaceC0749t2 = this.f707a;
        InterfaceC0749t2 interfaceC0749t2Mo841s = interfaceC0749t2.mo841s();
        if (interfaceC0749t2Mo841s == null) {
            return;
        }
        if (this.f709c) {
            interfaceC0749t2Mo841s.requestLayout();
        }
        if (this.f710d) {
            interfaceC0749t2.mo829N();
        }
        if (this.f711e) {
            interfaceC0749t2.requestLayout();
        }
        interfaceC0749t2Mo841s.mo830a().m496f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m497g() {
        HashMap map = this.f713g;
        map.clear();
        C0711s2 c0711s2 = new C0711s2(0, this);
        InterfaceC0749t2 interfaceC0749t2 = this.f707a;
        interfaceC0749t2.mo837l(c0711s2);
        map.putAll(m492b(interfaceC0749t2.mo840r()));
        this.f708b = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m498h() {
        c60 c60VarMo830a;
        c60 c60VarMo830a2;
        boolean zM494d = m494d();
        InterfaceC0749t2 interfaceC0749t2 = this.f707a;
        if (!zM494d) {
            InterfaceC0749t2 interfaceC0749t2Mo841s = interfaceC0749t2.mo841s();
            if (interfaceC0749t2Mo841s == null) {
                return;
            }
            interfaceC0749t2 = interfaceC0749t2Mo841s.mo830a().f712f;
            if (interfaceC0749t2 == null || !interfaceC0749t2.mo830a().m494d()) {
                InterfaceC0749t2 interfaceC0749t22 = this.f712f;
                if (interfaceC0749t22 == null || interfaceC0749t22.mo830a().m494d()) {
                    return;
                }
                InterfaceC0749t2 interfaceC0749t2Mo841s2 = interfaceC0749t22.mo841s();
                if (interfaceC0749t2Mo841s2 != null && (c60VarMo830a2 = interfaceC0749t2Mo841s2.mo830a()) != null) {
                    c60VarMo830a2.m498h();
                }
                InterfaceC0749t2 interfaceC0749t2Mo841s3 = interfaceC0749t22.mo841s();
                interfaceC0749t2 = (interfaceC0749t2Mo841s3 == null || (c60VarMo830a = interfaceC0749t2Mo841s3.mo830a()) == null) ? null : c60VarMo830a.f712f;
            }
        }
        this.f712f = interfaceC0749t2;
    }
}
