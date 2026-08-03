package a;

/* JADX INFO: renamed from: a.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0220k1 {
    public static boolean a(android.view.DragEvent r2, android.widget.TextView r3, android.app.Activity r4) {
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
            a.W3$a r4 = new a.W3$a     // Catch: java.lang.Throwable -> L41
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L41
            goto L35
        L2c:
            a.W3$c r4 = new a.W3$c     // Catch: java.lang.Throwable -> L41
            r4.<init>()     // Catch: java.lang.Throwable -> L41
            r4.f316a = r2     // Catch: java.lang.Throwable -> L41
            r4.b = r1     // Catch: java.lang.Throwable -> L41
        L35:
            a.W3 r2 = r4.a()     // Catch: java.lang.Throwable -> L41
            a.C0414ug.f(r3, r2)     // Catch: java.lang.Throwable -> L41
            r3.endBatchEdit()
            r2 = 1
            return r2
        L41:
            r2 = move-exception
            r3.endBatchEdit()
            throw r2
    }

    public static boolean b(android.view.DragEvent r2, android.view.View r3, android.app.Activity r4) {
            r4.requestDragAndDropPermissions(r2)
            android.content.ClipData r2 = r2.getClipData()
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r1 = 3
            if (r4 < r0) goto L14
            a.W3$a r4 = new a.W3$a
            r4.<init>(r2, r1)
            goto L1d
        L14:
            a.W3$c r4 = new a.W3$c
            r4.<init>()
            r4.f316a = r2
            r4.b = r1
        L1d:
            a.W3 r2 = r4.a()
            a.C0414ug.f(r3, r2)
            r2 = 1
            return r2
    }
}
