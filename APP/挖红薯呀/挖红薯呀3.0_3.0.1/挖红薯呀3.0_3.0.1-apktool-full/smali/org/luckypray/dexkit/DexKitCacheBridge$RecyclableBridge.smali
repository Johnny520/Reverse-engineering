.class public final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RecyclableBridge"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFunction;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;


# instance fields
.field private final appTag:Ljava/lang/String;

.field private final classLoader:Ljava/lang/ClassLoader;

.field private final dexArray:[[B

.field private final path:Ljava/lang/String;

.field private final runtime$delegate:Lu60;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;-><init>(Lpl;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->Companion:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->path:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->dexArray:[[B

    .line 9
    .line 10
    iput-object p4, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->classLoader:Ljava/lang/ClassLoader;

    .line 11
    .line 12
    new-instance p1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;

    .line 13
    .line 14
    invoke-direct {p1, p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lz60;->I(Lhw;)Lu60;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->runtime$delegate:Lu60;

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;ILpl;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 25
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;-><init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;Lpl;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;-><init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;)V

    return-void
.end method

.method public static final synthetic access$createBridge(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->createBridge()Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$ensureUsable(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->ensureUsable()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getAppTag$p(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getRuntime(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getRuntime()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final acquireBridge(Lsw;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lsw;",
            ")TR;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->access$getRuntime(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$beginUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getLifecycleLock$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    :try_start_1
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getCreateBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lhw;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Lhw;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 29
    .line 30
    invoke-static {p0, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$setBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;Lorg/luckypray/dexkit/DexKitBridge;)V

    .line 31
    .line 32
    .line 33
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    const/4 v2, 0x0

    .line 40
    :goto_0
    :try_start_2
    monitor-exit v0

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getNotifyBridgeCreated$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lhw;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_1
    move-exception p1

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    :goto_1
    invoke-interface {p1, v1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :goto_2
    :try_start_3
    monitor-exit v0

    .line 62
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    :goto_3
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 64
    .line 65
    .line 66
    throw p1
.end method

.method private final createBridge()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->path:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->dexArray:[[B

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object p0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create([[B)Lorg/luckypray/dexkit/DexKitBridge;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->classLoader:Ljava/lang/ClassLoader;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {v0, p0, v1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_2
    const-string p0, "init fail"

    .line 36
    .line 37
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method private final ensureUsable()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getRuntime()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->ensureUsable()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic getBatchUsingStringsClasses$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;ILjava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getBatchUsingStringsClasses(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getBatchUsingStringsMethods$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;ILjava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getClass$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClass(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getClassDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClassDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getClassDirectOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClassDirectOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getClassOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClassOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getClasses$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClasses(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getClassesDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClassesDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getClassesDirectOrEmpty$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClassesDirectOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getClassesOrEmpty$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClassesOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final getDirectInternalList-yxL6bBk(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;ZLsw;Lsw;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;",
            "Ljava/lang/String;",
            "Z",
            "Lsw;",
            "Lsw;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    sget-object v2, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 6
    .line 7
    iget-object v3, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 8
    .line 9
    const/16 v7, 0x8

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const-string v4, "l"

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    move-object/from16 v5, p2

    .line 16
    .line 17
    invoke-static/range {v2 .. v8}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf$default(Lorg/luckypray/dexkit/cache/CacheBridgeKeys;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;ILjava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v13

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-instance v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1;

    .line 24
    .line 25
    move-object/from16 v3, p5

    .line 26
    .line 27
    invoke-direct {v2, v0, v1, v3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lsw;Lsw;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    move-object/from16 v16, v2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    sget-object v9, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 36
    .line 37
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 38
    .line 39
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    new-instance v15, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1;

    .line 52
    .line 53
    invoke-direct {v15, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move/from16 v14, p3

    .line 57
    .line 58
    invoke-virtual/range {v9 .. v16}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedList(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    if-nez v6, :cond_1

    .line 75
    .line 76
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    :catchall_0
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_2

    .line 89
    .line 90
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    move-object v9, v1

    .line 95
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 96
    .line 97
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 98
    .line 99
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 103
    .line 104
    move-object v1, v7

    .line 105
    check-cast v1, Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 112
    .line 113
    move-object/from16 v3, p1

    .line 114
    .line 115
    move-object/from16 v4, p2

    .line 116
    .line 117
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_1
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    :catchall_1
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_2

    .line 137
    .line 138
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    move-object v9, v1

    .line 143
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 144
    .line 145
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 146
    .line 147
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 151
    .line 152
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 153
    .line 154
    move-object/from16 v3, p1

    .line 155
    .line 156
    move-object/from16 v4, p2

    .line 157
    .line 158
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_2
    return-object v7
.end method

.method private final getDirectInternalSingle-yxL6bBk(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;Lsw;Lsw;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;",
            "Lsw;",
            "Lsw;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    sget-object v2, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 6
    .line 7
    iget-object v3, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 8
    .line 9
    const/16 v7, 0x8

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const-string v4, "s"

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    move-object/from16 v5, p2

    .line 16
    .line 17
    invoke-static/range {v2 .. v8}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf$default(Lorg/luckypray/dexkit/cache/CacheBridgeKeys;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;ILjava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v13

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-instance v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1;

    .line 24
    .line 25
    move-object/from16 v3, p5

    .line 26
    .line 27
    invoke-direct {v2, v0, v1, v3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lsw;Lsw;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    move-object/from16 v17, v2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    sget-object v9, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 36
    .line 37
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 38
    .line 39
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const/4 v7, 0x0

    .line 56
    invoke-virtual {v9, v1, v7}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->shouldCacheFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v15

    .line 60
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v14, p3

    .line 66
    .line 67
    move-object/from16 v16, v1

    .line 68
    .line 69
    invoke-virtual/range {v9 .. v17}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedSingle(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-static {v8}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    if-nez v6, :cond_2

    .line 86
    .line 87
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    :catchall_0
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_3

    .line 100
    .line 101
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    move-object v10, v1

    .line 106
    check-cast v10, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 107
    .line 108
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 109
    .line 110
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 114
    .line 115
    move-object v1, v8

    .line 116
    check-cast v1, Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 117
    .line 118
    if-nez v1, :cond_1

    .line 119
    .line 120
    move v6, v7

    .line 121
    goto :goto_3

    .line 122
    :cond_1
    const/4 v1, 0x1

    .line 123
    move v6, v1

    .line 124
    :goto_3
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 125
    .line 126
    move-object/from16 v3, p1

    .line 127
    .line 128
    move-object/from16 v4, p2

    .line 129
    .line 130
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v10, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_2
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    :catchall_1
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_3

    .line 150
    .line 151
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    move-object v9, v1

    .line 156
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 157
    .line 158
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 159
    .line 160
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 164
    .line 165
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 166
    .line 167
    move-object/from16 v3, p1

    .line 168
    .line 169
    move-object/from16 v4, p2

    .line 170
    .line 171
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_3
    return-object v8
.end method

.method public static synthetic getField$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getField(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getFieldDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFieldDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getFieldDirectOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFieldDirectOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getFieldOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFieldOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getFields$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFields(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getFieldsDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFieldsDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getFieldsDirectOrEmpty$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFieldsDirectOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getFieldsOrEmpty$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFieldsOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final getInternalList-hUnOzRk(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;ZLhw;Lww;Lsw;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Q:",
            "Lorg/luckypray/dexkit/query/base/BaseFinder;",
            "D:",
            "Ljava/lang/Object;",
            "R::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;",
            "Ljava/lang/String;",
            "Z",
            "Lhw;",
            "Lww;",
            "Lsw;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    invoke-interface/range {p4 .. p4}, Lhw;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v2, v1

    .line 14
    :goto_0
    sget-object v3, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 15
    .line 16
    iget-object v4, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 17
    .line 18
    const-string v5, "l"

    .line 19
    .line 20
    move-object/from16 v9, p2

    .line 21
    .line 22
    invoke-virtual {v3, v4, v5, v9, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v14

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1;

    .line 29
    .line 30
    move-object/from16 v3, p5

    .line 31
    .line 32
    move-object/from16 v4, p6

    .line 33
    .line 34
    invoke-direct {v1, v0, v3, v2, v4}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;Lorg/luckypray/dexkit/query/base/BaseFinder;Lsw;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    move-object/from16 v17, v1

    .line 38
    .line 39
    sget-object v10, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 40
    .line 41
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 42
    .line 43
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;

    .line 56
    .line 57
    invoke-direct {v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;-><init>(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move/from16 v15, p3

    .line 61
    .line 62
    move-object/from16 v16, v1

    .line 63
    .line 64
    invoke-virtual/range {v10 .. v17}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedList(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    if-nez v11, :cond_2

    .line 81
    .line 82
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 101
    .line 102
    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 103
    .line 104
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v7, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 108
    .line 109
    move-object v4, v1

    .line 110
    check-cast v4, Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    new-instance v6, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 117
    .line 118
    move-object/from16 v8, p1

    .line 119
    .line 120
    invoke-direct/range {v6 .. v11}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    :catchall_0
    move-object/from16 v9, p2

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    :catchall_1
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_3

    .line 142
    .line 143
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 148
    .line 149
    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 150
    .line 151
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance v6, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 155
    .line 156
    iget-object v7, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 157
    .line 158
    move-object/from16 v8, p1

    .line 159
    .line 160
    move-object/from16 v9, p2

    .line 161
    .line 162
    invoke-direct/range {v6 .. v11}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    return-object v1
.end method

.method private final getInternalMap-yxL6bBk(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lhw;Lww;Lsw;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Q:",
            "Lorg/luckypray/dexkit/query/base/BaseFinder;",
            "D:",
            "Ljava/lang/Object;",
            "R::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;",
            "Ljava/lang/String;",
            "Lhw;",
            "Lww;",
            "Lsw;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    invoke-interface/range {p3 .. p3}, Lhw;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v2, v1

    .line 14
    :goto_0
    sget-object v3, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 15
    .line 16
    iget-object v4, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 17
    .line 18
    const-string v5, "b"

    .line 19
    .line 20
    move-object/from16 v9, p2

    .line 21
    .line 22
    invoke-virtual {v3, v4, v5, v9, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v14

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;

    .line 29
    .line 30
    move-object/from16 v3, p4

    .line 31
    .line 32
    move-object/from16 v4, p5

    .line 33
    .line 34
    invoke-direct {v1, v0, v3, v2, v4}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;Lorg/luckypray/dexkit/query/base/BaseFinder;Lsw;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    move-object/from16 v16, v1

    .line 38
    .line 39
    sget-object v10, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 40
    .line 41
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 42
    .line 43
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    new-instance v15, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$1;

    .line 56
    .line 57
    invoke-direct {v15, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$1;-><init>(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual/range {v10 .. v16}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedMap(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v1}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    if-nez v11, :cond_3

    .line 77
    .line 78
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_4

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 97
    .line 98
    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 99
    .line 100
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v7, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 104
    .line 105
    move-object v4, v1

    .line 106
    check-cast v4, Ljava/util/Map;

    .line 107
    .line 108
    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, Ljava/lang/Iterable;

    .line 113
    .line 114
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    const/4 v5, 0x0

    .line 119
    move v11, v5

    .line 120
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_2

    .line 125
    .line 126
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    add-int/2addr v11, v5

    .line 137
    goto :goto_2

    .line 138
    :cond_2
    new-instance v6, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 139
    .line 140
    move-object/from16 v8, p1

    .line 141
    .line 142
    invoke-direct/range {v6 .. v11}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    .line 147
    .line 148
    :catchall_0
    move-object/from16 v9, p2

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    :catchall_1
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_4

    .line 164
    .line 165
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 170
    .line 171
    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 172
    .line 173
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v6, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 177
    .line 178
    iget-object v7, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 179
    .line 180
    move-object/from16 v8, p1

    .line 181
    .line 182
    move-object/from16 v9, p2

    .line 183
    .line 184
    invoke-direct/range {v6 .. v11}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_4
    return-object v1
.end method

.method private final getInternalSingle-hUnOzRk(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;Lhw;Lww;Lsw;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Q:",
            "Lorg/luckypray/dexkit/query/base/BaseFinder;",
            "D:",
            "Ljava/lang/Object;",
            "R::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;",
            "Lhw;",
            "Lww;",
            "Lsw;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    invoke-interface/range {p4 .. p4}, Lhw;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v2, v1

    .line 16
    :goto_0
    sget-object v3, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 17
    .line 18
    iget-object v5, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 19
    .line 20
    const-string v6, "s"

    .line 21
    .line 22
    invoke-virtual {v3, v5, v6, v4, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v11

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;

    .line 29
    .line 30
    move-object/from16 v3, p5

    .line 31
    .line 32
    move-object/from16 v5, p6

    .line 33
    .line 34
    invoke-direct {v1, v0, v3, v2, v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;Lorg/luckypray/dexkit/query/base/BaseFinder;Lsw;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    move-object v15, v1

    .line 38
    const/16 v16, 0x0

    .line 39
    .line 40
    const/16 v17, 0x1

    .line 41
    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    move/from16 v1, v17

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move/from16 v1, v16

    .line 50
    .line 51
    :goto_1
    sget-object v7, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 52
    .line 53
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 54
    .line 55
    invoke-static {v2}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v7, v2, v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->shouldCacheFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v13

    .line 75
    new-instance v14, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$1;

    .line 76
    .line 77
    invoke-direct {v14, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$1;-><init>(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object/from16 v12, p3

    .line 81
    .line 82
    invoke-virtual/range {v7 .. v15}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedSingle(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    if-nez v6, :cond_4

    .line 99
    .line 100
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    move-object v9, v1

    .line 119
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 120
    .line 121
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 122
    .line 123
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 127
    .line 128
    move-object v1, v7

    .line 129
    check-cast v1, Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 130
    .line 131
    if-nez v1, :cond_3

    .line 132
    .line 133
    move/from16 v6, v16

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_3
    move/from16 v6, v17

    .line 137
    .line 138
    :goto_3
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 139
    .line 140
    move-object/from16 v3, p1

    .line 141
    .line 142
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    .line 147
    .line 148
    :catchall_0
    move-object/from16 v4, p2

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    :catchall_1
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_5

    .line 164
    .line 165
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    move-object v9, v1

    .line 170
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 171
    .line 172
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 173
    .line 174
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 178
    .line 179
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 180
    .line 181
    move-object/from16 v3, p1

    .line 182
    .line 183
    move-object/from16 v4, p2

    .line 184
    .line 185
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_5
    return-object v7
.end method

.method public static synthetic getMethod$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethod(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getMethodDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethodDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getMethodDirectOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethodDirectOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getMethodOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethodOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getMethods$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethods(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getMethodsDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethodsDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getMethodsDirectOrEmpty$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethodsDirectOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getMethodsOrEmpty$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethodsOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final getRuntime()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->runtime$delegate:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 8
    .line 9
    return-object p0
.end method

.method private final innerGetBatchUsingStringsClasses(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->CLASS_BATCH:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$1$1;

    .line 11
    .line 12
    invoke-direct {v4, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$1$1;-><init>(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v4, v2

    .line 17
    :goto_0
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$2;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$2;

    .line 18
    .line 19
    sget-object v5, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$3;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$3;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    invoke-interface {v4}, Lhw;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v4, v2

    .line 31
    :goto_1
    sget-object v6, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 32
    .line 33
    iget-object v7, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 34
    .line 35
    const-string v8, "b"

    .line 36
    .line 37
    move-object/from16 v9, p1

    .line 38
    .line 39
    invoke-virtual {v6, v7, v8, v9, v4}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v14

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    new-instance v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;

    .line 46
    .line 47
    invoke-direct {v2, v0, v1, v4, v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;Lorg/luckypray/dexkit/query/base/BaseFinder;Lsw;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    move-object/from16 v16, v2

    .line 51
    .line 52
    sget-object v10, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 53
    .line 54
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 55
    .line 56
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    new-instance v15, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$1;

    .line 69
    .line 70
    invoke-direct {v15, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$1;-><init>(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {v10 .. v16}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedMap(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    if-nez v6, :cond_4

    .line 90
    .line 91
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    move-object v10, v1

    .line 110
    check-cast v10, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 111
    .line 112
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 113
    .line 114
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 118
    .line 119
    move-object v1, v7

    .line 120
    check-cast v1, Ljava/util/Map;

    .line 121
    .line 122
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/lang/Iterable;

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const/4 v4, 0x0

    .line 133
    move v6, v4

    .line 134
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_3

    .line 139
    .line 140
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Ljava/util/List;

    .line 145
    .line 146
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    add-int/2addr v6, v4

    .line 151
    goto :goto_3

    .line 152
    :cond_3
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 153
    .line 154
    move-object v4, v9

    .line 155
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v10, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    .line 160
    .line 161
    :catchall_0
    move-object/from16 v9, p1

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_4
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    :catchall_1
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_5

    .line 177
    .line 178
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    move-object v9, v1

    .line 183
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 184
    .line 185
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 186
    .line 187
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 191
    .line 192
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 193
    .line 194
    move-object/from16 v4, p1

    .line 195
    .line 196
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_5
    invoke-static {v7}, Lw60;->M(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    check-cast v7, Ljava/util/Map;

    .line 207
    .line 208
    return-object v7
.end method

.method public static synthetic innerGetBatchUsingStringsClasses$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;ILjava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsClasses(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final innerGetBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->METHOD_BATCH:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$1$1;

    .line 11
    .line 12
    invoke-direct {v4, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$1$1;-><init>(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v4, v2

    .line 17
    :goto_0
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$2;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$2;

    .line 18
    .line 19
    sget-object v5, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$3;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$3;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    invoke-interface {v4}, Lhw;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v4, v2

    .line 31
    :goto_1
    sget-object v6, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 32
    .line 33
    iget-object v7, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 34
    .line 35
    const-string v8, "b"

    .line 36
    .line 37
    move-object/from16 v9, p1

    .line 38
    .line 39
    invoke-virtual {v6, v7, v8, v9, v4}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v14

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    new-instance v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;

    .line 46
    .line 47
    invoke-direct {v2, v0, v1, v4, v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;Lorg/luckypray/dexkit/query/base/BaseFinder;Lsw;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    move-object/from16 v16, v2

    .line 51
    .line 52
    sget-object v10, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 53
    .line 54
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 55
    .line 56
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    new-instance v15, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$1;

    .line 69
    .line 70
    invoke-direct {v15, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$1;-><init>(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {v10 .. v16}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedMap(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    if-nez v6, :cond_4

    .line 90
    .line 91
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    move-object v10, v1

    .line 110
    check-cast v10, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 111
    .line 112
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 113
    .line 114
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 118
    .line 119
    move-object v1, v7

    .line 120
    check-cast v1, Ljava/util/Map;

    .line 121
    .line 122
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/lang/Iterable;

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const/4 v4, 0x0

    .line 133
    move v6, v4

    .line 134
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_3

    .line 139
    .line 140
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Ljava/util/List;

    .line 145
    .line 146
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    add-int/2addr v6, v4

    .line 151
    goto :goto_3

    .line 152
    :cond_3
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 153
    .line 154
    move-object v4, v9

    .line 155
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v10, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    .line 160
    .line 161
    :catchall_0
    move-object/from16 v9, p1

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_4
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    :catchall_1
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_5

    .line 177
    .line 178
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    move-object v9, v1

    .line 183
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 184
    .line 185
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 186
    .line 187
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 191
    .line 192
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 193
    .line 194
    move-object/from16 v4, p1

    .line 195
    .line 196
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_5
    invoke-static {v7}, Lw60;->M(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    check-cast v7, Ljava/util/Map;

    .line 207
    .line 208
    return-object v7
.end method

.method public static synthetic innerGetBatchUsingStringsMethods$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;ILjava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 12

    .line 1
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->CLASS_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->NULLABLE:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 6
    .line 7
    :goto_0
    move-object v8, p2

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    sget-object p2, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->REQUIRED:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :goto_1
    const/4 p2, 0x0

    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClass$1$1;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClass$1$1;-><init>(Lorg/luckypray/dexkit/query/FindClass;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_1
    move-object v0, p2

    .line 22
    :goto_2
    sget-object p3, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClass$2;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClass$2;

    .line 23
    .line 24
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClass$3;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClass$3;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    move-object v0, p2

    .line 36
    :goto_3
    sget-object v3, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 37
    .line 38
    iget-object v4, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 39
    .line 40
    const-string v5, "s"

    .line 41
    .line 42
    invoke-virtual {v3, v4, v5, p1, v0}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    new-instance p2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;

    .line 49
    .line 50
    invoke-direct {p2, p0, p3, v0, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;Lorg/luckypray/dexkit/query/base/BaseFinder;Lsw;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    move-object v11, p2

    .line 54
    const/4 p2, 0x0

    .line 55
    const/4 p3, 0x1

    .line 56
    if-nez p1, :cond_4

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    move v0, p3

    .line 61
    goto :goto_4

    .line 62
    :cond_4
    move v0, p2

    .line 63
    :goto_4
    sget-object v3, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 64
    .line 65
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 66
    .line 67
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v3, v1, v0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->shouldCacheFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    new-instance v10, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$1;

    .line 88
    .line 89
    invoke-direct {v10, p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$1;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v3 .. v11}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedSingle(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-static {v6}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    if-nez v5, :cond_6

    .line 109
    .line 110
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    move-object v8, v0

    .line 129
    check-cast v8, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 130
    .line 131
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 132
    .line 133
    :try_start_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 137
    .line 138
    move-object v0, v6

    .line 139
    check-cast v0, Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 140
    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    move v5, p2

    .line 144
    goto :goto_6

    .line 145
    :cond_5
    move v5, p3

    .line 146
    :goto_6
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    .line 148
    move-object v3, p1

    .line 149
    :try_start_1
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 153
    .line 154
    .line 155
    goto :goto_7

    .line 156
    :catchall_0
    move-object v3, p1

    .line 157
    :catchall_1
    :goto_7
    move-object p1, v3

    .line 158
    goto :goto_5

    .line 159
    :cond_6
    move-object v3, p1

    .line 160
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    :catchall_2
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    if-eqz p2, :cond_7

    .line 173
    .line 174
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    check-cast p2, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 179
    .line 180
    sget-object p3, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 181
    .line 182
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 186
    .line 187
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 188
    .line 189
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 193
    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_7
    invoke-static {v6}, Lw60;->M(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    check-cast v6, Lorg/luckypray/dexkit/wrap/DexClass;

    .line 200
    .line 201
    return-object v6
.end method

.method public static synthetic innerGetClass$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private final innerGetClassDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lsw;",
            ")",
            "Lorg/luckypray/dexkit/wrap/DexClass;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->CLASS_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    sget-object v2, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->NULLABLE:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 10
    .line 11
    :goto_0
    move-object v9, v2

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    sget-object v2, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->REQUIRED:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1;

    .line 17
    .line 18
    sget-object v10, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 19
    .line 20
    iget-object v11, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 21
    .line 22
    const/16 v15, 0x8

    .line 23
    .line 24
    const/16 v16, 0x0

    .line 25
    .line 26
    const-string v12, "s"

    .line 27
    .line 28
    const/4 v14, 0x0

    .line 29
    move-object/from16 v13, p1

    .line 30
    .line 31
    invoke-static/range {v10 .. v16}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf$default(Lorg/luckypray/dexkit/cache/CacheBridgeKeys;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;ILjava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1;

    .line 38
    .line 39
    invoke-direct {v4, v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lsw;Lsw;)V

    .line 40
    .line 41
    .line 42
    :goto_2
    move-object v12, v4

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const/4 v4, 0x0

    .line 45
    goto :goto_2

    .line 46
    :goto_3
    sget-object v4, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 47
    .line 48
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 49
    .line 50
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const/4 v13, 0x0

    .line 67
    invoke-virtual {v4, v1, v13}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->shouldCacheFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    new-instance v11, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1;

    .line 72
    .line 73
    invoke-direct {v11, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1;-><init>(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual/range {v4 .. v12}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedSingle(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-nez v6, :cond_3

    .line 93
    .line 94
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    :catchall_0
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    move-object v9, v1

    .line 113
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 114
    .line 115
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 116
    .line 117
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 121
    .line 122
    move-object v1, v7

    .line 123
    check-cast v1, Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 124
    .line 125
    if-nez v1, :cond_2

    .line 126
    .line 127
    move v6, v13

    .line 128
    goto :goto_5

    .line 129
    :cond_2
    const/4 v1, 0x1

    .line 130
    move v6, v1

    .line 131
    :goto_5
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 132
    .line 133
    move-object/from16 v4, p1

    .line 134
    .line 135
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_3
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    :catchall_1
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_4

    .line 155
    .line 156
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    move-object v9, v1

    .line 161
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 162
    .line 163
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 164
    .line 165
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 169
    .line 170
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 171
    .line 172
    move-object/from16 v4, p1

    .line 173
    .line 174
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_4
    invoke-static {v7}, Lw60;->M(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    check-cast v7, Lorg/luckypray/dexkit/wrap/DexClass;

    .line 185
    .line 186
    return-object v7
.end method

.method public static synthetic innerGetClassDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLsw;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClassDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexClass;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lorg/luckypray/dexkit/query/FindClass;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->CLASS_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1;

    .line 11
    .line 12
    invoke-direct {v4, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1;-><init>(Lorg/luckypray/dexkit/query/FindClass;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v4, v2

    .line 17
    :goto_0
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClasses$2;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClasses$2;

    .line 18
    .line 19
    sget-object v5, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClasses$3;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClasses$3;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    invoke-interface {v4}, Lhw;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v4, v2

    .line 31
    :goto_1
    sget-object v6, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 32
    .line 33
    iget-object v7, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 34
    .line 35
    const-string v8, "l"

    .line 36
    .line 37
    move-object/from16 v9, p1

    .line 38
    .line 39
    invoke-virtual {v6, v7, v8, v9, v4}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v14

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    new-instance v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1;

    .line 46
    .line 47
    invoke-direct {v2, v0, v1, v4, v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;Lorg/luckypray/dexkit/query/base/BaseFinder;Lsw;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    move-object/from16 v17, v2

    .line 51
    .line 52
    sget-object v10, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 53
    .line 54
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 55
    .line 56
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;-><init>(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move/from16 v15, p2

    .line 74
    .line 75
    move-object/from16 v16, v1

    .line 76
    .line 77
    invoke-virtual/range {v10 .. v17}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedList(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    if-nez v6, :cond_3

    .line 94
    .line 95
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    move-object v10, v1

    .line 114
    check-cast v10, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 115
    .line 116
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 117
    .line 118
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 122
    .line 123
    move-object v1, v7

    .line 124
    check-cast v1, Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 131
    .line 132
    move-object v4, v9

    .line 133
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v10, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    :catchall_0
    move-object/from16 v9, p1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    :catchall_1
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_4

    .line 155
    .line 156
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    move-object v9, v1

    .line 161
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 162
    .line 163
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 164
    .line 165
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 169
    .line 170
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 171
    .line 172
    move-object/from16 v4, p1

    .line 173
    .line 174
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_4
    invoke-static {v7}, Lw60;->M(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    check-cast v7, Ljava/util/List;

    .line 185
    .line 186
    return-object v7
.end method

.method public static synthetic innerGetClasses$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;ILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private final innerGetClassesDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lsw;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->CLASS_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 6
    .line 7
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClassesDirect$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetClassesDirect$1;

    .line 8
    .line 9
    sget-object v4, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 10
    .line 11
    iget-object v5, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 12
    .line 13
    const/16 v9, 0x8

    .line 14
    .line 15
    const/4 v10, 0x0

    .line 16
    const-string v6, "l"

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    move-object/from16 v7, p1

    .line 20
    .line 21
    invoke-static/range {v4 .. v10}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf$default(Lorg/luckypray/dexkit/cache/CacheBridgeKeys;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;ILjava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v15

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1;

    .line 28
    .line 29
    invoke-direct {v4, v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lsw;Lsw;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    move-object/from16 v18, v4

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const/4 v4, 0x0

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    sget-object v11, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 38
    .line 39
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 40
    .line 41
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 42
    .line 43
    .line 44
    move-result-object v12

    .line 45
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 46
    .line 47
    .line 48
    move-result-object v13

    .line 49
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 50
    .line 51
    .line 52
    move-result-object v14

    .line 53
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1;

    .line 54
    .line 55
    invoke-direct {v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1;-><init>(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move/from16 v16, p2

    .line 59
    .line 60
    move-object/from16 v17, v1

    .line 61
    .line 62
    invoke-virtual/range {v11 .. v18}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedList(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    if-nez v6, :cond_1

    .line 79
    .line 80
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    :catchall_0
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    move-object v9, v1

    .line 99
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 100
    .line 101
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 102
    .line 103
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 107
    .line 108
    move-object v1, v7

    .line 109
    check-cast v1, Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 116
    .line 117
    move-object/from16 v4, p1

    .line 118
    .line 119
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_1
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    :catchall_1
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_2

    .line 139
    .line 140
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    move-object v9, v1

    .line 145
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 146
    .line 147
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 148
    .line 149
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 153
    .line 154
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 155
    .line 156
    move-object/from16 v4, p1

    .line 157
    .line 158
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_2
    invoke-static {v7}, Lw60;->M(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    check-cast v7, Ljava/util/List;

    .line 169
    .line 170
    return-object v7
.end method

.method public static synthetic innerGetClassesDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLsw;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClassesDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 12

    .line 1
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->FIELD_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->NULLABLE:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 6
    .line 7
    :goto_0
    move-object v8, p2

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    sget-object p2, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->REQUIRED:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :goto_1
    const/4 p2, 0x0

    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetField$1$1;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetField$1$1;-><init>(Lorg/luckypray/dexkit/query/FindField;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_1
    move-object v0, p2

    .line 22
    :goto_2
    sget-object p3, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetField$2;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetField$2;

    .line 23
    .line 24
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetField$3;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetField$3;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    move-object v0, p2

    .line 36
    :goto_3
    sget-object v3, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 37
    .line 38
    iget-object v4, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 39
    .line 40
    const-string v5, "s"

    .line 41
    .line 42
    invoke-virtual {v3, v4, v5, p1, v0}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    new-instance p2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;

    .line 49
    .line 50
    invoke-direct {p2, p0, p3, v0, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;Lorg/luckypray/dexkit/query/base/BaseFinder;Lsw;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    move-object v11, p2

    .line 54
    const/4 p2, 0x0

    .line 55
    const/4 p3, 0x1

    .line 56
    if-nez p1, :cond_4

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    move v0, p3

    .line 61
    goto :goto_4

    .line 62
    :cond_4
    move v0, p2

    .line 63
    :goto_4
    sget-object v3, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 64
    .line 65
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 66
    .line 67
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v3, v1, v0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->shouldCacheFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    new-instance v10, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$1;

    .line 88
    .line 89
    invoke-direct {v10, p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$1;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v3 .. v11}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedSingle(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-static {v6}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    if-nez v5, :cond_6

    .line 109
    .line 110
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    move-object v8, v0

    .line 129
    check-cast v8, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 130
    .line 131
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 132
    .line 133
    :try_start_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 137
    .line 138
    move-object v0, v6

    .line 139
    check-cast v0, Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 140
    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    move v5, p2

    .line 144
    goto :goto_6

    .line 145
    :cond_5
    move v5, p3

    .line 146
    :goto_6
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    .line 148
    move-object v3, p1

    .line 149
    :try_start_1
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 153
    .line 154
    .line 155
    goto :goto_7

    .line 156
    :catchall_0
    move-object v3, p1

    .line 157
    :catchall_1
    :goto_7
    move-object p1, v3

    .line 158
    goto :goto_5

    .line 159
    :cond_6
    move-object v3, p1

    .line 160
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    :catchall_2
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    if-eqz p2, :cond_7

    .line 173
    .line 174
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    check-cast p2, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 179
    .line 180
    sget-object p3, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 181
    .line 182
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 186
    .line 187
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 188
    .line 189
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 193
    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_7
    invoke-static {v6}, Lw60;->M(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    check-cast v6, Lorg/luckypray/dexkit/wrap/DexField;

    .line 200
    .line 201
    return-object v6
.end method

.method public static synthetic innerGetField$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private final innerGetFieldDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lsw;",
            ")",
            "Lorg/luckypray/dexkit/wrap/DexField;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->FIELD_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    sget-object v2, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->NULLABLE:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 10
    .line 11
    :goto_0
    move-object v9, v2

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    sget-object v2, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->REQUIRED:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1;

    .line 17
    .line 18
    sget-object v10, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 19
    .line 20
    iget-object v11, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 21
    .line 22
    const/16 v15, 0x8

    .line 23
    .line 24
    const/16 v16, 0x0

    .line 25
    .line 26
    const-string v12, "s"

    .line 27
    .line 28
    const/4 v14, 0x0

    .line 29
    move-object/from16 v13, p1

    .line 30
    .line 31
    invoke-static/range {v10 .. v16}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf$default(Lorg/luckypray/dexkit/cache/CacheBridgeKeys;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;ILjava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1;

    .line 38
    .line 39
    invoke-direct {v4, v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lsw;Lsw;)V

    .line 40
    .line 41
    .line 42
    :goto_2
    move-object v12, v4

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const/4 v4, 0x0

    .line 45
    goto :goto_2

    .line 46
    :goto_3
    sget-object v4, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 47
    .line 48
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 49
    .line 50
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const/4 v13, 0x0

    .line 67
    invoke-virtual {v4, v1, v13}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->shouldCacheFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    new-instance v11, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1;

    .line 72
    .line 73
    invoke-direct {v11, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1;-><init>(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual/range {v4 .. v12}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedSingle(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-nez v6, :cond_3

    .line 93
    .line 94
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    :catchall_0
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    move-object v9, v1

    .line 113
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 114
    .line 115
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 116
    .line 117
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 121
    .line 122
    move-object v1, v7

    .line 123
    check-cast v1, Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 124
    .line 125
    if-nez v1, :cond_2

    .line 126
    .line 127
    move v6, v13

    .line 128
    goto :goto_5

    .line 129
    :cond_2
    const/4 v1, 0x1

    .line 130
    move v6, v1

    .line 131
    :goto_5
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 132
    .line 133
    move-object/from16 v4, p1

    .line 134
    .line 135
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_3
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    :catchall_1
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_4

    .line 155
    .line 156
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    move-object v9, v1

    .line 161
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 162
    .line 163
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 164
    .line 165
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 169
    .line 170
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 171
    .line 172
    move-object/from16 v4, p1

    .line 173
    .line 174
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_4
    invoke-static {v7}, Lw60;->M(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    check-cast v7, Lorg/luckypray/dexkit/wrap/DexField;

    .line 185
    .line 186
    return-object v7
.end method

.method public static synthetic innerGetFieldDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLsw;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFieldDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexField;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lorg/luckypray/dexkit/query/FindField;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->FIELD_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1;

    .line 11
    .line 12
    invoke-direct {v4, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1;-><init>(Lorg/luckypray/dexkit/query/FindField;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v4, v2

    .line 17
    :goto_0
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFields$2;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFields$2;

    .line 18
    .line 19
    sget-object v5, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFields$3;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFields$3;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    invoke-interface {v4}, Lhw;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v4, v2

    .line 31
    :goto_1
    sget-object v6, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 32
    .line 33
    iget-object v7, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 34
    .line 35
    const-string v8, "l"

    .line 36
    .line 37
    move-object/from16 v9, p1

    .line 38
    .line 39
    invoke-virtual {v6, v7, v8, v9, v4}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v14

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    new-instance v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1;

    .line 46
    .line 47
    invoke-direct {v2, v0, v1, v4, v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;Lorg/luckypray/dexkit/query/base/BaseFinder;Lsw;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    move-object/from16 v17, v2

    .line 51
    .line 52
    sget-object v10, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 53
    .line 54
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 55
    .line 56
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;-><init>(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move/from16 v15, p2

    .line 74
    .line 75
    move-object/from16 v16, v1

    .line 76
    .line 77
    invoke-virtual/range {v10 .. v17}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedList(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    if-nez v6, :cond_3

    .line 94
    .line 95
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    move-object v10, v1

    .line 114
    check-cast v10, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 115
    .line 116
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 117
    .line 118
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 122
    .line 123
    move-object v1, v7

    .line 124
    check-cast v1, Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 131
    .line 132
    move-object v4, v9

    .line 133
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v10, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    :catchall_0
    move-object/from16 v9, p1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    :catchall_1
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_4

    .line 155
    .line 156
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    move-object v9, v1

    .line 161
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 162
    .line 163
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 164
    .line 165
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 169
    .line 170
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 171
    .line 172
    move-object/from16 v4, p1

    .line 173
    .line 174
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_4
    invoke-static {v7}, Lw60;->M(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    check-cast v7, Ljava/util/List;

    .line 185
    .line 186
    return-object v7
.end method

.method public static synthetic innerGetFields$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;ILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private final innerGetFieldsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lsw;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->FIELD_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 6
    .line 7
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFieldsDirect$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFieldsDirect$1;

    .line 8
    .line 9
    sget-object v4, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 10
    .line 11
    iget-object v5, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 12
    .line 13
    const/16 v9, 0x8

    .line 14
    .line 15
    const/4 v10, 0x0

    .line 16
    const-string v6, "l"

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    move-object/from16 v7, p1

    .line 20
    .line 21
    invoke-static/range {v4 .. v10}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf$default(Lorg/luckypray/dexkit/cache/CacheBridgeKeys;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;ILjava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v15

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1;

    .line 28
    .line 29
    invoke-direct {v4, v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lsw;Lsw;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    move-object/from16 v18, v4

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const/4 v4, 0x0

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    sget-object v11, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 38
    .line 39
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 40
    .line 41
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 42
    .line 43
    .line 44
    move-result-object v12

    .line 45
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 46
    .line 47
    .line 48
    move-result-object v13

    .line 49
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 50
    .line 51
    .line 52
    move-result-object v14

    .line 53
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1;

    .line 54
    .line 55
    invoke-direct {v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1;-><init>(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move/from16 v16, p2

    .line 59
    .line 60
    move-object/from16 v17, v1

    .line 61
    .line 62
    invoke-virtual/range {v11 .. v18}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedList(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    if-nez v6, :cond_1

    .line 79
    .line 80
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    :catchall_0
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    move-object v9, v1

    .line 99
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 100
    .line 101
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 102
    .line 103
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 107
    .line 108
    move-object v1, v7

    .line 109
    check-cast v1, Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 116
    .line 117
    move-object/from16 v4, p1

    .line 118
    .line 119
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_1
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    :catchall_1
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_2

    .line 139
    .line 140
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    move-object v9, v1

    .line 145
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 146
    .line 147
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 148
    .line 149
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 153
    .line 154
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 155
    .line 156
    move-object/from16 v4, p1

    .line 157
    .line 158
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_2
    invoke-static {v7}, Lw60;->M(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    check-cast v7, Ljava/util/List;

    .line 169
    .line 170
    return-object v7
.end method

.method public static synthetic innerGetFieldsDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLsw;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFieldsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v1, p3

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v3, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1;

    .line 11
    .line 12
    invoke-direct {v3, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1;-><init>(Lorg/luckypray/dexkit/query/FindMethod;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v3, v2

    .line 17
    :goto_0
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->METHOD_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    sget-object v5, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->NULLABLE:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 22
    .line 23
    :goto_1
    move-object v11, v5

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    sget-object v5, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->REQUIRED:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :goto_2
    sget-object v5, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethod$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethod$1;

    .line 29
    .line 30
    sget-object v6, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethod$2;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethod$2;

    .line 31
    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    invoke-interface {v3}, Lhw;->invoke()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_2
    move-object v3, v2

    .line 42
    :goto_3
    sget-object v7, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 43
    .line 44
    iget-object v8, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 45
    .line 46
    const-string v9, "s"

    .line 47
    .line 48
    invoke-virtual {v7, v8, v9, v4, v3}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    new-instance v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;

    .line 55
    .line 56
    invoke-direct {v2, v0, v5, v3, v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;Lorg/luckypray/dexkit/query/base/BaseFinder;Lsw;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    move-object v14, v2

    .line 60
    const/4 v15, 0x0

    .line 61
    const/16 v16, 0x1

    .line 62
    .line 63
    if-nez v4, :cond_4

    .line 64
    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    move/from16 v2, v16

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_4
    move v2, v15

    .line 71
    :goto_4
    sget-object v6, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 72
    .line 73
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 74
    .line 75
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v6, v3, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->shouldCacheFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    new-instance v13, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$1;

    .line 96
    .line 97
    invoke-direct {v13, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$1;-><init>(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v6 .. v14}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedSingle(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v2}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    if-nez v6, :cond_6

    .line 117
    .line 118
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_7

    .line 131
    .line 132
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    move-object v9, v2

    .line 137
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 138
    .line 139
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 140
    .line 141
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 145
    .line 146
    move-object v3, v7

    .line 147
    check-cast v3, Lorg/luckypray/dexkit/wrap/ISerializable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    .line 149
    if-nez v3, :cond_5

    .line 150
    .line 151
    move v6, v15

    .line 152
    :goto_6
    move-object v3, v1

    .line 153
    goto :goto_7

    .line 154
    :cond_5
    move/from16 v6, v16

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :goto_7
    :try_start_1
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 158
    .line 159
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 163
    .line 164
    .line 165
    goto :goto_8

    .line 166
    :catchall_0
    move-object v3, v1

    .line 167
    :catchall_1
    :goto_8
    move-object/from16 v4, p1

    .line 168
    .line 169
    move-object v1, v3

    .line 170
    goto :goto_5

    .line 171
    :cond_6
    move-object v3, v1

    .line 172
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    :catchall_2
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_7

    .line 185
    .line 186
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    move-object v9, v1

    .line 191
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 192
    .line 193
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 194
    .line 195
    :try_start_2
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 199
    .line 200
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 201
    .line 202
    move-object/from16 v4, p1

    .line 203
    .line 204
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 208
    .line 209
    .line 210
    goto :goto_9

    .line 211
    :cond_7
    invoke-static {v7}, Lw60;->M(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    check-cast v7, Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 215
    .line 216
    return-object v7
.end method

.method public static synthetic innerGetMethod$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private final innerGetMethodDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lsw;",
            ")",
            "Lorg/luckypray/dexkit/wrap/DexMethod;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->METHOD_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    sget-object v2, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->NULLABLE:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 10
    .line 11
    :goto_0
    move-object v9, v2

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    sget-object v2, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->REQUIRED:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1;

    .line 17
    .line 18
    sget-object v10, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 19
    .line 20
    iget-object v11, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 21
    .line 22
    const/16 v15, 0x8

    .line 23
    .line 24
    const/16 v16, 0x0

    .line 25
    .line 26
    const-string v12, "s"

    .line 27
    .line 28
    const/4 v14, 0x0

    .line 29
    move-object/from16 v13, p1

    .line 30
    .line 31
    invoke-static/range {v10 .. v16}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf$default(Lorg/luckypray/dexkit/cache/CacheBridgeKeys;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;ILjava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1;

    .line 38
    .line 39
    invoke-direct {v4, v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lsw;Lsw;)V

    .line 40
    .line 41
    .line 42
    :goto_2
    move-object v12, v4

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const/4 v4, 0x0

    .line 45
    goto :goto_2

    .line 46
    :goto_3
    sget-object v4, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 47
    .line 48
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 49
    .line 50
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const/4 v13, 0x0

    .line 67
    invoke-virtual {v4, v1, v13}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->shouldCacheFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    new-instance v11, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1;

    .line 72
    .line 73
    invoke-direct {v11, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1;-><init>(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual/range {v4 .. v12}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedSingle(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-nez v6, :cond_3

    .line 93
    .line 94
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    :catchall_0
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    move-object v9, v1

    .line 113
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 114
    .line 115
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 116
    .line 117
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 121
    .line 122
    move-object v1, v7

    .line 123
    check-cast v1, Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 124
    .line 125
    if-nez v1, :cond_2

    .line 126
    .line 127
    move v6, v13

    .line 128
    goto :goto_5

    .line 129
    :cond_2
    const/4 v1, 0x1

    .line 130
    move v6, v1

    .line 131
    :goto_5
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 132
    .line 133
    move-object/from16 v4, p1

    .line 134
    .line 135
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_3
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    :catchall_1
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_4

    .line 155
    .line 156
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    move-object v9, v1

    .line 161
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 162
    .line 163
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 164
    .line 165
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 169
    .line 170
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 171
    .line 172
    move-object/from16 v4, p1

    .line 173
    .line 174
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_4
    invoke-static {v7}, Lw60;->M(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    check-cast v7, Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 185
    .line 186
    return-object v7
.end method

.method public static synthetic innerGetMethodDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLsw;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethodDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lorg/luckypray/dexkit/query/FindMethod;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    new-instance v3, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$buildQuery$1$1;

    .line 9
    .line 10
    invoke-direct {v3, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$buildQuery$1$1;-><init>(Lorg/luckypray/dexkit/query/FindMethod;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v3, v2

    .line 15
    :goto_0
    sget-object v6, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->METHOD_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 16
    .line 17
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$1;

    .line 18
    .line 19
    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$2;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$2;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-interface {v3}, Lhw;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v3, v2

    .line 31
    :goto_1
    sget-object v5, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 32
    .line 33
    iget-object v7, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 34
    .line 35
    const-string v8, "l"

    .line 36
    .line 37
    move-object/from16 v9, p1

    .line 38
    .line 39
    invoke-virtual {v5, v7, v8, v9, v3}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v14

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    new-instance v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1;

    .line 46
    .line 47
    invoke-direct {v2, v0, v1, v3, v4}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;Lorg/luckypray/dexkit/query/base/BaseFinder;Lsw;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    move-object/from16 v17, v2

    .line 51
    .line 52
    sget-object v10, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 53
    .line 54
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 55
    .line 56
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;-><init>(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move/from16 v15, p2

    .line 74
    .line 75
    move-object/from16 v16, v1

    .line 76
    .line 77
    invoke-virtual/range {v10 .. v17}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedList(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    if-nez v9, :cond_3

    .line 94
    .line 95
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    :catchall_0
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_4

    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 114
    .line 115
    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 116
    .line 117
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v5, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 121
    .line 122
    move-object v4, v1

    .line 123
    check-cast v4, Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 130
    .line 131
    move-object/from16 v7, p1

    .line 132
    .line 133
    invoke-direct/range {v4 .. v9}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v4}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_3
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    :catchall_1
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_4

    .line 153
    .line 154
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 159
    .line 160
    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 161
    .line 162
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 166
    .line 167
    iget-object v5, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 168
    .line 169
    move-object/from16 v7, p1

    .line 170
    .line 171
    invoke-direct/range {v4 .. v9}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v4}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_4
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    check-cast v1, Ljava/util/List;

    .line 182
    .line 183
    return-object v1
.end method

.method public static synthetic innerGetMethods$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;ILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private final innerGetMethodsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lsw;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->METHOD_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 6
    .line 7
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethodsDirect$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethodsDirect$1;

    .line 8
    .line 9
    sget-object v4, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 10
    .line 11
    iget-object v5, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 12
    .line 13
    const/16 v9, 0x8

    .line 14
    .line 15
    const/4 v10, 0x0

    .line 16
    const-string v6, "l"

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    move-object/from16 v7, p1

    .line 20
    .line 21
    invoke-static/range {v4 .. v10}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cacheKeyOf$default(Lorg/luckypray/dexkit/cache/CacheBridgeKeys;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/luckypray/dexkit/query/base/BaseFinder;ILjava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v15

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1;

    .line 28
    .line 29
    invoke-direct {v4, v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lsw;Lsw;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    move-object/from16 v18, v4

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const/4 v4, 0x0

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    sget-object v11, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 38
    .line 39
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 40
    .line 41
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 42
    .line 43
    .line 44
    move-result-object v12

    .line 45
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 46
    .line 47
    .line 48
    move-result-object v13

    .line 49
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 50
    .line 51
    .line 52
    move-result-object v14

    .line 53
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1;

    .line 54
    .line 55
    invoke-direct {v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1;-><init>(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move/from16 v16, p2

    .line 59
    .line 60
    move-object/from16 v17, v1

    .line 61
    .line 62
    invoke-virtual/range {v11 .. v18}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedList(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLhw;Lhw;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-static {v7}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    if-nez v6, :cond_1

    .line 79
    .line 80
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    :catchall_0
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    move-object v9, v1

    .line 99
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 100
    .line 101
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 102
    .line 103
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 107
    .line 108
    move-object v1, v7

    .line 109
    check-cast v1, Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 116
    .line 117
    move-object/from16 v4, p1

    .line 118
    .line 119
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_1
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    :catchall_1
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_2

    .line 139
    .line 140
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    move-object v9, v1

    .line 145
    check-cast v9, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 146
    .line 147
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 148
    .line 149
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 153
    .line 154
    iget-object v2, v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 155
    .line 156
    move-object/from16 v4, p1

    .line 157
    .line 158
    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_2
    invoke-static {v7}, Lw60;->M(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    check-cast v7, Ljava/util/List;

    .line 169
    .line 170
    return-object v7
.end method

.method public static synthetic innerGetMethodsDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;ZLsw;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethodsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final notifyQueryResult-nnTlf9I(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;Lsw;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;",
            "Ljava/lang/Object;",
            "Lsw;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p4}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v5

    .line 5
    if-nez v5, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 26
    .line 27
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 33
    .line 34
    iget-object v4, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 35
    .line 36
    invoke-interface {p5, p4}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 46
    move-object v5, p1

    .line 47
    move-object v6, p2

    .line 48
    move-object v7, p3

    .line 49
    :try_start_1
    invoke-direct/range {v3 .. v8}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    move-object p1, v3

    .line 53
    move-object v2, v5

    .line 54
    move-object v3, v6

    .line 55
    move-object v4, v7

    .line 56
    :try_start_2
    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-object v2, v5

    .line 61
    move-object v3, v6

    .line 62
    move-object v4, v7

    .line 63
    goto :goto_1

    .line 64
    :catchall_1
    move-object v2, p1

    .line 65
    move-object v3, p2

    .line 66
    move-object v4, p3

    .line 67
    :catchall_2
    :goto_1
    move-object p1, v2

    .line 68
    move-object p2, v3

    .line 69
    move-object p3, v4

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move-object v2, p1

    .line 72
    move-object v3, p2

    .line 73
    move-object v4, p3

    .line 74
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :catchall_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_1

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    check-cast p2, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 93
    .line 94
    sget-object p3, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 95
    .line 96
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 100
    .line 101
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 102
    .line 103
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_1
    return-object p4
.end method

.method private final observeLoad-BWLJW6A(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;Lsw;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult<",
            "TT;>;",
            "Lsw;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 2
    .line 3
    .line 4
    move-result-object v4

    .line 5
    invoke-virtual {p3}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;->getResult-d1pmJ48()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-static {p3}, Lcv0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v7, v0

    .line 34
    check-cast v7, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 35
    .line 36
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 37
    .line 38
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 42
    .line 43
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 44
    .line 45
    invoke-interface {p4, p3}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    move-object v2, p1

    .line 56
    move-object v3, p2

    .line 57
    :try_start_1
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQuerySuccess(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-object v2, p1

    .line 65
    move-object v3, p2

    .line 66
    :catchall_1
    :goto_1
    move-object p1, v2

    .line 67
    move-object p2, v3

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move-object v2, p1

    .line 70
    move-object v3, p2

    .line 71
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :catchall_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_1

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    check-cast p2, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 90
    .line 91
    sget-object p4, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 92
    .line 93
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;

    .line 97
    .line 98
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->appTag:Ljava/lang/String;

    .line 99
    .line 100
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onQueryFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_1
    return-object p3
.end method

.method private final toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;)Lsw;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;",
            ")",
            "Lsw;"
        }
    .end annotation

    .line 7
    new-instance p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2;

    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method private final toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;)Lsw;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;",
            ")",
            "Lsw;"
        }
    .end annotation

    .line 10
    new-instance p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$5;

    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$5;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method private final toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;)Lsw;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;",
            ")",
            "Lsw;"
        }
    .end annotation

    .line 8
    new-instance p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$3;

    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$3;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method private final toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;)Lsw;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;",
            ")",
            "Lsw;"
        }
    .end annotation

    .line 11
    new-instance p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$6;

    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$6;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method private final toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;)Lsw;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;",
            ")",
            "Lsw;"
        }
    .end annotation

    .line 1
    new-instance p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$1;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$1;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method private final toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;)Lsw;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;",
            ")",
            "Lsw;"
        }
    .end annotation

    .line 9
    new-instance p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$4;

    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$4;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method private final toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 0

    .line 13
    new-instance p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;-><init>()V

    invoke-interface {p1, p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;->build(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)V

    return-object p0
.end method

.method private final toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0

    .line 12
    new-instance p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;-><init>()V

    invoke-interface {p1, p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;->build(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)V

    return-object p0
.end method

.method private final toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 0

    .line 10
    new-instance p0, Lorg/luckypray/dexkit/query/FindClass;

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    invoke-interface {p1, p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;->build(Lorg/luckypray/dexkit/query/FindClass;)V

    return-object p0
.end method

.method private final toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/query/FindField;
    .locals 0

    .line 11
    new-instance p0, Lorg/luckypray/dexkit/query/FindField;

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    invoke-interface {p1, p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;->build(Lorg/luckypray/dexkit/query/FindField;)V

    return-object p0
.end method

.method private final toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 0

    .line 1
    new-instance p0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;->build(Lorg/luckypray/dexkit/query/FindMethod;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getRuntime()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->close()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final destroy()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getRuntime()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->destroy()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final getBatchUsingStringsClasses(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;>;"
        }
    .end annotation

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getBatchUsingStringsClasses$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final getBatchUsingStringsClasses(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 22
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 23
    :goto_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsClasses(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final getBatchUsingStringsClasses(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsClasses(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getBatchUsingStringsClasses(Ljava/lang/String;Lsw;)Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsClasses(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final getBatchUsingStringsClasses(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindClassUsingStringsBuilder;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    move-result-object p1

    .line 21
    invoke-direct {p0, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsClasses(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final getBatchUsingStringsClasses(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsClasses(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getBatchUsingStringsClasses(Lsw;)Ljava/util/Map;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 27
    invoke-direct {p0, p1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsClasses(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final getBatchUsingStringsMethods(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;>;"
        }
    .end annotation

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getBatchUsingStringsMethods$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final getBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 22
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 23
    :goto_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final getBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getBatchUsingStringsMethods(Ljava/lang/String;Lsw;)Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final getBatchUsingStringsMethods(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BatchFindMethodUsingStringsBuilder;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object p1

    .line 21
    invoke-direct {p0, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final getBatchUsingStringsMethods(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getBatchUsingStringsMethods(Lsw;)Ljava/util/Map;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 27
    invoke-direct {p0, p1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final getClass(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 2

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClass$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method

.method public final getClass(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 26
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final synthetic getClass(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final getClass(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object p1

    const/4 v1, 0x0

    .line 25
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final synthetic getClass(Lsw;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 31
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getClassDirect(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 2

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClassDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method

.method public final getClassDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClassDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexClass;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public final synthetic getClassDirect(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClassDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getClassDirectOrNull(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 2

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClassDirectOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method

.method public final getClassDirectOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClassDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexClass;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final synthetic getClassDirectOrNull(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 19
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClassDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method

.method public final getClassOrNull(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 2

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClassOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method

.method public final getClassOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 23
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x1

    .line 24
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method

.method public final getClassOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 26
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getClassOrNull(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final getClassOrNull(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 21
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object p1

    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method

.method public final getClassOrNull(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 25
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getClassOrNull(Lsw;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x1

    .line 28
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClass(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method

.method public final getClasses(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClasses$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getClasses(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 23
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getClasses(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/FindClass;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getClasses(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final getClasses(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object p1

    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getClasses(Lorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/FindClass;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 25
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getClasses(Lsw;)Ljava/util/List;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getClassesDirect(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClassesDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getClassesDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClassesDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final synthetic getClassesDirect(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClassesDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getClassesDirectOrEmpty(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getClassesDirectOrEmpty$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getClassesDirectOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassesBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClassesDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final synthetic getClassesDirectOrEmpty(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 19
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClassesDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getClassesOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 21
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x1

    .line 22
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getClassesOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/FindClass;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 24
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getClassesOrEmpty(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final getClassesOrEmpty(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 27
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindClassBuilder;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object p1

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getClassesOrEmpty(Lorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/FindClass;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 23
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getClassesOrEmpty(Lsw;)Ljava/util/List;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x1

    .line 26
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetClasses(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindClass;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getField(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getField$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public final getField(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 26
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getField(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final synthetic getField(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final getField(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object p1

    const/4 v1, 0x0

    .line 25
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final synthetic getField(Lsw;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 31
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getFieldDirect(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFieldDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFieldDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexField;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public final synthetic getFieldDirect(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFieldDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getFieldDirectOrNull(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFieldDirectOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldDirectOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFieldDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexField;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final synthetic getFieldDirectOrNull(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 19
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFieldDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldOrNull(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFieldOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 23
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x1

    .line 24
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 26
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getFieldOrNull(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final getFieldOrNull(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 21
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object p1

    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldOrNull(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 25
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getFieldOrNull(Lsw;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x1

    .line 28
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetField(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public final getFields(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFields$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getFields(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 23
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getFields(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindField;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/FindField;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getFields(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final getFields(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object p1

    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getFields(Lorg/luckypray/dexkit/query/FindField;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/FindField;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 25
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getFields(Lsw;)Ljava/util/List;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldsDirect(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFieldsDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldsDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFieldsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final synthetic getFieldsDirect(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFieldsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldsDirectOrEmpty(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getFieldsDirectOrEmpty$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldsDirectOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldsBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFieldsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final synthetic getFieldsDirectOrEmpty(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 19
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFieldsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldsOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 21
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x1

    .line 22
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldsOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindField;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/FindField;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 24
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getFieldsOrEmpty(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final getFieldsOrEmpty(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 27
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindFieldBuilder;)Lorg/luckypray/dexkit/query/FindField;

    move-result-object p1

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldsOrEmpty(Lorg/luckypray/dexkit/query/FindField;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/FindField;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexField;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 23
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getFieldsOrEmpty(Lsw;)Ljava/util/List;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x1

    .line 26
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getMethod(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 2

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethod$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public final getMethod(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 26
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getMethod(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final synthetic getMethod(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final getMethod(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object p1

    const/4 v1, 0x0

    .line 25
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final synthetic getMethod(Lsw;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 31
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getMethodDirect(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 2

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethodDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethodDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public final synthetic getMethodDirect(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethodDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final getMethodDirectOrNull(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 2

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethodDirectOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodDirectOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethodDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final synthetic getMethodDirectOrNull(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 19
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethodDirect(Ljava/lang/String;ZLsw;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodOrNull(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 2

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethodOrNull$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;ILjava/lang/Object;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 23
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x1

    .line 24
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodOrNull(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 26
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getMethodOrNull(Ljava/lang/String;Lsw;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final getMethodOrNull(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 21
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object p1

    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodOrNull(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 25
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getMethodOrNull(Lsw;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x1

    .line 28
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethod(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public final getMethods(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethods$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getMethods(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 23
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getMethods(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/FindMethod;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getMethods(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final getMethods(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object p1

    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getMethods(Lorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/FindMethod;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 25
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getMethods(Lsw;)Ljava/util/List;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodsDirect(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethodsDirect$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodsDirect(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethodsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final synthetic getMethodsDirect(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethodsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodsDirectOrEmpty(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getMethodsDirectOrEmpty$default(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodsDirectOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeMethodsBuilder;)Lsw;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethodsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final synthetic getMethodsDirectOrEmpty(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 19
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethodsDirect(Ljava/lang/String;ZLsw;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodsOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 21
    invoke-direct {p0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x1

    .line 22
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodsOrEmpty(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/FindMethod;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 24
    invoke-direct {p0, p1, v0, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getMethodsOrEmpty(Ljava/lang/String;Lsw;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final getMethodsOrEmpty(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 27
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$FindMethodBuilder;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object p1

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0, v1, v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodsOrEmpty(Lorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/FindMethod;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 23
    invoke-direct {p0, v0, v1, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getMethodsOrEmpty(Lsw;)Ljava/util/List;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 v1, 0x1

    .line 26
    invoke-direct {p0, p1, v1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final isRetired()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getRuntime()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->isDestroyed()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final withBridge(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFunction;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->access$getRuntime(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$beginUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getLifecycleLock$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    :try_start_1
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getCreateBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lhw;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Lhw;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 32
    .line 33
    invoke-static {p0, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$setBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;Lorg/luckypray/dexkit/DexKitBridge;)V

    .line 34
    .line 35
    .line 36
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    const/4 v2, 0x0

    .line 43
    :goto_0
    :try_start_2
    monitor-exit v0

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getNotifyBridgeCreated$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lhw;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_1
    move-exception p1

    .line 55
    goto :goto_3

    .line 56
    :cond_1
    :goto_1
    invoke-interface {p1, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFunction;->apply(Lorg/luckypray/dexkit/DexKitBridge;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :goto_2
    :try_start_3
    monitor-exit v0

    .line 64
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 65
    :goto_3
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method

.method public final synthetic withBridge(Lsw;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->access$getRuntime(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    move-result-object p0

    .line 70
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$beginUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 71
    :try_start_0
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getLifecycleLock$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 72
    :try_start_1
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getCreateBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lhw;

    move-result-object v1

    invoke-interface {v1}, Lhw;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 73
    invoke-static {p0, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$setBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;Lorg/luckypray/dexkit/DexKitBridge;)V

    .line 74
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 v2, 0x0

    .line 75
    :goto_0
    :try_start_2
    monitor-exit v0

    if-eqz v2, :cond_1

    .line 76
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getNotifyBridgeCreated$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lhw;

    move-result-object v0

    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 77
    :cond_1
    :goto_1
    invoke-interface {p1, v1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 78
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    return-void

    .line 79
    :goto_2
    :try_start_3
    monitor-exit v0

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 80
    :goto_3
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    throw p1
.end method
