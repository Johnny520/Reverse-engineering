package p169;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import p155.C7606;
import p301.C8614;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7720 extends C5851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7719 f20976;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7720(AbstractC7719 abstractC7719) {
        super(15);
        this.f20976 = abstractC7719;
    }

    @Override // top.suzhelan.qstory.hook.item.chat.C5851
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final C7606 mo3495(int i) {
        AbstractC7719 abstractC7719 = this.f20976;
        int i2 = i == 2 ? abstractC7719.f20968 : abstractC7719.f20967;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo3496(i2);
    }

    @Override // top.suzhelan.qstory.hook.item.chat.C5851
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C7606 mo3496(int i) {
        return new C7606(AccessibilityNodeInfo.obtain(this.f20976.m13005(i).f20635));
    }

    @Override // top.suzhelan.qstory.hook.item.chat.C5851
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo3497(int i, int i2, Bundle bundle) {
        int i3;
        AbstractC7719 abstractC7719 = this.f20976;
        Chip chip = abstractC7719.f20973;
        if (i == -1) {
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return abstractC7719.m13007(i);
        }
        if (i2 == 2) {
            return abstractC7719.m13013(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = abstractC7719.f20972;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = abstractC7719.f20968) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                abstractC7719.f20968 = Integer.MIN_VALUE;
                chip.invalidate();
                abstractC7719.m13008(i3, 65536);
            }
            abstractC7719.f20968 = i;
            chip.invalidate();
            abstractC7719.m13008(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (abstractC7719.f20968 != i) {
                return false;
            }
            abstractC7719.f20968 = Integer.MIN_VALUE;
            chip.invalidate();
            abstractC7719.m13008(i, 65536);
            return true;
        }
        Chip chip2 = ((C8614) abstractC7719).f24149;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f10225;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.f10219) {
                    chip2.f10220.m13008(1, 1);
                }
            }
        }
        return z;
    }
}
