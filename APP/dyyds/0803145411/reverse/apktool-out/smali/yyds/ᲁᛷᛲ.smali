.class public final Lyyds/ᲁᛷᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Lyyds/ᛵᛱᛸᲁ;


# static fields
.field public static final ᛲᛲᲈᲈ:Lyyds/ᛶᛱᛳᲁ;


# instance fields
.field public final ᛱᲈᲁ:Lyyds/ᲈᛵᛱᛲ;

.field public final ᛲᛳᛶᲁ:Lyyds/ᛴᛶᛳᛸ;

.field public final ᛲᛴᛳᛲ:Lyyds/ᲀᲇᛵ;

.field public final ᛶᛷᛲᲁ:Lyyds/ᛷᛶᲇᲁ;

.field public final ᛷᛲᲈᛱ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final ᛷᛵᲇᲀ:Lyyds/ᛶᛱᛳᲁ;

.field public final ᛷᲈᲈᲁ:Lyyds/ᲀᛷᛸ;

.field public final ᲀᛲᛳᲀ:Lcom/bumptech/glide/ᛲᲈᲁ;

.field public final ᲇᲇᲇᛱ:Lyyds/ᛶᲁᛲᲈ;

.field public final ᲇᲈᛵᛷ:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛶᛱᛳᲁ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛴᛲᛲᛷ;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᲇᲈᛵᛷ(Ljava/lang/Class;)Lyyds/ᛴᛲᛲᛷ;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lyyds/ᛶᛱᛳᲁ;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Lyyds/ᛴᛲᛲᛷ;->ᲇᛱᛲ:Z

    .line 16
    .line 17
    sput-object v0, Lyyds/ᲁᛷᛲ;->ᛲᛲᲈᲈ:Lyyds/ᛶᛱᛳᲁ;

    .line 18
    .line 19
    new-instance v0, Lyyds/ᛶᛱᛳᲁ;

    .line 20
    .line 21
    invoke-direct {v0}, Lyyds/ᛴᛲᛲᛷ;-><init>()V

    .line 22
    .line 23
    .line 24
    const-class v2, Lyyds/ᲇᛱᛴᛲ;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lyyds/ᛴᛲᛲᛷ;->ᲇᲈᛵᛷ(Ljava/lang/Class;)Lyyds/ᛴᛲᛲᛷ;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lyyds/ᛶᛱᛳᲁ;

    .line 31
    .line 32
    iput-boolean v1, v0, Lyyds/ᛴᛲᛲᛷ;->ᲇᛱᛲ:Z

    .line 33
    .line 34
    new-instance v0, Lyyds/ᛶᛱᛳᲁ;

    .line 35
    .line 36
    invoke-direct {v0}, Lyyds/ᛴᛲᛲᛷ;-><init>()V

    .line 37
    .line 38
    .line 39
    sget-object v1, Lyyds/ᲁᲁᲇᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ(Lyyds/ᲁᲁᲇᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lyyds/ᛶᛱᛳᲁ;

    .line 46
    .line 47
    invoke-virtual {v0}, Lyyds/ᛴᛲᛲᛷ;->ᛷᛵᲇᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lyyds/ᛶᛱᛳᲁ;

    .line 52
    .line 53
    invoke-virtual {v0}, Lyyds/ᛴᛲᛲᛷ;->ᲇᛱᛲ()Lyyds/ᛴᛲᛲᛷ;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lyyds/ᛶᛱᛳᲁ;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/ᛲᲈᲁ;Lyyds/ᲀᲇᛵ;Lyyds/ᛷᛶᲇᲁ;Landroid/content/Context;)V
    .locals 6

    .line 1
    new-instance v0, Lyyds/ᛶᲁᛲᲈ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛶᲁᛲᲈ;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛱᲈᲁ:Lyyds/ᛲᲁᲈ;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lyyds/ᲈᛵᛱᛲ;

    .line 12
    .line 13
    invoke-direct {v2}, Lyyds/ᲈᛵᛱᛲ;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v2, p0, Lyyds/ᲁᛷᛲ;->ᛱᲈᲁ:Lyyds/ᲈᛵᛱᛲ;

    .line 17
    .line 18
    new-instance v2, Lyyds/ᛴᛶᛳᛸ;

    .line 19
    .line 20
    const/16 v3, 0xe

    .line 21
    .line 22
    invoke-direct {v2, v3, p0}, Lyyds/ᛴᛶᛳᛸ;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, Lyyds/ᲁᛷᛲ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛶᛳᛸ;

    .line 26
    .line 27
    iput-object p1, p0, Lyyds/ᲁᛷᛲ;->ᲀᛲᛳᲀ:Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 28
    .line 29
    iput-object p2, p0, Lyyds/ᲁᛷᛲ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲇᛵ;

    .line 30
    .line 31
    iput-object p3, p0, Lyyds/ᲁᛷᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 32
    .line 33
    iput-object v0, p0, Lyyds/ᲁᛷᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛶᲁᛲᲈ;

    .line 34
    .line 35
    iput-object p4, p0, Lyyds/ᲁᛷᛲ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 36
    .line 37
    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    new-instance p4, Lyyds/ᲀᛲᛴᲁ;

    .line 42
    .line 43
    invoke-direct {p4, p0, v0}, Lyyds/ᲀᛲᛴᲁ;-><init>(Lyyds/ᲁᛷᛲ;Lyyds/ᛶᲁᛲᲈ;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const-string v0, "ConnectivityMonitor"

    .line 50
    .line 51
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 52
    .line 53
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    const/16 v4, 0x21

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    if-ge v3, v4, :cond_1

    .line 59
    .line 60
    const-string v3, "android.permission.POST_NOTIFICATIONS"

    .line 61
    .line 62
    invoke-static {v3, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    new-instance v1, Lyyds/ᛱᲈᲀᛶ;

    .line 69
    .line 70
    invoke-direct {v1, p3}, Lyyds/ᛱᲈᲀᛶ;-><init>(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v1, Lyyds/ᛱᲈᲀᛶ;->ᛲᲈᲁ:Landroid/app/NotificationManager;

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    move v1, v5

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    const/4 v1, -0x1

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-virtual {p3, v1, v3, v4}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    :goto_0
    const/4 v3, 0x1

    .line 98
    if-nez v1, :cond_2

    .line 99
    .line 100
    move v1, v3

    .line 101
    goto :goto_1

    .line 102
    :cond_2
    move v1, v5

    .line 103
    :goto_1
    const/4 v4, 0x3

    .line 104
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_4

    .line 109
    .line 110
    if-eqz v1, :cond_3

    .line 111
    .line 112
    const-string v4, "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    const-string v4, "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"

    .line 116
    .line 117
    :goto_2
    invoke-static {v0, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    :cond_4
    if-eqz v1, :cond_5

    .line 121
    .line 122
    new-instance v0, Lyyds/ᛵᛴᛸᲈ;

    .line 123
    .line 124
    invoke-direct {v0, p3, p4}, Lyyds/ᛵᛴᛸᲈ;-><init>(Landroid/content/Context;Lyyds/ᲀᛲᛴᲁ;)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    new-instance v0, Lyyds/ᛵᛲᲈᲁ;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    :goto_3
    iput-object v0, p0, Lyyds/ᲁᛷᛲ;->ᛷᲈᲈᲁ:Lyyds/ᲀᛷᛸ;

    .line 134
    .line 135
    iget-object p3, p1, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 136
    .line 137
    monitor-enter p3

    .line 138
    :try_start_0
    iget-object p4, p1, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p4

    .line 144
    if-nez p4, :cond_b

    .line 145
    .line 146
    iget-object p4, p1, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 152
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 157
    .line 158
    .line 159
    move-result-object p4

    .line 160
    if-ne p3, p4, :cond_6

    .line 161
    .line 162
    move v5, v3

    .line 163
    :cond_6
    if-nez v5, :cond_7

    .line 164
    .line 165
    invoke-static {}, Lyyds/ᛱᛷᲈᛲ;->ᛲᛳᛶᲁ()Landroid/os/Handler;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    invoke-virtual {p3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_7
    invoke-interface {p2, p0}, Lyyds/ᲀᲇᛵ;->ᛵᛸᛸᛷ(Lyyds/ᛵᛱᛸᲁ;)V

    .line 174
    .line 175
    .line 176
    :goto_4
    invoke-interface {p2, v0}, Lyyds/ᲀᲇᛵ;->ᛵᛸᛸᛷ(Lyyds/ᛵᛱᛸᲁ;)V

    .line 177
    .line 178
    .line 179
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 180
    .line 181
    iget-object p3, p1, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᲇᲈᲁᛷ;

    .line 182
    .line 183
    iget-object p3, p3, Lyyds/ᲇᲈᲁᛷ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 184
    .line 185
    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 186
    .line 187
    .line 188
    iput-object p2, p0, Lyyds/ᲁᛷᛲ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 189
    .line 190
    iget-object p1, p1, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᲇᲈᲁᛷ;

    .line 191
    .line 192
    monitor-enter p1

    .line 193
    :try_start_1
    iget-object p2, p1, Lyyds/ᲇᲈᲁᛷ;->ᛱᲈᲁ:Lyyds/ᛶᛱᛳᲁ;

    .line 194
    .line 195
    if-nez p2, :cond_8

    .line 196
    .line 197
    new-instance p2, Lyyds/ᛶᛱᛳᲁ;

    .line 198
    .line 199
    invoke-direct {p2}, Lyyds/ᛴᛲᛲᛷ;-><init>()V

    .line 200
    .line 201
    .line 202
    iput-boolean v3, p2, Lyyds/ᛴᛲᛲᛷ;->ᲇᛱᛲ:Z

    .line 203
    .line 204
    iput-object p2, p1, Lyyds/ᲇᲈᲁᛷ;->ᛱᲈᲁ:Lyyds/ᛶᛱᛳᲁ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :catchall_0
    move-exception p0

    .line 208
    goto :goto_7

    .line 209
    :cond_8
    :goto_5
    monitor-exit p1

    .line 210
    monitor-enter p0

    .line 211
    :try_start_2
    invoke-virtual {p2}, Lyyds/ᛴᛲᛲᛷ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛲᛲᛷ;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    check-cast p1, Lyyds/ᛶᛱᛳᲁ;

    .line 216
    .line 217
    iget-boolean p2, p1, Lyyds/ᛴᛲᛲᛷ;->ᲇᛱᛲ:Z

    .line 218
    .line 219
    if-eqz p2, :cond_a

    .line 220
    .line 221
    iget-boolean p2, p1, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 222
    .line 223
    if-eqz p2, :cond_9

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 227
    .line 228
    const-string p2, "You cannot auto lock an already locked options object, try clone() first"

    .line 229
    .line 230
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw p1

    .line 234
    :cond_a
    :goto_6
    iput-boolean v3, p1, Lyyds/ᛴᛲᛲᛷ;->ᛶᛳᛶᛵ:Z

    .line 235
    .line 236
    iput-boolean v3, p1, Lyyds/ᛴᛲᛲᛷ;->ᲇᛱᛲ:Z

    .line 237
    .line 238
    iput-object p1, p0, Lyyds/ᲁᛷᛲ;->ᛷᛵᲇᲀ:Lyyds/ᛶᛱᛳᲁ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 239
    .line 240
    monitor-exit p0

    .line 241
    return-void

    .line 242
    :catchall_1
    move-exception p1

    .line 243
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 244
    throw p1

    .line 245
    :goto_7
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 246
    throw p0

    .line 247
    :catchall_2
    move-exception p0

    .line 248
    goto :goto_8

    .line 249
    :cond_b
    :try_start_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 250
    .line 251
    const-string p1, "Cannot register already registered manager"

    .line 252
    .line 253
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw p0

    .line 257
    :goto_8
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 258
    throw p0
.end method


# virtual methods
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
    iget-object v1, p0, Lyyds/ᲁᛷᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛶᲁᛲᲈ;

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
    iget-object v1, p0, Lyyds/ᲁᛷᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛶᲇᲁ;

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

.method public final ᛱᛳᲇ(Ljava/lang/String;)Lyyds/ᛲᲇᛸᛲ;
    .locals 4

    .line 1
    new-instance v0, Lyyds/ᛲᲇᛸᛲ;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲁᛷᛲ;->ᲀᛲᛳᲀ:Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᲁᛷᛲ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 6
    .line 7
    const-class v3, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-direct {v0, v1, p0, v3, v2}, Lyyds/ᛲᲇᛸᛲ;-><init>(Lcom/bumptech/glide/ᛲᲈᲁ;Lyyds/ᲁᛷᛲ;Ljava/lang/Class;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lyyds/ᛲᲇᛸᛲ;->ᛱᛳᛶᛳ(Ljava/lang/Object;)Lyyds/ᛲᲇᛸᛲ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final declared-synchronized ᛲᛲᲈᲈ()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᛱᲈᲁ:Lyyds/ᲈᛵᛱᛲ;

    .line 3
    .line 4
    iget-object v0, v0, Lyyds/ᲈᛵᛱᛲ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 5
    .line 6
    invoke-static {v0}, Lyyds/ᛱᛷᲈᛲ;->ᛱᲈᲁ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lyyds/ᲁᛱᛶᛲ;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lyyds/ᲁᛷᛲ;->ᛷᛵᲇᲀ(Lyyds/ᲁᛱᛶᛲ;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᛱᲈᲁ:Lyyds/ᲈᛵᛱᛲ;

    .line 33
    .line 34
    iget-object v0, v0, Lyyds/ᲈᛵᛱᛲ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw v0
.end method

.method public final declared-synchronized ᛳᲁᲁᲇ()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛶᲁᛲᲈ;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, v0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 6
    .line 7
    iget-object v1, v0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v1}, Lyyds/ᛱᛷᲈᛲ;->ᛱᲈᲁ(Ljava/util/Collection;)Ljava/util/ArrayList;

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
    check-cast v2, Lyyds/ᛸᛷᛷᛸ;

    .line 30
    .line 31
    invoke-interface {v2}, Lyyds/ᛸᛷᛷᛸ;->isRunning()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v2}, Lyyds/ᛸᛷᛷᛸ;->ᲇᲇᲇᛱ()V

    .line 38
    .line 39
    .line 40
    iget-object v3, v0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ljava/util/HashSet;

    .line 43
    .line 44
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    monitor-exit p0

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw v0
.end method

.method public final declared-synchronized ᛶᛳᛶᛵ(Lyyds/ᲁᛱᛶᛲ;)Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-interface {p1}, Lyyds/ᲁᛱᛶᛲ;->ᛶᛷᛲᲁ()Lyyds/ᛸᛷᛷᛸ;

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
    iget-object v2, p0, Lyyds/ᲁᛷᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛶᲁᛲᲈ;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Lyyds/ᛶᲁᛲᲈ;->ᛲᲈᲁ(Lyyds/ᛸᛷᛷᛸ;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᛱᲈᲁ:Lyyds/ᲈᛵᛱᛲ;

    .line 20
    .line 21
    iget-object v0, v0, Lyyds/ᲈᛵᛱᛲ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-interface {p1, v0}, Lyyds/ᲁᛱᛶᛲ;->ᛲᛳᛶᲁ(Lyyds/ᛸᛷᛷᛸ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return v1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    monitor-exit p0

    .line 35
    const/4 p0, 0x0

    .line 36
    return p0

    .line 37
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    throw p1
.end method

.method public final declared-synchronized ᛷᛲᲈᛱ()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᛱᲈᲁ:Lyyds/ᲈᛵᛱᛲ;

    .line 3
    .line 4
    invoke-virtual {v0}, Lyyds/ᲈᛵᛱᛲ;->ᛷᛲᲈᛱ()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᲁᛷᛲ;->ᛲᛲᲈᲈ()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛶᲁᛲᲈ;

    .line 11
    .line 12
    iget-object v1, v0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/Set;

    .line 15
    .line 16
    invoke-static {v1}, Lyyds/ᛱᛷᲈᛲ;->ᛱᲈᲁ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lyyds/ᛸᛷᛷᛸ;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lyyds/ᛶᲁᛲᲈ;->ᛲᲈᲁ(Lyyds/ᛸᛷᛷᛸ;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, v0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/util/HashSet;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲇᛵ;

    .line 48
    .line 49
    invoke-interface {v0, p0}, Lyyds/ᲀᲇᛵ;->ᲀᛲᛳᲀ(Lyyds/ᛵᛱᛸᲁ;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲇᛵ;

    .line 53
    .line 54
    iget-object v1, p0, Lyyds/ᲁᛷᛲ;->ᛷᲈᲈᲁ:Lyyds/ᲀᛷᛸ;

    .line 55
    .line 56
    invoke-interface {v0, v1}, Lyyds/ᲀᲇᛵ;->ᲀᛲᛳᲀ(Lyyds/ᛵᛱᛸᲁ;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛶᛳᛸ;

    .line 60
    .line 61
    invoke-static {}, Lyyds/ᛱᛷᲈᛲ;->ᛲᛳᛶᲁ()Landroid/os/Handler;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᲀᛲᛳᲀ:Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 69
    .line 70
    iget-object v1, v0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 71
    .line 72
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 73
    :try_start_1
    iget-object v2, v0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    iget-object v0, v0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    monitor-exit p0

    .line 88
    return-void

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    const-string v2, "Cannot unregister not yet registered manager"

    .line 94
    .line 95
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v0

    .line 99
    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    :try_start_3
    throw v0

    .line 101
    :catchall_1
    move-exception v0

    .line 102
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 103
    throw v0
.end method

.method public final ᛷᛵᲇᲀ(Lyyds/ᲁᛱᛶᛲ;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lyyds/ᲁᛷᛲ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛱᛶᛲ;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-interface {p1}, Lyyds/ᲁᛱᛶᛲ;->ᛶᛷᛲᲁ()Lyyds/ᛸᛷᛷᛸ;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object p0, p0, Lyyds/ᲁᛷᛲ;->ᲀᛲᛳᲀ:Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    iget-object p0, p0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

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
    check-cast v2, Lyyds/ᲁᛷᛲ;

    .line 36
    .line 37
    invoke-virtual {v2, p1}, Lyyds/ᲁᛷᛲ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛱᛶᛲ;)Z

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
    invoke-interface {p1, p0}, Lyyds/ᲁᛱᛶᛲ;->ᛲᛳᛶᲁ(Lyyds/ᛸᛷᛷᛸ;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Lyyds/ᛸᛷᛷᛸ;->clear()V

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

.method public final declared-synchronized ᛷᲈᲈᲁ()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᲁᛷᛲ;->ᲇᛱᛲ()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᛱᲈᲁ:Lyyds/ᲈᛵᛱᛲ;

    .line 6
    .line 7
    invoke-virtual {v0}, Lyyds/ᲈᛵᛱᛲ;->ᛷᲈᲈᲁ()V
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

.method public final declared-synchronized ᲀᛲᛳᲀ()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᛱᲈᲁ:Lyyds/ᲈᛵᛱᛲ;

    .line 3
    .line 4
    invoke-virtual {v0}, Lyyds/ᲈᛵᛱᛲ;->ᲀᛲᛳᲀ()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᲁᛷᛲ;->ᛳᲁᲁᲇ()V
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

.method public final declared-synchronized ᲇᛱᛲ()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᲁᛷᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛶᲁᛲᲈ;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 6
    .line 7
    iget-object v1, v0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v1}, Lyyds/ᛱᛷᲈᛲ;->ᛱᲈᲁ(Ljava/util/Collection;)Ljava/util/ArrayList;

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
    check-cast v2, Lyyds/ᛸᛷᛷᛸ;

    .line 30
    .line 31
    invoke-interface {v2}, Lyyds/ᛸᛷᛷᛸ;->ᛲᛳᛶᲁ()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v2}, Lyyds/ᛸᛷᛷᛸ;->isRunning()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    invoke-interface {v2}, Lyyds/ᛸᛷᛷᛸ;->ᛶᛷᛲᲁ()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, v0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

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
