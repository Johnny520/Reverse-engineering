.class public final Lyyds/ᛵᛸᛵᛱ;
.super Lyyds/ᛴᲇᛴᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲈᛲᛱ;


# instance fields
.field public final ᛲᛴᛳᛲ:Z

.field public final ᲇᲇᲇᛱ:Lyyds/ᛵᛸᛵᛱ;

.field public final ᲇᲈᛵᛷ:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lyyds/ᛴᲇᛴᛲ;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛵᛸᛵᛱ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 5
    .line 6
    iput-boolean p2, p0, Lyyds/ᛵᛸᛵᛱ;->ᛲᛴᛳᛲ:Z

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    move-object p2, p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p2, Lyyds/ᛵᛸᛵᛱ;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-direct {p2, p1, v0}, Lyyds/ᛵᛸᛵᛱ;-><init>(Landroid/os/Handler;Z)V

    .line 16
    .line 17
    .line 18
    :goto_0
    iput-object p2, p0, Lyyds/ᛵᛸᛵᛱ;->ᲇᲇᲇᛱ:Lyyds/ᛵᛸᛵᛱ;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lyyds/ᛵᛸᛵᛱ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛵᛸᛵᛱ;

    .line 6
    .line 7
    iget-object v0, p1, Lyyds/ᛵᛸᛵᛱ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 8
    .line 9
    iget-object v1, p0, Lyyds/ᛵᛸᛵᛱ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-boolean p1, p1, Lyyds/ᛵᛸᛵᛱ;->ᛲᛴᛳᛲ:Z

    .line 14
    .line 15
    iget-boolean p0, p0, Lyyds/ᛵᛸᛵᛱ;->ᛲᛴᛳᛲ:Z

    .line 16
    .line 17
    if-ne p1, p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛸᛵᛱ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-boolean p0, p0, Lyyds/ᛵᛸᛵᛱ;->ᛲᛴᛳᛲ:Z

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/16 p0, 0x4cf

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 p0, 0x4d5

    .line 15
    .line 16
    :goto_0
    xor-int/2addr p0, v0

    .line 17
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 2
    .line 3
    sget-object v0, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Dispatchers.Main"

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :try_start_0
    iget-object v0, v0, Lyyds/ᛵᛸᛵᛱ;->ᲇᲇᲇᛱ:Lyyds/ᛵᛸᛵᛱ;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-object v0, v1

    .line 15
    :goto_0
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    const-string v0, "Dispatchers.Main.immediate"

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v0, v1

    .line 21
    :goto_1
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lyyds/ᛵᛸᛵᛱ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-boolean p0, p0, Lyyds/ᛵᛸᛵᛱ;->ᛲᛴᛳᛲ:Z

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    new-instance p0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, ".immediate"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    move-object v0, p0

    .line 51
    :cond_2
    return-object v0
.end method

.method public final ᛱᛸᲁᲇ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, "\' was closed"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lyyds/ᛷᛶᲇᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛶᲇᲁ;

    .line 26
    .line 27
    invoke-interface {p1, p0}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lyyds/ᲈᲇᲈᲇ;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    invoke-interface {p0, v0}, Lyyds/ᲈᲇᲈᲇ;->ᛵᲀᲈᛴ(Ljava/util/concurrent/CancellationException;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    sget-object p0, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 39
    .line 40
    sget-object p0, Lyyds/ᲇᛷᛶᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛷᛶᛲ;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Lyyds/ᲇᛷᛶᛲ;->ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final ᛳᛸᛴᛶ(JLyyds/ᛸᲀᛱᛴ;)V
    .locals 5

    .line 1
    new-instance v0, Lyyds/ᲈᛵᛶᛲ;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, p3, p0, v2}, Lyyds/ᲈᛵᛶᛲ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 6
    .line 7
    .line 8
    const-wide v3, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmp-long v1, p1, v3

    .line 14
    .line 15
    if-lez v1, :cond_0

    .line 16
    .line 17
    move-wide p1, v3

    .line 18
    :cond_0
    iget-object v1, p0, Lyyds/ᛵᛸᛵᛱ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 19
    .line 20
    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    new-instance p1, Lyyds/ᲀᛵᛱᛱ;

    .line 27
    .line 28
    invoke-direct {p1, p0, v2, v0}, Lyyds/ᲀᛵᛱᛱ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance p0, Lyyds/ᛲᛶᲇᲇ;

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-direct {p0, p2, p1}, Lyyds/ᛲᛶᲇᲇ;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3, p0}, Lyyds/ᛸᲀᛱᛴ;->ᲈᲀᛲᲀ(Lyyds/ᛳᛴᲀᲈ;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget-object p1, p3, Lyyds/ᛸᲀᛱᛴ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛴᛲ;

    .line 42
    .line 43
    invoke-virtual {p0, p1, v0}, Lyyds/ᛵᛸᛵᛱ;->ᛱᛸᲁᲇ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛸᛵᛱ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛸᛵᛱ;->ᛱᛸᲁᲇ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final ᛸᛸᛷᛱ(JLyyds/ᲀᛴᛸᛴ;Lyyds/ᲁᛴᛲ;)Lyyds/ᛴᲇᛲᛱ;
    .locals 3

    .line 1
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    if-lez v2, :cond_0

    .line 9
    .line 10
    move-wide p1, v0

    .line 11
    :cond_0
    iget-object v0, p0, Lyyds/ᛵᛸᛵᛱ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 12
    .line 13
    invoke-virtual {v0, p3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Lyyds/ᲀᲈᲀᛱ;

    .line 20
    .line 21
    invoke-direct {p1, p0, p3}, Lyyds/ᲀᲈᲀᛱ;-><init>(Lyyds/ᛵᛸᛵᛱ;Lyyds/ᲀᛴᛸᛴ;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    invoke-virtual {p0, p4, p3}, Lyyds/ᛵᛸᛵᛱ;->ᛱᛸᲁᲇ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lyyds/ᲁᲀᲈᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲁᲀᲈᲇ;

    .line 29
    .line 30
    return-object p0
.end method

.method public final ᲈᛷᲈᛶ(Lyyds/ᲁᛴᛲ;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Lyyds/ᛵᛸᛵᛱ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Lyyds/ᛵᛸᛵᛱ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p1, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method
