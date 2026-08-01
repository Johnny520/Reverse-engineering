package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e60 extends defpackage.x {
    public final com.google.android.material.textfield.TextInputLayout d;

    public e60(com.google.android.material.textfield.TextInputLayout r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            return
    }

    @Override // defpackage.x
    public final void d(android.view.View r18, defpackage.j0 r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.a
            android.view.View$AccessibilityDelegate r3 = r0.a
            r4 = r18
            r3.onInitializeAccessibilityNodeInfo(r4, r2)
            com.google.android.material.textfield.TextInputLayout r3 = r0.d
            android.widget.EditText r4 = r3.getEditText()
            if (r4 == 0) goto L1a
            android.text.Editable r4 = r4.getText()
            goto L1b
        L1a:
            r4 = 0
        L1b:
            java.lang.CharSequence r5 = r3.getHint()
            java.lang.CharSequence r6 = r3.getError()
            java.lang.CharSequence r7 = r3.getPlaceholderText()
            int r8 = r3.getCounterMaxLength()
            java.lang.CharSequence r9 = r3.getCounterOverflowDescription()
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            boolean r12 = r3.t0
            boolean r13 = android.text.TextUtils.isEmpty(r6)
            if (r13 == 0) goto L48
            boolean r14 = android.text.TextUtils.isEmpty(r9)
            if (r14 != 0) goto L46
            goto L48
        L46:
            r14 = 0
            goto L49
        L48:
            r14 = 1
        L49:
            if (r11 != 0) goto L50
            java.lang.String r5 = r5.toString()
            goto L52
        L50:
            java.lang.String r5 = ""
        L52:
            r40 r11 = r3.b
            g5 r15 = r11.b
            int r16 = r15.getVisibility()
            if (r16 != 0) goto L63
            r2.setLabelFor(r15)
            r2.setTraversalAfter(r15)
            goto L68
        L63:
            com.google.android.material.internal.CheckableImageButton r11 = r11.d
            r2.setTraversalAfter(r11)
        L68:
            if (r10 != 0) goto L6e
            r2.setText(r4)
            goto L98
        L6e:
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L93
            r2.setText(r5)
            if (r12 != 0) goto L98
            if (r7 == 0) goto L98
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            java.lang.String r12 = ", "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            r2.setText(r7)
            goto L98
        L93:
            if (r7 == 0) goto L98
            r2.setText(r7)
        L98:
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto La4
            r2.setHintText(r5)
            r2.setShowingHintText(r10)
        La4:
            if (r4 == 0) goto Lad
            int r4 = r4.length()
            if (r4 != r8) goto Lad
            goto Lae
        Lad:
            r8 = -1
        Lae:
            r2.setMaxTextLength(r8)
            if (r14 == 0) goto Lba
            if (r13 != 0) goto Lb6
            goto Lb7
        Lb6:
            r6 = r9
        Lb7:
            r2.setError(r6)
        Lba:
            zo r4 = r3.j
            g5 r4 = r4.y
            if (r4 == 0) goto Lc3
            r2.setLabelFor(r4)
        Lc3:
            ej r2 = r3.c
            fj r2 = r2.b()
            r2.m(r1)
            return
    }

    @Override // defpackage.x
    public final void e(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            super.e(r1, r2)
            com.google.android.material.textfield.TextInputLayout r1 = r0.d
            ej r1 = r1.c
            fj r1 = r1.b()
            r1.n(r2)
            return
    }
}
