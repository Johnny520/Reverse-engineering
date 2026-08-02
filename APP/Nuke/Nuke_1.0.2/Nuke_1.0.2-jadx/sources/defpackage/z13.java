package defpackage;

import android.R;
import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z13 {
    public static final pu a = ru.a(lu.a, 0, 0, 0, 0, lu.b, 0, 0, 0, lu.c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 65535);
    public static final pu b = ru.c(lu.d, 0, 0, 0, 0, lu.e, 0, 0, 0, lu.f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 65535);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(final boolean z, final boolean z2, final ju juVar, kw kwVar, px pxVar, final int i) {
        kw kwVar2;
        pu puVar;
        int i2;
        pu puVarC;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1713285649);
        int i3 = i | (go0Var.g(z) ? 4 : 2) | (go0Var.f(juVar) ? 256 : 128);
        if (go0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            go0Var.T();
            if ((i & 1) != 0 && !go0Var.y()) {
                go0Var.R();
            }
            go0Var.q();
            if (juVar != null) {
                go0Var.W(898860143);
                go0Var.p(false);
                pu puVarA = z ? ru.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535) : ru.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
                long j = juVar.a;
                puVar = new pu(j, puVarA.b, puVarA.c, puVarA.d, puVarA.e, j, puVarA.g, puVarA.h, puVarA.i, j, puVarA.k, puVarA.l, puVarA.m, puVarA.n, puVarA.o, puVarA.p, puVarA.q, puVarA.r, puVarA.s, puVarA.t, puVarA.u, puVarA.v, puVarA.w, puVarA.x, puVarA.y, puVarA.z, puVarA.A, puVarA.B, puVarA.C, puVarA.D, puVarA.E, puVarA.F, puVarA.G, puVarA.H, puVarA.I, puVarA.J, puVarA.K, puVarA.L, puVarA.M, puVarA.N, puVarA.O, puVarA.P, puVarA.Q, puVarA.R, puVarA.S, puVarA.T, puVarA.U, puVarA.V);
            } else if (z2 && (i2 = Build.VERSION.SDK_INT) >= 31) {
                go0Var.W(899190200);
                Context context = (Context) go0Var.j(r7.b);
                if (z) {
                    if (i2 >= 34) {
                        puVarC = ru.a(up0.u(context, R.color.system_primary_dark), up0.u(context, R.color.system_on_primary_dark), up0.u(context, R.color.system_primary_container_dark), up0.u(context, R.color.system_on_primary_container_dark), up0.u(context, R.color.system_primary_light), up0.u(context, R.color.system_secondary_dark), up0.u(context, R.color.system_on_secondary_dark), up0.u(context, R.color.system_secondary_container_dark), up0.u(context, R.color.system_on_secondary_container_dark), up0.u(context, R.color.system_tertiary_dark), up0.u(context, R.color.system_on_tertiary_dark), up0.u(context, R.color.system_tertiary_container_dark), up0.u(context, R.color.system_on_tertiary_container_dark), up0.u(context, R.color.system_background_dark), up0.u(context, R.color.system_on_background_dark), up0.u(context, R.color.system_surface_dark), up0.u(context, R.color.system_on_surface_dark), up0.u(context, R.color.system_surface_variant_dark), up0.u(context, R.color.system_on_surface_variant_dark), up0.u(context, R.color.system_primary_dark), up0.u(context, R.color.system_surface_light), up0.u(context, R.color.system_on_surface_light), up0.u(context, R.color.system_outline_dark), up0.u(context, R.color.system_outline_variant_dark), 0L, up0.u(context, R.color.system_surface_bright_dark), up0.u(context, R.color.system_surface_container_dark), up0.u(context, R.color.system_surface_container_high_dark), up0.u(context, R.color.system_surface_container_highest_dark), up0.u(context, R.color.system_surface_container_low_dark), up0.u(context, R.color.system_surface_container_lowest_dark), up0.u(context, R.color.system_surface_dim_dark), up0.u(context, R.color.system_primary_fixed), up0.u(context, R.color.system_primary_fixed_dim), up0.u(context, R.color.system_on_primary_fixed), up0.u(context, R.color.system_on_primary_fixed_variant), up0.u(context, R.color.system_secondary_fixed), up0.u(context, R.color.system_secondary_fixed_dim), up0.u(context, R.color.system_on_secondary_fixed), up0.u(context, R.color.system_on_secondary_fixed_variant), up0.u(context, R.color.system_tertiary_fixed), up0.u(context, R.color.system_tertiary_fixed_dim), up0.u(context, R.color.system_on_tertiary_fixed), up0.u(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                    } else {
                        v23 v23VarZ = rp0.Z(context);
                        long j2 = v23VarZ.x;
                        long j3 = v23VarZ.A;
                        long j4 = v23VarZ.z;
                        long j5 = v23VarZ.w;
                        long j6 = v23VarZ.y;
                        long j7 = v23VarZ.E;
                        long j8 = v23VarZ.H;
                        long j9 = v23VarZ.G;
                        long j10 = v23VarZ.D;
                        long j11 = v23VarZ.L;
                        long j12 = v23VarZ.O;
                        long j13 = v23VarZ.N;
                        long j14 = v23VarZ.K;
                        long j15 = v23VarZ.s;
                        long j16 = v23VarZ.g;
                        long j17 = v23VarZ.l;
                        puVarC = ru.a(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j15, j16, j17, v23VarZ.i, j2, j16, v23VarZ.o, v23VarZ.j, j17, v23VarZ.u, v23VarZ.m, v23VarZ.q, v23VarZ.p, v23VarZ.n, v23VarZ.r, v23VarZ.t, j15, j5, j2, v23VarZ.B, j4, j10, j7, v23VarZ.I, j9, j14, j11, v23VarZ.P, j13, 62914560, 0);
                    }
                } else if (i2 >= 34) {
                    puVarC = ru.c(up0.u(context, R.color.system_primary_light), up0.u(context, R.color.system_on_primary_light), up0.u(context, R.color.system_primary_container_light), up0.u(context, R.color.system_on_primary_container_light), up0.u(context, R.color.system_primary_dark), up0.u(context, R.color.system_secondary_light), up0.u(context, R.color.system_on_secondary_light), up0.u(context, R.color.system_secondary_container_light), up0.u(context, R.color.system_on_secondary_container_light), up0.u(context, R.color.system_tertiary_light), up0.u(context, R.color.system_on_tertiary_light), up0.u(context, R.color.system_tertiary_container_light), up0.u(context, R.color.system_on_tertiary_container_light), up0.u(context, R.color.system_background_light), up0.u(context, R.color.system_on_background_light), up0.u(context, R.color.system_surface_light), up0.u(context, R.color.system_on_surface_light), up0.u(context, R.color.system_surface_variant_light), up0.u(context, R.color.system_on_surface_variant_light), up0.u(context, R.color.system_primary_light), up0.u(context, R.color.system_surface_dark), up0.u(context, R.color.system_on_surface_dark), up0.u(context, R.color.system_outline_light), up0.u(context, R.color.system_outline_variant_light), 0L, up0.u(context, R.color.system_surface_bright_light), up0.u(context, R.color.system_surface_container_light), up0.u(context, R.color.system_surface_container_high_light), up0.u(context, R.color.system_surface_container_highest_light), up0.u(context, R.color.system_surface_container_low_light), up0.u(context, R.color.system_surface_container_lowest_light), up0.u(context, R.color.system_surface_dim_light), up0.u(context, R.color.system_primary_fixed), up0.u(context, R.color.system_primary_fixed_dim), up0.u(context, R.color.system_on_primary_fixed), up0.u(context, R.color.system_on_primary_fixed_variant), up0.u(context, R.color.system_secondary_fixed), up0.u(context, R.color.system_secondary_fixed_dim), up0.u(context, R.color.system_on_secondary_fixed), up0.u(context, R.color.system_on_secondary_fixed_variant), up0.u(context, R.color.system_tertiary_fixed), up0.u(context, R.color.system_tertiary_fixed_dim), up0.u(context, R.color.system_on_tertiary_fixed), up0.u(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                } else {
                    v23 v23VarZ2 = rp0.Z(context);
                    long j18 = v23VarZ2.y;
                    long j19 = v23VarZ2.v;
                    long j20 = v23VarZ2.w;
                    long j21 = v23VarZ2.B;
                    long j22 = v23VarZ2.x;
                    long j23 = v23VarZ2.F;
                    long j24 = v23VarZ2.C;
                    long j25 = v23VarZ2.D;
                    long j26 = v23VarZ2.I;
                    long j27 = v23VarZ2.M;
                    long j28 = v23VarZ2.J;
                    long j29 = v23VarZ2.K;
                    long j30 = v23VarZ2.P;
                    long j31 = v23VarZ2.b;
                    long j32 = v23VarZ2.r;
                    long j33 = v23VarZ2.g;
                    puVarC = ru.c(j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j31, j32, j33, v23VarZ2.l, j18, v23VarZ2.o, v23VarZ2.d, v23VarZ2.k, v23VarZ2.i, v23VarZ2.u, j31, v23VarZ2.e, v23VarZ2.f, j33, v23VarZ2.c, v23VarZ2.a, v23VarZ2.h, j20, j22, j21, v23VarZ2.z, j25, v23VarZ2.E, j26, v23VarZ2.G, j29, v23VarZ2.L, j30, v23VarZ2.N, 62914560, 0);
                }
                puVar = puVarC;
                go0Var.p(false);
            } else if (z) {
                go0Var.W(-1495008962);
                go0Var.p(false);
                puVar = a;
            } else {
                go0Var.W(-1495007937);
                go0Var.p(false);
                puVar = b;
            }
            kwVar2 = kwVar;
            ff1.b(puVar, null, c63.a, xe1.i0(1778084251, new m10(z, kwVar2), go0Var), go0Var, 3072);
        } else {
            kwVar2 = kwVar;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            final kw kwVar3 = kwVar2;
            b62VarR.d = new mn0(z, z2, juVar, kwVar3, i) { // from class: y13
                public final /* synthetic */ boolean h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ ju j;
                public final /* synthetic */ kw k;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(3121);
                    z13.a(this.h, this.i, this.j, this.k, (px) obj, iN);
                    return a83.a;
                }
            };
        }
    }
}
