package p316;

import android.view.View;
import android.view.ViewParent;
import com.bumptech.glide.AbstractC3055;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8665 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ SwipeDismissBehavior f24450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f24451 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f24452;

    public C8665(SwipeDismissBehavior swipeDismissBehavior) {
        this.f24450 = swipeDismissBehavior;
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final boolean mo6665(View view, int i) {
        int i2 = this.f24451;
        return (i2 == -1 || i2 == i) && this.f24450.mo7009(view);
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo6667(View view, int i) {
        this.f24451 = i;
        this.f24452 = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f24450;
            swipeDismissBehavior.f10012 = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f10012 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6668(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f24451 = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f24450
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.f10011
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
            int r5 = r8.f24452
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
            int r0 = r8.f24452
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r8 = r8.f24452
            int r0 = r8 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f24452
        L67:
            飘花落叶言子哲苏楪兰世.飘花落叶言子楪世兰苏哲 r8 = r3.f10014
            int r10 = r9.getTop()
            boolean r8 = r8.m13024(r0, r10)
            if (r8 == 0) goto L7b
            com.kongzue.dialogx.interfaces.飘花落叶言子楪世苏哲兰 r8 = new com.kongzue.dialogx.interfaces.飘花落叶言子楪世苏哲兰
            r8.<init>(r3, r9, r2)
            r9.postOnAnimation(r8)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p316.C8665.mo6668(android.view.View, float, float):void");
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo6669(View view, int i, int i2, int i3, int i4) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f24450;
        float f = width * swipeDismissBehavior.f10010;
        float width2 = view.getWidth() * swipeDismissBehavior.f10009;
        float fAbs = Math.abs(i - this.f24452);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo6670(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo6671(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f24450.f10011;
        if (i2 == 0) {
            width = this.f24452;
            if (z) {
                width -= view.getWidth();
                width2 = this.f24452;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.f24452;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.f24452 + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.f24452;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo6672(View view) {
        return view.getWidth();
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo6666(int i) {
    }
}
