package com.google.android.material.textfield;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.C0225;
import androidx.core.view.C2246;
import p155.C7606;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3175 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final TextInputLayout f10664;

    public C3175(TextInputLayout textInputLayout) {
        this.f10664 = textInputLayout;
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4186(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4186(view, accessibilityEvent);
        this.f10664.f10636.m7276().mo7266(accessibilityEvent);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3581(View view, C7606 c7606) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = c7606.f20635;
        this.f6546.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f10664;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f10628;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            C3184 c3184 = textInputLayout.f10600;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (c3184.f10708 == 2 && c3184.f10691 != null && !TextUtils.isEmpty(c3184.f10700)) {
                if (TextUtils.isEmpty(string)) {
                    string = helperText.toString();
                } else {
                    string = string + ", " + ((Object) helperText);
                }
            }
        }
        C3185 c3185 = textInputLayout.f10635;
        C0225 c0225 = c3185.f10723;
        if (c0225.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0225);
            accessibilityNodeInfo.setTraversalAfter(c0225);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c3185.f10718);
        }
        if (!zIsEmpty) {
            c7606.m12807(text);
        } else if (!TextUtils.isEmpty(string)) {
            c7606.m12807(string);
            if (!z && placeholderText != null) {
                c7606.m12807(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c7606.m12807(placeholderText);
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
            accessibilityNodeInfo.setError(!zIsEmpty3 ? charSequence : charSequence2);
        }
        textInputLayout.f10636.m7276().mo7267(c7606);
    }
}
