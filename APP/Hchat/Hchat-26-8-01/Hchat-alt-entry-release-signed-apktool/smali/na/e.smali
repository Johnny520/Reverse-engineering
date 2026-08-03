.class public final Lna/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/ClassLoader;

.field public final c:Lh/Hchat/dexkit/DexFinder;

.field public final d:Ll3/l;

.field public final e:Lm/a;

.field public final f:Lna/k;

.field public final g:Lb5/c;

.field public final h:Lbe/k;

.field public final i:Ll3/w;

.field public final j:Lm8/c;

.field public final k:Loa/a;

.field public final l:Loa/a;

.field public final m:Lra/h;

.field public final n:Lpa/c;

.field public final o:Lra/c;

.field public final p:Lta/c;

.field public final q:Lhb/c;

.field public final r:Lra/c;

.field public final s:Lna/g;

.field public t:Z

.field public u:I

.field public v:Ljava/lang/String;

.field public w:Ljava/lang/String;

.field public x:Z

.field public y:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lh/Hchat/dexkit/DexFinder;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lna/e;->t:Z

    .line 6
    .line 7
    iput v0, p0, Lna/e;->u:I

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    iput-object v1, p0, Lna/e;->v:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v1, p0, Lna/e;->w:Ljava/lang/String;

    .line 14
    .line 15
    iput-boolean v0, p0, Lna/e;->x:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lna/e;->y:Z

    .line 18
    .line 19
    iput-object p1, p0, Lna/e;->a:Landroid/content/Context;

    .line 20
    .line 21
    iput-object p2, p0, Lna/e;->b:Ljava/lang/ClassLoader;

    .line 22
    .line 23
    iput-object p3, p0, Lna/e;->c:Lh/Hchat/dexkit/DexFinder;

    .line 24
    .line 25
    new-instance v4, Ll3/l;

    .line 26
    .line 27
    invoke-direct {v4, p1, p2}, Ll3/l;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;)V

    .line 28
    .line 29
    .line 30
    iput-object v4, p0, Lna/e;->d:Ll3/l;

    .line 31
    .line 32
    new-instance v0, Lm/a;

    .line 33
    .line 34
    const/4 v1, 0x5

    .line 35
    invoke-direct {v0, v4, v1}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lna/e;->e:Lm/a;

    .line 39
    .line 40
    new-instance v5, Lna/k;

    .line 41
    .line 42
    invoke-direct {v5}, Lna/k;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v5, p0, Lna/e;->f:Lna/k;

    .line 46
    .line 47
    move-object v3, v4

    .line 48
    move-object v4, v5

    .line 49
    new-instance v5, Lb5/c;

    .line 50
    .line 51
    new-instance v0, Lna/b;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-direct {v0, p0, v1}, Lna/b;-><init>(Lna/e;I)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v5, p1, v4, v0}, Lb5/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object v5, p0, Lna/e;->g:Lb5/c;

    .line 61
    .line 62
    new-instance v7, Lb5/c;

    .line 63
    .line 64
    new-instance v0, Lna/b;

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    invoke-direct {v0, p0, v1}, Lna/b;-><init>(Lna/e;I)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v7, v4, v3, v0}, Lb5/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance v2, Lbe/k;

    .line 74
    .line 75
    new-instance v6, Lsa/c;

    .line 76
    .line 77
    const-string v0, "Hchat_redpacket_notify_manual_v2"

    .line 78
    .line 79
    const-string v1, "Hchat \u7ea2\u5305\u63d0\u9192"

    .line 80
    .line 81
    const-string v8, "[Hchat:RedPacketNotifier]"

    .line 82
    .line 83
    invoke-direct {v6, p1, v8, v0, v1}, Lsa/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-direct/range {v2 .. v7}, Lbe/k;-><init>(Ll3/l;Lna/k;Lb5/c;Lsa/c;Lb5/c;)V

    .line 87
    .line 88
    .line 89
    move-object v0, v4

    .line 90
    move-object v1, v5

    .line 91
    move-object v4, v3

    .line 92
    iput-object v2, p0, Lna/e;->h:Lbe/k;

    .line 93
    .line 94
    new-instance v2, Lra/c;

    .line 95
    .line 96
    new-instance v3, Lna/b;

    .line 97
    .line 98
    const/4 v5, 0x1

    .line 99
    invoke-direct {v3, p0, v5}, Lna/b;-><init>(Lna/e;I)V

    .line 100
    .line 101
    .line 102
    invoke-direct {v2, p1, v4, v7, v3}, Lra/c;-><init>(Landroid/content/Context;Ll3/l;Lb5/c;Lna/b;)V

    .line 103
    .line 104
    .line 105
    iput-object v2, p0, Lna/e;->r:Lra/c;

    .line 106
    .line 107
    new-instance p1, Lna/g;

    .line 108
    .line 109
    new-instance v2, Lae/g;

    .line 110
    .line 111
    const/16 v3, 0xe

    .line 112
    .line 113
    invoke-direct {v2, p0, v3}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 114
    .line 115
    .line 116
    invoke-direct {p1, v4, v2}, Lna/g;-><init>(Ll3/l;Lae/g;)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, Lna/e;->s:Lna/g;

    .line 120
    .line 121
    new-instance p1, Ll3/w;

    .line 122
    .line 123
    const/16 v2, 0xb

    .line 124
    .line 125
    invoke-direct {p1, v2}, Ll3/w;-><init>(I)V

    .line 126
    .line 127
    .line 128
    iput-object p1, p0, Lna/e;->i:Ll3/w;

    .line 129
    .line 130
    new-instance p1, Lm8/c;

    .line 131
    .line 132
    new-instance v2, Lna/b;

    .line 133
    .line 134
    const/4 v3, 0x5

    .line 135
    invoke-direct {v2, p0, v3}, Lna/b;-><init>(Lna/e;I)V

    .line 136
    .line 137
    .line 138
    invoke-direct {p1, v2}, Lm8/c;-><init>(Lm8/b;)V

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, Lna/e;->j:Lm8/c;

    .line 142
    .line 143
    new-instance v2, Loa/a;

    .line 144
    .line 145
    new-instance v5, Lna/b;

    .line 146
    .line 147
    const/4 v3, 0x6

    .line 148
    invoke-direct {v5, p0, v3}, Lna/b;-><init>(Lna/e;I)V

    .line 149
    .line 150
    .line 151
    new-instance v6, Lna/b;

    .line 152
    .line 153
    const/4 v3, 0x7

    .line 154
    invoke-direct {v6, p0, v3}, Lna/b;-><init>(Lna/e;I)V

    .line 155
    .line 156
    .line 157
    new-instance v7, Lna/b;

    .line 158
    .line 159
    const/16 v3, 0x8

    .line 160
    .line 161
    invoke-direct {v7, p0, v3}, Lna/b;-><init>(Lna/e;I)V

    .line 162
    .line 163
    .line 164
    move-object v3, p3

    .line 165
    invoke-direct/range {v2 .. v7}, Loa/a;-><init>(Lh/Hchat/dexkit/DexFinder;Ll3/l;Lna/b;Lna/b;Lna/b;)V

    .line 166
    .line 167
    .line 168
    iput-object v2, p0, Lna/e;->k:Loa/a;

    .line 169
    .line 170
    new-instance v2, Loa/a;

    .line 171
    .line 172
    new-instance v5, Lna/b;

    .line 173
    .line 174
    const/16 v3, 0xa

    .line 175
    .line 176
    invoke-direct {v5, p0, v3}, Lna/b;-><init>(Lna/e;I)V

    .line 177
    .line 178
    .line 179
    new-instance v6, Lna/b;

    .line 180
    .line 181
    const/16 v3, 0xb

    .line 182
    .line 183
    invoke-direct {v6, p0, v3}, Lna/b;-><init>(Lna/e;I)V

    .line 184
    .line 185
    .line 186
    new-instance v7, Lna/b;

    .line 187
    .line 188
    const/16 v3, 0x9

    .line 189
    .line 190
    invoke-direct {v7, p0, v3}, Lna/b;-><init>(Lna/e;I)V

    .line 191
    .line 192
    .line 193
    move-object v3, p2

    .line 194
    invoke-direct/range {v2 .. v7}, Loa/a;-><init>(Ljava/lang/ClassLoader;Ll3/l;Lna/b;Lna/b;Lna/b;)V

    .line 195
    .line 196
    .line 197
    iput-object v2, p0, Lna/e;->l:Loa/a;

    .line 198
    .line 199
    new-instance v2, Lra/h;

    .line 200
    .line 201
    new-instance v5, Lna/b;

    .line 202
    .line 203
    const/16 p2, 0xc

    .line 204
    .line 205
    invoke-direct {v5, p0, p2}, Lna/b;-><init>(Lna/e;I)V

    .line 206
    .line 207
    .line 208
    new-instance v6, Lna/b;

    .line 209
    .line 210
    const/16 p2, 0xd

    .line 211
    .line 212
    invoke-direct {v6, p0, p2}, Lna/b;-><init>(Lna/e;I)V

    .line 213
    .line 214
    .line 215
    new-instance v7, Lna/b;

    .line 216
    .line 217
    const/16 p2, 0xe

    .line 218
    .line 219
    invoke-direct {v7, p0, p2}, Lna/b;-><init>(Lna/e;I)V

    .line 220
    .line 221
    .line 222
    new-instance v8, Lna/b;

    .line 223
    .line 224
    const/16 p2, 0xf

    .line 225
    .line 226
    invoke-direct {v8, p0, p2}, Lna/b;-><init>(Lna/e;I)V

    .line 227
    .line 228
    .line 229
    invoke-direct/range {v2 .. v8}, Lra/h;-><init>(Ljava/lang/ClassLoader;Ll3/l;Lna/b;Lna/b;Lna/b;Lna/b;)V

    .line 230
    .line 231
    .line 232
    iput-object v2, p0, Lna/e;->m:Lra/h;

    .line 233
    .line 234
    new-instance p2, Lpa/c;

    .line 235
    .line 236
    new-instance v2, Lna/b;

    .line 237
    .line 238
    const/16 v5, 0x10

    .line 239
    .line 240
    invoke-direct {v2, p0, v5}, Lna/b;-><init>(Lna/e;I)V

    .line 241
    .line 242
    .line 243
    invoke-direct {p2, v3, p3, v4, v2}, Lpa/c;-><init>(Ljava/lang/ClassLoader;Lh/Hchat/dexkit/DexFinder;Ll3/l;Lna/b;)V

    .line 244
    .line 245
    .line 246
    iput-object p2, p0, Lna/e;->n:Lpa/c;

    .line 247
    .line 248
    new-instance p2, Lta/c;

    .line 249
    .line 250
    new-instance v2, Lna/b;

    .line 251
    .line 252
    const/16 v3, 0x11

    .line 253
    .line 254
    invoke-direct {v2, p0, v3}, Lna/b;-><init>(Lna/e;I)V

    .line 255
    .line 256
    .line 257
    new-instance v3, Lna/b;

    .line 258
    .line 259
    const/16 v5, 0x12

    .line 260
    .line 261
    invoke-direct {v3, p0, v5}, Lna/b;-><init>(Lna/e;I)V

    .line 262
    .line 263
    .line 264
    invoke-direct {p2, v4, v0, v2, v3}, Lta/c;-><init>(Ll3/l;Lna/k;Lna/b;Lna/b;)V

    .line 265
    .line 266
    .line 267
    iput-object p2, p0, Lna/e;->p:Lta/c;

    .line 268
    .line 269
    new-instance p2, Lhb/c;

    .line 270
    .line 271
    new-instance v2, Lna/b;

    .line 272
    .line 273
    const/16 v3, 0x13

    .line 274
    .line 275
    invoke-direct {v2, p0, v3}, Lna/b;-><init>(Lna/e;I)V

    .line 276
    .line 277
    .line 278
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 279
    .line 280
    .line 281
    iput-object p3, p2, Lhb/c;->g:Ljava/lang/Object;

    .line 282
    .line 283
    iput-object v4, p2, Lhb/c;->h:Ljava/lang/Object;

    .line 284
    .line 285
    iput-object p1, p2, Lhb/c;->i:Ljava/lang/Object;

    .line 286
    .line 287
    iput-object v2, p2, Lhb/c;->j:Ljava/lang/Object;

    .line 288
    .line 289
    iput-object p2, p0, Lna/e;->q:Lhb/c;

    .line 290
    .line 291
    new-instance v2, Lra/c;

    .line 292
    .line 293
    new-instance v7, Lke/h;

    .line 294
    .line 295
    const/16 p2, 0x19

    .line 296
    .line 297
    invoke-direct {v7, v1, p2}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 298
    .line 299
    .line 300
    new-instance v8, Lna/b;

    .line 301
    .line 302
    const/4 p2, 0x2

    .line 303
    invoke-direct {v8, p0, p2}, Lna/b;-><init>(Lna/e;I)V

    .line 304
    .line 305
    .line 306
    new-instance v9, Lna/b;

    .line 307
    .line 308
    const/4 p2, 0x3

    .line 309
    invoke-direct {v9, p0, p2}, Lna/b;-><init>(Lna/e;I)V

    .line 310
    .line 311
    .line 312
    new-instance v10, Lna/b;

    .line 313
    .line 314
    const/4 p2, 0x4

    .line 315
    invoke-direct {v10, p0, p2}, Lna/b;-><init>(Lna/e;I)V

    .line 316
    .line 317
    .line 318
    move-object v6, p1

    .line 319
    move-object v3, p3

    .line 320
    move-object v5, v0

    .line 321
    invoke-direct/range {v2 .. v10}, Lra/c;-><init>(Lh/Hchat/dexkit/DexFinder;Ll3/l;Lna/k;Lm8/c;Lke/h;Lna/b;Lna/b;Lna/b;)V

    .line 322
    .line 323
    .line 324
    iput-object v2, p0, Lna/e;->o:Lra/c;

    .line 325
    .line 326
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->a()Lg8/a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->a()Lg8/a;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lg8/a;->c()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    return-object v1

    .line 38
    :catchall_0
    :cond_0
    :try_start_1
    const-string v1, "com.tencent.mm.sdk.platformtools.MMApplicationContext"

    .line 39
    .line 40
    iget-object v2, p0, Lna/e;->b:Ljava/lang/ClassLoader;

    .line 41
    .line 42
    invoke-static {v1, v2}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "getSharedPreferences"

    .line 47
    .line 48
    const-string v3, "login_info"

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {v1, v2, v3}, Lh/Hchat/utils/KavaReflector;->invokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v2, "getString"

    .line 64
    .line 65
    const-string v3, "login_weixin_username"

    .line 66
    .line 67
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v1, v2, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    if-nez v2, :cond_1

    .line 82
    .line 83
    return-object v1

    .line 84
    :catchall_1
    :cond_1
    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lna/e;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lna/e;->w:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lna/e;->a()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2, p5}, Lna/e;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lna/a;

    .line 17
    .line 18
    .line 19
    move-result-object p5

    .line 20
    iget-object v1, p0, Lna/e;->i:Ll3/w;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v1, p5, Lna/a;->m:Ljava/lang/String;

    .line 26
    .line 27
    iget v2, p5, Lna/a;->l:I

    .line 28
    .line 29
    iget-object v3, p5, Lna/a;->k:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v4, p5, Lna/a;->j:Ljava/lang/String;

    .line 32
    .line 33
    iget-boolean v5, p5, Lna/a;->b:Z

    .line 34
    .line 35
    if-nez v5, :cond_1

    .line 36
    .line 37
    const-string p1, "\u89c4\u5219\u5df2\u5173\u95ed"

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_2

    .line 45
    .line 46
    invoke-static {p4, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p4

    .line 50
    if-nez p4, :cond_2

    .line 51
    .line 52
    const-string p1, "\u4e0d\u662f\u53d1\u7ed9\u6211\u7684\u4e13\u5c5e\u7ea2\u5305"

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    if-nez p4, :cond_3

    .line 60
    .line 61
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    if-nez p4, :cond_3

    .line 66
    .line 67
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    if-eqz p4, :cond_3

    .line 72
    .line 73
    iget-boolean p4, p5, Lna/a;->h:Z

    .line 74
    .line 75
    if-eqz p4, :cond_3

    .line 76
    .line 77
    const-string p1, "\u81ea\u5df1\u53d1\u7684\u7ea2\u5305"

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_3
    const/4 p4, 0x0

    .line 81
    const/4 v0, 0x1

    .line 82
    if-eqz p2, :cond_5

    .line 83
    .line 84
    const-string v5, "@chatroom"

    .line 85
    .line 86
    invoke-static {p2, v5, p4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_4

    .line 91
    .line 92
    const-string v5, "@im.chatroom"

    .line 93
    .line 94
    invoke-static {p2, v5, p4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-nez v5, :cond_4

    .line 99
    .line 100
    const-string v5, "@openim"

    .line 101
    .line 102
    invoke-static {p2, v5, p4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_5

    .line 107
    .line 108
    :cond_4
    move v5, v0

    .line 109
    goto :goto_0

    .line 110
    :cond_5
    move v5, p4

    .line 111
    :goto_0
    iget v6, p5, Lna/a;->i:I

    .line 112
    .line 113
    const/4 v7, 0x2

    .line 114
    if-ne v6, v0, :cond_9

    .line 115
    .line 116
    invoke-static {v4, p1}, Ll3/w;->k(Ljava/lang/String;Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz v5, :cond_8

    .line 121
    .line 122
    if-nez p1, :cond_7

    .line 123
    .line 124
    invoke-static {v4, p2}, Ll3/w;->k(Ljava/lang/String;Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_6

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    move p1, p4

    .line 132
    goto :goto_2

    .line 133
    :cond_7
    :goto_1
    move p1, v0

    .line 134
    :cond_8
    :goto_2
    if-nez p1, :cond_d

    .line 135
    .line 136
    const-string p1, "\u975e\u767d\u540d\u5355"

    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_9
    if-ne v6, v7, :cond_d

    .line 140
    .line 141
    invoke-static {v3, p1}, Ll3/w;->k(Ljava/lang/String;Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz v5, :cond_c

    .line 146
    .line 147
    if-nez p1, :cond_b

    .line 148
    .line 149
    invoke-static {v3, p2}, Ll3/w;->k(Ljava/lang/String;Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_a

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_a
    move p1, p4

    .line 157
    goto :goto_4

    .line 158
    :cond_b
    :goto_3
    move p1, v0

    .line 159
    :cond_c
    :goto_4
    if-eqz p1, :cond_d

    .line 160
    .line 161
    const-string p1, "\u9ed1\u540d\u5355"

    .line 162
    .line 163
    return-object p1

    .line 164
    :cond_d
    iget-boolean p1, p5, Lna/a;->n:Z

    .line 165
    .line 166
    if-nez p1, :cond_e

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_e
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    const/16 p2, 0xb

    .line 174
    .line 175
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    mul-int/lit16 p2, p2, 0xe10

    .line 180
    .line 181
    const/16 v3, 0xc

    .line 182
    .line 183
    invoke-virtual {p1, v3}, Ljava/util/Calendar;->get(I)I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    mul-int/lit8 v3, v3, 0x3c

    .line 188
    .line 189
    add-int/2addr v3, p2

    .line 190
    const/16 p2, 0xd

    .line 191
    .line 192
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    add-int/2addr p1, v3

    .line 197
    iget p2, p5, Lna/a;->o:I

    .line 198
    .line 199
    const v3, 0x1517f

    .line 200
    .line 201
    .line 202
    invoke-static {p2, p4, v3}, Lr9/e0;->r(III)I

    .line 203
    .line 204
    .line 205
    move-result p2

    .line 206
    iget p5, p5, Lna/a;->p:I

    .line 207
    .line 208
    invoke-static {p5, p4, v3}, Lr9/e0;->r(III)I

    .line 209
    .line 210
    .line 211
    move-result p5

    .line 212
    if-gt p2, p5, :cond_10

    .line 213
    .line 214
    if-gt p2, p1, :cond_11

    .line 215
    .line 216
    if-gt p1, p5, :cond_11

    .line 217
    .line 218
    :cond_f
    :goto_5
    move p4, v0

    .line 219
    goto :goto_6

    .line 220
    :cond_10
    if-ge p1, p2, :cond_f

    .line 221
    .line 222
    if-gt p1, p5, :cond_11

    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_11
    :goto_6
    if-eqz p4, :cond_12

    .line 226
    .line 227
    const-string p1, "\u5f53\u524d\u65f6\u95f4\u6bb5\u7981\u62a2"

    .line 228
    .line 229
    return-object p1

    .line 230
    :cond_12
    if-ne v2, v0, :cond_13

    .line 231
    .line 232
    invoke-static {p3, v1}, Loa/b;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    if-nez p1, :cond_13

    .line 237
    .line 238
    const-string p1, "\u672a\u5305\u542b\u6307\u5b9a\u5173\u952e\u8bcd"

    .line 239
    .line 240
    return-object p1

    .line 241
    :cond_13
    if-ne v2, v7, :cond_14

    .line 242
    .line 243
    invoke-static {p3, v1}, Loa/b;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    if-eqz p1, :cond_14

    .line 248
    .line 249
    const-string p1, "\u5305\u542b\u5c4f\u853d\u5173\u952e\u8bcd"

    .line 250
    .line 251
    return-object p1

    .line 252
    :cond_14
    const/4 p1, 0x0

    .line 253
    return-object p1
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 15

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lna/e;->d:Ll3/l;

    .line 7
    .line 8
    const-string v2, "hb_log_enable"

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    :try_start_0
    invoke-virtual {v1}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move v1, v3

    .line 24
    :goto_0
    iput-boolean v1, p0, Lna/e;->x:Z

    .line 25
    .line 26
    invoke-virtual {p0}, Lna/e;->f()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lna/e;->s:Lna/g;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_1
    invoke-virtual {v1}, Lna/g;->b()V

    .line 33
    .line 34
    .line 35
    iget-boolean v2, v1, Lna/g;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    monitor-exit v1

    .line 42
    goto :goto_2

    .line 43
    :cond_0
    :try_start_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->d()Lg8/g;

    .line 51
    .line 52
    .line 53
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move-object v2, v5

    .line 56
    :goto_1
    if-nez v2, :cond_1

    .line 57
    .line 58
    :try_start_3
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomChanges()Lg8/g;

    .line 59
    .line 60
    .line 61
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 62
    :catchall_2
    :cond_1
    if-nez v2, :cond_3

    .line 63
    .line 64
    :try_start_4
    const-string v2, "\u7fa4\u804a\u53d8\u66f4 API \u672a\u5c31\u7eea\uff0c\u65b0\u8fdb\u7fa4\u5c4f\u853d\u53ea\u4f7f\u7528\u5df2\u8bb0\u5f55\u540d\u5355"

    .line 65
    .line 66
    iget-object v6, v1, Lna/g;->b:Lae/g;

    .line 67
    .line 68
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-nez v7, :cond_2

    .line 73
    .line 74
    invoke-virtual {v6, v2}, Lae/g;->accept(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 75
    .line 76
    .line 77
    :cond_2
    monitor-exit v1

    .line 78
    goto :goto_2

    .line 79
    :catchall_3
    move-exception v0

    .line 80
    goto/16 :goto_21

    .line 81
    .line 82
    :cond_3
    :try_start_5
    new-instance v5, Lna/f;

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    invoke-direct {v5, v1, v6}, Lna/f;-><init>(Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v5}, Lg8/g;->a(Lg8/f;)La2/a;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    iput-boolean v4, v1, Lna/g;->c:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 93
    .line 94
    monitor-exit v1

    .line 95
    :goto_2
    if-eqz v5, :cond_4

    .line 96
    .line 97
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v2, "hookAll \u5f00\u59cb, \u6536\u7ea2\u5305\u7c7b="

    .line 103
    .line 104
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v2, p0, Lna/e;->c:Lh/Hchat/dexkit/DexFinder;

    .line 108
    .line 109
    iget-object v2, v2, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyClass:Ljava/lang/Class;

    .line 110
    .line 111
    if-eqz v2, :cond_5

    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    goto :goto_3

    .line 118
    :cond_5
    const-string v2, "null"

    .line 119
    .line 120
    :goto_3
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v2, " \u62c6\u7ea2\u5305\u7c7b="

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v2, p0, Lna/e;->c:Lh/Hchat/dexkit/DexFinder;

    .line 129
    .line 130
    iget-object v2, v2, Lh/Hchat/dexkit/DexFinder;->openLuckyMoneyClass:Ljava/lang/Class;

    .line 131
    .line 132
    if-eqz v2, :cond_6

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    goto :goto_4

    .line 139
    :cond_6
    const-string v2, "null"

    .line 140
    .line 141
    :goto_4
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {p0, v1}, Lna/e;->d(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iget-boolean v1, p0, Lna/e;->y:Z

    .line 152
    .line 153
    if-eqz v1, :cond_7

    .line 154
    .line 155
    goto/16 :goto_e

    .line 156
    .line 157
    :cond_7
    :try_start_6
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->l()Lk8/p;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    if-eqz v1, :cond_9

    .line 169
    .line 170
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->hasMessageObserve()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_9

    .line 182
    .line 183
    invoke-virtual {v1}, Lk8/p;->c()Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-nez v2, :cond_8

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_8
    new-instance v2, Lna/c;

    .line 191
    .line 192
    const/4 v5, 0x0

    .line 193
    invoke-direct {v2, p0, v5}, Lna/c;-><init>(Ljava/lang/Object;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v2}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    iput-boolean v4, p0, Lna/e;->y:Z

    .line 204
    .line 205
    const-string v1, "\u7ea2\u5305\u68c0\u6d4b\u5165\u53e3: WeChatApis.message().observe()"

    .line 206
    .line 207
    invoke-virtual {p0, v1}, Lna/e;->d(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_e

    .line 211
    .line 212
    :catchall_4
    move-exception v1

    .line 213
    goto :goto_6

    .line 214
    :cond_9
    :goto_5
    const-string v1, "\u6d88\u606f\u89c2\u5bdfAPI\u4e0d\u53ef\u7528\uff0c\u4f7f\u7528\u7ea2\u5305\u68c0\u6d4b fallback"

    .line 215
    .line 216
    invoke-virtual {p0, v1}, Lna/e;->d(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 217
    .line 218
    .line 219
    goto :goto_7

    .line 220
    :goto_6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v5, "ERROR \u5b89\u88c5\u6d88\u606f\u89c2\u5bdf\u5931\u8d25: "

    .line 223
    .line 224
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {p0, v1}, Lna/e;->d(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    :goto_7
    iget-object v1, p0, Lna/e;->k:Loa/a;

    .line 242
    .line 243
    iget-object v2, v1, Loa/a;->c:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v2, Lh/Hchat/dexkit/DexFinder;

    .line 246
    .line 247
    iget-boolean v5, v1, Loa/a;->b:Z

    .line 248
    .line 249
    if-eqz v5, :cond_a

    .line 250
    .line 251
    goto/16 :goto_c

    .line 252
    .line 253
    :cond_a
    iget-object v5, v2, Lh/Hchat/dexkit/DexFinder;->addMsgClasses:Ljava/util/List;

    .line 254
    .line 255
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-eqz v5, :cond_b

    .line 260
    .line 261
    const-string v2, "AddMsg\u7c7b\u672a\u627e\u5230\uff0c\u8df3\u8fc7"

    .line 262
    .line 263
    invoke-virtual {v1, v2}, Loa/a;->c(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_c

    .line 267
    .line 268
    :cond_b
    iget-object v2, v2, Lh/Hchat/dexkit/DexFinder;->addMsgClasses:Ljava/util/List;

    .line 269
    .line 270
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    move v5, v3

    .line 275
    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    if-eqz v6, :cond_15

    .line 280
    .line 281
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    check-cast v6, Ljava/lang/Class;

    .line 286
    .line 287
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    :cond_d
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    if-eqz v7, :cond_c

    .line 300
    .line 301
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    check-cast v7, Ljava/lang/reflect/Method;

    .line 306
    .line 307
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    if-eqz v8, :cond_d

    .line 312
    .line 313
    array-length v9, v8

    .line 314
    if-nez v9, :cond_e

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_e
    new-instance v9, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 320
    .line 321
    .line 322
    move v10, v3

    .line 323
    :goto_9
    array-length v11, v8

    .line 324
    if-ge v10, v11, :cond_13

    .line 325
    .line 326
    aget-object v11, v8, v10

    .line 327
    .line 328
    if-eqz v11, :cond_12

    .line 329
    .line 330
    invoke-virtual {v11}, Ljava/lang/Class;->isPrimitive()Z

    .line 331
    .line 332
    .line 333
    move-result v12

    .line 334
    if-nez v12, :cond_12

    .line 335
    .line 336
    invoke-virtual {v11}, Ljava/lang/Class;->isArray()Z

    .line 337
    .line 338
    .line 339
    move-result v12

    .line 340
    if-eqz v12, :cond_f

    .line 341
    .line 342
    goto :goto_a

    .line 343
    :cond_f
    const-class v12, Ljava/lang/String;

    .line 344
    .line 345
    if-eq v11, v12, :cond_12

    .line 346
    .line 347
    const-class v12, Ljava/lang/Number;

    .line 348
    .line 349
    invoke-virtual {v12, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 350
    .line 351
    .line 352
    move-result v12

    .line 353
    if-nez v12, :cond_12

    .line 354
    .line 355
    const-class v12, Ljava/lang/Boolean;

    .line 356
    .line 357
    if-ne v11, v12, :cond_10

    .line 358
    .line 359
    goto :goto_a

    .line 360
    :cond_10
    const-string v12, "e"

    .line 361
    .line 362
    invoke-static {v11, v12}, Lx6/d;->F(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 363
    .line 364
    .line 365
    move-result v12

    .line 366
    if-eqz v12, :cond_12

    .line 367
    .line 368
    const-string v12, "f"

    .line 369
    .line 370
    invoke-static {v11, v12}, Lx6/d;->F(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 371
    .line 372
    .line 373
    move-result v12

    .line 374
    if-eqz v12, :cond_12

    .line 375
    .line 376
    const-string v12, "h"

    .line 377
    .line 378
    invoke-static {v11, v12}, Lx6/d;->F(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    if-nez v12, :cond_11

    .line 383
    .line 384
    const-string v12, "i"

    .line 385
    .line 386
    invoke-static {v11, v12}, Lx6/d;->F(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 387
    .line 388
    .line 389
    move-result v12

    .line 390
    if-nez v12, :cond_11

    .line 391
    .line 392
    const-string v12, "m"

    .line 393
    .line 394
    invoke-static {v11, v12}, Lx6/d;->F(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 395
    .line 396
    .line 397
    move-result v11

    .line 398
    if-eqz v11, :cond_12

    .line 399
    .line 400
    :cond_11
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 401
    .line 402
    .line 403
    move-result-object v11

    .line 404
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    :cond_12
    :goto_a
    add-int/lit8 v10, v10, 0x1

    .line 408
    .line 409
    goto :goto_9

    .line 410
    :cond_13
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 411
    .line 412
    .line 413
    move-result v8

    .line 414
    if-eqz v8, :cond_14

    .line 415
    .line 416
    goto :goto_8

    .line 417
    :cond_14
    sget-object v8, Lr8/i;->b:Lr8/i;

    .line 418
    .line 419
    new-instance v10, Lc9/c2;

    .line 420
    .line 421
    const/16 v11, 0xa

    .line 422
    .line 423
    const/4 v12, 0x0

    .line 424
    invoke-direct {v10, v11, v1, v9, v12}, Lc9/c2;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v8, v7, v10}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 428
    .line 429
    .line 430
    add-int/lit8 v5, v5, 0x1

    .line 431
    .line 432
    goto/16 :goto_8

    .line 433
    .line 434
    :cond_15
    if-lez v5, :cond_16

    .line 435
    .line 436
    move v2, v4

    .line 437
    goto :goto_b

    .line 438
    :cond_16
    move v2, v3

    .line 439
    :goto_b
    iput-boolean v2, v1, Loa/a;->b:Z

    .line 440
    .line 441
    new-instance v2, Ljava/lang/StringBuilder;

    .line 442
    .line 443
    const-string v6, "AddMsg Hook: "

    .line 444
    .line 445
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-virtual {v1, v2}, Loa/a;->c(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    :goto_c
    iget-object v1, p0, Lna/e;->l:Loa/a;

    .line 459
    .line 460
    iget-boolean v2, v1, Loa/a;->b:Z

    .line 461
    .line 462
    if-eqz v2, :cond_17

    .line 463
    .line 464
    goto :goto_e

    .line 465
    :cond_17
    const-string v2, "com.tencent.wcdb.database.SQLiteDatabase"

    .line 466
    .line 467
    invoke-virtual {v1, v2}, Loa/a;->b(Ljava/lang/String;)I

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    const-string v5, "android.database.sqlite.SQLiteDatabase"

    .line 472
    .line 473
    invoke-virtual {v1, v5}, Loa/a;->b(Ljava/lang/String;)I

    .line 474
    .line 475
    .line 476
    move-result v5

    .line 477
    add-int/2addr v5, v2

    .line 478
    if-lez v5, :cond_18

    .line 479
    .line 480
    move v2, v4

    .line 481
    goto :goto_d

    .line 482
    :cond_18
    move v2, v3

    .line 483
    :goto_d
    iput-boolean v2, v1, Loa/a;->b:Z

    .line 484
    .line 485
    if-eqz v2, :cond_19

    .line 486
    .line 487
    const-string v2, "\u6570\u636e\u5e93\u515c\u5e95Hook\u5b8c\u6210: "

    .line 488
    .line 489
    invoke-static {v5, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    iget-object v1, v1, Loa/a;->f:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v1, Lna/b;

    .line 496
    .line 497
    iget-object v1, v1, Lna/b;->h:Lna/e;

    .line 498
    .line 499
    invoke-virtual {v1, v2}, Lna/e;->d(Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    goto :goto_e

    .line 503
    :cond_19
    const-string v2, "\u6570\u636e\u5e93\u515c\u5e95: \u672a\u627e\u5230\u53efHook\u7684SQLiteDatabase"

    .line 504
    .line 505
    iget-object v1, v1, Loa/a;->f:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v1, Lna/b;

    .line 508
    .line 509
    iget-object v1, v1, Lna/b;->h:Lna/e;

    .line 510
    .line 511
    invoke-virtual {v1, v2}, Lna/e;->d(Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    :goto_e
    iget-object v1, p0, Lna/e;->m:Lra/h;

    .line 515
    .line 516
    const-string v2, " | "

    .line 517
    .line 518
    iget-object v5, v1, Lra/h;->a:Ljava/lang/ClassLoader;

    .line 519
    .line 520
    iget-boolean v6, v1, Lra/h;->i:Z

    .line 521
    .line 522
    const/4 v7, 0x3

    .line 523
    if-eqz v6, :cond_1a

    .line 524
    .line 525
    goto :goto_13

    .line 526
    :cond_1a
    const-string v6, "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI"

    .line 527
    .line 528
    const-string v8, "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI"

    .line 529
    .line 530
    const-string v9, "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyReceiveUI"

    .line 531
    .line 532
    filled-new-array {v6, v8, v9}, [Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v6

    .line 536
    move v8, v3

    .line 537
    :goto_f
    if-ge v8, v7, :cond_1b

    .line 538
    .line 539
    aget-object v9, v6, v8

    .line 540
    .line 541
    :try_start_7
    invoke-static {v9, v5}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    move-result-object v10

    .line 545
    invoke-virtual {v1, v10, v9}, Lra/h;->l(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 546
    .line 547
    .line 548
    goto :goto_10

    .line 549
    :catchall_5
    move-exception v10

    .line 550
    const-string v11, "\u67e5\u627e\u9886\u53d6\u9875\u7c7b\u5931\u8d25: "

    .line 551
    .line 552
    invoke-static {v11, v9, v2}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    move-result-object v9

    .line 556
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v10

    .line 560
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v9

    .line 567
    invoke-virtual {v1, v9}, Lra/h;->o(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    :goto_10
    add-int/lit8 v8, v8, 0x1

    .line 571
    .line 572
    goto :goto_f

    .line 573
    :cond_1b
    const-string v6, "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI"

    .line 574
    .line 575
    const-string v8, "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI"

    .line 576
    .line 577
    const-string v9, "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI"

    .line 578
    .line 579
    filled-new-array {v6, v8, v9}, [Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    move v8, v3

    .line 584
    :goto_11
    if-ge v8, v7, :cond_1c

    .line 585
    .line 586
    aget-object v9, v6, v8

    .line 587
    .line 588
    :try_start_8
    invoke-static {v9, v5}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    move-result-object v10

    .line 592
    invoke-virtual {v1, v10, v9}, Lra/h;->k(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 593
    .line 594
    .line 595
    goto :goto_12

    .line 596
    :catchall_6
    move-exception v10

    .line 597
    const-string v11, "\u67e5\u627e\u8be6\u60c5\u9875\u7c7b\u5931\u8d25: "

    .line 598
    .line 599
    invoke-static {v11, v9, v2}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    move-result-object v9

    .line 603
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v10

    .line 607
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v9

    .line 614
    invoke-virtual {v1, v9}, Lra/h;->o(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    :goto_12
    add-int/lit8 v8, v8, 0x1

    .line 618
    .line 619
    goto :goto_11

    .line 620
    :cond_1c
    iput-boolean v4, v1, Lra/h;->i:Z

    .line 621
    .line 622
    :goto_13
    iget-object v1, p0, Lna/e;->n:Lpa/c;

    .line 623
    .line 624
    iget-object v2, v1, Lpa/c;->d:Ljava/lang/Object;

    .line 625
    .line 626
    check-cast v2, Lh/Hchat/dexkit/DexFinder;

    .line 627
    .line 628
    iget-boolean v5, v1, Lpa/c;->a:Z

    .line 629
    .line 630
    if-eqz v5, :cond_1d

    .line 631
    .line 632
    goto/16 :goto_18

    .line 633
    .line 634
    :cond_1d
    :try_start_9
    new-instance v5, Ljava/util/ArrayList;

    .line 635
    .line 636
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 637
    .line 638
    .line 639
    const-string v6, "com.tencent.mm.modelbase.m1"

    .line 640
    .line 641
    invoke-virtual {v1, v6, v5}, Lpa/c;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 642
    .line 643
    .line 644
    const-string v6, "com.tencent.mm.modelbase.k1"

    .line 645
    .line 646
    invoke-virtual {v1, v6, v5}, Lpa/c;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 647
    .line 648
    .line 649
    const-string v6, "com.tencent.mm.modelbase.l1"

    .line 650
    .line 651
    invoke-virtual {v1, v6, v5}, Lpa/c;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 652
    .line 653
    .line 654
    const-string v6, "com.tencent.mm.modelbase.n1"

    .line 655
    .line 656
    invoke-virtual {v1, v6, v5}, Lpa/c;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 660
    .line 661
    .line 662
    move-result v6

    .line 663
    if-eqz v6, :cond_1e

    .line 664
    .line 665
    iget-object v6, v2, Lh/Hchat/dexkit/DexFinder;->packetBaseClasses:Ljava/util/List;

    .line 666
    .line 667
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 668
    .line 669
    .line 670
    goto :goto_14

    .line 671
    :catchall_7
    move-exception v5

    .line 672
    goto/16 :goto_17

    .line 673
    .line 674
    :cond_1e
    :goto_14
    invoke-virtual {v1, v5}, Lpa/c;->b(Ljava/util/ArrayList;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 678
    .line 679
    .line 680
    move-result v6

    .line 681
    if-eqz v6, :cond_1f

    .line 682
    .line 683
    const-string v5, "\u53d1\u5305\u8bf7\u6c42Hook\u5931\u8d25: \u672a\u627e\u5230NetSceneBase"

    .line 684
    .line 685
    invoke-virtual {v1, v5}, Lpa/c;->d(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    goto/16 :goto_18

    .line 689
    .line 690
    :cond_1f
    new-instance v6, Ljava/util/HashSet;

    .line 691
    .line 692
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 696
    .line 697
    .line 698
    move-result-object v5

    .line 699
    move v8, v3

    .line 700
    :cond_20
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 701
    .line 702
    .line 703
    move-result v9

    .line 704
    if-eqz v9, :cond_24

    .line 705
    .line 706
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v9

    .line 710
    check-cast v9, Ljava/lang/Class;

    .line 711
    .line 712
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 713
    .line 714
    .line 715
    move-result-object v10

    .line 716
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 717
    .line 718
    .line 719
    move-result-object v10

    .line 720
    :goto_15
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 721
    .line 722
    .line 723
    move-result v11

    .line 724
    if-eqz v11, :cond_20

    .line 725
    .line 726
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v11

    .line 730
    check-cast v11, Ljava/lang/reflect/Method;

    .line 731
    .line 732
    const-string v12, "dispatch"

    .line 733
    .line 734
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v13

    .line 738
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    move-result v12

    .line 742
    if-nez v12, :cond_21

    .line 743
    .line 744
    goto :goto_15

    .line 745
    :cond_21
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    move-result-object v12

    .line 749
    array-length v12, v12

    .line 750
    if-eq v12, v7, :cond_22

    .line 751
    .line 752
    goto :goto_15

    .line 753
    :cond_22
    new-instance v12, Ljava/lang/StringBuilder;

    .line 754
    .line 755
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v13

    .line 762
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 763
    .line 764
    .line 765
    const-string v13, "#"

    .line 766
    .line 767
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v12

    .line 777
    invoke-virtual {v6, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    move-result v12

    .line 781
    if-nez v12, :cond_23

    .line 782
    .line 783
    goto :goto_15

    .line 784
    :cond_23
    sget-object v12, Lr8/i;->b:Lr8/i;

    .line 785
    .line 786
    new-instance v13, Lpa/b;

    .line 787
    .line 788
    const/4 v14, 0x0

    .line 789
    invoke-direct {v13, v1, v14}, Lpa/b;-><init>(Lpa/c;I)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v12, v11, v13}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 793
    .line 794
    .line 795
    add-int/lit8 v8, v8, 0x1

    .line 796
    .line 797
    goto :goto_15

    .line 798
    :cond_24
    if-lez v8, :cond_25

    .line 799
    .line 800
    move v5, v4

    .line 801
    goto :goto_16

    .line 802
    :cond_25
    move v5, v3

    .line 803
    :goto_16
    iput-boolean v5, v1, Lpa/c;->a:Z

    .line 804
    .line 805
    new-instance v5, Ljava/lang/StringBuilder;

    .line 806
    .line 807
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 808
    .line 809
    .line 810
    const-string v6, "\u53d1\u5305\u8bf7\u6c42Hook\u5b8c\u6210, count="

    .line 811
    .line 812
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 816
    .line 817
    .line 818
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v5

    .line 822
    invoke-virtual {v1, v5}, Lpa/c;->d(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 823
    .line 824
    .line 825
    goto :goto_18

    .line 826
    :goto_17
    new-instance v6, Ljava/lang/StringBuilder;

    .line 827
    .line 828
    const-string v8, "ERROR \u53d1\u5305\u8bf7\u6c42Hook\u5931\u8d25: "

    .line 829
    .line 830
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v5

    .line 837
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v5

    .line 844
    invoke-virtual {v1, v5}, Lpa/c;->d(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    :goto_18
    iget-boolean v5, v1, Lpa/c;->b:Z

    .line 848
    .line 849
    if-eqz v5, :cond_26

    .line 850
    .line 851
    goto/16 :goto_1c

    .line 852
    .line 853
    :cond_26
    :try_start_a
    new-instance v5, Ljava/util/ArrayList;

    .line 854
    .line 855
    iget-object v2, v2, Lh/Hchat/dexkit/DexFinder;->fakePacketClasses:Ljava/util/List;

    .line 856
    .line 857
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 858
    .line 859
    .line 860
    const-string v2, "com.tencent.mm.plugin.luckymoney.model.e6"

    .line 861
    .line 862
    invoke-virtual {v1, v2, v5}, Lpa/c;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 866
    .line 867
    .line 868
    move-result v2

    .line 869
    if-eqz v2, :cond_27

    .line 870
    .line 871
    const-string v2, "\u5047\u7ea2\u5305\u54cd\u5e94\u4fee\u6b63Hook\u5931\u8d25: \u672a\u627e\u5230PrepareLuckyMoney\u7c7b"

    .line 872
    .line 873
    invoke-virtual {v1, v2}, Lpa/c;->d(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    goto/16 :goto_1c

    .line 877
    .line 878
    :catchall_8
    move-exception v2

    .line 879
    goto :goto_1b

    .line 880
    :cond_27
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    move v5, v3

    .line 885
    :cond_28
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 886
    .line 887
    .line 888
    move-result v6

    .line 889
    if-eqz v6, :cond_2b

    .line 890
    .line 891
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v6

    .line 895
    check-cast v6, Ljava/lang/Class;

    .line 896
    .line 897
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 898
    .line 899
    .line 900
    move-result-object v6

    .line 901
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 902
    .line 903
    .line 904
    move-result-object v6

    .line 905
    :goto_19
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 906
    .line 907
    .line 908
    move-result v8

    .line 909
    if-eqz v8, :cond_28

    .line 910
    .line 911
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v8

    .line 915
    check-cast v8, Ljava/lang/reflect/Method;

    .line 916
    .line 917
    const-string v9, "onGYNetEnd"

    .line 918
    .line 919
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v10

    .line 923
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 924
    .line 925
    .line 926
    move-result v9

    .line 927
    if-nez v9, :cond_29

    .line 928
    .line 929
    goto :goto_19

    .line 930
    :cond_29
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 931
    .line 932
    .line 933
    move-result-object v9

    .line 934
    array-length v9, v9

    .line 935
    if-eq v9, v7, :cond_2a

    .line 936
    .line 937
    goto :goto_19

    .line 938
    :cond_2a
    sget-object v9, Lr8/i;->b:Lr8/i;

    .line 939
    .line 940
    new-instance v10, Lpa/b;

    .line 941
    .line 942
    const/4 v11, 0x1

    .line 943
    invoke-direct {v10, v1, v11}, Lpa/b;-><init>(Lpa/c;I)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v9, v8, v10}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 947
    .line 948
    .line 949
    add-int/lit8 v5, v5, 0x1

    .line 950
    .line 951
    goto :goto_19

    .line 952
    :cond_2b
    if-lez v5, :cond_2c

    .line 953
    .line 954
    move v2, v4

    .line 955
    goto :goto_1a

    .line 956
    :cond_2c
    move v2, v3

    .line 957
    :goto_1a
    iput-boolean v2, v1, Lpa/c;->b:Z

    .line 958
    .line 959
    new-instance v2, Ljava/lang/StringBuilder;

    .line 960
    .line 961
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 962
    .line 963
    .line 964
    const-string v6, "\u5047\u7ea2\u5305\u54cd\u5e94\u4fee\u6b63Hook\u5b8c\u6210, count="

    .line 965
    .line 966
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 967
    .line 968
    .line 969
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 970
    .line 971
    .line 972
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    invoke-virtual {v1, v2}, Lpa/c;->d(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 977
    .line 978
    .line 979
    goto :goto_1c

    .line 980
    :goto_1b
    new-instance v5, Ljava/lang/StringBuilder;

    .line 981
    .line 982
    const-string v6, "ERROR \u5047\u7ea2\u5305\u54cd\u5e94\u4fee\u6b63Hook\u5931\u8d25: "

    .line 983
    .line 984
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 985
    .line 986
    .line 987
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v2

    .line 991
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object v2

    .line 998
    invoke-virtual {v1, v2}, Lpa/c;->d(Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    :goto_1c
    iget-object v1, p0, Lna/e;->j:Lm8/c;

    .line 1002
    .line 1003
    iget-object v2, p0, Lna/e;->c:Lh/Hchat/dexkit/DexFinder;

    .line 1004
    .line 1005
    iget-object v5, v2, Lh/Hchat/dexkit/DexFinder;->netQueueClass:Ljava/lang/Class;

    .line 1006
    .line 1007
    iget-object v2, v2, Lh/Hchat/dexkit/DexFinder;->netQueueCandidateClasses:Ljava/util/List;

    .line 1008
    .line 1009
    invoke-virtual {v1, v5, v2}, Lm8/c;->c(Ljava/lang/Class;Ljava/util/List;)V

    .line 1010
    .line 1011
    .line 1012
    iget-object v1, p0, Lna/e;->o:Lra/c;

    .line 1013
    .line 1014
    iget-object v2, v1, Lra/c;->c:Ljava/lang/Object;

    .line 1015
    .line 1016
    check-cast v2, Lh/Hchat/dexkit/DexFinder;

    .line 1017
    .line 1018
    iget-boolean v5, v1, Lra/c;->a:Z

    .line 1019
    .line 1020
    if-eqz v5, :cond_2d

    .line 1021
    .line 1022
    goto :goto_1f

    .line 1023
    :cond_2d
    iget-object v5, v2, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyClass:Ljava/lang/Class;

    .line 1024
    .line 1025
    const-string v6, "normal"

    .line 1026
    .line 1027
    invoke-virtual {v1, v5, v6}, Lra/c;->i(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 1028
    .line 1029
    .line 1030
    move-result v5

    .line 1031
    iget-object v2, v2, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyUnionClass:Ljava/lang/Class;

    .line 1032
    .line 1033
    const-string v6, "union"

    .line 1034
    .line 1035
    invoke-virtual {v1, v2, v6}, Lra/c;->i(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 1036
    .line 1037
    .line 1038
    move-result v2

    .line 1039
    if-nez v2, :cond_2f

    .line 1040
    .line 1041
    if-eqz v5, :cond_2e

    .line 1042
    .line 1043
    goto :goto_1d

    .line 1044
    :cond_2e
    move v2, v3

    .line 1045
    goto :goto_1e

    .line 1046
    :cond_2f
    :goto_1d
    move v2, v4

    .line 1047
    :goto_1e
    iput-boolean v2, v1, Lra/c;->a:Z

    .line 1048
    .line 1049
    :goto_1f
    iget-object v1, p0, Lna/e;->o:Lra/c;

    .line 1050
    .line 1051
    iget-object v2, v1, Lra/c;->c:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v2, Lh/Hchat/dexkit/DexFinder;

    .line 1054
    .line 1055
    iget-boolean v5, v1, Lra/c;->b:Z

    .line 1056
    .line 1057
    if-eqz v5, :cond_30

    .line 1058
    .line 1059
    goto :goto_20

    .line 1060
    :cond_30
    iget-object v5, v2, Lh/Hchat/dexkit/DexFinder;->openLuckyMoneyClass:Ljava/lang/Class;

    .line 1061
    .line 1062
    const-string v6, "normal"

    .line 1063
    .line 1064
    invoke-virtual {v1, v5, v6}, Lra/c;->h(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 1065
    .line 1066
    .line 1067
    move-result v5

    .line 1068
    iget-object v2, v2, Lh/Hchat/dexkit/DexFinder;->openLuckyMoneyUnionClass:Ljava/lang/Class;

    .line 1069
    .line 1070
    const-string v6, "union"

    .line 1071
    .line 1072
    invoke-virtual {v1, v2, v6}, Lra/c;->h(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v2

    .line 1076
    if-nez v2, :cond_31

    .line 1077
    .line 1078
    if-eqz v5, :cond_32

    .line 1079
    .line 1080
    :cond_31
    move v3, v4

    .line 1081
    :cond_32
    iput-boolean v3, v1, Lra/c;->b:Z

    .line 1082
    .line 1083
    :goto_20
    iget-boolean v1, p0, Lna/e;->t:Z

    .line 1084
    .line 1085
    if-eqz v1, :cond_33

    .line 1086
    .line 1087
    invoke-virtual {p0}, Lna/e;->a()Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v1

    .line 1091
    iput-object v1, p0, Lna/e;->w:Ljava/lang/String;

    .line 1092
    .line 1093
    :cond_33
    const-string v1, "hookAll \u5b8c\u6210"

    .line 1094
    .line 1095
    invoke-virtual {p0, v1}, Lna/e;->d(Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    return-object v0

    .line 1099
    :goto_21
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 1100
    throw v0
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lna/e;->x:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "ERROR"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    const-string v1, "\u5931\u8d25"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    const-string v1, "\u672a\u627e\u5230"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    const-string v1, "\u4e0d\u53ef\u7528"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    const-string v1, "\u65e0\u5408\u9002\u65b9\u6cd5"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :goto_0
    return-void

    .line 54
    :cond_2
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v1, "[Hchat:RedPacket] "

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v5, p5

    .line 10
    .line 11
    iget-object v0, v1, Lna/e;->d:Ll3/l;

    .line 12
    .line 13
    invoke-virtual {v0}, Ll3/l;->e()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {v1}, Lna/e;->f()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, Lna/e;->f:Lna/k;

    .line 24
    .line 25
    iget-object v2, v0, Lna/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    iget-object v7, v0, Lna/k;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    iget-object v8, v0, Lna/k;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    iget-object v0, v0, Lna/k;->j:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 32
    .line 33
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    if-eqz v9, :cond_1

    .line 38
    .line 39
    goto/16 :goto_9

    .line 40
    .line 41
    :cond_1
    if-eqz v5, :cond_16

    .line 42
    .line 43
    const-string v9, ""

    .line 44
    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    move-object/from16 v10, p2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object v10, v9

    .line 51
    :goto_0
    invoke-virtual {v8, v5, v10}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v11

    .line 55
    check-cast v11, Ljava/lang/String;

    .line 56
    .line 57
    if-eqz v11, :cond_7

    .line 58
    .line 59
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {v8, v5, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-virtual {v7, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    if-eqz v4, :cond_5

    .line 94
    .line 95
    invoke-virtual {v7, v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    :cond_5
    :goto_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    goto/16 :goto_9

    .line 105
    .line 106
    :cond_6
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_16

    .line 117
    .line 118
    if-eqz v3, :cond_16

    .line 119
    .line 120
    invoke-virtual {v2, v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    goto/16 :goto_9

    .line 124
    .line 125
    :cond_7
    if-eqz v4, :cond_8

    .line 126
    .line 127
    move-object v8, v4

    .line 128
    goto :goto_2

    .line 129
    :cond_8
    move-object v8, v9

    .line 130
    :goto_2
    invoke-virtual {v7, v5, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    if-eqz v3, :cond_9

    .line 134
    .line 135
    move-object v7, v3

    .line 136
    goto :goto_3

    .line 137
    :cond_9
    move-object v7, v9

    .line 138
    :goto_3
    invoke-virtual {v2, v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v10}, Ljava/util/concurrent/ConcurrentLinkedDeque;->addFirst(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :goto_4
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->size()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    const/16 v7, 0x1e

    .line 149
    .line 150
    if-le v2, v7, :cond_a

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->removeLast()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_a
    invoke-virtual {v1, v4, v3, v5}, Lna/e;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lna/a;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    move-object v0, v1

    .line 161
    move-object v2, v3

    .line 162
    move-object v1, v4

    .line 163
    move-object/from16 v3, p2

    .line 164
    .line 165
    move-object/from16 v4, p6

    .line 166
    .line 167
    invoke-virtual/range {v0 .. v5}, Lna/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    move-object v1, v3

    .line 172
    move-object v3, v2

    .line 173
    move-object v2, v1

    .line 174
    move-object v1, v0

    .line 175
    if-eqz v4, :cond_b

    .line 176
    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v2, " \u5ffd\u7565: "

    .line 186
    .line 187
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v1, v0}, Lna/e;->d(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_b
    iget v0, v8, Lna/a;->d:I

    .line 202
    .line 203
    const-wide/16 v10, 0x0

    .line 204
    .line 205
    const/4 v4, 0x1

    .line 206
    if-eq v0, v4, :cond_c

    .line 207
    .line 208
    iget-wide v12, v8, Lna/a;->e:J

    .line 209
    .line 210
    cmp-long v0, v12, v10

    .line 211
    .line 212
    if-gez v0, :cond_10

    .line 213
    .line 214
    move-wide v12, v10

    .line 215
    goto :goto_5

    .line 216
    :cond_c
    iget-wide v12, v8, Lna/a;->f:J

    .line 217
    .line 218
    cmp-long v0, v12, v10

    .line 219
    .line 220
    if-gez v0, :cond_d

    .line 221
    .line 222
    move-wide v12, v10

    .line 223
    :cond_d
    iget-wide v14, v8, Lna/a;->g:J

    .line 224
    .line 225
    cmp-long v0, v14, v12

    .line 226
    .line 227
    if-gez v0, :cond_e

    .line 228
    .line 229
    move-wide v14, v12

    .line 230
    :cond_e
    cmp-long v0, v14, v12

    .line 231
    .line 232
    if-gtz v0, :cond_f

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_f
    const-wide/16 v16, 0x1

    .line 236
    .line 237
    add-long v14, v14, v16

    .line 238
    .line 239
    sget-object v0, Ljg/d;->g:Ljg/a;

    .line 240
    .line 241
    invoke-virtual {v0, v12, v13, v14, v15}, Ljg/d;->e(JJ)J

    .line 242
    .line 243
    .line 244
    move-result-wide v12

    .line 245
    :cond_10
    :goto_5
    iget v0, v8, Lna/a;->c:I

    .line 246
    .line 247
    const-string v14, " \u7ea2\u5305: "

    .line 248
    .line 249
    invoke-static {v6, v14}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    invoke-static {v7, v14}, Ljava/lang/Math;->min(II)I

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    const/4 v14, 0x0

    .line 262
    invoke-virtual {v5, v14, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    const-string v7, " mode="

    .line 270
    .line 271
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    const-string v7, " delay="

    .line 278
    .line 279
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v6, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    const-string v7, " rule="

    .line 286
    .line 287
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    iget-object v7, v8, Lna/a;->a:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string v7, " recvClass="

    .line 296
    .line 297
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    iget-object v7, v1, Lna/e;->c:Lh/Hchat/dexkit/DexFinder;

    .line 301
    .line 302
    iget-object v15, v7, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyClass:Ljava/lang/Class;

    .line 303
    .line 304
    if-eqz v15, :cond_11

    .line 305
    .line 306
    move v15, v4

    .line 307
    goto :goto_6

    .line 308
    :cond_11
    move v15, v14

    .line 309
    :goto_6
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    const-string v15, " openClass="

    .line 313
    .line 314
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    iget-object v7, v7, Lh/Hchat/dexkit/DexFinder;->openLuckyMoneyClass:Ljava/lang/Class;

    .line 318
    .line 319
    if-eqz v7, :cond_12

    .line 320
    .line 321
    move v7, v4

    .line 322
    goto :goto_7

    .line 323
    :cond_12
    move v7, v14

    .line 324
    :goto_7
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    invoke-virtual {v1, v6}, Lna/e;->d(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    if-ne v0, v4, :cond_14

    .line 335
    .line 336
    new-instance v0, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    const-string v4, "\u8fdb\u5165\u9759\u9ed8\u6a21\u5f0f, sendid="

    .line 339
    .line 340
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    const-string v4, "sendid"

    .line 344
    .line 345
    invoke-static {v5, v4}, Loa/b;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v1, v0}, Lna/e;->d(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    cmp-long v0, v12, v10

    .line 360
    .line 361
    if-gtz v0, :cond_13

    .line 362
    .line 363
    iget-object v0, v1, Lna/e;->o:Lra/c;

    .line 364
    .line 365
    invoke-virtual {v0, v14, v2, v3, v5}, Lra/c;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :cond_13
    const-string v0, "redpacket_receive:"

    .line 370
    .line 371
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    new-instance v0, Lna/d;

    .line 376
    .line 377
    const/4 v5, 0x0

    .line 378
    move-object/from16 v4, p5

    .line 379
    .line 380
    invoke-direct/range {v0 .. v5}, Lna/d;-><init>(Lna/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 381
    .line 382
    .line 383
    move-object v14, v1

    .line 384
    invoke-virtual {v14, v6, v12, v13, v0}, Lna/e;->i(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :cond_14
    move-object v14, v1

    .line 389
    move-object v15, v3

    .line 390
    const-string v0, "\u8fdb\u5165UI\u6a21\u5f0f"

    .line 391
    .line 392
    invoke-virtual {v14, v0}, Lna/e;->d(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    iget-object v0, v14, Lna/e;->h:Lbe/k;

    .line 396
    .line 397
    invoke-virtual {v0, v15, v5}, Lbe/k;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    iget-object v1, v0, Lbe/k;->e:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v1, Lb5/c;

    .line 404
    .line 405
    iget-boolean v7, v8, Lna/a;->w:Z

    .line 406
    .line 407
    iget-boolean v2, v8, Lna/a;->x:Z

    .line 408
    .line 409
    if-nez v7, :cond_15

    .line 410
    .line 411
    if-nez v2, :cond_15

    .line 412
    .line 413
    goto :goto_8

    .line 414
    :cond_15
    iget-boolean v3, v8, Lna/a;->y:Z

    .line 415
    .line 416
    iget-boolean v10, v8, Lna/a;->A:Z

    .line 417
    .line 418
    iget-object v11, v8, Lna/a;->B:Ljava/lang/String;

    .line 419
    .line 420
    iget-object v6, v0, Lbe/k;->d:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v6, Lsa/c;

    .line 423
    .line 424
    iget-object v0, v0, Lbe/k;->b:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v0, Ll3/l;

    .line 427
    .line 428
    const-string v8, "hb_notify_title"

    .line 429
    .line 430
    move/from16 v16, v2

    .line 431
    .line 432
    const-string v2, "\u81ea\u52a8\u62a2\u7ea2\u5305"

    .line 433
    .line 434
    invoke-virtual {v0, v8, v2}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v1, v0, v9, v4, v5}, Lb5/c;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    const-string v2, "\u6536\u5230\u7ea2\u5305\uff0c\u70b9\u51fb\u6253\u5f00"

    .line 443
    .line 444
    invoke-virtual {v1, v2, v9, v4, v5}, Lb5/c;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v8

    .line 448
    invoke-virtual {v1, v2, v9, v4, v5}, Lb5/c;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    move v9, v3

    .line 453
    move-object v3, v1

    .line 454
    move-object v1, v0

    .line 455
    move-object v0, v6

    .line 456
    const v6, 0x30d40

    .line 457
    .line 458
    .line 459
    move-object v2, v8

    .line 460
    move/from16 v8, v16

    .line 461
    .line 462
    invoke-virtual/range {v0 .. v11}, Lsa/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZZLjava/lang/String;)V

    .line 463
    .line 464
    .line 465
    :goto_8
    const-string v0, "redpacket_ui:"

    .line 466
    .line 467
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v6

    .line 471
    new-instance v0, Lna/d;

    .line 472
    .line 473
    const/4 v5, 0x1

    .line 474
    move-object/from16 v4, p3

    .line 475
    .line 476
    move-object/from16 v2, p5

    .line 477
    .line 478
    move-object v1, v14

    .line 479
    move-object v3, v15

    .line 480
    invoke-direct/range {v0 .. v5}, Lna/d;-><init>(Lna/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v1, v6, v12, v13, v0}, Lna/e;->i(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 484
    .line 485
    .line 486
    return-void

    .line 487
    :cond_16
    :goto_9
    const-string v0, " \u8df3\u8fc7: nu="

    .line 488
    .line 489
    invoke-static {v6, v0}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    if-eqz v2, :cond_17

    .line 498
    .line 499
    const-string v2, "empty"

    .line 500
    .line 501
    goto :goto_a

    .line 502
    :cond_17
    const-string v2, "dup"

    .line 503
    .line 504
    :goto_a
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v1, v0}, Lna/e;->d(Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    iget-object v1, p0, Lna/e;->d:Ll3/l;

    .line 4
    .line 5
    :try_start_0
    const-string v2, "hb_skip_self"

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :try_start_1
    invoke-virtual {v1}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move v2, v3

    .line 21
    :goto_0
    :try_start_2
    iput-boolean v2, p0, Lna/e;->t:Z

    .line 22
    .line 23
    const-string v2, "hb_auto_mode"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 24
    .line 25
    :try_start_3
    invoke-virtual {v1}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 30
    .line 31
    .line 32
    :catchall_1
    :try_start_4
    const-string v2, "hb_kw_mode"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 33
    .line 34
    :try_start_5
    invoke-virtual {v1}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 39
    .line 40
    .line 41
    move-result v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 42
    :catchall_2
    :try_start_6
    iput v3, p0, Lna/e;->u:I

    .line 43
    .line 44
    const-string v2, "hb_keywords"

    .line 45
    .line 46
    invoke-virtual {v1, v2, v0}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, p0, Lna/e;->v:Ljava/lang/String;

    .line 51
    .line 52
    iput-object v0, p0, Lna/e;->w:Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 53
    .line 54
    :catchall_3
    return-void
.end method

.method public final g(Ljava/lang/String;)Lna/a;
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lna/e;->f:Lna/k;

    .line 8
    .line 9
    iget-object v0, v0, Lna/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lna/a;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object p1, p0, Lna/e;->d:Ll3/l;

    .line 21
    .line 22
    invoke-static {p1}, Lbe/h;->I(Ll3/l;)Lna/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lna/a;
    .locals 10

    .line 1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lna/e;->f:Lna/k;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v1, Lna/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lna/a;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    iget-object v0, p0, Lna/e;->e:Lm/a;

    .line 21
    .line 22
    iget-object v0, v0, Lm/a;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ll3/l;

    .line 25
    .line 26
    invoke-static {v0}, Lbe/h;->I(Ll3/l;)Lna/a;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "hb_rule_templates_v1"

    .line 31
    .line 32
    const-string v4, ""

    .line 33
    .line 34
    invoke-virtual {v0, v3, v4}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3}, La7/a;->M(Ljava/lang/String;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const-string v5, "hb_rule_bindings_v1"

    .line 43
    .line 44
    invoke-virtual {v0, v5, v4}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-static {v4}, La7/a;->F(Ljava/lang/String;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_1
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const/4 v6, 0x0

    .line 75
    if-eqz v5, :cond_6

    .line 76
    .line 77
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    move-object v7, v5

    .line 82
    check-cast v7, Lna/i;

    .line 83
    .line 84
    iget-object v7, v7, Lna/i;->b:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v7, :cond_5

    .line 87
    .line 88
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_3

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-static {p2}, Loa/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-nez v9, :cond_4

    .line 115
    .line 116
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    goto :goto_1

    .line 121
    :cond_4
    invoke-static {p1}, Loa/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    goto :goto_1

    .line 130
    :cond_5
    :goto_0
    const/4 v7, 0x0

    .line 131
    :goto_1
    if-eqz v7, :cond_2

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    move-object v5, v6

    .line 135
    :goto_2
    check-cast v5, Lna/i;

    .line 136
    .line 137
    if-eqz v5, :cond_10

    .line 138
    .line 139
    iget-object p1, v5, Lna/i;->e:Ljava/lang/String;

    .line 140
    .line 141
    iget-object p2, v5, Lna/i;->c:Ljava/lang/String;

    .line 142
    .line 143
    iget-boolean v4, v5, Lna/i;->d:Z

    .line 144
    .line 145
    if-nez v4, :cond_8

    .line 146
    .line 147
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-eqz p1, :cond_7

    .line 152
    .line 153
    const-string p2, "\u9002\u7528\u804a\u5929\u5df2\u5173\u95ed"

    .line 154
    .line 155
    :cond_7
    invoke-static {v2, p2}, Lna/a;->a(Lna/a;Ljava/lang/String;)Lna/a;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    goto :goto_4

    .line 160
    :cond_8
    iget-boolean v4, v5, Lna/i;->f:Z

    .line 161
    .line 162
    if-eqz v4, :cond_9

    .line 163
    .line 164
    iget-object v4, v5, Lna/i;->g:Lna/j;

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_9
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_b

    .line 176
    .line 177
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    move-object v7, v5

    .line 182
    check-cast v7, Lna/j;

    .line 183
    .line 184
    iget-object v7, v7, Lna/j;->a:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v7, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-eqz v7, :cond_a

    .line 191
    .line 192
    move-object v6, v5

    .line 193
    :cond_b
    move-object v4, v6

    .line 194
    check-cast v4, Lna/j;

    .line 195
    .line 196
    :goto_3
    if-eqz v4, :cond_d

    .line 197
    .line 198
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    if-eqz p1, :cond_c

    .line 203
    .line 204
    iget-object p2, v4, Lna/j;->b:Ljava/lang/String;

    .line 205
    .line 206
    :cond_c
    invoke-static {v4, p2, v2}, Lac/p;->d(Lna/j;Ljava/lang/String;Lna/a;)Lna/a;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    goto :goto_4

    .line 211
    :cond_d
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    if-eqz p1, :cond_e

    .line 216
    .line 217
    invoke-static {v0, v3, v2}, Lbe/h;->r(Ll3/l;Ljava/util/List;Lna/a;)Lna/a;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    goto :goto_4

    .line 222
    :cond_e
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-eqz p1, :cond_f

    .line 227
    .line 228
    const-string p2, "\u672a\u7ed1\u5b9a\u6a21\u677f"

    .line 229
    .line 230
    :cond_f
    invoke-static {v2, p2}, Lna/a;->a(Lna/a;Ljava/lang/String;)Lna/a;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    goto :goto_4

    .line 235
    :cond_10
    invoke-static {v0, v3, v2}, Lbe/h;->r(Ll3/l;Ljava/util/List;Lna/a;)Lna/a;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    :goto_4
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    if-nez p1, :cond_11

    .line 244
    .line 245
    iget-object p1, v1, Lna/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 246
    .line 247
    invoke-virtual {p1, p3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    :cond_11
    return-object v2
.end method

.method public final i(Ljava/lang/String;JLjava/lang/Runnable;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->runtime()Li8/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->p()Lo8/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    invoke-static {v1, v2, p2, p3}, Ljava/lang/Math;->max(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p2

    .line 20
    invoke-virtual {v0, p1, p2, p3, p4}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    new-instance p2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string p3, "\u4efb\u52a1API\u8c03\u5ea6\u5931\u8d25\uff0c\u76f4\u63a5\u6267\u884c: "

    .line 28
    .line 29
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0, p1}, Lna/e;->d(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-interface {p4}, Ljava/lang/Runnable;->run()V

    .line 47
    .line 48
    .line 49
    return-void
.end method
