package p057g;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: renamed from: g.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0915m0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0919o0 f3238a;

    public C0915m0(AbstractC0919o0 r1) {
        this.f3238a = r1;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView r1, int r2, int r3, int r4) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView r2, int r3) {
        if (r3 != 1) goto L11;
        AbstractC0919o0 r22 = this.f3238a;
        if (r22.f3272v.getInputMethodMode() != 2) goto L8;
        return;
    L8:
        if (r22.f3272v.getContentView() == null) goto L12;
        Handler r32 = r22.f3268r;
        RunnableC0911k0 r23 = r22.f3264n;
        r32.removeCallbacks(r23);
        r23.run();
        return;
    L12:
        return;
    }
}
