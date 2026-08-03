.class public final Lbe/n0;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final h:Lmh/b;


# instance fields
.field public g:Lod/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lbe/n0;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lbe/n0;->h:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public static i(Ljava/util/List;)Ljava/util/List;
    .locals 12

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_a

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lqd/l;

    .line 18
    .line 19
    invoke-virtual {v3}, Lqd/l;->K()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_9

    .line 24
    .line 25
    if-eqz v2, :cond_9

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    new-instance v2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    :goto_1
    if-ge v1, v0, :cond_7

    .line 42
    .line 43
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lqd/l;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    instance-of v5, v4, Lqd/n;

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    if-eqz v5, :cond_3

    .line 56
    .line 57
    move-object v5, v4

    .line 58
    check-cast v5, Lqd/n;

    .line 59
    .line 60
    sget-object v7, Lfd/j;->a:Lmh/b;

    .line 61
    .line 62
    iget-object v7, v5, Lqd/l;->i:Lqd/j;

    .line 63
    .line 64
    if-nez v7, :cond_0

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_0
    iget-wide v8, v5, Lqd/n;->l:J

    .line 68
    .line 69
    invoke-virtual {v7}, Lqd/j;->o()Lqd/q;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    const-wide/16 v10, 0x0

    .line 78
    .line 79
    packed-switch v5, :pswitch_data_0

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :pswitch_0
    cmp-long v5, v8, v10

    .line 84
    .line 85
    if-eqz v5, :cond_1

    .line 86
    .line 87
    sget-object v5, Lfd/j;->a:Lmh/b;

    .line 88
    .line 89
    const-string v6, "Wrong object literal: {} for type: {}"

    .line 90
    .line 91
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-interface {v5, v10, v6, v7}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    goto :goto_2

    .line 103
    :cond_1
    const-string v6, "null"

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :pswitch_1
    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 107
    .line 108
    .line 109
    move-result-wide v5

    .line 110
    invoke-static {v5, v6}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    goto :goto_2

    .line 115
    :pswitch_2
    long-to-int v5, v8

    .line 116
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    invoke-static {v5}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    goto :goto_2

    .line 125
    :pswitch_3
    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    goto :goto_2

    .line 130
    :pswitch_4
    long-to-int v5, v8

    .line 131
    int-to-char v5, v5

    .line 132
    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    goto :goto_2

    .line 137
    :pswitch_5
    cmp-long v5, v8, v10

    .line 138
    .line 139
    if-nez v5, :cond_2

    .line 140
    .line 141
    const-string v6, "false"

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_2
    const-string v6, "true"

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    instance-of v5, v4, Lqd/m;

    .line 148
    .line 149
    if-eqz v5, :cond_4

    .line 150
    .line 151
    move-object v5, v4

    .line 152
    check-cast v5, Lqd/m;

    .line 153
    .line 154
    iget-object v5, v5, Lqd/m;->l:Lud/p;

    .line 155
    .line 156
    instance-of v7, v5, Lpd/d;

    .line 157
    .line 158
    if-eqz v7, :cond_4

    .line 159
    .line 160
    check-cast v5, Lpd/d;

    .line 161
    .line 162
    iget-object v6, v5, Lpd/d;->o:Ljava/lang/String;

    .line 163
    .line 164
    :cond_4
    :goto_2
    if-eqz v6, :cond_5

    .line 165
    .line 166
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-nez v5, :cond_6

    .line 175
    .line 176
    invoke-static {v3, p0, v1}, Lbe/n0;->k(Ljava/util/ArrayList;Ljava/util/List;I)Lqd/l;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 184
    .line 185
    .line 186
    :cond_6
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 190
    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_8

    .line 198
    .line 199
    invoke-static {v3, p0, v0}, Lbe/n0;->k(Ljava/util/ArrayList;Ljava/util/List;I)Lqd/l;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    :cond_8
    return-object v2

    .line 207
    :cond_9
    move v2, v3

    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_a
    return-object p0

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static j(Lud/r;Lpd/n;Ljava/util/List;)Lud/p;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x2

    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lud/p;

    .line 22
    .line 23
    iget-object v6, v5, Lud/p;->k:Lpd/k;

    .line 24
    .line 25
    sget-object v7, Lpd/k;->S:Lpd/k;

    .line 26
    .line 27
    if-eq v6, v7, :cond_1

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1
    check-cast v5, Ltd/a;

    .line 31
    .line 32
    iget-object v6, v5, Lud/p;->m:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    const/4 v7, 0x1

    .line 39
    if-ne v6, v7, :cond_3

    .line 40
    .line 41
    iget-object v6, v5, Ltd/a;->o:Lod/d;

    .line 42
    .line 43
    iget-object v6, v6, Lod/d;->i:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Lqd/j;

    .line 50
    .line 51
    invoke-virtual {v6}, Lqd/j;->v()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_2

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_2
    invoke-virtual {v5, v4}, Lud/p;->S(I)Lqd/l;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catch_0
    move-exception p1

    .line 67
    goto/16 :goto_5

    .line 68
    .line 69
    :cond_3
    :goto_0
    move v4, v7

    .line 70
    :goto_1
    if-ge v4, v1, :cond_6

    .line 71
    .line 72
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lud/p;

    .line 77
    .line 78
    iget-object v6, v5, Lud/p;->k:Lpd/k;

    .line 79
    .line 80
    sget-object v8, Lpd/k;->O:Lpd/k;

    .line 81
    .line 82
    if-ne v6, v8, :cond_4

    .line 83
    .line 84
    iget-object v6, v5, Lud/p;->m:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-ne v6, v2, :cond_4

    .line 91
    .line 92
    move-object v6, v5

    .line 93
    check-cast v6, Lpd/n;

    .line 94
    .line 95
    iget-object v6, v6, Lpd/n;->p:Lod/d;

    .line 96
    .line 97
    iget-object v8, v6, Lod/d;->j:Lod/a;

    .line 98
    .line 99
    iget-object v8, v8, Lod/a;->j:Ljava/lang/String;

    .line 100
    .line 101
    const-string v9, "java.lang.StringBuilder"

    .line 102
    .line 103
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_4

    .line 108
    .line 109
    iget-object v6, v6, Lod/d;->g:Ljava/lang/String;

    .line 110
    .line 111
    const-string v8, "append"

    .line 112
    .line 113
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_4

    .line 118
    .line 119
    invoke-virtual {v5, v7}, Lud/p;->S(I)Lqd/l;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    goto :goto_2

    .line 124
    :cond_4
    move-object v5, v0

    .line 125
    :goto_2
    if-nez v5, :cond_5

    .line 126
    .line 127
    :goto_3
    return-object v0

    .line 128
    :cond_5
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    add-int/lit8 v4, v4, 0x1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_9

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Lqd/l;

    .line 149
    .line 150
    invoke-virtual {v2}, Lqd/l;->I()Lqd/j;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    sget-object v4, Lqd/j;->m:Lqd/e;

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_7

    .line 161
    .line 162
    new-instance v1, Lae/d;

    .line 163
    .line 164
    const/16 v2, 0x13

    .line 165
    .line 166
    invoke-direct {v1, v2}, Lae/d;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-static {v3, v1}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, Lbe/n0;->i(Ljava/util/List;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    new-instance v2, Lud/p;

    .line 178
    .line 179
    sget-object v3, Lpd/k;->V:Lpd/k;

    .line 180
    .line 181
    invoke-direct {v2, v3, v1}, Lud/p;-><init>(Lpd/k;Ljava/util/List;)V

    .line 182
    .line 183
    .line 184
    sget-object v1, Lmd/a;->m:Lmd/a;

    .line 185
    .line 186
    invoke-virtual {v2, v1}, Lmd/e;->w(Lmd/a;)V

    .line 187
    .line 188
    .line 189
    iget-object v1, p1, Lud/p;->l:Lqd/r;

    .line 190
    .line 191
    if-nez v1, :cond_8

    .line 192
    .line 193
    sget-object v1, Lmd/a;->S:Lmd/a;

    .line 194
    .line 195
    iget-object v3, p1, Lmd/e;->g:Lmd/f;

    .line 196
    .line 197
    invoke-virtual {v3, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-nez v1, :cond_8

    .line 202
    .line 203
    invoke-virtual {p0, v4}, Lud/r;->c0(Lqd/j;)Lqd/r;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v2, v1}, Lud/p;->d0(Lqd/r;)V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_8
    iget-object v1, p1, Lud/p;->l:Lqd/r;

    .line 212
    .line 213
    invoke-virtual {v2, v1}, Lud/p;->d0(Lqd/r;)V

    .line 214
    .line 215
    .line 216
    :goto_4
    invoke-virtual {v2, p1}, Lmd/e;->B(Lmd/e;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, p1}, Lnd/r;->H(Lud/p;)V

    .line 220
    .line 221
    .line 222
    invoke-static {p0, p1, p2}, Lbe/n0;->l(Lud/r;Lpd/n;Ljava/util/List;)V

    .line 223
    .line 224
    .line 225
    return-object v2

    .line 226
    :cond_9
    new-instance p1, Lae/d;

    .line 227
    .line 228
    const/16 p2, 0x12

    .line 229
    .line 230
    invoke-direct {p1, p2}, Lae/d;-><init>(I)V

    .line 231
    .line 232
    .line 233
    const-string p2, ", "

    .line 234
    .line 235
    invoke-static {v3, p2, p1}, Lxe/s;->k(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    new-instance p2, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    const-string v1, "TODO: convert one arg to string using `String.valueOf()`, args: "

    .line 245
    .line 246
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-virtual {p0, p1}, Lnd/b0;->I(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 257
    .line 258
    .line 259
    return-object v0

    .line 260
    :goto_5
    const-string p2, "String concatenation convert failed"

    .line 261
    .line 262
    invoke-virtual {p0, p2, p1}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    return-object v0
.end method

.method public static k(Ljava/util/ArrayList;Ljava/util/List;I)Lqd/l;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    sub-int/2addr p2, v1

    .line 9
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lqd/l;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-static {p0}, Lxe/s;->h(Ljava/util/Collection;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const-string p0, ""

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-ne p1, v1, :cond_2

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Ljava/lang/String;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance p2, Lae/g;

    .line 45
    .line 46
    const/16 v0, 0x16

    .line 47
    .line 48
    invoke-direct {p2, p1, v0}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    new-instance p1, Lpd/d;

    .line 59
    .line 60
    invoke-direct {p1, p0}, Lpd/d;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public static l(Lud/r;Lpd/n;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lxe/l;->h(Lud/r;Lud/p;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lud/p;

    .line 19
    .line 20
    invoke-static {p0, v1}, Lxe/l;->h(Lud/r;Lud/p;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lud/p;

    .line 44
    .line 45
    if-eq v1, p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v1}, Lxe/l;->j(Lud/r;Lud/p;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-eqz p2, :cond_4

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p2, Lud/p;

    .line 76
    .line 77
    invoke-static {p0, p2}, Lxe/l;->d(Lud/r;Lud/p;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 82
    .line 83
    .line 84
    :goto_3
    return-void
.end method

.method public static n(Lud/r;Lpd/i;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lud/p;->S(I)Lqd/l;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    instance-of v2, v1, Lqd/m;

    .line 10
    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    check-cast v1, Lqd/m;

    .line 14
    .line 15
    iget-object v1, v1, Lqd/m;->l:Lud/p;

    .line 16
    .line 17
    iget-object v2, v1, Lud/p;->k:Lpd/k;

    .line 18
    .line 19
    sget-object v3, Lpd/k;->t:Lpd/k;

    .line 20
    .line 21
    if-eq v2, v3, :cond_0

    .line 22
    .line 23
    sget-object v3, Lpd/k;->u:Lpd/k;

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    :cond_0
    const/4 v2, 0x1

    .line 28
    invoke-virtual {p1, v2}, Lud/p;->S(I)Lqd/l;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Lqd/l;->R()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    iget v3, p1, Lpd/i;->p:I

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lud/p;->S(I)Lqd/l;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Lqd/l;->H()Lqd/l;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v1, v2}, Lud/p;->S(I)Lqd/l;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5}, Lqd/l;->H()Lqd/l;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    iput v3, p1, Lpd/i;->p:I

    .line 57
    .line 58
    invoke-virtual {p1, v0, v4}, Lud/p;->c0(ILqd/l;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v2, v5}, Lud/p;->c0(ILqd/l;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v1}, Lxe/l;->j(Lud/r;Lud/p;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    sget-object p0, Lbe/n0;->h:Lmh/b;

    .line 69
    .line 70
    const-string v0, "TODO: cmp {}"

    .line 71
    .line 72
    invoke-interface {p0, p1, v0}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void
.end method


# virtual methods
.method public final f(Lud/u;)V
    .locals 4

    .line 1
    sget-object v0, Lqd/j;->m:Lqd/e;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    sget-object v2, Lqd/j;->d:Lqd/g;

    .line 10
    .line 11
    new-instance v3, Lqd/a;

    .line 12
    .line 13
    invoke-direct {v3, v2}, Lqd/a;-><init>(Lqd/j;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "getBytes"

    .line 17
    .line 18
    invoke-static {p1, v0, v2, v1, v3}, Lod/d;->b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lbe/n0;->g:Lod/d;

    .line 23
    .line 24
    return-void
.end method

.method public final g(Lud/r;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, Lud/r;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p1, Lud/r;->z:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lud/a;

    .line 24
    .line 25
    invoke-virtual {p0, p1, v2}, Lbe/n0;->m(Lud/r;Lud/a;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    if-nez v1, :cond_4

    .line 34
    .line 35
    sget-object v0, Lmd/a;->b0:Lmd/a;

    .line 36
    .line 37
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    :goto_1
    return-void

    .line 47
    :cond_4
    :goto_2
    invoke-static {p1}, Lbe/b;->Y(Lud/r;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final m(Lud/r;Lud/a;)Z
    .locals 7

    .line 1
    iget-object v0, p2, Lud/a;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    move v3, v2

    .line 6
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    if-ge v2, v4, :cond_4

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Lud/p;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-virtual {p0, p1, v4, v6}, Lbe/n0;->o(Lud/r;Lud/p;Lud/p;)Lud/p;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    if-eqz v6, :cond_3

    .line 28
    .line 29
    invoke-virtual {v6}, Lud/p;->Z()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-ge v2, v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-ne v3, v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, v2, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-static {v0, v4, v1}, Lxe/k;->a(Ljava/util/List;Lud/p;I)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/4 v4, -0x1

    .line 53
    if-eq v3, v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v3, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/4 v4, 0x1

    .line 63
    if-ge v3, v5, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0, p1, p2}, Lbe/n0;->m(Lud/r;Lud/a;)Z

    .line 66
    .line 67
    .line 68
    return v4

    .line 69
    :cond_1
    move v3, v4

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const-string p1, "Failed to replace insn"

    .line 72
    .line 73
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    return p1

    .line 78
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    return v3
.end method

.method public final o(Lud/r;Lud/p;Lud/p;)Lud/p;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    iget-object v4, v3, Lmd/e;->g:Lmd/f;

    .line 10
    .line 11
    iget-object v5, v3, Lud/p;->k:Lpd/k;

    .line 12
    .line 13
    sget-object v6, Lmd/a;->s:Lmd/a;

    .line 14
    .line 15
    invoke-virtual {v4, v6}, Lmd/f;->a(Lmd/a;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v6, 0x0

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    :cond_0
    :goto_0
    move-object/from16 v16, v6

    .line 23
    .line 24
    goto/16 :goto_13

    .line 25
    .line 26
    :cond_1
    iget-object v4, v3, Lud/p;->m:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const/4 v7, 0x0

    .line 33
    move v8, v7

    .line 34
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    const/4 v10, 0x1

    .line 39
    if-eqz v9, :cond_3

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    check-cast v9, Lqd/l;

    .line 46
    .line 47
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    instance-of v11, v9, Lqd/m;

    .line 51
    .line 52
    if-eqz v11, :cond_2

    .line 53
    .line 54
    move-object v11, v9

    .line 55
    check-cast v11, Lqd/m;

    .line 56
    .line 57
    iget-object v11, v11, Lqd/m;->l:Lud/p;

    .line 58
    .line 59
    invoke-virtual {v1, v2, v11, v3}, Lbe/n0;->o(Lud/r;Lud/p;Lud/p;)Lud/p;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    if-eqz v12, :cond_2

    .line 64
    .line 65
    invoke-virtual {v9, v2, v12, v7}, Lqd/l;->b0(Lud/r;Lud/p;Z)Lqd/l;

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v11}, Lxe/l;->j(Lud/r;Lud/p;)V

    .line 69
    .line 70
    .line 71
    move v8, v10

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    if-eqz v8, :cond_4

    .line 74
    .line 75
    invoke-virtual {v3}, Lud/p;->Z()V

    .line 76
    .line 77
    .line 78
    sget-object v4, Lmd/a;->b0:Lmd/a;

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Lmd/e;->w(Lmd/a;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    const/4 v8, 0x3

    .line 88
    sget-object v9, Lpd/k;->m:Lpd/k;

    .line 89
    .line 90
    sget-object v11, Lpd/k;->g:Lpd/k;

    .line 91
    .line 92
    if-eq v4, v8, :cond_30

    .line 93
    .line 94
    const/4 v12, 0x6

    .line 95
    if-eq v4, v12, :cond_2f

    .line 96
    .line 97
    const/16 v11, 0x8

    .line 98
    .line 99
    sget-object v12, Lpd/k;->j:Lpd/k;

    .line 100
    .line 101
    if-eq v4, v11, :cond_27

    .line 102
    .line 103
    const/16 v11, 0xf

    .line 104
    .line 105
    if-eq v4, v11, :cond_26

    .line 106
    .line 107
    const/16 v11, 0x14

    .line 108
    .line 109
    if-eq v4, v11, :cond_27

    .line 110
    .line 111
    const/16 v0, 0x1f

    .line 112
    .line 113
    if-eq v4, v0, :cond_1b

    .line 114
    .line 115
    const/16 v0, 0x21

    .line 116
    .line 117
    if-eq v4, v0, :cond_1b

    .line 118
    .line 119
    const/16 v0, 0x22

    .line 120
    .line 121
    if-eq v4, v0, :cond_d

    .line 122
    .line 123
    const/16 v0, 0x25

    .line 124
    .line 125
    if-eq v4, v0, :cond_b

    .line 126
    .line 127
    const/16 v0, 0x26

    .line 128
    .line 129
    if-eq v4, v0, :cond_5

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_5
    move-object v0, v3

    .line 133
    check-cast v0, Ltd/a;

    .line 134
    .line 135
    iget-object v3, v0, Ltd/a;->o:Lod/d;

    .line 136
    .line 137
    iget-object v4, v0, Lud/p;->m:Ljava/util/List;

    .line 138
    .line 139
    iget-object v3, v3, Lod/d;->j:Lod/a;

    .line 140
    .line 141
    iget-object v3, v3, Lod/a;->g:Lqd/j;

    .line 142
    .line 143
    sget-object v5, Lqd/j;->m:Lqd/e;

    .line 144
    .line 145
    invoke-virtual {v3, v5}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_0

    .line 150
    .line 151
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_0

    .line 156
    .line 157
    invoke-virtual {v0, v7}, Lud/p;->S(I)Lqd/l;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    instance-of v3, v3, Lqd/m;

    .line 165
    .line 166
    if-eqz v3, :cond_0

    .line 167
    .line 168
    invoke-virtual {v0, v7}, Lud/p;->S(I)Lqd/l;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Lqd/m;

    .line 173
    .line 174
    iget-object v3, v3, Lqd/m;->l:Lud/p;

    .line 175
    .line 176
    iget-object v5, v3, Lud/p;->k:Lpd/k;

    .line 177
    .line 178
    iget-object v9, v3, Lud/p;->m:Ljava/util/List;

    .line 179
    .line 180
    sget-object v11, Lpd/k;->F:Lpd/k;

    .line 181
    .line 182
    if-ne v5, v11, :cond_0

    .line 183
    .line 184
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-eqz v5, :cond_0

    .line 189
    .line 190
    move-object v5, v3

    .line 191
    check-cast v5, Lpd/g;

    .line 192
    .line 193
    iget-object v5, v5, Lpd/g;->o:Lqd/j;

    .line 194
    .line 195
    sget-object v11, Lqd/j;->d:Lqd/g;

    .line 196
    .line 197
    if-eq v5, v11, :cond_6

    .line 198
    .line 199
    sget-object v11, Lqd/j;->f:Lqd/g;

    .line 200
    .line 201
    if-ne v5, v11, :cond_0

    .line 202
    .line 203
    :cond_6
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    new-array v9, v5, [B

    .line 208
    .line 209
    move v11, v7

    .line 210
    move v12, v11

    .line 211
    :goto_2
    if-ge v11, v5, :cond_9

    .line 212
    .line 213
    invoke-virtual {v3, v11}, Lud/p;->S(I)Lqd/l;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    instance-of v14, v13, Lqd/n;

    .line 221
    .line 222
    if-nez v14, :cond_7

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :cond_7
    check-cast v13, Lqd/n;

    .line 227
    .line 228
    iget-wide v13, v13, Lqd/n;->l:J

    .line 229
    .line 230
    long-to-int v13, v13

    .line 231
    int-to-byte v13, v13

    .line 232
    aput-byte v13, v9, v11

    .line 233
    .line 234
    int-to-char v13, v13

    .line 235
    sget-object v14, Lkd/d;->a:Ljava/util/regex/Pattern;

    .line 236
    .line 237
    const/16 v14, 0x20

    .line 238
    .line 239
    if-gt v14, v13, :cond_8

    .line 240
    .line 241
    const/16 v14, 0x7e

    .line 242
    .line 243
    if-gt v13, v14, :cond_8

    .line 244
    .line 245
    add-int/lit8 v12, v12, 0x1

    .line 246
    .line 247
    :cond_8
    add-int/lit8 v11, v11, 0x1

    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_9
    sub-int/2addr v5, v12

    .line 251
    if-lt v12, v5, :cond_0

    .line 252
    .line 253
    new-instance v3, Lpd/d;

    .line 254
    .line 255
    new-instance v5, Ljava/lang/String;

    .line 256
    .line 257
    invoke-direct {v5, v9}, Ljava/lang/String;-><init>([B)V

    .line 258
    .line 259
    .line 260
    invoke-direct {v3, v5}, Lpd/d;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-ne v4, v10, :cond_a

    .line 268
    .line 269
    iget-object v4, v0, Lud/p;->l:Lqd/r;

    .line 270
    .line 271
    invoke-virtual {v3, v4}, Lud/p;->d0(Lqd/r;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v0}, Lmd/e;->B(Lmd/e;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v0}, Lnd/r;->H(Lud/p;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v7}, Lud/p;->S(I)Lqd/l;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-static {v2, v0}, Lxe/l;->i(Lud/r;Lqd/l;)V

    .line 285
    .line 286
    .line 287
    return-object v3

    .line 288
    :cond_a
    new-instance v2, Lpd/n;

    .line 289
    .line 290
    iget-object v4, v1, Lbe/n0;->g:Lod/d;

    .line 291
    .line 292
    invoke-direct {v2, v4, v8, v10}, Lpd/n;-><init>(Lod/d;II)V

    .line 293
    .line 294
    .line 295
    invoke-static {v3}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    invoke-virtual {v2, v3}, Lud/p;->I(Lqd/l;)V

    .line 300
    .line 301
    .line 302
    invoke-static {v2}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    iget-object v3, v1, Lbe/n0;->g:Lod/d;

    .line 307
    .line 308
    iget-object v3, v3, Lod/d;->h:Lqd/j;

    .line 309
    .line 310
    iput-object v3, v2, Lqd/l;->i:Lqd/j;

    .line 311
    .line 312
    invoke-virtual {v0, v7, v2}, Lud/p;->c0(ILqd/l;)V

    .line 313
    .line 314
    .line 315
    return-object v6

    .line 316
    :cond_b
    move-object v0, v3

    .line 317
    check-cast v0, Ltd/b;

    .line 318
    .line 319
    iget-object v3, v0, Ltd/b;->o:Lyd/b;

    .line 320
    .line 321
    invoke-virtual {v3}, Lyd/b;->L()Z

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    if-eqz v4, :cond_c

    .line 326
    .line 327
    iget-object v0, v3, Lyd/b;->k:Lxe/e;

    .line 328
    .line 329
    iget-object v0, v0, Lxe/e;->b:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Lpd/i;

    .line 332
    .line 333
    invoke-static {v2, v0}, Lbe/n0;->n(Lud/r;Lpd/i;)V

    .line 334
    .line 335
    .line 336
    return-object v6

    .line 337
    :cond_c
    invoke-virtual {v0}, Ltd/b;->i0()V

    .line 338
    .line 339
    .line 340
    return-object v6

    .line 341
    :cond_d
    move-object v0, v3

    .line 342
    check-cast v0, Lpd/n;

    .line 343
    .line 344
    iget-object v3, v0, Lpd/n;->p:Lod/d;

    .line 345
    .line 346
    iget-object v4, v3, Lod/d;->j:Lod/a;

    .line 347
    .line 348
    iget-object v4, v4, Lod/a;->j:Ljava/lang/String;

    .line 349
    .line 350
    const-string v5, "java.lang.StringBuilder"

    .line 351
    .line 352
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    if-eqz v4, :cond_0

    .line 357
    .line 358
    iget-object v3, v3, Lod/d;->k:Ljava/lang/String;

    .line 359
    .line 360
    const-string v4, "toString()Ljava/lang/String;"

    .line 361
    .line 362
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-eqz v3, :cond_0

    .line 367
    .line 368
    invoke-virtual {v0, v7}, Lud/p;->S(I)Lqd/l;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    instance-of v4, v3, Lqd/m;

    .line 376
    .line 377
    if-eqz v4, :cond_10

    .line 378
    .line 379
    new-instance v3, Ljava/util/ArrayList;

    .line 380
    .line 381
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v7}, Lud/p;->S(I)Lqd/l;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    :goto_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    instance-of v5, v4, Lqd/m;

    .line 392
    .line 393
    if-eqz v5, :cond_f

    .line 394
    .line 395
    check-cast v4, Lqd/m;

    .line 396
    .line 397
    iget-object v4, v4, Lqd/m;->l:Lud/p;

    .line 398
    .line 399
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    iget-object v5, v4, Lud/p;->k:Lpd/k;

    .line 403
    .line 404
    sget-object v6, Lpd/k;->S:Lpd/k;

    .line 405
    .line 406
    if-eq v5, v6, :cond_f

    .line 407
    .line 408
    iget-object v5, v4, Lud/p;->m:Ljava/util/List;

    .line 409
    .line 410
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    if-nez v5, :cond_e

    .line 415
    .line 416
    goto :goto_4

    .line 417
    :cond_e
    invoke-virtual {v4, v7}, Lud/p;->S(I)Lqd/l;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    goto :goto_3

    .line 422
    :cond_f
    :goto_4
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 423
    .line 424
    .line 425
    invoke-static {v2, v0, v3}, Lbe/n0;->j(Lud/r;Lpd/n;Ljava/util/List;)Lud/p;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    return-object v0

    .line 430
    :cond_10
    instance-of v4, v3, Lqd/r;

    .line 431
    .line 432
    if-eqz v4, :cond_0

    .line 433
    .line 434
    check-cast v3, Lqd/r;

    .line 435
    .line 436
    iget-object v3, v3, Lqd/r;->m:Lqd/s;

    .line 437
    .line 438
    invoke-virtual {v3}, Lqd/s;->j()Z

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    iget-object v5, v3, Lqd/s;->j:Ljava/util/ArrayList;

    .line 443
    .line 444
    if-nez v4, :cond_19

    .line 445
    .line 446
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    if-nez v4, :cond_11

    .line 451
    .line 452
    goto/16 :goto_7

    .line 453
    .line 454
    :cond_11
    new-instance v4, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 457
    .line 458
    .line 459
    move-result v6

    .line 460
    add-int/2addr v6, v10

    .line 461
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 462
    .line 463
    .line 464
    iget-object v3, v3, Lqd/s;->i:Lqd/r;

    .line 465
    .line 466
    iget-object v3, v3, Lqd/l;->j:Lud/p;

    .line 467
    .line 468
    if-nez v3, :cond_12

    .line 469
    .line 470
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 471
    .line 472
    goto :goto_8

    .line 473
    :cond_12
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 477
    .line 478
    .line 479
    move-result-object v5

    .line 480
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 481
    .line 482
    .line 483
    move-result v6

    .line 484
    if-eqz v6, :cond_14

    .line 485
    .line 486
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    check-cast v6, Lqd/r;

    .line 491
    .line 492
    iget-object v6, v6, Lqd/l;->j:Lud/p;

    .line 493
    .line 494
    if-nez v6, :cond_13

    .line 495
    .line 496
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 497
    .line 498
    goto :goto_8

    .line 499
    :cond_13
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    goto :goto_5

    .line 503
    :cond_14
    invoke-static {v4, v0, v7}, Lxe/k;->a(Ljava/util/List;Lud/p;I)I

    .line 504
    .line 505
    .line 506
    move-result v5

    .line 507
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    sub-int/2addr v6, v10

    .line 512
    if-eq v6, v5, :cond_15

    .line 513
    .line 514
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 515
    .line 516
    goto :goto_8

    .line 517
    :cond_15
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    iget-object v5, v2, Lud/r;->z:Ljava/util/List;

    .line 521
    .line 522
    invoke-static {v2, v3, v5}, La/a;->S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    if-nez v5, :cond_16

    .line 527
    .line 528
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 529
    .line 530
    goto :goto_8

    .line 531
    :cond_16
    iget-object v5, v5, Lud/a;->l:Ljava/util/ArrayList;

    .line 532
    .line 533
    invoke-static {v5, v3, v7}, Lxe/k;->a(Ljava/util/List;Lud/p;I)I

    .line 534
    .line 535
    .line 536
    move-result v3

    .line 537
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 538
    .line 539
    .line 540
    move-result v6

    .line 541
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 542
    .line 543
    .line 544
    move-result v7

    .line 545
    sub-int/2addr v7, v3

    .line 546
    if-ge v7, v6, :cond_17

    .line 547
    .line 548
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 549
    .line 550
    goto :goto_8

    .line 551
    :cond_17
    :goto_6
    if-ge v10, v6, :cond_1a

    .line 552
    .line 553
    add-int v7, v3, v10

    .line 554
    .line 555
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v8

    .line 563
    if-eq v7, v8, :cond_18

    .line 564
    .line 565
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 566
    .line 567
    goto :goto_8

    .line 568
    :cond_18
    add-int/lit8 v10, v10, 0x1

    .line 569
    .line 570
    goto :goto_6

    .line 571
    :cond_19
    :goto_7
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 572
    .line 573
    :cond_1a
    :goto_8
    invoke-static {v2, v0, v4}, Lbe/n0;->j(Lud/r;Lpd/n;Ljava/util/List;)Lud/p;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    return-object v0

    .line 578
    :cond_1b
    invoke-virtual {v3, v7}, Lud/p;->S(I)Lqd/l;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    instance-of v4, v0, Lqd/m;

    .line 586
    .line 587
    if-nez v4, :cond_1c

    .line 588
    .line 589
    goto/16 :goto_0

    .line 590
    .line 591
    :cond_1c
    check-cast v0, Lqd/m;

    .line 592
    .line 593
    iget-object v0, v0, Lqd/m;->l:Lud/p;

    .line 594
    .line 595
    iget-object v4, v0, Lud/p;->k:Lpd/k;

    .line 596
    .line 597
    sget-object v8, Lpd/k;->V:Lpd/k;

    .line 598
    .line 599
    if-eq v4, v12, :cond_1d

    .line 600
    .line 601
    if-ne v4, v8, :cond_0

    .line 602
    .line 603
    :cond_1d
    invoke-virtual {v0, v7}, Lud/p;->S(I)Lqd/l;

    .line 604
    .line 605
    .line 606
    move-result-object v9

    .line 607
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    instance-of v9, v9, Lqd/m;

    .line 611
    .line 612
    if-nez v9, :cond_1e

    .line 613
    .line 614
    goto/16 :goto_0

    .line 615
    .line 616
    :cond_1e
    invoke-virtual {v0, v7}, Lud/p;->S(I)Lqd/l;

    .line 617
    .line 618
    .line 619
    move-result-object v9

    .line 620
    move-object v11, v9

    .line 621
    check-cast v11, Lqd/m;

    .line 622
    .line 623
    iget-object v11, v11, Lqd/m;->l:Lud/p;

    .line 624
    .line 625
    iget-object v13, v11, Lud/p;->k:Lpd/k;

    .line 626
    .line 627
    sget-object v14, Lpd/k;->K:Lpd/k;

    .line 628
    .line 629
    if-eq v13, v14, :cond_1f

    .line 630
    .line 631
    sget-object v15, Lpd/k;->M:Lpd/k;

    .line 632
    .line 633
    if-eq v13, v15, :cond_1f

    .line 634
    .line 635
    goto/16 :goto_0

    .line 636
    .line 637
    :cond_1f
    move-object v15, v3

    .line 638
    check-cast v15, Lpd/j;

    .line 639
    .line 640
    iget-object v15, v15, Lpd/j;->o:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v15, Lod/c;

    .line 643
    .line 644
    move-object v6, v11

    .line 645
    check-cast v6, Lpd/j;

    .line 646
    .line 647
    iget-object v6, v6, Lpd/j;->o:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v6, Lod/c;

    .line 650
    .line 651
    invoke-virtual {v15, v6}, Lod/c;->equals(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v6

    .line 655
    if-nez v6, :cond_21

    .line 656
    .line 657
    :cond_20
    :goto_9
    const/16 v16, 0x0

    .line 658
    .line 659
    goto/16 :goto_13

    .line 660
    .line 661
    :cond_21
    sget-object v6, Lpd/k;->L:Lpd/k;

    .line 662
    .line 663
    if-ne v13, v14, :cond_22

    .line 664
    .line 665
    if-ne v5, v6, :cond_22

    .line 666
    .line 667
    :try_start_0
    invoke-virtual {v11, v7}, Lud/p;->S(I)Lqd/l;

    .line 668
    .line 669
    .line 670
    move-result-object v7

    .line 671
    invoke-virtual {v3, v10}, Lud/p;->S(I)Lqd/l;

    .line 672
    .line 673
    .line 674
    move-result-object v13

    .line 675
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v7

    .line 679
    if-nez v7, :cond_22

    .line 680
    .line 681
    goto :goto_9

    .line 682
    :catch_0
    move-exception v0

    .line 683
    goto :goto_b

    .line 684
    :cond_22
    invoke-virtual {v9}, Lqd/l;->H()Lqd/l;

    .line 685
    .line 686
    .line 687
    move-result-object v7

    .line 688
    invoke-static {v2, v11}, Lxe/l;->j(Lud/r;Lud/p;)V

    .line 689
    .line 690
    .line 691
    if-ne v5, v6, :cond_23

    .line 692
    .line 693
    invoke-virtual {v3, v10}, Lud/p;->S(I)Lqd/l;

    .line 694
    .line 695
    .line 696
    move-result-object v5

    .line 697
    invoke-static {v2, v5}, Lxe/l;->i(Lud/r;Lqd/l;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 698
    .line 699
    .line 700
    :cond_23
    sget-object v5, Lmd/a;->T:Lmd/a;

    .line 701
    .line 702
    if-ne v4, v12, :cond_24

    .line 703
    .line 704
    :try_start_1
    check-cast v0, Lpd/a;

    .line 705
    .line 706
    iget v4, v0, Lpd/a;->o:I

    .line 707
    .line 708
    invoke-virtual {v0, v10}, Lud/p;->S(I)Lqd/l;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    new-instance v6, Lpd/a;

    .line 713
    .line 714
    const/4 v8, 0x0

    .line 715
    invoke-direct {v6, v4, v8, v7, v0}, Lpd/a;-><init>(ILqd/r;Lqd/l;Lqd/l;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v6, v5}, Lmd/e;->w(Lmd/a;)V

    .line 719
    .line 720
    .line 721
    return-object v6

    .line 722
    :cond_24
    iget-object v4, v0, Lud/p;->m:Ljava/util/List;

    .line 723
    .line 724
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 725
    .line 726
    .line 727
    move-result v4

    .line 728
    new-instance v6, Lud/p;

    .line 729
    .line 730
    add-int/lit8 v9, v4, -0x1

    .line 731
    .line 732
    invoke-direct {v6, v8, v9}, Lud/p;-><init>(Lpd/k;I)V

    .line 733
    .line 734
    .line 735
    move v8, v10

    .line 736
    :goto_a
    if-ge v8, v4, :cond_25

    .line 737
    .line 738
    invoke-virtual {v0, v8}, Lud/p;->S(I)Lqd/l;

    .line 739
    .line 740
    .line 741
    move-result-object v9

    .line 742
    invoke-virtual {v6, v9}, Lud/p;->I(Lqd/l;)V

    .line 743
    .line 744
    .line 745
    add-int/lit8 v8, v8, 0x1

    .line 746
    .line 747
    goto :goto_a

    .line 748
    :cond_25
    invoke-static {v6}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    sget-object v4, Lqd/j;->m:Lqd/e;

    .line 753
    .line 754
    iput-object v4, v0, Lqd/l;->i:Lqd/j;

    .line 755
    .line 756
    new-instance v4, Lpd/a;

    .line 757
    .line 758
    const/4 v8, 0x0

    .line 759
    invoke-direct {v4, v10, v8, v7, v0}, Lpd/a;-><init>(ILqd/r;Lqd/l;Lqd/l;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v4, v5}, Lmd/e;->w(Lmd/a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 763
    .line 764
    .line 765
    return-object v4

    .line 766
    :goto_b
    const-string v4, "Can\'t convert field arith insn: {}, mth: {}"

    .line 767
    .line 768
    filled-new-array {v3, v2, v0}, [Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    sget-object v2, Lbe/n0;->h:Lmh/b;

    .line 773
    .line 774
    invoke-interface {v2, v4, v0}, Lmh/b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 775
    .line 776
    .line 777
    const/16 v16, 0x0

    .line 778
    .line 779
    return-object v16

    .line 780
    :cond_26
    move-object/from16 v16, v6

    .line 781
    .line 782
    move-object v0, v3

    .line 783
    check-cast v0, Lpd/i;

    .line 784
    .line 785
    invoke-static {v2, v0}, Lbe/n0;->n(Lud/r;Lpd/i;)V

    .line 786
    .line 787
    .line 788
    return-object v16

    .line 789
    :cond_27
    check-cast v3, Lpd/j;

    .line 790
    .line 791
    sget-object v4, Lmd/a;->X:Lmd/a;

    .line 792
    .line 793
    iget-object v5, v3, Lmd/e;->g:Lmd/f;

    .line 794
    .line 795
    invoke-virtual {v5, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 796
    .line 797
    .line 798
    move-result v4

    .line 799
    if-eqz v4, :cond_28

    .line 800
    .line 801
    goto/16 :goto_9

    .line 802
    .line 803
    :cond_28
    invoke-virtual {v3, v7}, Lud/p;->S(I)Lqd/l;

    .line 804
    .line 805
    .line 806
    move-result-object v4

    .line 807
    invoke-virtual {v4}, Lqd/l;->I()Lqd/j;

    .line 808
    .line 809
    .line 810
    move-result-object v5

    .line 811
    instance-of v6, v4, Lqd/m;

    .line 812
    .line 813
    if-eqz v6, :cond_29

    .line 814
    .line 815
    move-object v6, v4

    .line 816
    check-cast v6, Lqd/m;

    .line 817
    .line 818
    iget-object v6, v6, Lqd/m;->l:Lud/p;

    .line 819
    .line 820
    iget-object v8, v6, Lud/p;->k:Lpd/k;

    .line 821
    .line 822
    sget-object v11, Lpd/k;->O:Lpd/k;

    .line 823
    .line 824
    if-ne v8, v11, :cond_29

    .line 825
    .line 826
    check-cast v6, Lpd/n;

    .line 827
    .line 828
    iget-object v5, v6, Lpd/n;->p:Lod/d;

    .line 829
    .line 830
    iget-object v5, v5, Lod/d;->h:Lqd/j;

    .line 831
    .line 832
    :cond_29
    iget-object v6, v3, Lpd/j;->o:Ljava/lang/Object;

    .line 833
    .line 834
    check-cast v6, Lqd/j;

    .line 835
    .line 836
    if-eqz v0, :cond_2a

    .line 837
    .line 838
    iget-object v8, v0, Lud/p;->k:Lpd/k;

    .line 839
    .line 840
    if-ne v8, v12, :cond_2a

    .line 841
    .line 842
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    instance-of v8, v5, Lqd/g;

    .line 846
    .line 847
    if-eqz v8, :cond_2a

    .line 848
    .line 849
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    instance-of v8, v6, Lqd/g;

    .line 853
    .line 854
    if-eqz v8, :cond_2a

    .line 855
    .line 856
    invoke-virtual {v6}, Lqd/j;->p()I

    .line 857
    .line 858
    .line 859
    move-result v8

    .line 860
    invoke-virtual {v5}, Lqd/j;->p()I

    .line 861
    .line 862
    .line 863
    move-result v11

    .line 864
    if-le v8, v11, :cond_2a

    .line 865
    .line 866
    goto/16 :goto_9

    .line 867
    .line 868
    :cond_2a
    iget-object v8, v2, Lud/r;->l:Lud/e;

    .line 869
    .line 870
    iget-object v8, v8, Lud/e;->k:Lud/u;

    .line 871
    .line 872
    sget-object v11, Lqd/j;->b:Lqd/g;

    .line 873
    .line 874
    invoke-virtual {v5, v6}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 875
    .line 876
    .line 877
    move-result v11

    .line 878
    if-eqz v11, :cond_2b

    .line 879
    .line 880
    move v5, v7

    .line 881
    goto :goto_c

    .line 882
    :cond_2b
    iget-object v8, v8, Lud/u;->g:Lqe/x;

    .line 883
    .line 884
    iget-object v8, v8, Lqe/x;->c:Lqe/k;

    .line 885
    .line 886
    invoke-virtual {v8, v5, v6}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 887
    .line 888
    .line 889
    move-result-object v5

    .line 890
    invoke-virtual {v5}, Lqe/l;->c()Z

    .line 891
    .line 892
    .line 893
    move-result v5

    .line 894
    xor-int/2addr v5, v10

    .line 895
    :goto_c
    if-eqz v5, :cond_2e

    .line 896
    .line 897
    invoke-virtual {v3, v7}, Lud/p;->S(I)Lqd/l;

    .line 898
    .line 899
    .line 900
    move-result-object v5

    .line 901
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 902
    .line 903
    .line 904
    instance-of v8, v5, Lqd/r;

    .line 905
    .line 906
    if-eqz v8, :cond_2c

    .line 907
    .line 908
    check-cast v5, Lqd/r;

    .line 909
    .line 910
    iget-object v5, v5, Lqd/r;->m:Lqd/s;

    .line 911
    .line 912
    if-eqz v5, :cond_2c

    .line 913
    .line 914
    iget-object v8, v5, Lqd/s;->j:Ljava/util/ArrayList;

    .line 915
    .line 916
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 917
    .line 918
    .line 919
    move-result v8

    .line 920
    if-ne v8, v10, :cond_2c

    .line 921
    .line 922
    invoke-virtual {v5}, Lqd/s;->j()Z

    .line 923
    .line 924
    .line 925
    move-result v8

    .line 926
    if-nez v8, :cond_2c

    .line 927
    .line 928
    iget-object v5, v5, Lqd/s;->i:Lqd/r;

    .line 929
    .line 930
    iget-object v5, v5, Lqd/l;->j:Lud/p;

    .line 931
    .line 932
    if-eqz v5, :cond_2c

    .line 933
    .line 934
    iget-object v8, v5, Lud/p;->k:Lpd/k;

    .line 935
    .line 936
    sget-object v11, Lpd/k;->A:Lpd/k;

    .line 937
    .line 938
    if-ne v8, v11, :cond_2c

    .line 939
    .line 940
    check-cast v5, Lpd/j;

    .line 941
    .line 942
    iget-object v5, v5, Lpd/j;->o:Ljava/lang/Object;

    .line 943
    .line 944
    check-cast v5, Lqd/j;

    .line 945
    .line 946
    iget-object v8, v3, Lpd/j;->o:Ljava/lang/Object;

    .line 947
    .line 948
    invoke-virtual {v5, v8}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    move-result v5

    .line 952
    goto :goto_d

    .line 953
    :cond_2c
    move v5, v7

    .line 954
    :goto_d
    if-nez v5, :cond_2e

    .line 955
    .line 956
    iget-object v2, v2, Lud/r;->l:Lud/e;

    .line 957
    .line 958
    iget-object v2, v2, Lud/e;->k:Lud/u;

    .line 959
    .line 960
    if-eqz v0, :cond_2d

    .line 961
    .line 962
    iget-object v5, v0, Lud/p;->k:Lpd/k;

    .line 963
    .line 964
    sget-object v8, Lpd/k;->o:Lpd/k;

    .line 965
    .line 966
    if-ne v5, v8, :cond_2d

    .line 967
    .line 968
    check-cast v0, Lpd/j;

    .line 969
    .line 970
    iget-object v0, v0, Lpd/j;->o:Ljava/lang/Object;

    .line 971
    .line 972
    check-cast v0, Lqd/j;

    .line 973
    .line 974
    iget-object v2, v2, Lud/u;->g:Lqe/x;

    .line 975
    .line 976
    iget-object v2, v2, Lqe/x;->c:Lqe/k;

    .line 977
    .line 978
    invoke-virtual {v2, v0, v6}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-virtual {v0}, Lqe/l;->c()Z

    .line 983
    .line 984
    .line 985
    move-result v7

    .line 986
    :cond_2d
    if-eqz v7, :cond_20

    .line 987
    .line 988
    :cond_2e
    new-instance v0, Lud/p;

    .line 989
    .line 990
    invoke-direct {v0, v9, v10}, Lud/p;-><init>(Lpd/k;I)V

    .line 991
    .line 992
    .line 993
    iget v2, v3, Lud/p;->n:I

    .line 994
    .line 995
    iput v2, v0, Lud/p;->n:I

    .line 996
    .line 997
    iget-object v2, v3, Lud/p;->l:Lqd/r;

    .line 998
    .line 999
    invoke-virtual {v0, v2}, Lud/p;->d0(Lqd/r;)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v0, v4}, Lud/p;->I(Lqd/l;)V

    .line 1003
    .line 1004
    .line 1005
    return-object v0

    .line 1006
    :cond_2f
    invoke-virtual {v3, v7}, Lud/p;->S(I)Lqd/l;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    instance-of v2, v0, Lqd/n;

    .line 1014
    .line 1015
    if-eqz v2, :cond_20

    .line 1016
    .line 1017
    new-instance v2, Lud/p;

    .line 1018
    .line 1019
    invoke-direct {v2, v11, v10}, Lud/p;-><init>(Lpd/k;I)V

    .line 1020
    .line 1021
    .line 1022
    iget-object v4, v3, Lud/p;->l:Lqd/r;

    .line 1023
    .line 1024
    invoke-virtual {v2, v4}, Lud/p;->d0(Lqd/r;)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v2, v0}, Lud/p;->I(Lqd/l;)V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v2, v3}, Lmd/e;->B(Lmd/e;)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v2, v3}, Lnd/r;->H(Lud/p;)V

    .line 1034
    .line 1035
    .line 1036
    return-object v2

    .line 1037
    :cond_30
    move-object v0, v3

    .line 1038
    check-cast v0, Lpd/a;

    .line 1039
    .line 1040
    iget-object v2, v0, Lud/p;->m:Ljava/util/List;

    .line 1041
    .line 1042
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    const/4 v3, 0x2

    .line 1047
    if-eq v2, v3, :cond_31

    .line 1048
    .line 1049
    goto/16 :goto_9

    .line 1050
    .line 1051
    :cond_31
    invoke-virtual {v0, v10}, Lud/p;->S(I)Lqd/l;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v2

    .line 1055
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1056
    .line 1057
    .line 1058
    instance-of v4, v2, Lqd/m;

    .line 1059
    .line 1060
    if-eqz v4, :cond_32

    .line 1061
    .line 1062
    check-cast v2, Lqd/m;

    .line 1063
    .line 1064
    iget-object v2, v2, Lqd/m;->l:Lud/p;

    .line 1065
    .line 1066
    iget-object v4, v2, Lud/p;->k:Lpd/k;

    .line 1067
    .line 1068
    if-ne v4, v11, :cond_33

    .line 1069
    .line 1070
    invoke-virtual {v2, v7}, Lud/p;->S(I)Lqd/l;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v2

    .line 1074
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1075
    .line 1076
    .line 1077
    instance-of v4, v2, Lqd/n;

    .line 1078
    .line 1079
    if-eqz v4, :cond_33

    .line 1080
    .line 1081
    move-object v8, v2

    .line 1082
    check-cast v8, Lqd/n;

    .line 1083
    .line 1084
    goto :goto_e

    .line 1085
    :cond_32
    instance-of v4, v2, Lqd/n;

    .line 1086
    .line 1087
    if-eqz v4, :cond_33

    .line 1088
    .line 1089
    move-object v8, v2

    .line 1090
    check-cast v8, Lqd/n;

    .line 1091
    .line 1092
    goto :goto_e

    .line 1093
    :cond_33
    const/4 v8, 0x0

    .line 1094
    :goto_e
    if-nez v8, :cond_34

    .line 1095
    .line 1096
    goto/16 :goto_9

    .line 1097
    .line 1098
    :cond_34
    iget-wide v4, v8, Lqd/n;->l:J

    .line 1099
    .line 1100
    iget v2, v0, Lpd/a;->o:I

    .line 1101
    .line 1102
    invoke-static {v2}, Lt3/c;->b(I)I

    .line 1103
    .line 1104
    .line 1105
    move-result v2

    .line 1106
    const-wide/16 v11, 0x0

    .line 1107
    .line 1108
    if-eqz v2, :cond_38

    .line 1109
    .line 1110
    const/4 v3, 0x7

    .line 1111
    if-eq v2, v3, :cond_35

    .line 1112
    .line 1113
    goto/16 :goto_9

    .line 1114
    .line 1115
    :cond_35
    invoke-virtual {v0, v7}, Lud/p;->S(I)Lqd/l;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v2

    .line 1119
    invoke-virtual {v2}, Lqd/l;->I()Lqd/j;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v3

    .line 1123
    sget-object v6, Lqd/j;->c:Lqd/g;

    .line 1124
    .line 1125
    if-ne v3, v6, :cond_20

    .line 1126
    .line 1127
    cmp-long v3, v4, v11

    .line 1128
    .line 1129
    if-eqz v3, :cond_36

    .line 1130
    .line 1131
    const-wide/16 v6, 0x1

    .line 1132
    .line 1133
    cmp-long v4, v4, v6

    .line 1134
    .line 1135
    if-nez v4, :cond_20

    .line 1136
    .line 1137
    :cond_36
    new-instance v4, Lud/p;

    .line 1138
    .line 1139
    if-nez v3, :cond_37

    .line 1140
    .line 1141
    goto :goto_f

    .line 1142
    :cond_37
    sget-object v9, Lpd/k;->l:Lpd/k;

    .line 1143
    .line 1144
    :goto_f
    invoke-direct {v4, v9, v10}, Lud/p;-><init>(Lpd/k;I)V

    .line 1145
    .line 1146
    .line 1147
    iget-object v0, v0, Lud/p;->l:Lqd/r;

    .line 1148
    .line 1149
    invoke-virtual {v4, v0}, Lud/p;->d0(Lqd/r;)V

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v4, v2}, Lud/p;->I(Lqd/l;)V

    .line 1153
    .line 1154
    .line 1155
    return-object v4

    .line 1156
    :cond_38
    invoke-virtual {v8}, Lqd/n;->c0()Z

    .line 1157
    .line 1158
    .line 1159
    move-result v2

    .line 1160
    if-eqz v2, :cond_39

    .line 1161
    .line 1162
    cmp-long v2, v4, v11

    .line 1163
    .line 1164
    if-gez v2, :cond_20

    .line 1165
    .line 1166
    goto :goto_10

    .line 1167
    :cond_39
    iget-object v2, v8, Lqd/l;->i:Lqd/j;

    .line 1168
    .line 1169
    sget-object v6, Lqd/j;->g:Lqd/g;

    .line 1170
    .line 1171
    if-ne v2, v6, :cond_3a

    .line 1172
    .line 1173
    long-to-int v2, v4

    .line 1174
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1175
    .line 1176
    .line 1177
    move-result v2

    .line 1178
    const/4 v6, 0x0

    .line 1179
    cmpg-float v6, v2, v6

    .line 1180
    .line 1181
    if-gez v6, :cond_20

    .line 1182
    .line 1183
    invoke-static {v2}, Ljava/lang/Float;->isFinite(F)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v2

    .line 1187
    if-eqz v2, :cond_20

    .line 1188
    .line 1189
    goto :goto_10

    .line 1190
    :cond_3a
    sget-object v6, Lqd/j;->h:Lqd/g;

    .line 1191
    .line 1192
    if-ne v2, v6, :cond_20

    .line 1193
    .line 1194
    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 1195
    .line 1196
    .line 1197
    move-result-wide v9

    .line 1198
    const-wide/16 v11, 0x0

    .line 1199
    .line 1200
    cmpg-double v2, v9, v11

    .line 1201
    .line 1202
    if-gez v2, :cond_20

    .line 1203
    .line 1204
    invoke-static {v9, v10}, Ljava/lang/Double;->isFinite(D)Z

    .line 1205
    .line 1206
    .line 1207
    move-result v2

    .line 1208
    if-eqz v2, :cond_20

    .line 1209
    .line 1210
    :goto_10
    invoke-virtual {v8}, Lqd/n;->c0()Z

    .line 1211
    .line 1212
    .line 1213
    move-result v2

    .line 1214
    if-eqz v2, :cond_3b

    .line 1215
    .line 1216
    neg-long v4, v4

    .line 1217
    goto :goto_11

    .line 1218
    :cond_3b
    iget-object v2, v8, Lqd/l;->i:Lqd/j;

    .line 1219
    .line 1220
    sget-object v6, Lqd/j;->g:Lqd/g;

    .line 1221
    .line 1222
    if-ne v2, v6, :cond_3c

    .line 1223
    .line 1224
    long-to-int v2, v4

    .line 1225
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1226
    .line 1227
    .line 1228
    move-result v2

    .line 1229
    neg-float v2, v2

    .line 1230
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 1231
    .line 1232
    .line 1233
    move-result v2

    .line 1234
    int-to-long v4, v2

    .line 1235
    goto :goto_11

    .line 1236
    :cond_3c
    sget-object v6, Lqd/j;->h:Lqd/g;

    .line 1237
    .line 1238
    if-ne v2, v6, :cond_3d

    .line 1239
    .line 1240
    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 1241
    .line 1242
    .line 1243
    move-result-wide v4

    .line 1244
    neg-double v4, v4

    .line 1245
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 1246
    .line 1247
    .line 1248
    move-result-wide v4

    .line 1249
    :goto_11
    new-instance v2, Lqd/n;

    .line 1250
    .line 1251
    iget-object v6, v8, Lqd/l;->i:Lqd/j;

    .line 1252
    .line 1253
    invoke-direct {v2, v4, v5, v6}, Lqd/n;-><init>(JLqd/j;)V

    .line 1254
    .line 1255
    .line 1256
    move-object v8, v2

    .line 1257
    goto :goto_12

    .line 1258
    :cond_3d
    const/4 v8, 0x0

    .line 1259
    :goto_12
    if-eqz v8, :cond_20

    .line 1260
    .line 1261
    new-instance v2, Lpd/a;

    .line 1262
    .line 1263
    iget-object v4, v0, Lud/p;->l:Lqd/r;

    .line 1264
    .line 1265
    invoke-virtual {v0, v7}, Lud/p;->S(I)Lqd/l;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v0

    .line 1269
    invoke-direct {v2, v3, v4, v0, v8}, Lpd/a;-><init>(ILqd/r;Lqd/l;Lqd/l;)V

    .line 1270
    .line 1271
    .line 1272
    return-object v2

    .line 1273
    :goto_13
    return-object v16
.end method
