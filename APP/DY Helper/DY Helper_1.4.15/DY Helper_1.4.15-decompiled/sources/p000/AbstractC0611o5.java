package p000;

/* JADX INFO: renamed from: o5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0611o5 {
    /* JADX INFO: renamed from: α */
    public static boolean m4208(android.view.DragEvent r2, android.widget.TextView r3, android.app.Activity r4) {
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
            n r4 = new n     // Catch: java.lang.Throwable -> L41
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L41
            goto L35
        L2c:
            fp r4 = new fp     // Catch: java.lang.Throwable -> L41
            r4.<init>()     // Catch: java.lang.Throwable -> L41
            r4.f4056 = r2     // Catch: java.lang.Throwable -> L41
            r4.f4057 = r1     // Catch: java.lang.Throwable -> L41
        L35:
            hp r2 = r4.build()     // Catch: java.lang.Throwable -> L41
            p000.b92.m827(r3, r2)     // Catch: java.lang.Throwable -> L41
            r3.endBatchEdit()
            r2 = 1
            return r2
        L41:
            r2 = move-exception
            r3.endBatchEdit()
            throw r2
    }

    /* JADX INFO: renamed from: β */
    public static boolean m4209(android.view.DragEvent r2, android.view.View r3, android.app.Activity r4) {
            r4.requestDragAndDropPermissions(r2)
            android.content.ClipData r2 = r2.getClipData()
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r1 = 3
            if (r4 < r0) goto L14
            n r4 = new n
            r4.<init>(r2, r1)
            goto L1d
        L14:
            fp r4 = new fp
            r4.<init>()
            r4.f4056 = r2
            r4.f4057 = r1
        L1d:
            hp r2 = r4.build()
            p000.b92.m827(r3, r2)
            r2 = 1
            return r2
    }
}
