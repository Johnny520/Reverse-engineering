package p259r9;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: r9.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3768r {

    /* JADX INFO: renamed from: a */
    public final WeakReference f12324a;

    /* JADX INFO: renamed from: b */
    public final boolean f12325b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3768r(WeakReference weakReference, boolean z9) {
        this.f12324a = weakReference;
        this.f12325b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3768r)) {
            return false;
        }
        C3768r c3768r = (C3768r) obj;
        return this.f12324a.equals(c3768r.f12324a) && this.f12325b == c3768r.f12325b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f12325b) + (this.f12324a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AvatarDetailsClipState(view=" + this.f12324a + ", originalClipChildren=" + this.f12325b + ")";
    }
}
