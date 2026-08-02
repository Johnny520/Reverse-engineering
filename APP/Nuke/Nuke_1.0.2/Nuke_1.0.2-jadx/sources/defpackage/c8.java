package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c8 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c8(long j, int i) {
        this.h = i;
        this.i = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        mp mpVar;
        Object x92Var;
        int i = this.h;
        long j = this.i;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                qo qoVar = (qo) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (qoVar.h.d() >> 32)) / 2.0f;
                return qoVar.a(new d8(fIntBitsToFloat, rp0.X(qoVar, fIntBitsToFloat), new cl(j, 5)));
            case 1:
                ym ymVar = (ym) obj;
                in0 in0Var = ymVar.b;
                if (in0Var != null && (mpVar = ymVar.a) != null) {
                    try {
                        x92Var = in0Var.j(Long.valueOf(j));
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    mpVar.h(x92Var);
                    break;
                }
                return a83Var;
            case 2:
                ((zn2) obj).a(gn2.a, new fn2(rr0.h, this.i, en2.i, true));
                return a83Var;
            case 3:
                nc0 nc0Var = (nc0) obj;
                nc0Var.getClass();
                float fB = gr2.b(nc0Var.d()) * 0.18f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.d() >> 32)) * 0.5f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L)) * 0.34f)) & 4294967295L);
                long j2 = this.i;
                nc0.O(nc0Var, j2, fB, jFloatToRawIntBits, null, 120);
                nc0.O(nc0Var, ju.b(0.82f, j2), gr2.b(nc0Var.d()) * 0.32f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.d() >> 32)) * 0.5f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L)) * 0.88f)) & 4294967295L), null, 120);
                return a83Var;
            case 4:
                nc0 nc0Var2 = (nc0) obj;
                nc0Var2.getClass();
                float fA = nc0Var2.A(1.9f);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nc0Var2.d() >> 32)) * 0.38f;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (nc0Var2.d() >> 32)) * 0.62f;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (nc0Var2.d() & 4294967295L)) * 0.28f;
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (nc0Var2.d() & 4294967295L)) * 0.5f;
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (nc0Var2.d() & 4294967295L)) * 0.72f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L);
                long j3 = this.i;
                nc0Var2.Y(j3, jFloatToRawIntBits2, jFloatToRawIntBits3, fA, (496 & 16) != 0 ? 0 : 1);
                nc0Var2.Y(j3, jFloatToRawIntBits3, jFloatToRawIntBits4, fA, (496 & 16) != 0 ? 0 : 1);
                return a83Var;
            case 5:
                nc0 nc0Var3 = (nc0) obj;
                nc0Var3.getClass();
                float fA2 = nc0Var3.A(2.0f);
                y9 y9VarA = aa.a();
                y9VarA.a.moveTo(Float.intBitsToFloat((int) (nc0Var3.d() >> 32)) * 0.22f, Float.intBitsToFloat((int) (nc0Var3.d() & 4294967295L)) * 0.52f);
                y9VarA.e(Float.intBitsToFloat((int) (nc0Var3.d() >> 32)) * 0.42f, Float.intBitsToFloat((int) (nc0Var3.d() & 4294967295L)) * 0.72f);
                y9VarA.e(Float.intBitsToFloat((int) (nc0Var3.d() >> 32)) * 0.78f, Float.intBitsToFloat((int) (nc0Var3.d() & 4294967295L)) * 0.28f);
                nc0Var3.t(y9VarA, j, new xv2(fA2, 0.0f, 1, 1, 18));
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                nc0 nc0Var4 = (nc0) obj;
                nc0Var4.getClass();
                float fA3 = nc0Var4.A(1.8f);
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (nc0Var4.d() >> 32)) * 0.25f;
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var4.d() & 4294967295L)) * 0.38f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat7)) << 32);
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (nc0Var4.d() >> 32)) * 0.5f;
                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var4.d() & 4294967295L)) * 0.62f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat8)) << 32);
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var4.d() >> 32)) * 0.75f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var4.d() & 4294967295L)) * 0.38f)) & 4294967295L);
                long j4 = this.i;
                nc0Var4.Y(j4, jFloatToRawIntBits5, jFloatToRawIntBits6, fA3, (496 & 16) != 0 ? 0 : 1);
                nc0Var4.Y(j4, jFloatToRawIntBits6, jFloatToRawIntBits7, fA3, (496 & 16) != 0 ? 0 : 1);
                return a83Var;
            case 7:
                nc0 nc0Var5 = (nc0) obj;
                nc0Var5.getClass();
                float fA4 = nc0Var5.A(2.0f);
                long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var5.d() >> 32)) * 0.66f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var5.d() & 4294967295L)) * 0.24f)) & 4294967295L);
                long jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var5.d() >> 32)) * 0.34f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var5.d() & 4294967295L)) * 0.5f)) & 4294967295L);
                float fIntBitsToFloat9 = Float.intBitsToFloat((int) (nc0Var5.d() >> 32)) * 0.66f;
                long jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var5.d() & 4294967295L)) * 0.76f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat9)) << 32);
                long j5 = this.i;
                nc0Var5.Y(j5, jFloatToRawIntBits8, jFloatToRawIntBits9, fA4, (496 & 16) != 0 ? 0 : 1);
                nc0Var5.Y(j5, jFloatToRawIntBits9, jFloatToRawIntBits10, fA4, (496 & 16) != 0 ? 0 : 1);
                return a83Var;
            default:
                nc0 nc0Var6 = (nc0) obj;
                float fMin = Math.min(nc0Var6.A(4.0f), Float.intBitsToFloat((int) (nc0Var6.d() & 4294967295L)));
                float fA5 = nc0Var6.A(6.0f);
                float fIntBitsToFloat10 = (Float.intBitsToFloat((int) (nc0Var6.d() & 4294967295L)) - fMin) / 2.0f;
                if (fIntBitsToFloat10 <= fA5) {
                    fA5 = fIntBitsToFloat10;
                }
                if (nc0Var6.getLayoutDirection() == d61.i) {
                    long jA0 = nc0Var6.a0();
                    b5 b5VarE = nc0Var6.E();
                    long jU = b5VarE.u();
                    b5VarE.q().l();
                    try {
                        ((n4) b5VarE.i).A(-1.0f, 1.0f, jA0);
                        tl.u(nc0Var6, j, fMin, fA5);
                    } finally {
                        vi0.r(b5VarE, jU);
                    }
                } else {
                    tl.u(nc0Var6, j, fMin, fA5);
                }
                return a83Var;
        }
    }
}
