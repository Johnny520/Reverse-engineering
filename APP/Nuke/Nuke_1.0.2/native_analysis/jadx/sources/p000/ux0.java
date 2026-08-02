package p000;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ux0 {

    /* JADX INFO: renamed from: a */
    public final Resources.Theme f11542a;

    /* JADX INFO: renamed from: b */
    public final int f11543b;

    public ux0(Resources.Theme theme, int i) {
        this.f11542a = theme;
        this.f11543b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux0)) {
            return false;
        }
        ux0 ux0Var = (ux0) obj;
        return t11.m5086l(this.f11542a, ux0Var.f11542a) && this.f11543b == ux0Var.f11543b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11543b) + (this.f11542a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f11542a);
        sb.append(", id=");
        return vi0.m5694m(sb, this.f11543b, ')');
    }
}
