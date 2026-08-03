package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: HE */
/* JADX INFO: loaded from: classes.dex */
public final class C0316HE {

    /* JADX INFO: renamed from: c */
    public Interpolator f1039c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0359IE f1040d;

    /* JADX INFO: renamed from: e */
    public boolean f1041e;

    /* JADX INFO: renamed from: b */
    public long f1038b = -1;

    /* JADX INFO: renamed from: f */
    public final C2620vB f1042f = new C2620vB(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f1037a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m668a() {
        if (this.f1041e) {
            Iterator it = this.f1037a.iterator();
            while (it.hasNext()) {
                ((C0273GE) it.next()).m554b();
            }
            this.f1041e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m669b() {
        View view;
        if (this.f1041e) {
            return;
        }
        for (C0273GE c0273ge : this.f1037a) {
            long j = this.f1038b;
            if (j >= 0) {
                c0273ge.m555c(j);
            }
            Interpolator interpolator = this.f1039c;
            if (interpolator != null && (view = (View) c0273ge.f890a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f1040d != null) {
                c0273ge.m556d(this.f1042f);
            }
            View view2 = (View) c0273ge.f890a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1041e = true;
    }
}
