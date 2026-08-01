package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: v0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0823v0 extends AbstractC0747t0 {

    /* JADX INFO: renamed from: e */
    public static C0823v0 f6362e;

    /* JADX INFO: renamed from: f */
    public static final wu0 f6363f = wu0.f7191e;

    /* JADX INFO: renamed from: g */
    public static final wu0 f6364g = wu0.f7190d;

    /* JADX INFO: renamed from: c */
    public g71 f6365c;

    /* JADX INFO: renamed from: d */
    public xz0 f6366d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0747t0
    /* JADX INFO: renamed from: a */
    public final int[] mo4139a(int i) {
        int iM1228b;
        if (m4141c().length() <= 0 || i >= m4141c().length()) {
            return null;
        }
        try {
            xz0 xz0Var = this.f6366d;
            if (xz0Var == null) {
                p30.m2986V("node");
                throw null;
            }
            st0 st0VarM5185g = xz0Var.m5185g();
            int iRound = Math.round(st0VarM5185g.f5835d - st0VarM5185g.f5833b);
            if (i <= 0) {
                i = 0;
            }
            g71 g71Var = this.f6365c;
            if (g71Var == null) {
                p30.m2986V("layoutResult");
                throw null;
            }
            int iM1227a = g71Var.m1227a(i);
            g71 g71Var2 = this.f6365c;
            if (g71Var2 == null) {
                p30.m2986V("layoutResult");
                throw null;
            }
            float fM1230d = g71Var2.m1230d(iM1227a) + iRound;
            g71 g71Var3 = this.f6365c;
            if (g71Var3 == null) {
                p30.m2986V("layoutResult");
                throw null;
            }
            if (g71Var3 == null) {
                p30.m2986V("layoutResult");
                throw null;
            }
            float fM1230d2 = g71Var3.m1230d(g71Var3.f1880b.f4259b - 1);
            g71 g71Var4 = this.f6365c;
            if (fM1230d < fM1230d2) {
                if (g71Var4 == null) {
                    p30.m2986V("layoutResult");
                    throw null;
                }
                iM1228b = g71Var4.m1228b(fM1230d);
            } else {
                if (g71Var4 == null) {
                    p30.m2986V("layoutResult");
                    throw null;
                }
                iM1228b = g71Var4.f1880b.f4259b;
            }
            return m4140b(i, m4363e(iM1228b - 1, f6364g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0747t0
    /* JADX INFO: renamed from: d */
    public final int[] mo4142d(int i) {
        int iM1228b;
        if (m4141c().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            xz0 xz0Var = this.f6366d;
            if (xz0Var == null) {
                p30.m2986V("node");
                throw null;
            }
            st0 st0VarM5185g = xz0Var.m5185g();
            int iRound = Math.round(st0VarM5185g.f5835d - st0VarM5185g.f5833b);
            int length = m4141c().length();
            if (length <= i) {
                i = length;
            }
            g71 g71Var = this.f6365c;
            if (g71Var == null) {
                p30.m2986V("layoutResult");
                throw null;
            }
            int iM1227a = g71Var.m1227a(i);
            g71 g71Var2 = this.f6365c;
            if (g71Var2 == null) {
                p30.m2986V("layoutResult");
                throw null;
            }
            float fM1230d = g71Var2.m1230d(iM1227a) - iRound;
            if (fM1230d > 0.0f) {
                g71 g71Var3 = this.f6365c;
                if (g71Var3 == null) {
                    p30.m2986V("layoutResult");
                    throw null;
                }
                iM1228b = g71Var3.m1228b(fM1230d);
            } else {
                iM1228b = 0;
            }
            if (i == m4141c().length() && iM1228b < iM1227a) {
                iM1228b++;
            }
            return m4140b(m4363e(iM1228b, f6363f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m4363e(int i, wu0 wu0Var) {
        g71 g71Var = this.f6365c;
        if (g71Var == null) {
            p30.m2986V("layoutResult");
            throw null;
        }
        int iM1229c = g71Var.m1229c(i);
        g71 g71Var2 = this.f6365c;
        if (g71Var2 == null) {
            p30.m2986V("layoutResult");
            throw null;
        }
        wu0 wu0VarM1231e = g71Var2.m1231e(iM1229c);
        g71 g71Var3 = this.f6365c;
        if (wu0Var != wu0VarM1231e) {
            if (g71Var3 != null) {
                return g71Var3.m1229c(i);
            }
            p30.m2986V("layoutResult");
            throw null;
        }
        if (g71Var3 == null) {
            p30.m2986V("layoutResult");
            throw null;
        }
        ng0 ng0Var = g71Var3.f1880b;
        ng0Var.m2703b(i);
        ArrayList arrayList = (ArrayList) ng0Var.f4262e;
        C0951y5 c0951y5 = ((wo0) arrayList.get(w60.m4911r(i, arrayList))).f7159a;
        return (c0951y5.f7540d.m797e(i - r4.f7162d) + r4.f7160b) - 1;
    }
}
