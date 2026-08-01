.class public final Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;
.super Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;
.implements Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;
.implements Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏哲兰;


# instance fields
.field public 飘花落叶言子世哲兰楪苏:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

.field public 飘花落叶言子世哲兰苏楪:Landroidx/compose/ui/platform/飘花落叶言子兰楪苏世哲;

.field public 飘花落叶言子世哲楪兰苏:F

.field public final 飘花落叶言子世哲楪苏兰:F

.field public 飘花落叶言子世哲苏兰楪:F

.field public 飘花落叶言子世哲苏楪兰:F

.field public 飘花落叶言子世苏兰哲楪:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

.field public final 飘花落叶言子世苏兰楪哲:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;

.field public final 飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

.field public 飘花落叶言子世苏哲楪兰:Z

.field public 飘花落叶言子世苏楪兰哲:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲楪兰:Z

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    new-instance v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰楪哲:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;

    .line 22
    .line 23
    const/high16 v0, 0x3f800000    # 1.0f

    .line 24
    .line 25
    iput v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪苏兰:F

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世苏兰楪哲(IJ)J
    .locals 8

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-wide v1

    .line 8
    :cond_0
    iget v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪苏兰:F

    .line 15
    .line 16
    cmpl-float v0, v0, v3

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    move v0, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世哲苏()Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-virtual {v5}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eq v5, v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世哲苏()Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5, v0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 39
    .line 40
    .line 41
    :cond_2
    sget-object v0, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 42
    .line 43
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_e

    .line 48
    .line 49
    iget-object v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 50
    .line 51
    if-ne p1, v4, :cond_d

    .line 52
    .line 53
    iget-object v4, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 54
    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-virtual {v4, v5}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    iget-boolean v4, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲楪兰:Z

    .line 62
    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(IJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    :cond_4
    invoke-static {p2, p3, v1, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    iget-boolean p1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 74
    .line 75
    const/16 v0, 0x20

    .line 76
    .line 77
    const-wide v6, 0xffffffffL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    and-long/2addr v4, v6

    .line 85
    :goto_1
    long-to-int p1, v4

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    goto :goto_2

    .line 91
    :cond_5
    shr-long/2addr v4, v0

    .line 92
    goto :goto_1

    .line 93
    :goto_2
    iget v4, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 94
    .line 95
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    cmpg-float v3, v4, v3

    .line 100
    .line 101
    if-lez v3, :cond_c

    .line 102
    .line 103
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    iget v4, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:F

    .line 108
    .line 109
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    cmpg-float v3, v3, v4

    .line 114
    .line 115
    if-nez v3, :cond_6

    .line 116
    .line 117
    goto/16 :goto_6

    .line 118
    .line 119
    :cond_6
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    iget v4, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:F

    .line 124
    .line 125
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    cmpg-float v3, v3, v4

    .line 130
    .line 131
    if-nez v3, :cond_8

    .line 132
    .line 133
    invoke-virtual {p0, p1}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世苏哲(F)V

    .line 134
    .line 135
    .line 136
    iget-boolean p0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 137
    .line 138
    if-eqz p0, :cond_7

    .line 139
    .line 140
    shr-long p0, v1, v0

    .line 141
    .line 142
    long-to-int p0, p0

    .line 143
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    and-long p1, p2, v6

    .line 148
    .line 149
    long-to-int p1, p1

    .line 150
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    int-to-long p2, p0

    .line 159
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    :goto_3
    int-to-long p0, p0

    .line 164
    shl-long/2addr p2, v0

    .line 165
    and-long/2addr p0, v6

    .line 166
    or-long/2addr p0, p2

    .line 167
    return-wide p0

    .line 168
    :cond_7
    shr-long p0, p2, v0

    .line 169
    .line 170
    long-to-int p0, p0

    .line 171
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    and-long p1, v1, v6

    .line 176
    .line 177
    long-to-int p1, p1

    .line 178
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    int-to-long p2, p0

    .line 187
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    goto :goto_3

    .line 192
    :cond_8
    iget p2, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:F

    .line 193
    .line 194
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 199
    .line 200
    .line 201
    move-result p3

    .line 202
    cmpg-float p2, p2, p3

    .line 203
    .line 204
    if-gtz p2, :cond_9

    .line 205
    .line 206
    iget p2, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:F

    .line 207
    .line 208
    neg-float p2, p2

    .line 209
    goto :goto_4

    .line 210
    :cond_9
    move p2, p1

    .line 211
    :goto_4
    iget p3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:F

    .line 212
    .line 213
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 214
    .line 215
    .line 216
    move-result p3

    .line 217
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    cmpg-float p1, p3, p1

    .line 222
    .line 223
    if-gtz p1, :cond_a

    .line 224
    .line 225
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪苏世哲()V

    .line 226
    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_a
    invoke-virtual {p0, p2}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世苏哲(F)V

    .line 230
    .line 231
    .line 232
    :goto_5
    iget-boolean p0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 233
    .line 234
    if-eqz p0, :cond_b

    .line 235
    .line 236
    shr-long p0, v1, v0

    .line 237
    .line 238
    long-to-int p0, p0

    .line 239
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    and-long/2addr v1, v6

    .line 244
    long-to-int p1, v1

    .line 245
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    add-float/2addr p1, p2

    .line 250
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 251
    .line 252
    .line 253
    move-result p0

    .line 254
    int-to-long p2, p0

    .line 255
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    goto :goto_3

    .line 260
    :cond_b
    shr-long p0, v1, v0

    .line 261
    .line 262
    long-to-int p0, p0

    .line 263
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 264
    .line 265
    .line 266
    move-result p0

    .line 267
    add-float/2addr p0, p2

    .line 268
    and-long p1, v1, v6

    .line 269
    .line 270
    long-to-int p1, p1

    .line 271
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    int-to-long p2, p0

    .line 280
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 281
    .line 282
    .line 283
    move-result p0

    .line 284
    goto :goto_3

    .line 285
    :cond_c
    :goto_6
    return-wide v1

    .line 286
    :cond_d
    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(IJ)J

    .line 287
    .line 288
    .line 289
    move-result-wide p0

    .line 290
    return-wide p0

    .line 291
    :cond_e
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 292
    .line 293
    .line 294
    return-wide v1
.end method

.method public final 飘花落叶言子兰楪世哲苏()Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;
    .locals 1

    .line 1
    sget-object v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;

    .line 8
    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子兰楪世苏哲(F)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:F

    .line 8
    .line 9
    add-float/2addr v1, p1

    .line 10
    iput v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:F

    .line 11
    .line 12
    iget p1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏兰楪:F

    .line 13
    .line 14
    neg-float v2, p1

    .line 15
    invoke-static {v1, v2, p1}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(FFF)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:F

    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏兰楪:F

    .line 26
    .line 27
    div-float/2addr p1, v1

    .line 28
    const/high16 v1, 0x3f800000    # 1.0f

    .line 29
    .line 30
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget v2, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏兰楪:F

    .line 35
    .line 36
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    float-to-double v0, p1

    .line 45
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 46
    .line 47
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    sub-double v3, v0, v3

    .line 52
    .line 53
    const-wide/high16 v5, 0x4008000000000000L    # 3.0

    .line 54
    .line 55
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    div-double/2addr v0, v5

    .line 60
    add-double/2addr v0, v3

    .line 61
    float-to-double v2, v2

    .line 62
    mul-double/2addr v0, v2

    .line 63
    double-to-float p1, v0

    .line 64
    iget v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:F

    .line 65
    .line 66
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    mul-float/2addr v0, p1

    .line 71
    invoke-virtual {p0, v0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪苏哲世(F)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final 飘花落叶言子兰楪哲世苏(F)V
    .locals 3

    .line 1
    iget v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪苏兰:F

    .line 8
    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    cmpg-float v0, p1, v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪苏世哲()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世苏兰楪()Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v2, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;

    .line 35
    .line 36
    invoke-direct {v2, p0, p1, v1}, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;-><init>(Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;FLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x3

    .line 40
    invoke-static {v0, v1, v1, v2, p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 45
    .line 46
    return-void
.end method

.method public final 飘花落叶言子兰楪哲苏世()V
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/ui/platform/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪苏世兰哲:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    sget-object v1, Landroidx/compose/ui/platform/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪兰苏世哲:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 10
    .line 11
    invoke-static {p0, v1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroidx/compose/ui/platform/飘花落叶言子兰楪苏世哲;

    .line 16
    .line 17
    iget-object v2, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲兰楪苏:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 18
    .line 19
    invoke-static {v0, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲兰苏楪:Landroidx/compose/ui/platform/飘花落叶言子兰楪苏世哲;

    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iput-object v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲兰楪苏:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 35
    .line 36
    iput-object v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲兰苏楪:Landroidx/compose/ui/platform/飘花落叶言子兰楪苏世哲;

    .line 37
    .line 38
    iget-boolean v2, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    check-cast v1, Landroidx/compose/ui/platform/飘花落叶言子哲楪世兰苏;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroidx/compose/ui/platform/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世苏哲兰()J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    invoke-static {v1, v2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(J)F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-interface {v0, v1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏楪兰哲世(F)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    check-cast v1, Landroidx/compose/ui/platform/飘花落叶言子哲楪世兰苏;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/platform/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世苏哲兰()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    invoke-static {v1, v2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(J)F

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-interface {v0, v1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏楪兰哲世(F)F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    :goto_0
    iput v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏兰楪:F

    .line 72
    .line 73
    return-void
.end method

.method public final 飘花落叶言子兰楪苏世哲()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪苏哲世(F)V

    .line 3
    .line 4
    .line 5
    iput v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:F

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世哲苏()Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子兰楪苏哲世(F)V
    .locals 1

    .line 1
    iget v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iput p1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 9
    .line 10
    iget-boolean p1, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏世兰哲楪:Landroidx/compose/ui/node/飘花落叶言子世楪哲苏兰;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪(Z)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子哲楪苏世兰(JJI)J
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-wide v1

    .line 8
    :cond_0
    iget v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪苏兰:F

    .line 15
    .line 16
    cmpl-float v0, v0, v3

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    move v0, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世哲苏()Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eq v4, v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世哲苏()Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4, v0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 39
    .line 40
    .line 41
    :cond_2
    sget-object v0, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 42
    .line 43
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_8

    .line 48
    .line 49
    if-ne p5, v3, :cond_7

    .line 50
    .line 51
    iget-object v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-virtual {v0, v3}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-boolean v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲楪兰:Z

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-object v3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 64
    .line 65
    move-wide v4, p1

    .line 66
    move-wide v6, p3

    .line 67
    move v8, p5

    .line 68
    invoke-virtual/range {v3 .. v8}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(JJI)J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    :cond_4
    invoke-static {p3, p4, v1, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide p1

    .line 76
    iget-boolean p5, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 77
    .line 78
    const/16 v0, 0x20

    .line 79
    .line 80
    const-wide v3, 0xffffffffL

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    if-eqz p5, :cond_5

    .line 86
    .line 87
    and-long/2addr p1, v3

    .line 88
    :goto_1
    long-to-int p1, p1

    .line 89
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    goto :goto_2

    .line 94
    :cond_5
    shr-long/2addr p1, v0

    .line 95
    goto :goto_1

    .line 96
    :goto_2
    invoke-virtual {p0, p1}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世苏哲(F)V

    .line 97
    .line 98
    .line 99
    iget-boolean p0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 100
    .line 101
    if-eqz p0, :cond_6

    .line 102
    .line 103
    shr-long p0, v1, v0

    .line 104
    .line 105
    long-to-int p0, p0

    .line 106
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    and-long p1, p3, v3

    .line 111
    .line 112
    long-to-int p1, p1

    .line 113
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    int-to-long p2, p0

    .line 122
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    int-to-long p0, p0

    .line 127
    shl-long/2addr p2, v0

    .line 128
    and-long/2addr p0, v3

    .line 129
    or-long/2addr p0, p2

    .line 130
    return-wide p0

    .line 131
    :cond_6
    shr-long p0, p3, v0

    .line 132
    .line 133
    long-to-int p0, p0

    .line 134
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    and-long p1, v1, v3

    .line 139
    .line 140
    long-to-int p1, p1

    .line 141
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    int-to-long p2, p0

    .line 150
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    int-to-long p0, p0

    .line 155
    shl-long/2addr p2, v0

    .line 156
    and-long/2addr p0, v3

    .line 157
    or-long/2addr p0, p2

    .line 158
    return-wide p0

    .line 159
    :cond_7
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 160
    .line 161
    invoke-virtual/range {p0 .. p5}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(JJI)J

    .line 162
    .line 163
    .line 164
    move-result-wide p0

    .line 165
    return-wide p0

    .line 166
    :cond_8
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 167
    .line 168
    .line 169
    return-wide v1
.end method

.method public final 飘花落叶言子哲苏世楪兰()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪苏世哲()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子哲苏楪兰世()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪哲苏世()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    iget-object v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;-><init>(Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子哲兰世苏楪(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪哲苏世()V

    .line 5
    .line 6
    .line 7
    invoke-interface {p2, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪苏哲兰(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget p3, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 12
    .line 13
    iget p4, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 14
    .line 15
    new-instance v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏世哲;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v0, p2, v1, p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p3, p4, v0}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final 飘花落叶言子苏世哲兰楪(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;

    .line 7
    .line 8
    iget v1, v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;-><init>(Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget v4, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪苏兰:F

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v6, :cond_2

    .line 39
    .line 40
    if-ne v2, v5, :cond_1

    .line 41
    .line 42
    iget-wide p1, v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->J$0:J

    .line 43
    .line 44
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object p3

    .line 58
    :cond_3
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-boolean p3, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 62
    .line 63
    const-wide/16 v7, 0x0

    .line 64
    .line 65
    if-nez p3, :cond_4

    .line 66
    .line 67
    new-instance p0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 68
    .line 69
    invoke-direct {p0, v7, v8}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_4
    iget p3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 74
    .line 75
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    cmpl-float p3, p3, v4

    .line 80
    .line 81
    if-lez p3, :cond_5

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    const/4 v6, 0x0

    .line 85
    :goto_1
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世哲苏()Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    invoke-virtual {p3}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-eq p3, v6, :cond_6

    .line 94
    .line 95
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世哲苏()Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-virtual {p3, v6}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 100
    .line 101
    .line 102
    :cond_6
    sget-object p3, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 103
    .line 104
    invoke-static {p0, p3}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    if-nez p3, :cond_f

    .line 109
    .line 110
    iget-object p3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 111
    .line 112
    if-eqz p3, :cond_7

    .line 113
    .line 114
    invoke-virtual {p3, v3}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 115
    .line 116
    .line 117
    :cond_7
    iget-boolean p3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲楪兰:Z

    .line 118
    .line 119
    if-eqz p3, :cond_9

    .line 120
    .line 121
    iput-wide p1, v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->J$0:J

    .line 122
    .line 123
    iput v6, v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->I$0:I

    .line 124
    .line 125
    iput v5, v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->label:I

    .line 126
    .line 127
    iget-object p3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 128
    .line 129
    invoke-virtual {p3, p1, p2, v0}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    if-ne p3, v1, :cond_8

    .line 134
    .line 135
    return-object v1

    .line 136
    :cond_8
    :goto_2
    check-cast p3, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 137
    .line 138
    iget-wide v7, p3, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:J

    .line 139
    .line 140
    :cond_9
    invoke-static {p1, p2, v7, v8}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(JJ)J

    .line 141
    .line 142
    .line 143
    move-result-wide p1

    .line 144
    iget-boolean p3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 145
    .line 146
    if-eqz p3, :cond_a

    .line 147
    .line 148
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(J)F

    .line 149
    .line 150
    .line 151
    move-result p3

    .line 152
    goto :goto_3

    .line 153
    :cond_a
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(J)F

    .line 154
    .line 155
    .line 156
    move-result p3

    .line 157
    :goto_3
    iget v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 158
    .line 159
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    cmpl-float v0, v0, v4

    .line 164
    .line 165
    if-lez v0, :cond_e

    .line 166
    .line 167
    invoke-static {p3}, Ljava/lang/Math;->signum(F)F

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    iget v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 172
    .line 173
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    cmpg-float v0, v0, v1

    .line 178
    .line 179
    const/4 v1, 0x0

    .line 180
    if-nez v0, :cond_c

    .line 181
    .line 182
    invoke-virtual {p0, p3}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪哲世苏(F)V

    .line 183
    .line 184
    .line 185
    iget-boolean p0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 186
    .line 187
    if-eqz p0, :cond_b

    .line 188
    .line 189
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(J)F

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    invoke-static {v1, p0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(FF)J

    .line 194
    .line 195
    .line 196
    move-result-wide p0

    .line 197
    goto :goto_4

    .line 198
    :cond_b
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(J)F

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    invoke-static {p0, v1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(FF)J

    .line 203
    .line 204
    .line 205
    move-result-wide p0

    .line 206
    :goto_4
    invoke-static {v7, v8, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 207
    .line 208
    .line 209
    move-result-wide p0

    .line 210
    new-instance p2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 211
    .line 212
    invoke-direct {p2, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 213
    .line 214
    .line 215
    return-object p2

    .line 216
    :cond_c
    invoke-virtual {p0, p3}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪哲世苏(F)V

    .line 217
    .line 218
    .line 219
    iget-boolean p0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 220
    .line 221
    const p3, 0x4008887b

    .line 222
    .line 223
    .line 224
    if-eqz p0, :cond_d

    .line 225
    .line 226
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(J)F

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    div-float/2addr p0, p3

    .line 231
    invoke-static {v1, p0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(FF)J

    .line 232
    .line 233
    .line 234
    move-result-wide p0

    .line 235
    goto :goto_5

    .line 236
    :cond_d
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(J)F

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    div-float/2addr p0, p3

    .line 241
    invoke-static {p0, v1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(FF)J

    .line 242
    .line 243
    .line 244
    move-result-wide p0

    .line 245
    :goto_5
    invoke-static {v7, v8, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 246
    .line 247
    .line 248
    move-result-wide p0

    .line 249
    new-instance p2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 250
    .line 251
    invoke-direct {p2, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 252
    .line 253
    .line 254
    return-object p2

    .line 255
    :cond_e
    new-instance p0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 256
    .line 257
    invoke-direct {p0, v7, v8}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 258
    .line 259
    .line 260
    return-object p0

    .line 261
    :cond_f
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 262
    .line 263
    .line 264
    return-object v3
.end method

.method public final 飘花落叶言子苏楪哲世兰(JJLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p5, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;

    .line 7
    .line 8
    iget v1, v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;->label:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;-><init>(Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v1, v6, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;->label:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x2

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    iget-wide p3, v6, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;->J$1:J

    .line 43
    .line 44
    invoke-static {p5}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_2
    invoke-static {p5}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object p5

    .line 58
    :cond_3
    invoke-static {p5}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-boolean p5, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 62
    .line 63
    const-wide/16 v7, 0x0

    .line 64
    .line 65
    if-nez p5, :cond_4

    .line 66
    .line 67
    new-instance p0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 68
    .line 69
    invoke-direct {p0, v7, v8}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_4
    iget p5, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 74
    .line 75
    invoke-static {p5}, Ljava/lang/Math;->abs(F)F

    .line 76
    .line 77
    .line 78
    move-result p5

    .line 79
    iget v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪苏兰:F

    .line 80
    .line 81
    cmpl-float p5, p5, v1

    .line 82
    .line 83
    if-lez p5, :cond_5

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_5
    const/4 v4, 0x0

    .line 87
    :goto_2
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世哲苏()Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;

    .line 88
    .line 89
    .line 90
    move-result-object p5

    .line 91
    invoke-virtual {p5}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Z

    .line 92
    .line 93
    .line 94
    move-result p5

    .line 95
    if-eq p5, v4, :cond_6

    .line 96
    .line 97
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪世哲苏()Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;

    .line 98
    .line 99
    .line 100
    move-result-object p5

    .line 101
    invoke-virtual {p5, v4}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 102
    .line 103
    .line 104
    :cond_6
    sget-object p5, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 105
    .line 106
    invoke-static {p0, p5}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p5

    .line 110
    if-nez p5, :cond_c

    .line 111
    .line 112
    iget-object p5, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 113
    .line 114
    if-eqz p5, :cond_7

    .line 115
    .line 116
    invoke-virtual {p5, v2}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 117
    .line 118
    .line 119
    :cond_7
    iget-boolean p5, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲楪兰:Z

    .line 120
    .line 121
    if-eqz p5, :cond_9

    .line 122
    .line 123
    iput-wide p1, v6, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;->J$0:J

    .line 124
    .line 125
    iput-wide p3, v6, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;->J$1:J

    .line 126
    .line 127
    iput v4, v6, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;->I$0:I

    .line 128
    .line 129
    iput v3, v6, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPostFling$1;->label:I

    .line 130
    .line 131
    iget-object v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;

    .line 132
    .line 133
    move-wide v2, p1

    .line 134
    move-wide v4, p3

    .line 135
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(JJLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p5

    .line 139
    if-ne p5, v0, :cond_8

    .line 140
    .line 141
    return-object v0

    .line 142
    :cond_8
    move-wide p3, v4

    .line 143
    :goto_3
    check-cast p5, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 144
    .line 145
    iget-wide v7, p5, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:J

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_9
    move-wide v4, p3

    .line 149
    :goto_4
    invoke-static {p3, p4, v7, v8}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(JJ)J

    .line 150
    .line 151
    .line 152
    move-result-wide p1

    .line 153
    iget-boolean p3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 154
    .line 155
    if-eqz p3, :cond_a

    .line 156
    .line 157
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(J)F

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    goto :goto_5

    .line 162
    :cond_a
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(J)F

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    :goto_5
    const p2, 0x3fc44428

    .line 167
    .line 168
    .line 169
    div-float/2addr p1, p2

    .line 170
    invoke-virtual {p0, p1}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪哲世苏(F)V

    .line 171
    .line 172
    .line 173
    iget-boolean p0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 174
    .line 175
    const/4 p2, 0x0

    .line 176
    if-eqz p0, :cond_b

    .line 177
    .line 178
    invoke-static {p2, p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(FF)J

    .line 179
    .line 180
    .line 181
    move-result-wide p0

    .line 182
    goto :goto_6

    .line 183
    :cond_b
    invoke-static {p1, p2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(FF)J

    .line 184
    .line 185
    .line 186
    move-result-wide p0

    .line 187
    :goto_6
    invoke-static {v7, v8, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 188
    .line 189
    .line 190
    move-result-wide p0

    .line 191
    new-instance p2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 192
    .line 193
    invoke-direct {p2, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 194
    .line 195
    .line 196
    return-object p2

    .line 197
    :cond_c
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 198
    .line 199
    .line 200
    return-object v2
.end method
