.class public final Lv1/k0;
.super Lv1/a1;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv1/k0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lv1/k0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lv1/k0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv1/k0;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly1/t;

    .line 9
    .line 10
    invoke-virtual {v0}, Ly1/t;->getDensity()Lu2/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lu2/c;->d()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Lv1/k0;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lx1/n0;

    .line 22
    .line 23
    invoke-interface {v0}, Lu2/c;->d()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public j(Lv1/l;)F
    .locals 8

    .line 1
    iget v0, p0, Lv1/k0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lv1/a1;->j(Lv1/l;)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object v0, p1, Lv1/l;->a:Lfg/p;

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
    invoke-interface {v0, p0, p1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lv1/k0;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lx1/n0;

    .line 36
    .line 37
    iget-boolean v2, v0, Lx1/n0;->q:Z

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_1
    move-object v2, v0

    .line 44
    :goto_0
    iget-object v3, v2, Lx1/n0;->s:Lm8/c;

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    iget-object v4, v3, Lm8/c;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, [Lv1/l;

    .line 51
    .line 52
    invoke-static {v4, p1}, Ltf/l;->D0([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-gez v4, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget-object v3, v3, Lm8/c;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, [F

    .line 62
    .line 63
    aget v3, v3, v4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    :goto_1
    move v3, v1

    .line 67
    :goto_2
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0}, Lx1/n0;->Y0()Lx1/f0;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v2, v1, p1}, Lx1/n0;->J0(Lx1/f0;Lv1/l;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Lx1/n0;->T0()Lv1/t;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0}, Lx1/n0;->T0()Lv1/t;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget p1, p1, Lv1/l;->b:I

    .line 89
    .line 90
    packed-switch p1, :pswitch_data_1

    .line 91
    .line 92
    .line 93
    invoke-interface {v1}, Lv1/t;->F()J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    const-wide v6, 0xffffffffL

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    and-long/2addr v4, v6

    .line 103
    long-to-int p1, v4

    .line 104
    int-to-float p1, p1

    .line 105
    const/high16 v2, 0x40000000    # 2.0f

    .line 106
    .line 107
    div-float/2addr p1, v2

    .line 108
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    int-to-long v2, v2

    .line 113
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    int-to-long v4, p1

    .line 118
    const/16 p1, 0x20

    .line 119
    .line 120
    shl-long/2addr v2, p1

    .line 121
    and-long/2addr v4, v6

    .line 122
    or-long/2addr v2, v4

    .line 123
    invoke-interface {v0, v1, v2, v3}, Lv1/t;->w(Lv1/t;J)J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    shr-long/2addr v0, p1

    .line 128
    long-to-int p1, v0

    .line 129
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    :goto_3
    move v1, p1

    .line 134
    goto :goto_4

    .line 135
    :pswitch_1
    invoke-interface {v1}, Lv1/t;->F()J

    .line 136
    .line 137
    .line 138
    move-result-wide v4

    .line 139
    const/16 p1, 0x20

    .line 140
    .line 141
    shr-long/2addr v4, p1

    .line 142
    long-to-int v2, v4

    .line 143
    int-to-float v2, v2

    .line 144
    const/high16 v4, 0x40000000    # 2.0f

    .line 145
    .line 146
    div-float/2addr v2, v4

    .line 147
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    int-to-long v4, v2

    .line 152
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    int-to-long v2, v2

    .line 157
    shl-long/2addr v4, p1

    .line 158
    const-wide v6, 0xffffffffL

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    and-long/2addr v2, v6

    .line 164
    or-long/2addr v2, v4

    .line 165
    invoke-interface {v0, v1, v2, v3}, Lv1/t;->w(Lv1/t;J)J

    .line 166
    .line 167
    .line 168
    move-result-wide v0

    .line 169
    and-long/2addr v0, v6

    .line 170
    long-to-int p1, v0

    .line 171
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    goto :goto_3

    .line 176
    :cond_4
    invoke-virtual {v2}, Lx1/n0;->a1()Lx1/n0;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    if-nez v3, :cond_5

    .line 181
    .line 182
    invoke-virtual {v0}, Lx1/n0;->Y0()Lx1/f0;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v2, v0, p1}, Lx1/n0;->J0(Lx1/f0;Lv1/l;)V

    .line 187
    .line 188
    .line 189
    :goto_4
    return v1

    .line 190
    :cond_5
    move-object v2, v3

    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public final m()Lu2/m;
    .locals 1

    .line 1
    iget v0, p0, Lv1/k0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv1/k0;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly1/t;

    .line 9
    .line 10
    invoke-virtual {v0}, Ly1/t;->getLayoutDirection()Lu2/m;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lv1/k0;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lx1/n0;

    .line 18
    .line 19
    invoke-interface {v0}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q0()F
    .locals 1

    .line 1
    iget v0, p0, Lv1/k0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv1/k0;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly1/t;

    .line 9
    .line 10
    invoke-virtual {v0}, Ly1/t;->getDensity()Lu2/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lu2/c;->q0()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Lv1/k0;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lx1/n0;

    .line 22
    .line 23
    invoke-interface {v0}, Lu2/c;->q0()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final w()I
    .locals 1

    .line 1
    iget v0, p0, Lv1/k0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv1/k0;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly1/t;

    .line 9
    .line 10
    invoke-virtual {v0}, Ly1/t;->getRoot()Lx1/f0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Lx1/f0;->M:Lx1/j0;

    .line 15
    .line 16
    iget-object v0, v0, Lx1/j0;->p:Lx1/v0;

    .line 17
    .line 18
    iget v0, v0, Lv1/b1;->g:I

    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_0
    iget-object v0, p0, Lv1/k0;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lx1/n0;

    .line 24
    .line 25
    invoke-virtual {v0}, Lv1/b1;->w0()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
