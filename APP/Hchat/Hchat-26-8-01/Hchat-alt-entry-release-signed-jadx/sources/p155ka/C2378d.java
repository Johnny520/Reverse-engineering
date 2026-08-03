package p155ka;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: ka.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2378d {

    /* JADX INFO: renamed from: a */
    public final String f7817a;

    /* JADX INFO: renamed from: b */
    public final String f7818b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2378d(String str, String str2) {
        this.f7817a = str;
        this.f7818b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2378d)) {
            return false;
        }
        C2378d c2378d = (C2378d) obj;
        return this.f7817a.equals(c2378d.f7817a) && AbstractC1416l.m3825a(this.f7818b, c2378d.f7818b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f7817a.hashCode() * 31;
        String str = this.f7818b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("MusicCommand(keyword=", this.f7817a, ", customSinger=", this.f7818b, ")");
    }
}
