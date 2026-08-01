.class public final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getInternalMap-yxL6bBk(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lp70;Le80;La80;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbp0;",
        "Lp70;"
    }
.end annotation


# instance fields
.field final synthetic $executor:Le80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le80;"
        }
    .end annotation
.end field

.field final synthetic $mapper:La80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La80;"
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
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Le80;Lorg/luckypray/dexkit/query/base/BaseFinder;La80;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;",
            "Le80;",
            "TQ;",
            "La80;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;->$executor:Le80;

    .line 4
    .line 5
    iput-object p3, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;->$query:Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 6
    .line 7
    iput-object p4, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;->$mapper:La80;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 162
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;->invoke()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "TR;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;->$executor:Le80;

    .line 4
    .line 5
    iget-object v2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;->$query:Lorg/luckypray/dexkit/query/base/BaseFinder;

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1;->$mapper:La80;

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
    if-nez v4, :cond_0

    .line 26
    .line 27
    invoke-static {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getCreateBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lp70;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-interface {v4}, Lp70;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    move-object v5, v4

    .line 36
    check-cast v5, Lorg/luckypray/dexkit/DexKitBridge;

    .line 37
    .line 38
    invoke-static {v0, v5}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$setBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;Lorg/luckypray/dexkit/DexKitBridge;)V

    .line 39
    .line 40
    .line 41
    check-cast v4, Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_4

    .line 47
    :cond_0
    const/4 v5, 0x0

    .line 48
    :goto_0
    :try_start_2
    monitor-exit v3

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    invoke-static {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getNotifyBridgeCreated$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lp70;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v3}, Lp70;->invoke()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_1
    move-exception p0

    .line 60
    goto :goto_5

    .line 61
    :cond_1
    :goto_1
    invoke-interface {v1, v4, v2}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/util/Map;

    .line 66
    .line 67
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v3}, Lex0;->Κ(I)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/Iterable;

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    move-object v4, v3

    .line 101
    check-cast v4, Ljava/util/Map$Entry;

    .line 102
    .line 103
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v3, Ljava/util/Map$Entry;

    .line 108
    .line 109
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Ljava/lang/Iterable;

    .line 114
    .line 115
    new-instance v5, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/16 v6, 0xa

    .line 118
    .line 119
    invoke-static {v3, v6}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_2

    .line 135
    .line 136
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-interface {p0, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_2
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_3
    invoke-static {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 153
    .line 154
    .line 155
    return-object v2

    .line 156
    :goto_4
    :try_start_3
    monitor-exit v3

    .line 157
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 158
    :goto_5
    invoke-static {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 159
    .line 160
    .line 161
    throw p0
.end method
