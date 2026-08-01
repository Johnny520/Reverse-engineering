package defpackage;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class wz {
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;

    public final void a(RecyclerView r7) {
        int r0 = this.d;
        if (r0 < 0) goto L7;
        this.d = -1;
        r7.M(r0);
        this.f = false;
        return;
    L7:
        if (this.f == false) goto L24;
        Interpolator r02 = this.e;
        if (r02 != null) goto L11;
    L15:
        int r3 = this.c;
        if (r3 < 1) goto L23;
        r7.W.b(this.a, this.b, r3, r02);
        int r72 = this.g + 1;
        this.g = r72;
        if (r72 <= 10) goto L20;
        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
    L20:
        this.f = false;
        return;
    L23:
        throw new IllegalStateException("Scroll duration must be a positive number");
    L11:
        if (this.c >= 1) goto L15;
        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
    L24:
        this.g = 0;
    }
}
