package com.google.android.material.textfield;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.C0225;
import androidx.core.view.C2246;
import p155.C7607;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3176 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final TextInputLayout f10669;

    public C3176(TextInputLayout textInputLayout) {
        this.f10669 = textInputLayout;
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4196(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4196(view, accessibilityEvent);
        this.f10669.f10641.m7263().mo7253(accessibilityEvent);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3591(View view, C7607 c7607) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = c7607.f20630;
        this.f6547.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f10669;
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
        boolean z = textInputLayout.f10633;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            C3185 c3185 = textInputLayout.f10605;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (c3185.f10713 == 2 && c3185.f10696 != null && !TextUtils.isEmpty(c3185.f10705)) {
                if (TextUtils.isEmpty(string)) {
                    string = helperText.toString();
                } else {
                    string = string + ", " + ((Object) helperText);
                }
            }
        }
        C3186 c3186 = textInputLayout.f10640;
        C0225 c0225 = c3186.f10728;
        if (c0225.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0225);
            accessibilityNodeInfo.setTraversalAfter(c0225);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c3186.f10723);
        }
        if (!zIsEmpty) {
            c7607.m12836(text);
        } else if (!TextUtils.isEmpty(string)) {
            c7607.m12836(string);
            if (!z && placeholderText != null) {
                c7607.m12836(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c7607.m12836(placeholderText);
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
        textInputLayout.f10641.m7263().mo7254(c7607);
    }
}
