package p211o0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: o0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2753l {

    /* JADX INFO: renamed from: a */
    public final ColorFilter f8746a;

    /* JADX INFO: renamed from: b */
    public final long f8747b;

    /* JADX INFO: renamed from: c */
    public final int f8748c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2753l(long j5, int i5) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2754m.m4894d();
            porterDuffColorFilter = AbstractC2754m.m4891a(AbstractC2767z.m4952w(j5), AbstractC2767z.m4948s(i5));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC2767z.m4952w(j5), AbstractC2767z.m4928A(i5));
        }
        this.f8746a = porterDuffColorFilter;
        this.f8747b = j5;
        this.f8748c = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2753l)) {
            return false;
        }
        C2753l c2753l = (C2753l) obj;
        return C2762u.m4921c(this.f8747b, c2753l.f8747b) && this.f8748c == c2753l.f8748c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i5 = C2762u.f8763h;
        return Integer.hashCode(this.f8748c) + (Long.hashCode(this.f8747b) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC0231b.m406q(this.f8747b, sb, ", blendMode=");
        sb.append((Object) AbstractC2767z.m4929B(this.f8748c));
        sb.append(')');
        return sb.toString();
    }
}
