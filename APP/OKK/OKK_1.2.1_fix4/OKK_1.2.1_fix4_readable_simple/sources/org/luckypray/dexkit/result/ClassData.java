package org.luckypray.dexkit.result;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindField;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.ClassMeta;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.DexClass;
import p001A0.AbstractC0040p;
import p007D0.C0142h;
import p007D0.InterfaceC0136b;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class ClassData extends BaseData {

    /* JADX INFO: renamed from: -Companion */
    public static final Companion f4419Companion = null;
    private final InterfaceC0136b annotations$delegate;
    private final String descriptor;
    private final InterfaceC0136b dexClass$delegate;
    private final List<Integer> fieldIds;
    private final InterfaceC0136b fields$delegate;
    private final List<Integer> interfaceIds;
    private final InterfaceC0136b interfaces$delegate;
    private final List<Integer> methodIds;
    private final InterfaceC0136b methods$delegate;
    private final int modifiers;
    private final String sourceFile;
    private final InterfaceC0136b superClass$delegate;
    private final Integer superClassId;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.ClassData$-Companion */
    public static final class Companion {
        private Companion() {
        }

        public final ClassData from(DexKitBridge r14, ClassMeta r15) {
            AbstractC0307g.m703e(r14, "bridge");
            AbstractC0307g.m703e(r15, "classMeta");
            int r3 = r15.m2697getIdpVg5ArA();
            int r4 = r15.m2696getDexIdpVg5ArA();
            String r02 = r15.getSourceFile();
            if (r02 != null) goto L5;
            String r5 = "";
        L6:
            int r6 = r15.m2695getAccessFlagspVg5ArA();
            String r03 = r15.getDexDescriptor();
            if (r03 != null) goto L9;
            String r7 = "";
        L10:
            int r04 = r15.m2698getSuperClasspVg5ArA();
            if (r04 != (-1)) goto L14;
            Integer r05 = null;
        L13:
            Integer r8 = r05;
            ArrayList r9 = new ArrayList();
            int r06 = r15.getInterfacesLength();
            int r1 = 0;
            int r2 = 0;
        L16:
            if (r2 >= r06) goto L18;
            r9.add(Integer.valueOf(r15.interfaces(r2)));
            r2 = r2 + 1;
            goto L16
        L18:
            ArrayList r10 = new ArrayList();
            int r07 = r15.getMethodsLength();
            int r22 = 0;
        L19:
            if (r22 >= r07) goto L21;
            r10.add(Integer.valueOf(r15.methods(r22)));
            r22 = r22 + 1;
            goto L19
        L21:
            ArrayList r11 = new ArrayList();
            int r08 = r15.getFieldsLength();
        L22:
            if (r1 >= r08) goto L25;
            r11.add(Integer.valueOf(r15.fields(r1)));
            r1 = r1 + 1;
            goto L22
        L25:
            return new ClassData(r14, r3, r4, r5, r6, r7, r8, r9, r10, r11, null);
        L14:
            r05 = Integer.valueOf(r04);
            goto L13
        L9:
            r7 = r03;
            goto L10
        L5:
            r5 = r02;
            goto L6
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        f4419Companion = new Companion(null);
    }

    public /* synthetic */ ClassData(DexKitBridge r1, int r2, int r3, String r4, int r5, String r6, Integer r7, List r8, List r9, List r10, AbstractC0304d r11) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
    }

    public static final /* synthetic */ long access$getEncodeId(ClassData r02, int r1, int r2) {
        return r02.getEncodeId(r1, r2);
    }

    public static final /* synthetic */ List access$getFieldIds$p(ClassData r02) {
        return r02.fieldIds;
    }

    public static final /* synthetic */ List access$getInterfaceIds$p(ClassData r02) {
        return r02.interfaceIds;
    }

    public static final /* synthetic */ List access$getMethodIds$p(ClassData r02) {
        return r02.methodIds;
    }

    public static final /* synthetic */ Integer access$getSuperClassId$p(ClassData r02) {
        return r02.superClassId;
    }

    private final DexClass getDexClass() {
        return (DexClass) ((C0142h) this.dexClass$delegate).m466a();
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof ClassData) == true) goto L8;
    L10:
        return false;
    L8:
        if (AbstractC0307g.m699a(this.descriptor, ((ClassData) r3).descriptor) == false) goto L10;
        return true;
    }

    public final FieldDataList findField(FindField r2) {
        AbstractC0307g.m703e(r2, "findField");
        r2.searchInClass(AbstractC0040p.m82F(this));
        return getBridge().findField(r2);
    }

    public final MethodDataList findMethod(FindMethod r2) {
        AbstractC0307g.m703e(r2, "findMethod");
        r2.searchInClass(AbstractC0040p.m82F(this));
        return getBridge().findMethod(r2);
    }

    public final List<AnnotationData> getAnnotations() {
        return (List) ((C0142h) this.annotations$delegate).m466a();
    }

    public final String getDescriptor() {
        return this.descriptor;
    }

    public final int getFieldCount() {
        return this.fieldIds.size();
    }

    public final FieldDataList getFields() {
        return (FieldDataList) ((C0142h) this.fields$delegate).m466a();
    }

    public final Class<?> getInstance(ClassLoader r2) throws ClassNotFoundException {
        AbstractC0307g.m703e(r2, "classLoader");
        return getDexClass().getInstance(r2);
    }

    public final int getInterfaceCount() {
        return this.interfaceIds.size();
    }

    public final List<Class<?>> getInterfaceInstances(ClassLoader r5) throws ClassNotFoundException {
        AbstractC0307g.m703e(r5, "classLoader");
        ClassDataList r02 = getInterfaces();
        ArrayList r1 = new ArrayList(AbstractC0183n.m559k0(r02, 10));
        Iterator<ClassData> r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        ClassData r2 = r03.next();
        r1.add(InstanceUtil.INSTANCE.getClassInstance(r5, r2.getName()));
        goto L4
    L6:
        return r1;
    }

    public final ClassDataList getInterfaces() {
        return (ClassDataList) ((C0142h) this.interfaces$delegate).m466a();
    }

    public final int getMethodCount() {
        return this.methodIds.size();
    }

    public final MethodDataList getMethods() {
        return (MethodDataList) ((C0142h) this.methods$delegate).m466a();
    }

    public final int getModifiers() {
        return this.modifiers;
    }

    public final String getName() {
        return getDexClass().getTypeName();
    }

    public final String getSimpleName() {
        return getDexClass().getSimpleName();
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final ClassData getSuperClass() {
        return (ClassData) ((C0142h) this.superClass$delegate).m466a();
    }

    public final Class<?> getSuperClassInstance(ClassLoader r2) throws ClassNotFoundException {
        AbstractC0307g.m703e(r2, "classLoader");
        ClassData r02 = getSuperClass();
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.getInstance(r2);
    }

    public int hashCode() {
        return this.descriptor.hashCode();
    }

    public final boolean isArray() {
        return getDexClass().isArray();
    }

    public final DexClass toDexType() {
        return getDexClass();
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        int r1 = this.modifiers;
        if (r1 <= 0) goto L5;
        r02.append(Modifier.toString(r1) + " ");
    L5:
        r02.append("class " + getName());
        ClassData r12 = getSuperClass();
        if (r12 == null) goto L9;
        r02.append(" extends ");
        r02.append(r12.getName());
    L9:
        if (getInterfaceCount() <= 0) goto L11;
        r02.append(" implements ");
        r02.append(AbstractC0181l.m546r0(getInterfaces(), ", ", null, null, ClassData$toString$1$2.INSTANCE, 30));
    L11:
        String r03 = r02.toString();
        AbstractC0307g.m702d(r03, "StringBuilder().apply(builderAction).toString()");
        return r03;
    }

    private ClassData(DexKitBridge r1, int r2, int r3, String r4, int r5, String r6, Integer r7, List<Integer> r8, List<Integer> r9, List<Integer> r10) {
        super(r1, r2, r3);
        this.sourceFile = r4;
        this.modifiers = r5;
        this.descriptor = r6;
        this.superClassId = r7;
        this.interfaceIds = r8;
        this.methodIds = r9;
        this.fieldIds = r10;
        this.dexClass$delegate = AbstractC0040p.m81E(new ClassData$dexClass$2(this));
        this.superClass$delegate = AbstractC0040p.m81E(new ClassData$superClass$2(this, r1, r3));
        this.interfaces$delegate = AbstractC0040p.m81E(new ClassData$interfaces$2(r1, this, r3));
        this.methods$delegate = AbstractC0040p.m81E(new ClassData$methods$2(r1, this, r3));
        this.fields$delegate = AbstractC0040p.m81E(new ClassData$fields$2(r1, this, r3));
        this.annotations$delegate = AbstractC0040p.m81E(new ClassData$annotations$2(r1, this, r3, r2));
    }

    private final FieldDataList findField(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FindField r02 = new FindField();
        r2.invoke(r02);
        return findField(r02);
    }

    private final MethodDataList findMethod(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FindMethod r02 = new FindMethod();
        r2.invoke(r02);
        return findMethod(r02);
    }
}
