package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sk implements java.util.Comparator {
    public final android.graphics.Rect a;
    public final android.graphics.Rect b;
    public final boolean c;
    public final defpackage.vh d;

    public sk(defpackage.vh r2, boolean r3) {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.a = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.b = r0
            r1.c = r3
            r1.d = r2
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            vh r0 = r3.d
            r0.getClass()
            j0 r4 = (defpackage.j0) r4
            android.graphics.Rect r0 = r3.a
            r4.d(r0)
            j0 r5 = (defpackage.j0) r5
            android.graphics.Rect r4 = r3.b
            r5.d(r4)
            int r5 = r0.top
            int r1 = r4.top
            if (r5 >= r1) goto L1a
            goto L44
        L1a:
            if (r5 <= r1) goto L1d
            goto L46
        L1d:
            int r5 = r0.left
            int r1 = r4.left
            boolean r2 = r3.c
            if (r5 >= r1) goto L28
            if (r2 == 0) goto L44
            goto L46
        L28:
            if (r5 <= r1) goto L2d
            if (r2 == 0) goto L46
            goto L44
        L2d:
            int r5 = r0.bottom
            int r1 = r4.bottom
            if (r5 >= r1) goto L34
            goto L44
        L34:
            if (r5 <= r1) goto L37
            goto L46
        L37:
            int r5 = r0.right
            int r4 = r4.right
            if (r5 >= r4) goto L40
            if (r2 == 0) goto L44
            goto L46
        L40:
            if (r5 <= r4) goto L48
            if (r2 == 0) goto L46
        L44:
            r4 = -1
            return r4
        L46:
            r4 = 1
            return r4
        L48:
            r4 = 0
            return r4
    }
}
