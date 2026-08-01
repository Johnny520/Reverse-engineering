.class public final L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;


# direct methods
.method public constructor <init>(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;)V
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
    iput-object p1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 8
    .line 9
    new-instance p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Z

    .line 7
    .line 8
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final isOpen()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    iget-wide v1, v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v1, v1, v3

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 15
    .line 16
    const-wide/16 v1, 0x2000

    .line 17
    .line 18
    invoke-interface {p0, v0, v1, v2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    const-wide/16 v3, -0x1

    .line 23
    .line 24
    cmp-long p0, v1, v3

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    const/4 p0, -0x1

    .line 29
    return p0

    .line 30
    :cond_0
    invoke-virtual {v0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->read(Ljava/nio/ByteBuffer;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public final readByte()B
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏哲世兰(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->readByte()B

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
    invoke-virtual {p0, v0, v1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏哲世兰(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final readShort()S
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏哲世兰(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->readShort()S

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final skip(J)V
    .locals 5

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    :goto_0
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, p1, v0

    .line 8
    .line 9
    if-lez v2, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    iget-wide v3, v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 14
    .line 15
    cmp-long v0, v3, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 20
    .line 21
    const-wide/16 v3, 0x2000

    .line 22
    .line 23
    invoke-interface {v0, v2, v3, v4}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    const-wide/16 v3, -0x1

    .line 28
    .line 29
    cmp-long v0, v0, v3

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :cond_1
    :goto_1
    iget-wide v0, v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 41
    .line 42
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    invoke-virtual {v2, v0, v1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->skip(J)V

    .line 47
    .line 48
    .line 49
    sub-long/2addr p1, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-void

    .line 52
    :cond_3
    const-string p0, "closed"

    .line 53
    .line 54
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
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
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

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

.method public final 飘花落叶言子世哲楪苏兰()Lokio/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏兰楪哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;)J

    .line 6
    .line 7
    .line 8
    iget-wide v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(J)Lokio/ByteString;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p2, v0

    .line 7
    .line 8
    if-ltz v2, :cond_3

    .line 9
    .line 10
    iget-boolean v3, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Z

    .line 11
    .line 12
    if-nez v3, :cond_2

    .line 13
    .line 14
    iget-object v3, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    iget-wide v4, v3, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 17
    .line 18
    cmp-long v4, v4, v0

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    return-wide v0

    .line 25
    :cond_0
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 26
    .line 27
    const-wide/16 v0, 0x2000

    .line 28
    .line 29
    invoke-interface {p0, v3, v0, v1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    const-wide/16 v4, -0x1

    .line 34
    .line 35
    cmp-long p0, v0, v4

    .line 36
    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    return-wide v4

    .line 40
    :cond_1
    iget-wide v0, v3, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 41
    .line 42
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide p2

    .line 46
    invoke-virtual {v3, p1, p2, p3}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J

    .line 47
    .line 48
    .line 49
    move-result-wide p0

    .line 50
    return-wide p0

    .line 51
    :cond_2
    const-string p0, "closed"

    .line 52
    .line 53
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-wide v0

    .line 57
    :cond_3
    const-string p0, "byteCount < 0: "

    .line 58
    .line 59
    invoke-static {p2, p3, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-wide v0
.end method

.method public final 飘花落叶言子世苏兰哲楪(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲苏兰世;)I
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Z

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iget-object v1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    invoke-static {v1, p1, v0}, Lokio/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲苏兰世;Z)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, -0x2

    .line 16
    const/4 v3, -0x1

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    if-eq v0, v3, :cond_2

    .line 20
    .line 21
    iget-object p0, p1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:[Lokio/ByteString;

    .line 22
    .line 23
    aget-object p0, p0, v0

    .line 24
    .line 25
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-long p0, p0

    .line 30
    invoke-virtual {v1, p0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->skip(J)V

    .line 31
    .line 32
    .line 33
    return v0

    .line 34
    :cond_1
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 35
    .line 36
    const-wide/16 v4, 0x2000

    .line 37
    .line 38
    invoke-interface {v0, v1, v4, v5}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    const-wide/16 v4, -0x1

    .line 43
    .line 44
    cmp-long v0, v0, v4

    .line 45
    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    :cond_2
    return v3

    .line 49
    :cond_3
    const-string p0, "closed"

    .line 50
    .line 51
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return p0
.end method

.method public final 飘花落叶言子世苏哲楪兰(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏兰楪哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;)J

    .line 9
    .line 10
    .line 11
    iget-wide v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(J)Z
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-ltz v0, :cond_3

    .line 7
    .line 8
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Z

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    iget-wide v2, v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 15
    .line 16
    cmp-long v2, v2, p1

    .line 17
    .line 18
    if-gez v2, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 21
    .line 22
    const-wide/16 v3, 0x2000

    .line 23
    .line 24
    invoke-interface {v2, v0, v3, v4}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J

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
    const-string p0, "closed"

    .line 38
    .line 39
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return v1

    .line 43
    :cond_3
    const-string p0, "byteCount < 0: "

    .line 44
    .line 45
    invoke-static {p1, p2, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return v1
.end method

.method public final 飘花落叶言子楪世哲兰苏()L飘花落叶言世兰哲苏子楪/飘花落叶言子世楪苏兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-interface {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏()L飘花落叶言世兰哲苏子楪/飘花落叶言子世楪苏兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏哲世兰(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    invoke-virtual {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/high16 v0, -0x1000000

    .line 13
    .line 14
    and-int/2addr v0, p0

    .line 15
    ushr-int/lit8 v0, v0, 0x18

    .line 16
    .line 17
    const/high16 v1, 0xff0000

    .line 18
    .line 19
    and-int/2addr v1, p0

    .line 20
    ushr-int/lit8 v1, v1, 0x8

    .line 21
    .line 22
    or-int/2addr v0, v1

    .line 23
    const v1, 0xff00

    .line 24
    .line 25
    .line 26
    and-int/2addr v1, p0

    .line 27
    shl-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    and-int/lit16 p0, p0, 0xff

    .line 31
    .line 32
    shl-int/lit8 p0, p0, 0x18

    .line 33
    .line 34
    or-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(BJJ)J
    .locals 8

    .line 1
    iget-boolean p2, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    if-nez p2, :cond_4

    .line 6
    .line 7
    cmp-long p2, v0, p4

    .line 8
    .line 9
    if-gtz p2, :cond_3

    .line 10
    .line 11
    move-wide v4, v0

    .line 12
    :goto_0
    cmp-long p2, v4, p4

    .line 13
    .line 14
    const-wide/16 v0, -0x1

    .line 15
    .line 16
    if-gez p2, :cond_2

    .line 17
    .line 18
    iget-object v2, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 19
    .line 20
    move v3, p1

    .line 21
    move-wide v6, p4

    .line 22
    invoke-virtual/range {v2 .. v7}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(BJJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    cmp-long p3, p1, v0

    .line 27
    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    return-wide p1

    .line 31
    :cond_0
    iget-wide p1, v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 32
    .line 33
    cmp-long p3, p1, v6

    .line 34
    .line 35
    if-gez p3, :cond_2

    .line 36
    .line 37
    iget-object p3, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 38
    .line 39
    const-wide/16 p4, 0x2000

    .line 40
    .line 41
    invoke-interface {p3, v2, p4, p5}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J

    .line 42
    .line 43
    .line 44
    move-result-wide p3

    .line 45
    cmp-long p3, p3, v0

    .line 46
    .line 47
    if-nez p3, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    move p1, v3

    .line 55
    move-wide p4, v6

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    return-wide v0

    .line 58
    :cond_3
    move-wide v6, p4

    .line 59
    const-string p0, "fromIndex=0 toIndex="

    .line 60
    .line 61
    invoke-static {v6, v7, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-wide v0

    .line 69
    :cond_4
    const-string p0, "closed"

    .line 70
    .line 71
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-wide v0
.end method

.method public final 飘花落叶言子楪世苏哲兰()L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪兰世苏哲()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    invoke-virtual {v0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 15
    .line 16
    const-wide/16 v2, 0x2000

    .line 17
    .line 18
    invoke-interface {p0, v0, v2, v3}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J

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
    const-string p0, "closed"

    .line 32
    .line 33
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return v1
.end method

.method public final 飘花落叶言子楪兰哲世苏(J)Ljava/lang/String;
    .locals 18

    .line 1
    move-wide/from16 v6, p1

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v0, v6, v0

    .line 6
    .line 7
    if-ltz v0, :cond_3

    .line 8
    .line 9
    const-wide v8, 0x7fffffffffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, v6, v8

    .line 15
    .line 16
    const-wide/16 v10, 0x1

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    move-wide v4, v8

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    add-long v0, v6, v10

    .line 23
    .line 24
    move-wide v4, v0

    .line 25
    :goto_0
    const/16 v1, 0xa

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    move-object/from16 v0, p0

    .line 30
    .line 31
    invoke-virtual/range {v0 .. v5}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲(BJJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    const-wide/16 v12, -0x1

    .line 36
    .line 37
    cmp-long v3, v1, v12

    .line 38
    .line 39
    iget-object v12, v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-static {v12, v1, v2}, Lokio/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_1
    cmp-long v1, v4, v8

    .line 49
    .line 50
    if-gez v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0, v4, v5}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲(J)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    sub-long v1, v4, v10

    .line 59
    .line 60
    invoke-virtual {v12, v1, v2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(J)B

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const/16 v2, 0xd

    .line 65
    .line 66
    if-ne v1, v2, :cond_2

    .line 67
    .line 68
    add-long v1, v4, v10

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲(J)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-virtual {v12, v4, v5}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(J)B

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/16 v1, 0xa

    .line 81
    .line 82
    if-ne v0, v1, :cond_2

    .line 83
    .line 84
    invoke-static {v12, v4, v5}, Lokio/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :cond_2
    new-instance v13, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 90
    .line 91
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    iget-wide v0, v12, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 95
    .line 96
    const-wide/16 v2, 0x20

    .line 97
    .line 98
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 99
    .line 100
    .line 101
    move-result-wide v16

    .line 102
    const-wide/16 v14, 0x0

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v17}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;JJ)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Ljava/io/EOFException;

    .line 108
    .line 109
    iget-wide v1, v12, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 110
    .line 111
    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 112
    .line 113
    .line 114
    move-result-wide v1

    .line 115
    iget-wide v3, v13, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 116
    .line 117
    invoke-virtual {v13, v3, v4}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(J)Lokio/ByteString;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v3}, Lokio/ByteString;->hex()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    new-instance v4, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v5, "\\n not found: limit="

    .line 128
    .line 129
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, " content="

    .line 136
    .line 137
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const/16 v1, 0x2026

    .line 144
    .line 145
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_3
    const-string v0, "limit < 0: "

    .line 157
    .line 158
    invoke-static {v6, v7, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    const/4 v0, 0x0

    .line 166
    return-object v0
.end method

.method public final 飘花落叶言子楪哲世兰苏(J)Lokio/ByteString;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏哲世兰(J)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(J)Lokio/ByteString;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲世兰(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲(J)Z

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
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public final 飘花落叶言子苏楪世哲兰(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;)J
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    move-wide v2, v0

    .line 4
    :cond_0
    :goto_0
    iget-object v4, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 5
    .line 6
    const-wide/16 v5, 0x2000

    .line 7
    .line 8
    iget-object v7, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    invoke-interface {v4, v7, v5, v6}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    const-wide/16 v8, -0x1

    .line 15
    .line 16
    cmp-long v4, v4, v8

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    invoke-virtual {v7}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    cmp-long v6, v4, v0

    .line 25
    .line 26
    if-lez v6, :cond_0

    .line 27
    .line 28
    add-long/2addr v2, v4

    .line 29
    invoke-virtual {p1, v7, v4, v5}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子苏楪哲世兰(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-wide v4, v7, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 34
    .line 35
    cmp-long p0, v4, v0

    .line 36
    .line 37
    if-lez p0, :cond_2

    .line 38
    .line 39
    add-long/2addr v2, v4

    .line 40
    invoke-virtual {p1, v7, v4, v5}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子苏楪哲世兰(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-wide v2
.end method

.method public final 飘花落叶言子苏楪兰世哲()Ljava/io/InputStream;
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
