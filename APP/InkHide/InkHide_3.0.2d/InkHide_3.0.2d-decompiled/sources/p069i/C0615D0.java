package p069i;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: renamed from: i.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0615D0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0619F0 f2123a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0615D0(AbstractC0619F0 abstractC0619F0) {
        this.f2123a = abstractC0619F0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            AbstractC0619F0 abstractC0619F0 = this.f2123a;
            if (abstractC0619F0.f2152z.getInputMethodMode() == 2 || abstractC0619F0.f2152z.getContentView() == null) {
                return;
            }
            Handler handler = abstractC0619F0.f2148v;
            RunnableC0613C0 runnableC0613C0 = abstractC0619F0.f2144r;
            handler.removeCallbacks(runnableC0613C0);
            runnableC0613C0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
