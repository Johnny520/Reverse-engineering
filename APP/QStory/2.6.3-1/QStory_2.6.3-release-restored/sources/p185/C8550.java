package p185;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import p171.C8436;
import p317.C9435;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8550 extends C6686 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8549 f21316;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8550(AbstractC8549 abstractC8549) {
        super(15);
        this.f21316 = abstractC8549;
    }

    @Override // top.suzhelan.qstory.hook.item.chat.C6686
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final C8436 mo4065(int i) {
        AbstractC8549 abstractC8549 = this.f21316;
        int i2 = i == 2 ? abstractC8549.f21308 : abstractC8549.f21307;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo4066(i2);
    }

    @Override // top.suzhelan.qstory.hook.item.chat.C6686
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C8436 mo4066(int i) {
        return new C8436(AccessibilityNodeInfo.obtain(this.f21316.m13594(i).f20975));
    }

    @Override // top.suzhelan.qstory.hook.item.chat.C6686
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo4067(int i, int i2, Bundle bundle) {
        int i3;
        AbstractC8549 abstractC8549 = this.f21316;
        Chip chip = abstractC8549.f21313;
        if (i == -1) {
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return abstractC8549.m13596(i);
        }
        if (i2 == 2) {
            return abstractC8549.m13602(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = abstractC8549.f21312;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = abstractC8549.f21308) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                abstractC8549.f21308 = Integer.MIN_VALUE;
                chip.invalidate();
                abstractC8549.m13597(i3, 65536);
            }
            abstractC8549.f21308 = i;
            chip.invalidate();
            abstractC8549.m13597(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (abstractC8549.f21308 != i) {
                return false;
            }
            abstractC8549.f21308 = Integer.MIN_VALUE;
            chip.invalidate();
            abstractC8549.m13597(i, 65536);
            return true;
        }
        Chip chip2 = ((C9435) abstractC8549).f24485;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f10575;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.f10569) {
                    chip2.f10570.m13597(1, 1);
                }
            }
        }
        return z;
    }
}
