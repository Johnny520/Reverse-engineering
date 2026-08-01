package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n50 extends gt {
    public int a;
    public int b;
    public final /* synthetic */ SwipeDismissBehavior c;

    public n50(SwipeDismissBehavior r1) {
        this.c = r1;
        this.b = -1;
    }

    @Override // defpackage.gt
    public final boolean H(View r3, int r4) {
        int r0 = this.b;
        if (r0 == (-1)) goto L6;
        if (r0 == r4) goto L6;
        return false;
    L6:
        if (this.c.r(r3) == false) goto L11;
        return true;
    L11:
        return false;
    }

    @Override // defpackage.gt
    public final int b(View r4, int r5) {
        WeakHashMap r0 = ja0.a;
        if (t90.d(r4) != 1) goto L5;
        boolean r02 = true;
    L6:
        int r2 = this.c.d;
        if (r2 != 0) goto L12;
        if (r02 == false) goto L10;
        int r03 = this.a - r4.getWidth();
        int r42 = this.a;
    L18:
        return Math.min(Math.max(r03, r5), r42);
    L10:
        r03 = this.a;
        int r43 = r4.getWidth();
    L11:
        r42 = r43 + r03;
        goto L18
    L12:
        if (r2 != 1) goto L16;
        if (r02 == false) goto L15;
        r03 = this.a;
        r43 = r4.getWidth();
        goto L11
    L15:
        r03 = this.a - r4.getWidth();
        r42 = this.a;
        goto L18
    L16:
        r03 = this.a - r4.getWidth();
        r42 = r4.getWidth() + this.a;
        goto L18
    L5:
        r02 = false;
        goto L6
    }

    @Override // defpackage.gt
    public final int c(View r1, int r2) {
        return r1.getTop();
    }

    @Override // defpackage.gt
    public final int l(View r1) {
        return r1.getWidth();
    }

    @Override // defpackage.gt
    public final void r(View r2, int r3) {
        this.b = r3;
        this.a = r2.getLeft();
        ViewParent r22 = r2.getParent();
        if (r22 == null) goto L6;
        SwipeDismissBehavior r32 = this.c;
        r32.c = true;
        r22.requestDisallowInterceptTouchEvent(true);
        r32.c = false;
        return;
    }

    @Override // defpackage.gt
    public final void t(View r5, int r6, int r7) {
        float r72 = r5.getWidth();
        SwipeDismissBehavior r0 = this.c;
        float r73 = r72 * r0.e;
        float r1 = r5.getWidth() * r0.f;
        float r62 = Math.abs(r6 - this.a);
        if (r62 > r73) goto L7;
        r5.setAlpha(1.0f);
        return;
    L7:
        if (r62 < r1) goto L10;
        r5.setAlpha(0.0f);
        return;
    L10:
        r5.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((r62 - r73) / (r1 - r73))), 1.0f));
    }

    @Override // defpackage.gt
    public final void u(View r9, float r10, float r11) {
        this.b = -1;
        int r112 = r9.getWidth();
        boolean r2 = false;
        SwipeDismissBehavior r3 = this.c;
        if (r10 == 0.0f) goto L25;
        WeakHashMap r5 = ja0.a;
        if (t90.d(r9) != 1) goto L7;
        boolean r52 = true;
    L8:
        int r6 = r3.d;
        if (r6 == 2) goto L28;
        if (r6 != 0) goto L18;
        if (r52 == true) goto L14;
        if (r10 > 0.0f) goto L28;
    L35:
        int r0 = this.a;
    L37:
        if (r3.a.o(r0, r9.getTop()) == false) goto L40;
        h1 r102 = new h1(r3, r9, r2);
        WeakHashMap r113 = ja0.a;
        s90.m(r9, r102);
        return;
    L40:
        return;
    L14:
        if (r10 >= 0.0f) goto L35;
    L18:
        if (r6 != 1) goto L35;
        if (r52 == false) goto L23;
        if (r10 <= 0.0f) goto L35;
    L23:
        if (r10 >= 0.0f) goto L35;
    L28:
        if (r10 < 0.0f) goto L33;
        int r103 = r9.getLeft();
        int r02 = this.a;
        if (r103 < r02) goto L33;
        r0 = r02 + r112;
    L34:
        r2 = true;
    L33:
        r0 = this.a - r112;
        goto L34
    L7:
        r52 = false;
        goto L8
    L25:
        int r1 = r9.getLeft() - this.a;
        if (Math.abs(r1) < Math.round(r9.getWidth() * 0.5f)) goto L35;
        goto L35
    }

    @Override // defpackage.gt
    public final void s(int r1) {
    }
}
