.class public final Lv/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lf1/r0;


# instance fields
.field public final a:Lv/a;

.field public final b:Lv/a;

.field public final c:Lv/a;

.field public final d:Lv/a;


# direct methods
.method public constructor <init>(Lv/a;Lv/a;Lv/a;Lv/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv/d;->a:Lv/a;

    .line 5
    .line 6
    iput-object p2, p0, Lv/d;->b:Lv/a;

    .line 7
    .line 8
    iput-object p3, p0, Lv/d;->c:Lv/a;

    .line 9
    .line 10
    iput-object p4, p0, Lv/d;->d:Lv/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(JLu2/m;Lu2/c;)Lf1/c0;
    .locals 29

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
    move-object/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v0, Lv/d;->a:Lv/a;

    .line 10
    .line 11
    invoke-interface {v5, v1, v2, v4}, Lv/a;->a(JLu2/c;)F

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v6, v0, Lv/d;->b:Lv/a;

    .line 16
    .line 17
    invoke-interface {v6, v1, v2, v4}, Lv/a;->a(JLu2/c;)F

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    iget-object v7, v0, Lv/d;->c:Lv/a;

    .line 22
    .line 23
    invoke-interface {v7, v1, v2, v4}, Lv/a;->a(JLu2/c;)F

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    iget-object v8, v0, Lv/d;->d:Lv/a;

    .line 28
    .line 29
    invoke-interface {v8, v1, v2, v4}, Lv/a;->a(JLu2/c;)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-static {v1, v2}, Le1/e;->b(J)F

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    add-float v9, v5, v4

    .line 38
    .line 39
    cmpl-float v10, v9, v8

    .line 40
    .line 41
    if-lez v10, :cond_0

    .line 42
    .line 43
    div-float v9, v8, v9

    .line 44
    .line 45
    mul-float/2addr v5, v9

    .line 46
    mul-float/2addr v4, v9

    .line 47
    :cond_0
    add-float v9, v6, v7

    .line 48
    .line 49
    cmpl-float v10, v9, v8

    .line 50
    .line 51
    if-lez v10, :cond_1

    .line 52
    .line 53
    div-float/2addr v8, v9

    .line 54
    mul-float/2addr v6, v8

    .line 55
    mul-float/2addr v7, v8

    .line 56
    :cond_1
    const/4 v8, 0x0

    .line 57
    cmpl-float v9, v5, v8

    .line 58
    .line 59
    if-ltz v9, :cond_2

    .line 60
    .line 61
    cmpl-float v9, v6, v8

    .line 62
    .line 63
    if-ltz v9, :cond_2

    .line 64
    .line 65
    cmpl-float v9, v7, v8

    .line 66
    .line 67
    if-ltz v9, :cond_2

    .line 68
    .line 69
    cmpl-float v9, v4, v8

    .line 70
    .line 71
    if-ltz v9, :cond_2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    new-instance v9, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v10, "Corner size in Px can\'t be negative(topStart = "

    .line 77
    .line 78
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v10, ", topEnd = "

    .line 85
    .line 86
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v10, ", bottomEnd = "

    .line 93
    .line 94
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v10, ", bottomStart = "

    .line 101
    .line 102
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v10, ")!"

    .line 109
    .line 110
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    invoke-static {v9}, Lo/b;->a(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    add-float v9, v5, v6

    .line 121
    .line 122
    add-float/2addr v9, v7

    .line 123
    add-float/2addr v9, v4

    .line 124
    cmpg-float v8, v9, v8

    .line 125
    .line 126
    const-wide/16 v9, 0x0

    .line 127
    .line 128
    if-nez v8, :cond_3

    .line 129
    .line 130
    new-instance v3, Lf1/k0;

    .line 131
    .line 132
    invoke-static {v9, v10, v1, v2}, Lac/p;->a(JJ)Le1/c;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-direct {v3, v1}, Lf1/k0;-><init>(Le1/c;)V

    .line 137
    .line 138
    .line 139
    return-object v3

    .line 140
    :cond_3
    new-instance v8, Lf1/l0;

    .line 141
    .line 142
    invoke-static {v9, v10, v1, v2}, Lac/p;->a(JJ)Le1/c;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    sget-object v2, Lu2/m;->g:Lu2/m;

    .line 147
    .line 148
    if-ne v3, v2, :cond_4

    .line 149
    .line 150
    move v9, v5

    .line 151
    goto :goto_1

    .line 152
    :cond_4
    move v9, v6

    .line 153
    :goto_1
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    int-to-long v10, v10

    .line 158
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    int-to-long v12, v9

    .line 163
    const/16 v9, 0x20

    .line 164
    .line 165
    shl-long/2addr v10, v9

    .line 166
    const-wide v14, 0xffffffffL

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    and-long/2addr v12, v14

    .line 172
    or-long v21, v10, v12

    .line 173
    .line 174
    if-ne v3, v2, :cond_5

    .line 175
    .line 176
    move v5, v6

    .line 177
    :cond_5
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    int-to-long v10, v6

    .line 182
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    int-to-long v5, v5

    .line 187
    shl-long/2addr v10, v9

    .line 188
    and-long/2addr v5, v14

    .line 189
    or-long v23, v10, v5

    .line 190
    .line 191
    if-ne v3, v2, :cond_6

    .line 192
    .line 193
    move v5, v7

    .line 194
    goto :goto_2

    .line 195
    :cond_6
    move v5, v4

    .line 196
    :goto_2
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    int-to-long v10, v6

    .line 201
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    int-to-long v5, v5

    .line 206
    shl-long/2addr v10, v9

    .line 207
    and-long/2addr v5, v14

    .line 208
    or-long v25, v10, v5

    .line 209
    .line 210
    if-ne v3, v2, :cond_7

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_7
    move v4, v7

    .line 214
    :goto_3
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    int-to-long v2, v2

    .line 219
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    int-to-long v4, v4

    .line 224
    shl-long/2addr v2, v9

    .line 225
    and-long/2addr v4, v14

    .line 226
    or-long v27, v2, v4

    .line 227
    .line 228
    new-instance v16, Le1/d;

    .line 229
    .line 230
    iget v2, v1, Le1/c;->a:F

    .line 231
    .line 232
    iget v3, v1, Le1/c;->b:F

    .line 233
    .line 234
    iget v4, v1, Le1/c;->c:F

    .line 235
    .line 236
    iget v1, v1, Le1/c;->d:F

    .line 237
    .line 238
    move/from16 v20, v1

    .line 239
    .line 240
    move/from16 v17, v2

    .line 241
    .line 242
    move/from16 v18, v3

    .line 243
    .line 244
    move/from16 v19, v4

    .line 245
    .line 246
    invoke-direct/range {v16 .. v28}, Le1/d;-><init>(FFFFJJJJ)V

    .line 247
    .line 248
    .line 249
    move-object/from16 v1, v16

    .line 250
    .line 251
    invoke-direct {v8, v1}, Lf1/l0;-><init>(Le1/d;)V

    .line 252
    .line 253
    .line 254
    return-object v8
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lv/d;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lv/d;

    .line 10
    .line 11
    iget-object v0, p1, Lv/d;->a:Lv/a;

    .line 12
    .line 13
    iget-object v1, p0, Lv/d;->a:Lv/a;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lv/d;->b:Lv/a;

    .line 23
    .line 24
    iget-object v1, p1, Lv/d;->b:Lv/a;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lv/d;->c:Lv/a;

    .line 34
    .line 35
    iget-object v1, p1, Lv/d;->c:Lv/a;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lv/d;->d:Lv/a;

    .line 45
    .line 46
    iget-object p1, p1, Lv/d;->d:Lv/a;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_5

    .line 53
    .line 54
    :goto_0
    const/4 p1, 0x0

    .line 55
    return p1

    .line 56
    :cond_5
    :goto_1
    const/4 p1, 0x1

    .line 57
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lv/d;->a:Lv/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lv/d;->b:Lv/a;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Lv/d;->c:Lv/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Lv/d;->d:Lv/a;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    return v1
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
    iget-object v1, p0, Lv/d;->a:Lv/a;

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
    iget-object v1, p0, Lv/d;->b:Lv/a;

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
    iget-object v1, p0, Lv/d;->c:Lv/a;

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
    iget-object v1, p0, Lv/d;->d:Lv/a;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 v1, 0x29

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method
