package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h22 {

    /* JADX INFO: renamed from: a */
    public final int f3795a;

    /* JADX INFO: renamed from: b */
    public final boolean f3796b;

    /* JADX INFO: renamed from: c */
    public final boolean f3797c;

    /* JADX INFO: renamed from: d */
    public final boolean f3798d;

    /* JADX INFO: renamed from: e */
    public final boolean f3799e;

    /* JADX INFO: renamed from: f */
    public final int f3800f;

    public h22(boolean z, boolean z2, boolean z3, km2 km2Var, boolean z4) {
        C0478my c0478my = AbstractC0573pa.f8061a;
        int i = !z ? 262152 : 262144;
        i = km2Var == km2.f5652i ? i | 8192 : i;
        i = z4 ? i : i | AIChatConfig.DefaultMaxTokens;
        boolean z5 = km2Var == km2.f5651h;
        this.f3795a = i;
        this.f3796b = z5;
        this.f3797c = z2;
        this.f3798d = z3;
        this.f3799e = true;
        this.f3800f = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h22)) {
            return false;
        }
        h22 h22Var = (h22) obj;
        return this.f3795a == h22Var.f3795a && this.f3796b == h22Var.f3796b && this.f3797c == h22Var.f3797c && this.f3798d == h22Var.f3798d && this.f3799e == h22Var.f3799e && this.f3800f == h22Var.f3800f;
    }

    public final int hashCode() {
        return (hk1.m2205d(hk1.m2205d(hk1.m2205d(hk1.m2205d(hk1.m2205d(this.f3795a * 31, 31, this.f3796b), 31, this.f3797c), 31, this.f3798d), 31, this.f3799e), 31, false) + this.f3800f) * 31;
    }

    public h22(int i) {
        this((i & 1) == 0, true, true, km2.f5651h, true);
    }
}
