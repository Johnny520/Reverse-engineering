.class public final Lc6;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lyo0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ls71;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Ljv;

.field public final f:Lym;

.field public final g:Lm6;

.field public final h:Ljava/lang/CharSequence;

.field public final i:Lp50;

.field public j:Lo8;

.field public final k:Z

.field public final l:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ls71;Ljava/util/List;Ljava/util/List;Ljv;Lym;)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p1

    .line 2
    iput-object v4, v0, Lc6;->a:Ljava/lang/String;

    .line 3
    iput-object v1, v0, Lc6;->b:Ls71;

    .line 4
    iput-object v2, v0, Lc6;->c:Ljava/util/List;

    move-object/from16 v4, p4

    .line 5
    iput-object v4, v0, Lc6;->d:Ljava/util/List;

    move-object/from16 v4, p5

    .line 6
    iput-object v4, v0, Lc6;->e:Ljv;

    .line 7
    iput-object v3, v0, Lc6;->f:Lym;

    .line 8
    new-instance v4, Lm6;

    invoke-interface {v3}, Lym;->b()F

    move-result v5

    const/4 v6, 0x1

    .line 9
    invoke-direct {v4, v6}, Landroid/text/TextPaint;-><init>(I)V

    .line 10
    iput v5, v4, Landroid/text/TextPaint;->density:F

    .line 11
    sget-object v5, Lu61;->b:Lu61;

    iput-object v5, v4, Lm6;->b:Lu61;

    const/4 v5, 0x3

    .line 12
    iput v5, v4, Lm6;->c:I

    .line 13
    sget-object v7, Lv01;->d:Lv01;

    .line 14
    iput-object v7, v4, Lm6;->d:Lv01;

    .line 15
    iput-object v4, v0, Lc6;->g:Lm6;

    .line 16
    invoke-static {v1}, Lp30;->i(Ls71;)Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_0

    move v7, v8

    goto :goto_1

    .line 17
    :cond_0
    sget-object v7, Lwr;->a:Lx1;

    .line 18
    sget-object v7, Lwr;->a:Lx1;

    .line 19
    iget-object v9, v7, Lx1;->e:Ljava/lang/Object;

    check-cast v9, Lw31;

    if-eqz v9, :cond_1

    goto :goto_0

    .line 20
    :cond_1
    sget-object v9, Lrr;->k:Lrr;

    if-eqz v9, :cond_2

    .line 21
    invoke-virtual {v7}, Lx1;->i()Lw31;

    move-result-object v9

    iput-object v9, v7, Lx1;->e:Ljava/lang/Object;

    goto :goto_0

    .line 22
    :cond_2
    sget-object v9, Lpf1;->f:Lv00;

    .line 23
    :goto_0
    invoke-interface {v9}, Lw31;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 24
    :goto_1
    iput-boolean v7, v0, Lc6;->k:Z

    .line 25
    iget-object v7, v1, Ls71;->b:Lap0;

    .line 26
    iget v7, v7, Lap0;->b:I

    .line 27
    iget-object v9, v1, Ls71;->a:Lj31;

    .line 28
    iget-object v9, v9, Lj31;->k:Lfb0;

    const/4 v10, 0x4

    const/4 v12, 0x2

    if-ne v7, v10, :cond_4

    :cond_3
    :goto_2
    move v7, v12

    goto :goto_4

    :cond_4
    const/4 v10, 0x5

    if-ne v7, v10, :cond_6

    :cond_5
    move v7, v5

    goto :goto_4

    :cond_6
    if-ne v7, v6, :cond_7

    move v7, v8

    goto :goto_4

    :cond_7
    if-ne v7, v12, :cond_8

    move v7, v6

    goto :goto_4

    :cond_8
    if-ne v7, v5, :cond_9

    goto :goto_3

    :cond_9
    if-nez v7, :cond_8c

    :goto_3
    if-eqz v9, :cond_a

    .line 29
    iget-object v7, v9, Lfb0;->d:Ljava/util/List;

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Leb0;

    .line 30
    iget-object v7, v7, Leb0;->a:Ljava/util/Locale;

    if-nez v7, :cond_b

    .line 31
    :cond_a
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    .line 32
    :cond_b
    invoke-static {v7}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v7

    if-eqz v7, :cond_3

    if-eq v7, v6, :cond_5

    goto :goto_2

    .line 33
    :goto_4
    iput v7, v0, Lc6;->l:I

    .line 34
    new-instance v7, Lb6;

    invoke-direct {v7, v8, v0}, Lb6;-><init>(ILjava/lang/Object;)V

    .line 35
    iget-object v9, v1, Ls71;->b:Lap0;

    .line 36
    iget-object v9, v9, Lap0;->i:Lk71;

    if-nez v9, :cond_c

    .line 37
    sget-object v9, Lk71;->c:Lk71;

    .line 38
    :cond_c
    iget-boolean v10, v9, Lk71;->b:Z

    if-eqz v10, :cond_d

    .line 39
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v10

    or-int/lit16 v10, v10, 0x80

    goto :goto_5

    .line 40
    :cond_d
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v10

    and-int/lit16 v10, v10, -0x81

    .line 41
    :goto_5
    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setFlags(I)V

    .line 42
    iget v9, v9, Lk71;->a:I

    if-ne v9, v6, :cond_e

    .line 43
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v9

    or-int/lit8 v9, v9, 0x40

    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setFlags(I)V

    .line 44
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_e
    if-ne v9, v12, :cond_f

    .line 45
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 46
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_f
    if-ne v9, v5, :cond_10

    .line 47
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 48
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    .line 49
    :cond_10
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 50
    :goto_6
    iget-object v1, v1, Ls71;->a:Lj31;

    .line 51
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v9

    move v10, v8

    :goto_7
    if-ge v10, v9, :cond_12

    .line 52
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 53
    move-object v14, v13

    check-cast v14, Le8;

    .line 54
    iget-object v14, v14, Le8;->a:Ljava/lang/Object;

    .line 55
    instance-of v14, v14, Lj31;

    if-eqz v14, :cond_11

    goto :goto_8

    :cond_11
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_12
    const/4 v13, 0x0

    :goto_8
    if-eqz v13, :cond_13

    move v2, v6

    goto :goto_9

    :cond_13
    move v2, v8

    .line 56
    :goto_9
    iget-wide v9, v1, Lj31;->b:J

    iget-object v13, v1, Lj31;->g:Ljava/lang/String;

    iget-object v14, v1, Lj31;->k:Lfb0;

    iget-object v15, v1, Lj31;->a:Lx61;

    const/16 p1, 0x0

    iget-object v11, v1, Lj31;->j:Ly61;

    move/from16 p4, v6

    iget-wide v5, v1, Lj31;->h:J

    move-object/from16 p2, v13

    .line 57
    invoke-static {v9, v10}, Lu71;->b(J)J

    move-result-wide v12

    move-wide/from16 v18, v9

    const-wide v8, 0x100000000L

    .line 58
    invoke-static {v12, v13, v8, v9}, Lv71;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_14

    move-wide/from16 v8, v18

    invoke-interface {v3, v8, v9}, Lym;->P(J)F

    move-result v8

    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_a

    :cond_14
    const-wide v8, 0x200000000L

    .line 59
    invoke-static {v12, v13, v8, v9}, Lv71;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_15

    .line 60
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v8

    invoke-static/range {v18 .. v19}, Lu71;->c(J)F

    move-result v9

    mul-float/2addr v9, v8

    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 61
    :cond_15
    :goto_a
    iget-object v8, v1, Lj31;->f:Lz51;

    if-nez v8, :cond_17

    .line 62
    iget-object v9, v1, Lj31;->d:Lxv;

    if-nez v9, :cond_17

    .line 63
    iget-object v9, v1, Lj31;->c:Lzv;

    if-eqz v9, :cond_16

    goto :goto_b

    :cond_16
    move/from16 p3, v2

    goto :goto_f

    .line 64
    :cond_17
    :goto_b
    iget-object v9, v1, Lj31;->c:Lzv;

    if-nez v9, :cond_18

    .line 65
    sget-object v9, Lzv;->f:Lzv;

    .line 66
    :cond_18
    iget-object v10, v1, Lj31;->d:Lxv;

    if-eqz v10, :cond_19

    .line 67
    iget v10, v10, Lxv;->a:I

    goto :goto_c

    :cond_19
    const/4 v10, 0x0

    .line 68
    :goto_c
    iget-object v12, v1, Lj31;->e:Lyv;

    if-eqz v12, :cond_1a

    .line 69
    iget v12, v12, Lyv;->a:I

    goto :goto_d

    :cond_1a
    const v12, 0xffff

    .line 70
    :goto_d
    iget-object v13, v7, Lb6;->e:Ljava/lang/Object;

    check-cast v13, Lc6;

    move/from16 p3, v2

    .line 71
    iget-object v2, v13, Lc6;->e:Ljv;

    check-cast v2, Lkv;

    invoke-virtual {v2, v8, v9, v10, v12}, Lkv;->b(Lz51;Lzv;II)Lba1;

    move-result-object v2

    .line 72
    instance-of v8, v2, Lba1;

    if-nez v8, :cond_1b

    .line 73
    new-instance v8, Lo8;

    iget-object v9, v13, Lc6;->j:Lo8;

    invoke-direct {v8, v2, v9}, Lo8;-><init>(Lba1;Lo8;)V

    .line 74
    iput-object v8, v13, Lc6;->j:Lo8;

    .line 75
    iget-object v2, v8, Lo8;->c:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Landroid/graphics/Typeface;

    goto :goto_e

    .line 76
    :cond_1b
    iget-object v2, v2, Lba1;->d:Ljava/lang/Object;

    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Landroid/graphics/Typeface;

    .line 78
    :goto_e
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_f
    if-eqz v14, :cond_1d

    .line 79
    sget-object v2, Lfb0;->f:Lfb0;

    invoke-static {}, Lj50;->n()Lfb0;

    move-result-object v2

    .line 80
    invoke-virtual {v14, v2}, Lfb0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    .line 81
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v14}, Lze;->E(Ljava/lang/Iterable;)I

    move-result v8

    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    iget-object v8, v14, Lfb0;->d:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 83
    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 84
    check-cast v9, Leb0;

    .line 85
    iget-object v9, v9, Leb0;->a:Ljava/util/Locale;

    .line 86
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_1c
    const/4 v9, 0x0

    .line 87
    new-array v8, v9, [Ljava/util/Locale;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 88
    check-cast v2, [Ljava/util/Locale;

    array-length v8, v2

    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/util/Locale;

    new-instance v8, Landroid/os/LocaleList;

    invoke-direct {v8, v2}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 89
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setTextLocales(Landroid/os/LocaleList;)V

    :cond_1d
    if-eqz p2, :cond_1e

    .line 90
    const-string v2, ""

    move-object/from16 v8, p2

    .line 91
    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    .line 92
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_1e
    if-eqz v11, :cond_1f

    .line 93
    sget-object v2, Ly61;->c:Ly61;

    .line 94
    invoke-virtual {v11, v2}, Ly61;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    .line 95
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v2

    .line 96
    iget v8, v11, Ly61;->a:F

    mul-float/2addr v2, v8

    .line 97
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 98
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v2

    .line 99
    iget v8, v11, Ly61;->b:F

    add-float/2addr v2, v8

    .line 100
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 101
    :cond_1f
    invoke-interface {v15}, Lx61;->a()J

    move-result-wide v8

    .line 102
    invoke-virtual {v4, v8, v9}, Lm6;->d(J)V

    .line 103
    invoke-interface {v15}, Lx61;->e()Lpf1;

    move-result-object v2

    const-wide v8, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 104
    invoke-interface {v15}, Lx61;->f()F

    move-result v10

    .line 105
    invoke-virtual {v4, v2, v8, v9, v10}, Lm6;->c(Lpf1;JF)V

    .line 106
    iget-object v2, v1, Lj31;->n:Lv01;

    .line 107
    invoke-virtual {v4, v2}, Lm6;->f(Lv01;)V

    .line 108
    iget-object v2, v1, Lj31;->m:Lu61;

    .line 109
    invoke-virtual {v4, v2}, Lm6;->g(Lu61;)V

    .line 110
    iget-object v2, v1, Lj31;->o:Lo30;

    .line 111
    invoke-virtual {v4, v2}, Lm6;->e(Lo30;)V

    .line 112
    invoke-static {v5, v6}, Lu71;->b(J)J

    move-result-wide v8

    const-wide v10, 0x100000000L

    invoke-static {v8, v9, v10, v11}, Lv71;->a(JJ)Z

    move-result v2

    const/4 v8, 0x0

    if-eqz v2, :cond_22

    invoke-static {v5, v6}, Lu71;->c(J)F

    move-result v2

    cmpg-float v2, v2, v8

    if-nez v2, :cond_20

    goto :goto_11

    .line 113
    :cond_20
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v9

    mul-float/2addr v9, v2

    .line 114
    invoke-interface {v3, v5, v6}, Lym;->P(J)F

    move-result v2

    cmpg-float v3, v9, v8

    if-nez v3, :cond_21

    goto :goto_12

    :cond_21
    div-float/2addr v2, v9

    .line 115
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_12

    .line 116
    :cond_22
    :goto_11
    invoke-static {v5, v6}, Lu71;->b(J)J

    move-result-wide v2

    const-wide v9, 0x200000000L

    invoke-static {v2, v3, v9, v10}, Lv71;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_23

    .line 117
    invoke-static {v5, v6}, Lu71;->c(J)F

    move-result v2

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 118
    :cond_23
    :goto_12
    iget-wide v2, v1, Lj31;->l:J

    .line 119
    iget-object v1, v1, Lj31;->i:Lz9;

    if-eqz p3, :cond_25

    .line 120
    invoke-static {v5, v6}, Lu71;->b(J)J

    move-result-wide v9

    const-wide v11, 0x100000000L

    invoke-static {v9, v10, v11, v12}, Lv71;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-static {v5, v6}, Lu71;->c(J)F

    move-result v4

    cmpg-float v4, v4, v8

    if-nez v4, :cond_24

    goto :goto_13

    :cond_24
    move/from16 v4, p4

    goto :goto_14

    :cond_25
    :goto_13
    const/4 v4, 0x0

    .line 121
    :goto_14
    sget-wide v9, Lff;->g:J

    .line 122
    invoke-static {v2, v3, v9, v10}, Lff;->c(JJ)Z

    move-result v11

    if-nez v11, :cond_26

    .line 123
    sget-wide v11, Lff;->f:J

    .line 124
    invoke-static {v2, v3, v11, v12}, Lff;->c(JJ)Z

    move-result v11

    if-nez v11, :cond_26

    move/from16 v11, p4

    goto :goto_15

    :cond_26
    const/4 v11, 0x0

    :goto_15
    if-eqz v1, :cond_28

    .line 125
    iget v12, v1, Lz9;->a:F

    .line 126
    invoke-static {v12, v8}, Ljava/lang/Float;->compare(FF)I

    move-result v12

    if-nez v12, :cond_27

    goto :goto_16

    :cond_27
    move/from16 v12, p4

    goto :goto_17

    :cond_28
    :goto_16
    const/4 v12, 0x0

    :goto_17
    if-nez v4, :cond_29

    if-nez v11, :cond_29

    if-nez v12, :cond_29

    move-object/from16 v1, p1

    goto :goto_1c

    :cond_29
    if-eqz v4, :cond_2a

    :goto_18
    move-wide/from16 v30, v5

    goto :goto_19

    .line 127
    :cond_2a
    sget-wide v5, Lu71;->c:J

    goto :goto_18

    :goto_19
    if-eqz v11, :cond_2b

    move-wide/from16 v35, v2

    goto :goto_1a

    :cond_2b
    move-wide/from16 v35, v9

    :goto_1a
    if-eqz v12, :cond_2c

    move-object/from16 v32, v1

    goto :goto_1b

    :cond_2c
    move-object/from16 v32, p1

    .line 128
    :goto_1b
    new-instance v20, Lj31;

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

    invoke-direct/range {v20 .. v39}, Lj31;-><init>(JJLzv;Lxv;Lyv;Lz51;Ljava/lang/String;JLz9;Ly61;Lfb0;JLu61;Lv01;I)V

    move-object/from16 v1, v20

    .line 129
    :goto_1c
    iget-object v2, v0, Lc6;->c:Ljava/util/List;

    if-eqz v1, :cond_2f

    .line 130
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_1d
    if-ge v4, v2, :cond_2e

    if-nez v4, :cond_2d

    .line 131
    new-instance v5, Le8;

    .line 132
    iget-object v6, v0, Lc6;->a:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v9, 0x0

    .line 133
    invoke-direct {v5, v9, v6, v1}, Le8;-><init>(IILjava/lang/Object;)V

    goto :goto_1e

    .line 134
    :cond_2d
    iget-object v5, v0, Lc6;->c:Ljava/util/List;

    add-int/lit8 v6, v4, -0x1

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le8;

    .line 135
    :goto_1e
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1d

    :cond_2e
    move-object v2, v3

    .line 136
    :cond_2f
    iget-object v10, v0, Lc6;->a:Ljava/lang/String;

    .line 137
    iget-object v1, v0, Lc6;->g:Lm6;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    .line 138
    iget-object v3, v0, Lc6;->b:Ls71;

    .line 139
    iget-object v4, v0, Lc6;->d:Ljava/util/List;

    .line 140
    iget-object v5, v0, Lc6;->f:Lym;

    .line 141
    iget-boolean v6, v0, Lc6;->k:Z

    .line 142
    sget-object v9, La6;->a:Lz5;

    .line 143
    const-class v9, Lz91;

    if-eqz v6, :cond_47

    .line 144
    sget-object v6, Lrr;->k:Lrr;

    if-eqz v6, :cond_47

    .line 145
    iget-object v6, v3, Ls71;->c:Lhr0;

    if-eqz v6, :cond_30

    .line 146
    iget-object v6, v6, Lhr0;->a:Ler0;

    if-eqz v6, :cond_30

    .line 147
    iget v6, v6, Ler0;->b:I

    .line 148
    new-instance v11, Lbs;

    invoke-direct {v11, v6}, Lbs;-><init>(I)V

    goto :goto_1f

    :cond_30
    move-object/from16 v11, p1

    :goto_1f
    if-nez v11, :cond_32

    :cond_31
    const/4 v6, 0x0

    goto :goto_20

    .line 149
    :cond_32
    iget v6, v11, Lbs;->a:I

    const/4 v11, 0x2

    if-ne v6, v11, :cond_31

    move/from16 v6, p4

    .line 150
    :goto_20
    invoke-static {}, Lrr;->a()Lrr;

    move-result-object v11

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v12

    .line 151
    invoke-virtual {v11}, Lrr;->b()I

    move-result v13

    move/from16 v14, p4

    if-ne v13, v14, :cond_33

    const/4 v13, 0x1

    goto :goto_21

    :cond_33
    const/4 v13, 0x0

    :goto_21
    if-eqz v13, :cond_46

    if-ltz v12, :cond_45

    if-ltz v12, :cond_34

    const/4 v13, 0x1

    goto :goto_22

    :cond_34
    const/4 v13, 0x0

    :goto_22
    if-eqz v13, :cond_44

    .line 152
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v13

    if-ltz v13, :cond_35

    const/4 v13, 0x1

    goto :goto_23

    :cond_35
    const/4 v13, 0x0

    :goto_23
    if-eqz v13, :cond_43

    .line 153
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v13

    if-gt v12, v13, :cond_36

    const/4 v13, 0x1

    goto :goto_24

    :cond_36
    const/4 v13, 0x0

    :goto_24
    if-eqz v13, :cond_42

    .line 154
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v13

    if-eqz v13, :cond_37

    if-nez v12, :cond_38

    :cond_37
    move/from16 p2, v8

    move-object v6, v9

    goto/16 :goto_29

    :cond_38
    const/4 v14, 0x1

    if-eq v6, v14, :cond_39

    const/4 v14, 0x0

    goto :goto_25

    :cond_39
    const/4 v14, 0x1

    .line 155
    :goto_25
    iget-object v6, v11, Lrr;->e:Lor;

    .line 156
    iget-object v6, v6, Lor;->b:Lo8;

    .line 157
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    instance-of v11, v10, Landroid/text/Spannable;

    if-eqz v11, :cond_3a

    .line 159
    new-instance v11, Lpa1;

    move-object v13, v10

    check-cast v13, Landroid/text/Spannable;

    invoke-direct {v11, v13}, Lpa1;-><init>(Landroid/text/Spannable;)V

    const/4 v13, 0x0

    goto :goto_26

    .line 160
    :cond_3a
    instance-of v11, v10, Landroid/text/Spanned;

    if-eqz v11, :cond_3b

    .line 161
    move-object v11, v10

    check-cast v11, Landroid/text/Spanned;

    add-int/lit8 v13, v12, 0x1

    const/4 v15, -0x1

    invoke-interface {v11, v15, v13, v9}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v11

    if-gt v11, v12, :cond_3b

    .line 162
    new-instance v11, Lpa1;

    .line 163
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    const/4 v13, 0x0

    .line 164
    iput-boolean v13, v11, Lpa1;->d:Z

    .line 165
    new-instance v15, Landroid/text/SpannableString;

    invoke-direct {v15, v10}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object v15, v11, Lpa1;->e:Landroid/text/Spannable;

    goto :goto_26

    :cond_3b
    const/4 v13, 0x0

    move-object/from16 v11, p1

    :goto_26
    if-eqz v11, :cond_3e

    .line 166
    iget-object v15, v11, Lpa1;->e:Landroid/text/Spannable;

    invoke-interface {v15, v13, v12, v9}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v15

    .line 167
    check-cast v15, [Lz91;

    if-eqz v15, :cond_3e

    .line 168
    array-length v13, v15

    if-lez v13, :cond_3e

    .line 169
    array-length v13, v15

    move/from16 p2, v8

    move-object/from16 p3, v9

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_27
    if-ge v8, v13, :cond_3d

    move/from16 v16, v8

    .line 170
    aget-object v8, v15, v16

    move-object/from16 v18, v10

    .line 171
    iget-object v10, v11, Lpa1;->e:Landroid/text/Spannable;

    invoke-interface {v10, v8}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v10

    move/from16 v19, v13

    .line 172
    iget-object v13, v11, Lpa1;->e:Landroid/text/Spannable;

    invoke-interface {v13, v8}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v13

    if-eq v10, v12, :cond_3c

    .line 173
    invoke-virtual {v11, v8}, Lpa1;->removeSpan(Ljava/lang/Object;)V

    .line 174
    :cond_3c
    invoke-static {v10, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 175
    invoke-static {v13, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    add-int/lit8 v8, v16, 0x1

    move-object/from16 v10, v18

    move/from16 v13, v19

    goto :goto_27

    :cond_3d
    move-object/from16 v18, v10

    goto :goto_28

    :cond_3e
    move/from16 p2, v8

    move-object/from16 p3, v9

    move-object/from16 v18, v10

    const/4 v9, 0x0

    :goto_28
    if-eq v9, v12, :cond_3f

    .line 176
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v8

    if-lt v9, v8, :cond_40

    :cond_3f
    move-object/from16 v6, p3

    move-object/from16 v10, v18

    goto :goto_29

    .line 177
    :cond_40
    new-instance v15, Ld;

    iget-object v8, v6, Lo8;->a:Ljava/lang/Object;

    check-cast v8, Lr3;

    const/4 v10, 0x3

    invoke-direct {v15, v10, v11, v8}, Ld;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v13, 0x7fffffff

    move v11, v9

    move-object/from16 v10, v18

    move-object v9, v6

    move-object/from16 v6, p3

    invoke-virtual/range {v9 .. v15}, Lo8;->l(Ljava/lang/CharSequence;IIIZLyr;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpa1;

    if-eqz v8, :cond_41

    .line 178
    iget-object v8, v8, Lpa1;->e:Landroid/text/Spannable;

    goto :goto_2a

    :cond_41
    :goto_29
    move-object v8, v10

    .line 179
    :goto_2a
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2b

    .line 180
    :cond_42
    const-string v0, "end should be < than charSequence length"

    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    throw p1

    .line 181
    :cond_43
    const-string v0, "start should be < than charSequence length"

    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    throw p1

    .line 182
    :cond_44
    const-string v0, "start should be <= than end"

    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    throw p1

    .line 183
    :cond_45
    const-string v0, "end cannot be negative"

    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    throw p1

    .line 184
    :cond_46
    const-string v0, "Not initialized yet"

    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    throw p1

    :cond_47
    move/from16 p2, v8

    move-object v6, v9

    move-object v8, v10

    .line 185
    :goto_2b
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v9

    const-wide v13, 0xff00000000L

    if-eqz v9, :cond_48

    .line 186
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_48

    .line 187
    iget-object v9, v3, Ls71;->b:Lap0;

    .line 188
    iget-object v9, v9, Lap0;->d:Lz61;

    .line 189
    sget-object v15, Lz61;->c:Lz61;

    .line 190
    invoke-static {v9, v15}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_48

    .line 191
    iget-object v9, v3, Ls71;->b:Lap0;

    const-wide/16 p5, 0x0

    .line 192
    iget-wide v11, v9, Lap0;->c:J

    and-long/2addr v11, v13

    cmp-long v9, v11, p5

    if-nez v9, :cond_49

    goto/16 :goto_52

    :cond_48
    const-wide/16 p5, 0x0

    .line 193
    :cond_49
    instance-of v9, v8, Landroid/text/Spannable;

    if-eqz v9, :cond_4a

    .line 194
    check-cast v8, Landroid/text/Spannable;

    goto :goto_2c

    .line 195
    :cond_4a
    new-instance v9, Landroid/text/SpannableString;

    invoke-direct {v9, v8}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v8, v9

    .line 196
    :goto_2c
    iget-object v9, v3, Ls71;->a:Lj31;

    .line 197
    iget-object v9, v9, Lj31;->m:Lu61;

    .line 198
    sget-object v11, Lu61;->c:Lu61;

    invoke-static {v9, v11}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/16 v11, 0x21

    if-eqz v9, :cond_4b

    .line 199
    sget-object v9, La6;->a:Lz5;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    const/4 v12, 0x0

    .line 200
    invoke-interface {v8, v9, v12, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 201
    :cond_4b
    iget-object v9, v3, Ls71;->c:Lhr0;

    if-eqz v9, :cond_4c

    .line 202
    iget-object v9, v9, Lhr0;->a:Ler0;

    if-eqz v9, :cond_4c

    .line 203
    iget-boolean v9, v9, Ler0;->a:Z

    goto :goto_2d

    :cond_4c
    const/4 v9, 0x0

    :goto_2d
    if-eqz v9, :cond_4f

    .line 204
    iget-object v9, v3, Ls71;->b:Lap0;

    .line 205
    iget-object v10, v9, Lap0;->f:Lla0;

    if-nez v10, :cond_4f

    .line 206
    iget-wide v9, v9, Lap0;->c:J

    .line 207
    invoke-static {v9, v10, v1, v5}, Lv50;->p(JFLym;)F

    move-result v9

    .line 208
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v10

    if-nez v10, :cond_4d

    .line 209
    new-instance v10, Lha0;

    invoke-direct {v10, v9}, Lha0;-><init>(F)V

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v9

    const/4 v12, 0x0

    .line 210
    invoke-interface {v8, v10, v12, v9, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_4d
    move-wide v15, v13

    :cond_4e
    const/4 v12, 0x0

    goto :goto_33

    .line 211
    :cond_4f
    iget-object v9, v3, Ls71;->b:Lap0;

    .line 212
    iget-object v10, v9, Lap0;->f:Lla0;

    if-nez v10, :cond_50

    .line 213
    sget-object v10, Lla0;->d:Lla0;

    :cond_50
    move-wide v15, v13

    .line 214
    iget-wide v13, v9, Lap0;->c:J

    .line 215
    invoke-static {v13, v14, v1, v5}, Lv50;->p(JFLym;)F

    move-result v21

    .line 216
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-nez v9, :cond_4e

    .line 217
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-nez v9, :cond_51

    goto :goto_2e

    :cond_51
    invoke-static {v8}, Lk41;->b0(Ljava/lang/CharSequence;)C

    move-result v9

    const/16 v12, 0xa

    if-ne v9, v12, :cond_52

    :goto_2e
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v9

    const/4 v14, 0x1

    add-int/2addr v9, v14

    :goto_2f
    move/from16 v22, v9

    goto :goto_30

    :cond_52
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v9

    goto :goto_2f

    .line 218
    :goto_30
    new-instance v20, Lma0;

    .line 219
    iget v9, v10, Lla0;->b:I

    and-int/lit8 v12, v9, 0x1

    if-lez v12, :cond_53

    const/16 v23, 0x1

    goto :goto_31

    :cond_53
    const/16 v23, 0x0

    :goto_31
    and-int/lit8 v9, v9, 0x10

    if-lez v9, :cond_54

    const/16 v24, 0x1

    goto :goto_32

    :cond_54
    const/16 v24, 0x0

    .line 220
    :goto_32
    iget v9, v10, Lla0;->a:F

    .line 221
    iget v10, v10, Lla0;->c:I

    move/from16 v25, v9

    move/from16 v26, v10

    .line 222
    invoke-direct/range {v20 .. v26}, Lma0;-><init>(FIZZFI)V

    move-object/from16 v9, v20

    .line 223
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v10

    const/4 v12, 0x0

    .line 224
    invoke-interface {v8, v9, v12, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 225
    :goto_33
    iget-object v9, v3, Ls71;->b:Lap0;

    .line 226
    iget-object v9, v9, Lap0;->d:Lz61;

    if-eqz v9, :cond_5c

    .line 227
    iget-wide v13, v9, Lz61;->a:J

    iget-wide v9, v9, Lz61;->b:J

    move/from16 v17, v12

    .line 228
    invoke-static/range {v17 .. v17}, Lj50;->q(I)J

    move-result-wide v11

    invoke-static {v13, v14, v11, v12}, Lu71;->a(JJ)Z

    move-result v11

    if-eqz v11, :cond_55

    invoke-static/range {v17 .. v17}, Lj50;->q(I)J

    move-result-wide v11

    invoke-static {v9, v10, v11, v12}, Lu71;->a(JJ)Z

    move-result v11

    if-nez v11, :cond_5c

    :cond_55
    and-long v11, v13, v15

    cmp-long v11, v11, p5

    if-nez v11, :cond_56

    goto/16 :goto_36

    :cond_56
    and-long v11, v9, v15

    cmp-long v11, v11, p5

    if-nez v11, :cond_57

    goto/16 :goto_36

    .line 229
    :cond_57
    invoke-static {v13, v14}, Lu71;->b(J)J

    move-result-wide v11

    move/from16 p5, v1

    const-wide v0, 0x100000000L

    .line 230
    invoke-static {v11, v12, v0, v1}, Lv71;->a(JJ)Z

    move-result v15

    if-eqz v15, :cond_58

    invoke-interface {v5, v13, v14}, Lym;->P(J)F

    move-result v11

    const-wide v0, 0x200000000L

    goto :goto_34

    :cond_58
    const-wide v0, 0x200000000L

    .line 231
    invoke-static {v11, v12, v0, v1}, Lv71;->a(JJ)Z

    move-result v11

    if-eqz v11, :cond_59

    invoke-static {v13, v14}, Lu71;->c(J)F

    move-result v11

    mul-float v11, v11, p5

    goto :goto_34

    :cond_59
    move/from16 v11, p2

    .line 232
    :goto_34
    invoke-static {v9, v10}, Lu71;->b(J)J

    move-result-wide v12

    const-wide v14, 0x100000000L

    .line 233
    invoke-static {v12, v13, v14, v15}, Lv71;->a(JJ)Z

    move-result v16

    if-eqz v16, :cond_5a

    invoke-interface {v5, v9, v10}, Lym;->P(J)F

    move-result v9

    goto :goto_35

    .line 234
    :cond_5a
    invoke-static {v12, v13, v0, v1}, Lv71;->a(JJ)Z

    move-result v12

    if-eqz v12, :cond_5b

    invoke-static {v9, v10}, Lu71;->c(J)F

    move-result v0

    mul-float v9, v0, p5

    goto :goto_35

    :cond_5b
    move/from16 v9, p2

    .line 235
    :goto_35
    new-instance v0, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v10, v11

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-float v1, v10

    float-to-int v1, v1

    float-to-double v9, v9

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-float v9, v9

    float-to-int v9, v9

    invoke-direct {v0, v1, v9}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 236
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v9, 0x21

    const/4 v12, 0x0

    .line 237
    invoke-interface {v8, v0, v12, v1, v9}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 238
    :cond_5c
    :goto_36
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 239
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v9, 0x0

    :goto_37
    if-ge v9, v1, :cond_60

    .line 240
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 241
    check-cast v10, Le8;

    .line 242
    iget-object v11, v10, Le8;->a:Ljava/lang/Object;

    .line 243
    instance-of v12, v11, Lj31;

    if-eqz v12, :cond_5f

    move-object v12, v11

    check-cast v12, Lj31;

    .line 244
    iget-object v13, v12, Lj31;->f:Lz51;

    if-nez v13, :cond_5e

    .line 245
    iget-object v13, v12, Lj31;->d:Lxv;

    if-nez v13, :cond_5e

    .line 246
    iget-object v12, v12, Lj31;->c:Lzv;

    if-eqz v12, :cond_5d

    goto :goto_38

    .line 247
    :cond_5d
    check-cast v11, Lj31;

    .line 248
    iget-object v11, v11, Lj31;->e:Lyv;

    if-eqz v11, :cond_5f

    .line 249
    :cond_5e
    :goto_38
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5f
    add-int/lit8 v9, v9, 0x1

    goto :goto_37

    .line 250
    :cond_60
    iget-object v1, v3, Ls71;->a:Lj31;

    .line 251
    iget-object v9, v1, Lj31;->f:Lz51;

    if-nez v9, :cond_63

    .line 252
    iget-object v10, v1, Lj31;->d:Lxv;

    if-nez v10, :cond_63

    .line 253
    iget-object v10, v1, Lj31;->c:Lzv;

    if-eqz v10, :cond_61

    goto :goto_39

    .line 254
    :cond_61
    iget-object v10, v1, Lj31;->e:Lyv;

    if-eqz v10, :cond_62

    goto :goto_39

    :cond_62
    move-object/from16 v1, p1

    goto :goto_3a

    .line 255
    :cond_63
    :goto_39
    iget-object v10, v1, Lj31;->c:Lzv;

    .line 256
    iget-object v11, v1, Lj31;->d:Lxv;

    .line 257
    iget-object v1, v1, Lj31;->e:Lyv;

    .line 258
    new-instance v20, Lj31;

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

    move-object/from16 v27, v1

    move-object/from16 v28, v9

    move-object/from16 v25, v10

    move-object/from16 v26, v11

    invoke-direct/range {v20 .. v39}, Lj31;-><init>(JJLzv;Lxv;Lyv;Lz51;Ljava/lang/String;JLz9;Ly61;Lfb0;JLu61;Lv01;I)V

    move-object/from16 v1, v20

    .line 259
    :goto_3a
    new-instance v9, Lqn0;

    const/4 v14, 0x1

    invoke-direct {v9, v14, v8, v7}, Lqn0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 260
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-gt v7, v14, :cond_66

    .line 261
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_65

    const/4 v12, 0x0

    .line 262
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Le8;

    .line 263
    iget-object v7, v7, Le8;->a:Ljava/lang/Object;

    .line 264
    check-cast v7, Lj31;

    if-nez v1, :cond_64

    goto :goto_3b

    .line 265
    :cond_64
    invoke-virtual {v1, v7}, Lj31;->c(Lj31;)Lj31;

    move-result-object v7

    .line 266
    :goto_3b
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8;

    .line 267
    iget v1, v1, Le8;->b:I

    .line 268
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 269
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8;

    .line 270
    iget v0, v0, Le8;->c:I

    .line 271
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 272
    invoke-virtual {v9, v7, v1, v0}, Lqn0;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_65
    move-object/from16 v23, v5

    goto/16 :goto_42

    .line 273
    :cond_66
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    mul-int/lit8 v10, v7, 0x2

    .line 274
    new-array v11, v10, [I

    .line 275
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_3c
    if-ge v13, v12, :cond_67

    .line 276
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 277
    check-cast v14, Le8;

    .line 278
    iget v15, v14, Le8;->b:I

    .line 279
    aput v15, v11, v13

    add-int v15, v13, v7

    .line 280
    iget v14, v14, Le8;->c:I

    .line 281
    aput v14, v11, v15

    add-int/lit8 v13, v13, 0x1

    goto :goto_3c

    :cond_67
    const/4 v14, 0x1

    if-le v10, v14, :cond_68

    .line 282
    invoke-static {v11}, Ljava/util/Arrays;->sort([I)V

    :cond_68
    if-eqz v10, :cond_8b

    const/16 v17, 0x0

    .line 283
    aget v7, v11, v17

    const/4 v12, 0x0

    :goto_3d
    if-ge v12, v10, :cond_65

    .line 284
    aget v13, v11, v12

    if-ne v13, v7, :cond_69

    move-object/from16 p6, v0

    move-object/from16 p5, v1

    move-object/from16 v23, v5

    move/from16 v16, v10

    goto :goto_41

    .line 285
    :cond_69
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v14

    move-object/from16 p5, v1

    const/4 v15, 0x0

    :goto_3e
    if-ge v15, v14, :cond_6c

    .line 286
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p6, v0

    .line 287
    move-object/from16 v0, v16

    check-cast v0, Le8;

    move-object/from16 v23, v5

    .line 288
    iget v5, v0, Le8;->b:I

    move/from16 v16, v10

    .line 289
    iget v10, v0, Le8;->c:I

    if-eq v5, v10, :cond_6b

    .line 290
    invoke-static {v7, v13, v5, v10}, Lg8;->a(IIII)Z

    move-result v5

    if-eqz v5, :cond_6b

    .line 291
    iget-object v0, v0, Le8;->a:Ljava/lang/Object;

    .line 292
    check-cast v0, Lj31;

    if-nez v1, :cond_6a

    :goto_3f
    move-object v1, v0

    goto :goto_40

    .line 293
    :cond_6a
    invoke-virtual {v1, v0}, Lj31;->c(Lj31;)Lj31;

    move-result-object v0

    goto :goto_3f

    :cond_6b
    :goto_40
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p6

    move/from16 v10, v16

    move-object/from16 v5, v23

    goto :goto_3e

    :cond_6c
    move-object/from16 p6, v0

    move-object/from16 v23, v5

    move/from16 v16, v10

    if-eqz v1, :cond_6d

    .line 294
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v9, v1, v0, v5}, Lqn0;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6d
    move v7, v13

    :goto_41
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, p5

    move-object/from16 v0, p6

    move/from16 v10, v16

    move-object/from16 v5, v23

    goto :goto_3d

    .line 295
    :goto_42
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v9, 0x0

    :goto_43
    if-ge v9, v0, :cond_7e

    .line 296
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le8;

    .line 297
    iget-object v7, v5, Le8;->a:Ljava/lang/Object;

    .line 298
    instance-of v10, v7, Lj31;

    if-eqz v10, :cond_6e

    .line 299
    iget v10, v5, Le8;->b:I

    .line 300
    iget v5, v5, Le8;->c:I

    if-ltz v10, :cond_6e

    .line 301
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-ge v10, v11, :cond_6e

    if-le v5, v10, :cond_6e

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-le v5, v11, :cond_6f

    :cond_6e
    move/from16 p5, v0

    move/from16 p6, v1

    move-object/from16 v5, v23

    goto/16 :goto_4a

    .line 302
    :cond_6f
    check-cast v7, Lj31;

    .line 303
    iget-object v11, v7, Lj31;->i:Lz9;

    iget-object v12, v7, Lj31;->a:Lx61;

    if-eqz v11, :cond_70

    .line 304
    iget v11, v11, Lz9;->a:F

    .line 305
    new-instance v13, Laa;

    const/4 v14, 0x0

    invoke-direct {v13, v11, v14}, Laa;-><init>(FI)V

    const/16 v11, 0x21

    .line 306
    invoke-interface {v8, v13, v10, v5, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 307
    :cond_70
    invoke-interface {v12}, Lx61;->a()J

    move-result-wide v13

    .line 308
    invoke-static {v8, v13, v14, v10, v5}, Lv50;->q(Landroid/text/Spannable;JII)V

    .line 309
    invoke-interface {v12}, Lx61;->e()Lpf1;

    move-result-object v11

    .line 310
    invoke-interface {v12}, Lx61;->f()F

    move-result v12

    if-eqz v11, :cond_72

    .line 311
    instance-of v13, v11, Lg31;

    if-eqz v13, :cond_71

    .line 312
    check-cast v11, Lg31;

    .line 313
    iget-wide v11, v11, Lg31;->l:J

    .line 314
    invoke-static {v8, v11, v12, v10, v5}, Lv50;->q(Landroid/text/Spannable;JII)V

    goto :goto_44

    .line 315
    :cond_71
    new-instance v13, Lu01;

    check-cast v11, Lqb;

    invoke-direct {v13, v11, v12}, Lu01;-><init>(Lqb;F)V

    const/16 v11, 0x21

    .line 316
    invoke-interface {v8, v13, v10, v5, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 317
    :cond_72
    :goto_44
    iget-object v11, v7, Lj31;->m:Lu61;

    if-eqz v11, :cond_75

    .line 318
    iget v11, v11, Lu61;->a:I

    .line 319
    new-instance v12, Lv61;

    or-int/lit8 v13, v11, 0x1

    if-ne v13, v11, :cond_73

    const/4 v13, 0x1

    goto :goto_45

    :cond_73
    const/4 v13, 0x0

    :goto_45
    or-int/lit8 v14, v11, 0x2

    if-ne v14, v11, :cond_74

    const/4 v11, 0x1

    goto :goto_46

    :cond_74
    const/4 v11, 0x0

    :goto_46
    invoke-direct {v12, v13, v11}, Lv61;-><init>(ZZ)V

    const/16 v11, 0x21

    .line 320
    invoke-interface {v8, v12, v10, v5, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_47

    :cond_75
    const/16 v11, 0x21

    .line 321
    :goto_47
    iget-wide v12, v7, Lj31;->b:J

    move/from16 v25, v5

    move-object/from16 v20, v8

    move/from16 v24, v10

    move-wide/from16 v21, v12

    .line 322
    invoke-static/range {v20 .. v25}, Lv50;->r(Landroid/text/Spannable;JLym;II)V

    move-object/from16 v5, v23

    move/from16 v12, v25

    .line 323
    iget-object v13, v7, Lj31;->g:Ljava/lang/String;

    if-eqz v13, :cond_76

    .line 324
    new-instance v14, Lmv;

    const/4 v15, 0x0

    invoke-direct {v14, v15, v13}, Lmv;-><init>(ILjava/lang/Object;)V

    .line 325
    invoke-interface {v8, v14, v10, v12, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 326
    :cond_76
    iget-object v13, v7, Lj31;->j:Ly61;

    if-eqz v13, :cond_77

    .line 327
    new-instance v14, Landroid/text/style/ScaleXSpan;

    .line 328
    iget v15, v13, Ly61;->a:F

    .line 329
    invoke-direct {v14, v15}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 330
    invoke-interface {v8, v14, v10, v12, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 331
    new-instance v14, Laa;

    .line 332
    iget v13, v13, Ly61;->b:F

    const/4 v15, 0x1

    .line 333
    invoke-direct {v14, v13, v15}, Laa;-><init>(FI)V

    .line 334
    invoke-interface {v8, v14, v10, v12, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_48

    :cond_77
    const/4 v15, 0x1

    .line 335
    :goto_48
    iget-object v11, v7, Lj31;->k:Lfb0;

    .line 336
    invoke-static {v8, v11, v10, v12}, Lv50;->s(Landroid/text/Spannable;Lfb0;II)V

    .line 337
    iget-wide v13, v7, Lj31;->l:J

    const-wide/16 v18, 0x10

    cmp-long v11, v13, v18

    if-eqz v11, :cond_78

    .line 338
    new-instance v11, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v13, v14}, Lp30;->W(J)I

    move-result v13

    invoke-direct {v11, v13}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    const/16 v13, 0x21

    .line 339
    invoke-interface {v8, v11, v10, v12, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 340
    :cond_78
    iget-object v11, v7, Lj31;->n:Lv01;

    if-eqz v11, :cond_7a

    .line 341
    iget-wide v13, v11, Lv01;->b:J

    .line 342
    new-instance v15, Lw01;

    move/from16 p5, v0

    move/from16 p6, v1

    .line 343
    iget-wide v0, v11, Lv01;->a:J

    .line 344
    invoke-static {v0, v1}, Lp30;->W(J)I

    move-result v0

    const/16 v1, 0x20

    move-wide/from16 v18, v13

    shr-long v13, v18, v1

    long-to-int v1, v13

    .line 345
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const-wide v13, 0xffffffffL

    and-long v13, v18, v13

    long-to-int v13, v13

    .line 346
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    .line 347
    iget v11, v11, Lv01;->c:F

    cmpg-float v14, v11, p2

    if-nez v14, :cond_79

    const/4 v11, 0x1

    .line 348
    :cond_79
    invoke-direct {v15, v0, v1, v13, v11}, Lw01;-><init>(IFFF)V

    const/16 v11, 0x21

    .line 349
    invoke-interface {v8, v15, v10, v12, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_49

    :cond_7a
    move/from16 p5, v0

    move/from16 p6, v1

    const/16 v11, 0x21

    .line 350
    :goto_49
    iget-object v0, v7, Lj31;->o:Lo30;

    if-eqz v0, :cond_7b

    .line 351
    new-instance v1, Lvq;

    invoke-direct {v1, v0}, Lvq;-><init>(Lo30;)V

    .line 352
    invoke-interface {v8, v1, v10, v12, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 353
    :cond_7b
    iget-wide v0, v7, Lj31;->h:J

    .line 354
    invoke-static {v0, v1}, Lu71;->b(J)J

    move-result-wide v0

    const-wide v10, 0x100000000L

    invoke-static {v0, v1, v10, v11}, Lv71;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_7c

    .line 355
    iget-wide v0, v7, Lj31;->h:J

    .line 356
    invoke-static {v0, v1}, Lu71;->b(J)J

    move-result-wide v0

    const-wide v10, 0x200000000L

    invoke-static {v0, v1, v10, v11}, Lv71;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_7d

    :cond_7c
    const/4 v1, 0x1

    goto :goto_4b

    :cond_7d
    :goto_4a
    move/from16 v1, p6

    :goto_4b
    add-int/lit8 v9, v9, 0x1

    move/from16 v0, p5

    move-object/from16 v23, v5

    goto/16 :goto_43

    :cond_7e
    move/from16 p6, v1

    move-object/from16 v5, v23

    if-eqz p6, :cond_84

    .line 357
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v9, 0x0

    :goto_4c
    if-ge v9, v0, :cond_84

    .line 358
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8;

    .line 359
    iget-object v7, v1, Le8;->a:Ljava/lang/Object;

    .line 360
    check-cast v7, Ld8;

    .line 361
    instance-of v10, v7, Lj31;

    if-eqz v10, :cond_7f

    .line 362
    iget v10, v1, Le8;->b:I

    .line 363
    iget v1, v1, Le8;->c:I

    if-ltz v10, :cond_7f

    .line 364
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-ge v10, v11, :cond_7f

    if-le v1, v10, :cond_7f

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-le v1, v11, :cond_80

    :cond_7f
    move-object v15, v6

    const/16 v11, 0x21

    goto :goto_4e

    .line 365
    :cond_80
    check-cast v7, Lj31;

    .line 366
    iget-wide v11, v7, Lj31;->h:J

    .line 367
    invoke-static {v11, v12}, Lu71;->b(J)J

    move-result-wide v13

    move-object v15, v6

    const-wide v6, 0x100000000L

    .line 368
    invoke-static {v13, v14, v6, v7}, Lv71;->a(JJ)Z

    move-result v16

    if-eqz v16, :cond_81

    new-instance v6, Ll90;

    invoke-interface {v5, v11, v12}, Lym;->P(J)F

    move-result v7

    invoke-direct {v6, v7}, Ll90;-><init>(F)V

    goto :goto_4d

    :cond_81
    const-wide v6, 0x200000000L

    .line 369
    invoke-static {v13, v14, v6, v7}, Lv71;->a(JJ)Z

    move-result v13

    if-eqz v13, :cond_82

    .line 370
    new-instance v6, Lk90;

    invoke-static {v11, v12}, Lu71;->c(J)F

    move-result v7

    invoke-direct {v6, v7}, Lk90;-><init>(F)V

    goto :goto_4d

    :cond_82
    move-object/from16 v6, p1

    :goto_4d
    const/16 v11, 0x21

    if-eqz v6, :cond_83

    .line 371
    invoke-interface {v8, v6, v10, v1, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_83
    :goto_4e
    add-int/lit8 v9, v9, 0x1

    move-object v6, v15

    goto :goto_4c

    :cond_84
    move-object v15, v6

    .line 372
    iget-object v0, v3, Ls71;->b:Lap0;

    .line 373
    iget-object v0, v0, Lap0;->d:Lz61;

    if-eqz v0, :cond_86

    .line 374
    iget-wide v0, v0, Lz61;->a:J

    .line 375
    invoke-static {v0, v1}, Lu71;->b(J)J

    move-result-wide v6

    const-wide v10, 0x100000000L

    .line 376
    invoke-static {v6, v7, v10, v11}, Lv71;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_85

    invoke-interface {v5, v0, v1}, Lym;->P(J)F

    goto :goto_4f

    :cond_85
    const-wide v9, 0x200000000L

    .line 377
    invoke-static {v6, v7, v9, v10}, Lv71;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_86

    invoke-static {v0, v1}, Lu71;->c(J)F

    .line 378
    :cond_86
    :goto_4f
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v9, 0x0

    :goto_50
    if-ge v9, v0, :cond_87

    .line 379
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 380
    check-cast v1, Le8;

    .line 381
    iget-object v1, v1, Le8;->a:Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    goto :goto_50

    .line 382
    :cond_87
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_8a

    const/4 v12, 0x0

    .line 383
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 384
    check-cast v0, Le8;

    .line 385
    iget-object v1, v0, Le8;->a:Ljava/lang/Object;

    if-nez v1, :cond_89

    .line 386
    iget v1, v0, Le8;->b:I

    .line 387
    iget v0, v0, Le8;->c:I

    .line 388
    invoke-interface {v8, v1, v0, v15}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    .line 389
    array-length v1, v0

    :goto_51
    if-ge v12, v1, :cond_88

    aget-object v2, v0, v12

    check-cast v2, Lz91;

    .line 390
    invoke-interface {v8, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_51

    .line 391
    :cond_88
    new-instance v0, Lar0;

    .line 392
    throw p1

    .line 393
    :cond_89
    invoke-static {}, Lxc;->d()V

    throw p1

    :cond_8a
    move-object/from16 v0, p0

    .line 394
    :goto_52
    iput-object v8, v0, Lc6;->h:Ljava/lang/CharSequence;

    .line 395
    new-instance v1, Lp50;

    iget-object v2, v0, Lc6;->g:Lm6;

    iget v3, v0, Lc6;->l:I

    invoke-direct {v1, v8, v2, v3}, Lp50;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object v1, v0, Lc6;->i:Lp50;

    return-void

    .line 396
    :cond_8b
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Array is empty."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8c
    const/16 p1, 0x0

    .line 397
    const-string v0, "Invalid TextDirection."

    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()F
    .locals 9

    .line 1
    iget-object p0, p0, Lc6;->i:Lp50;

    .line 2
    .line 3
    iget v0, p0, Lp50;->e:F

    .line 4
    .line 5
    iget-object v1, p0, Lp50;->b:Landroid/text/TextPaint;

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
    iget p0, p0, Lp50;->e:F

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
    new-instance v2, Lxd;

    .line 25
    .line 26
    iget-object v3, p0, Lp50;->a:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {v2, v3, v4}, Lxd;-><init>(Ljava/lang/CharSequence;I)V

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
    new-instance v3, Lh6;

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    invoke-direct {v3, v4}, Lh6;-><init>(I)V

    .line 44
    .line 45
    .line 46
    const/16 v4, 0xa

    .line 47
    .line 48
    invoke-direct {v2, v4, v3}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/4 v5, 0x0

    .line 56
    :goto_0
    const/4 v6, -0x1

    .line 57
    if-eq v3, v6, :cond_3

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->size()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-ge v6, v4, :cond_1

    .line 64
    .line 65
    new-instance v6, Luo0;

    .line 66
    .line 67
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-direct {v6, v5, v7}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, Luo0;

    .line 87
    .line 88
    if-eqz v6, :cond_2

    .line 89
    .line 90
    iget-object v7, v6, Luo0;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v7, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    iget-object v6, v6, Luo0;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v6, Ljava/lang/Number;

    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    sub-int/2addr v7, v6

    .line 107
    sub-int v6, v3, v5

    .line 108
    .line 109
    if-ge v7, v6, :cond_2

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    new-instance v6, Luo0;

    .line 115
    .line 116
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-direct {v6, v5, v7}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    move v8, v5

    .line 135
    move v5, v3

    .line 136
    move v3, v8

    .line 137
    goto :goto_0

    .line 138
    :cond_3
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    const/4 v3, 0x0

    .line 143
    if-eqz v0, :cond_4

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_4
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_6

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, Luo0;

    .line 161
    .line 162
    iget-object v3, v2, Luo0;->d:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v3, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    iget-object v2, v2, Luo0;->e:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v2, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-virtual {p0}, Lp50;->b()Ljava/lang/CharSequence;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-static {v4, v3, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    move v3, v2

    .line 187
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_5

    .line 192
    .line 193
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    check-cast v2, Luo0;

    .line 198
    .line 199
    iget-object v4, v2, Luo0;->d:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v4, Ljava/lang/Number;

    .line 202
    .line 203
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    iget-object v2, v2, Luo0;->e:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v2, Ljava/lang/Number;

    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    invoke-virtual {p0}, Lp50;->b()Ljava/lang/CharSequence;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-static {v5, v4, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    goto :goto_2

    .line 228
    :cond_5
    :goto_3
    iput v3, p0, Lp50;->e:F

    .line 229
    .line 230
    return v3

    .line 231
    :cond_6
    invoke-static {}, Lxc;->m()V

    .line 232
    .line 233
    .line 234
    return v3
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc6;->j:Lo8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lo8;->k()Z

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
    iget-boolean v0, p0, Lc6;->k:Z

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget-object p0, p0, Lc6;->b:Ls71;

    .line 19
    .line 20
    invoke-static {p0}, Lp30;->i(Ls71;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    sget-object p0, Lwr;->a:Lx1;

    .line 27
    .line 28
    sget-object p0, Lwr;->a:Lx1;

    .line 29
    .line 30
    iget-object v0, p0, Lx1;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lw31;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    sget-object v0, Lrr;->k:Lrr;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lx1;->i()Lw31;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lx1;->e:Ljava/lang/Object;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    sget-object v0, Lpf1;->f:Lv00;

    .line 49
    .line 50
    :goto_1
    invoke-interface {v0}, Lw31;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    return v1

    .line 64
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 65
    return p0
.end method

.method public final c()F
    .locals 0

    .line 1
    iget-object p0, p0, Lc6;->i:Lp50;

    .line 2
    .line 3
    invoke-virtual {p0}, Lp50;->c()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
