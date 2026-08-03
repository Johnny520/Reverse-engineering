package org.luckypray.dexkit.util;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0002\u0010\fJ8\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/luckypray/dexkit/util/NativeReflect;", "", "()V", "getReflectedField", "Ljava/lang/reflect/Field;", "declaringClass", "Ljava/lang/Class;", "name", "", "jniSig", "isStatic", "", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;", "getReflectedMethod", "Ljava/lang/reflect/Member;", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NativeReflect {

    @Yue.InterfaceC4418
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

    @Yue.InterfaceC3427
    @Yue.InterfaceC4543
    public static final native java.lang.reflect.Field getReflectedField(@Yue.InterfaceC4418 java.lang.Class<?> r0, @Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4543 java.lang.Boolean r3);

    public static /* synthetic */ java.lang.reflect.Field getReflectedField$default(java.lang.Class r0, java.lang.String r1, java.lang.String r2, java.lang.Boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 8
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.reflect.Field r0 = getReflectedField(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC3427
    @Yue.InterfaceC4543
    public static final native java.lang.reflect.Member getReflectedMethod(@Yue.InterfaceC4418 java.lang.Class<?> r0, @Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4543 java.lang.Boolean r3);

    public static /* synthetic */ java.lang.reflect.Member getReflectedMethod$default(java.lang.Class r0, java.lang.String r1, java.lang.String r2, java.lang.Boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 8
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.reflect.Member r0 = getReflectedMethod(r0, r1, r2, r3)
            return r0
    }
}
