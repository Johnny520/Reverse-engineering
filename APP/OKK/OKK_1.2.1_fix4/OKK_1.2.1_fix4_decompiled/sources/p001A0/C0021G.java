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

    public C0021G(TextInputLayout textInputLayout) {
        this.f60d = textInputLayout;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View view, C0156j c0156j) {
        View.AccessibilityDelegate accessibilityDelegate = this.f243a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0156j.f357a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f60d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean z2 = !zIsEmpty;
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(hint);
        boolean z5 = !textInputLayout.f2504u0;
        boolean z6 = !TextUtils.isEmpty(error);
        if (!z6 && TextUtils.isEmpty(counterOverflowDescription)) {
            z3 = false;
        }
        String string = z4 ? hint.toString() : "";
        C0015A c0015a = textInputLayout.f2465b;
        C0868K c0868k = c0015a.f43b;
        if (c0868k.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0868k);
            accessibilityNodeInfo.setTraversalAfter(c0868k);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c0015a.f45d);
        }
        if (z2) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setText(string);
            if (z5 && placeholderText != null) {
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
        if (z3) {
            if (!z6) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0868K c0868k2 = textInputLayout.f2481j.f175y;
        if (c0868k2 != null) {
            accessibilityNodeInfo.setLabelFor(c0868k2);
        }
        textInputLayout.f2467c.m141b().mo75n(c0156j);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: e */
    public final void mo56e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo56e(view, accessibilityEvent);
        this.f60d.f2467c.m141b().mo76o(accessibilityEvent);
    }
}
