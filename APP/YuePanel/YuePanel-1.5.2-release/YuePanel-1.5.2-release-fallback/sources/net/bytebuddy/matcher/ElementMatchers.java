package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class ElementMatchers {
    private ElementMatchers() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This class is a utility class and not supposed to be instantiated"
            r0.<init>(r1)
            throw r0
    }

    public static <T extends net.bytebuddy.description.annotation.AnnotationDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> annotationType(java.lang.Class<? extends java.lang.annotation.Annotation> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = annotationType(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.annotation.AnnotationDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> annotationType(net.bytebuddy.description.type.TypeDescription r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = annotationType(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.annotation.AnnotationDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> annotationType(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1) {
            net.bytebuddy.matcher.AnnotationTypeMatcher r0 = new net.bytebuddy.matcher.AnnotationTypeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> any() {
            r0 = 1
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.BooleanMatcher.of(r0)
            return r0
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> anyOf(java.lang.Iterable<?> r2) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r2.next()
            if (r0 != 0) goto L16
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r1)
            goto L5
        L16:
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = is(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.or(r1)
            goto L5
        L1f:
            if (r0 != 0) goto L25
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = none()
        L25:
            return r0
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> anyOf(java.lang.Object... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = anyOf(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.annotation.AnnotationDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> anyOf(java.lang.annotation.Annotation... r1) {
            net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = anyOf(r0)
            return r1
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> anyOf(java.lang.reflect.Constructor<?>... r2) {
            net.bytebuddy.description.method.MethodList$ForLoadedMethods r0 = new net.bytebuddy.description.method.MethodList$ForLoadedMethods
            r1 = 0
            java.lang.reflect.Method[] r1 = new java.lang.reflect.Method[r1]
            r0.<init>(r2, r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = anyOf(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = definedMethod(r2)
            return r2
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> anyOf(java.lang.reflect.Field... r1) {
            net.bytebuddy.description.field.FieldList$ForLoadedFields r0 = new net.bytebuddy.description.field.FieldList$ForLoadedFields
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = anyOf(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = definedField(r1)
            return r1
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> anyOf(java.lang.reflect.Method... r2) {
            net.bytebuddy.description.method.MethodList$ForLoadedMethods r0 = new net.bytebuddy.description.method.MethodList$ForLoadedMethods
            r1 = 0
            java.lang.reflect.Constructor[] r1 = new java.lang.reflect.Constructor[r1]
            r0.<init>(r1, r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = anyOf(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = definedMethod(r2)
            return r2
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> anyOf(java.lang.reflect.Type... r1) {
            net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = anyOf(r0)
            return r1
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> cached(net.bytebuddy.matcher.ElementMatcher<? super T> r2, int r3) {
            r0 = 1
            if (r3 < r0) goto Le
            net.bytebuddy.matcher.CachingMatcher$WithInlineEviction r0 = new net.bytebuddy.matcher.CachingMatcher$WithInlineEviction
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.<init>(r2, r1, r3)
            return r0
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Eviction size must be a positive number: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> cached(net.bytebuddy.matcher.ElementMatcher<? super T> r1, java.util.concurrent.ConcurrentMap<? super T, java.lang.Boolean> r2) {
            net.bytebuddy.matcher.CachingMatcher r0 = new net.bytebuddy.matcher.CachingMatcher
            r0.<init>(r1, r2)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> canThrow(java.lang.Class<? extends java.lang.Throwable> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = canThrow(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> canThrow(net.bytebuddy.description.type.TypeDescription r1) {
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            boolean r0 = r1.isAssignableTo(r0)
            if (r0 != 0) goto L23
            java.lang.Class<java.lang.Error> r0 = java.lang.Error.class
            boolean r0 = r1.isAssignableTo(r0)
            if (r0 == 0) goto L11
            goto L23
        L11:
            net.bytebuddy.matcher.CollectionItemMatcher r0 = new net.bytebuddy.matcher.CollectionItemMatcher
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = isSuperTypeOf(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = erasure(r1)
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = declaresGenericException(r0)
            goto L28
        L23:
            r1 = 1
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.BooleanMatcher.of(r1)
        L28:
            return r1
    }

    public static <T extends net.bytebuddy.description.annotation.AnnotationSource> net.bytebuddy.matcher.ElementMatcher.Junction<T> declaresAnnotation(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.annotation.AnnotationDescription> r2) {
            net.bytebuddy.matcher.DeclaringAnnotationMatcher r0 = new net.bytebuddy.matcher.DeclaringAnnotationMatcher
            net.bytebuddy.matcher.CollectionItemMatcher r1 = new net.bytebuddy.matcher.CollectionItemMatcher
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> declaresException(java.lang.Class<? extends java.lang.Throwable> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = declaresException(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> declaresException(net.bytebuddy.description.type.TypeDescription r1) {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            boolean r0 = r1.isAssignableTo(r0)
            if (r0 == 0) goto L16
            net.bytebuddy.matcher.CollectionItemMatcher r0 = new net.bytebuddy.matcher.CollectionItemMatcher
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = erasure(r1)
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = declaresGenericException(r0)
            goto L1b
        L16:
            r1 = 0
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.BooleanMatcher.of(r1)
        L1b:
            return r1
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> declaresField(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2) {
            net.bytebuddy.matcher.DeclaringFieldMatcher r0 = new net.bytebuddy.matcher.DeclaringFieldMatcher
            net.bytebuddy.matcher.CollectionItemMatcher r1 = new net.bytebuddy.matcher.CollectionItemMatcher
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> declaresGenericException(java.lang.reflect.Type r0) {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = declaresGenericException(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> declaresGenericException(net.bytebuddy.description.type.TypeDescription.Generic r2) {
            net.bytebuddy.description.type.TypeDefinition$Sort r0 = r2.getSort()
            boolean r0 = r0.isWildcard()
            if (r0 != 0) goto L24
            net.bytebuddy.description.type.TypeDescription r0 = r2.asErasure()
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            boolean r0 = r0.isAssignableTo(r1)
            if (r0 == 0) goto L24
            net.bytebuddy.matcher.CollectionItemMatcher r0 = new net.bytebuddy.matcher.CollectionItemMatcher
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = is(r2)
            r0.<init>(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = declaresGenericException(r0)
            goto L29
        L24:
            r2 = 0
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.BooleanMatcher.of(r2)
        L29:
            return r2
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> declaresGenericException(net.bytebuddy.matcher.ElementMatcher<? super java.lang.Iterable<? extends net.bytebuddy.description.type.TypeDescription.Generic>> r1) {
            net.bytebuddy.matcher.MethodExceptionTypeMatcher r0 = new net.bytebuddy.matcher.MethodExceptionTypeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> declaresMethod(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
            net.bytebuddy.matcher.DeclaringMethodMatcher r0 = new net.bytebuddy.matcher.DeclaringMethodMatcher
            net.bytebuddy.matcher.CollectionItemMatcher r1 = new net.bytebuddy.matcher.CollectionItemMatcher
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> definedField(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r1) {
            net.bytebuddy.matcher.DefinedShapeMatcher r0 = new net.bytebuddy.matcher.DefinedShapeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> definedMethod(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription.InDefinedShape> r1) {
            net.bytebuddy.matcher.DefinedShapeMatcher r0 = new net.bytebuddy.matcher.DefinedShapeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.ParameterDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> definedParameter(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.ParameterDescription.InDefinedShape> r1) {
            net.bytebuddy.matcher.DefinedShapeMatcher r0 = new net.bytebuddy.matcher.DefinedShapeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription.Generic> net.bytebuddy.matcher.ElementMatcher.Junction<T> erasure(java.lang.Class<?> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription.Generic> net.bytebuddy.matcher.ElementMatcher.Junction<T> erasure(net.bytebuddy.description.type.TypeDescription r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription.Generic> net.bytebuddy.matcher.ElementMatcher.Junction<T> erasure(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1) {
            net.bytebuddy.matcher.ErasureMatcher r0 = new net.bytebuddy.matcher.ErasureMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends java.lang.Iterable<? extends net.bytebuddy.description.type.TypeDescription.Generic>> net.bytebuddy.matcher.ElementMatcher.Junction<T> erasures(java.lang.Iterable<? extends net.bytebuddy.description.type.TypeDescription> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = is(r1)
            r0.add(r1)
            goto L9
        L1d:
            net.bytebuddy.matcher.CollectionOneToOneMatcher r2 = new net.bytebuddy.matcher.CollectionOneToOneMatcher
            r2.<init>(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = erasures(r2)
            return r2
    }

    public static <T extends java.lang.Iterable<? extends net.bytebuddy.description.type.TypeDescription.Generic>> net.bytebuddy.matcher.ElementMatcher.Junction<T> erasures(net.bytebuddy.matcher.ElementMatcher<? super java.lang.Iterable<? extends net.bytebuddy.description.type.TypeDescription>> r1) {
            net.bytebuddy.matcher.CollectionErasureMatcher r0 = new net.bytebuddy.matcher.CollectionErasureMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends java.lang.Iterable<? extends net.bytebuddy.description.type.TypeDescription.Generic>> net.bytebuddy.matcher.ElementMatcher.Junction<T> erasures(java.lang.Class<?>... r1) {
            net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = erasures(r0)
            return r1
    }

    public static <T extends java.lang.Iterable<? extends net.bytebuddy.description.type.TypeDescription.Generic>> net.bytebuddy.matcher.ElementMatcher.Junction<T> erasures(net.bytebuddy.description.type.TypeDescription... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasures(r0)
            return r0
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> failSafe(net.bytebuddy.matcher.ElementMatcher<? super T> r2) {
            net.bytebuddy.matcher.FailSafeMatcher r0 = new net.bytebuddy.matcher.FailSafeMatcher
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> fieldType(java.lang.Class<?> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = fieldType(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> fieldType(net.bytebuddy.description.type.TypeDescription r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = fieldType(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> fieldType(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = genericFieldType(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> genericFieldType(java.lang.reflect.Type r0) {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = genericFieldType(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> genericFieldType(net.bytebuddy.description.type.TypeDescription.Generic r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = genericFieldType(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> genericFieldType(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1) {
            net.bytebuddy.matcher.FieldTypeMatcher r0 = new net.bytebuddy.matcher.FieldTypeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasAnnotation(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.annotation.AnnotationDescription> r2) {
            net.bytebuddy.matcher.InheritedAnnotationMatcher r0 = new net.bytebuddy.matcher.InheritedAnnotationMatcher
            net.bytebuddy.matcher.CollectionItemMatcher r1 = new net.bytebuddy.matcher.CollectionItemMatcher
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends java.lang.ClassLoader> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasChild(net.bytebuddy.matcher.ElementMatcher<? super java.lang.ClassLoader> r1) {
            net.bytebuddy.matcher.ClassLoaderHierarchyMatcher r0 = new net.bytebuddy.matcher.ClassLoaderHierarchyMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasClassFileVersionAtLeast(net.bytebuddy.ClassFileVersion r2) {
            net.bytebuddy.matcher.ClassFileVersionMatcher r0 = new net.bytebuddy.matcher.ClassFileVersionMatcher
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasClassFileVersionAtMost(net.bytebuddy.ClassFileVersion r2) {
            net.bytebuddy.matcher.ClassFileVersionMatcher r0 = new net.bytebuddy.matcher.ClassFileVersionMatcher
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement.WithDescriptor> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasDescriptor(java.lang.String r3) {
            net.bytebuddy.matcher.DescriptorMatcher r0 = new net.bytebuddy.matcher.DescriptorMatcher
            net.bytebuddy.matcher.StringMatcher r1 = new net.bytebuddy.matcher.StringMatcher
            net.bytebuddy.matcher.StringMatcher$Mode r2 = net.bytebuddy.matcher.StringMatcher.Mode.EQUALS_FULLY
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasGenericSuperClass(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1) {
            net.bytebuddy.matcher.HasSuperClassMatcher r0 = new net.bytebuddy.matcher.HasSuperClassMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasGenericSuperType(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1) {
            net.bytebuddy.matcher.HasSuperTypeMatcher r0 = new net.bytebuddy.matcher.HasSuperTypeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.ParameterDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasGenericType(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1) {
            net.bytebuddy.matcher.MethodParameterTypeMatcher r0 = new net.bytebuddy.matcher.MethodParameterTypeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasMethodName(java.lang.String r1) {
            java.lang.String r0 = "<init>"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = isConstructor()
            return r1
        Ld:
            java.lang.String r0 = "<clinit>"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = isTypeInitializer()
            return r1
        L1a:
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = named(r1)
            return r1
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasParameters(net.bytebuddy.matcher.ElementMatcher<? super java.lang.Iterable<? extends net.bytebuddy.description.method.ParameterDescription>> r1) {
            net.bytebuddy.matcher.MethodParametersMatcher r0 = new net.bytebuddy.matcher.MethodParametersMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasSignature(net.bytebuddy.description.method.MethodDescription.SignatureToken r1) {
            net.bytebuddy.matcher.SignatureTokenMatcher r0 = new net.bytebuddy.matcher.SignatureTokenMatcher
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = is(r1)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasSuperClass(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = hasGenericSuperClass(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasSuperType(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = hasGenericSuperType(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.ParameterDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> hasType(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = hasGenericType(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> inheritsAnnotation(java.lang.Class<?> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = inheritsAnnotation(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> inheritsAnnotation(net.bytebuddy.description.type.TypeDescription r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = inheritsAnnotation(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> inheritsAnnotation(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = annotationType(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = hasAnnotation(r0)
            return r0
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> is(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r1) {
            if (r1 != 0) goto L7
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.NullMatcher.make()
            goto Ld
        L7:
            net.bytebuddy.matcher.EqualityMatcher r0 = new net.bytebuddy.matcher.EqualityMatcher
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    public static <T extends net.bytebuddy.description.annotation.AnnotationDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> is(java.lang.annotation.Annotation r0) {
            net.bytebuddy.description.annotation.AnnotationDescription$Loadable r0 = net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> is(java.lang.reflect.Constructor<?> r1) {
            net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = is(r0)
            return r1
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> is(java.lang.reflect.Field r1) {
            net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = is(r0)
            return r1
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> is(java.lang.reflect.Method r1) {
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = is(r0)
            return r1
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> is(java.lang.reflect.Type r0) {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> is(net.bytebuddy.description.field.FieldDescription.InDefinedShape r1) {
            net.bytebuddy.matcher.EqualityMatcher r0 = new net.bytebuddy.matcher.EqualityMatcher
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = definedField(r0)
            return r1
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> is(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
            net.bytebuddy.matcher.EqualityMatcher r0 = new net.bytebuddy.matcher.EqualityMatcher
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = definedMethod(r0)
            return r1
    }

    public static <T extends net.bytebuddy.description.method.ParameterDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> is(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r1) {
            net.bytebuddy.matcher.EqualityMatcher r0 = new net.bytebuddy.matcher.EqualityMatcher
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = definedParameter(r0)
            return r1
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.OfAbstraction> net.bytebuddy.matcher.ElementMatcher.Junction<T> isAbstract() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.ABSTRACT
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isAccessibleTo(java.lang.Class<?> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isAccessibleTo(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isAccessibleTo(net.bytebuddy.description.type.TypeDescription r1) {
            net.bytebuddy.matcher.AccessibilityMatcher r0 = new net.bytebuddy.matcher.AccessibilityMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.annotation.AnnotationSource> net.bytebuddy.matcher.ElementMatcher.Junction<T> isAnnotatedWith(java.lang.Class<? extends java.lang.annotation.Annotation> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isAnnotatedWith(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.annotation.AnnotationSource> net.bytebuddy.matcher.ElementMatcher.Junction<T> isAnnotatedWith(net.bytebuddy.description.type.TypeDescription r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isAnnotatedWith(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.annotation.AnnotationSource> net.bytebuddy.matcher.ElementMatcher.Junction<T> isAnnotatedWith(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = annotationType(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = declaresAnnotation(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isAnnotation() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.ANNOTATION
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> isArray() {
            net.bytebuddy.matcher.ArrayTypeMatcher r0 = new net.bytebuddy.matcher.ArrayTypeMatcher
            r0.<init>()
            return r0
    }

    public static <T extends java.lang.ClassLoader> net.bytebuddy.matcher.ElementMatcher.Junction<T> isBootstrapClassLoader() {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.NullMatcher.make()
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.ForMethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isBridge() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.BRIDGE
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends java.lang.ClassLoader> net.bytebuddy.matcher.ElementMatcher.Junction<T> isChildOf(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1) {
            java.lang.ClassLoader r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
            if (r1 != r0) goto La
            r1 = 1
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.BooleanMatcher.of(r1)
            goto L12
        La:
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = is(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = hasChild(r1)
        L12:
            return r1
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isClone() {
            java.lang.String r0 = "clone"
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = named(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = takesNoArguments()
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isConstructor() {
            net.bytebuddy.matcher.MethodSortMatcher$Sort r0 = net.bytebuddy.matcher.MethodSortMatcher.Sort.CONSTRUCTOR
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.MethodSortMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isDeclaredBy(java.lang.Class<?> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isDeclaredBy(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isDeclaredBy(net.bytebuddy.description.type.TypeDescription r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isDeclaredBy(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isDeclaredBy(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isDeclaredByGeneric(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isDeclaredByGeneric(java.lang.reflect.Type r0) {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isDeclaredByGeneric(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isDeclaredByGeneric(net.bytebuddy.description.type.TypeDescription.Generic r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isDeclaredByGeneric(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isDeclaredByGeneric(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1) {
            net.bytebuddy.matcher.DeclaringTypeMatcher r0 = new net.bytebuddy.matcher.DeclaringTypeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isDefaultConstructor() {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isConstructor()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = takesNoArguments()
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isDefaultFinalizer() {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isFinalizer()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = isDeclaredBy(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isDefaultMethod() {
            net.bytebuddy.matcher.MethodSortMatcher$Sort r0 = net.bytebuddy.matcher.MethodSortMatcher.Sort.DEFAULT_METHOD
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.MethodSortMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.OfEnumeration> net.bytebuddy.matcher.ElementMatcher.Junction<T> isEnum() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.ENUMERATION
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isEquals() {
            java.lang.String r0 = "equals"
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = named(r0)
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            r2 = 1
            net.bytebuddy.description.type.TypeDescription[] r2 = new net.bytebuddy.description.type.TypeDescription[r2]
            r3 = 0
            r2[r3] = r1
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = takesArguments(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = returns(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            return r0
    }

    public static <T extends java.lang.ClassLoader> net.bytebuddy.matcher.ElementMatcher.Junction<T> isExtensionClassLoader() {
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            java.lang.ClassLoader r0 = r0.getParent()
            if (r0 != 0) goto Lf
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = none()
            goto L15
        Lf:
            net.bytebuddy.matcher.EqualityMatcher r1 = new net.bytebuddy.matcher.EqualityMatcher
            r1.<init>(r0)
            r0 = r1
        L15:
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable> net.bytebuddy.matcher.ElementMatcher.Junction<T> isFinal() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.FINAL
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isFinalizer() {
            java.lang.String r0 = "finalize"
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = named(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = takesNoArguments()
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            java.lang.Class r1 = java.lang.Void.TYPE
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = returns(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isGenericGetter(java.lang.reflect.Type r0) {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isGenericGetter(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isGenericGetter(net.bytebuddy.description.type.TypeDescription.Generic r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isGenericGetter(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isGenericGetter(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isGetter()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = returnsGeneric(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = r0.and(r1)
            return r1
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isGenericSetter(java.lang.reflect.Type r0) {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isGenericSetter(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isGenericSetter(net.bytebuddy.description.type.TypeDescription.Generic r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isGenericSetter(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isGenericSetter(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r2) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isSetter()
            net.bytebuddy.matcher.CollectionOneToOneMatcher r1 = new net.bytebuddy.matcher.CollectionOneToOneMatcher
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.<init>(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = takesGenericArguments(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = r0.and(r2)
            return r2
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isGetter() {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = takesNoArguments()
            java.lang.Class r1 = java.lang.Void.TYPE
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = returns(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = not(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            java.lang.String r1 = "get"
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = nameStartsWith(r1)
            java.lang.String r2 = "is"
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = nameStartsWith(r2)
            r3 = 2
            java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r5 = 0
            r3[r5] = r4
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r5 = 1
            r3[r5] = r4
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = anyOf(r3)
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = returnsGeneric(r3)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = r2.and(r3)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.or(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isGetter(java.lang.Class<?> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isGetter(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isGetter(java.lang.String r6) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isGetter()
            int r1 = r6.length()
            java.lang.String r2 = "is"
            java.lang.String r3 = "get"
            if (r1 != 0) goto L1b
            net.bytebuddy.matcher.ElementMatcher$Junction r6 = named(r3)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = named(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r6 = r6.or(r1)
            goto L65
        L1b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r3 = 0
            char r4 = r6.charAt(r3)
            char r4 = java.lang.Character.toUpperCase(r4)
            r1.append(r4)
            r4 = 1
            java.lang.String r5 = r6.substring(r4)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = named(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            char r2 = r6.charAt(r3)
            char r2 = java.lang.Character.toUpperCase(r2)
            r5.append(r2)
            java.lang.String r6 = r6.substring(r4)
            r5.append(r6)
            java.lang.String r6 = r5.toString()
            net.bytebuddy.matcher.ElementMatcher$Junction r6 = named(r6)
            net.bytebuddy.matcher.ElementMatcher$Junction r6 = r1.or(r6)
        L65:
            net.bytebuddy.matcher.ElementMatcher$Junction r6 = r0.and(r6)
            return r6
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isGetter(net.bytebuddy.description.type.TypeDescription r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isGetter(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isGetter(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isGenericGetter(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isHashCode() {
            java.lang.String r0 = "hashCode"
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = named(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = takesNoArguments()
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            java.lang.Class r1 = java.lang.Integer.TYPE
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = returns(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isInterface() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.INTERFACE
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isMain() {
            java.lang.String r0 = "main"
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = named(r0)
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = takesArguments(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            java.lang.Class r1 = java.lang.Void.TYPE
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = returns(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = isStatic()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = isPublic()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.ParameterDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isMandated() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.MANDATED
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isMethod() {
            net.bytebuddy.matcher.MethodSortMatcher$Sort r0 = net.bytebuddy.matcher.MethodSortMatcher.Sort.METHOD
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.MethodSortMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement.WithOptionalName> net.bytebuddy.matcher.ElementMatcher.Junction<T> isNamed() {
            net.bytebuddy.matcher.IsNamedMatcher r0 = new net.bytebuddy.matcher.IsNamedMatcher
            r0.<init>()
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.ForMethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isNative() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.NATIVE
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isOverriddenFrom(java.lang.Class<?> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isOverriddenFrom(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isOverriddenFrom(net.bytebuddy.description.type.TypeDescription r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isOverriddenFrom(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isOverriddenFrom(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isOverriddenFromGeneric(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isOverriddenFromGeneric(java.lang.reflect.Type r0) {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isOverriddenFromGeneric(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isOverriddenFromGeneric(net.bytebuddy.description.type.TypeDescription.Generic r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isOverriddenFromGeneric(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isOverriddenFromGeneric(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1) {
            net.bytebuddy.matcher.MethodOverrideMatcher r0 = new net.bytebuddy.matcher.MethodOverrideMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.OfByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isPackagePrivate() {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isPublic()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = isProtected()
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.or(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = isPrivate()
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.or(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = not(r0)
            return r0
    }

    public static <T extends java.lang.ClassLoader> net.bytebuddy.matcher.ElementMatcher.Junction<T> isParentOf(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1) {
            java.lang.ClassLoader r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
            if (r1 != r0) goto L9
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = isBootstrapClassLoader()
            goto Lf
        L9:
            net.bytebuddy.matcher.ClassLoaderParentMatcher r0 = new net.bytebuddy.matcher.ClassLoaderParentMatcher
            r0.<init>(r1)
            r1 = r0
        Lf:
            return r1
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> isPrimitive() {
            net.bytebuddy.matcher.PrimitiveTypeMatcher r0 = new net.bytebuddy.matcher.PrimitiveTypeMatcher
            r0.<init>()
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.OfByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isPrivate() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.PRIVATE
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.OfByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isProtected() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.PROTECTED
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.OfByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isPublic() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.PUBLIC
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> isRecord() {
            net.bytebuddy.matcher.RecordMatcher r0 = new net.bytebuddy.matcher.RecordMatcher
            r0.<init>()
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSetter() {
            java.lang.String r0 = "set"
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = nameStartsWith(r0)
            r1 = 1
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = takesArguments(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            java.lang.Class r1 = java.lang.Void.TYPE
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = returns(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSetter(java.lang.Class<?> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isSetter(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSetter(java.lang.String r3) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isSetter()
            int r1 = r3.length()
            java.lang.String r2 = "set"
            if (r1 != 0) goto L11
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = named(r2)
            goto L35
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r2 = 0
            char r2 = r3.charAt(r2)
            char r2 = java.lang.Character.toUpperCase(r2)
            r1.append(r2)
            r2 = 1
            java.lang.String r3 = r3.substring(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = named(r3)
        L35:
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = r0.and(r3)
            return r3
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSetter(net.bytebuddy.description.type.TypeDescription r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isSetter(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSetter(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isGenericSetter(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.OfByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isStatic() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.STATIC
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.ForMethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isStrict() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.STRICT
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSubTypeOf(java.lang.Class<?> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isSubTypeOf(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSubTypeOf(net.bytebuddy.description.type.TypeDescription r1) {
            net.bytebuddy.matcher.SubTypeMatcher r0 = new net.bytebuddy.matcher.SubTypeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSuperTypeOf(java.lang.Class<?> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isSuperTypeOf(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSuperTypeOf(net.bytebuddy.description.type.TypeDescription r1) {
            net.bytebuddy.matcher.SuperTypeMatcher r0 = new net.bytebuddy.matcher.SuperTypeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.ForMethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSynchronized() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.SYNCHRONIZED
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSynthetic() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.SYNTHETIC
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends java.lang.ClassLoader> net.bytebuddy.matcher.ElementMatcher.Junction<T> isSystemClassLoader() {
            net.bytebuddy.matcher.EqualityMatcher r0 = new net.bytebuddy.matcher.EqualityMatcher
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isToString() {
            java.lang.String r0 = "toString"
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = named(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = takesNoArguments()
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = returns(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isTransient() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.TRANSIENT
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isTypeInitializer() {
            net.bytebuddy.matcher.MethodSortMatcher$Sort r0 = net.bytebuddy.matcher.MethodSortMatcher.Sort.TYPE_INITIALIZER
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.MethodSortMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable.ForMethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isVarArgs() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.VAR_ARGS
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> isVariable(java.lang.String r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = named(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isVariable(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> isVariable(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.NamedElement> r3) {
            net.bytebuddy.matcher.TypeSortMatcher r0 = new net.bytebuddy.matcher.TypeSortMatcher
            net.bytebuddy.description.type.TypeDefinition$Sort r1 = net.bytebuddy.description.type.TypeDefinition.Sort.VARIABLE
            net.bytebuddy.description.type.TypeDefinition$Sort r2 = net.bytebuddy.description.type.TypeDefinition.Sort.VARIABLE_SYMBOLIC
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = anyOf(r1)
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = r0.and(r3)
            return r3
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isVirtual() {
            net.bytebuddy.matcher.MethodSortMatcher$Sort r0 = net.bytebuddy.matcher.MethodSortMatcher.Sort.VIRTUAL
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.MethodSortMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isVisibleTo(java.lang.Class<?> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = isVisibleTo(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.ByteCodeElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> isVisibleTo(net.bytebuddy.description.type.TypeDescription r1) {
            net.bytebuddy.matcher.VisibilityMatcher r0 = new net.bytebuddy.matcher.VisibilityMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> isVolatile() {
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.VOLATILE
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ModifierMatcher.of(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> nameContains(java.lang.String r3) {
            net.bytebuddy.matcher.NameMatcher r0 = new net.bytebuddy.matcher.NameMatcher
            net.bytebuddy.matcher.StringMatcher r1 = new net.bytebuddy.matcher.StringMatcher
            net.bytebuddy.matcher.StringMatcher$Mode r2 = net.bytebuddy.matcher.StringMatcher.Mode.CONTAINS
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> nameContainsIgnoreCase(java.lang.String r3) {
            net.bytebuddy.matcher.NameMatcher r0 = new net.bytebuddy.matcher.NameMatcher
            net.bytebuddy.matcher.StringMatcher r1 = new net.bytebuddy.matcher.StringMatcher
            net.bytebuddy.matcher.StringMatcher$Mode r2 = net.bytebuddy.matcher.StringMatcher.Mode.CONTAINS_IGNORE_CASE
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> nameEndsWith(java.lang.String r3) {
            net.bytebuddy.matcher.NameMatcher r0 = new net.bytebuddy.matcher.NameMatcher
            net.bytebuddy.matcher.StringMatcher r1 = new net.bytebuddy.matcher.StringMatcher
            net.bytebuddy.matcher.StringMatcher$Mode r2 = net.bytebuddy.matcher.StringMatcher.Mode.ENDS_WITH
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> nameEndsWithIgnoreCase(java.lang.String r3) {
            net.bytebuddy.matcher.NameMatcher r0 = new net.bytebuddy.matcher.NameMatcher
            net.bytebuddy.matcher.StringMatcher r1 = new net.bytebuddy.matcher.StringMatcher
            net.bytebuddy.matcher.StringMatcher$Mode r2 = net.bytebuddy.matcher.StringMatcher.Mode.ENDS_WITH_IGNORE_CASE
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> nameMatches(java.lang.String r3) {
            net.bytebuddy.matcher.NameMatcher r0 = new net.bytebuddy.matcher.NameMatcher
            net.bytebuddy.matcher.StringMatcher r1 = new net.bytebuddy.matcher.StringMatcher
            net.bytebuddy.matcher.StringMatcher$Mode r2 = net.bytebuddy.matcher.StringMatcher.Mode.MATCHES
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> nameStartsWith(java.lang.String r3) {
            net.bytebuddy.matcher.NameMatcher r0 = new net.bytebuddy.matcher.NameMatcher
            net.bytebuddy.matcher.StringMatcher r1 = new net.bytebuddy.matcher.StringMatcher
            net.bytebuddy.matcher.StringMatcher$Mode r2 = net.bytebuddy.matcher.StringMatcher.Mode.STARTS_WITH
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> nameStartsWithIgnoreCase(java.lang.String r3) {
            net.bytebuddy.matcher.NameMatcher r0 = new net.bytebuddy.matcher.NameMatcher
            net.bytebuddy.matcher.StringMatcher r1 = new net.bytebuddy.matcher.StringMatcher
            net.bytebuddy.matcher.StringMatcher$Mode r2 = net.bytebuddy.matcher.StringMatcher.Mode.STARTS_WITH_IGNORE_CASE
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> named(java.lang.String r3) {
            net.bytebuddy.matcher.NameMatcher r0 = new net.bytebuddy.matcher.NameMatcher
            net.bytebuddy.matcher.StringMatcher r1 = new net.bytebuddy.matcher.StringMatcher
            net.bytebuddy.matcher.StringMatcher$Mode r2 = net.bytebuddy.matcher.StringMatcher.Mode.EQUALS_FULLY
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> namedIgnoreCase(java.lang.String r3) {
            net.bytebuddy.matcher.NameMatcher r0 = new net.bytebuddy.matcher.NameMatcher
            net.bytebuddy.matcher.StringMatcher r1 = new net.bytebuddy.matcher.StringMatcher
            net.bytebuddy.matcher.StringMatcher$Mode r2 = net.bytebuddy.matcher.StringMatcher.Mode.EQUALS_FULLY_IGNORE_CASE
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.NamedElement> net.bytebuddy.matcher.ElementMatcher.Junction<T> namedOneOf(java.lang.String... r3) {
            net.bytebuddy.matcher.NameMatcher r0 = new net.bytebuddy.matcher.NameMatcher
            net.bytebuddy.matcher.StringSetMatcher r1 = new net.bytebuddy.matcher.StringSetMatcher
            java.util.HashSet r2 = new java.util.HashSet
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> none() {
            r0 = 0
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.BooleanMatcher.of(r0)
            return r0
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> noneOf(java.lang.Iterable<?> r2) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r2.next()
            if (r0 != 0) goto L1a
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = not(r0)
            goto L5
        L1a:
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = is(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = not(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
            goto L5
        L27:
            if (r0 != 0) goto L2d
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = any()
        L2d:
            return r0
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> noneOf(java.lang.Object... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = noneOf(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.annotation.AnnotationDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> noneOf(java.lang.annotation.Annotation... r1) {
            net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = noneOf(r0)
            return r1
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> noneOf(java.lang.reflect.Constructor<?>... r2) {
            net.bytebuddy.description.method.MethodList$ForLoadedMethods r0 = new net.bytebuddy.description.method.MethodList$ForLoadedMethods
            r1 = 0
            java.lang.reflect.Method[] r1 = new java.lang.reflect.Method[r1]
            r0.<init>(r2, r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = noneOf(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = definedMethod(r2)
            return r2
    }

    public static <T extends net.bytebuddy.description.field.FieldDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> noneOf(java.lang.reflect.Field... r1) {
            net.bytebuddy.description.field.FieldList$ForLoadedFields r0 = new net.bytebuddy.description.field.FieldList$ForLoadedFields
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = noneOf(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = definedField(r1)
            return r1
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> noneOf(java.lang.reflect.Method... r2) {
            net.bytebuddy.description.method.MethodList$ForLoadedMethods r0 = new net.bytebuddy.description.method.MethodList$ForLoadedMethods
            r1 = 0
            java.lang.reflect.Constructor[] r1 = new java.lang.reflect.Constructor[r1]
            r0.<init>(r1, r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = noneOf(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = definedMethod(r2)
            return r2
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> noneOf(java.lang.reflect.Type... r1) {
            net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = noneOf(r0)
            return r1
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> not(net.bytebuddy.matcher.ElementMatcher<? super T> r1) {
            net.bytebuddy.matcher.NegatingMatcher r0 = new net.bytebuddy.matcher.NegatingMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> ofSort(net.bytebuddy.description.type.TypeDefinition.Sort r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = ofSort(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.type.TypeDefinition> net.bytebuddy.matcher.ElementMatcher.Junction<T> ofSort(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDefinition.Sort> r1) {
            net.bytebuddy.matcher.TypeSortMatcher r0 = new net.bytebuddy.matcher.TypeSortMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends java.lang.ClassLoader> net.bytebuddy.matcher.ElementMatcher.Junction<T> ofType(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1) {
            net.bytebuddy.matcher.InstanceTypeMatcher r0 = new net.bytebuddy.matcher.InstanceTypeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> returns(java.lang.Class<?> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = returnsGeneric(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> returns(net.bytebuddy.description.type.TypeDescription r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = returns(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> returns(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasure(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = returnsGeneric(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> returnsGeneric(java.lang.reflect.Type r0) {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = returnsGeneric(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> returnsGeneric(net.bytebuddy.description.type.TypeDescription.Generic r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = is(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = returnsGeneric(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> returnsGeneric(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1) {
            net.bytebuddy.matcher.MethodReturnTypeMatcher r0 = new net.bytebuddy.matcher.MethodReturnTypeMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.utility.JavaModule> net.bytebuddy.matcher.ElementMatcher.Junction<T> supportsModules() {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.NullMatcher.make()
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = not(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesArgument(int r0, java.lang.Class<?> r1) {
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = takesArgument(r0, r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesArgument(int r0, net.bytebuddy.description.type.TypeDescription r1) {
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = is(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = takesArgument(r0, r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesArgument(int r0, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1) {
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = erasure(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = takesGenericArgument(r0, r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesArguments(int r2) {
            net.bytebuddy.matcher.MethodParametersMatcher r0 = new net.bytebuddy.matcher.MethodParametersMatcher
            net.bytebuddy.matcher.CollectionSizeMatcher r1 = new net.bytebuddy.matcher.CollectionSizeMatcher
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesArguments(java.lang.Iterable<? extends net.bytebuddy.description.type.TypeDescription> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = erasure(r1)
            r0.add(r1)
            goto L9
        L1d:
            net.bytebuddy.matcher.CollectionOneToOneMatcher r2 = new net.bytebuddy.matcher.CollectionOneToOneMatcher
            r2.<init>(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = takesGenericArguments(r2)
            return r2
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesArguments(net.bytebuddy.matcher.ElementMatcher<? super java.lang.Iterable<? extends net.bytebuddy.description.type.TypeDescription>> r2) {
            net.bytebuddy.matcher.MethodParametersMatcher r0 = new net.bytebuddy.matcher.MethodParametersMatcher
            net.bytebuddy.matcher.MethodParameterTypesMatcher r1 = new net.bytebuddy.matcher.MethodParameterTypesMatcher
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = erasures(r2)
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesArguments(java.lang.Class<?>... r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasures(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = takesGenericArguments(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesArguments(net.bytebuddy.description.type.TypeDescription... r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = erasures(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = takesGenericArguments(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesGenericArgument(int r0, java.lang.reflect.Type r1) {
            net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = takesGenericArgument(r0, r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesGenericArgument(int r0, net.bytebuddy.description.type.TypeDescription.Generic r1) {
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = is(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = takesGenericArgument(r0, r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesGenericArgument(int r1, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r2) {
            net.bytebuddy.matcher.CollectionElementMatcher r0 = new net.bytebuddy.matcher.CollectionElementMatcher
            r0.<init>(r1, r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = takesGenericArguments(r0)
            return r1
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesGenericArguments(java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            net.bytebuddy.description.type.TypeDefinition r1 = (net.bytebuddy.description.type.TypeDefinition) r1
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = is(r1)
            r0.add(r1)
            goto L9
        L1d:
            net.bytebuddy.matcher.CollectionOneToOneMatcher r2 = new net.bytebuddy.matcher.CollectionOneToOneMatcher
            r2.<init>(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = takesGenericArguments(r2)
            return r2
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesGenericArguments(net.bytebuddy.matcher.ElementMatcher<? super java.lang.Iterable<? extends net.bytebuddy.description.type.TypeDescription.Generic>> r2) {
            net.bytebuddy.matcher.MethodParametersMatcher r0 = new net.bytebuddy.matcher.MethodParametersMatcher
            net.bytebuddy.matcher.MethodParameterTypesMatcher r1 = new net.bytebuddy.matcher.MethodParameterTypesMatcher
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesGenericArguments(java.lang.reflect.Type... r1) {
            net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = takesGenericArguments(r0)
            return r1
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesGenericArguments(net.bytebuddy.description.type.TypeDefinition... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = takesGenericArguments(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> takesNoArguments() {
            r0 = 0
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = takesArguments(r0)
            return r0
    }

    public static <T extends net.bytebuddy.description.annotation.AnnotationDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> targetsElement(java.lang.annotation.ElementType r1) {
            net.bytebuddy.matcher.AnnotationTargetMatcher r0 = new net.bytebuddy.matcher.AnnotationTargetMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<java.lang.Iterable<? extends T>> whereAny(net.bytebuddy.matcher.ElementMatcher<? super T> r1) {
            net.bytebuddy.matcher.CollectionItemMatcher r0 = new net.bytebuddy.matcher.CollectionItemMatcher
            r0.<init>(r1)
            return r0
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<java.lang.Iterable<? extends T>> whereNone(net.bytebuddy.matcher.ElementMatcher<? super T> r0) {
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = whereAny(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = not(r0)
            return r0
    }
}
