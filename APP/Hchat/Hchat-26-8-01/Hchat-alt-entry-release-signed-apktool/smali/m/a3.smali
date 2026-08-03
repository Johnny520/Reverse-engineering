.class public final Lm/a3;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Lm/p1;

.field public b:J


# direct methods
.method public constructor <init>(JLm/p1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lm/a3;->a:Lm/p1;

    .line 5
    .line 6
    iput-wide p1, p0, Lm/a3;->b:J

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Lm/p1;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 9
    invoke-direct {p0, v0, v1, p1}, Lm/a3;-><init>(JLm/p1;)V

    return-void
.end method


# virtual methods
.method public final a(JFZ)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lm/a3;->b:J

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Le1/b;->e(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    iput-wide p1, p0, Lm/a3;->b:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v0, v1, p1, p2}, Le1/b;->e(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    :goto_0
    iget-object p4, p0, Lm/a3;->a:Lm/p1;

    .line 17
    .line 18
    if-nez p4, :cond_1

    .line 19
    .line 20
    invoke-static {p1, p2}, Le1/b;->c(J)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-virtual {p0, p1, p2}, Lm/a3;->b(J)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :goto_1
    cmpl-float p1, p1, p3

    .line 34
    .line 35
    if-ltz p1, :cond_5

    .line 36
    .line 37
    iget-object p1, p0, Lm/a3;->a:Lm/p1;

    .line 38
    .line 39
    iget-wide v0, p0, Lm/a3;->b:J

    .line 40
    .line 41
    const-wide v2, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    const/16 p2, 0x20

    .line 47
    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    invoke-static {v0, v1}, Le1/b;->c(J)F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    shr-long v4, v0, p2

    .line 55
    .line 56
    long-to-int p4, v4

    .line 57
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result p4

    .line 61
    div-float/2addr p4, p1

    .line 62
    and-long/2addr v0, v2

    .line 63
    long-to-int v0, v0

    .line 64
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    div-float/2addr v0, p1

    .line 69
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    int-to-long v4, p1

    .line 74
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    int-to-long v0, p1

    .line 79
    shl-long p1, v4, p2

    .line 80
    .line 81
    and-long/2addr v0, v2

    .line 82
    or-long/2addr p1, v0

    .line 83
    invoke-static {p1, p2, p3}, Le1/b;->f(JF)J

    .line 84
    .line 85
    .line 86
    move-result-wide p1

    .line 87
    iget-wide p3, p0, Lm/a3;->b:J

    .line 88
    .line 89
    invoke-static {p3, p4, p1, p2}, Le1/b;->d(JJ)J

    .line 90
    .line 91
    .line 92
    move-result-wide p1

    .line 93
    return-wide p1

    .line 94
    :cond_2
    invoke-virtual {p0, v0, v1}, Lm/a3;->b(J)F

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    iget-wide v0, p0, Lm/a3;->b:J

    .line 99
    .line 100
    invoke-virtual {p0, v0, v1}, Lm/a3;->b(J)F

    .line 101
    .line 102
    .line 103
    move-result p4

    .line 104
    invoke-static {p4}, Ljava/lang/Math;->signum(F)F

    .line 105
    .line 106
    .line 107
    move-result p4

    .line 108
    mul-float/2addr p4, p3

    .line 109
    sub-float/2addr p1, p4

    .line 110
    iget-wide p3, p0, Lm/a3;->b:J

    .line 111
    .line 112
    iget-object v0, p0, Lm/a3;->a:Lm/p1;

    .line 113
    .line 114
    sget-object v1, Lm/p1;->h:Lm/p1;

    .line 115
    .line 116
    if-ne v0, v1, :cond_3

    .line 117
    .line 118
    and-long/2addr p3, v2

    .line 119
    :goto_2
    long-to-int p3, p3

    .line 120
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    goto :goto_3

    .line 125
    :cond_3
    shr-long/2addr p3, p2

    .line 126
    goto :goto_2

    .line 127
    :goto_3
    iget-object p4, p0, Lm/a3;->a:Lm/p1;

    .line 128
    .line 129
    if-ne p4, v1, :cond_4

    .line 130
    .line 131
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    int-to-long v0, p1

    .line 136
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    int-to-long p3, p1

    .line 141
    shl-long p1, v0, p2

    .line 142
    .line 143
    and-long/2addr p3, v2

    .line 144
    or-long/2addr p1, p3

    .line 145
    return-wide p1

    .line 146
    :cond_4
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 147
    .line 148
    .line 149
    move-result p3

    .line 150
    int-to-long p3, p3

    .line 151
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    int-to-long v0, p1

    .line 156
    shl-long p1, p3, p2

    .line 157
    .line 158
    and-long p3, v0, v2

    .line 159
    .line 160
    or-long/2addr p1, p3

    .line 161
    return-wide p1

    .line 162
    :cond_5
    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    return-wide p1
.end method

.method public final b(J)F
    .locals 2

    .line 1
    iget-object v0, p0, Lm/a3;->a:Lm/p1;

    .line 2
    .line 3
    sget-object v1, Lm/p1;->h:Lm/p1;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x20

    .line 8
    .line 9
    shr-long/2addr p1, v0

    .line 10
    :goto_0
    long-to-int p1, p1

    .line 11
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const-wide v0, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p1, v0

    .line 22
    goto :goto_0
.end method
