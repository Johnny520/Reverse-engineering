package p332;

import android.view.View;
import android.view.ViewParent;
import com.bumptech.glide.AbstractC3887;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.kongzue.dialogx.interfaces.RunnableC4574;

/* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9494 extends AbstractC3887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ SwipeDismissBehavior f24795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f24796 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f24797;

    public C9494(SwipeDismissBehavior swipeDismissBehavior) {
        this.f24795 = swipeDismissBehavior;
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final boolean mo7225(View view, int i) {
        int i2 = this.f24796;
        return (i2 == -1 || i2 == i) && this.f24795.mo7568(view);
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo7227(View view, int i) {
        this.f24796 = i;
        this.f24797 = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f24795;
            swipeDismissBehavior.f10357 = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f10357 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7228(View view, float f, float f2) {
        int i;
        this.f24796 = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f24795;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.f10356;
            if (i2 != 2 && (i2 != 0 ? i2 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.f24797;
            } else if (f >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f24797;
                i = left < i3 ? this.f24797 - width : i3 + width;
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f24797) >= Math.round(view.getWidth() * 0.5f)) {
            }
        }
        if (swipeDismissBehavior.f10359.m13583(i, view.getTop())) {
            view.postOnAnimation(new RunnableC4574(swipeDismissBehavior, view, z));
        }
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo7229(View view, int i, int i2, int i3, int i4) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f24795;
        float f = width * swipeDismissBehavior.f10355;
        float width2 = view.getWidth() * swipeDismissBehavior.f10354;
        float fAbs = Math.abs(i - this.f24797);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo7230(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo7231(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f24795.f10356;
        if (i2 == 0) {
            width = this.f24797;
            if (z) {
                width -= view.getWidth();
                width2 = this.f24797;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.f24797;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.f24797 + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.f24797;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo7232(View view) {
        return view.getWidth();
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo7226(int i) {
    }
}
