package p169;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import p155.C7607;
import p301.C8606;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7721 extends C5856 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7720 f20971;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7721(AbstractC7720 abstractC7720) {
        super(15);
        this.f20971 = abstractC7720;
    }

    @Override // top.suzhelan.qstory.hook.item.chat.C5856
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final C7607 mo3505(int i) {
        AbstractC7720 abstractC7720 = this.f20971;
        int i2 = i == 2 ? abstractC7720.f20963 : abstractC7720.f20962;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo3506(i2);
    }

    @Override // top.suzhelan.qstory.hook.item.chat.C5856
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C7607 mo3506(int i) {
        return new C7607(AccessibilityNodeInfo.obtain(this.f20971.m13035(i).f20630));
    }

    @Override // top.suzhelan.qstory.hook.item.chat.C5856
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo3507(int i, int i2, Bundle bundle) {
        int i3;
        AbstractC7720 abstractC7720 = this.f20971;
        Chip chip = abstractC7720.f20968;
        if (i == -1) {
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return abstractC7720.m13037(i);
        }
        if (i2 == 2) {
            return abstractC7720.m13043(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = abstractC7720.f20967;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = abstractC7720.f20963) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                abstractC7720.f20963 = Integer.MIN_VALUE;
                chip.invalidate();
                abstractC7720.m13038(i3, 65536);
            }
            abstractC7720.f20963 = i;
            chip.invalidate();
            abstractC7720.m13038(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (abstractC7720.f20963 != i) {
                return false;
            }
            abstractC7720.f20963 = Integer.MIN_VALUE;
            chip.invalidate();
            abstractC7720.m13038(i, 65536);
            return true;
        }
        Chip chip2 = ((C8606) abstractC7720).f24140;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f10230;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.f10224) {
                    chip2.f10225.m13038(1, 1);
                }
            }
        }
        return z;
    }
}
