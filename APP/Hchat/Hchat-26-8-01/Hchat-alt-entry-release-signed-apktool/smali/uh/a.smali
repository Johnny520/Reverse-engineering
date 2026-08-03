.class public final Luh/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Luh/a;

.field public static final h:Luh/a;

.field public static final i:Luh/a;

.field public static final j:Luh/a;

.field public static final k:Luh/a;

.field public static final l:Luh/a;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:F

.field public final d:Luh/d;

.field public final e:Luh/d;

.field public final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 28

    .line 1
    new-instance v0, Luh/a;

    .line 2
    .line 3
    sget-wide v7, Lf1/w;->c:J

    .line 4
    .line 5
    const v9, 0x3d4ccccd    # 0.05f

    .line 6
    .line 7
    .line 8
    invoke-static {v7, v8, v9}, Lf1/w;->b(JF)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    const-wide/high16 v3, 0x400c000000000000L    # 3.5

    .line 13
    .line 14
    double-to-float v3, v3

    .line 15
    new-instance v4, Luh/d;

    .line 16
    .line 17
    new-instance v5, Luh/c;

    .line 18
    .line 19
    const/high16 v10, 0x3f000000    # 0.5f

    .line 20
    .line 21
    const/high16 v11, -0x41000000    # -0.5f

    .line 22
    .line 23
    invoke-direct {v5, v10, v10, v11}, Luh/c;-><init>(FFF)V

    .line 24
    .line 25
    .line 26
    const v6, 0x3e99999a    # 0.3f

    .line 27
    .line 28
    .line 29
    invoke-direct {v4, v5, v6}, Luh/d;-><init>(Luh/c;F)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Luh/d;

    .line 33
    .line 34
    new-instance v6, Luh/c;

    .line 35
    .line 36
    const v12, 0x3f19999a    # 0.6f

    .line 37
    .line 38
    .line 39
    invoke-direct {v6, v10, v12, v11}, Luh/c;-><init>(FFF)V

    .line 40
    .line 41
    .line 42
    const v13, 0x3e4ccccd    # 0.2f

    .line 43
    .line 44
    .line 45
    invoke-direct {v5, v6, v13}, Luh/d;-><init>(Luh/c;F)V

    .line 46
    .line 47
    .line 48
    const/16 v6, 0x22

    .line 49
    .line 50
    invoke-direct/range {v0 .. v6}, Luh/a;-><init>(JFLuh/d;Luh/d;I)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Luh/a;->g:Luh/a;

    .line 54
    .line 55
    new-instance v13, Luh/a;

    .line 56
    .line 57
    invoke-static {v7, v8, v9}, Lf1/w;->b(JF)J

    .line 58
    .line 59
    .line 60
    move-result-wide v14

    .line 61
    const-wide v0, 0x4006666666666666L    # 2.8

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    double-to-float v0, v0

    .line 67
    new-instance v1, Luh/d;

    .line 68
    .line 69
    new-instance v2, Luh/c;

    .line 70
    .line 71
    invoke-direct {v2, v10, v10, v11}, Luh/c;-><init>(FFF)V

    .line 72
    .line 73
    .line 74
    const v3, 0x3ecccccd    # 0.4f

    .line 75
    .line 76
    .line 77
    invoke-direct {v1, v2, v3}, Luh/d;-><init>(Luh/c;F)V

    .line 78
    .line 79
    .line 80
    new-instance v2, Luh/d;

    .line 81
    .line 82
    new-instance v4, Luh/c;

    .line 83
    .line 84
    const v5, 0x3f4ccccd    # 0.8f

    .line 85
    .line 86
    .line 87
    invoke-direct {v4, v10, v5, v11}, Luh/c;-><init>(FFF)V

    .line 88
    .line 89
    .line 90
    const/high16 v6, 0x3e800000    # 0.25f

    .line 91
    .line 92
    invoke-direct {v2, v4, v6}, Luh/d;-><init>(Luh/c;F)V

    .line 93
    .line 94
    .line 95
    const/16 v19, 0x22

    .line 96
    .line 97
    move/from16 v16, v0

    .line 98
    .line 99
    move-object/from16 v17, v1

    .line 100
    .line 101
    move-object/from16 v18, v2

    .line 102
    .line 103
    invoke-direct/range {v13 .. v19}, Luh/a;-><init>(JFLuh/d;Luh/d;I)V

    .line 104
    .line 105
    .line 106
    sput-object v13, Luh/a;->h:Luh/a;

    .line 107
    .line 108
    new-instance v14, Luh/a;

    .line 109
    .line 110
    invoke-static {v7, v8, v9}, Lf1/w;->b(JF)J

    .line 111
    .line 112
    .line 113
    move-result-wide v15

    .line 114
    const-wide v0, 0x4004cccccccccccdL    # 2.6

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    double-to-float v0, v0

    .line 120
    new-instance v1, Luh/d;

    .line 121
    .line 122
    new-instance v2, Luh/c;

    .line 123
    .line 124
    invoke-direct {v2, v10, v10, v11}, Luh/c;-><init>(FFF)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v1, v2, v12}, Luh/d;-><init>(Luh/c;F)V

    .line 128
    .line 129
    .line 130
    new-instance v2, Luh/d;

    .line 131
    .line 132
    new-instance v4, Luh/c;

    .line 133
    .line 134
    const v13, 0x3f733333    # 0.95f

    .line 135
    .line 136
    .line 137
    invoke-direct {v4, v10, v13, v11}, Luh/c;-><init>(FFF)V

    .line 138
    .line 139
    .line 140
    const v13, 0x3eb33333    # 0.35f

    .line 141
    .line 142
    .line 143
    invoke-direct {v2, v4, v13}, Luh/d;-><init>(Luh/c;F)V

    .line 144
    .line 145
    .line 146
    const/16 v20, 0x22

    .line 147
    .line 148
    move/from16 v17, v0

    .line 149
    .line 150
    move-object/from16 v18, v1

    .line 151
    .line 152
    move-object/from16 v19, v2

    .line 153
    .line 154
    invoke-direct/range {v14 .. v20}, Luh/a;-><init>(JFLuh/d;Luh/d;I)V

    .line 155
    .line 156
    .line 157
    sput-object v14, Luh/a;->i:Luh/a;

    .line 158
    .line 159
    new-instance v21, Luh/a;

    .line 160
    .line 161
    invoke-static {v7, v8, v9}, Lf1/w;->b(JF)J

    .line 162
    .line 163
    .line 164
    move-result-wide v22

    .line 165
    const-wide v0, 0x3ffb333333333333L    # 1.7

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    double-to-float v0, v0

    .line 171
    new-instance v1, Luh/d;

    .line 172
    .line 173
    new-instance v2, Luh/c;

    .line 174
    .line 175
    invoke-direct {v2, v10, v10, v11}, Luh/c;-><init>(FFF)V

    .line 176
    .line 177
    .line 178
    invoke-direct {v1, v2, v3}, Luh/d;-><init>(Luh/c;F)V

    .line 179
    .line 180
    .line 181
    new-instance v2, Luh/d;

    .line 182
    .line 183
    new-instance v3, Luh/c;

    .line 184
    .line 185
    invoke-direct {v3, v10, v12, v11}, Luh/c;-><init>(FFF)V

    .line 186
    .line 187
    .line 188
    invoke-direct {v2, v3, v6}, Luh/d;-><init>(Luh/c;F)V

    .line 189
    .line 190
    .line 191
    const/16 v27, 0x22

    .line 192
    .line 193
    move/from16 v24, v0

    .line 194
    .line 195
    move-object/from16 v25, v1

    .line 196
    .line 197
    move-object/from16 v26, v2

    .line 198
    .line 199
    invoke-direct/range {v21 .. v27}, Luh/a;-><init>(JFLuh/d;Luh/d;I)V

    .line 200
    .line 201
    .line 202
    sput-object v21, Luh/a;->j:Luh/a;

    .line 203
    .line 204
    new-instance v13, Luh/a;

    .line 205
    .line 206
    const v0, 0x3d75c28f    # 0.06f

    .line 207
    .line 208
    .line 209
    invoke-static {v7, v8, v0}, Lf1/w;->b(JF)J

    .line 210
    .line 211
    .line 212
    move-result-wide v14

    .line 213
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 214
    .line 215
    double-to-float v0, v0

    .line 216
    new-instance v1, Luh/d;

    .line 217
    .line 218
    new-instance v2, Luh/c;

    .line 219
    .line 220
    invoke-direct {v2, v10, v10, v11}, Luh/c;-><init>(FFF)V

    .line 221
    .line 222
    .line 223
    invoke-direct {v1, v2, v10}, Luh/d;-><init>(Luh/c;F)V

    .line 224
    .line 225
    .line 226
    new-instance v2, Luh/d;

    .line 227
    .line 228
    new-instance v3, Luh/c;

    .line 229
    .line 230
    invoke-direct {v3, v10, v5, v11}, Luh/c;-><init>(FFF)V

    .line 231
    .line 232
    .line 233
    invoke-direct {v2, v3, v6}, Luh/d;-><init>(Luh/c;F)V

    .line 234
    .line 235
    .line 236
    const/16 v19, 0x22

    .line 237
    .line 238
    move/from16 v16, v0

    .line 239
    .line 240
    move-object/from16 v17, v1

    .line 241
    .line 242
    move-object/from16 v18, v2

    .line 243
    .line 244
    invoke-direct/range {v13 .. v19}, Luh/a;-><init>(JFLuh/d;Luh/d;I)V

    .line 245
    .line 246
    .line 247
    sput-object v13, Luh/a;->k:Luh/a;

    .line 248
    .line 249
    new-instance v14, Luh/a;

    .line 250
    .line 251
    const v0, 0x3da3d70a    # 0.08f

    .line 252
    .line 253
    .line 254
    invoke-static {v7, v8, v0}, Lf1/w;->b(JF)J

    .line 255
    .line 256
    .line 257
    move-result-wide v15

    .line 258
    const-wide v0, 0x4002666666666666L    # 2.3

    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    double-to-float v0, v0

    .line 264
    new-instance v1, Luh/d;

    .line 265
    .line 266
    new-instance v2, Luh/c;

    .line 267
    .line 268
    invoke-direct {v2, v10, v10, v11}, Luh/c;-><init>(FFF)V

    .line 269
    .line 270
    .line 271
    invoke-direct {v1, v2, v12}, Luh/d;-><init>(Luh/c;F)V

    .line 272
    .line 273
    .line 274
    new-instance v2, Luh/d;

    .line 275
    .line 276
    new-instance v3, Luh/c;

    .line 277
    .line 278
    const v4, -0x4147ae14    # -0.36f

    .line 279
    .line 280
    .line 281
    const v5, 0x3f733333    # 0.95f

    .line 282
    .line 283
    .line 284
    invoke-direct {v3, v10, v5, v4}, Luh/c;-><init>(FFF)V

    .line 285
    .line 286
    .line 287
    invoke-direct {v2, v3, v6}, Luh/d;-><init>(Luh/c;F)V

    .line 288
    .line 289
    .line 290
    move/from16 v17, v0

    .line 291
    .line 292
    move-object/from16 v18, v1

    .line 293
    .line 294
    move-object/from16 v19, v2

    .line 295
    .line 296
    invoke-direct/range {v14 .. v20}, Luh/a;-><init>(JFLuh/d;Luh/d;I)V

    .line 297
    .line 298
    .line 299
    sput-object v14, Luh/a;->l:Luh/a;

    .line 300
    .line 301
    return-void
.end method

.method public constructor <init>(JFLuh/d;Luh/d;I)V
    .locals 8

    .line 1
    and-int/lit8 p6, p6, 0x20

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    :goto_0
    move v7, p6

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 p6, 0x1

    .line 9
    goto :goto_0

    .line 10
    :goto_1
    const/16 v3, 0xc

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    move-wide v1, p1

    .line 14
    move v4, p3

    .line 15
    move-object v5, p4

    .line 16
    move-object v6, p5

    .line 17
    invoke-direct/range {v0 .. v7}, Luh/a;-><init>(JIFLuh/d;Luh/d;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(JIFLuh/d;Luh/d;Z)V
    .locals 0

    .line 21
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-wide p1, p0, Luh/a;->a:J

    .line 24
    iput p3, p0, Luh/a;->b:I

    .line 25
    iput p4, p0, Luh/a;->c:F

    .line 26
    iput-object p5, p0, Luh/a;->d:Luh/d;

    .line 27
    iput-object p6, p0, Luh/a;->e:Luh/d;

    .line 28
    iput-boolean p7, p0, Luh/a;->f:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Luh/a;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Luh/a;

    .line 10
    .line 11
    iget-wide v0, p0, Luh/a;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, Luh/a;->a:J

    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3}, Lf1/w;->c(JJ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget v0, p0, Luh/a;->b:I

    .line 23
    .line 24
    iget v1, p1, Luh/a;->b:I

    .line 25
    .line 26
    if-ne v0, v1, :cond_7

    .line 27
    .line 28
    iget v0, p0, Luh/a;->c:F

    .line 29
    .line 30
    iget v1, p1, Luh/a;->c:F

    .line 31
    .line 32
    invoke-static {v0, v1}, Lu2/f;->b(FF)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    iget-object v0, p0, Luh/a;->d:Luh/d;

    .line 40
    .line 41
    iget-object v1, p1, Luh/a;->d:Luh/d;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    iget-object v0, p0, Luh/a;->e:Luh/d;

    .line 51
    .line 52
    iget-object v1, p1, Luh/a;->e:Luh/d;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_5
    iget-boolean v0, p0, Luh/a;->f:Z

    .line 62
    .line 63
    iget-boolean p1, p1, Luh/a;->f:Z

    .line 64
    .line 65
    if-eq v0, p1, :cond_6

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_6
    :goto_0
    const/4 p1, 0x1

    .line 69
    return p1

    .line 70
    :cond_7
    :goto_1
    const/4 p1, 0x0

    .line 71
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    sget v0, Lf1/w;->h:I

    .line 2
    .line 3
    iget-wide v0, p0, Luh/a;->a:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget v2, p0, Luh/a;->b:I

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v2, p0, Luh/a;->c:F

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Leh/a;->d(FII)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Luh/a;->d:Luh/d;

    .line 25
    .line 26
    invoke-virtual {v2}, Luh/d;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v2, v0

    .line 31
    mul-int/2addr v2, v1

    .line 32
    iget-object v0, p0, Luh/a;->e:Luh/d;

    .line 33
    .line 34
    invoke-virtual {v0}, Luh/d;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/2addr v0, v2

    .line 39
    mul-int/2addr v0, v1

    .line 40
    iget-boolean v1, p0, Luh/a;->f:Z

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v1, v0

    .line 47
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, Luh/a;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lf1/w;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Luh/a;->b:I

    .line 8
    .line 9
    invoke-static {v1}, Lf1/c0;->A(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Luh/a;->c:F

    .line 14
    .line 15
    invoke-static {v2}, Lu2/f;->c(F)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, ", blendMode="

    .line 20
    .line 21
    const-string v4, ", innerBlurRadius="

    .line 22
    .line 23
    const-string v5, "BloomStroke(color="

    .line 24
    .line 25
    invoke-static {v5, v0, v3, v1, v4}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", primaryLight="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Luh/a;->d:Luh/d;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", secondaryLight="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Luh/a;->e:Luh/d;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", dualPeak="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-boolean v1, p0, Luh/a;->f:Z

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ")"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0
.end method
