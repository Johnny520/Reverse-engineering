.class public final Lap1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Leq2;


# instance fields
.field public final a:J

.field public final b:F


# direct methods
.method public constructor <init>(FJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Lap1;->a:J

    .line 5
    .line 6
    iput p1, p0, Lap1;->b:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(JLd61;Le70;)Lte;
    .locals 5

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    iget p4, p0, Lap1;->b:F

    .line 9
    .line 10
    cmpg-float p3, p4, p3

    .line 11
    .line 12
    if-gtz p3, :cond_0

    .line 13
    .line 14
    new-instance p0, Lsv1;

    .line 15
    .line 16
    invoke-static {}, Laa;->a()Ly9;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Lsv1;-><init>(Ly9;)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    iget-wide v0, p0, Lap1;->a:J

    .line 25
    .line 26
    const/16 p0, 0x20

    .line 27
    .line 28
    shr-long v2, v0, p0

    .line 29
    .line 30
    long-to-int p3, v2

    .line 31
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    shr-long v3, p1, p0

    .line 36
    .line 37
    long-to-int p0, v3

    .line 38
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    sub-float/2addr p0, v3

    .line 47
    invoke-static {v2, p0}, Ljava/lang/Math;->max(FF)F

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    const-wide v2, 0xffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v0, v2

    .line 57
    long-to-int v0, v0

    .line 58
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    and-long/2addr p1, v2

    .line 63
    long-to-int p1, p1

    .line 64
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    sub-float/2addr p1, p2

    .line 73
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    float-to-double v1, p0

    .line 78
    float-to-double p0, p1

    .line 79
    invoke-static {v1, v2, p0, p1}, Ljava/lang/Math;->hypot(DD)D

    .line 80
    .line 81
    .line 82
    move-result-wide p0

    .line 83
    double-to-float p0, p0

    .line 84
    mul-float/2addr p0, p4

    .line 85
    invoke-static {}, Laa;->a()Ly9;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    sub-float/2addr p2, p0

    .line 94
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    sub-float/2addr p4, p0

    .line 99
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    add-float/2addr p3, p0

    .line 104
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    add-float/2addr v0, p0

    .line 109
    iget-object p0, p1, Ly9;->b:Landroid/graphics/RectF;

    .line 110
    .line 111
    if-nez p0, :cond_1

    .line 112
    .line 113
    new-instance p0, Landroid/graphics/RectF;

    .line 114
    .line 115
    invoke-direct {p0}, Landroid/graphics/RectF;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object p0, p1, Ly9;->b:Landroid/graphics/RectF;

    .line 119
    .line 120
    :cond_1
    iget-object p0, p1, Ly9;->b:Landroid/graphics/RectF;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p2, p4, p3, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 126
    .line 127
    .line 128
    iget-object p0, p1, Ly9;->a:Landroid/graphics/Path;

    .line 129
    .line 130
    iget-object p2, p1, Ly9;->b:Landroid/graphics/RectF;

    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    sget-object p3, Lux1;->h:Lux1;

    .line 136
    .line 137
    invoke-static {p3}, Laa;->b(Lux1;)Landroid/graphics/Path$Direction;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    invoke-virtual {p0, p2, p3}, Landroid/graphics/Path;->addOval(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 142
    .line 143
    .line 144
    new-instance p0, Lsv1;

    .line 145
    .line 146
    invoke-direct {p0, p1}, Lsv1;-><init>(Ly9;)V

    .line 147
    .line 148
    .line 149
    return-object p0
.end method
