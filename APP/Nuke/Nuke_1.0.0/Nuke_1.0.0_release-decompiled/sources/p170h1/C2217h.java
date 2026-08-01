package p170h1;

import android.os.Parcelable;
import android.util.SparseArray;
import me.dartcv.nuke.BuildConfig;
import p041H0.C0618s0;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: h1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2217h extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7226e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2233x f7227f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2217h(C2233x c2233x, int i5) {
        super(0);
        this.f7226e = i5;
        this.f7227f = c2233x;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f7226e) {
            case 0:
                this.f7227f.getLayoutNode().m794B();
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C2233x c2233x = this.f7227f;
                if (c2233x.f7235h && c2233x.isAttachedToWindow() && c2233x.getView().getParent() == c2233x) {
                    C0618s0 snapshotObserver = c2233x.getSnapshotObserver();
                    snapshotObserver.f1972a.m3867c(c2233x, C2211b.f7204f, c2233x.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f7227f.f7288D.saveHierarchyState(sparseArray);
                break;
            case 3:
                C2233x c2233x2 = this.f7227f;
                c2233x2.getReleaseBlock().mo1h(c2233x2.f7288D);
                C2233x.m4035h(c2233x2);
                break;
            case 4:
                C2233x c2233x3 = this.f7227f;
                c2233x3.getResetBlock().mo1h(c2233x3.f7288D);
                break;
            default:
                C2233x c2233x4 = this.f7227f;
                c2233x4.getUpdateBlock().mo1h(c2233x4.f7288D);
                break;
        }
        return C0891q.f2780a;
    }
}
