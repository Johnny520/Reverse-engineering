package a;

/* JADX INFO: loaded from: classes.dex */
public final class N5 extends android.view.inputmethod.InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.EditText f182a;
    public final a.N5.a b;

    public static class a {
        public static boolean a(a.N5 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
                r0 = 0
                if (r8 == 0) goto Lef
                if (r9 < 0) goto Lef
                if (r10 >= 0) goto L9
                goto Lef
            L9:
                int r1 = android.text.Selection.getSelectionStart(r8)
                int r2 = android.text.Selection.getSelectionEnd(r8)
                r3 = -1
                if (r1 == r3) goto Lef
                if (r2 == r3) goto Lef
                if (r1 == r2) goto L1a
                goto Lef
            L1a:
                r4 = 1
                if (r11 == 0) goto La5
                int r9 = java.lang.Math.max(r9, r0)
                int r11 = r8.length()
                if (r1 < 0) goto L2c
                if (r11 >= r1) goto L2a
                goto L2c
            L2a:
                if (r9 >= 0) goto L2e
            L2c:
                r1 = r3
                goto L5d
            L2e:
                r11 = r0
            L2f:
                if (r9 != 0) goto L32
                goto L5d
            L32:
                int r1 = r1 + (-1)
                if (r1 >= 0) goto L3b
                if (r11 == 0) goto L39
                goto L2c
            L39:
                r1 = r0
                goto L5d
            L3b:
                char r5 = r8.charAt(r1)
                if (r11 == 0) goto L4b
                boolean r11 = java.lang.Character.isHighSurrogate(r5)
                if (r11 != 0) goto L48
                goto L2c
            L48:
                int r9 = r9 + (-1)
                goto L2e
            L4b:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L54
                int r9 = r9 + (-1)
                goto L2f
            L54:
                boolean r11 = java.lang.Character.isHighSurrogate(r5)
                if (r11 == 0) goto L5b
                goto L2c
            L5b:
                r11 = r4
                goto L2f
            L5d:
                int r9 = java.lang.Math.max(r10, r0)
                int r10 = r8.length()
                if (r2 < 0) goto L6c
                if (r10 >= r2) goto L6a
                goto L6c
            L6a:
                if (r9 >= 0) goto L6e
            L6c:
                r10 = r3
                goto La0
            L6e:
                r11 = r0
            L6f:
                if (r9 != 0) goto L73
                r10 = r2
                goto La0
            L73:
                if (r2 < r10) goto L78
                if (r11 == 0) goto La0
                goto L6c
            L78:
                char r5 = r8.charAt(r2)
                if (r11 == 0) goto L8a
                boolean r11 = java.lang.Character.isLowSurrogate(r5)
                if (r11 != 0) goto L85
                goto L6c
            L85:
                int r9 = r9 + (-1)
                int r2 = r2 + 1
                goto L6e
            L8a:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L95
                int r9 = r9 + (-1)
                int r2 = r2 + 1
                goto L6f
            L95:
                boolean r11 = java.lang.Character.isLowSurrogate(r5)
                if (r11 == 0) goto L9c
                goto L6c
            L9c:
                int r2 = r2 + 1
                r11 = r4
                goto L6f
            La0:
                if (r1 == r3) goto Lef
                if (r10 != r3) goto Lb3
                goto Lef
            La5:
                int r1 = r1 - r9
                int r1 = java.lang.Math.max(r1, r0)
                int r2 = r2 + r10
                int r9 = r8.length()
                int r10 = java.lang.Math.min(r2, r9)
            Lb3:
                java.lang.Class<a.R5> r9 = a.R5.class
                java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
                a.R5[] r9 = (a.R5[]) r9
                if (r9 == 0) goto Lef
                int r11 = r9.length
                if (r11 <= 0) goto Lef
                int r11 = r9.length
                r2 = r0
            Lc2:
                if (r2 >= r11) goto Ld9
                r3 = r9[r2]
                int r5 = r8.getSpanStart(r3)
                int r3 = r8.getSpanEnd(r3)
                int r1 = java.lang.Math.min(r5, r1)
                int r10 = java.lang.Math.max(r3, r10)
                int r2 = r2 + 1
                goto Lc2
            Ld9:
                int r9 = java.lang.Math.max(r1, r0)
                int r11 = r8.length()
                int r10 = java.lang.Math.min(r10, r11)
                r7.beginBatchEdit()
                r8.delete(r9, r10)
                r7.endBatchEdit()
                return r4
            Lef:
                return r0
        }
    }

    public N5(android.widget.EditText r5, android.view.inputmethod.InputConnection r6, android.view.inputmethod.EditorInfo r7) {
            r4 = this;
            a.N5$a r0 = new a.N5$a
            r0.<init>()
            r1 = 0
            r4.<init>(r6, r1)
            r4.f182a = r5
            r4.b = r0
            androidx.emoji2.text.c r5 = androidx.emoji2.text.c.k
            if (r5 == 0) goto L5a
            androidx.emoji2.text.c r5 = androidx.emoji2.text.c.a()
            int r6 = r5.b()
            r0 = 1
            if (r6 != r0) goto L5a
            if (r7 != 0) goto L1f
            return
        L1f:
            android.os.Bundle r6 = r7.extras
            if (r6 != 0) goto L2a
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r7.extras = r6
        L2a:
            androidx.emoji2.text.c$a r5 = r5.e
            r5.getClass()
            android.os.Bundle r6 = r7.extras
            a.kb r0 = r5.c
            a.jb r0 = r0.f546a
            r2 = 4
            int r2 = r0.a(r2)
            if (r2 == 0) goto L48
            java.lang.Object r3 = r0.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r0.f233a
            int r2 = r2 + r0
            int r0 = r3.getInt(r2)
            goto L49
        L48:
            r0 = r1
        L49:
            java.lang.String r2 = "android.support.text.emoji.emojiCompat_metadataVersion"
            r6.putInt(r2, r0)
            android.os.Bundle r6 = r7.extras
            androidx.emoji2.text.c r5 = r5.f893a
            r5.getClass()
            java.lang.String r5 = "android.support.text.emoji.emojiCompat_replaceAll"
            r6.putBoolean(r5, r1)
        L5a:
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r3, int r4) {
            r2 = this;
            android.widget.EditText r0 = r2.f182a
            android.text.Editable r0 = r0.getEditableText()
            a.N5$a r1 = r2.b
            r1.getClass()
            r1 = 0
            boolean r0 = a.N5.a.a(r2, r0, r3, r4, r1)
            if (r0 != 0) goto L1a
            boolean r3 = super.deleteSurroundingText(r3, r4)
            if (r3 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            r3 = 1
            return r3
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r3, int r4) {
            r2 = this;
            android.widget.EditText r0 = r2.f182a
            android.text.Editable r0 = r0.getEditableText()
            a.N5$a r1 = r2.b
            r1.getClass()
            r1 = 1
            boolean r0 = a.N5.a.a(r2, r0, r3, r4, r1)
            if (r0 != 0) goto L1b
            boolean r3 = super.deleteSurroundingTextInCodePoints(r3, r4)
            if (r3 == 0) goto L19
            goto L1b
        L19:
            r3 = 0
            return r3
        L1b:
            return r1
    }
}
