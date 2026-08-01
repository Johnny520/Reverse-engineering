.class public final Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/concurrent/locks/Lock;


# virtual methods
.method public final lock()V
    .locals 0

    .line 1
    return-void
.end method

.method public final lockInterruptibly()V
    .locals 0

    .line 1
    return-void
.end method

.method public final newCondition()Ljava/util/concurrent/locks/Condition;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Should not be called"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final tryLock()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final tryLock(JLjava/util/concurrent/TimeUnit;)Z
    .locals 0

    .line 3
    const/4 p0, 0x1

    return p0
.end method

.method public final unlock()V
    .locals 0

    .line 1
    return-void
.end method
