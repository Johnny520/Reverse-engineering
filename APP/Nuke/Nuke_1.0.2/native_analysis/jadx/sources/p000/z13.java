package p000;

import android.R;
import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z13 {

    /* JADX INFO: renamed from: a */
    public static final C0593pu f13706a = AbstractC0670ru.m4617a(AbstractC0437lu.f6316a, 0, 0, 0, 0, AbstractC0437lu.f6317b, 0, 0, 0, AbstractC0437lu.f6318c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 65535);

    /* JADX INFO: renamed from: b */
    public static final C0593pu f13707b = AbstractC0670ru.m4619c(AbstractC0437lu.f6319d, 0, 0, 0, 0, AbstractC0437lu.f6320e, 0, 0, 0, AbstractC0437lu.f6321f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 65535);

    /* JADX INFO: renamed from: a */
    public static final void m6380a(final boolean z, final boolean z2, final C0363ju c0363ju, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, final int i) {
        C0402kw c0402kw2;
        C0593pu c0593pu;
        int i2;
        C0593pu c0593puM4619c;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1713285649);
        int i3 = i | (go0Var.m1982g(z) ? 4 : 2) | (go0Var.m1980f(c0363ju) ? 256 : 128);
        if (go0Var.m1958O(i3 & 1, (i3 & 1171) != 1170)) {
            go0Var.m1963T();
            if ((i & 1) != 0 && !go0Var.m2003y()) {
                go0Var.m1961R();
            }
            go0Var.m1995q();
            if (c0363ju != null) {
                go0Var.m1966W(898860143);
                go0Var.m1994p(false);
                C0593pu c0593puM4617a = z ? AbstractC0670ru.m4617a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535) : AbstractC0670ru.m4619c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
                long j = c0363ju.f5219a;
                c0593pu = new C0593pu(j, c0593puM4617a.f8588b, c0593puM4617a.f8589c, c0593puM4617a.f8590d, c0593puM4617a.f8591e, j, c0593puM4617a.f8593g, c0593puM4617a.f8594h, c0593puM4617a.f8595i, j, c0593puM4617a.f8597k, c0593puM4617a.f8598l, c0593puM4617a.f8599m, c0593puM4617a.f8600n, c0593puM4617a.f8601o, c0593puM4617a.f8602p, c0593puM4617a.f8603q, c0593puM4617a.f8604r, c0593puM4617a.f8605s, c0593puM4617a.f8606t, c0593puM4617a.f8607u, c0593puM4617a.f8608v, c0593puM4617a.f8609w, c0593puM4617a.f8610x, c0593puM4617a.f8611y, c0593puM4617a.f8612z, c0593puM4617a.f8565A, c0593puM4617a.f8566B, c0593puM4617a.f8567C, c0593puM4617a.f8568D, c0593puM4617a.f8569E, c0593puM4617a.f8570F, c0593puM4617a.f8571G, c0593puM4617a.f8572H, c0593puM4617a.f8573I, c0593puM4617a.f8574J, c0593puM4617a.f8575K, c0593puM4617a.f8576L, c0593puM4617a.f8577M, c0593puM4617a.f8578N, c0593puM4617a.f8579O, c0593puM4617a.f8580P, c0593puM4617a.f8581Q, c0593puM4617a.f8582R, c0593puM4617a.f8583S, c0593puM4617a.f8584T, c0593puM4617a.f8585U, c0593puM4617a.f8586V);
            } else if (z2 && (i2 = Build.VERSION.SDK_INT) >= 31) {
                go0Var.m1966W(899190200);
                Context context = (Context) go0Var.m1988j(AbstractC0646r7.f9411b);
                if (z) {
                    if (i2 >= 34) {
                        c0593puM4619c = AbstractC0670ru.m4617a(up0.m5555u(context, R.color.system_primary_dark), up0.m5555u(context, R.color.system_on_primary_dark), up0.m5555u(context, R.color.system_primary_container_dark), up0.m5555u(context, R.color.system_on_primary_container_dark), up0.m5555u(context, R.color.system_primary_light), up0.m5555u(context, R.color.system_secondary_dark), up0.m5555u(context, R.color.system_on_secondary_dark), up0.m5555u(context, R.color.system_secondary_container_dark), up0.m5555u(context, R.color.system_on_secondary_container_dark), up0.m5555u(context, R.color.system_tertiary_dark), up0.m5555u(context, R.color.system_on_tertiary_dark), up0.m5555u(context, R.color.system_tertiary_container_dark), up0.m5555u(context, R.color.system_on_tertiary_container_dark), up0.m5555u(context, R.color.system_background_dark), up0.m5555u(context, R.color.system_on_background_dark), up0.m5555u(context, R.color.system_surface_dark), up0.m5555u(context, R.color.system_on_surface_dark), up0.m5555u(context, R.color.system_surface_variant_dark), up0.m5555u(context, R.color.system_on_surface_variant_dark), up0.m5555u(context, R.color.system_primary_dark), up0.m5555u(context, R.color.system_surface_light), up0.m5555u(context, R.color.system_on_surface_light), up0.m5555u(context, R.color.system_outline_dark), up0.m5555u(context, R.color.system_outline_variant_dark), 0L, up0.m5555u(context, R.color.system_surface_bright_dark), up0.m5555u(context, R.color.system_surface_container_dark), up0.m5555u(context, R.color.system_surface_container_high_dark), up0.m5555u(context, R.color.system_surface_container_highest_dark), up0.m5555u(context, R.color.system_surface_container_low_dark), up0.m5555u(context, R.color.system_surface_container_lowest_dark), up0.m5555u(context, R.color.system_surface_dim_dark), up0.m5555u(context, R.color.system_primary_fixed), up0.m5555u(context, R.color.system_primary_fixed_dim), up0.m5555u(context, R.color.system_on_primary_fixed), up0.m5555u(context, R.color.system_on_primary_fixed_variant), up0.m5555u(context, R.color.system_secondary_fixed), up0.m5555u(context, R.color.system_secondary_fixed_dim), up0.m5555u(context, R.color.system_on_secondary_fixed), up0.m5555u(context, R.color.system_on_secondary_fixed_variant), up0.m5555u(context, R.color.system_tertiary_fixed), up0.m5555u(context, R.color.system_tertiary_fixed_dim), up0.m5555u(context, R.color.system_on_tertiary_fixed), up0.m5555u(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                    } else {
                        v23 v23VarM4539Z = rp0.m4539Z(context);
                        long j2 = v23VarM4539Z.f11657x;
                        long j3 = v23VarM4539Z.f11618A;
                        long j4 = v23VarM4539Z.f11659z;
                        long j5 = v23VarM4539Z.f11656w;
                        long j6 = v23VarM4539Z.f11658y;
                        long j7 = v23VarM4539Z.f11622E;
                        long j8 = v23VarM4539Z.f11625H;
                        long j9 = v23VarM4539Z.f11624G;
                        long j10 = v23VarM4539Z.f11621D;
                        long j11 = v23VarM4539Z.f11629L;
                        long j12 = v23VarM4539Z.f11632O;
                        long j13 = v23VarM4539Z.f11631N;
                        long j14 = v23VarM4539Z.f11628K;
                        long j15 = v23VarM4539Z.f11652s;
                        long j16 = v23VarM4539Z.f11640g;
                        long j17 = v23VarM4539Z.f11645l;
                        c0593puM4619c = AbstractC0670ru.m4617a(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j15, j16, j17, v23VarM4539Z.f11642i, j2, j16, v23VarM4539Z.f11648o, v23VarM4539Z.f11643j, j17, v23VarM4539Z.f11654u, v23VarM4539Z.f11646m, v23VarM4539Z.f11650q, v23VarM4539Z.f11649p, v23VarM4539Z.f11647n, v23VarM4539Z.f11651r, v23VarM4539Z.f11653t, j15, j5, j2, v23VarM4539Z.f11619B, j4, j10, j7, v23VarM4539Z.f11626I, j9, j14, j11, v23VarM4539Z.f11633P, j13, 62914560, 0);
                    }
                } else if (i2 >= 34) {
                    c0593puM4619c = AbstractC0670ru.m4619c(up0.m5555u(context, R.color.system_primary_light), up0.m5555u(context, R.color.system_on_primary_light), up0.m5555u(context, R.color.system_primary_container_light), up0.m5555u(context, R.color.system_on_primary_container_light), up0.m5555u(context, R.color.system_primary_dark), up0.m5555u(context, R.color.system_secondary_light), up0.m5555u(context, R.color.system_on_secondary_light), up0.m5555u(context, R.color.system_secondary_container_light), up0.m5555u(context, R.color.system_on_secondary_container_light), up0.m5555u(context, R.color.system_tertiary_light), up0.m5555u(context, R.color.system_on_tertiary_light), up0.m5555u(context, R.color.system_tertiary_container_light), up0.m5555u(context, R.color.system_on_tertiary_container_light), up0.m5555u(context, R.color.system_background_light), up0.m5555u(context, R.color.system_on_background_light), up0.m5555u(context, R.color.system_surface_light), up0.m5555u(context, R.color.system_on_surface_light), up0.m5555u(context, R.color.system_surface_variant_light), up0.m5555u(context, R.color.system_on_surface_variant_light), up0.m5555u(context, R.color.system_primary_light), up0.m5555u(context, R.color.system_surface_dark), up0.m5555u(context, R.color.system_on_surface_dark), up0.m5555u(context, R.color.system_outline_light), up0.m5555u(context, R.color.system_outline_variant_light), 0L, up0.m5555u(context, R.color.system_surface_bright_light), up0.m5555u(context, R.color.system_surface_container_light), up0.m5555u(context, R.color.system_surface_container_high_light), up0.m5555u(context, R.color.system_surface_container_highest_light), up0.m5555u(context, R.color.system_surface_container_low_light), up0.m5555u(context, R.color.system_surface_container_lowest_light), up0.m5555u(context, R.color.system_surface_dim_light), up0.m5555u(context, R.color.system_primary_fixed), up0.m5555u(context, R.color.system_primary_fixed_dim), up0.m5555u(context, R.color.system_on_primary_fixed), up0.m5555u(context, R.color.system_on_primary_fixed_variant), up0.m5555u(context, R.color.system_secondary_fixed), up0.m5555u(context, R.color.system_secondary_fixed_dim), up0.m5555u(context, R.color.system_on_secondary_fixed), up0.m5555u(context, R.color.system_on_secondary_fixed_variant), up0.m5555u(context, R.color.system_tertiary_fixed), up0.m5555u(context, R.color.system_tertiary_fixed_dim), up0.m5555u(context, R.color.system_on_tertiary_fixed), up0.m5555u(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                } else {
                    v23 v23VarM4539Z2 = rp0.m4539Z(context);
                    long j18 = v23VarM4539Z2.f11658y;
                    long j19 = v23VarM4539Z2.f11655v;
                    long j20 = v23VarM4539Z2.f11656w;
                    long j21 = v23VarM4539Z2.f11619B;
                    long j22 = v23VarM4539Z2.f11657x;
                    long j23 = v23VarM4539Z2.f11623F;
                    long j24 = v23VarM4539Z2.f11620C;
                    long j25 = v23VarM4539Z2.f11621D;
                    long j26 = v23VarM4539Z2.f11626I;
                    long j27 = v23VarM4539Z2.f11630M;
                    long j28 = v23VarM4539Z2.f11627J;
                    long j29 = v23VarM4539Z2.f11628K;
                    long j30 = v23VarM4539Z2.f11633P;
                    long j31 = v23VarM4539Z2.f11635b;
                    long j32 = v23VarM4539Z2.f11651r;
                    long j33 = v23VarM4539Z2.f11640g;
                    c0593puM4619c = AbstractC0670ru.m4619c(j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j31, j32, j33, v23VarM4539Z2.f11645l, j18, v23VarM4539Z2.f11648o, v23VarM4539Z2.f11637d, v23VarM4539Z2.f11644k, v23VarM4539Z2.f11642i, v23VarM4539Z2.f11654u, j31, v23VarM4539Z2.f11638e, v23VarM4539Z2.f11639f, j33, v23VarM4539Z2.f11636c, v23VarM4539Z2.f11634a, v23VarM4539Z2.f11641h, j20, j22, j21, v23VarM4539Z2.f11659z, j25, v23VarM4539Z2.f11622E, j26, v23VarM4539Z2.f11624G, j29, v23VarM4539Z2.f11629L, j30, v23VarM4539Z2.f11631N, 62914560, 0);
                }
                c0593pu = c0593puM4619c;
                go0Var.m1994p(false);
            } else if (z) {
                go0Var.m1966W(-1495008962);
                go0Var.m1994p(false);
                c0593pu = f13706a;
            } else {
                go0Var.m1966W(-1495007937);
                go0Var.m1994p(false);
                c0593pu = f13707b;
            }
            c0402kw2 = c0402kw;
            ff1.m1608b(c0593pu, null, c63.f1215a, xe1.m6126i0(1778084251, new m10(z, c0402kw2), go0Var), go0Var, 3072);
        } else {
            c0402kw2 = c0402kw;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            final C0402kw c0402kw3 = c0402kw2;
            b62VarM1996r.f616d = new mn0(z, z2, c0363ju, c0402kw3, i) { // from class: y13

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ boolean f13278h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ boolean f13279i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ C0363ju f13280j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ C0402kw f13281k;

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(3121);
                    z13.m6380a(this.f13278h, this.f13279i, this.f13280j, this.f13281k, (InterfaceC0596px) obj, iM3902N);
                    return a83.f116a;
                }
            };
        }
    }
}
