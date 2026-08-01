package com.alibaba.fastjson2.internal.asm;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class TypeCollector {
    static final Map<String, String> PRIMITIVES;
    protected MethodCollector collector = null;
    final String methodName;
    final Class<?>[] parameterTypes;

    static {
        HashMap map = new HashMap();
        map.put("int", "I");
        map.put("boolean", "Z");
        map.put("byte", "B");
        map.put("char", "C");
        map.put("short", "S");
        map.put("float", "F");
        map.put("long", "J");
        map.put("double", "D");
        PRIMITIVES = map;
    }

    public TypeCollector(String str, Class<?>[] clsArr) {
        this.methodName = str;
        this.parameterTypes = clsArr;
    }

    private boolean correctTypeName(Type type, String str) {
        String className = type.getClassName();
        StringBuilder sb2 = new StringBuilder();
        while (className.endsWith(_UrlKt.PATH_SEGMENT_ENCODE_SET_URI)) {
            sb2.append('[');
            className = className.substring(0, className.length() - 2);
        }
        if (sb2.length() != 0) {
            String str2 = PRIMITIVES.get(className);
            if (str2 != null) {
                sb2.append(str2);
                className = sb2.toString();
            } else {
                sb2.append('L');
                sb2.append(className);
                sb2.append(';');
                className = sb2.toString();
            }
        }
        return className.equals(str);
    }

    public String[] getParameterNamesForMethod() {
        MethodCollector methodCollector = this.collector;
        return (methodCollector == null || !methodCollector.debugInfoPresent) ? new String[0] : methodCollector.getResult().split(",");
    }

    public MethodCollector visitMethod(int i10, String str, String str2) {
        if (this.collector != null || !str.equals(this.methodName)) {
            return null;
        }
        Type[] argumentTypes = Type.getArgumentTypes(str2);
        int i11 = 0;
        for (Type type : argumentTypes) {
            String className = type.getClassName();
            if ("long".equals(className) || "double".equals(className)) {
                i11++;
            }
        }
        if (argumentTypes.length != this.parameterTypes.length) {
            return null;
        }
        for (int i12 = 0; i12 < argumentTypes.length; i12++) {
            if (!correctTypeName(argumentTypes[i12], this.parameterTypes[i12].getName())) {
                return null;
            }
        }
        MethodCollector methodCollector = new MethodCollector(!Modifier.isStatic(i10) ? 1 : 0, argumentTypes.length + i11);
        this.collector = methodCollector;
        return methodCollector;
    }
}
