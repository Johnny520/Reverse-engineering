package p332wb;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import p346x9.C5739f;

/* JADX INFO: renamed from: wb.jb */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5006jb implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18087g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f18088h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18089i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18090j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5006jb(InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f18087g = i9;
        this.f18088h = interfaceC1231l;
        this.f18089i = interfaceC1809a1;
        this.f18090j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f18087g) {
            case 0:
                this.f18088h.invoke(new C5739f(AbstractC3149m.m6703R0((String) this.f18089i.getValue()).toString(), ((Boolean) this.f18090j.getValue()).booleanValue()));
                break;
            default:
                if (!C5491y2.m9778H(this.f18089i)) {
                    Boolean bool = (Boolean) this.f18090j.getValue();
                    bool.booleanValue();
                    this.f18088h.invoke(bool);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
