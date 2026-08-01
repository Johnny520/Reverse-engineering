.class public final Lfe;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lcw;


# instance fields
.field public final ε:Lee;

.field public final ζ:Lm6;

.field public η:Lq2;

.field public θ:Lq2;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lee;

    .line 5
    .line 6
    sget-object v1, Ls1;->γ:Lzr;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Lee;->α:Lyr;

    .line 12
    .line 13
    sget-object v1, Lnp0;->ε:Lnp0;

    .line 14
    .line 15
    iput-object v1, v0, Lee;->β:Lnp0;

    .line 16
    .line 17
    sget-object v1, Lgz;->α:Lgz;

    .line 18
    .line 19
    iput-object v1, v0, Lee;->γ:Lde;

    .line 20
    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    iput-wide v1, v0, Lee;->δ:J

    .line 24
    .line 25
    iput-object v0, p0, Lfe;->ε:Lee;

    .line 26
    .line 27
    new-instance v0, Lm6;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lm6;-><init>(Lfe;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lfe;->ζ:Lm6;

    .line 33
    .line 34
    return-void
.end method

.method public static γ(Lfe;JLkn0;FI)Lq2;
    .locals 2

    .line 1
    invoke-virtual {p0, p3}, Lfe;->ζ(Lkn0;)Lq2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p3, p0, Lq2;->β:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p3, Landroid/graphics/Paint;

    .line 8
    .line 9
    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    .line 11
    cmpg-float v0, p4, v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p1, p2}, Lci;->δ(J)F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    mul-float/2addr v0, p4

    .line 21
    invoke-static {p1, p2, v0}, Lci;->β(JF)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    :goto_0
    invoke-virtual {p3}, Landroid/graphics/Paint;->getColor()I

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    int-to-long v0, p4

    .line 30
    const/16 p4, 0x20

    .line 31
    .line 32
    shl-long/2addr v0, p4

    .line 33
    invoke-static {v0, v1, p1, p2}, Lci;->γ(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    if-nez p4, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, p1, p2}, Lq2;->ε(J)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object p1, p0, Lq2;->γ:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Landroid/graphics/Shader;

    .line 45
    .line 46
    const/4 p2, 0x0

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0, p2}, Lq2;->ζ(Landroid/graphics/Shader;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object p1, p0, Lq2;->δ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lga;

    .line 55
    .line 56
    invoke-static {p1, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    iput-object p2, p0, Lq2;->δ:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 65
    .line 66
    .line 67
    :cond_3
    iget p1, p0, Lq2;->α:I

    .line 68
    .line 69
    if-ne p1, p5, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-virtual {p0, p5}, Lq2;->δ(I)V

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-virtual {p3}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    const/4 p2, 0x1

    .line 80
    if-ne p1, p2, :cond_5

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_5
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 84
    .line 85
    .line 86
    return-object p0
.end method


# virtual methods
.method public final getLayoutDirection()Lnp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 2
    .line 3
    iget-object p0, p0, Lee;->β:Lnp0;

    .line 4
    .line 5
    return-object p0
.end method

.method public final Β()Lm6;
    .locals 0

    .line 1
    iget-object p0, p0, Lfe;->ζ:Lm6;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Λ(JJJFLkn0;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lfe;->ε:Lee;

    .line 2
    .line 3
    iget-object v0, v0, Lee;->γ:Lde;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v2, p3, v1

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const-wide v4, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p3, v4

    .line 20
    long-to-int p3, p3

    .line 21
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    shr-long v6, p5, v1

    .line 30
    .line 31
    long-to-int v1, v6

    .line 32
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-float/2addr v1, v2

    .line 37
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    and-long/2addr v4, p5

    .line 42
    long-to-int v2, v4

    .line 43
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    add-float/2addr v2, p3

    .line 48
    move-object v4, p0

    .line 49
    move-wide v5, p1

    .line 50
    move/from16 v8, p7

    .line 51
    .line 52
    move-object/from16 v7, p8

    .line 53
    .line 54
    move/from16 v9, p9

    .line 55
    .line 56
    invoke-static/range {v4 .. v9}, Lfe;->γ(Lfe;JLkn0;FI)Lq2;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    move-object p5, p0

    .line 61
    move p2, p4

    .line 62
    move-object p0, v0

    .line 63
    move p3, v1

    .line 64
    move p4, v2

    .line 65
    move p1, v3

    .line 66
    invoke-interface/range {p0 .. p5}, Lde;->κ(FFFFLq2;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final β()F
    .locals 0

    .line 1
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 2
    .line 3
    iget-object p0, p0, Lee;->α:Lyr;

    .line 4
    .line 5
    invoke-interface {p0}, Lyr;->β()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final δ(Lkn0;Lkn0;FLga;II)Lq2;
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, Lfe;->ζ(Lkn0;)Lq2;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p2, Lq2;->β:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lcw;->α()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {p1, v2, v3, p2, p3}, Lkn0;->θ(JLq2;F)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p0, p2, Lq2;->γ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Landroid/graphics/Shader;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, v1}, Lq2;->ζ(Landroid/graphics/Shader;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    int-to-long p0, p0

    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    shl-long/2addr p0, v2

    .line 37
    sget-wide v2, Lci;->β:J

    .line 38
    .line 39
    invoke-static {p0, p1, v2, v3}, Lci;->γ(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    invoke-virtual {p2, v2, v3}, Lq2;->ε(J)V

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    int-to-float p0, p0

    .line 53
    const/high16 p1, 0x437f0000    # 255.0f

    .line 54
    .line 55
    div-float/2addr p0, p1

    .line 56
    cmpg-float p0, p0, p3

    .line 57
    .line 58
    if-nez p0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {p2, p3}, Lq2;->γ(F)V

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-object p0, p2, Lq2;->δ:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Lga;

    .line 67
    .line 68
    invoke-static {p0, p4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_5

    .line 73
    .line 74
    iput-object p4, p2, Lq2;->δ:Ljava/lang/Object;

    .line 75
    .line 76
    if-eqz p4, :cond_4

    .line 77
    .line 78
    iget-object v1, p4, Lga;->α:Landroid/graphics/BlendModeColorFilter;

    .line 79
    .line 80
    :cond_4
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 81
    .line 82
    .line 83
    :cond_5
    iget p0, p2, Lq2;->α:I

    .line 84
    .line 85
    if-ne p0, p5, :cond_6

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_6
    invoke-virtual {p2, p5}, Lq2;->δ(I)V

    .line 89
    .line 90
    .line 91
    :goto_1
    invoke-virtual {v0}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-ne p0, p6, :cond_7

    .line 96
    .line 97
    return-object p2

    .line 98
    :cond_7
    const/4 p0, 0x1

    .line 99
    if-nez p6, :cond_8

    .line 100
    .line 101
    move p1, p0

    .line 102
    goto :goto_2

    .line 103
    :cond_8
    const/4 p1, 0x0

    .line 104
    :goto_2
    xor-int/2addr p0, p1

    .line 105
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 106
    .line 107
    .line 108
    return-object p2
.end method

.method public final ζ(Lkn0;)Lq2;
    .locals 7

    .line 1
    sget-object v0, Lt30;->π:Lt30;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lfe;->η:Lq2;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lpd2;->α()Lq2;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, v1}, Lq2;->η(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lfe;->η:Lq2;

    .line 22
    .line 23
    :cond_0
    return-object p1

    .line 24
    :cond_1
    instance-of v0, p1, Ly02;

    .line 25
    .line 26
    if-eqz v0, :cond_f

    .line 27
    .line 28
    iget-object v0, p0, Lfe;->θ:Lq2;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-static {}, Lpd2;->α()Lq2;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, v2}, Lq2;->η(I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lfe;->θ:Lq2;

    .line 41
    .line 42
    :cond_2
    iget-object p0, v0, Lq2;->β:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Landroid/graphics/Paint;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    check-cast p1, Ly02;

    .line 51
    .line 52
    iget p1, p1, Ly02;->π:F

    .line 53
    .line 54
    cmpg-float v3, v3, p1

    .line 55
    .line 56
    if-nez v3, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeCap()Landroid/graphics/Paint$Cap;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const/4 v3, -0x1

    .line 67
    if-nez p1, :cond_4

    .line 68
    .line 69
    move p1, v3

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    sget-object v4, Lr2;->α:[I

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    aget p1, v4, p1

    .line 78
    .line 79
    :goto_1
    const/4 v4, 0x3

    .line 80
    const/4 v5, 0x2

    .line 81
    if-eq p1, v2, :cond_7

    .line 82
    .line 83
    if-eq p1, v5, :cond_6

    .line 84
    .line 85
    if-eq p1, v4, :cond_5

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    move p1, v5

    .line 89
    goto :goto_3

    .line 90
    :cond_6
    move p1, v2

    .line 91
    goto :goto_3

    .line 92
    :cond_7
    :goto_2
    move p1, v1

    .line 93
    :goto_3
    if-nez p1, :cond_8

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_8
    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 97
    .line 98
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 99
    .line 100
    .line 101
    :goto_4
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    const/high16 v6, 0x40800000    # 4.0f

    .line 106
    .line 107
    cmpg-float p1, p1, v6

    .line 108
    .line 109
    if-nez p1, :cond_9

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_9
    invoke-virtual {p0, v6}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 113
    .line 114
    .line 115
    :goto_5
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeJoin()Landroid/graphics/Paint$Join;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-nez p1, :cond_a

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_a
    sget-object v3, Lr2;->β:[I

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    aget v3, v3, p1

    .line 129
    .line 130
    :goto_6
    if-eq v3, v2, :cond_d

    .line 131
    .line 132
    if-eq v3, v5, :cond_c

    .line 133
    .line 134
    if-eq v3, v4, :cond_b

    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_b
    move v1, v2

    .line 138
    goto :goto_7

    .line 139
    :cond_c
    move v1, v5

    .line 140
    :cond_d
    :goto_7
    if-nez v1, :cond_e

    .line 141
    .line 142
    return-object v0

    .line 143
    :cond_e
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 146
    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_f
    invoke-static {}, Lγ;->κ()V

    .line 150
    .line 151
    .line 152
    const/4 p0, 0x0

    .line 153
    return-object p0
.end method

.method public final θ()F
    .locals 0

    .line 1
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 2
    .line 3
    iget-object p0, p0, Lee;->α:Lyr;

    .line 4
    .line 5
    invoke-interface {p0}, Lyr;->θ()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final ρ(Lz91;Lkn0;FLkn0;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lfe;->ε:Lee;

    .line 2
    .line 3
    iget-object v0, v0, Lee;->γ:Lde;

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v7, 0x1

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p2

    .line 9
    move v4, p3

    .line 10
    move-object v3, p4

    .line 11
    move v6, p5

    .line 12
    invoke-virtual/range {v1 .. v7}, Lfe;->δ(Lkn0;Lkn0;FLga;II)Lq2;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {v0, p1, p0}, Lde;->ε(Lz91;Lq2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
