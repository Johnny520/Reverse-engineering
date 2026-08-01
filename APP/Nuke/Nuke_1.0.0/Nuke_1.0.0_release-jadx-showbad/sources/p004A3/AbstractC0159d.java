package p004A3;

import android.R;
import android.content.Context;
import android.os.Build;
import p000A.C0004C;
import p047I0.AbstractC0691Q;
import p056K2.C0891q;
import p076P.AbstractC1061G;
import p076P.AbstractC1072S;
import p076P.AbstractC1105r;
import p076P.C1091f0;
import p076P.C1104q;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p216p.AbstractC2856m;

/* JADX INFO: renamed from: A3.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0159d {

    /* JADX INFO: renamed from: a */
    public static final C1104q f585a = AbstractC1105r.m2153a(AbstractC0156a.f555a, 0, 0, 0, 0, AbstractC0156a.f556b, 0, 0, 0, AbstractC0156a.f557c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 65535);

    /* JADX INFO: renamed from: b */
    public static final C1104q f586b = AbstractC1105r.m2156d(AbstractC0156a.f558d, 0, 0, 0, 0, AbstractC0156a.f559e, 0, 0, 0, AbstractC0156a.f560f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 65535);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m228a(boolean z5, boolean z6, C1843e c1843e, InterfaceC1373m interfaceC1373m, final int i5, final int i6) {
        boolean zM5056j;
        int i7;
        final C1843e c1843e2;
        final boolean z7;
        final boolean z8;
        C1388t0 c1388t0M2599r;
        boolean z9;
        C1104q c1104qM2156d;
        int i8;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1525564774);
        if ((i6 & 1) == 0) {
            zM5056j = z5;
            int i9 = c1383r.m2584g(zM5056j) ? 4 : 2;
            i7 = i5 | i9 | 48;
            if (c1383r.m2560O(i7 & 1, (i7 & 147) == 146)) {
                c1843e2 = c1843e;
                c1383r.m2563R();
                z7 = z6;
                z8 = zM5056j;
            } else {
                c1383r.m2565T();
                if ((i5 & 1) == 0 || c1383r.m2606y()) {
                    if ((i6 & 1) != 0) {
                        zM5056j = AbstractC2856m.m5056j(c1383r);
                    }
                    z9 = true;
                } else {
                    c1383r.m2563R();
                    z9 = z6;
                }
                boolean z10 = zM5056j;
                c1383r.m2598q();
                if (z9 && (i8 = Build.VERSION.SDK_INT) >= 31) {
                    c1383r.m2568W(-1243452543);
                    Context context = (Context) c1383r.m2590j(AbstractC0691Q.f2211b);
                    if (z10) {
                        if (i8 >= 34) {
                            c1104qM2156d = AbstractC1105r.m2153a(AbstractC1072S.m2136f(context, R.color.system_primary_dark), AbstractC1072S.m2136f(context, R.color.system_on_primary_dark), AbstractC1072S.m2136f(context, R.color.system_primary_container_dark), AbstractC1072S.m2136f(context, R.color.system_on_primary_container_dark), AbstractC1072S.m2136f(context, R.color.system_primary_light), AbstractC1072S.m2136f(context, R.color.system_secondary_dark), AbstractC1072S.m2136f(context, R.color.system_on_secondary_dark), AbstractC1072S.m2136f(context, R.color.system_secondary_container_dark), AbstractC1072S.m2136f(context, R.color.system_on_secondary_container_dark), AbstractC1072S.m2136f(context, R.color.system_tertiary_dark), AbstractC1072S.m2136f(context, R.color.system_on_tertiary_dark), AbstractC1072S.m2136f(context, R.color.system_tertiary_container_dark), AbstractC1072S.m2136f(context, R.color.system_on_tertiary_container_dark), AbstractC1072S.m2136f(context, R.color.system_background_dark), AbstractC1072S.m2136f(context, R.color.system_on_background_dark), AbstractC1072S.m2136f(context, R.color.system_surface_dark), AbstractC1072S.m2136f(context, R.color.system_on_surface_dark), AbstractC1072S.m2136f(context, R.color.system_surface_variant_dark), AbstractC1072S.m2136f(context, R.color.system_on_surface_variant_dark), AbstractC1072S.m2136f(context, R.color.system_primary_dark), AbstractC1072S.m2136f(context, R.color.system_surface_light), AbstractC1072S.m2136f(context, R.color.system_on_surface_light), AbstractC1072S.m2136f(context, R.color.system_outline_dark), AbstractC1072S.m2136f(context, R.color.system_outline_variant_dark), 0L, AbstractC1072S.m2136f(context, R.color.system_surface_bright_dark), AbstractC1072S.m2136f(context, R.color.system_surface_container_dark), AbstractC1072S.m2136f(context, R.color.system_surface_container_high_dark), AbstractC1072S.m2136f(context, R.color.system_surface_container_highest_dark), AbstractC1072S.m2136f(context, R.color.system_surface_container_low_dark), AbstractC1072S.m2136f(context, R.color.system_surface_container_lowest_dark), AbstractC1072S.m2136f(context, R.color.system_surface_dim_dark), AbstractC1072S.m2136f(context, R.color.system_primary_fixed), AbstractC1072S.m2136f(context, R.color.system_primary_fixed_dim), AbstractC1072S.m2136f(context, R.color.system_on_primary_fixed), AbstractC1072S.m2136f(context, R.color.system_on_primary_fixed_variant), AbstractC1072S.m2136f(context, R.color.system_secondary_fixed), AbstractC1072S.m2136f(context, R.color.system_secondary_fixed_dim), AbstractC1072S.m2136f(context, R.color.system_on_secondary_fixed), AbstractC1072S.m2136f(context, R.color.system_on_secondary_fixed_variant), AbstractC1072S.m2136f(context, R.color.system_tertiary_fixed), AbstractC1072S.m2136f(context, R.color.system_tertiary_fixed_dim), AbstractC1072S.m2136f(context, R.color.system_on_tertiary_fixed), AbstractC1072S.m2136f(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                        } else {
                            C1091f0 c1091f0M2135e = AbstractC1072S.m2135e(context);
                            long j5 = c1091f0M2135e.f3472x;
                            long j6 = c1091f0M2135e.f3433A;
                            long j7 = c1091f0M2135e.f3474z;
                            long j8 = c1091f0M2135e.f3471w;
                            long j9 = c1091f0M2135e.f3473y;
                            long j10 = c1091f0M2135e.f3437E;
                            long j11 = c1091f0M2135e.f3440H;
                            long j12 = c1091f0M2135e.f3439G;
                            long j13 = c1091f0M2135e.f3436D;
                            long j14 = c1091f0M2135e.f3444L;
                            long j15 = c1091f0M2135e.f3447O;
                            long j16 = c1091f0M2135e.f3446N;
                            long j17 = c1091f0M2135e.f3443K;
                            long j18 = c1091f0M2135e.f3467s;
                            long j19 = c1091f0M2135e.f3455g;
                            long j20 = c1091f0M2135e.f3460l;
                            c1104qM2156d = AbstractC1105r.m2153a(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j18, j19, j20, c1091f0M2135e.f3457i, j5, j19, c1091f0M2135e.f3463o, c1091f0M2135e.f3458j, j20, c1091f0M2135e.f3469u, c1091f0M2135e.f3461m, c1091f0M2135e.f3465q, c1091f0M2135e.f3464p, c1091f0M2135e.f3462n, c1091f0M2135e.f3466r, c1091f0M2135e.f3468t, j18, j8, j5, c1091f0M2135e.f3434B, j7, j13, j10, c1091f0M2135e.f3441I, j12, j17, j14, c1091f0M2135e.f3448P, j16, 62914560, 0);
                        }
                    } else if (i8 >= 34) {
                        c1104qM2156d = AbstractC1105r.m2156d(AbstractC1072S.m2136f(context, R.color.system_primary_light), AbstractC1072S.m2136f(context, R.color.system_on_primary_light), AbstractC1072S.m2136f(context, R.color.system_primary_container_light), AbstractC1072S.m2136f(context, R.color.system_on_primary_container_light), AbstractC1072S.m2136f(context, R.color.system_primary_dark), AbstractC1072S.m2136f(context, R.color.system_secondary_light), AbstractC1072S.m2136f(context, R.color.system_on_secondary_light), AbstractC1072S.m2136f(context, R.color.system_secondary_container_light), AbstractC1072S.m2136f(context, R.color.system_on_secondary_container_light), AbstractC1072S.m2136f(context, R.color.system_tertiary_light), AbstractC1072S.m2136f(context, R.color.system_on_tertiary_light), AbstractC1072S.m2136f(context, R.color.system_tertiary_container_light), AbstractC1072S.m2136f(context, R.color.system_on_tertiary_container_light), AbstractC1072S.m2136f(context, R.color.system_background_light), AbstractC1072S.m2136f(context, R.color.system_on_background_light), AbstractC1072S.m2136f(context, R.color.system_surface_light), AbstractC1072S.m2136f(context, R.color.system_on_surface_light), AbstractC1072S.m2136f(context, R.color.system_surface_variant_light), AbstractC1072S.m2136f(context, R.color.system_on_surface_variant_light), AbstractC1072S.m2136f(context, R.color.system_primary_light), AbstractC1072S.m2136f(context, R.color.system_surface_dark), AbstractC1072S.m2136f(context, R.color.system_on_surface_dark), AbstractC1072S.m2136f(context, R.color.system_outline_light), AbstractC1072S.m2136f(context, R.color.system_outline_variant_light), 0L, AbstractC1072S.m2136f(context, R.color.system_surface_bright_light), AbstractC1072S.m2136f(context, R.color.system_surface_container_light), AbstractC1072S.m2136f(context, R.color.system_surface_container_high_light), AbstractC1072S.m2136f(context, R.color.system_surface_container_highest_light), AbstractC1072S.m2136f(context, R.color.system_surface_container_low_light), AbstractC1072S.m2136f(context, R.color.system_surface_container_lowest_light), AbstractC1072S.m2136f(context, R.color.system_surface_dim_light), AbstractC1072S.m2136f(context, R.color.system_primary_fixed), AbstractC1072S.m2136f(context, R.color.system_primary_fixed_dim), AbstractC1072S.m2136f(context, R.color.system_on_primary_fixed), AbstractC1072S.m2136f(context, R.color.system_on_primary_fixed_variant), AbstractC1072S.m2136f(context, R.color.system_secondary_fixed), AbstractC1072S.m2136f(context, R.color.system_secondary_fixed_dim), AbstractC1072S.m2136f(context, R.color.system_on_secondary_fixed), AbstractC1072S.m2136f(context, R.color.system_on_secondary_fixed_variant), AbstractC1072S.m2136f(context, R.color.system_tertiary_fixed), AbstractC1072S.m2136f(context, R.color.system_tertiary_fixed_dim), AbstractC1072S.m2136f(context, R.color.system_on_tertiary_fixed), AbstractC1072S.m2136f(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                    } else {
                        C1091f0 c1091f0M2135e2 = AbstractC1072S.m2135e(context);
                        long j21 = c1091f0M2135e2.f3473y;
                        long j22 = c1091f0M2135e2.f3470v;
                        long j23 = c1091f0M2135e2.f3471w;
                        long j24 = c1091f0M2135e2.f3434B;
                        long j25 = c1091f0M2135e2.f3472x;
                        long j26 = c1091f0M2135e2.f3438F;
                        long j27 = c1091f0M2135e2.f3435C;
                        long j28 = c1091f0M2135e2.f3436D;
                        long j29 = c1091f0M2135e2.f3441I;
                        long j30 = c1091f0M2135e2.f3445M;
                        long j31 = c1091f0M2135e2.f3442J;
                        long j32 = c1091f0M2135e2.f3443K;
                        long j33 = c1091f0M2135e2.f3448P;
                        long j34 = c1091f0M2135e2.f3450b;
                        long j35 = c1091f0M2135e2.f3466r;
                        long j36 = c1091f0M2135e2.f3455g;
                        c1104qM2156d = AbstractC1105r.m2156d(j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j34, j35, j36, c1091f0M2135e2.f3460l, j21, c1091f0M2135e2.f3463o, c1091f0M2135e2.f3452d, c1091f0M2135e2.f3459k, c1091f0M2135e2.f3457i, c1091f0M2135e2.f3469u, j34, c1091f0M2135e2.f3453e, c1091f0M2135e2.f3454f, j36, c1091f0M2135e2.f3451c, c1091f0M2135e2.f3449a, c1091f0M2135e2.f3456h, j23, j25, j24, c1091f0M2135e2.f3474z, j28, c1091f0M2135e2.f3437E, j29, c1091f0M2135e2.f3439G, j32, c1091f0M2135e2.f3444L, j33, c1091f0M2135e2.f3446N, 62914560, 0);
                    }
                    c1383r.m2597p(false);
                } else if (z10) {
                    c1383r.m2568W(1483914837);
                    c1383r.m2597p(false);
                    c1104qM2156d = f585a;
                } else {
                    c1383r.m2568W(1483915862);
                    c1383r.m2597p(false);
                    c1104qM2156d = f586b;
                }
                c1843e2 = c1843e;
                AbstractC1061G.m2127b(c1104qM2156d, null, AbstractC0160e.f587a, AbstractC1848j.m3314c(2119928338, new C0004C(z10, c1843e2), c1383r), c1383r, 3456);
                z8 = z10;
                z7 = z9;
            }
            c1388t0M2599r = c1383r.m2599r();
            if (c1388t0M2599r == null) {
                c1388t0M2599r.f4928d = new InterfaceC1603e(z8, z7, c1843e2, i5, i6) { // from class: A3.c

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ boolean f581d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ boolean f582e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ C1843e f583f;

                    /* JADX INFO: renamed from: g */
                    public final /* synthetic */ int f584g;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f584g = i6;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p112W2.InterfaceC1603e
                    /* JADX INFO: renamed from: g */
                    public final Object mo0g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM2609A = AbstractC1385s.m2609A(385);
                        AbstractC0159d.m228a(this.f581d, this.f582e, this.f583f, (InterfaceC1373m) obj, iM2609A, this.f584g);
                        return C0891q.f2780a;
                    }
                };
                return;
            }
            return;
        }
        zM5056j = z5;
        i7 = i5 | i9 | 48;
        if (c1383r.m2560O(i7 & 1, (i7 & 147) == 146)) {
        }
        c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r == null) {
        }
    }
}
