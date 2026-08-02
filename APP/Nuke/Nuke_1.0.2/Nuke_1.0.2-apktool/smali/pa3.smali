.class public final Lpa3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lg92;


# static fields
.field public static final d:Lmv1;

.field public static final e:Lmv1;

.field public static final f:Lix2;

.field public static final g:Ljava/util/List;


# instance fields
.field public final a:Loa3;

.field public final b:Lzk;

.field public final c:Lix2;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v1, v2}, Lio;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Lmv1;

    .line 14
    .line 15
    const-string v4, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"

    .line 16
    .line 17
    invoke-direct {v3, v4, v0, v1}, Lmv1;-><init>(Ljava/lang/String;Ljava/lang/Object;Llv1;)V

    .line 18
    .line 19
    .line 20
    sput-object v3, Lpa3;->d:Lmv1;

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lio;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v1, v2}, Lio;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lmv1;

    .line 33
    .line 34
    const-string v3, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"

    .line 35
    .line 36
    invoke-direct {v2, v3, v0, v1}, Lmv1;-><init>(Ljava/lang/String;Ljava/lang/Object;Llv1;)V

    .line 37
    .line 38
    .line 39
    sput-object v2, Lpa3;->e:Lmv1;

    .line 40
    .line 41
    new-instance v0, Lix2;

    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    invoke-direct {v0, v1}, Lix2;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lpa3;->f:Lix2;

    .line 48
    .line 49
    const-string v0, "TP1A"

    .line 50
    .line 51
    const-string v1, "TD1A.220804.031"

    .line 52
    .line 53
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lpa3;->g:Ljava/util/List;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(Lzk;Loa3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpa3;->b:Lzk;

    .line 5
    .line 6
    iput-object p2, p0, Lpa3;->a:Loa3;

    .line 7
    .line 8
    sget-object p1, Lpa3;->f:Lix2;

    .line 9
    .line 10
    iput-object p1, p0, Lpa3;->c:Lix2;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILov1;)Ld92;
    .locals 15

    .line 1
    move-object/from16 v1, p4

    .line 2
    .line 3
    sget-object v9, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    sget-object v2, Lpa3;->d:Lmv1;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/lang/Long;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide/16 v5, 0x0

    .line 18
    .line 19
    cmp-long v2, v3, v5

    .line 20
    .line 21
    if-gez v2, :cond_1

    .line 22
    .line 23
    const-wide/16 v5, -0x1

    .line 24
    .line 25
    cmp-long v2, v3, v5

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v2, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "

    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    :goto_0
    sget-object v2, Lpa3;->e:Lmv1;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/lang/Integer;

    .line 57
    .line 58
    if-nez v2, :cond_2

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :cond_2
    sget-object v5, Lva0;->g:Lmv1;

    .line 66
    .line 67
    invoke-virtual {v1, v5}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lva0;

    .line 72
    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    sget-object v1, Lva0;->f:Lva0;

    .line 76
    .line 77
    :cond_3
    move-object v8, v1

    .line 78
    iget-object v1, p0, Lpa3;->c:Lix2;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-object v1, v2

    .line 84
    new-instance v2, Landroid/media/MediaMetadataRetriever;

    .line 85
    .line 86
    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 87
    .line 88
    .line 89
    const/4 v10, 0x1

    .line 90
    const-wide/16 v11, 0x1

    .line 91
    .line 92
    const/4 v13, 0x0

    .line 93
    const/16 v14, 0x1d

    .line 94
    .line 95
    :try_start_0
    iget-object v5, p0, Lpa3;->a:Loa3;

    .line 96
    .line 97
    move-object/from16 v6, p1

    .line 98
    .line 99
    invoke-interface {v5, v2, v6}, Loa3;->a(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    move-object v0, p0

    .line 107
    move/from16 v7, p3

    .line 108
    .line 109
    move-object v1, v6

    .line 110
    move/from16 v6, p2

    .line 111
    .line 112
    invoke-virtual/range {v0 .. v8}, Lpa3;->c(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;JIIILva0;)Landroid/graphics/Bitmap;

    .line 113
    .line 114
    .line 115
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 117
    .line 118
    if-lt v3, v14, :cond_9

    .line 119
    .line 120
    instance-of v3, v2, Ljava/lang/AutoCloseable;

    .line 121
    .line 122
    if-eqz v3, :cond_4

    .line 123
    .line 124
    check-cast v2, Ljava/lang/AutoCloseable;

    .line 125
    .line 126
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    instance-of v3, v2, Ljava/util/concurrent/ExecutorService;

    .line 131
    .line 132
    if-eqz v3, :cond_8

    .line 133
    .line 134
    check-cast v2, Ljava/util/concurrent/ExecutorService;

    .line 135
    .line 136
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    if-ne v2, v3, :cond_5

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-nez v3, :cond_a

    .line 148
    .line 149
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 150
    .line 151
    .line 152
    :cond_6
    :goto_1
    if-nez v3, :cond_7

    .line 153
    .line 154
    :try_start_1
    invoke-interface {v2, v11, v12, v9}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 155
    .line 156
    .line 157
    move-result v3
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 158
    goto :goto_1

    .line 159
    :catch_0
    if-nez v13, :cond_6

    .line 160
    .line 161
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move v13, v10

    .line 165
    goto :goto_1

    .line 166
    :cond_7
    if-eqz v13, :cond_a

    .line 167
    .line 168
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_8
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_9
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 181
    .line 182
    .line 183
    :cond_a
    :goto_2
    iget-object v0, p0, Lpa3;->b:Lzk;

    .line 184
    .line 185
    invoke-static {v0, v1}, Lal;->c(Lzk;Landroid/graphics/Bitmap;)Lal;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    return-object v0

    .line 190
    :catchall_0
    move-exception v0

    .line 191
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 192
    .line 193
    if-lt v1, v14, :cond_f

    .line 194
    .line 195
    instance-of v1, v2, Ljava/lang/AutoCloseable;

    .line 196
    .line 197
    if-nez v1, :cond_e

    .line 198
    .line 199
    instance-of v1, v2, Ljava/util/concurrent/ExecutorService;

    .line 200
    .line 201
    if-eqz v1, :cond_d

    .line 202
    .line 203
    check-cast v2, Ljava/util/concurrent/ExecutorService;

    .line 204
    .line 205
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    if-eq v2, v1, :cond_10

    .line 210
    .line 211
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-nez v1, :cond_10

    .line 216
    .line 217
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 218
    .line 219
    .line 220
    :cond_b
    :goto_3
    if-nez v1, :cond_c

    .line 221
    .line 222
    :try_start_2
    invoke-interface {v2, v11, v12, v9}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 223
    .line 224
    .line 225
    move-result v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    .line 226
    goto :goto_3

    .line 227
    :catch_1
    if-nez v13, :cond_b

    .line 228
    .line 229
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move v13, v10

    .line 233
    goto :goto_3

    .line 234
    :cond_c
    if-eqz v13, :cond_10

    .line 235
    .line 236
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 241
    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_d
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_e
    check-cast v2, Ljava/lang/AutoCloseable;

    .line 249
    .line 250
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 251
    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_f
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 255
    .line 256
    .line 257
    :cond_10
    :goto_4
    throw v0
.end method

.method public final b(Ljava/lang/Object;Lov1;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final c(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;JIIILva0;)Landroid/graphics/Bitmap;
    .locals 13

    .line 1
    move/from16 v2, p6

    .line 2
    .line 3
    move/from16 v3, p7

    .line 4
    .line 5
    move-object/from16 v4, p8

    .line 6
    .line 7
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v7, 0x3

    .line 10
    const/4 v8, 0x0

    .line 11
    const-string v9, "VideoDecoder"

    .line 12
    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    const-string v5, ".+_cheets|cheets_.+"

    .line 16
    .line 17
    invoke-virtual {v0, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    const/16 v0, 0xc

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v5, "video/webm"

    .line 30
    .line 31
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    goto :goto_5

    .line 38
    :cond_0
    new-instance v5, Landroid/media/MediaExtractor;

    .line 39
    .line 40
    invoke-direct {v5}, Landroid/media/MediaExtractor;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 41
    .line 42
    .line 43
    :try_start_1
    iget-object v0, p0, Lpa3;->a:Loa3;

    .line 44
    .line 45
    invoke-interface {v0, v5, p1}, Loa3;->b(Landroid/media/MediaExtractor;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, Landroid/media/MediaExtractor;->getTrackCount()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v6, 0x0

    .line 53
    :goto_0
    if-ge v6, v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    const-string v11, "mime"

    .line 60
    .line 61
    invoke-virtual {v10, v11}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    const-string v11, "video/x-vnd.on2.vp8"

    .line 66
    .line 67
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    if-nez v10, :cond_1

    .line 72
    .line 73
    add-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v5}, Landroid/media/MediaExtractor;->release()V

    .line 77
    .line 78
    .line 79
    const-string v0, "Cannot decode VP8 video on CrOS."

    .line 80
    .line 81
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object v8

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    :goto_1
    invoke-virtual {v5}, Landroid/media/MediaExtractor;->release()V

    .line 88
    .line 89
    .line 90
    goto :goto_5

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    move-object v5, v8

    .line 93
    :goto_2
    :try_start_2
    invoke-static {v9, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_3

    .line 98
    .line 99
    const-string v6, "Exception trying to extract track info for a webm video on CrOS."

    .line 100
    .line 101
    invoke-static {v9, v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :catchall_2
    move-exception v0

    .line 106
    goto :goto_4

    .line 107
    :cond_3
    :goto_3
    if-eqz v5, :cond_5

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :goto_4
    if-eqz v5, :cond_4

    .line 111
    .line 112
    invoke-virtual {v5}, Landroid/media/MediaExtractor;->release()V

    .line 113
    .line 114
    .line 115
    :cond_4
    throw v0

    .line 116
    :cond_5
    :goto_5
    const/16 v10, 0x18

    .line 117
    .line 118
    const/high16 v0, -0x80000000

    .line 119
    .line 120
    if-eq v2, v0, :cond_8

    .line 121
    .line 122
    if-eq v3, v0, :cond_8

    .line 123
    .line 124
    sget-object v0, Lva0;->e:Lva0;

    .line 125
    .line 126
    if-eq v4, v0, :cond_8

    .line 127
    .line 128
    const/16 v0, 0x12

    .line 129
    .line 130
    :try_start_3
    invoke-virtual {p2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    const/16 v5, 0x13

    .line 139
    .line 140
    invoke-virtual {p2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    invoke-virtual {p2, v10}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    const/16 v11, 0x5a

    .line 157
    .line 158
    if-eq v6, v11, :cond_6

    .line 159
    .line 160
    const/16 v11, 0x10e

    .line 161
    .line 162
    if-ne v6, v11, :cond_7

    .line 163
    .line 164
    :cond_6
    move v12, v5

    .line 165
    move v5, v0

    .line 166
    move v0, v12

    .line 167
    :cond_7
    invoke-virtual {v4, v0, v5, v2, v3}, Lva0;->b(IIII)F

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    int-to-float v0, v0

    .line 172
    mul-float/2addr v0, v2

    .line 173
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    int-to-float v3, v5

    .line 178
    mul-float/2addr v2, v3

    .line 179
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    move-object v1, p2

    .line 184
    move-wide/from16 v2, p3

    .line 185
    .line 186
    move/from16 v4, p5

    .line 187
    .line 188
    move v5, v0

    .line 189
    invoke-virtual/range {v1 .. v6}, Landroid/media/MediaMetadataRetriever;->getScaledFrameAtTime(JIII)Landroid/graphics/Bitmap;

    .line 190
    .line 191
    .line 192
    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 193
    goto :goto_6

    .line 194
    :catchall_3
    move-exception v0

    .line 195
    invoke-static {v9, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_8

    .line 200
    .line 201
    const-string v2, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"

    .line 202
    .line 203
    invoke-static {v9, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 204
    .line 205
    .line 206
    :cond_8
    :goto_6
    if-nez v8, :cond_9

    .line 207
    .line 208
    invoke-virtual/range {p2 .. p5}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    :cond_9
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 213
    .line 214
    const-string v2, "Pixel"

    .line 215
    .line 216
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    const/16 v2, 0x21

    .line 221
    .line 222
    if-eqz v0, :cond_b

    .line 223
    .line 224
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 225
    .line 226
    if-ne v0, v2, :cond_b

    .line 227
    .line 228
    sget-object v0, Lpa3;->g:Ljava/util/List;

    .line 229
    .line 230
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-eqz v2, :cond_e

    .line 239
    .line 240
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    check-cast v2, Ljava/lang/String;

    .line 245
    .line 246
    sget-object v3, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 247
    .line 248
    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_a

    .line 253
    .line 254
    goto :goto_7

    .line 255
    :cond_b
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 256
    .line 257
    const/16 v3, 0x1e

    .line 258
    .line 259
    if-lt v0, v3, :cond_e

    .line 260
    .line 261
    if-ge v0, v2, :cond_e

    .line 262
    .line 263
    :goto_7
    const/16 v0, 0x24

    .line 264
    .line 265
    :try_start_4
    invoke-virtual {p2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    const/16 v2, 0x23

    .line 270
    .line 271
    invoke-virtual {p2, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    const/4 v3, 0x7

    .line 284
    const/4 v4, 0x6

    .line 285
    if-eq v0, v3, :cond_c

    .line 286
    .line 287
    if-ne v0, v4, :cond_e

    .line 288
    .line 289
    :cond_c
    if-ne v2, v4, :cond_e

    .line 290
    .line 291
    invoke-virtual {p2, v10}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 300
    .line 301
    .line 302
    move-result v0
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0

    .line 303
    const/16 v1, 0xb4

    .line 304
    .line 305
    if-ne v0, v1, :cond_e

    .line 306
    .line 307
    invoke-static {v9, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_d

    .line 312
    .line 313
    const-string v0, "Applying HDR 180 deg thumbnail correction"

    .line 314
    .line 315
    invoke-static {v9, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 316
    .line 317
    .line 318
    :cond_d
    new-instance v0, Landroid/graphics/Matrix;

    .line 319
    .line 320
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    int-to-float v1, v1

    .line 328
    const/high16 v2, 0x40000000    # 2.0f

    .line 329
    .line 330
    div-float/2addr v1, v2

    .line 331
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    int-to-float v3, v3

    .line 336
    div-float/2addr v3, v2

    .line 337
    const/high16 v2, 0x43340000    # 180.0f

    .line 338
    .line 339
    invoke-virtual {v0, v2, v1, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 340
    .line 341
    .line 342
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    const/4 v3, 0x1

    .line 351
    const/4 v4, 0x0

    .line 352
    const/4 v5, 0x0

    .line 353
    move-object/from16 p5, v0

    .line 354
    .line 355
    move/from16 p3, v1

    .line 356
    .line 357
    move/from16 p4, v2

    .line 358
    .line 359
    move/from16 p6, v3

    .line 360
    .line 361
    move p1, v4

    .line 362
    move p2, v5

    .line 363
    move-object p0, v8

    .line 364
    invoke-static/range {p0 .. p6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    goto :goto_8

    .line 369
    :catch_0
    invoke-static {v9, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-eqz v0, :cond_e

    .line 374
    .line 375
    const-string v0, "Exception trying to extract HDR transfer function or rotation"

    .line 376
    .line 377
    invoke-static {v9, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 378
    .line 379
    .line 380
    :cond_e
    :goto_8
    if-eqz v8, :cond_f

    .line 381
    .line 382
    return-object v8

    .line 383
    :cond_f
    new-instance v0, Lpv;

    .line 384
    .line 385
    const-string v1, "MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details"

    .line 386
    .line 387
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v0
.end method
