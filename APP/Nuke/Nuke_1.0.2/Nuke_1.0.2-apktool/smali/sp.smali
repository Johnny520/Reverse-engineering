.class public final Lsp;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnc0;


# instance fields
.field public final h:Lrp;

.field public final i:Lb5;

.field public j:Lq9;

.field public k:Lq9;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lrp;

    .line 5
    .line 6
    sget-object v1, Lpp0;->c:Lh70;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Lrp;->a:Le70;

    .line 12
    .line 13
    sget-object v1, Ld61;->h:Ld61;

    .line 14
    .line 15
    iput-object v1, v0, Lrp;->b:Ld61;

    .line 16
    .line 17
    sget-object v1, Lyd0;->a:Lyd0;

    .line 18
    .line 19
    iput-object v1, v0, Lrp;->c:Lqp;

    .line 20
    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    iput-wide v1, v0, Lrp;->d:J

    .line 24
    .line 25
    iput-object v0, p0, Lsp;->h:Lrp;

    .line 26
    .line 27
    new-instance v0, Lb5;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lb5;-><init>(Lsp;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lsp;->i:Lb5;

    .line 33
    .line 34
    return-void
.end method

.method public static a(Lsp;JLop0;I)Lq9;
    .locals 2

    .line 1
    invoke-virtual {p0, p3}, Lsp;->f(Lop0;)Lq9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p3, p0, Lq9;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p3, Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/graphics/Paint;->getColor()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Lsp0;->b(I)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1, p1, p2}, Lju;->c(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lq9;->k(J)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lq9;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Landroid/graphics/Shader;

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lq9;->n(Landroid/graphics/Shader;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object p1, p0, Lq9;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lcl;

    .line 39
    .line 40
    invoke-static {p1, p2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0, p2}, Lq9;->l(Lcl;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget p1, p0, Lq9;->b:I

    .line 50
    .line 51
    if-ne p1, p4, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {p0, p4}, Lq9;->j(I)V

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-virtual {p3}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const/4 p2, 0x1

    .line 62
    if-ne p1, p2, :cond_4

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_4
    invoke-virtual {p0, p2}, Lq9;->m(I)V

    .line 66
    .line 67
    .line 68
    return-object p0
.end method


# virtual methods
.method public final E()Lb5;
    .locals 0

    .line 1
    iget-object p0, p0, Lsp;->i:Lb5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final G(Ly9;Lan;FLop0;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lsp;->h:Lrp;

    .line 2
    .line 3
    iget-object v0, v0, Lrp;->c:Lqp;

    .line 4
    .line 5
    const/4 v7, 0x1

    .line 6
    const/4 v5, 0x0

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
    invoke-virtual/range {v1 .. v7}, Lsp;->c(Lan;Lop0;FLcl;II)Lq9;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {v0, p1, p0}, Lqp;->h(Ly9;Lq9;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final R(Ld9;JJJFLcl;I)V
    .locals 12

    .line 1
    sget-object v2, Lxi0;->h:Lxi0;

    .line 2
    .line 3
    iget-object v0, p0, Lsp;->h:Lrp;

    .line 4
    .line 5
    iget-object v7, v0, Lrp;->c:Lqp;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v5, 0x3

    .line 9
    move-object v0, p0

    .line 10
    move/from16 v3, p8

    .line 11
    .line 12
    move-object/from16 v4, p9

    .line 13
    .line 14
    move/from16 v6, p10

    .line 15
    .line 16
    invoke-virtual/range {v0 .. v6}, Lsp;->c(Lan;Lop0;FLcl;II)Lq9;

    .line 17
    .line 18
    .line 19
    move-result-object v11

    .line 20
    move-object v4, p1

    .line 21
    move-wide v5, p2

    .line 22
    move-wide/from16 v9, p6

    .line 23
    .line 24
    move-object v3, v7

    .line 25
    move-wide/from16 v7, p4

    .line 26
    .line 27
    invoke-interface/range {v3 .. v11}, Lqp;->e(Ld9;JJJLq9;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final Y(JJJFI)V
    .locals 5

    .line 1
    iget-object v0, p0, Lsp;->h:Lrp;

    .line 2
    .line 3
    iget-object v0, v0, Lrp;->c:Lqp;

    .line 4
    .line 5
    iget-object v1, p0, Lsp;->k:Lq9;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lpp0;->i()Lq9;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, v2}, Lq9;->r(I)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lsp;->k:Lq9;

    .line 18
    .line 19
    :cond_0
    iget-object p0, v1, Lq9;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/graphics/Paint;->getColor()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v3}, Lsp0;->b(I)J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    invoke-static {v3, v4, p1, p2}, Lju;->c(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1, p1, p2}, Lq9;->k(J)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p1, v1, Lq9;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Landroid/graphics/Shader;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, p2}, Lq9;->n(Landroid/graphics/Shader;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object p1, v1, Lq9;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lcl;

    .line 53
    .line 54
    invoke-static {p1, p2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v1, p2}, Lq9;->l(Lcl;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget p1, v1, Lq9;->b:I

    .line 64
    .line 65
    const/4 p2, 0x3

    .line 66
    if-ne p1, p2, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    invoke-virtual {v1, p2}, Lq9;->j(I)V

    .line 70
    .line 71
    .line 72
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    cmpg-float p1, p1, p7

    .line 77
    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    invoke-virtual {v1, p7}, Lq9;->q(F)V

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    const/high16 p2, 0x40800000    # 4.0f

    .line 89
    .line 90
    cmpg-float p1, p1, p2

    .line 91
    .line 92
    if-nez p1, :cond_6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 96
    .line 97
    .line 98
    :goto_2
    invoke-virtual {v1}, Lq9;->f()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-ne p1, p8, :cond_7

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_7
    invoke-virtual {v1, p8}, Lq9;->o(I)V

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-virtual {v1}, Lq9;->g()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_8

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_8
    const/4 p1, 0x0

    .line 116
    invoke-virtual {v1, p1}, Lq9;->p(I)V

    .line 117
    .line 118
    .line 119
    :goto_4
    invoke-virtual {p0}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-ne p0, v2, :cond_9

    .line 124
    .line 125
    :goto_5
    move-wide p1, p3

    .line 126
    move-wide p3, p5

    .line 127
    move-object p0, v0

    .line 128
    move-object p5, v1

    .line 129
    goto :goto_6

    .line 130
    :cond_9
    invoke-virtual {v1, v2}, Lq9;->m(I)V

    .line 131
    .line 132
    .line 133
    goto :goto_5

    .line 134
    :goto_6
    invoke-interface/range {p0 .. p5}, Lqp;->m(JJLq9;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lsp;->h:Lrp;

    .line 2
    .line 3
    iget-object p0, p0, Lrp;->a:Le70;

    .line 4
    .line 5
    invoke-interface {p0}, Le70;->b()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final c(Lan;Lop0;FLcl;II)Lq9;
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Lsp;->f(Lop0;)Lq9;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p2, Lq9;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lnc0;->d()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {p1, p3, v1, v2, p2}, Lan;->a(FJLq9;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p0, p2, Lq9;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroid/graphics/Shader;

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-virtual {p2, p0}, Lq9;->n(Landroid/graphics/Shader;)V

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
    invoke-static {p0}, Lsp0;->b(I)J

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    sget-wide v1, Lju;->b:J

    .line 38
    .line 39
    invoke-static {p0, p1, v1, v2}, Lju;->c(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    invoke-virtual {p2, v1, v2}, Lq9;->k(J)V

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
    invoke-virtual {p2, p3}, Lq9;->i(F)V

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-object p0, p2, Lq9;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Lcl;

    .line 67
    .line 68
    invoke-static {p0, p4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_4

    .line 73
    .line 74
    invoke-virtual {p2, p4}, Lq9;->l(Lcl;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    iget p0, p2, Lq9;->b:I

    .line 78
    .line 79
    if-ne p0, p5, :cond_5

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    invoke-virtual {p2, p5}, Lq9;->j(I)V

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-virtual {v0}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-ne p0, p6, :cond_6

    .line 90
    .line 91
    return-object p2

    .line 92
    :cond_6
    invoke-virtual {p2, p6}, Lq9;->m(I)V

    .line 93
    .line 94
    .line 95
    return-object p2
.end method

.method public final c0(JJJLop0;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lsp;->h:Lrp;

    .line 2
    .line 3
    iget-object v0, v0, Lrp;->c:Lqp;

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
    move-wide v3, p1

    .line 11
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const-wide v5, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long p2, p3, v5

    .line 21
    .line 22
    long-to-int p2, p2

    .line 23
    move p3, p2

    .line 24
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    shr-long v1, p5, v1

    .line 33
    .line 34
    long-to-int v1, v1

    .line 35
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-float/2addr v1, p4

    .line 40
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    and-long p4, p5, v5

    .line 45
    .line 46
    long-to-int p4, p4

    .line 47
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result p4

    .line 51
    add-float/2addr p4, p3

    .line 52
    invoke-static {p0, v3, v4, p7, p8}, Lsp;->a(Lsp;JLop0;I)Lq9;

    .line 53
    .line 54
    .line 55
    move-result-object p5

    .line 56
    move-object p0, v0

    .line 57
    move p3, v1

    .line 58
    invoke-interface/range {p0 .. p5}, Lqp;->p(FFFFLq9;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final e(Ld9;Lcl;)V
    .locals 8

    .line 1
    sget-object v2, Lxi0;->h:Lxi0;

    .line 2
    .line 3
    iget-object v0, p0, Lsp;->h:Lrp;

    .line 4
    .line 5
    iget-object v7, v0, Lrp;->c:Lqp;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v6, 0x1

    .line 9
    const/high16 v3, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v5, 0x3

    .line 12
    move-object v0, p0

    .line 13
    move-object v4, p2

    .line 14
    invoke-virtual/range {v0 .. v6}, Lsp;->c(Lan;Lop0;FLcl;II)Lq9;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {v7, p1, p0}, Lqp;->a(Ld9;Lq9;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final f(Lop0;)Lq9;
    .locals 3

    .line 1
    sget-object v0, Lxi0;->h:Lxi0;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lsp;->j:Lq9;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lpp0;->i()Lq9;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Lq9;->r(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lsp;->j:Lq9;

    .line 22
    .line 23
    :cond_0
    return-object p1

    .line 24
    :cond_1
    instance-of v0, p1, Lxv2;

    .line 25
    .line 26
    if-eqz v0, :cond_7

    .line 27
    .line 28
    iget-object v0, p0, Lsp;->k:Lq9;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    invoke-static {}, Lpp0;->i()Lq9;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {v0, v1}, Lq9;->r(I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lsp;->k:Lq9;

    .line 41
    .line 42
    :cond_2
    iget-object p0, v0, Lq9;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Landroid/graphics/Paint;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    check-cast p1, Lxv2;

    .line 51
    .line 52
    iget v2, p1, Lxv2;->h:F

    .line 53
    .line 54
    cmpg-float v1, v1, v2

    .line 55
    .line 56
    if-nez v1, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {v0, v2}, Lq9;->q(F)V

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {v0}, Lq9;->f()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget v2, p1, Lxv2;->j:I

    .line 67
    .line 68
    if-ne v1, v2, :cond_4

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    invoke-virtual {v0, v2}, Lq9;->o(I)V

    .line 72
    .line 73
    .line 74
    :goto_1
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget v2, p1, Lxv2;->i:F

    .line 79
    .line 80
    cmpg-float v1, v1, v2

    .line 81
    .line 82
    if-nez v1, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    invoke-virtual {p0, v2}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 86
    .line 87
    .line 88
    :goto_2
    invoke-virtual {v0}, Lq9;->g()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    iget p1, p1, Lxv2;->k:I

    .line 93
    .line 94
    if-ne p0, p1, :cond_6

    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_6
    invoke-virtual {v0, p1}, Lq9;->p(I)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_7
    invoke-static {}, Lc80;->s()V

    .line 102
    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    return-object p0
.end method

.method public final getLayoutDirection()Ld61;
    .locals 0

    .line 1
    iget-object p0, p0, Lsp;->h:Lrp;

    .line 2
    .line 3
    iget-object p0, p0, Lrp;->b:Ld61;

    .line 4
    .line 5
    return-object p0
.end method

.method public final m()F
    .locals 0

    .line 1
    iget-object p0, p0, Lsp;->h:Lrp;

    .line 2
    .line 3
    iget-object p0, p0, Lrp;->a:Le70;

    .line 4
    .line 5
    invoke-interface {p0}, Le70;->m()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final o(JFJLop0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsp;->h:Lrp;

    .line 2
    .line 3
    iget-object v0, v0, Lrp;->c:Lqp;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-static {p0, p1, p2, p6, v1}, Lsp;->a(Lsp;JLop0;I)Lq9;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {v0, p3, p4, p5, p0}, Lqp;->d(FJLq9;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final t(Ly9;JLop0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsp;->h:Lrp;

    .line 2
    .line 3
    iget-object v0, v0, Lrp;->c:Lqp;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-static {p0, p2, p3, p4, v1}, Lsp;->a(Lsp;JLop0;I)Lq9;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {v0, p1, p0}, Lqp;->h(Ly9;Lq9;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final z(Lan;JJJFLop0;)V
    .locals 14

    .line 1
    iget-object v1, p0, Lsp;->h:Lrp;

    .line 2
    .line 3
    iget-object v7, v1, Lrp;->c:Lqp;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v2, p2, v1

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    const-wide v3, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long v5, p2, v3

    .line 20
    .line 21
    long-to-int v5, v5

    .line 22
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    shr-long v10, p4, v1

    .line 31
    .line 32
    long-to-int v6, v10

    .line 33
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    add-float v10, v6, v2

    .line 38
    .line 39
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    and-long v5, p4, v3

    .line 44
    .line 45
    long-to-int v5, v5

    .line 46
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    add-float v11, v5, v2

    .line 51
    .line 52
    shr-long v1, p6, v1

    .line 53
    .line 54
    long-to-int v1, v1

    .line 55
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    and-long v1, p6, v3

    .line 60
    .line 61
    long-to-int v1, v1

    .line 62
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v13

    .line 66
    const/4 v6, 0x1

    .line 67
    const/4 v4, 0x0

    .line 68
    const/4 v5, 0x3

    .line 69
    move-object v0, p0

    .line 70
    move-object v1, p1

    .line 71
    move/from16 v3, p8

    .line 72
    .line 73
    move-object/from16 v2, p9

    .line 74
    .line 75
    invoke-virtual/range {v0 .. v6}, Lsp;->c(Lan;Lop0;FLcl;II)Lq9;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    move-object/from16 p7, v0

    .line 80
    .line 81
    move-object p0, v7

    .line 82
    move p1, v8

    .line 83
    move/from16 p2, v9

    .line 84
    .line 85
    move/from16 p3, v10

    .line 86
    .line 87
    move/from16 p4, v11

    .line 88
    .line 89
    move/from16 p5, v12

    .line 90
    .line 91
    move/from16 p6, v13

    .line 92
    .line 93
    invoke-interface/range {p0 .. p7}, Lqp;->j(FFFFFFLq9;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final z0(JFFJJLop0;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lsp;->h:Lrp;

    .line 2
    .line 3
    iget-object v1, v0, Lrp;->c:Lqp;

    .line 4
    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    shr-long v2, p5, v0

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    move v3, v2

    .line 11
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const-wide v4, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long v6, p5, v4

    .line 21
    .line 22
    long-to-int v6, v6

    .line 23
    move v7, v3

    .line 24
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    shr-long v8, p7, v0

    .line 33
    .line 34
    long-to-int v0, v8

    .line 35
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-float/2addr v0, v7

    .line 40
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    and-long v4, p7, v4

    .line 45
    .line 46
    long-to-int v4, v4

    .line 47
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    add-float v5, v4, v6

    .line 52
    .line 53
    const/4 v4, 0x3

    .line 54
    move-object/from16 v6, p9

    .line 55
    .line 56
    invoke-static {p0, p1, p2, v6, v4}, Lsp;->a(Lsp;JLop0;I)Lq9;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    move v6, p3

    .line 61
    move v7, p4

    .line 62
    move v4, v0

    .line 63
    invoke-interface/range {v1 .. v8}, Lqp;->t(FFFFFFLq9;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
