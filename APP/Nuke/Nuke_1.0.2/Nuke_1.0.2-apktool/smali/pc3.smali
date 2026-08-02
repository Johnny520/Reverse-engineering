.class public final Lpc3;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:Z


# direct methods
.method public constructor <init>(ZLt00;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lpc3;->l:Z

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ltw2;-><init>(ILt00;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lj20;

    .line 2
    .line 3
    check-cast p2, Lt00;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lpc3;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lpc3;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lpc3;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 0

    .line 1
    new-instance p2, Lpc3;

    .line 2
    .line 3
    iget-boolean p0, p0, Lpc3;->l:Z

    .line 4
    .line 5
    invoke-direct {p2, p0, p1}, Lpc3;-><init>(ZLt00;)V

    .line 6
    .line 7
    .line 8
    return-object p2
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ldd3;->h()Lbd3;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lbd3;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    invoke-static {}, Ldd3;->i()Lbd3;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Lbd3;->a()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/util/List;

    .line 23
    .line 24
    iget-boolean p0, p0, Lpc3;->l:Z

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    new-instance p0, Lyb3;

    .line 29
    .line 30
    const/16 v1, 0x10

    .line 31
    .line 32
    invoke-direct {p0, v1}, Lyb3;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    sget-object v2, Lyc3;->j:Lyc3;

    .line 37
    .line 38
    const-string v3, "SELECT r.username, r.alias, r.nickname, i.reserved2 AS avatarUrl\nFROM rcontact r\nLEFT JOIN img_flag i ON r.username = i.username\nWHERE r.username LIKE \'gh_%\'"

    .line 39
    .line 40
    invoke-static {v2, v3, v1, p0}, Ldd3;->m(Lyc3;Ljava/lang/String;[Ljava/lang/String;Lin0;)Lbd3;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-interface {p0}, Lbd3;->a()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ljava/util/List;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    sget-object p0, Lbe0;->h:Lbe0;

    .line 52
    .line 53
    :goto_0
    if-eqz p1, :cond_b

    .line 54
    .line 55
    if-eqz v0, :cond_b

    .line 56
    .line 57
    if-nez p0, :cond_1

    .line 58
    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_1
    invoke-static {}, Leu;->E()Lpb1;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lmz;

    .line 80
    .line 81
    new-instance v3, Ljc3;

    .line 82
    .line 83
    iget-object v4, v2, Lmz;->a:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v2}, Lmz;->a()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    iget-object v2, v2, Lmz;->g:Ljava/lang/String;

    .line 90
    .line 91
    sget-object v6, Lsc3;->h:Lsc3;

    .line 92
    .line 93
    invoke-direct {v3, v4, v5, v2, v6}, Ljc3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsc3;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v3}, Lpb1;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Lcr0;

    .line 115
    .line 116
    new-instance v2, Ljc3;

    .line 117
    .line 118
    iget-object v3, v0, Lcr0;->a:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v4, v0, Lcr0;->b:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v4}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_3

    .line 127
    .line 128
    iget-object v4, v0, Lcr0;->a:Ljava/lang/String;

    .line 129
    .line 130
    :cond_3
    iget-object v0, v0, Lcr0;->e:Ljava/lang/String;

    .line 131
    .line 132
    sget-object v5, Lsc3;->i:Lsc3;

    .line 133
    .line 134
    invoke-direct {v2, v3, v4, v0, v5}, Ljc3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsc3;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v2}, Lpb1;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_6

    .line 150
    .line 151
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Lqs1;

    .line 156
    .line 157
    new-instance v0, Ljc3;

    .line 158
    .line 159
    iget-object v2, p1, Lqs1;->a:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v3, p1, Lqs1;->c:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_5

    .line 168
    .line 169
    iget-object v3, p1, Lqs1;->a:Ljava/lang/String;

    .line 170
    .line 171
    :cond_5
    iget-object p1, p1, Lqs1;->d:Ljava/lang/String;

    .line 172
    .line 173
    sget-object v4, Lsc3;->j:Lsc3;

    .line 174
    .line 175
    invoke-direct {v0, v2, v3, p1, v4}, Ljc3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsc3;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v0}, Lpb1;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_6
    invoke-static {v1}, Leu;->z(Lpb1;)Lpb1;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    new-instance p1, Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 189
    .line 190
    .line 191
    const/4 v0, 0x0

    .line 192
    invoke-virtual {p0, v0}, Lpb1;->listIterator(I)Ljava/util/ListIterator;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    :cond_7
    :goto_4
    move-object v0, p0

    .line 197
    check-cast v0, Lvs0;

    .line 198
    .line 199
    invoke-virtual {v0}, Lvs0;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_8

    .line 204
    .line 205
    invoke-virtual {v0}, Lvs0;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    move-object v1, v0

    .line 210
    check-cast v1, Ljc3;

    .line 211
    .line 212
    iget-object v1, v1, Ljc3;->a:Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-nez v1, :cond_7

    .line 219
    .line 220
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_8
    new-instance p0, Ljava/util/HashSet;

    .line 225
    .line 226
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 227
    .line 228
    .line 229
    new-instance v0, Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    :cond_9
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-eqz v1, :cond_a

    .line 243
    .line 244
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    move-object v2, v1

    .line 249
    check-cast v2, Ljc3;

    .line 250
    .line 251
    iget-object v2, v2, Ljc3;->a:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {p0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_9

    .line 258
    .line 259
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_a
    new-instance p0, Lsl0;

    .line 264
    .line 265
    const/16 p1, 0x1a

    .line 266
    .line 267
    invoke-direct {p0, p1}, Lsl0;-><init>(I)V

    .line 268
    .line 269
    .line 270
    new-instance p1, Lwh;

    .line 271
    .line 272
    const/4 v1, 0x5

    .line 273
    invoke-direct {p1, p0, v1}, Lwh;-><init>(Ljava/util/Comparator;I)V

    .line 274
    .line 275
    .line 276
    invoke-static {v0, p1}, Ldu;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    new-instance p1, Llc3;

    .line 281
    .line 282
    invoke-direct {p1, p0}, Llc3;-><init>(Ljava/util/List;)V

    .line 283
    .line 284
    .line 285
    return-object p1

    .line 286
    :cond_b
    :goto_6
    sget-object p0, Lkc3;->a:Lkc3;

    .line 287
    .line 288
    return-object p0
.end method
