.class public final synthetic Lwb/f1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lsh/x;

.field public final synthetic i:Lr/z;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Ljava/util/List;Lfg/l;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/f1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/f1;->h:Lsh/x;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/f1;->i:Lr/z;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/f1;->j:Ljava/util/List;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/f1;->k:Lfg/l;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/f1;->g:I

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
    iget-object p3, p0, Lwb/f1;->h:Lsh/x;

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
    iget-object p1, p0, Lwb/f1;->j:Ljava/util/List;

    .line 84
    .line 85
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    iget-object p3, p0, Lwb/f1;->k:Lfg/l;

    .line 90
    .line 91
    invoke-virtual {v9, p3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    or-int/2addr p2, v1

    .line 96
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-nez p2, :cond_3

    .line 101
    .line 102
    sget-object p2, Li0/l;->a:Li0/e;

    .line 103
    .line 104
    if-ne v1, p2, :cond_4

    .line 105
    .line 106
    :cond_3
    new-instance v1, Lwb/l1;

    .line 107
    .line 108
    const/4 p2, 0x1

    .line 109
    invoke-direct {v1, p1, p3, p2}, Lwb/l1;-><init>(Ljava/util/List;Lfg/l;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v9, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    move-object v8, v1

    .line 116
    check-cast v8, Lfg/l;

    .line 117
    .line 118
    const/4 v10, 0x0

    .line 119
    const/16 v11, 0x1f8

    .line 120
    .line 121
    iget-object v1, p0, Lwb/f1;->i:Lr/z;

    .line 122
    .line 123
    const/4 v3, 0x0

    .line 124
    const/4 v4, 0x0

    .line 125
    const/4 v5, 0x0

    .line 126
    const/4 v6, 0x0

    .line 127
    const/4 v7, 0x0

    .line 128
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 133
    .line 134
    .line 135
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 136
    .line 137
    return-object p1

    .line 138
    :pswitch_0
    if-nez p3, :cond_7

    .line 139
    .line 140
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p3

    .line 144
    if-eqz p3, :cond_6

    .line 145
    .line 146
    const/4 p3, 0x4

    .line 147
    goto :goto_3

    .line 148
    :cond_6
    const/4 p3, 0x2

    .line 149
    :goto_3
    or-int/2addr p2, p3

    .line 150
    :cond_7
    and-int/lit8 p3, p2, 0x13

    .line 151
    .line 152
    const/16 v0, 0x12

    .line 153
    .line 154
    const/4 v1, 0x1

    .line 155
    if-eq p3, v0, :cond_8

    .line 156
    .line 157
    move p3, v1

    .line 158
    goto :goto_4

    .line 159
    :cond_8
    const/4 p3, 0x0

    .line 160
    :goto_4
    and-int/2addr p2, v1

    .line 161
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-eqz p2, :cond_b

    .line 166
    .line 167
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 168
    .line 169
    iget-object p3, p0, Lwb/f1;->h:Lsh/x;

    .line 170
    .line 171
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 172
    .line 173
    const/4 v0, 0x0

    .line 174
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-interface {p1}, Lp/x0;->c()F

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    const/16 p3, 0x8

    .line 183
    .line 184
    int-to-float p3, p3

    .line 185
    add-float/2addr p2, p3

    .line 186
    invoke-interface {p1}, Lp/x0;->a()F

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    const/16 p3, 0x54

    .line 191
    .line 192
    int-to-float p3, p3

    .line 193
    add-float/2addr p1, p3

    .line 194
    const/4 p3, 0x5

    .line 195
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    iget-object p1, p0, Lwb/f1;->j:Ljava/util/List;

    .line 200
    .line 201
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    iget-object p3, p0, Lwb/f1;->k:Lfg/l;

    .line 206
    .line 207
    invoke-virtual {v9, p3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    or-int/2addr p2, v1

    .line 212
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    if-nez p2, :cond_9

    .line 217
    .line 218
    sget-object p2, Li0/l;->a:Li0/e;

    .line 219
    .line 220
    if-ne v1, p2, :cond_a

    .line 221
    .line 222
    :cond_9
    new-instance v1, Lwb/l1;

    .line 223
    .line 224
    const/4 p2, 0x0

    .line 225
    invoke-direct {v1, p1, p3, p2}, Lwb/l1;-><init>(Ljava/util/List;Lfg/l;I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v9, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_a
    move-object v8, v1

    .line 232
    check-cast v8, Lfg/l;

    .line 233
    .line 234
    const/4 v10, 0x0

    .line 235
    const/16 v11, 0x1f8

    .line 236
    .line 237
    iget-object v1, p0, Lwb/f1;->i:Lr/z;

    .line 238
    .line 239
    const/4 v3, 0x0

    .line 240
    const/4 v4, 0x0

    .line 241
    const/4 v5, 0x0

    .line 242
    const/4 v6, 0x0

    .line 243
    const/4 v7, 0x0

    .line 244
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_b
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 249
    .line 250
    .line 251
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 252
    .line 253
    return-object p1

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
