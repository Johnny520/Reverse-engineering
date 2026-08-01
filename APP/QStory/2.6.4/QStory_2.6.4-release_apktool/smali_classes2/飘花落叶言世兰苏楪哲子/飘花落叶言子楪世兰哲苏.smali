.class public final L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:J

.field public 飘花落叶言子楪兰世苏哲:Z

.field public final synthetic 飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

.field public 飘花落叶言子楪兰苏世哲:Z

.field public 飘花落叶言子楪兰苏哲世:Z

.field public final 飘花落叶言子楪哲兰世苏:J

.field public final 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 8
    .line 9
    iput-object p2, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;

    .line 10
    .line 11
    iput-wide p3, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 12
    .line 13
    iput-boolean p5, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Z

    .line 14
    .line 15
    iput-boolean p5, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Z

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
    iput-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Z

    .line 8
    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    iget-wide v2, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 12
    .line 13
    cmp-long v0, v2, v0

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-wide v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:J

    .line 18
    .line 19
    cmp-long v0, v0, v2

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance p0, Ljava/net/ProtocolException;

    .line 25
    .line 26
    const-string v0, "unexpected end of stream"

    .line 27
    .line 28
    invoke-direct {p0, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_2
    :goto_0
    :try_start_0
    invoke-virtual {p0}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p0, v0}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception v0

    .line 41
    invoke-virtual {p0, v0}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)Ljava/io/IOException;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public final flush()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {p0, v0}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)Ljava/io/IOException;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x28

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 p0, 0x29

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    invoke-interface {p0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Z

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
    iput-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Z

    .line 8
    .line 9
    iget-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Z

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    iget-object p0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 13
    .line 14
    invoke-static {p0, v0, p1, v1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;ZLjava/io/IOException;I)Ljava/io/IOException;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    invoke-interface {p0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    invoke-interface {p0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子苏兰楪世哲(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;J)V
    .locals 4

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-wide v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-wide v2, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:J

    .line 14
    .line 15
    add-long/2addr v2, p2

    .line 16
    cmp-long v0, v2, v0

    .line 17
    .line 18
    if-gtz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    .line 22
    .line 23
    iget-wide v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 24
    .line 25
    iget-wide v2, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:J

    .line 26
    .line 27
    add-long/2addr v2, p2

    .line 28
    new-instance p0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string p2, "expected "

    .line 31
    .line 32
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p2, " bytes but received "

    .line 39
    .line 40
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-direct {p1, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    :try_start_0
    iget-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲:Z

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲:Z

    .line 60
    .line 61
    iget-object v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 62
    .line 63
    iget-object v0, v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;

    .line 66
    .line 67
    iget-object v0, v0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catch_0
    move-exception p1

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    :goto_1
    iget-object v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;

    .line 76
    .line 77
    invoke-interface {v0, p1, p2, p3}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰苏世哲;->飘花落叶言子苏兰楪世哲(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;J)V

    .line 78
    .line 79
    .line 80
    iget-wide v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:J

    .line 81
    .line 82
    add-long/2addr v0, p2

    .line 83
    iput-wide v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    return-void

    .line 86
    :goto_2
    invoke-virtual {p0, p1}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)Ljava/io/IOException;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    throw p0

    .line 94
    :cond_3
    const-string p0, "closed"

    .line 95
    .line 96
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method
