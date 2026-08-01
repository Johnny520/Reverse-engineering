package p047I0;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: renamed from: I0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0773y0 {

    /* JADX INFO: renamed from: a */
    public final C0758r f2511a;

    /* JADX INFO: renamed from: b */
    public int f2512b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f2513c;

    /* JADX INFO: renamed from: d */
    public final GestureDetector f2514d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0773y0(Context context, C0758r c0758r) {
        this.f2511a = c0758r;
        this.f2514d = new GestureDetector(context, new GestureDetectorOnGestureListenerC0771x0(this));
    }
}
