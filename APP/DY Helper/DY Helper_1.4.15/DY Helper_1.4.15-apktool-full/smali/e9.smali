.class public final synthetic Le9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Landroid/app/Activity;Lf9;)V
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    iput v0, p0, Le9;->ε:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Le9;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Le9;->η:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/content/Context;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p4, p0, Le9;->ε:I

    iput-object p1, p0, Le9;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Le9;->θ:Ljava/lang/Object;

    iput-object p3, p0, Le9;->η:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;Landroid/app/Activity;I)V
    .locals 0

    .line 16
    iput p4, p0, Le9;->ε:I

    iput-object p1, p0, Le9;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Le9;->η:Ljava/lang/Object;

    iput-object p3, p0, Le9;->θ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 17
    iput p4, p0, Le9;->ε:I

    iput-object p1, p0, Le9;->θ:Ljava/lang/Object;

    iput-object p2, p0, Le9;->ζ:Ljava/lang/Object;

    iput-object p3, p0, Le9;->η:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 0

    .line 18
    iput p4, p0, Le9;->ε:I

    iput-object p1, p0, Le9;->θ:Ljava/lang/Object;

    iput-object p2, p0, Le9;->η:Ljava/lang/Object;

    iput-object p3, p0, Le9;->ζ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final α()V
    .locals 14

    .line 1
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/ClassLoader;

    .line 4
    .line 5
    iget-object v1, p0, Le9;->θ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/app/Activity;

    .line 8
    .line 9
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lf9;

    .line 12
    .line 13
    const-string v2, "rfac809154b3e7cbf"

    .line 14
    .line 15
    const-string v3, "\u6309\u8bbe\u7f6e\u6295\u5582\u5931\u8d25: "

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lv71;->ζ(Ljava/lang/ClassLoader;)Lkf1;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    sget-object v3, Ljf1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    :try_start_1
    const-string v5, "\u6309\u8bbe\u7f6e\u6295\u5582\u5f02\u5e38"

    .line 33
    .line 34
    invoke-static {v2, v5, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    if-nez v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    goto :goto_0

    .line 52
    :catchall_1
    move-exception v0

    .line 53
    move-object p0, v0

    .line 54
    goto :goto_3

    .line 55
    :cond_0
    :goto_0
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    new-instance v6, Lkf1;

    .line 60
    .line 61
    const/4 v10, 0x0

    .line 62
    const/4 v11, 0x0

    .line 63
    const/4 v12, 0x1

    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    invoke-direct/range {v6 .. v13}, Lkf1;-><init>(IIIIIILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    .line 69
    .line 70
    sget-object v0, Ljf1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 71
    .line 72
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 73
    .line 74
    .line 75
    move-object v0, v6

    .line 76
    :goto_1
    :try_start_2
    new-instance v3, Lii0;

    .line 77
    .line 78
    const/16 v4, 0xd

    .line 79
    .line 80
    invoke-direct {v3, p0, v4, v0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 84
    .line 85
    .line 86
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :catchall_2
    move-exception v0

    .line 90
    move-object p0, v0

    .line 91
    new-instance v0, Leo1;

    .line 92
    .line 93
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object p0, v0

    .line 97
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-eqz p0, :cond_1

    .line 102
    .line 103
    const-string v0, "\u6309\u8bbe\u7f6e\u6295\u5582\u7ed3\u679c\u56de\u8c03\u5931\u8d25"

    .line 104
    .line 105
    invoke-static {v2, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    :cond_1
    return-void

    .line 109
    :goto_3
    sget-object v0, Ljf1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 110
    .line 111
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 112
    .line 113
    .line 114
    throw p0
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Le9;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/ClassLoader;

    .line 14
    .line 15
    sget-object v1, Lyf1;->ε:Lyf1;

    .line 16
    .line 17
    iget-object v2, p0, Le9;->θ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Landroid/app/Activity;

    .line 20
    .line 21
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lf9;

    .line 24
    .line 25
    const-string v4, "r86c859e3375e752"

    .line 26
    .line 27
    sget-object v6, Lag1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    const-string v7, "\u706b\u661f\u4efb\u52a1\u8c03\u8bd5\u5931\u8d25: "

    .line 30
    .line 31
    const-string v8, "\u706b\u661f\u4efb\u52a1\u8c03\u8bd5\u5f02\u5e38 mode="

    .line 32
    .line 33
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lag1;->β(Ljava/lang/ClassLoader;)Lzf1;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :goto_0
    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    :try_start_1
    new-instance v9, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v4, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-nez v1, :cond_0

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    goto :goto_1

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    move-object p0, v0

    .line 77
    goto :goto_4

    .line 78
    :cond_0
    :goto_1
    invoke-virtual {v7, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0, v3}, Lag1;->α(Ljava/lang/String;I)Lzf1;

    .line 83
    .line 84
    .line 85
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 86
    goto :goto_0

    .line 87
    :goto_2
    :try_start_2
    new-instance v1, Lii0;

    .line 88
    .line 89
    const/16 v3, 0xf

    .line 90
    .line 91
    invoke-direct {v1, p0, v3, v0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :catchall_2
    move-exception v0

    .line 101
    move-object p0, v0

    .line 102
    new-instance v0, Leo1;

    .line 103
    .line 104
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    move-object p0, v0

    .line 108
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-eqz p0, :cond_1

    .line 113
    .line 114
    const-string v0, "\u706b\u661f\u4efb\u52a1\u8c03\u8bd5\u7ed3\u679c\u56de\u8c03\u5931\u8d25"

    .line 115
    .line 116
    invoke-static {v4, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    :cond_1
    return-void

    .line 120
    :goto_4
    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    :pswitch_0
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v8, v0

    .line 127
    check-cast v8, Ljava/lang/String;

    .line 128
    .line 129
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 130
    .line 131
    move-object v9, v0

    .line 132
    check-cast v9, Landroid/app/Activity;

    .line 133
    .line 134
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 135
    .line 136
    move-object v7, p0

    .line 137
    check-cast v7, Landroid/widget/RadioButton;

    .line 138
    .line 139
    sget-object p0, Lpf1;->α:Ljava/lang/Object;

    .line 140
    .line 141
    const/16 p0, 0x50

    .line 142
    .line 143
    :try_start_3
    invoke-static {v9, p0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    invoke-static {v8, p0}, Lpf1;->β(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    .line 148
    .line 149
    .line 150
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 151
    goto :goto_5

    .line 152
    :catchall_3
    move-exception v0

    .line 153
    move-object p0, v0

    .line 154
    new-instance v0, Leo1;

    .line 155
    .line 156
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    move-object p0, v0

    .line 160
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-eqz v0, :cond_2

    .line 165
    .line 166
    const-string v1, "DYHelper"

    .line 167
    .line 168
    const-string v2, "\u98df\u7269\u56fe\u6807\u52a0\u8f7d\u5931\u8d25"

    .line 169
    .line 170
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    :cond_2
    instance-of v0, p0, Leo1;

    .line 174
    .line 175
    if-eqz v0, :cond_3

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_3
    move-object v4, p0

    .line 179
    :goto_6
    move-object v6, v4

    .line 180
    check-cast v6, Landroid/graphics/Bitmap;

    .line 181
    .line 182
    if-nez v6, :cond_4

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_4
    sget-object p0, Lpf1;->ε:Lwd1;

    .line 186
    .line 187
    monitor-enter p0

    .line 188
    :try_start_4
    invoke-virtual {p0, v8, v6}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Landroid/graphics/Bitmap;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 193
    .line 194
    monitor-exit p0

    .line 195
    :try_start_5
    new-instance v5, Lvg0;

    .line 196
    .line 197
    const/4 v10, 0x4

    .line 198
    invoke-direct/range {v5 .. v10}, Lvg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v9, v5}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 202
    .line 203
    .line 204
    sget-object p0, Ls62;->α:Ls62;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :catchall_4
    move-exception v0

    .line 208
    move-object p0, v0

    .line 209
    new-instance v0, Leo1;

    .line 210
    .line 211
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    move-object p0, v0

    .line 215
    :goto_7
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    if-eqz p0, :cond_5

    .line 220
    .line 221
    const-string v0, "DYHelper"

    .line 222
    .line 223
    const-string v1, "\u98df\u7269\u56fe\u6807\u56de\u8c03\u5931\u8d25"

    .line 224
    .line 225
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    :cond_5
    :goto_8
    return-void

    .line 229
    :catchall_5
    move-exception v0

    .line 230
    monitor-exit p0

    .line 231
    throw v0

    .line 232
    :pswitch_1
    invoke-direct {p0}, Le9;->α()V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :pswitch_2
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Ljava/lang/ClassLoader;

    .line 239
    .line 240
    iget-object v1, p0, Le9;->θ:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v1, Landroid/app/Activity;

    .line 243
    .line 244
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast p0, Lf9;

    .line 247
    .line 248
    const-string v2, "ra38c9f1519a93e5b"

    .line 249
    .line 250
    sget-object v4, Lif1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 251
    .line 252
    const-string v6, "\u98df\u7269\u5217\u8868\u8c03\u8bd5\u5931\u8d25: "

    .line 253
    .line 254
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-static {v0}, Lif1;->α(Ljava/lang/ClassLoader;)Lhf1;

    .line 258
    .line 259
    .line 260
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 261
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 262
    .line 263
    .line 264
    goto :goto_a

    .line 265
    :catchall_6
    move-exception v0

    .line 266
    :try_start_7
    const-string v7, "\u98df\u7269\u5217\u8868\u8c03\u8bd5\u5f02\u5e38"

    .line 267
    .line 268
    invoke-static {v2, v7, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 269
    .line 270
    .line 271
    new-instance v7, Lhf1;

    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-nez v0, :cond_6

    .line 278
    .line 279
    const-string v0, ""

    .line 280
    .line 281
    goto :goto_9

    .line 282
    :catchall_7
    move-exception v0

    .line 283
    move-object p0, v0

    .line 284
    goto :goto_c

    .line 285
    :cond_6
    :goto_9
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-direct {v7, v5, v5, v3, v0}, Lhf1;-><init>(IIILjava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 290
    .line 291
    .line 292
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 293
    .line 294
    .line 295
    move-object v0, v7

    .line 296
    :goto_a
    :try_start_8
    new-instance v3, Lii0;

    .line 297
    .line 298
    const/16 v4, 0xc

    .line 299
    .line 300
    invoke-direct {v3, p0, v4, v0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 304
    .line 305
    .line 306
    sget-object p0, Ls62;->α:Ls62;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 307
    .line 308
    goto :goto_b

    .line 309
    :catchall_8
    move-exception v0

    .line 310
    move-object p0, v0

    .line 311
    new-instance v0, Leo1;

    .line 312
    .line 313
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    move-object p0, v0

    .line 317
    :goto_b
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    if-eqz p0, :cond_7

    .line 322
    .line 323
    const-string v0, "\u98df\u7269\u5217\u8868\u8c03\u8bd5\u7ed3\u679c\u56de\u8c03\u5931\u8d25"

    .line 324
    .line 325
    invoke-static {v2, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    :cond_7
    return-void

    .line 329
    :goto_c
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 330
    .line 331
    .line 332
    throw p0

    .line 333
    :pswitch_3
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v0, Ljava/lang/ClassLoader;

    .line 336
    .line 337
    iget-object v1, p0, Le9;->θ:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v1, Landroid/app/Activity;

    .line 340
    .line 341
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast p0, Lg71;

    .line 344
    .line 345
    const-string v2, "rb4e434d444870f0e"

    .line 346
    .line 347
    sget-object v3, Lue1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 348
    .line 349
    const-string v4, "\u4eb2\u5bc6\u5ea6\u8c03\u8bd5\u5931\u8d25: "

    .line 350
    .line 351
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-static {v0}, Lue1;->α(Ljava/lang/ClassLoader;)Lte1;

    .line 355
    .line 356
    .line 357
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 358
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 359
    .line 360
    .line 361
    goto :goto_e

    .line 362
    :catchall_9
    move-exception v0

    .line 363
    :try_start_a
    const-string v6, "\u4eb2\u5bc6\u5ea6\u8c03\u8bd5\u5f02\u5e38"

    .line 364
    .line 365
    invoke-static {v2, v6, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 366
    .line 367
    .line 368
    new-instance v7, Lte1;

    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    if-nez v0, :cond_8

    .line 375
    .line 376
    const-string v0, ""

    .line 377
    .line 378
    goto :goto_d

    .line 379
    :catchall_a
    move-exception v0

    .line 380
    move-object p0, v0

    .line 381
    goto :goto_10

    .line 382
    :cond_8
    :goto_d
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v12

    .line 386
    const/4 v8, 0x0

    .line 387
    const/4 v9, 0x0

    .line 388
    const/4 v10, 0x0

    .line 389
    const/4 v11, 0x1

    .line 390
    invoke-direct/range {v7 .. v12}, Lte1;-><init>(IIIILjava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 391
    .line 392
    .line 393
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 394
    .line 395
    .line 396
    move-object v0, v7

    .line 397
    :goto_e
    :try_start_b
    new-instance v3, Lii0;

    .line 398
    .line 399
    const/16 v4, 0xb

    .line 400
    .line 401
    invoke-direct {v3, p0, v4, v0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 405
    .line 406
    .line 407
    sget-object p0, Ls62;->α:Ls62;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 408
    .line 409
    goto :goto_f

    .line 410
    :catchall_b
    move-exception v0

    .line 411
    move-object p0, v0

    .line 412
    new-instance v0, Leo1;

    .line 413
    .line 414
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 415
    .line 416
    .line 417
    move-object p0, v0

    .line 418
    :goto_f
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    if-eqz p0, :cond_9

    .line 423
    .line 424
    const-string v0, "\u4eb2\u5bc6\u5ea6\u8c03\u8bd5\u7ed3\u679c\u56de\u8c03\u5931\u8d25"

    .line 425
    .line 426
    invoke-static {v2, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 427
    .line 428
    .line 429
    :cond_9
    return-void

    .line 430
    :goto_10
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 431
    .line 432
    .line 433
    throw p0

    .line 434
    :pswitch_4
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v0, Ljava/lang/ClassLoader;

    .line 437
    .line 438
    iget-object v1, p0, Le9;->θ:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v1, Landroid/app/Activity;

    .line 441
    .line 442
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast p0, Lf9;

    .line 445
    .line 446
    const-string v2, "rb4e434d444870f0e"

    .line 447
    .line 448
    sget-object v3, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 449
    .line 450
    const-string v6, "\u4eb2\u5bc6\u5ea6\u9886\u53d6\u5931\u8d25: "

    .line 451
    .line 452
    :try_start_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    invoke-static {v0, v5, v4, v4}, Lse1;->β(Ljava/lang/ClassLoader;ZLjava/lang/String;Ljava/util/List;)Lqe1;

    .line 456
    .line 457
    .line 458
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 459
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 460
    .line 461
    .line 462
    goto :goto_12

    .line 463
    :catchall_c
    move-exception v0

    .line 464
    :try_start_d
    const-string v4, "\u624b\u52a8\u4eb2\u5bc6\u5ea6\u9886\u53d6\u5f02\u5e38"

    .line 465
    .line 466
    invoke-static {v2, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    if-nez v4, :cond_a

    .line 474
    .line 475
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v4

    .line 483
    goto :goto_11

    .line 484
    :catchall_d
    move-exception v0

    .line 485
    move-object p0, v0

    .line 486
    goto :goto_14

    .line 487
    :cond_a
    :goto_11
    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v13

    .line 491
    new-instance v7, Lqe1;

    .line 492
    .line 493
    const/4 v10, 0x0

    .line 494
    const/4 v11, 0x0

    .line 495
    const/4 v12, 0x1

    .line 496
    const/4 v8, 0x0

    .line 497
    const/4 v9, 0x0

    .line 498
    invoke-direct/range {v7 .. v13}, Lqe1;-><init>(IIIIILjava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 499
    .line 500
    .line 501
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 502
    .line 503
    .line 504
    move-object v0, v7

    .line 505
    :goto_12
    :try_start_e
    new-instance v3, Lii0;

    .line 506
    .line 507
    const/16 v4, 0xa

    .line 508
    .line 509
    invoke-direct {v3, p0, v4, v0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v1, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 513
    .line 514
    .line 515
    sget-object p0, Ls62;->α:Ls62;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 516
    .line 517
    goto :goto_13

    .line 518
    :catchall_e
    move-exception v0

    .line 519
    move-object p0, v0

    .line 520
    new-instance v0, Leo1;

    .line 521
    .line 522
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 523
    .line 524
    .line 525
    move-object p0, v0

    .line 526
    :goto_13
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 527
    .line 528
    .line 529
    move-result-object p0

    .line 530
    if-eqz p0, :cond_b

    .line 531
    .line 532
    const-string v0, "\u4eb2\u5bc6\u5ea6\u9886\u53d6\u7ed3\u679c\u56de\u8c03\u5931\u8d25"

    .line 533
    .line 534
    invoke-static {v2, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 535
    .line 536
    .line 537
    :cond_b
    return-void

    .line 538
    :goto_14
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 539
    .line 540
    .line 541
    throw p0

    .line 542
    :pswitch_5
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v0, Landroid/app/Activity;

    .line 545
    .line 546
    iget-object v5, p0, Le9;->ζ:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v5, La80;

    .line 549
    .line 550
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast p0, La80;

    .line 553
    .line 554
    sget-object v6, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 555
    .line 556
    invoke-static {v0}, Ldd1;->ζ(Landroid/app/Activity;)Ljava/lang/ClassLoader;

    .line 557
    .line 558
    .line 559
    move-result-object v6

    .line 560
    new-instance v7, Lhu;

    .line 561
    .line 562
    invoke-direct {v7, v0, v5, v3}, Lhu;-><init>(Landroid/app/Activity;La80;I)V

    .line 563
    .line 564
    .line 565
    invoke-static {v6, v3, v4, v7, v2}, Ljc1;->ξ(Ljava/lang/ClassLoader;ZLjava/util/LinkedHashSet;Lhu;I)Ldc1;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    new-instance v3, Lii0;

    .line 570
    .line 571
    invoke-direct {v3, p0, v1, v2}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 575
    .line 576
    .line 577
    return-void

    .line 578
    :pswitch_6
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v0, Landroid/app/Activity;

    .line 581
    .line 582
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v1, Ljava/lang/String;

    .line 585
    .line 586
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast p0, Lt9;

    .line 589
    .line 590
    iget-object p0, p0, Lt9;->β:Ljava/lang/String;

    .line 591
    .line 592
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    new-instance v2, Le9;

    .line 596
    .line 597
    invoke-direct {v2, v0, v1, p0, v5}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 601
    .line 602
    .line 603
    return-void

    .line 604
    :pswitch_7
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 605
    .line 606
    move-object v7, v0

    .line 607
    check-cast v7, Landroid/app/Activity;

    .line 608
    .line 609
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast v0, Ll71;

    .line 612
    .line 613
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast p0, Lf8;

    .line 616
    .line 617
    const-string v1, "4K"

    .line 618
    .line 619
    iget-object v2, v0, Ll71;->β:Ljava/lang/String;

    .line 620
    .line 621
    if-nez v2, :cond_c

    .line 622
    .line 623
    move-object v6, v1

    .line 624
    goto :goto_15

    .line 625
    :cond_c
    move-object v6, v2

    .line 626
    :goto_15
    const-string v8, "\u5df2\u627e\u5230\u539f\u753b\u8d28\uff1a"

    .line 627
    .line 628
    invoke-static {v5, v7, v8, v6}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    sget-object v5, Lqy0;->α:Lqy0;

    .line 632
    .line 633
    iget-object v0, v0, Ll71;->α:Ljava/lang/String;

    .line 634
    .line 635
    if-nez v2, :cond_d

    .line 636
    .line 637
    move-object v10, v1

    .line 638
    goto :goto_16

    .line 639
    :cond_d
    move-object v10, v2

    .line 640
    :goto_16
    new-instance v11, Lzx0;

    .line 641
    .line 642
    invoke-direct {v11, v7, p0, v3}, Lzx0;-><init>(Landroid/app/Activity;Lf8;I)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    invoke-static {v0}, Lqy0;->з(Ljava/lang/String;)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v8

    .line 655
    const-string v0, "http"

    .line 656
    .line 657
    invoke-static {v8, v0, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    if-nez v0, :cond_e

    .line 662
    .line 663
    const-string p0, "\u539f\u753b\u8d28\u94fe\u63a5\u65e0\u6548\uff0c\u6539\u7528\u666e\u901a\u4e0b\u8f7d"

    .line 664
    .line 665
    invoke-static {v7, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v11, v4}, Lzx0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    goto :goto_19

    .line 672
    :cond_e
    invoke-static {v7}, Lyh;->у(Landroid/content/Context;)Liu;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    iget-object v2, v0, Liu;->β:Ljava/lang/String;

    .line 677
    .line 678
    if-eqz v2, :cond_10

    .line 679
    .line 680
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 681
    .line 682
    .line 683
    move-result v2

    .line 684
    if-eqz v2, :cond_f

    .line 685
    .line 686
    goto :goto_17

    .line 687
    :cond_f
    invoke-virtual {v0}, Liu;->α()Z

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    if-nez v0, :cond_10

    .line 692
    .line 693
    const-string v0, "DYHelper"

    .line 694
    .line 695
    const-string v2, "[DOWNLOAD-STORAGE] \u5f53\u524d\u7a7a\u95f4\u65e0\u53ef\u7528 SAF \u6388\u6743\uff0c\u6539\u7528 MediaStore"

    .line 696
    .line 697
    invoke-static {v0, v2}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    :cond_10
    :goto_17
    const-string v0, "mp4"

    .line 701
    .line 702
    invoke-static {v7, p0, v0}, Lqy0;->γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-static {v0}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    sget-object v2, Ljy0;->ζ:Ljy0;

    .line 711
    .line 712
    invoke-static {v5, v7, p0, v2, v0}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 713
    .line 714
    .line 715
    move-result-object v9

    .line 716
    iget-object p0, v9, Lfv;->β:Ljava/lang/String;

    .line 717
    .line 718
    const-string v0, "8K"

    .line 719
    .line 720
    invoke-static {v10, v0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 721
    .line 722
    .line 723
    move-result v2

    .line 724
    if-eqz v2, :cond_11

    .line 725
    .line 726
    move-object v1, v0

    .line 727
    goto :goto_18

    .line 728
    :cond_11
    invoke-static {v10, v1, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    if-eqz v0, :cond_12

    .line 733
    .line 734
    goto :goto_18

    .line 735
    :cond_12
    const-string v1, "original"

    .line 736
    .line 737
    :goto_18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 738
    .line 739
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    const-string p0, "_"

    .line 746
    .line 747
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object p0

    .line 757
    invoke-static {p0}, Lku;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object p0

    .line 761
    const-string v0, ".mp4"

    .line 762
    .line 763
    invoke-static {p0, v0}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object p0

    .line 767
    new-instance v6, Lm90;

    .line 768
    .line 769
    const/4 v12, 0x3

    .line 770
    invoke-direct/range {v6 .. v12}, Lm90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 771
    .line 772
    .line 773
    invoke-static {v7, p0, v6}, Lqy0;->τ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 774
    .line 775
    .line 776
    :goto_19
    return-void

    .line 777
    :pswitch_8
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 778
    .line 779
    move-object v1, v0

    .line 780
    check-cast v1, Landroid/app/Activity;

    .line 781
    .line 782
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v0, Ljava/util/List;

    .line 785
    .line 786
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast p0, Lf8;

    .line 789
    .line 790
    sget-object v3, Lq71;->α:Lq71;

    .line 791
    .line 792
    :try_start_f
    invoke-static {v0}, Lq71;->ρ(Ljava/util/List;)Ll71;

    .line 793
    .line 794
    .line 795
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 796
    goto :goto_1a

    .line 797
    :catchall_f
    move-exception v0

    .line 798
    new-instance v3, Leo1;

    .line 799
    .line 800
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 801
    .line 802
    .line 803
    move-object v0, v3

    .line 804
    :goto_1a
    instance-of v3, v0, Leo1;

    .line 805
    .line 806
    if-eqz v3, :cond_13

    .line 807
    .line 808
    goto :goto_1b

    .line 809
    :cond_13
    move-object v4, v0

    .line 810
    :goto_1b
    check-cast v4, Ll71;

    .line 811
    .line 812
    if-nez v4, :cond_15

    .line 813
    .line 814
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    if-eqz v0, :cond_14

    .line 819
    .line 820
    const-string v3, "DYHelper"

    .line 821
    .line 822
    const-string v4, "\u539f\u753b\u8d28\u89e3\u6790\u5931\u8d25\uff0c\u6539\u7528\u666e\u901a\u4e0b\u8f7d"

    .line 823
    .line 824
    invoke-static {v3, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 825
    .line 826
    .line 827
    :cond_14
    new-instance v0, Lzk0;

    .line 828
    .line 829
    invoke-direct {v0, v1, p0, v2}, Lzk0;-><init>(Landroid/app/Activity;Lf8;I)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 833
    .line 834
    .line 835
    goto :goto_1c

    .line 836
    :cond_15
    new-instance v0, Le9;

    .line 837
    .line 838
    const/16 v2, 0x15

    .line 839
    .line 840
    invoke-direct {v0, v1, v4, p0, v2}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 844
    .line 845
    .line 846
    :goto_1c
    return-void

    .line 847
    :pswitch_9
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast v0, Landroid/app/Activity;

    .line 850
    .line 851
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v1, Lsm1;

    .line 854
    .line 855
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast p0, Ljava/util/ArrayList;

    .line 858
    .line 859
    sget-object v2, Lqy0;->α:Lqy0;

    .line 860
    .line 861
    iget v1, v1, Lsm1;->ε:I

    .line 862
    .line 863
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 864
    .line 865
    .line 866
    move-result p0

    .line 867
    const-string v2, "\u5df2\u4fdd\u5b58 "

    .line 868
    .line 869
    const-string v3, "/"

    .line 870
    .line 871
    const-string v4, " \u5f20\u56fe\u7247"

    .line 872
    .line 873
    invoke-static {v2, v1, v3, p0, v4}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object p0

    .line 877
    invoke-static {v0, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    return-void

    .line 881
    :pswitch_a
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v0, Landroid/app/Activity;

    .line 884
    .line 885
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 886
    .line 887
    check-cast v1, Ljava/lang/String;

    .line 888
    .line 889
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast p0, La80;

    .line 892
    .line 893
    new-instance v2, Landroid/widget/EditText;

    .line 894
    .line 895
    invoke-direct {v2, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 914
    .line 915
    .line 916
    move-result-object v3

    .line 917
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 918
    .line 919
    .line 920
    move-result v3

    .line 921
    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setSelection(I)V

    .line 922
    .line 923
    .line 924
    const v3, 0x80001

    .line 925
    .line 926
    .line 927
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setInputType(I)V

    .line 928
    .line 929
    .line 930
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 931
    .line 932
    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 933
    .line 934
    .line 935
    const-string v0, "\u786e\u8ba4\u6587\u4ef6\u540d"

    .line 936
    .line 937
    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    const-string v3, "\u4fdd\u5b58"

    .line 946
    .line 947
    new-instance v6, Ley0;

    .line 948
    .line 949
    invoke-direct {v6, p0, v2, v1, v5}, Ley0;-><init>(La80;Landroid/widget/EditText;Ljava/lang/String;I)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v0, v3, v6}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 953
    .line 954
    .line 955
    move-result-object p0

    .line 956
    const-string v0, "\u53d6\u6d88"

    .line 957
    .line 958
    invoke-virtual {p0, v0, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 959
    .line 960
    .line 961
    move-result-object p0

    .line 962
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 963
    .line 964
    .line 965
    move-result-object p0

    .line 966
    new-instance v0, Lfy0;

    .line 967
    .line 968
    invoke-direct {v0, p0, v2, v5}, Lfy0;-><init>(Landroid/app/AlertDialog;Landroid/widget/EditText;I)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 975
    .line 976
    .line 977
    return-void

    .line 978
    :pswitch_b
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 979
    .line 980
    check-cast v0, Landroid/app/Activity;

    .line 981
    .line 982
    iget-object v1, p0, Le9;->η:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v1, Lzx0;

    .line 985
    .line 986
    iget-object p0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 987
    .line 988
    check-cast p0, Ljava/lang/String;

    .line 989
    .line 990
    sget-object v2, Lqy0;->α:Lqy0;

    .line 991
    .line 992
    const-string v2, "\u539f\u753b\u8d28\u4e0b\u8f7d\u5931\u8d25\uff0c\u6539\u7528\u666e\u901a\u89c6\u9891\u4e0b\u8f7d"

    .line 993
    .line 994
    invoke-static {v0, v2}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v1, p0}, Lzx0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    return-void

    .line 1001
    :pswitch_c
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v0, Lm3;

    .line 1004
    .line 1005
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast v1, Landroid/graphics/Bitmap;

    .line 1008
    .line 1009
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 1010
    .line 1011
    check-cast p0, Landroid/app/AlertDialog;

    .line 1012
    .line 1013
    invoke-virtual {v0, v1}, Lm3;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 1017
    .line 1018
    .line 1019
    return-void

    .line 1020
    :pswitch_d
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1021
    .line 1022
    check-cast v0, Ldc0;

    .line 1023
    .line 1024
    iget-object v1, p0, Le9;->η:Ljava/lang/Object;

    .line 1025
    .line 1026
    check-cast v1, Lpt;

    .line 1027
    .line 1028
    iget-object p0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1029
    .line 1030
    check-cast p0, Ljava/lang/String;

    .line 1031
    .line 1032
    iget-object v2, v0, Ldc0;->ο:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1033
    .line 1034
    iget-object v4, v0, Ldc0;->π:Ljava/util/LinkedHashMap;

    .line 1035
    .line 1036
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1037
    .line 1038
    .line 1039
    move-result v2

    .line 1040
    if-eqz v2, :cond_16

    .line 1041
    .line 1042
    goto :goto_1e

    .line 1043
    :cond_16
    iget-object v2, v0, Ldc0;->σ:Ljava/util/List;

    .line 1044
    .line 1045
    if-eqz v2, :cond_17

    .line 1046
    .line 1047
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1048
    .line 1049
    .line 1050
    move-result v6

    .line 1051
    if-eqz v6, :cond_17

    .line 1052
    .line 1053
    goto :goto_1e

    .line 1054
    :cond_17
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v2

    .line 1058
    :cond_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1059
    .line 1060
    .line 1061
    move-result v6

    .line 1062
    if-eqz v6, :cond_1b

    .line 1063
    .line 1064
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v6

    .line 1068
    check-cast v6, Lic0;

    .line 1069
    .line 1070
    iget-wide v6, v6, Lic0;->β:J

    .line 1071
    .line 1072
    iget-wide v8, v1, Lpt;->α:J

    .line 1073
    .line 1074
    cmp-long v6, v6, v8

    .line 1075
    .line 1076
    if-nez v6, :cond_18

    .line 1077
    .line 1078
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v1

    .line 1082
    invoke-interface {v4, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    iget-object p0, v0, Ldc0;->ρ:Lub0;

    .line 1086
    .line 1087
    iget-object v1, v0, Ldc0;->σ:Ljava/util/List;

    .line 1088
    .line 1089
    iget-boolean v2, v0, Ldc0;->υ:Z

    .line 1090
    .line 1091
    if-nez v2, :cond_1a

    .line 1092
    .line 1093
    iget-boolean v0, v0, Ldc0;->φ:Z

    .line 1094
    .line 1095
    if-eqz v0, :cond_19

    .line 1096
    .line 1097
    goto :goto_1d

    .line 1098
    :cond_19
    move v3, v5

    .line 1099
    :cond_1a
    :goto_1d
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1103
    .line 1104
    .line 1105
    iget-object v0, p0, Lub0;->η:Ljava/util/ArrayList;

    .line 1106
    .line 1107
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1111
    .line 1112
    .line 1113
    iget-object v0, p0, Lub0;->θ:Ljava/util/LinkedHashMap;

    .line 1114
    .line 1115
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v0, v4}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 1119
    .line 1120
    .line 1121
    iput-boolean v3, p0, Lub0;->κ:Z

    .line 1122
    .line 1123
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 1124
    .line 1125
    .line 1126
    :cond_1b
    :goto_1e
    return-void

    .line 1127
    :pswitch_e
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1128
    .line 1129
    move-object v1, v0

    .line 1130
    check-cast v1, Ljava/lang/String;

    .line 1131
    .line 1132
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1133
    .line 1134
    check-cast v0, Landroid/content/Context;

    .line 1135
    .line 1136
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 1137
    .line 1138
    check-cast p0, Lp70;

    .line 1139
    .line 1140
    sget-object v2, Lu90;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 1141
    .line 1142
    :try_start_10
    sget-object v3, Lu90;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1143
    .line 1144
    new-instance v4, Lp90;

    .line 1145
    .line 1146
    invoke-static {v0, v1}, Lu90;->η(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    invoke-direct {v4, v0}, Lp90;-><init>(Ljava/lang/String;)V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v3, v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 1157
    .line 1158
    .line 1159
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    return-void

    .line 1163
    :catchall_10
    move-exception v0

    .line 1164
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 1165
    .line 1166
    .line 1167
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    throw v0

    .line 1171
    :pswitch_f
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1172
    .line 1173
    move-object v1, v0

    .line 1174
    check-cast v1, Ljava/lang/String;

    .line 1175
    .line 1176
    iget-object v0, p0, Le9;->η:Ljava/lang/Object;

    .line 1177
    .line 1178
    check-cast v0, Lo10;

    .line 1179
    .line 1180
    iget-object p0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast p0, Landroid/app/Activity;

    .line 1183
    .line 1184
    const-string v3, "\u5f53\u524d\u4f5c\u54c1\u7684"

    .line 1185
    .line 1186
    const-string v6, "FeedGestureHook"

    .line 1187
    .line 1188
    iget-object v7, v0, Lo10;->ε:Ljava/lang/String;

    .line 1189
    .line 1190
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 1191
    .line 1192
    .line 1193
    move-result v8

    .line 1194
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 1195
    .line 1196
    .line 1197
    move-result v9

    .line 1198
    const-string v10, "Feed \u539f\u751f\u4e92\u52a8\u52a8\u4f5c\u5f00\u59cb\u6267\u884c action="

    .line 1199
    .line 1200
    const-string v11, " hostAction="

    .line 1201
    .line 1202
    const-string v12, " finishing="

    .line 1203
    .line 1204
    invoke-static {v10, v1, v11, v7, v12}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v10

    .line 1208
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1209
    .line 1210
    .line 1211
    const-string v8, " destroyed="

    .line 1212
    .line 1213
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v8

    .line 1223
    invoke-static {v6, v8, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 1227
    .line 1228
    .line 1229
    move-result v8

    .line 1230
    if-nez v8, :cond_1d

    .line 1231
    .line 1232
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 1233
    .line 1234
    .line 1235
    move-result v8

    .line 1236
    if-eqz v8, :cond_1c

    .line 1237
    .line 1238
    goto :goto_1f

    .line 1239
    :cond_1c
    :try_start_11
    sget-object v8, Lq10;->α:Lq10;

    .line 1240
    .line 1241
    invoke-static {p0, v0}, Lq10;->κ(Landroid/app/Activity;Lo10;)Z

    .line 1242
    .line 1243
    .line 1244
    move-result v0

    .line 1245
    if-nez v0, :cond_1e

    .line 1246
    .line 1247
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1248
    .line 1249
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1253
    .line 1254
    .line 1255
    const-string v3, "\u529f\u80fd\u5c1a\u672a\u5c31\u7eea"

    .line 1256
    .line 1257
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v0

    .line 1268
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_11

    .line 1269
    .line 1270
    .line 1271
    goto :goto_20

    .line 1272
    :catchall_11
    move-exception v0

    .line 1273
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v0

    .line 1277
    const-string v3, "Feed \u539f\u751f\u4e92\u52a8\u52a8\u4f5c\u5f02\u5e38 action="

    .line 1278
    .line 1279
    const-string v7, " error="

    .line 1280
    .line 1281
    invoke-static {v3, v1, v7, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    invoke-static {v6, v0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1286
    .line 1287
    .line 1288
    const-string v0, "\u4f5c\u54c1\u4e92\u52a8\u64cd\u4f5c\u5f02\u5e38"

    .line 1289
    .line 1290
    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1291
    .line 1292
    .line 1293
    move-result-object p0

    .line 1294
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 1295
    .line 1296
    .line 1297
    goto :goto_20

    .line 1298
    :cond_1d
    :goto_1f
    const-string p0, "Feed \u539f\u751f\u4e92\u52a8\u52a8\u4f5c\u8df3\u8fc7: Activity \u5df2\u7ed3\u675f action="

    .line 1299
    .line 1300
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1301
    .line 1302
    .line 1303
    move-result-object p0

    .line 1304
    invoke-static {v6, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1305
    .line 1306
    .line 1307
    :cond_1e
    :goto_20
    return-void

    .line 1308
    :pswitch_10
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1309
    .line 1310
    check-cast v0, Lv10;

    .line 1311
    .line 1312
    iget-object v1, p0, Le9;->η:Ljava/lang/Object;

    .line 1313
    .line 1314
    check-cast v1, Lum1;

    .line 1315
    .line 1316
    iget-object p0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1317
    .line 1318
    check-cast p0, Landroid/app/Activity;

    .line 1319
    .line 1320
    const-string v5, "FeedGestureHook"

    .line 1321
    .line 1322
    const-string v6, "\u6a21\u5757\u957f\u6309\u89e6\u53d1 area="

    .line 1323
    .line 1324
    :try_start_12
    iget-object v7, v0, Lv10;->κ:Ljava/lang/Runnable;

    .line 1325
    .line 1326
    iget-object v1, v1, Lum1;->ε:Ljava/lang/Object;

    .line 1327
    .line 1328
    if-eqz v1, :cond_25

    .line 1329
    .line 1330
    check-cast v1, Ljava/lang/Runnable;

    .line 1331
    .line 1332
    if-eq v7, v1, :cond_1f

    .line 1333
    .line 1334
    goto :goto_22

    .line 1335
    :cond_1f
    iget-boolean v1, v0, Lv10;->α:Z

    .line 1336
    .line 1337
    if-nez v1, :cond_20

    .line 1338
    .line 1339
    goto :goto_22

    .line 1340
    :cond_20
    iget-boolean v1, v0, Lv10;->η:Z

    .line 1341
    .line 1342
    if-eqz v1, :cond_21

    .line 1343
    .line 1344
    goto :goto_22

    .line 1345
    :cond_21
    iget-boolean v1, v0, Lv10;->θ:Z

    .line 1346
    .line 1347
    if-eqz v1, :cond_22

    .line 1348
    .line 1349
    goto :goto_22

    .line 1350
    :cond_22
    sget-object v1, Lx10;->α:Lx10;

    .line 1351
    .line 1352
    invoke-static {p0, v0, v3}, Lx10;->μ(Landroid/app/Activity;Lv10;Z)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v1

    .line 1356
    if-nez v1, :cond_23

    .line 1357
    .line 1358
    invoke-static {v0}, Lx10;->ε(Lv10;)V

    .line 1359
    .line 1360
    .line 1361
    goto :goto_22

    .line 1362
    :catchall_12
    move-exception v0

    .line 1363
    move-object p0, v0

    .line 1364
    goto :goto_21

    .line 1365
    :cond_23
    iget-object v1, v0, Lv10;->ζ:Ljava/lang/String;

    .line 1366
    .line 1367
    sget-object v7, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 1368
    .line 1369
    invoke-static {v1}, Li2;->ρ(Ljava/lang/String;)Z

    .line 1370
    .line 1371
    .line 1372
    move-result v7

    .line 1373
    if-nez v7, :cond_24

    .line 1374
    .line 1375
    goto :goto_22

    .line 1376
    :cond_24
    iput-boolean v3, v0, Lv10;->θ:Z

    .line 1377
    .line 1378
    iget-object v3, v0, Lv10;->ε:Ljava/lang/String;

    .line 1379
    .line 1380
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1381
    .line 1382
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1383
    .line 1384
    .line 1385
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1386
    .line 1387
    .line 1388
    const-string v3, " action="

    .line 1389
    .line 1390
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v3

    .line 1400
    invoke-static {v5, v3, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1401
    .line 1402
    .line 1403
    invoke-static {p0, v0}, Lx10;->ο(Landroid/app/Activity;Lv10;)V

    .line 1404
    .line 1405
    .line 1406
    invoke-static {p0, v1}, Lx10;->η(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1407
    .line 1408
    .line 1409
    goto :goto_22

    .line 1410
    :cond_25
    const-string p0, "runnable"

    .line 1411
    .line 1412
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 1413
    .line 1414
    .line 1415
    throw v4
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    .line 1416
    :goto_21
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1417
    .line 1418
    .line 1419
    move-result-object p0

    .line 1420
    const-string v0, "\u6a21\u5757\u957f\u6309\u6267\u884c\u5931\u8d25: "

    .line 1421
    .line 1422
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object p0

    .line 1426
    invoke-static {v5, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1427
    .line 1428
    .line 1429
    :goto_22
    return-void

    .line 1430
    :pswitch_11
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1431
    .line 1432
    check-cast v0, Lq10;

    .line 1433
    .line 1434
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1435
    .line 1436
    check-cast v1, Landroid/view/View;

    .line 1437
    .line 1438
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 1439
    .line 1440
    check-cast p0, Landroid/view/View$OnClickListener;

    .line 1441
    .line 1442
    invoke-static {v0, v1, p0}, Lq10;->α(Lq10;Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 1443
    .line 1444
    .line 1445
    return-void

    .line 1446
    :pswitch_12
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1447
    .line 1448
    check-cast v0, Lｍ;

    .line 1449
    .line 1450
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1451
    .line 1452
    check-cast v1, Lpd2;

    .line 1453
    .line 1454
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 1455
    .line 1456
    check-cast p0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 1457
    .line 1458
    :try_start_13
    iget-object v0, v0, Lｍ;->α:Landroid/content/Context;

    .line 1459
    .line 1460
    invoke-static {v0}, Lln0;->σ(Landroid/content/Context;)Lp50;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v0

    .line 1464
    if-eqz v0, :cond_26

    .line 1465
    .line 1466
    iget-object v2, v0, Lp50;->α:Liy;

    .line 1467
    .line 1468
    check-cast v2, Lo50;

    .line 1469
    .line 1470
    iget-object v3, v2, Lo50;->δ:Ljava/lang/Object;

    .line 1471
    .line 1472
    monitor-enter v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_13

    .line 1473
    :try_start_14
    iput-object p0, v2, Lo50;->ζ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 1474
    .line 1475
    monitor-exit v3
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_14

    .line 1476
    :try_start_15
    iget-object v0, v0, Lp50;->α:Liy;

    .line 1477
    .line 1478
    new-instance v2, Lly;

    .line 1479
    .line 1480
    invoke-direct {v2, v1, p0}, Lly;-><init>(Lpd2;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 1481
    .line 1482
    .line 1483
    invoke-interface {v0, v2}, Liy;->α(Lpd2;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_13

    .line 1484
    .line 1485
    .line 1486
    goto :goto_24

    .line 1487
    :catchall_13
    move-exception v0

    .line 1488
    goto :goto_23

    .line 1489
    :catchall_14
    move-exception v0

    .line 1490
    :try_start_16
    monitor-exit v3
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_14

    .line 1491
    :try_start_17
    throw v0

    .line 1492
    :cond_26
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1493
    .line 1494
    const-string v2, "EmojiCompat font provider not available on this device."

    .line 1495
    .line 1496
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1497
    .line 1498
    .line 1499
    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_13

    .line 1500
    :goto_23
    invoke-virtual {v1, v0}, Lpd2;->Ε(Ljava/lang/Throwable;)V

    .line 1501
    .line 1502
    .line 1503
    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 1504
    .line 1505
    .line 1506
    :goto_24
    return-void

    .line 1507
    :pswitch_13
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1508
    .line 1509
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1510
    .line 1511
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1512
    .line 1513
    check-cast v1, Lθ;

    .line 1514
    .line 1515
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 1516
    .line 1517
    check-cast p0, Lf8;

    .line 1518
    .line 1519
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v0

    .line 1523
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1524
    .line 1525
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    move-result v0

    .line 1529
    if-nez v0, :cond_27

    .line 1530
    .line 1531
    invoke-virtual {v1, p0}, Lθ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1532
    .line 1533
    .line 1534
    :cond_27
    return-void

    .line 1535
    :pswitch_14
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1536
    .line 1537
    check-cast v0, Landroid/app/Activity;

    .line 1538
    .line 1539
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1540
    .line 1541
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 1542
    .line 1543
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 1544
    .line 1545
    check-cast p0, Lp70;

    .line 1546
    .line 1547
    invoke-static {v0, v1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->δ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lp70;)V

    .line 1548
    .line 1549
    .line 1550
    return-void

    .line 1551
    :pswitch_15
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1552
    .line 1553
    check-cast v0, Landroid/app/Activity;

    .line 1554
    .line 1555
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1556
    .line 1557
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;

    .line 1558
    .line 1559
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 1560
    .line 1561
    check-cast p0, La80;

    .line 1562
    .line 1563
    invoke-static {v0, v1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->β(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;La80;)V

    .line 1564
    .line 1565
    .line 1566
    return-void

    .line 1567
    :pswitch_16
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1568
    .line 1569
    check-cast v0, Ldj;

    .line 1570
    .line 1571
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1572
    .line 1573
    check-cast v1, [B

    .line 1574
    .line 1575
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 1576
    .line 1577
    check-cast p0, Lej;

    .line 1578
    .line 1579
    sget-object v2, Lfj;->π:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1580
    .line 1581
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v2

    .line 1585
    if-eq v2, v0, :cond_28

    .line 1586
    .line 1587
    goto :goto_26

    .line 1588
    :cond_28
    array-length v2, v1

    .line 1589
    if-nez v2, :cond_29

    .line 1590
    .line 1591
    goto :goto_26

    .line 1592
    :cond_29
    iget-object v2, v0, Ldj;->ζ:Ljava/lang/Object;

    .line 1593
    .line 1594
    monitor-enter v2

    .line 1595
    :try_start_18
    iget-object v4, v0, Ldj;->κ:Lej;

    .line 1596
    .line 1597
    if-nez v4, :cond_2a

    .line 1598
    .line 1599
    iput-object p0, v0, Ldj;->κ:Lej;

    .line 1600
    .line 1601
    goto :goto_25

    .line 1602
    :catchall_15
    move-exception v0

    .line 1603
    move-object p0, v0

    .line 1604
    goto :goto_27

    .line 1605
    :cond_2a
    :goto_25
    iget-object p0, v0, Ldj;->η:Ljava/io/BufferedOutputStream;

    .line 1606
    .line 1607
    if-nez p0, :cond_2b

    .line 1608
    .line 1609
    new-instance p0, Ljava/io/BufferedOutputStream;

    .line 1610
    .line 1611
    new-instance v4, Ljava/io/FileOutputStream;

    .line 1612
    .line 1613
    iget-object v5, v0, Ldj;->γ:Ljava/io/File;

    .line 1614
    .line 1615
    invoke-direct {v4, v5, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 1616
    .line 1617
    .line 1618
    const/high16 v3, 0x10000

    .line 1619
    .line 1620
    invoke-direct {p0, v4, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 1621
    .line 1622
    .line 1623
    iput-object p0, v0, Ldj;->η:Ljava/io/BufferedOutputStream;

    .line 1624
    .line 1625
    :cond_2b
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 1626
    .line 1627
    .line 1628
    iget-wide v3, v0, Ldj;->θ:J

    .line 1629
    .line 1630
    array-length p0, v1

    .line 1631
    int-to-long v5, p0

    .line 1632
    add-long/2addr v3, v5

    .line 1633
    iput-wide v3, v0, Ldj;->θ:J

    .line 1634
    .line 1635
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1636
    .line 1637
    .line 1638
    move-result-wide v3

    .line 1639
    iput-wide v3, v0, Ldj;->ι:J
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_15

    .line 1640
    .line 1641
    monitor-exit v2

    .line 1642
    :goto_26
    return-void

    .line 1643
    :goto_27
    monitor-exit v2

    .line 1644
    throw p0

    .line 1645
    :pswitch_17
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1646
    .line 1647
    check-cast v0, Lcj;

    .line 1648
    .line 1649
    iget-object v1, v0, Lcj;->α:Ljava/lang/String;

    .line 1650
    .line 1651
    iget-object v2, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1652
    .line 1653
    check-cast v2, Landroid/content/Context;

    .line 1654
    .line 1655
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 1656
    .line 1657
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1658
    .line 1659
    sget-object v3, Lfj;->α:Lfj;

    .line 1660
    .line 1661
    const-string v3, "\u8bc4\u8bba\u8bed\u97f3\u4fdd\u5b58\u5931\u8d25: "

    .line 1662
    .line 1663
    const-string v6, "\u8bc4\u8bba\u8bed\u97f3\u4fdd\u5b58\u5f02\u5e38 vid="

    .line 1664
    .line 1665
    :try_start_19
    sget-object v7, Lfj;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1666
    .line 1667
    invoke-virtual {v7, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v7

    .line 1671
    check-cast v7, Lcj;

    .line 1672
    .line 1673
    if-nez v7, :cond_2c

    .line 1674
    .line 1675
    goto :goto_28

    .line 1676
    :cond_2c
    move-object v0, v7

    .line 1677
    :goto_28
    iget-object v7, v0, Lcj;->β:Ljava/lang/String;

    .line 1678
    .line 1679
    iget-boolean v8, v0, Lcj;->γ:Z

    .line 1680
    .line 1681
    if-nez v8, :cond_30

    .line 1682
    .line 1683
    invoke-static {v7}, Lfj;->υ(Ljava/lang/String;)Z

    .line 1684
    .line 1685
    .line 1686
    move-result v7

    .line 1687
    if-eqz v7, :cond_2d

    .line 1688
    .line 1689
    goto :goto_2b

    .line 1690
    :cond_2d
    invoke-static {v0}, Lfj;->Β(Lcj;)Ljava/lang/String;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v7

    .line 1694
    if-eqz v7, :cond_2f

    .line 1695
    .line 1696
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1697
    .line 1698
    .line 1699
    move-result v8

    .line 1700
    if-eqz v8, :cond_2e

    .line 1701
    .line 1702
    goto :goto_2a

    .line 1703
    :cond_2e
    invoke-static {v2, v7, v0}, Lfj;->θ(Landroid/content/Context;Ljava/lang/String;Lcj;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_16

    .line 1704
    .line 1705
    .line 1706
    :goto_29
    invoke-virtual {p0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1707
    .line 1708
    .line 1709
    goto :goto_2e

    .line 1710
    :catchall_16
    move-exception v0

    .line 1711
    goto :goto_2c

    .line 1712
    :cond_2f
    :goto_2a
    :try_start_1a
    invoke-static {v2, v0, p0}, Lfj;->α(Landroid/content/Context;Lcj;Ljava/util/concurrent/atomic/AtomicBoolean;)Z

    .line 1713
    .line 1714
    .line 1715
    move-result v0

    .line 1716
    if-nez v0, :cond_32

    .line 1717
    .line 1718
    goto :goto_29

    .line 1719
    :cond_30
    :goto_2b
    invoke-static {v2, v0}, Lfj;->ζ(Landroid/content/Context;Lcj;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_16

    .line 1720
    .line 1721
    .line 1722
    goto :goto_29

    .line 1723
    :goto_2c
    :try_start_1b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v7

    .line 1727
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1728
    .line 1729
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1730
    .line 1731
    .line 1732
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1733
    .line 1734
    .line 1735
    const-string v1, " err="

    .line 1736
    .line 1737
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1738
    .line 1739
    .line 1740
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1741
    .line 1742
    .line 1743
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v1

    .line 1747
    invoke-static {v1}, Lfj;->φ(Ljava/lang/String;)V

    .line 1748
    .line 1749
    .line 1750
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v0

    .line 1754
    if-eqz v0, :cond_31

    .line 1755
    .line 1756
    const/16 v1, 0x28

    .line 1757
    .line 1758
    invoke-static {v0, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v4

    .line 1762
    goto :goto_2d

    .line 1763
    :catchall_17
    move-exception v0

    .line 1764
    goto :goto_2f

    .line 1765
    :cond_31
    :goto_2d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1766
    .line 1767
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1768
    .line 1769
    .line 1770
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1771
    .line 1772
    .line 1773
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v0

    .line 1777
    invoke-static {v2, v0}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_17

    .line 1778
    .line 1779
    .line 1780
    goto :goto_29

    .line 1781
    :cond_32
    :goto_2e
    return-void

    .line 1782
    :goto_2f
    invoke-virtual {p0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1783
    .line 1784
    .line 1785
    throw v0

    .line 1786
    :pswitch_18
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1787
    .line 1788
    check-cast v0, Landroid/view/View;

    .line 1789
    .line 1790
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1791
    .line 1792
    check-cast v1, Lig;

    .line 1793
    .line 1794
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 1795
    .line 1796
    check-cast p0, Ldh;

    .line 1797
    .line 1798
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1799
    .line 1800
    .line 1801
    move-result v2

    .line 1802
    if-eqz v2, :cond_33

    .line 1803
    .line 1804
    iget-object p0, p0, Ldh;->γ:Ljava/lang/String;

    .line 1805
    .line 1806
    const-string v2, " attached"

    .line 1807
    .line 1808
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1809
    .line 1810
    .line 1811
    move-result-object p0

    .line 1812
    invoke-virtual {v1, v0, p0}, Lig;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1813
    .line 1814
    .line 1815
    :cond_33
    return-void

    .line 1816
    :pswitch_19
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 1817
    .line 1818
    move-object v7, v0

    .line 1819
    check-cast v7, Landroid/view/View;

    .line 1820
    .line 1821
    iget-object v0, p0, Le9;->η:Ljava/lang/Object;

    .line 1822
    .line 1823
    move-object v6, v0

    .line 1824
    check-cast v6, Ltg;

    .line 1825
    .line 1826
    iget-object p0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 1827
    .line 1828
    check-cast p0, Ljava/lang/String;

    .line 1829
    .line 1830
    const v0, 0x7f0deae5

    .line 1831
    .line 1832
    .line 1833
    invoke-virtual {v7, v0, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 1834
    .line 1835
    .line 1836
    const v0, 0x7f0deae6

    .line 1837
    .line 1838
    .line 1839
    invoke-virtual {v7, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v8

    .line 1843
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1844
    .line 1845
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1846
    .line 1847
    .line 1848
    move-result v8

    .line 1849
    const-string v9, "~796896D9FD9A99E3FF60F870F520A872CAB9C9E837D81AFF017266A3E9979F463DE356D00EC2BD454B6297D77AC58FCC046CA8A6B257A19D285C5090E83692"

    .line 1850
    .line 1851
    invoke-static {v9}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v9

    .line 1855
    invoke-static {v7, v9}, Ltg;->Ξ(Landroid/view/View;Ljava/lang/String;)Z

    .line 1856
    .line 1857
    .line 1858
    move-result v9

    .line 1859
    if-nez v9, :cond_35

    .line 1860
    .line 1861
    :cond_34
    :goto_30
    move-object v1, v4

    .line 1862
    goto/16 :goto_36

    .line 1863
    .line 1864
    :cond_35
    invoke-static {v7}, Ltg;->τ(Landroid/view/View;)Ljava/lang/String;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v9

    .line 1868
    const-string v10, "cfm"

    .line 1869
    .line 1870
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1871
    .line 1872
    .line 1873
    move-result v10

    .line 1874
    if-eqz v10, :cond_36

    .line 1875
    .line 1876
    sget-object v9, Lcg;->ε:Lcg;

    .line 1877
    .line 1878
    goto :goto_31

    .line 1879
    :cond_36
    const-string v10, "e68"

    .line 1880
    .line 1881
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1882
    .line 1883
    .line 1884
    move-result v9

    .line 1885
    if-eqz v9, :cond_37

    .line 1886
    .line 1887
    sget-object v9, Lcg;->ζ:Lcg;

    .line 1888
    .line 1889
    goto :goto_31

    .line 1890
    :cond_37
    move-object v9, v4

    .line 1891
    :goto_31
    if-nez v9, :cond_38

    .line 1892
    .line 1893
    goto :goto_30

    .line 1894
    :cond_38
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v10

    .line 1898
    :goto_32
    instance-of v11, v10, Landroid/view/View;

    .line 1899
    .line 1900
    if-eqz v11, :cond_3a

    .line 1901
    .line 1902
    check-cast v10, Landroid/view/View;

    .line 1903
    .line 1904
    const-string v11, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B176FF618D47B48161BBD6802803BCEF2506F2675D8864E9F"

    .line 1905
    .line 1906
    invoke-static {v11}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v11

    .line 1910
    invoke-static {v10, v11}, Ltg;->Ξ(Landroid/view/View;Ljava/lang/String;)Z

    .line 1911
    .line 1912
    .line 1913
    move-result v11

    .line 1914
    if-eqz v11, :cond_39

    .line 1915
    .line 1916
    goto :goto_33

    .line 1917
    :cond_39
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v10

    .line 1921
    goto :goto_32

    .line 1922
    :cond_3a
    move-object v10, v4

    .line 1923
    :goto_33
    if-nez v10, :cond_3b

    .line 1924
    .line 1925
    goto :goto_30

    .line 1926
    :cond_3b
    move v11, v5

    .line 1927
    move-object v10, v7

    .line 1928
    :goto_34
    instance-of v12, v10, Landroid/view/View;

    .line 1929
    .line 1930
    if-eqz v12, :cond_3e

    .line 1931
    .line 1932
    const/16 v12, 0x20

    .line 1933
    .line 1934
    if-ge v11, v12, :cond_3e

    .line 1935
    .line 1936
    check-cast v10, Landroid/view/View;

    .line 1937
    .line 1938
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v12

    .line 1942
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v12

    .line 1946
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v13

    .line 1950
    invoke-virtual {v13}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v13

    .line 1954
    const-string v14, "SearchTagViewGroup"

    .line 1955
    .line 1956
    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1957
    .line 1958
    .line 1959
    move-result v14

    .line 1960
    if-eqz v14, :cond_3c

    .line 1961
    .line 1962
    goto :goto_35

    .line 1963
    :cond_3c
    const-string v14, "~79141EF2EADECCDC45870F63A13D0E3014AC1E082CF7AEA788F31D8EC33850F7"

    .line 1964
    .line 1965
    invoke-static {v14}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v14

    .line 1969
    invoke-static {v12, v14, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1970
    .line 1971
    .line 1972
    move-result v14

    .line 1973
    if-nez v14, :cond_34

    .line 1974
    .line 1975
    const-string v14, "~791C379109EE248F0DD5469CBC810DBAFBFF0438EA7D3677FCA6160785C1A62B2CAF"

    .line 1976
    .line 1977
    invoke-static {v14}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v14

    .line 1981
    invoke-static {v12, v14, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1982
    .line 1983
    .line 1984
    move-result v14

    .line 1985
    if-nez v14, :cond_34

    .line 1986
    .line 1987
    const-string v14, ".general_search."

    .line 1988
    .line 1989
    invoke-static {v12, v14, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1990
    .line 1991
    .line 1992
    move-result v12

    .line 1993
    if-nez v12, :cond_34

    .line 1994
    .line 1995
    const-string v12, "SearchResult"

    .line 1996
    .line 1997
    invoke-static {v13, v12, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1998
    .line 1999
    .line 2000
    move-result v12

    .line 2001
    if-nez v12, :cond_34

    .line 2002
    .line 2003
    const-string v12, "SearchRoot"

    .line 2004
    .line 2005
    invoke-static {v13, v12, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2006
    .line 2007
    .line 2008
    move-result v12

    .line 2009
    if-nez v12, :cond_34

    .line 2010
    .line 2011
    const-string v12, "SearchPage"

    .line 2012
    .line 2013
    invoke-static {v13, v12, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2014
    .line 2015
    .line 2016
    move-result v12

    .line 2017
    if-nez v12, :cond_34

    .line 2018
    .line 2019
    const-string v12, "SearchContainer"

    .line 2020
    .line 2021
    invoke-static {v13, v12, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2022
    .line 2023
    .line 2024
    move-result v12

    .line 2025
    if-nez v12, :cond_34

    .line 2026
    .line 2027
    const-string v12, "SearchFragment"

    .line 2028
    .line 2029
    invoke-static {v13, v12, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2030
    .line 2031
    .line 2032
    move-result v12

    .line 2033
    if-eqz v12, :cond_3d

    .line 2034
    .line 2035
    goto/16 :goto_30

    .line 2036
    .line 2037
    :cond_3d
    :goto_35
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v10

    .line 2041
    add-int/lit8 v11, v11, 0x1

    .line 2042
    .line 2043
    goto :goto_34

    .line 2044
    :cond_3e
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 2045
    .line 2046
    .line 2047
    move-result v5

    .line 2048
    if-eqz v5, :cond_40

    .line 2049
    .line 2050
    if-ne v5, v3, :cond_3f

    .line 2051
    .line 2052
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v1

    .line 2056
    goto :goto_36

    .line 2057
    :cond_3f
    invoke-static {}, Lγ;->κ()V

    .line 2058
    .line 2059
    .line 2060
    goto/16 :goto_3d

    .line 2061
    .line 2062
    :cond_40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v1

    .line 2066
    :goto_36
    if-nez v1, :cond_48

    .line 2067
    .line 2068
    if-eqz v8, :cond_4a

    .line 2069
    .line 2070
    invoke-virtual {v7, v0, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2071
    .line 2072
    .line 2073
    const p0, 0x7f0dead1

    .line 2074
    .line 2075
    .line 2076
    invoke-virtual {v7, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v0

    .line 2080
    instance-of v1, v0, Ljava/lang/Integer;

    .line 2081
    .line 2082
    if-eqz v1, :cond_41

    .line 2083
    .line 2084
    check-cast v0, Ljava/lang/Integer;

    .line 2085
    .line 2086
    goto :goto_37

    .line 2087
    :cond_41
    move-object v0, v4

    .line 2088
    :goto_37
    if-eqz v0, :cond_42

    .line 2089
    .line 2090
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 2091
    .line 2092
    .line 2093
    move-result v0

    .line 2094
    sget-object v1, Lug;->α:Ltg;

    .line 2095
    .line 2096
    invoke-static {v7, v0}, Ltg;->ш(Landroid/view/View;I)V

    .line 2097
    .line 2098
    .line 2099
    :cond_42
    const v0, 0x7f0dead2

    .line 2100
    .line 2101
    .line 2102
    invoke-virtual {v7, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v1

    .line 2106
    instance-of v2, v1, Landroid/animation/ValueAnimator;

    .line 2107
    .line 2108
    if-eqz v2, :cond_43

    .line 2109
    .line 2110
    check-cast v1, Landroid/animation/ValueAnimator;

    .line 2111
    .line 2112
    goto :goto_38

    .line 2113
    :cond_43
    move-object v1, v4

    .line 2114
    :goto_38
    if-eqz v1, :cond_44

    .line 2115
    .line 2116
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 2117
    .line 2118
    .line 2119
    :cond_44
    invoke-virtual {v7, v0, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2120
    .line 2121
    .line 2122
    invoke-static {v7}, Ltg;->н(Landroid/view/View;)V

    .line 2123
    .line 2124
    .line 2125
    invoke-static {v7}, Ltg;->х(Landroid/view/View;)V

    .line 2126
    .line 2127
    .line 2128
    const v0, 0x7f0deadb

    .line 2129
    .line 2130
    .line 2131
    invoke-virtual {v7, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v1

    .line 2135
    instance-of v2, v1, Ljava/lang/Float;

    .line 2136
    .line 2137
    if-eqz v2, :cond_45

    .line 2138
    .line 2139
    check-cast v1, Ljava/lang/Float;

    .line 2140
    .line 2141
    goto :goto_39

    .line 2142
    :cond_45
    move-object v1, v4

    .line 2143
    :goto_39
    const v2, 0x7f0deadc

    .line 2144
    .line 2145
    .line 2146
    if-nez v1, :cond_47

    .line 2147
    .line 2148
    invoke-virtual {v7, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v1

    .line 2152
    instance-of v3, v1, Ljava/lang/Float;

    .line 2153
    .line 2154
    if-eqz v3, :cond_46

    .line 2155
    .line 2156
    check-cast v1, Ljava/lang/Float;

    .line 2157
    .line 2158
    goto :goto_3a

    .line 2159
    :cond_46
    move-object v1, v4

    .line 2160
    :cond_47
    :goto_3a
    invoke-virtual {v7, v0, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2161
    .line 2162
    .line 2163
    invoke-virtual {v7, v2, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2164
    .line 2165
    .line 2166
    const v0, 0x7f0deada

    .line 2167
    .line 2168
    .line 2169
    invoke-virtual {v7, v0, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2170
    .line 2171
    .line 2172
    const/4 v0, -0x1

    .line 2173
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2174
    .line 2175
    .line 2176
    move-result-object v0

    .line 2177
    invoke-virtual {v7, p0, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2178
    .line 2179
    .line 2180
    if-eqz v1, :cond_4a

    .line 2181
    .line 2182
    invoke-virtual {v7}, Landroid/view/View;->getAlpha()F

    .line 2183
    .line 2184
    .line 2185
    move-result p0

    .line 2186
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 2187
    .line 2188
    .line 2189
    move-result v0

    .line 2190
    sub-float/2addr p0, v0

    .line 2191
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 2192
    .line 2193
    .line 2194
    move-result p0

    .line 2195
    const v0, 0x3c23d70a    # 0.01f

    .line 2196
    .line 2197
    .line 2198
    cmpl-float p0, p0, v0

    .line 2199
    .line 2200
    if-lez p0, :cond_4a

    .line 2201
    .line 2202
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 2203
    .line 2204
    .line 2205
    move-result p0

    .line 2206
    const/4 v0, 0x0

    .line 2207
    const/high16 v1, 0x3f800000    # 1.0f

    .line 2208
    .line 2209
    invoke-static {p0, v0, v1}, Lj81;->λ(FFF)F

    .line 2210
    .line 2211
    .line 2212
    move-result p0

    .line 2213
    invoke-static {v7, p0}, Ltg;->р(Landroid/view/View;F)V

    .line 2214
    .line 2215
    .line 2216
    goto :goto_3d

    .line 2217
    :cond_48
    invoke-static {v7}, Ltg;->а(Landroid/view/View;)Ljava/lang/Integer;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v3

    .line 2221
    invoke-static {v3, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2222
    .line 2223
    .line 2224
    move-result v3

    .line 2225
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2226
    .line 2227
    .line 2228
    move-result v8

    .line 2229
    const-string v4, "measure-once bottom misc "

    .line 2230
    .line 2231
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v9

    .line 2235
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2236
    .line 2237
    .line 2238
    move-result p0

    .line 2239
    if-ne p0, v2, :cond_49

    .line 2240
    .line 2241
    const-string p0, "\u5e95\u680f\u6742\u9879"

    .line 2242
    .line 2243
    :goto_3b
    move-object v10, p0

    .line 2244
    goto :goto_3c

    .line 2245
    :cond_49
    const-string p0, "\u5e95\u680f\u6742\u9879\u5165\u53e3"

    .line 2246
    .line 2247
    goto :goto_3b

    .line 2248
    :goto_3c
    const/16 v11, 0x10

    .line 2249
    .line 2250
    invoke-static/range {v6 .. v11}, Ltg;->г(Ltg;Landroid/view/View;ILjava/lang/String;Ljava/lang/String;I)V

    .line 2251
    .line 2252
    .line 2253
    if-nez v3, :cond_4a

    .line 2254
    .line 2255
    invoke-static {v7}, Ltg;->а(Landroid/view/View;)Ljava/lang/Integer;

    .line 2256
    .line 2257
    .line 2258
    move-result-object p0

    .line 2259
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2260
    .line 2261
    .line 2262
    move-result p0

    .line 2263
    if-eqz p0, :cond_4a

    .line 2264
    .line 2265
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2266
    .line 2267
    invoke-virtual {v7, v0, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2268
    .line 2269
    .line 2270
    :cond_4a
    :goto_3d
    return-void

    .line 2271
    :pswitch_1a
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 2272
    .line 2273
    check-cast v0, Landroid/app/Activity;

    .line 2274
    .line 2275
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 2276
    .line 2277
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 2278
    .line 2279
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 2280
    .line 2281
    check-cast p0, Lp70;

    .line 2282
    .line 2283
    invoke-static {v0, v1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->ξ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;)V

    .line 2284
    .line 2285
    .line 2286
    return-void

    .line 2287
    :pswitch_1b
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 2288
    .line 2289
    check-cast v0, Landroid/content/Context;

    .line 2290
    .line 2291
    iget-object v1, p0, Le9;->ζ:Ljava/lang/Object;

    .line 2292
    .line 2293
    check-cast v1, Ljava/lang/String;

    .line 2294
    .line 2295
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 2296
    .line 2297
    check-cast p0, Ljava/lang/String;

    .line 2298
    .line 2299
    const-string v3, "r323590de2ec75a5c"

    .line 2300
    .line 2301
    const-string v5, "blacklist dialog shown uid="

    .line 2302
    .line 2303
    :try_start_1c
    invoke-static {}, Lda;->β()V

    .line 2304
    .line 2305
    .line 2306
    invoke-static {v0, v1, p0}, Lda;->α(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v0

    .line 2310
    sput-object v0, Lda;->α:Landroid/app/Dialog;

    .line 2311
    .line 2312
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 2313
    .line 2314
    .line 2315
    new-instance v6, Lsm1;

    .line 2316
    .line 2317
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 2318
    .line 2319
    .line 2320
    const/4 v7, 0x5

    .line 2321
    iput v7, v6, Lsm1;->ε:I

    .line 2322
    .line 2323
    new-instance v7, Lca;

    .line 2324
    .line 2325
    invoke-direct {v7, v0, v6, v1, p0}, Lca;-><init>(Landroid/app/Dialog;Lsm1;Ljava/lang/String;Ljava/lang/String;)V

    .line 2326
    .line 2327
    .line 2328
    sput-object v7, Lda;->γ:Lca;

    .line 2329
    .line 2330
    sget-object v0, Lda;->β:Landroid/os/Handler;

    .line 2331
    .line 2332
    const-wide/16 v8, 0x3e8

    .line 2333
    .line 2334
    invoke-virtual {v0, v7, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2335
    .line 2336
    .line 2337
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2338
    .line 2339
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2340
    .line 2341
    .line 2342
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2343
    .line 2344
    .line 2345
    const-string v1, " reason="

    .line 2346
    .line 2347
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2348
    .line 2349
    .line 2350
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2351
    .line 2352
    .line 2353
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2354
    .line 2355
    .line 2356
    move-result-object p0

    .line 2357
    invoke-static {v3, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_18

    .line 2358
    .line 2359
    .line 2360
    goto :goto_3e

    .line 2361
    :catchall_18
    move-exception v0

    .line 2362
    move-object p0, v0

    .line 2363
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2364
    .line 2365
    .line 2366
    move-result-object p0

    .line 2367
    const-string v0, "show dialog failed: "

    .line 2368
    .line 2369
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2370
    .line 2371
    .line 2372
    move-result-object p0

    .line 2373
    invoke-static {v3, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 2374
    .line 2375
    .line 2376
    :goto_3e
    return-void

    .line 2377
    :pswitch_1c
    iget-object v0, p0, Le9;->θ:Ljava/lang/Object;

    .line 2378
    .line 2379
    move-object v1, v0

    .line 2380
    check-cast v1, Landroid/app/Activity;

    .line 2381
    .line 2382
    iget-object v0, p0, Le9;->ζ:Ljava/lang/Object;

    .line 2383
    .line 2384
    check-cast v0, Ljava/lang/String;

    .line 2385
    .line 2386
    iget-object p0, p0, Le9;->η:Ljava/lang/Object;

    .line 2387
    .line 2388
    check-cast p0, Ljava/lang/String;

    .line 2389
    .line 2390
    const-string v3, "\u5f39\u7a97\u5f02\u5e38: "

    .line 2391
    .line 2392
    :try_start_1d
    invoke-static {v1, v0, p0}, Lh62;->В(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_19

    .line 2393
    .line 2394
    .line 2395
    goto :goto_3f

    .line 2396
    :catchall_19
    move-exception v0

    .line 2397
    move-object p0, v0

    .line 2398
    const-string v0, "r503d887a1287db3d"

    .line 2399
    .line 2400
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2401
    .line 2402
    .line 2403
    move-result-object v6

    .line 2404
    invoke-static {v3, v6}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v6

    .line 2408
    invoke-static {v0, v6, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 2409
    .line 2410
    .line 2411
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2412
    .line 2413
    .line 2414
    move-result-object p0

    .line 2415
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2416
    .line 2417
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2418
    .line 2419
    .line 2420
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2421
    .line 2422
    .line 2423
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2424
    .line 2425
    .line 2426
    move-result-object p0

    .line 2427
    invoke-static {v1, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2428
    .line 2429
    .line 2430
    move-result-object p0

    .line 2431
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 2432
    .line 2433
    .line 2434
    :goto_3f
    return-void

    .line 2435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
