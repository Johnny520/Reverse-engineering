.class public final Lwh/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final synthetic a:[F

.field public final synthetic b:[F

.field public final synthetic c:Lgg/q;

.field public final synthetic d:Lgg/r;

.field public final synthetic e:Lgg/r;

.field public final synthetic f:Lgg/r;

.field public final synthetic g:Lgg/r;

.field public final synthetic h:Li0/a1;


# direct methods
.method public constructor <init>([F[FLgg/q;Lgg/r;Lgg/r;Lgg/r;Lgg/r;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwh/d;->a:[F

    .line 5
    .line 6
    iput-object p2, p0, Lwh/d;->b:[F

    .line 7
    .line 8
    iput-object p3, p0, Lwh/d;->c:Lgg/q;

    .line 9
    .line 10
    iput-object p4, p0, Lwh/d;->d:Lgg/r;

    .line 11
    .line 12
    iput-object p5, p0, Lwh/d;->e:Lgg/r;

    .line 13
    .line 14
    iput-object p6, p0, Lwh/d;->f:Lgg/r;

    .line 15
    .line 16
    iput-object p7, p0, Lwh/d;->g:Lgg/r;

    .line 17
    .line 18
    iput-object p8, p0, Lwh/d;->h:Li0/a1;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 5
    .line 6
    iget-object v0, p0, Lwh/d;->a:[F

    .line 7
    .line 8
    invoke-static {v0, p1}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lwh/d;->b:[F

    .line 12
    .line 13
    invoke-static {v0, p1}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x6

    .line 17
    aget v1, v0, v1

    .line 18
    .line 19
    neg-float v1, v1

    .line 20
    const/4 v2, 0x7

    .line 21
    aget v0, v0, v2

    .line 22
    .line 23
    neg-float v0, v0

    .line 24
    iget-object v2, p0, Lwh/d;->c:Lgg/q;

    .line 25
    .line 26
    iget-boolean v3, v2, Lgg/q;->g:Z

    .line 27
    .line 28
    const/4 v4, 0x2

    .line 29
    iget-object v5, p0, Lwh/d;->g:Lgg/r;

    .line 30
    .line 31
    iget-object v6, p0, Lwh/d;->f:Lgg/r;

    .line 32
    .line 33
    iget-object v7, p0, Lwh/d;->e:Lgg/r;

    .line 34
    .line 35
    const/4 v8, 0x1

    .line 36
    iget-object v9, p0, Lwh/d;->d:Lgg/r;

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    aget v3, p1, v8

    .line 41
    .line 42
    iput v3, v9, Lgg/r;->g:F

    .line 43
    .line 44
    aget p1, p1, v4

    .line 45
    .line 46
    iput p1, v7, Lgg/r;->g:F

    .line 47
    .line 48
    iput v1, v6, Lgg/r;->g:F

    .line 49
    .line 50
    iput v0, v5, Lgg/r;->g:F

    .line 51
    .line 52
    iput-boolean v8, v2, Lgg/q;->g:Z

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget v2, v9, Lgg/r;->g:F

    .line 56
    .line 57
    aget v3, p1, v8

    .line 58
    .line 59
    sub-float/2addr v3, v2

    .line 60
    const v8, 0x3e19999a    # 0.15f

    .line 61
    .line 62
    .line 63
    mul-float/2addr v3, v8

    .line 64
    add-float/2addr v3, v2

    .line 65
    iput v3, v9, Lgg/r;->g:F

    .line 66
    .line 67
    iget v2, v7, Lgg/r;->g:F

    .line 68
    .line 69
    aget p1, p1, v4

    .line 70
    .line 71
    sub-float/2addr p1, v2

    .line 72
    mul-float/2addr p1, v8

    .line 73
    add-float/2addr p1, v2

    .line 74
    iput p1, v7, Lgg/r;->g:F

    .line 75
    .line 76
    iget p1, v6, Lgg/r;->g:F

    .line 77
    .line 78
    sub-float/2addr v1, p1

    .line 79
    mul-float/2addr v1, v8

    .line 80
    add-float/2addr v1, p1

    .line 81
    iput v1, v6, Lgg/r;->g:F

    .line 82
    .line 83
    iget p1, v5, Lgg/r;->g:F

    .line 84
    .line 85
    sub-float/2addr v0, p1

    .line 86
    mul-float/2addr v0, v8

    .line 87
    add-float/2addr v0, p1

    .line 88
    iput v0, v5, Lgg/r;->g:F

    .line 89
    .line 90
    :goto_0
    new-instance p1, Lwh/a;

    .line 91
    .line 92
    iget v0, v9, Lgg/r;->g:F

    .line 93
    .line 94
    iget v1, v7, Lgg/r;->g:F

    .line 95
    .line 96
    iget v2, v6, Lgg/r;->g:F

    .line 97
    .line 98
    iget v3, v5, Lgg/r;->g:F

    .line 99
    .line 100
    invoke-direct {p1, v0, v1, v2, v3}, Lwh/a;-><init>(FFFF)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lwh/d;->h:Li0/a1;

    .line 104
    .line 105
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method
