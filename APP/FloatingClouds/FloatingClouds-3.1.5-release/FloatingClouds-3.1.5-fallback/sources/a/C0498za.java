package a;

/* JADX INFO: renamed from: a.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0498za {
    public static android.util.TypedValue a(android.content.Context r2, int r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r1)
            if (r2 == 0) goto L11
            return r0
        L11:
            r2 = 0
            return r2
    }

    public static boolean b(android.content.Context r1, int r2, boolean r3) {
            android.util.TypedValue r1 = a(r1, r2)
            if (r1 == 0) goto L14
            int r2 = r1.type
            r0 = 18
            if (r2 != r0) goto L14
            int r1 = r1.data
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
        L14:
            return r3
    }

    public static android.util.TypedValue c(android.content.Context r1, int r2, java.lang.String r3) {
            android.util.TypedValue r0 = a(r1, r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceName(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            java.lang.String r2 = "%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant)."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }
}
