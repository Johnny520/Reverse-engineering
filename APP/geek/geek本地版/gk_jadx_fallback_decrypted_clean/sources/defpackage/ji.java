package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ji extends android.view.inputmethod.InputConnectionWrapper {
    public final android.widget.EditText a;
    public final defpackage.vh b;

    public ji(android.widget.EditText r4, android.view.inputmethod.InputConnection r5, android.view.inputmethod.EditorInfo r6) {
            r3 = this;
            vh r0 = new vh
            r1 = 18
            r0.<init>(r1)
            r1 = 0
            r3.<init>(r5, r1)
            r3.a = r4
            r3.b = r0
            ei r4 = defpackage.ei.j
            if (r4 == 0) goto L59
            ei r4 = defpackage.ei.a()
            int r5 = r4.b()
            r0 = 1
            if (r5 != r0) goto L59
            if (r6 != 0) goto L21
            return
        L21:
            android.os.Bundle r5 = r6.extras
            if (r5 != 0) goto L2c
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r6.extras = r5
        L2c:
            zh r4 = r4.e
            r4.getClass()
            android.os.Bundle r5 = r6.extras
            a8 r4 = r4.c
            java.lang.Object r4 = r4.a
            wv r4 = (defpackage.wv) r4
            r0 = 4
            int r0 = r4.a(r0)
            if (r0 == 0) goto L4c
            java.lang.Object r2 = r4.d
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r4 = r4.a
            int r0 = r0 + r4
            int r4 = r2.getInt(r0)
            goto L4d
        L4c:
            r4 = r1
        L4d:
            java.lang.String r0 = "android.support.text.emoji.emojiCompat_metadataVersion"
            r5.putInt(r0, r4)
            android.os.Bundle r4 = r6.extras
            java.lang.String r5 = "android.support.text.emoji.emojiCompat_replaceAll"
            r4.putBoolean(r5, r1)
        L59:
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r3, int r4) {
            r2 = this;
            android.widget.EditText r0 = r2.a
            android.text.Editable r0 = r0.getEditableText()
            vh r1 = r2.b
            r1.getClass()
            r1 = 0
            boolean r0 = defpackage.vh.i(r2, r0, r3, r4, r1)
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
            android.widget.EditText r0 = r2.a
            android.text.Editable r0 = r0.getEditableText()
            vh r1 = r2.b
            r1.getClass()
            r1 = 1
            boolean r0 = defpackage.vh.i(r2, r0, r3, r4, r1)
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
