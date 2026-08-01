.class public final Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CachePolicy"
.end annotation


# instance fields
.field private final cacheSuccess:Z

.field private final failurePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 19
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;-><init>(ZLorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;ILr2;)V

    return-void
.end method

.method public constructor <init>(ZLorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-boolean p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->cacheSuccess:Z

    .line 18
    iput-object p2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->failurePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;

    return-void
.end method

.method public synthetic constructor <init>(ZLorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;ILr2;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    sget-object p2, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;->NONE:Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;

    .line 11
    .line 12
    :cond_1
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;-><init>(ZLorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic copy$default(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;ZLorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;ILjava/lang/Object;)Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->cacheSuccess:Z

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->failurePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->copy(ZLorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;)Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->cacheSuccess:Z

    .line 2
    .line 3
    return p0
.end method

.method public final component2()Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->failurePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(ZLorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;)Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;-><init>(ZLorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 12
    .line 13
    iget-boolean v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->cacheSuccess:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->cacheSuccess:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->failurePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;

    .line 21
    .line 22
    iget-object p1, p1, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->failurePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;

    .line 23
    .line 24
    if-eq p0, p1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    return v0
.end method

.method public final getCacheSuccess()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->cacheSuccess:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getFailurePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->failurePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->cacheSuccess:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->failurePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->cacheSuccess:Z

    .line 2
    .line 3
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->failurePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;

    .line 4
    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v2, "CachePolicy(cacheSuccess="

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v0, ", failurePolicy="

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ")"

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
