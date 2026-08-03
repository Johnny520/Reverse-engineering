.class public final synthetic Li8/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lr8/g;

.field public final synthetic b:Lm8/a;

.field public final synthetic c:Lp8/d0;

.field public final synthetic d:Lk8/k;

.field public final synthetic e:Lo8/d;

.field public final synthetic f:Lk8/i;

.field public final synthetic g:Lh8/b;

.field public final synthetic h:Lg8/j;

.field public final synthetic i:Lg8/g;

.field public final synthetic j:Lk8/p;

.field public final synthetic k:Lq8/m;


# direct methods
.method public synthetic constructor <init>(Li8/i;Lr8/g;Lm8/a;Lp8/d0;Lk8/k;Lo8/d;Lk8/i;Lh8/b;Lg8/j;Lg8/g;Lk8/p;Lq8/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Li8/g;->a:Lr8/g;

    .line 5
    .line 6
    iput-object p3, p0, Li8/g;->b:Lm8/a;

    .line 7
    .line 8
    iput-object p4, p0, Li8/g;->c:Lp8/d0;

    .line 9
    .line 10
    iput-object p5, p0, Li8/g;->d:Lk8/k;

    .line 11
    .line 12
    iput-object p6, p0, Li8/g;->e:Lo8/d;

    .line 13
    .line 14
    iput-object p7, p0, Li8/g;->f:Lk8/i;

    .line 15
    .line 16
    iput-object p8, p0, Li8/g;->g:Lh8/b;

    .line 17
    .line 18
    iput-object p9, p0, Li8/g;->h:Lg8/j;

    .line 19
    .line 20
    iput-object p10, p0, Li8/g;->i:Lg8/g;

    .line 21
    .line 22
    iput-object p11, p0, Li8/g;->j:Lk8/p;

    .line 23
    .line 24
    iput-object p12, p0, Li8/g;->k:Lq8/m;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Lr8/c;->j:Lr8/c;

    .line 4
    .line 5
    iget-object v3, v1, Li8/g;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v0, v1, Li8/g;->b:Lm8/a;

    .line 8
    .line 9
    iget-object v4, v1, Li8/g;->c:Lp8/d0;

    .line 10
    .line 11
    iget-object v5, v1, Li8/g;->d:Lk8/k;

    .line 12
    .line 13
    iget-object v6, v1, Li8/g;->e:Lo8/d;

    .line 14
    .line 15
    iget-object v7, v1, Li8/g;->f:Lk8/i;

    .line 16
    .line 17
    iget-object v8, v1, Li8/g;->g:Lh8/b;

    .line 18
    .line 19
    iget-object v9, v1, Li8/g;->h:Lg8/j;

    .line 20
    .line 21
    iget-object v10, v1, Li8/g;->i:Lg8/g;

    .line 22
    .line 23
    iget-object v11, v1, Li8/g;->j:Lk8/p;

    .line 24
    .line 25
    iget-object v12, v1, Li8/g;->k:Lq8/m;

    .line 26
    .line 27
    const-string v13, "DexReady \u53d1\u5e03\u5931\u8d25: "

    .line 28
    .line 29
    const-string v14, "DexKit \u9884\u70ed\u5931\u8d25: "

    .line 30
    .line 31
    :try_start_0
    iget-object v15, v3, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 32
    .line 33
    invoke-virtual {v15}, Lh/Hchat/dexkit/DexFinder;->resolveAll()V

    .line 34
    .line 35
    .line 36
    iget-object v15, v3, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 37
    .line 38
    invoke-virtual {v0, v15}, Lm8/a;->a(Lh/Hchat/dexkit/DexFinder;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "snsInteractionWarmup"

    .line 42
    .line 43
    new-instance v15, Li8/h;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v15, v4, v1}, Li8/h;-><init>(Lp8/d0;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v15}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    const-string v0, "snsCachedPostsWarmup"

    .line 53
    .line 54
    new-instance v1, Li8/h;

    .line 55
    .line 56
    const/4 v15, 0x1

    .line 57
    invoke-direct {v1, v4, v15}, Li8/h;-><init>(Lp8/d0;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 61
    .line 62
    .line 63
    const-string v0, "snsPostObserverWarmup"

    .line 64
    .line 65
    new-instance v1, Li8/h;

    .line 66
    .line 67
    const/4 v15, 0x2

    .line 68
    invoke-direct {v1, v4, v15}, Li8/h;-><init>(Lp8/d0;I)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Lk8/k;->a()V

    .line 75
    .line 76
    .line 77
    const-string v0, "databaseChangesWarmup"

    .line 78
    .line 79
    new-instance v1, La1/a;

    .line 80
    .line 81
    const/16 v4, 0xc

    .line 82
    .line 83
    invoke-direct {v1, v6, v4}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 87
    .line 88
    .line 89
    const-string v0, "messageChangesWarmup"

    .line 90
    .line 91
    new-instance v1, La1/a;

    .line 92
    .line 93
    const/16 v4, 0xd

    .line 94
    .line 95
    invoke-direct {v1, v7, v4}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    const-string v0, "conversationChangesWarmup"

    .line 102
    .line 103
    new-instance v1, La1/a;

    .line 104
    .line 105
    const/16 v4, 0xe

    .line 106
    .line 107
    invoke-direct {v1, v8, v4}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0, v1}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 111
    .line 112
    .line 113
    const-string v0, "contactChangesWarmup"

    .line 114
    .line 115
    new-instance v1, La1/a;

    .line 116
    .line 117
    const/16 v4, 0xf

    .line 118
    .line 119
    invoke-direct {v1, v9, v4}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v1}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 123
    .line 124
    .line 125
    const-string v0, "chatroomChangesWarmup"

    .line 126
    .line 127
    new-instance v1, La1/a;

    .line 128
    .line 129
    const/16 v4, 0x10

    .line 130
    .line 131
    invoke-direct {v1, v10, v4}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v1}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 135
    .line 136
    .line 137
    const-string v0, "messageObserveWarmup"

    .line 138
    .line 139
    new-instance v1, La1/a;

    .line 140
    .line 141
    const/16 v4, 0x14

    .line 142
    .line 143
    invoke-direct {v1, v11, v4}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v1}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 147
    .line 148
    .line 149
    const-string v0, "chatPageWarmup"

    .line 150
    .line 151
    new-instance v1, La1/a;

    .line 152
    .line 153
    const/16 v4, 0x15

    .line 154
    .line 155
    invoke-direct {v1, v12, v4}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v1}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 159
    .line 160
    .line 161
    :try_start_1
    invoke-static {v2}, Lr8/e;->a(Lr8/c;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v3, Lr8/g;->f:Lf8/c;

    .line 165
    .line 166
    new-instance v1, Lf8/e;

    .line 167
    .line 168
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v1}, Lf8/c;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :catchall_0
    move-exception v0

    .line 176
    new-instance v1, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :catchall_1
    move-exception v0

    .line 197
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 214
    .line 215
    .line 216
    :try_start_3
    invoke-static {v2}, Lr8/e;->a(Lr8/c;)V

    .line 217
    .line 218
    .line 219
    iget-object v0, v3, Lr8/g;->f:Lf8/c;

    .line 220
    .line 221
    new-instance v1, Lf8/e;

    .line 222
    .line 223
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v1}, Lf8/c;->b(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :catchall_2
    move-exception v0

    .line 231
    new-instance v1, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_0

    .line 237
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 238
    .line 239
    return-object v0

    .line 240
    :catchall_3
    move-exception v0

    .line 241
    move-object v1, v0

    .line 242
    :try_start_4
    invoke-static {v2}, Lr8/e;->a(Lr8/c;)V

    .line 243
    .line 244
    .line 245
    iget-object v0, v3, Lr8/g;->f:Lf8/c;

    .line 246
    .line 247
    new-instance v2, Lf8/e;

    .line 248
    .line 249
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v2}, Lf8/c;->b(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 253
    .line 254
    .line 255
    goto :goto_2

    .line 256
    :catchall_4
    move-exception v0

    .line 257
    new-instance v2, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    :goto_2
    throw v1
.end method
