package org.luckypray.dexkit.wrap;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.ISerializable;
import p000.AbstractC0241h2;
import p000.AbstractC0260i5;
import p000.AbstractC0319ld;
import p000.AbstractC0431r2;
import p000.C0335md;
import p000.InterfaceC0200e9;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexMethod implements ISerializable {
    public static final Companion Companion = new Companion(null);
    private final String className;
    private final InterfaceC0200e9 methodSign$delegate;
    private final String name;
    private final List<String> paramTypeNames;
    private final String returnTypeName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexMethod(String str) {
        str.getClass();
        this.methodSign$delegate = new C0335md(new DexMethod$methodSign$2(this));
        int iM757K = AbstractC0319ld.m757K(str, "->", 0, 6);
        int iM757K2 = AbstractC0319ld.m757K(str, "(", iM757K + 1, 4);
        int i = iM757K2 + 1;
        int iM757K3 = AbstractC0319ld.m757K(str, ")", i, 4);
        if (iM757K == -1 || iM757K2 == -1 || iM757K3 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.className = DexSignUtil.getTypeName(str.substring(0, iM757K));
        this.name = str.substring(iM757K + 2, iM757K2);
        this.paramTypeNames = DexSignUtil.getParamTypeNames(str.substring(i, iM757K3));
        this.returnTypeName = DexSignUtil.getTypeName(str.substring(iM757K3 + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final DexMethod deserialize(String str) {
        return Companion.deserialize(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Method getMethodInstance$default(DexMethod dexMethod, ClassLoader classLoader, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return dexMethod.getMethodInstance(classLoader, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final String getSign() {
        return "(" + AbstractC0241h2.m468k2(this.paramTypeNames, "", DexMethod$getSign$1$1.INSTANCE, 30) + ")" + DexSignUtil.getTypeSign(this.returnTypeName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexMethod)) {
            return false;
        }
        DexMethod dexMethod = (DexMethod) obj;
        return AbstractC0260i5.m643p(this.className, dexMethod.className) && AbstractC0260i5.m643p(this.name, dexMethod.name) && AbstractC0260i5.m643p(this.paramTypeNames, dexMethod.paramTypeNames) && AbstractC0260i5.m643p(this.returnTypeName, dexMethod.returnTypeName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getClassName() {
        return this.className;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Constructor<?> getConstructorInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return InstanceUtil.INSTANCE.getConstructorInstance(classLoader, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDeclaredClassName() {
        return this.className;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Method getMethodInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return getMethodInstance$default(this, classLoader, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMethodSign() {
        return (String) this.methodSign$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getParamTypeNames() {
        return this.paramTypeNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getReturnTypeName() {
        return this.returnTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.returnTypeName.hashCode() + (this.paramTypeNames.hashCode() * 31) + (this.name.hashCode() * 31) + (this.className.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isConstructor() {
        return AbstractC0260i5.m643p(this.name, "<init>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isMethod() {
        return (isStaticInitializer() || isConstructor()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isStaticInitializer() {
        return AbstractC0260i5.m643p(this.name, "<clinit>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.wrap.ISerializable
    public String serialize() {
        return ISerializable.DefaultImpls.serialize(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return DexSignUtil.getTypeSign(this.className) + "->" + this.name + getMethodSign();
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.wrap.DexMethod.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexMethod deserialize(String str) {
            str.getClass();
            return new DexMethod(str);
        }

        private Companion() {
        }
    }

    public final Method getMethodInstance(ClassLoader classLoader, Boolean bool) {
        classLoader.getClass();
        return InstanceUtil.INSTANCE.getMethodInstance(classLoader, this, bool);
    }

    public DexMethod(Method method) {
        method.getClass();
        this.methodSign$delegate = new C0335md(new DexMethod$methodSign$2(this));
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        this.className = DexSignUtil.getTypeName(declaringClass);
        String name = method.getName();
        name.getClass();
        this.name = name;
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            arrayList.add(DexSignUtil.getTypeName(cls));
        }
        this.paramTypeNames = arrayList;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.returnTypeName = DexSignUtil.getTypeName(returnType);
    }

    public DexMethod(Constructor<?> constructor) {
        constructor.getClass();
        this.methodSign$delegate = new C0335md(new DexMethod$methodSign$2(this));
        this.className = constructor.getDeclaringClass().getName();
        this.name = "<init>";
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            arrayList.add(DexSignUtil.getTypeName(cls));
        }
        this.paramTypeNames = arrayList;
        this.returnTypeName = "void";
    }
}
