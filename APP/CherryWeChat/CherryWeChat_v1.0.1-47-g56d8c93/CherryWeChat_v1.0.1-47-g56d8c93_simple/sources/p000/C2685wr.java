package p000;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: wr */
/* JADX INFO: loaded from: classes.dex */
public final class C2685wr implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2728xr f9246a;

    public C2685wr(C2728xr r1) {
        this.f9246a = r1;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9246a.mo5292c();
    }
}
