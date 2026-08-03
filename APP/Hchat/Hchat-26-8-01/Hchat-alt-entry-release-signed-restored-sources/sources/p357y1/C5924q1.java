package p357y1;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: renamed from: y1.q1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5924q1 {

    /* JADX INFO: renamed from: a */
    public final C5918p f24034a;

    /* JADX INFO: renamed from: b */
    public int f24035b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f24036c;

    /* JADX INFO: renamed from: d */
    public final GestureDetector f24037d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5924q1(Context context, C5918p c5918p) {
        this.f24034a = c5918p;
        this.f24037d = new GestureDetector(context, new GestureDetectorOnGestureListenerC5920p1(this));
    }
}
