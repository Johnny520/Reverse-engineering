.class public Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/pool/TypePool$Resolution;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$AbstractBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ArrayTypeResolution"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final arity:I

.field private final resolution:Lnet/bytebuddy/pool/TypePool$Resolution;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Resolution;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->resolution:Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->arity:I

    .line 7
    .line 8
    return-void
.end method

.method public static of(Lnet/bytebuddy/pool/TypePool$Resolution;I)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    new-instance v0, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;-><init>(Lnet/bytebuddy/pool/TypePool$Resolution;I)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
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
    iget v2, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->arity:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->arity:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->resolution:Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->resolution:Lnet/bytebuddy/pool/TypePool$Resolution;

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
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->resolution:Lnet/bytebuddy/pool/TypePool$Resolution;

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
    iget p0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->arity:I

    .line 21
    .line 22
    add-int/2addr v1, p0

    .line 23
    return v1
.end method

.method public isResolved()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->resolution:Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Resolution;->isResolved()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public resolve()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->resolution:Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget p0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$ArrayTypeResolution;->arity:I

    .line 8
    .line 9
    invoke-static {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$ArrayProjection;->of(Lnet/bytebuddy/description/type/TypeDescription;I)Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
