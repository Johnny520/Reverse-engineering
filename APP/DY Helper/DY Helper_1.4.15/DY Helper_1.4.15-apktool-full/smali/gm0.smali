.class public final Lgm0;
.super Lq31;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final Ω:Lq2;


# instance fields
.field public final Χ:Lq22;

.field public Ψ:Lfm0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lpd2;->α()Lq2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-wide v1, Lci;->δ:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lq2;->ε(J)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lq2;->β:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Paint;

    .line 13
    .line 14
    const/high16 v2, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Lq2;->η(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lgm0;->Ω:Lq2;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lyp0;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lq31;-><init>(Lyp0;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lq22;

    .line 5
    .line 6
    invoke-direct {v0}, Lq01;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, v0, Lq01;->θ:I

    .line 11
    .line 12
    iput-object v0, p0, Lgm0;->Χ:Lq22;

    .line 13
    .line 14
    iput-object p0, v0, Lq01;->μ:Lq31;

    .line 15
    .line 16
    iget-object p1, p1, Lyp0;->μ:Lyp0;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance p1, Lfm0;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Lfw0;-><init>(Lq31;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    iput-object p1, p0, Lgm0;->Ψ:Lfm0;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final ζ(J)Lch1;
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lch1;->х(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lq31;->σ:Lyp0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lyp0;->ψ()Lk21;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, v1, Lk21;->ε:[Ljava/lang/Object;

    .line 11
    .line 12
    iget v1, v1, Lk21;->η:I

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v1, :cond_0

    .line 16
    .line 17
    aget-object v4, v2, v3

    .line 18
    .line 19
    check-cast v4, Lyp0;

    .line 20
    .line 21
    iget-object v4, v4, Lyp0;->Λ:Lbq0;

    .line 22
    .line 23
    iget-object v4, v4, Lbq0;->π:Lox0;

    .line 24
    .line 25
    sget-object v5, Lwp0;->η:Lwp0;

    .line 26
    .line 27
    iput-object v5, v4, Lox0;->π:Lwp0;

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v1, v0, Lyp0;->Β:Lpx0;

    .line 33
    .line 34
    iget-object v0, v0, Lyp0;->Λ:Lbq0;

    .line 35
    .line 36
    iget-object v0, v0, Lbq0;->π:Lox0;

    .line 37
    .line 38
    invoke-virtual {v0}, Lox0;->ц()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v1, p0, v0, p1, p2}, Lpx0;->ε(Lrx0;Ljava/util/List;J)Lqx0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Lq31;->ｍ(Lqx0;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lq31;->ｄ()V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public final Р()V
    .locals 1

    .line 1
    iget-object v0, p0, Lgm0;->Ψ:Lfm0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lfm0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lfw0;-><init>(Lq31;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lgm0;->Ψ:Lfm0;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final У()Lfw0;
    .locals 0

    .line 1
    iget-object p0, p0, Lgm0;->Ψ:Lfm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Х()Lq01;
    .locals 0

    .line 1
    iget-object p0, p0, Lgm0;->Χ:Lq22;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Ю(Lm31;JLne0;IZ)V
    .locals 11

    .line 1
    iget-object v0, p0, Lq31;->σ:Lyp0;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lm31;->θ(Lyp0;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p2, p3}, Lq31;->ｒ(J)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move/from16 v9, p5

    .line 18
    .line 19
    move/from16 v10, p6

    .line 20
    .line 21
    :goto_0
    move v3, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move/from16 v9, p5

    .line 24
    .line 25
    if-ne v9, v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lq31;->Ф()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    invoke-virtual {p0, p2, p3, v4, v5}, Lq31;->Н(JJ)F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const v1, 0x7fffffff

    .line 40
    .line 41
    .line 42
    and-int/2addr p0, v1

    .line 43
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 44
    .line 45
    if-ge p0, v1, :cond_2

    .line 46
    .line 47
    move v10, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move/from16 v9, p5

    .line 50
    .line 51
    :cond_2
    move/from16 v10, p6

    .line 52
    .line 53
    :goto_1
    if-eqz v3, :cond_5

    .line 54
    .line 55
    iget p0, p4, Lne0;->η:I

    .line 56
    .line 57
    invoke-virtual {v0}, Lyp0;->φ()Lk21;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, v0, Lk21;->ε:[Ljava/lang/Object;

    .line 62
    .line 63
    iget v0, v0, Lk21;->η:I

    .line 64
    .line 65
    sub-int/2addr v0, v2

    .line 66
    :goto_2
    if-ltz v0, :cond_4

    .line 67
    .line 68
    aget-object v2, v1, v0

    .line 69
    .line 70
    move-object v5, v2

    .line 71
    check-cast v5, Lyp0;

    .line 72
    .line 73
    invoke-virtual {v5}, Lyp0;->Θ()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    move-object v4, p1

    .line 80
    move-wide v6, p2

    .line 81
    move-object v8, p4

    .line 82
    invoke-interface/range {v4 .. v10}, Lm31;->δ(Lyp0;JLne0;IZ)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4}, Lne0;->α()J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    invoke-static {v2, v3}, Lxb;->Γ(J)F

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    const/4 v7, 0x0

    .line 94
    cmpg-float v6, v6, v7

    .line 95
    .line 96
    if-gez v6, :cond_3

    .line 97
    .line 98
    invoke-static {v2, v3}, Lxb;->Μ(J)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_3

    .line 103
    .line 104
    invoke-static {v2, v3}, Lxb;->Λ(J)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_3

    .line 109
    .line 110
    invoke-interface {p1, p4, v5}, Lm31;->ζ(Lne0;Lyp0;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 117
    .line 118
    move/from16 v9, p5

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iput p0, p4, Lne0;->η:I

    .line 122
    .line 123
    :cond_5
    return-void
.end method

.method public final у(JFLa80;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lq31;->ｊ(JFLa80;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Ldw0;->ν:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 10
    .line 11
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 12
    .line 13
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 14
    .line 15
    invoke-virtual {p0}, Lox0;->щ()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final ч(Lre0;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lgm0;->Ψ:Lfm0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lfm0;->ч(Lre0;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 11
    .line 12
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 13
    .line 14
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 15
    .line 16
    iget-object v0, p0, Lox0;->κ:Lbq0;

    .line 17
    .line 18
    iget-object v0, v0, Lbq0;->δ:Lup0;

    .line 19
    .line 20
    iget-object v1, p0, Lox0;->Β:Lzp0;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    sget-object v3, Lup0;->ε:Lup0;

    .line 24
    .line 25
    if-ne v0, v3, :cond_1

    .line 26
    .line 27
    iput-boolean v2, v1, Lzp0;->δ:Z

    .line 28
    .line 29
    iget-boolean v0, v1, Lzp0;->β:Z

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iput-boolean v2, p0, Lox0;->ω:Z

    .line 34
    .line 35
    iput-boolean v2, p0, Lox0;->Α:Z

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iput-boolean v2, v1, Lzp0;->ε:Z

    .line 39
    .line 40
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lox0;->Ζ()Lgm0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-boolean v3, v0, Ldw0;->ξ:Z

    .line 45
    .line 46
    iput-boolean v2, v0, Ldw0;->ξ:Z

    .line 47
    .line 48
    invoke-virtual {p0}, Lox0;->Υ()V

    .line 49
    .line 50
    .line 51
    iput-boolean v3, v0, Ldw0;->ξ:Z

    .line 52
    .line 53
    iget-object p0, v1, Lzp0;->η:Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0

    .line 68
    :cond_3
    const/high16 p0, -0x80000000

    .line 69
    .line 70
    return p0
.end method

.method public final ｉ(Lde;Lwa0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lq31;->σ:Lyp0;

    .line 2
    .line 3
    invoke-static {v0}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Lyp0;->φ()Lk21;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, v0, Lk21;->ε:[Ljava/lang/Object;

    .line 12
    .line 13
    iget v0, v0, Lk21;->η:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v0, :cond_1

    .line 17
    .line 18
    aget-object v4, v2, v3

    .line 19
    .line 20
    check-cast v4, Lyp0;

    .line 21
    .line 22
    invoke-virtual {v4}, Lyp0;->Θ()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    invoke-virtual {v4, p1, p2}, Lyp0;->ι(Lde;Lwa0;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getShowLayoutBounds()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    iget-wide v0, p0, Lch1;->η:J

    .line 41
    .line 42
    const/16 p0, 0x20

    .line 43
    .line 44
    shr-long v2, v0, p0

    .line 45
    .line 46
    long-to-int p0, v2

    .line 47
    int-to-float p0, p0

    .line 48
    const/high16 p2, 0x3f000000    # 0.5f

    .line 49
    .line 50
    sub-float v5, p0, p2

    .line 51
    .line 52
    const-wide v2, 0xffffffffL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v0, v2

    .line 58
    long-to-int p0, v0

    .line 59
    int-to-float p0, p0

    .line 60
    sub-float v6, p0, p2

    .line 61
    .line 62
    const/high16 v3, 0x3f000000    # 0.5f

    .line 63
    .line 64
    const/high16 v4, 0x3f000000    # 0.5f

    .line 65
    .line 66
    sget-object v7, Lgm0;->Ω:Lq2;

    .line 67
    .line 68
    move-object v2, p1

    .line 69
    invoke-interface/range {v2 .. v7}, Lde;->κ(FFFFLq2;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void
.end method
