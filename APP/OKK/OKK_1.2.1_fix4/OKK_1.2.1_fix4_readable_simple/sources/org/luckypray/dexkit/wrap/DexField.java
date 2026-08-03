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
    public static final Companion Companion = null;
    private final String className;
    private final String name;
    private final String typeName;
    private final InterfaceC0136b typeSign$delegate;

    public static final class Companion {
        private Companion() {
        }

        public final DexField deserialize(String r2) {
            AbstractC0307g.m703e(r2, "descriptor");
            return new DexField(r2);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public DexField(String r6) {
        AbstractC0307g.m703e(r6, "descriptor");
        this.typeSign$delegate = AbstractC0040p.m81E(new DexField$typeSign$2(this));
        int r02 = AbstractC0425j.m1011P0(r6, "->", 0, false, 6);
        int r2 = AbstractC0425j.m1011P0(r6, ":", r02 + 1, false, 4);
        if (r02 == (-1)) goto L8;
        if (r2 == (-1)) goto L8;
        String r1 = r6.substring(0, r02);
        AbstractC0307g.m702d(r1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.className = DexSignUtil.getTypeName(r1);
        String r03 = r6.substring(r02 + 2, r2);
        AbstractC0307g.m702d(r03, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.name = r03;
        String r62 = r6.substring(r2 + 1);
        AbstractC0307g.m702d(r62, "(this as java.lang.String).substring(startIndex)");
        this.typeName = DexSignUtil.getTypeName(r62);
        return;
    L8:
        throw new IllegalAccessError("not field descriptor: ".concat(r6));
    }

    public static final /* synthetic */ String access$getSign(DexField r02) {
        return r02.getSign();
    }

    public static final DexField deserialize(String r1) {
        return Companion.deserialize(r1);
    }

    private final String getSign() {
        return DexSignUtil.getTypeSign(this.typeName);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DexField) == true) goto L8;
        return false;
    L8:
        DexField r52 = (DexField) r5;
        if (AbstractC0307g.m699a(this.className, r52.className) == false) goto L16;
        if (AbstractC0307g.m699a(this.name, r52.name) == false) goto L16;
        if (AbstractC0307g.m699a(this.typeName, r52.typeName) == false) goto L16;
        return true;
    L16:
        return false;
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getDeclaredClassName() {
        return this.className;
    }

    public final Field getFieldInstance(ClassLoader r2) throws NoSuchFieldException {
        AbstractC0307g.m703e(r2, "classLoader");
        return InstanceUtil.INSTANCE.getFieldInstance(r2, this);
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
        int r02 = this.className.hashCode() * 31;
        int r1 = (this.name.hashCode() * 31) + r02;
        return this.typeName.hashCode() + r1;
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    public String serialize() {
        return ISerializable.DefaultImpls.serialize(this);
    }

    public String toString() {
        String r02 = DexSignUtil.getTypeSign(this.className) + "->" + this.name + ":" + getTypeSign();
        AbstractC0307g.m702d(r02, "StringBuilder().apply(builderAction).toString()");
        return r02;
    }

    public DexField(Field r3) {
        AbstractC0307g.m703e(r3, "field");
        this.typeSign$delegate = AbstractC0040p.m81E(new DexField$typeSign$2(this));
        Class<?> r02 = r3.getDeclaringClass();
        AbstractC0307g.m702d(r02, "field.declaringClass");
        this.className = DexSignUtil.getTypeName(r02);
        String r03 = r3.getName();
        AbstractC0307g.m702d(r03, "field.name");
        this.name = r03;
        Class<?> r32 = r3.getType();
        AbstractC0307g.m702d(r32, "field.type");
        this.typeName = DexSignUtil.getTypeName(r32);
    }
}
