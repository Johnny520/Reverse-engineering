package net.bytebuddy.asm;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.ByteCodeElement;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.enumeration.EnumerationDescription;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.field.FieldList;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.TypeList;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.TargetType;
import net.bytebuddy.dynamic.scaffold.FieldLocator;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.implementation.bytecode.TypeCreation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.constant.FieldConstant;
import net.bytebuddy.implementation.bytecode.constant.MethodConstant;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.implementation.bytecode.constant.SerializedConstant;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.utility.ConstantValue;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.JavaType;
import net.bytebuddy.utility.OpenedClassReader;
import net.bytebuddy.utility.nullability.MaybeNull;
import net.bytebuddy.utility.visitor.LocalVariableAwareMethodVisitor;

/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class MemberSubstitution implements AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {
    protected static final int THIS_REFERENCE = 0;
    private final boolean failIfNoMatch;
    private final MethodGraph.Compiler methodGraphCompiler;
    private final Replacement.Factory replacementFactory;
    private final boolean strict;
    private final TypePoolResolver typePoolResolver;

    /* JADX INFO: renamed from: net.bytebuddy.asm.MemberSubstitution$1 */
    public static /* synthetic */ class C26701 {

        /* JADX INFO: renamed from: $SwitchMap$net$bytebuddy$asm$MemberSubstitution$Replacement$InvocationType */
        static final /* synthetic */ int[] f4222x5ede2ab3;

        static {
            int[] iArr = new int[Replacement.InvocationType.values().length];
            f4222x5ede2ab3 = iArr;
            try {
                iArr[Replacement.InvocationType.VIRTUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4222x5ede2ab3[Replacement.InvocationType.SUPER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AllArguments {
        boolean includeSelf() default false;

        boolean nullIfEmpty() default false;

        Source source() default Source.SUBSTITUTED_ELEMENT;

        Assigner.Typing typing() default Assigner.Typing.STATIC;
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Argument {
        boolean optional() default false;

        Source source() default Source.SUBSTITUTED_ELEMENT;

        Assigner.Typing typing() default Assigner.Typing.STATIC;

        int value();
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Current {
        Assigner.Typing typing() default Assigner.Typing.STATIC;
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface FieldGetterHandle {
        Class<?> declaringType() default void.class;

        String value() default "";
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface FieldSetterHandle {
        Class<?> declaringType() default void.class;

        String value() default "";
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface FieldValue {
        Class<?> declaringType() default void.class;

        Assigner.Typing typing() default Assigner.Typing.STATIC;

        String value() default "";
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Origin {
        Source source() default Source.SUBSTITUTED_ELEMENT;
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface SelfCallHandle {
        boolean bound() default true;

        Source source() default Source.SUBSTITUTED_ELEMENT;
    }

    public enum Source {
        SUBSTITUTED_ELEMENT { // from class: net.bytebuddy.asm.MemberSubstitution.Source.1
            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            @MaybeNull
            public Value argument(int i, TypeList.Generic generic, Map<Integer, Integer> map, ByteCodeElement.Member member, MethodDescription methodDescription) {
                if (i < generic.size() - (!member.isStatic() ? 1 : 0)) {
                    return new Value(generic.get((!member.isStatic() ? 1 : 0) + i), map.get(Integer.valueOf(i + (!member.isStatic() ? 1 : 0))).intValue());
                }
                return null;
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            public List<Value> arguments(boolean z, TypeList.Generic generic, Map<Integer, Integer> map, ByteCodeElement.Member member, MethodDescription methodDescription) {
                int i = 0;
                ArrayList arrayList = new ArrayList(generic.size() - ((z || member.isStatic()) ? 0 : 1));
                if (!member.isStatic() && !z) {
                    i = 1;
                }
                while (i < generic.size()) {
                    arrayList.add(new Value(generic.get(i), map.get(Integer.valueOf(i)).intValue()));
                    i++;
                }
                return arrayList;
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            public ByteCodeElement.Member element(ByteCodeElement.Member member, MethodDescription methodDescription) {
                return member;
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            public JavaConstant.MethodHandle handle(JavaConstant.MethodHandle methodHandle, MethodDescription methodDescription) {
                return methodHandle;
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            public boolean isRepresentable(Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort sort, ByteCodeElement.Member member, MethodDescription methodDescription) {
                return sort.isRepresentable(member);
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            public StackManipulation resolve(Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort sort, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, MethodDescription methodDescription) {
                return sort.resolve(member, generic.asErasures(), generic2.asErasure());
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            @MaybeNull
            public Value self(TypeList.Generic generic, Map<Integer, Integer> map, ByteCodeElement.Member member, MethodDescription methodDescription) {
                if (member.isStatic()) {
                    return null;
                }
                return new Value(generic.get(0), map.get(0).intValue());
            }
        },
        ENCLOSING_METHOD { // from class: net.bytebuddy.asm.MemberSubstitution.Source.2
            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            @MaybeNull
            public Value argument(int i, TypeList.Generic generic, Map<Integer, Integer> map, ByteCodeElement.Member member, MethodDescription methodDescription) {
                if (i >= methodDescription.getParameters().size()) {
                    return null;
                }
                ParameterDescription parameterDescription = (ParameterDescription) methodDescription.getParameters().get(i);
                return new Value(parameterDescription.getType(), parameterDescription.getOffset());
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            public List<Value> arguments(boolean z, TypeList.Generic generic, Map<Integer, Integer> map, ByteCodeElement.Member member, MethodDescription methodDescription) {
                ArrayList arrayList;
                if (!z || methodDescription.isStatic()) {
                    arrayList = new ArrayList(methodDescription.getParameters().size());
                } else {
                    arrayList = new ArrayList(methodDescription.getParameters().size() + 1);
                    arrayList.add(new Value(methodDescription.getDeclaringType().asGenericType(), 0));
                }
                Iterator<?> it = methodDescription.getParameters().iterator();
                while (it.hasNext()) {
                    ParameterDescription parameterDescription = (ParameterDescription) it.next();
                    arrayList.add(new Value(parameterDescription.getType(), parameterDescription.getOffset()));
                }
                return arrayList;
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            public ByteCodeElement.Member element(ByteCodeElement.Member member, MethodDescription methodDescription) {
                return methodDescription;
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            public JavaConstant.MethodHandle handle(JavaConstant.MethodHandle methodHandle, MethodDescription methodDescription) {
                return JavaConstant.MethodHandle.m5418of(methodDescription.asDefined());
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            public boolean isRepresentable(Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort sort, ByteCodeElement.Member member, MethodDescription methodDescription) {
                return sort.isRepresentable(methodDescription);
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            public StackManipulation resolve(Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort sort, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, MethodDescription methodDescription) {
                return sort.resolve(methodDescription, (methodDescription.isStatic() || methodDescription.isConstructor()) ? methodDescription.getParameters().asTypeList().asErasures() : CompoundList.m5412of(methodDescription.getDeclaringType().asErasure(), methodDescription.getParameters().asTypeList().asErasures()), methodDescription.isConstructor() ? methodDescription.getDeclaringType().asErasure() : methodDescription.getReturnType().asErasure());
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Source
            @MaybeNull
            public Value self(TypeList.Generic generic, Map<Integer, Integer> map, ByteCodeElement.Member member, MethodDescription methodDescription) {
                if (methodDescription.isStatic()) {
                    return null;
                }
                return new Value(methodDescription.getDeclaringType().asGenericType(), 0);
            }
        };

        @HashCodeAndEqualsPlugin.Enhance
        public static class Value {
            private final int offset;
            private final TypeDescription.Generic typeDescription;

            public Value(TypeDescription.Generic generic, int i) {
                this.typeDescription = generic;
                this.offset = i;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Value value = (Value) obj;
                return this.offset == value.offset && this.typeDescription.equals(value.typeDescription);
            }

            public int getOffset() {
                return this.offset;
            }

            public TypeDescription.Generic getTypeDescription() {
                return this.typeDescription;
            }

            public int hashCode() {
                return (((getClass().hashCode() * 31) + this.typeDescription.hashCode()) * 31) + this.offset;
            }
        }

        @MaybeNull
        public abstract Value argument(int i, TypeList.Generic generic, Map<Integer, Integer> map, ByteCodeElement.Member member, MethodDescription methodDescription);

        public abstract List<Value> arguments(boolean z, TypeList.Generic generic, Map<Integer, Integer> map, ByteCodeElement.Member member, MethodDescription methodDescription);

        public abstract ByteCodeElement.Member element(ByteCodeElement.Member member, MethodDescription methodDescription);

        public abstract JavaConstant.MethodHandle handle(JavaConstant.MethodHandle methodHandle, MethodDescription methodDescription);

        public abstract boolean isRepresentable(Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort sort, ByteCodeElement.Member member, MethodDescription methodDescription);

        public abstract StackManipulation resolve(Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort sort, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, MethodDescription methodDescription);

        @MaybeNull
        public abstract Value self(TypeList.Generic generic, Map<Integer, Integer> map, ByteCodeElement.Member member, MethodDescription methodDescription);

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:2) call: net.bytebuddy.asm.MemberSubstitution.Source.<init>(java.lang.String, int):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* synthetic */ Source(C26701 c26701) {
            this();
        }
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface StubValue {
        Source source() default Source.SUBSTITUTED_ELEMENT;
    }

    public static class SubstitutingMethodVisitor extends LocalVariableAwareMethodVisitor {
        private final boolean failIfNoMatch;
        private final Implementation.Context implementationContext;
        private final MethodDescription instrumentedMethod;
        private final TypeDescription instrumentedType;
        private int localVariableExtension;
        private boolean matched;
        private final MethodGraph.Compiler methodGraphCompiler;
        private final Replacement replacement;
        private int stackSizeBuffer;
        private final boolean strict;
        private final TypePool typePool;
        private final boolean virtualPrivateCalls;

        public class LocalVariableTracingMethodVisitor extends MethodVisitor {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 net.bytebuddy.asm.MemberSubstitution$SubstitutingMethodVisitor), (r2v0 net.bytebuddy.jar.asm.MethodVisitor) A[MD:(net.bytebuddy.asm.MemberSubstitution$SubstitutingMethodVisitor, net.bytebuddy.jar.asm.MethodVisitor):void (m)] (LINE:1) call: net.bytebuddy.asm.MemberSubstitution.SubstitutingMethodVisitor.LocalVariableTracingMethodVisitor.<init>(net.bytebuddy.asm.MemberSubstitution$SubstitutingMethodVisitor, net.bytebuddy.jar.asm.MethodVisitor):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ LocalVariableTracingMethodVisitor(SubstitutingMethodVisitor substitutingMethodVisitor, MethodVisitor methodVisitor, C26701 c26701) {
                this(methodVisitor);
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            @SuppressFBWarnings(justification = "No action required on default option.", value = {"SF_SWITCH_NO_DEFAULT"})
            public void visitVarInsn(int i, int i2) {
                switch (i) {
                    case 54:
                    case 56:
                    case 58:
                        SubstitutingMethodVisitor substitutingMethodVisitor = SubstitutingMethodVisitor.this;
                        substitutingMethodVisitor.localVariableExtension = Math.max(substitutingMethodVisitor.localVariableExtension, i2 + 1);
                        break;
                    case 55:
                    case 57:
                        SubstitutingMethodVisitor substitutingMethodVisitor2 = SubstitutingMethodVisitor.this;
                        substitutingMethodVisitor2.localVariableExtension = Math.max(substitutingMethodVisitor2.localVariableExtension, i2 + 2);
                        break;
                }
                super.visitVarInsn(i, i2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private LocalVariableTracingMethodVisitor(MethodVisitor methodVisitor) {
                super(OpenedClassReader.ASM_API, methodVisitor);
            }
        }

        public SubstitutingMethodVisitor(MethodVisitor methodVisitor, TypeDescription typeDescription, MethodDescription methodDescription, MethodGraph.Compiler compiler, boolean z, boolean z2, Replacement replacement, Implementation.Context context, TypePool typePool, boolean z3) {
            super(methodVisitor, methodDescription);
            this.instrumentedType = typeDescription;
            this.instrumentedMethod = methodDescription;
            this.methodGraphCompiler = compiler;
            this.strict = z;
            this.failIfNoMatch = z2;
            this.replacement = replacement;
            this.implementationContext = context;
            this.typePool = typePool;
            this.virtualPrivateCalls = z3;
            this.stackSizeBuffer = 0;
            this.localVariableExtension = 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x015c  */
        @Override // net.bytebuddy.jar.asm.MethodVisitor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void visitFieldInsn(int i, String str, String str2, String str3) {
            FieldList fieldListFilter;
            TypeList.Generic empty;
            TypeDescription.Generic type;
            TypeList.Generic.Explicit explicit;
            TypeDescription.Generic genericM5245of;
            TypeList.Generic generic;
            TypeDescription.Generic generic2;
            boolean z = false;
            TypePool.Resolution resolutionDescribe = this.typePool.describe(str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
            if (resolutionDescribe.isResolved()) {
                Iterator<TypeDefinition> it = resolutionDescribe.resolve().iterator();
                do {
                    fieldListFilter = it.next().getDeclaredFields().filter(this.strict ? ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3)) : ElementMatchers.failSafe(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3))));
                    if (!it.hasNext()) {
                        break;
                    }
                } while (fieldListFilter.isEmpty());
                if (!fieldListFilter.isEmpty()) {
                    Replacement.Binding bindingBind = this.replacement.bind(this.instrumentedType, this.instrumentedMethod, resolutionDescribe.resolve(), (FieldDescription) fieldListFilter.getOnly(), i == 181 || i == 179);
                    if (bindingBind.isBound()) {
                        switch (i) {
                            case 178:
                                empty = new TypeList.Generic.Empty();
                                type = ((FieldDescription) fieldListFilter.getOnly()).getType();
                                generic = empty;
                                generic2 = type;
                                z = true;
                                this.stackSizeBuffer = Math.max(this.stackSizeBuffer, bindingBind.make(generic, generic2, !z ? JavaConstant.MethodHandle.ofGetter(((FieldDescription) fieldListFilter.getOnly()).asDefined()) : JavaConstant.MethodHandle.ofSetter(((FieldDescription) fieldListFilter.getOnly()).asDefined()), !z ? FieldAccess.forField((FieldDescription) fieldListFilter.getOnly()).read() : FieldAccess.forField((FieldDescription) fieldListFilter.getOnly()).write(), getFreeOffset()).apply(new LocalVariableTracingMethodVisitor(this, this.f4228mv, null), this.implementationContext).getMaximalSize());
                                this.matched = true;
                                return;
                            case 179:
                                explicit = new TypeList.Generic.Explicit(((FieldDescription) fieldListFilter.getOnly()).getType());
                                genericM5245of = TypeDescription.Generic.OfNonGenericType.ForLoadedType.m5245of(Void.TYPE);
                                generic = explicit;
                                generic2 = genericM5245of;
                                this.stackSizeBuffer = Math.max(this.stackSizeBuffer, bindingBind.make(generic, generic2, !z ? JavaConstant.MethodHandle.ofGetter(((FieldDescription) fieldListFilter.getOnly()).asDefined()) : JavaConstant.MethodHandle.ofSetter(((FieldDescription) fieldListFilter.getOnly()).asDefined()), !z ? FieldAccess.forField((FieldDescription) fieldListFilter.getOnly()).read() : FieldAccess.forField((FieldDescription) fieldListFilter.getOnly()).write(), getFreeOffset()).apply(new LocalVariableTracingMethodVisitor(this, this.f4228mv, null), this.implementationContext).getMaximalSize());
                                this.matched = true;
                                return;
                            case 180:
                                empty = new TypeList.Generic.Explicit(((FieldDescription) fieldListFilter.getOnly()).getDeclaringType());
                                type = ((FieldDescription) fieldListFilter.getOnly()).getType();
                                generic = empty;
                                generic2 = type;
                                z = true;
                                this.stackSizeBuffer = Math.max(this.stackSizeBuffer, bindingBind.make(generic, generic2, !z ? JavaConstant.MethodHandle.ofGetter(((FieldDescription) fieldListFilter.getOnly()).asDefined()) : JavaConstant.MethodHandle.ofSetter(((FieldDescription) fieldListFilter.getOnly()).asDefined()), !z ? FieldAccess.forField((FieldDescription) fieldListFilter.getOnly()).read() : FieldAccess.forField((FieldDescription) fieldListFilter.getOnly()).write(), getFreeOffset()).apply(new LocalVariableTracingMethodVisitor(this, this.f4228mv, null), this.implementationContext).getMaximalSize());
                                this.matched = true;
                                return;
                            case 181:
                                explicit = new TypeList.Generic.Explicit(((FieldDescription) fieldListFilter.getOnly()).getDeclaringType(), ((FieldDescription) fieldListFilter.getOnly()).getType());
                                genericM5245of = TypeDescription.Generic.OfNonGenericType.ForLoadedType.m5245of(Void.TYPE);
                                generic = explicit;
                                generic2 = genericM5245of;
                                this.stackSizeBuffer = Math.max(this.stackSizeBuffer, bindingBind.make(generic, generic2, !z ? JavaConstant.MethodHandle.ofGetter(((FieldDescription) fieldListFilter.getOnly()).asDefined()) : JavaConstant.MethodHandle.ofSetter(((FieldDescription) fieldListFilter.getOnly()).asDefined()), !z ? FieldAccess.forField((FieldDescription) fieldListFilter.getOnly()).read() : FieldAccess.forField((FieldDescription) fieldListFilter.getOnly()).write(), getFreeOffset()).apply(new LocalVariableTracingMethodVisitor(this, this.f4228mv, null), this.implementationContext).getMaximalSize());
                                this.matched = true;
                                return;
                            default:
                                throw new IllegalStateException("Unexpected opcode: " + i);
                        }
                    }
                } else if (this.strict) {
                    throw new IllegalStateException("Could not resolve " + str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) + "." + str2 + str3 + " using " + this.typePool);
                }
            } else if (this.strict) {
                throw new IllegalStateException("Could not resolve " + str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) + " using " + this.typePool);
            }
            super.visitFieldInsn(i, str, str2, str3);
        }

        @Override // net.bytebuddy.jar.asm.MethodVisitor
        public void visitMaxs(int i, int i2) {
            if (!this.failIfNoMatch || this.matched) {
                super.visitMaxs(i + this.stackSizeBuffer, Math.max(this.localVariableExtension, i2));
                return;
            }
            throw new IllegalStateException("No substitution found within " + this.instrumentedMethod + " of " + this.instrumentedType);
        }

        @Override // net.bytebuddy.jar.asm.MethodVisitor
        public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
            MethodList methodListFilter;
            MethodList methodList;
            TypePool.Resolution resolutionDescribe = this.typePool.describe(str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
            if (resolutionDescribe.isResolved()) {
                if (i == 183 && str2.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
                    methodListFilter = resolutionDescribe.resolve().getDeclaredMethods().filter(this.strict ? ElementMatchers.isConstructor().and(ElementMatchers.hasDescriptor(str3)) : ElementMatchers.failSafe(ElementMatchers.isConstructor().and(ElementMatchers.hasDescriptor(str3))));
                } else if (i == 184) {
                    Iterator<TypeDefinition> it = resolutionDescribe.resolve().iterator();
                    do {
                        methodList = (MethodList) it.next().getDeclaredMethods().filter(this.strict ? ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3)) : ElementMatchers.failSafe(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3))));
                        if (!it.hasNext()) {
                            break;
                        }
                    } while (methodList.isEmpty());
                    methodListFilter = methodList;
                } else if (i == 183) {
                    methodListFilter = resolutionDescribe.resolve().getDeclaredMethods().filter(this.strict ? ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3)) : ElementMatchers.failSafe(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3))));
                } else if (this.virtualPrivateCalls) {
                    methodListFilter = resolutionDescribe.resolve().getDeclaredMethods().filter(this.strict ? ElementMatchers.isPrivate().and(ElementMatchers.not(ElementMatchers.isStatic())).and(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3))) : ElementMatchers.failSafe(ElementMatchers.isPrivate().and(ElementMatchers.not(ElementMatchers.isStatic())).and(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3)))));
                    if (methodListFilter.isEmpty()) {
                        methodListFilter = (MethodList) this.methodGraphCompiler.compile((TypeDefinition) resolutionDescribe.resolve(), this.instrumentedType).listNodes().asMethodList().filter(this.strict ? ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3)) : ElementMatchers.failSafe(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3))));
                    }
                } else {
                    methodListFilter = this.methodGraphCompiler.compile((TypeDefinition) resolutionDescribe.resolve(), this.instrumentedType).listNodes().asMethodList().filter(this.strict ? ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3)) : ElementMatchers.failSafe(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3))));
                }
                if (!methodListFilter.isEmpty()) {
                    Replacement.Binding bindingBind = this.replacement.bind(this.instrumentedType, this.instrumentedMethod, resolutionDescribe.resolve(), (MethodDescription) methodListFilter.getOnly(), Replacement.InvocationType.m5181of(i, (MethodDescription) methodListFilter.getOnly()));
                    if (bindingBind.isBound()) {
                        StackManipulation.Size sizeApply = bindingBind.make((((MethodDescription) methodListFilter.getOnly()).isStatic() || ((MethodDescription) methodListFilter.getOnly()).isConstructor()) ? ((MethodDescription) methodListFilter.getOnly()).getParameters().asTypeList() : new TypeList.Generic.Explicit((List<? extends TypeDefinition>) CompoundList.m5412of(resolutionDescribe.resolve(), ((MethodDescription) methodListFilter.getOnly()).getParameters().asTypeList())), ((MethodDescription) methodListFilter.getOnly()).isConstructor() ? ((MethodDescription) methodListFilter.getOnly()).getDeclaringType().asGenericType() : ((MethodDescription) methodListFilter.getOnly()).getReturnType(), (i == 183 && ((MethodDescription) methodListFilter.getOnly()).isMethod() && !((MethodDescription) methodListFilter.getOnly()).isPrivate()) ? JavaConstant.MethodHandle.ofSpecial(((MethodDescription) methodListFilter.getOnly()).asDefined(), resolutionDescribe.resolve()) : JavaConstant.MethodHandle.m5418of(((MethodDescription) methodListFilter.getOnly()).asDefined()), (i == 183 && ((MethodDescription) methodListFilter.getOnly()).isMethod() && !((MethodDescription) methodListFilter.getOnly()).isPrivate()) ? MethodInvocation.invoke((MethodDescription) methodListFilter.getOnly()).special(resolutionDescribe.resolve()) : MethodInvocation.invoke((MethodDescription) methodListFilter.getOnly()), getFreeOffset()).apply(new LocalVariableTracingMethodVisitor(this, this.f4228mv, null), this.implementationContext);
                        if (((MethodDescription) methodListFilter.getOnly()).isConstructor()) {
                            int iMax = Math.max(this.stackSizeBuffer, sizeApply.getMaximalSize() + 2);
                            this.stackSizeBuffer = iMax;
                            Duplication duplication = Duplication.SINGLE;
                            StackManipulation stackManipulationFlipOver = duplication.flipOver(TypeDescription.ForLoadedType.m5238of(Object.class));
                            StackManipulation stackManipulationFlipOver2 = duplication.flipOver(TypeDescription.ForLoadedType.m5238of(Object.class));
                            Removal removal = Removal.SINGLE;
                            this.stackSizeBuffer = Math.max(iMax, new StackManipulation.Compound(stackManipulationFlipOver, removal, removal, stackManipulationFlipOver2, removal, removal).apply(this.f4228mv, this.implementationContext).getMaximalSize() + StackSize.SINGLE.getSize());
                        } else {
                            this.stackSizeBuffer = Math.max(this.stackSizeBuffer, sizeApply.getMaximalSize());
                        }
                        this.matched = true;
                        return;
                    }
                } else if (this.strict) {
                    throw new IllegalStateException("Could not resolve " + str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) + "." + str2 + str3 + " using " + this.typePool);
                }
            } else if (this.strict) {
                throw new IllegalStateException("Could not resolve " + str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) + " using " + this.typePool);
            }
            super.visitMethodInsn(i, str, str2, str3, z);
        }
    }

    public interface Substitution {

        @HashCodeAndEqualsPlugin.Enhance
        public static class Chain implements Substitution {
            private final Assigner assigner;
            private final List<Step> steps;
            private final Assigner.Typing typing;

            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements Factory {
                private final Assigner assigner;
                private final List<Step.Factory> steps;
                private final Assigner.Typing typing;

                public Factory(Assigner assigner, Assigner.Typing typing, List<Step.Factory> list) {
                    this.assigner = assigner;
                    this.typing = typing;
                    this.steps = list;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Factory factory = (Factory) obj;
                    return this.typing.equals(factory.typing) && this.assigner.equals(factory.assigner) && this.steps.equals(factory.steps);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Factory executing(Step.Factory... factoryArr) {
                    return executing(Arrays.asList(factoryArr));
                }

                public int hashCode() {
                    return (((((getClass().hashCode() * 31) + this.assigner.hashCode()) * 31) + this.typing.hashCode()) * 31) + this.steps.hashCode();
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public Substitution make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                    if (this.steps.isEmpty()) {
                        return Stubbing.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList(this.steps.size());
                    Iterator<Step.Factory> it = this.steps.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().make(this.assigner, this.typing, typeDescription, methodDescription));
                    }
                    return new Chain(this.assigner, this.typing, arrayList);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Factory executing(List<? extends Step.Factory> list) {
                    return new Factory(this.assigner, this.typing, CompoundList.m5414of((List) this.steps, (List) list));
                }
            }

            public interface Step {

                public interface Factory {
                    Step make(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription);
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForArgumentLoading implements Step, Factory {
                    private final int index;

                    public ForArgumentLoading(int i) {
                        this.index = i;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.index == ((ForArgumentLoading) obj).index;
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.index;
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                    public Step make(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                        return this;
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public Resolution resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, TypeDescription.Generic generic3, Map<Integer, Integer> map, int i) {
                        if (this.index < generic.size()) {
                            return new Simple(new StackManipulation.Compound(Removal.m5370of(generic3), MethodVariableAccess.m5387of(generic.get(this.index)).loadFrom(map.get(Integer.valueOf(this.index)).intValue())), generic.get(this.index));
                        }
                        throw new IllegalStateException(member + " has not " + this.index + " arguments");
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForArgumentSubstitution implements Step {
                    private final Assigner assigner;
                    private final int index;
                    private final StackManipulation substitution;
                    private final TypeDescription.Generic typeDescription;
                    private final Assigner.Typing typing;

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Factory implements Factory {
                        private final int index;
                        private final StackManipulation stackManipulation;
                        private final TypeDescription.Generic typeDescription;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public Factory(StackManipulation stackManipulation, Type type, int i) {
                            this(stackManipulation, TypeDefinition.Sort.describe(type), i);
                        }

                        public boolean equals(@MaybeNull Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            Factory factory = (Factory) obj;
                            return this.index == factory.index && this.stackManipulation.equals(factory.stackManipulation) && this.typeDescription.equals(factory.typeDescription);
                        }

                        public int hashCode() {
                            return (((((getClass().hashCode() * 31) + this.stackManipulation.hashCode()) * 31) + this.typeDescription.hashCode()) * 31) + this.index;
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                        public Step make(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                            return new ForArgumentSubstitution(this.stackManipulation, this.typeDescription, this.index, assigner, typing);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        public Factory(StackManipulation stackManipulation, TypeDescription.Generic generic, int i) {
                            this.stackManipulation = stackManipulation;
                            this.typeDescription = generic;
                            this.index = i;
                        }
                    }

                    public ForArgumentSubstitution(StackManipulation stackManipulation, TypeDescription.Generic generic, int i, Assigner assigner, Assigner.Typing typing) {
                        this.substitution = stackManipulation;
                        this.typeDescription = generic;
                        this.index = i;
                        this.assigner = assigner;
                        this.typing = typing;
                    }

                    /* JADX INFO: renamed from: of */
                    public static Factory m5182of(Object obj, int i) {
                        if (i >= 0) {
                            ConstantValue constantValueWrap = ConstantValue.Simple.wrap(obj);
                            return new Factory(constantValueWrap.toStackManipulation(), constantValueWrap.getTypeDescription().asGenericType(), i);
                        }
                        throw new IllegalArgumentException("Index cannot be negative: " + i);
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForArgumentSubstitution forArgumentSubstitution = (ForArgumentSubstitution) obj;
                        return this.index == forArgumentSubstitution.index && this.typing.equals(forArgumentSubstitution.typing) && this.substitution.equals(forArgumentSubstitution.substitution) && this.typeDescription.equals(forArgumentSubstitution.typeDescription) && this.assigner.equals(forArgumentSubstitution.assigner);
                    }

                    public int hashCode() {
                        return (((((((((getClass().hashCode() * 31) + this.substitution.hashCode()) * 31) + this.typeDescription.hashCode()) * 31) + this.index) * 31) + this.assigner.hashCode()) * 31) + this.typing.hashCode();
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public Resolution resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, TypeDescription.Generic generic3, Map<Integer, Integer> map, int i) {
                        if (this.index >= generic.size()) {
                            throw new IllegalStateException(member + " has not " + this.index + " arguments");
                        }
                        StackManipulation stackManipulationAssign = this.assigner.assign(this.typeDescription, generic.get(this.index), this.typing);
                        if (stackManipulationAssign.isValid()) {
                            return new Simple(new StackManipulation.Compound(this.substitution, stackManipulationAssign, MethodVariableAccess.m5387of(generic.get(this.index)).storeAt(map.get(Integer.valueOf(this.index)).intValue())), generic3);
                        }
                        throw new IllegalStateException("Cannot assign " + this.typeDescription + " to " + generic.get(this.index));
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForAssignment implements Step {
                    private final Assigner assigner;

                    @MaybeNull
                    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                    private final TypeDescription.Generic result;

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Factory implements Factory {

                        @MaybeNull
                        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                        private final TypeDescription.Generic result;

                        public Factory(@MaybeNull TypeDescription.Generic generic) {
                            this.result = generic;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[RETURN] */
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
                            TypeDescription.Generic generic = this.result;
                            TypeDescription.Generic generic2 = ((Factory) obj).result;
                            if (generic2 != null) {
                                return generic != null && generic.equals(generic2);
                            }
                            if (generic != null) {
                                return false;
                            }
                        }

                        public int hashCode() {
                            int iHashCode = getClass().hashCode() * 31;
                            TypeDescription.Generic generic = this.result;
                            return generic != null ? iHashCode + generic.hashCode() : iHashCode;
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                        public Step make(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                            return new ForAssignment(this.result, assigner);
                        }
                    }

                    public ForAssignment(@MaybeNull TypeDescription.Generic generic, Assigner assigner) {
                        this.result = generic;
                        this.assigner = assigner;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static Factory castTo(Type type) {
                        return new Factory(TypeDefinition.Sort.describe(type));
                    }

                    public static Factory castToSubstitutionResult() {
                        return new Factory(null);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
                    
                        if (r2 != null) goto L18;
                     */
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
                        TypeDescription.Generic generic = this.result;
                        ForAssignment forAssignment = (ForAssignment) obj;
                        TypeDescription.Generic generic2 = forAssignment.result;
                        if (generic2 != null) {
                            if (generic == null || !generic.equals(generic2)) {
                                return false;
                            }
                            return this.assigner.equals(forAssignment.assigner);
                        }
                    }

                    public int hashCode() {
                        int iHashCode = getClass().hashCode() * 31;
                        TypeDescription.Generic generic = this.result;
                        if (generic != null) {
                            iHashCode += generic.hashCode();
                        }
                        return (iHashCode * 31) + this.assigner.hashCode();
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public Resolution resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, TypeDescription.Generic generic3, Map<Integer, Integer> map, int i) {
                        Assigner assigner = this.assigner;
                        TypeDescription.Generic generic4 = this.result;
                        if (generic4 == null) {
                            generic4 = generic2;
                        }
                        StackManipulation stackManipulationAssign = assigner.assign(generic3, generic4, Assigner.Typing.DYNAMIC);
                        if (stackManipulationAssign.isValid()) {
                            TypeDescription.Generic generic5 = this.result;
                            if (generic5 != null) {
                                generic2 = generic5;
                            }
                            return new Simple(stackManipulationAssign, generic2);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to assign ");
                        sb.append(generic3);
                        sb.append(" to ");
                        TypeDescription.Generic generic6 = this.result;
                        if (generic6 != null) {
                            generic2 = generic6;
                        }
                        sb.append(generic2);
                        throw new IllegalStateException(sb.toString());
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    public static Factory castTo(TypeDescription.Generic generic) {
                        return new Factory(generic);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForDelegation implements Step {
                    private final Dispatcher.Resolved dispatcher;
                    private final List<OffsetMapping.Resolved> offsetMappings;
                    private final TypeDescription.Generic returned;

                    public interface BootstrapArgumentResolver {

                        public interface Factory {
                            BootstrapArgumentResolver make(MethodDescription.InDefinedShape inDefinedShape);
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class ForDefaultValues implements BootstrapArgumentResolver {
                            private final MethodDescription.InDefinedShape delegate;

                            public enum Factory implements Factory {
                                INSTANCE;

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Factory
                                public BootstrapArgumentResolver make(MethodDescription.InDefinedShape inDefinedShape) {
                                    return new ForDefaultValues(inDefinedShape);
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements Resolved {
                                private final MethodDescription.InDefinedShape delegate;
                                private final MethodDescription instrumentedMethod;
                                private final TypeDescription instrumentedType;

                                public Resolved(MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription, MethodDescription methodDescription) {
                                    this.delegate = inDefinedShape;
                                    this.instrumentedType = typeDescription;
                                    this.instrumentedMethod = methodDescription;
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Resolved resolved = (Resolved) obj;
                                    return this.delegate.equals(resolved.delegate) && this.instrumentedType.equals(resolved.instrumentedType) && this.instrumentedMethod.equals(resolved.instrumentedMethod);
                                }

                                public int hashCode() {
                                    return (((((getClass().hashCode() * 31) + this.delegate.hashCode()) * 31) + this.instrumentedType.hashCode()) * 31) + this.instrumentedMethod.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Resolved
                                public List<JavaConstant> make(TypeDescription typeDescription, ByteCodeElement.Member member, JavaConstant.MethodHandle methodHandle) {
                                    return this.instrumentedMethod.isTypeInitializer() ? Arrays.asList(JavaConstant.Simple.ofLoaded(this.delegate.getDeclaringType().getName()), JavaConstant.Simple.m5427of(typeDescription), JavaConstant.Simple.ofLoaded(member.getInternalName()), methodHandle, JavaConstant.Simple.m5427of(this.instrumentedType), JavaConstant.Simple.ofLoaded(this.instrumentedMethod.getInternalName())) : Arrays.asList(JavaConstant.Simple.ofLoaded(this.delegate.getDeclaringType().getName()), JavaConstant.Simple.m5427of(typeDescription), JavaConstant.Simple.ofLoaded(member.getInternalName()), methodHandle, JavaConstant.Simple.m5427of(this.instrumentedType), JavaConstant.Simple.ofLoaded(this.instrumentedMethod.getInternalName()), JavaConstant.MethodHandle.m5418of(this.instrumentedMethod.asDefined()));
                                }
                            }

                            public ForDefaultValues(MethodDescription.InDefinedShape inDefinedShape) {
                                this.delegate = inDefinedShape;
                            }

                            public boolean equals(@MaybeNull Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return obj != null && getClass() == obj.getClass() && this.delegate.equals(((ForDefaultValues) obj).delegate);
                            }

                            public int hashCode() {
                                return (getClass().hashCode() * 31) + this.delegate.hashCode();
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver
                            public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                                return new Resolved(this.delegate, typeDescription, methodDescription);
                            }
                        }

                        public interface Resolved {
                            List<JavaConstant> make(TypeDescription typeDescription, ByteCodeElement.Member member, JavaConstant.MethodHandle methodHandle);
                        }

                        Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription);
                    }

                    public interface Dispatcher {

                        public interface Factory {
                            Dispatcher make(MethodDescription.InDefinedShape inDefinedShape);
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class ForDynamicInvocation implements Dispatcher {
                            private final MethodDescription.InDefinedShape bootstrapMethod;
                            private final MethodDescription.InDefinedShape delegate;
                            private final BootstrapArgumentResolver resolver;

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Factory implements Factory {
                                private final MethodDescription.InDefinedShape bootstrapMethod;
                                private final BootstrapArgumentResolver.Factory resolverFactory;

                                public Factory(MethodDescription.InDefinedShape inDefinedShape, BootstrapArgumentResolver.Factory factory) {
                                    this.bootstrapMethod = inDefinedShape;
                                    this.resolverFactory = factory;
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Factory factory = (Factory) obj;
                                    return this.bootstrapMethod.equals(factory.bootstrapMethod) && this.resolverFactory.equals(factory.resolverFactory);
                                }

                                public int hashCode() {
                                    return (((getClass().hashCode() * 31) + this.bootstrapMethod.hashCode()) * 31) + this.resolverFactory.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Factory
                                public Dispatcher make(MethodDescription.InDefinedShape inDefinedShape) {
                                    return new ForDynamicInvocation(this.bootstrapMethod, inDefinedShape, this.resolverFactory.make(inDefinedShape));
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements Resolved {
                                private final MethodDescription.InDefinedShape bootstrapMethod;
                                private final MethodDescription.InDefinedShape delegate;
                                private final BootstrapArgumentResolver.Resolved resolver;

                                public Resolved(MethodDescription.InDefinedShape inDefinedShape, MethodDescription.InDefinedShape inDefinedShape2, BootstrapArgumentResolver.Resolved resolved) {
                                    this.bootstrapMethod = inDefinedShape;
                                    this.delegate = inDefinedShape2;
                                    this.resolver = resolved;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved
                                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, JavaConstant.MethodHandle methodHandle) {
                                    List<JavaConstant> listMake = this.resolver.make(typeDescription, member, methodHandle);
                                    if (this.bootstrapMethod.isInvokeBootstrap(TypeList.Explicit.m5255of((List<? extends JavaConstant>) listMake))) {
                                        return MethodInvocation.invoke(this.bootstrapMethod).dynamic(this.delegate.getInternalName(), this.delegate.getReturnType().asErasure(), this.delegate.getParameters().asTypeList().asErasures(), listMake);
                                    }
                                    throw new IllegalArgumentException(this.bootstrapMethod + " is not accepting advice bootstrap arguments: " + listMake);
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Resolved resolved = (Resolved) obj;
                                    return this.bootstrapMethod.equals(resolved.bootstrapMethod) && this.delegate.equals(resolved.delegate) && this.resolver.equals(resolved.resolver);
                                }

                                public int hashCode() {
                                    return (((((getClass().hashCode() * 31) + this.bootstrapMethod.hashCode()) * 31) + this.delegate.hashCode()) * 31) + this.resolver.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved
                                public StackManipulation initialize() {
                                    return StackManipulation.Trivial.INSTANCE;
                                }
                            }

                            public ForDynamicInvocation(MethodDescription.InDefinedShape inDefinedShape, MethodDescription.InDefinedShape inDefinedShape2, BootstrapArgumentResolver bootstrapArgumentResolver) {
                                this.bootstrapMethod = inDefinedShape;
                                this.delegate = inDefinedShape2;
                                this.resolver = bootstrapArgumentResolver;
                            }

                            /* JADX INFO: renamed from: of */
                            public static Factory m5187of(MethodDescription.InDefinedShape inDefinedShape, BootstrapArgumentResolver.Factory factory) {
                                if (inDefinedShape.isInvokeBootstrap()) {
                                    return new Factory(inDefinedShape, factory);
                                }
                                throw new IllegalStateException("Not a bootstrap method: " + inDefinedShape);
                            }

                            public boolean equals(@MaybeNull Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                ForDynamicInvocation forDynamicInvocation = (ForDynamicInvocation) obj;
                                return this.bootstrapMethod.equals(forDynamicInvocation.bootstrapMethod) && this.delegate.equals(forDynamicInvocation.delegate) && this.resolver.equals(forDynamicInvocation.resolver);
                            }

                            public int hashCode() {
                                return (((((getClass().hashCode() * 31) + this.bootstrapMethod.hashCode()) * 31) + this.delegate.hashCode()) * 31) + this.resolver.hashCode();
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher
                            public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                                return new Resolved(this.bootstrapMethod, this.delegate, this.resolver.resolve(typeDescription, methodDescription));
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class ForRegularInvocation implements Dispatcher, Resolved {
                            private final MethodDescription delegate;

                            public enum Factory implements Factory {
                                INSTANCE;

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Factory
                                public Dispatcher make(MethodDescription.InDefinedShape inDefinedShape) {
                                    return new ForRegularInvocation(inDefinedShape);
                                }
                            }

                            public ForRegularInvocation(MethodDescription methodDescription) {
                                this.delegate = methodDescription;
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved
                            public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, JavaConstant.MethodHandle methodHandle) {
                                return MethodInvocation.invoke(this.delegate);
                            }

                            public boolean equals(@MaybeNull Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return obj != null && getClass() == obj.getClass() && this.delegate.equals(((ForRegularInvocation) obj).delegate);
                            }

                            public int hashCode() {
                                return (getClass().hashCode() * 31) + this.delegate.hashCode();
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved
                            public StackManipulation initialize() {
                                return this.delegate.isConstructor() ? new StackManipulation.Compound(TypeCreation.m5375of(this.delegate.getDeclaringType().asErasure()), Duplication.SINGLE) : StackManipulation.Trivial.INSTANCE;
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher
                            public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                                return this;
                            }
                        }

                        public interface Resolved {
                            StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, JavaConstant.MethodHandle methodHandle);

                            StackManipulation initialize();
                        }

                        Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription);
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Factory implements Factory {
                        private final MethodDescription.InDefinedShape delegate;
                        private final Dispatcher dispatcher;
                        private final List<OffsetMapping> offsetMappings;

                        public Factory(MethodDescription.InDefinedShape inDefinedShape, Dispatcher dispatcher, List<? extends OffsetMapping.Factory<?>> list) {
                            HashMap map = new HashMap();
                            for (OffsetMapping.Factory<?> factory : list) {
                                map.put(TypeDescription.ForLoadedType.m5238of(factory.getAnnotationType()), factory);
                            }
                            this.offsetMappings = new ArrayList(list.size());
                            if (inDefinedShape.isMethod() && !inDefinedShape.isStatic()) {
                                OffsetMapping offsetMapping = null;
                                for (AnnotationDescription annotationDescription : inDefinedShape.getDeclaredAnnotations()) {
                                    OffsetMapping.Factory factory2 = (OffsetMapping.Factory) map.get(annotationDescription.getAnnotationType());
                                    if (factory2 != null) {
                                        OffsetMapping offsetMappingMake = factory2.make(inDefinedShape, annotationDescription.prepare(factory2.getAnnotationType()));
                                        if (offsetMapping != null) {
                                            throw new IllegalStateException(inDefinedShape + " is bound to both " + offsetMappingMake + " and " + offsetMapping);
                                        }
                                        offsetMapping = offsetMappingMake;
                                    }
                                }
                                this.offsetMappings.add(offsetMapping == null ? new OffsetMapping.ForThisReference(inDefinedShape.getDeclaringType().asGenericType(), null, Source.SUBSTITUTED_ELEMENT, false) : offsetMapping);
                            }
                            for (int i = 0; i < inDefinedShape.getParameters().size(); i++) {
                                ParameterDescription.InDefinedShape inDefinedShape2 = inDefinedShape.getParameters().get(i);
                                OffsetMapping forArgument = null;
                                for (AnnotationDescription annotationDescription2 : inDefinedShape2.getDeclaredAnnotations()) {
                                    OffsetMapping.Factory factory3 = (OffsetMapping.Factory) map.get(annotationDescription2.getAnnotationType());
                                    if (factory3 != null) {
                                        OffsetMapping offsetMappingMake2 = factory3.make(inDefinedShape2, annotationDescription2.prepare(factory3.getAnnotationType()));
                                        if (forArgument != null) {
                                            throw new IllegalStateException(inDefinedShape2 + " is bound to both " + offsetMappingMake2 + " and " + forArgument);
                                        }
                                        forArgument = offsetMappingMake2;
                                    }
                                }
                                List<OffsetMapping> list2 = this.offsetMappings;
                                if (forArgument == null) {
                                    forArgument = new OffsetMapping.ForArgument(inDefinedShape2.getType(), i, null, Source.SUBSTITUTED_ELEMENT, false);
                                }
                                list2.add(forArgument);
                            }
                            this.delegate = inDefinedShape;
                            this.dispatcher = dispatcher;
                        }

                        public boolean equals(@MaybeNull Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            Factory factory = (Factory) obj;
                            return this.delegate.equals(factory.delegate) && this.dispatcher.equals(factory.dispatcher) && this.offsetMappings.equals(factory.offsetMappings);
                        }

                        public int hashCode() {
                            return (((((getClass().hashCode() * 31) + this.delegate.hashCode()) * 31) + this.dispatcher.hashCode()) * 31) + this.offsetMappings.hashCode();
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                        public Step make(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                            ArrayList arrayList = new ArrayList(this.offsetMappings.size());
                            Iterator<OffsetMapping> it = this.offsetMappings.iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next().resolve(assigner, typing, typeDescription, methodDescription));
                            }
                            return new ForDelegation(this.delegate.getReturnType(), this.dispatcher.resolve(typeDescription, methodDescription), arrayList);
                        }
                    }

                    public static class WithCustomMapping {
                        private final Dispatcher.Factory dispatcherFactory;
                        private final Map<Class<? extends Annotation>, OffsetMapping.Factory<?>> offsetMappings;

                        public WithCustomMapping(Dispatcher.Factory factory, Map<Class<? extends Annotation>, OffsetMapping.Factory<?>> map) {
                            this.dispatcherFactory = factory;
                            this.offsetMappings = map;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, @MaybeNull Object obj) {
                            return bind(OffsetMapping.ForStackManipulation.m5188of(cls, obj));
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public <T extends Annotation> WithCustomMapping bindDynamic(Class<T> cls, Method method, Object... objArr) {
                            return bindDynamic(cls, method, Arrays.asList(objArr));
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public <T extends Annotation> WithCustomMapping bindLambda(Class<T> cls, Constructor<?> constructor, Class<?> cls2) {
                            return bindLambda(cls, new MethodDescription.ForLoadedConstructor(constructor), TypeDescription.ForLoadedType.m5238of(cls2));
                        }

                        public <T extends Annotation> WithCustomMapping bindProperty(Class<T> cls, String str) {
                            return bind(OffsetMapping.ForStackManipulation.OfAnnotationProperty.m5189of(cls, str));
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public <T extends Annotation> WithCustomMapping bindSerialized(Class<T> cls, Serializable serializable) {
                            return bindSerialized(cls, serializable, serializable.getClass());
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public WithCustomMapping bootstrap(Constructor<?> constructor) {
                            return bootstrap(new MethodDescription.ForLoadedConstructor(constructor));
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX INFO: renamed from: to */
                        public Factory m5192to(Method method) {
                            return m5193to(new MethodDescription.ForLoadedMethod(method));
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, Field field) {
                            return bind((Class) cls, (FieldDescription) new FieldDescription.ForLoadedField(field));
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        public <T extends Annotation> WithCustomMapping bindDynamic(Class<T> cls, Method method, List<?> list) {
                            return bindDynamic(cls, new MethodDescription.ForLoadedMethod(method), list);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        public <T extends Annotation> WithCustomMapping bindLambda(Class<T> cls, Constructor<?> constructor, Class<?> cls2, MethodGraph.Compiler compiler) {
                            return bindLambda(cls, new MethodDescription.ForLoadedConstructor(constructor), TypeDescription.ForLoadedType.m5238of(cls2), compiler);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        public <T extends Annotation, S extends Serializable> WithCustomMapping bindSerialized(Class<T> cls, S s, Class<? super S> cls2) {
                            return bind(OffsetMapping.ForStackManipulation.OfSerializedConstant.m5190of(cls, s, cls2));
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        public WithCustomMapping bootstrap(Constructor<?> constructor, BootstrapArgumentResolver.Factory factory) {
                            return bootstrap(new MethodDescription.ForLoadedConstructor(constructor), factory);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        /* JADX INFO: renamed from: to */
                        public Factory m5191to(Constructor<?> constructor) {
                            return m5193to(new MethodDescription.ForLoadedConstructor(constructor));
                        }

                        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, FieldDescription fieldDescription) {
                            return bind(new OffsetMapping.ForField.Resolved.Factory(cls, fieldDescription));
                        }

                        public <T extends Annotation> WithCustomMapping bindDynamic(Class<T> cls, Constructor<?> constructor, Object... objArr) {
                            return bindDynamic(cls, constructor, Arrays.asList(objArr));
                        }

                        public <T extends Annotation> WithCustomMapping bindLambda(Class<T> cls, Method method, Class<?> cls2) {
                            return bindLambda(cls, new MethodDescription.ForLoadedMethod(method), TypeDescription.ForLoadedType.m5238of(cls2));
                        }

                        public WithCustomMapping bootstrap(Method method) {
                            return bootstrap(new MethodDescription.ForLoadedMethod(method));
                        }

                        /* JADX INFO: renamed from: to */
                        public Factory m5193to(MethodDescription.InDefinedShape inDefinedShape) {
                            return ForDelegation.m5186to(inDefinedShape, this.dispatcherFactory, new ArrayList(this.offsetMappings.values()));
                        }

                        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, Class<?> cls2) {
                            return bind((Class) cls, TypeDescription.ForLoadedType.m5238of(cls2));
                        }

                        public <T extends Annotation> WithCustomMapping bindDynamic(Class<T> cls, Constructor<?> constructor, List<?> list) {
                            return bindDynamic(cls, new MethodDescription.ForLoadedConstructor(constructor), list);
                        }

                        public <T extends Annotation> WithCustomMapping bindLambda(Class<T> cls, Method method, Class<?> cls2, MethodGraph.Compiler compiler) {
                            return bindLambda(cls, new MethodDescription.ForLoadedMethod(method), TypeDescription.ForLoadedType.m5238of(cls2), compiler);
                        }

                        public WithCustomMapping bootstrap(Method method, BootstrapArgumentResolver.Factory factory) {
                            return bootstrap(new MethodDescription.ForLoadedMethod(method), factory);
                        }

                        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, TypeDescription typeDescription) {
                            return bind(new OffsetMapping.ForStackManipulation.Factory(cls, ConstantValue.Simple.wrap(typeDescription)));
                        }

                        public <T extends Annotation> WithCustomMapping bindDynamic(Class<T> cls, MethodDescription.InDefinedShape inDefinedShape, Object... objArr) {
                            return bindDynamic(cls, inDefinedShape, Arrays.asList(objArr));
                        }

                        public <T extends Annotation> WithCustomMapping bindLambda(Class<T> cls, MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription) {
                            return bindLambda(cls, inDefinedShape, typeDescription, MethodGraph.Compiler.DEFAULT);
                        }

                        public WithCustomMapping bootstrap(MethodDescription.InDefinedShape inDefinedShape) {
                            return bootstrap(inDefinedShape, BootstrapArgumentResolver.ForDefaultValues.Factory.INSTANCE);
                        }

                        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, Enum<?> r3) {
                            return bind((Class) cls, (EnumerationDescription) new EnumerationDescription.ForLoadedEnumeration(r3));
                        }

                        public <T extends Annotation> WithCustomMapping bindDynamic(Class<T> cls, MethodDescription.InDefinedShape inDefinedShape, List<?> list) {
                            List<JavaConstant> listWrap = JavaConstant.Simple.wrap(list);
                            if (inDefinedShape.isInvokeBootstrap(TypeList.Explicit.m5255of((List<? extends JavaConstant>) listWrap))) {
                                return bind(new OffsetMapping.ForStackManipulation.OfDynamicInvocation(cls, inDefinedShape, listWrap));
                            }
                            throw new IllegalArgumentException("Not a valid bootstrap method " + inDefinedShape + " for " + listWrap);
                        }

                        public <T extends Annotation> WithCustomMapping bindLambda(Class<T> cls, MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription, MethodGraph.Compiler compiler) {
                            if (typeDescription.isInterface()) {
                                MethodList methodListFilter = compiler.compile((TypeDefinition) typeDescription).listNodes().asMethodList().filter(ElementMatchers.isAbstract());
                                if (methodListFilter.size() == 1) {
                                    TypeDescription.Latent latent = new TypeDescription.Latent("java.lang.invoke.LambdaMetafactory", 1, TypeDescription.Generic.OfNonGenericType.ForLoadedType.m5245of(Object.class), new TypeDescription.Generic[0]);
                                    List listEmptyList = Collections.emptyList();
                                    TypeDescription.Generic genericAsGenericType = JavaType.CALL_SITE.getTypeStub().asGenericType();
                                    ParameterDescription.Token token = new ParameterDescription.Token(JavaType.METHOD_HANDLES_LOOKUP.getTypeStub().asGenericType());
                                    ParameterDescription.Token token2 = new ParameterDescription.Token(TypeDescription.ForLoadedType.m5238of(String.class).asGenericType());
                                    JavaType javaType = JavaType.METHOD_TYPE;
                                    return bindDynamic(cls, new MethodDescription.Latent(latent, "metafactory", 9, listEmptyList, genericAsGenericType, Arrays.asList(token, token2, new ParameterDescription.Token(javaType.getTypeStub().asGenericType()), new ParameterDescription.Token(javaType.getTypeStub().asGenericType()), new ParameterDescription.Token(JavaType.METHOD_HANDLE.getTypeStub().asGenericType()), new ParameterDescription.Token(javaType.getTypeStub().asGenericType())), Collections.emptyList(), Collections.emptyList(), AnnotationValue.UNDEFINED, TypeDescription.Generic.UNDEFINED), JavaConstant.MethodType.ofSignature(methodListFilter.asDefined().getOnly()), JavaConstant.MethodHandle.m5418of(inDefinedShape), JavaConstant.MethodType.ofSignature(methodListFilter.asDefined().getOnly()));
                                }
                                throw new IllegalArgumentException(typeDescription + " does not define exactly one abstract method: " + methodListFilter);
                            }
                            throw new IllegalArgumentException(typeDescription + " is not an interface type");
                        }

                        public WithCustomMapping bootstrap(MethodDescription.InDefinedShape inDefinedShape, BootstrapArgumentResolver.Factory factory) {
                            return new WithCustomMapping(Dispatcher.ForDynamicInvocation.m5187of(inDefinedShape, factory), this.offsetMappings);
                        }

                        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, EnumerationDescription enumerationDescription) {
                            return bind(new OffsetMapping.ForStackManipulation.Factory(cls, ConstantValue.Simple.wrap(enumerationDescription)));
                        }

                        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, ConstantValue constantValue) {
                            return bind(new OffsetMapping.ForStackManipulation.Factory(cls, constantValue.toStackManipulation(), constantValue.getTypeDescription().asGenericType()));
                        }

                        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, StackManipulation stackManipulation, Type type) {
                            return bind(cls, stackManipulation, TypeDefinition.Sort.describe(type));
                        }

                        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, StackManipulation stackManipulation, TypeDescription.Generic generic) {
                            return bind(new OffsetMapping.ForStackManipulation.Factory(cls, stackManipulation, generic));
                        }

                        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, OffsetMapping offsetMapping) {
                            return bind(new OffsetMapping.Factory.Simple(cls, offsetMapping));
                        }

                        public WithCustomMapping bind(OffsetMapping.Factory<?> factory) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(this.offsetMappings);
                            if (factory.getAnnotationType().isAnnotation()) {
                                if (linkedHashMap.put(factory.getAnnotationType(), factory) == null) {
                                    return new WithCustomMapping(this.dispatcherFactory, linkedHashMap);
                                }
                                throw new IllegalArgumentException("Annotation type already mapped: " + factory.getAnnotationType());
                            }
                            throw new IllegalArgumentException("Not an annotation type: " + factory.getAnnotationType());
                        }
                    }

                    public ForDelegation(TypeDescription.Generic generic, Dispatcher.Resolved resolved, List<OffsetMapping.Resolved> list) {
                        this.returned = generic;
                        this.dispatcher = resolved;
                        this.offsetMappings = list;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: to */
                    public static Factory m5184to(Method method) {
                        return m5185to(new MethodDescription.ForLoadedMethod(method));
                    }

                    public static WithCustomMapping withCustomMapping() {
                        return new WithCustomMapping(Dispatcher.ForRegularInvocation.Factory.INSTANCE, Collections.emptyMap());
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForDelegation forDelegation = (ForDelegation) obj;
                        return this.returned.equals(forDelegation.returned) && this.dispatcher.equals(forDelegation.dispatcher) && this.offsetMappings.equals(forDelegation.offsetMappings);
                    }

                    public int hashCode() {
                        return (((((getClass().hashCode() * 31) + this.returned.hashCode()) * 31) + this.dispatcher.hashCode()) * 31) + this.offsetMappings.hashCode();
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public Resolution resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, TypeDescription.Generic generic3, Map<Integer, Integer> map, int i) {
                        ArrayList arrayList = new ArrayList(this.offsetMappings.size() + 3);
                        arrayList.add(generic3.represents(Void.TYPE) ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.m5387of(generic3).storeAt(i));
                        arrayList.add(this.dispatcher.initialize());
                        Iterator<OffsetMapping.Resolved> it = this.offsetMappings.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().apply(typeDescription, member, generic, generic2, generic3, methodHandle, map, i));
                        }
                        arrayList.add(this.dispatcher.apply(typeDescription, member, methodHandle));
                        return new Simple(new StackManipulation.Compound(arrayList), this.returned);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX INFO: renamed from: to */
                    public static Factory m5183to(Constructor<?> constructor) {
                        return m5185to(new MethodDescription.ForLoadedConstructor(constructor));
                    }

                    public interface OffsetMapping {

                        public interface Factory<T extends Annotation> {

                            public static abstract class AbstractBase<S extends Annotation> implements Factory<S> {
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<S> loadable) {
                                    return make(inDefinedShape.getDeclaringType().asGenericType(), loadable);
                                }

                                public abstract OffsetMapping make(TypeDescription.Generic generic, AnnotationDescription.Loadable<S> loadable);

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<S> loadable) {
                                    return make(inDefinedShape.getType(), loadable);
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Simple<S extends Annotation> extends AbstractBase<S> {
                                private final Class<S> annotationType;
                                private final OffsetMapping offsetMapping;

                                public Simple(Class<S> cls, OffsetMapping offsetMapping) {
                                    this.annotationType = cls;
                                    this.offsetMapping = offsetMapping;
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Simple simple = (Simple) obj;
                                    return this.annotationType.equals(simple.annotationType) && this.offsetMapping.equals(simple.offsetMapping);
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<S> getAnnotationType() {
                                    return this.annotationType;
                                }

                                public int hashCode() {
                                    return (((getClass().hashCode() * 31) + this.annotationType.hashCode()) * 31) + this.offsetMapping.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase
                                public OffsetMapping make(TypeDescription.Generic generic, AnnotationDescription.Loadable<S> loadable) {
                                    return this.offsetMapping;
                                }
                            }

                            public static abstract class WithParameterSupportOnly<S extends Annotation> implements Factory<S> {
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<S> loadable) {
                                    throw new UnsupportedOperationException("This factory does not support binding a method receiver");
                                }
                            }

                            Class<T> getAnnotationType();

                            OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable);

                            OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable);
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class ForAllArguments implements OffsetMapping {
                            private final boolean includeSelf;
                            private final boolean nullIfEmpty;
                            private final Source source;
                            private final TypeDescription.Generic targetComponentType;

                            @MaybeNull
                            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            private final Assigner.Typing typing;

                            public enum Factory implements Factory<AllArguments> {
                                INSTANCE;

                                private static final MethodDescription.InDefinedShape ALL_ARGUMENTS_INCLUDE_SELF;
                                private static final MethodDescription.InDefinedShape ALL_ARGUMENTS_NULL_IF_EMPTY;
                                private static final MethodDescription.InDefinedShape ALL_ARGUMENTS_SOURCE;
                                private static final MethodDescription.InDefinedShape ALL_ARGUMENTS_TYPING;

                                static {
                                    MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.m5238of(AllArguments.class).getDeclaredMethods();
                                    ALL_ARGUMENTS_TYPING = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("typing")).getOnly();
                                    ALL_ARGUMENTS_SOURCE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("source")).getOnly();
                                    ALL_ARGUMENTS_INCLUDE_SELF = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("includeSelf")).getOnly();
                                    ALL_ARGUMENTS_NULL_IF_EMPTY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("nullIfEmpty")).getOnly();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<AllArguments> getAnnotationType() {
                                    return AllArguments.class;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<AllArguments> loadable) {
                                    throw new UnsupportedOperationException("This factory does not support binding a method receiver");
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<AllArguments> loadable) {
                                    if (inDefinedShape.getType().isArray()) {
                                        return new ForAllArguments(inDefinedShape.getType().getComponentType(), (Assigner.Typing) ((EnumerationDescription) loadable.getValue(ALL_ARGUMENTS_TYPING).resolve(EnumerationDescription.class)).load(Assigner.Typing.class), (Source) ((EnumerationDescription) loadable.getValue(ALL_ARGUMENTS_SOURCE).resolve(EnumerationDescription.class)).load(Source.class), ((Boolean) loadable.getValue(ALL_ARGUMENTS_INCLUDE_SELF).resolve(Boolean.class)).booleanValue(), ((Boolean) loadable.getValue(ALL_ARGUMENTS_NULL_IF_EMPTY).resolve(Boolean.class)).booleanValue());
                                    }
                                    throw new IllegalStateException("Expected array as parameter type for " + inDefinedShape);
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements Resolved {
                                private final Assigner assigner;
                                private final boolean includeSelf;
                                private final MethodDescription instrumentedMethod;
                                private final boolean nullIfEmpty;
                                private final Source source;
                                private final TypeDescription.Generic targetComponentType;
                                private final Assigner.Typing typing;

                                public Resolved(TypeDescription.Generic generic, Assigner.Typing typing, Source source, boolean z, boolean z2, Assigner assigner, MethodDescription methodDescription) {
                                    this.targetComponentType = generic;
                                    this.typing = typing;
                                    this.source = source;
                                    this.includeSelf = z;
                                    this.nullIfEmpty = z2;
                                    this.assigner = assigner;
                                    this.instrumentedMethod = methodDescription;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, TypeDescription.Generic generic3, JavaConstant.MethodHandle methodHandle, Map<Integer, Integer> map, int i) {
                                    List<Source.Value> listArguments = this.source.arguments(this.includeSelf, generic, map, member, this.instrumentedMethod);
                                    if (this.nullIfEmpty && listArguments.isEmpty()) {
                                        return NullConstant.INSTANCE;
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    for (Source.Value value : listArguments) {
                                        StackManipulation stackManipulationAssign = this.assigner.assign(value.getTypeDescription(), this.targetComponentType, this.typing);
                                        if (!stackManipulationAssign.isValid()) {
                                            throw new IllegalStateException("Cannot assign " + value.getTypeDescription() + " to " + this.targetComponentType);
                                        }
                                        arrayList.add(new StackManipulation.Compound(MethodVariableAccess.m5387of(value.getTypeDescription()).loadFrom(value.getOffset()), stackManipulationAssign));
                                    }
                                    return ArrayFactory.forType(this.targetComponentType).withValues(arrayList);
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Resolved resolved = (Resolved) obj;
                                    return this.includeSelf == resolved.includeSelf && this.nullIfEmpty == resolved.nullIfEmpty && this.typing.equals(resolved.typing) && this.source.equals(resolved.source) && this.targetComponentType.equals(resolved.targetComponentType) && this.assigner.equals(resolved.assigner) && this.instrumentedMethod.equals(resolved.instrumentedMethod);
                                }

                                public int hashCode() {
                                    return (((((((((((((getClass().hashCode() * 31) + this.targetComponentType.hashCode()) * 31) + this.typing.hashCode()) * 31) + this.source.hashCode()) * 31) + (this.includeSelf ? 1 : 0)) * 31) + (this.nullIfEmpty ? 1 : 0)) * 31) + this.assigner.hashCode()) * 31) + this.instrumentedMethod.hashCode();
                                }
                            }

                            public ForAllArguments(TypeDescription.Generic generic, @MaybeNull Assigner.Typing typing, Source source, boolean z, boolean z2) {
                                this.targetComponentType = generic;
                                this.typing = typing;
                                this.source = source;
                                this.includeSelf = z;
                                this.nullIfEmpty = z2;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
                            
                                if (r2 != null) goto L24;
                             */
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
                                ForAllArguments forAllArguments = (ForAllArguments) obj;
                                if (this.includeSelf != forAllArguments.includeSelf || this.nullIfEmpty != forAllArguments.nullIfEmpty) {
                                    return false;
                                }
                                Assigner.Typing typing = this.typing;
                                Assigner.Typing typing2 = forAllArguments.typing;
                                if (typing2 != null) {
                                    if (typing == null || !typing.equals(typing2)) {
                                        return false;
                                    }
                                    return this.source.equals(forAllArguments.source) && this.targetComponentType.equals(forAllArguments.targetComponentType);
                                }
                            }

                            public int hashCode() {
                                int iHashCode = ((getClass().hashCode() * 31) + this.targetComponentType.hashCode()) * 31;
                                Assigner.Typing typing = this.typing;
                                if (typing != null) {
                                    iHashCode += typing.hashCode();
                                }
                                return (((((iHashCode * 31) + this.source.hashCode()) * 31) + (this.includeSelf ? 1 : 0)) * 31) + (this.nullIfEmpty ? 1 : 0);
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public Resolved resolve(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                TypeDescription.Generic generic = this.targetComponentType;
                                Assigner.Typing typing2 = this.typing;
                                return new Resolved(generic, typing2 == null ? typing : typing2, this.source, this.includeSelf, this.nullIfEmpty, assigner, methodDescription);
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class ForCurrent implements OffsetMapping {
                            private final TypeDescription.Generic targetType;

                            @MaybeNull
                            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            private final Assigner.Typing typing;

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements Resolved {
                                private final Assigner assigner;
                                private final TypeDescription.Generic targetType;
                                private final Assigner.Typing typing;

                                public Resolved(TypeDescription.Generic generic, Assigner assigner, Assigner.Typing typing) {
                                    this.targetType = generic;
                                    this.assigner = assigner;
                                    this.typing = typing;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, TypeDescription.Generic generic3, JavaConstant.MethodHandle methodHandle, Map<Integer, Integer> map, int i) {
                                    StackManipulation stackManipulationAssign = this.assigner.assign(generic3, this.targetType, this.typing);
                                    if (stackManipulationAssign.isValid()) {
                                        return new StackManipulation.Compound(MethodVariableAccess.m5387of(generic3).loadFrom(i), stackManipulationAssign);
                                    }
                                    throw new IllegalStateException("Cannot assign " + generic3 + " to " + this.targetType);
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Resolved resolved = (Resolved) obj;
                                    return this.typing.equals(resolved.typing) && this.targetType.equals(resolved.targetType) && this.assigner.equals(resolved.assigner);
                                }

                                public int hashCode() {
                                    return (((((getClass().hashCode() * 31) + this.targetType.hashCode()) * 31) + this.assigner.hashCode()) * 31) + this.typing.hashCode();
                                }
                            }

                            public ForCurrent(TypeDescription.Generic generic, @MaybeNull Assigner.Typing typing) {
                                this.targetType = generic;
                                this.typing = typing;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
                            
                                if (r2 != null) goto L18;
                             */
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
                                Assigner.Typing typing = this.typing;
                                ForCurrent forCurrent = (ForCurrent) obj;
                                Assigner.Typing typing2 = forCurrent.typing;
                                if (typing2 != null) {
                                    if (typing == null || !typing.equals(typing2)) {
                                        return false;
                                    }
                                    return this.targetType.equals(forCurrent.targetType);
                                }
                            }

                            public int hashCode() {
                                int iHashCode = ((getClass().hashCode() * 31) + this.targetType.hashCode()) * 31;
                                Assigner.Typing typing = this.typing;
                                return typing != null ? iHashCode + typing.hashCode() : iHashCode;
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public Resolved resolve(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                TypeDescription.Generic generic = this.targetType;
                                Assigner.Typing typing2 = this.typing;
                                if (typing2 != null) {
                                    typing = typing2;
                                }
                                return new Resolved(generic, assigner, typing);
                            }

                            public enum Factory implements Factory<Current> {
                                INSTANCE;

                                private static final MethodDescription.InDefinedShape CURRENT_TYPING = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.m5238of(Current.class).getDeclaredMethods().filter(ElementMatchers.named("typing")).getOnly();

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<Current> getAnnotationType() {
                                    return Current.class;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Current> loadable) {
                                    return new ForCurrent(inDefinedShape.getDeclaringType().asGenericType(), (Assigner.Typing) ((EnumerationDescription) loadable.getValue(CURRENT_TYPING).resolve(EnumerationDescription.class)).load(Assigner.Typing.class));
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Current> loadable) {
                                    return new ForCurrent(inDefinedShape.getType(), (Assigner.Typing) ((EnumerationDescription) loadable.getValue(CURRENT_TYPING).resolve(EnumerationDescription.class)).load(Assigner.Typing.class));
                                }
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static abstract class ForField implements OffsetMapping {
                            private static final MethodDescription.InDefinedShape FIELD_VALUE_DECLARING_TYPE;
                            private static final MethodDescription.InDefinedShape FIELD_VALUE_TYPING;
                            private static final MethodDescription.InDefinedShape FIELD_VALUE_VALUE;
                            private final TypeDescription.Generic target;

                            @MaybeNull
                            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            private final Assigner.Typing typing;

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved extends ForField {
                                private final FieldDescription fieldDescription;

                                @HashCodeAndEqualsPlugin.Enhance
                                public static class Factory<T extends Annotation> extends Factory.AbstractBase<T> {
                                    private final Class<T> annotationType;
                                    private final FieldDescription fieldDescription;
                                    private final Assigner.Typing typing;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    public Factory(Class<T> cls, FieldDescription fieldDescription) {
                                        this(cls, fieldDescription, Assigner.Typing.STATIC);
                                    }

                                    public boolean equals(@MaybeNull Object obj) {
                                        if (this == obj) {
                                            return true;
                                        }
                                        if (obj == null || getClass() != obj.getClass()) {
                                            return false;
                                        }
                                        Factory factory = (Factory) obj;
                                        return this.typing.equals(factory.typing) && this.annotationType.equals(factory.annotationType) && this.fieldDescription.equals(factory.fieldDescription);
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public Class<T> getAnnotationType() {
                                        return this.annotationType;
                                    }

                                    public int hashCode() {
                                        return (((((getClass().hashCode() * 31) + this.annotationType.hashCode()) * 31) + this.fieldDescription.hashCode()) * 31) + this.typing.hashCode();
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase
                                    public OffsetMapping make(TypeDescription.Generic generic, AnnotationDescription.Loadable<T> loadable) {
                                        return new Resolved(generic, this.typing, this.fieldDescription);
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                    public Factory(Class<T> cls, FieldDescription fieldDescription, Assigner.Typing typing) {
                                        this.annotationType = cls;
                                        this.fieldDescription = fieldDescription;
                                        this.typing = typing;
                                    }
                                }

                                public Resolved(TypeDescription.Generic generic, Assigner.Typing typing, FieldDescription fieldDescription) {
                                    super(generic, typing);
                                    this.fieldDescription = fieldDescription;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                public boolean equals(@MaybeNull Object obj) {
                                    if (!super.equals(obj)) {
                                        return false;
                                    }
                                    if (this == obj) {
                                        return true;
                                    }
                                    return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Resolved) obj).fieldDescription);
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                public int hashCode() {
                                    return (super.hashCode() * 31) + this.fieldDescription.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                                public FieldDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                                    if (!this.fieldDescription.isStatic() && !this.fieldDescription.getDeclaringType().asErasure().isAssignableFrom(typeDescription)) {
                                        throw new IllegalStateException(this.fieldDescription + " is no member of " + typeDescription);
                                    }
                                    if (this.fieldDescription.isVisibleTo(typeDescription)) {
                                        return this.fieldDescription;
                                    }
                                    throw new IllegalStateException("Cannot access " + this.fieldDescription + " from " + typeDescription);
                                }
                            }

                            static {
                                MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.m5238of(FieldValue.class).getDeclaredMethods();
                                FIELD_VALUE_VALUE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("value")).getOnly();
                                FIELD_VALUE_DECLARING_TYPE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("declaringType")).getOnly();
                                FIELD_VALUE_TYPING = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("typing")).getOnly();
                            }

                            public ForField(TypeDescription.Generic generic, @MaybeNull Assigner.Typing typing) {
                                this.target = generic;
                                this.typing = typing;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
                            
                                if (r2 != null) goto L18;
                             */
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
                                Assigner.Typing typing = this.typing;
                                ForField forField = (ForField) obj;
                                Assigner.Typing typing2 = forField.typing;
                                if (typing2 != null) {
                                    if (typing == null || !typing.equals(typing2)) {
                                        return false;
                                    }
                                    return this.target.equals(forField.target);
                                }
                            }

                            public int hashCode() {
                                int iHashCode = ((getClass().hashCode() * 31) + this.target.hashCode()) * 31;
                                Assigner.Typing typing = this.typing;
                                return typing != null ? iHashCode + typing.hashCode() : iHashCode;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public Resolved resolve(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                FieldDescription fieldDescriptionResolve = resolve(typeDescription, methodDescription);
                                if (!fieldDescriptionResolve.isStatic() && methodDescription.isStatic()) {
                                    throw new IllegalStateException("Cannot access non-static field " + fieldDescriptionResolve + " from static method " + methodDescription);
                                }
                                TypeDescription.Generic type = fieldDescriptionResolve.getType();
                                TypeDescription.Generic generic = this.target;
                                Assigner.Typing typing2 = this.typing;
                                if (typing2 != null) {
                                    typing = typing2;
                                }
                                StackManipulation stackManipulationAssign = assigner.assign(type, generic, typing);
                                if (stackManipulationAssign.isValid()) {
                                    return new Resolved.ForStackManipulation(new StackManipulation.Compound(fieldDescriptionResolve.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis(), FieldAccess.forField(fieldDescriptionResolve).read(), stackManipulationAssign));
                                }
                                throw new IllegalStateException("Cannot assign " + fieldDescriptionResolve + " to " + this.target);
                            }

                            public abstract FieldDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription);

                            @HashCodeAndEqualsPlugin.Enhance
                            public static abstract class Unresolved extends ForField {
                                protected static final String BEAN_PROPERTY = "";
                                private final String name;

                                public Unresolved(TypeDescription.Generic generic, Assigner.Typing typing, String str) {
                                    super(generic, typing);
                                    this.name = str;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                public boolean equals(@MaybeNull Object obj) {
                                    if (!super.equals(obj)) {
                                        return false;
                                    }
                                    if (this == obj) {
                                        return true;
                                    }
                                    return obj != null && getClass() == obj.getClass() && this.name.equals(((Unresolved) obj).name);
                                }

                                public abstract FieldLocator fieldLocator(TypeDescription typeDescription);

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                public int hashCode() {
                                    return (super.hashCode() * 31) + this.name.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                public FieldDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                                    FieldLocator fieldLocator = fieldLocator(typeDescription);
                                    FieldLocator.Resolution resolutionOfBeanAccessor = this.name.equals("") ? FieldLocator.Resolution.Simple.ofBeanAccessor(fieldLocator, methodDescription) : fieldLocator.locate(this.name);
                                    if (resolutionOfBeanAccessor.isResolved()) {
                                        return resolutionOfBeanAccessor.getField();
                                    }
                                    throw new IllegalStateException("Cannot locate field named " + this.name + " for " + typeDescription);
                                }

                                @HashCodeAndEqualsPlugin.Enhance
                                public static class WithExplicitType extends Unresolved {
                                    private final TypeDescription declaringType;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    public WithExplicitType(TypeDescription.Generic generic, AnnotationDescription.Loadable<FieldValue> loadable, TypeDescription typeDescription) {
                                        this(generic, (Assigner.Typing) ((EnumerationDescription) loadable.getValue(ForField.FIELD_VALUE_TYPING).resolve(EnumerationDescription.class)).load(Assigner.Typing.class), (String) loadable.getValue(ForField.FIELD_VALUE_VALUE).resolve(String.class), typeDescription);
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                    public boolean equals(@MaybeNull Object obj) {
                                        if (!super.equals(obj)) {
                                            return false;
                                        }
                                        if (this == obj) {
                                            return true;
                                        }
                                        return obj != null && getClass() == obj.getClass() && this.declaringType.equals(((WithExplicitType) obj).declaringType);
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved
                                    public FieldLocator fieldLocator(TypeDescription typeDescription) {
                                        if (this.declaringType.represents(TargetType.class) || typeDescription.isAssignableTo(this.declaringType)) {
                                            return new FieldLocator.ForExactType(TargetType.resolve(this.declaringType, typeDescription));
                                        }
                                        throw new IllegalStateException(this.declaringType + " is no super type of " + typeDescription);
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                    public int hashCode() {
                                        return (super.hashCode() * 31) + this.declaringType.hashCode();
                                    }

                                    public WithExplicitType(TypeDescription.Generic generic, Assigner.Typing typing, String str, TypeDescription typeDescription) {
                                        super(generic, typing, str);
                                        this.declaringType = typeDescription;
                                    }
                                }

                                public static class WithImplicitType extends Unresolved {
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    public WithImplicitType(TypeDescription.Generic generic, AnnotationDescription.Loadable<FieldValue> loadable) {
                                        this(generic, (Assigner.Typing) ((EnumerationDescription) loadable.getValue(ForField.FIELD_VALUE_TYPING).resolve(EnumerationDescription.class)).load(Assigner.Typing.class), (String) loadable.getValue(ForField.FIELD_VALUE_VALUE).resolve(String.class));
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved
                                    public FieldLocator fieldLocator(TypeDescription typeDescription) {
                                        return new FieldLocator.ForClassHierarchy(typeDescription);
                                    }

                                    public WithImplicitType(TypeDescription.Generic generic, Assigner.Typing typing, String str) {
                                        super(generic, typing, str);
                                    }
                                }

                                public enum Factory implements Factory<FieldValue> {
                                    INSTANCE;

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public Class<FieldValue> getAnnotationType() {
                                        return FieldValue.class;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<FieldValue> loadable) {
                                        TypeDescription typeDescription = (TypeDescription) loadable.getValue(ForField.FIELD_VALUE_DECLARING_TYPE).resolve(TypeDescription.class);
                                        return typeDescription.represents(Void.TYPE) ? new WithImplicitType(inDefinedShape.getDeclaringType().asGenericType(), loadable) : new WithExplicitType(inDefinedShape.getDeclaringType().asGenericType(), loadable, typeDescription);
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<FieldValue> loadable) {
                                        TypeDescription typeDescription = (TypeDescription) loadable.getValue(ForField.FIELD_VALUE_DECLARING_TYPE).resolve(TypeDescription.class);
                                        if (typeDescription.represents(Void.TYPE)) {
                                            return new WithImplicitType(inDefinedShape.getType(), loadable);
                                        }
                                        return new WithExplicitType(inDefinedShape.getType(), loadable, typeDescription);
                                    }
                                }
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static abstract class ForFieldHandle implements OffsetMapping {
                            private final Access access;

                            public enum Access {
                                GETTER { // from class: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.1
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access
                                    public JavaConstant.MethodHandle resolve(FieldDescription.InDefinedShape inDefinedShape) {
                                        return JavaConstant.MethodHandle.ofGetter(inDefinedShape);
                                    }
                                },
                                SETTER { // from class: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.2
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access
                                    public JavaConstant.MethodHandle resolve(FieldDescription.InDefinedShape inDefinedShape) {
                                        return JavaConstant.MethodHandle.ofSetter(inDefinedShape);
                                    }
                                };

                                public abstract JavaConstant.MethodHandle resolve(FieldDescription.InDefinedShape inDefinedShape);

                                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:2) call: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.<init>(java.lang.String, int):void type: THIS */
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                /* synthetic */ Access(C26701 c26701) {
                                    this();
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved extends ForFieldHandle {
                                private final FieldDescription fieldDescription;

                                @HashCodeAndEqualsPlugin.Enhance
                                public static class Factory<T extends Annotation> implements Factory<T> {
                                    private final Access access;
                                    private final Class<T> annotationType;
                                    private final FieldDescription fieldDescription;

                                    public Factory(Class<T> cls, FieldDescription fieldDescription, Access access) {
                                        this.annotationType = cls;
                                        this.fieldDescription = fieldDescription;
                                        this.access = access;
                                    }

                                    public boolean equals(@MaybeNull Object obj) {
                                        if (this == obj) {
                                            return true;
                                        }
                                        if (obj == null || getClass() != obj.getClass()) {
                                            return false;
                                        }
                                        Factory factory = (Factory) obj;
                                        return this.access.equals(factory.access) && this.annotationType.equals(factory.annotationType) && this.fieldDescription.equals(factory.fieldDescription);
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public Class<T> getAnnotationType() {
                                        return this.annotationType;
                                    }

                                    public int hashCode() {
                                        return (((((getClass().hashCode() * 31) + this.annotationType.hashCode()) * 31) + this.fieldDescription.hashCode()) * 31) + this.access.hashCode();
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable) {
                                        throw new UnsupportedOperationException("This factory does not support binding a method receiver");
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable) {
                                        if (inDefinedShape.getType().asErasure().isAssignableFrom(JavaType.METHOD_HANDLE.getTypeStub())) {
                                            return new Resolved(this.access, this.fieldDescription);
                                        }
                                        throw new IllegalStateException("Cannot assign method handle to " + inDefinedShape);
                                    }
                                }

                                public Resolved(Access access, FieldDescription fieldDescription) {
                                    super(access);
                                    this.fieldDescription = fieldDescription;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                public boolean equals(@MaybeNull Object obj) {
                                    if (!super.equals(obj)) {
                                        return false;
                                    }
                                    if (this == obj) {
                                        return true;
                                    }
                                    return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Resolved) obj).fieldDescription);
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                public int hashCode() {
                                    return (super.hashCode() * 31) + this.fieldDescription.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                                public FieldDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                                    if (!this.fieldDescription.isStatic() && !this.fieldDescription.getDeclaringType().asErasure().isAssignableFrom(typeDescription)) {
                                        throw new IllegalStateException(this.fieldDescription + " is no member of " + typeDescription);
                                    }
                                    if (this.fieldDescription.isVisibleTo(typeDescription)) {
                                        return this.fieldDescription;
                                    }
                                    throw new IllegalStateException("Cannot access " + this.fieldDescription + " from " + typeDescription);
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static abstract class Unresolved extends ForFieldHandle {
                                protected static final String BEAN_PROPERTY = "";
                                private final String name;

                                public enum GetterFactory implements Factory<FieldGetterHandle> {
                                    INSTANCE;

                                    private static final MethodDescription.InDefinedShape FIELD_GETTER_HANDLE_DECLARING_TYPE;
                                    private static final MethodDescription.InDefinedShape FIELD_GETTER_HANDLE_VALUE;

                                    static {
                                        MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.m5238of(FieldGetterHandle.class).getDeclaredMethods();
                                        FIELD_GETTER_HANDLE_VALUE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("value")).getOnly();
                                        FIELD_GETTER_HANDLE_DECLARING_TYPE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("declaringType")).getOnly();
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public Class<FieldGetterHandle> getAnnotationType() {
                                        return FieldGetterHandle.class;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<FieldGetterHandle> loadable) {
                                        throw new UnsupportedOperationException("This factory does not support binding a method receiver");
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<FieldGetterHandle> loadable) {
                                        if (inDefinedShape.getType().asErasure().isAssignableFrom(JavaType.METHOD_HANDLE.getTypeStub())) {
                                            TypeDescription typeDescription = (TypeDescription) loadable.getValue(FIELD_GETTER_HANDLE_DECLARING_TYPE).resolve(TypeDescription.class);
                                            return typeDescription.represents(Void.TYPE) ? new WithImplicitType(Access.GETTER, (String) loadable.getValue(FIELD_GETTER_HANDLE_VALUE).resolve(String.class)) : new WithExplicitType(Access.GETTER, (String) loadable.getValue(FIELD_GETTER_HANDLE_VALUE).resolve(String.class), typeDescription);
                                        }
                                        throw new IllegalStateException("Cannot assign method handle to " + inDefinedShape);
                                    }
                                }

                                public enum SetterFactory implements Factory<FieldSetterHandle> {
                                    INSTANCE;

                                    private static final MethodDescription.InDefinedShape FIELD_SETTER_HANDLE_DECLARING_TYPE;
                                    private static final MethodDescription.InDefinedShape FIELD_SETTER_HANDLE_VALUE;

                                    static {
                                        MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.m5238of(FieldSetterHandle.class).getDeclaredMethods();
                                        FIELD_SETTER_HANDLE_VALUE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("value")).getOnly();
                                        FIELD_SETTER_HANDLE_DECLARING_TYPE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("declaringType")).getOnly();
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public Class<FieldSetterHandle> getAnnotationType() {
                                        return FieldSetterHandle.class;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<FieldSetterHandle> loadable) {
                                        throw new UnsupportedOperationException("This factory does not support binding a method receiver");
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<FieldSetterHandle> loadable) {
                                        if (inDefinedShape.getType().asErasure().isAssignableFrom(JavaType.METHOD_HANDLE.getTypeStub())) {
                                            TypeDescription typeDescription = (TypeDescription) loadable.getValue(FIELD_SETTER_HANDLE_DECLARING_TYPE).resolve(TypeDescription.class);
                                            return typeDescription.represents(Void.TYPE) ? new WithImplicitType(Access.SETTER, (String) loadable.getValue(FIELD_SETTER_HANDLE_VALUE).resolve(String.class)) : new WithExplicitType(Access.SETTER, (String) loadable.getValue(FIELD_SETTER_HANDLE_VALUE).resolve(String.class), typeDescription);
                                        }
                                        throw new IllegalStateException("Cannot assign method handle to " + inDefinedShape);
                                    }
                                }

                                @HashCodeAndEqualsPlugin.Enhance
                                public static class WithExplicitType extends Unresolved {
                                    private final TypeDescription declaringType;

                                    public WithExplicitType(Access access, String str, TypeDescription typeDescription) {
                                        super(access, str);
                                        this.declaringType = typeDescription;
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                    public boolean equals(@MaybeNull Object obj) {
                                        if (!super.equals(obj)) {
                                            return false;
                                        }
                                        if (this == obj) {
                                            return true;
                                        }
                                        return obj != null && getClass() == obj.getClass() && this.declaringType.equals(((WithExplicitType) obj).declaringType);
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved
                                    public FieldLocator fieldLocator(TypeDescription typeDescription) {
                                        if (this.declaringType.represents(TargetType.class) || typeDescription.isAssignableTo(this.declaringType)) {
                                            return new FieldLocator.ForExactType(TargetType.resolve(this.declaringType, typeDescription));
                                        }
                                        throw new IllegalStateException(this.declaringType + " is no super type of " + typeDescription);
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                    public int hashCode() {
                                        return (super.hashCode() * 31) + this.declaringType.hashCode();
                                    }
                                }

                                public static class WithImplicitType extends Unresolved {
                                    public WithImplicitType(Access access, String str) {
                                        super(access, str);
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved
                                    public FieldLocator fieldLocator(TypeDescription typeDescription) {
                                        return new FieldLocator.ForClassHierarchy(typeDescription);
                                    }
                                }

                                public Unresolved(Access access, String str) {
                                    super(access);
                                    this.name = str;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                public boolean equals(@MaybeNull Object obj) {
                                    if (!super.equals(obj)) {
                                        return false;
                                    }
                                    if (this == obj) {
                                        return true;
                                    }
                                    return obj != null && getClass() == obj.getClass() && this.name.equals(((Unresolved) obj).name);
                                }

                                public abstract FieldLocator fieldLocator(TypeDescription typeDescription);

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                public int hashCode() {
                                    return (super.hashCode() * 31) + this.name.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                public FieldDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                                    FieldLocator fieldLocator = fieldLocator(typeDescription);
                                    FieldLocator.Resolution resolutionOfBeanAccessor = this.name.equals("") ? FieldLocator.Resolution.Simple.ofBeanAccessor(fieldLocator, methodDescription) : fieldLocator.locate(this.name);
                                    if (resolutionOfBeanAccessor.isResolved()) {
                                        return resolutionOfBeanAccessor.getField();
                                    }
                                    throw new IllegalStateException("Cannot locate field named " + this.name + " for " + typeDescription);
                                }
                            }

                            public ForFieldHandle(Access access) {
                                this.access = access;
                            }

                            public boolean equals(@MaybeNull Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return obj != null && getClass() == obj.getClass() && this.access.equals(((ForFieldHandle) obj).access);
                            }

                            public int hashCode() {
                                return (getClass().hashCode() * 31) + this.access.hashCode();
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public Resolved resolve(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                FieldDescription fieldDescriptionResolve = resolve(typeDescription, methodDescription);
                                if (fieldDescriptionResolve.isStatic() || !methodDescription.isStatic()) {
                                    if (fieldDescriptionResolve.isStatic()) {
                                        return new Resolved.ForStackManipulation(this.access.resolve(fieldDescriptionResolve.asDefined()).toStackManipulation());
                                    }
                                    StackManipulation stackManipulation = this.access.resolve(fieldDescriptionResolve.asDefined()).toStackManipulation();
                                    StackManipulation stackManipulationLoadFrom = MethodVariableAccess.REFERENCE.loadFrom(0);
                                    JavaType javaType = JavaType.METHOD_HANDLE;
                                    return new Resolved.ForStackManipulation(new StackManipulation.Compound(stackManipulation, stackManipulationLoadFrom, MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.Latent(javaType.getTypeStub(), new MethodDescription.Token("bindTo", 1, javaType.getTypeStub().asGenericType(), new TypeList.Generic.Explicit(TypeDefinition.Sort.describe(Object.class)))))));
                                }
                                throw new IllegalStateException("Cannot access non-static field " + fieldDescriptionResolve + " from static method " + methodDescription);
                            }

                            public abstract FieldDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription);
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class ForOrigin implements OffsetMapping {
                            private final Sort sort;
                            private final Source source;

                            public enum Factory implements Factory<Origin> {
                                INSTANCE;

                                private static final MethodDescription.InDefinedShape ORIGIN_TYPE = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.m5238of(Origin.class).getDeclaredMethods().filter(ElementMatchers.named("source")).getOnly();

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<Origin> getAnnotationType() {
                                    return Origin.class;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Origin> loadable) {
                                    throw new UnsupportedOperationException("This factory does not support binding a method receiver");
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Origin> loadable) {
                                    Sort sort;
                                    if (inDefinedShape.getType().asErasure().represents(Class.class)) {
                                        sort = Sort.TYPE;
                                    } else if (inDefinedShape.getType().asErasure().represents(Method.class)) {
                                        sort = Sort.METHOD;
                                    } else if (inDefinedShape.getType().asErasure().represents(Constructor.class)) {
                                        sort = Sort.CONSTRUCTOR;
                                    } else if (inDefinedShape.getType().asErasure().represents(Field.class)) {
                                        sort = Sort.FIELD;
                                    } else if (JavaType.EXECUTABLE.getTypeStub().equals(inDefinedShape.getType().asErasure())) {
                                        sort = Sort.EXECUTABLE;
                                    } else if (JavaType.METHOD_HANDLE.getTypeStub().equals(inDefinedShape.getType().asErasure())) {
                                        sort = Sort.METHOD_HANDLE;
                                    } else if (JavaType.METHOD_TYPE.getTypeStub().equals(inDefinedShape.getType().asErasure())) {
                                        sort = Sort.METHOD_TYPE;
                                    } else if (JavaType.METHOD_HANDLES_LOOKUP.getTypeStub().equals(inDefinedShape.getType().asErasure())) {
                                        sort = Sort.LOOKUP;
                                    } else {
                                        if (!inDefinedShape.getType().asErasure().isAssignableFrom(String.class)) {
                                            throw new IllegalStateException("Non-supported type " + inDefinedShape.getType() + " for @Origin annotation");
                                        }
                                        sort = Sort.STRING;
                                    }
                                    return new ForOrigin(sort, (Source) ((EnumerationDescription) loadable.getValue(ORIGIN_TYPE).resolve(EnumerationDescription.class)).load(Source.class));
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements Resolved {
                                private final MethodDescription instrumentedMethod;
                                private final Sort sort;
                                private final Source source;

                                public Resolved(Sort sort, Source source, MethodDescription methodDescription) {
                                    this.sort = sort;
                                    this.source = source;
                                    this.instrumentedMethod = methodDescription;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, TypeDescription.Generic generic3, JavaConstant.MethodHandle methodHandle, Map<Integer, Integer> map, int i) {
                                    if (this.source.isRepresentable(this.sort, member, this.instrumentedMethod)) {
                                        return this.source.resolve(this.sort, member, generic, generic2, this.instrumentedMethod);
                                    }
                                    throw new IllegalStateException("Cannot represent " + this.sort + " for " + this.source + " in " + this.instrumentedMethod);
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Resolved resolved = (Resolved) obj;
                                    return this.sort.equals(resolved.sort) && this.source.equals(resolved.source) && this.instrumentedMethod.equals(resolved.instrumentedMethod);
                                }

                                public int hashCode() {
                                    return (((((getClass().hashCode() * 31) + this.sort.hashCode()) * 31) + this.source.hashCode()) * 31) + this.instrumentedMethod.hashCode();
                                }
                            }

                            public enum Sort {
                                METHOD { // from class: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.1
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public boolean isRepresentable(ByteCodeElement.Member member) {
                                        return (member instanceof MethodDescription) && ((MethodDescription) member).isMethod();
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public StackManipulation resolve(ByteCodeElement.Member member, List<TypeDescription> list, TypeDescription typeDescription) {
                                        return MethodConstant.m5382of(((MethodDescription) member).asDefined());
                                    }
                                },
                                CONSTRUCTOR { // from class: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.2
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public boolean isRepresentable(ByteCodeElement.Member member) {
                                        return (member instanceof MethodDescription) && ((MethodDescription) member).isConstructor();
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public StackManipulation resolve(ByteCodeElement.Member member, List<TypeDescription> list, TypeDescription typeDescription) {
                                        return MethodConstant.m5382of(((MethodDescription) member).asDefined());
                                    }
                                },
                                FIELD { // from class: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.3
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public boolean isRepresentable(ByteCodeElement.Member member) {
                                        return member instanceof FieldDescription;
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public StackManipulation resolve(ByteCodeElement.Member member, List<TypeDescription> list, TypeDescription typeDescription) {
                                        return new FieldConstant(((FieldDescription) member).asDefined());
                                    }
                                },
                                EXECUTABLE { // from class: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.4
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public boolean isRepresentable(ByteCodeElement.Member member) {
                                        return member instanceof MethodDescription;
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public StackManipulation resolve(ByteCodeElement.Member member, List<TypeDescription> list, TypeDescription typeDescription) {
                                        return MethodConstant.m5382of(((MethodDescription) member).asDefined());
                                    }
                                },
                                TYPE { // from class: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.5
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public boolean isRepresentable(ByteCodeElement.Member member) {
                                        return true;
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public StackManipulation resolve(ByteCodeElement.Member member, List<TypeDescription> list, TypeDescription typeDescription) {
                                        return ClassConstant.m5380of(member.getDeclaringType().asErasure());
                                    }
                                },
                                LOOKUP { // from class: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.6
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public boolean isRepresentable(ByteCodeElement.Member member) {
                                        return true;
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public StackManipulation resolve(ByteCodeElement.Member member, List<TypeDescription> list, TypeDescription typeDescription) {
                                        return MethodInvocation.lookup();
                                    }
                                },
                                METHOD_HANDLE { // from class: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.7
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public boolean isRepresentable(ByteCodeElement.Member member) {
                                        return true;
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public StackManipulation resolve(ByteCodeElement.Member member, List<TypeDescription> list, TypeDescription typeDescription) {
                                        JavaConstant.MethodHandle methodHandleOfSetter;
                                        if (member instanceof MethodDescription) {
                                            methodHandleOfSetter = JavaConstant.MethodHandle.m5418of(((MethodDescription) member).asDefined());
                                        } else {
                                            if (!(member instanceof FieldDescription)) {
                                                throw new IllegalStateException("Unexpected byte code element: " + member);
                                            }
                                            methodHandleOfSetter = typeDescription.represents(Void.TYPE) ? JavaConstant.MethodHandle.ofSetter(((FieldDescription) member).asDefined()) : JavaConstant.MethodHandle.ofGetter(((FieldDescription) member).asDefined());
                                        }
                                        return methodHandleOfSetter.toStackManipulation();
                                    }
                                },
                                METHOD_TYPE { // from class: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.8
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public boolean isRepresentable(ByteCodeElement.Member member) {
                                        return true;
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public StackManipulation resolve(ByteCodeElement.Member member, List<TypeDescription> list, TypeDescription typeDescription) {
                                        return JavaConstant.MethodType.m5425of(typeDescription, list).toStackManipulation();
                                    }
                                },
                                STRING { // from class: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.9
                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public boolean isRepresentable(ByteCodeElement.Member member) {
                                        return true;
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort
                                    public StackManipulation resolve(ByteCodeElement.Member member, List<TypeDescription> list, TypeDescription typeDescription) {
                                        return new TextConstant(member.toString());
                                    }
                                };

                                public abstract boolean isRepresentable(ByteCodeElement.Member member);

                                public abstract StackManipulation resolve(ByteCodeElement.Member member, List<TypeDescription> list, TypeDescription typeDescription);

                                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:2) call: net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.<init>(java.lang.String, int):void type: THIS */
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                /* synthetic */ Sort(C26701 c26701) {
                                    this();
                                }
                            }

                            public ForOrigin(Sort sort, Source source) {
                                this.sort = sort;
                                this.source = source;
                            }

                            public boolean equals(@MaybeNull Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                ForOrigin forOrigin = (ForOrigin) obj;
                                return this.sort.equals(forOrigin.sort) && this.source.equals(forOrigin.source);
                            }

                            public int hashCode() {
                                return (((getClass().hashCode() * 31) + this.sort.hashCode()) * 31) + this.source.hashCode();
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public Resolved resolve(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                return new Resolved(this.sort, this.source, methodDescription);
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class ForSelfCallHandle implements OffsetMapping {
                            private final boolean bound;
                            private final Source source;

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Bound implements Resolved {
                                private final MethodDescription instrumentedMethod;
                                private final Source source;

                                public Bound(Source source, MethodDescription methodDescription) {
                                    this.source = source;
                                    this.instrumentedMethod = methodDescription;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, TypeDescription.Generic generic3, JavaConstant.MethodHandle methodHandle, Map<Integer, Integer> map, int i) {
                                    Source.Value valueSelf = this.source.self(generic, map, member, this.instrumentedMethod);
                                    List<Source.Value> listArguments = this.source.arguments(false, generic, map, member, this.instrumentedMethod);
                                    ArrayList arrayList = new ArrayList(listArguments.size() + (valueSelf == null ? 0 : 2) + 1 + (!listArguments.isEmpty() ? 1 : 0));
                                    arrayList.add(this.source.handle(methodHandle, this.instrumentedMethod).toStackManipulation());
                                    if (valueSelf != null) {
                                        arrayList.add(MethodVariableAccess.m5387of(valueSelf.getTypeDescription()).loadFrom(valueSelf.getOffset()));
                                        JavaType javaType = JavaType.METHOD_HANDLE;
                                        arrayList.add(MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.Latent(javaType.getTypeStub(), new MethodDescription.Token("bindTo", 1, javaType.getTypeStub().asGenericType(), new TypeList.Generic.Explicit(TypeDefinition.Sort.describe(Object.class))))));
                                    }
                                    if (!listArguments.isEmpty()) {
                                        for (Source.Value value : listArguments) {
                                            arrayList.add(MethodVariableAccess.m5387of(value.getTypeDescription()).loadFrom(value.getOffset()));
                                        }
                                        TypeDescription typeStub = JavaType.METHOD_HANDLES.getTypeStub();
                                        JavaType javaType2 = JavaType.METHOD_HANDLE;
                                        arrayList.add(MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.Latent(typeStub, new MethodDescription.Token("insertArguments", 9, javaType2.getTypeStub().asGenericType(), new TypeList.Generic.Explicit(javaType2.getTypeStub(), TypeDefinition.Sort.describe(Integer.TYPE), TypeDefinition.Sort.describe(Object[].class))))));
                                    }
                                    return new StackManipulation.Compound(arrayList);
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Bound bound = (Bound) obj;
                                    return this.source.equals(bound.source) && this.instrumentedMethod.equals(bound.instrumentedMethod);
                                }

                                public int hashCode() {
                                    return (((getClass().hashCode() * 31) + this.source.hashCode()) * 31) + this.instrumentedMethod.hashCode();
                                }
                            }

                            public enum Factory implements Factory<SelfCallHandle> {
                                INSTANCE;

                                private static final MethodDescription.InDefinedShape ALL_ARGUMENTS_BOUND;
                                private static final MethodDescription.InDefinedShape ALL_ARGUMENTS_SOURCE;

                                static {
                                    MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.m5238of(SelfCallHandle.class).getDeclaredMethods();
                                    ALL_ARGUMENTS_SOURCE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("source")).getOnly();
                                    ALL_ARGUMENTS_BOUND = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("bound")).getOnly();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<SelfCallHandle> getAnnotationType() {
                                    return SelfCallHandle.class;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<SelfCallHandle> loadable) {
                                    throw new UnsupportedOperationException("This factory does not support binding a method receiver");
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<SelfCallHandle> loadable) {
                                    if (inDefinedShape.getType().asErasure().isAssignableFrom(JavaType.METHOD_HANDLE.getTypeStub())) {
                                        return new ForSelfCallHandle((Source) ((EnumerationDescription) loadable.getValue(ALL_ARGUMENTS_SOURCE).resolve(EnumerationDescription.class)).load(Source.class), ((Boolean) loadable.getValue(ALL_ARGUMENTS_BOUND).resolve(Boolean.class)).booleanValue());
                                    }
                                    throw new IllegalStateException("Cannot assign method handle to " + inDefinedShape);
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Unbound implements Resolved {
                                private final MethodDescription instrumentedMethod;
                                private final Source source;

                                public Unbound(Source source, MethodDescription methodDescription) {
                                    this.source = source;
                                    this.instrumentedMethod = methodDescription;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, TypeDescription.Generic generic3, JavaConstant.MethodHandle methodHandle, Map<Integer, Integer> map, int i) {
                                    return this.source.handle(methodHandle, this.instrumentedMethod).toStackManipulation();
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Unbound unbound = (Unbound) obj;
                                    return this.source.equals(unbound.source) && this.instrumentedMethod.equals(unbound.instrumentedMethod);
                                }

                                public int hashCode() {
                                    return (((getClass().hashCode() * 31) + this.source.hashCode()) * 31) + this.instrumentedMethod.hashCode();
                                }
                            }

                            public ForSelfCallHandle(Source source, boolean z) {
                                this.source = source;
                                this.bound = z;
                            }

                            public boolean equals(@MaybeNull Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                ForSelfCallHandle forSelfCallHandle = (ForSelfCallHandle) obj;
                                return this.bound == forSelfCallHandle.bound && this.source.equals(forSelfCallHandle.source);
                            }

                            public int hashCode() {
                                return (((getClass().hashCode() * 31) + this.source.hashCode()) * 31) + (this.bound ? 1 : 0);
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public Resolved resolve(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                return this.bound ? new Bound(this.source, methodDescription) : new Unbound(this.source, methodDescription);
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class ForStackManipulation implements OffsetMapping {
                            private final StackManipulation stackManipulation;
                            private final TypeDescription.Generic targetType;
                            private final TypeDescription.Generic typeDescription;

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Factory<T extends Annotation> extends Factory.AbstractBase<T> {
                                private final Class<T> annotationType;
                                private final StackManipulation stackManipulation;
                                private final TypeDescription.Generic typeDescription;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                public Factory(Class<T> cls, ConstantValue constantValue) {
                                    this(cls, constantValue.toStackManipulation(), constantValue.getTypeDescription().asGenericType());
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Factory factory = (Factory) obj;
                                    return this.annotationType.equals(factory.annotationType) && this.stackManipulation.equals(factory.stackManipulation) && this.typeDescription.equals(factory.typeDescription);
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<T> getAnnotationType() {
                                    return this.annotationType;
                                }

                                public int hashCode() {
                                    return (((((getClass().hashCode() * 31) + this.annotationType.hashCode()) * 31) + this.stackManipulation.hashCode()) * 31) + this.typeDescription.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase
                                public OffsetMapping make(TypeDescription.Generic generic, AnnotationDescription.Loadable<T> loadable) {
                                    return new ForStackManipulation(this.stackManipulation, this.typeDescription, generic);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                public Factory(Class<T> cls, StackManipulation stackManipulation, TypeDescription.Generic generic) {
                                    this.annotationType = cls;
                                    this.stackManipulation = stackManipulation;
                                    this.typeDescription = generic;
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class OfAnnotationProperty<T extends Annotation> extends Factory.WithParameterSupportOnly<T> {
                                private final Class<T> annotationType;
                                private final MethodDescription.InDefinedShape property;

                                public OfAnnotationProperty(Class<T> cls, MethodDescription.InDefinedShape inDefinedShape) {
                                    this.annotationType = cls;
                                    this.property = inDefinedShape;
                                }

                                /* JADX INFO: renamed from: of */
                                public static <S extends Annotation> Factory<S> m5189of(Class<S> cls, String str) {
                                    if (!cls.isAnnotation()) {
                                        throw new IllegalArgumentException("Not an annotation type: " + cls);
                                    }
                                    try {
                                        return new OfAnnotationProperty(cls, new MethodDescription.ForLoadedMethod(cls.getMethod(str, null)));
                                    } catch (NoSuchMethodException e) {
                                        throw new IllegalArgumentException("Cannot find a property " + str + " on " + cls, e);
                                    }
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    OfAnnotationProperty ofAnnotationProperty = (OfAnnotationProperty) obj;
                                    return this.annotationType.equals(ofAnnotationProperty.annotationType) && this.property.equals(ofAnnotationProperty.property);
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<T> getAnnotationType() {
                                    return this.annotationType;
                                }

                                public int hashCode() {
                                    return (((getClass().hashCode() * 31) + this.annotationType.hashCode()) * 31) + this.property.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable) {
                                    ConstantValue constantValueWrapOrNull = ConstantValue.Simple.wrapOrNull(loadable.getValue(this.property).resolve());
                                    if (constantValueWrapOrNull != null) {
                                        return new ForStackManipulation(constantValueWrapOrNull.toStackManipulation(), constantValueWrapOrNull.getTypeDescription().asGenericType(), inDefinedShape.getType());
                                    }
                                    throw new IllegalStateException("Not a constant value property: " + this.property);
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class OfDefaultValue<T extends Annotation> implements Factory<T> {
                                private final Class<T> annotationType;

                                public OfDefaultValue(Class<T> cls) {
                                    this.annotationType = cls;
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return obj != null && getClass() == obj.getClass() && this.annotationType.equals(((OfDefaultValue) obj).annotationType);
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<T> getAnnotationType() {
                                    return this.annotationType;
                                }

                                public int hashCode() {
                                    return (getClass().hashCode() * 31) + this.annotationType.hashCode();
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable) {
                                    throw new UnsupportedOperationException("This factory does not support binding a method receiver");
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable) {
                                    return new ForStackManipulation(DefaultValue.m5381of(inDefinedShape.getType()), inDefinedShape.getType(), inDefinedShape.getType());
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class OfDynamicInvocation<T extends Annotation> extends Factory.AbstractBase<T> {
                                private final Class<T> annotationType;
                                private final List<? extends JavaConstant> arguments;
                                private final MethodDescription.InDefinedShape bootstrapMethod;

                                public OfDynamicInvocation(Class<T> cls, MethodDescription.InDefinedShape inDefinedShape, List<? extends JavaConstant> list) {
                                    this.annotationType = cls;
                                    this.bootstrapMethod = inDefinedShape;
                                    this.arguments = list;
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    OfDynamicInvocation ofDynamicInvocation = (OfDynamicInvocation) obj;
                                    return this.annotationType.equals(ofDynamicInvocation.annotationType) && this.bootstrapMethod.equals(ofDynamicInvocation.bootstrapMethod) && this.arguments.equals(ofDynamicInvocation.arguments);
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<T> getAnnotationType() {
                                    return this.annotationType;
                                }

                                public int hashCode() {
                                    return (((((getClass().hashCode() * 31) + this.annotationType.hashCode()) * 31) + this.bootstrapMethod.hashCode()) * 31) + this.arguments.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase
                                public OffsetMapping make(TypeDescription.Generic generic, AnnotationDescription.Loadable<T> loadable) {
                                    if (!generic.isInterface()) {
                                        throw new IllegalArgumentException(generic + " is not an interface");
                                    }
                                    if (!generic.getInterfaces().isEmpty()) {
                                        throw new IllegalArgumentException(generic + " must not extend other interfaces");
                                    }
                                    if (!generic.isPublic()) {
                                        throw new IllegalArgumentException(generic + " is mot public");
                                    }
                                    MethodList methodListFilter = generic.getDeclaredMethods().filter(ElementMatchers.isAbstract());
                                    if (methodListFilter.size() == 1) {
                                        return new ForStackManipulation(MethodInvocation.invoke(this.bootstrapMethod).dynamic(((MethodDescription) methodListFilter.getOnly()).getInternalName(), generic.asErasure(), Collections.emptyList(), this.arguments), generic, generic);
                                    }
                                    throw new IllegalArgumentException(generic + " must declare exactly one abstract method");
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class OfSerializedConstant<T extends Annotation> extends Factory.AbstractBase<T> {
                                private final Class<T> annotationType;
                                private final StackManipulation deserialization;
                                private final TypeDescription.Generic typeDescription;

                                public OfSerializedConstant(Class<T> cls, StackManipulation stackManipulation, TypeDescription.Generic generic) {
                                    this.annotationType = cls;
                                    this.deserialization = stackManipulation;
                                    this.typeDescription = generic;
                                }

                                /* JADX INFO: renamed from: of */
                                public static <S extends Annotation, U extends Serializable> Factory<S> m5190of(Class<S> cls, U u, Class<? super U> cls2) {
                                    if (cls2.isInstance(u)) {
                                        return new OfSerializedConstant(cls, SerializedConstant.m5383of(u), TypeDescription.ForLoadedType.m5238of(cls2).asGenericType());
                                    }
                                    throw new IllegalArgumentException(u + " is no instance of " + cls2);
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    OfSerializedConstant ofSerializedConstant = (OfSerializedConstant) obj;
                                    return this.annotationType.equals(ofSerializedConstant.annotationType) && this.deserialization.equals(ofSerializedConstant.deserialization) && this.typeDescription.equals(ofSerializedConstant.typeDescription);
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<T> getAnnotationType() {
                                    return this.annotationType;
                                }

                                public int hashCode() {
                                    return (((((getClass().hashCode() * 31) + this.annotationType.hashCode()) * 31) + this.deserialization.hashCode()) * 31) + this.typeDescription.hashCode();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase
                                public OffsetMapping make(TypeDescription.Generic generic, AnnotationDescription.Loadable<T> loadable) {
                                    return new ForStackManipulation(this.deserialization, this.typeDescription, generic);
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements Resolved {
                                private final Assigner assigner;
                                private final StackManipulation stackManipulation;
                                private final TypeDescription.Generic targetType;
                                private final TypeDescription.Generic typeDescription;
                                private final Assigner.Typing typing;

                                public Resolved(Assigner assigner, Assigner.Typing typing, StackManipulation stackManipulation, TypeDescription.Generic generic, TypeDescription.Generic generic2) {
                                    this.assigner = assigner;
                                    this.typing = typing;
                                    this.stackManipulation = stackManipulation;
                                    this.typeDescription = generic;
                                    this.targetType = generic2;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, TypeDescription.Generic generic3, JavaConstant.MethodHandle methodHandle, Map<Integer, Integer> map, int i) {
                                    StackManipulation stackManipulationAssign = this.assigner.assign(this.typeDescription, this.targetType, this.typing);
                                    if (stackManipulationAssign.isValid()) {
                                        return new StackManipulation.Compound(this.stackManipulation, stackManipulationAssign);
                                    }
                                    throw new IllegalStateException("Cannot assign " + this.typeDescription + " to " + this.targetType);
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Resolved resolved = (Resolved) obj;
                                    return this.typing.equals(resolved.typing) && this.assigner.equals(resolved.assigner) && this.stackManipulation.equals(resolved.stackManipulation) && this.typeDescription.equals(resolved.typeDescription) && this.targetType.equals(resolved.targetType);
                                }

                                public int hashCode() {
                                    return (((((((((getClass().hashCode() * 31) + this.assigner.hashCode()) * 31) + this.typing.hashCode()) * 31) + this.stackManipulation.hashCode()) * 31) + this.typeDescription.hashCode()) * 31) + this.targetType.hashCode();
                                }
                            }

                            public ForStackManipulation(StackManipulation stackManipulation, TypeDescription.Generic generic, TypeDescription.Generic generic2) {
                                this.targetType = generic2;
                                this.stackManipulation = stackManipulation;
                                this.typeDescription = generic;
                            }

                            /* JADX INFO: renamed from: of */
                            public static <S extends Annotation> Factory<S> m5188of(Class<S> cls, @MaybeNull Object obj) {
                                return obj == null ? new OfDefaultValue(cls) : new Factory(cls, ConstantValue.Simple.wrap(obj));
                            }

                            public boolean equals(@MaybeNull Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                ForStackManipulation forStackManipulation = (ForStackManipulation) obj;
                                return this.stackManipulation.equals(forStackManipulation.stackManipulation) && this.typeDescription.equals(forStackManipulation.typeDescription) && this.targetType.equals(forStackManipulation.targetType);
                            }

                            public int hashCode() {
                                return (((((getClass().hashCode() * 31) + this.stackManipulation.hashCode()) * 31) + this.typeDescription.hashCode()) * 31) + this.targetType.hashCode();
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public Resolved resolve(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                return new Resolved(assigner, typing, this.stackManipulation, this.typeDescription, this.targetType);
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class ForStubValue implements OffsetMapping {
                            private final Source source;

                            @HashCodeAndEqualsPlugin.Enhance
                            public enum Factory implements Factory<StubValue> {
                                INSTANCE;

                                private static final MethodDescription.InDefinedShape STUB_VALUE_SOURCE = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.m5238of(StubValue.class).getDeclaredMethods().filter(ElementMatchers.named("source")).getOnly();

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<StubValue> getAnnotationType() {
                                    return StubValue.class;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<StubValue> loadable) {
                                    throw new UnsupportedOperationException("This factory does not support binding a method receiver");
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<StubValue> loadable) {
                                    if (inDefinedShape.getType().represents(Object.class)) {
                                        return new ForStubValue((Source) ((EnumerationDescription) loadable.getValue(STUB_VALUE_SOURCE).resolve(EnumerationDescription.class)).load(Source.class));
                                    }
                                    throw new IllegalStateException("Expected " + inDefinedShape + " to declare an Object type");
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements Resolved {
                                private final MethodDescription instrumentedMethod;
                                private final Source source;

                                public Resolved(Source source, MethodDescription methodDescription) {
                                    this.source = source;
                                    this.instrumentedMethod = methodDescription;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, TypeDescription.Generic generic3, JavaConstant.MethodHandle methodHandle, Map<Integer, Integer> map, int i) {
                                    return DefaultValue.m5381of(this.source.handle(methodHandle, this.instrumentedMethod).getReturnType());
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Resolved resolved = (Resolved) obj;
                                    return this.source.equals(resolved.source) && this.instrumentedMethod.equals(resolved.instrumentedMethod);
                                }

                                public int hashCode() {
                                    return (((getClass().hashCode() * 31) + this.source.hashCode()) * 31) + this.instrumentedMethod.hashCode();
                                }
                            }

                            public ForStubValue(Source source) {
                                this.source = source;
                            }

                            public boolean equals(@MaybeNull Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return obj != null && getClass() == obj.getClass() && this.source.equals(((ForStubValue) obj).source);
                            }

                            public int hashCode() {
                                return (getClass().hashCode() * 31) + this.source.hashCode();
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public Resolved resolve(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                return new Resolved(this.source, methodDescription);
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class ForThisReference implements OffsetMapping {
                            private final boolean optional;
                            private final Source source;
                            private final TypeDescription.Generic targetType;

                            @MaybeNull
                            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            private final Assigner.Typing typing;

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements Resolved {
                                private final Assigner assigner;
                                private final MethodDescription instrumentedMethod;
                                private final boolean optional;
                                private final Source source;
                                private final TypeDescription.Generic targetType;
                                private final Assigner.Typing typing;

                                public Resolved(TypeDescription.Generic generic, Assigner.Typing typing, Source source, boolean z, Assigner assigner, MethodDescription methodDescription) {
                                    this.targetType = generic;
                                    this.typing = typing;
                                    this.source = source;
                                    this.optional = z;
                                    this.assigner = assigner;
                                    this.instrumentedMethod = methodDescription;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, TypeDescription.Generic generic3, JavaConstant.MethodHandle methodHandle, Map<Integer, Integer> map, int i) {
                                    Source.Value valueSelf = this.source.self(generic, map, member, this.instrumentedMethod);
                                    if (valueSelf == null) {
                                        if (this.optional) {
                                            return DefaultValue.m5381of(this.targetType);
                                        }
                                        throw new IllegalStateException("No this reference available for " + member);
                                    }
                                    StackManipulation stackManipulationAssign = this.assigner.assign(valueSelf.getTypeDescription(), this.targetType, this.typing);
                                    if (stackManipulationAssign.isValid()) {
                                        return new StackManipulation.Compound(MethodVariableAccess.m5387of(valueSelf.getTypeDescription()).loadFrom(valueSelf.getOffset()), stackManipulationAssign);
                                    }
                                    throw new IllegalStateException("Cannot assign " + valueSelf.getTypeDescription() + " to " + this.targetType);
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Resolved resolved = (Resolved) obj;
                                    return this.optional == resolved.optional && this.typing.equals(resolved.typing) && this.source.equals(resolved.source) && this.targetType.equals(resolved.targetType) && this.assigner.equals(resolved.assigner) && this.instrumentedMethod.equals(resolved.instrumentedMethod);
                                }

                                public int hashCode() {
                                    return (((((((((((getClass().hashCode() * 31) + this.targetType.hashCode()) * 31) + this.typing.hashCode()) * 31) + this.source.hashCode()) * 31) + (this.optional ? 1 : 0)) * 31) + this.assigner.hashCode()) * 31) + this.instrumentedMethod.hashCode();
                                }
                            }

                            public ForThisReference(TypeDescription.Generic generic, @MaybeNull Assigner.Typing typing, Source source, boolean z) {
                                this.targetType = generic;
                                this.typing = typing;
                                this.source = source;
                                this.optional = z;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
                            
                                if (r2 != null) goto L21;
                             */
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
                                ForThisReference forThisReference = (ForThisReference) obj;
                                if (this.optional != forThisReference.optional) {
                                    return false;
                                }
                                Assigner.Typing typing = this.typing;
                                Assigner.Typing typing2 = forThisReference.typing;
                                if (typing2 != null) {
                                    if (typing == null || !typing.equals(typing2)) {
                                        return false;
                                    }
                                    return this.source.equals(forThisReference.source) && this.targetType.equals(forThisReference.targetType);
                                }
                            }

                            public int hashCode() {
                                int iHashCode = ((getClass().hashCode() * 31) + this.targetType.hashCode()) * 31;
                                Assigner.Typing typing = this.typing;
                                if (typing != null) {
                                    iHashCode += typing.hashCode();
                                }
                                return (((iHashCode * 31) + this.source.hashCode()) * 31) + (this.optional ? 1 : 0);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                            /* JADX DEBUG: Method merged with bridge method: resolve(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved; */
                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public Resolved resolve(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                TypeDescription.Generic generic = this.targetType;
                                Assigner.Typing typing2 = this.typing;
                                return new Resolved(generic, typing2 == null ? typing : typing2, this.source, this.optional, assigner, methodDescription);
                            }

                            public enum Factory implements Factory<This> {
                                INSTANCE;

                                private static final MethodDescription.InDefinedShape THIS_OPTIONAL;
                                private static final MethodDescription.InDefinedShape THIS_SOURCE;
                                private static final MethodDescription.InDefinedShape THIS_TYPING;

                                static {
                                    MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.m5238of(This.class).getDeclaredMethods();
                                    THIS_TYPING = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("typing")).getOnly();
                                    THIS_SOURCE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("source")).getOnly();
                                    THIS_OPTIONAL = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("optional")).getOnly();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<This> getAnnotationType() {
                                    return This.class;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<This> loadable) {
                                    return new ForThisReference(inDefinedShape.getDeclaringType().asGenericType(), (Assigner.Typing) ((EnumerationDescription) loadable.getValue(THIS_TYPING).resolve(EnumerationDescription.class)).load(Assigner.Typing.class), (Source) ((EnumerationDescription) loadable.getValue(THIS_SOURCE).resolve(EnumerationDescription.class)).load(Source.class), ((Boolean) loadable.getValue(THIS_OPTIONAL).resolve(Boolean.class)).booleanValue());
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<This> loadable) {
                                    return new ForThisReference(inDefinedShape.getType(), (Assigner.Typing) ((EnumerationDescription) loadable.getValue(THIS_TYPING).resolve(EnumerationDescription.class)).load(Assigner.Typing.class), (Source) ((EnumerationDescription) loadable.getValue(THIS_SOURCE).resolve(EnumerationDescription.class)).load(Source.class), ((Boolean) loadable.getValue(THIS_OPTIONAL).resolve(Boolean.class)).booleanValue());
                                }
                            }
                        }

                        public interface Resolved {

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class ForStackManipulation implements Resolved {
                                private final StackManipulation stackManipulation;

                                public ForStackManipulation(StackManipulation stackManipulation) {
                                    this.stackManipulation = stackManipulation;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, TypeDescription.Generic generic3, JavaConstant.MethodHandle methodHandle, Map<Integer, Integer> map, int i) {
                                    return this.stackManipulation;
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return obj != null && getClass() == obj.getClass() && this.stackManipulation.equals(((ForStackManipulation) obj).stackManipulation);
                                }

                                public int hashCode() {
                                    return (getClass().hashCode() * 31) + this.stackManipulation.hashCode();
                                }
                            }

                            StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, TypeDescription.Generic generic3, JavaConstant.MethodHandle methodHandle, Map<Integer, Integer> map, int i);
                        }

                        Resolved resolve(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription);

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class ForArgument implements OffsetMapping {
                            private final int index;
                            private final boolean optional;
                            private final Source source;
                            private final TypeDescription.Generic targetType;

                            @MaybeNull
                            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            private final Assigner.Typing typing;

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements Resolved {
                                private final Assigner assigner;
                                private final int index;
                                private final MethodDescription instrumentedMethod;
                                private final boolean optional;
                                private final Source source;
                                private final TypeDescription.Generic targetType;
                                private final Assigner.Typing typing;

                                public Resolved(TypeDescription.Generic generic, int i, Assigner.Typing typing, Source source, boolean z, Assigner assigner, MethodDescription methodDescription) {
                                    this.targetType = generic;
                                    this.index = i;
                                    this.typing = typing;
                                    this.source = source;
                                    this.optional = z;
                                    this.assigner = assigner;
                                    this.instrumentedMethod = methodDescription;
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, TypeDescription.Generic generic3, JavaConstant.MethodHandle methodHandle, Map<Integer, Integer> map, int i) {
                                    Source.Value valueArgument = this.source.argument(this.index, generic, map, member, this.instrumentedMethod);
                                    if (valueArgument == null) {
                                        if (this.optional) {
                                            return DefaultValue.m5381of(this.targetType);
                                        }
                                        throw new IllegalStateException("No argument with index " + this.index + " available for " + member);
                                    }
                                    StackManipulation stackManipulationAssign = this.assigner.assign(valueArgument.getTypeDescription(), this.targetType, this.typing);
                                    if (stackManipulationAssign.isValid()) {
                                        return new StackManipulation.Compound(MethodVariableAccess.m5387of(valueArgument.getTypeDescription()).loadFrom(valueArgument.getOffset()), stackManipulationAssign);
                                    }
                                    throw new IllegalStateException("Cannot assign " + valueArgument.getTypeDescription() + " to " + this.targetType);
                                }

                                public boolean equals(@MaybeNull Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Resolved resolved = (Resolved) obj;
                                    return this.index == resolved.index && this.optional == resolved.optional && this.typing.equals(resolved.typing) && this.source.equals(resolved.source) && this.targetType.equals(resolved.targetType) && this.assigner.equals(resolved.assigner) && this.instrumentedMethod.equals(resolved.instrumentedMethod);
                                }

                                public int hashCode() {
                                    return (((((((((((((getClass().hashCode() * 31) + this.targetType.hashCode()) * 31) + this.index) * 31) + this.typing.hashCode()) * 31) + this.source.hashCode()) * 31) + (this.optional ? 1 : 0)) * 31) + this.assigner.hashCode()) * 31) + this.instrumentedMethod.hashCode();
                                }
                            }

                            public ForArgument(TypeDescription.Generic generic, int i, @MaybeNull Assigner.Typing typing, Source source, boolean z) {
                                this.targetType = generic;
                                this.index = i;
                                this.typing = typing;
                                this.source = source;
                                this.optional = z;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
                            
                                if (r2 != null) goto L24;
                             */
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
                                ForArgument forArgument = (ForArgument) obj;
                                if (this.index != forArgument.index || this.optional != forArgument.optional) {
                                    return false;
                                }
                                Assigner.Typing typing = this.typing;
                                Assigner.Typing typing2 = forArgument.typing;
                                if (typing2 != null) {
                                    if (typing == null || !typing.equals(typing2)) {
                                        return false;
                                    }
                                    return this.source.equals(forArgument.source) && this.targetType.equals(forArgument.targetType);
                                }
                            }

                            public int hashCode() {
                                int iHashCode = ((((getClass().hashCode() * 31) + this.targetType.hashCode()) * 31) + this.index) * 31;
                                Assigner.Typing typing = this.typing;
                                if (typing != null) {
                                    iHashCode += typing.hashCode();
                                }
                                return (((iHashCode * 31) + this.source.hashCode()) * 31) + (this.optional ? 1 : 0);
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public Resolved resolve(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                TypeDescription.Generic generic = this.targetType;
                                int i = this.index;
                                Assigner.Typing typing2 = this.typing;
                                return new Resolved(generic, i, typing2 == null ? typing : typing2, this.source, this.optional, assigner, methodDescription);
                            }

                            public enum Factory implements Factory<Argument> {
                                INSTANCE;

                                private static final MethodDescription.InDefinedShape ARGUMENT_OPTIONAL;
                                private static final MethodDescription.InDefinedShape ARGUMENT_SOURCE;
                                private static final MethodDescription.InDefinedShape ARGUMENT_TYPING;
                                private static final MethodDescription.InDefinedShape ARGUMENT_VALUE;

                                static {
                                    MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.m5238of(Argument.class).getDeclaredMethods();
                                    ARGUMENT_VALUE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("value")).getOnly();
                                    ARGUMENT_TYPING = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("typing")).getOnly();
                                    ARGUMENT_SOURCE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("source")).getOnly();
                                    ARGUMENT_OPTIONAL = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("optional")).getOnly();
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public Class<Argument> getAnnotationType() {
                                    return Argument.class;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(MethodDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Argument> loadable) {
                                    return new ForArgument(inDefinedShape.getDeclaringType().asGenericType(), ((Integer) loadable.getValue(ARGUMENT_VALUE).resolve(Integer.class)).intValue(), (Assigner.Typing) ((EnumerationDescription) loadable.getValue(ARGUMENT_TYPING).resolve(EnumerationDescription.class)).load(Assigner.Typing.class), (Source) ((EnumerationDescription) loadable.getValue(ARGUMENT_SOURCE).resolve(EnumerationDescription.class)).load(Source.class), ((Boolean) loadable.getValue(ARGUMENT_OPTIONAL).resolve(Boolean.class)).booleanValue());
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Argument> loadable) {
                                    int iIntValue = ((Integer) loadable.getValue(ARGUMENT_VALUE).resolve(Integer.class)).intValue();
                                    if (iIntValue >= 0) {
                                        return new ForArgument(inDefinedShape.getType(), iIntValue, (Assigner.Typing) ((EnumerationDescription) loadable.getValue(ARGUMENT_TYPING).resolve(EnumerationDescription.class)).load(Assigner.Typing.class), (Source) ((EnumerationDescription) loadable.getValue(ARGUMENT_SOURCE).resolve(EnumerationDescription.class)).load(Source.class), ((Boolean) loadable.getValue(ARGUMENT_OPTIONAL).resolve(Boolean.class)).booleanValue());
                                    }
                                    throw new IllegalStateException("Cannot assign negative parameter index " + iIntValue + " for " + inDefinedShape);
                                }
                            }
                        }
                    }

                    /* JADX INFO: renamed from: to */
                    public static Factory m5185to(MethodDescription.InDefinedShape inDefinedShape) {
                        if (!inDefinedShape.isTypeInitializer()) {
                            return m5186to(inDefinedShape, Dispatcher.ForRegularInvocation.Factory.INSTANCE, Collections.emptyList());
                        }
                        throw new IllegalArgumentException("Cannot delegate to a type initializer: " + inDefinedShape);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX INFO: renamed from: to */
                    public static Factory m5186to(MethodDescription.InDefinedShape inDefinedShape, Dispatcher.Factory factory, List<? extends OffsetMapping.Factory<?>> list) {
                        if (!inDefinedShape.isTypeInitializer()) {
                            return new Factory(inDefinedShape, factory.make(inDefinedShape), CompoundList.m5414of(Arrays.asList(OffsetMapping.ForArgument.Factory.INSTANCE, OffsetMapping.ForThisReference.Factory.INSTANCE, OffsetMapping.ForAllArguments.Factory.INSTANCE, OffsetMapping.ForSelfCallHandle.Factory.INSTANCE, OffsetMapping.ForField.Unresolved.Factory.INSTANCE, OffsetMapping.ForFieldHandle.Unresolved.GetterFactory.INSTANCE, OffsetMapping.ForFieldHandle.Unresolved.SetterFactory.INSTANCE, OffsetMapping.ForOrigin.Factory.INSTANCE, OffsetMapping.ForStubValue.Factory.INSTANCE, new OffsetMapping.ForStackManipulation.OfDefaultValue(Unused.class), OffsetMapping.ForCurrent.Factory.INSTANCE), (List) list));
                        }
                        throw new IllegalArgumentException("Cannot delegate to type initializer: " + inDefinedShape);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static abstract class ForField implements Step {
                    protected final Assigner assigner;
                    protected final FieldDescription fieldDescription;
                    protected final Assigner.Typing typing;

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Read extends ForField {

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class Factory implements Factory {
                            private final FieldDescription fieldDescription;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public Factory(Field field) {
                                this(new FieldDescription.ForLoadedField(field));
                            }

                            public boolean equals(@MaybeNull Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Factory) obj).fieldDescription);
                            }

                            public int hashCode() {
                                return (getClass().hashCode() * 31) + this.fieldDescription.hashCode();
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                            public Step make(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                return new Read(this.fieldDescription, assigner, typing);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                            public Factory(FieldDescription fieldDescription) {
                                this.fieldDescription = fieldDescription;
                            }
                        }

                        public Read(FieldDescription fieldDescription, Assigner assigner, Assigner.Typing typing) {
                            super(fieldDescription, assigner, typing);
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
                        public Resolution doResolve(ByteCodeElement.Member member, TypeList.Generic generic, Map<Integer, Integer> map, StackManipulation stackManipulation) {
                            return new Simple(new StackManipulation.Compound(stackManipulation, FieldAccess.forField(this.fieldDescription).read()), this.fieldDescription.getType());
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
                        public boolean equals(@MaybeNull Object obj) {
                            if (!super.equals(obj)) {
                                return false;
                            }
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass();
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
                        public int hashCode() {
                            return super.hashCode();
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Write extends ForField {
                        private final int index;

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class Factory implements Factory {
                            private final FieldDescription fieldDescription;
                            private final int index;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public Factory(Field field, int i) {
                                this(new FieldDescription.ForLoadedField(field), i);
                            }

                            public boolean equals(@MaybeNull Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                Factory factory = (Factory) obj;
                                return this.index == factory.index && this.fieldDescription.equals(factory.fieldDescription);
                            }

                            public int hashCode() {
                                return (((getClass().hashCode() * 31) + this.fieldDescription.hashCode()) * 31) + this.index;
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                            public Step make(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                                return new Write(this.fieldDescription, assigner, typing, this.index);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                            public Factory(FieldDescription fieldDescription, int i) {
                                this.fieldDescription = fieldDescription;
                                this.index = i;
                            }
                        }

                        public Write(FieldDescription fieldDescription, Assigner assigner, Assigner.Typing typing, int i) {
                            super(fieldDescription, assigner, typing);
                            this.index = i;
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
                        public Resolution doResolve(ByteCodeElement.Member member, TypeList.Generic generic, Map<Integer, Integer> map, StackManipulation stackManipulation) {
                            int i = ((member.getModifiers() & 8) != 0 || ((member instanceof MethodDescription) && ((MethodDescription) member).isConstructor())) ? this.index : this.index + 1;
                            if (i >= generic.size()) {
                                throw new IllegalStateException(member + " does not define an argument with index " + i);
                            }
                            StackManipulation stackManipulationAssign = this.assigner.assign(generic.get(i), this.fieldDescription.getType(), this.typing);
                            if (stackManipulationAssign.isValid()) {
                                return new Simple(new StackManipulation.Compound(stackManipulation, MethodVariableAccess.m5387of(generic.get(i)).loadFrom(map.get(Integer.valueOf(i)).intValue()), stackManipulationAssign, FieldAccess.forField(this.fieldDescription).write()), TypeDefinition.Sort.describe(Void.TYPE));
                            }
                            throw new IllegalStateException("Cannot write " + generic.get(i) + " to " + this.fieldDescription);
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
                        public boolean equals(@MaybeNull Object obj) {
                            if (!super.equals(obj)) {
                                return false;
                            }
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.index == ((Write) obj).index;
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
                        public int hashCode() {
                            return (super.hashCode() * 31) + this.index;
                        }
                    }

                    public ForField(FieldDescription fieldDescription, Assigner assigner, Assigner.Typing typing) {
                        this.fieldDescription = fieldDescription;
                        this.assigner = assigner;
                        this.typing = typing;
                    }

                    public abstract Resolution doResolve(ByteCodeElement.Member member, TypeList.Generic generic, Map<Integer, Integer> map, StackManipulation stackManipulation);

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForField forField = (ForField) obj;
                        return this.typing.equals(forField.typing) && this.fieldDescription.equals(forField.fieldDescription) && this.assigner.equals(forField.assigner);
                    }

                    public int hashCode() {
                        return (((((getClass().hashCode() * 31) + this.fieldDescription.hashCode()) * 31) + this.assigner.hashCode()) * 31) + this.typing.hashCode();
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    @SuppressFBWarnings(justification = "Field description always has declaring type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public Resolution resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, TypeDescription.Generic generic3, Map<Integer, Integer> map, int i) {
                        ArrayList arrayList = new ArrayList(2);
                        if (this.fieldDescription.isStatic()) {
                            arrayList.add(Removal.m5370of(generic3));
                        } else {
                            StackManipulation stackManipulationAssign = this.assigner.assign(generic3, this.fieldDescription.getDeclaringType().asGenericType(), this.typing);
                            if (!stackManipulationAssign.isValid()) {
                                throw new IllegalStateException("Cannot assign " + generic3 + " to " + this.fieldDescription.getDeclaringType());
                            }
                            arrayList.add(stackManipulationAssign);
                        }
                        return doResolve(member, generic, map, new StackManipulation.Compound(arrayList));
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForInvocation implements Step {
                    private final Assigner assigner;
                    private final MethodDescription methodDescription;
                    private final Map<Integer, Integer> substitutions;
                    private final Assigner.Typing typing;

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class Factory implements Factory {
                        private final MethodDescription methodDescription;
                        private final Map<Integer, Integer> substitutions;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public Factory(Method method) {
                            this(new MethodDescription.ForLoadedMethod(method));
                        }

                        public boolean equals(@MaybeNull Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            Factory factory = (Factory) obj;
                            return this.methodDescription.equals(factory.methodDescription) && this.substitutions.equals(factory.substitutions);
                        }

                        public int hashCode() {
                            return (((getClass().hashCode() * 31) + this.methodDescription.hashCode()) * 31) + this.substitutions.hashCode();
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                        public Step make(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                            return new ForInvocation(this.methodDescription, this.substitutions, assigner, typing);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        public Factory(Constructor<?> constructor) {
                            this(new MethodDescription.ForLoadedConstructor(constructor));
                        }

                        public Factory(MethodDescription methodDescription) {
                            this(methodDescription, Collections.emptyMap());
                        }

                        public Factory(MethodDescription methodDescription, Map<Integer, Integer> map) {
                            this.methodDescription = methodDescription;
                            this.substitutions = map;
                        }
                    }

                    public ForInvocation(MethodDescription methodDescription, Map<Integer, Integer> map, Assigner assigner, Assigner.Typing typing) {
                        this.methodDescription = methodDescription;
                        this.substitutions = map;
                        this.assigner = assigner;
                        this.typing = typing;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForInvocation forInvocation = (ForInvocation) obj;
                        return this.typing.equals(forInvocation.typing) && this.methodDescription.equals(forInvocation.methodDescription) && this.substitutions.equals(forInvocation.substitutions) && this.assigner.equals(forInvocation.assigner);
                    }

                    public int hashCode() {
                        return (((((((getClass().hashCode() * 31) + this.methodDescription.hashCode()) * 31) + this.substitutions.hashCode()) * 31) + this.assigner.hashCode()) * 31) + this.typing.hashCode();
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public Resolution resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, TypeDescription.Generic generic3, Map<Integer, Integer> map, int i) {
                        ArrayList arrayList = new ArrayList((generic.size() * 2) + 3);
                        if (this.methodDescription.isStatic()) {
                            arrayList.add(Removal.m5370of(generic3));
                        } else if (this.methodDescription.isConstructor()) {
                            arrayList.add(Removal.m5370of(generic3));
                            arrayList.add(TypeCreation.m5375of(this.methodDescription.getDeclaringType().asErasure()));
                        } else {
                            StackManipulation stackManipulationAssign = this.assigner.assign(generic3, this.methodDescription.getDeclaringType().asGenericType(), this.typing);
                            if (!stackManipulationAssign.isValid()) {
                                throw new IllegalStateException("Cannot assign " + generic3 + " to " + this.methodDescription.getDeclaringType());
                            }
                            arrayList.add(stackManipulationAssign);
                        }
                        int i2 = ((member.getModifiers() & 8) != 0 || ((member instanceof MethodDescription) && ((MethodDescription) member).isConstructor())) ? 0 : 1;
                        for (int i3 = 0; i3 < this.methodDescription.getParameters().size(); i3++) {
                            int iIntValue = this.substitutions.containsKey(Integer.valueOf(i3 + i2)) ? this.substitutions.get(Integer.valueOf(i3 + i2)).intValue() : i3 + i2;
                            if (iIntValue >= generic.size()) {
                                throw new IllegalStateException(member + " does not support an index " + iIntValue);
                            }
                            arrayList.add(MethodVariableAccess.m5387of(generic.get(iIntValue)).loadFrom(map.get(Integer.valueOf(iIntValue)).intValue()));
                            StackManipulation stackManipulationAssign2 = this.assigner.assign(generic.get(iIntValue), ((ParameterDescription) this.methodDescription.getParameters().get(i3)).getType(), this.typing);
                            if (!stackManipulationAssign2.isValid()) {
                                throw new IllegalStateException("Cannot assign parameter with " + i3 + " of type " + generic.get(iIntValue) + " to " + this.methodDescription);
                            }
                            arrayList.add(stackManipulationAssign2);
                        }
                        arrayList.add(MethodInvocation.invoke(this.methodDescription));
                        return new Simple(new StackManipulation.Compound(arrayList), this.methodDescription.getReturnType());
                    }
                }

                public enum OfOriginalExpression implements Step, Factory {
                    INSTANCE;

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                    public Step make(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                        return this;
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public Resolution resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, TypeDescription.Generic generic3, Map<Integer, Integer> map, int i) {
                        ArrayList arrayList;
                        boolean z = member instanceof MethodDescription;
                        if (z && ((MethodDescription) member).isConstructor()) {
                            arrayList = new ArrayList(generic.size() + 4);
                            arrayList.add(Removal.m5370of(generic3));
                            arrayList.add(TypeCreation.m5375of(member.getDeclaringType().asErasure()));
                            arrayList.add(Duplication.SINGLE);
                        } else {
                            arrayList = new ArrayList(generic.size() + 4);
                            arrayList.add(Removal.m5370of(generic3));
                        }
                        for (int i2 = 0; i2 < generic.size(); i2++) {
                            arrayList.add(MethodVariableAccess.m5387of(generic.get(i2)).loadFrom(map.get(Integer.valueOf(i2)).intValue()));
                        }
                        if (z) {
                            arrayList.add(stackManipulation);
                            StackManipulation.Compound compound = new StackManipulation.Compound(arrayList);
                            MethodDescription methodDescription = (MethodDescription) member;
                            return new Simple(compound, methodDescription.isConstructor() ? member.getDeclaringType().asGenericType() : methodDescription.getReturnType());
                        }
                        if (!(member instanceof FieldDescription)) {
                            throw new IllegalArgumentException("Unexpected target type: " + member);
                        }
                        if (member.isStatic()) {
                            if (generic.isEmpty()) {
                                arrayList.add(stackManipulation);
                                return new Simple(new StackManipulation.Compound(arrayList), ((FieldDescription) member).getType());
                            }
                            arrayList.add(stackManipulation);
                            return new Simple(new StackManipulation.Compound(arrayList), TypeDefinition.Sort.describe(Void.TYPE));
                        }
                        if (generic.size() != 1) {
                            arrayList.add(FieldAccess.forField((FieldDescription) member).write());
                            return new Simple(new StackManipulation.Compound(arrayList), TypeDefinition.Sort.describe(Void.TYPE));
                        }
                        FieldDescription fieldDescription = (FieldDescription) member;
                        arrayList.add(FieldAccess.forField(fieldDescription).read());
                        return new Simple(new StackManipulation.Compound(arrayList), fieldDescription.getType());
                    }
                }

                public interface Resolution {
                    TypeDescription.Generic getResultType();

                    StackManipulation getStackManipulation();
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class Simple implements Step, Resolution, Factory {
                    private final TypeDescription.Generic resultType;
                    private final StackManipulation stackManipulation;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public Simple(StackManipulation stackManipulation, Type type) {
                        this(stackManipulation, TypeDefinition.Sort.describe(type));
                    }

                    /* JADX INFO: renamed from: of */
                    public static Factory m5194of(Object obj) {
                        ConstantValue constantValueWrap = ConstantValue.Simple.wrap(obj);
                        return new Simple(constantValueWrap.toStackManipulation(), constantValueWrap.getTypeDescription().asGenericType());
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Simple simple = (Simple) obj;
                        return this.stackManipulation.equals(simple.stackManipulation) && this.resultType.equals(simple.resultType);
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution
                    public TypeDescription.Generic getResultType() {
                        return this.resultType;
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution
                    public StackManipulation getStackManipulation() {
                        return this.stackManipulation;
                    }

                    public int hashCode() {
                        return (((getClass().hashCode() * 31) + this.stackManipulation.hashCode()) * 31) + this.resultType.hashCode();
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                    public Step make(Assigner assigner, Assigner.Typing typing, TypeDescription typeDescription, MethodDescription methodDescription) {
                        return this;
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public Resolution resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, TypeDescription.Generic generic3, Map<Integer, Integer> map, int i) {
                        return typeDescription.represents(Void.TYPE) ? this : new Simple(new StackManipulation.Compound(Removal.m5370of(generic3), this.stackManipulation), this.resultType);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    public Simple(StackManipulation stackManipulation, TypeDescription.Generic generic) {
                        this.stackManipulation = stackManipulation;
                        this.resultType = generic;
                    }
                }

                Resolution resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, TypeDescription.Generic generic3, Map<Integer, Integer> map, int i);
            }

            public Chain(Assigner assigner, Assigner.Typing typing, List<Step> list) {
                this.assigner = assigner;
                this.typing = typing;
                this.steps = list;
            }

            public static Factory with(Assigner assigner, Assigner.Typing typing) {
                return new Factory(assigner, typing, Collections.emptyList());
            }

            public static Factory withDefaultAssigner() {
                return with(Assigner.DEFAULT, Assigner.Typing.STATIC);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Chain chain = (Chain) obj;
                return this.typing.equals(chain.typing) && this.assigner.equals(chain.assigner) && this.steps.equals(chain.steps);
            }

            public int hashCode() {
                return (((((getClass().hashCode() * 31) + this.assigner.hashCode()) * 31) + this.typing.hashCode()) * 31) + this.steps.hashCode();
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution
            public StackManipulation resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, int i) {
                ArrayList arrayList = new ArrayList(generic.size() + 1 + (this.steps.size() * 2) + (generic2.represents(Void.TYPE) ? 0 : 2));
                HashMap map = new HashMap();
                int size = i;
                for (int size2 = generic.size() - 1; size2 >= 0; size2--) {
                    arrayList.add(MethodVariableAccess.m5387of(generic.get(size2)).storeAt(size));
                    map.put(Integer.valueOf(size2), Integer.valueOf(size));
                    size += generic.get(size2).getStackSize().getSize();
                }
                arrayList.add(DefaultValue.m5381of(generic2));
                Iterator<Step> it = this.steps.iterator();
                TypeDescription.Generic resultType = generic2;
                while (it.hasNext()) {
                    Step.Resolution resolutionResolve = it.next().resolve(typeDescription, member, generic, generic2, methodHandle, stackManipulation, resultType, map, size);
                    arrayList.add(resolutionResolve.getStackManipulation());
                    resultType = resolutionResolve.getResultType();
                }
                StackManipulation stackManipulationAssign = this.assigner.assign(resultType, generic2, this.typing);
                if (stackManipulationAssign.isValid()) {
                    arrayList.add(stackManipulationAssign);
                    return new StackManipulation.Compound(arrayList);
                }
                throw new IllegalStateException("Failed to assign " + resultType + " to " + generic2);
            }
        }

        public interface Factory {
            Substitution make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForFieldAccess implements Substitution {
            private final FieldResolver fieldResolver;
            private final TypeDescription instrumentedType;

            public interface FieldResolver {

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForElementMatcher implements FieldResolver {
                    private final TypeDescription instrumentedType;
                    private final ElementMatcher<? super FieldDescription> matcher;

                    public ForElementMatcher(TypeDescription typeDescription, ElementMatcher<? super FieldDescription> elementMatcher) {
                        this.instrumentedType = typeDescription;
                        this.matcher = elementMatcher;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForElementMatcher forElementMatcher = (ForElementMatcher) obj;
                        return this.instrumentedType.equals(forElementMatcher.instrumentedType) && this.matcher.equals(forElementMatcher.matcher);
                    }

                    public int hashCode() {
                        return (((getClass().hashCode() * 31) + this.instrumentedType.hashCode()) * 31) + this.matcher.hashCode();
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.FieldResolver
                    public FieldDescription resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2) {
                        if (generic.isEmpty()) {
                            throw new IllegalStateException("Cannot substitute parameterless instruction with " + member);
                        }
                        if (generic.get(0).isPrimitive() || generic.get(0).isArray()) {
                            throw new IllegalStateException("Cannot access field on primitive or array type for " + member);
                        }
                        TypeDefinition superClass = (TypeDefinition) generic.get(0).accept(new TypeDescription.Generic.Visitor.Substitutor.ForReplacement(this.instrumentedType));
                        do {
                            FieldList fieldListFilter = superClass.getDeclaredFields().filter(ElementMatchers.not(ElementMatchers.isStatic()).and(ElementMatchers.isVisibleTo(this.instrumentedType)).and(this.matcher));
                            if (fieldListFilter.size() == 1) {
                                return (FieldDescription) fieldListFilter.getOnly();
                            }
                            if (fieldListFilter.size() > 1) {
                                throw new IllegalStateException("Ambiguous field location of " + fieldListFilter);
                            }
                            superClass = superClass.getSuperClass();
                        } while (superClass != null);
                        throw new IllegalStateException("Cannot locate field matching " + this.matcher + " on " + typeDescription);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class Simple implements FieldResolver {
                    private final FieldDescription fieldDescription;

                    public Simple(FieldDescription fieldDescription) {
                        this.fieldDescription = fieldDescription;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Simple) obj).fieldDescription);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.fieldDescription.hashCode();
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.FieldResolver
                    public FieldDescription resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2) {
                        return this.fieldDescription;
                    }
                }

                FieldDescription resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2);
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class OfGivenField implements Factory {
                private final FieldDescription fieldDescription;

                public OfGivenField(FieldDescription fieldDescription) {
                    this.fieldDescription = fieldDescription;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((OfGivenField) obj).fieldDescription);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.fieldDescription.hashCode();
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public Substitution make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                    return new ForFieldAccess(typeDescription, new FieldResolver.Simple(this.fieldDescription));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class OfMatchedField implements Factory {
                private final ElementMatcher<? super FieldDescription> matcher;

                public OfMatchedField(ElementMatcher<? super FieldDescription> elementMatcher) {
                    this.matcher = elementMatcher;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.matcher.equals(((OfMatchedField) obj).matcher);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.matcher.hashCode();
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public Substitution make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                    return new ForFieldAccess(typeDescription, new FieldResolver.ForElementMatcher(typeDescription, this.matcher));
                }
            }

            public ForFieldAccess(TypeDescription typeDescription, FieldResolver fieldResolver) {
                this.instrumentedType = typeDescription;
                this.fieldResolver = fieldResolver;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForFieldAccess forFieldAccess = (ForFieldAccess) obj;
                return this.instrumentedType.equals(forFieldAccess.instrumentedType) && this.fieldResolver.equals(forFieldAccess.fieldResolver);
            }

            public int hashCode() {
                return (((getClass().hashCode() * 31) + this.instrumentedType.hashCode()) * 31) + this.fieldResolver.hashCode();
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution
            @SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public StackManipulation resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, int i) {
                FieldDescription fieldDescriptionResolve = this.fieldResolver.resolve(typeDescription, member, generic, generic2);
                if (!fieldDescriptionResolve.isAccessibleTo(this.instrumentedType)) {
                    throw new IllegalStateException(this.instrumentedType + " cannot access " + fieldDescriptionResolve);
                }
                if (generic2.represents(Void.TYPE)) {
                    if (generic.size() != (fieldDescriptionResolve.isStatic() ? 1 : 2)) {
                        throw new IllegalStateException("Cannot set " + fieldDescriptionResolve + " with " + generic);
                    }
                    if (!fieldDescriptionResolve.isStatic() && !generic.get(0).asErasure().isAssignableTo(fieldDescriptionResolve.getDeclaringType().asErasure())) {
                        throw new IllegalStateException("Cannot set " + fieldDescriptionResolve + " on " + generic.get(0));
                    }
                    if (generic.get(!fieldDescriptionResolve.isStatic() ? 1 : 0).asErasure().isAssignableTo(fieldDescriptionResolve.getType().asErasure())) {
                        return FieldAccess.forField(fieldDescriptionResolve).write();
                    }
                    throw new IllegalStateException("Cannot set " + fieldDescriptionResolve + " to " + generic.get(!fieldDescriptionResolve.isStatic() ? 1 : 0));
                }
                if (generic.size() != (1 ^ (fieldDescriptionResolve.isStatic() ? 1 : 0))) {
                    throw new IllegalStateException("Cannot set " + fieldDescriptionResolve + " with " + generic);
                }
                if (!fieldDescriptionResolve.isStatic() && !generic.get(0).asErasure().isAssignableTo(fieldDescriptionResolve.getDeclaringType().asErasure())) {
                    throw new IllegalStateException("Cannot get " + fieldDescriptionResolve + " on " + generic.get(0));
                }
                if (fieldDescriptionResolve.getType().asErasure().isAssignableTo(generic2.asErasure())) {
                    return FieldAccess.forField(fieldDescriptionResolve).read();
                }
                throw new IllegalStateException("Cannot get " + fieldDescriptionResolve + " as " + generic2);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodInvocation implements Substitution {
            private final TypeDescription instrumentedType;
            private final MethodResolver methodResolver;

            public interface MethodResolver {

                @HashCodeAndEqualsPlugin.Enhance
                public static class Matching implements MethodResolver {
                    private final TypeDescription instrumentedType;
                    private final ElementMatcher<? super MethodDescription> matcher;
                    private final MethodGraph.Compiler methodGraphCompiler;

                    public Matching(TypeDescription typeDescription, MethodGraph.Compiler compiler, ElementMatcher<? super MethodDescription> elementMatcher) {
                        this.instrumentedType = typeDescription;
                        this.methodGraphCompiler = compiler;
                        this.matcher = elementMatcher;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Matching matching = (Matching) obj;
                        return this.instrumentedType.equals(matching.instrumentedType) && this.methodGraphCompiler.equals(matching.methodGraphCompiler) && this.matcher.equals(matching.matcher);
                    }

                    public int hashCode() {
                        return (((((getClass().hashCode() * 31) + this.instrumentedType.hashCode()) * 31) + this.methodGraphCompiler.hashCode()) * 31) + this.matcher.hashCode();
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver
                    public MethodDescription resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2) {
                        if (generic.isEmpty()) {
                            throw new IllegalStateException("Cannot substitute parameterless instruction with " + member);
                        }
                        if (generic.get(0).isPrimitive() || generic.get(0).isArray()) {
                            throw new IllegalStateException("Cannot invoke method on primitive or array type for " + member);
                        }
                        TypeDefinition typeDefinition = (TypeDefinition) generic.get(0).accept(new TypeDescription.Generic.Visitor.Substitutor.ForReplacement(this.instrumentedType));
                        List listM5414of = CompoundList.m5414of(this.methodGraphCompiler.compile(typeDefinition, this.instrumentedType).listNodes().asMethodList().filter(this.matcher), typeDefinition.getDeclaredMethods().filter(ElementMatchers.isPrivate().and(ElementMatchers.isVisibleTo(this.instrumentedType)).and(this.matcher)));
                        if (listM5414of.size() == 1) {
                            return (MethodDescription) listM5414of.get(0);
                        }
                        throw new IllegalStateException("Not exactly one method that matches " + this.matcher + ": " + listM5414of);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class Simple implements MethodResolver {
                    private final MethodDescription methodDescription;

                    public Simple(MethodDescription methodDescription) {
                        this.methodDescription = methodDescription;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.methodDescription.equals(((Simple) obj).methodDescription);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.methodDescription.hashCode();
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver
                    public MethodDescription resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2) {
                        return this.methodDescription;
                    }
                }

                MethodDescription resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2);
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class OfGivenMethod implements Factory {
                private final MethodDescription methodDescription;

                public OfGivenMethod(MethodDescription methodDescription) {
                    this.methodDescription = methodDescription;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.methodDescription.equals(((OfGivenMethod) obj).methodDescription);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.methodDescription.hashCode();
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public Substitution make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                    return new ForMethodInvocation(typeDescription, new MethodResolver.Simple(this.methodDescription));
                }
            }

            public enum OfInstrumentedMethod implements Factory {
                INSTANCE;

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public Substitution make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                    return new ForMethodInvocation(typeDescription, new MethodResolver.Simple(methodDescription));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class OfMatchedMethod implements Factory {
                private final ElementMatcher<? super MethodDescription> matcher;
                private final MethodGraph.Compiler methodGraphCompiler;

                public OfMatchedMethod(ElementMatcher<? super MethodDescription> elementMatcher, MethodGraph.Compiler compiler) {
                    this.matcher = elementMatcher;
                    this.methodGraphCompiler = compiler;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    OfMatchedMethod ofMatchedMethod = (OfMatchedMethod) obj;
                    return this.matcher.equals(ofMatchedMethod.matcher) && this.methodGraphCompiler.equals(ofMatchedMethod.methodGraphCompiler);
                }

                public int hashCode() {
                    return (((getClass().hashCode() * 31) + this.matcher.hashCode()) * 31) + this.methodGraphCompiler.hashCode();
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public Substitution make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                    return new ForMethodInvocation(typeDescription, new MethodResolver.Matching(typeDescription, this.methodGraphCompiler, this.matcher));
                }
            }

            public ForMethodInvocation(TypeDescription typeDescription, MethodResolver methodResolver) {
                this.instrumentedType = typeDescription;
                this.methodResolver = methodResolver;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForMethodInvocation forMethodInvocation = (ForMethodInvocation) obj;
                return this.instrumentedType.equals(forMethodInvocation.instrumentedType) && this.methodResolver.equals(forMethodInvocation.methodResolver);
            }

            public int hashCode() {
                return (((getClass().hashCode() * 31) + this.instrumentedType.hashCode()) * 31) + this.methodResolver.hashCode();
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution
            public StackManipulation resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, int i) {
                MethodDescription methodDescriptionResolve = this.methodResolver.resolve(typeDescription, member, generic, generic2);
                if (!methodDescriptionResolve.isAccessibleTo(this.instrumentedType)) {
                    throw new IllegalStateException(this.instrumentedType + " cannot access " + methodDescriptionResolve);
                }
                List listAsTypeList = methodDescriptionResolve.isStatic() ? methodDescriptionResolve.getParameters().asTypeList() : new TypeList.Generic.Explicit((List<? extends TypeDefinition>) CompoundList.m5412of(methodDescriptionResolve.getDeclaringType(), methodDescriptionResolve.getParameters().asTypeList()));
                if (!methodDescriptionResolve.getReturnType().asErasure().isAssignableTo(generic2.asErasure())) {
                    throw new IllegalStateException("Cannot assign return value of " + methodDescriptionResolve + " to " + generic2);
                }
                if (listAsTypeList.size() != generic.size()) {
                    throw new IllegalStateException("Cannot invoke " + methodDescriptionResolve + " on " + generic.size() + " parameters");
                }
                for (int i2 = 0; i2 < listAsTypeList.size(); i2++) {
                    if (!generic.get(i2).asErasure().isAssignableTo(((TypeDescription.Generic) listAsTypeList.get(i2)).asErasure())) {
                        throw new IllegalStateException("Cannot invoke " + methodDescriptionResolve + " on parameter " + i2 + " of type " + generic.get(i2));
                    }
                }
                boolean zIsVirtual = methodDescriptionResolve.isVirtual();
                MethodInvocation.WithImplicitInvocationTargetType withImplicitInvocationTargetTypeInvoke = MethodInvocation.invoke(methodDescriptionResolve);
                return zIsVirtual ? withImplicitInvocationTargetTypeInvoke.virtual(((TypeDescription.Generic) listAsTypeList.get(0)).asErasure()) : withImplicitInvocationTargetTypeInvoke;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForValue implements Substitution, Factory {
            private final StackManipulation stackManipulation;
            private final TypeDescription.Generic typeDescription;

            public ForValue(StackManipulation stackManipulation, TypeDescription.Generic generic) {
                this.stackManipulation = stackManipulation;
                this.typeDescription = generic;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForValue forValue = (ForValue) obj;
                return this.stackManipulation.equals(forValue.stackManipulation) && this.typeDescription.equals(forValue.typeDescription);
            }

            public int hashCode() {
                return (((getClass().hashCode() * 31) + this.stackManipulation.hashCode()) * 31) + this.typeDescription.hashCode();
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
            public Substitution make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                return this;
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution
            public StackManipulation resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, int i) {
                ArrayList arrayList = new ArrayList(generic.size());
                for (int size = generic.size() - 1; size >= 0; size--) {
                    arrayList.add(Removal.m5370of(generic.get(size)));
                }
                if (this.typeDescription.asErasure().isAssignableTo(generic2.asErasure())) {
                    return new StackManipulation.Compound((List<? extends StackManipulation>) CompoundList.m5413of(arrayList, this.stackManipulation));
                }
                throw new IllegalStateException("Cannot assign " + this.typeDescription + " to " + generic2);
            }
        }

        public enum Stubbing implements Substitution, Factory {
            INSTANCE;

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
            public Substitution make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                return this;
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution
            public StackManipulation resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, int i) {
                ArrayList arrayList = new ArrayList(generic.size());
                for (int size = generic.size() - 1; size >= 0; size--) {
                    arrayList.add(Removal.m5370of(generic.get(size)));
                }
                return new StackManipulation.Compound((List<? extends StackManipulation>) CompoundList.m5413of(arrayList, DefaultValue.m5381of(generic2.asErasure())));
            }
        }

        StackManipulation resolve(TypeDescription typeDescription, ByteCodeElement.Member member, TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, int i);
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface This {
        boolean optional() default false;

        Source source() default Source.SUBSTITUTED_ELEMENT;

        Assigner.Typing typing() default Assigner.Typing.STATIC;
    }

    public interface TypePoolResolver {

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForClassFileLocator implements TypePoolResolver {
            private final ClassFileLocator classFileLocator;
            private final TypePool.Default.ReaderMode readerMode;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ForClassFileLocator(ClassFileLocator classFileLocator) {
                this(classFileLocator, TypePool.Default.ReaderMode.FAST);
            }

            /* JADX INFO: renamed from: of */
            public static TypePoolResolver m5195of(@MaybeNull ClassLoader classLoader) {
                return new ForClassFileLocator(ClassFileLocator.ForClassLoader.m5258of(classLoader));
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForClassFileLocator forClassFileLocator = (ForClassFileLocator) obj;
                return this.readerMode.equals(forClassFileLocator.readerMode) && this.classFileLocator.equals(forClassFileLocator.classFileLocator);
            }

            public int hashCode() {
                return (((getClass().hashCode() * 31) + this.classFileLocator.hashCode()) * 31) + this.readerMode.hashCode();
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.TypePoolResolver
            public TypePool resolve(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                return new TypePool.Default(new TypePool.CacheProvider.Simple(), this.classFileLocator, this.readerMode, typePool);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public ForClassFileLocator(ClassFileLocator classFileLocator, TypePool.Default.ReaderMode readerMode) {
                this.classFileLocator = classFileLocator;
                this.readerMode = readerMode;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForExplicitPool implements TypePoolResolver {
            private final TypePool typePool;

            public ForExplicitPool(TypePool typePool) {
                this.typePool = typePool;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.typePool.equals(((ForExplicitPool) obj).typePool);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.typePool.hashCode();
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.TypePoolResolver
            public TypePool resolve(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                return this.typePool;
            }
        }

        public enum OfImplicitPool implements TypePoolResolver {
            INSTANCE;

            @Override // net.bytebuddy.asm.MemberSubstitution.TypePoolResolver
            public TypePool resolve(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                return typePool;
            }
        }

        TypePool resolve(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool);
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Unused {
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class WithoutSpecification {
        protected final boolean failIfNoMatch;
        protected final MethodGraph.Compiler methodGraphCompiler;
        protected final Replacement.Factory replacementFactory;
        protected final boolean strict;
        protected final TypePoolResolver typePoolResolver;

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMatchedByteCodeElement extends WithoutSpecification {
            private final ElementMatcher<? super ByteCodeElement.Member> matcher;

            public ForMatchedByteCodeElement(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, boolean z2, Replacement.Factory factory, ElementMatcher<? super ByteCodeElement.Member> elementMatcher) {
                super(compiler, typePoolResolver, z, z2, factory);
                this.matcher = elementMatcher;
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public boolean equals(@MaybeNull Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.matcher.equals(((ForMatchedByteCodeElement) obj).matcher);
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public int hashCode() {
                return (super.hashCode() * 31) + this.matcher.hashCode();
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public MemberSubstitution replaceWith(Substitution.Factory factory) {
                return new MemberSubstitution(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.failIfNoMatch, new Replacement.Factory.Compound(this.replacementFactory, Replacement.ForElementMatchers.Factory.m5180of(this.matcher, factory)));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMatchedField extends WithoutSpecification {
            private final boolean matchRead;
            private final boolean matchWrite;
            private final ElementMatcher<? super FieldDescription> matcher;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ForMatchedField(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, boolean z2, Replacement.Factory factory, ElementMatcher<? super FieldDescription> elementMatcher) {
                this(compiler, typePoolResolver, z, z2, factory, elementMatcher, true, true);
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
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
                ForMatchedField forMatchedField = (ForMatchedField) obj;
                return this.matchRead == forMatchedField.matchRead && this.matchWrite == forMatchedField.matchWrite && this.matcher.equals(forMatchedField.matcher);
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public int hashCode() {
                return (((((super.hashCode() * 31) + this.matcher.hashCode()) * 31) + (this.matchRead ? 1 : 0)) * 31) + (this.matchWrite ? 1 : 0);
            }

            public WithoutSpecification onRead() {
                return new ForMatchedField(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.failIfNoMatch, this.replacementFactory, this.matcher, true, false);
            }

            public WithoutSpecification onWrite() {
                return new ForMatchedField(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.failIfNoMatch, this.replacementFactory, this.matcher, false, true);
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public MemberSubstitution replaceWith(Substitution.Factory factory) {
                return new MemberSubstitution(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.failIfNoMatch, new Replacement.Factory.Compound(this.replacementFactory, Replacement.ForElementMatchers.Factory.ofField(this.matcher, this.matchRead, this.matchWrite, factory)));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public ForMatchedField(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, boolean z2, Replacement.Factory factory, ElementMatcher<? super FieldDescription> elementMatcher, boolean z3, boolean z4) {
                super(compiler, typePoolResolver, z, z2, factory);
                this.matcher = elementMatcher;
                this.matchRead = z3;
                this.matchWrite = z4;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMatchedMethod extends WithoutSpecification {
            private final boolean includeSuperCalls;
            private final boolean includeVirtualCalls;
            private final ElementMatcher<? super MethodDescription> matcher;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ForMatchedMethod(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, boolean z2, Replacement.Factory factory, ElementMatcher<? super MethodDescription> elementMatcher) {
                this(compiler, typePoolResolver, z, z2, factory, elementMatcher, true, true);
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
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
                ForMatchedMethod forMatchedMethod = (ForMatchedMethod) obj;
                return this.includeVirtualCalls == forMatchedMethod.includeVirtualCalls && this.includeSuperCalls == forMatchedMethod.includeSuperCalls && this.matcher.equals(forMatchedMethod.matcher);
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public int hashCode() {
                return (((((super.hashCode() * 31) + this.matcher.hashCode()) * 31) + (this.includeVirtualCalls ? 1 : 0)) * 31) + (this.includeSuperCalls ? 1 : 0);
            }

            public WithoutSpecification onSuperCall() {
                return new ForMatchedMethod(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.failIfNoMatch, this.replacementFactory, ElementMatchers.isVirtual().and(this.matcher), false, true);
            }

            public WithoutSpecification onVirtualCall() {
                return new ForMatchedMethod(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.failIfNoMatch, this.replacementFactory, ElementMatchers.isVirtual().and(this.matcher), true, false);
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public MemberSubstitution replaceWith(Substitution.Factory factory) {
                return new MemberSubstitution(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.failIfNoMatch, new Replacement.Factory.Compound(this.replacementFactory, Replacement.ForElementMatchers.Factory.ofMethod(this.matcher, this.includeVirtualCalls, this.includeSuperCalls, factory)));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public ForMatchedMethod(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, boolean z2, Replacement.Factory factory, ElementMatcher<? super MethodDescription> elementMatcher, boolean z3, boolean z4) {
                super(compiler, typePoolResolver, z, z2, factory);
                this.matcher = elementMatcher;
                this.includeVirtualCalls = z3;
                this.includeSuperCalls = z4;
            }
        }

        public WithoutSpecification(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, boolean z2, Replacement.Factory factory) {
            this.methodGraphCompiler = compiler;
            this.typePoolResolver = typePoolResolver;
            this.strict = z;
            this.failIfNoMatch = z2;
            this.replacementFactory = factory;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WithoutSpecification withoutSpecification = (WithoutSpecification) obj;
            return this.strict == withoutSpecification.strict && this.failIfNoMatch == withoutSpecification.failIfNoMatch && this.methodGraphCompiler.equals(withoutSpecification.methodGraphCompiler) && this.typePoolResolver.equals(withoutSpecification.typePoolResolver) && this.replacementFactory.equals(withoutSpecification.replacementFactory);
        }

        public int hashCode() {
            return (((((((((getClass().hashCode() * 31) + this.methodGraphCompiler.hashCode()) * 31) + this.typePoolResolver.hashCode()) * 31) + (this.strict ? 1 : 0)) * 31) + (this.failIfNoMatch ? 1 : 0)) * 31) + this.replacementFactory.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public MemberSubstitution replaceWith(Field field) {
            return replaceWith(new FieldDescription.ForLoadedField(field));
        }

        public abstract MemberSubstitution replaceWith(Substitution.Factory factory);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public MemberSubstitution replaceWithChain(Substitution.Chain.Step.Factory... factoryArr) {
            return replaceWithChain(Arrays.asList(factoryArr));
        }

        public MemberSubstitution replaceWithConstant(Object obj) {
            ConstantValue constantValueWrap = ConstantValue.Simple.wrap(obj);
            return replaceWith(new Substitution.ForValue(constantValueWrap.toStackManipulation(), constantValueWrap.getTypeDescription().asGenericType()));
        }

        public MemberSubstitution replaceWithField(ElementMatcher<? super FieldDescription> elementMatcher) {
            return replaceWith(new Substitution.ForFieldAccess.OfMatchedField(elementMatcher));
        }

        public MemberSubstitution replaceWithInstrumentedMethod() {
            return replaceWith(Substitution.ForMethodInvocation.OfInstrumentedMethod.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public MemberSubstitution replaceWithMethod(ElementMatcher<? super MethodDescription> elementMatcher) {
            return replaceWithMethod(elementMatcher, this.methodGraphCompiler);
        }

        public MemberSubstitution stub() {
            return replaceWith(Substitution.Stubbing.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public MemberSubstitution replaceWith(FieldDescription fieldDescription) {
            return replaceWith(new Substitution.ForFieldAccess.OfGivenField(fieldDescription));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public MemberSubstitution replaceWithChain(List<? extends Substitution.Chain.Step.Factory> list) {
            return replaceWith(Substitution.Chain.withDefaultAssigner().executing(list));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public MemberSubstitution replaceWithMethod(ElementMatcher<? super MethodDescription> elementMatcher, MethodGraph.Compiler compiler) {
            return replaceWith(new Substitution.ForMethodInvocation.OfMatchedMethod(elementMatcher, compiler));
        }

        public MemberSubstitution replaceWith(Method method) {
            return replaceWith(new MethodDescription.ForLoadedMethod(method));
        }

        public MemberSubstitution replaceWith(MethodDescription methodDescription) {
            if (methodDescription.isMethod()) {
                return replaceWith(new Substitution.ForMethodInvocation.OfGivenMethod(methodDescription));
            }
            throw new IllegalArgumentException("Cannot use " + methodDescription + " as a replacement");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MemberSubstitution(boolean z) {
        this(MethodGraph.Compiler.DEFAULT, TypePoolResolver.OfImplicitPool.INSTANCE, z, false, Replacement.NoOp.INSTANCE);
    }

    public static MemberSubstitution relaxed() {
        return new MemberSubstitution(false);
    }

    public static MemberSubstitution strict() {
        return new MemberSubstitution(true);
    }

    public WithoutSpecification constructor(ElementMatcher<? super MethodDescription> elementMatcher) {
        return invokable(ElementMatchers.isConstructor().and(elementMatcher));
    }

    public WithoutSpecification element(ElementMatcher<? super ByteCodeElement.Member> elementMatcher) {
        return new WithoutSpecification.ForMatchedByteCodeElement(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.failIfNoMatch, this.replacementFactory, elementMatcher);
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberSubstitution memberSubstitution = (MemberSubstitution) obj;
        return this.strict == memberSubstitution.strict && this.failIfNoMatch == memberSubstitution.failIfNoMatch && this.methodGraphCompiler.equals(memberSubstitution.methodGraphCompiler) && this.typePoolResolver.equals(memberSubstitution.typePoolResolver) && this.replacementFactory.equals(memberSubstitution.replacementFactory);
    }

    public MemberSubstitution failIfNoMatch(boolean z) {
        return new MemberSubstitution(this.methodGraphCompiler, this.typePoolResolver, this.strict, z, this.replacementFactory);
    }

    public WithoutSpecification.ForMatchedField field(ElementMatcher<? super FieldDescription> elementMatcher) {
        return new WithoutSpecification.ForMatchedField(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.failIfNoMatch, this.replacementFactory, elementMatcher);
    }

    public int hashCode() {
        return (((((((((getClass().hashCode() * 31) + this.methodGraphCompiler.hashCode()) * 31) + this.typePoolResolver.hashCode()) * 31) + (this.strict ? 1 : 0)) * 31) + (this.failIfNoMatch ? 1 : 0)) * 31) + this.replacementFactory.hashCode();
    }

    public WithoutSpecification invokable(ElementMatcher<? super MethodDescription> elementMatcher) {
        return new WithoutSpecification.ForMatchedMethod(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.failIfNoMatch, this.replacementFactory, elementMatcher);
    }

    public WithoutSpecification.ForMatchedMethod method(ElementMatcher<? super MethodDescription> elementMatcher) {
        return new WithoutSpecification.ForMatchedMethod(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.failIfNoMatch, this.replacementFactory, elementMatcher);
    }

    /* JADX INFO: renamed from: on */
    public AsmVisitorWrapper.ForDeclaredMethods m5179on(ElementMatcher<? super MethodDescription> elementMatcher) {
        return new AsmVisitorWrapper.ForDeclaredMethods().invokable(elementMatcher, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MemberSubstitution with(MethodGraph.Compiler compiler) {
        return new MemberSubstitution(compiler, this.typePoolResolver, this.strict, this.failIfNoMatch, this.replacementFactory);
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper
    public MethodVisitor wrap(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, TypePool typePool, int i, int i2) {
        TypePool typePoolResolve = this.typePoolResolver.resolve(typeDescription, methodDescription, typePool);
        return new SubstitutingMethodVisitor(methodVisitor, typeDescription, methodDescription, this.methodGraphCompiler, this.strict, this.failIfNoMatch, this.replacementFactory.make(typeDescription, methodDescription, typePoolResolve), context, typePoolResolve, context.getClassFileVersion().isAtLeast(ClassFileVersion.JAVA_V11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MemberSubstitution(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, boolean z2, Replacement.Factory factory) {
        this.methodGraphCompiler = compiler;
        this.typePoolResolver = typePoolResolver;
        this.failIfNoMatch = z2;
        this.strict = z;
        this.replacementFactory = factory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MemberSubstitution with(TypePoolResolver typePoolResolver) {
        return new MemberSubstitution(this.methodGraphCompiler, typePoolResolver, this.strict, this.failIfNoMatch, this.replacementFactory);
    }

    public interface Replacement {

        public interface Binding {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Resolved implements Binding {
                private final ByteCodeElement.Member original;
                private final TypeDescription receiver;
                private final Substitution substitution;

                public Resolved(TypeDescription typeDescription, ByteCodeElement.Member member, Substitution substitution) {
                    this.receiver = typeDescription;
                    this.original = member;
                    this.substitution = substitution;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Resolved resolved = (Resolved) obj;
                    return this.receiver.equals(resolved.receiver) && this.original.equals(resolved.original) && this.substitution.equals(resolved.substitution);
                }

                public int hashCode() {
                    return (((((getClass().hashCode() * 31) + this.receiver.hashCode()) * 31) + this.original.hashCode()) * 31) + this.substitution.hashCode();
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Binding
                public boolean isBound() {
                    return true;
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Binding
                public StackManipulation make(TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, int i) {
                    return this.substitution.resolve(this.receiver, this.original, generic, generic2, methodHandle, stackManipulation, i);
                }
            }

            public enum Unresolved implements Binding {
                INSTANCE;

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Binding
                public boolean isBound() {
                    return false;
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Binding
                public StackManipulation make(TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, int i) {
                    throw new IllegalStateException("Cannot resolve unresolved binding");
                }
            }

            boolean isBound();

            StackManipulation make(TypeList.Generic generic, TypeDescription.Generic generic2, JavaConstant.MethodHandle methodHandle, StackManipulation stackManipulation, int i);
        }

        public interface Factory {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Compound implements Factory {
                private final List<Factory> factories;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Compound(Factory... factoryArr) {
                    this((List<? extends Factory>) Arrays.asList(factoryArr));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.factories.equals(((Compound) obj).factories);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.factories.hashCode();
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Factory
                public Replacement make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Factory> it = this.factories.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().make(typeDescription, methodDescription, typePool));
                    }
                    return new ForFirstBinding(arrayList);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Compound(List<? extends Factory> list) {
                    this.factories = new ArrayList();
                    for (Factory factory : list) {
                        if (factory instanceof Compound) {
                            this.factories.addAll(((Compound) factory).factories);
                        } else if (!(factory instanceof NoOp)) {
                            this.factories.add(factory);
                        }
                    }
                }
            }

            Replacement make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForElementMatchers implements Replacement {
            private final ElementMatcher<? super FieldDescription> fieldMatcher;
            private final boolean includeSuperCalls;
            private final boolean includeVirtualCalls;
            private final boolean matchFieldRead;
            private final boolean matchFieldWrite;
            private final ElementMatcher<? super MethodDescription> methodMatcher;
            private final Substitution substitution;

            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements Factory {
                private final ElementMatcher<? super FieldDescription> fieldMatcher;
                private final boolean includeSuperCalls;
                private final boolean includeVirtualCalls;
                private final boolean matchFieldRead;
                private final boolean matchFieldWrite;
                private final ElementMatcher<? super MethodDescription> methodMatcher;
                private final Substitution.Factory substitutionFactory;

                public Factory(ElementMatcher<? super FieldDescription> elementMatcher, ElementMatcher<? super MethodDescription> elementMatcher2, boolean z, boolean z2, boolean z3, boolean z4, Substitution.Factory factory) {
                    this.fieldMatcher = elementMatcher;
                    this.methodMatcher = elementMatcher2;
                    this.matchFieldRead = z;
                    this.matchFieldWrite = z2;
                    this.includeVirtualCalls = z3;
                    this.includeSuperCalls = z4;
                    this.substitutionFactory = factory;
                }

                /* JADX INFO: renamed from: of */
                public static Factory m5180of(ElementMatcher<? super ByteCodeElement.Member> elementMatcher, Substitution.Factory factory) {
                    return new Factory(elementMatcher, elementMatcher, true, true, true, true, factory);
                }

                public static Factory ofField(ElementMatcher<? super FieldDescription> elementMatcher, boolean z, boolean z2, Substitution.Factory factory) {
                    return new Factory(elementMatcher, ElementMatchers.none(), z, z2, false, false, factory);
                }

                public static Factory ofMethod(ElementMatcher<? super MethodDescription> elementMatcher, boolean z, boolean z2, Substitution.Factory factory) {
                    return new Factory(ElementMatchers.none(), elementMatcher, false, false, z, z2, factory);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Factory factory = (Factory) obj;
                    return this.matchFieldRead == factory.matchFieldRead && this.matchFieldWrite == factory.matchFieldWrite && this.includeVirtualCalls == factory.includeVirtualCalls && this.includeSuperCalls == factory.includeSuperCalls && this.fieldMatcher.equals(factory.fieldMatcher) && this.methodMatcher.equals(factory.methodMatcher) && this.substitutionFactory.equals(factory.substitutionFactory);
                }

                public int hashCode() {
                    return (((((((((((((getClass().hashCode() * 31) + this.fieldMatcher.hashCode()) * 31) + this.methodMatcher.hashCode()) * 31) + (this.matchFieldRead ? 1 : 0)) * 31) + (this.matchFieldWrite ? 1 : 0)) * 31) + (this.includeVirtualCalls ? 1 : 0)) * 31) + (this.includeSuperCalls ? 1 : 0)) * 31) + this.substitutionFactory.hashCode();
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Factory
                public Replacement make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                    return new ForElementMatchers(this.fieldMatcher, this.methodMatcher, this.matchFieldRead, this.matchFieldWrite, this.includeVirtualCalls, this.includeSuperCalls, this.substitutionFactory.make(typeDescription, methodDescription, typePool));
                }
            }

            public ForElementMatchers(ElementMatcher<? super FieldDescription> elementMatcher, ElementMatcher<? super MethodDescription> elementMatcher2, boolean z, boolean z2, boolean z3, boolean z4, Substitution substitution) {
                this.fieldMatcher = elementMatcher;
                this.methodMatcher = elementMatcher2;
                this.matchFieldRead = z;
                this.matchFieldWrite = z2;
                this.includeVirtualCalls = z3;
                this.includeSuperCalls = z4;
                this.substitution = substitution;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public Binding bind(TypeDescription typeDescription, MethodDescription methodDescription, TypeDescription typeDescription2, FieldDescription fieldDescription, boolean z) {
                if (!z ? this.matchFieldRead : this.matchFieldWrite) {
                    if (this.fieldMatcher.matches(fieldDescription)) {
                        return new Binding.Resolved(typeDescription2, fieldDescription, this.substitution);
                    }
                }
                return Binding.Unresolved.INSTANCE;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForElementMatchers forElementMatchers = (ForElementMatchers) obj;
                return this.matchFieldRead == forElementMatchers.matchFieldRead && this.matchFieldWrite == forElementMatchers.matchFieldWrite && this.includeVirtualCalls == forElementMatchers.includeVirtualCalls && this.includeSuperCalls == forElementMatchers.includeSuperCalls && this.fieldMatcher.equals(forElementMatchers.fieldMatcher) && this.methodMatcher.equals(forElementMatchers.methodMatcher) && this.substitution.equals(forElementMatchers.substitution);
            }

            public int hashCode() {
                return (((((((((((((getClass().hashCode() * 31) + this.fieldMatcher.hashCode()) * 31) + this.methodMatcher.hashCode()) * 31) + (this.matchFieldRead ? 1 : 0)) * 31) + (this.matchFieldWrite ? 1 : 0)) * 31) + (this.includeVirtualCalls ? 1 : 0)) * 31) + (this.includeSuperCalls ? 1 : 0)) * 31) + this.substitution.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public Binding bind(TypeDescription typeDescription, MethodDescription methodDescription, TypeDescription typeDescription2, MethodDescription methodDescription2, InvocationType invocationType) {
                return (invocationType.matches(this.includeVirtualCalls, this.includeSuperCalls) && this.methodMatcher.matches(methodDescription2)) ? new Binding.Resolved(typeDescription2, methodDescription2, this.substitution) : Binding.Unresolved.INSTANCE;
            }
        }

        public enum InvocationType {
            VIRTUAL,
            SUPER,
            OTHER;

            /* JADX INFO: renamed from: of */
            public static InvocationType m5181of(int i, MethodDescription methodDescription) {
                if (i != 182) {
                    if (i == 183) {
                        return methodDescription.isVirtual() ? SUPER : OTHER;
                    }
                    if (i != 185) {
                        return OTHER;
                    }
                }
                return VIRTUAL;
            }

            public boolean matches(boolean z, boolean z2) {
                int i = C26701.f4222x5ede2ab3[ordinal()];
                if (i == 1) {
                    return z;
                }
                if (i != 2) {
                    return true;
                }
                return z2;
            }
        }

        public enum NoOp implements Replacement, Factory {
            INSTANCE;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public Binding bind(TypeDescription typeDescription, MethodDescription methodDescription, TypeDescription typeDescription2, FieldDescription fieldDescription, boolean z) {
                return Binding.Unresolved.INSTANCE;
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Factory
            public Replacement make(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                return this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public Binding bind(TypeDescription typeDescription, MethodDescription methodDescription, TypeDescription typeDescription2, MethodDescription methodDescription2, InvocationType invocationType) {
                return Binding.Unresolved.INSTANCE;
            }
        }

        Binding bind(TypeDescription typeDescription, MethodDescription methodDescription, TypeDescription typeDescription2, FieldDescription fieldDescription, boolean z);

        Binding bind(TypeDescription typeDescription, MethodDescription methodDescription, TypeDescription typeDescription2, MethodDescription methodDescription2, InvocationType invocationType);

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForFirstBinding implements Replacement {
            private final List<? extends Replacement> replacements;

            public ForFirstBinding(List<? extends Replacement> list) {
                this.replacements = list;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public Binding bind(TypeDescription typeDescription, MethodDescription methodDescription, TypeDescription typeDescription2, FieldDescription fieldDescription, boolean z) {
                Iterator<? extends Replacement> it = this.replacements.iterator();
                while (it.hasNext()) {
                    Binding bindingBind = it.next().bind(typeDescription, methodDescription, typeDescription2, fieldDescription, z);
                    if (bindingBind.isBound()) {
                        return bindingBind;
                    }
                }
                return Binding.Unresolved.INSTANCE;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.replacements.equals(((ForFirstBinding) obj).replacements);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.replacements.hashCode();
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public Binding bind(TypeDescription typeDescription, MethodDescription methodDescription, TypeDescription typeDescription2, MethodDescription methodDescription2, InvocationType invocationType) {
                Iterator<? extends Replacement> it = this.replacements.iterator();
                while (it.hasNext()) {
                    Binding bindingBind = it.next().bind(typeDescription, methodDescription, typeDescription2, methodDescription2, invocationType);
                    if (bindingBind.isBound()) {
                        return bindingBind;
                    }
                }
                return Binding.Unresolved.INSTANCE;
            }
        }
    }
}
