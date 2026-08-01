package org.luckypray.dexkit.wrap;

import java.lang.reflect.Field;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.ISerializable;
import p000.AbstractC0619pl;
import p000.k41;
import p000.p30;
import p000.u60;
import p000.x51;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DexField implements ISerializable {
    public static final Companion Companion = new Companion(null);
    private final String className;
    private final String name;
    private final String typeName;
    private final u60 typeSign$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexField(String str) {
        str.getClass();
        this.typeSign$delegate = new x51(new DexField$typeSign$2(this));
        int iM1768Z = k41.m1768Z(str, "->", 0, false, 6);
        int iM1768Z2 = k41.m1768Z(str, ":", iM1768Z + 1, false, 4);
        if (iM1768Z == -1 || iM1768Z2 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        this.className = DexSignUtil.getTypeName(str.substring(0, iM1768Z));
        this.name = str.substring(iM1768Z + 2, iM1768Z2);
        this.typeName = DexSignUtil.getTypeName(str.substring(iM1768Z2 + 1));
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
        return p30.m3002l(this.className, dexField.className) && p30.m3002l(this.name, dexField.name) && p30.m3002l(this.typeName, dexField.typeName);
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

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.wrap.DexField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
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
        this.typeSign$delegate = new x51(new DexField$typeSign$2(this));
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
