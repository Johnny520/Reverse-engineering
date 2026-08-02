package org.luckypray.dexkit.util;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeReflect {
    public static final native Field getReflectedField(Class<?> cls, String str, String str2, Boolean bool);

    public static final native Member getReflectedMethod(Class<?> cls, String str, String str2, Boolean bool);
}
