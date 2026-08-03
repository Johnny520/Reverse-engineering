.class public final Lg8/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final b:[B

.field public c:I


# direct methods
.method public constructor <init>([BI)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg8/b;->a:I

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lg8/b;->b:[B

    .line 55
    iput p2, p0, Lg8/b;->c:I

    return-void
.end method

.method public constructor <init>([BIB)V
    .locals 0

    .line 1
    iput p2, p0, Lg8/b;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lg8/b;->b:[B

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_1
    array-length p2, p1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    if-ltz p2, :cond_1

    .line 17
    .line 18
    array-length p3, p1

    .line 19
    if-gt p2, p3, :cond_0

    .line 20
    .line 21
    iput-object p1, p0, Lg8/b;->b:[B

    .line 22
    .line 23
    iput p2, p0, Lg8/b;->c:I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p1, "end > bytes.length"

    .line 27
    .line 28
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    throw p1

    .line 33
    :cond_1
    const-string p1, "end < start"

    .line 34
    .line 35
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    throw p1

    .line 40
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    new-array p1, p1, [B

    .line 48
    .line 49
    :goto_0
    iput-object p1, p0, Lg8/b;->b:[B

    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public a(II)V
    .locals 5

    .line 1
    iget v0, p0, Lg8/b;->c:I

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-lt p2, p1, :cond_0

    .line 6
    .line 7
    if-gt p2, v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v2, ".."

    .line 13
    .line 14
    const-string v3, "; actual size "

    .line 15
    .line 16
    const-string v4, "bad range: "

    .line 17
    .line 18
    invoke-static {p1, p2, v4, v2, v3}, Leh/a;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1
.end method

.method public b(I)I
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lg8/b;->a(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg8/b;->b:[B

    .line 7
    .line 8
    aget-byte v0, v0, p1

    .line 9
    .line 10
    shl-int/lit8 v0, v0, 0x18

    .line 11
    .line 12
    add-int/lit8 v1, p1, 0x1

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lg8/b;->f(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    shl-int/lit8 v1, v1, 0x10

    .line 19
    .line 20
    or-int/2addr v0, v1

    .line 21
    add-int/lit8 v1, p1, 0x2

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lg8/b;->f(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    shl-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    add-int/lit8 p1, p1, 0x3

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lg8/b;->f(I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    or-int/2addr p1, v0

    .line 37
    return p1
.end method

.method public c(I)J
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lg8/b;->a(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg8/b;->b:[B

    .line 7
    .line 8
    aget-byte v1, v0, p1

    .line 9
    .line 10
    shl-int/lit8 v1, v1, 0x18

    .line 11
    .line 12
    add-int/lit8 v2, p1, 0x1

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lg8/b;->f(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    shl-int/lit8 v2, v2, 0x10

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    add-int/lit8 v2, p1, 0x2

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lg8/b;->f(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shl-int/lit8 v2, v2, 0x8

    .line 28
    .line 29
    or-int/2addr v1, v2

    .line 30
    add-int/lit8 v2, p1, 0x3

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Lg8/b;->f(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    or-int/2addr v1, v2

    .line 37
    add-int/lit8 v2, p1, 0x4

    .line 38
    .line 39
    aget-byte v0, v0, v2

    .line 40
    .line 41
    shl-int/lit8 v0, v0, 0x18

    .line 42
    .line 43
    add-int/lit8 v2, p1, 0x5

    .line 44
    .line 45
    invoke-virtual {p0, v2}, Lg8/b;->f(I)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    shl-int/lit8 v2, v2, 0x10

    .line 50
    .line 51
    or-int/2addr v0, v2

    .line 52
    add-int/lit8 v2, p1, 0x6

    .line 53
    .line 54
    invoke-virtual {p0, v2}, Lg8/b;->f(I)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    shl-int/lit8 v2, v2, 0x8

    .line 59
    .line 60
    or-int/2addr v0, v2

    .line 61
    add-int/lit8 p1, p1, 0x7

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lg8/b;->f(I)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    or-int/2addr p1, v0

    .line 68
    int-to-long v2, p1

    .line 69
    const-wide v4, 0xffffffffL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    and-long/2addr v2, v4

    .line 75
    int-to-long v0, v1

    .line 76
    const/16 p1, 0x20

    .line 77
    .line 78
    shl-long/2addr v0, p1

    .line 79
    or-long/2addr v0, v2

    .line 80
    return-wide v0
.end method

.method public d(I)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lg8/b;->a(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg8/b;->b:[B

    .line 7
    .line 8
    aget-byte v0, v0, p1

    .line 9
    .line 10
    shl-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lg8/b;->f(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    or-int/2addr p1, v0

    .line 19
    return p1
.end method

.method public e(I)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lg8/b;->a(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lg8/b;->f(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public f(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lg8/b;->b:[B

    .line 2
    .line 3
    aget-byte p1, v0, p1

    .line 4
    .line 5
    and-int/lit16 p1, p1, 0xff

    .line 6
    .line 7
    return p1
.end method

.method public g(I)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lg8/b;->a(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lg8/b;->f(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    shl-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lg8/b;->f(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    or-int/2addr p1, v0

    .line 19
    return p1
.end method

.method public h()[B
    .locals 5

    .line 1
    iget v0, p0, Lg8/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg8/b;->j()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lg8/b;->b:[B

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    iget v3, p0, Lg8/b;->c:I

    .line 16
    .line 17
    sub-int/2addr v2, v3

    .line 18
    if-gt v0, v2, :cond_0

    .line 19
    .line 20
    new-array v2, v0, [B

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v1, v3, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lg8/b;->c:I

    .line 27
    .line 28
    add-int/2addr v1, v0

    .line 29
    iput v1, p0, Lg8/b;->c:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v0, "bytes\u957f\u5ea6\u5f02\u5e38"

    .line 33
    .line 34
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    :goto_0
    return-object v2

    .line 39
    :pswitch_0
    invoke-virtual {p0}, Lg8/b;->j()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-ltz v0, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Lg8/b;->b:[B

    .line 46
    .line 47
    array-length v2, v1

    .line 48
    iget v3, p0, Lg8/b;->c:I

    .line 49
    .line 50
    sub-int/2addr v2, v3

    .line 51
    if-gt v0, v2, :cond_1

    .line 52
    .line 53
    new-array v2, v0, [B

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-static {v1, v3, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 57
    .line 58
    .line 59
    iget v1, p0, Lg8/b;->c:I

    .line 60
    .line 61
    add-int/2addr v1, v0

    .line 62
    iput v1, p0, Lg8/b;->c:I

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const-string v0, "bytes\u957f\u5ea6\u5f02\u5e38"

    .line 66
    .line 67
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    :goto_1
    return-object v2

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg8/b;->h()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    new-instance v1, Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "UTF-8"

    .line 8
    .line 9
    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-object v1

    .line 13
    :catchall_0
    new-instance v1, Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 16
    .line 17
    .line 18
    return-object v1
.end method

.method public j()I
    .locals 4

    .line 1
    iget v0, p0, Lg8/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg8/b;->k()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/32 v2, 0x7fffffff

    .line 11
    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-gtz v2, :cond_0

    .line 16
    .line 17
    long-to-int v0, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "varint\u8fc7\u5927"

    .line 20
    .line 21
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    :goto_0
    return v0

    .line 26
    :pswitch_0
    invoke-virtual {p0}, Lg8/b;->k()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    const-wide/32 v2, 0x7fffffff

    .line 31
    .line 32
    .line 33
    cmp-long v2, v0, v2

    .line 34
    .line 35
    if-gtz v2, :cond_1

    .line 36
    .line 37
    long-to-int v0, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string v0, "varint\u8fc7\u5927"

    .line 40
    .line 41
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    :goto_1
    return v0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public k()J
    .locals 7

    .line 1
    iget v0, p0, Lg8/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    const/16 v3, 0x40

    .line 10
    .line 11
    if-ge v2, v3, :cond_2

    .line 12
    .line 13
    iget v3, p0, Lg8/b;->c:I

    .line 14
    .line 15
    add-int/lit8 v4, v3, 0x1

    .line 16
    .line 17
    iget-object v5, p0, Lg8/b;->b:[B

    .line 18
    .line 19
    array-length v6, v5

    .line 20
    if-gt v4, v6, :cond_1

    .line 21
    .line 22
    add-int/lit8 v4, v3, 0x1

    .line 23
    .line 24
    iput v4, p0, Lg8/b;->c:I

    .line 25
    .line 26
    aget-byte v3, v5, v3

    .line 27
    .line 28
    and-int/lit8 v4, v3, 0x7f

    .line 29
    .line 30
    int-to-long v4, v4

    .line 31
    shl-long/2addr v4, v2

    .line 32
    or-long/2addr v0, v4

    .line 33
    and-int/lit16 v3, v3, 0x80

    .line 34
    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_0
    add-int/lit8 v2, v2, 0x7

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const-string v0, "protobuf\u957f\u5ea6\u4e0d\u8db3"

    .line 42
    .line 43
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    const-wide/16 v0, 0x0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const-string v0, "varint\u5f02\u5e38"

    .line 50
    .line 51
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :goto_2
    return-wide v0

    .line 56
    :pswitch_0
    const-wide/16 v0, 0x0

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    :goto_3
    const/16 v3, 0x40

    .line 60
    .line 61
    if-ge v2, v3, :cond_5

    .line 62
    .line 63
    iget v3, p0, Lg8/b;->c:I

    .line 64
    .line 65
    add-int/lit8 v4, v3, 0x1

    .line 66
    .line 67
    iget-object v5, p0, Lg8/b;->b:[B

    .line 68
    .line 69
    array-length v6, v5

    .line 70
    if-gt v4, v6, :cond_4

    .line 71
    .line 72
    add-int/lit8 v4, v3, 0x1

    .line 73
    .line 74
    iput v4, p0, Lg8/b;->c:I

    .line 75
    .line 76
    aget-byte v3, v5, v3

    .line 77
    .line 78
    and-int/lit8 v4, v3, 0x7f

    .line 79
    .line 80
    int-to-long v4, v4

    .line 81
    shl-long/2addr v4, v2

    .line 82
    or-long/2addr v0, v4

    .line 83
    and-int/lit16 v3, v3, 0x80

    .line 84
    .line 85
    if-nez v3, :cond_3

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_3
    add-int/lit8 v2, v2, 0x7

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    const-string v0, "protobuf\u957f\u5ea6\u4e0d\u8db3"

    .line 92
    .line 93
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :goto_4
    const-wide/16 v0, 0x0

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_5
    const-string v0, "varint\u5f02\u5e38"

    .line 100
    .line 101
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :goto_5
    return-wide v0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public l(I)V
    .locals 1

    .line 1
    iget v0, p0, Lg8/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-eq p1, v0, :cond_2

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x5

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x4

    .line 18
    invoke-virtual {p0, p1}, Lg8/b;->m(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "\u4e0d\u652f\u6301\u7684wireType: "

    .line 23
    .line 24
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0}, Lg8/b;->j()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {p0, p1}, Lg8/b;->m(I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/16 p1, 0x8

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lg8/b;->m(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    invoke-virtual {p0}, Lg8/b;->k()J

    .line 47
    .line 48
    .line 49
    :goto_0
    return-void

    .line 50
    :pswitch_0
    if-eqz p1, :cond_7

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    if-eq p1, v0, :cond_6

    .line 54
    .line 55
    const/4 v0, 0x2

    .line 56
    if-eq p1, v0, :cond_5

    .line 57
    .line 58
    const/4 v0, 0x5

    .line 59
    if-ne p1, v0, :cond_4

    .line 60
    .line 61
    const/4 p1, 0x4

    .line 62
    invoke-virtual {p0, p1}, Lg8/b;->m(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    const-string v0, "\u4e0d\u652f\u6301\u7684wireType: "

    .line 67
    .line 68
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    invoke-virtual {p0}, Lg8/b;->j()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {p0, p1}, Lg8/b;->m(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_6
    const/16 p1, 0x8

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lg8/b;->m(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_7
    invoke-virtual {p0}, Lg8/b;->k()J

    .line 91
    .line 92
    .line 93
    :goto_1
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public m(I)V
    .locals 3

    .line 1
    iget v0, p0, Lg8/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-ltz p1, :cond_1

    .line 7
    .line 8
    if-ltz p1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lg8/b;->c:I

    .line 11
    .line 12
    add-int v1, v0, p1

    .line 13
    .line 14
    iget-object v2, p0, Lg8/b;->b:[B

    .line 15
    .line 16
    array-length v2, v2

    .line 17
    if-gt v1, v2, :cond_0

    .line 18
    .line 19
    add-int/2addr v0, p1

    .line 20
    iput v0, p0, Lg8/b;->c:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p1, "protobuf\u957f\u5ea6\u4e0d\u8db3"

    .line 24
    .line 25
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-string p1, "\u8df3\u8fc7\u957f\u5ea6\u5f02\u5e38"

    .line 30
    .line 31
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :pswitch_0
    if-ltz p1, :cond_3

    .line 36
    .line 37
    iget v0, p0, Lg8/b;->c:I

    .line 38
    .line 39
    add-int v1, v0, p1

    .line 40
    .line 41
    iget-object v2, p0, Lg8/b;->b:[B

    .line 42
    .line 43
    array-length v2, v2

    .line 44
    if-gt v1, v2, :cond_2

    .line 45
    .line 46
    add-int/2addr v0, p1

    .line 47
    iput v0, p0, Lg8/b;->c:I

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const-string p1, "protobuf\u957f\u5ea6\u4e0d\u8db3"

    .line 51
    .line 52
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    const-string p1, "\u8df3\u8fc7\u957f\u5ea6\u5f02\u5e38"

    .line 57
    .line 58
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public n(II)Lg8/b;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lg8/b;->a(II)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg8/b;->b:[B

    .line 5
    .line 6
    invoke-static {v0, p1, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance p2, Lg8/b;

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {p2, p1, v0, v1}, Lg8/b;-><init>([BIB)V

    .line 15
    .line 16
    .line 17
    return-object p2
.end method
