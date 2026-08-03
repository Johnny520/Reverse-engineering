.class public final La1/h;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, La1/h;->g:I

    .line 2
    .line 3
    iput-object p1, p0, La1/h;->h:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Ly1/a;II)V
    .locals 0

    .line 10
    iput p3, p0, La1/h;->g:I

    iput-object p1, p0, La1/h;->h:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, La1/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li0/h0;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, La1/h;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Ly2/x;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-static {v0}, Li0/r;->C(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p2, p1, v0}, Ly2/x;->a(Li0/h0;I)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_0
    check-cast p1, Li0/h0;

    .line 29
    .line 30
    check-cast p2, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, La1/h;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p2, Ly2/t;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-static {v0}, Li0/r;->C(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p2, p1, v0}, Ly2/t;->a(Li0/h0;I)V

    .line 45
    .line 46
    .line 47
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_1
    check-cast p1, Li0/h0;

    .line 51
    .line 52
    check-cast p2, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    and-int/lit8 v0, p2, 0x3

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    const/4 v2, 0x1

    .line 62
    const/4 v3, 0x0

    .line 63
    if-eq v0, v1, :cond_0

    .line 64
    .line 65
    move v0, v2

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v0, v3

    .line 68
    :goto_0
    and-int/2addr p2, v2

    .line 69
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_2

    .line 74
    .line 75
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    sget-object v0, Li0/l;->a:Li0/e;

    .line 80
    .line 81
    if-ne p2, v0, :cond_1

    .line 82
    .line 83
    sget-object p2, Ly2/c;->h:Ly2/c;

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    check-cast p2, Lfg/l;

    .line 89
    .line 90
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 91
    .line 92
    invoke-static {v0, p2}, Lf2/o;->a(Ly0/o;Lfg/l;)Ly0/o;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    iget-object v0, p0, La1/h;->h:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Li0/a1;

    .line 99
    .line 100
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Lfg/p;

    .line 105
    .line 106
    invoke-static {p2, v0, p1, v3}, Lx6/d;->f(Ly0/o;Lfg/p;Li0/h0;I)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 111
    .line 112
    .line 113
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 114
    .line 115
    return-object p1

    .line 116
    :pswitch_2
    check-cast p1, Li0/h0;

    .line 117
    .line 118
    check-cast p2, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 121
    .line 122
    .line 123
    iget-object p2, p0, La1/h;->h:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p2, Ly1/c1;

    .line 126
    .line 127
    const/4 v0, 0x1

    .line 128
    invoke-static {v0}, Li0/r;->C(I)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-virtual {p2, p1, v0}, Ly1/c1;->a(Li0/h0;I)V

    .line 133
    .line 134
    .line 135
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 136
    .line 137
    return-object p1

    .line 138
    :pswitch_3
    check-cast p1, Li0/h0;

    .line 139
    .line 140
    check-cast p2, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    and-int/lit8 v0, p2, 0x3

    .line 147
    .line 148
    const/4 v1, 0x2

    .line 149
    const/4 v2, 0x0

    .line 150
    const/4 v3, 0x1

    .line 151
    if-eq v0, v1, :cond_3

    .line 152
    .line 153
    move v0, v3

    .line 154
    goto :goto_2

    .line 155
    :cond_3
    move v0, v2

    .line 156
    :goto_2
    and-int/2addr p2, v3

    .line 157
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-eqz p2, :cond_4

    .line 162
    .line 163
    iget-object p2, p0, La1/h;->h:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p2, Ly1/a;

    .line 166
    .line 167
    invoke-virtual {p2, p1, v2}, Ly1/a;->a(Li0/h0;I)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_4
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 172
    .line 173
    .line 174
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 175
    .line 176
    return-object p1

    .line 177
    :pswitch_4
    check-cast p1, Ly0/o;

    .line 178
    .line 179
    check-cast p2, Ly0/m;

    .line 180
    .line 181
    iget-object v0, p0, La1/h;->h:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v0, Li0/h0;

    .line 184
    .line 185
    instance-of v1, p2, Ly0/j;

    .line 186
    .line 187
    if-eqz v1, :cond_5

    .line 188
    .line 189
    check-cast p2, Ly0/j;

    .line 190
    .line 191
    iget-object p2, p2, Ly0/j;->a:Lfg/q;

    .line 192
    .line 193
    const/4 v1, 0x3

    .line 194
    invoke-static {v1, p2}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    const/4 v1, 0x0

    .line 198
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    sget-object v2, Ly0/l;->a:Ly0/l;

    .line 203
    .line 204
    invoke-interface {p2, v2, v0, v1}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    check-cast p2, Ly0/o;

    .line 209
    .line 210
    invoke-static {v0, p2}, Ly0/a;->b(Li0/h0;Ly0/o;)Ly0/o;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    :cond_5
    invoke-interface {p1, p2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    return-object p1

    .line 219
    :pswitch_5
    check-cast p1, Lh/f0;

    .line 220
    .line 221
    check-cast p2, Lh/f0;

    .line 222
    .line 223
    sget-object v0, Lh/f0;->i:Lh/f0;

    .line 224
    .line 225
    if-ne p1, v0, :cond_6

    .line 226
    .line 227
    if-ne p2, v0, :cond_6

    .line 228
    .line 229
    iget-object p1, p0, La1/h;->h:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p1, Lh/s0;

    .line 232
    .line 233
    iget-object p1, p1, Lh/s0;->a:Lh/h1;

    .line 234
    .line 235
    iget-boolean p1, p1, Lh/h1;->c:Z

    .line 236
    .line 237
    if-nez p1, :cond_6

    .line 238
    .line 239
    const/4 p1, 0x1

    .line 240
    goto :goto_4

    .line 241
    :cond_6
    const/4 p1, 0x0

    .line 242
    :goto_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    return-object p1

    .line 247
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    check-cast p2, Lf2/q;

    .line 254
    .line 255
    iget-object v0, p0, La1/h;->h:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, La1/i;

    .line 258
    .line 259
    invoke-virtual {v0, p1, p2}, La1/i;->m(ILf2/q;)V

    .line 260
    .line 261
    .line 262
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 263
    .line 264
    return-object p1

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
