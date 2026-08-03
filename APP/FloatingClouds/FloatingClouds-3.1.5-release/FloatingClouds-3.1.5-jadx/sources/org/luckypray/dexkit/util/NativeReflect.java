package org.luckypray.dexkit.util;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0002\u0010\fJ8\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3303d2 = {"Lorg/luckypray/dexkit/util/NativeReflect;", "", "()V", "getReflectedField", "Ljava/lang/reflect/Field;", "declaringClass", "Ljava/lang/Class;", "name", "", "jniSig", "isStatic", "", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;", "getReflectedMethod", "Ljava/lang/reflect/Member;", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;", "dexkit-android_release"}, m3304k = 1, m3305mv = {1, 5, 1}, m3307xi = 48)
public final class NativeReflect {
    static {
        new NativeReflect();
    }

    public static final native Field getReflectedField(Class<?> declaringClass, String name, String jniSig, Boolean isStatic);

    public static final native Member getReflectedMethod(Class<?> declaringClass, String name, String jniSig, Boolean isStatic);
}
