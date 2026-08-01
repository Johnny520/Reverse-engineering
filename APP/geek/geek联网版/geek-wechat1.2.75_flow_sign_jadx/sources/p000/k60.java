package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class k60 extends C0875x {

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f2789d;

    public k60(TextInputLayout textInputLayout) {
        this.f2789d = textInputLayout;
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo760d(View view, C0357j0 c0357j0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2619a;
        this.f5147a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f2789d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f1162t0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        y40 y40Var = textInputLayout.f1125b;
        C0249g5 c0249g5 = y40Var.f5346b;
        if (c0249g5.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0249g5);
            accessibilityNodeInfo.setTraversalAfter(c0249g5);
        } else {
            accessibilityNodeInfo.setTraversalAfter(y40Var.f5348d);
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
        C0249g5 c0249g52 = textInputLayout.f1141j.f1426y;
        if (c0249g52 != null) {
            accessibilityNodeInfo.setLabelFor(c0249g52);
        }
        textInputLayout.f1127c.m1284b().mo1401m(c0357j0);
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: e */
    public final void mo1555e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1555e(view, accessibilityEvent);
        this.f2789d.f1127c.m1284b().mo1402n(accessibilityEvent);
    }
}
