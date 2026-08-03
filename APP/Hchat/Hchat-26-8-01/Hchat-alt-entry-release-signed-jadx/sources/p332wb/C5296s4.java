package p332wb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p176m1.C2730f;

/* JADX INFO: renamed from: wb.s4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5296s4 {

    /* JADX INFO: renamed from: a */
    public final EnumC5329t4 f20566a;

    /* JADX INFO: renamed from: b */
    public final String f20567b;

    /* JADX INFO: renamed from: c */
    public final C2730f f20568c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5296s4(EnumC5329t4 enumC5329t4, String str, C2730f c2730f) {
        c2730f.getClass();
        this.f20566a = enumC5329t4;
        this.f20567b = str;
        this.f20568c = c2730f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5296s4)) {
            return false;
        }
        C5296s4 c5296s4 = (C5296s4) obj;
        return this.f20566a == c5296s4.f20566a && this.f20567b.equals(c5296s4.f20567b) && AbstractC1416l.m3825a(this.f20568c, c5296s4.f20568c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20568c.hashCode() + AbstractC0921a.m2244g(this.f20566a.hashCode() * 31, 31, this.f20567b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MainNavItem(tab=" + this.f20566a + ", label=" + this.f20567b + ", icon=" + this.f20568c + ")";
    }
}
