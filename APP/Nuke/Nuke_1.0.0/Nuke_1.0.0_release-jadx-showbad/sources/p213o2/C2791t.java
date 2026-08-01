package p213o2;

import p224q2.C2923n;

/* JADX INFO: renamed from: o2.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2791t extends AbstractC2788q {

    /* JADX INFO: renamed from: d */
    public final C2923n f8818d = new C2923n(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4977a(String str, Boolean bool) {
        this.f8818d.put(str, bool == null ? C2790s.f8817d : new C2792u(bool));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4978b(String str, Integer num) {
        this.f8818d.put(str, new C2792u(num));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4979c(String str, String str2) {
        this.f8818d.put(str, str2 == null ? C2790s.f8817d : new C2792u(str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C2791t) && ((C2791t) obj).f8818d.equals(this.f8818d);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8818d.hashCode();
    }
}
