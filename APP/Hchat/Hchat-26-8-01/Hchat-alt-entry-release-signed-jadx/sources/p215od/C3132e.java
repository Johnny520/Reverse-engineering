package p215od;

import java.util.HashMap;
import java.util.Objects;
import p302ud.C4325u;

/* JADX INFO: renamed from: od.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3132e {

    /* JADX INFO: renamed from: a */
    public final C3132e f10158a;

    /* JADX INFO: renamed from: b */
    public final String f10159b;

    /* JADX INFO: renamed from: c */
    public final String f10160c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3132e(String str, C3132e c3132e, String str2) {
        this.f10159b = str;
        this.f10158a = c3132e;
        this.f10160c = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static synchronized C3132e m6666a(C4325u c4325u, String str) {
        try {
            C3132e c3132e = (C3132e) ((HashMap) c4325u.f14439e.f842e).get(str);
            if (c3132e != null) {
                return c3132e;
            }
            int iLastIndexOf = str.lastIndexOf(46);
            C3132e c3132e2 = iLastIndexOf == -1 ? new C3132e(str, null, str) : new C3132e(str, m6666a(c4325u, str.substring(0, iLastIndexOf)), str.substring(iLastIndexOf + 1));
            ((HashMap) c4325u.f14439e.f842e).put(c3132e2.f10159b, c3132e2);
            return c3132e2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static synchronized C3132e m6667b(C4325u c4325u, C3132e c3132e, String str) {
        String str2;
        if (c3132e == null) {
            str2 = str;
        } else {
            str2 = c3132e.f10159b + "." + str;
        }
        C3132e c3132e2 = (C3132e) ((HashMap) c4325u.f14439e.f842e).get(str2);
        if (c3132e2 != null) {
            return c3132e2;
        }
        C3132e c3132e3 = new C3132e(str2, c3132e, str);
        ((HashMap) c4325u.f14439e.f842e).put(str2, c3132e3);
        return c3132e3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3132e)) {
            return false;
        }
        return Objects.equals(this.f10159b, ((C3132e) obj).f10159b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10159b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f10159b;
    }
}
