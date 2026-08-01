package defpackage;

/* JADX INFO: renamed from: ᲈᛳᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2204 {
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C2300 m3603(android.view.View r1, defpackage.C2300 r2, android.graphics.Rect r3) {
            android.view.WindowInsets r0 = r2.m3731()
            if (r0 == 0) goto Lf
            android.view.WindowInsets r2 = r1.computeSystemWindowInsets(r0, r3)
            ᲈᛸᛱᲀ r1 = defpackage.C2300.m3730(r1, r2)
            return r1
        Lf:
            r3.setEmpty()
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m3604(android.view.View r1, defpackage.InterfaceC0532 r2) {
            if (r2 == 0) goto L8
            ᛵᛴ r0 = new ᛵᛴ
            r0.<init>(r1, r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r2 = 1711866855(0x660903e7, float:1.6175905E23)
            java.lang.Object r2 = r1.getTag(r2)
            if (r2 == 0) goto L13
            return
        L13:
            if (r0 == 0) goto L19
            r1.setOnApplyWindowInsetsListener(r0)
            return
        L19:
            r2 = 1711866865(0x660903f1, float:1.6175923E23)
            java.lang.Object r2 = r1.getTag(r2)
            android.view.View$OnApplyWindowInsetsListener r2 = (android.view.View.OnApplyWindowInsetsListener) r2
            r1.setOnApplyWindowInsetsListener(r2)
            return
    }
}
