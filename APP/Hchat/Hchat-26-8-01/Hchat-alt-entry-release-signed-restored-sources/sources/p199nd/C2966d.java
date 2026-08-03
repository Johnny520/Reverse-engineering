package p199nd;

import java.util.EnumSet;
import md.C2825b;
import p068eh.AbstractC0921a;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p302ud.C4322r;

/* JADX INFO: renamed from: nd.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2966d implements InterfaceC3125b {

    /* JADX INFO: renamed from: g */
    public final EnumSet f9720g = EnumSet.noneOf(EnumC2964c.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m6389b(C4322r c4322r, EnumC2964c enumC2964c) {
        C2966d c2966d = (C2966d) c4322r.f9217g.mo6237c(C2825b.f9206u);
        if (c2966d == null) {
            return false;
        }
        return c2966d.f9720g.contains(enumC2964c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9206u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: d */
    public final String mo2219d() {
        return AbstractC0921a.m2251n("CodeFeatures{", String.valueOf(this.f9720g), "}");
    }
}
