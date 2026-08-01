package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛸᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1067 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final /* synthetic */ sun.misc.Unsafe f3442 = null;

    static {
            java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
            r1 = 0
            java.lang.String r2 = "theUnsafe"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> La
            goto L31
        La:
            r2 = move-exception
            java.lang.reflect.Field[] r3 = r0.getDeclaredFields()
            int r4 = r3.length
            r5 = 0
        L11:
            if (r5 >= r4) goto L2e
            r6 = r3[r5]
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 == 0) goto L2b
            java.lang.Class r7 = r6.getType()
            boolean r7 = r0.isAssignableFrom(r7)
            if (r7 == 0) goto L2b
            r0 = r6
            goto L2f
        L2b:
            int r5 = r5 + 1
            goto L11
        L2e:
            r0 = r1
        L2f:
            if (r0 != 0) goto L45
        L31:
            r2 = 1
            r0.setAccessible(r2)
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L3e
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.IllegalAccessException -> L3e
            xhss.AbstractC1067.f3442 = r0     // Catch: java.lang.IllegalAccessException -> L3e
            return
        L3e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L45:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Couldn't find the Unsafe"
            r0.<init>(r1, r2)
            throw r0
    }
}
