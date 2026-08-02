.class public final Lkr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Leq2;


# instance fields
.field public final a:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lkr1;->a:F

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(JLd61;Le70;)Lte;
    .locals 11

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget p0, p0, Lkr1;->a:F

    .line 8
    .line 9
    invoke-interface {p4, p0}, Le70;->A(F)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/16 p3, 0x20

    .line 14
    .line 15
    shr-long p3, p1, p3

    .line 16
    .line 17
    long-to-int p3, p3

    .line 18
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const-wide p3, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr p1, p3

    .line 28
    long-to-int p1, p1

    .line 29
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const p2, 0x3fcccccd    # 1.6f

    .line 34
    .line 35
    .line 36
    const p3, 0x3faccccd    # 1.35f

    .line 37
    .line 38
    .line 39
    const/high16 p4, 0x3f800000    # 1.0f

    .line 40
    .line 41
    invoke-static {p3, p4, p2}, Lci0;->C(FFF)F

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    const/high16 v0, 0x40000000    # 2.0f

    .line 50
    .line 51
    div-float/2addr p3, v0

    .line 52
    const/4 v9, 0x0

    .line 53
    invoke-static {p0, v9, p3}, Lci0;->C(FFF)F

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {}, Laa;->a()Ly9;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object p3, v2, Ly9;->a:Landroid/graphics/Path;

    .line 62
    .line 63
    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    div-float/2addr v3, v0

    .line 68
    mul-float v0, p0, p2

    .line 69
    .line 70
    cmpl-float v4, v0, v3

    .line 71
    .line 72
    if-lez v4, :cond_0

    .line 73
    .line 74
    move v6, v3

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move v6, v0

    .line 77
    :goto_0
    sub-float/2addr p2, p4

    .line 78
    const p4, 0x3e3851ec    # 0.18f

    .line 79
    .line 80
    .line 81
    mul-float/2addr p2, p4

    .line 82
    const p4, 0x3f051eb8    # 0.52f

    .line 83
    .line 84
    .line 85
    add-float/2addr p2, p4

    .line 86
    mul-float/2addr p2, p0

    .line 87
    cmpl-float p0, p2, v6

    .line 88
    .line 89
    if-lez p0, :cond_1

    .line 90
    .line 91
    move v4, v6

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move v4, p2

    .line 94
    :goto_1
    invoke-virtual {p3, v6, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 95
    .line 96
    .line 97
    sub-float p0, v1, v6

    .line 98
    .line 99
    invoke-virtual {v2, p0, v9}, Ly9;->e(FF)V

    .line 100
    .line 101
    .line 102
    sub-float v3, v1, v4

    .line 103
    .line 104
    move-object v0, v2

    .line 105
    const/4 v2, 0x0

    .line 106
    move v5, v1

    .line 107
    move v10, v3

    .line 108
    move v3, v1

    .line 109
    move v1, v10

    .line 110
    invoke-virtual/range {v0 .. v6}, Ly9;->c(FFFFFF)V

    .line 111
    .line 112
    .line 113
    move p2, v3

    .line 114
    move v3, v1

    .line 115
    move v1, p2

    .line 116
    move p4, v4

    .line 117
    move p2, v6

    .line 118
    sub-float v8, p1, p2

    .line 119
    .line 120
    invoke-virtual {v0, v1, v8}, Ly9;->e(FF)V

    .line 121
    .line 122
    .line 123
    sub-float v2, p1, p4

    .line 124
    .line 125
    move v6, p1

    .line 126
    move v5, p0

    .line 127
    move v4, p1

    .line 128
    invoke-virtual/range {v0 .. v6}, Ly9;->c(FFFFFF)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, p2, v4}, Ly9;->e(FF)V

    .line 132
    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    const/4 v7, 0x0

    .line 136
    move v3, p4

    .line 137
    move v6, v2

    .line 138
    move-object v2, v0

    .line 139
    invoke-virtual/range {v2 .. v8}, Ly9;->c(FFFFFF)V

    .line 140
    .line 141
    .line 142
    move v4, v3

    .line 143
    invoke-virtual {v0, v9, p2}, Ly9;->e(FF)V

    .line 144
    .line 145
    .line 146
    const/4 v6, 0x0

    .line 147
    const/4 v8, 0x0

    .line 148
    const/4 v3, 0x0

    .line 149
    move v5, v4

    .line 150
    move v7, p2

    .line 151
    invoke-virtual/range {v2 .. v8}, Ly9;->c(FFFFFF)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p3}, Landroid/graphics/Path;->close()V

    .line 155
    .line 156
    .line 157
    new-instance p0, Lsv1;

    .line 158
    .line 159
    invoke-direct {p0, v0}, Lsv1;-><init>(Ly9;)V

    .line 160
    .line 161
    .line 162
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lkr1;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lkr1;

    .line 10
    .line 11
    iget p0, p0, Lkr1;->a:F

    .line 12
    .line 13
    iget p1, p1, Lkr1;->a:F

    .line 14
    .line 15
    invoke-static {p0, p1}, Lza0;->b(FF)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    const p0, 0x3faccccd    # 1.35f

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p0}, Ljava/lang/Float;->compare(FF)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    :goto_0
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget p0, p0, Lkr1;->a:F

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    const v0, 0x3faccccd    # 1.35f

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    add-int/2addr v0, p0

    .line 17
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget p0, p0, Lkr1;->a:F

    .line 2
    .line 3
    invoke-static {p0}, Lza0;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "NukeSquircleShape(radius="

    .line 8
    .line 9
    const-string v1, ", smoothness=1.35)"

    .line 10
    .line 11
    invoke-static {v0, p0, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
