.class public Lg1/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lg1/c;

.field public final b:Lg1/c;

.field public final c:Lg1/c;

.field public final d:[F


# direct methods
.method public constructor <init>(Lg1/c;Lg1/c;I)V
    .locals 8

    .line 1
    iget-wide v0, p1, Lg1/c;->b:J

    .line 2
    .line 3
    sget-wide v2, Lg1/b;->a:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Lg1/b;->a(JJ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lg1/k;->a(Lg1/c;)Lg1/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, p1

    .line 17
    :goto_0
    iget-wide v4, p2, Lg1/c;->b:J

    .line 18
    .line 19
    invoke-static {v4, v5, v2, v3}, Lg1/b;->a(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-static {p2}, Lg1/k;->a(Lg1/c;)Lg1/c;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v1, p2

    .line 31
    :goto_1
    const/4 v4, 0x3

    .line 32
    if-ne p3, v4, :cond_7

    .line 33
    .line 34
    iget-wide v5, p1, Lg1/c;->b:J

    .line 35
    .line 36
    invoke-static {v5, v6, v2, v3}, Lg1/b;->a(JJ)Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    iget-wide v5, p2, Lg1/c;->b:J

    .line 41
    .line 42
    invoke-static {v5, v6, v2, v3}, Lg1/b;->a(JJ)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz p3, :cond_2

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_2
    if-nez p3, :cond_3

    .line 52
    .line 53
    if-eqz v2, :cond_7

    .line 54
    .line 55
    :cond_3
    if-eqz p3, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    move-object p1, p2

    .line 59
    :goto_2
    check-cast p1, Lg1/r;

    .line 60
    .line 61
    iget-object p1, p1, Lg1/r;->d:Lg1/t;

    .line 62
    .line 63
    sget-object v3, Lg1/k;->e:[F

    .line 64
    .line 65
    if-eqz p3, :cond_5

    .line 66
    .line 67
    invoke-virtual {p1}, Lg1/t;->a()[F

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    goto :goto_3

    .line 72
    :cond_5
    move-object p3, v3

    .line 73
    :goto_3
    if-eqz v2, :cond_6

    .line 74
    .line 75
    invoke-virtual {p1}, Lg1/t;->a()[F

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    :cond_6
    const/4 p1, 0x0

    .line 80
    aget v2, p3, p1

    .line 81
    .line 82
    aget v5, v3, p1

    .line 83
    .line 84
    div-float/2addr v2, v5

    .line 85
    const/4 v5, 0x1

    .line 86
    aget v6, p3, v5

    .line 87
    .line 88
    aget v7, v3, v5

    .line 89
    .line 90
    div-float/2addr v6, v7

    .line 91
    const/4 v7, 0x2

    .line 92
    aget p3, p3, v7

    .line 93
    .line 94
    aget v3, v3, v7

    .line 95
    .line 96
    div-float/2addr p3, v3

    .line 97
    new-array v3, v4, [F

    .line 98
    .line 99
    aput v2, v3, p1

    .line 100
    .line 101
    aput v6, v3, v5

    .line 102
    .line 103
    aput p3, v3, v7

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_7
    :goto_4
    const/4 v3, 0x0

    .line 107
    :goto_5
    invoke-direct {p0, p2, v0, v1, v3}, Lg1/h;-><init>(Lg1/c;Lg1/c;Lg1/c;[F)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public constructor <init>(Lg1/c;Lg1/c;Lg1/c;[F)V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p1, p0, Lg1/h;->a:Lg1/c;

    .line 113
    iput-object p2, p0, Lg1/h;->b:Lg1/c;

    .line 114
    iput-object p3, p0, Lg1/h;->c:Lg1/c;

    .line 115
    iput-object p4, p0, Lg1/h;->d:[F

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 9

    .line 1
    invoke-static {p1, p2}, Lf1/w;->h(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2}, Lf1/w;->g(J)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1, p2}, Lf1/w;->e(J)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p1, p2}, Lf1/w;->d(J)F

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-object p1, p0, Lg1/h;->b:Lg1/c;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1, v2}, Lg1/c;->d(FFF)J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    const/16 p2, 0x20

    .line 24
    .line 25
    shr-long v5, v3, p2

    .line 26
    .line 27
    long-to-int p2, v5

    .line 28
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    const-wide v5, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v3, v5

    .line 38
    long-to-int v3, v3

    .line 39
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-virtual {p1, v0, v1, v2}, Lg1/c;->e(FFF)F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-object v0, p0, Lg1/h;->d:[F

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    aget v1, v0, v1

    .line 53
    .line 54
    mul-float/2addr p2, v1

    .line 55
    const/4 v1, 0x1

    .line 56
    aget v1, v0, v1

    .line 57
    .line 58
    mul-float/2addr v3, v1

    .line 59
    const/4 v1, 0x2

    .line 60
    aget v0, v0, v1

    .line 61
    .line 62
    mul-float/2addr p1, v0

    .line 63
    :cond_0
    move v6, p1

    .line 64
    move v4, p2

    .line 65
    move v5, v3

    .line 66
    iget-object v3, p0, Lg1/h;->c:Lg1/c;

    .line 67
    .line 68
    iget-object v8, p0, Lg1/h;->a:Lg1/c;

    .line 69
    .line 70
    invoke-virtual/range {v3 .. v8}, Lg1/c;->f(FFFFLg1/c;)J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    return-wide p1
.end method
