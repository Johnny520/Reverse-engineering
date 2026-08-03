.class public final La9/e;
.super Landroid/text/style/ReplacementSpan;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Ly9/f;

.field public final h:I


# direct methods
.method public constructor <init>(Ly9/f;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La9/e;->g:Ly9/f;

    .line 5
    .line 6
    const/16 p1, 0x64

    .line 7
    .line 8
    const/16 v0, 0x384

    .line 9
    .line 10
    invoke-static {p2, p1, v0}, Lr9/e0;->r(III)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, La9/e;->h:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Paint;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/16 v4, 0x1c

    .line 10
    .line 11
    iget v5, p0, La9/e;->h:I

    .line 12
    .line 13
    if-lt v1, v4, :cond_1

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/Typeface;->isItalic()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v3

    .line 25
    :goto_0
    invoke-static {v0, v5, v2}, Lh3/c;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const/16 v1, 0x258

    .line 37
    .line 38
    if-lt v5, v1, :cond_2

    .line 39
    .line 40
    move v4, v2

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v4, v3

    .line 43
    :goto_1
    invoke-static {v0, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 48
    .line 49
    .line 50
    if-lt v5, v1, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move v2, v3

    .line 54
    :goto_2
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p9

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v7}, Landroid/graphics/Paint;->getColor()I

    .line 15
    .line 16
    .line 17
    move-result v8

    .line 18
    invoke-virtual {v7}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 19
    .line 20
    .line 21
    move-result-object v9

    .line 22
    invoke-virtual {v7}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    invoke-virtual {v7}, Landroid/graphics/Paint;->isFakeBoldText()Z

    .line 27
    .line 28
    .line 29
    move-result v11

    .line 30
    invoke-virtual {v0, v7}, La9/e;->a(Landroid/graphics/Paint;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, v0, La9/e;->g:Ly9/f;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iget v2, v1, Ly9/f;->a:I

    .line 38
    .line 39
    iget v3, v1, Ly9/f;->b:I

    .line 40
    .line 41
    if-eq v2, v3, :cond_1

    .line 42
    .line 43
    move-object/from16 v3, p2

    .line 44
    .line 45
    move/from16 v4, p3

    .line 46
    .line 47
    move/from16 v5, p4

    .line 48
    .line 49
    invoke-virtual {v7, v3, v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/high16 v6, 0x3f800000    # 1.0f

    .line 54
    .line 55
    cmpg-float v12, v2, v6

    .line 56
    .line 57
    if-gez v12, :cond_0

    .line 58
    .line 59
    move v2, v6

    .line 60
    :cond_0
    new-instance v12, Landroid/graphics/LinearGradient;

    .line 61
    .line 62
    add-float v15, p5, v2

    .line 63
    .line 64
    iget v2, v1, Ly9/f;->a:I

    .line 65
    .line 66
    iget v1, v1, Ly9/f;->b:I

    .line 67
    .line 68
    sget-object v19, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 69
    .line 70
    const/4 v14, 0x0

    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    move/from16 v13, p5

    .line 74
    .line 75
    move/from16 v18, v1

    .line 76
    .line 77
    move/from16 v17, v2

    .line 78
    .line 79
    invoke-direct/range {v12 .. v19}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7, v12}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 83
    .line 84
    .line 85
    :goto_0
    move/from16 v1, p7

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    move-object/from16 v3, p2

    .line 89
    .line 90
    move/from16 v4, p3

    .line 91
    .line 92
    move/from16 v5, p4

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    move-object/from16 v3, p2

    .line 103
    .line 104
    move/from16 v4, p3

    .line 105
    .line 106
    move/from16 v5, p4

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :goto_1
    int-to-float v6, v1

    .line 110
    move-object/from16 v1, p1

    .line 111
    .line 112
    move-object v2, v3

    .line 113
    move v3, v4

    .line 114
    move v4, v5

    .line 115
    move/from16 v5, p5

    .line 116
    .line 117
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, v10}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 8
    .line 9
    .line 10
    move-result-object p5

    .line 11
    invoke-virtual {p1}, Landroid/graphics/Paint;->isFakeBoldText()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0, p1}, La9/e;->a(Landroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    float-to-int p2, p2

    .line 23
    invoke-virtual {p1, p5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 27
    .line 28
    .line 29
    return p2
.end method
