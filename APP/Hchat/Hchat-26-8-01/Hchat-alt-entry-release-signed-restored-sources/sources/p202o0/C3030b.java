package p202o0;

import java.util.Collection;
import java.util.List;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3030b implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9835g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Collection f9836h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3030b(int i9, Collection collection) {
        this.f9835g = i9;
        this.f9836h = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        boolean zContains;
        switch (this.f9835g) {
            case 0:
                zContains = this.f9836h.contains(obj);
                break;
            case 1:
                zContains = this.f9836h.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.f9836h);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
