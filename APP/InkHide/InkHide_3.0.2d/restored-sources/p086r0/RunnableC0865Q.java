package p086r0;

import android.view.View;
import android.widget.ListView;

/* JADX INFO: renamed from: r0.Q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0865Q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2977a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0894d0 f2978b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2979c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ListView f2980d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f2981e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0865Q(View view, C0894d0 c0894d0, Object obj, ListView listView) {
        this.f2981e = view;
        this.f2978b = c0894d0;
        this.f2979c = obj;
        this.f2980d = listView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2977a) {
            case 0:
                C0894d0 c0894d0 = this.f2978b;
                View view = this.f2981e;
                c0894d0.m1892Z0(view);
                c0894d0.m1904o(this.f2979c, this.f2980d, view);
                break;
            default:
                this.f2978b.m1904o(this.f2979c, this.f2980d, this.f2981e);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0865Q(C0894d0 c0894d0, Object obj, ListView listView, View view) {
        this.f2978b = c0894d0;
        this.f2979c = obj;
        this.f2980d = listView;
        this.f2981e = view;
    }
}
