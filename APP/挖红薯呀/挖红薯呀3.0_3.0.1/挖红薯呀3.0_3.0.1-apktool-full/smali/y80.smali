.class public final Ly80;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lj21;


# instance fields
.field public final synthetic a:Lc90;


# direct methods
.method public constructor <init>(Lc90;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly80;->a:Lc90;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(FF)F
    .locals 3

    .line 1
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object p0, p0, Ly80;->a:Lc90;

    .line 6
    .line 7
    invoke-virtual {p0}, Lc90;->g()Lv80;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p0, p0, Lv80;->k:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lw80;

    .line 40
    .line 41
    iget v2, v2, Lw80;->j:I

    .line 42
    .line 43
    add-int/2addr v1, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    div-int/2addr v1, v0

    .line 46
    :goto_1
    int-to-float p0, v1

    .line 47
    sub-float/2addr p1, p0

    .line 48
    const/4 p0, 0x0

    .line 49
    cmpg-float v0, p1, p0

    .line 50
    .line 51
    if-gez v0, :cond_2

    .line 52
    .line 53
    move p1, p0

    .line 54
    :cond_2
    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    mul-float/2addr p0, p1

    .line 59
    return p0
.end method

.method public final b(F)F
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, Ly80;->a:Lc90;

    .line 4
    .line 5
    invoke-virtual {v0}, Lc90;->g()Lv80;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Lv80;->k:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    move v8, v4

    .line 19
    move v6, v5

    .line 20
    const/high16 v7, -0x800000    # Float.NEGATIVE_INFINITY

    .line 21
    .line 22
    :goto_0
    const/4 v9, 0x2

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x1

    .line 25
    if-ge v6, v2, :cond_5

    .line 26
    .line 27
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v12

    .line 31
    check-cast v12, Lw80;

    .line 32
    .line 33
    if-eqz v12, :cond_0

    .line 34
    .line 35
    move-object v13, v12

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const/4 v13, 0x0

    .line 38
    :goto_1
    if-eqz v13, :cond_1

    .line 39
    .line 40
    iget-boolean v13, v13, Lw80;->m:Z

    .line 41
    .line 42
    if-ne v13, v11, :cond_1

    .line 43
    .line 44
    const/high16 p0, -0x800000    # Float.NEGATIVE_INFINITY

    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_1
    invoke-virtual {v0}, Lc90;->g()Lv80;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    iget-object v13, v11, Lv80;->o:Lum0;

    .line 52
    .line 53
    sget-object v14, Lum0;->d:Lum0;

    .line 54
    .line 55
    if-ne v13, v14, :cond_2

    .line 56
    .line 57
    invoke-virtual {v11}, Lv80;->g()J

    .line 58
    .line 59
    .line 60
    move-result-wide v13

    .line 61
    const-wide v15, 0xffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr v13, v15

    .line 67
    :goto_2
    long-to-int v11, v13

    .line 68
    goto :goto_3

    .line 69
    :cond_2
    invoke-virtual {v11}, Lv80;->g()J

    .line 70
    .line 71
    .line 72
    move-result-wide v13

    .line 73
    const/16 v11, 0x20

    .line 74
    .line 75
    shr-long/2addr v13, v11

    .line 76
    goto :goto_2

    .line 77
    :goto_3
    invoke-virtual {v0}, Lc90;->g()Lv80;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    iget v13, v13, Lv80;->l:I

    .line 82
    .line 83
    neg-int v13, v13

    .line 84
    invoke-virtual {v0}, Lc90;->g()Lv80;

    .line 85
    .line 86
    .line 87
    move-result-object v14

    .line 88
    iget v14, v14, Lv80;->p:I

    .line 89
    .line 90
    iget v15, v12, Lw80;->j:I

    .line 91
    .line 92
    iget v12, v12, Lw80;->i:I

    .line 93
    .line 94
    const/high16 p0, -0x800000    # Float.NEGATIVE_INFINITY

    .line 95
    .line 96
    invoke-virtual {v0}, Lc90;->g()Lv80;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget v3, v3, Lv80;->n:I

    .line 101
    .line 102
    sub-int/2addr v11, v13

    .line 103
    sub-int/2addr v11, v14

    .line 104
    div-int/2addr v11, v9

    .line 105
    div-int/2addr v15, v9

    .line 106
    sub-int/2addr v11, v15

    .line 107
    int-to-float v3, v11

    .line 108
    int-to-float v9, v12

    .line 109
    sub-float/2addr v9, v3

    .line 110
    cmpg-float v3, v9, v10

    .line 111
    .line 112
    if-gtz v3, :cond_3

    .line 113
    .line 114
    cmpl-float v3, v9, v7

    .line 115
    .line 116
    if-lez v3, :cond_3

    .line 117
    .line 118
    move v7, v9

    .line 119
    :cond_3
    cmpl-float v3, v9, v10

    .line 120
    .line 121
    if-ltz v3, :cond_4

    .line 122
    .line 123
    cmpg-float v3, v9, v8

    .line 124
    .line 125
    if-gez v3, :cond_4

    .line 126
    .line 127
    move v8, v9

    .line 128
    :cond_4
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_5
    const/high16 p0, -0x800000    # Float.NEGATIVE_INFINITY

    .line 132
    .line 133
    iget-object v0, v0, Lc90;->f:Lgp0;

    .line 134
    .line 135
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Lv80;

    .line 140
    .line 141
    iget-object v0, v0, Lv80;->i:Lym;

    .line 142
    .line 143
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    const/high16 v2, 0x43c80000    # 400.0f

    .line 148
    .line 149
    invoke-interface {v0, v2}, Lym;->p(F)F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    cmpg-float v0, v1, v0

    .line 154
    .line 155
    if-gez v0, :cond_6

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_6
    cmpl-float v0, p1, v10

    .line 159
    .line 160
    if-lez v0, :cond_7

    .line 161
    .line 162
    move v5, v11

    .line 163
    goto :goto_5

    .line 164
    :cond_7
    move v5, v9

    .line 165
    :goto_5
    if-nez v5, :cond_8

    .line 166
    .line 167
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    cmpg-float v0, v0, v1

    .line 176
    .line 177
    if-gtz v0, :cond_b

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_8
    if-ne v5, v11, :cond_9

    .line 181
    .line 182
    :goto_6
    move v7, v8

    .line 183
    goto :goto_7

    .line 184
    :cond_9
    if-ne v5, v9, :cond_a

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_a
    move v7, v10

    .line 188
    :cond_b
    :goto_7
    cmpg-float v0, v7, v4

    .line 189
    .line 190
    if-nez v0, :cond_c

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_c
    cmpg-float v0, v7, p0

    .line 194
    .line 195
    if-nez v0, :cond_d

    .line 196
    .line 197
    :goto_8
    return v10

    .line 198
    :cond_d
    return v7
.end method
