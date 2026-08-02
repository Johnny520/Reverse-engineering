package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h22 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h22(boolean z, boolean z2, boolean z3, km2 km2Var, boolean z4) {
        my myVar = pa.a;
        int i = !z ? 262152 : 262144;
        i = km2Var == km2.i ? i | 8192 : i;
        i = z4 ? i : i | AIChatConfig.DefaultMaxTokens;
        boolean z5 = km2Var == km2.h;
        this.a = i;
        this.b = z5;
        this.c = z2;
        this.d = z3;
        this.e = true;
        this.f = 1002;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h22)) {
            return false;
        }
        h22 h22Var = (h22) obj;
        return this.a == h22Var.a && this.b == h22Var.b && this.c == h22Var.c && this.d == h22Var.d && this.e == h22Var.e && this.f == h22Var.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (hk1.d(hk1.d(hk1.d(hk1.d(hk1.d(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public h22(int i) {
        this((i & 1) == 0, true, true, km2.h, true);
    }
}
