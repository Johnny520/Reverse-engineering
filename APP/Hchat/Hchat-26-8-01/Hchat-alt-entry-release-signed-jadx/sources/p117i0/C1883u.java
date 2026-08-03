package p117i0;

import bi.C0315c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: i0.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1883u extends AbstractC1869p1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6254b = 1;

    /* JADX INFO: renamed from: c */
    public final Object f6255c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1883u(InterfaceC1231l interfaceC1231l) {
        super(new C0315c(26));
        this.f6255c = new C1886v(interfaceC1231l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1869p1
    /* JADX INFO: renamed from: a */
    public final C1873q1 mo4582a(Object obj) {
        switch (this.f6254b) {
            case 0:
                return new C1873q1(this, obj, obj == null, null, true);
            default:
                return new C1873q1(this, obj, obj == null, (C1823e) this.f6255c, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.AbstractC1869p1
    /* JADX INFO: renamed from: b */
    public InterfaceC1870p2 mo4585b() {
        switch (this.f6254b) {
            case 0:
                return (C1886v) this.f6255c;
            default:
                return super.mo4585b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883u(InterfaceC1220a interfaceC1220a) {
        super(interfaceC1220a);
        C1823e c1823e = C1823e.f6052m;
        this.f6255c = c1823e;
    }
}
