package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: Jn */
/* JADX INFO: loaded from: classes.dex */
public final class C0417Jn extends AbstractC0628Oj {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f1397p;

    /* JADX INFO: renamed from: q */
    public final SideSheetBehavior f1398q;

    public /* synthetic */ C0417Jn(SideSheetBehavior r1, int r2) {
        this.f1397p = r2;
        this.f1398q = r1;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: G */
    public final boolean mo865G(float r2) {
        switch(this.f1397p) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (r2 >= 0.0f) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (r2 <= 0.0f) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: J */
    public final boolean mo866J(View r3) {
        switch(this.f1397p) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        int r32 = r3.getLeft();
        int r0 = this.f1398q.f4574m;
        if (r32 <= ((mo872q() + r0) / 2)) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (r3.getRight() >= ((mo872q() - mo873r()) / 2)) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: K */
    public final boolean mo867K(float r2, float r3) {
        switch(this.f1397p) {
            case 0: goto L12;
            default: goto L5;
        };
    L5:
        if (Math.abs(r2) > Math.abs(r3)) goto L7;
    L9:
        return false;
    L7:
        if (Math.abs(r2) <= 500) goto L9;
        return true;
    L12:
        if (Math.abs(r2) > Math.abs(r3)) goto L14;
    L16:
        return false;
    L14:
        if (Math.abs(r2) <= 500) goto L16;
        return true;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: S */
    public final boolean mo868S(View r3, float r4) {
        switch(this.f1397p) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        float r32 = r3.getRight();
        SideSheetBehavior r0 = this.f1398q;
        float r33 = Math.abs((r4 * r0.f4572k) + r32);
        r0.getClass();
        if (r33 <= 0.5f) goto L7;
        return true;
    L7:
        return false;
    L9:
        float r34 = r3.getLeft();
        SideSheetBehavior r02 = this.f1398q;
        float r35 = Math.abs((r4 * r02.f4572k) + r34);
        r02.getClass();
        if (r35 <= 0.5f) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: X */
    public final void mo869X(ViewGroup.MarginLayoutParams r2, int r3, int r4) {
        switch(this.f1397p) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        int r42 = this.f1398q.f4574m;
        if (r3 > r42) goto L12;
        r2.rightMargin = r42 - r3;
        return;
    L12:
        return;
    L9:
        if (r3 > this.f1398q.f4574m) goto L13;
        r2.leftMargin = r4;
        return;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: d */
    public final int mo870d(ViewGroup.MarginLayoutParams r2) {
        switch(this.f1397p) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.rightMargin;
    L7:
        return r2.leftMargin;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: e */
    public final float mo871e(int r3) {
        switch(this.f1397p) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        float r0 = this.f1398q.f4574m;
        return (r0 - r3) / (r0 - mo872q());
    L6:
        float r02 = mo873r();
        return (r3 - r02) / (mo872q() - r02);
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: q */
    public final int mo872q() {
        switch(this.f1397p) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r0 = this.f1398q;
        return Math.max(0, (r0.f4574m - r0.f4573l) - r0.f4576o);
    L6:
        SideSheetBehavior r02 = this.f1398q;
        return Math.max(0, r02.f4575n + r02.f4576o);
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: r */
    public final int mo873r() {
        switch(this.f1397p) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        SideSheetBehavior r0 = this.f1398q;
        return (-r0.f4573l) - r0.f4576o;
    L5:
        return this.f1398q.f4574m;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: s */
    public final int mo874s() {
        switch(this.f1397p) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f1398q.f4574m;
    L7:
        return this.f1398q.f4576o;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: t */
    public final int mo875t() {
        switch(this.f1397p) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return mo872q();
    L7:
        return -this.f1398q.f4573l;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: w */
    public final int mo876w(View r2) {
        switch(this.f1397p) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getLeft() - this.f1398q.f4576o;
    L7:
        return r2.getRight() + this.f1398q.f4576o;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: x */
    public final int mo877x(CoordinatorLayout r2) {
        switch(this.f1397p) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getRight();
    L7:
        return r2.getLeft();
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: z */
    public final int mo878z() {
        switch(this.f1397p) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 0;
    L6:
        return 1;
    }
}
