package p360y4;

import java.util.ArrayList;

/* JADX INFO: renamed from: y4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5994b {

    /* JADX INFO: renamed from: a */
    public final Class f24347a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f24348b;

    /* JADX INFO: renamed from: c */
    public final ClassLoader f24349c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5994b(Class cls, ArrayList arrayList, ClassLoader classLoader) {
        this.f24347a = cls;
        this.f24348b = new ArrayList(arrayList);
        this.f24349c = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5994b.class != obj.getClass()) {
            return false;
        }
        C5994b c5994b = (C5994b) obj;
        return this.f24347a == c5994b.f24347a && this.f24348b.equals(c5994b.f24348b) && this.f24349c == c5994b.f24349c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f24349c.hashCode() + this.f24348b.hashCode() + this.f24347a.hashCode();
    }
}
