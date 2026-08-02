.class public final synthetic Le03;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Le03;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Le03;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Le03;->j:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Le03;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Le03;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, Le03;->i:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lb03;

    .line 13
    .line 14
    check-cast v2, Lxk1;

    .line 15
    .line 16
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lh11;

    .line 21
    .line 22
    iget-wide v4, v0, Lh11;->a:J

    .line 23
    .line 24
    invoke-virtual {p0}, Lb03;->i()Lrs1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    if-eqz v0, :cond_7

    .line 34
    .line 35
    iget-wide v8, v0, Lrs1;->a:J

    .line 36
    .line 37
    invoke-virtual {p0}, Lb03;->m()Lsd;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_7

    .line 42
    .line 43
    iget-object v0, v0, Lsd;->i:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lb03;->r:Lnx1;

    .line 54
    .line 55
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lrr0;

    .line 60
    .line 61
    const/4 v2, -0x1

    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    move v0, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    sget-object v10, Ld03;->a:[I

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    aget v0, v10, v0

    .line 73
    .line 74
    :goto_0
    if-eq v0, v2, :cond_7

    .line 75
    .line 76
    const-wide v10, 0xffffffffL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    const/4 v2, 0x2

    .line 82
    const/16 v12, 0x20

    .line 83
    .line 84
    if-eq v0, v3, :cond_3

    .line 85
    .line 86
    if-eq v0, v2, :cond_3

    .line 87
    .line 88
    const/4 v3, 0x3

    .line 89
    if-ne v0, v3, :cond_2

    .line 90
    .line 91
    invoke-virtual {p0}, Lb03;->n()Lk03;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-wide v0, v0, Lk03;->b:J

    .line 96
    .line 97
    sget v3, Lf13;->c:I

    .line 98
    .line 99
    and-long/2addr v0, v10

    .line 100
    :goto_1
    long-to-int v0, v0

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    invoke-static {}, Lc80;->s()V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_4

    .line 106
    .line 107
    :cond_3
    invoke-virtual {p0}, Lb03;->n()Lk03;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-wide v0, v0, Lk03;->b:J

    .line 112
    .line 113
    sget v3, Lf13;->c:I

    .line 114
    .line 115
    shr-long/2addr v0, v12

    .line 116
    goto :goto_1

    .line 117
    :goto_2
    iget-object v1, p0, Lb03;->d:Lt91;

    .line 118
    .line 119
    if-eqz v1, :cond_7

    .line 120
    .line 121
    invoke-virtual {v1}, Lt91;->d()Lz03;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-nez v1, :cond_4

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_4
    iget-object v3, p0, Lb03;->d:Lt91;

    .line 129
    .line 130
    if-eqz v3, :cond_7

    .line 131
    .line 132
    iget-object v3, v3, Lt91;->a:Liz2;

    .line 133
    .line 134
    iget-object v3, v3, Liz2;->a:Lsd;

    .line 135
    .line 136
    if-nez v3, :cond_5

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_5
    iget-object p0, p0, Lb03;->b:Lus1;

    .line 140
    .line 141
    invoke-interface {p0, v0}, Lus1;->p(I)I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    iget-object v0, v3, Lsd;->i:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    const/4 v3, 0x0

    .line 152
    invoke-static {p0, v3, v0}, Lci0;->D(III)I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    invoke-virtual {v1, v8, v9}, Lz03;->d(J)J

    .line 157
    .line 158
    .line 159
    move-result-wide v8

    .line 160
    shr-long/2addr v8, v12

    .line 161
    long-to-int v0, v8

    .line 162
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    iget-object v1, v1, Lz03;->a:Ly03;

    .line 167
    .line 168
    iget-object v3, v1, Ly03;->b:Llj1;

    .line 169
    .line 170
    invoke-virtual {v3, p0}, Llj1;->d(I)I

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    invoke-virtual {v1, p0}, Ly03;->d(I)F

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    invoke-virtual {v1, p0}, Ly03;->e(I)F

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-static {v8, v1}, Ljava/lang/Math;->min(FF)F

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    invoke-static {v8, v1}, Ljava/lang/Math;->max(FF)F

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-static {v0, v9, v1}, Lci0;->C(FFF)F

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    const-wide/16 v8, 0x0

    .line 195
    .line 196
    invoke-static {v4, v5, v8, v9}, Lh11;->a(JJ)Z

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    if-nez v8, :cond_6

    .line 201
    .line 202
    sub-float/2addr v0, v1

    .line 203
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    shr-long/2addr v4, v12

    .line 208
    long-to-int v4, v4

    .line 209
    div-int/2addr v4, v2

    .line 210
    int-to-float v2, v4

    .line 211
    cmpl-float v0, v0, v2

    .line 212
    .line 213
    if-lez v0, :cond_6

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_6
    invoke-virtual {v3, p0}, Llj1;->f(I)F

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    invoke-virtual {v3, p0}, Llj1;->b(I)F

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    sub-float/2addr p0, v0

    .line 225
    const/high16 v2, 0x40000000    # 2.0f

    .line 226
    .line 227
    div-float/2addr p0, v2

    .line 228
    add-float/2addr p0, v0

    .line 229
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    int-to-long v0, v0

    .line 234
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    int-to-long v2, p0

    .line 239
    shl-long/2addr v0, v12

    .line 240
    and-long/2addr v2, v10

    .line 241
    or-long v6, v0, v2

    .line 242
    .line 243
    :cond_7
    :goto_3
    new-instance v1, Lrs1;

    .line 244
    .line 245
    invoke-direct {v1, v6, v7}, Lrs1;-><init>(J)V

    .line 246
    .line 247
    .line 248
    :goto_4
    return-object v1

    .line 249
    :pswitch_0
    check-cast p0, Lj20;

    .line 250
    .line 251
    check-cast v2, Lin0;

    .line 252
    .line 253
    new-instance v0, Lew0;

    .line 254
    .line 255
    invoke-direct {v0, v2, v1, v3}, Lew0;-><init>(Lin0;Lt00;I)V

    .line 256
    .line 257
    .line 258
    invoke-static {p0, v1, v0, v3}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 259
    .line 260
    .line 261
    sget-object p0, La83;->a:La83;

    .line 262
    .line 263
    return-object p0

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
