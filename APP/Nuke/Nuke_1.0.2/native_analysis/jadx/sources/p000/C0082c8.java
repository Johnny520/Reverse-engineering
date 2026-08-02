package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: c8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0082c8 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1225h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f1226i;

    public /* synthetic */ C0082c8(long j, int i) {
        this.f1225h = i;
        this.f1226i = j;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        C0469mp c0469mp;
        Object x92Var;
        int i = this.f1225h;
        long j = this.f1226i;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                C0626qo c0626qo = (C0626qo) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c0626qo.f9053h.mo1842d() >> 32)) / 2.0f;
                return c0626qo.m4218a(new C0121d8(fIntBitsToFloat, rp0.m4538X(c0626qo, fIntBitsToFloat), new C0095cl(j, 5)));
            case 1:
                C0928ym c0928ym = (C0928ym) obj;
                in0 in0Var = c0928ym.f13516b;
                if (in0Var != null && (c0469mp = c0928ym.f13515a) != null) {
                    try {
                        x92Var = in0Var.mo5j(Long.valueOf(j));
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    c0469mp.mo2509h(x92Var);
                    break;
                }
                return a83Var;
            case 2:
                ((zn2) obj).mo1533a(gn2.f3587a, new fn2(rr0.f9716h, this.f1226i, en2.f2518i, true));
                return a83Var;
            case 3:
                nc0 nc0Var = (nc0) obj;
                nc0Var.getClass();
                float fM2020b = gr2.m2020b(nc0Var.mo3280d()) * 0.18f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32)) * 0.5f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L)) * 0.34f)) & 4294967295L);
                long j2 = this.f1226i;
                nc0.m3267O(nc0Var, j2, fM2020b, jFloatToRawIntBits, null, 120);
                nc0.m3267O(nc0Var, C0363ju.m2565b(0.82f, j2), gr2.m2020b(nc0Var.mo3280d()) * 0.32f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32)) * 0.5f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L)) * 0.88f)) & 4294967295L), null, 120);
                return a83Var;
            case 4:
                nc0 nc0Var2 = (nc0) obj;
                nc0Var2.getClass();
                float fMo689A = nc0Var2.mo689A(1.9f);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nc0Var2.mo3280d() >> 32)) * 0.38f;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (nc0Var2.mo3280d() >> 32)) * 0.62f;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (nc0Var2.mo3280d() & 4294967295L)) * 0.28f;
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (nc0Var2.mo3280d() & 4294967295L)) * 0.5f;
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (nc0Var2.mo3280d() & 4294967295L)) * 0.72f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L);
                long j3 = this.f1226i;
                nc0Var2.mo3277Y(j3, jFloatToRawIntBits2, jFloatToRawIntBits3, fMo689A, (496 & 16) != 0 ? 0 : 1);
                nc0Var2.mo3277Y(j3, jFloatToRawIntBits3, jFloatToRawIntBits4, fMo689A, (496 & 16) != 0 ? 0 : 1);
                return a83Var;
            case 5:
                nc0 nc0Var3 = (nc0) obj;
                nc0Var3.getClass();
                float fMo689A2 = nc0Var3.mo689A(2.0f);
                C0915y9 c0915y9M117a = AbstractC0011aa.m117a();
                c0915y9M117a.f13365a.moveTo(Float.intBitsToFloat((int) (nc0Var3.mo3280d() >> 32)) * 0.22f, Float.intBitsToFloat((int) (nc0Var3.mo3280d() & 4294967295L)) * 0.52f);
                c0915y9M117a.m6233e(Float.intBitsToFloat((int) (nc0Var3.mo3280d() >> 32)) * 0.42f, Float.intBitsToFloat((int) (nc0Var3.mo3280d() & 4294967295L)) * 0.72f);
                c0915y9M117a.m6233e(Float.intBitsToFloat((int) (nc0Var3.mo3280d() >> 32)) * 0.78f, Float.intBitsToFloat((int) (nc0Var3.mo3280d() & 4294967295L)) * 0.28f);
                nc0Var3.mo3282t(c0915y9M117a, j, new xv2(fMo689A2, 0.0f, 1, 1, 18));
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                nc0 nc0Var4 = (nc0) obj;
                nc0Var4.getClass();
                float fMo689A3 = nc0Var4.mo689A(1.8f);
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (nc0Var4.mo3280d() >> 32)) * 0.25f;
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var4.mo3280d() & 4294967295L)) * 0.38f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat7)) << 32);
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (nc0Var4.mo3280d() >> 32)) * 0.5f;
                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var4.mo3280d() & 4294967295L)) * 0.62f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat8)) << 32);
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var4.mo3280d() >> 32)) * 0.75f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var4.mo3280d() & 4294967295L)) * 0.38f)) & 4294967295L);
                long j4 = this.f1226i;
                nc0Var4.mo3277Y(j4, jFloatToRawIntBits5, jFloatToRawIntBits6, fMo689A3, (496 & 16) != 0 ? 0 : 1);
                nc0Var4.mo3277Y(j4, jFloatToRawIntBits6, jFloatToRawIntBits7, fMo689A3, (496 & 16) != 0 ? 0 : 1);
                return a83Var;
            case 7:
                nc0 nc0Var5 = (nc0) obj;
                nc0Var5.getClass();
                float fMo689A4 = nc0Var5.mo689A(2.0f);
                long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var5.mo3280d() >> 32)) * 0.66f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var5.mo3280d() & 4294967295L)) * 0.24f)) & 4294967295L);
                long jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var5.mo3280d() >> 32)) * 0.34f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var5.mo3280d() & 4294967295L)) * 0.5f)) & 4294967295L);
                float fIntBitsToFloat9 = Float.intBitsToFloat((int) (nc0Var5.mo3280d() >> 32)) * 0.66f;
                long jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var5.mo3280d() & 4294967295L)) * 0.76f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat9)) << 32);
                long j5 = this.f1226i;
                nc0Var5.mo3277Y(j5, jFloatToRawIntBits8, jFloatToRawIntBits9, fMo689A4, (496 & 16) != 0 ? 0 : 1);
                nc0Var5.mo3277Y(j5, jFloatToRawIntBits9, jFloatToRawIntBits10, fMo689A4, (496 & 16) != 0 ? 0 : 1);
                return a83Var;
            default:
                nc0 nc0Var6 = (nc0) obj;
                float fMin = Math.min(nc0Var6.mo689A(4.0f), Float.intBitsToFloat((int) (nc0Var6.mo3280d() & 4294967295L)));
                float fMo689A5 = nc0Var6.mo689A(6.0f);
                float fIntBitsToFloat10 = (Float.intBitsToFloat((int) (nc0Var6.mo3280d() & 4294967295L)) - fMin) / 2.0f;
                if (fIntBitsToFloat10 <= fMo689A5) {
                    fMo689A5 = fIntBitsToFloat10;
                }
                if (nc0Var6.getLayoutDirection() == d61.f1886i) {
                    long jMo3278a0 = nc0Var6.mo3278a0();
                    C0043b5 c0043b5Mo3274E = nc0Var6.mo3274E();
                    long jM434u = c0043b5Mo3274E.m434u();
                    c0043b5Mo3274E.m430q().mo1522l();
                    try {
                        ((C0485n4) c0043b5Mo3274E.f562i).m3234A(-1.0f, 1.0f, jMo3278a0);
                        AbstractC0738tl.m5322u(nc0Var6, j, fMin, fMo689A5);
                    } finally {
                        vi0.m5699r(c0043b5Mo3274E, jM434u);
                    }
                } else {
                    AbstractC0738tl.m5322u(nc0Var6, j, fMin, fMo689A5);
                }
                return a83Var;
        }
    }
}
