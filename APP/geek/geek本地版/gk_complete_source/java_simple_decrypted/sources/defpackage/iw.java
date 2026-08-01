package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class iw {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public iw(ViewGroup r1) {
        this.c = r1;
    }

    public final boolean a(float r4, float r5, boolean r6) {
        if (this.d == false) goto L11;
        ViewParent r0 = e(0);
        if (r0 == null) goto L11;
        return ua0.a(r0, this.c, r4, r5, r6);
    L9:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r0 + " does not implement interface method onNestedFling", e);
    L11:
        return false;
    }

    public final boolean b(float r4, float r5) {
        if (this.d == false) goto L11;
        ViewParent r0 = e(0);
        if (r0 == null) goto L11;
        return ua0.b(r0, this.c, r4, r5);
    L9:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r0 + " does not implement interface method onNestedPreFling", e);
    L11:
        return false;
    }

    public final boolean c(int r13, int r14, int[] r15, int[] r16, int r17) {
        if (this.d == false) goto L41;
        ViewParent r2 = e(r17);
        if (r2 != null) goto L8;
        return false;
    L8:
        if (r13 != 0) goto L14;
        if (r14 != 0) goto L14;
        if (r16 == null) goto L42;
        r16[0] = 0;
        r16[1] = 0;
        return false;
    L42:
        return false;
    L14:
        ViewGroup r3 = this.c;
        if (r16 == null) goto L17;
        r3.getLocationInWindow(r16);
        int r10 = r16[0];
        int r11 = r16[1];
    L18:
        if (r15 == null) goto L20;
    L23:
        int[] r6 = r15;
        r6[0] = 0;
        r6[1] = 0;
        if ((r2 instanceof jw) == false) goto L26;
        ((jw) r2).c(r3, r13, r14, r6, r17);
    L31:
        if (r16 == null) goto L34;
        r3.getLocationInWindow(r16);
        r16[0] = r16[0] - r10;
        r16[1] = r16[1] - r11;
    L34:
        if (r6[0] != 0) goto L38;
        if (r6[1] != 0) goto L38;
        return false;
    L38:
        return true;
    L26:
        if (r17 != 0) goto L31;
        ua0.c(r2, r3, r13, r14, r6);     // Catch: AbstractMethodError -> L29
    L29:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r2 + " does not implement interface method onNestedPreScroll", e);
        goto L31
    L20:
        if (this.e != null) goto L22;
        this.e = new int[2];
    L22:
        r15 = this.e;
        goto L23
    L17:
        r10 = 0;
        r11 = 0;
        goto L18
    L41:
        return false;
    }

    public final boolean d(int r15, int r16, int r17, int r18, int[] r19, int r20, int[] r21) {
        if (this.d == false) goto L41;
        ViewParent r2 = e(r20);
        if (r2 == null) goto L41;
        if (r15 != 0) goto L16;
        if (r16 != 0) goto L16;
        if (r17 != 0) goto L16;
        if (r18 != 0) goto L16;
        if (r19 == null) goto L41;
        r19[0] = 0;
        r19[1] = 0;
        return false;
    L16:
        ViewGroup r3 = this.c;
        if (r19 == null) goto L19;
        r3.getLocationInWindow(r19);
        int r12 = r19[0];
        int r13 = r19[1];
    L20:
        if (r21 == null) goto L22;
        int[] r9 = r21;
    L27:
        if ((r2 instanceof kw) == false) goto L29;
        ((kw) r2).d(r3, r15, r16, r17, r18, r20, r9);
    L38:
        if (r19 == null) goto L40;
        r3.getLocationInWindow(r19);
        r19[0] = r19[0] - r12;
        r19[1] = r19[1] - r13;
    L40:
        return true;
    L29:
        r9[0] = r9[0] + r17;
        r9[1] = r9[1] + r18;
        if ((r2 instanceof jw) == false) goto L32;
        ((jw) r2).e(r3, r15, r16, r17, r18, r20);
        goto L38
    L32:
        if (r20 != 0) goto L38;
        ua0.d(r2, r3, r15, r16, r17, r18);     // Catch: AbstractMethodError -> L36
    L36:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r2 + " does not implement interface method onNestedScroll", e);
        goto L38
    L22:
        if (this.e != null) goto L24;
        this.e = new int[2];
    L24:
        int[] r0 = this.e;
        r0[0] = 0;
        r0[1] = 0;
        r9 = r0;
        goto L27
    L19:
        r12 = 0;
        r13 = 0;
    L41:
        return false;
    }

    public final ViewParent e(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L8;
        return null;
    L8:
        return this.b;
    L10:
        return this.a;
    }

    public final boolean f(int r1) {
        if (e(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean g(int r12, int r13) {
        if (f(r13) == false) goto L6;
    L31:
        return true;
    L6:
        if (this.d == false) goto L36;
        ViewGroup r0 = this.c;
        ViewParent r3 = r0.getParent();
        View r4 = r0;
    L8:
        if (r3 == null) goto L36;
        boolean r5 = r3 instanceof jw;
        if (r5 == false) goto L12;
        boolean r8 = ((jw) r3).f(r4, r0, r12, r13);
    L18:
        if (r8 == true) goto L19;
        if ((r3 instanceof View) == false) goto L35;
        r4 = (View) r3;
    L35:
        r3 = r3.getParent();
        goto L8
    L19:
        if (r13 == 0) goto L23;
        if (r13 != 1) goto L24;
        this.b = r3;
    L24:
        if (r5 == false) goto L26;
        ((jw) r3).a(r4, r0, r12, r13);
        goto L31
    L26:
        if (r13 != 0) goto L31;
        ua0.e(r3, r4, r0, r12);     // Catch: AbstractMethodError -> L29
    L29:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r3 + " does not implement interface method onNestedScrollAccepted", e);
        goto L31
    L23:
        this.a = r3;
        goto L24
    L12:
        if (r13 == 0) goto L37;
    L17:
        r8 = false;
        goto L18
    L37:
        r8 = ua0.f(r3, r4, r0, r12);     // Catch: AbstractMethodError -> L15
    L15:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r3 + " does not implement interface method onStartNestedScroll", e);
    L36:
        return false;
    }

    public final void h(int r5) {
        ViewParent r0 = e(r5);
        if (r0 == null) goto L22;
        boolean r1 = r0 instanceof jw;
        ViewGroup r2 = this.c;
        if (r1 == false) goto L7;
        ((jw) r0).b(r2, r5);
    L13:
        if (r5 != 0) goto L15;
        this.a = null;
        return;
    L15:
        if (r5 != 1) goto L24;
        this.b = null;
        return;
    L24:
        return;
    L7:
        if (r5 != 0) goto L13;
        ua0.g(r0, r2);     // Catch: AbstractMethodError -> L10
    L10:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r0 + " does not implement interface method onStopNestedScroll", e);
        goto L13
    }
}
