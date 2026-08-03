package p074o0;

import android.content.Context;
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

    public C1028d(Chip r1, Chip r2) {
        this.f3776q = r1;
        super(r2);
    }

    @Override // p021L.AbstractC0242b
    /* JADX INFO: renamed from: l */
    public final void mo663l(ArrayList r5) {
        boolean r02 = false;
        r5.add(0);
        Rect r1 = Chip.f2367w;
        Chip r12 = this.f3776q;
        if (r12.m1870c() == false) goto L14;
        C1030f r2 = r12.f2370e;
        if (r2 != null) goto L7;
    L9:
        if (r02 == true) goto L11;
        return;
    L11:
        if (r12.f2373h == null) goto L16;
        r5.add(1);
        return;
    L16:
        return;
    L7:
        if (r2.f3795K == false) goto L9;
        r02 = true;
        goto L9
    }

    @Override // p021L.AbstractC0242b
    /* JADX INFO: renamed from: o */
    public final void mo666o(int r6, C0156j r7) {
        AccessibilityNodeInfo r02 = r7.f357a;
        CharSequence r2 = "";
        if (r6 != 1) goto L12;
        Chip r62 = this.f3776q;
        CharSequence r1 = r62.getCloseIconContentDescription();
        if (r1 == null) goto L7;
        r02.setContentDescription(r1);
    L11:
        r02.setBoundsInParent(Chip.m1868a(r62));
        r7.m506b(C0151e.f344e);
        r02.setEnabled(r62.isEnabled());
        return;
    L7:
        CharSequence r12 = r62.getText();
        Context r3 = r62.getContext();
        if (TextUtils.isEmpty(r12) == true) goto L10;
        r2 = r12;
    L10:
        r02.setContentDescription(r3.getString(C1031R.string.mtrl_chip_close_icon_content_description, new Object[]{r2}).trim());
        goto L11
    L12:
        r02.setContentDescription("");
        r02.setBoundsInParent(Chip.f2367w);
    }
}
