package p074o0;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import org.luckypray.dexkit.C1031R;
import p008E.C0151e;
import p008E.C0156j;
import p021L.AbstractC0242b;

/* JADX INFO: renamed from: o0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1028d extends AbstractC0242b {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Chip f3776q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1028d(Chip chip, Chip chip2) {
        super(chip2);
        this.f3776q = chip;
    }

    @Override // p021L.AbstractC0242b
    /* JADX INFO: renamed from: l */
    public final void mo663l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f2367w;
        Chip chip = this.f3776q;
        if (chip.m1870c()) {
            C1030f c1030f = chip.f2370e;
            if (c1030f != null && c1030f.f3795K) {
                z2 = true;
            }
            if (!z2 || chip.f2373h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // p021L.AbstractC0242b
    /* JADX INFO: renamed from: o */
    public final void mo666o(int i2, C0156j c0156j) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0156j.f357a;
        if (i2 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f2367w);
            return;
        }
        Chip chip = this.f3776q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(C1031R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c0156j.m506b(C0151e.f344e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
