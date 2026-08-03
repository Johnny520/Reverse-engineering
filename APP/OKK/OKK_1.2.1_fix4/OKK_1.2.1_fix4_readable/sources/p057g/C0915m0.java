package p057g;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: renamed from: g.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0915m0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0919o0 f3238a;

    public C0915m0(AbstractC0919o0 abstractC0919o0) {
        this.f3238a = abstractC0919o0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            AbstractC0919o0 abstractC0919o0 = this.f3238a;
            if (abstractC0919o0.f3272v.getInputMethodMode() == 2 || abstractC0919o0.f3272v.getContentView() == null) {
                return;
            }
            Handler handler = abstractC0919o0.f3268r;
            RunnableC0911k0 runnableC0911k0 = abstractC0919o0.f3264n;
            handler.removeCallbacks(runnableC0911k0);
            runnableC0911k0.run();
        }
    }
}
