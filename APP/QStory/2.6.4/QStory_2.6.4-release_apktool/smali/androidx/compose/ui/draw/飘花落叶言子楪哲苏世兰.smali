.class public final Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;
.super Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;
.implements Landroidx/compose/ui/node/飘花落叶言子楪哲苏世兰;


# instance fields
.field public 飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;

.field public 飘花落叶言子世苏兰楪哲:Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;

.field public 飘花落叶言子世苏哲兰楪:F

.field public 飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;

.field public 飘花落叶言子世苏楪兰哲:Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

.field public 飘花落叶言子世苏楪哲兰:Z


# direct methods
.method public static 飘花落叶言子哲兰苏世楪(J)Z
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, v0, v1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(JJ)Z

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

.method public static 飘花落叶言子哲兰苏楪世(J)Z
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, v0, v1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(JJ)Z

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
    iget-object v1, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;

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
    iget-boolean v1, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏楪哲兰:Z

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
    iget-object v1, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏楪兰哲:Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

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
    iget v1, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏哲兰楪:F

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", colorFilter="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏兰楪哲:Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const/16 p0, 0x29

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public final 飘花落叶言子兰楪世苏哲(J)J
    .locals 11

    .line 1
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(J)Z

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
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(J)Z

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
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(J)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(J)Z

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
    invoke-virtual {p0}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    :cond_2
    if-eqz v1, :cond_4

    .line 40
    .line 41
    :cond_3
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(J)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-static {p1, p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(J)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/4 v6, 0x0

    .line 50
    const/16 v7, 0xa

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    move-wide v8, p1

    .line 54
    invoke-static/range {v3 .. v9}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIIIIJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide p0

    .line 58
    return-wide p0

    .line 59
    :cond_4
    move-wide v5, p1

    .line 60
    iget-object p1, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏()J

    .line 63
    .line 64
    .line 65
    move-result-wide p1

    .line 66
    invoke-static {p1, p2}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰苏世楪(J)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/16 v1, 0x20

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    shr-long v2, p1, v1

    .line 75
    .line 76
    long-to-int v0, v2

    .line 77
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    goto :goto_1

    .line 86
    :cond_5
    invoke-static {v5, v6}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(J)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    :goto_1
    invoke-static {p1, p2}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰苏楪世(J)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    const-wide v3, 0xffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    if-eqz v2, :cond_6

    .line 100
    .line 101
    and-long/2addr p1, v3

    .line 102
    long-to-int p1, p1

    .line 103
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    goto :goto_2

    .line 112
    :cond_6
    invoke-static {v5, v6}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(J)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    :goto_2
    invoke-static {v0, v5, v6}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(IJ)I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    invoke-static {p1, v5, v6}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(IJ)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    int-to-float p2, p2

    .line 125
    int-to-float p1, p1

    .line 126
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    int-to-long v7, p2

    .line 131
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    int-to-long p1, p1

    .line 136
    shl-long/2addr v7, v1

    .line 137
    and-long/2addr p1, v3

    .line 138
    or-long/2addr p1, v7

    .line 139
    invoke-virtual {p0}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_7

    .line 144
    .line 145
    goto/16 :goto_6

    .line 146
    .line 147
    :cond_7
    iget-object v0, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;

    .line 148
    .line 149
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏()J

    .line 150
    .line 151
    .line 152
    move-result-wide v7

    .line 153
    invoke-static {v7, v8}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰苏世楪(J)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_8

    .line 158
    .line 159
    shr-long v7, p1, v1

    .line 160
    .line 161
    long-to-int v0, v7

    .line 162
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    goto :goto_3

    .line 167
    :cond_8
    iget-object v0, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;

    .line 168
    .line 169
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏()J

    .line 170
    .line 171
    .line 172
    move-result-wide v7

    .line 173
    shr-long/2addr v7, v1

    .line 174
    long-to-int v0, v7

    .line 175
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    :goto_3
    iget-object v2, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;

    .line 180
    .line 181
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏()J

    .line 182
    .line 183
    .line 184
    move-result-wide v7

    .line 185
    invoke-static {v7, v8}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰苏楪世(J)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-nez v2, :cond_9

    .line 190
    .line 191
    and-long v7, p1, v3

    .line 192
    .line 193
    long-to-int v2, v7

    .line 194
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    goto :goto_4

    .line 199
    :cond_9
    iget-object v2, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;

    .line 200
    .line 201
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏()J

    .line 202
    .line 203
    .line 204
    move-result-wide v7

    .line 205
    and-long/2addr v7, v3

    .line 206
    long-to-int v2, v7

    .line 207
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    :goto_4
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    int-to-long v7, v0

    .line 216
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    int-to-long v9, v0

    .line 221
    shl-long/2addr v7, v1

    .line 222
    and-long/2addr v9, v3

    .line 223
    or-long/2addr v7, v9

    .line 224
    shr-long v9, p1, v1

    .line 225
    .line 226
    long-to-int v0, v9

    .line 227
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    const/4 v2, 0x0

    .line 232
    cmpg-float v0, v0, v2

    .line 233
    .line 234
    if-nez v0, :cond_a

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_a
    and-long v9, p1, v3

    .line 238
    .line 239
    long-to-int v0, v9

    .line 240
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    cmpg-float v0, v0, v2

    .line 245
    .line 246
    if-nez v0, :cond_b

    .line 247
    .line 248
    :goto_5
    const-wide/16 p1, 0x0

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_b
    iget-object p0, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;

    .line 252
    .line 253
    invoke-virtual {p0, v7, v8, p1, p2}, Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰(JJ)J

    .line 254
    .line 255
    .line 256
    move-result-wide p0

    .line 257
    invoke-static {v7, v8, p0, p1}, Landroidx/compose/ui/layout/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世(JJ)J

    .line 258
    .line 259
    .line 260
    move-result-wide p1

    .line 261
    :goto_6
    shr-long v0, p1, v1

    .line 262
    .line 263
    long-to-int p0, v0

    .line 264
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    invoke-static {p0, v5, v6}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(IJ)I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    and-long p0, p1, v3

    .line 277
    .line 278
    long-to-int p0, p0

    .line 279
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 280
    .line 281
    .line 282
    move-result p0

    .line 283
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 284
    .line 285
    .line 286
    move-result p0

    .line 287
    invoke-static {p0, v5, v6}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(IJ)I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    const/4 v3, 0x0

    .line 292
    const/16 v4, 0xa

    .line 293
    .line 294
    const/4 v1, 0x0

    .line 295
    invoke-static/range {v0 .. v6}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIIIIJ)J

    .line 296
    .line 297
    .line 298
    move-result-wide p0

    .line 299
    return-wide p0
.end method

.method public final 飘花落叶言子哲世兰楪苏()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子哲兰世苏楪()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏楪哲兰:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long p0, v0, v2

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x7

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0, v0, v0, p3, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(IIIII)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰楪世苏哲(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世哲苏(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-static {p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(J)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_0
    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世哲苏(I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/16 p1, 0xd

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0, p3, v0, v0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(IIIII)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰楪世苏哲(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子世兰楪苏哲(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(J)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子世兰楪苏哲(I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x7

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0, v0, v0, p3, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(IIIII)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰楪世苏哲(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-static {p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(J)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_0
    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/16 p1, 0xd

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0, p3, v0, v0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(IIIII)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰楪世苏哲(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(J)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p4}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰楪世苏哲(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p3

    .line 5
    invoke-interface {p2, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪兰哲苏(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p2, p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 10
    .line 11
    iget p3, p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 12
    .line 13
    new-instance p4, Landroidx/compose/ui/draw/PainterNode$measure$1;

    .line 14
    .line 15
    invoke-direct {p4, p0}, Landroidx/compose/ui/draw/PainterNode$measure$1;-><init>(Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪兰世苏哲(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final 飘花落叶言子苏兰楪世哲(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世哲苏兰;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v1, v2}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰苏世楪(J)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/16 v4, 0x20

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    shr-long v5, v1, v4

    .line 18
    .line 19
    long-to-int v3, v5

    .line 20
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object/from16 v3, p1

    .line 26
    .line 27
    check-cast v3, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;

    .line 28
    .line 29
    iget-object v3, v3, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 30
    .line 31
    invoke-interface {v3}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    shr-long/2addr v5, v4

    .line 36
    long-to-int v3, v5

    .line 37
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    :goto_0
    invoke-static {v1, v2}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰苏楪世(J)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    const-wide v6, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    and-long/2addr v1, v6

    .line 53
    long-to-int v1, v1

    .line 54
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move-object/from16 v1, p1

    .line 60
    .line 61
    check-cast v1, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;

    .line 62
    .line 63
    iget-object v1, v1, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 64
    .line 65
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    and-long/2addr v1, v6

    .line 70
    long-to-int v1, v1

    .line 71
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    :goto_1
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    int-to-long v2, v2

    .line 80
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    int-to-long v8, v1

    .line 85
    shl-long v1, v2, v4

    .line 86
    .line 87
    and-long/2addr v8, v6

    .line 88
    or-long/2addr v1, v8

    .line 89
    move-object/from16 v3, p1

    .line 90
    .line 91
    check-cast v3, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;

    .line 92
    .line 93
    iget-object v5, v3, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 94
    .line 95
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 96
    .line 97
    .line 98
    move-result-wide v8

    .line 99
    shr-long/2addr v8, v4

    .line 100
    long-to-int v8, v8

    .line 101
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    const/4 v9, 0x0

    .line 106
    cmpg-float v8, v8, v9

    .line 107
    .line 108
    if-nez v8, :cond_2

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 112
    .line 113
    .line 114
    move-result-wide v10

    .line 115
    and-long/2addr v10, v6

    .line 116
    long-to-int v8, v10

    .line 117
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    cmpg-float v8, v8, v9

    .line 122
    .line 123
    if-nez v8, :cond_3

    .line 124
    .line 125
    :goto_2
    const-wide/16 v1, 0x0

    .line 126
    .line 127
    :goto_3
    move-wide v10, v1

    .line 128
    goto :goto_4

    .line 129
    :cond_3
    iget-object v8, v0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;

    .line 130
    .line 131
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 132
    .line 133
    .line 134
    move-result-wide v9

    .line 135
    invoke-virtual {v8, v1, v2, v9, v10}, Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰(JJ)J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    invoke-static {v1, v2, v8, v9}, Landroidx/compose/ui/layout/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世(JJ)J

    .line 140
    .line 141
    .line 142
    move-result-wide v1

    .line 143
    goto :goto_3

    .line 144
    :goto_4
    iget-object v12, v0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏楪兰哲:Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

    .line 145
    .line 146
    shr-long v1, v10, v4

    .line 147
    .line 148
    long-to-int v1, v1

    .line 149
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    and-long v8, v10, v6

    .line 158
    .line 159
    long-to-int v2, v8

    .line 160
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    int-to-long v8, v1

    .line 169
    shl-long/2addr v8, v4

    .line 170
    int-to-long v1, v2

    .line 171
    and-long/2addr v1, v6

    .line 172
    or-long v13, v8, v1

    .line 173
    .line 174
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 175
    .line 176
    .line 177
    move-result-wide v1

    .line 178
    shr-long/2addr v1, v4

    .line 179
    long-to-int v1, v1

    .line 180
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 189
    .line 190
    .line 191
    move-result-wide v8

    .line 192
    and-long/2addr v8, v6

    .line 193
    long-to-int v2, v8

    .line 194
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    int-to-long v8, v1

    .line 203
    shl-long/2addr v8, v4

    .line 204
    int-to-long v1, v2

    .line 205
    and-long/2addr v1, v6

    .line 206
    or-long v15, v8, v1

    .line 207
    .line 208
    invoke-virtual {v3}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 209
    .line 210
    .line 211
    move-result-object v17

    .line 212
    invoke-interface/range {v12 .. v17}, Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    .line 213
    .line 214
    .line 215
    move-result-wide v1

    .line 216
    shr-long v8, v1, v4

    .line 217
    .line 218
    long-to-int v4, v8

    .line 219
    int-to-float v4, v4

    .line 220
    and-long/2addr v1, v6

    .line 221
    long-to-int v1, v1

    .line 222
    int-to-float v1, v1

    .line 223
    iget-object v2, v5, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 224
    .line 225
    iget-object v2, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v2, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 228
    .line 229
    invoke-virtual {v2, v4, v1}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子世苏兰哲楪(FF)V

    .line 230
    .line 231
    .line 232
    :try_start_0
    iget-object v8, v0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;

    .line 233
    .line 234
    iget v12, v0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏哲兰楪:F

    .line 235
    .line 236
    iget-object v13, v0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏兰楪哲:Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;

    .line 237
    .line 238
    move-object/from16 v9, p1

    .line 239
    .line 240
    check-cast v9, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;

    .line 241
    .line 242
    invoke-virtual/range {v8 .. v13}, Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;JFLandroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    .line 244
    .line 245
    iget-object v0, v5, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 246
    .line 247
    iget-object v0, v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 250
    .line 251
    neg-float v2, v4

    .line 252
    neg-float v1, v1

    .line 253
    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子世苏兰哲楪(FF)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :catchall_0
    move-exception v0

    .line 261
    iget-object v2, v5, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 262
    .line 263
    iget-object v2, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v2, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 266
    .line 267
    neg-float v3, v4

    .line 268
    neg-float v1, v1

    .line 269
    invoke-virtual {v2, v3, v1}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子世苏兰哲楪(FF)V

    .line 270
    .line 271
    .line 272
    throw v0
.end method
