package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;

/* JADX INFO: renamed from: Gs */
/* JADX INFO: loaded from: classes.dex */
public final class C0293Gs {

    /* JADX INFO: renamed from: a */
    public ViewParent f989a;

    /* JADX INFO: renamed from: b */
    public ViewParent f990b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f991c;

    /* JADX INFO: renamed from: d */
    public boolean f992d;

    /* JADX INFO: renamed from: e */
    public int[] f993e;

    public C0293Gs(ViewGroup r1) {
        this.f991c = r1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m592a(float r4, float r5, boolean r6) {
        if (this.f992d == false) goto L10;
        ViewParent r0 = m596e(0);
        if (r0 == null) goto L10;
        return r0.onNestedFling(this.f991c, r4, r5, r6);
    L9:
        Objects.toString(r0);
    L10:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m593b(float r4, float r5) {
        if (this.f992d == false) goto L10;
        ViewParent r0 = m596e(0);
        if (r0 == null) goto L10;
        return r0.onNestedPreFling(this.f991c, r4, r5);
    L9:
        Objects.toString(r0);
    L10:
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m594c(int r11, int r12, int[] r13, int[] r14, int r15) {
        if (this.f992d == false) goto L40;
        ViewParent r0 = m596e(r15);
        if (r0 != null) goto L8;
        return false;
    L8:
        if (r11 != 0) goto L14;
        if (r12 != 0) goto L14;
        if (r14 == null) goto L41;
        r14[0] = 0;
        r14[1] = 0;
        return false;
    L41:
        return false;
    L14:
        ViewGroup r1 = this.f991c;
        if (r14 == null) goto L17;
        r1.getLocationInWindow(r14);
        int r8 = r14[0];
        int r9 = r14[1];
    L18:
        if (r13 == null) goto L20;
    L23:
        int[] r4 = r13;
        r4[0] = 0;
        r4[1] = 0;
        if ((r0 instanceof InterfaceC0336Hs) == false) goto L26;
        ((InterfaceC0336Hs) r0).mo722c(r1, r11, r12, r4, r15);
    L30:
        if (r14 == null) goto L33;
        r1.getLocationInWindow(r14);
        r14[0] = r14[0] - r8;
        r14[1] = r14[1] - r9;
    L33:
        if (r4[0] != 0) goto L37;
        if (r4[1] != 0) goto L37;
        return false;
    L37:
        return true;
    L26:
        if (r15 != 0) goto L30;
        r0.onNestedPreScroll(r1, r11, r12, r4);     // Catch: AbstractMethodError -> L29
    L29:
        Objects.toString(r0);
        goto L30
    L20:
        if (this.f993e != null) goto L22;
        this.f993e = new int[2];
    L22:
        r13 = this.f993e;
        goto L23
    L17:
        r8 = 0;
        r9 = 0;
        goto L18
    L40:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m595d(int r14, int r15, int r16, int r17, int[] r18, int r19, int[] r20) {
        if (this.f992d == false) goto L41;
        ViewParent r2 = m596e(r19);
        if (r2 == null) goto L41;
        if (r14 != 0) goto L16;
        if (r15 != 0) goto L16;
        if (r16 != 0) goto L16;
        if (r17 != 0) goto L16;
        if (r18 == null) goto L41;
        r18[0] = 0;
        r18[1] = 0;
        return false;
    L16:
        ViewGroup r3 = this.f991c;
        if (r18 == null) goto L19;
        r3.getLocationInWindow(r18);
        int r11 = r18[0];
        int r12 = r18[1];
    L20:
        if (r20 == null) goto L22;
        int[] r8 = r20;
    L27:
        if ((r2 instanceof InterfaceC0379Is) == false) goto L30;
        InterfaceC0379Is r1 = (InterfaceC0379Is) r2;
        ViewGroup r22 = r3;
        r1.mo820d(r22, r14, r15, r16, r17, r19, r8);
    L29:
        r3 = r22;
    L38:
        if (r18 == null) goto L40;
        r3.getLocationInWindow(r18);
        r18[0] = r18[0] - r11;
        r18[1] = r18[1] - r12;
    L40:
        return true;
    L30:
        r8[0] = r8[0] + r16;
        r8[1] = r8[1] + r17;
        if ((r2 instanceof InterfaceC0336Hs) == false) goto L33;
        InterfaceC0336Hs r13 = (InterfaceC0336Hs) r2;
        r22 = r3;
        r13.mo723e(r22, r14, r15, r16, r17, r19);
        goto L29
    L33:
        if (r19 != 0) goto L38;
        r2.onNestedScroll(r3, r14, r15, r16, r17);     // Catch: AbstractMethodError -> L37
    L37:
        Objects.toString(r2);
        goto L38
    L22:
        if (this.f993e != null) goto L24;
        this.f993e = new int[2];
    L24:
        int[] r110 = this.f993e;
        r110[0] = 0;
        r110[1] = 0;
        r8 = r110;
        goto L27
    L19:
        r11 = 0;
        r12 = 0;
    L41:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final ViewParent m596e(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L8;
        return null;
    L8:
        return this.f990b;
    L10:
        return this.f989a;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m597f(int r1) {
        if (m596e(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m598g(int r8, int r9) {
        if (m597f(r9) == false) goto L6;
    L29:
        return true;
    L6:
        if (this.f992d == false) goto L34;
        View r0 = this.f991c;
        ViewParent r3 = r0.getParent();
        View r4 = r0;
    L8:
        if (r3 == null) goto L34;
        boolean r5 = r3 instanceof InterfaceC0336Hs;
        if (r5 == false) goto L12;
        boolean r6 = ((InterfaceC0336Hs) r3).mo724f(r4, r0, r8, r9);
    L17:
        if (r6 == true) goto L18;
        if ((r3 instanceof View) == false) goto L33;
        r4 = (View) r3;
    L33:
        r3 = r3.getParent();
        goto L8
    L18:
        if (r9 == 0) goto L22;
        if (r9 != 1) goto L23;
        this.f990b = r3;
    L23:
        if (r5 == false) goto L25;
        ((InterfaceC0336Hs) r3).mo720a(r4, r0, r8, r9);
        goto L29
    L25:
        if (r9 != 0) goto L29;
        r3.onNestedScrollAccepted(r4, r0, r8);     // Catch: AbstractMethodError -> L28
    L28:
        Objects.toString(r3);
        goto L29
    L22:
        this.f989a = r3;
        goto L23
    L12:
        if (r9 == 0) goto L35;
    L16:
        r6 = false;
        goto L17
    L35:
        r6 = r3.onStartNestedScroll(r4, r0, r8);     // Catch: AbstractMethodError -> L15
    L15:
        Objects.toString(r3);
    L34:
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m599h(int r4) {
        ViewParent r0 = m596e(r4);
        if (r0 == null) goto L21;
        boolean r1 = r0 instanceof InterfaceC0336Hs;
        ViewGroup r2 = this.f991c;
        if (r1 == false) goto L7;
        ((InterfaceC0336Hs) r0).mo721b(r2, r4);
    L12:
        if (r4 != 0) goto L14;
        this.f989a = null;
        return;
    L14:
        if (r4 != 1) goto L23;
        this.f990b = null;
        return;
    L23:
        return;
    L7:
        if (r4 != 0) goto L12;
        r0.onStopNestedScroll(r2);     // Catch: AbstractMethodError -> L10
    L10:
        Objects.toString(r0);
        goto L12
    }
}
