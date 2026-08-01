package org.luckypray.dexkit.util;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeReflect {
    public static final NativeReflect INSTANCE = new NativeReflect();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private NativeReflect() {
    }

    public static final native Field getReflectedField(Class<?> cls, String str, String str2, Boolean bool);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Field getReflectedField$default(Class cls, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 8) != 0) {
            bool = null;
        }
        return getReflectedField(cls, str, str2, bool);
    }

    public static final native Member getReflectedMethod(Class<?> cls, String str, String str2, Boolean bool);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Member getReflectedMethod$default(Class cls, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 8) != 0) {
            bool = null;
        }
        return getReflectedMethod(cls, str, str2, bool);
    }
}
