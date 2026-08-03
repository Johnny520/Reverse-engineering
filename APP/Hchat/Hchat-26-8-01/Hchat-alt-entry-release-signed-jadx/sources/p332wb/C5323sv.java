package p332wb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: wb.sv */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5323sv {

    /* JADX INFO: renamed from: a */
    public final String f20728a;

    /* JADX INFO: renamed from: b */
    public final String f20729b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5323sv(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f20728a = str;
        this.f20729b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5323sv)) {
            return false;
        }
        C5323sv c5323sv = (C5323sv) obj;
        return AbstractC1416l.m3825a(this.f20728a, c5323sv.f20728a) && AbstractC1416l.m3825a(this.f20729b, c5323sv.f20729b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20729b.hashCode() + (this.f20728a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("ZombieCheckDeleteTarget(wxid=", this.f20728a, ", name=", this.f20729b, ")");
    }
}
