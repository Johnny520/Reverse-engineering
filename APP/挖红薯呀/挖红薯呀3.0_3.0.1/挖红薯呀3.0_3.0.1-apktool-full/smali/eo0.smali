.class public final Leo0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lj21;


# instance fields
.field public final synthetic a:Lkm;

.field public final synthetic b:Lqn0;


# direct methods
.method public constructor <init>(Lkm;Lqn0;Ldo0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Leo0;->a:Lkm;

    .line 5
    .line 6
    iput-object p2, p0, Leo0;->b:Lqn0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(FF)F
    .locals 12

    .line 1
    iget-object p0, p0, Leo0;->a:Lkm;

    .line 2
    .line 3
    invoke-virtual {p0}, Llo0;->o()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Llo0;->p:Lgp0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lgp0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lzn0;

    .line 14
    .line 15
    iget v2, v2, Lzn0;->c:I

    .line 16
    .line 17
    add-int/2addr v2, v0

    .line 18
    const/4 v0, 0x0

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    cmpg-float v0, p1, v0

    .line 23
    .line 24
    iget v3, p0, Llo0;->e:I

    .line 25
    .line 26
    if-gez v0, :cond_1

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    :cond_1
    int-to-float v0, v2

    .line 31
    div-float/2addr p2, v0

    .line 32
    float-to-int p2, p2

    .line 33
    add-int/2addr p2, v3

    .line 34
    invoke-virtual {p0}, Lkm;->n()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static {p2, v4, v0}, Lw60;->n(III)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-virtual {p0}, Llo0;->o()I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lgp0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lzn0;

    .line 51
    .line 52
    iget v0, v0, Lzn0;->c:I

    .line 53
    .line 54
    int-to-long v0, v3

    .line 55
    const-wide/16 v5, 0x1

    .line 56
    .line 57
    sub-long v7, v0, v5

    .line 58
    .line 59
    const-wide/16 v9, 0x0

    .line 60
    .line 61
    cmp-long v11, v7, v9

    .line 62
    .line 63
    if-gez v11, :cond_2

    .line 64
    .line 65
    move-wide v7, v9

    .line 66
    :cond_2
    long-to-int v7, v7

    .line 67
    add-long/2addr v0, v5

    .line 68
    const-wide/32 v5, 0x7fffffff

    .line 69
    .line 70
    .line 71
    cmp-long v8, v0, v5

    .line 72
    .line 73
    if-lez v8, :cond_3

    .line 74
    .line 75
    move-wide v0, v5

    .line 76
    :cond_3
    long-to-int v0, v0

    .line 77
    invoke-static {p2, v7, v0}, Lw60;->n(III)I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    invoke-virtual {p0}, Lkm;->n()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    invoke-static {p2, v4, p0}, Lw60;->n(III)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    sub-int/2addr p0, v3

    .line 90
    mul-int/2addr p0, v2

    .line 91
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    sub-int/2addr p0, v2

    .line 96
    if-gez p0, :cond_4

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    move v4, p0

    .line 100
    :goto_0
    if-nez v4, :cond_5

    .line 101
    .line 102
    int-to-float p0, v4

    .line 103
    return p0

    .line 104
    :cond_5
    int-to-float p0, v4

    .line 105
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    mul-float/2addr p1, p0

    .line 110
    return p1
.end method

.method public final b(F)F
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Leo0;->a:Lkm;

    .line 6
    .line 7
    invoke-virtual {v2}, Llo0;->m()Lzn0;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v3, v3, Lzn0;->n:Ln2;

    .line 12
    .line 13
    invoke-virtual {v2}, Llo0;->m()Lzn0;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    iget-object v4, v4, Lzn0;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    move v10, v7

    .line 27
    const/high16 v9, -0x800000    # Float.NEGATIVE_INFINITY

    .line 28
    .line 29
    :goto_0
    const/4 v11, 0x0

    .line 30
    if-ge v8, v5, :cond_2

    .line 31
    .line 32
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v12

    .line 36
    check-cast v12, Lae0;

    .line 37
    .line 38
    invoke-virtual {v2}, Llo0;->m()Lzn0;

    .line 39
    .line 40
    .line 41
    move-result-object v13

    .line 42
    invoke-static {v13}, Lw60;->u(Lzn0;)I

    .line 43
    .line 44
    .line 45
    move-result v13

    .line 46
    invoke-virtual {v2}, Llo0;->m()Lzn0;

    .line 47
    .line 48
    .line 49
    move-result-object v14

    .line 50
    iget v14, v14, Lzn0;->f:I

    .line 51
    .line 52
    neg-int v14, v14

    .line 53
    invoke-virtual {v2}, Llo0;->m()Lzn0;

    .line 54
    .line 55
    .line 56
    move-result-object v15

    .line 57
    iget v15, v15, Lzn0;->d:I

    .line 58
    .line 59
    const/high16 v16, -0x800000    # Float.NEGATIVE_INFINITY

    .line 60
    .line 61
    invoke-virtual {v2}, Llo0;->m()Lzn0;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    iget v6, v6, Lzn0;->b:I

    .line 66
    .line 67
    iget v12, v12, Lae0;->j:I

    .line 68
    .line 69
    invoke-virtual {v2}, Lkm;->n()I

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v13, v6, v14, v15}, Ln2;->i(IIII)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    int-to-float v6, v6

    .line 77
    int-to-float v12, v12

    .line 78
    sub-float/2addr v12, v6

    .line 79
    cmpg-float v6, v12, v11

    .line 80
    .line 81
    if-gtz v6, :cond_0

    .line 82
    .line 83
    cmpl-float v6, v12, v9

    .line 84
    .line 85
    if-lez v6, :cond_0

    .line 86
    .line 87
    move v9, v12

    .line 88
    :cond_0
    cmpl-float v6, v12, v11

    .line 89
    .line 90
    if-ltz v6, :cond_1

    .line 91
    .line 92
    cmpg-float v6, v12, v10

    .line 93
    .line 94
    if-gez v6, :cond_1

    .line 95
    .line 96
    move v10, v12

    .line 97
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    const/high16 v16, -0x800000    # Float.NEGATIVE_INFINITY

    .line 101
    .line 102
    cmpg-float v3, v9, v16

    .line 103
    .line 104
    if-nez v3, :cond_3

    .line 105
    .line 106
    move v9, v10

    .line 107
    :cond_3
    cmpg-float v3, v10, v7

    .line 108
    .line 109
    if-nez v3, :cond_4

    .line 110
    .line 111
    move v10, v9

    .line 112
    :cond_4
    invoke-virtual {v2}, Llo0;->c()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-nez v3, :cond_6

    .line 117
    .line 118
    invoke-static {v2, v1}, Lu50;->r(Lkm;F)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    move v9, v11

    .line 125
    move v10, v9

    .line 126
    goto :goto_1

    .line 127
    :cond_5
    move v10, v11

    .line 128
    :cond_6
    :goto_1
    invoke-virtual {v2}, Llo0;->a()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-nez v3, :cond_7

    .line 133
    .line 134
    invoke-static {v2, v1}, Lu50;->r(Lkm;F)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    move v9, v11

    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    move v10, v9

    .line 142
    :cond_7
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    iget-object v0, v0, Leo0;->b:Lqn0;

    .line 171
    .line 172
    invoke-virtual {v0, v1, v4, v5}, Lqn0;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, Ljava/lang/Number;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    cmpg-float v1, v0, v2

    .line 183
    .line 184
    if-nez v1, :cond_8

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_8
    cmpg-float v1, v0, v3

    .line 188
    .line 189
    if-nez v1, :cond_9

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_9
    cmpg-float v1, v0, v11

    .line 193
    .line 194
    if-nez v1, :cond_a

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    const-string v4, "Final Snapping Offset Should Be one of "

    .line 200
    .line 201
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v2, ", "

    .line 208
    .line 209
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v2, " or 0.0"

    .line 216
    .line 217
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-static {v1}, Lz10;->c(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :goto_2
    cmpg-float v1, v0, v7

    .line 228
    .line 229
    if-nez v1, :cond_b

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_b
    cmpg-float v1, v0, v16

    .line 233
    .line 234
    if-nez v1, :cond_c

    .line 235
    .line 236
    :goto_3
    return v11

    .line 237
    :cond_c
    return v0
.end method
