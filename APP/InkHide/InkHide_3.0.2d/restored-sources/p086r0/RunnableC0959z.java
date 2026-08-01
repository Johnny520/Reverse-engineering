package p086r0;

import android.widget.ListView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: r0.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0959z implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0832E f3448b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0959z(C0829D c0829d, C0832E c0832e) {
        this.f3447a = 2;
        this.f3448b = c0832e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        ListView listView;
        ListView listView2;
        ListView listView3;
        ListView listView4;
        ListView listView5;
        ListView listView6;
        switch (this.f3447a) {
            case 0:
                C0832E c0832e = this.f3448b;
                try {
                    WeakReference weakReference = c0832e.f2778a;
                    if (weakReference != null && (listView2 = (ListView) weakReference.get()) != null) {
                        listView2.invalidateViews();
                    }
                    WeakReference weakReference2 = c0832e.f2778a;
                    if (weakReference2 != null && (listView = (ListView) weakReference2.get()) != null) {
                        listView.requestLayout();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 1:
                C0832E c0832e2 = this.f3448b;
                try {
                    WeakReference weakReference3 = c0832e2.f2778a;
                    if (weakReference3 != null && (listView4 = (ListView) weakReference3.get()) != null) {
                        listView4.invalidateViews();
                    }
                    WeakReference weakReference4 = c0832e2.f2778a;
                    if (weakReference4 != null && (listView3 = (ListView) weakReference4.get()) != null) {
                        listView3.requestLayout();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            default:
                C0832E c0832e3 = this.f3448b;
                try {
                    WeakReference weakReference5 = c0832e3.f2778a;
                    if (weakReference5 != null && (listView6 = (ListView) weakReference5.get()) != null) {
                        listView6.invalidateViews();
                    }
                    WeakReference weakReference6 = c0832e3.f2778a;
                    if (weakReference6 != null && (listView5 = (ListView) weakReference6.get()) != null) {
                        listView5.requestLayout();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0959z(C0832E c0832e, int i2) {
        this.f3447a = i2;
        this.f3448b = c0832e;
    }
}
