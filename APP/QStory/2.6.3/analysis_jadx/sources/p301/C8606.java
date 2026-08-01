package p301;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import p155.C7607;
import p155.C7610;
import p169.AbstractC7720;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8606 extends AbstractC7720 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final /* synthetic */ Chip f24140;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8606(Chip chip, Chip chip2) {
        super(chip2);
        this.f24140 = chip;
    }

    @Override // p169.AbstractC7720
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo13039(int i, C7607 c7607) {
        AccessibilityNodeInfo accessibilityNodeInfo = c7607.f20630;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f10214);
            return;
        }
        Chip chip = this.f24140;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c7607.m12834(C7610.f20632);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        c7607.m12843(Button.class.getName());
    }

    @Override // p169.AbstractC7720
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13040(int i, boolean z) {
        Chip chip = this.f24140;
        if (i == 1) {
            chip.f10218 = z;
        }
        C8605 c8605 = chip.f10229;
        boolean z2 = chip.f10218;
        boolean zM14268 = false;
        if (c8605.f24133 != null) {
            zM14268 = c8605.m14268(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : C8605.f24078);
        }
        if (zM14268) {
            chip.refreshDrawableState();
        }
    }

    @Override // p169.AbstractC7720
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo13042(ArrayList arrayList) {
        C8605 c8605;
        arrayList.add(0);
        Rect rect = Chip.f10214;
        Chip chip = this.f24140;
        if (!chip.m7088() || (c8605 = chip.f10229) == null || !c8605.f24132 || chip.f10230 == null) {
            return;
        }
        arrayList.add(1);
    }
}
