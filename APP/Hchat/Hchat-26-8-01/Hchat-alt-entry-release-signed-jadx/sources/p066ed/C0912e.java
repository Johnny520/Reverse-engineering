package p066ed;

import java.util.Collections;
import java.util.List;
import p068eh.AbstractC0921a;
import p215od.C3131d;
import p246qd.AbstractC3506j;
import p302ud.InterfaceC4317m;

/* JADX INFO: renamed from: ed.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0912e implements InterfaceC4317m {

    /* JADX INFO: renamed from: g */
    public final C3131d f2844g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0912e(C3131d c3131d) {
        this.f2844g = c3131d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: c */
    public final List mo2218c() {
        return this.f2844g.f10152i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m, p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: d */
    public final String mo2219d() {
        return super.mo2219d().concat(" (s)");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: e */
    public final AbstractC3506j mo2220e() {
        return this.f2844g.f10151h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    public final List getTypeParameters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: o */
    public final int mo2221o() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: q */
    public final C3131d mo2222q() {
        return this.f2844g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: s */
    public final List mo2223s() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2251n("SimpleMethodDetails{", String.valueOf(this.f2844g), "}");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: v */
    public final boolean mo2224v() {
        return false;
    }
}
