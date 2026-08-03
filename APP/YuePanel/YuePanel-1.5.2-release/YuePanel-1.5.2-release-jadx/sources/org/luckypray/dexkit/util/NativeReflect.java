package org.luckypray.dexkit.util;

import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0002\u0010\fJ8\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m2699d2 = {"Lorg/luckypray/dexkit/util/NativeReflect;", "", "()V", "getReflectedField", "Ljava/lang/reflect/Field;", "declaringClass", "Ljava/lang/Class;", "name", "", "jniSig", "isStatic", "", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;", "getReflectedMethod", "Ljava/lang/reflect/Member;", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class NativeReflect {

    @InterfaceC6399
    public static final NativeReflect INSTANCE = new NativeReflect();

    private NativeReflect() {
    }

    @InterfaceC5578
    @InterfaceC6489
    public static final native Field getReflectedField(@InterfaceC6399 Class<?> cls, @InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6489 Boolean bool);

    public static /* synthetic */ Field getReflectedField$default(Class cls, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 8) != 0) {
            bool = null;
        }
        return getReflectedField(cls, str, str2, bool);
    }

    @InterfaceC5578
    @InterfaceC6489
    public static final native Member getReflectedMethod(@InterfaceC6399 Class<?> cls, @InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6489 Boolean bool);

    public static /* synthetic */ Member getReflectedMethod$default(Class cls, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 8) != 0) {
            bool = null;
        }
        return getReflectedMethod(cls, str, str2, bool);
    }
}
