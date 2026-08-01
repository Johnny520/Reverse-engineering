package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class e60 extends x {
    public final TextInputLayout d;

    public e60(TextInputLayout r1) {
        this.d = r1;
    }

    @Override // defpackage.x
    public final void d(View r18, j0 r19) {
        AccessibilityNodeInfo r2 = r19.a;
        this.a.onInitializeAccessibilityNodeInfo(r18, r2);
        TextInputLayout r3 = this.d;
        EditText r4 = r3.getEditText();
        if (r4 == null) goto L5;
        Editable r42 = r4.getText();
    L6:
        CharSequence r5 = r3.getHint();
        CharSequence r6 = r3.getError();
        CharSequence r7 = r3.getPlaceholderText();
        int r8 = r3.getCounterMaxLength();
        CharSequence r9 = r3.getCounterOverflowDescription();
        boolean r10 = TextUtils.isEmpty(r42);
        boolean r11 = TextUtils.isEmpty(r5);
        boolean r12 = r3.t0;
        boolean r13 = TextUtils.isEmpty(r6);
        if (r13 == true) goto L9;
    L12:
        boolean r14 = true;
    L13:
        if (r11 == true) goto L15;
        String r52 = r5.toString();
    L16:
        r40 r112 = r3.b;
        g5 r15 = r112.b;
        if (r15.getVisibility() != 0) goto L19;
        r2.setLabelFor(r15);
        r2.setTraversalAfter(r15);
    L20:
        if (r10 == true) goto L23;
        r2.setText(r42);
    L31:
        if (TextUtils.isEmpty(r52) == true) goto L33;
        r2.setHintText(r52);
        r2.setShowingHintText(r10);
    L33:
        if (r42 != null) goto L35;
    L37:
        r8 = -1;
    L38:
        r2.setMaxTextLength(r8);
        if (r14 == false) goto L44;
        if (r13 == false) goto L43;
        r6 = r9;
    L43:
        r2.setError(r6);
    L44:
        g5 r43 = r3.j.y;
        if (r43 == null) goto L47;
        r2.setLabelFor(r43);
    L47:
        r3.c.b().m(r19);
        return;
    L35:
        if (r42.length() != r8) goto L37;
    L23:
        if (TextUtils.isEmpty(r52) == true) goto L28;
        r2.setText(r52);
        if (r12 == true) goto L31;
        if (r7 == null) goto L31;
        r2.setText(r52 + ", " + r7);
        goto L31
    L28:
        if (r7 == null) goto L31;
        r2.setText(r7);
        goto L31
    L19:
        r2.setTraversalAfter(r112.d);
        goto L20
    L15:
        r52 = "";
        goto L16
    L9:
        if (TextUtils.isEmpty(r9) == false) goto L12;
        r14 = false;
        goto L13
    L5:
        r42 = null;
        goto L6
    }

    @Override // defpackage.x
    public final void e(View r1, AccessibilityEvent r2) {
        super.e(r1, r2);
        this.d.c.b().n(r2);
    }
}
