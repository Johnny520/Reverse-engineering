package p000;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class d00 {

    /* JADX INFO: renamed from: a */
    public int f1275a;

    /* JADX INFO: renamed from: b */
    public int f1276b;

    /* JADX INFO: renamed from: c */
    public int f1277c;

    /* JADX INFO: renamed from: d */
    public int f1278d;

    /* JADX INFO: renamed from: e */
    public Interpolator f1279e;

    /* JADX INFO: renamed from: f */
    public boolean f1280f;

    /* JADX INFO: renamed from: g */
    public int f1281g;

    /* JADX INFO: renamed from: a */
    public final void m813a(RecyclerView recyclerView) {
        int i = this.f1278d;
        if (i >= 0) {
            this.f1278d = -1;
            recyclerView.m368M(i);
            this.f1280f = false;
            return;
        }
        if (!this.f1280f) {
            this.f1281g = 0;
            return;
        }
        Interpolator interpolator = this.f1279e;
        if (interpolator != null && this.f1277c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f1277c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f545W.m1350b(this.f1275a, this.f1276b, i2, interpolator);
        int i3 = this.f1281g + 1;
        this.f1281g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f1280f = false;
    }
}
