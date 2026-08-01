.class public final Lla;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final η:Lla;

.field public static final θ:Lla;

.field public static final ι:Lla;

.field public static final κ:Lla;

.field public static final λ:Lla;

.field public static final μ:Lla;


# instance fields
.field public final α:J

.field public final β:I

.field public final γ:F

.field public final δ:Lpr0;

.field public final ε:Lpr0;

.field public final ζ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 28

    .line 1
    new-instance v0, Lla;

    .line 2
    .line 3
    sget-wide v7, Lci;->γ:J

    .line 4
    .line 5
    const v9, 0x3d4ccccd    # 0.05f

    .line 6
    .line 7
    .line 8
    invoke-static {v7, v8, v9}, Lci;->β(JF)J

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
    new-instance v4, Lpr0;

    .line 16
    .line 17
    new-instance v5, Lor0;

    .line 18
    .line 19
    const/high16 v10, 0x3f000000    # 0.5f

    .line 20
    .line 21
    const/high16 v11, -0x41000000    # -0.5f

    .line 22
    .line 23
    invoke-direct {v5, v10, v11}, Lor0;-><init>(FF)V

    .line 24
    .line 25
    .line 26
    const v6, 0x3e99999a    # 0.3f

    .line 27
    .line 28
    .line 29
    invoke-direct {v4, v5, v6}, Lpr0;-><init>(Lor0;F)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lpr0;

    .line 33
    .line 34
    new-instance v6, Lor0;

    .line 35
    .line 36
    const v12, 0x3f19999a    # 0.6f

    .line 37
    .line 38
    .line 39
    invoke-direct {v6, v12, v11}, Lor0;-><init>(FF)V

    .line 40
    .line 41
    .line 42
    const v13, 0x3e4ccccd    # 0.2f

    .line 43
    .line 44
    .line 45
    invoke-direct {v5, v6, v13}, Lpr0;-><init>(Lor0;F)V

    .line 46
    .line 47
    .line 48
    const/16 v6, 0x22

    .line 49
    .line 50
    invoke-direct/range {v0 .. v6}, Lla;-><init>(JFLpr0;Lpr0;I)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lla;->η:Lla;

    .line 54
    .line 55
    new-instance v13, Lla;

    .line 56
    .line 57
    invoke-static {v7, v8, v9}, Lci;->β(JF)J

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
    new-instance v1, Lpr0;

    .line 68
    .line 69
    new-instance v2, Lor0;

    .line 70
    .line 71
    invoke-direct {v2, v10, v11}, Lor0;-><init>(FF)V

    .line 72
    .line 73
    .line 74
    const v3, 0x3ecccccd    # 0.4f

    .line 75
    .line 76
    .line 77
    invoke-direct {v1, v2, v3}, Lpr0;-><init>(Lor0;F)V

    .line 78
    .line 79
    .line 80
    new-instance v2, Lpr0;

    .line 81
    .line 82
    new-instance v4, Lor0;

    .line 83
    .line 84
    const v5, 0x3f4ccccd    # 0.8f

    .line 85
    .line 86
    .line 87
    invoke-direct {v4, v5, v11}, Lor0;-><init>(FF)V

    .line 88
    .line 89
    .line 90
    const/high16 v6, 0x3e800000    # 0.25f

    .line 91
    .line 92
    invoke-direct {v2, v4, v6}, Lpr0;-><init>(Lor0;F)V

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
    invoke-direct/range {v13 .. v19}, Lla;-><init>(JFLpr0;Lpr0;I)V

    .line 104
    .line 105
    .line 106
    sput-object v13, Lla;->θ:Lla;

    .line 107
    .line 108
    new-instance v14, Lla;

    .line 109
    .line 110
    invoke-static {v7, v8, v9}, Lci;->β(JF)J

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
    new-instance v1, Lpr0;

    .line 121
    .line 122
    new-instance v2, Lor0;

    .line 123
    .line 124
    invoke-direct {v2, v10, v11}, Lor0;-><init>(FF)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v1, v2, v12}, Lpr0;-><init>(Lor0;F)V

    .line 128
    .line 129
    .line 130
    new-instance v2, Lpr0;

    .line 131
    .line 132
    new-instance v4, Lor0;

    .line 133
    .line 134
    const v13, 0x3f733333    # 0.95f

    .line 135
    .line 136
    .line 137
    invoke-direct {v4, v13, v11}, Lor0;-><init>(FF)V

    .line 138
    .line 139
    .line 140
    const v13, 0x3eb33333    # 0.35f

    .line 141
    .line 142
    .line 143
    invoke-direct {v2, v4, v13}, Lpr0;-><init>(Lor0;F)V

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
    invoke-direct/range {v14 .. v20}, Lla;-><init>(JFLpr0;Lpr0;I)V

    .line 155
    .line 156
    .line 157
    sput-object v14, Lla;->ι:Lla;

    .line 158
    .line 159
    new-instance v21, Lla;

    .line 160
    .line 161
    invoke-static {v7, v8, v9}, Lci;->β(JF)J

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
    new-instance v1, Lpr0;

    .line 172
    .line 173
    new-instance v2, Lor0;

    .line 174
    .line 175
    invoke-direct {v2, v10, v11}, Lor0;-><init>(FF)V

    .line 176
    .line 177
    .line 178
    invoke-direct {v1, v2, v3}, Lpr0;-><init>(Lor0;F)V

    .line 179
    .line 180
    .line 181
    new-instance v2, Lpr0;

    .line 182
    .line 183
    new-instance v3, Lor0;

    .line 184
    .line 185
    invoke-direct {v3, v12, v11}, Lor0;-><init>(FF)V

    .line 186
    .line 187
    .line 188
    invoke-direct {v2, v3, v6}, Lpr0;-><init>(Lor0;F)V

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
    invoke-direct/range {v21 .. v27}, Lla;-><init>(JFLpr0;Lpr0;I)V

    .line 200
    .line 201
    .line 202
    sput-object v21, Lla;->κ:Lla;

    .line 203
    .line 204
    new-instance v13, Lla;

    .line 205
    .line 206
    const v0, 0x3d75c28f    # 0.06f

    .line 207
    .line 208
    .line 209
    invoke-static {v7, v8, v0}, Lci;->β(JF)J

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
    new-instance v1, Lpr0;

    .line 217
    .line 218
    new-instance v2, Lor0;

    .line 219
    .line 220
    invoke-direct {v2, v10, v11}, Lor0;-><init>(FF)V

    .line 221
    .line 222
    .line 223
    invoke-direct {v1, v2, v10}, Lpr0;-><init>(Lor0;F)V

    .line 224
    .line 225
    .line 226
    new-instance v2, Lpr0;

    .line 227
    .line 228
    new-instance v3, Lor0;

    .line 229
    .line 230
    invoke-direct {v3, v5, v11}, Lor0;-><init>(FF)V

    .line 231
    .line 232
    .line 233
    invoke-direct {v2, v3, v6}, Lpr0;-><init>(Lor0;F)V

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
    invoke-direct/range {v13 .. v19}, Lla;-><init>(JFLpr0;Lpr0;I)V

    .line 245
    .line 246
    .line 247
    sput-object v13, Lla;->λ:Lla;

    .line 248
    .line 249
    new-instance v14, Lla;

    .line 250
    .line 251
    const v0, 0x3da3d70a    # 0.08f

    .line 252
    .line 253
    .line 254
    invoke-static {v7, v8, v0}, Lci;->β(JF)J

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
    new-instance v1, Lpr0;

    .line 265
    .line 266
    new-instance v2, Lor0;

    .line 267
    .line 268
    invoke-direct {v2, v10, v11}, Lor0;-><init>(FF)V

    .line 269
    .line 270
    .line 271
    invoke-direct {v1, v2, v12}, Lpr0;-><init>(Lor0;F)V

    .line 272
    .line 273
    .line 274
    new-instance v2, Lpr0;

    .line 275
    .line 276
    new-instance v3, Lor0;

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
    invoke-direct {v3, v5, v4}, Lor0;-><init>(FF)V

    .line 285
    .line 286
    .line 287
    invoke-direct {v2, v3, v6}, Lpr0;-><init>(Lor0;F)V

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
    invoke-direct/range {v14 .. v20}, Lla;-><init>(JFLpr0;Lpr0;I)V

    .line 297
    .line 298
    .line 299
    sput-object v14, Lla;->μ:Lla;

    .line 300
    .line 301
    return-void
.end method

.method public constructor <init>(JFLpr0;Lpr0;I)V
    .locals 0

    .line 1
    and-int/lit8 p6, p6, 0x20

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p6, 0x1

    .line 8
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-wide p1, p0, Lla;->α:J

    .line 12
    .line 13
    const/16 p1, 0xc

    .line 14
    .line 15
    iput p1, p0, Lla;->β:I

    .line 16
    .line 17
    iput p3, p0, Lla;->γ:F

    .line 18
    .line 19
    iput-object p4, p0, Lla;->δ:Lpr0;

    .line 20
    .line 21
    iput-object p5, p0, Lla;->ε:Lpr0;

    .line 22
    .line 23
    iput-boolean p6, p0, Lla;->ζ:Z

    .line 24
    .line 25
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
    instance-of v0, p1, Lla;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lla;

    .line 10
    .line 11
    iget-wide v0, p0, Lla;->α:J

    .line 12
    .line 13
    iget-wide v2, p1, Lla;->α:J

    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3}, Lci;->γ(JJ)Z

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
    iget v0, p0, Lla;->β:I

    .line 23
    .line 24
    iget v1, p1, Lla;->β:I

    .line 25
    .line 26
    if-ne v0, v1, :cond_7

    .line 27
    .line 28
    iget v0, p0, Lla;->γ:F

    .line 29
    .line 30
    iget v1, p1, Lla;->γ:F

    .line 31
    .line 32
    invoke-static {v0, v1}, Liv;->β(FF)Z

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
    iget-object v0, p0, Lla;->δ:Lpr0;

    .line 40
    .line 41
    iget-object v1, p1, Lla;->δ:Lpr0;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lla;->ε:Lpr0;

    .line 51
    .line 52
    iget-object v1, p1, Lla;->ε:Lpr0;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean p0, p0, Lla;->ζ:Z

    .line 62
    .line 63
    iget-boolean p1, p1, Lla;->ζ:Z

    .line 64
    .line 65
    if-eq p0, p1, :cond_6

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_6
    :goto_0
    const/4 p0, 0x1

    .line 69
    return p0

    .line 70
    :cond_7
    :goto_1
    const/4 p0, 0x0

    .line 71
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    sget v0, Lci;->θ:I

    .line 2
    .line 3
    iget-wide v0, p0, Lla;->α:J

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
    iget v2, p0, Lla;->β:I

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v2, p0, Lla;->γ:F

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lla;->δ:Lpr0;

    .line 25
    .line 26
    invoke-virtual {v2}, Lpr0;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v2, v0

    .line 31
    mul-int/2addr v2, v1

    .line 32
    iget-object v0, p0, Lla;->ε:Lpr0;

    .line 33
    .line 34
    invoke-virtual {v0}, Lpr0;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/2addr v0, v2

    .line 39
    mul-int/2addr v0, v1

    .line 40
    iget-boolean p0, p0, Lla;->ζ:Z

    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, Lla;->α:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lci;->ι(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lla;->β:I

    .line 8
    .line 9
    invoke-static {v1}, Lxb;->г(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Lla;->γ:F

    .line 14
    .line 15
    invoke-static {v2}, Liv;->γ(F)Ljava/lang/String;

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
    invoke-static {v5, v0, v3, v1, v4}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    iget-object v1, p0, Lla;->δ:Lpr0;

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
    iget-object v1, p0, Lla;->ε:Lpr0;

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
    iget-boolean p0, p0, Lla;->ζ:Z

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p0, ")"

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method
