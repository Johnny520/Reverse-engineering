package com.google.android.material.textfield;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.C1072;
import androidx.core.view.C3079;
import p171.C8436;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4008 extends C3079 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final TextInputLayout f11014;

    public C4008(TextInputLayout textInputLayout) {
        this.f11014 = textInputLayout;
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4756(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4756(view, accessibilityEvent);
        this.f11014.f10986.m7822().mo7812(accessibilityEvent);
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4151(View view, C8436 c8436) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = c8436.f20975;
        this.f6892.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f11014;
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
        boolean z = textInputLayout.f10978;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            C4017 c4017 = textInputLayout.f10950;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (c4017.f11058 == 2 && c4017.f11041 != null && !TextUtils.isEmpty(c4017.f11050)) {
                if (TextUtils.isEmpty(string)) {
                    string = helperText.toString();
                } else {
                    string = string + ", " + ((Object) helperText);
                }
            }
        }
        C4018 c4018 = textInputLayout.f10985;
        C1072 c1072 = c4018.f11073;
        if (c1072.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c1072);
            accessibilityNodeInfo.setTraversalAfter(c1072);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c4018.f11068);
        }
        if (!zIsEmpty) {
            c8436.m13395(text);
        } else if (!TextUtils.isEmpty(string)) {
            c8436.m13395(string);
            if (!z && placeholderText != null) {
                c8436.m13395(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c8436.m13395(placeholderText);
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
        textInputLayout.f10986.m7822().mo7813(c8436);
    }
}
