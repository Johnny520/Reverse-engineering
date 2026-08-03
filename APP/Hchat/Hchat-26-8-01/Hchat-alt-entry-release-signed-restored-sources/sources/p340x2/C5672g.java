package p340x2;

import android.os.Parcelable;
import android.util.SparseArray;
import gg.AbstractC1417m;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;
import p339x1.C5647t1;

/* JADX INFO: renamed from: x2.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5672g extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23077g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5687v f23078h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5672g(C5687v c5687v, int i9) {
        super(0);
        this.f23077g = i9;
        this.f23078h = c5687v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f23077g) {
            case 0:
                this.f23078h.getLayoutNode().m10005B();
                break;
            case 1:
                C5687v c5687v = this.f23078h;
                if (c5687v.f23089k && c5687v.isAttachedToWindow() && c5687v.getView().getParent() == c5687v) {
                    C5647t1 snapshotObserver = c5687v.getSnapshotObserver();
                    snapshotObserver.f23001a.m9162c(c5687v, C5667b.f23059h, c5687v.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f23078h.f23138G.saveHierarchyState(sparseArray);
                break;
            case 3:
                C5687v c5687v2 = this.f23078h;
                c5687v2.getReleaseBlock().invoke(c5687v2.f23138G);
                C5687v.m10240h(c5687v2);
                break;
            case 4:
                C5687v c5687v3 = this.f23078h;
                c5687v3.getResetBlock().invoke(c5687v3.f23138G);
                break;
            default:
                C5687v c5687v4 = this.f23078h;
                c5687v4.getUpdateBlock().invoke(c5687v4.f23138G);
                break;
        }
        return C3967n.f12976a;
    }
}
