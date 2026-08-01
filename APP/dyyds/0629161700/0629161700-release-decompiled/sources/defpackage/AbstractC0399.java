package defpackage;

/* JADX INFO: renamed from: ᛲᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0399 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static volatile boolean f2052 = true;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final boolean m1161(java.lang.reflect.Member r3) {
            boolean r0 = r3 instanceof java.lang.reflect.AccessibleObject
            if (r0 == 0) goto L7
            java.lang.reflect.AccessibleObject r3 = (java.lang.reflect.AccessibleObject) r3
            goto L8
        L7:
            r3 = 0
        L8:
            r0 = 0
            if (r3 == 0) goto L3f
            boolean r1 = defpackage.AbstractC0399.f2052
            if (r1 != 0) goto L14
            boolean r3 = m1162(r3)
            goto L3b
        L14:
            boolean r1 = r3.trySetAccessible()     // Catch: java.lang.Throwable -> L1d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r1 = move-exception
            ᛴᛸᛲᲀ r2 = new ᛴᛸᛲᲀ
            r2.<init>(r1)
            r1 = r2
        L24:
            java.lang.Throwable r2 = defpackage.C2165.m3569(r1)
            if (r2 != 0) goto L2b
            goto L35
        L2b:
            defpackage.AbstractC0399.f2052 = r0
            boolean r3 = m1162(r3)
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

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final boolean m1162(java.lang.reflect.AccessibleObject r2) {
            boolean r0 = r2.isAccessible()     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto La
            r0 = 1
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> Ld
        La:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r2 = move-exception
            ᛴᛸᛲᲀ r0 = new ᛴᛸᛲᲀ
            r0.<init>(r2)
            r2 = r0
        L14:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r2 instanceof defpackage.C0723
            if (r1 == 0) goto L1b
            r2 = r0
        L1b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }
}
