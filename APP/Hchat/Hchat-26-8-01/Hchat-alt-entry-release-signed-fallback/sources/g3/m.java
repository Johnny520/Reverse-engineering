package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static void a(android.view.WindowInsets r1, android.view.View r2) {
            r0 = 2131099758(0x7f06006e, float:1.7811878E38)
            java.lang.Object r0 = r2.getTag(r0)
            android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
            if (r0 == 0) goto Le
            r0.onApplyWindowInsets(r2, r1)
        Le:
            return
    }

    public static void b(android.view.View r2, g3.e r3) {
            if (r3 == 0) goto L8
            g3.l r0 = new g3.l
            r0.<init>(r2, r3)
            goto L9
        L8:
            r0 = 0
        L9:
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r3 >= r1) goto L15
            r3 = 2131099749(0x7f060065, float:1.781186E38)
            r2.setTag(r3, r0)
        L15:
            r3 = 2131099748(0x7f060064, float:1.7811858E38)
            java.lang.Object r3 = r2.getTag(r3)
            if (r3 == 0) goto L1f
            return
        L1f:
            if (r0 == 0) goto L25
            r2.setOnApplyWindowInsetsListener(r0)
            return
        L25:
            r3 = 2131099758(0x7f06006e, float:1.7811878E38)
            java.lang.Object r3 = r2.getTag(r3)
            android.view.View$OnApplyWindowInsetsListener r3 = (android.view.View.OnApplyWindowInsetsListener) r3
            r2.setOnApplyWindowInsetsListener(r3)
            return
    }
}
