.class public abstract La/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/f;


# direct methods
.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;ZI)[B
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    new-instance v3, Lc/f;

    invoke-direct {v3}, Lc/f;-><init>()V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, -0x1

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v4, "short"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v8, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v4, "float"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v8, 0x7

    goto :goto_0

    :sswitch_2
    const-string v4, "boolean"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v8, 0x6

    goto :goto_0

    :sswitch_3
    const-string v4, "void"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v8, 0x5

    goto :goto_0

    :sswitch_4
    const-string v4, "long"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    const/4 v8, 0x4

    goto :goto_0

    :sswitch_5
    const-string v4, "char"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    const/4 v8, 0x3

    goto :goto_0

    :sswitch_6
    const-string v4, "byte"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_0

    :cond_6
    const/4 v8, 0x2

    goto :goto_0

    :sswitch_7
    const-string v4, "int"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto :goto_0

    :cond_7
    move v8, v5

    goto :goto_0

    :sswitch_8
    const-string v4, "double"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_0

    :cond_8
    move v8, v6

    :goto_0
    packed-switch v8, :pswitch_data_0

    const-string v4, "["

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-static/range {p0 .. p0}, Lc/j;->b(Ljava/lang/String;)Lc/j;

    move-result-object v0

    goto :goto_1

    :cond_9
    const-string v4, "."

    const-string v8, "/"

    invoke-virtual {v0, v4, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "L"

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ";"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc/j;->b(Ljava/lang/String;)Lc/j;

    move-result-object v0

    goto :goto_1

    :pswitch_0
    sget-object v0, Lc/j;->k:Lc/j;

    goto :goto_1

    :pswitch_1
    sget-object v0, Lc/j;->h:Lc/j;

    goto :goto_1

    :pswitch_2
    sget-object v0, Lc/j;->d:Lc/j;

    goto :goto_1

    :pswitch_3
    sget-object v0, Lc/j;->l:Lc/j;

    goto :goto_1

    :pswitch_4
    sget-object v0, Lc/j;->j:Lc/j;

    goto :goto_1

    :pswitch_5
    sget-object v0, Lc/j;->f:Lc/j;

    goto :goto_1

    :pswitch_6
    sget-object v0, Lc/j;->e:Lc/j;

    goto :goto_1

    :pswitch_7
    sget-object v0, Lc/j;->i:Lc/j;

    goto :goto_1

    :pswitch_8
    sget-object v0, Lc/j;->g:Lc/j;

    :goto_1
    sget-object v4, Lc/j;->m:Lc/j;

    new-array v8, v6, [Lc/j;

    invoke-virtual {v3, v0, v4, v8}, Lc/f;->b(Lc/j;Lc/j;[Lc/j;)V

    const-class v4, [Ljava/lang/Object;

    invoke-static {v4}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v4

    array-length v8, v2

    new-array v8, v8, [Lc/j;

    move v9, v6

    :goto_2
    array-length v10, v2

    if-ge v9, v10, :cond_b

    aget-object v10, v2, v9

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, La/b;->j(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_a

    aget-object v10, v2, v9

    invoke-static {v10}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v10

    aput-object v10, v8, v9

    goto :goto_3

    :cond_a
    sget-object v10, Lc/j;->m:Lc/j;

    aput-object v10, v8, v9

    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_b
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, La/b;->j(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-static/range {p2 .. p2}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v9

    goto :goto_4

    :cond_c
    sget-object v9, Lc/j;->m:Lc/j;

    :goto_4
    move-object/from16 v10, p1

    invoke-virtual {v0, v9, v10, v8}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v10

    if-eqz p4, :cond_d

    const/16 v11, 0x9

    invoke-virtual {v3, v10, v11}, Lc/f;->a(Lc/i;I)Lc/a;

    move-result-object v10

    goto :goto_5

    :cond_d
    invoke-virtual {v3, v10, v5}, Lc/f;->a(Lc/i;I)Lc/a;

    move-result-object v10

    :goto_5
    sget-object v11, Lc/j;->i:Lc/j;

    invoke-virtual {v10, v11}, Lc/a;->n(Lc/j;)Lc/h;

    move-result-object v11

    sget-object v12, Lc/j;->m:Lc/j;

    invoke-virtual {v10, v12}, Lc/a;->n(Lc/j;)Lc/h;

    move-result-object v13

    invoke-virtual {v10, v4}, Lc/a;->n(Lc/j;)Lc/h;

    move-result-object v14

    invoke-virtual {v10, v9}, Lc/a;->n(Lc/j;)Lc/h;

    move-result-object v15

    invoke-virtual {v10, v12}, Lc/a;->n(Lc/j;)Lc/h;

    move-result-object v12

    array-length v5, v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v10, v11, v5}, Lc/a;->k(Lc/h;Ljava/lang/Integer;)V

    invoke-virtual {v10, v14, v11}, Lc/a;->m(Lc/h;Lc/h;)V

    move v5, v6

    :goto_6
    array-length v6, v2

    const-class v16, Ljava/lang/Short;

    const-class v17, Ljava/lang/Double;

    const-class v18, Ljava/lang/Character;

    const-class v19, Ljava/lang/Boolean;

    const-class v20, Ljava/lang/Byte;

    const-class v21, Ljava/lang/Float;

    const-class v22, Ljava/lang/Long;

    const-class v23, Ljava/lang/Integer;

    if-ge v5, v6, :cond_17

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v10, v11, v6}, Lc/a;->k(Lc/h;Ljava/lang/Integer;)V

    aget-object v6, v2, v5

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, La/b;->j(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_16

    aget-object v6, v2, v5

    move-object/from16 v24, v3

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v6, "valueOf"

    if-eqz v3, :cond_e

    invoke-static/range {v23 .. v23}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v3

    move-object/from16 p0, v8

    invoke-static/range {v23 .. v23}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v8

    move-object/from16 v25, v9

    sget-object v9, Lc/j;->i:Lc/j;

    move-object/from16 v26, v7

    filled-new-array {v9}, [Lc/j;

    move-result-object v7

    invoke-virtual {v3, v8, v6, v7}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    invoke-virtual {v10, v5, v9}, Lc/a;->e(ILc/j;)Lc/h;

    move-result-object v6

    filled-new-array {v6}, [Lc/h;

    move-result-object v6

    invoke-virtual {v10, v3, v13, v6}, Lc/a;->i(Lc/i;Lc/h;[Lc/h;)V

    goto/16 :goto_7

    :cond_e
    move-object/from16 v26, v7

    move-object/from16 p0, v8

    move-object/from16 v25, v9

    aget-object v3, v2, v5

    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-static/range {v22 .. v22}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v3

    invoke-static/range {v22 .. v22}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v7

    sget-object v8, Lc/j;->j:Lc/j;

    filled-new-array {v8}, [Lc/j;

    move-result-object v9

    invoke-virtual {v3, v7, v6, v9}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    invoke-virtual {v10, v5, v8}, Lc/a;->e(ILc/j;)Lc/h;

    move-result-object v6

    filled-new-array {v6}, [Lc/h;

    move-result-object v6

    invoke-virtual {v10, v3, v13, v6}, Lc/a;->i(Lc/i;Lc/h;[Lc/h;)V

    goto/16 :goto_7

    :cond_f
    aget-object v3, v2, v5

    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-static/range {v21 .. v21}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v3

    invoke-static/range {v21 .. v21}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v7

    sget-object v8, Lc/j;->h:Lc/j;

    filled-new-array {v8}, [Lc/j;

    move-result-object v9

    invoke-virtual {v3, v7, v6, v9}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    invoke-virtual {v10, v5, v8}, Lc/a;->e(ILc/j;)Lc/h;

    move-result-object v6

    filled-new-array {v6}, [Lc/h;

    move-result-object v6

    invoke-virtual {v10, v3, v13, v6}, Lc/a;->i(Lc/i;Lc/h;[Lc/h;)V

    goto/16 :goto_7

    :cond_10
    aget-object v3, v2, v5

    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static/range {v19 .. v19}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v3

    invoke-static/range {v19 .. v19}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v7

    sget-object v8, Lc/j;->d:Lc/j;

    filled-new-array {v8}, [Lc/j;

    move-result-object v9

    invoke-virtual {v3, v7, v6, v9}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    invoke-virtual {v10, v5, v8}, Lc/a;->e(ILc/j;)Lc/h;

    move-result-object v6

    filled-new-array {v6}, [Lc/h;

    move-result-object v6

    invoke-virtual {v10, v3, v13, v6}, Lc/a;->i(Lc/i;Lc/h;[Lc/h;)V

    goto/16 :goto_7

    :cond_11
    aget-object v3, v2, v5

    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static/range {v17 .. v17}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v3

    invoke-static/range {v17 .. v17}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v7

    sget-object v8, Lc/j;->g:Lc/j;

    filled-new-array {v8}, [Lc/j;

    move-result-object v9

    invoke-virtual {v3, v7, v6, v9}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    invoke-virtual {v10, v5, v8}, Lc/a;->e(ILc/j;)Lc/h;

    move-result-object v6

    filled-new-array {v6}, [Lc/h;

    move-result-object v6

    invoke-virtual {v10, v3, v13, v6}, Lc/a;->i(Lc/i;Lc/h;[Lc/h;)V

    goto/16 :goto_7

    :cond_12
    aget-object v3, v2, v5

    sget-object v7, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-static/range {v20 .. v20}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v3

    invoke-static/range {v20 .. v20}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v7

    sget-object v8, Lc/j;->e:Lc/j;

    filled-new-array {v8}, [Lc/j;

    move-result-object v9

    invoke-virtual {v3, v7, v6, v9}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    invoke-virtual {v10, v5, v8}, Lc/a;->e(ILc/j;)Lc/h;

    move-result-object v6

    filled-new-array {v6}, [Lc/h;

    move-result-object v6

    invoke-virtual {v10, v3, v13, v6}, Lc/a;->i(Lc/i;Lc/h;[Lc/h;)V

    goto :goto_7

    :cond_13
    aget-object v3, v2, v5

    sget-object v7, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-static/range {v18 .. v18}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v3

    invoke-static/range {v18 .. v18}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v7

    sget-object v8, Lc/j;->f:Lc/j;

    filled-new-array {v8}, [Lc/j;

    move-result-object v9

    invoke-virtual {v3, v7, v6, v9}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    invoke-virtual {v10, v5, v8}, Lc/a;->e(ILc/j;)Lc/h;

    move-result-object v6

    filled-new-array {v6}, [Lc/h;

    move-result-object v6

    invoke-virtual {v10, v3, v13, v6}, Lc/a;->i(Lc/i;Lc/h;[Lc/h;)V

    goto :goto_7

    :cond_14
    aget-object v3, v2, v5

    sget-object v7, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-static/range {v16 .. v16}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v3

    invoke-static/range {v16 .. v16}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v7

    sget-object v8, Lc/j;->k:Lc/j;

    filled-new-array {v8}, [Lc/j;

    move-result-object v9

    invoke-virtual {v3, v7, v6, v9}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    invoke-virtual {v10, v5, v8}, Lc/a;->e(ILc/j;)Lc/h;

    move-result-object v6

    filled-new-array {v6}, [Lc/h;

    move-result-object v6

    invoke-virtual {v10, v3, v13, v6}, Lc/a;->i(Lc/i;Lc/h;[Lc/h;)V

    :cond_15
    :goto_7
    invoke-virtual {v10, v14, v11, v13}, Lc/a;->b(Lc/h;Lc/h;Lc/h;)V

    goto :goto_8

    :cond_16
    move-object/from16 v24, v3

    move-object/from16 v26, v7

    move-object/from16 p0, v8

    move-object/from16 v25, v9

    sget-object v3, Lc/j;->m:Lc/j;

    invoke-virtual {v10, v5, v3}, Lc/a;->e(ILc/j;)Lc/h;

    move-result-object v3

    invoke-virtual {v10, v14, v11, v3}, Lc/a;->b(Lc/h;Lc/h;Lc/h;)V

    :goto_8
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v8, p0

    move-object/from16 v3, v24

    move-object/from16 v9, v25

    move-object/from16 v7, v26

    goto/16 :goto_6

    :cond_17
    move-object/from16 v24, v3

    move-object/from16 v26, v7

    move-object/from16 p0, v8

    move-object/from16 v25, v9

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v10, v11, v2}, Lc/a;->k(Lc/h;Ljava/lang/Integer;)V

    const/4 v2, 0x0

    const-string v3, "doCall"

    const-string v5, "Lcom/shooker/ReplaceCallback;"

    if-eqz p4, :cond_18

    invoke-virtual {v10, v15, v2}, Lc/a;->k(Lc/h;Ljava/lang/Integer;)V

    invoke-static {v5}, Lc/j;->b(Ljava/lang/String;)Lc/j;

    move-result-object v5

    sget-object v6, Lc/j;->m:Lc/j;

    sget-object v7, Lc/j;->i:Lc/j;

    filled-new-array {v7, v6, v4}, [Lc/j;

    move-result-object v4

    invoke-virtual {v5, v6, v3, v4}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    filled-new-array {v11, v15, v14}, [Lc/h;

    move-result-object v4

    invoke-virtual {v10, v3, v12, v4}, Lc/a;->i(Lc/i;Lc/h;[Lc/h;)V

    goto :goto_9

    :cond_18
    invoke-static {v5}, Lc/j;->b(Ljava/lang/String;)Lc/j;

    move-result-object v5

    sget-object v6, Lc/j;->m:Lc/j;

    sget-object v7, Lc/j;->i:Lc/j;

    filled-new-array {v7, v6, v4}, [Lc/j;

    move-result-object v4

    invoke-virtual {v5, v6, v3, v4}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    invoke-virtual {v10, v0}, Lc/a;->f(Lc/j;)Lc/h;

    move-result-object v4

    filled-new-array {v11, v4, v14}, [Lc/h;

    move-result-object v4

    invoke-virtual {v10, v3, v12, v4}, Lc/a;->i(Lc/i;Lc/h;[Lc/h;)V

    :goto_9
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-virtual {v10}, Lc/a;->q()V

    move-object/from16 v3, v26

    goto/16 :goto_c

    :cond_19
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "double"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_22

    const-string v4, "int"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_21

    const-string v4, "byte"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_20

    const-string v4, "char"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1f

    const-string v4, "long"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    const-string v4, "void"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    const-string v4, "boolean"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c

    const-string v4, "float"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    const-string v4, "short"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1a

    invoke-virtual {v10, v15, v12}, Lc/a;->c(Lc/h;Lc/h;)V

    goto :goto_a

    :cond_1a
    invoke-static/range {v16 .. v16}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v3

    sget-object v4, Lc/j;->k:Lc/j;

    const-string v5, "shortValue"

    const/4 v6, 0x0

    new-array v7, v6, [Lc/j;

    invoke-virtual {v3, v4, v5, v7}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    new-array v4, v6, [Lc/h;

    invoke-virtual {v10, v3, v15, v12, v4}, Lc/a;->j(Lc/i;Lc/h;Lc/h;[Lc/h;)V

    goto :goto_a

    :cond_1b
    const/4 v6, 0x0

    invoke-static/range {v21 .. v21}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v3

    sget-object v4, Lc/j;->h:Lc/j;

    const-string v5, "floatValue"

    new-array v7, v6, [Lc/j;

    invoke-virtual {v3, v4, v5, v7}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    new-array v4, v6, [Lc/h;

    invoke-virtual {v10, v3, v15, v12, v4}, Lc/a;->j(Lc/i;Lc/h;Lc/h;[Lc/h;)V

    goto :goto_a

    :cond_1c
    const/4 v6, 0x0

    invoke-static/range {v19 .. v19}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v3

    sget-object v4, Lc/j;->d:Lc/j;

    const-string v5, "booleanValue"

    new-array v7, v6, [Lc/j;

    invoke-virtual {v3, v4, v5, v7}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v3

    new-array v4, v6, [Lc/h;

    invoke-virtual {v10, v3, v15, v12, v4}, Lc/a;->j(Lc/i;Lc/h;Lc/h;[Lc/h;)V

    :goto_a
    move-object/from16 v3, v26

    goto/16 :goto_b

    :cond_1d
    move-object/from16 v3, v26

    invoke-virtual {v10, v15, v3}, Lc/a;->k(Lc/h;Ljava/lang/Integer;)V

    goto/16 :goto_b

    :cond_1e
    move-object/from16 v3, v26

    const/4 v6, 0x0

    invoke-static/range {v22 .. v22}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v4

    sget-object v5, Lc/j;->j:Lc/j;

    const-string v7, "longValue"

    new-array v8, v6, [Lc/j;

    invoke-virtual {v4, v5, v7, v8}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v4

    new-array v5, v6, [Lc/h;

    invoke-virtual {v10, v4, v15, v12, v5}, Lc/a;->j(Lc/i;Lc/h;Lc/h;[Lc/h;)V

    goto :goto_b

    :cond_1f
    move-object/from16 v3, v26

    const/4 v6, 0x0

    invoke-static/range {v18 .. v18}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v4

    sget-object v5, Lc/j;->f:Lc/j;

    const-string v7, "charValue"

    new-array v8, v6, [Lc/j;

    invoke-virtual {v4, v5, v7, v8}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v4

    new-array v5, v6, [Lc/h;

    invoke-virtual {v10, v4, v15, v12, v5}, Lc/a;->j(Lc/i;Lc/h;Lc/h;[Lc/h;)V

    goto :goto_b

    :cond_20
    move-object/from16 v3, v26

    const/4 v6, 0x0

    invoke-static/range {v20 .. v20}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v4

    sget-object v5, Lc/j;->e:Lc/j;

    const-string v7, "byteValue"

    new-array v8, v6, [Lc/j;

    invoke-virtual {v4, v5, v7, v8}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v4

    new-array v5, v6, [Lc/h;

    invoke-virtual {v10, v4, v15, v12, v5}, Lc/a;->j(Lc/i;Lc/h;Lc/h;[Lc/h;)V

    goto :goto_b

    :cond_21
    move-object/from16 v3, v26

    const/4 v6, 0x0

    invoke-static/range {v23 .. v23}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v4

    sget-object v5, Lc/j;->i:Lc/j;

    const-string v7, "intValue"

    new-array v8, v6, [Lc/j;

    invoke-virtual {v4, v5, v7, v8}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v4

    new-array v5, v6, [Lc/h;

    invoke-virtual {v10, v4, v15, v12, v5}, Lc/a;->j(Lc/i;Lc/h;Lc/h;[Lc/h;)V

    goto :goto_b

    :cond_22
    move-object/from16 v3, v26

    const/4 v6, 0x0

    invoke-static/range {v17 .. v17}, Lc/j;->a(Ljava/lang/Class;)Lc/j;

    move-result-object v4

    sget-object v5, Lc/j;->g:Lc/j;

    const-string v7, "doubleValue"

    new-array v8, v6, [Lc/j;

    invoke-virtual {v4, v5, v7, v8}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v4

    new-array v5, v6, [Lc/h;

    invoke-virtual {v10, v4, v15, v12, v5}, Lc/a;->j(Lc/i;Lc/h;Lc/h;[Lc/h;)V

    :goto_b
    invoke-virtual {v10, v15}, Lc/a;->p(Lc/h;)V

    :goto_c
    const-string v4, "backup"

    move-object/from16 v5, p0

    move-object/from16 v9, v25

    invoke-virtual {v0, v9, v4, v5}, Lc/j;->c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;

    move-result-object v0

    move-object/from16 v4, v24

    const/4 v5, 0x1

    invoke-virtual {v4, v0, v5}, Lc/f;->a(Lc/i;I)Lc/a;

    move-result-object v0

    invoke-virtual {v0, v9}, Lc/a;->n(Lc/j;)Lc/h;

    move-result-object v5

    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    invoke-virtual {v0}, Lc/a;->q()V

    goto :goto_e

    :cond_23
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-virtual {v0, v5, v3}, Lc/a;->k(Lc/h;Ljava/lang/Integer;)V

    goto :goto_d

    :cond_24
    invoke-virtual {v0, v5, v2}, Lc/a;->k(Lc/h;Ljava/lang/Integer;)V

    :goto_d
    invoke-virtual {v0, v5}, Lc/a;->p(Lc/h;)V

    :goto_e
    invoke-virtual {v4}, Lc/f;->c()[B

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static f(I)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x7631

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, La/b;->i(III)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g([II)Z
    .locals 2

    shr-int/lit8 v0, p1, 0x5

    and-int/lit8 p1, p1, 0x1f

    const/4 v1, 0x1

    shl-int p1, v1, p1

    aget p0, p0, v0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, Lfun/box001/shared/Env;->process_name:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "4cd6974be1_10096_null_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lfun/box001/shared/Env;->data_dir:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/files/mmkv\u200b/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static i(III)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    not-int v1, p1

    and-int/2addr v1, p0

    and-int/2addr p0, p1

    and-int/lit8 p1, p0, 0x1

    if-eqz p1, :cond_0

    const-string p1, "|public"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    and-int/lit8 p1, p0, 0x2

    if-eqz p1, :cond_1

    const-string p1, "|private"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    and-int/lit8 p1, p0, 0x4

    if-eqz p1, :cond_2

    const-string p1, "|protected"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    and-int/lit8 p1, p0, 0x8

    if-eqz p1, :cond_3

    const-string p1, "|static"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    and-int/lit8 p1, p0, 0x10

    if-eqz p1, :cond_4

    const-string p1, "|final"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    and-int/lit8 p1, p0, 0x20

    const/4 v2, 0x1

    if-eqz p1, :cond_6

    if-ne p2, v2, :cond_5

    const-string p1, "|super"

    goto :goto_0

    :cond_5
    const-string p1, "|synchronized"

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    and-int/lit8 p1, p0, 0x40

    const/4 v3, 0x3

    if-eqz p1, :cond_8

    if-ne p2, v3, :cond_7

    const-string p1, "|bridge"

    goto :goto_1

    :cond_7
    const-string p1, "|volatile"

    :goto_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    and-int/lit16 p1, p0, 0x80

    if-eqz p1, :cond_a

    if-ne p2, v3, :cond_9

    const-string p1, "|varargs"

    goto :goto_2

    :cond_9
    const-string p1, "|transient"

    :goto_2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    and-int/lit16 p1, p0, 0x100

    if-eqz p1, :cond_b

    const-string p1, "|native"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    and-int/lit16 p1, p0, 0x200

    if-eqz p1, :cond_c

    const-string p1, "|interface"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_c
    and-int/lit16 p1, p0, 0x400

    if-eqz p1, :cond_d

    const-string p1, "|abstract"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_d
    and-int/lit16 p1, p0, 0x800

    if-eqz p1, :cond_e

    const-string p1, "|strictfp"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_e
    and-int/lit16 p1, p0, 0x1000

    if-eqz p1, :cond_f

    const-string p1, "|synthetic"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_f
    and-int/lit16 p1, p0, 0x2000

    if-eqz p1, :cond_10

    const-string p1, "|annotation"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_10
    and-int/lit16 p1, p0, 0x4000

    if-eqz p1, :cond_11

    const-string p1, "|enum"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_11
    const/high16 p1, 0x10000

    and-int/2addr p1, p0

    if-eqz p1, :cond_12

    const-string p1, "|constructor"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_12
    const/high16 p1, 0x20000

    and-int/2addr p0, p1

    if-eqz p0, :cond_13

    const-string p0, "|declared_synchronized"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_13
    if-nez v1, :cond_14

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-nez p0, :cond_15

    :cond_14
    const/16 p0, 0x7c

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v1}, La/b;->q(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_15
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static j(Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "short"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "float"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_2
    const-string v0, "boolean"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_3
    const-string v0, "void"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_4
    const-string v0, "long"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_5
    const-string v0, "char"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_6
    const-string v0, "byte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_7
    const-string v0, "int"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    move v3, v1

    goto :goto_0

    :sswitch_8
    const-string v0, "double"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    move v3, v2

    :goto_0
    packed-switch v3, :pswitch_data_0

    return v2

    :pswitch_0
    return v1

    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static k(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-ge p0, v1, :cond_0

    return v0

    :cond_0
    const/4 v2, 0x1

    if-ne p0, v1, :cond_1

    return v2

    :cond_1
    and-int/lit16 v1, p0, 0xff

    if-eqz v1, :cond_4

    const/16 v3, 0xff

    if-ne v1, v3, :cond_2

    goto :goto_0

    :cond_2
    const v1, 0xff00

    and-int/2addr p0, v1

    if-nez p0, :cond_3

    move v0, v2

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v2
.end method

.method public static l()V
    .locals 3

    sget-object v0, Lfun/box001/shared/Env;->module_path:Ljava/lang/String;

    const-string v1, "lib/arm64-v8a/libloader.so"

    invoke-static {v0, v1}, Lfun/box001/loader/utils/FileUtils;->readZipEntry(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v0

    const-string v1, "fun_loader"

    invoke-static {v1}, La/b;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lfun/box001/loader/utils/FileUtils;->d(Ljava/lang/String;[B)V

    invoke-static {v1}, La/b;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    return-void
.end method

.method public static m(I)Ljava/lang/String;
    .locals 2

    const v0, 0x31dff

    const/4 v1, 0x3

    invoke-static {p0, v0, v1}, La/b;->i(III)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static o()V
    .locals 3

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lfun/box001/shared/Env;->data_dir:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/files/mmkv\u200b"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    const-string v0, "app.bin"

    invoke-static {v0}, La/b;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfun/box001/loader/utils/FileUtils;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lfun/box001/shared/Env;->module_core_path:Ljava/lang/String;

    invoke-static {v2}, Lfun/box001/loader/utils/FileUtils;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    sget-object v1, Lfun/box001/shared/Env;->module_core_path:Ljava/lang/String;

    invoke-static {v1, v0}, Lfun/box001/loader/utils/FileUtils;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    sput-boolean v0, Lfun/box001/shared/Env;->isHotLoading:Z

    return-void
.end method

.method public static p(I)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x2

    new-array v1, v0, [C

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    rsub-int/lit8 v3, v2, 0x1

    and-int/lit8 v4, p0, 0xf

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    move-result v4

    aput-char v4, v1, v3

    shr-int/lit8 p0, p0, 0x4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static q(I)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x4

    new-array v1, v0, [C

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    rsub-int/lit8 v3, v2, 0x3

    and-int/lit8 v4, p0, 0xf

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    move-result v4

    aput-char v4, v1, v3

    shr-int/2addr p0, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static r(I)Ljava/lang/String;
    .locals 1

    int-to-char v0, p0

    if-ne p0, v0, :cond_0

    invoke-static {p0}, La/b;->q(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, La/b;->s(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static s(I)Ljava/lang/String;
    .locals 6

    const/16 v0, 0x8

    new-array v1, v0, [C

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    rsub-int/lit8 v3, v2, 0x7

    and-int/lit8 v4, p0, 0xf

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    move-result v4

    aput-char v4, v1, v3

    shr-int/lit8 p0, p0, 0x4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static t(J)Ljava/lang/String;
    .locals 5

    const/16 v0, 0x10

    new-array v1, v0, [C

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    rsub-int/lit8 v3, v2, 0xf

    long-to-int v4, p0

    and-int/lit8 v4, v4, 0xf

    invoke-static {v4, v0}, Ljava/lang/Character;->forDigit(II)C

    move-result v4

    aput-char v4, v1, v3

    const/4 v3, 0x4

    shr-long/2addr p0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static u(I)I
    .locals 1

    shr-int/lit8 p0, p0, 0x7

    const/4 v0, 0x0

    :goto_0
    if-eqz p0, :cond_0

    shr-int/lit8 p0, p0, 0x7

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static v(Ln/a;IJ)V
    .locals 2

    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x40

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x7

    shr-int/lit8 v0, v0, 0x3

    mul-int/lit8 v1, v0, 0x8

    rsub-int/lit8 v1, v1, 0x40

    shr-long/2addr p2, v1

    add-int/lit8 v1, v0, -0x1

    shl-int/lit8 v1, v1, 0x5

    or-int/2addr p1, v1

    check-cast p0, Ln/d;

    invoke-virtual {p0, p1}, Ln/d;->p(I)V

    :goto_0
    if-lez v0, :cond_1

    long-to-int p1, p2

    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Ln/d;->p(I)V

    const/16 p1, 0x8

    shr-long/2addr p2, p1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static w(Ln/a;IJ)V
    .locals 2

    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x40

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x7

    shr-int/lit8 v0, v0, 0x3

    add-int/lit8 v1, v0, -0x1

    shl-int/lit8 v1, v1, 0x5

    or-int/2addr p1, v1

    check-cast p0, Ln/d;

    invoke-virtual {p0, p1}, Ln/d;->p(I)V

    :goto_0
    if-lez v0, :cond_1

    long-to-int p1, p2

    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Ln/d;->p(I)V

    const/16 p1, 0x8

    shr-long/2addr p2, p1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lj/u;)V
    .locals 0

    return-void
.end method

.method public c(Lj/j;)V
    .locals 0

    return-void
.end method

.method public d(Lj/t;)V
    .locals 0

    return-void
.end method

.method public abstract n(Lo/a;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
