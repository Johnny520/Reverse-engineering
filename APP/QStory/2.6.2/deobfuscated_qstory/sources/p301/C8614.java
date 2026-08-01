package p301;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import p155.C7606;
import p155.C7609;
import p169.AbstractC7719;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8614 extends AbstractC7719 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final /* synthetic */ Chip f24149;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8614(Chip chip, Chip chip2) {
        super(chip2);
        this.f24149 = chip;
    }

    @Override // p169.AbstractC7719
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo13009(int i, C7606 c7606) {
        AccessibilityNodeInfo accessibilityNodeInfo = c7606.f20635;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f10209);
            return;
        }
        Chip chip = this.f24149;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c7606.m12805(C7609.f20637);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        c7606.m12814(Button.class.getName());
    }

    @Override // p169.AbstractC7719
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13010(int i, boolean z) {
        Chip chip = this.f24149;
        if (i == 1) {
            chip.f10213 = z;
        }
        C8613 c8613 = chip.f10224;
        boolean z2 = chip.f10213;
        boolean zM14249 = false;
        if (c8613.f24142 != null) {
            zM14249 = c8613.m14249(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : C8613.f24087);
        }
        if (zM14249) {
            chip.refreshDrawableState();
        }
    }

    @Override // p169.AbstractC7719
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo13012(ArrayList arrayList) {
        C8613 c8613;
        arrayList.add(0);
        Rect rect = Chip.f10209;
        Chip chip = this.f24149;
        if (!chip.m7101() || (c8613 = chip.f10224) == null || !c8613.f24141 || chip.f10225 == null) {
            return;
        }
        arrayList.add(1);
    }
}
