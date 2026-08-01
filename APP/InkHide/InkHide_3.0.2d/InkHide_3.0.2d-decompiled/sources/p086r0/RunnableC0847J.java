package p086r0;

import android.view.View;
import android.widget.ListView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: r0.J */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0847J implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0894d0 f2899b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0847J(C0894d0 c0894d0, int i2) {
        this.f2898a = i2;
        this.f2899b = c0894d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2898a) {
            case 0:
                this.f2899b.m1882Q0();
                break;
            case 1:
                C0894d0 c0894d0 = this.f2899b;
                if (c0894d0.f3145x) {
                    c0894d0.m1882Q0();
                }
                break;
            default:
                C0894d0 c0894d02 = this.f2899b;
                WeakReference weakReference = c0894d02.f3122a;
                Object obj = weakReference != null ? weakReference.get() : null;
                if (c0894d02.f3145x && obj != null) {
                    WeakReference weakReference2 = c0894d02.f3123b;
                    ListView listView = weakReference2 != null ? (ListView) weakReference2.get() : null;
                    WeakReference weakReference3 = c0894d02.f3124c;
                    if (C0894d0.m1855p0(obj, listView, weakReference3 != null ? (View) weakReference3.get() : null)) {
                        c0894d02.m1882Q0();
                    }
                    break;
                }
                break;
        }
    }
}
