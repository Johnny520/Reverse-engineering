package org.luckypray.dexkit.wrap;

import Yue.C4335;
import Yue.C5499;
import Yue.C5689;
import Yue.C7628;
import Yue.InterfaceC5573;
import Yue.InterfaceC5578;
import Yue.InterfaceC5684;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import java.lang.reflect.Field;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.ISerializable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\nR\u001b\u0010#\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\nR\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\n¨\u0006'"}, d2 = {"Lorg/luckypray/dexkit/wrap/DexField;", "Lorg/luckypray/dexkit/wrap/ISerializable;", "", "descriptor", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "Ljava/lang/reflect/Field;", "field", "(Ljava/lang/reflect/Field;)V", "getSign", "()Ljava/lang/String;", "Ljava/lang/ClassLoader;", "classLoader", "", "isStatic", "getFieldInstance", "(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;", "toString", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "className", "Ljava/lang/String;", "getClassName", "name", "getName", "typeName", "getTypeName", "typeSign$delegate", "LYue/ۥ۠ۦۨۨ;", "getTypeSign", "typeSign", "getDeclaredClassName", "declaredClassName", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class DexField implements ISerializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6399
    private final String className;

    @InterfaceC6399
    private final String name;

    @InterfaceC6399
    private final String typeName;

    /* JADX INFO: renamed from: typeSign$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 typeSign;

    @InterfaceC6211(m2698d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m2699d2 = {"Lorg/luckypray/dexkit/wrap/DexField$Companion;", "", "()V", "deserialize", "Lorg/luckypray/dexkit/wrap/DexField;", "descriptor", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.wrap.DexField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final DexField deserialize(@InterfaceC6399 String str) {
            C5499.m17103(str, "descriptor");
            return new DexField(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexField(@InterfaceC6399 String str) {
        C5499.m17103(str, "descriptor");
        this.typeSign = C5689.m2370(new DexField$typeSign$2(this));
        int iM24057 = C7628.m24057(str, "->", 0, false, 6, null);
        int iM240572 = C7628.m24057(str, ":", iM24057 + 1, false, 4, null);
        if (iM24057 == -1 || iM240572 == -1) {
            throw new IllegalAccessError("not field descriptor: " + str);
        }
        String strSubstring = str.substring(0, iM24057);
        C5499.m17102(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.className = DexSignUtil.getTypeName(strSubstring);
        String strSubstring2 = str.substring(iM24057 + 2, iM240572);
        C5499.m17102(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.name = strSubstring2;
        String strSubstring3 = str.substring(iM240572 + 1);
        C5499.m17102(strSubstring3, "(this as java.lang.String).substring(startIndex)");
        this.typeName = DexSignUtil.getTypeName(strSubstring3);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final DexField deserialize(@InterfaceC6399 String str) {
        return INSTANCE.deserialize(str);
    }

    public static /* synthetic */ Field getFieldInstance$default(DexField dexField, ClassLoader classLoader, Boolean bool, int i, Object obj) throws NoSuchFieldException {
        if ((i & 2) != 0) {
            bool = null;
        }
        return dexField.getFieldInstance(classLoader, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSign() {
        return DexSignUtil.getTypeSign(this.typeName);
    }

    public boolean equals(@InterfaceC6489 Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DexField)) {
            return false;
        }
        DexField dexField = (DexField) other;
        return C5499.m17094(this.className, dexField.className) && C5499.m17094(this.name, dexField.name) && C5499.m17094(this.typeName, dexField.typeName);
    }

    @InterfaceC6399
    public final String getClassName() {
        return this.className;
    }

    @InterfaceC6399
    public final String getDeclaredClassName() {
        return this.className;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final Field getFieldInstance(@InterfaceC6399 ClassLoader classLoader) throws NoSuchFieldException {
        C5499.m17103(classLoader, "classLoader");
        return getFieldInstance$default(this, classLoader, null, 2, null);
    }

    @InterfaceC6399
    public final String getName() {
        return this.name;
    }

    @InterfaceC6399
    public final String getTypeName() {
        return this.typeName;
    }

    @InterfaceC6399
    public final String getTypeSign() {
        return (String) this.typeSign.getValue();
    }

    public int hashCode() {
        return (this.className.hashCode() * 31) + (this.name.hashCode() * 31) + this.typeName.hashCode();
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    @InterfaceC6399
    public String serialize() {
        return ISerializable.DefaultImpls.serialize(this);
    }

    @InterfaceC6399
    public String toString() {
        String str = DexSignUtil.getTypeSign(this.className) + "->" + this.name + ":" + getTypeSign();
        C5499.m17102(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final Field getFieldInstance(@InterfaceC6399 ClassLoader classLoader, @InterfaceC6489 Boolean isStatic) throws NoSuchFieldException {
        C5499.m17103(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getFieldInstance(classLoader, this, isStatic);
    }

    public DexField(@InterfaceC6399 Field field) {
        C5499.m17103(field, "field");
        this.typeSign = C5689.m2370(new DexField$typeSign$2(this));
        Class<?> declaringClass = field.getDeclaringClass();
        C5499.m17102(declaringClass, "field.declaringClass");
        this.className = DexSignUtil.getTypeName(declaringClass);
        String name = field.getName();
        C5499.m17102(name, "field.name");
        this.name = name;
        Class<?> type = field.getType();
        C5499.m17102(type, "field.type");
        this.typeName = DexSignUtil.getTypeName(type);
    }
}
