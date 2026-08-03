package p139jb;

import java.util.ArrayList;

/* JADX INFO: renamed from: jb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2119c {

    /* JADX INFO: renamed from: a */
    public final int f7074a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f7075b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2119c(int i9, ArrayList arrayList) {
        this.f7074a = i9;
        this.f7075b = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2119c)) {
            return false;
        }
        C2119c c2119c = (C2119c) obj;
        return this.f7074a == c2119c.f7074a && this.f7075b.equals(c2119c.f7075b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7075b.hashCode() + (Integer.hashCode(this.f7074a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FinderMedia(type=" + this.f7074a + ", items=" + this.f7075b + ")";
    }
}
