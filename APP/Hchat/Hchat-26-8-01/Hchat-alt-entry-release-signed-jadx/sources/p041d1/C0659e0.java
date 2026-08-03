package p041d1;

import gg.AbstractC1417m;
import p016b1.C0167g;
import p057e1.C0808c;
import p085fg.InterfaceC1231l;
import p308v1.InterfaceC4381d;
import p339x1.AbstractC5618k;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: d1.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0659e0 extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2034g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0653b0 f2035h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0653b0 f2036i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2037j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0167g f2038k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2039l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0659e0(C0653b0 c0653b0, C0653b0 c0653b02, Object obj, int i9, C0167g c0167g, int i10) {
        super(1);
        this.f2034g = i10;
        this.f2035h = c0653b0;
        this.f2036i = c0653b02;
        this.f2039l = obj;
        this.f2037j = i9;
        this.f2038k = c0167g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f2034g) {
            case 0:
                InterfaceC4381d interfaceC4381d = (InterfaceC4381d) obj;
                C0653b0 c0653b0 = this.f2036i;
                if (this.f2035h != ((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner()).m1848f()) {
                    return Boolean.TRUE;
                }
                boolean zM1807B = AbstractC0656d.m1807B(c0653b0, (C0653b0) this.f2039l, this.f2037j, this.f2038k);
                Boolean boolValueOf = Boolean.valueOf(zM1807B);
                if (zM1807B || !interfaceC4381d.mo8022a()) {
                    return boolValueOf;
                }
                return null;
            default:
                InterfaceC4381d interfaceC4381d2 = (InterfaceC4381d) obj;
                C0653b0 c0653b02 = this.f2036i;
                if (this.f2035h != ((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b02)).getFocusOwner()).m1848f()) {
                    return Boolean.TRUE;
                }
                boolean zM1806A = AbstractC0656d.m1806A(this.f2037j, this.f2038k, c0653b02, (C0808c) this.f2039l);
                Boolean boolValueOf2 = Boolean.valueOf(zM1806A);
                if (zM1806A || !interfaceC4381d2.mo8022a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
