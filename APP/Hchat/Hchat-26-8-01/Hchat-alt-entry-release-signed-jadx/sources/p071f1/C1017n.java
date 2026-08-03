package p071f1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: renamed from: f1.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1017n {

    /* JADX INFO: renamed from: a */
    public final ColorFilter f3201a;

    /* JADX INFO: renamed from: b */
    public final long f3202b;

    /* JADX INFO: renamed from: c */
    public final int f3203c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1017n(long j3, int i9) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0991a.m2463j();
            porterDuffColorFilter = AbstractC0991a.m2456c(AbstractC0996c0.m2526w(j3), AbstractC0996c0.m2522s(i9));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC0996c0.m2526w(j3), AbstractC0996c0.m2529z(i9));
        }
        this.f3201a = porterDuffColorFilter;
        this.f3202b = j3;
        this.f3203c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1017n)) {
            return false;
        }
        C1017n c1017n = (C1017n) obj;
        return C1034w.m2635c(this.f3202b, c1017n.f3202b) && this.f3203c == c1017n.f3203c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Integer.hashCode(this.f3203c) + (Long.hashCode(this.f3202b) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BlendModeColorFilter(color=" + ((Object) C1034w.m2641i(this.f3202b)) + ", blendMode=" + ((Object) AbstractC0996c0.m2503A(this.f3203c)) + ')';
    }
}
