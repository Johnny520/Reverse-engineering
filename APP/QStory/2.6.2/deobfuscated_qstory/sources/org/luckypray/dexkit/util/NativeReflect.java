package org.luckypray.dexkit.util;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J:\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0087 ¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\r\u001a\u0004\u0018\u00010\f2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0087 ¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lorg/luckypray/dexkit/util/NativeReflect;", "", "Ljava/lang/Class;", "declaringClass", "", "name", "jniSig", "", "isStatic", "Ljava/lang/reflect/Field;", "getReflectedField", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Member;", "getReflectedMethod", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NativeReflect {
    public static final native Field getReflectedField(Class<?> declaringClass, String name, String jniSig, Boolean isStatic);

    public static final native Member getReflectedMethod(Class<?> declaringClass, String name, String jniSig, Boolean isStatic);
}
