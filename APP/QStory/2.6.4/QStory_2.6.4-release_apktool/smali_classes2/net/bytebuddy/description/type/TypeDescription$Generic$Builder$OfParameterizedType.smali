.class public Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;
.super Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OfParameterizedType"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final ownerType:Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final parameterTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;"
        }
    .end annotation
.end field

.field private final rawType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V
    .locals 1
    .param p2    # Lnet/bytebuddy/description/type/TypeDescription$Generic;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)V"
        }
    .end annotation

    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .param p2    # Lnet/bytebuddy/description/type/TypeDescription$Generic;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p4}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;-><init>(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->rawType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->ownerType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->parameterTypes:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public doAnnotate(Ljava/util/List;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;
    .locals 4
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
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->rawType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->ownerType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->parameterTypes:Ljava/util/List;

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;->annotations:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {p0, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, v1, v2, v3, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public doBuild()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType$Latent;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->rawType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->ownerType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->parameterTypes:Ljava/util/List;

    .line 8
    .line 9
    new-instance v4, Lnet/bytebuddy/description/annotation/AnnotationSource$Explicit;

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;->annotations:Ljava/util/List;

    .line 12
    .line 13
    invoke-direct {v4, p0}, Lnet/bytebuddy/description/annotation/AnnotationSource$Explicit;-><init>(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v4}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationSource;)V

    .line 17
    .line 18
    .line 19
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
    iget-object v2, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->rawType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->rawType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->ownerType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->ownerType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 43
    .line 44
    if-eqz v3, :cond_5

    .line 45
    .line 46
    if-eqz v2, :cond_6

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_7

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    if-eqz v2, :cond_7

    .line 56
    .line 57
    :cond_6
    return v1

    .line 58
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->parameterTypes:Ljava/util/List;

    .line 59
    .line 60
    iget-object p1, p1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->parameterTypes:Ljava/util/List;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_8

    .line 67
    .line 68
    return v1

    .line 69
    :cond_8
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    mul-int/2addr v0, v1

    .line 8
    iget-object v2, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->rawType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v2, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->ownerType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v0, v2

    .line 23
    :cond_0
    mul-int/2addr v0, v1

    .line 24
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder$OfParameterizedType;->parameterTypes:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v0

    .line 31
    return p0
.end method
