.class public final Lqz;
.super LTB;
.source ""


# instance fields
.field public final l:Ljava/lang/String;

.field public m:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqz;->l:Ljava/lang/String;

    iput p2, p0, Lqz;->m:I

    return-void
.end method


# virtual methods
.method public final N(LCh;)I
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lqz;->l:Ljava/lang/String;

    if-eqz v2, :cond_26

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    iget v3, v0, Lqz;->m:I

    const/4 v4, 0x5

    if-eq v3, v4, :cond_0

    iput v4, v0, Lqz;->m:I

    :cond_0
    iget-object v3, v1, LCh;->m:Lhw;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const/16 v6, 0x80

    if-ge v5, v3, :cond_1

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ge v7, v6, :cond_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move v7, v3

    :goto_1
    const/4 v8, 0x1

    const v9, 0xdfff

    const v10, 0xd800

    const/16 v11, 0x800

    if-ge v5, v3, :cond_7

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-ge v12, v11, :cond_2

    rsub-int/lit8 v8, v12, 0x7f

    ushr-int/lit8 v8, v8, 0x1f

    add-int/2addr v7, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v12

    move v13, v4

    :goto_2
    if-ge v5, v12, :cond_6

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-ge v14, v11, :cond_3

    rsub-int/lit8 v14, v14, 0x7f

    ushr-int/lit8 v14, v14, 0x1f

    add-int/2addr v13, v14

    goto :goto_3

    :cond_3
    add-int/lit8 v13, v13, 0x2

    if-gt v10, v14, :cond_5

    if-gt v14, v9, :cond_5

    invoke-static {v2, v5}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v14

    const/high16 v15, 0x10000

    if-lt v14, v15, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_4
    new-instance v1, LHx;

    invoke-direct {v1, v5, v12}, LHx;-><init>(II)V

    throw v1

    :cond_5
    :goto_3
    add-int/2addr v5, v8

    goto :goto_2

    :cond_6
    add-int/2addr v7, v13

    :cond_7
    if-lt v7, v3, :cond_25

    invoke-virtual {v1, v8, v4}, LCh;->g(II)V

    iget-object v3, v1, LCh;->a:Ljava/nio/ByteBuffer;

    iget v5, v1, LCh;->b:I

    sub-int/2addr v5, v8

    iput v5, v1, LCh;->b:I

    invoke-virtual {v3, v5, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    iget-boolean v3, v1, LCh;->f:Z

    if-nez v3, :cond_24

    iput v7, v1, LCh;->k:I

    const/4 v3, 0x4

    invoke-virtual {v1, v3, v7}, LCh;->g(II)V

    invoke-virtual {v1, v8, v7}, LCh;->g(II)V

    iput-boolean v8, v1, LCh;->f:Z

    iget-object v5, v1, LCh;->a:Ljava/nio/ByteBuffer;

    iget v12, v1, LCh;->b:I

    sub-int/2addr v12, v7

    iput v12, v1, LCh;->b:I

    invoke-virtual {v5, v12}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v5, v1, LCh;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v7

    const-string v12, " at index "

    const-string v13, "Failed writing "

    if-eqz v7, :cond_14

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v7

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v14

    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    move-result v15

    add-int/2addr v15, v7

    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    move-result v16

    move/from16 v17, v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    move/from16 v18, v8

    add-int v8, v15, v16

    :goto_4
    if-ge v4, v3, :cond_8

    add-int v9, v4, v15

    if-ge v9, v8, :cond_8

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-ge v10, v6, :cond_8

    int-to-byte v10, v10

    aput-byte v10, v14, v9

    add-int/lit8 v4, v4, 0x1

    const v9, 0xdfff

    const v10, 0xd800

    goto :goto_4

    :cond_8
    if-ne v4, v3, :cond_a

    add-int/2addr v15, v3

    :cond_9
    move/from16 v21, v7

    goto/16 :goto_9

    :cond_a
    add-int/2addr v15, v4

    :goto_5
    if-ge v4, v3, :cond_9

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ge v9, v6, :cond_b

    if-ge v15, v8, :cond_b

    add-int/lit8 v10, v15, 0x1

    int-to-byte v9, v9

    aput-byte v9, v14, v15

    move/from16 v21, v7

    move v15, v10

    goto/16 :goto_8

    :cond_b
    if-ge v9, v11, :cond_c

    add-int/lit8 v10, v8, -0x2

    if-gt v15, v10, :cond_c

    add-int/lit8 v10, v15, 0x1

    ushr-int/lit8 v11, v9, 0x6

    or-int/lit16 v11, v11, 0x3c0

    int-to-byte v11, v11

    aput-byte v11, v14, v15

    add-int/lit8 v15, v15, 0x2

    and-int/lit8 v9, v9, 0x3f

    or-int/2addr v9, v6

    int-to-byte v9, v9

    aput-byte v9, v14, v10

    move/from16 v21, v7

    goto/16 :goto_8

    :cond_c
    const v10, 0xd800

    if-lt v9, v10, :cond_e

    const v10, 0xdfff

    if-ge v10, v9, :cond_d

    goto :goto_6

    :cond_d
    move/from16 v21, v7

    goto :goto_7

    :cond_e
    :goto_6
    add-int/lit8 v10, v8, -0x3

    if-gt v15, v10, :cond_d

    add-int/lit8 v10, v15, 0x1

    ushr-int/lit8 v11, v9, 0xc

    or-int/lit16 v11, v11, 0x1e0

    int-to-byte v11, v11

    aput-byte v11, v14, v15

    add-int/lit8 v11, v15, 0x2

    ushr-int/lit8 v20, v9, 0x6

    move/from16 v21, v7

    and-int/lit8 v7, v20, 0x3f

    or-int/2addr v7, v6

    int-to-byte v7, v7

    aput-byte v7, v14, v10

    add-int/lit8 v15, v15, 0x3

    and-int/lit8 v7, v9, 0x3f

    or-int/2addr v7, v6

    int-to-byte v7, v7

    aput-byte v7, v14, v11

    goto :goto_8

    :goto_7
    add-int/lit8 v7, v8, -0x4

    if-gt v15, v7, :cond_11

    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v10

    if-eq v7, v10, :cond_10

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v9, v4}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-static {v9, v4}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v4

    add-int/lit8 v9, v15, 0x1

    ushr-int/lit8 v10, v4, 0x12

    or-int/lit16 v10, v10, 0xf0

    int-to-byte v10, v10

    aput-byte v10, v14, v15

    add-int/lit8 v10, v15, 0x2

    ushr-int/lit8 v11, v4, 0xc

    and-int/lit8 v11, v11, 0x3f

    or-int/2addr v11, v6

    int-to-byte v11, v11

    aput-byte v11, v14, v9

    add-int/lit8 v9, v15, 0x3

    ushr-int/lit8 v11, v4, 0x6

    and-int/lit8 v11, v11, 0x3f

    or-int/2addr v11, v6

    int-to-byte v11, v11

    aput-byte v11, v14, v10

    add-int/lit8 v15, v15, 0x4

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v6

    int-to-byte v4, v4

    aput-byte v4, v14, v9

    move v4, v7

    :goto_8
    add-int/lit8 v4, v4, 0x1

    move/from16 v7, v21

    const/16 v11, 0x800

    goto/16 :goto_5

    :cond_f
    move v4, v7

    :cond_10
    new-instance v1, LHx;

    add-int/lit8 v4, v4, -0x1

    invoke-direct {v1, v4, v3}, LHx;-><init>(II)V

    throw v1

    :cond_11
    const v10, 0xd800

    if-gt v10, v9, :cond_13

    const v10, 0xdfff

    if-gt v9, v10, :cond_13

    add-int/lit8 v1, v4, 0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-eq v1, v5, :cond_12

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v9, v1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    new-instance v1, LHx;

    invoke-direct {v1, v4, v3}, LHx;-><init>(II)V

    throw v1

    :cond_13
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_9
    sub-int v15, v15, v21

    invoke-virtual {v5, v15}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto/16 :goto_10

    :cond_14
    move/from16 v17, v3

    move/from16 v18, v8

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    move-result v4

    const/4 v7, 0x0

    :goto_a
    if-ge v7, v3, :cond_15

    :try_start_0
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ge v8, v6, :cond_15

    add-int v9, v4, v7

    int-to-byte v8, v8

    invoke-virtual {v5, v9, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_15
    if-ne v7, v3, :cond_16

    add-int v3, v4, v7

    invoke-virtual {v5, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto/16 :goto_10

    :cond_16
    add-int/2addr v4, v7

    :goto_b
    if-ge v7, v3, :cond_1d

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ge v8, v6, :cond_17

    int-to-byte v8, v8

    invoke-virtual {v5, v4, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_5

    :goto_c
    const v10, 0xd800

    const v11, 0xdfff

    goto/16 :goto_f

    :cond_17
    const/16 v9, 0x800

    if-ge v8, v9, :cond_18

    add-int/lit8 v10, v4, 0x1

    ushr-int/lit8 v11, v8, 0x6

    or-int/lit16 v11, v11, 0xc0

    int-to-byte v11, v11

    :try_start_1
    invoke-virtual {v5, v4, v11}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    and-int/lit8 v4, v8, 0x3f

    or-int/2addr v4, v6

    int-to-byte v4, v4

    invoke-virtual {v5, v10, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    move v4, v10

    goto :goto_c

    :catch_0
    move v4, v10

    goto/16 :goto_12

    :cond_18
    const v10, 0xd800

    const v11, 0xdfff

    if-lt v8, v10, :cond_1c

    if-ge v11, v8, :cond_19

    goto :goto_e

    :cond_19
    add-int/lit8 v14, v7, 0x1

    if-eq v14, v3, :cond_1b

    :try_start_2
    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v8, v7}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v15

    if-eqz v15, :cond_1a

    invoke-static {v8, v7}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v7
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    add-int/lit8 v8, v4, 0x1

    ushr-int/lit8 v15, v7, 0x12

    or-int/lit16 v15, v15, 0xf0

    int-to-byte v15, v15

    :try_start_3
    invoke-virtual {v5, v4, v15}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_3

    add-int/lit8 v15, v4, 0x2

    ushr-int/lit8 v19, v7, 0xc

    and-int/lit8 v9, v19, 0x3f

    or-int/2addr v9, v6

    int-to-byte v9, v9

    :try_start_4
    invoke-virtual {v5, v8, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_2

    add-int/lit8 v4, v4, 0x3

    ushr-int/lit8 v8, v7, 0x6

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v6

    int-to-byte v8, v8

    :try_start_5
    invoke-virtual {v5, v15, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    and-int/lit8 v7, v7, 0x3f

    or-int/2addr v7, v6

    int-to-byte v7, v7

    invoke-virtual {v5, v4, v7}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_1

    move v7, v14

    goto :goto_f

    :catch_1
    :goto_d
    move v7, v14

    goto/16 :goto_12

    :catch_2
    move v7, v14

    move v4, v15

    goto/16 :goto_12

    :catch_3
    move v4, v8

    goto :goto_d

    :cond_1a
    move v7, v14

    :cond_1b
    :try_start_6
    new-instance v1, LHx;

    invoke-direct {v1, v7, v3}, LHx;-><init>(II)V

    throw v1
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_5

    :cond_1c
    :goto_e
    add-int/lit8 v9, v4, 0x1

    ushr-int/lit8 v14, v8, 0xc

    or-int/lit16 v14, v14, 0xe0

    int-to-byte v14, v14

    :try_start_7
    invoke-virtual {v5, v4, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_7
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_4

    add-int/lit8 v4, v4, 0x2

    ushr-int/lit8 v14, v8, 0x6

    and-int/lit8 v14, v14, 0x3f

    or-int/2addr v14, v6

    int-to-byte v14, v14

    :try_start_8
    invoke-virtual {v5, v9, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v6

    int-to-byte v8, v8

    invoke-virtual {v5, v4, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    :goto_f
    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_b

    :catch_4
    move v4, v9

    goto :goto_12

    :cond_1d
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_5

    :goto_10
    iget-boolean v2, v1, LCh;->f:Z

    if-eqz v2, :cond_23

    const/4 v2, 0x0

    iput-boolean v2, v1, LCh;->f:Z

    iget v2, v1, LCh;->k:I

    iget-object v3, v1, LCh;->a:Ljava/nio/ByteBuffer;

    iget v4, v1, LCh;->b:I

    add-int/lit8 v4, v4, -0x4

    iput v4, v1, LCh;->b:I

    invoke-virtual {v3, v4, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, LCh;->f()I

    move-result v2

    iget v3, v0, Lqz;->m:I

    const/4 v4, 0x1

    if-eq v3, v4, :cond_20

    const/4 v5, 0x2

    if-eq v3, v5, :cond_21

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1e

    const/4 v5, 0x4

    if-eq v3, v5, :cond_21

    const/4 v4, 0x5

    if-ne v3, v4, :cond_1f

    :cond_1e
    move v4, v5

    goto :goto_11

    :cond_1f
    const/4 v1, 0x0

    throw v1

    :cond_20
    const/4 v4, 0x0

    :cond_21
    :goto_11
    const/4 v3, 0x3

    invoke-virtual {v1, v3}, LCh;->i(I)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, LCh;->a(II)V

    if-eqz v4, :cond_22

    move/from16 v2, v18

    invoke-virtual {v1, v2, v3}, LCh;->g(II)V

    iget-object v3, v1, LCh;->a:Ljava/nio/ByteBuffer;

    iget v5, v1, LCh;->b:I

    sub-int/2addr v5, v2

    iput v5, v1, LCh;->b:I

    invoke-virtual {v3, v5, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    iget-object v3, v1, LCh;->d:[I

    invoke-virtual {v1}, LCh;->f()I

    move-result v4

    aput v4, v3, v2

    :cond_22
    invoke-virtual {v1}, LCh;->d()I

    move-result v2

    invoke-virtual {v1, v2}, LCh;->e(I)V

    return v2

    :cond_23
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "FlatBuffers: endVector called without startVector"

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :catch_5
    :goto_12
    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    move-result v1

    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    move-result v3

    sub-int/2addr v4, v3

    const/16 v18, 0x1

    add-int/lit8 v4, v4, 0x1

    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr v3, v1

    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_24
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "FlatBuffers: object serialization must not be nested."

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_25
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

    :cond_26
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "value must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
