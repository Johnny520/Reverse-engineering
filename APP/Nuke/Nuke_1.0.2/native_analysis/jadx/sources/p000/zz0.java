package p000;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zz0 {

    /* JADX INFO: renamed from: e */
    public static final zz0 f14156e = new zz0(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f14157a;

    /* JADX INFO: renamed from: b */
    public final int f14158b;

    /* JADX INFO: renamed from: c */
    public final int f14159c;

    /* JADX INFO: renamed from: d */
    public final int f14160d;

    public zz0(int i, int i2, int i3, int i4) {
        this.f14157a = i;
        this.f14158b = i2;
        this.f14159c = i3;
        this.f14160d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static zz0 m6517a(zz0 zz0Var, zz0 zz0Var2) {
        return m6518b(Math.max(zz0Var.f14157a, zz0Var2.f14157a), Math.max(zz0Var.f14158b, zz0Var2.f14158b), Math.max(zz0Var.f14159c, zz0Var2.f14159c), Math.max(zz0Var.f14160d, zz0Var2.f14160d));
    }

    /* JADX INFO: renamed from: b */
    public static zz0 m6518b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f14156e : new zz0(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static zz0 m6519c(Insets insets) {
        return m6518b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m6520d() {
        return b00.m331h(this.f14157a, this.f14158b, this.f14159c, this.f14160d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zz0.class != obj.getClass()) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        return this.f14160d == zz0Var.f14160d && this.f14157a == zz0Var.f14157a && this.f14159c == zz0Var.f14159c && this.f14158b == zz0Var.f14158b;
    }

    public final int hashCode() {
        return (((((this.f14157a * 31) + this.f14158b) * 31) + this.f14159c) * 31) + this.f14160d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f14157a);
        sb.append(", top=");
        sb.append(this.f14158b);
        sb.append(", right=");
        sb.append(this.f14159c);
        sb.append(", bottom=");
        return vi0.m5694m(sb, this.f14160d, '}');
    }
}
