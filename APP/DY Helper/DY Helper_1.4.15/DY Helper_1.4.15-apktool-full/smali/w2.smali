.class public final Lw2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lo91;


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Lw32;

.field public final γ:Ljava/util/List;

.field public final δ:Ljava/util/List;

.field public final ε:Lf50;

.field public final ζ:Lyr;

.field public final η:Ld3;

.field public final θ:Ljava/lang/CharSequence;

.field public final ι:Lpp0;

.field public κ:Lm6;

.field public final λ:Z

.field public final μ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lw32;Ljava/util/List;Ljava/util/List;Lf50;Lyr;)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p1

    .line 2
    iput-object v4, v0, Lw2;->α:Ljava/lang/String;

    .line 3
    iput-object v1, v0, Lw2;->β:Lw32;

    .line 4
    iput-object v2, v0, Lw2;->γ:Ljava/util/List;

    move-object/from16 v4, p4

    .line 5
    iput-object v4, v0, Lw2;->δ:Ljava/util/List;

    move-object/from16 v4, p5

    .line 6
    iput-object v4, v0, Lw2;->ε:Lf50;

    .line 7
    iput-object v3, v0, Lw2;->ζ:Lyr;

    .line 8
    new-instance v4, Ld3;

    invoke-interface {v3}, Lyr;->β()F

    move-result v5

    const/4 v6, 0x1

    .line 9
    invoke-direct {v4, v6}, Landroid/text/TextPaint;-><init>(I)V

    .line 10
    iput v5, v4, Landroid/text/TextPaint;->density:F

    .line 11
    sget-object v5, Lc32;->β:Lc32;

    iput-object v5, v4, Ld3;->β:Lc32;

    const/4 v5, 0x3

    .line 12
    iput v5, v4, Ld3;->γ:I

    .line 13
    sget-object v7, Lfv1;->δ:Lfv1;

    .line 14
    iput-object v7, v4, Ld3;->δ:Lfv1;

    .line 15
    iput-object v4, v0, Lw2;->η:Ld3;

    .line 16
    invoke-static {v1}, Ls1;->β(Lw32;)Z

    move-result v7

    iget-object v8, v1, Lw32;->α:Lux1;

    iget-object v1, v1, Lw32;->β:Lr91;

    const/4 v9, 0x0

    if-nez v7, :cond_0

    move v7, v9

    goto :goto_1

    .line 17
    :cond_0
    sget-object v7, Lmy;->α:Ln;

    .line 18
    sget-object v7, Lmy;->α:Ln;

    .line 19
    iget-object v10, v7, Ln;->ζ:Ljava/lang/Object;

    check-cast v10, Lc02;

    if-eqz v10, :cond_1

    goto :goto_0

    .line 20
    :cond_1
    invoke-static {}, Ljy;->γ()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 21
    invoke-virtual {v7}, Ln;->υ()Lc02;

    move-result-object v10

    iput-object v10, v7, Ln;->ζ:Ljava/lang/Object;

    goto :goto_0

    .line 22
    :cond_2
    sget-object v10, Lbd;->κ:Ljl0;

    .line 23
    :goto_0
    invoke-interface {v10}, Lc02;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 24
    :goto_1
    iput-boolean v7, v0, Lw2;->λ:Z

    .line 25
    iget v7, v1, Lr91;->β:I

    .line 26
    iget-object v10, v8, Lux1;->λ:Lav0;

    const/4 v11, 0x4

    const/4 v13, 0x2

    if-ne v7, v11, :cond_4

    :cond_3
    :goto_2
    move v7, v13

    goto :goto_4

    :cond_4
    const/4 v11, 0x5

    if-ne v7, v11, :cond_6

    :cond_5
    move v7, v5

    goto :goto_4

    :cond_6
    if-ne v7, v6, :cond_7

    move v7, v9

    goto :goto_4

    :cond_7
    if-ne v7, v13, :cond_8

    move v7, v6

    goto :goto_4

    :cond_8
    if-ne v7, v5, :cond_9

    goto :goto_3

    :cond_9
    if-nez v7, :cond_77

    :goto_3
    if-eqz v10, :cond_a

    .line 27
    iget-object v7, v10, Lav0;->ε:Ljava/lang/Object;

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lzu0;

    .line 28
    iget-object v7, v7, Lzu0;->α:Ljava/util/Locale;

    if-nez v7, :cond_b

    .line 29
    :cond_a
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    .line 30
    :cond_b
    invoke-static {v7}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v7

    if-eqz v7, :cond_3

    if-eq v7, v6, :cond_5

    goto :goto_2

    .line 31
    :goto_4
    iput v7, v0, Lw2;->μ:I

    .line 32
    new-instance v7, Lv2;

    invoke-direct {v7, v0}, Lv2;-><init>(Lw2;)V

    .line 33
    iget-object v1, v1, Lr91;->ι:Lq32;

    if-nez v1, :cond_c

    .line 34
    sget-object v1, Lq32;->γ:Lq32;

    .line 35
    :cond_c
    iget-boolean v10, v1, Lq32;->β:Z

    if-eqz v10, :cond_d

    .line 36
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v10

    or-int/lit16 v10, v10, 0x80

    goto :goto_5

    .line 37
    :cond_d
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v10

    and-int/lit16 v10, v10, -0x81

    .line 38
    :goto_5
    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setFlags(I)V

    .line 39
    iget v1, v1, Lq32;->α:I

    if-ne v1, v6, :cond_e

    .line 40
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x40

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 41
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_e
    if-ne v1, v13, :cond_f

    .line 42
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 43
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_f
    if-ne v1, v5, :cond_10

    .line 44
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 45
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    .line 46
    :cond_10
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 47
    :goto_6
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v1

    move v5, v9

    :goto_7
    if-ge v5, v1, :cond_12

    .line 48
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 49
    move-object v11, v10

    check-cast v11, Lf4;

    .line 50
    iget-object v11, v11, Lf4;->α:Ljava/lang/Object;

    .line 51
    instance-of v11, v11, Lux1;

    if-eqz v11, :cond_11

    goto :goto_8

    :cond_11
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_12
    const/4 v10, 0x0

    :goto_8
    if-eqz v10, :cond_13

    move v1, v6

    goto :goto_9

    :cond_13
    move v1, v9

    .line 52
    :goto_9
    iget-wide v10, v8, Lux1;->β:J

    iget-object v2, v8, Lux1;->γ:Ld60;

    iget-object v5, v8, Lux1;->δ:Lb60;

    iget-object v14, v8, Lux1;->η:Ljava/lang/String;

    iget-object v15, v8, Lux1;->λ:Lav0;

    const/16 p1, 0x0

    iget-object v12, v8, Lux1;->α:Lf32;

    move/from16 p4, v6

    iget-object v6, v8, Lux1;->κ:Lg32;

    move-object/from16 p3, v14

    iget-wide v13, v8, Lux1;->θ:J

    move-wide/from16 v16, v10

    .line 53
    invoke-static/range {v16 .. v17}, Ly32;->β(J)J

    move-result-wide v9

    move v11, v1

    move-object/from16 v18, v2

    const-wide v1, 0x100000000L

    .line 54
    invoke-static {v9, v10, v1, v2}, Lz32;->α(JJ)Z

    move-result v19

    if-eqz v19, :cond_14

    move-wide/from16 v1, v16

    invoke-interface {v3, v1, v2}, Lyr;->д(J)F

    move-result v1

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_a

    :cond_14
    const-wide v1, 0x200000000L

    .line 55
    invoke-static {v9, v10, v1, v2}, Lz32;->α(JJ)Z

    move-result v9

    if-eqz v9, :cond_15

    .line 56
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    invoke-static/range {v16 .. v17}, Ly32;->γ(J)F

    move-result v2

    mul-float/2addr v2, v1

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 57
    :cond_15
    :goto_a
    iget-object v1, v8, Lux1;->ζ:Lbr;

    if-nez v1, :cond_17

    if-nez v5, :cond_17

    if-eqz v18, :cond_16

    goto :goto_b

    :cond_16
    move/from16 v16, v11

    goto :goto_10

    :cond_17
    :goto_b
    if-nez v18, :cond_18

    .line 58
    sget-object v2, Ld60;->η:Ld60;

    goto :goto_c

    :cond_18
    move-object/from16 v2, v18

    :goto_c
    if-eqz v5, :cond_19

    .line 59
    iget v5, v5, Lb60;->α:I

    goto :goto_d

    :cond_19
    const/4 v5, 0x0

    .line 60
    :goto_d
    iget-object v9, v8, Lux1;->ε:Lc60;

    if-eqz v9, :cond_1a

    .line 61
    iget v9, v9, Lc60;->α:I

    goto :goto_e

    :cond_1a
    const v9, 0xffff

    .line 62
    :goto_e
    iget-object v10, v7, Lv2;->ε:Lw2;

    move/from16 v16, v11

    iget-object v11, v10, Lw2;->ε:Lf50;

    check-cast v11, Lg50;

    invoke-virtual {v11, v1, v2, v5, v9}, Lg50;->β(Lbr;Ld60;II)Ln62;

    move-result-object v1

    .line 63
    instance-of v2, v1, Ln62;

    if-nez v2, :cond_1b

    .line 64
    new-instance v2, Lm6;

    iget-object v5, v10, Lw2;->κ:Lm6;

    invoke-direct {v2, v1, v5}, Lm6;-><init>(Ln62;Lm6;)V

    .line 65
    iput-object v2, v10, Lw2;->κ:Lm6;

    .line 66
    iget-object v1, v2, Lm6;->θ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Landroid/graphics/Typeface;

    goto :goto_f

    .line 67
    :cond_1b
    iget-object v1, v1, Ln62;->ε:Ljava/lang/Object;

    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Landroid/graphics/Typeface;

    .line 69
    :goto_f
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_10
    const/16 v1, 0xa

    if-eqz v15, :cond_1d

    .line 70
    sget-object v2, Lav0;->η:Lav0;

    invoke-static {}, Lln0;->Ι()Lav0;

    move-result-object v2

    .line 71
    invoke-virtual {v15, v2}, Lav0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    .line 72
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v15, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    iget-object v5, v15, Lav0;->ε:Ljava/lang/Object;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 74
    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 75
    check-cast v9, Lzu0;

    .line 76
    iget-object v9, v9, Lzu0;->α:Ljava/util/Locale;

    .line 77
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_1c
    const/4 v9, 0x0

    .line 78
    new-array v5, v9, [Ljava/util/Locale;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 79
    check-cast v2, [Ljava/util/Locale;

    array-length v5, v2

    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/util/Locale;

    new-instance v5, Landroid/os/LocaleList;

    invoke-direct {v5, v2}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 80
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextLocales(Landroid/os/LocaleList;)V

    :cond_1d
    if-eqz p3, :cond_1e

    .line 81
    const-string v2, ""

    move-object/from16 v5, p3

    .line 82
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    .line 83
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_1e
    if-eqz v6, :cond_1f

    .line 84
    sget-object v2, Lg32;->γ:Lg32;

    .line 85
    invoke-virtual {v6, v2}, Lg32;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    .line 86
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v2

    .line 87
    iget v5, v6, Lg32;->α:F

    mul-float/2addr v2, v5

    .line 88
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 89
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v2

    .line 90
    iget v5, v6, Lg32;->β:F

    add-float/2addr v2, v5

    .line 91
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 92
    :cond_1f
    invoke-interface {v12}, Lf32;->β()J

    move-result-wide v5

    .line 93
    invoke-virtual {v4, v5, v6}, Ld3;->δ(J)V

    .line 94
    invoke-interface {v12}, Lf32;->δ()Lkn0;

    move-result-object v2

    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 95
    invoke-interface {v12}, Lf32;->ε()F

    move-result v9

    .line 96
    invoke-virtual {v4, v2, v5, v6, v9}, Ld3;->γ(Lkn0;JF)V

    .line 97
    iget-object v2, v8, Lux1;->ξ:Lfv1;

    .line 98
    invoke-virtual {v4, v2}, Ld3;->ζ(Lfv1;)V

    .line 99
    iget-object v2, v8, Lux1;->ν:Lc32;

    .line 100
    invoke-virtual {v4, v2}, Ld3;->η(Lc32;)V

    .line 101
    iget-object v2, v8, Lux1;->ο:Lkn0;

    .line 102
    invoke-virtual {v4, v2}, Ld3;->ε(Lkn0;)V

    .line 103
    invoke-static {v13, v14}, Ly32;->β(J)J

    move-result-wide v5

    const-wide v9, 0x100000000L

    invoke-static {v5, v6, v9, v10}, Lz32;->α(JJ)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_22

    invoke-static {v13, v14}, Ly32;->γ(J)F

    move-result v2

    cmpg-float v2, v2, v5

    if-nez v2, :cond_20

    goto :goto_12

    .line 104
    :cond_20
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v6

    mul-float/2addr v6, v2

    .line 105
    invoke-interface {v3, v13, v14}, Lyr;->д(J)F

    move-result v2

    cmpg-float v3, v6, v5

    if-nez v3, :cond_21

    goto :goto_13

    :cond_21
    div-float/2addr v2, v6

    .line 106
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_13

    .line 107
    :cond_22
    :goto_12
    invoke-static {v13, v14}, Ly32;->β(J)J

    move-result-wide v2

    const-wide v9, 0x200000000L

    invoke-static {v2, v3, v9, v10}, Lz32;->α(JJ)Z

    move-result v2

    if-eqz v2, :cond_23

    .line 108
    invoke-static {v13, v14}, Ly32;->γ(J)F

    move-result v2

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 109
    :cond_23
    :goto_13
    iget-wide v2, v8, Lux1;->μ:J

    .line 110
    iget-object v4, v8, Lux1;->ι:Lr8;

    if-eqz v16, :cond_25

    .line 111
    invoke-static {v13, v14}, Ly32;->β(J)J

    move-result-wide v8

    const-wide v10, 0x100000000L

    invoke-static {v8, v9, v10, v11}, Lz32;->α(JJ)Z

    move-result v6

    if-eqz v6, :cond_25

    invoke-static {v13, v14}, Ly32;->γ(J)F

    move-result v6

    cmpg-float v6, v6, v5

    if-nez v6, :cond_24

    goto :goto_14

    :cond_24
    move/from16 v6, p4

    goto :goto_15

    :cond_25
    :goto_14
    const/4 v6, 0x0

    .line 112
    :goto_15
    sget-wide v8, Lci;->η:J

    .line 113
    invoke-static {v2, v3, v8, v9}, Lci;->γ(JJ)Z

    move-result v10

    if-nez v10, :cond_26

    .line 114
    sget-wide v10, Lci;->ζ:J

    .line 115
    invoke-static {v2, v3, v10, v11}, Lci;->γ(JJ)Z

    move-result v10

    if-nez v10, :cond_26

    move/from16 v10, p4

    goto :goto_16

    :cond_26
    const/4 v10, 0x0

    :goto_16
    if-eqz v4, :cond_28

    .line 116
    iget v11, v4, Lr8;->α:F

    .line 117
    invoke-static {v11, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v11

    if-nez v11, :cond_27

    goto :goto_17

    :cond_27
    move/from16 v11, p4

    goto :goto_18

    :cond_28
    :goto_17
    const/4 v11, 0x0

    :goto_18
    if-nez v6, :cond_29

    if-nez v10, :cond_29

    if-nez v11, :cond_29

    move-object/from16 v2, p1

    goto :goto_1d

    :cond_29
    if-eqz v6, :cond_2a

    :goto_19
    move-wide/from16 v30, v13

    goto :goto_1a

    .line 118
    :cond_2a
    sget-wide v13, Ly32;->γ:J

    goto :goto_19

    :goto_1a
    if-eqz v10, :cond_2b

    move-wide/from16 v35, v2

    goto :goto_1b

    :cond_2b
    move-wide/from16 v35, v8

    :goto_1b
    if-eqz v11, :cond_2c

    move-object/from16 v32, v4

    goto :goto_1c

    :cond_2c
    move-object/from16 v32, p1

    .line 119
    :goto_1c
    new-instance v20, Lux1;

    const/16 v38, 0x0

    const v39, 0xf67f

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v20 .. v39}, Lux1;-><init>(JJLd60;Lb60;Lc60;Lbr;Ljava/lang/String;JLr8;Lg32;Lav0;JLc32;Lfv1;I)V

    move-object/from16 v2, v20

    .line 120
    :goto_1d
    iget-object v3, v0, Lw2;->γ:Ljava/util/List;

    if-eqz v2, :cond_2f

    .line 121
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, 0x0

    :goto_1e
    if-ge v6, v3, :cond_2e

    if-nez v6, :cond_2d

    .line 122
    new-instance v8, Lf4;

    .line 123
    iget-object v9, v0, Lw2;->α:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x0

    .line 124
    invoke-direct {v8, v10, v9, v2}, Lf4;-><init>(IILjava/lang/Object;)V

    goto :goto_1f

    .line 125
    :cond_2d
    iget-object v8, v0, Lw2;->γ:Ljava/util/List;

    add-int/lit8 v9, v6, -0x1

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf4;

    .line 126
    :goto_1f
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1e

    :cond_2e
    move-object v3, v4

    .line 127
    :cond_2f
    iget-object v2, v0, Lw2;->α:Ljava/lang/String;

    .line 128
    iget-object v4, v0, Lw2;->η:Ld3;

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v4

    .line 129
    iget-object v6, v0, Lw2;->β:Lw32;

    .line 130
    iget-object v8, v0, Lw2;->δ:Ljava/util/List;

    .line 131
    iget-object v12, v0, Lw2;->ζ:Lyr;

    .line 132
    iget-boolean v9, v0, Lw2;->λ:Z

    .line 133
    sget-object v10, Lu2;->α:Lt2;

    if-eqz v9, :cond_33

    .line 134
    invoke-static {}, Ljy;->γ()Z

    move-result v9

    if-eqz v9, :cond_33

    .line 135
    iget-object v9, v6, Lw32;->γ:Lnh1;

    if-eqz v9, :cond_30

    .line 136
    iget-object v9, v9, Lnh1;->α:Lkh1;

    if-eqz v9, :cond_30

    .line 137
    iget v9, v9, Lkh1;->β:I

    .line 138
    new-instance v10, Lxy;

    invoke-direct {v10, v9}, Lxy;-><init>(I)V

    goto :goto_20

    :cond_30
    move-object/from16 v10, p1

    :goto_20
    if-nez v10, :cond_32

    :cond_31
    const/4 v9, 0x0

    goto :goto_21

    .line 139
    :cond_32
    iget v9, v10, Lxy;->α:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_31

    move/from16 v9, p4

    .line 140
    :goto_21
    invoke-static {}, Ljy;->α()Ljy;

    move-result-object v10

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v13, 0x0

    invoke-virtual {v10, v13, v11, v9, v2}, Ljy;->ζ(IIILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_22

    :cond_33
    move-object v9, v2

    .line 141
    :goto_22
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v10

    const-wide/16 v13, 0x0

    const-wide v15, 0xff00000000L

    if-eqz v10, :cond_34

    .line 142
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_34

    .line 143
    iget-object v10, v6, Lw32;->β:Lr91;

    .line 144
    iget-object v10, v10, Lr91;->δ:Lh32;

    .line 145
    sget-object v11, Lh32;->γ:Lh32;

    .line 146
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_34

    .line 147
    iget-object v10, v6, Lw32;->β:Lr91;

    .line 148
    iget-wide v10, v10, Lr91;->γ:J

    and-long/2addr v10, v15

    cmp-long v10, v10, v13

    if-nez v10, :cond_34

    goto/16 :goto_4c

    .line 149
    :cond_34
    instance-of v10, v9, Landroid/text/Spannable;

    if-eqz v10, :cond_35

    .line 150
    check-cast v9, Landroid/text/Spannable;

    goto :goto_23

    .line 151
    :cond_35
    new-instance v10, Landroid/text/SpannableString;

    invoke-direct {v10, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v9, v10

    .line 152
    :goto_23
    iget-object v10, v6, Lw32;->α:Lux1;

    iget-object v11, v6, Lw32;->β:Lr91;

    .line 153
    iget-object v10, v10, Lux1;->ν:Lc32;

    move/from16 p2, v5

    .line 154
    sget-object v5, Lc32;->γ:Lc32;

    invoke-static {v10, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/16 v10, 0x21

    if-eqz v5, :cond_36

    .line 155
    sget-object v5, Lu2;->α:Lt2;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    move-wide/from16 v17, v13

    const/4 v13, 0x0

    .line 156
    invoke-interface {v9, v5, v13, v2, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_24

    :cond_36
    move-wide/from16 v17, v13

    .line 157
    :goto_24
    iget-object v2, v6, Lw32;->γ:Lnh1;

    if-eqz v2, :cond_37

    .line 158
    iget-object v2, v2, Lnh1;->α:Lkh1;

    if-eqz v2, :cond_37

    .line 159
    iget-boolean v2, v2, Lkh1;->α:Z

    goto :goto_25

    :cond_37
    const/4 v2, 0x0

    :goto_25
    if-eqz v2, :cond_39

    .line 160
    iget-object v2, v11, Lr91;->ζ:Lwr0;

    if-nez v2, :cond_39

    .line 161
    iget-wide v1, v11, Lr91;->γ:J

    .line 162
    invoke-static {v1, v2, v4, v12}, Lp91;->ω(JFLyr;)F

    move-result v1

    .line 163
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_38

    .line 164
    new-instance v2, Lsr0;

    invoke-direct {v2, v1}, Lsr0;-><init>(F)V

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v13, 0x0

    .line 165
    invoke-interface {v9, v2, v13, v1, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_38
    const/4 v13, 0x0

    goto :goto_2b

    .line 166
    :cond_39
    iget-object v2, v11, Lr91;->ζ:Lwr0;

    if-nez v2, :cond_3a

    .line 167
    sget-object v2, Lwr0;->δ:Lwr0;

    .line 168
    :cond_3a
    iget-wide v13, v11, Lr91;->γ:J

    .line 169
    invoke-static {v13, v14, v4, v12}, Lp91;->ω(JFLyr;)F

    move-result v21

    .line 170
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_38

    .line 171
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_3b

    goto :goto_26

    :cond_3b
    invoke-static {v9}, Lq02;->з(Ljava/lang/CharSequence;)C

    move-result v5

    if-ne v5, v1, :cond_3c

    :goto_26
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    :goto_27
    move/from16 v22, v1

    goto :goto_28

    :cond_3c
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v1

    goto :goto_27

    .line 172
    :goto_28
    new-instance v20, Lxr0;

    .line 173
    iget v1, v2, Lwr0;->β:I

    and-int/lit8 v5, v1, 0x1

    if-lez v5, :cond_3d

    move/from16 v23, p4

    goto :goto_29

    :cond_3d
    const/16 v23, 0x0

    :goto_29
    and-int/lit8 v1, v1, 0x10

    if-lez v1, :cond_3e

    move/from16 v24, p4

    goto :goto_2a

    :cond_3e
    const/16 v24, 0x0

    .line 174
    :goto_2a
    iget v1, v2, Lwr0;->α:F

    .line 175
    iget v2, v2, Lwr0;->γ:I

    move/from16 v25, v1

    move/from16 v26, v2

    .line 176
    invoke-direct/range {v20 .. v26}, Lxr0;-><init>(FIZZFI)V

    move-object/from16 v1, v20

    .line 177
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v13, 0x0

    .line 178
    invoke-interface {v9, v1, v13, v2, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 179
    :goto_2b
    iget-object v1, v11, Lr91;->δ:Lh32;

    if-eqz v1, :cond_47

    move/from16 p5, v13

    .line 180
    iget-wide v13, v1, Lh32;->α:J

    iget-wide v1, v1, Lh32;->β:J

    move-object v5, v11

    .line 181
    invoke-static/range {p5 .. p5}, Lu81;->η(I)J

    move-result-wide v10

    invoke-static {v13, v14, v10, v11}, Ly32;->α(JJ)Z

    move-result v10

    if-eqz v10, :cond_3f

    invoke-static/range {p5 .. p5}, Lu81;->η(I)J

    move-result-wide v10

    invoke-static {v1, v2, v10, v11}, Ly32;->α(JJ)Z

    move-result v10

    if-nez v10, :cond_40

    :cond_3f
    and-long v10, v13, v15

    cmp-long v10, v10, v17

    if-nez v10, :cond_41

    :cond_40
    :goto_2c
    move-object v15, v5

    goto/16 :goto_2f

    :cond_41
    and-long v10, v1, v15

    cmp-long v10, v10, v17

    if-nez v10, :cond_42

    goto :goto_2c

    .line 182
    :cond_42
    invoke-static {v13, v14}, Ly32;->β(J)J

    move-result-wide v10

    move/from16 p6, v4

    move-object v15, v5

    const-wide v4, 0x100000000L

    .line 183
    invoke-static {v10, v11, v4, v5}, Lz32;->α(JJ)Z

    move-result v16

    if-eqz v16, :cond_43

    invoke-interface {v12, v13, v14}, Lyr;->д(J)F

    move-result v10

    const-wide v4, 0x200000000L

    goto :goto_2d

    :cond_43
    const-wide v4, 0x200000000L

    .line 184
    invoke-static {v10, v11, v4, v5}, Lz32;->α(JJ)Z

    move-result v10

    if-eqz v10, :cond_44

    invoke-static {v13, v14}, Ly32;->γ(J)F

    move-result v10

    mul-float v10, v10, p6

    goto :goto_2d

    :cond_44
    move/from16 v10, p2

    .line 185
    :goto_2d
    invoke-static {v1, v2}, Ly32;->β(J)J

    move-result-wide v13

    const-wide v4, 0x100000000L

    .line 186
    invoke-static {v13, v14, v4, v5}, Lz32;->α(JJ)Z

    move-result v11

    if-eqz v11, :cond_45

    invoke-interface {v12, v1, v2}, Lyr;->д(J)F

    move-result v1

    goto :goto_2e

    :cond_45
    const-wide v4, 0x200000000L

    .line 187
    invoke-static {v13, v14, v4, v5}, Lz32;->α(JJ)Z

    move-result v11

    if-eqz v11, :cond_46

    invoke-static {v1, v2}, Ly32;->γ(J)F

    move-result v1

    mul-float v1, v1, p6

    goto :goto_2e

    :cond_46
    move/from16 v1, p2

    .line 188
    :goto_2e
    new-instance v2, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v4, v10

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-float v4, v4

    float-to-int v4, v4

    float-to-double v10, v1

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-float v1, v10

    float-to-int v1, v1

    invoke-direct {v2, v4, v1}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 189
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v4, 0x21

    const/4 v13, 0x0

    .line 190
    invoke-interface {v9, v2, v13, v1, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_2f

    :cond_47
    move-object v15, v11

    .line 191
    :goto_2f
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 192
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_30
    if-ge v4, v2, :cond_4c

    .line 193
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 194
    check-cast v5, Lf4;

    .line 195
    iget-object v10, v5, Lf4;->α:Ljava/lang/Object;

    .line 196
    instance-of v11, v10, Lux1;

    if-eqz v11, :cond_4b

    move-object v11, v10

    check-cast v11, Lux1;

    .line 197
    iget-object v13, v11, Lux1;->ζ:Lbr;

    if-nez v13, :cond_49

    .line 198
    iget-object v13, v11, Lux1;->δ:Lb60;

    if-nez v13, :cond_49

    .line 199
    iget-object v11, v11, Lux1;->γ:Ld60;

    if-eqz v11, :cond_48

    goto :goto_31

    :cond_48
    const/4 v11, 0x0

    goto :goto_32

    :cond_49
    :goto_31
    move/from16 v11, p4

    :goto_32
    if-nez v11, :cond_4a

    .line 200
    check-cast v10, Lux1;

    .line 201
    iget-object v10, v10, Lux1;->ε:Lc60;

    if-eqz v10, :cond_4b

    .line 202
    :cond_4a
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4b
    add-int/lit8 v4, v4, 0x1

    goto :goto_30

    .line 203
    :cond_4c
    iget-object v2, v6, Lw32;->α:Lux1;

    .line 204
    iget-object v4, v2, Lux1;->ζ:Lbr;

    if-nez v4, :cond_4e

    .line 205
    iget-object v5, v2, Lux1;->δ:Lb60;

    if-nez v5, :cond_4e

    .line 206
    iget-object v5, v2, Lux1;->γ:Ld60;

    if-eqz v5, :cond_4d

    goto :goto_33

    :cond_4d
    const/4 v5, 0x0

    goto :goto_34

    :cond_4e
    :goto_33
    move/from16 v5, p4

    :goto_34
    if-nez v5, :cond_50

    .line 207
    iget-object v5, v2, Lux1;->ε:Lc60;

    if-eqz v5, :cond_4f

    goto :goto_35

    :cond_4f
    move-object/from16 v2, p1

    goto :goto_36

    .line 208
    :cond_50
    :goto_35
    iget-object v5, v2, Lux1;->γ:Ld60;

    .line 209
    iget-object v6, v2, Lux1;->δ:Lb60;

    .line 210
    iget-object v2, v2, Lux1;->ε:Lc60;

    .line 211
    new-instance v20, Lux1;

    const/16 v38, 0x0

    const v39, 0xffc3

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v27, v2

    move-object/from16 v28, v4

    move-object/from16 v25, v5

    move-object/from16 v26, v6

    invoke-direct/range {v20 .. v39}, Lux1;-><init>(JJLd60;Lb60;Lc60;Lbr;Ljava/lang/String;JLr8;Lg32;Lav0;JLc32;Lfv1;I)V

    move-object/from16 v2, v20

    .line 212
    :goto_36
    new-instance v4, Lyx1;

    invoke-direct {v4, v9, v7}, Lyx1;-><init>(Landroid/text/Spannable;Lv2;)V

    .line 213
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    move/from16 v6, p4

    if-gt v5, v6, :cond_51

    .line 214
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_58

    const/4 v13, 0x0

    .line 215
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4;

    .line 216
    iget-object v5, v5, Lf4;->α:Ljava/lang/Object;

    .line 217
    check-cast v5, Lux1;

    invoke-static {v2, v5}, Lp91;->ρ(Lux1;Lux1;)Lux1;

    move-result-object v2

    .line 218
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4;

    .line 219
    iget v5, v5, Lf4;->β:I

    .line 220
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 221
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4;

    .line 222
    iget v1, v1, Lf4;->γ:I

    .line 223
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 224
    invoke-virtual {v4, v2, v5, v1}, Lyx1;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3b

    .line 225
    :cond_51
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    mul-int/lit8 v6, v5, 0x2

    .line 226
    new-array v7, v6, [I

    .line 227
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_37
    if-ge v11, v10, :cond_52

    .line 228
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 229
    check-cast v13, Lf4;

    .line 230
    iget v14, v13, Lf4;->β:I

    .line 231
    aput v14, v7, v11

    add-int v14, v11, v5

    .line 232
    iget v13, v13, Lf4;->γ:I

    .line 233
    aput v13, v7, v14

    add-int/lit8 v11, v11, 0x1

    goto :goto_37

    :cond_52
    const/4 v11, 0x1

    if-le v6, v11, :cond_53

    .line 234
    invoke-static {v7}, Ljava/util/Arrays;->sort([I)V

    :cond_53
    if-eqz v6, :cond_76

    const/4 v13, 0x0

    .line 235
    aget v5, v7, v13

    move v10, v5

    const/4 v5, 0x0

    :goto_38
    if-ge v5, v6, :cond_58

    .line 236
    aget v11, v7, v5

    if-ne v11, v10, :cond_54

    move-object/from16 p6, v1

    move-object/from16 v16, v2

    move/from16 v17, v5

    move/from16 v18, v6

    goto :goto_3a

    .line 237
    :cond_54
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v13

    move-object/from16 v16, v2

    const/4 v14, 0x0

    :goto_39
    if-ge v14, v13, :cond_56

    .line 238
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 p6, v1

    .line 239
    move-object/from16 v1, v17

    check-cast v1, Lf4;

    move/from16 v17, v5

    .line 240
    iget v5, v1, Lf4;->β:I

    move/from16 v18, v6

    .line 241
    iget v6, v1, Lf4;->γ:I

    if-eq v5, v6, :cond_55

    .line 242
    invoke-static {v10, v11, v5, v6}, Lh4;->α(IIII)Z

    move-result v5

    if-eqz v5, :cond_55

    .line 243
    iget-object v1, v1, Lf4;->α:Ljava/lang/Object;

    .line 244
    check-cast v1, Lux1;

    invoke-static {v2, v1}, Lp91;->ρ(Lux1;Lux1;)Lux1;

    move-result-object v2

    :cond_55
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, p6

    move/from16 v5, v17

    move/from16 v6, v18

    goto :goto_39

    :cond_56
    move-object/from16 p6, v1

    move/from16 v17, v5

    move/from16 v18, v6

    if-eqz v2, :cond_57

    .line 245
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v2, v1, v5}, Lyx1;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_57
    move v10, v11

    :goto_3a
    add-int/lit8 v5, v17, 0x1

    move-object/from16 v1, p6

    move-object/from16 v2, v16

    move/from16 v6, v18

    goto :goto_38

    .line 246
    :cond_58
    :goto_3b
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_3c
    if-ge v2, v1, :cond_69

    .line 247
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4;

    .line 248
    iget-object v6, v5, Lf4;->α:Ljava/lang/Object;

    .line 249
    instance-of v7, v6, Lux1;

    if-eqz v7, :cond_59

    .line 250
    iget v13, v5, Lf4;->β:I

    .line 251
    iget v14, v5, Lf4;->γ:I

    if-ltz v13, :cond_59

    .line 252
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v13, v5, :cond_59

    if-le v14, v13, :cond_59

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-le v14, v5, :cond_5a

    :cond_59
    move/from16 p6, v1

    move/from16 v16, v2

    move-object/from16 p3, v3

    move-object v1, v12

    goto/16 :goto_45

    .line 253
    :cond_5a
    check-cast v6, Lux1;

    iget-wide v10, v6, Lux1;->θ:J

    .line 254
    iget-object v5, v6, Lux1;->ι:Lr8;

    iget-object v7, v6, Lux1;->α:Lf32;

    if-eqz v5, :cond_5b

    .line 255
    iget v5, v5, Lr8;->α:F

    move/from16 p6, v1

    .line 256
    new-instance v1, Ls8;

    move/from16 v16, v2

    const/4 v2, 0x0

    invoke-direct {v1, v2, v5}, Ls8;-><init>(IF)V

    const/16 v2, 0x21

    .line 257
    invoke-interface {v9, v1, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_3d

    :cond_5b
    move/from16 p6, v1

    move/from16 v16, v2

    .line 258
    :goto_3d
    invoke-interface {v7}, Lf32;->β()J

    move-result-wide v1

    .line 259
    invoke-static {v9, v1, v2, v13, v14}, Lp91;->Β(Landroid/text/Spannable;JII)V

    .line 260
    invoke-interface {v7}, Lf32;->δ()Lkn0;

    move-result-object v1

    .line 261
    invoke-interface {v7}, Lf32;->ε()F

    move-result v2

    if-eqz v1, :cond_5d

    .line 262
    instance-of v5, v1, Lpx1;

    if-eqz v5, :cond_5c

    .line 263
    check-cast v1, Lpx1;

    .line 264
    iget-wide v1, v1, Lpx1;->π:J

    .line 265
    invoke-static {v9, v1, v2, v13, v14}, Lp91;->Β(Landroid/text/Spannable;JII)V

    goto :goto_3e

    .line 266
    :cond_5c
    new-instance v5, Ldv1;

    check-cast v1, Lpc;

    invoke-direct {v5, v1, v2}, Ldv1;-><init>(Lpc;F)V

    const/16 v2, 0x21

    .line 267
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 268
    :cond_5d
    :goto_3e
    iget-object v1, v6, Lux1;->ν:Lc32;

    if-eqz v1, :cond_60

    .line 269
    iget v1, v1, Lc32;->α:I

    .line 270
    new-instance v2, Ld32;

    or-int/lit8 v5, v1, 0x1

    if-ne v5, v1, :cond_5e

    const/4 v5, 0x1

    goto :goto_3f

    :cond_5e
    const/4 v5, 0x0

    :goto_3f
    or-int/lit8 v7, v1, 0x2

    if-ne v7, v1, :cond_5f

    const/4 v1, 0x1

    goto :goto_40

    :cond_5f
    const/4 v1, 0x0

    :goto_40
    invoke-direct {v2, v5, v1}, Ld32;-><init>(ZZ)V

    const/16 v1, 0x21

    .line 271
    invoke-interface {v9, v2, v13, v14, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_41
    move-wide/from16 v17, v10

    goto :goto_42

    :cond_60
    const/16 v1, 0x21

    goto :goto_41

    .line 272
    :goto_42
    iget-wide v10, v6, Lux1;->β:J

    move v2, v1

    .line 273
    invoke-static/range {v9 .. v14}, Lp91;->Γ(Landroid/text/Spannable;JLyr;II)V

    .line 274
    iget-object v1, v6, Lux1;->η:Ljava/lang/String;

    if-eqz v1, :cond_61

    .line 275
    new-instance v5, Li50;

    const/4 v10, 0x0

    invoke-direct {v5, v10, v1}, Li50;-><init>(ILjava/lang/Object;)V

    .line 276
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 277
    :cond_61
    iget-object v1, v6, Lux1;->κ:Lg32;

    if-eqz v1, :cond_62

    .line 278
    new-instance v5, Landroid/text/style/ScaleXSpan;

    .line 279
    iget v7, v1, Lg32;->α:F

    .line 280
    invoke-direct {v5, v7}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 281
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 282
    new-instance v5, Ls8;

    .line 283
    iget v1, v1, Lg32;->β:F

    const/4 v11, 0x1

    .line 284
    invoke-direct {v5, v11, v1}, Ls8;-><init>(IF)V

    .line 285
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_43

    :cond_62
    const/4 v11, 0x1

    .line 286
    :goto_43
    iget-object v1, v6, Lux1;->λ:Lav0;

    .line 287
    invoke-static {v9, v1, v13, v14}, Lp91;->Δ(Landroid/text/Spannable;Lav0;II)V

    move-object v1, v12

    .line 288
    iget-wide v11, v6, Lux1;->μ:J

    const-wide/16 v20, 0x10

    cmp-long v5, v11, v20

    if-eqz v5, :cond_63

    .line 289
    new-instance v5, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v11, v12}, Lkn0;->Τ(J)I

    move-result v7

    invoke-direct {v5, v7}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 290
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 291
    :cond_63
    iget-object v5, v6, Lux1;->ξ:Lfv1;

    if-eqz v5, :cond_65

    .line 292
    iget-wide v10, v5, Lfv1;->β:J

    .line 293
    new-instance v7, Lhv1;

    move-object/from16 p3, v3

    .line 294
    iget-wide v2, v5, Lfv1;->α:J

    .line 295
    invoke-static {v2, v3}, Lkn0;->Τ(J)I

    move-result v2

    const/16 v3, 0x20

    move/from16 v19, v13

    shr-long v12, v10, v3

    long-to-int v3, v12

    .line 296
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const-wide v12, 0xffffffffL

    and-long/2addr v10, v12

    long-to-int v10, v10

    .line 297
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    .line 298
    iget v5, v5, Lfv1;->γ:F

    cmpg-float v11, v5, p2

    if-nez v11, :cond_64

    const/4 v5, 0x1

    .line 299
    :cond_64
    invoke-direct {v7, v3, v10, v5, v2}, Lhv1;-><init>(FFFI)V

    move/from16 v13, v19

    const/16 v2, 0x21

    .line 300
    invoke-interface {v9, v7, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_44

    :cond_65
    move-object/from16 p3, v3

    .line 301
    :goto_44
    iget-object v3, v6, Lux1;->ο:Lkn0;

    if-eqz v3, :cond_66

    .line 302
    new-instance v5, Ldw;

    invoke-direct {v5, v3}, Ldw;-><init>(Lkn0;)V

    .line 303
    invoke-interface {v9, v5, v13, v14, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 304
    :cond_66
    invoke-static/range {v17 .. v18}, Ly32;->β(J)J

    move-result-wide v2

    const-wide v10, 0x100000000L

    invoke-static {v2, v3, v10, v11}, Lz32;->α(JJ)Z

    move-result v2

    if-nez v2, :cond_67

    invoke-static/range {v17 .. v18}, Ly32;->β(J)J

    move-result-wide v2

    const-wide v5, 0x200000000L

    invoke-static {v2, v3, v5, v6}, Lz32;->α(JJ)Z

    move-result v2

    if-eqz v2, :cond_68

    :cond_67
    const/4 v4, 0x1

    :cond_68
    :goto_45
    add-int/lit8 v2, v16, 0x1

    move-object/from16 v3, p3

    move-object v12, v1

    move/from16 v1, p6

    goto/16 :goto_3c

    :cond_69
    move-object/from16 p3, v3

    move-object v1, v12

    if-eqz v4, :cond_6f

    .line 305
    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_46
    if-ge v3, v2, :cond_6f

    move-object/from16 v4, p3

    .line 306
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4;

    .line 307
    iget-object v6, v5, Lf4;->α:Ljava/lang/Object;

    .line 308
    check-cast v6, Le4;

    .line 309
    instance-of v7, v6, Lux1;

    if-eqz v7, :cond_6a

    .line 310
    iget v7, v5, Lf4;->β:I

    .line 311
    iget v5, v5, Lf4;->γ:I

    if-ltz v7, :cond_6a

    .line 312
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-ge v7, v10, :cond_6a

    if-le v5, v7, :cond_6a

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-le v5, v10, :cond_6b

    :cond_6a
    move/from16 p3, v2

    const/16 v12, 0x21

    move-object v2, v1

    goto :goto_48

    .line 313
    :cond_6b
    check-cast v6, Lux1;

    .line 314
    iget-wide v10, v6, Lux1;->θ:J

    .line 315
    invoke-static {v10, v11}, Ly32;->β(J)J

    move-result-wide v13

    move-object/from16 p2, v1

    move/from16 p3, v2

    const-wide v1, 0x100000000L

    .line 316
    invoke-static {v13, v14, v1, v2}, Lz32;->α(JJ)Z

    move-result v6

    if-eqz v6, :cond_6c

    new-instance v1, Lwq0;

    move-object/from16 v2, p2

    invoke-interface {v2, v10, v11}, Lyr;->д(J)F

    move-result v6

    invoke-direct {v1, v6}, Lwq0;-><init>(F)V

    goto :goto_47

    :cond_6c
    move-object/from16 v2, p2

    move-wide/from16 v16, v10

    const-wide v10, 0x200000000L

    .line 317
    invoke-static {v13, v14, v10, v11}, Lz32;->α(JJ)Z

    move-result v1

    if-eqz v1, :cond_6d

    .line 318
    new-instance v1, Lvq0;

    invoke-static/range {v16 .. v17}, Ly32;->γ(J)F

    move-result v6

    invoke-direct {v1, v6}, Lvq0;-><init>(F)V

    goto :goto_47

    :cond_6d
    move-object/from16 v1, p1

    :goto_47
    const/16 v12, 0x21

    if-eqz v1, :cond_6e

    .line 319
    invoke-interface {v9, v1, v7, v5, v12}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_6e
    :goto_48
    add-int/lit8 v3, v3, 0x1

    move-object v1, v2

    move/from16 v2, p3

    move-object/from16 p3, v4

    goto :goto_46

    :cond_6f
    move-object/from16 v4, p3

    move-object v2, v1

    .line 320
    iget-object v1, v15, Lr91;->δ:Lh32;

    if-eqz v1, :cond_71

    .line 321
    iget-wide v5, v1, Lh32;->α:J

    .line 322
    invoke-static {v5, v6}, Ly32;->β(J)J

    move-result-wide v10

    const-wide v12, 0x100000000L

    .line 323
    invoke-static {v10, v11, v12, v13}, Lz32;->α(JJ)Z

    move-result v1

    if-eqz v1, :cond_70

    invoke-interface {v2, v5, v6}, Lyr;->д(J)F

    goto :goto_49

    :cond_70
    const-wide v1, 0x200000000L

    .line 324
    invoke-static {v10, v11, v1, v2}, Lz32;->α(JJ)Z

    move-result v1

    if-eqz v1, :cond_71

    invoke-static {v5, v6}, Ly32;->γ(J)F

    .line 325
    :cond_71
    :goto_49
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_4a
    if-ge v2, v1, :cond_72

    .line 326
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 327
    check-cast v3, Lf4;

    .line 328
    iget-object v3, v3, Lf4;->α:Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4a

    .line 329
    :cond_72
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v1

    if-lez v1, :cond_75

    const/4 v13, 0x0

    .line 330
    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 331
    check-cast v0, Lf4;

    .line 332
    iget-object v1, v0, Lf4;->α:Ljava/lang/Object;

    if-nez v1, :cond_74

    .line 333
    iget v1, v0, Lf4;->β:I

    .line 334
    iget v0, v0, Lf4;->γ:I

    .line 335
    const-class v2, Ll62;

    invoke-interface {v9, v1, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    .line 336
    array-length v1, v0

    :goto_4b
    if-ge v13, v1, :cond_73

    aget-object v2, v0, v13

    check-cast v2, Ll62;

    .line 337
    invoke-interface {v9, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_4b

    .line 338
    :cond_73
    new-instance v0, Lfh1;

    .line 339
    throw p1

    .line 340
    :cond_74
    invoke-static {}, Lγ;->β()V

    throw p1

    .line 341
    :cond_75
    :goto_4c
    iput-object v9, v0, Lw2;->θ:Ljava/lang/CharSequence;

    .line 342
    new-instance v1, Lpp0;

    iget-object v2, v0, Lw2;->η:Ld3;

    iget v3, v0, Lw2;->μ:I

    invoke-direct {v1, v9, v2, v3}, Lpp0;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object v1, v0, Lw2;->ι:Lpp0;

    return-void

    .line 343
    :cond_76
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Array is empty."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_77
    const/16 p1, 0x0

    .line 344
    const-string v0, "Invalid TextDirection."

    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final α()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lw2;->κ:Lm6;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lm6;->Λ()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-boolean v0, p0, Lw2;->λ:Z

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget-object p0, p0, Lw2;->β:Lw32;

    .line 19
    .line 20
    invoke-static {p0}, Ls1;->β(Lw32;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    sget-object p0, Lmy;->α:Ln;

    .line 27
    .line 28
    sget-object p0, Lmy;->α:Ln;

    .line 29
    .line 30
    iget-object v0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lc02;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {}, Ljy;->γ()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Ln;->υ()Lc02;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    sget-object v0, Lbd;->κ:Ljl0;

    .line 51
    .line 52
    :goto_1
    invoke-interface {v0}, Lc02;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    return v1

    .line 66
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public final β()F
    .locals 0

    .line 1
    iget-object p0, p0, Lw2;->ι:Lpp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lpp0;->γ()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final γ()F
    .locals 10

    .line 1
    iget-object p0, p0, Lw2;->ι:Lpp0;

    .line 2
    .line 3
    iget v0, p0, Lpp0;->ε:F

    .line 4
    .line 5
    iget-object v1, p0, Lpp0;->β:Landroid/text/TextPaint;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p0, p0, Lpp0;->ε:F

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v2, Llf;

    .line 25
    .line 26
    iget-object v3, p0, Lpp0;->α:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {v2, v3, v4}, Llf;-><init>(Ljava/lang/CharSequence;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Ljava/util/PriorityQueue;

    .line 39
    .line 40
    sget-object v3, Lkn0;->ν:Lo9;

    .line 41
    .line 42
    const/16 v4, 0xa

    .line 43
    .line 44
    invoke-direct {v2, v4, v3}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v5, 0x0

    .line 52
    :goto_0
    const/4 v6, -0x1

    .line 53
    if-eq v3, v6, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->size()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const/4 v7, 0x1

    .line 60
    if-ge v6, v4, :cond_1

    .line 61
    .line 62
    new-instance v6, Lxm0;

    .line 63
    .line 64
    invoke-direct {v6, v5, v3, v7}, Lvm0;-><init>(III)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Lxm0;

    .line 76
    .line 77
    if-eqz v6, :cond_2

    .line 78
    .line 79
    iget v8, v6, Lvm0;->ζ:I

    .line 80
    .line 81
    iget v6, v6, Lvm0;->ε:I

    .line 82
    .line 83
    sub-int/2addr v8, v6

    .line 84
    sub-int v6, v3, v5

    .line 85
    .line 86
    if-ge v8, v6, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    new-instance v6, Lxm0;

    .line 92
    .line 93
    invoke-direct {v6, v5, v3, v7}, Lvm0;-><init>(III)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    move v9, v5

    .line 104
    move v5, v3

    .line 105
    move v3, v9

    .line 106
    goto :goto_0

    .line 107
    :cond_3
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    const/4 v0, 0x0

    .line 114
    goto :goto_3

    .line 115
    :cond_4
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Lxm0;

    .line 130
    .line 131
    iget v3, v2, Lvm0;->ε:I

    .line 132
    .line 133
    iget v2, v2, Lvm0;->ζ:I

    .line 134
    .line 135
    invoke-virtual {p0}, Lpp0;->β()Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v4, v3, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_5

    .line 148
    .line 149
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Lxm0;

    .line 154
    .line 155
    iget v4, v3, Lvm0;->ε:I

    .line 156
    .line 157
    iget v3, v3, Lvm0;->ζ:I

    .line 158
    .line 159
    invoke-virtual {p0}, Lpp0;->β()Ljava/lang/CharSequence;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-static {v5, v4, v3, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    goto :goto_2

    .line 172
    :cond_5
    move v0, v2

    .line 173
    :goto_3
    iput v0, p0, Lpp0;->ε:F

    .line 174
    .line 175
    return v0

    .line 176
    :cond_6
    invoke-static {}, Lγ;->ο()V

    .line 177
    .line 178
    .line 179
    const/4 p0, 0x0

    .line 180
    return p0
.end method
