.class public abstract Lro0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public a:Lw5;

.field public b:Lja;

.field public c:F

.field public d:Lk50;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lro0;->c:F

    .line 7
    .line 8
    sget-object v0, Lk50;->d:Lk50;

    .line 9
    .line 10
    iput-object v0, p0, Lro0;->d:Lk50;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(F)V
.end method

.method public abstract b(Lja;)V
.end method

.method public final c(Ld60;JFLja;)V
    .locals 6

    .line 1
    iget-object v0, p1, Ld60;->d:Ldd;

    .line 2
    .line 3
    iget v1, p0, Lro0;->c:F

    .line 4
    .line 5
    cmpg-float v1, v1, p4

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p4}, Lro0;->a(F)V

    .line 11
    .line 12
    .line 13
    iput p4, p0, Lro0;->c:F

    .line 14
    .line 15
    :goto_0
    iget-object v1, p0, Lro0;->b:Lja;

    .line 16
    .line 17
    invoke-static {v1, p5}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p5}, Lro0;->b(Lja;)V

    .line 24
    .line 25
    .line 26
    iput-object p5, p0, Lro0;->b:Lja;

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, Ld60;->getLayoutDirection()Lk50;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    iget-object v1, p0, Lro0;->d:Lk50;

    .line 33
    .line 34
    if-eq v1, p5, :cond_2

    .line 35
    .line 36
    iput-object p5, p0, Lro0;->d:Lk50;

    .line 37
    .line 38
    :cond_2
    invoke-interface {v0}, Luq;->c()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    const/16 p5, 0x20

    .line 43
    .line 44
    shr-long/2addr v1, p5

    .line 45
    long-to-int v1, v1

    .line 46
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    shr-long v2, p2, p5

    .line 51
    .line 52
    long-to-int p5, v2

    .line 53
    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    sub-float/2addr v1, v2

    .line 58
    invoke-interface {v0}, Luq;->c()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    const-wide v4, 0xffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v2, v4

    .line 68
    long-to-int v2, v2

    .line 69
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    and-long/2addr p2, v4

    .line 74
    long-to-int p2, p2

    .line 75
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    sub-float/2addr v2, p3

    .line 80
    iget-object p3, v0, Ldd;->e:Lo8;

    .line 81
    .line 82
    iget-object p3, p3, Lo8;->a:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p3, Lx1;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-virtual {p3, v3, v3, v1, v2}, Lx1;->k(FFFF)V

    .line 88
    .line 89
    .line 90
    cmpl-float p3, p4, v3

    .line 91
    .line 92
    const/high16 p4, -0x80000000

    .line 93
    .line 94
    if-lez p3, :cond_3

    .line 95
    .line 96
    :try_start_0
    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    cmpl-float p3, p3, v3

    .line 101
    .line 102
    if-lez p3, :cond_3

    .line 103
    .line 104
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    cmpl-float p2, p2, v3

    .line 109
    .line 110
    if-lez p2, :cond_3

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Lro0;->e(Ld60;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    iget-object p1, v0, Ldd;->e:Lo8;

    .line 118
    .line 119
    iget-object p1, p1, Lo8;->a:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, Lx1;

    .line 122
    .line 123
    neg-float p2, v1

    .line 124
    neg-float p3, v2

    .line 125
    invoke-virtual {p1, p4, p4, p2, p3}, Lx1;->k(FFFF)V

    .line 126
    .line 127
    .line 128
    throw p0

    .line 129
    :cond_3
    :goto_1
    iget-object p0, v0, Ldd;->e:Lo8;

    .line 130
    .line 131
    iget-object p0, p0, Lo8;->a:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, Lx1;

    .line 134
    .line 135
    neg-float p1, v1

    .line 136
    neg-float p2, v2

    .line 137
    invoke-virtual {p0, p4, p4, p1, p2}, Lx1;->k(FFFF)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public abstract d()J
.end method

.method public abstract e(Ld60;)V
.end method
