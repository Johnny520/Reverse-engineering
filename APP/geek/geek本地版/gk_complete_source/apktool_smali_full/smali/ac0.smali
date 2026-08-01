.class public final Lac0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lgc0;

.field public final synthetic b:Lwc0;

.field public final synthetic c:Lwc0;

.field public final synthetic d:I

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public constructor <init>(Lgc0;Lwc0;Lwc0;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lac0;->a:Lgc0;

    .line 5
    .line 6
    iput-object p2, p0, Lac0;->b:Lwc0;

    .line 7
    .line 8
    iput-object p3, p0, Lac0;->c:Lwc0;

    .line 9
    .line 10
    iput p4, p0, Lac0;->d:I

    .line 11
    .line 12
    iput-object p5, p0, Lac0;->e:Landroid/view/View;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lac0;->a:Lgc0;

    .line 6
    .line 7
    iget-object v1, v0, Lgc0;->a:Lfc0;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lfc0;->d(F)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lac0;->b:Lwc0;

    .line 13
    .line 14
    iget-object v2, p1, Lwc0;->a:Ltc0;

    .line 15
    .line 16
    invoke-virtual {v1}, Lfc0;->b()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v4, 0x1e

    .line 23
    .line 24
    if-lt v3, v4, :cond_0

    .line 25
    .line 26
    new-instance v3, Llc0;

    .line 27
    .line 28
    invoke-direct {v3, p1}, Llc0;-><init>(Lwc0;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v4, 0x1d

    .line 33
    .line 34
    if-lt v3, v4, :cond_1

    .line 35
    .line 36
    new-instance v3, Lkc0;

    .line 37
    .line 38
    invoke-direct {v3, p1}, Lkc0;-><init>(Lwc0;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    new-instance v3, Lic0;

    .line 43
    .line 44
    invoke-direct {v3, p1}, Lic0;-><init>(Lwc0;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    const/4 p1, 0x1

    .line 48
    :goto_1
    const/16 v4, 0x100

    .line 49
    .line 50
    if-gt p1, v4, :cond_3

    .line 51
    .line 52
    iget v4, p0, Lac0;->d:I

    .line 53
    .line 54
    and-int/2addr v4, p1

    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    invoke-virtual {v2, p1}, Ltc0;->f(I)Lep;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v3, p1, v4}, Lmc0;->c(ILep;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v2, p1}, Ltc0;->f(I)Lep;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    iget-object v5, p0, Lac0;->c:Lwc0;

    .line 70
    .line 71
    iget-object v5, v5, Lwc0;->a:Ltc0;

    .line 72
    .line 73
    invoke-virtual {v5, p1}, Ltc0;->f(I)Lep;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget v6, v4, Lep;->a:I

    .line 78
    .line 79
    iget v7, v5, Lep;->a:I

    .line 80
    .line 81
    sub-int/2addr v6, v7

    .line 82
    int-to-float v6, v6

    .line 83
    const/high16 v7, 0x3f800000    # 1.0f

    .line 84
    .line 85
    sub-float/2addr v7, v1

    .line 86
    mul-float/2addr v6, v7

    .line 87
    float-to-double v8, v6

    .line 88
    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    .line 89
    .line 90
    add-double/2addr v8, v10

    .line 91
    double-to-int v6, v8

    .line 92
    iget v8, v4, Lep;->b:I

    .line 93
    .line 94
    iget v9, v5, Lep;->b:I

    .line 95
    .line 96
    sub-int/2addr v8, v9

    .line 97
    int-to-float v8, v8

    .line 98
    mul-float/2addr v8, v7

    .line 99
    float-to-double v8, v8

    .line 100
    add-double/2addr v8, v10

    .line 101
    double-to-int v8, v8

    .line 102
    iget v9, v4, Lep;->c:I

    .line 103
    .line 104
    iget v12, v5, Lep;->c:I

    .line 105
    .line 106
    sub-int/2addr v9, v12

    .line 107
    int-to-float v9, v9

    .line 108
    mul-float/2addr v9, v7

    .line 109
    float-to-double v12, v9

    .line 110
    add-double/2addr v12, v10

    .line 111
    double-to-int v9, v12

    .line 112
    iget v12, v4, Lep;->d:I

    .line 113
    .line 114
    iget v5, v5, Lep;->d:I

    .line 115
    .line 116
    sub-int/2addr v12, v5

    .line 117
    int-to-float v5, v12

    .line 118
    mul-float/2addr v5, v7

    .line 119
    float-to-double v12, v5

    .line 120
    add-double/2addr v12, v10

    .line 121
    double-to-int v5, v12

    .line 122
    invoke-static {v4, v6, v8, v9, v5}, Lwc0;->e(Lep;IIII)Lep;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v3, p1, v4}, Lmc0;->c(ILep;)V

    .line 127
    .line 128
    .line 129
    :goto_2
    shl-int/lit8 p1, p1, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    invoke-virtual {v3}, Lmc0;->b()Lwc0;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v1, p0, Lac0;->e:Landroid/view/View;

    .line 141
    .line 142
    invoke-static {v1, p1, v0}, Lcc0;->g(Landroid/view/View;Lwc0;Ljava/util/List;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method
