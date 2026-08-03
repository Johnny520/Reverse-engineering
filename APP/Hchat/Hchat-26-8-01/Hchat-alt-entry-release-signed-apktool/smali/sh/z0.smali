.class public final synthetic Lsh/z0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lfg/a;

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Llg/a;

.field public final synthetic j:Z

.field public final synthetic k:J

.field public final synthetic l:Z

.field public final synthetic m:[F

.field public final synthetic n:J

.field public final synthetic o:J

.field public final synthetic p:J


# direct methods
.method public synthetic constructor <init>(Lfg/a;Lfg/a;Llg/a;ZJZ[FJJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/z0;->g:Lfg/a;

    .line 5
    .line 6
    iput-object p2, p0, Lsh/z0;->h:Lfg/a;

    .line 7
    .line 8
    iput-object p3, p0, Lsh/z0;->i:Llg/a;

    .line 9
    .line 10
    iput-boolean p4, p0, Lsh/z0;->j:Z

    .line 11
    .line 12
    iput-wide p5, p0, Lsh/z0;->k:J

    .line 13
    .line 14
    iput-boolean p7, p0, Lsh/z0;->l:Z

    .line 15
    .line 16
    iput-object p8, p0, Lsh/z0;->m:[F

    .line 17
    .line 18
    iput-wide p9, p0, Lsh/z0;->n:J

    .line 19
    .line 20
    iput-wide p11, p0, Lsh/z0;->o:J

    .line 21
    .line 22
    iput-wide p13, p0, Lsh/z0;->p:J

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lh1/d;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Lh1/d;->a()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const-wide v9, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr v2, v9

    .line 20
    long-to-int v2, v2

    .line 21
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    invoke-interface {v1}, Lh1/d;->a()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    const/16 v11, 0x20

    .line 30
    .line 31
    shr-long/2addr v2, v11

    .line 32
    long-to-int v2, v2

    .line 33
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-object v3, v0, Lsh/z0;->g:Lfg/a;

    .line 38
    .line 39
    invoke-interface {v3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    iget-object v4, v0, Lsh/z0;->h:Lfg/a;

    .line 50
    .line 51
    invoke-interface {v4}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result v12

    .line 61
    iget-object v4, v0, Lsh/z0;->i:Llg/a;

    .line 62
    .line 63
    iget v5, v4, Llg/a;->a:F

    .line 64
    .line 65
    sub-float/2addr v3, v5

    .line 66
    iget v4, v4, Llg/a;->b:F

    .line 67
    .line 68
    sub-float/2addr v4, v5

    .line 69
    div-float/2addr v3, v4

    .line 70
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    div-float v13, v8, v4

    .line 73
    .line 74
    mul-float/2addr v4, v13

    .line 75
    sub-float v4, v2, v4

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    cmpg-float v6, v4, v5

    .line 79
    .line 80
    if-gez v6, :cond_0

    .line 81
    .line 82
    move v14, v5

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    move v14, v4

    .line 85
    :goto_0
    iget-boolean v15, v0, Lsh/z0;->j:Z

    .line 86
    .line 87
    const/high16 v16, 0x3f800000    # 1.0f

    .line 88
    .line 89
    if-eqz v15, :cond_1

    .line 90
    .line 91
    sub-float v3, v16, v3

    .line 92
    .line 93
    :cond_1
    mul-float/2addr v3, v14

    .line 94
    add-float v17, v3, v13

    .line 95
    .line 96
    if-eqz v15, :cond_2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    move v2, v5

    .line 100
    :goto_1
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    int-to-long v2, v2

    .line 105
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    int-to-long v4, v4

    .line 110
    shl-long/2addr v2, v11

    .line 111
    and-long/2addr v4, v9

    .line 112
    or-long/2addr v4, v2

    .line 113
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    int-to-long v2, v2

    .line 118
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    int-to-long v6, v6

    .line 123
    shl-long/2addr v2, v11

    .line 124
    and-long/2addr v6, v9

    .line 125
    or-long/2addr v6, v2

    .line 126
    iget-wide v2, v0, Lsh/z0;->k:J

    .line 127
    .line 128
    invoke-interface/range {v1 .. v8}, Lh1/d;->a0(JJJF)V

    .line 129
    .line 130
    .line 131
    iget-boolean v2, v0, Lsh/z0;->l:Z

    .line 132
    .line 133
    if-eqz v2, :cond_3

    .line 134
    .line 135
    iget-object v2, v0, Lsh/z0;->m:[F

    .line 136
    .line 137
    array-length v3, v2

    .line 138
    if-nez v3, :cond_4

    .line 139
    .line 140
    :cond_3
    move-wide/from16 v18, v9

    .line 141
    .line 142
    move/from16 p1, v11

    .line 143
    .line 144
    move/from16 v20, v12

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_4
    const/high16 v3, 0x40f00000    # 7.5f

    .line 148
    .line 149
    div-float v4, v8, v3

    .line 150
    .line 151
    array-length v8, v2

    .line 152
    const/4 v3, 0x0

    .line 153
    :goto_2
    if-ge v3, v8, :cond_3

    .line 154
    .line 155
    aget v5, v2, v3

    .line 156
    .line 157
    if-eqz v15, :cond_5

    .line 158
    .line 159
    sub-float v5, v16, v5

    .line 160
    .line 161
    :cond_5
    mul-float/2addr v5, v14

    .line 162
    add-float/2addr v5, v13

    .line 163
    if-eqz v15, :cond_6

    .line 164
    .line 165
    cmpl-float v6, v5, v17

    .line 166
    .line 167
    if-ltz v6, :cond_7

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_6
    cmpg-float v6, v5, v17

    .line 171
    .line 172
    if-gtz v6, :cond_7

    .line 173
    .line 174
    :goto_3
    iget-wide v6, v0, Lsh/z0;->n:J

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_7
    iget-wide v6, v0, Lsh/z0;->o:J

    .line 178
    .line 179
    :goto_4
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    move-wide/from16 v18, v9

    .line 184
    .line 185
    int-to-long v9, v5

    .line 186
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    move/from16 p1, v11

    .line 191
    .line 192
    move/from16 v20, v12

    .line 193
    .line 194
    int-to-long v11, v5

    .line 195
    shl-long v9, v9, p1

    .line 196
    .line 197
    and-long v11, v11, v18

    .line 198
    .line 199
    or-long/2addr v9, v11

    .line 200
    move v5, v3

    .line 201
    move-wide/from16 v21, v6

    .line 202
    .line 203
    move-object v6, v2

    .line 204
    move-wide/from16 v2, v21

    .line 205
    .line 206
    const/16 v7, 0x78

    .line 207
    .line 208
    move-wide/from16 v21, v9

    .line 209
    .line 210
    move v9, v5

    .line 211
    move-object v10, v6

    .line 212
    move-wide/from16 v5, v21

    .line 213
    .line 214
    invoke-static/range {v1 .. v7}, Lh1/d;->O(Lh1/d;JFJI)V

    .line 215
    .line 216
    .line 217
    add-int/lit8 v3, v9, 0x1

    .line 218
    .line 219
    move/from16 v11, p1

    .line 220
    .line 221
    move-object v2, v10

    .line 222
    move-wide/from16 v9, v18

    .line 223
    .line 224
    move/from16 v12, v20

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :goto_5
    const v2, 0x3f3851ec    # 0.72f

    .line 228
    .line 229
    .line 230
    mul-float/2addr v2, v13

    .line 231
    mul-float v4, v2, v20

    .line 232
    .line 233
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    int-to-long v2, v2

    .line 238
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    int-to-long v5, v5

    .line 243
    shl-long v2, v2, p1

    .line 244
    .line 245
    and-long v5, v5, v18

    .line 246
    .line 247
    or-long/2addr v5, v2

    .line 248
    const/16 v7, 0x78

    .line 249
    .line 250
    iget-wide v2, v0, Lsh/z0;->p:J

    .line 251
    .line 252
    invoke-static/range {v1 .. v7}, Lh1/d;->O(Lh1/d;JFJI)V

    .line 253
    .line 254
    .line 255
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 256
    .line 257
    return-object v1
.end method
