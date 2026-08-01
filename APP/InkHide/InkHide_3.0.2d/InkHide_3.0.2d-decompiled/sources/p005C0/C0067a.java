package p005C0;

import de.robv.android.xposed.XC_MethodHook;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: C0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0067a {

    /* JADX INFO: renamed from: a */
    public final String f313a;

    /* JADX INFO: renamed from: b */
    public final XC_MethodHook.Unhook f314b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0067a(String str, XC_MethodHook.Unhook unhook) {
        this.f313a = str;
        this.f314b = unhook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0067a)) {
            return false;
        }
        C0067a c0067a = (C0067a) obj;
        return AbstractC0223g.m414a(this.f313a, c0067a.f313a) && AbstractC0223g.m414a(this.f314b, c0067a.f314b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f313a;
        return this.f314b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Entry(marker=" + this.f313a + ", unhook=" + this.f314b + ")";
    }
}
