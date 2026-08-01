.class public Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;
.super Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$UsingTypeWriter;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$UsingTypeWriter<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

.field private final annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

.field private final asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

.field private final auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

.field private final auxiliaryTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;"
        }
    .end annotation
.end field

.field private final classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

.field private final classFileVersion:Lnet/bytebuddy/ClassFileVersion;

.field private final classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

.field private final classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

.field private final ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

.field private final typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

.field private final typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/dynamic/ClassFileLocator;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationRetention;",
            "Lnet/bytebuddy/implementation/Implementation$Context$Factory;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeValidation;",
            "Lnet/bytebuddy/utility/AsmClassReader$Factory;",
            "Lnet/bytebuddy/utility/AsmClassWriter$Factory;",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p5 .. p5}, Lnet/bytebuddy/implementation/attribute/AnnotationRetention;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$ForInstrumentedType$Differentiating;

    .line 8
    .line 9
    move-object/from16 v2, p1

    .line 10
    .line 11
    invoke-direct {v0, v2}, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$ForInstrumentedType$Differentiating;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    move-object v3, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    move-object/from16 v2, p1

    .line 17
    .line 18
    sget-object v0, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$ForInstrumentedType;->INSTANCE:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$ForInstrumentedType;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :goto_1
    sget-object v4, Lnet/bytebuddy/asm/AsmVisitorWrapper$NoOp;->INSTANCE:Lnet/bytebuddy/asm/AsmVisitorWrapper$NoOp;

    .line 22
    .line 23
    sget-object v15, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 24
    .line 25
    move-object/from16 v1, p0

    .line 26
    .line 27
    move-object/from16 v5, p2

    .line 28
    .line 29
    move-object/from16 v6, p3

    .line 30
    .line 31
    move-object/from16 v7, p4

    .line 32
    .line 33
    move-object/from16 v8, p5

    .line 34
    .line 35
    move-object/from16 v9, p6

    .line 36
    .line 37
    move-object/from16 v10, p7

    .line 38
    .line 39
    move-object/from16 v11, p8

    .line 40
    .line 41
    move-object/from16 v12, p9

    .line 42
    .line 43
    move-object/from16 v13, p10

    .line 44
    .line 45
    move-object/from16 v14, p11

    .line 46
    .line 47
    move-object/from16 v16, p12

    .line 48
    .line 49
    invoke-direct/range {v1 .. v16}, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;Lnet/bytebuddy/dynamic/ClassFileLocator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationRetention;",
            "Lnet/bytebuddy/implementation/Implementation$Context$Factory;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeValidation;",
            "Lnet/bytebuddy/utility/AsmClassReader$Factory;",
            "Lnet/bytebuddy/utility/AsmClassWriter$Factory;",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")V"
        }
    .end annotation

    .line 53
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$UsingTypeWriter;-><init>()V

    .line 54
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 55
    iput-object p2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 56
    iput-object p3, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 57
    iput-object p4, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 58
    iput-object p5, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 59
    iput-object p6, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 60
    iput-object p7, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 61
    iput-object p8, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 62
    iput-object p9, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 63
    iput-object p10, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 64
    iput-object p11, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 65
    iput-object p12, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 66
    iput-object p13, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 67
    iput-object p14, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypes:Ljava/util/List;

    .line 68
    iput-object p15, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    return-void
.end method


# virtual methods
.method public adjustModule(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change module information of decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public annotateType(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$Explicit;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$Explicit;-><init>(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->attribute(Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public attribute(Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    new-instance v2, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$Compound;

    .line 10
    .line 11
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    new-array v5, v5, [Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    aput-object v4, v5, v6

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    aput-object p1, v5, v4

    .line 21
    .line 22
    invoke-direct {v2, v5}, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$Compound;-><init>([Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;)V

    .line 23
    .line 24
    .line 25
    move-object v4, v3

    .line 26
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 27
    .line 28
    move-object v5, v4

    .line 29
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 30
    .line 31
    move-object v6, v5

    .line 32
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 33
    .line 34
    move-object v7, v6

    .line 35
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 36
    .line 37
    move-object v8, v7

    .line 38
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 39
    .line 40
    move-object v9, v8

    .line 41
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 42
    .line 43
    move-object v10, v9

    .line 44
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 45
    .line 46
    move-object v11, v10

    .line 47
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 48
    .line 49
    move-object v12, v11

    .line 50
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 51
    .line 52
    move-object v13, v12

    .line 53
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 54
    .line 55
    move-object v14, v13

    .line 56
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 57
    .line 58
    move-object v15, v14

    .line 59
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypes:Ljava/util/List;

    .line 60
    .line 61
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 62
    .line 63
    move-object/from16 v16, v15

    .line 64
    .line 65
    move-object v15, v0

    .line 66
    move-object/from16 v0, v16

    .line 67
    .line 68
    invoke-direct/range {v0 .. v15}, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method

.method public declaredTypes(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change type declaration of decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public defineConstructor(I)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot define constructor for decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public defineField(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDefinition;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string p3, "Cannot define field for decorated type: "

    .line 6
    .line 7
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public defineMethod(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDefinition;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string p3, "Cannot define method for decorated type: "

    .line 6
    .line 7
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public defineRecordComponent(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition$Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition$Optional<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v0, "Cannot define record component for decorated type: "

    .line 6
    .line 7
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 78
    .line 79
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Lnet/bytebuddy/ClassFileVersion;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 89
    .line 90
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_9

    .line 97
    .line 98
    return v1

    .line 99
    :cond_9
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 100
    .line 101
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_a

    .line 108
    .line 109
    return v1

    .line 110
    :cond_a
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 111
    .line 112
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_b

    .line 119
    .line 120
    return v1

    .line 121
    :cond_b
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 122
    .line 123
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 124
    .line 125
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-nez v2, :cond_c

    .line 130
    .line 131
    return v1

    .line 132
    :cond_c
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 133
    .line 134
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 135
    .line 136
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_d

    .line 141
    .line 142
    return v1

    .line 143
    :cond_d
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 144
    .line 145
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 146
    .line 147
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-nez v2, :cond_e

    .line 152
    .line 153
    return v1

    .line 154
    :cond_e
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 155
    .line 156
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 157
    .line 158
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-nez v2, :cond_f

    .line 163
    .line 164
    return v1

    .line 165
    :cond_f
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypes:Ljava/util/List;

    .line 166
    .line 167
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypes:Ljava/util/List;

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-nez v2, :cond_10

    .line 174
    .line 175
    return v1

    .line 176
    :cond_10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 177
    .line 178
    iget-object p1, p1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 179
    .line 180
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-nez p0, :cond_11

    .line 185
    .line 186
    return v1

    .line 187
    :cond_11
    return v0
.end method

.method public field(Lnet/bytebuddy/matcher/LatentMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Valuable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Valuable<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change field for decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 35
    .line 36
    invoke-virtual {v2}, Lnet/bytebuddy/ClassFileVersion;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/2addr v2, v1

    .line 58
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    add-int/2addr v0, v2

    .line 65
    mul-int/2addr v0, v1

    .line 66
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    add-int/2addr v2, v0

    .line 73
    mul-int/2addr v2, v1

    .line 74
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    add-int/2addr v0, v2

    .line 81
    mul-int/2addr v0, v1

    .line 82
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    add-int/2addr v2, v0

    .line 89
    mul-int/2addr v2, v1

    .line 90
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    add-int/2addr v0, v2

    .line 97
    mul-int/2addr v0, v1

    .line 98
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    add-int/2addr v2, v0

    .line 105
    mul-int/2addr v2, v1

    .line 106
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    add-int/2addr v0, v2

    .line 113
    mul-int/2addr v0, v1

    .line 114
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypes:Ljava/util/List;

    .line 115
    .line 116
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    add-int/2addr p0, v0

    .line 127
    return p0
.end method

.method public ignoreAlso(Lnet/bytebuddy/matcher/LatentMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    new-instance v13, Lnet/bytebuddy/matcher/LatentMatcher$Disjunction;

    .line 43
    .line 44
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 45
    .line 46
    move-object/from16 v16, v1

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    new-array v1, v1, [Lnet/bytebuddy/matcher/LatentMatcher;

    .line 50
    .line 51
    const/16 v17, 0x0

    .line 52
    .line 53
    aput-object v15, v1, v17

    .line 54
    .line 55
    const/4 v15, 0x1

    .line 56
    aput-object p1, v1, v15

    .line 57
    .line 58
    invoke-direct {v13, v1}, Lnet/bytebuddy/matcher/LatentMatcher$Disjunction;-><init>([Lnet/bytebuddy/matcher/LatentMatcher;)V

    .line 59
    .line 60
    .line 61
    move-object v1, v14

    .line 62
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypes:Ljava/util/List;

    .line 63
    .line 64
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 65
    .line 66
    move-object v0, v1

    .line 67
    move-object/from16 v1, v16

    .line 68
    .line 69
    invoke-direct/range {v0 .. v15}, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method

.method public implement(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot implement interface for decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public initializer(Lnet/bytebuddy/implementation/LoadedTypeInitializer;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/LoadedTypeInitializer;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 23
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot add initializer of decorated type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public initializer(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot add initializer of decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public innerTypeOf(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType$Builder$InnerTypeDefinition$ForType;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$InnerTypeDefinition$ForType<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change type declaration of decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public innerTypeOf(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/dynamic/DynamicType$Builder$InnerTypeDefinition;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$InnerTypeDefinition<",
            "TT;>;"
        }
    .end annotation

    .line 23
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot change type declaration of decorated type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public invokable(Lnet/bytebuddy/matcher/LatentMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot intercept method for decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public merge(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change modifiers of decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public modifiers(I)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change modifiers of decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public module(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v0, "Cannot change module information of decorated type: "

    .line 6
    .line 7
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change name of decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public nestHost(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change type declaration of decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public nestMembers(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change type declaration of decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public permittedSubclass(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change permitted subclasses of decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public recordComponent(Lnet/bytebuddy/matcher/LatentMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/RecordComponentDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change record component for decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public require(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 43
    .line 44
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypes:Ljava/util/List;

    .line 45
    .line 46
    move-object/from16 v16, v1

    .line 47
    .line 48
    new-instance v1, Ljava/util/ArrayList;

    .line 49
    .line 50
    move-object/from16 v17, v2

    .line 51
    .line 52
    move-object/from16 v2, p1

    .line 53
    .line 54
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v15, v1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 62
    .line 63
    move-object v0, v14

    .line 64
    move-object/from16 v2, v17

    .line 65
    .line 66
    move-object v14, v1

    .line 67
    move-object/from16 v1, v16

    .line 68
    .line 69
    invoke-direct/range {v0 .. v15}, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method

.method public suffix(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Cannot change name of decorated type: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public toTypeWriter()Lnet/bytebuddy/dynamic/scaffold/TypeWriter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter<",
            "TT;>;"
        }
    .end annotation

    .line 114
    sget-object v0, Lnet/bytebuddy/pool/TypePool$Empty;->INSTANCE:Lnet/bytebuddy/pool/TypePool$Empty;

    invoke-virtual {p0, v0}, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->toTypeWriter(Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter;

    move-result-object p0

    return-object p0
.end method

.method public toTypeWriter(Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/pool/TypePool;",
            ")",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 6
    .line 7
    move-object v3, v2

    .line 8
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypes:Ljava/util/List;

    .line 9
    .line 10
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 11
    .line 12
    invoke-interface {v4, v1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->compile(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-interface {v4}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph;->listNodes()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->asMethodList()Lnet/bytebuddy/description/method/MethodList;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 25
    .line 26
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 27
    .line 28
    invoke-interface {v5, v6}, Lnet/bytebuddy/matcher/LatentMatcher;->resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-static {v5}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-interface {v4, v5}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 41
    .line 42
    invoke-interface {v5}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isVirtual()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-static {v6}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-interface {v5, v6}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-static {v4, v5}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    move-object v5, v1

    .line 63
    move-object v1, v3

    .line 64
    move-object v3, v4

    .line 65
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 66
    .line 67
    move-object v6, v5

    .line 68
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 69
    .line 70
    move-object v7, v6

    .line 71
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 72
    .line 73
    move-object v8, v7

    .line 74
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 75
    .line 76
    move-object v9, v8

    .line 77
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 78
    .line 79
    move-object v10, v9

    .line 80
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 81
    .line 82
    move-object v11, v10

    .line 83
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 84
    .line 85
    move-object v12, v11

    .line 86
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 87
    .line 88
    move-object v13, v12

    .line 89
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 90
    .line 91
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 92
    .line 93
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypes:Ljava/util/List;

    .line 94
    .line 95
    move-object/from16 v16, v1

    .line 96
    .line 97
    move-object/from16 v1, p1

    .line 98
    .line 99
    invoke-static {v14, v15, v1}, Lnet/bytebuddy/pool/TypePool$Explicit;->wrap(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/pool/TypePool;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 104
    .line 105
    move-object v0, v13

    .line 106
    move-object v13, v1

    .line 107
    move-object/from16 v1, v16

    .line 108
    .line 109
    invoke-static/range {v0 .. v14}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->forDecoration(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ClassFileVersion;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0
.end method

.method public topLevelType()Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Cannot change type declaration of decorated type: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method

.method public transform(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/dynamic/Transformer;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;",
            "Lnet/bytebuddy/dynamic/Transformer<",
            "Lnet/bytebuddy/description/type/TypeVariableToken;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v0, "Cannot transform decorated type: "

    .line 6
    .line 7
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public typeVariable(Ljava/lang/String;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$TypeVariableDefinition;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$TypeVariableDefinition<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v0, "Cannot add type variable to decorated type: "

    .line 6
    .line 7
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public unsealed()Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Cannot unseal decorated type: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method

.method public visit(Lnet/bytebuddy/asm/AsmVisitorWrapper;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    new-instance v3, Lnet/bytebuddy/asm/AsmVisitorWrapper$Compound;

    .line 13
    .line 14
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 15
    .line 16
    const/4 v6, 0x2

    .line 17
    new-array v6, v6, [Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    aput-object v5, v6, v7

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    aput-object p1, v6, v5

    .line 24
    .line 25
    invoke-direct {v3, v6}, Lnet/bytebuddy/asm/AsmVisitorWrapper$Compound;-><init>([Lnet/bytebuddy/asm/AsmVisitorWrapper;)V

    .line 26
    .line 27
    .line 28
    move-object v5, v4

    .line 29
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 30
    .line 31
    move-object v6, v5

    .line 32
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 33
    .line 34
    move-object v7, v6

    .line 35
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 36
    .line 37
    move-object v8, v7

    .line 38
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 39
    .line 40
    move-object v9, v8

    .line 41
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 42
    .line 43
    move-object v10, v9

    .line 44
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 45
    .line 46
    move-object v11, v10

    .line 47
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 48
    .line 49
    move-object v12, v11

    .line 50
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 51
    .line 52
    move-object v13, v12

    .line 53
    iget-object v12, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 54
    .line 55
    move-object v14, v13

    .line 56
    iget-object v13, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 57
    .line 58
    move-object v15, v14

    .line 59
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->auxiliaryTypes:Ljava/util/List;

    .line 60
    .line 61
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 62
    .line 63
    move-object/from16 v16, v15

    .line 64
    .line 65
    move-object v15, v0

    .line 66
    move-object/from16 v0, v16

    .line 67
    .line 68
    invoke-direct/range {v0 .. v15}, Lnet/bytebuddy/dynamic/scaffold/inline/DecoratingDynamicTypeBuilder;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method
