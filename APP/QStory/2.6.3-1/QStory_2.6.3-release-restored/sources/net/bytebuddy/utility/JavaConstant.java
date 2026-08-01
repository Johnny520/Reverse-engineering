package net.bytebuddy.utility;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import io.ktor.util.C5043;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.AccessControllerPlugin;
import net.bytebuddy.description.enumeration.EnumerationDescription;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.TypeList;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.DoubleConstant;
import net.bytebuddy.implementation.bytecode.constant.FloatConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.constant.JavaConstantValue;
import net.bytebuddy.implementation.bytecode.constant.LongConstant;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;
import net.bytebuddy.jar.asm.ConstantDynamic;
import net.bytebuddy.jar.asm.Handle;
import net.bytebuddy.jar.asm.Type;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;
import net.bytebuddy.utility.nullability.MaybeNull;
import p025.AbstractC7012;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaConstant extends ConstantValue {

    /* JADX INFO: renamed from: net.bytebuddy.utility.JavaConstant$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static /* synthetic */ class C07551 {

        /* JADX INFO: renamed from: $SwitchMap$net$bytebuddy$utility$JavaConstant$MethodHandle$HandleType */
        static final /* synthetic */ int[] f326x3e733a24;

        static {
            int[] iArr = new int[MethodHandle.HandleType.values().length];
            f326x3e733a24 = iArr;
            try {
                iArr[MethodHandle.HandleType.GET_FIELD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f326x3e733a24[MethodHandle.HandleType.GET_STATIC_FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f326x3e733a24[MethodHandle.HandleType.PUT_FIELD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f326x3e733a24[MethodHandle.HandleType.PUT_STATIC_FIELD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    <T> T accept(Visitor<T> visitor);

    Object toDescription();

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Visitor<T> {
        T onDynamic(Dynamic dynamic);

        T onMethodHandle(MethodHandle methodHandle);

        T onMethodType(MethodType methodType);

        T onType(Simple<TypeDescription> simple);

        T onValue(Simple<?> simple);

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum NoOp implements Visitor<JavaConstant> {
            INSTANCE;

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            public /* bridge */ /* synthetic */ JavaConstant onType(Simple simple) {
                return onType2((Simple<TypeDescription>) simple);
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            public /* bridge */ /* synthetic */ JavaConstant onValue(Simple simple) {
                return onValue2((Simple<?>) simple);
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            public JavaConstant onDynamic(Dynamic dynamic) {
                return dynamic;
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            public JavaConstant onMethodHandle(MethodHandle methodHandle) {
                return methodHandle;
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            public JavaConstant onMethodType(MethodType methodType) {
                return methodType;
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            /* JADX INFO: renamed from: onType, reason: avoid collision after fix types in other method */
            public JavaConstant onType2(Simple<TypeDescription> simple) {
                return simple;
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            /* JADX INFO: renamed from: onValue, reason: avoid collision after fix types in other method */
            public JavaConstant onValue2(Simple<?> simple) {
                return simple;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class MethodType implements JavaConstant {
        private static final boolean ACCESS_CONTROLLER;
        private static final Dispatcher DISPATCHER;
        private final List<? extends TypeDescription> parameterTypes;
        private final TypeDescription returnType;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @JavaDispatcher.Proxied("java.lang.invoke.MethodType")
        public interface Dispatcher {
            @JavaDispatcher.Proxied("parameterArray")
            Class<?>[] parameterArray(Object obj);

            @JavaDispatcher.Proxied("returnType")
            Class<?> returnType(Object obj);
        }

        static {
            boolean z = false;
            try {
                Class.forName("java.security.AccessController", false, null);
                ACCESS_CONTROLLER = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
            } catch (ClassNotFoundException unused) {
                ACCESS_CONTROLLER = z;
            } catch (SecurityException unused2) {
                z = true;
                ACCESS_CONTROLLER = z;
            }
            DISPATCHER = (Dispatcher) doPrivileged(JavaDispatcher.m496of(Dispatcher.class));
        }

        public MethodType(TypeDescription typeDescription, List<? extends TypeDescription> list) {
            this.returnType = typeDescription;
            this.parameterTypes = list;
        }

        @AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(PrivilegedAction<T> privilegedAction) {
            return ACCESS_CONTROLLER ? (T) AccessController.doPrivileged(privilegedAction) : privilegedAction.run();
        }

        /* JADX INFO: renamed from: of */
        public static MethodType m487of(MethodDescription methodDescription) {
            return new MethodType((methodDescription.isConstructor() ? methodDescription.getDeclaringType() : methodDescription.getReturnType()).asErasure(), (methodDescription.isStatic() || methodDescription.isConstructor()) ? methodDescription.getParameters().asTypeList().asErasures() : CompoundList.m475of(methodDescription.getDeclaringType().asErasure(), methodDescription.getParameters().asTypeList().asErasures()));
        }

        public static MethodType ofAsm(TypePool typePool, Type type) {
            TypeDescription typeDescriptionResolve;
            if (type.getSort() != 11) {
                C5043.m9163(type, "Not a method type description: ");
                return null;
            }
            ArrayList arrayList = new ArrayList(type.getArgumentCount());
            for (Type type2 : type.getArgumentTypes()) {
                if (type2.getSort() == 9) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < type2.getDimensions(); i++) {
                        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                    }
                    sb.append(type2.getDescriptor().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                    arrayList.add(typePool.describe(sb.toString()).resolve());
                } else {
                    arrayList.add(typePool.describe(type2.getClassName()).resolve());
                }
            }
            if (type.getReturnType().getSort() == 9) {
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < type.getReturnType().getDimensions(); i2++) {
                    sb2.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                }
                sb2.append(type.getReturnType().getDescriptor().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                typeDescriptionResolve = typePool.describe(sb2.toString()).resolve();
            } else {
                typeDescriptionResolve = typePool.describe(type.getReturnType().getClassName()).resolve();
            }
            return new MethodType(typeDescriptionResolve, arrayList);
        }

        public static MethodType ofConstant(Object obj) {
            return ofConstant(obj.getClass());
        }

        public static MethodType ofGetter(FieldDescription fieldDescription) {
            return new MethodType(fieldDescription.getType().asErasure(), fieldDescription.isStatic() ? Collections.EMPTY_LIST : Collections.singletonList(fieldDescription.getDeclaringType().asErasure()));
        }

        public static MethodType ofLoaded(Object obj) {
            if (JavaType.METHOD_TYPE.isInstance(obj)) {
                Dispatcher dispatcher = DISPATCHER;
                return m484of(dispatcher.returnType(obj), dispatcher.parameterArray(obj));
            }
            C6755.m11869(AbstractC0900.m713(obj, "Expected method type object: "));
            return null;
        }

        public static MethodType ofSetter(FieldDescription fieldDescription) {
            return new MethodType(TypeDescription.ForLoadedType.m289of(Void.TYPE), fieldDescription.isStatic() ? Collections.singletonList(fieldDescription.getType().asErasure()) : Arrays.asList(fieldDescription.getDeclaringType().asErasure(), fieldDescription.getType().asErasure()));
        }

        public static MethodType ofSignature(MethodDescription methodDescription) {
            return new MethodType(methodDescription.getReturnType().asErasure(), methodDescription.getParameters().asTypeList().asErasures());
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public <T> T accept(Visitor<T> visitor) {
            return visitor.onMethodType(this);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodType)) {
                return false;
            }
            MethodType methodType = (MethodType) obj;
            return this.parameterTypes.equals(methodType.parameterTypes) && this.returnType.equals(methodType.returnType);
        }

        public String getDescriptor() {
            StringBuilder sb = new StringBuilder("(");
            Iterator<? extends TypeDescription> it = this.parameterTypes.iterator();
            while (it.hasNext()) {
                sb.append(it.next().getDescriptor());
            }
            sb.append(')');
            sb.append(this.returnType.getDescriptor());
            return sb.toString();
        }

        public TypeList getParameterTypes() {
            return new TypeList.Explicit(this.parameterTypes);
        }

        public TypeDescription getReturnType() {
            return this.returnType;
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public TypeDescription getTypeDescription() {
            return JavaType.METHOD_TYPE.getTypeStub();
        }

        public int hashCode() {
            return this.parameterTypes.hashCode() + (this.returnType.hashCode() * 31);
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public Object toDescription() {
            Object[] array = Simple.CLASS_DESC.toArray(this.parameterTypes.size());
            for (int i = 0; i < this.parameterTypes.size(); i++) {
                array[i] = Simple.CLASS_DESC.ofDescriptor(this.parameterTypes.get(i).getDescriptor());
            }
            return Simple.METHOD_TYPE_DESC.m492of(Simple.CLASS_DESC.ofDescriptor(this.returnType.getDescriptor()), array);
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public StackManipulation toStackManipulation() {
            return new JavaConstantValue(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("(");
            boolean z = true;
            for (TypeDescription typeDescription : this.parameterTypes) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(typeDescription.getSimpleName());
            }
            sb.append(')');
            sb.append(this.returnType.getSimpleName());
            return sb.toString();
        }

        public static MethodType ofConstant(Class<?> cls) {
            return ofConstant(TypeDescription.ForLoadedType.m289of(cls));
        }

        public static MethodType ofConstant(TypeDescription typeDescription) {
            return new MethodType(typeDescription, Collections.EMPTY_LIST);
        }

        public static MethodType ofSignature(Constructor<?> constructor) {
            return ofSignature(new MethodDescription.ForLoadedConstructor(constructor));
        }

        public static MethodType ofSignature(Method method) {
            return ofSignature(new MethodDescription.ForLoadedMethod(method));
        }

        public static MethodType ofGetter(Field field) {
            return ofGetter(new FieldDescription.ForLoadedField(field));
        }

        public static MethodType ofSetter(Field field) {
            return ofSetter(new FieldDescription.ForLoadedField(field));
        }

        /* JADX INFO: renamed from: of */
        public static MethodType m489of(TypeDescription typeDescription, TypeDescription... typeDescriptionArr) {
            return new MethodType(typeDescription, Arrays.asList(typeDescriptionArr));
        }

        /* JADX INFO: renamed from: of */
        public static MethodType m488of(TypeDescription typeDescription, List<? extends TypeDescription> list) {
            return new MethodType(typeDescription, list);
        }

        /* JADX INFO: renamed from: of */
        public static MethodType m486of(Method method) {
            return m487of(new MethodDescription.ForLoadedMethod(method));
        }

        /* JADX INFO: renamed from: of */
        public static MethodType m485of(Constructor<?> constructor) {
            return m487of(new MethodDescription.ForLoadedConstructor(constructor));
        }

        /* JADX INFO: renamed from: of */
        public static MethodType m484of(Class<?> cls, Class<?>... clsArr) {
            return m488of(TypeDescription.ForLoadedType.m289of(cls), new TypeList.ForLoadedTypes(clsArr));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class MethodHandle implements JavaConstant {
        private static final boolean ACCESS_CONTROLLER;
        protected static final MethodHandles METHOD_HANDLES;
        protected static final MethodHandles.Lookup METHOD_HANDLES_LOOKUP;
        protected static final MethodHandleInfo METHOD_HANDLE_INFO;
        protected static final MethodType METHOD_TYPE;
        private final HandleType handleType;
        private final String name;
        private final TypeDescription ownerType;
        private final List<? extends TypeDescription> parameterTypes;
        private final TypeDescription returnType;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @JavaDispatcher.Proxied("java.lang.invoke.MethodHandleInfo")
        public interface MethodHandleInfo {
            @JavaDispatcher.Proxied("getDeclaringClass")
            Class<?> getDeclaringClass(Object obj);

            @JavaDispatcher.Proxied("getMethodType")
            Object getMethodType(Object obj);

            @JavaDispatcher.Proxied("getName")
            String getName(Object obj);

            @JavaDispatcher.Proxied("getReferenceKind")
            int getReferenceKind(Object obj);

            @JavaDispatcher.IsConstructor
            @JavaDispatcher.Proxied("revealDirect")
            Object revealDirect(@JavaDispatcher.Proxied("java.lang.invoke.MethodHandle") Object obj);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @JavaDispatcher.Proxied("java.lang.invoke.MethodHandles")
        public interface MethodHandles {

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @JavaDispatcher.Proxied("java.lang.invoke.MethodHandles$Lookup")
            public interface Lookup {
                @JavaDispatcher.Proxied("lookupClass")
                Class<?> lookupClass(Object obj);

                @JavaDispatcher.Proxied("revealDirect")
                Object revealDirect(Object obj, @JavaDispatcher.Proxied("java.lang.invoke.MethodHandle") Object obj2);
            }

            @JavaDispatcher.IsStatic
            @JavaDispatcher.Proxied("publicLookup")
            Object publicLookup();
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @JavaDispatcher.Proxied("java.lang.invoke.MethodType")
        public interface MethodType {
            @JavaDispatcher.Proxied("parameterArray")
            Class<?>[] parameterArray(Object obj);

            @JavaDispatcher.Proxied("returnType")
            Class<?> returnType(Object obj);
        }

        static {
            boolean z = false;
            try {
                Class.forName("java.security.AccessController", false, null);
                ACCESS_CONTROLLER = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
            } catch (ClassNotFoundException unused) {
                ACCESS_CONTROLLER = z;
            } catch (SecurityException unused2) {
                z = true;
                ACCESS_CONTROLLER = z;
            }
            METHOD_HANDLE_INFO = (MethodHandleInfo) doPrivileged(JavaDispatcher.m496of(MethodHandleInfo.class));
            METHOD_TYPE = (MethodType) doPrivileged(JavaDispatcher.m496of(MethodType.class));
            METHOD_HANDLES = (MethodHandles) doPrivileged(JavaDispatcher.m496of(MethodHandles.class));
            METHOD_HANDLES_LOOKUP = (MethodHandles.Lookup) doPrivileged(JavaDispatcher.m496of(MethodHandles.Lookup.class));
        }

        public MethodHandle(HandleType handleType, TypeDescription typeDescription, String str, TypeDescription typeDescription2, List<? extends TypeDescription> list) {
            this.handleType = handleType;
            this.ownerType = typeDescription;
            this.name = str;
            this.returnType = typeDescription2;
            this.parameterTypes = list;
        }

        @AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(PrivilegedAction<T> privilegedAction) {
            return ACCESS_CONTROLLER ? (T) AccessController.doPrivileged(privilegedAction) : privilegedAction.run();
        }

        public static Class<?> lookupType(Object obj) {
            return METHOD_HANDLES_LOOKUP.lookupClass(obj);
        }

        /* JADX INFO: renamed from: of */
        public static MethodHandle m481of(MethodDescription.InDefinedShape inDefinedShape) {
            return new MethodHandle(HandleType.m483of(inDefinedShape), inDefinedShape.getDeclaringType(), inDefinedShape.getInternalName(), inDefinedShape.getReturnType().asErasure(), inDefinedShape.getParameters().asTypeList().asErasures());
        }

        public static MethodHandle ofAsm(TypePool typePool, Handle handle) {
            TypeDescription typeDescriptionResolve;
            Type methodType = Type.getMethodType(handle.getDesc());
            ArrayList arrayList = new ArrayList(methodType.getArgumentCount());
            for (Type type : methodType.getArgumentTypes()) {
                if (type.getSort() == 9) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < type.getDimensions(); i++) {
                        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                    }
                    sb.append(type.getDescriptor().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                    arrayList.add(typePool.describe(sb.toString()).resolve());
                } else {
                    arrayList.add(typePool.describe(type.getClassName()).resolve());
                }
            }
            if (methodType.getReturnType().getSort() == 9) {
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < methodType.getReturnType().getDimensions(); i2++) {
                    sb2.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                }
                sb2.append(methodType.getReturnType().getDescriptor().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                typeDescriptionResolve = typePool.describe(sb2.toString()).resolve();
            } else {
                typeDescriptionResolve = typePool.describe(methodType.getReturnType().getClassName()).resolve();
            }
            return new MethodHandle(HandleType.m482of(handle.getTag()), typePool.describe(handle.getOwner().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)).resolve(), handle.getName(), typeDescriptionResolve, arrayList);
        }

        public static MethodHandle ofGetter(FieldDescription.InDefinedShape inDefinedShape) {
            return new MethodHandle(HandleType.ofGetter(inDefinedShape), inDefinedShape.getDeclaringType().asErasure(), inDefinedShape.getInternalName(), inDefinedShape.getType().asErasure(), Collections.EMPTY_LIST);
        }

        public static MethodHandle ofLoaded(Object obj, Object obj2) {
            if (!JavaType.METHOD_HANDLE.isInstance(obj)) {
                C6755.m11869(AbstractC0900.m713(obj, "Expected method handle object: "));
                return null;
            }
            if (!JavaType.METHOD_HANDLES_LOOKUP.isInstance(obj2)) {
                C6755.m11869(AbstractC0900.m713(obj2, "Expected method handle lookup object: "));
                return null;
            }
            Object objRevealDirect = ClassFileVersion.ofThisVm(ClassFileVersion.JAVA_V8).isAtMost(ClassFileVersion.JAVA_V7) ? METHOD_HANDLE_INFO.revealDirect(obj) : METHOD_HANDLES_LOOKUP.revealDirect(obj2, obj);
            MethodHandleInfo methodHandleInfo = METHOD_HANDLE_INFO;
            Object methodType = methodHandleInfo.getMethodType(objRevealDirect);
            HandleType handleTypeM482of = HandleType.m482of(methodHandleInfo.getReferenceKind(objRevealDirect));
            TypeDescription typeDescriptionM289of = TypeDescription.ForLoadedType.m289of(methodHandleInfo.getDeclaringClass(objRevealDirect));
            String name = methodHandleInfo.getName(objRevealDirect);
            MethodType methodType2 = METHOD_TYPE;
            return new MethodHandle(handleTypeM482of, typeDescriptionM289of, name, TypeDescription.ForLoadedType.m289of(methodType2.returnType(methodType)), new TypeList.ForLoadedTypes(methodType2.parameterArray(methodType)));
        }

        public static MethodHandle ofSetter(FieldDescription.InDefinedShape inDefinedShape) {
            return new MethodHandle(HandleType.ofSetter(inDefinedShape), inDefinedShape.getDeclaringType().asErasure(), inDefinedShape.getInternalName(), TypeDescription.ForLoadedType.m289of(Void.TYPE), Collections.singletonList(inDefinedShape.getType().asErasure()));
        }

        public static MethodHandle ofSpecial(MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription) {
            if (inDefinedShape.isSpecializableFor(typeDescription)) {
                return new MethodHandle(HandleType.ofSpecial(inDefinedShape), typeDescription, inDefinedShape.getInternalName(), inDefinedShape.getReturnType().asErasure(), inDefinedShape.getParameters().asTypeList().asErasures());
            }
            C6385.m11433("Cannot specialize ", inDefinedShape, " for ", typeDescription);
            return null;
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public <T> T accept(Visitor<T> visitor) {
            return visitor.onMethodHandle(this);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodHandle)) {
                return false;
            }
            MethodHandle methodHandle = (MethodHandle) obj;
            return this.handleType == methodHandle.handleType && this.name.equals(methodHandle.name) && this.ownerType.equals(methodHandle.ownerType) && this.parameterTypes.equals(methodHandle.parameterTypes) && this.returnType.equals(methodHandle.returnType);
        }

        public String getDescriptor() {
            int i = C07551.f326x3e733a24[this.handleType.ordinal()];
            if (i == 1 || i == 2) {
                return this.returnType.getDescriptor();
            }
            if (i == 3 || i == 4) {
                return this.parameterTypes.get(0).getDescriptor();
            }
            StringBuilder sb = new StringBuilder("(");
            Iterator<? extends TypeDescription> it = this.parameterTypes.iterator();
            while (it.hasNext()) {
                sb.append(it.next().getDescriptor());
            }
            sb.append(')');
            sb.append(this.returnType.getDescriptor());
            return sb.toString();
        }

        public HandleType getHandleType() {
            return this.handleType;
        }

        public String getName() {
            return this.name;
        }

        public TypeDescription getOwnerType() {
            return this.ownerType;
        }

        public TypeList getParameterTypes() {
            return new TypeList.Explicit(this.parameterTypes);
        }

        public TypeDescription getReturnType() {
            return this.returnType;
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public TypeDescription getTypeDescription() {
            return JavaType.METHOD_HANDLE.getTypeStub();
        }

        public int hashCode() {
            return this.parameterTypes.hashCode() + AbstractC3275.m5144(this.returnType, AbstractC7012.m12131(AbstractC3275.m5144(this.ownerType, this.handleType.hashCode() * 31, 31), 31, this.name), 31);
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public Object toDescription() {
            return Simple.METHOD_HANDLE_DESC.m491of(Simple.DIRECT_METHOD_HANDLE_DESC_KIND.valueOf(this.handleType.getIdentifier(), this.ownerType.isInterface()), Simple.CLASS_DESC.ofDescriptor(this.ownerType.getDescriptor()), this.name, getDescriptor());
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public StackManipulation toStackManipulation() {
            return new JavaConstantValue(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.handleType.name());
            sb.append((!this.ownerType.isInterface() || this.handleType.isField() || this.handleType == HandleType.INVOKE_INTERFACE) ? "" : "@interface");
            sb.append('/');
            sb.append(this.ownerType.getSimpleName());
            sb.append("::");
            sb.append(this.name);
            sb.append('(');
            boolean z = true;
            for (TypeDescription typeDescription : this.parameterTypes) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(typeDescription.getSimpleName());
            }
            sb.append(')');
            sb.append(this.returnType.getSimpleName());
            return sb.toString();
        }

        public static MethodHandle ofGetter(Field field) {
            return ofGetter(new FieldDescription.ForLoadedField(field));
        }

        /* JADX INFO: renamed from: of */
        public static MethodHandle m479of(Constructor<?> constructor) {
            return m481of(new MethodDescription.ForLoadedConstructor(constructor));
        }

        /* JADX INFO: renamed from: of */
        public static MethodHandle m480of(Method method) {
            return m481of(new MethodDescription.ForLoadedMethod(method));
        }

        public static MethodHandle ofSetter(Field field) {
            return ofSetter(new FieldDescription.ForLoadedField(field));
        }

        public static MethodHandle ofSpecial(Method method, Class<?> cls) {
            return ofSpecial(new MethodDescription.ForLoadedMethod(method), TypeDescription.ForLoadedType.m289of(cls));
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum HandleType {
            INVOKE_VIRTUAL(5, false),
            INVOKE_STATIC(6, false),
            INVOKE_SPECIAL(7, false),
            INVOKE_INTERFACE(9, false),
            INVOKE_SPECIAL_CONSTRUCTOR(8, false),
            PUT_FIELD(3, true),
            GET_FIELD(1, true),
            PUT_STATIC_FIELD(4, true),
            GET_STATIC_FIELD(2, true);

            private final boolean field;
            private final int identifier;

            HandleType(int i, boolean z) {
                this.identifier = i;
                this.field = z;
            }

            /* JADX INFO: renamed from: of */
            public static HandleType m483of(MethodDescription.InDefinedShape inDefinedShape) {
                if (!inDefinedShape.isTypeInitializer()) {
                    return inDefinedShape.isStatic() ? INVOKE_STATIC : inDefinedShape.isConstructor() ? INVOKE_SPECIAL_CONSTRUCTOR : inDefinedShape.isPrivate() ? INVOKE_SPECIAL : inDefinedShape.getDeclaringType().isInterface() ? INVOKE_INTERFACE : INVOKE_VIRTUAL;
                }
                C5043.m9163(inDefinedShape, "Cannot create handle of type initializer ");
                return null;
            }

            public static HandleType ofGetter(FieldDescription.InDefinedShape inDefinedShape) {
                return inDefinedShape.isStatic() ? GET_STATIC_FIELD : GET_FIELD;
            }

            public static HandleType ofSetter(FieldDescription.InDefinedShape inDefinedShape) {
                return inDefinedShape.isStatic() ? PUT_STATIC_FIELD : PUT_FIELD;
            }

            public static HandleType ofSpecial(MethodDescription.InDefinedShape inDefinedShape) {
                if (!inDefinedShape.isStatic() && !inDefinedShape.isAbstract()) {
                    return inDefinedShape.isConstructor() ? INVOKE_SPECIAL_CONSTRUCTOR : INVOKE_SPECIAL;
                }
                C9620.m15031(inDefinedShape, "Cannot invoke ", " via invokespecial");
                return null;
            }

            public int getIdentifier() {
                return this.identifier;
            }

            public boolean isField() {
                return this.field;
            }

            /* JADX INFO: renamed from: of */
            public static HandleType m482of(int i) {
                for (HandleType handleType : values()) {
                    if (handleType.getIdentifier() == i) {
                        return handleType;
                    }
                }
                C6755.m11869(AbstractC7012.m12147(i, "Unknown handle type: "));
                return null;
            }
        }

        public static MethodHandle ofLoaded(Object obj) {
            return ofLoaded(obj, METHOD_HANDLES.publicLookup());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class Simple<T> implements JavaConstant {
        private static final boolean ACCESS_CONTROLLER;
        protected static final Dispatcher.OfClassDesc CLASS_DESC;
        protected static final Dispatcher CONSTANT_DESC;
        protected static final Dispatcher.OfDirectMethodHandleDesc DIRECT_METHOD_HANDLE_DESC;
        protected static final Dispatcher.OfDirectMethodHandleDesc.ForKind DIRECT_METHOD_HANDLE_DESC_KIND;
        protected static final Dispatcher.OfDynamicConstantDesc DYNAMIC_CONSTANT_DESC;
        protected static final Dispatcher.OfMethodHandleDesc METHOD_HANDLE_DESC;
        protected static final Dispatcher.OfMethodTypeDesc METHOD_TYPE_DESC;
        private final TypeDescription typeDescription;
        protected final T value;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @JavaDispatcher.Proxied("java.lang.constant.ConstantDesc")
        public interface Dispatcher {

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @JavaDispatcher.Proxied("java.lang.constant.ClassDesc")
            public interface OfClassDesc extends Dispatcher {
                @JavaDispatcher.Proxied("descriptorString")
                String descriptorString(Object obj);

                @JavaDispatcher.IsStatic
                @JavaDispatcher.Proxied("ofDescriptor")
                Object ofDescriptor(String str);
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @JavaDispatcher.Proxied("java.lang.constant.DirectMethodHandleDesc")
            public interface OfDirectMethodHandleDesc extends Dispatcher {

                /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
                @JavaDispatcher.Proxied("java.lang.constant.DirectMethodHandleDesc$Kind")
                public interface ForKind {
                    @JavaDispatcher.IsStatic
                    @JavaDispatcher.Proxied("valueOf")
                    Object valueOf(int i, boolean z);
                }

                @JavaDispatcher.Proxied("lookupDescriptor")
                String lookupDescriptor(Object obj);

                @JavaDispatcher.Proxied("methodName")
                String methodName(Object obj);

                @JavaDispatcher.Proxied("owner")
                Object owner(Object obj);

                @JavaDispatcher.Proxied("refKind")
                int refKind(Object obj);
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @JavaDispatcher.Proxied("java.lang.constant.DynamicConstantDesc")
            public interface OfDynamicConstantDesc extends Dispatcher {
                @JavaDispatcher.Proxied("bootstrapArgs")
                Object[] bootstrapArgs(Object obj);

                @JavaDispatcher.Proxied("bootstrapMethod")
                Object bootstrapMethod(Object obj);

                @JavaDispatcher.Proxied("constantName")
                String constantName(Object obj);

                @JavaDispatcher.Proxied("constantType")
                Object constantType(Object obj);

                @JavaDispatcher.IsStatic
                @JavaDispatcher.Proxied("ofCanonical")
                Object ofCanonical(@JavaDispatcher.Proxied("java.lang.constant.DirectMethodHandleDesc") Object obj, String str, @JavaDispatcher.Proxied("java.lang.constant.ClassDesc") Object obj2, @JavaDispatcher.Proxied("java.lang.constant.ConstantDesc") Object[] objArr);
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @JavaDispatcher.Proxied("java.lang.constant.MethodHandleDesc")
            public interface OfMethodHandleDesc extends Dispatcher {
                @JavaDispatcher.Proxied("invocationType")
                Object invocationType(Object obj);

                @JavaDispatcher.IsStatic
                @JavaDispatcher.Proxied("of")
                /* JADX INFO: renamed from: of */
                Object m491of(@JavaDispatcher.Proxied("java.lang.constant.DirectMethodHandleDesc$Kind") Object obj, @JavaDispatcher.Proxied("java.lang.constant.ClassDesc") Object obj2, String str, String str2);
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @JavaDispatcher.Proxied("java.lang.constant.MethodTypeDesc")
            public interface OfMethodTypeDesc extends Dispatcher {
                @JavaDispatcher.IsStatic
                @JavaDispatcher.Proxied("of")
                /* JADX INFO: renamed from: of */
                Object m492of(@JavaDispatcher.Proxied("java.lang.constant.ClassDesc") Object obj, @JavaDispatcher.Proxied("java.lang.constant.ClassDesc") Object[] objArr);

                @JavaDispatcher.IsStatic
                @JavaDispatcher.Proxied("ofDescriptor")
                Object ofDescriptor(String str);

                @JavaDispatcher.Proxied("parameterArray")
                Object[] parameterArray(Object obj);

                @JavaDispatcher.Proxied("returnType")
                Object returnType(Object obj);
            }

            @JavaDispatcher.Instance
            @JavaDispatcher.Proxied("isInstance")
            boolean isInstance(Object obj);

            @JavaDispatcher.Container
            @JavaDispatcher.Proxied("toArray")
            Object[] toArray(int i);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static abstract class OfTrivialValue<S> extends Simple<S> {

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public static class ForDouble extends OfTrivialValue<Double> {
                public ForDouble(Double d) {
                    super(d, TypeDescription.ForLoadedType.m289of(Double.TYPE));
                }

                @Override // net.bytebuddy.utility.ConstantValue
                public StackManipulation toStackManipulation() {
                    return DoubleConstant.forValue(((Double) this.value).doubleValue());
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public static class ForFloat extends OfTrivialValue<Float> {
                public ForFloat(Float f) {
                    super(f, TypeDescription.ForLoadedType.m289of(Float.TYPE));
                }

                @Override // net.bytebuddy.utility.ConstantValue
                public StackManipulation toStackManipulation() {
                    return FloatConstant.forValue(((Float) this.value).floatValue());
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public static class ForInteger extends OfTrivialValue<Integer> {
                public ForInteger(Integer num) {
                    super(num, TypeDescription.ForLoadedType.m289of(Integer.TYPE));
                }

                @Override // net.bytebuddy.utility.ConstantValue
                public StackManipulation toStackManipulation() {
                    return IntegerConstant.forValue(((Integer) this.value).intValue());
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public static class ForLong extends OfTrivialValue<Long> {
                public ForLong(Long l) {
                    super(l, TypeDescription.ForLoadedType.m289of(Long.TYPE));
                }

                @Override // net.bytebuddy.utility.ConstantValue
                public StackManipulation toStackManipulation() {
                    return LongConstant.forValue(((Long) this.value).longValue());
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public static class ForString extends OfTrivialValue<String> {
                public ForString(String str) {
                    super(str, TypeDescription.ForLoadedType.m289of(String.class));
                }

                @Override // net.bytebuddy.utility.ConstantValue
                public StackManipulation toStackManipulation() {
                    return new TextConstant((String) this.value);
                }
            }

            public OfTrivialValue(S s, TypeDescription typeDescription) {
                super(s, typeDescription);
            }

            @Override // net.bytebuddy.utility.JavaConstant
            public <T> T accept(Visitor<T> visitor) {
                return visitor.onValue(this);
            }

            @Override // net.bytebuddy.utility.JavaConstant
            public Object toDescription() {
                return this.value;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static class OfTypeDescription extends Simple<TypeDescription> {
            public OfTypeDescription(TypeDescription typeDescription) {
                super(typeDescription, TypeDescription.ForLoadedType.m289of(Class.class));
            }

            @Override // net.bytebuddy.utility.JavaConstant
            public <T> T accept(Visitor<T> visitor) {
                return visitor.onType(this);
            }

            @Override // net.bytebuddy.utility.JavaConstant
            public Object toDescription() {
                return Simple.CLASS_DESC.ofDescriptor(((TypeDescription) this.value).getDescriptor());
            }

            @Override // net.bytebuddy.utility.ConstantValue
            public StackManipulation toStackManipulation() {
                return ClassConstant.m442of((TypeDescription) this.value);
            }
        }

        static {
            boolean z = false;
            try {
                Class.forName("java.security.AccessController", false, null);
                ACCESS_CONTROLLER = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
            } catch (ClassNotFoundException unused) {
                ACCESS_CONTROLLER = z;
            } catch (SecurityException unused2) {
                z = true;
                ACCESS_CONTROLLER = z;
            }
            CONSTANT_DESC = (Dispatcher) doPrivileged(JavaDispatcher.m496of(Dispatcher.class));
            CLASS_DESC = (Dispatcher.OfClassDesc) doPrivileged(JavaDispatcher.m496of(Dispatcher.OfClassDesc.class));
            METHOD_TYPE_DESC = (Dispatcher.OfMethodTypeDesc) doPrivileged(JavaDispatcher.m496of(Dispatcher.OfMethodTypeDesc.class));
            METHOD_HANDLE_DESC = (Dispatcher.OfMethodHandleDesc) doPrivileged(JavaDispatcher.m496of(Dispatcher.OfMethodHandleDesc.class));
            DIRECT_METHOD_HANDLE_DESC = (Dispatcher.OfDirectMethodHandleDesc) doPrivileged(JavaDispatcher.m496of(Dispatcher.OfDirectMethodHandleDesc.class));
            DIRECT_METHOD_HANDLE_DESC_KIND = (Dispatcher.OfDirectMethodHandleDesc.ForKind) doPrivileged(JavaDispatcher.m496of(Dispatcher.OfDirectMethodHandleDesc.ForKind.class));
            DYNAMIC_CONSTANT_DESC = (Dispatcher.OfDynamicConstantDesc) doPrivileged(JavaDispatcher.m496of(Dispatcher.OfDynamicConstantDesc.class));
        }

        public Simple(T t, TypeDescription typeDescription) {
            this.value = t;
            this.typeDescription = typeDescription;
        }

        @AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(PrivilegedAction<T> privilegedAction) {
            return ACCESS_CONTROLLER ? (T) AccessController.doPrivileged(privilegedAction) : privilegedAction.run();
        }

        /* JADX INFO: renamed from: of */
        public static JavaConstant m490of(TypeDescription typeDescription) {
            if (!typeDescription.isPrimitive()) {
                return new OfTypeDescription(typeDescription);
            }
            C6755.m11869(AbstractC3275.m5132("A primitive type cannot be represented as a type constant: ", typeDescription));
            return null;
        }

        public static JavaConstant ofAsm(TypePool typePool, Object obj) {
            if (obj instanceof Integer) {
                return new OfTrivialValue.ForInteger((Integer) obj);
            }
            if (obj instanceof Long) {
                return new OfTrivialValue.ForLong((Long) obj);
            }
            if (obj instanceof Float) {
                return new OfTrivialValue.ForFloat((Float) obj);
            }
            if (obj instanceof Double) {
                return new OfTrivialValue.ForDouble((Double) obj);
            }
            if (obj instanceof String) {
                return new OfTrivialValue.ForString((String) obj);
            }
            if (!(obj instanceof Type)) {
                if (obj instanceof Handle) {
                    return MethodHandle.ofAsm(typePool, (Handle) obj);
                }
                if (obj instanceof ConstantDynamic) {
                    return Dynamic.ofAsm(typePool, (ConstantDynamic) obj);
                }
                C6755.m11869(AbstractC0900.m713(obj, "Not an ASM constant: "));
                return null;
            }
            Type type = (Type) obj;
            if (type.getSort() == 11) {
                return MethodType.ofAsm(typePool, type);
            }
            if (type.getSort() != 9) {
                return m490of(typePool.describe(type.getClassName()).resolve());
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < type.getDimensions(); i++) {
                sb.append(type.getDescriptor());
            }
            return m490of(typePool.describe(sb.toString()).resolve());
        }

        public static JavaConstant ofDescription(Object obj, TypePool typePool) {
            if (obj instanceof Integer) {
                return new OfTrivialValue.ForInteger((Integer) obj);
            }
            if (obj instanceof Long) {
                return new OfTrivialValue.ForLong((Long) obj);
            }
            if (obj instanceof Float) {
                return new OfTrivialValue.ForFloat((Float) obj);
            }
            if (obj instanceof Double) {
                return new OfTrivialValue.ForDouble((Double) obj);
            }
            if (obj instanceof String) {
                return new OfTrivialValue.ForString((String) obj);
            }
            Dispatcher.OfClassDesc ofClassDesc = CLASS_DESC;
            if (ofClassDesc.isInstance(obj)) {
                Type type = Type.getType(ofClassDesc.descriptorString(obj));
                return m490of(typePool.describe(type.getSort() == 9 ? type.getInternalName().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) : type.getClassName()).resolve());
            }
            Dispatcher.OfMethodTypeDesc ofMethodTypeDesc = METHOD_TYPE_DESC;
            int i = 0;
            if (ofMethodTypeDesc.isInstance(obj)) {
                Object[] objArrParameterArray = ofMethodTypeDesc.parameterArray(obj);
                ArrayList arrayList = new ArrayList(objArrParameterArray.length);
                int length = objArrParameterArray.length;
                while (i < length) {
                    Type type2 = Type.getType(CLASS_DESC.descriptorString(objArrParameterArray[i]));
                    arrayList.add(typePool.describe(type2.getSort() == 9 ? type2.getInternalName().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) : type2.getClassName()).resolve());
                    i++;
                }
                Type type3 = Type.getType(CLASS_DESC.descriptorString(METHOD_TYPE_DESC.returnType(obj)));
                return MethodType.m488of(typePool.describe(type3.getSort() == 9 ? type3.getInternalName().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) : type3.getClassName()).resolve(), arrayList);
            }
            Dispatcher.OfDirectMethodHandleDesc ofDirectMethodHandleDesc = DIRECT_METHOD_HANDLE_DESC;
            if (ofDirectMethodHandleDesc.isInstance(obj)) {
                Object[] objArrParameterArray2 = ofMethodTypeDesc.parameterArray(METHOD_HANDLE_DESC.invocationType(obj));
                ArrayList arrayList2 = new ArrayList(objArrParameterArray2.length);
                int length2 = objArrParameterArray2.length;
                while (i < length2) {
                    Type type4 = Type.getType(CLASS_DESC.descriptorString(objArrParameterArray2[i]));
                    arrayList2.add(typePool.describe(type4.getSort() == 9 ? type4.getInternalName().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) : type4.getClassName()).resolve());
                    i++;
                }
                Dispatcher.OfClassDesc ofClassDesc2 = CLASS_DESC;
                Type type5 = Type.getType(ofClassDesc2.descriptorString(METHOD_TYPE_DESC.returnType(METHOD_HANDLE_DESC.invocationType(obj))));
                Dispatcher.OfDirectMethodHandleDesc ofDirectMethodHandleDesc2 = DIRECT_METHOD_HANDLE_DESC;
                return new MethodHandle(MethodHandle.HandleType.m482of(ofDirectMethodHandleDesc2.refKind(obj)), typePool.describe(Type.getType(ofClassDesc2.descriptorString(ofDirectMethodHandleDesc2.owner(obj))).getClassName()).resolve(), ofDirectMethodHandleDesc2.methodName(obj), ofDirectMethodHandleDesc2.refKind(obj) == 8 ? TypeDescription.ForLoadedType.m289of(Void.TYPE) : typePool.describe(type5.getSort() == 9 ? type5.getInternalName().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) : type5.getClassName()).resolve(), arrayList2);
            }
            Dispatcher.OfDynamicConstantDesc ofDynamicConstantDesc = DYNAMIC_CONSTANT_DESC;
            if (!ofDynamicConstantDesc.isInstance(obj)) {
                C6755.m11869(AbstractC0900.m713(obj, "Not a resolvable constant description or not expressible as a constant pool value: "));
                return null;
            }
            Type methodType = Type.getMethodType(ofDirectMethodHandleDesc.lookupDescriptor(ofDynamicConstantDesc.bootstrapMethod(obj)));
            ArrayList arrayList3 = new ArrayList(methodType.getArgumentTypes().length);
            for (Type type6 : methodType.getArgumentTypes()) {
                arrayList3.add(typePool.describe(type6.getSort() == 9 ? type6.getInternalName().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) : type6.getClassName()).resolve());
            }
            Object[] objArrBootstrapArgs = DYNAMIC_CONSTANT_DESC.bootstrapArgs(obj);
            ArrayList arrayList4 = new ArrayList(objArrBootstrapArgs.length);
            int length3 = objArrBootstrapArgs.length;
            while (i < length3) {
                arrayList4.add(ofDescription(objArrBootstrapArgs[i], typePool));
                i++;
            }
            Dispatcher.OfClassDesc ofClassDesc3 = CLASS_DESC;
            Dispatcher.OfDynamicConstantDesc ofDynamicConstantDesc2 = DYNAMIC_CONSTANT_DESC;
            Type type7 = Type.getType(ofClassDesc3.descriptorString(ofDynamicConstantDesc2.constantType(obj)));
            String strConstantName = ofDynamicConstantDesc2.constantName(obj);
            TypeDescription typeDescriptionResolve = typePool.describe(type7.getSort() == 9 ? type7.getInternalName().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) : type7.getClassName()).resolve();
            Dispatcher.OfDirectMethodHandleDesc ofDirectMethodHandleDesc3 = DIRECT_METHOD_HANDLE_DESC;
            return new Dynamic(strConstantName, typeDescriptionResolve, new MethodHandle(MethodHandle.HandleType.m482of(ofDirectMethodHandleDesc3.refKind(ofDynamicConstantDesc2.bootstrapMethod(obj))), typePool.describe(Type.getType(ofClassDesc3.descriptorString(ofDirectMethodHandleDesc3.owner(ofDynamicConstantDesc2.bootstrapMethod(obj)))).getClassName()).resolve(), ofDirectMethodHandleDesc3.methodName(ofDynamicConstantDesc2.bootstrapMethod(obj)), typePool.describe(methodType.getReturnType().getSort() == 9 ? methodType.getReturnType().getInternalName().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) : methodType.getReturnType().getClassName()).resolve(), arrayList3), arrayList4);
        }

        public static JavaConstant ofLoaded(Object obj) {
            JavaConstant javaConstantOfLoadedOrNull = ofLoadedOrNull(obj);
            if (javaConstantOfLoadedOrNull != null) {
                return javaConstantOfLoadedOrNull;
            }
            C6755.m11869(AbstractC0900.m713(obj, "Not a constant: "));
            return null;
        }

        @MaybeNull
        public static JavaConstant ofLoadedOrNull(Object obj) {
            if (obj instanceof Integer) {
                return new OfTrivialValue.ForInteger((Integer) obj);
            }
            if (obj instanceof Long) {
                return new OfTrivialValue.ForLong((Long) obj);
            }
            if (obj instanceof Float) {
                return new OfTrivialValue.ForFloat((Float) obj);
            }
            if (obj instanceof Double) {
                return new OfTrivialValue.ForDouble((Double) obj);
            }
            if (obj instanceof String) {
                return new OfTrivialValue.ForString((String) obj);
            }
            if (obj instanceof Class) {
                return m490of(TypeDescription.ForLoadedType.m289of((Class) obj));
            }
            if (JavaType.METHOD_HANDLE.isInstance(obj)) {
                return MethodHandle.ofLoaded(obj);
            }
            if (JavaType.METHOD_TYPE.isInstance(obj)) {
                return MethodType.ofLoaded(obj);
            }
            return null;
        }

        public static List<JavaConstant> wrap(List<?> list) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(wrap(it.next()));
            }
            return arrayList;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.value.equals(((Simple) obj).value);
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public TypeDescription getTypeDescription() {
            return this.typeDescription;
        }

        public T getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return this.value.toString();
        }

        public static JavaConstant wrap(Object obj) {
            if (obj instanceof JavaConstant) {
                return (JavaConstant) obj;
            }
            if (obj instanceof TypeDescription) {
                return m490of((TypeDescription) obj);
            }
            return ofLoaded(obj);
        }

        public static JavaConstant ofDescription(Object obj, ClassFileLocator classFileLocator) {
            return ofDescription(obj, TypePool.Default.WithLazyResolution.m474of(classFileLocator));
        }

        public static JavaConstant ofDescription(Object obj, @MaybeNull ClassLoader classLoader) {
            return ofDescription(obj, ClassFileLocator.ForClassLoader.m309of(classLoader));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Dynamic implements JavaConstant {
        public static final String DEFAULT_NAME = "_";
        private final List<JavaConstant> arguments;
        private final MethodHandle bootstrap;
        private final String name;
        private final TypeDescription typeDescription;

        public Dynamic(String str, TypeDescription typeDescription, MethodHandle methodHandle, List<JavaConstant> list) {
            this.name = str;
            this.typeDescription = typeDescription;
            this.bootstrap = methodHandle;
            this.arguments = list;
        }

        public static Dynamic bootstrap(String str, MethodDescription.InDefinedShape inDefinedShape, List<?> list) {
            if (str.length() == 0 || str.contains(".")) {
                C6755.m11869("Not a valid field name: ".concat(str));
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Simple.wrap(it.next()));
            }
            if (inDefinedShape.isConstantBootstrap(TypeList.Explicit.m306of((List<? extends JavaConstant>) arrayList))) {
                return new Dynamic(str, inDefinedShape.isConstructor() ? inDefinedShape.getDeclaringType() : inDefinedShape.getReturnType().asErasure(), new MethodHandle(inDefinedShape.isConstructor() ? MethodHandle.HandleType.INVOKE_SPECIAL_CONSTRUCTOR : MethodHandle.HandleType.INVOKE_STATIC, inDefinedShape.getDeclaringType(), inDefinedShape.getInternalName(), inDefinedShape.getReturnType().asErasure(), inDefinedShape.getParameters().asTypeList().asErasures()), arrayList);
            }
            C6385.m11433("Not a valid bootstrap method ", inDefinedShape, " for ", list);
            return null;
        }

        public static JavaConstant ofArrayVarHandle(TypeDescription typeDescription) {
            if (typeDescription.isArray()) {
                JavaType javaType = JavaType.VAR_HANDLE;
                return new Dynamic(DEFAULT_NAME, javaType.getTypeStub(), new MethodHandle(MethodHandle.HandleType.INVOKE_STATIC, JavaType.CONSTANT_BOOTSTRAPS.getTypeStub(), "arrayVarHandle", javaType.getTypeStub(), Arrays.asList(JavaType.METHOD_HANDLES_LOOKUP.getTypeStub(), TypeDescription.ForLoadedType.m289of(String.class), TypeDescription.ForLoadedType.m289of(Class.class), TypeDescription.ForLoadedType.m289of(Class.class))), Collections.singletonList(Simple.m490of(typeDescription)));
            }
            C6755.m11869(AbstractC3275.m5132("Not an array type: ", typeDescription));
            return null;
        }

        public static Dynamic ofAsm(TypePool typePool, ConstantDynamic constantDynamic) {
            TypeDescription typeDescriptionResolve;
            Type type = Type.getType(constantDynamic.getDescriptor());
            if (type.getSort() == 9) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < type.getDimensions(); i++) {
                    sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                }
                sb.append(type.getElementType().getDescriptor().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                typeDescriptionResolve = typePool.describe(sb.toString()).resolve();
            } else {
                typeDescriptionResolve = typePool.describe(type.getClassName()).resolve();
            }
            ArrayList arrayList = new ArrayList(constantDynamic.getBootstrapMethodArgumentCount());
            for (int i2 = 0; i2 < constantDynamic.getBootstrapMethodArgumentCount(); i2++) {
                arrayList.add(Simple.ofAsm(typePool, constantDynamic.getBootstrapMethodArgument(i2)));
            }
            return new Dynamic(constantDynamic.getName(), typeDescriptionResolve, MethodHandle.ofAsm(typePool, constantDynamic.getBootstrapMethod()), arrayList);
        }

        public static JavaConstant ofEnumeration(EnumerationDescription enumerationDescription) {
            return new Dynamic(enumerationDescription.getValue(), enumerationDescription.getEnumerationType(), new MethodHandle(MethodHandle.HandleType.INVOKE_STATIC, JavaType.CONSTANT_BOOTSTRAPS.getTypeStub(), "enumConstant", TypeDescription.ForLoadedType.m289of(Enum.class), Arrays.asList(JavaType.METHOD_HANDLES_LOOKUP.getTypeStub(), TypeDescription.ForLoadedType.m289of(String.class), TypeDescription.ForLoadedType.m289of(Class.class))), Collections.EMPTY_LIST);
        }

        public static Dynamic ofField(FieldDescription.InDefinedShape inDefinedShape) {
            if (inDefinedShape.isStatic() && inDefinedShape.isFinal()) {
                boolean zEquals = inDefinedShape.getType().isPrimitive() ? inDefinedShape.getType().asErasure().asBoxed().equals(inDefinedShape.getType().asErasure()) : inDefinedShape.getDeclaringType().equals(inDefinedShape.getType().asErasure());
                return new Dynamic(inDefinedShape.getInternalName(), inDefinedShape.getType().asErasure(), new MethodHandle(MethodHandle.HandleType.INVOKE_STATIC, JavaType.CONSTANT_BOOTSTRAPS.getTypeStub(), "getStaticFinal", TypeDescription.ForLoadedType.m289of(Object.class), zEquals ? Arrays.asList(JavaType.METHOD_HANDLES_LOOKUP.getTypeStub(), TypeDescription.ForLoadedType.m289of(String.class), TypeDescription.ForLoadedType.m289of(Class.class)) : Arrays.asList(JavaType.METHOD_HANDLES_LOOKUP.getTypeStub(), TypeDescription.ForLoadedType.m289of(String.class), TypeDescription.ForLoadedType.m289of(Class.class), TypeDescription.ForLoadedType.m289of(Class.class))), zEquals ? Collections.EMPTY_LIST : Collections.singletonList(Simple.m490of(inDefinedShape.getDeclaringType())));
            }
            C5043.m9163(inDefinedShape, "Field must be static and final: ");
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        
            if ((r13.getParameters().size() + ((r13.isStatic() || r13.isConstructor()) ? 0 : 1)) <= (r14.size() + 1)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        
            if ((r13.getParameters().size() + ((r13.isStatic() || r13.isConstructor()) ? 0 : 1)) == r14.size()) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
        
            if (r13.isStatic() != false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        
            if (r13.isConstructor() == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
        
            r0 = net.bytebuddy.utility.CompoundList.m475of(r13.getDeclaringType(), r13.getParameters().asTypeList().asErasures());
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        
            r0 = r13.getParameters().asTypeList().asErasures();
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
        
            if (r13.isVarArgs() == false) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
        
            r0 = net.bytebuddy.utility.CompoundList.m477of(r0.subList(0, r0.size() - 1), java.util.Collections.nCopies((r14.size() - r0.size()) + 1, ((net.bytebuddy.description.type.TypeDescription) r0.get(r0.size() - 1)).getComponentType())).iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
        
            r0 = r0.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
        
            r6 = new java.util.ArrayList(r14.size() + 1);
            r6.add(net.bytebuddy.utility.JavaConstant.MethodHandle.m481of(r13));
            r7 = r14.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
        
            if (r7.hasNext() == false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
        
            r8 = net.bytebuddy.utility.JavaConstant.Simple.wrap(r7.next());
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
        
            if (r8.getTypeDescription().isAssignableTo((net.bytebuddy.description.type.TypeDescription) r0.next()) == false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
        
            r6.add(r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
        
            lin.xposed.hook.javaplugin.C6385.m11433("Cannot assign ", r14, " to ", r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0107, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
        
            if (r13.isConstructor() == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0110, code lost:
        
            r13 = r13.getDeclaringType();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
        
            r13 = r13.getReturnType().asErasure();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
        
            return new net.bytebuddy.utility.JavaConstant.Dynamic(net.bytebuddy.utility.JavaConstant.Dynamic.DEFAULT_NAME, r13, new net.bytebuddy.utility.JavaConstant.MethodHandle(net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_STATIC, net.bytebuddy.utility.JavaType.CONSTANT_BOOTSTRAPS.getTypeStub(), "invoke", net.bytebuddy.description.type.TypeDescription.ForLoadedType.m289of(java.lang.Object.class), java.util.Arrays.asList(net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP.getTypeStub(), net.bytebuddy.description.type.TypeDescription.ForLoadedType.m289of(java.lang.String.class), net.bytebuddy.description.type.TypeDescription.ForLoadedType.m289of(java.lang.Class.class), net.bytebuddy.utility.JavaType.METHOD_HANDLE.getTypeStub(), net.bytebuddy.description.type.TypeDescription.ArrayProjection.m287of(net.bytebuddy.description.type.TypeDescription.ForLoadedType.m289of(java.lang.Object.class)))), r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x016c, code lost:
        
            lin.xposed.hook.javaplugin.C6385.m11433("Cannot assign ", r14, " to ", r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x016f, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Dynamic ofInvocation(MethodDescription.InDefinedShape inDefinedShape, List<?> list) {
            if (!inDefinedShape.isConstructor() && inDefinedShape.getReturnType().represents(Void.TYPE)) {
                C5043.m9163(inDefinedShape, "Bootstrap method is no constructor or non-void static factory: ");
                return null;
            }
            if (inDefinedShape.isVarArgs()) {
            }
        }

        public static Dynamic ofNullConstant() {
            return new Dynamic(DEFAULT_NAME, TypeDescription.ForLoadedType.m289of(Object.class), new MethodHandle(MethodHandle.HandleType.INVOKE_STATIC, JavaType.CONSTANT_BOOTSTRAPS.getTypeStub(), "nullConstant", TypeDescription.ForLoadedType.m289of(Object.class), Arrays.asList(JavaType.METHOD_HANDLES_LOOKUP.getTypeStub(), TypeDescription.ForLoadedType.m289of(String.class), TypeDescription.ForLoadedType.m289of(Class.class))), Collections.EMPTY_LIST);
        }

        public static JavaConstant ofPrimitiveType(TypeDescription typeDescription) {
            if (typeDescription.isPrimitive()) {
                return new Dynamic(typeDescription.getDescriptor(), TypeDescription.ForLoadedType.m289of(Class.class), new MethodHandle(MethodHandle.HandleType.INVOKE_STATIC, JavaType.CONSTANT_BOOTSTRAPS.getTypeStub(), "primitiveClass", TypeDescription.ForLoadedType.m289of(Class.class), Arrays.asList(JavaType.METHOD_HANDLES_LOOKUP.getTypeStub(), TypeDescription.ForLoadedType.m289of(String.class), TypeDescription.ForLoadedType.m289of(Class.class))), Collections.EMPTY_LIST);
            }
            C6755.m11869(AbstractC3275.m5132("Not a primitive type: ", typeDescription));
            return null;
        }

        public static JavaConstant ofVarHandle(FieldDescription.InDefinedShape inDefinedShape) {
            String internalName = inDefinedShape.getInternalName();
            JavaType javaType = JavaType.VAR_HANDLE;
            return new Dynamic(internalName, javaType.getTypeStub(), new MethodHandle(MethodHandle.HandleType.INVOKE_STATIC, JavaType.CONSTANT_BOOTSTRAPS.getTypeStub(), inDefinedShape.isStatic() ? "staticFieldVarHandle" : "fieldVarHandle", javaType.getTypeStub(), Arrays.asList(JavaType.METHOD_HANDLES_LOOKUP.getTypeStub(), TypeDescription.ForLoadedType.m289of(String.class), TypeDescription.ForLoadedType.m289of(Class.class), TypeDescription.ForLoadedType.m289of(Class.class), TypeDescription.ForLoadedType.m289of(Class.class))), Arrays.asList(Simple.m490of(inDefinedShape.getDeclaringType()), Simple.m490of(inDefinedShape.getType().asErasure())));
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public <T> T accept(Visitor<T> visitor) {
            return visitor.onDynamic(this);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Dynamic dynamic = (Dynamic) obj;
            if (this.name.equals(dynamic.name) && this.typeDescription.equals(dynamic.typeDescription) && this.bootstrap.equals(dynamic.bootstrap)) {
                return this.arguments.equals(dynamic.arguments);
            }
            return false;
        }

        public List<JavaConstant> getArguments() {
            return this.arguments;
        }

        public MethodHandle getBootstrap() {
            return this.bootstrap;
        }

        public String getName() {
            return this.name;
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public TypeDescription getTypeDescription() {
            return this.typeDescription;
        }

        public int hashCode() {
            return this.arguments.hashCode() + ((this.bootstrap.hashCode() + AbstractC3275.m5144(this.typeDescription, this.name.hashCode() * 31, 31)) * 31);
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public Object toDescription() {
            Object[] array = Simple.CONSTANT_DESC.toArray(this.arguments.size());
            for (int i = 0; i < array.length; i++) {
                array[i] = this.arguments.get(i).toDescription();
            }
            Simple.Dispatcher.OfDynamicConstantDesc ofDynamicConstantDesc = Simple.DYNAMIC_CONSTANT_DESC;
            Simple.Dispatcher.OfMethodHandleDesc ofMethodHandleDesc = Simple.METHOD_HANDLE_DESC;
            Object objValueOf = Simple.DIRECT_METHOD_HANDLE_DESC_KIND.valueOf(this.bootstrap.getHandleType().getIdentifier(), this.bootstrap.getOwnerType().isInterface());
            Simple.Dispatcher.OfClassDesc ofClassDesc = Simple.CLASS_DESC;
            return ofDynamicConstantDesc.ofCanonical(ofMethodHandleDesc.m491of(objValueOf, ofClassDesc.ofDescriptor(this.bootstrap.getOwnerType().getDescriptor()), this.bootstrap.getName(), this.bootstrap.getDescriptor()), getName(), ofClassDesc.ofDescriptor(this.typeDescription.getDescriptor()), array);
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public StackManipulation toStackManipulation() {
            return new JavaConstantValue(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.bootstrap.getOwnerType().getSimpleName());
            sb.append("::");
            sb.append(this.bootstrap.getName());
            sb.append('(');
            sb.append(this.name.equals(DEFAULT_NAME) ? "" : this.name);
            sb.append('/');
            boolean z = true;
            for (JavaConstant javaConstant : this.arguments) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(javaConstant.toString());
            }
            sb.append(')');
            sb.append(this.typeDescription.getSimpleName());
            return sb.toString();
        }

        public JavaConstant withType(TypeDescription typeDescription) {
            if (typeDescription.represents(Void.TYPE)) {
                C6755.m11869("Constant value cannot represent void");
                return null;
            }
            if (!getBootstrap().getName().equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME) ? !typeDescription.asBoxed().isInHierarchyWith(getTypeDescription().asBoxed()) : !getTypeDescription().isAssignableTo(typeDescription)) {
                return new Dynamic(getName(), typeDescription, getBootstrap(), getArguments());
            }
            StringBuilder sb = new StringBuilder();
            sb.append(typeDescription);
            C6385.m11435(sb, " is not compatible with bootstrapped type ", getTypeDescription());
            return null;
        }

        public static JavaConstant ofEnumeration(Enum<?> r1) {
            return ofEnumeration(new EnumerationDescription.ForLoadedEnumeration(r1));
        }

        public static JavaConstant ofPrimitiveType(Class<?> cls) {
            return ofPrimitiveType(TypeDescription.ForLoadedType.m289of(cls));
        }

        public JavaConstant withType(Class<?> cls) {
            return withType(TypeDescription.ForLoadedType.m289of(cls));
        }

        public static JavaConstant ofArrayVarHandle(Class<?> cls) {
            return ofArrayVarHandle(TypeDescription.ForLoadedType.m289of(cls));
        }

        public static JavaConstant ofVarHandle(Field field) {
            return ofVarHandle(new FieldDescription.ForLoadedField(field));
        }

        public static Dynamic bootstrap(String str, Method method, List<?> list) {
            return bootstrap(str, new MethodDescription.ForLoadedMethod(method), list);
        }

        public static Dynamic bootstrap(String str, Constructor<?> constructor, Object... objArr) {
            return bootstrap(str, constructor, (List<?>) Arrays.asList(objArr));
        }

        public static Dynamic bootstrap(String str, Constructor<?> constructor, List<?> list) {
            return bootstrap(str, new MethodDescription.ForLoadedConstructor(constructor), list);
        }

        public static Dynamic bootstrap(String str, MethodDescription.InDefinedShape inDefinedShape, Object... objArr) {
            return bootstrap(str, inDefinedShape, (List<?>) Arrays.asList(objArr));
        }

        public static Dynamic bootstrap(String str, Method method, Object... objArr) {
            return bootstrap(str, method, (List<?>) Arrays.asList(objArr));
        }

        public static Dynamic ofField(Field field) {
            return ofField(new FieldDescription.ForLoadedField(field));
        }

        public static Dynamic ofInvocation(Method method, List<?> list) {
            return ofInvocation(new MethodDescription.ForLoadedMethod(method), list);
        }

        public static Dynamic ofInvocation(Constructor<?> constructor, Object... objArr) {
            return ofInvocation(constructor, (List<?>) Arrays.asList(objArr));
        }

        public static Dynamic ofInvocation(Constructor<?> constructor, List<?> list) {
            return ofInvocation(new MethodDescription.ForLoadedConstructor(constructor), list);
        }

        public static Dynamic ofInvocation(MethodDescription.InDefinedShape inDefinedShape, Object... objArr) {
            return ofInvocation(inDefinedShape, (List<?>) Arrays.asList(objArr));
        }

        public static Dynamic ofInvocation(Method method, Object... objArr) {
            return ofInvocation(method, (List<?>) Arrays.asList(objArr));
        }
    }
}
