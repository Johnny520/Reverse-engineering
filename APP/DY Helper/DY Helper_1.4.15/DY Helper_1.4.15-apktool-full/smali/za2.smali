.class public final Lza2;
.super Landroid/app/Fragment;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:Lzd;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 11

    .line 1
    const-wide/16 v1, 0x0

    .line 2
    .line 3
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-super {p0, p1, p2, p3}, Landroid/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    const/16 v0, 0x771

    .line 11
    .line 12
    if-eq p1, v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v6, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v6, v4

    .line 29
    :goto_0
    const/4 v0, -0x1

    .line 30
    if-ne p2, v0, :cond_b

    .line 31
    .line 32
    if-eqz p1, :cond_b

    .line 33
    .line 34
    if-nez v6, :cond_2

    .line 35
    .line 36
    goto/16 :goto_c

    .line 37
    .line 38
    :cond_2
    :try_start_0
    invoke-virtual {p3}, Landroid/content/Intent;->getFlags()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    and-int/lit8 p2, p2, 0x1

    .line 47
    .line 48
    invoke-virtual {p3, v6, p2}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 49
    .line 50
    .line 51
    sget-object p2, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object p2, v0

    .line 56
    new-instance p3, Leo1;

    .line 57
    .line 58
    invoke-direct {p3, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object p2, p3

    .line 62
    :goto_1
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    const-string p3, "rb360b99c73f2f647"

    .line 69
    .line 70
    const-string v0, "\u6301\u4e45\u5316\u97f3\u9891 URI \u8bfb\u53d6\u6743\u9650\u5931\u8d25"

    .line 71
    .line 72
    invoke-static {p3, v0, p2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object p2, p0, Lza2;->ε:Lzd;

    .line 76
    .line 77
    if-eqz p2, :cond_a

    .line 78
    .line 79
    sget-object p3, Lib2;->α:Lib2;

    .line 80
    .line 81
    const-string p3, "_display_name"

    .line 82
    .line 83
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    filled-new-array {p3}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    const/4 v9, 0x0

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v8, 0x0

    .line 94
    invoke-virtual/range {v5 .. v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 95
    .line 96
    .line 97
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 98
    if-eqz v5, :cond_6

    .line 99
    .line 100
    :try_start_2
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_5

    .line 105
    .line 106
    :cond_4
    move-object p3, v4

    .line 107
    goto :goto_2

    .line 108
    :cond_5
    invoke-interface {v5, p3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    if-ltz p3, :cond_4

    .line 113
    .line 114
    invoke-interface {v5, p3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 118
    goto :goto_2

    .line 119
    :catchall_1
    move-exception v0

    .line 120
    move-object p3, v0

    .line 121
    goto :goto_3

    .line 122
    :goto_2
    :try_start_3
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    .line 124
    .line 125
    goto :goto_5

    .line 126
    :catchall_2
    move-exception v0

    .line 127
    move-object p3, v0

    .line 128
    goto :goto_4

    .line 129
    :goto_3
    :try_start_4
    throw p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 130
    :catchall_3
    move-exception v0

    .line 131
    :try_start_5
    invoke-static {v5, p3}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 135
    :cond_6
    move-object p3, v4

    .line 136
    goto :goto_5

    .line 137
    :goto_4
    new-instance v0, Leo1;

    .line 138
    .line 139
    invoke-direct {v0, p3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    move-object p3, v0

    .line 143
    :goto_5
    instance-of v0, p3, Leo1;

    .line 144
    .line 145
    if-eqz v0, :cond_7

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_7
    move-object v4, p3

    .line 149
    :goto_6
    check-cast v4, Ljava/lang/String;

    .line 150
    .line 151
    sget-object p3, Lib2;->α:Lib2;

    .line 152
    .line 153
    :try_start_6
    new-instance p3, Landroid/media/MediaMetadataRetriever;

    .line 154
    .line 155
    invoke-direct {p3}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 156
    .line 157
    .line 158
    :try_start_7
    invoke-virtual {p3, p1, v6}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 159
    .line 160
    .line 161
    const/16 p1, 0x9

    .line 162
    .line 163
    invoke-virtual {p3, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-eqz p1, :cond_8

    .line 168
    .line 169
    const/16 v0, 0xa

    .line 170
    .line 171
    invoke-static {p1, v0}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-eqz p1, :cond_8

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 178
    .line 179
    .line 180
    move-result-wide v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 181
    goto :goto_7

    .line 182
    :catchall_4
    move-exception v0

    .line 183
    move-object p1, v0

    .line 184
    goto :goto_8

    .line 185
    :cond_8
    :goto_7
    :try_start_8
    invoke-virtual {p3}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 186
    .line 187
    .line 188
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    goto :goto_a

    .line 193
    :catchall_5
    move-exception v0

    .line 194
    move-object p1, v0

    .line 195
    goto :goto_9

    .line 196
    :goto_8
    invoke-virtual {p3}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 197
    .line 198
    .line 199
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 200
    :goto_9
    new-instance p3, Leo1;

    .line 201
    .line 202
    invoke-direct {p3, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    move-object p1, p3

    .line 206
    :goto_a
    instance-of p3, p1, Leo1;

    .line 207
    .line 208
    if-eqz p3, :cond_9

    .line 209
    .line 210
    goto :goto_b

    .line 211
    :cond_9
    move-object v3, p1

    .line 212
    :goto_b
    check-cast v3, Ljava/lang/Number;

    .line 213
    .line 214
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p2, v6, v4, p1}, Lzd;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    :cond_a
    invoke-virtual {p0}, Lza2;->α()V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :cond_b
    :goto_c
    iget-object p1, p0, Lza2;->ε:Lzd;

    .line 230
    .line 231
    if-eqz p1, :cond_c

    .line 232
    .line 233
    invoke-virtual {p1, v4, v4, v3}, Lzd;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    :cond_c
    invoke-virtual {p0}, Lza2;->α()V

    .line 237
    .line 238
    .line 239
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/content/Intent;

    .line 5
    .line 6
    const-string v0, "android.intent.action.OPEN_DOCUMENT"

    .line 7
    .line 8
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "android.intent.category.OPENABLE"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    const-string v0, "audio/*"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x40

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    const-string v1, "audio/mpeg"

    .line 31
    .line 32
    const-string v2, "audio/mp3"

    .line 33
    .line 34
    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "android.intent.extra.MIME_TYPES"

    .line 39
    .line 40
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    const/16 v0, 0x771

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    new-instance v0, Leo1;

    .line 53
    .line 54
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    move-object p1, v0

    .line 58
    :goto_0
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    const-string v0, "rb360b99c73f2f647"

    .line 65
    .line 66
    const-string v1, "\u6253\u5f00\u97f3\u9891\u6587\u4ef6\u9009\u62e9\u5668\u5931\u8d25"

    .line 67
    .line 68
    invoke-static {v0, v1, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lza2;->ε:Lzd;

    .line 72
    .line 73
    if-eqz p1, :cond_0

    .line 74
    .line 75
    const-wide/16 v0, 0x0

    .line 76
    .line 77
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const/4 v1, 0x0

    .line 82
    invoke-virtual {p1, v1, v1, v0}, Lzd;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :cond_0
    invoke-virtual {p0}, Lza2;->α()V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-void
.end method

.method public final α()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :catchall_0
    :cond_0
    return-void
.end method
