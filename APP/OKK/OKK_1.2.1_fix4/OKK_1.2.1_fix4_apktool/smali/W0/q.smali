.class public abstract LW0/q;
.super LW0/p;
.source "SourceFile"


# direct methods
.method public static A0(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-static {v0}, LU/S;->i(I)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/4 v5, 0x1

    const/16 v6, 0x30

    if-ge v4, v6, :cond_1

    const/4 v6, -0x1

    goto :goto_0

    :cond_1
    if-ne v4, v6, :cond_2

    move v6, v3

    goto :goto_0

    :cond_2
    move v6, v5

    :goto_0
    const v7, -0x7fffffff

    if-gez v6, :cond_5

    if-ne v1, v5, :cond_3

    goto :goto_4

    :cond_3
    const/16 v6, 0x2d

    if-ne v4, v6, :cond_4

    const/high16 v7, -0x80000000

    move v4, v5

    goto :goto_1

    :cond_4
    const/16 v6, 0x2b

    if-ne v4, v6, :cond_b

    move v4, v3

    goto :goto_1

    :cond_5
    move v4, v3

    move v5, v4

    :goto_1
    const v6, -0x38e38e3

    move v8, v6

    :goto_2
    if-ge v5, v1, :cond_9

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9, v0}, Ljava/lang/Character;->digit(II)I

    move-result v9

    if-gez v9, :cond_6

    goto :goto_4

    :cond_6
    if-ge v3, v8, :cond_7

    if-ne v8, v6, :cond_b

    div-int/lit8 v8, v7, 0xa

    if-ge v3, v8, :cond_7

    goto :goto_4

    :cond_7
    mul-int/lit8 v3, v3, 0xa

    add-int v10, v7, v9

    if-ge v3, v10, :cond_8

    goto :goto_4

    :cond_8
    sub-int/2addr v3, v9

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_9
    if-eqz v4, :cond_a

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_3
    move-object v2, p0

    goto :goto_4

    :cond_a
    neg-int p0, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_3

    :cond_b
    :goto_4
    return-object v2
.end method

.method public static B0(Ljava/lang/String;)Ljava/lang/Long;
    .locals 19

    move-object/from16 v0, p0

    const/16 v1, 0xa

    invoke-static {v1}, LU/S;->i(I)V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/4 v6, 0x1

    const/16 v7, 0x30

    if-ge v5, v7, :cond_1

    const/4 v7, -0x1

    goto :goto_0

    :cond_1
    if-ne v5, v7, :cond_2

    move v7, v4

    goto :goto_0

    :cond_2
    move v7, v6

    :goto_0
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    if-gez v7, :cond_5

    if-ne v2, v6, :cond_3

    goto/16 :goto_4

    :cond_3
    const/16 v7, 0x2d

    if-ne v5, v7, :cond_4

    const-wide/high16 v8, -0x8000000000000000L

    move v4, v6

    goto :goto_1

    :cond_4
    const/16 v7, 0x2b

    if-ne v5, v7, :cond_b

    move/from16 v18, v6

    move v6, v4

    move/from16 v4, v18

    goto :goto_1

    :cond_5
    move v6, v4

    :goto_1
    const-wide v10, -0x38e38e38e38e38eL    # -2.772000429909333E291

    const-wide/16 v12, 0x0

    move-wide v14, v10

    :goto_2
    if-ge v4, v2, :cond_9

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5, v1}, Ljava/lang/Character;->digit(II)I

    move-result v5

    if-gez v5, :cond_6

    goto :goto_4

    :cond_6
    cmp-long v7, v12, v14

    if-gez v7, :cond_7

    cmp-long v7, v14, v10

    if-nez v7, :cond_b

    int-to-long v14, v1

    div-long v14, v8, v14

    cmp-long v7, v12, v14

    if-gez v7, :cond_7

    goto :goto_4

    :cond_7
    int-to-long v10, v1

    mul-long/2addr v12, v10

    int-to-long v10, v5

    add-long v16, v8, v10

    cmp-long v5, v12, v16

    if-gez v5, :cond_8

    goto :goto_4

    :cond_8
    sub-long/2addr v12, v10

    add-int/lit8 v4, v4, 0x1

    const-wide v10, -0x38e38e38e38e38eL    # -2.772000429909333E291

    goto :goto_2

    :cond_9
    if-eqz v6, :cond_a

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_3
    move-object v3, v0

    goto :goto_4

    :cond_a
    neg-long v0, v12

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_3

    :cond_b
    :goto_4
    return-object v3
.end method
