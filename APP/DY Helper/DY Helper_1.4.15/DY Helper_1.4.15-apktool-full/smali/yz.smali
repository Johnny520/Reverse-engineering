.class public final Lyz;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lrx1;


# instance fields
.field public final ε:Lrx1;

.field public final ζ:J

.field public final η:Z

.field public θ:J

.field public ι:Z

.field public κ:Z

.field public λ:Z

.field public final synthetic μ:Lzz;


# direct methods
.method public constructor <init>(Lzz;Lrx1;JZ)V
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
    iput-object p1, p0, Lyz;->μ:Lzz;

    .line 8
    .line 9
    iput-object p2, p0, Lyz;->ε:Lrx1;

    .line 10
    .line 11
    iput-wide p3, p0, Lyz;->ζ:J

    .line 12
    .line 13
    iput-boolean p5, p0, Lyz;->η:Z

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lyz;->ι:Z

    .line 17
    .line 18
    const-wide/16 p1, 0x0

    .line 19
    .line 20
    cmp-long p1, p3, p1

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1}, Lyz;->η(Ljava/io/IOException;)Ljava/io/IOException;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyz;->λ:Z

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
    iput-boolean v0, p0, Lyz;->λ:Z

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0}, Lyz;->δ()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lyz;->η(Ljava/io/IOException;)Ljava/io/IOException;
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
    invoke-virtual {p0, v0}, Lyz;->η(Ljava/io/IOException;)Ljava/io/IOException;

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
    const-class v1, Lyz;

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
    iget-object p0, p0, Lyz;->ε:Lrx1;

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

.method public final α()Lm42;
    .locals 0

    .line 1
    iget-object p0, p0, Lyz;->ε:Lrx1;

    .line 2
    .line 3
    invoke-interface {p0}, Lrx1;->α()Lm42;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final β(JLsc;)J
    .locals 9

    .line 1
    iget-object p1, p0, Lyz;->μ:Lzz;

    .line 2
    .line 3
    const-string p2, "expected "

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lyz;->λ:Z

    .line 9
    .line 10
    if-nez v0, :cond_5

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Lyz;->ε:Lrx1;

    .line 13
    .line 14
    const-wide/16 v1, 0x2000

    .line 15
    .line 16
    invoke-interface {v0, v1, v2, p3}, Lrx1;->β(JLsc;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iget-boolean p3, p0, Lyz;->ι:Z

    .line 21
    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    const/4 p3, 0x0

    .line 25
    iput-boolean p3, p0, Lyz;->ι:Z

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
    cmp-long p3, v0, v2

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    if-nez p3, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0, v4}, Lyz;->η(Ljava/io/IOException;)Ljava/io/IOException;

    .line 38
    .line 39
    .line 40
    return-wide v2

    .line 41
    :cond_1
    iget-wide v5, p0, Lyz;->θ:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    add-long/2addr v5, v0

    .line 44
    iget-wide v7, p0, Lyz;->ζ:J

    .line 45
    .line 46
    cmp-long p3, v7, v2

    .line 47
    .line 48
    if-eqz p3, :cond_3

    .line 49
    .line 50
    cmp-long p3, v5, v7

    .line 51
    .line 52
    if-gtz p3, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :try_start_1
    new-instance p1, Ljava/net/ProtocolException;

    .line 56
    .line 57
    new-instance p3, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p2, " bytes but received "

    .line 66
    .line 67
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
    iput-wide v5, p0, Lyz;->θ:J

    .line 82
    .line 83
    iget-object p1, p1, Lzz;->δ:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Lb00;

    .line 86
    .line 87
    invoke-interface {p1}, Lb00;->δ()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    invoke-virtual {p0, v4}, Lyz;->η(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 94
    .line 95
    .line 96
    :cond_4
    return-wide v0

    .line 97
    :goto_2
    invoke-virtual {p0, p1}, Lyz;->η(Ljava/io/IOException;)Ljava/io/IOException;

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
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const-wide/16 p0, 0x0

    .line 111
    .line 112
    return-wide p0
.end method

.method public final δ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyz;->ε:Lrx1;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final η(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyz;->κ:Z

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
    iput-boolean v0, p0, Lyz;->κ:Z

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lyz;->ι:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lyz;->ι:Z

    .line 17
    .line 18
    :cond_1
    iget-boolean v0, p0, Lyz;->η:Z

    .line 19
    .line 20
    const/16 v1, 0x8

    .line 21
    .line 22
    iget-object p0, p0, Lyz;->μ:Lzz;

    .line 23
    .line 24
    invoke-static {p0, v0, p1, v1}, Lzz;->α(Lzz;ZLjava/io/IOException;I)Ljava/io/IOException;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
