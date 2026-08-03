.class public final synthetic Lwb/zb;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILfg/p;Lfg/l;Lfg/l;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 22
    iput p8, p0, Lwb/zb;->g:I

    iput-object p1, p0, Lwb/zb;->n:Ljava/lang/Object;

    iput p2, p0, Lwb/zb;->h:I

    iput-object p3, p0, Lwb/zb;->i:Ljava/lang/Object;

    iput-object p4, p0, Lwb/zb;->j:Lfg/l;

    iput-object p5, p0, Lwb/zb;->k:Lfg/l;

    iput-object p6, p0, Lwb/zb;->l:Ljava/lang/Object;

    iput-object p7, p0, Lwb/zb;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lna/h;Lfg/l;ILjava/util/List;Lfg/l;Lfg/l;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lwb/zb;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/zb;->n:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/zb;->j:Lfg/l;

    .line 10
    .line 11
    iput p3, p0, Lwb/zb;->h:I

    .line 12
    .line 13
    iput-object p4, p0, Lwb/zb;->i:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/zb;->k:Lfg/l;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/zb;->l:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/zb;->m:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/zb;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/zb;->n:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Lna/h;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/zb;->i:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v5, v0

    .line 14
    check-cast v5, Ljava/util/List;

    .line 15
    .line 16
    iget-object v0, p0, Lwb/zb;->l:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v7, v0

    .line 19
    check-cast v7, Lfg/l;

    .line 20
    .line 21
    iget-object v0, p0, Lwb/zb;->m:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v8, v0

    .line 24
    check-cast v8, Lfg/l;

    .line 25
    .line 26
    check-cast p1, Lr/d;

    .line 27
    .line 28
    check-cast p2, Li0/h0;

    .line 29
    .line 30
    check-cast p3, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 p1, p3, 0x11

    .line 40
    .line 41
    const/16 v0, 0x10

    .line 42
    .line 43
    const/4 v9, 0x1

    .line 44
    if-eq p1, v0, :cond_0

    .line 45
    .line 46
    move p1, v9

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p1, 0x0

    .line 49
    :goto_0
    and-int/2addr p3, v9

    .line 50
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    new-instance v1, Lc9/t0;

    .line 57
    .line 58
    iget-object v3, p0, Lwb/zb;->j:Lfg/l;

    .line 59
    .line 60
    iget v4, p0, Lwb/zb;->h:I

    .line 61
    .line 62
    iget-object v6, p0, Lwb/zb;->k:Lfg/l;

    .line 63
    .line 64
    invoke-direct/range {v1 .. v8}, Lc9/t0;-><init>(Lna/h;Lfg/l;ILjava/util/List;Lfg/l;Lfg/l;Lfg/l;)V

    .line 65
    .line 66
    .line 67
    const p1, -0x2d1c945b

    .line 68
    .line 69
    .line 70
    invoke-static {p1, v1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const/16 p3, 0x30

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-static {v0, p1, p2, p3, v9}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 82
    .line 83
    .line 84
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_0
    iget-object v0, p0, Lwb/zb;->n:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v2, v0

    .line 90
    check-cast v2, Lv8/a;

    .line 91
    .line 92
    iget-object v0, p0, Lwb/zb;->i:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v4, v0

    .line 95
    check-cast v4, Lfg/p;

    .line 96
    .line 97
    iget-object v0, p0, Lwb/zb;->l:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v7, v0

    .line 100
    check-cast v7, Li0/a1;

    .line 101
    .line 102
    iget-object v0, p0, Lwb/zb;->m:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v8, v0

    .line 105
    check-cast v8, Li0/a1;

    .line 106
    .line 107
    check-cast p1, Lr/d;

    .line 108
    .line 109
    check-cast p2, Li0/h0;

    .line 110
    .line 111
    check-cast p3, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    and-int/lit8 p1, p3, 0x11

    .line 121
    .line 122
    const/16 v0, 0x10

    .line 123
    .line 124
    const/4 v10, 0x1

    .line 125
    if-eq p1, v0, :cond_2

    .line 126
    .line 127
    move p1, v10

    .line 128
    goto :goto_2

    .line 129
    :cond_2
    const/4 p1, 0x0

    .line 130
    :goto_2
    and-int/2addr p3, v10

    .line 131
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-eqz p1, :cond_3

    .line 136
    .line 137
    new-instance v1, Lc9/t0;

    .line 138
    .line 139
    const/4 v9, 0x3

    .line 140
    iget v3, p0, Lwb/zb;->h:I

    .line 141
    .line 142
    iget-object v5, p0, Lwb/zb;->j:Lfg/l;

    .line 143
    .line 144
    iget-object v6, p0, Lwb/zb;->k:Lfg/l;

    .line 145
    .line 146
    invoke-direct/range {v1 .. v9}, Lc9/t0;-><init>(Ljava/lang/Object;ILfg/p;Lfg/l;Lfg/l;Li0/a1;Li0/a1;I)V

    .line 147
    .line 148
    .line 149
    const p1, 0x74cf04a

    .line 150
    .line 151
    .line 152
    invoke-static {p1, v1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    const/16 p3, 0x30

    .line 157
    .line 158
    const/4 v0, 0x0

    .line 159
    invoke-static {v0, p1, p2, p3, v10}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 164
    .line 165
    .line 166
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 167
    .line 168
    return-object p1

    .line 169
    :pswitch_1
    iget-object v0, p0, Lwb/zb;->n:Ljava/lang/Object;

    .line 170
    .line 171
    move-object v2, v0

    .line 172
    check-cast v2, Lx8/b;

    .line 173
    .line 174
    iget-object v0, p0, Lwb/zb;->i:Ljava/lang/Object;

    .line 175
    .line 176
    move-object v4, v0

    .line 177
    check-cast v4, Lfg/p;

    .line 178
    .line 179
    iget-object v0, p0, Lwb/zb;->l:Ljava/lang/Object;

    .line 180
    .line 181
    move-object v7, v0

    .line 182
    check-cast v7, Li0/a1;

    .line 183
    .line 184
    iget-object v0, p0, Lwb/zb;->m:Ljava/lang/Object;

    .line 185
    .line 186
    move-object v8, v0

    .line 187
    check-cast v8, Li0/a1;

    .line 188
    .line 189
    check-cast p1, Lr/d;

    .line 190
    .line 191
    check-cast p2, Li0/h0;

    .line 192
    .line 193
    check-cast p3, Ljava/lang/Integer;

    .line 194
    .line 195
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result p3

    .line 199
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    and-int/lit8 p1, p3, 0x11

    .line 203
    .line 204
    const/16 v0, 0x10

    .line 205
    .line 206
    const/4 v10, 0x1

    .line 207
    if-eq p1, v0, :cond_4

    .line 208
    .line 209
    move p1, v10

    .line 210
    goto :goto_4

    .line 211
    :cond_4
    const/4 p1, 0x0

    .line 212
    :goto_4
    and-int/2addr p3, v10

    .line 213
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-eqz p1, :cond_5

    .line 218
    .line 219
    new-instance v1, Lc9/t0;

    .line 220
    .line 221
    const/4 v9, 0x2

    .line 222
    iget v3, p0, Lwb/zb;->h:I

    .line 223
    .line 224
    iget-object v5, p0, Lwb/zb;->j:Lfg/l;

    .line 225
    .line 226
    iget-object v6, p0, Lwb/zb;->k:Lfg/l;

    .line 227
    .line 228
    invoke-direct/range {v1 .. v9}, Lc9/t0;-><init>(Ljava/lang/Object;ILfg/p;Lfg/l;Lfg/l;Li0/a1;Li0/a1;I)V

    .line 229
    .line 230
    .line 231
    const p1, -0x4bf6a216

    .line 232
    .line 233
    .line 234
    invoke-static {p1, v1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    const/16 p3, 0x30

    .line 239
    .line 240
    const/4 v0, 0x0

    .line 241
    invoke-static {v0, p1, p2, p3, v10}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 246
    .line 247
    .line 248
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 249
    .line 250
    return-object p1

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
