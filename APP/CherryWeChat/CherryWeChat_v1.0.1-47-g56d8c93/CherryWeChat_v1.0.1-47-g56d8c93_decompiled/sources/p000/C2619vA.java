package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: vA */
/* JADX INFO: loaded from: classes.dex */
public final class C2619vA extends C0645P {

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f9095d;

    public C2619vA(TextInputLayout textInputLayout) {
        this.f9095d = textInputLayout;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View view, C1118a0 c1118a0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1118a0.f3530a;
        this.f2082a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f9095d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f4660v0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        C1072Yy c1072Yy = textInputLayout.f4619b;
        C2304o4 c2304o4 = c1072Yy.f3385b;
        if (c2304o4.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c2304o4);
            accessibilityNodeInfo.setTraversalAfter(c2304o4);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c1072Yy.f3387d);
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
        C2304o4 c2304o42 = textInputLayout.f4637k.f7919y;
        if (c2304o42 != null) {
            accessibilityNodeInfo.setLabelFor(c2304o42);
        }
        textInputLayout.f4621c.m2059b().mo955m(c1118a0);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: e */
    public final void mo320e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo320e(view, accessibilityEvent);
        this.f9095d.f4621c.m2059b().mo956n(accessibilityEvent);
    }
}
