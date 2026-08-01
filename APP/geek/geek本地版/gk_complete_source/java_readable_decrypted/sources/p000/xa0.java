package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xa0 {

    /* JADX INFO: renamed from: c */
    public Interpolator f5147c;

    /* JADX INFO: renamed from: d */
    public ya0 f5148d;

    /* JADX INFO: renamed from: e */
    public boolean f5149e;

    /* JADX INFO: renamed from: b */
    public long f5146b = -1;

    /* JADX INFO: renamed from: f */
    public final j70 f5150f = new j70(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f5145a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m2617a() {
        if (this.f5149e) {
            ArrayList arrayList = this.f5145a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((wa0) obj).m2554b();
            }
            this.f5149e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2618b() {
        View view;
        if (this.f5149e) {
            return;
        }
        ArrayList arrayList = this.f5145a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wa0 wa0Var = (wa0) obj;
            long j = this.f5146b;
            if (j >= 0) {
                wa0Var.m2555c(j);
            }
            Interpolator interpolator = this.f5147c;
            if (interpolator != null && (view = (View) wa0Var.f4948a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f5148d != null) {
                wa0Var.m2556d(this.f5150f);
            }
            View view2 = (View) wa0Var.f4948a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f5149e = true;
    }
}
