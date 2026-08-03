package p006D;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* JADX INFO: renamed from: D.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0113m {

    /* JADX INFO: renamed from: a */
    public ViewParent f295a;

    /* JADX INFO: renamed from: b */
    public ViewParent f296b;

    /* JADX INFO: renamed from: c */
    public final View f297c;

    /* JADX INFO: renamed from: d */
    public boolean f298d;

    /* JADX INFO: renamed from: e */
    public int[] f299e;

    public C0113m(View r1) {
        this.f297c = r1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m409a(float r4, float r5, boolean r6) {
        if (this.f298d == false) goto L13;
        ViewParent r02 = m414f(0);
        if (r02 != null) goto L11;
        return false;
    L11:
        return AbstractC0084V.m299a(r02, this.f297c, r4, r5, r6);
    L9:
        Objects.toString(r02);
        return false;
    L13:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m410b(float r4, float r5) {
        if (this.f298d == false) goto L13;
        ViewParent r02 = m414f(0);
        if (r02 != null) goto L11;
        return false;
    L11:
        return AbstractC0084V.m300b(r02, this.f297c, r4, r5);
    L9:
        Objects.toString(r02);
        return false;
    L13:
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m411c(int r15, int r16, int[] r17, int[] r18, int r19) {
        if (this.f298d == false) goto L40;
        ViewParent r1 = m414f(r19);
        if (r1 != null) goto L8;
        return false;
    L8:
        if (r15 != 0) goto L13;
        if (r16 != 0) goto L13;
        if (r18 == null) goto L41;
        r18[0] = 0;
        r18[1] = 0;
        return false;
    L41:
        return false;
    L13:
        View r10 = this.f297c;
        if (r18 == null) goto L16;
        r10.getLocationInWindow(r18);
        int r11 = r18[0];
        int r12 = r18[1];
    L17:
        if (r17 == null) goto L19;
        int[] r13 = r17;
    L23:
        r13[0] = 0;
        r13[1] = 0;
        boolean r2 = r1 instanceof InterfaceC0115n;
        View r5 = this.f297c;
        if (r2 == false) goto L26;
        ((InterfaceC0115n) r1).mo424e(r5, r15, r16, r13, r19);
    L30:
        if (r18 == null) goto L33;
        r10.getLocationInWindow(r18);
        r18[0] = r18[0] - r11;
        r18[1] = r18[1] - r12;
    L33:
        if (r13[0] != 0) goto L37;
        if (r13[1] != 0) goto L37;
        return false;
    L37:
        return true;
    L26:
        if (r19 != 0) goto L30;
        AbstractC0084V.m301c(r1, r5, r15, r16, r13);     // Catch: AbstractMethodError -> L29
    L29:
        Objects.toString(r1);
        goto L30
    L19:
        if (this.f299e != null) goto L21;
        this.f299e = new int[2];
    L21:
        r13 = this.f299e;
        goto L23
    L16:
        r11 = 0;
        r12 = 0;
        goto L17
    L40:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m412d(int r9, int r10, int r11, int[] r12) {
        m413e(0, r9, 0, r10, null, r11, r12);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m413e(int r17, int r18, int r19, int r20, int[] r21, int r22, int[] r23) {
        if (this.f298d == false) goto L39;
        ViewParent r8 = m414f(r22);
        if (r8 != null) goto L8;
        return false;
    L8:
        if (r17 != 0) goto L15;
        if (r18 != 0) goto L15;
        if (r19 != 0) goto L15;
        if (r20 != 0) goto L15;
        if (r21 == null) goto L39;
        r21[0] = 0;
        r21[1] = 0;
    L15:
        View r12 = this.f297c;
        if (r21 == null) goto L18;
        r12.getLocationInWindow(r21);
        int r13 = r21[0];
        int r14 = r21[1];
    L19:
        if (r23 == null) goto L21;
        int[] r15 = r23;
    L25:
        boolean r1 = r8 instanceof InterfaceC0117o;
        View r2 = this.f297c;
        if (r1 == false) goto L28;
        ((InterfaceC0117o) r8).mo426b(r2, r17, r18, r19, r20, r22, r15);
    L36:
        if (r21 == null) goto L38;
        r12.getLocationInWindow(r21);
        r21[0] = r21[0] - r13;
        r21[1] = r21[1] - r14;
    L38:
        return true;
    L28:
        r15[0] = r15[0] + r19;
        r15[1] = r15[1] + r20;
        if ((r8 instanceof InterfaceC0115n) == false) goto L31;
        ((InterfaceC0115n) r8).mo422c(r2, r17, r18, r19, r20, r22);
        goto L36
    L31:
        if (r22 != 0) goto L36;
        AbstractC0084V.m302d(r8, r2, r17, r18, r19, r20);     // Catch: AbstractMethodError -> L35
    L35:
        Objects.toString(r8);
        goto L36
    L21:
        if (this.f299e != null) goto L23;
        this.f299e = new int[2];
    L23:
        int[] r16 = this.f299e;
        r16[0] = 0;
        r16[1] = 0;
        r15 = r16;
        goto L25
    L18:
        r13 = 0;
        r14 = 0;
    L39:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final ViewParent m414f(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L8;
        return null;
    L8:
        return this.f296b;
    L10:
        return this.f295a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m415g(int r1) {
        if (m414f(r1) == null) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m416h(int r8, int r9) {
        if (m415g(r9) == false) goto L6;
        return true;
    L6:
        if (this.f298d == false) goto L34;
        View r02 = this.f297c;
        ViewParent r3 = r02.getParent();
        View r4 = r02;
    L8:
        if (r3 == null) goto L34;
        boolean r5 = r3 instanceof InterfaceC0115n;
        if (r5 == false) goto L12;
        boolean r6 = ((InterfaceC0115n) r3).mo425f(r4, r02, r8, r9);
    L17:
        if (r6 == true) goto L18;
        if ((r3 instanceof View) == false) goto L33;
        r4 = r3;
    L33:
        r3 = r3.getParent();
        goto L8
    L18:
        if (r9 == 0) goto L22;
        if (r9 != 1) goto L23;
        this.f296b = r3;
    L23:
        if (r5 == false) goto L25;
        ((InterfaceC0115n) r3).mo421a(r4, r02, r8, r9);
    L29:
        return true;
    L25:
        if (r9 != 0) goto L29;
        AbstractC0084V.m303e(r3, r4, r02, r8);     // Catch: AbstractMethodError -> L28
    L28:
        Objects.toString(r3);
        goto L29
    L22:
        this.f295a = r3;
        goto L23
    L12:
        if (r9 == 0) goto L35;
    L16:
        r6 = false;
        goto L17
    L35:
        r6 = AbstractC0084V.m304f(r3, r4, r02, r8);     // Catch: AbstractMethodError -> L15
    L15:
        Objects.toString(r3);
    L34:
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m417i(int r4) {
        ViewParent r02 = m414f(r4);
        if (r02 == null) goto L21;
        boolean r1 = r02 instanceof InterfaceC0115n;
        View r2 = this.f297c;
        if (r1 == false) goto L7;
        ((InterfaceC0115n) r02).mo423d(r2, r4);
    L12:
        if (r4 != 0) goto L14;
        this.f295a = null;
        return;
    L14:
        if (r4 != 1) goto L23;
        this.f296b = null;
        return;
    L23:
        return;
    L7:
        if (r4 != 0) goto L12;
        AbstractC0084V.m305g(r02, r2);     // Catch: AbstractMethodError -> L10
    L10:
        Objects.toString(r02);
        goto L12
    }
}
