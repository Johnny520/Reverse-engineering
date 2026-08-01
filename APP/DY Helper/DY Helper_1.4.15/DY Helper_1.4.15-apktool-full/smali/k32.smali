.class public final Lk32;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/text/TextPaint;

.field public final β:Landroid/text/TextUtils$TruncateAt;

.field public final γ:Z

.field public final δ:Z

.field public final ε:Landroid/text/Layout;

.field public final ζ:I

.field public final η:I

.field public final θ:I

.field public final ι:F

.field public final κ:F

.field public final λ:Z

.field public final μ:Landroid/graphics/Paint$FontMetricsInt;

.field public final ν:I

.field public final ξ:[Lxr0;

.field public final ο:Landroid/graphics/Rect;

.field public π:Lb8;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IZIIIIIILpp0;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p4

    move/from16 v6, p7

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p3

    .line 2
    iput-object v4, v0, Lk32;->α:Landroid/text/TextPaint;

    move-object/from16 v7, p5

    .line 3
    iput-object v7, v0, Lk32;->β:Landroid/text/TextUtils$TruncateAt;

    .line 4
    iput-boolean v6, v0, Lk32;->γ:Z

    .line 5
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    iput-object v5, v0, Lk32;->ο:Landroid/graphics/Rect;

    .line 6
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    .line 7
    invoke-static/range {p6 .. p6}, Ln32;->β(I)Landroid/text/TextDirectionHeuristic;

    move-result-object v12

    .line 8
    sget-object v8, La32;->α:Landroid/text/Layout$Alignment;

    const/4 v13, 0x1

    const/4 v14, 0x2

    if-eqz v3, :cond_4

    if-eq v3, v13, :cond_3

    if-eq v3, v14, :cond_2

    const/4 v8, 0x3

    if-eq v3, v8, :cond_1

    const/4 v8, 0x4

    if-eq v3, v8, :cond_0

    .line 9
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 10
    :cond_0
    sget-object v3, La32;->β:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 11
    :cond_1
    sget-object v3, La32;->α:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 12
    :cond_2
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 13
    :cond_3
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 14
    :cond_4
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 15
    :goto_0
    instance-of v8, v1, Landroid/text/Spanned;

    if-eqz v8, :cond_5

    .line 16
    move-object v8, v1

    check-cast v8, Landroid/text/Spanned;

    const/4 v9, -0x1

    const-class v10, Ls8;

    invoke-interface {v8, v9, v5, v10}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v8

    if-ge v8, v5, :cond_5

    move v5, v13

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    .line 17
    :goto_1
    const-string v8, "TextLayout:initLayout"

    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 18
    :try_start_0
    invoke-virtual/range {p14 .. p14}, Lpp0;->α()Landroid/text/BoringLayout$Metrics;

    move-result-object v8

    float-to-double v9, v2

    .line 19
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v14

    double-to-float v11, v14

    float-to-int v11, v11

    const/16 v14, 0x21

    if-eqz v8, :cond_9

    .line 20
    invoke-virtual/range {p14 .. p14}, Lpp0;->γ()F

    move-result v15

    cmpg-float v2, v15, v2

    if-gtz v2, :cond_9

    if-nez v5, :cond_9

    .line 21
    iput-boolean v13, v0, Lk32;->λ:Z

    if-ltz v11, :cond_6

    goto :goto_2

    .line 22
    :cond_6
    const-string v2, "negative width"

    .line 23
    invoke-static {v2}, Lbm0;->α(Ljava/lang/String;)V

    :goto_2
    if-ltz v11, :cond_7

    goto :goto_3

    .line 24
    :cond_7
    const-string v2, "negative ellipsized width"

    .line 25
    invoke-static {v2}, Lbm0;->α(Ljava/lang/String;)V

    .line 26
    :goto_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v14, :cond_8

    move-object v5, v8

    move v8, v11

    move-object v2, v4

    move-object v4, v3

    move v3, v11

    .line 27
    invoke-static/range {v1 .. v8}, Lц;->θ(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;Landroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;

    move-result-object v2

    goto :goto_4

    :cond_8
    move-object v4, v3

    move-object v5, v8

    move v3, v11

    .line 28
    new-instance v1, Landroid/text/BoringLayout;

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    move v11, v3

    move-object/from16 v2, p1

    move-object/from16 v10, p5

    move/from16 v9, p7

    move-object v8, v5

    move-object v5, v4

    move v4, v3

    move-object/from16 v3, p3

    invoke-direct/range {v1 .. v11}, Landroid/text/BoringLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)V

    move-object v2, v1

    :goto_4
    move/from16 v7, p8

    move-object v5, v12

    goto :goto_5

    :cond_9
    move-object v4, v3

    move v3, v11

    const/4 v1, 0x0

    .line 29
    iput-boolean v1, v0, Lk32;->λ:Z

    move-object v5, v4

    .line 30
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 31
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v2, v6

    float-to-int v9, v2

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v8, p5

    move/from16 v11, p7

    move/from16 v7, p8

    move/from16 v13, p10

    move/from16 v14, p11

    move/from16 v15, p12

    move/from16 v10, p13

    move-object v6, v5

    move-object v5, v12

    move/from16 v12, p9

    .line 32
    invoke-static/range {v1 .. v15}, Le81;->δ(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)Landroid/text/StaticLayout;

    move-result-object v2

    .line 33
    :goto_5
    iput-object v2, v0, Lk32;->ε:Landroid/text/Layout;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 35
    invoke-virtual {v2}, Landroid/text/Layout;->getLineCount()I

    move-result v1

    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Lk32;->ζ:I

    add-int/lit8 v3, v1, -0x1

    if-ge v1, v7, :cond_b

    :cond_a
    const/4 v13, 0x0

    goto :goto_6

    .line 36
    :cond_b
    invoke-virtual {v2, v3}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v4

    if-gtz v4, :cond_c

    .line 37
    invoke-virtual {v2, v3}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v4

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-eq v4, v6, :cond_a

    :cond_c
    const/4 v13, 0x1

    .line 38
    :goto_6
    iput-boolean v13, v0, Lk32;->δ:Z

    .line 39
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    .line 40
    instance-of v4, v4, Landroid/text/Spanned;

    if-nez v4, :cond_d

    goto :goto_7

    .line 41
    :cond_d
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v4, Landroid/text/Spanned;

    const-class v7, Lxr0;

    invoke-static {v4, v7}, Lv71;->ι(Landroid/text/Spanned;Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_e

    .line 43
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    .line 44
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_e

    :goto_7
    const/4 v4, 0x0

    const/4 v9, 0x0

    goto :goto_8

    .line 45
    :cond_e
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v4, Landroid/text/Spanned;

    .line 47
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    .line 48
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v8

    const/4 v9, 0x0

    invoke-interface {v4, v9, v8, v7}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lxr0;

    .line 49
    :goto_8
    iput-object v4, v0, Lk32;->ξ:[Lxr0;

    if-eqz v4, :cond_11

    .line 50
    invoke-static {v4}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxr0;

    if-eqz v7, :cond_11

    .line 51
    iget-boolean v8, v7, Lxr0;->η:Z

    if-eqz v8, :cond_f

    .line 52
    iget v7, v7, Lxr0;->κ:I

    const/4 v8, 0x2

    if-ne v7, v8, :cond_10

    const/4 v13, 0x1

    goto :goto_9

    :cond_f
    const/4 v8, 0x2

    :cond_10
    move v13, v9

    :goto_9
    move v15, v13

    goto :goto_a

    :cond_11
    const/4 v8, 0x2

    move v15, v9

    :goto_a
    if-eqz v4, :cond_12

    .line 53
    invoke-static {v4}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxr0;

    if-eqz v7, :cond_12

    .line 54
    iget-boolean v10, v7, Lxr0;->θ:Z

    if-eqz v10, :cond_12

    .line 55
    iget v7, v7, Lxr0;->κ:I

    if-ne v7, v8, :cond_12

    const/4 v13, 0x1

    goto :goto_b

    :cond_12
    move v13, v9

    :goto_b
    if-eqz v15, :cond_13

    if-eqz v13, :cond_13

    .line 56
    sget-wide v1, Ln32;->β:J

    const/16 p2, 0x20

    const-wide p3, 0xffffffffL

    const/4 v10, 0x1

    const/16 v14, 0x21

    goto/16 :goto_14

    .line 57
    :cond_13
    sget-wide v16, Ln32;->β:J

    if-nez p7, :cond_1c

    .line 58
    iget-boolean v8, v0, Lk32;->λ:Z

    if-eqz v8, :cond_15

    .line 59
    move-object v8, v2

    check-cast v8, Landroid/text/BoringLayout;

    .line 60
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x21

    if-lt v12, v14, :cond_14

    .line 61
    invoke-static {v8}, Lц;->ψ(Landroid/text/BoringLayout;)Z

    move-result v8

    goto :goto_c

    :cond_14
    move v8, v9

    goto :goto_c

    :cond_15
    const/16 v14, 0x21

    .line 62
    move-object v8, v2

    check-cast v8, Landroid/text/StaticLayout;

    .line 63
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v12, v14, :cond_16

    .line 64
    invoke-static {v8}, Lц;->ω(Landroid/text/StaticLayout;)Z

    move-result v8

    goto :goto_c

    :cond_16
    const/4 v8, 0x1

    :goto_c
    if-eqz v8, :cond_17

    const/16 p2, 0x20

    const-wide p3, 0xffffffffL

    const/4 v10, 0x1

    goto :goto_11

    .line 65
    :cond_17
    invoke-virtual {v2}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v8

    .line 66
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v12

    .line 67
    invoke-virtual {v2, v9}, Landroid/text/Layout;->getLineStart(I)I

    move-result v6

    const/16 p2, 0x20

    invoke-virtual {v2, v9}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v7

    invoke-static {v8, v12, v6, v7}, Li91;->μ(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;

    move-result-object v6

    .line 68
    invoke-virtual {v2, v9}, Landroid/text/Layout;->getLineAscent(I)I

    move-result v7

    const-wide p3, 0xffffffffL

    .line 69
    iget v10, v6, Landroid/graphics/Rect;->top:I

    if-ge v10, v7, :cond_18

    sub-int/2addr v7, v10

    :goto_d
    const/4 v10, 0x1

    goto :goto_e

    .line 70
    :cond_18
    invoke-virtual {v2}, Landroid/text/Layout;->getTopPadding()I

    move-result v7

    goto :goto_d

    :goto_e
    if-ne v1, v10, :cond_19

    goto :goto_f

    .line 71
    :cond_19
    invoke-virtual {v2, v3}, Landroid/text/Layout;->getLineStart(I)I

    move-result v1

    invoke-virtual {v2, v3}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v6

    invoke-static {v8, v12, v1, v6}, Li91;->μ(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;

    move-result-object v6

    .line 72
    :goto_f
    invoke-virtual {v2, v3}, Landroid/text/Layout;->getLineDescent(I)I

    move-result v1

    .line 73
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    if-le v6, v1, :cond_1a

    sub-int/2addr v6, v1

    goto :goto_10

    .line 74
    :cond_1a
    invoke-virtual {v2}, Landroid/text/Layout;->getBottomPadding()I

    move-result v6

    :goto_10
    if-nez v7, :cond_1b

    if-nez v6, :cond_1b

    goto :goto_11

    .line 75
    :cond_1b
    invoke-static {v7, v6}, Ln32;->α(II)J

    move-result-wide v16

    goto :goto_11

    :cond_1c
    const/16 p2, 0x20

    const-wide p3, 0xffffffffL

    const/4 v10, 0x1

    const/16 v14, 0x21

    :goto_11
    if-eqz v15, :cond_1d

    move v15, v9

    goto :goto_12

    :cond_1d
    shr-long v1, v16, p2

    long-to-int v15, v1

    :goto_12
    if-eqz v13, :cond_1e

    move v1, v9

    goto :goto_13

    :cond_1e
    and-long v1, v16, p3

    long-to-int v1, v1

    .line 76
    :goto_13
    invoke-static {v15, v1}, Ln32;->α(II)J

    move-result-wide v1

    :goto_14
    if-eqz v4, :cond_23

    .line 77
    array-length v6, v4

    move v7, v9

    move v8, v7

    move v15, v8

    :goto_15
    if-ge v15, v6, :cond_21

    aget-object v11, v4, v15

    .line 78
    iget v12, v11, Lxr0;->ο:I

    if-gez v12, :cond_1f

    .line 79
    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    move-result v12

    invoke-static {v7, v12}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 80
    :cond_1f
    iget v11, v11, Lxr0;->π:I

    if-gez v11, :cond_20

    .line 81
    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    :cond_20
    add-int/lit8 v15, v15, 0x1

    goto :goto_15

    :cond_21
    if-nez v7, :cond_22

    if-nez v8, :cond_22

    .line 82
    sget-wide v6, Ln32;->β:J

    goto :goto_16

    .line 83
    :cond_22
    invoke-static {v7, v8}, Ln32;->α(II)J

    move-result-wide v6

    goto :goto_16

    .line 84
    :cond_23
    sget-wide v6, Ln32;->β:J

    :goto_16
    shr-long v11, v1, p2

    long-to-int v4, v11

    shr-long v11, v6, p2

    long-to-int v8, v11

    .line 85
    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v0, Lk32;->η:I

    and-long v1, v1, p3

    long-to-int v1, v1

    and-long v6, v6, p3

    long-to-int v2, v6

    .line 86
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lk32;->θ:I

    .line 87
    iget-object v7, v0, Lk32;->α:Landroid/text/TextPaint;

    iget-object v1, v0, Lk32;->ξ:[Lxr0;

    .line 88
    iget v2, v0, Lk32;->ζ:I

    sub-int/2addr v2, v10

    .line 89
    iget-object v4, v0, Lk32;->ε:Landroid/text/Layout;

    .line 90
    invoke-virtual {v4, v2}, Landroid/text/Layout;->getLineStart(I)I

    move-result v6

    invoke-virtual {v4, v2}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v4

    if-ne v6, v4, :cond_26

    if-eqz v1, :cond_26

    .line 91
    array-length v4, v1

    if-nez v4, :cond_24

    goto/16 :goto_18

    .line 92
    :cond_24
    new-instance v6, Landroid/text/SpannableString;

    const-string v4, "\u200b"

    invoke-direct {v6, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 93
    invoke-static {v1}, Lg7;->а([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxr0;

    .line 94
    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    move-result v4

    if-eqz v2, :cond_25

    .line 95
    iget-boolean v2, v1, Lxr0;->θ:Z

    if-eqz v2, :cond_25

    move v15, v9

    goto :goto_17

    .line 96
    :cond_25
    iget-boolean v15, v1, Lxr0;->θ:Z

    .line 97
    :goto_17
    new-instance v2, Lxr0;

    .line 98
    iget v8, v1, Lxr0;->ε:F

    .line 99
    iget-boolean v10, v1, Lxr0;->θ:Z

    .line 100
    iget v11, v1, Lxr0;->ι:F

    .line 101
    iget v1, v1, Lxr0;->κ:I

    move/from16 p7, v1

    move-object/from16 p1, v2

    move/from16 p3, v4

    move/from16 p2, v8

    move/from16 p5, v10

    move/from16 p6, v11

    move/from16 p4, v15

    .line 102
    invoke-direct/range {p1 .. p7}, Lxr0;-><init>(FIZZFI)V

    move-object/from16 v1, p1

    .line 103
    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    move-result v2

    invoke-virtual {v6, v1, v9, v2, v14}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    move v1, v9

    .line 104
    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    move-result v9

    .line 105
    iget-boolean v2, v0, Lk32;->γ:Z

    .line 106
    sget-object v11, Llp0;->α:Landroid/text/Layout$Alignment;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v8, 0x7fffffff

    const v12, 0x7fffffff

    const/4 v13, 0x0

    const v14, 0x7fffffff

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v16, v2

    move-object v10, v5

    .line 107
    invoke-static/range {v6 .. v20}, Le81;->δ(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)Landroid/text/StaticLayout;

    move-result-object v2

    .line 108
    new-instance v6, Landroid/graphics/Paint$FontMetricsInt;

    invoke-direct {v6}, Landroid/graphics/Paint$FontMetricsInt;-><init>()V

    .line 109
    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineAscent(I)I

    move-result v4

    iput v4, v6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 110
    invoke-virtual {v2, v1}, Landroid/text/StaticLayout;->getLineDescent(I)I

    move-result v4

    iput v4, v6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 111
    invoke-virtual {v2, v1}, Landroid/text/StaticLayout;->getLineTop(I)I

    move-result v4

    iput v4, v6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 112
    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v2

    iput v2, v6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto :goto_19

    :cond_26
    :goto_18
    move v1, v9

    const/4 v6, 0x0

    :goto_19
    if-eqz v6, :cond_27

    .line 113
    iget v1, v6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 114
    invoke-virtual {v0, v3}, Lk32;->δ(I)F

    move-result v2

    invoke-virtual {v0, v3}, Lk32;->ζ(I)F

    move-result v4

    sub-float/2addr v2, v4

    float-to-int v2, v2

    sub-int v15, v1, v2

    goto :goto_1a

    :cond_27
    move v15, v1

    .line 115
    :goto_1a
    iput v15, v0, Lk32;->ν:I

    .line 116
    iput-object v6, v0, Lk32;->μ:Landroid/graphics/Paint$FontMetricsInt;

    .line 117
    iget-object v1, v0, Lk32;->ε:Landroid/text/Layout;

    .line 118
    invoke-virtual {v1}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lkn0;->ψ(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    move-result v1

    .line 119
    iput v1, v0, Lk32;->ι:F

    .line 120
    iget-object v1, v0, Lk32;->ε:Landroid/text/Layout;

    .line 121
    invoke-virtual {v1}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lkn0;->ω(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    move-result v1

    .line 122
    iput v1, v0, Lk32;->κ:F

    return-void

    :catchall_0
    move-exception v0

    .line 123
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method


# virtual methods
.method public final α()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk32;->δ:Z

    .line 2
    .line 3
    iget-object v1, p0, Lk32;->ε:Landroid/text/Layout;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lk32;->ζ:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineBottom(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    :goto_0
    iget v1, p0, Lk32;->η:I

    .line 21
    .line 22
    add-int/2addr v0, v1

    .line 23
    iget v1, p0, Lk32;->θ:I

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    iget p0, p0, Lk32;->ν:I

    .line 27
    .line 28
    add-int/2addr v0, p0

    .line 29
    return v0
.end method

.method public final β()Lb8;
    .locals 7

    .line 1
    iget-object v0, p0, Lk32;->π:Lb8;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    new-instance v1, Lb8;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lk32;->ε:Landroid/text/Layout;

    .line 11
    .line 12
    iput-object v0, v1, Lb8;->α:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    move v0, v3

    .line 21
    :cond_0
    iget-object v4, v1, Lb8;->α:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, Landroid/text/Layout;

    .line 24
    .line 25
    invoke-virtual {v4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/16 v5, 0xa

    .line 30
    .line 31
    const/4 v6, 0x4

    .line 32
    invoke-static {v4, v5, v0, v6}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-gez v0, :cond_1

    .line 37
    .line 38
    iget-object v0, v1, Lb8;->α:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroid/text/Layout;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    iget-object v4, v1, Lb8;->α:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, Landroid/text/Layout;

    .line 63
    .line 64
    invoke-virtual {v4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-lt v0, v4, :cond_0

    .line 73
    .line 74
    iput-object v2, v1, Lb8;->β:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    new-instance v2, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    :goto_1
    if-ge v3, v0, :cond_2

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    iput-object v2, v1, Lb8;->γ:Ljava/lang/Object;

    .line 95
    .line 96
    iget-object v0, v1, Lb8;->β:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    new-array v0, v0, [Z

    .line 105
    .line 106
    iput-object v0, v1, Lb8;->δ:Ljava/lang/Object;

    .line 107
    .line 108
    iget-object v0, v1, Lb8;->β:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 113
    .line 114
    .line 115
    iput-object v1, p0, Lk32;->π:Lb8;

    .line 116
    .line 117
    return-object v1

    .line 118
    :cond_3
    return-object v0
.end method

.method public final γ(I)F
    .locals 2

    .line 1
    iget v0, p0, Lk32;->η:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget v1, p0, Lk32;->ζ:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, -0x1

    .line 7
    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lk32;->μ:Landroid/graphics/Paint$FontMetricsInt;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lk32;->ζ(I)F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    iget p1, v1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 19
    .line 20
    int-to-float p1, p1

    .line 21
    sub-float/2addr p0, p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p0, p0, Lk32;->ε:Landroid/text/Layout;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-float p0, p0

    .line 30
    :goto_0
    add-float/2addr v0, p0

    .line 31
    return v0
.end method

.method public final δ(I)F
    .locals 3

    .line 1
    iget v0, p0, Lk32;->ζ:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, -0x1

    .line 4
    .line 5
    iget-object v2, p0, Lk32;->ε:Landroid/text/Layout;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lk32;->μ:Landroid/graphics/Paint$FontMetricsInt;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 p1, p1, -0x1

    .line 14
    .line 15
    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    int-to-float p0, p0

    .line 20
    iget p1, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 21
    .line 22
    int-to-float p1, p1

    .line 23
    add-float/2addr p0, p1

    .line 24
    return p0

    .line 25
    :cond_0
    iget v1, p0, Lk32;->η:I

    .line 26
    .line 27
    int-to-float v1, v1

    .line 28
    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-float v2, v2

    .line 33
    add-float/2addr v1, v2

    .line 34
    add-int/lit8 v0, v0, -0x1

    .line 35
    .line 36
    if-ne p1, v0, :cond_1

    .line 37
    .line 38
    iget p0, p0, Lk32;->θ:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    :goto_0
    int-to-float p0, p0

    .line 43
    add-float/2addr v1, p0

    .line 44
    return v1
.end method

.method public final ε(I)I
    .locals 2

    .line 1
    sget-object v0, Ln32;->α:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    iget-object v0, p0, Lk32;->ε:Landroid/text/Layout;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lk32;->β:Landroid/text/TextUtils$TruncateAt;

    .line 12
    .line 13
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 14
    .line 15
    if-ne p0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineEnd(I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final ζ(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lk32;->ε:Landroid/text/Layout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineTop(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget p0, p0, Lk32;->η:I

    .line 13
    .line 14
    :goto_0
    int-to-float p0, p0

    .line 15
    add-float/2addr v0, p0

    .line 16
    return v0
.end method

.method public final η(IZ)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk32;->β()Lb8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, p1, v1, p2}, Lb8;->θ(IZZ)F

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    iget-object v0, p0, Lk32;->ε:Landroid/text/Layout;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget v0, p0, Lk32;->ζ:I

    .line 17
    .line 18
    sub-int/2addr v0, v1

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    iget p1, p0, Lk32;->ι:F

    .line 22
    .line 23
    iget p0, p0, Lk32;->κ:F

    .line 24
    .line 25
    add-float/2addr p1, p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    add-float/2addr p1, p2

    .line 29
    return p1
.end method

.method public final θ(IZ)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk32;->β()Lb8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1, p2}, Lb8;->θ(IZZ)F

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    iget-object v0, p0, Lk32;->ε:Landroid/text/Layout;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget v0, p0, Lk32;->ζ:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    .line 22
    iget p1, p0, Lk32;->ι:F

    .line 23
    .line 24
    iget p0, p0, Lk32;->κ:F

    .line 25
    .line 26
    add-float/2addr p1, p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    add-float/2addr p1, p2

    .line 30
    return p1
.end method
