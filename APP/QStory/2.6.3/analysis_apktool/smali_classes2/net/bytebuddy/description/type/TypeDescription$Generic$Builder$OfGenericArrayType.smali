.class public Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfGenericArrayType;
.super Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OfGenericArrayType"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final componentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfGenericArrayType;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;-><init>(Ljava/util/List;)V

    .line 8
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfGenericArrayType;->componentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    return-void
.end method


# virtual methods
.method public doAnnotate(Ljava/util/List;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfGenericArrayType;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfGenericArrayType;->componentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;->annotations:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {p0, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfGenericArrayType;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public doBuild()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$Latent;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfGenericArrayType;->componentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/description/annotation/AnnotationSource$Explicit;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;->annotations:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {v2, p0}, Lnet/bytebuddy/description/annotation/AnnotationSource$Explicit;-><init>(Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/annotation/AnnotationSource;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfGenericArrayType;->componentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfGenericArrayType;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfGenericArrayType;->componentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

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
    invoke-super {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfGenericArrayType;->componentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

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
