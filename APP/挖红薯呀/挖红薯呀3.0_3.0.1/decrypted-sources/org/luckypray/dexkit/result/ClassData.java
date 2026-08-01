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
import p000.AbstractC0619pl;
import p000.AbstractC0960ye;
import p000.AbstractC1001ze;
import p000.InterfaceC0061bn;
import p000.InterfaceC0742sw;
import p000.o30;
import p000.p30;
import p000.u60;
import p000.x51;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f8068Companion = new Companion(null);
    private final u60 annotations$delegate;
    private final String descriptor;
    private final u60 dexClass$delegate;
    private final List<Integer> fieldIds;
    private final u60 fields$delegate;
    private final List<Integer> interfaceIds;
    private final u60 interfaces$delegate;
    private final List<Integer> methodIds;
    private final u60 methods$delegate;
    private final int modifiers;
    private final String sourceFile;
    private final u60 superClass$delegate;
    private final Integer superClassId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ClassData(DexKitBridge dexKitBridge, int i, int i2, String str, int i3, String str2, Integer num, List<Integer> list, List<Integer> list2, List<Integer> list3) {
        super(dexKitBridge, i, i2);
        this.sourceFile = str;
        this.modifiers = i3;
        this.descriptor = str2;
        this.superClassId = num;
        this.interfaceIds = list;
        this.methodIds = list2;
        this.fieldIds = list3;
        this.dexClass$delegate = new x51(new ClassData$dexClass$2(this));
        this.superClass$delegate = new x51(new ClassData$superClass$2(this, dexKitBridge, i2));
        this.interfaces$delegate = new x51(new ClassData$interfaces$2(dexKitBridge, this, i2));
        this.methods$delegate = new x51(new ClassData$methods$2(dexKitBridge, this, i2));
        this.fields$delegate = new x51(new ClassData$fields$2(dexKitBridge, this, i2));
        this.annotations$delegate = new x51(new ClassData$annotations$2(dexKitBridge, this, i2, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final DexClass getDexClass() {
        return (DexClass) this.dexClass$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClassData) && p30.m3002l(this.descriptor, ((ClassData) obj).descriptor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldDataList findField(FindField findField) {
        findField.getClass();
        findField.searchInClass(o30.m2782v(this));
        return getBridge().findField(findField);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodDataList findMethod(FindMethod findMethod) {
        findMethod.getClass();
        findMethod.searchInClass(o30.m2782v(this));
        return getBridge().findMethod(findMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<AnnotationData> getAnnotations() {
        return (List) this.annotations$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDescriptor() {
        return this.descriptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getFieldCount() {
        return this.fieldIds.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldDataList getFields() {
        return (FieldDataList) this.fields$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<?> getInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return getDexClass().getInstance(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getInterfaceCount() {
        return this.interfaceIds.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Class<?>> getInterfaceInstances(ClassLoader classLoader) {
        classLoader.getClass();
        ClassDataList interfaces = getInterfaces();
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(interfaces));
        Iterator<ClassData> it = interfaces.iterator();
        while (it.hasNext()) {
            arrayList.add(InstanceUtil.INSTANCE.getClassInstance(classLoader, it.next().getName()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassDataList getInterfaces() {
        return (ClassDataList) this.interfaces$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMethodCount() {
        return this.methodIds.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodDataList getMethods() {
        return (MethodDataList) this.methods$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getModifiers() {
        return this.modifiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return getDexClass().getTypeName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSimpleName() {
        return getDexClass().getSimpleName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSourceFile() {
        return this.sourceFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassData getSuperClass() {
        return (ClassData) this.superClass$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<?> getSuperClassInstance(ClassLoader classLoader) {
        classLoader.getClass();
        ClassData superClass = getSuperClass();
        if (superClass != null) {
            return superClass.getInstance(classLoader);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.descriptor.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isArray() {
        return getDexClass().isArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final DexClass toDexClass() {
        return getDexClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final DexClass toDexType() {
        return getDexClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.modifiers;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append("class " + getName());
        ClassData superClass = getSuperClass();
        if (superClass != null) {
            sb.append(" extends ");
            sb.append(superClass.getName());
        }
        if (getInterfaceCount() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC0960ye.m5245O(getInterfaces(), ", ", null, null, ClassData$toString$1$2.INSTANCE, 30));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.ClassData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.ClassData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ClassData from(DexKitBridge dexKitBridge, ClassMeta classMeta) {
            dexKitBridge.getClass();
            classMeta.getClass();
            int iM5689getIdpVg5ArA = classMeta.m5689getIdpVg5ArA();
            int iM5688getDexIdpVg5ArA = classMeta.m5688getDexIdpVg5ArA();
            String sourceFile = classMeta.getSourceFile();
            String str = sourceFile == null ? "" : sourceFile;
            int iM5687getAccessFlagspVg5ArA = classMeta.m5687getAccessFlagspVg5ArA();
            String dexDescriptor = classMeta.getDexDescriptor();
            String str2 = dexDescriptor == null ? "" : dexDescriptor;
            int iM5690getSuperClasspVg5ArA = classMeta.m5690getSuperClasspVg5ArA();
            Integer numValueOf = iM5690getSuperClasspVg5ArA == -1 ? null : Integer.valueOf(iM5690getSuperClasspVg5ArA);
            ArrayList arrayList = new ArrayList();
            int interfacesLength = classMeta.getInterfacesLength();
            for (int i = 0; i < interfacesLength; i++) {
                arrayList.add(Integer.valueOf(classMeta.interfaces(i)));
            }
            ArrayList arrayList2 = new ArrayList();
            int methodsLength = classMeta.getMethodsLength();
            for (int i2 = 0; i2 < methodsLength; i2++) {
                arrayList2.add(Integer.valueOf(classMeta.methods(i2)));
            }
            ArrayList arrayList3 = new ArrayList();
            int fieldsLength = classMeta.getFieldsLength();
            for (int i3 = 0; i3 < fieldsLength; i3++) {
                arrayList3.add(Integer.valueOf(classMeta.fields(i3)));
            }
            return new ClassData(dexKitBridge, iM5689getIdpVg5ArA, iM5688getDexIdpVg5ArA, str, iM5687getAccessFlagspVg5ArA, str2, numValueOf, arrayList, arrayList2, arrayList3, null);
        }

        private Companion() {
        }
    }

    public final /* synthetic */ FieldDataList findField(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FindField findField = new FindField();
        interfaceC0742sw.invoke(findField);
        return findField(findField);
    }

    public final /* synthetic */ MethodDataList findMethod(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FindMethod findMethod = new FindMethod();
        interfaceC0742sw.invoke(findMethod);
        return findMethod(findMethod);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 org.luckypray.dexkit.DexKitBridge)
  (r2v0 int)
  (r3v0 int)
  (r4v0 java.lang.String)
  (r5v0 int)
  (r6v0 java.lang.String)
  (r7v0 java.lang.Integer)
  (r8v0 java.util.List)
  (r9v0 java.util.List)
  (r10v0 java.util.List)
 A[MD:(org.luckypray.dexkit.DexKitBridge, int, int, java.lang.String, int, java.lang.String, java.lang.Integer, java.util.List<java.lang.Integer>, java.util.List<java.lang.Integer>, java.util.List<java.lang.Integer>):void (m)] (LINE:91) call: org.luckypray.dexkit.result.ClassData.<init>(org.luckypray.dexkit.DexKitBridge, int, int, java.lang.String, int, java.lang.String, java.lang.Integer, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ ClassData(DexKitBridge dexKitBridge, int i, int i2, String str, int i3, String str2, Integer num, List list, List list2, List list3, AbstractC0619pl abstractC0619pl) {
        this(dexKitBridge, i, i2, str, i3, str2, num, list, list2, list3);
    }
}
