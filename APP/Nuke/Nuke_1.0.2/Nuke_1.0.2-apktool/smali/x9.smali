.class public final Lx9;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ltw1;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lm13;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Lxl0;

.field public final f:Le70;

.field public final g:Lqb;

.field public final h:Ljava/lang/CharSequence;

.field public final i:Lg61;

.field public j:Lvu2;

.field public final k:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm13;Ljava/util/List;Ljava/util/List;Lxl0;Le70;)V
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p1

    .line 2
    iput-object v4, v0, Lx9;->a:Ljava/lang/String;

    .line 3
    iput-object v1, v0, Lx9;->b:Lm13;

    .line 4
    iput-object v2, v0, Lx9;->c:Ljava/util/List;

    move-object/from16 v4, p4

    .line 5
    iput-object v4, v0, Lx9;->d:Ljava/util/List;

    move-object/from16 v4, p5

    .line 6
    iput-object v4, v0, Lx9;->e:Lxl0;

    .line 7
    iput-object v3, v0, Lx9;->f:Le70;

    .line 8
    new-instance v4, Lqb;

    invoke-interface {v3}, Le70;->b()F

    move-result v5

    const/4 v6, 0x1

    .line 9
    invoke-direct {v4, v6}, Landroid/text/TextPaint;-><init>(I)V

    .line 10
    iput v5, v4, Landroid/text/TextPaint;->density:F

    .line 11
    sget-object v5, Lgz2;->b:Lgz2;

    iput-object v5, v4, Lqb;->b:Lgz2;

    const/4 v5, 0x3

    .line 12
    iput v5, v4, Lqb;->c:I

    .line 13
    sget-object v7, Lbq2;->d:Lbq2;

    .line 14
    iput-object v7, v4, Lqb;->d:Lbq2;

    .line 15
    iput-object v4, v0, Lx9;->g:Lqb;

    .line 16
    invoke-static {v1}, Lqp0;->i(Lm13;)Z

    .line 17
    iget-object v7, v1, Lm13;->b:Lvw1;

    .line 18
    iget v8, v7, Lvw1;->b:I

    .line 19
    iget-object v1, v1, Lm13;->a:Llt2;

    .line 20
    iget-object v9, v1, Llt2;->k:Lkc1;

    const/4 v10, 0x4

    const/4 v12, 0x2

    const/4 v13, 0x0

    if-ne v8, v10, :cond_1

    :cond_0
    :goto_0
    move v8, v12

    goto :goto_2

    :cond_1
    const/4 v10, 0x5

    if-ne v8, v10, :cond_3

    :cond_2
    move v8, v5

    goto :goto_2

    :cond_3
    if-ne v8, v6, :cond_4

    move v8, v13

    goto :goto_2

    :cond_4
    if-ne v8, v12, :cond_5

    move v8, v6

    goto :goto_2

    :cond_5
    if-ne v8, v5, :cond_6

    goto :goto_1

    :cond_6
    if-nez v8, :cond_75

    :goto_1
    if-eqz v9, :cond_7

    .line 21
    iget-object v8, v9, Lkc1;->h:Ljava/util/List;

    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljc1;

    .line 22
    iget-object v8, v8, Ljc1;->a:Ljava/util/Locale;

    if-nez v8, :cond_8

    .line 23
    :cond_7
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    .line 24
    :cond_8
    invoke-static {v8}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v8

    if-eqz v8, :cond_0

    if-eq v8, v6, :cond_2

    goto :goto_0

    .line 25
    :goto_2
    iput v8, v0, Lx9;->k:I

    .line 26
    new-instance v8, Lw9;

    invoke-direct {v8, v13, v0}, Lw9;-><init>(ILjava/lang/Object;)V

    .line 27
    iget-object v7, v7, Lvw1;->i:Ld13;

    if-nez v7, :cond_9

    .line 28
    sget-object v7, Ld13;->c:Ld13;

    .line 29
    :cond_9
    iget-boolean v9, v7, Ld13;->b:Z

    if-eqz v9, :cond_a

    .line 30
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v9

    or-int/lit16 v9, v9, 0x80

    goto :goto_3

    .line 31
    :cond_a
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v9

    and-int/lit16 v9, v9, -0x81

    .line 32
    :goto_3
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setFlags(I)V

    .line 33
    iget v7, v7, Ld13;->a:I

    if-ne v7, v6, :cond_b

    .line 34
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v5

    or-int/lit8 v5, v5, 0x40

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFlags(I)V

    .line 35
    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_4

    :cond_b
    if-ne v7, v12, :cond_c

    .line 36
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 37
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_4

    :cond_c
    if-ne v7, v5, :cond_d

    .line 38
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 39
    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_4

    .line 40
    :cond_d
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 41
    :goto_4
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v5

    move v7, v13

    :goto_5
    if-ge v7, v5, :cond_f

    .line 42
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 43
    move-object v10, v9

    check-cast v10, Lrd;

    .line 44
    iget-object v10, v10, Lrd;->a:Ljava/lang/Object;

    .line 45
    instance-of v10, v10, Llt2;

    if-eqz v10, :cond_e

    goto :goto_6

    :cond_e
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_f
    const/4 v9, 0x0

    :goto_6
    if-eqz v9, :cond_10

    move v2, v6

    goto :goto_7

    :cond_10
    move v2, v13

    .line 46
    :goto_7
    iget-wide v9, v1, Llt2;->b:J

    iget-object v5, v1, Llt2;->c:Lim0;

    iget-object v7, v1, Llt2;->d:Lgm0;

    iget-object v12, v1, Llt2;->g:Ljava/lang/String;

    iget-object v14, v1, Llt2;->k:Lkc1;

    iget-object v15, v1, Llt2;->a:Ll03;

    const/16 p1, 0x0

    iget-object v11, v1, Llt2;->j:Lm03;

    move-object/from16 p3, v14

    iget-wide v13, v1, Llt2;->h:J

    move/from16 p4, v6

    move-object/from16 p5, v7

    .line 47
    invoke-static {v9, v10}, Lp13;->b(J)J

    move-result-wide v6

    move-wide/from16 v16, v13

    const-wide v13, 0x100000000L

    .line 48
    invoke-static {v6, v7, v13, v14}, Lq13;->a(JJ)Z

    move-result v18

    const-wide v13, 0x200000000L

    if-eqz v18, :cond_11

    invoke-interface {v3, v9, v10}, Le70;->h0(J)F

    move-result v6

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_8

    .line 49
    :cond_11
    invoke-static {v6, v7, v13, v14}, Lq13;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 50
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v6

    invoke-static {v9, v10}, Lp13;->c(J)F

    move-result v7

    mul-float/2addr v7, v6

    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 51
    :cond_12
    :goto_8
    iget-object v6, v1, Llt2;->f:Lmx2;

    if-nez v6, :cond_13

    if-nez p5, :cond_13

    if-eqz v5, :cond_18

    :cond_13
    if-nez v5, :cond_14

    .line 52
    sget-object v5, Lim0;->j:Lim0;

    :cond_14
    if-eqz p5, :cond_15

    move-object/from16 v7, p5

    .line 53
    iget v7, v7, Lgm0;->a:I

    goto :goto_9

    :cond_15
    const/4 v7, 0x0

    .line 54
    :goto_9
    iget-object v9, v1, Llt2;->e:Lhm0;

    if-eqz v9, :cond_16

    .line 55
    iget v9, v9, Lhm0;->a:I

    goto :goto_a

    :cond_16
    const v9, 0xffff

    .line 56
    :goto_a
    iget-object v10, v8, Lw9;->i:Ljava/lang/Object;

    check-cast v10, Lx9;

    .line 57
    iget-object v13, v10, Lx9;->e:Lxl0;

    check-cast v13, Lyl0;

    invoke-virtual {v13, v6, v5, v7, v9}, Lyl0;->b(Lmx2;Lim0;II)Lm63;

    move-result-object v5

    .line 58
    instance-of v6, v5, Lm63;

    if-nez v6, :cond_17

    .line 59
    new-instance v6, Lvu2;

    iget-object v7, v10, Lx9;->j:Lvu2;

    invoke-direct {v6, v5, v7}, Lvu2;-><init>(Lm63;Lvu2;)V

    .line 60
    iput-object v6, v10, Lx9;->j:Lvu2;

    .line 61
    iget-object v5, v6, Lvu2;->c:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v5, Landroid/graphics/Typeface;

    goto :goto_b

    .line 62
    :cond_17
    iget-object v5, v5, Lm63;->h:Ljava/lang/Object;

    .line 63
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v5, Landroid/graphics/Typeface;

    .line 64
    :goto_b
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_18
    const/16 v5, 0xa

    if-eqz p3, :cond_1a

    .line 65
    sget-object v6, Lkc1;->j:Lkc1;

    .line 66
    sget-object v6, Ld02;->a:Lb5;

    .line 67
    invoke-virtual {v6}, Lb5;->r()Lkc1;

    move-result-object v6

    move-object/from16 v7, p3

    .line 68
    invoke-virtual {v7, v6}, Lkc1;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1a

    .line 69
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v7, v5}, Leu;->B(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    iget-object v7, v7, Lkc1;->h:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 71
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 72
    check-cast v9, Ljc1;

    .line 73
    iget-object v9, v9, Ljc1;->a:Ljava/util/Locale;

    .line 74
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_19
    const/4 v9, 0x0

    .line 75
    new-array v7, v9, [Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    .line 76
    check-cast v6, [Ljava/util/Locale;

    array-length v7, v6

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ljava/util/Locale;

    new-instance v7, Landroid/os/LocaleList;

    invoke-direct {v7, v6}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 77
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTextLocales(Landroid/os/LocaleList;)V

    :cond_1a
    if-eqz v12, :cond_1b

    .line 78
    const-string v6, ""

    .line 79
    invoke-virtual {v12, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1b

    .line 80
    invoke-virtual {v4, v12}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_1b
    if-eqz v11, :cond_1c

    .line 81
    sget-object v6, Lm03;->c:Lm03;

    .line 82
    invoke-virtual {v11, v6}, Lm03;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1c

    .line 83
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v6

    .line 84
    iget v7, v11, Lm03;->a:F

    mul-float/2addr v6, v7

    .line 85
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 86
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v6

    .line 87
    iget v7, v11, Lm03;->b:F

    add-float/2addr v6, v7

    .line 88
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 89
    :cond_1c
    invoke-interface {v15}, Ll03;->b()J

    move-result-wide v6

    .line 90
    invoke-virtual {v4, v6, v7}, Lqb;->d(J)V

    .line 91
    invoke-interface {v15}, Ll03;->k()Lan;

    move-result-object v6

    const-wide v9, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 92
    invoke-interface {v15}, Ll03;->a()F

    move-result v7

    .line 93
    invoke-virtual {v4, v6, v9, v10, v7}, Lqb;->c(Lan;JF)V

    .line 94
    iget-object v6, v1, Llt2;->n:Lbq2;

    .line 95
    invoke-virtual {v4, v6}, Lqb;->f(Lbq2;)V

    .line 96
    iget-object v6, v1, Llt2;->m:Lgz2;

    .line 97
    invoke-virtual {v4, v6}, Lqb;->g(Lgz2;)V

    .line 98
    iget-object v6, v1, Llt2;->o:Lop0;

    .line 99
    invoke-virtual {v4, v6}, Lqb;->e(Lop0;)V

    .line 100
    invoke-static/range {v16 .. v17}, Lp13;->b(J)J

    move-result-wide v6

    const-wide v9, 0x100000000L

    invoke-static {v6, v7, v9, v10}, Lq13;->a(JJ)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1d

    invoke-static/range {v16 .. v17}, Lp13;->c(J)F

    move-result v6

    cmpg-float v6, v6, v7

    if-nez v6, :cond_1e

    :cond_1d
    move-wide/from16 v10, v16

    goto :goto_d

    .line 101
    :cond_1e
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v6

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v9

    mul-float/2addr v9, v6

    move-wide/from16 v10, v16

    .line 102
    invoke-interface {v3, v10, v11}, Le70;->h0(J)F

    move-result v3

    cmpg-float v6, v9, v7

    if-nez v6, :cond_1f

    goto :goto_e

    :cond_1f
    div-float/2addr v3, v9

    .line 103
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_e

    .line 104
    :goto_d
    invoke-static {v10, v11}, Lp13;->b(J)J

    move-result-wide v12

    const-wide v14, 0x200000000L

    invoke-static {v12, v13, v14, v15}, Lq13;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_20

    .line 105
    invoke-static {v10, v11}, Lp13;->c(J)F

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 106
    :cond_20
    :goto_e
    iget-wide v3, v1, Llt2;->l:J

    .line 107
    iget-object v1, v1, Llt2;->i:Lxj;

    if-eqz v2, :cond_22

    .line 108
    invoke-static {v10, v11}, Lp13;->b(J)J

    move-result-wide v12

    const-wide v14, 0x100000000L

    invoke-static {v12, v13, v14, v15}, Lq13;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-static {v10, v11}, Lp13;->c(J)F

    move-result v2

    cmpg-float v2, v2, v7

    if-nez v2, :cond_21

    goto :goto_f

    :cond_21
    move/from16 v2, p4

    goto :goto_10

    :cond_22
    :goto_f
    const/4 v2, 0x0

    .line 109
    :goto_10
    sget-wide v12, Lju;->g:J

    .line 110
    invoke-static {v3, v4, v12, v13}, Lju;->c(JJ)Z

    move-result v6

    if-nez v6, :cond_23

    .line 111
    sget-wide v14, Lju;->f:J

    .line 112
    invoke-static {v3, v4, v14, v15}, Lju;->c(JJ)Z

    move-result v6

    if-nez v6, :cond_23

    move/from16 v6, p4

    goto :goto_11

    :cond_23
    const/4 v6, 0x0

    :goto_11
    if-eqz v1, :cond_25

    .line 113
    iget v9, v1, Lxj;->a:F

    .line 114
    invoke-static {v9, v7}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_24

    goto :goto_12

    :cond_24
    move/from16 v9, p4

    goto :goto_13

    :cond_25
    :goto_12
    const/4 v9, 0x0

    :goto_13
    if-nez v2, :cond_26

    if-nez v6, :cond_26

    if-nez v9, :cond_26

    move-object/from16 v1, p1

    goto :goto_18

    :cond_26
    if-eqz v2, :cond_27

    :goto_14
    move-wide/from16 v29, v10

    goto :goto_15

    .line 115
    :cond_27
    sget-wide v10, Lp13;->c:J

    goto :goto_14

    :goto_15
    if-eqz v6, :cond_28

    move-wide/from16 v34, v3

    goto :goto_16

    :cond_28
    move-wide/from16 v34, v12

    :goto_16
    if-eqz v9, :cond_29

    move-object/from16 v31, v1

    goto :goto_17

    :cond_29
    move-object/from16 v31, p1

    .line 116
    :goto_17
    new-instance v19, Llt2;

    const/16 v37, 0x0

    const v38, 0xf67f

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v19 .. v38}, Llt2;-><init>(JJLim0;Lgm0;Lhm0;Lmx2;Ljava/lang/String;JLxj;Lm03;Lkc1;JLgz2;Lbq2;I)V

    move-object/from16 v1, v19

    .line 117
    :goto_18
    iget-object v2, v0, Lx9;->c:Ljava/util/List;

    if-eqz v1, :cond_2c

    .line 118
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_19
    if-ge v4, v2, :cond_2b

    if-nez v4, :cond_2a

    .line 119
    new-instance v6, Lrd;

    .line 120
    iget-object v9, v0, Lx9;->a:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x0

    .line 121
    invoke-direct {v6, v10, v9, v1}, Lrd;-><init>(IILjava/lang/Object;)V

    goto :goto_1a

    .line 122
    :cond_2a
    iget-object v6, v0, Lx9;->c:Ljava/util/List;

    add-int/lit8 v9, v4, -0x1

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lrd;

    .line 123
    :goto_1a
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_19

    :cond_2b
    move-object v2, v3

    .line 124
    :cond_2c
    iget-object v1, v0, Lx9;->a:Ljava/lang/String;

    .line 125
    iget-object v3, v0, Lx9;->g:Lqb;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    .line 126
    iget-object v4, v0, Lx9;->b:Lm13;

    .line 127
    iget-object v6, v0, Lx9;->d:Ljava/util/List;

    .line 128
    iget-object v12, v0, Lx9;->f:Le70;

    .line 129
    sget-object v9, Lv9;->a:Lu9;

    .line 130
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v9

    const-wide v13, 0xff00000000L

    if-eqz v9, :cond_2d

    .line 131
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_2d

    .line 132
    iget-object v9, v4, Lm13;->b:Lvw1;

    .line 133
    iget-object v9, v9, Lvw1;->d:Ln03;

    .line 134
    sget-object v15, Ln03;->c:Ln03;

    .line 135
    invoke-static {v9, v15}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2d

    .line 136
    iget-object v9, v4, Lm13;->b:Lvw1;

    const-wide/16 p5, 0x0

    .line 137
    iget-wide v10, v9, Lvw1;->c:J

    and-long v9, v10, v13

    cmp-long v9, v9, p5

    if-nez v9, :cond_2e

    goto/16 :goto_48

    :cond_2d
    const-wide/16 p5, 0x0

    .line 138
    :cond_2e
    instance-of v9, v1, Landroid/text/Spannable;

    if-eqz v9, :cond_2f

    .line 139
    move-object v9, v1

    check-cast v9, Landroid/text/Spannable;

    goto :goto_1b

    .line 140
    :cond_2f
    new-instance v9, Landroid/text/SpannableString;

    invoke-direct {v9, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 141
    :goto_1b
    iget-object v10, v4, Lm13;->a:Llt2;

    iget-object v15, v4, Lm13;->b:Lvw1;

    .line 142
    iget-object v10, v10, Llt2;->m:Lgz2;

    .line 143
    sget-object v11, Lgz2;->c:Lgz2;

    invoke-static {v10, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const/16 v11, 0x21

    if-eqz v10, :cond_30

    .line 144
    sget-object v10, Lv9;->a:Lu9;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    move/from16 p3, v7

    const/4 v7, 0x0

    .line 145
    invoke-interface {v9, v10, v7, v1, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_1c

    :cond_30
    move/from16 p3, v7

    .line 146
    :goto_1c
    iget-object v1, v4, Lm13;->c:Lw02;

    if-eqz v1, :cond_31

    .line 147
    iget-object v1, v1, Lw02;->a:Lk02;

    if-eqz v1, :cond_31

    .line 148
    iget-boolean v1, v1, Lk02;->a:Z

    goto :goto_1d

    :cond_31
    const/4 v1, 0x0

    :goto_1d
    if-eqz v1, :cond_33

    .line 149
    iget-object v1, v15, Lvw1;->f:Lya1;

    if-nez v1, :cond_33

    move-wide/from16 v16, v13

    .line 150
    iget-wide v13, v15, Lvw1;->c:J

    .line 151
    invoke-static {v13, v14, v3, v12}, Leu;->U(JFLe70;)F

    move-result v1

    .line 152
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_32

    .line 153
    new-instance v5, Lua1;

    invoke-direct {v5, v1}, Lua1;-><init>(F)V

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v10, 0x0

    .line 154
    invoke-interface {v9, v5, v10, v1, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_32
    const/4 v10, 0x0

    goto/16 :goto_23

    :cond_33
    move-wide/from16 v16, v13

    .line 155
    iget-object v1, v15, Lvw1;->f:Lya1;

    if-nez v1, :cond_34

    .line 156
    sget-object v1, Lya1;->d:Lya1;

    .line 157
    :cond_34
    iget-wide v13, v15, Lvw1;->c:J

    .line 158
    invoke-static {v13, v14, v3, v12}, Leu;->U(JFLe70;)F

    move-result v20

    .line 159
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_32

    .line 160
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_35

    goto :goto_1e

    .line 161
    :cond_35
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-eqz v7, :cond_39

    .line 162
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    .line 163
    invoke-interface {v9, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-ne v7, v5, :cond_36

    .line 164
    :goto_1e
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    :goto_1f
    move/from16 v21, v5

    goto :goto_20

    :cond_36
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v5

    goto :goto_1f

    .line 165
    :goto_20
    new-instance v19, Lza1;

    .line 166
    iget v5, v1, Lya1;->b:I

    and-int/lit8 v7, v5, 0x1

    if-lez v7, :cond_37

    move/from16 v22, p4

    goto :goto_21

    :cond_37
    const/16 v22, 0x0

    :goto_21
    and-int/lit8 v5, v5, 0x10

    if-lez v5, :cond_38

    move/from16 v23, p4

    goto :goto_22

    :cond_38
    const/16 v23, 0x0

    .line 167
    :goto_22
    iget v5, v1, Lya1;->a:F

    .line 168
    iget v1, v1, Lya1;->c:I

    move/from16 v25, v1

    move/from16 v24, v5

    .line 169
    invoke-direct/range {v19 .. v25}, Lza1;-><init>(FIZZFI)V

    move-object/from16 v1, v19

    .line 170
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/4 v10, 0x0

    .line 171
    invoke-interface {v9, v1, v10, v5, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_23

    .line 172
    :cond_39
    const-string v0, "Char sequence is empty."

    invoke-static {v0}, Lum2;->i(Ljava/lang/String;)V

    throw p1

    .line 173
    :goto_23
    iget-object v1, v15, Lvw1;->d:Ln03;

    if-eqz v1, :cond_42

    .line 174
    iget-wide v13, v1, Ln03;->a:J

    move/from16 p2, v10

    iget-wide v10, v1, Ln03;->b:J

    move-object v1, v6

    .line 175
    invoke-static/range {p2 .. p2}, Lrg3;->D(I)J

    move-result-wide v5

    invoke-static {v13, v14, v5, v6}, Lp13;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_3a

    invoke-static/range {p2 .. p2}, Lrg3;->D(I)J

    move-result-wide v5

    invoke-static {v10, v11, v5, v6}, Lp13;->a(JJ)Z

    move-result v5

    if-nez v5, :cond_3b

    :cond_3a
    and-long v5, v13, v16

    cmp-long v5, v5, p5

    if-nez v5, :cond_3c

    :cond_3b
    :goto_24
    move-object/from16 p5, v8

    goto/16 :goto_27

    :cond_3c
    and-long v5, v10, v16

    cmp-long v5, v5, p5

    if-nez v5, :cond_3d

    goto :goto_24

    .line 176
    :cond_3d
    invoke-static {v13, v14}, Lp13;->b(J)J

    move-result-wide v5

    move-object/from16 p5, v8

    const-wide v7, 0x100000000L

    .line 177
    invoke-static {v5, v6, v7, v8}, Lq13;->a(JJ)Z

    move-result v16

    if-eqz v16, :cond_3e

    invoke-interface {v12, v13, v14}, Le70;->h0(J)F

    move-result v5

    const-wide v7, 0x200000000L

    goto :goto_25

    :cond_3e
    const-wide v7, 0x200000000L

    .line 178
    invoke-static {v5, v6, v7, v8}, Lq13;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_3f

    invoke-static {v13, v14}, Lp13;->c(J)F

    move-result v5

    mul-float/2addr v5, v3

    goto :goto_25

    :cond_3f
    move/from16 v5, p3

    .line 179
    :goto_25
    invoke-static {v10, v11}, Lp13;->b(J)J

    move-result-wide v13

    const-wide v7, 0x100000000L

    .line 180
    invoke-static {v13, v14, v7, v8}, Lq13;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_40

    invoke-interface {v12, v10, v11}, Le70;->h0(J)F

    move-result v3

    goto :goto_26

    :cond_40
    const-wide v7, 0x200000000L

    .line 181
    invoke-static {v13, v14, v7, v8}, Lq13;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_41

    invoke-static {v10, v11}, Lp13;->c(J)F

    move-result v6

    mul-float/2addr v3, v6

    goto :goto_26

    :cond_41
    move/from16 v3, p3

    .line 182
    :goto_26
    new-instance v6, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v7, v5

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-float v5, v7

    float-to-int v5, v5

    float-to-double v7, v3

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-float v3, v7

    float-to-int v3, v3

    invoke-direct {v6, v5, v3}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 183
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/16 v5, 0x21

    const/4 v10, 0x0

    .line 184
    invoke-interface {v9, v6, v10, v3, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_27

    :cond_42
    move-object v1, v6

    goto :goto_24

    .line 185
    :goto_27
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 186
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_28
    if-ge v7, v6, :cond_47

    .line 187
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 188
    check-cast v8, Lrd;

    .line 189
    iget-object v10, v8, Lrd;->a:Ljava/lang/Object;

    .line 190
    instance-of v11, v10, Llt2;

    if-eqz v11, :cond_46

    move-object v11, v10

    check-cast v11, Llt2;

    .line 191
    iget-object v13, v11, Llt2;->f:Lmx2;

    if-nez v13, :cond_44

    .line 192
    iget-object v13, v11, Llt2;->d:Lgm0;

    if-nez v13, :cond_44

    .line 193
    iget-object v11, v11, Llt2;->c:Lim0;

    if-eqz v11, :cond_43

    goto :goto_29

    :cond_43
    const/4 v11, 0x0

    goto :goto_2a

    :cond_44
    :goto_29
    move/from16 v11, p4

    :goto_2a
    if-nez v11, :cond_45

    .line 194
    check-cast v10, Llt2;

    .line 195
    iget-object v10, v10, Llt2;->e:Lhm0;

    if-eqz v10, :cond_46

    .line 196
    :cond_45
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_46
    add-int/lit8 v7, v7, 0x1

    goto :goto_28

    .line 197
    :cond_47
    iget-object v4, v4, Lm13;->a:Llt2;

    .line 198
    iget-object v6, v4, Llt2;->f:Lmx2;

    if-nez v6, :cond_49

    .line 199
    iget-object v7, v4, Llt2;->d:Lgm0;

    if-nez v7, :cond_49

    .line 200
    iget-object v7, v4, Llt2;->c:Lim0;

    if-eqz v7, :cond_48

    goto :goto_2b

    :cond_48
    const/4 v7, 0x0

    goto :goto_2c

    :cond_49
    :goto_2b
    move/from16 v7, p4

    :goto_2c
    if-nez v7, :cond_4b

    .line 201
    iget-object v7, v4, Llt2;->e:Lhm0;

    if-eqz v7, :cond_4a

    goto :goto_2d

    :cond_4a
    move-object/from16 v4, p1

    goto :goto_2e

    .line 202
    :cond_4b
    :goto_2d
    iget-object v7, v4, Llt2;->c:Lim0;

    .line 203
    iget-object v8, v4, Llt2;->d:Lgm0;

    .line 204
    iget-object v4, v4, Llt2;->e:Lhm0;

    .line 205
    new-instance v19, Llt2;

    const/16 v37, 0x0

    const v38, 0xffc3

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    move-object/from16 v26, v4

    move-object/from16 v27, v6

    move-object/from16 v24, v7

    move-object/from16 v25, v8

    invoke-direct/range {v19 .. v38}, Llt2;-><init>(JJLim0;Lgm0;Lhm0;Lmx2;Ljava/lang/String;JLxj;Lm03;Lkc1;JLgz2;Lbq2;I)V

    move-object/from16 v4, v19

    .line 206
    :goto_2e
    new-instance v6, Lx;

    const/16 v7, 0xc

    move-object/from16 v8, p5

    invoke-direct {v6, v7, v9, v8}, Lx;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 207
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    move/from16 v8, p4

    if-gt v7, v8, :cond_4e

    .line 208
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_4d

    const/4 v10, 0x0

    .line 209
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lrd;

    .line 210
    iget-object v7, v7, Lrd;->a:Ljava/lang/Object;

    .line 211
    check-cast v7, Llt2;

    if-nez v4, :cond_4c

    goto :goto_2f

    .line 212
    :cond_4c
    invoke-virtual {v4, v7}, Llt2;->c(Llt2;)Llt2;

    move-result-object v7

    .line 213
    :goto_2f
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrd;

    .line 214
    iget v4, v4, Lrd;->b:I

    .line 215
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 216
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrd;

    .line 217
    iget v3, v3, Lrd;->c:I

    .line 218
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 219
    invoke-virtual {v6, v7, v4, v3}, Lx;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4d
    move-object/from16 p5, v1

    goto/16 :goto_35

    .line 220
    :cond_4e
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    mul-int/lit8 v8, v7, 0x2

    .line 221
    new-array v10, v8, [I

    .line 222
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v13, 0x0

    :goto_30
    if-ge v13, v11, :cond_4f

    .line 223
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 224
    check-cast v14, Lrd;

    .line 225
    iget v5, v14, Lrd;->b:I

    .line 226
    aput v5, v10, v13

    add-int v5, v13, v7

    .line 227
    iget v14, v14, Lrd;->c:I

    .line 228
    aput v14, v10, v5

    add-int/lit8 v13, v13, 0x1

    goto :goto_30

    :cond_4f
    const/4 v5, 0x1

    if-le v8, v5, :cond_50

    .line 229
    invoke-static {v10}, Ljava/util/Arrays;->sort([I)V

    :cond_50
    if-eqz v8, :cond_74

    const/4 v7, 0x0

    .line 230
    aget v5, v10, v7

    move v7, v5

    const/4 v5, 0x0

    :goto_31
    if-ge v5, v8, :cond_4d

    .line 231
    aget v11, v10, v5

    if-ne v11, v7, :cond_51

    move-object/from16 p5, v1

    move-object/from16 v17, v3

    move-object/from16 v16, v4

    move/from16 v18, v5

    goto :goto_34

    .line 232
    :cond_51
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v13

    move-object/from16 p5, v1

    move-object v1, v4

    const/4 v14, 0x0

    :goto_32
    if-ge v14, v13, :cond_54

    .line 233
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v3

    .line 234
    move-object/from16 v3, v16

    check-cast v3, Lrd;

    move-object/from16 v16, v4

    .line 235
    iget v4, v3, Lrd;->b:I

    move/from16 v18, v5

    .line 236
    iget v5, v3, Lrd;->c:I

    if-eq v4, v5, :cond_53

    .line 237
    invoke-static {v7, v11, v4, v5}, Ltd;->b(IIII)Z

    move-result v4

    if-eqz v4, :cond_53

    .line 238
    iget-object v3, v3, Lrd;->a:Ljava/lang/Object;

    .line 239
    check-cast v3, Llt2;

    if-nez v1, :cond_52

    move-object v1, v3

    goto :goto_33

    .line 240
    :cond_52
    invoke-virtual {v1, v3}, Llt2;->c(Llt2;)Llt2;

    move-result-object v1

    :cond_53
    :goto_33
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v4, v16

    move-object/from16 v3, v17

    move/from16 v5, v18

    goto :goto_32

    :cond_54
    move-object/from16 v17, v3

    move-object/from16 v16, v4

    move/from16 v18, v5

    if-eqz v1, :cond_55

    .line 241
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v1, v3, v4}, Lx;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_55
    move v7, v11

    :goto_34
    add-int/lit8 v5, v18, 0x1

    move-object/from16 v1, p5

    move-object/from16 v4, v16

    move-object/from16 v3, v17

    goto :goto_31

    .line 242
    :goto_35
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_36
    if-ge v3, v1, :cond_66

    .line 243
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lrd;

    .line 244
    iget-object v6, v5, Lrd;->a:Ljava/lang/Object;

    .line 245
    instance-of v7, v6, Llt2;

    if-eqz v7, :cond_56

    .line 246
    iget v13, v5, Lrd;->b:I

    .line 247
    iget v14, v5, Lrd;->c:I

    if-ltz v13, :cond_56

    .line 248
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v13, v5, :cond_56

    if-le v14, v13, :cond_56

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-le v14, v5, :cond_57

    :cond_56
    move/from16 v16, v1

    move/from16 v17, v3

    move/from16 v18, v4

    move-object v1, v12

    goto/16 :goto_40

    .line 249
    :cond_57
    check-cast v6, Llt2;

    iget-wide v7, v6, Llt2;->h:J

    .line 250
    iget-object v5, v6, Llt2;->i:Lxj;

    iget-object v10, v6, Llt2;->a:Ll03;

    if-eqz v5, :cond_58

    .line 251
    iget v5, v5, Lxj;->a:F

    .line 252
    new-instance v11, Lyj;

    move/from16 v16, v1

    const/4 v1, 0x0

    invoke-direct {v11, v5, v1}, Lyj;-><init>(FI)V

    const/16 v5, 0x21

    .line 253
    invoke-interface {v9, v11, v13, v14, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_37
    move-object/from16 p6, v6

    goto :goto_38

    :cond_58
    move/from16 v16, v1

    goto :goto_37

    .line 254
    :goto_38
    invoke-interface {v10}, Ll03;->b()J

    move-result-wide v5

    .line 255
    invoke-static {v9, v5, v6, v13, v14}, Leu;->W(Landroid/text/Spannable;JII)V

    .line 256
    invoke-interface {v10}, Ll03;->k()Lan;

    move-result-object v5

    .line 257
    invoke-interface {v10}, Ll03;->a()F

    move-result v6

    if-eqz v5, :cond_59

    .line 258
    instance-of v10, v5, Lft2;

    if-eqz v10, :cond_5a

    .line 259
    check-cast v5, Lft2;

    .line 260
    iget-wide v5, v5, Lft2;->a:J

    .line 261
    invoke-static {v9, v5, v6, v13, v14}, Leu;->W(Landroid/text/Spannable;JII)V

    :cond_59
    :goto_39
    move-object/from16 v6, p6

    goto :goto_3a

    .line 262
    :cond_5a
    new-instance v10, Laq2;

    check-cast v5, Lzp2;

    invoke-direct {v10, v5, v6}, Laq2;-><init>(Lzp2;F)V

    const/16 v5, 0x21

    .line 263
    invoke-interface {v9, v10, v13, v14, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_39

    .line 264
    :goto_3a
    iget-object v1, v6, Llt2;->m:Lgz2;

    if-eqz v1, :cond_5d

    .line 265
    iget v1, v1, Lgz2;->a:I

    .line 266
    new-instance v10, Lhz2;

    or-int/lit8 v11, v1, 0x1

    if-ne v11, v1, :cond_5b

    const/4 v11, 0x1

    goto :goto_3b

    :cond_5b
    const/4 v11, 0x0

    :goto_3b
    or-int/lit8 v5, v1, 0x2

    if-ne v5, v1, :cond_5c

    const/4 v1, 0x1

    goto :goto_3c

    :cond_5c
    const/4 v1, 0x0

    :goto_3c
    invoke-direct {v10, v11, v1}, Lhz2;-><init>(ZZ)V

    const/16 v5, 0x21

    .line 267
    invoke-interface {v9, v10, v13, v14, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_3d

    :cond_5d
    const/16 v5, 0x21

    .line 268
    :goto_3d
    iget-wide v10, v6, Llt2;->b:J

    .line 269
    invoke-static/range {v9 .. v14}, Leu;->X(Landroid/text/Spannable;JLe70;II)V

    .line 270
    iget-object v1, v6, Llt2;->g:Ljava/lang/String;

    if-eqz v1, :cond_5e

    .line 271
    new-instance v10, Lam0;

    const/4 v11, 0x0

    invoke-direct {v10, v11, v1}, Lam0;-><init>(ILjava/lang/Object;)V

    .line 272
    invoke-interface {v9, v10, v13, v14, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 273
    :cond_5e
    iget-object v1, v6, Llt2;->j:Lm03;

    if-eqz v1, :cond_5f

    .line 274
    new-instance v10, Landroid/text/style/ScaleXSpan;

    .line 275
    iget v11, v1, Lm03;->a:F

    .line 276
    invoke-direct {v10, v11}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 277
    invoke-interface {v9, v10, v13, v14, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 278
    new-instance v10, Lyj;

    .line 279
    iget v1, v1, Lm03;->b:F

    const/4 v11, 0x1

    .line 280
    invoke-direct {v10, v1, v11}, Lyj;-><init>(FI)V

    .line 281
    invoke-interface {v9, v10, v13, v14, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_3e

    :cond_5f
    const/4 v11, 0x1

    .line 282
    :goto_3e
    iget-object v1, v6, Llt2;->k:Lkc1;

    .line 283
    invoke-static {v9, v1, v13, v14}, Leu;->Y(Landroid/text/Spannable;Lkc1;II)V

    move-object v1, v12

    .line 284
    iget-wide v11, v6, Llt2;->l:J

    const-wide/16 v17, 0x10

    cmp-long v10, v11, v17

    if-eqz v10, :cond_60

    .line 285
    new-instance v10, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v11, v12}, Lsp0;->j0(J)I

    move-result v11

    invoke-direct {v10, v11}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 286
    invoke-interface {v9, v10, v13, v14, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 287
    :cond_60
    iget-object v10, v6, Llt2;->n:Lbq2;

    if-eqz v10, :cond_62

    .line 288
    iget-wide v11, v10, Lbq2;->b:J

    .line 289
    new-instance v5, Ldq2;

    move/from16 v17, v3

    move/from16 v18, v4

    .line 290
    iget-wide v3, v10, Lbq2;->a:J

    .line 291
    invoke-static {v3, v4}, Lsp0;->j0(J)I

    move-result v3

    const/16 v4, 0x20

    move-wide/from16 v19, v7

    shr-long v7, v11, v4

    long-to-int v4, v7

    .line 292
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    const-wide v7, 0xffffffffL

    and-long/2addr v7, v11

    long-to-int v7, v7

    .line 293
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    .line 294
    iget v8, v10, Lbq2;->c:F

    cmpg-float v10, v8, p3

    if-nez v10, :cond_61

    const/4 v8, 0x1

    .line 295
    :cond_61
    invoke-direct {v5, v3, v4, v7, v8}, Ldq2;-><init>(IFFF)V

    const/16 v7, 0x21

    .line 296
    invoke-interface {v9, v5, v13, v14, v7}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_3f

    :cond_62
    move/from16 v17, v3

    move/from16 v18, v4

    move-wide/from16 v19, v7

    move v7, v5

    .line 297
    :goto_3f
    iget-object v3, v6, Llt2;->o:Lop0;

    if-eqz v3, :cond_63

    .line 298
    new-instance v4, Loc0;

    invoke-direct {v4, v3}, Loc0;-><init>(Lop0;)V

    .line 299
    invoke-interface {v9, v4, v13, v14, v7}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 300
    :cond_63
    invoke-static/range {v19 .. v20}, Lp13;->b(J)J

    move-result-wide v3

    const-wide v7, 0x100000000L

    invoke-static {v3, v4, v7, v8}, Lq13;->a(JJ)Z

    move-result v3

    if-nez v3, :cond_64

    invoke-static/range {v19 .. v20}, Lp13;->b(J)J

    move-result-wide v3

    const-wide v7, 0x200000000L

    invoke-static {v3, v4, v7, v8}, Lq13;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_65

    :cond_64
    const/4 v4, 0x1

    goto :goto_41

    :cond_65
    :goto_40
    move/from16 v4, v18

    :goto_41
    add-int/lit8 v3, v17, 0x1

    move-object v12, v1

    move/from16 v1, v16

    goto/16 :goto_36

    :cond_66
    move/from16 v18, v4

    move-object v1, v12

    if-eqz v18, :cond_6c

    .line 301
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_42
    if-ge v4, v3, :cond_6c

    .line 302
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lrd;

    .line 303
    iget-object v6, v5, Lrd;->a:Ljava/lang/Object;

    .line 304
    check-cast v6, Lod;

    .line 305
    instance-of v7, v6, Llt2;

    if-eqz v7, :cond_67

    .line 306
    iget v7, v5, Lrd;->b:I

    .line 307
    iget v5, v5, Lrd;->c:I

    if-ltz v7, :cond_67

    .line 308
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-ge v7, v8, :cond_67

    if-le v5, v7, :cond_67

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-le v5, v8, :cond_68

    :cond_67
    move/from16 p3, v3

    move v6, v4

    const/16 v4, 0x21

    goto :goto_44

    .line 309
    :cond_68
    check-cast v6, Llt2;

    .line 310
    iget-wide v10, v6, Llt2;->h:J

    .line 311
    invoke-static {v10, v11}, Lp13;->b(J)J

    move-result-wide v12

    move/from16 p3, v3

    move v6, v4

    const-wide v3, 0x100000000L

    .line 312
    invoke-static {v12, v13, v3, v4}, Lq13;->a(JJ)Z

    move-result v8

    if-eqz v8, :cond_69

    new-instance v3, Lw91;

    invoke-interface {v1, v10, v11}, Le70;->h0(J)F

    move-result v4

    invoke-direct {v3, v4}, Lw91;-><init>(F)V

    goto :goto_43

    :cond_69
    const-wide v3, 0x200000000L

    .line 313
    invoke-static {v12, v13, v3, v4}, Lq13;->a(JJ)Z

    move-result v8

    if-eqz v8, :cond_6a

    .line 314
    new-instance v3, Lv91;

    invoke-static {v10, v11}, Lp13;->c(J)F

    move-result v4

    invoke-direct {v3, v4}, Lv91;-><init>(F)V

    goto :goto_43

    :cond_6a
    move-object/from16 v3, p1

    :goto_43
    const/16 v4, 0x21

    if-eqz v3, :cond_6b

    .line 315
    invoke-interface {v9, v3, v7, v5, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_6b
    :goto_44
    add-int/lit8 v3, v6, 0x1

    move v4, v3

    move/from16 v3, p3

    goto :goto_42

    .line 316
    :cond_6c
    iget-object v3, v15, Lvw1;->d:Ln03;

    if-eqz v3, :cond_6e

    .line 317
    iget-wide v3, v3, Ln03;->a:J

    .line 318
    invoke-static {v3, v4}, Lp13;->b(J)J

    move-result-wide v5

    const-wide v7, 0x100000000L

    .line 319
    invoke-static {v5, v6, v7, v8}, Lq13;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_6d

    invoke-interface {v1, v3, v4}, Le70;->h0(J)F

    goto :goto_45

    :cond_6d
    const-wide v7, 0x200000000L

    .line 320
    invoke-static {v5, v6, v7, v8}, Lq13;->a(JJ)Z

    move-result v1

    if-eqz v1, :cond_6e

    invoke-static {v3, v4}, Lp13;->c(J)F

    .line 321
    :cond_6e
    :goto_45
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_46
    if-ge v3, v1, :cond_6f

    .line 322
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 323
    check-cast v4, Lrd;

    .line 324
    iget-object v4, v4, Lrd;->a:Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_46

    .line 325
    :cond_6f
    invoke-interface/range {p5 .. p5}, Ljava/util/Collection;->size()I

    move-result v1

    if-lez v1, :cond_73

    move-object/from16 v1, p5

    const/4 v10, 0x0

    .line 326
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 327
    check-cast v0, Lrd;

    .line 328
    iget-object v1, v0, Lrd;->a:Ljava/lang/Object;

    if-nez v1, :cond_72

    .line 329
    iget v1, v0, Lrd;->b:I

    .line 330
    iget v0, v0, Lrd;->c:I

    .line 331
    const-class v2, Lvd0;

    invoke-interface {v9, v1, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    .line 332
    array-length v1, v0

    move v13, v10

    :goto_47
    if-ge v13, v1, :cond_71

    aget-object v2, v0, v13

    if-nez v2, :cond_70

    move-object/from16 v2, p1

    .line 333
    invoke-interface {v9, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_47

    :cond_70
    move-object/from16 v2, p1

    .line 334
    invoke-static {}, Lc80;->g()V

    throw v2

    :cond_71
    move-object/from16 v2, p1

    .line 335
    new-instance v0, Lvz1;

    .line 336
    throw v2

    :cond_72
    move-object/from16 v2, p1

    .line 337
    invoke-static {}, Lc80;->g()V

    throw v2

    :cond_73
    move-object v1, v9

    .line 338
    :goto_48
    iput-object v1, v0, Lx9;->h:Ljava/lang/CharSequence;

    .line 339
    new-instance v2, Lg61;

    iget-object v3, v0, Lx9;->g:Lqb;

    iget v4, v0, Lx9;->k:I

    invoke-direct {v2, v1, v3, v4}, Lg61;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object v2, v0, Lx9;->i:Lg61;

    return-void

    :cond_74
    move-object/from16 v2, p1

    .line 340
    const-string v0, "Array is empty."

    invoke-static {v0}, Lum2;->i(Ljava/lang/String;)V

    throw v2

    :cond_75
    const/4 v2, 0x0

    .line 341
    const-string v0, "Invalid TextDirection."

    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    throw v2
.end method


# virtual methods
.method public final a()F
    .locals 10

    .line 1
    iget-object p0, p0, Lx9;->i:Lg61;

    .line 2
    .line 3
    iget v0, p0, Lg61;->e:F

    .line 4
    .line 5
    iget-object v1, p0, Lg61;->b:Landroid/text/TextPaint;

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
    iget p0, p0, Lg61;->e:F

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
    new-instance v2, Luq;

    .line 25
    .line 26
    iget-object v3, p0, Lg61;->a:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {v2, v3, v4}, Luq;-><init>(Ljava/lang/CharSequence;I)V

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
    sget-object v3, Lgf1;->c:Lqa;

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
    new-instance v6, Lc11;

    .line 63
    .line 64
    invoke-direct {v6, v5, v3, v7}, La11;-><init>(III)V

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
    check-cast v6, Lc11;

    .line 76
    .line 77
    if-eqz v6, :cond_2

    .line 78
    .line 79
    iget v8, v6, La11;->i:I

    .line 80
    .line 81
    iget v6, v6, La11;->h:I

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
    new-instance v6, Lc11;

    .line 92
    .line 93
    invoke-direct {v6, v5, v3, v7}, La11;-><init>(III)V

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
    const/4 v3, 0x0

    .line 112
    if-eqz v0, :cond_4

    .line 113
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
    check-cast v2, Lc11;

    .line 130
    .line 131
    iget v3, v2, La11;->h:I

    .line 132
    .line 133
    iget v2, v2, La11;->i:I

    .line 134
    .line 135
    invoke-virtual {p0}, Lg61;->b()Ljava/lang/CharSequence;

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
    move v3, v2

    .line 144
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_5

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, Lc11;

    .line 155
    .line 156
    iget v4, v2, La11;->h:I

    .line 157
    .line 158
    iget v2, v2, La11;->i:I

    .line 159
    .line 160
    invoke-virtual {p0}, Lg61;->b()Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-static {v5, v4, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    goto :goto_2

    .line 173
    :cond_5
    :goto_3
    iput v3, p0, Lg61;->e:F

    .line 174
    .line 175
    return v3

    .line 176
    :cond_6
    invoke-static {}, Lum2;->b()V

    .line 177
    .line 178
    .line 179
    return v3
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lx9;->j:Lvu2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lvu2;->a()Z

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
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object p0, p0, Lx9;->b:Lm13;

    .line 15
    .line 16
    invoke-static {p0}, Lqp0;->i(Lm13;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    sget p0, Lsp0;->f:I

    .line 23
    .line 24
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    return v1

    .line 34
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public final c()F
    .locals 0

    .line 1
    iget-object p0, p0, Lx9;->i:Lg61;

    .line 2
    .line 3
    invoke-virtual {p0}, Lg61;->c()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
