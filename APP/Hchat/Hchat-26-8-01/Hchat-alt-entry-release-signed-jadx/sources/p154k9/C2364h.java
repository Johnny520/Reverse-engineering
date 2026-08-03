package p154k9;

import java.lang.ref.WeakReference;
import p068eh.AbstractC0921a;
import p332wb.C4810da;

/* JADX INFO: renamed from: k9.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2364h {

    /* JADX INFO: renamed from: a */
    public final WeakReference f7764a;

    /* JADX INFO: renamed from: b */
    public final String f7765b;

    /* JADX INFO: renamed from: c */
    public final C4810da f7766c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2364h(WeakReference weakReference, String str, C4810da c4810da) {
        this.f7764a = weakReference;
        this.f7765b = str;
        this.f7766c = c4810da;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2364h)) {
            return false;
        }
        C2364h c2364h = (C2364h) obj;
        return this.f7764a.equals(c2364h.f7764a) && this.f7765b.equals(c2364h.f7765b) && this.f7766c.equals(c2364h.f7766c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7766c.hashCode() + AbstractC0921a.m2244g(this.f7764a.hashCode() * 31, 31, this.f7765b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Pending(activity=" + this.f7764a + ", key=" + this.f7765b + ", callback=" + this.f7766c + ")";
    }
}
