package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛱᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0334 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static volatile boolean f1248 = true;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final boolean m675(java.lang.reflect.AccessibleObject r2) {
            boolean r0 = r2.isAccessible()     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto La
            r0 = 1
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> Ld
        La:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r2 = move-exception
            xhss.ᲈᛳᛱᲇ r0 = new xhss.ᲈᛳᛱᲇ
            r0.<init>(r2)
            r2 = r0
        L14:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r2 instanceof xhss.C1129
            if (r1 == 0) goto L1b
            r2 = r0
        L1b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final boolean m676(java.lang.reflect.Member r3) {
            boolean r0 = r3 instanceof java.lang.reflect.AccessibleObject
            if (r0 == 0) goto L7
            java.lang.reflect.AccessibleObject r3 = (java.lang.reflect.AccessibleObject) r3
            goto L8
        L7:
            r3 = 0
        L8:
            r0 = 0
            if (r3 == 0) goto L3f
            boolean r1 = xhss.AbstractC0334.f1248
            if (r1 != 0) goto L14
            boolean r3 = m675(r3)
            goto L3b
        L14:
            boolean r1 = r3.trySetAccessible()     // Catch: java.lang.Throwable -> L1d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r1 = move-exception
            xhss.ᲈᛳᛱᲇ r2 = new xhss.ᲈᛳᛱᲇ
            r2.<init>(r1)
            r1 = r2
        L24:
            java.lang.Throwable r2 = xhss.AbstractC0134.m364(r1)
            if (r2 != 0) goto L2b
            goto L35
        L2b:
            xhss.AbstractC0334.f1248 = r0
            boolean r3 = m675(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
        L35:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r3 = r1.booleanValue()
        L3b:
            r1 = 1
            if (r3 != r1) goto L3f
            r0 = r1
        L3f:
            return r0
    }
}
