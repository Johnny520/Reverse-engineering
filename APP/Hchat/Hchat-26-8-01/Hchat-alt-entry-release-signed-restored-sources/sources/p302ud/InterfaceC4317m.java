package p302ud;

import java.util.List;
import md.C2825b;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p215od.C3131d;
import p246qd.AbstractC3506j;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: ud.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4317m extends InterfaceC3125b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    /* bridge */ /* synthetic */ default InterfaceC3124a mo441a() {
        return C2825b.f9182I;
    }

    /* JADX INFO: renamed from: c */
    List mo2218c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: d */
    default String mo2219d() {
        StringBuilder sb2 = new StringBuilder("MD:");
        if (AbstractC5798s.m10520n(getTypeParameters())) {
            sb2.append('<');
            sb2.append(AbstractC5798s.m10516j(getTypeParameters(), ", "));
            sb2.append(">:");
        }
        sb2.append('(');
        sb2.append(AbstractC5798s.m10516j(mo2218c(), ", "));
        sb2.append("):");
        sb2.append(mo2220e());
        if (mo2224v()) {
            sb2.append(" VARARG");
        }
        List listMo2223s = mo2223s();
        if (AbstractC5798s.m10520n(listMo2223s)) {
            sb2.append(" throws ");
            sb2.append(AbstractC5798s.m10516j(listMo2223s, ", "));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: e */
    AbstractC3506j mo2220e();

    List getTypeParameters();

    /* JADX INFO: renamed from: o */
    int mo2221o();

    /* JADX INFO: renamed from: q */
    C3131d mo2222q();

    /* JADX INFO: renamed from: s */
    List mo2223s();

    /* JADX INFO: renamed from: v */
    boolean mo2224v();
}
