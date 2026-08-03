package p170le;

import java.util.HashSet;
import p025bc.AbstractC0255e;
import p350xd.AbstractC5774a;

/* JADX INFO: renamed from: le.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2554b {

    /* JADX INFO: renamed from: a */
    public final HashSet f8284a;

    /* JADX INFO: renamed from: b */
    public final AbstractC5774a f8285b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2554b(C2554b c2554b, AbstractC5774a abstractC5774a) {
        this.f8284a = new HashSet(c2554b.f8284a);
        this.f8285b = abstractC5774a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1021j("Region: ", String.valueOf(this.f8285b), ", exits: ", String.valueOf(this.f8284a));
    }

    public C2554b() {
        this.f8284a = new HashSet();
    }
}
