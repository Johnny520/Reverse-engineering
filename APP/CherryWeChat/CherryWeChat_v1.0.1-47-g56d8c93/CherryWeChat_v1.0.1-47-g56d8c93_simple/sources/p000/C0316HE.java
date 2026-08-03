package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: HE */
/* JADX INFO: loaded from: classes.dex */
public final class C0316HE {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1037a;

    /* JADX INFO: renamed from: b */
    public long f1038b;

    /* JADX INFO: renamed from: c */
    public Interpolator f1039c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0359IE f1040d;

    /* JADX INFO: renamed from: e */
    public boolean f1041e;

    /* JADX INFO: renamed from: f */
    public final C2620vB f1042f;

    public C0316HE() {
        this.f1038b = -1;
        this.f1042f = new C2620vB(this);
        this.f1037a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m668a() {
        if (this.f1041e == true) goto L5;
        return;
    L5:
        Iterator r0 = this.f1037a.iterator();
    L7:
        if (r0.hasNext() == false) goto L9;
        ((C0273GE) r0.next()).m554b();
        goto L7
    L9:
        this.f1041e = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m669b() {
        if (this.f1041e == false) goto L5;
        return;
    L5:
        Iterator r0 = this.f1037a.iterator();
    L7:
        if (r0.hasNext() == false) goto L22;
        C0273GE r1 = (C0273GE) r0.next();
        long r2 = this.f1038b;
        if (r2 < 0) goto L11;
        r1.m555c(r2);
    L11:
        Interpolator r22 = this.f1039c;
        if (r22 == null) goto L17;
        View r3 = (View) r1.f890a.get();
        if (r3 == null) goto L17;
        r3.animate().setInterpolator(r22);
    L17:
        if (this.f1040d == null) goto L19;
        r1.m556d(this.f1042f);
    L19:
        View r12 = (View) r1.f890a.get();
        if (r12 == null) goto L7;
        r12.animate().start();
        goto L7
    L22:
        this.f1041e = true;
    }
}
