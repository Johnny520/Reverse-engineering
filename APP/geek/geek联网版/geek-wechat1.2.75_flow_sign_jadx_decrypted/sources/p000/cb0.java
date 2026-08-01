package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cb0 {

    /* JADX INFO: renamed from: c */
    public Interpolator f872c;

    /* JADX INFO: renamed from: d */
    public db0 f873d;

    /* JADX INFO: renamed from: e */
    public boolean f874e;

    /* JADX INFO: renamed from: b */
    public long f871b = -1;

    /* JADX INFO: renamed from: f */
    public final p70 f875f = new p70(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f870a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m610a() {
        if (this.f874e) {
            ArrayList arrayList = this.f870a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((bb0) obj).m508b();
            }
            this.f874e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m611b() {
        View view;
        if (this.f874e) {
            return;
        }
        ArrayList arrayList = this.f870a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bb0 bb0Var = (bb0) obj;
            long j = this.f871b;
            if (j >= 0) {
                bb0Var.m509c(j);
            }
            Interpolator interpolator = this.f872c;
            if (interpolator != null && (view = (View) bb0Var.f708a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f873d != null) {
                bb0Var.m510d(this.f875f);
            }
            View view2 = (View) bb0Var.f708a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f874e = true;
    }
}
