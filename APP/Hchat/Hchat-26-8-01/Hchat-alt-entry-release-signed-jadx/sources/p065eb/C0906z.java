package p065eb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: eb.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0906z {

    /* JADX INFO: renamed from: a */
    public final String f2817a;

    /* JADX INFO: renamed from: b */
    public final String f2818b;

    /* JADX INFO: renamed from: c */
    public final ClassLoader f2819c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0906z(String str, ClassLoader classLoader, String str2) {
        str2.getClass();
        this.f2817a = str;
        this.f2818b = str2;
        this.f2819c = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0906z)) {
            return false;
        }
        C0906z c0906z = (C0906z) obj;
        return this.f2817a.equals(c0906z.f2817a) && AbstractC1416l.m3825a(this.f2818b, c0906z.f2818b) && this.f2819c.equals(c0906z.f2819c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2819c.hashCode() + AbstractC0921a.m2244g(this.f2817a.hashCode() * 31, 31, this.f2818b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("LoadedNativeLibrary(sourcePath=", this.f2817a, ", digest=", this.f2818b, ", classLoader=");
        sbM1027p.append(this.f2819c);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
