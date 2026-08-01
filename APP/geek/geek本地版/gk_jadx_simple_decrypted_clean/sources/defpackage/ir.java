package defpackage;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class ir implements AbsListView.OnScrollListener {
    public final /* synthetic */ kr a;

    public ir(kr r1) {
        this.a = r1;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView r4, int r5) {
        kr r42 = this.a;
        hr r0 = r42.r;
        c4 r1 = r42.z;
        if (r5 == 1) goto L5;
        return;
    L5:
        if (r1.getInputMethodMode() != 2) goto L8;
        return;
    L8:
        if (r1.getContentView() == null) goto L12;
        r42.v.removeCallbacks(r0);
        r0.run();
        return;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView r1, int r2, int r3, int r4) {
    }
}
