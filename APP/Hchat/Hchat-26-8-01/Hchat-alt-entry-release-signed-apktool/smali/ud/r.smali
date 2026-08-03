.class public final Lud/r;
.super Lnd/b0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/m;
.implements Ljava/lang/Comparable;


# static fields
.field public static final J:[Lud/p;


# instance fields
.field public A:I

.field public B:Lud/a;

.field public C:Lud/a;

.field public D:Ljava/util/List;

.field public E:Ljava/util/List;

.field public F:Ljava/util/List;

.field public G:Lxd/b;

.field public H:Ljava/util/List;

.field public I:Lbc/n;

.field public final k:Lod/d;

.field public final l:Lud/e;

.field public m:Lb5/k;

.field public final n:La5/a;

.field public final o:I

.field public p:Z

.field public q:I

.field public r:I

.field public s:Z

.field public t:Lqd/j;

.field public u:Ljava/util/List;

.field public v:Ljava/util/List;

.field public w:Lqd/r;

.field public x:Ljava/util/List;

.field public y:[Lud/p;

.field public z:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lud/r;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    new-array v0, v0, [Lud/p;

    .line 8
    .line 9
    sput-object v0, Lud/r;->J:[Lud/p;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lud/e;Ljf/f;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, Lud/r;->H:Ljava/util/List;

    .line 7
    .line 8
    iget-object v1, p1, Lud/e;->k:Lud/u;

    .line 9
    .line 10
    iget-object v2, p2, Ljf/f;->b:Ljf/h;

    .line 11
    .line 12
    invoke-static {v1, v2}, Lod/d;->d(Lud/u;Ljf/h;)Lod/d;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lud/r;->k:Lod/d;

    .line 17
    .line 18
    iput-object p1, p0, Lud/r;->l:Lud/e;

    .line 19
    .line 20
    new-instance p1, Lb5/k;

    .line 21
    .line 22
    iget v2, p2, Ljf/f;->c:I

    .line 23
    .line 24
    const/4 v3, 0x3

    .line 25
    const/4 v4, 0x3

    .line 26
    invoke-direct {p1, v2, v3, v4}, Lb5/k;-><init>(III)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lud/r;->m:Lb5/k;

    .line 30
    .line 31
    iget-object p1, p2, Ljf/f;->f:La5/a;

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v2, p2

    .line 39
    :goto_0
    iput-boolean v2, p0, Lud/r;->p:Z

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-object p1, p0, Lud/r;->n:La5/a;

    .line 45
    .line 46
    iput p2, p0, Lud/r;->o:I

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p2, La5/a;

    .line 50
    .line 51
    iget-object v2, p1, La5/a;->i:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lac/k;

    .line 54
    .line 55
    invoke-virtual {v2}, Lac/k;->g()Lac/k;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-direct {p2, v2}, La5/a;-><init>(Lac/k;)V

    .line 60
    .line 61
    .line 62
    iget v2, p1, La5/a;->h:I

    .line 63
    .line 64
    iput v2, p2, La5/a;->h:I

    .line 65
    .line 66
    iput-object p2, p0, Lud/r;->n:La5/a;

    .line 67
    .line 68
    invoke-virtual {p1}, La5/a;->f()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iput p1, p0, Lud/r;->o:I

    .line 73
    .line 74
    :goto_1
    iget-object p1, v1, Lod/d;->h:Lqd/j;

    .line 75
    .line 76
    iput-object p1, p0, Lud/r;->t:Lqd/j;

    .line 77
    .line 78
    iget-object p1, v1, Lod/d;->i:Ljava/util/List;

    .line 79
    .line 80
    iput-object p1, p0, Lud/r;->u:Ljava/util/List;

    .line 81
    .line 82
    iput-object v0, p0, Lud/r;->v:Ljava/util/List;

    .line 83
    .line 84
    invoke-virtual {p0}, Lud/r;->e0()V

    .line 85
    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final O()Lb5/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/r;->m:Lb5/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()Lud/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/r;->l:Lud/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q(Lb5/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lud/r;->m:Lb5/k;

    .line 2
    .line 3
    return-void
.end method

.method public final R(Lud/a;)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lud/r;->F:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v1, p0, Lud/r;->F:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lud/r;->F:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lnd/t;

    .line 40
    .line 41
    iget-object v3, v2, Lnd/t;->c:Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-object v0
.end method

.method public final S()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lud/r;->x:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lud/r;->l:Lud/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Lud/e;->a0()Lud/e;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget v1, v1, Lud/e;->y:I

    .line 17
    .line 18
    invoke-static {v1}, Lp/a;->A(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "Method arg registers not loaded: "

    .line 23
    .line 24
    const-string v3, ", class status: "

    .line 25
    .line 26
    invoke-static {v2, v0, v3, v1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    return-object v0
.end method

.method public final T()Lp4/t;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lud/r;->p:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v1, v0, Lud/r;->n:La5/a;

    .line 10
    .line 11
    iget-object v3, v1, La5/a;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lac/k;

    .line 14
    .line 15
    const/16 v4, 0x8

    .line 16
    .line 17
    invoke-virtual {v3, v4}, Lac/k;->B(I)V

    .line 18
    .line 19
    .line 20
    iget-object v5, v3, Lac/k;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->getInt()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    :goto_0
    return-object v2

    .line 31
    :cond_1
    if-ltz v6, :cond_c

    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-gt v6, v7, :cond_c

    .line 38
    .line 39
    iget-object v7, v1, La5/a;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v7, Lac/k;

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    invoke-virtual {v7, v8}, Lac/k;->B(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v7}, Lac/k;->L()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    new-instance v9, Llf/a;

    .line 52
    .line 53
    invoke-virtual {v1}, La5/a;->f()I

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    invoke-direct {v9, v3, v7, v10}, Llf/a;-><init>(Lac/k;II)V

    .line 58
    .line 59
    .line 60
    iget v1, v1, La5/a;->h:I

    .line 61
    .line 62
    iget-object v10, v3, Lac/k;->j:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v10, Lff/e;

    .line 65
    .line 66
    iget-object v10, v10, Lff/e;->d:Ljf/e;

    .line 67
    .line 68
    iget v11, v10, Ljf/e;->g:I

    .line 69
    .line 70
    mul-int/2addr v1, v4

    .line 71
    add-int/2addr v1, v11

    .line 72
    const/4 v11, 0x2

    .line 73
    add-int/2addr v1, v11

    .line 74
    invoke-virtual {v3, v1}, Lac/k;->a(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Lac/k;->L()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    iget v10, v10, Ljf/e;->f:I

    .line 82
    .line 83
    mul-int/lit8 v1, v1, 0xc

    .line 84
    .line 85
    add-int/2addr v1, v10

    .line 86
    add-int/2addr v1, v4

    .line 87
    invoke-virtual {v3, v1}, Lac/k;->a(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->getInt()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_2

    .line 95
    .line 96
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {v3, v1}, Lac/k;->a(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Lac/k;->J()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    const/4 v4, 0x1

    .line 111
    if-eqz v3, :cond_3

    .line 112
    .line 113
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 114
    .line 115
    iput-object v1, v9, Llf/a;->g:Ljava/util/List;

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    new-array v5, v3, [I

    .line 123
    .line 124
    sub-int/2addr v3, v4

    .line 125
    :goto_2
    if-ltz v3, :cond_5

    .line 126
    .line 127
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    check-cast v10, Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v10, v8}, Ljava/lang/String;->charAt(I)C

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    const/16 v12, 0x44

    .line 138
    .line 139
    if-eq v10, v12, :cond_4

    .line 140
    .line 141
    const/16 v12, 0x4a

    .line 142
    .line 143
    if-eq v10, v12, :cond_4

    .line 144
    .line 145
    move v10, v4

    .line 146
    goto :goto_3

    .line 147
    :cond_4
    move v10, v11

    .line 148
    :goto_3
    sub-int/2addr v7, v10

    .line 149
    aput v7, v5, v3

    .line 150
    .line 151
    add-int/lit8 v3, v3, -0x1

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    iput-object v5, v9, Llf/a;->h:[I

    .line 155
    .line 156
    iput-object v1, v9, Llf/a;->g:Ljava/util/List;

    .line 157
    .line 158
    :goto_4
    iget-object v1, v9, Llf/a;->a:Lac/k;

    .line 159
    .line 160
    invoke-virtual {v1, v6}, Lac/k;->a(I)V

    .line 161
    .line 162
    .line 163
    new-instance v3, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    iput-object v3, v9, Llf/a;->e:Ljava/util/ArrayList;

    .line 169
    .line 170
    new-instance v3, Ljava/util/HashMap;

    .line 171
    .line 172
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 173
    .line 174
    .line 175
    iput-object v3, v9, Llf/a;->f:Ljava/util/HashMap;

    .line 176
    .line 177
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    iget-object v6, v9, Llf/a;->g:Ljava/util/List;

    .line 186
    .line 187
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    move v7, v8

    .line 192
    move v10, v7

    .line 193
    :goto_5
    iget-object v11, v9, Llf/a;->b:Lac/k;

    .line 194
    .line 195
    if-ge v7, v5, :cond_7

    .line 196
    .line 197
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    sub-int/2addr v12, v4

    .line 202
    invoke-virtual {v11, v12}, Lac/k;->v(I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    if-eqz v11, :cond_6

    .line 207
    .line 208
    if-ge v7, v6, :cond_6

    .line 209
    .line 210
    new-instance v10, Llf/b;

    .line 211
    .line 212
    iget-object v12, v9, Llf/a;->h:[I

    .line 213
    .line 214
    aget v12, v12, v7

    .line 215
    .line 216
    iget-object v13, v9, Llf/a;->g:Ljava/util/List;

    .line 217
    .line 218
    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v13

    .line 222
    check-cast v13, Ljava/lang/String;

    .line 223
    .line 224
    invoke-direct {v10, v12, v11, v13, v2}, Llf/b;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v9, v10, v8}, Llf/a;->b(Llf/b;I)V

    .line 228
    .line 229
    .line 230
    const/4 v11, -0x1

    .line 231
    iput v11, v10, Llf/b;->f:I

    .line 232
    .line 233
    move v10, v4

    .line 234
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_7
    move v2, v8

    .line 238
    :goto_6
    :pswitch_0
    invoke-virtual {v1}, Lac/k;->K()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    iget v6, v9, Llf/a;->d:I

    .line 243
    .line 244
    iget-object v7, v9, Llf/a;->c:[Llf/b;

    .line 245
    .line 246
    if-nez v5, :cond_a

    .line 247
    .line 248
    if-eqz v10, :cond_9

    .line 249
    .line 250
    array-length v1, v7

    .line 251
    :goto_7
    if-ge v8, v1, :cond_9

    .line 252
    .line 253
    aget-object v2, v7, v8

    .line 254
    .line 255
    if-eqz v2, :cond_8

    .line 256
    .line 257
    iget-boolean v3, v2, Llf/b;->e:Z

    .line 258
    .line 259
    if-nez v3, :cond_8

    .line 260
    .line 261
    add-int/lit8 v3, v6, -0x1

    .line 262
    .line 263
    invoke-virtual {v9, v2, v3}, Llf/a;->a(Llf/b;I)V

    .line 264
    .line 265
    .line 266
    :cond_8
    add-int/lit8 v8, v8, 0x1

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_9
    new-instance v1, Lp4/t;

    .line 270
    .line 271
    iget-object v2, v9, Llf/a;->f:Ljava/util/HashMap;

    .line 272
    .line 273
    iget-object v3, v9, Llf/a;->e:Ljava/util/ArrayList;

    .line 274
    .line 275
    const/4 v4, 0x2

    .line 276
    invoke-direct {v1, v2, v4, v3}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    return-object v1

    .line 280
    :cond_a
    packed-switch v5, :pswitch_data_0

    .line 281
    .line 282
    .line 283
    add-int/lit8 v5, v5, -0xa

    .line 284
    .line 285
    div-int/lit8 v7, v5, 0xf

    .line 286
    .line 287
    add-int/2addr v7, v2

    .line 288
    add-int/lit8 v6, v6, -0x1

    .line 289
    .line 290
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    rem-int/lit8 v5, v5, 0xf

    .line 295
    .line 296
    add-int/lit8 v5, v5, -0x4

    .line 297
    .line 298
    add-int/2addr v5, v3

    .line 299
    iget-object v3, v9, Llf/a;->f:Ljava/util/HashMap;

    .line 300
    .line 301
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    invoke-virtual {v3, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    :goto_8
    move v3, v5

    .line 313
    goto :goto_6

    .line 314
    :pswitch_1
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    sub-int/2addr v5, v4

    .line 319
    invoke-virtual {v11, v5}, Lac/k;->v(I)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    goto :goto_6

    .line 323
    :pswitch_2
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    aget-object v6, v7, v5

    .line 328
    .line 329
    if-eqz v6, :cond_b

    .line 330
    .line 331
    invoke-virtual {v9, v6, v2}, Llf/a;->a(Llf/b;I)V

    .line 332
    .line 333
    .line 334
    new-instance v7, Llf/b;

    .line 335
    .line 336
    iget-object v10, v6, Llf/b;->b:Ljava/lang/String;

    .line 337
    .line 338
    iget-object v12, v6, Llf/b;->c:Ljava/lang/String;

    .line 339
    .line 340
    iget-object v6, v6, Llf/b;->d:Ljava/lang/String;

    .line 341
    .line 342
    invoke-direct {v7, v5, v10, v12, v6}, Llf/b;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v9, v7, v2}, Llf/a;->b(Llf/b;I)V

    .line 346
    .line 347
    .line 348
    :cond_b
    :goto_9
    move v10, v4

    .line 349
    goto :goto_6

    .line 350
    :pswitch_3
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    aget-object v5, v7, v5

    .line 355
    .line 356
    if-eqz v5, :cond_b

    .line 357
    .line 358
    invoke-virtual {v9, v5, v2}, Llf/a;->a(Llf/b;I)V

    .line 359
    .line 360
    .line 361
    goto :goto_9

    .line 362
    :pswitch_4
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 363
    .line 364
    .line 365
    move-result v14

    .line 366
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    add-int/lit8 v15, v5, -0x1

    .line 371
    .line 372
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    add-int/lit8 v16, v5, -0x1

    .line 377
    .line 378
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    add-int/lit8 v17, v5, -0x1

    .line 383
    .line 384
    new-instance v12, Llf/b;

    .line 385
    .line 386
    iget-object v13, v9, Llf/a;->b:Lac/k;

    .line 387
    .line 388
    invoke-direct/range {v12 .. v17}, Llf/b;-><init>(Lac/k;IIII)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v9, v12, v2}, Llf/a;->b(Llf/b;I)V

    .line 392
    .line 393
    .line 394
    goto :goto_9

    .line 395
    :pswitch_5
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 396
    .line 397
    .line 398
    move-result v15

    .line 399
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 400
    .line 401
    .line 402
    move-result v5

    .line 403
    add-int/lit8 v16, v5, -0x1

    .line 404
    .line 405
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 406
    .line 407
    .line 408
    move-result v5

    .line 409
    add-int/lit8 v17, v5, -0x1

    .line 410
    .line 411
    new-instance v13, Llf/b;

    .line 412
    .line 413
    iget-object v14, v9, Llf/a;->b:Lac/k;

    .line 414
    .line 415
    const/16 v18, -0x1

    .line 416
    .line 417
    invoke-direct/range {v13 .. v18}, Llf/b;-><init>(Lac/k;IIII)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v9, v13, v2}, Llf/a;->b(Llf/b;I)V

    .line 421
    .line 422
    .line 423
    goto :goto_9

    .line 424
    :pswitch_6
    invoke-virtual {v1}, Lac/k;->I()I

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    add-int/2addr v5, v3

    .line 429
    goto :goto_8

    .line 430
    :pswitch_7
    invoke-static {v1}, La/a;->H0(Lac/k;)I

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    add-int/2addr v5, v2

    .line 435
    add-int/lit8 v6, v6, -0x1

    .line 436
    .line 437
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    goto/16 :goto_6

    .line 442
    .line 443
    :cond_c
    new-instance v1, Laf/c;

    .line 444
    .line 445
    const-string v2, "Invalid debug info offset"

    .line 446
    .line 447
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    throw v1

    .line 451
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final U(Lud/a;)Lnd/t;
    .locals 3

    .line 1
    iget-object v0, p0, Lud/r;->F:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lud/r;->F:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lnd/t;

    .line 27
    .line 28
    iget-object v2, v1, Lnd/t;->c:Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 38
    return-object p1
.end method

.method public final V(Ljava/util/List;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lud/r;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget v0, p0, Lud/r;->r:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    iget v0, p0, Lud/r;->q:I

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lqd/j;

    .line 30
    .line 31
    invoke-virtual {v2}, Lqd/j;->p()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    sub-int/2addr v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object v1, p0, Lud/r;->m:Lb5/k;

    .line 38
    .line 39
    invoke-virtual {v1}, Lb5/k;->h()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    add-int/lit8 v0, v0, -0x1

    .line 46
    .line 47
    :cond_3
    :goto_1
    iget-object v1, p0, Lud/r;->l:Lud/e;

    .line 48
    .line 49
    iget-object v2, v1, Lud/e;->k:Lud/u;

    .line 50
    .line 51
    iget-object v2, v2, Lud/u;->i:Lfe/a;

    .line 52
    .line 53
    iget-object v3, p0, Lud/r;->m:Lb5/k;

    .line 54
    .line 55
    invoke-virtual {v3}, Lb5/k;->h()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    sget-object v4, Lmd/a;->N:Lmd/a;

    .line 60
    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    iput-object v1, p0, Lud/r;->w:Lqd/r;

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    invoke-virtual {v1}, Lud/e;->b0()Lqd/j;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {p0, v1}, Lfe/a;->c(Lud/r;Lqd/j;)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v3, v0, 0x1

    .line 78
    .line 79
    sget-object v5, Lqd/l;->k:Lmh/b;

    .line 80
    .line 81
    new-instance v5, Lqd/r;

    .line 82
    .line 83
    invoke-direct {v5, v0, v1}, Lqd/r;-><init>(ILqd/j;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lmd/a;->J:Lmd/a;

    .line 87
    .line 88
    invoke-virtual {v5, v0}, Lmd/e;->w(Lmd/a;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, v4}, Lmd/e;->w(Lmd/a;)V

    .line 92
    .line 93
    .line 94
    iput-object v5, p0, Lud/r;->w:Lqd/r;

    .line 95
    .line 96
    move v0, v3

    .line 97
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_5

    .line 102
    .line 103
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 104
    .line 105
    iput-object p1, p0, Lud/r;->x:Ljava/util/List;

    .line 106
    .line 107
    return-void

    .line 108
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 115
    .line 116
    .line 117
    iput-object v1, p0, Lud/r;->x:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Lqd/j;

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-static {p0, v1}, Lfe/a;->c(Lud/r;Lqd/j;)V

    .line 139
    .line 140
    .line 141
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 142
    .line 143
    new-instance v3, Lqd/r;

    .line 144
    .line 145
    invoke-direct {v3, v0, v1}, Lqd/r;-><init>(ILqd/j;)V

    .line 146
    .line 147
    .line 148
    sget-object v5, Lmd/a;->M:Lmd/a;

    .line 149
    .line 150
    invoke-virtual {v3, v5}, Lmd/e;->w(Lmd/a;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v4}, Lmd/e;->w(Lmd/a;)V

    .line 154
    .line 155
    .line 156
    iget-object v5, p0, Lud/r;->x:Ljava/util/List;

    .line 157
    .line 158
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Lqd/j;->p()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    add-int/2addr v0, v1

    .line 166
    goto :goto_3

    .line 167
    :cond_6
    return-void
.end method

.method public final W()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lud/r;->m:Lb5/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb5/k;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lud/r;->k:Lod/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Lod/d;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final X()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lud/r;->W()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, Lud/r;->l:Lud/e;

    .line 9
    .line 10
    iget-object v2, v0, Lud/e;->m:Lod/a;

    .line 11
    .line 12
    invoke-virtual {v2}, Lod/a;->o()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iget-object v2, v0, Lud/e;->o:Lb5/k;

    .line 20
    .line 21
    invoke-virtual {v2}, Lb5/k;->h()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Lud/e;->x:Lud/e;

    .line 28
    .line 29
    iget-object v2, p0, Lud/r;->x:Ljava/util/List;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    iget-object v2, p0, Lud/r;->x:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lqd/r;

    .line 46
    .line 47
    iget-object v2, v2, Lqd/l;->i:Lqd/j;

    .line 48
    .line 49
    iget-object v0, v0, Lud/e;->m:Lod/a;

    .line 50
    .line 51
    iget-object v0, v0, Lod/a;->g:Lqd/j;

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    move v0, v3

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v0, v1

    .line 62
    :goto_0
    iget-object v2, p0, Lud/r;->x:Ljava/util/List;

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-ne v2, v0, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    return v1

    .line 74
    :cond_2
    :goto_1
    return v3

    .line 75
    :cond_3
    return v1
.end method

.method public final Y(Lud/a;)Z
    .locals 3

    .line 1
    iget-object v0, p1, Lud/a;->n:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lud/a;

    .line 16
    .line 17
    iget-object v0, p0, Lud/r;->C:Lud/a;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    iget-object v0, p0, Lud/r;->C:Lud/a;

    .line 25
    .line 26
    iget-object v0, v0, Lud/a;->m:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final Z()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lud/r;->k:Lod/d;

    .line 2
    .line 3
    iget-object v0, v0, Lod/d;->h:Lqd/j;

    .line 4
    .line 5
    sget-object v1, Lqd/j;->j:Lqd/g;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final a0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lud/r;->n:La5/a;

    .line 2
    .line 3
    iget-boolean v1, p0, Lud/r;->s:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    :try_start_0
    iput-boolean v2, p0, Lud/r;->s:Z

    .line 11
    .line 12
    iget-boolean v3, p0, Lud/r;->p:Z

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    iput v1, p0, Lud/r;->q:I

    .line 17
    .line 18
    iget-object v0, p0, Lud/r;->u:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lud/r;->V(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v3, v0, La5/a;->i:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Lac/k;

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Lac/k;->B(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Lac/k;->L()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iput v3, p0, Lud/r;->q:I

    .line 38
    .line 39
    const/4 v3, -0x1

    .line 40
    iput v3, p0, Lud/r;->r:I

    .line 41
    .line 42
    iget-object v3, p0, Lud/r;->u:Ljava/util/List;

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Lud/r;->V(Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    sget-object v3, Lmd/b;->c:Lmd/b;

    .line 48
    .line 49
    iget-object v4, p0, Lmd/e;->g:Lmd/f;

    .line 50
    .line 51
    invoke-virtual {v4, v3}, Lmd/f;->b(Loc/a;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    sget-object v0, Lud/r;->J:[Lud/p;

    .line 58
    .line 59
    iput-object v0, p0, Lud/r;->y:[Lud/p;

    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    new-instance v3, Lp4/t;

    .line 63
    .line 64
    invoke-direct {v3, p0}, Lp4/t;-><init>(Lud/r;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, La5/a;->f()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    new-array v4, v4, [Lud/p;

    .line 72
    .line 73
    new-instance v5, Lbe/w;

    .line 74
    .line 75
    const/16 v6, 0xc

    .line 76
    .line 77
    invoke-direct {v5, v3, v6, v4}, Lbe/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v5}, La5/a;->r(Ljava/util/function/Consumer;)V

    .line 81
    .line 82
    .line 83
    iput-object v4, p0, Lud/r;->y:[Lud/p;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    return-void

    .line 86
    :goto_0
    iget-boolean v3, p0, Lud/r;->p:Z

    .line 87
    .line 88
    if-nez v3, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0}, Lud/r;->e0()V

    .line 91
    .line 92
    .line 93
    iput-boolean v2, p0, Lud/r;->p:Z

    .line 94
    .line 95
    invoke-virtual {p0}, Lud/r;->a0()V

    .line 96
    .line 97
    .line 98
    iput-boolean v1, p0, Lud/r;->p:Z

    .line 99
    .line 100
    :cond_3
    new-instance v1, Laf/b;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    new-instance v4, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v5, "Load method exception: "

    .line 117
    .line 118
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v2, ": "

    .line 125
    .line 126
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-static {p0, v2}, Lxe/h;->b(Lud/k;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    throw v1
.end method

.method public final b0(Lqd/r;)Lqd/s;
    .locals 5

    .line 1
    iget v0, p1, Lqd/r;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lud/r;->D:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, -0x1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Lqd/s;

    .line 21
    .line 22
    iget v4, v3, Lqd/s;->g:I

    .line 23
    .line 24
    if-ne v4, v0, :cond_0

    .line 25
    .line 26
    iget v3, v3, Lqd/s;->h:I

    .line 27
    .line 28
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    new-instance v1, Lqd/s;

    .line 36
    .line 37
    invoke-direct {v1, v0, v2, p1}, Lqd/s;-><init>(IILqd/r;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lud/r;->D:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    new-instance p1, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lud/r;->D:Ljava/util/List;

    .line 54
    .line 55
    :cond_2
    iget-object p1, p0, Lud/r;->D:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    return-object v1
.end method

.method public final c()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lud/r;->u:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "Method generic types not initialized: "

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public final c0(Lqd/j;)Lqd/r;
    .locals 2

    .line 1
    sget-object v0, Lqd/l;->k:Lmh/b;

    .line 2
    .line 3
    new-instance v0, Lqd/r;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1, p1}, Lqd/r;-><init>(ILqd/j;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lmd/a;->m:Lmd/a;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lud/r;->b0(Lqd/r;)Lqd/s;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Lbe/b;->H(Lqd/s;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Lqd/s;->n(Lqd/j;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lud/r;

    .line 2
    .line 3
    iget-object v0, p0, Lud/r;->k:Lod/d;

    .line 4
    .line 5
    iget-object p1, p1, Lud/r;->k:Lod/d;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lod/d;->a(Lod/d;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-super {p0}, Lud/m;->d()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, " (m)"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final d0(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lmd/b;->r:Lmd/b;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lnd/x;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Lnd/x;->h:Ljava/util/SortedSet;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lud/r;

    .line 30
    .line 31
    iget-object v1, v1, Lud/r;->k:Lod/d;

    .line 32
    .line 33
    iput-object p1, v1, Lod/d;->n:Ljava/lang/String;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void

    .line 37
    :cond_1
    iget-object v0, p0, Lud/r;->k:Lod/d;

    .line 38
    .line 39
    iput-object p1, v0, Lod/d;->n:Ljava/lang/String;

    .line 40
    .line 41
    return-void
.end method

.method public final e()Lqd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/r;->t:Lqd/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lud/r;->s:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lud/r;->w:Lqd/r;

    .line 6
    .line 7
    iput-object v0, p0, Lud/r;->x:Ljava/util/List;

    .line 8
    .line 9
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    iput-object v1, p0, Lud/r;->D:Ljava/util/List;

    .line 12
    .line 13
    iput-object v0, p0, Lud/r;->y:[Lud/p;

    .line 14
    .line 15
    iput-object v0, p0, Lud/r;->z:Ljava/util/List;

    .line 16
    .line 17
    iput-object v0, p0, Lud/r;->B:Lud/a;

    .line 18
    .line 19
    iput-object v0, p0, Lud/r;->C:Lud/a;

    .line 20
    .line 21
    iput-object v0, p0, Lud/r;->G:Lxd/b;

    .line 22
    .line 23
    iput-object v1, p0, Lud/r;->E:Ljava/util/List;

    .line 24
    .line 25
    iput-object v1, p0, Lud/r;->F:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {p0}, Lmd/e;->F()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-class v0, Lud/r;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Lud/r;

    .line 17
    .line 18
    iget-object v0, p0, Lud/r;->k:Lod/d;

    .line 19
    .line 20
    iget-object p1, p1, Lud/r;->k:Lod/d;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lod/d;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final f0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lud/r;->z:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lud/a;

    .line 15
    .line 16
    iput v2, v3, Lud/a;->j:I

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/r;->v:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lud/r;->k:Lod/d;

    .line 2
    .line 3
    iget v0, v0, Lod/d;->m:I

    .line 4
    .line 5
    return v0
.end method

.method public final j()I
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    return v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/r;->l:Lud/e;

    .line 2
    .line 3
    iget-object v0, v0, Lud/e;->s:Ljava/lang/String;

    .line 4
    .line 5
    return-object v0
.end method

.method public final n()Lud/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/r;->l:Lud/e;

    .line 2
    .line 3
    iget-object v0, v0, Lud/e;->k:Lud/u;

    .line 4
    .line 5
    return-object v0
.end method

.method public final o()I
    .locals 1

    .line 1
    iget-object v0, p0, Lud/r;->m:Lb5/k;

    .line 2
    .line 3
    iget v0, v0, Lb5/k;->b:I

    .line 4
    .line 5
    return v0
.end method

.method public final q()Lod/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/r;->k:Lod/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, Lmd/b;->v:Lmd/b;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lnd/z;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lnd/z;->g:Ljava/util/HashSet;

    .line 14
    .line 15
    new-instance v1, Lme/a;

    .line 16
    .line 17
    const/16 v2, 0xe

    .line 18
    .line 19
    invoke-direct {v1, v2}, Lme/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :cond_0
    sget-object v0, Loc/c;->i:Loc/c;

    .line 28
    .line 29
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lpc/e;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Lpc/e;->g:Ljava/util/List;

    .line 40
    .line 41
    new-instance v1, Lme/a;

    .line 42
    .line 43
    const/16 v2, 0xe

    .line 44
    .line 45
    invoke-direct {v1, v2}, Lme/a;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 54
    .line 55
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lud/r;->l:Lud/e;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lud/r;->k:Lod/d;

    .line 8
    .line 9
    iget-object v1, v1, Lod/d;->g:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p0, Lud/r;->u:Ljava/util/List;

    .line 12
    .line 13
    const-string v3, ", "

    .line 14
    .line 15
    invoke-static {v2, v3}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, Lud/r;->t:Lqd/j;

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, "."

    .line 34
    .line 35
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, "("

    .line 42
    .line 43
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, "):"

    .line 50
    .line 51
    invoke-static {v4, v0, v3}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method

.method public final typeName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "method"

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lud/r;->m:Lb5/k;

    .line 2
    .line 3
    iget v0, v0, Lb5/k;->b:I

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method
