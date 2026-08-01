package net.bytebuddy.dynamic.scaffold;

import androidx.collection.C1123;
import androidx.fragment.app.C3141;
import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.C4515;
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
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationList;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.field.FieldList;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.modifier.ModifierContributor;
import net.bytebuddy.description.module.ModuleDescription;
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
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.utility.JavaType;
import net.bytebuddy.utility.nullability.MaybeNull;
import p160.C8376;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InstrumentedType extends TypeDescription {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Factory {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Default implements Factory {
            MODIFIABLE { // from class: net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.1
                /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                    	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
                    	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
                    	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
                    */
                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
                public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName represent(
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addEnumFields(ClassGen.java:515)
                    	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:287)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                    	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
                    	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
                    */
            },
            FROZEN { // from class: net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.2
                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
                public WithFlexibleName represent(TypeDescription typeDescription) {
                    return new Frozen(typeDescription, LoadedTypeInitializer.NoOp.INSTANCE);
                }
            };

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
            public WithFlexibleName subclass(String str, int i, @MaybeNull TypeDescription.Generic generic) {
                ModuleDescription moduleDescription = ModuleDescription.UNDEFINED;
                List list = Collections.EMPTY_LIST;
                Map map = Collections.EMPTY_MAP;
                TypeInitializer.None none = TypeInitializer.None.INSTANCE;
                LoadedTypeInitializer.NoOp noOp = LoadedTypeInitializer.NoOp.INSTANCE;
                TypeDescription typeDescription = TypeDescription.UNDEFINED;
                return new Default(str, i, moduleDescription, list, generic, list, list, map, list, list, list, none, noOp, typeDescription, MethodDescription.UNDEFINED, typeDescription, list, TypeList.UNDEFINED, false, false, false, TargetType.DESCRIPTION, list);
            }
        }

        WithFlexibleName represent(TypeDescription typeDescription);

        WithFlexibleName subclass(String str, int i, @MaybeNull TypeDescription.Generic generic);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withModuleDescription(@MaybeNull ModuleDescription moduleDescription);

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

    InstrumentedType withModuleDescription(@MaybeNull ModuleDescription moduleDescription);

    InstrumentedType withNestHost(TypeDescription typeDescription);

    InstrumentedType withNestMembers(TypeList typeList);

    InstrumentedType withPermittedSubclasses(@MaybeNull TypeList typeList);

    InstrumentedType withRecord(boolean z);

    InstrumentedType withRecordComponent(RecordComponentDescription.Token token);

    InstrumentedType withTypeVariable(TypeVariableToken typeVariableToken);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Default extends TypeDescription.AbstractBase.OfSimpleType implements WithFlexibleName {
        private static final Set<String> KEYWORDS = new HashSet(Arrays.asList("abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"));
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

        @MaybeNull
        private final ModuleDescription moduleDescription;
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

        public Default(String str, int i, @MaybeNull ModuleDescription moduleDescription, List<? extends TypeVariableToken> list, @MaybeNull TypeDescription.Generic generic, List<? extends TypeDescription.Generic> list2, List<? extends FieldDescription.Token> list3, Map<String, Object> map, List<? extends MethodDescription.Token> list4, List<? extends RecordComponentDescription.Token> list5, List<? extends AnnotationDescription> list6, TypeInitializer typeInitializer, LoadedTypeInitializer loadedTypeInitializer, @MaybeNull TypeDescription typeDescription, @MaybeNull MethodDescription.InDefinedShape inDefinedShape, @MaybeNull TypeDescription typeDescription2, List<? extends TypeDescription> list7, @MaybeNull List<? extends TypeDescription> list8, boolean z, boolean z2, boolean z3, TypeDescription typeDescription3, List<? extends TypeDescription> list9) {
            this.name = str;
            this.modifiers = i;
            this.moduleDescription = moduleDescription;
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

        private static boolean isValidIdentifier(String str) {
            if (KEYWORDS.contains(str) || str.length() == 0 || !(Character.isJavaIdentifierStart(str.charAt(0)) || Character.isUnicodeIdentifierStart(str.charAt(0)))) {
                return false;
            }
            if (!str.equals(PackageDescription.PACKAGE_CLASS_NAME) && !str.equals(ModuleDescription.MODULE_CLASS_NAME)) {
                for (int i = 1; i < str.length(); i++) {
                    if (!Character.isJavaIdentifierPart(str.charAt(i)) && !Character.isUnicodeIdentifierPart(str.charAt(i))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private static boolean isValidMethodIdentifier(String str) {
            if (str.length() == 0) {
                return false;
            }
            if (!str.equals(MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME) && !str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '.' || cCharAt == '/' || cCharAt == ';' || cCharAt == '<' || cCharAt == '>' || cCharAt == '[') {
                        return false;
                    }
                }
            }
            return true;
        }

        private static boolean isValidUnqualifiedNameIdentifier(String str) {
            if (str.length() == 0) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '.' || cCharAt == '/' || cCharAt == ';' || cCharAt == '[') {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: of */
        public static InstrumentedType m339of(String str, TypeDescription.Generic generic, ModifierContributor.ForType... forTypeArr) {
            return m338of(str, generic, ModifierContributor.Resolver.m284of(forTypeArr).resolve());
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
            return new TypeList.Generic.ForDetachedTypes.WithResolvedErasure(this.interfaceTypes, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.m303of(this));
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
            return this.nestHost.represents(TargetType.class) ? new TypeList.Explicit((List<? extends TypeDescription>) CompoundList.m475of(this, (List<? extends Default>) this.nestMembers)) : this.nestHost.getNestMembers();
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
            return generic == null ? TypeDescription.Generic.UNDEFINED : new TypeDescription.Generic.LazyProjection.WithResolvedErasure(generic, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.m303of(this));
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
        public boolean isRecord() {
            return this.record && this.superClass != null && getSuperClass().asErasure().equals(JavaType.RECORD.getTypeStub());
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isSealed() {
            return this.permittedSubclasses != null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @MaybeNull
        public ModuleDescription toModuleDescription() {
            return this.moduleDescription;
        }

        /* JADX WARN: Code restructure failed: missing block: B:208:0x037a, code lost:
        
            lin.xposed.hook.javaplugin.C6385.m11446("Cannot add ", r6, " on ", r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:209:0x037d, code lost:
        
            return r18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x01a6, code lost:
        
            lin.xposed.hook.javaplugin.C6385.m11447(r3, r1, " of ", r17, " for ", r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x01ac, code lost:
        
            return r18;
         */
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TypeDescription validated() {
            Default r5 = this;
            TypeDescription typeDescription = null;
            String str = " for ";
            if (!isValidIdentifier(r5.getName().split("\\."))) {
                C1123.m1407("Illegal type name: ", r5.getName(), " for ", r5);
                return null;
            }
            if ((r5.getModifiers() & (-163392)) != 0) {
                C4515.m8485(r5.getModifiers(), " for ", r5, "Illegal modifiers ");
                return null;
            }
            if (r5.isPackageType() && r5.getModifiers() != 5632) {
                C4515.m8485(r5.getModifiers(), " for package ", r5, "Illegal modifiers ");
                return null;
            }
            if (r5.isModuleType() && r5.getModifiers() != 0) {
                C4515.m8485(r5.getModifiers(), " for module ", r5, "Illegal modifiers ");
                return null;
            }
            TypeDescription.Generic superClass = r5.getSuperClass();
            if (superClass != 0) {
                if (!((Boolean) superClass.accept(TypeDescription.Generic.Visitor.Validator.SUPER_CLASS)).booleanValue()) {
                    C6385.m11446("Illegal super class ", superClass, " for ", r5);
                    return null;
                }
                if (!((Boolean) superClass.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                    C6385.m11446("Illegal type annotations on super class ", superClass, " for ", r5);
                    return null;
                }
                if (!superClass.asErasure().isVisibleTo(r5)) {
                    C6385.m11446("Invisible super type ", superClass, " for ", r5);
                    return null;
                }
            }
            HashSet hashSet = new HashSet();
            for (TypeDescription.Generic generic : r5.getInterfaces()) {
                if (!((Boolean) generic.accept(TypeDescription.Generic.Visitor.Validator.INTERFACE)).booleanValue()) {
                    C6385.m11446("Illegal interface ", generic, " for ", r5);
                    return null;
                }
                if (!((Boolean) generic.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                    C6385.m11446("Illegal type annotations on interface ", generic, " for ", r5);
                    return null;
                }
                if (!hashSet.add(generic.asErasure())) {
                    C6385.m11446("Already implemented interface ", generic, " for ", r5);
                    return null;
                }
                if (!generic.asErasure().isVisibleTo(r5)) {
                    C6385.m11446("Invisible interface type ", generic, " for ", r5);
                    return null;
                }
            }
            TypeList.Generic typeVariables = r5.getTypeVariables();
            if (!typeVariables.isEmpty() && r5.isAssignableTo(Throwable.class)) {
                C6385.m11442(r5, "Cannot define throwable ", " to be generic");
                return null;
            }
            HashSet hashSet2 = new HashSet();
            Iterator<TypeDescription.Generic> it = typeVariables.iterator();
            loop1: while (true) {
                String str2 = "Illegal interface bound ";
                boolean z = false;
                String str3 = "Illegal type annotation on '";
                String str4 = "Illegal type variable name '";
                String str5 = "Duplicate type variable symbol '";
                String str6 = "' for ";
                if (it.hasNext()) {
                    TypeDescription.Generic next = it.next();
                    TypeDescription typeDescription2 = typeDescription;
                    String symbol = next.getSymbol();
                    if (!hashSet2.add(symbol)) {
                        C6385.m11446("Duplicate type variable symbol '", next, "' for ", r5);
                        return typeDescription2;
                    }
                    if (!isValidIdentifier(symbol)) {
                        C6385.m11446("Illegal type variable name '", next, "' for ", r5);
                        return typeDescription2;
                    }
                    if (!TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.ofFormalTypeVariable(next)) {
                        C6385.m11446("Illegal type annotation on '", next, "' for ", r5);
                        return typeDescription2;
                    }
                    HashSet hashSet3 = new HashSet();
                    Iterator<TypeDescription.Generic> it2 = next.getUpperBounds().iterator();
                    while (it2.hasNext()) {
                        TypeDescription.Generic next2 = it2.next();
                        if (!((Boolean) next2.accept(TypeDescription.Generic.Visitor.Validator.TYPE_VARIABLE)).booleanValue()) {
                            C6385.m11447("Illegal type variable bound ", next2, " of ", next, " for ", r5);
                            return typeDescription2;
                        }
                        if (!((Boolean) next2.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                            C6385.m11446("Illegal type annotations on type variable ", next2, " for ", r5);
                            return typeDescription2;
                        }
                        if (!hashSet3.add(next2)) {
                            C6385.m11447("Duplicate bound ", next2, " of ", next, " for ", r5);
                            return typeDescription2;
                        }
                        if (z && (next2.getSort().isTypeVariable() || !next2.isInterface())) {
                            break loop1;
                        }
                        r5 = this;
                        next = next;
                        str2 = str2;
                        hashSet2 = hashSet2;
                        z = true;
                    }
                    HashSet hashSet4 = hashSet2;
                    TypeDescription.Generic generic2 = next;
                    if (!z) {
                        C3141.m4913("Type variable ", generic2, " for ", r5, " does not define at least one bound");
                        return typeDescription2;
                    }
                    hashSet2 = hashSet4;
                    typeDescription = typeDescription2;
                } else {
                    Object obj = " of ";
                    String str7 = "Illegal type variable bound ";
                    String str8 = str2;
                    TypeDescription typeDescription3 = typeDescription;
                    TypeDescription enclosingType = r5.getEnclosingType();
                    if (enclosingType != null && (enclosingType.isArray() || enclosingType.isPrimitive())) {
                        C6385.m11446("Cannot define array type or primitive type ", enclosingType, " + as enclosing type for ", r5);
                        return typeDescription3;
                    }
                    MethodDescription.InDefinedShape enclosingMethod = r5.getEnclosingMethod();
                    if (enclosingMethod != null && enclosingMethod.isTypeInitializer()) {
                        C8376.m13333(enclosingMethod, "Cannot enclose type declaration in class initializer ");
                        return typeDescription3;
                    }
                    TypeDescription declaringType = r5.getDeclaringType();
                    if (declaringType != null) {
                        if (declaringType.isPrimitive() || declaringType.isArray()) {
                            C6385.m11446("Cannot define array type or primitive type ", declaringType, " as declaring type for ", r5);
                            return typeDescription3;
                        }
                    } else if (enclosingType == null && enclosingMethod == null && (r5.isLocalType() || r5.isAnonymousType())) {
                        C8376.m13333(r5, "Cannot define an anonymous or local class without a declaring type for ");
                        return typeDescription3;
                    }
                    HashSet hashSet5 = new HashSet();
                    for (TypeDescription typeDescription4 : r5.getDeclaredTypes()) {
                        String str9 = str7;
                        if (typeDescription4.isArray() || typeDescription4.isPrimitive()) {
                            C6385.m11446("Cannot define array type or primitive type ", typeDescription4, " + as declared type for ", r5);
                            return typeDescription3;
                        }
                        if (!hashSet5.add(typeDescription4)) {
                            C6755.m11870(AbstractC3275.m5132("Duplicate definition of declared type ", typeDescription4));
                            return typeDescription3;
                        }
                        str7 = str9;
                    }
                    String str10 = str7;
                    TypeDescription nestHost = r5.getNestHost();
                    if (nestHost.equals(r5)) {
                        HashSet hashSet6 = new HashSet();
                        for (TypeDescription typeDescription5 : r5.getNestMembers()) {
                            if (typeDescription5.isArray() || typeDescription5.isPrimitive()) {
                                C6385.m11446("Cannot define array type or primitive type ", typeDescription5, " + as nest member of ", r5);
                                return typeDescription3;
                            }
                            if (!typeDescription5.isSamePackage(r5)) {
                                C6385.m11446("Cannot define nest member ", typeDescription5, " + within different package then ", r5);
                                return typeDescription3;
                            }
                            if (!hashSet6.add(typeDescription5)) {
                                C6755.m11870(AbstractC3275.m5132("Duplicate definition of nest member ", typeDescription5));
                                return typeDescription3;
                            }
                        }
                    } else {
                        if (nestHost.isArray() || nestHost.isPrimitive()) {
                            C6385.m11446("Cannot define array type or primitive type ", nestHost, " + as nest host for ", r5);
                            return typeDescription3;
                        }
                        if (!nestHost.isSamePackage(r5)) {
                            C6385.m11446("Cannot define nest host ", nestHost, " within different package then ", r5);
                            return typeDescription3;
                        }
                    }
                    for (TypeDescription typeDescription6 : r5.getPermittedSubtypes()) {
                        if (!typeDescription6.isAssignableTo(r5) || typeDescription6.equals(r5)) {
                            C6385.m11446("Cannot assign permitted subclass ", typeDescription6, " to ", r5);
                            return typeDescription3;
                        }
                    }
                    HashSet hashSet7 = new HashSet();
                    Iterator<AnnotationDescription> it3 = r5.getDeclaredAnnotations().iterator();
                    while (true) {
                        String str11 = "Duplicate annotation ";
                        Iterator<AnnotationDescription> it4 = it3;
                        TypeDescription typeDescription7 = enclosingType;
                        if (it3.hasNext()) {
                            AnnotationDescription next3 = it4.next();
                            String str12 = str8;
                            if (!next3.isSupportedOn(ElementType.TYPE) && ((!r5.isAnnotation() || !next3.isSupportedOn(ElementType.ANNOTATION_TYPE)) && ((!r5.isPackageType() || !next3.isSupportedOn(ElementType.PACKAGE)) && (!r5.isModuleType() || !next3.isSupportedOn("MODULE"))))) {
                                break;
                            }
                            if (!hashSet7.add(next3.getAnnotationType())) {
                                C6385.m11446("Duplicate annotation ", next3, " for ", r5);
                                return typeDescription3;
                            }
                            it3 = it4;
                            enclosingType = typeDescription7;
                            str8 = str12;
                        } else {
                            String str13 = str8;
                            HashSet hashSet8 = new HashSet();
                            Iterator<FieldDescription.InDefinedShape> it5 = r5.getDeclaredFields().iterator();
                            while (true) {
                                Iterator<FieldDescription.InDefinedShape> it6 = it5;
                                if (!it5.hasNext()) {
                                    Object obj2 = obj;
                                    HashSet hashSet9 = new HashSet();
                                    Iterator<MethodDescription.InDefinedShape> it7 = r5.getDeclaredMethods().iterator();
                                    while (it7.hasNext()) {
                                        MethodDescription.InDefinedShape next4 = it7.next();
                                        if (!hashSet9.add(next4.asSignatureToken())) {
                                            C8376.m13333(next4, "Duplicate method signature for ");
                                            return typeDescription3;
                                        }
                                        if ((next4.getModifiers() & (-7680)) != 0) {
                                            C4515.m8485(next4.getModifiers(), str, next4, "Illegal modifiers ");
                                            return typeDescription3;
                                        }
                                        if (next4.isAbstract() && (next4.getModifiers() & 2048) != 0) {
                                            C8376.m13333(next4, "Cannot declare strict computations for ");
                                            return typeDescription3;
                                        }
                                        if (r5.isInterface() && !next4.isPublic() && !next4.isPrivate()) {
                                            C8376.m13333(next4, "Methods declared by an interface must be public or private ");
                                            return typeDescription3;
                                        }
                                        HashSet hashSet10 = new HashSet();
                                        for (TypeDescription.Generic generic3 : next4.getTypeVariables()) {
                                            HashSet hashSet11 = hashSet9;
                                            String symbol2 = generic3.getSymbol();
                                            if (!hashSet10.add(symbol2)) {
                                                C6385.m11446(str5, generic3, str6, next4);
                                                return typeDescription3;
                                            }
                                            if (!isValidIdentifier(symbol2)) {
                                                C6385.m11446(str4, generic3, str6, next4);
                                                return typeDescription3;
                                            }
                                            if (!TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.ofFormalTypeVariable(generic3)) {
                                                C6385.m11446(str3, generic3, str6, next4);
                                                return typeDescription3;
                                            }
                                            HashSet hashSet12 = new HashSet();
                                            boolean z2 = false;
                                            for (TypeDescription.Generic generic4 : generic3.getUpperBounds()) {
                                                String str14 = str;
                                                if (!((Boolean) generic4.accept(TypeDescription.Generic.Visitor.Validator.TYPE_VARIABLE)).booleanValue()) {
                                                    C6385.m11447(str10, generic4, obj2, generic3, str14, next4);
                                                    return typeDescription3;
                                                }
                                                if (!((Boolean) generic4.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                    C6385.m11447("Illegal type annotations on bound ", generic4, obj2, generic3, str14, this);
                                                    return typeDescription3;
                                                }
                                                if (!hashSet12.add(generic4)) {
                                                    C6385.m11447("Duplicate bound ", generic4, obj2, generic3, str14, next4);
                                                    return typeDescription3;
                                                }
                                                if (z2 && (generic4.getSort().isTypeVariable() || !generic4.isInterface())) {
                                                    C6385.m11447(str13, generic4, obj2, generic3, str14, next4);
                                                    return typeDescription3;
                                                }
                                                str = str14;
                                                z2 = true;
                                                r5 = this;
                                            }
                                            Object obj3 = obj2;
                                            HashSet hashSet13 = hashSet10;
                                            String str15 = str4;
                                            String str16 = str;
                                            String str17 = str5;
                                            MethodDescription.InDefinedShape inDefinedShape = next4;
                                            Default r7 = r5;
                                            String str18 = str3;
                                            String str19 = str11;
                                            if (!z2) {
                                                C3141.m4913("Type variable ", generic3, str16, inDefinedShape, " does not define at least one bound");
                                                return typeDescription3;
                                            }
                                            obj2 = obj3;
                                            hashSet10 = hashSet13;
                                            str3 = str18;
                                            r5 = r7;
                                            next4 = inDefinedShape;
                                            str11 = str19;
                                            str5 = str17;
                                            str = str16;
                                            str4 = str15;
                                            hashSet9 = hashSet11;
                                        }
                                        HashSet hashSet14 = hashSet9;
                                        String str20 = str11;
                                        String str21 = str4;
                                        Object obj4 = obj2;
                                        String str22 = str;
                                        String str23 = str5;
                                        MethodDescription.InDefinedShape inDefinedShape2 = next4;
                                        Default r72 = r5;
                                        String str24 = str3;
                                        TypeDescription.Generic returnType = inDefinedShape2.getReturnType();
                                        if (inDefinedShape2.isTypeInitializer()) {
                                            C8376.m13333(r72, "Illegal explicit declaration of a type initializer by ");
                                            return typeDescription3;
                                        }
                                        if (inDefinedShape2.isConstructor()) {
                                            if (!returnType.represents(Void.TYPE)) {
                                                C8376.m13333(inDefinedShape2, "A constructor must return void ");
                                                return typeDescription3;
                                            }
                                            if (!returnType.getDeclaredAnnotations().isEmpty()) {
                                                C8376.m13333(inDefinedShape2, "The void non-type must not be annotated for ");
                                                return typeDescription3;
                                            }
                                        } else {
                                            if (!isValidMethodIdentifier(inDefinedShape2.getInternalName())) {
                                                C6385.m11446("Illegal method name ", returnType, str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                            if (!((Boolean) returnType.accept(TypeDescription.Generic.Visitor.Validator.METHOD_RETURN)).booleanValue()) {
                                                C6385.m11446("Illegal return type ", returnType, str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                            if (!((Boolean) returnType.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                C6385.m11446("Illegal type annotations on return type ", returnType, str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                            if (!inDefinedShape2.isSynthetic() && !inDefinedShape2.getReturnType().asErasure().isVisibleTo(r72)) {
                                                C1123.m1407("Invisible return type ", inDefinedShape2.getReturnType(), str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                        }
                                        HashSet hashSet15 = new HashSet();
                                        for (ParameterDescription.InDefinedShape inDefinedShape3 : inDefinedShape2.getParameters()) {
                                            String str25 = str21;
                                            TypeDescription.Generic type = inDefinedShape3.getType();
                                            String str26 = str6;
                                            if (!((Boolean) type.accept(TypeDescription.Generic.Visitor.Validator.METHOD_PARAMETER)).booleanValue()) {
                                                C6385.m11446("Illegal parameter type of ", inDefinedShape3, str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                            if (!((Boolean) type.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                C6385.m11446("Illegal type annotations on parameter ", inDefinedShape3, str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                            if (!inDefinedShape2.isSynthetic() && !type.asErasure().isVisibleTo(r72)) {
                                                C6385.m11446("Invisible parameter type of ", inDefinedShape3, str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                            if (inDefinedShape3.isNamed()) {
                                                String name = inDefinedShape3.getName();
                                                if (!hashSet15.add(name)) {
                                                    C6385.m11446("Duplicate parameter name of ", inDefinedShape3, str22, inDefinedShape2);
                                                    return typeDescription3;
                                                }
                                                if (!isValidUnqualifiedNameIdentifier(name)) {
                                                    C6385.m11446("Illegal parameter name of ", inDefinedShape3, str22, inDefinedShape2);
                                                    return typeDescription3;
                                                }
                                            }
                                            if (inDefinedShape3.hasModifiers() && (inDefinedShape3.getModifiers() & (-36881)) != 0) {
                                                C6385.m11446("Illegal modifiers of ", inDefinedShape3, str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                            HashSet hashSet16 = new HashSet();
                                            Iterator<AnnotationDescription> it8 = inDefinedShape3.getDeclaredAnnotations().iterator();
                                            while (it8.hasNext()) {
                                                Iterator<AnnotationDescription> it9 = it8;
                                                AnnotationDescription next5 = it8.next();
                                                String str27 = str23;
                                                if (!next5.isSupportedOn(ElementType.PARAMETER)) {
                                                    C6385.m11446("Cannot add ", next5, " on ", inDefinedShape3);
                                                    return typeDescription3;
                                                }
                                                if (!hashSet16.add(next5.getAnnotationType())) {
                                                    C6385.m11447(str20, next5, obj4, inDefinedShape3, str22, inDefinedShape2);
                                                    return typeDescription3;
                                                }
                                                str23 = str27;
                                                it8 = it9;
                                            }
                                            str21 = str25;
                                            str6 = str26;
                                        }
                                        String str28 = str21;
                                        String str29 = str6;
                                        String str30 = str23;
                                        for (TypeDescription.Generic generic5 : inDefinedShape2.getExceptionTypes()) {
                                            if (!((Boolean) generic5.accept(TypeDescription.Generic.Visitor.Validator.EXCEPTION)).booleanValue()) {
                                                C6385.m11446("Illegal exception type ", generic5, str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                            if (!((Boolean) generic5.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                C6385.m11446("Illegal type annotations on ", generic5, str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                            if (!inDefinedShape2.isSynthetic() && !generic5.asErasure().isVisibleTo(r72)) {
                                                C6385.m11446("Invisible exception type ", generic5, str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                        }
                                        HashSet hashSet17 = new HashSet();
                                        for (AnnotationDescription annotationDescription : inDefinedShape2.getDeclaredAnnotations()) {
                                            if (!annotationDescription.isSupportedOn(inDefinedShape2.isMethod() ? ElementType.METHOD : ElementType.CONSTRUCTOR)) {
                                                C6385.m11446("Cannot add ", annotationDescription, " on ", inDefinedShape2);
                                                return typeDescription3;
                                            }
                                            if (!hashSet17.add(annotationDescription.getAnnotationType())) {
                                                C6385.m11446(str20, annotationDescription, str22, inDefinedShape2);
                                                return typeDescription3;
                                            }
                                        }
                                        AnnotationValue<?, ?> defaultValue = inDefinedShape2.getDefaultValue();
                                        if (defaultValue != null && !inDefinedShape2.isDefaultValue(defaultValue)) {
                                            C6385.m11446("Illegal default value ", defaultValue, "for ", inDefinedShape2);
                                            return typeDescription3;
                                        }
                                        TypeDescription.Generic receiverType = inDefinedShape2.getReceiverType();
                                        if (receiverType != null && !((Boolean) receiverType.accept(TypeDescription.Generic.Visitor.Validator.RECEIVER)).booleanValue()) {
                                            C6385.m11446("Illegal receiver type ", receiverType, str22, inDefinedShape2);
                                            return typeDescription3;
                                        }
                                        if (inDefinedShape2.isStatic()) {
                                            if (receiverType != null) {
                                                C6385.m11446("Static method ", inDefinedShape2, " defines a non-null receiver ", receiverType);
                                                return typeDescription3;
                                            }
                                        } else {
                                            if (inDefinedShape2.isConstructor()) {
                                                if (receiverType != null) {
                                                    if (receiverType.asErasure().equals(typeDescription7 == null ? r72 : typeDescription7)) {
                                                    }
                                                }
                                                C6385.m11446("Constructor ", inDefinedShape2, " defines an illegal receiver ", receiverType);
                                                return typeDescription3;
                                            }
                                            if (receiverType == null || !r72.equals(receiverType.asErasure())) {
                                                C6385.m11446("Method ", inDefinedShape2, " defines an illegal receiver ", receiverType);
                                                return typeDescription3;
                                            }
                                        }
                                        str3 = str24;
                                        str11 = str20;
                                        str = str22;
                                        str4 = str28;
                                        hashSet9 = hashSet14;
                                        str5 = str30;
                                        r5 = r72;
                                        obj2 = obj4;
                                        str6 = str29;
                                    }
                                    return r5;
                                }
                                FieldDescription.InDefinedShape next6 = it6.next();
                                String name2 = next6.getName();
                                Object obj5 = obj;
                                if (!hashSet8.add(next6.asSignatureToken())) {
                                    C8376.m13333(next6, "Duplicate field definition for ");
                                    return typeDescription3;
                                }
                                if (!isValidUnqualifiedNameIdentifier(name2)) {
                                    C8376.m13333(next6, "Illegal field name for ");
                                    return typeDescription3;
                                }
                                if ((next6.getModifiers() & (-151776)) != 0) {
                                    C4515.m8485(next6.getModifiers(), " for ", next6, "Illegal field modifiers ");
                                    return typeDescription3;
                                }
                                TypeDescription.Generic type2 = next6.getType();
                                HashSet hashSet18 = hashSet8;
                                if (!((Boolean) type2.accept(TypeDescription.Generic.Visitor.Validator.FIELD)).booleanValue()) {
                                    C6385.m11446("Illegal field type ", type2, " for ", next6);
                                    return typeDescription3;
                                }
                                if (!((Boolean) type2.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                    C6385.m11446("Illegal type annotations on ", type2, " for ", r5);
                                    return typeDescription3;
                                }
                                if (!next6.isSynthetic() && !type2.asErasure().isVisibleTo(r5)) {
                                    C1123.m1407("Invisible field type ", next6.getType(), " for ", next6);
                                    return typeDescription3;
                                }
                                HashSet hashSet19 = new HashSet();
                                Iterator<AnnotationDescription> it10 = next6.getDeclaredAnnotations().iterator();
                                while (it10.hasNext()) {
                                    AnnotationDescription next7 = it10.next();
                                    Iterator<AnnotationDescription> it11 = it10;
                                    if (!next7.isSupportedOn(ElementType.FIELD)) {
                                        C6385.m11446("Cannot add ", next7, " on ", next6);
                                        return typeDescription3;
                                    }
                                    if (!hashSet19.add(next7.getAnnotationType())) {
                                        C6385.m11446("Duplicate annotation ", next7, " for ", next6);
                                        return typeDescription3;
                                    }
                                    it10 = it11;
                                }
                                it5 = it6;
                                hashSet8 = hashSet18;
                                obj = obj5;
                            }
                        }
                    }
                }
            }
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnnotations(List<? extends AnnotationDescription> list) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, CompoundList.m477of((List) this.annotationDescriptions, (List) list), this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnonymousClass(boolean z) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, z, false, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAuxiliaryField(FieldDescription.Token token, Object obj) {
            HashMap map = new HashMap(this.auxiliaryFields);
            Object objPut = map.put(token.getName(), obj);
            if (objPut == null) {
                return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, CompoundList.m476of(this.fieldTokens, token.accept((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m304of(this))), map, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, new LoadedTypeInitializer.Compound(this.loadedTypeInitializer, new LoadedTypeInitializer.ForStaticField(token.getName(), obj)), this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
            }
            if (objPut == obj) {
                return this;
            }
            throw new IllegalStateException("Field " + token.getName() + " for " + this + " already mapped to " + objPut + " and not " + obj);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaredTypes(TypeList typeList) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, CompoundList.m477of((List) this.declaredTypes, (List) typeList), this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaringType(@MaybeNull TypeDescription typeDescription) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, typeDescription, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingMethod(MethodDescription.InDefinedShape inDefinedShape) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, inDefinedShape, inDefinedShape.getDeclaringType(), this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingType(@MaybeNull TypeDescription typeDescription) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, MethodDescription.UNDEFINED, typeDescription, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withField(FieldDescription.Token token) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, CompoundList.m476of(this.fieldTokens, token.accept((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m304of(this))), this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(LoadedTypeInitializer loadedTypeInitializer) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, new LoadedTypeInitializer.Compound(this.loadedTypeInitializer, loadedTypeInitializer), this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInterfaces(TypeList.Generic generic) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, CompoundList.m477of((List) this.interfaceTypes, (List) generic.accept(TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m304of(this))), this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withLocalClass(boolean z) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, false, z, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withMethod(MethodDescription.Token token) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, CompoundList.m476of(this.methodTokens, token.accept((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m304of(this))), this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withModifiers(int i) {
            return new Default(this.name, i, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withModuleDescription(@MaybeNull ModuleDescription moduleDescription) {
            return new Default(this.name, this.modifiers, moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public WithFlexibleName withName(String str) {
            return new Default(str, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestHost(TypeDescription typeDescription) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, typeDescription.equals(this) ? TargetType.DESCRIPTION : typeDescription, Collections.EMPTY_LIST);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestMembers(TypeList typeList) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, TargetType.DESCRIPTION, CompoundList.m477of((List) this.nestMembers, (List) typeList));
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withPermittedSubclasses(@MaybeNull TypeList typeList) {
            List<? extends TypeDescription> list;
            List listM477of = typeList;
            String str = this.name;
            int i = this.modifiers;
            ModuleDescription moduleDescription = this.moduleDescription;
            List<? extends TypeVariableToken> list2 = this.typeVariables;
            TypeDescription.Generic generic = this.superClass;
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
            if (listM477of != null && (list = this.permittedSubclasses) != null) {
                listM477of = CompoundList.m477of((List) list, listM477of);
            }
            return new Default(str, i, moduleDescription, list2, generic, list3, list4, map, list5, list6, list7, typeInitializer, loadedTypeInitializer, typeDescription, inDefinedShape, typeDescription2, list8, listM477of, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withRecord(boolean z) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, z ? this.recordComponentTokens : Collections.EMPTY_LIST, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, z, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withRecordComponent(RecordComponentDescription.Token token) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, CompoundList.m476of(this.recordComponentTokens, token.accept((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m304of(this))), this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, true, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withTypeVariable(TypeVariableToken typeVariableToken) {
            return new Default(this.name, this.modifiers, this.moduleDescription, CompoundList.m476of(this.typeVariables, typeVariableToken.accept((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.m304of(this))), this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
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
            return new Default(this.name, this.modifiers, this.moduleDescription, arrayList, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }

        @Override // net.bytebuddy.description.DeclaredByType
        @MaybeNull
        public TypeDescription getDeclaringType() {
            return this.declaringType;
        }

        /* JADX INFO: renamed from: of */
        public static InstrumentedType m338of(String str, TypeDescription.Generic generic, int i) {
            return Factory.Default.MODIFIABLE.subclass(str, i, generic);
        }

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

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ InstrumentedType withAnnotations(List list) {
            return withAnnotations((List<? extends AnnotationDescription>) list);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(ByteCodeAppender byteCodeAppender) {
            return new Default(this.name, this.modifiers, this.moduleDescription, this.typeVariables, this.superClass, this.interfaceTypes, this.fieldTokens, this.auxiliaryFields, this.methodTokens, this.recordComponentTokens, this.annotationDescriptions, this.typeInitializer.expandWith(byteCodeAppender), this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.permittedSubclasses, this.anonymousClass, this.localClass, this.record, this.nestHost, this.nestMembers);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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

        @Override // net.bytebuddy.description.DeclaredByType
        @MaybeNull
        public TypeDescription getDeclaringType() {
            return this.typeDescription.getDeclaringType();
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

        @Override // net.bytebuddy.description.type.TypeDescription
        @MaybeNull
        public ModuleDescription toModuleDescription() {
            return this.typeDescription.toModuleDescription();
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public TypeDescription validated() {
            return this.typeDescription;
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnnotations(List<? extends AnnotationDescription> list) {
            throw new IllegalStateException("Cannot add annotation to frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnonymousClass(boolean z) {
            throw new IllegalStateException("Cannot define anonymous class state for frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAuxiliaryField(FieldDescription.Token token, Object obj) {
            throw new IllegalStateException("Cannot define auxiliary field for frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaredTypes(TypeList typeList) {
            throw new IllegalStateException("Cannot add declared types to frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaringType(@MaybeNull TypeDescription typeDescription) {
            throw new IllegalStateException("Cannot add declaring type to frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingMethod(MethodDescription.InDefinedShape inDefinedShape) {
            throw new IllegalStateException("Cannot set enclosing method of frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingType(@MaybeNull TypeDescription typeDescription) {
            throw new IllegalStateException("Cannot set enclosing type of frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withField(FieldDescription.Token token) {
            throw new IllegalStateException("Cannot define field for frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(LoadedTypeInitializer loadedTypeInitializer) {
            return new Frozen(this.typeDescription, new LoadedTypeInitializer.Compound(this.loadedTypeInitializer, loadedTypeInitializer));
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInterfaces(TypeList.Generic generic) {
            throw new IllegalStateException("Cannot add interfaces for frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withLocalClass(boolean z) {
            throw new IllegalStateException("Cannot define local class state for frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withMethod(MethodDescription.Token token) {
            throw new IllegalStateException("Cannot define method for frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withModifiers(int i) {
            throw new IllegalStateException("Cannot change modifiers for frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withModuleDescription(@MaybeNull ModuleDescription moduleDescription) {
            throw new IllegalStateException("Cannot define module meta data for frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public WithFlexibleName withName(String str) {
            throw new IllegalStateException("Cannot change name of frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestHost(TypeDescription typeDescription) {
            throw new IllegalStateException("Cannot set nest host of frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestMembers(TypeList typeList) {
            throw new IllegalStateException("Cannot add nest members to frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withPermittedSubclasses(@MaybeNull TypeList typeList) {
            throw new IllegalStateException("Cannot add permitted subclasses to frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withRecord(boolean z) {
            throw new IllegalStateException("Cannot define record state for frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withRecordComponent(RecordComponentDescription.Token token) {
            throw new IllegalStateException("Cannot define record component for frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withTypeVariable(TypeVariableToken typeVariableToken) {
            throw new IllegalStateException("Cannot define type variable for frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public WithFlexibleName withTypeVariables(ElementMatcher<? super TypeDescription.Generic> elementMatcher, Transformer<TypeVariableToken> transformer) {
            throw new IllegalStateException("Cannot add type variables of frozen type: " + this.typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ InstrumentedType withAnnotations(List list) {
            return withAnnotations((List<? extends AnnotationDescription>) list);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(ByteCodeAppender byteCodeAppender) {
            throw new IllegalStateException("Cannot add initializer to frozen type: " + this.typeDescription);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Prepareable {
        InstrumentedType prepare(InstrumentedType instrumentedType);

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum NoOp implements Prepareable {
            INSTANCE;

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }
    }
}
