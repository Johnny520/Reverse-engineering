.class public abstract Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;
.super Lnet/bytebuddy/pool/TypePool$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$AbstractBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Hierarchical"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final parent:Lnet/bytebuddy/pool/TypePool;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/pool/TypePool;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/pool/TypePool$AbstractBase;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;->parent:Lnet/bytebuddy/pool/TypePool;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;->parent:Lnet/bytebuddy/pool/TypePool;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lnet/bytebuddy/pool/TypePool$AbstractBase;->clear()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    invoke-super {p0}, Lnet/bytebuddy/pool/TypePool$AbstractBase;->clear()V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;->parent:Lnet/bytebuddy/pool/TypePool;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->isResolved()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-super {p0, p1}, Lnet/bytebuddy/pool/TypePool$AbstractBase;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/pool/TypePool$AbstractBase;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;->parent:Lnet/bytebuddy/pool/TypePool;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;->parent:Lnet/bytebuddy/pool/TypePool;

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
    invoke-super {p0}, Lnet/bytebuddy/pool/TypePool$AbstractBase;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase$Hierarchical;->parent:Lnet/bytebuddy/pool/TypePool;

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
