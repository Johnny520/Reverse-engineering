.class public final La;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:Ljava/nio/ByteBuffer;

.field public c:I

.field public d:I

.field public final e:Lhw;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lhw;->b:Lhw;

    if-nez v0, :cond_0

    new-instance v0, Lhw;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lhw;-><init>(I)V

    sput-object v0, Lhw;->b:Lhw;

    :cond_0
    sget-object v0, Lhw;->b:Lhw;

    iput-object v0, p0, La;->e:Lhw;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget-object v0, p0, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public final b(I)I
    .locals 2

    iget v0, p0, La;->d:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, La;->b:Ljava/nio/ByteBuffer;

    iget v1, p0, La;->c:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(ILjava/nio/ByteBuffer;)V
    .locals 0

    iput-object p2, p0, La;->b:Ljava/nio/ByteBuffer;

    if-eqz p2, :cond_0

    iput p1, p0, La;->a:I

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p2

    sub-int/2addr p1, p2

    iput p1, p0, La;->c:I

    iget-object p2, p0, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    iput p1, p0, La;->d:I

    return-void

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, La;->a:I

    iput p1, p0, La;->c:I

    iput p1, p0, La;->d:I

    return-void
.end method

.method public final d(I)Ljava/lang/String;
    .locals 13

    iget-object v0, p0, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    add-int/lit8 v1, v1, 0x4

    iget-object v2, p0, La;->e:Lhw;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v2

    const/16 v3, -0x10

    const/16 v4, -0x20

    const-string v5, "Invalid UTF-8"

    const/4 v6, 0x0

    if-eqz v2, :cond_a

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    add-int/2addr v0, v1

    or-int v1, v0, p1

    array-length v7, v2

    sub-int/2addr v7, v0

    sub-int/2addr v7, p1

    or-int/2addr v1, v7

    if-ltz v1, :cond_9

    add-int v1, v0, p1

    new-array v11, p1, [C

    move p1, v6

    :goto_0
    if-ge v0, v1, :cond_0

    aget-byte v7, v2, v0

    if-ltz v7, :cond_0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v8, p1, 0x1

    int-to-char v7, v7

    aput-char v7, v11, p1

    move p1, v8

    goto :goto_0

    :cond_0
    move v12, p1

    :goto_1
    if-ge v0, v1, :cond_8

    add-int/lit8 p1, v0, 0x1

    aget-byte v7, v2, v0

    if-ltz v7, :cond_2

    add-int/lit8 v0, v12, 0x1

    int-to-char v7, v7

    aput-char v7, v11, v12

    :goto_2
    if-ge p1, v1, :cond_1

    aget-byte v7, v2, p1

    if-ltz v7, :cond_1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v8, v0, 0x1

    int-to-char v7, v7

    aput-char v7, v11, v0

    move v0, v8

    goto :goto_2

    :cond_1
    move v12, v0

    move v0, p1

    goto :goto_1

    :cond_2
    if-ge v7, v4, :cond_4

    if-ge p1, v1, :cond_3

    add-int/lit8 v0, v0, 0x2

    aget-byte p1, v2, p1

    add-int/lit8 v8, v12, 0x1

    invoke-static {v7, p1, v11, v12}, LNj;->C(BB[CI)V

    move v12, v8

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    if-ge v7, v3, :cond_6

    add-int/lit8 v8, v1, -0x1

    if-ge p1, v8, :cond_5

    add-int/lit8 v8, v0, 0x2

    aget-byte p1, v2, p1

    add-int/lit8 v0, v0, 0x3

    aget-byte v8, v2, v8

    add-int/lit8 v9, v12, 0x1

    invoke-static {v7, p1, v8, v11, v12}, LNj;->B(BBB[CI)V

    move v12, v9

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    add-int/lit8 v8, v1, -0x2

    if-ge p1, v8, :cond_7

    add-int/lit8 v8, v0, 0x2

    aget-byte p1, v2, p1

    add-int/lit8 v9, v0, 0x3

    aget-byte v8, v2, v8

    add-int/lit8 v0, v0, 0x4

    aget-byte v10, v2, v9

    move v9, v8

    move v8, p1

    invoke-static/range {v7 .. v12}, LNj;->A(BBBB[CI)V

    add-int/lit8 v12, v12, 0x2

    goto :goto_1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v11, v6, v12}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_9
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    array-length v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v2, v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "buffer length=%d, index=%d, size=%d"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    or-int v2, v1, p1

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v7

    sub-int/2addr v7, v1

    sub-int/2addr v7, p1

    or-int/2addr v2, v7

    if-ltz v2, :cond_14

    add-int v2, v1, p1

    new-array v11, p1, [C

    move p1, v6

    :goto_3
    if-ge v1, v2, :cond_b

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    if-ltz v7, :cond_b

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v8, p1, 0x1

    int-to-char v7, v7

    aput-char v7, v11, p1

    move p1, v8

    goto :goto_3

    :cond_b
    move v12, p1

    :goto_4
    if-ge v1, v2, :cond_13

    add-int/lit8 p1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    if-ltz v7, :cond_d

    add-int/lit8 v1, v12, 0x1

    int-to-char v7, v7

    aput-char v7, v11, v12

    :goto_5
    if-ge p1, v2, :cond_c

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    if-ltz v7, :cond_c

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v8, v1, 0x1

    int-to-char v7, v7

    aput-char v7, v11, v1

    move v1, v8

    goto :goto_5

    :cond_c
    move v12, v1

    move v1, p1

    goto :goto_4

    :cond_d
    if-ge v7, v4, :cond_f

    if-ge p1, v2, :cond_e

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    add-int/lit8 v8, v12, 0x1

    invoke-static {v7, p1, v11, v12}, LNj;->C(BB[CI)V

    move v12, v8

    goto :goto_4

    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    if-ge v7, v3, :cond_11

    add-int/lit8 v8, v2, -0x1

    if-ge p1, v8, :cond_10

    add-int/lit8 v8, v1, 0x2

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    add-int/lit8 v9, v12, 0x1

    invoke-static {v7, p1, v8, v11, v12}, LNj;->B(BBB[CI)V

    move v12, v9

    goto :goto_4

    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    add-int/lit8 v8, v2, -0x2

    if-ge p1, v8, :cond_12

    add-int/lit8 v8, v1, 0x2

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    add-int/lit8 v9, v1, 0x3

    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    add-int/lit8 v1, v1, 0x4

    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v10

    move v9, v8

    move v8, p1

    invoke-static/range {v7 .. v12}, LNj;->A(BBBB[CI)V

    add-int/lit8 v12, v12, 0x2

    goto :goto_4

    :cond_12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v11, v6, v12}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_14
    new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "buffer limit=%d, index=%d, limit=%d"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final e(I)I
    .locals 1

    iget v0, p0, La;->a:I

    add-int/2addr p1, v0

    iget-object v0, p0, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public final f(I)I
    .locals 1

    iget v0, p0, La;->a:I

    add-int/2addr p1, v0

    iget-object v0, p0, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    iget-object p1, p0, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    return p1
.end method

.method public g(I)La;
    .locals 3

    new-instance v0, La;

    invoke-direct {v0}, La;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, La;->b(I)I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, La;->e(I)I

    move-result v2

    mul-int/2addr p1, v1

    add-int/2addr p1, v2

    invoke-virtual {p0, p1}, La;->a(I)I

    move-result p1

    iget-object v1, p0, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, v1}, La;->c(ILjava/nio/ByteBuffer;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
