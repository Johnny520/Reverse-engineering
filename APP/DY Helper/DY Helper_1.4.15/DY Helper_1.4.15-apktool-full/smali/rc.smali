.class public final Lrc;
.super Ljava/io/InputStream;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lad;


# direct methods
.method public synthetic constructor <init>(Lad;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrc;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lrc;->ζ:Lad;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final δ()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 4

    .line 1
    iget v0, p0, Lrc;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lrc;->ζ:Lad;

    .line 7
    .line 8
    check-cast p0, Lrk1;

    .line 9
    .line 10
    iget-boolean v0, p0, Lrk1;->η:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lrk1;->ζ:Lsc;

    .line 15
    .line 16
    iget-wide v0, p0, Lsc;->ζ:J

    .line 17
    .line 18
    const p0, 0x7fffffff

    .line 19
    .line 20
    .line 21
    int-to-long v2, p0

    .line 22
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    long-to-int p0, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p0, "closed"

    .line 29
    .line 30
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    :goto_0
    return p0

    .line 35
    :pswitch_0
    iget-object p0, p0, Lrc;->ζ:Lad;

    .line 36
    .line 37
    check-cast p0, Lsc;

    .line 38
    .line 39
    iget-wide v0, p0, Lsc;->ζ:J

    .line 40
    .line 41
    const p0, 0x7fffffff

    .line 42
    .line 43
    .line 44
    int-to-long v2, p0

    .line 45
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    long-to-int p0, v0

    .line 50
    return p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    .line 1
    iget v0, p0, Lrc;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lrc;->ζ:Lad;

    .line 7
    .line 8
    check-cast p0, Lrk1;

    .line 9
    .line 10
    invoke-virtual {p0}, Lrk1;->close()V

    .line 11
    .line 12
    .line 13
    :pswitch_0
    return-void

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read()I
    .locals 5

    .line 1
    iget v0, p0, Lrc;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lrc;->ζ:Lad;

    .line 7
    .line 8
    check-cast p0, Lrk1;

    .line 9
    .line 10
    iget-object v0, p0, Lrk1;->ζ:Lsc;

    .line 11
    .line 12
    iget-boolean v1, p0, Lrk1;->η:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget-wide v1, v0, Lsc;->ζ:J

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    cmp-long v1, v1, v3

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Lrk1;->ε:Lrx1;

    .line 25
    .line 26
    const-wide/16 v1, 0x2000

    .line 27
    .line 28
    invoke-interface {p0, v1, v2, v0}, Lrx1;->β(JLsc;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    const-wide/16 v3, -0x1

    .line 33
    .line 34
    cmp-long p0, v1, v3

    .line 35
    .line 36
    if-nez p0, :cond_0

    .line 37
    .line 38
    const/4 p0, -0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0}, Lsc;->readByte()B

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    and-int/lit16 p0, p0, 0xff

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-string p0, "closed"

    .line 48
    .line 49
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    :goto_0
    return p0

    .line 54
    :pswitch_0
    iget-object p0, p0, Lrc;->ζ:Lad;

    .line 55
    .line 56
    check-cast p0, Lsc;

    .line 57
    .line 58
    iget-wide v0, p0, Lsc;->ζ:J

    .line 59
    .line 60
    const-wide/16 v2, 0x0

    .line 61
    .line 62
    cmp-long v0, v0, v2

    .line 63
    .line 64
    if-lez v0, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Lsc;->readByte()B

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    and-int/lit16 p0, p0, 0xff

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const/4 p0, -0x1

    .line 74
    :goto_1
    return p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read([BII)I
    .locals 8

    iget v0, p0, Lrc;->ε:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    .line 75
    iget-object p0, p0, Lrc;->ζ:Lad;

    check-cast p0, Lrk1;

    iget-object v0, p0, Lrk1;->ζ:Lsc;

    iget-boolean v1, p0, Lrk1;->η:Z

    if-nez v1, :cond_1

    .line 76
    array-length v1, p1

    int-to-long v2, v1

    int-to-long v4, p2

    int-to-long v6, p3

    invoke-static/range {v2 .. v7}, Lln0;->μ(JJJ)V

    .line 77
    iget-wide v1, v0, Lsc;->ζ:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    .line 78
    iget-object p0, p0, Lrk1;->ε:Lrx1;

    const-wide/16 v1, 0x2000

    invoke-interface {p0, v1, v2, v0}, Lrx1;->β(JLsc;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long p0, v1, v3

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Lsc;->read([BII)I

    move-result p0

    goto :goto_0

    .line 80
    :cond_1
    const-string p0, "closed"

    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    const/4 p0, 0x0

    :goto_0
    return p0

    .line 81
    :pswitch_0
    iget-object p0, p0, Lrc;->ζ:Lad;

    check-cast p0, Lsc;

    invoke-virtual {p0, p1, p2, p3}, Lsc;->read([BII)I

    move-result p0

    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lrc;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lrc;->ζ:Lad;

    .line 12
    .line 13
    check-cast p0, Lrk1;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, ".inputStream()"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lrc;->ζ:Lad;

    .line 34
    .line 35
    check-cast p0, Lsc;

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, ".inputStream()"

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public transferTo(Ljava/io/OutputStream;)J
    .locals 14

    .line 1
    iget v0, p0, Lrc;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/io/InputStream;->transferTo(Ljava/io/OutputStream;)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    return-wide p0

    .line 11
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lrc;->ζ:Lad;

    .line 15
    .line 16
    check-cast p0, Lrk1;

    .line 17
    .line 18
    iget-object v0, p0, Lrk1;->ζ:Lsc;

    .line 19
    .line 20
    iget-boolean v1, p0, Lrk1;->η:Z

    .line 21
    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    move-wide v3, v1

    .line 27
    :cond_0
    iget-wide v5, v0, Lsc;->ζ:J

    .line 28
    .line 29
    cmp-long v5, v5, v1

    .line 30
    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    iget-object v5, p0, Lrk1;->ε:Lrx1;

    .line 34
    .line 35
    const-wide/16 v6, 0x2000

    .line 36
    .line 37
    invoke-interface {v5, v6, v7, v0}, Lrx1;->β(JLsc;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    const-wide/16 v7, -0x1

    .line 42
    .line 43
    cmp-long v5, v5, v7

    .line 44
    .line 45
    if-eqz v5, :cond_4

    .line 46
    .line 47
    :cond_1
    iget-wide v6, v0, Lsc;->ζ:J

    .line 48
    .line 49
    add-long/2addr v3, v6

    .line 50
    const-wide/16 v8, 0x0

    .line 51
    .line 52
    move-wide v10, v6

    .line 53
    invoke-static/range {v6 .. v11}, Lln0;->μ(JJJ)V

    .line 54
    .line 55
    .line 56
    iget-object v5, v0, Lsc;->ε:Lrr1;

    .line 57
    .line 58
    :cond_2
    :goto_0
    cmp-long v8, v6, v1

    .line 59
    .line 60
    if-lez v8, :cond_0

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget v8, v5, Lrr1;->γ:I

    .line 66
    .line 67
    iget v9, v5, Lrr1;->β:I

    .line 68
    .line 69
    sub-int/2addr v8, v9

    .line 70
    int-to-long v8, v8

    .line 71
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v8

    .line 75
    long-to-int v8, v8

    .line 76
    iget-object v9, v5, Lrr1;->α:[B

    .line 77
    .line 78
    iget v10, v5, Lrr1;->β:I

    .line 79
    .line 80
    invoke-virtual {p1, v9, v10, v8}, Ljava/io/OutputStream;->write([BII)V

    .line 81
    .line 82
    .line 83
    iget v9, v5, Lrr1;->β:I

    .line 84
    .line 85
    add-int/2addr v9, v8

    .line 86
    iput v9, v5, Lrr1;->β:I

    .line 87
    .line 88
    iget-wide v10, v0, Lsc;->ζ:J

    .line 89
    .line 90
    int-to-long v12, v8

    .line 91
    sub-long/2addr v10, v12

    .line 92
    iput-wide v10, v0, Lsc;->ζ:J

    .line 93
    .line 94
    sub-long/2addr v6, v12

    .line 95
    iget v8, v5, Lrr1;->γ:I

    .line 96
    .line 97
    if-ne v9, v8, :cond_2

    .line 98
    .line 99
    invoke-virtual {v5}, Lrr1;->α()Lrr1;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    iput-object v8, v0, Lsc;->ε:Lrr1;

    .line 104
    .line 105
    invoke-static {v5}, Ltr1;->α(Lrr1;)V

    .line 106
    .line 107
    .line 108
    move-object v5, v8

    .line 109
    goto :goto_0

    .line 110
    :cond_3
    const-string p0, "closed"

    .line 111
    .line 112
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const-wide/16 v3, 0x0

    .line 116
    .line 117
    :cond_4
    return-wide v3

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
