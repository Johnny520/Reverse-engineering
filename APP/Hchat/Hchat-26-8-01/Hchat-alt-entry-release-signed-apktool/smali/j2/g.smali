.class public abstract Lj2/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lb8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb8/c;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lb8/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lj2/g;->a:Lb8/c;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)Landroid/text/StaticLayout;
    .locals 1

    .line 1
    if-ltz p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "invalid start value"

    .line 5
    .line 6
    invoke-static {v0}, Lo2/a;->a(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ltz p3, :cond_1

    .line 14
    .line 15
    if-gt p3, v0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const-string v0, "invalid end value"

    .line 19
    .line 20
    invoke-static {v0}, Lo2/a;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_1
    if-ltz p6, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    const-string v0, "invalid maxLines value"

    .line 27
    .line 28
    invoke-static {v0}, Lo2/a;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_2
    if-ltz p2, :cond_3

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_3
    const-string v0, "invalid width value"

    .line 35
    .line 36
    invoke-static {v0}, Lo2/a;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_3
    if-ltz p8, :cond_4

    .line 40
    .line 41
    goto :goto_4

    .line 42
    :cond_4
    const-string v0, "invalid ellipsizedWidth value"

    .line 43
    .line 44
    invoke-static {v0}, Lo2/a;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_4
    const/4 v0, 0x0

    .line 48
    invoke-static {p0, v0, p3, p1, p2}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0, p4}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p5}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p6}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p7}, Landroid/text/StaticLayout$Builder;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)Landroid/text/StaticLayout$Builder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p8}, Landroid/text/StaticLayout$Builder;->setEllipsizedWidth(I)Landroid/text/StaticLayout$Builder;

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    const/high16 p2, 0x3f800000    # 1.0f

    .line 69
    .line 70
    invoke-virtual {p0, p1, p2}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p10}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p11}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p14}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    invoke-virtual {p0, p1, p1}, Landroid/text/StaticLayout$Builder;->setIndents([I[I)Landroid/text/StaticLayout$Builder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p9}, Landroid/text/StaticLayout$Builder;->setJustificationMode(I)Landroid/text/StaticLayout$Builder;

    .line 87
    .line 88
    .line 89
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 90
    .line 91
    const/16 p2, 0x1c

    .line 92
    .line 93
    if-lt p1, p2, :cond_5

    .line 94
    .line 95
    invoke-static {p0}, Lh3/c;->f(Landroid/text/StaticLayout$Builder;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    const/16 p2, 0x21

    .line 99
    .line 100
    if-lt p1, p2, :cond_6

    .line 101
    .line 102
    invoke-static {}, Lai/a;->f()Landroid/graphics/text/LineBreakConfig$Builder;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {p2, p12}, Lai/a;->g(Landroid/graphics/text/LineBreakConfig$Builder;I)Landroid/graphics/text/LineBreakConfig$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-static {p2, p13}, Lai/a;->C(Landroid/graphics/text/LineBreakConfig$Builder;I)Landroid/graphics/text/LineBreakConfig$Builder;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-static {p2}, Lai/a;->h(Landroid/graphics/text/LineBreakConfig$Builder;)Landroid/graphics/text/LineBreakConfig;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-static {p0, p2}, Lai/a;->x(Landroid/text/StaticLayout$Builder;Landroid/graphics/text/LineBreakConfig;)V

    .line 119
    .line 120
    .line 121
    :cond_6
    const/16 p2, 0x23

    .line 122
    .line 123
    if-lt p1, p2, :cond_7

    .line 124
    .line 125
    invoke-static {p0}, Lj2/h;->a(Landroid/text/StaticLayout$Builder;)V

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-virtual {p0}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0
.end method

.method public static final b(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v1, Landroid/text/Spanned;

    .line 10
    .line 11
    if-eqz v4, :cond_4

    .line 12
    .line 13
    move-object v4, v1

    .line 14
    check-cast v4, Landroid/text/Spanned;

    .line 15
    .line 16
    add-int/lit8 v6, v2, -0x1

    .line 17
    .line 18
    const-class v7, Landroid/text/style/MetricAffectingSpan;

    .line 19
    .line 20
    invoke-interface {v4, v6, v3, v7}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-eq v6, v3, :cond_4

    .line 25
    .line 26
    new-instance v6, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v8, Landroid/graphics/Rect;

    .line 32
    .line 33
    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v9, Landroid/text/TextPaint;

    .line 37
    .line 38
    invoke-direct {v9}, Landroid/text/TextPaint;-><init>()V

    .line 39
    .line 40
    .line 41
    :goto_0
    if-ge v2, v3, :cond_3

    .line 42
    .line 43
    invoke-interface {v4, v2, v3, v7}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    invoke-interface {v4, v2, v10, v7}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    check-cast v11, [Landroid/text/style/MetricAffectingSpan;

    .line 52
    .line 53
    invoke-virtual {v9, v0}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 54
    .line 55
    .line 56
    array-length v12, v11

    .line 57
    const/4 v13, 0x0

    .line 58
    :goto_1
    if-ge v13, v12, :cond_1

    .line 59
    .line 60
    aget-object v14, v11, v13

    .line 61
    .line 62
    invoke-interface {v4, v14}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 63
    .line 64
    .line 65
    move-result v15

    .line 66
    invoke-interface {v4, v14}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eq v15, v5, :cond_0

    .line 71
    .line 72
    invoke-virtual {v14, v9}, Landroid/text/style/MetricAffectingSpan;->updateMeasureState(Landroid/text/TextPaint;)V

    .line 73
    .line 74
    .line 75
    :cond_0
    add-int/lit8 v13, v13, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 79
    .line 80
    const/16 v11, 0x1d

    .line 81
    .line 82
    if-lt v5, v11, :cond_2

    .line 83
    .line 84
    invoke-static {v9, v1, v2, v10, v8}, Lj2/b;->l(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v9, v5, v2, v10, v8}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 93
    .line 94
    .line 95
    :goto_2
    iget v2, v6, Landroid/graphics/Rect;->right:I

    .line 96
    .line 97
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    add-int/2addr v5, v2

    .line 102
    iput v5, v6, Landroid/graphics/Rect;->right:I

    .line 103
    .line 104
    iget v2, v6, Landroid/graphics/Rect;->top:I

    .line 105
    .line 106
    iget v5, v8, Landroid/graphics/Rect;->top:I

    .line 107
    .line 108
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    iput v2, v6, Landroid/graphics/Rect;->top:I

    .line 113
    .line 114
    iget v2, v6, Landroid/graphics/Rect;->bottom:I

    .line 115
    .line 116
    iget v5, v8, Landroid/graphics/Rect;->bottom:I

    .line 117
    .line 118
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    iput v2, v6, Landroid/graphics/Rect;->bottom:I

    .line 123
    .line 124
    move v2, v10

    .line 125
    goto :goto_0

    .line 126
    :cond_3
    return-object v6

    .line 127
    :cond_4
    new-instance v4, Landroid/graphics/Rect;

    .line 128
    .line 129
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 130
    .line 131
    .line 132
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 133
    .line 134
    const/16 v11, 0x1d

    .line 135
    .line 136
    if-lt v5, v11, :cond_5

    .line 137
    .line 138
    invoke-static {v0, v1, v2, v3, v4}, Lj2/b;->l(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V

    .line 139
    .line 140
    .line 141
    return-object v4

    .line 142
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 147
    .line 148
    .line 149
    return-object v4
.end method

.method public static final c(II[F)F
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1}, Lp/a;->z(IIII)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, p2, p0

    .line 8
    .line 9
    return p0
.end method

.method public static final d(Landroid/text/Layout;IZ)I
    .locals 2

    .line 1
    if-gtz p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lt p1, v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/text/Layout;->getLineCount()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    add-int/lit8 p0, p0, -0x1

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p0, v0}, Landroid/text/Layout;->getLineStart(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0, v0}, Landroid/text/Layout;->getLineEnd(I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eq v1, p1, :cond_2

    .line 35
    .line 36
    if-eq p0, p1, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    if-ne v1, p1, :cond_3

    .line 40
    .line 41
    if-eqz p2, :cond_4

    .line 42
    .line 43
    add-int/lit8 v0, v0, -0x1

    .line 44
    .line 45
    return v0

    .line 46
    :cond_3
    if-eqz p2, :cond_5

    .line 47
    .line 48
    :cond_4
    :goto_0
    return v0

    .line 49
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    return v0
.end method

.method public static final e(Lj2/k;Landroid/text/Layout;Lbe/k;ILandroid/graphics/RectF;Lk2/d;Lb0/t;Z)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p6

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineTop(I)I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineBottom(I)I

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineStart(I)I

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineEnd(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ne v9, v1, :cond_1

    .line 32
    .line 33
    :cond_0
    const/4 v10, -0x1

    .line 34
    goto/16 :goto_1e

    .line 35
    .line 36
    :cond_1
    sub-int/2addr v1, v9

    .line 37
    mul-int/lit8 v1, v1, 0x2

    .line 38
    .line 39
    new-array v11, v1, [F

    .line 40
    .line 41
    iget-object v12, v0, Lj2/k;->f:Landroid/text/Layout;

    .line 42
    .line 43
    invoke-virtual {v12, v3}, Landroid/text/Layout;->getLineStart(I)I

    .line 44
    .line 45
    .line 46
    move-result v13

    .line 47
    invoke-virtual {v0, v3}, Lj2/k;->f(I)I

    .line 48
    .line 49
    .line 50
    move-result v14

    .line 51
    sub-int v15, v14, v13

    .line 52
    .line 53
    mul-int/lit8 v15, v15, 0x2

    .line 54
    .line 55
    if-lt v1, v15, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const-string v1, "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2"

    .line 59
    .line 60
    invoke-static {v1}, Lo2/a;->a(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    new-instance v1, Le2/g;

    .line 64
    .line 65
    invoke-direct {v1, v0}, Le2/g;-><init>(Lj2/k;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v12, v3}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const/4 v15, 0x0

    .line 73
    const/4 v10, 0x1

    .line 74
    if-ne v0, v10, :cond_3

    .line 75
    .line 76
    move v0, v10

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    move v0, v15

    .line 79
    :goto_1
    move/from16 v16, v15

    .line 80
    .line 81
    :goto_2
    if-ge v13, v14, :cond_7

    .line 82
    .line 83
    invoke-virtual {v12, v13}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 84
    .line 85
    .line 86
    move-result v17

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    if-nez v17, :cond_4

    .line 90
    .line 91
    invoke-virtual {v1, v13, v15, v15, v10}, Le2/g;->a(IZZZ)F

    .line 92
    .line 93
    .line 94
    move-result v17

    .line 95
    add-int/lit8 v15, v13, 0x1

    .line 96
    .line 97
    invoke-virtual {v1, v15, v10, v10, v10}, Le2/g;->a(IZZZ)F

    .line 98
    .line 99
    .line 100
    move-result v15

    .line 101
    move/from16 v18, v0

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    if-eqz v0, :cond_5

    .line 105
    .line 106
    if-eqz v17, :cond_5

    .line 107
    .line 108
    const/4 v15, 0x0

    .line 109
    invoke-virtual {v1, v13, v15, v15, v15}, Le2/g;->a(IZZZ)F

    .line 110
    .line 111
    .line 112
    move-result v17

    .line 113
    move/from16 v18, v0

    .line 114
    .line 115
    add-int/lit8 v0, v13, 0x1

    .line 116
    .line 117
    invoke-virtual {v1, v0, v10, v10, v15}, Le2/g;->a(IZZZ)F

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    move/from16 v15, v17

    .line 122
    .line 123
    move/from16 v17, v0

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    move/from16 v18, v0

    .line 127
    .line 128
    const/4 v15, 0x0

    .line 129
    if-eqz v17, :cond_6

    .line 130
    .line 131
    invoke-virtual {v1, v13, v15, v15, v10}, Le2/g;->a(IZZZ)F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    add-int/lit8 v15, v13, 0x1

    .line 136
    .line 137
    invoke-virtual {v1, v15, v10, v10, v10}, Le2/g;->a(IZZZ)F

    .line 138
    .line 139
    .line 140
    move-result v17

    .line 141
    :goto_3
    move v15, v0

    .line 142
    goto :goto_4

    .line 143
    :cond_6
    invoke-virtual {v1, v13, v15, v15, v15}, Le2/g;->a(IZZZ)F

    .line 144
    .line 145
    .line 146
    move-result v17

    .line 147
    add-int/lit8 v0, v13, 0x1

    .line 148
    .line 149
    invoke-virtual {v1, v0, v10, v10, v15}, Le2/g;->a(IZZZ)F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    goto :goto_3

    .line 154
    :goto_4
    aput v17, v11, v16

    .line 155
    .line 156
    add-int/lit8 v0, v16, 0x1

    .line 157
    .line 158
    aput v15, v11, v0

    .line 159
    .line 160
    add-int/lit8 v16, v16, 0x2

    .line 161
    .line 162
    add-int/lit8 v13, v13, 0x1

    .line 163
    .line 164
    move/from16 v0, v18

    .line 165
    .line 166
    const/4 v15, 0x0

    .line 167
    goto :goto_2

    .line 168
    :cond_7
    iget-object v0, v2, Lbe/k;->b:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Landroid/text/Layout;

    .line 171
    .line 172
    invoke-virtual {v0, v3}, Landroid/text/Layout;->getLineStart(I)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-virtual {v0, v3}, Landroid/text/Layout;->getLineEnd(I)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    const/4 v15, 0x0

    .line 181
    invoke-virtual {v2, v1, v15}, Lbe/k;->j(IZ)I

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    invoke-virtual {v2, v12}, Lbe/k;->k(I)I

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    sub-int v14, v1, v13

    .line 190
    .line 191
    sub-int v13, v3, v13

    .line 192
    .line 193
    invoke-virtual {v2, v12}, Lbe/k;->e(I)Ljava/text/Bidi;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    if-eqz v2, :cond_a

    .line 198
    .line 199
    invoke-virtual {v2, v14, v13}, Ljava/text/Bidi;->createLineBidi(II)Ljava/text/Bidi;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    if-nez v2, :cond_8

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_8
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    new-array v3, v0, [Lj2/e;

    .line 211
    .line 212
    const/4 v15, 0x0

    .line 213
    :goto_5
    if-ge v15, v0, :cond_b

    .line 214
    .line 215
    new-instance v12, Lj2/e;

    .line 216
    .line 217
    invoke-virtual {v2, v15}, Ljava/text/Bidi;->getRunStart(I)I

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    add-int/2addr v13, v1

    .line 222
    invoke-virtual {v2, v15}, Ljava/text/Bidi;->getRunLimit(I)I

    .line 223
    .line 224
    .line 225
    move-result v14

    .line 226
    add-int/2addr v14, v1

    .line 227
    invoke-virtual {v2, v15}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 228
    .line 229
    .line 230
    move-result v16

    .line 231
    move/from16 p2, v0

    .line 232
    .line 233
    rem-int/lit8 v0, v16, 0x2

    .line 234
    .line 235
    if-ne v0, v10, :cond_9

    .line 236
    .line 237
    move v0, v10

    .line 238
    goto :goto_6

    .line 239
    :cond_9
    const/4 v0, 0x0

    .line 240
    :goto_6
    invoke-direct {v12, v13, v14, v0}, Lj2/e;-><init>(IIZ)V

    .line 241
    .line 242
    .line 243
    aput-object v12, v3, v15

    .line 244
    .line 245
    add-int/lit8 v15, v15, 0x1

    .line 246
    .line 247
    move/from16 v0, p2

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_a
    :goto_7
    new-instance v2, Lj2/e;

    .line 251
    .line 252
    invoke-virtual {v0, v1}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    invoke-direct {v2, v1, v3, v0}, Lj2/e;-><init>(IIZ)V

    .line 257
    .line 258
    .line 259
    filled-new-array {v2}, [Lj2/e;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    :cond_b
    if-eqz p7, :cond_c

    .line 264
    .line 265
    invoke-static {v3}, Ltf/l;->A0([Ljava/lang/Object;)Llg/d;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    goto :goto_8

    .line 270
    :cond_c
    array-length v0, v3

    .line 271
    sub-int/2addr v0, v10

    .line 272
    new-instance v1, Llg/b;

    .line 273
    .line 274
    const/4 v2, -0x1

    .line 275
    const/4 v15, 0x0

    .line 276
    invoke-direct {v1, v0, v15, v2}, Llg/b;-><init>(III)V

    .line 277
    .line 278
    .line 279
    move-object v0, v1

    .line 280
    :goto_8
    iget v1, v0, Llg/b;->g:I

    .line 281
    .line 282
    iget v2, v0, Llg/b;->h:I

    .line 283
    .line 284
    iget v0, v0, Llg/b;->i:I

    .line 285
    .line 286
    if-lez v0, :cond_d

    .line 287
    .line 288
    if-le v1, v2, :cond_e

    .line 289
    .line 290
    :cond_d
    if-gez v0, :cond_0

    .line 291
    .line 292
    if-gt v2, v1, :cond_0

    .line 293
    .line 294
    :cond_e
    :goto_9
    aget-object v12, v3, v1

    .line 295
    .line 296
    iget-boolean v13, v12, Lj2/e;->c:Z

    .line 297
    .line 298
    iget v14, v12, Lj2/e;->a:I

    .line 299
    .line 300
    iget v12, v12, Lj2/e;->b:I

    .line 301
    .line 302
    if-eqz v13, :cond_f

    .line 303
    .line 304
    add-int/lit8 v15, v12, -0x1

    .line 305
    .line 306
    sub-int/2addr v15, v9

    .line 307
    mul-int/lit8 v15, v15, 0x2

    .line 308
    .line 309
    aget v15, v11, v15

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_f
    sub-int v15, v14, v9

    .line 313
    .line 314
    mul-int/lit8 v15, v15, 0x2

    .line 315
    .line 316
    aget v15, v11, v15

    .line 317
    .line 318
    :goto_a
    if-eqz v13, :cond_10

    .line 319
    .line 320
    invoke-static {v14, v9, v11}, Lj2/g;->c(II[F)F

    .line 321
    .line 322
    .line 323
    move-result v16

    .line 324
    goto :goto_b

    .line 325
    :cond_10
    add-int/lit8 v10, v12, -0x1

    .line 326
    .line 327
    invoke-static {v10, v9, v11}, Lj2/g;->c(II[F)F

    .line 328
    .line 329
    .line 330
    move-result v16

    .line 331
    :goto_b
    iget v10, v4, Landroid/graphics/RectF;->left:F

    .line 332
    .line 333
    move/from16 v17, v0

    .line 334
    .line 335
    if-eqz p7, :cond_24

    .line 336
    .line 337
    cmpl-float v18, v16, v10

    .line 338
    .line 339
    if-ltz v18, :cond_19

    .line 340
    .line 341
    iget v0, v4, Landroid/graphics/RectF;->right:F

    .line 342
    .line 343
    cmpg-float v18, v15, v0

    .line 344
    .line 345
    if-gtz v18, :cond_19

    .line 346
    .line 347
    if-nez v13, :cond_11

    .line 348
    .line 349
    cmpg-float v10, v10, v15

    .line 350
    .line 351
    if-lez v10, :cond_12

    .line 352
    .line 353
    :cond_11
    if-eqz v13, :cond_13

    .line 354
    .line 355
    cmpl-float v0, v0, v16

    .line 356
    .line 357
    if-ltz v0, :cond_13

    .line 358
    .line 359
    :cond_12
    move v0, v14

    .line 360
    goto :goto_d

    .line 361
    :cond_13
    move v0, v12

    .line 362
    move v10, v14

    .line 363
    :goto_c
    sub-int v15, v0, v10

    .line 364
    .line 365
    move/from16 p3, v0

    .line 366
    .line 367
    const/4 v0, 0x1

    .line 368
    if-le v15, v0, :cond_17

    .line 369
    .line 370
    add-int v0, p3, v10

    .line 371
    .line 372
    div-int/lit8 v0, v0, 0x2

    .line 373
    .line 374
    sub-int v15, v0, v9

    .line 375
    .line 376
    mul-int/lit8 v15, v15, 0x2

    .line 377
    .line 378
    aget v15, v11, v15

    .line 379
    .line 380
    move/from16 v16, v0

    .line 381
    .line 382
    if-nez v13, :cond_14

    .line 383
    .line 384
    iget v0, v4, Landroid/graphics/RectF;->left:F

    .line 385
    .line 386
    cmpl-float v0, v15, v0

    .line 387
    .line 388
    if-gtz v0, :cond_15

    .line 389
    .line 390
    :cond_14
    if-eqz v13, :cond_16

    .line 391
    .line 392
    iget v0, v4, Landroid/graphics/RectF;->right:F

    .line 393
    .line 394
    cmpg-float v0, v15, v0

    .line 395
    .line 396
    if-gez v0, :cond_16

    .line 397
    .line 398
    :cond_15
    move/from16 v0, v16

    .line 399
    .line 400
    goto :goto_c

    .line 401
    :cond_16
    move/from16 v0, p3

    .line 402
    .line 403
    move/from16 v10, v16

    .line 404
    .line 405
    goto :goto_c

    .line 406
    :cond_17
    if-eqz v13, :cond_18

    .line 407
    .line 408
    move/from16 v0, p3

    .line 409
    .line 410
    goto :goto_d

    .line 411
    :cond_18
    move v0, v10

    .line 412
    :goto_d
    invoke-interface {v5, v0}, Lk2/d;->h(I)I

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    const/4 v10, -0x1

    .line 417
    if-ne v0, v10, :cond_1b

    .line 418
    .line 419
    :cond_19
    :goto_e
    move-object/from16 v18, v3

    .line 420
    .line 421
    :cond_1a
    :goto_f
    const/4 v14, -0x1

    .line 422
    goto/16 :goto_1d

    .line 423
    .line 424
    :cond_1b
    invoke-interface {v5, v0}, Lk2/d;->g(I)I

    .line 425
    .line 426
    .line 427
    move-result v10

    .line 428
    if-lt v10, v12, :cond_1c

    .line 429
    .line 430
    goto :goto_e

    .line 431
    :cond_1c
    if-ge v10, v14, :cond_1d

    .line 432
    .line 433
    goto :goto_10

    .line 434
    :cond_1d
    move v14, v10

    .line 435
    :goto_10
    if-le v0, v12, :cond_1e

    .line 436
    .line 437
    move v0, v12

    .line 438
    :cond_1e
    new-instance v10, Landroid/graphics/RectF;

    .line 439
    .line 440
    int-to-float v15, v7

    .line 441
    move/from16 p3, v0

    .line 442
    .line 443
    int-to-float v0, v8

    .line 444
    move-object/from16 v18, v3

    .line 445
    .line 446
    const/4 v3, 0x0

    .line 447
    invoke-direct {v10, v3, v15, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 448
    .line 449
    .line 450
    move/from16 v0, p3

    .line 451
    .line 452
    :cond_1f
    :goto_11
    if-eqz v13, :cond_20

    .line 453
    .line 454
    add-int/lit8 v3, v0, -0x1

    .line 455
    .line 456
    sub-int/2addr v3, v9

    .line 457
    mul-int/lit8 v3, v3, 0x2

    .line 458
    .line 459
    aget v3, v11, v3

    .line 460
    .line 461
    goto :goto_12

    .line 462
    :cond_20
    sub-int v3, v14, v9

    .line 463
    .line 464
    mul-int/lit8 v3, v3, 0x2

    .line 465
    .line 466
    aget v3, v11, v3

    .line 467
    .line 468
    :goto_12
    iput v3, v10, Landroid/graphics/RectF;->left:F

    .line 469
    .line 470
    if-eqz v13, :cond_21

    .line 471
    .line 472
    invoke-static {v14, v9, v11}, Lj2/g;->c(II[F)F

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    goto :goto_13

    .line 477
    :cond_21
    add-int/lit8 v0, v0, -0x1

    .line 478
    .line 479
    invoke-static {v0, v9, v11}, Lj2/g;->c(II[F)F

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    :goto_13
    iput v0, v10, Landroid/graphics/RectF;->right:F

    .line 484
    .line 485
    invoke-virtual {v6, v10, v4}, Lb0/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    check-cast v0, Ljava/lang/Boolean;

    .line 490
    .line 491
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-eqz v0, :cond_22

    .line 496
    .line 497
    goto/16 :goto_1d

    .line 498
    .line 499
    :cond_22
    invoke-interface {v5, v14}, Lk2/d;->b(I)I

    .line 500
    .line 501
    .line 502
    move-result v14

    .line 503
    const/4 v0, -0x1

    .line 504
    if-eq v14, v0, :cond_1a

    .line 505
    .line 506
    if-lt v14, v12, :cond_23

    .line 507
    .line 508
    goto :goto_f

    .line 509
    :cond_23
    invoke-interface {v5, v14}, Lk2/d;->h(I)I

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-le v0, v12, :cond_1f

    .line 514
    .line 515
    move v0, v12

    .line 516
    goto :goto_11

    .line 517
    :cond_24
    move-object/from16 v18, v3

    .line 518
    .line 519
    cmpl-float v0, v16, v10

    .line 520
    .line 521
    if-ltz v0, :cond_2d

    .line 522
    .line 523
    iget v0, v4, Landroid/graphics/RectF;->right:F

    .line 524
    .line 525
    cmpg-float v3, v15, v0

    .line 526
    .line 527
    if-gtz v3, :cond_2d

    .line 528
    .line 529
    if-nez v13, :cond_25

    .line 530
    .line 531
    cmpl-float v0, v0, v16

    .line 532
    .line 533
    if-gez v0, :cond_26

    .line 534
    .line 535
    :cond_25
    if-eqz v13, :cond_27

    .line 536
    .line 537
    cmpg-float v0, v10, v15

    .line 538
    .line 539
    if-gtz v0, :cond_27

    .line 540
    .line 541
    :cond_26
    add-int/lit8 v0, v12, -0x1

    .line 542
    .line 543
    :goto_14
    const/4 v15, 0x1

    .line 544
    goto :goto_16

    .line 545
    :cond_27
    move v0, v12

    .line 546
    move v3, v14

    .line 547
    :goto_15
    sub-int v10, v0, v3

    .line 548
    .line 549
    const/4 v15, 0x1

    .line 550
    if-le v10, v15, :cond_2b

    .line 551
    .line 552
    add-int v10, v0, v3

    .line 553
    .line 554
    div-int/lit8 v10, v10, 0x2

    .line 555
    .line 556
    sub-int v15, v10, v9

    .line 557
    .line 558
    mul-int/lit8 v15, v15, 0x2

    .line 559
    .line 560
    aget v15, v11, v15

    .line 561
    .line 562
    move/from16 p3, v0

    .line 563
    .line 564
    if-nez v13, :cond_28

    .line 565
    .line 566
    iget v0, v4, Landroid/graphics/RectF;->right:F

    .line 567
    .line 568
    cmpl-float v0, v15, v0

    .line 569
    .line 570
    if-gtz v0, :cond_29

    .line 571
    .line 572
    :cond_28
    if-eqz v13, :cond_2a

    .line 573
    .line 574
    iget v0, v4, Landroid/graphics/RectF;->left:F

    .line 575
    .line 576
    cmpg-float v0, v15, v0

    .line 577
    .line 578
    if-gez v0, :cond_2a

    .line 579
    .line 580
    :cond_29
    move v0, v10

    .line 581
    goto :goto_15

    .line 582
    :cond_2a
    move/from16 v0, p3

    .line 583
    .line 584
    move v3, v10

    .line 585
    goto :goto_15

    .line 586
    :cond_2b
    move/from16 p3, v0

    .line 587
    .line 588
    if-eqz v13, :cond_2c

    .line 589
    .line 590
    move/from16 v0, p3

    .line 591
    .line 592
    goto :goto_14

    .line 593
    :cond_2c
    move v0, v3

    .line 594
    goto :goto_14

    .line 595
    :goto_16
    add-int/2addr v0, v15

    .line 596
    invoke-interface {v5, v0}, Lk2/d;->g(I)I

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    const/4 v10, -0x1

    .line 601
    if-ne v0, v10, :cond_2e

    .line 602
    .line 603
    :cond_2d
    :goto_17
    const/4 v12, -0x1

    .line 604
    goto :goto_1c

    .line 605
    :cond_2e
    invoke-interface {v5, v0}, Lk2/d;->h(I)I

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    if-gt v3, v14, :cond_2f

    .line 610
    .line 611
    goto :goto_17

    .line 612
    :cond_2f
    if-ge v0, v14, :cond_30

    .line 613
    .line 614
    move v0, v14

    .line 615
    :cond_30
    if-le v3, v12, :cond_31

    .line 616
    .line 617
    goto :goto_18

    .line 618
    :cond_31
    move v12, v3

    .line 619
    :goto_18
    new-instance v3, Landroid/graphics/RectF;

    .line 620
    .line 621
    int-to-float v10, v7

    .line 622
    int-to-float v15, v8

    .line 623
    move/from16 p3, v0

    .line 624
    .line 625
    const/4 v0, 0x0

    .line 626
    invoke-direct {v3, v0, v10, v0, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 627
    .line 628
    .line 629
    move/from16 v0, p3

    .line 630
    .line 631
    :cond_32
    :goto_19
    if-eqz v13, :cond_33

    .line 632
    .line 633
    add-int/lit8 v10, v12, -0x1

    .line 634
    .line 635
    sub-int/2addr v10, v9

    .line 636
    mul-int/lit8 v10, v10, 0x2

    .line 637
    .line 638
    aget v10, v11, v10

    .line 639
    .line 640
    goto :goto_1a

    .line 641
    :cond_33
    sub-int v10, v0, v9

    .line 642
    .line 643
    mul-int/lit8 v10, v10, 0x2

    .line 644
    .line 645
    aget v10, v11, v10

    .line 646
    .line 647
    :goto_1a
    iput v10, v3, Landroid/graphics/RectF;->left:F

    .line 648
    .line 649
    if-eqz v13, :cond_34

    .line 650
    .line 651
    invoke-static {v0, v9, v11}, Lj2/g;->c(II[F)F

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    goto :goto_1b

    .line 656
    :cond_34
    add-int/lit8 v0, v12, -0x1

    .line 657
    .line 658
    invoke-static {v0, v9, v11}, Lj2/g;->c(II[F)F

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    :goto_1b
    iput v0, v3, Landroid/graphics/RectF;->right:F

    .line 663
    .line 664
    invoke-virtual {v6, v3, v4}, Lb0/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    check-cast v0, Ljava/lang/Boolean;

    .line 669
    .line 670
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    if-eqz v0, :cond_35

    .line 675
    .line 676
    goto :goto_1c

    .line 677
    :cond_35
    invoke-interface {v5, v12}, Lk2/d;->c(I)I

    .line 678
    .line 679
    .line 680
    move-result v12

    .line 681
    const/4 v10, -0x1

    .line 682
    if-eq v12, v10, :cond_2d

    .line 683
    .line 684
    if-gt v12, v14, :cond_36

    .line 685
    .line 686
    goto :goto_17

    .line 687
    :cond_36
    invoke-interface {v5, v12}, Lk2/d;->g(I)I

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    if-ge v0, v14, :cond_32

    .line 692
    .line 693
    move v0, v14

    .line 694
    goto :goto_19

    .line 695
    :goto_1c
    move v14, v12

    .line 696
    :goto_1d
    if-ltz v14, :cond_37

    .line 697
    .line 698
    return v14

    .line 699
    :cond_37
    if-eq v1, v2, :cond_0

    .line 700
    .line 701
    add-int v1, v1, v17

    .line 702
    .line 703
    move/from16 v0, v17

    .line 704
    .line 705
    move-object/from16 v3, v18

    .line 706
    .line 707
    const/4 v10, 0x1

    .line 708
    goto/16 :goto_9

    .line 709
    .line 710
    :goto_1e
    return v10
.end method

.method public static final f(Landroid/text/Spanned;Ljava/lang/Class;)Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-interface {p0, v0, v1, p1}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eq p1, p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method
