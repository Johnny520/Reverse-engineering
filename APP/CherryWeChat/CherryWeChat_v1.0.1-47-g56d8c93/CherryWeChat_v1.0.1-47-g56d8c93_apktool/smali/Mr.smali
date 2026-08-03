.class public final LMr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lmx;


# static fields
.field public static final o:[I

.field public static final p:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:LB;

.field public final f:Z

.field public final g:Z

.field public final h:[I

.field public final i:I

.field public final j:I

.field public final k:LQs;

.field public final l:Lvo;

.field public final m:LYC;

.field public final n:Lsq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, LMr;->o:[I

    invoke-static {}, LjD;->j()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, LMr;->p:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILB;Z[IIILQs;Lvo;LYC;LUg;Lsq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMr;->a:[I

    iput-object p2, p0, LMr;->b:[Ljava/lang/Object;

    iput p3, p0, LMr;->c:I

    iput p4, p0, LMr;->d:I

    instance-of p1, p5, Lvj;

    iput-boolean p1, p0, LMr;->f:Z

    iput-boolean p6, p0, LMr;->g:Z

    iput-object p7, p0, LMr;->h:[I

    iput p8, p0, LMr;->i:I

    iput p9, p0, LMr;->j:I

    iput-object p10, p0, LMr;->k:LQs;

    iput-object p11, p0, LMr;->l:Lvo;

    iput-object p12, p0, LMr;->m:LYC;

    iput-object p5, p0, LMr;->e:LB;

    iput-object p14, p0, LMr;->n:Lsq;

    return-void
.end method

.method public static B(Lbv;LQs;Lvo;LYC;LUg;Lsq;)LMr;
    .locals 1

    instance-of v0, p0, Lbv;

    if-eqz v0, :cond_0

    invoke-static/range {p0 .. p5}, LMr;->C(Lbv;LQs;Lvo;LYC;LUg;Lsq;)LMr;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0
.end method

.method public static C(Lbv;LQs;Lvo;LYC;LUg;Lsq;)LMr;
    .locals 34

    move-object/from16 v0, p0

    iget v1, v0, Lbv;->d:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    move v10, v3

    goto :goto_0

    :cond_0
    move v10, v2

    :goto_0
    iget-object v1, v0, Lbv;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const v6, 0xd800

    if-lt v5, v6, :cond_1

    move v5, v2

    :goto_1
    add-int/lit8 v7, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_2

    move v5, v7

    goto :goto_1

    :cond_1
    move v7, v2

    :cond_2
    add-int/lit8 v5, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0xd

    if-lt v7, v6, :cond_4

    and-int/lit16 v7, v7, 0x1fff

    move v9, v8

    :goto_2
    add-int/lit8 v11, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_3

    and-int/lit16 v5, v5, 0x1fff

    shl-int/2addr v5, v9

    or-int/2addr v7, v5

    add-int/lit8 v9, v9, 0xd

    move v5, v11

    goto :goto_2

    :cond_3
    shl-int/2addr v5, v9

    or-int/2addr v7, v5

    move v5, v11

    :cond_4
    if-nez v7, :cond_5

    sget-object v7, LMr;->o:[I

    move/from16 v17, v2

    move v2, v3

    move v12, v2

    move v13, v12

    move v14, v13

    move v15, v14

    move-object v11, v7

    move v9, v8

    move v7, v15

    move v8, v7

    goto/16 :goto_c

    :cond_5
    add-int/lit8 v7, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_7

    and-int/lit16 v5, v5, 0x1fff

    move v9, v8

    :goto_3
    add-int/lit8 v11, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_6

    and-int/lit16 v7, v7, 0x1fff

    shl-int/2addr v7, v9

    or-int/2addr v5, v7

    add-int/lit8 v9, v9, 0xd

    move v7, v11

    goto :goto_3

    :cond_6
    shl-int/2addr v7, v9

    or-int/2addr v5, v7

    move v7, v11

    :cond_7
    add-int/lit8 v9, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_9

    and-int/lit16 v7, v7, 0x1fff

    move v11, v8

    :goto_4
    add-int/lit8 v12, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v6, :cond_8

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v11

    or-int/2addr v7, v9

    add-int/lit8 v11, v11, 0xd

    move v9, v12

    goto :goto_4

    :cond_8
    shl-int/2addr v9, v11

    or-int/2addr v7, v9

    move v9, v12

    :cond_9
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v6, :cond_b

    and-int/lit16 v9, v9, 0x1fff

    move v12, v8

    :goto_5
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_a

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_5

    :cond_a
    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    move v11, v13

    :cond_b
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_d

    and-int/lit16 v11, v11, 0x1fff

    move v13, v8

    :goto_6
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_c

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_6

    :cond_c
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_d
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_f

    and-int/lit16 v12, v12, 0x1fff

    move v14, v8

    :goto_7
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_e

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_7

    :cond_e
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_f
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_11

    and-int/lit16 v13, v13, 0x1fff

    move v15, v8

    :goto_8
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_10

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_8

    :cond_10
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_11
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_13

    and-int/lit16 v14, v14, 0x1fff

    move/from16 v16, v8

    :goto_9
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_12

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_9

    :cond_12
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_13
    add-int/lit8 v16, v15, 0x1

    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_15

    and-int/lit16 v15, v15, 0x1fff

    move/from16 v17, v2

    move/from16 v2, v16

    move/from16 v16, v8

    :goto_a
    add-int/lit8 v18, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-lt v2, v6, :cond_14

    and-int/lit16 v2, v2, 0x1fff

    shl-int v2, v2, v16

    or-int/2addr v15, v2

    add-int/lit8 v16, v16, 0xd

    move/from16 v2, v18

    goto :goto_a

    :cond_14
    shl-int v2, v2, v16

    or-int/2addr v15, v2

    move/from16 v16, v18

    goto :goto_b

    :cond_15
    move/from16 v17, v2

    :goto_b
    add-int v2, v15, v13

    add-int/2addr v2, v14

    new-array v2, v2, [I

    mul-int/lit8 v14, v5, 0x2

    add-int/2addr v14, v7

    move v7, v9

    move v9, v8

    move v8, v11

    move-object v11, v2

    move v2, v5

    move/from16 v5, v16

    :goto_c
    sget-object v3, LMr;->p:Lsun/misc/Unsafe;

    iget-object v9, v0, Lbv;->c:[Ljava/lang/Object;

    iget-object v6, v0, Lbv;->a:LB;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    move/from16 v20, v2

    mul-int/lit8 v2, v12, 0x3

    new-array v2, v2, [I

    mul-int/lit8 v12, v12, 0x2

    new-array v12, v12, [Ljava/lang/Object;

    add-int/2addr v13, v15

    move/from16 v24, v13

    move/from16 v23, v15

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_d
    if-ge v5, v4, :cond_32

    add-int/lit8 v25, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move-object/from16 v26, v2

    const v2, 0xd800

    if-lt v5, v2, :cond_17

    and-int/lit16 v5, v5, 0x1fff

    move/from16 v2, v25

    const/16 v25, 0xd

    :goto_e
    add-int/lit8 v27, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    move/from16 v28, v4

    const v4, 0xd800

    if-lt v2, v4, :cond_16

    and-int/lit16 v2, v2, 0x1fff

    shl-int v2, v2, v25

    or-int/2addr v5, v2

    add-int/lit8 v25, v25, 0xd

    move/from16 v2, v27

    move/from16 v4, v28

    goto :goto_e

    :cond_16
    shl-int v2, v2, v25

    or-int/2addr v5, v2

    move/from16 v2, v27

    goto :goto_f

    :cond_17
    move/from16 v28, v4

    move/from16 v2, v25

    :goto_f
    add-int/lit8 v4, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    move/from16 v25, v4

    const v4, 0xd800

    if-lt v2, v4, :cond_19

    and-int/lit16 v2, v2, 0x1fff

    move/from16 v4, v25

    const/16 v25, 0xd

    :goto_10
    add-int/lit8 v27, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    move/from16 v29, v2

    const v2, 0xd800

    if-lt v4, v2, :cond_18

    and-int/lit16 v2, v4, 0x1fff

    shl-int v2, v2, v25

    or-int v2, v29, v2

    add-int/lit8 v25, v25, 0xd

    move/from16 v4, v27

    goto :goto_10

    :cond_18
    shl-int v2, v4, v25

    or-int v2, v29, v2

    move/from16 v4, v27

    goto :goto_11

    :cond_19
    move/from16 v4, v25

    :goto_11
    move/from16 v25, v5

    and-int/lit16 v5, v2, 0xff

    move/from16 v27, v7

    and-int/lit16 v7, v2, 0x400

    if-eqz v7, :cond_1a

    add-int/lit8 v7, v21, 0x1

    aput v22, v11, v21

    move/from16 v21, v7

    :cond_1a
    const/16 v7, 0x33

    move/from16 v31, v8

    if-lt v5, v7, :cond_22

    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v8, 0xd800

    if-lt v4, v8, :cond_1c

    and-int/lit16 v4, v4, 0x1fff

    const/16 v32, 0xd

    :goto_12
    add-int/lit8 v33, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v8, :cond_1b

    and-int/lit16 v7, v7, 0x1fff

    shl-int v7, v7, v32

    or-int/2addr v4, v7

    add-int/lit8 v32, v32, 0xd

    move/from16 v7, v33

    const v8, 0xd800

    goto :goto_12

    :cond_1b
    shl-int v7, v7, v32

    or-int/2addr v4, v7

    move/from16 v7, v33

    :cond_1c
    add-int/lit8 v8, v5, -0x33

    move/from16 v32, v4

    const/16 v4, 0x9

    if-eq v8, v4, :cond_1e

    const/16 v4, 0x11

    if-ne v8, v4, :cond_1d

    goto :goto_14

    :cond_1d
    const/16 v4, 0xc

    if-ne v8, v4, :cond_1f

    if-nez v10, :cond_1f

    div-int/lit8 v4, v22, 0x3

    mul-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v8, v14, 0x1

    aget-object v14, v9, v14

    aput-object v14, v12, v4

    :goto_13
    move v14, v8

    goto :goto_15

    :cond_1e
    :goto_14
    div-int/lit8 v4, v22, 0x3

    mul-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v8, v14, 0x1

    aget-object v14, v9, v14

    aput-object v14, v12, v4

    goto :goto_13

    :cond_1f
    :goto_15
    mul-int/lit8 v4, v32, 0x2

    aget-object v8, v9, v4

    move/from16 v29, v4

    instance-of v4, v8, Ljava/lang/reflect/Field;

    if-eqz v4, :cond_20

    check-cast v8, Ljava/lang/reflect/Field;

    :goto_16
    move v4, v7

    goto :goto_17

    :cond_20
    check-cast v8, Ljava/lang/String;

    invoke-static {v6, v8}, LMr;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    aput-object v8, v9, v29

    goto :goto_16

    :goto_17
    invoke-virtual {v3, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    add-int/lit8 v8, v29, 0x1

    move/from16 v29, v4

    aget-object v4, v9, v8

    move/from16 v30, v7

    instance-of v7, v4, Ljava/lang/reflect/Field;

    if-eqz v7, :cond_21

    check-cast v4, Ljava/lang/reflect/Field;

    goto :goto_18

    :cond_21
    check-cast v4, Ljava/lang/String;

    invoke-static {v6, v4}, LMr;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    aput-object v4, v9, v8

    :goto_18
    invoke-virtual {v3, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v4, v7

    move/from16 v7, v30

    move/from16 v30, v29

    move/from16 v29, v7

    move v7, v4

    const/4 v4, 0x0

    goto/16 :goto_22

    :cond_22
    add-int/lit8 v7, v14, 0x1

    aget-object v8, v9, v14

    check-cast v8, Ljava/lang/String;

    invoke-static {v6, v8}, LMr;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    move/from16 v32, v7

    const/16 v7, 0x9

    if-eq v5, v7, :cond_29

    const/16 v7, 0x11

    if-ne v5, v7, :cond_23

    goto :goto_1c

    :cond_23
    const/16 v7, 0x1b

    if-eq v5, v7, :cond_28

    const/16 v7, 0x31

    if-ne v5, v7, :cond_24

    goto :goto_1b

    :cond_24
    const/16 v7, 0xc

    if-eq v5, v7, :cond_27

    const/16 v7, 0x1e

    if-eq v5, v7, :cond_27

    const/16 v7, 0x2c

    if-ne v5, v7, :cond_25

    goto :goto_1a

    :cond_25
    const/16 v7, 0x32

    if-ne v5, v7, :cond_2a

    add-int/lit8 v7, v23, 0x1

    aput v22, v11, v23

    div-int/lit8 v23, v22, 0x3

    mul-int/lit8 v23, v23, 0x2

    add-int/lit8 v29, v14, 0x2

    aget-object v30, v9, v32

    aput-object v30, v12, v23

    move/from16 v30, v7

    and-int/lit16 v7, v2, 0x800

    if-eqz v7, :cond_26

    add-int/lit8 v23, v23, 0x1

    add-int/lit8 v7, v14, 0x3

    aget-object v14, v9, v29

    aput-object v14, v12, v23

    move v14, v7

    :goto_19
    move/from16 v23, v30

    goto :goto_1d

    :cond_26
    move/from16 v14, v29

    goto :goto_19

    :cond_27
    :goto_1a
    if-nez v10, :cond_2a

    div-int/lit8 v7, v22, 0x3

    mul-int/lit8 v7, v7, 0x2

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v14, v14, 0x2

    aget-object v29, v9, v32

    aput-object v29, v12, v7

    goto :goto_1d

    :cond_28
    :goto_1b
    div-int/lit8 v7, v22, 0x3

    mul-int/lit8 v7, v7, 0x2

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v14, v14, 0x2

    aget-object v29, v9, v32

    aput-object v29, v12, v7

    goto :goto_1d

    :cond_29
    :goto_1c
    div-int/lit8 v7, v22, 0x3

    mul-int/lit8 v7, v7, 0x2

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v14

    aput-object v14, v12, v7

    :cond_2a
    move/from16 v14, v32

    :goto_1d
    invoke-virtual {v3, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    and-int/lit16 v8, v2, 0x1000

    move/from16 v29, v7

    const/16 v7, 0x1000

    if-ne v8, v7, :cond_2e

    const/16 v7, 0x11

    if-gt v5, v7, :cond_2e

    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v8, 0xd800

    if-lt v4, v8, :cond_2c

    and-int/lit16 v4, v4, 0x1fff

    const/16 v19, 0xd

    :goto_1e
    add-int/lit8 v30, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v8, :cond_2b

    and-int/lit16 v7, v7, 0x1fff

    shl-int v7, v7, v19

    or-int/2addr v4, v7

    add-int/lit8 v19, v19, 0xd

    move/from16 v7, v30

    goto :goto_1e

    :cond_2b
    shl-int v7, v7, v19

    or-int/2addr v4, v7

    goto :goto_1f

    :cond_2c
    move/from16 v30, v7

    :goto_1f
    mul-int/lit8 v7, v20, 0x2

    div-int/lit8 v19, v4, 0x20

    add-int v19, v19, v7

    aget-object v7, v9, v19

    instance-of v8, v7, Ljava/lang/reflect/Field;

    if-eqz v8, :cond_2d

    check-cast v7, Ljava/lang/reflect/Field;

    goto :goto_20

    :cond_2d
    check-cast v7, Ljava/lang/String;

    invoke-static {v6, v7}, LMr;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    aput-object v7, v9, v19

    :goto_20
    invoke-virtual {v3, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    rem-int/lit8 v4, v4, 0x20

    goto :goto_21

    :cond_2e
    const v7, 0xfffff

    move/from16 v30, v4

    const/4 v4, 0x0

    :goto_21
    const/16 v8, 0x12

    if-lt v5, v8, :cond_2f

    const/16 v8, 0x31

    if-gt v5, v8, :cond_2f

    add-int/lit8 v8, v24, 0x1

    aput v29, v11, v24

    move/from16 v24, v8

    :cond_2f
    :goto_22
    add-int/lit8 v8, v22, 0x1

    aput v25, v26, v22

    add-int/lit8 v19, v22, 0x2

    move-object/from16 v25, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_30

    const/high16 v1, 0x20000000

    goto :goto_23

    :cond_30
    const/4 v1, 0x0

    :goto_23
    and-int/lit16 v2, v2, 0x100

    if-eqz v2, :cond_31

    const/high16 v2, 0x10000000

    goto :goto_24

    :cond_31
    const/4 v2, 0x0

    :goto_24
    or-int/2addr v1, v2

    shl-int/lit8 v2, v5, 0x14

    or-int/2addr v1, v2

    or-int v1, v1, v29

    aput v1, v26, v8

    add-int/lit8 v22, v22, 0x3

    shl-int/lit8 v1, v4, 0x14

    or-int/2addr v1, v7

    aput v1, v26, v19

    move-object/from16 v1, v25

    move-object/from16 v2, v26

    move/from16 v7, v27

    move/from16 v4, v28

    move/from16 v5, v30

    move/from16 v8, v31

    goto/16 :goto_d

    :cond_32
    move-object/from16 v26, v2

    move/from16 v27, v7

    move/from16 v31, v8

    new-instance v4, LMr;

    iget-object v9, v0, Lbv;->a:LB;

    move-object/from16 v14, p1

    move-object/from16 v16, p3

    move-object/from16 v17, p4

    move-object/from16 v18, p5

    move-object v6, v12

    move v12, v15

    move-object/from16 v5, v26

    move-object/from16 v15, p2

    invoke-direct/range {v4 .. v18}, LMr;-><init>([I[Ljava/lang/Object;IILB;Z[IIILQs;Lvo;LYC;LUg;Lsq;)V

    return-object v4
.end method

.method public static D(I)J
    .locals 2

    const v0, 0xfffff

    and-int/2addr p0, v0

    int-to-long v0, p0

    return-wide v0
.end method

.method public static E(JLjava/lang/Object;)I
    .locals 1

    sget-object v0, LjD;->c:LiD;

    invoke-virtual {v0, p0, p1, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static F(JLjava/lang/Object;)J
    .locals 1

    sget-object v0, LjD;->c:LiD;

    invoke-virtual {v0, p0, p1, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Field "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static U(I)I
    .locals 1

    const/high16 v0, 0xff00000

    and-int/2addr p0, v0

    ushr-int/lit8 p0, p0, 0x14

    return p0
.end method

.method public static X(ILjava/lang/Object;LD2;)V
    .locals 5

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/String;

    iget-object p2, p2, LD2;->b:Ljava/lang/Object;

    check-cast p2, Lma;

    const/4 v0, 0x2

    invoke-virtual {p2, p0, v0}, Lma;->a0(II)V

    iget p0, p2, Lma;->h:I

    iget-object v0, p2, Lma;->g:[B

    iget v1, p2, Lma;->i:I

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    mul-int/lit8 v2, v2, 0x3

    invoke-static {v2}, Lma;->R(I)I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3}, Lma;->R(I)I

    move-result v3

    if-ne v3, v2, :cond_0

    add-int v2, v1, v3

    iput v2, p2, Lma;->i:I

    sub-int/2addr p0, v2

    sget-object v4, LtD;->a:LPj;

    invoke-virtual {v4, p1, v0, v2, p0}, LPj;->j(Ljava/lang/String;[BII)I

    move-result p0

    iput v1, p2, Lma;->i:I

    sub-int v0, p0, v1

    sub-int/2addr v0, v3

    invoke-virtual {p2, v0}, Lma;->b0(I)V

    iput p0, p2, Lma;->i:I

    return-void

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LtD;->b(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p2, v2}, Lma;->b0(I)V

    iget v2, p2, Lma;->i:I

    sub-int/2addr p0, v2

    sget-object v3, LtD;->a:LPj;

    invoke-virtual {v3, p1, v0, v2, p0}, LPj;->j(Ljava/lang/String;[BII)I

    move-result p0

    iput p0, p2, Lma;->i:I
    :try_end_0
    .catch LsD; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_1
    move-exception p0

    new-instance p1, Lna;

    invoke-direct {p1, p0}, Lna;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    throw p1

    :goto_0
    iput v1, p2, Lma;->i:I

    sget-object v0, Lma;->j:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    invoke-virtual {v0, v1, v2, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p0, LLl;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    :try_start_1
    array-length p1, p0

    invoke-virtual {p2, p1}, Lma;->b0(I)V

    array-length p1, p0

    const/4 v0, 0x0

    invoke-virtual {p2, p0, v0, p1}, Lma;->U([BII)V
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_2

    return-void

    :catch_2
    move-exception p0

    new-instance p1, Lna;

    invoke-direct {p1, p0}, Lna;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    throw p1

    :cond_1
    check-cast p1, Ly6;

    invoke-virtual {p2, p0, p1}, LD2;->y(ILy6;)V

    return-void
.end method

.method public static l(Ljava/lang/Object;)V
    .locals 3

    invoke-static {p0}, LMr;->t(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Mutating immutable message: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static t(Ljava/lang/Object;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lvj;

    if-eqz v0, :cond_1

    check-cast p0, Lvj;

    invoke-virtual {p0}, Lvj;->n()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static v(Lvj;J)Ljava/util/List;
    .locals 1

    sget-object v0, LjD;->c:LiD;

    invoke-virtual {v0, p1, p2, p0}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final A(IILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p2}, LMr;->p(I)Lmx;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, LMr;->u(IILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {v0}, Lmx;->j()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, LMr;->p:Lsun/misc/Unsafe;

    invoke-virtual {p0, p2}, LMr;->V(I)I

    move-result p2

    const v1, 0xfffff

    and-int/2addr p2, v1

    int-to-long v1, p2

    invoke-virtual {p1, p3, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LMr;->t(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lmx;->j()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lmx;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final G(IJLjava/lang/Object;)V
    .locals 3

    sget-object v0, LMr;->p:Lsun/misc/Unsafe;

    invoke-virtual {p0, p1}, LMr;->o(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p4, p2, p3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LMr;->n:Lsq;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v2, v1

    check-cast v2, Lrq;

    iget-boolean v2, v2, Lrq;->a:Z

    if-nez v2, :cond_0

    sget-object v2, Lrq;->b:Lrq;

    invoke-virtual {v2}, Lrq;->c()Lrq;

    move-result-object v2

    invoke-static {v2, v1}, Lsq;->b(Ljava/lang/Object;Ljava/lang/Object;)Lrq;

    invoke-virtual {v0, p4, p2, p3, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_0
    invoke-static {p1}, LEy;->o(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final H(Ljava/lang/Object;[BIIIIIIIJILC4;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v9, p6

    move/from16 v2, p7

    move-wide/from16 v3, p10

    move/from16 v10, p12

    sget-object v5, LMr;->p:Lsun/misc/Unsafe;

    add-int/lit8 v6, v10, 0x2

    iget-object v7, v0, LMr;->a:[I

    aget v6, v7, v6

    const v7, 0xfffff

    and-int/2addr v6, v7

    int-to-long v6, v6

    const/4 v8, 0x5

    const/4 v11, 0x1

    const/4 v12, 0x2

    packed-switch p9, :pswitch_data_0

    :cond_0
    move/from16 v10, p3

    goto/16 :goto_3

    :pswitch_0
    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    invoke-virtual {v0, v9, v10, v1}, LMr;->A(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    and-int/lit8 v2, p5, -0x8

    or-int/lit8 v7, v2, 0x4

    invoke-virtual {v0, v10}, LMr;->p(I)Lmx;

    move-result-object v2

    check-cast v2, LMr;

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v8, p13

    invoke-virtual/range {v2 .. v8}, LMr;->I(Ljava/lang/Object;[BIIILC4;)I

    move-result v2

    iput-object v3, v8, LC4;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1, v3, v9, v10}, LMr;->T(Ljava/lang/Object;Ljava/lang/Object;II)V

    return v2

    :pswitch_1
    move-object/from16 v13, p2

    move/from16 v11, p3

    move-object/from16 v8, p13

    if-nez v2, :cond_1

    invoke-static {v13, v11, v8}, LNj;->v([BILC4;)I

    move-result v2

    iget-wide v10, v8, LC4;->b:J

    invoke-static {v10, v11}, Lka;->e(J)J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v5, v1, v3, v4, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :cond_1
    move v10, v11

    goto/16 :goto_3

    :pswitch_2
    move-object/from16 v13, p2

    move/from16 v11, p3

    move-object/from16 v8, p13

    if-nez v2, :cond_1

    invoke-static {v13, v11, v8}, LNj;->t([BILC4;)I

    move-result v2

    iget v8, v8, LC4;->a:I

    invoke-static {v8}, Lka;->d(I)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v1, v3, v4, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_3
    move-object/from16 v13, p2

    move/from16 v11, p3

    move-object/from16 v8, p13

    if-nez v2, :cond_1

    invoke-static {v13, v11, v8}, LNj;->t([BILC4;)I

    move-result v2

    iget v8, v8, LC4;->a:I

    invoke-virtual {v0, v10}, LMr;->n(I)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v1, v3, v4, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_4
    move-object/from16 v13, p2

    move/from16 v11, p3

    move-object/from16 v8, p13

    if-ne v2, v12, :cond_1

    invoke-static {v13, v11, v8}, LNj;->l([BILC4;)I

    move-result v2

    iget-object v8, v8, LC4;->c:Ljava/lang/Object;

    invoke-virtual {v5, v1, v3, v4, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_5
    move-object/from16 v13, p2

    move/from16 v11, p3

    move-object/from16 v8, p13

    if-ne v2, v12, :cond_1

    invoke-virtual {v0, v9, v10, v1}, LMr;->A(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v10}, LMr;->p(I)Lmx;

    move-result-object v3

    move/from16 v6, p4

    move-object v7, v8

    move v5, v11

    move-object v4, v13

    invoke-static/range {v2 .. v7}, LNj;->H(Ljava/lang/Object;Lmx;[BIILC4;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v9, v10}, LMr;->T(Ljava/lang/Object;Ljava/lang/Object;II)V

    return v3

    :pswitch_6
    move-object/from16 v13, p2

    move/from16 v10, p3

    move-object/from16 v8, p13

    if-ne v2, v12, :cond_6

    invoke-static {v13, v10, v8}, LNj;->t([BILC4;)I

    move-result v2

    iget v8, v8, LC4;->a:I

    if-nez v8, :cond_2

    const-string v8, ""

    invoke-virtual {v5, v1, v3, v4, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :cond_2
    const/high16 v10, 0x20000000

    and-int v10, p8, v10

    if-eqz v10, :cond_4

    add-int v10, v2, v8

    sget-object v11, LtD;->a:LPj;

    invoke-virtual {v11, v13, v2, v10}, LPj;->s([BII)Z

    move-result v10

    if-eqz v10, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, LPl;->b()LPl;

    move-result-object v1

    throw v1

    :cond_4
    :goto_0
    new-instance v10, Ljava/lang/String;

    sget-object v11, LLl;->a:Ljava/nio/charset/Charset;

    invoke-direct {v10, v13, v2, v8, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v5, v1, v3, v4, v10}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v2, v8

    :goto_1
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_7
    move-object/from16 v13, p2

    move/from16 v10, p3

    move-object/from16 v8, p13

    if-nez v2, :cond_6

    invoke-static {v13, v10, v8}, LNj;->v([BILC4;)I

    move-result v2

    iget-wide v12, v8, LC4;->b:J

    const-wide/16 v14, 0x0

    cmp-long v8, v12, v14

    if-eqz v8, :cond_5

    goto :goto_2

    :cond_5
    const/4 v11, 0x0

    :goto_2
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v5, v1, v3, v4, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_8
    move-object/from16 v13, p2

    move/from16 v10, p3

    if-ne v2, v8, :cond_6

    invoke-static {v10, v13}, LNj;->m(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v10, 0x4

    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_9
    move-object/from16 v13, p2

    move/from16 v10, p3

    if-ne v2, v11, :cond_6

    invoke-static {v10, v13}, LNj;->n(I[B)J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v10, 0x8

    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_a
    move-object/from16 v13, p2

    move/from16 v10, p3

    move-object/from16 v8, p13

    if-nez v2, :cond_6

    invoke-static {v13, v10, v8}, LNj;->t([BILC4;)I

    move-result v2

    iget v8, v8, LC4;->a:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v1, v3, v4, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_b
    move-object/from16 v13, p2

    move/from16 v10, p3

    move-object/from16 v8, p13

    if-nez v2, :cond_6

    invoke-static {v13, v10, v8}, LNj;->v([BILC4;)I

    move-result v2

    iget-wide v10, v8, LC4;->b:J

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v5, v1, v3, v4, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_c
    move-object/from16 v13, p2

    move/from16 v10, p3

    if-ne v2, v8, :cond_6

    invoke-static {v10, v13}, LNj;->m(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v10, 0x4

    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_d
    move-object/from16 v13, p2

    move/from16 v10, p3

    if-ne v2, v11, :cond_6

    invoke-static {v10, v13}, LNj;->n(I[B)J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v10, 0x8

    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :cond_6
    :goto_3
    return v10

    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final I(Ljava/lang/Object;[BIIILC4;)I
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v14, p5

    move-object/from16 v13, p6

    invoke-static {v2}, LMr;->l(Ljava/lang/Object;)V

    sget-object v1, LMr;->p:Lsun/misc/Unsafe;

    move/from16 v5, p3

    const/4 v6, -0x1

    const/4 v7, 0x0

    const v8, 0xfffff

    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_0
    const v16, 0xfffff

    :goto_1
    if-ge v5, v4, :cond_1d

    add-int/lit8 v12, v5, 0x1

    aget-byte v5, v3, v5

    if-gez v5, :cond_0

    invoke-static {v5, v3, v12, v13}, LNj;->s(I[BILC4;)I

    move-result v12

    iget v5, v13, LC4;->a:I

    :cond_0
    move/from16 v26, v12

    move v12, v5

    move/from16 v5, v26

    const/16 p3, 0x0

    ushr-int/lit8 v15, v12, 0x3

    and-int/lit8 v11, v12, 0x7

    iget v10, v0, LMr;->d:I

    iget v3, v0, LMr;->c:I

    const/4 v4, 0x3

    if-le v15, v6, :cond_2

    div-int/2addr v7, v4

    if-lt v15, v3, :cond_1

    if-gt v15, v10, :cond_1

    invoke-virtual {v0, v15, v7}, LMr;->R(II)I

    move-result v3

    goto :goto_2

    :cond_1
    const/4 v3, -0x1

    :goto_2
    const/4 v10, 0x0

    :goto_3
    const/4 v6, -0x1

    goto :goto_4

    :cond_2
    if-lt v15, v3, :cond_3

    if-gt v15, v10, :cond_3

    const/4 v10, 0x0

    invoke-virtual {v0, v15, v10}, LMr;->R(II)I

    move-result v3

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    const/4 v3, -0x1

    goto :goto_3

    :goto_4
    if-ne v3, v6, :cond_4

    move/from16 v20, v6

    move v7, v10

    move/from16 v19, v7

    move/from16 v18, v15

    move-object v6, v0

    move-object v15, v1

    move-object v10, v2

    move v2, v12

    goto/16 :goto_16

    :cond_4
    add-int/lit8 v7, v3, 0x1

    iget-object v6, v0, LMr;->a:[I

    aget v7, v6, v7

    move/from16 v18, v10

    invoke-static {v7}, LMr;->U(I)I

    move-result v10

    and-int v4, v7, v16

    move/from16 v20, v5

    int-to-long v4, v4

    move-wide/from16 v21, v4

    const/16 v4, 0x11

    if-gt v10, v4, :cond_11

    add-int/lit8 v4, v3, 0x2

    aget v4, v6, v4

    ushr-int/lit8 v6, v4, 0x14

    const/4 v5, 0x1

    shl-int v23, v5, v6

    and-int v4, v4, v16

    if-eq v4, v8, :cond_6

    move/from16 v6, v16

    if-eq v8, v6, :cond_5

    int-to-long v5, v8

    invoke-virtual {v1, v2, v5, v6, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_5
    int-to-long v5, v4

    invoke-virtual {v1, v2, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v9

    move/from16 v24, v4

    :goto_5
    move/from16 v25, v9

    goto :goto_6

    :cond_6
    move/from16 v24, v8

    goto :goto_5

    :goto_6
    const/4 v4, 0x5

    packed-switch v10, :pswitch_data_0

    move-object/from16 v9, p2

    move-object v10, v1

    move-object v1, v2

    move-object v7, v13

    move/from16 v8, v20

    const/16 v17, -0x1

    move v13, v3

    goto/16 :goto_12

    :pswitch_0
    const/4 v4, 0x3

    if-ne v11, v4, :cond_7

    invoke-virtual {v0, v3, v2}, LMr;->z(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    shl-int/lit8 v5, v15, 0x3

    or-int/lit8 v8, v5, 0x4

    invoke-virtual {v0, v3}, LMr;->p(I)Lmx;

    move-result-object v5

    check-cast v5, LMr;

    move/from16 v7, p4

    move-object v9, v13

    move/from16 v6, v20

    const/16 v17, -0x1

    move v13, v3

    move-object v3, v5

    move-object/from16 v5, p2

    invoke-virtual/range {v3 .. v9}, LMr;->I(Ljava/lang/Object;[BIIILC4;)I

    move-result v3

    move-object v7, v5

    iput-object v4, v9, LC4;->c:Ljava/lang/Object;

    invoke-virtual {v0, v13, v2, v4}, LMr;->S(ILjava/lang/Object;Ljava/lang/Object;)V

    or-int v4, v25, v23

    move v5, v3

    move-object v3, v7

    move v7, v13

    move v6, v15

    move/from16 v8, v24

    const v16, 0xfffff

    move-object v13, v9

    move v9, v4

    move/from16 v4, p4

    goto/16 :goto_1

    :cond_7
    move-object v9, v13

    const/16 v17, -0x1

    move v13, v3

    move-object v10, v1

    move-object v1, v2

    move-object v7, v9

    move/from16 v8, v20

    move-object/from16 v9, p2

    goto/16 :goto_12

    :pswitch_1
    move-object/from16 v7, p2

    move-object v9, v13

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-nez v11, :cond_8

    invoke-static {v7, v3, v9}, LNj;->v([BILC4;)I

    move-result v8

    iget-wide v3, v9, LC4;->b:J

    invoke-static {v3, v4}, Lka;->e(J)J

    move-result-wide v5

    move-wide/from16 v3, v21

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v10, v2

    or-int v2, v25, v23

    move/from16 v4, p4

    move-object v3, v7

    move v5, v8

    move v7, v13

    move v6, v15

    move/from16 v8, v24

    const v16, 0xfffff

    move-object v13, v9

    move v9, v2

    :goto_7
    move-object v2, v10

    goto/16 :goto_1

    :cond_8
    move-object v8, v9

    move-object v9, v7

    move-object v7, v8

    move-object v10, v1

    move-object v1, v2

    :goto_8
    move v8, v3

    goto/16 :goto_12

    :pswitch_2
    move-object/from16 v7, p2

    move-object v10, v2

    move-object v9, v13

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-nez v11, :cond_9

    invoke-static {v7, v3, v9}, LNj;->t([BILC4;)I

    move-result v2

    iget v3, v9, LC4;->a:I

    invoke-static {v3}, Lka;->d(I)I

    move-result v3

    invoke-virtual {v1, v10, v5, v6, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_9
    or-int v3, v25, v23

    move-object v4, v9

    move v9, v3

    move-object v3, v7

    move v7, v13

    move-object v13, v4

    move/from16 v4, p4

    move v5, v2

    move-object v2, v10

    :goto_a
    move v6, v15

    move/from16 v8, v24

    goto/16 :goto_0

    :cond_9
    move-object v8, v10

    move-object v10, v1

    move-object v1, v8

    move-object v8, v9

    move-object v9, v7

    move-object v7, v8

    goto :goto_8

    :pswitch_3
    move-object/from16 v7, p2

    move-object v10, v2

    move-object v9, v13

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-nez v11, :cond_9

    invoke-static {v7, v3, v9}, LNj;->t([BILC4;)I

    move-result v2

    iget v3, v9, LC4;->a:I

    invoke-virtual {v0, v13}, LMr;->n(I)V

    invoke-virtual {v1, v10, v5, v6, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_9

    :pswitch_4
    move-object/from16 v7, p2

    move-object v10, v2

    move-object v9, v13

    move-wide/from16 v5, v21

    const/4 v2, 0x2

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-ne v11, v2, :cond_9

    invoke-static {v7, v3, v9}, LNj;->l([BILC4;)I

    move-result v2

    iget-object v3, v9, LC4;->c:Ljava/lang/Object;

    invoke-virtual {v1, v10, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :pswitch_5
    move-object/from16 v7, p2

    move-object v10, v2

    move-object v9, v13

    const/4 v2, 0x2

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-ne v11, v2, :cond_a

    move-object v2, v1

    invoke-virtual {v0, v13, v10}, LMr;->z(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v2

    invoke-virtual {v0, v13}, LMr;->p(I)Lmx;

    move-result-object v2

    move/from16 v5, p4

    move-object v8, v4

    move-object v6, v9

    move v4, v3

    move-object v3, v7

    invoke-static/range {v1 .. v6}, LNj;->H(Ljava/lang/Object;Lmx;[BIILC4;)I

    move-result v2

    move-object v9, v3

    move-object v3, v1

    move-object v1, v6

    invoke-virtual {v0, v13, v10, v3}, LMr;->S(ILjava/lang/Object;Ljava/lang/Object;)V

    :goto_b
    or-int v3, v25, v23

    move-object v4, v9

    move v9, v3

    move-object v3, v4

    move/from16 v4, p4

    move v5, v2

    move-object v2, v10

    move v7, v13

    move v6, v15

    const v16, 0xfffff

    move-object v13, v1

    move-object v1, v8

    :goto_c
    move/from16 v8, v24

    goto/16 :goto_1

    :cond_a
    move-object v8, v1

    move-object v1, v9

    move-object v9, v7

    :cond_b
    move-object v7, v1

    move-object v1, v10

    move-object v10, v8

    goto/16 :goto_8

    :pswitch_6
    move-object/from16 v9, p2

    move-object v8, v1

    move-object v10, v2

    move-object v1, v13

    move-wide/from16 v5, v21

    const/4 v2, 0x2

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-ne v11, v2, :cond_b

    const/high16 v2, 0x20000000

    and-int/2addr v2, v7

    if-nez v2, :cond_c

    invoke-static {v9, v3, v1}, LNj;->p([BILC4;)I

    move-result v2

    goto :goto_d

    :cond_c
    invoke-static {v9, v3, v1}, LNj;->q([BILC4;)I

    move-result v2

    :goto_d
    iget-object v3, v1, LC4;->c:Ljava/lang/Object;

    invoke-virtual {v8, v10, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_b

    :pswitch_7
    move-object/from16 v9, p2

    move-object v8, v1

    move-object v10, v2

    move-object v1, v13

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-nez v11, :cond_b

    invoke-static {v9, v3, v1}, LNj;->v([BILC4;)I

    move-result v2

    iget-wide v3, v1, LC4;->b:J

    const-wide/16 v19, 0x0

    cmp-long v3, v3, v19

    if-eqz v3, :cond_d

    const/4 v3, 0x1

    goto :goto_e

    :cond_d
    move/from16 v3, v18

    :goto_e
    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v10, v5, v6, v3}, LiD;->k(Ljava/lang/Object;JZ)V

    goto :goto_b

    :pswitch_8
    move-object/from16 v9, p2

    move-object v8, v1

    move-object v10, v2

    move-object v1, v13

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-ne v11, v4, :cond_b

    invoke-static {v3, v9}, LNj;->m(I[B)I

    move-result v2

    invoke-virtual {v8, v10, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v5, v3, 0x4

    or-int v2, v25, v23

    move/from16 v4, p4

    move-object v3, v9

    move v7, v13

    move v6, v15

    const v16, 0xfffff

    move-object v13, v1

    move v9, v2

    move-object v1, v8

    move-object v2, v10

    goto :goto_c

    :pswitch_9
    move-object/from16 v9, p2

    move-object v8, v1

    move-object v10, v2

    move-object v1, v13

    move-wide/from16 v5, v21

    const/4 v2, 0x1

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-ne v11, v2, :cond_e

    move-wide/from16 v21, v5

    invoke-static {v3, v9}, LNj;->n(I[B)J

    move-result-wide v5

    move-object v7, v1

    move-object v1, v8

    move-object v2, v10

    move v8, v3

    move-wide/from16 v3, v21

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v5, v8, 0x8

    :goto_f
    or-int v3, v25, v23

    move-object v4, v9

    move v9, v3

    move-object v3, v4

    move v4, v13

    move-object v13, v7

    move v7, v4

    move/from16 v4, p4

    goto/16 :goto_a

    :cond_e
    move-object v7, v1

    move-object v1, v8

    move v8, v3

    move-object/from16 v26, v10

    move-object v10, v1

    move-object/from16 v1, v26

    goto/16 :goto_12

    :pswitch_a
    move-object/from16 v9, p2

    move-object v7, v13

    move/from16 v8, v20

    const/16 v17, -0x1

    move v13, v3

    move-wide/from16 v3, v21

    if-nez v11, :cond_f

    invoke-static {v9, v8, v7}, LNj;->t([BILC4;)I

    move-result v5

    iget v6, v7, LC4;->a:I

    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_f

    :cond_f
    move-object v10, v1

    :cond_10
    move-object v1, v2

    goto/16 :goto_12

    :pswitch_b
    move-object/from16 v9, p2

    move-object v7, v13

    move/from16 v8, v20

    const/16 v17, -0x1

    move v13, v3

    move-wide/from16 v3, v21

    if-nez v11, :cond_f

    invoke-static {v9, v8, v7}, LNj;->v([BILC4;)I

    move-result v8

    iget-wide v5, v7, LC4;->b:J

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v10, v1

    or-int v1, v25, v23

    move v3, v13

    move-object v13, v7

    move v7, v3

    move/from16 v4, p4

    move v5, v8

    :goto_10
    move-object v3, v9

    move v6, v15

    move/from16 v8, v24

    const v16, 0xfffff

    move v9, v1

    :goto_11
    move-object v1, v10

    goto/16 :goto_1

    :pswitch_c
    move-object/from16 v9, p2

    move-object v10, v1

    move-object v7, v13

    move/from16 v8, v20

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    move v13, v3

    if-ne v11, v4, :cond_10

    invoke-static {v8, v9}, LNj;->m(I[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sget-object v3, LjD;->c:LiD;

    invoke-virtual {v3, v2, v5, v6, v1}, LiD;->n(Ljava/lang/Object;JF)V

    add-int/lit8 v5, v8, 0x4

    or-int v1, v25, v23

    move v3, v13

    move-object v13, v7

    move v7, v3

    move/from16 v4, p4

    goto :goto_10

    :pswitch_d
    move-object/from16 v9, p2

    move-object v10, v1

    move-object v7, v13

    move/from16 v8, v20

    move-wide/from16 v5, v21

    const/4 v1, 0x1

    const/16 v17, -0x1

    move v13, v3

    if-ne v11, v1, :cond_10

    invoke-static {v8, v9}, LNj;->n(I[B)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    sget-object v1, LjD;->c:LiD;

    move-wide/from16 v26, v5

    move-wide v5, v3

    move-wide/from16 v3, v26

    invoke-virtual/range {v1 .. v6}, LiD;->m(Ljava/lang/Object;JD)V

    move-object v1, v2

    add-int/lit8 v5, v8, 0x8

    or-int v2, v25, v23

    move v3, v13

    move-object v13, v7

    move v7, v3

    move/from16 v4, p4

    move-object v3, v9

    move v6, v15

    move/from16 v8, v24

    const v16, 0xfffff

    move v9, v2

    move-object v2, v1

    goto :goto_11

    :goto_12
    move-object v6, v0

    move v5, v8

    move v2, v12

    move v7, v13

    move/from16 v20, v17

    move/from16 v19, v18

    move/from16 v8, v24

    move/from16 v9, v25

    move/from16 v18, v15

    move-object v15, v10

    move-object v10, v1

    goto/16 :goto_16

    :cond_11
    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    move v13, v3

    move/from16 v3, v20

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    const/16 v4, 0x1b

    if-ne v10, v4, :cond_15

    const/4 v4, 0x2

    if-ne v11, v4, :cond_14

    invoke-virtual {v2, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LKl;

    move-object v7, v4

    check-cast v7, LE;

    iget-boolean v7, v7, LE;->a:Z

    if-nez v7, :cond_13

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_12

    const/16 v7, 0xa

    goto :goto_13

    :cond_12
    mul-int/lit8 v7, v7, 0x2

    :goto_13
    invoke-interface {v4, v7}, LKl;->f(I)LKl;

    move-result-object v4

    invoke-virtual {v2, v1, v5, v6, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_13
    move-object v6, v4

    invoke-virtual {v0, v13}, LMr;->p(I)Lmx;

    move-result-object v1

    move v4, v12

    move-object v12, v2

    move v2, v4

    move/from16 v5, p4

    move-object/from16 v7, p6

    move v4, v3

    move-object/from16 v3, p2

    invoke-static/range {v1 .. v7}, LNj;->o(Lmx;I[BIILKl;LC4;)I

    move-result v1

    move/from16 v4, p4

    move v5, v1

    move-object v1, v12

    move v7, v13

    move v6, v15

    const v16, 0xfffff

    move-object/from16 v13, p6

    move v12, v2

    move-object/from16 v2, p1

    goto/16 :goto_1

    :cond_14
    move/from16 v26, v12

    move-object v12, v2

    move/from16 v2, v26

    move-object/from16 v1, p1

    move/from16 v24, v8

    move/from16 v20, v17

    move/from16 v19, v18

    move/from16 v17, v9

    move/from16 v18, v15

    move-object v15, v12

    move v12, v13

    goto/16 :goto_14

    :cond_15
    move/from16 v26, v12

    move-object v12, v2

    move/from16 v2, v26

    const/16 v1, 0x31

    if-gt v10, v1, :cond_17

    move/from16 v24, v8

    move v1, v9

    int-to-long v8, v7

    move/from16 v4, p4

    move v7, v13

    move/from16 v20, v17

    move/from16 v19, v18

    move-object/from16 v13, p6

    move/from16 v17, v1

    move/from16 v18, v15

    move-object/from16 v1, p1

    move-object v15, v12

    move/from16 v26, v2

    move-object/from16 v2, p2

    move-wide/from16 v27, v5

    move/from16 v5, v26

    move v6, v11

    move-wide/from16 v11, v27

    invoke-virtual/range {v0 .. v13}, LMr;->K(Ljava/lang/Object;[BIIIIIJIJLC4;)I

    move-result v6

    move v2, v5

    move v12, v7

    if-eq v6, v3, :cond_16

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v13, p6

    move v5, v6

    move v7, v12

    move/from16 v9, v17

    move/from16 v6, v18

    move/from16 v8, v24

    const v16, 0xfffff

    move v12, v2

    move-object v2, v1

    move-object v1, v15

    goto/16 :goto_1

    :cond_16
    move-object v10, v1

    move v5, v6

    move v7, v12

    move/from16 v9, v17

    move/from16 v8, v24

    move-object v6, v0

    goto/16 :goto_16

    :cond_17
    move-object/from16 v1, p1

    move/from16 v24, v8

    move/from16 v20, v17

    move/from16 v19, v18

    move/from16 v17, v9

    move v9, v10

    move/from16 v18, v15

    move-object v15, v12

    move v12, v13

    move-wide/from16 v26, v5

    move v6, v11

    move-wide/from16 v10, v26

    const/16 v4, 0x32

    if-ne v9, v4, :cond_19

    const/4 v4, 0x2

    if-eq v6, v4, :cond_18

    :goto_14
    move-object v6, v0

    move-object v10, v1

    move v5, v3

    :goto_15
    move v7, v12

    move/from16 v9, v17

    move/from16 v8, v24

    goto :goto_16

    :cond_18
    invoke-virtual {v0, v12, v10, v11, v1}, LMr;->G(IJLjava/lang/Object;)V

    throw p3

    :cond_19
    move/from16 v4, p4

    move-object/from16 v13, p6

    move v5, v2

    move v8, v7

    move-object/from16 v2, p2

    move v7, v6

    move/from16 v6, v18

    invoke-virtual/range {v0 .. v13}, LMr;->H(Ljava/lang/Object;[BIIIIIIIJILC4;)I

    move-result v7

    move-object v10, v1

    move v2, v5

    move-object v6, v0

    if-eq v7, v3, :cond_1a

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v13, p6

    move-object v0, v6

    move v5, v7

    move v7, v12

    move-object v1, v15

    move/from16 v9, v17

    move/from16 v6, v18

    move/from16 v8, v24

    const v16, 0xfffff

    move v12, v2

    goto/16 :goto_7

    :cond_1a
    move v5, v7

    goto :goto_15

    :goto_16
    if-ne v2, v14, :cond_1b

    if-eqz v14, :cond_1b

    move/from16 v4, p4

    move v12, v2

    :goto_17
    const v0, 0xfffff

    goto :goto_18

    :cond_1b
    move-object v0, v10

    check-cast v0, Lvj;

    iget-object v1, v0, Lvj;->unknownFields:LXC;

    sget-object v3, LXC;->f:LXC;

    if-ne v1, v3, :cond_1c

    invoke-static {}, LXC;->c()LXC;

    move-result-object v1

    iput-object v1, v0, Lvj;->unknownFields:LXC;

    :cond_1c
    move/from16 v3, p4

    move-object v4, v1

    move v0, v2

    move v2, v5

    move-object/from16 v1, p2

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, LNj;->r(I[BIILXC;LC4;)I

    move-result v2

    move v5, v0

    move-object/from16 v13, p6

    move v4, v3

    move v12, v5

    move-object v0, v6

    move-object v1, v15

    move/from16 v6, v18

    const v16, 0xfffff

    move-object/from16 v3, p2

    move v5, v2

    goto/16 :goto_7

    :cond_1d
    move-object v6, v0

    move-object v15, v1

    move-object v10, v2

    move/from16 v24, v8

    move/from16 v17, v9

    const/16 p3, 0x0

    goto :goto_17

    :goto_18
    if-eq v8, v0, :cond_1e

    int-to-long v0, v8

    invoke-virtual {v15, v10, v0, v1, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_1e
    iget v0, v6, LMr;->i:I

    :goto_19
    iget v1, v6, LMr;->j:I

    if-ge v0, v1, :cond_1f

    iget-object v1, v6, LMr;->h:[I

    aget v1, v1, v0

    move-object/from16 v2, p3

    invoke-virtual {v6, v1, v10, v2}, LMr;->m(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_19

    :cond_1f
    if-nez v14, :cond_21

    if-ne v5, v4, :cond_20

    goto :goto_1a

    :cond_20
    invoke-static {}, LPl;->f()LPl;

    move-result-object v0

    throw v0

    :cond_21
    if-gt v5, v4, :cond_22

    if-ne v12, v14, :cond_22

    :goto_1a
    return v5

    :cond_22
    invoke-static {}, LPl;->f()LPl;

    move-result-object v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final J(Ljava/lang/Object;[BIILC4;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move/from16 v8, p4

    move-object/from16 v13, p5

    invoke-static {v2}, LMr;->l(Ljava/lang/Object;)V

    sget-object v1, LMr;->p:Lsun/misc/Unsafe;

    move/from16 v3, p3

    const/4 v4, -0x1

    const/4 v5, 0x0

    const v10, 0xfffff

    const/4 v11, 0x0

    :goto_0
    if-ge v3, v8, :cond_1c

    add-int/lit8 v6, v3, 0x1

    aget-byte v3, v7, v3

    if-gez v3, :cond_0

    invoke-static {v3, v7, v6, v13}, LNj;->s(I[BILC4;)I

    move-result v6

    iget v3, v13, LC4;->a:I

    :cond_0
    ushr-int/lit8 v12, v3, 0x3

    const v16, 0xfffff

    and-int/lit8 v14, v3, 0x7

    iget v9, v0, LMr;->d:I

    iget v15, v0, LMr;->c:I

    if-le v12, v4, :cond_2

    div-int/lit8 v5, v5, 0x3

    if-lt v12, v15, :cond_1

    if-gt v12, v9, :cond_1

    invoke-virtual {v0, v12, v5}, LMr;->R(II)I

    move-result v4

    goto :goto_1

    :cond_1
    const/4 v4, -0x1

    :goto_1
    const/4 v15, 0x0

    :goto_2
    move v9, v4

    const/4 v4, -0x1

    goto :goto_3

    :cond_2
    if-lt v12, v15, :cond_3

    if-gt v12, v9, :cond_3

    const/4 v15, 0x0

    invoke-virtual {v0, v12, v15}, LMr;->R(II)I

    move-result v4

    goto :goto_2

    :cond_3
    const/4 v15, 0x0

    const/4 v4, -0x1

    goto :goto_2

    :goto_3
    if-ne v9, v4, :cond_4

    move v5, v6

    move-object v6, v2

    move v2, v5

    move-object/from16 v22, v1

    move v5, v3

    move/from16 v18, v4

    move/from16 v17, v12

    move v12, v15

    goto/16 :goto_15

    :cond_4
    add-int/lit8 v5, v9, 0x1

    iget-object v4, v0, LMr;->a:[I

    aget v5, v4, v5

    invoke-static {v5}, LMr;->U(I)I

    move-result v15

    move/from16 p3, v3

    and-int v3, v5, v16

    move-object/from16 v18, v4

    int-to-long v3, v3

    move-wide/from16 v19, v3

    const/16 v3, 0x11

    if-gt v15, v3, :cond_11

    add-int/lit8 v3, v9, 0x2

    aget v3, v18, v3

    ushr-int/lit8 v18, v3, 0x14

    const/4 v4, 0x1

    shl-int v18, v4, v18

    and-int v3, v3, v16

    if-eq v3, v10, :cond_7

    move/from16 v4, v16

    move/from16 v21, v5

    if-eq v10, v4, :cond_5

    int-to-long v4, v10

    invoke-virtual {v1, v2, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const v4, 0xfffff

    :cond_5
    if-eq v3, v4, :cond_6

    int-to-long v4, v3

    invoke-virtual {v1, v2, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v11

    :cond_6
    move v10, v3

    goto :goto_4

    :cond_7
    move/from16 v21, v5

    :goto_4
    const/4 v3, 0x5

    packed-switch v15, :pswitch_data_0

    move-object v15, v1

    move-object v1, v2

    move-object v8, v7

    const/16 v17, -0x1

    :goto_5
    move v7, v6

    goto/16 :goto_11

    :pswitch_0
    if-nez v14, :cond_8

    invoke-static {v7, v6, v13}, LNj;->v([BILC4;)I

    move-result v14

    iget-wide v3, v13, LC4;->b:J

    invoke-static {v3, v4}, Lka;->e(J)J

    move-result-wide v5

    move-wide/from16 v3, v19

    const/16 v17, -0x1

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v15, v2

    or-int v11, v11, v18

    move v5, v9

    move v4, v12

    move v3, v14

    goto/16 :goto_0

    :cond_8
    const/16 v17, -0x1

    move-object v15, v1

    move-object v1, v2

    :goto_6
    move-object v8, v7

    goto :goto_5

    :pswitch_1
    move-object v15, v2

    move-wide/from16 v4, v19

    const/16 v17, -0x1

    if-nez v14, :cond_9

    invoke-static {v7, v6, v13}, LNj;->t([BILC4;)I

    move-result v3

    iget v2, v13, LC4;->a:I

    invoke-static {v2}, Lka;->d(I)I

    move-result v2

    invoke-virtual {v1, v15, v4, v5, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_7
    or-int v11, v11, v18

    move v5, v9

    move v4, v12

    move-object v2, v15

    goto/16 :goto_0

    :cond_9
    move-object v8, v15

    move-object v15, v1

    move-object v1, v8

    goto :goto_6

    :pswitch_2
    move-object v15, v2

    move-wide/from16 v4, v19

    const/16 v17, -0x1

    if-nez v14, :cond_9

    invoke-static {v7, v6, v13}, LNj;->t([BILC4;)I

    move-result v3

    iget v2, v13, LC4;->a:I

    invoke-virtual {v1, v15, v4, v5, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_7

    :pswitch_3
    move-object v15, v2

    move-wide/from16 v4, v19

    const/4 v2, 0x2

    const/16 v17, -0x1

    if-ne v14, v2, :cond_9

    invoke-static {v7, v6, v13}, LNj;->l([BILC4;)I

    move-result v3

    iget-object v2, v13, LC4;->c:Ljava/lang/Object;

    invoke-virtual {v1, v15, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :pswitch_4
    move-object v15, v2

    const/4 v2, 0x2

    const/16 v17, -0x1

    if-ne v14, v2, :cond_a

    move-object v2, v1

    invoke-virtual {v0, v9, v15}, LMr;->z(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v2

    invoke-virtual {v0, v9}, LMr;->p(I)Lmx;

    move-result-object v2

    move-object v4, v7

    move-object v7, v3

    move-object v3, v4

    move v4, v6

    move v5, v8

    move-object v6, v13

    invoke-static/range {v1 .. v6}, LNj;->H(Ljava/lang/Object;Lmx;[BIILC4;)I

    move-result v2

    move-object v8, v3

    invoke-virtual {v0, v9, v15, v1}, LMr;->S(ILjava/lang/Object;Ljava/lang/Object;)V

    or-int v11, v11, v18

    move v3, v2

    :goto_8
    move-object v1, v7

    move-object v7, v8

    move v5, v9

    move v4, v12

    move-object v2, v15

    :goto_9
    move/from16 v8, p4

    goto/16 :goto_0

    :cond_a
    move-object v8, v7

    move-object v7, v1

    move-object v1, v15

    move-object v15, v7

    goto/16 :goto_5

    :pswitch_5
    move-object v15, v2

    move-object v8, v7

    move-wide/from16 v4, v19

    const/4 v2, 0x2

    const/16 v17, -0x1

    move-object v7, v1

    move v1, v6

    if-ne v14, v2, :cond_c

    const/high16 v2, 0x20000000

    and-int v2, v21, v2

    if-nez v2, :cond_b

    invoke-static {v8, v1, v13}, LNj;->p([BILC4;)I

    move-result v1

    :goto_a
    move v3, v1

    goto :goto_b

    :cond_b
    invoke-static {v8, v1, v13}, LNj;->q([BILC4;)I

    move-result v1

    goto :goto_a

    :goto_b
    iget-object v1, v13, LC4;->c:Ljava/lang/Object;

    invoke-virtual {v7, v15, v4, v5, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_c
    or-int v11, v11, v18

    goto :goto_8

    :cond_c
    move-object/from16 v23, v7

    move v7, v1

    move-object v1, v15

    move-object/from16 v15, v23

    goto/16 :goto_11

    :pswitch_6
    move-object v15, v2

    move-object v8, v7

    move-wide/from16 v4, v19

    const/16 v17, -0x1

    move-object v7, v1

    move v1, v6

    if-nez v14, :cond_c

    invoke-static {v8, v1, v13}, LNj;->v([BILC4;)I

    move-result v3

    iget-wide v1, v13, LC4;->b:J

    const-wide/16 v19, 0x0

    cmp-long v1, v1, v19

    if-eqz v1, :cond_d

    const/4 v1, 0x1

    goto :goto_d

    :cond_d
    const/4 v1, 0x0

    :goto_d
    sget-object v2, LjD;->c:LiD;

    invoke-virtual {v2, v15, v4, v5, v1}, LiD;->k(Ljava/lang/Object;JZ)V

    goto :goto_c

    :pswitch_7
    move-object v15, v2

    move-object v8, v7

    move-wide/from16 v4, v19

    const/16 v17, -0x1

    move-object v7, v1

    move v1, v6

    if-ne v14, v3, :cond_c

    invoke-static {v1, v8}, LNj;->m(I[B)I

    move-result v2

    invoke-virtual {v7, v15, v4, v5, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v3, v1, 0x4

    goto :goto_c

    :pswitch_8
    move-object v15, v2

    move-object v8, v7

    move-wide/from16 v4, v19

    const/4 v2, 0x1

    const/16 v17, -0x1

    move-object v7, v1

    move v1, v6

    if-ne v14, v2, :cond_e

    move-wide v3, v4

    invoke-static {v1, v8}, LNj;->n(I[B)J

    move-result-wide v5

    move-object v2, v7

    move v7, v1

    move-object v1, v2

    move-object v2, v15

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v3, v7, 0x8

    or-int v11, v11, v18

    :goto_e
    move-object v7, v8

    :goto_f
    move v5, v9

    move v4, v12

    goto/16 :goto_9

    :cond_e
    move-object/from16 v23, v7

    move v7, v1

    move-object/from16 v1, v23

    move-object/from16 v23, v15

    move-object v15, v1

    move-object/from16 v1, v23

    goto/16 :goto_11

    :pswitch_9
    move-object v8, v7

    move-wide/from16 v3, v19

    const/16 v17, -0x1

    move v7, v6

    if-nez v14, :cond_f

    invoke-static {v8, v7, v13}, LNj;->t([BILC4;)I

    move-result v5

    iget v6, v13, LC4;->a:I

    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    or-int v11, v11, v18

    move v3, v5

    goto :goto_e

    :cond_f
    move-object v15, v1

    :cond_10
    move-object v1, v2

    goto/16 :goto_11

    :pswitch_a
    move-object v8, v7

    move-wide/from16 v3, v19

    const/16 v17, -0x1

    move v7, v6

    if-nez v14, :cond_f

    invoke-static {v8, v7, v13}, LNj;->v([BILC4;)I

    move-result v7

    iget-wide v5, v13, LC4;->b:J

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v15, v1

    or-int v11, v11, v18

    move v3, v7

    goto :goto_e

    :pswitch_b
    move-object v15, v1

    move-object v8, v7

    move-wide/from16 v4, v19

    const/16 v17, -0x1

    move v7, v6

    if-ne v14, v3, :cond_10

    invoke-static {v7, v8}, LNj;->m(I[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sget-object v3, LjD;->c:LiD;

    invoke-virtual {v3, v2, v4, v5, v1}, LiD;->n(Ljava/lang/Object;JF)V

    add-int/lit8 v3, v7, 0x4

    :goto_10
    or-int v11, v11, v18

    move-object v7, v8

    move v5, v9

    move v4, v12

    move-object v1, v15

    goto/16 :goto_9

    :pswitch_c
    move-object v15, v1

    move-object v8, v7

    move-wide/from16 v4, v19

    const/4 v1, 0x1

    const/16 v17, -0x1

    move v7, v6

    if-ne v14, v1, :cond_10

    invoke-static {v7, v8}, LNj;->n(I[B)J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v19

    sget-object v1, LjD;->c:LiD;

    move-wide v3, v4

    move-wide/from16 v5, v19

    invoke-virtual/range {v1 .. v6}, LiD;->m(Ljava/lang/Object;JD)V

    move-object v1, v2

    add-int/lit8 v3, v7, 0x8

    goto :goto_10

    :goto_11
    move/from16 v5, p3

    move-object v6, v1

    move v2, v7

    move-object/from16 v22, v15

    move/from16 v18, v17

    move/from16 v17, v12

    move v12, v9

    goto/16 :goto_15

    :cond_11
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move/from16 v21, v5

    move-object v8, v7

    move-wide/from16 v3, v19

    const/16 v17, -0x1

    move v7, v6

    const/16 v5, 0x1b

    if-ne v15, v5, :cond_15

    const/4 v5, 0x2

    if-ne v14, v5, :cond_14

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LKl;

    move-object v6, v5

    check-cast v6, LE;

    iget-boolean v6, v6, LE;->a:Z

    if-nez v6, :cond_13

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-nez v6, :cond_12

    const/16 v6, 0xa

    goto :goto_12

    :cond_12
    mul-int/lit8 v6, v6, 0x2

    :goto_12
    invoke-interface {v5, v6}, LKl;->f(I)LKl;

    move-result-object v5

    invoke-virtual {v2, v1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_13
    move-object v6, v5

    invoke-virtual {v0, v9}, LMr;->p(I)Lmx;

    move-result-object v1

    move/from16 v5, p4

    move v4, v7

    move-object v3, v8

    move-object v7, v13

    move-object v8, v2

    move/from16 v2, p3

    invoke-static/range {v1 .. v7}, LNj;->o(Lmx;I[BIILKl;LC4;)I

    move-result v1

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move-object/from16 v13, p5

    move v3, v1

    move-object v1, v8

    goto/16 :goto_f

    :cond_14
    move-object/from16 v3, p1

    move/from16 v5, p3

    move-object/from16 v22, v2

    move v1, v7

    move v14, v10

    move v15, v11

    move/from16 v18, v17

    move/from16 v17, v12

    move v12, v9

    goto/16 :goto_13

    :cond_15
    move/from16 v5, p3

    move-object v8, v2

    move v1, v7

    const/16 v2, 0x31

    if-gt v15, v2, :cond_17

    move-object v7, v8

    move v6, v9

    move/from16 v2, v21

    int-to-long v8, v2

    move-object/from16 v2, p2

    move-object/from16 v13, p5

    move-object/from16 v22, v7

    move/from16 v18, v17

    move v7, v6

    move/from16 v17, v12

    move v6, v14

    move v14, v10

    move v10, v15

    move v15, v11

    move-wide v11, v3

    move/from16 v4, p4

    move v3, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v13}, LMr;->K(Ljava/lang/Object;[BIIIIIJIJLC4;)I

    move-result v6

    move v12, v3

    move-object v3, v1

    move v1, v12

    move v12, v7

    if-eq v6, v1, :cond_16

    move-object/from16 v7, p2

    move/from16 v8, p4

    move-object/from16 v13, p5

    move-object v2, v3

    move v3, v6

    move v5, v12

    move v10, v14

    move v11, v15

    move/from16 v4, v17

    move-object/from16 v1, v22

    goto/16 :goto_0

    :cond_16
    move v2, v6

    move v10, v14

    move v11, v15

    move-object v6, v3

    goto/16 :goto_15

    :cond_17
    move-object/from16 v22, v8

    move v6, v14

    move/from16 v18, v17

    move/from16 v2, v21

    move-wide v7, v3

    move v14, v10

    move/from16 v17, v12

    move v10, v15

    move-object/from16 v3, p1

    move v12, v9

    move v15, v11

    const/16 v4, 0x32

    if-ne v10, v4, :cond_19

    const/4 v4, 0x2

    if-eq v6, v4, :cond_18

    :goto_13
    move v2, v1

    move-object v6, v3

    :goto_14
    move v10, v14

    move v11, v15

    goto :goto_15

    :cond_18
    invoke-virtual {v0, v12, v7, v8, v3}, LMr;->G(IJLjava/lang/Object;)V

    const/4 v1, 0x0

    throw v1

    :cond_19
    move-object v4, v3

    move v3, v1

    move-object v1, v4

    move/from16 v4, p4

    move-object/from16 v13, p5

    move v9, v10

    move-wide v10, v7

    move v8, v2

    move v7, v6

    move/from16 v6, v17

    move-object/from16 v2, p2

    invoke-virtual/range {v0 .. v13}, LMr;->H(Ljava/lang/Object;[BIIIIIIIJILC4;)I

    move-result v7

    move-object v6, v1

    move v1, v3

    if-eq v7, v1, :cond_1a

    move-object/from16 v0, p0

    move/from16 v8, p4

    move-object/from16 v13, p5

    move-object v2, v6

    move v3, v7

    move v5, v12

    move v10, v14

    move v11, v15

    move/from16 v4, v17

    move-object/from16 v1, v22

    move-object/from16 v7, p2

    goto/16 :goto_0

    :cond_1a
    move v2, v7

    goto :goto_14

    :goto_15
    move-object v0, v6

    check-cast v0, Lvj;

    iget-object v1, v0, Lvj;->unknownFields:LXC;

    sget-object v3, LXC;->f:LXC;

    if-ne v1, v3, :cond_1b

    invoke-static {}, LXC;->c()LXC;

    move-result-object v1

    iput-object v1, v0, Lvj;->unknownFields:LXC;

    :cond_1b
    move/from16 v3, p4

    move-object v4, v1

    move v0, v5

    move-object/from16 v1, p2

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, LNj;->r(I[BIILXC;LC4;)I

    move-result v0

    move-object/from16 v7, p2

    move-object/from16 v13, p5

    move v8, v3

    move-object v2, v6

    move v5, v12

    move/from16 v4, v17

    move-object/from16 v1, v22

    move v3, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_1c
    move-object/from16 v22, v1

    move-object v6, v2

    move v4, v8

    move v14, v10

    move v15, v11

    const v0, 0xfffff

    if-eq v14, v0, :cond_1d

    int-to-long v0, v14

    move-object/from16 v2, v22

    invoke-virtual {v2, v6, v0, v1, v15}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_1d
    if-ne v3, v4, :cond_1e

    return-void

    :cond_1e
    invoke-static {}, LPl;->f()LPl;

    move-result-object v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final K(Ljava/lang/Object;[BIIIIIJIJLC4;)I
    .locals 13

    move/from16 v0, p5

    move/from16 v1, p6

    move/from16 v6, p7

    move-wide/from16 v2, p11

    sget-object v4, LMr;->p:Lsun/misc/Unsafe;

    invoke-virtual {v4, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LKl;

    move-object v7, v5

    check-cast v7, LE;

    iget-boolean v7, v7, LE;->a:Z

    const/4 v8, 0x2

    if-nez v7, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_0

    const/16 v7, 0xa

    goto :goto_0

    :cond_0
    mul-int/2addr v7, v8

    :goto_0
    invoke-interface {v5, v7}, LKl;->f(I)LKl;

    move-result-object v5

    invoke-virtual {v4, p1, v2, v3, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    move-object v4, v5

    const/4 p1, 0x5

    const-wide/16 v2, 0x0

    const/4 v5, 0x1

    packed-switch p10, :pswitch_data_0

    :cond_2
    move/from16 v2, p3

    goto/16 :goto_2a

    :pswitch_0
    const/4 p1, 0x3

    if-ne v1, p1, :cond_2

    invoke-virtual {p0, v6}, LMr;->p(I)Lmx;

    move-result-object p1

    and-int/lit8 v1, v0, -0x8

    or-int/lit8 v1, v1, 0x4

    invoke-interface {p1}, Lmx;->j()Ljava/lang/Object;

    move-result-object v2

    move-object v3, p1

    check-cast v3, LMr;

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p12, p13

    move/from16 p11, v1

    move-object/from16 p7, v2

    move-object/from16 p6, v3

    invoke-virtual/range {p6 .. p12}, LMr;->I(Ljava/lang/Object;[BIIILC4;)I

    move-result v1

    move-object/from16 v8, p6

    move-object/from16 v7, p7

    move/from16 v3, p10

    move/from16 v6, p11

    move-object/from16 v5, p12

    iput-object v7, v5, LC4;->c:Ljava/lang/Object;

    invoke-interface {p1, v7}, Lmx;->d(Ljava/lang/Object;)V

    iput-object v7, v5, LC4;->c:Ljava/lang/Object;

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    if-ge v1, v3, :cond_4

    invoke-static {p2, v1, v5}, LNj;->t([BILC4;)I

    move-result v7

    iget v9, v5, LC4;->a:I

    if-eq v0, v9, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, Lmx;->j()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 p8, p2

    move-object/from16 p7, v1

    move/from16 p10, v3

    move-object/from16 p12, v5

    move/from16 p11, v6

    move/from16 p9, v7

    move-object/from16 p6, v8

    invoke-virtual/range {p6 .. p12}, LMr;->I(Ljava/lang/Object;[BIIILC4;)I

    move-result v1

    move-object/from16 v7, p7

    iput-object v7, v5, LC4;->c:Ljava/lang/Object;

    invoke-interface {p1, v7}, Lmx;->d(Ljava/lang/Object;)V

    iput-object v7, v5, LC4;->c:Ljava/lang/Object;

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    :goto_2
    return v1

    :pswitch_1
    move/from16 p1, p3

    move/from16 v3, p4

    move-object/from16 v5, p13

    if-ne v1, v8, :cond_7

    check-cast v4, Lpp;

    invoke-static {p2, p1, v5}, LNj;->t([BILC4;)I

    move-result p1

    iget v0, v5, LC4;->a:I

    add-int/2addr v0, p1

    :goto_3
    if-ge p1, v0, :cond_5

    invoke-static {p2, p1, v5}, LNj;->v([BILC4;)I

    move-result p1

    iget-wide v6, v5, LC4;->b:J

    invoke-static {v6, v7}, Lka;->e(J)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lpp;->b(J)V

    goto :goto_3

    :cond_5
    if-ne p1, v0, :cond_6

    return p1

    :cond_6
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_7
    if-nez v1, :cond_a

    check-cast v4, Lpp;

    invoke-static {p2, p1, v5}, LNj;->v([BILC4;)I

    move-result p1

    iget-wide v6, v5, LC4;->b:J

    invoke-static {v6, v7}, Lka;->e(J)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lpp;->b(J)V

    :goto_4
    if-ge p1, v3, :cond_9

    invoke-static {p2, p1, v5}, LNj;->t([BILC4;)I

    move-result v1

    iget v6, v5, LC4;->a:I

    if-eq v0, v6, :cond_8

    goto :goto_5

    :cond_8
    invoke-static {p2, v1, v5}, LNj;->v([BILC4;)I

    move-result p1

    iget-wide v6, v5, LC4;->b:J

    invoke-static {v6, v7}, Lka;->e(J)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lpp;->b(J)V

    goto :goto_4

    :cond_9
    :goto_5
    return p1

    :cond_a
    move v2, p1

    goto/16 :goto_2a

    :pswitch_2
    move/from16 p1, p3

    move/from16 v3, p4

    move-object/from16 v5, p13

    if-ne v1, v8, :cond_d

    check-cast v4, LBl;

    invoke-static {p2, p1, v5}, LNj;->t([BILC4;)I

    move-result p1

    iget v0, v5, LC4;->a:I

    add-int/2addr v0, p1

    :goto_6
    if-ge p1, v0, :cond_b

    invoke-static {p2, p1, v5}, LNj;->t([BILC4;)I

    move-result p1

    iget v1, v5, LC4;->a:I

    invoke-static {v1}, Lka;->d(I)I

    move-result v1

    invoke-virtual {v4, v1}, LBl;->b(I)V

    goto :goto_6

    :cond_b
    if-ne p1, v0, :cond_c

    return p1

    :cond_c
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_d
    if-nez v1, :cond_a

    check-cast v4, LBl;

    invoke-static {p2, p1, v5}, LNj;->t([BILC4;)I

    move-result p1

    iget v1, v5, LC4;->a:I

    invoke-static {v1}, Lka;->d(I)I

    move-result v1

    invoke-virtual {v4, v1}, LBl;->b(I)V

    :goto_7
    if-ge p1, v3, :cond_f

    invoke-static {p2, p1, v5}, LNj;->t([BILC4;)I

    move-result v1

    iget v6, v5, LC4;->a:I

    if-eq v0, v6, :cond_e

    goto :goto_8

    :cond_e
    invoke-static {p2, v1, v5}, LNj;->t([BILC4;)I

    move-result p1

    iget v1, v5, LC4;->a:I

    invoke-static {v1}, Lka;->d(I)I

    move-result v1

    invoke-virtual {v4, v1}, LBl;->b(I)V

    goto :goto_7

    :cond_f
    :goto_8
    return p1

    :pswitch_3
    move/from16 p1, p3

    move/from16 v3, p4

    move-object/from16 v5, p13

    if-ne v1, v8, :cond_12

    check-cast v4, LBl;

    invoke-static {p2, p1, v5}, LNj;->t([BILC4;)I

    move-result p1

    iget v0, v5, LC4;->a:I

    add-int/2addr v0, p1

    :goto_9
    if-ge p1, v0, :cond_10

    invoke-static {p2, p1, v5}, LNj;->t([BILC4;)I

    move-result p1

    iget v1, v5, LC4;->a:I

    invoke-virtual {v4, v1}, LBl;->b(I)V

    goto :goto_9

    :cond_10
    if-ne p1, v0, :cond_11

    goto :goto_a

    :cond_11
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_12
    if-nez v1, :cond_a

    move v2, p1

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LNj;->u(I[BIILKl;LC4;)I

    move-result p1

    :goto_a
    invoke-virtual {p0, v6}, LMr;->n(I)V

    sget-object v0, Lnx;->a:Ljava/lang/Class;

    return p1

    :pswitch_4
    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v5, p13

    if-ne v1, v8, :cond_4f

    invoke-static {p2, v2, v5}, LNj;->t([BILC4;)I

    move-result v1

    iget v2, v5, LC4;->a:I

    if-ltz v2, :cond_1a

    array-length v6, p2

    sub-int/2addr v6, v1

    if-gt v2, v6, :cond_19

    if-nez v2, :cond_13

    sget-object v2, Ly6;->b:Lx6;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_13
    invoke-static {p2, v1, v2}, Ly6;->c([BII)Lx6;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_b
    add-int/2addr v1, v2

    :goto_c
    if-ge v1, v3, :cond_18

    invoke-static {p2, v1, v5}, LNj;->t([BILC4;)I

    move-result v2

    iget v6, v5, LC4;->a:I

    if-eq v0, v6, :cond_14

    goto :goto_d

    :cond_14
    invoke-static {p2, v2, v5}, LNj;->t([BILC4;)I

    move-result v1

    iget v2, v5, LC4;->a:I

    if-ltz v2, :cond_17

    array-length v6, p2

    sub-int/2addr v6, v1

    if-gt v2, v6, :cond_16

    if-nez v2, :cond_15

    sget-object v2, Ly6;->b:Lx6;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_15
    invoke-static {p2, v1, v2}, Ly6;->c([BII)Lx6;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_16
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_17
    invoke-static {}, LPl;->e()LPl;

    move-result-object p1

    throw p1

    :cond_18
    :goto_d
    return v1

    :cond_19
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_1a
    invoke-static {}, LPl;->e()LPl;

    move-result-object p1

    throw p1

    :pswitch_5
    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v5, p13

    if-ne v1, v8, :cond_4f

    invoke-virtual {p0, v6}, LMr;->p(I)Lmx;

    move-result-object v1

    move-object/from16 p8, p2

    move/from16 p7, v0

    move-object/from16 p6, v1

    move/from16 p9, v2

    move/from16 p10, v3

    move-object/from16 p11, v4

    move-object/from16 p12, v5

    invoke-static/range {p6 .. p12}, LNj;->o(Lmx;I[BIILKl;LC4;)I

    move-result p1

    return p1

    :pswitch_6
    move/from16 v6, p4

    move-object/from16 v9, p13

    move v7, v0

    move-object v10, v4

    move/from16 v0, p3

    if-ne v1, v8, :cond_2a

    const-wide/32 v11, 0x20000000

    and-long v11, p8, v11

    cmp-long p1, v11, v2

    const-string v1, ""

    if-nez p1, :cond_21

    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result p1

    iget v0, v9, LC4;->a:I

    if-ltz v0, :cond_20

    if-nez v0, :cond_1b

    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_1b
    new-instance v2, Ljava/lang/String;

    sget-object v3, LLl;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, p2, p1, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_e
    add-int/2addr p1, v0

    :goto_f
    if-ge p1, v6, :cond_1f

    invoke-static {p2, p1, v9}, LNj;->t([BILC4;)I

    move-result v0

    iget v2, v9, LC4;->a:I

    if-eq v7, v2, :cond_1c

    goto :goto_10

    :cond_1c
    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result p1

    iget v0, v9, LC4;->a:I

    if-ltz v0, :cond_1e

    if-nez v0, :cond_1d

    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_1d
    new-instance v2, Ljava/lang/String;

    sget-object v3, LLl;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, p2, p1, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1e
    invoke-static {}, LPl;->e()LPl;

    move-result-object p1

    throw p1

    :cond_1f
    :goto_10
    return p1

    :cond_20
    invoke-static {}, LPl;->e()LPl;

    move-result-object p1

    throw p1

    :cond_21
    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result p1

    iget v0, v9, LC4;->a:I

    if-ltz v0, :cond_29

    if-nez v0, :cond_22

    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_22
    add-int v2, p1, v0

    sget-object v3, LtD;->a:LPj;

    invoke-virtual {v3, p2, p1, v2}, LPj;->s([BII)Z

    move-result v3

    if-eqz v3, :cond_28

    new-instance v3, Ljava/lang/String;

    sget-object v5, LLl;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, p2, p1, v0, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v10, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_11
    move p1, v2

    :goto_12
    if-ge p1, v6, :cond_27

    invoke-static {p2, p1, v9}, LNj;->t([BILC4;)I

    move-result v0

    iget v2, v9, LC4;->a:I

    if-eq v7, v2, :cond_23

    goto :goto_13

    :cond_23
    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result p1

    iget v0, v9, LC4;->a:I

    if-ltz v0, :cond_26

    if-nez v0, :cond_24

    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_24
    add-int v2, p1, v0

    sget-object v3, LtD;->a:LPj;

    invoke-virtual {v3, p2, p1, v2}, LPj;->s([BII)Z

    move-result v3

    if-eqz v3, :cond_25

    new-instance v3, Ljava/lang/String;

    sget-object v5, LLl;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, p2, p1, v0, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v10, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_25
    invoke-static {}, LPl;->b()LPl;

    move-result-object p1

    throw p1

    :cond_26
    invoke-static {}, LPl;->e()LPl;

    move-result-object p1

    throw p1

    :cond_27
    :goto_13
    return p1

    :cond_28
    invoke-static {}, LPl;->b()LPl;

    move-result-object p1

    throw p1

    :cond_29
    invoke-static {}, LPl;->e()LPl;

    move-result-object p1

    throw p1

    :cond_2a
    move v2, v0

    goto/16 :goto_2a

    :pswitch_7
    move/from16 v6, p4

    move-object/from16 v9, p13

    move v7, v0

    move-object v10, v4

    move/from16 v0, p3

    const/4 p1, 0x0

    if-ne v1, v8, :cond_2e

    move-object v1, v10

    check-cast v1, LS5;

    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result v0

    iget v6, v9, LC4;->a:I

    add-int/2addr v6, v0

    :goto_14
    if-ge v0, v6, :cond_2c

    invoke-static {p2, v0, v9}, LNj;->v([BILC4;)I

    move-result v0

    iget-wide v7, v9, LC4;->b:J

    cmp-long v7, v7, v2

    if-eqz v7, :cond_2b

    move v7, v5

    goto :goto_15

    :cond_2b
    move v7, p1

    :goto_15
    invoke-virtual {v1, v7}, LS5;->b(Z)V

    goto :goto_14

    :cond_2c
    if-ne v0, v6, :cond_2d

    return v0

    :cond_2d
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_2e
    if-nez v1, :cond_2a

    move-object v1, v10

    check-cast v1, LS5;

    invoke-static {p2, v0, v9}, LNj;->v([BILC4;)I

    move-result v0

    iget-wide v10, v9, LC4;->b:J

    cmp-long v8, v10, v2

    if-eqz v8, :cond_2f

    move v8, v5

    goto :goto_16

    :cond_2f
    move v8, p1

    :goto_16
    invoke-virtual {v1, v8}, LS5;->b(Z)V

    :goto_17
    if-ge v0, v6, :cond_32

    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result v8

    iget v10, v9, LC4;->a:I

    if-eq v7, v10, :cond_30

    goto :goto_19

    :cond_30
    invoke-static {p2, v8, v9}, LNj;->v([BILC4;)I

    move-result v0

    iget-wide v10, v9, LC4;->b:J

    cmp-long v8, v10, v2

    if-eqz v8, :cond_31

    move v8, v5

    goto :goto_18

    :cond_31
    move v8, p1

    :goto_18
    invoke-virtual {v1, v8}, LS5;->b(Z)V

    goto :goto_17

    :cond_32
    :goto_19
    return v0

    :pswitch_8
    move/from16 v6, p4

    move-object/from16 v9, p13

    move v7, v0

    move-object v10, v4

    move/from16 v0, p3

    if-ne v1, v8, :cond_35

    move-object p1, v10

    check-cast p1, LBl;

    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result v0

    iget v1, v9, LC4;->a:I

    add-int/2addr v1, v0

    :goto_1a
    if-ge v0, v1, :cond_33

    invoke-static {v0, p2}, LNj;->m(I[B)I

    move-result v2

    invoke-virtual {p1, v2}, LBl;->b(I)V

    add-int/lit8 v0, v0, 0x4

    goto :goto_1a

    :cond_33
    if-ne v0, v1, :cond_34

    return v0

    :cond_34
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_35
    if-ne v1, p1, :cond_2a

    move-object p1, v10

    check-cast p1, LBl;

    invoke-static {v0, p2}, LNj;->m(I[B)I

    move-result v1

    invoke-virtual {p1, v1}, LBl;->b(I)V

    add-int/lit8 v0, v0, 0x4

    :goto_1b
    if-ge v0, v6, :cond_37

    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result v1

    iget v2, v9, LC4;->a:I

    if-eq v7, v2, :cond_36

    goto :goto_1c

    :cond_36
    invoke-static {v1, p2}, LNj;->m(I[B)I

    move-result v0

    invoke-virtual {p1, v0}, LBl;->b(I)V

    add-int/lit8 v0, v1, 0x4

    goto :goto_1b

    :cond_37
    :goto_1c
    return v0

    :pswitch_9
    move/from16 v6, p4

    move-object/from16 v9, p13

    move v7, v0

    move-object v10, v4

    move/from16 v0, p3

    if-ne v1, v8, :cond_3a

    move-object p1, v10

    check-cast p1, Lpp;

    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result v0

    iget v1, v9, LC4;->a:I

    add-int/2addr v1, v0

    :goto_1d
    if-ge v0, v1, :cond_38

    invoke-static {v0, p2}, LNj;->n(I[B)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lpp;->b(J)V

    add-int/lit8 v0, v0, 0x8

    goto :goto_1d

    :cond_38
    if-ne v0, v1, :cond_39

    return v0

    :cond_39
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_3a
    if-ne v1, v5, :cond_2a

    move-object p1, v10

    check-cast p1, Lpp;

    invoke-static {v0, p2}, LNj;->n(I[B)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lpp;->b(J)V

    add-int/lit8 v0, v0, 0x8

    :goto_1e
    if-ge v0, v6, :cond_3c

    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result v1

    iget v2, v9, LC4;->a:I

    if-eq v7, v2, :cond_3b

    goto :goto_1f

    :cond_3b
    invoke-static {v1, p2}, LNj;->n(I[B)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lpp;->b(J)V

    add-int/lit8 v0, v1, 0x8

    goto :goto_1e

    :cond_3c
    :goto_1f
    return v0

    :pswitch_a
    move/from16 v6, p4

    move-object/from16 v9, p13

    move v7, v0

    move-object v10, v4

    move/from16 v0, p3

    if-ne v1, v8, :cond_3f

    move-object p1, v10

    check-cast p1, LBl;

    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result v0

    iget v1, v9, LC4;->a:I

    add-int/2addr v1, v0

    :goto_20
    if-ge v0, v1, :cond_3d

    invoke-static {p2, v0, v9}, LNj;->t([BILC4;)I

    move-result v0

    iget v2, v9, LC4;->a:I

    invoke-virtual {p1, v2}, LBl;->b(I)V

    goto :goto_20

    :cond_3d
    if-ne v0, v1, :cond_3e

    return v0

    :cond_3e
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_3f
    if-nez v1, :cond_2a

    move-object/from16 p7, p2

    move/from16 p8, v0

    move/from16 p9, v6

    move/from16 p6, v7

    move-object/from16 p11, v9

    move-object/from16 p10, v10

    invoke-static/range {p6 .. p11}, LNj;->u(I[BIILKl;LC4;)I

    move-result p1

    return p1

    :pswitch_b
    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v9, p13

    move-object v10, v4

    if-ne v1, v8, :cond_42

    move-object p1, v10

    check-cast p1, Lpp;

    invoke-static {p2, v2, v9}, LNj;->t([BILC4;)I

    move-result v0

    iget v1, v9, LC4;->a:I

    add-int/2addr v1, v0

    :goto_21
    if-ge v0, v1, :cond_40

    invoke-static {p2, v0, v9}, LNj;->v([BILC4;)I

    move-result v0

    iget-wide v2, v9, LC4;->b:J

    invoke-virtual {p1, v2, v3}, Lpp;->b(J)V

    goto :goto_21

    :cond_40
    if-ne v0, v1, :cond_41

    return v0

    :cond_41
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_42
    if-nez v1, :cond_4f

    move-object p1, v10

    check-cast p1, Lpp;

    invoke-static {p2, v2, v9}, LNj;->v([BILC4;)I

    move-result v1

    iget-wide v5, v9, LC4;->b:J

    invoke-virtual {p1, v5, v6}, Lpp;->b(J)V

    :goto_22
    if-ge v1, v3, :cond_44

    invoke-static {p2, v1, v9}, LNj;->t([BILC4;)I

    move-result v2

    iget v5, v9, LC4;->a:I

    if-eq v0, v5, :cond_43

    goto :goto_23

    :cond_43
    invoke-static {p2, v2, v9}, LNj;->v([BILC4;)I

    move-result v1

    iget-wide v5, v9, LC4;->b:J

    invoke-virtual {p1, v5, v6}, Lpp;->b(J)V

    goto :goto_22

    :cond_44
    :goto_23
    return v1

    :pswitch_c
    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v9, p13

    move-object v10, v4

    if-ne v1, v8, :cond_47

    move-object p1, v10

    check-cast p1, LEh;

    invoke-static {p2, v2, v9}, LNj;->t([BILC4;)I

    move-result v0

    iget v1, v9, LC4;->a:I

    add-int/2addr v1, v0

    :goto_24
    if-ge v0, v1, :cond_45

    invoke-static {v0, p2}, LNj;->m(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-virtual {p1, v2}, LEh;->b(F)V

    add-int/lit8 v0, v0, 0x4

    goto :goto_24

    :cond_45
    if-ne v0, v1, :cond_46

    return v0

    :cond_46
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_47
    if-ne v1, p1, :cond_4f

    move-object p1, v10

    check-cast p1, LEh;

    invoke-static {v2, p2}, LNj;->m(I[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {p1, v1}, LEh;->b(F)V

    :goto_25
    add-int/lit8 v1, v2, 0x4

    if-ge v1, v3, :cond_49

    invoke-static {p2, v1, v9}, LNj;->t([BILC4;)I

    move-result v2

    iget v5, v9, LC4;->a:I

    if-eq v0, v5, :cond_48

    goto :goto_26

    :cond_48
    invoke-static {v2, p2}, LNj;->m(I[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {p1, v1}, LEh;->b(F)V

    goto :goto_25

    :cond_49
    :goto_26
    return v1

    :pswitch_d
    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v9, p13

    move-object v10, v4

    if-ne v1, v8, :cond_4c

    move-object p1, v10

    check-cast p1, Lle;

    invoke-static {p2, v2, v9}, LNj;->t([BILC4;)I

    move-result v0

    iget v1, v9, LC4;->a:I

    add-int/2addr v1, v0

    :goto_27
    if-ge v0, v1, :cond_4a

    invoke-static {v0, p2}, LNj;->n(I[B)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lle;->b(D)V

    add-int/lit8 v0, v0, 0x8

    goto :goto_27

    :cond_4a
    if-ne v0, v1, :cond_4b

    return v0

    :cond_4b
    invoke-static {}, LPl;->g()LPl;

    move-result-object p1

    throw p1

    :cond_4c
    if-ne v1, v5, :cond_4f

    move-object p1, v10

    check-cast p1, Lle;

    invoke-static {v2, p2}, LNj;->n(I[B)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v5

    invoke-virtual {p1, v5, v6}, Lle;->b(D)V

    :goto_28
    add-int/lit8 v1, v2, 0x8

    if-ge v1, v3, :cond_4e

    invoke-static {p2, v1, v9}, LNj;->t([BILC4;)I

    move-result v2

    iget v5, v9, LC4;->a:I

    if-eq v0, v5, :cond_4d

    goto :goto_29

    :cond_4d
    invoke-static {v2, p2}, LNj;->n(I[B)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v5

    invoke-virtual {p1, v5, v6}, Lle;->b(D)V

    goto :goto_28

    :cond_4e
    :goto_29
    return v1

    :cond_4f
    :goto_2a
    return v2

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final L(Ljava/lang/Object;JLla;Lmx;LTg;)V
    .locals 2

    iget-object v0, p0, LMr;->l:Lvo;

    invoke-virtual {v0, p2, p3, p1}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object p2, p4, Lla;->a:Lka;

    iget p3, p4, Lla;->b:I

    and-int/lit8 v0, p3, 0x7

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    :cond_0
    invoke-interface {p5}, Lmx;->j()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p4, v0, p5, p6}, Lla;->b(Ljava/lang/Object;Lmx;LTg;)V

    invoke-interface {p5, v0}, Lmx;->d(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2}, Lka;->g()Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p4, Lla;->d:I

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lka;->B()I

    move-result v0

    if-eq v0, p3, :cond_0

    iput v0, p4, Lla;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, LPl;->c()LOl;

    move-result-object p1

    throw p1
.end method

.method public final M(Ljava/lang/Object;ILla;Lmx;LTg;)V
    .locals 3

    const v0, 0xfffff

    and-int/2addr p2, v0

    int-to-long v0, p2

    iget-object p2, p0, LMr;->l:Lvo;

    invoke-virtual {p2, v0, v1, p1}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object p2, p3, Lla;->a:Lka;

    iget v0, p3, Lla;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-interface {p4}, Lmx;->j()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p3, v1, p4, p5}, Lla;->c(Ljava/lang/Object;Lmx;LTg;)V

    invoke-interface {p4, v1}, Lmx;->d(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2}, Lka;->g()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p3, Lla;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lka;->B()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p3, Lla;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, LPl;->c()LOl;

    move-result-object p1

    throw p1
.end method

.method public final N(Ljava/lang/Object;ILla;)V
    .locals 4

    const/high16 v0, 0x20000000

    and-int/2addr v0, p2

    const/4 v1, 0x2

    const v2, 0xfffff

    if-eqz v0, :cond_0

    and-int/2addr p2, v2

    int-to-long v2, p2

    invoke-virtual {p3, v1}, Lla;->v(I)V

    iget-object p2, p3, Lla;->a:Lka;

    invoke-virtual {p2}, Lka;->A()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, v3, p1, p2}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v0, p0, LMr;->f:Z

    if-eqz v0, :cond_1

    and-int/2addr p2, v2

    int-to-long v2, p2

    invoke-virtual {p3, v1}, Lla;->v(I)V

    iget-object p2, p3, Lla;->a:Lka;

    invoke-virtual {p2}, Lka;->z()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, v3, p1, p2}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_1
    and-int/2addr p2, v2

    int-to-long v0, p2

    invoke-virtual {p3}, Lla;->e()Ly6;

    move-result-object p2

    invoke-static {v0, v1, p1, p2}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final P(ILjava/lang/Object;)V
    .locals 4

    add-int/lit8 p1, p1, 0x2

    iget-object v0, p0, LMr;->a:[I

    aget p1, v0, p1

    const v0, 0xfffff

    and-int/2addr v0, p1

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    ushr-int/lit8 p1, p1, 0x14

    const/4 v2, 0x1

    shl-int p1, v2, p1

    sget-object v2, LjD;->c:LiD;

    invoke-virtual {v2, v0, v1, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v2

    or-int/2addr p1, v2

    invoke-static {p1, v0, v1, p2}, LjD;->n(IJLjava/lang/Object;)V

    return-void
.end method

.method public final Q(IILjava/lang/Object;)V
    .locals 2

    add-int/lit8 p2, p2, 0x2

    iget-object v0, p0, LMr;->a:[I

    aget p2, v0, p2

    const v0, 0xfffff

    and-int/2addr p2, v0

    int-to-long v0, p2

    invoke-static {p1, v0, v1, p3}, LjD;->n(IJLjava/lang/Object;)V

    return-void
.end method

.method public final R(II)I
    .locals 5

    iget-object v0, p0, LMr;->a:[I

    array-length v1, v0

    div-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-gt p2, v1, :cond_2

    add-int v2, v1, p2

    ushr-int/lit8 v2, v2, 0x1

    mul-int/lit8 v3, v2, 0x3

    aget v4, v0, v3

    if-ne p1, v4, :cond_0

    return v3

    :cond_0
    if-ge p1, v4, :cond_1

    add-int/lit8 v2, v2, -0x1

    move v1, v2

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move p2, v2

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final S(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    sget-object v0, LMr;->p:Lsun/misc/Unsafe;

    invoke-virtual {p0, p1}, LMr;->V(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p2, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, LMr;->P(ILjava/lang/Object;)V

    return-void
.end method

.method public final T(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 3

    sget-object v0, LMr;->p:Lsun/misc/Unsafe;

    invoke-virtual {p0, p4}, LMr;->V(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p3, p4, p1}, LMr;->Q(IILjava/lang/Object;)V

    return-void
.end method

.method public final V(I)I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, LMr;->a:[I

    aget p1, v0, p1

    return p1
.end method

.method public final W(Ljava/lang/Object;LD2;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, LMr;->a:[I

    array-length v4, v3

    sget-object v5, LMr;->p:Lsun/misc/Unsafe;

    const/4 v8, 0x0

    const v9, 0xfffff

    const/4 v10, 0x0

    :goto_0
    if-ge v8, v4, :cond_5

    invoke-virtual {v0, v8}, LMr;->V(I)I

    move-result v11

    aget v12, v3, v8

    invoke-static {v11}, LMr;->U(I)I

    move-result v13

    const/16 v14, 0x11

    const/4 v15, 0x1

    if-gt v13, v14, :cond_1

    add-int/lit8 v14, v8, 0x2

    aget v14, v3, v14

    const v16, 0xfffff

    and-int v6, v14, v16

    if-eq v6, v9, :cond_0

    int-to-long v9, v6

    invoke-virtual {v5, v1, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v10

    move v9, v6

    :cond_0
    ushr-int/lit8 v6, v14, 0x14

    shl-int v6, v15, v6

    goto :goto_1

    :cond_1
    const v16, 0xfffff

    const/4 v6, 0x0

    :goto_1
    and-int v11, v11, v16

    move/from16 v17, v8

    int-to-long v7, v11

    const/16 v11, 0x3f

    packed-switch v13, :pswitch_data_0

    move/from16 v13, v17

    :cond_2
    :goto_2
    const/4 v14, 0x0

    goto/16 :goto_3

    :pswitch_0
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v13}, LMr;->p(I)Lmx;

    move-result-object v7

    invoke-virtual {v2, v12, v6, v7}, LD2;->z(ILjava/lang/Object;Lmx;)V

    goto :goto_2

    :pswitch_1
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    shl-long v17, v6, v15

    shr-long/2addr v6, v11

    xor-long v6, v17, v6

    invoke-virtual {v8, v12, v6, v7}, Lma;->c0(IJ)V

    goto :goto_2

    :pswitch_2
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    shl-int/lit8 v8, v6, 0x1

    shr-int/lit8 v6, v6, 0x1f

    xor-int/2addr v6, v8

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Lma;->a0(II)V

    invoke-virtual {v7, v6}, Lma;->b0(I)V

    goto :goto_2

    :pswitch_3
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    invoke-virtual {v8, v12, v6, v7}, Lma;->X(IJ)V

    goto :goto_2

    :pswitch_4
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    invoke-virtual {v7, v12, v6}, Lma;->V(II)V

    goto :goto_2

    :pswitch_5
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Lma;->a0(II)V

    invoke-virtual {v7, v6}, Lma;->Z(I)V

    goto/16 :goto_3

    :pswitch_6
    move/from16 v13, v17

    const/4 v14, 0x0

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    invoke-virtual {v7, v12, v14}, Lma;->a0(II)V

    invoke-virtual {v7, v6}, Lma;->b0(I)V

    goto/16 :goto_2

    :pswitch_7
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly6;

    invoke-virtual {v2, v12, v6}, LD2;->y(ILy6;)V

    goto/16 :goto_2

    :pswitch_8
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v13}, LMr;->p(I)Lmx;

    move-result-object v7

    invoke-virtual {v2, v12, v6, v7}, LD2;->A(ILjava/lang/Object;Lmx;)V

    goto/16 :goto_2

    :pswitch_9
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v12, v6, v2}, LMr;->X(ILjava/lang/Object;LD2;)V

    goto/16 :goto_2

    :pswitch_a
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    sget-object v6, LjD;->c:LiD;

    invoke-virtual {v6, v7, v8, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Lma;->a0(II)V

    int-to-byte v6, v6

    invoke-virtual {v7, v6}, Lma;->T(B)V

    goto/16 :goto_2

    :pswitch_b
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    invoke-virtual {v7, v12, v6}, Lma;->V(II)V

    goto/16 :goto_2

    :pswitch_c
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    invoke-virtual {v8, v12, v6, v7}, Lma;->X(IJ)V

    goto/16 :goto_2

    :pswitch_d
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Lma;->a0(II)V

    invoke-virtual {v7, v6}, Lma;->Z(I)V

    goto/16 :goto_2

    :pswitch_e
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    invoke-virtual {v8, v12, v6, v7}, Lma;->c0(IJ)V

    goto/16 :goto_2

    :pswitch_f
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    invoke-virtual {v8, v12, v6, v7}, Lma;->c0(IJ)V

    goto/16 :goto_2

    :pswitch_10
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    sget-object v6, LjD;->c:LiD;

    invoke-virtual {v6, v7, v8, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    invoke-virtual {v7, v12, v6}, Lma;->V(II)V

    goto/16 :goto_2

    :pswitch_11
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    sget-object v6, LjD;->c:LiD;

    invoke-virtual {v6, v7, v8, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Double;

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v6

    invoke-virtual {v8, v12, v6, v7}, Lma;->X(IJ)V

    goto/16 :goto_2

    :pswitch_12
    move/from16 v13, v17

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_3

    goto/16 :goto_2

    :cond_3
    invoke-virtual {v0, v13}, LMr;->o(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v0, LMr;->n:Lsq;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, LEy;->o(Ljava/lang/Object;)V

    const/4 v1, 0x0

    throw v1

    :pswitch_13
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {v0, v13}, LMr;->p(I)Lmx;

    move-result-object v8

    invoke-static {v6, v7, v2, v8}, Lnx;->F(ILjava/util/List;LD2;Lmx;)V

    goto/16 :goto_2

    :pswitch_14
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->M(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_15
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->L(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_16
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->K(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_17
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->J(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_18
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->B(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_19
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->O(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_1a
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->y(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_1b
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->C(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_1c
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->D(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_1d
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->G(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_1e
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->P(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_1f
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->H(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_20
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->E(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_21
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Lnx;->A(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_22
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v14, 0x0

    invoke-static {v6, v7, v2, v14}, Lnx;->M(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_23
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->L(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_24
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->K(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_25
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->J(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_26
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->B(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_27
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->O(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_28
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2}, Lnx;->z(ILjava/util/List;LD2;)V

    goto/16 :goto_2

    :pswitch_29
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {v0, v13}, LMr;->p(I)Lmx;

    move-result-object v8

    invoke-static {v6, v7, v2, v8}, Lnx;->I(ILjava/util/List;LD2;Lmx;)V

    goto/16 :goto_2

    :pswitch_2a
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2}, Lnx;->N(ILjava/util/List;LD2;)V

    goto/16 :goto_2

    :pswitch_2b
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v14, 0x0

    invoke-static {v6, v7, v2, v14}, Lnx;->y(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_2c
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->C(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_2d
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->D(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_2e
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->G(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_2f
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->P(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_30
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->H(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_31
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->E(ILjava/util/List;LD2;Z)V

    goto/16 :goto_3

    :pswitch_32
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Lnx;->A(ILjava/util/List;LD2;Z)V

    goto/16 :goto_2

    :pswitch_33
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v13}, LMr;->p(I)Lmx;

    move-result-object v7

    invoke-virtual {v2, v12, v6, v7}, LD2;->z(ILjava/lang/Object;Lmx;)V

    goto/16 :goto_2

    :pswitch_34
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    shl-long v17, v6, v15

    shr-long/2addr v6, v11

    xor-long v6, v17, v6

    invoke-virtual {v8, v12, v6, v7}, Lma;->c0(IJ)V

    goto/16 :goto_2

    :pswitch_35
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    shl-int/lit8 v8, v6, 0x1

    shr-int/lit8 v6, v6, 0x1f

    xor-int/2addr v6, v8

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Lma;->a0(II)V

    invoke-virtual {v7, v6}, Lma;->b0(I)V

    goto/16 :goto_2

    :pswitch_36
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    invoke-virtual {v8, v12, v6, v7}, Lma;->X(IJ)V

    goto/16 :goto_2

    :pswitch_37
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    invoke-virtual {v7, v12, v6}, Lma;->V(II)V

    goto/16 :goto_2

    :pswitch_38
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Lma;->a0(II)V

    invoke-virtual {v7, v6}, Lma;->Z(I)V

    goto/16 :goto_3

    :pswitch_39
    move/from16 v13, v17

    const/4 v14, 0x0

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    invoke-virtual {v7, v12, v14}, Lma;->a0(II)V

    invoke-virtual {v7, v6}, Lma;->b0(I)V

    goto/16 :goto_2

    :pswitch_3a
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly6;

    invoke-virtual {v2, v12, v6}, LD2;->y(ILy6;)V

    goto/16 :goto_2

    :pswitch_3b
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v13}, LMr;->p(I)Lmx;

    move-result-object v7

    invoke-virtual {v2, v12, v6, v7}, LD2;->A(ILjava/lang/Object;Lmx;)V

    goto/16 :goto_2

    :pswitch_3c
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v12, v6, v2}, LMr;->X(ILjava/lang/Object;LD2;)V

    goto/16 :goto_2

    :pswitch_3d
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    sget-object v6, LjD;->c:LiD;

    invoke-virtual {v6, v7, v8, v1}, LiD;->c(JLjava/lang/Object;)Z

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Lma;->a0(II)V

    int-to-byte v6, v6

    invoke-virtual {v7, v6}, Lma;->T(B)V

    goto/16 :goto_2

    :pswitch_3e
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    invoke-virtual {v7, v12, v6}, Lma;->V(II)V

    goto/16 :goto_2

    :pswitch_3f
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    invoke-virtual {v8, v12, v6, v7}, Lma;->X(IJ)V

    goto/16 :goto_2

    :pswitch_40
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Lma;->a0(II)V

    invoke-virtual {v7, v6}, Lma;->Z(I)V

    goto :goto_3

    :pswitch_41
    move/from16 v13, v17

    const/4 v14, 0x0

    and-int/2addr v6, v10

    if-eqz v6, :cond_4

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    invoke-virtual {v8, v12, v6, v7}, Lma;->c0(IJ)V

    goto :goto_3

    :pswitch_42
    move/from16 v13, v17

    const/4 v14, 0x0

    and-int/2addr v6, v10

    if-eqz v6, :cond_4

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    invoke-virtual {v8, v12, v6, v7}, Lma;->c0(IJ)V

    goto :goto_3

    :pswitch_43
    move/from16 v13, v17

    const/4 v14, 0x0

    and-int/2addr v6, v10

    if-eqz v6, :cond_4

    sget-object v6, LjD;->c:LiD;

    invoke-virtual {v6, v7, v8, v1}, LiD;->f(JLjava/lang/Object;)F

    move-result v6

    iget-object v7, v2, LD2;->b:Ljava/lang/Object;

    check-cast v7, Lma;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    invoke-virtual {v7, v12, v6}, Lma;->V(II)V

    goto :goto_3

    :pswitch_44
    move/from16 v13, v17

    const/4 v14, 0x0

    and-int/2addr v6, v10

    if-eqz v6, :cond_4

    sget-object v6, LjD;->c:LiD;

    invoke-virtual {v6, v7, v8, v1}, LiD;->e(JLjava/lang/Object;)D

    move-result-wide v6

    iget-object v8, v2, LD2;->b:Ljava/lang/Object;

    check-cast v8, Lma;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v6

    invoke-virtual {v8, v12, v6, v7}, Lma;->X(IJ)V

    :cond_4
    :goto_3
    add-int/lit8 v8, v13, 0x3

    goto/16 :goto_0

    :cond_5
    iget-object v3, v0, LMr;->m:LYC;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Lvj;

    iget-object v1, v1, Lvj;->unknownFields:LXC;

    invoke-virtual {v1, v2}, LXC;->e(LD2;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ljava/lang/Object;LD2;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, LD2;->b:Ljava/lang/Object;

    check-cast v3, Lma;

    iget-boolean v4, v0, LMr;->g:Z

    if-eqz v4, :cond_3

    iget-object v4, v0, LMr;->a:[I

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_2

    invoke-virtual {v0, v7}, LMr;->V(I)I

    move-result v8

    aget v9, v4, v7

    invoke-static {v8}, LMr;->U(I)I

    move-result v10

    const/16 v11, 0x3f

    const/4 v12, 0x1

    const v13, 0xfffff

    packed-switch v10, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v7}, LMr;->p(I)Lmx;

    move-result-object v10

    invoke-virtual {v2, v9, v8, v10}, LD2;->z(ILjava/lang/Object;Lmx;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v13, v8

    invoke-static {v13, v14, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v13

    shl-long v15, v13, v12

    shr-long v10, v13, v11

    xor-long/2addr v10, v15

    invoke-virtual {v3, v9, v10, v11}, Lma;->c0(IJ)V

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v8

    shl-int/lit8 v10, v8, 0x1

    shr-int/lit8 v8, v8, 0x1f

    xor-int/2addr v8, v10

    invoke-virtual {v3, v9, v6}, Lma;->a0(II)V

    invoke-virtual {v3, v8}, Lma;->b0(I)V

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Lma;->X(IJ)V

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Lma;->V(II)V

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Lma;->a0(II)V

    invoke-virtual {v3, v8}, Lma;->Z(I)V

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Lma;->a0(II)V

    invoke-virtual {v3, v8}, Lma;->b0(I)V

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly6;

    invoke-virtual {v2, v9, v8}, LD2;->y(ILy6;)V

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v7}, LMr;->p(I)Lmx;

    move-result-object v10

    invoke-virtual {v2, v9, v8, v10}, LD2;->A(ILjava/lang/Object;Lmx;)V

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9, v8, v2}, LMr;->X(ILjava/lang/Object;LD2;)V

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-virtual {v3, v9, v6}, Lma;->a0(II)V

    int-to-byte v8, v8

    invoke-virtual {v3, v8}, Lma;->T(B)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Lma;->V(II)V

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Lma;->X(IJ)V

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Lma;->a0(II)V

    invoke-virtual {v3, v8}, Lma;->Z(I)V

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Lma;->c0(IJ)V

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Lma;->c0(IJ)V

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Float;

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Lma;->V(II)V

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {v0, v9, v7, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Double;

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v11}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Lma;->X(IJ)V

    goto/16 :goto_1

    :pswitch_12
    and-int/2addr v8, v13

    int-to-long v8, v8

    sget-object v10, LjD;->c:LiD;

    invoke-virtual {v10, v8, v9, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v0, v7}, LMr;->o(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v0, LMr;->n:Lsq;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, LEy;->o(Ljava/lang/Object;)V

    const/4 v1, 0x0

    throw v1

    :pswitch_13
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v7}, LMr;->p(I)Lmx;

    move-result-object v10

    invoke-static {v9, v8, v2, v10}, Lnx;->F(ILjava/util/List;LD2;Lmx;)V

    goto/16 :goto_1

    :pswitch_14
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->M(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_15
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->L(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_16
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->K(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_17
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->J(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_18
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->B(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_19
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->O(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_1a
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->y(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_1b
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->C(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_1c
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->D(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_1d
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->G(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_1e
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->P(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_1f
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->H(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_20
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->E(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_21
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Lnx;->A(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_22
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->M(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_23
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->L(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_24
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->K(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_25
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->J(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_26
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->B(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_27
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->O(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_28
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2}, Lnx;->z(ILjava/util/List;LD2;)V

    goto/16 :goto_1

    :pswitch_29
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v7}, LMr;->p(I)Lmx;

    move-result-object v10

    invoke-static {v9, v8, v2, v10}, Lnx;->I(ILjava/util/List;LD2;Lmx;)V

    goto/16 :goto_1

    :pswitch_2a
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2}, Lnx;->N(ILjava/util/List;LD2;)V

    goto/16 :goto_1

    :pswitch_2b
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->y(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_2c
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->C(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_2d
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->D(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_2e
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->G(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_2f
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->P(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_30
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->H(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_31
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->E(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_32
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Lnx;->A(ILjava/util/List;LD2;Z)V

    goto/16 :goto_1

    :pswitch_33
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v7}, LMr;->p(I)Lmx;

    move-result-object v10

    invoke-virtual {v2, v9, v8, v10}, LD2;->z(ILjava/lang/Object;Lmx;)V

    goto/16 :goto_1

    :pswitch_34
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v13, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v13, v14, v1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v13

    shl-long v15, v13, v12

    shr-long v10, v13, v11

    xor-long/2addr v10, v15

    invoke-virtual {v3, v9, v10, v11}, Lma;->c0(IJ)V

    goto/16 :goto_1

    :pswitch_35
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->g(JLjava/lang/Object;)I

    move-result v8

    shl-int/lit8 v10, v8, 0x1

    shr-int/lit8 v8, v8, 0x1f

    xor-int/2addr v8, v10

    invoke-virtual {v3, v9, v6}, Lma;->a0(II)V

    invoke-virtual {v3, v8}, Lma;->b0(I)V

    goto/16 :goto_1

    :pswitch_36
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Lma;->X(IJ)V

    goto/16 :goto_1

    :pswitch_37
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->g(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Lma;->V(II)V

    goto/16 :goto_1

    :pswitch_38
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->g(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Lma;->a0(II)V

    invoke-virtual {v3, v8}, Lma;->Z(I)V

    goto/16 :goto_1

    :pswitch_39
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->g(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Lma;->a0(II)V

    invoke-virtual {v3, v8}, Lma;->b0(I)V

    goto/16 :goto_1

    :pswitch_3a
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly6;

    invoke-virtual {v2, v9, v8}, LD2;->y(ILy6;)V

    goto/16 :goto_1

    :pswitch_3b
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v7}, LMr;->p(I)Lmx;

    move-result-object v10

    invoke-virtual {v2, v9, v8, v10}, LD2;->A(ILjava/lang/Object;Lmx;)V

    goto/16 :goto_1

    :pswitch_3c
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9, v8, v2}, LMr;->X(ILjava/lang/Object;LD2;)V

    goto/16 :goto_1

    :pswitch_3d
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->c(JLjava/lang/Object;)Z

    move-result v8

    invoke-virtual {v3, v9, v6}, Lma;->a0(II)V

    int-to-byte v8, v8

    invoke-virtual {v3, v8}, Lma;->T(B)V

    goto/16 :goto_1

    :pswitch_3e
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->g(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Lma;->V(II)V

    goto/16 :goto_1

    :pswitch_3f
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Lma;->X(IJ)V

    goto :goto_1

    :pswitch_40
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->g(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Lma;->a0(II)V

    invoke-virtual {v3, v8}, Lma;->Z(I)V

    goto :goto_1

    :pswitch_41
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Lma;->c0(IJ)V

    goto :goto_1

    :pswitch_42
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Lma;->c0(IJ)V

    goto :goto_1

    :pswitch_43
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->f(JLjava/lang/Object;)F

    move-result v8

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Lma;->V(II)V

    goto :goto_1

    :pswitch_44
    invoke-virtual {v0, v7, v1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v10, v11, v1}, LiD;->e(JLjava/lang/Object;)D

    move-result-wide v10

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v11}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Lma;->X(IJ)V

    :cond_1
    :goto_1
    add-int/lit8 v7, v7, 0x3

    goto/16 :goto_0

    :cond_2
    iget-object v3, v0, LMr;->m:LYC;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Lvj;

    iget-object v1, v1, Lvj;->unknownFields:LXC;

    invoke-virtual {v1, v2}, LXC;->e(LD2;)V

    return-void

    :cond_3
    invoke-virtual/range {p0 .. p2}, LMr;->W(Ljava/lang/Object;LD2;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lvj;)I
    .locals 11

    iget-object v0, p0, LMr;->a:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p0, v2}, LMr;->V(I)I

    move-result v4

    aget v5, v0, v2

    const v6, 0xfffff

    and-int/2addr v6, v4

    int-to-long v6, v6

    invoke-static {v4}, LMr;->U(I)I

    move-result v4

    const/16 v8, 0x4d5

    const/16 v9, 0x4cf

    const/16 v10, 0x25

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    mul-int/lit8 v3, v3, 0x35

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    :goto_1
    add-int/2addr v4, v3

    move v3, v4

    goto/16 :goto_4

    :pswitch_1
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, LMr;->E(JLjava/lang/Object;)I

    move-result v4

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto :goto_1

    :pswitch_4
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, LMr;->E(JLjava/lang/Object;)I

    move-result v4

    goto :goto_1

    :pswitch_5
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, LMr;->E(JLjava/lang/Object;)I

    move-result v4

    goto :goto_1

    :pswitch_6
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, LMr;->E(JLjava/lang/Object;)I

    move-result v4

    goto :goto_1

    :pswitch_7
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_1

    :pswitch_8
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    mul-int/lit8 v3, v3, 0x35

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_1

    :pswitch_9
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    sget-object v5, LLl;->a:Ljava/nio/charset/Charset;

    if-eqz v4, :cond_0

    :goto_2
    move v8, v9

    :cond_0
    add-int/2addr v8, v3

    move v3, v8

    goto/16 :goto_4

    :pswitch_b
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, LMr;->E(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, LMr;->E(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, v5, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_12
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_13
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_14
    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v10

    :cond_1
    :goto_3
    mul-int/lit8 v3, v3, 0x35

    add-int/2addr v3, v10

    goto/16 :goto_4

    :pswitch_15
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_16
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_17
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_18
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_19
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_1a
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_1b
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_1c
    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v10

    goto :goto_3

    :pswitch_1d
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_1e
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->c(JLjava/lang/Object;)Z

    move-result v4

    sget-object v5, LLl;->a:Ljava/nio/charset/Charset;

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :pswitch_1f
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_20
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_21
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_22
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_23
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_24
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->f(JLjava/lang/Object;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto/16 :goto_1

    :pswitch_25
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p1}, LiD;->e(JLjava/lang/Object;)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    invoke-static {v4, v5}, LLl;->b(J)I

    move-result v4

    goto/16 :goto_1

    :cond_2
    :goto_4
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_3
    mul-int/lit8 v3, v3, 0x35

    iget-object v0, p0, LMr;->m:LYC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lvj;->unknownFields:LXC;

    invoke-virtual {p1}, LXC;->hashCode()I

    move-result p1

    add-int/2addr p1, v3

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 10

    invoke-static {p1}, LMr;->l(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LMr;->a:[I

    array-length v2, v1

    if-ge v0, v2, :cond_1

    invoke-virtual {p0, v0}, LMr;->V(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    int-to-long v6, v3

    aget v1, v1, v0

    invoke-static {v2}, LMr;->U(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-virtual {p0, v0, p1, p2}, LMr;->y(ILjava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    :goto_1
    move-object v5, p1

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, v1, v0, p2}, LMr;->u(IILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, LjD;->c:LiD;

    invoke-virtual {v2, v6, v7, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6, v7, p1, v2}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v1, v0, p1}, LMr;->Q(IILjava/lang/Object;)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0, v0, p1, p2}, LMr;->y(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, v1, v0, p2}, LMr;->u(IILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, LjD;->c:LiD;

    invoke-virtual {v2, v6, v7, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6, v7, p1, v2}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v1, v0, p1}, LMr;->Q(IILjava/lang/Object;)V

    goto :goto_1

    :pswitch_4
    sget-object v1, Lnx;->a:Ljava/lang/Class;

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v6, v7, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, LMr;->n:Lsq;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Lsq;->b(Ljava/lang/Object;Ljava/lang/Object;)Lrq;

    move-result-object v1

    invoke-static {v6, v7, p1, v1}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    iget-object v1, p0, LMr;->l:Lvo;

    invoke-virtual {v1, v6, v7, p1, p2}, Lvo;->b(JLjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-virtual {p0, v0, p1, p2}, LMr;->x(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_7
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {p1, v6, v7, v1, v2}, LjD;->o(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto :goto_1

    :pswitch_8
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v6, v7, p1}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto :goto_1

    :pswitch_9
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {p1, v6, v7, v1, v2}, LjD;->o(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v6, v7, p1}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v6, v7, p1}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v6, v7, p1}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6, v7, p1, v1}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, v0, p1, p2}, LMr;->x(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6, v7, p1, v1}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->c(JLjava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, p1, v6, v7, v2}, LiD;->k(Ljava/lang/Object;JZ)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v6, v7, p1}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_12
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {p1, v6, v7, v1, v2}, LjD;->o(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_13
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v1

    invoke-static {v1, v6, v7, p1}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_14
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {p1, v6, v7, v1, v2}, LjD;->o(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_15
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v1

    invoke-static {p1, v6, v7, v1, v2}, LjD;->o(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_16
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LjD;->c:LiD;

    invoke-virtual {v1, v6, v7, p2}, LiD;->f(JLjava/lang/Object;)F

    move-result v2

    invoke-virtual {v1, p1, v6, v7, v2}, LiD;->n(Ljava/lang/Object;JF)V

    invoke-virtual {p0, v0, p1}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_17
    invoke-virtual {p0, v0, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v6, v7, p2}, LiD;->e(JLjava/lang/Object;)D

    move-result-wide v8

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, LiD;->m(Ljava/lang/Object;JD)V

    invoke-virtual {p0, v0, v5}, LMr;->P(ILjava/lang/Object;)V

    :goto_2
    add-int/lit8 v0, v0, 0x3

    move-object p1, v5

    goto/16 :goto_0

    :cond_1
    move-object v5, p1

    iget-object p1, p0, LMr;->m:LYC;

    invoke-static {p1, v5, p2}, Lnx;->w(LYC;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 8

    invoke-static {p1}, LMr;->t(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lvj;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lvj;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Lvj;->u(I)V

    iput v1, v0, LB;->memoizedHashCode:I

    invoke-virtual {v0}, Lvj;->o()V

    :cond_1
    iget-object v0, p0, LMr;->a:[I

    array-length v0, v0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_4

    invoke-virtual {p0, v2}, LMr;->V(I)I

    move-result v3

    const v4, 0xfffff

    and-int/2addr v4, v3

    int-to-long v4, v4

    invoke-static {v3}, LMr;->U(I)I

    move-result v3

    const/16 v6, 0x9

    if-eq v3, v6, :cond_2

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v3, LMr;->p:Lsun/misc/Unsafe;

    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_3

    iget-object v7, p0, LMr;->n:Lsq;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v7, v6

    check-cast v7, Lrq;

    iput-boolean v1, v7, Lrq;->a:Z

    invoke-virtual {v3, p1, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v3, p0, LMr;->l:Lvo;

    invoke-virtual {v3, v4, v5, p1}, Lvo;->a(JLjava/lang/Object;)V

    goto :goto_1

    :cond_2
    :pswitch_2
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0, v2}, LMr;->p(I)Lmx;

    move-result-object v3

    sget-object v6, LMr;->p:Lsun/misc/Unsafe;

    invoke-virtual {v6, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lmx;->d(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x3

    goto :goto_0

    :cond_4
    iget-object v0, p0, LMr;->m:LYC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lvj;

    iget-object p1, p1, Lvj;->unknownFields:LXC;

    iput-boolean v1, p1, LXC;->e:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Lvj;)I
    .locals 1

    iget-boolean v0, p0, LMr;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LMr;->r(Lvj;)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LMr;->q(Lvj;)I

    move-result p1

    return p1
.end method

.method public final f(Ljava/lang/Object;)Z
    .locals 13

    const v0, 0xfffff

    const/4 v1, 0x0

    move v3, v0

    move v2, v1

    move v4, v2

    :goto_0
    iget v5, p0, LMr;->i:I

    const/4 v6, 0x1

    if-ge v2, v5, :cond_f

    iget-object v5, p0, LMr;->h:[I

    aget v5, v5, v2

    iget-object v7, p0, LMr;->a:[I

    aget v8, v7, v5

    invoke-virtual {p0, v5}, LMr;->V(I)I

    move-result v9

    add-int/lit8 v10, v5, 0x2

    aget v7, v7, v10

    and-int v10, v7, v0

    ushr-int/lit8 v7, v7, 0x14

    shl-int v7, v6, v7

    if-eq v10, v3, :cond_1

    if-eq v10, v0, :cond_0

    sget-object v3, LMr;->p:Lsun/misc/Unsafe;

    int-to-long v11, v10

    invoke-virtual {v3, p1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    :cond_0
    move v3, v10

    :cond_1
    const/high16 v10, 0x10000000

    and-int/2addr v10, v9

    if-eqz v10, :cond_4

    if-ne v3, v0, :cond_2

    invoke-virtual {p0, v5, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v10

    goto :goto_1

    :cond_2
    and-int v10, v4, v7

    if-eqz v10, :cond_3

    move v10, v6

    goto :goto_1

    :cond_3
    move v10, v1

    :goto_1
    if-nez v10, :cond_4

    goto/16 :goto_4

    :cond_4
    invoke-static {v9}, LMr;->U(I)I

    move-result v10

    const/16 v11, 0x9

    if-eq v10, v11, :cond_b

    const/16 v11, 0x11

    if-eq v10, v11, :cond_b

    const/16 v6, 0x1b

    if-eq v10, v6, :cond_8

    const/16 v6, 0x3c

    if-eq v10, v6, :cond_7

    const/16 v6, 0x44

    if-eq v10, v6, :cond_7

    const/16 v6, 0x31

    if-eq v10, v6, :cond_8

    const/16 v6, 0x32

    if-eq v10, v6, :cond_5

    goto/16 :goto_5

    :cond_5
    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iget-object v7, p0, LMr;->n:Lsq;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v6, Lrq;

    invoke-virtual {v6}, Ljava/util/HashMap;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    goto/16 :goto_5

    :cond_6
    invoke-virtual {p0, v5}, LMr;->o(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LEy;->o(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_7
    invoke-virtual {p0, v8, v5, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {p0, v5}, LMr;->p(I)Lmx;

    move-result-object v5

    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Lmx;->f(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    goto :goto_4

    :cond_8
    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {p0, v5}, LMr;->p(I)Lmx;

    move-result-object v5

    move v7, v1

    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_e

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v5, v8}, Lmx;->f(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_4

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_b
    if-ne v3, v0, :cond_c

    invoke-virtual {p0, v5, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v6

    goto :goto_3

    :cond_c
    and-int/2addr v7, v4

    if-eqz v7, :cond_d

    goto :goto_3

    :cond_d
    move v6, v1

    :goto_3
    if-eqz v6, :cond_e

    invoke-virtual {p0, v5}, LMr;->p(I)Lmx;

    move-result-object v5

    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, LjD;->c:LiD;

    invoke-virtual {v8, v6, v7, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Lmx;->f(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    :goto_4
    return v1

    :cond_e
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_f
    return v6
.end method

.method public final g(Ljava/lang/Object;[BIILC4;)V
    .locals 8

    iget-boolean v0, p0, LMr;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p5}, LMr;->J(Ljava/lang/Object;[BIILC4;)V

    return-void

    :cond_0
    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, LMr;->I(Ljava/lang/Object;[BIIILC4;)I

    return-void
.end method

.method public final h(Lvj;Lvj;)Z
    .locals 11

    iget-object v0, p0, LMr;->a:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_2

    invoke-virtual {p0, v3}, LMr;->V(I)I

    move-result v5

    const v6, 0xfffff

    and-int v7, v5, v6

    int-to-long v7, v7

    invoke-static {v5}, LMr;->U(I)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    add-int/lit8 v5, v3, 0x2

    aget v5, v0, v5

    and-int/2addr v5, v6

    int-to-long v5, v5

    sget-object v9, LjD;->c:LiD;

    invoke-virtual {v9, v5, v6, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v10

    invoke-virtual {v9, v5, v6, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v10, v5, :cond_0

    invoke-virtual {v9, v7, v8, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v9, v7, v8, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Lnx;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :cond_0
    move v4, v2

    goto/16 :goto_1

    :pswitch_1
    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v7, v8, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v7, v8, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lnx;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto/16 :goto_1

    :pswitch_2
    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v7, v8, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v7, v8, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lnx;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Lnx;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Lnx;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Lnx;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Lnx;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->c(JLjava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->c(JLjava/lang/Object;)Z

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto :goto_1

    :pswitch_11
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    goto :goto_1

    :pswitch_12
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    goto :goto_1

    :pswitch_13
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->f(JLjava/lang/Object;)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, LiD;->f(JLjava/lang/Object;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto :goto_1

    :pswitch_14
    invoke-virtual {p0, p1, p2, v3}, LMr;->k(Lvj;Lvj;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v7, v8, p1}, LiD;->e(JLjava/lang/Object;)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, LiD;->e(JLjava/lang/Object;)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    :goto_1
    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x3

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, LMr;->m:LYC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lvj;->unknownFields:LXC;

    iget-object p2, p2, Lvj;->unknownFields:LXC;

    invoke-virtual {p1, p2}, LXC;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_2
    return v2

    :cond_3
    return v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;Lla;LTg;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move-object/from16 v6, p3

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, LMr;->l(Ljava/lang/Object;)V

    iget-object v8, v1, LMr;->m:LYC;

    iget-object v9, v1, LMr;->h:[I

    iget v10, v1, LMr;->j:I

    iget v11, v1, LMr;->i:I

    const/4 v13, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {v4}, Lla;->a()I

    move-result v0

    iget v3, v1, LMr;->c:I

    const/4 v5, 0x0

    if-lt v0, v3, :cond_0

    iget v3, v1, LMr;->d:I

    if-gt v0, v3, :cond_0

    invoke-virtual {v1, v0, v5}, LMr;->R(II)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :goto_1
    move v7, v3

    goto :goto_3

    :goto_2
    move-object v6, v1

    goto/16 :goto_e

    :cond_0
    const/4 v3, -0x1

    goto :goto_1

    :goto_3
    if-gez v7, :cond_7

    const v3, 0x7fffffff

    if-ne v0, v3, :cond_3

    :goto_4
    if-ge v11, v10, :cond_1

    aget v0, v9, v11

    invoke-virtual {v1, v0, v2, v13}, LMr;->m(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_1
    if-eqz v13, :cond_2

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_5
    move-object v0, v2

    check-cast v0, Lvj;

    iput-object v13, v0, Lvj;->unknownFields:LXC;

    :cond_2
    move-object v6, v1

    goto/16 :goto_11

    :cond_3
    :try_start_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v13, :cond_4

    invoke-static {v2}, LYC;->a(Ljava/lang/Object;)LXC;

    move-result-object v13

    :cond_4
    invoke-static {v13, v4}, LYC;->b(Ljava/lang/Object;Lla;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    :goto_6
    if-ge v11, v10, :cond_6

    aget v0, v9, v11

    invoke-virtual {v1, v0, v2, v13}, LMr;->m(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    :cond_6
    if-eqz v13, :cond_2

    :goto_7
    goto :goto_5

    :cond_7
    :try_start_2
    invoke-virtual {v1, v7}, LMr;->V(I)I

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    invoke-static {v3}, LMr;->U(I)I

    move-result v14
    :try_end_3
    .catch LOl; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    const/16 v16, 0x0

    const/4 v12, 0x3

    const v18, 0xfffff

    iget-object v15, v1, LMr;->l:Lvo;

    packed-switch v14, :pswitch_data_0

    if-nez v13, :cond_8

    :try_start_4
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, LYC;->a(Ljava/lang/Object;)LXC;

    move-result-object v13

    goto :goto_a

    :catch_0
    :goto_8
    move-object v6, v1

    move-object v14, v4

    :catch_1
    :goto_9
    move-object v12, v8

    move-object v15, v9

    goto/16 :goto_f

    :cond_8
    :goto_a
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v13, v4}, LYC;->b(Ljava/lang/Object;Lla;)Z

    move-result v0
    :try_end_4
    .catch LOl; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-nez v0, :cond_a

    :goto_b
    if-ge v11, v10, :cond_9

    aget v0, v9, v11

    invoke-virtual {v1, v0, v2, v13}, LMr;->m(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_b

    :cond_9
    if-eqz v13, :cond_2

    goto :goto_7

    :pswitch_0
    :try_start_5
    invoke-virtual {v1, v0, v7, v2}, LMr;->A(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LB;

    invoke-virtual {v1, v7}, LMr;->p(I)Lmx;

    move-result-object v5

    invoke-virtual {v4, v12}, Lla;->v(I)V

    invoke-virtual {v4, v3, v5, v6}, Lla;->b(Ljava/lang/Object;Lmx;LTg;)V

    invoke-virtual {v1, v2, v3, v0, v7}, LMr;->T(Ljava/lang/Object;Ljava/lang/Object;II)V

    :cond_a
    :goto_c
    move-object v6, v1

    move-object v14, v4

    :goto_d
    move-object v12, v8

    move-object v15, v9

    goto/16 :goto_12

    :pswitch_1
    and-int v3, v3, v18

    int-to-long v14, v3

    invoke-virtual {v4, v5}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->y()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto :goto_c

    :pswitch_2
    and-int v3, v3, v18

    int-to-long v14, v3

    invoke-virtual {v4, v5}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->x()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto :goto_c

    :pswitch_3
    and-int v3, v3, v18

    int-to-long v14, v3

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->w()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto :goto_c

    :pswitch_4
    and-int v3, v3, v18

    int-to-long v14, v3

    const/4 v3, 0x5

    invoke-virtual {v4, v3}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->v()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto :goto_c

    :pswitch_5
    invoke-virtual {v4, v5}, Lla;->v(I)V

    iget-object v5, v4, Lla;->a:Lka;

    invoke-virtual {v5}, Lka;->p()I

    move-result v5

    invoke-virtual {v1, v7}, LMr;->n(I)V

    and-int v3, v3, v18

    int-to-long v14, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto :goto_c

    :pswitch_6
    and-int v3, v3, v18

    int-to-long v14, v3

    invoke-virtual {v4, v5}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->C()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_7
    and-int v3, v3, v18

    int-to-long v14, v3

    invoke-virtual {v4}, Lla;->e()Ly6;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_8
    invoke-virtual {v1, v0, v7, v2}, LMr;->A(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LB;

    invoke-virtual {v1, v7}, LMr;->p(I)Lmx;

    move-result-object v5

    const/4 v12, 0x2

    invoke-virtual {v4, v12}, Lla;->v(I)V

    invoke-virtual {v4, v3, v5, v6}, Lla;->c(Ljava/lang/Object;Lmx;LTg;)V

    invoke-virtual {v1, v2, v3, v0, v7}, LMr;->T(Ljava/lang/Object;Ljava/lang/Object;II)V

    goto/16 :goto_c

    :pswitch_9
    invoke-virtual {v1, v2, v3, v4}, LMr;->N(Ljava/lang/Object;ILla;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_a
    and-int v3, v3, v18

    int-to-long v14, v3

    invoke-virtual {v4, v5}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->m()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_b
    and-int v3, v3, v18

    int-to-long v14, v3

    const/4 v3, 0x5

    invoke-virtual {v4, v3}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->q()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_c
    and-int v3, v3, v18

    int-to-long v14, v3

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->r()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_d
    and-int v3, v3, v18

    int-to-long v14, v3

    invoke-virtual {v4, v5}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->t()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_e
    and-int v3, v3, v18

    int-to-long v14, v3

    invoke-virtual {v4, v5}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->D()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_f
    and-int v3, v3, v18

    int-to-long v14, v3

    invoke-virtual {v4, v5}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->u()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_10
    and-int v3, v3, v18

    int-to-long v14, v3

    const/4 v3, 0x5

    invoke-virtual {v4, v3}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->s()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_11
    and-int v3, v3, v18

    int-to-long v14, v3

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Lla;->v(I)V

    iget-object v3, v4, Lla;->a:Lka;

    invoke-virtual {v3}, Lka;->o()D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v14, v15, v2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v7, v2}, LMr;->Q(IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_12
    invoke-virtual {v1, v7}, LMr;->o(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v7, v2, v0}, LMr;->w(ILjava/lang/Object;Ljava/lang/Object;)V

    throw v16

    :pswitch_13
    and-int v0, v3, v18

    int-to-long v14, v0

    invoke-virtual {v1, v7}, LMr;->p(I)Lmx;

    move-result-object v6
    :try_end_5
    .catch LOl; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object/from16 v7, p3

    move-object v5, v4

    move-wide v3, v14

    :try_start_6
    invoke-virtual/range {v1 .. v7}, LMr;->L(Ljava/lang/Object;JLla;Lmx;LTg;)V
    :try_end_6
    .catch LOl; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object v4, v5

    goto/16 :goto_c

    :catch_2
    move-object v6, v1

    move-object v14, v5

    goto/16 :goto_9

    :pswitch_14
    and-int v0, v3, v18

    int-to-long v5, v0

    :try_start_7
    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->q(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_15
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->p(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_16
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->o(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_17
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->n(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_18
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->h(Ljava/util/List;)V

    invoke-virtual {v1, v7}, LMr;->n(I)V

    sget-object v0, Lnx;->a:Ljava/lang/Class;

    goto/16 :goto_c

    :pswitch_19
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->s(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_1a
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->d(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_1b
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->i(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_1c
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->j(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_1d
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->l(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_1e
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->t(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_1f
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->m(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_20
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->k(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_21
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->g(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_22
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->q(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_23
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->p(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_24
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->o(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_25
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->n(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_26
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->h(Ljava/util/List;)V

    invoke-virtual {v1, v7}, LMr;->n(I)V

    sget-object v0, Lnx;->a:Ljava/lang/Class;

    goto/16 :goto_c

    :pswitch_27
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->s(Ljava/util/List;)V

    goto/16 :goto_c

    :pswitch_28
    and-int v0, v3, v18

    int-to-long v5, v0

    invoke-virtual {v15, v5, v6, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lla;->f(Ljava/util/List;)V
    :try_end_7
    .catch LOl; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto/16 :goto_c

    :pswitch_29
    :try_start_8
    invoke-virtual {v1, v7}, LMr;->p(I)Lmx;

    move-result-object v5
    :try_end_8
    .catch LOl; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    move-object/from16 v6, p3

    :try_start_9
    invoke-virtual/range {v1 .. v6}, LMr;->M(Ljava/lang/Object;ILla;Lmx;LTg;)V
    :try_end_9
    .catch LOl; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    goto/16 :goto_d

    :catch_3
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    goto/16 :goto_9

    :catch_4
    move-object/from16 v0, p3

    goto/16 :goto_8

    :pswitch_2a
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    const/high16 v1, 0x20000000

    and-int/2addr v1, v3

    if-eqz v1, :cond_b

    and-int v1, v3, v18

    int-to-long v3, v1

    :try_start_a
    invoke-virtual {v15, v3, v4, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v14, v1, v3}, Lla;->r(Ljava/util/List;Z)V

    goto/16 :goto_d

    :cond_b
    and-int v1, v3, v18

    int-to-long v3, v1

    invoke-virtual {v15, v3, v4, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v14, v1, v5}, Lla;->r(Ljava/util/List;Z)V

    goto/16 :goto_d

    :pswitch_2b
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v15, v3, v4, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v14, v1}, Lla;->d(Ljava/util/List;)V

    goto/16 :goto_d

    :pswitch_2c
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v15, v3, v4, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v14, v1}, Lla;->i(Ljava/util/List;)V

    goto/16 :goto_d

    :pswitch_2d
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v15, v3, v4, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v14, v1}, Lla;->j(Ljava/util/List;)V

    goto/16 :goto_d

    :pswitch_2e
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v15, v3, v4, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v14, v1}, Lla;->l(Ljava/util/List;)V

    goto/16 :goto_d

    :pswitch_2f
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v15, v3, v4, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v14, v1}, Lla;->t(Ljava/util/List;)V

    goto/16 :goto_d

    :pswitch_30
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v15, v3, v4, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v14, v1}, Lla;->m(Ljava/util/List;)V

    goto/16 :goto_d

    :pswitch_31
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v15, v3, v4, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v14, v1}, Lla;->k(Ljava/util/List;)V

    goto/16 :goto_d

    :pswitch_32
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v15, v3, v4, v2}, Lvo;->c(JLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v14, v1}, Lla;->g(Ljava/util/List;)V

    goto/16 :goto_d

    :pswitch_33
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    invoke-virtual {v6, v7, v2}, LMr;->z(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB;

    invoke-virtual {v6, v7}, LMr;->p(I)Lmx;

    move-result-object v3

    invoke-virtual {v14, v12}, Lla;->v(I)V

    invoke-virtual {v14, v1, v3, v0}, Lla;->b(Ljava/lang/Object;Lmx;LTg;)V

    invoke-virtual {v6, v7, v2, v1}, LMr;->S(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_d

    :pswitch_34
    move-object v14, v4

    move-object v0, v6

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v14, v5}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;
    :try_end_a
    .catch LOl; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    move-object v12, v8

    move-object v15, v9

    :try_start_b
    invoke-virtual {v1}, Lka;->y()J

    move-result-wide v8

    invoke-static {v2, v3, v4, v8, v9}, LjD;->o(Ljava/lang/Object;JJ)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :catchall_0
    move-exception v0

    goto/16 :goto_13

    :catchall_1
    move-exception v0

    :goto_e
    move-object v12, v8

    move-object v15, v9

    goto/16 :goto_13

    :pswitch_35
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v14, v5}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->x()I

    move-result v1

    invoke-static {v1, v3, v4, v2}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_36
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->w()J

    move-result-wide v8

    invoke-static {v2, v3, v4, v8, v9}, LjD;->o(Ljava/lang/Object;JJ)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_37
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    const/4 v1, 0x5

    invoke-virtual {v14, v1}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->v()I

    move-result v1

    invoke-static {v1, v3, v4, v2}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_38
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-virtual {v14, v5}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->p()I

    move-result v1

    invoke-virtual {v6, v7}, LMr;->n(I)V

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-static {v1, v3, v4, v2}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_39
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v14, v5}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->C()I

    move-result v1

    invoke-static {v1, v3, v4, v2}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_3a
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v14}, Lla;->e()Ly6;

    move-result-object v1

    invoke-static {v3, v4, v2, v1}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_3b
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-virtual {v6, v7, v2}, LMr;->z(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB;

    invoke-virtual {v6, v7}, LMr;->p(I)Lmx;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v14, v4}, Lla;->v(I)V

    invoke-virtual {v14, v1, v3, v0}, Lla;->c(Ljava/lang/Object;Lmx;LTg;)V

    invoke-virtual {v6, v7, v2, v1}, LMr;->S(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_3c
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-virtual {v6, v2, v3, v14}, LMr;->N(Ljava/lang/Object;ILla;)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_3d
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v14, v5}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->m()Z

    move-result v1

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v2, v3, v4, v1}, LiD;->k(Ljava/lang/Object;JZ)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_3e
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    const/4 v1, 0x5

    invoke-virtual {v14, v1}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->q()I

    move-result v1

    invoke-static {v1, v3, v4, v2}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_3f
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->r()J

    move-result-wide v8

    invoke-static {v2, v3, v4, v8, v9}, LjD;->o(Ljava/lang/Object;JJ)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_40
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v14, v5}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->t()I

    move-result v1

    invoke-static {v1, v3, v4, v2}, LjD;->n(IJLjava/lang/Object;)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_41
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v14, v5}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->D()J

    move-result-wide v8

    invoke-static {v2, v3, v4, v8, v9}, LjD;->o(Ljava/lang/Object;JJ)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_42
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    invoke-virtual {v14, v5}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->u()J

    move-result-wide v8

    invoke-static {v2, v3, v4, v8, v9}, LjD;->o(Ljava/lang/Object;JJ)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_43
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    const/4 v1, 0x5

    invoke-virtual {v14, v1}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->s()F

    move-result v1

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v2, v3, v4, v1}, LiD;->n(Ljava/lang/Object;JF)V

    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V

    goto :goto_12

    :pswitch_44
    move-object v14, v4

    move-object v0, v6

    move-object v12, v8

    move-object v15, v9

    move-object v6, v1

    invoke-static {v3}, LMr;->D(I)J

    move-result-wide v3

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lla;->v(I)V

    iget-object v1, v14, Lla;->a:Lka;

    invoke-virtual {v1}, Lka;->o()D

    move-result-wide v8

    sget-object v0, LjD;->c:LiD;
    :try_end_b
    .catch LOl; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-object v1, v2

    move-wide v2, v3

    move-wide v4, v8

    :try_start_c
    invoke-virtual/range {v0 .. v5}, LiD;->m(Ljava/lang/Object;JD)V
    :try_end_c
    .catch LOl; {:try_start_c .. :try_end_c} :catch_5
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-object v2, v1

    :try_start_d
    invoke-virtual {v6, v7, v2}, LMr;->P(ILjava/lang/Object;)V
    :try_end_d
    .catch LOl; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto :goto_12

    :catchall_2
    move-exception v0

    move-object v2, v1

    goto :goto_13

    :catch_5
    move-object v2, v1

    goto :goto_f

    :catch_6
    move-object v6, v1

    move-object v14, v4

    move-object v12, v8

    move-object v15, v9

    const/16 v16, 0x0

    :catch_7
    :goto_f
    :try_start_e
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v13, :cond_c

    invoke-static {v2}, LYC;->a(Ljava/lang/Object;)LXC;

    move-result-object v0

    move-object v13, v0

    :cond_c
    invoke-static {v13, v14}, LYC;->b(Ljava/lang/Object;Lla;)Z

    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    if-nez v0, :cond_f

    :goto_10
    if-ge v11, v10, :cond_d

    aget v0, v15, v11

    invoke-virtual {v6, v0, v2, v13}, LMr;->m(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_10

    :cond_d
    if-eqz v13, :cond_e

    move-object v0, v2

    check-cast v0, Lvj;

    iput-object v13, v0, Lvj;->unknownFields:LXC;

    :cond_e
    :goto_11
    return-void

    :cond_f
    :goto_12
    move-object v1, v6

    move-object v8, v12

    move-object v4, v14

    move-object v9, v15

    move-object/from16 v6, p3

    goto/16 :goto_0

    :catchall_3
    move-exception v0

    goto/16 :goto_2

    :goto_13
    if-ge v11, v10, :cond_10

    aget v1, v15, v11

    invoke-virtual {v6, v1, v2, v13}, LMr;->m(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_13

    :cond_10
    if-eqz v13, :cond_11

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v1, v2

    check-cast v1, Lvj;

    iput-object v13, v1, Lvj;->unknownFields:LXC;

    :cond_11
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LMr;->k:LQs;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, LMr;->e:LB;

    check-cast v0, Lvj;

    invoke-virtual {v0}, Lvj;->q()Lvj;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lvj;Lvj;I)Z
    .locals 0

    invoke-virtual {p0, p3, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result p1

    invoke-virtual {p0, p3, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final m(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object p3, p0, LMr;->a:[I

    aget p3, p3, p1

    invoke-virtual {p0, p1}, LMr;->V(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    sget-object p3, LjD;->c:LiD;

    invoke-virtual {p3, v0, v1, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LMr;->n(I)V

    return-void
.end method

.method public final n(I)V
    .locals 1

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, LMr;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public final o(I)Ljava/lang/Object;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, LMr;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final p(I)Lmx;
    .locals 3

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, LMr;->b:[Ljava/lang/Object;

    aget-object v1, v0, p1

    check-cast v1, Lmx;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    sget-object v1, LHu;->c:LHu;

    add-int/lit8 v2, p1, 0x1

    aget-object v2, v0, v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v1, v2}, LHu;->a(Ljava/lang/Class;)Lmx;

    move-result-object v1

    aput-object v1, v0, p1

    return-object v1
.end method

.method public final q(Lvj;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, LMr;->p:Lsun/misc/Unsafe;

    const v4, 0xfffff

    move v7, v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_0
    iget-object v9, v0, LMr;->a:[I

    array-length v10, v9

    if-ge v5, v10, :cond_8

    invoke-virtual {v0, v5}, LMr;->V(I)I

    move-result v10

    aget v11, v9, v5

    invoke-static {v10}, LMr;->U(I)I

    move-result v12

    const/16 v13, 0x11

    const/4 v14, 0x1

    if-gt v12, v13, :cond_0

    add-int/lit8 v13, v5, 0x2

    aget v9, v9, v13

    and-int v13, v9, v4

    ushr-int/lit8 v9, v9, 0x14

    shl-int v9, v14, v9

    if-eq v13, v7, :cond_1

    int-to-long v7, v13

    invoke-virtual {v2, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    move v7, v13

    goto :goto_1

    :cond_0
    const/4 v9, 0x0

    :cond_1
    :goto_1
    and-int/2addr v10, v4

    int-to-long v3, v10

    const/16 v15, 0x3f

    const/4 v10, 0x4

    const/16 v13, 0x8

    packed-switch v12, :pswitch_data_0

    goto/16 :goto_10

    :pswitch_0
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LB;

    invoke-virtual {v0, v5}, LMr;->p(I)Lmx;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lma;->N(ILB;Lmx;)I

    move-result v3

    :goto_2
    add-int/2addr v6, v3

    goto/16 :goto_10

    :pswitch_1
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v9

    shl-long v10, v3, v14

    shr-long/2addr v3, v15

    xor-long/2addr v3, v10

    invoke-static {v3, v4}, Lma;->S(J)I

    move-result v3

    :goto_3
    add-int/2addr v3, v9

    goto :goto_2

    :pswitch_2
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    shl-int/lit8 v9, v3, 0x1

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v9

    invoke-static {v3}, Lma;->R(I)I

    move-result v3

    :goto_4
    add-int/2addr v3, v4

    goto :goto_2

    :pswitch_3
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    :goto_5
    invoke-static {v11, v13, v6}, Lph;->e(III)I

    move-result v6

    goto/16 :goto_10

    :pswitch_4
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    :goto_6
    invoke-static {v11, v10, v6}, Lph;->e(III)I

    move-result v6

    goto/16 :goto_10

    :pswitch_5
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    invoke-static {v3}, Lma;->O(I)I

    move-result v3

    goto :goto_4

    :pswitch_6
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    invoke-static {v3}, Lma;->R(I)I

    move-result v3

    goto :goto_4

    :pswitch_7
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly6;

    invoke-static {v11, v3}, Lma;->J(ILy6;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, LMr;->p(I)Lmx;

    move-result-object v4

    sget-object v9, Lnx;->a:Ljava/lang/Class;

    check-cast v3, LB;

    invoke-static {v11}, Lma;->Q(I)I

    move-result v9

    invoke-virtual {v3, v4}, LB;->b(Lmx;)I

    move-result v3

    :goto_7
    invoke-static {v3, v3, v9, v6}, Lph;->f(IIII)I

    move-result v6

    goto/16 :goto_10

    :pswitch_9
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ly6;

    if-eqz v4, :cond_2

    check-cast v3, Ly6;

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    invoke-virtual {v3}, Ly6;->size()I

    move-result v3

    :goto_8
    invoke-static {v3, v3, v4, v6}, Lph;->f(IIII)I

    move-result v3

    :goto_9
    move v6, v3

    goto/16 :goto_10

    :cond_2
    check-cast v3, Ljava/lang/String;

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    invoke-static {v3}, Lma;->P(Ljava/lang/String;)I

    move-result v3

    :goto_a
    add-int/2addr v3, v4

    add-int/2addr v3, v6

    goto :goto_9

    :pswitch_a
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    :goto_b
    invoke-static {v11, v14, v6}, Lph;->e(III)I

    move-result v6

    goto/16 :goto_10

    :pswitch_b
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v11}, Lma;->L(I)I

    move-result v3

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v11}, Lma;->M(I)I

    move-result v3

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, LMr;->E(JLjava/lang/Object;)I

    move-result v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    invoke-static {v3}, Lma;->O(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_e
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v9

    invoke-static {v3, v4}, Lma;->S(J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v9

    invoke-static {v3, v4}, Lma;->S(J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto/16 :goto_6

    :pswitch_11
    invoke-virtual {v0, v11, v5, v1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto/16 :goto_5

    :pswitch_12
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, LMr;->o(I)Ljava/lang/Object;

    move-result-object v4

    iget-object v9, v0, LMr;->n:Lsq;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4}, Lsq;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_10

    :pswitch_13
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, LMr;->p(I)Lmx;

    move-result-object v4

    sget-object v9, Lnx;->a:Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v9

    if-nez v9, :cond_3

    const/4 v12, 0x0

    goto :goto_d

    :cond_3
    const/4 v10, 0x0

    const/4 v12, 0x0

    :goto_c
    if-ge v10, v9, :cond_4

    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LB;

    invoke-static {v11, v13, v4}, Lma;->N(ILB;Lmx;)I

    move-result v13

    add-int/2addr v12, v13

    add-int/lit8 v10, v10, 0x1

    goto :goto_c

    :cond_4
    :goto_d
    add-int/2addr v6, v12

    goto/16 :goto_10

    :pswitch_14
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->p(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    :goto_e
    invoke-static {v3, v4, v3, v6}, Lph;->f(IIII)I

    move-result v6

    goto/16 :goto_10

    :pswitch_15
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->n(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto :goto_e

    :pswitch_16
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto :goto_e

    :pswitch_17
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->e(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto :goto_e

    :pswitch_18
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->c(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto :goto_e

    :pswitch_19
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->s(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto :goto_e

    :pswitch_1a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    sget-object v4, Lnx;->a:Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto :goto_e

    :pswitch_1b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->e(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto :goto_e

    :pswitch_1c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto/16 :goto_e

    :pswitch_1d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->i(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto/16 :goto_e

    :pswitch_1e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->u(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto/16 :goto_e

    :pswitch_1f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->k(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto/16 :goto_e

    :pswitch_20
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->e(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto/16 :goto_e

    :pswitch_21
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lnx;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    goto/16 :goto_e

    :pswitch_22
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->o(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_23
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->m(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_24
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->f(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_25
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->d(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_26
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->b(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_27
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->r(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_28
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->a(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_29
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, LMr;->p(I)Lmx;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lnx;->l(ILjava/util/List;Lmx;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->q(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    sget-object v4, Lnx;->a:Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_5

    const/4 v4, 0x0

    goto :goto_f

    :cond_5
    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    add-int/2addr v4, v14

    mul-int/2addr v4, v3

    :goto_f
    add-int/2addr v6, v4

    goto/16 :goto_10

    :pswitch_2c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->d(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->f(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->h(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->t(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_30
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->j(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_31
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->d(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_32
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lnx;->f(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_33
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LB;

    invoke-virtual {v0, v5}, LMr;->p(I)Lmx;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lma;->N(ILB;Lmx;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_34
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v9

    shl-long v10, v3, v14

    shr-long/2addr v3, v15

    xor-long/2addr v3, v10

    invoke-static {v3, v4}, Lma;->S(J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_35
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    shl-int/lit8 v9, v3, 0x1

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v9

    invoke-static {v3}, Lma;->R(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_36
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    goto/16 :goto_5

    :pswitch_37
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    goto/16 :goto_6

    :pswitch_38
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    invoke-static {v3}, Lma;->O(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_39
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    invoke-static {v3}, Lma;->R(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_3a
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly6;

    invoke-static {v11, v3}, Lma;->J(ILy6;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_3b
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, LMr;->p(I)Lmx;

    move-result-object v4

    sget-object v9, Lnx;->a:Ljava/lang/Class;

    check-cast v3, LB;

    invoke-static {v11}, Lma;->Q(I)I

    move-result v9

    invoke-virtual {v3, v4}, LB;->b(Lmx;)I

    move-result v3

    goto/16 :goto_7

    :pswitch_3c
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ly6;

    if-eqz v4, :cond_6

    check-cast v3, Ly6;

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    invoke-virtual {v3}, Ly6;->size()I

    move-result v3

    goto/16 :goto_8

    :cond_6
    check-cast v3, Ljava/lang/String;

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    invoke-static {v3}, Lma;->P(Ljava/lang/String;)I

    move-result v3

    goto/16 :goto_a

    :pswitch_3d
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    goto/16 :goto_b

    :pswitch_3e
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    invoke-static {v11}, Lma;->L(I)I

    move-result v3

    goto/16 :goto_2

    :pswitch_3f
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    invoke-static {v11}, Lma;->M(I)I

    move-result v3

    goto/16 :goto_2

    :pswitch_40
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v4

    invoke-static {v3}, Lma;->O(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_41
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v9

    invoke-static {v3, v4}, Lma;->S(J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_42
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v11}, Lma;->Q(I)I

    move-result v9

    invoke-static {v3, v4}, Lma;->S(J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_43
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    goto/16 :goto_6

    :pswitch_44
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    goto/16 :goto_5

    :cond_7
    :goto_10
    add-int/lit8 v5, v5, 0x3

    const v4, 0xfffff

    goto/16 :goto_0

    :cond_8
    iget-object v2, v0, LMr;->m:LYC;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Lvj;->unknownFields:LXC;

    invoke-virtual {v1}, LXC;->b()I

    move-result v1

    add-int/2addr v1, v6

    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Lvj;)I
    .locals 12

    sget-object v0, LMr;->p:Lsun/misc/Unsafe;

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    iget-object v4, p0, LMr;->a:[I

    array-length v5, v4

    if-ge v2, v5, :cond_7

    invoke-virtual {p0, v2}, LMr;->V(I)I

    move-result v5

    invoke-static {v5}, LMr;->U(I)I

    move-result v6

    aget v7, v4, v2

    const v8, 0xfffff

    and-int/2addr v5, v8

    int-to-long v8, v5

    sget-object v5, Ljh;->b:Ljh;

    iget v5, v5, Ljh;->a:I

    if-lt v6, v5, :cond_0

    sget-object v5, Ljh;->c:Ljh;

    iget v5, v5, Ljh;->a:I

    if-gt v6, v5, :cond_0

    add-int/lit8 v5, v2, 0x2

    aget v4, v4, v5

    :cond_0
    const/16 v4, 0x3f

    const/4 v5, 0x4

    const/16 v10, 0x8

    const/4 v11, 0x1

    packed-switch v6, :pswitch_data_0

    goto/16 :goto_f

    :pswitch_0
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LB;

    invoke-virtual {p0, v2}, LMr;->p(I)Lmx;

    move-result-object v5

    invoke-static {v7, v4, v5}, Lma;->N(ILB;Lmx;)I

    move-result v4

    :goto_1
    add-int/2addr v3, v4

    goto/16 :goto_f

    :pswitch_1
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-static {v8, v9, p1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v7}, Lma;->Q(I)I

    move-result v7

    shl-long v8, v5, v11

    shr-long v4, v5, v4

    xor-long/2addr v4, v8

    invoke-static {v4, v5}, Lma;->S(J)I

    move-result v4

    :goto_2
    add-int/2addr v4, v7

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, LMr;->E(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    shl-int/lit8 v6, v4, 0x1

    shr-int/lit8 v4, v4, 0x1f

    xor-int/2addr v4, v6

    invoke-static {v4}, Lma;->R(I)I

    move-result v4

    :goto_3
    add-int/2addr v4, v5

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    :goto_4
    invoke-static {v7, v10, v3}, Lph;->e(III)I

    move-result v3

    goto/16 :goto_f

    :pswitch_4
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    :goto_5
    invoke-static {v7, v5, v3}, Lph;->e(III)I

    move-result v3

    goto/16 :goto_f

    :pswitch_5
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, LMr;->E(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    invoke-static {v4}, Lma;->O(I)I

    move-result v4

    goto :goto_3

    :pswitch_6
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, LMr;->E(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    invoke-static {v4}, Lma;->R(I)I

    move-result v4

    goto :goto_3

    :pswitch_7
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly6;

    invoke-static {v7, v4}, Lma;->J(ILy6;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, LMr;->p(I)Lmx;

    move-result-object v5

    sget-object v6, Lnx;->a:Ljava/lang/Class;

    check-cast v4, LB;

    invoke-static {v7}, Lma;->Q(I)I

    move-result v6

    invoke-virtual {v4, v5}, LB;->b(Lmx;)I

    move-result v4

    :goto_6
    invoke-static {v4, v4, v6, v3}, Lph;->f(IIII)I

    move-result v3

    goto/16 :goto_f

    :pswitch_9
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ly6;

    if-eqz v5, :cond_1

    check-cast v4, Ly6;

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    invoke-virtual {v4}, Ly6;->size()I

    move-result v4

    :goto_7
    invoke-static {v4, v4, v5, v3}, Lph;->f(IIII)I

    move-result v3

    goto/16 :goto_f

    :cond_1
    check-cast v4, Ljava/lang/String;

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    invoke-static {v4}, Lma;->P(Ljava/lang/String;)I

    move-result v4

    :goto_8
    add-int/2addr v4, v5

    add-int/2addr v4, v3

    move v3, v4

    goto/16 :goto_f

    :pswitch_a
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    :goto_9
    invoke-static {v7, v11, v3}, Lph;->e(III)I

    move-result v3

    goto/16 :goto_f

    :pswitch_b
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7}, Lma;->L(I)I

    move-result v4

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7}, Lma;->M(I)I

    move-result v4

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, LMr;->E(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    invoke-static {v4}, Lma;->O(I)I

    move-result v4

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v6

    invoke-static {v4, v5}, Lma;->S(J)I

    move-result v4

    :goto_a
    add-int/2addr v4, v6

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, LMr;->F(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v6

    invoke-static {v4, v5}, Lma;->S(J)I

    move-result v4

    goto :goto_a

    :pswitch_10
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_5

    :pswitch_11
    invoke-virtual {p0, v7, v2, p1}, LMr;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :pswitch_12
    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, LMr;->o(I)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, LMr;->n:Lsq;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v5}, Lsq;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_13
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0, v2}, LMr;->p(I)Lmx;

    move-result-object v5

    sget-object v6, Lnx;->a:Ljava/lang/Class;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-nez v6, :cond_2

    move v9, v1

    goto :goto_c

    :cond_2
    move v8, v1

    move v9, v8

    :goto_b
    if-ge v8, v6, :cond_3

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LB;

    invoke-static {v7, v10, v5}, Lma;->N(ILB;Lmx;)I

    move-result v10

    add-int/2addr v9, v10

    add-int/lit8 v8, v8, 0x1

    goto :goto_b

    :cond_3
    :goto_c
    add-int/2addr v3, v9

    goto/16 :goto_f

    :pswitch_14
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->p(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    :goto_d
    invoke-static {v4, v5, v4, v3}, Lph;->f(IIII)I

    move-result v3

    goto/16 :goto_f

    :pswitch_15
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->n(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto :goto_d

    :pswitch_16
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->g(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto :goto_d

    :pswitch_17
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->e(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto :goto_d

    :pswitch_18
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->c(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto :goto_d

    :pswitch_19
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->s(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto :goto_d

    :pswitch_1a
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    sget-object v5, Lnx;->a:Ljava/lang/Class;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto :goto_d

    :pswitch_1b
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->e(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto :goto_d

    :pswitch_1c
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->g(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto/16 :goto_d

    :pswitch_1d
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->i(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto/16 :goto_d

    :pswitch_1e
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->u(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto/16 :goto_d

    :pswitch_1f
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->k(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto/16 :goto_d

    :pswitch_20
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->e(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto/16 :goto_d

    :pswitch_21
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lnx;->g(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    goto/16 :goto_d

    :pswitch_22
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->o(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_23
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->m(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_24
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->f(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_25
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->d(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_26
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->b(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_27
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->r(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_28
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->a(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_29
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0, v2}, LMr;->p(I)Lmx;

    move-result-object v5

    invoke-static {v7, v4, v5}, Lnx;->l(ILjava/util/List;Lmx;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_2a
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->q(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_2b
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    sget-object v5, Lnx;->a:Ljava/lang/Class;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_4

    move v5, v1

    goto :goto_e

    :cond_4
    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    add-int/2addr v5, v11

    mul-int/2addr v5, v4

    :goto_e
    add-int/2addr v3, v5

    goto/16 :goto_f

    :pswitch_2c
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->d(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_2d
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->f(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_2e
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->h(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_2f
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->t(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_30
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->j(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_31
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->d(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_32
    invoke-static {p1, v8, v9}, LMr;->v(Lvj;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Lnx;->f(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_33
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LB;

    invoke-virtual {p0, v2}, LMr;->p(I)Lmx;

    move-result-object v5

    invoke-static {v7, v4, v5}, Lma;->N(ILB;Lmx;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_34
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    sget-object v5, LjD;->c:LiD;

    invoke-virtual {v5, v8, v9, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v7}, Lma;->Q(I)I

    move-result v7

    shl-long v8, v5, v11

    shr-long v4, v5, v4

    xor-long/2addr v4, v8

    invoke-static {v4, v5}, Lma;->S(J)I

    move-result v4

    goto/16 :goto_2

    :pswitch_35
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    shl-int/lit8 v6, v4, 0x1

    shr-int/lit8 v4, v4, 0x1f

    xor-int/2addr v4, v6

    invoke-static {v4}, Lma;->R(I)I

    move-result v4

    goto/16 :goto_3

    :pswitch_36
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :pswitch_37
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_5

    :pswitch_38
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    invoke-static {v4}, Lma;->O(I)I

    move-result v4

    goto/16 :goto_3

    :pswitch_39
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    invoke-static {v4}, Lma;->R(I)I

    move-result v4

    goto/16 :goto_3

    :pswitch_3a
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly6;

    invoke-static {v7, v4}, Lma;->J(ILy6;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_3b
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, LMr;->p(I)Lmx;

    move-result-object v5

    sget-object v6, Lnx;->a:Ljava/lang/Class;

    check-cast v4, LB;

    invoke-static {v7}, Lma;->Q(I)I

    move-result v6

    invoke-virtual {v4, v5}, LB;->b(Lmx;)I

    move-result v4

    goto/16 :goto_6

    :pswitch_3c
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ly6;

    if-eqz v5, :cond_5

    check-cast v4, Ly6;

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    invoke-virtual {v4}, Ly6;->size()I

    move-result v4

    goto/16 :goto_7

    :cond_5
    check-cast v4, Ljava/lang/String;

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    invoke-static {v4}, Lma;->P(Ljava/lang/String;)I

    move-result v4

    goto/16 :goto_8

    :pswitch_3d
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_9

    :pswitch_3e
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7}, Lma;->L(I)I

    move-result v4

    goto/16 :goto_1

    :pswitch_3f
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7}, Lma;->M(I)I

    move-result v4

    goto/16 :goto_1

    :pswitch_40
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->g(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v5

    invoke-static {v4}, Lma;->O(I)I

    move-result v4

    goto/16 :goto_3

    :pswitch_41
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v6

    invoke-static {v4, v5}, Lma;->S(J)I

    move-result v4

    goto/16 :goto_a

    :pswitch_42
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, LjD;->c:LiD;

    invoke-virtual {v4, v8, v9, p1}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v7}, Lma;->Q(I)I

    move-result v6

    invoke-static {v4, v5}, Lma;->S(J)I

    move-result v4

    goto/16 :goto_a

    :pswitch_43
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_5

    :pswitch_44
    invoke-virtual {p0, v2, p1}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    :goto_f
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, LMr;->m:LYC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lvj;->unknownFields:LXC;

    invoke-virtual {p1}, LXC;->b()I

    move-result p1

    add-int/2addr p1, v3

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final s(ILjava/lang/Object;)Z
    .locals 6

    add-int/lit8 v0, p1, 0x2

    iget-object v1, p0, LMr;->a:[I

    aget v0, v1, v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x1

    if-nez v4, :cond_2

    invoke-virtual {p0, p1}, LMr;->V(I)I

    move-result p1

    and-int v0, p1, v1

    int-to-long v0, v0

    invoke-static {p1}, LMr;->U(I)I

    move-result p1

    const-wide/16 v2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_1
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_2
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_3
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_4
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_5
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_6
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_7
    sget-object p1, Ly6;->b:Lx6;

    sget-object v2, LjD;->c:LiD;

    invoke-virtual {v2, v0, v1, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lx6;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :pswitch_8
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_9
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :cond_0
    instance-of p2, p1, Ly6;

    if-eqz p2, :cond_1

    sget-object p2, Ly6;->b:Lx6;

    invoke-virtual {p2, p1}, Lx6;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->c(JLjava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_b
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_c
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_d
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_e
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_f
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->h(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_10
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->f(JLjava/lang/Object;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_11
    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->e(JLjava/lang/Object;)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_2
    ushr-int/lit8 p1, v0, 0x14

    shl-int p1, v5, p1

    sget-object v0, LjD;->c:LiD;

    invoke-virtual {v0, v2, v3, p2}, LiD;->g(JLjava/lang/Object;)I

    move-result p2

    and-int/2addr p1, p2

    if-eqz p1, :cond_3

    :goto_0
    return v5

    :cond_3
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u(IILjava/lang/Object;)Z
    .locals 2

    add-int/lit8 p2, p2, 0x2

    iget-object v0, p0, LMr;->a:[I

    aget p2, v0, p2

    const v0, 0xfffff

    and-int/2addr p2, v0

    int-to-long v0, p2

    sget-object p2, LjD;->c:LiD;

    invoke-virtual {p2, v0, v1, p3}, LiD;->g(JLjava/lang/Object;)I

    move-result p2

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final w(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    invoke-virtual {p0, p1}, LMr;->V(I)I

    move-result p1

    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    sget-object p1, LjD;->c:LiD;

    invoke-virtual {p1, v0, v1, p2}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v2, p0, LMr;->n:Lsq;

    if-eqz p1, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v3, p1

    check-cast v3, Lrq;

    iget-boolean v3, v3, Lrq;->a:Z

    if-nez v3, :cond_1

    sget-object v3, Lrq;->b:Lrq;

    invoke-virtual {v3}, Lrq;->c()Lrq;

    move-result-object v3

    invoke-static {v3, p1}, Lsq;->b(Ljava/lang/Object;Ljava/lang/Object;)Lrq;

    invoke-static {v0, v1, p2, v3}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    move-object p1, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lrq;->b:Lrq;

    invoke-virtual {p1}, Lrq;->c()Lrq;

    move-result-object p1

    invoke-static {v0, v1, p2, p1}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lrq;

    invoke-static {p3}, LEy;->o(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final x(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    invoke-virtual {p0, p1, p3}, LMr;->s(ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LMr;->V(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    sget-object v2, LMr;->p:Lsun/misc/Unsafe;

    invoke-virtual {v2, p3, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, p1}, LMr;->p(I)Lmx;

    move-result-object p3

    invoke-virtual {p0, p1, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, LMr;->t(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2, p2, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Lmx;->j()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p3, v4, v3}, Lmx;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, p2}, LMr;->P(ILjava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LMr;->t(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p3}, Lmx;->j()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p3, v4, p1}, Lmx;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p1, v4

    :cond_3
    invoke-interface {p3, p1, v3}, Lmx;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Source subfield "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LMr;->a:[I

    aget p1, v1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final y(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, LMr;->a:[I

    aget v1, v0, p1

    invoke-virtual {p0, v1, p1, p3}, LMr;->u(IILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LMr;->V(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v2, v3

    int-to-long v2, v2

    sget-object v4, LMr;->p:Lsun/misc/Unsafe;

    invoke-virtual {v4, p3, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {p0, p1}, LMr;->p(I)Lmx;

    move-result-object p3

    invoke-virtual {p0, v1, p1, p2}, LMr;->u(IILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v5}, LMr;->t(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4, p2, v2, v3, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Lmx;->j()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3, v0, v5}, Lmx;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, p2, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, v1, p1, p2}, LMr;->Q(IILjava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {v4, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LMr;->t(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p3}, Lmx;->j()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3, v0, p1}, Lmx;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, p2, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p1, v0

    :cond_3
    invoke-interface {p3, p1, v5}, Lmx;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Source subfield "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget p1, v0, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final z(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p1}, LMr;->p(I)Lmx;

    move-result-object v0

    invoke-virtual {p0, p1}, LMr;->V(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {p0, p1, p2}, LMr;->s(ILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {v0}, Lmx;->j()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, LMr;->p:Lsun/misc/Unsafe;

    invoke-virtual {p1, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LMr;->t(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lmx;->j()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lmx;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method
