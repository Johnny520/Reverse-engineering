.class public final Lvg0;
.super Lsm0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final i:J

.field public final j:Z

.field public k:J

.field public l:Z

.field public m:Z

.field public n:Z

.field public final synthetic o:Lf90;


# direct methods
.method public constructor <init>(Lf90;Lht2;JZ)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvg0;->o:Lf90;

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lsm0;-><init>(Lht2;)V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, Lvg0;->i:J

    .line 10
    .line 11
    iput-boolean p5, p0, Lvg0;->j:Z

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lvg0;->l:Z

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
    invoke-virtual {p0, p1}, Lvg0;->b(Ljava/io/IOException;)Ljava/io/IOException;

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lvg0;->m:Z

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
    iput-boolean v0, p0, Lvg0;->m:Z

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lvg0;->l:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lvg0;->l:Z

    .line 17
    .line 18
    iget-object v0, p0, Lvg0;->o:Lf90;

    .line 19
    .line 20
    iget-object v0, v0, Lf90;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ls52;

    .line 23
    .line 24
    iget-object v0, v0, Ls52;->k:Lkg0;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lvg0;->o:Lf90;

    .line 30
    .line 31
    iget-boolean p0, p0, Lvg0;->j:Z

    .line 32
    .line 33
    const/16 v1, 0x8

    .line 34
    .line 35
    invoke-static {v0, p0, p1, v1}, Lf90;->b(Lf90;ZLjava/io/IOException;I)Ljava/io/IOException;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lvg0;->n:Z

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
    iput-boolean v0, p0, Lvg0;->n:Z

    .line 8
    .line 9
    :try_start_0
    invoke-super {p0}, Lsm0;->close()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lvg0;->b(Ljava/io/IOException;)Ljava/io/IOException;
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
    invoke-virtual {p0, v0}, Lvg0;->b(Ljava/io/IOException;)Ljava/io/IOException;

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

.method public final n(Lfn;J)J
    .locals 8

    .line 1
    const-string p2, "expected "

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean p3, p0, Lvg0;->n:Z

    .line 7
    .line 8
    if-nez p3, :cond_5

    .line 9
    .line 10
    :try_start_0
    iget-object p3, p0, Lsm0;->h:Lht2;

    .line 11
    .line 12
    const-wide/16 v0, 0x2000

    .line 13
    .line 14
    invoke-interface {p3, p1, v0, v1}, Lht2;->n(Lfn;J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-boolean p1, p0, Lvg0;->l:Z

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, Lvg0;->l:Z

    .line 24
    .line 25
    iget-object p1, p0, Lvg0;->o:Lf90;

    .line 26
    .line 27
    iget-object p1, p1, Lf90;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Ls52;

    .line 30
    .line 31
    iget-object p1, p1, Ls52;->k:Lkg0;

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
    invoke-virtual {p0, p3}, Lvg0;->b(Ljava/io/IOException;)Ljava/io/IOException;

    .line 47
    .line 48
    .line 49
    return-wide v2

    .line 50
    :cond_1
    iget-wide v4, p0, Lvg0;->k:J

    .line 51
    .line 52
    add-long/2addr v4, v0

    .line 53
    iget-wide v6, p0, Lvg0;->i:J

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
    iget-wide v0, p0, Lvg0;->i:J

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
    iput-wide v4, p0, Lvg0;->k:J

    .line 93
    .line 94
    iget-object p1, p0, Lvg0;->o:Lf90;

    .line 95
    .line 96
    iget-object p1, p1, Lf90;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Lxg0;

    .line 99
    .line 100
    invoke-interface {p1}, Lxg0;->d()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    invoke-virtual {p0, p3}, Lvg0;->b(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    :cond_4
    return-wide v0

    .line 110
    :goto_2
    invoke-virtual {p0, p1}, Lvg0;->b(Ljava/io/IOException;)Ljava/io/IOException;

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
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-wide/16 p0, 0x0

    .line 124
    .line 125
    return-wide p0
.end method
