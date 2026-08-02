package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d33 extends io1 {

    /* JADX INFO: renamed from: f */
    public final C0356jn f1857f;

    /* JADX INFO: renamed from: g */
    public zt2 f1858g;

    public d33(im2 im2Var, C0365jw c0365jw, e70 e70Var) {
        super(im2Var, c0365jw, e70Var);
        this.f1857f = fg1.m1630a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
    
        if (r0.mo12g(r3, r7) == r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m936c(d33 d33Var, im2 im2Var, b33 b33Var, u00 u00Var) {
        c33 c33Var;
        d33Var.getClass();
        sz0 sz0Var = d33Var.f4715e;
        if (u00Var instanceof c33) {
            c33Var = (c33) u00Var;
            int i = c33Var.f1126m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33Var.f1126m = i - Integer.MIN_VALUE;
            } else {
                c33Var = new c33(d33Var, u00Var);
            }
        }
        c33 c33Var2 = c33Var;
        Object obj = c33Var2.f1124k;
        int i2 = c33Var2.f1126m;
        Object obj2 = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(obj);
            o72 o72Var = new o72();
            o72Var.f7574i = b33Var;
            long j = b33Var.f549b;
            long j2 = b33Var.f548a;
            ((bb2) sz0Var.f10436i).m509a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((bb2) sz0Var.f10437j).m509a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            b33 b33VarM937e = m937e(d33Var.f1857f);
            if (b33VarM937e != null) {
                long j3 = b33VarM937e.f549b;
                long j4 = b33VarM937e.f548a;
                ((bb2) sz0Var.f10436i).m509a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((bb2) sz0Var.f10437j).m509a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                o72Var.f7574i = ((b33) o72Var.f7574i).m364a(b33VarM937e);
            }
            mn0 c0793v0 = new C0793v0(d33Var, im2Var, o72Var, null, 8);
            c33Var2.f1126m = 1;
            if (d33Var.m2382b(c0793v0, c33Var2) != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.m1627T(obj);
                return a83.f116a;
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.m1627T(obj);
        mn0 mn0Var = d33Var.f4712b;
        da3 da3Var = new da3(ea3.m1314a(((bb2) sz0Var.f10436i).m510b(Float.MAX_VALUE), ((bb2) sz0Var.f10437j).m510b(Float.MAX_VALUE)));
        c33Var2.f1126m = 2;
    }

    /* JADX INFO: renamed from: e */
    public static b33 m937e(C0356jn c0356jn) {
        b33 b33Var = null;
        vo2 vo2VarM5340B = tp0.m5340B(new lm0(new ni1(c0356jn, 1), null, 2));
        while (vo2VarM5340B.hasNext()) {
            b33 b33VarM364a = (b33) vo2VarM5340B.next();
            if (b33Var != null) {
                b33VarM364a = b33Var.m364a(b33VarM364a);
            }
            b33Var = b33VarM364a;
        }
        return b33Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m938d(h12 h12Var) {
        boolean z;
        boolean z2;
        boolean z3;
        C0356jn c0356jn;
        im2 im2Var;
        o12 o12Var = (o12) AbstractC0142du.m1161q0(h12Var.f3776a);
        if (o12Var != null) {
            List list = o12Var.f7432m;
            if (list == null) {
                list = be0.f819h;
            }
            int size = list.size();
            int i = 0;
            z3 = false;
            while (true) {
                c0356jn = this.f1857f;
                im2Var = this.f4711a;
                if (i >= size) {
                    break;
                }
                ts0 ts0Var = (ts0) list.get(i);
                long j = ts0Var.f10944d ^ (-9223372034707292160L);
                if (!(im2Var.m2372i(im2Var.m2368e(j)) == 0.0f)) {
                    z3 = !(c0356jn.mo2225s(new b33(j, ts0Var.f10941a, false)) instanceof C0552oq) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = o12Var.f7431l ^ (-9223372034707292160L);
            boolean z4 = h12Var.f3781f == 12;
            if (!(im2Var.m2372i(im2Var.m2368e(j2)) == 0.0f) || z4) {
                if (!(c0356jn.mo2225s(new b33(j2, o12Var.f7421b, z4)) instanceof C0552oq) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.f4714d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
