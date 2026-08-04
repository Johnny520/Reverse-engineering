.class public final Lyyds/ᛷᲈᲀᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᛳᲇᲁ;


# instance fields
.field public ᛱᲈᲁ:Z

.field public ᛲᛳᛶᲁ:Z

.field public final ᛲᛴᛳᛲ:Z

.field public ᛶᛷᛲᲁ:J

.field public final synthetic ᛷᲈᲈᲁ:Lyyds/ᲀᲇᛶᲇ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

.field public ᲇᲇᲇᛱ:Z

.field public final ᲇᲈᛵᛷ:J


# direct methods
.method public constructor <init>(Lyyds/ᲀᲇᛶᲇ;Lyyds/ᲀᛳᲇᲁ;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᲈᲀᛴ;->ᛷᲈᲈᲁ:Lyyds/ᲀᲇᛶᲇ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛷᲈᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 7
    .line 8
    iput-wide p3, p0, Lyyds/ᛷᲈᲀᛴ;->ᲇᲈᛵᛷ:J

    .line 9
    .line 10
    iput-boolean p5, p0, Lyyds/ᛷᲈᲀᛴ;->ᛲᛴᛳᛲ:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lyyds/ᛷᲈᲀᛴ;->ᛱᲈᲁ:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᛲᛳᛶᲁ:Z

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
    iput-boolean v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᛲᛳᛶᲁ:Z

    .line 8
    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    iget-wide v2, p0, Lyyds/ᛷᲈᲀᛴ;->ᲇᲈᛵᛷ:J

    .line 12
    .line 13
    cmp-long v0, v2, v0

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-wide v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᛶᛷᛲᲁ:J

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
    invoke-virtual {p0}, Lyyds/ᛷᲈᲀᛴ;->ᛲᲈᲁ()V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p0, v0}, Lyyds/ᛷᲈᲀᛴ;->ᲇᲇᲇᛱ(Ljava/io/IOException;)Ljava/io/IOException;
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
    invoke-virtual {p0, v0}, Lyyds/ᛷᲈᲀᛴ;->ᲇᲇᲇᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    throw p0
.end method

.method public final flush()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᛷᲈᲀᛴ;->ᛶᛷᛲᲁ()V
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
    invoke-virtual {p0, v0}, Lyyds/ᛷᲈᲀᛴ;->ᲇᲇᲇᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-class v1, Lyyds/ᛷᲈᲀᛴ;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x28

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᛷᲈᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 p0, 0x29

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᛲᛳᛶᲁ:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-wide v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᲇᲈᛵᛷ:J

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
    iget-wide v2, p0, Lyyds/ᛷᲈᲀᛴ;->ᛶᛷᛲᲁ:J

    .line 14
    .line 15
    add-long/2addr v2, p1

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
    new-instance p3, Ljava/net/ProtocolException;

    .line 22
    .line 23
    iget-wide v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᲇᲈᛵᛷ:J

    .line 24
    .line 25
    iget-wide v2, p0, Lyyds/ᛷᲈᲀᛴ;->ᛶᛷᛲᲁ:J

    .line 26
    .line 27
    add-long/2addr v2, p1

    .line 28
    new-instance p0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string p1, "expected "

    .line 31
    .line 32
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " bytes but received "

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    invoke-direct {p3, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p3

    .line 54
    :cond_1
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᛱᲈᲁ:Z

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᛱᲈᲁ:Z

    .line 60
    .line 61
    iget-object v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᛷᲈᲈᲁ:Lyyds/ᲀᲇᛶᲇ;

    .line 62
    .line 63
    iget-object v0, v0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lyyds/ᲈᲀᛱᛷ;

    .line 66
    .line 67
    iget-object v0, v0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

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
    iget-object v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 76
    .line 77
    invoke-interface {v0, p1, p2, p3}, Lyyds/ᲀᛳᲇᲁ;->ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V

    .line 78
    .line 79
    .line 80
    iget-wide v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᛶᛷᛲᲁ:J

    .line 81
    .line 82
    add-long/2addr v0, p1

    .line 83
    iput-wide v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᛶᛷᛲᲁ:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    return-void

    .line 86
    :goto_2
    invoke-virtual {p0, p1}, Lyyds/ᛷᲈᲀᛴ;->ᲇᲇᲇᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    throw p0

    .line 91
    :cond_3
    const-string p0, "closed"

    .line 92
    .line 93
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final ᛲᲈᲁ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲈᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᲀᛳᲇᲁ;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛶᛷᛲᲁ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲈᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᲀᛳᲇᲁ;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲈᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᲀᛳᲇᲁ;->ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᲇᲇᲇᛱ:Z

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
    iput-boolean v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᲇᲇᲇᛱ:Z

    .line 8
    .line 9
    iget-boolean v0, p0, Lyyds/ᛷᲈᲀᛴ;->ᛲᛴᛳᛲ:Z

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    iget-object p0, p0, Lyyds/ᛷᲈᲀᛴ;->ᛷᲈᲈᲁ:Lyyds/ᲀᲇᛶᲇ;

    .line 13
    .line 14
    invoke-static {p0, v0, p1, v1}, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ(Lyyds/ᲀᲇᛶᲇ;ZLjava/io/IOException;I)Ljava/io/IOException;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
