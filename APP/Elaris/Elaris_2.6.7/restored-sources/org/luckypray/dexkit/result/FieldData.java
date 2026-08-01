package org.luckypray.dexkit.result;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.FieldMeta;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.DexField;
import p000.AbstractC0260i5;
import p000.AbstractC0431r2;
import p000.C0335md;
import p000.InterfaceC0200e9;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f1173Companion = new Companion(null);
    private final InterfaceC0200e9 annotations$delegate;
    private final int classId;
    private final InterfaceC0200e9 declaredClass$delegate;
    private final String descriptor;
    private final InterfaceC0200e9 dexField$delegate;
    private final int modifiers;
    private final InterfaceC0200e9 readers$delegate;
    private final InterfaceC0200e9 type$delegate;
    private final int typeId;
    private final InterfaceC0200e9 writers$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private FieldData(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5) {
        super(dexKitBridge, i, i2);
        this.classId = i3;
        this.modifiers = i4;
        this.descriptor = str;
        this.typeId = i5;
        this.dexField$delegate = new C0335md(new FieldData$dexField$2(this));
        this.declaredClass$delegate = new C0335md(new FieldData$declaredClass$2(dexKitBridge, this, i2));
        this.type$delegate = new C0335md(new FieldData$type$2(dexKitBridge, this, i2));
        this.annotations$delegate = new C0335md(new FieldData$annotations$2(dexKitBridge, this, i2, i));
        this.readers$delegate = new C0335md(new FieldData$readers$2(dexKitBridge, this, i2, i));
        this.writers$delegate = new C0335md(new FieldData$writers$2(dexKitBridge, this, i2, i));
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
        return (obj instanceof FieldData) && AbstractC0260i5.m643p(((FieldData) obj).descriptor, this.descriptor);
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
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.FieldData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FieldData from(DexKitBridge dexKitBridge, FieldMeta fieldMeta) {
            dexKitBridge.getClass();
            fieldMeta.getClass();
            int iM1272getIdpVg5ArA = fieldMeta.m1272getIdpVg5ArA();
            int iM1271getDexIdpVg5ArA = fieldMeta.m1271getDexIdpVg5ArA();
            int iM1270getClassIdpVg5ArA = fieldMeta.m1270getClassIdpVg5ArA();
            int iM1269getAccessFlagspVg5ArA = fieldMeta.m1269getAccessFlagspVg5ArA();
            String dexDescriptor = fieldMeta.getDexDescriptor();
            dexDescriptor.getClass();
            return new FieldData(dexKitBridge, iM1272getIdpVg5ArA, iM1271getDexIdpVg5ArA, iM1270getClassIdpVg5ArA, iM1269getAccessFlagspVg5ArA, dexDescriptor, fieldMeta.m1273getTypeIdpVg5ArA(), null);
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
    public /* synthetic */ FieldData(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, AbstractC0431r2 abstractC0431r2) {
        this(dexKitBridge, i, i2, i3, i4, str, i5);
    }
}
