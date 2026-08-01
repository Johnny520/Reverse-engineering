package defpackage;

/* JADX INFO: renamed from: ᛱᲀᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0155 extends android.view.inputmethod.InputConnectionWrapper {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.widget.TextView f1120;

    public C0155(android.view.inputmethod.EditorInfo r3, android.view.inputmethod.InputConnection r4, android.widget.TextView r5) {
            r2 = this;
            r0 = 0
            r2.<init>(r4, r0)
            r2.f1120 = r5
            ᛴᲁᛶᲈ r2 = defpackage.C0766.f3561
            if (r2 == 0) goto L52
            ᛴᲁᛶᲈ r2 = defpackage.C0766.m1696()
            int r4 = r2.m1700()
            r5 = 1
            if (r4 != r5) goto L52
            if (r3 != 0) goto L18
            return
        L18:
            android.os.Bundle r4 = r3.extras
            if (r4 != 0) goto L23
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r3.extras = r4
        L23:
            ᛲᛴᛴᛵ r2 = r2.f3563
            r2.getClass()
            android.os.Bundle r4 = r3.extras
            java.lang.Object r2 = r2.f1562
            ᛲᛶᛲᲁ r2 = (defpackage.C0302) r2
            java.lang.Object r2 = r2.f1616
            ᲀᛶᛴᲇ r2 = (defpackage.C1688) r2
            r5 = 4
            int r5 = r2.m2420(r5)
            if (r5 == 0) goto L45
            java.lang.Object r1 = r2.f5769
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r2.f5768
            int r5 = r5 + r2
            int r2 = r1.getInt(r5)
            goto L46
        L45:
            r2 = r0
        L46:
            java.lang.String r5 = "android.support.text.emoji.emojiCompat_metadataVersion"
            r4.putInt(r5, r2)
            android.os.Bundle r2 = r3.extras
            java.lang.String r3 = "android.support.text.emoji.emojiCompat_replaceAll"
            r2.putBoolean(r3, r0)
        L52:
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r3, int r4) {
            r2 = this;
            android.widget.TextView r0 = r2.f1120
            android.text.Editable r0 = r0.getEditableText()
            r1 = 0
            boolean r0 = defpackage.C0682.m1539(r2, r0, r3, r4, r1)
            if (r0 != 0) goto L15
            boolean r2 = super.deleteSurroundingText(r3, r4)
            if (r2 == 0) goto L14
            goto L15
        L14:
            return r1
        L15:
            r2 = 1
            return r2
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r3, int r4) {
            r2 = this;
            android.widget.TextView r0 = r2.f1120
            android.text.Editable r0 = r0.getEditableText()
            r1 = 1
            boolean r0 = defpackage.C0682.m1539(r2, r0, r3, r4, r1)
            if (r0 != 0) goto L16
            boolean r2 = super.deleteSurroundingTextInCodePoints(r3, r4)
            if (r2 == 0) goto L14
            goto L16
        L14:
            r2 = 0
            return r2
        L16:
            return r1
    }
}
