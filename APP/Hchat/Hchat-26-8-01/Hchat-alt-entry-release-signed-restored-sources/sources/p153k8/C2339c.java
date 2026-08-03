package p153k8;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: k8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2339c {

    /* JADX INFO: renamed from: a */
    public final Object f7665a;

    /* JADX INFO: renamed from: b */
    public final int f7666b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2339c(Object obj, int i9) {
        obj.getClass();
        this.f7665a = obj;
        this.f7666b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2339c)) {
            return false;
        }
        C2339c c2339c = (C2339c) obj;
        return AbstractC1416l.m3825a(this.f7665a, c2339c.f7665a) && this.f7666b == c2339c.f7666b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f7666b) + (this.f7665a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SearchNode(value=" + this.f7665a + ", depth=" + this.f7666b + ")";
    }
}
