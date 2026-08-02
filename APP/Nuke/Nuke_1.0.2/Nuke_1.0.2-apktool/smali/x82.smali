.class public final Lx82;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Lga1;


# static fields
.field public static final p:Lz82;


# instance fields
.field public final h:Lcom/bumptech/glide/a;

.field public final i:Landroid/content/Context;

.field public final j:Leb;

.field public final k:Ler2;

.field public final l:Leb;

.field public final m:Lhh1;

.field public final n:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final o:Lz82;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lz82;

    .line 2
    .line 3
    invoke-direct {v0}, Lwj;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lwj;->g(Ljava/lang/Class;)Lwj;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lz82;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Lwj;->u:Z

    .line 16
    .line 17
    sput-object v0, Lx82;->p:Lz82;

    .line 18
    .line 19
    new-instance v0, Lz82;

    .line 20
    .line 21
    invoke-direct {v0}, Lwj;-><init>()V

    .line 22
    .line 23
    .line 24
    const-class v2, Lyo0;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lwj;->g(Ljava/lang/Class;)Lwj;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lz82;

    .line 31
    .line 32
    iput-boolean v1, v0, Lwj;->u:Z

    .line 33
    .line 34
    new-instance v0, Lz82;

    .line 35
    .line 36
    invoke-direct {v0}, Lwj;-><init>()V

    .line 37
    .line 38
    .line 39
    sget-object v1, Lb90;->c:Lb90;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lwj;->h(Lb90;)Lwj;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lz82;

    .line 46
    .line 47
    invoke-virtual {v0}, Lwj;->o()Lwj;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lz82;

    .line 52
    .line 53
    invoke-virtual {v0}, Lwj;->s()Lwj;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lz82;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;Leb;Leb;Landroid/content/Context;)V
    .locals 6

    .line 1
    new-instance v0, Ler2;

    .line 2
    .line 3
    invoke-direct {v0}, Ler2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lcom/bumptech/glide/a;->m:Leb;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lhh1;

    .line 12
    .line 13
    const/16 v3, 0x14

    .line 14
    .line 15
    invoke-direct {v2, v3}, Lhh1;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v2, p0, Lx82;->m:Lhh1;

    .line 19
    .line 20
    new-instance v2, Ly4;

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    invoke-direct {v2, v3, p0}, Ly4;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lx82;->h:Lcom/bumptech/glide/a;

    .line 27
    .line 28
    iput-object p2, p0, Lx82;->j:Leb;

    .line 29
    .line 30
    iput-object p3, p0, Lx82;->l:Leb;

    .line 31
    .line 32
    iput-object v0, p0, Lx82;->k:Ler2;

    .line 33
    .line 34
    iput-object p4, p0, Lx82;->i:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    new-instance p4, Lw82;

    .line 41
    .line 42
    invoke-direct {p4, p0, v0}, Lw82;-><init>(Lx82;Ler2;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v0, "ConnectivityMonitor"

    .line 49
    .line 50
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 51
    .line 52
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 53
    .line 54
    const/16 v4, 0x21

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    if-ge v3, v4, :cond_1

    .line 58
    .line 59
    const-string v3, "android.permission.POST_NOTIFICATIONS"

    .line 60
    .line 61
    invoke-static {v3, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    new-instance v1, Loo1;

    .line 68
    .line 69
    invoke-direct {v1, p3}, Loo1;-><init>(Landroid/content/Context;)V

    .line 70
    .line 71
    .line 72
    iget-object v1, v1, Loo1;->a:Landroid/app/NotificationManager;

    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_0

    .line 79
    .line 80
    move v1, v5

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    const/4 v1, -0x1

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    invoke-virtual {p3, v1, v3, v4}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    :goto_0
    const/4 v3, 0x1

    .line 97
    if-nez v1, :cond_2

    .line 98
    .line 99
    move v1, v3

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move v1, v5

    .line 102
    :goto_1
    const/4 v4, 0x3

    .line 103
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_4

    .line 108
    .line 109
    if-eqz v1, :cond_3

    .line 110
    .line 111
    const-string v4, "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    const-string v4, "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"

    .line 115
    .line 116
    :goto_2
    invoke-static {v0, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    :cond_4
    if-eqz v1, :cond_5

    .line 120
    .line 121
    new-instance v0, Lsz0;

    .line 122
    .line 123
    invoke-direct {v0, p3, p4}, Lsz0;-><init>(Landroid/content/Context;Lw82;)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    new-instance v0, Li51;

    .line 128
    .line 129
    const/16 p3, 0x8

    .line 130
    .line 131
    invoke-direct {v0, p3}, Li51;-><init>(I)V

    .line 132
    .line 133
    .line 134
    :goto_3
    iget-object p3, p1, Lcom/bumptech/glide/a;->n:Ljava/util/ArrayList;

    .line 135
    .line 136
    monitor-enter p3

    .line 137
    :try_start_0
    iget-object p4, p1, Lcom/bumptech/glide/a;->n:Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p4

    .line 143
    if-nez p4, :cond_b

    .line 144
    .line 145
    iget-object p4, p1, Lcom/bumptech/glide/a;->n:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 151
    sget-object p3, Lb93;->a:[C

    .line 152
    .line 153
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 158
    .line 159
    .line 160
    move-result-object p4

    .line 161
    if-ne p3, p4, :cond_6

    .line 162
    .line 163
    move v5, v3

    .line 164
    :cond_6
    if-nez v5, :cond_7

    .line 165
    .line 166
    invoke-static {}, Lb93;->f()Landroid/os/Handler;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    invoke-virtual {p3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_7
    invoke-virtual {p2, p0}, Leb;->t(Lga1;)V

    .line 175
    .line 176
    .line 177
    :goto_4
    invoke-virtual {p2, v0}, Leb;->t(Lga1;)V

    .line 178
    .line 179
    .line 180
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 181
    .line 182
    iget-object p3, p1, Lcom/bumptech/glide/a;->j:Lvp0;

    .line 183
    .line 184
    iget-object p3, p3, Lvp0;->e:Ljava/util/List;

    .line 185
    .line 186
    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 187
    .line 188
    .line 189
    iput-object p2, p0, Lx82;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 190
    .line 191
    iget-object p1, p1, Lcom/bumptech/glide/a;->j:Lvp0;

    .line 192
    .line 193
    monitor-enter p1

    .line 194
    :try_start_1
    iget-object p2, p1, Lvp0;->j:Lz82;

    .line 195
    .line 196
    if-nez p2, :cond_8

    .line 197
    .line 198
    iget-object p2, p1, Lvp0;->d:Leb;

    .line 199
    .line 200
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    new-instance p2, Lz82;

    .line 204
    .line 205
    invoke-direct {p2}, Lwj;-><init>()V

    .line 206
    .line 207
    .line 208
    iput-boolean v3, p2, Lwj;->u:Z

    .line 209
    .line 210
    iput-object p2, p1, Lvp0;->j:Lz82;

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :catchall_0
    move-exception p0

    .line 214
    goto :goto_7

    .line 215
    :cond_8
    :goto_5
    iget-object p2, p1, Lvp0;->j:Lz82;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 216
    .line 217
    monitor-exit p1

    .line 218
    monitor-enter p0

    .line 219
    :try_start_2
    invoke-virtual {p2}, Lwj;->f()Lwj;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    check-cast p1, Lz82;

    .line 224
    .line 225
    iget-boolean p2, p1, Lwj;->u:Z

    .line 226
    .line 227
    if-eqz p2, :cond_a

    .line 228
    .line 229
    iget-boolean p2, p1, Lwj;->v:Z

    .line 230
    .line 231
    if-eqz p2, :cond_9

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 235
    .line 236
    const-string p2, "You cannot auto lock an already locked options object, try clone() first"

    .line 237
    .line 238
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p1

    .line 242
    :cond_a
    :goto_6
    iput-boolean v3, p1, Lwj;->v:Z

    .line 243
    .line 244
    iput-boolean v3, p1, Lwj;->u:Z

    .line 245
    .line 246
    iput-object p1, p0, Lx82;->o:Lz82;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 247
    .line 248
    monitor-exit p0

    .line 249
    return-void

    .line 250
    :catchall_1
    move-exception p1

    .line 251
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 252
    throw p1

    .line 253
    :goto_7
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 254
    throw p0

    .line 255
    :catchall_2
    move-exception p0

    .line 256
    goto :goto_8

    .line 257
    :cond_b
    :try_start_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 258
    .line 259
    const-string p1, "Cannot register already registered manager"

    .line 260
    .line 261
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw p0

    .line 265
    :goto_8
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 266
    throw p0
.end method


# virtual methods
.method public final a(Lby2;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lx82;->d(Lby2;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-interface {p1}, Lby2;->u()Ll82;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object p0, p0, Lx82;->h:Lcom/bumptech/glide/a;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/bumptech/glide/a;->n:Ljava/util/ArrayList;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    iget-object p0, p0, Lcom/bumptech/glide/a;->n:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lx82;

    .line 36
    .line 37
    invoke-virtual {v2, p1}, Lx82;->d(Lby2;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    invoke-interface {p1, p0}, Lby2;->o(Ll82;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Ll82;->clear()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw p0

    .line 60
    :cond_3
    :goto_1
    return-void
.end method

.method public final b(Ljava/lang/String;)Ls82;
    .locals 4

    .line 1
    new-instance v0, Ls82;

    .line 2
    .line 3
    iget-object v1, p0, Lx82;->h:Lcom/bumptech/glide/a;

    .line 4
    .line 5
    iget-object v2, p0, Lx82;->i:Landroid/content/Context;

    .line 6
    .line 7
    const-class v3, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-direct {v0, v1, p0, v3, v2}, Ls82;-><init>(Lcom/bumptech/glide/a;Lx82;Ljava/lang/Class;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ls82;->D(Ljava/lang/Object;)Ls82;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final declared-synchronized c()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lx82;->k:Ler2;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Ler2;->i:Z

    .line 6
    .line 7
    iget-object v1, v0, Ler2;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v1}, Lb93;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ll82;

    .line 30
    .line 31
    invoke-interface {v2}, Ll82;->j()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v2}, Ll82;->isRunning()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    invoke-interface {v2}, Ll82;->i()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, v0, Ler2;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Ljava/util/HashSet;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw v0
.end method

.method public final declared-synchronized d(Lby2;)Z
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-interface {p1}, Lby2;->u()Ll82;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return v1

    .line 11
    :cond_0
    :try_start_1
    iget-object v2, p0, Lx82;->k:Ler2;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move v2, v1

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    iget-object v4, v2, Ler2;->j:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v4, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget-object v2, v2, Ler2;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_3

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move v2, v3

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    :goto_0
    move v2, v1

    .line 45
    :goto_1
    if-eqz v2, :cond_4

    .line 46
    .line 47
    invoke-interface {v0}, Ll82;->clear()V

    .line 48
    .line 49
    .line 50
    :cond_4
    :goto_2
    if-eqz v2, :cond_5

    .line 51
    .line 52
    iget-object v0, p0, Lx82;->m:Lhh1;

    .line 53
    .line 54
    iget-object v0, v0, Lhh1;->i:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/util/Set;

    .line 57
    .line 58
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-interface {p1, v0}, Lby2;->o(Ll82;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    .line 65
    monitor-exit p0

    .line 66
    return v1

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    goto :goto_3

    .line 69
    :cond_5
    monitor-exit p0

    .line 70
    return v3

    .line 71
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 72
    throw p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "{tracker="

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lx82;->k:Ler2;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", treeNode="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lx82;->l:Leb;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "}"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    monitor-exit p0

    .line 44
    return-object v0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw v0
.end method

.method public final declared-synchronized x()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lx82;->c()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lx82;->m:Lhh1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lhh1;->x()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
.end method
