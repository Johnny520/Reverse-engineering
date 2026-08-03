.class public abstract LAz;
.super Lzz;
.source ""


# direct methods
.method public static final G(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid number format: \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x27

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static H(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 9

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    invoke-static {v2, v3}, LNj;->g(II)I

    move-result v3

    const v4, -0x7fffffff

    if-gez v3, :cond_4

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    goto :goto_2

    :cond_1
    const/16 v5, 0x2b

    if-eq v2, v5, :cond_3

    const/16 v4, 0x2d

    if-eq v2, v4, :cond_2

    goto :goto_2

    :cond_2
    const/high16 v4, -0x80000000

    move v2, v3

    goto :goto_0

    :cond_3
    move v2, v1

    goto :goto_0

    :cond_4
    move v2, v1

    move v3, v2

    :goto_0
    const v5, -0x38e38e3

    move v6, v5

    :goto_1
    if-ge v3, v0, :cond_9

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0xa

    invoke-static {v7, v8}, Ljava/lang/Character;->digit(II)I

    move-result v7

    if-gez v7, :cond_5

    goto :goto_2

    :cond_5
    if-ge v1, v6, :cond_6

    if-ne v6, v5, :cond_7

    div-int/lit8 v6, v4, 0xa

    if-ge v1, v6, :cond_6

    goto :goto_2

    :cond_6
    mul-int/lit8 v1, v1, 0xa

    add-int v8, v4, v7

    if-ge v1, v8, :cond_8

    :cond_7
    :goto_2
    const/4 p0, 0x0

    return-object p0

    :cond_8
    sub-int/2addr v1, v7

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_9
    if-eqz v2, :cond_a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_a
    neg-int p0, v1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static I(Ljava/lang/String;)Ljava/lang/Long;
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    invoke-static {v3, v4}, LNj;->g(II)I

    move-result v4

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-gez v4, :cond_4

    const/4 v4, 0x1

    if-ne v1, v4, :cond_1

    goto :goto_2

    :cond_1
    const/16 v7, 0x2b

    if-eq v3, v7, :cond_3

    const/16 v2, 0x2d

    if-eq v3, v2, :cond_2

    goto :goto_2

    :cond_2
    const-wide/high16 v5, -0x8000000000000000L

    move v2, v4

    goto :goto_0

    :cond_3
    move/from16 v17, v4

    move v4, v2

    move/from16 v2, v17

    goto :goto_0

    :cond_4
    move v4, v2

    :goto_0
    const-wide v7, -0x38e38e38e38e38eL    # -2.772000429909333E291

    const-wide/16 v9, 0x0

    move-wide v11, v7

    :goto_1
    if-ge v2, v1, :cond_9

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v13, 0xa

    invoke-static {v3, v13}, Ljava/lang/Character;->digit(II)I

    move-result v3

    if-gez v3, :cond_5

    goto :goto_2

    :cond_5
    cmp-long v14, v9, v11

    if-gez v14, :cond_6

    cmp-long v11, v11, v7

    if-nez v11, :cond_7

    int-to-long v11, v13

    div-long v11, v5, v11

    cmp-long v14, v9, v11

    if-gez v14, :cond_6

    goto :goto_2

    :cond_6
    int-to-long v13, v13

    mul-long/2addr v9, v13

    int-to-long v13, v3

    add-long v15, v5, v13

    cmp-long v3, v9, v15

    if-gez v3, :cond_8

    :cond_7
    :goto_2
    const/4 v0, 0x0

    return-object v0

    :cond_8
    sub-long/2addr v9, v13

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_9
    if-eqz v4, :cond_a

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_a
    neg-long v0, v9

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
