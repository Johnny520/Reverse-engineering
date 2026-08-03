package p332wb;

import java.util.List;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: wb.nv */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5158nv implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19305g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f19306h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5158nv(List list) {
        this.f19306h = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f19305g) {
            case 0:
                String str = (String) this.f19306h.get(((Number) obj).intValue());
                str.getClass();
                return str;
            default:
                this.f19306h.get(((Number) obj).intValue());
                return null;
        }
    }

    public C5158nv(C5319sr c5319sr, List list) {
        this.f19306h = list;
    }
}
