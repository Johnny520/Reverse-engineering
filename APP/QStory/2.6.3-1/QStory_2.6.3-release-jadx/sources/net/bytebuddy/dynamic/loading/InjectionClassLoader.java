package net.bytebuddy.dynamic.loading;

import io.ktor.util.C5043;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.utility.nullability.MaybeNull;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class InjectionClassLoader extends ClassLoader {
    private final AtomicBoolean sealed;

    static {
        doRegisterAsParallelCapable();
    }

    public InjectionClassLoader(@MaybeNull ClassLoader classLoader, boolean z) {
        super(classLoader);
        this.sealed = new AtomicBoolean(z);
    }

    private static void doRegisterAsParallelCapable() {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("registerAsParallelCapable", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, null);
        } catch (Throwable unused) {
        }
    }

    public Class<?> defineClass(String str, byte[] bArr) {
        return defineClasses(Collections.singletonMap(str, bArr)).get(str);
    }

    public Map<String, Class<?>> defineClasses(Map<String, byte[]> map) {
        if (!this.sealed.get()) {
            return doDefineClasses(map);
        }
        C6755.m11870("Cannot inject classes into a sealed class loader");
        return null;
    }

    public abstract Map<String, Class<?>> doDefineClasses(Map<String, byte[]> map);

    public boolean isSealed() {
        return this.sealed.get();
    }

    public boolean seal() {
        return !this.sealed.getAndSet(true);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Strategy implements ClassLoadingStrategy<InjectionClassLoader> {
        INSTANCE;

        public Map<TypeDescription, Class<?>> load(@MaybeNull InjectionClassLoader injectionClassLoader, Map<TypeDescription, byte[]> map) {
            if (injectionClassLoader == null) {
                C5043.m9163(map, "Cannot add types to bootstrap class loader: ");
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashMap map2 = new HashMap();
            for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey().getName(), entry.getValue());
                map2.put(entry.getKey().getName(), entry.getKey());
            }
            HashMap map3 = new HashMap();
            try {
                for (Map.Entry<String, Class<?>> entry2 : injectionClassLoader.defineClasses(linkedHashMap).entrySet()) {
                    map3.put(map2.get(entry2.getKey()), entry2.getValue());
                }
                return map3;
            } catch (ClassNotFoundException e) {
                C6385.m11434("Cannot load classes: ", map, e);
                return null;
            }
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public /* bridge */ /* synthetic */ Map load(@MaybeNull ClassLoader classLoader, Map map) {
            return load((InjectionClassLoader) classLoader, (Map<TypeDescription, byte[]>) map);
        }
    }
}
