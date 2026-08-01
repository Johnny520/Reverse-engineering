package defpackage;

/* JADX INFO: renamed from: ᛶᲈᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1179 {
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static boolean m2289(android.view.DragEvent r2, android.widget.TextView r3, android.app.Activity r4) {
            r4.requestDragAndDropPermissions(r2)
            float r4 = r2.getX()
            float r0 = r2.getY()
            int r4 = r3.getOffsetForPosition(r4, r0)
            r3.beginBatchEdit()
            java.lang.CharSequence r0 = r3.getText()     // Catch: java.lang.Throwable -> L41
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch: java.lang.Throwable -> L41
            android.text.Selection.setSelection(r0, r4)     // Catch: java.lang.Throwable -> L41
            android.content.ClipData r2 = r2.getClipData()     // Catch: java.lang.Throwable -> L41
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L41
            r0 = 31
            r1 = 3
            if (r4 < r0) goto L2c
            ᛸᲈᛸᲈ r4 = new ᛸᲈᛸᲈ     // Catch: java.lang.Throwable -> L41
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L41
            goto L35
        L2c:
            ᛵᛶᛱᛲ r4 = new ᛵᛶᛱᛲ     // Catch: java.lang.Throwable -> L41
            r4.<init>()     // Catch: java.lang.Throwable -> L41
            r4.f4118 = r2     // Catch: java.lang.Throwable -> L41
            r4.f4117 = r1     // Catch: java.lang.Throwable -> L41
        L35:
            ᛳᛱᛴᛸ r2 = r4.build()     // Catch: java.lang.Throwable -> L41
            defpackage.AbstractC0858.m1814(r3, r2)     // Catch: java.lang.Throwable -> L41
            r3.endBatchEdit()
            r2 = 1
            return r2
        L41:
            r2 = move-exception
            r3.endBatchEdit()
            throw r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static boolean m2290(android.view.DragEvent r2, android.view.View r3, android.app.Activity r4) {
            r4.requestDragAndDropPermissions(r2)
            android.content.ClipData r2 = r2.getClipData()
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r1 = 3
            if (r4 < r0) goto L14
            ᛸᲈᛸᲈ r4 = new ᛸᲈᛸᲈ
            r4.<init>(r2, r1)
            goto L1d
        L14:
            ᛵᛶᛱᛲ r4 = new ᛵᛶᛱᛲ
            r4.<init>()
            r4.f4118 = r2
            r4.f4117 = r1
        L1d:
            ᛳᛱᛴᛸ r2 = r4.build()
            defpackage.AbstractC0858.m1814(r3, r2)
            r2 = 1
            return r2
    }
}
