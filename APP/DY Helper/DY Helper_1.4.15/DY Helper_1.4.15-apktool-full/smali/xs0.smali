.class public final synthetic Lxs0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lxs0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lxs0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lxs0;->η:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lxs0;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lxs0;->ε:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    iget-object v5, v0, Lxs0;->θ:Ljava/lang/Object;

    iget-object v6, v0, Lxs0;->η:Ljava/lang/Object;

    iget-object v0, v0, Lxs0;->ζ:Ljava/lang/Object;

    const/4 v7, 0x1

    const/4 v8, 0x0

    packed-switch v2, :pswitch_data_0

    check-cast v6, Lnv0;

    check-cast v5, Ljava/lang/Class;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/reflect/Method;

    move-object/from16 v9, p3

    check-cast v9, [Ljava/lang/Object;

    .line 1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    sget-object v10, Lcm;->α:Ljava/util/Set;

    invoke-static {v1, v2, v9}, Lcm;->ζ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 4
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v1, v1

    if-ne v1, v4, :cond_4

    .line 5
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    aget-object v1, v1, v8

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    if-eqz v9, :cond_1

    .line 6
    invoke-static {v7, v9}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    :cond_1
    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v3

    .line 7
    :goto_0
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    :cond_3
    const-string v3, "provider"

    .line 9
    invoke-static {v6, v0, v1, v3}, Lcm;->ι(Lnv0;Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;)Z

    .line 10
    :cond_4
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lcm;->ε(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :goto_1
    return-object v1

    .line 11
    :pswitch_0
    sget-object v2, Lxb;->τ:Lu30;

    move-object v10, v0

    check-cast v10, Lps0;

    check-cast v6, La80;

    check-cast v5, La80;

    move-object v0, v1

    check-cast v0, Lkc;

    move-object/from16 v1, p2

    check-cast v1, Lv80;

    move-object/from16 v9, p3

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    sget-object v11, Lkn0;->ξ:Lpl1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit8 v12, v9, 0x6

    if-nez v12, :cond_6

    invoke-virtual {v1, v0}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    const/4 v4, 0x4

    :cond_5
    or-int/2addr v9, v4

    :cond_6
    and-int/lit8 v4, v9, 0x13

    const/16 v12, 0x12

    if-eq v4, v12, :cond_7

    move v4, v7

    goto :goto_2

    :cond_7
    move v4, v8

    :goto_2
    and-int/2addr v9, v7

    invoke-virtual {v1, v9, v4}, Lv80;->Ξ(IZ)Z

    move-result v4

    if-eqz v4, :cond_3b

    .line 12
    iget-object v4, v10, Lps0;->α:Ljava/util/List;

    iget-object v9, v10, Lps0;->β:Landroid/graphics/Bitmap;

    iget-boolean v12, v10, Lps0;->δ:Z

    .line 13
    new-instance v14, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v4, v15}, Lyh;->σ(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v14, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 15
    move-object/from16 v15, v16

    check-cast v15, Lxt0;

    .line 16
    iget-object v15, v15, Lxt0;->α:Ljava/lang/String;

    .line 17
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v15, 0xa

    goto :goto_3

    .line 18
    :cond_8
    invoke-virtual {v1, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v8

    .line 19
    invoke-virtual {v1}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v15

    .line 20
    sget-object v7, Lqn;->α:Li2;

    if-nez v8, :cond_9

    if-ne v15, v7, :cond_a

    .line 21
    :cond_9
    invoke-static {v3}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    move-result-object v15

    .line 22
    invoke-virtual {v1, v15}, Lv80;->е(Ljava/lang/Object;)V

    .line 23
    :cond_a
    check-cast v15, Lg21;

    .line 24
    invoke-virtual {v1, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v8

    move-object/from16 v22, v3

    .line 25
    invoke-virtual {v1}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v3

    if-nez v8, :cond_b

    if-ne v3, v7, :cond_c

    .line 26
    :cond_b
    invoke-static/range {v22 .. v22}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    move-result-object v3

    .line 27
    invoke-virtual {v1, v3}, Lv80;->е(Ljava/lang/Object;)V

    .line 28
    :cond_c
    check-cast v3, Lg21;

    .line 29
    invoke-virtual {v1, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v8

    .line 30
    invoke-virtual {v1}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v14

    if-nez v8, :cond_d

    if-ne v14, v7, :cond_e

    .line 31
    :cond_d
    invoke-static/range {v22 .. v22}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    move-result-object v14

    .line 32
    invoke-virtual {v1, v14}, Lv80;->е(Ljava/lang/Object;)V

    .line 33
    :cond_e
    check-cast v14, Lg21;

    .line 34
    sget-object v8, Lu1;->ε:Lm02;

    .line 35
    invoke-virtual {v1, v8}, Lv80;->ι(Lak1;)Ljava/lang/Object;

    move-result-object v8

    .line 36
    check-cast v8, Landroid/view/View;

    .line 37
    iget v13, v10, Lps0;->γ:I

    .line 38
    invoke-virtual {v1, v9}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v1, v13}, Lv80;->δ(I)Z

    move-result v13

    or-int v13, v16, v13

    move-object/from16 v16, v0

    .line 39
    invoke-virtual {v1}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 p3, v4

    const/16 v4, 0x1f

    if-nez v13, :cond_f

    if-ne v0, v7, :cond_11

    .line 40
    :cond_f
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_10

    if-eqz v9, :cond_10

    .line 41
    new-instance v0, Lm2;

    invoke-direct {v0, v9}, Lm2;-><init>(Landroid/graphics/Bitmap;)V

    goto :goto_4

    :cond_10
    move-object/from16 v0, v22

    .line 42
    :goto_4
    invoke-virtual {v1, v0}, Lv80;->е(Ljava/lang/Object;)V

    .line 43
    :cond_11
    check-cast v0, Lm2;

    .line 44
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v9, v4, :cond_12

    if-eqz v0, :cond_12

    const/4 v4, 0x1

    goto :goto_5

    :cond_12
    const/4 v4, 0x0

    .line 45
    :goto_5
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v13, 0x0

    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_14

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v23, v0

    .line 46
    move-object/from16 v0, v17

    check-cast v0, Lxt0;

    .line 47
    iget-boolean v0, v0, Lxt0;->δ:Z

    if-eqz v0, :cond_13

    goto :goto_7

    :cond_13
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, v23

    goto :goto_6

    :cond_14
    move-object/from16 v23, v0

    const/4 v0, -0x1

    move v13, v0

    :goto_7
    if-gez v13, :cond_15

    const/4 v13, 0x0

    :cond_15
    int-to-float v0, v13

    const v9, 0x3f51eb85    # 0.82f

    const/high16 v13, 0x43be0000    # 380.0f

    move/from16 v24, v4

    move-object/from16 v17, v11

    move-object/from16 v4, v22

    const/4 v11, 0x4

    .line 48
    invoke-static {v9, v13, v4, v11}, Lbd;->г(FFLjava/lang/Float;I)Lpz1;

    move-result-object v9

    .line 49
    const-string v4, "liquid-fallback-selected-index"

    .line 50
    invoke-static {v0, v9, v4, v1}, Ls3;->α(FLpz1;Ljava/lang/String;Lv80;)Lc02;

    move-result-object v0

    const v9, 0x3eeb851f    # 0.46f

    if-eqz v12, :cond_17

    const-wide v18, 0xff1c1c1eL

    move-object/from16 v20, v5

    .line 51
    invoke-static/range {v18 .. v19}, Lkn0;->β(J)J

    move-result-wide v4

    if-eqz v24, :cond_16

    goto :goto_8

    :cond_16
    const v9, 0x3f6b851f    # 0.92f

    :goto_8
    invoke-static {v4, v5, v9}, Lci;->β(JF)J

    move-result-wide v4

    :goto_9
    move v9, v12

    goto :goto_b

    :cond_17
    move-object/from16 v20, v5

    const-wide v4, 0xfff2f2f7L

    .line 52
    invoke-static {v4, v5}, Lkn0;->β(J)J

    move-result-wide v4

    if-eqz v24, :cond_18

    goto :goto_a

    :cond_18
    const v9, 0x3f6b851f    # 0.92f

    :goto_a
    invoke-static {v4, v5, v9}, Lci;->β(JF)J

    move-result-wide v4

    goto :goto_9

    .line 53
    :goto_b
    sget-wide v11, Lci;->β:J

    if-eqz v9, :cond_19

    const v13, 0x3e4ccccd    # 0.2f

    goto :goto_c

    :cond_19
    const v13, 0x3dcccccd    # 0.1f

    .line 54
    :goto_c
    invoke-static {v11, v12, v13}, Lci;->β(JF)J

    move-result-wide v28

    if-eqz v9, :cond_1a

    .line 55
    sget-wide v11, Lci;->γ:J

    const v13, 0x3df5c28f    # 0.12f

    .line 56
    invoke-static {v11, v12, v13}, Lci;->β(JF)J

    move-result-wide v11

    goto :goto_d

    .line 57
    :cond_1a
    sget-wide v11, Lci;->γ:J

    const v13, 0x3ed70a3d    # 0.42f

    .line 58
    invoke-static {v11, v12, v13}, Lci;->β(JF)J

    move-result-wide v11

    :goto_d
    if-eqz v9, :cond_1b

    move-wide/from16 v18, v11

    .line 59
    sget-wide v11, Lci;->γ:J

    const v9, 0x3e0f5c29    # 0.14f

    .line 60
    invoke-static {v11, v12, v9}, Lci;->β(JF)J

    move-result-wide v11

    goto :goto_e

    :cond_1b
    move-wide/from16 v18, v11

    .line 61
    sget-wide v11, Lci;->γ:J

    const v9, 0x3f147ae1    # 0.58f

    .line 62
    invoke-static {v11, v12, v9}, Lci;->β(JF)J

    move-result-wide v11

    .line 63
    :goto_e
    invoke-virtual/range {v16 .. v16}, Lkc;->α()F

    move-result v9

    .line 64
    new-instance v13, Liv;

    invoke-direct {v13, v9}, Liv;-><init>(F)V

    const/16 v9, 0x40

    int-to-float v9, v9

    move-object/from16 v21, v0

    .line 65
    new-instance v0, Liv;

    invoke-direct {v0, v9}, Liv;-><init>(F)V

    .line 66
    invoke-static {v13, v0}, Lbd;->Η(Liv;Liv;)Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Liv;

    .line 67
    iget v0, v0, Liv;->ε:F

    const/16 v9, 0x8

    int-to-float v9, v9

    sub-float v13, v0, v9

    move/from16 v25, v9

    .line 68
    new-instance v9, Liv;

    invoke-direct {v9, v13}, Liv;-><init>(F)V

    move-wide/from16 v32, v4

    const/4 v13, 0x1

    int-to-float v4, v13

    .line 69
    new-instance v5, Liv;

    invoke-direct {v5, v4}, Liv;-><init>(F)V

    .line 70
    invoke-virtual {v9, v5}, Liv;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-gez v4, :cond_1c

    goto :goto_f

    :cond_1c
    move-object v5, v9

    .line 71
    :goto_f
    invoke-virtual/range {v16 .. v16}, Lkc;->β()F

    move-result v4

    sub-float v4, v4, v25

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v4, v9

    .line 72
    sget-object v9, Lfo;->ξ:Lm02;

    .line 73
    invoke-virtual {v1, v9}, Lv80;->ι(Lak1;)Ljava/lang/Object;

    move-result-object v9

    .line 74
    sget-object v13, Lnp0;->ε:Lnp0;

    if-ne v9, v13, :cond_1d

    const/16 v34, 0x1

    goto :goto_10

    :cond_1d
    const/16 v34, 0x0

    .line 75
    :goto_10
    invoke-interface {v3}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Float;

    if-eqz v9, :cond_1e

    .line 76
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v9

    goto :goto_11

    .line 77
    :cond_1e
    invoke-interface/range {v21 .. v21}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    :goto_11
    if-eqz v34, :cond_1f

    move/from16 p2, v9

    const/4 v13, 0x4

    int-to-float v9, v13

    mul-float v16, v4, p2

    add-float v16, v16, v9

    goto :goto_12

    :cond_1f
    move/from16 p2, v9

    const/4 v13, 0x4

    .line 78
    invoke-virtual/range {v16 .. v16}, Lkc;->β()F

    move-result v9

    move/from16 v16, v9

    int-to-float v9, v13

    sub-float v9, v16, v9

    const/high16 v16, 0x3f800000    # 1.0f

    add-float v16, p2, v16

    mul-float v16, v16, v4

    sub-float v16, v9, v16

    .line 79
    :goto_12
    sget-object v9, Lxb;->ρ:Lu30;

    .line 80
    invoke-static {v9, v0}, Lxb;->Η(Lr01;F)Lr01;

    move-result-object v0

    const/16 v9, 0xa

    int-to-float v9, v9

    .line 81
    sget-object v27, Lyo1;->α:Lxo1;

    move-object/from16 p1, v5

    const/4 v13, 0x0

    int-to-float v5, v13

    .line 82
    invoke-static {v9, v5}, Liv;->α(FF)I

    move-result v13

    if-gtz v13, :cond_20

    move-object/from16 v9, v27

    goto :goto_13

    .line 83
    :cond_20
    new-instance v25, Lgv1;

    move-wide/from16 v30, v28

    move/from16 v26, v9

    invoke-direct/range {v25 .. v31}, Lgv1;-><init>(FLiv1;JJ)V

    move-object/from16 v13, v25

    move-object/from16 v9, v27

    invoke-interface {v0, v13}, Lr01;->β(Lr01;)Lr01;

    move-result-object v0

    :goto_13
    const v13, 0x7e7ff

    .line 84
    invoke-static {v0, v9, v13}, Lh62;->д(Lr01;Liv1;I)Lr01;

    move-result-object v0

    move/from16 v25, v4

    move/from16 v26, v5

    const-wide v4, 0x3fe6666666666666L    # 0.7

    double-to-float v4, v4

    .line 85
    new-instance v5, Lpx1;

    invoke-direct {v5, v11, v12}, Lpx1;-><init>(J)V

    .line 86
    new-instance v13, Lza;

    invoke-direct {v13, v4, v5, v9}, Lza;-><init>(FLpx1;Liv1;)V

    invoke-interface {v0, v13}, Lr01;->β(Lr01;)Lr01;

    move-result-object v0

    .line 87
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v4

    .line 88
    invoke-virtual {v1, v15}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v5

    .line 89
    invoke-virtual {v1}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v13

    if-nez v5, :cond_21

    if-ne v13, v7, :cond_22

    .line 90
    :cond_21
    new-instance v13, Lhp0;

    const/4 v5, 0x1

    invoke-direct {v13, v15, v5}, Lhp0;-><init>(Lg21;I)V

    .line 91
    invoke-virtual {v1, v13}, Lv80;->е(Ljava/lang/Object;)V

    .line 92
    :cond_22
    move-object v5, v13

    check-cast v5, La80;

    .line 93
    invoke-virtual {v1, v10}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v1, v6}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v21

    or-int v13, v13, v21

    move-object/from16 v21, v0

    .line 94
    invoke-virtual {v1}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v0

    if-nez v13, :cond_23

    if-ne v0, v7, :cond_24

    .line 95
    :cond_23
    new-instance v0, Lat0;

    const/4 v13, 0x0

    invoke-direct {v0, v10, v6, v13}, Lat0;-><init>(Lps0;La80;I)V

    .line 96
    invoke-virtual {v1, v0}, Lv80;->е(Ljava/lang/Object;)V

    .line 97
    :cond_24
    check-cast v0, La80;

    .line 98
    invoke-virtual {v1, v3}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v1, v15}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v27

    or-int v13, v13, v27

    invoke-virtual {v1, v10}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v27

    or-int v13, v13, v27

    invoke-virtual {v1, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v27

    or-int v13, v13, v27

    invoke-virtual {v1, v8}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v27

    or-int v13, v13, v27

    move-object/from16 v27, v0

    .line 99
    invoke-virtual {v1}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v0

    if-nez v13, :cond_25

    if-ne v0, v7, :cond_26

    :cond_25
    move-object v0, v9

    goto :goto_14

    :cond_26
    move-object/from16 p2, v9

    move-object v9, v0

    move-object/from16 v0, v17

    move-object/from16 v17, v5

    move-object/from16 v5, p2

    move/from16 p2, v4

    move-wide/from16 v35, v11

    move-object v13, v15

    move-object v12, v3

    move-object v11, v8

    move/from16 v8, v16

    move-wide/from16 v3, v18

    goto :goto_15

    .line 100
    :goto_14
    new-instance v9, Lbt0;

    move-object v13, v15

    const/4 v15, 0x0

    move-object/from16 p2, v5

    move-object v5, v0

    move-object/from16 v0, v17

    move-object/from16 v17, p2

    move/from16 p2, v4

    move-wide/from16 v35, v11

    move-object v12, v3

    move-object v11, v8

    move/from16 v8, v16

    move-wide/from16 v3, v18

    invoke-direct/range {v9 .. v15}, Lbt0;-><init>(Lps0;Landroid/view/View;Lg21;Lg21;Lg21;I)V

    .line 101
    invoke-virtual {v1, v9}, Lv80;->е(Ljava/lang/Object;)V

    .line 102
    :goto_15
    move-object/from16 v18, v9

    check-cast v18, La80;

    .line 103
    invoke-virtual {v1, v12}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v1, v10}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v9, v15

    invoke-virtual {v1, v13}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v9, v15

    invoke-virtual {v1, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v9, v15

    invoke-virtual {v1, v11}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v9, v15

    .line 104
    invoke-virtual {v1}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v15

    if-nez v9, :cond_27

    if-ne v15, v7, :cond_28

    .line 105
    :cond_27
    new-instance v9, Lbt0;

    const/4 v15, 0x1

    invoke-direct/range {v9 .. v15}, Lbt0;-><init>(Lps0;Landroid/view/View;Lg21;Lg21;Lg21;I)V

    .line 106
    invoke-virtual {v1, v9}, Lv80;->е(Ljava/lang/Object;)V

    move-object v15, v9

    .line 107
    :cond_28
    move-object/from16 v19, v15

    check-cast v19, La80;

    .line 108
    invoke-virtual {v1, v10}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v1, v6}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v9, v11

    move-object/from16 v11, v20

    invoke-virtual {v1, v11}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v9, v15

    invoke-virtual {v1, v12}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v9, v15

    invoke-virtual {v1, v13}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v9, v15

    invoke-virtual {v1, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v9, v15

    .line 109
    invoke-virtual {v1}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v15

    if-nez v9, :cond_2a

    if-ne v15, v7, :cond_29

    goto :goto_16

    :cond_29
    move-object/from16 v40, v12

    move-object v12, v11

    move-object v11, v13

    move-object/from16 v13, v40

    goto :goto_17

    .line 110
    :cond_2a
    :goto_16
    new-instance v9, Lct0;

    const/16 v16, 0x0

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v6

    invoke-direct/range {v9 .. v16}, Lct0;-><init>(Lps0;La80;La80;Lg21;Lg21;Lg21;I)V

    move-object v11, v14

    move-object v14, v15

    .line 111
    invoke-virtual {v1, v9}, Lv80;->е(Ljava/lang/Object;)V

    move-object v15, v9

    .line 112
    :goto_17
    check-cast v15, Le80;

    .line 113
    invoke-virtual {v1, v13}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v1, v11}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    or-int v9, v9, v16

    invoke-virtual {v1, v14}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v16

    or-int v9, v9, v16

    move/from16 v16, v9

    .line 114
    invoke-virtual {v1}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v9

    if-nez v16, :cond_2c

    if-ne v9, v7, :cond_2b

    goto :goto_18

    :cond_2b
    move-object/from16 v20, v12

    goto :goto_19

    .line 115
    :cond_2c
    :goto_18
    new-instance v9, Lrs0;

    move-object/from16 v20, v12

    const/4 v12, 0x0

    invoke-direct {v9, v13, v11, v14, v12}, Lrs0;-><init>(Lg21;Lg21;Lg21;I)V

    .line 116
    invoke-virtual {v1, v9}, Lv80;->е(Ljava/lang/Object;)V

    .line 117
    :goto_19
    check-cast v9, Lp70;

    move-object v14, v11

    move-object/from16 v11, v21

    const/16 v21, 0x0

    move-object/from16 v12, v20

    move-object/from16 v20, v1

    move-object v1, v12

    move-object/from16 v12, v19

    move-object/from16 v19, v9

    move-object v9, v14

    move-object/from16 v14, v17

    move-object/from16 v17, v12

    move/from16 v12, p2

    move-object/from16 v16, v18

    move-object/from16 v18, v15

    move-object/from16 v15, v27

    move-object/from16 v27, v13

    move/from16 v13, v34

    .line 118
    invoke-static/range {v11 .. v21}, Ls1;->ο(Lr01;IZLa80;La80;La80;La80;Le80;Lp70;Lv80;I)Lr01;

    move-result-object v11

    move-object/from16 v15, v20

    .line 119
    sget-object v12, Lx;->ζ:Laa;

    .line 120
    invoke-static {v12}, Lec;->δ(Laa;)Lpx0;

    move-result-object v12

    .line 121
    iget-wide v13, v15, Lv80;->Χ:J

    .line 122
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    .line 123
    invoke-virtual {v15}, Lv80;->λ()Landroidx/compose/runtime/internal/α;

    move-result-object v14

    .line 124
    invoke-static {v15, v11}, Lpd2;->Γ(Lv80;Lr01;)Lr01;

    move-result-object v11

    .line 125
    sget-object v16, Lln;->β:Lkn;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p2, v9

    .line 126
    sget-object v9, Lkn;->β:Lu40;

    .line 127
    invoke-virtual {v15}, Lv80;->Ψ()V

    move/from16 v16, v13

    .line 128
    iget-boolean v13, v15, Lv80;->Φ:Z

    if-eqz v13, :cond_2d

    .line 129
    invoke-virtual {v15, v9}, Lv80;->κ(Lp70;)V

    goto :goto_1a

    .line 130
    :cond_2d
    invoke-virtual {v15}, Lv80;->и()V

    .line 131
    :goto_1a
    sget-object v13, Lkn;->ε:Lui;

    .line 132
    invoke-static {v13, v15, v12}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 133
    sget-object v12, Lkn;->δ:Lui;

    .line 134
    invoke-static {v12, v15, v14}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 135
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move-object/from16 v16, v12

    .line 136
    sget-object v12, Lkn;->ζ:Lui;

    .line 137
    invoke-static {v12, v15, v14}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 138
    sget-object v14, Lkn;->η:La1;

    .line 139
    invoke-static {v15, v14}, Le81;->ξ(Lv80;La80;)V

    move-object/from16 v17, v12

    .line 140
    sget-object v12, Lkn;->γ:Lui;

    .line 141
    invoke-static {v12, v15, v11}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 142
    sget-object v18, Lx;->υ:Lx;

    if-eqz v24, :cond_2f

    const v11, -0x27f22653

    .line 143
    invoke-virtual {v15, v11}, Lv80;->Φ(I)V

    const/16 v11, 0xc

    int-to-float v11, v11

    move-object/from16 v19, v12

    move/from16 v12, v26

    .line 144
    invoke-static {v11, v12}, Liv;->α(FF)I

    move-result v20

    if-lez v20, :cond_2e

    invoke-static {v11, v12}, Liv;->α(FF)I

    move-result v20

    :cond_2e
    move/from16 v26, v12

    .line 145
    new-instance v12, Loa;

    move-object/from16 v21, v1

    move-object/from16 v20, v13

    const/4 v1, 0x0

    const/4 v13, 0x1

    invoke-direct {v12, v11, v11, v1, v13}, Loa;-><init>(FFIZ)V

    invoke-static {v2, v12}, Lh62;->г(Lr01;La80;)Lr01;

    move-result-object v13

    const/4 v12, 0x0

    move-object/from16 v11, v16

    const/16 v16, 0x61b0

    move-object/from16 v24, v14

    .line 146
    sget-object v14, Ljp;->β:Li2;

    move-object/from16 v28, v7

    move-object/from16 v37, v17

    move-object/from16 v39, v19

    move-object/from16 v38, v24

    move/from16 v7, v26

    move-object/from16 v19, v6

    move-object/from16 v6, v20

    move-object/from16 v20, v10

    move-object v10, v11

    move-object/from16 v11, v23

    invoke-static/range {v11 .. v16}, Lyh;->δ(Lm2;Ljava/lang/String;Lr01;Li2;Lv80;I)V

    .line 147
    :goto_1b
    invoke-virtual {v15, v1}, Lv80;->ο(Z)V

    move-wide/from16 v11, v32

    goto :goto_1c

    :cond_2f
    move-object/from16 v21, v1

    move-object/from16 v19, v6

    move-object/from16 v28, v7

    move-object/from16 v20, v10

    move-object/from16 v39, v12

    move-object v6, v13

    move-object/from16 v38, v14

    move-object/from16 v10, v16

    move-object/from16 v37, v17

    move/from16 v7, v26

    const/4 v1, 0x0

    const v11, -0x289bf50b

    .line 148
    invoke-virtual {v15, v11}, Lv80;->Φ(I)V

    goto :goto_1b

    .line 149
    :goto_1c
    invoke-static {v2, v11, v12, v0}, Lln0;->κ(Lr01;JLiv1;)Lr01;

    move-result-object v0

    .line 150
    invoke-static {v0, v15, v1}, Lec;->α(Lr01;Lv80;I)V

    .line 151
    invoke-virtual/range {v18 .. v18}, Lx;->η()Lr01;

    move-result-object v0

    .line 152
    invoke-static {v0, v8, v7}, Lbd;->Ι(Lr01;FF)Lr01;

    move-result-object v0

    move/from16 v1, v25

    .line 153
    invoke-static {v0, v1}, Lxb;->е(Lr01;F)Lr01;

    move-result-object v0

    move-object/from16 v1, p1

    .line 154
    iget v1, v1, Liv;->ε:F

    invoke-static {v0, v1}, Lxb;->Η(Lr01;F)Lr01;

    move-result-object v0

    .line 155
    invoke-static {v0, v3, v4, v5}, Lln0;->κ(Lr01;JLiv1;)Lr01;

    move-result-object v0

    const-wide v3, 0x3fe4cccccccccccdL    # 0.65

    double-to-float v1, v3

    .line 156
    new-instance v3, Lpx1;

    move-wide/from16 v11, v35

    invoke-direct {v3, v11, v12}, Lpx1;-><init>(J)V

    .line 157
    new-instance v4, Lza;

    invoke-direct {v4, v1, v3, v5}, Lza;-><init>(FLpx1;Liv1;)V

    invoke-interface {v0, v4}, Lr01;->β(Lr01;)Lr01;

    move-result-object v0

    const/4 v13, 0x0

    .line 158
    invoke-static {v0, v15, v13}, Lec;->α(Lr01;Lv80;I)V

    const/4 v13, 0x4

    int-to-float v0, v13

    .line 159
    invoke-static {v2, v0}, Lyh;->е(Lr01;F)Lr01;

    move-result-object v0

    .line 160
    sget-object v1, Lu6;->α:Li2;

    .line 161
    invoke-static {v15}, Lfp1;->α(Lv80;)Lgp1;

    move-result-object v1

    .line 162
    iget-wide v2, v15, Lv80;->Χ:J

    .line 163
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    .line 164
    invoke-virtual {v15}, Lv80;->λ()Landroidx/compose/runtime/internal/α;

    move-result-object v3

    .line 165
    invoke-static {v15, v0}, Lpd2;->Γ(Lv80;Lr01;)Lr01;

    move-result-object v0

    .line 166
    invoke-virtual {v15}, Lv80;->Ψ()V

    .line 167
    iget-boolean v4, v15, Lv80;->Φ:Z

    if-eqz v4, :cond_30

    .line 168
    invoke-virtual {v15, v9}, Lv80;->κ(Lp70;)V

    goto :goto_1d

    .line 169
    :cond_30
    invoke-virtual {v15}, Lv80;->и()V

    .line 170
    :goto_1d
    invoke-static {v6, v15, v1}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 171
    invoke-static {v10, v15, v3}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 172
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v37

    invoke-static {v2, v15, v1}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    move-object/from16 v1, v38

    .line 173
    invoke-static {v15, v1}, Le81;->ξ(Lv80;La80;)V

    move-object/from16 v1, v39

    .line 174
    invoke-static {v1, v15, v0}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    const v0, 0x5a028d9b

    .line 175
    invoke-virtual {v15, v0}, Lv80;->Φ(I)V

    .line 176
    invoke-interface/range {p3 .. p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-ltz v1, :cond_39

    move-object v11, v2

    check-cast v11, Lxt0;

    .line 177
    invoke-interface/range {v27 .. v27}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    if-eqz v2, :cond_32

    .line 178
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-static {v2}, Ljx0;->в(F)I

    move-result v2

    if-ne v2, v1, :cond_31

    const/4 v2, 0x1

    goto :goto_1f

    :cond_31
    const/4 v2, 0x0

    :goto_1f
    move v12, v2

    goto :goto_20

    .line 179
    :cond_32
    iget-boolean v2, v11, Lxt0;->δ:Z

    goto :goto_1f

    .line 180
    :goto_20
    invoke-interface/range {p2 .. p2}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_33

    goto :goto_22

    .line 181
    :cond_33
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_34

    const/4 v13, 0x1

    :goto_21
    move-object/from16 v10, v20

    goto :goto_23

    :cond_34
    :goto_22
    const/4 v13, 0x0

    goto :goto_21

    .line 182
    :goto_23
    iget-boolean v14, v10, Lps0;->δ:Z

    move-object/from16 v6, v19

    .line 183
    invoke-virtual {v15, v6}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v15, v11}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 184
    invoke-virtual {v15}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_35

    move-object/from16 v1, v28

    if-ne v2, v1, :cond_36

    goto :goto_24

    :cond_35
    move-object/from16 v1, v28

    .line 185
    :goto_24
    new-instance v2, Lss0;

    const/4 v4, 0x0

    invoke-direct {v2, v6, v11, v4}, Lss0;-><init>(La80;Lxt0;I)V

    .line 186
    invoke-virtual {v15, v2}, Lv80;->е(Ljava/lang/Object;)V

    .line 187
    :cond_36
    check-cast v2, Lp70;

    move-object/from16 v5, v21

    .line 188
    invoke-virtual {v15, v5}, Lv80;->ε(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v15, v11}, Lv80;->η(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    .line 189
    invoke-virtual {v15}, Lv80;->Λ()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_38

    if-ne v7, v1, :cond_37

    goto :goto_25

    :cond_37
    const/4 v4, 0x1

    goto :goto_26

    .line 190
    :cond_38
    :goto_25
    new-instance v7, Lss0;

    const/4 v4, 0x1

    invoke-direct {v7, v5, v11, v4}, Lss0;-><init>(La80;Lxt0;I)V

    .line 191
    invoke-virtual {v15, v7}, Lv80;->е(Ljava/lang/Object;)V

    .line 192
    :goto_26
    move-object/from16 v16, v7

    check-cast v16, Lp70;

    const/16 v18, 0x6

    move-object/from16 v17, v15

    move-object v15, v2

    .line 193
    invoke-static/range {v11 .. v18}, Ljx0;->ε(Lxt0;ZZZLp70;Lp70;Lv80;I)V

    move-object/from16 v28, v1

    move v1, v3

    move-object/from16 v21, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v10

    move-object/from16 v15, v17

    goto/16 :goto_1e

    .line 194
    :cond_39
    invoke-static {}, Lyh;->х()V

    const/16 v22, 0x0

    throw v22

    :cond_3a
    const/4 v4, 0x1

    const/4 v13, 0x0

    .line 195
    invoke-virtual {v15, v13}, Lv80;->ο(Z)V

    .line 196
    invoke-virtual {v15, v4}, Lv80;->ο(Z)V

    .line 197
    invoke-virtual {v15, v4}, Lv80;->ο(Z)V

    goto :goto_27

    :cond_3b
    move-object v15, v1

    .line 198
    invoke-virtual {v15}, Lv80;->Ρ()V

    .line 199
    :goto_27
    sget-object v0, Ls62;->α:Ls62;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
