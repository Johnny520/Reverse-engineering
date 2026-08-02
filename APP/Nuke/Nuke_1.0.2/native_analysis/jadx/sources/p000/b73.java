package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b73 {
    public static final a73 Companion = new a73();

    /* JADX INFO: renamed from: c */
    public static final j71[] f723c = {null, AbstractC0570p7.m3746B(i91.f4497h, new y63(0))};

    /* JADX INFO: renamed from: a */
    public final String f724a;

    /* JADX INFO: renamed from: b */
    public final List f725b;

    public /* synthetic */ b73(int i, String str, List list) {
        this.f724a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f725b = be0.f819h;
        } else {
            this.f725b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b73)) {
            return false;
        }
        b73 b73Var = (b73) obj;
        return t11.m5086l(this.f724a, b73Var.f724a) && t11.m5086l(this.f725b, b73Var.f725b);
    }

    public final int hashCode() {
        String str = this.f724a;
        return this.f725b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ThemeConfig(accentColorHex=" + this.f724a + ", recentAccentColorHexes=" + this.f725b + ")";
    }

    public b73(String str, List list) {
        this.f724a = str;
        this.f725b = list;
    }

    public /* synthetic */ b73() {
        this(null, be0.f819h);
    }
}
