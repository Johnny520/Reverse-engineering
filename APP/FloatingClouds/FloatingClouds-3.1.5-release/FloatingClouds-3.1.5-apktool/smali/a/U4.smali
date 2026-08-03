.class public final La/U4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/O3;

.field public b:Z

.field public c:Z

.field public d:La/O3;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/ih;",
            ">;"
        }
    .end annotation
.end field

.field public f:La/e2$b;

.field public g:La/e2$a;

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/Dd;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public final a(La/V4;ILjava/util/ArrayList;La/Dd;)V
    .locals 6

    iget-object p1, p1, La/V4;->d:La/ih;

    iget-object v0, p1, La/ih;->c:La/Dd;

    if-nez v0, :cond_a

    iget-object v0, p0, La/U4;->a:La/O3;

    iget-object v1, v0, La/N3;->d:La/K8;

    if-eq p1, v1, :cond_a

    iget-object v0, v0, La/N3;->e:La/og;

    if-ne p1, v0, :cond_0

    goto/16 :goto_6

    :cond_0
    if-nez p4, :cond_1

    new-instance p4, La/Dd;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p4, La/Dd;->a:La/ih;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p4, La/Dd;->b:Ljava/util/ArrayList;

    iput-object p1, p4, La/Dd;->a:La/ih;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iput-object p4, p1, La/ih;->c:La/Dd;

    iget-object v0, p4, La/Dd;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, La/ih;->h:La/V4;

    iget-object v1, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/T4;

    instance-of v3, v2, La/V4;

    if-eqz v3, :cond_2

    check-cast v2, La/V4;

    invoke-virtual {p0, v2, p2, p3, p4}, La/U4;->a(La/V4;ILjava/util/ArrayList;La/Dd;)V

    goto :goto_0

    :cond_3
    iget-object v1, p1, La/ih;->i:La/V4;

    iget-object v2, v1, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/T4;

    instance-of v4, v3, La/V4;

    if-eqz v4, :cond_4

    check-cast v3, La/V4;

    invoke-virtual {p0, v3, p2, p3, p4}, La/U4;->a(La/V4;ILjava/util/ArrayList;La/Dd;)V

    goto :goto_1

    :cond_5
    const/4 v2, 0x1

    if-ne p2, v2, :cond_7

    instance-of v3, p1, La/og;

    if-eqz v3, :cond_7

    move-object v3, p1

    check-cast v3, La/og;

    iget-object v3, v3, La/og;->k:La/V4;

    iget-object v3, v3, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/T4;

    instance-of v5, v4, La/V4;

    if-eqz v5, :cond_6

    check-cast v4, La/V4;

    invoke-virtual {p0, v4, p2, p3, p4}, La/U4;->a(La/V4;ILjava/util/ArrayList;La/Dd;)V

    goto :goto_2

    :cond_7
    iget-object v0, v0, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/V4;

    invoke-virtual {p0, v3, p2, p3, p4}, La/U4;->a(La/V4;ILjava/util/ArrayList;La/Dd;)V

    goto :goto_3

    :cond_8
    iget-object v0, v1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/V4;

    invoke-virtual {p0, v1, p2, p3, p4}, La/U4;->a(La/V4;ILjava/util/ArrayList;La/Dd;)V

    goto :goto_4

    :cond_9
    if-ne p2, v2, :cond_a

    instance-of v0, p1, La/og;

    if-eqz v0, :cond_a

    check-cast p1, La/og;

    iget-object p1, p1, La/og;->k:La/V4;

    iget-object p1, p1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/V4;

    invoke-virtual {p0, v0, p2, p3, p4}, La/U4;->a(La/V4;ILjava/util/ArrayList;La/Dd;)V

    goto :goto_5

    :cond_a
    :goto_6
    return-void
.end method

.method public final b(La/O3;)V
    .locals 24

    move-object/from16 v0, p1

    iget-object v1, v0, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, La/N3;

    iget-object v2, v4, La/N3;->J:[La/N3$a;

    const/4 v3, 0x0

    aget-object v5, v2, v3

    const/4 v9, 0x1

    aget-object v2, v2, v9

    iget v6, v4, La/N3;->X:I

    const/16 v7, 0x8

    if-ne v6, v7, :cond_0

    iput-boolean v9, v4, La/N3;->a:Z

    goto :goto_0

    :cond_0
    iget v6, v4, La/N3;->o:F

    const/high16 v10, 0x3f800000    # 1.0f

    cmpg-float v7, v6, v10

    sget-object v8, La/N3$a;->c:La/N3$a;

    const/4 v11, 0x2

    if-gez v7, :cond_1

    if-ne v5, v8, :cond_1

    iput v11, v4, La/N3;->j:I

    :cond_1
    iget v7, v4, La/N3;->r:F

    cmpg-float v12, v7, v10

    if-gez v12, :cond_2

    if-ne v2, v8, :cond_2

    iput v11, v4, La/N3;->k:I

    :cond_2
    iget v12, v4, La/N3;->N:F

    const/4 v13, 0x0

    cmpl-float v12, v12, v13

    sget-object v13, La/N3$a;->b:La/N3$a;

    sget-object v14, La/N3$a;->a:La/N3$a;

    const/4 v15, 0x3

    if-lez v12, :cond_8

    if-ne v5, v8, :cond_4

    if-eq v2, v13, :cond_3

    if-ne v2, v14, :cond_4

    :cond_3
    iput v15, v4, La/N3;->j:I

    goto :goto_1

    :cond_4
    if-ne v2, v8, :cond_6

    if-eq v5, v13, :cond_5

    if-ne v5, v14, :cond_6

    :cond_5
    iput v15, v4, La/N3;->k:I

    goto :goto_1

    :cond_6
    if-ne v5, v8, :cond_8

    if-ne v2, v8, :cond_8

    iget v12, v4, La/N3;->j:I

    if-nez v12, :cond_7

    iput v15, v4, La/N3;->j:I

    :cond_7
    iget v12, v4, La/N3;->k:I

    if-nez v12, :cond_8

    iput v15, v4, La/N3;->k:I

    :cond_8
    :goto_1
    iget-object v12, v4, La/N3;->A:La/M3;

    move/from16 v16, v3

    iget-object v3, v4, La/N3;->y:La/M3;

    move/from16 v17, v10

    if-ne v5, v8, :cond_a

    iget v10, v4, La/N3;->j:I

    if-ne v10, v9, :cond_a

    iget-object v10, v3, La/M3;->d:La/M3;

    if-eqz v10, :cond_9

    iget-object v10, v12, La/M3;->d:La/M3;

    if-nez v10, :cond_a

    :cond_9
    move-object v5, v13

    :cond_a
    iget-object v10, v4, La/N3;->B:La/M3;

    iget-object v11, v4, La/N3;->z:La/M3;

    if-ne v2, v8, :cond_c

    iget v15, v4, La/N3;->k:I

    if-ne v15, v9, :cond_c

    iget-object v15, v11, La/M3;->d:La/M3;

    if-eqz v15, :cond_b

    iget-object v15, v10, La/M3;->d:La/M3;

    if-nez v15, :cond_c

    :cond_b
    move-object v2, v13

    :cond_c
    iget-object v15, v4, La/N3;->d:La/K8;

    iput-object v5, v15, La/ih;->d:La/N3$a;

    iget v9, v4, La/N3;->j:I

    iput v9, v15, La/ih;->a:I

    move/from16 v21, v6

    iget-object v6, v4, La/N3;->e:La/og;

    iput-object v2, v6, La/ih;->d:La/N3$a;

    move-object/from16 v22, v1

    iget v1, v4, La/N3;->k:I

    iput v1, v6, La/ih;->a:I

    move-object/from16 v23, v6

    sget-object v6, La/N3$a;->d:La/N3$a;

    if-eq v5, v6, :cond_d

    if-eq v5, v14, :cond_d

    if-ne v5, v13, :cond_f

    :cond_d
    if-eq v2, v6, :cond_e

    if-eq v2, v14, :cond_e

    if-ne v2, v13, :cond_f

    :cond_e
    move-object v7, v2

    move-object/from16 v13, v23

    goto/16 :goto_b

    :cond_f
    iget-object v3, v0, La/N3;->J:[La/N3$a;

    iget-object v10, v4, La/N3;->G:[La/M3;

    const/high16 v11, 0x3f000000    # 0.5f

    if-ne v5, v8, :cond_11

    if-eq v2, v13, :cond_10

    if-ne v2, v14, :cond_11

    :cond_10
    const/4 v12, 0x3

    goto :goto_2

    :cond_11
    move v12, v11

    move-object v11, v5

    move-object v5, v13

    move-object/from16 v13, v23

    move/from16 v23, v12

    move v12, v7

    move-object v7, v2

    goto/16 :goto_5

    :goto_2
    if-ne v9, v12, :cond_14

    if-ne v2, v13, :cond_12

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v7, v13

    move-object/from16 v3, p0

    move-object v5, v13

    move-object/from16 v13, v23

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    goto :goto_3

    :cond_12
    move-object/from16 v13, v23

    :goto_3
    invoke-virtual {v4}, La/N3;->i()I

    move-result v8

    int-to-float v1, v8

    iget v2, v4, La/N3;->N:F

    mul-float/2addr v1, v2

    add-float/2addr v1, v11

    float-to-int v6, v1

    move-object v7, v14

    move-object/from16 v3, p0

    move-object v5, v14

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iget-object v1, v15, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->l()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    iget-object v1, v13, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->i()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    const/4 v12, 0x1

    iput-boolean v12, v4, La/N3;->a:Z

    :cond_13
    :goto_4
    move-object/from16 v1, v22

    goto/16 :goto_0

    :cond_14
    move v12, v11

    move-object v11, v5

    move-object v5, v13

    move-object/from16 v13, v23

    move/from16 v23, v12

    const/4 v12, 0x1

    if-ne v9, v12, :cond_15

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v3, p0

    move-object v7, v2

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iget-object v1, v15, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->l()I

    move-result v2

    iput v2, v1, La/l5;->m:I

    goto :goto_4

    :cond_15
    move v12, v7

    move-object v7, v2

    const/4 v2, 0x2

    if-ne v9, v2, :cond_17

    aget-object v2, v3, v16

    if-eq v2, v14, :cond_16

    if-ne v2, v6, :cond_19

    :cond_16
    invoke-virtual {v0}, La/N3;->l()I

    move-result v1

    int-to-float v1, v1

    mul-float v6, v21, v1

    add-float v6, v6, v23

    float-to-int v6, v6

    invoke-virtual {v4}, La/N3;->i()I

    move-result v8

    move-object/from16 v3, p0

    move-object v5, v14

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iget-object v1, v15, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->l()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    iget-object v1, v13, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->i()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    const/4 v2, 0x1

    iput-boolean v2, v4, La/N3;->a:Z

    goto :goto_4

    :cond_17
    const/16 v20, 0x1

    aget-object v2, v10, v16

    iget-object v2, v2, La/M3;->d:La/M3;

    if-eqz v2, :cond_18

    aget-object v2, v10, v20

    iget-object v2, v2, La/M3;->d:La/M3;

    if-nez v2, :cond_19

    :cond_18
    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v3, p0

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iget-object v1, v15, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->l()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    iget-object v1, v13, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->i()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    const/4 v2, 0x1

    iput-boolean v2, v4, La/N3;->a:Z

    goto :goto_4

    :cond_19
    :goto_5
    if-ne v7, v8, :cond_1b

    if-eq v11, v5, :cond_1a

    if-ne v11, v14, :cond_1b

    :cond_1a
    const/4 v2, 0x3

    goto :goto_7

    :cond_1b
    move-object v2, v11

    move-object v11, v5

    move-object v5, v2

    :cond_1c
    :goto_6
    const/4 v2, 0x1

    goto/16 :goto_9

    :goto_7
    if-ne v1, v2, :cond_1f

    if-ne v11, v5, :cond_1d

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v7, v5

    move-object/from16 v3, p0

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    :cond_1d
    invoke-virtual {v4}, La/N3;->l()I

    move-result v6

    iget v1, v4, La/N3;->N:F

    iget v2, v4, La/N3;->O:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1e

    div-float v1, v17, v1

    :cond_1e
    int-to-float v2, v6

    mul-float/2addr v2, v1

    add-float v2, v2, v23

    float-to-int v8, v2

    move-object v7, v14

    move-object/from16 v3, p0

    move-object v5, v14

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iget-object v1, v15, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->l()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    iget-object v1, v13, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->i()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    const/4 v2, 0x1

    iput-boolean v2, v4, La/N3;->a:Z

    goto/16 :goto_4

    :cond_1f
    const/4 v2, 0x1

    if-ne v1, v2, :cond_20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v3, p0

    move-object v7, v5

    move-object v5, v11

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iget-object v1, v13, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->i()I

    move-result v2

    iput v2, v1, La/l5;->m:I

    goto/16 :goto_4

    :cond_20
    move-object/from16 v17, v11

    move-object v11, v5

    const/4 v5, 0x2

    if-ne v1, v5, :cond_23

    aget-object v5, v3, v2

    if-eq v5, v14, :cond_22

    if-ne v5, v6, :cond_21

    goto :goto_8

    :cond_21
    move-object/from16 v5, v17

    goto :goto_6

    :cond_22
    :goto_8
    invoke-virtual {v4}, La/N3;->l()I

    move-result v6

    invoke-virtual {v0}, La/N3;->i()I

    move-result v1

    int-to-float v1, v1

    mul-float v7, v12, v1

    add-float v7, v7, v23

    float-to-int v8, v7

    move-object/from16 v3, p0

    move-object v7, v14

    move-object/from16 v5, v17

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iget-object v1, v15, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->l()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    iget-object v1, v13, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->i()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    const/4 v2, 0x1

    iput-boolean v2, v4, La/N3;->a:Z

    goto/16 :goto_4

    :cond_23
    move/from16 v18, v5

    move-object/from16 v5, v17

    aget-object v2, v10, v18

    iget-object v2, v2, La/M3;->d:La/M3;

    if-eqz v2, :cond_24

    const/16 v19, 0x3

    aget-object v2, v10, v19

    iget-object v2, v2, La/M3;->d:La/M3;

    if-nez v2, :cond_1c

    :cond_24
    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v3, p0

    move-object v5, v11

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iget-object v1, v15, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->l()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    iget-object v1, v13, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->i()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    const/4 v2, 0x1

    iput-boolean v2, v4, La/N3;->a:Z

    goto/16 :goto_4

    :goto_9
    if-ne v5, v8, :cond_13

    if-ne v7, v8, :cond_13

    if-eq v9, v2, :cond_28

    if-ne v1, v2, :cond_25

    goto :goto_a

    :cond_25
    const/4 v5, 0x2

    if-ne v1, v5, :cond_13

    if-ne v9, v5, :cond_13

    aget-object v1, v3, v16

    if-eq v1, v14, :cond_26

    if-ne v1, v14, :cond_13

    :cond_26
    aget-object v1, v3, v2

    if-eq v1, v14, :cond_27

    if-ne v1, v14, :cond_13

    :cond_27
    invoke-virtual {v0}, La/N3;->l()I

    move-result v1

    int-to-float v1, v1

    mul-float v6, v21, v1

    add-float v6, v6, v23

    float-to-int v6, v6

    invoke-virtual {v0}, La/N3;->i()I

    move-result v1

    int-to-float v1, v1

    mul-float v7, v12, v1

    add-float v7, v7, v23

    float-to-int v8, v7

    move-object v7, v14

    move-object/from16 v3, p0

    move-object v5, v14

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iget-object v1, v15, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->l()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    iget-object v1, v13, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->i()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    const/4 v2, 0x1

    iput-boolean v2, v4, La/N3;->a:Z

    goto/16 :goto_4

    :cond_28
    :goto_a
    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v7, v11

    move-object/from16 v3, p0

    move-object v5, v11

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iget-object v1, v15, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->l()I

    move-result v2

    iput v2, v1, La/l5;->m:I

    iget-object v1, v13, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->i()I

    move-result v2

    iput v2, v1, La/l5;->m:I

    goto/16 :goto_4

    :goto_b
    invoke-virtual {v4}, La/N3;->l()I

    move-result v1

    if-ne v5, v6, :cond_29

    invoke-virtual {v0}, La/N3;->l()I

    move-result v1

    iget v2, v3, La/M3;->e:I

    sub-int/2addr v1, v2

    iget v2, v12, La/M3;->e:I

    sub-int/2addr v1, v2

    move-object v5, v14

    :cond_29
    invoke-virtual {v4}, La/N3;->i()I

    move-result v2

    if-ne v7, v6, :cond_2a

    invoke-virtual {v0}, La/N3;->i()I

    move-result v2

    iget v3, v11, La/M3;->e:I

    sub-int/2addr v2, v3

    iget v3, v10, La/M3;->e:I

    sub-int/2addr v2, v3

    move-object v7, v14

    :cond_2a
    move-object/from16 v3, p0

    move v6, v1

    move v8, v2

    invoke-virtual/range {v3 .. v8}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iget-object v1, v15, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->l()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    iget-object v1, v13, La/ih;->e:La/l5;

    invoke-virtual {v4}, La/N3;->i()I

    move-result v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    const/4 v2, 0x1

    iput-boolean v2, v4, La/N3;->a:Z

    goto/16 :goto_4

    :cond_2b
    return-void
.end method

.method public final c()V
    .locals 8

    iget-object v0, p0, La/U4;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, La/U4;->d:La/O3;

    iget-object v2, v1, La/N3;->d:La/K8;

    invoke-virtual {v2}, La/K8;->f()V

    iget-object v2, v1, La/N3;->e:La/og;

    invoke-virtual {v2}, La/og;->f()V

    iget-object v3, v1, La/N3;->d:La/K8;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/N3;

    instance-of v7, v4, La/a8;

    if-eqz v7, :cond_1

    new-instance v5, La/b8;

    invoke-direct {v5, v4}, La/ih;-><init>(La/N3;)V

    iget-object v6, v4, La/N3;->d:La/K8;

    invoke-virtual {v6}, La/K8;->f()V

    iget-object v6, v4, La/N3;->e:La/og;

    invoke-virtual {v6}, La/og;->f()V

    check-cast v4, La/a8;

    iget v4, v4, La/a8;->i0:I

    iput v4, v5, La/ih;->f:I

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, La/N3;->q()Z

    move-result v7

    if-eqz v7, :cond_4

    iget-object v7, v4, La/N3;->b:La/U2;

    if-nez v7, :cond_2

    new-instance v7, La/U2;

    invoke-direct {v7, v4, v6}, La/U2;-><init>(La/N3;I)V

    iput-object v7, v4, La/N3;->b:La/U2;

    :cond_2
    if-nez v3, :cond_3

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    :cond_3
    iget-object v6, v4, La/N3;->b:La/U2;

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v6, v4, La/N3;->d:La/K8;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    invoke-virtual {v4}, La/N3;->r()Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, v4, La/N3;->c:La/U2;

    if-nez v6, :cond_5

    new-instance v6, La/U2;

    invoke-direct {v6, v4, v5}, La/U2;-><init>(La/N3;I)V

    iput-object v6, v4, La/N3;->c:La/U2;

    :cond_5
    if-nez v3, :cond_6

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    :cond_6
    iget-object v5, v4, La/N3;->c:La/U2;

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    iget-object v5, v4, La/N3;->e:La/og;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    instance-of v5, v4, La/f8;

    if-eqz v5, :cond_0

    new-instance v5, La/e8;

    invoke-direct {v5, v4}, La/ih;-><init>(La/N3;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_8
    if-eqz v3, :cond_9

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/ih;

    invoke-virtual {v3}, La/ih;->f()V

    goto :goto_3

    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/ih;

    iget-object v3, v2, La/ih;->b:La/N3;

    if-ne v3, v1, :cond_b

    goto :goto_4

    :cond_b
    invoke-virtual {v2}, La/ih;->d()V

    goto :goto_4

    :cond_c
    iget-object v0, p0, La/U4;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, La/U4;->a:La/O3;

    iget-object v2, v1, La/N3;->d:La/K8;

    invoke-virtual {p0, v2, v6, v0}, La/U4;->e(La/ih;ILjava/util/ArrayList;)V

    iget-object v1, v1, La/N3;->e:La/og;

    invoke-virtual {p0, v1, v5, v0}, La/U4;->e(La/ih;ILjava/util/ArrayList;)V

    iput-boolean v6, p0, La/U4;->b:Z

    return-void
.end method

.method public final d(La/O3;I)I
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move/from16 v2, p2

    iget-object v3, v1, La/U4;->h:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    :goto_0
    if-ge v7, v4, :cond_d

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/Dd;

    iget-object v10, v10, La/Dd;->a:La/ih;

    instance-of v11, v10, La/U2;

    if-eqz v11, :cond_0

    move-object v11, v10

    check-cast v11, La/U2;

    iget v11, v11, La/ih;->f:I

    if-eq v11, v2, :cond_2

    :goto_1
    move-object/from16 v18, v3

    move/from16 v16, v4

    move/from16 v17, v7

    const-wide/16 v0, 0x0

    goto/16 :goto_8

    :cond_0
    if-nez v2, :cond_1

    instance-of v11, v10, La/K8;

    if-nez v11, :cond_2

    goto :goto_1

    :cond_1
    instance-of v11, v10, La/og;

    if-nez v11, :cond_2

    goto :goto_1

    :cond_2
    if-nez v2, :cond_3

    iget-object v11, v0, La/N3;->d:La/K8;

    :goto_2
    iget-object v11, v11, La/ih;->h:La/V4;

    goto :goto_3

    :cond_3
    iget-object v11, v0, La/N3;->e:La/og;

    goto :goto_2

    :goto_3
    if-nez v2, :cond_4

    iget-object v12, v0, La/N3;->d:La/K8;

    :goto_4
    iget-object v12, v12, La/ih;->i:La/V4;

    goto :goto_5

    :cond_4
    iget-object v12, v0, La/N3;->e:La/og;

    goto :goto_4

    :goto_5
    iget-object v13, v10, La/ih;->h:La/V4;

    iget-object v13, v13, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v11

    iget-object v13, v10, La/ih;->i:La/V4;

    iget-object v14, v13, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v10}, La/ih;->j()J

    move-result-wide v14

    iget-object v5, v10, La/ih;->h:La/V4;

    if-eqz v11, :cond_a

    if-eqz v12, :cond_a

    const-wide/16 v0, 0x0

    invoke-static {v5, v0, v1}, La/Dd;->b(La/V4;J)J

    move-result-wide v11

    move-object v6, v3

    move/from16 v16, v4

    invoke-static {v13, v0, v1}, La/Dd;->a(La/V4;J)J

    move-result-wide v3

    sub-long/2addr v11, v14

    iget v0, v13, La/V4;->f:I

    neg-int v1, v0

    move-object/from16 v18, v6

    move/from16 v17, v7

    int-to-long v6, v1

    cmp-long v1, v11, v6

    if-ltz v1, :cond_5

    int-to-long v0, v0

    add-long/2addr v11, v0

    :cond_5
    neg-long v0, v3

    sub-long/2addr v0, v14

    iget v3, v5, La/V4;->f:I

    int-to-long v3, v3

    sub-long/2addr v0, v3

    cmp-long v6, v0, v3

    if-ltz v6, :cond_6

    sub-long/2addr v0, v3

    :cond_6
    iget-object v3, v10, La/ih;->b:La/N3;

    if-nez v2, :cond_7

    iget v3, v3, La/N3;->U:F

    goto :goto_6

    :cond_7
    const/4 v4, 0x1

    if-ne v2, v4, :cond_8

    iget v3, v3, La/N3;->V:F

    goto :goto_6

    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v3, -0x40800000    # -1.0f

    :goto_6
    const/4 v4, 0x0

    cmpl-float v4, v3, v4

    const/high16 v6, 0x3f800000    # 1.0f

    if-lez v4, :cond_9

    long-to-float v0, v0

    div-float/2addr v0, v3

    long-to-float v1, v11

    sub-float v4, v6, v3

    div-float/2addr v1, v4

    add-float/2addr v1, v0

    float-to-long v0, v1

    goto :goto_7

    :cond_9
    const-wide/16 v0, 0x0

    :goto_7
    long-to-float v0, v0

    mul-float v1, v0, v3

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v1, v4

    float-to-long v10, v1

    sub-float/2addr v6, v3

    mul-float/2addr v6, v0

    add-float/2addr v6, v4

    float-to-long v0, v6

    add-long/2addr v10, v14

    add-long/2addr v10, v0

    iget v0, v5, La/V4;->f:I

    int-to-long v0, v0

    add-long/2addr v0, v10

    iget v3, v13, La/V4;->f:I

    int-to-long v3, v3

    sub-long/2addr v0, v3

    goto :goto_8

    :cond_a
    move-object/from16 v18, v3

    move/from16 v16, v4

    move/from16 v17, v7

    if-eqz v11, :cond_b

    iget v0, v5, La/V4;->f:I

    int-to-long v0, v0

    invoke-static {v5, v0, v1}, La/Dd;->b(La/V4;J)J

    move-result-wide v0

    iget v3, v5, La/V4;->f:I

    int-to-long v3, v3

    add-long/2addr v3, v14

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    goto :goto_8

    :cond_b
    if-eqz v12, :cond_c

    iget v0, v13, La/V4;->f:I

    int-to-long v0, v0

    invoke-static {v13, v0, v1}, La/Dd;->a(La/V4;J)J

    move-result-wide v0

    iget v3, v13, La/V4;->f:I

    neg-int v3, v3

    int-to-long v3, v3

    add-long/2addr v3, v14

    neg-long v0, v0

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    goto :goto_8

    :cond_c
    iget v0, v5, La/V4;->f:I

    int-to-long v0, v0

    invoke-virtual {v10}, La/ih;->j()J

    move-result-wide v3

    add-long/2addr v3, v0

    iget v0, v13, La/V4;->f:I

    int-to-long v0, v0

    sub-long v0, v3, v0

    :goto_8
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    add-int/lit8 v7, v17, 0x1

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v4, v16

    move-object/from16 v3, v18

    goto/16 :goto_0

    :cond_d
    long-to-int v0, v8

    return v0
.end method

.method public final e(La/ih;ILjava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/ih;",
            "I",
            "Ljava/util/ArrayList<",
            "La/Dd;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p1, La/ih;->h:La/V4;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p1, La/ih;->i:La/V4;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/T4;

    instance-of v2, v1, La/V4;

    if-eqz v2, :cond_1

    check-cast v1, La/V4;

    invoke-virtual {p0, v1, p2, p3, v3}, La/U4;->a(La/V4;ILjava/util/ArrayList;La/Dd;)V

    goto :goto_0

    :cond_1
    instance-of v2, v1, La/ih;

    if-eqz v2, :cond_0

    check-cast v1, La/ih;

    iget-object v1, v1, La/ih;->h:La/V4;

    invoke-virtual {p0, v1, p2, p3, v3}, La/U4;->a(La/V4;ILjava/util/ArrayList;La/Dd;)V

    goto :goto_0

    :cond_2
    iget-object v0, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/T4;

    instance-of v2, v1, La/V4;

    if-eqz v2, :cond_4

    check-cast v1, La/V4;

    invoke-virtual {p0, v1, p2, p3, v3}, La/U4;->a(La/V4;ILjava/util/ArrayList;La/Dd;)V

    goto :goto_1

    :cond_4
    instance-of v2, v1, La/ih;

    if-eqz v2, :cond_3

    check-cast v1, La/ih;

    iget-object v1, v1, La/ih;->i:La/V4;

    invoke-virtual {p0, v1, p2, p3, v3}, La/U4;->a(La/V4;ILjava/util/ArrayList;La/Dd;)V

    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    if-ne p2, v0, :cond_7

    check-cast p1, La/og;

    iget-object p1, p1, La/og;->k:La/V4;

    iget-object p1, p1, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/T4;

    instance-of v1, v0, La/V4;

    if-eqz v1, :cond_6

    check-cast v0, La/V4;

    invoke-virtual {p0, v0, p2, p3, v3}, La/U4;->a(La/V4;ILjava/util/ArrayList;La/Dd;)V

    goto :goto_2

    :cond_7
    return-void
.end method

.method public final f(La/N3;La/N3$a;ILa/N3$a;I)V
    .locals 1

    iget-object v0, p0, La/U4;->g:La/e2$a;

    iput-object p2, v0, La/e2$a;->a:La/N3$a;

    iput-object p4, v0, La/e2$a;->b:La/N3$a;

    iput p3, v0, La/e2$a;->c:I

    iput p5, v0, La/e2$a;->d:I

    iget-object p2, p0, La/U4;->f:La/e2$b;

    check-cast p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-virtual {p2, p1, v0}, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a(La/N3;La/e2$a;)V

    iget p2, v0, La/e2$a;->e:I

    invoke-virtual {p1, p2}, La/N3;->y(I)V

    iget p2, v0, La/e2$a;->f:I

    invoke-virtual {p1, p2}, La/N3;->v(I)V

    iget-boolean p2, v0, La/e2$a;->h:Z

    iput-boolean p2, p1, La/N3;->w:Z

    iget p2, v0, La/e2$a;->g:I

    iput p2, p1, La/N3;->R:I

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p1, La/N3;->w:Z

    return-void
.end method

.method public final g()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, La/U4;->a:La/O3;

    iget-object v1, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/N3;

    iget-boolean v2, v1, La/N3;->a:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v1, La/N3;->J:[La/N3$a;

    const/4 v3, 0x0

    aget-object v7, v2, v3

    const/4 v8, 0x1

    aget-object v9, v2, v8

    iget v2, v1, La/N3;->j:I

    iget v4, v1, La/N3;->k:I

    sget-object v5, La/N3$a;->b:La/N3$a;

    sget-object v10, La/N3$a;->c:La/N3$a;

    if-eq v7, v5, :cond_2

    if-ne v7, v10, :cond_1

    if-ne v2, v8, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v2, v8

    :goto_2
    if-eq v9, v5, :cond_3

    if-ne v9, v10, :cond_4

    if-ne v4, v8, :cond_4

    :cond_3
    move v3, v8

    :cond_4
    iget-object v11, v1, La/N3;->d:La/K8;

    iget-object v4, v11, La/ih;->e:La/l5;

    iget-boolean v12, v4, La/V4;->j:Z

    iget-object v13, v1, La/N3;->e:La/og;

    iget-object v14, v13, La/ih;->e:La/l5;

    iget-boolean v15, v14, La/V4;->j:Z

    move/from16 v16, v2

    sget-object v2, La/N3$a;->a:La/N3$a;

    if-eqz v12, :cond_5

    if-eqz v15, :cond_5

    iget v3, v4, La/V4;->g:I

    iget v5, v14, La/V4;->g:I

    move-object v4, v2

    invoke-virtual/range {v0 .. v5}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    iput-boolean v8, v1, La/N3;->a:Z

    goto :goto_3

    :cond_5
    if-eqz v12, :cond_7

    if-eqz v3, :cond_7

    iget v3, v4, La/V4;->g:I

    move-object v4, v5

    iget v5, v14, La/V4;->g:I

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    if-ne v9, v10, :cond_6

    iget-object v0, v13, La/ih;->e:La/l5;

    invoke-virtual {v1}, La/N3;->i()I

    move-result v2

    iput v2, v0, La/l5;->m:I

    goto :goto_3

    :cond_6
    iget-object v0, v13, La/ih;->e:La/l5;

    invoke-virtual {v1}, La/N3;->i()I

    move-result v2

    invoke-virtual {v0, v2}, La/l5;->d(I)V

    iput-boolean v8, v1, La/N3;->a:Z

    goto :goto_3

    :cond_7
    move-object v0, v2

    move-object v2, v5

    if-eqz v15, :cond_9

    if-eqz v16, :cond_9

    iget v3, v4, La/V4;->g:I

    iget v5, v14, La/V4;->g:I

    move-object v4, v0

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, La/U4;->f(La/N3;La/N3$a;ILa/N3$a;I)V

    if-ne v7, v10, :cond_8

    iget-object v0, v11, La/ih;->e:La/l5;

    invoke-virtual {v1}, La/N3;->l()I

    move-result v2

    iput v2, v0, La/l5;->m:I

    goto :goto_3

    :cond_8
    iget-object v0, v11, La/ih;->e:La/l5;

    invoke-virtual {v1}, La/N3;->l()I

    move-result v2

    invoke-virtual {v0, v2}, La/l5;->d(I)V

    iput-boolean v8, v1, La/N3;->a:Z

    :cond_9
    :goto_3
    iget-boolean v0, v1, La/N3;->a:Z

    if-eqz v0, :cond_a

    iget-object v0, v13, La/og;->l:La/d2;

    if-eqz v0, :cond_a

    iget v1, v1, La/N3;->R:I

    invoke-virtual {v0, v1}, La/l5;->d(I)V

    :cond_a
    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_b
    return-void
.end method
