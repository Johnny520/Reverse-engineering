.class public final Lh/Hchat/dexkit/DexBridgeHolder;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final TAG:Ljava/lang/String; = "[Hchat:DexBridgeHolder]"


# instance fields
.field private final apkPath:Ljava/lang/String;

.field private final dexFinder:Lh/Hchat/dexkit/DexFinder;

.field private final dexKitBridge:Lorg/luckypray/dexkit/DexKitBridge;

.field private final hostClassLoader:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/Hchat/dexkit/DexBridgeHolder;->dexKitBridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 5
    .line 6
    iput-object p2, p0, Lh/Hchat/dexkit/DexBridgeHolder;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 7
    .line 8
    iput-object p3, p0, Lh/Hchat/dexkit/DexBridgeHolder;->hostClassLoader:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    iput-object p4, p0, Lh/Hchat/dexkit/DexBridgeHolder;->apkPath:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public varargs findClassesByStrings([Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lh/Hchat/dexkit/DexBridgeHolder;->dexKitBridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    :try_start_0
    new-instance v1, Lch/c;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v2, Lfh/a;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v2, p1}, Lfh/a;->r0(Lfh/a;Ljava/util/Collection;)V

    .line 31
    .line 32
    .line 33
    iput-object v2, v1, Lch/c;->h:Lfh/a;

    .line 34
    .line 35
    iget-object p1, p0, Lh/Hchat/dexkit/DexBridgeHolder;->dexKitBridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lhh/i;

    .line 56
    .line 57
    invoke-virtual {v1}, Lhh/i;->p()Llh/a;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v1, v1, Llh/a;->g:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v2, "[Hchat:DexBridgeHolder] findClassesByStrings \u5931\u8d25: "

    .line 71
    .line 72
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v1, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    :goto_1
    return-object v0
.end method

.method public varargs findMethodsByStrings([Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Le8/a;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lh/Hchat/dexkit/DexBridgeHolder;->dexKitBridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    :try_start_0
    new-instance v1, Lch/e;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v2, Lfh/k;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v2, p1}, Lfh/k;->t0(Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    iput-object v2, v1, Lch/e;->h:Lfh/k;

    .line 31
    .line 32
    iget-object p1, p0, Lh/Hchat/dexkit/DexBridgeHolder;->dexKitBridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lhh/o;

    .line 53
    .line 54
    new-instance v2, Le8/a;

    .line 55
    .line 56
    invoke-virtual {v1}, Lhh/o;->p()Llh/d;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget-object v3, v3, Llh/d;->g:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v1}, Lhh/o;->p()Llh/d;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v1, v1, Llh/d;->h:Ljava/lang/String;

    .line 67
    .line 68
    invoke-direct {v2, v3, v1}, Le8/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v2, "[Hchat:DexBridgeHolder] findMethodsByStrings \u5931\u8d25: "

    .line 79
    .line 80
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p1, v1, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    :goto_1
    return-object v0
.end method

.method public getApkPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/dexkit/DexBridgeHolder;->apkPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDexFinder()Lh/Hchat/dexkit/DexFinder;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/dexkit/DexBridgeHolder;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDexKitBridge()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/dexkit/DexBridgeHolder;->dexKitBridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHostClassLoader()Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/dexkit/DexBridgeHolder;->hostClassLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    return-object v0
.end method
