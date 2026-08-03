package net.bytebuddy.dynamic.scaffold;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.description.ByteCodeElement;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationList;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.field.FieldList;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.modifier.ModifierContributor;
import net.bytebuddy.description.type.PackageDescription;
import net.bytebuddy.description.type.RecordComponentDescription;
import net.bytebuddy.description.type.RecordComponentList;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.TypeList;
import net.bytebuddy.description.type.TypeVariableToken;
import net.bytebuddy.dynamic.TargetType;
import net.bytebuddy.dynamic.Transformer;
import net.bytebuddy.dynamic.scaffold.TypeInitializer;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.utility.JavaType;
import net.bytebuddy.utility.nullability.MaybeNull;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public interface InstrumentedType extends TypeDescription {

    public static class Default extends TypeDescription.AbstractBase.OfSimpleType implements WithFlexibleName {
        private static final Set<String> KEYWORDS = new HashSet(Arrays.asList("abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", Name.LABEL, "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"));
        private final List<? extends AnnotationDescription> annotationDescriptions;
        private final boolean anonymousClass;
        private final Map<String, Object> auxiliaryFields;
        private final List<? extends TypeDescription> declaredTypes;

        @MaybeNull
        private final TypeDescription declaringType;

        @MaybeNull
        private final MethodDescription.InDefinedShape enclosingMethod;

        @MaybeNull
        private final TypeDescription enclosingType;
        private final List<? extends FieldDescription.Token> fieldTokens;
        private final List<? extends TypeDescription.Generic> interfaceTypes;
        private final LoadedTypeInitializer loadedTypeInitializer;
        private final boolean localClass;
        private final List<? extends MethodDescription.Token> methodTokens;
        private final int modifiers;
        private final String name;
        private final TypeDescription nestHost;
        private final List<? extends TypeDescription> nestMembers;

        @MaybeNull
        private final List<? extends TypeDescription> permittedSubclasses;
        private final boolean record;
        private final List<? extends RecordComponentDescription.Token> recordComponentTokens;

        @MaybeNull
        private final TypeDescription.Generic superClass;
        private final TypeInitializer typeInitializer;
        private final List<? extends TypeVariableToken> typeVariables;

        public Default(String str, int i, @MaybeNull TypeDescription.Generic generic, List<? extends TypeVariableToken> list, List<? extends TypeDescription.Generic> list2, List<? extends FieldDescription.Token> list3, Map<String, Object> map, List<? extends MethodDescription.Token> list4, List<? extends RecordComponentDescription.Token> list5, List<? extends AnnotationDescription> list6, TypeInitializer typeInitializer, LoadedTypeInitializer loadedTypeInitializer, @MaybeNull TypeDescription typeDescription, @MaybeNull MethodDescription.InDefinedShape inDefinedShape, @MaybeNull TypeDescription typeDescription2, List<? extends TypeDescription> list7, @MaybeNull List<? extends TypeDescription> list8, boolean z, boolean z2, boolean z3, TypeDescription typeDescription3, List<? extends TypeDescription> list9) {
            this.name = str;
            this.modifiers = i;
            this.typeVariables = list;
            this.superClass = generic;
            this.interfaceTypes = list2;
            this.fieldTokens = list3;
            this.auxiliaryFields = map;
            this.methodTokens = list4;
            this.recordComponentTokens = list5;
            this.annotationDescriptions = list6;
            this.typeInitializer = typeInitializer;
            this.loadedTypeInitializer = loadedTypeInitializer;
            this.declaringType = typeDescription;
            this.enclosingMethod = inDefinedShape;
            this.enclosingType = typeDescription2;
            this.declaredTypes = list7;
            this.permittedSubclasses = list8;
            this.anonymousClass = z;
            this.localClass = z2;
            this.record = z3;
            this.nestHost = typeDescription3;
            this.nestMembers = list9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static boolean isValidIdentifier(String[] strArr) {
            if (strArr.length == 0) {
                return false;
            }
            for (String str : strArr) {
                if (!isValidIdentifier(str)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: of */
        public static InstrumentedType m5277of(String str, TypeDescription.Generic generic, ModifierContributor.ForType... forTypeArr) {
            return m5276of(str, generic, ModifierContributor.Resolver.m5234of(forTypeArr).resolve());
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Explicit(this.annotationDescriptions);
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
            return new FieldList.ForTokens(this, this.fieldTokens);
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
            return new MethodList.ForTokens(this, this.methodTokens);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public TypeList getDeclaredTypes() {
            return new TypeList.Explicit(this.declaredTypes);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @MaybeNull
        public MethodDescription.InDefinedShape getEnclosingMethod() {
            return this.enclosingMethod;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @MaybeNull
        public TypeDescription getEnclosingType() {
            return this.enclosingType;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public TypeList.Generic getInterfaces() {
            return new TypeList.Generic.ForDetachedTypes.WithResolvedErasure(this.interfaceTypes, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.m5252of(this));
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public LoadedTypeInitializer getLoadedTypeInitializer() {
            return this.loadedTypeInitializer;
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.modifiers;
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.name;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public TypeDescription getNestHost() {
            return this.nestHost.represents(TargetType.class) ? this : this.nestHost;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public TypeList getNestMembers() {
            return this.nestHost.represents(TargetType.class) ? new TypeList.Explicit((List<? extends TypeDescription>) CompoundList.m5412of(this, (List<? extends Default>) this.nestMembers)) : this.nestHost.getNestMembers();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @MaybeNull
        public PackageDescription getPackage() {
            int iLastIndexOf = this.name.lastIndexOf(46);
            return iLastIndexOf == -1 ? PackageDescription.DEFAULT : new PackageDescription.Simple(this.name.substring(0, iLastIndexOf));
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public TypeList getPermittedSubtypes() {
            return this.permittedSubclasses == null ? new TypeList.Empty() : new TypeList.Explicit(this.permittedSubclasses);
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public RecordComponentList<RecordComponentDescription.InDefinedShape> getRecordComponents() {
            return new RecordComponentList.ForTokens(this, this.recordComponentTokens);
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @MaybeNull
        public TypeDescription.Generic getSuperClass() {
            TypeDescription.Generic generic = this.superClass;
            return generic == null ? TypeDescription.Generic.UNDEFINED : new TypeDescription.Generic.LazyProjection.WithResolvedErasure(generic, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.m5252of(this));
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public TypeInitializer getTypeInitializer() {
            return this.typeInitializer;
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            return TypeList.Generic.ForDetachedTypes.attachVariables(this, this.typeVariables);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
            return this.anonymousClass;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
            return this.localClass;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @SuppressFBWarnings(justification = "Assuming super class for given instance.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public boolean isRecord() {
            return this.record && this.superClass != null && getSuperClass().asErasure().equals(JavaType.RECORD.getTypeStub());
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isSealed() {
            return this.permittedSubclasses != null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:197:0x05ad, code lost:
        
            throw new java.lang.IllegalStateException("Cannot add " + r4 + " on " + r30);
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0272, code lost:
        
            throw new java.lang.IllegalStateException("Illegal interface bound " + r13 + " of " + r5 + " for " + r30);
         */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TypeDescription validated() {
            String str;
            if (!isValidIdentifier(getName().split("\\."))) {
                throw new IllegalStateException("Illegal type name: " + getName() + " for " + this);
            }
            if ((getModifiers() & (-161312)) != 0) {
                throw new IllegalStateException("Illegal modifiers " + getModifiers() + " for " + this);
            }
            if (isPackageType() && getModifiers() != 5632) {
                throw new IllegalStateException("Illegal modifiers " + getModifiers() + " for package " + this);
            }
            TypeDescription.Generic superClass = getSuperClass();
            if (superClass != null) {
                if (!((Boolean) superClass.accept(TypeDescription.Generic.Visitor.Validator.SUPER_CLASS)).booleanValue()) {
                    throw new IllegalStateException("Illegal super class " + superClass + " for " + this);
                }
                if (!((Boolean) superClass.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                    throw new IllegalStateException("Illegal type annotations on super class " + superClass + " for " + this);
                }
                if (!superClass.asErasure().isVisibleTo(this)) {
                    throw new IllegalStateException("Invisible super type " + superClass + " for " + this);
                }
            }
            HashSet hashSet = new HashSet();
            for (TypeDescription.Generic generic : getInterfaces()) {
                if (!((Boolean) generic.accept(TypeDescription.Generic.Visitor.Validator.INTERFACE)).booleanValue()) {
                    throw new IllegalStateException("Illegal interface " + generic + " for " + this);
                }
                if (!((Boolean) generic.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                    throw new IllegalStateException("Illegal type annotations on interface " + generic + " for " + this);
                }
                if (!hashSet.add(generic.asErasure())) {
                    throw new IllegalStateException("Already implemented interface " + generic + " for " + this);
                }
                if (!generic.asErasure().isVisibleTo(this)) {
                    throw new IllegalStateException("Invisible interface type " + generic + " for " + this);
                }
            }
            TypeList.Generic typeVariables = getTypeVariables();
            if (!typeVariables.isEmpty() && isAssignableTo(Throwable.class)) {
                throw new IllegalStateException("Cannot define throwable " + this + " to be generic");
            }
            HashSet hashSet2 = new HashSet();
            Iterator<TypeDescription.Generic> it = typeVariables.iterator();
            loop1: while (true) {
                String str2 = " does not define at least one bound";
                String str3 = "Type variable ";
                String str4 = "Illegal type variable name '";
                String str5 = "Duplicate type variable symbol '";
                String str6 = "' for ";
                if (it.hasNext()) {
                    TypeDescription.Generic next = it.next();
                    Iterator<TypeDescription.Generic> it2 = it;
                    String symbol = next.getSymbol();
                    if (!hashSet2.add(symbol)) {
                        throw new IllegalStateException("Duplicate type variable symbol '" + next + "' for " + this);
                    }
                    if (!isValidIdentifier(symbol)) {
                        throw new IllegalStateException("Illegal type variable name '" + next + "' for " + this);
                    }
                    if (!TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.ofFormalTypeVariable(next)) {
                        throw new IllegalStateException("Illegal type annotation on '" + next + "' for " + this);
                    }
                    HashSet hashSet3 = new HashSet();
                    Iterator<TypeDescription.Generic> it3 = next.getUpperBounds().iterator();
                    boolean z = false;
                    while (it3.hasNext()) {
                        TypeDescription.Generic next2 = it3.next();
                        if (!((Boolean) next2.accept(TypeDescription.Generic.Visitor.Validator.TYPE_VARIABLE)).booleanValue()) {
                            throw new IllegalStateException("Illegal type variable bound " + next2 + " of " + next + " for " + this);
                        }
                        if (!((Boolean) next2.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                            throw new IllegalStateException("Illegal type annotations on type variable " + next2 + " for " + this);
                        }
                        if (!hashSet3.add(next2)) {
                            throw new IllegalStateException("Duplicate bound " + next2 + " of " + next + " for " + this);
                        }
                        if (z && (next2.getSort().isTypeVariable() || !next2.isInterface())) {
                            break loop1;
                        }
                        z = true;
                    }
                    if (!z) {
                        throw new IllegalStateException("Type variable " + next + " for " + this + " does not define at least one bound");
                    }
                    it = it2;
                } else {
                    TypeDescription enclosingType = getEnclosingType();
                    if (enclosingType != null && (enclosingType.isArray() || enclosingType.isPrimitive())) {
                        throw new IllegalStateException("Cannot define array type or primitive type " + enclosingType + " + as enclosing type for " + this);
                    }
                    MethodDescription.InDefinedShape enclosingMethod = getEnclosingMethod();
                    if (enclosingMethod != null && enclosingMethod.isTypeInitializer()) {
                        throw new IllegalStateException("Cannot enclose type declaration in class initializer " + enclosingMethod);
                    }
                    TypeDescription declaringType = getDeclaringType();
                    if (declaringType != null) {
                        if (declaringType.isPrimitive() || declaringType.isArray()) {
                            throw new IllegalStateException("Cannot define array type or primitive type " + declaringType + " as declaring type for " + this);
                        }
                    } else if (enclosingType == null && enclosingMethod == null && (isLocalType() || isAnonymousType())) {
                        throw new IllegalStateException("Cannot define an anonymous or local class without a declaring type for " + this);
                    }
                    HashSet hashSet4 = new HashSet();
                    Iterator<TypeDescription> it4 = getDeclaredTypes().iterator();
                    while (it4.hasNext()) {
                        Iterator<TypeDescription> it5 = it4;
                        TypeDescription next3 = it4.next();
                        if (next3.isArray() || next3.isPrimitive()) {
                            throw new IllegalStateException("Cannot define array type or primitive type " + next3 + " + as declared type for " + this);
                        }
                        if (!hashSet4.add(next3)) {
                            throw new IllegalStateException("Duplicate definition of declared type " + next3);
                        }
                        it4 = it5;
                    }
                    TypeDescription nestHost = getNestHost();
                    if (nestHost.equals(this)) {
                        HashSet hashSet5 = new HashSet();
                        Iterator<TypeDescription> it6 = getNestMembers().iterator();
                        while (it6.hasNext()) {
                            Iterator<TypeDescription> it7 = it6;
                            TypeDescription next4 = it6.next();
                            if (next4.isArray() || next4.isPrimitive()) {
                                throw new IllegalStateException("Cannot define array type or primitive type " + next4 + " + as nest member of " + this);
                            }
                            if (!next4.isSamePackage(this)) {
                                throw new IllegalStateException("Cannot define nest member " + next4 + " + within different package then " + this);
                            }
                            if (!hashSet5.add(next4)) {
                                throw new IllegalStateException("Duplicate definition of nest member " + next4);
                            }
                            it6 = it7;
                        }
                    } else {
                        if (nestHost.isArray() || nestHost.isPrimitive()) {
                            throw new IllegalStateException("Cannot define array type or primitive type " + nestHost + " + as nest host for " + this);
                        }
                        if (!nestHost.isSamePackage(this)) {
                            throw new IllegalStateException("Cannot define nest host " + nestHost + " + within different package then " + this);
                        }
                    }
                    for (TypeDescription typeDescription : getPermittedSubtypes()) {
                        if (!typeDescription.isAssignableTo(this) || typeDescription.equals(this)) {
                            throw new IllegalStateException("Cannot assign permitted subclass " + typeDescription + " to " + this);
                        }
                    }
                    HashSet hashSet6 = new HashSet();
                    Iterator<AnnotationDescription> it8 = getDeclaredAnnotations().iterator();
                    while (true) {
                        String str7 = str5;
                        String str8 = " on ";
                        String str9 = str4;
                        if (it8.hasNext()) {
                            AnnotationDescription next5 = it8.next();
                            Iterator<AnnotationDescription> it9 = it8;
                            if (!next5.isSupportedOn(ElementType.TYPE) && ((!isAnnotation() || !next5.isSupportedOn(ElementType.ANNOTATION_TYPE)) && (!isPackageType() || !next5.isSupportedOn(ElementType.PACKAGE)))) {
                                break;
                            }
                            if (!hashSet6.add(next5.getAnnotationType())) {
                                throw new IllegalStateException("Duplicate annotation " + next5 + " for " + this);
                            }
                            str5 = str7;
                            str4 = str9;
                            it8 = it9;
                        } else {
                            HashSet hashSet7 = new HashSet();
                            Iterator<FieldDescription.InDefinedShape> it10 = getDeclaredFields().iterator();
                            while (true) {
                                String str10 = str6;
                                String str11 = "Illegal type annotations on ";
                                if (!it10.hasNext()) {
                                    HashSet hashSet8 = new HashSet();
                                    Iterator<MethodDescription.InDefinedShape> it11 = getDeclaredMethods().iterator();
                                    while (it11.hasNext()) {
                                        MethodDescription.InDefinedShape next6 = it11.next();
                                        Iterator<MethodDescription.InDefinedShape> it12 = it11;
                                        if (!hashSet8.add(next6.asSignatureToken())) {
                                            throw new IllegalStateException("Duplicate method signature for " + next6);
                                        }
                                        if ((next6.getModifiers() & (-7680)) != 0) {
                                            throw new IllegalStateException("Illegal modifiers " + next6.getModifiers() + " for " + next6);
                                        }
                                        if (isInterface() && !next6.isPublic() && !next6.isPrivate()) {
                                            throw new IllegalStateException("Methods declared by an interface must be public or private " + next6);
                                        }
                                        HashSet hashSet9 = new HashSet();
                                        for (TypeDescription.Generic generic2 : next6.getTypeVariables()) {
                                            HashSet hashSet10 = hashSet8;
                                            String str12 = str11;
                                            String symbol2 = generic2.getSymbol();
                                            if (!hashSet9.add(symbol2)) {
                                                throw new IllegalStateException(str7 + generic2 + str10 + next6);
                                            }
                                            if (!isValidIdentifier(symbol2)) {
                                                throw new IllegalStateException(str9 + generic2 + str10 + next6);
                                            }
                                            if (!TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.ofFormalTypeVariable(generic2)) {
                                                throw new IllegalStateException("Illegal type annotation on '" + generic2 + str10 + next6);
                                            }
                                            HashSet hashSet11 = new HashSet();
                                            boolean z2 = false;
                                            for (TypeDescription.Generic generic3 : generic2.getUpperBounds()) {
                                                HashSet hashSet12 = hashSet9;
                                                String str13 = str8;
                                                if (!((Boolean) generic3.accept(TypeDescription.Generic.Visitor.Validator.TYPE_VARIABLE)).booleanValue()) {
                                                    throw new IllegalStateException("Illegal type variable bound " + generic3 + " of " + generic2 + " for " + next6);
                                                }
                                                if (!((Boolean) generic3.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                    throw new IllegalStateException("Illegal type annotations on bound " + generic3 + " of " + generic2 + " for " + this);
                                                }
                                                if (!hashSet11.add(generic3)) {
                                                    throw new IllegalStateException("Duplicate bound " + generic3 + " of " + generic2 + " for " + next6);
                                                }
                                                if (z2 && (generic3.getSort().isTypeVariable() || !generic3.isInterface())) {
                                                    throw new IllegalStateException("Illegal interface bound " + generic3 + " of " + generic2 + " for " + next6);
                                                }
                                                str8 = str13;
                                                hashSet9 = hashSet12;
                                                z2 = true;
                                            }
                                            HashSet hashSet13 = hashSet9;
                                            String str14 = str8;
                                            if (!z2) {
                                                throw new IllegalStateException(str3 + generic2 + " for " + next6 + str2);
                                            }
                                            str11 = str12;
                                            hashSet8 = hashSet10;
                                            str8 = str14;
                                            hashSet9 = hashSet13;
                                        }
                                        HashSet hashSet14 = hashSet8;
                                        String str15 = str11;
                                        String str16 = str8;
                                        String str17 = str7;
                                        String str18 = str9;
                                        String str19 = str10;
                                        TypeDescription.Generic returnType = next6.getReturnType();
                                        if (next6.isTypeInitializer()) {
                                            throw new IllegalStateException("Illegal explicit declaration of a type initializer by " + this);
                                        }
                                        if (next6.isConstructor()) {
                                            str7 = str17;
                                            if (!returnType.represents(Void.TYPE)) {
                                                throw new IllegalStateException("A constructor must return void " + next6);
                                            }
                                            if (!returnType.getDeclaredAnnotations().isEmpty()) {
                                                throw new IllegalStateException("The void non-type must not be annotated for " + next6);
                                            }
                                        } else {
                                            str7 = str17;
                                            if (!isValidIdentifier(next6.getInternalName())) {
                                                throw new IllegalStateException("Illegal method name " + returnType + " for " + next6);
                                            }
                                            if (!((Boolean) returnType.accept(TypeDescription.Generic.Visitor.Validator.METHOD_RETURN)).booleanValue()) {
                                                throw new IllegalStateException("Illegal return type " + returnType + " for " + next6);
                                            }
                                            if (!((Boolean) returnType.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                throw new IllegalStateException("Illegal type annotations on return type " + returnType + " for " + next6);
                                            }
                                            if (!next6.isSynthetic() && !next6.getReturnType().asErasure().isVisibleTo(this)) {
                                                throw new IllegalStateException("Invisible return type " + next6.getReturnType() + " for " + next6);
                                            }
                                        }
                                        HashSet hashSet15 = new HashSet();
                                        Iterator<ParameterDescription.InDefinedShape> it13 = next6.getParameters().iterator();
                                        while (it13.hasNext()) {
                                            Iterator<ParameterDescription.InDefinedShape> it14 = it13;
                                            ParameterDescription.InDefinedShape next7 = it13.next();
                                            String str20 = str2;
                                            TypeDescription.Generic type = next7.getType();
                                            String str21 = str3;
                                            if (!((Boolean) type.accept(TypeDescription.Generic.Visitor.Validator.METHOD_PARAMETER)).booleanValue()) {
                                                throw new IllegalStateException("Illegal parameter type of " + next7 + " for " + next6);
                                            }
                                            if (!((Boolean) type.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                throw new IllegalStateException("Illegal type annotations on parameter " + next7 + " for " + next6);
                                            }
                                            if (!next6.isSynthetic() && !type.asErasure().isVisibleTo(this)) {
                                                throw new IllegalStateException("Invisible parameter type of " + next7 + " for " + next6);
                                            }
                                            if (next7.isNamed()) {
                                                String name = next7.getName();
                                                if (!hashSet15.add(name)) {
                                                    throw new IllegalStateException("Duplicate parameter name of " + next7 + " for " + next6);
                                                }
                                                if (!isValidIdentifier(name)) {
                                                    throw new IllegalStateException("Illegal parameter name of " + next7 + " for " + next6);
                                                }
                                            }
                                            if (next7.hasModifiers() && (next7.getModifiers() & (-36881)) != 0) {
                                                throw new IllegalStateException("Illegal modifiers of " + next7 + " for " + next6);
                                            }
                                            HashSet hashSet16 = new HashSet();
                                            Iterator<AnnotationDescription> it15 = next7.getDeclaredAnnotations().iterator();
                                            while (it15.hasNext()) {
                                                HashSet hashSet17 = hashSet15;
                                                AnnotationDescription next8 = it15.next();
                                                Iterator<AnnotationDescription> it16 = it15;
                                                if (!next8.isSupportedOn(ElementType.PARAMETER)) {
                                                    throw new IllegalStateException("Cannot add " + next8 + str16 + next7);
                                                }
                                                if (!hashSet16.add(next8.getAnnotationType())) {
                                                    throw new IllegalStateException("Duplicate annotation " + next8 + " of " + next7 + " for " + next6);
                                                }
                                                it15 = it16;
                                                hashSet15 = hashSet17;
                                            }
                                            str2 = str20;
                                            it13 = it14;
                                            str3 = str21;
                                        }
                                        String str22 = str2;
                                        String str23 = str3;
                                        for (TypeDescription.Generic generic4 : next6.getExceptionTypes()) {
                                            if (!((Boolean) generic4.accept(TypeDescription.Generic.Visitor.Validator.EXCEPTION)).booleanValue()) {
                                                throw new IllegalStateException("Illegal exception type " + generic4 + " for " + next6);
                                            }
                                            if (!((Boolean) generic4.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                throw new IllegalStateException(str15 + generic4 + " for " + next6);
                                            }
                                            if (!next6.isSynthetic() && !generic4.asErasure().isVisibleTo(this)) {
                                                throw new IllegalStateException("Invisible exception type " + generic4 + " for " + next6);
                                            }
                                        }
                                        String str24 = str15;
                                        HashSet hashSet18 = new HashSet();
                                        Iterator<AnnotationDescription> it17 = next6.getDeclaredAnnotations().iterator();
                                        while (it17.hasNext()) {
                                            Iterator<AnnotationDescription> it18 = it17;
                                            AnnotationDescription next9 = it17.next();
                                            String str25 = str24;
                                            if (!next9.isSupportedOn(next6.isMethod() ? ElementType.METHOD : ElementType.CONSTRUCTOR)) {
                                                throw new IllegalStateException("Cannot add " + next9 + str16 + next6);
                                            }
                                            if (!hashSet18.add(next9.getAnnotationType())) {
                                                throw new IllegalStateException("Duplicate annotation " + next9 + " for " + next6);
                                            }
                                            it17 = it18;
                                            str24 = str25;
                                        }
                                        String str26 = str24;
                                        AnnotationValue<?, ?> defaultValue = next6.getDefaultValue();
                                        if (defaultValue != null && !next6.isDefaultValue(defaultValue)) {
                                            throw new IllegalStateException("Illegal default value " + defaultValue + "for " + next6);
                                        }
                                        TypeDescription.Generic receiverType = next6.getReceiverType();
                                        if (receiverType != null && !((Boolean) receiverType.accept(TypeDescription.Generic.Visitor.Validator.RECEIVER)).booleanValue()) {
                                            throw new IllegalStateException("Illegal receiver type " + receiverType + " for " + next6);
                                        }
                                        if (next6.isStatic()) {
                                            if (receiverType != null) {
                                                throw new IllegalStateException("Static method " + next6 + " defines a non-null receiver " + receiverType);
                                            }
                                            str = str16;
                                        } else {
                                            if (next6.isConstructor()) {
                                                if (receiverType != null) {
                                                    str = str16;
                                                    if (receiverType.asErasure().equals(enclosingType == null ? this : enclosingType)) {
                                                    }
                                                }
                                                throw new IllegalStateException("Constructor " + next6 + " defines an illegal receiver " + receiverType);
                                            }
                                            str = str16;
                                            if (receiverType == null || !equals(receiverType.asErasure())) {
                                                throw new IllegalStateException("Method " + next6 + " defines an illegal receiver " + receiverType);
                                            }
                                        }
                                        str10 = str19;
                                        str2 = str22;
                                        it11 = it12;
                                        str3 = str23;
                                        hashSet8 = hashSet14;
                                        str11 = str26;
                                        str9 = str18;
                                        str8 = str;
                                    }
                                    return this;
                                }
                                FieldDescription.InDefinedShape next10 = it10.next();
                                String name2 = next10.getName();
                                Iterator<FieldDescription.InDefinedShape> it19 = it10;
                                if (!hashSet7.add(next10.asSignatureToken())) {
                                    throw new IllegalStateException("Duplicate field definition for " + next10);
                                }
                                if (!isValidIdentifier(name2)) {
                                    throw new IllegalStateException("Illegal field name for " + next10);
                                }
                                if ((next10.getModifiers() & (-151776)) != 0) {
                                    throw new IllegalStateException("Illegal field modifiers " + next10.getModifiers() + " for " + next10);
                                }
                                TypeDescription.Generic type2 = next10.getType();
                                HashSet hashSet19 = hashSet7;
                                if (!((Boolean) type2.accept(TypeDescription.Generic.Visitor.Validator.FIELD)).booleanValue()) {
                                    throw new IllegalStateException("Illegal field type " + type2 + " for " + next10);
                                }
                                if (!((Boolean) type2.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                    throw new IllegalStateException("Illegal type annotations on " + type2 + " for " + this);
                                }
                                if (!next10.isSynthetic() && !type2.asErasure().isVisibleTo(this)) {
                                    throw new IllegalStateException("Invisible field type " + next10.getType() + " for " + next10);
                                }
                                HashSet hashSet20 = new HashSet();
                                Iterator<AnnotationDescription> it20 = next10.getDeclaredAnnotations().iterator();
                                while (it20.hasNext()) {
                                    AnnotationDescription next11 = it20.next();
                                    Iterator<AnnotationDescription> it21 = it20;
                                    if (!next11.isSupportedOn(ElementType.FIELD)) {
                                        throw new IllegalStateException("Cannot add " + next11 + " on " + next10);
                                    }
                                    if (!hashSet20.add(next11.getAnnotationType())) {
                                        throw new IllegalStateException("Duplicate annotation " + next11 + " for " + next10);
                                    }
                                    it20 = it21;
                                }
                                str6 = str10;
                                hashSet7 = hashSet19;
                                it10 = it19;
                            }
                        }
                    }
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ InstrumentedType withAnnotations(List list) {
            return withAnnotations((List<? extends AnnotationDescription>) list);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public WithFlexibleName withName(String str) {
            return new Default(str, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public WithFlexibleName withTypeVariables(ElementMatcher<? super TypeDescription.Generic> elementMatcher, Transformer<TypeVariableToken> transformer) {
            ArrayList arrayList = new ArrayList(this.typeVariables.size());
            int i = 0;
            for (TypeVariableToken typeVariableTokenTransform : this.typeVariables) {
                int i2 = i + 1;
                if (elementMatcher.matches(getTypeVariables().get(i))) {
                    typeVariableTokenTransform = transformer.transform(this, typeVariableTokenTransform);
                }
                arrayList.add(typeVariableTokenTransform);
                i = i2;
            }
            return new Default(this.name, this.modifiers, this.superClass, arrayList, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: of */
        public static InstrumentedType m5276of(String str, TypeDescription.Generic generic, int i) {
            return Factory.Default.MODIFIABLE.subclass(str, i, generic);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition; */
        @Override // net.bytebuddy.description.DeclaredByType
        @MaybeNull
        public TypeDescription getDeclaringType() {
            return this.declaringType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnnotations(List<? extends AnnotationDescription> list) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, CompoundList.m5414of((List) this.annotationDescriptions, (List) list), this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withAnonymousClass(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnonymousClass(boolean z) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, z, false, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withAuxiliaryField(Lnet/bytebuddy/description/field/FieldDescription$Token;Ljava/lang/Object;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAuxiliaryField(FieldDescription.Token token, Object obj) {
            HashMap map = new HashMap(this.auxiliaryFields);
            Object objPut = map.put(token.getName(), obj);
            if (objPut == null) {
                return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, CompoundList.m5413of(this.fieldTokens, token.accept((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m5253of(this))), map, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, new LoadedTypeInitializer.Compound(this.loadedTypeInitializer, new LoadedTypeInitializer.ForStaticField(token.getName(), obj)), this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
            }
            if (objPut == obj) {
                return this;
            }
            throw new IllegalStateException("Field " + token.getName() + " for " + this + " already mapped to " + objPut + " and not " + obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withDeclaredTypes(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaredTypes(TypeList typeList) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, CompoundList.m5414of((List) this.declaredTypes, (List) typeList), this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withDeclaringType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaringType(@MaybeNull TypeDescription typeDescription) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, typeDescription, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withEnclosingMethod(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingMethod(MethodDescription.InDefinedShape inDefinedShape) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, inDefinedShape, inDefinedShape.getDeclaringType(), this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withEnclosingType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingType(@MaybeNull TypeDescription typeDescription) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, MethodDescription.UNDEFINED, typeDescription, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withField(Lnet/bytebuddy/description/field/FieldDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withField(FieldDescription.Token token) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, CompoundList.m5413of(this.fieldTokens, token.accept((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m5253of(this))), this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withInterfaces(Lnet/bytebuddy/description/type/TypeList$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInterfaces(TypeList.Generic generic) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, CompoundList.m5414of((List) this.interfaceTypes, (List) generic.accept(TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m5253of(this))), this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withLocalClass(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withLocalClass(boolean z) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, false, z, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withMethod(Lnet/bytebuddy/description/method/MethodDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withMethod(MethodDescription.Token token) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, CompoundList.m5413of(this.methodTokens, token.accept((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m5253of(this))), this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withModifiers(I)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withModifiers(int i) {
            return new Default(this.name, i, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withNestHost(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestHost(TypeDescription typeDescription) {
            String str = this.name;
            int i = this.modifiers;
            TypeDescription.Generic generic = this.superClass;
            List<? extends TypeVariableToken> list = this.typeVariables;
            List<? extends TypeDescription.Generic> list2 = this.interfaceTypes;
            List<? extends FieldDescription.Token> list3 = this.fieldTokens;
            Map<String, Object> map = this.auxiliaryFields;
            List<? extends MethodDescription.Token> list4 = this.methodTokens;
            List<? extends RecordComponentDescription.Token> list5 = this.recordComponentTokens;
            List<? extends AnnotationDescription> list6 = this.annotationDescriptions;
            TypeInitializer typeInitializer = this.typeInitializer;
            LoadedTypeInitializer loadedTypeInitializer = this.loadedTypeInitializer;
            TypeDescription typeDescription2 = this.declaringType;
            MethodDescription.InDefinedShape inDefinedShape = this.enclosingMethod;
            TypeDescription typeDescription3 = this.enclosingType;
            List<? extends TypeDescription> list7 = this.declaredTypes;
            List<? extends TypeDescription> list8 = this.permittedSubclasses;
            boolean z = this.anonymousClass;
            boolean z2 = this.localClass;
            boolean z3 = this.record;
            TypeDescription typeDescription4 = typeDescription;
            if (typeDescription4.equals(this)) {
                typeDescription4 = TargetType.DESCRIPTION;
            }
            return new Default(str, i, generic, list, list2, list3, map, list4, list5, list6, typeInitializer, loadedTypeInitializer, typeDescription2, inDefinedShape, typeDescription3, list7, list8, z, z2, z3, typeDescription4, Collections.emptyList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withNestMembers(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestMembers(TypeList typeList) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, TargetType.DESCRIPTION, CompoundList.m5414of((List) this.nestMembers, (List) typeList));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withPermittedSubclasses(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withPermittedSubclasses(@MaybeNull TypeList typeList) {
            List<? extends TypeDescription> list;
            List listM5414of = typeList;
            String str = this.name;
            int i = this.modifiers;
            TypeDescription.Generic generic = this.superClass;
            List<? extends TypeVariableToken> list2 = this.typeVariables;
            List<? extends TypeDescription.Generic> list3 = this.interfaceTypes;
            List<? extends FieldDescription.Token> list4 = this.fieldTokens;
            Map<String, Object> map = this.auxiliaryFields;
            List<? extends MethodDescription.Token> list5 = this.methodTokens;
            List<? extends RecordComponentDescription.Token> list6 = this.recordComponentTokens;
            List<? extends AnnotationDescription> list7 = this.annotationDescriptions;
            TypeInitializer typeInitializer = this.typeInitializer;
            LoadedTypeInitializer loadedTypeInitializer = this.loadedTypeInitializer;
            TypeDescription typeDescription = this.declaringType;
            MethodDescription.InDefinedShape inDefinedShape = this.enclosingMethod;
            TypeDescription typeDescription2 = this.enclosingType;
            List<? extends TypeDescription> list8 = this.declaredTypes;
            if (listM5414of != null && (list = this.permittedSubclasses) != null) {
                listM5414of = CompoundList.m5414of((List) list, listM5414of);
            }
            return new Default(str, i, generic, list2, list3, list4, map, list5, list6, list7, typeInitializer, loadedTypeInitializer, typeDescription, inDefinedShape, typeDescription2, list8, listM5414of, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withRecord(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withRecord(boolean z) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, z ? this.recordComponentTokens : Collections.emptyList(), this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, z, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withRecordComponent(Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withRecordComponent(RecordComponentDescription.Token token) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, CompoundList.m5413of(this.recordComponentTokens, token.accept((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m5253of(this))), this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, true, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withTypeVariable(Lnet/bytebuddy/description/type/TypeVariableToken;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withTypeVariable(TypeVariableToken typeVariableToken) {
            return new Default(this.name, this.modifiers, this.superClass, CompoundList.m5413of(this.typeVariables, typeVariableToken.accept((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m5253of(this))), this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        /* JADX DEBUG: Method merged with bridge method: withInitializer(Lnet/bytebuddy/implementation/LoadedTypeInitializer;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(LoadedTypeInitializer loadedTypeInitializer) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, new LoadedTypeInitializer.Compound(this.loadedTypeInitializer, loadedTypeInitializer), this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        private static boolean isValidIdentifier(String str) {
            if (KEYWORDS.contains(str) || str.length() == 0 || !Character.isJavaIdentifierStart(str.charAt(0))) {
                return false;
            }
            if (str.equals(PackageDescription.PACKAGE_CLASS_NAME)) {
                return true;
            }
            for (int i = 1; i < str.length(); i++) {
                if (!Character.isJavaIdentifierPart(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: withInitializer(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(ByteCodeAppender byteCodeAppender) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer.expandWith(byteCodeAppender), this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }
    }

    public interface Factory {

        public enum Default implements Factory {
            MODIFIABLE { // from class: net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.1
                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
                public WithFlexibleName represent(TypeDescription typeDescription) {
                    TypeDescription typeDescription2;
                    List listEmptyList;
                    String name = typeDescription.getName();
                    int modifiers = typeDescription.getModifiers();
                    TypeDescription.Generic superClass = typeDescription.getSuperClass();
                    ByteCodeElement.Token.TokenList<TypeVariableToken> tokenListAsTokenList = typeDescription.getTypeVariables().asTokenList(ElementMatchers.m5390is(typeDescription));
                    TypeList.Generic genericAccept = typeDescription.getInterfaces().accept(TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m5253of(typeDescription));
                    ByteCodeElement.Token.TokenList<FieldDescription.Token> tokenListAsTokenList2 = typeDescription.getDeclaredFields().asTokenList(ElementMatchers.m5390is(typeDescription));
                    Map mapEmptyMap = Collections.emptyMap();
                    ByteCodeElement.Token.TokenList<MethodDescription.Token> tokenListAsTokenList3 = typeDescription.getDeclaredMethods().asTokenList(ElementMatchers.m5390is(typeDescription));
                    ByteCodeElement.Token.TokenList<RecordComponentDescription.Token> tokenListAsTokenList4 = typeDescription.getRecordComponents().asTokenList(ElementMatchers.m5390is(typeDescription));
                    AnnotationList declaredAnnotations = typeDescription.getDeclaredAnnotations();
                    TypeInitializer.None none = TypeInitializer.None.INSTANCE;
                    LoadedTypeInitializer.NoOp noOp = LoadedTypeInitializer.NoOp.INSTANCE;
                    TypeDescription declaringType = typeDescription.getDeclaringType();
                    MethodDescription.InDefinedShape enclosingMethod = typeDescription.getEnclosingMethod();
                    TypeDescription enclosingType = typeDescription.getEnclosingType();
                    TypeList declaredTypes = typeDescription.getDeclaredTypes();
                    TypeList permittedSubtypes = typeDescription.isSealed() ? typeDescription.getPermittedSubtypes() : TypeList.UNDEFINED;
                    boolean zIsAnonymousType = typeDescription.isAnonymousType();
                    boolean zIsLocalType = typeDescription.isLocalType();
                    boolean zIsRecord = typeDescription.isRecord();
                    TypeDescription nestHost = typeDescription.isNestHost() ? TargetType.DESCRIPTION : typeDescription.getNestHost();
                    if (typeDescription.isNestHost()) {
                        typeDescription2 = enclosingType;
                        listEmptyList = typeDescription.getNestMembers().filter(ElementMatchers.not(ElementMatchers.m5390is(typeDescription)));
                    } else {
                        typeDescription2 = enclosingType;
                        listEmptyList = Collections.emptyList();
                    }
                    return new Default(name, modifiers, superClass, tokenListAsTokenList, genericAccept, tokenListAsTokenList2, mapEmptyMap, tokenListAsTokenList3, tokenListAsTokenList4, declaredAnnotations, none, noOp, declaringType, enclosingMethod, typeDescription2, declaredTypes, permittedSubtypes, zIsAnonymousType, zIsLocalType, zIsRecord, nestHost, listEmptyList);
                }
            },
            FROZEN { // from class: net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.2
                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
                public WithFlexibleName represent(TypeDescription typeDescription) {
                    return new Frozen(typeDescription, LoadedTypeInitializer.NoOp.INSTANCE);
                }
            };

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
            public WithFlexibleName subclass(String str, int i, TypeDescription.Generic generic) {
                List listEmptyList = Collections.emptyList();
                List listEmptyList2 = Collections.emptyList();
                List listEmptyList3 = Collections.emptyList();
                Map mapEmptyMap = Collections.emptyMap();
                List listEmptyList4 = Collections.emptyList();
                List listEmptyList5 = Collections.emptyList();
                List listEmptyList6 = Collections.emptyList();
                TypeInitializer.None none = TypeInitializer.None.INSTANCE;
                LoadedTypeInitializer.NoOp noOp = LoadedTypeInitializer.NoOp.INSTANCE;
                TypeDescription typeDescription = TypeDescription.UNDEFINED;
                return new Default(str, i, generic, listEmptyList, listEmptyList2, listEmptyList3, mapEmptyMap, listEmptyList4, listEmptyList5, listEmptyList6, none, noOp, typeDescription, MethodDescription.UNDEFINED, typeDescription, Collections.emptyList(), TypeList.UNDEFINED, false, false, false, TargetType.DESCRIPTION, Collections.emptyList());
            }
        }

        WithFlexibleName represent(TypeDescription typeDescription);

        WithFlexibleName subclass(String str, int i, TypeDescription.Generic generic);
    }

    public static class Frozen extends TypeDescription.AbstractBase.OfSimpleType implements WithFlexibleName {
        private final LoadedTypeInitializer loadedTypeInitializer;
        private final TypeDescription typeDescription;

        public Frozen(TypeDescription typeDescription, LoadedTypeInitializer loadedTypeInitializer) {
            this.typeDescription = typeDescription;
            this.loadedTypeInitializer = loadedTypeInitializer;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public int getActualModifiers(boolean z) {
            return this.typeDescription.getActualModifiers(z);
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        @MaybeNull
        public ClassFileVersion getClassFileVersion() {
            return this.typeDescription.getClassFileVersion();
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return this.typeDescription.getDeclaredAnnotations();
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
            return this.typeDescription.getDeclaredFields();
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
            return this.typeDescription.getDeclaredMethods();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public TypeList getDeclaredTypes() {
            return this.typeDescription.getDeclaredTypes();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @MaybeNull
        public MethodDescription.InDefinedShape getEnclosingMethod() {
            return this.typeDescription.getEnclosingMethod();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @MaybeNull
        public TypeDescription getEnclosingType() {
            return this.typeDescription.getEnclosingType();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithDescriptor
        @MaybeNull
        public String getGenericSignature() {
            return this.typeDescription.getGenericSignature();
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public TypeList.Generic getInterfaces() {
            return this.typeDescription.getInterfaces();
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public LoadedTypeInitializer getLoadedTypeInitializer() {
            return this.loadedTypeInitializer;
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.typeDescription.getModifiers();
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.typeDescription.getName();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public TypeDescription getNestHost() {
            return this.typeDescription.getNestHost();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public TypeList getNestMembers() {
            return this.typeDescription.getNestMembers();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @MaybeNull
        public PackageDescription getPackage() {
            return this.typeDescription.getPackage();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public TypeList getPermittedSubtypes() {
            return this.typeDescription.getPermittedSubtypes();
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public RecordComponentList<RecordComponentDescription.InDefinedShape> getRecordComponents() {
            return this.typeDescription.getRecordComponents();
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @MaybeNull
        public TypeDescription.Generic getSuperClass() {
            return this.typeDescription.getSuperClass();
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public TypeInitializer getTypeInitializer() {
            return TypeInitializer.None.INSTANCE;
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            return this.typeDescription.getTypeVariables();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
            return this.typeDescription.isAnonymousType();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
            return this.typeDescription.isLocalType();
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isRecord() {
            return this.typeDescription.isRecord();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isSealed() {
            return this.typeDescription.isSealed();
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public TypeDescription validated() {
            return this.typeDescription;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ InstrumentedType withAnnotations(List list) {
            return withAnnotations((List<? extends AnnotationDescription>) list);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public WithFlexibleName withName(String str) {
            throw new IllegalStateException("Cannot change name of frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public WithFlexibleName withTypeVariables(ElementMatcher<? super TypeDescription.Generic> elementMatcher, Transformer<TypeVariableToken> transformer) {
            throw new IllegalStateException("Cannot add type variables of frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition; */
        @Override // net.bytebuddy.description.DeclaredByType
        @MaybeNull
        public TypeDescription getDeclaringType() {
            return this.typeDescription.getDeclaringType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnnotations(List<? extends AnnotationDescription> list) {
            throw new IllegalStateException("Cannot add annotation to frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withAnonymousClass(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnonymousClass(boolean z) {
            throw new IllegalStateException("Cannot define anonymous class state for frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withAuxiliaryField(Lnet/bytebuddy/description/field/FieldDescription$Token;Ljava/lang/Object;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAuxiliaryField(FieldDescription.Token token, Object obj) {
            throw new IllegalStateException("Cannot define auxiliary field for frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withDeclaredTypes(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaredTypes(TypeList typeList) {
            throw new IllegalStateException("Cannot add declared types to frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withDeclaringType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaringType(@MaybeNull TypeDescription typeDescription) {
            throw new IllegalStateException("Cannot add declaring type to frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withEnclosingMethod(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingMethod(MethodDescription.InDefinedShape inDefinedShape) {
            throw new IllegalStateException("Cannot set enclosing method of frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withEnclosingType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingType(@MaybeNull TypeDescription typeDescription) {
            throw new IllegalStateException("Cannot set enclosing type of frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withField(Lnet/bytebuddy/description/field/FieldDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withField(FieldDescription.Token token) {
            throw new IllegalStateException("Cannot define field for frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withInterfaces(Lnet/bytebuddy/description/type/TypeList$Generic;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInterfaces(TypeList.Generic generic) {
            throw new IllegalStateException("Cannot add interfaces for frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withLocalClass(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withLocalClass(boolean z) {
            throw new IllegalStateException("Cannot define local class state for frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withMethod(Lnet/bytebuddy/description/method/MethodDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withMethod(MethodDescription.Token token) {
            throw new IllegalStateException("Cannot define method for frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withModifiers(I)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withModifiers(int i) {
            throw new IllegalStateException("Cannot change modifiers for frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withNestHost(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestHost(TypeDescription typeDescription) {
            throw new IllegalStateException("Cannot set nest host of frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withNestMembers(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestMembers(TypeList typeList) {
            throw new IllegalStateException("Cannot add nest members to frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withPermittedSubclasses(Lnet/bytebuddy/description/type/TypeList;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withPermittedSubclasses(@MaybeNull TypeList typeList) {
            throw new IllegalStateException("Cannot add permitted subclasses to frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withRecord(Z)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withRecord(boolean z) {
            throw new IllegalStateException("Cannot define record state for frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withRecordComponent(Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withRecordComponent(RecordComponentDescription.Token token) {
            throw new IllegalStateException("Cannot define record component for frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: withTypeVariable(Lnet/bytebuddy/description/type/TypeVariableToken;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withTypeVariable(TypeVariableToken typeVariableToken) {
            throw new IllegalStateException("Cannot define type variable for frozen type: " + this.typeDescription);
        }

        /* JADX DEBUG: Method merged with bridge method: withInitializer(Lnet/bytebuddy/implementation/LoadedTypeInitializer;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(LoadedTypeInitializer loadedTypeInitializer) {
            return new Frozen(this.typeDescription, new LoadedTypeInitializer.Compound(this.loadedTypeInitializer, loadedTypeInitializer));
        }

        /* JADX DEBUG: Method merged with bridge method: withInitializer(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType; */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(ByteCodeAppender byteCodeAppender) {
            throw new IllegalStateException("Cannot add initializer to frozen type: " + this.typeDescription);
        }
    }

    public interface Prepareable {

        public enum NoOp implements Prepareable {
            INSTANCE;

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        InstrumentedType prepare(InstrumentedType instrumentedType);
    }

    public interface WithFlexibleName extends InstrumentedType {
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withAnnotations(List<? extends AnnotationDescription> list);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withAnonymousClass(boolean z);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withAuxiliaryField(FieldDescription.Token token, Object obj);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withDeclaredTypes(TypeList typeList);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withDeclaringType(@MaybeNull TypeDescription typeDescription);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withEnclosingMethod(MethodDescription.InDefinedShape inDefinedShape);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withEnclosingType(@MaybeNull TypeDescription typeDescription);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withField(FieldDescription.Token token);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withInitializer(LoadedTypeInitializer loadedTypeInitializer);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withInitializer(ByteCodeAppender byteCodeAppender);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withInterfaces(TypeList.Generic generic);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withLocalClass(boolean z);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withMethod(MethodDescription.Token token);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withModifiers(int i);

        WithFlexibleName withName(String str);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withNestHost(TypeDescription typeDescription);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withNestMembers(TypeList typeList);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withPermittedSubclasses(@MaybeNull TypeList typeList);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withRecord(boolean z);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withRecordComponent(RecordComponentDescription.Token token);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withTypeVariable(TypeVariableToken typeVariableToken);

        WithFlexibleName withTypeVariables(ElementMatcher<? super TypeDescription.Generic> elementMatcher, Transformer<TypeVariableToken> transformer);
    }

    LoadedTypeInitializer getLoadedTypeInitializer();

    TypeInitializer getTypeInitializer();

    TypeDescription validated();

    InstrumentedType withAnnotations(List<? extends AnnotationDescription> list);

    InstrumentedType withAnonymousClass(boolean z);

    InstrumentedType withAuxiliaryField(FieldDescription.Token token, Object obj);

    InstrumentedType withDeclaredTypes(TypeList typeList);

    InstrumentedType withDeclaringType(@MaybeNull TypeDescription typeDescription);

    InstrumentedType withEnclosingMethod(MethodDescription.InDefinedShape inDefinedShape);

    InstrumentedType withEnclosingType(TypeDescription typeDescription);

    InstrumentedType withField(FieldDescription.Token token);

    InstrumentedType withInitializer(LoadedTypeInitializer loadedTypeInitializer);

    InstrumentedType withInitializer(ByteCodeAppender byteCodeAppender);

    InstrumentedType withInterfaces(TypeList.Generic generic);

    InstrumentedType withLocalClass(boolean z);

    InstrumentedType withMethod(MethodDescription.Token token);

    InstrumentedType withModifiers(int i);

    InstrumentedType withNestHost(TypeDescription typeDescription);

    InstrumentedType withNestMembers(TypeList typeList);

    InstrumentedType withPermittedSubclasses(@MaybeNull TypeList typeList);

    InstrumentedType withRecord(boolean z);

    InstrumentedType withRecordComponent(RecordComponentDescription.Token token);

    InstrumentedType withTypeVariable(TypeVariableToken typeVariableToken);
}
