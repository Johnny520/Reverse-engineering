package p264s0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0552o0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import p010a9.InterfaceC0173a;
import p121i3.C3179i;
import p215oc.C5729x;
import p265s1.AbstractC7138s1;
import p265s1.C7128q1;
import p317w0.C9012k;
import p317w0.C9014l;
import p317w0.EnumC9016m;

/* JADX INFO: renamed from: s0.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6801k1 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0506h3 f21799a = AbstractC0552o0.m1980h(new InterfaceC0173a() { // from class: s0.i1
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC6801k1.m26979b();
        }
    });

    /* JADX INFO: renamed from: b */
    public static final AbstractC0506h3 f21800b = AbstractC0552o0.m1980h(new InterfaceC0173a() { // from class: s0.j1
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return Boolean.valueOf(AbstractC6801k1.m26978a());
        }
    });

    /* JADX INFO: renamed from: s0.k1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21801a;

        static {
            int[] iArr = new int[EnumC9016m.values().length];
            try {
                iArr[EnumC9016m.f30377q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9016m.f30378r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9016m.f30379s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC9016m.f30380t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC9016m.f30381u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC9016m.f30382v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC9016m.f30383w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC9016m.f30384x.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC9016m.f30385y.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC9016m.f30386z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC9016m.f30337A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC9016m.f30340D.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC9016m.f30341E.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC9016m.f30344H.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC9016m.f30345I.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC9016m.f30369g0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC9016m.f30346J.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC9016m.f30347K.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC9016m.f30350N.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC9016m.f30351O.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC9016m.f30352P.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC9016m.f30353Q.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC9016m.f30356T.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC9016m.f30357U.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC9016m.f30358V.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC9016m.f30361Y.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[EnumC9016m.f30370h0.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[EnumC9016m.f30362Z.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[EnumC9016m.f30363a0.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[EnumC9016m.f30364b0.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[EnumC9016m.f30365c0.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[EnumC9016m.f30366d0.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[EnumC9016m.f30367e0.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[EnumC9016m.f30368f0.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[EnumC9016m.f30371i0.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[EnumC9016m.f30372j0.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[EnumC9016m.f30354R.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[EnumC9016m.f30355S.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[EnumC9016m.f30338B.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[EnumC9016m.f30339C.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[EnumC9016m.f30359W.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[EnumC9016m.f30360X.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[EnumC9016m.f30342F.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[EnumC9016m.f30343G.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[EnumC9016m.f30373k0.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[EnumC9016m.f30374l0.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[EnumC9016m.f30348L.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[EnumC9016m.f30349M.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            f21801a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m26978a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static C6753h1 m26979b() {
        return m26989l(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    /* JADX INFO: renamed from: c */
    public static final long m26980c(C6753h1 c6753h1, long j10, float f10, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1610977682, i10, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1539)");
        }
        boolean zBooleanValue = ((Boolean) interfaceC0572r.mo2142A(f21800b)).booleanValue();
        if (C7128q1.m28131q(j10, c6753h1.m26756V()) && zBooleanValue) {
            j10 = m26990m(c6753h1, f10);
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return j10;
    }

    /* JADX INFO: renamed from: d */
    public static final long m26981d(C6753h1 c6753h1, long j10) {
        return C7128q1.m28131q(j10, c6753h1.m26747M()) ? c6753h1.m26805w() : C7128q1.m28131q(j10, c6753h1.m26752R()) ? c6753h1.m26735A() : C7128q1.m28131q(j10, c6753h1.m26772f0()) ? c6753h1.m26741G() : C7128q1.m28131q(j10, c6753h1.m26761a()) ? c6753h1.m26799t() : C7128q1.m28131q(j10, c6753h1.m26789o()) ? c6753h1.m26801u() : C7128q1.m28131q(j10, c6753h1.m26748N()) ? c6753h1.m26806x() : C7128q1.m28131q(j10, c6753h1.m26753S()) ? c6753h1.m26736B() : C7128q1.m28131q(j10, c6753h1.m26774g0()) ? c6753h1.m26742H() : C7128q1.m28131q(j10, c6753h1.m26791p()) ? c6753h1.m26803v() : C7128q1.m28131q(j10, c6753h1.m26797s()) ? c6753h1.m26793q() : C7128q1.m28131q(j10, c6753h1.m26756V()) ? c6753h1.m26739E() : C7128q1.m28131q(j10, c6753h1.m26770e0()) ? c6753h1.m26740F() : C7128q1.m28131q(j10, c6753h1.m26757W()) ? c6753h1.m26739E() : C7128q1.m28131q(j10, c6753h1.m26758X()) ? c6753h1.m26739E() : C7128q1.m28131q(j10, c6753h1.m26759Y()) ? c6753h1.m26739E() : C7128q1.m28131q(j10, c6753h1.m26760Z()) ? c6753h1.m26739E() : C7128q1.m28131q(j10, c6753h1.m26762a0()) ? c6753h1.m26739E() : C7128q1.m28131q(j10, c6753h1.m26764b0()) ? c6753h1.m26739E() : C7128q1.m28131q(j10, c6753h1.m26766c0()) ? c6753h1.m26739E() : C7128q1.m28131q(j10, c6753h1.m26749O()) ? c6753h1.m26807y() : C7128q1.m28131q(j10, c6753h1.m26750P()) ? c6753h1.m26807y() : C7128q1.m28131q(j10, c6753h1.m26754T()) ? c6753h1.m26737C() : C7128q1.m28131q(j10, c6753h1.m26755U()) ? c6753h1.m26737C() : C7128q1.m28131q(j10, c6753h1.m26776h0()) ? c6753h1.m26743I() : C7128q1.m28131q(j10, c6753h1.m26778i0()) ? c6753h1.m26743I() : C7128q1.f23644b.m28147h();
    }

    /* JADX INFO: renamed from: e */
    public static final long m26982e(long j10, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(509589638, i10, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1112)");
        }
        interfaceC0572r.mo2163V(89374938);
        long jM26981d = m26981d(C6977v5.f22996a.m27579a(interfaceC0572r, 6), j10);
        if (jM26981d == 16) {
            jM26981d = ((C7128q1) interfaceC0572r.mo2142A(AbstractC6865o1.m27265a())).m28139y();
        }
        interfaceC0572r.mo2152K();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return jM26981d;
    }

    /* JADX INFO: renamed from: f */
    public static final C6753h1 m26983f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57) {
        return new C6753h1(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C6753h1 m26984g(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, int i10, int i11, Object obj) {
        long jM34643z = (i10 & 1) != 0 ? C9012k.f30210a.m34643z() : j10;
        long jM34627j = (i10 & 2) != 0 ? C9012k.f30210a.m34627j() : j11;
        long jM34597A = (i10 & 4) != 0 ? C9012k.f30210a.m34597A() : j12;
        long jM34628k = (i10 & 8) != 0 ? C9012k.f30210a.m34628k() : j13;
        long jM34622e = (i10 & 16) != 0 ? C9012k.f30210a.m34622e() : j14;
        long jM34601E = (i10 & 32) != 0 ? C9012k.f30210a.m34601E() : j15;
        long jM34631n = (i10 & 64) != 0 ? C9012k.f30210a.m34631n() : j16;
        long j58 = jM34643z;
        long jM34602F = (i10 & 128) != 0 ? C9012k.f30210a.m34602F() : j17;
        long jM34632o = (i10 & 256) != 0 ? C9012k.f30210a.m34632o() : j18;
        long jM34614R = (i10 & 512) != 0 ? C9012k.f30210a.m34614R() : j19;
        long jM34637t = (i10 & 1024) != 0 ? C9012k.f30210a.m34637t() : j20;
        long jM34615S = (i10 & 2048) != 0 ? C9012k.f30210a.m34615S() : j21;
        long jM34638u = (i10 & 4096) != 0 ? C9012k.f30210a.m34638u() : j22;
        long jM34618a = (i10 & 8192) != 0 ? C9012k.f30210a.m34618a() : j23;
        long jM34624g = (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? C9012k.f30210a.m34624g() : j24;
        long jM34605I = (i10 & 32768) != 0 ? C9012k.f30210a.m34605I() : j25;
        long jM34635r = (i10 & 65536) != 0 ? C9012k.f30210a.m34635r() : j26;
        long jM34613Q = (i10 & 131072) != 0 ? C9012k.f30210a.m34613Q() : j27;
        long jM34636s = (i10 & 262144) != 0 ? C9012k.f30210a.m34636s() : j28;
        long j59 = (i10 & 524288) != 0 ? j58 : j29;
        long jM34623f = (i10 & 1048576) != 0 ? C9012k.f30210a.m34623f() : j30;
        long jM34621d = (i10 & 2097152) != 0 ? C9012k.f30210a.m34621d() : j31;
        long jM34619b = (i10 & 4194304) != 0 ? C9012k.f30210a.m34619b() : j32;
        long jM34625h = (i10 & 8388608) != 0 ? C9012k.f30210a.m34625h() : j33;
        long jM34620c = (i10 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? C9012k.f30210a.m34620c() : j34;
        long jM34626i = (i10 & 33554432) != 0 ? C9012k.f30210a.m34626i() : j35;
        long jM34641x = (i10 & 67108864) != 0 ? C9012k.f30210a.m34641x() : j36;
        long jM34642y = (i10 & 134217728) != 0 ? C9012k.f30210a.m34642y() : j37;
        long jM34600D = (i10 & 268435456) != 0 ? C9012k.f30210a.m34600D() : j38;
        long jM34606J = (i10 & 536870912) != 0 ? C9012k.f30210a.m34606J() : j39;
        long jM34607K = (i10 & 1073741824) != 0 ? C9012k.f30210a.m34607K() : j40;
        long jM34608L = (i10 & Integer.MIN_VALUE) != 0 ? C9012k.f30210a.m34608L() : j41;
        long jM34609M = (i11 & 1) != 0 ? C9012k.f30210a.m34609M() : j42;
        long jM34610N = (i11 & 2) != 0 ? C9012k.f30210a.m34610N() : j43;
        long jM34611O = (i11 & 4) != 0 ? C9012k.f30210a.m34611O() : j44;
        long jM34612P = (i11 & 8) != 0 ? C9012k.f30210a.m34612P() : j45;
        long jM34598B = (i11 & 16) != 0 ? C9012k.f30210a.m34598B() : j46;
        long jM34599C = (i11 & 32) != 0 ? C9012k.f30210a.m34599C() : j47;
        long jM34629l = (i11 & 64) != 0 ? C9012k.f30210a.m34629l() : j48;
        long jM34630m = (i11 & 128) != 0 ? C9012k.f30210a.m34630m() : j49;
        long jM34603G = (i11 & 256) != 0 ? C9012k.f30210a.m34603G() : j50;
        long jM34604H = (i11 & 512) != 0 ? C9012k.f30210a.m34604H() : j51;
        long jM34633p = (i11 & 1024) != 0 ? C9012k.f30210a.m34633p() : j52;
        long jM34634q = (i11 & 2048) != 0 ? C9012k.f30210a.m34634q() : j53;
        long jM34616T = (i11 & 4096) != 0 ? C9012k.f30210a.m34616T() : j54;
        long jM34617U = (i11 & 8192) != 0 ? C9012k.f30210a.m34617U() : j55;
        long jM34639v = (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? C9012k.f30210a.m34639v() : j56;
        if ((i11 & 32768) != 0) {
            j57 = C9012k.f30210a.m34640w();
        }
        return m26983f(j58, jM34627j, jM34597A, jM34628k, jM34622e, jM34601E, jM34631n, jM34602F, jM34632o, jM34614R, jM34637t, jM34615S, jM34638u, jM34618a, jM34624g, jM34605I, jM34635r, jM34613Q, jM34636s, j59, jM34623f, jM34621d, jM34619b, jM34625h, jM34620c, jM34626i, jM34641x, jM34642y, jM34600D, jM34606J, jM34607K, jM34608L, jM34609M, jM34610N, jM34611O, jM34612P, jM34598B, jM34599C, jM34629l, jM34630m, jM34603G, jM34604H, jM34633p, jM34634q, jM34616T, jM34617U, jM34639v, j57);
    }

    /* JADX INFO: renamed from: h */
    public static final long m26985h(C6753h1 c6753h1, EnumC9016m enumC9016m) {
        switch (a.f21801a[enumC9016m.ordinal()]) {
            case 1:
                return c6753h1.m26761a();
            case 2:
                return c6753h1.m26789o();
            case 3:
                return c6753h1.m26791p();
            case 4:
                return c6753h1.m26793q();
            case 5:
                return c6753h1.m26795r();
            case 6:
                return c6753h1.m26797s();
            case 7:
                return c6753h1.m26799t();
            case 8:
                return c6753h1.m26801u();
            case 9:
                return c6753h1.m26803v();
            case 10:
                return c6753h1.m26805w();
            case Opcodes.FCONST_0 /* 11 */:
                return c6753h1.m26806x();
            case Opcodes.FCONST_1 /* 12 */:
                return c6753h1.m26735A();
            case Opcodes.FCONST_2 /* 13 */:
                return c6753h1.m26736B();
            case Opcodes.DCONST_0 /* 14 */:
                return c6753h1.m26739E();
            case 15:
                return c6753h1.m26740F();
            case 16:
                return c6753h1.m26768d0();
            case Opcodes.SIPUSH /* 17 */:
                return c6753h1.m26741G();
            case Opcodes.LDC /* 18 */:
                return c6753h1.m26742H();
            case 19:
                return c6753h1.m26745K();
            case 20:
                return c6753h1.m26746L();
            case Opcodes.ILOAD /* 21 */:
                return c6753h1.m26747M();
            case Opcodes.LLOAD /* 22 */:
                return c6753h1.m26748N();
            case Opcodes.FLOAD /* 23 */:
                return c6753h1.m26751Q();
            case Opcodes.DLOAD /* 24 */:
                return c6753h1.m26752R();
            case Opcodes.ALOAD /* 25 */:
                return c6753h1.m26753S();
            case 26:
                return c6753h1.m26756V();
            case 27:
                return c6753h1.m26770e0();
            case 28:
                return c6753h1.m26757W();
            case 29:
                return c6753h1.m26758X();
            case 30:
                return c6753h1.m26759Y();
            case 31:
                return c6753h1.m26760Z();
            case 32:
                return c6753h1.m26762a0();
            case 33:
                return c6753h1.m26764b0();
            case 34:
                return c6753h1.m26766c0();
            case 35:
                return c6753h1.m26772f0();
            case 36:
                return c6753h1.m26774g0();
            case 37:
                return c6753h1.m26749O();
            case 38:
                return c6753h1.m26750P();
            case 39:
                return c6753h1.m26807y();
            case 40:
                return c6753h1.m26808z();
            case 41:
                return c6753h1.m26754T();
            case 42:
                return c6753h1.m26755U();
            case 43:
                return c6753h1.m26737C();
            case 44:
                return c6753h1.m26738D();
            case 45:
                return c6753h1.m26776h0();
            case Opcodes.IALOAD /* 46 */:
                return c6753h1.m26778i0();
            case 47:
                return c6753h1.m26743I();
            case 48:
                return c6753h1.m26744J();
            default:
                C5729x.m23182a();
                return 0L;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC0506h3 m26986i() {
        return f21799a;
    }

    /* JADX INFO: renamed from: j */
    public static final long m26987j(EnumC9016m enumC9016m, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-810780884, i10, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1524)");
        }
        long jM26985h = m26985h(C6977v5.f22996a.m27579a(interfaceC0572r, 6), enumC9016m);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return jM26985h;
    }

    /* JADX INFO: renamed from: k */
    public static final C6753h1 m26988k(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57) {
        return new C6753h1(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, null);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C6753h1 m26989l(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, int i10, int i11, Object obj) {
        long jM34692z = (i10 & 1) != 0 ? C9014l.f30274a.m34692z() : j10;
        long jM34676j = (i10 & 2) != 0 ? C9014l.f30274a.m34676j() : j11;
        long jM34646A = (i10 & 4) != 0 ? C9014l.f30274a.m34646A() : j12;
        long jM34677k = (i10 & 8) != 0 ? C9014l.f30274a.m34677k() : j13;
        long jM34671e = (i10 & 16) != 0 ? C9014l.f30274a.m34671e() : j14;
        long jM34650E = (i10 & 32) != 0 ? C9014l.f30274a.m34650E() : j15;
        long jM34680n = (i10 & 64) != 0 ? C9014l.f30274a.m34680n() : j16;
        long j58 = jM34692z;
        long jM34651F = (i10 & 128) != 0 ? C9014l.f30274a.m34651F() : j17;
        long jM34681o = (i10 & 256) != 0 ? C9014l.f30274a.m34681o() : j18;
        long jM34663R = (i10 & 512) != 0 ? C9014l.f30274a.m34663R() : j19;
        long jM34686t = (i10 & 1024) != 0 ? C9014l.f30274a.m34686t() : j20;
        long jM34664S = (i10 & 2048) != 0 ? C9014l.f30274a.m34664S() : j21;
        long jM34687u = (i10 & 4096) != 0 ? C9014l.f30274a.m34687u() : j22;
        long jM34667a = (i10 & 8192) != 0 ? C9014l.f30274a.m34667a() : j23;
        long jM34673g = (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? C9014l.f30274a.m34673g() : j24;
        long jM34654I = (i10 & 32768) != 0 ? C9014l.f30274a.m34654I() : j25;
        long jM34684r = (i10 & 65536) != 0 ? C9014l.f30274a.m34684r() : j26;
        long jM34662Q = (i10 & 131072) != 0 ? C9014l.f30274a.m34662Q() : j27;
        long jM34685s = (i10 & 262144) != 0 ? C9014l.f30274a.m34685s() : j28;
        long j59 = (i10 & 524288) != 0 ? j58 : j29;
        long jM34672f = (i10 & 1048576) != 0 ? C9014l.f30274a.m34672f() : j30;
        long jM34670d = (i10 & 2097152) != 0 ? C9014l.f30274a.m34670d() : j31;
        long jM34668b = (i10 & 4194304) != 0 ? C9014l.f30274a.m34668b() : j32;
        long jM34674h = (i10 & 8388608) != 0 ? C9014l.f30274a.m34674h() : j33;
        long jM34669c = (i10 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? C9014l.f30274a.m34669c() : j34;
        long jM34675i = (i10 & 33554432) != 0 ? C9014l.f30274a.m34675i() : j35;
        long jM34690x = (i10 & 67108864) != 0 ? C9014l.f30274a.m34690x() : j36;
        long jM34691y = (i10 & 134217728) != 0 ? C9014l.f30274a.m34691y() : j37;
        long jM34649D = (i10 & 268435456) != 0 ? C9014l.f30274a.m34649D() : j38;
        long jM34655J = (i10 & 536870912) != 0 ? C9014l.f30274a.m34655J() : j39;
        long jM34656K = (i10 & 1073741824) != 0 ? C9014l.f30274a.m34656K() : j40;
        long jM34657L = (i10 & Integer.MIN_VALUE) != 0 ? C9014l.f30274a.m34657L() : j41;
        long jM34658M = (i11 & 1) != 0 ? C9014l.f30274a.m34658M() : j42;
        long jM34659N = (i11 & 2) != 0 ? C9014l.f30274a.m34659N() : j43;
        long jM34660O = (i11 & 4) != 0 ? C9014l.f30274a.m34660O() : j44;
        long jM34661P = (i11 & 8) != 0 ? C9014l.f30274a.m34661P() : j45;
        long jM34647B = (i11 & 16) != 0 ? C9014l.f30274a.m34647B() : j46;
        long jM34648C = (i11 & 32) != 0 ? C9014l.f30274a.m34648C() : j47;
        long jM34678l = (i11 & 64) != 0 ? C9014l.f30274a.m34678l() : j48;
        long jM34679m = (i11 & 128) != 0 ? C9014l.f30274a.m34679m() : j49;
        long jM34652G = (i11 & 256) != 0 ? C9014l.f30274a.m34652G() : j50;
        long jM34653H = (i11 & 512) != 0 ? C9014l.f30274a.m34653H() : j51;
        long jM34682p = (i11 & 1024) != 0 ? C9014l.f30274a.m34682p() : j52;
        long jM34683q = (i11 & 2048) != 0 ? C9014l.f30274a.m34683q() : j53;
        long jM34665T = (i11 & 4096) != 0 ? C9014l.f30274a.m34665T() : j54;
        long jM34666U = (i11 & 8192) != 0 ? C9014l.f30274a.m34666U() : j55;
        long jM34688v = (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? C9014l.f30274a.m34688v() : j56;
        if ((i11 & 32768) != 0) {
            j57 = C9014l.f30274a.m34689w();
        }
        return m26988k(j58, jM34676j, jM34646A, jM34677k, jM34671e, jM34650E, jM34680n, jM34651F, jM34681o, jM34663R, jM34686t, jM34664S, jM34687u, jM34667a, jM34673g, jM34654I, jM34684r, jM34662Q, jM34685s, j59, jM34672f, jM34670d, jM34668b, jM34674h, jM34669c, jM34675i, jM34690x, jM34691y, jM34649D, jM34655J, jM34656K, jM34657L, jM34658M, jM34659N, jM34660O, jM34661P, jM34647B, jM34648C, jM34678l, jM34679m, jM34652G, jM34653H, jM34682p, jM34683q, jM34665T, jM34666U, jM34688v, j57);
    }

    /* JADX INFO: renamed from: m */
    public static final long m26990m(C6753h1 c6753h1, float f10) {
        if (C3179i.m12005m(f10, C3179i.m12003k(0))) {
            return c6753h1.m26756V();
        }
        return AbstractC7138s1.m28203g(C7128q1.m28129o(c6753h1.m26768d0(), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), c6753h1.m26756V());
    }
}
