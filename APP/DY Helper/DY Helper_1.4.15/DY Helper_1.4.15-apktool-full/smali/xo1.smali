.class public final Lxo1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Liv1;


# instance fields
.field public final α:Lea1;

.field public final β:Lea1;

.field public final γ:Lea1;

.field public final δ:Lea1;


# direct methods
.method public constructor <init>(Lea1;Lea1;Lea1;Lea1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxo1;->α:Lea1;

    .line 5
    .line 6
    iput-object p2, p0, Lxo1;->β:Lea1;

    .line 7
    .line 8
    iput-object p3, p0, Lxo1;->γ:Lea1;

    .line 9
    .line 10
    iput-object p4, p0, Lxo1;->δ:Lea1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lxo1;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lxo1;

    .line 10
    .line 11
    iget-object v0, p1, Lxo1;->α:Lea1;

    .line 12
    .line 13
    iget-object v1, p0, Lxo1;->α:Lea1;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lea1;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lxo1;->β:Lea1;

    .line 23
    .line 24
    iget-object v1, p1, Lxo1;->β:Lea1;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lea1;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, Lxo1;->γ:Lea1;

    .line 34
    .line 35
    iget-object v1, p1, Lxo1;->γ:Lea1;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lea1;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object p0, p0, Lxo1;->δ:Lea1;

    .line 45
    .line 46
    iget-object p1, p1, Lxo1;->δ:Lea1;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lea1;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    :goto_0
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 57
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lxo1;->α:Lea1;

    .line 2
    .line 3
    iget v0, v0, Lea1;->α:F

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

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
    iget-object v2, p0, Lxo1;->β:Lea1;

    .line 13
    .line 14
    iget v2, v2, Lea1;->α:F

    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v2, p0, Lxo1;->γ:Lea1;

    .line 21
    .line 22
    iget v2, v2, Lea1;->α:F

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, Lxo1;->δ:Lea1;

    .line 29
    .line 30
    iget p0, p0, Lea1;->α:F

    .line 31
    .line 32
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "RoundedCornerShape(topStart = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lxo1;->α:Lea1;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", topEnd = "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lxo1;->β:Lea1;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", bottomEnd = "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lxo1;->γ:Lea1;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", bottomStart = "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lxo1;->δ:Lea1;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 p0, 0x29

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public final α(JLnp0;Lyr;)Lu81;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    iget-object v4, v0, Lxo1;->α:Lea1;

    .line 8
    .line 9
    invoke-virtual {v4, v1, v2}, Lea1;->α(J)F

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget-object v5, v0, Lxo1;->β:Lea1;

    .line 14
    .line 15
    invoke-virtual {v5, v1, v2}, Lea1;->α(J)F

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    iget-object v6, v0, Lxo1;->γ:Lea1;

    .line 20
    .line 21
    invoke-virtual {v6, v1, v2}, Lea1;->α(J)F

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    iget-object v0, v0, Lxo1;->δ:Lea1;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lea1;->α(J)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v1, v2}, Ljw1;->β(J)F

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    add-float v8, v4, v0

    .line 36
    .line 37
    cmpl-float v9, v8, v7

    .line 38
    .line 39
    if-lez v9, :cond_0

    .line 40
    .line 41
    div-float v8, v7, v8

    .line 42
    .line 43
    mul-float/2addr v4, v8

    .line 44
    mul-float/2addr v0, v8

    .line 45
    :cond_0
    add-float v8, v5, v6

    .line 46
    .line 47
    cmpl-float v9, v8, v7

    .line 48
    .line 49
    if-lez v9, :cond_1

    .line 50
    .line 51
    div-float/2addr v7, v8

    .line 52
    mul-float/2addr v5, v7

    .line 53
    mul-float/2addr v6, v7

    .line 54
    :cond_1
    const/4 v7, 0x0

    .line 55
    cmpl-float v8, v4, v7

    .line 56
    .line 57
    if-ltz v8, :cond_2

    .line 58
    .line 59
    cmpl-float v8, v5, v7

    .line 60
    .line 61
    if-ltz v8, :cond_2

    .line 62
    .line 63
    cmpl-float v8, v6, v7

    .line 64
    .line 65
    if-ltz v8, :cond_2

    .line 66
    .line 67
    cmpl-float v8, v0, v7

    .line 68
    .line 69
    if-ltz v8, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v9, "Corner size in Px can\'t be negative(topStart = "

    .line 75
    .line 76
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v9, ", topEnd = "

    .line 83
    .line 84
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v9, ", bottomEnd = "

    .line 91
    .line 92
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v9, ", bottomStart = "

    .line 99
    .line 100
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v9, ")!"

    .line 107
    .line 108
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-static {v8}, Ldm0;->α(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :goto_0
    add-float v8, v4, v5

    .line 119
    .line 120
    add-float/2addr v8, v6

    .line 121
    add-float/2addr v8, v0

    .line 122
    cmpg-float v7, v8, v7

    .line 123
    .line 124
    const-wide/16 v8, 0x0

    .line 125
    .line 126
    if-nez v7, :cond_3

    .line 127
    .line 128
    new-instance v0, Ls81;

    .line 129
    .line 130
    invoke-static {v8, v9, v1, v2}, Li91;->δ(JJ)Lml1;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-direct {v0, v1}, Ls81;-><init>(Lml1;)V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :cond_3
    new-instance v7, Lt81;

    .line 139
    .line 140
    invoke-static {v8, v9, v1, v2}, Li91;->δ(JJ)Lml1;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    sget-object v2, Lnp0;->ε:Lnp0;

    .line 145
    .line 146
    if-ne v3, v2, :cond_4

    .line 147
    .line 148
    move v8, v4

    .line 149
    goto :goto_1

    .line 150
    :cond_4
    move v8, v5

    .line 151
    :goto_1
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    int-to-long v9, v9

    .line 156
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    int-to-long v11, v8

    .line 161
    const/16 v8, 0x20

    .line 162
    .line 163
    shl-long/2addr v9, v8

    .line 164
    const-wide v13, 0xffffffffL

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    and-long/2addr v11, v13

    .line 170
    or-long v20, v9, v11

    .line 171
    .line 172
    if-ne v3, v2, :cond_5

    .line 173
    .line 174
    move v4, v5

    .line 175
    :cond_5
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    int-to-long v9, v5

    .line 180
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    int-to-long v4, v4

    .line 185
    shl-long/2addr v9, v8

    .line 186
    and-long/2addr v4, v13

    .line 187
    or-long v22, v9, v4

    .line 188
    .line 189
    if-ne v3, v2, :cond_6

    .line 190
    .line 191
    move v4, v6

    .line 192
    goto :goto_2

    .line 193
    :cond_6
    move v4, v0

    .line 194
    :goto_2
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    int-to-long v9, v5

    .line 199
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    int-to-long v4, v4

    .line 204
    shl-long/2addr v9, v8

    .line 205
    and-long/2addr v4, v13

    .line 206
    or-long v24, v9, v4

    .line 207
    .line 208
    if-ne v3, v2, :cond_7

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_7
    move v0, v6

    .line 212
    :goto_3
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    int-to-long v2, v2

    .line 217
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    int-to-long v4, v0

    .line 222
    shl-long/2addr v2, v8

    .line 223
    and-long/2addr v4, v13

    .line 224
    or-long v26, v2, v4

    .line 225
    .line 226
    new-instance v15, Lwo1;

    .line 227
    .line 228
    iget v0, v1, Lml1;->α:F

    .line 229
    .line 230
    iget v2, v1, Lml1;->β:F

    .line 231
    .line 232
    iget v3, v1, Lml1;->γ:F

    .line 233
    .line 234
    iget v1, v1, Lml1;->δ:F

    .line 235
    .line 236
    move/from16 v16, v0

    .line 237
    .line 238
    move/from16 v19, v1

    .line 239
    .line 240
    move/from16 v17, v2

    .line 241
    .line 242
    move/from16 v18, v3

    .line 243
    .line 244
    invoke-direct/range {v15 .. v27}, Lwo1;-><init>(FFFFJJJJ)V

    .line 245
    .line 246
    .line 247
    invoke-direct {v7, v15}, Lt81;-><init>(Lwo1;)V

    .line 248
    .line 249
    .line 250
    return-object v7
.end method
