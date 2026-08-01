.class public abstract Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "WithTypePoolCache"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache$Simple;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field protected final lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

.field protected final readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;)V
    .locals 1

    .line 9
    sget-object v0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;->NAME:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;-><init>(Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    .line 7
    .line 8
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
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

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
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
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
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

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
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public abstract locate(Ljava/lang/ClassLoader;)Lnet/bytebuddy/pool/TypePool$CacheProvider;
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
.end method

.method public typePool(Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/lang/ClassLoader;)Lnet/bytebuddy/pool/TypePool;
    .locals 3
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 34
    new-instance v0, Lnet/bytebuddy/pool/TypePool$LazyFacade;

    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    invoke-virtual {p0, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->locate(Ljava/lang/ClassLoader;)Lnet/bytebuddy/pool/TypePool$CacheProvider;

    move-result-object p2

    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    invoke-direct {v1, p2, p1, v2, p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V

    invoke-direct {v0, v1}, Lnet/bytebuddy/pool/TypePool$LazyFacade;-><init>(Lnet/bytebuddy/pool/TypePool;)V

    return-object v0
.end method

.method public typePool(Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/lang/ClassLoader;Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool;
    .locals 4
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$LazyFacade;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;

    .line 6
    .line 7
    invoke-static {p3}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    new-instance v3, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;

    .line 12
    .line 13
    invoke-direct {v3}, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->locate(Ljava/lang/ClassLoader;)Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-direct {v2, p3, v3, p2}, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/pool/TypePool$CacheProvider;)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 24
    .line 25
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    .line 26
    .line 27
    invoke-direct {v1, v2, p1, p2, p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, Lnet/bytebuddy/pool/TypePool$LazyFacade;-><init>(Lnet/bytebuddy/pool/TypePool;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
