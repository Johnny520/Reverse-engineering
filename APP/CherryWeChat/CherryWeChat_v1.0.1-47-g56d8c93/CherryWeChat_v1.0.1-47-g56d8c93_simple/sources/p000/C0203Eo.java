package p000;

import android.widget.AbsListView;

/* JADX INFO: renamed from: Eo */
/* JADX INFO: loaded from: classes.dex */
public final class C0203Eo implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0289Go f610a;

    public C0203Eo(C0289Go r1) {
        this.f610a = r1;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView r1, int r2, int r3, int r4) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView r4, int r5) {
        C0289Go r42 = this.f610a;
        RunnableC0117Co r0 = r42.f954r;
        C0606O3 r1 = r42.f962z;
        if (r5 == 1) goto L5;
        return;
    L5:
        if (r1.getInputMethodMode() != 2) goto L8;
        return;
    L8:
        if (r1.getContentView() == null) goto L12;
        r42.f958v.removeCallbacks(r0);
        r0.run();
        return;
    }
}
