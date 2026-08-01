.class public final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;
.super Ld9;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lj5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getInternalSingle-hUnOzRk(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;Lj5;Ly5;Lu5;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld9;",
        "Lj5;"
    }
.end annotation


# instance fields
.field final synthetic $executor:Ly5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly5;"
        }
    .end annotation
.end field

.field final synthetic $mapper:Lu5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu5;"
        }
    .end annotation
.end field

.field final synthetic $query:Lorg/luckypray/dexkit/query/base/BaseFinder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TQ;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ly5;Lorg/luckypray/dexkit/query/base/BaseFinder;Lu5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;",
            "Ly5;",
            "TQ;",
            "Lu5;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;->$executor:Ly5;

    .line 4
    .line 5
    iput-object p3, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;->$query:Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 6
    .line 7
    iput-object p4, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;->$mapper:Lu5;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Ld9;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 149
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;->invoke()Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome<",
            "TR;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;->$executor:Ly5;

    .line 4
    .line 5
    iget-object v2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;->$query:Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1;->$mapper:Lu5;

    .line 8
    .line 9
    invoke-static {v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->access$getRuntime(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$beginUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-static {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getLifecycleLock$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    :try_start_1
    invoke-static {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x1

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    invoke-static {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getCreateBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lj5;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-interface {v4}, Lj5;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    move-object v7, v4

    .line 38
    check-cast v7, Lorg/luckypray/dexkit/DexKitBridge;

    .line 39
    .line 40
    invoke-static {v0, v7}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$setBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;Lorg/luckypray/dexkit/DexKitBridge;)V

    .line 41
    .line 42
    .line 43
    check-cast v4, Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    move v7, v6

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_5

    .line 49
    :cond_0
    move v7, v5

    .line 50
    :goto_0
    :try_start_2
    monitor-exit v3

    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    invoke-static {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getNotifyBridgeCreated$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lj5;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-interface {v3}, Lj5;->invoke()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception p0

    .line 62
    goto :goto_6

    .line 63
    :cond_1
    :goto_1
    invoke-interface {v1, v4, v2}, Ly5;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/util/List;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    const/4 v3, 0x0

    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    move-object v2, v3

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :goto_2
    if-nez v2, :cond_3

    .line 86
    .line 87
    new-instance p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;

    .line 88
    .line 89
    invoke-direct {p0, v3, v6, v3}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;-><init>(Lorg/luckypray/dexkit/exceptions/NoResultException;ILr2;)V

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    :goto_3
    if-ge v6, v3, :cond_5

    .line 98
    .line 99
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_4

    .line 108
    .line 109
    new-instance p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;

    .line 110
    .line 111
    new-instance v2, Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-direct {v2, v1}, Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-direct {p0, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;-><init>(Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;)V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    new-instance v1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;

    .line 128
    .line 129
    invoke-interface {p0, v2}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 134
    .line 135
    invoke-direct {v1, p0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;-><init>(Lorg/luckypray/dexkit/wrap/ISerializable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 136
    .line 137
    .line 138
    move-object p0, v1

    .line 139
    :goto_4
    invoke-static {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 140
    .line 141
    .line 142
    return-object p0

    .line 143
    :goto_5
    :try_start_3
    monitor-exit v3

    .line 144
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 145
    :goto_6
    invoke-static {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 146
    .line 147
    .line 148
    throw p0
.end method
