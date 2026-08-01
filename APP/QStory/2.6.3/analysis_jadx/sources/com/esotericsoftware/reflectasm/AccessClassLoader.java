package com.esotericsoftware.reflectasm;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.security.ProtectionDomain;
import java.util.HashSet;
import java.util.WeakHashMap;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class AccessClassLoader extends ClassLoader {
    private static final WeakHashMap<ClassLoader, WeakReference<AccessClassLoader>> accessClassLoaders = new WeakHashMap<>();
    private static volatile Method defineClassMethod;
    private static volatile AccessClassLoader selfContextAccessClassLoader;
    private static final ClassLoader selfContextParentClassLoader;
    private final HashSet<String> localClassNames;

    static {
        ClassLoader parentClassLoader = getParentClassLoader(AccessClassLoader.class);
        selfContextParentClassLoader = parentClassLoader;
        selfContextAccessClassLoader = new AccessClassLoader(parentClassLoader);
    }

    private AccessClassLoader(ClassLoader classLoader) {
        super(classLoader);
        this.localClassNames = new HashSet<>();
    }

    public static int activeAccessClassLoaders() {
        int size = accessClassLoaders.size();
        return selfContextAccessClassLoader != null ? size + 1 : size;
    }

    public static boolean areInSameRuntimeClassLoader(Class cls, Class cls2) {
        if (cls.getPackage() != cls2.getPackage()) {
            return false;
        }
        ClassLoader classLoader = cls.getClassLoader();
        ClassLoader classLoader2 = cls2.getClassLoader();
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        return classLoader == null ? classLoader2 == null || classLoader2 == systemClassLoader : classLoader2 == null ? classLoader == systemClassLoader : classLoader == classLoader2;
    }

    public static AccessClassLoader get(Class cls) {
        ClassLoader parentClassLoader = getParentClassLoader(cls);
        ClassLoader classLoader = selfContextParentClassLoader;
        if (classLoader.equals(parentClassLoader)) {
            if (selfContextAccessClassLoader == null) {
                synchronized (accessClassLoaders) {
                    try {
                        if (selfContextAccessClassLoader == null) {
                            selfContextAccessClassLoader = new AccessClassLoader(classLoader);
                        }
                    } finally {
                    }
                }
            }
            return selfContextAccessClassLoader;
        }
        WeakHashMap<ClassLoader, WeakReference<AccessClassLoader>> weakHashMap = accessClassLoaders;
        synchronized (weakHashMap) {
            try {
                WeakReference<AccessClassLoader> weakReference = weakHashMap.get(parentClassLoader);
                if (weakReference != null) {
                    AccessClassLoader accessClassLoader = weakReference.get();
                    if (accessClassLoader != null) {
                        return accessClassLoader;
                    }
                    weakHashMap.remove(parentClassLoader);
                }
                AccessClassLoader accessClassLoader2 = new AccessClassLoader(parentClassLoader);
                weakHashMap.put(parentClassLoader, new WeakReference<>(accessClassLoader2));
                return accessClassLoader2;
            } finally {
            }
        }
    }

    private static Method getDefineClassMethod() {
        if (defineClassMethod == null) {
            synchronized (accessClassLoaders) {
                if (defineClassMethod == null) {
                    Class cls = Integer.TYPE;
                    defineClassMethod = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls, cls, ProtectionDomain.class);
                    try {
                        defineClassMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return defineClassMethod;
    }

    private static ClassLoader getParentClassLoader(Class cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public static void remove(ClassLoader classLoader) {
        if (selfContextParentClassLoader.equals(classLoader)) {
            selfContextAccessClassLoader = null;
            return;
        }
        WeakHashMap<ClassLoader, WeakReference<AccessClassLoader>> weakHashMap = accessClassLoaders;
        synchronized (weakHashMap) {
            weakHashMap.remove(classLoader);
        }
    }

    public Class defineAccessClass(String str, byte[] bArr) {
        this.localClassNames.add(str);
        return defineClass(str, bArr);
    }

    public Class<?> defineClass(String str, byte[] bArr) {
        try {
            return (Class) getDefineClassMethod().invoke(getParent(), str, bArr, 0, Integer.valueOf(bArr.length), getClass().getProtectionDomain());
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length, getClass().getProtectionDomain());
        }
    }

    public Class loadAccessClass(String str) {
        if (!this.localClassNames.contains(str)) {
            return null;
        }
        try {
            return loadClass(str, false);
        } catch (ClassNotFoundException e) {
            C5925.m11313(e);
            return null;
        }
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z) {
        return str.equals(FieldAccess.class.getName()) ? FieldAccess.class : str.equals(MethodAccess.class.getName()) ? MethodAccess.class : str.equals(ConstructorAccess.class.getName()) ? ConstructorAccess.class : str.equals(PublicConstructorAccess.class.getName()) ? PublicConstructorAccess.class : super.loadClass(str, z);
    }
}
