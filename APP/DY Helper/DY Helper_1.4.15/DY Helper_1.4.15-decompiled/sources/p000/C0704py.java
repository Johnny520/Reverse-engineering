package p000;

/* JADX INFO: renamed from: py */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0704py extends android.view.inputmethod.InputConnectionWrapper {

    /* JADX INFO: renamed from: α */
    public final android.widget.TextView f8756;

    /* JADX INFO: renamed from: β */
    public final p000.C0381i2 f8757;

    public C0704py(android.view.inputmethod.EditorInfo r3, android.view.inputmethod.InputConnection r4, android.widget.TextView r5) {
            r2 = this;
            i2 r0 = new i2
            r1 = 21
            r0.<init>(r1)
            r1 = 0
            r2.<init>(r4, r1)
            r2.f8756 = r5
            r2.f8757 = r0
            boolean r2 = p000.C0449jy.m3072()
            if (r2 == 0) goto L5b
            jy r2 = p000.C0449jy.m3071()
            int r4 = r2.m3073()
            r5 = 1
            if (r4 != r5) goto L5b
            if (r3 != 0) goto L23
            goto L5b
        L23:
            android.os.Bundle r4 = r3.extras
            if (r4 != 0) goto L2e
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r3.extras = r4
        L2e:
            fy r2 = r2.f5654
            r2.getClass()
            android.os.Bundle r4 = r3.extras
            i0 r2 = r2.f4167
            java.lang.Object r2 = r2.f4857
            h01 r2 = (p000.h01) r2
            r5 = 4
            int r5 = r2.m7040(r5)
            if (r5 == 0) goto L4e
            java.lang.Object r0 = r2.f12860
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r2 = r2.f12857
            int r5 = r5 + r2
            int r2 = r0.getInt(r5)
            goto L4f
        L4e:
            r2 = r1
        L4f:
            java.lang.String r5 = "android.support.text.emoji.emojiCompat_metadataVersion"
            r4.putInt(r5, r2)
            android.os.Bundle r2 = r3.extras
            java.lang.String r3 = "android.support.text.emoji.emojiCompat_replaceAll"
            r2.putBoolean(r3, r1)
        L5b:
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r3, int r4) {
            r2 = this;
            android.widget.TextView r0 = r2.f8756
            android.text.Editable r0 = r0.getEditableText()
            i2 r1 = r2.f8757
            r1.getClass()
            r1 = 0
            boolean r0 = p000.C0381i2.m2593(r2, r0, r3, r4, r1)
            if (r0 != 0) goto L1a
            boolean r2 = super.deleteSurroundingText(r3, r4)
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            r2 = 1
            return r2
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r3, int r4) {
            r2 = this;
            android.widget.TextView r0 = r2.f8756
            android.text.Editable r0 = r0.getEditableText()
            i2 r1 = r2.f8757
            r1.getClass()
            r1 = 1
            boolean r0 = p000.C0381i2.m2593(r2, r0, r3, r4, r1)
            if (r0 != 0) goto L1b
            boolean r2 = super.deleteSurroundingTextInCodePoints(r3, r4)
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = 0
            return r2
        L1b:
            return r1
    }
}
