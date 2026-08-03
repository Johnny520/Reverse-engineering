package p253r1;

import gg.AbstractC1417m;
import gg.C1425u;
import p041d1.C0653b0;
import p085fg.InterfaceC1231l;
import p267s1.AbstractC3893f;
import p339x1.InterfaceC5600e2;
import p339x1.InterfaceC5612i;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: r1.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3653j extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11848g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1425u f11849h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3653j(C1425u c1425u, int i9) {
        super(1);
        this.f11848g = i9;
        this.f11849h = c1425u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        boolean z9;
        switch (this.f11848g) {
            case 0:
                InterfaceC5612i interfaceC5612i = (InterfaceC5600e2) obj;
                if (((AbstractC5852n) interfaceC5612i).f23788g.f23801t) {
                    this.f11849h.f4738g = interfaceC5612i;
                    z9 = false;
                } else {
                    z9 = true;
                }
                break;
            case 1:
                AbstractC3893f abstractC3893f = (AbstractC3893f) obj;
                C1425u c1425u = this.f11849h;
                Object obj2 = c1425u.f4738g;
                if (obj2 == null && abstractC3893f.f12766w) {
                    c1425u.f4738g = abstractC3893f;
                } else if (obj2 != null) {
                    abstractC3893f.getClass();
                }
                break;
            default:
                this.f11849h.f4738g = (C0653b0) obj;
                break;
        }
        return Boolean.TRUE;
    }
}
