package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class eq extends zt {
    public final /* synthetic */ int e;
    public final SideSheetBehavior f;

    public /* synthetic */ eq(SideSheetBehavior r1, int r2) {
        this.e = r2;
        this.f = r1;
    }

    @Override // defpackage.zt
    public final boolean A(float r2) {
        switch(this.e) {
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

    @Override // defpackage.zt
    public final boolean C(View r3) {
        switch(this.e) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        int r32 = r3.getLeft();
        int r0 = this.f.m;
        if (r32 <= ((l() + r0) / 2)) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (r3.getRight() >= ((l() - m()) / 2)) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // defpackage.zt
    public final boolean D(float r2, float r3) {
        switch(this.e) {
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

    @Override // defpackage.zt
    public final boolean P(View r3, float r4) {
        switch(this.e) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        float r32 = r3.getRight();
        SideSheetBehavior r0 = this.f;
        float r33 = Math.abs((r4 * r0.k) + r32);
        r0.getClass();
        if (r33 <= 0.5f) goto L7;
        return true;
    L7:
        return false;
    L9:
        float r34 = r3.getLeft();
        SideSheetBehavior r02 = this.f;
        float r35 = Math.abs((r4 * r02.k) + r34);
        r02.getClass();
        if (r35 <= 0.5f) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // defpackage.zt
    public final void R(ViewGroup.MarginLayoutParams r2, int r3, int r4) {
        switch(this.e) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        int r42 = this.f.m;
        if (r3 > r42) goto L12;
        r2.rightMargin = r42 - r3;
        return;
    L12:
        return;
    L9:
        if (r3 > this.f.m) goto L13;
        r2.leftMargin = r4;
        return;
    }

    @Override // defpackage.zt
    public final int a(ViewGroup.MarginLayoutParams r2) {
        switch(this.e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.rightMargin;
    L7:
        return r2.leftMargin;
    }

    @Override // defpackage.zt
    public final float b(int r3) {
        switch(this.e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        float r0 = this.f.m;
        return (r0 - r3) / (r0 - l());
    L6:
        float r02 = m();
        return (r3 - r02) / (l() - r02);
    }

    @Override // defpackage.zt
    public final int l() {
        switch(this.e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r0 = this.f;
        return Math.max(0, (r0.m - r0.l) - r0.o);
    L6:
        SideSheetBehavior r02 = this.f;
        return Math.max(0, r02.n + r02.o);
    }

    @Override // defpackage.zt
    public final int m() {
        switch(this.e) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        SideSheetBehavior r0 = this.f;
        return (-r0.l) - r0.o;
    L5:
        return this.f.m;
    }

    @Override // defpackage.zt
    public final int n() {
        switch(this.e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f.m;
    L7:
        return this.f.o;
    }

    @Override // defpackage.zt
    public final int o() {
        switch(this.e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return l();
    L7:
        return -this.f.l;
    }

    @Override // defpackage.zt
    public final int q(View r2) {
        switch(this.e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getLeft() - this.f.o;
    L7:
        return r2.getRight() + this.f.o;
    }

    @Override // defpackage.zt
    public final int u(CoordinatorLayout r2) {
        switch(this.e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getRight();
    L7:
        return r2.getLeft();
    }

    @Override // defpackage.zt
    public final int v() {
        switch(this.e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 0;
    L6:
        return 1;
    }
}
