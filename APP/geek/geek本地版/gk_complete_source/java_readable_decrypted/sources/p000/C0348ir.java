package p000;

import android.widget.AbsListView;

/* JADX INFO: renamed from: ir */
/* JADX INFO: loaded from: classes.dex */
public final class C0348ir implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0421kr f2498a;

    public C0348ir(C0421kr c0421kr) {
        this.f2498a = c0421kr;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C0421kr c0421kr = this.f2498a;
        RunnableC0308hr runnableC0308hr = c0421kr.f2937r;
        C0091c4 c0091c4 = c0421kr.f2945z;
        if (i != 1 || c0091c4.getInputMethodMode() == 2 || c0091c4.getContentView() == null) {
            return;
        }
        c0421kr.f2941v.removeCallbacks(runnableC0308hr);
        runnableC0308hr.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
