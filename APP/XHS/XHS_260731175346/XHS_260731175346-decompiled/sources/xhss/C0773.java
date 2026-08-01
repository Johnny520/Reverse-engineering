package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛵᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0773 extends android.view.inputmethod.InputConnectionWrapper {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.AbstractC0195 f2552;

    public C0773(xhss.AbstractC0195 r3, android.view.inputmethod.InputConnection r4, android.view.inputmethod.EditorInfo r5) {
            r2 = this;
            r0 = 0
            r2.<init>(r4, r0)
            r2.f2552 = r3
            xhss.ᛵᲁᛱᲁ r2 = xhss.C0514.f1869
            if (r2 == 0) goto L52
            xhss.ᛵᲁᛱᲁ r2 = xhss.C0514.m921()
            int r3 = r2.m922()
            r4 = 1
            if (r3 != r4) goto L52
            if (r5 != 0) goto L18
            return
        L18:
            android.os.Bundle r3 = r5.extras
            if (r3 != 0) goto L23
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r5.extras = r3
        L23:
            xhss.ᛲᲈᛱᛳ r2 = r2.f1872
            r2.getClass()
            android.os.Bundle r3 = r5.extras
            java.lang.Object r2 = r2.f806
            xhss.ᲇᛸᛶ r2 = (xhss.C1068) r2
            java.lang.Object r2 = r2.f3444
            xhss.ᲁᛸᛱᲀ r2 = (xhss.C0973) r2
            r4 = 4
            int r4 = r2.m880(r4)
            if (r4 == 0) goto L45
            java.lang.Object r1 = r2.f1739
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r2.f1737
            int r4 = r4 + r2
            int r2 = r1.getInt(r4)
            goto L46
        L45:
            r2 = r0
        L46:
            java.lang.String r4 = "android.support.text.emoji.emojiCompat_metadataVersion"
            r3.putInt(r4, r2)
            android.os.Bundle r2 = r5.extras
            java.lang.String r3 = "android.support.text.emoji.emojiCompat_replaceAll"
            r2.putBoolean(r3, r0)
        L52:
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r3, int r4) {
            r2 = this;
            xhss.ᛲᛸᛳᛳ r0 = r2.f2552
            android.text.Editable r0 = r0.getEditableText()
            r1 = 0
            boolean r0 = xhss.C0623.m1089(r2, r0, r3, r4, r1)
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
            xhss.ᛲᛸᛳᛳ r0 = r2.f2552
            android.text.Editable r0 = r0.getEditableText()
            r1 = 1
            boolean r0 = xhss.C0623.m1089(r2, r0, r3, r4, r1)
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
