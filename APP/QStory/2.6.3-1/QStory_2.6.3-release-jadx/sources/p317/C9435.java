package p317;

import android.R;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import p171.C8436;
import p171.C8439;
import p185.AbstractC8549;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9435 extends AbstractC8549 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final /* synthetic */ Chip f24485;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9435(Chip chip, Chip chip2) {
        super(chip2);
        this.f24485 = chip;
    }

    @Override // p185.AbstractC8549
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo13598(int i, C8436 c8436) {
        AccessibilityNodeInfo accessibilityNodeInfo = c8436.f20975;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f10559);
            return;
        }
        Chip chip = this.f24485;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(C0328R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c8436.m13393(C8439.f20977);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        c8436.m13402(Button.class.getName());
    }

    @Override // p185.AbstractC8549
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13599(int i, boolean z) {
        Chip chip = this.f24485;
        if (i == 1) {
            chip.f10563 = z;
        }
        C9434 c9434 = chip.f10574;
        boolean z2 = chip.f10563;
        boolean zM14827 = false;
        if (c9434.f24478 != null) {
            zM14827 = c9434.m14827(z2 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : C9434.f24423);
        }
        if (zM14827) {
            chip.refreshDrawableState();
        }
    }

    @Override // p185.AbstractC8549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo13601(ArrayList arrayList) {
        C9434 c9434;
        arrayList.add(0);
        Rect rect = Chip.f10559;
        Chip chip = this.f24485;
        if (!chip.m7647() || (c9434 = chip.f10574) == null || !c9434.f24477 || chip.f10575 == null) {
            return;
        }
        arrayList.add(1);
    }
}
