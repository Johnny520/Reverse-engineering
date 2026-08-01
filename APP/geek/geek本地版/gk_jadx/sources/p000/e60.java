package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class e60 extends C0875x {

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f1741d;

    public e60(TextInputLayout textInputLayout) {
        this.f1741d = textInputLayout;
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo66d(View view, C0357j0 c0357j0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2513a;
        this.f5076a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1741d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f1237t0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        r40 r40Var = textInputLayout.f1200b;
        C0249g5 c0249g5 = r40Var.f4196b;
        if (c0249g5.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0249g5);
            accessibilityNodeInfo.setTraversalAfter(c0249g5);
        } else {
            accessibilityNodeInfo.setTraversalAfter(r40Var.f4198d);
        }
        if (!zIsEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setText(string);
            if (!z && placeholderText != null) {
                accessibilityNodeInfo.setText(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0249g5 c0249g52 = textInputLayout.f1216j.f5602y;
        if (c0249g52 != null) {
            accessibilityNodeInfo.setLabelFor(c0249g52);
        }
        textInputLayout.f1202c.m1036b().mo1225m(c0357j0);
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: e */
    public final void mo617e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo617e(view, accessibilityEvent);
        this.f1741d.f1202c.m1036b().mo1226n(accessibilityEvent);
    }
}
