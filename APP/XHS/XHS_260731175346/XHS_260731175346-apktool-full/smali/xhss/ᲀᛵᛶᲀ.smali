.class public final Lxhss/ᲀᛵᛶᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲇᲁᲀᲇ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

.field public final ᛳᲁᲇᛸ:J

.field public ᛷᛴᛷᛱ:J

.field public final synthetic ᛸᛲᲀᛵ:Lxhss/ᲇᛸᛵᛴ;

.field public ᛸᛴᛶᛳ:Z

.field public ᲀᲇᛳᲁ:Z

.field public final ᲇᛴᲇᛵ:Z

.field public ᲇᛶᛴᲀ:Z


# direct methods
.method public constructor <init>(Lxhss/ᲇᛸᛵᛴ;Lxhss/ᲇᲁᲀᲇ;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲀᛵᛶᲀ;->ᛸᛲᲀᛵ:Lxhss/ᲇᛸᛵᛴ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᲀᛵᛶᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 7
    .line 8
    iput-wide p3, p0, Lxhss/ᲀᛵᛶᲀ;->ᛳᲁᲇᛸ:J

    .line 9
    .line 10
    iput-boolean p5, p0, Lxhss/ᲀᛵᛶᲀ;->ᲇᛴᲇᛵ:Z

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lxhss/ᲀᛵᛶᲀ;->ᲇᛶᛴᲀ:Z

    .line 14
    .line 15
    const-wide/16 p1, 0x0

    .line 16
    .line 17
    cmp-long p1, p3, p1

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Lxhss/ᲀᛵᛶᲀ;->ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᛸᛴᛶᛳ:Z

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
    iput-boolean v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᛸᛴᛶᛳ:Z

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0}, Lxhss/ᲀᛵᛶᲀ;->ᛱᛱᛲᲇ()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lxhss/ᲀᛵᛶᲀ;->ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;
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
    invoke-virtual {p0, v0}, Lxhss/ᲀᛵᛶᲀ;->ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-class v1, Lxhss/ᲀᛵᛶᲀ;

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
    iget-object p0, p0, Lxhss/ᲀᛵᛶᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

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

.method public final ᛱᛱᛲᲇ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛵᛶᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᲀᲇᛳᲁ:Z

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
    iput-boolean v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᲀᲇᛳᲁ:Z

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᲇᛶᛴᲀ:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᲇᛶᛴᲀ:Z

    .line 17
    .line 18
    iget-object v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᛸᛲᲀᛵ:Lxhss/ᲇᛸᛵᛴ;

    .line 19
    .line 20
    iget-object v0, v0, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 21
    .line 22
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᛸᛲᲀᛵ:Lxhss/ᲇᛸᛵᛴ;

    .line 28
    .line 29
    iget-boolean p0, p0, Lxhss/ᲀᛵᛶᲀ;->ᲇᛴᲇᛵ:Z

    .line 30
    .line 31
    const/16 v1, 0x8

    .line 32
    .line 33
    invoke-static {v0, p0, p1, v1}, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ(Lxhss/ᲇᛸᛵᛴ;ZLjava/io/IOException;I)Ljava/io/IOException;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛵᛶᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 2
    .line 3
    invoke-interface {p0}, Lxhss/ᲇᲁᲀᲇ;->ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J
    .locals 8

    .line 1
    const-string p1, "expected "

    .line 2
    .line 3
    iget-boolean p2, p0, Lxhss/ᲀᛵᛶᲀ;->ᛸᛴᛶᛳ:Z

    .line 4
    .line 5
    if-nez p2, :cond_5

    .line 6
    .line 7
    :try_start_0
    iget-object p2, p0, Lxhss/ᲀᛵᛶᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 8
    .line 9
    const-wide/16 v0, 0x2000

    .line 10
    .line 11
    invoke-interface {p2, v0, v1, p3}, Lxhss/ᲇᲁᲀᲇ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 12
    .line 13
    .line 14
    move-result-wide p2

    .line 15
    iget-boolean v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᲇᛶᛴᲀ:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᲇᛶᛴᲀ:Z

    .line 21
    .line 22
    iget-object v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᛸᛲᲀᛵ:Lxhss/ᲇᛸᛵᛴ;

    .line 23
    .line 24
    iget-object v0, v0, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 25
    .line 26
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_2

    .line 34
    :cond_0
    :goto_0
    const-wide/16 v0, -0x1

    .line 35
    .line 36
    cmp-long v2, p2, v0

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v3}, Lxhss/ᲀᛵᛶᲀ;->ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 42
    .line 43
    .line 44
    return-wide v0

    .line 45
    :cond_1
    iget-wide v4, p0, Lxhss/ᲀᛵᛶᲀ;->ᛷᛴᛷᛱ:J

    .line 46
    .line 47
    add-long/2addr v4, p2

    .line 48
    iget-wide v6, p0, Lxhss/ᲀᛵᛶᲀ;->ᛳᲁᲇᛸ:J

    .line 49
    .line 50
    cmp-long v0, v6, v0

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    cmp-long v0, v4, v6

    .line 55
    .line 56
    if-gtz v0, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    new-instance p2, Ljava/net/ProtocolException;

    .line 60
    .line 61
    new-instance p3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {p3, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-wide v0, p0, Lxhss/ᲀᛵᛶᲀ;->ᛳᲁᲇᛸ:J

    .line 67
    .line 68
    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p1, " bytes but received "

    .line 72
    .line 73
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p2

    .line 87
    :cond_3
    :goto_1
    iput-wide v4, p0, Lxhss/ᲀᛵᛶᲀ;->ᛷᛴᛷᛱ:J

    .line 88
    .line 89
    iget-object p1, p0, Lxhss/ᲀᛵᛶᲀ;->ᛸᛲᲀᛵ:Lxhss/ᲇᛸᛵᛴ;

    .line 90
    .line 91
    iget-object p1, p1, Lxhss/ᲇᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛶᛷᛲ;

    .line 92
    .line 93
    invoke-interface {p1}, Lxhss/ᛷᛶᛷᛲ;->ᛱᛱᛲᲇ()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    invoke-virtual {p0, v3}, Lxhss/ᲀᛵᛶᲀ;->ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    .line 102
    :cond_4
    return-wide p2

    .line 103
    :goto_2
    invoke-virtual {p0, p1}, Lxhss/ᲀᛵᛶᲀ;->ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    throw p0

    .line 108
    :cond_5
    const-string p0, "closed"

    .line 109
    .line 110
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-wide/16 p0, 0x0

    .line 114
    .line 115
    return-wide p0
.end method
