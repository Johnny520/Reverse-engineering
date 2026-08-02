package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ru {
    public static final tu2 a = new tu2(new c0(26));
    public static final tu2 b = new tu2(new c0(27));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static pu a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i, int i2) {
        long j45 = (i & 1) != 0 ? ku.z : j;
        return new pu(j45, (i & 2) != 0 ? ku.j : j2, (i & 4) != 0 ? ku.A : j3, (i & 8) != 0 ? ku.k : j4, (i & 16) != 0 ? ku.e : j5, (i & 32) != 0 ? ku.E : j6, (i & 64) != 0 ? ku.n : j7, (i & 128) != 0 ? ku.F : j8, (i & 256) != 0 ? ku.o : j9, (i & AIChatConfig.DefaultMaxTokens) != 0 ? ku.R : j10, (i & 1024) != 0 ? ku.t : j11, (i & 2048) != 0 ? ku.S : j12, (i & 4096) != 0 ? ku.u : j13, (i & 8192) != 0 ? ku.a : j14, (i & 16384) != 0 ? ku.g : j15, (i & AIChatConfig.MaxOutputTokens) != 0 ? ku.I : j16, (65536 & i) != 0 ? ku.r : j17, (131072 & i) != 0 ? ku.Q : j18, (262144 & i) != 0 ? ku.s : j19, (524288 & i) != 0 ? j45 : j20, (1048576 & i) != 0 ? ku.f : j21, (2097152 & i) != 0 ? ku.d : j22, ku.b, ku.h, ku.c, ku.i, (67108864 & i) != 0 ? ku.x : j23, (134217728 & i) != 0 ? ku.y : j24, (268435456 & i) != 0 ? ku.D : j25, (536870912 & i) != 0 ? ku.J : j26, (i2 & 8) != 0 ? ku.P : j32, (1073741824 & i) != 0 ? ku.K : j27, (i & Integer.MIN_VALUE) != 0 ? ku.L : j28, (i2 & 1) != 0 ? ku.M : j29, (i2 & 2) != 0 ? ku.N : j30, (i2 & 4) != 0 ? ku.O : j31, (i2 & 16) != 0 ? ku.B : j33, (i2 & 32) != 0 ? ku.C : j34, (i2 & 64) != 0 ? ku.l : j35, (i2 & 128) != 0 ? ku.m : j36, (i2 & 256) != 0 ? ku.G : j37, (i2 & AIChatConfig.DefaultMaxTokens) != 0 ? ku.H : j38, (i2 & 1024) != 0 ? ku.p : j39, (i2 & 2048) != 0 ? ku.q : j40, (i2 & 4096) != 0 ? ku.T : j41, (i2 & 8192) != 0 ? ku.U : j42, (i2 & 16384) != 0 ? ku.v : j43, (i2 & AIChatConfig.MaxOutputTokens) != 0 ? ku.w : j44);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long b(qu quVar, px pxVar) {
        pu puVar = (pu) ((go0) pxVar).j(a);
        switch (quVar.ordinal()) {
            case 0:
                return puVar.n;
            case 1:
                return puVar.w;
            case 2:
                return puVar.y;
            case 3:
                return puVar.v;
            case 4:
                return puVar.e;
            case 5:
                return puVar.u;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return puVar.o;
            case 7:
                return puVar.x;
            case 8:
                return puVar.z;
            case 9:
                return puVar.b;
            case 10:
                return puVar.d;
            case 11:
                return puVar.M;
            case 12:
                return puVar.N;
            case 13:
                return puVar.g;
            case 14:
                return puVar.i;
            case 15:
                return puVar.Q;
            case 16:
                return puVar.R;
            case 17:
                return puVar.q;
            case 18:
                return puVar.s;
            case 19:
                return puVar.k;
            case AIChatConfig.MaxContextRounds /* 20 */:
                return puVar.m;
            case 21:
                return puVar.U;
            case 22:
                return puVar.V;
            case 23:
                return puVar.A;
            case 24:
                return puVar.B;
            case 25:
                return puVar.a;
            case 26:
                return puVar.c;
            case 27:
                return puVar.K;
            case 28:
                return puVar.L;
            case 29:
                return puVar.C;
            case 30:
                return puVar.f;
            case 31:
                return puVar.h;
            case 32:
                return puVar.O;
            case 33:
                return puVar.P;
            case 34:
                return puVar.p;
            case 35:
                return puVar.D;
            case 36:
                return puVar.F;
            case 37:
                return puVar.G;
            case 38:
                return puVar.H;
            case 39:
                return puVar.I;
            case 40:
                return puVar.J;
            case 41:
                return puVar.E;
            case 42:
                return puVar.t;
            case 43:
                return puVar.r;
            case 44:
                return puVar.j;
            case 45:
                return puVar.l;
            case 46:
                return puVar.S;
            case 47:
                return puVar.T;
            default:
                c80.s();
                return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static pu c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i, int i2) {
        long j45 = (i & 1) != 0 ? mu.z : j;
        return new pu(j45, (i & 2) != 0 ? mu.j : j2, (i & 4) != 0 ? mu.A : j3, (i & 8) != 0 ? mu.k : j4, (i & 16) != 0 ? mu.e : j5, (i & 32) != 0 ? mu.E : j6, (i & 64) != 0 ? mu.n : j7, (i & 128) != 0 ? mu.F : j8, (i & 256) != 0 ? mu.o : j9, (i & AIChatConfig.DefaultMaxTokens) != 0 ? mu.R : j10, (i & 1024) != 0 ? mu.t : j11, (i & 2048) != 0 ? mu.S : j12, (i & 4096) != 0 ? mu.u : j13, (i & 8192) != 0 ? mu.a : j14, (i & 16384) != 0 ? mu.g : j15, (i & AIChatConfig.MaxOutputTokens) != 0 ? mu.I : j16, (65536 & i) != 0 ? mu.r : j17, (131072 & i) != 0 ? mu.Q : j18, (262144 & i) != 0 ? mu.s : j19, (524288 & i) != 0 ? j45 : j20, (1048576 & i) != 0 ? mu.f : j21, (2097152 & i) != 0 ? mu.d : j22, mu.b, mu.h, mu.c, mu.i, (67108864 & i) != 0 ? mu.x : j23, (134217728 & i) != 0 ? mu.y : j24, (268435456 & i) != 0 ? mu.D : j25, (536870912 & i) != 0 ? mu.J : j26, (i2 & 8) != 0 ? mu.P : j32, (1073741824 & i) != 0 ? mu.K : j27, (i & Integer.MIN_VALUE) != 0 ? mu.L : j28, (i2 & 1) != 0 ? mu.M : j29, (i2 & 2) != 0 ? mu.N : j30, (i2 & 4) != 0 ? mu.O : j31, (i2 & 16) != 0 ? mu.B : j33, (i2 & 32) != 0 ? mu.C : j34, (i2 & 64) != 0 ? mu.l : j35, (i2 & 128) != 0 ? mu.m : j36, (i2 & 256) != 0 ? mu.G : j37, (i2 & AIChatConfig.DefaultMaxTokens) != 0 ? mu.H : j38, (i2 & 1024) != 0 ? mu.p : j39, (i2 & 2048) != 0 ? mu.q : j40, (i2 & 4096) != 0 ? mu.T : j41, (i2 & 8192) != 0 ? mu.U : j42, (i2 & 16384) != 0 ? mu.v : j43, (i2 & AIChatConfig.MaxOutputTokens) != 0 ? mu.w : j44);
    }
}
