package org.luckypray.dexkit.result;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.FieldMeta;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.DexField;
import p001A0.AbstractC0040p;
import p007D0.C0142h;
import p007D0.InterfaceC0136b;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class FieldData extends BaseData {

    /* JADX INFO: renamed from: -Companion */
    public static final Companion f4420Companion = new Companion(null);
    private final InterfaceC0136b annotations$delegate;
    private final int classId;
    private final InterfaceC0136b declaredClass$delegate;
    private final String descriptor;
    private final InterfaceC0136b dexField$delegate;
    private final int modifiers;
    private final InterfaceC0136b readers$delegate;
    private final InterfaceC0136b type$delegate;
    private final int typeId;
    private final InterfaceC0136b writers$delegate;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.FieldData$-Companion */
    public static final class Companion {
        private Companion() {
        }

        public final FieldData from(DexKitBridge dexKitBridge, FieldMeta fieldMeta) {
            AbstractC0307g.m703e(dexKitBridge, "bridge");
            AbstractC0307g.m703e(fieldMeta, "fieldMeta");
            int iM2711getIdpVg5ArA = fieldMeta.m2711getIdpVg5ArA();
            int iM2710getDexIdpVg5ArA = fieldMeta.m2710getDexIdpVg5ArA();
            int iM2709getClassIdpVg5ArA = fieldMeta.m2709getClassIdpVg5ArA();
            int iM2708getAccessFlagspVg5ArA = fieldMeta.m2708getAccessFlagspVg5ArA();
            String dexDescriptor = fieldMeta.getDexDescriptor();
            AbstractC0307g.m700b(dexDescriptor);
            return new FieldData(dexKitBridge, iM2711getIdpVg5ArA, iM2710getDexIdpVg5ArA, iM2709getClassIdpVg5ArA, iM2708getAccessFlagspVg5ArA, dexDescriptor, fieldMeta.m2712getTypeIdpVg5ArA(), null);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public /* synthetic */ FieldData(DexKitBridge dexKitBridge, int i2, int i3, int i4, int i5, String str, int i6, AbstractC0304d abstractC0304d) {
        this(dexKitBridge, i2, i3, i4, i5, str, i6);
    }

    private final DexField getDexField() {
        return (DexField) ((C0142h) this.dexField$delegate).m466a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FieldData) && AbstractC0307g.m699a(((FieldData) obj).descriptor, this.descriptor);
    }

    public final List<AnnotationData> getAnnotations() {
        return (List) ((C0142h) this.annotations$delegate).m466a();
    }

    public final Class<?> getClassInstance(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getClassName());
    }

    public final String getClassName() {
        return getDexField().getClassName();
    }

    public final ClassData getDeclaredClass() {
        return (ClassData) ((C0142h) this.declaredClass$delegate).m466a();
    }

    public final String getDeclaredClassName() {
        return getClassName();
    }

    public final String getDescriptor() {
        return this.descriptor;
    }

    public final Field getFieldInstance(ClassLoader classLoader) throws NoSuchFieldException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return getDexField().getFieldInstance(classLoader);
    }

    public final String getFieldName() {
        return getDexField().getName();
    }

    public final int getModifiers() {
        return this.modifiers;
    }

    public final String getName() {
        return getDexField().getName();
    }

    public final MethodDataList getReaders() {
        return (MethodDataList) ((C0142h) this.readers$delegate).m466a();
    }

    public final ClassData getType() {
        return (ClassData) ((C0142h) this.type$delegate).m466a();
    }

    public final Class<?> getTypeInstance(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getTypeName());
    }

    public final String getTypeName() {
        return getDexField().getTypeName();
    }

    public final String getTypeSign() {
        return getDexField().getTypeSign();
    }

    public final MethodDataList getWriters() {
        return (MethodDataList) ((C0142h) this.writers$delegate).m466a();
    }

    public int hashCode() {
        return this.descriptor.hashCode();
    }

    public final DexField toDexField() {
        return getDexField();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.modifiers;
        if (i2 > 0) {
            sb.append(Modifier.toString(i2) + " ");
        }
        sb.append(getTypeName());
        sb.append(" ");
        sb.append(getClassName());
        sb.append(".");
        sb.append(getName());
        String string = sb.toString();
        AbstractC0307g.m702d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private FieldData(DexKitBridge dexKitBridge, int i2, int i3, int i4, int i5, String str, int i6) {
        super(dexKitBridge, i2, i3);
        this.classId = i4;
        this.modifiers = i5;
        this.descriptor = str;
        this.typeId = i6;
        this.dexField$delegate = AbstractC0040p.m81E(new FieldData$dexField$2(this));
        this.declaredClass$delegate = AbstractC0040p.m81E(new FieldData$declaredClass$2(dexKitBridge, this, i3));
        this.type$delegate = AbstractC0040p.m81E(new FieldData$type$2(dexKitBridge, this, i3));
        this.annotations$delegate = AbstractC0040p.m81E(new FieldData$annotations$2(dexKitBridge, this, i3, i2));
        this.readers$delegate = AbstractC0040p.m81E(new FieldData$readers$2(dexKitBridge, this, i3, i2));
        this.writers$delegate = AbstractC0040p.m81E(new FieldData$writers$2(dexKitBridge, this, i3, i2));
    }
}
