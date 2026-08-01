package net.bytebuddy.asm;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
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
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public abstract class ClassVisitorFactory<T> {
    private static final boolean ACCESS_CONTROLLER;
    private static final String DELEGATE = "delegate";
    private static final String LABELS = "labels";
    private static final String WRAP = "wrap";
    private final Class<?> type;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            return this.targetWrapper.hashCode() + AbstractC3275.m5144(this.sourceWrapper, AbstractC3275.m5129(AbstractC3275.m5129(getClass().hashCode() * 31, 31, this.sourceAttribute), 31, this.targetAttribute), 31);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            context.getFrameGeneration().append(methodVisitor, Arrays.asList(TypeDescription.ForLoadedType.m289of(Object[].class), TypeDescription.ForLoadedType.m289of(Integer.TYPE)), methodDescription.getParameters().asTypeList());
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
            context.getFrameGeneration().chop(methodVisitor, 1, CompoundList.m476of(methodDescription.getParameters().asTypeList(), TypeDescription.ForLoadedType.m289of(Object[].class)));
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

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            context.getFrameGeneration().append(methodVisitor, Arrays.asList(TypeDescription.ForLoadedType.m289of(Object[].class), TypeDescription.ForLoadedType.m289of(Integer.TYPE)), methodDescription.getParameters().asTypeList());
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
            context.getFrameGeneration().chop(methodVisitor, 1, CompoundList.m476of(methodDescription.getParameters().asTypeList(), TypeDescription.ForLoadedType.m289of(Object[].class)));
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
            return this.targetHandle.hashCode() + AbstractC3275.m5129(AbstractC3275.m5129(AbstractC3275.m5129(getClass().hashCode() * 31, 31, this.sourceConstantDynamic), 31, this.targetConstantDynamic), 31, this.sourceHandle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            MethodVisitor methodVisitor2 = methodVisitor;
            Label label = new Label();
            Label label2 = new Label();
            Label label3 = new Label();
            if (this.sourceType != null && this.targetType != null) {
                methodVisitor2.visitVarInsn(25, 0);
                methodVisitor2.visitTypeInsn(193, Type.getInternalName(this.sourceType));
                methodVisitor2.visitJumpInsn(153, label);
                methodVisitor2.visitVarInsn(25, 0);
                methodVisitor2.visitTypeInsn(192, Type.getInternalName(this.sourceType));
                methodVisitor2.visitMethodInsn(182, Type.getInternalName(this.sourceType), "getDescriptor", Type.getMethodDescriptor(Type.getType((Class<?>) String.class), new Type[0]), false);
                methodVisitor2 = methodVisitor;
                methodVisitor2.visitMethodInsn(184, Type.getInternalName(this.targetType), "getType", Type.getMethodDescriptor(Type.getType(this.targetType), Type.getType((Class<?>) String.class)), false);
                methodVisitor2.visitInsn(176);
                methodVisitor2.visitLabel(label);
                context.getFrameGeneration().same(methodVisitor2, methodDescription.getParameters().asTypeList());
            }
            if (this.sourceHandle != null && this.targetHandle != null) {
                methodVisitor2.visitVarInsn(25, 0);
                methodVisitor2.visitTypeInsn(193, Type.getInternalName(this.sourceHandle));
                methodVisitor2.visitJumpInsn(153, label2);
                methodVisitor2.visitVarInsn(25, 0);
                methodVisitor2.visitTypeInsn(192, Type.getInternalName(this.sourceHandle));
                methodVisitor2.visitMethodInsn(184, context.getInstrumentedType().getInternalName(), "handle", Type.getMethodDescriptor(Type.getType(this.targetHandle), Type.getType(this.sourceHandle)), false);
                methodVisitor2.visitInsn(176);
                methodVisitor2.visitLabel(label2);
                context.getFrameGeneration().same(methodVisitor2, methodDescription.getParameters().asTypeList());
            }
            if (this.sourceConstantDynamic != null && this.targetConstantDynamic != null) {
                methodVisitor2.visitVarInsn(25, 0);
                methodVisitor2.visitTypeInsn(193, Type.getInternalName(this.sourceConstantDynamic));
                methodVisitor2.visitJumpInsn(153, label3);
                methodVisitor2.visitVarInsn(25, 0);
                methodVisitor2.visitTypeInsn(192, Type.getInternalName(this.sourceConstantDynamic));
                methodVisitor.visitMethodInsn(184, context.getInstrumentedType().getInternalName(), "constantDyanmic", Type.getMethodDescriptor(Type.getType(this.targetConstantDynamic), Type.getType(this.sourceConstantDynamic)), false);
                methodVisitor2 = methodVisitor;
                methodVisitor2.visitInsn(176);
                methodVisitor2.visitLabel(label3);
                context.getFrameGeneration().same(methodVisitor2, methodDescription.getParameters().asTypeList());
            }
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitInsn(176);
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
            return cls6 != null ? cls6.hashCode() + i : i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            return this.byteBuddy.hashCode() + AbstractC3275.m5129(getClass().hashCode() * 31, 31, this.classVisitor);
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x05ae A[Catch: Exception -> 0x0293, TryCatch #5 {Exception -> 0x0293, blocks: (B:44:0x0254, B:48:0x029b, B:49:0x02a3, B:52:0x02ab, B:54:0x02e5, B:132:0x06d1, B:58:0x0313, B:59:0x0335, B:61:0x0338, B:63:0x033e, B:65:0x0342, B:105:0x05a6, B:122:0x0603, B:124:0x0617, B:127:0x0633, B:129:0x065f, B:131:0x06b4, B:120:0x05f3, B:109:0x05ae, B:111:0x05b4, B:69:0x0392, B:71:0x039c, B:73:0x03a2, B:75:0x03e9, B:77:0x03f1, B:78:0x042f, B:80:0x0439, B:82:0x043d, B:83:0x047b, B:85:0x0485, B:87:0x0489, B:88:0x04bd, B:90:0x04c5, B:93:0x04cb, B:95:0x04db, B:96:0x0513, B:97:0x054d, B:99:0x055b, B:102:0x0567, B:104:0x0590, B:133:0x06f6, B:134:0x075c), top: B:166:0x0254 }] */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0603 A[Catch: Exception -> 0x0293, TRY_ENTER, TryCatch #5 {Exception -> 0x0293, blocks: (B:44:0x0254, B:48:0x029b, B:49:0x02a3, B:52:0x02ab, B:54:0x02e5, B:132:0x06d1, B:58:0x0313, B:59:0x0335, B:61:0x0338, B:63:0x033e, B:65:0x0342, B:105:0x05a6, B:122:0x0603, B:124:0x0617, B:127:0x0633, B:129:0x065f, B:131:0x06b4, B:120:0x05f3, B:109:0x05ae, B:111:0x05b4, B:69:0x0392, B:71:0x039c, B:73:0x03a2, B:75:0x03e9, B:77:0x03f1, B:78:0x042f, B:80:0x0439, B:82:0x043d, B:83:0x047b, B:85:0x0485, B:87:0x0489, B:88:0x04bd, B:90:0x04c5, B:93:0x04cb, B:95:0x04db, B:96:0x0513, B:97:0x054d, B:99:0x055b, B:102:0x0567, B:104:0x0590, B:133:0x06f6, B:134:0x075c), top: B:166:0x0254 }] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0633 A[Catch: Exception -> 0x0293, TryCatch #5 {Exception -> 0x0293, blocks: (B:44:0x0254, B:48:0x029b, B:49:0x02a3, B:52:0x02ab, B:54:0x02e5, B:132:0x06d1, B:58:0x0313, B:59:0x0335, B:61:0x0338, B:63:0x033e, B:65:0x0342, B:105:0x05a6, B:122:0x0603, B:124:0x0617, B:127:0x0633, B:129:0x065f, B:131:0x06b4, B:120:0x05f3, B:109:0x05ae, B:111:0x05b4, B:69:0x0392, B:71:0x039c, B:73:0x03a2, B:75:0x03e9, B:77:0x03f1, B:78:0x042f, B:80:0x0439, B:82:0x043d, B:83:0x047b, B:85:0x0485, B:87:0x0489, B:88:0x04bd, B:90:0x04c5, B:93:0x04cb, B:95:0x04db, B:96:0x0513, B:97:0x054d, B:99:0x055b, B:102:0x0567, B:104:0x0590, B:133:0x06f6, B:134:0x075c), top: B:166:0x0254 }] */
        /* JADX WARN: Removed duplicated region for block: B:184:0x05aa A[SYNTHETIC] */
        @Override // java.security.PrivilegedAction
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ClassVisitorFactory<S> run() {
            String name;
            HashMap map;
            Iterator it;
            String str;
            String str2;
            String str3;
            String str4;
            Class<Handle> cls;
            String str5;
            Class<TypePath> cls2;
            String str6;
            String str7;
            DynamicType attributeWrapper;
            DynamicType attributeWrapper2;
            String str8;
            ArrayList arrayList;
            HashMap map2;
            Class<Label> cls3;
            String str9;
            String str10;
            String str11;
            String str12;
            Class<Handle> cls4;
            String str13;
            String str14;
            String str15;
            Class<TypePath> cls5;
            boolean z;
            Method method;
            String str16;
            HashMap map3;
            Method method2;
            DynamicType.Builder builderIntercept;
            Class<?>[] clsArr;
            String str17;
            String str18;
            StringBuilder sb;
            DynamicType.Builder visitorBuilder;
            DynamicType.Builder visitorBuilder2;
            Class<?> cls6;
            Class cls7;
            String str19;
            CreateClassVisitorFactory<S> createClassVisitorFactory = this;
            String str20 = "delegate";
            String str21 = "attribute";
            String str22 = "constants";
            String str23 = "frames";
            String str24 = "handle";
            String str25 = "typePath";
            String str26 = ClassVisitorFactory.LABELS;
            String str27 = "label";
            Class<Label> cls8 = Label.class;
            boolean zEquals = "ClassVisitor".equals(createClassVisitorFactory.classVisitor.getSimpleName());
            Class<S> cls9 = createClassVisitorFactory.classVisitor;
            if (!zEquals) {
                C6755.m11869(AbstractC0900.m714(cls9, "Expected a class named ClassVisitor: "));
                return null;
            }
            try {
                name = cls9.getPackage().getName();
                map = new HashMap();
                it = Arrays.asList(Attribute.class, Label.class, Type.class, TypePath.class, Handle.class, ConstantDynamic.class).iterator();
            } catch (Exception e) {
                e = e;
            }
            while (true) {
                str = str20;
                str2 = ".";
                str3 = str21;
                if (!it.hasNext()) {
                    break;
                }
                Class cls10 = (Class) it.next();
                String str28 = str22;
                try {
                    str19 = str23;
                    try {
                        map.put(cls10, Class.forName(name + "." + cls10.getSimpleName(), false, createClassVisitorFactory.classVisitor.getClassLoader()));
                    } catch (ClassNotFoundException unused) {
                    }
                } catch (ClassNotFoundException unused2) {
                    str19 = str23;
                }
                str22 = str28;
                str20 = str;
                str21 = str3;
                str23 = str19;
                throw new IllegalArgumentException("Failed to generate factory for ".concat(createClassVisitorFactory.classVisitor.getName()), e);
            }
            String str29 = str22;
            String str30 = str23;
            Class<Label[]> cls11 = Label[].class;
            if (map.containsKey(cls8)) {
                str4 = "constant";
                map.put(cls11, Class.forName("[L" + ((Class) map.get(cls8)).getName() + ";", false, createClassVisitorFactory.classVisitor.getClassLoader()));
            } else {
                str4 = "constant";
            }
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            Iterator it2 = Arrays.asList(ClassVisitor.class, AnnotationVisitor.class, ModuleVisitor.class, RecordComponentVisitor.class, FieldVisitor.class, MethodVisitor.class).iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                Iterator it3 = it2;
                cls = Handle.class;
                str5 = str24;
                cls2 = TypePath.class;
                str6 = str25;
                str7 = str26;
                if (!zHasNext) {
                    break;
                }
                Class cls12 = (Class) it3.next();
                Class<Label[]> cls13 = cls11;
                try {
                    sb = new StringBuilder();
                    sb.append(name);
                    sb.append(str2);
                    str17 = str2;
                } catch (ClassNotFoundException unused3) {
                    str17 = str2;
                }
                try {
                    sb.append(cls12.getSimpleName());
                    str18 = name;
                    try {
                        Class<?> cls14 = Class.forName(sb.toString(), false, createClassVisitorFactory.classVisitor.getClassLoader());
                        ByteBuddy byteBuddy = createClassVisitorFactory.byteBuddy;
                        if (cls12 == MethodVisitor.class) {
                            visitorBuilder = ClassVisitorFactory.toMethodVisitorBuilder(byteBuddy, cls12, cls14, TypePath.class, (Class) map.get(cls2), Label.class, (Class) map.get(cls8), Type.class, (Class) map.get(Type.class), Handle.class, (Class) map.get(cls), ConstantDynamic.class, (Class) map.get(ConstantDynamic.class));
                            visitorBuilder2 = ClassVisitorFactory.toMethodVisitorBuilder(createClassVisitorFactory.byteBuddy, cls14, cls12, (Class) map.get(cls2), TypePath.class, (Class) map.get(cls8), Label.class, (Class) map.get(Type.class), Type.class, (Class) map.get(cls), Handle.class, (Class) map.get(ConstantDynamic.class), ConstantDynamic.class);
                            cls7 = cls12;
                            cls6 = cls14;
                        } else {
                            Class cls15 = (Class) map.get(cls2);
                            MethodReturn methodReturn = MethodReturn.VOID;
                            visitorBuilder = ClassVisitorFactory.toVisitorBuilder(byteBuddy, cls12, cls14, TypePath.class, cls15, new Implementation.Simple(methodReturn));
                            visitorBuilder2 = ClassVisitorFactory.toVisitorBuilder(createClassVisitorFactory.byteBuddy, cls14, cls12, (Class) map.get(cls2), TypePath.class, new Implementation.Simple(methodReturn));
                            cls6 = cls14;
                            cls7 = cls12;
                        }
                        map4.put(cls7, cls6);
                        map5.put(cls7, visitorBuilder);
                        map5.put(cls6, visitorBuilder2);
                    } catch (ClassNotFoundException unused4) {
                    }
                } catch (ClassNotFoundException unused5) {
                    str18 = name;
                }
                cls11 = cls13;
                it2 = it3;
                str24 = str5;
                str25 = str6;
                str26 = str7;
                str2 = str17;
                name = str18;
                throw new IllegalArgumentException("Failed to generate factory for ".concat(createClassVisitorFactory.classVisitor.getName()), e);
            }
            Class<Label[]> cls16 = cls11;
            ArrayList arrayList2 = new ArrayList();
            HashMap map6 = new HashMap();
            if (map.containsKey(Attribute.class)) {
                try {
                    ByteBuddy byteBuddy2 = createClassVisitorFactory.byteBuddy;
                    ConstructorStrategy.Default r9 = ConstructorStrategy.Default.NO_CONSTRUCTORS;
                    DynamicType.Builder<T> builderSubclass = byteBuddy2.subclass((Class) Attribute.class, (ConstructorStrategy) r9);
                    DynamicType.Builder<T> builderSubclass2 = createClassVisitorFactory.byteBuddy.subclass((Class) map.get(Attribute.class), (ConstructorStrategy) r9);
                    attributeWrapper = ClassVisitorFactory.toAttributeWrapper(builderSubclass, Attribute.class, (Class) map.get(Attribute.class), builderSubclass.toTypeDescription(), builderSubclass2.toTypeDescription());
                    arrayList2.add(attributeWrapper);
                    attributeWrapper2 = ClassVisitorFactory.toAttributeWrapper(builderSubclass2, (Class) map.get(Attribute.class), Attribute.class, builderSubclass2.toTypeDescription(), builderSubclass.toTypeDescription());
                    arrayList2.add(attributeWrapper2);
                } catch (Exception e2) {
                    e = e2;
                    createClassVisitorFactory = this;
                }
            } else {
                attributeWrapper = null;
                attributeWrapper2 = null;
            }
            Iterator it4 = map4.entrySet().iterator();
            while (true) {
                boolean zHasNext2 = it4.hasNext();
                String str31 = ClassVisitorFactory.WRAP;
                if (!zHasNext2) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it4.next();
                DynamicType dynamicType = attributeWrapper;
                DynamicType.Builder builder = (DynamicType.Builder) map5.get(entry.getKey());
                DynamicType.Builder builder2 = (DynamicType.Builder) map5.get(entry.getValue());
                Method[] methods = ((Class) entry.getKey()).getMethods();
                DynamicType dynamicType2 = attributeWrapper2;
                int length = methods.length;
                DynamicType.Builder builderIntercept2 = builder;
                Iterator it5 = it4;
                DynamicType.Builder builder3 = builder2;
                int i = 0;
                while (i < length) {
                    Method method3 = methods[i];
                    int i2 = length;
                    int i3 = i;
                    if (method3.getDeclaringClass() == Object.class) {
                        arrayList = arrayList2;
                        map2 = map6;
                        map3 = map4;
                        builderIntercept = builder3;
                        str8 = str31;
                        cls3 = cls8;
                        str16 = str;
                        str9 = str6;
                        str10 = str7;
                        str11 = str27;
                        str12 = str5;
                        cls4 = cls;
                        str13 = str3;
                        str14 = str29;
                        str15 = str30;
                        cls5 = cls2;
                    } else {
                        Class<?>[] parameterTypes = method3.getParameterTypes();
                        str8 = str31;
                        int length2 = parameterTypes.length;
                        arrayList = arrayList2;
                        Class<?>[] clsArr2 = new Class[length2];
                        map2 = map6;
                        HashMap map7 = map4;
                        ArrayList arrayList3 = new ArrayList(parameterTypes.length);
                        ArrayList arrayList4 = new ArrayList(length2);
                        DynamicType.Builder builder4 = builderIntercept2;
                        DynamicType.Builder builder5 = builder3;
                        int i4 = 0;
                        int i5 = 1;
                        boolean z2 = false;
                        while (true) {
                            if (i4 >= parameterTypes.length) {
                                cls3 = cls8;
                                str9 = str6;
                                str10 = str7;
                                str11 = str27;
                                str12 = str5;
                                cls4 = cls;
                                str13 = str3;
                                str14 = str29;
                                str15 = str30;
                                cls5 = cls2;
                                z = false;
                                break;
                            }
                            if (entry.getKey() == MethodVisitor.class && parameterTypes[i4] == cls8) {
                                clsArr2[i4] = (Class) map.get(cls8);
                                clsArr = parameterTypes;
                                cls3 = cls8;
                                arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), clsArr2[i4], str27, i5, true));
                                arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), clsArr[i4], str27, i5, true));
                                str9 = str6;
                                str10 = str7;
                                str11 = str27;
                            } else {
                                clsArr = parameterTypes;
                                cls3 = cls8;
                                if (entry.getKey() == MethodVisitor.class) {
                                    Class<Label[]> cls17 = cls16;
                                    if (clsArr[i4] == cls17) {
                                        clsArr2[i4] = (Class) map.get(cls17);
                                        cls16 = cls17;
                                        String str32 = str7;
                                        str11 = str27;
                                        arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), clsArr2[i4], str32, i5, true));
                                        arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), clsArr[i4], str32, i5, true));
                                        str12 = str5;
                                        str9 = str6;
                                        str10 = str32;
                                        cls4 = cls;
                                        str13 = str3;
                                        str14 = str29;
                                        str15 = str30;
                                        cls5 = cls2;
                                        if (clsArr2[i4] != null) {
                                            z = true;
                                            break;
                                        }
                                        Class<?> cls18 = clsArr[i4];
                                        i5 += (cls18 == Long.TYPE || cls18 == Double.TYPE) ? 2 : 1;
                                        i4++;
                                        cls2 = cls5;
                                        parameterTypes = clsArr;
                                        str30 = str15;
                                        str29 = str14;
                                        str3 = str13;
                                        cls = cls4;
                                        str5 = str12;
                                        str27 = str11;
                                        str7 = str10;
                                        str6 = str9;
                                        cls8 = cls3;
                                    } else {
                                        cls16 = cls17;
                                    }
                                }
                                String str33 = str7;
                                str11 = str27;
                                if (clsArr[i4] == cls2) {
                                    clsArr2[i4] = (Class) map.get(cls2);
                                    str9 = str6;
                                    str10 = str33;
                                    arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), clsArr2[i4], str9, i5, false));
                                    arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), clsArr[i4], str9, i5, false));
                                } else {
                                    str9 = str6;
                                    str10 = str33;
                                    if (entry.getKey() == MethodVisitor.class && clsArr[i4] == cls) {
                                        clsArr2[i4] = (Class) map.get(cls);
                                        str12 = str5;
                                        cls4 = cls;
                                        arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), clsArr2[i4], str12, i5, false));
                                        arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), clsArr[i4], str12, i5, false));
                                    } else {
                                        str12 = str5;
                                        cls4 = cls;
                                        if (entry.getKey() == MethodVisitor.class && clsArr[i4] == Object.class) {
                                            clsArr2[i4] = Object.class;
                                            String str34 = str4;
                                            arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), Object.class, str34, i5, false));
                                            arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), Object.class, str34, i5, false));
                                            str4 = str34;
                                        } else {
                                            String str35 = str4;
                                            if (entry.getKey() == MethodVisitor.class && clsArr[i4] == Object[].class) {
                                                clsArr2[i4] = Object[].class;
                                                str4 = str35;
                                                if (method3.getName().equals("visitFrame")) {
                                                    String str36 = str30;
                                                    cls5 = cls2;
                                                    arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), Object[].class, str36, i5, true));
                                                    arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), Object[].class, str36, i5, true));
                                                    str13 = str3;
                                                    str14 = str29;
                                                    str15 = str36;
                                                } else {
                                                    String str37 = str30;
                                                    cls5 = cls2;
                                                    String str38 = str29;
                                                    str15 = str37;
                                                    arrayList3.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getKey())).toTypeDescription(), Object[].class, str38, i5, false));
                                                    arrayList4.add(ClassVisitorFactory.toConvertedParameter(((DynamicType.Builder) map5.get(entry.getValue())).toTypeDescription(), Object[].class, str38, i5, false));
                                                    str13 = str3;
                                                    str14 = str38;
                                                }
                                            } else {
                                                String str39 = str30;
                                                cls5 = cls2;
                                                String str40 = str29;
                                                str15 = str39;
                                                str4 = str35;
                                                Class<?> cls19 = clsArr[i4];
                                                if (cls19 == Attribute.class) {
                                                    clsArr2[i4] = (Class) map.get(Attribute.class);
                                                    if (dynamicType == null || dynamicType2 == null) {
                                                        str13 = str3;
                                                        str14 = str40;
                                                        z2 = true;
                                                    } else {
                                                        str13 = str3;
                                                        str14 = str40;
                                                        arrayList3.add(ClassVisitorFactory.toConvertedParameter(dynamicType2.getTypeDescription(), (Class) map.get(Attribute.class), str13, i5, false));
                                                        arrayList4.add(ClassVisitorFactory.toConvertedParameter(dynamicType.getTypeDescription(), Attribute.class, str13, i5, false));
                                                    }
                                                } else {
                                                    str13 = str3;
                                                    str14 = str40;
                                                    clsArr2[i4] = cls19;
                                                    arrayList3.add(new MethodCall.ArgumentLoader.ForMethodParameter.Factory(i4));
                                                    arrayList4.add(new MethodCall.ArgumentLoader.ForMethodParameter.Factory(i4));
                                                }
                                            }
                                            if (clsArr2[i4] != null) {
                                            }
                                        }
                                    }
                                    str13 = str3;
                                    str14 = str29;
                                    str15 = str30;
                                    cls5 = cls2;
                                    if (clsArr2[i4] != null) {
                                    }
                                }
                            }
                            str12 = str5;
                            cls4 = cls;
                            str13 = str3;
                            str14 = str29;
                            str15 = str30;
                            cls5 = cls2;
                            if (clsArr2[i4] != null) {
                            }
                        }
                        boolean z3 = z2;
                        if (z) {
                            method = null;
                            z3 = true;
                            if (z3) {
                                str16 = str;
                                MethodCall methodCallWith = MethodCall.invoke(method).onField(str16).with(arrayList3);
                                MethodCall methodCallWith2 = MethodCall.invoke(method3).onField(str16).with(arrayList4);
                                map3 = map7;
                                Class cls20 = (Class) map3.get(method3.getReturnType());
                                if (cls20 != null) {
                                    method2 = method;
                                    methodCallWith = MethodCall.invoke((MethodDescription) ((DynamicType.Builder) map5.get(method3.getReturnType())).toTypeDescription().getDeclaredMethods().filter(ElementMatchers.named(str8)).getOnly()).withMethodCall(methodCallWith);
                                    methodCallWith2 = MethodCall.invoke((MethodDescription) ((DynamicType.Builder) map5.get(cls20)).toTypeDescription().getDeclaredMethods().filter(ElementMatchers.named(str8)).getOnly()).withMethodCall(methodCallWith2);
                                } else {
                                    method2 = method;
                                }
                                builderIntercept2 = builder4.method(ElementMatchers.m456is(method3)).intercept(methodCallWith);
                                builderIntercept = builder5.method(ElementMatchers.m456is(method2)).intercept(methodCallWith2);
                            } else {
                                builderIntercept2 = builder4.method(ElementMatchers.m456is(method3)).intercept(ExceptionMethod.throwing((Class<? extends Throwable>) UnsupportedOperationException.class));
                                builderIntercept = method != null ? builder5.method(ElementMatchers.m456is(method)).intercept(ExceptionMethod.throwing((Class<? extends Throwable>) UnsupportedOperationException.class)) : builder5;
                                str16 = str;
                                map3 = map7;
                            }
                        } else {
                            try {
                                method = ((Class) entry.getValue()).getMethod(method3.getName(), clsArr2);
                            } catch (NoSuchMethodException unused6) {
                                method = null;
                                z3 = true;
                            }
                            if (z3) {
                            }
                        }
                    }
                    str = str16;
                    map4 = map3;
                    cls2 = cls5;
                    length = i2;
                    str31 = str8;
                    builder3 = builderIntercept;
                    i = i3 + 1;
                    str30 = str15;
                    str29 = str14;
                    arrayList2 = arrayList;
                    map6 = map2;
                    str3 = str13;
                    cls = cls4;
                    str5 = str12;
                    str27 = str11;
                    str7 = str10;
                    str6 = str9;
                    cls8 = cls3;
                }
                ArrayList arrayList5 = arrayList2;
                HashMap map8 = map6;
                Class<Label> cls21 = cls8;
                String str41 = str6;
                String str42 = str7;
                String str43 = str27;
                String str44 = str5;
                Class<Handle> cls22 = cls;
                String str45 = str3;
                DynamicType.Unloaded<T> unloadedMake = builderIntercept2.make();
                DynamicType.Unloaded<T> unloadedMake2 = builder3.make();
                map8.put(entry.getKey(), unloadedMake.getTypeDescription());
                map8.put(entry.getValue(), unloadedMake2.getTypeDescription());
                arrayList5.add(unloadedMake);
                arrayList5.add(unloadedMake2);
                arrayList2 = arrayList5;
                map6 = map8;
                str = str;
                map4 = map4;
                cls2 = cls2;
                attributeWrapper = dynamicType;
                it4 = it5;
                attributeWrapper2 = dynamicType2;
                str30 = str30;
                str29 = str29;
                str3 = str45;
                cls = cls22;
                str5 = str44;
                str27 = str43;
                str7 = str42;
                str6 = str41;
                cls8 = cls21;
                throw new IllegalArgumentException("Failed to generate factory for ".concat(createClassVisitorFactory.classVisitor.getName()), e);
            }
            HashMap map9 = map6;
            ArrayList arrayList6 = arrayList2;
            createClassVisitorFactory = this;
            ClassLoader classLoaderBuild = new MultipleParentClassLoader.Builder(false).appendMostSpecific(ClassVisitor.class, createClassVisitorFactory.classVisitor).build();
            ClassVisitorFactory<S> classVisitorFactory = (ClassVisitorFactory) createClassVisitorFactory.byteBuddy.subclass((Class) ClassVisitorFactory.class, (ConstructorStrategy) ConstructorStrategy.Default.IMITATE_SUPER_CLASS_OPENING).method(ElementMatchers.named(ClassVisitorFactory.WRAP)).intercept(MethodCall.construct((MethodDescription) ((TypeDescription) map9.get(createClassVisitorFactory.classVisitor)).getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly()).withArgument(0)).method(ElementMatchers.named("unwrap")).intercept(MethodCall.construct((MethodDescription) ((TypeDescription) map9.get(ClassVisitor.class)).getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly()).withArgument(0).withAssigner(Assigner.DEFAULT, Assigner.Typing.DYNAMIC)).make().include(arrayList6).load(classLoaderBuild).getLoaded().getConstructor(Class.class).newInstance(createClassVisitorFactory.classVisitor);
            if ((classLoaderBuild instanceof MultipleParentClassLoader) && classLoaderBuild != ClassVisitor.class.getClassLoader() && classLoaderBuild != createClassVisitorFactory.classVisitor.getClassLoader() && !((MultipleParentClassLoader) classLoaderBuild).seal()) {
                throw new IllegalStateException("Failed to seal multiple parent class loader: " + classLoaderBuild);
            }
            return classVisitorFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            context.getFrameGeneration().same(methodVisitor, CompoundList.m475of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitInsn(190);
            methodVisitor.visitTypeInsn(189, Type.getInternalName(Object.class));
            methodVisitor.visitVarInsn(58, 2);
            methodVisitor.visitInsn(3);
            methodVisitor.visitVarInsn(54, 3);
            methodVisitor.visitLabel(label2);
            Implementation.Context.FrameGeneration frameGeneration = context.getFrameGeneration();
            TypeDescription typeDescriptionM289of = TypeDescription.ForLoadedType.m289of(Object[].class);
            Class cls = Integer.TYPE;
            frameGeneration.append(methodVisitor, Arrays.asList(typeDescriptionM289of, TypeDescription.ForLoadedType.m289of(cls)), CompoundList.m475of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
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
            methodVisitor.visitMethodInsn(183, context.getInstrumentedType().getInternalName(), "label", Type.getMethodDescriptor(Type.getType(this.targetLabel), Type.getType(this.sourceLabel)), false);
            methodVisitor.visitJumpInsn(167, label3);
            methodVisitor.visitLabel(label5);
            context.getFrameGeneration().full(methodVisitor, Arrays.asList(TypeDescription.ForLoadedType.m289of(Object[].class), TypeDescription.ForLoadedType.m289of(cls)), CompoundList.m478of(Collections.singletonList(context.getInstrumentedType()), methodDescription.getParameters().asTypeList(), Arrays.asList(TypeDescription.ForLoadedType.m289of(Object[].class), TypeDescription.ForLoadedType.m289of(cls))));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(21, 3);
            methodVisitor.visitInsn(50);
            methodVisitor.visitLabel(label3);
            context.getFrameGeneration().full(methodVisitor, Arrays.asList(TypeDescription.ForLoadedType.m289of(Object[].class), TypeDescription.ForLoadedType.m289of(cls), TypeDescription.ForLoadedType.m289of(Object.class)), CompoundList.m478of(Collections.singletonList(context.getInstrumentedType()), methodDescription.getParameters().asTypeList(), Arrays.asList(TypeDescription.ForLoadedType.m289of(Object[].class), TypeDescription.ForLoadedType.m289of(cls))));
            methodVisitor.visitInsn(83);
            methodVisitor.visitIincInsn(3, 1);
            methodVisitor.visitJumpInsn(167, label2);
            methodVisitor.visitLabel(label4);
            context.getFrameGeneration().chop(methodVisitor, 1, CompoundList.m478of(Collections.singletonList(context.getInstrumentedType()), methodDescription.getParameters().asTypeList(), Collections.singletonList(TypeDescription.ForLoadedType.m289of(Object[].class))));
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
            return this.targetLabel.hashCode() + AbstractC3275.m5129(getClass().hashCode() * 31, 31, this.sourceLabel);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            return this.targetHandle.hashCode() + AbstractC3275.m5129(getClass().hashCode() * 31, 31, this.sourceHandle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            context.getFrameGeneration().same(methodVisitor, CompoundList.m475of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitInsn(190);
            methodVisitor.visitTypeInsn(189, Type.getInternalName(this.targetLabel));
            methodVisitor.visitVarInsn(58, 2);
            methodVisitor.visitInsn(3);
            methodVisitor.visitVarInsn(54, 3);
            methodVisitor.visitLabel(label2);
            context.getFrameGeneration().append(methodVisitor, Arrays.asList(TypeDescription.ArrayProjection.m287of(TypeDescription.ForLoadedType.m289of(this.targetLabel)), TypeDescription.ForLoadedType.m289of(Integer.TYPE)), CompoundList.m475of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
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
            methodVisitor.visitMethodInsn(183, context.getInstrumentedType().getInternalName(), "label", Type.getMethodDescriptor(Type.getType(this.targetLabel), Type.getType(this.sourceLabel)), false);
            methodVisitor.visitInsn(83);
            methodVisitor.visitIincInsn(3, 1);
            methodVisitor.visitJumpInsn(167, label2);
            methodVisitor.visitLabel(label3);
            context.getFrameGeneration().chop(methodVisitor, 1, CompoundList.m478of(Collections.singletonList(context.getInstrumentedType()), methodDescription.getParameters().asTypeList(), Collections.singletonList(TypeDescription.ArrayProjection.m287of(TypeDescription.ForLoadedType.m289of(this.targetLabel)))));
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
            return this.targetLabel.hashCode() + AbstractC3275.m5129(getClass().hashCode() * 31, 31, this.sourceLabel);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            context.getFrameGeneration().same(methodVisitor, CompoundList.m475of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
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
            context.getFrameGeneration().append(methodVisitor, Collections.singletonList(TypeDescription.ForLoadedType.m289of(this.target)), CompoundList.m475of(context.getInstrumentedType(), methodDescription.getParameters().asTypeList()));
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
            return this.target.hashCode() + (getClass().hashCode() * 31);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            return this.type.hashCode() + (getClass().hashCode() * 31);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            context.getFrameGeneration().same1(methodVisitor, TypeDescription.ForLoadedType.m289of(this.targetTypePath), methodDescription.getParameters().asTypeList());
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
            return this.targetTypePath.hashCode() + AbstractC3275.m5129(getClass().hashCode() * 31, 31, this.sourceTypePath);
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

    /* JADX INFO: renamed from: of */
    public static <S> ClassVisitorFactory<S> m220of(Class<S> cls) {
        return m221of(cls, new ByteBuddy().with(TypeValidation.DISABLED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DynamicType toAttributeWrapper(DynamicType.Builder<?> builder, Class<?> cls, Class<?> cls2, TypeDescription typeDescription, TypeDescription typeDescription2) {
        Visibility visibility = Visibility.PUBLIC;
        return builder.defineField("delegate", cls2, visibility, FieldManifestation.FINAL).defineConstructor(visibility).withParameters(cls2).intercept(MethodCall.invoke(cls.getDeclaredConstructor(String.class)).onSuper().with(new StackManipulation.Compound(MethodVariableAccess.REFERENCE.loadFrom(1), FieldAccess.forField((FieldDescription.InDefinedShape) new FieldDescription.ForLoadedField(cls2.getField("type"))).read()), String.class).andThen(FieldAccessor.ofField("delegate").setsArgumentAt(0))).defineMethod("attribute", cls, visibility, Ownership.STATIC).withParameters(cls2).intercept(new Implementation.Simple(new AttributeTranslator(cls, cls2, typeDescription, typeDescription2))).method(ElementMatchers.isProtected()).intercept(ExceptionMethod.throwing((Class<? extends Throwable>) UnsupportedOperationException.class)).method(ElementMatchers.named("isUnknown")).intercept(MethodCall.invoke(cls2.getMethod("isUnknown", null)).onField("delegate")).method(ElementMatchers.named("isCodeAttribute")).intercept(MethodCall.invoke(cls2.getMethod("isCodeAttribute", null)).onField("delegate")).make();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MethodCall.ArgumentLoader.Factory toConvertedParameter(TypeDescription typeDescription, Class<?> cls, String str, int i, boolean z) {
        return new MethodCall.ArgumentLoader.ForStackManipulation(new StackManipulation.Compound(z ? MethodVariableAccess.loadThis() : StackManipulation.Trivial.INSTANCE, MethodVariableAccess.REFERENCE.loadFrom(i), MethodInvocation.invoke((MethodDescription.InDefinedShape) typeDescription.getDeclaredMethods().filter(ElementMatchers.named(str)).getOnly())), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DynamicType.Builder<?> toMethodVisitorBuilder(ByteBuddy byteBuddy, Class<?> cls, Class<?> cls2, @MaybeNull Class<?> cls3, @MaybeNull Class<?> cls4, @MaybeNull Class<?> cls5, @MaybeNull Class<?> cls6, @MaybeNull Class<?> cls7, @MaybeNull Class<?> cls8, @MaybeNull Class<?> cls9, @MaybeNull Class<?> cls10, @MaybeNull Class<?> cls11, @MaybeNull Class<?> cls12) {
        DynamicType.Builder visitorBuilder = toVisitorBuilder(byteBuddy, cls, cls2, cls3, cls4, FieldAccessor.ofField(LABELS).setsValue(new StackManipulation.Compound(TypeCreation.m437of(TypeDescription.ForLoadedType.m289of(HashMap.class)), Duplication.SINGLE, MethodInvocation.invoke((MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.m289of(HashMap.class).getDeclaredMethods().filter(ElementMatchers.isConstructor().and(ElementMatchers.takesArguments(0))).getOnly())), Map.class));
        if (cls5 != null && cls6 != null) {
            Visibility visibility = Visibility.PRIVATE;
            visitorBuilder = visitorBuilder.defineField(LABELS, Map.class, visibility, FieldManifestation.FINAL).defineMethod("label", cls6, visibility).withParameters(cls5).intercept(new Implementation.Simple(new LabelTranslator(cls6))).defineMethod(LABELS, TypeDescription.ArrayProjection.m287of(TypeDescription.ForLoadedType.m289of(cls6)), visibility).withParameters(TypeDescription.ArrayProjection.m287of(TypeDescription.ForLoadedType.m289of(cls5))).intercept(new Implementation.Simple(new LabelArrayTranslator(cls5, cls6))).defineMethod("frames", Object[].class, visibility).withParameters(Object[].class).intercept(new Implementation.Simple(new FrameTranslator(cls5, cls6)));
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
    public static DynamicType.Builder<?> toVisitorBuilder(ByteBuddy byteBuddy, Class<?> cls, Class<?> cls2, @MaybeNull Class<?> cls3, @MaybeNull Class<?> cls4, Implementation implementation) {
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
        return this.type.hashCode() + (getClass().hashCode() * 31);
    }

    public abstract ClassVisitor unwrap(T t);

    public abstract T wrap(ClassVisitor classVisitor);

    /* JADX INFO: renamed from: of */
    public static <S> ClassVisitorFactory<S> m221of(Class<S> cls, ByteBuddy byteBuddy) {
        return (ClassVisitorFactory) doPrivileged(new CreateClassVisitorFactory(cls, byteBuddy));
    }
}
