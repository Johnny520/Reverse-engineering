.class public Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;
.super Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationRetention;",
            "Lnet/bytebuddy/implementation/Implementation$Context$Factory;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeValidation;",
            "Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;",
            "Lnet/bytebuddy/utility/AsmClassReader$Factory;",
            "Lnet/bytebuddy/utility/AsmClassWriter$Factory;",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v2, Lnet/bytebuddy/dynamic/scaffold/FieldRegistry$Default;

    .line 2
    .line 3
    invoke-direct {v2}, Lnet/bytebuddy/dynamic/scaffold/FieldRegistry$Default;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v3, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default;

    .line 7
    .line 8
    invoke-direct {v3}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v4, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;

    .line 12
    .line 13
    invoke-direct {v4}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p5 .. p5}, Lnet/bytebuddy/implementation/attribute/AnnotationRetention;->isEnabled()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v0, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$ForInstrumentedType$Differentiating;

    .line 23
    .line 24
    move-object/from16 v1, p13

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$ForInstrumentedType$Differentiating;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    move-object v5, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move-object/from16 v1, p13

    .line 32
    .line 33
    sget-object v0, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$ForInstrumentedType;->INSTANCE:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender$ForInstrumentedType;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    sget-object v6, Lnet/bytebuddy/asm/AsmVisitorWrapper$NoOp;->INSTANCE:Lnet/bytebuddy/asm/AsmVisitorWrapper$NoOp;

    .line 37
    .line 38
    sget-object v18, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 39
    .line 40
    move-object/from16 v0, p0

    .line 41
    .line 42
    move-object/from16 v7, p2

    .line 43
    .line 44
    move-object/from16 v8, p3

    .line 45
    .line 46
    move-object/from16 v9, p4

    .line 47
    .line 48
    move-object/from16 v10, p5

    .line 49
    .line 50
    move-object/from16 v11, p6

    .line 51
    .line 52
    move-object/from16 v12, p7

    .line 53
    .line 54
    move-object/from16 v13, p8

    .line 55
    .line 56
    move-object/from16 v14, p9

    .line 57
    .line 58
    move-object/from16 v15, p10

    .line 59
    .line 60
    move-object/from16 v16, p11

    .line 61
    .line 62
    move-object/from16 v17, p12

    .line 63
    .line 64
    move-object/from16 v20, p14

    .line 65
    .line 66
    move-object/from16 v21, p15

    .line 67
    .line 68
    move-object/from16 v19, v1

    .line 69
    .line 70
    move-object/from16 v1, p1

    .line 71
    .line 72
    invoke-direct/range {v0 .. v21}, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;-><init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;",
            "Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;",
            "Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;",
            "Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationRetention;",
            "Lnet/bytebuddy/implementation/Implementation$Context$Factory;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeValidation;",
            "Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;",
            "Lnet/bytebuddy/utility/AsmClassReader$Factory;",
            "Lnet/bytebuddy/utility/AsmClassWriter$Factory;",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;",
            ")V"
        }
    .end annotation

    .line 76
    invoke-direct/range {p0 .. p20}, Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder;-><init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    move-object/from16 p1, p21

    .line 77
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;->methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;->methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;->methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;->methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method

.method public materialize(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;",
            "Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;",
            "Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;",
            "Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationRetention;",
            "Lnet/bytebuddy/implementation/Implementation$Context$Factory;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeValidation;",
            "Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;",
            "Lnet/bytebuddy/utility/AsmClassReader$Factory;",
            "Lnet/bytebuddy/utility/AsmClassWriter$Factory;",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
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
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;

    .line 4
    .line 5
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder;->originalType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 8
    .line 9
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;->methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    .line 10
    .line 11
    move-object/from16 v4, p4

    .line 12
    .line 13
    move-object/from16 v5, p5

    .line 14
    .line 15
    move-object/from16 v6, p6

    .line 16
    .line 17
    move-object/from16 v7, p7

    .line 18
    .line 19
    move-object/from16 v8, p8

    .line 20
    .line 21
    move-object/from16 v9, p9

    .line 22
    .line 23
    move-object/from16 v10, p10

    .line 24
    .line 25
    move-object/from16 v11, p11

    .line 26
    .line 27
    move-object/from16 v12, p12

    .line 28
    .line 29
    move-object/from16 v13, p13

    .line 30
    .line 31
    move-object/from16 v14, p14

    .line 32
    .line 33
    move-object/from16 v15, p15

    .line 34
    .line 35
    move-object/from16 v16, p16

    .line 36
    .line 37
    move-object/from16 v17, p17

    .line 38
    .line 39
    move-object/from16 v18, p18

    .line 40
    .line 41
    move-object/from16 v21, v0

    .line 42
    .line 43
    move-object v0, v1

    .line 44
    move-object/from16 v19, v2

    .line 45
    .line 46
    move-object/from16 v20, v3

    .line 47
    .line 48
    move-object/from16 v1, p1

    .line 49
    .line 50
    move-object/from16 v2, p2

    .line 51
    .line 52
    move-object/from16 v3, p3

    .line 53
    .line 54
    invoke-direct/range {v0 .. v21}, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;-><init>(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public toTypeWriter(Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter;
    .locals 25
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
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->methodRegistry:Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;

    .line 4
    .line 5
    iget-object v2, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->instrumentedType:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 6
    .line 7
    iget-object v3, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 8
    .line 9
    iget-object v4, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 10
    .line 11
    iget-object v5, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 12
    .line 13
    iget-object v6, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 14
    .line 15
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder;->originalType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    invoke-static {v6, v7}, Lnet/bytebuddy/dynamic/scaffold/inline/InliningImplementationMatcher;->of(Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/LatentMatcher;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/matcher/LatentMatcher;)Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Prepared;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    new-instance v1, Ljava/util/HashSet;

    .line 26
    .line 27
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder;->originalType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 28
    .line 29
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder;->originalType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 34
    .line 35
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v4, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->instrumentedType:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 40
    .line 41
    invoke-interface {v2, v3, v4}, Lnet/bytebuddy/description/method/MethodList;->asSignatureTokenList(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v7}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Prepared;->getInstrumentedMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodList;->asSignatureTokenList()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    invoke-interface {v7}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Prepared;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget-object v3, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 64
    .line 65
    iget-object v4, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 66
    .line 67
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilder;->methodNameTransformer:Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    .line 68
    .line 69
    invoke-static {v2, v1, v3, v4, v5}, Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Default;->make(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Set;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;)Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver;

    .line 70
    .line 71
    .line 72
    move-result-object v24

    .line 73
    iget-object v8, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->auxiliaryTypes:Ljava/util/List;

    .line 74
    .line 75
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->fieldRegistry:Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;

    .line 76
    .line 77
    invoke-interface {v7}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Prepared;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;->compile(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/FieldRegistry$Compiled;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->recordComponentRegistry:Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;

    .line 86
    .line 87
    invoke-interface {v7}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Prepared;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;->compile(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Compiled;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    iget-object v11, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 96
    .line 97
    iget-object v12, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 98
    .line 99
    iget-object v13, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 100
    .line 101
    iget-object v14, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 102
    .line 103
    iget-object v15, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 104
    .line 105
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 106
    .line 107
    iget-object v2, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 108
    .line 109
    iget-object v3, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 110
    .line 111
    iget-object v4, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 112
    .line 113
    iget-object v5, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 114
    .line 115
    iget-object v6, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->instrumentedType:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 116
    .line 117
    move-object/from16 v16, v1

    .line 118
    .line 119
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->auxiliaryTypes:Ljava/util/List;

    .line 120
    .line 121
    move-object/from16 v17, v2

    .line 122
    .line 123
    move-object/from16 v2, p1

    .line 124
    .line 125
    invoke-static {v6, v1, v2}, Lnet/bytebuddy/pool/TypePool$Explicit;->wrap(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/pool/TypePool;

    .line 126
    .line 127
    .line 128
    move-result-object v21

    .line 129
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder;->originalType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 130
    .line 131
    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/inline/AbstractInliningDynamicTypeBuilder;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 132
    .line 133
    move-object/from16 v23, v0

    .line 134
    .line 135
    move-object/from16 v22, v1

    .line 136
    .line 137
    move-object/from16 v18, v3

    .line 138
    .line 139
    move-object/from16 v19, v4

    .line 140
    .line 141
    move-object/from16 v20, v5

    .line 142
    .line 143
    invoke-static/range {v7 .. v24}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->forRebasing(Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Prepared;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$RecordComponentPool;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0
.end method
