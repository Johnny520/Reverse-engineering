.class public Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;
.super Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition$Optional$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RecordComponentDefinitionAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition$Optional$AbstractBase<",
        "TU;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final recordComponentAttributeAppenderFactory:Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

.field final synthetic this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

.field private final token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

.field private final transformer:Lnet/bytebuddy/dynamic/Transformer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/dynamic/Transformer<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)V
    .locals 2

    .line 13
    sget-object v0, Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$ForInstrumentedRecordComponent;->INSTANCE:Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$ForInstrumentedRecordComponent;

    .line 14
    invoke-static {}, Lnet/bytebuddy/dynamic/Transformer$NoOp;->make()Lnet/bytebuddy/dynamic/Transformer;

    move-result-object v1

    .line 15
    invoke-direct {p0, p1, v0, v1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;",
            "Lnet/bytebuddy/dynamic/Transformer<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription;",
            ">;",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$Token;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition$Optional$AbstractBase;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->recordComponentAttributeAppenderFactory:Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->transformer:Lnet/bytebuddy/dynamic/Transformer;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public annotateRecordComponent(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition$Optional;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition$Optional<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->recordComponentAttributeAppenderFactory:Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->transformer:Lnet/bytebuddy/dynamic/Transformer;

    .line 8
    .line 9
    new-instance v4, Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 12
    .line 13
    invoke-virtual {v5}, Lnet/bytebuddy/description/type/RecordComponentDescription$Token;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    iget-object v6, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 18
    .line 19
    invoke-virtual {v6}, Lnet/bytebuddy/description/type/RecordComponentDescription$Token;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 24
    .line 25
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$Token;->getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v7, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v7, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v7}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v4, v5, v6, p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$Token;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1, v2, v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public attribute(Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;)Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition$Optional;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition$Optional<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory$Compound;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->recordComponentAttributeAppenderFactory:Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    new-array v4, v4, [Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    aput-object v3, v4, v5

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aput-object p1, v4, v3

    .line 17
    .line 18
    invoke-direct {v2, v4}, Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory$Compound;-><init>([Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->transformer:Lnet/bytebuddy/dynamic/Transformer;

    .line 22
    .line 23
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, p1, p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)V

    .line 26
    .line 27
    .line 28
    return-object v0
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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->recordComponentAttributeAppenderFactory:Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->recordComponentAttributeAppenderFactory:Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Lnet/bytebuddy/description/type/RecordComponentDescription$Token;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->transformer:Lnet/bytebuddy/dynamic/Transformer;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->transformer:Lnet/bytebuddy/dynamic/Transformer;

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 56
    .line 57
    iget-object p1, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

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
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->recordComponentAttributeAppenderFactory:Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 21
    .line 22
    invoke-virtual {v0}, Lnet/bytebuddy/description/type/RecordComponentDescription$Token;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->transformer:Lnet/bytebuddy/dynamic/Transformer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 39
    .line 40
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/2addr p0, v1

    .line 45
    return p0
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
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 4
    .line 5
    iget-object v2, v1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->instrumentedType:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 6
    .line 7
    iget-object v3, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 8
    .line 9
    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;->withRecordComponent(Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 14
    .line 15
    iget-object v4, v3, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->fieldRegistry:Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;

    .line 16
    .line 17
    move-object v5, v4

    .line 18
    iget-object v4, v3, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->methodRegistry:Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;

    .line 19
    .line 20
    iget-object v3, v3, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->recordComponentRegistry:Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;

    .line 21
    .line 22
    new-instance v6, Lnet/bytebuddy/matcher/LatentMatcher$ForRecordComponentToken;

    .line 23
    .line 24
    iget-object v7, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 25
    .line 26
    invoke-direct {v6, v7}, Lnet/bytebuddy/matcher/LatentMatcher$ForRecordComponentToken;-><init>(Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)V

    .line 27
    .line 28
    .line 29
    iget-object v7, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->recordComponentAttributeAppenderFactory:Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

    .line 30
    .line 31
    iget-object v8, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->transformer:Lnet/bytebuddy/dynamic/Transformer;

    .line 32
    .line 33
    invoke-interface {v3, v6, v7, v8}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;->prepend(Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;)Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v0, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 38
    .line 39
    iget-object v6, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 40
    .line 41
    iget-object v7, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 42
    .line 43
    iget-object v8, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 44
    .line 45
    iget-object v9, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 46
    .line 47
    iget-object v10, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 48
    .line 49
    iget-object v11, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 50
    .line 51
    iget-object v12, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 52
    .line 53
    iget-object v13, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 54
    .line 55
    iget-object v14, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 56
    .line 57
    iget-object v15, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 58
    .line 59
    move-object/from16 v16, v1

    .line 60
    .line 61
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 62
    .line 63
    move-object/from16 v17, v1

    .line 64
    .line 65
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 66
    .line 67
    move-object/from16 v18, v1

    .line 68
    .line 69
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 70
    .line 71
    iget-object v0, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->auxiliaryTypes:Ljava/util/List;

    .line 72
    .line 73
    move-object/from16 v19, v18

    .line 74
    .line 75
    move-object/from16 v18, v1

    .line 76
    .line 77
    move-object/from16 v1, v16

    .line 78
    .line 79
    move-object/from16 v16, v17

    .line 80
    .line 81
    move-object/from16 v17, v19

    .line 82
    .line 83
    move-object/from16 v19, v5

    .line 84
    .line 85
    move-object v5, v3

    .line 86
    move-object/from16 v3, v19

    .line 87
    .line 88
    move-object/from16 v19, v0

    .line 89
    .line 90
    invoke-virtual/range {v1 .. v19}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->materialize(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0
.end method

.method public transform(Lnet/bytebuddy/dynamic/Transformer;)Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition$Optional;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/Transformer<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$RecordComponentDefinition$Optional<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->recordComponentAttributeAppenderFactory:Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

    .line 6
    .line 7
    new-instance v3, Lnet/bytebuddy/dynamic/Transformer$Compound;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->transformer:Lnet/bytebuddy/dynamic/Transformer;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    new-array v5, v5, [Lnet/bytebuddy/dynamic/Transformer;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    aput-object v4, v5, v6

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    aput-object p1, v5, v4

    .line 19
    .line 20
    invoke-direct {v3, v5}, Lnet/bytebuddy/dynamic/Transformer$Compound;-><init>([Lnet/bytebuddy/dynamic/Transformer;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;->token:Lnet/bytebuddy/description/type/RecordComponentDescription$Token;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3, p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;Lnet/bytebuddy/description/type/RecordComponentDescription$Token;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
