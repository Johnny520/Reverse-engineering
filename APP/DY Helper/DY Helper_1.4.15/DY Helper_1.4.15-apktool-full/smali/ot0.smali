.class public final synthetic Lot0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf80;


# instance fields
.field public final synthetic ε:Lps0;

.field public final synthetic ζ:Z

.field public final synthetic η:Lep0;

.field public final synthetic θ:La80;

.field public final synthetic ι:La80;


# direct methods
.method public synthetic constructor <init>(Lps0;ZLep0;La80;La80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lot0;->ε:Lps0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lot0;->ζ:Z

    .line 7
    .line 8
    iput-object p3, p0, Lot0;->η:Lep0;

    .line 9
    .line 10
    iput-object p4, p0, Lot0;->θ:La80;

    .line 11
    .line 12
    iput-object p5, p0, Lot0;->ι:La80;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lkc;

    move-object/from16 v7, p2

    check-cast v7, Lv80;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit8 v3, v2, 0x6

    const/4 v14, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v7, v1}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v14

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    :cond_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    const/4 v15, 0x0

    const/4 v9, 0x1

    if-eq v3, v4, :cond_2

    move v3, v9

    goto :goto_1

    :cond_2
    move v3, v15

    :goto_1
    and-int/2addr v2, v9

    invoke-virtual {v7, v2, v3}, Lv80;->Ξ(IZ)Z

    move-result v2

    if-eqz v2, :cond_3a

    .line 1
    invoke-virtual {v1}, Lkc;->β()F

    move-result v2

    int-to-float v3, v15

    invoke-static {v2, v3}, Liv;->α(FF)I

    move-result v2

    if-lez v2, :cond_3b

    invoke-virtual {v1}, Lkc;->α()F

    move-result v2

    invoke-static {v2, v3}, Liv;->α(FF)I

    move-result v2

    if-gtz v2, :cond_3

    goto/16 :goto_27

    .line 2
    :cond_3
    iget-object v10, v0, Lot0;->ε:Lps0;

    iget-object v11, v10, Lps0;->α:Ljava/util/List;

    iget-boolean v2, v10, Lps0;->δ:Z

    .line 3
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v15

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 4
    check-cast v6, Lxt0;

    .line 5
    iget-boolean v6, v6, Lxt0;->δ:Z

    if-eqz v6, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    const/4 v5, -0x1

    :goto_3
    if-gez v5, :cond_6

    move v5, v15

    :cond_6
    int-to-float v4, v5

    const v5, 0x3f51eb85    # 0.82f

    const/high16 v6, 0x43be0000    # 380.0f

    const/4 v12, 0x0

    .line 6
    invoke-static {v5, v6, v12, v14}, Lbd;->г(FFLjava/lang/Float;I)Lpz1;

    move-result-object v5

    .line 7
    const-string v6, "liquid-selected-index"

    .line 8
    invoke-static {v4, v5, v6, v7}, Ls3;->α(FLpz1;Ljava/lang/String;Lv80;)Lc02;

    move-result-object v4

    .line 9
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v11, v6}, Lyh;->σ(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 11
    move-object/from16 v13, v16

    check-cast v13, Lxt0;

    .line 12
    iget-object v13, v13, Lxt0;->α:Ljava/lang/String;

    .line 13
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 14
    :cond_7
    invoke-virtual {v7, v5}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v8

    .line 15
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v13

    move/from16 p2, v8

    .line 16
    sget-object v8, Lqn;->α:Li2;

    if-nez p2, :cond_8

    if-ne v13, v8, :cond_9

    .line 17
    :cond_8
    invoke-static {v12}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    move-result-object v13

    .line 18
    invoke-virtual {v7, v13}, Lv80;->е(Ljava/lang/Object;)V

    .line 19
    :cond_9
    check-cast v13, Lg21;

    .line 20
    invoke-virtual {v7, v5}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    .line 21
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v15

    if-nez v16, :cond_a

    if-ne v15, v8, :cond_b

    .line 22
    :cond_a
    invoke-static {v12}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    move-result-object v15

    .line 23
    invoke-virtual {v7, v15}, Lv80;->е(Ljava/lang/Object;)V

    .line 24
    :cond_b
    check-cast v15, Lg21;

    .line 25
    invoke-virtual {v7, v5}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v5

    .line 26
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_c

    if-ne v6, v8, :cond_d

    .line 27
    :cond_c
    invoke-static {v12}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    move-result-object v6

    .line 28
    invoke-virtual {v7, v6}, Lv80;->е(Ljava/lang/Object;)V

    .line 29
    :cond_d
    move-object/from16 v21, v6

    check-cast v21, Lg21;

    .line 30
    sget-object v5, Lu1;->ε:Lm02;

    .line 31
    invoke-virtual {v7, v5}, Lv80;->ι(Lak1;)Ljava/lang/Object;

    move-result-object v5

    .line 32
    move-object/from16 v18, v5

    check-cast v18, Landroid/view/View;

    .line 33
    invoke-interface {v13}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-nez v5, :cond_f

    .line 34
    invoke-interface {v15}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    if-eqz v5, :cond_e

    goto :goto_6

    :cond_e
    const/4 v5, 0x0

    :goto_5
    const/high16 v16, 0x3f800000    # 1.0f

    goto :goto_7

    :cond_f
    :goto_6
    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_5

    :goto_7
    const v6, 0x3f3851ec    # 0.72f

    const/high16 v9, 0x43fa0000    # 500.0f

    .line 35
    invoke-static {v6, v9, v12, v14}, Lbd;->г(FFLjava/lang/Float;I)Lpz1;

    move-result-object v6

    .line 36
    const-string v9, "liquid-press-progress"

    .line 37
    invoke-static {v5, v6, v9, v7}, Ls3;->α(FLpz1;Ljava/lang/String;Lv80;)Lc02;

    move-result-object v5

    .line 38
    invoke-virtual {v1}, Lkc;->α()F

    move-result v6

    .line 39
    new-instance v9, Liv;

    invoke-direct {v9, v6}, Liv;-><init>(F)V

    const/16 v6, 0x40

    int-to-float v6, v6

    .line 40
    new-instance v12, Liv;

    invoke-direct {v12, v6}, Liv;-><init>(F)V

    .line 41
    invoke-static {v9, v12}, Lbd;->Η(Liv;Liv;)Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Liv;

    .line 42
    iget v6, v6, Liv;->ε:F

    const/16 v9, 0x8

    int-to-float v9, v9

    sub-float v12, v6, v9

    .line 43
    new-instance v14, Liv;

    invoke-direct {v14, v12}, Liv;-><init>(F)V

    move-object/from16 v17, v1

    const/4 v12, 0x1

    int-to-float v1, v12

    .line 44
    new-instance v12, Liv;

    invoke-direct {v12, v1}, Liv;-><init>(F)V

    .line 45
    invoke-virtual {v14, v12}, Liv;->compareTo(Ljava/lang/Object;)I

    move-result v1

    if-gez v1, :cond_10

    move-object v14, v12

    .line 46
    :cond_10
    invoke-virtual/range {v17 .. v17}, Lkc;->β()F

    move-result v1

    sub-float/2addr v1, v9

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v1, v9

    .line 47
    sget-object v9, Lfo;->ξ:Lm02;

    .line 48
    invoke-virtual {v7, v9}, Lv80;->ι(Lak1;)Ljava/lang/Object;

    move-result-object v9

    .line 49
    sget-object v12, Lnp0;->ε:Lnp0;

    if-ne v9, v12, :cond_11

    const/4 v12, 0x1

    goto :goto_8

    :cond_11
    const/4 v12, 0x0

    .line 50
    :goto_8
    invoke-interface {v15}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Float;

    if-eqz v9, :cond_12

    .line 51
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v4

    goto :goto_9

    .line 52
    :cond_12
    invoke-interface {v4}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    :goto_9
    if-eqz v12, :cond_13

    move/from16 v19, v2

    const/4 v9, 0x4

    int-to-float v2, v9

    mul-float/2addr v4, v1

    add-float/2addr v4, v2

    goto :goto_a

    :cond_13
    move/from16 v19, v2

    const/4 v9, 0x4

    .line 53
    invoke-virtual/range {v17 .. v17}, Lkc;->β()F

    move-result v2

    move/from16 v17, v2

    int-to-float v2, v9

    sub-float v2, v17, v2

    add-float v4, v4, v16

    mul-float/2addr v4, v1

    sub-float v4, v2, v4

    .line 54
    :goto_a
    iget-boolean v2, v0, Lot0;->ζ:Z

    const v16, 0x3ecccccd    # 0.4f

    if-eqz v19, :cond_15

    const-wide v22, 0xff1c1c1eL

    move-object/from16 v17, v10

    .line 55
    invoke-static/range {v22 .. v23}, Lkn0;->β(J)J

    move-result-wide v9

    move/from16 v22, v2

    if-eqz v2, :cond_14

    move/from16 v2, v16

    goto :goto_b

    :cond_14
    const v2, 0x3f6b851f    # 0.92f

    :goto_b
    invoke-static {v9, v10, v2}, Lci;->β(JF)J

    move-result-wide v9

    :goto_c
    move-object/from16 v25, v11

    move/from16 v26, v12

    goto :goto_e

    :cond_15
    move/from16 v22, v2

    move-object/from16 v17, v10

    const-wide v9, 0xfff2f2f7L

    .line 56
    invoke-static {v9, v10}, Lkn0;->β(J)J

    move-result-wide v9

    if-eqz v22, :cond_16

    move/from16 v2, v16

    goto :goto_d

    :cond_16
    const v2, 0x3f6b851f    # 0.92f

    :goto_d
    invoke-static {v9, v10, v2}, Lci;->β(JF)J

    move-result-wide v9

    goto :goto_c

    .line 57
    :goto_e
    sget-wide v11, Lci;->β:J

    if-eqz v19, :cond_17

    const v2, 0x3e4ccccd    # 0.2f

    goto :goto_f

    :cond_17
    const v2, 0x3dcccccd    # 0.1f

    .line 58
    :goto_f
    invoke-static {v11, v12, v2}, Lci;->β(JF)J

    move-result-wide v30

    .line 59
    sget-object v2, Lxb;->ρ:Lu30;

    .line 60
    invoke-static {v2, v6}, Lxb;->Η(Lr01;F)Lr01;

    move-result-object v2

    const/16 v6, 0xa

    int-to-float v6, v6

    .line 61
    sget-object v29, Lyo1;->α:Lxo1;

    .line 62
    invoke-static {v6, v3}, Liv;->α(FF)I

    move-result v11

    if-gtz v11, :cond_18

    move-object/from16 v6, v29

    goto :goto_10

    .line 63
    :cond_18
    new-instance v27, Lgv1;

    move-wide/from16 v32, v30

    move/from16 v28, v6

    invoke-direct/range {v27 .. v33}, Lgv1;-><init>(FLiv1;JJ)V

    move-object/from16 v11, v27

    move-object/from16 v6, v29

    invoke-interface {v2, v11}, Lr01;->β(Lr01;)Lr01;

    move-result-object v2

    .line 64
    :goto_10
    iget-object v12, v0, Lot0;->η:Lep0;

    if-eqz v22, :cond_21

    const v6, -0x622e020

    invoke-virtual {v7, v6}, Lv80;->Φ(I)V

    .line 65
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v8, :cond_19

    .line 66
    new-instance v6, Lkt0;

    const/4 v11, 0x1

    invoke-direct {v6, v11}, Lkt0;-><init>(I)V

    .line 67
    invoke-virtual {v7, v6}, Lv80;->е(Ljava/lang/Object;)V

    .line 68
    :cond_19
    move-object/from16 v28, v6

    check-cast v28, Lp70;

    .line 69
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v8, :cond_1a

    .line 70
    new-instance v6, Lgp0;

    const/4 v11, 0x7

    invoke-direct {v6, v11}, Lgp0;-><init>(I)V

    .line 71
    invoke-virtual {v7, v6}, Lv80;->е(Ljava/lang/Object;)V

    .line 72
    :cond_1a
    move-object/from16 v29, v6

    check-cast v29, La80;

    .line 73
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v8, :cond_1b

    .line 74
    new-instance v6, Lgp0;

    const/4 v11, 0x6

    invoke-direct {v6, v11}, Lgp0;-><init>(I)V

    .line 75
    invoke-virtual {v7, v6}, Lv80;->е(Ljava/lang/Object;)V

    .line 76
    :cond_1b
    move-object/from16 v30, v6

    check-cast v30, La80;

    .line 77
    invoke-virtual {v7, v5}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v6

    .line 78
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_1c

    if-ne v11, v8, :cond_1d

    .line 79
    :cond_1c
    new-instance v11, Lts0;

    const/4 v6, 0x1

    invoke-direct {v11, v5, v6}, Lts0;-><init>(Lc02;I)V

    .line 80
    invoke-virtual {v7, v11}, Lv80;->е(Ljava/lang/Object;)V

    .line 81
    :cond_1d
    move-object/from16 v31, v11

    check-cast v31, La80;

    .line 82
    invoke-virtual {v7}, Lv80;->Γ()Ljava/lang/Object;

    move-result-object v6

    .line 83
    instance-of v11, v6, Ljava/lang/Long;

    if-eqz v11, :cond_1e

    .line 84
    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v19

    cmp-long v6, v9, v19

    if-nez v6, :cond_1e

    const/4 v6, 0x0

    goto :goto_11

    .line 85
    :cond_1e
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v7, v6}, Lv80;->ж(Ljava/lang/Object;)V

    const/4 v6, 0x1

    .line 86
    :goto_11
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_20

    if-ne v11, v8, :cond_1f

    goto :goto_12

    :cond_1f
    const/4 v6, 0x3

    goto :goto_13

    .line 87
    :cond_20
    :goto_12
    new-instance v11, Lmc;

    const/4 v6, 0x3

    invoke-direct {v11, v6, v9, v10}, Lmc;-><init>(IJ)V

    .line 88
    invoke-virtual {v7, v11}, Lv80;->е(Ljava/lang/Object;)V

    .line 89
    :goto_13
    move-object/from16 v32, v11

    check-cast v32, La80;

    const/16 v33, 0x760

    move-object/from16 v27, v12

    .line 90
    invoke-static/range {v27 .. v33}, Lpd2;->π(Lep0;Lp70;La80;La80;La80;La80;I)Lr01;

    move-result-object v9

    const/4 v11, 0x0

    .line 91
    invoke-virtual {v7, v11}, Lv80;->ο(Z)V

    goto :goto_14

    :cond_21
    move-object/from16 v27, v12

    const/4 v11, 0x0

    const v12, -0x611eb85

    .line 92
    invoke-virtual {v7, v12}, Lv80;->Φ(I)V

    .line 93
    invoke-virtual {v7, v11}, Lv80;->ο(Z)V

    .line 94
    sget-object v11, Lp01;->α:Lp01;

    invoke-static {v11, v9, v10, v6}, Lln0;->κ(Lr01;JLiv1;)Lr01;

    move-result-object v9

    .line 95
    :goto_14
    invoke-interface {v2, v9}, Lr01;->β(Lr01;)Lr01;

    move-result-object v2

    .line 96
    sget-object v6, Lx;->ζ:Laa;

    .line 97
    invoke-static {v6}, Lec;->δ(Laa;)Lpx0;

    move-result-object v6

    .line 98
    iget-wide v9, v7, Lv80;->Χ:J

    .line 99
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    .line 100
    invoke-virtual {v7}, Lv80;->λ()Landroidx/compose/runtime/internal/α;

    move-result-object v10

    .line 101
    invoke-static {v7, v2}, Lpd2;->Γ(Lv80;Lr01;)Lr01;

    move-result-object v2

    .line 102
    sget-object v11, Lln;->β:Lkn;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    sget-object v11, Lkn;->β:Lu40;

    .line 104
    invoke-virtual {v7}, Lv80;->Ψ()V

    .line 105
    iget-boolean v12, v7, Lv80;->Φ:Z

    if-eqz v12, :cond_22

    .line 106
    invoke-virtual {v7, v11}, Lv80;->κ(Lp70;)V

    goto :goto_15

    .line 107
    :cond_22
    invoke-virtual {v7}, Lv80;->и()V

    .line 108
    :goto_15
    sget-object v12, Lkn;->ε:Lui;

    .line 109
    invoke-static {v12, v7, v6}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 110
    sget-object v6, Lkn;->δ:Lui;

    .line 111
    invoke-static {v6, v7, v10}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 112
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 113
    sget-object v10, Lkn;->ζ:Lui;

    .line 114
    invoke-static {v10, v7, v9}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 115
    sget-object v9, Lkn;->η:La1;

    .line 116
    invoke-static {v7, v9}, Le81;->ξ(Lv80;La80;)V

    move-object/from16 v28, v12

    .line 117
    sget-object v12, Lkn;->γ:Lui;

    .line 118
    invoke-static {v12, v7, v2}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 119
    sget-object v2, Lx;->υ:Lx;

    .line 120
    invoke-virtual {v2}, Lx;->η()Lr01;

    move-result-object v2

    .line 121
    invoke-static {v2, v4, v3}, Lbd;->Ι(Lr01;FF)Lr01;

    move-result-object v2

    .line 122
    invoke-static {v2, v1}, Lxb;->е(Lr01;F)Lr01;

    move-result-object v1

    .line 123
    iget v2, v14, Liv;->ε:F

    invoke-static {v1, v2}, Lxb;->Η(Lr01;F)Lr01;

    move-result-object v2

    move-object/from16 v1, v17

    .line 124
    iget-boolean v3, v1, Lps0;->δ:Z

    .line 125
    invoke-interface {v5}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v5

    move-object v4, v8

    const/4 v8, 0x0

    move-object/from16 v34, v6

    move-object/from16 v29, v12

    move-object/from16 v14, v21

    move-object/from16 v6, v27

    move-object v12, v4

    move-object/from16 v27, v9

    move-object/from16 v9, v18

    move/from16 v4, v22

    .line 126
    invoke-static/range {v2 .. v8}, Lpt0;->δ(Lr01;ZZFLep0;Lv80;I)V

    .line 127
    sget-object v2, Lxb;->τ:Lu30;

    .line 128
    invoke-interface/range {v25 .. v25}, Ljava/util/List;->size()I

    move-result v3

    .line 129
    invoke-virtual {v7, v13}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v4

    .line 130
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_23

    if-ne v5, v12, :cond_24

    .line 131
    :cond_23
    new-instance v5, Lhp0;

    const/4 v4, 0x2

    invoke-direct {v5, v13, v4}, Lhp0;-><init>(Lg21;I)V

    .line 132
    invoke-virtual {v7, v5}, Lv80;->е(Ljava/lang/Object;)V

    .line 133
    :cond_24
    check-cast v5, La80;

    .line 134
    invoke-virtual {v7, v1}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v4

    iget-object v6, v0, Lot0;->θ:La80;

    invoke-virtual {v7, v6}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    .line 135
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_25

    if-ne v8, v12, :cond_26

    .line 136
    :cond_25
    new-instance v8, Lat0;

    const/4 v4, 0x1

    invoke-direct {v8, v1, v6, v4}, Lat0;-><init>(Lps0;La80;I)V

    .line 137
    invoke-virtual {v7, v8}, Lv80;->е(Ljava/lang/Object;)V

    .line 138
    :cond_26
    check-cast v8, La80;

    .line 139
    invoke-virtual {v7, v15}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v7, v13}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    or-int v4, v4, v16

    invoke-virtual {v7, v1}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v16

    or-int v4, v4, v16

    invoke-virtual {v7, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    or-int v4, v4, v16

    invoke-virtual {v7, v9}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v16

    or-int v4, v4, v16

    move-object/from16 v17, v1

    .line 140
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v1

    if-nez v4, :cond_28

    if-ne v1, v12, :cond_27

    goto :goto_16

    :cond_27
    move-object/from16 v4, v17

    goto :goto_17

    .line 141
    :cond_28
    :goto_16
    new-instance v16, Lbt0;

    const/16 v22, 0x2

    move-object/from16 v18, v9

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    move-object/from16 v19, v15

    invoke-direct/range {v16 .. v22}, Lbt0;-><init>(Lps0;Landroid/view/View;Lg21;Lg21;Lg21;I)V

    move-object/from16 v1, v16

    move-object/from16 v4, v17

    .line 142
    invoke-virtual {v7, v1}, Lv80;->е(Ljava/lang/Object;)V

    .line 143
    :goto_17
    check-cast v1, La80;

    .line 144
    invoke-virtual {v7, v15}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v7, v4}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    invoke-virtual {v7, v13}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    invoke-virtual {v7, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    invoke-virtual {v7, v9}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    move-object/from16 v30, v1

    .line 145
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v1

    if-nez v16, :cond_29

    if-ne v1, v12, :cond_2a

    .line 146
    :cond_29
    new-instance v16, Lbt0;

    const/16 v22, 0x3

    move-object/from16 v17, v4

    move-object/from16 v18, v9

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    move-object/from16 v19, v15

    invoke-direct/range {v16 .. v22}, Lbt0;-><init>(Lps0;Landroid/view/View;Lg21;Lg21;Lg21;I)V

    move-object/from16 v1, v16

    .line 147
    invoke-virtual {v7, v1}, Lv80;->е(Ljava/lang/Object;)V

    .line 148
    :cond_2a
    check-cast v1, La80;

    .line 149
    invoke-virtual {v7, v4}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v7, v6}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    or-int v9, v9, v16

    iget-object v0, v0, Lot0;->ι:La80;

    invoke-virtual {v7, v0}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    or-int v9, v9, v16

    invoke-virtual {v7, v15}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    or-int v9, v9, v16

    invoke-virtual {v7, v13}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    or-int v9, v9, v16

    invoke-virtual {v7, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    or-int v9, v9, v16

    move-object/from16 v19, v0

    .line 150
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v0

    if-nez v9, :cond_2c

    if-ne v0, v12, :cond_2b

    goto :goto_18

    :cond_2b
    move-object/from16 v17, v4

    move-object/from16 v18, v6

    goto :goto_19

    .line 151
    :cond_2c
    :goto_18
    new-instance v16, Lct0;

    const/16 v23, 0x1

    move-object/from16 v17, v4

    move-object/from16 v18, v6

    move-object/from16 v21, v13

    move-object/from16 v22, v14

    move-object/from16 v20, v15

    invoke-direct/range {v16 .. v23}, Lct0;-><init>(Lps0;La80;La80;Lg21;Lg21;Lg21;I)V

    move-object/from16 v0, v16

    .line 152
    invoke-virtual {v7, v0}, Lv80;->е(Ljava/lang/Object;)V

    .line 153
    :goto_19
    move-object v9, v0

    check-cast v9, Le80;

    .line 154
    invoke-virtual {v7, v15}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7, v13}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v7, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    .line 155
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_2e

    if-ne v4, v12, :cond_2d

    goto :goto_1a

    :cond_2d
    const/4 v6, 0x1

    goto :goto_1b

    .line 156
    :cond_2e
    :goto_1a
    new-instance v4, Lrs0;

    const/4 v6, 0x1

    invoke-direct {v4, v15, v13, v14, v6}, Lrs0;-><init>(Lg21;Lg21;Lg21;I)V

    .line 157
    invoke-virtual {v7, v4}, Lv80;->е(Ljava/lang/Object;)V

    .line 158
    :goto_1b
    check-cast v4, Lp70;

    move-object v0, v12

    const/4 v12, 0x6

    move-object/from16 v38, v0

    move-object v6, v8

    move-object v0, v10

    move-object/from16 v20, v13

    move-object/from16 v35, v17

    move-object/from16 v36, v18

    move-object/from16 v37, v19

    move-object/from16 v13, v27

    move-object/from16 v14, v28

    const/16 v24, 0x0

    move-object v8, v1

    move-object v10, v4

    move-object v1, v11

    move-object/from16 v19, v15

    move/from16 v4, v26

    move-object/from16 v15, v29

    move-object v11, v7

    move-object/from16 v7, v30

    .line 159
    invoke-static/range {v2 .. v12}, Ls1;->ο(Lr01;IZLa80;La80;La80;La80;Le80;Lp70;Lv80;I)Lr01;

    move-result-object v2

    move-object v7, v11

    const/4 v9, 0x4

    int-to-float v3, v9

    .line 160
    invoke-static {v2, v3}, Lyh;->е(Lr01;F)Lr01;

    move-result-object v2

    .line 161
    sget-object v3, Lu6;->α:Li2;

    .line 162
    invoke-static {v7}, Lfp1;->α(Lv80;)Lgp1;

    move-result-object v3

    .line 163
    iget-wide v4, v7, Lv80;->Χ:J

    .line 164
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    .line 165
    invoke-virtual {v7}, Lv80;->λ()Landroidx/compose/runtime/internal/α;

    move-result-object v5

    .line 166
    invoke-static {v7, v2}, Lpd2;->Γ(Lv80;Lr01;)Lr01;

    move-result-object v2

    .line 167
    invoke-virtual {v7}, Lv80;->Ψ()V

    .line 168
    iget-boolean v6, v7, Lv80;->Φ:Z

    if-eqz v6, :cond_2f

    .line 169
    invoke-virtual {v7, v1}, Lv80;->κ(Lp70;)V

    goto :goto_1c

    .line 170
    :cond_2f
    invoke-virtual {v7}, Lv80;->и()V

    .line 171
    :goto_1c
    invoke-static {v14, v7, v3}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    move-object/from16 v1, v34

    .line 172
    invoke-static {v1, v7, v5}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 173
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v7, v1}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 174
    invoke-static {v7, v13}, Le81;->ξ(Lv80;La80;)V

    .line 175
    invoke-static {v15, v7, v2}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    const v0, -0x7bea309d

    .line 176
    invoke-virtual {v7, v0}, Lv80;->Φ(I)V

    .line 177
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v11, 0x0

    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_39

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v10, v11, 0x1

    if-ltz v11, :cond_38

    move-object v2, v1

    check-cast v2, Lxt0;

    .line 178
    invoke-interface/range {v19 .. v19}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    if-eqz v1, :cond_31

    .line 179
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljx0;->в(F)I

    move-result v1

    if-ne v1, v11, :cond_30

    const/4 v9, 0x1

    goto :goto_1e

    :cond_30
    const/4 v9, 0x0

    :goto_1e
    move v3, v9

    goto :goto_1f

    .line 180
    :cond_31
    iget-boolean v9, v2, Lxt0;->δ:Z

    goto :goto_1e

    .line 181
    :goto_1f
    invoke-interface/range {v20 .. v20}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_32

    goto :goto_21

    .line 182
    :cond_32
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v11, :cond_33

    const/4 v4, 0x1

    :goto_20
    move-object/from16 v1, v35

    goto :goto_22

    :cond_33
    :goto_21
    const/4 v4, 0x0

    goto :goto_20

    .line 183
    :goto_22
    iget-boolean v5, v1, Lps0;->δ:Z

    move-object/from16 v11, v36

    .line 184
    invoke-virtual {v7, v11}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v7, v2}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    .line 185
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v12, v38

    if-nez v6, :cond_35

    if-ne v8, v12, :cond_34

    goto :goto_23

    :cond_34
    const/4 v13, 0x2

    goto :goto_24

    .line 186
    :cond_35
    :goto_23
    new-instance v8, Lss0;

    const/4 v13, 0x2

    invoke-direct {v8, v11, v2, v13}, Lss0;-><init>(La80;Lxt0;I)V

    .line 187
    invoke-virtual {v7, v8}, Lv80;->е(Ljava/lang/Object;)V

    .line 188
    :goto_24
    move-object v6, v8

    check-cast v6, Lp70;

    move-object/from16 v14, v37

    .line 189
    invoke-virtual {v7, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v7, v2}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    .line 190
    invoke-virtual {v7}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_37

    if-ne v9, v12, :cond_36

    goto :goto_25

    :cond_36
    const/4 v15, 0x3

    goto :goto_26

    .line 191
    :cond_37
    :goto_25
    new-instance v9, Lss0;

    const/4 v15, 0x3

    invoke-direct {v9, v14, v2, v15}, Lss0;-><init>(La80;Lxt0;I)V

    .line 192
    invoke-virtual {v7, v9}, Lv80;->е(Ljava/lang/Object;)V

    .line 193
    :goto_26
    check-cast v9, Lp70;

    move-object v8, v7

    move-object v7, v9

    const/4 v9, 0x6

    .line 194
    invoke-static/range {v2 .. v9}, Lpt0;->ε(Lxt0;ZZZLp70;Lp70;Lv80;I)V

    move-object/from16 v35, v1

    move-object v7, v8

    move-object/from16 v36, v11

    move-object/from16 v38, v12

    move-object/from16 v37, v14

    move v11, v10

    goto/16 :goto_1d

    .line 195
    :cond_38
    invoke-static {}, Lyh;->х()V

    throw v24

    :cond_39
    const/4 v11, 0x0

    .line 196
    invoke-virtual {v7, v11}, Lv80;->ο(Z)V

    const/4 v6, 0x1

    .line 197
    invoke-virtual {v7, v6}, Lv80;->ο(Z)V

    .line 198
    invoke-virtual {v7, v6}, Lv80;->ο(Z)V

    goto :goto_27

    .line 199
    :cond_3a
    invoke-virtual {v7}, Lv80;->Ρ()V

    .line 200
    :cond_3b
    :goto_27
    sget-object v0, Ls62;->α:Ls62;

    return-object v0
.end method
