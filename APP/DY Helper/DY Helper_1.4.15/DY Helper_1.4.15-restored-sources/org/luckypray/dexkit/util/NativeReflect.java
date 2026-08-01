package org.luckypray.dexkit.util;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class NativeReflect {
    public static final org.luckypray.dexkit.util.NativeReflect INSTANCE = null;

    static {
            org.luckypray.dexkit.util.NativeReflect r0 = new org.luckypray.dexkit.util.NativeReflect
            r0.<init>()
            org.luckypray.dexkit.util.NativeReflect.INSTANCE = r0
            return
    }

    private NativeReflect() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final native java.lang.reflect.Field getReflectedField(java.lang.Class<?> r0, java.lang.String r1, java.lang.String r2, java.lang.Boolean r3);

    public static /* synthetic */ java.lang.reflect.Field getReflectedField$default(java.lang.Class r0, java.lang.String r1, java.lang.String r2, java.lang.Boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 8
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.reflect.Field r0 = getReflectedField(r0, r1, r2, r3)
            return r0
    }

    public static final native java.lang.reflect.Member getReflectedMethod(java.lang.Class<?> r0, java.lang.String r1, java.lang.String r2, java.lang.Boolean r3);

    public static /* synthetic */ java.lang.reflect.Member getReflectedMethod$default(java.lang.Class r0, java.lang.String r1, java.lang.String r2, java.lang.Boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 8
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.reflect.Member r0 = getReflectedMethod(r0, r1, r2, r3)
            return r0
    }
}
