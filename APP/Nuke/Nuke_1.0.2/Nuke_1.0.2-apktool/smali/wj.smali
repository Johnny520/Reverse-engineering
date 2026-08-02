.class public abstract Lwj;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public h:I

.field public i:Lb90;

.field public j:Li32;

.field public k:I

.field public l:I

.field public m:Z

.field public n:I

.field public o:I

.field public p:La51;

.field public q:Z

.field public r:Lov1;

.field public s:Lro;

.field public t:Ljava/lang/Class;

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lb90;->d:Lb90;

    .line 5
    .line 6
    iput-object v0, p0, Lwj;->i:Lb90;

    .line 7
    .line 8
    sget-object v0, Li32;->j:Li32;

    .line 9
    .line 10
    iput-object v0, p0, Lwj;->j:Li32;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lwj;->m:Z

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    iput v1, p0, Lwj;->n:I

    .line 17
    .line 18
    iput v1, p0, Lwj;->o:I

    .line 19
    .line 20
    sget-object v1, Lhe0;->b:Lhe0;

    .line 21
    .line 22
    iput-object v1, p0, Lwj;->p:La51;

    .line 23
    .line 24
    new-instance v1, Lov1;

    .line 25
    .line 26
    invoke-direct {v1}, Lov1;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lwj;->r:Lov1;

    .line 30
    .line 31
    new-instance v1, Lro;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v1, v2}, Luq2;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lwj;->s:Lro;

    .line 38
    .line 39
    const-class v1, Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v1, p0, Lwj;->t:Ljava/lang/Class;

    .line 42
    .line 43
    iput-boolean v0, p0, Lwj;->w:Z

    .line 44
    .line 45
    return-void
.end method

.method public static k(II)Z
    .locals 0

    .line 1
    and-int/2addr p0, p1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method


# virtual methods
.method public a(Lwj;)Lwj;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lwj;->a(Lwj;)Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget v0, p1, Lwj;->h:I

    .line 15
    .line 16
    iget v0, p1, Lwj;->h:I

    .line 17
    .line 18
    const/high16 v1, 0x100000

    .line 19
    .line 20
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p1, Lwj;->x:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lwj;->x:Z

    .line 29
    .line 30
    :cond_1
    iget v0, p1, Lwj;->h:I

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p1, Lwj;->i:Lb90;

    .line 40
    .line 41
    iput-object v0, p0, Lwj;->i:Lb90;

    .line 42
    .line 43
    :cond_2
    iget v0, p1, Lwj;->h:I

    .line 44
    .line 45
    const/16 v1, 0x8

    .line 46
    .line 47
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v0, p1, Lwj;->j:Li32;

    .line 54
    .line 55
    iput-object v0, p0, Lwj;->j:Li32;

    .line 56
    .line 57
    :cond_3
    iget v0, p1, Lwj;->h:I

    .line 58
    .line 59
    const/16 v1, 0x10

    .line 60
    .line 61
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v1, 0x0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    iput v1, p0, Lwj;->k:I

    .line 69
    .line 70
    iget v0, p0, Lwj;->h:I

    .line 71
    .line 72
    and-int/lit8 v0, v0, -0x21

    .line 73
    .line 74
    iput v0, p0, Lwj;->h:I

    .line 75
    .line 76
    :cond_4
    iget v0, p1, Lwj;->h:I

    .line 77
    .line 78
    const/16 v2, 0x20

    .line 79
    .line 80
    invoke-static {v0, v2}, Lwj;->k(II)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    iget v0, p1, Lwj;->k:I

    .line 87
    .line 88
    iput v0, p0, Lwj;->k:I

    .line 89
    .line 90
    iget v0, p0, Lwj;->h:I

    .line 91
    .line 92
    and-int/lit8 v0, v0, -0x11

    .line 93
    .line 94
    iput v0, p0, Lwj;->h:I

    .line 95
    .line 96
    :cond_5
    iget v0, p1, Lwj;->h:I

    .line 97
    .line 98
    const/16 v2, 0x40

    .line 99
    .line 100
    invoke-static {v0, v2}, Lwj;->k(II)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    iput v1, p0, Lwj;->l:I

    .line 107
    .line 108
    iget v0, p0, Lwj;->h:I

    .line 109
    .line 110
    and-int/lit16 v0, v0, -0x81

    .line 111
    .line 112
    iput v0, p0, Lwj;->h:I

    .line 113
    .line 114
    :cond_6
    iget v0, p1, Lwj;->h:I

    .line 115
    .line 116
    const/16 v1, 0x80

    .line 117
    .line 118
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    iget v0, p1, Lwj;->l:I

    .line 125
    .line 126
    iput v0, p0, Lwj;->l:I

    .line 127
    .line 128
    iget v0, p0, Lwj;->h:I

    .line 129
    .line 130
    and-int/lit8 v0, v0, -0x41

    .line 131
    .line 132
    iput v0, p0, Lwj;->h:I

    .line 133
    .line 134
    :cond_7
    iget v0, p1, Lwj;->h:I

    .line 135
    .line 136
    const/16 v1, 0x100

    .line 137
    .line 138
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    iget-boolean v0, p1, Lwj;->m:Z

    .line 145
    .line 146
    iput-boolean v0, p0, Lwj;->m:Z

    .line 147
    .line 148
    :cond_8
    iget v0, p1, Lwj;->h:I

    .line 149
    .line 150
    const/16 v1, 0x200

    .line 151
    .line 152
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_9

    .line 157
    .line 158
    iget v0, p1, Lwj;->o:I

    .line 159
    .line 160
    iput v0, p0, Lwj;->o:I

    .line 161
    .line 162
    iget v0, p1, Lwj;->n:I

    .line 163
    .line 164
    iput v0, p0, Lwj;->n:I

    .line 165
    .line 166
    :cond_9
    iget v0, p1, Lwj;->h:I

    .line 167
    .line 168
    const/16 v1, 0x400

    .line 169
    .line 170
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_a

    .line 175
    .line 176
    iget-object v0, p1, Lwj;->p:La51;

    .line 177
    .line 178
    iput-object v0, p0, Lwj;->p:La51;

    .line 179
    .line 180
    :cond_a
    iget v0, p1, Lwj;->h:I

    .line 181
    .line 182
    const/16 v1, 0x1000

    .line 183
    .line 184
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_b

    .line 189
    .line 190
    iget-object v0, p1, Lwj;->t:Ljava/lang/Class;

    .line 191
    .line 192
    iput-object v0, p0, Lwj;->t:Ljava/lang/Class;

    .line 193
    .line 194
    :cond_b
    iget v0, p1, Lwj;->h:I

    .line 195
    .line 196
    const/16 v1, 0x2000

    .line 197
    .line 198
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_c

    .line 203
    .line 204
    iget v0, p0, Lwj;->h:I

    .line 205
    .line 206
    and-int/lit16 v0, v0, -0x4001

    .line 207
    .line 208
    iput v0, p0, Lwj;->h:I

    .line 209
    .line 210
    :cond_c
    iget v0, p1, Lwj;->h:I

    .line 211
    .line 212
    const/16 v1, 0x4000

    .line 213
    .line 214
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_d

    .line 219
    .line 220
    iget v0, p0, Lwj;->h:I

    .line 221
    .line 222
    and-int/lit16 v0, v0, -0x2001

    .line 223
    .line 224
    iput v0, p0, Lwj;->h:I

    .line 225
    .line 226
    :cond_d
    iget v0, p1, Lwj;->h:I

    .line 227
    .line 228
    const/high16 v1, 0x20000

    .line 229
    .line 230
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_e

    .line 235
    .line 236
    iget-boolean v0, p1, Lwj;->q:Z

    .line 237
    .line 238
    iput-boolean v0, p0, Lwj;->q:Z

    .line 239
    .line 240
    :cond_e
    iget v0, p1, Lwj;->h:I

    .line 241
    .line 242
    const/16 v1, 0x800

    .line 243
    .line 244
    invoke-static {v0, v1}, Lwj;->k(II)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_f

    .line 249
    .line 250
    iget-object v0, p0, Lwj;->s:Lro;

    .line 251
    .line 252
    iget-object v1, p1, Lwj;->s:Lro;

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Lhg;->putAll(Ljava/util/Map;)V

    .line 255
    .line 256
    .line 257
    iget-boolean v0, p1, Lwj;->w:Z

    .line 258
    .line 259
    iput-boolean v0, p0, Lwj;->w:Z

    .line 260
    .line 261
    :cond_f
    iget v0, p0, Lwj;->h:I

    .line 262
    .line 263
    iget v1, p1, Lwj;->h:I

    .line 264
    .line 265
    or-int/2addr v0, v1

    .line 266
    iput v0, p0, Lwj;->h:I

    .line 267
    .line 268
    iget-object v0, p0, Lwj;->r:Lov1;

    .line 269
    .line 270
    iget-object p1, p1, Lwj;->r:Lov1;

    .line 271
    .line 272
    iget-object v0, v0, Lov1;->b:Lro;

    .line 273
    .line 274
    iget-object p1, p1, Lov1;->b:Lro;

    .line 275
    .line 276
    invoke-virtual {v0, p1}, Lro;->g(Lro;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0}, Lwj;->p()V

    .line 280
    .line 281
    .line 282
    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final d()Lwj;
    .locals 2

    .line 1
    sget-object v0, Lva0;->c:Lva0;

    .line 2
    .line 3
    new-instance v1, Lqs;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lwj;->t(Lva0;Lbl;)Lwj;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lwj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lwj;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lwj;->j(Lwj;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public f()Lwj;
    .locals 3

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lwj;

    .line 6
    .line 7
    new-instance v1, Lov1;

    .line 8
    .line 9
    invoke-direct {v1}, Lov1;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Lwj;->r:Lov1;

    .line 13
    .line 14
    iget-object v2, p0, Lwj;->r:Lov1;

    .line 15
    .line 16
    iget-object v1, v1, Lov1;->b:Lro;

    .line 17
    .line 18
    iget-object v2, v2, Lov1;->b:Lro;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lro;->g(Lro;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lro;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, v2}, Luq2;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, Lwj;->s:Lro;

    .line 30
    .line 31
    iget-object p0, p0, Lwj;->s:Lro;

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Lhg;->putAll(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iput-boolean v2, v0, Lwj;->u:Z

    .line 37
    .line 38
    iput-boolean v2, v0, Lwj;->v:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    return-object v0

    .line 41
    :catch_0
    move-exception p0

    .line 42
    new-instance v0, Ljava/lang/RuntimeException;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method public final g(Ljava/lang/Class;)Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lwj;->g(Ljava/lang/Class;)Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Lwj;->t:Ljava/lang/Class;

    .line 15
    .line 16
    iget p1, p0, Lwj;->h:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x1000

    .line 19
    .line 20
    iput p1, p0, Lwj;->h:I

    .line 21
    .line 22
    invoke-virtual {p0}, Lwj;->p()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final h(Lb90;)Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lwj;->h(Lb90;)Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Lwj;->i:Lb90;

    .line 15
    .line 16
    iget p1, p0, Lwj;->h:I

    .line 17
    .line 18
    or-int/lit8 p1, p1, 0x4

    .line 19
    .line 20
    iput p1, p0, Lwj;->h:I

    .line 21
    .line 22
    invoke-virtual {p0}, Lwj;->p()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    sget-object v0, Lb93;->a:[C

    .line 2
    .line 3
    const/16 v0, 0x11

    .line 4
    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1, v0}, Lb93;->g(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p0, Lwj;->k:I

    .line 16
    .line 17
    invoke-static {v1, v0}, Lb93;->g(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {v0, v1}, Lb93;->h(ILjava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget v2, p0, Lwj;->l:I

    .line 27
    .line 28
    invoke-static {v2, v0}, Lb93;->g(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0, v1}, Lb93;->h(ILjava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-static {v2, v0}, Lb93;->g(II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0, v1}, Lb93;->h(ILjava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-boolean v3, p0, Lwj;->m:Z

    .line 46
    .line 47
    invoke-static {v3, v0}, Lb93;->g(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget v3, p0, Lwj;->n:I

    .line 52
    .line 53
    invoke-static {v3, v0}, Lb93;->g(II)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget v3, p0, Lwj;->o:I

    .line 58
    .line 59
    invoke-static {v3, v0}, Lb93;->g(II)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-boolean v3, p0, Lwj;->q:Z

    .line 64
    .line 65
    invoke-static {v3, v0}, Lb93;->g(II)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-static {v3, v0}, Lb93;->g(II)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v2, v0}, Lb93;->g(II)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {v2, v0}, Lb93;->g(II)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, Lwj;->i:Lb90;

    .line 83
    .line 84
    invoke-static {v0, v2}, Lb93;->h(ILjava/lang/Object;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v2, p0, Lwj;->j:Li32;

    .line 89
    .line 90
    invoke-static {v0, v2}, Lb93;->h(ILjava/lang/Object;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object v2, p0, Lwj;->r:Lov1;

    .line 95
    .line 96
    invoke-static {v0, v2}, Lb93;->h(ILjava/lang/Object;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-object v2, p0, Lwj;->s:Lro;

    .line 101
    .line 102
    invoke-static {v0, v2}, Lb93;->h(ILjava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-object v2, p0, Lwj;->t:Ljava/lang/Class;

    .line 107
    .line 108
    invoke-static {v0, v2}, Lb93;->h(ILjava/lang/Object;)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-object p0, p0, Lwj;->p:La51;

    .line 113
    .line 114
    invoke-static {v0, p0}, Lb93;->h(ILjava/lang/Object;)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    invoke-static {p0, v1}, Lb93;->h(ILjava/lang/Object;)I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    return p0
.end method

.method public final i()Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lwj;->i()Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const v0, 0x106000d

    .line 15
    .line 16
    .line 17
    iput v0, p0, Lwj;->k:I

    .line 18
    .line 19
    iget v0, p0, Lwj;->h:I

    .line 20
    .line 21
    or-int/lit8 v0, v0, 0x20

    .line 22
    .line 23
    and-int/lit8 v0, v0, -0x11

    .line 24
    .line 25
    iput v0, p0, Lwj;->h:I

    .line 26
    .line 27
    invoke-virtual {p0}, Lwj;->p()V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public final j(Lwj;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lwj;->k:I

    .line 13
    .line 14
    iget v1, p1, Lwj;->k:I

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    sget-object v0, Lb93;->a:[C

    .line 19
    .line 20
    iget v0, p0, Lwj;->l:I

    .line 21
    .line 22
    iget v1, p1, Lwj;->l:I

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    iget-boolean v0, p0, Lwj;->m:Z

    .line 27
    .line 28
    iget-boolean v1, p1, Lwj;->m:Z

    .line 29
    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    iget v0, p0, Lwj;->n:I

    .line 33
    .line 34
    iget v1, p1, Lwj;->n:I

    .line 35
    .line 36
    if-ne v0, v1, :cond_0

    .line 37
    .line 38
    iget v0, p0, Lwj;->o:I

    .line 39
    .line 40
    iget v1, p1, Lwj;->o:I

    .line 41
    .line 42
    if-ne v0, v1, :cond_0

    .line 43
    .line 44
    iget-boolean v0, p0, Lwj;->q:Z

    .line 45
    .line 46
    iget-boolean v1, p1, Lwj;->q:Z

    .line 47
    .line 48
    if-ne v0, v1, :cond_0

    .line 49
    .line 50
    iget-object v0, p0, Lwj;->i:Lb90;

    .line 51
    .line 52
    iget-object v1, p1, Lwj;->i:Lb90;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    iget-object v0, p0, Lwj;->j:Li32;

    .line 61
    .line 62
    iget-object v1, p1, Lwj;->j:Li32;

    .line 63
    .line 64
    if-ne v0, v1, :cond_0

    .line 65
    .line 66
    iget-object v0, p0, Lwj;->r:Lov1;

    .line 67
    .line 68
    iget-object v1, p1, Lwj;->r:Lov1;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lov1;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    iget-object v0, p0, Lwj;->s:Lro;

    .line 77
    .line 78
    iget-object v1, p1, Lwj;->s:Lro;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Luq2;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    iget-object v0, p0, Lwj;->t:Ljava/lang/Class;

    .line 87
    .line 88
    iget-object v1, p1, Lwj;->t:Ljava/lang/Class;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_0

    .line 95
    .line 96
    iget-object p0, p0, Lwj;->p:La51;

    .line 97
    .line 98
    iget-object p1, p1, Lwj;->p:La51;

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_0

    .line 105
    .line 106
    const/4 p0, 0x1

    .line 107
    return p0

    .line 108
    :cond_0
    const/4 p0, 0x0

    .line 109
    return p0
.end method

.method public final l(Lva0;Lbl;)Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Lwj;->l(Lva0;Lbl;)Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Lva0;->g:Lmv1;

    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lwj;->q(Lmv1;Lva0;)Lwj;

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p2, p1}, Lwj;->u(Ln33;Z)Lwj;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final m(II)Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Lwj;->m(II)Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput p1, p0, Lwj;->o:I

    .line 15
    .line 16
    iput p2, p0, Lwj;->n:I

    .line 17
    .line 18
    iget p1, p0, Lwj;->h:I

    .line 19
    .line 20
    or-int/lit16 p1, p1, 0x200

    .line 21
    .line 22
    iput p1, p0, Lwj;->h:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lwj;->p()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final n()Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lwj;->n()Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const v0, 0x106000d

    .line 15
    .line 16
    .line 17
    iput v0, p0, Lwj;->l:I

    .line 18
    .line 19
    iget v0, p0, Lwj;->h:I

    .line 20
    .line 21
    or-int/lit16 v0, v0, 0x80

    .line 22
    .line 23
    and-int/lit8 v0, v0, -0x41

    .line 24
    .line 25
    iput v0, p0, Lwj;->h:I

    .line 26
    .line 27
    invoke-virtual {p0}, Lwj;->p()V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public final o()Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lwj;->o()Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Li32;->k:Li32;

    .line 15
    .line 16
    iput-object v0, p0, Lwj;->j:Li32;

    .line 17
    .line 18
    iget v0, p0, Lwj;->h:I

    .line 19
    .line 20
    or-int/lit8 v0, v0, 0x8

    .line 21
    .line 22
    iput v0, p0, Lwj;->h:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lwj;->p()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final p()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lwj;->u:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "You cannot modify locked T, consider clone()"

    .line 7
    .line 8
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final q(Lmv1;Lva0;)Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Lwj;->q(Lmv1;Lva0;)Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p1}, Lfg1;->p(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lwj;->r:Lov1;

    .line 18
    .line 19
    iget-object v0, v0, Lov1;->b:Lro;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Lro;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lwj;->p()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final r(Lis1;)Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lwj;->r(Lis1;)Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Lwj;->p:La51;

    .line 15
    .line 16
    iget p1, p0, Lwj;->h:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x400

    .line 19
    .line 20
    iput p1, p0, Lwj;->h:I

    .line 21
    .line 22
    invoke-virtual {p0}, Lwj;->p()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final s()Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lwj;->s()Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lwj;->m:Z

    .line 16
    .line 17
    iget v0, p0, Lwj;->h:I

    .line 18
    .line 19
    or-int/lit16 v0, v0, 0x100

    .line 20
    .line 21
    iput v0, p0, Lwj;->h:I

    .line 22
    .line 23
    invoke-virtual {p0}, Lwj;->p()V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public final t(Lva0;Lbl;)Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Lwj;->t(Lva0;Lbl;)Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Lva0;->g:Lmv1;

    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lwj;->q(Lmv1;Lva0;)Lwj;

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p2, p1}, Lwj;->u(Ln33;Z)Lwj;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final u(Ln33;Z)Lwj;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2}, Lwj;->u(Ln33;Z)Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Luc0;

    .line 15
    .line 16
    invoke-direct {v0, p1, p2}, Luc0;-><init>(Ln33;Z)V

    .line 17
    .line 18
    .line 19
    const-class v1, Landroid/graphics/Bitmap;

    .line 20
    .line 21
    invoke-virtual {p0, v1, p1, p2}, Lwj;->v(Ljava/lang/Class;Ln33;Z)Lwj;

    .line 22
    .line 23
    .line 24
    const-class v1, Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0, p2}, Lwj;->v(Ljava/lang/Class;Ln33;Z)Lwj;

    .line 27
    .line 28
    .line 29
    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 30
    .line 31
    invoke-virtual {p0, v1, v0, p2}, Lwj;->v(Ljava/lang/Class;Ln33;Z)Lwj;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lap0;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lap0;-><init>(Ln33;)V

    .line 37
    .line 38
    .line 39
    const-class p1, Lyo0;

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0, p2}, Lwj;->v(Ljava/lang/Class;Ln33;Z)Lwj;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lwj;->p()V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public final v(Ljava/lang/Class;Ln33;Z)Lwj;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1, p2, p3}, Lwj;->v(Ljava/lang/Class;Ln33;Z)Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p2}, Lfg1;->p(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lwj;->s:Lro;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lro;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget p1, p0, Lwj;->h:I

    .line 23
    .line 24
    const p2, 0x10800

    .line 25
    .line 26
    .line 27
    or-int/2addr p2, p1

    .line 28
    iput p2, p0, Lwj;->h:I

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    iput-boolean p2, p0, Lwj;->w:Z

    .line 32
    .line 33
    if-eqz p3, :cond_1

    .line 34
    .line 35
    const p2, 0x30800

    .line 36
    .line 37
    .line 38
    or-int/2addr p1, p2

    .line 39
    iput p1, p0, Lwj;->h:I

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    iput-boolean p1, p0, Lwj;->q:Z

    .line 43
    .line 44
    :cond_1
    invoke-virtual {p0}, Lwj;->p()V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public final w()Lwj;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwj;->f()Lwj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lwj;->w()Lwj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lwj;->x:Z

    .line 16
    .line 17
    iget v0, p0, Lwj;->h:I

    .line 18
    .line 19
    const/high16 v1, 0x100000

    .line 20
    .line 21
    or-int/2addr v0, v1

    .line 22
    iput v0, p0, Lwj;->h:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lwj;->p()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method
