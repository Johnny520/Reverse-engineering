package md;

import java.util.Objects;
import p068eh.AbstractC0921a;
import p214oc.AbstractC3127d;
import p214oc.InterfaceC3124a;
import p302ud.C4320p;
import p302ud.C4322r;

/* JADX INFO: renamed from: md.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2831h extends AbstractC3127d {

    /* JADX INFO: renamed from: g */
    public final C4322r f9222g;

    /* JADX INFO: renamed from: h */
    public final C4320p f9223h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2831h(C4322r c4322r, C4320p c4320p) {
        this.f9222g = c4322r;
        Objects.requireNonNull(c4320p);
        this.f9223h = c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final InterfaceC3124a mo441a() {
        return C2825b.f9196k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2251n("INIT{", String.valueOf(this.f9223h), "}");
    }
}
