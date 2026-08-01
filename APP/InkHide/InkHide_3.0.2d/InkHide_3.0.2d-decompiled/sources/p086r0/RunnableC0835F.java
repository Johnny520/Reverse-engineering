package p086r0;

import android.view.View;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.F */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0835F implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2795a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ListView f2796b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0894d0 f2797c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0835F(ListView listView, C0894d0 c0894d0) {
        this.f2796b = listView;
        this.f2797c = c0894d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2795a) {
            case 0:
                this.f2797c.f3134m = false;
                ListView listView = this.f2796b;
                try {
                    listView.invalidateViews();
                    listView.requestLayout();
                } catch (Throwable unused) {
                    return;
                }
                break;
            default:
                ListView listView2 = this.f2796b;
                int childCount = listView2.getChildCount();
                int i2 = 0;
                while (true) {
                    C0894d0 c0894d0 = this.f2797c;
                    if (i2 >= childCount) {
                        WeakReference weakReference = c0894d0.f3122a;
                        c0894d0.m1904o(weakReference != null ? weakReference.get() : null, listView2, null);
                        listView2.invalidateViews();
                        listView2.requestLayout();
                    } else {
                        View childAt = listView2.getChildAt(i2);
                        AbstractC0223g.m417d(childAt, "getChildAt(...)");
                        c0894d0.m1887U0(childAt);
                        i2++;
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0835F(C0894d0 c0894d0, ListView listView) {
        this.f2797c = c0894d0;
        this.f2796b = listView;
    }
}
