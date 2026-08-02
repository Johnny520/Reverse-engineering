.class public final synthetic Lwt0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lwt0;->h:I

    iput-object p2, p0, Lwt0;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkl1;Ljl1;)V
    .locals 0

    .line 1
    const/4 p2, 0x5

    .line 2
    iput p2, p0, Lwt0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwt0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    move-object/from16 v0, p0

    iget v1, v0, Lwt0;->h:I

    const/16 v2, 0x12

    const/16 v3, 0xc

    const/16 v4, 0xe

    sget-object v5, Lrh1;->a:Lrh1;

    const/4 v6, 0x2

    sget-object v7, Lnx;->a:Leb;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v10, 0x1

    sget-object v11, La83;->a:La83;

    const/4 v12, 0x0

    iget-object v0, v0, Lwt0;->i:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v0, Lb03;

    move-object/from16 v1, p1

    check-cast v1, Luh1;

    move-object/from16 v2, p2

    check-cast v2, Lpx;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    check-cast v2, Lgo0;

    const v3, 0x760d4197

    invoke-virtual {v2, v3}, Lgo0;->W(I)V

    .line 2
    sget-object v3, Lly;->h:Ltu2;

    .line 3
    invoke-virtual {v2, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v3

    .line 4
    check-cast v3, Le70;

    .line 5
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_0

    .line 6
    new-instance v4, Lh11;

    const-wide/16 v5, 0x0

    invoke-direct {v4, v5, v6}, Lh11;-><init>(J)V

    .line 7
    invoke-static {v4}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    move-result-object v4

    .line 8
    invoke-virtual {v2, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 9
    :cond_0
    check-cast v4, Lxk1;

    .line 10
    invoke-virtual {v2, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v5

    .line 11
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1

    if-ne v6, v7, :cond_2

    .line 12
    :cond_1
    new-instance v6, Le03;

    invoke-direct {v6, v10, v0, v4}, Le03;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    invoke-virtual {v2, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 14
    :cond_2
    check-cast v6, Lxm0;

    .line 15
    invoke-virtual {v2, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v0

    .line 16
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_3

    if-ne v5, v7, :cond_4

    .line 17
    :cond_3
    new-instance v5, Lf03;

    invoke-direct {v5, v3, v4, v12}, Lf03;-><init>(Le70;Lxk1;I)V

    .line 18
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 19
    :cond_4
    check-cast v5, Lin0;

    .line 20
    sget-object v0, Lin2;->a:Lkd;

    .line 21
    new-instance v0, Lx;

    const/16 v3, 0xb

    invoke-direct {v0, v6, v5, v3}, Lx;-><init>(Lxm0;Lun0;I)V

    invoke-static {v1, v0}, Ltl;->s(Luh1;Lnn0;)Luh1;

    move-result-object v0

    .line 22
    invoke-virtual {v2, v12}, Lgo0;->p(Z)V

    return-object v0

    .line 23
    :pswitch_0
    check-cast v0, Loz2;

    move-object/from16 v1, p1

    check-cast v1, Luh1;

    move-object/from16 v1, p2

    check-cast v1, Lpx;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    check-cast v1, Lgo0;

    const v2, -0x620472b

    invoke-virtual {v1, v2}, Lgo0;->W(I)V

    .line 25
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_5

    .line 26
    invoke-static {v1}, Leu;->C(Lpx;)Lj20;

    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 28
    :cond_5
    check-cast v2, Lj20;

    .line 29
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_6

    .line 30
    invoke-static {v9}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    move-result-object v3

    .line 31
    invoke-virtual {v1, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 32
    :cond_6
    check-cast v3, Lxk1;

    .line 33
    invoke-static {v0, v1}, Lop0;->x(Ljava/lang/Object;Lpx;)Lxk1;

    move-result-object v0

    .line 34
    invoke-virtual {v1, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v4

    .line 35
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_7

    if-ne v6, v7, :cond_8

    .line 36
    :cond_7
    new-instance v6, Lpr;

    const/16 v4, 0x17

    invoke-direct {v6, v3, v4}, Lpr;-><init>(Lxk1;I)V

    .line 37
    invoke-virtual {v1, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 38
    :cond_8
    check-cast v6, Lin0;

    invoke-static {v9, v6, v1}, Leu;->c(Ljava/lang/Object;Lin0;Lpx;)V

    .line 39
    invoke-virtual {v1, v2}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v1, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    .line 40
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_9

    if-ne v6, v7, :cond_a

    .line 41
    :cond_9
    new-instance v6, Lw13;

    invoke-direct {v6, v2, v3, v0}, Lw13;-><init>(Lj20;Lxk1;Lxk1;)V

    .line 42
    invoke-virtual {v1, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 43
    :cond_a
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v5, v9, v6}, Lvw2;->a(Luh1;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Luh1;

    move-result-object v0

    .line 44
    invoke-virtual {v1, v12}, Lgo0;->p(Z)V

    return-object v0

    .line 45
    :pswitch_1
    check-cast v0, Ldo2;

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    move-object/from16 v1, p2

    check-cast v1, La83;

    move-object/from16 v1, p3

    check-cast v1, La20;

    .line 46
    invoke-virtual {v0}, Ldo2;->b()V

    return-object v11

    .line 47
    :pswitch_2
    check-cast v0, Landroid/content/Context;

    move-object/from16 v1, p1

    check-cast v1, Lo71;

    move-object/from16 v2, p2

    check-cast v2, Lpx;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit8 v1, v3, 0x11

    if-eq v1, v8, :cond_b

    move v12, v10

    :cond_b
    and-int/lit8 v1, v3, 0x1

    check-cast v2, Lgo0;

    invoke-virtual {v2, v1, v12}, Lgo0;->O(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    const v1, 0x790b0219

    .line 48
    invoke-static {v1, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    move-result-object v14

    new-instance v1, Ls9;

    invoke-direct {v1, v8, v0}, Ls9;-><init>(ILjava/lang/Object;)V

    const v0, -0x36fab240    # -546012.0f

    invoke-static {v0, v1, v2}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    move-result-object v15

    const/16 v17, 0x180

    const/16 v18, 0x1

    const/4 v13, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v13 .. v18}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    goto :goto_0

    :cond_c
    move-object/from16 v16, v2

    .line 49
    invoke-virtual/range {v16 .. v16}, Lgo0;->R()V

    :goto_0
    return-object v11

    .line 50
    :pswitch_3
    check-cast v0, Lvy1;

    move-object/from16 v1, p1

    check-cast v1, Lbv;

    move-object/from16 v7, p2

    check-cast v7, Lpx;

    move-object/from16 v13, p3

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit8 v1, v13, 0x11

    if-eq v1, v8, :cond_d

    move v1, v10

    goto :goto_1

    :cond_d
    move v1, v12

    :goto_1
    and-int/lit8 v8, v13, 0x1

    check-cast v7, Lgo0;

    invoke-virtual {v7, v8, v1}, Lgo0;->O(IZ)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 52
    iget-object v1, v0, Lvy1;->b:Ljava/lang/String;

    .line 53
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v8, 0x790b01ec

    .line 54
    invoke-static {v8, v1, v7}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    move-result-object v1

    .line 55
    invoke-static {v1, v9, v7, v12, v6}, Lqp0;->e(Ljava/lang/String;Luh1;Lpx;II)V

    const/high16 v1, 0x41400000    # 12.0f

    .line 56
    invoke-static {v5, v1}, Lte;->O(Luh1;F)Luh1;

    move-result-object v1

    invoke-static {v7, v1}, Lrp0;->O(Lpx;Luh1;)V

    .line 57
    iget-object v0, v0, Lvy1;->c:Ljava/util/List;

    .line 58
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v1, v12

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v8, v1, 0x1

    if-ltz v1, :cond_10

    check-cast v6, Lgq1;

    if-lez v1, :cond_e

    const v1, 0x34626494

    .line 59
    invoke-virtual {v7, v1}, Lgo0;->W(I)V

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v5, v1}, Lte;->O(Luh1;F)Luh1;

    move-result-object v1

    invoke-static {v7, v1}, Lrp0;->O(Lpx;Luh1;)V

    .line 60
    :goto_3
    invoke-virtual {v7, v12}, Lgo0;->p(Z)V

    goto :goto_4

    :cond_e
    const v1, 0x57eac7d7

    .line 61
    invoke-virtual {v7, v1}, Lgo0;->W(I)V

    goto :goto_3

    .line 62
    :goto_4
    iget-object v13, v6, Lgq1;->b:Ljava/lang/String;

    .line 63
    sget-object v1, Lur1;->a:Ltu2;

    .line 64
    invoke-virtual {v7, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v10

    .line 65
    check-cast v10, Llp1;

    .line 66
    iget-wide v14, v10, Llp1;->e:J

    .line 67
    invoke-static {v4}, Lrg3;->D(I)J

    move-result-wide v17

    const/16 v10, 0x14

    .line 68
    invoke-static {v10}, Lrg3;->D(I)J

    move-result-wide v22

    .line 69
    sget-object v19, Lim0;->l:Lim0;

    const/16 v31, 0x30

    const v32, 0x3f7aa

    move-wide v15, v14

    const/4 v14, 0x0

    const-wide/16 v20, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const v30, 0x186000

    move-object/from16 v29, v7

    .line 70
    invoke-static/range {v13 .. v32}, Lv03;->b(Ljava/lang/String;Luh1;JJLim0;JJIZIILm13;Lpx;III)V

    .line 71
    iget-object v6, v6, Lgq1;->c:Ljava/lang/String;

    if-nez v6, :cond_f

    const v6, 0x34629745

    .line 72
    invoke-virtual {v7, v6}, Lgo0;->W(I)V

    const v6, 0x790b0208

    invoke-static {v6, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    move-result-object v6

    .line 73
    :goto_5
    invoke-virtual {v7, v12}, Lgo0;->p(Z)V

    move-object v13, v6

    goto :goto_6

    :cond_f
    const v10, 0x3462922f

    .line 74
    invoke-virtual {v7, v10}, Lgo0;->W(I)V

    goto :goto_5

    .line 75
    :goto_6
    invoke-virtual {v7, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v1

    .line 76
    check-cast v1, Llp1;

    .line 77
    iget-wide v14, v1, Llp1;->f:J

    .line 78
    invoke-static {v3}, Lrg3;->D(I)J

    move-result-wide v17

    .line 79
    invoke-static {v2}, Lrg3;->D(I)J

    move-result-wide v22

    const/16 v31, 0x30

    const v32, 0x3f7ea

    move-wide v15, v14

    const/4 v14, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x6000

    move-object/from16 v29, v7

    .line 80
    invoke-static/range {v13 .. v32}, Lv03;->b(Ljava/lang/String;Luh1;JJLim0;JJIZIILm13;Lpx;III)V

    move v1, v8

    goto/16 :goto_2

    .line 81
    :cond_10
    invoke-static {}, Leu;->a0()V

    throw v9

    :cond_11
    move-object/from16 v29, v7

    .line 82
    invoke-virtual/range {v29 .. v29}, Lgo0;->R()V

    :cond_12
    return-object v11

    .line 83
    :pswitch_4
    check-cast v0, Landroid/app/Activity;

    move-object/from16 v1, p1

    check-cast v1, Lxm0;

    move-object/from16 v3, p2

    check-cast v3, Lpx;

    move-object/from16 v5, p3

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit8 v8, v5, 0x6

    const/4 v9, 0x4

    if-nez v8, :cond_14

    move-object v8, v3

    check-cast v8, Lgo0;

    invoke-virtual {v8, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    move v6, v9

    :cond_13
    or-int/2addr v5, v6

    :cond_14
    and-int/lit8 v6, v5, 0x13

    if-eq v6, v2, :cond_15

    move v2, v10

    goto :goto_7

    :cond_15
    move v2, v12

    :goto_7
    and-int/lit8 v6, v5, 0x1

    check-cast v3, Lgo0;

    invoke-virtual {v3, v6, v2}, Lgo0;->O(IZ)Z

    move-result v2

    if-eqz v2, :cond_19

    .line 85
    invoke-virtual {v3, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v2

    and-int/2addr v4, v5

    if-ne v4, v9, :cond_16

    goto :goto_8

    :cond_16
    move v10, v12

    :goto_8
    or-int/2addr v2, v10

    .line 86
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_17

    if-ne v5, v7, :cond_18

    .line 87
    :cond_17
    new-instance v5, Ld2;

    const/16 v2, 0x19

    invoke-direct {v5, v2, v0, v1}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 88
    invoke-virtual {v3, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 89
    :cond_18
    check-cast v5, Lin0;

    .line 90
    invoke-static {v1, v5, v3, v4}, Lfg1;->f(Lxm0;Lin0;Lpx;I)V

    goto :goto_9

    .line 91
    :cond_19
    invoke-virtual {v3}, Lgo0;->R()V

    :goto_9
    return-object v11

    .line 92
    :pswitch_5
    check-cast v0, Lkl1;

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    move-object/from16 v1, p2

    check-cast v1, La83;

    move-object/from16 v1, p3

    check-cast v1, La20;

    .line 93
    sget-object v1, Lkl1;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 94
    invoke-virtual {v1, v0, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    invoke-virtual {v0, v9}, Lkl1;->f(Ljava/lang/Object;)V

    return-object v11

    .line 96
    :pswitch_6
    check-cast v0, Lcd1;

    move-object/from16 v1, p1

    check-cast v1, Lo12;

    move-object/from16 v1, p2

    check-cast v1, Lo12;

    move-object/from16 v2, p3

    check-cast v2, Lrs1;

    .line 97
    iget-wide v1, v1, Lo12;->c:J

    .line 98
    iget-object v0, v0, Lcd1;->i:Lkz2;

    .line 99
    sget-object v3, Lgd3;->H:Lc80;

    invoke-interface {v0, v1, v2, v3}, Lkz2;->b(JLvm2;)V

    return-object v11

    .line 100
    :pswitch_7
    check-cast v0, Lw10;

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1a

    goto :goto_a

    .line 101
    :cond_1a
    iget-object v4, v0, Lw10;->D:Lus1;

    invoke-interface {v4, v1}, Lus1;->n(I)I

    move-result v1

    :goto_a
    if-eqz v3, :cond_1b

    goto :goto_b

    .line 102
    :cond_1b
    iget-object v4, v0, Lw10;->D:Lus1;

    invoke-interface {v4, v2}, Lus1;->n(I)I

    move-result v2

    .line 103
    :goto_b
    iget-boolean v4, v0, Lw10;->B:Z

    if-nez v4, :cond_1c

    goto :goto_c

    .line 104
    :cond_1c
    iget-object v4, v0, Lw10;->y:Lk03;

    .line 105
    iget-wide v4, v4, Lk03;->b:J

    .line 106
    sget v6, Lf13;->c:I

    const/16 v6, 0x20

    shr-long v6, v4, v6

    long-to-int v6, v6

    if-ne v1, v6, :cond_1d

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v4, v4

    if-ne v2, v4, :cond_1d

    :goto_c
    move v10, v12

    goto :goto_f

    .line 107
    :cond_1d
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    sget-object v5, Ltr0;->h:Ltr0;

    if-ltz v4, :cond_20

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget-object v6, v0, Lw10;->y:Lk03;

    .line 108
    iget-object v6, v6, Lk03;->a:Lsd;

    .line 109
    iget-object v6, v6, Lsd;->i:Ljava/lang/String;

    .line 110
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-gt v4, v6, :cond_20

    if-nez v3, :cond_1f

    if-ne v1, v2, :cond_1e

    goto :goto_d

    .line 111
    :cond_1e
    iget-object v3, v0, Lw10;->E:Lb03;

    .line 112
    invoke-virtual {v3, v10}, Lb03;->h(Z)V

    goto :goto_e

    .line 113
    :cond_1f
    :goto_d
    iget-object v3, v0, Lw10;->E:Lb03;

    .line 114
    invoke-virtual {v3, v12}, Lb03;->t(Z)V

    .line 115
    invoke-virtual {v3, v5}, Lb03;->q(Ltr0;)V

    .line 116
    :goto_e
    iget-object v3, v0, Lw10;->z:Lt91;

    .line 117
    iget-object v3, v3, Lt91;->v:Ln10;

    .line 118
    new-instance v4, Lk03;

    iget-object v0, v0, Lw10;->y:Lk03;

    .line 119
    iget-object v0, v0, Lk03;->a:Lsd;

    .line 120
    invoke-static {v1, v2}, Lfg1;->i(II)J

    move-result-wide v1

    .line 121
    invoke-direct {v4, v0, v1, v2, v9}, Lk03;-><init>(Lsd;JLf13;)V

    .line 122
    invoke-virtual {v3, v4}, Ln10;->j(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    .line 123
    :cond_20
    iget-object v0, v0, Lw10;->E:Lb03;

    .line 124
    invoke-virtual {v0, v12}, Lb03;->t(Z)V

    .line 125
    invoke-virtual {v0, v5}, Lb03;->q(Ltr0;)V

    goto :goto_c

    .line 126
    :goto_f
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v0, Lv;

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    move-object/from16 v2, p3

    check-cast v2, La20;

    .line 127
    invoke-virtual {v0, v1}, Lv;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v11

    .line 128
    :pswitch_9
    check-cast v0, Lkw;

    move-object/from16 v1, p1

    check-cast v1, Lhm;

    move-object/from16 v2, p2

    check-cast v2, Lpx;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit8 v1, v3, 0x11

    if-eq v1, v8, :cond_21

    move v1, v10

    goto :goto_10

    :cond_21
    move v1, v12

    :goto_10
    and-int/2addr v3, v10

    check-cast v2, Lgo0;

    invoke-virtual {v2, v3, v1}, Lgo0;->O(IZ)Z

    move-result v1

    if-eqz v1, :cond_23

    .line 129
    sget-object v1, Lte;->e:Lyi0;

    .line 130
    sget-object v3, Ltp0;->c:Lvf;

    .line 131
    sget-object v4, Lsn;->u:Lpk;

    .line 132
    invoke-static {v3, v4, v2, v12}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    move-result-object v3

    .line 133
    iget-wide v4, v2, Lgo0;->T:J

    .line 134
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    .line 135
    invoke-virtual {v2}, Lgo0;->l()Lyy1;

    move-result-object v5

    .line 136
    invoke-static {v2, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    move-result-object v1

    .line 137
    sget-object v6, Lhx;->c:Lgx;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    sget-object v6, Lgx;->b:Ljy;

    .line 139
    invoke-virtual {v2}, Lgo0;->Z()V

    .line 140
    iget-boolean v7, v2, Lgo0;->S:Z

    if-eqz v7, :cond_22

    .line 141
    invoke-virtual {v2, v6}, Lgo0;->k(Lxm0;)V

    goto :goto_11

    .line 142
    :cond_22
    invoke-virtual {v2}, Lgo0;->i0()V

    .line 143
    :goto_11
    sget-object v6, Lgx;->e:Llc;

    .line 144
    invoke-static {v2, v6, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 145
    sget-object v3, Lgx;->d:Llc;

    .line 146
    invoke-static {v2, v3, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 147
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 148
    sget-object v4, Lgx;->f:Llc;

    .line 149
    invoke-static {v2, v4, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 150
    sget-object v3, Lgx;->g:Lv6;

    .line 151
    invoke-static {v2, v3}, Lyf3;->b(Lpx;Lin0;)V

    .line 152
    sget-object v3, Lgx;->c:Llc;

    .line 153
    invoke-static {v2, v3, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 154
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lkw;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    invoke-virtual {v2, v10}, Lgo0;->p(Z)V

    goto :goto_12

    .line 156
    :cond_23
    invoke-virtual {v2}, Lgo0;->R()V

    :goto_12
    return-object v11

    .line 157
    :pswitch_a
    move-object v1, v0

    check-cast v1, Lxt0;

    move-object/from16 v0, p1

    check-cast v0, Lbv;

    move-object/from16 v2, p2

    check-cast v2, Lpx;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit8 v0, v4, 0x11

    if-eq v0, v8, :cond_24

    move v12, v10

    :cond_24
    and-int/lit8 v0, v4, 0x1

    check-cast v2, Lgo0;

    invoke-virtual {v2, v0, v12}, Lgo0;->O(IZ)Z

    move-result v0

    if-eqz v0, :cond_48

    .line 159
    sget-object v0, Lte;->e:Lyi0;

    const/high16 v4, 0x43d20000    # 420.0f

    const/4 v5, 0x0

    .line 160
    invoke-static {v0, v5, v4, v10}, Lte;->P(Luh1;FFI)Luh1;

    move-result-object v0

    .line 161
    invoke-static {v2}, Lgf1;->P(Lpx;)Lnl2;

    move-result-object v4

    invoke-static {v0, v4}, Lgf1;->b0(Luh1;Lnl2;)Luh1;

    move-result-object v14

    .line 162
    iget-object v4, v1, Lxt0;->g:Ljava/lang/Throwable;

    iget-object v5, v1, Lxt0;->a:Lvj;

    .line 163
    iget-object v7, v1, Lxt0;->f:Lyt0;

    if-eqz v7, :cond_25

    .line 164
    invoke-virtual {v7}, Lyt0;->p()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_13

    :cond_25
    move-object v8, v9

    :goto_13
    if-eqz v7, :cond_26

    .line 165
    invoke-virtual {v7}, Lyt0;->q()Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    goto :goto_14

    :cond_26
    move-object v12, v9

    :goto_14
    if-eqz v7, :cond_27

    .line 166
    invoke-virtual {v7}, Lyt0;->o()Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    goto :goto_15

    :cond_27
    move-object v13, v9

    .line 167
    :goto_15
    instance-of v0, v5, Lgw;

    if-eqz v0, :cond_28

    move-object v0, v5

    check-cast v0, Lgw;

    move-object v15, v0

    goto :goto_16

    :cond_28
    move-object v15, v9

    .line 168
    :goto_16
    :try_start_0
    sget-object v0, Lup0;->m:Ljava/lang/String;

    if-eqz v0, :cond_29

    move/from16 v16, v3

    goto :goto_19

    :cond_29
    const-string v0, "hostProcess"

    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    throw v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_17
    move/from16 v16, v3

    goto :goto_18

    :catchall_0
    move-exception v0

    goto :goto_17

    .line 169
    :goto_18
    new-instance v3, Lx92;

    invoke-direct {v3, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v3

    .line 170
    :goto_19
    nop

    instance-of v3, v0, Lx92;

    if-eqz v3, :cond_2a

    move-object v0, v9

    .line 171
    :cond_2a
    check-cast v0, Ljava/lang/String;

    const-string v3, ""

    if-nez v0, :cond_2b

    move-object/from16 v17, v3

    goto :goto_1a

    :cond_2b
    move-object/from16 v17, v0

    .line 172
    :goto_1a
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    move-result-object v0

    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Ljava/security/ProtectionDomain;->getCodeSource()Ljava/security/CodeSource;

    move-result-object v0

    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Ljava/security/CodeSource;->getLocation()Ljava/net/URL;

    move-result-object v0

    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1b

    :catchall_1
    move-exception v0

    .line 173
    new-instance v9, Lx92;

    invoke-direct {v9, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    :cond_2c
    move-object v0, v9

    .line 174
    :goto_1b
    nop

    instance-of v9, v0, Lx92;

    if-eqz v9, :cond_2d

    const/4 v0, 0x0

    .line 175
    :cond_2d
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_2e

    move-object v9, v3

    goto :goto_1c

    :cond_2e
    move-object v9, v0

    .line 176
    :goto_1c
    :try_start_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    if-eqz v0, :cond_2f

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1e

    :catchall_2
    move-exception v0

    goto :goto_1d

    :cond_2f
    const/4 v0, 0x0

    goto :goto_1e

    .line 177
    :goto_1d
    new-instance v6, Lx92;

    invoke-direct {v6, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v6

    .line 178
    :goto_1e
    nop

    instance-of v6, v0, Lx92;

    if-eqz v6, :cond_30

    const/4 v0, 0x0

    .line 179
    :cond_30
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_31

    goto :goto_1f

    :cond_31
    move-object v3, v0

    .line 180
    :goto_1f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    iget-object v6, v1, Lxt0;->b:Ljava/lang/String;

    .line 182
    new-instance v10, Ljava/lang/StringBuilder;

    move-object/from16 p0, v3

    const-string v3, "Name: "

    invoke-direct {v10, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 183
    invoke-virtual {v5}, Lvj;->d()Ljava/lang/String;

    move-result-object v6

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v3, "ID: "

    invoke-direct {v10, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 184
    iget-object v3, v1, Lxt0;->d:Lzt0;

    .line 185
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_34

    const/4 v6, 0x1

    if-eq v3, v6, :cond_33

    const/4 v6, 0x2

    if-ne v3, v6, :cond_32

    const-string v3, "LOCKED"

    goto :goto_20

    :cond_32
    invoke-static {}, Lc80;->s()V

    const/4 v9, 0x0

    goto/16 :goto_28

    :cond_33
    const-string v3, "UNAVAILABLE"

    goto :goto_20

    :cond_34
    const-string v3, "NORMAL"

    .line 186
    :goto_20
    const-string v6, "Status: "

    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 187
    iget-object v6, v1, Lxt0;->e:Ljava/lang/String;

    .line 188
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v3, "Reason: "

    invoke-direct {v10, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz v7, :cond_35

    .line 189
    invoke-virtual {v7}, Lyt0;->k()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_36

    :cond_35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    :cond_36
    const-string v6, "Hooker class: "

    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 190
    invoke-static {v9}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    move-result v3

    const-string v6, "N/A"

    if-eqz v3, :cond_37

    move-object v9, v6

    :cond_37
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v10, "Class location: "

    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 191
    invoke-static/range {p0 .. p0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_38

    move-object v9, v6

    goto :goto_21

    :cond_38
    move-object/from16 v9, p0

    :goto_21
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v3, "Class loader: "

    invoke-direct {v10, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz v15, :cond_39

    .line 192
    invoke-virtual {v15}, Lgw;->n()Lwm0;

    move-result-object v3

    if-eqz v3, :cond_39

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3a

    :cond_39
    move-object v3, v6

    :cond_3a
    const-string v9, "UI location: "

    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {v5}, Lvj;->f()Z

    move-result v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v15, "Is target process: "

    invoke-direct {v10, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 194
    invoke-static/range {v17 .. v17}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3b

    const-string v17, "Unknown"

    :cond_3b
    move-object/from16 v3, v17

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Current process: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 195
    iget-boolean v9, v5, Lvj;->a:Z

    .line 196
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v15, "Default enabled: "

    invoke-direct {v10, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 197
    invoke-virtual {v5}, Lvj;->e()Z

    move-result v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v15, "Requires restart: "

    invoke-direct {v10, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 198
    iget-boolean v9, v5, Lvj;->c:Z

    .line 199
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v15, "Available: "

    invoke-direct {v10, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 200
    invoke-virtual {v5}, Lvj;->b()Z

    move-result v5

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Ignore security mode: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz v7, :cond_3c

    .line 201
    invoke-virtual {v7}, Lyt0;->m()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_3d

    :cond_3c
    move-object v5, v6

    :cond_3d
    const-string v9, "Phase: "

    invoke-virtual {v9, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz v7, :cond_3e

    .line 202
    invoke-virtual {v7}, Lyt0;->r()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3f

    :cond_3e
    move-object v3, v6

    :cond_3f
    const-string v5, "Timestamp: "

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 203
    iget-object v1, v1, Lxt0;->c:Ljava/lang/String;

    if-eqz v1, :cond_40

    .line 204
    const-string v5, "\nDescription:\n"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 206
    :cond_40
    const-string v1, "\nThrowable:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v8, :cond_42

    if-eqz v4, :cond_41

    .line 207
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    move-object v8, v1

    goto :goto_22

    :cond_41
    const/4 v8, 0x0

    :goto_22
    if-nez v8, :cond_42

    move-object v8, v6

    :cond_42
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\nMessage:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v12, :cond_44

    if-eqz v4, :cond_43

    .line 208
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    goto :goto_23

    :cond_43
    const/4 v12, 0x0

    :goto_23
    if-nez v12, :cond_44

    move-object v12, v6

    :cond_44
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\nStack trace:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v13, :cond_46

    if-eqz v4, :cond_45

    .line 209
    invoke-static {v4}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v9

    goto :goto_24

    :cond_45
    const/4 v9, 0x0

    :goto_24
    if-nez v9, :cond_47

    move-object v13, v6

    :cond_46
    :goto_25
    const/16 v3, 0xa

    goto :goto_26

    :cond_47
    move-object v13, v9

    goto :goto_25

    .line 210
    :goto_26
    invoke-static {v0, v13, v3}, Lhk1;->i(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v13

    .line 211
    sget-object v0, Lur1;->a:Ltu2;

    .line 212
    invoke-virtual {v2, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v0

    .line 213
    check-cast v0, Llp1;

    .line 214
    iget-wide v0, v0, Llp1;->f:J

    .line 215
    invoke-static/range {v16 .. v16}, Lrg3;->D(I)J

    move-result-wide v20

    const/16 v3, 0x11

    .line 216
    invoke-static {v3}, Lrg3;->D(I)J

    move-result-wide v26

    .line 217
    sget-object v22, Lim0;->j:Lim0;

    .line 218
    new-instance v15, Lm13;

    const/16 v29, 0x0

    const v30, 0xfdfff8

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-wide/from16 v18, v0

    move-object/from16 v17, v15

    invoke-direct/range {v17 .. v30}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    const/16 v21, 0x0

    const/16 v22, 0x3f8

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v2

    .line 219
    invoke-static/range {v13 .. v22}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    goto :goto_27

    :cond_48
    move-object/from16 v20, v2

    .line 220
    invoke-virtual/range {v20 .. v20}, Lgo0;->R()V

    :goto_27
    move-object v9, v11

    :goto_28
    return-object v9

    :pswitch_data_0
    .packed-switch 0x0
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
