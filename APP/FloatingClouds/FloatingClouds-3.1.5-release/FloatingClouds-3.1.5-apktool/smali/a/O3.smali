.class public final La/O3;
.super La/hh;
.source "SourceFile"


# instance fields
.field public final f0:La/e2;

.field public final g0:La/U4;

.field public h0:La/e2$b;

.field public i0:Z

.field public final j0:La/B9;

.field public k0:I

.field public l0:I

.field public m0:I

.field public n0:I

.field public o0:[La/T2;

.field public p0:[La/T2;

.field public q0:I

.field public r0:Z

.field public s0:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, La/hh;-><init>()V

    new-instance v0, La/e2;

    invoke-direct {v0, p0}, La/e2;-><init>(La/O3;)V

    iput-object v0, p0, La/O3;->f0:La/e2;

    new-instance v0, La/U4;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, La/U4;->b:Z

    iput-boolean v1, v0, La/U4;->c:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, La/U4;->e:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, La/U4;->f:La/e2$b;

    new-instance v2, La/e2$a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, La/U4;->g:La/e2$a;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, La/U4;->h:Ljava/util/ArrayList;

    iput-object p0, v0, La/U4;->a:La/O3;

    iput-object p0, v0, La/U4;->d:La/O3;

    iput-object v0, p0, La/O3;->g0:La/U4;

    iput-object v1, p0, La/O3;->h0:La/e2$b;

    const/4 v0, 0x0

    iput-boolean v0, p0, La/O3;->i0:Z

    new-instance v1, La/B9;

    invoke-direct {v1}, La/B9;-><init>()V

    iput-object v1, p0, La/O3;->j0:La/B9;

    iput v0, p0, La/O3;->m0:I

    iput v0, p0, La/O3;->n0:I

    const/4 v1, 0x4

    new-array v2, v1, [La/T2;

    iput-object v2, p0, La/O3;->o0:[La/T2;

    new-array v1, v1, [La/T2;

    iput-object v1, p0, La/O3;->p0:[La/T2;

    const/16 v1, 0x107

    iput v1, p0, La/O3;->q0:I

    iput-boolean v0, p0, La/O3;->r0:Z

    iput-boolean v0, p0, La/O3;->s0:Z

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 21

    move-object/from16 v1, p0

    const/4 v2, 0x0

    iput v2, v1, La/N3;->P:I

    iput v2, v1, La/N3;->Q:I

    invoke-virtual {v1}, La/N3;->l()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v1}, La/N3;->i()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput-boolean v2, v1, La/O3;->r0:Z

    iput-boolean v2, v1, La/O3;->s0:Z

    iget v0, v1, La/O3;->q0:I

    and-int/lit8 v5, v0, 0x40

    const/4 v6, 0x1

    const/16 v7, 0x40

    if-ne v5, v7, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    move v5, v2

    :goto_0
    if-nez v5, :cond_2

    const/16 v5, 0x80

    and-int/2addr v0, v5

    if-ne v0, v5, :cond_1

    goto :goto_1

    :cond_1
    move v0, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v6

    :goto_2
    iget-object v5, v1, La/O3;->j0:La/B9;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-boolean v2, v5, La/B9;->f:Z

    iget v7, v1, La/O3;->q0:I

    if-eqz v7, :cond_3

    if-eqz v0, :cond_3

    iput-boolean v6, v5, La/B9;->f:Z

    :cond_3
    iget-object v7, v1, La/N3;->J:[La/N3$a;

    aget-object v8, v7, v6

    aget-object v9, v7, v2

    iget-object v10, v1, La/hh;->e0:Ljava/util/ArrayList;

    sget-object v11, La/N3$a;->b:La/N3$a;

    if-eq v9, v11, :cond_5

    if-ne v8, v11, :cond_4

    goto :goto_3

    :cond_4
    move v12, v2

    goto :goto_4

    :cond_5
    :goto_3
    move v12, v6

    :goto_4
    iput v2, v1, La/O3;->m0:I

    iput v2, v1, La/O3;->n0:I

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v13

    move v0, v2

    :goto_5
    if-ge v0, v13, :cond_7

    iget-object v14, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, La/N3;

    instance-of v15, v14, La/hh;

    if-eqz v15, :cond_6

    check-cast v14, La/hh;

    invoke-virtual {v14}, La/hh;->B()V

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_7
    move v0, v2

    move v15, v0

    move v14, v6

    :goto_6
    if-eqz v14, :cond_17

    move/from16 v16, v6

    add-int/lit8 v6, v0, 0x1

    :try_start_0
    invoke-virtual {v5}, La/B9;->r()V

    iput v2, v1, La/O3;->m0:I

    iput v2, v1, La/O3;->n0:I

    invoke-virtual {v1, v5}, La/N3;->f(La/B9;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move v0, v2

    :goto_7
    if-ge v0, v13, :cond_8

    move/from16 v17, v2

    :try_start_1
    iget-object v2, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/N3;

    invoke-virtual {v2, v5}, La/N3;->f(La/B9;)V

    add-int/lit8 v0, v0, 0x1

    move/from16 v2, v17

    goto :goto_7

    :catch_0
    move-exception v0

    goto :goto_b

    :cond_8
    move/from16 v17, v2

    invoke-virtual {v1, v5}, La/O3;->D(La/B9;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iget-object v0, v5, La/B9;->b:La/Hc;

    iget-boolean v2, v5, La/B9;->f:Z

    if-eqz v2, :cond_b

    move/from16 v2, v17

    :goto_8
    iget v14, v5, La/B9;->i:I

    if-ge v2, v14, :cond_a

    iget-object v14, v5, La/B9;->e:[La/K1;

    aget-object v14, v14, v2

    iget-boolean v14, v14, La/K1;->e:Z

    if-nez v14, :cond_9

    invoke-virtual {v5, v0}, La/B9;->o(La/Hc;)V

    goto :goto_a

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_a
    move/from16 v0, v17

    :goto_9
    iget v2, v5, La/B9;->i:I

    if-ge v0, v2, :cond_c

    iget-object v2, v5, La/B9;->e:[La/K1;

    aget-object v2, v2, v0

    iget-object v14, v2, La/K1;->a:La/le;

    iget v2, v2, La/K1;->b:F

    iput v2, v14, La/le;->e:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_b
    invoke-virtual {v5, v0}, La/B9;->o(La/Hc;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_c
    :goto_a
    move-object/from16 v18, v7

    move/from16 v19, v12

    move/from16 v14, v16

    goto :goto_c

    :catch_1
    move-exception v0

    move/from16 v14, v16

    goto :goto_b

    :catch_2
    move-exception v0

    move/from16 v17, v2

    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v18, v7

    new-instance v7, Ljava/lang/StringBuilder;

    move/from16 v19, v12

    const-string v12, "EXCEPTION : "

    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_c
    sget-object v0, La/ic;->a:[Z

    const/4 v2, 0x2

    if-eqz v14, :cond_d

    aput-boolean v17, v0, v2

    invoke-virtual {v1, v5}, La/N3;->A(La/B9;)V

    iget-object v7, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    move/from16 v12, v17

    :goto_d
    if-ge v12, v7, :cond_e

    iget-object v14, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, La/N3;

    invoke-virtual {v14, v5}, La/N3;->A(La/B9;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_d

    :cond_d
    invoke-virtual {v1, v5}, La/N3;->A(La/B9;)V

    move/from16 v7, v17

    :goto_e
    if-ge v7, v13, :cond_e

    iget-object v12, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/N3;

    invoke-virtual {v12, v5}, La/N3;->A(La/B9;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_e

    :cond_e
    if-eqz v19, :cond_11

    const/16 v7, 0x8

    if-ge v6, v7, :cond_11

    aget-boolean v0, v0, v2

    if-eqz v0, :cond_11

    move/from16 v0, v17

    move v2, v0

    move v7, v2

    :goto_f
    if-ge v0, v13, :cond_f

    iget-object v12, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/N3;

    iget v14, v12, La/N3;->P:I

    invoke-virtual {v12}, La/N3;->l()I

    move-result v20

    add-int v14, v20, v14

    invoke-static {v2, v14}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v14, v12, La/N3;->Q:I

    invoke-virtual {v12}, La/N3;->i()I

    move-result v12

    add-int/2addr v12, v14

    invoke-static {v7, v12}, Ljava/lang/Math;->max(II)I

    move-result v7

    add-int/lit8 v0, v0, 0x1

    goto :goto_f

    :cond_f
    iget v0, v1, La/N3;->S:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, v1, La/N3;->T:I

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-ne v9, v11, :cond_10

    invoke-virtual {v1}, La/N3;->l()I

    move-result v7

    if-ge v7, v0, :cond_10

    invoke-virtual {v1, v0}, La/N3;->y(I)V

    aput-object v11, v18, v17

    move/from16 v0, v16

    move v15, v0

    goto :goto_10

    :cond_10
    move/from16 v0, v17

    :goto_10
    if-ne v8, v11, :cond_12

    invoke-virtual {v1}, La/N3;->i()I

    move-result v7

    if-ge v7, v2, :cond_12

    invoke-virtual {v1, v2}, La/N3;->v(I)V

    aput-object v11, v18, v16

    move/from16 v0, v16

    move v15, v0

    goto :goto_11

    :cond_11
    move/from16 v0, v17

    :cond_12
    :goto_11
    iget v2, v1, La/N3;->S:I

    invoke-virtual {v1}, La/N3;->l()I

    move-result v7

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v1}, La/N3;->l()I

    move-result v7

    sget-object v12, La/N3$a;->a:La/N3$a;

    if-le v2, v7, :cond_13

    invoke-virtual {v1, v2}, La/N3;->y(I)V

    aput-object v12, v18, v17

    move/from16 v0, v16

    move v15, v0

    :cond_13
    iget v2, v1, La/N3;->T:I

    invoke-virtual {v1}, La/N3;->i()I

    move-result v7

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v1}, La/N3;->i()I

    move-result v7

    if-le v2, v7, :cond_14

    invoke-virtual {v1, v2}, La/N3;->v(I)V

    aput-object v12, v18, v16

    move/from16 v0, v16

    move v15, v0

    :cond_14
    if-nez v15, :cond_16

    aget-object v2, v18, v17

    if-ne v2, v11, :cond_15

    if-lez v3, :cond_15

    invoke-virtual {v1}, La/N3;->l()I

    move-result v2

    if-le v2, v3, :cond_15

    move/from16 v2, v16

    iput-boolean v2, v1, La/O3;->r0:Z

    aput-object v12, v18, v17

    invoke-virtual {v1, v3}, La/N3;->y(I)V

    move v0, v2

    move v15, v0

    goto :goto_12

    :cond_15
    move/from16 v2, v16

    :goto_12
    aget-object v7, v18, v2

    if-ne v7, v11, :cond_16

    if-lez v4, :cond_16

    invoke-virtual {v1}, La/N3;->i()I

    move-result v7

    if-le v7, v4, :cond_16

    iput-boolean v2, v1, La/O3;->s0:Z

    aput-object v12, v18, v2

    invoke-virtual {v1, v4}, La/N3;->v(I)V

    const/4 v14, 0x1

    const/4 v15, 0x1

    goto :goto_13

    :cond_16
    move v14, v0

    :goto_13
    move v0, v6

    move/from16 v2, v17

    move-object/from16 v7, v18

    move/from16 v12, v19

    const/4 v6, 0x1

    goto/16 :goto_6

    :cond_17
    move/from16 v17, v2

    move-object/from16 v18, v7

    iput-object v10, v1, La/hh;->e0:Ljava/util/ArrayList;

    if-eqz v15, :cond_18

    aput-object v9, v18, v17

    const/16 v16, 0x1

    aput-object v8, v18, v16

    :cond_18
    iget-object v0, v5, La/B9;->k:La/A2;

    invoke-virtual {v1, v0}, La/hh;->u(La/A2;)V

    return-void
.end method

.method public final C(La/N3;I)V
    .locals 5

    const/4 v0, 0x1

    if-nez p2, :cond_1

    iget p2, p0, La/O3;->m0:I

    add-int/2addr p2, v0

    iget-object v1, p0, La/O3;->p0:[La/T2;

    array-length v2, v1

    if-lt p2, v2, :cond_0

    array-length p2, v1

    mul-int/lit8 p2, p2, 0x2

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [La/T2;

    iput-object p2, p0, La/O3;->p0:[La/T2;

    :cond_0
    iget-object p2, p0, La/O3;->p0:[La/T2;

    iget v1, p0, La/O3;->m0:I

    new-instance v2, La/T2;

    iget-boolean v3, p0, La/O3;->i0:Z

    const/4 v4, 0x0

    invoke-direct {v2, p1, v4, v3}, La/T2;-><init>(La/N3;IZ)V

    aput-object v2, p2, v1

    add-int/2addr v1, v0

    iput v1, p0, La/O3;->m0:I

    return-void

    :cond_1
    if-ne p2, v0, :cond_3

    iget p2, p0, La/O3;->n0:I

    add-int/2addr p2, v0

    iget-object v1, p0, La/O3;->o0:[La/T2;

    array-length v2, v1

    if-lt p2, v2, :cond_2

    array-length p2, v1

    mul-int/lit8 p2, p2, 0x2

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [La/T2;

    iput-object p2, p0, La/O3;->o0:[La/T2;

    :cond_2
    iget-object p2, p0, La/O3;->o0:[La/T2;

    iget v1, p0, La/O3;->n0:I

    new-instance v2, La/T2;

    iget-boolean v3, p0, La/O3;->i0:Z

    invoke-direct {v2, p1, v0, v3}, La/T2;-><init>(La/N3;IZ)V

    aput-object v2, p2, v1

    add-int/2addr v1, v0

    iput v1, p0, La/O3;->n0:I

    :cond_3
    return-void
.end method

.method public final D(La/B9;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p0 .. p1}, La/N3;->a(La/B9;)V

    iget-object v2, v0, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    const/4 v6, 0x1

    if-ge v4, v2, :cond_1

    iget-object v7, v0, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/N3;

    iget-object v8, v7, La/N3;->I:[Z

    aput-boolean v3, v8, v3

    aput-boolean v3, v8, v6

    instance-of v7, v7, La/V1;

    if-eqz v7, :cond_0

    move v5, v6

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    if-eqz v5, :cond_7

    move v5, v3

    :goto_1
    if-ge v5, v2, :cond_7

    iget-object v7, v0, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/N3;

    instance-of v8, v7, La/V1;

    if-eqz v8, :cond_6

    check-cast v7, La/V1;

    move v8, v3

    :goto_2
    iget v9, v7, La/f8;->f0:I

    if-ge v8, v9, :cond_6

    iget-object v9, v7, La/f8;->e0:[La/N3;

    aget-object v9, v9, v8

    iget v10, v7, La/V1;->g0:I

    if-eqz v10, :cond_4

    if-ne v10, v6, :cond_2

    goto :goto_3

    :cond_2
    if-eq v10, v4, :cond_3

    const/4 v11, 0x3

    if-ne v10, v11, :cond_5

    :cond_3
    iget-object v9, v9, La/N3;->I:[Z

    aput-boolean v6, v9, v6

    goto :goto_4

    :cond_4
    :goto_3
    iget-object v9, v9, La/N3;->I:[Z

    aput-boolean v6, v9, v3

    :cond_5
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_7
    move v5, v3

    :goto_5
    if-ge v5, v2, :cond_a

    iget-object v7, v0, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/N3;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v8, v7, La/Yg;

    if-nez v8, :cond_8

    instance-of v8, v7, La/a8;

    if-eqz v8, :cond_9

    :cond_8
    invoke-virtual {v7, v1}, La/N3;->a(La/B9;)V

    :cond_9
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_a
    move v5, v3

    :goto_6
    if-ge v5, v2, :cond_17

    iget-object v7, v0, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/N3;

    instance-of v8, v7, La/O3;

    sget-object v9, La/N3$a;->b:La/N3$a;

    if-eqz v8, :cond_f

    iget-object v8, v7, La/N3;->J:[La/N3$a;

    aget-object v10, v8, v3

    aget-object v8, v8, v6

    sget-object v11, La/N3$a;->a:La/N3$a;

    if-ne v10, v9, :cond_b

    invoke-virtual {v7, v11}, La/N3;->w(La/N3$a;)V

    :cond_b
    if-ne v8, v9, :cond_c

    invoke-virtual {v7, v11}, La/N3;->x(La/N3$a;)V

    :cond_c
    invoke-virtual {v7, v1}, La/N3;->a(La/B9;)V

    if-ne v10, v9, :cond_d

    invoke-virtual {v7, v10}, La/N3;->w(La/N3$a;)V

    :cond_d
    if-ne v8, v9, :cond_e

    invoke-virtual {v7, v8}, La/N3;->x(La/N3$a;)V

    :cond_e
    move/from16 v16, v6

    goto/16 :goto_8

    :cond_f
    const/4 v8, -0x1

    iput v8, v7, La/N3;->h:I

    iput v8, v7, La/N3;->i:I

    iget-object v8, v0, La/N3;->J:[La/N3$a;

    aget-object v10, v8, v3

    sget-object v11, La/N3$a;->d:La/N3$a;

    iget-object v12, v7, La/N3;->J:[La/N3$a;

    if-eq v10, v9, :cond_10

    aget-object v10, v12, v3

    if-ne v10, v11, :cond_10

    iget-object v10, v7, La/N3;->y:La/M3;

    iget v13, v10, La/M3;->e:I

    invoke-virtual {v0}, La/N3;->l()I

    move-result v14

    iget-object v15, v7, La/N3;->A:La/M3;

    move/from16 v16, v6

    iget v6, v15, La/M3;->e:I

    sub-int/2addr v14, v6

    invoke-virtual {v1, v10}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v6

    iput-object v6, v10, La/M3;->g:La/le;

    invoke-virtual {v1, v15}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v6

    iput-object v6, v15, La/M3;->g:La/le;

    iget-object v6, v10, La/M3;->g:La/le;

    invoke-virtual {v1, v6, v13}, La/B9;->d(La/le;I)V

    iget-object v6, v15, La/M3;->g:La/le;

    invoke-virtual {v1, v6, v14}, La/B9;->d(La/le;I)V

    iput v4, v7, La/N3;->h:I

    iput v13, v7, La/N3;->P:I

    sub-int/2addr v14, v13

    iput v14, v7, La/N3;->L:I

    iget v6, v7, La/N3;->S:I

    if-ge v14, v6, :cond_11

    iput v6, v7, La/N3;->L:I

    goto :goto_7

    :cond_10
    move/from16 v16, v6

    :cond_11
    :goto_7
    aget-object v6, v8, v16

    if-eq v6, v9, :cond_14

    aget-object v6, v12, v16

    if-ne v6, v11, :cond_14

    iget-object v6, v7, La/N3;->z:La/M3;

    iget v8, v6, La/M3;->e:I

    invoke-virtual {v0}, La/N3;->i()I

    move-result v9

    iget-object v10, v7, La/N3;->B:La/M3;

    iget v11, v10, La/M3;->e:I

    sub-int/2addr v9, v11

    invoke-virtual {v1, v6}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v11

    iput-object v11, v6, La/M3;->g:La/le;

    invoke-virtual {v1, v10}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v11

    iput-object v11, v10, La/M3;->g:La/le;

    iget-object v6, v6, La/M3;->g:La/le;

    invoke-virtual {v1, v6, v8}, La/B9;->d(La/le;I)V

    iget-object v6, v10, La/M3;->g:La/le;

    invoke-virtual {v1, v6, v9}, La/B9;->d(La/le;I)V

    iget v6, v7, La/N3;->R:I

    if-gtz v6, :cond_12

    iget v6, v7, La/N3;->X:I

    const/16 v10, 0x8

    if-ne v6, v10, :cond_13

    :cond_12
    iget-object v6, v7, La/N3;->C:La/M3;

    invoke-virtual {v1, v6}, La/B9;->j(Ljava/lang/Object;)La/le;

    move-result-object v10

    iput-object v10, v6, La/M3;->g:La/le;

    iget v6, v7, La/N3;->R:I

    add-int/2addr v6, v8

    invoke-virtual {v1, v10, v6}, La/B9;->d(La/le;I)V

    :cond_13
    iput v4, v7, La/N3;->i:I

    iput v8, v7, La/N3;->Q:I

    sub-int/2addr v9, v8

    iput v9, v7, La/N3;->M:I

    iget v6, v7, La/N3;->T:I

    if-ge v9, v6, :cond_14

    iput v6, v7, La/N3;->M:I

    :cond_14
    instance-of v6, v7, La/Yg;

    if-nez v6, :cond_16

    instance-of v6, v7, La/a8;

    if-eqz v6, :cond_15

    goto :goto_8

    :cond_15
    invoke-virtual {v7, v1}, La/N3;->a(La/B9;)V

    :cond_16
    :goto_8
    add-int/lit8 v5, v5, 0x1

    move/from16 v6, v16

    goto/16 :goto_6

    :cond_17
    move/from16 v16, v6

    iget v2, v0, La/O3;->m0:I

    if-lez v2, :cond_18

    invoke-static {v0, v1, v3}, La/S2;->a(La/O3;La/B9;I)V

    :cond_18
    iget v2, v0, La/O3;->n0:I

    if-lez v2, :cond_19

    move/from16 v2, v16

    invoke-static {v0, v1, v2}, La/S2;->a(La/O3;La/B9;I)V

    :cond_19
    return-void
.end method

.method public final E(IZ)Z
    .locals 18

    move/from16 v0, p1

    move-object/from16 v1, p0

    iget-object v2, v1, La/O3;->g0:La/U4;

    iget-object v3, v2, La/U4;->a:La/O3;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, La/N3;->h(I)La/N3$a;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, La/N3;->h(I)La/N3$a;

    move-result-object v7

    invoke-virtual {v3}, La/N3;->m()I

    move-result v8

    invoke-virtual {v3}, La/N3;->n()I

    move-result v9

    iget-object v10, v2, La/U4;->e:Ljava/util/ArrayList;

    sget-object v11, La/N3$a;->a:La/N3$a;

    iget-object v12, v3, La/N3;->e:La/og;

    iget-object v13, v3, La/N3;->d:La/K8;

    if-eqz p2, :cond_4

    sget-object v14, La/N3$a;->b:La/N3$a;

    if-eq v5, v14, :cond_0

    if-ne v7, v14, :cond_4

    :cond_0
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_2

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v6, v16

    check-cast v6, La/ih;

    iget v4, v6, La/ih;->f:I

    if-ne v4, v0, :cond_1

    invoke-virtual {v6}, La/ih;->k()Z

    move-result v4

    if-nez v4, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    move/from16 v4, p2

    :goto_1
    if-nez v0, :cond_3

    if-eqz v4, :cond_4

    if-ne v5, v14, :cond_4

    invoke-virtual {v3, v11}, La/N3;->w(La/N3$a;)V

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, La/U4;->d(La/O3;I)I

    move-result v6

    invoke-virtual {v3, v6}, La/N3;->y(I)V

    iget-object v4, v13, La/ih;->e:La/l5;

    invoke-virtual {v3}, La/N3;->l()I

    move-result v6

    invoke-virtual {v4, v6}, La/l5;->d(I)V

    goto :goto_2

    :cond_3
    if-eqz v4, :cond_4

    if-ne v7, v14, :cond_4

    invoke-virtual {v3, v11}, La/N3;->x(La/N3$a;)V

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, La/U4;->d(La/O3;I)I

    move-result v6

    invoke-virtual {v3, v6}, La/N3;->v(I)V

    iget-object v4, v12, La/ih;->e:La/l5;

    invoke-virtual {v3}, La/N3;->i()I

    move-result v6

    invoke-virtual {v4, v6}, La/l5;->d(I)V

    :cond_4
    :goto_2
    sget-object v4, La/N3$a;->d:La/N3$a;

    iget-object v6, v3, La/N3;->J:[La/N3$a;

    if-nez v0, :cond_7

    const/16 v16, 0x0

    aget-object v6, v6, v16

    if-eq v6, v11, :cond_6

    if-ne v6, v4, :cond_5

    goto :goto_3

    :cond_5
    const/16 v17, 0x1

    goto :goto_4

    :cond_6
    :goto_3
    invoke-virtual {v3}, La/N3;->l()I

    move-result v4

    add-int/2addr v4, v8

    iget-object v6, v13, La/ih;->i:La/V4;

    invoke-virtual {v6, v4}, La/V4;->d(I)V

    iget-object v6, v13, La/ih;->e:La/l5;

    sub-int/2addr v4, v8

    invoke-virtual {v6, v4}, La/l5;->d(I)V

    const/4 v4, 0x1

    const/16 v17, 0x1

    goto :goto_6

    :cond_7
    const/16 v16, 0x0

    const/16 v17, 0x1

    aget-object v6, v6, v17

    if-eq v6, v11, :cond_9

    if-ne v6, v4, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    move/from16 v4, v16

    goto :goto_6

    :cond_9
    :goto_5
    invoke-virtual {v3}, La/N3;->i()I

    move-result v4

    add-int/2addr v4, v9

    iget-object v6, v12, La/ih;->i:La/V4;

    invoke-virtual {v6, v4}, La/V4;->d(I)V

    iget-object v6, v12, La/ih;->e:La/l5;

    sub-int/2addr v4, v9

    invoke-virtual {v6, v4}, La/l5;->d(I)V

    move/from16 v4, v17

    :goto_6
    invoke-virtual {v2}, La/U4;->g()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/ih;

    iget v8, v6, La/ih;->f:I

    if-eq v8, v0, :cond_a

    goto :goto_7

    :cond_a
    iget-object v8, v6, La/ih;->b:La/N3;

    if-ne v8, v3, :cond_b

    iget-boolean v8, v6, La/ih;->g:Z

    if-nez v8, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v6}, La/ih;->e()V

    goto :goto_7

    :cond_c
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_d
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/ih;

    iget v8, v6, La/ih;->f:I

    if-eq v8, v0, :cond_e

    goto :goto_8

    :cond_e
    if-nez v4, :cond_f

    iget-object v8, v6, La/ih;->b:La/N3;

    if-ne v8, v3, :cond_f

    goto :goto_8

    :cond_f
    iget-object v8, v6, La/ih;->h:La/V4;

    iget-boolean v8, v8, La/V4;->j:Z

    if-nez v8, :cond_10

    :goto_9
    move/from16 v4, v16

    goto :goto_a

    :cond_10
    iget-object v8, v6, La/ih;->i:La/V4;

    iget-boolean v8, v8, La/V4;->j:Z

    if-nez v8, :cond_11

    goto :goto_9

    :cond_11
    instance-of v8, v6, La/U2;

    if-nez v8, :cond_d

    iget-object v6, v6, La/ih;->e:La/l5;

    iget-boolean v6, v6, La/V4;->j:Z

    if-nez v6, :cond_d

    goto :goto_9

    :cond_12
    move/from16 v4, v17

    :goto_a
    invoke-virtual {v3, v5}, La/N3;->w(La/N3$a;)V

    invoke-virtual {v3, v7}, La/N3;->x(La/N3$a;)V

    return v4
.end method

.method public final s()V
    .locals 1

    iget-object v0, p0, La/O3;->j0:La/B9;

    invoke-virtual {v0}, La/B9;->r()V

    const/4 v0, 0x0

    iput v0, p0, La/O3;->k0:I

    iput v0, p0, La/O3;->l0:I

    invoke-super {p0}, La/hh;->s()V

    return-void
.end method

.method public final z(ZZ)V
    .locals 3

    invoke-super {p0, p1, p2}, La/N3;->z(ZZ)V

    iget-object v0, p0, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/N3;

    invoke-virtual {v2, p1, p2}, La/N3;->z(ZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
