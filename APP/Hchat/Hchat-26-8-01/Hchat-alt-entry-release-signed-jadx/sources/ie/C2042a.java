package ie;

import java.util.Collections;
import java.util.List;
import p215od.C3131d;
import p246qd.AbstractC3506j;
import p302ud.InterfaceC4317m;

/* JADX INFO: renamed from: ie.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2042a implements InterfaceC4317m {

    /* JADX INFO: renamed from: g */
    public final C3131d f6882g;

    /* JADX INFO: renamed from: h */
    public AbstractC3506j f6883h;

    /* JADX INFO: renamed from: i */
    public List f6884i;

    /* JADX INFO: renamed from: j */
    public final List f6885j;

    /* JADX INFO: renamed from: k */
    public final List f6886k;

    /* JADX INFO: renamed from: l */
    public final boolean f6887l;

    /* JADX INFO: renamed from: m */
    public final int f6888m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2042a(InterfaceC4317m interfaceC4317m) {
        this.f6882g = interfaceC4317m.mo2222q();
        this.f6883h = interfaceC4317m.mo2220e();
        this.f6884i = Collections.unmodifiableList(interfaceC4317m.mo2218c());
        this.f6885j = Collections.unmodifiableList(interfaceC4317m.getTypeParameters());
        this.f6886k = Collections.unmodifiableList(interfaceC4317m.mo2223s());
        this.f6887l = interfaceC4317m.mo2224v();
        this.f6888m = interfaceC4317m.mo2221o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: c */
    public final List mo2218c() {
        return this.f6884i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m, p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: d */
    public final String mo2219d() {
        return super.mo2219d().concat(" (mut)");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: e */
    public final AbstractC3506j mo2220e() {
        return this.f6883h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    public final List getTypeParameters() {
        return this.f6885j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: o */
    public final int mo2221o() {
        return this.f6888m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: q */
    public final C3131d mo2222q() {
        return this.f6882g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: s */
    public final List mo2223s() {
        return this.f6886k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Mutable".concat(mo2219d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: v */
    public final boolean mo2224v() {
        return this.f6887l;
    }
}
