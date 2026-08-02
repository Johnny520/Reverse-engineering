package p000;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yy0 {

    /* JADX INFO: renamed from: a */
    public final C0836w6 f13670a;

    /* JADX INFO: renamed from: b */
    public int f13671b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f13672c;

    /* JADX INFO: renamed from: d */
    public final GestureDetector f13673d;

    public yy0(Context context, C0836w6 c0836w6) {
        this.f13670a = c0836w6;
        this.f13673d = new GestureDetector(context, new xy0(this));
    }
}
