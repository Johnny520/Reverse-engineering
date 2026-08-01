.class public final Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;
.super Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世兰苏哲:I

.field public final 飘花落叶言子楪世哲兰苏:I

.field public final 飘花落叶言子楪世哲苏兰:[B


# direct methods
.method public constructor <init>([BI)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    sub-int/2addr v0, p2

    .line 6
    or-int/2addr v0, p2

    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:[B

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 13
    .line 14
    iput p2, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲兰苏:I

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 18
    .line 19
    array-length p0, p1

    .line 20
    const-string p1, "Array range is invalid. Buffer.length="

    .line 21
    .line 22
    const-string v0, ", offset=0, length="

    .line 23
    .line 24
    invoke-static {p0, p2, p1, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子世哲兰楪苏([BII)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 4
    .line 5
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    iget p1, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 9
    .line 10
    add-int/2addr p1, p3

    .line 11
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p1

    .line 15
    new-instance p2, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;

    .line 16
    .line 17
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 18
    .line 19
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲兰苏:I

    .line 20
    .line 21
    invoke-direct {p2, v0, p0, p3, p1}, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(IIILjava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw p2
.end method

.method public final 飘花落叶言子世哲楪兰苏(I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    :goto_0
    and-int/lit8 v1, p1, -0x80

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:[B

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x1

    .line 10
    .line 11
    int-to-byte p1, p1

    .line 12
    :try_start_0
    aput-byte p1, v2, v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 20
    .line 21
    or-int/lit16 v3, p1, 0x80

    .line 22
    .line 23
    int-to-byte v3, v3

    .line 24
    :try_start_1
    aput-byte v3, v2, v0
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 25
    .line 26
    ushr-int/lit8 p1, p1, 0x7

    .line 27
    .line 28
    move v0, v1

    .line 29
    goto :goto_0

    .line 30
    :goto_1
    new-instance v0, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;

    .line 31
    .line 32
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲兰苏:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(IIILjava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public final 飘花落叶言子世哲楪苏兰(II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲楪兰苏(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子世哲苏兰楪(J)V
    .locals 10

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    sget-boolean v1, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:[B

    .line 7
    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    const-wide/16 v6, -0x80

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/16 v8, 0xa

    .line 19
    .line 20
    if-lt v1, v8, :cond_1

    .line 21
    .line 22
    :goto_0
    and-long v8, p1, v6

    .line 23
    .line 24
    cmp-long v1, v8, v4

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    add-int/lit8 v1, v0, 0x1

    .line 29
    .line 30
    int-to-long v4, v0

    .line 31
    long-to-int p1, p1

    .line 32
    int-to-byte p1, p1

    .line 33
    invoke-static {v3, v4, v5, p1}, Lcom/google/protobuf/飘花落叶言苏楪世子兰哲;->飘花落叶言子楪苏兰世哲([BJB)V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 38
    .line 39
    int-to-long v8, v0

    .line 40
    long-to-int v0, p1

    .line 41
    or-int/lit16 v0, v0, 0x80

    .line 42
    .line 43
    int-to-byte v0, v0

    .line 44
    invoke-static {v3, v8, v9, v0}, Lcom/google/protobuf/飘花落叶言苏楪世子兰哲;->飘花落叶言子楪苏兰世哲([BJB)V

    .line 45
    .line 46
    .line 47
    ushr-long/2addr p1, v2

    .line 48
    move v0, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    and-long v8, p1, v6

    .line 51
    .line 52
    cmp-long v1, v8, v4

    .line 53
    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    add-int/lit8 v1, v0, 0x1

    .line 57
    .line 58
    long-to-int p1, p1

    .line 59
    int-to-byte p1, p1

    .line 60
    :try_start_0
    aput-byte p1, v3, v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    :goto_2
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 63
    .line 64
    return-void

    .line 65
    :catch_0
    move-exception p1

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    add-int/lit8 v1, v0, 0x1

    .line 68
    .line 69
    long-to-int v8, p1

    .line 70
    or-int/lit16 v8, v8, 0x80

    .line 71
    .line 72
    int-to-byte v8, v8

    .line 73
    :try_start_1
    aput-byte v8, v3, v0
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    .line 75
    ushr-long/2addr p1, v2

    .line 76
    move v0, v1

    .line 77
    goto :goto_1

    .line 78
    :goto_3
    new-instance p2, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;

    .line 79
    .line 80
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲兰苏:I

    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    invoke-direct {p2, v1, p0, v0, p1}, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(IIILjava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw p2
.end method

.method public final 飘花落叶言子世哲苏楪兰(IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲苏兰楪(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏楪哲兰(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子世楪兰苏哲(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲楪兰苏(I)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    int-to-long v0, p1

    .line 8
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲苏兰楪(J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final 飘花落叶言子世楪哲兰苏(II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世楪兰苏哲(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子世楪哲苏兰(J)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:[B

    .line 6
    .line 7
    long-to-int v3, p1

    .line 8
    int-to-byte v3, v3

    .line 9
    aput-byte v3, v2, v0

    .line 10
    .line 11
    add-int/lit8 v3, v0, 0x1

    .line 12
    .line 13
    shr-long v4, p1, v1

    .line 14
    .line 15
    long-to-int v4, v4

    .line 16
    int-to-byte v4, v4

    .line 17
    aput-byte v4, v2, v3

    .line 18
    .line 19
    add-int/lit8 v3, v0, 0x2

    .line 20
    .line 21
    const/16 v4, 0x10

    .line 22
    .line 23
    shr-long v4, p1, v4

    .line 24
    .line 25
    long-to-int v4, v4

    .line 26
    int-to-byte v4, v4

    .line 27
    aput-byte v4, v2, v3

    .line 28
    .line 29
    add-int/lit8 v3, v0, 0x3

    .line 30
    .line 31
    const/16 v4, 0x18

    .line 32
    .line 33
    shr-long v4, p1, v4

    .line 34
    .line 35
    long-to-int v4, v4

    .line 36
    int-to-byte v4, v4

    .line 37
    aput-byte v4, v2, v3

    .line 38
    .line 39
    add-int/lit8 v3, v0, 0x4

    .line 40
    .line 41
    const/16 v4, 0x20

    .line 42
    .line 43
    shr-long v4, p1, v4

    .line 44
    .line 45
    long-to-int v4, v4

    .line 46
    int-to-byte v4, v4

    .line 47
    aput-byte v4, v2, v3

    .line 48
    .line 49
    add-int/lit8 v3, v0, 0x5

    .line 50
    .line 51
    const/16 v4, 0x28

    .line 52
    .line 53
    shr-long v4, p1, v4

    .line 54
    .line 55
    long-to-int v4, v4

    .line 56
    int-to-byte v4, v4

    .line 57
    aput-byte v4, v2, v3

    .line 58
    .line 59
    add-int/lit8 v3, v0, 0x6

    .line 60
    .line 61
    const/16 v4, 0x30

    .line 62
    .line 63
    shr-long v4, p1, v4

    .line 64
    .line 65
    long-to-int v4, v4

    .line 66
    int-to-byte v4, v4

    .line 67
    aput-byte v4, v2, v3

    .line 68
    .line 69
    add-int/lit8 v3, v0, 0x7

    .line 70
    .line 71
    const/16 v4, 0x38

    .line 72
    .line 73
    shr-long/2addr p1, v4

    .line 74
    long-to-int p1, p1

    .line 75
    int-to-byte p1, p1

    .line 76
    aput-byte p1, v2, v3
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    add-int/2addr v0, v1

    .line 79
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 80
    .line 81
    return-void

    .line 82
    :catch_0
    move-exception p1

    .line 83
    new-instance p2, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;

    .line 84
    .line 85
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲兰苏:I

    .line 86
    .line 87
    invoke-direct {p2, v0, p0, v1, p1}, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(IIILjava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    throw p2
.end method

.method public final 飘花落叶言子世楪苏兰哲(IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世楪哲苏兰(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子世楪苏哲兰(I)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    :try_start_0
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:[B

    .line 5
    .line 6
    int-to-byte v3, p1

    .line 7
    aput-byte v3, v2, v0

    .line 8
    .line 9
    add-int/lit8 v3, v0, 0x1

    .line 10
    .line 11
    shr-int/lit8 v4, p1, 0x8

    .line 12
    .line 13
    int-to-byte v4, v4

    .line 14
    aput-byte v4, v2, v3

    .line 15
    .line 16
    add-int/lit8 v3, v0, 0x2

    .line 17
    .line 18
    shr-int/lit8 v4, p1, 0x10

    .line 19
    .line 20
    int-to-byte v4, v4

    .line 21
    aput-byte v4, v2, v3

    .line 22
    .line 23
    add-int/lit8 v3, v0, 0x3

    .line 24
    .line 25
    shr-int/lit8 p1, p1, 0x18

    .line 26
    .line 27
    int-to-byte p1, p1

    .line 28
    aput-byte p1, v2, v3
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    add-int/2addr v0, v1

    .line 31
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 32
    .line 33
    return-void

    .line 34
    :catch_0
    move-exception p1

    .line 35
    new-instance v2, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;

    .line 36
    .line 37
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲兰苏:I

    .line 38
    .line 39
    invoke-direct {v2, v0, p0, v1, p1}, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(IIILjava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v2
.end method

.method public final 飘花落叶言子世苏兰哲楪(II)V
    .locals 0

    .line 1
    shl-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    or-int/2addr p1, p2

    .line 4
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲楪兰苏(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final 飘花落叶言子世苏兰楪哲(Ljava/lang/String;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    mul-int/lit8 v1, v1, 0x3

    .line 8
    .line 9
    invoke-static {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 18
    .line 19
    .line 20
    move-result v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:[B

    .line 22
    .line 23
    if-ne v2, v1, :cond_0

    .line 24
    .line 25
    add-int v1, v0, v2

    .line 26
    .line 27
    :try_start_1
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 28
    .line 29
    array-length v4, v3

    .line 30
    sub-int/2addr v4, v1

    .line 31
    sget-object v5, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;

    .line 32
    .line 33
    invoke-virtual {v5, p1, v3, v1, v4}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[BII)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 38
    .line 39
    sub-int v0, p1, v0

    .line 40
    .line 41
    sub-int/2addr v0, v2

    .line 42
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲楪兰苏(I)V

    .line 43
    .line 44
    .line 45
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲楪兰苏(I)V

    .line 53
    .line 54
    .line 55
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 56
    .line 57
    array-length v1, v3

    .line 58
    sub-int/2addr v1, v0

    .line 59
    sget-object v2, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;

    .line 60
    .line 61
    invoke-virtual {v2, p1, v3, v0, v1}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[BII)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 66
    .line 67
    return-void

    .line 68
    :catch_0
    move-exception p0

    .line 69
    new-instance p1, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;

    .line 70
    .line 71
    invoke-direct {p1, p0}, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method

.method public final 飘花落叶言子世苏哲兰楪(ILjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰楪哲(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子世苏哲楪兰(ILcom/google/protobuf/ByteString;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x3

    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-virtual {p0, v2, p1}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲楪苏兰(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1, p2}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏世哲(ILcom/google/protobuf/ByteString;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final 飘花落叶言子世苏楪兰哲(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x3

    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-virtual {p0, v2, p1}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲楪苏兰(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1, p2}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世楪兰哲苏(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final 飘花落叶言子世苏楪哲兰(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;->getSerializedSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲楪兰苏(I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0}, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(I[BI)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2, p1, p3}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲兰楪苏([BII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子楪兰世哲苏([BI)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲楪兰苏(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0, p2}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲兰楪苏([BII)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子楪兰世苏哲(IZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 3
    .line 4
    .line 5
    int-to-byte p1, p2

    .line 6
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰苏世(B)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final 飘花落叶言子楪兰哲苏世(II)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世楪苏哲兰(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子楪兰苏世哲(ILcom/google/protobuf/ByteString;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世苏兰哲楪(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世(Lcom/google/protobuf/ByteString;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子楪兰苏哲世(Lcom/google/protobuf/ByteString;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子世哲楪兰苏(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lcom/google/protobuf/ByteString;->writeTo(Lcom/google/protobuf/飘花落叶言子楪兰苏世哲;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final 飘花落叶言子楪哲兰世苏()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲兰苏:I

    .line 2
    .line 3
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method

.method public final 飘花落叶言子楪哲兰苏世(B)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰:[B
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x1

    .line 6
    .line 7
    :try_start_1
    aput-byte p1, v1, v0
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 8
    .line 9
    iput v2, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲:I

    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p1

    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :catch_1
    move-exception p1

    .line 16
    :goto_0
    new-instance v1, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;

    .line 17
    .line 18
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲兰苏:I

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, v0, p0, v2, p1}, Lcom/google/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(IIILjava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v1
.end method
