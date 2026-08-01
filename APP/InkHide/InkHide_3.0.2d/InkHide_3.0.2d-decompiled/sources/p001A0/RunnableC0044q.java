package p001A0;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import java.util.concurrent.ConcurrentHashMap;
import p086r0.C0901f1;
import p102z0.AbstractC1140w;

/* JADX INFO: renamed from: A0.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0044q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f271a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f272b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f273c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0044q(View view, int i2, int i3) {
        this.f271a = i3;
        this.f273c = view;
        this.f272b = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f272b;
        View view = this.f273c;
        switch (this.f271a) {
            case 0:
                ProgressBar progressBar = (ProgressBar) ((LinearLayout) view).findViewWithTag("progress");
                if (progressBar != null) {
                    progressBar.setProgress(i2 + 1);
                }
                break;
            default:
                ConcurrentHashMap concurrentHashMap = AbstractC1140w.f3846a;
                AbstractC1140w.m2521o(view, i2, C0901f1.f3167j, 0);
                AbstractC1140w.m2522p(view, 0);
                break;
        }
    }
}
