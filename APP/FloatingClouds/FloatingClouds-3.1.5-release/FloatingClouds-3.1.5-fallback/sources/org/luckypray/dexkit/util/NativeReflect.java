package org.luckypray.dexkit.util;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0002\u0010\fJ8\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/luckypray/dexkit/util/NativeReflect;", "", "()V", "getReflectedField", "Ljava/lang/reflect/Field;", "declaringClass", "Ljava/lang/Class;", "name", "", "jniSig", "isStatic", "", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;", "getReflectedMethod", "Ljava/lang/reflect/Member;", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NativeReflect {
    static {
            org.luckypray.dexkit.util.NativeReflect r0 = new org.luckypray.dexkit.util.NativeReflect
            r0.<init>()
            return
    }

    public NativeReflect() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final native java.lang.reflect.Field getReflectedField(java.lang.Class<?> r0, java.lang.String r1, java.lang.String r2, java.lang.Boolean r3);

    public static final native java.lang.reflect.Member getReflectedMethod(java.lang.Class<?> r0, java.lang.String r1, java.lang.String r2, java.lang.Boolean r3);
}
