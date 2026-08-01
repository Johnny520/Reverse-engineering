.class public final L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;
.super L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏哲兰世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Z

.field public 飘花落叶言子楪兰世苏哲:J

.field public final synthetic 飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

.field public 飘花落叶言子楪兰苏世哲:Z

.field public 飘花落叶言子楪兰苏哲世:Z

.field public final 飘花落叶言子楪哲兰世苏:J

.field public final 飘花落叶言子楪哲兰苏世:Z


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;JZ)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 5
    .line 6
    invoke-direct {p0, p2}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;)V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:J

    .line 10
    .line 11
    iput-boolean p5, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:Z

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
    invoke-virtual {p0, p1}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;

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
    iget-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Z

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
    iput-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Z

    .line 8
    .line 9
    :try_start_0
    invoke-super {p0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏哲兰世;->close()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;
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
    invoke-virtual {p0, v0}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;

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

.method public final 飘花落叶言子哲苏兰楪世(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;J)J
    .locals 8

    .line 1
    const-string p2, "expected "

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean p3, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Z

    .line 7
    .line 8
    if-nez p3, :cond_5

    .line 9
    .line 10
    :try_start_0
    iget-object p3, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;

    .line 11
    .line 12
    const-wide/16 v0, 0x2000

    .line 13
    .line 14
    invoke-interface {p3, p1, v0, v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;->飘花落叶言子哲苏兰楪世(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-boolean p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:Z

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:Z

    .line 24
    .line 25
    iget-object p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 26
    .line 27
    iget-object p1, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;

    .line 30
    .line 31
    iget-object p1, p1, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception p1

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    :goto_0
    const-wide/16 v2, -0x1

    .line 40
    .line 41
    cmp-long p1, v0, v2

    .line 42
    .line 43
    const/4 p3, 0x0

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0, p3}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;

    .line 47
    .line 48
    .line 49
    return-wide v2

    .line 50
    :cond_1
    iget-wide v4, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:J

    .line 51
    .line 52
    add-long/2addr v4, v0

    .line 53
    iget-wide v6, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:J

    .line 54
    .line 55
    cmp-long p1, v6, v2

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    cmp-long p1, v4, v6

    .line 60
    .line 61
    if-gtz p1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    .line 65
    .line 66
    new-instance p3, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-wide v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:J

    .line 72
    .line 73
    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p2, " bytes but received "

    .line 77
    .line 78
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_3
    :goto_1
    iput-wide v4, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:J

    .line 93
    .line 94
    iget-object p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 95
    .line 96
    iget-object p1, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, L飘花落叶言世兰苏哲子楪/飘花落叶言子楪世兰苏哲;

    .line 99
    .line 100
    invoke-interface {p1}, L飘花落叶言世兰苏哲子楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    invoke-virtual {p0, p3}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    :cond_4
    return-wide v0

    .line 110
    :goto_2
    invoke-virtual {p0, p1}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    throw p0

    .line 118
    :cond_5
    const-string p0, "closed"

    .line 119
    .line 120
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-wide/16 p0, 0x0

    .line 124
    .line 125
    return-wide p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏世哲:Z

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
    iput-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏世哲:Z

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:Z

    .line 17
    .line 18
    iget-object v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;

    .line 23
    .line 24
    iget-object v0, v0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 30
    .line 31
    iget-boolean p0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 32
    .line 33
    const/16 v1, 0x8

    .line 34
    .line 35
    invoke-static {v0, p0, p1, v1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;ZLjava/io/IOException;I)Ljava/io/IOException;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method
