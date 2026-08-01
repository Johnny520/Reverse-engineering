package p000;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u50 extends AbstractC0498mu {

    /* JADX INFO: renamed from: a */
    public int f4635a;

    /* JADX INFO: renamed from: b */
    public int f4636b = -1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SwipeDismissBehavior f4637c;

    public u50(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4637c = swipeDismissBehavior;
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: A */
    public final void mo588A(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4637c;
        float f = width * swipeDismissBehavior.f935e;
        float width2 = view.getWidth() * swipeDismissBehavior.f936f;
        float fAbs = Math.abs(i - this.f4635a);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo589B(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f4636b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f4637c
            r4 = 1
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = p000.oa0.f3426a
            int r5 = p000.y90.m2732d(r9)
            if (r5 != r4) goto L1a
            r5 = r4
            goto L1b
        L1a:
            r5 = r2
        L1b:
            int r6 = r3.f934d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L67
            goto L52
        L2a:
            if (r1 <= 0) goto L67
            goto L52
        L2d:
            if (r6 != r4) goto L67
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L67
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L67
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f4635a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L67
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f4635a
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L65
        L61:
            int r10 = r8.f4635a
            int r0 = r10 - r11
        L65:
            r2 = r4
            goto L69
        L67:
            int r0 = r8.f4635a
        L69:
            ra0 r10 = r3.f931a
            int r11 = r9.getTop()
            boolean r10 = r10.m2280o(r0, r11)
            if (r10 == 0) goto L7f
            h1 r10 = new h1
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = p000.oa0.f3426a
            p000.x90.m2665m(r9, r10)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u50.mo589B(android.view.View, float, float):void");
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: I */
    public final boolean mo590I(View view, int i) {
        int i2 = this.f4636b;
        return (i2 == -1 || i2 == i) && this.f4637c.mo670r(view);
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: e */
    public final int mo591e(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = oa0.f3426a;
        boolean z = y90.m2732d(view) == 1;
        int i2 = this.f4637c.f934d;
        if (i2 == 0) {
            if (z) {
                width = this.f4635a - view.getWidth();
                width2 = this.f4635a;
            } else {
                width = this.f4635a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f4635a - view.getWidth();
            width2 = view.getWidth() + this.f4635a;
        } else if (z) {
            width = this.f4635a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f4635a - view.getWidth();
            width2 = this.f4635a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: f */
    public final int mo592f(View view, int i) {
        return view.getTop();
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: q */
    public final int mo593q(View view) {
        return view.getWidth();
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: y */
    public final void mo1903y(View view, int i) {
        this.f4636b = i;
        this.f4635a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4637c;
            swipeDismissBehavior.f933c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f933c = false;
        }
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: z */
    public final void mo595z(int i) {
    }
}
