.class public final Lyyds/ᛷᲈᛸᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛲᲈᲁ;


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᲀᲇᲇᛲ;

.field public static final ᛶᛷᛲᲁ:Ljava/util/List;

.field public static final ᲇᲇᲇᛱ:Lyyds/ᛲᲁᲈ;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᲀᲇᲇᛲ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛶᲇᲀᲀ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᲈᛱᛸᛴ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛲᲁᲈ;


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
    new-instance v1, Lyyds/ᛲᛴᲇᛷ;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v1, v2}, Lyyds/ᛲᛴᲇᛷ;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Lyyds/ᲀᲇᲇᛲ;

    .line 14
    .line 15
    const-string v4, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"

    .line 16
    .line 17
    invoke-direct {v3, v4, v0, v1}, Lyyds/ᲀᲇᲇᛲ;-><init>(Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛱᛵᲇᲈ;)V

    .line 18
    .line 19
    .line 20
    sput-object v3, Lyyds/ᛷᲈᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲇᲇᛲ;

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lyyds/ᛲᛴᲇᛷ;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v1, v2}, Lyyds/ᛲᛴᲇᛷ;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lyyds/ᲀᲇᲇᛲ;

    .line 33
    .line 34
    const-string v3, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"

    .line 35
    .line 36
    invoke-direct {v2, v3, v0, v1}, Lyyds/ᲀᲇᲇᛲ;-><init>(Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛱᛵᲇᲈ;)V

    .line 37
    .line 38
    .line 39
    sput-object v2, Lyyds/ᛷᲈᛸᛳ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲇᲇᛲ;

    .line 40
    .line 41
    new-instance v0, Lyyds/ᛲᲁᲈ;

    .line 42
    .line 43
    const/16 v1, 0x1b

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lyyds/ᛲᲁᲈ;-><init>(I)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lyyds/ᛷᲈᛸᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲁᲈ;

    .line 49
    .line 50
    const-string v0, "TP1A"

    .line 51
    .line 52
    const-string v1, "TD1A.220804.031"

    .line 53
    .line 54
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lyyds/ᛷᲈᛸᛳ;->ᛶᛷᛲᲁ:Ljava/util/List;

    .line 67
    .line 68
    return-void
.end method

.method public constructor <init>(Lyyds/ᲈᛱᛸᛴ;Lyyds/ᛶᲇᲀᲀ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᲈᛸᛳ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛱᛸᛴ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛷᲈᛸᛳ;->ᛲᲈᲁ:Lyyds/ᛶᲇᲀᲀ;

    .line 7
    .line 8
    sget-object p1, Lyyds/ᛷᲈᛸᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲁᲈ;

    .line 9
    .line 10
    iput-object p1, p0, Lyyds/ᛷᲈᛸᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲁᲈ;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/Object;Lyyds/ᛴᛳᲀᲈ;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᲁᛱᛸᛵ;
    .locals 10

    .line 1
    sget-object v0, Lyyds/ᛷᲈᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲇᲇᛲ;

    .line 2
    .line 3
    invoke-virtual {p4, v0}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    cmp-long v0, v4, v0

    .line 16
    .line 17
    if-gez v0, :cond_1

    .line 18
    .line 19
    const-wide/16 v0, -0x1

    .line 20
    .line 21
    cmp-long v0, v4, v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string p2, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0

    .line 46
    :cond_1
    :goto_0
    sget-object v0, Lyyds/ᛷᲈᛸᛳ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲇᲇᛲ;

    .line 47
    .line 48
    invoke-virtual {p4, v0}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/Integer;

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    const/4 v0, 0x2

    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_2
    sget-object v1, Lyyds/ᛶᛱᛸᛳ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 62
    .line 63
    invoke-virtual {p4, v1}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    check-cast p4, Lyyds/ᛶᛱᛸᛳ;

    .line 68
    .line 69
    if-nez p4, :cond_3

    .line 70
    .line 71
    sget-object p4, Lyyds/ᛶᛱᛸᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛶᛱᛸᛳ;

    .line 72
    .line 73
    :cond_3
    move-object v9, p4

    .line 74
    iget-object p4, p0, Lyyds/ᛷᲈᛸᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲁᲈ;

    .line 75
    .line 76
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v3, Landroid/media/MediaMetadataRetriever;

    .line 80
    .line 81
    invoke-direct {v3}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 82
    .line 83
    .line 84
    :try_start_0
    iget-object p4, p0, Lyyds/ᛷᲈᛸᛳ;->ᛲᲈᲁ:Lyyds/ᛶᲇᲀᲀ;

    .line 85
    .line 86
    invoke-interface {p4, v3, p1}, Lyyds/ᛶᲇᲀᲀ;->ᛱᛳᲇ(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    move-object v1, p0

    .line 94
    move-object v2, p1

    .line 95
    move v7, p2

    .line 96
    move v8, p3

    .line 97
    invoke-virtual/range {v1 .. v9}, Lyyds/ᛷᲈᛸᛳ;->ᲀᛲᛳᲀ(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;JIIILyyds/ᛶᛱᛸᛳ;)Landroid/graphics/Bitmap;

    .line 98
    .line 99
    .line 100
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->close()V

    .line 102
    .line 103
    .line 104
    iget-object p1, v1, Lyyds/ᛷᲈᛸᛳ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛱᛸᛴ;

    .line 105
    .line 106
    invoke-static {p0, p1}, Lyyds/ᛳᛸᛵᲈ;->ᲀᛲᛳᲀ(Landroid/graphics/Bitmap;Lyyds/ᲈᛱᛸᛴ;)Lyyds/ᛳᛸᛵᲈ;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    move-object p0, v0

    .line 113
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->close()V

    .line 114
    .line 115
    .line 116
    throw p0
.end method

.method public final ᲀᛲᛳᲀ(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;JIIILyyds/ᛶᛱᛸᛳ;)Landroid/graphics/Bitmap;
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
    iget-object v0, p0, Lyyds/ᛷᲈᛸᛳ;->ᛲᲈᲁ:Lyyds/ᛶᲇᲀᲀ;

    .line 44
    .line 45
    invoke-interface {v0, v5, p1}, Lyyds/ᛶᲇᲀᲀ;->ᛳᲁᲁᲇ(Landroid/media/MediaExtractor;Ljava/lang/Object;)V

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
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

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
    sget-object v0, Lyyds/ᛶᛱᛸᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛶᛱᛸᛳ;

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
    invoke-virtual {v4, v0, v5, v2, v3}, Lyyds/ᛶᛱᛸᛳ;->ᛵᛸᛸᛷ(IIII)F

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
    sget-object v0, Lyyds/ᛷᲈᛸᛳ;->ᛶᛷᛲᲁ:Ljava/util/List;

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
    if-ge v0, v2, :cond_e

    .line 258
    .line 259
    :goto_7
    const/16 v0, 0x24

    .line 260
    .line 261
    :try_start_4
    invoke-virtual {p2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    const/16 v2, 0x23

    .line 266
    .line 267
    invoke-virtual {p2, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    const/4 v3, 0x7

    .line 280
    const/4 v4, 0x6

    .line 281
    if-eq v0, v3, :cond_c

    .line 282
    .line 283
    if-ne v0, v4, :cond_e

    .line 284
    .line 285
    :cond_c
    if-ne v2, v4, :cond_e

    .line 286
    .line 287
    invoke-virtual {p2, v10}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 296
    .line 297
    .line 298
    move-result v0
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0

    .line 299
    const/16 v1, 0xb4

    .line 300
    .line 301
    if-ne v0, v1, :cond_e

    .line 302
    .line 303
    invoke-static {v9, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v0, :cond_d

    .line 308
    .line 309
    const-string v0, "Applying HDR 180 deg thumbnail correction"

    .line 310
    .line 311
    invoke-static {v9, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 312
    .line 313
    .line 314
    :cond_d
    new-instance v0, Landroid/graphics/Matrix;

    .line 315
    .line 316
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    int-to-float v1, v1

    .line 324
    const/high16 v2, 0x40000000    # 2.0f

    .line 325
    .line 326
    div-float/2addr v1, v2

    .line 327
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    int-to-float v3, v3

    .line 332
    div-float/2addr v3, v2

    .line 333
    const/high16 v2, 0x43340000    # 180.0f

    .line 334
    .line 335
    invoke-virtual {v0, v2, v1, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 336
    .line 337
    .line 338
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    const/4 v3, 0x1

    .line 347
    const/4 v4, 0x0

    .line 348
    const/4 v5, 0x0

    .line 349
    move-object/from16 p5, v0

    .line 350
    .line 351
    move/from16 p3, v1

    .line 352
    .line 353
    move/from16 p4, v2

    .line 354
    .line 355
    move/from16 p6, v3

    .line 356
    .line 357
    move p1, v4

    .line 358
    move p2, v5

    .line 359
    move-object p0, v8

    .line 360
    invoke-static/range {p0 .. p6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    goto :goto_8

    .line 365
    :catch_0
    invoke-static {v9, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-eqz v0, :cond_e

    .line 370
    .line 371
    const-string v0, "Exception trying to extract HDR transfer function or rotation"

    .line 372
    .line 373
    invoke-static {v9, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 374
    .line 375
    .line 376
    :cond_e
    :goto_8
    if-eqz v8, :cond_f

    .line 377
    .line 378
    return-object v8

    .line 379
    :cond_f
    new-instance v0, Lyyds/ᛸᛳᛵᛳ;

    .line 380
    .line 381
    const-string v1, "MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details"

    .line 382
    .line 383
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v0
.end method
