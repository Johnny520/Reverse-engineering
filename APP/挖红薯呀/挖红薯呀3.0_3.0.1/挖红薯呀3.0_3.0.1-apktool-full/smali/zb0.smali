.class public final Lzb0;
.super Lwq0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final synthetic e:I

.field public final f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lzb0;->e:I

    .line 2
    .line 3
    iput-object p2, p0, Lzb0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()F
    .locals 1

    .line 1
    iget v0, p0, Lzb0;->e:I

    .line 2
    .line 3
    iget-object p0, p0, Lzb0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lw3;

    .line 9
    .line 10
    invoke-virtual {p0}, Lw3;->getDensity()Lym;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Lym;->b()F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :pswitch_0
    check-cast p0, Lyb0;

    .line 20
    .line 21
    invoke-interface {p0}, Lym;->b()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lez;)F
    .locals 8

    .line 1
    iget v0, p0, Lzb0;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lwq0;->d(Lez;)F

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object v0, p1, Lez;->a:Lww;

    .line 12
    .line 13
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {v0, p0, p1}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    iget-object p0, p0, Lzb0;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lyb0;

    .line 36
    .line 37
    iget-boolean v0, p0, Lyb0;->n:Z

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_1
    move-object v0, p0

    .line 44
    :goto_0
    iget-object v2, v0, Lyb0;->p:Llw0;

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    iget-object v3, v2, Llw0;->b:[Lez;

    .line 49
    .line 50
    invoke-static {v3, p1}, Lf9;->l0([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-gez v3, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget-object v2, v2, Llw0;->c:[F

    .line 58
    .line 59
    aget v2, v2, v3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    :goto_1
    move v2, v1

    .line 63
    :goto_2
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Lyb0;->n0()Lb60;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v1, p1}, Lyb0;->b0(Lb60;Lez;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lyb0;->l0()Li50;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p0}, Lyb0;->l0()Li50;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    iget p1, p1, Lez;->b:I

    .line 85
    .line 86
    const/16 v1, 0x20

    .line 87
    .line 88
    const/high16 v3, 0x40000000    # 2.0f

    .line 89
    .line 90
    const-wide v4, 0xffffffffL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    packed-switch p1, :pswitch_data_1

    .line 96
    .line 97
    .line 98
    invoke-interface {v0}, Li50;->G()J

    .line 99
    .line 100
    .line 101
    move-result-wide v6

    .line 102
    and-long/2addr v6, v4

    .line 103
    long-to-int p1, v6

    .line 104
    int-to-float p1, p1

    .line 105
    div-float/2addr p1, v3

    .line 106
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    int-to-long v2, v2

    .line 111
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    int-to-long v6, p1

    .line 116
    shl-long/2addr v2, v1

    .line 117
    and-long/2addr v4, v6

    .line 118
    or-long/2addr v2, v4

    .line 119
    invoke-interface {p0, v0, v2, v3}, Li50;->x(Li50;J)J

    .line 120
    .line 121
    .line 122
    move-result-wide p0

    .line 123
    shr-long/2addr p0, v1

    .line 124
    long-to-int p0, p0

    .line 125
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    :goto_3
    move v1, p0

    .line 130
    goto :goto_4

    .line 131
    :pswitch_1
    invoke-interface {v0}, Li50;->G()J

    .line 132
    .line 133
    .line 134
    move-result-wide v6

    .line 135
    shr-long/2addr v6, v1

    .line 136
    long-to-int p1, v6

    .line 137
    int-to-float p1, p1

    .line 138
    div-float/2addr p1, v3

    .line 139
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    int-to-long v6, p1

    .line 144
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    int-to-long v2, p1

    .line 149
    shl-long/2addr v6, v1

    .line 150
    and-long v1, v2, v4

    .line 151
    .line 152
    or-long/2addr v1, v6

    .line 153
    invoke-interface {p0, v0, v1, v2}, Li50;->x(Li50;J)J

    .line 154
    .line 155
    .line 156
    move-result-wide p0

    .line 157
    and-long/2addr p0, v4

    .line 158
    long-to-int p0, p0

    .line 159
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    goto :goto_3

    .line 164
    :cond_4
    invoke-virtual {v0}, Lyb0;->p0()Lyb0;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-nez v2, :cond_5

    .line 169
    .line 170
    invoke-virtual {p0}, Lyb0;->n0()Lb60;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {v0, p0, p1}, Lyb0;->b0(Lb60;Lez;)V

    .line 175
    .line 176
    .line 177
    :goto_4
    return v1

    .line 178
    :cond_5
    move-object v0, v2

    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public final e()Lk50;
    .locals 1

    .line 1
    iget v0, p0, Lzb0;->e:I

    .line 2
    .line 3
    iget-object p0, p0, Lzb0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lw3;

    .line 9
    .line 10
    invoke-virtual {p0}, Lw3;->getLayoutDirection()Lk50;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, Lyb0;

    .line 16
    .line 17
    invoke-interface {p0}, Ll30;->getLayoutDirection()Lk50;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Lzb0;->e:I

    .line 2
    .line 3
    iget-object p0, p0, Lzb0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lw3;

    .line 9
    .line 10
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, Lb60;->J:Lf60;

    .line 15
    .line 16
    iget-object p0, p0, Lf60;->p:Lwd0;

    .line 17
    .line 18
    iget p0, p0, Lxq0;->d:I

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_0
    check-cast p0, Lyb0;

    .line 22
    .line 23
    invoke-virtual {p0}, Lxq0;->U()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()F
    .locals 1

    .line 1
    iget v0, p0, Lzb0;->e:I

    .line 2
    .line 3
    iget-object p0, p0, Lzb0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lw3;

    .line 9
    .line 10
    invoke-virtual {p0}, Lw3;->getDensity()Lym;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Lym;->h()F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :pswitch_0
    check-cast p0, Lyb0;

    .line 20
    .line 21
    invoke-interface {p0}, Lym;->h()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
