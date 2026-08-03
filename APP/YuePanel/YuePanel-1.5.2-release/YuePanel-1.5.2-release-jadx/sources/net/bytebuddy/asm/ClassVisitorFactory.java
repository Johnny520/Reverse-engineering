package net.bytebuddy.asm;

import Yue.C6468;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.build.AccessControllerPlugin;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.modifier.FieldManifestation;
import net.bytebuddy.description.modifier.Ownership;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.loading.MultipleParentClassLoader;
import net.bytebuddy.dynamic.scaffold.TypeValidation;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.ExceptionMethod;
import net.bytebuddy.implementation.FieldAccessor;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.TypeCreation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.AnnotationVisitor;
import net.bytebuddy.jar.asm.Attribute;
import net.bytebuddy.jar.asm.ClassVisitor;
import net.bytebuddy.jar.asm.ConstantDynamic;
import net.bytebuddy.jar.asm.FieldVisitor;
import net.bytebuddy.jar.asm.Handle;
import net.bytebuddy.jar.asm.Label;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.jar.asm.ModuleVisitor;
import net.bytebuddy.jar.asm.RecordComponentVisitor;
import net.bytebuddy.jar.asm.Type;
import net.bytebuddy.jar.asm.TypePath;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.utility.OpenedClassReader;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public abstract class ClassVisitorFactory<T> {
    private static final boolean ACCESS_CONTROLLER;
    private static final String DELEGATE = "delegate";
    private static final String LABELS = "labels";
    private static final String WRAP = "wrap";
    private final Class<?> type;

    @HashCodeAndEqualsPlugin.Enhance
    public static class AttributeTranslator implements ByteCodeAppender {
        protected static final String NAME = "attribute";
        private final Class<?> sourceAttribute;
        private final TypeDescription sourceWrapper;
        private final Class<?> targetAttribute;
        private final TypeDescription targetWrapper;

        public AttributeTranslator(Class<?> cls, Class<?> cls2, TypeDescription typeDescription, TypeDescription typeDescription2) {
            this.sourceAttribute = cls;
            this.targetAttribute = cls2;
            this.sourceWrapper = typeDescription;
            this.targetWrapper = typeDescription2;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Label label = new Label();
            Label label2 = new Label();
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitJumpInsn(199, label);
            methodVisitor.visitInsn(1);
            methodVisitor.visitInsn(176);
            methodVisitor.visitLabel(label);
            context.getFrameGeneration().same(methodVisitor, methodDescription.getParameters().asTypeList());
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitTypeInsn(193, this.targetWrapper.getInternalName());
            methodVisitor.visitJumpInsn(153, label2);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitTypeInsn(192, this.targetWrapper.getInternalName());
            methodVisitor.visitFieldInsn(180, this.targetWrapper.getInternalName(), "delegate", Type.getDescriptor(this.sourceAttribute));
            methodVisitor.visitInsn(176);
            methodVisitor.visitLabel(label2);
            context.getFrameGeneration().same(methodVisitor, methodDescription.getParameters().asTypeList());
            methodVisitor.visitTypeInsn(187, this.sourceWrapper.getInternalName());
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(183, this.sourceWrapper.getInternalName(), MethodDescription.CONSTRUCTOR_INTERNAL_NAME, Type.getMethodDescriptor(Type.VOID_TYPE, Type.getType(this.targetAttribute)), false);
            methodVisitor.visitInsn(176);
            return new ByteCodeAppender.Size(3, 1);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AttributeTranslator attributeTranslator = (AttributeTranslator) obj;
            return this.sourceAttribute.equals(attributeTranslator.sourceAttribute) && this.targetAttribute.equals(attributeTranslator.targetAttribute) && this.sourceWrapper.equals(attributeTranslator.sourceWrapper) && this.targetWrapper.equals(attributeTranslator.targetWrapper);
        }

        public int hashCode() {
            return (((((((getClass().hashCode() * 31) + this.sourceAttribute.hashCode()) * 31) + this.targetAttribute.hashCode()) * 31) + this.sourceWrapper.hashCode()) * 31) + this.targetWrapper.hashCode();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ConstantArrayTranslator implements ByteCodeAppender {
        protected static final String NAME = "constants";

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Label label = new Label();
            Label label2 = new Label();
            Label label3 = new Label();
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitJumpInsn(199, label);
            methodVisitor.visitInsn(1);
            methodVisitor.visitInsn(176);
            methodVisitor.visitLabel(label);
            context.getFrameGeneration().same(methodVisitor, methodDescription.getParameters().asTypeList());
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitInsn(190);
            methodVisitor.visitTypeInsn(189, Type.getInternalName(Object.class));
            methodVisitor.visitVarInsn(58, 1);
            methodVisitor.visitInsn(3);
            methodVisitor.visitVarInsn(54, 2);
            methodVisitor.visitLabel(label2);
            context.getFrameGeneration().append(methodVisitor, Arrays.asList(TypeDescription.ForLoadedType.m5238of(Object[].class), TypeDescription.ForLoadedType.m5238of(Integer.TYPE)), methodDescription.getParameters().asTypeList());
            methodVisitor.visitVarInsn(21, 2);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitInsn(190);
            methodVisitor.visitJumpInsn(162, label3);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(21, 2);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(21, 2);
            methodVisitor.visitInsn(50);
            methodVisitor.visitMethodInsn(184, context.getInstrumentedType().getInternalName(), "constant", Type.getMethodDescriptor(Type.getType((Class<?>) Object.class), Type.getType((Class<?>) Object.class)), false);
            methodVisitor.visitInsn(83);
            methodVisitor.visitIincInsn(2, 1);
            methodVisitor.visitJumpInsn(167, label2);
            methodVisitor.visitLabel(label3);
            context.getFrameGeneration().chop(methodVisitor, 1, CompoundList.m5413of(methodDescription.getParameters().asTypeList(), TypeDescription.ForLoadedType.m5238of(Object[].class)));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitInsn(176);
            return new ByteCodeAppender.Size(4, 3);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ConstantDynamicTranslator implements ByteCodeAppender {
        protected static final String NAME = "constantDyanmic";
        private final Class<?> sourceConstantDynamic;
        private final Class<?> sourceHandle;
        private final Class<?> targetConstantDynamic;
        private final Class<?> targetHandle;

        public ConstantDynamicTranslator(Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4) {
            this.sourceConstantDynamic = cls;
            this.targetConstantDynamic = cls2;
            this.sourceHandle = cls3;
            this.targetHandle = cls4;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Label label = new Label();
            Label label2 = new Label();
            methodVisitor.visitVarInsn(25, 0);
            String internalName = Type.getInternalName(this.sourceConstantDynamic);
            Type type = Type.INT_TYPE;
            methodVisitor.visitMethodInsn(182, internalName, "getBootstrapMethodArgumentCount", Type.getMethodDescriptor(type, new Type[0]), false);
            methodVisitor.visitTypeInsn(189, Type.getInternalName(Object.class));
            methodVisitor.visitVarInsn(58, 1);
            methodVisitor.visitInsn(3);
            methodVisitor.visitVarInsn(54, 2);
            methodVisitor.visitLabel(label);
            context.getFrameGeneration().append(methodVisitor, Arrays.asList(TypeDescription.ForLoadedType.m5238of(Object[].class), TypeDescription.ForLoadedType.m5238of(Integer.TYPE)), methodDescription.getParameters().asTypeList());
            methodVisitor.visitVarInsn(21, 2);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitInsn(190);
            methodVisitor.visitJumpInsn(162, label2);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(21, 2);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(21, 2);
            methodVisitor.visitMethodInsn(182, Type.getInternalName(this.sourceConstantDynamic), "getBootstrapMethodArgument", Type.getMethodDescriptor(Type.getType((Class<?>) Object.class), type), false);
            methodVisitor.visitMethodInsn(184, context.getInstrumentedType().getInternalName(), "ldc", Type.getMethodDescriptor(Type.getType((Class<?>) Object.class), Type.getType((Class<?>) Object.class)), false);
            methodVisitor.visitInsn(83);
            methodVisitor.visitIincInsn(2, 1);
            methodVisitor.visitJumpInsn(167, label);
            methodVisitor.visitLabel(label2);
            context.getFrameGeneration().chop(methodVisitor, 1, CompoundList.m5413of(methodDescription.getParameters().asTypeList(), TypeDescription.ForLoadedType.m5238of(Object[].class)));
            methodVisitor.visitTypeInsn(187, Type.getInternalName(this.targetConstantDynamic));
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(182, Type.getInternalName(this.sourceConstantDynamic), "getName", Type.getMethodDescriptor(Type.getType((Class<?>) String.class), new Type[0]), false);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(182, Type.getInternalName(this.sourceConstantDynamic), "getDescriptor", Type.getMethodDescriptor(Type.getType((Class<?>) String.class), new Type[0]), false);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(182, Type.getInternalName(this.sourceConstantDynamic), "getBootstrapMethod", Type.getMethodDescriptor(Type.getType(this.sourceHandle), new Type[0]), false);
            methodVisitor.visitMethodInsn(184, context.getInstrumentedType().getInternalName(), "handle", Type.getMethodDescriptor(Type.getType(this.targetHandle), Type.getType(this.sourceHandle)), false);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitMethodInsn(183, Type.getInternalName(this.targetConstantDynamic), MethodDescription.CONSTRUCTOR_INTERNAL_NAME, Type.getMethodDescriptor(Type.VOID_TYPE, Type.getType((Class<?>) String.class), Type.getType((Class<?>) String.class), Type.getType(this.targetHandle), Type.getType((Class<?>) Object[].class)), false);
            methodVisitor.visitInsn(176);
            methodVisitor.visitMaxs(6, 3);
            return new ByteCodeAppender.Size(6, 3);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ConstantDynamicTranslator constantDynamicTranslator = (ConstantDynamicTranslator) obj;
            return this.sourceConstantDynamic.equals(constantDynamicTranslator.sourceConstantDynamic) && this.targetConstantDynamic.equals(constantDynamicTranslator.targetConstantDynamic) && this.sourceHandle.equals(constantDynamicTranslator.sourceHandle) && this.targetHandle.equals(constantDynamicTranslator.targetHandle);
        }

        public int hashCode() {
            return (((((((getClass().hashCode() * 31) + this.sourceConstantDynamic.hashCode()) * 31) + this.targetConstantDynamic.hashCode()) * 31) + this.sourceHandle.hashCode()) * 31) + this.targetHandle.hashCode();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ConstantTranslator implements ByteCodeAppender {
        protected static final String NAME = "constant";

        @MaybeNull
        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final Class<?> sourceConstantDynamic;

        @MaybeNull
        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final Class<?> sourceHandle;

        @MaybeNull
        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final Class<?> sourceType;

        @MaybeNull
        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final Class<?> targetConstantDynamic;

        @MaybeNull
        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final Class<?> targetHandle;

        @MaybeNull
        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final Class<?> targetType;

        public ConstantTranslator(@MaybeNull Class<?> cls, @MaybeNull Class<?> cls2, @MaybeNull Class<?> cls3, @MaybeNull Class<?> cls4, @MaybeNull Class<?> cls5, @MaybeNull Class<?> cls6) {
            this.sourceHandle = cls;
            this.targetHandle = cls2;
            this.sourceType = cls3;
            this.targetType = cls4;
            this.sourceConstantDynamic = cls5;
            this.targetConstantDynamic = cls6;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            int i;
            Label label = new Label();
            Label label2 = new Label();
            Label label3 = new Label();
            if (this.sourceType == null || this.targetType == null) {
                i = 0;
            } else {
                methodVisitor.visitVarInsn(25, 0);
                methodVisitor.visitTypeInsn(193, Type.getInternalName(this.sourceType));
                methodVisitor.visitJumpInsn(153, label);
                methodVisitor.visitVarInsn(25, 0);
                methodVisitor.visitTypeInsn(192, Type.getInternalName(this.sourceType));
                i = 0;
                methodVisitor.visitMethodInsn(182, Type.getInternalName(this.sourceType), "getDescriptor", Type.getMethodDescriptor(Type.getType((Class<?>) String.class), new Type[0]), false);
                methodVisitor.visitMethodInsn(184, Type.getInternalName(this.targetType), "getType", Type.getMethodDescriptor(Type.getType(this.targetType), Type.getType((Class<?>) String.class)), false);
                methodVisitor.visitInsn(176);
                methodVisitor.visitLabel(label);
                context.getFrameGeneration().same(methodVisitor, methodDescription.getParameters().asTypeList());
            }
            if (this.sourceHandle != null && this.targetHandle != null) {
                methodVisitor.visitVarInsn(25, i);
                methodVisitor.visitTypeInsn(193, Type.getInternalName(this.sourceHandle));
                methodVisitor.visitJumpInsn(153, label2);
                methodVisitor.visitVarInsn(25, i);
                methodVisitor.visitTypeInsn(192, Type.getInternalName(this.sourceHandle));
                methodVisitor.visitMethodInsn(184, context.getInstrumentedType().getInternalName(), "handle", Type.getMethodDescriptor(Type.getType(this.targetHandle), Type.getType(this.sourceHandle)), false);
                methodVisitor.visitInsn(176);
                methodVisitor.visitLabel(label2);
                context.getFrameGeneration().same(methodVisitor, methodDescription.getParameters().asTypeList());
            }
            if (this.sourceConstantDynamic != null && this.targetConstantDynamic != null) {
                methodVisitor.visitVarInsn(25, i);
                methodVisitor.visitTypeInsn(193, Type.getInternalName(this.sourceConstantDynamic));
                methodVisitor.visitJumpInsn(153, label3);
                methodVisitor.visitVarInsn(25, i);
                methodVisitor.visitTypeInsn(192, Type.getInternalName(this.sourceConstantDynamic));
                methodVisitor.visitMethodInsn(184, context.getInstrumentedType().getInternalName(), "constantDyanmic", Type.getMethodDescriptor(Type.getType(this.targetConstantDynamic), Type.getType(this.sourceConstantDynamic)), false);
                methodVisitor.visitInsn(176);
                methodVisitor.visitLabel(label3);
                context.getFrameGeneration().same(methodVisitor, methodDescription.getParameters().asTypeList());
            }
            methodVisitor.visitVarInsn(25, i);
            methodVisitor.visitInsn(176);
            return new ByteCodeAppender.Size(1, 1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
        
            if (r2 != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
        
            if (r2 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        
            if (r2 != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
        
            if (r2 != null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x006c, code lost:
        
            if (r2 != null) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0081 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Class<?> cls = this.sourceHandle;
            ConstantTranslator constantTranslator = (ConstantTranslator) obj;
            Class<?> cls2 = constantTranslator.sourceHandle;
            if (cls2 != null) {
                if (cls == null || !cls.equals(cls2)) {
                    return false;
                }
                Class<?> cls3 = this.targetHandle;
                Class<?> cls4 = constantTranslator.targetHandle;
                if (cls4 != null) {
                    if (cls3 == null || !cls3.equals(cls4)) {
                        return false;
                    }
                    Class<?> cls5 = this.sourceType;
                    Class<?> cls6 = constantTranslator.sourceType;
                    if (cls6 != null) {
                        if (cls5 == null || !cls5.equals(cls6)) {
                            return false;
                        }
                        Class<?> cls7 = this.targetType;
                        Class<?> cls8 = constantTranslator.targetType;
                        if (cls8 != null) {
                            if (cls7 == null || !cls7.equals(cls8)) {
                                return false;
                            }
                            Class<?> cls9 = this.sourceConstantDynamic;
                            Class<?> cls10 = constantTranslator.sourceConstantDynamic;
                            if (cls10 != null) {
                                if (cls9 == null || !cls9.equals(cls10)) {
                                    return false;
                                }
                                Class<?> cls11 = this.targetConstantDynamic;
                                Class<?> cls12 = constantTranslator.targetConstantDynamic;
                                if (cls12 != null) {
                                    return cls11 != null && cls11.equals(cls12);
                                }
                                if (cls11 != null) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public int hashCode() {
            int iHashCode = getClass().hashCode() * 31;
            Class<?> cls = this.sourceHandle;
            if (cls != null) {
                iHashCode += cls.hashCode();
            }
            int iHashCode2 = iHashCode * 31;
            Class<?> cls2 = this.targetHandle;
            if (cls2 != null) {
                iHashCode2 += cls2.hashCode();
            }
            int iHashCode3 = iHashCode2 * 31;
            Class<?> cls3 = this.sourceType;
            if (cls3 != null) {
                iHashCode3 += cls3.hashCode();
            }
            int iHashCode4 = iHashCode3 * 31;
            Class<?> cls4 = this.targetType;
            if (cls4 != null) {
                iHashCode4 += cls4.hashCode();
            }
            int iHashCode5 = iHashCode4 * 31;
            Class<?> cls5 = this.sourceConstantDynamic;
            if (cls5 != null) {
                iHashCode5 += cls5.hashCode();
            }
            int i = iHashCode5 * 31;
            Class<?> cls6 = this.targetConstantDynamic;
            return cls6 != null ? i + cls6.hashCode() : i;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class CreateClassVisitorFactory<S> implements PrivilegedAction<ClassVisitorFactory<S>> {
        private final ByteBuddy byteBuddy;
        private final Class<S> classVisitor;

        public CreateClassVisitorFactory(Class<S> cls, ByteBuddy byteBuddy) {
            this.classVisitor = cls;
            this.byteBuddy = byteBuddy;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CreateClassVisitorFactory createClassVisitorFactory = (CreateClassVisitorFactory) obj;
            return this.classVisitor.equals(createClassVisitorFactory.classVisitor) && this.byteBuddy.equals(createClassVisitorFactory.byteBuddy);
        }

        public int hashCode() {
            return (((getClass().hashCode() * 31) + this.classVisitor.hashCode()) * 31) + this.byteBuddy.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:111:0x05fd A[Catch: Exception -> 0x028e, TryCatch #3 {Exception -> 0x028e, blocks: (B:44:0x024d, B:48:0x0295, B:49:0x029d, B:52:0x02a5, B:54:0x02df, B:135:0x072c, B:58:0x0311, B:59:0x0333, B:61:0x0336, B:63:0x033c, B:65:0x0340, B:108:0x05f7, B:124:0x065d, B:126:0x0671, B:130:0x068f, B:132:0x06bb, B:134:0x0710, B:122:0x064d, B:111:0x05fd, B:113:0x0603, B:67:0x0396, B:69:0x03a0, B:71:0x03a6, B:75:0x03fb, B:77:0x0403, B:78:0x044e, B:80:0x0458, B:82:0x045c, B:83:0x049a, B:85:0x04a4, B:87:0x04aa, B:91:0x04f6, B:93:0x04fc, B:96:0x0502, B:98:0x0512, B:99:0x0550, B:100:0x0592, B:102:0x05a0, B:105:0x05ac, B:107:0x05dd, B:136:0x0753, B:137:0x07c1), top: B:165:0x024d }] */
        /* JADX WARN: Removed duplicated region for block: B:124:0x065d A[Catch: Exception -> 0x028e, TRY_ENTER, TryCatch #3 {Exception -> 0x028e, blocks: (B:44:0x024d, B:48:0x0295, B:49:0x029d, B:52:0x02a5, B:54:0x02df, B:135:0x072c, B:58:0x0311, B:59:0x0333, B:61:0x0336, B:63:0x033c, B:65:0x0340, B:108:0x05f7, B:124:0x065d, B:126:0x0671, B:130:0x068f, B:132:0x06bb, B:134:0x0710, B:122:0x064d, B:111:0x05fd, B:113:0x0603, B:67:0x0396, B:69:0x03a0, B:71:0x03a6, B:75:0x03fb, B:77:0x0403, B:78:0x044e, B:80:0x0458, B:82:0x045c, B:83:0x049a, B:85:0x04a4, B:87:0x04aa, B:91:0x04f6, B:93:0x04fc, B:96:0x0502, B:98:0x0512, B:99:0x0550, B:100:0x0592, B:102:0x05a0, B:105:0x05ac, B:107:0x05dd, B:136:0x0753, B:137:0x07c1), top: B:165:0x024d }] */
        /* JADX WARN: Removed duplicated region for block: B:130:0x068f A[Catch: Exception -> 0x028e, TryCatch #3 {Exception -> 0x028e, blocks: (B:44:0x024d, B:48:0x0295, B:49:0x029d, B:52:0x02a5, B:54:0x02df, B:135:0x072c, B:58:0x0311, B:59:0x0333, B:61:0x0336, B:63:0x033c, B:65:0x0340, B:108:0x05f7, B:124:0x065d, B:126:0x0671, B:130:0x068f, B:132:0x06bb, B:134:0x0710, B:122:0x064d, B:111:0x05fd, B:113:0x0603, B:67:0x0396, B:69:0x03a0, B:71:0x03a6, B:75:0x03fb, B:77:0x0403, B:78:0x044e, B:80:0x0458, B:82:0x045c, B:83:0x049a, B:85:0x04a4, B:87:0x04aa, B:91:0x04f6, B:93:0x04fc, B:96:0x0502, B:98:0x0512, B:99:0x0550, B:100:0x0592, B:102:0x05a0, B:105:0x05ac, B:107:0x05dd, B:136:0x0753, B:137:0x07c1), top: B:165:0x024d }] */
        /* JADX WARN: Removed duplicated region for block: B:186:0x05fb A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0403 A[Catch: Exception -> 0x028e, TryCatch #3 {Exception -> 0x028e, blocks: (B:44:0x024d, B:48:0x0295, B:49:0x029d, B:52:0x02a5, B:54:0x02df, B:135:0x072c, B:58:0x0311, B:59:0x0333, B:61:0x0336, B:63:0x033c, B:65:0x0340, B:108:0x05f7, B:124:0x065d, B:126:0x0671, B:130:0x068f, B:132:0x06bb, B:134:0x0710, B:122:0x064d, B:111:0x05fd, B:113:0x0603, B:67:0x0396, B:69:0x03a0, B:71:0x03a6, B:75:0x03fb, B:77:0x0403, B:78:0x044e, B:80:0x0458, B:82:0x045c, B:83:0x049a, B:85:0x04a4, B:87:0x04aa, B:91:0x04f6, B:93:0x04fc, B:96:0x0502, B:98:0x0512, B:99:0x0550, B:100:0x0592, B:102:0x05a0, B:105:0x05ac, B:107:0x05dd, B:136:0x0753, B:137:0x07c1), top: B:165:0x024d }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x044e A[Catch: Exception -> 0x028e, TryCatch #3 {Exception -> 0x028e, blocks: (B:44:0x024d, B:48:0x0295, B:49:0x029d, B:52:0x02a5, B:54:0x02df, B:135:0x072c, B:58:0x0311, B:59:0x0333, B:61:0x0336, B:63:0x033c, B:65:0x0340, B:108:0x05f7, B:124:0x065d, B:126:0x0671, B:130:0x068f, B:132:0x06bb, B:134:0x0710, B:122:0x064d, B:111:0x05fd, B:113:0x0603, B:67:0x0396, B:69:0x03a0, B:71:0x03a6, B:75:0x03fb, B:77:0x0403, B:78:0x044e, B:80:0x0458, B:82:0x045c, B:83:0x049a, B:85:0x04a4, B:87:0x04aa, B:91:0x04f6, B:93:0x04fc, B:96:0x0502, B:98:0x0512, B:99:0x0550, B:100:0x0592, B:102:0x05a0, B:105:0x05ac, B:107:0x05dd, B:136:0x0753, B:137:0x07c1), top: B:165:0x024d }] */
        @Override // java.security.PrivilegedAction
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ClassVisitorFactory<S> run() {
            String name;
            HashMap map;
            Iterator it;
            Class<UnsupportedOperationException> cls;
            String str;
            String str2;
            String str3;
            Class<Handle> cls2;
            String str4;
            Class<TypePath> cls3;
            String str5;
            DynamicType attributeWrapper;
            DynamicType attributeWrapper2;
            int i;
            DynamicType dynamicType;
            DynamicType dynamicType2;
            Class<Label> cls4;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            Class<Handle> cls5;
            String str13;
            Class<Attribute> cls6;
            HashMap map2;
            Class<TypePath> cls7;
            boolean z;
            Method method;
            HashMap map3;
            Class<?> cls8;
            String str14;
            Class<?> cls9;
            String str15;
            String str16;
            Class<ConstantDynamic> cls10;
            StringBuilder sb;
            DynamicType.Builder visitorBuilder;
            DynamicType.Builder visitorBuilder2;
            String str17;
            CreateClassVisitorFactory<S> createClassVisitorFactory = this;
            Class<UnsupportedOperationException> cls11 = UnsupportedOperationException.class;
            String str18 = "attribute";
            String str19 = "constants";
            String str20 = "frames";
            String str21 = "handle";
            String str22 = "typePath";
            String str23 = ClassVisitorFactory.LABELS;
            String str24 = C6468.f16552;
            Class<ConstantDynamic> cls12 = ConstantDynamic.class;
            Class<Label> cls13 = Label.class;
            Class<Attribute> cls14 = Attribute.class;
            String str25 = "delegate";
            if (!ClassVisitor.class.getSimpleName().equals(createClassVisitorFactory.classVisitor.getSimpleName())) {
                throw new IllegalArgumentException("Expected a class named " + ClassVisitor.class.getSimpleName() + ": " + createClassVisitorFactory.classVisitor);
            }
            try {
                name = createClassVisitorFactory.classVisitor.getPackage().getName();
                map = new HashMap();
                it = Arrays.asList(Attribute.class, Label.class, Type.class, TypePath.class, Handle.class, ConstantDynamic.class).iterator();
            } catch (Exception e) {
                e = e;
            }
            while (true) {
                cls = cls11;
                str = ".";
                if (!it.hasNext()) {
                    break;
                }
                String str26 = str18;
                Class cls15 = (Class) it.next();
                String str27 = str19;
                try {
                    str17 = str20;
                    try {
                        map.put(cls15, Class.forName(name + "." + cls15.getSimpleName(), false, createClassVisitorFactory.classVisitor.getClassLoader()));
                    } catch (ClassNotFoundException unused) {
                    }
                } catch (ClassNotFoundException unused2) {
                    str17 = str20;
                }
                str19 = str27;
                cls11 = cls;
                str18 = str26;
                str20 = str17;
                throw new IllegalArgumentException("Failed to generate factory for " + createClassVisitorFactory.classVisitor.getName(), e);
            }
            String str28 = str18;
            String str29 = str19;
            String str30 = str20;
            Class<Label[]> cls16 = Label[].class;
            if (map.containsKey(cls13)) {
                str2 = "constant";
                map.put(cls16, Class.forName("[L" + ((Class) map.get(cls13)).getName() + ";", false, createClassVisitorFactory.classVisitor.getClassLoader()));
            } else {
                str2 = "constant";
            }
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            Iterator it2 = Arrays.asList(ClassVisitor.class, AnnotationVisitor.class, ModuleVisitor.class, RecordComponentVisitor.class, FieldVisitor.class, MethodVisitor.class).iterator();
            while (true) {
                str3 = str21;
                cls2 = Handle.class;
                str4 = str22;
                cls3 = TypePath.class;
                str5 = str23;
                if (!it2.hasNext()) {
                    break;
                }
                Iterator it3 = it2;
                Class cls17 = (Class) it2.next();
                Class<Label[]> cls18 = cls16;
                try {
                    sb = new StringBuilder();
                    sb.append(name);
                    sb.append(str);
                    str15 = name;
                } catch (ClassNotFoundException unused3) {
                    str15 = name;
                }
                try {
                    sb.append(cls17.getSimpleName());
                    str16 = str;
                    try {
                        Class<?> cls19 = Class.forName(sb.toString(), false, createClassVisitorFactory.classVisitor.getClassLoader());
                        if (cls17 == MethodVisitor.class) {
                            visitorBuilder = ClassVisitorFactory.toMethodVisitorBuilder(createClassVisitorFactory.byteBuddy, cls17, cls19, TypePath.class, (Class) map.get(cls3), Label.class, (Class) map.get(cls13), Type.class, (Class) map.get(Type.class), Handle.class, (Class) map.get(cls2), ConstantDynamic.class, (Class) map.get(cls12));
                            visitorBuilder2 = ClassVisitorFactory.toMethodVisitorBuilder(createClassVisitorFactory.byteBuddy, cls19, cls17, (Class) map.get(cls3), TypePath.class, (Class) map.get(cls13), Label.class, (Class) map.get(Type.class), Type.class, (Class) map.get(cls2), Handle.class, (Class) map.get(cls12), ConstantDynamic.class);
                            cls10 = cls12;
                        } else {
                            ByteBuddy byteBuddy = createClassVisitorFactory.byteBuddy;
                            Class cls20 = (Class) map.get(cls3);
                            MethodReturn methodReturn = MethodReturn.VOID;
                            cls10 = cls12;
                            visitorBuilder = ClassVisitorFactory.toVisitorBuilder(byteBuddy, cls17, cls19, TypePath.class, cls20, new Implementation.Simple(methodReturn));
                            visitorBuilder2 = ClassVisitorFactory.toVisitorBuilder(createClassVisitorFactory.byteBuddy, cls19, cls17, (Class) map.get(cls3), TypePath.class, new Implementation.Simple(methodReturn));
                        }
                        map4.put(cls17, cls19);
                        map5.put(cls17, visitorBuilder);
                        map5.put(cls19, visitorBuilder2);
                    } catch (ClassNotFoundException unused4) {
                        cls10 = cls12;
                    }
                } catch (ClassNotFoundException unused5) {
                    str16 = str;
                    cls10 = cls12;
                    cls16 = cls18;
                    str21 = str3;
                    str22 = str4;
                    str23 = str5;
                    cls12 = cls10;
                    it2 = it3;
                    name = str15;
                    str = str16;
                }
                cls16 = cls18;
                str21 = str3;
                str22 = str4;
                str23 = str5;
                cls12 = cls10;
                it2 = it3;
                name = str15;
                str = str16;
                throw new IllegalArgumentException("Failed to generate factory for " + createClassVisitorFactory.classVisitor.getName(), e);
            }
            Class<Label[]> cls21 = cls16;
            ArrayList arrayList = new ArrayList();
            HashMap map6 = new HashMap();
            if (map.containsKey(cls14)) {
                try {
                    ByteBuddy byteBuddy2 = createClassVisitorFactory.byteBuddy;
                    ConstructorStrategy.Default r13 = ConstructorStrategy.Default.NO_CONSTRUCTORS;
                    DynamicType.Builder<T> builderSubclass = byteBuddy2.subclass((Class) cls14, (ConstructorStrategy) r13);
                    DynamicType.Builder<T> builderSubclass2 = createClassVisitorFactory.byteBuddy.subclass((Class) map.get(cls14), (ConstructorStrategy) r13);
                    attributeWrapper = ClassVisitorFactory.toAttributeWrapper(builderSubclass, cls14, (Class) map.get(cls14), builderSubclass.toTypeDescription(), builderSubclass2.toTypeDescription());
                    arrayList.add(attributeWrapper);
                    attributeWrapper2 = ClassVisitorFactory.toAttributeWrapper(builderSubclass2, (Class) map.get(cls14), cls14, builderSubclass2.toTypeDescription(), builderSubclass.toTypeDescription());
                    arrayList.add(attributeWrapper2);
                } catch (Exception e2) {
                    e = e2;
                    createClassVisitorFactory = this;
                }
            } else {
                attributeWrapper = null;
                attributeWrapper2 = null;
            }
            Iterator it4 = map4.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                Iterator it5 = it4;
                DynamicType.Builder builder = (DynamicType.Builder) map5.get(entry.getKey());
                DynamicType.Builder builder2 = (DynamicType.Builder) map5.get(entry.getValue());
                Method[] methods = ((Class) entry.getKey()).getMethods();
                ArrayList arrayList2 = arrayList;
                int length = methods.length;
                HashMap map7 = map6;
                DynamicType.Builder builder3 = builder;
                DynamicType.Builder builderIntercept = builder2;
                HashMap map8 = map4;
                int i2 = 0;
                while (i2 < length) {
                    Method method2 = methods[i2];
                    int i3 = length;
                    Method[] methodArr = methods;
                    Class<?> cls22 = Object.class;
                    if (method2.getDeclaringClass() == cls22) {
                        dynamicType2 = attributeWrapper;
                        i = i2;
                        dynamicType = attributeWrapper2;
                        map2 = map;
                        cls4 = cls13;
                        str6 = str28;
                        str7 = str4;
                        str8 = str5;
                        str9 = str24;
                        str10 = str29;
                        str11 = str30;
                        str12 = str3;
                        cls5 = cls2;
                        str13 = str2;
                        cls6 = cls14;
                        cls7 = cls3;
                        map3 = map8;
                    } else {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        i = i2;
                        int length2 = parameterTypes.length;
                        DynamicType.Builder builder4 = builderIntercept;
                        Class<?>[] clsArr = new Class[length2];
                        DynamicType.Builder builder5 = builder3;
                        dynamicType = attributeWrapper2;
                        ArrayList arrayList3 = new ArrayList(parameterTypes.length);
                        ArrayList arrayList4 = new ArrayList(length2);
                        dynamicType2 = attributeWrapper;
                        Class<Attribute> cls23 = cls14;
                        int i4 = 0;
                        int i5 = 1;
                        boolean z2 = false;
                        while (true) {
                            if (i4 >= parameterTypes.length) {
                                cls4 = cls13;
                                str6 = str28;
                                str7 = str4;
                                str8 = str5;
                                str9 = str24;
                                str10 = str29;
                                str11 = str30;
                                str12 = str3;
                                cls5 = cls2;
                                str13 = str2;
                                cls6 = cls23;
                                map2 = map;
                                cls7 = cls3;
                                z = false;
                                break;
                            }
                            if (entry.getKey() == MethodVisitor.class && parameterTypes[i4] == cls13) {
                                clsArr[i4] = (Class) map.get(cls13);
                                cls4 = cls13;
                                cls8 = cls22;
                                arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), clsArr[i4], str24, i5, true));
                                arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), parameterTypes[i4], str24, i5, true));
                                str6 = str28;
                                str7 = str4;
                                str8 = str5;
                                str9 = str24;
                                str10 = str29;
                                str11 = str30;
                                str12 = str3;
                                cls5 = cls2;
                                str13 = str2;
                                cls6 = cls23;
                                map2 = map;
                            } else {
                                cls8 = cls22;
                                cls4 = cls13;
                                if (entry.getKey() != MethodVisitor.class) {
                                    String str31 = str5;
                                    str9 = str24;
                                    if (parameterTypes[i4] != cls3) {
                                        clsArr[i4] = (Class) map.get(cls3);
                                        str7 = str4;
                                        str8 = str31;
                                        arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), clsArr[i4], str7, i5, false));
                                        arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), parameterTypes[i4], str7, i5, false));
                                        str6 = str28;
                                        str12 = str3;
                                        cls5 = cls2;
                                        str10 = str29;
                                        str11 = str30;
                                        cls6 = cls23;
                                        map2 = map;
                                        str13 = str2;
                                    } else {
                                        str7 = str4;
                                        str8 = str31;
                                        if (entry.getKey() == MethodVisitor.class && parameterTypes[i4] == cls2) {
                                            clsArr[i4] = (Class) map.get(cls2);
                                            str12 = str3;
                                            cls5 = cls2;
                                            arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), clsArr[i4], str12, i5, false));
                                            arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), parameterTypes[i4], str12, i5, false));
                                            str6 = str28;
                                            cls6 = cls23;
                                            map2 = map;
                                            str10 = str29;
                                            str11 = str30;
                                            str13 = str2;
                                        } else {
                                            str12 = str3;
                                            cls5 = cls2;
                                            if (entry.getKey() == MethodVisitor.class) {
                                                cls9 = cls8;
                                                if (parameterTypes[i4] == cls9) {
                                                    clsArr[i4] = cls9;
                                                    String str32 = str2;
                                                    cls7 = cls3;
                                                    arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), cls9, str32, i5, false));
                                                    arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), cls9, str32, i5, false));
                                                    cls8 = cls9;
                                                    str6 = str28;
                                                    str10 = str29;
                                                    str11 = str30;
                                                    str13 = str32;
                                                    cls6 = cls23;
                                                    map2 = map;
                                                    if (clsArr[i4] == null) {
                                                        z = true;
                                                        break;
                                                    }
                                                    Class<?> cls24 = parameterTypes[i4];
                                                    i5 += (cls24 == Long.TYPE || cls24 == Double.TYPE) ? 2 : 1;
                                                    i4++;
                                                    cls3 = cls7;
                                                    str2 = str13;
                                                    map = map2;
                                                    cls23 = cls6;
                                                    str30 = str11;
                                                    str29 = str10;
                                                    cls2 = cls5;
                                                    str28 = str6;
                                                    str3 = str12;
                                                    str24 = str9;
                                                    cls22 = cls8;
                                                    str5 = str8;
                                                    str4 = str7;
                                                    cls13 = cls4;
                                                } else {
                                                    str14 = str2;
                                                }
                                            } else {
                                                str14 = str2;
                                                cls9 = cls8;
                                            }
                                            cls7 = cls3;
                                            if (entry.getKey() == MethodVisitor.class && parameterTypes[i4] == Object[].class) {
                                                clsArr[i4] = Object[].class;
                                                cls8 = cls9;
                                                if (method2.getName().equals("visitFrame")) {
                                                    String str33 = str30;
                                                    str13 = str14;
                                                    arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), Object[].class, str33, i5, true));
                                                    arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), Object[].class, str33, i5, true));
                                                    cls6 = cls23;
                                                    map2 = map;
                                                    String str34 = str29;
                                                    str11 = str33;
                                                    str6 = str28;
                                                    str10 = str34;
                                                } else {
                                                    String str35 = str30;
                                                    str13 = str14;
                                                    String str36 = str29;
                                                    str11 = str35;
                                                    arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), Object[].class, str36, i5, false));
                                                    arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), Object[].class, str36, i5, false));
                                                    cls6 = cls23;
                                                    map2 = map;
                                                    String str37 = str28;
                                                    str10 = str36;
                                                    str6 = str37;
                                                }
                                            } else {
                                                cls8 = cls9;
                                                String str38 = str29;
                                                str11 = str30;
                                                str13 = str14;
                                                Class<?> cls25 = parameterTypes[i4];
                                                cls6 = cls23;
                                                if (cls25 == cls6) {
                                                    clsArr[i4] = (Class) map.get(cls6);
                                                    if (dynamicType2 == null || dynamicType == null) {
                                                        map2 = map;
                                                        String str39 = str28;
                                                        str10 = str38;
                                                        str6 = str39;
                                                        z2 = true;
                                                    } else {
                                                        map2 = map;
                                                        String str40 = str28;
                                                        str10 = str38;
                                                        str6 = str40;
                                                        arrayList3.add(ClassVisitorFactory.toConvertedParameter(dynamicType.getTypeDescription(), (Class) map.get(cls6), str6, i5, false));
                                                        arrayList4.add(ClassVisitorFactory.toConvertedParameter(dynamicType2.getTypeDescription(), cls6, str6, i5, false));
                                                    }
                                                } else {
                                                    map2 = map;
                                                    String str41 = str28;
                                                    str10 = str38;
                                                    str6 = str41;
                                                    clsArr[i4] = cls25;
                                                    arrayList3.add(new MethodCall.ArgumentLoader.ForMethodParameter.Factory(i4));
                                                    arrayList4.add(new MethodCall.ArgumentLoader.ForMethodParameter.Factory(i4));
                                                }
                                            }
                                            if (clsArr[i4] == null) {
                                            }
                                        }
                                    }
                                } else {
                                    Class<Label[]> cls26 = cls21;
                                    if (parameterTypes[i4] == cls26) {
                                        clsArr[i4] = (Class) map.get(cls26);
                                        cls21 = cls26;
                                        String str42 = str5;
                                        str9 = str24;
                                        arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), clsArr[i4], str42, i5, true));
                                        arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), parameterTypes[i4], str42, i5, true));
                                        str12 = str3;
                                        str7 = str4;
                                        str8 = str42;
                                        cls5 = cls2;
                                        str6 = str28;
                                        cls6 = cls23;
                                        map2 = map;
                                        str10 = str29;
                                        str11 = str30;
                                        str13 = str2;
                                    } else {
                                        cls21 = cls26;
                                        String str312 = str5;
                                        str9 = str24;
                                        if (parameterTypes[i4] != cls3) {
                                        }
                                    }
                                }
                            }
                            cls7 = cls3;
                            if (clsArr[i4] == null) {
                            }
                        }
                        if (z) {
                            method = null;
                            z2 = true;
                            if (z2) {
                                String str43 = str25;
                                MethodCall methodCallWith = MethodCall.invoke(method).onField(str43).with(arrayList3);
                                MethodCall methodCallWith2 = MethodCall.invoke(method2).onField(str43).with(arrayList4);
                                map3 = map8;
                                Class cls27 = (Class) map3.get(method2.getReturnType());
                                if (cls27 != null) {
                                    str25 = str43;
                                    methodCallWith = MethodCall.invoke((MethodDescription) ((DynamicType.Builder) map5.get(method2.getReturnType())).toTypeDescription().getDeclaredMethods().filter(ElementMatchers.named(ClassVisitorFactory.WRAP)).getOnly()).withMethodCall(methodCallWith);
                                    methodCallWith2 = MethodCall.invoke((MethodDescription) ((DynamicType.Builder) map5.get(cls27)).toTypeDescription().getDeclaredMethods().filter(ElementMatchers.named(ClassVisitorFactory.WRAP)).getOnly()).withMethodCall(methodCallWith2);
                                } else {
                                    str25 = str43;
                                }
                                DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<T> receiverTypeDefinitionIntercept = builder5.method(ElementMatchers.m5394is(method2)).intercept(methodCallWith);
                                builderIntercept = builder4.method(ElementMatchers.m5394is(method)).intercept(methodCallWith2);
                                builder3 = receiverTypeDefinitionIntercept;
                            } else {
                                DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<T> receiverTypeDefinitionIntercept2 = builder5.method(ElementMatchers.m5394is(method2)).intercept(ExceptionMethod.throwing(cls));
                                if (method != null) {
                                    builderIntercept = builder4.method(ElementMatchers.m5394is(method)).intercept(ExceptionMethod.throwing(cls));
                                    builder3 = receiverTypeDefinitionIntercept2;
                                } else {
                                    builder3 = receiverTypeDefinitionIntercept2;
                                    builderIntercept = builder4;
                                }
                                map3 = map8;
                            }
                        } else {
                            try {
                                method = ((Class) entry.getValue()).getMethod(method2.getName(), clsArr);
                            } catch (NoSuchMethodException unused6) {
                                method = null;
                                z2 = true;
                            }
                            if (z2) {
                            }
                        }
                    }
                    i2 = i + 1;
                    cls14 = cls6;
                    map8 = map3;
                    cls3 = cls7;
                    str2 = str13;
                    cls2 = cls5;
                    length = i3;
                    attributeWrapper2 = dynamicType;
                    attributeWrapper = dynamicType2;
                    map = map2;
                    str3 = str12;
                    str30 = str11;
                    str29 = str10;
                    str24 = str9;
                    str28 = str6;
                    str5 = str8;
                    methods = methodArr;
                    str4 = str7;
                    cls13 = cls4;
                }
                DynamicType dynamicType3 = attributeWrapper;
                Class<Label> cls28 = cls13;
                String str44 = str28;
                String str45 = str4;
                DynamicType.Unloaded<T> unloadedMake = builder3.make();
                DynamicType.Unloaded<T> unloadedMake2 = builderIntercept.make();
                map7.put(entry.getKey(), unloadedMake.getTypeDescription());
                map7.put(entry.getValue(), unloadedMake2.getTypeDescription());
                arrayList2.add(unloadedMake);
                arrayList2.add(unloadedMake2);
                arrayList = arrayList2;
                map6 = map7;
                cls14 = cls14;
                map4 = map8;
                cls3 = cls3;
                str2 = str2;
                cls2 = cls2;
                attributeWrapper2 = attributeWrapper2;
                attributeWrapper = dynamicType3;
                map = map;
                str3 = str3;
                str30 = str30;
                str29 = str29;
                str24 = str24;
                str28 = str44;
                str5 = str5;
                it4 = it5;
                str4 = str45;
                cls13 = cls28;
            }
            ArrayList arrayList5 = arrayList;
            HashMap map9 = map6;
            createClassVisitorFactory = this;
            ClassLoader classLoaderBuild = new MultipleParentClassLoader.Builder(false).appendMostSpecific(ClassVisitor.class, createClassVisitorFactory.classVisitor).build();
            ClassVisitorFactory<S> classVisitorFactory = (ClassVisitorFactory) createClassVisitorFactory.byteBuddy.subclass((Class) ClassVisitorFactory.class, (ConstructorStrategy) ConstructorStrategy.Default.IMITATE_SUPER_CLASS_OPENING).method(ElementMatchers.named(ClassVisitorFactory.WRAP)).intercept(MethodCall.construct((MethodDescription) ((TypeDescription) map9.get(createClassVisitorFactory.classVisitor)).getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly()).withArgument(0)).method(ElementMatchers.named("unwrap")).intercept(MethodCall.construct((MethodDescription) ((TypeDescription) map9.get(ClassVisitor.class)).getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly()).withArgument(0).withAssigner(Assigner.DEFAULT, Assigner.Typing.DYNAMIC)).make().include(arrayList5).load(classLoaderBuild).getLoaded().getConstructor(Class.class).newInstance(createClassVisitorFactory.classVisitor);
            if ((classLoaderBuild instanceof MultipleParentClassLoader) && classLoaderBuild != ClassVisitor.class.getClassLoader() && classLoaderBuild != createClassVisitorFactory.classVisitor.getClassLoader() && !((MultipleParentClassLoader) classLoaderBuild).seal()) {
                throw new IllegalStateException("Failed to seal multiple parent class loader: " + classLoaderBuild);
            }
            return classVisitorFactory;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class FrameTranslator implements ByteCodeAppender {
        protected static final String NAME = "frames";
        private final Class<?> sourceLabel;
        private final Class<?> targetLabel;

        public FrameTranslator(Class<?> cls, Class<?> cls2) {
            this.sourceLabel = cls;
            this.targetLabel = cls2;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Label label = new Label();
            Label label2 = new Label();
            Label label3 = new Label();
            Label label4 = new Label();
            Label label5 = new Label();
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitJumpInsn(199, label);
            methodVisitor.visitInsn(1);
            methodVisitor.visitInsn(176);
            methodVisitor.visitLabel(label);
            context.getFrameGeneration().same(methodVisitor, CompoundList.m5412of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitInsn(190);
            methodVisitor.visitTypeInsn(189, Type.getInternalName(Object.class));
            methodVisitor.visitVarInsn(58, 2);
            methodVisitor.visitInsn(3);
            methodVisitor.visitVarInsn(54, 3);
            methodVisitor.visitLabel(label2);
            Implementation.Context.FrameGeneration frameGeneration = context.getFrameGeneration();
            TypeDescription typeDescriptionM5238of = TypeDescription.ForLoadedType.m5238of(Object[].class);
            Class cls = Integer.TYPE;
            frameGeneration.append(methodVisitor, Arrays.asList(typeDescriptionM5238of, TypeDescription.ForLoadedType.m5238of(cls)), CompoundList.m5412of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
            methodVisitor.visitVarInsn(21, 3);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitInsn(190);
            methodVisitor.visitJumpInsn(162, label4);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitVarInsn(21, 3);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(21, 3);
            methodVisitor.visitInsn(50);
            methodVisitor.visitTypeInsn(193, Type.getInternalName(this.sourceLabel));
            methodVisitor.visitJumpInsn(153, label5);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(21, 3);
            methodVisitor.visitInsn(50);
            methodVisitor.visitTypeInsn(192, Type.getInternalName(this.sourceLabel));
            methodVisitor.visitMethodInsn(183, context.getInstrumentedType().getInternalName(), C6468.f16552, Type.getMethodDescriptor(Type.getType(this.targetLabel), Type.getType(this.sourceLabel)), false);
            methodVisitor.visitJumpInsn(167, label3);
            methodVisitor.visitLabel(label5);
            context.getFrameGeneration().full(methodVisitor, Arrays.asList(TypeDescription.ForLoadedType.m5238of(Object[].class), TypeDescription.ForLoadedType.m5238of(cls)), CompoundList.m5415of(Collections.singletonList(context.getInstrumentedType()), methodDescription.getParameters().asTypeList(), Arrays.asList(TypeDescription.ForLoadedType.m5238of(Object[].class), TypeDescription.ForLoadedType.m5238of(cls))));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(21, 3);
            methodVisitor.visitInsn(50);
            methodVisitor.visitLabel(label3);
            context.getFrameGeneration().full(methodVisitor, Arrays.asList(TypeDescription.ForLoadedType.m5238of(Object[].class), TypeDescription.ForLoadedType.m5238of(cls), TypeDescription.ForLoadedType.m5238of(Object.class)), CompoundList.m5415of(Collections.singletonList(context.getInstrumentedType()), methodDescription.getParameters().asTypeList(), Arrays.asList(TypeDescription.ForLoadedType.m5238of(Object[].class), TypeDescription.ForLoadedType.m5238of(cls))));
            methodVisitor.visitInsn(83);
            methodVisitor.visitIincInsn(3, 1);
            methodVisitor.visitJumpInsn(167, label2);
            methodVisitor.visitLabel(label4);
            context.getFrameGeneration().chop(methodVisitor, 1, CompoundList.m5415of(Collections.singletonList(context.getInstrumentedType()), methodDescription.getParameters().asTypeList(), Collections.singletonList(TypeDescription.ForLoadedType.m5238of(Object[].class))));
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitInsn(176);
            return new ByteCodeAppender.Size(5, 4);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FrameTranslator frameTranslator = (FrameTranslator) obj;
            return this.sourceLabel.equals(frameTranslator.sourceLabel) && this.targetLabel.equals(frameTranslator.targetLabel);
        }

        public int hashCode() {
            return (((getClass().hashCode() * 31) + this.sourceLabel.hashCode()) * 31) + this.targetLabel.hashCode();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class HandleTranslator implements ByteCodeAppender {
        protected static final String NAME = "handle";
        private final Class<?> sourceHandle;
        private final Class<?> targetHandle;

        public HandleTranslator(Class<?> cls, Class<?> cls2) {
            this.sourceHandle = cls;
            this.targetHandle = cls2;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Label label = new Label();
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitJumpInsn(199, label);
            methodVisitor.visitInsn(1);
            methodVisitor.visitInsn(176);
            methodVisitor.visitLabel(label);
            context.getFrameGeneration().same(methodVisitor, methodDescription.getParameters().asTypeList());
            methodVisitor.visitTypeInsn(187, Type.getInternalName(this.targetHandle));
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(25, 0);
            String internalName = Type.getInternalName(this.sourceHandle);
            Type type = Type.INT_TYPE;
            methodVisitor.visitMethodInsn(182, internalName, "getTag", Type.getMethodDescriptor(type, new Type[0]), false);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(182, Type.getInternalName(this.sourceHandle), "getOwner", Type.getMethodDescriptor(Type.getType((Class<?>) String.class), new Type[0]), false);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(182, Type.getInternalName(this.sourceHandle), "getName", Type.getMethodDescriptor(Type.getType((Class<?>) String.class), new Type[0]), false);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(182, Type.getInternalName(this.sourceHandle), "getDesc", Type.getMethodDescriptor(Type.getType((Class<?>) String.class), new Type[0]), false);
            methodVisitor.visitVarInsn(25, 0);
            String internalName2 = Type.getInternalName(this.sourceHandle);
            Type type2 = Type.BOOLEAN_TYPE;
            methodVisitor.visitMethodInsn(182, internalName2, "isInterface", Type.getMethodDescriptor(type2, new Type[0]), false);
            methodVisitor.visitMethodInsn(183, Type.getInternalName(this.targetHandle), MethodDescription.CONSTRUCTOR_INTERNAL_NAME, Type.getMethodDescriptor(Type.VOID_TYPE, type, Type.getType((Class<?>) String.class), Type.getType((Class<?>) String.class), Type.getType((Class<?>) String.class), type2), false);
            methodVisitor.visitInsn(176);
            return new ByteCodeAppender.Size(7, 1);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            HandleTranslator handleTranslator = (HandleTranslator) obj;
            return this.sourceHandle.equals(handleTranslator.sourceHandle) && this.targetHandle.equals(handleTranslator.targetHandle);
        }

        public int hashCode() {
            return (((getClass().hashCode() * 31) + this.sourceHandle.hashCode()) * 31) + this.targetHandle.hashCode();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class LabelArrayTranslator implements ByteCodeAppender {
        protected static final String NAME = "labels";
        private final Class<?> sourceLabel;
        private final Class<?> targetLabel;

        public LabelArrayTranslator(Class<?> cls, Class<?> cls2) {
            this.sourceLabel = cls;
            this.targetLabel = cls2;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Label label = new Label();
            Label label2 = new Label();
            Label label3 = new Label();
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitJumpInsn(199, label);
            methodVisitor.visitInsn(1);
            methodVisitor.visitInsn(176);
            methodVisitor.visitLabel(label);
            context.getFrameGeneration().same(methodVisitor, CompoundList.m5412of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitInsn(190);
            methodVisitor.visitTypeInsn(189, Type.getInternalName(this.targetLabel));
            methodVisitor.visitVarInsn(58, 2);
            methodVisitor.visitInsn(3);
            methodVisitor.visitVarInsn(54, 3);
            methodVisitor.visitLabel(label2);
            context.getFrameGeneration().append(methodVisitor, Arrays.asList(TypeDescription.ArrayProjection.m5236of(TypeDescription.ForLoadedType.m5238of(this.targetLabel)), TypeDescription.ForLoadedType.m5238of(Integer.TYPE)), CompoundList.m5412of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
            methodVisitor.visitVarInsn(21, 3);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitInsn(190);
            methodVisitor.visitJumpInsn(162, label3);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitVarInsn(21, 3);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(21, 3);
            methodVisitor.visitInsn(50);
            methodVisitor.visitMethodInsn(183, context.getInstrumentedType().getInternalName(), C6468.f16552, Type.getMethodDescriptor(Type.getType(this.targetLabel), Type.getType(this.sourceLabel)), false);
            methodVisitor.visitInsn(83);
            methodVisitor.visitIincInsn(3, 1);
            methodVisitor.visitJumpInsn(167, label2);
            methodVisitor.visitLabel(label3);
            context.getFrameGeneration().chop(methodVisitor, 1, CompoundList.m5415of(Collections.singletonList(context.getInstrumentedType()), methodDescription.getParameters().asTypeList(), Collections.singletonList(TypeDescription.ArrayProjection.m5236of(TypeDescription.ForLoadedType.m5238of(this.targetLabel)))));
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitInsn(176);
            return new ByteCodeAppender.Size(5, 4);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LabelArrayTranslator labelArrayTranslator = (LabelArrayTranslator) obj;
            return this.sourceLabel.equals(labelArrayTranslator.sourceLabel) && this.targetLabel.equals(labelArrayTranslator.targetLabel);
        }

        public int hashCode() {
            return (((getClass().hashCode() * 31) + this.sourceLabel.hashCode()) * 31) + this.targetLabel.hashCode();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class LabelTranslator implements ByteCodeAppender {
        protected static final String NAME = "label";
        private final Class<?> target;

        public LabelTranslator(Class<?> cls) {
            this.target = cls;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Label label = new Label();
            Label label2 = new Label();
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitJumpInsn(199, label);
            methodVisitor.visitInsn(1);
            methodVisitor.visitInsn(176);
            methodVisitor.visitLabel(label);
            context.getFrameGeneration().same(methodVisitor, CompoundList.m5412of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitFieldInsn(180, context.getInstrumentedType().getInternalName(), ClassVisitorFactory.LABELS, Type.getDescriptor(Map.class));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitMethodInsn(185, Type.getInternalName(Map.class), "get", Type.getMethodDescriptor(Type.getType((Class<?>) Object.class), Type.getType((Class<?>) Object.class)), true);
            methodVisitor.visitTypeInsn(192, Type.getInternalName(this.target));
            methodVisitor.visitVarInsn(58, 2);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitJumpInsn(199, label2);
            methodVisitor.visitTypeInsn(187, Type.getInternalName(this.target));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, Type.getInternalName(this.target), MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", false);
            methodVisitor.visitVarInsn(58, 2);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitFieldInsn(180, context.getInstrumentedType().getInternalName(), ClassVisitorFactory.LABELS, Type.getDescriptor(Map.class));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitMethodInsn(185, Type.getInternalName(Map.class), "put", Type.getMethodDescriptor(Type.getType((Class<?>) Object.class), Type.getType((Class<?>) Object.class), Type.getType((Class<?>) Object.class)), true);
            methodVisitor.visitInsn(87);
            methodVisitor.visitLabel(label2);
            context.getFrameGeneration().append(methodVisitor, Collections.singletonList(TypeDescription.ForLoadedType.m5238of(this.target)), CompoundList.m5412of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitInsn(176);
            return new ByteCodeAppender.Size(3, 3);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.target.equals(((LabelTranslator) obj).target);
        }

        public int hashCode() {
            return (getClass().hashCode() * 31) + this.target.hashCode();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class NullCheckedConstruction implements ByteCodeAppender {
        private final Class<?> type;

        public NullCheckedConstruction(Class<?> cls) {
            this.type = cls;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            methodVisitor.visitVarInsn(25, 0);
            Label label = new Label();
            methodVisitor.visitJumpInsn(198, label);
            methodVisitor.visitTypeInsn(187, context.getInstrumentedType().getInternalName());
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(183, context.getInstrumentedType().getInternalName(), MethodDescription.CONSTRUCTOR_INTERNAL_NAME, Type.getMethodDescriptor(Type.VOID_TYPE, Type.getType(this.type)), false);
            methodVisitor.visitInsn(176);
            methodVisitor.visitLabel(label);
            context.getFrameGeneration().same(methodVisitor, methodDescription.getParameters().asTypeList());
            methodVisitor.visitInsn(1);
            methodVisitor.visitInsn(176);
            return new ByteCodeAppender.Size(3, 1);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.type.equals(((NullCheckedConstruction) obj).type);
        }

        public int hashCode() {
            return (getClass().hashCode() * 31) + this.type.hashCode();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class TypePathTranslator implements ByteCodeAppender {
        protected static final String NAME = "typePath";
        private final Class<?> sourceTypePath;
        private final Class<?> targetTypePath;

        public TypePathTranslator(Class<?> cls, Class<?> cls2) {
            this.sourceTypePath = cls;
            this.targetTypePath = cls2;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Label label = new Label();
            Label label2 = new Label();
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitJumpInsn(199, label);
            methodVisitor.visitInsn(1);
            methodVisitor.visitJumpInsn(167, label2);
            context.getFrameGeneration().same(methodVisitor, methodDescription.getParameters().asTypeList());
            methodVisitor.visitLabel(label);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(182, Type.getInternalName(this.sourceTypePath), "toString", Type.getMethodDescriptor(Type.getType((Class<?>) String.class), new Type[0]), false);
            methodVisitor.visitMethodInsn(184, Type.getInternalName(this.targetTypePath), "fromString", Type.getMethodDescriptor(Type.getType(this.targetTypePath), Type.getType((Class<?>) String.class)), false);
            methodVisitor.visitLabel(label2);
            context.getFrameGeneration().same1(methodVisitor, TypeDescription.ForLoadedType.m5238of(this.targetTypePath), methodDescription.getParameters().asTypeList());
            methodVisitor.visitInsn(176);
            return new ByteCodeAppender.Size(1, 2);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TypePathTranslator typePathTranslator = (TypePathTranslator) obj;
            return this.sourceTypePath.equals(typePathTranslator.sourceTypePath) && this.targetTypePath.equals(typePathTranslator.targetTypePath);
        }

        public int hashCode() {
            return (((getClass().hashCode() * 31) + this.sourceTypePath.hashCode()) * 31) + this.targetTypePath.hashCode();
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
    }

    public ClassVisitorFactory(Class<?> cls) {
        this.type = cls;
    }

    @AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(PrivilegedAction<T> privilegedAction) {
        return ACCESS_CONTROLLER ? (T) AccessController.doPrivileged(privilegedAction) : privilegedAction.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static <S> ClassVisitorFactory<S> m5175of(Class<S> cls) {
        return m5176of(cls, new ByteBuddy().with(TypeValidation.DISABLED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DynamicType toAttributeWrapper(DynamicType.Builder<?> builder, Class<?> cls, Class<?> cls2, TypeDescription typeDescription, TypeDescription typeDescription2) throws Exception {
        Visibility visibility = Visibility.PUBLIC;
        return builder.defineField("delegate", cls2, visibility, FieldManifestation.FINAL).defineConstructor(visibility).withParameters(cls2).intercept(MethodCall.invoke(cls.getDeclaredConstructor(String.class)).onSuper().with(new StackManipulation.Compound(MethodVariableAccess.REFERENCE.loadFrom(1), FieldAccess.forField((FieldDescription.InDefinedShape) new FieldDescription.ForLoadedField(cls2.getField("type"))).read()), String.class).andThen(FieldAccessor.ofField("delegate").setsArgumentAt(0))).defineMethod("attribute", cls, visibility, Ownership.STATIC).withParameters(cls2).intercept(new Implementation.Simple(new AttributeTranslator(cls, cls2, typeDescription, typeDescription2))).method(ElementMatchers.isProtected()).intercept(ExceptionMethod.throwing((Class<? extends Throwable>) UnsupportedOperationException.class)).method(ElementMatchers.named("isUnknown")).intercept(MethodCall.invoke(cls2.getMethod("isUnknown", null)).onField("delegate")).method(ElementMatchers.named("isCodeAttribute")).intercept(MethodCall.invoke(cls2.getMethod("isCodeAttribute", null)).onField("delegate")).make();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MethodCall.ArgumentLoader.Factory toConvertedParameter(TypeDescription typeDescription, Class<?> cls, String str, int i, boolean z) {
        return new MethodCall.ArgumentLoader.ForStackManipulation(new StackManipulation.Compound(z ? MethodVariableAccess.loadThis() : StackManipulation.Trivial.INSTANCE, MethodVariableAccess.REFERENCE.loadFrom(i), MethodInvocation.invoke((MethodDescription.InDefinedShape) typeDescription.getDeclaredMethods().filter(ElementMatchers.named(str)).getOnly())), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DynamicType.Builder<?> toMethodVisitorBuilder(ByteBuddy byteBuddy, Class<?> cls, Class<?> cls2, @MaybeNull Class<?> cls3, @MaybeNull Class<?> cls4, @MaybeNull Class<?> cls5, @MaybeNull Class<?> cls6, @MaybeNull Class<?> cls7, @MaybeNull Class<?> cls8, @MaybeNull Class<?> cls9, @MaybeNull Class<?> cls10, @MaybeNull Class<?> cls11, @MaybeNull Class<?> cls12) throws Exception {
        DynamicType.Builder visitorBuilder = toVisitorBuilder(byteBuddy, cls, cls2, cls3, cls4, FieldAccessor.ofField(LABELS).setsValue(new StackManipulation.Compound(TypeCreation.m5375of(TypeDescription.ForLoadedType.m5238of(HashMap.class)), Duplication.SINGLE, MethodInvocation.invoke((MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.m5238of(HashMap.class).getDeclaredMethods().filter(ElementMatchers.isConstructor().and(ElementMatchers.takesArguments(0))).getOnly())), Map.class));
        if (cls5 != null && cls6 != null) {
            Visibility visibility = Visibility.PRIVATE;
            visitorBuilder = visitorBuilder.defineField(LABELS, Map.class, visibility, FieldManifestation.FINAL).defineMethod(C6468.f16552, cls6, visibility).withParameters(cls5).intercept(new Implementation.Simple(new LabelTranslator(cls6))).defineMethod(LABELS, TypeDescription.ArrayProjection.m5236of(TypeDescription.ForLoadedType.m5238of(cls6)), visibility).withParameters(TypeDescription.ArrayProjection.m5236of(TypeDescription.ForLoadedType.m5238of(cls5))).intercept(new Implementation.Simple(new LabelArrayTranslator(cls5, cls6))).defineMethod("frames", Object[].class, visibility).withParameters(Object[].class).intercept(new Implementation.Simple(new FrameTranslator(cls5, cls6)));
        }
        if (cls9 != null && cls10 != null) {
            visitorBuilder = visitorBuilder.defineMethod("handle", cls10, Visibility.PRIVATE, Ownership.STATIC).withParameters(cls9).intercept(new Implementation.Simple(new HandleTranslator(cls9, cls10)));
        }
        if (cls11 != null && cls12 != null && cls9 != null && cls10 != null) {
            visitorBuilder = visitorBuilder.defineMethod("constantDyanmic", cls12, Visibility.PRIVATE, Ownership.STATIC).withParameters(cls11).intercept(new Implementation.Simple(new ConstantDynamicTranslator(cls11, cls12, cls9, cls10)));
        }
        Visibility visibility2 = Visibility.PRIVATE;
        Ownership ownership = Ownership.STATIC;
        return visitorBuilder.defineMethod("constant", Object.class, visibility2, ownership).withParameters(Object.class).intercept(new Implementation.Simple(new ConstantTranslator(cls9, cls10, cls7, cls8, cls11, cls12))).defineMethod("constants", Object[].class, visibility2, ownership).withParameters(Object[].class).intercept(new Implementation.Simple(new ConstantArrayTranslator()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DynamicType.Builder<?> toVisitorBuilder(ByteBuddy byteBuddy, Class<?> cls, Class<?> cls2, @MaybeNull Class<?> cls3, @MaybeNull Class<?> cls4, Implementation implementation) throws Exception {
        DynamicType.Builder<T> builderSubclass = byteBuddy.subclass((Class) cls, (ConstructorStrategy) ConstructorStrategy.Default.NO_CONSTRUCTORS);
        Visibility visibility = Visibility.PRIVATE;
        DynamicType.Builder.FieldDefinition.Optional.Valuable<T> valuableDefineField = builderSubclass.defineField("delegate", cls2, visibility, FieldManifestation.FINAL);
        Visibility visibility2 = Visibility.PUBLIC;
        DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<T> receiverTypeDefinitionIntercept = valuableDefineField.defineConstructor(visibility2).withParameters(cls2).intercept(MethodCall.invoke(cls.getDeclaredConstructor(Integer.TYPE)).with(Integer.valueOf(OpenedClassReader.ASM_API)).andThen(FieldAccessor.ofField("delegate").setsArgumentAt(0)).andThen(implementation));
        Ownership ownership = Ownership.STATIC;
        DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<T> receiverTypeDefinitionIntercept2 = receiverTypeDefinitionIntercept.defineMethod(WRAP, cls, visibility2, ownership).withParameters(cls2).intercept(new Implementation.Simple(new NullCheckedConstruction(cls2)));
        return (cls3 == null || cls4 == null) ? receiverTypeDefinitionIntercept2 : receiverTypeDefinitionIntercept2.defineMethod("typePath", cls4, visibility, ownership).withParameters(cls3).intercept(new Implementation.Simple(new TypePathTranslator(cls3, cls4)));
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.type.equals(((ClassVisitorFactory) obj).type);
    }

    public Class<?> getType() {
        return this.type;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.type.hashCode();
    }

    public abstract ClassVisitor unwrap(T t);

    public abstract T wrap(ClassVisitor classVisitor);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: of */
    public static <S> ClassVisitorFactory<S> m5176of(Class<S> cls, ByteBuddy byteBuddy) {
        return (ClassVisitorFactory) doPrivileged(new CreateClassVisitorFactory(cls, byteBuddy));
    }
}
