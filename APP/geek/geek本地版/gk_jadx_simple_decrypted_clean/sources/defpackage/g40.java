package defpackage;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class g40 {
    public int a;
    public int b;
    public final ml c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final a h;

    public g40(int r3, int r4, a r5, k8 r6) {
        ml r0 = r5.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = r3;
        this.b = r4;
        this.c = r0;
        r6.a(new l0(25, this));
        this.h = r5;
    }

    public final void a() {
        HashSet r0 = this.e;
        if (this.f == true) goto L42;
        this.f = true;
        if (r0.isEmpty() == false) goto L9;
        b();
        return;
    L9:
        ArrayList r1 = new ArrayList(r0);
        int r02 = r1.size();
        int r2 = 0;
    L10:
        if (r2 >= r02) goto L57;
        Object r3 = r1.get(r2);
        r2 = r2 + 1;
        k8 r32 = (k8) r3;
        monitor-enter(r32);
        if (r32.a == true) goto L15;
        r32.a = true;     // Catch: Throwable -> L17
        r32.c = true;     // Catch: Throwable -> L17
        j8 r4 = r32.b;     // Catch: Throwable -> L17
        monitor-exit(r32);     // Catch: Throwable -> L17
        if (r4 != null) goto L43;
    L33:
        monitor-enter(r32);
        r32.c = false;     // Catch: Throwable -> L37
        r32.notifyAll();     // Catch: Throwable -> L37
        monitor-exit(r32);     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        throw th;
    L43:
        r4.onCancel();     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        monitor-enter(r32);
        r32.c = false;     // Catch: Throwable -> L30
        r32.notifyAll();     // Catch: Throwable -> L30
        throw th;
    L30:
        th = move-exception;
        throw th;
    L15:
        monitor-exit(r32);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        throw th;
    L57:
        return;
    }

    public final void b() {
        if (this.g == false) goto L6;
    L11:
        this.h.k();
        return;
    L6:
        if (yl.A(2) == false) goto L8;
        Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
    L8:
        this.g = true;
        ArrayList r0 = this.d;
        int r1 = r0.size();
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L11;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        ((Runnable) r3).run();
        goto L9
    }

    public final void c(int r7, int r8) {
        int r82 = z30.t(r8);
        ml r1 = this.c;
        if (r82 == 0) goto L20;
        if (r82 == 1) goto L13;
        if (r82 == 2) goto L8;
        return;
    L8:
        if (yl.A(2) == false) goto L10;
        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + r1 + " mFinalState = " + z30.v(this.a) + " -> REMOVED. mLifecycleImpact  = " + z30.u(this.b) + " to REMOVING.");
    L10:
        this.a = 1;
        this.b = 3;
        return;
    L13:
        if (this.a == 1) goto L15;
        return;
    L15:
        if (yl.A(2) == false) goto L17;
        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + r1 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + z30.u(this.b) + " to ADDING.");
    L17:
        this.a = 2;
        this.b = 2;
        return;
    L20:
        if (this.a != 1) goto L22;
        return;
    L22:
        if (yl.A(2) == false) goto L24;
        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + r1 + " mFinalState = " + z30.v(this.a) + " -> " + z30.v(r7) + ". ");
    L24:
        this.a = r7;
    }

    public final void d() {
        if (this.b != 2) goto L23;
        a r0 = this.h;
        ml r2 = r0.c;
        View r3 = r2.E.findFocus();
        if (r3 == null) goto L9;
        r2.f().k = r3;
        if (yl.A(2) == false) goto L9;
        Log.v("FragmentManager", "requestFocus: Saved focused view " + r3 + " for Fragment " + r2);
    L9:
        View r1 = this.c.A();
        if (r1.getParent() != null) goto L13;
        r0.b();
        r1.setAlpha(0.0f);
    L13:
        if (r1.getAlpha() == 0.0f) goto L15;
    L17:
        ll r02 = r2.H;
        if (r02 != null) goto L20;
        float r03 = 1.0f;
    L21:
        r1.setAlpha(r03);
        return;
    L20:
        r03 = r02.j;
        goto L21
    L15:
        if (r1.getVisibility() != 0) goto L17;
        r1.setVisibility(4);
        goto L17
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + z30.v(this.a) + "} {mLifecycleImpact = " + z30.u(this.b) + "} {mFragment = " + this.c + "}";
    }
}
