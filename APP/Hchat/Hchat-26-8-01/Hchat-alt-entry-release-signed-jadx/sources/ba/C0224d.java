package ba;

import android.app.Activity;
import p332wb.C4819dj;

/* JADX INFO: renamed from: ba.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0224d {

    /* JADX INFO: renamed from: a */
    public final Activity f556a;

    /* JADX INFO: renamed from: b */
    public final EnumC0234n f557b;

    /* JADX INFO: renamed from: c */
    public final C4819dj f558c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0224d(Activity activity, EnumC0234n enumC0234n, C4819dj c4819dj) {
        enumC0234n.getClass();
        this.f556a = activity;
        this.f557b = enumC0234n;
        this.f558c = c4819dj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0224d)) {
            return false;
        }
        C0224d c0224d = (C0224d) obj;
        return this.f556a.equals(c0224d.f556a) && this.f557b == c0224d.f557b && this.f558c.equals(c0224d.f558c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f558c.hashCode() + ((this.f557b.hashCode() + (this.f556a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Pending(activity=" + this.f556a + ", slot=" + this.f557b + ", callback=" + this.f558c + ")";
    }
}
