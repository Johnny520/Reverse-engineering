.class public La5/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv5/b;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La5/a;->g:I

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 36
    iput v0, p0, La5/a;->h:I

    const/4 v0, 0x0

    .line 37
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La5/a;->i:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 34
    iput p2, p0, La5/a;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, La5/a;->g:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, La5/a;->i:Ljava/lang/Object;

    .line 15
    .line 16
    iput p1, p0, La5/a;->h:I

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p2, Lz4/g;

    .line 23
    .line 24
    invoke-direct {p2, p1}, Lz4/g;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, La5/a;->i:Ljava/lang/Object;

    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 31
    iput p2, p0, La5/a;->g:I

    iput-object p3, p0, La5/a;->i:Ljava/lang/Object;

    iput p1, p0, La5/a;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lac/k;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, La5/a;->g:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, La5/a;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La5/a;->g:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput v0, p0, La5/a;->h:I

    .line 40
    iput-object p1, p0, La5/a;->i:Ljava/lang/Object;

    return-void
.end method

.method public static b(La5/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld7/g;

    .line 4
    .line 5
    invoke-virtual {p0}, La5/a;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget p0, p0, La5/a;->h:I

    .line 14
    .line 15
    add-int/2addr p0, v2

    .line 16
    iget-object v0, v0, Lr7/b;->k:[B

    .line 17
    .line 18
    aget-byte v1, v0, p0

    .line 19
    .line 20
    and-int/lit16 v1, v1, 0xf7

    .line 21
    .line 22
    or-int/lit8 v1, v1, 0x8

    .line 23
    .line 24
    int-to-byte v1, v1

    .line 25
    aput-byte v1, v0, p0

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    new-instance v0, Lv5/a;

    .line 2
    .line 3
    iget-object v1, p0, La5/a;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lf5/h;

    .line 6
    .line 7
    iget v2, v1, Lf5/h;->h:I

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v3, p0, La5/a;->h:I

    .line 14
    .line 15
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "%d@%d"

    .line 24
    .line 25
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-direct {v0, v2, v1}, Lv5/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public c(J)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, La5/a;->e(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, La5/a;->h:I

    .line 8
    .line 9
    iget-object v1, p0, La5/a;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [J

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-lt v0, v2, :cond_0

    .line 15
    .line 16
    add-int/lit8 v2, v0, 0x1

    .line 17
    .line 18
    array-length v3, v1

    .line 19
    mul-int/lit8 v3, v3, 0x2

    .line 20
    .line 21
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, La5/a;->i:Ljava/lang/Object;

    .line 30
    .line 31
    :cond_0
    aput-wide p1, v1, v0

    .line 32
    .line 33
    iget p1, p0, La5/a;->h:I

    .line 34
    .line 35
    if-lt v0, p1, :cond_1

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    iput v0, p0, La5/a;->h:I

    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public d(III)V
    .locals 3

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/g;

    .line 4
    .line 5
    iget v1, v0, Lz4/g;->i:I

    .line 6
    .line 7
    if-lt p1, v1, :cond_0

    .line 8
    .line 9
    sub-int v1, p1, v1

    .line 10
    .line 11
    :goto_0
    if-ltz v1, :cond_0

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    invoke-virtual {v0, v2}, Lz4/g;->l(I)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0, p1, p2}, Lz4/g;->q(II)V

    .line 21
    .line 22
    .line 23
    iget p1, p0, La5/a;->h:I

    .line 24
    .line 25
    add-int/2addr p2, p3

    .line 26
    if-ge p1, p2, :cond_1

    .line 27
    .line 28
    iput p2, p0, La5/a;->h:I

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public e(J)Z
    .locals 6

    .line 1
    iget v0, p0, La5/a;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    iget-object v3, p0, La5/a;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [J

    .line 10
    .line 11
    aget-wide v4, v3, v2

    .line 12
    .line 13
    cmp-long v3, v4, p1

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return v1
.end method

.method public f()I
    .locals 2

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lac/k;

    .line 4
    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lac/k;->B(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lac/k;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public g()Z
    .locals 3

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld7/g;

    .line 4
    .line 5
    iget v1, p0, La5/a;->h:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    iget-object v0, v0, Lr7/b;->k:[B

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lk7/a;->q([BII)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method public h(I)I
    .locals 4

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/x;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, p0, La5/a;->h:I

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq p1, v2, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq p1, v2, :cond_2

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    if-eq p1, v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    if-ne p1, v2, :cond_0

    .line 25
    .line 26
    aget-byte v2, v0, v1

    .line 27
    .line 28
    and-int/lit16 v2, v2, 0xff

    .line 29
    .line 30
    add-int/lit8 v3, v1, 0x1

    .line 31
    .line 32
    aget-byte v3, v0, v3

    .line 33
    .line 34
    and-int/lit16 v3, v3, 0xff

    .line 35
    .line 36
    shl-int/lit8 v3, v3, 0x8

    .line 37
    .line 38
    or-int/2addr v2, v3

    .line 39
    add-int/lit8 v3, v1, 0x2

    .line 40
    .line 41
    aget-byte v3, v0, v3

    .line 42
    .line 43
    and-int/lit16 v3, v3, 0xff

    .line 44
    .line 45
    shl-int/lit8 v3, v3, 0x10

    .line 46
    .line 47
    or-int/2addr v2, v3

    .line 48
    add-int/lit8 v3, v1, 0x3

    .line 49
    .line 50
    aget-byte v0, v0, v3

    .line 51
    .line 52
    shl-int/lit8 v0, v0, 0x18

    .line 53
    .line 54
    :goto_0
    or-int/2addr v0, v2

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    new-instance v0, Ld6/f;

    .line 57
    .line 58
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget v1, p0, La5/a;->h:I

    .line 63
    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const/4 v1, 0x0

    .line 73
    const-string v2, "Invalid size %d for sized int at offset 0x%x"

    .line 74
    .line 75
    invoke-direct {v0, v1, v2, p1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_1
    aget-byte v2, v0, v1

    .line 80
    .line 81
    and-int/lit16 v2, v2, 0xff

    .line 82
    .line 83
    add-int/lit8 v3, v1, 0x1

    .line 84
    .line 85
    aget-byte v3, v0, v3

    .line 86
    .line 87
    and-int/lit16 v3, v3, 0xff

    .line 88
    .line 89
    shl-int/lit8 v3, v3, 0x8

    .line 90
    .line 91
    or-int/2addr v2, v3

    .line 92
    add-int/lit8 v3, v1, 0x2

    .line 93
    .line 94
    aget-byte v0, v0, v3

    .line 95
    .line 96
    shl-int/lit8 v0, v0, 0x10

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    aget-byte v2, v0, v1

    .line 100
    .line 101
    and-int/lit16 v2, v2, 0xff

    .line 102
    .line 103
    add-int/lit8 v3, v1, 0x1

    .line 104
    .line 105
    aget-byte v0, v0, v3

    .line 106
    .line 107
    shl-int/lit8 v0, v0, 0x8

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    aget-byte v0, v0, v1

    .line 111
    .line 112
    :goto_1
    add-int/2addr v1, p1

    .line 113
    iput v1, p0, La5/a;->h:I

    .line 114
    .line 115
    return v0
.end method

.method public i(I)J
    .locals 12

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/x;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, p0, La5/a;->h:I

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    const/16 v2, 0x30

    .line 15
    .line 16
    const/16 v3, 0x28

    .line 17
    .line 18
    const/16 v4, 0x20

    .line 19
    .line 20
    const/16 v5, 0x18

    .line 21
    .line 22
    const-wide/16 v6, 0xff

    .line 23
    .line 24
    packed-switch p1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    new-instance v0, Ld6/f;

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget v1, p0, La5/a;->h:I

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/4 v1, 0x0

    .line 44
    const-string v2, "Invalid size %d for sized long at offset 0x%x"

    .line 45
    .line 46
    invoke-direct {v0, v1, v2, p1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :pswitch_0
    aget-byte v8, v0, v1

    .line 51
    .line 52
    and-int/lit16 v8, v8, 0xff

    .line 53
    .line 54
    add-int/lit8 v9, v1, 0x1

    .line 55
    .line 56
    aget-byte v9, v0, v9

    .line 57
    .line 58
    and-int/lit16 v9, v9, 0xff

    .line 59
    .line 60
    shl-int/lit8 v9, v9, 0x8

    .line 61
    .line 62
    or-int/2addr v8, v9

    .line 63
    add-int/lit8 v9, v1, 0x2

    .line 64
    .line 65
    aget-byte v9, v0, v9

    .line 66
    .line 67
    and-int/lit16 v9, v9, 0xff

    .line 68
    .line 69
    shl-int/lit8 v9, v9, 0x10

    .line 70
    .line 71
    or-int/2addr v8, v9

    .line 72
    int-to-long v8, v8

    .line 73
    add-int/lit8 v10, v1, 0x3

    .line 74
    .line 75
    aget-byte v10, v0, v10

    .line 76
    .line 77
    int-to-long v10, v10

    .line 78
    and-long/2addr v10, v6

    .line 79
    shl-long/2addr v10, v5

    .line 80
    or-long/2addr v8, v10

    .line 81
    add-int/lit8 v5, v1, 0x4

    .line 82
    .line 83
    aget-byte v5, v0, v5

    .line 84
    .line 85
    int-to-long v10, v5

    .line 86
    and-long/2addr v10, v6

    .line 87
    shl-long v4, v10, v4

    .line 88
    .line 89
    or-long/2addr v4, v8

    .line 90
    add-int/lit8 v8, v1, 0x5

    .line 91
    .line 92
    aget-byte v8, v0, v8

    .line 93
    .line 94
    int-to-long v8, v8

    .line 95
    and-long/2addr v8, v6

    .line 96
    shl-long/2addr v8, v3

    .line 97
    or-long v3, v4, v8

    .line 98
    .line 99
    add-int/lit8 v5, v1, 0x6

    .line 100
    .line 101
    aget-byte v5, v0, v5

    .line 102
    .line 103
    int-to-long v8, v5

    .line 104
    and-long v5, v8, v6

    .line 105
    .line 106
    shl-long/2addr v5, v2

    .line 107
    or-long v2, v3, v5

    .line 108
    .line 109
    add-int/lit8 v4, v1, 0x7

    .line 110
    .line 111
    aget-byte v0, v0, v4

    .line 112
    .line 113
    int-to-long v4, v0

    .line 114
    const/16 v0, 0x38

    .line 115
    .line 116
    shl-long/2addr v4, v0

    .line 117
    :goto_0
    or-long/2addr v2, v4

    .line 118
    goto/16 :goto_3

    .line 119
    .line 120
    :pswitch_1
    aget-byte v8, v0, v1

    .line 121
    .line 122
    and-int/lit16 v8, v8, 0xff

    .line 123
    .line 124
    add-int/lit8 v9, v1, 0x1

    .line 125
    .line 126
    aget-byte v9, v0, v9

    .line 127
    .line 128
    and-int/lit16 v9, v9, 0xff

    .line 129
    .line 130
    shl-int/lit8 v9, v9, 0x8

    .line 131
    .line 132
    or-int/2addr v8, v9

    .line 133
    add-int/lit8 v9, v1, 0x2

    .line 134
    .line 135
    aget-byte v9, v0, v9

    .line 136
    .line 137
    and-int/lit16 v9, v9, 0xff

    .line 138
    .line 139
    shl-int/lit8 v9, v9, 0x10

    .line 140
    .line 141
    or-int/2addr v8, v9

    .line 142
    int-to-long v8, v8

    .line 143
    add-int/lit8 v10, v1, 0x3

    .line 144
    .line 145
    aget-byte v10, v0, v10

    .line 146
    .line 147
    int-to-long v10, v10

    .line 148
    and-long/2addr v10, v6

    .line 149
    shl-long/2addr v10, v5

    .line 150
    or-long/2addr v8, v10

    .line 151
    add-int/lit8 v5, v1, 0x4

    .line 152
    .line 153
    aget-byte v5, v0, v5

    .line 154
    .line 155
    int-to-long v10, v5

    .line 156
    and-long/2addr v10, v6

    .line 157
    shl-long v4, v10, v4

    .line 158
    .line 159
    or-long/2addr v4, v8

    .line 160
    add-int/lit8 v8, v1, 0x5

    .line 161
    .line 162
    aget-byte v8, v0, v8

    .line 163
    .line 164
    int-to-long v8, v8

    .line 165
    and-long/2addr v6, v8

    .line 166
    shl-long/2addr v6, v3

    .line 167
    or-long v3, v4, v6

    .line 168
    .line 169
    add-int/lit8 v5, v1, 0x6

    .line 170
    .line 171
    aget-byte v0, v0, v5

    .line 172
    .line 173
    int-to-long v5, v0

    .line 174
    shl-long/2addr v5, v2

    .line 175
    or-long v2, v3, v5

    .line 176
    .line 177
    goto/16 :goto_3

    .line 178
    .line 179
    :pswitch_2
    aget-byte v2, v0, v1

    .line 180
    .line 181
    and-int/lit16 v2, v2, 0xff

    .line 182
    .line 183
    add-int/lit8 v8, v1, 0x1

    .line 184
    .line 185
    aget-byte v8, v0, v8

    .line 186
    .line 187
    and-int/lit16 v8, v8, 0xff

    .line 188
    .line 189
    shl-int/lit8 v8, v8, 0x8

    .line 190
    .line 191
    or-int/2addr v2, v8

    .line 192
    add-int/lit8 v8, v1, 0x2

    .line 193
    .line 194
    aget-byte v8, v0, v8

    .line 195
    .line 196
    and-int/lit16 v8, v8, 0xff

    .line 197
    .line 198
    shl-int/lit8 v8, v8, 0x10

    .line 199
    .line 200
    or-int/2addr v2, v8

    .line 201
    int-to-long v8, v2

    .line 202
    add-int/lit8 v2, v1, 0x3

    .line 203
    .line 204
    aget-byte v2, v0, v2

    .line 205
    .line 206
    int-to-long v10, v2

    .line 207
    and-long/2addr v10, v6

    .line 208
    shl-long/2addr v10, v5

    .line 209
    or-long/2addr v8, v10

    .line 210
    add-int/lit8 v2, v1, 0x4

    .line 211
    .line 212
    aget-byte v2, v0, v2

    .line 213
    .line 214
    int-to-long v10, v2

    .line 215
    and-long v5, v10, v6

    .line 216
    .line 217
    shl-long v4, v5, v4

    .line 218
    .line 219
    or-long/2addr v4, v8

    .line 220
    add-int/lit8 v2, v1, 0x5

    .line 221
    .line 222
    aget-byte v0, v0, v2

    .line 223
    .line 224
    int-to-long v6, v0

    .line 225
    shl-long v2, v6, v3

    .line 226
    .line 227
    or-long/2addr v2, v4

    .line 228
    goto :goto_3

    .line 229
    :pswitch_3
    aget-byte v2, v0, v1

    .line 230
    .line 231
    and-int/lit16 v2, v2, 0xff

    .line 232
    .line 233
    add-int/lit8 v3, v1, 0x1

    .line 234
    .line 235
    aget-byte v3, v0, v3

    .line 236
    .line 237
    and-int/lit16 v3, v3, 0xff

    .line 238
    .line 239
    shl-int/lit8 v3, v3, 0x8

    .line 240
    .line 241
    or-int/2addr v2, v3

    .line 242
    add-int/lit8 v3, v1, 0x2

    .line 243
    .line 244
    aget-byte v3, v0, v3

    .line 245
    .line 246
    and-int/lit16 v3, v3, 0xff

    .line 247
    .line 248
    shl-int/lit8 v3, v3, 0x10

    .line 249
    .line 250
    or-int/2addr v2, v3

    .line 251
    int-to-long v2, v2

    .line 252
    add-int/lit8 v8, v1, 0x3

    .line 253
    .line 254
    aget-byte v8, v0, v8

    .line 255
    .line 256
    int-to-long v8, v8

    .line 257
    and-long/2addr v6, v8

    .line 258
    shl-long v5, v6, v5

    .line 259
    .line 260
    or-long/2addr v2, v5

    .line 261
    add-int/lit8 v5, v1, 0x4

    .line 262
    .line 263
    aget-byte v0, v0, v5

    .line 264
    .line 265
    int-to-long v5, v0

    .line 266
    shl-long v4, v5, v4

    .line 267
    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :pswitch_4
    aget-byte v2, v0, v1

    .line 271
    .line 272
    and-int/lit16 v2, v2, 0xff

    .line 273
    .line 274
    add-int/lit8 v3, v1, 0x1

    .line 275
    .line 276
    aget-byte v3, v0, v3

    .line 277
    .line 278
    and-int/lit16 v3, v3, 0xff

    .line 279
    .line 280
    shl-int/lit8 v3, v3, 0x8

    .line 281
    .line 282
    or-int/2addr v2, v3

    .line 283
    add-int/lit8 v3, v1, 0x2

    .line 284
    .line 285
    aget-byte v3, v0, v3

    .line 286
    .line 287
    and-int/lit16 v3, v3, 0xff

    .line 288
    .line 289
    shl-int/lit8 v3, v3, 0x10

    .line 290
    .line 291
    or-int/2addr v2, v3

    .line 292
    int-to-long v2, v2

    .line 293
    add-int/lit8 v4, v1, 0x3

    .line 294
    .line 295
    aget-byte v0, v0, v4

    .line 296
    .line 297
    int-to-long v6, v0

    .line 298
    shl-long v4, v6, v5

    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :pswitch_5
    aget-byte v2, v0, v1

    .line 303
    .line 304
    and-int/lit16 v2, v2, 0xff

    .line 305
    .line 306
    add-int/lit8 v3, v1, 0x1

    .line 307
    .line 308
    aget-byte v3, v0, v3

    .line 309
    .line 310
    and-int/lit16 v3, v3, 0xff

    .line 311
    .line 312
    shl-int/lit8 v3, v3, 0x8

    .line 313
    .line 314
    or-int/2addr v2, v3

    .line 315
    add-int/lit8 v3, v1, 0x2

    .line 316
    .line 317
    aget-byte v0, v0, v3

    .line 318
    .line 319
    shl-int/lit8 v0, v0, 0x10

    .line 320
    .line 321
    :goto_1
    or-int/2addr v0, v2

    .line 322
    :goto_2
    int-to-long v2, v0

    .line 323
    goto :goto_3

    .line 324
    :pswitch_6
    aget-byte v2, v0, v1

    .line 325
    .line 326
    and-int/lit16 v2, v2, 0xff

    .line 327
    .line 328
    add-int/lit8 v3, v1, 0x1

    .line 329
    .line 330
    aget-byte v0, v0, v3

    .line 331
    .line 332
    shl-int/lit8 v0, v0, 0x8

    .line 333
    .line 334
    goto :goto_1

    .line 335
    :pswitch_7
    aget-byte v0, v0, v1

    .line 336
    .line 337
    goto :goto_2

    .line 338
    :goto_3
    add-int/2addr v1, p1

    .line 339
    iput v1, p0, La5/a;->h:I

    .line 340
    .line 341
    return-wide v2

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j(I)I
    .locals 4

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/x;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, p0, La5/a;->h:I

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq p1, v2, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq p1, v2, :cond_2

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    if-eq p1, v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    if-ne p1, v2, :cond_0

    .line 25
    .line 26
    aget-byte v2, v0, v1

    .line 27
    .line 28
    and-int/lit16 v2, v2, 0xff

    .line 29
    .line 30
    add-int/lit8 v3, v1, 0x1

    .line 31
    .line 32
    aget-byte v3, v0, v3

    .line 33
    .line 34
    and-int/lit16 v3, v3, 0xff

    .line 35
    .line 36
    shl-int/lit8 v3, v3, 0x8

    .line 37
    .line 38
    or-int/2addr v2, v3

    .line 39
    add-int/lit8 v3, v1, 0x2

    .line 40
    .line 41
    aget-byte v3, v0, v3

    .line 42
    .line 43
    and-int/lit16 v3, v3, 0xff

    .line 44
    .line 45
    shl-int/lit8 v3, v3, 0x10

    .line 46
    .line 47
    or-int/2addr v2, v3

    .line 48
    add-int/lit8 v3, v1, 0x3

    .line 49
    .line 50
    aget-byte v0, v0, v3

    .line 51
    .line 52
    :goto_0
    shl-int/lit8 v0, v0, 0x18

    .line 53
    .line 54
    or-int/2addr v0, v2

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    new-instance v0, Ld6/f;

    .line 57
    .line 58
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget v1, p0, La5/a;->h:I

    .line 63
    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const/4 v1, 0x0

    .line 73
    const-string v2, "Invalid size %d for sized, right extended int at offset 0x%x"

    .line 74
    .line 75
    invoke-direct {v0, v1, v2, p1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_1
    aget-byte v2, v0, v1

    .line 80
    .line 81
    and-int/lit16 v2, v2, 0xff

    .line 82
    .line 83
    shl-int/lit8 v2, v2, 0x8

    .line 84
    .line 85
    add-int/lit8 v3, v1, 0x1

    .line 86
    .line 87
    aget-byte v3, v0, v3

    .line 88
    .line 89
    and-int/lit16 v3, v3, 0xff

    .line 90
    .line 91
    shl-int/lit8 v3, v3, 0x10

    .line 92
    .line 93
    or-int/2addr v2, v3

    .line 94
    add-int/lit8 v3, v1, 0x2

    .line 95
    .line 96
    aget-byte v0, v0, v3

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    aget-byte v2, v0, v1

    .line 100
    .line 101
    and-int/lit16 v2, v2, 0xff

    .line 102
    .line 103
    shl-int/lit8 v2, v2, 0x10

    .line 104
    .line 105
    add-int/lit8 v3, v1, 0x1

    .line 106
    .line 107
    aget-byte v0, v0, v3

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    aget-byte v0, v0, v1

    .line 111
    .line 112
    shl-int/lit8 v0, v0, 0x18

    .line 113
    .line 114
    :goto_1
    add-int/2addr v1, p1

    .line 115
    iput v1, p0, La5/a;->h:I

    .line 116
    .line 117
    return v0
.end method

.method public k(I)J
    .locals 13

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/x;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, p0, La5/a;->h:I

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    const/16 v2, 0x18

    .line 15
    .line 16
    const/16 v3, 0x20

    .line 17
    .line 18
    const/16 v4, 0x28

    .line 19
    .line 20
    const/16 v5, 0x30

    .line 21
    .line 22
    const/16 v6, 0x38

    .line 23
    .line 24
    const-wide/16 v7, 0xff

    .line 25
    .line 26
    packed-switch p1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    new-instance v0, Ld6/f;

    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget v1, p0, La5/a;->h:I

    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 v1, 0x0

    .line 46
    const-string v2, "Invalid size %d for sized, right extended long at offset 0x%x"

    .line 47
    .line 48
    invoke-direct {v0, v1, v2, p1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :pswitch_0
    aget-byte v9, v0, v1

    .line 53
    .line 54
    and-int/lit16 v9, v9, 0xff

    .line 55
    .line 56
    add-int/lit8 v10, v1, 0x1

    .line 57
    .line 58
    aget-byte v10, v0, v10

    .line 59
    .line 60
    and-int/lit16 v10, v10, 0xff

    .line 61
    .line 62
    shl-int/lit8 v10, v10, 0x8

    .line 63
    .line 64
    or-int/2addr v9, v10

    .line 65
    add-int/lit8 v10, v1, 0x2

    .line 66
    .line 67
    aget-byte v10, v0, v10

    .line 68
    .line 69
    and-int/lit16 v10, v10, 0xff

    .line 70
    .line 71
    shl-int/lit8 v10, v10, 0x10

    .line 72
    .line 73
    or-int/2addr v9, v10

    .line 74
    int-to-long v9, v9

    .line 75
    add-int/lit8 v11, v1, 0x3

    .line 76
    .line 77
    aget-byte v11, v0, v11

    .line 78
    .line 79
    int-to-long v11, v11

    .line 80
    and-long/2addr v11, v7

    .line 81
    shl-long/2addr v11, v2

    .line 82
    or-long/2addr v9, v11

    .line 83
    add-int/lit8 v2, v1, 0x4

    .line 84
    .line 85
    aget-byte v2, v0, v2

    .line 86
    .line 87
    int-to-long v11, v2

    .line 88
    and-long/2addr v11, v7

    .line 89
    shl-long v2, v11, v3

    .line 90
    .line 91
    or-long/2addr v2, v9

    .line 92
    add-int/lit8 v9, v1, 0x5

    .line 93
    .line 94
    aget-byte v9, v0, v9

    .line 95
    .line 96
    int-to-long v9, v9

    .line 97
    and-long/2addr v9, v7

    .line 98
    shl-long/2addr v9, v4

    .line 99
    or-long/2addr v2, v9

    .line 100
    add-int/lit8 v4, v1, 0x6

    .line 101
    .line 102
    aget-byte v4, v0, v4

    .line 103
    .line 104
    int-to-long v9, v4

    .line 105
    and-long/2addr v7, v9

    .line 106
    shl-long v4, v7, v5

    .line 107
    .line 108
    or-long/2addr v2, v4

    .line 109
    add-int/lit8 v4, v1, 0x7

    .line 110
    .line 111
    aget-byte v0, v0, v4

    .line 112
    .line 113
    :goto_0
    int-to-long v4, v0

    .line 114
    shl-long/2addr v4, v6

    .line 115
    or-long/2addr v2, v4

    .line 116
    goto/16 :goto_1

    .line 117
    .line 118
    :pswitch_1
    aget-byte v9, v0, v1

    .line 119
    .line 120
    and-int/lit16 v9, v9, 0xff

    .line 121
    .line 122
    shl-int/lit8 v9, v9, 0x8

    .line 123
    .line 124
    add-int/lit8 v10, v1, 0x1

    .line 125
    .line 126
    aget-byte v10, v0, v10

    .line 127
    .line 128
    and-int/lit16 v10, v10, 0xff

    .line 129
    .line 130
    shl-int/lit8 v10, v10, 0x10

    .line 131
    .line 132
    or-int/2addr v9, v10

    .line 133
    int-to-long v9, v9

    .line 134
    add-int/lit8 v11, v1, 0x2

    .line 135
    .line 136
    aget-byte v11, v0, v11

    .line 137
    .line 138
    int-to-long v11, v11

    .line 139
    and-long/2addr v11, v7

    .line 140
    shl-long/2addr v11, v2

    .line 141
    or-long/2addr v9, v11

    .line 142
    add-int/lit8 v2, v1, 0x3

    .line 143
    .line 144
    aget-byte v2, v0, v2

    .line 145
    .line 146
    int-to-long v11, v2

    .line 147
    and-long/2addr v11, v7

    .line 148
    shl-long v2, v11, v3

    .line 149
    .line 150
    or-long/2addr v2, v9

    .line 151
    add-int/lit8 v9, v1, 0x4

    .line 152
    .line 153
    aget-byte v9, v0, v9

    .line 154
    .line 155
    int-to-long v9, v9

    .line 156
    and-long/2addr v9, v7

    .line 157
    shl-long/2addr v9, v4

    .line 158
    or-long/2addr v2, v9

    .line 159
    add-int/lit8 v4, v1, 0x5

    .line 160
    .line 161
    aget-byte v4, v0, v4

    .line 162
    .line 163
    int-to-long v9, v4

    .line 164
    and-long/2addr v7, v9

    .line 165
    shl-long v4, v7, v5

    .line 166
    .line 167
    or-long/2addr v2, v4

    .line 168
    add-int/lit8 v4, v1, 0x6

    .line 169
    .line 170
    aget-byte v0, v0, v4

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :pswitch_2
    aget-byte v9, v0, v1

    .line 174
    .line 175
    and-int/lit16 v9, v9, 0xff

    .line 176
    .line 177
    shl-int/lit8 v9, v9, 0x10

    .line 178
    .line 179
    int-to-long v9, v9

    .line 180
    add-int/lit8 v11, v1, 0x1

    .line 181
    .line 182
    aget-byte v11, v0, v11

    .line 183
    .line 184
    int-to-long v11, v11

    .line 185
    and-long/2addr v11, v7

    .line 186
    shl-long/2addr v11, v2

    .line 187
    or-long/2addr v9, v11

    .line 188
    add-int/lit8 v2, v1, 0x2

    .line 189
    .line 190
    aget-byte v2, v0, v2

    .line 191
    .line 192
    int-to-long v11, v2

    .line 193
    and-long/2addr v11, v7

    .line 194
    shl-long v2, v11, v3

    .line 195
    .line 196
    or-long/2addr v2, v9

    .line 197
    add-int/lit8 v9, v1, 0x3

    .line 198
    .line 199
    aget-byte v9, v0, v9

    .line 200
    .line 201
    int-to-long v9, v9

    .line 202
    and-long/2addr v9, v7

    .line 203
    shl-long/2addr v9, v4

    .line 204
    or-long/2addr v2, v9

    .line 205
    add-int/lit8 v4, v1, 0x4

    .line 206
    .line 207
    aget-byte v4, v0, v4

    .line 208
    .line 209
    int-to-long v9, v4

    .line 210
    and-long/2addr v7, v9

    .line 211
    shl-long v4, v7, v5

    .line 212
    .line 213
    or-long/2addr v2, v4

    .line 214
    add-int/lit8 v4, v1, 0x5

    .line 215
    .line 216
    aget-byte v0, v0, v4

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :pswitch_3
    aget-byte v9, v0, v1

    .line 220
    .line 221
    int-to-long v9, v9

    .line 222
    and-long/2addr v9, v7

    .line 223
    shl-long/2addr v9, v2

    .line 224
    add-int/lit8 v2, v1, 0x1

    .line 225
    .line 226
    aget-byte v2, v0, v2

    .line 227
    .line 228
    int-to-long v11, v2

    .line 229
    and-long/2addr v11, v7

    .line 230
    shl-long v2, v11, v3

    .line 231
    .line 232
    or-long/2addr v2, v9

    .line 233
    add-int/lit8 v9, v1, 0x2

    .line 234
    .line 235
    aget-byte v9, v0, v9

    .line 236
    .line 237
    int-to-long v9, v9

    .line 238
    and-long/2addr v9, v7

    .line 239
    shl-long/2addr v9, v4

    .line 240
    or-long/2addr v2, v9

    .line 241
    add-int/lit8 v4, v1, 0x3

    .line 242
    .line 243
    aget-byte v4, v0, v4

    .line 244
    .line 245
    int-to-long v9, v4

    .line 246
    and-long/2addr v7, v9

    .line 247
    shl-long v4, v7, v5

    .line 248
    .line 249
    or-long/2addr v2, v4

    .line 250
    add-int/lit8 v4, v1, 0x4

    .line 251
    .line 252
    aget-byte v0, v0, v4

    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :pswitch_4
    aget-byte v2, v0, v1

    .line 257
    .line 258
    int-to-long v9, v2

    .line 259
    and-long/2addr v9, v7

    .line 260
    shl-long v2, v9, v3

    .line 261
    .line 262
    add-int/lit8 v9, v1, 0x1

    .line 263
    .line 264
    aget-byte v9, v0, v9

    .line 265
    .line 266
    int-to-long v9, v9

    .line 267
    and-long/2addr v9, v7

    .line 268
    shl-long/2addr v9, v4

    .line 269
    or-long/2addr v2, v9

    .line 270
    add-int/lit8 v4, v1, 0x2

    .line 271
    .line 272
    aget-byte v4, v0, v4

    .line 273
    .line 274
    int-to-long v9, v4

    .line 275
    and-long/2addr v7, v9

    .line 276
    shl-long v4, v7, v5

    .line 277
    .line 278
    or-long/2addr v2, v4

    .line 279
    add-int/lit8 v4, v1, 0x3

    .line 280
    .line 281
    aget-byte v0, v0, v4

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :pswitch_5
    aget-byte v2, v0, v1

    .line 286
    .line 287
    int-to-long v2, v2

    .line 288
    and-long/2addr v2, v7

    .line 289
    shl-long/2addr v2, v4

    .line 290
    add-int/lit8 v4, v1, 0x1

    .line 291
    .line 292
    aget-byte v4, v0, v4

    .line 293
    .line 294
    int-to-long v9, v4

    .line 295
    and-long/2addr v7, v9

    .line 296
    shl-long v4, v7, v5

    .line 297
    .line 298
    or-long/2addr v2, v4

    .line 299
    add-int/lit8 v4, v1, 0x2

    .line 300
    .line 301
    aget-byte v0, v0, v4

    .line 302
    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :pswitch_6
    aget-byte v2, v0, v1

    .line 306
    .line 307
    int-to-long v2, v2

    .line 308
    and-long/2addr v2, v7

    .line 309
    shl-long/2addr v2, v5

    .line 310
    add-int/lit8 v4, v1, 0x1

    .line 311
    .line 312
    aget-byte v0, v0, v4

    .line 313
    .line 314
    goto/16 :goto_0

    .line 315
    .line 316
    :pswitch_7
    aget-byte v0, v0, v1

    .line 317
    .line 318
    int-to-long v2, v0

    .line 319
    shl-long/2addr v2, v6

    .line 320
    :goto_1
    add-int/2addr v1, p1

    .line 321
    iput v1, p0, La5/a;->h:I

    .line 322
    .line 323
    return-wide v2

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l(I)I
    .locals 4

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/x;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, p0, La5/a;->h:I

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eq p1, v2, :cond_4

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq p1, v2, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    if-eq p1, v2, :cond_2

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    const/4 v3, 0x0

    .line 26
    if-ne p1, v2, :cond_1

    .line 27
    .line 28
    add-int/lit8 v2, v1, 0x3

    .line 29
    .line 30
    aget-byte v2, v0, v2

    .line 31
    .line 32
    if-ltz v2, :cond_0

    .line 33
    .line 34
    shl-int/lit8 v3, v2, 0x18

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, Ld6/f;

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "Encountered valid sized uint that is out of range at offset 0x%x"

    .line 48
    .line 49
    invoke-direct {p1, v3, v1, v0}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    new-instance v0, Ld6/f;

    .line 54
    .line 55
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget v1, p0, La5/a;->h:I

    .line 60
    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v1, "Invalid size %d for sized uint at offset 0x%x"

    .line 70
    .line 71
    invoke-direct {v0, v3, v1, p1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_2
    :goto_0
    add-int/lit8 v2, v1, 0x2

    .line 76
    .line 77
    aget-byte v2, v0, v2

    .line 78
    .line 79
    and-int/lit16 v2, v2, 0xff

    .line 80
    .line 81
    shl-int/lit8 v2, v2, 0x10

    .line 82
    .line 83
    or-int/2addr v3, v2

    .line 84
    :cond_3
    add-int/lit8 v2, v1, 0x1

    .line 85
    .line 86
    aget-byte v2, v0, v2

    .line 87
    .line 88
    and-int/lit16 v2, v2, 0xff

    .line 89
    .line 90
    shl-int/lit8 v2, v2, 0x8

    .line 91
    .line 92
    or-int/2addr v3, v2

    .line 93
    :cond_4
    aget-byte v0, v0, v1

    .line 94
    .line 95
    and-int/lit16 v0, v0, 0xff

    .line 96
    .line 97
    or-int/2addr v0, v3

    .line 98
    add-int/2addr v1, p1

    .line 99
    iput v1, p0, La5/a;->h:I

    .line 100
    .line 101
    return v0
.end method

.method public m()I
    .locals 7

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/x;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, p0, La5/a;->h:I

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    aget-byte v3, v0, v1

    .line 17
    .line 18
    and-int/lit16 v4, v3, 0xff

    .line 19
    .line 20
    const/16 v5, 0x7f

    .line 21
    .line 22
    if-gt v4, v5, :cond_0

    .line 23
    .line 24
    shl-int/lit8 v0, v4, 0x19

    .line 25
    .line 26
    shr-int/lit8 v0, v0, 0x19

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    add-int/lit8 v4, v1, 0x2

    .line 30
    .line 31
    aget-byte v2, v0, v2

    .line 32
    .line 33
    and-int/lit16 v6, v2, 0xff

    .line 34
    .line 35
    and-int/2addr v3, v5

    .line 36
    and-int/2addr v2, v5

    .line 37
    shl-int/lit8 v2, v2, 0x7

    .line 38
    .line 39
    or-int/2addr v2, v3

    .line 40
    if-gt v6, v5, :cond_1

    .line 41
    .line 42
    shl-int/lit8 v0, v2, 0x12

    .line 43
    .line 44
    shr-int/lit8 v0, v0, 0x12

    .line 45
    .line 46
    :goto_0
    move v2, v4

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    add-int/lit8 v3, v1, 0x3

    .line 49
    .line 50
    aget-byte v4, v0, v4

    .line 51
    .line 52
    and-int/lit16 v6, v4, 0xff

    .line 53
    .line 54
    and-int/2addr v4, v5

    .line 55
    shl-int/lit8 v4, v4, 0xe

    .line 56
    .line 57
    or-int/2addr v2, v4

    .line 58
    if-gt v6, v5, :cond_2

    .line 59
    .line 60
    shl-int/lit8 v0, v2, 0xb

    .line 61
    .line 62
    shr-int/lit8 v0, v0, 0xb

    .line 63
    .line 64
    :goto_1
    move v2, v3

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    add-int/lit8 v4, v1, 0x4

    .line 67
    .line 68
    aget-byte v3, v0, v3

    .line 69
    .line 70
    and-int/lit16 v6, v3, 0xff

    .line 71
    .line 72
    and-int/2addr v3, v5

    .line 73
    shl-int/lit8 v3, v3, 0x15

    .line 74
    .line 75
    or-int/2addr v2, v3

    .line 76
    if-gt v6, v5, :cond_3

    .line 77
    .line 78
    shl-int/lit8 v0, v2, 0x4

    .line 79
    .line 80
    shr-int/lit8 v0, v0, 0x4

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    add-int/lit8 v3, v1, 0x5

    .line 84
    .line 85
    aget-byte v0, v0, v4

    .line 86
    .line 87
    and-int/lit16 v0, v0, 0xff

    .line 88
    .line 89
    if-gt v0, v5, :cond_4

    .line 90
    .line 91
    shl-int/lit8 v0, v0, 0x1c

    .line 92
    .line 93
    or-int/2addr v0, v2

    .line 94
    goto :goto_1

    .line 95
    :goto_2
    iput v2, p0, La5/a;->h:I

    .line 96
    .line 97
    return v0

    .line 98
    :cond_4
    new-instance v0, Ld6/f;

    .line 99
    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const/4 v2, 0x0

    .line 109
    const-string v3, "Invalid sleb128 integer encountered at offset 0x%x"

    .line 110
    .line 111
    invoke-direct {v0, v2, v3, v1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    throw v0
.end method

.method public n()I
    .locals 2

    .line 1
    iget v0, p0, La5/a;->h:I

    .line 2
    .line 3
    iget-object v1, p0, La5/a;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroidx/lifecycle/x;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroidx/lifecycle/x;->O(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, La5/a;->h:I

    .line 14
    .line 15
    return v1
.end method

.method public o(Z)I
    .locals 9

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/x;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, p0, La5/a;->h:I

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    aget-byte v3, v0, v1

    .line 17
    .line 18
    and-int/lit16 v4, v3, 0xff

    .line 19
    .line 20
    const/16 v5, 0x7f

    .line 21
    .line 22
    if-le v4, v5, :cond_5

    .line 23
    .line 24
    add-int/lit8 v4, v1, 0x2

    .line 25
    .line 26
    aget-byte v2, v0, v2

    .line 27
    .line 28
    and-int/lit16 v6, v2, 0xff

    .line 29
    .line 30
    and-int/2addr v3, v5

    .line 31
    and-int/2addr v2, v5

    .line 32
    const/4 v7, 0x7

    .line 33
    shl-int/2addr v2, v7

    .line 34
    or-int/2addr v2, v3

    .line 35
    if-le v6, v5, :cond_4

    .line 36
    .line 37
    add-int/lit8 v3, v1, 0x3

    .line 38
    .line 39
    aget-byte v4, v0, v4

    .line 40
    .line 41
    and-int/lit16 v6, v4, 0xff

    .line 42
    .line 43
    and-int/2addr v4, v5

    .line 44
    shl-int/lit8 v4, v4, 0xe

    .line 45
    .line 46
    or-int/2addr v4, v2

    .line 47
    if-le v6, v5, :cond_2

    .line 48
    .line 49
    add-int/lit8 v2, v1, 0x4

    .line 50
    .line 51
    aget-byte v3, v0, v3

    .line 52
    .line 53
    and-int/lit16 v6, v3, 0xff

    .line 54
    .line 55
    and-int/2addr v3, v5

    .line 56
    shl-int/lit8 v3, v3, 0x15

    .line 57
    .line 58
    or-int/2addr v4, v3

    .line 59
    if-le v6, v5, :cond_5

    .line 60
    .line 61
    add-int/lit8 v3, v1, 0x5

    .line 62
    .line 63
    aget-byte v0, v0, v2

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    if-ltz v0, :cond_3

    .line 67
    .line 68
    and-int/lit8 v5, v0, 0xf

    .line 69
    .line 70
    if-le v5, v7, :cond_1

    .line 71
    .line 72
    if-eqz p1, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    new-instance p1, Ld6/f;

    .line 76
    .line 77
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v1, "Encountered valid uleb128 that is out of range at offset 0x%x"

    .line 86
    .line 87
    invoke-direct {p1, v2, v1, v0}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_1
    :goto_0
    shl-int/lit8 p1, v0, 0x1c

    .line 92
    .line 93
    or-int/2addr v4, p1

    .line 94
    :cond_2
    move v2, v3

    .line 95
    goto :goto_1

    .line 96
    :cond_3
    new-instance p1, Ld6/f;

    .line 97
    .line 98
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-string v1, "Invalid uleb128 integer encountered at offset 0x%x"

    .line 107
    .line 108
    invoke-direct {p1, v2, v1, v0}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_4
    move v8, v4

    .line 113
    move v4, v2

    .line 114
    move v2, v8

    .line 115
    :cond_5
    :goto_1
    iput v2, p0, La5/a;->h:I

    .line 116
    .line 117
    return v4
.end method

.method public p(J)V
    .locals 5

    .line 1
    iget v0, p0, La5/a;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, v0, :cond_2

    .line 5
    .line 6
    iget-object v2, p0, La5/a;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, [J

    .line 9
    .line 10
    aget-wide v3, v2, v1

    .line 11
    .line 12
    cmp-long v2, p1, v3

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    iget p1, p0, La5/a;->h:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    :goto_1
    if-ge v1, p1, :cond_0

    .line 21
    .line 22
    iget-object p2, p0, La5/a;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p2, [J

    .line 25
    .line 26
    add-int/lit8 v0, v1, 0x1

    .line 27
    .line 28
    aget-wide v2, p2, v0

    .line 29
    .line 30
    aput-wide v2, p2, v1

    .line 31
    .line 32
    move v1, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget p1, p0, La5/a;->h:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    iput p1, p0, La5/a;->h:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public q()V
    .locals 4

    .line 1
    iget-object v0, p0, La5/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/x;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, p0, La5/a;->h:I

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    aget-byte v3, v0, v1

    .line 17
    .line 18
    if-gez v3, :cond_2

    .line 19
    .line 20
    add-int/lit8 v3, v1, 0x2

    .line 21
    .line 22
    aget-byte v2, v0, v2

    .line 23
    .line 24
    if-gez v2, :cond_1

    .line 25
    .line 26
    add-int/lit8 v2, v1, 0x3

    .line 27
    .line 28
    aget-byte v3, v0, v3

    .line 29
    .line 30
    if-gez v3, :cond_2

    .line 31
    .line 32
    add-int/lit8 v3, v1, 0x4

    .line 33
    .line 34
    aget-byte v2, v0, v2

    .line 35
    .line 36
    if-gez v2, :cond_1

    .line 37
    .line 38
    add-int/lit8 v2, v1, 0x5

    .line 39
    .line 40
    aget-byte v0, v0, v3

    .line 41
    .line 42
    if-ltz v0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance v0, Ld6/f;

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const/4 v2, 0x0

    .line 56
    const-string v3, "Invalid uleb128 integer encountered at offset 0x%x"

    .line 57
    .line 58
    invoke-direct {v0, v2, v3, v1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_1
    move v2, v3

    .line 63
    :cond_2
    :goto_0
    iput v2, p0, La5/a;->h:I

    .line 64
    .line 65
    return-void
.end method

.method public r(Ljava/util/function/Consumer;)V
    .locals 11

    .line 1
    new-instance v0, Lgf/a;

    .line 2
    .line 3
    iget-object v1, p0, La5/a;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lac/k;

    .line 6
    .line 7
    invoke-virtual {v1}, Lac/k;->g()Lac/k;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, p0, v2}, Lgf/a;-><init>(La5/a;Lac/k;)V

    .line 12
    .line 13
    .line 14
    const/16 v2, 0xc

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lac/k;->B(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lac/k;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x0

    .line 28
    move v5, v4

    .line 29
    :goto_0
    if-ge v5, v3, :cond_5

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lac/k;->L()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    sget-object v7, Lgf/c;->e:[Lgf/c;

    .line 39
    .line 40
    and-int/lit16 v7, v6, 0xff

    .line 41
    .line 42
    if-nez v7, :cond_0

    .line 43
    .line 44
    if-eqz v6, :cond_0

    .line 45
    .line 46
    sget-object v7, Lgf/c;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-virtual {v7, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, Lgf/c;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    sget-object v8, Lgf/c;->e:[Lgf/c;

    .line 60
    .line 61
    aget-object v7, v8, v7

    .line 62
    .line 63
    :goto_1
    iput v5, v0, Lgf/a;->h:I

    .line 64
    .line 65
    iput-object v7, v0, Lgf/a;->d:Lgf/c;

    .line 66
    .line 67
    iput v6, v0, Lgf/a;->f:I

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    iput-object v6, v0, Lgf/a;->n:Lsc/a;

    .line 71
    .line 72
    iput-boolean v4, v0, Lgf/a;->e:Z

    .line 73
    .line 74
    const/4 v6, 0x1

    .line 75
    if-eqz v7, :cond_1

    .line 76
    .line 77
    iget-object v7, v7, Lgf/c;->c:Lgf/b;

    .line 78
    .line 79
    iget v8, v7, Lgf/b;->b:I

    .line 80
    .line 81
    iput v8, v0, Lgf/a;->j:I

    .line 82
    .line 83
    iget v7, v7, Lgf/b;->a:I

    .line 84
    .line 85
    iput v7, v0, Lgf/a;->g:I

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_1
    iput v4, v0, Lgf/a;->j:I

    .line 89
    .line 90
    iput v6, v0, Lgf/a;->g:I

    .line 91
    .line 92
    :goto_2
    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-boolean v7, v0, Lgf/a;->e:Z

    .line 96
    .line 97
    if-nez v7, :cond_4

    .line 98
    .line 99
    iget-object v7, v0, Lgf/a;->d:Lgf/c;

    .line 100
    .line 101
    if-eqz v7, :cond_4

    .line 102
    .line 103
    iget-object v7, v7, Lgf/c;->c:Lgf/b;

    .line 104
    .line 105
    iget-object v8, v0, Lgf/a;->a:La5/a;

    .line 106
    .line 107
    iget-object v8, v8, La5/a;->i:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v8, Lac/k;

    .line 110
    .line 111
    iget v9, v7, Lgf/b;->c:I

    .line 112
    .line 113
    packed-switch v9, :pswitch_data_0

    .line 114
    .line 115
    .line 116
    :pswitch_0
    iget v7, v7, Lgf/b;->a:I

    .line 117
    .line 118
    if-ne v7, v6, :cond_2

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_2
    add-int/lit8 v7, v7, -0x1

    .line 122
    .line 123
    mul-int/lit8 v7, v7, 0x2

    .line 124
    .line 125
    invoke-virtual {v8, v7}, Lac/k;->M(I)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :pswitch_1
    invoke-virtual {v8}, Lac/k;->L()I

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    iget-object v9, v8, Lac/k;->i:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v9, Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->getInt()I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-ne v7, v6, :cond_3

    .line 142
    .line 143
    rem-int/lit8 v10, v9, 0x2

    .line 144
    .line 145
    add-int/2addr v10, v9

    .line 146
    invoke-virtual {v8, v10}, Lac/k;->M(I)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_3
    mul-int v10, v9, v7

    .line 151
    .line 152
    invoke-virtual {v8, v10}, Lac/k;->M(I)V

    .line 153
    .line 154
    .line 155
    :goto_3
    mul-int/2addr v9, v7

    .line 156
    add-int/2addr v9, v6

    .line 157
    div-int/lit8 v9, v9, 0x2

    .line 158
    .line 159
    add-int/lit8 v9, v9, 0x4

    .line 160
    .line 161
    iput v9, v0, Lgf/a;->g:I

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :pswitch_2
    invoke-virtual {v8}, Lac/k;->L()I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    mul-int/lit8 v7, v6, 0x8

    .line 169
    .line 170
    invoke-virtual {v8, v7}, Lac/k;->M(I)V

    .line 171
    .line 172
    .line 173
    mul-int/lit8 v6, v6, 0x4

    .line 174
    .line 175
    add-int/lit8 v6, v6, 0x2

    .line 176
    .line 177
    iput v6, v0, Lgf/a;->g:I

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :pswitch_3
    invoke-virtual {v8}, Lac/k;->L()I

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    mul-int/lit8 v7, v6, 0x4

    .line 185
    .line 186
    add-int/lit8 v7, v7, 0x4

    .line 187
    .line 188
    invoke-virtual {v8, v7}, Lac/k;->M(I)V

    .line 189
    .line 190
    .line 191
    mul-int/lit8 v6, v6, 0x2

    .line 192
    .line 193
    add-int/lit8 v6, v6, 0x4

    .line 194
    .line 195
    iput v6, v0, Lgf/a;->g:I

    .line 196
    .line 197
    :cond_4
    :goto_4
    iget v6, v0, Lgf/a;->g:I

    .line 198
    .line 199
    add-int/2addr v5, v6

    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_5
    return-void

    .line 203
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, La5/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget v0, p0, La5/a;->h:I

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    const-string v0, "null"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "FLAG"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v0, "ENUM"

    .line 26
    .line 27
    :goto_0
    iget-object v1, p0, La5/a;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, ", "

    .line 36
    .line 37
    const-string v3, "]"

    .line 38
    .line 39
    const-string v4, "["

    .line 40
    .line 41
    invoke-static {v4, v0, v2, v1, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v1, "Enc="

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, La5/a;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Ld7/g;

    .line 56
    .line 57
    iget v2, p0, La5/a;->h:I

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    iget-object v4, v1, Lr7/b;->k:[B

    .line 61
    .line 62
    invoke-static {v4, v2, v3}, Lk7/a;->q([BII)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v3, ", Descriptor="

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const/4 v3, 0x3

    .line 75
    iget-object v4, v1, Lr7/b;->k:[B

    .line 76
    .line 77
    invoke-static {v4, v2, v3}, Lk7/a;->q([BII)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v3, ", StrongEnc="

    .line 85
    .line 86
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/4 v3, 0x6

    .line 90
    iget-object v1, v1, Lr7/b;->k:[B

    .line 91
    .line 92
    invoke-static {v1, v2, v3}, Lk7/a;->q([BII)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, ", UTF8="

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, La5/a;->g()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
