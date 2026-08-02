package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d33 extends io1 {
    public final jn f;
    public zt2 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d33(im2 im2Var, jw jwVar, e70 e70Var) {
        super(im2Var, jwVar, e70Var);
        this.f = fg1.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
    
        if (r0.g(r3, r7) == r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d33 d33Var, im2 im2Var, b33 b33Var, u00 u00Var) {
        c33 c33Var;
        d33Var.getClass();
        sz0 sz0Var = d33Var.e;
        if (u00Var instanceof c33) {
            c33Var = (c33) u00Var;
            int i = c33Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33Var.m = i - Integer.MIN_VALUE;
            } else {
                c33Var = new c33(d33Var, u00Var);
            }
        }
        c33 c33Var2 = c33Var;
        Object obj = c33Var2.k;
        int i2 = c33Var2.m;
        Object obj2 = k20.h;
        if (i2 == 0) {
            fg1.T(obj);
            o72 o72Var = new o72();
            o72Var.i = b33Var;
            long j = b33Var.b;
            long j2 = b33Var.a;
            ((bb2) sz0Var.i).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((bb2) sz0Var.j).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            b33 b33VarE = e(d33Var.f);
            if (b33VarE != null) {
                long j3 = b33VarE.b;
                long j4 = b33VarE.a;
                ((bb2) sz0Var.i).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((bb2) sz0Var.j).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                o72Var.i = ((b33) o72Var.i).a(b33VarE);
            }
            mn0 v0Var = new v0(d33Var, im2Var, o72Var, null, 8);
            c33Var2.m = 1;
            if (d33Var.b(v0Var, c33Var2) != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.T(obj);
                return a83.a;
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.T(obj);
        mn0 mn0Var = d33Var.b;
        da3 da3Var = new da3(ea3.a(((bb2) sz0Var.i).b(Float.MAX_VALUE), ((bb2) sz0Var.j).b(Float.MAX_VALUE)));
        c33Var2.m = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b33 e(jn jnVar) {
        b33 b33Var = null;
        vo2 vo2VarB = tp0.B(new lm0(new ni1(jnVar, 1), null, 2));
        while (vo2VarB.hasNext()) {
            b33 b33VarA = (b33) vo2VarB.next();
            if (b33Var != null) {
                b33VarA = b33Var.a(b33VarA);
            }
            b33Var = b33VarA;
        }
        return b33Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(h12 h12Var) {
        boolean z;
        boolean z2;
        boolean z3;
        jn jnVar;
        im2 im2Var;
        o12 o12Var = (o12) du.q0(h12Var.a);
        if (o12Var != null) {
            List list = o12Var.m;
            if (list == null) {
                list = be0.h;
            }
            int size = list.size();
            int i = 0;
            z3 = false;
            while (true) {
                jnVar = this.f;
                im2Var = this.a;
                if (i >= size) {
                    break;
                }
                ts0 ts0Var = (ts0) list.get(i);
                long j = ts0Var.d ^ (-9223372034707292160L);
                if (!(im2Var.i(im2Var.e(j)) == 0.0f)) {
                    z3 = !(jnVar.s(new b33(j, ts0Var.a, false)) instanceof oq) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = o12Var.l ^ (-9223372034707292160L);
            boolean z4 = h12Var.f == 12;
            if (!(im2Var.i(im2Var.e(j2)) == 0.0f) || z4) {
                if (!(jnVar.s(new b33(j2, o12Var.b, z4)) instanceof oq) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
