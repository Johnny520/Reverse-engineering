package net.bytebuddy.build;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;
import net.bytebuddy.build.Plugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.EqualsMethod;
import net.bytebuddy.implementation.HashCodeMethod;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.attribute.MethodAttributeAppender;
import net.bytebuddy.jar.asm.AnnotationVisitor;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
@Enhance
public class HashCodeAndEqualsPlugin implements Plugin, Plugin.Factory, MethodAttributeAppender.Factory, MethodAttributeAppender {
    private static final MethodDescription.InDefinedShape ENHANCE_INCLUDE_SYNTHETIC_FIELDS;
    private static final MethodDescription.InDefinedShape ENHANCE_INVOKE_SUPER;
    private static final MethodDescription.InDefinedShape ENHANCE_PERMIT_SUBCLASS_EQUALITY;
    private static final MethodDescription.InDefinedShape ENHANCE_SIMPLE_COMPARISON_FIRST;
    private static final MethodDescription.InDefinedShape ENHANCE_USE_TYPE_HASH_CONSTANT;
    private static final MethodDescription.InDefinedShape SORTED_VALUE;
    private static final MethodDescription.InDefinedShape VALUE_HANDLING_VALUE;

    @MaybeNull
    @ValueHandling(ValueHandling.Sort.REVERSE_NULLABILITY)
    private final String annotationType;

    public enum AnnotationOrderComparator implements Comparator<FieldDescription.InDefinedShape> {
        INSTANCE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        public int compare(FieldDescription.InDefinedShape inDefinedShape, FieldDescription.InDefinedShape inDefinedShape2) {
            AnnotationDescription.Loadable loadableOfType = inDefinedShape.getDeclaredAnnotations().ofType(Sorted.class);
            AnnotationDescription.Loadable loadableOfType2 = inDefinedShape2.getDeclaredAnnotations().ofType(Sorted.class);
            int iIntValue = loadableOfType == null ? 0 : ((Integer) loadableOfType.getValue(HashCodeAndEqualsPlugin.SORTED_VALUE).resolve(Integer.class)).intValue();
            int iIntValue2 = loadableOfType2 == null ? 0 : ((Integer) loadableOfType2.getValue(HashCodeAndEqualsPlugin.SORTED_VALUE).resolve(Integer.class)).intValue();
            if (iIntValue > iIntValue2) {
                return -1;
            }
            return iIntValue < iIntValue2 ? 1 : 0;
        }
    }

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Enhance {

        public enum InvokeSuper {
            IF_DECLARED { // from class: net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.1
                @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                public EqualsMethod equalsMethod(TypeDescription typeDescription) {
                    for (TypeDescription.Generic superClass = typeDescription.getSuperClass(); superClass != null && !superClass.represents(Object.class); superClass = superClass.getSuperClass()) {
                        if (superClass.asErasure().getDeclaredAnnotations().isAnnotationPresent(Enhance.class)) {
                            return EqualsMethod.requiringSuperClassEquality();
                        }
                        MethodList methodListFilter = superClass.getDeclaredMethods().filter(ElementMatchers.isHashCode());
                        if (!methodListFilter.isEmpty()) {
                            return ((MethodDescription) methodListFilter.getOnly()).isAbstract() ? EqualsMethod.isolated() : EqualsMethod.requiringSuperClassEquality();
                        }
                    }
                    return EqualsMethod.isolated();
                }

                @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                public HashCodeMethod hashCodeMethod(TypeDescription typeDescription, boolean z, boolean z2) {
                    for (TypeDescription.Generic superClass = typeDescription.getSuperClass(); superClass != null && !superClass.represents(Object.class); superClass = superClass.getSuperClass()) {
                        if (superClass.asErasure().getDeclaredAnnotations().isAnnotationPresent(Enhance.class)) {
                            return HashCodeMethod.usingSuperClassOffset();
                        }
                        MethodList methodListFilter = superClass.getDeclaredMethods().filter(ElementMatchers.isHashCode());
                        if (!methodListFilter.isEmpty()) {
                            return ((MethodDescription) methodListFilter.getOnly()).isAbstract() ? z ? HashCodeMethod.usingTypeHashOffset(!z2) : HashCodeMethod.usingDefaultOffset() : HashCodeMethod.usingSuperClassOffset();
                        }
                    }
                    return z ? HashCodeMethod.usingTypeHashOffset(!z2) : HashCodeMethod.usingDefaultOffset();
                }
            },
            IF_ANNOTATED { // from class: net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.2
                @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                public EqualsMethod equalsMethod(TypeDescription typeDescription) {
                    TypeDescription.Generic superClass = typeDescription.getSuperClass();
                    return (superClass == null || !superClass.asErasure().getDeclaredAnnotations().isAnnotationPresent(Enhance.class)) ? EqualsMethod.isolated() : EqualsMethod.requiringSuperClassEquality();
                }

                @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                public HashCodeMethod hashCodeMethod(TypeDescription typeDescription, boolean z, boolean z2) {
                    TypeDescription.Generic superClass = typeDescription.getSuperClass();
                    return (superClass == null || !superClass.asErasure().getDeclaredAnnotations().isAnnotationPresent(Enhance.class)) ? z ? HashCodeMethod.usingTypeHashOffset(!z2) : HashCodeMethod.usingDefaultOffset() : HashCodeMethod.usingSuperClassOffset();
                }
            },
            ALWAYS { // from class: net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.3
                @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                public EqualsMethod equalsMethod(TypeDescription typeDescription) {
                    return EqualsMethod.requiringSuperClassEquality();
                }

                @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                public HashCodeMethod hashCodeMethod(TypeDescription typeDescription, boolean z, boolean z2) {
                    return HashCodeMethod.usingSuperClassOffset();
                }
            },
            NEVER { // from class: net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.4
                @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                public EqualsMethod equalsMethod(TypeDescription typeDescription) {
                    return EqualsMethod.isolated();
                }

                @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                public HashCodeMethod hashCodeMethod(TypeDescription typeDescription, boolean z, boolean z2) {
                    return z ? HashCodeMethod.usingTypeHashOffset(!z2) : HashCodeMethod.usingDefaultOffset();
                }
            };

            public abstract EqualsMethod equalsMethod(TypeDescription typeDescription);

            public abstract HashCodeMethod hashCodeMethod(TypeDescription typeDescription, boolean z, boolean z2);
        }

        boolean includeSyntheticFields() default false;

        InvokeSuper invokeSuper() default InvokeSuper.IF_DECLARED;

        boolean permitSubclassEquality() default false;

        boolean simpleComparisonsFirst() default true;

        boolean useTypeHashConstant() default true;
    }

    @Target({ElementType.FIELD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Sorted {
        public static final int DEFAULT = 0;

        int value();
    }

    @Target({ElementType.FIELD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ValueHandling {

        public enum Sort {
            IGNORE,
            REVERSE_NULLABILITY
        }

        Sort value();
    }

    @Enhance
    public static class ValueMatcher extends ElementMatcher.Junction.ForNonNullValues<FieldDescription> {
        private final ValueHandling.Sort sort;

        public ValueMatcher(ValueHandling.Sort sort) {
            this.sort = sort;
        }

        @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
        public boolean equals(@MaybeNull Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.sort.equals(((ValueMatcher) obj).sort);
        }

        @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
        public int hashCode() {
            return (super.hashCode() * 31) + this.sort.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: doMatch(Ljava/lang/Object;)Z */
        @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
        public boolean doMatch(FieldDescription fieldDescription) {
            AnnotationDescription.Loadable loadableOfType = fieldDescription.getDeclaredAnnotations().ofType(ValueHandling.class);
            return loadableOfType != null && loadableOfType.getValue(HashCodeAndEqualsPlugin.VALUE_HANDLING_VALUE).load(ValueHandling.class.getClassLoader()).resolve(ValueHandling.Sort.class) == this.sort;
        }
    }

    @Enhance
    public static class WithNonNullableFields extends HashCodeAndEqualsPlugin {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public WithNonNullableFields() {
            this(null);
        }

        @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin
        public boolean equals(@MaybeNull Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin
        public int hashCode() {
            return super.hashCode();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin, net.bytebuddy.matcher.ElementMatcher
        public /* bridge */ /* synthetic */ boolean matches(@MaybeNull TypeDescription typeDescription) {
            return super.matches(typeDescription);
        }

        @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin
        public ElementMatcher<FieldDescription> nonNullable(ElementMatcher<FieldDescription> elementMatcher) {
            return ElementMatchers.not(elementMatcher);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public WithNonNullableFields(@MaybeNull String str) {
            super(str);
        }
    }

    static {
        MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.m5238of(Enhance.class).getDeclaredMethods();
        ENHANCE_INVOKE_SUPER = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("invokeSuper")).getOnly();
        ENHANCE_SIMPLE_COMPARISON_FIRST = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("simpleComparisonsFirst")).getOnly();
        ENHANCE_INCLUDE_SYNTHETIC_FIELDS = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("includeSyntheticFields")).getOnly();
        ENHANCE_PERMIT_SUBCLASS_EQUALITY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("permitSubclassEquality")).getOnly();
        ENHANCE_USE_TYPE_HASH_CONSTANT = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("useTypeHashConstant")).getOnly();
        VALUE_HANDLING_VALUE = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.m5238of(ValueHandling.class).getDeclaredMethods().filter(ElementMatchers.named("value")).getOnly();
        SORTED_VALUE = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.m5238of(Sorted.class).getDeclaredMethods().filter(ElementMatchers.named("value")).getOnly();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HashCodeAndEqualsPlugin() {
        this(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // net.bytebuddy.build.Plugin
    @SuppressFBWarnings(justification = "Annotation presence is required by matcher.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
    public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        AnnotationDescription.Loadable loadableOfType = typeDescription.getDeclaredAnnotations().ofType(Enhance.class);
        if (typeDescription.getDeclaredMethods().filter(ElementMatchers.isHashCode()).isEmpty()) {
            builder = builder.method(ElementMatchers.isHashCode()).intercept(((Enhance.InvokeSuper) loadableOfType.getValue(ENHANCE_INVOKE_SUPER).load(Enhance.class.getClassLoader()).resolve(Enhance.InvokeSuper.class)).hashCodeMethod(typeDescription, ((Boolean) loadableOfType.getValue(ENHANCE_USE_TYPE_HASH_CONSTANT).resolve(Boolean.class)).booleanValue(), ((Boolean) loadableOfType.getValue(ENHANCE_PERMIT_SUBCLASS_EQUALITY).resolve(Boolean.class)).booleanValue()).withIgnoredFields(((Boolean) loadableOfType.getValue(ENHANCE_INCLUDE_SYNTHETIC_FIELDS).resolve(Boolean.class)).booleanValue() ? ElementMatchers.none() : ElementMatchers.isSynthetic()).withIgnoredFields(new ValueMatcher(ValueHandling.Sort.IGNORE)).withNonNullableFields(nonNullable(new ValueMatcher(ValueHandling.Sort.REVERSE_NULLABILITY))));
        }
        if (!typeDescription.getDeclaredMethods().filter(ElementMatchers.isEquals()).isEmpty()) {
            return builder;
        }
        EqualsMethod equalsMethodWithFieldOrder = ((Enhance.InvokeSuper) loadableOfType.getValue(ENHANCE_INVOKE_SUPER).load(Enhance.class.getClassLoader()).resolve(Enhance.InvokeSuper.class)).equalsMethod(typeDescription).withIgnoredFields(((Boolean) loadableOfType.getValue(ENHANCE_INCLUDE_SYNTHETIC_FIELDS).resolve(Boolean.class)).booleanValue() ? ElementMatchers.none() : ElementMatchers.isSynthetic()).withIgnoredFields(new ValueMatcher(ValueHandling.Sort.IGNORE)).withNonNullableFields(nonNullable(new ValueMatcher(ValueHandling.Sort.REVERSE_NULLABILITY))).withFieldOrder(AnnotationOrderComparator.INSTANCE);
        EqualsMethod equalsMethodWithStringTypedFieldsFirst = equalsMethodWithFieldOrder;
        if (((Boolean) loadableOfType.getValue(ENHANCE_SIMPLE_COMPARISON_FIRST).resolve(Boolean.class)).booleanValue()) {
            equalsMethodWithStringTypedFieldsFirst = equalsMethodWithFieldOrder.withPrimitiveTypedFieldsFirst().withEnumerationTypedFieldsFirst().withPrimitiveWrapperTypedFieldsFirst().withStringTypedFieldsFirst();
        }
        DynamicType.Builder.MethodDefinition.ImplementationDefinition<?> implementationDefinitionMethod = builder.method(ElementMatchers.isEquals());
        EqualsMethod equalsMethodWithSubclassEquality = equalsMethodWithStringTypedFieldsFirst;
        if (((Boolean) loadableOfType.getValue(ENHANCE_PERMIT_SUBCLASS_EQUALITY).resolve(Boolean.class)).booleanValue()) {
            equalsMethodWithSubclassEquality = equalsMethodWithStringTypedFieldsFirst.withSubclassEquality();
        }
        return implementationDefinitionMethod.intercept(equalsMethodWithSubclassEquality).attribute(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
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
        String str = this.annotationType;
        String str2 = ((HashCodeAndEqualsPlugin) obj).annotationType;
        if (str2 != null) {
            return str != null && str.equals(str2);
        }
        if (str != null) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = getClass().hashCode() * 31;
        String str = this.annotationType;
        return str != null ? iHashCode + str.hashCode() : iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // net.bytebuddy.build.Plugin.Factory
    public Plugin make() {
        return this;
    }

    public ElementMatcher<FieldDescription> nonNullable(ElementMatcher<FieldDescription> elementMatcher) {
        return elementMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public HashCodeAndEqualsPlugin(@MaybeNull String str) {
        this.annotationType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
    public MethodAttributeAppender make(TypeDescription typeDescription) {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: matches(Ljava/lang/Object;)Z */
    @Override // net.bytebuddy.matcher.ElementMatcher
    public boolean matches(@MaybeNull TypeDescription typeDescription) {
        return typeDescription != null && typeDescription.getDeclaredAnnotations().isAnnotationPresent(Enhance.class);
    }

    @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
    public void apply(MethodVisitor methodVisitor, MethodDescription methodDescription, AnnotationValueFilter annotationValueFilter) {
        if (this.annotationType != null) {
            AnnotationVisitor annotationVisitorVisitParameterAnnotation = methodVisitor.visitParameterAnnotation(0, "L" + this.annotationType.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ";", true);
            if (annotationVisitorVisitParameterAnnotation != null) {
                annotationVisitorVisitParameterAnnotation.visitEnd();
            }
        }
    }
}
