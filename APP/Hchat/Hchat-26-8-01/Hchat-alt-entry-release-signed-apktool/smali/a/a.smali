.class public abstract La/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv5/b;


# static fields
.field public static volatile g:Lhb/k0;

.field public static h:J

.field public static i:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static A(Lud/h;)Z
    .locals 2

    .line 1
    invoke-static {p0}, La/a;->c0(Lud/h;)Lud/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-object p0, p0, Lud/p;->k:Lpd/k;

    .line 10
    .line 11
    sget-object v1, Lpd/k;->p:Lpd/k;

    .line 12
    .line 13
    if-eq p0, v1, :cond_2

    .line 14
    .line 15
    sget-object v1, Lpd/k;->r:Lpd/k;

    .line 16
    .line 17
    if-eq p0, v1, :cond_2

    .line 18
    .line 19
    sget-object v1, Lpd/k;->T:Lpd/k;

    .line 20
    .line 21
    if-eq p0, v1, :cond_2

    .line 22
    .line 23
    sget-object v1, Lpd/k;->U:Lpd/k;

    .line 24
    .line 25
    if-ne p0, v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v0

    .line 29
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 30
    return p0
.end method

.method public static A0(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 9
    .line 10
    return-object p0
.end method

.method public static B(Landroid/content/Context;)Ll3/s;
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ll3/c;

    .line 8
    .line 9
    const/16 v1, 0x1b

    .line 10
    .line 11
    invoke-direct {v0, v1}, La2/a;-><init>(I)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, La2/a;

    .line 16
    .line 17
    const/16 v1, 0x1b

    .line 18
    .line 19
    invoke-direct {v0, v1}, La2/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "Package manager required to locate emoji font provider"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lac/p;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Landroid/content/Intent;

    .line 32
    .line 33
    const-string v3, "androidx.content.action.LOAD_EMOJI_FONT"

    .line 34
    .line 35
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v5, 0x0

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Landroid/content/pm/ResolveInfo;

    .line 59
    .line 60
    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    iget-object v6, v4, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 65
    .line 66
    if-eqz v6, :cond_1

    .line 67
    .line 68
    iget v6, v6, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 69
    .line 70
    const/4 v7, 0x1

    .line 71
    and-int/2addr v6, v7

    .line 72
    if-ne v6, v7, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move-object v4, v5

    .line 76
    :goto_1
    if-nez v4, :cond_3

    .line 77
    .line 78
    :goto_2
    move-object v1, v5

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    :try_start_0
    iget-object v2, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v4, v4, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, v1, v4}, La2/a;->i(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v1, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    array-length v6, v0

    .line 94
    :goto_3
    if-ge v3, v6, :cond_4

    .line 95
    .line 96
    aget-object v7, v0, v3

    .line 97
    .line 98
    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    new-instance v1, Le3/c;

    .line 113
    .line 114
    const-string v3, "emojicompat-emoji-font"

    .line 115
    .line 116
    invoke-direct {v1, v2, v0, v4, v3}, Le3/c;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :catch_0
    move-exception v0

    .line 121
    const-string v1, "emoji2.text.DefaultEmojiConfig"

    .line 122
    .line 123
    invoke-static {v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :goto_4
    if-nez v1, :cond_5

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_5
    new-instance v5, Ll3/s;

    .line 131
    .line 132
    new-instance v0, Ll3/r;

    .line 133
    .line 134
    invoke-direct {v0, p0, v1}, Ll3/r;-><init>(Landroid/content/Context;Le3/c;)V

    .line 135
    .line 136
    .line 137
    invoke-direct {v5, v0}, Ll3/s;-><init>(Ll3/h;)V

    .line 138
    .line 139
    .line 140
    :goto_5
    return-object v5
.end method

.method public static final B0(Ls1/k0;Lh0/q0;Lac/k;Ls1/k;Lyf/a;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    sget-object v7, Lh0/w;->d:Lg1/d;

    .line 10
    .line 11
    instance-of v4, v3, Lh0/a0;

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    move-object v4, v3

    .line 16
    check-cast v4, Lh0/a0;

    .line 17
    .line 18
    iget v5, v4, Lh0/a0;->k:I

    .line 19
    .line 20
    const/high16 v6, -0x80000000

    .line 21
    .line 22
    and-int v8, v5, v6

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v5, v6

    .line 27
    iput v5, v4, Lh0/a0;->k:I

    .line 28
    .line 29
    :goto_0
    move-object v8, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    new-instance v4, Lh0/a0;

    .line 32
    .line 33
    invoke-direct {v4, v3}, Lyf/c;-><init>(Lwf/c;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    iget-object v3, v8, Lh0/a0;->j:Ljava/lang/Object;

    .line 38
    .line 39
    iget v4, v8, Lh0/a0;->k:I

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x2

    .line 43
    const/4 v11, 0x1

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    if-eq v4, v11, :cond_2

    .line 47
    .line 48
    if-ne v4, v10, :cond_1

    .line 49
    .line 50
    iget-object v0, v8, Lh0/a0;->i:Lgg/q;

    .line 51
    .line 52
    iget-object v1, v8, Lh0/a0;->h:Lh0/q0;

    .line 53
    .line 54
    iget-object v2, v8, Lh0/a0;->g:Ls1/k0;

    .line 55
    .line 56
    :try_start_0
    invoke-static {v3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    move-object/from16 v16, v2

    .line 60
    .line 61
    move-object v2, v0

    .line 62
    move-object/from16 v0, v16

    .line 63
    .line 64
    goto/16 :goto_c

    .line 65
    .line 66
    :catchall_0
    move-exception v0

    .line 67
    goto/16 :goto_e

    .line 68
    .line 69
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    return-object v0

    .line 76
    :cond_2
    iget-object v1, v8, Lh0/a0;->h:Lh0/q0;

    .line 77
    .line 78
    iget-object v0, v8, Lh0/a0;->g:Ls1/k0;

    .line 79
    .line 80
    :try_start_1
    invoke-static {v3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :catchall_1
    move-exception v0

    .line 85
    goto/16 :goto_6

    .line 86
    .line 87
    :cond_3
    invoke-static {v3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v3, v2, Ls1/k;->a:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    move-object v12, v3

    .line 97
    check-cast v12, Ls1/t;

    .line 98
    .line 99
    iget v2, v2, Ls1/k;->e:I

    .line 100
    .line 101
    and-int/2addr v2, v11

    .line 102
    sget-object v13, Lxf/a;->g:Lxf/a;

    .line 103
    .line 104
    if-eqz v2, :cond_b

    .line 105
    .line 106
    iget-wide v3, v12, Ls1/t;->c:J

    .line 107
    .line 108
    iget-object v2, v1, Lh0/q0;->d:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, Lh0/d1;

    .line 111
    .line 112
    iget-object v5, v2, Lh0/d1;->d:Lw/q0;

    .line 113
    .line 114
    if-eqz v5, :cond_7

    .line 115
    .line 116
    invoke-virtual {v5}, Lw/q0;->d()Lw/m1;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    if-nez v5, :cond_4

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    invoke-virtual {v2}, Lh0/d1;->k()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-nez v5, :cond_5

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    const/4 v5, -0x1

    .line 131
    iput v5, v2, Lh0/d1;->s:I

    .line 132
    .line 133
    iget-object v5, v2, Lh0/d1;->k:Ld1/v;

    .line 134
    .line 135
    if-eqz v5, :cond_6

    .line 136
    .line 137
    invoke-static {v5}, Ld1/v;->a(Ld1/v;)V

    .line 138
    .line 139
    .line 140
    :cond_6
    invoke-virtual {v2}, Lh0/d1;->n()Ln2/s;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const/4 v5, 0x0

    .line 145
    sget-object v6, Lh0/w;->d:Lg1/d;

    .line 146
    .line 147
    invoke-virtual/range {v1 .. v6}, Lh0/q0;->f(Ln2/s;JZLg1/d;)J

    .line 148
    .line 149
    .line 150
    const/4 v2, 0x1

    .line 151
    goto :goto_3

    .line 152
    :cond_7
    :goto_2
    const/4 v2, 0x0

    .line 153
    :goto_3
    if-eqz v2, :cond_16

    .line 154
    .line 155
    :try_start_2
    invoke-virtual {v12}, Ls1/t;->a()V

    .line 156
    .line 157
    .line 158
    iget-wide v2, v12, Ls1/t;->a:J

    .line 159
    .line 160
    new-instance v4, Lb0/d0;

    .line 161
    .line 162
    const/16 v5, 0xf

    .line 163
    .line 164
    invoke-direct {v4, v1, v5}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 165
    .line 166
    .line 167
    iput-object v0, v8, Lh0/a0;->g:Ls1/k0;

    .line 168
    .line 169
    iput-object v1, v8, Lh0/a0;->h:Lh0/q0;

    .line 170
    .line 171
    iput v11, v8, Lh0/a0;->k:I

    .line 172
    .line 173
    invoke-static {v0, v2, v3, v4, v8}, Lm/j0;->d(Ls1/k0;JLfg/l;Lyf/a;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    if-ne v3, v13, :cond_8

    .line 178
    .line 179
    goto/16 :goto_b

    .line 180
    .line 181
    :cond_8
    :goto_4
    check-cast v3, Ljava/lang/Boolean;

    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_a

    .line 188
    .line 189
    iget-object v0, v0, Ls1/k0;->l:Ls1/l0;

    .line 190
    .line 191
    iget-object v0, v0, Ls1/l0;->z:Ls1/k;

    .line 192
    .line 193
    iget-object v0, v0, Ls1/k;->a:Ljava/lang/Object;

    .line 194
    .line 195
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    :goto_5
    if-ge v9, v2, :cond_a

    .line 200
    .line 201
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    check-cast v3, Ls1/t;

    .line 206
    .line 207
    invoke-static {v3}, Ls1/s;->c(Ls1/t;)Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-eqz v4, :cond_9

    .line 212
    .line 213
    invoke-virtual {v3}, Ls1/t;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 214
    .line 215
    .line 216
    :cond_9
    add-int/lit8 v9, v9, 0x1

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_a
    invoke-virtual {v1}, Lh0/q0;->e()V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_f

    .line 223
    .line 224
    :goto_6
    invoke-virtual {v1}, Lh0/q0;->e()V

    .line 225
    .line 226
    .line 227
    throw v0

    .line 228
    :cond_b
    move-object/from16 v2, p2

    .line 229
    .line 230
    iget v14, v2, Lac/k;->h:I

    .line 231
    .line 232
    if-eq v14, v11, :cond_d

    .line 233
    .line 234
    if-eq v14, v10, :cond_c

    .line 235
    .line 236
    sget-object v2, Lh0/w;->f:Lg1/d;

    .line 237
    .line 238
    :goto_7
    move-object v6, v2

    .line 239
    goto :goto_8

    .line 240
    :cond_c
    sget-object v2, Lh0/w;->e:Lg1/d;

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_d
    move-object v6, v7

    .line 244
    :goto_8
    iget-wide v2, v12, Ls1/t;->c:J

    .line 245
    .line 246
    iget-object v4, v1, Lh0/q0;->d:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v4, Lh0/d1;

    .line 249
    .line 250
    invoke-virtual {v4}, Lh0/d1;->k()Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-eqz v5, :cond_11

    .line 255
    .line 256
    invoke-virtual {v4}, Lh0/d1;->n()Ln2/s;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    iget-object v5, v5, Ln2/s;->a:Li2/g;

    .line 261
    .line 262
    iget-object v5, v5, Li2/g;->h:Ljava/lang/String;

    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-nez v5, :cond_e

    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_e
    iget-object v5, v4, Lh0/d1;->d:Lw/q0;

    .line 272
    .line 273
    if-eqz v5, :cond_11

    .line 274
    .line 275
    invoke-virtual {v5}, Lw/q0;->d()Lw/m1;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    if-nez v5, :cond_f

    .line 280
    .line 281
    goto :goto_9

    .line 282
    :cond_f
    iget-object v5, v4, Lh0/d1;->k:Ld1/v;

    .line 283
    .line 284
    if-eqz v5, :cond_10

    .line 285
    .line 286
    invoke-static {v5}, Ld1/v;->a(Ld1/v;)V

    .line 287
    .line 288
    .line 289
    :cond_10
    iput-wide v2, v4, Lh0/d1;->n:J

    .line 290
    .line 291
    const/4 v2, -0x1

    .line 292
    iput v2, v4, Lh0/d1;->s:I

    .line 293
    .line 294
    const/4 v15, 0x1

    .line 295
    invoke-virtual {v4, v15}, Lh0/d1;->h(Z)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4}, Lh0/d1;->n()Ln2/s;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    iget-wide v3, v4, Lh0/d1;->n:J

    .line 303
    .line 304
    const/4 v5, 0x1

    .line 305
    invoke-virtual/range {v1 .. v6}, Lh0/q0;->f(Ln2/s;JZLg1/d;)J

    .line 306
    .line 307
    .line 308
    move-result-wide v2

    .line 309
    const/4 v4, 0x2

    .line 310
    if-lt v14, v4, :cond_12

    .line 311
    .line 312
    iput-boolean v15, v1, Lh0/q0;->b:Z

    .line 313
    .line 314
    new-instance v4, Li2/m0;

    .line 315
    .line 316
    invoke-direct {v4, v2, v3}, Li2/m0;-><init>(J)V

    .line 317
    .line 318
    .line 319
    iput-object v4, v1, Lh0/q0;->c:Ljava/lang/Object;

    .line 320
    .line 321
    goto :goto_a

    .line 322
    :cond_11
    :goto_9
    const/4 v15, 0x0

    .line 323
    :cond_12
    :goto_a
    if-eqz v15, :cond_16

    .line 324
    .line 325
    :try_start_3
    new-instance v2, Lgg/q;

    .line 326
    .line 327
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    xor-int/2addr v3, v11

    .line 335
    iput-boolean v3, v2, Lgg/q;->g:Z

    .line 336
    .line 337
    iget-wide v3, v12, Ls1/t;->a:J

    .line 338
    .line 339
    new-instance v5, Lb0/s;

    .line 340
    .line 341
    const/4 v7, 0x7

    .line 342
    invoke-direct {v5, v1, v6, v2, v7}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 343
    .line 344
    .line 345
    iput-object v0, v8, Lh0/a0;->g:Ls1/k0;

    .line 346
    .line 347
    iput-object v1, v8, Lh0/a0;->h:Lh0/q0;

    .line 348
    .line 349
    iput-object v2, v8, Lh0/a0;->i:Lgg/q;

    .line 350
    .line 351
    iput v10, v8, Lh0/a0;->k:I

    .line 352
    .line 353
    invoke-static {v0, v3, v4, v5, v8}, Lm/j0;->d(Ls1/k0;JLfg/l;Lyf/a;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    if-ne v3, v13, :cond_13

    .line 358
    .line 359
    :goto_b
    return-object v13

    .line 360
    :cond_13
    :goto_c
    check-cast v3, Ljava/lang/Boolean;

    .line 361
    .line 362
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-eqz v3, :cond_15

    .line 367
    .line 368
    iget-boolean v2, v2, Lgg/q;->g:Z

    .line 369
    .line 370
    if-eqz v2, :cond_15

    .line 371
    .line 372
    iget-object v0, v0, Ls1/k0;->l:Ls1/l0;

    .line 373
    .line 374
    iget-object v0, v0, Ls1/l0;->z:Ls1/k;

    .line 375
    .line 376
    iget-object v0, v0, Ls1/k;->a:Ljava/lang/Object;

    .line 377
    .line 378
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    :goto_d
    if-ge v9, v2, :cond_15

    .line 383
    .line 384
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    check-cast v3, Ls1/t;

    .line 389
    .line 390
    invoke-static {v3}, Ls1/s;->c(Ls1/t;)Z

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    if-eqz v4, :cond_14

    .line 395
    .line 396
    invoke-virtual {v3}, Ls1/t;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 397
    .line 398
    .line 399
    :cond_14
    add-int/lit8 v9, v9, 0x1

    .line 400
    .line 401
    goto :goto_d

    .line 402
    :cond_15
    invoke-virtual {v1}, Lh0/q0;->e()V

    .line 403
    .line 404
    .line 405
    goto :goto_f

    .line 406
    :goto_e
    invoke-virtual {v1}, Lh0/q0;->e()V

    .line 407
    .line 408
    .line 409
    throw v0

    .line 410
    :cond_16
    :goto_f
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 411
    .line 412
    return-object v0
.end method

.method public static C(Landroid/os/Looper;)Landroid/os/Handler;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lc3/a;->a(Landroid/os/Looper;)Landroid/os/Handler;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    :try_start_0
    const-class v0, Landroid/os/Handler;

    .line 13
    .line 14
    const-class v1, Landroid/os/Looper;

    .line 15
    .line 16
    const-class v2, Landroid/os/Handler$Callback;

    .line 17
    .line 18
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    filled-new-array {v1, v2, v3}, [Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    filled-new-array {p0, v2, v1}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    .line 40
    .line 41
    return-object v0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    goto :goto_0

    .line 44
    :catch_1
    move-exception v0

    .line 45
    goto :goto_0

    .line 46
    :catch_2
    move-exception v0

    .line 47
    goto :goto_0

    .line 48
    :catch_3
    move-exception p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    instance-of v0, p0, Ljava/lang/RuntimeException;

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    instance-of v0, p0, Ljava/lang/Error;

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    check-cast p0, Ljava/lang/Error;

    .line 62
    .line 63
    throw p0

    .line 64
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_2
    check-cast p0, Ljava/lang/RuntimeException;

    .line 71
    .line 72
    throw p0

    .line 73
    :goto_0
    const-string v1, "HandlerCompat"

    .line 74
    .line 75
    const-string v2, "Unable to invoke Handler(Looper, Callback, boolean) constructor"

    .line 76
    .line 77
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 78
    .line 79
    .line 80
    new-instance v0, Landroid/os/Handler;

    .line 81
    .line 82
    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 83
    .line 84
    .line 85
    return-object v0
.end method

.method public static varargs C0([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v1, Ltf/j;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v2}, Ltf/j;-><init>([Ljava/lang/Object;Z)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static D0(Lud/r;)Ljava/util/BitSet;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/BitSet;

    .line 2
    .line 3
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-direct {v0, p0}, Ljava/util/BitSet;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static E()Luf/c;
    .locals 2

    .line 1
    new-instance v0, Luf/c;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Luf/c;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static E0(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ldb/a;

    .line 21
    .line 22
    iget-object v2, v1, Ldb/a;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    iget v3, v1, Ldb/a;->a:I

    .line 39
    .line 40
    if-ltz v3, :cond_1

    .line 41
    .line 42
    const/16 v4, 0x8

    .line 43
    .line 44
    if-ge v3, v4, :cond_1

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/4 v3, 0x0

    .line 49
    :goto_1
    const/4 v4, 0x0

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, v4

    .line 54
    :goto_2
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-static {v1, v2}, Ldb/a;->a(Ldb/a;Ljava/lang/String;)Ldb/a;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    :cond_3
    if-eqz v4, :cond_0

    .line 61
    .line 62
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    return-object v0
.end method

.method public static F(Ljava/io/File;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "\u5220\u9664\u7b26\u53f7\u94fe\u63a5\u5931\u8d25: "

    .line 27
    .line 28
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    array-length v1, v0

    .line 49
    const/4 v2, 0x0

    .line 50
    :goto_0
    if-ge v2, v1, :cond_2

    .line 51
    .line 52
    aget-object v3, v0, v2

    .line 53
    .line 54
    invoke-static {v3}, La/a;->F(Ljava/io/File;)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    :goto_1
    return-void

    .line 67
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const-string v0, "\u5220\u9664\u63d2\u4ef6\u6587\u4ef6\u5931\u8d25: "

    .line 72
    .line 73
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static F0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const-string p0, "yyyy-MM-dd HH:mm:ss"

    .line 20
    .line 21
    :cond_1
    return-object p0
.end method

.method public static G(ILjava/util/List;Ljava/util/List;IILfg/q;)Lhb/s;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, La/a;->g:Lhb/k0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    invoke-static {p1}, La/a;->E0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v3, v2}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    move-object v4, v3

    .line 65
    check-cast v4, Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_1

    .line 72
    .line 73
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-static {p2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-static {p2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_6

    .line 90
    .line 91
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    const/4 v2, 0x1

    .line 99
    if-ne p0, v2, :cond_5

    .line 100
    .line 101
    iget-object p0, v0, Lhb/k0;->c:Lhb/k;

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {p1}, Lhb/k;->c(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_4

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2, p5}, Lhb/k;->f(Ljava/util/List;Ljava/util/List;Lfg/q;)Lhb/s;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :cond_4
    return-object v1

    .line 118
    :cond_5
    iget-object p0, v0, Lhb/k0;->a:Lhb/c;

    .line 119
    .line 120
    invoke-virtual/range {p0 .. p5}, Lhb/c;->h(Ljava/util/ArrayList;Ljava/util/List;IILfg/q;)Lhb/s;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_6
    :goto_2
    return-object v1
.end method

.method public static final G0(Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 22
    .line 23
    return-object p0
.end method

.method public static H(ILjava/util/List;Ljava/util/List;Lfg/q;)Lhb/s;
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/a;->g:Lhb/k0;

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v1}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    move-object v3, v2

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-static {p2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-static {p2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_5

    .line 82
    .line 83
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    const/4 v1, 0x1

    .line 91
    if-ne p0, v1, :cond_4

    .line 92
    .line 93
    iget-object p0, v0, Lhb/k0;->c:Lhb/k;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2, p3}, Lhb/k;->f(Ljava/util/List;Ljava/util/List;Lfg/q;)Lhb/s;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_4
    iget-object p0, v0, Lhb/k0;->b:Lhb/r;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1, p2, p3}, Lhb/r;->g(Ljava/util/List;Ljava/util/List;Lfg/q;)Lhb/s;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 111
    return-object p0
.end method

.method public static H0(Lac/k;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lac/k;->K()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    and-int/lit8 v3, v2, 0x7f

    .line 8
    .line 9
    mul-int/lit8 v4, v1, 0x7

    .line 10
    .line 11
    shl-int/2addr v3, v4

    .line 12
    or-int/2addr v0, v3

    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    const/16 v3, 0x80

    .line 16
    .line 17
    and-int/2addr v2, v3

    .line 18
    if-ne v2, v3, :cond_1

    .line 19
    .line 20
    const/4 v4, 0x5

    .line 21
    if-lt v1, v4, :cond_0

    .line 22
    .line 23
    :cond_1
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    return v0

    .line 26
    :cond_2
    new-instance p0, Laf/d;

    .line 27
    .line 28
    const-string v0, "Invalid LEB128 sequence"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0
.end method

.method public static final I(CCZ)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eq p0, p1, :cond_3

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-ne p0, p1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    :goto_0
    return v0
.end method

.method public static final I0(Li0/h0;)Ls3/e;
    .locals 4

    .line 1
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Li0/l;->a:Li0/e;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Ls3/e;

    .line 10
    .line 11
    invoke-direct {v0}, Ls3/e;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    check-cast v0, Ls3/e;

    .line 18
    .line 19
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {p0, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    or-int/2addr v2, v3

    .line 30
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    if-ne v3, v1, :cond_2

    .line 37
    .line 38
    :cond_1
    new-instance v3, Li/e0;

    .line 39
    .line 40
    const/16 v1, 0x13

    .line 41
    .line 42
    invoke-direct {v3, v0, v1}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    check-cast v3, Lfg/a;

    .line 49
    .line 50
    invoke-static {v3, p0}, Li0/r;->j(Lfg/a;Li0/h0;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method public static final J(JJ)Z
    .locals 0

    .line 1
    cmp-long p0, p0, p2

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static J0(Lud/r;Lud/a;ILud/p;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lud/p;

    .line 8
    .line 9
    invoke-virtual {p3, v0}, Lmd/e;->B(Lmd/e;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3, v0}, Lnd/r;->H(Lud/p;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3, v0}, Lud/p;->V(Lud/p;)V

    .line 16
    .line 17
    .line 18
    iget v1, v0, Lud/p;->n:I

    .line 19
    .line 20
    iput v1, p3, Lud/p;->n:I

    .line 21
    .line 22
    iget-object p1, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {p1, p2, p3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object p1, p3, Lud/p;->l:Lqd/r;

    .line 28
    .line 29
    iget-object p2, v0, Lud/p;->l:Lqd/r;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lqd/r;->h0(Lqd/l;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    invoke-static {p0, v0}, Lxe/l;->h(Lud/r;Lud/p;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {p0, v0}, Lxe/l;->j(Lud/r;Lud/p;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {p3}, Lud/p;->Z()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static K(Lud/a;)Lud/a;
    .locals 1

    .line 1
    :goto_0
    invoke-static {p0}, La/a;->e0(Lud/a;)Lud/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    move-object p0, v0

    .line 9
    goto :goto_0
.end method

.method public static K0(Lud/r;Lud/a;Lud/p;Lud/p;)Z
    .locals 5

    .line 1
    iget-object v0, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lud/p;

    .line 16
    .line 17
    if-ne v4, p2, :cond_0

    .line 18
    .line 19
    invoke-static {p0, p1, v3, p3}, La/a;->J0(Lud/r;Lud/a;ILud/p;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return v2
.end method

.method public static L(Lud/r;Ljava/util/BitSet;Ljava/util/function/Consumer;)V
    .locals 2

    .line 1
    sget-object v0, Lxe/g;->g:Lxe/g;

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/BitSet;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ltz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lud/a;

    .line 26
    .line 27
    invoke-interface {p2, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    return-void
.end method

.method public static L0(I)Ljava/lang/String;
    .locals 5

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-gez p0, :cond_0

    .line 7
    .line 8
    const/16 v2, 0x2d

    .line 9
    .line 10
    aput-char v2, v0, v1

    .line 11
    .line 12
    neg-int p0, p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 v2, 0x2b

    .line 15
    .line 16
    aput-char v2, v0, v1

    .line 17
    .line 18
    :goto_0
    const/16 v2, 0x8

    .line 19
    .line 20
    if-ge v1, v2, :cond_1

    .line 21
    .line 22
    rsub-int/lit8 v2, v1, 0x8

    .line 23
    .line 24
    and-int/lit8 v3, p0, 0xf

    .line 25
    .line 26
    const/16 v4, 0x10

    .line 27
    .line 28
    invoke-static {v3, v4}, Ljava/lang/Character;->forDigit(II)C

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    aput-char v3, v0, v2

    .line 33
    .line 34
    shr-int/lit8 p0, p0, 0x4

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 42
    .line 43
    .line 44
    return-object p0
.end method

.method public static M(JLjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Date;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 7
    .line 8
    invoke-static {p2}, La/a;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object p2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 13
    .line 14
    invoke-direct {p0, p1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance p1, Lsf/f;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p0, p1

    .line 29
    :goto_0
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 37
    .line 38
    const-string p1, "yyyy-MM-dd HH:mm:ss"

    .line 39
    .line 40
    sget-object p2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 41
    .line 42
    invoke-direct {p0, p1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    check-cast p0, Ljava/lang/String;

    .line 53
    .line 54
    return-object p0
.end method

.method public static M0(Lud/r;Lud/p;)Lqd/l;
    .locals 2

    .line 1
    sget-object v0, Lmd/a;->S:Lmd/a;

    .line 2
    .line 3
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lud/a;

    .line 29
    .line 30
    iget-object v0, v0, Lud/a;->l:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lud/p;

    .line 47
    .line 48
    invoke-static {v1, p1}, La/a;->N(Lud/p;Lud/p;)Lqd/l;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public static N(Lud/p;Lud/p;)Lqd/l;
    .locals 3

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lqd/l;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    instance-of v2, v1, Lqd/m;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, Lqd/m;

    .line 28
    .line 29
    iget-object v2, v2, Lqd/m;->l:Lud/p;

    .line 30
    .line 31
    if-ne v2, p1, :cond_1

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_1
    invoke-static {v2, p1}, La/a;->N(Lud/p;Lud/p;)Lqd/l;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_2
    instance-of v0, p0, Ltd/b;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    check-cast p0, Ltd/b;

    .line 46
    .line 47
    iget-object p0, p0, Ltd/b;->o:Lyd/b;

    .line 48
    .line 49
    invoke-static {p0, p1}, La/a;->O(Lyd/b;Lud/p;)Lqd/l;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public static N0(Ljava/util/List;Lud/a;)Lud/a;
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-le v0, v1, :cond_2

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lud/a;

    .line 32
    .line 33
    invoke-static {v2}, La/a;->q0(Lud/a;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object p0, v0

    .line 44
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-ne v0, v1, :cond_4

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lud/a;

    .line 56
    .line 57
    if-eq v0, p1, :cond_3

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_3
    const/4 p1, 0x1

    .line 61
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Lud/a;

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const-string v0, "Incorrect nodes count for selectOther: "

    .line 77
    .line 78
    const-string v1, " in "

    .line 79
    .line 80
    invoke-static {v0, p1, v1, p0}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0
.end method

.method public static O(Lyd/b;Lud/p;)Lqd/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyd/b;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyd/b;->k:Lxe/e;

    .line 8
    .line 9
    iget-object p0, p0, Lxe/e;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lpd/i;

    .line 12
    .line 13
    invoke-static {p0, p1}, La/a;->N(Lud/p;Lud/p;)Lqd/l;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object p0, p0, Lyd/b;->j:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lyd/b;

    .line 35
    .line 36
    invoke-static {v0, p1}, La/a;->O(Lyd/b;Lud/p;)Lqd/l;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public static O0(Lud/a;)Lud/a;
    .locals 2

    .line 1
    sget-object v0, Lmd/a;->m:Lmd/a;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lud/a;->l:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lud/a;->m:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    iget-object p0, p0, Lud/a;->m:Ljava/util/List;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lud/a;

    .line 36
    .line 37
    :cond_0
    return-object p0
.end method

.method public static P(Lud/a;Lud/a;)Ljava/util/HashSet;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    if-eq p0, p1, :cond_0

    .line 10
    .line 11
    invoke-static {v0, p1, p0}, La/a;->j(Ljava/util/HashSet;Lud/a;Lud/a;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public static P0()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 2
    .line 3
    const-string v1, "Count overflow has happened."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public static final Q(Ljava/lang/annotation/Annotation;)Lgg/f;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static Q0()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 2
    .line 3
    const-string v1, "Index overflow has happened."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public static R(Lnc/b;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object p0, p0, Lnc/b;->c:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lnc/a;

    .line 17
    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    iget p1, p0, Lnc/a;->g:I

    .line 21
    .line 22
    const/16 v0, 0x11

    .line 23
    .line 24
    if-eq p1, v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p0, p0, Lnc/a;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Ljava/util/List;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    :goto_0
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    return-object p0
.end method

.method public static R0(J)Ljava/lang/String;
    .locals 4

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p0, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-wide v2, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr p0, v2

    .line 16
    long-to-int p0, p0

    .line 17
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    cmpg-float p1, v1, p1

    .line 22
    .line 23
    const/16 v1, 0x29

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    new-instance p0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string p1, "CornerRadius.circular("

    .line 30
    .line 31
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p1}, La7/a;->V(F)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v2, "CornerRadius.elliptical("

    .line 56
    .line 57
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-static {v0}, La7/a;->V(F)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", "

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    invoke-static {p0}, La7/a;->V(F)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method public static S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lpd/q;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    check-cast p1, Lpd/q;

    .line 10
    .line 11
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_9

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Lud/a;

    .line 28
    .line 29
    sget-object v0, Lmd/b;->x:Lmd/b;

    .line 30
    .line 31
    iget-object v1, p2, Lmd/e;->g:Lmd/f;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lnd/c0;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, Lnd/c0;->g:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lpd/q;

    .line 58
    .line 59
    if-ne v1, p1, :cond_2

    .line 60
    .line 61
    return-object p2

    .line 62
    :cond_3
    sget-object v0, Lmd/a;->S:Lmd/a;

    .line 63
    .line 64
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_7

    .line 71
    .line 72
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-eqz p2, :cond_9

    .line 83
    .line 84
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p2, Lud/a;

    .line 89
    .line 90
    iget-object v0, p2, Lud/a;->l:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Lud/p;

    .line 107
    .line 108
    if-eq v1, p1, :cond_6

    .line 109
    .line 110
    invoke-static {v1, p1}, La/a;->N(Lud/p;Lud/p;)Lqd/l;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    :cond_6
    return-object p2

    .line 117
    :cond_7
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_9

    .line 126
    .line 127
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    check-cast p2, Lud/a;

    .line 132
    .line 133
    invoke-static {p2, p1}, La/a;->s(Lud/a;Lud/p;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_8

    .line 138
    .line 139
    return-object p2

    .line 140
    :cond_9
    :goto_0
    const/4 p0, 0x0

    .line 141
    return-object p0
.end method

.method public static S0(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lc9/t;

    .line 11
    .line 12
    const/4 v2, 0x7

    .line 13
    invoke-direct {v1, p0, p1, v2}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static T(ILjava/lang/Iterable;)Lud/a;
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lud/a;

    .line 16
    .line 17
    iget v2, v1, Lud/a;->k:I

    .line 18
    .line 19
    if-ne v2, p0, :cond_0

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    invoke-static {p0}, Lxe/m;->d(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "Can\'t find block by offset: "

    .line 31
    .line 32
    const-string v1, " in list "

    .line 33
    .line 34
    invoke-static {v0, p0, v1, p1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public static final T0(Ls1/k0;Lw/y0;Ls1/k;Lyf/a;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lh0/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lh0/b0;

    .line 7
    .line 8
    iget v1, v0, Lh0/b0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lh0/b0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lh0/b0;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lh0/b0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lh0/b0;->k:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Lh0/b0;->h:Lw/y0;

    .line 41
    .line 42
    iget-object p0, v0, Lh0/b0;->g:Ls1/k0;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :catch_0
    move-exception p0

    .line 50
    goto/16 :goto_7

    .line 51
    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0

    .line 59
    :cond_2
    iget-object p0, v0, Lh0/b0;->i:Ls1/t;

    .line 60
    .line 61
    iget-object p1, v0, Lh0/b0;->h:Lw/y0;

    .line 62
    .line 63
    iget-object p2, v0, Lh0/b0;->g:Ls1/k0;

    .line 64
    .line 65
    :try_start_1
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 66
    .line 67
    .line 68
    move-object v10, p2

    .line 69
    move-object p2, p0

    .line 70
    move-object p0, v10

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :try_start_2
    iget-object p2, p2, Ls1/k;->a:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {p2}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    check-cast p2, Ls1/t;

    .line 82
    .line 83
    iget-wide v6, p2, Ls1/t;->a:J

    .line 84
    .line 85
    iput-object p0, v0, Lh0/b0;->g:Ls1/k0;

    .line 86
    .line 87
    iput-object p1, v0, Lh0/b0;->h:Lw/y0;

    .line 88
    .line 89
    iput-object p2, v0, Lh0/b0;->i:Ls1/t;

    .line 90
    .line 91
    iput v4, v0, Lh0/b0;->k:I

    .line 92
    .line 93
    invoke-static {p0, v6, v7, v0}, Lm/j0;->b(Ls1/k0;JLyf/a;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    if-ne p3, v5, :cond_4

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    :goto_1
    check-cast p3, Ls1/t;

    .line 101
    .line 102
    if-eqz p3, :cond_a

    .line 103
    .line 104
    iget-wide v6, p3, Ls1/t;->c:J

    .line 105
    .line 106
    invoke-virtual {p0}, Ls1/k0;->B()Ly1/l2;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iget v8, p2, Ls1/t;->i:I

    .line 111
    .line 112
    invoke-static {v1, v8}, Lm/j0;->f(Ly1/l2;I)F

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    iget-wide v8, p2, Ls1/t;->c:J

    .line 117
    .line 118
    invoke-static {v8, v9, v6, v7}, Le1/b;->d(JJ)J

    .line 119
    .line 120
    .line 121
    move-result-wide v8

    .line 122
    invoke-static {v8, v9}, Le1/b;->c(J)F

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    cmpg-float p2, p2, v1

    .line 127
    .line 128
    if-gez p2, :cond_5

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    move v4, v2

    .line 132
    :goto_2
    if-eqz v4, :cond_a

    .line 133
    .line 134
    sget-object p2, Lh0/e0;->a:Lg1/d;

    .line 135
    .line 136
    invoke-interface {p1, v6, v7, p2}, Lw/y0;->a(JLg1/d;)V

    .line 137
    .line 138
    .line 139
    iget-wide p2, p3, Ls1/t;->a:J

    .line 140
    .line 141
    new-instance v1, Lh0/y;

    .line 142
    .line 143
    const/4 v4, 0x0

    .line 144
    invoke-direct {v1, p1, v4}, Lh0/y;-><init>(Lw/y0;I)V

    .line 145
    .line 146
    .line 147
    iput-object p0, v0, Lh0/b0;->g:Ls1/k0;

    .line 148
    .line 149
    iput-object p1, v0, Lh0/b0;->h:Lw/y0;

    .line 150
    .line 151
    const/4 v4, 0x0

    .line 152
    iput-object v4, v0, Lh0/b0;->i:Ls1/t;

    .line 153
    .line 154
    iput v3, v0, Lh0/b0;->k:I

    .line 155
    .line 156
    invoke-static {p0, p2, p3, v1, v0}, Lm/j0;->d(Ls1/k0;JLfg/l;Lyf/a;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p3

    .line 160
    if-ne p3, v5, :cond_6

    .line 161
    .line 162
    :goto_3
    return-object v5

    .line 163
    :cond_6
    :goto_4
    check-cast p3, Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    if-eqz p2, :cond_9

    .line 170
    .line 171
    iget-object p0, p0, Ls1/k0;->l:Ls1/l0;

    .line 172
    .line 173
    iget-object p0, p0, Ls1/l0;->z:Ls1/k;

    .line 174
    .line 175
    iget-object p0, p0, Ls1/k;->a:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    :goto_5
    if-ge v2, p2, :cond_8

    .line 182
    .line 183
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p3

    .line 187
    check-cast p3, Ls1/t;

    .line 188
    .line 189
    invoke-static {p3}, Ls1/s;->c(Ls1/t;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_7

    .line 194
    .line 195
    invoke-virtual {p3}, Ls1/t;->a()V

    .line 196
    .line 197
    .line 198
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_8
    invoke-interface {p1}, Lw/y0;->b()V

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_9
    invoke-interface {p1}, Lw/y0;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 206
    .line 207
    .line 208
    :cond_a
    :goto_6
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 209
    .line 210
    return-object p0

    .line 211
    :goto_7
    invoke-interface {p1}, Lw/y0;->onCancel()V

    .line 212
    .line 213
    .line 214
    throw p0
.end method

.method public static U(Ljava/util/List;Lmd/a;)Lud/a;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lud/a;

    .line 16
    .line 17
    iget-object v1, v0, Lmd/e;->g:Lmd/f;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lmd/f;->a(Lmd/a;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static U0(Lud/a;Ljava/util/BitSet;Ljava/util/function/Predicate;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lud/a;

    .line 14
    .line 15
    if-eqz p0, :cond_3

    .line 16
    .line 17
    invoke-interface {p2, p0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object p0, p0, Lud/a;->m:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lud/a;

    .line 41
    .line 42
    iget v2, v1, Lud/a;->j:I

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->get(I)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->set(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    :goto_1
    return-void
.end method

.method public static V(Ljava/util/List;)Lud/a;
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

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
    const/4 v0, 0x0

    .line 9
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lud/a;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lud/a;

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lud/a;

    .line 47
    .line 48
    if-eq v1, v3, :cond_1

    .line 49
    .line 50
    invoke-static {v3, v1}, La/a;->m0(Lud/a;Lud/a;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return-object v1

    .line 58
    :cond_3
    const/4 p0, 0x0

    .line 59
    return-object p0
.end method

.method public static V0(Lud/a;Lud/a;Ljava/util/BitSet;Z)Z
    .locals 4

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lud/a;->o:Ljava/util/List;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lud/a;->n:Ljava/util/List;

    .line 7
    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lud/a;

    .line 23
    .line 24
    if-ne v1, p1, :cond_2

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_2
    if-ne v1, p0, :cond_3

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_3
    iget v2, v1, Lud/a;->j:I

    .line 31
    .line 32
    invoke-virtual {p2, v2}, Ljava/util/BitSet;->get(I)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p2, v2}, Ljava/util/BitSet;->set(I)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p1, Lud/a;->p:Ljava/util/BitSet;

    .line 42
    .line 43
    iget v3, v1, Lud/a;->j:I

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/util/BitSet;->get(I)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_4
    invoke-static {v1, p1, p2, p3}, La/a;->V0(Lud/a;Lud/a;Ljava/util/BitSet;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    :goto_2
    const/4 p0, 0x1

    .line 59
    return p0

    .line 60
    :cond_5
    const/4 p0, 0x0

    .line 61
    return p0
.end method

.method public static W(Lud/h;)Lud/p;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p0}, Lud/h;->g()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    :goto_0
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lud/p;

    .line 22
    .line 23
    return-object p0
.end method

.method public static W0(I)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    rsub-int/lit8 v3, v2, 0x1

    .line 8
    .line 9
    and-int/lit8 v4, p0, 0xf

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    aput-char v4, v1, v3

    .line 18
    .line 19
    shr-int/lit8 p0, p0, 0x4

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public static X(Ljava/util/Collection;)Llg/d;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Llg/d;

    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v1, 0x1

    .line 11
    sub-int/2addr p0, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v2, p0, v1}, Llg/b;-><init>(III)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static X0(I)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    rsub-int/lit8 v3, v2, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p0, 0xf

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    aput-char v4, v1, v3

    .line 18
    .line 19
    shr-int/2addr p0, v0

    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public static Y(Lud/a;Lud/p;)I
    .locals 3

    .line 1
    iget-object p0, p0, Lud/a;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-ne v2, p1, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, -0x1

    .line 21
    return p0
.end method

.method public static Y0(I)Ljava/lang/String;
    .locals 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [C

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    if-ge v2, v0, :cond_0

    .line 7
    .line 8
    rsub-int/lit8 v3, v2, 0x7

    .line 9
    .line 10
    and-int/lit8 v4, p0, 0xf

    .line 11
    .line 12
    const/16 v5, 0x10

    .line 13
    .line 14
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    aput-char v4, v1, v3

    .line 19
    .line 20
    shr-int/lit8 p0, p0, 0x4

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public static final Z(Lmg/b;)Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Lgg/e;

    .line 5
    .line 6
    invoke-interface {p0}, Lgg/e;->a()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    sparse-switch v1, :sswitch_data_0

    .line 27
    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :sswitch_0
    const-string v1, "short"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-class p0, Ljava/lang/Short;

    .line 41
    .line 42
    return-object p0

    .line 43
    :sswitch_1
    const-string v1, "float"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const-class p0, Ljava/lang/Float;

    .line 53
    .line 54
    return-object p0

    .line 55
    :sswitch_2
    const-string v1, "boolean"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    const-class p0, Ljava/lang/Boolean;

    .line 65
    .line 66
    return-object p0

    .line 67
    :sswitch_3
    const-string v1, "void"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    const-class p0, Ljava/lang/Void;

    .line 77
    .line 78
    return-object p0

    .line 79
    :sswitch_4
    const-string v1, "long"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_5

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    const-class p0, Ljava/lang/Long;

    .line 89
    .line 90
    return-object p0

    .line 91
    :sswitch_5
    const-string v1, "char"

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_6

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_6
    const-class p0, Ljava/lang/Character;

    .line 101
    .line 102
    return-object p0

    .line 103
    :sswitch_6
    const-string v1, "byte"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_7

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_7
    const-class p0, Ljava/lang/Byte;

    .line 113
    .line 114
    return-object p0

    .line 115
    :sswitch_7
    const-string v1, "int"

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_8

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_8
    const-class p0, Ljava/lang/Integer;

    .line 125
    .line 126
    return-object p0

    .line 127
    :sswitch_8
    const-string v1, "double"

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_9

    .line 134
    .line 135
    :goto_0
    return-object p0

    .line 136
    :cond_9
    const-class p0, Ljava/lang/Double;

    .line 137
    .line 138
    return-object p0

    .line 139
    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method

.method public static Z0(J)Ljava/lang/String;
    .locals 5

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [C

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    if-ge v2, v0, :cond_0

    .line 7
    .line 8
    rsub-int/lit8 v3, v2, 0xf

    .line 9
    .line 10
    long-to-int v4, p0

    .line 11
    and-int/lit8 v4, v4, 0xf

    .line 12
    .line 13
    invoke-static {v4, v0}, Ljava/lang/Character;->forDigit(II)C

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    aput-char v4, v1, v3

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    shr-long/2addr p0, v3

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public static final a0(Lgg/f;)Ljava/lang/Class;
    .locals 1

    .line 1
    invoke-interface {p0}, Lgg/e;->a()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    sparse-switch v0, :sswitch_data_0

    .line 21
    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :sswitch_0
    const-string v0, "java.lang.Double"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    return-object p0

    .line 37
    :sswitch_1
    const-string v0, "java.lang.Void"

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    return-object p0

    .line 49
    :sswitch_2
    const-string v0, "java.lang.Long"

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    return-object p0

    .line 61
    :sswitch_3
    const-string v0, "java.lang.Byte"

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-nez p0, :cond_4

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    return-object p0

    .line 73
    :sswitch_4
    const-string v0, "java.lang.Boolean"

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-nez p0, :cond_5

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_5
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    return-object p0

    .line 85
    :sswitch_5
    const-string v0, "java.lang.Character"

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-nez p0, :cond_6

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_6
    sget-object p0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 95
    .line 96
    return-object p0

    .line 97
    :sswitch_6
    const-string v0, "java.lang.Short"

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-nez p0, :cond_7

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_7
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 107
    .line 108
    return-object p0

    .line 109
    :sswitch_7
    const-string v0, "java.lang.Float"

    .line 110
    .line 111
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-nez p0, :cond_8

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_8
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 119
    .line 120
    return-object p0

    .line 121
    :sswitch_8
    const-string v0, "java.lang.Integer"

    .line 122
    .line 123
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-nez p0, :cond_9

    .line 128
    .line 129
    :goto_0
    const/4 p0, 0x0

    .line 130
    return-object p0

    .line 131
    :cond_9
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 132
    .line 133
    return-object p0

    .line 134
    nop

    .line 135
    :sswitch_data_0
    .sparse-switch
        -0x7a988a96 -> :sswitch_8
        -0x1f76ce78 -> :sswitch_7
        -0x1ec16c58 -> :sswitch_6
        0x9415455 -> :sswitch_5
        0x148d6054 -> :sswitch_4
        0x17c0bc5c -> :sswitch_3
        0x17c521d0 -> :sswitch_2
        0x17c9ace8 -> :sswitch_1
        0x2d605225 -> :sswitch_0
    .end sparse-switch
.end method

.method public static a1(ILjava/util/List;)Ljava/lang/String;
    .locals 18

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static/range {p1 .. p1}, La/a;->E0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string v0, "\u8bf7\u914d\u7f6e\u53d1\u9001\u5185\u5bb9"

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x5

    .line 26
    const/4 v4, 0x4

    .line 27
    const/4 v6, 0x2

    .line 28
    const/4 v7, 0x1

    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    move-object v8, v2

    .line 36
    check-cast v8, Ldb/a;

    .line 37
    .line 38
    iget v9, v8, Ldb/a;->a:I

    .line 39
    .line 40
    if-eq v9, v7, :cond_2

    .line 41
    .line 42
    if-eq v9, v6, :cond_2

    .line 43
    .line 44
    const/4 v10, 0x3

    .line 45
    if-eq v9, v10, :cond_2

    .line 46
    .line 47
    if-eq v9, v4, :cond_2

    .line 48
    .line 49
    if-ne v9, v3, :cond_1

    .line 50
    .line 51
    :cond_2
    new-instance v9, Ljava/io/File;

    .line 52
    .line 53
    iget-object v8, v8, Ldb/a;->b:Ljava/lang/String;

    .line 54
    .line 55
    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-nez v8, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 v2, 0x0

    .line 66
    :goto_0
    check-cast v2, Ldb/a;

    .line 67
    .line 68
    const-string v1, "\u6587\u672c"

    .line 69
    .line 70
    const-string v8, "\u56fe\u7247"

    .line 71
    .line 72
    const-string v9, "\u89c6\u9891"

    .line 73
    .line 74
    const-string v10, "\u6587\u4ef6"

    .line 75
    .line 76
    const-string v11, "\u8868\u60c5"

    .line 77
    .line 78
    const-string v12, "\u8bed\u97f3"

    .line 79
    .line 80
    const-string v13, "\u89c6\u9891\u53f7"

    .line 81
    .line 82
    const-string v14, "\u6536\u85cf"

    .line 83
    .line 84
    const-string v15, "\u5185\u5bb9"

    .line 85
    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    new-instance v0, Ljava/io/File;

    .line 89
    .line 90
    iget-object v3, v2, Ldb/a;->b:Ljava/lang/String;

    .line 91
    .line 92
    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    iget v0, v2, Ldb/a;->a:I

    .line 106
    .line 107
    packed-switch v0, :pswitch_data_0

    .line 108
    .line 109
    .line 110
    move-object v1, v15

    .line 111
    goto :goto_1

    .line 112
    :pswitch_0
    move-object v1, v14

    .line 113
    goto :goto_1

    .line 114
    :pswitch_1
    move-object v1, v13

    .line 115
    goto :goto_1

    .line 116
    :pswitch_2
    move-object v1, v12

    .line 117
    goto :goto_1

    .line 118
    :pswitch_3
    move-object v1, v11

    .line 119
    goto :goto_1

    .line 120
    :pswitch_4
    move-object v1, v10

    .line 121
    goto :goto_1

    .line 122
    :pswitch_5
    move-object v1, v9

    .line 123
    goto :goto_1

    .line 124
    :pswitch_6
    move-object v1, v8

    .line 125
    :goto_1
    :pswitch_7
    move-object v0, v1

    .line 126
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v2, "\u53d1\u9001\u6587\u4ef6\u4e0d\u5b58\u5728: "

    .line 129
    .line 130
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    return-object v0

    .line 141
    :cond_5
    sget-object v2, La/a;->g:Lhb/k0;

    .line 142
    .line 143
    if-eqz v2, :cond_21

    .line 144
    .line 145
    move/from16 v5, p0

    .line 146
    .line 147
    const/16 p1, 0x0

    .line 148
    .line 149
    if-ne v5, v7, :cond_20

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    const/4 v3, 0x6

    .line 156
    if-eqz v5, :cond_6

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v16

    .line 167
    if-eqz v16, :cond_b

    .line 168
    .line 169
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v16

    .line 173
    move-object/from16 v4, v16

    .line 174
    .line 175
    check-cast v4, Ldb/a;

    .line 176
    .line 177
    iget v6, v4, Ldb/a;->a:I

    .line 178
    .line 179
    if-ne v6, v3, :cond_9

    .line 180
    .line 181
    if-eqz v6, :cond_8

    .line 182
    .line 183
    if-eq v6, v7, :cond_8

    .line 184
    .line 185
    const/4 v7, 0x2

    .line 186
    if-eq v6, v7, :cond_8

    .line 187
    .line 188
    const/4 v7, 0x4

    .line 189
    if-eq v6, v7, :cond_8

    .line 190
    .line 191
    const/4 v7, 0x5

    .line 192
    if-eq v6, v7, :cond_8

    .line 193
    .line 194
    if-eq v6, v3, :cond_7

    .line 195
    .line 196
    const/4 v4, 0x0

    .line 197
    goto :goto_3

    .line 198
    :cond_7
    sget-object v6, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 199
    .line 200
    iget-object v4, v4, Ldb/a;->b:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-static {v4}, Ll8/d;->h(Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    goto :goto_3

    .line 210
    :cond_8
    const/4 v4, 0x1

    .line 211
    :goto_3
    if-nez v4, :cond_9

    .line 212
    .line 213
    const/4 v4, 0x1

    .line 214
    goto :goto_4

    .line 215
    :cond_9
    const/4 v4, 0x0

    .line 216
    :goto_4
    if-eqz v4, :cond_a

    .line 217
    .line 218
    const-string v0, "\u89c6\u9891\u53f7\u5185\u5bb9\u65e0\u6548\uff0c\u8bf7\u586b\u5199\u89c6\u9891\u53f7\u5206\u4eab\u6d88\u606f XML"

    .line 219
    .line 220
    return-object v0

    .line 221
    :cond_a
    const/4 v6, 0x2

    .line 222
    const/4 v7, 0x1

    .line 223
    goto :goto_2

    .line 224
    :cond_b
    :goto_5
    new-instance v4, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    if-eqz v6, :cond_f

    .line 238
    .line 239
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    move-object v7, v6

    .line 244
    check-cast v7, Ldb/a;

    .line 245
    .line 246
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    iget v3, v7, Ldb/a;->a:I

    .line 250
    .line 251
    move-object/from16 v17, v0

    .line 252
    .line 253
    if-eqz v3, :cond_d

    .line 254
    .line 255
    const/4 v0, 0x1

    .line 256
    if-eq v3, v0, :cond_d

    .line 257
    .line 258
    const/4 v0, 0x2

    .line 259
    if-eq v3, v0, :cond_d

    .line 260
    .line 261
    const/4 v0, 0x4

    .line 262
    if-eq v3, v0, :cond_d

    .line 263
    .line 264
    const/4 v0, 0x5

    .line 265
    if-eq v3, v0, :cond_d

    .line 266
    .line 267
    const/4 v0, 0x6

    .line 268
    if-eq v3, v0, :cond_c

    .line 269
    .line 270
    const/4 v0, 0x0

    .line 271
    goto :goto_7

    .line 272
    :cond_c
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 273
    .line 274
    iget-object v3, v7, Ldb/a;->b:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {v3}, Ll8/d;->h(Ljava/lang/String;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    goto :goto_7

    .line 284
    :cond_d
    const/4 v0, 0x1

    .line 285
    :goto_7
    if-nez v0, :cond_e

    .line 286
    .line 287
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    :cond_e
    move-object/from16 v0, v17

    .line 291
    .line 292
    const/4 v3, 0x6

    .line 293
    goto :goto_6

    .line 294
    :cond_f
    move-object/from16 v17, v0

    .line 295
    .line 296
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-nez v0, :cond_11

    .line 301
    .line 302
    new-instance v0, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    if-eqz v3, :cond_10

    .line 320
    .line 321
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    check-cast v3, Ldb/a;

    .line 326
    .line 327
    iget v3, v3, Ldb/a;->a:I

    .line 328
    .line 329
    packed-switch v3, :pswitch_data_1

    .line 330
    .line 331
    .line 332
    move-object v3, v15

    .line 333
    goto :goto_9

    .line 334
    :pswitch_8
    move-object v3, v14

    .line 335
    goto :goto_9

    .line 336
    :pswitch_9
    move-object v3, v13

    .line 337
    goto :goto_9

    .line 338
    :pswitch_a
    move-object v3, v12

    .line 339
    goto :goto_9

    .line 340
    :pswitch_b
    move-object v3, v11

    .line 341
    goto :goto_9

    .line 342
    :pswitch_c
    move-object v3, v10

    .line 343
    goto :goto_9

    .line 344
    :pswitch_d
    move-object v3, v9

    .line 345
    goto :goto_9

    .line 346
    :pswitch_e
    move-object v3, v8

    .line 347
    goto :goto_9

    .line 348
    :pswitch_f
    move-object v3, v1

    .line 349
    :goto_9
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_10
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    const/4 v5, 0x0

    .line 362
    const/16 v6, 0x3e

    .line 363
    .line 364
    const-string v2, "\u3001"

    .line 365
    .line 366
    const/4 v3, 0x0

    .line 367
    const/4 v4, 0x0

    .line 368
    invoke-static/range {v1 .. v6}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    const-string v1, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u4ec5\u652f\u6301\u6587\u5b57\u3001\u56fe\u7247\u3001\u89c6\u9891\u3001\u8bed\u97f3\u3001\u8868\u60c5\u548c\u89c6\u9891\u53f7: "

    .line 373
    .line 374
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    return-object v0

    .line 379
    :cond_11
    iget-object v0, v2, Lhb/k0;->c:Lhb/k;

    .line 380
    .line 381
    invoke-virtual {v0}, Lhb/k;->g()Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-nez v0, :cond_12

    .line 386
    .line 387
    const-string v0, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u901a\u9053\u4e0d\u53ef\u7528"

    .line 388
    .line 389
    return-object v0

    .line 390
    :cond_12
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->isEmpty()Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_13

    .line 395
    .line 396
    goto :goto_b

    .line 397
    :cond_13
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    if-eqz v3, :cond_17

    .line 406
    .line 407
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    check-cast v3, Ldb/a;

    .line 412
    .line 413
    iget v4, v3, Ldb/a;->a:I

    .line 414
    .line 415
    const/4 v5, 0x6

    .line 416
    if-eqz v4, :cond_15

    .line 417
    .line 418
    if-ne v4, v5, :cond_16

    .line 419
    .line 420
    :cond_15
    iget-object v3, v3, Ldb/a;->b:Ljava/lang/String;

    .line 421
    .line 422
    const-string v4, "%friendName%"

    .line 423
    .line 424
    const/4 v6, 0x0

    .line 425
    invoke-static {v3, v4, v6}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    if-eqz v3, :cond_16

    .line 430
    .line 431
    const/4 v6, 0x1

    .line 432
    goto :goto_a

    .line 433
    :cond_16
    const/4 v6, 0x0

    .line 434
    :goto_a
    if-eqz v6, :cond_14

    .line 435
    .line 436
    const-string v0, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u4e0d\u652f\u6301\u597d\u53cb\u6635\u79f0\u53d8\u91cf"

    .line 437
    .line 438
    return-object v0

    .line 439
    :cond_17
    :goto_b
    iget-object v0, v2, Lhb/k0;->c:Lhb/k;

    .line 440
    .line 441
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    iget-object v0, v0, Lhb/k;->f:Lhb/g;

    .line 445
    .line 446
    if-eqz v0, :cond_1c

    .line 447
    .line 448
    new-instance v3, Ljava/util/ArrayList;

    .line 449
    .line 450
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    :cond_18
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v5

    .line 461
    if-eqz v5, :cond_1b

    .line 462
    .line 463
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v5

    .line 467
    check-cast v5, Ldb/a;

    .line 468
    .line 469
    const/4 v6, 0x0

    .line 470
    invoke-static {v5, v6}, Lhb/k;->b(Ldb/a;I)Lhb/t;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    if-eqz v7, :cond_1a

    .line 475
    .line 476
    invoke-static {v7, v0}, Lhb/k;->h(Lhb/t;Lhb/g;)Z

    .line 477
    .line 478
    .line 479
    move-result v7

    .line 480
    if-nez v7, :cond_19

    .line 481
    .line 482
    goto :goto_d

    .line 483
    :cond_19
    move-object/from16 v5, p1

    .line 484
    .line 485
    goto :goto_e

    .line 486
    :cond_1a
    :goto_d
    iget v5, v5, Ldb/a;->a:I

    .line 487
    .line 488
    packed-switch v5, :pswitch_data_2

    .line 489
    .line 490
    .line 491
    move-object v5, v15

    .line 492
    goto :goto_e

    .line 493
    :pswitch_10
    move-object v5, v14

    .line 494
    goto :goto_e

    .line 495
    :pswitch_11
    move-object v5, v13

    .line 496
    goto :goto_e

    .line 497
    :pswitch_12
    move-object v5, v12

    .line 498
    goto :goto_e

    .line 499
    :pswitch_13
    move-object v5, v11

    .line 500
    goto :goto_e

    .line 501
    :pswitch_14
    move-object v5, v10

    .line 502
    goto :goto_e

    .line 503
    :pswitch_15
    move-object v5, v9

    .line 504
    goto :goto_e

    .line 505
    :pswitch_16
    move-object v5, v8

    .line 506
    goto :goto_e

    .line 507
    :pswitch_17
    move-object v5, v1

    .line 508
    :goto_e
    if-eqz v5, :cond_18

    .line 509
    .line 510
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    goto :goto_c

    .line 514
    :cond_1b
    invoke-static {v3}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    :goto_f
    move-object v3, v0

    .line 523
    goto :goto_12

    .line 524
    :cond_1c
    new-instance v0, Ljava/util/ArrayList;

    .line 525
    .line 526
    invoke-static/range {v17 .. v17}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 538
    .line 539
    .line 540
    move-result v4

    .line 541
    if-eqz v4, :cond_1d

    .line 542
    .line 543
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v4

    .line 547
    check-cast v4, Ldb/a;

    .line 548
    .line 549
    iget v4, v4, Ldb/a;->a:I

    .line 550
    .line 551
    packed-switch v4, :pswitch_data_3

    .line 552
    .line 553
    .line 554
    move-object v4, v15

    .line 555
    goto :goto_11

    .line 556
    :pswitch_18
    move-object v4, v14

    .line 557
    goto :goto_11

    .line 558
    :pswitch_19
    move-object v4, v13

    .line 559
    goto :goto_11

    .line 560
    :pswitch_1a
    move-object v4, v12

    .line 561
    goto :goto_11

    .line 562
    :pswitch_1b
    move-object v4, v11

    .line 563
    goto :goto_11

    .line 564
    :pswitch_1c
    move-object v4, v10

    .line 565
    goto :goto_11

    .line 566
    :pswitch_1d
    move-object v4, v9

    .line 567
    goto :goto_11

    .line 568
    :pswitch_1e
    move-object v4, v8

    .line 569
    goto :goto_11

    .line 570
    :pswitch_1f
    move-object v4, v1

    .line 571
    :goto_11
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    goto :goto_10

    .line 575
    :cond_1d
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    goto :goto_f

    .line 584
    :goto_12
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    if-nez v0, :cond_1e

    .line 589
    .line 590
    const/4 v7, 0x0

    .line 591
    const/16 v8, 0x3e

    .line 592
    .line 593
    const-string v4, "\u3001"

    .line 594
    .line 595
    const/4 v5, 0x0

    .line 596
    const/4 v6, 0x0

    .line 597
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    const-string v1, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u4e0d\u652f\u6301: "

    .line 602
    .line 603
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    return-object v0

    .line 608
    :cond_1e
    iget-object v0, v2, Lhb/k0;->c:Lhb/k;

    .line 609
    .line 610
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    invoke-static/range {v17 .. v17}, Lhb/k;->c(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    if-eqz v0, :cond_1f

    .line 618
    .line 619
    invoke-static {v0}, Lhb/k;->j(Ljava/util/List;)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    goto :goto_13

    .line 624
    :cond_1f
    const-string v0, "\u539f\u751f\u7fa4\u53d1\u5185\u5bb9\u65e0\u6548"

    .line 625
    .line 626
    :goto_13
    if-eqz v0, :cond_20

    .line 627
    .line 628
    return-object v0

    .line 629
    :cond_20
    return-object p1

    .line 630
    :cond_21
    const-string v0, "\u7fa4\u53d1\u52a9\u624b\u5c1a\u672a\u5c31\u7eea"

    .line 631
    .line 632
    return-object v0

    .line 633
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
    .end packed-switch
.end method

.method public static final b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V
    .locals 16

    .line 1
    move-object/from16 v12, p9

    .line 2
    .line 3
    move/from16 v0, p10

    .line 4
    .line 5
    const v1, 0x3335543

    .line 6
    .line 7
    .line 8
    invoke-virtual {v12, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, v0, 0x6

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    move-object/from16 v1, p0

    .line 16
    .line 17
    invoke-virtual {v12, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x2

    .line 26
    :goto_0
    or-int/2addr v2, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object/from16 v1, p0

    .line 29
    .line 30
    move v2, v0

    .line 31
    :goto_1
    and-int/lit8 v3, p11, 0x2

    .line 32
    .line 33
    if-nez v3, :cond_2

    .line 34
    .line 35
    move-object/from16 v3, p1

    .line 36
    .line 37
    invoke-virtual {v12, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    const/16 v4, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    move-object/from16 v3, p1

    .line 47
    .line 48
    :cond_3
    const/16 v4, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v2, v4

    .line 51
    and-int/lit8 v4, p11, 0x4

    .line 52
    .line 53
    if-eqz v4, :cond_5

    .line 54
    .line 55
    or-int/lit16 v2, v2, 0x180

    .line 56
    .line 57
    :cond_4
    move-object/from16 v5, p2

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_5
    and-int/lit16 v5, v0, 0x180

    .line 61
    .line 62
    if-nez v5, :cond_4

    .line 63
    .line 64
    move-object/from16 v5, p2

    .line 65
    .line 66
    invoke-virtual {v12, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_6

    .line 71
    .line 72
    const/16 v6, 0x100

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_6
    const/16 v6, 0x80

    .line 76
    .line 77
    :goto_3
    or-int/2addr v2, v6

    .line 78
    :goto_4
    or-int/lit16 v2, v2, 0xc00

    .line 79
    .line 80
    and-int/lit16 v6, v0, 0x6000

    .line 81
    .line 82
    if-nez v6, :cond_9

    .line 83
    .line 84
    and-int/lit8 v6, p11, 0x10

    .line 85
    .line 86
    if-nez v6, :cond_7

    .line 87
    .line 88
    move-object/from16 v6, p3

    .line 89
    .line 90
    invoke-virtual {v12, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_8

    .line 95
    .line 96
    const/16 v7, 0x4000

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_7
    move-object/from16 v6, p3

    .line 100
    .line 101
    :cond_8
    const/16 v7, 0x2000

    .line 102
    .line 103
    :goto_5
    or-int/2addr v2, v7

    .line 104
    goto :goto_6

    .line 105
    :cond_9
    move-object/from16 v6, p3

    .line 106
    .line 107
    :goto_6
    const/high16 v7, 0x2cb0000

    .line 108
    .line 109
    or-int/2addr v2, v7

    .line 110
    const/high16 v7, 0x30000000

    .line 111
    .line 112
    and-int/2addr v7, v0

    .line 113
    move-object/from16 v9, p8

    .line 114
    .line 115
    if-nez v7, :cond_b

    .line 116
    .line 117
    invoke-virtual {v12, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-eqz v7, :cond_a

    .line 122
    .line 123
    const/high16 v7, 0x20000000

    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_a
    const/high16 v7, 0x10000000

    .line 127
    .line 128
    :goto_7
    or-int/2addr v2, v7

    .line 129
    :cond_b
    const v7, 0x12492493

    .line 130
    .line 131
    .line 132
    and-int/2addr v7, v2

    .line 133
    const v8, 0x12492492

    .line 134
    .line 135
    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v11, 0x1

    .line 138
    if-eq v7, v8, :cond_c

    .line 139
    .line 140
    move v7, v11

    .line 141
    goto :goto_8

    .line 142
    :cond_c
    move v7, v10

    .line 143
    :goto_8
    and-int/lit8 v8, v2, 0x1

    .line 144
    .line 145
    invoke-virtual {v12, v8, v7}, Li0/h0;->S(IZ)Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    if-eqz v7, :cond_16

    .line 150
    .line 151
    invoke-virtual {v12}, Li0/h0;->X()V

    .line 152
    .line 153
    .line 154
    and-int/lit8 v7, v0, 0x1

    .line 155
    .line 156
    const v8, -0xe380001

    .line 157
    .line 158
    .line 159
    const v13, -0xe001

    .line 160
    .line 161
    .line 162
    if-eqz v7, :cond_10

    .line 163
    .line 164
    invoke-virtual {v12}, Li0/h0;->B()Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-eqz v7, :cond_d

    .line 169
    .line 170
    goto :goto_9

    .line 171
    :cond_d
    invoke-virtual {v12}, Li0/h0;->V()V

    .line 172
    .line 173
    .line 174
    and-int/lit8 v4, p11, 0x2

    .line 175
    .line 176
    if-eqz v4, :cond_e

    .line 177
    .line 178
    and-int/lit8 v2, v2, -0x71

    .line 179
    .line 180
    :cond_e
    and-int/lit8 v4, p11, 0x10

    .line 181
    .line 182
    if-eqz v4, :cond_f

    .line 183
    .line 184
    and-int/2addr v2, v13

    .line 185
    :cond_f
    and-int/2addr v2, v8

    .line 186
    move-object/from16 v7, p4

    .line 187
    .line 188
    move-object/from16 v4, p5

    .line 189
    .line 190
    move v10, v2

    .line 191
    move-object v2, v5

    .line 192
    move-object v8, v6

    .line 193
    move/from16 v5, p6

    .line 194
    .line 195
    move-object/from16 v6, p7

    .line 196
    .line 197
    goto :goto_b

    .line 198
    :cond_10
    :goto_9
    and-int/lit8 v7, p11, 0x2

    .line 199
    .line 200
    if-eqz v7, :cond_11

    .line 201
    .line 202
    invoke-static {v12}, Lr/b0;->a(Li0/h0;)Lr/z;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    and-int/lit8 v2, v2, -0x71

    .line 207
    .line 208
    :cond_11
    if-eqz v4, :cond_12

    .line 209
    .line 210
    int-to-float v4, v10

    .line 211
    new-instance v5, Lp/z0;

    .line 212
    .line 213
    invoke-direct {v5, v4, v4, v4, v4}, Lp/z0;-><init>(FFFF)V

    .line 214
    .line 215
    .line 216
    :cond_12
    and-int/lit8 v4, p11, 0x10

    .line 217
    .line 218
    if-eqz v4, :cond_13

    .line 219
    .line 220
    sget-object v4, Lp/j;->c:Lp/e;

    .line 221
    .line 222
    and-int/2addr v2, v13

    .line 223
    goto :goto_a

    .line 224
    :cond_13
    move-object v4, v6

    .line 225
    :goto_a
    sget-object v6, Ly0/b;->s:Ly0/e;

    .line 226
    .line 227
    invoke-static {v12}, Lh/g1;->a(Li0/h0;)Li/u;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    invoke-virtual {v12, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v13

    .line 239
    if-nez v10, :cond_14

    .line 240
    .line 241
    sget-object v10, Li0/l;->a:Li0/e;

    .line 242
    .line 243
    if-ne v13, v10, :cond_15

    .line 244
    .line 245
    :cond_14
    new-instance v13, Lm/p;

    .line 246
    .line 247
    invoke-direct {v13, v7}, Lm/p;-><init>(Li/u;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_15
    move-object v7, v13

    .line 254
    check-cast v7, Lm/p;

    .line 255
    .line 256
    invoke-static {v12}, Lk/m1;->a(Li0/h0;)Lk/k1;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    and-int/2addr v2, v8

    .line 261
    move-object v8, v4

    .line 262
    move-object v4, v7

    .line 263
    move-object v7, v6

    .line 264
    move-object v6, v10

    .line 265
    move v10, v2

    .line 266
    move-object v2, v5

    .line 267
    move v5, v11

    .line 268
    :goto_b
    invoke-virtual {v12}, Li0/h0;->q()V

    .line 269
    .line 270
    .line 271
    and-int/lit8 v11, v10, 0xe

    .line 272
    .line 273
    or-int/lit16 v11, v11, 0x6000

    .line 274
    .line 275
    and-int/lit8 v13, v10, 0x70

    .line 276
    .line 277
    or-int/2addr v11, v13

    .line 278
    and-int/lit16 v13, v10, 0x380

    .line 279
    .line 280
    or-int/2addr v11, v13

    .line 281
    const v13, 0x30180c00

    .line 282
    .line 283
    .line 284
    or-int/2addr v13, v11

    .line 285
    shr-int/lit8 v11, v10, 0xc

    .line 286
    .line 287
    and-int/lit8 v11, v11, 0xe

    .line 288
    .line 289
    shr-int/lit8 v10, v10, 0x12

    .line 290
    .line 291
    and-int/lit16 v10, v10, 0x1c00

    .line 292
    .line 293
    or-int v14, v11, v10

    .line 294
    .line 295
    const/16 v15, 0x1900

    .line 296
    .line 297
    move-object v1, v3

    .line 298
    const/4 v3, 0x1

    .line 299
    const/4 v9, 0x0

    .line 300
    const/4 v10, 0x0

    .line 301
    move-object/from16 v0, p0

    .line 302
    .line 303
    move-object/from16 v11, p8

    .line 304
    .line 305
    invoke-static/range {v0 .. v15}, La7/a;->a(Ly0/o;Lr/z;Lp/x0;ZLm/p;ZLk/k1;Ly0/e;Lp/i;Ly0/f;Lp/g;Lfg/l;Li0/h0;III)V

    .line 306
    .line 307
    .line 308
    move-object v3, v6

    .line 309
    move-object v6, v4

    .line 310
    move-object v4, v8

    .line 311
    move-object v8, v3

    .line 312
    move-object v3, v7

    .line 313
    move v7, v5

    .line 314
    move-object v5, v3

    .line 315
    move-object v3, v2

    .line 316
    move-object v2, v1

    .line 317
    goto :goto_c

    .line 318
    :cond_16
    invoke-virtual/range {p9 .. p9}, Li0/h0;->V()V

    .line 319
    .line 320
    .line 321
    move/from16 v7, p6

    .line 322
    .line 323
    move-object/from16 v8, p7

    .line 324
    .line 325
    move-object v2, v3

    .line 326
    move-object v3, v5

    .line 327
    move-object v4, v6

    .line 328
    move-object/from16 v5, p4

    .line 329
    .line 330
    move-object/from16 v6, p5

    .line 331
    .line 332
    :goto_c
    invoke-virtual/range {p9 .. p9}, Li0/h0;->t()Li0/r1;

    .line 333
    .line 334
    .line 335
    move-result-object v12

    .line 336
    if-eqz v12, :cond_17

    .line 337
    .line 338
    new-instance v0, Lr/c;

    .line 339
    .line 340
    move-object/from16 v1, p0

    .line 341
    .line 342
    move-object/from16 v9, p8

    .line 343
    .line 344
    move/from16 v10, p10

    .line 345
    .line 346
    move/from16 v11, p11

    .line 347
    .line 348
    invoke-direct/range {v0 .. v11}, Lr/c;-><init>(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;II)V

    .line 349
    .line 350
    .line 351
    iput-object v0, v12, Li0/r1;->d:Lfg/p;

    .line 352
    .line 353
    :cond_17
    return-void
.end method

.method public static b0(Ljava/util/List;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    add-int/lit8 p0, p0, -0x1

    .line 9
    .line 10
    return p0
.end method

.method public static final b1(Lth/g;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lth/c;->c()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lth/g;->C:Lf1/m;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/high16 v2, 0x3f800000    # 1.0f

    .line 15
    .line 16
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget v4, p0, Lth/g;->z:F

    .line 21
    .line 22
    cmpg-float v4, v4, v1

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    iget v4, p0, Lth/g;->A:F

    .line 27
    .line 28
    cmpg-float v4, v4, v2

    .line 29
    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    iget v4, p0, Lth/g;->B:F

    .line 33
    .line 34
    cmpg-float v4, v4, v3

    .line 35
    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-string v0, "\n    uniform shader child;\n    uniform float in_brightness;\n    uniform float in_contrast;\n    uniform float in_saturation;\n\n    half4 main(float2 xy) {\n        half4 src = child.eval(xy);\n        half a = src.a;\n        if (a < 0.001) return src;\n\n        half3 c = src.rgb / a;\n\n        if (in_brightness != 0.0) {\n            c = pow(c, half3(2.2));\n            if (in_brightness > 0.0) {\n                c = mix(c, half3(1.0), half(in_brightness));\n            } else {\n                c = c * half(1.0 + in_brightness);\n            }\n            c = pow(c, half3(0.45454545));\n        }\n\n        if (in_contrast != 1.0) {\n            c = (c - 0.5) * half(in_contrast) + 0.5;\n        }\n\n        if (in_saturation != 1.0) {\n            half lum = dot(c, half3(0.2126, 0.7152, 0.0722));\n            c = mix(half3(lum), c, half(in_saturation));\n        }\n\n        c = clamp(c, half3(0.0), half3(1.0));\n        return half4(c * a, a);\n    }\n"

    .line 40
    .line 41
    const-string v4, "ColorControls"

    .line 42
    .line 43
    invoke-virtual {p0, v4, v0}, Lth/g;->e(Ljava/lang/String;Ljava/lang/String;)Lai/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v4, v0, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 51
    .line 52
    const-string v5, "in_brightness"

    .line 53
    .line 54
    invoke-static {v4, v5, v1}, Lai/a;->s(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 55
    .line 56
    .line 57
    const-string v4, "in_contrast"

    .line 58
    .line 59
    iget-object v5, v0, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 60
    .line 61
    invoke-static {v5, v4, v2}, Lai/a;->s(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 62
    .line 63
    .line 64
    const-string v4, "in_saturation"

    .line 65
    .line 66
    iget-object v5, v0, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 67
    .line 68
    invoke-static {v5, v4, v3}, Lai/a;->s(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 69
    .line 70
    .line 71
    const-string v4, "child"

    .line 72
    .line 73
    invoke-static {v0, v4}, Lac/p;->L(Lai/b;Ljava/lang/String;)Lf1/m;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput v1, p0, Lth/g;->z:F

    .line 78
    .line 79
    iput v2, p0, Lth/g;->A:F

    .line 80
    .line 81
    iput v3, p0, Lth/g;->B:F

    .line 82
    .line 83
    iput-object v0, p0, Lth/g;->C:Lf1/m;

    .line 84
    .line 85
    :goto_0
    iget-object v1, p0, Lth/g;->l:Lf1/n0;

    .line 86
    .line 87
    invoke-static {v1, v0}, Lac/p;->i(Lf1/n0;Lf1/n0;)Lf1/n0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lth/g;->l:Lf1/n0;

    .line 92
    .line 93
    return-void
.end method

.method public static final c(Ly0/o;Lr/z;Lp/x0;Lp/g;Ly0/f;Lm/p;ZLk/k1;Lfg/l;Li0/h0;I)V
    .locals 16

    .line 1
    move-object/from16 v12, p9

    .line 2
    .line 3
    const v0, -0x705086e1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v12, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 7
    .line 8
    .line 9
    const v0, 0x2cb0d90

    .line 10
    .line 11
    .line 12
    or-int v0, p10, v0

    .line 13
    .line 14
    move-object/from16 v10, p8

    .line 15
    .line 16
    invoke-virtual {v12, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/high16 v1, 0x20000000

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/high16 v1, 0x10000000

    .line 26
    .line 27
    :goto_0
    or-int/2addr v0, v1

    .line 28
    const v1, 0x12492493

    .line 29
    .line 30
    .line 31
    and-int/2addr v1, v0

    .line 32
    const v2, 0x12492492

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x1

    .line 37
    if-eq v1, v2, :cond_1

    .line 38
    .line 39
    move v1, v4

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v1, v3

    .line 42
    :goto_1
    and-int/lit8 v2, v0, 0x1

    .line 43
    .line 44
    invoke-virtual {v12, v2, v1}, Li0/h0;->S(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_6

    .line 49
    .line 50
    invoke-virtual {v12}, Li0/h0;->X()V

    .line 51
    .line 52
    .line 53
    and-int/lit8 v1, p10, 0x1

    .line 54
    .line 55
    const v2, -0xe380071

    .line 56
    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v12}, Li0/h0;->B()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v12}, Li0/h0;->V()V

    .line 68
    .line 69
    .line 70
    and-int/2addr v0, v2

    .line 71
    move-object/from16 v1, p1

    .line 72
    .line 73
    move-object/from16 v2, p2

    .line 74
    .line 75
    move-object/from16 v9, p4

    .line 76
    .line 77
    move-object/from16 v4, p5

    .line 78
    .line 79
    move/from16 v5, p6

    .line 80
    .line 81
    move-object/from16 v6, p7

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    :goto_2
    invoke-static {v12}, Lr/b0;->a(Li0/h0;)Lr/z;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    int-to-float v3, v3

    .line 89
    new-instance v5, Lp/z0;

    .line 90
    .line 91
    invoke-direct {v5, v3, v3, v3, v3}, Lp/z0;-><init>(FFFF)V

    .line 92
    .line 93
    .line 94
    sget-object v3, Ly0/b;->p:Ly0/f;

    .line 95
    .line 96
    invoke-static {v12}, Lh/g1;->a(Li0/h0;)Li/u;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-virtual {v12, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    if-nez v7, :cond_4

    .line 109
    .line 110
    sget-object v7, Li0/l;->a:Li0/e;

    .line 111
    .line 112
    if-ne v8, v7, :cond_5

    .line 113
    .line 114
    :cond_4
    new-instance v8, Lm/p;

    .line 115
    .line 116
    invoke-direct {v8, v6}, Lm/p;-><init>(Li/u;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_5
    move-object v6, v8

    .line 123
    check-cast v6, Lm/p;

    .line 124
    .line 125
    invoke-static {v12}, Lk/m1;->a(Li0/h0;)Lk/k1;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    and-int/2addr v0, v2

    .line 130
    move-object v9, v3

    .line 131
    move-object v2, v5

    .line 132
    move v5, v4

    .line 133
    move-object v4, v6

    .line 134
    move-object v6, v7

    .line 135
    :goto_3
    invoke-virtual {v12}, Li0/h0;->q()V

    .line 136
    .line 137
    .line 138
    shr-int/lit8 v0, v0, 0x12

    .line 139
    .line 140
    and-int/lit16 v0, v0, 0x1c00

    .line 141
    .line 142
    const/16 v3, 0x1b0

    .line 143
    .line 144
    or-int v14, v3, v0

    .line 145
    .line 146
    const/16 v15, 0x700

    .line 147
    .line 148
    const/4 v3, 0x0

    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v8, 0x0

    .line 151
    const v13, 0x186d86

    .line 152
    .line 153
    .line 154
    move-object/from16 v0, p0

    .line 155
    .line 156
    move-object v11, v10

    .line 157
    move-object/from16 v10, p3

    .line 158
    .line 159
    invoke-static/range {v0 .. v15}, La7/a;->a(Ly0/o;Lr/z;Lp/x0;ZLm/p;ZLk/k1;Ly0/e;Lp/i;Ly0/f;Lp/g;Lfg/l;Li0/h0;III)V

    .line 160
    .line 161
    .line 162
    move-object v3, v9

    .line 163
    move-object v9, v6

    .line 164
    move-object v6, v3

    .line 165
    move-object v3, v1

    .line 166
    move-object v7, v4

    .line 167
    move v8, v5

    .line 168
    move-object v4, v2

    .line 169
    goto :goto_4

    .line 170
    :cond_6
    invoke-virtual/range {p9 .. p9}, Li0/h0;->V()V

    .line 171
    .line 172
    .line 173
    move-object/from16 v3, p1

    .line 174
    .line 175
    move-object/from16 v4, p2

    .line 176
    .line 177
    move-object/from16 v6, p4

    .line 178
    .line 179
    move-object/from16 v7, p5

    .line 180
    .line 181
    move/from16 v8, p6

    .line 182
    .line 183
    move-object/from16 v9, p7

    .line 184
    .line 185
    :goto_4
    invoke-virtual/range {p9 .. p9}, Li0/h0;->t()Li0/r1;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-eqz v0, :cond_7

    .line 190
    .line 191
    new-instance v1, Lr/b;

    .line 192
    .line 193
    move-object/from16 v2, p0

    .line 194
    .line 195
    move-object/from16 v5, p3

    .line 196
    .line 197
    move-object/from16 v10, p8

    .line 198
    .line 199
    move/from16 v11, p10

    .line 200
    .line 201
    invoke-direct/range {v1 .. v11}, Lr/b;-><init>(Ly0/o;Lr/z;Lp/x0;Lp/g;Ly0/f;Lm/p;ZLk/k1;Lfg/l;I)V

    .line 202
    .line 203
    .line 204
    iput-object v1, v0, Li0/r1;->d:Lfg/p;

    .line 205
    .line 206
    :cond_7
    return-void
.end method

.method public static c0(Lud/h;)Lud/p;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p0}, Lud/h;->g()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    :goto_0
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lud/p;

    .line 27
    .line 28
    return-object p0
.end method

.method public static c1(Lud/r;Lud/a;Lud/a;Ljava/util/function/Consumer;)V
    .locals 4

    .line 1
    invoke-interface {p3, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    if-ne p1, p2, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p1, Lud/a;->o:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p3, p2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-static {p0}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v0, Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lud/a;

    .line 36
    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    iget-object p1, p1, Lud/a;->o:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_6

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lud/a;

    .line 57
    .line 58
    if-ne v1, p2, :cond_5

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p3}, Ljava/util/ArrayDeque;->forEach(Ljava/util/function/Consumer;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_5
    iget v2, v1, Lud/a;->j:I

    .line 71
    .line 72
    invoke-virtual {p0, v2}, Ljava/util/BitSet;->get(I)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_4

    .line 77
    .line 78
    invoke-virtual {p0, v2}, Ljava/util/BitSet;->set(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    :goto_1
    return-void
.end method

.method public static final d(FF)J
    .locals 4

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-long v0, p0

    .line 6
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    int-to-long p0, p0

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shl-long/2addr v0, v2

    .line 14
    const-wide v2, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p0, v2

    .line 20
    or-long/2addr p0, v0

    .line 21
    return-wide p0
.end method

.method public static d0(Lud/a;)Lud/a;
    .locals 1

    .line 1
    iget-object p0, p0, Lud/a;->o:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lud/a;

    .line 17
    .line 18
    return-object p0
.end method

.method public static d1(Lud/r;Lud/a;Ljava/util/function/Function;Ljava/util/function/Consumer;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/BitSet;

    .line 7
    .line 8
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-direct {v1, p0}, Ljava/util/BitSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget p0, p1, Lud/a;->j:I

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/util/BitSet;->set(I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lud/a;

    .line 30
    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-interface {p2, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/lit8 v2, v2, -0x1

    .line 46
    .line 47
    :goto_1
    if-ltz v2, :cond_2

    .line 48
    .line 49
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Lud/a;

    .line 54
    .line 55
    iget v4, v3, Lud/a;->j:I

    .line 56
    .line 57
    invoke-virtual {v1, v4}, Ljava/util/BitSet;->get(I)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-virtual {v1, v4}, Ljava/util/BitSet;->set(I)V

    .line 62
    .line 63
    .line 64
    if-nez v5, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    :goto_2
    if-nez p0, :cond_3

    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    invoke-interface {p3, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0
.end method

.method public static e0(Lud/a;)Lud/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lud/a;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lud/a;->m:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-le v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p0, p0, Lud/a;->o:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lud/a;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method

.method public static final f(Ls1/k0;Lyf/a;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lh0/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lh0/z;

    .line 7
    .line 8
    iget v1, v0, Lh0/z;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lh0/z;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lh0/z;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lh0/z;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lh0/z;->i:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Lh0/z;->g:Ls1/k0;

    .line 35
    .line 36
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :goto_1
    iput-object p0, v0, Lh0/z;->g:Ls1/k0;

    .line 51
    .line 52
    iput v2, v0, Lh0/z;->i:I

    .line 53
    .line 54
    sget-object p1, Ls1/l;->h:Ls1/l;

    .line 55
    .line 56
    invoke-virtual {p0, p1, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget-object v1, Lxf/a;->g:Lxf/a;

    .line 61
    .line 62
    if-ne p1, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    :goto_2
    check-cast p1, Ls1/k;

    .line 66
    .line 67
    iget-object v1, p1, Ls1/k;->a:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const/4 v4, 0x0

    .line 74
    :goto_3
    if-ge v4, v3, :cond_5

    .line 75
    .line 76
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Ls1/t;

    .line 81
    .line 82
    invoke-static {v5}, Ls1/s;->a(Ls1/t;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-nez v5, :cond_4

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    return-object p1
.end method

.method public static f0(Lud/r;)Lud/p;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lud/r;->p:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    move-object v0, v1

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_4

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lud/a;

    .line 25
    .line 26
    iget-object v2, v2, Lud/a;->l:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v4, 0x1

    .line 36
    if-le v3, v4, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    if-eqz v0, :cond_3

    .line 40
    .line 41
    :goto_1
    return-object v1

    .line 42
    :cond_3
    const/4 v0, 0x0

    .line 43
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lud/p;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    return-object v0
.end method

.method public static final g(Ls1/k0;Lyf/a;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La0/a;

    .line 7
    .line 8
    iget v1, v0, La0/a;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La0/a;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La0/a;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La0/a;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, La0/a;->i:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, La0/a;->g:Ls1/k0;

    .line 35
    .line 36
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_1
    iput-object p0, v0, La0/a;->g:Ls1/k0;

    .line 51
    .line 52
    iput v2, v0, La0/a;->i:I

    .line 53
    .line 54
    sget-object p1, Ls1/l;->h:Ls1/l;

    .line 55
    .line 56
    invoke-virtual {p0, p1, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget-object v1, Lxf/a;->g:Lxf/a;

    .line 61
    .line 62
    if-ne p1, v1, :cond_4

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_4
    :goto_2
    check-cast p1, Ls1/k;

    .line 66
    .line 67
    iget v1, p1, Ls1/k;->d:I

    .line 68
    .line 69
    iget-object p1, p1, Ls1/k;->a:Ljava/lang/Object;

    .line 70
    .line 71
    and-int/lit8 v1, v1, 0x42

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    const/4 v3, 0x0

    .line 80
    move v4, v3

    .line 81
    :goto_3
    if-ge v4, v1, :cond_6

    .line 82
    .line 83
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    check-cast v5, Ls1/t;

    .line 88
    .line 89
    invoke-static {v5}, Ls1/s;->a(Ls1/t;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-nez v5, :cond_5

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method

.method public static g0(Lud/r;Ljava/util/List;)Lud/a;
    .locals 8

    .line 1
    invoke-static {p0}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x1

    .line 14
    move v4, v3

    .line 15
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-eqz v5, :cond_1

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Lud/a;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/BitSet;->clear()V

    .line 28
    .line 29
    .line 30
    iget v6, v5, Lud/a;->j:I

    .line 31
    .line 32
    invoke-virtual {v1, v6}, Ljava/util/BitSet;->set(I)V

    .line 33
    .line 34
    .line 35
    iget-object v5, v5, Lud/a;->r:Ljava/util/BitSet;

    .line 36
    .line 37
    invoke-virtual {v1, v5}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 38
    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 43
    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->and(Ljava/util/BitSet;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-object v1, p0, Lud/r;->C:Lud/a;

    .line 52
    .line 53
    iget v1, v1, Lud/a;->j:I

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->clear(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/util/BitSet;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    const/4 v2, 0x0

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-static {p0, v0}, La/a;->r(Lud/r;Ljava/util/BitSet;)Lud/a;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    invoke-static {p0}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v4, p0, Lud/r;->C:Lud/a;

    .line 78
    .line 79
    iget v4, v4, Lud/a;->j:I

    .line 80
    .line 81
    invoke-virtual {v1, v4}, Ljava/util/BitSet;->set(I)V

    .line 82
    .line 83
    .line 84
    iget-object v4, p0, Lud/r;->F:Ljava/util/List;

    .line 85
    .line 86
    new-instance v5, Lxe/d;

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    invoke-direct {v5, v6, v1}, Lxe/d;-><init>(ILjava/util/BitSet;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v4, v5}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 93
    .line 94
    .line 95
    iget-object v4, p0, Lud/r;->E:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-nez v4, :cond_4

    .line 102
    .line 103
    iget-object v4, p0, Lud/r;->E:Ljava/util/List;

    .line 104
    .line 105
    new-instance v5, Lbe/w;

    .line 106
    .line 107
    const/16 v6, 0xd

    .line 108
    .line 109
    invoke-direct {v5, p0, v6, v1}, Lbe/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v4, v5}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p0, v0}, La/a;->r(Lud/r;Ljava/util/BitSet;)Lud/a;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-eqz v4, :cond_5

    .line 123
    .line 124
    return-object v4

    .line 125
    :cond_5
    invoke-static {p0}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    iget-object v5, p0, Lud/r;->z:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    :goto_1
    new-instance v6, Lxe/d;

    .line 136
    .line 137
    const/4 v7, 0x1

    .line 138
    invoke-direct {v6, v7, v4}, Lxe/d;-><init>(ILjava/util/BitSet;)V

    .line 139
    .line 140
    .line 141
    invoke-static {p0, v0, v6}, La/a;->L(Lud/r;Ljava/util/BitSet;Ljava/util/function/Consumer;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, v1}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/util/BitSet;->cardinality()I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-ne v6, v3, :cond_6

    .line 152
    .line 153
    invoke-static {p0, v4}, La/a;->r(Lud/r;Ljava/util/BitSet;)Lud/a;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :cond_6
    if-nez v6, :cond_7

    .line 159
    .line 160
    :goto_2
    return-object v2

    .line 161
    :cond_7
    add-int/lit8 v6, v5, -0x1

    .line 162
    .line 163
    if-gez v5, :cond_8

    .line 164
    .line 165
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iget-object v0, p0, Lud/r;->z:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    new-instance v1, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v3, "Path cross not found for "

    .line 178
    .line 179
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string p1, ", limit reached: "

    .line 186
    .line 187
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p0, p1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    return-object v2

    .line 201
    :cond_8
    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v4}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4}, Ljava/util/BitSet;->clear()V

    .line 208
    .line 209
    .line 210
    move v5, v6

    .line 211
    goto :goto_1
.end method

.method public static h0(Lud/r;Lud/a;Lud/a;)Lud/a;
    .locals 0

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    if-eqz p1, :cond_2

    .line 5
    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    filled-new-array {p1, p2}, [Lud/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p0, p1}, La/a;->g0(Lud/r;Ljava/util/List;)Lud/a;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static final i(Ls1/k0;Lw/y0;Ls1/k;ILyf/a;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p4, Lh0/c0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lh0/c0;

    .line 7
    .line 8
    iget v1, v0, Lh0/c0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lh0/c0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lh0/c0;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lh0/c0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lh0/c0;->l:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v5, :cond_2

    .line 39
    .line 40
    if-ne v1, v4, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lh0/c0;->h:Lw/y0;

    .line 43
    .line 44
    iget-object p0, v0, Lh0/c0;->g:Ls1/k0;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :catch_0
    move-exception p0

    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_2
    iget-wide p0, v0, Lh0/c0;->j:J

    .line 62
    .line 63
    iget-object p2, v0, Lh0/c0;->i:Lgg/t;

    .line 64
    .line 65
    iget-object p3, v0, Lh0/c0;->h:Lw/y0;

    .line 66
    .line 67
    iget-object v1, v0, Lh0/c0;->g:Ls1/k0;

    .line 68
    .line 69
    :try_start_1
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 70
    .line 71
    .line 72
    move-wide v7, p0

    .line 73
    move-object p1, p3

    .line 74
    move-object p0, v1

    .line 75
    goto :goto_2

    .line 76
    :catch_1
    move-exception p0

    .line 77
    move-object p1, p3

    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_3
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :try_start_2
    iget-object p2, p2, Ls1/k;->a:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {p2}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    check-cast p2, Ls1/t;

    .line 90
    .line 91
    iget-wide v7, p2, Ls1/t;->a:J

    .line 92
    .line 93
    iget-wide v9, p2, Ls1/t;->c:J

    .line 94
    .line 95
    if-le p3, v4, :cond_4

    .line 96
    .line 97
    sget-object p2, Lh0/w;->f:Lg1/d;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    sget-object p2, Lh0/w;->e:Lg1/d;

    .line 101
    .line 102
    :goto_1
    invoke-interface {p1, v9, v10, p2}, Lw/y0;->a(JLg1/d;)V

    .line 103
    .line 104
    .line 105
    new-instance p2, Lgg/t;

    .line 106
    .line 107
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 108
    .line 109
    .line 110
    const-wide p3, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    iput-wide p3, p2, Lgg/t;->g:J

    .line 116
    .line 117
    invoke-virtual {p0}, Ls1/k0;->B()Ly1/l2;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-interface {p3}, Ly1/l2;->b()J

    .line 122
    .line 123
    .line 124
    move-result-wide p3

    .line 125
    new-instance v1, Lh0/d0;

    .line 126
    .line 127
    invoke-direct {v1, v7, v8, p2, v2}, Lh0/d0;-><init>(JLgg/t;Lwf/c;)V

    .line 128
    .line 129
    .line 130
    iput-object p0, v0, Lh0/c0;->g:Ls1/k0;

    .line 131
    .line 132
    iput-object p1, v0, Lh0/c0;->h:Lw/y0;

    .line 133
    .line 134
    iput-object p2, v0, Lh0/c0;->i:Lgg/t;

    .line 135
    .line 136
    iput-wide v7, v0, Lh0/c0;->j:J

    .line 137
    .line 138
    iput v5, v0, Lh0/c0;->l:I

    .line 139
    .line 140
    invoke-virtual {p0, p3, p4, v1, v0}, Ls1/k0;->E(JLfg/p;Lyf/a;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p4

    .line 144
    if-ne p4, v6, :cond_5

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    :goto_2
    check-cast p4, Lh0/j;

    .line 148
    .line 149
    if-nez p4, :cond_6

    .line 150
    .line 151
    sget-object p4, Lh0/j;->i:Lh0/j;

    .line 152
    .line 153
    :cond_6
    sget-object p3, Lh0/j;->j:Lh0/j;

    .line 154
    .line 155
    if-ne p4, p3, :cond_7

    .line 156
    .line 157
    invoke-interface {p1}, Lw/y0;->onCancel()V

    .line 158
    .line 159
    .line 160
    return-object v3

    .line 161
    :cond_7
    sget-object p3, Lh0/j;->g:Lh0/j;

    .line 162
    .line 163
    if-ne p4, p3, :cond_8

    .line 164
    .line 165
    invoke-interface {p1}, Lw/y0;->b()V

    .line 166
    .line 167
    .line 168
    return-object v3

    .line 169
    :cond_8
    sget-object p3, Lh0/j;->h:Lh0/j;

    .line 170
    .line 171
    if-ne p4, p3, :cond_9

    .line 172
    .line 173
    iget-wide p2, p2, Lgg/t;->g:J

    .line 174
    .line 175
    invoke-interface {p1, p2, p3}, Lw/y0;->e(J)V

    .line 176
    .line 177
    .line 178
    :cond_9
    new-instance p2, Lh0/y;

    .line 179
    .line 180
    const/4 p3, 0x1

    .line 181
    invoke-direct {p2, p1, p3}, Lh0/y;-><init>(Lw/y0;I)V

    .line 182
    .line 183
    .line 184
    iput-object p0, v0, Lh0/c0;->g:Ls1/k0;

    .line 185
    .line 186
    iput-object p1, v0, Lh0/c0;->h:Lw/y0;

    .line 187
    .line 188
    iput-object v2, v0, Lh0/c0;->i:Lgg/t;

    .line 189
    .line 190
    iput v4, v0, Lh0/c0;->l:I

    .line 191
    .line 192
    invoke-static {p0, v7, v8, p2, v0}, Lm/j0;->d(Ls1/k0;JLfg/l;Lyf/a;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p4

    .line 196
    if-ne p4, v6, :cond_a

    .line 197
    .line 198
    :goto_3
    return-object v6

    .line 199
    :cond_a
    :goto_4
    check-cast p4, Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    if-eqz p2, :cond_d

    .line 206
    .line 207
    iget-object p0, p0, Ls1/k0;->l:Ls1/l0;

    .line 208
    .line 209
    iget-object p0, p0, Ls1/l0;->z:Ls1/k;

    .line 210
    .line 211
    iget-object p0, p0, Ls1/k;->a:Ljava/lang/Object;

    .line 212
    .line 213
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    const/4 p3, 0x0

    .line 218
    :goto_5
    if-ge p3, p2, :cond_c

    .line 219
    .line 220
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p4

    .line 224
    check-cast p4, Ls1/t;

    .line 225
    .line 226
    invoke-static {p4}, Ls1/s;->c(Ls1/t;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_b

    .line 231
    .line 232
    invoke-virtual {p4}, Ls1/t;->a()V

    .line 233
    .line 234
    .line 235
    :cond_b
    add-int/lit8 p3, p3, 0x1

    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_c
    invoke-interface {p1}, Lw/y0;->b()V

    .line 239
    .line 240
    .line 241
    return-object v3

    .line 242
    :cond_d
    invoke-interface {p1}, Lw/y0;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 243
    .line 244
    .line 245
    return-object v3

    .line 246
    :goto_6
    invoke-interface {p1}, Lw/y0;->onCancel()V

    .line 247
    .line 248
    .line 249
    throw p0
.end method

.method public static i0(Lud/r;Lud/a;Lud/a;)Lud/a;
    .locals 7

    .line 1
    iget-object p1, p1, Lud/a;->m:Ljava/util/List;

    .line 2
    .line 3
    new-instance v0, Lze/c;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lze/c;-><init>(Lud/r;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lae/g;

    .line 9
    .line 10
    const/4 v2, 0x6

    .line 11
    invoke-direct {v1, v0, v2}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 15
    .line 16
    .line 17
    iget p1, p2, Lud/a;->j:I

    .line 18
    .line 19
    iget-object v0, v0, Lze/c;->h:Ljava/util/BitSet;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    return-object p2

    .line 28
    :cond_0
    new-instance p1, Ljava/util/ArrayDeque;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v1, Ljava/util/BitSet;

    .line 34
    .line 35
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-direct {v1, p0}, Ljava/util/BitSet;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget p0, p2, Lud/a;->j:I

    .line 48
    .line 49
    invoke-virtual {v1, p0}, Ljava/util/BitSet;->set(I)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Lud/a;

    .line 57
    .line 58
    const/4 p2, 0x0

    .line 59
    if-nez p0, :cond_2

    .line 60
    .line 61
    move-object p0, p2

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iget-object v2, p0, Lud/a;->o:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/lit8 v3, v3, -0x1

    .line 70
    .line 71
    :goto_0
    if-ltz v3, :cond_4

    .line 72
    .line 73
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lud/a;

    .line 78
    .line 79
    iget v5, v4, Lud/a;->j:I

    .line 80
    .line 81
    invoke-virtual {v1, v5}, Ljava/util/BitSet;->get(I)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    invoke-virtual {v1, v5}, Ljava/util/BitSet;->set(I)V

    .line 86
    .line 87
    .line 88
    if-nez v6, :cond_3

    .line 89
    .line 90
    invoke-virtual {p1, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    add-int/lit8 v3, v3, -0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    :goto_1
    if-nez p0, :cond_5

    .line 97
    .line 98
    return-object p2

    .line 99
    :cond_5
    iget p2, p0, Lud/a;->j:I

    .line 100
    .line 101
    invoke-virtual {v0, p2}, Ljava/util/BitSet;->get(I)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-eqz p2, :cond_1

    .line 106
    .line 107
    return-object p0
.end method

.method public static j(Ljava/util/HashSet;Lud/a;Lud/a;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lud/a;->m:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lud/a;

    .line 21
    .line 22
    if-eq v0, p2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    invoke-static {p0, v0, p2}, La/a;->j(Ljava/util/HashSet;Lud/a;Lud/a;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public static j0(Lud/a;)Lud/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lud/a;->m:Ljava/util/List;

    .line 2
    .line 3
    sget-object v1, Lmd/a;->A:Lmd/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, La/a;->U(Ljava/util/List;Lmd/a;)Lud/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Can\'t find top splitter block for handler:"

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static varargs k([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v1, Ltf/j;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v2}, Ltf/j;-><init>([Ljava/lang/Object;Z)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static k0(Lae/f;Lud/r;)Lud/a;
    .locals 9

    .line 1
    iget-object v0, p0, Lae/f;->c:Lud/a;

    .line 2
    .line 3
    invoke-static {v0}, La/a;->j0(Lud/a;)Lud/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object p0, p0, Lae/f;->g:Lae/h;

    .line 8
    .line 9
    iget-object p0, p0, Lae/h;->h:Ljava/util/List;

    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v0, v0, Lud/a;->r:Ljava/util/BitSet;

    .line 14
    .line 15
    invoke-static {p1, v0}, La/a;->q(Lud/r;Ljava/util/BitSet;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_3

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lud/a;

    .line 38
    .line 39
    iget v4, v3, Lud/a;->j:I

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Ljava/util/BitSet;->get(I)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget v4, v3, Lud/a;->j:I

    .line 49
    .line 50
    invoke-virtual {v0, v4}, Ljava/util/BitSet;->set(I)V

    .line 51
    .line 52
    .line 53
    iget-object v4, v3, Lud/a;->m:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_2

    .line 64
    .line 65
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lud/a;

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    new-instance v7, Lce/o;

    .line 76
    .line 77
    const/4 v8, 0x4

    .line 78
    invoke-direct {v7, v5, v8}, Lce/o;-><init>(Lud/a;I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v6, v7}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-nez v6, :cond_1

    .line 86
    .line 87
    invoke-static {v1, v5}, La/a;->s0(Lud/a;Lud/a;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_1

    .line 92
    .line 93
    iget-object v5, p1, Lud/r;->C:Lud/a;

    .line 94
    .line 95
    if-eq v3, v5, :cond_1

    .line 96
    .line 97
    return-object v3

    .line 98
    :cond_2
    iget-object v3, v3, Lud/a;->r:Ljava/util/BitSet;

    .line 99
    .line 100
    invoke-static {p1, v3}, La/a;->q(Lud/r;Ljava/util/BitSet;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    const/4 p0, 0x0

    .line 109
    return-object p0
.end method

.method public static l(Ljava/io/File;Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, "."

    .line 12
    .line 13
    const-string v4, ".agent.tmp"

    .line 14
    .line 15
    invoke-static {v3, v2, v4}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/io/FileOutputStream;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 50
    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {p1, v1}, Landroid/system/Os;->rename(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    invoke-virtual {v0, p0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    return-void

    .line 72
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 73
    .line 74
    .line 75
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string v1, "\u5199\u5165 "

    .line 82
    .line 83
    const-string v2, " \u5931\u8d25"

    .line 84
    .line 85
    invoke-static {v1, p0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-direct {v0, p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :catchall_1
    move-exception p0

    .line 94
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 95
    :catchall_2
    move-exception p1

    .line 96
    invoke-static {v1, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

.method public static l0(Ljava/util/List;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lxe/s;->h(Ljava/util/Collection;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lud/a;

    .line 23
    .line 24
    iget-object v0, v0, Lud/a;->l:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public static final m(Ls1/k0;Ls1/l;Lyf/a;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lm/u0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lm/u0;

    .line 7
    .line 8
    iget v1, v0, Lm/u0;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lm/u0;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/u0;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lm/u0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/u0;->j:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lm/u0;->h:Ls1/l;

    .line 36
    .line 37
    iget-object p1, v0, Lm/u0;->g:Ls1/k0;

    .line 38
    .line 39
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v6, p1

    .line 43
    move-object p1, p0

    .line 44
    move-object p0, v6

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, Ls1/k0;->l:Ls1/l0;

    .line 57
    .line 58
    iget-object p2, p2, Ls1/l0;->z:Ls1/k;

    .line 59
    .line 60
    iget-object p2, p2, Ls1/k;->a:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    move v4, v2

    .line 67
    :goto_1
    if-ge v4, v1, :cond_6

    .line 68
    .line 69
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Ls1/t;

    .line 74
    .line 75
    iget-boolean v5, v5, Ls1/t;->d:Z

    .line 76
    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    :goto_2
    iput-object p0, v0, Lm/u0;->g:Ls1/k0;

    .line 80
    .line 81
    iput-object p1, v0, Lm/u0;->h:Ls1/l;

    .line 82
    .line 83
    iput v3, v0, Lm/u0;->j:I

    .line 84
    .line 85
    invoke-virtual {p0, p1, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    sget-object v1, Lxf/a;->g:Lxf/a;

    .line 90
    .line 91
    if-ne p2, v1, :cond_3

    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_3
    :goto_3
    check-cast p2, Ls1/k;

    .line 95
    .line 96
    iget-object p2, p2, Ls1/k;->a:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    move v4, v2

    .line 103
    :goto_4
    if-ge v4, v1, :cond_6

    .line 104
    .line 105
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Ls1/t;

    .line 110
    .line 111
    iget-boolean v5, v5, Ls1/t;->d:Z

    .line 112
    .line 113
    if-eqz v5, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_6
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 123
    .line 124
    return-object p0
.end method

.method public static m0(Lud/a;Lud/a;)Z
    .locals 2

    .line 1
    if-eq p0, p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p1, Lud/a;->p:Ljava/util/BitSet;

    .line 4
    .line 5
    iget v1, p0, Lud/a;->j:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lud/a;->n:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lud/a;->m:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    return v1

    .line 32
    :cond_1
    new-instance v0, Ljava/util/BitSet;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, p1, v0, v1}, La/a;->V0(Lud/a;Lud/a;Ljava/util/BitSet;Z)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public static final n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p2}, Lwf/c;->getContext()Lwf/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ld9/k;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v0, p1, v2}, Ld9/k;-><init>(Lwf/g;Lfg/p;Lwf/c;)V

    .line 9
    .line 10
    .line 11
    check-cast p0, Ls1/l0;

    .line 12
    .line 13
    invoke-virtual {p0, v1, p2}, Ls1/l0;->k1(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 23
    .line 24
    return-object p0
.end method

.method public static n0(Lud/a;Lud/a;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lud/a;->n:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-ne v0, v2, :cond_5

    .line 10
    .line 11
    iget-object v0, p1, Lud/a;->n:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ne v0, v2, :cond_5

    .line 18
    .line 19
    iget-object v0, p0, Lud/a;->n:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lud/a;

    .line 26
    .line 27
    iget-object v3, p1, Lud/a;->n:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v0, v3}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_5

    .line 38
    .line 39
    iget-object p0, p0, Lud/a;->l:Ljava/util/ArrayList;

    .line 40
    .line 41
    iget-object p1, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eq v0, v3, :cond_0

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    move v3, v1

    .line 59
    :goto_0
    if-ge v3, v0, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lud/p;

    .line 66
    .line 67
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Lud/p;

    .line 72
    .line 73
    if-ne v4, v5, :cond_1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    invoke-virtual {v4, v5}, Lud/p;->Y(Lud/p;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_5

    .line 81
    .line 82
    iget-object v6, v4, Lud/p;->m:Ljava/util/List;

    .line 83
    .line 84
    iget-object v7, v5, Lud/p;->m:Ljava/util/List;

    .line 85
    .line 86
    invoke-static {v6, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_5

    .line 91
    .line 92
    iget-object v4, v4, Lud/p;->l:Lqd/r;

    .line 93
    .line 94
    iget-object v5, v5, Lud/p;->l:Lqd/r;

    .line 95
    .line 96
    if-eqz v4, :cond_3

    .line 97
    .line 98
    if-nez v5, :cond_2

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    iget v4, v4, Lqd/r;->l:I

    .line 102
    .line 103
    iget v5, v5, Lqd/r;->l:I

    .line 104
    .line 105
    if-ne v4, v5, :cond_5

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    :goto_1
    if-ne v4, v5, :cond_5

    .line 109
    .line 110
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    return v2

    .line 114
    :cond_5
    :goto_3
    return v1
.end method

.method public static o(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x7f

    .line 6
    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static o0(Lud/a;Lud/a;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p0, :cond_5

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_1
    invoke-static {p0, p1}, La/a;->p0(Lud/a;Lud/a;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_4

    .line 16
    .line 17
    invoke-static {p0}, La/a;->K(Lud/a;)Lud/a;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {p1}, La/a;->K(Lud/a;)Lud/a;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eq v2, v3, :cond_4

    .line 26
    .line 27
    invoke-static {v2, v3}, La/a;->p0(Lud/a;Lud/a;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p0, p1}, La/a;->n0(Lud/a;Lud/a;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    return v1

    .line 42
    :cond_4
    :goto_0
    return v0

    .line 43
    :cond_5
    :goto_1
    return v1
.end method

.method public static p(Ljava/util/ArrayList;Ljava/lang/Comparable;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, ")."

    .line 14
    .line 15
    if-ltz v0, :cond_4

    .line 16
    .line 17
    if-gt v0, v1, :cond_3

    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    :goto_0
    if-gt v2, v0, :cond_2

    .line 22
    .line 23
    add-int v1, v2, v0

    .line 24
    .line 25
    ushr-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/Comparable;

    .line 32
    .line 33
    invoke-static {v3, p1}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-gez v3, :cond_0

    .line 38
    .line 39
    add-int/lit8 v2, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    if-lez v3, :cond_1

    .line 43
    .line 44
    add-int/lit8 v0, v1, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return v1

    .line 48
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    neg-int p0, v2

    .line 51
    return p0

    .line 52
    :cond_3
    const-string p0, "toIndex ("

    .line 53
    .line 54
    const-string p1, ") is greater than size ("

    .line 55
    .line 56
    invoke-static {v0, v1, p0, p1, v3}, Leh/a;->k(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Lokio/a;->i(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return p0

    .line 65
    :cond_4
    const-string p0, ") is greater than toIndex ("

    .line 66
    .line 67
    const-string p1, "fromIndex ("

    .line 68
    .line 69
    invoke-static {v2, v0, p1, p0, v3}, Leh/a;->k(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 p0, 0x0

    .line 77
    return p0
.end method

.method public static p0(Lud/a;Lud/a;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    sget-object v1, Lmd/a;->n:Lmd/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_7

    .line 11
    .line 12
    iget-object v0, p1, Lmd/e;->g:Lmd/f;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget-object p0, p0, Lud/a;->l:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object p1, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x1

    .line 30
    if-ne v0, v1, :cond_7

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eq v0, v1, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lud/p;

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lud/p;

    .line 50
    .line 51
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v3, p1, Lud/p;->m:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eq v0, v3, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-virtual {p0, v2}, Lud/p;->S(I)Lqd/l;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1, v2}, Lud/p;->S(I)Lqd/l;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v0}, Lqd/l;->K()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_4

    .line 88
    .line 89
    invoke-virtual {v3}, Lqd/l;->K()Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_4

    .line 94
    .line 95
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    goto :goto_0

    .line 100
    :cond_4
    move v4, v2

    .line 101
    :goto_0
    if-eqz v4, :cond_5

    .line 102
    .line 103
    :goto_1
    return v1

    .line 104
    :cond_5
    iget p0, p0, Lnd/r;->i:I

    .line 105
    .line 106
    iget p1, p1, Lnd/r;->i:I

    .line 107
    .line 108
    if-eq p0, p1, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_6
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    return p0

    .line 116
    :cond_7
    :goto_2
    return v2
.end method

.method public static q(Lud/r;Ljava/util/BitSet;)Ljava/util/List;
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    sget-object v0, Lxe/g;->g:Lxe/g;

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/BitSet;->cardinality()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ltz v0, :cond_2

    .line 28
    .line 29
    iget-object v2, p0, Lud/r;->z:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lud/a;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-object v1

    .line 44
    :cond_3
    :goto_1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 45
    .line 46
    return-object p0
.end method

.method public static q0(Lud/a;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    sget-object v1, Lmd/b;->E:Lmd/b;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lmd/f;->b(Loc/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    sget-object v0, Lmd/a;->B:Lmd/a;

    .line 13
    .line 14
    iget-object v3, p0, Lmd/e;->g:Lmd/f;

    .line 15
    .line 16
    invoke-virtual {v3, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    sget-object v0, Lmd/a;->u:Lmd/a;

    .line 23
    .line 24
    iget-object v3, p0, Lmd/e;->g:Lmd/f;

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v0, Lmd/a;->m:Lmd/a;

    .line 34
    .line 35
    iget-object v3, p0, Lmd/e;->g:Lmd/f;

    .line 36
    .line 37
    invoke-virtual {v3, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v3, 0x0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object p0, p0, Lud/a;->n:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-ne v0, v2, :cond_1

    .line 51
    .line 52
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Lud/a;

    .line 57
    .line 58
    iget-object p0, p0, Lmd/e;->g:Lmd/f;

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lmd/f;->b(Loc/a;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    return v3

    .line 68
    :cond_2
    :goto_0
    return v2
.end method

.method public static r(Lud/r;Ljava/util/BitSet;)Lud/a;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/util/BitSet;->cardinality()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lud/a;

    .line 22
    .line 23
    return-object p0
.end method

.method public static r0(Lud/a;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    sget-object v1, Lmd/a;->k:Lmd/a;

    .line 6
    .line 7
    iget-object v2, p0, Lmd/e;->g:Lmd/f;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    iget-object v1, p0, Lud/a;->m:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne v2, v3, :cond_2

    .line 23
    .line 24
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lud/a;

    .line 29
    .line 30
    sget-object v2, Lmd/a;->l:Lmd/a;

    .line 31
    .line 32
    iget-object v4, v1, Lmd/e;->g:Lmd/f;

    .line 33
    .line 34
    invoke-virtual {v4, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    sget-object v2, Lmd/b;->z:Lmd/b;

    .line 41
    .line 42
    iget-object v4, v1, Lmd/e;->g:Lmd/f;

    .line 43
    .line 44
    invoke-virtual {v4, v2}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Lnd/t;

    .line 63
    .line 64
    iget-object v5, v4, Lnd/t;->a:Lud/a;

    .line 65
    .line 66
    invoke-virtual {v5, p0}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_1

    .line 71
    .line 72
    iget-object v4, v4, Lnd/t;->b:Lud/a;

    .line 73
    .line 74
    invoke-virtual {v4, v1}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_1

    .line 79
    .line 80
    return v3

    .line 81
    :cond_2
    :goto_0
    return v0
.end method

.method public static s(Lud/a;Lud/p;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lud/a;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lud/p;

    .line 18
    .line 19
    if-ne v0, p1, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public static s0(Lud/a;Lud/a;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, p1, :cond_2

    .line 3
    .line 4
    iget-object v1, p1, Lud/a;->p:Ljava/util/BitSet;

    .line 5
    .line 6
    iget v2, p0, Lud/a;->j:I

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    iget-object v1, p0, Lud/a;->o:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, p0, Lud/a;->m:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_1
    new-instance v1, Ljava/util/BitSet;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, p1, v1, v0}, La/a;->V0(Lud/a;Lud/a;Ljava/util/BitSet;Z)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :cond_2
    :goto_0
    return v0
.end method

.method public static t(Luf/c;)Luf/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Luf/c;->g()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Luf/c;->i:Z

    .line 6
    .line 7
    iget v0, p0, Luf/c;->h:I

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Luf/c;->j:Luf/c;

    .line 13
    .line 14
    return-object p0
.end method

.method public static t0(I)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x17

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x16

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x1e

    .line 18
    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x1d

    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    const/16 v0, 0x18

    .line 26
    .line 27
    if-eq p0, v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x15

    .line 30
    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public static u(Lud/a;)Ljava/util/List;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lud/a;->o:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x2

    .line 18
    if-lt v1, v2, :cond_1

    .line 19
    .line 20
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, La/a;->d0(Lud/a;)Lud/a;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :goto_0
    if-eqz p0, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, Lud/a;->o:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-ge v1, v2, :cond_2

    .line 39
    .line 40
    iget-object v1, p0, Lud/a;->m:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v3, 0x1

    .line 47
    if-ne v1, v3, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, La/a;->d0(Lud/a;)Lud/a;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return-object v0
.end method

.method public static u0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    invoke-static {p0}, La/a;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    new-instance v0, Lsf/f;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    instance-of p0, v0, Lsf/f;

    .line 20
    .line 21
    xor-int/lit8 p0, p0, 0x1

    .line 22
    .line 23
    return p0
.end method

.method public static v(Lud/h;Lpd/k;)Z
    .locals 0

    .line 1
    invoke-static {p0}, La/a;->c0(Lud/h;)Lud/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lud/p;->k:Lpd/k;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public static v0(C)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static w(I)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    if-gt v0, p0, :cond_0

    .line 3
    .line 4
    const/16 v1, 0x25

    .line 5
    .line 6
    if-ge p0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v2, "radix "

    .line 12
    .line 13
    const-string v3, " was not in valid range "

    .line 14
    .line 15
    invoke-static {p0, v2, v3}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v2, Llg/d;

    .line 20
    .line 21
    const/16 v3, 0x24

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-direct {v2, v0, v3, v4}, Llg/b;-><init>(III)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public static final w0(Lth/g;FFZF)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lth/c;->c()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_d

    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    cmpg-float v1, p1, v0

    .line 14
    .line 15
    if-lez v1, :cond_13

    .line 16
    .line 17
    cmpg-float v1, p2, v0

    .line 18
    .line 19
    if-gtz v1, :cond_1

    .line 20
    .line 21
    goto/16 :goto_d

    .line 22
    .line 23
    :cond_1
    iget v1, p0, Lth/g;->k:F

    .line 24
    .line 25
    cmpg-float v1, v1, p2

    .line 26
    .line 27
    if-gez v1, :cond_2

    .line 28
    .line 29
    iput p2, p0, Lth/g;->k:F

    .line 30
    .line 31
    :cond_2
    iget-object v1, p0, Lth/g;->H:Lth/i;

    .line 32
    .line 33
    iget-object v1, v1, Lth/i;->B:Lvh/f;

    .line 34
    .line 35
    iget-object v1, v1, Lvh/f;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lfg/a;

    .line 38
    .line 39
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lf1/r0;

    .line 44
    .line 45
    instance-of v2, v1, Lv/d;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    check-cast v1, Lv/d;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    move-object v1, v3

    .line 54
    :goto_0
    const/4 v2, 0x0

    .line 55
    const/4 v4, 0x1

    .line 56
    if-eqz v1, :cond_d

    .line 57
    .line 58
    iget-object v3, v1, Lv/d;->d:Lv/a;

    .line 59
    .line 60
    iget-object v5, v1, Lv/d;->c:Lv/a;

    .line 61
    .line 62
    iget-object v7, v1, Lv/d;->b:Lv/a;

    .line 63
    .line 64
    iget-object v1, v1, Lv/d;->a:Lv/a;

    .line 65
    .line 66
    iget-wide v8, p0, Lth/g;->i:J

    .line 67
    .line 68
    invoke-static {v8, v9}, Le1/e;->b(J)F

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    const/high16 v9, 0x40000000    # 2.0f

    .line 73
    .line 74
    div-float/2addr v8, v9

    .line 75
    iget-object v9, p0, Lth/g;->j:Lu2/m;

    .line 76
    .line 77
    sget-object v10, Lu2/m;->g:Lu2/m;

    .line 78
    .line 79
    if-ne v9, v10, :cond_4

    .line 80
    .line 81
    move v9, v4

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    move v9, v2

    .line 84
    :goto_1
    iget-wide v10, p0, Lth/g;->i:J

    .line 85
    .line 86
    if-eqz v9, :cond_5

    .line 87
    .line 88
    invoke-interface {v1, v10, v11, p0}, Lv/a;->a(JLu2/c;)F

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    goto :goto_2

    .line 93
    :cond_5
    invoke-interface {v7, v10, v11, p0}, Lv/a;->a(JLu2/c;)F

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    :goto_2
    iget-wide v11, p0, Lth/g;->i:J

    .line 98
    .line 99
    if-eqz v9, :cond_6

    .line 100
    .line 101
    invoke-interface {v7, v11, v12, p0}, Lv/a;->a(JLu2/c;)F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    goto :goto_3

    .line 106
    :cond_6
    invoke-interface {v1, v11, v12, p0}, Lv/a;->a(JLu2/c;)F

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    :goto_3
    iget-wide v11, p0, Lth/g;->i:J

    .line 111
    .line 112
    if-eqz v9, :cond_7

    .line 113
    .line 114
    invoke-interface {v5, v11, v12, p0}, Lv/a;->a(JLu2/c;)F

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    goto :goto_4

    .line 119
    :cond_7
    invoke-interface {v3, v11, v12, p0}, Lv/a;->a(JLu2/c;)F

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    :goto_4
    iget-wide v11, p0, Lth/g;->i:J

    .line 124
    .line 125
    if-eqz v9, :cond_8

    .line 126
    .line 127
    invoke-interface {v3, v11, v12, p0}, Lv/a;->a(JLu2/c;)F

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    goto :goto_5

    .line 132
    :cond_8
    invoke-interface {v5, v11, v12, p0}, Lv/a;->a(JLu2/c;)F

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    :goto_5
    cmpl-float v5, v10, v8

    .line 137
    .line 138
    if-lez v5, :cond_9

    .line 139
    .line 140
    move v10, v8

    .line 141
    :cond_9
    cmpl-float v5, v1, v8

    .line 142
    .line 143
    if-lez v5, :cond_a

    .line 144
    .line 145
    move v1, v8

    .line 146
    :cond_a
    cmpl-float v5, v7, v8

    .line 147
    .line 148
    if-lez v5, :cond_b

    .line 149
    .line 150
    move v7, v8

    .line 151
    :cond_b
    cmpl-float v5, v3, v8

    .line 152
    .line 153
    if-lez v5, :cond_c

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_c
    move v8, v3

    .line 157
    :goto_6
    const/4 v3, 0x4

    .line 158
    new-array v3, v3, [F

    .line 159
    .line 160
    aput v10, v3, v2

    .line 161
    .line 162
    aput v1, v3, v4

    .line 163
    .line 164
    const/4 v1, 0x2

    .line 165
    aput v7, v3, v1

    .line 166
    .line 167
    const/4 v1, 0x3

    .line 168
    aput v8, v3, v1

    .line 169
    .line 170
    :cond_d
    if-eqz v3, :cond_13

    .line 171
    .line 172
    cmpl-float v0, p4, v0

    .line 173
    .line 174
    if-lez v0, :cond_e

    .line 175
    .line 176
    move v8, v4

    .line 177
    goto :goto_7

    .line 178
    :cond_e
    move v8, v2

    .line 179
    :goto_7
    if-eqz v8, :cond_f

    .line 180
    .line 181
    const-string v0, "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\nuniform float chromaticAberration;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n\n    float2 refractedCoord = coord + d * grad;\n    float dispersionIntensity = chromaticAberration * ((centeredCoord.x * centeredCoord.y) / (halfSize.x * halfSize.y));\n    float2 dispersedCoord = d * grad * dispersionIntensity;\n\n    half4 color = half4(0.0);\n\n    half4 red = content.eval(refractedCoord + dispersedCoord);\n    color.r += red.r / 3.5;\n    color.a += red.a / 7.0;\n\n    half4 orange = content.eval(refractedCoord + dispersedCoord * (2.0 / 3.0));\n    color.r += orange.r / 3.5;\n    color.g += orange.g / 7.0;\n    color.a += orange.a / 7.0;\n\n    half4 yellow = content.eval(refractedCoord + dispersedCoord * (1.0 / 3.0));\n    color.r += yellow.r / 3.5;\n    color.g += yellow.g / 3.5;\n    color.a += yellow.a / 7.0;\n\n    half4 green = content.eval(refractedCoord);\n    color.g += green.g / 3.5;\n    color.a += green.a / 7.0;\n\n    half4 cyan = content.eval(refractedCoord - dispersedCoord * (1.0 / 3.0));\n    color.g += cyan.g / 3.5;\n    color.b += cyan.b / 3.0;\n    color.a += cyan.a / 7.0;\n\n    half4 blue = content.eval(refractedCoord - dispersedCoord * (2.0 / 3.0));\n    color.b += blue.b / 3.0;\n    color.a += blue.a / 7.0;\n\n    half4 purple = content.eval(refractedCoord - dispersedCoord);\n    color.r += purple.r / 7.0;\n    color.b += purple.b / 3.0;\n    color.a += purple.a / 7.0;\n\n    return color;\n}\n"

    .line 182
    .line 183
    :goto_8
    move-object v10, v0

    .line 184
    goto :goto_9

    .line 185
    :cond_f
    const-string v0, "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n\n    float2 refractedCoord = coord + d * grad;\n    return content.eval(refractedCoord);\n}\n"

    .line 186
    .line 187
    goto :goto_8

    .line 188
    :goto_9
    if-eqz v8, :cond_10

    .line 189
    .line 190
    const-string v0, "HchatLiquidGlassLensDispersion"

    .line 191
    .line 192
    :goto_a
    move-object v11, v0

    .line 193
    goto :goto_b

    .line 194
    :cond_10
    const-string v0, "HchatLiquidGlassLens"

    .line 195
    .line 196
    goto :goto_a

    .line 197
    :goto_b
    iget v0, p0, Lth/g;->m:I

    .line 198
    .line 199
    if-ge v0, v4, :cond_11

    .line 200
    .line 201
    goto :goto_c

    .line 202
    :cond_11
    move v4, v0

    .line 203
    :goto_c
    int-to-float v2, v4

    .line 204
    iget v0, p0, Lth/g;->k:F

    .line 205
    .line 206
    div-float/2addr v0, v2

    .line 207
    move-object v4, v3

    .line 208
    move v3, v0

    .line 209
    new-instance v0, Lwb/r4;

    .line 210
    .line 211
    move-object v1, p0

    .line 212
    move v5, p1

    .line 213
    move v6, p2

    .line 214
    move/from16 v7, p3

    .line 215
    .line 216
    move/from16 v9, p4

    .line 217
    .line 218
    invoke-direct/range {v0 .. v9}, Lwb/r4;-><init>(Lth/g;FF[FFFZZF)V

    .line 219
    .line 220
    .line 221
    invoke-static {}, Lth/c;->c()Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-nez p1, :cond_12

    .line 226
    .line 227
    goto :goto_d

    .line 228
    :cond_12
    invoke-virtual {p0, v11, v10}, Lth/g;->e(Ljava/lang/String;Ljava/lang/String;)Lai/b;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {v0, p1}, Lwb/r4;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    const-string v0, "content"

    .line 236
    .line 237
    invoke-static {p1, v0}, Lac/p;->L(Lai/b;Ljava/lang/String;)Lf1/m;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    iget-object v0, p0, Lth/g;->l:Lf1/n0;

    .line 242
    .line 243
    invoke-static {v0, p1}, Lac/p;->i(Lf1/n0;Lf1/n0;)Lf1/n0;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    iput-object p1, p0, Lth/g;->l:Lf1/n0;

    .line 248
    .line 249
    :cond_13
    :goto_d
    return-void
.end method

.method public static x(II)V
    .locals 0

    .line 1
    if-le p0, p1, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string p1, "Invalid value_arg value %d for an encoded_value. Expecting 0"

    .line 14
    .line 15
    invoke-static {p1, p0}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string p1, "Invalid value_arg value %d for an encoded_value. Expecting 0..%d, inclusive"

    .line 32
    .line 33
    invoke-static {p1, p0}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public static x0(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public static y(Lud/r;Lud/a;Z)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lud/r;->z:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    new-instance p2, Lme/a;

    .line 15
    .line 16
    const/16 v1, 0x1a

    .line 17
    .line 18
    invoke-direct {p2, v1}, Lme/a;-><init>(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p2, Lae/d;

    .line 23
    .line 24
    const/16 v1, 0x1c

    .line 25
    .line 26
    invoke-direct {p2, v1}, Lae/d;-><init>(I)V

    .line 27
    .line 28
    .line 29
    :goto_0
    new-instance v1, Lbe/m0;

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-direct {v1, v2, v0}, Lbe/m0;-><init>(ILjava/util/ArrayList;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, p1, p2, v1}, La/a;->d1(Lud/r;Lud/a;Ljava/util/function/Function;Ljava/util/function/Consumer;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public static varargs y0([Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    array-length v0, p0

    .line 2
    if-lez v0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 13
    .line 14
    return-object p0
.end method

.method public static z(Lud/a;Lud/a;Ljava/util/AbstractCollection;Ljava/util/BitSet;Z)V
    .locals 3

    .line 1
    iget v0, p1, Lud/a;->j:I

    .line 2
    .line 3
    invoke-virtual {p3, v0}, Ljava/util/BitSet;->get(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    iget v0, p1, Lud/a;->j:I

    .line 11
    .line 12
    invoke-virtual {p3, v0}, Ljava/util/BitSet;->set(I)V

    .line 13
    .line 14
    .line 15
    if-eqz p4, :cond_1

    .line 16
    .line 17
    iget-object p1, p1, Lud/a;->n:Ljava/util/List;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget-object p1, p1, Lud/a;->o:Ljava/util/List;

    .line 21
    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lud/a;

    .line 37
    .line 38
    iget-object v1, v0, Lud/a;->p:Ljava/util/BitSet;

    .line 39
    .line 40
    iget v2, p0, Lud/a;->j:I

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0, p2, p3, p4}, La/a;->z(Lud/a;Lud/a;Ljava/util/AbstractCollection;Ljava/util/BitSet;Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_2
    return-void
.end method

.method public static varargs z0([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v3, p0, v2

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return-object v0
.end method


# virtual methods
.method public abstract D(Landroid/content/Context;[Le3/d;)Landroid/graphics/Typeface;
.end method

.method public a()V
    .locals 0

    .line 1
    return-void
.end method
