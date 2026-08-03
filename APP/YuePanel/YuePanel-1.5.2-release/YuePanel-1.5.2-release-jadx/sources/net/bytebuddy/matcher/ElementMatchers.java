package net.bytebuddy.matcher;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.description.ByteCodeElement;
import net.bytebuddy.description.ModifierReviewable;
import net.bytebuddy.description.NamedElement;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationList;
import net.bytebuddy.description.annotation.AnnotationSource;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.field.FieldList;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.TypeList;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.matcher.CachingMatcher;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.matcher.StringMatcher;
import net.bytebuddy.utility.JavaModule;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ElementMatchers {
    private ElementMatchers() {
        throw new UnsupportedOperationException("This class is a utility class and not supposed to be instantiated");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends AnnotationDescription> ElementMatcher.Junction<T> annotationType(Class<? extends Annotation> cls) {
        return annotationType(TypeDescription.ForLoadedType.m5238of(cls));
    }

    public static <T> ElementMatcher.Junction<T> any() {
        return BooleanMatcher.m5388of(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ElementMatcher.Junction<T> anyOf(Object... objArr) {
        return anyOf(Arrays.asList(objArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ElementMatcher.Junction<T> cached(ElementMatcher<? super T> elementMatcher, ConcurrentMap<? super T, Boolean> concurrentMap) {
        return new CachingMatcher(elementMatcher, concurrentMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> canThrow(Class<? extends Throwable> cls) {
        return canThrow(TypeDescription.ForLoadedType.m5238of(cls));
    }

    public static <T extends AnnotationSource> ElementMatcher.Junction<T> declaresAnnotation(ElementMatcher<? super AnnotationDescription> elementMatcher) {
        return new DeclaringAnnotationMatcher(new CollectionItemMatcher(elementMatcher));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> declaresException(Class<? extends Throwable> cls) {
        return declaresException(TypeDescription.ForLoadedType.m5238of(cls));
    }

    public static <T extends TypeDefinition> ElementMatcher.Junction<T> declaresField(ElementMatcher<? super FieldDescription> elementMatcher) {
        return new DeclaringFieldMatcher(new CollectionItemMatcher(elementMatcher));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> declaresGenericException(Type type) {
        return declaresGenericException(TypeDefinition.Sort.describe(type));
    }

    public static <T extends TypeDefinition> ElementMatcher.Junction<T> declaresMethod(ElementMatcher<? super MethodDescription> elementMatcher) {
        return new DeclaringMethodMatcher(new CollectionItemMatcher(elementMatcher));
    }

    public static <T extends FieldDescription> ElementMatcher.Junction<T> definedField(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher) {
        return new DefinedShapeMatcher(elementMatcher);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> definedMethod(ElementMatcher<? super MethodDescription.InDefinedShape> elementMatcher) {
        return new DefinedShapeMatcher(elementMatcher);
    }

    public static <T extends ParameterDescription> ElementMatcher.Junction<T> definedParameter(ElementMatcher<? super ParameterDescription.InDefinedShape> elementMatcher) {
        return new DefinedShapeMatcher(elementMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends TypeDescription.Generic> ElementMatcher.Junction<T> erasure(Class<?> cls) {
        return erasure(m5395is((Type) cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends Iterable<? extends TypeDescription.Generic>> ElementMatcher.Junction<T> erasures(Class<?>... clsArr) {
        return erasures(new TypeList.ForLoadedTypes(clsArr));
    }

    public static <T> ElementMatcher.Junction<T> failSafe(ElementMatcher<? super T> elementMatcher) {
        return new FailSafeMatcher(elementMatcher, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends FieldDescription> ElementMatcher.Junction<T> fieldType(Class<?> cls) {
        return fieldType(TypeDescription.ForLoadedType.m5238of(cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends FieldDescription> ElementMatcher.Junction<T> genericFieldType(Type type) {
        return genericFieldType(TypeDefinition.Sort.describe(type));
    }

    public static <T extends TypeDescription> ElementMatcher.Junction<T> hasAnnotation(ElementMatcher<? super AnnotationDescription> elementMatcher) {
        return new InheritedAnnotationMatcher(new CollectionItemMatcher(elementMatcher));
    }

    public static <T extends ClassLoader> ElementMatcher.Junction<T> hasChild(ElementMatcher<? super ClassLoader> elementMatcher) {
        return new ClassLoaderHierarchyMatcher(elementMatcher);
    }

    public static <T extends TypeDescription> ElementMatcher.Junction<T> hasClassFileVersionAtLeast(ClassFileVersion classFileVersion) {
        return new ClassFileVersionMatcher(classFileVersion, false);
    }

    public static <T extends TypeDescription> ElementMatcher.Junction<T> hasClassFileVersionAtMost(ClassFileVersion classFileVersion) {
        return new ClassFileVersionMatcher(classFileVersion, true);
    }

    public static <T extends NamedElement.WithDescriptor> ElementMatcher.Junction<T> hasDescriptor(String str) {
        return new DescriptorMatcher(new StringMatcher(str, StringMatcher.Mode.EQUALS_FULLY));
    }

    public static <T extends TypeDescription> ElementMatcher.Junction<T> hasGenericSuperClass(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        return new HasSuperClassMatcher(elementMatcher);
    }

    public static <T extends TypeDescription> ElementMatcher.Junction<T> hasGenericSuperType(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        return new HasSuperTypeMatcher(elementMatcher);
    }

    public static <T extends ParameterDescription> ElementMatcher.Junction<T> hasGenericType(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        return new MethodParameterTypeMatcher(elementMatcher);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> hasMethodName(String str) {
        return MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(str) ? isConstructor() : MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME.equals(str) ? isTypeInitializer() : named(str);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> hasParameters(ElementMatcher<? super Iterable<? extends ParameterDescription>> elementMatcher) {
        return new MethodParametersMatcher(elementMatcher);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> hasSignature(MethodDescription.SignatureToken signatureToken) {
        return new SignatureTokenMatcher(m5390is(signatureToken));
    }

    public static <T extends TypeDescription> ElementMatcher.Junction<T> hasSuperClass(ElementMatcher<? super TypeDescription> elementMatcher) {
        return hasGenericSuperClass(erasure(elementMatcher));
    }

    public static <T extends TypeDescription> ElementMatcher.Junction<T> hasSuperType(ElementMatcher<? super TypeDescription> elementMatcher) {
        return hasGenericSuperType(erasure(elementMatcher));
    }

    public static <T extends ParameterDescription> ElementMatcher.Junction<T> hasType(ElementMatcher<? super TypeDescription> elementMatcher) {
        return hasGenericType(erasure(elementMatcher));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends TypeDescription> ElementMatcher.Junction<T> inheritsAnnotation(Class<?> cls) {
        return inheritsAnnotation(TypeDescription.ForLoadedType.m5238of(cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: is */
    public static <T> ElementMatcher.Junction<T> m5390is(@MaybeNull Object obj) {
        return obj == null ? NullMatcher.make() : new EqualityMatcher(obj);
    }

    public static <T extends ModifierReviewable.OfAbstraction> ElementMatcher.Junction<T> isAbstract() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.ABSTRACT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends ByteCodeElement> ElementMatcher.Junction<T> isAccessibleTo(Class<?> cls) {
        return isAccessibleTo(TypeDescription.ForLoadedType.m5238of(cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends AnnotationSource> ElementMatcher.Junction<T> isAnnotatedWith(Class<? extends Annotation> cls) {
        return isAnnotatedWith(TypeDescription.ForLoadedType.m5238of(cls));
    }

    public static <T extends TypeDescription> ElementMatcher.Junction<T> isAnnotation() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.ANNOTATION);
    }

    public static <T extends TypeDefinition> ElementMatcher.Junction<T> isArray() {
        return new ArrayTypeMatcher();
    }

    public static <T extends ClassLoader> ElementMatcher.Junction<T> isBootstrapClassLoader() {
        return NullMatcher.make();
    }

    public static <T extends ModifierReviewable.ForMethodDescription> ElementMatcher.Junction<T> isBridge() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.BRIDGE);
    }

    public static <T extends ClassLoader> ElementMatcher.Junction<T> isChildOf(@MaybeNull ClassLoader classLoader) {
        return classLoader == ClassLoadingStrategy.BOOTSTRAP_LOADER ? BooleanMatcher.m5388of(true) : hasChild(m5390is(classLoader));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isClone() {
        return named("clone").and(takesNoArguments());
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isConstructor() {
        return MethodSortMatcher.m5399of(MethodSortMatcher.Sort.CONSTRUCTOR);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends ByteCodeElement> ElementMatcher.Junction<T> isDeclaredBy(Class<?> cls) {
        return isDeclaredBy(TypeDescription.ForLoadedType.m5238of(cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends ByteCodeElement> ElementMatcher.Junction<T> isDeclaredByGeneric(Type type) {
        return isDeclaredByGeneric(TypeDefinition.Sort.describe(type));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isDefaultConstructor() {
        return isConstructor().and(takesNoArguments());
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isDefaultFinalizer() {
        return isFinalizer().and(isDeclaredBy(TypeDescription.ForLoadedType.m5238of(Object.class)));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isDefaultMethod() {
        return MethodSortMatcher.m5399of(MethodSortMatcher.Sort.DEFAULT_METHOD);
    }

    public static <T extends ModifierReviewable.OfEnumeration> ElementMatcher.Junction<T> isEnum() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.ENUMERATION);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isEquals() {
        return named("equals").and(takesArguments(TypeDescription.ForLoadedType.m5238of(Object.class))).and(returns((Class<?>) Boolean.TYPE));
    }

    public static <T extends ClassLoader> ElementMatcher.Junction<T> isExtensionClassLoader() {
        ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();
        return parent == null ? none() : new EqualityMatcher(parent);
    }

    public static <T extends ModifierReviewable> ElementMatcher.Junction<T> isFinal() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.FINAL);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isFinalizer() {
        return named("finalize").and(takesNoArguments()).and(returns(TypeDescription.ForLoadedType.m5238of(Void.TYPE)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isGenericGetter(Type type) {
        return isGenericGetter(TypeDefinition.Sort.describe(type));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isGenericSetter(Type type) {
        return isGenericSetter(TypeDefinition.Sort.describe(type));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isGetter() {
        return takesNoArguments().and(not(returns(TypeDescription.ForLoadedType.m5238of(Void.TYPE)))).and(nameStartsWith("get").mo5389or(nameStartsWith("is").and(returnsGeneric(anyOf(Boolean.TYPE, Boolean.class)))));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isHashCode() {
        return named("hashCode").and(takesNoArguments()).and(returns((Class<?>) Integer.TYPE));
    }

    public static <T extends TypeDescription> ElementMatcher.Junction<T> isInterface() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.INTERFACE);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isMain() {
        return named("main").and(takesArguments((Class<?>[]) new Class[]{String[].class})).and(returns(TypeDescription.ForLoadedType.m5238of(Void.TYPE)).and(isStatic()).and(isPublic()));
    }

    public static <T extends ParameterDescription> ElementMatcher.Junction<T> isMandated() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.MANDATED);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isMethod() {
        return MethodSortMatcher.m5399of(MethodSortMatcher.Sort.METHOD);
    }

    public static <T extends NamedElement.WithOptionalName> ElementMatcher.Junction<T> isNamed() {
        return new IsNamedMatcher();
    }

    public static <T extends ModifierReviewable.ForMethodDescription> ElementMatcher.Junction<T> isNative() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.NATIVE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isOverriddenFrom(Class<?> cls) {
        return isOverriddenFrom(TypeDescription.ForLoadedType.m5238of(cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isOverriddenFromGeneric(Type type) {
        return isOverriddenFromGeneric(TypeDefinition.Sort.describe(type));
    }

    public static <T extends ModifierReviewable.OfByteCodeElement> ElementMatcher.Junction<T> isPackagePrivate() {
        return not(isPublic().mo5389or(isProtected()).mo5389or(isPrivate()));
    }

    public static <T extends ClassLoader> ElementMatcher.Junction<T> isParentOf(@MaybeNull ClassLoader classLoader) {
        return classLoader == ClassLoadingStrategy.BOOTSTRAP_LOADER ? isBootstrapClassLoader() : new ClassLoaderParentMatcher(classLoader);
    }

    public static <T extends TypeDefinition> ElementMatcher.Junction<T> isPrimitive() {
        return new PrimitiveTypeMatcher();
    }

    public static <T extends ModifierReviewable.OfByteCodeElement> ElementMatcher.Junction<T> isPrivate() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.PRIVATE);
    }

    public static <T extends ModifierReviewable.OfByteCodeElement> ElementMatcher.Junction<T> isProtected() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.PROTECTED);
    }

    public static <T extends ModifierReviewable.OfByteCodeElement> ElementMatcher.Junction<T> isPublic() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.PUBLIC);
    }

    public static <T extends TypeDefinition> ElementMatcher.Junction<T> isRecord() {
        return new RecordMatcher();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isSetter() {
        return nameStartsWith("set").and(takesArguments(1)).and(returns(TypeDescription.ForLoadedType.m5238of(Void.TYPE)));
    }

    public static <T extends ModifierReviewable.OfByteCodeElement> ElementMatcher.Junction<T> isStatic() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.STATIC);
    }

    public static <T extends ModifierReviewable.ForMethodDescription> ElementMatcher.Junction<T> isStrict() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.STRICT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends TypeDescription> ElementMatcher.Junction<T> isSubTypeOf(Class<?> cls) {
        return isSubTypeOf(TypeDescription.ForLoadedType.m5238of(cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends TypeDescription> ElementMatcher.Junction<T> isSuperTypeOf(Class<?> cls) {
        return isSuperTypeOf(TypeDescription.ForLoadedType.m5238of(cls));
    }

    public static <T extends ModifierReviewable.ForMethodDescription> ElementMatcher.Junction<T> isSynchronized() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.SYNCHRONIZED);
    }

    public static <T extends ModifierReviewable> ElementMatcher.Junction<T> isSynthetic() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.SYNTHETIC);
    }

    public static <T extends ClassLoader> ElementMatcher.Junction<T> isSystemClassLoader() {
        return new EqualityMatcher(ClassLoader.getSystemClassLoader());
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isToString() {
        return named("toString").and(takesNoArguments()).and(returns(TypeDescription.ForLoadedType.m5238of(String.class)));
    }

    public static <T extends FieldDescription> ElementMatcher.Junction<T> isTransient() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.TRANSIENT);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isTypeInitializer() {
        return MethodSortMatcher.m5399of(MethodSortMatcher.Sort.TYPE_INITIALIZER);
    }

    public static <T extends ModifierReviewable.ForMethodDescription> ElementMatcher.Junction<T> isVarArgs() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.VAR_ARGS);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends TypeDefinition> ElementMatcher.Junction<T> isVariable(String str) {
        return isVariable(named(str));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isVirtual() {
        return MethodSortMatcher.m5399of(MethodSortMatcher.Sort.VIRTUAL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends ByteCodeElement> ElementMatcher.Junction<T> isVisibleTo(Class<?> cls) {
        return isVisibleTo(TypeDescription.ForLoadedType.m5238of(cls));
    }

    public static <T extends FieldDescription> ElementMatcher.Junction<T> isVolatile() {
        return ModifierMatcher.m5400of(ModifierMatcher.Mode.VOLATILE);
    }

    public static <T extends NamedElement> ElementMatcher.Junction<T> nameContains(String str) {
        return new NameMatcher(new StringMatcher(str, StringMatcher.Mode.CONTAINS));
    }

    public static <T extends NamedElement> ElementMatcher.Junction<T> nameContainsIgnoreCase(String str) {
        return new NameMatcher(new StringMatcher(str, StringMatcher.Mode.CONTAINS_IGNORE_CASE));
    }

    public static <T extends NamedElement> ElementMatcher.Junction<T> nameEndsWith(String str) {
        return new NameMatcher(new StringMatcher(str, StringMatcher.Mode.ENDS_WITH));
    }

    public static <T extends NamedElement> ElementMatcher.Junction<T> nameEndsWithIgnoreCase(String str) {
        return new NameMatcher(new StringMatcher(str, StringMatcher.Mode.ENDS_WITH_IGNORE_CASE));
    }

    public static <T extends NamedElement> ElementMatcher.Junction<T> nameMatches(String str) {
        return new NameMatcher(new StringMatcher(str, StringMatcher.Mode.MATCHES));
    }

    public static <T extends NamedElement> ElementMatcher.Junction<T> nameStartsWith(String str) {
        return new NameMatcher(new StringMatcher(str, StringMatcher.Mode.STARTS_WITH));
    }

    public static <T extends NamedElement> ElementMatcher.Junction<T> nameStartsWithIgnoreCase(String str) {
        return new NameMatcher(new StringMatcher(str, StringMatcher.Mode.STARTS_WITH_IGNORE_CASE));
    }

    public static <T extends NamedElement> ElementMatcher.Junction<T> named(String str) {
        return new NameMatcher(new StringMatcher(str, StringMatcher.Mode.EQUALS_FULLY));
    }

    public static <T extends NamedElement> ElementMatcher.Junction<T> namedIgnoreCase(String str) {
        return new NameMatcher(new StringMatcher(str, StringMatcher.Mode.EQUALS_FULLY_IGNORE_CASE));
    }

    public static <T extends NamedElement> ElementMatcher.Junction<T> namedOneOf(String... strArr) {
        return new NameMatcher(new StringSetMatcher(new HashSet(Arrays.asList(strArr))));
    }

    public static <T> ElementMatcher.Junction<T> none() {
        return BooleanMatcher.m5388of(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ElementMatcher.Junction<T> noneOf(Object... objArr) {
        return noneOf(Arrays.asList(objArr));
    }

    public static <T> ElementMatcher.Junction<T> not(ElementMatcher<? super T> elementMatcher) {
        return new NegatingMatcher(elementMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends TypeDefinition> ElementMatcher.Junction<T> ofSort(TypeDefinition.Sort sort) {
        return ofSort(m5390is(sort));
    }

    public static <T extends ClassLoader> ElementMatcher.Junction<T> ofType(ElementMatcher<? super TypeDescription> elementMatcher) {
        return new InstanceTypeMatcher(elementMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> returns(Class<?> cls) {
        return returnsGeneric(erasure(cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> returnsGeneric(Type type) {
        return returnsGeneric(TypeDefinition.Sort.describe(type));
    }

    public static <T extends JavaModule> ElementMatcher.Junction<T> supportsModules() {
        return not(NullMatcher.make());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesArgument(int i, Class<?> cls) {
        return takesArgument(i, TypeDescription.ForLoadedType.m5238of(cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesArguments(Class<?>... clsArr) {
        return takesGenericArguments(erasures(clsArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesGenericArgument(int i, Type type) {
        return takesGenericArgument(i, TypeDefinition.Sort.describe(type));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesGenericArguments(Type... typeArr) {
        return takesGenericArguments(new TypeList.Generic.ForLoadedTypes(typeArr));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesNoArguments() {
        return takesArguments(0);
    }

    public static <T extends AnnotationDescription> ElementMatcher.Junction<T> targetsElement(ElementType elementType) {
        return new AnnotationTargetMatcher(elementType);
    }

    public static <T> ElementMatcher.Junction<Iterable<? extends T>> whereAny(ElementMatcher<? super T> elementMatcher) {
        return new CollectionItemMatcher(elementMatcher);
    }

    public static <T> ElementMatcher.Junction<Iterable<? extends T>> whereNone(ElementMatcher<? super T> elementMatcher) {
        return not(whereAny(elementMatcher));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends AnnotationDescription> ElementMatcher.Junction<T> annotationType(TypeDescription typeDescription) {
        return annotationType(m5390is(typeDescription));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T> ElementMatcher.Junction<T> anyOf(Iterable<?> iterable) {
        ElementMatcher.Junction<T> junctionM5390is = null;
        for (Object obj : iterable) {
            junctionM5390is = junctionM5390is == null ? m5390is(obj) : junctionM5390is.mo5389or(m5390is(obj));
        }
        return junctionM5390is == null ? none() : junctionM5390is;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T> ElementMatcher.Junction<T> cached(ElementMatcher<? super T> elementMatcher, int i) {
        if (i >= 1) {
            return new CachingMatcher.WithInlineEviction(elementMatcher, new ConcurrentHashMap(), i);
        }
        throw new IllegalArgumentException("Eviction size must be a positive number: " + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> canThrow(TypeDescription typeDescription) {
        return (typeDescription.isAssignableTo(RuntimeException.class) || typeDescription.isAssignableTo(Error.class)) ? BooleanMatcher.m5388of(true) : declaresGenericException(new CollectionItemMatcher(erasure(isSuperTypeOf(typeDescription))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> declaresException(TypeDescription typeDescription) {
        return typeDescription.isAssignableTo(Throwable.class) ? declaresGenericException(new CollectionItemMatcher(erasure(typeDescription))) : BooleanMatcher.m5388of(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> declaresGenericException(TypeDescription.Generic generic) {
        return (generic.getSort().isWildcard() || !generic.asErasure().isAssignableTo(Throwable.class)) ? BooleanMatcher.m5388of(false) : declaresGenericException(new CollectionItemMatcher(m5390is(generic)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends TypeDescription.Generic> ElementMatcher.Junction<T> erasure(TypeDescription typeDescription) {
        return erasure(m5390is(typeDescription));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends Iterable<? extends TypeDescription.Generic>> ElementMatcher.Junction<T> erasures(TypeDescription... typeDescriptionArr) {
        return erasures(Arrays.asList(typeDescriptionArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends FieldDescription> ElementMatcher.Junction<T> fieldType(TypeDescription typeDescription) {
        return fieldType(m5390is(typeDescription));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends FieldDescription> ElementMatcher.Junction<T> genericFieldType(TypeDescription.Generic generic) {
        return genericFieldType(m5390is(generic));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends TypeDescription> ElementMatcher.Junction<T> inheritsAnnotation(TypeDescription typeDescription) {
        return inheritsAnnotation(m5390is(typeDescription));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: is */
    public static <T extends FieldDescription> ElementMatcher.Junction<T> m5393is(Field field) {
        return m5396is((FieldDescription.InDefinedShape) new FieldDescription.ForLoadedField(field));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends ByteCodeElement> ElementMatcher.Junction<T> isAccessibleTo(TypeDescription typeDescription) {
        return new AccessibilityMatcher(typeDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends AnnotationSource> ElementMatcher.Junction<T> isAnnotatedWith(TypeDescription typeDescription) {
        return isAnnotatedWith(m5390is(typeDescription));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends ByteCodeElement> ElementMatcher.Junction<T> isDeclaredBy(TypeDescription typeDescription) {
        return isDeclaredBy(m5390is(typeDescription));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends ByteCodeElement> ElementMatcher.Junction<T> isDeclaredByGeneric(TypeDescription.Generic generic) {
        return isDeclaredByGeneric(m5390is(generic));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isGenericGetter(TypeDescription.Generic generic) {
        return isGenericGetter(m5390is(generic));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isGenericSetter(TypeDescription.Generic generic) {
        return isGenericSetter(m5390is(generic));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isGetter(String str) {
        ElementMatcher.Junction junctionMo5389or;
        ElementMatcher.Junction junctionIsGetter = isGetter();
        if (str.length() == 0) {
            junctionMo5389or = named("get").mo5389or(named("is"));
        } else {
            junctionMo5389or = named("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1)).mo5389or(named("is" + Character.toUpperCase(str.charAt(0)) + str.substring(1)));
        }
        return junctionIsGetter.and(junctionMo5389or);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isOverriddenFrom(TypeDescription typeDescription) {
        return isOverriddenFrom(m5390is(typeDescription));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isOverriddenFromGeneric(TypeDescription.Generic generic) {
        return isOverriddenFromGeneric(m5390is(generic));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> isSetter(String str) {
        ElementMatcher.Junction junctionNamed;
        ElementMatcher.Junction junctionIsSetter = isSetter();
        if (str.length() == 0) {
            junctionNamed = named("set");
        } else {
            junctionNamed = named("set" + Character.toUpperCase(str.charAt(0)) + str.substring(1));
        }
        return junctionIsSetter.and(junctionNamed);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends TypeDescription> ElementMatcher.Junction<T> isSubTypeOf(TypeDescription typeDescription) {
        return new SubTypeMatcher(typeDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends TypeDescription> ElementMatcher.Junction<T> isSuperTypeOf(TypeDescription typeDescription) {
        return new SuperTypeMatcher(typeDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends TypeDefinition> ElementMatcher.Junction<T> isVariable(ElementMatcher<? super NamedElement> elementMatcher) {
        return (ElementMatcher.Junction<T>) new TypeSortMatcher(anyOf(TypeDefinition.Sort.VARIABLE, TypeDefinition.Sort.VARIABLE_SYMBOLIC)).and(elementMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends ByteCodeElement> ElementMatcher.Junction<T> isVisibleTo(TypeDescription typeDescription) {
        return new VisibilityMatcher(typeDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T> ElementMatcher.Junction<T> noneOf(Iterable<?> iterable) {
        ElementMatcher.Junction<T> junctionNot = null;
        for (Object obj : iterable) {
            junctionNot = junctionNot == null ? not(m5390is(obj)) : junctionNot.and(not(m5390is(obj)));
        }
        return junctionNot == null ? any() : junctionNot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends TypeDefinition> ElementMatcher.Junction<T> ofSort(ElementMatcher<? super TypeDefinition.Sort> elementMatcher) {
        return new TypeSortMatcher(elementMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> returns(TypeDescription typeDescription) {
        return returns(m5390is(typeDescription));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> returnsGeneric(TypeDescription.Generic generic) {
        return returnsGeneric(m5390is(generic));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesArgument(int i, TypeDescription typeDescription) {
        return takesArgument(i, m5390is(typeDescription));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesArguments(TypeDescription... typeDescriptionArr) {
        return takesGenericArguments(erasures(typeDescriptionArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesGenericArgument(int i, TypeDescription.Generic generic) {
        return takesGenericArgument(i, m5390is(generic));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesGenericArguments(TypeDefinition... typeDefinitionArr) {
        return takesGenericArguments((List<? extends TypeDefinition>) Arrays.asList(typeDefinitionArr));
    }

    public static <T extends AnnotationDescription> ElementMatcher.Junction<T> annotationType(ElementMatcher<? super TypeDescription> elementMatcher) {
        return new AnnotationTypeMatcher(elementMatcher);
    }

    public static <T extends TypeDescription.Generic> ElementMatcher.Junction<T> erasure(ElementMatcher<? super TypeDescription> elementMatcher) {
        return new ErasureMatcher(elementMatcher);
    }

    public static <T extends Iterable<? extends TypeDescription.Generic>> ElementMatcher.Junction<T> erasures(Iterable<? extends TypeDescription> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends TypeDescription> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m5390is(it.next()));
        }
        return erasures(new CollectionOneToOneMatcher(arrayList));
    }

    public static <T extends FieldDescription> ElementMatcher.Junction<T> fieldType(ElementMatcher<? super TypeDescription> elementMatcher) {
        return genericFieldType(erasure(elementMatcher));
    }

    public static <T extends FieldDescription> ElementMatcher.Junction<T> genericFieldType(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        return new FieldTypeMatcher(elementMatcher);
    }

    public static <T extends TypeDescription> ElementMatcher.Junction<T> inheritsAnnotation(ElementMatcher<? super TypeDescription> elementMatcher) {
        return hasAnnotation(annotationType(elementMatcher));
    }

    /* JADX INFO: renamed from: is */
    public static <T extends FieldDescription> ElementMatcher.Junction<T> m5396is(FieldDescription.InDefinedShape inDefinedShape) {
        return definedField(new EqualityMatcher(inDefinedShape));
    }

    public static <T extends AnnotationSource> ElementMatcher.Junction<T> isAnnotatedWith(ElementMatcher<? super TypeDescription> elementMatcher) {
        return declaresAnnotation(annotationType(elementMatcher));
    }

    public static <T extends ByteCodeElement> ElementMatcher.Junction<T> isDeclaredBy(ElementMatcher<? super TypeDescription> elementMatcher) {
        return isDeclaredByGeneric(erasure(elementMatcher));
    }

    public static <T extends ByteCodeElement> ElementMatcher.Junction<T> isDeclaredByGeneric(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        return new DeclaringTypeMatcher(elementMatcher);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isGenericGetter(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        return isGetter().and(returnsGeneric(elementMatcher));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isGenericSetter(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        return isSetter().and(takesGenericArguments(new CollectionOneToOneMatcher(Collections.singletonList(elementMatcher))));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isOverriddenFrom(ElementMatcher<? super TypeDescription> elementMatcher) {
        return isOverriddenFromGeneric(erasure(elementMatcher));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isOverriddenFromGeneric(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        return new MethodOverrideMatcher(elementMatcher);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> returns(ElementMatcher<? super TypeDescription> elementMatcher) {
        return returnsGeneric(erasure(elementMatcher));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> returnsGeneric(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        return new MethodReturnTypeMatcher(elementMatcher);
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesArgument(int i, ElementMatcher<? super TypeDescription> elementMatcher) {
        return takesGenericArgument(i, erasure(elementMatcher));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesArguments(Iterable<? extends TypeDescription> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends TypeDescription> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(erasure(it.next()));
        }
        return takesGenericArguments(new CollectionOneToOneMatcher(arrayList));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesGenericArgument(int i, ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        return takesGenericArguments(new CollectionElementMatcher(i, elementMatcher));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesGenericArguments(List<? extends TypeDefinition> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends TypeDefinition> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m5390is(it.next()));
        }
        return takesGenericArguments(new CollectionOneToOneMatcher(arrayList));
    }

    /* JADX INFO: renamed from: is */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> m5394is(Method method) {
        return m5397is((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(method));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> declaresGenericException(ElementMatcher<? super Iterable<? extends TypeDescription.Generic>> elementMatcher) {
        return new MethodExceptionTypeMatcher(elementMatcher);
    }

    /* JADX INFO: renamed from: is */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> m5392is(Constructor<?> constructor) {
        return m5397is((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedConstructor(constructor));
    }

    public static <T extends TypeDefinition> ElementMatcher.Junction<T> anyOf(Type... typeArr) {
        return anyOf(new TypeList.Generic.ForLoadedTypes(typeArr));
    }

    /* JADX INFO: renamed from: is */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> m5397is(MethodDescription.InDefinedShape inDefinedShape) {
        return definedMethod(new EqualityMatcher(inDefinedShape));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isGetter(Class<?> cls) {
        return isGetter(TypeDescription.ForLoadedType.m5238of(cls));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isSetter(Class<?> cls) {
        return isSetter(TypeDescription.ForLoadedType.m5238of(cls));
    }

    public static <T extends TypeDefinition> ElementMatcher.Junction<T> noneOf(Type... typeArr) {
        return noneOf(new TypeList.Generic.ForLoadedTypes(typeArr));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> anyOf(Constructor<?>... constructorArr) {
        return definedMethod(anyOf(new MethodList.ForLoadedMethods(constructorArr, new Method[0])));
    }

    public static <T extends Iterable<? extends TypeDescription.Generic>> ElementMatcher.Junction<T> erasures(ElementMatcher<? super Iterable<? extends TypeDescription>> elementMatcher) {
        return new CollectionErasureMatcher(elementMatcher);
    }

    /* JADX INFO: renamed from: is */
    public static <T extends ParameterDescription> ElementMatcher.Junction<T> m5398is(ParameterDescription.InDefinedShape inDefinedShape) {
        return definedParameter(new EqualityMatcher(inDefinedShape));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isGetter(TypeDescription typeDescription) {
        return isGetter(m5390is(typeDescription));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isSetter(TypeDescription typeDescription) {
        return isSetter(m5390is(typeDescription));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> noneOf(Constructor<?>... constructorArr) {
        return definedMethod(noneOf(new MethodList.ForLoadedMethods(constructorArr, new Method[0])));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesArguments(ElementMatcher<? super Iterable<? extends TypeDescription>> elementMatcher) {
        return new MethodParametersMatcher(new MethodParameterTypesMatcher(erasures(elementMatcher)));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesGenericArguments(ElementMatcher<? super Iterable<? extends TypeDescription.Generic>> elementMatcher) {
        return new MethodParametersMatcher(new MethodParameterTypesMatcher(elementMatcher));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> anyOf(Method... methodArr) {
        return definedMethod(anyOf(new MethodList.ForLoadedMethods((Constructor<?>[]) new Constructor[0], methodArr)));
    }

    /* JADX INFO: renamed from: is */
    public static <T extends TypeDefinition> ElementMatcher.Junction<T> m5395is(Type type) {
        return m5390is(TypeDefinition.Sort.describe(type));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isGetter(ElementMatcher<? super TypeDescription> elementMatcher) {
        return isGenericGetter(erasure(elementMatcher));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> isSetter(ElementMatcher<? super TypeDescription> elementMatcher) {
        return isGenericSetter(erasure(elementMatcher));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> noneOf(Method... methodArr) {
        return definedMethod(noneOf(new MethodList.ForLoadedMethods((Constructor<?>[]) new Constructor[0], methodArr)));
    }

    public static <T extends MethodDescription> ElementMatcher.Junction<T> takesArguments(int i) {
        return new MethodParametersMatcher(new CollectionSizeMatcher(i));
    }

    public static <T extends FieldDescription> ElementMatcher.Junction<T> anyOf(Field... fieldArr) {
        return definedField(anyOf(new FieldList.ForLoadedFields(fieldArr)));
    }

    /* JADX INFO: renamed from: is */
    public static <T extends AnnotationDescription> ElementMatcher.Junction<T> m5391is(Annotation annotation) {
        return m5390is(AnnotationDescription.ForLoadedAnnotation.m5199of(annotation));
    }

    public static <T extends FieldDescription> ElementMatcher.Junction<T> noneOf(Field... fieldArr) {
        return definedField(noneOf(new FieldList.ForLoadedFields(fieldArr)));
    }

    public static <T extends AnnotationDescription> ElementMatcher.Junction<T> anyOf(Annotation... annotationArr) {
        return anyOf(new AnnotationList.ForLoadedAnnotations(annotationArr));
    }

    public static <T extends AnnotationDescription> ElementMatcher.Junction<T> noneOf(Annotation... annotationArr) {
        return noneOf(new AnnotationList.ForLoadedAnnotations(annotationArr));
    }
}
