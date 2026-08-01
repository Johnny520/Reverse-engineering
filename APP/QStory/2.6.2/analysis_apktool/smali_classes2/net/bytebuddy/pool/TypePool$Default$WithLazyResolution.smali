.class public Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;
.super Lnet/bytebuddy/pool/TypePool$Default;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WithLazyResolution"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;,
        Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;,
        Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;,
        Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;)V
    .locals 1

    .line 15
    sget-object v0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;->NAME:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/pool/TypePool$Default;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;)V

    .line 17
    iput-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool;)V
    .locals 6

    .line 13
    sget-object v5, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;->NAME:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/pool/TypePool$Default;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/pool/TypePool;)V

    .line 19
    iput-object p5, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;)V
    .locals 6

    .line 14
    sget-object v5, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;->NAME:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/pool/TypePool$Default;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;)V

    .line 21
    iput-object p5, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/pool/TypePool;)V
    .locals 7

    .line 1
    sget-object v6, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;->NAME:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v4, p4

    .line 8
    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;)V
    .locals 0

    .line 22
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/pool/TypePool$Default;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/pool/TypePool;)V

    .line 23
    iput-object p6, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    return-void
.end method

.method public static synthetic access$001(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default;->doDescribe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$301(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;Lnet/bytebuddy/utility/AsmClassReader;)Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default;->doParse(Lnet/bytebuddy/utility/AsmClassReader;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/pool/TypePool;
    .locals 0
    .param p0    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 14
    invoke-static {p0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;

    .line 4
    .line 5
    invoke-direct {v1}, Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->FAST:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 9
    .line 10
    invoke-direct {v0, v1, p0, v2}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;-><init>(Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static ofBootLoader()Lnet/bytebuddy/pool/TypePool;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->ofBootLoader()Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static ofPlatformLoader()Lnet/bytebuddy/pool/TypePool;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->ofPlatformLoader()Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static ofSystemLoader()Lnet/bytebuddy/pool/TypePool;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->ofSystemLoader()Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method


# virtual methods
.method public doCache(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Resolution;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 0

    .line 1
    return-object p2
.end method

.method public doDescribe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public doParse(Lnet/bytebuddy/utility/AsmClassReader;)Lnet/bytebuddy/description/type/TypeDescription;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;->EXTENDED:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;Lnet/bytebuddy/utility/AsmClassReader;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-super {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default;->doParse(Lnet/bytebuddy/utility/AsmClassReader;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public doResolve(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase;->cacheProvider:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->find(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$AbstractBase;->cacheProvider:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 10
    .line 11
    invoke-static {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->access$001(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {v0, p1, p0}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->register(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Resolution;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

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
    invoke-super {p0}, Lnet/bytebuddy/pool/TypePool$Default;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->lazinessMode:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazinessMode;

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
