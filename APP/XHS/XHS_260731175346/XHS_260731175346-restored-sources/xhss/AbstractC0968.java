package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛷᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0968 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final java.util.WeakHashMap f3170 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static java.lang.String f3171 = "";

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            xhss.AbstractC0968.f3170 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static android.view.LayoutInflater m1604(android.content.Context r5) {
            java.lang.String r0 = xhss.AbstractC0968.f3171
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L39
            android.content.res.Resources r0 = r5.getResources()     // Catch: java.lang.Exception -> L39
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Exception -> L39
            java.util.WeakHashMap r1 = xhss.AbstractC0968.f3170     // Catch: java.lang.Exception -> L39
            boolean r2 = r1.containsKey(r0)     // Catch: java.lang.Exception -> L39
            if (r2 == 0) goto L19
            goto L39
        L19:
            java.lang.Class<android.content.res.AssetManager> r2 = android.content.res.AssetManager.class
            java.lang.String r3 = "addAssetPath"
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L39
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L39
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = xhss.AbstractC0968.f3171     // Catch: java.lang.Exception -> L39
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L39
            r2.invoke(r0, r3)     // Catch: java.lang.Exception -> L39
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L39
            r1.put(r0, r2)     // Catch: java.lang.Exception -> L39
        L39:
            xhss.ᛴᲀᛵᛱ r0 = new xhss.ᛴᲀᛵᛱ
            r0.<init>(r5)
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r0)
            android.view.LayoutInflater r5 = r5.cloneInContext(r0)
            return r5
    }
}
