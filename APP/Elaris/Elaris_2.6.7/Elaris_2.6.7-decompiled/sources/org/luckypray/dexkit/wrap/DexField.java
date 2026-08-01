package org.luckypray.dexkit.wrap;

import java.lang.reflect.Field;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.ISerializable;
import p000.AbstractC0260i5;
import p000.AbstractC0319ld;
import p000.AbstractC0431r2;
import p000.C0335md;
import p000.InterfaceC0200e9;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexField implements ISerializable {
    public static final Companion Companion = new Companion(null);
    private final String className;
    private final String name;
    private final String typeName;
    private final InterfaceC0200e9 typeSign$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexField(String str) {
        str.getClass();
        this.typeSign$delegate = new C0335md(new DexField$typeSign$2(this));
        int iM757K = AbstractC0319ld.m757K(str, "->", 0, 6);
        int iM757K2 = AbstractC0319ld.m757K(str, ":", iM757K + 1, 4);
        if (iM757K == -1 || iM757K2 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        this.className = DexSignUtil.getTypeName(str.substring(0, iM757K));
        this.name = str.substring(iM757K + 2, iM757K2);
        this.typeName = DexSignUtil.getTypeName(str.substring(iM757K2 + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final DexField deserialize(String str) {
        return Companion.deserialize(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Field getFieldInstance$default(DexField dexField, ClassLoader classLoader, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return dexField.getFieldInstance(classLoader, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final String getSign() {
        return DexSignUtil.getTypeSign(this.typeName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexField)) {
            return false;
        }
        DexField dexField = (DexField) obj;
        return AbstractC0260i5.m643p(this.className, dexField.className) && AbstractC0260i5.m643p(this.name, dexField.name) && AbstractC0260i5.m643p(this.typeName, dexField.typeName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getClassName() {
        return this.className;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDeclaredClassName() {
        return this.className;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Field getFieldInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return getFieldInstance$default(this, classLoader, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTypeName() {
        return this.typeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTypeSign() {
        return (String) this.typeSign$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.typeName.hashCode() + (this.name.hashCode() * 31) + (this.className.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.wrap.ISerializable
    public String serialize() {
        return ISerializable.DefaultImpls.serialize(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return DexSignUtil.getTypeSign(this.className) + "->" + this.name + ":" + getTypeSign();
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.wrap.DexField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DexField deserialize(String str) {
            str.getClass();
            return new DexField(str);
        }

        private Companion() {
        }
    }

    public final Field getFieldInstance(ClassLoader classLoader, Boolean bool) {
        classLoader.getClass();
        return InstanceUtil.INSTANCE.getFieldInstance(classLoader, this, bool);
    }

    public DexField(Field field) {
        field.getClass();
        this.typeSign$delegate = new C0335md(new DexField$typeSign$2(this));
        Class<?> declaringClass = field.getDeclaringClass();
        declaringClass.getClass();
        this.className = DexSignUtil.getTypeName(declaringClass);
        String name = field.getName();
        name.getClass();
        this.name = name;
        Class<?> type = field.getType();
        type.getClass();
        this.typeName = DexSignUtil.getTypeName(type);
    }
}
