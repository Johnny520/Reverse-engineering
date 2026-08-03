package p064j0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Field;
import p000A.RunnableC0000a;
import p001A0.AbstractC0040p;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: j0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0968a extends AbstractC0040p {

    /* JADX INFO: renamed from: a */
    public int f3437a;

    /* JADX INFO: renamed from: b */
    public int f3438b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SwipeDismissBehavior f3439c;

    public C0968a(SwipeDismissBehavior r1) {
        this.f3439c = r1;
        this.f3438b = -1;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: K */
    public final void mo123K(View r2, int r3) {
        this.f3438b = r3;
        this.f3437a = r2.getLeft();
        ViewParent r22 = r2.getParent();
        if (r22 == null) goto L6;
        SwipeDismissBehavior r32 = this.f3439c;
        r32.f2275c = true;
        r22.requestDisallowInterceptTouchEvent(true);
        r32.f2275c = false;
        return;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: L */
    public final void mo124L(int r1) {
        this.f3439c.getClass();
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: M */
    public final void mo125M(View r5, int r6, int r7) {
        float r72 = r5.getWidth();
        SwipeDismissBehavior r02 = this.f3439c;
        float r73 = r72 * r02.f2278f;
        float r1 = r5.getWidth() * r02.f2279g;
        float r62 = Math.abs(r6 - this.f3437a);
        if (r62 > r73) goto L6;
        r5.setAlpha(1.0f);
        return;
    L6:
        if (r62 < r1) goto L8;
        r5.setAlpha(0.0f);
        return;
    L8:
        r5.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((r62 - r73) / (r1 - r73))), 1.0f));
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: N */
    public final void mo126N(View r9, float r10, float r11) {
        this.f3438b = -1;
        int r112 = r9.getWidth();
        boolean r2 = true;
        SwipeDismissBehavior r3 = this.f3439c;
        if (r10 == 0.0f) goto L25;
        Field r5 = AbstractC0080Q.f219a;
        if (r9.getLayoutDirection() != 1) goto L7;
        boolean r52 = true;
    L8:
        int r6 = r3.f2276d;
        if (r6 == 2) goto L28;
        if (r6 != 0) goto L18;
        if (r52 == true) goto L14;
        if (r10 > 0.0f) goto L28;
    L34:
        int r02 = this.f3437a;
        r2 = false;
    L36:
        if (r3.f2273a.m682n(r02, r9.getTop()) == false) goto L39;
        RunnableC0000a r102 = new RunnableC0000a(r3, r9, r2);
        Field r113 = AbstractC0080Q.f219a;
        r9.postOnAnimation(r102);
        return;
    L39:
        return;
    L14:
        if (r10 >= 0.0f) goto L34;
    L18:
        if (r6 != 1) goto L34;
        if (r52 == false) goto L23;
        if (r10 <= 0.0f) goto L34;
    L23:
        if (r10 >= 0.0f) goto L34;
    L28:
        if (r10 < 0.0f) goto L33;
        int r103 = r9.getLeft();
        int r03 = this.f3437a;
        if (r103 < r03) goto L33;
        r02 = r03 + r112;
    L33:
        r02 = this.f3437a - r112;
        goto L36
    L7:
        r52 = false;
        goto L8
    L25:
        int r1 = r9.getLeft() - this.f3437a;
        if (Math.abs(r1) < Math.round(r9.getWidth() * r3.f2277e)) goto L34;
        goto L34
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: d0 */
    public final boolean mo131d0(View r3, int r4) {
        int r02 = this.f3438b;
        if (r02 == (-1)) goto L6;
        if (r02 == r4) goto L6;
    L8:
        return false;
    L6:
        if (this.f3439c.mo1831r(r3) == false) goto L8;
        return true;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: k */
    public final int mo133k(View r4, int r5) {
        Field r02 = AbstractC0080Q.f219a;
        if (r4.getLayoutDirection() != 1) goto L5;
        boolean r03 = true;
    L6:
        int r2 = this.f3439c.f2276d;
        if (r2 != 0) goto L12;
        if (r03 == false) goto L10;
        int r04 = this.f3437a - r4.getWidth();
        int r42 = this.f3437a;
    L18:
        return Math.min(Math.max(r04, r5), r42);
    L10:
        r04 = this.f3437a;
        int r43 = r4.getWidth();
    L11:
        r42 = r43 + r04;
        goto L18
    L12:
        if (r2 != 1) goto L16;
        if (r03 == false) goto L15;
        r04 = this.f3437a;
        r43 = r4.getWidth();
        goto L11
    L15:
        r04 = this.f3437a - r4.getWidth();
        r42 = this.f3437a;
        goto L18
    L16:
        r04 = this.f3437a - r4.getWidth();
        r42 = r4.getWidth() + this.f3437a;
        goto L18
    L5:
        r03 = false;
        goto L6
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: l */
    public final int mo134l(View r1, int r2) {
        return r1.getTop();
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: z */
    public final int mo136z(View r1) {
        return r1.getWidth();
    }
}
