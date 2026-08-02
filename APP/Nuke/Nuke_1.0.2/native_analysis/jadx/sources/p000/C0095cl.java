package p000;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: renamed from: cl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0095cl {

    /* JADX INFO: renamed from: a */
    public final ColorFilter f1606a;

    /* JADX INFO: renamed from: b */
    public final long f1607b;

    /* JADX INFO: renamed from: c */
    public final int f1608c;

    public C0095cl(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0155e6.m1264f();
            porterDuffColorFilter = AbstractC0155e6.m1262d(sp0.m4947j0(j), t11.m5068T(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(sp0.m4947j0(j), t11.m5071W(i));
        }
        this.f1606a = porterDuffColorFilter;
        this.f1607b = j;
        this.f1608c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0095cl)) {
            return false;
        }
        C0095cl c0095cl = (C0095cl) obj;
        return C0363ju.m2566c(this.f1607b, c0095cl.f1607b) && this.f1608c == c0095cl.f1608c;
    }

    public final int hashCode() {
        int i = C0363ju.f5218h;
        return Integer.hashCode(this.f1608c) + (Long.hashCode(this.f1607b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        hk1.m2213l(this.f1607b, sb, ", blendMode=");
        sb.append((Object) gf1.m1880a0(this.f1608c));
        sb.append(')');
        return sb.toString();
    }
}
