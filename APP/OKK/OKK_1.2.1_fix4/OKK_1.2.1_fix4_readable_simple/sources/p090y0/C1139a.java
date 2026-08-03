package p090y0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.abc.core.runtime.AbstractC0805P;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: y0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1139a extends AbstractC0805P {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4398b;

    /* JADX INFO: renamed from: c */
    public final SideSheetBehavior f4399c;

    public /* synthetic */ C1139a(SideSheetBehavior r1, int r2) {
        this.f4398b = r2;
        this.f4399c = r1;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: A */
    public final int mo2054A(CoordinatorLayout r2) {
        switch(this.f4398b) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getRight();
    L7:
        return r2.getLeft();
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: B */
    public final int mo2055B() {
        switch(this.f4398b) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 0;
    L6:
        return 1;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: D */
    public final boolean mo2056D(float r2) {
        switch(this.f4398b) {
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

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: G */
    public final boolean mo2057G(View r3) {
        switch(this.f4398b) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        int r32 = r3.getLeft();
        int r02 = this.f4399c.f2421m;
        if (r32 <= ((mo2075u() + r02) / 2)) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (r3.getRight() >= ((mo2075u() - mo2076v()) / 2)) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: H */
    public final boolean mo2058H(float r2, float r3) {
        switch(this.f4398b) {
            case 0: goto L12;
            default: goto L5;
        };
    L5:
        if (Math.abs(r2) <= Math.abs(r3)) goto L9;
        float r22 = Math.abs(r2);
        this.f4399c.getClass();
        if (r22 <= 500) goto L9;
        return true;
    L9:
        return false;
    L12:
        if (Math.abs(r2) <= Math.abs(r3)) goto L16;
        float r23 = Math.abs(r2);
        this.f4399c.getClass();
        if (r23 <= 500) goto L16;
        return true;
    L16:
        return false;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: W */
    public final boolean mo2063W(View r2, float r3) {
        switch(this.f4398b) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (Math.abs((r3 * this.f4399c.f2419k) + r2.getRight()) <= 0.5f) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (Math.abs((r3 * this.f4399c.f2419k) + r2.getLeft()) <= 0.5f) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: X */
    public final void mo2064X(ViewGroup.MarginLayoutParams r2, int r3, int r4) {
        switch(this.f4398b) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        int r42 = this.f4399c.f2421m;
        if (r3 > r42) goto L12;
        r2.rightMargin = r42 - r3;
        return;
    L12:
        return;
    L9:
        if (r3 > this.f4399c.f2421m) goto L13;
        r2.leftMargin = r4;
        return;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: a */
    public final int mo2065a(ViewGroup.MarginLayoutParams r2) {
        switch(this.f4398b) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.rightMargin;
    L7:
        return r2.leftMargin;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: b */
    public final float mo2066b(int r3) {
        switch(this.f4398b) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        float r02 = this.f4399c.f2421m;
        return (r02 - r3) / (r02 - mo2075u());
    L6:
        float r03 = mo2076v();
        return (r3 - r03) / (mo2075u() - r03);
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: u */
    public final int mo2075u() {
        switch(this.f4398b) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r02 = this.f4399c;
        return Math.max(0, (r02.f2421m - r02.f2420l) - r02.f2423o);
    L6:
        SideSheetBehavior r03 = this.f4399c;
        return Math.max(0, r03.f2422n + r03.f2423o);
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: v */
    public final int mo2076v() {
        switch(this.f4398b) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        SideSheetBehavior r02 = this.f4399c;
        return (-r02.f2420l) - r02.f2423o;
    L5:
        return this.f4399c.f2421m;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: x */
    public final int mo2077x() {
        switch(this.f4398b) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f4399c.f2421m;
    L7:
        return this.f4399c.f2423o;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: y */
    public final int mo2078y() {
        switch(this.f4398b) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return mo2075u();
    L7:
        return -this.f4399c.f2420l;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: z */
    public final int mo2079z(View r2) {
        switch(this.f4398b) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getLeft() - this.f4399c.f2423o;
    L7:
        return r2.getRight() + this.f4399c.f2423o;
    }
}
