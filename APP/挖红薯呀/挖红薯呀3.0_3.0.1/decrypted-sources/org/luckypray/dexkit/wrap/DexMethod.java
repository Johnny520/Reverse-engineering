package org.luckypray.dexkit.wrap;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.ISerializable;
import p000.AbstractC0619pl;
import p000.AbstractC0960ye;
import p000.k41;
import p000.p30;
import p000.u60;
import p000.x51;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DexMethod implements ISerializable {
    public static final Companion Companion = new Companion(null);
    private final String className;
    private final u60 methodSign$delegate;
    private final String name;
    private final List<String> paramTypeNames;
    private final String returnTypeName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexMethod(String str) {
        str.getClass();
        this.methodSign$delegate = new x51(new DexMethod$methodSign$2(this));
        int iM1768Z = k41.m1768Z(str, "->", 0, false, 6);
        int iM1768Z2 = k41.m1768Z(str, "(", iM1768Z + 1, false, 4);
        int i = iM1768Z2 + 1;
        int iM1768Z3 = k41.m1768Z(str, ")", i, false, 4);
        if (iM1768Z == -1 || iM1768Z2 == -1 || iM1768Z3 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.className = DexSignUtil.getTypeName(str.substring(0, iM1768Z));
        this.name = str.substring(iM1768Z + 2, iM1768Z2);
        this.paramTypeNames = DexSignUtil.getParamTypeNames(str.substring(i, iM1768Z3));
        this.returnTypeName = DexSignUtil.getTypeName(str.substring(iM1768Z3 + 1));
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
        return "(" + AbstractC0960ye.m5245O(this.paramTypeNames, "", null, null, DexMethod$getSign$1$1.INSTANCE, 30) + ")" + DexSignUtil.getTypeSign(this.returnTypeName);
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
        return p30.m3002l(this.className, dexMethod.className) && p30.m3002l(this.name, dexMethod.name) && p30.m3002l(this.paramTypeNames, dexMethod.paramTypeNames) && p30.m3002l(this.returnTypeName, dexMethod.returnTypeName);
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
        return p30.m3002l(this.name, "<init>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isMethod() {
        return (isStaticInitializer() || isConstructor()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isStaticInitializer() {
        return p30.m3002l(this.name, "<clinit>");
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

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.wrap.DexMethod.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
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
        this.methodSign$delegate = new x51(new DexMethod$methodSign$2(this));
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
        this.methodSign$delegate = new x51(new DexMethod$methodSign$2(this));
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
