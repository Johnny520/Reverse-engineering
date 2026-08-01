package p318;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8674 extends AbstractC8673 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public VelocityTracker f24470;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24471;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24472;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f24473;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f24474;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo7007(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.MotionEvent r6) {
        /*
            r3 = this;
            int r5 = r3.f24471
            if (r5 >= 0) goto L12
            android.content.Context r4 = r4.getContext()
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            int r4 = r4.getScaledTouchSlop()
            r3.f24471 = r4
        L12:
            int r4 = r6.getActionMasked()
            r5 = 2
            r0 = -1
            r1 = 0
            if (r4 != r5) goto L40
            boolean r4 = r3.f24474
            if (r4 == 0) goto L40
            int r4 = r3.f24473
            if (r4 != r0) goto L24
            goto L4d
        L24:
            int r4 = r6.findPointerIndex(r4)
            if (r4 != r0) goto L2b
            goto L4d
        L2b:
            float r4 = r6.getY(r4)
            int r4 = (int) r4
            int r5 = r3.f24472
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r2 = r3.f24471
            if (r5 <= r2) goto L40
            r3.f24472 = r4
            r3 = 1
            return r3
        L40:
            int r4 = r6.getActionMasked()
            if (r4 == 0) goto L4e
            android.view.VelocityTracker r3 = r3.f24470
            if (r3 == 0) goto L4d
            r3.addMovement(r6)
        L4d:
            return r1
        L4e:
            r3.f24473 = r0
            r6.getX()
            r6.getY()
            com.alibaba.fastjson2.C2942.m6394()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p318.AbstractC8674.mo7007(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[RETURN] */
    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo7008(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L44
            r4 = 2
            if (r0 == r4) goto L2d
            r6 = 3
            if (r0 == r6) goto L48
            r6 = 6
            if (r0 == r6) goto L13
            goto L56
        L13:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L1b
            r6 = r3
            goto L1c
        L1b:
            r6 = r2
        L1c:
            int r0 = r7.getPointerId(r6)
            r5.f24473 = r0
            float r6 = r7.getY(r6)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.f24472 = r6
            goto L56
        L2d:
            int r0 = r5.f24473
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L36
            goto L61
        L36:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.f24472 = r7
            r6.getClass()
            com.alibaba.fastjson2.C2942.m6394()
            return r2
        L44:
            android.view.VelocityTracker r0 = r5.f24470
            if (r0 != 0) goto L63
        L48:
            r5.f24474 = r2
            r5.f24473 = r1
            android.view.VelocityTracker r6 = r5.f24470
            if (r6 == 0) goto L56
            r6.recycle()
            r6 = 0
            r5.f24470 = r6
        L56:
            android.view.VelocityTracker r6 = r5.f24470
            if (r6 == 0) goto L5d
            r6.addMovement(r7)
        L5d:
            boolean r5 = r5.f24474
            if (r5 != 0) goto L62
        L61:
            return r2
        L62:
            return r3
        L63:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.f24470
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.f24470
            int r5 = r5.f24473
            r7.getYVelocity(r5)
            r6.getClass()
            com.alibaba.fastjson2.C2942.m6394()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p318.AbstractC8674.mo7008(android.view.View, android.view.MotionEvent):boolean");
    }
}
