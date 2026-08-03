package org.luckypray.dexkit.wrap;

import java.lang.reflect.Field;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.ISerializable;
import p001A0.AbstractC0040p;
import p007D0.C0142h;
import p007D0.InterfaceC0136b;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;

/* JADX INFO: loaded from: classes.dex */
public final class DexField implements ISerializable {
    public static final Companion Companion = new Companion(null);
    private final String className;
    private final String name;
    private final String typeName;
    private final InterfaceC0136b typeSign$delegate;

    public static final class Companion {
        private Companion() {
        }

        public final DexField deserialize(String str) {
            AbstractC0307g.m703e(str, "descriptor");
            return new DexField(str);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public DexField(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        this.typeSign$delegate = AbstractC0040p.m81E(new DexField$typeSign$2(this));
        int iM1011P0 = AbstractC0425j.m1011P0(str, "->", 0, false, 6);
        int iM1011P02 = AbstractC0425j.m1011P0(str, ":", iM1011P0 + 1, false, 4);
        if (iM1011P0 == -1 || iM1011P02 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        String strSubstring = str.substring(0, iM1011P0);
        AbstractC0307g.m702d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.className = DexSignUtil.getTypeName(strSubstring);
        String strSubstring2 = str.substring(iM1011P0 + 2, iM1011P02);
        AbstractC0307g.m702d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.name = strSubstring2;
        String strSubstring3 = str.substring(iM1011P02 + 1);
        AbstractC0307g.m702d(strSubstring3, "(this as java.lang.String).substring(startIndex)");
        this.typeName = DexSignUtil.getTypeName(strSubstring3);
    }

    public static final DexField deserialize(String str) {
        return Companion.deserialize(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSign() {
        return DexSignUtil.getTypeSign(this.typeName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexField)) {
            return false;
        }
        DexField dexField = (DexField) obj;
        return AbstractC0307g.m699a(this.className, dexField.className) && AbstractC0307g.m699a(this.name, dexField.name) && AbstractC0307g.m699a(this.typeName, dexField.typeName);
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getDeclaredClassName() {
        return this.className;
    }

    public final Field getFieldInstance(ClassLoader classLoader) throws NoSuchFieldException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getFieldInstance(classLoader, this);
    }

    public final String getName() {
        return this.name;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public final String getTypeSign() {
        return (String) ((C0142h) this.typeSign$delegate).m466a();
    }

    public int hashCode() {
        return this.typeName.hashCode() + (this.name.hashCode() * 31) + (this.className.hashCode() * 31);
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    public String serialize() {
        return ISerializable.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = DexSignUtil.getTypeSign(this.className) + "->" + this.name + ":" + getTypeSign();
        AbstractC0307g.m702d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public DexField(Field field) {
        AbstractC0307g.m703e(field, "field");
        this.typeSign$delegate = AbstractC0040p.m81E(new DexField$typeSign$2(this));
        Class<?> declaringClass = field.getDeclaringClass();
        AbstractC0307g.m702d(declaringClass, "field.declaringClass");
        this.className = DexSignUtil.getTypeName(declaringClass);
        String name = field.getName();
        AbstractC0307g.m702d(name, "field.name");
        this.name = name;
        Class<?> type = field.getType();
        AbstractC0307g.m702d(type, "field.type");
        this.typeName = DexSignUtil.getTypeName(type);
    }
}
