.class public final Lkotlinx/io/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/io/飘花落叶言子楪苏兰世哲;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Z

.field public final 飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>(Lkotlinx/io/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    new-instance p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Z

    .line 8
    .line 9
    iget-object v1, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    iput-boolean v0, v1, Lkotlinx/io/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Z

    .line 12
    .line 13
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->skip(J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final peek()Lkotlinx/io/飘花落叶言子楪世兰哲苏;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lkotlinx/io/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lkotlinx/io/飘花落叶言子楪世哲苏兰;-><init>(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)V

    .line 8
    .line 9
    .line 10
    new-instance p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lkotlinx/io/飘花落叶言子楪世兰哲苏;-><init>(Lkotlinx/io/飘花落叶言子楪世哲苏兰;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "Source is closed."

    .line 17
    .line 18
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final readByte()B
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readByte()B

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final readInt()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final readLong()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readLong()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final readShort()S
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readShort()S

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffered("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪世哲苏兰;

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

.method public final 飘花落叶言子世哲兰楪苏(Lkotlinx/io/飘花落叶言子楪苏哲兰世;)J
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    move-wide v2, v0

    .line 7
    :cond_0
    :goto_0
    iget-object v4, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    const-wide/16 v5, 0x2000

    .line 10
    .line 11
    iget-object v7, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    invoke-virtual {v4, v7, v5, v6}, Lkotlinx/io/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    const-wide/16 v8, -0x1

    .line 18
    .line 19
    cmp-long v4, v4, v8

    .line 20
    .line 21
    iget-wide v5, v7, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 22
    .line 23
    if-eqz v4, :cond_3

    .line 24
    .line 25
    cmp-long v4, v5, v0

    .line 26
    .line 27
    if-nez v4, :cond_1

    .line 28
    .line 29
    move-wide v5, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iget-object v4, v7, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget v8, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 37
    .line 38
    const/16 v9, 0x2000

    .line 39
    .line 40
    if-ge v8, v9, :cond_2

    .line 41
    .line 42
    iget-boolean v9, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 43
    .line 44
    if-eqz v9, :cond_2

    .line 45
    .line 46
    iget v4, v4, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 47
    .line 48
    sub-int/2addr v8, v4

    .line 49
    int-to-long v8, v8

    .line 50
    sub-long/2addr v5, v8

    .line 51
    :cond_2
    :goto_1
    cmp-long v4, v5, v0

    .line 52
    .line 53
    if-lez v4, :cond_0

    .line 54
    .line 55
    add-long/2addr v2, v5

    .line 56
    move-object v4, p1

    .line 57
    check-cast v4, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 58
    .line 59
    invoke-virtual {v4, v7, v5, v6}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    cmp-long p0, v5, v0

    .line 64
    .line 65
    if-lez p0, :cond_4

    .line 66
    .line 67
    add-long/2addr v2, v5

    .line 68
    check-cast p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 69
    .line 70
    invoke-virtual {p1, v7, v5, v6}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-wide v2
.end method

.method public final 飘花落叶言子世哲兰苏楪(Lkotlinx/io/飘花落叶言子楪苏哲兰世;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, p2, p3}, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰苏楪(Lkotlinx/io/飘花落叶言子楪苏哲兰世;J)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p0

    .line 14
    iget-wide p2, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 15
    .line 16
    check-cast p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    invoke-virtual {p1, v0, p2, p3}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)V

    .line 19
    .line 20
    .line 21
    throw p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(J)Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    cmp-long v0, p1, v2

    .line 9
    .line 10
    if-ltz v0, :cond_2

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    iget-wide v2, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 15
    .line 16
    cmp-long v2, v2, p1

    .line 17
    .line 18
    if-gez v2, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪世哲苏兰;

    .line 21
    .line 22
    const-wide/16 v3, 0x2000

    .line 23
    .line 24
    invoke-virtual {v2, v0, v3, v4}, Lkotlinx/io/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    const-wide/16 v4, -0x1

    .line 29
    .line 30
    cmp-long v0, v2, v4

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    return v1

    .line 35
    :cond_1
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    const-string p0, "byteCount: "

    .line 38
    .line 39
    invoke-static {p1, p2, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return v1

    .line 47
    :cond_3
    const-string p0, "Source is closed."

    .line 48
    .line 49
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return v1
.end method

.method public final 飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪兰世苏哲()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-virtual {v0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪世哲苏兰;

    .line 15
    .line 16
    const-wide/16 v2, 0x2000

    .line 17
    .line 18
    invoke-virtual {p0, v0, v2, v3}, Lkotlinx/io/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide/16 v4, -0x1

    .line 23
    .line 24
    cmp-long p0, v2, v4

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    return v1

    .line 31
    :cond_1
    const-string p0, "Source is closed."

    .line 32
    .line 33
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return v1
.end method

.method public final 飘花落叶言子楪兰哲苏世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)J
    .locals 5

    .line 1
    iget-boolean v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    cmp-long v0, p2, v1

    .line 8
    .line 9
    if-ltz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    iget-wide v3, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 14
    .line 15
    cmp-long v1, v3, v1

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪世哲苏兰;

    .line 20
    .line 21
    const-wide/16 v1, 0x2000

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2}, Lkotlinx/io/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    const-wide/16 v3, -0x1

    .line 28
    .line 29
    cmp-long p0, v1, v3

    .line 30
    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    return-wide v3

    .line 34
    :cond_0
    iget-wide v1, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 35
    .line 36
    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide p2

    .line 40
    invoke-virtual {v0, p1, p2, p3}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)J

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    return-wide p0

    .line 45
    :cond_1
    const-string p0, "byteCount: "

    .line 46
    .line 47
    invoke-static {p2, p3, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-wide v1

    .line 55
    :cond_2
    const-string p0, "Source is closed."

    .line 56
    .line 57
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-wide v1
.end method

.method public final 飘花落叶言子楪苏哲世兰(J)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Source doesn\'t contain required number of bytes ("

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, ")."

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
.end method

.method public final 飘花落叶言子苏楪世兰哲(I[BI)I
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p2

    .line 5
    int-to-long v1, v0

    .line 6
    int-to-long v3, p1

    .line 7
    int-to-long v5, p3

    .line 8
    invoke-static/range {v1 .. v6}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(JJJ)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    iget-wide v1, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    cmp-long v1, v1, v3

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    const-wide/16 v1, 0x2000

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1, v2}, Lkotlinx/io/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    const-wide/16 v3, -0x1

    .line 30
    .line 31
    cmp-long p0, v1, v3

    .line 32
    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    const/4 p0, -0x1

    .line 36
    return p0

    .line 37
    :cond_0
    sub-int/2addr p3, p1

    .line 38
    iget-wide v1, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 39
    .line 40
    int-to-long v3, p3

    .line 41
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    long-to-int p0, v1

    .line 46
    add-int/2addr p0, p1

    .line 47
    invoke-virtual {v0, p1, p2, p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏楪世兰哲(I[BI)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0
.end method
