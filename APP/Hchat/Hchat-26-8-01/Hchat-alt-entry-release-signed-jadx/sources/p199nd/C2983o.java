package p199nd;

import java.util.EnumMap;
import java.util.Set;
import md.C2825b;
import me.C2833a;
import p025bc.EnumC0251a;
import p068eh.AbstractC0921a;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: nd.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2983o implements InterfaceC3125b {

    /* JADX INFO: renamed from: g */
    public final EnumMap f9747g = new EnumMap(EnumC0251a.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m6392b(AbstractC2963b0 abstractC2963b0, EnumC0251a enumC0251a, String str) {
        C2983o c2983o = (C2983o) abstractC2963b0.f9217g.mo6237c(C2825b.f9189d);
        if (c2983o == null) {
            c2983o = new C2983o();
            abstractC2963b0.m6233y(c2983o);
        }
        ((Set) c2983o.f9747g.computeIfAbsent(enumC0251a, new C2833a(3))).add(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final InterfaceC3124a mo441a() {
        return C2825b.f9189d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2251n("JadxCommentsAttr{\n ", AbstractC5798s.m10517k(this.f9747g.entrySet(), "\n ", new C2833a(2)), "}");
    }
}
