.class public final Lqm;
.super LfG;
.source ""


# instance fields
.field public final g:Loz;


# direct methods
.method public constructor <init>(Loz;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LfG;-><init>(I)V

    iput-object p1, p0, Lqm;->g:Loz;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lqm;->g:Loz;

    invoke-virtual {v1}, Loz;->j()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_1

    :cond_0
    :goto_0
    const/16 v16, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x30

    invoke-static {v6, v7}, LNj;->g(II)I

    move-result v7
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez v7, :cond_2

    const/4 v7, 0x1

    if-eq v5, v7, :cond_0

    const/16 v8, 0x2b

    if-eq v6, v8, :cond_3

    goto :goto_0

    :cond_2
    move v7, v3

    :cond_3
    const/16 v6, 0xa

    int-to-long v8, v6

    const-wide v10, 0x71c71c71c71c71cL

    const-wide/16 v12, 0x0

    move-wide v14, v10

    :goto_1
    if-ge v7, v5, :cond_8

    const/16 v16, 0x0

    :try_start_1
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4, v6}, Ljava/lang/Character;->digit(II)I

    move-result v4

    if-gez v4, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v17

    if-lez v17, :cond_5

    cmp-long v14, v14, v10

    if-nez v14, :cond_6

    const-wide/16 v14, -0x1

    invoke-static {v14, v15, v8, v9}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide v14

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v17

    if-lez v17, :cond_5

    goto :goto_2

    :cond_5
    mul-long/2addr v12, v8

    move/from16 v18, v7

    int-to-long v6, v4

    const-wide v19, 0xffffffffL

    and-long v6, v6, v19

    add-long/2addr v6, v12

    invoke-static {v6, v7, v12, v13}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v4

    if-gez v4, :cond_7

    :cond_6
    :goto_2
    move-object/from16 v4, v16

    goto :goto_3

    :cond_7
    add-int/lit8 v4, v18, 0x1

    move-wide v12, v6

    const/16 v6, 0xa

    move v7, v4

    goto :goto_1

    :cond_8
    const/16 v16, 0x0

    new-instance v4, LkC;

    invoke-direct {v4, v12, v13}, LkC;-><init>(J)V

    :goto_3
    if-eqz v4, :cond_9

    iget-wide v1, v4, LkC;->a:J

    return-wide v1

    :cond_9
    invoke-static {v2}, LAz;->G(Ljava/lang/String;)V

    throw v16
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_0
    const/16 v16, 0x0

    :catch_1
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to parse type \'ULong\' for input \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x6

    invoke-static {v1, v2, v3, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v16
.end method

.method public final j(LCx;)I
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final p()I
    .locals 5

    iget-object v0, p0, Lqm;->g:Loz;

    invoke-virtual {v0}, Loz;->j()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, LfG;->s0(Ljava/lang/String;)LfC;

    move-result-object v3

    if-eqz v3, :cond_0

    iget v0, v3, LfC;->a:I

    return v0

    :cond_0
    invoke-static {v1}, LAz;->G(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse type \'UInt\' for input \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v0, v1, v3, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v2
.end method

.method public final t()B
    .locals 5

    iget-object v0, p0, Lqm;->g:Loz;

    invoke-virtual {v0}, Loz;->j()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, LfG;->s0(Ljava/lang/String;)LfC;

    move-result-object v3

    if-eqz v3, :cond_1

    iget v3, v3, LfC;->a:I

    const/16 v4, 0xff

    invoke-static {v3, v4}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v4

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    int-to-byte v3, v3

    new-instance v4, LaC;

    invoke-direct {v4, v3}, LaC;-><init>(B)V

    goto :goto_1

    :cond_1
    :goto_0
    move-object v4, v2

    :goto_1
    if-eqz v4, :cond_2

    iget-byte v0, v4, LaC;->a:B

    return v0

    :cond_2
    invoke-static {v1}, LAz;->G(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse type \'UByte\' for input \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v0, v1, v3, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v2
.end method

.method public final x()S
    .locals 5

    iget-object v0, p0, Lqm;->g:Loz;

    invoke-virtual {v0}, Loz;->j()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, LfG;->s0(Ljava/lang/String;)LfC;

    move-result-object v3

    if-eqz v3, :cond_1

    iget v3, v3, LfC;->a:I

    const v4, 0xffff

    invoke-static {v3, v4}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v4

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    int-to-short v3, v3

    new-instance v4, LpC;

    invoke-direct {v4, v3}, LpC;-><init>(S)V

    goto :goto_1

    :cond_1
    :goto_0
    move-object v4, v2

    :goto_1
    if-eqz v4, :cond_2

    iget-short v0, v4, LpC;->a:S

    return v0

    :cond_2
    invoke-static {v1}, LAz;->G(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse type \'UShort\' for input \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v0, v1, v3, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v2
.end method
