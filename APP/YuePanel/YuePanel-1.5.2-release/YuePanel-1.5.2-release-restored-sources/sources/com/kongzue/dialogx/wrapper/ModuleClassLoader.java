package com.kongzue.dialogx.wrapper;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleClassLoader extends ClassLoader {
    private static ModuleClassLoader instance;
    private final ClassLoader moduleLoader;

    private ModuleClassLoader(ClassLoader classLoader) {
        super(classLoader);
        this.moduleLoader = classLoader;
    }

    public static ModuleClassLoader getInstance() {
        if (instance == null) {
            instance = new ModuleClassLoader(ModuleClassLoader.class.getClassLoader());
        }
        return instance;
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = this.moduleLoader.loadClass(str);
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
        } catch (Throwable unused) {
        }
        return super.loadClass(str, z);
    }
}
