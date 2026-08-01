.class public final Lk91;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lqp0;
.implements Lbw;


# instance fields
.field public τ:Lba;

.field public υ:Z

.field public φ:Laa;

.field public χ:Li2;

.field public ψ:F


# direct methods
.method public static В(J)Z
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, v0, v1}, Ljw1;->α(JJ)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide v0, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long/2addr p0, v0

    .line 18
    long-to-int p0, p0

    .line 19
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    const p1, 0x7fffffff

    .line 28
    .line 29
    .line 30
    and-int/2addr p0, p1

    .line 31
    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 32
    .line 33
    if-ge p0, p1, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static Г(J)Z
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, v0, v1}, Ljw1;->α(JJ)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x20

    .line 13
    .line 14
    shr-long/2addr p0, v0

    .line 15
    long-to-int p0, p0

    .line 16
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    const p1, 0x7fffffff

    .line 25
    .line 26
    .line 27
    and-int/2addr p0, p1

    .line 28
    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 29
    .line 30
    if-ge p0, p1, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PainterModifier(painter="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lk91;->τ:Lba;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", sizeToIntrinsics="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lk91;->υ:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", alignment="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lk91;->φ:Laa;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", alpha="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget p0, p0, Lk91;->ψ:F

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ", colorFilter=null)"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

.method public final Μ(Laq0;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Laq0;->ε:Lfe;

    .line 6
    .line 7
    iget-object v3, v0, Lk91;->τ:Lba;

    .line 8
    .line 9
    iget-wide v3, v3, Lba;->ζ:J

    .line 10
    .line 11
    invoke-static {v3, v4}, Ls1;->Ζ(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    invoke-static {v3, v4}, Lk91;->Г(J)Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const/16 v6, 0x20

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    shr-long v7, v3, v6

    .line 24
    .line 25
    long-to-int v5, v7

    .line 26
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {v2}, Lcw;->α()J

    .line 32
    .line 33
    .line 34
    move-result-wide v7

    .line 35
    shr-long/2addr v7, v6

    .line 36
    long-to-int v5, v7

    .line 37
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    :goto_0
    invoke-static {v3, v4}, Lk91;->В(J)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-wide v8, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    if-eqz v7, :cond_1

    .line 51
    .line 52
    and-long/2addr v3, v8

    .line 53
    long-to-int v3, v3

    .line 54
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-interface {v2}, Lcw;->α()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    and-long/2addr v3, v8

    .line 64
    long-to-int v3, v3

    .line 65
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    :goto_1
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    int-to-long v4, v4

    .line 74
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    int-to-long v10, v3

    .line 79
    shl-long v3, v4, v6

    .line 80
    .line 81
    and-long/2addr v10, v8

    .line 82
    or-long/2addr v3, v10

    .line 83
    invoke-interface {v2}, Lcw;->α()J

    .line 84
    .line 85
    .line 86
    move-result-wide v10

    .line 87
    shr-long/2addr v10, v6

    .line 88
    long-to-int v5, v10

    .line 89
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    const/4 v7, 0x0

    .line 94
    cmpg-float v5, v5, v7

    .line 95
    .line 96
    if-nez v5, :cond_2

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    invoke-interface {v2}, Lcw;->α()J

    .line 100
    .line 101
    .line 102
    move-result-wide v10

    .line 103
    and-long/2addr v10, v8

    .line 104
    long-to-int v5, v10

    .line 105
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    cmpg-float v5, v5, v7

    .line 110
    .line 111
    if-nez v5, :cond_3

    .line 112
    .line 113
    :goto_2
    const-wide/16 v3, 0x0

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    iget-object v5, v0, Lk91;->χ:Li2;

    .line 117
    .line 118
    invoke-interface {v2}, Lcw;->α()J

    .line 119
    .line 120
    .line 121
    move-result-wide v10

    .line 122
    invoke-virtual {v5, v3, v4, v10, v11}, Li2;->κ(JJ)J

    .line 123
    .line 124
    .line 125
    move-result-wide v10

    .line 126
    invoke-static {v3, v4, v10, v11}, Lg81;->χ(JJ)J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    :goto_3
    iget-object v10, v0, Lk91;->φ:Laa;

    .line 131
    .line 132
    shr-long v11, v3, v6

    .line 133
    .line 134
    long-to-int v5, v11

    .line 135
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    and-long v11, v3, v8

    .line 144
    .line 145
    long-to-int v7, v11

    .line 146
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    int-to-long v11, v5

    .line 155
    shl-long/2addr v11, v6

    .line 156
    int-to-long v13, v7

    .line 157
    and-long/2addr v13, v8

    .line 158
    or-long/2addr v11, v13

    .line 159
    invoke-interface {v2}, Lcw;->α()J

    .line 160
    .line 161
    .line 162
    move-result-wide v13

    .line 163
    shr-long/2addr v13, v6

    .line 164
    long-to-int v5, v13

    .line 165
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    invoke-interface {v2}, Lcw;->α()J

    .line 174
    .line 175
    .line 176
    move-result-wide v13

    .line 177
    and-long/2addr v13, v8

    .line 178
    long-to-int v7, v13

    .line 179
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    int-to-long v13, v5

    .line 188
    shl-long/2addr v13, v6

    .line 189
    move v5, v6

    .line 190
    int-to-long v6, v7

    .line 191
    and-long/2addr v6, v8

    .line 192
    or-long/2addr v13, v6

    .line 193
    invoke-virtual {v1}, Laq0;->getLayoutDirection()Lnp0;

    .line 194
    .line 195
    .line 196
    move-result-object v15

    .line 197
    invoke-virtual/range {v10 .. v15}, Laa;->α(JJLnp0;)J

    .line 198
    .line 199
    .line 200
    move-result-wide v6

    .line 201
    shr-long v10, v6, v5

    .line 202
    .line 203
    long-to-int v5, v10

    .line 204
    int-to-float v5, v5

    .line 205
    and-long/2addr v6, v8

    .line 206
    long-to-int v6, v6

    .line 207
    int-to-float v6, v6

    .line 208
    iget-object v7, v2, Lfe;->ζ:Lm6;

    .line 209
    .line 210
    iget-object v7, v7, Lm6;->ζ:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v7, Ln;

    .line 213
    .line 214
    invoke-virtual {v7, v5, v6}, Ln;->Η(FF)V

    .line 215
    .line 216
    .line 217
    :try_start_0
    iget-object v7, v0, Lk91;->τ:Lba;

    .line 218
    .line 219
    iget v0, v0, Lk91;->ψ:F

    .line 220
    .line 221
    invoke-virtual {v7, v1, v3, v4, v0}, Lba;->α(Laq0;JF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    .line 223
    .line 224
    iget-object v0, v2, Lfe;->ζ:Lm6;

    .line 225
    .line 226
    iget-object v0, v0, Lm6;->ζ:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Ln;

    .line 229
    .line 230
    neg-float v2, v5

    .line 231
    neg-float v3, v6

    .line 232
    invoke-virtual {v0, v2, v3}, Ln;->Η(FF)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Laq0;->γ()V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :catchall_0
    move-exception v0

    .line 240
    iget-object v1, v2, Lfe;->ζ:Lm6;

    .line 241
    .line 242
    iget-object v1, v1, Lm6;->ζ:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v1, Ln;

    .line 245
    .line 246
    neg-float v2, v5

    .line 247
    neg-float v3, v6

    .line 248
    invoke-virtual {v1, v2, v3}, Ln;->Η(FF)V

    .line 249
    .line 250
    .line 251
    throw v0
.end method

.method public final Φ(Ldw0;Lkx0;J)Lqx0;
    .locals 11

    .line 1
    invoke-static {p3, p4}, Lyo;->δ(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p3, p4}, Lyo;->γ(J)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    invoke-static {p3, p4}, Lyo;->ζ(J)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-static {p3, p4}, Lyo;->ε(J)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    move v1, v2

    .line 31
    :cond_1
    iget-boolean v2, p0, Lk91;->υ:Z

    .line 32
    .line 33
    const-wide v3, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, Lk91;->τ:Lba;

    .line 41
    .line 42
    iget-wide v5, v2, Lba;->ζ:J

    .line 43
    .line 44
    invoke-static {v5, v6}, Ls1;->Ζ(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    cmp-long v2, v5, v3

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    if-nez v0, :cond_b

    .line 54
    .line 55
    :goto_1
    if-eqz v1, :cond_3

    .line 56
    .line 57
    goto/16 :goto_8

    .line 58
    .line 59
    :cond_3
    iget-object v0, p0, Lk91;->τ:Lba;

    .line 60
    .line 61
    iget-wide v0, v0, Lba;->ζ:J

    .line 62
    .line 63
    invoke-static {v0, v1}, Ls1;->Ζ(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    invoke-static {v0, v1}, Lk91;->Г(J)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/16 v5, 0x20

    .line 72
    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    shr-long v6, v0, v5

    .line 76
    .line 77
    long-to-int v2, v6

    .line 78
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-static {p3, p4}, Lyo;->κ(J)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    :goto_2
    invoke-static {v0, v1}, Lk91;->В(J)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    const-wide v7, 0xffffffffL

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    if-eqz v6, :cond_5

    .line 101
    .line 102
    and-long/2addr v0, v7

    .line 103
    long-to-int v0, v0

    .line 104
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    goto :goto_3

    .line 113
    :cond_5
    invoke-static {p3, p4}, Lyo;->ι(J)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    :goto_3
    invoke-static {v2, p3, p4}, Lzo;->ζ(IJ)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-static {v0, p3, p4}, Lzo;->ε(IJ)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    int-to-float v1, v1

    .line 126
    int-to-float v0, v0

    .line 127
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    int-to-long v1, v1

    .line 132
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    int-to-long v9, v0

    .line 137
    shl-long v0, v1, v5

    .line 138
    .line 139
    and-long/2addr v9, v7

    .line 140
    or-long/2addr v0, v9

    .line 141
    iget-boolean v2, p0, Lk91;->υ:Z

    .line 142
    .line 143
    if-eqz v2, :cond_a

    .line 144
    .line 145
    iget-object v2, p0, Lk91;->τ:Lba;

    .line 146
    .line 147
    iget-wide v9, v2, Lba;->ζ:J

    .line 148
    .line 149
    invoke-static {v9, v10}, Ls1;->Ζ(J)J

    .line 150
    .line 151
    .line 152
    move-result-wide v9

    .line 153
    cmp-long v2, v9, v3

    .line 154
    .line 155
    if-eqz v2, :cond_a

    .line 156
    .line 157
    iget-object v2, p0, Lk91;->τ:Lba;

    .line 158
    .line 159
    iget-wide v2, v2, Lba;->ζ:J

    .line 160
    .line 161
    invoke-static {v2, v3}, Ls1;->Ζ(J)J

    .line 162
    .line 163
    .line 164
    move-result-wide v2

    .line 165
    invoke-static {v2, v3}, Lk91;->Г(J)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_6

    .line 170
    .line 171
    shr-long v2, v0, v5

    .line 172
    .line 173
    long-to-int v2, v2

    .line 174
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    goto :goto_4

    .line 179
    :cond_6
    iget-object v2, p0, Lk91;->τ:Lba;

    .line 180
    .line 181
    iget-wide v2, v2, Lba;->ζ:J

    .line 182
    .line 183
    invoke-static {v2, v3}, Ls1;->Ζ(J)J

    .line 184
    .line 185
    .line 186
    move-result-wide v2

    .line 187
    shr-long/2addr v2, v5

    .line 188
    long-to-int v2, v2

    .line 189
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    :goto_4
    iget-object v3, p0, Lk91;->τ:Lba;

    .line 194
    .line 195
    iget-wide v3, v3, Lba;->ζ:J

    .line 196
    .line 197
    invoke-static {v3, v4}, Ls1;->Ζ(J)J

    .line 198
    .line 199
    .line 200
    move-result-wide v3

    .line 201
    invoke-static {v3, v4}, Lk91;->В(J)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-nez v3, :cond_7

    .line 206
    .line 207
    and-long v3, v0, v7

    .line 208
    .line 209
    long-to-int v3, v3

    .line 210
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    goto :goto_5

    .line 215
    :cond_7
    iget-object v3, p0, Lk91;->τ:Lba;

    .line 216
    .line 217
    iget-wide v3, v3, Lba;->ζ:J

    .line 218
    .line 219
    invoke-static {v3, v4}, Ls1;->Ζ(J)J

    .line 220
    .line 221
    .line 222
    move-result-wide v3

    .line 223
    and-long/2addr v3, v7

    .line 224
    long-to-int v3, v3

    .line 225
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    :goto_5
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    int-to-long v9, v2

    .line 234
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    int-to-long v2, v2

    .line 239
    shl-long/2addr v9, v5

    .line 240
    and-long/2addr v2, v7

    .line 241
    or-long/2addr v2, v9

    .line 242
    shr-long v9, v0, v5

    .line 243
    .line 244
    long-to-int v4, v9

    .line 245
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    const/4 v6, 0x0

    .line 250
    cmpg-float v4, v4, v6

    .line 251
    .line 252
    if-nez v4, :cond_8

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_8
    and-long v9, v0, v7

    .line 256
    .line 257
    long-to-int v4, v9

    .line 258
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    cmpg-float v4, v4, v6

    .line 263
    .line 264
    if-nez v4, :cond_9

    .line 265
    .line 266
    :goto_6
    const-wide/16 v0, 0x0

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_9
    iget-object p0, p0, Lk91;->χ:Li2;

    .line 270
    .line 271
    invoke-virtual {p0, v2, v3, v0, v1}, Li2;->κ(JJ)J

    .line 272
    .line 273
    .line 274
    move-result-wide v0

    .line 275
    invoke-static {v2, v3, v0, v1}, Lg81;->χ(JJ)J

    .line 276
    .line 277
    .line 278
    move-result-wide v0

    .line 279
    :cond_a
    :goto_7
    shr-long v2, v0, v5

    .line 280
    .line 281
    long-to-int p0, v2

    .line 282
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 283
    .line 284
    .line 285
    move-result p0

    .line 286
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    invoke-static {p0, p3, p4}, Lzo;->ζ(IJ)I

    .line 291
    .line 292
    .line 293
    move-result p0

    .line 294
    and-long/2addr v0, v7

    .line 295
    long-to-int v0, v0

    .line 296
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    invoke-static {v0, p3, p4}, Lzo;->ε(IJ)I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    invoke-static {p0, v0, p3, p4}, Lyo;->α(IIJ)J

    .line 309
    .line 310
    .line 311
    move-result-wide p3

    .line 312
    goto :goto_9

    .line 313
    :cond_b
    :goto_8
    invoke-static {p3, p4}, Lyo;->θ(J)I

    .line 314
    .line 315
    .line 316
    move-result p0

    .line 317
    invoke-static {p3, p4}, Lyo;->η(J)I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    invoke-static {p0, v0, p3, p4}, Lyo;->α(IIJ)J

    .line 322
    .line 323
    .line 324
    move-result-wide p3

    .line 325
    :goto_9
    invoke-interface {p2, p3, p4}, Lkx0;->ζ(J)Lch1;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    iget p2, p0, Lch1;->ε:I

    .line 330
    .line 331
    iget p3, p0, Lch1;->ζ:I

    .line 332
    .line 333
    new-instance p4, Lt0;

    .line 334
    .line 335
    const/4 v0, 0x1

    .line 336
    invoke-direct {p4, p0, v0}, Lt0;-><init>(Lch1;I)V

    .line 337
    .line 338
    .line 339
    sget-object p0, Lkz;->ε:Lkz;

    .line 340
    .line 341
    invoke-interface {p1, p2, p3, p0, p4}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0
.end method

.method public final ф()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
