.class public final synthetic Lwb/r4;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lth/g;

.field public final synthetic h:F

.field public final synthetic i:F

.field public final synthetic j:[F

.field public final synthetic k:F

.field public final synthetic l:F

.field public final synthetic m:Z

.field public final synthetic n:Z

.field public final synthetic o:F


# direct methods
.method public synthetic constructor <init>(Lth/g;FF[FFFZZF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/r4;->g:Lth/g;

    .line 5
    .line 6
    iput p2, p0, Lwb/r4;->h:F

    .line 7
    .line 8
    iput p3, p0, Lwb/r4;->i:F

    .line 9
    .line 10
    iput-object p4, p0, Lwb/r4;->j:[F

    .line 11
    .line 12
    iput p5, p0, Lwb/r4;->k:F

    .line 13
    .line 14
    iput p6, p0, Lwb/r4;->l:F

    .line 15
    .line 16
    iput-boolean p7, p0, Lwb/r4;->m:Z

    .line 17
    .line 18
    iput-boolean p8, p0, Lwb/r4;->n:Z

    .line 19
    .line 20
    iput p9, p0, Lwb/r4;->o:F

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lai/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/r4;->g:Lth/g;

    .line 7
    .line 8
    iget-wide v1, v0, Lth/g;->i:J

    .line 9
    .line 10
    const/16 v3, 0x20

    .line 11
    .line 12
    shr-long/2addr v1, v3

    .line 13
    long-to-int v1, v1

    .line 14
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget v2, p0, Lwb/r4;->h:F

    .line 19
    .line 20
    div-float/2addr v1, v2

    .line 21
    iget-wide v3, v0, Lth/g;->i:J

    .line 22
    .line 23
    const-wide v5, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v3, v5

    .line 29
    long-to-int v0, v3

    .line 30
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    div-float/2addr v0, v2

    .line 35
    iget-object v3, p1, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 36
    .line 37
    const-string v4, "size"

    .line 38
    .line 39
    invoke-static {v3, v4, v1, v0}, Lai/a;->t(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 40
    .line 41
    .line 42
    iget v0, p0, Lwb/r4;->i:F

    .line 43
    .line 44
    neg-float v0, v0

    .line 45
    iget-object v1, p1, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 46
    .line 47
    const-string v3, "offset"

    .line 48
    .line 49
    invoke-static {v1, v3, v0, v0}, Lai/a;->t(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lwb/r4;->j:[F

    .line 53
    .line 54
    array-length v1, v0

    .line 55
    new-array v3, v1, [F

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    :goto_0
    if-ge v4, v1, :cond_0

    .line 59
    .line 60
    aget v5, v0, v4

    .line 61
    .line 62
    div-float/2addr v5, v2

    .line 63
    aput v5, v3, v4

    .line 64
    .line 65
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v0, p1, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 69
    .line 70
    const-string v1, "cornerRadii"

    .line 71
    .line 72
    invoke-static {v0, v1, v3}, Lai/a;->w(Landroid/graphics/RuntimeShader;Ljava/lang/String;[F)V

    .line 73
    .line 74
    .line 75
    iget v0, p0, Lwb/r4;->k:F

    .line 76
    .line 77
    div-float/2addr v0, v2

    .line 78
    iget-object v1, p1, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 79
    .line 80
    const-string v3, "refractionHeight"

    .line 81
    .line 82
    invoke-static {v1, v3, v0}, Lai/a;->s(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 83
    .line 84
    .line 85
    iget v0, p0, Lwb/r4;->l:F

    .line 86
    .line 87
    neg-float v0, v0

    .line 88
    div-float/2addr v0, v2

    .line 89
    iget-object v1, p1, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 90
    .line 91
    const-string v2, "refractionAmount"

    .line 92
    .line 93
    invoke-static {v1, v2, v0}, Lai/a;->s(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 94
    .line 95
    .line 96
    iget-boolean v0, p0, Lwb/r4;->m:Z

    .line 97
    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    const/high16 v0, 0x3f800000    # 1.0f

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    const/4 v0, 0x0

    .line 104
    :goto_1
    iget-object v1, p1, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 105
    .line 106
    const-string v2, "depthEffect"

    .line 107
    .line 108
    invoke-static {v1, v2, v0}, Lai/a;->s(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 109
    .line 110
    .line 111
    iget-boolean v0, p0, Lwb/r4;->n:Z

    .line 112
    .line 113
    if-eqz v0, :cond_2

    .line 114
    .line 115
    const-string v0, "chromaticAberration"

    .line 116
    .line 117
    iget-object p1, p1, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 118
    .line 119
    iget v1, p0, Lwb/r4;->o:F

    .line 120
    .line 121
    invoke-static {p1, v0, v1}, Lai/a;->s(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 122
    .line 123
    .line 124
    :cond_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1
.end method
