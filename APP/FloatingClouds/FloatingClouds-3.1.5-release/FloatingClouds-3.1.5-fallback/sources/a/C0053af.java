package a;

/* JADX INFO: renamed from: a.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0053af implements a.InterfaceC0106dc {
    @Override // a.InterfaceC0106dc
    public final a.W3 a(android.view.View r10, a.W3 r11) {
            r9 = this;
            java.lang.String r0 = "ReceiveContent"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onReceive: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L1a:
            a.W3$e r0 = r11.f314a
            int r0 = r0.d()
            r1 = 2
            if (r0 != r1) goto L24
            return r11
        L24:
            a.W3$e r11 = r11.f314a
            android.content.ClipData r0 = r11.a()
            int r11 = r11.b()
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.CharSequence r1 = r10.getText()
            android.text.Editable r1 = (android.text.Editable) r1
            android.content.Context r10 = r10.getContext()
            r2 = 0
            r3 = r2
            r4 = r3
        L3d:
            int r5 = r0.getItemCount()
            if (r3 >= r5) goto L94
            android.content.ClipData$Item r5 = r0.getItemAt(r3)
            r6 = 1
            r7 = r11 & 1
            if (r7 == 0) goto L59
            java.lang.CharSequence r5 = r5.coerceToText(r10)
            boolean r7 = r5 instanceof android.text.Spanned
            if (r7 == 0) goto L5d
            java.lang.String r5 = r5.toString()
            goto L5d
        L59:
            java.lang.CharSequence r5 = r5.coerceToStyledText(r10)
        L5d:
            if (r5 == 0) goto L91
            if (r4 != 0) goto L81
            int r4 = android.text.Selection.getSelectionStart(r1)
            int r7 = android.text.Selection.getSelectionEnd(r1)
            int r8 = java.lang.Math.min(r4, r7)
            int r8 = java.lang.Math.max(r2, r8)
            int r4 = java.lang.Math.max(r4, r7)
            int r4 = java.lang.Math.max(r2, r4)
            android.text.Selection.setSelection(r1, r4)
            r1.replace(r8, r4, r5)
            r4 = r6
            goto L91
        L81:
            int r6 = android.text.Selection.getSelectionEnd(r1)
            java.lang.String r7 = "\n"
            r1.insert(r6, r7)
            int r6 = android.text.Selection.getSelectionEnd(r1)
            r1.insert(r6, r5)
        L91:
            int r3 = r3 + 1
            goto L3d
        L94:
            r10 = 0
            return r10
    }
}
