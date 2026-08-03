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
    public static final Companion f4419Companion = new Companion(null);
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

        public final ClassData from(DexKitBridge dexKitBridge, ClassMeta classMeta) {
            AbstractC0307g.m703e(dexKitBridge, "bridge");
            AbstractC0307g.m703e(classMeta, "classMeta");
            int iM2697getIdpVg5ArA = classMeta.m2697getIdpVg5ArA();
            int iM2696getDexIdpVg5ArA = classMeta.m2696getDexIdpVg5ArA();
            String sourceFile = classMeta.getSourceFile();
            String str = sourceFile == null ? "" : sourceFile;
            int iM2695getAccessFlagspVg5ArA = classMeta.m2695getAccessFlagspVg5ArA();
            String dexDescriptor = classMeta.getDexDescriptor();
            String str2 = dexDescriptor == null ? "" : dexDescriptor;
            int iM2698getSuperClasspVg5ArA = classMeta.m2698getSuperClasspVg5ArA();
            Integer numValueOf = iM2698getSuperClasspVg5ArA == -1 ? null : Integer.valueOf(iM2698getSuperClasspVg5ArA);
            ArrayList arrayList = new ArrayList();
            int interfacesLength = classMeta.getInterfacesLength();
            for (int i2 = 0; i2 < interfacesLength; i2++) {
                arrayList.add(Integer.valueOf(classMeta.interfaces(i2)));
            }
            ArrayList arrayList2 = new ArrayList();
            int methodsLength = classMeta.getMethodsLength();
            for (int i3 = 0; i3 < methodsLength; i3++) {
                arrayList2.add(Integer.valueOf(classMeta.methods(i3)));
            }
            ArrayList arrayList3 = new ArrayList();
            int fieldsLength = classMeta.getFieldsLength();
            for (int i4 = 0; i4 < fieldsLength; i4++) {
                arrayList3.add(Integer.valueOf(classMeta.fields(i4)));
            }
            return new ClassData(dexKitBridge, iM2697getIdpVg5ArA, iM2696getDexIdpVg5ArA, str, iM2695getAccessFlagspVg5ArA, str2, numValueOf, arrayList, arrayList2, arrayList3, null);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public /* synthetic */ ClassData(DexKitBridge dexKitBridge, int i2, int i3, String str, int i4, String str2, Integer num, List list, List list2, List list3, AbstractC0304d abstractC0304d) {
        this(dexKitBridge, i2, i3, str, i4, str2, num, list, list2, list3);
    }

    private final DexClass getDexClass() {
        return (DexClass) ((C0142h) this.dexClass$delegate).m466a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClassData) && AbstractC0307g.m699a(this.descriptor, ((ClassData) obj).descriptor);
    }

    public final FieldDataList findField(FindField findField) {
        AbstractC0307g.m703e(findField, "findField");
        findField.searchInClass(AbstractC0040p.m82F(this));
        return getBridge().findField(findField);
    }

    public final MethodDataList findMethod(FindMethod findMethod) {
        AbstractC0307g.m703e(findMethod, "findMethod");
        findMethod.searchInClass(AbstractC0040p.m82F(this));
        return getBridge().findMethod(findMethod);
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

    public final Class<?> getInstance(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return getDexClass().getInstance(classLoader);
    }

    public final int getInterfaceCount() {
        return this.interfaceIds.size();
    }

    public final List<Class<?>> getInterfaceInstances(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        ClassDataList interfaces = getInterfaces();
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(interfaces, 10));
        Iterator<ClassData> it = interfaces.iterator();
        while (it.hasNext()) {
            arrayList.add(InstanceUtil.INSTANCE.getClassInstance(classLoader, it.next().getName()));
        }
        return arrayList;
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

    public final Class<?> getSuperClassInstance(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        ClassData superClass = getSuperClass();
        if (superClass != null) {
            return superClass.getInstance(classLoader);
        }
        return null;
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
        StringBuilder sb = new StringBuilder();
        int i2 = this.modifiers;
        if (i2 > 0) {
            sb.append(Modifier.toString(i2) + " ");
        }
        sb.append("class " + getName());
        ClassData superClass = getSuperClass();
        if (superClass != null) {
            sb.append(" extends ");
            sb.append(superClass.getName());
        }
        if (getInterfaceCount() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC0181l.m546r0(getInterfaces(), ", ", null, null, ClassData$toString$1$2.INSTANCE, 30));
        }
        String string = sb.toString();
        AbstractC0307g.m702d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private ClassData(DexKitBridge dexKitBridge, int i2, int i3, String str, int i4, String str2, Integer num, List<Integer> list, List<Integer> list2, List<Integer> list3) {
        super(dexKitBridge, i2, i3);
        this.sourceFile = str;
        this.modifiers = i4;
        this.descriptor = str2;
        this.superClassId = num;
        this.interfaceIds = list;
        this.methodIds = list2;
        this.fieldIds = list3;
        this.dexClass$delegate = AbstractC0040p.m81E(new ClassData$dexClass$2(this));
        this.superClass$delegate = AbstractC0040p.m81E(new ClassData$superClass$2(this, dexKitBridge, i3));
        this.interfaces$delegate = AbstractC0040p.m81E(new ClassData$interfaces$2(dexKitBridge, this, i3));
        this.methods$delegate = AbstractC0040p.m81E(new ClassData$methods$2(dexKitBridge, this, i3));
        this.fields$delegate = AbstractC0040p.m81E(new ClassData$fields$2(dexKitBridge, this, i3));
        this.annotations$delegate = AbstractC0040p.m81E(new ClassData$annotations$2(dexKitBridge, this, i3, i2));
    }

    private final FieldDataList findField(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FindField findField = new FindField();
        interfaceC0286l.invoke(findField);
        return findField(findField);
    }

    private final MethodDataList findMethod(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FindMethod findMethod = new FindMethod();
        interfaceC0286l.invoke(findMethod);
        return findMethod(findMethod);
    }
}
