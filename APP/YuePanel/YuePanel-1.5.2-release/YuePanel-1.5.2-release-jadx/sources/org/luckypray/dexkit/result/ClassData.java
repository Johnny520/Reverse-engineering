package org.luckypray.dexkit.result;

import Yue.C3879;
import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5499;
import Yue.C5689;
import Yue.C8107;
import Yue.InterfaceC4372;
import Yue.InterfaceC5124;
import Yue.InterfaceC5684;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7097;
import Yue.InterfaceC7507;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindField;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.ClassMeta;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.DexClass;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nClassData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,294:1\n1547#2:295\n1618#2,3:296\n*S KotlinDebug\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData\n*L\n201#1:295\n201#1:296,3\n*E\n"})
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 b2\u00020\u0001:\u0001bBm\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010!J&\u0010\u001f\u001a\u00020 2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020#0\"¢\u0006\u0002\b$¢\u0006\u0004\b\u001f\u0010&J\u0015\u0010(\u001a\u00020)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010*J&\u0010(\u001a\u00020)2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020#0\"¢\u0006\u0002\b$¢\u0006\u0004\b(\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.H\u0096\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010-R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u00104R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b9\u0010-R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010;R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010;R\u001b\u0010?\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001cR\u001d\u0010C\u001a\u0004\u0018\u00010\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\bF\u0010GR\u001b\u0010L\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010=\u001a\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010=\u001a\u0004\bN\u0010OR!\u0010U\u001a\b\u0012\u0004\u0012\u00020Q0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010=\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bV\u0010-R\u0011\u0010Y\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bX\u0010-R\u0011\u0010Z\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010]\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\\\u00104R\u0011\u0010_\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b^\u00104R\u0011\u0010a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b`\u00104¨\u0006c"}, d2 = {"Lorg/luckypray/dexkit/result/ClassData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "Lorg/luckypray/dexkit/DexKitBridge;", "bridge", "", Name.MARK, "dexId", "", "sourceFile", "modifiers", "descriptor", "superClassId", "", "interfaceIds", "methodIds", "fieldIds", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/ClassLoader;", "classLoader", "Ljava/lang/Class;", "getInstance", "(Ljava/lang/ClassLoader;)Ljava/lang/Class;", "getSuperClassInstance", "getInterfaceInstances", "(Ljava/lang/ClassLoader;)Ljava/util/List;", "Lorg/luckypray/dexkit/wrap/DexClass;", "toDexType", "()Lorg/luckypray/dexkit/wrap/DexClass;", "toDexClass", "Lorg/luckypray/dexkit/query/FindMethod;", "findMethod", "Lorg/luckypray/dexkit/result/MethodDataList;", "(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/MethodDataList;", "Lorg/luckypray/dexkit/query/FindField;", "findField", "Lorg/luckypray/dexkit/result/FieldDataList;", "(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/FieldDataList;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getSourceFile", "I", "getModifiers", "getDescriptor", "Ljava/lang/Integer;", "Ljava/util/List;", "dexClass$delegate", "LYue/ۥ۠ۦۨۨ;", "getDexClass", "dexClass", "superClass$delegate", "getSuperClass", "()Lorg/luckypray/dexkit/result/ClassData;", "superClass", "Lorg/luckypray/dexkit/result/ClassDataList;", "interfaces$delegate", "getInterfaces", "()Lorg/luckypray/dexkit/result/ClassDataList;", "interfaces", "methods$delegate", "getMethods", "()Lorg/luckypray/dexkit/result/MethodDataList;", "methods", "fields$delegate", "getFields", "()Lorg/luckypray/dexkit/result/FieldDataList;", "fields", "Lorg/luckypray/dexkit/result/AnnotationData;", "annotations$delegate", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "name", "getSimpleName", "simpleName", "isArray", "()Z", "getInterfaceCount", "interfaceCount", "getMethodCount", "methodCount", "getFieldCount", "fieldCount", "-Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ClassData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name and from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: annotations$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 annotations;

    @InterfaceC6399
    private final String descriptor;

    /* JADX INFO: renamed from: dexClass$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 dexClass;

    @InterfaceC6399
    private final List<Integer> fieldIds;

    /* JADX INFO: renamed from: fields$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 fields;

    @InterfaceC6399
    private final List<Integer> interfaceIds;

    /* JADX INFO: renamed from: interfaces$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 interfaces;

    @InterfaceC6399
    private final List<Integer> methodIds;

    /* JADX INFO: renamed from: methods$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 methods;
    private final int modifiers;

    @InterfaceC6399
    private final String sourceFile;

    /* JADX INFO: renamed from: superClass$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 superClass;

    @InterfaceC6489
    private final Integer superClassId;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.ClassData$-Companion, reason: invalid class name and from kotlin metadata */
    @InterfaceC6211(m2698d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, m2699d2 = {"Lorg/luckypray/dexkit/result/ClassData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/ClassData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "classMeta", "Lorg/luckypray/dexkit/schema/-ClassMeta;", "Lorg/luckypray/dexkit/InnerClassMeta;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    @InterfaceC7507({"SMAP\nClassData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$-Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n1#2:295\n*E\n"})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.ClassData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        public final ClassData from(@InterfaceC6399 DexKitBridge dexKitBridge, @InterfaceC6399 ClassMeta classMeta) {
            C5499.m17103(dexKitBridge, "bridge");
            C5499.m17103(classMeta, "classMeta");
            int iM31177getIdpVg5ArA = classMeta.m31177getIdpVg5ArA();
            int iM31176getDexIdpVg5ArA = classMeta.m31176getDexIdpVg5ArA();
            String sourceFile = classMeta.getSourceFile();
            String str = sourceFile == null ? "" : sourceFile;
            int iM31175getAccessFlagspVg5ArA = classMeta.m31175getAccessFlagspVg5ArA();
            String dexDescriptor = classMeta.getDexDescriptor();
            String str2 = dexDescriptor == null ? "" : dexDescriptor;
            int iM31178getSuperClasspVg5ArA = classMeta.m31178getSuperClasspVg5ArA();
            Integer numValueOf = iM31178getSuperClasspVg5ArA == -1 ? null : Integer.valueOf(iM31178getSuperClasspVg5ArA);
            ArrayList arrayList = new ArrayList();
            int interfacesLength = classMeta.getInterfacesLength();
            for (int i = 0; i < interfacesLength; i++) {
                arrayList.add(Integer.valueOf(classMeta.interfaces(i)));
            }
            C8107 c8107 = C8107.f3222;
            ArrayList arrayList2 = new ArrayList();
            int methodsLength = classMeta.getMethodsLength();
            for (int i2 = 0; i2 < methodsLength; i2++) {
                arrayList2.add(Integer.valueOf(classMeta.methods(i2)));
            }
            C8107 c81072 = C8107.f3222;
            ArrayList arrayList3 = new ArrayList();
            int fieldsLength = classMeta.getFieldsLength();
            for (int i3 = 0; i3 < fieldsLength; i3++) {
                arrayList3.add(Integer.valueOf(classMeta.fields(i3)));
            }
            C8107 c81073 = C8107.f3222;
            return new ClassData(dexKitBridge, iM31177getIdpVg5ArA, iM31176getDexIdpVg5ArA, str, iM31175getAccessFlagspVg5ArA, str2, numValueOf, arrayList, arrayList2, arrayList3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
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
 A[MD:(org.luckypray.dexkit.DexKitBridge, int, int, java.lang.String, int, java.lang.String, java.lang.Integer, java.util.List<java.lang.Integer>, java.util.List<java.lang.Integer>, java.util.List<java.lang.Integer>):void (m)] (LINE:1) call: org.luckypray.dexkit.result.ClassData.<init>(org.luckypray.dexkit.DexKitBridge, int, int, java.lang.String, int, java.lang.String, java.lang.Integer, java.util.List, java.util.List, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ClassData(DexKitBridge dexKitBridge, int i, int i2, String str, int i3, String str2, Integer num, List list, List list2, List list3, C4335 c4335) {
        this(dexKitBridge, i, i2, str, i3, str2, num, list, list2, list3);
    }

    private final DexClass getDexClass() {
        return (DexClass) this.dexClass.getValue();
    }

    public boolean equals(@InterfaceC6489 Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClassData) && C5499.m17094(this.descriptor, ((ClassData) other).descriptor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldDataList findField(@InterfaceC6399 FindField findField) {
        C5499.m17103(findField, "findField");
        findField.searchInClass(C3879.m10715(this));
        return getBridge().findField(findField);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodDataList findMethod(@InterfaceC6399 FindMethod findMethod) {
        C5499.m17103(findMethod, "findMethod");
        findMethod.searchInClass(C3879.m10715(this));
        return getBridge().findMethod(findMethod);
    }

    @InterfaceC6399
    public final List<AnnotationData> getAnnotations() {
        return (List) this.annotations.getValue();
    }

    @InterfaceC6399
    public final String getDescriptor() {
        return this.descriptor;
    }

    public final int getFieldCount() {
        return this.fieldIds.size();
    }

    @InterfaceC6399
    public final FieldDataList getFields() {
        return (FieldDataList) this.fields.getValue();
    }

    @InterfaceC6399
    public final Class<?> getInstance(@InterfaceC6399 ClassLoader classLoader) throws ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
        return getDexClass().getInstance(classLoader);
    }

    public final int getInterfaceCount() {
        return this.interfaceIds.size();
    }

    @InterfaceC6399
    public final List<Class<?>> getInterfaceInstances(@InterfaceC6399 ClassLoader classLoader) throws ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
        ClassDataList interfaces = getInterfaces();
        ArrayList arrayList = new ArrayList(C3881.m10756(interfaces, 10));
        Iterator<ClassData> it = interfaces.iterator();
        while (it.hasNext()) {
            arrayList.add(InstanceUtil.INSTANCE.getClassInstance(classLoader, it.next().getName()));
        }
        return arrayList;
    }

    @InterfaceC6399
    public final ClassDataList getInterfaces() {
        return (ClassDataList) this.interfaces.getValue();
    }

    public final int getMethodCount() {
        return this.methodIds.size();
    }

    @InterfaceC6399
    public final MethodDataList getMethods() {
        return (MethodDataList) this.methods.getValue();
    }

    public final int getModifiers() {
        return this.modifiers;
    }

    @InterfaceC6399
    public final String getName() {
        return getDexClass().getTypeName();
    }

    @InterfaceC6399
    public final String getSimpleName() {
        return getDexClass().getSimpleName();
    }

    @InterfaceC6399
    public final String getSourceFile() {
        return this.sourceFile;
    }

    @InterfaceC6489
    public final ClassData getSuperClass() {
        return (ClassData) this.superClass.getValue();
    }

    @InterfaceC6489
    public final Class<?> getSuperClassInstance(@InterfaceC6399 ClassLoader classLoader) throws ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
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

    @InterfaceC6399
    public final DexClass toDexClass() {
        return getDexClass();
    }

    @InterfaceC6399
    @InterfaceC4372(message = "please use toDexClass", replaceWith = @InterfaceC7097(expression = "toDexClass()", imports = {}))
    public final DexClass toDexType() {
        return getDexClass();
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۟ۥۢ۠.ۥ۟۠ۨۢ(java.lang.Iterable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, Yue.ۥۣ۠ۡ۟, int, java.lang.Object):java.lang.String */
    @InterfaceC6399
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
            sb.append(C3888.m10923(getInterfaces(), ", ", null, null, 0, null, ClassData$toString$1$2.INSTANCE, 30, null));
        }
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private ClassData(DexKitBridge dexKitBridge, int i, int i2, String str, int i3, String str2, Integer num, List<Integer> list, List<Integer> list2, List<Integer> list3) {
        super(dexKitBridge, i, i2);
        this.sourceFile = str;
        this.modifiers = i3;
        this.descriptor = str2;
        this.superClassId = num;
        this.interfaceIds = list;
        this.methodIds = list2;
        this.fieldIds = list3;
        this.dexClass = C5689.m2370(new ClassData$dexClass$2(this));
        this.superClass = C5689.m2370(new ClassData$superClass$2(this, dexKitBridge, i2));
        this.interfaces = C5689.m2370(new ClassData$interfaces$2(dexKitBridge, this, i2));
        this.methods = C5689.m2370(new ClassData$methods$2(dexKitBridge, this, i2));
        this.fields = C5689.m2370(new ClassData$fields$2(dexKitBridge, this, i2));
        this.annotations = C5689.m2370(new ClassData$annotations$2(dexKitBridge, this, i2, i));
    }

    public final /* synthetic */ FieldDataList findField(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FindField findField = new FindField();
        init.invoke(findField);
        return findField(findField);
    }

    public final /* synthetic */ MethodDataList findMethod(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FindMethod findMethod = new FindMethod();
        init.invoke(findMethod);
        return findMethod(findMethod);
    }
}
