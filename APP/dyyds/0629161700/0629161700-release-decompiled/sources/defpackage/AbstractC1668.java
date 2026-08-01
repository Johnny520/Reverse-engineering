package defpackage;

/* JADX INFO: renamed from: ᲀᛵᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1668 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.String f7449 = "";

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.HashSet f7450 = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            defpackage.AbstractC1668.f7450 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static android.view.LayoutInflater m3063(android.content.Context r6) {
            java.lang.String r0 = defpackage.AbstractC1668.f7449
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L43
            android.content.res.Resources r0 = r6.getResources()     // Catch: java.lang.Exception -> L43
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Exception -> L43
            int r1 = java.lang.System.identityHashCode(r0)     // Catch: java.lang.Exception -> L43
            java.util.HashSet r2 = defpackage.AbstractC1668.f7450     // Catch: java.lang.Exception -> L43
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L43
            boolean r3 = r2.contains(r3)     // Catch: java.lang.Exception -> L43
            if (r3 == 0) goto L21
            goto L43
        L21:
            java.lang.Class<android.content.res.AssetManager> r3 = android.content.res.AssetManager.class
            java.lang.String r4 = "addAssetPath"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Exception -> L43
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L43
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L43
            java.lang.String r4 = defpackage.AbstractC1668.f7449     // Catch: java.lang.Exception -> L43
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L43
            r3.invoke(r0, r4)     // Catch: java.lang.Exception -> L43
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L43
            r2.add(r0)     // Catch: java.lang.Exception -> L43
        L43:
            ᛶᲁᛵᲁ r0 = new ᛶᲁᛵᲁ
            r0.<init>(r6)
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r0)
            android.view.LayoutInflater r6 = r6.cloneInContext(r0)
            return r6
    }
}
