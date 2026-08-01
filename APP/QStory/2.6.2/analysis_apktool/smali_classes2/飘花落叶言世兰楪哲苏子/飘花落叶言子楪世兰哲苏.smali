.class public final L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;
.super L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏兰世哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Z

.field public 飘花落叶言子楪兰世苏哲:J

.field public final synthetic 飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

.field public 飘花落叶言子楪兰苏世哲:Z

.field public 飘花落叶言子楪兰苏哲世:Z

.field public final 飘花落叶言子楪哲兰世苏:J

.field public final 飘花落叶言子楪哲兰苏世:Z


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;L飘花落叶言世兰哲苏楪子/飘花落叶言子楪兰哲苏世;JZ)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 5
    .line 6
    invoke-direct {p0, p2}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏兰世哲;-><init>(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪兰哲苏世;)V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 10
    .line 11
    iput-boolean p5, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Z

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Z

    .line 15
    .line 16
    const-wide/16 p1, 0x0

    .line 17
    .line 18
    cmp-long p1, p3, p1

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Z

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
    iput-boolean v0, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Z

    .line 8
    .line 9
    :try_start_0
    invoke-super {p0}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏兰世哲;->close()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {p0, v0}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲:Z

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Z

    .line 17
    .line 18
    :cond_1
    iget-boolean v0, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Z

    .line 19
    .line 20
    const/16 v1, 0x8

    .line 21
    .line 22
    iget-object p0, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 23
    .line 24
    invoke-static {p0, v0, p1, v1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;ZLjava/io/IOException;I)Ljava/io/IOException;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final 飘花落叶言子楪兰苏哲世(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;J)J
    .locals 9

    .line 1
    iget-object p2, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 2
    .line 3
    const-string p3, "expected "

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Z

    .line 9
    .line 10
    if-nez v0, :cond_5

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪兰哲苏世;

    .line 13
    .line 14
    const-wide/16 v1, 0x2000

    .line 15
    .line 16
    invoke-interface {v0, p1, v1, v2}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰苏哲世(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iget-boolean p1, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Z

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput-boolean p1, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    :goto_0
    const-wide/16 v2, -0x1

    .line 31
    .line 32
    cmp-long p1, v0, v2

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0, v4}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;

    .line 38
    .line 39
    .line 40
    return-wide v2

    .line 41
    :cond_1
    iget-wide v5, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    add-long/2addr v5, v0

    .line 44
    iget-wide v7, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 45
    .line 46
    cmp-long p1, v7, v2

    .line 47
    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    cmp-long p1, v5, v7

    .line 51
    .line 52
    if-gtz p1, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :try_start_1
    new-instance p1, Ljava/net/ProtocolException;

    .line 56
    .line 57
    new-instance p2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p3, " bytes but received "

    .line 66
    .line 67
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_3
    :goto_1
    iput-wide v5, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:J

    .line 82
    .line 83
    iget-object p1, p2, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰哲苏;

    .line 86
    .line 87
    invoke-interface {p1}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    invoke-virtual {p0, v4}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 94
    .line 95
    .line 96
    :cond_4
    return-wide v0

    .line 97
    :goto_2
    invoke-virtual {p0, p1}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    throw p0

    .line 105
    :cond_5
    const-string p0, "closed"

    .line 106
    .line 107
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const-wide/16 p0, 0x0

    .line 111
    .line 112
    return-wide p0
.end method
