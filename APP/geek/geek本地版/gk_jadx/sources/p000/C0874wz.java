package p000;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: wz */
/* JADX INFO: loaded from: classes.dex */
public final class C0874wz {

    /* JADX INFO: renamed from: a */
    public int f5068a;

    /* JADX INFO: renamed from: b */
    public int f5069b;

    /* JADX INFO: renamed from: c */
    public int f5070c;

    /* JADX INFO: renamed from: d */
    public int f5071d;

    /* JADX INFO: renamed from: e */
    public Interpolator f5072e;

    /* JADX INFO: renamed from: f */
    public boolean f5073f;

    /* JADX INFO: renamed from: g */
    public int f5074g;

    /* JADX INFO: renamed from: a */
    public final void m2602a(RecyclerView recyclerView) {
        int i = this.f5071d;
        if (i >= 0) {
            this.f5071d = -1;
            recyclerView.m383M(i);
            this.f5073f = false;
            return;
        }
        if (!this.f5073f) {
            this.f5074g = 0;
            return;
        }
        Interpolator interpolator = this.f5072e;
        if (interpolator != null && this.f5070c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f5070c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f582W.m4b(this.f5068a, this.f5069b, i2, interpolator);
        int i3 = this.f5074g + 1;
        this.f5074g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f5073f = false;
    }
}
