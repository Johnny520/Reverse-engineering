package org.luckypray.dexkit.util;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0002\u0010\fJ8\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m16758d2 = {"Lorg/luckypray/dexkit/util/NativeReflect;", _UrlKt.FRAGMENT_ENCODE_SET, "()V", "getReflectedField", "Ljava/lang/reflect/Field;", "declaringClass", "Ljava/lang/Class;", "name", _UrlKt.FRAGMENT_ENCODE_SET, "jniSig", "isStatic", _UrlKt.FRAGMENT_ENCODE_SET, "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;", "getReflectedMethod", "Ljava/lang/reflect/Member;", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;", "dexkit-android_release"}, m16759k = 1, m16760mv = {1, 5, 1}, m16762xi = 48)
public final class NativeReflect {

    /* JADX INFO: renamed from: a */
    public static final NativeReflect f18252a = new NativeReflect();

    public static final native Field getReflectedField(Class<?> declaringClass, String name, String jniSig, Boolean isStatic);

    public static final native Member getReflectedMethod(Class<?> declaringClass, String name, String jniSig, Boolean isStatic);
}
