package p016b1;

import androidx.lifecycle.C0119x;
import gg.AbstractC1417m;
import gg.C1421q;
import p085fg.InterfaceC1231l;
import p267s1.AbstractC3893f;
import p292u1.AbstractC4229a;
import p339x1.EnumC5596d2;

/* JADX INFO: renamed from: b1.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0165e extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f433g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1421q f434h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0165e(C0119x c0119x, C0168h c0168h, C1421q c1421q) {
        super(1);
        this.f434h = c1421q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f433g) {
            case 0:
                C0168h c0168h = (C0168h) obj;
                if (c0168h.f23801t) {
                    if (c0168h.f442v != null) {
                        AbstractC4229a.m8494b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    }
                    c0168h.f442v = null;
                    C1421q c1421q = this.f434h;
                    c1421q.f4734g = c1421q.f4734g;
                }
                break;
            default:
                if (((AbstractC3893f) obj).f12766w) {
                    this.f434h.f4734g = false;
                }
                break;
        }
        return EnumC5596d2.f22747g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0165e(C1421q c1421q) {
        super(1);
        this.f434h = c1421q;
    }
}
