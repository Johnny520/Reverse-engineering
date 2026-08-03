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
    public static final Companion f4420Companion = null;
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

        public final FieldData from(DexKitBridge r11, FieldMeta r12) {
            AbstractC0307g.m703e(r11, "bridge");
            AbstractC0307g.m703e(r12, "fieldMeta");
            int r3 = r12.m2711getIdpVg5ArA();
            int r4 = r12.m2710getDexIdpVg5ArA();
            int r5 = r12.m2709getClassIdpVg5ArA();
            int r6 = r12.m2708getAccessFlagspVg5ArA();
            String r7 = r12.getDexDescriptor();
            AbstractC0307g.m700b(r7);
            return new FieldData(r11, r3, r4, r5, r6, r7, r12.m2712getTypeIdpVg5ArA(), null);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        f4420Companion = new Companion(null);
    }

    public /* synthetic */ FieldData(DexKitBridge r1, int r2, int r3, int r4, int r5, String r6, int r7, AbstractC0304d r8) {
        this(r1, r2, r3, r4, r5, r6, r7);
    }

    public static final /* synthetic */ int access$getClassId$p(FieldData r02) {
        return r02.classId;
    }

    public static final /* synthetic */ long access$getEncodeId(FieldData r02, int r1, int r2) {
        return r02.getEncodeId(r1, r2);
    }

    public static final /* synthetic */ int access$getTypeId$p(FieldData r02) {
        return r02.typeId;
    }

    private final DexField getDexField() {
        return (DexField) ((C0142h) this.dexField$delegate).m466a();
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof FieldData) == true) goto L8;
    L10:
        return false;
    L8:
        if (AbstractC0307g.m699a(((FieldData) r3).descriptor, this.descriptor) == false) goto L10;
        return true;
    }

    public final List<AnnotationData> getAnnotations() {
        return (List) ((C0142h) this.annotations$delegate).m466a();
    }

    public final Class<?> getClassInstance(ClassLoader r3) throws ClassNotFoundException {
        AbstractC0307g.m703e(r3, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(r3, getClassName());
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

    public final Field getFieldInstance(ClassLoader r2) throws NoSuchFieldException {
        AbstractC0307g.m703e(r2, "classLoader");
        return getDexField().getFieldInstance(r2);
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

    public final Class<?> getTypeInstance(ClassLoader r3) throws ClassNotFoundException {
        AbstractC0307g.m703e(r3, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(r3, getTypeName());
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
        StringBuilder r02 = new StringBuilder();
        int r1 = this.modifiers;
        if (r1 <= 0) goto L5;
        r02.append(Modifier.toString(r1) + " ");
    L5:
        r02.append(getTypeName());
        r02.append(" ");
        r02.append(getClassName());
        r02.append(".");
        r02.append(getName());
        String r03 = r02.toString();
        AbstractC0307g.m702d(r03, "StringBuilder().apply(builderAction).toString()");
        return r03;
    }

    private FieldData(DexKitBridge r1, int r2, int r3, int r4, int r5, String r6, int r7) {
        super(r1, r2, r3);
        this.classId = r4;
        this.modifiers = r5;
        this.descriptor = r6;
        this.typeId = r7;
        this.dexField$delegate = AbstractC0040p.m81E(new FieldData$dexField$2(this));
        this.declaredClass$delegate = AbstractC0040p.m81E(new FieldData$declaredClass$2(r1, this, r3));
        this.type$delegate = AbstractC0040p.m81E(new FieldData$type$2(r1, this, r3));
        this.annotations$delegate = AbstractC0040p.m81E(new FieldData$annotations$2(r1, this, r3, r2));
        this.readers$delegate = AbstractC0040p.m81E(new FieldData$readers$2(r1, this, r3, r2));
        this.writers$delegate = AbstractC0040p.m81E(new FieldData$writers$2(r1, this, r3, r2));
    }
}
