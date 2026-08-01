package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0464P;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.InterfaceC0465Q;
import androidx.lifecycle.InterfaceC0484s;
import p006D.AbstractC0079h;
import p061e.AbstractActivityC0533i;

/* JADX INFO: renamed from: androidx.fragment.app.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0437o extends AbstractC0079h implements InterfaceC0465Q, InterfaceC0484s, InterfaceC0412C {

    /* JADX INFO: renamed from: d */
    public final AbstractActivityC0533i f1394d;

    /* JADX INFO: renamed from: e */
    public final AbstractActivityC0533i f1395e;

    /* JADX INFO: renamed from: f */
    public final Handler f1396f;

    /* JADX INFO: renamed from: g */
    public final C0448z f1397g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractActivityC0533i f1398h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0437o(AbstractActivityC0533i abstractActivityC0533i) {
        this.f1398h = abstractActivityC0533i;
        Handler handler = new Handler();
        this.f1397g = new C0448z();
        this.f1394d = abstractActivityC0533i;
        this.f1395e = abstractActivityC0533i;
        this.f1396f = handler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: G */
    public final View mo201G(int i2) {
        return this.f1398h.findViewById(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: H */
    public final boolean mo202H() {
        Window window = this.f1398h.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0484s
    /* JADX INFO: renamed from: c */
    public final C0486u mo636c() {
        return this.f1398h.f1750q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0465Q
    public final C0464P getViewModelStore() {
        return this.f1398h.getViewModelStore();
    }

    @Override // androidx.fragment.app.InterfaceC0412C
    /* JADX INFO: renamed from: a */
    public final void mo785a() {
    }
}
