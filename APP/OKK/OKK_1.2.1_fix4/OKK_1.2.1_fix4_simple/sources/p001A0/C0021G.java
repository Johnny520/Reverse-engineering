package p001A0;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p006D.C0091b;
import p008E.C0156j;
import p057g.C0868K;

/* JADX INFO: renamed from: A0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0021G extends C0091b {

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f60d;

    public C0021G(TextInputLayout r1) {
        this.f60d = r1;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View r18, C0156j r19) {
        View.AccessibilityDelegate r2 = this.f243a;
        AccessibilityNodeInfo r3 = r19.f357a;
        r2.onInitializeAccessibilityNodeInfo(r18, r3);
        TextInputLayout r22 = this.f60d;
        EditText r4 = r22.getEditText();
        if (r4 == null) goto L5;
        Editable r42 = r4.getText();
    L6:
        CharSequence r5 = r22.getHint();
        CharSequence r6 = r22.getError();
        CharSequence r7 = r22.getPlaceholderText();
        int r8 = r22.getCounterMaxLength();
        CharSequence r9 = r22.getCounterOverflowDescription();
        boolean r10 = TextUtils.isEmpty(r42);
        boolean r11 = !r10;
        boolean r13 = true;
        boolean r12 = !TextUtils.isEmpty(r5);
        boolean r14 = !r22.f2504u0;
        boolean r15 = !TextUtils.isEmpty(r6);
        if (r15 == false) goto L9;
    L12:
        if (r12 == false) goto L14;
        String r52 = r5.toString();
    L15:
        C0015A r122 = r22.f2465b;
        C0868K r02 = r122.f43b;
        if (r02.getVisibility() != 0) goto L18;
        r3.setLabelFor(r02);
        r3.setTraversalAfter(r02);
    L19:
        if (r11 == false) goto L22;
        r3.setText(r42);
    L30:
        if (TextUtils.isEmpty(r52) == true) goto L32;
        r3.setHintText(r52);
        r3.setShowingHintText(r10);
    L32:
        if (r42 != null) goto L34;
    L36:
        r8 = -1;
    L37:
        r3.setMaxTextLength(r8);
        if (r13 == false) goto L43;
        if (r15 == true) goto L42;
        r6 = r9;
    L42:
        r3.setError(r6);
    L43:
        C0868K r03 = r22.f2481j.f175y;
        if (r03 == null) goto L46;
        r3.setLabelFor(r03);
    L46:
        r22.f2467c.m141b().mo75n(r19);
        return;
    L34:
        if (r42.length() != r8) goto L36;
    L22:
        if (TextUtils.isEmpty(r52) == true) goto L27;
        r3.setText(r52);
        if (r14 == false) goto L30;
        if (r7 == null) goto L30;
        r3.setText(r52 + ", " + r7);
        goto L30
    L27:
        if (r7 == null) goto L30;
        r3.setText(r7);
        goto L30
    L18:
        r3.setTraversalAfter(r122.f45d);
        goto L19
    L14:
        r52 = "";
        goto L15
    L9:
        if (TextUtils.isEmpty(r9) == false) goto L12;
        r13 = false;
        goto L12
    L5:
        r42 = null;
        goto L6
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: e */
    public final void mo56e(View r1, AccessibilityEvent r2) {
        super.mo56e(r1, r2);
        this.f60d.f2467c.m141b().mo76o(r2);
    }
}
