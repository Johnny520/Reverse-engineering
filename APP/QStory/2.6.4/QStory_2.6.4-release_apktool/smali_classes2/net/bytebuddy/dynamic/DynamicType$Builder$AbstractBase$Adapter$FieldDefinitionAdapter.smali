.class public Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;
.super Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FieldDefinitionAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter<",
        "TU;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

.field private final token:Lnet/bytebuddy/description/field/FieldDescription$Token;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Lnet/bytebuddy/description/field/FieldDescription$Token;)V
    .locals 6

    .line 1
    sget-object v2, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;->INSTANCE:Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/dynamic/Transformer$NoOp;->make()Lnet/bytebuddy/dynamic/Transformer;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget-object v4, Lnet/bytebuddy/description/field/FieldDescription;->NO_DEFAULT_VALUE:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v1, p1

    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;Ljava/lang/Object;Lnet/bytebuddy/description/field/FieldDescription$Token;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;Ljava/lang/Object;Lnet/bytebuddy/description/field/FieldDescription$Token;)V
    .locals 0
    .param p3    # Lnet/bytebuddy/dynamic/Transformer;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;",
            "Lnet/bytebuddy/dynamic/Transformer<",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;",
            "Ljava/lang/Object;",
            "Lnet/bytebuddy/description/field/FieldDescription$Token;",
            ")V"
        }
    .end annotation

    .line 16
    iput-object p1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 17
    invoke-direct {p0, p2, p3, p4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter;-><init>(Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;Ljava/lang/Object;)V

    .line 18
    iput-object p5, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    return-void
.end method


# virtual methods
.method public annotateField(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter;->fieldAttributeAppenderFactory:Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter;->transformer:Lnet/bytebuddy/dynamic/Transformer;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter;->defaultValue:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v5, Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 14
    .line 15
    invoke-virtual {v6}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    iget-object v7, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 20
    .line 21
    invoke-virtual {v7}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getModifiers()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    iget-object v8, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 26
    .line 27
    invoke-virtual {v8}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 32
    .line 33
    invoke-virtual {p0}, Lnet/bytebuddy/description/field/FieldDescription$Token;->getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance v9, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v9, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v9}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-direct {v5, v6, v7, v8, p0}, Lnet/bytebuddy/description/field/FieldDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;Ljava/lang/Object;Lnet/bytebuddy/description/field/FieldDescription$Token;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lnet/bytebuddy/description/field/FieldDescription$Token;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 8
    .line 9
    invoke-virtual {v1}, Lnet/bytebuddy/description/field/FieldDescription$Token;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 17
    .line 18
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v1

    .line 23
    return p0
.end method

.method public materialize(Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;Ljava/lang/Object;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional;
    .locals 6
    .param p3    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;",
            "Lnet/bytebuddy/dynamic/Transformer<",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional<",
            "TU;>;"
        }
    .end annotation

    .line 91
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;

    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    iget-object v5, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;Ljava/lang/Object;Lnet/bytebuddy/description/field/FieldDescription$Token;)V

    return-object v0
.end method

.method public materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TU;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 4
    .line 5
    iget-object v2, v1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->instrumentedType:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 6
    .line 7
    iget-object v3, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 8
    .line 9
    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;->withField(Lnet/bytebuddy/description/field/FieldDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 14
    .line 15
    iget-object v3, v3, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->fieldRegistry:Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;

    .line 16
    .line 17
    new-instance v4, Lnet/bytebuddy/matcher/LatentMatcher$ForFieldToken;

    .line 18
    .line 19
    iget-object v5, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->token:Lnet/bytebuddy/description/field/FieldDescription$Token;

    .line 20
    .line 21
    invoke-direct {v4, v5}, Lnet/bytebuddy/matcher/LatentMatcher$ForFieldToken;-><init>(Lnet/bytebuddy/description/field/FieldDescription$Token;)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter;->fieldAttributeAppenderFactory:Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;

    .line 25
    .line 26
    iget-object v6, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter;->defaultValue:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v7, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter;->transformer:Lnet/bytebuddy/dynamic/Transformer;

    .line 29
    .line 30
    invoke-interface {v3, v4, v5, v6, v7}, Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;->prepend(Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;Ljava/lang/Object;Lnet/bytebuddy/dynamic/Transformer;)Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v0, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 35
    .line 36
    iget-object v4, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->methodRegistry:Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;

    .line 37
    .line 38
    iget-object v5, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->recordComponentRegistry:Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;

    .line 39
    .line 40
    iget-object v6, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 41
    .line 42
    iget-object v7, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 43
    .line 44
    iget-object v8, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 45
    .line 46
    iget-object v9, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 47
    .line 48
    iget-object v10, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 49
    .line 50
    iget-object v11, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 51
    .line 52
    iget-object v12, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 53
    .line 54
    iget-object v13, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 55
    .line 56
    iget-object v14, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 57
    .line 58
    iget-object v15, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 59
    .line 60
    move-object/from16 v16, v1

    .line 61
    .line 62
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 63
    .line 64
    move-object/from16 v17, v1

    .line 65
    .line 66
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 67
    .line 68
    move-object/from16 v18, v1

    .line 69
    .line 70
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 71
    .line 72
    iget-object v0, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->auxiliaryTypes:Ljava/util/List;

    .line 73
    .line 74
    move-object/from16 v19, v18

    .line 75
    .line 76
    move-object/from16 v18, v1

    .line 77
    .line 78
    move-object/from16 v1, v16

    .line 79
    .line 80
    move-object/from16 v16, v17

    .line 81
    .line 82
    move-object/from16 v17, v19

    .line 83
    .line 84
    move-object/from16 v19, v0

    .line 85
    .line 86
    invoke-virtual/range {v1 .. v19}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->materialize(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0
.end method
