package p276sf;

import gg.AbstractC1416l;
import java.io.Serializable;

/* JADX INFO: renamed from: sf.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3960g implements Serializable {

    /* JADX INFO: renamed from: g */
    public final Object f12964g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [sf.g.a(java.lang.Object):sf.g] */
    public /* synthetic */ C3960g(Object obj) {
        this.f12964g = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.Object) A[MD:(java.lang.Object):void (m)] (LINE:3) call: sf.g.<init>(java.lang.Object):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C3960g m8181a(Object obj) {
        return new C3960g(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final Throwable m8182b(Object obj) {
        if (obj instanceof C3959f) {
            return ((C3959f) obj).f12963g;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m8183c(Object obj) {
        return obj instanceof C3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m8184d(Object obj) {
        return !(obj instanceof C3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3960g) {
            return AbstractC1416l.m3825a(this.f12964g, ((C3960g) obj).f12964g);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f12964g;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Object obj = this.f12964g;
        if (obj instanceof C3959f) {
            return ((C3959f) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
