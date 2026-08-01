.class public final synthetic Lgb1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lgb1;->d:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget p0, p0, Lgb1;->d:I

    .line 2
    .line 3
    const-wide v0, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v2, 0x20

    .line 9
    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Lx7;

    .line 14
    .line 15
    iget p0, p1, Lx7;->a:F

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_0
    check-cast p1, La8;

    .line 23
    .line 24
    new-instance p0, Lst0;

    .line 25
    .line 26
    iget v0, p1, La8;->a:F

    .line 27
    .line 28
    iget v1, p1, La8;->b:F

    .line 29
    .line 30
    iget v2, p1, La8;->c:F

    .line 31
    .line 32
    iget p1, p1, La8;->d:F

    .line 33
    .line 34
    invoke-direct {p0, v0, v1, v2, p1}, Lst0;-><init>(FFFF)V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Lst0;

    .line 39
    .line 40
    new-instance p0, La8;

    .line 41
    .line 42
    iget v0, p1, Lst0;->a:F

    .line 43
    .line 44
    iget v1, p1, Lst0;->b:F

    .line 45
    .line 46
    iget v2, p1, Lst0;->c:F

    .line 47
    .line 48
    iget p1, p1, Lst0;->d:F

    .line 49
    .line 50
    invoke-direct {p0, v0, v1, v2, p1}, La8;-><init>(FFFF)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_2
    check-cast p1, Ly7;

    .line 55
    .line 56
    iget p0, p1, Ly7;->a:F

    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    const/4 v3, 0x0

    .line 63
    if-gez p0, :cond_0

    .line 64
    .line 65
    move p0, v3

    .line 66
    :cond_0
    iget p1, p1, Ly7;->b:F

    .line 67
    .line 68
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-gez p1, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move v3, p1

    .line 76
    :goto_0
    int-to-long p0, p0

    .line 77
    shl-long/2addr p0, v2

    .line 78
    int-to-long v2, v3

    .line 79
    and-long/2addr v0, v2

    .line 80
    or-long/2addr p0, v0

    .line 81
    new-instance v0, Ld30;

    .line 82
    .line 83
    invoke-direct {v0, p0, p1}, Ld30;-><init>(J)V

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_3
    check-cast p1, Ld30;

    .line 88
    .line 89
    new-instance p0, Ly7;

    .line 90
    .line 91
    iget-wide v3, p1, Ld30;->a:J

    .line 92
    .line 93
    shr-long v5, v3, v2

    .line 94
    .line 95
    long-to-int p1, v5

    .line 96
    int-to-float p1, p1

    .line 97
    and-long/2addr v0, v3

    .line 98
    long-to-int v0, v0

    .line 99
    int-to-float v0, v0

    .line 100
    invoke-direct {p0, p1, v0}, Ly7;-><init>(FF)V

    .line 101
    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_4
    check-cast p1, Ly7;

    .line 105
    .line 106
    iget p0, p1, Ly7;->a:F

    .line 107
    .line 108
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    iget p1, p1, Ly7;->b:F

    .line 113
    .line 114
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    int-to-long v3, p0

    .line 119
    shl-long v2, v3, v2

    .line 120
    .line 121
    int-to-long p0, p1

    .line 122
    and-long/2addr p0, v0

    .line 123
    or-long/2addr p0, v2

    .line 124
    new-instance v0, Lw20;

    .line 125
    .line 126
    invoke-direct {v0, p0, p1}, Lw20;-><init>(J)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_5
    check-cast p1, Lw20;

    .line 131
    .line 132
    new-instance p0, Ly7;

    .line 133
    .line 134
    iget-wide v3, p1, Lw20;->a:J

    .line 135
    .line 136
    shr-long v5, v3, v2

    .line 137
    .line 138
    long-to-int p1, v5

    .line 139
    int-to-float p1, p1

    .line 140
    and-long/2addr v0, v3

    .line 141
    long-to-int v0, v0

    .line 142
    int-to-float v0, v0

    .line 143
    invoke-direct {p0, p1, v0}, Ly7;-><init>(FF)V

    .line 144
    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_6
    check-cast p1, Ly7;

    .line 148
    .line 149
    iget p0, p1, Ly7;->a:F

    .line 150
    .line 151
    iget p1, p1, Ly7;->b:F

    .line 152
    .line 153
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    int-to-long v3, p0

    .line 158
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    int-to-long p0, p0

    .line 163
    shl-long v2, v3, v2

    .line 164
    .line 165
    and-long/2addr p0, v0

    .line 166
    or-long/2addr p0, v2

    .line 167
    new-instance v0, Lok0;

    .line 168
    .line 169
    invoke-direct {v0, p0, p1}, Lok0;-><init>(J)V

    .line 170
    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_7
    check-cast p1, Lok0;

    .line 174
    .line 175
    new-instance p0, Ly7;

    .line 176
    .line 177
    iget-wide v3, p1, Lok0;->a:J

    .line 178
    .line 179
    shr-long v2, v3, v2

    .line 180
    .line 181
    long-to-int v2, v2

    .line 182
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    iget-wide v3, p1, Lok0;->a:J

    .line 187
    .line 188
    and-long/2addr v0, v3

    .line 189
    long-to-int p1, v0

    .line 190
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    invoke-direct {p0, v2, p1}, Ly7;-><init>(FF)V

    .line 195
    .line 196
    .line 197
    return-object p0

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
