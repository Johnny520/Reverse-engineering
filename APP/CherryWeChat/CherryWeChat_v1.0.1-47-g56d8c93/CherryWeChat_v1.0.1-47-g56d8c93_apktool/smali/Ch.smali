.class public final LCh;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/nio/ByteBuffer;

.field public b:I

.field public c:I

.field public d:[I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:I

.field public i:[I

.field public j:I

.field public k:I

.field public final l:Lgf;

.field public final m:Lhw;


# direct methods
.method public constructor <init>()V
    .locals 4

    sget-object v0, Lgf;->d:Lgf;

    sget-object v1, Lhw;->b:Lhw;

    if-nez v1, :cond_0

    new-instance v1, Lhw;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lhw;-><init>(I)V

    sput-object v1, Lhw;->b:Lhw;

    :cond_0
    sget-object v1, Lhw;->b:Lhw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x1

    iput v2, p0, LCh;->c:I

    const/4 v2, 0x0

    iput-object v2, p0, LCh;->d:[I

    const/4 v2, 0x0

    iput v2, p0, LCh;->e:I

    iput-boolean v2, p0, LCh;->f:Z

    iput-boolean v2, p0, LCh;->g:Z

    const/16 v3, 0x10

    new-array v3, v3, [I

    iput-object v3, p0, LCh;->i:[I

    iput v2, p0, LCh;->j:I

    iput v2, p0, LCh;->k:I

    iput-object v0, p0, LCh;->l:Lgf;

    const/16 v0, 0x400

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, LCh;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, LCh;->m:Lhw;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    iput v0, p0, LCh;->b:I

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 3

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, LCh;->g(II)V

    invoke-virtual {p0}, LCh;->f()I

    move-result v0

    sub-int/2addr v0, p2

    add-int/2addr v0, v1

    iget-object p2, p0, LCh;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, LCh;->b:I

    sub-int/2addr v2, v1

    iput v2, p0, LCh;->b:I

    invoke-virtual {p2, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    iget-object p2, p0, LCh;->d:[I

    invoke-virtual {p0}, LCh;->f()I

    move-result v0

    aput v0, p2, p1

    :cond_0
    return-void
.end method

.method public final b(S)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, LCh;->g(II)V

    iget-object v0, p0, LCh;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, LCh;->b:I

    sub-int/2addr v2, v1

    iput v2, p0, LCh;->b:I

    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final c([I)I
    .locals 5

    iget-boolean v0, p0, LCh;->f:Z

    const-string v1, "FlatBuffers: object serialization must not be nested."

    if-nez v0, :cond_3

    array-length v2, p1

    if-nez v0, :cond_2

    iput v2, p0, LCh;->k:I

    const/4 v0, 0x4

    mul-int/2addr v2, v0

    invoke-virtual {p0, v0, v2}, LCh;->g(II)V

    invoke-virtual {p0, v0, v2}, LCh;->g(II)V

    const/4 v1, 0x1

    iput-boolean v1, p0, LCh;->f:Z

    array-length v2, p1

    sub-int/2addr v2, v1

    :goto_0
    const/4 v1, 0x0

    if-ltz v2, :cond_0

    aget v3, p1, v2

    invoke-virtual {p0, v0, v1}, LCh;->g(II)V

    invoke-virtual {p0}, LCh;->f()I

    move-result v1

    sub-int/2addr v1, v3

    add-int/2addr v1, v0

    iget-object v3, p0, LCh;->a:Ljava/nio/ByteBuffer;

    iget v4, p0, LCh;->b:I

    sub-int/2addr v4, v0

    iput v4, p0, LCh;->b:I

    invoke-virtual {v3, v4, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, LCh;->f:Z

    if-eqz p1, :cond_1

    iput-boolean v1, p0, LCh;->f:Z

    iget p1, p0, LCh;->k:I

    iget-object v1, p0, LCh;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, LCh;->b:I

    sub-int/2addr v2, v0

    iput v2, p0, LCh;->b:I

    invoke-virtual {v1, v2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, LCh;->f()I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "FlatBuffers: endVector called without startVector"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final d()I
    .locals 11

    iget-object v0, p0, LCh;->d:[I

    if-eqz v0, :cond_9

    iget-boolean v0, p0, LCh;->f:Z

    if-eqz v0, :cond_9

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LCh;->g(II)V

    iget-object v2, p0, LCh;->a:Ljava/nio/ByteBuffer;

    iget v3, p0, LCh;->b:I

    sub-int/2addr v3, v0

    iput v3, p0, LCh;->b:I

    invoke-virtual {v2, v3, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, LCh;->f()I

    move-result v0

    iget v2, p0, LCh;->e:I

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_0

    iget-object v3, p0, LCh;->d:[I

    aget v3, v3, v2

    if-nez v3, :cond_0

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_1
    if-ltz v3, :cond_2

    iget-object v4, p0, LCh;->d:[I

    aget v4, v4, v3

    if-eqz v4, :cond_1

    sub-int v4, v0, v4

    goto :goto_2

    :cond_1
    move v4, v1

    :goto_2
    int-to-short v4, v4

    invoke-virtual {p0, v4}, LCh;->b(S)V

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    iget v3, p0, LCh;->h:I

    sub-int v3, v0, v3

    int-to-short v3, v3

    invoke-virtual {p0, v3}, LCh;->b(S)V

    add-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    mul-int/2addr v2, v3

    int-to-short v2, v2

    invoke-virtual {p0, v2}, LCh;->b(S)V

    move v2, v1

    :goto_3
    iget v4, p0, LCh;->j:I

    if-ge v2, v4, :cond_6

    iget-object v4, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    move-result v4

    iget-object v5, p0, LCh;->i:[I

    aget v5, v5, v2

    sub-int/2addr v4, v5

    iget v5, p0, LCh;->b:I

    iget-object v6, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v6

    iget-object v7, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v7

    if-ne v6, v7, :cond_5

    move v7, v3

    :goto_4
    if-ge v7, v6, :cond_4

    iget-object v8, p0, LCh;->a:Ljava/nio/ByteBuffer;

    add-int v9, v4, v7

    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v8

    iget-object v9, p0, LCh;->a:Ljava/nio/ByteBuffer;

    add-int v10, v5, v7

    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v9

    if-eq v8, v9, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit8 v7, v7, 0x2

    goto :goto_4

    :cond_4
    iget-object v4, p0, LCh;->i:[I

    aget v2, v4, v2

    goto :goto_6

    :cond_5
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    move v2, v1

    :goto_6
    if-eqz v2, :cond_7

    iget-object v3, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    sub-int/2addr v3, v0

    iput v3, p0, LCh;->b:I

    iget-object v4, p0, LCh;->a:Ljava/nio/ByteBuffer;

    sub-int/2addr v2, v0

    invoke-virtual {v4, v3, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_7
    iget v2, p0, LCh;->j:I

    iget-object v4, p0, LCh;->i:[I

    array-length v5, v4

    if-ne v2, v5, :cond_8

    mul-int/2addr v2, v3

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, LCh;->i:[I

    :cond_8
    iget-object v2, p0, LCh;->i:[I

    iget v3, p0, LCh;->j:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, LCh;->j:I

    invoke-virtual {p0}, LCh;->f()I

    move-result v4

    aput v4, v2, v3

    iget-object v2, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    sub-int/2addr v3, v0

    invoke-virtual {p0}, LCh;->f()I

    move-result v4

    sub-int/2addr v4, v0

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    :goto_7
    iput-boolean v1, p0, LCh;->f:Z

    return v0

    :cond_9
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: endTable called without startTable"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final e(I)V
    .locals 3

    iget v0, p0, LCh;->c:I

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, LCh;->g(II)V

    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, LCh;->g(II)V

    invoke-virtual {p0}, LCh;->f()I

    move-result v0

    sub-int/2addr v0, p1

    add-int/2addr v0, v1

    iget-object p1, p0, LCh;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, LCh;->b:I

    sub-int/2addr v2, v1

    iput v2, p0, LCh;->b:I

    invoke-virtual {p1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    iget-object p1, p0, LCh;->a:Ljava/nio/ByteBuffer;

    iget v0, p0, LCh;->b:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 p1, 0x1

    iput-boolean p1, p0, LCh;->g:Z

    return-void
.end method

.method public final f()I
    .locals 2

    iget-object v0, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    iget v1, p0, LCh;->b:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final g(II)V
    .locals 7

    iget v0, p0, LCh;->c:I

    if-le p1, v0, :cond_0

    iput p1, p0, LCh;->c:I

    :cond_0
    iget-object v0, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    iget v1, p0, LCh;->b:I

    sub-int/2addr v0, v1

    add-int/2addr v0, p2

    not-int v0, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, p1, -0x1

    and-int/2addr v0, v1

    :goto_0
    iget v1, p0, LCh;->b:I

    add-int v2, v0, p1

    add-int/2addr v2, p2

    const/4 v3, 0x0

    if-ge v1, v2, :cond_4

    iget-object v1, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    iget-object v2, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    move-result v4

    if-nez v4, :cond_1

    const/16 v5, 0x400

    goto :goto_1

    :cond_1
    const v5, 0x7ffffff7

    if-eq v4, v5, :cond_3

    const/high16 v6, -0x40000000    # -2.0f

    and-int/2addr v6, v4

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    shl-int/lit8 v5, v4, 0x1

    :goto_1
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v3, p0, LCh;->l:Lgf;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    move-result v5

    sub-int/2addr v5, v4

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    iput-object v3, p0, LCh;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, LCh;->b:I

    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    sub-int/2addr v3, v1

    add-int/2addr v3, v2

    iput v3, p0, LCh;->b:I

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "FlatBuffers: cannot grow buffer beyond 2 gigabytes."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_4
    move p1, v3

    :goto_2
    if-ge p1, v0, :cond_5

    iget-object p2, p0, LCh;->a:Ljava/nio/ByteBuffer;

    iget v1, p0, LCh;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LCh;->b:I

    invoke-virtual {p2, v1, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final h()[B
    .locals 3

    iget v0, p0, LCh;->b:I

    iget-object v1, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    iget v2, p0, LCh;->b:I

    sub-int/2addr v1, v2

    iget-boolean v2, p0, LCh;->g:Z

    if-eqz v2, :cond_0

    new-array v1, v1, [B

    iget-object v2, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final i(I)V
    .locals 2

    iget-boolean v0, p0, LCh;->f:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LCh;->d:[I

    if-eqz v0, :cond_0

    array-length v0, v0

    if-ge v0, p1, :cond_1

    :cond_0
    new-array v0, p1, [I

    iput-object v0, p0, LCh;->d:[I

    :cond_1
    iput p1, p0, LCh;->e:I

    iget-object v0, p0, LCh;->d:[I

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, v1}, Ljava/util/Arrays;->fill([IIII)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LCh;->f:Z

    invoke-virtual {p0}, LCh;->f()I

    move-result p1

    iput p1, p0, LCh;->h:I

    return-void

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "FlatBuffers: object serialization must not be nested."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
