package p066g;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p052b1.AbstractC0503h;
import p099y.C1054S;

/* JADX INFO: renamed from: g.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0571k {

    /* JADX INFO: renamed from: c */
    public BaseInterpolator f1936c;

    /* JADX INFO: renamed from: d */
    public AbstractC0503h f1937d;

    /* JADX INFO: renamed from: e */
    public boolean f1938e;

    /* JADX INFO: renamed from: b */
    public long f1935b = -1;

    /* JADX INFO: renamed from: f */
    public final C0570j f1939f = new C0570j(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f1934a = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1137a() {
        if (this.f1938e) {
            Iterator it = this.f1934a.iterator();
            while (it.hasNext()) {
                ((C1054S) it.next()).m2304b();
            }
            this.f1938e = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1138b() {
        View view;
        if (this.f1938e) {
            return;
        }
        for (C1054S c1054s : this.f1934a) {
            long j2 = this.f1935b;
            if (j2 >= 0) {
                c1054s.m2305c(j2);
            }
            BaseInterpolator baseInterpolator = this.f1936c;
            if (baseInterpolator != null && (view = (View) c1054s.f3669a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f1937d != null) {
                c1054s.m2306d(this.f1939f);
            }
            View view2 = (View) c1054s.f3669a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1938e = true;
    }
}
