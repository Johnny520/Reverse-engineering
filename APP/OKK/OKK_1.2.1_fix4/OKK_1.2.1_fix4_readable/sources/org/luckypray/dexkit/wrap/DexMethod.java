package org.luckypray.dexkit.wrap;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.ISerializable;
import p001A0.AbstractC0040p;
import p007D0.C0142h;
import p007D0.InterfaceC0136b;
import p009E0.AbstractC0181l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;

/* JADX INFO: loaded from: classes.dex */
public final class DexMethod implements ISerializable {
    public static final Companion Companion = new Companion(null);
    private final String className;
    private final InterfaceC0136b methodSign$delegate;
    private final String name;
    private final List<String> paramTypeNames;
    private final String returnTypeName;

    public static final class Companion {
        private Companion() {
        }

        public final DexMethod deserialize(String str) {
            AbstractC0307g.m703e(str, "descriptor");
            return new DexMethod(str);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public DexMethod(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        this.methodSign$delegate = AbstractC0040p.m81E(new DexMethod$methodSign$2(this));
        int iM1011P0 = AbstractC0425j.m1011P0(str, "->", 0, false, 6);
        int iM1011P02 = AbstractC0425j.m1011P0(str, "(", iM1011P0 + 1, false, 4);
        int i2 = iM1011P02 + 1;
        int iM1011P03 = AbstractC0425j.m1011P0(str, ")", i2, false, 4);
        if (iM1011P0 == -1 || iM1011P02 == -1 || iM1011P03 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        String strSubstring = str.substring(0, iM1011P0);
        AbstractC0307g.m702d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.className = DexSignUtil.getTypeName(strSubstring);
        String strSubstring2 = str.substring(iM1011P0 + 2, iM1011P02);
        AbstractC0307g.m702d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.name = strSubstring2;
        String strSubstring3 = str.substring(i2, iM1011P03);
        AbstractC0307g.m702d(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.paramTypeNames = DexSignUtil.getParamTypeNames(strSubstring3);
        String strSubstring4 = str.substring(iM1011P03 + 1);
        AbstractC0307g.m702d(strSubstring4, "(this as java.lang.String).substring(startIndex)");
        this.returnTypeName = DexSignUtil.getTypeName(strSubstring4);
    }

    public static final DexMethod deserialize(String str) {
        return Companion.deserialize(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSign() {
        String str = "(" + AbstractC0181l.m546r0(this.paramTypeNames, "", null, null, DexMethod$getSign$1$1.INSTANCE, 30) + ")" + DexSignUtil.getTypeSign(this.returnTypeName);
        AbstractC0307g.m702d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexMethod)) {
            return false;
        }
        DexMethod dexMethod = (DexMethod) obj;
        return AbstractC0307g.m699a(this.className, dexMethod.className) && AbstractC0307g.m699a(this.name, dexMethod.name) && AbstractC0307g.m699a(this.paramTypeNames, dexMethod.paramTypeNames) && AbstractC0307g.m699a(this.returnTypeName, dexMethod.returnTypeName);
    }

    public final String getClassName() {
        return this.className;
    }

    public final Constructor<?> getConstructorInstance(ClassLoader classLoader) throws NoSuchMethodException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getConstructorInstance(classLoader, this);
    }

    public final String getDeclaredClassName() {
        return this.className;
    }

    public final Method getMethodInstance(ClassLoader classLoader) throws NoSuchMethodException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getMethodInstance(classLoader, this);
    }

    public final String getMethodSign() {
        return (String) ((C0142h) this.methodSign$delegate).m466a();
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getParamTypeNames() {
        return this.paramTypeNames;
    }

    public final String getReturnTypeName() {
        return this.returnTypeName;
    }

    public int hashCode() {
        return this.returnTypeName.hashCode() + (this.paramTypeNames.hashCode() * 31) + (this.name.hashCode() * 31) + (this.className.hashCode() * 31);
    }

    public final boolean isConstructor() {
        return AbstractC0307g.m699a(this.name, "<init>");
    }

    public final boolean isMethod() {
        return (isStaticInitializer() || isConstructor()) ? false : true;
    }

    public final boolean isStaticInitializer() {
        return AbstractC0307g.m699a(this.name, "<clinit>");
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    public String serialize() {
        return ISerializable.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = DexSignUtil.getTypeSign(this.className) + "->" + this.name + getMethodSign();
        AbstractC0307g.m702d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public DexMethod(Method method) {
        AbstractC0307g.m703e(method, "method");
        this.methodSign$delegate = AbstractC0040p.m81E(new DexMethod$methodSign$2(this));
        Class<?> declaringClass = method.getDeclaringClass();
        AbstractC0307g.m702d(declaringClass, "method.declaringClass");
        this.className = DexSignUtil.getTypeName(declaringClass);
        String name = method.getName();
        AbstractC0307g.m702d(name, "method.name");
        this.name = name;
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0307g.m702d(parameterTypes, "method.parameterTypes");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        for (Class<?> cls : parameterTypes) {
            AbstractC0307g.m702d(cls, "it");
            arrayList.add(DexSignUtil.getTypeName(cls));
        }
        this.paramTypeNames = arrayList;
        Class<?> returnType = method.getReturnType();
        AbstractC0307g.m702d(returnType, "method.returnType");
        this.returnTypeName = DexSignUtil.getTypeName(returnType);
    }

    public DexMethod(Constructor<?> constructor) {
        AbstractC0307g.m703e(constructor, "constructor");
        this.methodSign$delegate = AbstractC0040p.m81E(new DexMethod$methodSign$2(this));
        this.className = constructor.getDeclaringClass().getName();
        this.name = "<init>";
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        AbstractC0307g.m702d(parameterTypes, "constructor.parameterTypes");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        for (Class<?> cls : parameterTypes) {
            AbstractC0307g.m702d(cls, "it");
            arrayList.add(DexSignUtil.getTypeName(cls));
        }
        this.paramTypeNames = arrayList;
        this.returnTypeName = "void";
    }
}
