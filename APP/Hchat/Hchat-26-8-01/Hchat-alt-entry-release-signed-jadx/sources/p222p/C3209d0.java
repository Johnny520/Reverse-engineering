package p222p;

import gg.AbstractC1416l;
import p085fg.InterfaceC1231l;
import p339x1.EnumC5596d2;
import p339x1.InterfaceC5600e2;

/* JADX INFO: renamed from: p.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3209d0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10258g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC3212e0 f10259h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3209d0(AbstractC3212e0 abstractC3212e0, int i9) {
        this.f10258g = i9;
        this.f10259h = abstractC3212e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        InterfaceC5600e2 interfaceC5600e2 = (InterfaceC5600e2) obj;
        switch (this.f10258g) {
            case 0:
                interfaceC5600e2.getClass();
                AbstractC3212e0 abstractC3212e0 = (AbstractC3212e0) interfaceC5600e2;
                InterfaceC3252r1 interfaceC3252r1 = this.f10259h.f10263v;
                if (!AbstractC1416l.m3825a(abstractC3212e0.f10262u, interfaceC3252r1)) {
                    abstractC3212e0.f10262u = interfaceC3252r1;
                    abstractC3212e0.mo6895l1();
                }
                return EnumC5596d2.f22748h;
            default:
                interfaceC5600e2.getClass();
                this.f10259h.f10262u = ((AbstractC3212e0) interfaceC5600e2).f10263v;
                return Boolean.FALSE;
        }
    }
}
