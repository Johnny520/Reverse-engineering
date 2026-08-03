.class public final synthetic Lwb/ll;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lsh/x;

.field public final synthetic i:Lr/z;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Lfg/p;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Ljava/util/List;Ljava/util/List;Lfg/p;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/ll;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ll;->h:Lsh/x;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ll;->i:Lr/z;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/ll;->j:Ljava/util/List;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/ll;->k:Ljava/util/List;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/ll;->l:Lfg/p;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/ll;->g:I

    .line 2
    .line 3
    check-cast p1, Lp/x0;

    .line 4
    .line 5
    move-object v9, p2

    .line 6
    check-cast v9, Li0/h0;

    .line 7
    .line 8
    check-cast p3, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    and-int/lit8 p3, p2, 0x6

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    const/4 p3, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p3, 0x2

    .line 33
    :goto_0
    or-int/2addr p2, p3

    .line 34
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 35
    .line 36
    const/16 v0, 0x12

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    if-eq p3, v0, :cond_2

    .line 40
    .line 41
    move p3, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const/4 p3, 0x0

    .line 44
    :goto_1
    and-int/2addr p2, v1

    .line 45
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_5

    .line 50
    .line 51
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 52
    .line 53
    iget-object p3, p0, Lwb/ll;->h:Lsh/x;

    .line 54
    .line 55
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {p1}, Lp/x0;->c()F

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    const/16 p3, 0x8

    .line 67
    .line 68
    int-to-float p3, p3

    .line 69
    add-float/2addr p2, p3

    .line 70
    invoke-interface {p1}, Lp/x0;->a()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    const/16 p3, 0x54

    .line 75
    .line 76
    int-to-float p3, p3

    .line 77
    add-float/2addr p1, p3

    .line 78
    const/4 p3, 0x5

    .line 79
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-object p1, p0, Lwb/ll;->j:Ljava/util/List;

    .line 84
    .line 85
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    iget-object p3, p0, Lwb/ll;->k:Ljava/util/List;

    .line 90
    .line 91
    invoke-virtual {v9, p3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    or-int/2addr p2, v1

    .line 96
    iget-object v1, p0, Lwb/ll;->l:Lfg/p;

    .line 97
    .line 98
    invoke-virtual {v9, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    or-int/2addr p2, v3

    .line 103
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    if-nez p2, :cond_3

    .line 108
    .line 109
    sget-object p2, Li0/l;->a:Li0/e;

    .line 110
    .line 111
    if-ne v3, p2, :cond_4

    .line 112
    .line 113
    :cond_3
    new-instance v3, Lwb/a9;

    .line 114
    .line 115
    const/4 p2, 0x1

    .line 116
    invoke-direct {v3, p1, p3, v1, p2}, Lwb/a9;-><init>(Ljava/util/List;Ljava/util/List;Lfg/p;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v9, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    move-object v8, v3

    .line 123
    check-cast v8, Lfg/l;

    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    const/16 v11, 0x1f8

    .line 127
    .line 128
    iget-object v1, p0, Lwb/ll;->i:Lr/z;

    .line 129
    .line 130
    const/4 v3, 0x0

    .line 131
    const/4 v4, 0x0

    .line 132
    const/4 v5, 0x0

    .line 133
    const/4 v6, 0x0

    .line 134
    const/4 v7, 0x0

    .line 135
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 140
    .line 141
    .line 142
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 143
    .line 144
    return-object p1

    .line 145
    :pswitch_0
    if-nez p3, :cond_7

    .line 146
    .line 147
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p3

    .line 151
    if-eqz p3, :cond_6

    .line 152
    .line 153
    const/4 p3, 0x4

    .line 154
    goto :goto_3

    .line 155
    :cond_6
    const/4 p3, 0x2

    .line 156
    :goto_3
    or-int/2addr p2, p3

    .line 157
    :cond_7
    and-int/lit8 p3, p2, 0x13

    .line 158
    .line 159
    const/16 v0, 0x12

    .line 160
    .line 161
    const/4 v1, 0x1

    .line 162
    if-eq p3, v0, :cond_8

    .line 163
    .line 164
    move p3, v1

    .line 165
    goto :goto_4

    .line 166
    :cond_8
    const/4 p3, 0x0

    .line 167
    :goto_4
    and-int/2addr p2, v1

    .line 168
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    if-eqz p2, :cond_b

    .line 173
    .line 174
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 175
    .line 176
    iget-object p3, p0, Lwb/ll;->h:Lsh/x;

    .line 177
    .line 178
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 179
    .line 180
    const/4 v0, 0x0

    .line 181
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-interface {p1}, Lp/x0;->c()F

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    const/16 p3, 0x8

    .line 190
    .line 191
    int-to-float p3, p3

    .line 192
    add-float/2addr p2, p3

    .line 193
    invoke-interface {p1}, Lp/x0;->a()F

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    const/16 p3, 0x54

    .line 198
    .line 199
    int-to-float p3, p3

    .line 200
    add-float/2addr p1, p3

    .line 201
    const/4 p3, 0x5

    .line 202
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    iget-object p1, p0, Lwb/ll;->j:Ljava/util/List;

    .line 207
    .line 208
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    iget-object p3, p0, Lwb/ll;->k:Ljava/util/List;

    .line 213
    .line 214
    invoke-virtual {v9, p3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    or-int/2addr p2, v1

    .line 219
    iget-object v1, p0, Lwb/ll;->l:Lfg/p;

    .line 220
    .line 221
    invoke-virtual {v9, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    or-int/2addr p2, v3

    .line 226
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    if-nez p2, :cond_9

    .line 231
    .line 232
    sget-object p2, Li0/l;->a:Li0/e;

    .line 233
    .line 234
    if-ne v3, p2, :cond_a

    .line 235
    .line 236
    :cond_9
    new-instance v3, Lwb/a9;

    .line 237
    .line 238
    const/4 p2, 0x0

    .line 239
    invoke-direct {v3, p1, p3, v1, p2}, Lwb/a9;-><init>(Ljava/util/List;Ljava/util/List;Lfg/p;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v9, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_a
    move-object v8, v3

    .line 246
    check-cast v8, Lfg/l;

    .line 247
    .line 248
    const/4 v10, 0x0

    .line 249
    const/16 v11, 0x1f8

    .line 250
    .line 251
    iget-object v1, p0, Lwb/ll;->i:Lr/z;

    .line 252
    .line 253
    const/4 v3, 0x0

    .line 254
    const/4 v4, 0x0

    .line 255
    const/4 v5, 0x0

    .line 256
    const/4 v6, 0x0

    .line 257
    const/4 v7, 0x0

    .line 258
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 259
    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_b
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 263
    .line 264
    .line 265
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 266
    .line 267
    return-object p1

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
