.class public final Lms0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:J

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLqv1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lms0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p1, p0, Lms0;->a:J

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Lqv1;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 9
    invoke-direct {p0, v0, v1, p1}, Lms0;-><init>(JLqv1;)V

    return-void
.end method


# virtual methods
.method public a(JFZ)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lms0;->a:J

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lrs1;->e(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    iput-wide p1, p0, Lms0;->a:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v0, v1, p1, p2}, Lrs1;->e(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    :goto_0
    iget-object p4, p0, Lms0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p4, Lqv1;

    .line 19
    .line 20
    if-nez p4, :cond_1

    .line 21
    .line 22
    invoke-static {p1, p2}, Lrs1;->c(J)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p0, p1, p2}, Lms0;->b(J)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    :goto_1
    cmpl-float p1, p1, p3

    .line 36
    .line 37
    if-ltz p1, :cond_5

    .line 38
    .line 39
    iget-object p1, p0, Lms0;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lqv1;

    .line 42
    .line 43
    iget-wide v0, p0, Lms0;->a:J

    .line 44
    .line 45
    const-wide v2, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    const/16 p2, 0x20

    .line 51
    .line 52
    if-nez p1, :cond_2

    .line 53
    .line 54
    invoke-static {v0, v1}, Lrs1;->c(J)F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    shr-long v4, v0, p2

    .line 59
    .line 60
    long-to-int p4, v4

    .line 61
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    div-float/2addr p4, p1

    .line 66
    and-long/2addr v0, v2

    .line 67
    long-to-int v0, v0

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    div-float/2addr v0, p1

    .line 73
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    int-to-long v4, p1

    .line 78
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    int-to-long v0, p1

    .line 83
    shl-long p1, v4, p2

    .line 84
    .line 85
    and-long/2addr v0, v2

    .line 86
    or-long/2addr p1, v0

    .line 87
    invoke-static {p3, p1, p2}, Lrs1;->f(FJ)J

    .line 88
    .line 89
    .line 90
    move-result-wide p1

    .line 91
    iget-wide p3, p0, Lms0;->a:J

    .line 92
    .line 93
    invoke-static {p3, p4, p1, p2}, Lrs1;->d(JJ)J

    .line 94
    .line 95
    .line 96
    move-result-wide p0

    .line 97
    return-wide p0

    .line 98
    :cond_2
    invoke-virtual {p0, v0, v1}, Lms0;->b(J)F

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iget-wide v0, p0, Lms0;->a:J

    .line 103
    .line 104
    invoke-virtual {p0, v0, v1}, Lms0;->b(J)F

    .line 105
    .line 106
    .line 107
    move-result p4

    .line 108
    invoke-static {p4}, Ljava/lang/Math;->signum(F)F

    .line 109
    .line 110
    .line 111
    move-result p4

    .line 112
    mul-float/2addr p4, p3

    .line 113
    sub-float/2addr p1, p4

    .line 114
    iget-wide p3, p0, Lms0;->a:J

    .line 115
    .line 116
    iget-object v0, p0, Lms0;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Lqv1;

    .line 119
    .line 120
    sget-object v1, Lqv1;->i:Lqv1;

    .line 121
    .line 122
    if-ne v0, v1, :cond_3

    .line 123
    .line 124
    and-long/2addr p3, v2

    .line 125
    :goto_2
    long-to-int p3, p3

    .line 126
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 127
    .line 128
    .line 129
    move-result p3

    .line 130
    goto :goto_3

    .line 131
    :cond_3
    shr-long/2addr p3, p2

    .line 132
    goto :goto_2

    .line 133
    :goto_3
    iget-object p0, p0, Lms0;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, Lqv1;

    .line 136
    .line 137
    if-ne p0, v1, :cond_4

    .line 138
    .line 139
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    int-to-long p0, p0

    .line 144
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 145
    .line 146
    .line 147
    move-result p3

    .line 148
    int-to-long p3, p3

    .line 149
    shl-long/2addr p0, p2

    .line 150
    and-long p2, p3, v2

    .line 151
    .line 152
    or-long/2addr p0, p2

    .line 153
    return-wide p0

    .line 154
    :cond_4
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    int-to-long p3, p0

    .line 159
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    int-to-long p0, p0

    .line 164
    shl-long p2, p3, p2

    .line 165
    .line 166
    and-long/2addr p0, v2

    .line 167
    or-long/2addr p0, p2

    .line 168
    return-wide p0

    .line 169
    :cond_5
    const-wide p0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    return-wide p0
.end method

.method public b(J)F
    .locals 2

    .line 1
    iget-object p0, p0, Lms0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lqv1;

    .line 4
    .line 5
    sget-object v0, Lqv1;->i:Lqv1;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0x20

    .line 10
    .line 11
    shr-long p0, p1, p0

    .line 12
    .line 13
    :goto_0
    long-to-int p0, p0

    .line 14
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    const-wide v0, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long p0, p1, v0

    .line 25
    .line 26
    goto :goto_0
.end method

.method public c()Ljs0;
    .locals 7

    .line 1
    new-instance v0, Lye0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lye0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    :goto_0
    iget-object v2, p0, Lms0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lon;

    .line 10
    .line 11
    iget-wide v3, p0, Lms0;->a:J

    .line 12
    .line 13
    invoke-interface {v2, v3, v4}, Lon;->s(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-wide v3, p0, Lms0;->a:J

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    int-to-long v5, v5

    .line 24
    sub-long/2addr v3, v5

    .line 25
    iput-wide v3, p0, Lms0;->a:J

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lye0;->b()Ljs0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    const/4 v3, 0x4

    .line 39
    const/16 v4, 0x3a

    .line 40
    .line 41
    invoke-static {v2, v4, v1, v3}, Lpv2;->p0(Ljava/lang/CharSequence;CII)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/4 v5, -0x1

    .line 46
    const/4 v6, 0x0

    .line 47
    if-eq v3, v5, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v0, v4, v2}, Ln93;->a(Lye0;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    const-string v5, ""

    .line 68
    .line 69
    if-ne v3, v4, :cond_2

    .line 70
    .line 71
    invoke-virtual {v2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v0, v5, v2}, Ln93;->a(Lye0;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-static {v0, v5, v2}, Ln93;->a(Lye0;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0
.end method
