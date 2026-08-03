.class public final Lh/w;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ltg/e;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 27
    iput p4, p0, Lh/w;->g:I

    iput-object p1, p0, Lh/w;->h:Ljava/lang/Object;

    iput-object p2, p0, Lh/w;->i:Ljava/lang/Object;

    iput-object p3, p0, Lh/w;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Li0/a1;Li0/a1;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lh/w;->g:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/w;->h:Ljava/lang/Object;

    iput-object p2, p0, Lh/w;->j:Ljava/lang/Object;

    iput-object p3, p0, Lh/w;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltg/e;Lwf/g;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lh/w;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lh/w;->h:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p2}, Lvg/a;->k(Lwf/g;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, p0, Lh/w;->i:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p2, Lci/j;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/16 v1, 0x11

    .line 19
    .line 20
    invoke-direct {p2, p1, v0, v1}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lh/w;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lh/w;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lsf/e;

    .line 7
    .line 8
    iget-object p2, p0, Lh/w;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Li0/a1;

    .line 11
    .line 12
    iget-object v0, p1, Lsf/e;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object p1, p1, Lsf/e;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 v1, 0x0

    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-static {p2, v2}, Lwb/y2;->Q(Li0/a1;Z)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-static {p2, v1}, Lwb/y2;->Q(Li0/a1;Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    iget-object p2, p0, Lh/w;->i:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p2, Li0/a1;

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    iget-object p1, p0, Lh/w;->h:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    move v1, v2

    .line 58
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 66
    .line 67
    return-object p1

    .line 68
    :pswitch_0
    iget-object v0, p0, Lh/w;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lwf/g;

    .line 71
    .line 72
    iget-object v1, p0, Lh/w;->j:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Lci/j;

    .line 75
    .line 76
    iget-object v2, p0, Lh/w;->i:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {v0, p1, v2, v1, p2}, Lug/c;->a(Lwf/g;Ljava/lang/Object;Ljava/lang/Object;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 83
    .line 84
    if-ne p1, p2, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 88
    .line 89
    :goto_1
    return-object p1

    .line 90
    :pswitch_1
    instance-of v0, p2, Ltg/g;

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    move-object v0, p2

    .line 95
    check-cast v0, Ltg/g;

    .line 96
    .line 97
    iget v1, v0, Ltg/g;->k:I

    .line 98
    .line 99
    const/high16 v2, -0x80000000

    .line 100
    .line 101
    and-int v3, v1, v2

    .line 102
    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    sub-int/2addr v1, v2

    .line 106
    iput v1, v0, Ltg/g;->k:I

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    new-instance v0, Ltg/g;

    .line 110
    .line 111
    invoke-direct {v0, p0, p2}, Ltg/g;-><init>(Lh/w;Lwf/c;)V

    .line 112
    .line 113
    .line 114
    :goto_2
    iget-object p2, v0, Ltg/g;->i:Ljava/lang/Object;

    .line 115
    .line 116
    iget v1, v0, Ltg/g;->k:I

    .line 117
    .line 118
    const/4 v2, 0x3

    .line 119
    const/4 v3, 0x2

    .line 120
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 121
    .line 122
    const/4 v5, 0x1

    .line 123
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 124
    .line 125
    if-eqz v1, :cond_8

    .line 126
    .line 127
    if-eq v1, v5, :cond_5

    .line 128
    .line 129
    if-eq v1, v3, :cond_7

    .line 130
    .line 131
    if-ne v1, v2, :cond_6

    .line 132
    .line 133
    :cond_5
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_6
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 138
    .line 139
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const/4 v4, 0x0

    .line 143
    goto :goto_5

    .line 144
    :cond_7
    iget-object p1, v0, Ltg/g;->h:Ljava/lang/Object;

    .line 145
    .line 146
    iget-object v1, v0, Ltg/g;->g:Lh/w;

    .line 147
    .line 148
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_8
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object p2, p0, Lh/w;->h:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p2, Lgg/q;

    .line 158
    .line 159
    iget-boolean p2, p2, Lgg/q;->g:Z

    .line 160
    .line 161
    if-eqz p2, :cond_9

    .line 162
    .line 163
    iget-object p2, p0, Lh/w;->i:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p2, Ltg/e;

    .line 166
    .line 167
    iput v5, v0, Ltg/g;->k:I

    .line 168
    .line 169
    invoke-interface {p2, p1, v0}, Ltg/e;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    if-ne p1, v6, :cond_b

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_9
    iget-object p2, p0, Lh/w;->j:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p2, Li0/v1;

    .line 179
    .line 180
    iput-object p0, v0, Ltg/g;->g:Lh/w;

    .line 181
    .line 182
    iput-object p1, v0, Ltg/g;->h:Ljava/lang/Object;

    .line 183
    .line 184
    iput v3, v0, Ltg/g;->k:I

    .line 185
    .line 186
    invoke-virtual {p2, p1, v0}, Li0/v1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    if-ne p2, v6, :cond_a

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_a
    move-object v1, p0

    .line 194
    :goto_3
    check-cast p2, Ljava/lang/Boolean;

    .line 195
    .line 196
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    if-nez p2, :cond_b

    .line 201
    .line 202
    iget-object p2, v1, Lh/w;->h:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p2, Lgg/q;

    .line 205
    .line 206
    iput-boolean v5, p2, Lgg/q;->g:Z

    .line 207
    .line 208
    iget-object p2, v1, Lh/w;->i:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast p2, Ltg/e;

    .line 211
    .line 212
    const/4 v1, 0x0

    .line 213
    iput-object v1, v0, Ltg/g;->g:Lh/w;

    .line 214
    .line 215
    iput-object v1, v0, Ltg/g;->h:Ljava/lang/Object;

    .line 216
    .line 217
    iput v2, v0, Ltg/g;->k:I

    .line 218
    .line 219
    invoke-interface {p2, p1, v0}, Ltg/e;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    if-ne p1, v6, :cond_b

    .line 224
    .line 225
    :goto_4
    move-object v4, v6

    .line 226
    :cond_b
    :goto_5
    return-object v4

    .line 227
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    iget-object p2, p0, Lh/w;->i:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast p2, Li/k1;

    .line 236
    .line 237
    iget-object v0, p0, Lh/w;->h:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, Li0/o1;

    .line 240
    .line 241
    if-eqz p1, :cond_c

    .line 242
    .line 243
    iget-object p1, p0, Lh/w;->j:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast p1, Li0/a1;

    .line 246
    .line 247
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, Lfg/p;

    .line 252
    .line 253
    invoke-virtual {p2}, Li/k1;->c()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    iget-object p2, p2, Li/k1;->d:Li0/j1;

    .line 258
    .line 259
    invoke-virtual {p2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    invoke-interface {p1, v1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    check-cast p1, Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    goto :goto_6

    .line 274
    :cond_c
    const/4 p1, 0x0

    .line 275
    :goto_6
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-virtual {v0, p1}, Li0/o1;->setValue(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 283
    .line 284
    return-object p1

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
