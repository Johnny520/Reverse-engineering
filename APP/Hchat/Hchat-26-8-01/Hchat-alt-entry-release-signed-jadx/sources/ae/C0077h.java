package ae;

import java.util.Collections;
import java.util.List;
import md.C2825b;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p302ud.C4305a;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: ae.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0077h implements InterfaceC3125b {

    /* JADX INFO: renamed from: g */
    public final int f243g;

    /* JADX INFO: renamed from: h */
    public final List f244h;

    /* JADX INFO: renamed from: i */
    public List f245i;

    /* JADX INFO: renamed from: j */
    public C0077h f246j;

    /* JADX INFO: renamed from: k */
    public List f247k = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: l */
    public boolean f248l = false;

    /* JADX INFO: renamed from: m */
    public C4305a f249m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0077h(int i9, List list, List list2) {
        this.f243g = i9;
        this.f244h = list;
        this.f245i = list2;
        list.forEach(new C0076g(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final InterfaceC3124a mo441a() {
        return C2825b.f9177D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0077h.class == obj.getClass()) {
            C0077h c0077h = (C0077h) obj;
            if (this.f243g == c0077h.f243g && this.f244h.equals(c0077h.f244h) && this.f245i.equals(c0077h.f245i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f245i.hashCode() * 31) + this.f244h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (this.f248l) {
            return "Merged into ".concat(String.valueOf(this.f246j));
        }
        StringBuilder sb2 = new StringBuilder("TryCatch #");
        sb2.append(this.f243g);
        sb2.append(" {");
        sb2.append(AbstractC5798s.m10516j(this.f244h, ", "));
        sb2.append(", blocks: (");
        sb2.append(AbstractC5798s.m10516j(this.f245i, ", "));
        sb2.append(')');
        if (this.f249m != null) {
            sb2.append(", top: ");
            sb2.append(this.f249m);
        }
        if (this.f246j != null) {
            sb2.append(", outer: #");
            sb2.append(this.f246j.f243g);
        }
        if (!this.f247k.isEmpty()) {
            sb2.append(", inners: ");
            sb2.append(AbstractC5798s.m10517k(this.f247k, ", ", new C0073d(1)));
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
