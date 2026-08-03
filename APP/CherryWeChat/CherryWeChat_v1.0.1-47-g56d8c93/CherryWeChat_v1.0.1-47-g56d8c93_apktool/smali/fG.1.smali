.class public abstract LfG;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LJc;
.implements LVa;
.implements LIE;


# static fields
.field public static final b:Lv1;

.field public static final c:Lv1;

.field public static final d:Ljava/lang/Object;

.field public static final e:[B

.field public static final f:[B


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lv1;

    const-string v1, "UNDEFINED"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lv1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LfG;->b:Lv1;

    new-instance v0, Lv1;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1, v2}, Lv1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LfG;->c:Lv1;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LfG;->d:Ljava/lang/Object;

    const/4 v0, 0x4

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, LfG;->e:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, LfG;->f:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x70t
        0x72t
        0x6ft
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x70t
        0x72t
        0x6dt
        0x0t
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LfG;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final E(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lzq;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p1, Lzq;

    invoke-direct {p1, p0, p2}, Lzq;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    return-object p1
.end method

.method public static F(Lsb;Lmo;Ljava/util/ArrayList;I)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    if-nez p3, :cond_0

    iget v2, v0, Lsb;->z0:I

    iget-object v3, v0, Lsb;->C0:[Ll7;

    const/4 v15, 0x0

    :goto_0
    move v13, v2

    move-object v14, v3

    goto :goto_1

    :cond_0
    iget v2, v0, Lsb;->A0:I

    iget-object v3, v0, Lsb;->B0:[Ll7;

    const/4 v15, 0x2

    goto :goto_0

    :goto_1
    const/4 v2, 0x0

    :goto_2
    if-ge v2, v13, :cond_71

    aget-object v3, v14, v2

    iget-boolean v4, v3, Ll7;->q:Z

    iget-object v5, v3, Ll7;->a:Lrb;

    iget-object v6, v5, Lrb;->Q:[Lcb;

    const/4 v7, 0x3

    const/16 v16, 0x0

    const/16 v8, 0x8

    const/16 v17, 0x0

    if-nez v4, :cond_19

    iget v4, v3, Ll7;->l:I

    mul-int/lit8 v18, v4, 0x2

    move-object v12, v5

    move-object/from16 v21, v12

    const/16 v19, 0x0

    :goto_3
    if-nez v19, :cond_14

    const/16 v22, 0x1

    iget v9, v3, Ll7;->i:I

    add-int/lit8 v9, v9, 0x1

    iput v9, v3, Ll7;->i:I

    iget-object v9, v12, Lrb;->m0:[Lrb;

    iget-object v11, v12, Lrb;->Q:[Lcb;

    aput-object v16, v9, v4

    iget-object v9, v12, Lrb;->l0:[Lrb;

    aput-object v16, v9, v4

    iget v9, v12, Lrb;->g0:I

    if-eq v9, v8, :cond_f

    invoke-virtual {v12, v4}, Lrb;->j(I)I

    aget-object v9, v11, v18

    invoke-virtual {v9}, Lcb;->e()I

    add-int/lit8 v9, v18, 0x1

    aget-object v24, v11, v9

    invoke-virtual/range {v24 .. v24}, Lcb;->e()I

    aget-object v24, v11, v18

    invoke-virtual/range {v24 .. v24}, Lcb;->e()I

    aget-object v9, v11, v9

    invoke-virtual {v9}, Lcb;->e()I

    iget-object v9, v3, Ll7;->b:Lrb;

    if-nez v9, :cond_1

    iput-object v12, v3, Ll7;->b:Lrb;

    :cond_1
    iput-object v12, v3, Ll7;->d:Lrb;

    iget-object v9, v12, Lrb;->p0:[I

    aget v9, v9, v4

    if-ne v9, v7, :cond_f

    iget-object v8, v12, Lrb;->t:[I

    aget v8, v8, v4

    if-eqz v8, :cond_3

    if-eq v8, v7, :cond_3

    const/4 v7, 0x2

    if-ne v8, v7, :cond_2

    goto :goto_4

    :cond_2
    move/from16 v26, v2

    move/from16 v27, v4

    goto :goto_7

    :cond_3
    :goto_4
    iget v7, v3, Ll7;->j:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v3, Ll7;->j:I

    iget-object v7, v12, Lrb;->k0:[F

    aget v7, v7, v4

    cmpl-float v26, v7, v17

    if-lez v26, :cond_4

    move/from16 v26, v2

    iget v2, v3, Ll7;->k:F

    add-float/2addr v2, v7

    iput v2, v3, Ll7;->k:F

    goto :goto_5

    :cond_4
    move/from16 v26, v2

    :goto_5
    iget v2, v12, Lrb;->g0:I

    move/from16 v27, v4

    const/16 v4, 0x8

    if-eq v2, v4, :cond_8

    const/4 v2, 0x3

    if-ne v9, v2, :cond_8

    if-eqz v8, :cond_5

    if-ne v8, v2, :cond_8

    :cond_5
    cmpg-float v2, v7, v17

    if-gez v2, :cond_6

    move/from16 v2, v22

    iput-boolean v2, v3, Ll7;->n:Z

    goto :goto_6

    :cond_6
    move/from16 v2, v22

    iput-boolean v2, v3, Ll7;->o:Z

    :goto_6
    iget-object v2, v3, Ll7;->h:Ljava/util/ArrayList;

    if-nez v2, :cond_7

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v3, Ll7;->h:Ljava/util/ArrayList;

    :cond_7
    iget-object v2, v3, Ll7;->h:Ljava/util/ArrayList;

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v2, v3, Ll7;->f:Lrb;

    if-nez v2, :cond_9

    iput-object v12, v3, Ll7;->f:Lrb;

    :cond_9
    iget-object v2, v3, Ll7;->g:Lrb;

    if-eqz v2, :cond_a

    iget-object v2, v2, Lrb;->l0:[Lrb;

    aput-object v12, v2, v27

    :cond_a
    iput-object v12, v3, Ll7;->g:Lrb;

    :goto_7
    if-nez v27, :cond_c

    iget v2, v12, Lrb;->r:I

    if-eqz v2, :cond_b

    goto :goto_8

    :cond_b
    iget v2, v12, Lrb;->u:I

    if-nez v2, :cond_e

    iget v2, v12, Lrb;->v:I

    goto :goto_8

    :cond_c
    iget v2, v12, Lrb;->s:I

    if-eqz v2, :cond_d

    goto :goto_8

    :cond_d
    iget v2, v12, Lrb;->x:I

    if-nez v2, :cond_e

    iget v2, v12, Lrb;->y:I

    :cond_e
    :goto_8
    move-object/from16 v2, v21

    goto :goto_9

    :cond_f
    move/from16 v26, v2

    move/from16 v27, v4

    goto :goto_8

    :goto_9
    if-eq v2, v12, :cond_10

    iget-object v2, v2, Lrb;->m0:[Lrb;

    aput-object v12, v2, v27

    :cond_10
    add-int/lit8 v2, v18, 0x1

    aget-object v2, v11, v2

    iget-object v2, v2, Lcb;->f:Lcb;

    if-eqz v2, :cond_11

    iget-object v2, v2, Lcb;->d:Lrb;

    iget-object v4, v2, Lrb;->Q:[Lcb;

    aget-object v4, v4, v18

    iget-object v4, v4, Lcb;->f:Lcb;

    if-eqz v4, :cond_11

    iget-object v4, v4, Lcb;->d:Lrb;

    if-eq v4, v12, :cond_12

    :cond_11
    move-object/from16 v2, v16

    :cond_12
    if-eqz v2, :cond_13

    goto :goto_a

    :cond_13
    move-object v2, v12

    const/16 v19, 0x1

    :goto_a
    move-object/from16 v21, v12

    move/from16 v4, v27

    const/4 v7, 0x3

    const/16 v8, 0x8

    move-object v12, v2

    move/from16 v2, v26

    goto/16 :goto_3

    :cond_14
    move/from16 v26, v2

    move/from16 v27, v4

    iget-object v2, v3, Ll7;->b:Lrb;

    if-eqz v2, :cond_15

    iget-object v2, v2, Lrb;->Q:[Lcb;

    aget-object v2, v2, v18

    invoke-virtual {v2}, Lcb;->e()I

    :cond_15
    iget-object v2, v3, Ll7;->d:Lrb;

    if-eqz v2, :cond_16

    iget-object v2, v2, Lrb;->Q:[Lcb;

    add-int/lit8 v18, v18, 0x1

    aget-object v2, v2, v18

    invoke-virtual {v2}, Lcb;->e()I

    :cond_16
    iput-object v12, v3, Ll7;->c:Lrb;

    if-nez v27, :cond_17

    iget-boolean v2, v3, Ll7;->m:Z

    if-eqz v2, :cond_17

    iput-object v12, v3, Ll7;->e:Lrb;

    goto :goto_b

    :cond_17
    iput-object v5, v3, Ll7;->e:Lrb;

    :goto_b
    iget-boolean v2, v3, Ll7;->o:Z

    if-eqz v2, :cond_18

    iget-boolean v2, v3, Ll7;->n:Z

    if-eqz v2, :cond_18

    const/4 v2, 0x1

    goto :goto_c

    :cond_18
    const/4 v2, 0x0

    :goto_c
    iput-boolean v2, v3, Ll7;->p:Z

    :goto_d
    const/4 v2, 0x1

    goto :goto_e

    :cond_19
    move/from16 v26, v2

    goto :goto_d

    :goto_e
    iput-boolean v2, v3, Ll7;->q:Z

    if-eqz v10, :cond_1b

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    goto :goto_f

    :cond_1a
    move/from16 v17, v13

    const/16 v28, 0x2

    goto/16 :goto_48

    :cond_1b
    :goto_f
    iget-object v11, v3, Ll7;->c:Lrb;

    iget-object v12, v3, Ll7;->b:Lrb;

    iget-object v2, v3, Ll7;->d:Lrb;

    iget-object v4, v3, Ll7;->e:Lrb;

    iget v7, v3, Ll7;->k:F

    iget-object v8, v0, Lrb;->p0:[I

    iget-object v9, v0, Lrb;->Q:[Lcb;

    aget v8, v8, p3

    move-object/from16 v18, v9

    const/4 v9, 0x2

    if-ne v8, v9, :cond_1c

    const/4 v8, 0x1

    goto :goto_10

    :cond_1c
    const/4 v8, 0x0

    :goto_10
    if-nez p3, :cond_20

    iget v9, v4, Lrb;->i0:I

    if-nez v9, :cond_1d

    const/16 v22, 0x1

    :goto_11
    move-object/from16 v19, v6

    const/4 v6, 0x1

    goto :goto_12

    :cond_1d
    const/16 v22, 0x0

    goto :goto_11

    :goto_12
    if-ne v9, v6, :cond_1e

    move/from16 v21, v6

    :goto_13
    const/4 v6, 0x2

    goto :goto_14

    :cond_1e
    const/16 v21, 0x0

    goto :goto_13

    :goto_14
    if-ne v9, v6, :cond_1f

    const/4 v9, 0x1

    goto :goto_15

    :cond_1f
    const/4 v9, 0x0

    :goto_15
    move-object v6, v5

    move/from16 v29, v7

    move/from16 v23, v21

    move/from16 v27, v22

    :goto_16
    const/16 v21, 0x0

    goto :goto_1c

    :cond_20
    move-object/from16 v19, v6

    move v6, v9

    iget v9, v4, Lrb;->j0:I

    if-nez v9, :cond_21

    const/16 v23, 0x1

    :goto_17
    const/4 v6, 0x1

    goto :goto_18

    :cond_21
    const/16 v23, 0x0

    goto :goto_17

    :goto_18
    if-ne v9, v6, :cond_22

    const/16 v21, 0x1

    :goto_19
    const/4 v6, 0x2

    goto :goto_1a

    :cond_22
    const/16 v21, 0x0

    goto :goto_19

    :goto_1a
    if-ne v9, v6, :cond_23

    const/4 v9, 0x1

    goto :goto_1b

    :cond_23
    const/4 v9, 0x0

    :goto_1b
    move-object v6, v5

    move/from16 v29, v7

    move/from16 v27, v23

    move/from16 v23, v21

    goto :goto_16

    :goto_1c
    if-nez v21, :cond_31

    iget-object v7, v6, Lrb;->Q:[Lcb;

    move-object/from16 v33, v7

    iget-object v7, v6, Lrb;->p0:[I

    move-object/from16 v34, v7

    aget-object v7, v33, v15

    if-eqz v9, :cond_24

    const/16 v31, 0x1

    goto :goto_1d

    :cond_24
    const/16 v31, 0x4

    :goto_1d
    invoke-virtual {v7}, Lcb;->e()I

    move-result v35

    move/from16 v36, v8

    aget v8, v34, p3

    move/from16 v37, v9

    const/4 v9, 0x3

    if-ne v8, v9, :cond_25

    iget-object v8, v6, Lrb;->t:[I

    aget v8, v8, p3

    if-nez v8, :cond_25

    const/4 v8, 0x1

    goto :goto_1e

    :cond_25
    const/4 v8, 0x0

    :goto_1e
    iget-object v9, v7, Lcb;->f:Lcb;

    if-eqz v9, :cond_26

    if-eq v6, v5, :cond_26

    invoke-virtual {v9}, Lcb;->e()I

    move-result v9

    add-int v35, v9, v35

    :cond_26
    move/from16 v9, v35

    if-eqz v37, :cond_27

    if-eq v6, v5, :cond_27

    if-eq v6, v12, :cond_27

    const/16 v31, 0x8

    :cond_27
    move-object/from16 v35, v5

    iget-object v5, v7, Lcb;->f:Lcb;

    if-eqz v5, :cond_2b

    if-ne v6, v12, :cond_28

    move/from16 v38, v8

    iget-object v8, v7, Lcb;->i:LFy;

    iget-object v5, v5, Lcb;->i:LFy;

    const/4 v10, 0x6

    invoke-virtual {v1, v8, v5, v9, v10}, Lmo;->f(LFy;LFy;II)V

    goto :goto_1f

    :cond_28
    move/from16 v38, v8

    iget-object v8, v7, Lcb;->i:LFy;

    iget-object v5, v5, Lcb;->i:LFy;

    const/16 v10, 0x8

    invoke-virtual {v1, v8, v5, v9, v10}, Lmo;->f(LFy;LFy;II)V

    :goto_1f
    if-eqz v38, :cond_29

    if-nez v37, :cond_29

    const/16 v31, 0x5

    :cond_29
    if-ne v6, v12, :cond_2a

    if-eqz v37, :cond_2a

    iget-object v5, v6, Lrb;->S:[Z

    aget-boolean v5, v5, p3

    if-eqz v5, :cond_2a

    const/4 v5, 0x5

    goto :goto_20

    :cond_2a
    move/from16 v5, v31

    :goto_20
    iget-object v8, v7, Lcb;->i:LFy;

    iget-object v7, v7, Lcb;->f:Lcb;

    iget-object v7, v7, Lcb;->i:LFy;

    invoke-virtual {v1, v8, v7, v9, v5}, Lmo;->e(LFy;LFy;II)V

    :cond_2b
    if-eqz v36, :cond_2d

    iget v5, v6, Lrb;->g0:I

    const/16 v10, 0x8

    if-eq v5, v10, :cond_2c

    aget v5, v34, p3

    const/4 v9, 0x3

    if-ne v5, v9, :cond_2c

    add-int/lit8 v5, v15, 0x1

    aget-object v5, v33, v5

    iget-object v5, v5, Lcb;->i:LFy;

    aget-object v7, v33, v15

    iget-object v7, v7, Lcb;->i:LFy;

    const/4 v8, 0x0

    const/4 v9, 0x5

    invoke-virtual {v1, v5, v7, v8, v9}, Lmo;->f(LFy;LFy;II)V

    goto :goto_21

    :cond_2c
    const/4 v8, 0x0

    :goto_21
    aget-object v5, v33, v15

    iget-object v5, v5, Lcb;->i:LFy;

    aget-object v7, v18, v15

    iget-object v7, v7, Lcb;->i:LFy;

    const/16 v10, 0x8

    invoke-virtual {v1, v5, v7, v8, v10}, Lmo;->f(LFy;LFy;II)V

    :cond_2d
    add-int/lit8 v5, v15, 0x1

    aget-object v5, v33, v5

    iget-object v5, v5, Lcb;->f:Lcb;

    if-eqz v5, :cond_2e

    iget-object v5, v5, Lcb;->d:Lrb;

    iget-object v7, v5, Lrb;->Q:[Lcb;

    aget-object v7, v7, v15

    iget-object v7, v7, Lcb;->f:Lcb;

    if-eqz v7, :cond_2e

    iget-object v7, v7, Lcb;->d:Lrb;

    if-eq v7, v6, :cond_2f

    :cond_2e
    move-object/from16 v5, v16

    :cond_2f
    if-eqz v5, :cond_30

    move-object v6, v5

    goto :goto_22

    :cond_30
    const/16 v21, 0x1

    :goto_22
    move-object/from16 v10, p2

    move-object/from16 v5, v35

    move/from16 v8, v36

    move/from16 v9, v37

    goto/16 :goto_1c

    :cond_31
    move/from16 v36, v8

    move/from16 v37, v9

    if-eqz v2, :cond_34

    iget-object v5, v11, Lrb;->Q:[Lcb;

    add-int/lit8 v6, v15, 0x1

    aget-object v5, v5, v6

    iget-object v5, v5, Lcb;->f:Lcb;

    if-eqz v5, :cond_34

    iget-object v5, v2, Lrb;->Q:[Lcb;

    aget-object v5, v5, v6

    iget-object v7, v2, Lrb;->p0:[I

    aget v7, v7, p3

    const/4 v9, 0x3

    if-ne v7, v9, :cond_32

    iget-object v7, v2, Lrb;->t:[I

    aget v7, v7, p3

    if-nez v7, :cond_32

    if-nez v37, :cond_32

    iget-object v7, v5, Lcb;->f:Lcb;

    iget-object v8, v7, Lcb;->d:Lrb;

    if-ne v8, v0, :cond_32

    iget-object v8, v5, Lcb;->i:LFy;

    iget-object v7, v7, Lcb;->i:LFy;

    invoke-virtual {v5}, Lcb;->e()I

    move-result v9

    neg-int v9, v9

    const/4 v10, 0x5

    invoke-virtual {v1, v8, v7, v9, v10}, Lmo;->e(LFy;LFy;II)V

    goto :goto_23

    :cond_32
    const/4 v10, 0x5

    if-eqz v37, :cond_33

    iget-object v7, v5, Lcb;->f:Lcb;

    iget-object v8, v7, Lcb;->d:Lrb;

    if-ne v8, v0, :cond_33

    iget-object v8, v5, Lcb;->i:LFy;

    iget-object v7, v7, Lcb;->i:LFy;

    invoke-virtual {v5}, Lcb;->e()I

    move-result v9

    neg-int v9, v9

    const/4 v10, 0x4

    invoke-virtual {v1, v8, v7, v9, v10}, Lmo;->e(LFy;LFy;II)V

    :cond_33
    :goto_23
    iget-object v7, v5, Lcb;->i:LFy;

    iget-object v8, v11, Lrb;->Q:[Lcb;

    aget-object v6, v8, v6

    iget-object v6, v6, Lcb;->f:Lcb;

    iget-object v6, v6, Lcb;->i:LFy;

    invoke-virtual {v5}, Lcb;->e()I

    move-result v5

    neg-int v5, v5

    const/4 v10, 0x6

    invoke-virtual {v1, v7, v6, v5, v10}, Lmo;->g(LFy;LFy;II)V

    :cond_34
    if-eqz v36, :cond_35

    add-int/lit8 v5, v15, 0x1

    aget-object v6, v18, v5

    iget-object v6, v6, Lcb;->i:LFy;

    iget-object v7, v11, Lrb;->Q:[Lcb;

    aget-object v5, v7, v5

    iget-object v7, v5, Lcb;->i:LFy;

    invoke-virtual {v5}, Lcb;->e()I

    move-result v5

    const/16 v10, 0x8

    invoke-virtual {v1, v6, v7, v5, v10}, Lmo;->f(LFy;LFy;II)V

    :cond_35
    iget-object v5, v3, Ll7;->h:Ljava/util/ArrayList;

    if-eqz v5, :cond_3f

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x1

    if-le v6, v7, :cond_3f

    iget-boolean v8, v3, Ll7;->n:Z

    if-eqz v8, :cond_36

    iget-boolean v8, v3, Ll7;->p:Z

    if-nez v8, :cond_36

    iget v8, v3, Ll7;->j:I

    int-to-float v8, v8

    move/from16 v29, v8

    :cond_36
    move-object/from16 v9, v16

    move/from16 v10, v17

    const/4 v8, 0x0

    :goto_24
    if-ge v8, v6, :cond_3f

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v7, v18

    check-cast v7, Lrb;

    iget-object v0, v7, Lrb;->k0:[F

    move-object/from16 v18, v0

    iget-object v0, v7, Lrb;->Q:[Lcb;

    aget v18, v18, p3

    cmpg-float v21, v18, v17

    move-object/from16 v25, v0

    if-gez v21, :cond_38

    iget-boolean v0, v3, Ll7;->p:Z

    if-eqz v0, :cond_37

    add-int/lit8 v0, v15, 0x1

    aget-object v0, v25, v0

    iget-object v0, v0, Lcb;->i:LFy;

    aget-object v7, v25, v15

    iget-object v7, v7, Lcb;->i:LFy;

    move-object/from16 v30, v5

    move/from16 v31, v6

    const/4 v5, 0x0

    const/4 v6, 0x4

    invoke-virtual {v1, v0, v7, v5, v6}, Lmo;->e(LFy;LFy;II)V

    move/from16 v20, v10

    move v10, v5

    goto :goto_25

    :cond_37
    const/high16 v18, 0x3f800000    # 1.0f

    :cond_38
    move-object/from16 v30, v5

    move/from16 v31, v6

    const/4 v6, 0x4

    cmpl-float v0, v18, v17

    if-nez v0, :cond_39

    add-int/lit8 v0, v15, 0x1

    aget-object v0, v25, v0

    iget-object v0, v0, Lcb;->i:LFy;

    aget-object v5, v25, v15

    iget-object v5, v5, Lcb;->i:LFy;

    move/from16 v20, v10

    const/16 v7, 0x8

    const/4 v10, 0x0

    invoke-virtual {v1, v0, v5, v10, v7}, Lmo;->e(LFy;LFy;II)V

    :goto_25
    move/from16 v21, v8

    move/from16 v36, v17

    move/from16 v10, v20

    move/from16 v17, v13

    goto/16 :goto_2a

    :cond_39
    move/from16 v20, v10

    const/4 v10, 0x0

    if-eqz v9, :cond_3e

    iget-object v5, v9, Lrb;->Q:[Lcb;

    aget-object v9, v5, v15

    iget-object v9, v9, Lcb;->i:LFy;

    add-int/lit8 v33, v15, 0x1

    aget-object v5, v5, v33

    iget-object v5, v5, Lcb;->i:LFy;

    aget-object v6, v25, v15

    iget-object v6, v6, Lcb;->i:LFy;

    aget-object v10, v25, v33

    iget-object v10, v10, Lcb;->i:LFy;

    move/from16 v25, v0

    invoke-virtual {v1}, Lmo;->l()LN4;

    move-result-object v0

    move-object/from16 v33, v7

    move/from16 v7, v17

    iput v7, v0, LN4;->b:F

    cmpl-float v17, v29, v7

    move/from16 v36, v7

    const/high16 v7, -0x40800000    # -1.0f

    if-eqz v17, :cond_3a

    cmpl-float v17, v20, v18

    if-nez v17, :cond_3b

    :cond_3a
    move/from16 v21, v8

    move/from16 v17, v13

    move v13, v7

    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_27

    :cond_3b
    cmpl-float v17, v20, v36

    if-nez v17, :cond_3c

    iget-object v6, v0, LN4;->d:LE4;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-virtual {v6, v9, v10}, LE4;->g(LFy;F)V

    iget-object v6, v0, LN4;->d:LE4;

    invoke-virtual {v6, v5, v7}, LE4;->g(LFy;F)V

    :goto_26
    move/from16 v21, v8

    move/from16 v17, v13

    goto :goto_28

    :cond_3c
    const/high16 v7, 0x3f800000    # 1.0f

    if-nez v25, :cond_3d

    iget-object v5, v0, LN4;->d:LE4;

    invoke-virtual {v5, v6, v7}, LE4;->g(LFy;F)V

    iget-object v5, v0, LN4;->d:LE4;

    const/high16 v6, -0x40800000    # -1.0f

    invoke-virtual {v5, v10, v6}, LE4;->g(LFy;F)V

    goto :goto_26

    :cond_3d
    div-float v17, v20, v29

    div-float v20, v18, v29

    move/from16 v21, v8

    div-float v8, v17, v20

    move/from16 v17, v13

    iget-object v13, v0, LN4;->d:LE4;

    invoke-virtual {v13, v9, v7}, LE4;->g(LFy;F)V

    iget-object v7, v0, LN4;->d:LE4;

    const/high16 v13, -0x40800000    # -1.0f

    invoke-virtual {v7, v5, v13}, LE4;->g(LFy;F)V

    iget-object v5, v0, LN4;->d:LE4;

    invoke-virtual {v5, v10, v8}, LE4;->g(LFy;F)V

    iget-object v5, v0, LN4;->d:LE4;

    neg-float v7, v8

    invoke-virtual {v5, v6, v7}, LE4;->g(LFy;F)V

    goto :goto_28

    :goto_27
    iget-object v8, v0, LN4;->d:LE4;

    invoke-virtual {v8, v9, v7}, LE4;->g(LFy;F)V

    iget-object v8, v0, LN4;->d:LE4;

    invoke-virtual {v8, v5, v13}, LE4;->g(LFy;F)V

    iget-object v5, v0, LN4;->d:LE4;

    invoke-virtual {v5, v10, v7}, LE4;->g(LFy;F)V

    iget-object v5, v0, LN4;->d:LE4;

    invoke-virtual {v5, v6, v13}, LE4;->g(LFy;F)V

    :goto_28
    invoke-virtual {v1, v0}, Lmo;->c(LN4;)V

    goto :goto_29

    :cond_3e
    move-object/from16 v33, v7

    move/from16 v21, v8

    move/from16 v36, v17

    move/from16 v17, v13

    :goto_29
    move/from16 v10, v18

    move-object/from16 v9, v33

    :goto_2a
    add-int/lit8 v8, v21, 0x1

    const/4 v7, 0x1

    move-object/from16 v0, p0

    move/from16 v13, v17

    move-object/from16 v5, v30

    move/from16 v6, v31

    move/from16 v17, v36

    goto/16 :goto_24

    :cond_3f
    move/from16 v17, v13

    if-eqz v12, :cond_40

    if-eq v12, v2, :cond_41

    if-eqz v37, :cond_40

    goto :goto_2b

    :cond_40
    move-object v0, v2

    const/16 v28, 0x2

    goto :goto_31

    :cond_41
    :goto_2b
    aget-object v0, v19, v15

    iget-object v3, v11, Lrb;->Q:[Lcb;

    add-int/lit8 v5, v15, 0x1

    aget-object v3, v3, v5

    iget-object v0, v0, Lcb;->f:Lcb;

    if-eqz v0, :cond_42

    iget-object v0, v0, Lcb;->i:LFy;

    goto :goto_2c

    :cond_42
    move-object/from16 v0, v16

    :goto_2c
    iget-object v6, v3, Lcb;->f:Lcb;

    if-eqz v6, :cond_43

    iget-object v6, v6, Lcb;->i:LFy;

    goto :goto_2d

    :cond_43
    move-object/from16 v6, v16

    :goto_2d
    iget-object v7, v12, Lrb;->Q:[Lcb;

    aget-object v7, v7, v15

    if-eqz v2, :cond_44

    iget-object v3, v2, Lrb;->Q:[Lcb;

    aget-object v3, v3, v5

    :cond_44
    if-eqz v0, :cond_46

    if-eqz v6, :cond_46

    if-nez p3, :cond_45

    iget v4, v4, Lrb;->d0:F

    :goto_2e
    move v5, v4

    goto :goto_2f

    :cond_45
    iget v4, v4, Lrb;->e0:F

    goto :goto_2e

    :goto_2f
    invoke-virtual {v7}, Lcb;->e()I

    move-result v4

    invoke-virtual {v3}, Lcb;->e()I

    move-result v8

    iget-object v7, v7, Lcb;->i:LFy;

    iget-object v3, v3, Lcb;->i:LFy;

    const/4 v9, 0x7

    move-object/from16 v28, v3

    move-object v3, v0

    move-object v0, v2

    move-object v2, v7

    move-object/from16 v7, v28

    const/16 v28, 0x2

    invoke-virtual/range {v1 .. v9}, Lmo;->b(LFy;LFy;IFLFy;LFy;II)V

    goto :goto_30

    :cond_46
    move-object v0, v2

    const/16 v28, 0x2

    :cond_47
    :goto_30
    move-object/from16 v1, p1

    goto/16 :goto_45

    :goto_31
    if-eqz v27, :cond_59

    if-eqz v12, :cond_59

    iget v1, v3, Ll7;->j:I

    if-lez v1, :cond_48

    iget v2, v3, Ll7;->i:I

    if-ne v2, v1, :cond_48

    const/16 v22, 0x1

    goto :goto_32

    :cond_48
    const/16 v22, 0x0

    :goto_32
    move-object v10, v12

    move-object v13, v10

    :goto_33
    if-eqz v10, :cond_47

    iget-object v1, v10, Lrb;->Q:[Lcb;

    iget-object v2, v10, Lrb;->m0:[Lrb;

    aget-object v2, v2, p3

    :goto_34
    if-eqz v2, :cond_49

    iget v3, v2, Lrb;->g0:I

    const/16 v4, 0x8

    if-ne v3, v4, :cond_4a

    iget-object v2, v2, Lrb;->m0:[Lrb;

    aget-object v2, v2, p3

    goto :goto_34

    :cond_49
    const/16 v4, 0x8

    :cond_4a
    if-nez v2, :cond_4c

    if-ne v10, v0, :cond_4b

    goto :goto_35

    :cond_4b
    move-object/from16 v18, v2

    move-object/from16 v20, v19

    const/16 v32, 0x5

    move-object/from16 v19, v13

    move v13, v4

    goto/16 :goto_3b

    :cond_4c
    :goto_35
    aget-object v3, v1, v15

    iget-object v5, v3, Lcb;->i:LFy;

    iget-object v6, v3, Lcb;->f:Lcb;

    if-eqz v6, :cond_4d

    iget-object v6, v6, Lcb;->i:LFy;

    goto :goto_36

    :cond_4d
    move-object/from16 v6, v16

    :goto_36
    if-eq v13, v10, :cond_4e

    iget-object v6, v13, Lrb;->Q:[Lcb;

    add-int/lit8 v7, v15, 0x1

    aget-object v6, v6, v7

    iget-object v6, v6, Lcb;->i:LFy;

    goto :goto_37

    :cond_4e
    if-ne v10, v12, :cond_50

    aget-object v6, v19, v15

    iget-object v6, v6, Lcb;->f:Lcb;

    if-eqz v6, :cond_4f

    iget-object v6, v6, Lcb;->i:LFy;

    goto :goto_37

    :cond_4f
    move-object/from16 v6, v16

    :cond_50
    :goto_37
    invoke-virtual {v3}, Lcb;->e()I

    move-result v3

    add-int/lit8 v7, v15, 0x1

    aget-object v8, v1, v7

    invoke-virtual {v8}, Lcb;->e()I

    move-result v8

    if-eqz v2, :cond_51

    iget-object v9, v2, Lrb;->Q:[Lcb;

    aget-object v9, v9, v15

    iget-object v4, v9, Lcb;->i:LFy;

    goto :goto_38

    :cond_51
    iget-object v4, v11, Lrb;->Q:[Lcb;

    aget-object v4, v4, v7

    iget-object v9, v4, Lcb;->f:Lcb;

    if-eqz v9, :cond_52

    iget-object v4, v9, Lcb;->i:LFy;

    goto :goto_38

    :cond_52
    move-object/from16 v4, v16

    :goto_38
    aget-object v1, v1, v7

    iget-object v1, v1, Lcb;->i:LFy;

    if-eqz v9, :cond_53

    invoke-virtual {v9}, Lcb;->e()I

    move-result v9

    add-int/2addr v8, v9

    :cond_53
    iget-object v9, v13, Lrb;->Q:[Lcb;

    aget-object v9, v9, v7

    invoke-virtual {v9}, Lcb;->e()I

    move-result v9

    add-int/2addr v9, v3

    if-eqz v5, :cond_57

    if-eqz v6, :cond_57

    if-eqz v4, :cond_57

    if-eqz v1, :cond_57

    if-ne v10, v12, :cond_54

    iget-object v3, v12, Lrb;->Q:[Lcb;

    aget-object v3, v3, v15

    invoke-virtual {v3}, Lcb;->e()I

    move-result v9

    :cond_54
    if-ne v10, v0, :cond_55

    iget-object v3, v0, Lrb;->Q:[Lcb;

    aget-object v3, v3, v7

    invoke-virtual {v3}, Lcb;->e()I

    move-result v8

    :cond_55
    move-object v3, v6

    move-object v6, v4

    move v4, v9

    if-eqz v22, :cond_56

    const/16 v9, 0x8

    :goto_39
    move-object v7, v2

    move-object v2, v5

    goto :goto_3a

    :cond_56
    const/4 v9, 0x5

    goto :goto_39

    :goto_3a
    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v18, v7

    move-object/from16 v20, v19

    const/16 v32, 0x5

    move-object v7, v1

    move-object/from16 v19, v13

    const/16 v13, 0x8

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v9}, Lmo;->b(LFy;LFy;IFLFy;LFy;II)V

    goto :goto_3b

    :cond_57
    move-object/from16 v18, v2

    move-object/from16 v20, v19

    const/16 v32, 0x5

    move-object/from16 v19, v13

    const/16 v13, 0x8

    :goto_3b
    iget v1, v10, Lrb;->g0:I

    if-eq v1, v13, :cond_58

    move-object/from16 v19, v10

    :cond_58
    move-object/from16 v10, v18

    move-object/from16 v13, v19

    move-object/from16 v19, v20

    goto/16 :goto_33

    :cond_59
    move-object/from16 v20, v19

    const/16 v13, 0x8

    if-eqz v23, :cond_47

    if-eqz v12, :cond_47

    iget v1, v3, Ll7;->j:I

    if-lez v1, :cond_5a

    iget v2, v3, Ll7;->i:I

    if-ne v2, v1, :cond_5a

    const/16 v22, 0x1

    goto :goto_3c

    :cond_5a
    const/16 v22, 0x0

    :goto_3c
    move-object v1, v12

    move-object v10, v1

    :goto_3d
    if-eqz v10, :cond_65

    iget-object v2, v10, Lrb;->Q:[Lcb;

    iget-object v3, v10, Lrb;->m0:[Lrb;

    aget-object v3, v3, p3

    :goto_3e
    if-eqz v3, :cond_5b

    iget v4, v3, Lrb;->g0:I

    if-ne v4, v13, :cond_5b

    iget-object v3, v3, Lrb;->m0:[Lrb;

    aget-object v3, v3, p3

    goto :goto_3e

    :cond_5b
    if-eq v10, v12, :cond_63

    if-eq v10, v0, :cond_63

    if-eqz v3, :cond_63

    if-ne v3, v0, :cond_5c

    move-object/from16 v3, v16

    :cond_5c
    aget-object v4, v2, v15

    move-object v5, v2

    iget-object v2, v4, Lcb;->i:LFy;

    iget-object v6, v1, Lrb;->Q:[Lcb;

    add-int/lit8 v7, v15, 0x1

    aget-object v6, v6, v7

    iget-object v6, v6, Lcb;->i:LFy;

    invoke-virtual {v4}, Lcb;->e()I

    move-result v4

    aget-object v8, v5, v7

    invoke-virtual {v8}, Lcb;->e()I

    move-result v8

    if-eqz v3, :cond_5e

    iget-object v5, v3, Lrb;->Q:[Lcb;

    aget-object v5, v5, v15

    iget-object v9, v5, Lcb;->i:LFy;

    iget-object v13, v5, Lcb;->f:Lcb;

    if-eqz v13, :cond_5d

    iget-object v13, v13, Lcb;->i:LFy;

    goto :goto_40

    :cond_5d
    move-object/from16 v13, v16

    goto :goto_40

    :cond_5e
    iget-object v9, v0, Lrb;->Q:[Lcb;

    aget-object v9, v9, v15

    if-eqz v9, :cond_5f

    iget-object v13, v9, Lcb;->i:LFy;

    goto :goto_3f

    :cond_5f
    move-object/from16 v13, v16

    :goto_3f
    aget-object v5, v5, v7

    iget-object v5, v5, Lcb;->i:LFy;

    move-object/from16 v39, v13

    move-object v13, v5

    move-object v5, v9

    move-object/from16 v9, v39

    :goto_40
    if-eqz v5, :cond_60

    invoke-virtual {v5}, Lcb;->e()I

    move-result v5

    add-int/2addr v8, v5

    :cond_60
    iget-object v5, v1, Lrb;->Q:[Lcb;

    aget-object v5, v5, v7

    invoke-virtual {v5}, Lcb;->e()I

    move-result v5

    add-int/2addr v4, v5

    move-object v5, v3

    move-object v3, v6

    move-object v6, v9

    if-eqz v22, :cond_61

    const/16 v9, 0x8

    goto :goto_41

    :cond_61
    const/4 v9, 0x4

    :goto_41
    if-eqz v2, :cond_62

    if-eqz v3, :cond_62

    if-eqz v6, :cond_62

    if-eqz v13, :cond_62

    move-object v7, v5

    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v18, v7

    move-object v7, v13

    const/16 v31, 0x4

    move-object v13, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v9}, Lmo;->b(LFy;LFy;IFLFy;LFy;II)V

    goto :goto_42

    :cond_62
    move-object v13, v1

    move-object/from16 v18, v5

    const/16 v31, 0x4

    move-object/from16 v1, p1

    :goto_42
    move-object/from16 v3, v18

    goto :goto_43

    :cond_63
    move-object v13, v1

    const/16 v31, 0x4

    move-object/from16 v1, p1

    :goto_43
    iget v2, v10, Lrb;->g0:I

    const/16 v4, 0x8

    if-eq v2, v4, :cond_64

    move-object v13, v10

    :cond_64
    move-object v10, v3

    move-object v1, v13

    move v13, v4

    goto/16 :goto_3d

    :cond_65
    move-object/from16 v1, p1

    iget-object v2, v12, Lrb;->Q:[Lcb;

    aget-object v2, v2, v15

    aget-object v3, v20, v15

    iget-object v3, v3, Lcb;->f:Lcb;

    iget-object v4, v0, Lrb;->Q:[Lcb;

    add-int/lit8 v5, v15, 0x1

    aget-object v10, v4, v5

    iget-object v4, v11, Lrb;->Q:[Lcb;

    aget-object v4, v4, v5

    iget-object v13, v4, Lcb;->f:Lcb;

    const/4 v9, 0x5

    if-eqz v3, :cond_67

    if-eq v12, v0, :cond_66

    iget-object v4, v2, Lcb;->i:LFy;

    iget-object v3, v3, Lcb;->i:LFy;

    invoke-virtual {v2}, Lcb;->e()I

    move-result v2

    invoke-virtual {v1, v4, v3, v2, v9}, Lmo;->e(LFy;LFy;II)V

    goto :goto_44

    :cond_66
    if-eqz v13, :cond_67

    move-object v4, v2

    iget-object v2, v4, Lcb;->i:LFy;

    iget-object v3, v3, Lcb;->i:LFy;

    invoke-virtual {v4}, Lcb;->e()I

    move-result v4

    iget-object v6, v10, Lcb;->i:LFy;

    iget-object v7, v13, Lcb;->i:LFy;

    invoke-virtual {v10}, Lcb;->e()I

    move-result v8

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual/range {v1 .. v9}, Lmo;->b(LFy;LFy;IFLFy;LFy;II)V

    :cond_67
    :goto_44
    if-eqz v13, :cond_68

    if-eq v12, v0, :cond_68

    iget-object v2, v10, Lcb;->i:LFy;

    iget-object v3, v13, Lcb;->i:LFy;

    invoke-virtual {v10}, Lcb;->e()I

    move-result v4

    neg-int v4, v4

    invoke-virtual {v1, v2, v3, v4, v9}, Lmo;->e(LFy;LFy;II)V

    :cond_68
    :goto_45
    if-nez v27, :cond_69

    if-eqz v23, :cond_70

    :cond_69
    if-eqz v12, :cond_70

    if-eq v12, v0, :cond_70

    iget-object v2, v12, Lrb;->Q:[Lcb;

    aget-object v3, v2, v15

    if-nez v0, :cond_6a

    move-object v0, v12

    :cond_6a
    iget-object v4, v0, Lrb;->Q:[Lcb;

    add-int/lit8 v5, v15, 0x1

    aget-object v6, v4, v5

    iget-object v7, v3, Lcb;->f:Lcb;

    if-eqz v7, :cond_6b

    iget-object v7, v7, Lcb;->i:LFy;

    goto :goto_46

    :cond_6b
    move-object/from16 v7, v16

    :goto_46
    iget-object v8, v6, Lcb;->f:Lcb;

    if-eqz v8, :cond_6c

    iget-object v8, v8, Lcb;->i:LFy;

    goto :goto_47

    :cond_6c
    move-object/from16 v8, v16

    :goto_47
    if-eq v11, v0, :cond_6e

    iget-object v8, v11, Lrb;->Q:[Lcb;

    aget-object v8, v8, v5

    iget-object v8, v8, Lcb;->f:Lcb;

    if-eqz v8, :cond_6d

    iget-object v8, v8, Lcb;->i:LFy;

    move-object/from16 v16, v8

    :cond_6d
    move-object/from16 v8, v16

    :cond_6e
    if-ne v12, v0, :cond_6f

    aget-object v6, v2, v5

    :cond_6f
    if-eqz v7, :cond_70

    if-eqz v8, :cond_70

    move-object v0, v4

    invoke-virtual {v3}, Lcb;->e()I

    move-result v4

    aget-object v0, v0, v5

    invoke-virtual {v0}, Lcb;->e()I

    move-result v0

    iget-object v2, v3, Lcb;->i:LFy;

    iget-object v3, v6, Lcb;->i:LFy;

    const/4 v9, 0x5

    const/high16 v5, 0x3f000000    # 0.5f

    move-object v6, v7

    move-object v7, v3

    move-object v3, v6

    move-object v6, v8

    move v8, v0

    invoke-virtual/range {v1 .. v9}, Lmo;->b(LFy;LFy;IFLFy;LFy;II)V

    :cond_70
    :goto_48
    add-int/lit8 v2, v26, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    move/from16 v13, v17

    goto/16 :goto_2

    :cond_71
    return-void
.end method

.method public static G([LMt;[LMt;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    array-length v1, p0

    array-length v2, p1

    if-eq v1, v2, :cond_1

    return v0

    :cond_1
    move v1, v0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_4

    aget-object v2, p0, v1

    iget-char v3, v2, LMt;->a:C

    aget-object v4, p1, v1

    iget-char v5, v4, LMt;->a:C

    if-ne v3, v5, :cond_3

    iget-object v2, v2, LMt;->b:[F

    array-length v2, v2

    iget-object v3, v4, LMt;->b:[F

    array-length v3, v3

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0

    :cond_4
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_2
    return v0
.end method

.method public static H([B)[B
    .locals 3

    new-instance v0, Ljava/util/zip/Deflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/zip/Deflater;-><init>(I)V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    new-instance v2, Ljava/util/zip/DeflaterOutputStream;

    invoke-direct {v2, v1, v0}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_3
    invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    throw p0
.end method

.method public static I([FI)[F
    .locals 2

    if-ltz p1, :cond_1

    array-length v0, p0

    if-ltz v0, :cond_0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array p1, p1, [F

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static J(Ljava/lang/Object;)Lvx;
    .locals 2

    new-instance v0, Lvx;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    instance-of v1, p0, Ljava/lang/Class;

    if-eqz v1, :cond_0

    check-cast p0, Ljava/lang/Class;

    iput-object p0, v0, Lvx;->b:Ljava/io/Serializable;

    return-object v0

    :cond_0
    iput-object p0, v0, Lvx;->c:Ljava/lang/Object;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    iput-object p0, v0, Lvx;->b:Ljava/io/Serializable;

    return-object v0
.end method

.method public static K([LEd;[B)[B
    .locals 8

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v4, p0, v2

    iget-object v5, v4, LEd;->a:Ljava/lang/String;

    iget-object v6, v4, LEd;->b:Ljava/lang/String;

    invoke-static {v5, v6, p1}, LfG;->S(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    array-length v5, v5

    add-int/lit8 v5, v5, 0x10

    iget v6, v4, LEd;->e:I

    mul-int/lit8 v6, v6, 0x2

    add-int/2addr v6, v5

    iget v5, v4, LEd;->f:I

    add-int/2addr v6, v5

    iget v4, v4, LEd;->g:I

    mul-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x7

    and-int/lit8 v4, v4, -0x8

    div-int/lit8 v4, v4, 0x8

    add-int/2addr v4, v6

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    sget-object v2, LDc;->l:[B

    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_1

    array-length v2, p0

    :goto_1
    if-ge v1, v2, :cond_3

    aget-object v4, p0, v1

    iget-object v5, v4, LEd;->a:Ljava/lang/String;

    iget-object v6, v4, LEd;->b:Ljava/lang/String;

    invoke-static {v5, v6, p1}, LfG;->S(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v4, v5}, LfG;->v0(Ljava/io/ByteArrayOutputStream;LEd;Ljava/lang/String;)V

    invoke-static {v0, v4}, LfG;->u0(Ljava/io/ByteArrayOutputStream;LEd;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    array-length v2, p0

    move v4, v1

    :goto_2
    if-ge v4, v2, :cond_2

    aget-object v5, p0, v4

    iget-object v6, v5, LEd;->a:Ljava/lang/String;

    iget-object v7, v5, LEd;->b:Ljava/lang/String;

    invoke-static {v6, v7, p1}, LfG;->S(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v5, v6}, LfG;->v0(Ljava/io/ByteArrayOutputStream;LEd;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    array-length p1, p0

    :goto_3
    if-ge v1, p1, :cond_3

    aget-object v2, p0, v1

    invoke-static {v0, v2}, LfG;->u0(Ljava/io/ByteArrayOutputStream;LEd;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p0

    if-ne p0, v3, :cond_4

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "The bytes saved do not match expectation. actual="

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " expected="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static L(I)LTB;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    new-instance p0, LPw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    :cond_0
    new-instance p0, Lnc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    :cond_1
    new-instance p0, LPw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method

.method public static M(Ljava/lang/String;)[LMt;
    .locals 17

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    move v5, v2

    const/4 v4, 0x1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v4, v6, :cond_f

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    const/16 v7, 0x45

    const/16 v8, 0x65

    if-ge v4, v6, :cond_2

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    add-int/lit8 v9, v6, -0x41

    add-int/lit8 v10, v6, -0x5a

    mul-int/2addr v10, v9

    if-lez v10, :cond_0

    add-int/lit8 v9, v6, -0x61

    add-int/lit8 v10, v6, -0x7a

    mul-int/2addr v10, v9

    if-gtz v10, :cond_1

    :cond_0
    if-eq v6, v8, :cond_1

    if-eq v6, v7, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_e

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v9, 0x7a

    if-eq v6, v9, :cond_d

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v9, 0x5a

    if-ne v6, v9, :cond_3

    goto/16 :goto_c

    :cond_3
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    new-array v6, v6, [F

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v9

    move v11, v2

    const/4 v10, 0x1

    :goto_3
    if-ge v10, v9, :cond_c

    move v13, v2

    move v14, v13

    move v15, v14

    move/from16 v16, v15

    move v12, v10

    :goto_4
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v12, v3, :cond_9

    invoke-virtual {v5, v12}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v2, 0x20

    if-eq v3, v2, :cond_7

    if-eq v3, v7, :cond_6

    if-eq v3, v8, :cond_6

    packed-switch v3, :pswitch_data_0

    goto :goto_6

    :pswitch_0
    if-nez v14, :cond_4

    const/4 v13, 0x0

    const/4 v14, 0x1

    goto :goto_7

    :cond_4
    :goto_5
    const/4 v13, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x1

    goto :goto_7

    :pswitch_1
    if-eq v12, v10, :cond_5

    if-nez v13, :cond_5

    goto :goto_5

    :cond_5
    :goto_6
    const/4 v13, 0x0

    goto :goto_7

    :cond_6
    const/4 v13, 0x1

    goto :goto_7

    :cond_7
    :pswitch_2
    const/4 v13, 0x0

    const/4 v15, 0x1

    :goto_7
    if-eqz v15, :cond_8

    goto :goto_8

    :cond_8
    add-int/lit8 v12, v12, 0x1

    const/4 v2, 0x0

    goto :goto_4

    :cond_9
    :goto_8
    if-ge v10, v12, :cond_a

    add-int/lit8 v2, v11, 0x1

    invoke-virtual {v5, v10, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    aput v3, v6, v11

    move v11, v2

    goto :goto_9

    :catch_0
    move-exception v0

    goto :goto_b

    :cond_a
    :goto_9
    if-eqz v16, :cond_b

    move v10, v12

    :goto_a
    const/4 v2, 0x0

    goto :goto_3

    :cond_b
    add-int/lit8 v10, v12, 0x1

    goto :goto_a

    :cond_c
    invoke-static {v6, v11}, LfG;->I([FI)[F

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v2

    const/4 v2, 0x0

    goto :goto_d

    :goto_b
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "error in parsing \""

    const-string v3, "\""

    invoke-static {v2, v5, v3}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_d
    :goto_c
    new-array v3, v2, [F

    :goto_d
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    new-instance v2, LMt;

    invoke-direct {v2, v5, v3}, LMt;-><init>(C[F)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    add-int/lit8 v2, v4, 0x1

    move v5, v4

    move v4, v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_f
    sub-int/2addr v4, v5

    const/4 v2, 0x1

    if-ne v4, v2, :cond_10

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v5, v2, :cond_10

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/4 v2, 0x0

    new-array v3, v2, [F

    new-instance v4, LMt;

    invoke-direct {v4, v0, v3}, LMt;-><init>(C[F)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_10
    const/4 v2, 0x0

    :goto_e
    new-array v0, v2, [LMt;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LMt;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static N(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lw4;)Landroid/graphics/Bitmap;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x22

    if-ne v0, v2, :cond_6

    const/4 v3, 0x0

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    sget-object v2, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-eq v0, v2, :cond_1

    :goto_0
    move v0, v3

    goto :goto_1

    :cond_1
    sget-object v0, Lcr;->b:LBb;

    invoke-virtual {v0}, LBb;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_6

    :try_start_0
    invoke-virtual {p2}, Lw4;->y()Z

    move-result p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move p2, v3

    :goto_2
    if-eqz p2, :cond_6

    iget-object p2, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    sget-object v0, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne p2, v0, :cond_2

    const/4 v3, 0x1

    :cond_2
    const-string p2, ""

    invoke-static {p2, v3}, LQj;->f(Ljava/lang/String;Z)V

    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object p2, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    :try_start_1
    invoke-static {p0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez p0, :cond_4

    if-eqz p0, :cond_3

    goto :goto_4

    :cond_3
    :goto_3
    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    goto :goto_5

    :cond_4
    :try_start_2
    invoke-static {p0}, LfG;->l0(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_3

    :goto_5
    return-object v1

    :catchall_0
    move-exception p2

    move-object v1, p0

    goto :goto_6

    :catchall_1
    move-exception p2

    :goto_6
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_5
    sget-object p0, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    iput-object p0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    throw p2

    :cond_6
    invoke-static {p0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static P([LMt;)[LMt;
    .locals 4

    array-length v0, p0

    new-array v0, v0, [LMt;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    new-instance v2, LMt;

    aget-object v3, p0, v1

    invoke-direct {v2, v3}, LMt;-><init>(LMt;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static Q(Ljava/io/File;)Z
    .locals 6

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    array-length v2, p0

    move v3, v0

    move v4, v1

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v5, p0, v3

    invoke-static {v5}, LfG;->Q(Ljava/io/File;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-eqz v4, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v4

    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    return v1
.end method

.method public static R(Lorg/luckypray/dexkit/DexKitBridge;La;)LC9;
    .locals 16

    move-object/from16 v0, p1

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v3, v0, La;->b:Ljava/nio/ByteBuffer;

    iget v4, v0, La;->a:I

    add-int/2addr v1, v4

    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    move v5, v1

    goto :goto_0

    :cond_0
    move v5, v2

    :goto_0
    const/4 v1, 0x6

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v1

    if-eqz v1, :cond_1

    iget-object v3, v0, La;->b:Ljava/nio/ByteBuffer;

    iget v4, v0, La;->a:I

    add-int/2addr v1, v4

    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    move v6, v1

    goto :goto_1

    :cond_1
    move v6, v2

    :goto_1
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v1

    if-eqz v1, :cond_2

    iget v3, v0, La;->a:I

    add-int/2addr v1, v3

    invoke-virtual {v0, v1}, La;->d(I)Ljava/lang/String;

    :cond_2
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v1

    if-eqz v1, :cond_3

    iget-object v3, v0, La;->b:Ljava/nio/ByteBuffer;

    iget v4, v0, La;->a:I

    add-int/2addr v1, v4

    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    move v7, v1

    goto :goto_2

    :cond_3
    move v7, v2

    :goto_2
    const/16 v1, 0xc

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    iget v4, v0, La;->a:I

    add-int/2addr v1, v4

    invoke-virtual {v0, v1}, La;->d(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_4
    move-object v1, v3

    :goto_3
    if-nez v1, :cond_5

    const-string v1, ""

    :cond_5
    move-object v8, v1

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v1

    if-eqz v1, :cond_6

    iget-object v4, v0, La;->b:Ljava/nio/ByteBuffer;

    iget v9, v0, La;->a:I

    add-int/2addr v1, v9

    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    goto :goto_4

    :cond_6
    move v1, v2

    :goto_4
    const/4 v4, -0x1

    if-ne v1, v4, :cond_7

    :goto_5
    move-object v9, v3

    goto :goto_6

    :cond_7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_5

    :goto_6
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v0, v3}, La;->f(I)I

    move-result v3

    goto :goto_7

    :cond_8
    move v3, v2

    :goto_7
    move v4, v2

    :goto_8
    if-ge v4, v3, :cond_a

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v11

    if-eqz v11, :cond_9

    iget-object v12, v0, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v11}, La;->e(I)I

    move-result v11

    mul-int/lit8 v13, v4, 0x4

    add-int/2addr v13, v11

    invoke-virtual {v12, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v11

    goto :goto_9

    :cond_9
    move v11, v2

    :goto_9
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_a
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v0, v3}, La;->f(I)I

    move-result v3

    goto :goto_a

    :cond_b
    move v3, v2

    :goto_a
    move v4, v2

    :goto_b
    if-ge v4, v3, :cond_d

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v12

    if-eqz v12, :cond_c

    iget-object v13, v0, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v12}, La;->e(I)I

    move-result v12

    mul-int/lit8 v14, v4, 0x4

    add-int/2addr v14, v12

    invoke-virtual {v13, v14}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v12

    goto :goto_c

    :cond_c
    move v12, v2

    :goto_c
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_d
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v0, v3}, La;->f(I)I

    move-result v3

    goto :goto_d

    :cond_e
    move v3, v2

    :goto_d
    move v4, v2

    :goto_e
    if-ge v4, v3, :cond_10

    invoke-virtual {v0, v1}, La;->b(I)I

    move-result v13

    if-eqz v13, :cond_f

    iget-object v14, v0, La;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v13}, La;->e(I)I

    move-result v13

    mul-int/lit8 v15, v4, 0x4

    add-int/2addr v15, v13

    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v13

    goto :goto_f

    :cond_f
    move v13, v2

    :goto_f
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    :cond_10
    new-instance v3, LC9;

    move-object/from16 v4, p0

    invoke-direct/range {v3 .. v12}, LC9;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIILjava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v3
.end method

.method public static S(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;
    .locals 6

    sget-object v0, LDc;->m:[B

    sget-object v1, LDc;->n:[B

    invoke-static {p2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    const-string v3, "!"

    const-string v4, ":"

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    move-object v2, v4

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-gtz v5, :cond_3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const-string v5, "classes.dex"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    return-object p0

    :cond_4
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {p1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v2, ".apk"

    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    if-eqz p0, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    if-eqz p0, :cond_8

    :goto_2
    move-object v3, v4

    :cond_8
    invoke-static {v2, v3, p1}, LEy;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9
    :goto_3
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_a

    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_a
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_b
    :goto_4
    return-object p1
.end method

.method public static T(Ljava/lang/String;)Lfn;
    .locals 2

    sget-object v0, LOv;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const-class v0, LOv;

    monitor-enter v0

    :try_start_0
    sget-object v1, LOv;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfn;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "cannot find key template: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static U(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-static {}, Lyw;->b()Lyw;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lyw;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static V(Ljava/util/List;Ljava/io/InputStream;Lzp;)I
    .locals 4

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ldv;

    invoke-direct {v1, p1, p2}, Ldv;-><init>(Ljava/io/InputStream;Lzp;)V

    move-object p1, v1

    :cond_1
    const/high16 v1, 0x500000

    invoke-virtual {p1, v1}, Ljava/io/InputStream;->mark(I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldl;

    :try_start_0
    invoke-interface {v3, p1, p2}, Ldl;->b(Ljava/io/InputStream;Lzp;)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    if-eq v3, v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    throw p0

    :cond_3
    :goto_1
    return v0
.end method

.method public static W(Ljava/util/List;Ljava/io/InputStream;Lzp;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 3

    if-nez p1, :cond_0

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ldv;

    invoke-direct {v0, p1, p2}, Ldv;-><init>(Ljava/io/InputStream;Lzp;)V

    move-object p1, v0

    :cond_1
    const/high16 p2, 0x500000

    invoke-virtual {p1, p2}, Ljava/io/InputStream;->mark(I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_3

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldl;

    :try_start_0
    invoke-interface {v1, p1}, Ldl;->f(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    sget-object v2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v1, v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    throw p0

    :cond_3
    sget-object v1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    :goto_1
    return-object v1
.end method

.method public static X(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 5

    if-nez p1, :cond_0

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldl;

    :try_start_0
    invoke-interface {v3, p1}, Ldl;->a(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v4, Lt6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v4

    check-cast v4, Ljava/nio/ByteBuffer;

    sget-object v4, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v3, v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-object v0, Lt6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    throw p0

    :cond_2
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0
.end method

.method public static Y(Landroid/app/Application;)Z
    .locals 2

    const-wide v0, -0x20ea1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x80

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    const-wide v0, -0x20eadfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_0

    const-wide v0, -0x20d45fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static Z(Lac;Lac;)Lac;
    .locals 2

    sget-object v0, LIf;->a:LIf;

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LH7;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, LH7;-><init>(I)V

    invoke-interface {p1, p0, v0}, Lac;->q(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lac;

    return-object p0
.end method

.method public static a0(Ljava/io/InputStream;I)[B
    .locals 3

    new-array v0, p1, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    sub-int v2, p1, v1

    invoke-virtual {p0, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-ltz v2, :cond_0

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    const-string p0, "Not enough bytes to read: "

    invoke-static {p1, p0}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object v0
.end method

.method public static b0(Ljava/io/ByteArrayInputStream;I)[I
    .locals 5

    new-array v0, p1, [I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, p1, :cond_0

    const/4 v3, 0x2

    invoke-static {p0, v3}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v3

    long-to-int v3, v3

    add-int/2addr v2, v3

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static c0(Ljava/io/FileInputStream;II)[B
    .locals 8

    new-instance v0, Ljava/util/zip/Inflater;

    invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V

    :try_start_0
    new-array v1, p2, [B

    const/16 v2, 0x800

    new-array v2, v2, [B

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsDictionary()Z

    move-result v6

    if-nez v6, :cond_1

    if-ge v4, p1, :cond_1

    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v6

    if-ltz v6, :cond_0

    invoke-virtual {v0, v2, v3, v6}, Ljava/util/zip/Inflater;->setInput([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int v7, p2, v5

    :try_start_1
    invoke-virtual {v0, v1, v5, v7}, Ljava/util/zip/Inflater;->inflate([BII)I

    move-result v7
    :try_end_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/2addr v5, v7

    add-int/2addr v4, v6

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception p0

    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-ne v4, p1, :cond_3

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p0, :cond_2

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    return-object v1

    :cond_2
    :try_start_3
    const-string p0, "Inflater did not finish"

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Didn\'t read enough bytes during decompression. expected="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " actual="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    throw p0
.end method

.method public static d0(Ljava/io/FileInputStream;[B[B[LEd;)[LEd;
    .locals 6

    sget-object v0, LDc;->o:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    const-string v2, "Unsupported meta version"

    const-string v3, "Content found after the end of file"

    const/4 v4, 0x4

    if-eqz v1, :cond_3

    sget-object v1, LDc;->j:[B

    invoke-static {v1, p2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    invoke-static {p0, p1}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide p1

    long-to-int p1, p1

    invoke-static {p0, v4}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v0

    invoke-static {p0, v4}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int p2, v4

    long-to-int v0, v0

    invoke-static {p0, p2, v0}, LfG;->c0(Ljava/io/FileInputStream;II)[B

    move-result-object p2

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-gtz p0, :cond_0

    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :try_start_0
    invoke-static {p0, p1, p3}, LfG;->e0(Ljava/io/ByteArrayInputStream;I[LEd;)[LEd;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    sget-object v0, LDc;->p:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x2

    invoke-static {p0, p1}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v0

    long-to-int p1, v0

    invoke-static {p0, v4}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v0

    invoke-static {p0, v4}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int v2, v4

    long-to-int v0, v0

    invoke-static {p0, v2, v0}, LfG;->c0(Ljava/io/FileInputStream;II)[B

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-gtz p0, :cond_4

    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :try_start_2
    invoke-static {p0, p2, p1, p3}, LfG;->f0(Ljava/io/ByteArrayInputStream;[BI[LEd;)[LEd;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_2
    move-exception p1

    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e0(Ljava/io/ByteArrayInputStream;I[LEd;)[LEd;
    .locals 8

    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array p0, v1, [LEd;

    return-object p0

    :cond_0
    array-length v0, p2

    if-ne p1, v0, :cond_4

    new-array v0, p1, [Ljava/lang/String;

    new-array v2, p1, [I

    move v3, v1

    :goto_0
    if-ge v3, p1, :cond_1

    const/4 v4, 0x2

    invoke-static {p0, v4}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {p0, v4}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v6

    long-to-int v4, v6

    aput v4, v2, v3

    new-instance v4, Ljava/lang/String;

    invoke-static {p0, v5}, LfG;->a0(Ljava/io/InputStream;I)[B

    move-result-object v5

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v5, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    aput-object v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ge v1, p1, :cond_3

    aget-object v3, p2, v1

    iget-object v4, v3, LEd;->b:Ljava/lang/String;

    aget-object v5, v0, v1

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    aget v4, v2, v1

    iput v4, v3, LEd;->e:I

    invoke-static {p0, v4}, LfG;->b0(Ljava/io/ByteArrayInputStream;I)[I

    move-result-object v4

    iput-object v4, v3, LEd;->h:[I

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Order of dexfiles in metadata did not match baseline"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-object p2

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Mismatched number of dex files found in metadata"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f0(Ljava/io/ByteArrayInputStream;[BI[LEd;)[LEd;
    .locals 10

    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array p0, v1, [LEd;

    return-object p0

    :cond_0
    array-length v0, p3

    if-ne p2, v0, :cond_9

    move v0, v1

    :goto_0
    if-ge v0, p2, :cond_8

    const/4 v2, 0x2

    invoke-static {p0, v2}, LfG;->i0(Ljava/io/InputStream;I)J

    invoke-static {p0, v2}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v3

    long-to-int v3, v3

    new-instance v4, Ljava/lang/String;

    invoke-static {p0, v3}, LfG;->a0(Ljava/io/InputStream;I)[B

    move-result-object v3

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v3, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const/4 v3, 0x4

    invoke-static {p0, v3}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v5

    invoke-static {p0, v2}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v2

    long-to-int v2, v2

    array-length v3, p3

    const/4 v7, 0x0

    if-gtz v3, :cond_1

    goto :goto_3

    :cond_1
    const-string v3, "!"

    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-gez v3, :cond_2

    const-string v3, ":"

    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    :cond_2
    if-lez v3, :cond_3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v4, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v4

    :goto_1
    move v8, v1

    :goto_2
    array-length v9, p3

    if-ge v8, v9, :cond_5

    aget-object v9, p3, v8

    iget-object v9, v9, LEd;->b:Ljava/lang/String;

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    aget-object v7, p3, v8

    goto :goto_3

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    if-eqz v7, :cond_7

    iput-wide v5, v7, LEd;->d:J

    invoke-static {p0, v2}, LfG;->b0(Ljava/io/ByteArrayInputStream;I)[I

    move-result-object v3

    sget-object v4, LDc;->n:[B

    invoke-static {p1, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4

    if-eqz v4, :cond_6

    iput v2, v7, LEd;->e:I

    iput-object v3, v7, LEd;->h:[I

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    const-string p0, "Missing profile key: "

    invoke-virtual {p0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    return-object p3

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Mismatched number of dex files found in metadata"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g0(Ljava/io/FileInputStream;[BLjava/lang/String;)[LEd;
    .locals 5

    sget-object v0, LDc;->k:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    invoke-static {p0, p1}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v0

    long-to-int p1, v0

    const/4 v0, 0x4

    invoke-static {p0, v0}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v1

    invoke-static {p0, v0}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v3

    long-to-int v0, v3

    long-to-int v1, v1

    invoke-static {p0, v0, v1}, LfG;->c0(Ljava/io/FileInputStream;II)[B

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-gtz p0, :cond_0

    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :try_start_0
    invoke-static {p0, p2, p1}, LfG;->j0(Ljava/io/ByteArrayInputStream;Ljava/lang/String;I)[LEd;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Content found after the end of file"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Unsupported version"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final h0(Ljava/io/Reader;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    const/16 v1, 0x2000

    new-array v1, v1, [C

    invoke-virtual {p0, v1}, Ljava/io/Reader;->read([C)I

    move-result v2

    :goto_0
    if-ltz v2, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/Writer;->write([CII)V

    invoke-virtual {p0, v1}, Ljava/io/Reader;->read([C)I

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i0(Ljava/io/InputStream;I)J
    .locals 6

    invoke-static {p0, p1}, LfG;->a0(Ljava/io/InputStream;I)[B

    move-result-object p0

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    mul-int/lit8 v5, v2, 0x8

    shl-long/2addr v3, v5

    add-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public static j0(Ljava/io/ByteArrayInputStream;Ljava/lang/String;I)[LEd;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-array v0, v3, [LEd;

    return-object v0

    :cond_0
    new-array v2, v1, [LEd;

    move v4, v3

    :goto_0
    const/4 v5, 0x2

    if-ge v4, v1, :cond_1

    invoke-static {v0, v5}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-static {v0, v5}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v7

    long-to-int v14, v7

    const/4 v5, 0x4

    invoke-static {v0, v5}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v7

    invoke-static {v0, v5}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v12

    invoke-static {v0, v5}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v9

    new-instance v5, LEd;

    new-instance v11, Ljava/lang/String;

    invoke-static {v0, v6}, LfG;->a0(Ljava/io/InputStream;I)[B

    move-result-object v6

    sget-object v15, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v11, v6, v15}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    long-to-int v15, v7

    long-to-int v6, v9

    new-array v7, v14, [I

    new-instance v18, Ljava/util/TreeMap;

    invoke-direct/range {v18 .. v18}, Ljava/util/TreeMap;-><init>()V

    move-object/from16 v10, p1

    move-object v9, v5

    move/from16 v16, v6

    move-object/from16 v17, v7

    invoke-direct/range {v9 .. v18}, LEd;-><init>(Ljava/lang/String;Ljava/lang/String;JIII[ILjava/util/TreeMap;)V

    aput-object v9, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v4, v3

    :goto_1
    if-ge v4, v1, :cond_e

    aget-object v6, v2, v4

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v7

    iget v8, v6, LEd;->f:I

    iget v9, v6, LEd;->g:I

    iget-object v10, v6, LEd;->i:Ljava/util/TreeMap;

    sub-int/2addr v7, v8

    move v8, v3

    :cond_2
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v11

    const/4 v12, 0x7

    if-le v11, v7, :cond_7

    invoke-static {v0, v5}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v13

    long-to-int v11, v13

    add-int/2addr v8, v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v13, 0x1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v10, v11, v14}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, v5}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v14

    long-to-int v11, v14

    :goto_2
    if-lez v11, :cond_2

    invoke-static {v0, v5}, LfG;->i0(Ljava/io/InputStream;I)J

    invoke-static {v0, v13}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v14

    long-to-int v14, v14

    const/4 v15, 0x6

    if-ne v14, v15, :cond_4

    :cond_3
    :goto_3
    move v15, v3

    move/from16 v16, v4

    goto :goto_6

    :cond_4
    if-ne v14, v12, :cond_5

    goto :goto_3

    :cond_5
    :goto_4
    if-lez v14, :cond_3

    invoke-static {v0, v13}, LfG;->i0(Ljava/io/InputStream;I)J

    move v15, v3

    move/from16 v16, v4

    invoke-static {v0, v13}, LfG;->i0(Ljava/io/InputStream;I)J

    move-result-wide v3

    long-to-int v3, v3

    :goto_5
    if-lez v3, :cond_6

    invoke-static {v0, v5}, LfG;->i0(Ljava/io/InputStream;I)J

    add-int/lit8 v3, v3, -0x1

    goto :goto_5

    :cond_6
    add-int/lit8 v14, v14, -0x1

    move v3, v15

    move/from16 v4, v16

    goto :goto_4

    :goto_6
    add-int/lit8 v11, v11, -0x1

    move v3, v15

    move/from16 v4, v16

    goto :goto_2

    :cond_7
    move v15, v3

    move/from16 v16, v4

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v3

    if-ne v3, v7, :cond_d

    iget v3, v6, LEd;->e:I

    invoke-static {v0, v3}, LfG;->b0(Ljava/io/ByteArrayInputStream;I)[I

    move-result-object v3

    iput-object v3, v6, LEd;->h:[I

    mul-int/lit8 v3, v9, 0x2

    add-int/2addr v3, v12

    and-int/lit8 v3, v3, -0x8

    div-int/lit8 v3, v3, 0x8

    invoke-static {v0, v3}, LfG;->a0(Ljava/io/InputStream;I)[B

    move-result-object v3

    invoke-static {v3}, Ljava/util/BitSet;->valueOf([B)Ljava/util/BitSet;

    move-result-object v3

    move v4, v15

    :goto_7
    if-ge v4, v9, :cond_c

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move v6, v5

    goto :goto_8

    :cond_8
    move v6, v15

    :goto_8
    add-int v7, v4, v9

    invoke-virtual {v3, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v7

    if-eqz v7, :cond_9

    or-int/lit8 v6, v6, 0x4

    :cond_9
    if-eqz v6, :cond_b

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v10, v7}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-nez v7, :cond_a

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_a
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    or-int/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v10, v8, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_c
    add-int/lit8 v4, v16, 0x1

    move v3, v15

    goto/16 :goto_1

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Read too much data during profile line parse"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    return-object v2
.end method

.method public static final k0(LEb;Ljava/lang/Object;)V
    .locals 10

    instance-of v0, p0, Lee;

    if-eqz v0, :cond_a

    check-cast p0, Lee;

    iget-object v0, p0, Lee;->d:Lbc;

    iget-object v1, p0, Lee;->e:LFb;

    iget-object v2, v1, LFb;->b:Lac;

    invoke-static {p1}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_0

    move-object v4, p1

    goto :goto_0

    :cond_0
    new-instance v4, LEa;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5}, LEa;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    :try_start_0
    invoke-virtual {v0, v2}, Lbc;->u(Lac;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    iput-object v4, p0, Lee;->f:Ljava/lang/Object;

    iput v5, p0, Lge;->c:I

    invoke-static {v0, v2, p0}, LfG;->m0(Lbc;Lac;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-static {}, LaB;->a()Lug;

    move-result-object v0

    iget-wide v6, v0, Lug;->b:J

    const-wide v8, 0x100000000L

    cmp-long v3, v6, v8

    if-ltz v3, :cond_3

    iput-object v4, p0, Lee;->f:Ljava/lang/Object;

    iput v5, p0, Lge;->c:I

    iget-object p1, v0, Lug;->d:LD4;

    if-nez p1, :cond_2

    new-instance p1, LD4;

    invoke-direct {p1}, LD4;-><init>()V

    iput-object p1, v0, Lug;->d:LD4;

    :cond_2
    invoke-virtual {p1, p0}, LD4;->addLast(Ljava/lang/Object;)V

    goto :goto_5

    :cond_3
    invoke-virtual {v0, v5}, Lug;->y(Z)V

    :try_start_1
    sget-object v3, Lgf;->f:Lgf;

    invoke-interface {v2, v3}, Lac;->m(LZb;)LYb;

    move-result-object v3

    check-cast v3, Ldm;

    if-eqz v3, :cond_4

    invoke-interface {v3}, Ldm;->d()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-interface {v3}, Ldm;->p()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    new-instance v1, LGw;

    invoke-direct {v1, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1}, Lee;->f(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_4
    iget-object v3, p0, Lee;->g:Ljava/lang/Object;

    invoke-static {v2, v3}, LGu;->E(Lac;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LGu;->j:Lv1;

    if-eq v3, v4, :cond_5

    invoke-static {v1, v2, v3}, LDc;->w(LEb;Lac;Ljava/lang/Object;)LwC;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_1
    :try_start_2
    invoke-virtual {v1, p1}, Lu5;->f(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v4, :cond_6

    :try_start_3
    invoke-virtual {v4}, LwC;->P()Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_6
    invoke-static {v2, v3}, LGu;->B(Lac;Ljava/lang/Object;)V

    :cond_7
    :goto_2
    invoke-virtual {v0}, Lug;->z()Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez p1, :cond_7

    :goto_3
    invoke-virtual {v0}, Lug;->w()V

    goto :goto_5

    :catchall_1
    move-exception p1

    if-eqz v4, :cond_8

    :try_start_4
    invoke-virtual {v4}, LwC;->P()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_8
    invoke-static {v2, v3}, LGu;->B(Lac;Ljava/lang/Object;)V

    :cond_9
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_4
    :try_start_5
    invoke-virtual {p0, p1}, Lge;->h(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :goto_5
    return-void

    :catchall_2
    move-exception p0

    invoke-virtual {v0}, Lug;->w()V

    throw p0

    :catchall_3
    move-exception p0

    new-instance p1, Lde;

    invoke-direct {p1, p0, v0, v2}, Lde;-><init>(Ljava/lang/Throwable;Lbc;Lac;)V

    throw p1

    :cond_a
    invoke-interface {p0, p1}, LEb;->f(Ljava/lang/Object;)V

    return-void
.end method

.method public static l0(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 8

    invoke-static {p0}, LLj;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Gainmap;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, LLj;->c(Landroid/graphics/Gainmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v2

    sget-object v3, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    if-ne v2, v3, :cond_2

    sget-object v2, LMj;->a:Landroid/graphics/ColorMatrixColorFilter;

    invoke-static {v0}, LLj;->c(Landroid/graphics/Gainmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v4

    if-eq v4, v3, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v4

    const/4 v5, 0x1

    if-ne v4, v3, :cond_1

    move v3, v5

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    const-string v4, ""

    invoke-static {v4, v3}, LQj;->f(Ljava/lang/String;Z)V

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    sget-object v7, LMj;->a:Landroid/graphics/ColorMatrixColorFilter;

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    const/4 v7, 0x0

    invoke-virtual {v4, v2, v7, v7, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    invoke-static {v3}, LLj;->j(Landroid/graphics/Bitmap;)Landroid/graphics/Gainmap;

    move-result-object v2

    invoke-static {v0}, LLj;->q(Landroid/graphics/Gainmap;)[F

    move-result-object v3

    aget v4, v3, v1

    aget v6, v3, v5

    const/4 v7, 0x2

    aget v3, v3, v7

    invoke-static {v2, v4, v6, v3}, LLj;->p(Landroid/graphics/Gainmap;FFF)V

    invoke-static {v0}, LLj;->s(Landroid/graphics/Gainmap;)[F

    move-result-object v3

    aget v4, v3, v1

    aget v6, v3, v5

    aget v3, v3, v7

    invoke-static {v2, v4, v6, v3}, LLj;->r(Landroid/graphics/Gainmap;FFF)V

    invoke-static {v0}, LLj;->h(Landroid/graphics/Gainmap;)[F

    move-result-object v3

    aget v4, v3, v1

    aget v6, v3, v5

    aget v3, v3, v7

    invoke-static {v2, v4, v6, v3}, LLj;->g(Landroid/graphics/Gainmap;FFF)V

    invoke-static {v0}, LLj;->m(Landroid/graphics/Gainmap;)[F

    move-result-object v3

    aget v4, v3, v1

    aget v6, v3, v5

    aget v3, v3, v7

    invoke-static {v2, v4, v6, v3}, LLj;->l(Landroid/graphics/Gainmap;FFF)V

    invoke-static {v0}, LLj;->o(Landroid/graphics/Gainmap;)[F

    move-result-object v3

    aget v4, v3, v1

    aget v5, v3, v5

    aget v3, v3, v7

    invoke-static {v2, v4, v5, v3}, LLj;->n(Landroid/graphics/Gainmap;FFF)V

    invoke-static {v0}, LLj;->a(Landroid/graphics/Gainmap;)F

    move-result v3

    invoke-static {v2, v3}, LLj;->f(Landroid/graphics/Gainmap;F)V

    invoke-static {v0}, LLj;->i(Landroid/graphics/Gainmap;)F

    move-result v0

    invoke-static {v2, v0}, LLj;->k(Landroid/graphics/Gainmap;F)V

    move-object v0, v2

    :goto_1
    invoke-static {p0, v0}, LLj;->e(Landroid/graphics/Bitmap;Landroid/graphics/Gainmap;)V

    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p0, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final m0(Lbc;Lac;Ljava/lang/Runnable;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lbc;->t(Lac;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    new-instance v0, Lde;

    invoke-direct {v0, p2, p0, p1}, Lde;-><init>(Ljava/lang/Throwable;Lbc;Lac;)V

    throw v0
.end method

.method public static n0(Landroid/view/View;LXq;)V
    .locals 2

    iget-object v0, p1, LXq;->b:LVq;

    iget-object v0, v0, LVq;->c:Ljf;

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Ljf;->a:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    instance-of v1, p0, Landroid/view/View;

    if-eqz v1, :cond_0

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getElevation()F

    move-result v1

    add-float/2addr v0, v1

    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    :cond_0
    iget-object p0, p1, LXq;->b:LVq;

    iget v1, p0, LVq;->m:F

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_1

    iput v0, p0, LVq;->m:F

    invoke-virtual {p1}, LXq;->s()V

    :cond_1
    return-void
.end method

.method public static o0(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    return-void
.end method

.method public static p0(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static q0(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static r0(Ljava/lang/String;)Ljava/lang/Class;
    .locals 3

    const-wide v0, -0x20eecfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :try_start_0
    sget-object v0, LgG;->c:Ljava/lang/ClassLoader;

    invoke-virtual {v0, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-wide v1, -0x20ef3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-wide v1, -0x20e82fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final s0(Ljava/lang/String;)LfC;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    invoke-static {v2, v3}, LNj;->g(II)I

    move-result v3

    if-gez v3, :cond_1

    const/4 v3, 0x1

    if-eq v0, v3, :cond_5

    const/16 v4, 0x2b

    if-eq v2, v4, :cond_2

    goto :goto_1

    :cond_1
    move v3, v1

    :cond_2
    const v2, 0x71c71c7

    move v4, v2

    :goto_0
    if-ge v3, v0, :cond_7

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0xa

    invoke-static {v5, v6}, Ljava/lang/Character;->digit(II)I

    move-result v5

    if-gez v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v1, v4}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v7

    if-lez v7, :cond_4

    if-ne v4, v2, :cond_5

    const/4 v4, -0x1

    invoke-static {v4, v6}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v6

    if-lez v6, :cond_4

    goto :goto_1

    :cond_4
    mul-int/lit8 v1, v1, 0xa

    add-int/2addr v5, v1

    invoke-static {v5, v1}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v1

    if-gez v1, :cond_6

    :cond_5
    :goto_1
    const/4 p0, 0x0

    return-object p0

    :cond_6
    add-int/lit8 v3, v3, 0x1

    move v1, v5

    goto :goto_0

    :cond_7
    new-instance p0, LfC;

    invoke-direct {p0, v1}, LfC;-><init>(I)V

    return-object p0
.end method

.method public static t0(Ljava/io/ByteArrayOutputStream;[B[LEd;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget-object v3, LDc;->n:[B

    sget-object v4, LDc;->m:[B

    sget-object v5, LDc;->j:[B

    invoke-static {v1, v5}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v6

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v6, :cond_f

    new-instance v1, Ljava/util/ArrayList;

    const/4 v3, 0x3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    array-length v10, v2

    invoke-static {v6, v10}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    const/4 v10, 0x2

    move v11, v8

    move v12, v10

    :goto_0
    array-length v13, v2

    if-ge v11, v13, :cond_0

    aget-object v13, v2, v11

    iget-wide v14, v13, LEd;->c:J

    invoke-static {v6, v14, v15, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    iget-wide v14, v13, LEd;->d:J

    invoke-static {v6, v14, v15, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    iget v14, v13, LEd;->g:I

    int-to-long v14, v14

    invoke-static {v6, v14, v15, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    iget-object v14, v13, LEd;->a:Ljava/lang/String;

    iget-object v13, v13, LEd;->b:Ljava/lang/String;

    invoke-static {v14, v13, v5}, LfG;->S(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v13

    add-int/lit8 v12, v12, 0xe

    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v13, v14}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v15

    array-length v15, v15

    invoke-static {v6, v15}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    add-int/2addr v12, v15

    invoke-virtual {v13, v14}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v13

    invoke-virtual {v6, v13}, Ljava/io/OutputStream;->write([B)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :goto_1
    move-object v1, v0

    goto/16 :goto_12

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v5

    array-length v11, v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v13, ", does not match actual size "

    const-string v14, "Expected size "

    if-ne v12, v11, :cond_e

    :try_start_1
    new-instance v11, LSF;

    invoke-direct {v11, v9, v5, v8}, LSF;-><init>(I[BZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move v6, v8

    move v11, v6

    :goto_2
    :try_start_2
    array-length v12, v2

    if-ge v6, v12, :cond_2

    aget-object v12, v2, v6

    invoke-static {v5, v6}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v11, v11, 0x4

    iget v15, v12, LEd;->e:I

    invoke-static {v5, v15}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    iget v15, v12, LEd;->e:I

    mul-int/2addr v15, v10

    add-int/2addr v11, v15

    iget-object v12, v12, LEd;->h:[I

    array-length v15, v12

    move/from16 v16, v8

    move/from16 p1, v10

    move/from16 v10, v16

    :goto_3
    if-ge v10, v15, :cond_1

    aget v17, v12, v10

    sub-int v8, v17, v16

    invoke-static {v5, v8}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v10, v10, 0x1

    move/from16 v16, v17

    const/4 v8, 0x0

    goto :goto_3

    :cond_1
    add-int/lit8 v6, v6, 0x1

    move/from16 v10, p1

    const/4 v8, 0x0

    goto :goto_2

    :goto_4
    move-object v1, v0

    goto/16 :goto_10

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_2
    move/from16 p1, v10

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v6

    array-length v8, v6

    if-ne v11, v8, :cond_d

    new-instance v8, LSF;

    invoke-direct {v8, v3, v6, v9}, LSF;-><init>(I[BZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_5
    :try_start_3
    array-length v8, v2

    if-ge v5, v8, :cond_4

    aget-object v8, v2, v5

    iget-object v10, v8, LEd;->i:Ljava/util/TreeMap;

    invoke-virtual {v10}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v11, 0x0

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    or-int/2addr v11, v12

    goto :goto_6

    :cond_3
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-static {v10, v11, v8}, LfG;->w0(Ljava/io/ByteArrayOutputStream;ILEd;)V

    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    :try_start_5
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V

    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    invoke-static {v10, v8}, LfG;->x0(Ljava/io/ByteArrayOutputStream;LEd;)V

    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-static {v3, v5}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    array-length v10, v12

    add-int/lit8 v10, v10, 0x2

    array-length v15, v8

    add-int/2addr v10, v15

    add-int/lit8 v6, v6, 0x6

    move v15, v5

    move/from16 v16, v6

    int-to-long v5, v10

    invoke-static {v3, v5, v6, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-static {v3, v11}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    invoke-virtual {v3, v12}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v3, v8}, Ljava/io/OutputStream;->write([B)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    add-int v6, v16, v10

    add-int/lit8 v5, v15, 0x1

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v1, v0

    goto/16 :goto_e

    :catchall_3
    move-exception v0

    move-object v1, v0

    :try_start_8
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_7

    :catchall_4
    move-exception v0

    :try_start_9
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_5
    move-exception v0

    move-object v1, v0

    :try_start_a
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    goto :goto_8

    :catchall_6
    move-exception v0

    :try_start_b
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1

    :cond_4
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    array-length v5, v2

    if-ne v6, v5, :cond_c

    new-instance v5, LSF;

    invoke-direct {v5, v7, v2, v9}, LSF;-><init>(I[BZ)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    int-to-long v2, v7

    add-long/2addr v2, v2

    const-wide/16 v5, 0x4

    add-long/2addr v2, v5

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    mul-int/lit8 v5, v5, 0x10

    int-to-long v5, v5

    add-long/2addr v2, v5

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    int-to-long v5, v5

    invoke-static {v0, v5, v6, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    const/4 v5, 0x0

    :goto_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_b

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LSF;

    iget v8, v6, LSF;->a:I

    iget-object v10, v6, LSF;->b:[B

    const/4 v11, 0x1

    if-eq v8, v11, :cond_9

    const/4 v11, 0x2

    if-eq v8, v11, :cond_8

    const/4 v11, 0x3

    if-eq v8, v11, :cond_7

    const/4 v11, 0x4

    if-eq v8, v11, :cond_6

    const/4 v11, 0x5

    if-ne v8, v11, :cond_5

    const-wide/16 v11, 0x4

    goto :goto_a

    :cond_5
    const/4 v0, 0x0

    throw v0

    :cond_6
    const-wide/16 v11, 0x3

    goto :goto_a

    :cond_7
    const-wide/16 v11, 0x2

    goto :goto_a

    :cond_8
    const-wide/16 v11, 0x1

    goto :goto_a

    :cond_9
    const-wide/16 v11, 0x0

    :goto_a
    invoke-static {v0, v11, v12, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-static {v0, v2, v3, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    iget-boolean v6, v6, LSF;->c:Z

    if-eqz v6, :cond_a

    array-length v6, v10

    int-to-long v11, v6

    invoke-static {v10}, LfG;->H([B)[B

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    array-length v8, v6

    int-to-long v13, v8

    invoke-static {v0, v13, v14, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-static {v0, v11, v12, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    array-length v6, v6

    :goto_b
    int-to-long v10, v6

    add-long/2addr v2, v10

    goto :goto_c

    :cond_a
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    array-length v6, v10

    int-to-long v11, v6

    invoke-static {v0, v11, v12, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    const-wide/16 v11, 0x0

    invoke-static {v0, v11, v12, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    array-length v6, v10

    goto :goto_b

    :goto_c
    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_b
    const/4 v8, 0x0

    :goto_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v8, v1, :cond_17

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_d

    :cond_c
    :try_start_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :goto_e
    :try_start_d
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    goto :goto_f

    :catchall_7
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v1

    :cond_d
    :try_start_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, v6

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    :goto_10
    :try_start_f
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    goto :goto_11

    :catchall_8
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_11
    throw v1

    :cond_e
    :try_start_10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, v5

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    :goto_12
    :try_start_11
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    goto :goto_13

    :catchall_9
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_13
    throw v1

    :cond_f
    sget-object v5, LDc;->k:[B

    invoke-static {v1, v5}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-static {v2, v5}, LfG;->K([LEd;[B)[B

    move-result-object v1

    array-length v2, v2

    int-to-long v2, v2

    invoke-static {v0, v2, v3, v9}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    array-length v2, v1

    int-to-long v2, v2

    invoke-static {v0, v2, v3, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-static {v1}, LfG;->H([B)[B

    move-result-object v1

    array-length v2, v1

    int-to-long v2, v2

    invoke-static {v0, v2, v3, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    return v9

    :cond_10
    invoke-static {v1, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v5

    if-eqz v5, :cond_13

    array-length v1, v2

    int-to-long v5, v1

    invoke-static {v0, v5, v6, v9}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    array-length v1, v2

    const/4 v3, 0x0

    :goto_14
    if-ge v3, v1, :cond_17

    aget-object v5, v2, v3

    iget-object v6, v5, LEd;->i:Ljava/util/TreeMap;

    invoke-virtual {v6}, Ljava/util/TreeMap;->size()I

    move-result v6

    mul-int/2addr v6, v7

    iget-object v8, v5, LEd;->a:Ljava/lang/String;

    iget-object v10, v5, LEd;->b:Ljava/lang/String;

    invoke-static {v8, v10, v4}, LfG;->S(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v8

    sget-object v10, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v8, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v11

    array-length v11, v11

    invoke-static {v0, v11}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    iget-object v11, v5, LEd;->h:[I

    array-length v11, v11

    invoke-static {v0, v11}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    int-to-long v11, v6

    invoke-static {v0, v11, v12, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    iget-wide v11, v5, LEd;->c:J

    invoke-static {v0, v11, v12, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-virtual {v8, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/io/OutputStream;->write([B)V

    iget-object v6, v5, LEd;->i:Ljava/util/TreeMap;

    invoke-virtual {v6}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_15
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v0, v8}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    const/4 v8, 0x0

    invoke-static {v0, v8}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    goto :goto_15

    :cond_11
    iget-object v5, v5, LEd;->h:[I

    array-length v6, v5

    const/4 v8, 0x0

    :goto_16
    if-ge v8, v6, :cond_12

    aget v10, v5, v8

    invoke-static {v0, v10}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_16

    :cond_12
    add-int/lit8 v3, v3, 0x1

    goto :goto_14

    :cond_13
    sget-object v4, LDc;->l:[B

    invoke-static {v1, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-static {v2, v4}, LfG;->K([LEd;[B)[B

    move-result-object v1

    array-length v2, v2

    int-to-long v2, v2

    invoke-static {v0, v2, v3, v9}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    array-length v2, v1

    int-to-long v2, v2

    invoke-static {v0, v2, v3, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-static {v1}, LfG;->H([B)[B

    move-result-object v1

    array-length v2, v1

    int-to-long v2, v2

    invoke-static {v0, v2, v3, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    return v9

    :cond_14
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_18

    array-length v1, v2

    invoke-static {v0, v1}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    array-length v1, v2

    const/4 v8, 0x0

    :goto_17
    if-ge v8, v1, :cond_17

    aget-object v4, v2, v8

    iget-object v5, v4, LEd;->a:Ljava/lang/String;

    iget-object v6, v4, LEd;->i:Ljava/util/TreeMap;

    iget-object v10, v4, LEd;->b:Ljava/lang/String;

    invoke-static {v5, v10, v3}, LfG;->S(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v5

    sget-object v10, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v5, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v11

    array-length v11, v11

    invoke-static {v0, v11}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    invoke-virtual {v6}, Ljava/util/TreeMap;->size()I

    move-result v11

    invoke-static {v0, v11}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    iget-object v11, v4, LEd;->h:[I

    array-length v11, v11

    invoke-static {v0, v11}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    iget-wide v11, v4, LEd;->c:J

    invoke-static {v0, v11, v12, v7}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-virtual {v5, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v6}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_18
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v0, v6}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    goto :goto_18

    :cond_15
    iget-object v4, v4, LEd;->h:[I

    array-length v5, v4

    const/4 v6, 0x0

    :goto_19
    if-ge v6, v5, :cond_16

    aget v10, v4, v6

    invoke-static {v0, v10}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_19

    :cond_16
    add-int/lit8 v8, v8, 0x1

    goto :goto_17

    :cond_17
    return v9

    :cond_18
    const/16 v18, 0x0

    return v18
.end method

.method public static u0(Ljava/io/ByteArrayOutputStream;LEd;)V
    .locals 8

    invoke-static {p0, p1}, LfG;->x0(Ljava/io/ByteArrayOutputStream;LEd;)V

    iget v0, p1, LEd;->g:I

    iget-object v1, p1, LEd;->h:[I

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_0

    aget v5, v1, v3

    sub-int v4, v5, v4

    invoke-static {p0, v4}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v3, v3, 0x1

    move v4, v5

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, v0, 0x2

    add-int/lit8 v1, v1, 0x7

    and-int/lit8 v1, v1, -0x8

    div-int/lit8 v1, v1, 0x8

    new-array v1, v1, [B

    iget-object p1, p1, LEd;->i:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    and-int/lit8 v4, v2, 0x2

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    div-int/lit8 v4, v3, 0x8

    aget-byte v6, v1, v4

    rem-int/lit8 v7, v3, 0x8

    shl-int v7, v5, v7

    or-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v1, v4

    :cond_2
    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_1

    add-int/2addr v3, v0

    div-int/lit8 v2, v3, 0x8

    aget-byte v4, v1, v2

    rem-int/lit8 v3, v3, 0x8

    shl-int v3, v5, v3

    or-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static v0(Ljava/io/ByteArrayOutputStream;LEd;Ljava/lang/String;)V
    .locals 4

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    array-length v1, v1

    invoke-static {p0, v1}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    iget v1, p1, LEd;->e:I

    invoke-static {p0, v1}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    iget v1, p1, LEd;->f:I

    int-to-long v1, v1

    const/4 v3, 0x4

    invoke-static {p0, v1, v2, v3}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    iget-wide v1, p1, LEd;->c:J

    invoke-static {p0, v1, v2, v3}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    iget p1, p1, LEd;->g:I

    int-to-long v1, p1

    invoke-static {p0, v1, v2, v3}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static w0(Ljava/io/ByteArrayOutputStream;ILEd;)V
    .locals 10

    iget v0, p2, LEd;->g:I

    and-int/lit8 v1, p1, -0x2

    invoke-static {v1}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    mul-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x7

    and-int/lit8 v1, v1, -0x8

    div-int/lit8 v1, v1, 0x8

    new-array v1, v1, [B

    iget-object p2, p2, LEd;->i:Ljava/util/TreeMap;

    invoke-virtual {p2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    move v6, v4

    :goto_0
    const/4 v7, 0x4

    if-gt v6, v7, :cond_0

    if-ne v6, v4, :cond_1

    :goto_1
    shl-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    and-int v7, v6, p1

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    and-int v7, v6, v2

    if-ne v7, v6, :cond_3

    mul-int v7, v5, v0

    add-int/2addr v7, v3

    div-int/lit8 v8, v7, 0x8

    aget-byte v9, v1, v8

    rem-int/lit8 v7, v7, 0x8

    shl-int v7, v4, v7

    or-int/2addr v7, v9

    int-to-byte v7, v7

    aput-byte v7, v1, v8

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static x0(Ljava/io/ByteArrayOutputStream;LEd;)V
    .locals 4

    iget-object p1, p1, LEd;->i:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sub-int v1, v3, v1

    invoke-static {p0, v1}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    invoke-static {p0, v0}, LfG;->z0(Ljava/io/ByteArrayOutputStream;I)V

    move v1, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static y0(Ljava/io/ByteArrayOutputStream;JI)V
    .locals 6

    new-array v0, p3, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_0

    mul-int/lit8 v2, v1, 0x8

    shr-long v2, p1, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static z0(Ljava/io/ByteArrayOutputStream;I)V
    .locals 2

    int-to-long v0, p1

    const/4 p1, 0x2

    invoke-static {p0, v0, v1, p1}, LfG;->y0(Ljava/io/ByteArrayOutputStream;JI)V

    return-void
.end method


# virtual methods
.method public A(LCx;I)J
    .locals 0

    invoke-virtual {p0}, LfG;->a()J

    move-result-wide p1

    return-wide p1
.end method

.method public B(LCx;)LVa;
    .locals 0

    return-object p0
.end method

.method public C()V
    .locals 0

    return-void
.end method

.method public D()D
    .locals 1

    invoke-virtual {p0}, LfG;->O()V

    const/4 v0, 0x0

    throw v0
.end method

.method public O()V
    .locals 3

    new-instance v0, LHx;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " can\'t retrieve untyped values"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract a()J
.end method

.method public b(Lju;I)LJc;
    .locals 0

    invoke-virtual {p1, p2}, Lwo;->j(I)LCx;

    move-result-object p1

    invoke-virtual {p0, p1}, LfG;->u(LCx;)LJc;

    move-result-object p1

    return-object p1
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()Z
    .locals 1

    invoke-virtual {p0}, LfG;->O()V

    const/4 v0, 0x0

    throw v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g()C
    .locals 1

    invoke-virtual {p0}, LfG;->O()V

    const/4 v0, 0x0

    throw v0
.end method

.method public h(LQm;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0}, LQm;->deserialize(LJc;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LfG;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {p0}, LfG;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p3}, LQm;->getDescriptor()LCx;

    move-result-object p1

    invoke-interface {p1}, LCx;->h()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {p0}, LJc;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    invoke-virtual {p0, p3}, LfG;->h(LQm;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k(Lju;I)D
    .locals 0

    invoke-virtual {p0}, LfG;->D()D

    move-result-wide p1

    return-wide p1
.end method

.method public l(Lju;I)C
    .locals 0

    invoke-virtual {p0}, LfG;->g()C

    move-result p1

    return p1
.end method

.method public m(Lju;I)F
    .locals 0

    invoke-virtual {p0}, LfG;->z()F

    move-result p1

    return p1
.end method

.method public n(Lju;I)B
    .locals 0

    invoke-virtual {p0}, LfG;->t()B

    move-result p1

    return p1
.end method

.method public o(LCx;I)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, LfG;->y()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract p()I
.end method

.method public q(Lju;I)S
    .locals 0

    invoke-virtual {p0}, LfG;->x()S

    move-result p1

    return p1
.end method

.method public r(LCx;)V
    .locals 0

    return-void
.end method

.method public s(LCx;I)Z
    .locals 0

    invoke-virtual {p0}, LfG;->e()Z

    move-result p1

    return p1
.end method

.method public abstract t()B
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, LfG;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v0

    invoke-virtual {v0}, LF9;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public u(LCx;)LJc;
    .locals 0

    return-object p0
.end method

.method public v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p3}, LfG;->h(LQm;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public w(LCx;I)I
    .locals 0

    invoke-virtual {p0}, LfG;->p()I

    move-result p1

    return p1
.end method

.method public abstract x()S
.end method

.method public y()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LfG;->O()V

    const/4 v0, 0x0

    throw v0
.end method

.method public z()F
    .locals 1

    invoke-virtual {p0}, LfG;->O()V

    const/4 v0, 0x0

    throw v0
.end method
