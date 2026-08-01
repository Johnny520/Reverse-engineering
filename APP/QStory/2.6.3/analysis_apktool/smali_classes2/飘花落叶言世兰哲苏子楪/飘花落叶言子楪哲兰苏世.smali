.class public final L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;


# direct methods
.method public constructor <init>(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    new-instance p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 1
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    iget-boolean v1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 4
    .line 5
    if-nez v1, :cond_3

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    iget-wide v2, v1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    cmp-long v4, v2, v4

    .line 14
    .line 15
    if-lez v4, :cond_0

    .line 16
    .line 17
    invoke-interface {v0, v1, v2, v3}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪哲世兰(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 24
    :goto_1
    :try_start_1
    invoke-interface {v0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    move-object v1, v0

    .line 32
    :cond_1
    :goto_2
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_2
    throw v1

    .line 39
    :cond_3
    :goto_3
    return-void
.end method

.method public final flush()V
    .locals 5

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    iget-wide v1, v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    cmp-long v3, v1, v3

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    invoke-interface {p0, v0, v1, v2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪哲世兰(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;->flush()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string p0, "closed"

    .line 25
    .line 26
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final isOpen()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffer("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    if-nez v0, :cond_0

    .line 27
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 28
    invoke-virtual {v0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    .line 29
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    return p1

    .line 30
    :cond_0
    const-string p0, "closed"

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public final write([B)L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    array-length v1, p1

    .line 10
    iget-object v2, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 11
    .line 12
    invoke-virtual {v2, p1, v0, v1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->write([BII)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    const-string p0, "closed"

    .line 20
    .line 21
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public final writeByte(I)L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏楪兰哲(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final writeInt(I)L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰楪苏哲(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final writeShort(I)L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰楪哲苏(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final 飘花落叶言子世兰苏楪哲(Lokio/ByteString;)L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏楪哲兰(Lokio/ByteString;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "closed"

    .line 18
    .line 19
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final 飘花落叶言子世楪兰哲苏(Ljava/lang/String;)L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子苏楪兰哲世(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "closed"

    .line 18
    .line 19
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final 飘花落叶言子世楪苏兰哲([BI)L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;
    .locals 2

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, p1, v1, p2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->write([BII)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "closed"

    .line 16
    .line 17
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final 飘花落叶言子世苏兰楪哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;)J
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    :goto_0
    const-wide/16 v2, 0x2000

    .line 4
    .line 5
    move-object v4, p1

    .line 6
    check-cast v4, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲苏世兰;

    .line 7
    .line 8
    iget-object v5, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    invoke-virtual {v4, v5, v2, v3}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const-wide/16 v4, -0x1

    .line 15
    .line 16
    cmp-long v4, v2, v4

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    add-long/2addr v0, v2

    .line 21
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-wide v0
.end method

.method public final 飘花落叶言子楪世哲兰苏()L飘花落叶言世兰哲苏子楪/飘花落叶言子世楪苏兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    invoke-interface {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏()L飘花落叶言世兰哲苏子楪/飘花落叶言子世楪苏兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;
    .locals 5

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    invoke-virtual {v0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    cmp-long v3, v1, v3

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    iget-object v3, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;

    .line 18
    .line 19
    invoke-interface {v3, v0, v1, v2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪哲世兰(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object p0

    .line 23
    :cond_1
    const-string p0, "closed"

    .line 24
    .line 25
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子苏楪哲世兰(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, p3}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子苏楪哲世兰(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "closed"

    .line 18
    .line 19
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
