.class Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;
.super Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForArray"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final componentTypeReference:Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;

.field private transient synthetic resolved:Lnet/bytebuddy/description/annotation/AnnotationValue;

.field private final typePool:Lnet/bytebuddy/pool/TypePool;

.field private final values:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/pool/TypePool;",
            "Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue;-><init>(Lnet/bytebuddy/pool/TypePool$1;)V

    .line 3
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 4
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->componentTypeReference:Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;

    .line 5
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;Ljava/util/List;Lnet/bytebuddy/pool/TypePool$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;-><init>(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public doResolve()Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "resolved"
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->resolved:Lnet/bytebuddy/description/annotation/AnnotationValue;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->componentTypeReference:Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;

    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;->resolve()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->typePool:Lnet/bytebuddy/pool/TypePool;

    invoke-interface {v2, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->isResolved()Z

    move-result v3

    if-nez v3, :cond_1

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType;

    invoke-direct {v1, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfEnumeration;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    const-class v3, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto/16 :goto_1

    :cond_2
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isAnnotation()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    const-class v3, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto/16 :goto_1

    :cond_3
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    const-class v3, Ljava/lang/Class;

    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    const-class v3, Lnet/bytebuddy/description/type/TypeDescription;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto/16 :goto_1

    :cond_4
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    const-class v3, Ljava/lang/String;

    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto/16 :goto_1

    :cond_5
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto/16 :goto_1

    :cond_6
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto/16 :goto_1

    :cond_7
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto/16 :goto_1

    :cond_8
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    sget-object v3, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto/16 :goto_1

    :cond_9
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto/16 :goto_1

    :cond_a
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto :goto_1

    :cond_b
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto :goto_1

    :cond_c
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_d

    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    goto :goto_1

    :cond_d
    sget-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->NONE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v0}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->isDefined()Z

    move-result v3

    if-nez v3, :cond_e

    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/description/annotation/AnnotationValue;

    invoke-interface {v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->getSort()Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    move-result-object v0

    goto :goto_0

    :cond_e
    new-instance v2, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForMismatchedType;

    sget-object v3, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->CURRENT:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    invoke-virtual {v3, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->toArrayErrorString(Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0, v1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForMismatchedType;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;Lnet/bytebuddy/pool/TypePool$1;)V

    move-object v1, v2

    :goto_1
    if-nez v1, :cond_f

    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->resolved:Lnet/bytebuddy/description/annotation/AnnotationValue;

    goto :goto_2

    :cond_f
    iput-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->resolved:Lnet/bytebuddy/description/annotation/AnnotationValue;

    :goto_2
    return-object v1
.end method

.method public getSort()Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;
    .locals 1

    sget-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->ARRAY:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    return-object v0
.end method
