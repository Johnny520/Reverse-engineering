package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa0 {
    public static java.lang.String[] a(android.view.View r0) {
            java.lang.String[] r0 = r0.getReceiveContentMimeTypes()
            return r0
    }

    public static defpackage.cd b(android.view.View r1, defpackage.cd r2) {
            bd r0 = r2.a
            android.view.ContentInfo r0 = r0.h()
            java.util.Objects.requireNonNull(r0)
            android.view.ContentInfo r0 = defpackage.p7.h(r0)
            android.view.ContentInfo r1 = r1.performReceiveContent(r0)
            if (r1 != 0) goto L15
            r1 = 0
            return r1
        L15:
            if (r1 != r0) goto L18
            return r2
        L18:
            cd r2 = new cd
            l0 r0 = new l0
            r0.<init>(r1)
            r2.<init>(r0)
            return r2
    }

    public static void c(android.view.View r1, java.lang.String[] r2, defpackage.ax r3) {
            if (r3 != 0) goto L7
            r3 = 0
            r1.setOnReceiveContentListener(r2, r3)
            return
        L7:
            ga0 r0 = new ga0
            r0.<init>(r3)
            r1.setOnReceiveContentListener(r2, r0)
            return
    }
}
