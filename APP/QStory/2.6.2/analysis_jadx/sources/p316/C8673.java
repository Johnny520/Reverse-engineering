package p316;

import android.view.View;
import android.view.ViewParent;
import com.alibaba.fastjson2.AbstractC2904;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8673 extends AbstractC2904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ SwipeDismissBehavior f24459;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24461;

    public C8673(SwipeDismissBehavior swipeDismissBehavior) {
        super(17);
        this.f24459 = swipeDismissBehavior;
        this.f24460 = -1;
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final boolean mo6272(View view, int i) {
        int i2 = this.f24460;
        return (i2 == -1 || i2 == i) && this.f24459.mo7022(view);
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo6274(View view, int i, int i2, int i3, int i4) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f24459;
        float f = width * swipeDismissBehavior.f10005;
        float width2 = view.getWidth() * swipeDismissBehavior.f10004;
        float fAbs = Math.abs(i - this.f24461);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6276(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f24460 = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f24459
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.f10006
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.f24461
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.f24461
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r8 = r8.f24461
            int r0 = r8 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f24461
        L67:
            飘花落叶言子哲苏楪兰世.飘花落叶言子楪世兰苏哲 r8 = r3.f10009
            int r10 = r9.getTop()
            boolean r8 = r8.m12994(r0, r10)
            if (r8 == 0) goto L7b
            com.kongzue.dialogx.interfaces.飘花落叶言子楪世苏哲兰 r8 = new com.kongzue.dialogx.interfaces.飘花落叶言子楪世苏哲兰
            r8.<init>(r3, r9, r2)
            r9.postOnAnimation(r8)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p316.C8673.mo6276(android.view.View, float, float):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo6278(View view) {
        return view.getWidth();
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo6279(View view, int i) {
        this.f24460 = i;
        this.f24461 = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f24459;
            swipeDismissBehavior.f10007 = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f10007 = false;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final int mo6281(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo6282(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f24459.f10006;
        if (i2 == 0) {
            width = this.f24461;
            if (z) {
                width -= view.getWidth();
                width2 = this.f24461;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.f24461;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.f24461 + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.f24461;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo6275(int i) {
    }
}
