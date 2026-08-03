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
    public static final Companion Companion = null;
    private final String className;
    private final InterfaceC0136b methodSign$delegate;
    private final String name;
    private final List<String> paramTypeNames;
    private final String returnTypeName;

    public static final class Companion {
        private Companion() {
        }

        public final DexMethod deserialize(String r2) {
            AbstractC0307g.m703e(r2, "descriptor");
            return new DexMethod(r2);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public DexMethod(String r7) {
        AbstractC0307g.m703e(r7, "descriptor");
        this.methodSign$delegate = AbstractC0040p.m81E(new DexMethod$methodSign$2(this));
        int r02 = AbstractC0425j.m1011P0(r7, "->", 0, false, 6);
        int r2 = AbstractC0425j.m1011P0(r7, "(", r02 + 1, false, 4);
        int r3 = r2 + 1;
        int r4 = AbstractC0425j.m1011P0(r7, ")", r3, false, 4);
        if (r02 == (-1)) goto L9;
        if (r2 == (-1)) goto L9;
        if (r4 == (-1)) goto L9;
        String r1 = r7.substring(0, r02);
        AbstractC0307g.m702d(r1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.className = DexSignUtil.getTypeName(r1);
        String r03 = r7.substring(r02 + 2, r2);
        AbstractC0307g.m702d(r03, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.name = r03;
        String r04 = r7.substring(r3, r4);
        AbstractC0307g.m702d(r04, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.paramTypeNames = DexSignUtil.getParamTypeNames(r04);
        String r72 = r7.substring(r4 + 1);
        AbstractC0307g.m702d(r72, "(this as java.lang.String).substring(startIndex)");
        this.returnTypeName = DexSignUtil.getTypeName(r72);
        return;
    L9:
        throw new IllegalAccessError("not method descriptor: ".concat(r7));
    }

    public static final /* synthetic */ String access$getSign(DexMethod r02) {
        return r02.getSign();
    }

    public static final DexMethod deserialize(String r1) {
        return Companion.deserialize(r1);
    }

    private final String getSign() {
        String r02 = "(" + AbstractC0181l.m546r0(this.paramTypeNames, "", null, null, DexMethod$getSign$1$1.INSTANCE, 30) + ")" + DexSignUtil.getTypeSign(this.returnTypeName);
        AbstractC0307g.m702d(r02, "StringBuilder().apply(builderAction).toString()");
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DexMethod) == true) goto L8;
        return false;
    L8:
        DexMethod r52 = (DexMethod) r5;
        if (AbstractC0307g.m699a(this.className, r52.className) == false) goto L18;
        if (AbstractC0307g.m699a(this.name, r52.name) == false) goto L18;
        if (AbstractC0307g.m699a(this.paramTypeNames, r52.paramTypeNames) == false) goto L18;
        if (AbstractC0307g.m699a(this.returnTypeName, r52.returnTypeName) == false) goto L18;
        return true;
    L18:
        return false;
    }

    public final String getClassName() {
        return this.className;
    }

    public final Constructor<?> getConstructorInstance(ClassLoader r2) throws NoSuchMethodException {
        AbstractC0307g.m703e(r2, "classLoader");
        return InstanceUtil.INSTANCE.getConstructorInstance(r2, this);
    }

    public final String getDeclaredClassName() {
        return this.className;
    }

    public final Method getMethodInstance(ClassLoader r2) throws NoSuchMethodException {
        AbstractC0307g.m703e(r2, "classLoader");
        return InstanceUtil.INSTANCE.getMethodInstance(r2, this);
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
        int r02 = this.className.hashCode() * 31;
        int r1 = (this.name.hashCode() * 31) + r02;
        int r03 = (this.paramTypeNames.hashCode() * 31) + r1;
        return this.returnTypeName.hashCode() + r03;
    }

    public final boolean isConstructor() {
        return AbstractC0307g.m699a(this.name, "<init>");
    }

    public final boolean isMethod() {
        if (isStaticInitializer() == false) goto L5;
    L7:
        return false;
    L5:
        if (isConstructor() == true) goto L7;
        return true;
    }

    public final boolean isStaticInitializer() {
        return AbstractC0307g.m699a(this.name, "<clinit>");
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    public String serialize() {
        return ISerializable.DefaultImpls.serialize(this);
    }

    public String toString() {
        String r02 = DexSignUtil.getTypeSign(this.className) + "->" + this.name + getMethodSign();
        AbstractC0307g.m702d(r02, "StringBuilder().apply(builderAction).toString()");
        return r02;
    }

    public DexMethod(Method r7) {
        AbstractC0307g.m703e(r7, "method");
        this.methodSign$delegate = AbstractC0040p.m81E(new DexMethod$methodSign$2(this));
        Class<?> r02 = r7.getDeclaringClass();
        AbstractC0307g.m702d(r02, "method.declaringClass");
        this.className = DexSignUtil.getTypeName(r02);
        String r03 = r7.getName();
        AbstractC0307g.m702d(r03, "method.name");
        this.name = r03;
        Class<?>[] r04 = r7.getParameterTypes();
        AbstractC0307g.m702d(r04, "method.parameterTypes");
        ArrayList r1 = new ArrayList(r04.length);
        int r2 = r04.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        Class<?> r4 = r04[r3];
        AbstractC0307g.m702d(r4, "it");
        r1.add(DexSignUtil.getTypeName(r4));
        r3 = r3 + 1;
        goto L3
    L5:
        this.paramTypeNames = r1;
        Class<?> r72 = r7.getReturnType();
        AbstractC0307g.m702d(r72, "method.returnType");
        this.returnTypeName = DexSignUtil.getTypeName(r72);
    }

    public DexMethod(Constructor<?> r6) {
        AbstractC0307g.m703e(r6, "constructor");
        this.methodSign$delegate = AbstractC0040p.m81E(new DexMethod$methodSign$2(this));
        this.className = r6.getDeclaringClass().getName();
        this.name = "<init>";
        Class<?>[] r62 = r6.getParameterTypes();
        AbstractC0307g.m702d(r62, "constructor.parameterTypes");
        ArrayList r02 = new ArrayList(r62.length);
        int r1 = r62.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Class<?> r3 = r62[r2];
        AbstractC0307g.m702d(r3, "it");
        r02.add(DexSignUtil.getTypeName(r3));
        r2 = r2 + 1;
        goto L3
    L5:
        this.paramTypeNames = r02;
        this.returnTypeName = "void";
    }
}
