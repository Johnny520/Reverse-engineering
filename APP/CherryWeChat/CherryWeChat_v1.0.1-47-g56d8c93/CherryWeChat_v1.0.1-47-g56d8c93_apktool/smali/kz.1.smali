.class public final Lkz;
.super LfG;
.source ""

# interfaces
.implements LJc;
.implements LVa;


# instance fields
.field public final g:Lmm;

.field public final h:I

.field public final i:Loz;

.field public j:I

.field public final k:Lpm;

.field public final l:Lum;


# direct methods
.method public constructor <init>(Lmm;ILoz;LCx;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LfG;-><init>(I)V

    iput-object p1, p0, Lkz;->g:Lmm;

    iput p2, p0, Lkz;->h:I

    iput-object p3, p0, Lkz;->i:Loz;

    const/4 p2, -0x1

    iput p2, p0, Lkz;->j:I

    iget-object p1, p1, Lmm;->a:Lpm;

    iput-object p1, p0, Lkz;->k:Lpm;

    iget-boolean p1, p1, Lpm;->c:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lum;

    invoke-direct {p1, p4}, Lum;-><init>(LCx;)V

    :goto_0
    iput-object p1, p0, Lkz;->l:Lum;

    return-void
.end method


# virtual methods
.method public final A0()Lkotlinx/serialization/json/b;
    .locals 3

    new-instance v0, Ln;

    iget-object v1, p0, Lkz;->g:Lmm;

    iget-object v1, v1, Lmm;->a:Lpm;

    iget-object v2, p0, Lkz;->i:Loz;

    invoke-direct {v0, v1, v2}, Ln;-><init>(Lpm;Loz;)V

    invoke-virtual {v0}, Ln;->b()Lkotlinx/serialization/json/b;

    move-result-object v0

    return-object v0
.end method

.method public final B(LCx;)LVa;
    .locals 12

    invoke-interface {p1}, LCx;->c()LfG;

    move-result-object v0

    instance-of v1, v0, LUt;

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x1

    iget-object v6, p0, Lkz;->g:Lmm;

    const/4 v7, 0x2

    if-eqz v1, :cond_0

    move v0, v4

    goto :goto_1

    :cond_0
    sget-object v1, LCz;->h:LCz;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move v0, v7

    goto :goto_1

    :cond_1
    sget-object v1, LCz;->i:LCz;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1, v3}, LCx;->j(I)LCx;

    move-result-object v0

    iget-object v1, v6, Lmm;->b:Lhw;

    invoke-static {v0, v1}, LGu;->b(LCx;Lhw;)LCx;

    move-result-object v0

    invoke-interface {v0}, LCx;->c()LfG;

    move-result-object v1

    instance-of v8, v1, Lnu;

    if-nez v8, :cond_3

    sget-object v8, LFx;->h:LFx;

    invoke-static {v1, v8}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lcr;->a(LCx;)Lxm;

    move-result-object p1

    throw p1

    :cond_3
    :goto_0
    move v0, v2

    goto :goto_1

    :cond_4
    move v0, v5

    :goto_1
    iget-object v1, p0, Lkz;->i:Loz;

    iget-object v8, v1, Loz;->b:LL3;

    iget v9, v8, LL3;->b:I

    add-int/2addr v9, v5

    iput v9, v8, LL3;->b:I

    iget-object v10, v8, LL3;->c:Ljava/lang/Object;

    check-cast v10, [Ljava/lang/Object;

    array-length v11, v10

    if-ne v9, v11, :cond_5

    mul-int/lit8 v11, v9, 0x2

    invoke-static {v10, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v8, LL3;->c:Ljava/lang/Object;

    iget-object v10, v8, LL3;->d:Ljava/lang/Object;

    check-cast v10, [I

    invoke-static {v10, v11}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v10

    iput-object v10, v8, LL3;->d:Ljava/lang/Object;

    :cond_5
    iget-object v8, v8, LL3;->c:Ljava/lang/Object;

    check-cast v8, [Ljava/lang/Object;

    aput-object p1, v8, v9

    const/4 v8, 0x1

    const/16 v9, 0x7b

    if-eq v0, v8, :cond_8

    const/4 v8, 0x2

    const/16 v10, 0x5b

    if-eq v0, v8, :cond_6

    const/4 v8, 0x3

    if-eq v0, v8, :cond_8

    const/4 v8, 0x4

    if-ne v0, v8, :cond_7

    :cond_6
    move v9, v10

    goto :goto_2

    :cond_7
    const/4 p1, 0x0

    throw p1

    :cond_8
    :goto_2
    invoke-virtual {v1, v9}, Loz;->g(C)V

    invoke-virtual {v1}, Loz;->p()B

    move-result v8

    if-eq v8, v4, :cond_b

    invoke-static {v0}, LEy;->v(I)I

    move-result v3

    if-eq v3, v5, :cond_a

    if-eq v3, v7, :cond_a

    if-eq v3, v2, :cond_a

    iget v2, p0, Lkz;->h:I

    if-ne v2, v0, :cond_9

    iget-object v2, v6, Lmm;->a:Lpm;

    iget-boolean v2, v2, Lpm;->c:Z

    if-eqz v2, :cond_9

    return-object p0

    :cond_9
    new-instance v2, Lkz;

    invoke-direct {v2, v6, v0, v1, p1}, Lkz;-><init>(Lmm;ILoz;LCx;)V

    return-object v2

    :cond_a
    new-instance v2, Lkz;

    invoke-direct {v2, v6, v0, v1, p1}, Lkz;-><init>(Lmm;ILoz;LCx;)V

    return-object v2

    :cond_b
    const-string p1, "Unexpected leading comma"

    const/4 v0, 0x6

    invoke-static {v1, p1, v3, v0}, Loz;->m(Loz;Ljava/lang/String;II)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final D()D
    .locals 6

    iget-object v0, p0, Lkz;->i:Loz;

    invoke-virtual {v0}, Loz;->j()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    move-result v1

    if-nez v1, :cond_0

    return-wide v4

    :cond_0
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unexpected special floating-point value "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". By default, non-finite floating point values are prohibited because they do not conform JSON specification"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x2

    invoke-static {v0, v1, v3, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v2

    :catch_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to parse type \'double\' for input \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    invoke-static {v0, v1, v3, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v2
.end method

.method public final a()J
    .locals 2

    iget-object v0, p0, Lkz;->i:Loz;

    invoke-virtual {v0}, Loz;->h()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e()Z
    .locals 12

    iget-object v0, p0, Lkz;->i:Loz;

    invoke-virtual {v0}, Loz;->r()I

    move-result v1

    iget-object v2, v0, Loz;->e:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const-string v4, "EOF"

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    if-eq v1, v3, :cond_7

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v8, 0x22

    const/4 v9, 0x1

    if-ne v3, v8, :cond_0

    add-int/lit8 v1, v1, 0x1

    move v3, v9

    goto :goto_0

    :cond_0
    move v3, v7

    :goto_0
    invoke-virtual {v0, v1}, Loz;->q(I)I

    move-result v1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v10

    if-ge v1, v10, :cond_6

    const/4 v10, -0x1

    if-eq v1, v10, :cond_6

    add-int/lit8 v10, v1, 0x1

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    or-int/lit8 v1, v1, 0x20

    const/16 v11, 0x66

    if-eq v1, v11, :cond_2

    const/16 v11, 0x74

    if-ne v1, v11, :cond_1

    const-string v1, "rue"

    invoke-virtual {v0, v10, v1}, Loz;->c(ILjava/lang/String;)V

    move v1, v9

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected valid boolean literal prefix, but had \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Loz;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v7, v6}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v5

    :cond_2
    const-string v1, "alse"

    invoke-virtual {v0, v10, v1}, Loz;->c(ILjava/lang/String;)V

    move v1, v7

    :goto_1
    if-eqz v3, :cond_5

    iget v3, v0, Loz;->a:I

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v10

    if-eq v3, v10, :cond_4

    iget v3, v0, Loz;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v8, :cond_3

    iget v2, v0, Loz;->a:I

    add-int/2addr v2, v9

    iput v2, v0, Loz;->a:I

    return v1

    :cond_3
    const-string v1, "Expected closing quotation mark"

    invoke-static {v0, v1, v7, v6}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v5

    :cond_4
    invoke-static {v0, v4, v7, v6}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v5

    :cond_5
    return v1

    :cond_6
    invoke-static {v0, v4, v7, v6}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v5

    :cond_7
    invoke-static {v0, v4, v7, v6}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v5
.end method

.method public final f()Z
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lkz;->l:Lum;

    if-eqz v1, :cond_0

    iget-boolean v1, v1, Lum;->b:Z

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    if-nez v1, :cond_1

    iget-object v1, p0, Lkz;->i:Loz;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Loz;->t(Z)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    return v0
.end method

.method public final g()C
    .locals 5

    iget-object v0, p0, Lkz;->i:Loz;

    invoke-virtual {v0}, Loz;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected single char, but got \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v0, v1, v4, v2}, Loz;->m(Loz;Ljava/lang/String;II)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final h(LQm;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    instance-of v0, p1, LD;

    if-nez v0, :cond_0

    invoke-interface {p1, p0}, LQm;->deserialize(LJc;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, LEy;->o(Ljava/lang/Object;)V
    :try_end_0
    .catch LUr; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    throw p1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "at path"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    throw p1

    :cond_1
    new-instance v0, LUr;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at path: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lkz;->i:Loz;

    iget-object v2, v2, Loz;->b:LL3;

    invoke-virtual {v2}, LL3;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, LUr;->a:Ljava/util/List;

    invoke-direct {v0, v2, v1, p1}, LUr;-><init>(Ljava/util/List;Ljava/lang/String;LUr;)V

    throw v0
.end method

.method public final j(LCx;)I
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lkz;->i:Loz;

    iget-object v3, v2, Loz;->b:LL3;

    iget-object v4, v2, Loz;->e:Ljava/lang/String;

    iget v5, v0, Lkz;->h:I

    invoke-static {v5}, LEy;->v(I)I

    move-result v6

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/16 v9, 0x3a

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, -0x1

    if-eqz v6, :cond_e

    const/4 v1, 0x2

    if-eq v6, v1, :cond_4

    invoke-virtual {v2}, Loz;->s()Z

    move-result v1

    invoke-virtual {v2}, Loz;->b()Z

    move-result v4

    if-eqz v4, :cond_2

    iget v4, v0, Lkz;->j:I

    if-eq v4, v12, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Expected end of the array or comma"

    invoke-static {v2, v1, v10, v7}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v8

    :cond_1
    :goto_0
    add-int/lit8 v12, v4, 0x1

    iput v12, v0, Lkz;->j:I

    goto/16 :goto_17

    :cond_2
    if-nez v1, :cond_3

    goto/16 :goto_17

    :cond_3
    const-string v1, "array"

    invoke-static {v2, v1}, Lcr;->E(Loz;Ljava/lang/String;)V

    throw v8

    :cond_4
    iget v1, v0, Lkz;->j:I

    rem-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_5

    move v4, v11

    goto :goto_1

    :cond_5
    move v4, v10

    :goto_1
    if-eqz v4, :cond_6

    if-eq v1, v12, :cond_7

    invoke-virtual {v2}, Loz;->s()Z

    move-result v10

    goto :goto_2

    :cond_6
    invoke-virtual {v2, v9}, Loz;->g(C)V

    :cond_7
    :goto_2
    invoke-virtual {v2}, Loz;->b()Z

    move-result v1

    if-eqz v1, :cond_c

    if-eqz v4, :cond_b

    iget v1, v0, Lkz;->j:I

    const/4 v4, 0x4

    if-ne v1, v12, :cond_9

    iget v1, v2, Loz;->a:I

    if-nez v10, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "Unexpected leading comma"

    invoke-static {v2, v3, v1, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v8

    :cond_9
    iget v1, v2, Loz;->a:I

    if-eqz v10, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "Expected comma after the key-value pair"

    invoke-static {v2, v3, v1, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v8

    :cond_b
    :goto_3
    iget v1, v0, Lkz;->j:I

    add-int/lit8 v12, v1, 0x1

    iput v12, v0, Lkz;->j:I

    goto/16 :goto_17

    :cond_c
    if-nez v10, :cond_d

    goto/16 :goto_17

    :cond_d
    invoke-static {v2}, Lcr;->F(Loz;)V

    throw v8

    :cond_e
    invoke-virtual {v2}, Loz;->s()Z

    move-result v6

    :goto_4
    invoke-virtual {v2}, Loz;->b()Z

    move-result v13

    move-object/from16 v16, v8

    iget-object v8, v0, Lkz;->l:Lum;

    if-eqz v13, :cond_28

    iget-object v6, v0, Lkz;->k:Lpm;

    iget-boolean v13, v6, Lpm;->b:Z

    if-eqz v13, :cond_f

    invoke-virtual {v2}, Loz;->k()Ljava/lang/String;

    move-result-object v17

    :goto_5
    move-object/from16 v12, v17

    goto :goto_6

    :cond_f
    invoke-virtual {v2}, Loz;->d()Ljava/lang/String;

    move-result-object v17

    goto :goto_5

    :goto_6
    invoke-virtual {v2, v9}, Loz;->g(C)V

    iget-object v9, v0, Lkz;->g:Lmm;

    const-wide/16 v18, 0x1

    invoke-static {v1, v9, v12}, LTB;->n(LCx;Lmm;Ljava/lang/String;)I

    move-result v15

    const/4 v7, -0x3

    if-eq v15, v7, :cond_1b

    iget-boolean v14, v6, Lpm;->e:Z

    if-eqz v14, :cond_18

    invoke-interface {v1, v15}, LCx;->k(I)Z

    move-result v14

    invoke-interface {v1, v15}, LCx;->j(I)LCx;

    move-result-object v7

    if-eqz v14, :cond_10

    invoke-interface {v7}, LCx;->h()Z

    move-result v20

    if-nez v20, :cond_10

    invoke-virtual {v2, v11}, Loz;->t(Z)Z

    move-result v20

    if-eqz v20, :cond_10

    goto :goto_c

    :cond_10
    invoke-interface {v7}, LCx;->c()LfG;

    move-result-object v11

    sget-object v10, LFx;->h:LFx;

    invoke-static {v11, v10}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-interface {v7}, LCx;->h()Z

    move-result v10

    if-eqz v10, :cond_11

    const/4 v10, 0x0

    invoke-virtual {v2, v10}, Loz;->t(Z)Z

    move-result v11

    if-eqz v11, :cond_11

    goto :goto_d

    :cond_11
    invoke-virtual {v2}, Loz;->p()B

    move-result v10

    if-eqz v13, :cond_13

    const/4 v11, 0x1

    if-eq v10, v11, :cond_12

    if-eqz v10, :cond_12

    goto :goto_7

    :cond_12
    invoke-virtual {v2}, Loz;->j()Ljava/lang/String;

    move-result-object v10

    goto :goto_8

    :cond_13
    const/4 v11, 0x1

    if-eq v10, v11, :cond_14

    :goto_7
    move-object/from16 v10, v16

    goto :goto_9

    :cond_14
    invoke-virtual {v2}, Loz;->i()Ljava/lang/String;

    move-result-object v10

    :goto_8
    iput-object v10, v2, Loz;->c:Ljava/lang/String;

    :goto_9
    if-nez v10, :cond_15

    goto :goto_d

    :cond_15
    invoke-static {v7, v9, v10}, LTB;->n(LCx;Lmm;Ljava/lang/String;)I

    move-result v10

    iget-object v9, v9, Lmm;->a:Lpm;

    iget-boolean v9, v9, Lpm;->c:Z

    if-nez v9, :cond_16

    invoke-interface {v7}, LCx;->h()Z

    move-result v7

    if-eqz v7, :cond_16

    const/4 v7, 0x1

    :goto_a
    const/4 v9, -0x3

    goto :goto_b

    :cond_16
    const/4 v7, 0x0

    goto :goto_a

    :goto_b
    if-ne v10, v9, :cond_18

    if-nez v14, :cond_17

    if-eqz v7, :cond_18

    :cond_17
    invoke-virtual {v2}, Loz;->i()Ljava/lang/String;

    :goto_c
    invoke-virtual {v2}, Loz;->s()Z

    move-result v7

    const/4 v8, 0x0

    goto :goto_f

    :cond_18
    :goto_d
    if-eqz v8, :cond_19

    iget-object v1, v8, Lum;->a:Lhf;

    const/16 v2, 0x40

    if-ge v15, v2, :cond_1a

    iget-wide v6, v1, Lhf;->c:J

    shl-long v8, v18, v15

    or-long/2addr v6, v8

    iput-wide v6, v1, Lhf;->c:J

    :cond_19
    :goto_e
    move v12, v15

    goto/16 :goto_17

    :cond_1a
    ushr-int/lit8 v2, v15, 0x6

    const/16 v20, 0x1

    add-int/lit8 v2, v2, -0x1

    and-int/lit8 v4, v15, 0x3f

    iget-object v1, v1, Lhf;->d:[J

    aget-wide v6, v1, v2

    shl-long v8, v18, v4

    or-long/2addr v6, v8

    aput-wide v6, v1, v2

    goto :goto_e

    :cond_1b
    const/4 v7, 0x0

    const/4 v8, 0x1

    :goto_f
    if-eqz v8, :cond_27

    iget-boolean v6, v6, Lpm;->a:Z

    if-eqz v6, :cond_26

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Loz;->p()B

    move-result v7

    const/16 v8, 0x8

    if-eq v7, v8, :cond_1c

    const/4 v9, 0x6

    if-eq v7, v9, :cond_1c

    invoke-virtual {v2}, Loz;->j()Ljava/lang/String;

    const/4 v11, 0x1

    goto/16 :goto_13

    :cond_1c
    :goto_10
    invoke-virtual {v2}, Loz;->p()B

    move-result v7

    const/4 v11, 0x1

    if-ne v7, v11, :cond_1e

    if-eqz v13, :cond_1d

    invoke-virtual {v2}, Loz;->j()Ljava/lang/String;

    goto :goto_10

    :cond_1d
    invoke-virtual {v2}, Loz;->d()Ljava/lang/String;

    goto :goto_10

    :cond_1e
    if-eq v7, v8, :cond_25

    const/4 v9, 0x6

    if-ne v7, v9, :cond_1f

    goto :goto_11

    :cond_1f
    const/16 v9, 0x9

    if-ne v7, v9, :cond_21

    invoke-static {v6}, Lra;->l0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->byteValue()B

    move-result v7

    if-ne v7, v8, :cond_20

    invoke-static {v6}, Lxa;->f0(Ljava/util/ArrayList;)V

    goto :goto_12

    :cond_20
    iget v1, v2, Loz;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "found ] instead of } at path: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v4, v2}, Lcr;->b(ILjava/lang/CharSequence;Ljava/lang/String;)Lrm;

    move-result-object v1

    throw v1

    :cond_21
    const/4 v9, 0x7

    if-ne v7, v9, :cond_23

    invoke-static {v6}, Lra;->l0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->byteValue()B

    move-result v7

    const/4 v9, 0x6

    if-ne v7, v9, :cond_22

    invoke-static {v6}, Lxa;->f0(Ljava/util/ArrayList;)V

    goto :goto_12

    :cond_22
    iget v1, v2, Loz;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "found } instead of ] at path: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v4, v2}, Lcr;->b(ILjava/lang/CharSequence;Ljava/lang/String;)Lrm;

    move-result-object v1

    throw v1

    :cond_23
    const/16 v9, 0xa

    if-eq v7, v9, :cond_24

    goto :goto_12

    :cond_24
    const-string v1, "Unexpected end of input due to malformed JSON during ignoring unknown keys"

    const/4 v9, 0x6

    const/4 v10, 0x0

    invoke-static {v2, v1, v10, v9}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v16

    :cond_25
    :goto_11
    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_12
    invoke-virtual {v2}, Loz;->e()B

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-nez v7, :cond_1c

    :goto_13
    invoke-virtual {v2}, Loz;->s()Z

    move-result v6

    move-object/from16 v8, v16

    const/4 v7, 0x6

    const/16 v9, 0x3a

    const/4 v10, 0x0

    :goto_14
    const/4 v12, -0x1

    goto/16 :goto_4

    :cond_26
    iget v1, v2, Loz;->a:I

    const/4 v10, 0x0

    invoke-virtual {v4, v10, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v9, 0x6

    invoke-static {v9, v1, v12}, Ltz;->U(ILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Encountered an unknown key \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x27

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Use \'ignoreUnknownKeys = true\' in \'Json {}\' builder to ignore unknown keys."

    invoke-virtual {v2, v1, v3, v4}, Loz;->l(ILjava/lang/String;Ljava/lang/String;)V

    throw v16

    :cond_27
    move v6, v7

    move-object/from16 v8, v16

    const/4 v7, 0x6

    const/16 v9, 0x3a

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_14

    :cond_28
    const-wide/16 v18, 0x1

    if-nez v6, :cond_2f

    if-eqz v8, :cond_2d

    iget-object v1, v8, Lum;->a:Lhf;

    iget-object v2, v1, Lhf;->b:Ltm;

    iget-object v4, v1, Lhf;->a:LCx;

    invoke-interface {v4}, LCx;->d()I

    move-result v6

    :cond_29
    iget-wide v7, v1, Lhf;->c:J

    const-wide/16 v11, -0x1

    cmp-long v9, v7, v11

    if-eqz v9, :cond_2a

    not-long v7, v7

    invoke-static {v7, v8}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v7

    iget-wide v8, v1, Lhf;->c:J

    shl-long v11, v18, v7

    or-long/2addr v8, v11

    iput-wide v8, v1, Lhf;->c:J

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v4, v8}, Ltm;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_29

    move v12, v7

    goto :goto_17

    :cond_2a
    const/16 v7, 0x40

    if-le v6, v7, :cond_2d

    iget-object v1, v1, Lhf;->d:[J

    array-length v6, v1

    :goto_15
    if-ge v10, v6, :cond_2d

    add-int/lit8 v7, v10, 0x1

    mul-int/lit8 v8, v7, 0x40

    aget-wide v13, v1, v10

    :goto_16
    cmp-long v9, v13, v11

    if-eqz v9, :cond_2c

    not-long v11, v13

    invoke-static {v11, v12}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v9

    shl-long v11, v18, v9

    or-long/2addr v13, v11

    add-int/2addr v9, v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v2, v4, v11}, Ltm;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_2b

    aput-wide v13, v1, v10

    move v12, v9

    goto :goto_17

    :cond_2b
    const-wide/16 v11, -0x1

    goto :goto_16

    :cond_2c
    aput-wide v13, v1, v10

    move v10, v7

    const-wide/16 v11, -0x1

    goto :goto_15

    :cond_2d
    const/4 v12, -0x1

    :goto_17
    const/4 v1, 0x3

    if-eq v5, v1, :cond_2e

    iget-object v1, v3, LL3;->d:Ljava/lang/Object;

    check-cast v1, [I

    iget v2, v3, LL3;->b:I

    aput v12, v1, v2

    :cond_2e
    return v12

    :cond_2f
    invoke-static {v2}, Lcr;->F(Loz;)V

    throw v16
.end method

.method public final p()I
    .locals 6

    iget-object v0, p0, Lkz;->i:Loz;

    invoke-virtual {v0}, Loz;->h()J

    move-result-wide v1

    long-to-int v3, v1

    int-to-long v4, v3

    cmp-long v4, v1, v4

    if-nez v4, :cond_0

    return v3

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse int for input \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v3}, Loz;->m(Loz;Ljava/lang/String;II)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final r(LCx;)V
    .locals 5

    iget-object v0, p0, Lkz;->g:Lmm;

    iget-object v0, v0, Lmm;->a:Lpm;

    iget-boolean v0, v0, Lpm;->a:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    invoke-interface {p1}, LCx;->d()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0, p1}, Lkz;->j(LCx;)I

    move-result v0

    if-ne v0, v1, :cond_0

    :cond_1
    iget-object p1, p0, Lkz;->i:Loz;

    invoke-virtual {p1}, Loz;->s()Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v0, 0x1

    iget v2, p0, Lkz;->h:I

    const/16 v3, 0x7d

    if-eq v2, v0, :cond_4

    const/4 v0, 0x2

    const/16 v4, 0x5d

    if-eq v2, v0, :cond_2

    const/4 v0, 0x3

    if-eq v2, v0, :cond_4

    const/4 v0, 0x4

    if-ne v2, v0, :cond_3

    :cond_2
    move v3, v4

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    throw p1

    :cond_4
    :goto_0
    invoke-virtual {p1, v3}, Loz;->g(C)V

    iget-object p1, p1, Loz;->b:LL3;

    iget v0, p1, LL3;->b:I

    iget-object v2, p1, LL3;->d:Ljava/lang/Object;

    check-cast v2, [I

    aget v3, v2, v0

    const/4 v4, -0x2

    if-ne v3, v4, :cond_5

    aput v1, v2, v0

    add-int/2addr v0, v1

    iput v0, p1, LL3;->b:I

    :cond_5
    iget v0, p1, LL3;->b:I

    if-eq v0, v1, :cond_6

    add-int/2addr v0, v1

    iput v0, p1, LL3;->b:I

    :cond_6
    return-void

    :cond_7
    const-string v0, ""

    invoke-static {p1, v0}, Lcr;->E(Loz;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final t()B
    .locals 6

    iget-object v0, p0, Lkz;->i:Loz;

    invoke-virtual {v0}, Loz;->h()J

    move-result-wide v1

    long-to-int v3, v1

    int-to-byte v3, v3

    int-to-long v4, v3

    cmp-long v4, v1, v4

    if-nez v4, :cond_0

    return v3

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse byte for input \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v3}, Loz;->m(Loz;Ljava/lang/String;II)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final u(LCx;)LJc;
    .locals 1

    sget-object v0, Llz;->a:Ljava/util/Set;

    invoke-interface {p1}, LCx;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Llz;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lqm;

    iget-object v0, p0, Lkz;->i:Loz;

    invoke-direct {p1, v0}, Lqm;-><init>(Loz;)V

    return-object p1

    :cond_0
    return-object p0
.end method

.method public final v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object p1, p0, Lkz;->i:Loz;

    iget-object p1, p1, Loz;->b:LL3;

    iget p4, p0, Lkz;->h:I

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-ne p4, v0, :cond_0

    and-int/2addr p2, v1

    if-nez p2, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 p4, -0x2

    if-eqz p2, :cond_1

    iget-object v0, p1, LL3;->d:Ljava/lang/Object;

    check-cast v0, [I

    iget v2, p1, LL3;->b:I

    aget v0, v0, v2

    if-ne v0, p4, :cond_1

    iget-object v0, p1, LL3;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    sget-object v3, Lgf;->g:Lgf;

    aput-object v3, v0, v2

    :cond_1
    invoke-virtual {p0, p3}, Lkz;->h(LQm;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p2, :cond_3

    iget-object p2, p1, LL3;->d:Ljava/lang/Object;

    check-cast p2, [I

    iget v0, p1, LL3;->b:I

    aget p2, p2, v0

    if-eq p2, p4, :cond_2

    add-int/2addr v0, v1

    iput v0, p1, LL3;->b:I

    iget-object p2, p1, LL3;->c:Ljava/lang/Object;

    check-cast p2, [Ljava/lang/Object;

    array-length v1, p2

    if-ne v0, v1, :cond_2

    mul-int/lit8 v0, v0, 0x2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p1, LL3;->c:Ljava/lang/Object;

    iget-object p2, p1, LL3;->d:Ljava/lang/Object;

    check-cast p2, [I

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p2

    iput-object p2, p1, LL3;->d:Ljava/lang/Object;

    :cond_2
    iget-object p2, p1, LL3;->c:Ljava/lang/Object;

    check-cast p2, [Ljava/lang/Object;

    iget v0, p1, LL3;->b:I

    aput-object p3, p2, v0

    iget-object p1, p1, LL3;->d:Ljava/lang/Object;

    check-cast p1, [I

    aput p4, p1, v0

    :cond_3
    return-object p3
.end method

.method public final x()S
    .locals 6

    iget-object v0, p0, Lkz;->i:Loz;

    invoke-virtual {v0}, Loz;->h()J

    move-result-wide v1

    long-to-int v3, v1

    int-to-short v3, v3

    int-to-long v4, v3

    cmp-long v4, v1, v4

    if-nez v4, :cond_0

    return v3

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse short for input \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v3}, Loz;->m(Loz;Ljava/lang/String;II)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final y()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lkz;->k:Lpm;

    iget-boolean v0, v0, Lpm;->b:Z

    iget-object v1, p0, Lkz;->i:Loz;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Loz;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Loz;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z()F
    .locals 6

    iget-object v0, p0, Lkz;->i:Loz;

    invoke-virtual {v0}, Loz;->j()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_0

    return v1

    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unexpected special floating-point value "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". By default, non-finite floating point values are prohibited because they do not conform JSON specification"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x2

    invoke-static {v0, v1, v3, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v2

    :catch_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to parse type \'float\' for input \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    invoke-static {v0, v1, v3, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v2
.end method
