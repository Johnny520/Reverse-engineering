package org.luckypray.dexkit.util;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class NativeReflect {
    public static final native Field getReflectedField(Class<?> cls, String str, String str2, Boolean bool);

    public static final native Member getReflectedMethod(Class<?> cls, String str, String str2, Boolean bool);
}
