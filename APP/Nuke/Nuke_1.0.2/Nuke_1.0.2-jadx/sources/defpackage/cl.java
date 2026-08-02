package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cl {
    public final ColorFilter a;
    public final long b;
    public final int c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cl(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            e6.f();
            porterDuffColorFilter = e6.d(sp0.j0(j), t11.T(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(sp0.j0(j), t11.W(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl)) {
            return false;
        }
        cl clVar = (cl) obj;
        return ju.c(this.b, clVar.b) && this.c == clVar.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = ju.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        hk1.l(this.b, sb, ", blendMode=");
        sb.append((Object) gf1.a0(this.c));
        sb.append(')');
        return sb.toString();
    }
}
