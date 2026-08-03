package org.luckypray.dexkit.result;

import Yue.C4335;
import Yue.C5499;
import Yue.C5689;
import Yue.InterfaceC5684;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.FieldMeta;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.DexField;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 M2\u00020\u0001:\u0001MBA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u001b\u0010*\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0019R\u001b\u0010/\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010.R\u001b\u00102\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010.R!\u00108\u001a\b\u0012\u0004\u0012\u000204038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010<R\u001b\u0010@\u001a\u0002098FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b?\u0010<R\u0011\u0010B\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bA\u0010\u001bR\u0011\u0010D\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bC\u0010\u001bR\u0011\u0010F\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bE\u0010\u001bR\u0011\u0010H\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bG\u0010\u001bR\u0011\u0010J\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bI\u0010\u001bR\u0011\u0010L\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bK\u0010\u001b¨\u0006N"}, d2 = {"Lorg/luckypray/dexkit/result/FieldData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "Lorg/luckypray/dexkit/DexKitBridge;", "bridge", "", Name.MARK, "dexId", "classId", "modifiers", "", "descriptor", "typeId", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V", "Ljava/lang/ClassLoader;", "classLoader", "Ljava/lang/Class;", "getClassInstance", "(Ljava/lang/ClassLoader;)Ljava/lang/Class;", "getTypeInstance", "Ljava/lang/reflect/Field;", "getFieldInstance", "(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;", "Lorg/luckypray/dexkit/wrap/DexField;", "toDexField", "()Lorg/luckypray/dexkit/wrap/DexField;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getModifiers", "Ljava/lang/String;", "getDescriptor", "dexField$delegate", "LYue/ۥ۠ۦۨۨ;", "getDexField", "dexField", "Lorg/luckypray/dexkit/result/ClassData;", "declaredClass$delegate", "getDeclaredClass", "()Lorg/luckypray/dexkit/result/ClassData;", "declaredClass", "type$delegate", "getType", "type", "", "Lorg/luckypray/dexkit/result/AnnotationData;", "annotations$delegate", "getAnnotations", "()Ljava/util/List;", "annotations", "Lorg/luckypray/dexkit/result/MethodDataList;", "readers$delegate", "getReaders", "()Lorg/luckypray/dexkit/result/MethodDataList;", "readers", "writers$delegate", "getWriters", "writers", "getTypeSign", "typeSign", "getClassName", "className", "getDeclaredClassName", "declaredClassName", "getFieldName", "fieldName", "getName", "name", "getTypeName", "typeName", "-Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FieldData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name and from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: annotations$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 annotations;
    private final int classId;

    /* JADX INFO: renamed from: declaredClass$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 declaredClass;

    @InterfaceC6399
    private final String descriptor;

    /* JADX INFO: renamed from: dexField$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 dexField;
    private final int modifiers;

    /* JADX INFO: renamed from: readers$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 readers;

    /* JADX INFO: renamed from: type$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 type;
    private final int typeId;

    /* JADX INFO: renamed from: writers$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 writers;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.FieldData$-Companion, reason: invalid class name and from kotlin metadata */
    @InterfaceC6211(m2698d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, m2699d2 = {"Lorg/luckypray/dexkit/result/FieldData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/FieldData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "fieldMeta", "Lorg/luckypray/dexkit/schema/-FieldMeta;", "Lorg/luckypray/dexkit/InnerFieldMeta;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.FieldData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        public final FieldData from(@InterfaceC6399 DexKitBridge dexKitBridge, @InterfaceC6399 FieldMeta fieldMeta) {
            C5499.m17103(dexKitBridge, "bridge");
            C5499.m17103(fieldMeta, "fieldMeta");
            int iM31191getIdpVg5ArA = fieldMeta.m31191getIdpVg5ArA();
            int iM31190getDexIdpVg5ArA = fieldMeta.m31190getDexIdpVg5ArA();
            int iM31189getClassIdpVg5ArA = fieldMeta.m31189getClassIdpVg5ArA();
            int iM31188getAccessFlagspVg5ArA = fieldMeta.m31188getAccessFlagspVg5ArA();
            String dexDescriptor = fieldMeta.getDexDescriptor();
            C5499.m17100(dexDescriptor);
            return new FieldData(dexKitBridge, iM31191getIdpVg5ArA, iM31190getDexIdpVg5ArA, iM31189getClassIdpVg5ArA, iM31188getAccessFlagspVg5ArA, dexDescriptor, fieldMeta.m31192getTypeIdpVg5ArA(), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 org.luckypray.dexkit.DexKitBridge)
  (r2v0 int)
  (r3v0 int)
  (r4v0 int)
  (r5v0 int)
  (r6v0 java.lang.String)
  (r7v0 int)
 A[MD:(org.luckypray.dexkit.DexKitBridge, int, int, int, int, java.lang.String, int):void (m)] (LINE:1) call: org.luckypray.dexkit.result.FieldData.<init>(org.luckypray.dexkit.DexKitBridge, int, int, int, int, java.lang.String, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ FieldData(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, C4335 c4335) {
        this(dexKitBridge, i, i2, i3, i4, str, i5);
    }

    private final DexField getDexField() {
        return (DexField) this.dexField.getValue();
    }

    public boolean equals(@InterfaceC6489 Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FieldData) && C5499.m17094(((FieldData) other).descriptor, this.descriptor);
    }

    @InterfaceC6399
    public final List<AnnotationData> getAnnotations() {
        return (List) this.annotations.getValue();
    }

    @InterfaceC6399
    public final Class<?> getClassInstance(@InterfaceC6399 ClassLoader classLoader) throws ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getClassName());
    }

    @InterfaceC6399
    public final String getClassName() {
        return getDexField().getClassName();
    }

    @InterfaceC6399
    public final ClassData getDeclaredClass() {
        return (ClassData) this.declaredClass.getValue();
    }

    @InterfaceC6399
    public final String getDeclaredClassName() {
        return getClassName();
    }

    @InterfaceC6399
    public final String getDescriptor() {
        return this.descriptor;
    }

    @InterfaceC6399
    public final Field getFieldInstance(@InterfaceC6399 ClassLoader classLoader) throws NoSuchFieldException {
        C5499.m17103(classLoader, "classLoader");
        return getDexField().getFieldInstance(classLoader, Boolean.valueOf(Modifier.isStatic(this.modifiers)));
    }

    @InterfaceC6399
    public final String getFieldName() {
        return getDexField().getName();
    }

    public final int getModifiers() {
        return this.modifiers;
    }

    @InterfaceC6399
    public final String getName() {
        return getDexField().getName();
    }

    @InterfaceC6399
    public final MethodDataList getReaders() {
        return (MethodDataList) this.readers.getValue();
    }

    @InterfaceC6399
    public final ClassData getType() {
        return (ClassData) this.type.getValue();
    }

    @InterfaceC6399
    public final Class<?> getTypeInstance(@InterfaceC6399 ClassLoader classLoader) throws ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getTypeName());
    }

    @InterfaceC6399
    public final String getTypeName() {
        return getDexField().getTypeName();
    }

    @InterfaceC6399
    public final String getTypeSign() {
        return getDexField().getTypeSign();
    }

    @InterfaceC6399
    public final MethodDataList getWriters() {
        return (MethodDataList) this.writers.getValue();
    }

    public int hashCode() {
        return this.descriptor.hashCode();
    }

    @InterfaceC6399
    public final DexField toDexField() {
        return getDexField();
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.modifiers;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(getTypeName());
        sb.append(" ");
        sb.append(getClassName());
        sb.append(".");
        sb.append(getName());
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private FieldData(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5) {
        super(dexKitBridge, i, i2);
        this.classId = i3;
        this.modifiers = i4;
        this.descriptor = str;
        this.typeId = i5;
        this.dexField = C5689.m2370(new FieldData$dexField$2(this));
        this.declaredClass = C5689.m2370(new FieldData$declaredClass$2(dexKitBridge, this, i2));
        this.type = C5689.m2370(new FieldData$type$2(dexKitBridge, this, i2));
        this.annotations = C5689.m2370(new FieldData$annotations$2(dexKitBridge, this, i2, i));
        this.readers = C5689.m2370(new FieldData$readers$2(dexKitBridge, this, i2, i));
        this.writers = C5689.m2370(new FieldData$writers$2(dexKitBridge, this, i2, i));
    }
}
