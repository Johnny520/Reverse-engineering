package nc;

import java.util.LinkedHashMap;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: nc.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2959b {

    /* JADX INFO: renamed from: a */
    public final int f9706a;

    /* JADX INFO: renamed from: b */
    public final String f9707b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f9708c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2959b(int i9, String str, LinkedHashMap linkedHashMap) {
        this.f9706a = i9;
        this.f9707b = str;
        this.f9708c = linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f9706a;
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("Annotation{", i9 != 1 ? i9 != 2 ? i9 != 3 ? "null" : "SYSTEM" : "RUNTIME" : "BUILD", ", type=", this.f9707b, ", values="), String.valueOf(this.f9708c), "}");
    }
}
