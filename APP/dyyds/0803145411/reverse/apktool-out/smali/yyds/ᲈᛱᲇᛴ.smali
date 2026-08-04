.class public final Lyyds/ᲈᛱᲇᛴ;
.super Ljava/io/InputStream;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛴᲇᛸ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛴᲇᛸ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲈᛱᲇᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲈᛱᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲇᛸ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final ᛲᲈᲁ()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const-wide/32 v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲇᛸ;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lyyds/ᲀᲀᛵᲈ;

    .line 12
    .line 13
    iget-boolean v0, p0, Lyyds/ᲀᲀᛵᲈ;->ᛲᛴᛳᛲ:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᲀᲀᛵᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 18
    .line 19
    iget-wide v3, p0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 20
    .line 21
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    long-to-int p0, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "closed"

    .line 28
    .line 29
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    :goto_0
    return p0

    .line 34
    :pswitch_0
    check-cast p0, Lyyds/ᛷᛲᲈᛲ;

    .line 35
    .line 36
    iget-wide v3, p0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 37
    .line 38
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    long-to-int p0, v0

    .line 43
    return p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲇᛸ;

    .line 7
    .line 8
    check-cast p0, Lyyds/ᲀᲀᛵᲈ;

    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᲀᲀᛵᲈ;->close()V

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
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲇᛸ;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lyyds/ᲀᲀᛵᲈ;

    .line 12
    .line 13
    iget-object v0, p0, Lyyds/ᲀᲀᛵᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 14
    .line 15
    iget-boolean v4, p0, Lyyds/ᲀᲀᛵᲈ;->ᛲᛴᛳᛲ:Z

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    iget-wide v4, v0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 20
    .line 21
    cmp-long v2, v4, v2

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lyyds/ᲀᲀᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛷᛳᛷ;

    .line 26
    .line 27
    const-wide/16 v2, 0x2000

    .line 28
    .line 29
    invoke-interface {p0, v2, v3, v0}, Lyyds/ᛷᛷᛳᛷ;->ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const-wide/16 v4, -0x1

    .line 34
    .line 35
    cmp-long p0, v2, v4

    .line 36
    .line 37
    if-nez p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0}, Lyyds/ᛷᛲᲈᛲ;->ᛷᲈᲈᲁ()B

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    and-int/lit16 v1, p0, 0xff

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-string p0, "closed"

    .line 48
    .line 49
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    :goto_0
    return v1

    .line 54
    :pswitch_0
    check-cast p0, Lyyds/ᛷᛲᲈᛲ;

    .line 55
    .line 56
    iget-wide v4, p0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 57
    .line 58
    cmp-long v0, v4, v2

    .line 59
    .line 60
    if-lez v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Lyyds/ᛷᛲᲈᛲ;->ᛷᲈᲈᲁ()B

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    and-int/lit16 v1, p0, 0xff

    .line 67
    .line 68
    :cond_2
    return v1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read([BII)I
    .locals 8

    iget v0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲀᛲᛳᲀ:I

    iget-object p0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲇᛸ;

    packed-switch v0, :pswitch_data_0

    .line 69
    check-cast p0, Lyyds/ᲀᲀᛵᲈ;

    iget-object v0, p0, Lyyds/ᲀᲀᛵᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    iget-boolean v1, p0, Lyyds/ᲀᲀᛵᲈ;->ᛲᛴᛳᛲ:Z

    if-nez v1, :cond_1

    .line 70
    array-length v1, p1

    int-to-long v2, v1

    int-to-long v4, p2

    int-to-long v6, p3

    invoke-static/range {v2 .. v7}, Lyyds/ᲁᛴᛵᛱ;->ᛵᛸᛸᛷ(JJJ)V

    .line 71
    iget-wide v1, v0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    .line 72
    iget-object p0, p0, Lyyds/ᲀᲀᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛷᛳᛷ;

    const-wide/16 v1, 0x2000

    invoke-interface {p0, v1, v2, v0}, Lyyds/ᛷᛷᛳᛷ;->ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long p0, v1, v3

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Lyyds/ᛷᛲᲈᛲ;->read([BII)I

    move-result p0

    goto :goto_0

    .line 74
    :cond_1
    const-string p0, "closed"

    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    const/4 p0, 0x0

    :goto_0
    return p0

    .line 75
    :pswitch_0
    check-cast p0, Lyyds/ᛷᛲᲈᛲ;

    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᛷᛲᲈᛲ;->read([BII)I

    move-result p0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const-string v1, ".inputStream()"

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲇᛸ;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    check-cast p0, Lyyds/ᲀᲀᛵᲈ;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    check-cast p0, Lyyds/ᛷᛲᲈᛲ;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public transferTo(Ljava/io/OutputStream;)J
    .locals 14

    .line 1
    iget v0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲀᛲᛳᲀ:I

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
    iget-object p0, p0, Lyyds/ᲈᛱᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲇᛸ;

    .line 12
    .line 13
    check-cast p0, Lyyds/ᲀᲀᛵᲈ;

    .line 14
    .line 15
    iget-object v0, p0, Lyyds/ᲀᲀᛵᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 16
    .line 17
    iget-boolean v1, p0, Lyyds/ᲀᲀᛵᲈ;->ᛲᛴᛳᛲ:Z

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    if-nez v1, :cond_4

    .line 22
    .line 23
    move-wide v4, v2

    .line 24
    :cond_0
    iget-wide v6, v0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 25
    .line 26
    cmp-long v1, v6, v2

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    iget-object v1, p0, Lyyds/ᲀᲀᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛷᛳᛷ;

    .line 31
    .line 32
    const-wide/16 v6, 0x2000

    .line 33
    .line 34
    invoke-interface {v1, v6, v7, v0}, Lyyds/ᛷᛷᛳᛷ;->ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v6

    .line 38
    const-wide/16 v8, -0x1

    .line 39
    .line 40
    cmp-long v1, v6, v8

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-wide v2, v4

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    :goto_0
    iget-wide v6, v0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 48
    .line 49
    add-long/2addr v4, v6

    .line 50
    const-wide/16 v8, 0x0

    .line 51
    .line 52
    move-wide v10, v6

    .line 53
    invoke-static/range {v6 .. v11}, Lyyds/ᲁᛴᛵᛱ;->ᛵᛸᛸᛷ(JJJ)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, Lyyds/ᛷᛲᲈᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲈᛶ;

    .line 57
    .line 58
    :cond_3
    :goto_1
    cmp-long v8, v6, v2

    .line 59
    .line 60
    if-lez v8, :cond_0

    .line 61
    .line 62
    iget v8, v1, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 63
    .line 64
    iget v9, v1, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 65
    .line 66
    sub-int/2addr v8, v9

    .line 67
    int-to-long v8, v8

    .line 68
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v8

    .line 72
    long-to-int v8, v8

    .line 73
    iget-object v9, v1, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 74
    .line 75
    iget v10, v1, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 76
    .line 77
    invoke-virtual {p1, v9, v10, v8}, Ljava/io/OutputStream;->write([BII)V

    .line 78
    .line 79
    .line 80
    iget v9, v1, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 81
    .line 82
    add-int/2addr v9, v8

    .line 83
    iput v9, v1, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 84
    .line 85
    iget-wide v10, v0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 86
    .line 87
    int-to-long v12, v8

    .line 88
    sub-long/2addr v10, v12

    .line 89
    iput-wide v10, v0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 90
    .line 91
    sub-long/2addr v6, v12

    .line 92
    iget v8, v1, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 93
    .line 94
    if-ne v9, v8, :cond_3

    .line 95
    .line 96
    invoke-virtual {v1}, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ()Lyyds/ᛲᲈᲈᛶ;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    iput-object v8, v0, Lyyds/ᛷᛲᲈᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲈᛶ;

    .line 101
    .line 102
    invoke-static {v1}, Lyyds/ᛷᛱᛵᛵ;->ᛲᲈᲁ(Lyyds/ᛲᲈᲈᛶ;)V

    .line 103
    .line 104
    .line 105
    move-object v1, v8

    .line 106
    goto :goto_1

    .line 107
    :cond_4
    const-string p0, "closed"

    .line 108
    .line 109
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :goto_2
    return-wide v2

    .line 113
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
