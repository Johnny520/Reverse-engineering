package net.bytebuddy.build;

import androidx.profileinstaller.AbstractC3275;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.security.Permission;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.Plugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.modifier.FieldManifestation;
import net.bytebuddy.description.modifier.Ownership;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.Label;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.jar.asm.Type;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.JavaType;
import net.bytebuddy.utility.OpenedClassReader;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class AccessControllerPlugin extends Plugin.ForElementMatcher implements Plugin.Factory {
    private static final String ACCESS_CONTROLLER = "java.security.AccessController";
    private static final Object[] EMPTY = new Object[0];
    private static final String NAME = "ACCESS_CONTROLLER";
    private static final Map<MethodDescription.SignatureToken, MethodDescription.SignatureToken> SIGNATURES;

    @MaybeNull
    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
    private final String property;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class AccessControlWrapper implements AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {
        private final String name;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static class PrefixingMethodVisitor extends MethodVisitor {
            private final Implementation.Context.FrameGeneration frameGeneration;
            private final TypeDescription instrumentedType;
            private final String name;
            private final int offset;
            private final MethodDescription.SignatureToken token;

            public PrefixingMethodVisitor(MethodVisitor methodVisitor, TypeDescription typeDescription, MethodDescription.SignatureToken signatureToken, String str, int i, Implementation.Context.FrameGeneration frameGeneration) {
                super(OpenedClassReader.ASM_API, methodVisitor);
                this.instrumentedType = typeDescription;
                this.token = signatureToken;
                this.name = str;
                this.offset = i;
                this.frameGeneration = frameGeneration;
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitCode() {
                this.f322mv.visitCode();
                this.f322mv.visitFieldInsn(178, this.instrumentedType.getInternalName(), this.name, Type.getDescriptor(Boolean.TYPE));
                Label label = new Label();
                this.f322mv.visitJumpInsn(153, label);
                int size = this.offset;
                for (TypeDescription typeDescription : this.token.getParameterTypes()) {
                    this.f322mv.visitVarInsn(Type.getType(typeDescription.getDescriptor()).getOpcode(21), size);
                    if (typeDescription.equals(JavaType.ACCESS_CONTROL_CONTEXT.getTypeStub())) {
                        this.f322mv.visitTypeInsn(192, typeDescription.getInternalName());
                    }
                    size += typeDescription.getStackSize().getSize();
                }
                this.f322mv.visitMethodInsn(184, AccessControllerPlugin.ACCESS_CONTROLLER.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), this.token.getName(), this.token.getDescriptor(), false);
                this.f322mv.visitInsn(Type.getType(this.token.getReturnType().getDescriptor()).getOpcode(172));
                this.f322mv.visitLabel(label);
                this.frameGeneration.same(this.f322mv, this.token.getParameterTypes());
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitMaxs(int i, int i2) {
                this.f322mv.visitMaxs(Math.max(Math.max(StackSize.m433of(this.token.getParameterTypes()), this.token.getReturnType().getStackSize().getSize()), i), i2);
            }
        }

        public AccessControlWrapper(String str) {
            this.name = str;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.name.equals(((AccessControlWrapper) obj).name);
        }

        public int hashCode() {
            return this.name.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper
        public MethodVisitor wrap(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, TypePool typePool, int i, int i2) {
            MethodDescription.SignatureToken signatureToken = (MethodDescription.SignatureToken) AccessControllerPlugin.SIGNATURES.get(methodDescription.asDefined().asSignatureToken());
            if (signatureToken == null) {
                C6385.m11438(methodDescription, " does not have a method with a matching signature in java.security.AccessController");
                return null;
            }
            if (!methodDescription.isPublic() && !methodDescription.isProtected()) {
                return new PrefixingMethodVisitor(methodVisitor, typeDescription, signatureToken, this.name, !methodDescription.isStatic() ? 1 : 0, context.getFrameGeneration());
            }
            C6385.m11438(methodDescription, " is either public or protected what is not permitted to avoid context leaks");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Enhance {
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class Initializer implements ByteCodeAppender {
        private final TypeDescription instrumentedType;
        private final String name;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class WithProperty extends Initializer {
            private final String property;

            public WithProperty(TypeDescription typeDescription, String str, String str2) {
                super(typeDescription, str);
                this.property = str2;
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public boolean equals(@MaybeNull Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.property.equals(((WithProperty) obj).property);
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public int hashCode() {
                return this.property.hashCode() + (super.hashCode() * 31);
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public int onAccessController(MethodVisitor methodVisitor) {
                methodVisitor.visitLdcInsn(this.property);
                methodVisitor.visitLdcInsn("true");
                methodVisitor.visitMethodInsn(184, Type.getInternalName(System.class), "getProperty", Type.getMethodDescriptor(Type.getType((Class<?>) String.class), Type.getType((Class<?>) String.class), Type.getType((Class<?>) String.class)), false);
                methodVisitor.visitMethodInsn(184, Type.getInternalName(Boolean.class), "parseBoolean", Type.getMethodDescriptor(Type.getType((Class<?>) Boolean.TYPE), Type.getType((Class<?>) String.class)), false);
                return 2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class WithoutProperty extends Initializer {
            public WithoutProperty(TypeDescription typeDescription, String str) {
                super(typeDescription, str);
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public boolean equals(@MaybeNull Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass();
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public int hashCode() {
                return super.hashCode();
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public int onAccessController(MethodVisitor methodVisitor) {
                methodVisitor.visitInsn(4);
                return 1;
            }
        }

        public Initializer(TypeDescription typeDescription, String str) {
            this.instrumentedType = typeDescription;
            this.name = str;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Label label = new Label();
            Label label2 = new Label();
            Label label3 = new Label();
            Label label4 = new Label();
            Label label5 = new Label();
            methodVisitor.visitTryCatchBlock(label, label2, label3, Type.getInternalName(ClassNotFoundException.class));
            methodVisitor.visitTryCatchBlock(label, label2, label4, Type.getInternalName(SecurityException.class));
            methodVisitor.visitLabel(label);
            methodVisitor.visitLdcInsn(AccessControllerPlugin.ACCESS_CONTROLLER);
            methodVisitor.visitInsn(3);
            methodVisitor.visitInsn(1);
            String internalName = Type.getInternalName(Class.class);
            Type type = Type.getType((Class<?>) Class.class);
            Type type2 = Type.getType((Class<?>) String.class);
            Class cls = Boolean.TYPE;
            methodVisitor.visitMethodInsn(184, internalName, "forName", Type.getMethodDescriptor(type, type2, Type.getType((Class<?>) cls), Type.getType((Class<?>) ClassLoader.class)), false);
            methodVisitor.visitInsn(87);
            int iOnAccessController = onAccessController(methodVisitor);
            methodVisitor.visitFieldInsn(179, this.instrumentedType.getInternalName(), this.name, Type.getDescriptor(cls));
            methodVisitor.visitLabel(label2);
            methodVisitor.visitJumpInsn(167, label5);
            methodVisitor.visitLabel(label3);
            Implementation.Context.FrameGeneration frameGeneration = context.getFrameGeneration();
            TypeDescription typeDescriptionM289of = TypeDescription.ForLoadedType.m289of(ClassNotFoundException.class);
            List<? extends TypeDefinition> list = Collections.EMPTY_LIST;
            frameGeneration.same1(methodVisitor, typeDescriptionM289of, list);
            methodVisitor.visitInsn(87);
            methodVisitor.visitInsn(3);
            methodVisitor.visitFieldInsn(179, this.instrumentedType.getInternalName(), this.name, Type.getDescriptor(cls));
            methodVisitor.visitJumpInsn(167, label5);
            methodVisitor.visitLabel(label4);
            context.getFrameGeneration().same1(methodVisitor, TypeDescription.ForLoadedType.m289of(SecurityException.class), list);
            methodVisitor.visitInsn(87);
            methodVisitor.visitInsn(4);
            methodVisitor.visitFieldInsn(179, this.instrumentedType.getInternalName(), this.name, Type.getDescriptor(cls));
            methodVisitor.visitLabel(label5);
            context.getFrameGeneration().same(methodVisitor, list);
            return new ByteCodeAppender.Size(Math.max(3, iOnAccessController), 0);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Initializer initializer = (Initializer) obj;
            return this.name.equals(initializer.name) && this.instrumentedType.equals(initializer.instrumentedType);
        }

        public int hashCode() {
            return this.name.hashCode() + AbstractC3275.m5144(this.instrumentedType, getClass().hashCode() * 31, 31);
        }

        public abstract int onAccessController(MethodVisitor methodVisitor);
    }

    static {
        HashMap map = new HashMap();
        SIGNATURES = map;
        map.put(new MethodDescription.SignatureToken("doPrivileged", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedAction.class)), new MethodDescription.SignatureToken("doPrivileged", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedAction.class)));
        map.put(new MethodDescription.SignatureToken("doPrivilegedWithCombiner", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedAction.class)), new MethodDescription.SignatureToken("doPrivilegedWithCombiner", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedAction.class)));
        MethodDescription.SignatureToken signatureToken = new MethodDescription.SignatureToken("doPrivileged", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedAction.class), TypeDescription.ForLoadedType.m289of(Object.class));
        TypeDescription typeDescriptionM289of = TypeDescription.ForLoadedType.m289of(Object.class);
        TypeDescription typeDescriptionM289of2 = TypeDescription.ForLoadedType.m289of(PrivilegedAction.class);
        JavaType javaType = JavaType.ACCESS_CONTROL_CONTEXT;
        map.put(signatureToken, new MethodDescription.SignatureToken("doPrivileged", typeDescriptionM289of, typeDescriptionM289of2, javaType.getTypeStub()));
        map.put(new MethodDescription.SignatureToken("doPrivileged", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedAction.class), TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(Permission[].class)), new MethodDescription.SignatureToken("doPrivileged", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedAction.class), javaType.getTypeStub(), TypeDescription.ForLoadedType.m289of(Permission[].class)));
        map.put(new MethodDescription.SignatureToken("doPrivilegedWithCombiner", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedAction.class), TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(Permission[].class)), new MethodDescription.SignatureToken("doPrivilegedWithCombiner", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedAction.class), javaType.getTypeStub(), TypeDescription.ForLoadedType.m289of(Permission[].class)));
        map.put(new MethodDescription.SignatureToken("doPrivileged", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedExceptionAction.class)), new MethodDescription.SignatureToken("doPrivileged", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedExceptionAction.class)));
        map.put(new MethodDescription.SignatureToken("doPrivilegedWithCombiner", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedExceptionAction.class)), new MethodDescription.SignatureToken("doPrivilegedWithCombiner", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedExceptionAction.class)));
        map.put(new MethodDescription.SignatureToken("doPrivileged", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedExceptionAction.class), TypeDescription.ForLoadedType.m289of(Object.class)), new MethodDescription.SignatureToken("doPrivileged", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedExceptionAction.class), javaType.getTypeStub()));
        map.put(new MethodDescription.SignatureToken("doPrivileged", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedExceptionAction.class), TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(Permission[].class)), new MethodDescription.SignatureToken("doPrivileged", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedExceptionAction.class), javaType.getTypeStub(), TypeDescription.ForLoadedType.m289of(Permission[].class)));
        map.put(new MethodDescription.SignatureToken("doPrivilegedWithCombiner", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedExceptionAction.class), TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(Permission[].class)), new MethodDescription.SignatureToken("doPrivilegedWithCombiner", TypeDescription.ForLoadedType.m289of(Object.class), TypeDescription.ForLoadedType.m289of(PrivilegedExceptionAction.class), javaType.getTypeStub(), TypeDescription.ForLoadedType.m289of(Permission[].class)));
        map.put(new MethodDescription.SignatureToken("getContext", TypeDescription.ForLoadedType.m289of(Object.class), new TypeDescription[0]), new MethodDescription.SignatureToken("getContext", javaType.getTypeStub(), new TypeDescription[0]));
        Class cls = Void.TYPE;
        map.put(new MethodDescription.SignatureToken("checkPermission", TypeDescription.ForLoadedType.m289of(cls), TypeDescription.ForLoadedType.m289of(Permission.class)), new MethodDescription.SignatureToken("checkPermission", TypeDescription.ForLoadedType.m289of(cls), TypeDescription.ForLoadedType.m289of(Permission.class)));
    }

    @Plugin.Factory.UsingReflection.Priority(Integer.MAX_VALUE)
    public AccessControllerPlugin(@MaybeNull String str) {
        super(ElementMatchers.declaresMethod(ElementMatchers.isAnnotatedWith((Class<? extends Annotation>) Enhance.class)));
        this.property = str;
    }

    @Override // net.bytebuddy.build.Plugin
    public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        String strConcat = NAME;
        while (!typeDescription.getDeclaredFields().filter(ElementMatchers.named(strConcat)).isEmpty()) {
            strConcat = strConcat.concat("$");
        }
        DynamicType.Builder<?> builderVisit = builder.defineField(strConcat, Boolean.TYPE, Visibility.PRIVATE, Ownership.STATIC, FieldManifestation.FINAL).visit(new AsmVisitorWrapper.ForDeclaredMethods().method(ElementMatchers.isAnnotatedWith((Class<? extends Annotation>) Enhance.class), new AccessControlWrapper(strConcat)));
        String str = this.property;
        return builderVisit.initializer(str == null ? new Initializer.WithoutProperty(typeDescription, strConcat) : new Initializer.WithProperty(typeDescription, strConcat, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e A[RETURN] */
    @Override // net.bytebuddy.build.Plugin.ForElementMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.property;
        String str2 = ((AccessControllerPlugin) obj).property;
        if (str2 != null) {
            return str != null && str.equals(str2);
        }
        if (str != null) {
            return false;
        }
    }

    @Override // net.bytebuddy.build.Plugin.ForElementMatcher
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.property;
        return str != null ? str.hashCode() + iHashCode : iHashCode;
    }

    public AccessControllerPlugin() {
        this(null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // net.bytebuddy.build.Plugin.Factory
    public Plugin make() {
        return this;
    }
}
