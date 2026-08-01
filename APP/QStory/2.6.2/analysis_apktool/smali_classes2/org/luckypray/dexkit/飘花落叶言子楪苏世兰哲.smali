.class public final Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Lkotlin/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/lang/ClassLoader;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/String;

.field public final 飘花落叶言子楪哲兰苏世:[[B

.field public final 飘花落叶言子楪哲苏兰世:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:[[B

    .line 9
    .line 10
    iput-object p4, p0, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/ClassLoader;

    .line 11
    .line 12
    sget-object p1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 13
    .line 14
    new-instance p2, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;

    .line 15
    .line 16
    invoke-direct {p2, p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;-><init>(Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_3

    .line 15
    .line 16
    iget-wide v1, p0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲:J

    .line 17
    .line 18
    const-wide/16 v3, 0x1

    .line 19
    .line 20
    add-long/2addr v1, v3

    .line 21
    iput-wide v1, p0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲:J

    .line 22
    .line 23
    iget-object v1, p0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰:Ljava/util/concurrent/ScheduledFuture;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_2

    .line 34
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 35
    iput-object v1, p0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰:Ljava/util/concurrent/ScheduledFuture;

    .line 36
    .line 37
    iget v1, p0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:I

    .line 38
    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    iput-boolean v2, p0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世:Z

    .line 42
    .line 43
    invoke-virtual {p0}, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {p0}, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v1, 0x1

    .line 52
    iput-boolean v1, p0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    iget-object p0, p0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 58
    .line 59
    invoke-interface {p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void

    .line 63
    :cond_3
    :try_start_1
    const-string p0, "RecyclableBridge is destroyed"

    .line 64
    .line 65
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    :goto_2
    monitor-exit v0

    .line 72
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    return-object p0
.end method
