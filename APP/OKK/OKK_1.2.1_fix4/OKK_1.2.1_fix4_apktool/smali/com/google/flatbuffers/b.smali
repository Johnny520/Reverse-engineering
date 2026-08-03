.class public final Lcom/google/flatbuffers/b;
.super Ljava/lang/Object;
.source "SourceFile"


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

.field public final l:Lcom/google/flatbuffers/a;

.field public final m:Lcom/google/flatbuffers/e;


# direct methods
.method public constructor <init>()V
    .locals 4

    sget-object v0, Lcom/google/flatbuffers/a;->a:Lcom/google/flatbuffers/a;

    sget-object v1, Lcom/google/flatbuffers/e;->a:Lcom/google/flatbuffers/g;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/flatbuffers/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lcom/google/flatbuffers/e;->a:Lcom/google/flatbuffers/g;

    :cond_0
    sget-object v1, Lcom/google/flatbuffers/e;->a:Lcom/google/flatbuffers/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x1

    iput v2, p0, Lcom/google/flatbuffers/b;->c:I

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/flatbuffers/b;->d:[I

    const/4 v2, 0x0

    iput v2, p0, Lcom/google/flatbuffers/b;->e:I

    iput-boolean v2, p0, Lcom/google/flatbuffers/b;->f:Z

    iput-boolean v2, p0, Lcom/google/flatbuffers/b;->g:Z

    const/16 v3, 0x10

    new-array v3, v3, [I

    iput-object v3, p0, Lcom/google/flatbuffers/b;->i:[I

    iput v2, p0, Lcom/google/flatbuffers/b;->j:I

    iput v2, p0, Lcom/google/flatbuffers/b;->k:I

    iput-object v0, p0, Lcom/google/flatbuffers/b;->l:Lcom/google/flatbuffers/a;

    const/16 v0, 0x400

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lcom/google/flatbuffers/b;->m:Lcom/google/flatbuffers/e;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    iput v0, p0, Lcom/google/flatbuffers/b;->b:I

    return-void
.end method


# virtual methods
.method public final a(IZ)V
    .locals 3

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/google/flatbuffers/b;->p(II)V

    iget-object v0, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/b;->b:I

    sub-int/2addr v2, v1

    iput v2, p0, Lcom/google/flatbuffers/b;->b:I

    int-to-byte p2, p2

    invoke-virtual {v0, v2, p2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/b;->r(I)V

    :cond_0
    return-void
.end method

.method public final b(B)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/google/flatbuffers/b;->p(II)V

    iget-object v0, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/b;->b:I

    sub-int/2addr v2, v1

    iput v2, p0, Lcom/google/flatbuffers/b;->b:I

    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final c(IB)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/b;->b(B)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/b;->r(I)V

    :cond_0
    return-void
.end method

.method public final d(I)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Lcom/google/flatbuffers/b;->p(II)V

    iget-object v0, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/b;->b:I

    sub-int/2addr v2, v1

    iput v2, p0, Lcom/google/flatbuffers/b;->b:I

    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final e(II)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/b;->d(I)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/b;->r(I)V

    :cond_0
    return-void
.end method

.method public final f(J)V
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/google/flatbuffers/b;->p(II)V

    iget-object v0, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/b;->b:I

    sub-int/2addr v2, v1

    iput v2, p0, Lcom/google/flatbuffers/b;->b:I

    invoke-virtual {v0, v2, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final g(I)V
    .locals 3

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/b;->p(II)V

    invoke-virtual {p0}, Lcom/google/flatbuffers/b;->o()I

    move-result v1

    sub-int/2addr v1, p1

    add-int/2addr v1, v0

    iget-object p1, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/b;->b:I

    sub-int/2addr v2, v0

    iput v2, p0, Lcom/google/flatbuffers/b;->b:I

    invoke-virtual {p1, v2, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final h(II)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/b;->g(I)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/b;->r(I)V

    :cond_0
    return-void
.end method

.method public final i(S)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lcom/google/flatbuffers/b;->p(II)V

    iget-object v0, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/b;->b:I

    sub-int/2addr v2, v1

    iput v2, p0, Lcom/google/flatbuffers/b;->b:I

    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final j(Ljava/lang/CharSequence;)I
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/google/flatbuffers/b;->m:Lcom/google/flatbuffers/e;

    move-object v3, v2

    check-cast v3, Lcom/google/flatbuffers/g;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const/16 v6, 0x80

    if-ge v5, v3, :cond_0

    invoke-interface {v1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-ge v7, v6, :cond_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    move v7, v3

    :goto_1
    const v8, 0xdfff

    const v9, 0xd800

    const/16 v10, 0x800

    const/4 v11, 0x1

    if-ge v5, v3, :cond_6

    invoke-interface {v1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-ge v12, v10, :cond_1

    rsub-int/lit8 v8, v12, 0x7f

    ushr-int/lit8 v8, v8, 0x1f

    add-int/2addr v7, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v12

    move v13, v4

    :goto_2
    if-ge v5, v12, :cond_5

    invoke-interface {v1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    if-ge v14, v10, :cond_2

    rsub-int/lit8 v14, v14, 0x7f

    ushr-int/lit8 v14, v14, 0x1f

    add-int/2addr v13, v14

    goto :goto_3

    :cond_2
    add-int/lit8 v13, v13, 0x2

    if-gt v9, v14, :cond_4

    if-gt v14, v8, :cond_4

    invoke-static {v1, v5}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v14

    const/high16 v15, 0x10000

    if-lt v14, v15, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_3
    new-instance v1, Lcom/google/flatbuffers/f;

    invoke-direct {v1, v5, v12}, Lcom/google/flatbuffers/f;-><init>(II)V

    throw v1

    :cond_4
    :goto_3
    add-int/2addr v5, v11

    goto :goto_2

    :cond_5
    add-int/2addr v7, v13

    :cond_6
    if-lt v7, v3, :cond_1d

    invoke-virtual {v0, v4}, Lcom/google/flatbuffers/b;->b(B)V

    invoke-virtual {v0, v11, v7, v11}, Lcom/google/flatbuffers/b;->t(III)V

    iget-object v3, v0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/flatbuffers/b;->b:I

    sub-int/2addr v5, v7

    iput v5, v0, Lcom/google/flatbuffers/b;->b:I

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v3, v0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    check-cast v2, Lcom/google/flatbuffers/g;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v2

    const-string v5, " at index "

    const-string v7, "Failed writing "

    if-eqz v2, :cond_13

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v2

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v12

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v13

    add-int/2addr v13, v2

    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    move-result v14

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v15

    add-int/2addr v14, v13

    :goto_4
    if-ge v4, v15, :cond_7

    add-int v11, v4, v13

    if-ge v11, v14, :cond_7

    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    if-ge v8, v6, :cond_7

    int-to-byte v8, v8

    aput-byte v8, v12, v11

    add-int/lit8 v4, v4, 0x1

    const v8, 0xdfff

    const/4 v11, 0x1

    goto :goto_4

    :cond_7
    if-ne v4, v15, :cond_8

    add-int/2addr v13, v15

    goto/16 :goto_9

    :cond_8
    add-int/2addr v13, v4

    :goto_5
    if-ge v4, v15, :cond_12

    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    if-ge v8, v6, :cond_9

    if-ge v13, v14, :cond_9

    add-int/lit8 v11, v13, 0x1

    int-to-byte v8, v8

    aput-byte v8, v12, v13

    move v13, v11

    :goto_6
    const/4 v8, 0x1

    goto/16 :goto_7

    :cond_9
    if-ge v8, v10, :cond_a

    add-int/lit8 v11, v14, -0x2

    if-gt v13, v11, :cond_a

    add-int/lit8 v11, v13, 0x1

    ushr-int/lit8 v10, v8, 0x6

    or-int/lit16 v10, v10, 0x3c0

    int-to-byte v10, v10

    aput-byte v10, v12, v13

    add-int/lit8 v13, v13, 0x2

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v6

    int-to-byte v8, v8

    aput-byte v8, v12, v11

    goto :goto_6

    :cond_a
    if-lt v8, v9, :cond_b

    const v10, 0xdfff

    if-ge v10, v8, :cond_c

    :cond_b
    add-int/lit8 v10, v14, -0x3

    if-gt v13, v10, :cond_c

    add-int/lit8 v10, v13, 0x1

    ushr-int/lit8 v11, v8, 0xc

    or-int/lit16 v11, v11, 0x1e0

    int-to-byte v11, v11

    aput-byte v11, v12, v13

    add-int/lit8 v11, v13, 0x2

    ushr-int/lit8 v16, v8, 0x6

    and-int/lit8 v9, v16, 0x3f

    or-int/2addr v9, v6

    int-to-byte v9, v9

    aput-byte v9, v12, v10

    add-int/lit8 v13, v13, 0x3

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v6

    int-to-byte v8, v8

    aput-byte v8, v12, v11

    goto :goto_6

    :cond_c
    add-int/lit8 v9, v14, -0x4

    if-gt v13, v9, :cond_f

    add-int/lit8 v9, v4, 0x1

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-eq v9, v10, :cond_e

    invoke-interface {v1, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v8, v4}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-static {v8, v4}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v4

    add-int/lit8 v8, v13, 0x1

    ushr-int/lit8 v10, v4, 0x12

    or-int/lit16 v10, v10, 0xf0

    int-to-byte v10, v10

    aput-byte v10, v12, v13

    add-int/lit8 v10, v13, 0x2

    ushr-int/lit8 v11, v4, 0xc

    and-int/lit8 v11, v11, 0x3f

    or-int/2addr v11, v6

    int-to-byte v11, v11

    aput-byte v11, v12, v8

    add-int/lit8 v8, v13, 0x3

    ushr-int/lit8 v11, v4, 0x6

    and-int/lit8 v11, v11, 0x3f

    or-int/2addr v11, v6

    int-to-byte v11, v11

    aput-byte v11, v12, v10

    add-int/lit8 v13, v13, 0x4

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v6

    int-to-byte v4, v4

    aput-byte v4, v12, v8

    move v4, v9

    goto/16 :goto_6

    :goto_7
    add-int/2addr v4, v8

    const v9, 0xd800

    const/16 v10, 0x800

    goto/16 :goto_5

    :cond_d
    const/4 v8, 0x1

    move v4, v9

    goto :goto_8

    :cond_e
    const/4 v8, 0x1

    :goto_8
    new-instance v1, Lcom/google/flatbuffers/f;

    sub-int/2addr v4, v8

    invoke-direct {v1, v4, v15}, Lcom/google/flatbuffers/f;-><init>(II)V

    throw v1

    :cond_f
    const v2, 0xd800

    if-gt v2, v8, :cond_11

    const v2, 0xdfff

    if-gt v8, v2, :cond_11

    add-int/lit8 v2, v4, 0x1

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-eq v2, v3, :cond_10

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v8, v1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v1

    if-nez v1, :cond_11

    :cond_10
    new-instance v1, Lcom/google/flatbuffers/f;

    invoke-direct {v1, v4, v15}, Lcom/google/flatbuffers/f;-><init>(II)V

    throw v1

    :cond_11
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    :goto_9
    sub-int/2addr v13, v2

    invoke-virtual {v3, v13}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto/16 :goto_11

    :cond_13
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v8

    :goto_a
    if-ge v4, v2, :cond_14

    :try_start_0
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-ge v9, v6, :cond_14

    add-int v10, v8, v4

    int-to-byte v9, v9

    invoke-virtual {v3, v10, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_14
    if-ne v4, v2, :cond_15

    add-int v2, v8, v4

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto/16 :goto_11

    :cond_15
    add-int/2addr v8, v4

    :goto_b
    if-ge v4, v2, :cond_1c

    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-ge v9, v6, :cond_16

    int-to-byte v9, v9

    invoke-virtual {v3, v8, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_5

    const/4 v9, 0x1

    const/16 v10, 0x800

    :goto_c
    const v11, 0xd800

    const v12, 0xdfff

    goto/16 :goto_10

    :cond_16
    const/16 v10, 0x800

    if-ge v9, v10, :cond_17

    add-int/lit8 v11, v8, 0x1

    ushr-int/lit8 v12, v9, 0x6

    or-int/lit16 v12, v12, 0xc0

    int-to-byte v12, v12

    :try_start_1
    invoke-virtual {v3, v8, v12}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    and-int/lit8 v8, v9, 0x3f

    or-int/2addr v8, v6

    int-to-byte v8, v8

    invoke-virtual {v3, v11, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    move v8, v11

    const/4 v9, 0x1

    goto :goto_c

    :catch_0
    move v8, v11

    goto/16 :goto_12

    :cond_17
    const v11, 0xd800

    const v12, 0xdfff

    if-lt v9, v11, :cond_1b

    if-ge v12, v9, :cond_18

    goto :goto_f

    :cond_18
    add-int/lit8 v13, v4, 0x1

    if-eq v13, v2, :cond_1a

    :try_start_2
    invoke-interface {v1, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v9, v4}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v14

    if-eqz v14, :cond_19

    invoke-static {v9, v4}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v4
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    add-int/lit8 v9, v8, 0x1

    ushr-int/lit8 v14, v4, 0x12

    or-int/lit16 v14, v14, 0xf0

    int-to-byte v14, v14

    :try_start_3
    invoke-virtual {v3, v8, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_3

    add-int/lit8 v14, v8, 0x2

    ushr-int/lit8 v15, v4, 0xc

    and-int/lit8 v15, v15, 0x3f

    or-int/2addr v15, v6

    int-to-byte v15, v15

    :try_start_4
    invoke-virtual {v3, v9, v15}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_2

    add-int/lit8 v8, v8, 0x3

    ushr-int/lit8 v9, v4, 0x6

    and-int/lit8 v9, v9, 0x3f

    or-int/2addr v9, v6

    int-to-byte v9, v9

    :try_start_5
    invoke-virtual {v3, v14, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v6

    int-to-byte v4, v4

    invoke-virtual {v3, v8, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_1

    move v4, v13

    :goto_d
    const/4 v9, 0x1

    goto :goto_10

    :catch_1
    :goto_e
    move v4, v13

    goto :goto_12

    :catch_2
    move v4, v13

    move v8, v14

    goto :goto_12

    :catch_3
    move v8, v9

    goto :goto_e

    :cond_19
    move v4, v13

    :cond_1a
    :try_start_6
    new-instance v6, Lcom/google/flatbuffers/f;

    invoke-direct {v6, v4, v2}, Lcom/google/flatbuffers/f;-><init>(II)V

    throw v6
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_5

    :cond_1b
    :goto_f
    add-int/lit8 v13, v8, 0x1

    ushr-int/lit8 v14, v9, 0xc

    or-int/lit16 v14, v14, 0xe0

    int-to-byte v14, v14

    :try_start_7
    invoke-virtual {v3, v8, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_7
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_4

    add-int/lit8 v8, v8, 0x2

    ushr-int/lit8 v14, v9, 0x6

    and-int/lit8 v14, v14, 0x3f

    or-int/2addr v14, v6

    int-to-byte v14, v14

    :try_start_8
    invoke-virtual {v3, v13, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    and-int/lit8 v9, v9, 0x3f

    or-int/2addr v9, v6

    int-to-byte v9, v9

    invoke-virtual {v3, v8, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    goto :goto_d

    :goto_10
    add-int/2addr v4, v9

    add-int/2addr v8, v9

    goto/16 :goto_b

    :catch_4
    move v8, v13

    goto :goto_12

    :cond_1c
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_5

    :goto_11
    invoke-virtual/range {p0 .. p0}, Lcom/google/flatbuffers/b;->m()I

    move-result v1

    return v1

    :catch_5
    :goto_12
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v3

    sub-int/2addr v8, v3

    const/4 v3, 0x1

    add-int/2addr v8, v3

    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr v3, v2

    new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "UTF-8 length does not fit in int: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-long v3, v7

    const-wide v5, 0x100000000L

    add-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final k([I)I
    .locals 2

    iget-boolean v0, p0, Lcom/google/flatbuffers/b;->f:Z

    if-nez v0, :cond_1

    array-length v0, p1

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0, v1}, Lcom/google/flatbuffers/b;->t(III)V

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget v1, p1, v0

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/b;->g(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/flatbuffers/b;->m()I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "FlatBuffers: object serialization must not be nested."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final l()I
    .locals 11

    iget-object v0, p0, Lcom/google/flatbuffers/b;->d:[I

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Lcom/google/flatbuffers/b;->f:Z

    if-eqz v0, :cond_9

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/b;->d(I)V

    invoke-virtual {p0}, Lcom/google/flatbuffers/b;->o()I

    move-result v1

    iget v2, p0, Lcom/google/flatbuffers/b;->e:I

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_0

    iget-object v3, p0, Lcom/google/flatbuffers/b;->d:[I

    aget v3, v3, v2

    if-nez v3, :cond_0

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_1
    if-ltz v3, :cond_2

    iget-object v4, p0, Lcom/google/flatbuffers/b;->d:[I

    aget v4, v4, v3

    if-eqz v4, :cond_1

    sub-int v4, v1, v4

    goto :goto_2

    :cond_1
    move v4, v0

    :goto_2
    int-to-short v4, v4

    invoke-virtual {p0, v4}, Lcom/google/flatbuffers/b;->i(S)V

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    iget v3, p0, Lcom/google/flatbuffers/b;->h:I

    sub-int v3, v1, v3

    int-to-short v3, v3

    invoke-virtual {p0, v3}, Lcom/google/flatbuffers/b;->i(S)V

    add-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    mul-int/2addr v2, v3

    int-to-short v2, v2

    invoke-virtual {p0, v2}, Lcom/google/flatbuffers/b;->i(S)V

    move v2, v0

    :goto_3
    iget v4, p0, Lcom/google/flatbuffers/b;->j:I

    if-ge v2, v4, :cond_6

    iget-object v4, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    move-result v4

    iget-object v5, p0, Lcom/google/flatbuffers/b;->i:[I

    aget v5, v5, v2

    sub-int/2addr v4, v5

    iget v5, p0, Lcom/google/flatbuffers/b;->b:I

    iget-object v6, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v6

    iget-object v7, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v7

    if-ne v6, v7, :cond_5

    move v7, v3

    :goto_4
    if-ge v7, v6, :cond_4

    iget-object v8, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    add-int v9, v4, v7

    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v8

    iget-object v9, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    add-int v10, v5, v7

    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v9

    if-eq v8, v9, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit8 v7, v7, 0x2

    goto :goto_4

    :cond_4
    iget-object v4, p0, Lcom/google/flatbuffers/b;->i:[I

    aget v2, v4, v2

    goto :goto_6

    :cond_5
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    move v2, v0

    :goto_6
    if-eqz v2, :cond_7

    iget-object v3, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    sub-int/2addr v3, v1

    iput v3, p0, Lcom/google/flatbuffers/b;->b:I

    iget-object v4, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    sub-int/2addr v2, v1

    invoke-virtual {v4, v3, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_7
    iget v2, p0, Lcom/google/flatbuffers/b;->j:I

    iget-object v4, p0, Lcom/google/flatbuffers/b;->i:[I

    array-length v5, v4

    if-ne v2, v5, :cond_8

    mul-int/2addr v2, v3

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Lcom/google/flatbuffers/b;->i:[I

    :cond_8
    iget-object v2, p0, Lcom/google/flatbuffers/b;->i:[I

    iget v3, p0, Lcom/google/flatbuffers/b;->j:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/google/flatbuffers/b;->j:I

    invoke-virtual {p0}, Lcom/google/flatbuffers/b;->o()I

    move-result v4

    aput v4, v2, v3

    iget-object v2, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {p0}, Lcom/google/flatbuffers/b;->o()I

    move-result v4

    sub-int/2addr v4, v1

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    :goto_7
    iput-boolean v0, p0, Lcom/google/flatbuffers/b;->f:Z

    return v1

    :cond_9
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: endTable called without startTable"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final m()I
    .locals 3

    iget-boolean v0, p0, Lcom/google/flatbuffers/b;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/flatbuffers/b;->f:Z

    iget v0, p0, Lcom/google/flatbuffers/b;->k:I

    iget-object v1, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/b;->b:I

    add-int/lit8 v2, v2, -0x4

    iput v2, p0, Lcom/google/flatbuffers/b;->b:I

    invoke-virtual {v1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/google/flatbuffers/b;->o()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: endVector called without startVector"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final n(I)V
    .locals 2

    iget v0, p0, Lcom/google/flatbuffers/b;->c:I

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/b;->p(II)V

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/b;->g(I)V

    iget-object p1, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v0, p0, Lcom/google/flatbuffers/b;->b:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/flatbuffers/b;->g:Z

    return-void
.end method

.method public final o()I
    .locals 2

    iget-object v0, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    iget v1, p0, Lcom/google/flatbuffers/b;->b:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final p(II)V
    .locals 7

    iget v0, p0, Lcom/google/flatbuffers/b;->c:I

    if-le p1, v0, :cond_0

    iput p1, p0, Lcom/google/flatbuffers/b;->c:I

    :cond_0
    iget-object v0, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    iget v1, p0, Lcom/google/flatbuffers/b;->b:I

    sub-int/2addr v0, v1

    add-int/2addr v0, p2

    not-int v0, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, p1, -0x1

    and-int/2addr v0, v1

    :goto_0
    iget v1, p0, Lcom/google/flatbuffers/b;->b:I

    add-int v2, v0, p1

    add-int/2addr v2, p2

    const/4 v3, 0x0

    if-ge v1, v2, :cond_4

    iget-object v1, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    iget-object v2, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

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

    iget-object v3, p0, Lcom/google/flatbuffers/b;->l:Lcom/google/flatbuffers/a;

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

    iput-object v3, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/google/flatbuffers/b;->b:I

    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    sub-int/2addr v3, v1

    add-int/2addr v3, v2

    iput v3, p0, Lcom/google/flatbuffers/b;->b:I

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

    iget-object p2, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/flatbuffers/b;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/flatbuffers/b;->b:I

    invoke-virtual {p2, v1, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final q()[B
    .locals 3

    iget v0, p0, Lcom/google/flatbuffers/b;->b:I

    iget-object v1, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    iget v2, p0, Lcom/google/flatbuffers/b;->b:I

    sub-int/2addr v1, v2

    iget-boolean v2, p0, Lcom/google/flatbuffers/b;->g:Z

    if-eqz v2, :cond_0

    new-array v1, v1, [B

    iget-object v2, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Lcom/google/flatbuffers/b;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final r(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/flatbuffers/b;->d:[I

    invoke-virtual {p0}, Lcom/google/flatbuffers/b;->o()I

    move-result v1

    aput v1, v0, p1

    return-void
.end method

.method public final s(I)V
    .locals 2

    iget-boolean v0, p0, Lcom/google/flatbuffers/b;->f:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/flatbuffers/b;->d:[I

    if-eqz v0, :cond_0

    array-length v0, v0

    if-ge v0, p1, :cond_1

    :cond_0
    new-array v0, p1, [I

    iput-object v0, p0, Lcom/google/flatbuffers/b;->d:[I

    :cond_1
    iput p1, p0, Lcom/google/flatbuffers/b;->e:I

    iget-object v0, p0, Lcom/google/flatbuffers/b;->d:[I

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, v1}, Ljava/util/Arrays;->fill([IIII)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/flatbuffers/b;->f:Z

    invoke-virtual {p0}, Lcom/google/flatbuffers/b;->o()I

    move-result p1

    iput p1, p0, Lcom/google/flatbuffers/b;->h:I

    return-void

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "FlatBuffers: object serialization must not be nested."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final t(III)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/flatbuffers/b;->f:Z

    if-nez v0, :cond_0

    iput p2, p0, Lcom/google/flatbuffers/b;->k:I

    mul-int/2addr p1, p2

    const/4 p2, 0x4

    invoke-virtual {p0, p2, p1}, Lcom/google/flatbuffers/b;->p(II)V

    invoke-virtual {p0, p3, p1}, Lcom/google/flatbuffers/b;->p(II)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/flatbuffers/b;->f:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "FlatBuffers: object serialization must not be nested."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
