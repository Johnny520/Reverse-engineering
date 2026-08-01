.class public final synthetic Lrt0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Lyv;

.field public final synthetic ζ:F

.field public final synthetic η:[F

.field public final synthetic θ:F

.field public final synthetic ι:F

.field public final synthetic κ:Z

.field public final synthetic λ:Z

.field public final synthetic μ:F


# direct methods
.method public synthetic constructor <init>(Lyv;F[FFFZZF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrt0;->ε:Lyv;

    .line 5
    .line 6
    iput p2, p0, Lrt0;->ζ:F

    .line 7
    .line 8
    iput-object p3, p0, Lrt0;->η:[F

    .line 9
    .line 10
    iput p4, p0, Lrt0;->θ:F

    .line 11
    .line 12
    iput p5, p0, Lrt0;->ι:F

    .line 13
    .line 14
    iput-boolean p6, p0, Lrt0;->κ:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Lrt0;->λ:Z

    .line 17
    .line 18
    iput p8, p0, Lrt0;->μ:F

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lb3;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrt0;->ε:Lyv;

    .line 7
    .line 8
    iget-wide v1, v0, Lyv;->η:J

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
    iget v2, p0, Lrt0;->ζ:F

    .line 19
    .line 20
    div-float/2addr v1, v2

    .line 21
    iget-wide v3, v0, Lyv;->η:J

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
    long-to-int v3, v3

    .line 30
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    div-float/2addr v3, v2

    .line 35
    iget-object v4, p1, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 36
    .line 37
    const-string v5, "size"

    .line 38
    .line 39
    invoke-static {v4, v5, v1, v3}, Lц;->π(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 40
    .line 41
    .line 42
    iget v0, v0, Lyv;->ι:F

    .line 43
    .line 44
    neg-float v0, v0

    .line 45
    div-float/2addr v0, v2

    .line 46
    iget-object v1, p1, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 47
    .line 48
    const-string v3, "offset"

    .line 49
    .line 50
    invoke-static {v1, v3, v0, v0}, Lц;->π(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 51
    .line 52
    .line 53
    const-string v0, "cornerRadii"

    .line 54
    .line 55
    iget-object v1, p1, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 56
    .line 57
    iget-object v3, p0, Lrt0;->η:[F

    .line 58
    .line 59
    invoke-static {v1, v0, v3}, Lц;->τ(Landroid/graphics/RuntimeShader;Ljava/lang/String;[F)V

    .line 60
    .line 61
    .line 62
    iget v0, p0, Lrt0;->θ:F

    .line 63
    .line 64
    div-float/2addr v0, v2

    .line 65
    iget-object v1, p1, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 66
    .line 67
    const-string v3, "refractionHeight"

    .line 68
    .line 69
    invoke-static {v1, v3, v0}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 70
    .line 71
    .line 72
    iget v0, p0, Lrt0;->ι:F

    .line 73
    .line 74
    neg-float v0, v0

    .line 75
    div-float/2addr v0, v2

    .line 76
    iget-object v1, p1, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 77
    .line 78
    const-string v2, "refractionAmount"

    .line 79
    .line 80
    invoke-static {v1, v2, v0}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 81
    .line 82
    .line 83
    iget-boolean v0, p0, Lrt0;->κ:Z

    .line 84
    .line 85
    if-eqz v0, :cond_0

    .line 86
    .line 87
    const/high16 v0, 0x3f800000    # 1.0f

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    const/4 v0, 0x0

    .line 91
    :goto_0
    iget-object v1, p1, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 92
    .line 93
    const-string v2, "depthEffect"

    .line 94
    .line 95
    invoke-static {v1, v2, v0}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 96
    .line 97
    .line 98
    iget-boolean v0, p0, Lrt0;->λ:Z

    .line 99
    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    const-string v0, "chromaticAberration"

    .line 103
    .line 104
    iget-object p1, p1, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 105
    .line 106
    iget p0, p0, Lrt0;->μ:F

    .line 107
    .line 108
    invoke-static {p1, v0, p0}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 109
    .line 110
    .line 111
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 112
    .line 113
    return-object p0
.end method
