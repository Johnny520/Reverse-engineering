package p245qc;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: qc.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3496f {

    /* JADX INFO: renamed from: a */
    public final int f11361a;

    /* JADX INFO: renamed from: b */
    public final int f11362b;

    /* JADX INFO: renamed from: c */
    public final C3492b f11363c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3496f(int i9, int i10, C3492b c3492b) {
        this.f11361a = i9;
        this.f11362b = i10;
        this.f11363c = c3492b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = String.format("0x%04x", Integer.valueOf(this.f11361a));
        String str2 = String.format("0x%04x", Integer.valueOf(this.f11362b));
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("Try{", str, " - ", str2, ": "), String.valueOf(this.f11363c), "}");
    }
}
