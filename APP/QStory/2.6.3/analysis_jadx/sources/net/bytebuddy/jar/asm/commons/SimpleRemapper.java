package net.bytebuddy.jar.asm.commons;

import androidx.activity.AbstractC0053;
import java.util.Collections;
import java.util.Map;
import net.bytebuddy.jar.asm.Handle;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class SimpleRemapper extends Remapper {
    private final Map<String, String> mapping;

    @Deprecated(forRemoval = false)
    public SimpleRemapper(String str, String str2) {
        this.mapping = Collections.singletonMap(str, str2);
    }

    private static /* synthetic */ String stringConcat$0(String str, String str2, String str3) {
        return str + "." + str2 + str3;
    }

    private static /* synthetic */ String stringConcat$1(String str, String str2) {
        return AbstractC0053.m158(".", str, str2);
    }

    private static /* synthetic */ String stringConcat$2(String str, String str2) {
        return AbstractC0053.m158(".", str, str2);
    }

    private static /* synthetic */ String stringConcat$3(String str, String str2) {
        return str + "." + str2;
    }

    private static /* synthetic */ String stringConcat$4(String str, String str2) {
        return str + "." + str2;
    }

    @Override // net.bytebuddy.jar.asm.commons.Remapper
    public String map(String str) {
        return this.mapping.get(str);
    }

    @Override // net.bytebuddy.jar.asm.commons.Remapper
    public String mapAnnotationAttributeName(String str, String str2) {
        String map = map(stringConcat$3(str, str2));
        return map == null ? str2 : map;
    }

    @Override // net.bytebuddy.jar.asm.commons.Remapper
    public String mapBasicInvokeDynamicMethodName(String str, String str2, Handle handle, Object... objArr) {
        String map = map(stringConcat$2(str, str2));
        return map == null ? str : map;
    }

    @Override // net.bytebuddy.jar.asm.commons.Remapper
    public String mapFieldName(String str, String str2, String str3) {
        String map = map(stringConcat$4(str, str2));
        return map == null ? str2 : map;
    }

    @Override // net.bytebuddy.jar.asm.commons.Remapper
    @Deprecated(forRemoval = false)
    public String mapInvokeDynamicMethodName(String str, String str2) {
        String map = map(stringConcat$1(str, str2));
        return map == null ? str : map;
    }

    @Override // net.bytebuddy.jar.asm.commons.Remapper
    public String mapMethodName(String str, String str2, String str3) {
        String map = map(stringConcat$0(str, str2, str3));
        return map == null ? str2 : map;
    }

    public SimpleRemapper(int i, Map<String, String> map) {
        super(i);
        this.mapping = map;
    }

    @Deprecated(forRemoval = false)
    public SimpleRemapper(Map<String, String> map) {
        this.mapping = map;
    }

    public SimpleRemapper(int i, String str, String str2) {
        super(i);
        this.mapping = Collections.singletonMap(str, str2);
    }
}
