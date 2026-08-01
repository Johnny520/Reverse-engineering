.class public final Ljm;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Laj0;


# instance fields
.field public final d:Lkm;


# direct methods
.method public constructor <init>(Lkm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljm;->d:Lkm;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final A(IJJ)J
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    if-ne p1, p0, :cond_1

    .line 3
    .line 4
    const/16 p0, 0x20

    .line 5
    .line 6
    shr-long p0, p4, p0

    .line 7
    .line 8
    long-to-int p0, p0

    .line 9
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 p1, 0x0

    .line 14
    cmpg-float p0, p0, p1

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 20
    .line 21
    const-string p1, "Scroll cancelled"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0

    .line 27
    :cond_1
    :goto_0
    const-wide/16 p0, 0x0

    .line 28
    .line 29
    return-wide p0
.end method

.method public final R(JJLik;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    const/4 p1, 0x1

    .line 3
    invoke-static {p3, p4, p0, p0, p1}, Lrb1;->a(JFFI)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    new-instance p2, Lrb1;

    .line 8
    .line 9
    invoke-direct {p2, p0, p1}, Lrb1;-><init>(J)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final b0(IJ)J
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_1

    .line 3
    .line 4
    iget-object p0, p0, Ljm;->d:Lkm;

    .line 5
    .line 6
    invoke-virtual {p0}, Llo0;->l()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    float-to-double v0, p1

    .line 15
    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmpl-double p1, v0, v2

    .line 21
    .line 22
    if-lez p1, :cond_1

    .line 23
    .line 24
    const/16 p1, 0x20

    .line 25
    .line 26
    shr-long v0, p2, p1

    .line 27
    .line 28
    long-to-int v0, v0

    .line 29
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x0

    .line 38
    cmpl-float v1, v1, v2

    .line 39
    .line 40
    if-lez v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Llo0;->l()F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {p0}, Llo0;->o()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    int-to-float v3, v3

    .line 51
    mul-float/2addr v1, v3

    .line 52
    invoke-virtual {p0}, Llo0;->m()Lzn0;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget v3, v3, Lzn0;->b:I

    .line 57
    .line 58
    invoke-virtual {p0}, Llo0;->m()Lzn0;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iget v4, v4, Lzn0;->c:I

    .line 63
    .line 64
    add-int/2addr v3, v4

    .line 65
    int-to-float v3, v3

    .line 66
    invoke-virtual {p0}, Llo0;->l()F

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    neg-float v4, v4

    .line 75
    mul-float/2addr v3, v4

    .line 76
    add-float/2addr v3, v1

    .line 77
    invoke-virtual {p0}, Llo0;->l()F

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    cmpl-float v2, v4, v2

    .line 82
    .line 83
    if-lez v2, :cond_0

    .line 84
    .line 85
    move v5, v3

    .line 86
    move v3, v1

    .line 87
    move v1, v5

    .line 88
    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0, v1, v3}, Lw60;->m(FFF)F

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    neg-float v0, v0

    .line 97
    iget-object p0, p0, Llo0;->k:Lnm;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lnm;->e(F)F

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    neg-float p0, p0

    .line 104
    const-wide v0, 0xffffffffL

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    and-long/2addr p2, v0

    .line 110
    long-to-int p2, p2

    .line 111
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    int-to-long v2, p0

    .line 120
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    int-to-long p2, p0

    .line 125
    shl-long p0, v2, p1

    .line 126
    .line 127
    and-long/2addr p2, v0

    .line 128
    or-long/2addr p0, p2

    .line 129
    return-wide p0

    .line 130
    :cond_1
    const-wide/16 p0, 0x0

    .line 131
    .line 132
    return-wide p0
.end method
