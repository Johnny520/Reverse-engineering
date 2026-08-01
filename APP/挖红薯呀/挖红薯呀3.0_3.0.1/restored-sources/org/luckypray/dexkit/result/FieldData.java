package org.luckypray.dexkit.result;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.FieldMeta;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.DexField;
import p000.AbstractC0619pl;
import p000.p30;
import p000.u60;
import p000.x51;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f8069Companion = new Companion(null);
    private final u60 annotations$delegate;
    private final int classId;
    private final u60 declaredClass$delegate;
    private final String descriptor;
    private final u60 dexField$delegate;
    private final int modifiers;
    private final u60 readers$delegate;
    private final u60 type$delegate;
    private final int typeId;
    private final u60 writers$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private FieldData(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5) {
        super(dexKitBridge, i, i2);
        this.classId = i3;
        this.modifiers = i4;
        this.descriptor = str;
        this.typeId = i5;
        this.dexField$delegate = new x51(new FieldData$dexField$2(this));
        this.declaredClass$delegate = new x51(new FieldData$declaredClass$2(dexKitBridge, this, i2));
        this.type$delegate = new x51(new FieldData$type$2(dexKitBridge, this, i2));
        this.annotations$delegate = new x51(new FieldData$annotations$2(dexKitBridge, this, i2, i));
        this.readers$delegate = new x51(new FieldData$readers$2(dexKitBridge, this, i2, i));
        this.writers$delegate = new x51(new FieldData$writers$2(dexKitBridge, this, i2, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final DexField getDexField() {
        return (DexField) this.dexField$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FieldData) && p30.m3002l(((FieldData) obj).descriptor, this.descriptor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<AnnotationData> getAnnotations() {
        return (List) this.annotations$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<?> getClassInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getClassName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getClassName() {
        return getDexField().getClassName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassData getDeclaredClass() {
        return (ClassData) this.declaredClass$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDeclaredClassName() {
        return getClassName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDescriptor() {
        return this.descriptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Field getFieldInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return getDexField().getFieldInstance(classLoader, Boolean.valueOf(Modifier.isStatic(this.modifiers)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getFieldName() {
        return getDexField().getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getModifiers() {
        return this.modifiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return getDexField().getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodDataList getReaders() {
        return (MethodDataList) this.readers$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassData getType() {
        return (ClassData) this.type$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<?> getTypeInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getTypeName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTypeName() {
        return getDexField().getTypeName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTypeSign() {
        return getDexField().getTypeSign();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodDataList getWriters() {
        return (MethodDataList) this.writers$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.descriptor.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final DexField toDexField() {
        return getDexField();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        return sb.toString();
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.FieldData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.FieldData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FieldData from(DexKitBridge dexKitBridge, FieldMeta fieldMeta) {
            dexKitBridge.getClass();
            fieldMeta.getClass();
            int iM5703getIdpVg5ArA = fieldMeta.m5703getIdpVg5ArA();
            int iM5702getDexIdpVg5ArA = fieldMeta.m5702getDexIdpVg5ArA();
            int iM5701getClassIdpVg5ArA = fieldMeta.m5701getClassIdpVg5ArA();
            int iM5700getAccessFlagspVg5ArA = fieldMeta.m5700getAccessFlagspVg5ArA();
            String dexDescriptor = fieldMeta.getDexDescriptor();
            dexDescriptor.getClass();
            return new FieldData(dexKitBridge, iM5703getIdpVg5ArA, iM5702getDexIdpVg5ArA, iM5701getClassIdpVg5ArA, iM5700getAccessFlagspVg5ArA, dexDescriptor, fieldMeta.m5704getTypeIdpVg5ArA(), null);
        }

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
 A[MD:(org.luckypray.dexkit.DexKitBridge, int, int, int, int, java.lang.String, int):void (m)] (LINE:85) call: org.luckypray.dexkit.result.FieldData.<init>(org.luckypray.dexkit.DexKitBridge, int, int, int, int, java.lang.String, int):void type: THIS */
    public /* synthetic */ FieldData(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, AbstractC0619pl abstractC0619pl) {
        this(dexKitBridge, i, i2, i3, i4, str, i5);
    }
}
