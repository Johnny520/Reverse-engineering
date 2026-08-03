.class public Lme/yun/silk/AacCodec;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/yun/silk/AacCodec$AudioInfo;,
        Lme/yun/silk/AacCodec$AacCallback;,
        Lme/yun/silk/AacCodec$DecodeResult;
    }
.end annotation


# static fields
.field private static final DECODE_STALL_TIMEOUT_MS:J = 0x7530L

.field private static final DEFAULT_BIT_RATE:I = 0x1f400

.field private static final DEFAULT_CHANNEL_COUNT:I = 0x1

.field private static final DEFAULT_SAMPLE_RATE:I = 0xac44

.field private static final TIMEOUT_US:I = 0x2710


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static aacToPcm(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lme/yun/silk/AacCodec;->decodeAacFile(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public static aacToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lme/yun/silk/AacCodec;->mp4ToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static autoAacToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lme/yun/silk/AacCodec;->m4aToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static autoToAac(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I
    .locals 1

    .line 1
    invoke-static {p0}, Lme/yun/silk/AacCodec;->isOggOpusFile(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->oggToAac(Ljava/lang/String;Ljava/lang/String;I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p2, p0}, Lme/yun/silk/SilkCodec;->getFileType(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    :pswitch_0
    const/4 p0, -0x2

    .line 20
    return p0

    .line 21
    :pswitch_1
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->mp4ToAac(Ljava/lang/String;Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :pswitch_2
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->m4aToAac(Ljava/lang/String;Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :pswitch_3
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->oggToAac(Ljava/lang/String;Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :pswitch_4
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->flacToAac(Ljava/lang/String;Ljava/lang/String;I)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0

    .line 41
    :pswitch_5
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->wavToAac(Ljava/lang/String;Ljava/lang/String;I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :pswitch_6
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->mp3ToAac(Ljava/lang/String;Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :pswitch_7
    invoke-static {p0, p1, p2, p3}, Lme/yun/silk/AacCodec;->silkToAac(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static autoToM4a(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I
    .locals 1

    .line 1
    invoke-static {p0}, Lme/yun/silk/AacCodec;->isOggOpusFile(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->oggToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p2, p0}, Lme/yun/silk/SilkCodec;->getFileType(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    :pswitch_0
    const/4 p0, -0x2

    .line 20
    return p0

    .line 21
    :pswitch_1
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->mp4ToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :pswitch_2
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->m4aToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :pswitch_3
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->oggToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :pswitch_4
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->flacToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0

    .line 41
    :pswitch_5
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->wavToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :pswitch_6
    invoke-static {p0, p1, p3}, Lme/yun/silk/AacCodec;->mp3ToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :pswitch_7
    invoke-static {p0, p1, p2, p3}, Lme/yun/silk/AacCodec;->silkToM4a(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static autoToPcmCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;)I
    .locals 2

    .line 1
    invoke-static {p0}, Lme/yun/silk/AacCodec;->isOggOpusFile(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2, p0}, Lme/yun/silk/SilkCodec;->getFileType(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x5

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p2, p0, p1}, Lme/yun/silk/SilkCodec;->autoToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    invoke-static {p0, p1, p2}, Lme/yun/silk/AacCodec;->oggToPcmCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public static autoToSilkCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I
    .locals 2

    .line 1
    invoke-static {p0}, Lme/yun/silk/AacCodec;->isOggOpusFile(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2, p0}, Lme/yun/silk/SilkCodec;->getFileType(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x5

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p2, p0, p1, p3}, Lme/yun/silk/SilkCodec;->autoToSilk(Ljava/lang/String;Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    invoke-static {p0, p1, p2, p3}, Lme/yun/silk/AacCodec;->oggToSilkCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method private static createAdtsHeader(III)[B
    .locals 8

    .line 1
    invoke-static {p0}, Lme/yun/silk/AacCodec;->getSampleRateIndex(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x2

    .line 6
    shl-int/2addr p0, v0

    .line 7
    or-int/lit8 p0, p0, 0x40

    .line 8
    .line 9
    shr-int/lit8 v1, p1, 0x2

    .line 10
    .line 11
    or-int/2addr p0, v1

    .line 12
    int-to-byte p0, p0

    .line 13
    const/4 v1, 0x3

    .line 14
    and-int/2addr p1, v1

    .line 15
    const/4 v2, 0x6

    .line 16
    shl-int/2addr p1, v2

    .line 17
    const/4 v3, 0x7

    .line 18
    add-int/2addr p2, v3

    .line 19
    shr-int/lit8 v4, p2, 0xb

    .line 20
    .line 21
    or-int/2addr p1, v4

    .line 22
    int-to-byte p1, p1

    .line 23
    shr-int/lit8 v4, p2, 0x3

    .line 24
    .line 25
    and-int/lit16 v4, v4, 0xff

    .line 26
    .line 27
    int-to-byte v4, v4

    .line 28
    and-int/2addr p2, v3

    .line 29
    const/4 v5, 0x5

    .line 30
    shl-int/2addr p2, v5

    .line 31
    or-int/lit8 p2, p2, 0x1f

    .line 32
    .line 33
    int-to-byte p2, p2

    .line 34
    new-array v3, v3, [B

    .line 35
    .line 36
    const/4 v6, -0x1

    .line 37
    const/4 v7, 0x0

    .line 38
    aput-byte v6, v3, v7

    .line 39
    .line 40
    const/16 v6, -0xf

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    aput-byte v6, v3, v7

    .line 44
    .line 45
    aput-byte p0, v3, v0

    .line 46
    .line 47
    aput-byte p1, v3, v1

    .line 48
    .line 49
    const/4 p0, 0x4

    .line 50
    aput-byte v4, v3, p0

    .line 51
    .line 52
    aput-byte p2, v3, v5

    .line 53
    .line 54
    const/4 p0, -0x4

    .line 55
    aput-byte p0, v3, v2

    .line 56
    .line 57
    return-object v3
.end method

.method public static decodeAacFile(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lme/yun/silk/AacCodec;->decodeAacFileWithInfo(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)Lme/yun/silk/AacCodec$DecodeResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Lme/yun/silk/AacCodec$DecodeResult;->code:I

    .line 6
    .line 7
    return p0
.end method

.method private static decodeAacFileWithInfo(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)Lme/yun/silk/AacCodec$DecodeResult;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "channel-count"

    .line 8
    .line 9
    const-string v4, "sample-rate"

    .line 10
    .line 11
    const-string v5, "\u6587\u4ef6\u4e0d\u5b58\u5728: "

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    new-instance v6, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v7, "\u5f00\u59cb\u89e3\u7801: "

    .line 18
    .line 19
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-interface {v2, v6}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    new-instance v6, Landroid/media/MediaExtractor;

    .line 33
    .line 34
    invoke-direct {v6}, Landroid/media/MediaExtractor;-><init>()V

    .line 35
    .line 36
    .line 37
    const v8, 0xac44

    .line 38
    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v10, 0x0

    .line 42
    const/4 v11, 0x1

    .line 43
    :try_start_0
    new-instance v12, Ljava/io/File;

    .line 44
    .line 45
    invoke-direct {v12, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 49
    .line 50
    .line 51
    move-result v12
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_17
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    .line 52
    if-nez v12, :cond_3

    .line 53
    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v2, v0}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    move-object/from16 v19, v6

    .line 74
    .line 75
    move-object v14, v9

    .line 76
    goto/16 :goto_17

    .line 77
    .line 78
    :catch_0
    move-exception v0

    .line 79
    move-object/from16 v19, v6

    .line 80
    .line 81
    move-object v14, v9

    .line 82
    goto/16 :goto_15

    .line 83
    .line 84
    :cond_1
    :goto_0
    new-instance v0, Lme/yun/silk/AacCodec$DecodeResult;

    .line 85
    .line 86
    new-instance v3, Lme/yun/silk/AacCodec$AudioInfo;

    .line 87
    .line 88
    invoke-direct {v3, v8, v11}, Lme/yun/silk/AacCodec$AudioInfo;-><init>(II)V

    .line 89
    .line 90
    .line 91
    const/16 v4, -0x321

    .line 92
    .line 93
    invoke-direct {v0, v4, v3}, Lme/yun/silk/AacCodec$DecodeResult;-><init>(ILme/yun/silk/AacCodec$AudioInfo;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    :try_start_2
    invoke-virtual {v6}, Landroid/media/MediaExtractor;->release()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 97
    .line 98
    .line 99
    :catch_1
    if-eqz v1, :cond_2

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-lez v2, :cond_2

    .line 106
    .line 107
    invoke-static {v1}, Lp/a;->v(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    return-object v0

    .line 111
    :cond_3
    :try_start_3
    invoke-virtual {v6, v0}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    move v0, v10

    .line 115
    :goto_1
    invoke-virtual {v6}, Landroid/media/MediaExtractor;->getTrackCount()I

    .line 116
    .line 117
    .line 118
    move-result v5
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_17
    .catchall {:try_start_3 .. :try_end_3} :catchall_a

    .line 119
    const-string v12, "mime"

    .line 120
    .line 121
    const/4 v13, -0x1

    .line 122
    if-ge v0, v5, :cond_5

    .line 123
    .line 124
    :try_start_4
    invoke-virtual {v6, v0}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v5, v12}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v14

    .line 132
    if-eqz v14, :cond_4

    .line 133
    .line 134
    const-string v15, "audio/"

    .line 135
    .line 136
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v14

    .line 140
    if-eqz v14, :cond_4

    .line 141
    .line 142
    if-eqz v2, :cond_6

    .line 143
    .line 144
    new-instance v14, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const-string v15, "\u627e\u5230\u97f3\u9891\u8f68\u9053: "

    .line 150
    .line 151
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    invoke-interface {v2, v14}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_5
    move-object v5, v9

    .line 169
    move v0, v13

    .line 170
    :cond_6
    :goto_2
    if-ne v0, v13, :cond_9

    .line 171
    .line 172
    if-eqz v2, :cond_7

    .line 173
    .line 174
    const-string v0, "\u672a\u627e\u5230\u97f3\u9891\u8f68\u9053"

    .line 175
    .line 176
    invoke-interface {v2, v0}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_7
    new-instance v0, Lme/yun/silk/AacCodec$DecodeResult;

    .line 180
    .line 181
    new-instance v3, Lme/yun/silk/AacCodec$AudioInfo;

    .line 182
    .line 183
    invoke-direct {v3, v8, v11}, Lme/yun/silk/AacCodec$AudioInfo;-><init>(II)V

    .line 184
    .line 185
    .line 186
    const/16 v4, -0x322

    .line 187
    .line 188
    invoke-direct {v0, v4, v3}, Lme/yun/silk/AacCodec$DecodeResult;-><init>(ILme/yun/silk/AacCodec$AudioInfo;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 189
    .line 190
    .line 191
    :try_start_5
    invoke-virtual {v6}, Landroid/media/MediaExtractor;->release()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 192
    .line 193
    .line 194
    :catch_2
    if-eqz v1, :cond_8

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-lez v2, :cond_8

    .line 201
    .line 202
    invoke-static {v1}, Lp/a;->v(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :cond_8
    return-object v0

    .line 206
    :cond_9
    :try_start_6
    invoke-virtual {v6, v0}, Landroid/media/MediaExtractor;->selectTrack(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v5, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_17
    .catchall {:try_start_6 .. :try_end_6} :catchall_a

    .line 213
    if-eqz v0, :cond_a

    .line 214
    .line 215
    :try_start_7
    invoke-virtual {v5, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 219
    goto :goto_3

    .line 220
    :cond_a
    move v0, v8

    .line 221
    :goto_3
    :try_start_8
    invoke-virtual {v5, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 222
    .line 223
    .line 224
    move-result v13
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_17
    .catchall {:try_start_8 .. :try_end_8} :catchall_a

    .line 225
    if-eqz v13, :cond_b

    .line 226
    .line 227
    :try_start_9
    invoke-virtual {v5, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    goto :goto_4

    .line 232
    :cond_b
    move v13, v11

    .line 233
    :goto_4
    if-eqz v2, :cond_c

    .line 234
    .line 235
    new-instance v14, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const-string v15, "\u53c2\u6570: "

    .line 241
    .line 242
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v15, "Hz, "

    .line 249
    .line 250
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    const-string v15, "\u901a\u9053"

    .line 257
    .line 258
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v14

    .line 265
    invoke-interface {v2, v14}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 266
    .line 267
    .line 268
    :cond_c
    :try_start_a
    invoke-virtual {v5, v12}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v12

    .line 272
    invoke-static {v12}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 273
    .line 274
    .line 275
    move-result-object v14
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_17
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 276
    :try_start_b
    invoke-virtual {v14, v5, v9, v9, v10}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v14}, Landroid/media/MediaCodec;->start()V

    .line 280
    .line 281
    .line 282
    new-instance v5, Ljava/io/FileOutputStream;

    .line 283
    .line 284
    invoke-direct {v5, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_16
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 285
    .line 286
    .line 287
    :try_start_c
    invoke-virtual {v14}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    invoke-virtual {v14}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 292
    .line 293
    .line 294
    move-result-object v15

    .line 295
    new-instance v9, Landroid/media/MediaCodec$BufferInfo;

    .line 296
    .line 297
    invoke-direct {v9}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 298
    .line 299
    .line 300
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 301
    .line 302
    .line 303
    move-result-wide v16
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_15
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 304
    const-wide/16 v21, 0x0

    .line 305
    .line 306
    move/from16 v24, v10

    .line 307
    .line 308
    move/from16 v27, v24

    .line 309
    .line 310
    move-object/from16 v23, v15

    .line 311
    .line 312
    move-wide/from16 v25, v21

    .line 313
    .line 314
    :goto_5
    if-nez v24, :cond_1c

    .line 315
    .line 316
    const-wide/16 v7, 0x2710

    .line 317
    .line 318
    if-nez v27, :cond_e

    .line 319
    .line 320
    :try_start_d
    invoke-virtual {v14, v7, v8}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 321
    .line 322
    .line 323
    move-result v15

    .line 324
    if-ltz v15, :cond_e

    .line 325
    .line 326
    aget-object v11, v12, v15

    .line 327
    .line 328
    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v6, v11, v10}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    .line 332
    .line 333
    .line 334
    move-result v17

    .line 335
    if-gez v17, :cond_d

    .line 336
    .line 337
    const-wide/16 v18, 0x0

    .line 338
    .line 339
    const/16 v20, 0x4

    .line 340
    .line 341
    const/16 v16, 0x0

    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    invoke-virtual/range {v14 .. v20}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 346
    .line 347
    .line 348
    const/16 v27, 0x1

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :catchall_1
    move-exception v0

    .line 352
    move-object v9, v5

    .line 353
    move-object/from16 v19, v6

    .line 354
    .line 355
    goto/16 :goto_17

    .line 356
    .line 357
    :catch_3
    move-exception v0

    .line 358
    move-object v9, v5

    .line 359
    move-object/from16 v19, v6

    .line 360
    .line 361
    goto/16 :goto_15

    .line 362
    .line 363
    :cond_d
    invoke-virtual {v6}, Landroid/media/MediaExtractor;->getSampleTime()J

    .line 364
    .line 365
    .line 366
    move-result-wide v18

    .line 367
    const/16 v20, 0x0

    .line 368
    .line 369
    const/16 v16, 0x0

    .line 370
    .line 371
    invoke-virtual/range {v14 .. v20}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v6}, Landroid/media/MediaExtractor;->advance()Z

    .line 375
    .line 376
    .line 377
    :goto_6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 378
    .line 379
    .line 380
    move-result-wide v16
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 381
    :cond_e
    :try_start_e
    invoke-virtual {v14, v9, v7, v8}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 382
    .line 383
    .line 384
    move-result v7

    .line 385
    if-ltz v7, :cond_14

    .line 386
    .line 387
    iget v8, v9, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 388
    .line 389
    and-int/lit8 v8, v8, 0x4

    .line 390
    .line 391
    if-eqz v8, :cond_f

    .line 392
    .line 393
    const/4 v8, 0x1

    .line 394
    goto :goto_7

    .line 395
    :cond_f
    move v8, v10

    .line 396
    :goto_7
    iget v11, v9, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 397
    .line 398
    if-lez v11, :cond_13

    .line 399
    .line 400
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 401
    .line 402
    .line 403
    move-result-wide v16

    .line 404
    aget-object v11, v23, v7

    .line 405
    .line 406
    iget v15, v9, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 407
    .line 408
    invoke-virtual {v11, v15}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 409
    .line 410
    .line 411
    iget v15, v9, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 412
    .line 413
    iget v10, v9, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 414
    .line 415
    add-int/2addr v15, v10

    .line 416
    invoke-virtual {v11, v15}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 417
    .line 418
    .line 419
    iget v10, v9, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 420
    .line 421
    new-array v15, v10, [B

    .line 422
    .line 423
    invoke-virtual {v11, v15}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 424
    .line 425
    .line 426
    const/4 v11, 0x1

    .line 427
    if-ne v13, v11, :cond_10

    .line 428
    .line 429
    :try_start_f
    invoke-virtual {v5, v15}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_4
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 430
    .line 431
    .line 432
    move-object/from16 p0, v12

    .line 433
    .line 434
    int-to-long v11, v10

    .line 435
    add-long v25, v25, v11

    .line 436
    .line 437
    move-object/from16 v19, v6

    .line 438
    .line 439
    move/from16 v32, v8

    .line 440
    .line 441
    move-object/from16 v30, v9

    .line 442
    .line 443
    :goto_8
    const/4 v1, 0x0

    .line 444
    goto/16 :goto_f

    .line 445
    .line 446
    :catchall_2
    move-exception v0

    .line 447
    move-object v9, v5

    .line 448
    move-object/from16 v19, v6

    .line 449
    .line 450
    :goto_9
    const/4 v10, 0x0

    .line 451
    goto/16 :goto_17

    .line 452
    .line 453
    :catch_4
    move-exception v0

    .line 454
    move-object v9, v5

    .line 455
    move-object/from16 v19, v6

    .line 456
    .line 457
    :goto_a
    const/4 v10, 0x0

    .line 458
    goto/16 :goto_15

    .line 459
    .line 460
    :cond_10
    move-object/from16 p0, v12

    .line 461
    .line 462
    :try_start_10
    invoke-static {v11, v13}, Ljava/lang/Math;->max(II)I

    .line 463
    .line 464
    .line 465
    move-result v10

    .line 466
    iget v11, v9, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 467
    .line 468
    mul-int/lit8 v12, v10, 0x2

    .line 469
    .line 470
    div-int/2addr v11, v12

    .line 471
    mul-int/lit8 v12, v11, 0x2

    .line 472
    .line 473
    new-array v1, v12, [B
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 474
    .line 475
    move-object/from16 v19, v6

    .line 476
    .line 477
    const/4 v6, 0x0

    .line 478
    :goto_b
    if-ge v6, v11, :cond_12

    .line 479
    .line 480
    move/from16 v20, v6

    .line 481
    .line 482
    move-wide/from16 v28, v21

    .line 483
    .line 484
    const/4 v6, 0x0

    .line 485
    :goto_c
    if-ge v6, v10, :cond_11

    .line 486
    .line 487
    mul-int v30, v20, v10

    .line 488
    .line 489
    add-int v30, v30, v6

    .line 490
    .line 491
    mul-int/lit8 v30, v30, 0x2

    .line 492
    .line 493
    move/from16 v31, v6

    .line 494
    .line 495
    :try_start_11
    aget-byte v6, v15, v30

    .line 496
    .line 497
    and-int/lit16 v6, v6, 0xff

    .line 498
    .line 499
    add-int/lit8 v30, v30, 0x1

    .line 500
    .line 501
    aget-byte v30, v15, v30

    .line 502
    .line 503
    shl-int/lit8 v30, v30, 0x8

    .line 504
    .line 505
    or-int v6, v6, v30

    .line 506
    .line 507
    int-to-short v6, v6

    .line 508
    move/from16 v32, v8

    .line 509
    .line 510
    move-object/from16 v30, v9

    .line 511
    .line 512
    int-to-long v8, v6

    .line 513
    add-long v28, v28, v8

    .line 514
    .line 515
    add-int/lit8 v6, v31, 0x1

    .line 516
    .line 517
    move-object/from16 v9, v30

    .line 518
    .line 519
    move/from16 v8, v32

    .line 520
    .line 521
    goto :goto_c

    .line 522
    :catchall_3
    move-exception v0

    .line 523
    :goto_d
    move-object v9, v5

    .line 524
    goto :goto_9

    .line 525
    :catch_5
    move-exception v0

    .line 526
    :goto_e
    move-object v9, v5

    .line 527
    goto :goto_a

    .line 528
    :cond_11
    move/from16 v32, v8

    .line 529
    .line 530
    move-object/from16 v30, v9

    .line 531
    .line 532
    int-to-long v8, v10

    .line 533
    div-long v8, v28, v8

    .line 534
    .line 535
    long-to-int v6, v8

    .line 536
    mul-int/lit8 v8, v20, 0x2

    .line 537
    .line 538
    and-int/lit16 v9, v6, 0xff

    .line 539
    .line 540
    int-to-byte v9, v9

    .line 541
    aput-byte v9, v1, v8

    .line 542
    .line 543
    add-int/lit8 v8, v8, 0x1

    .line 544
    .line 545
    shr-int/lit8 v6, v6, 0x8

    .line 546
    .line 547
    and-int/lit16 v6, v6, 0xff

    .line 548
    .line 549
    int-to-byte v6, v6

    .line 550
    aput-byte v6, v1, v8

    .line 551
    .line 552
    add-int/lit8 v6, v20, 0x1

    .line 553
    .line 554
    move-object/from16 v9, v30

    .line 555
    .line 556
    move/from16 v8, v32

    .line 557
    .line 558
    goto :goto_b

    .line 559
    :cond_12
    move/from16 v32, v8

    .line 560
    .line 561
    move-object/from16 v30, v9

    .line 562
    .line 563
    invoke-virtual {v5, v1}, Ljava/io/FileOutputStream;->write([B)V

    .line 564
    .line 565
    .line 566
    int-to-long v8, v12

    .line 567
    add-long v25, v25, v8

    .line 568
    .line 569
    goto :goto_8

    .line 570
    :catchall_4
    move-exception v0

    .line 571
    move-object/from16 v19, v6

    .line 572
    .line 573
    goto :goto_d

    .line 574
    :catch_6
    move-exception v0

    .line 575
    move-object/from16 v19, v6

    .line 576
    .line 577
    goto :goto_e

    .line 578
    :cond_13
    move-object/from16 v19, v6

    .line 579
    .line 580
    move/from16 v32, v8

    .line 581
    .line 582
    move-object/from16 v30, v9

    .line 583
    .line 584
    move-object/from16 p0, v12

    .line 585
    .line 586
    move v1, v10

    .line 587
    :goto_f
    invoke-virtual {v14, v7, v1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 588
    .line 589
    .line 590
    if-eqz v32, :cond_18

    .line 591
    .line 592
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 593
    .line 594
    .line 595
    move-result-wide v16

    .line 596
    const/16 v24, 0x1

    .line 597
    .line 598
    goto :goto_11

    .line 599
    :cond_14
    move-object/from16 v19, v6

    .line 600
    .line 601
    move-object/from16 v30, v9

    .line 602
    .line 603
    move-object/from16 p0, v12

    .line 604
    .line 605
    const/4 v1, -0x3

    .line 606
    if-ne v7, v1, :cond_15

    .line 607
    .line 608
    invoke-virtual {v14}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 613
    .line 614
    .line 615
    move-result-wide v6

    .line 616
    move-object/from16 v23, v1

    .line 617
    .line 618
    :goto_10
    move-wide/from16 v16, v6

    .line 619
    .line 620
    goto :goto_11

    .line 621
    :cond_15
    const/4 v1, -0x2

    .line 622
    if-ne v7, v1, :cond_18

    .line 623
    .line 624
    invoke-virtual {v14}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    invoke-virtual {v1, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 629
    .line 630
    .line 631
    move-result v6

    .line 632
    if-eqz v6, :cond_16

    .line 633
    .line 634
    invoke-virtual {v1, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    :cond_16
    invoke-virtual {v1, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 639
    .line 640
    .line 641
    move-result v6

    .line 642
    if-eqz v6, :cond_17

    .line 643
    .line 644
    invoke-virtual {v1, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 645
    .line 646
    .line 647
    move-result v13

    .line 648
    :cond_17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 649
    .line 650
    .line 651
    move-result-wide v6

    .line 652
    goto :goto_10

    .line 653
    :cond_18
    :goto_11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 654
    .line 655
    .line 656
    move-result-wide v6

    .line 657
    sub-long v6, v6, v16

    .line 658
    .line 659
    const-wide/16 v8, 0x7530

    .line 660
    .line 661
    cmp-long v1, v6, v8

    .line 662
    .line 663
    if-lez v1, :cond_1b

    .line 664
    .line 665
    if-eqz v2, :cond_19

    .line 666
    .line 667
    const-string v1, "\u89e3\u7801\u8d85\u65f6: \u89e3\u7801\u5668\u957f\u65f6\u95f4\u65e0\u8f93\u51fa"

    .line 668
    .line 669
    invoke-interface {v2, v1}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    :cond_19
    new-instance v1, Lme/yun/silk/AacCodec$DecodeResult;

    .line 673
    .line 674
    new-instance v3, Lme/yun/silk/AacCodec$AudioInfo;

    .line 675
    .line 676
    const/4 v11, 0x1

    .line 677
    invoke-static {v11, v13}, Ljava/lang/Math;->max(II)I

    .line 678
    .line 679
    .line 680
    move-result v4

    .line 681
    invoke-direct {v3, v0, v4}, Lme/yun/silk/AacCodec$AudioInfo;-><init>(II)V

    .line 682
    .line 683
    .line 684
    const/16 v4, -0x323

    .line 685
    .line 686
    invoke-direct {v1, v4, v3}, Lme/yun/silk/AacCodec$DecodeResult;-><init>(ILme/yun/silk/AacCodec$AudioInfo;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 687
    .line 688
    .line 689
    :try_start_12
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_7

    .line 690
    .line 691
    .line 692
    :catch_7
    :try_start_13
    invoke-virtual {v14}, Landroid/media/MediaCodec;->stop()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_8

    .line 693
    .line 694
    .line 695
    :catch_8
    :try_start_14
    invoke-virtual {v14}, Landroid/media/MediaCodec;->release()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_9

    .line 696
    .line 697
    .line 698
    :catch_9
    :try_start_15
    invoke-virtual/range {v19 .. v19}, Landroid/media/MediaExtractor;->release()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_a

    .line 699
    .line 700
    .line 701
    :catch_a
    if-eqz p1, :cond_1a

    .line 702
    .line 703
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    if-lez v0, :cond_1a

    .line 708
    .line 709
    invoke-static/range {p1 .. p1}, Lp/a;->v(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    :cond_1a
    return-object v1

    .line 713
    :cond_1b
    move-object/from16 v12, p0

    .line 714
    .line 715
    move-object/from16 v1, p1

    .line 716
    .line 717
    move-object/from16 v6, v19

    .line 718
    .line 719
    move-object/from16 v9, v30

    .line 720
    .line 721
    const v8, 0xac44

    .line 722
    .line 723
    .line 724
    const/4 v10, 0x0

    .line 725
    const/4 v11, 0x1

    .line 726
    goto/16 :goto_5

    .line 727
    .line 728
    :cond_1c
    move-object/from16 v19, v6

    .line 729
    .line 730
    cmp-long v1, v25, v21

    .line 731
    .line 732
    if-gtz v1, :cond_1f

    .line 733
    .line 734
    if-eqz v2, :cond_1d

    .line 735
    .line 736
    :try_start_16
    const-string v1, "\u89e3\u7801\u5931\u8d25: \u672a\u4ea7\u751f\u97f3\u9891\u6570\u636e"

    .line 737
    .line 738
    invoke-interface {v2, v1}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    :cond_1d
    new-instance v1, Lme/yun/silk/AacCodec$DecodeResult;

    .line 742
    .line 743
    new-instance v3, Lme/yun/silk/AacCodec$AudioInfo;

    .line 744
    .line 745
    const/4 v11, 0x1

    .line 746
    invoke-direct {v3, v0, v11}, Lme/yun/silk/AacCodec$AudioInfo;-><init>(II)V

    .line 747
    .line 748
    .line 749
    const/16 v4, -0x323

    .line 750
    .line 751
    invoke-direct {v1, v4, v3}, Lme/yun/silk/AacCodec$DecodeResult;-><init>(ILme/yun/silk/AacCodec$AudioInfo;)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_5
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    .line 752
    .line 753
    .line 754
    :try_start_17
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_b

    .line 755
    .line 756
    .line 757
    :catch_b
    :try_start_18
    invoke-virtual {v14}, Landroid/media/MediaCodec;->stop()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_c

    .line 758
    .line 759
    .line 760
    :catch_c
    :try_start_19
    invoke-virtual {v14}, Landroid/media/MediaCodec;->release()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_d

    .line 761
    .line 762
    .line 763
    :catch_d
    :try_start_1a
    invoke-virtual/range {v19 .. v19}, Landroid/media/MediaExtractor;->release()V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_e

    .line 764
    .line 765
    .line 766
    :catch_e
    if-eqz p1, :cond_1e

    .line 767
    .line 768
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    if-lez v0, :cond_1e

    .line 773
    .line 774
    invoke-static/range {p1 .. p1}, Lp/a;->v(Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    :cond_1e
    return-object v1

    .line 778
    :cond_1f
    :try_start_1b
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_14
    .catchall {:try_start_1b .. :try_end_1b} :catchall_7

    .line 779
    .line 780
    .line 781
    if-eqz v2, :cond_20

    .line 782
    .line 783
    :try_start_1c
    const-string v1, "\u89e3\u7801\u5b8c\u6210"

    .line 784
    .line 785
    invoke-interface {v2, v1}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_f
    .catchall {:try_start_1c .. :try_end_1c} :catchall_5

    .line 786
    .line 787
    .line 788
    goto :goto_12

    .line 789
    :catchall_5
    move-exception v0

    .line 790
    const/4 v9, 0x0

    .line 791
    goto/16 :goto_9

    .line 792
    .line 793
    :catch_f
    move-exception v0

    .line 794
    const/4 v9, 0x0

    .line 795
    goto/16 :goto_a

    .line 796
    .line 797
    :cond_20
    :goto_12
    :try_start_1d
    new-instance v1, Lme/yun/silk/AacCodec$DecodeResult;

    .line 798
    .line 799
    new-instance v3, Lme/yun/silk/AacCodec$AudioInfo;

    .line 800
    .line 801
    const/4 v11, 0x1

    .line 802
    invoke-direct {v3, v0, v11}, Lme/yun/silk/AacCodec$AudioInfo;-><init>(II)V

    .line 803
    .line 804
    .line 805
    const/4 v4, 0x0

    .line 806
    invoke-direct {v1, v4, v3}, Lme/yun/silk/AacCodec$DecodeResult;-><init>(ILme/yun/silk/AacCodec$AudioInfo;)V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_13
    .catchall {:try_start_1d .. :try_end_1d} :catchall_6

    .line 807
    .line 808
    .line 809
    :try_start_1e
    invoke-virtual {v14}, Landroid/media/MediaCodec;->stop()V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_10

    .line 810
    .line 811
    .line 812
    :catch_10
    :try_start_1f
    invoke-virtual {v14}, Landroid/media/MediaCodec;->release()V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_11

    .line 813
    .line 814
    .line 815
    :catch_11
    :try_start_20
    invoke-virtual/range {v19 .. v19}, Landroid/media/MediaExtractor;->release()V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_12

    .line 816
    .line 817
    .line 818
    :catch_12
    return-object v1

    .line 819
    :catchall_6
    move-exception v0

    .line 820
    const/4 v9, 0x0

    .line 821
    const/4 v10, 0x1

    .line 822
    goto/16 :goto_17

    .line 823
    .line 824
    :catch_13
    move-exception v0

    .line 825
    const/4 v9, 0x0

    .line 826
    const/4 v10, 0x1

    .line 827
    goto :goto_15

    .line 828
    :catchall_7
    move-exception v0

    .line 829
    const/4 v4, 0x0

    .line 830
    move v10, v4

    .line 831
    :goto_13
    move-object v9, v5

    .line 832
    goto/16 :goto_17

    .line 833
    .line 834
    :catch_14
    move-exception v0

    .line 835
    const/4 v4, 0x0

    .line 836
    move v10, v4

    .line 837
    :goto_14
    move-object v9, v5

    .line 838
    goto :goto_15

    .line 839
    :catchall_8
    move-exception v0

    .line 840
    move-object/from16 v19, v6

    .line 841
    .line 842
    move v4, v10

    .line 843
    goto :goto_13

    .line 844
    :catch_15
    move-exception v0

    .line 845
    move-object/from16 v19, v6

    .line 846
    .line 847
    move v4, v10

    .line 848
    goto :goto_14

    .line 849
    :catchall_9
    move-exception v0

    .line 850
    move-object/from16 v19, v6

    .line 851
    .line 852
    move v4, v10

    .line 853
    const/4 v9, 0x0

    .line 854
    goto :goto_17

    .line 855
    :catch_16
    move-exception v0

    .line 856
    move-object/from16 v19, v6

    .line 857
    .line 858
    move v4, v10

    .line 859
    const/4 v9, 0x0

    .line 860
    goto :goto_15

    .line 861
    :catchall_a
    move-exception v0

    .line 862
    move-object/from16 v19, v6

    .line 863
    .line 864
    move v4, v10

    .line 865
    const/4 v9, 0x0

    .line 866
    const/4 v14, 0x0

    .line 867
    goto :goto_17

    .line 868
    :catch_17
    move-exception v0

    .line 869
    move-object/from16 v19, v6

    .line 870
    .line 871
    move v4, v10

    .line 872
    const/4 v9, 0x0

    .line 873
    const/4 v14, 0x0

    .line 874
    :goto_15
    if-eqz v2, :cond_21

    .line 875
    .line 876
    :try_start_21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 877
    .line 878
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 879
    .line 880
    .line 881
    const-string v3, "\u89e3\u7801\u5f02\u5e38: "

    .line 882
    .line 883
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v3

    .line 890
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v1

    .line 897
    invoke-interface {v2, v1}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    goto :goto_16

    .line 901
    :catchall_b
    move-exception v0

    .line 902
    goto :goto_17

    .line 903
    :cond_21
    :goto_16
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 904
    .line 905
    .line 906
    new-instance v0, Lme/yun/silk/AacCodec$DecodeResult;

    .line 907
    .line 908
    new-instance v1, Lme/yun/silk/AacCodec$AudioInfo;

    .line 909
    .line 910
    const v2, 0xac44

    .line 911
    .line 912
    .line 913
    const/4 v11, 0x1

    .line 914
    invoke-direct {v1, v2, v11}, Lme/yun/silk/AacCodec$AudioInfo;-><init>(II)V

    .line 915
    .line 916
    .line 917
    const/16 v4, -0x323

    .line 918
    .line 919
    invoke-direct {v0, v4, v1}, Lme/yun/silk/AacCodec$DecodeResult;-><init>(ILme/yun/silk/AacCodec$AudioInfo;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_b

    .line 920
    .line 921
    .line 922
    if-eqz v9, :cond_22

    .line 923
    .line 924
    :try_start_22
    invoke-virtual {v9}, Ljava/io/FileOutputStream;->close()V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_18

    .line 925
    .line 926
    .line 927
    :catch_18
    :cond_22
    if-eqz v14, :cond_23

    .line 928
    .line 929
    :try_start_23
    invoke-virtual {v14}, Landroid/media/MediaCodec;->stop()V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_19

    .line 930
    .line 931
    .line 932
    :catch_19
    :cond_23
    if-eqz v14, :cond_24

    .line 933
    .line 934
    :try_start_24
    invoke-virtual {v14}, Landroid/media/MediaCodec;->release()V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_1a

    .line 935
    .line 936
    .line 937
    :catch_1a
    :cond_24
    :try_start_25
    invoke-virtual/range {v19 .. v19}, Landroid/media/MediaExtractor;->release()V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_1b

    .line 938
    .line 939
    .line 940
    :catch_1b
    if-nez v10, :cond_25

    .line 941
    .line 942
    if-eqz p1, :cond_25

    .line 943
    .line 944
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 945
    .line 946
    .line 947
    move-result v1

    .line 948
    if-lez v1, :cond_25

    .line 949
    .line 950
    invoke-static/range {p1 .. p1}, Lp/a;->v(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    :cond_25
    return-object v0

    .line 954
    :goto_17
    if-eqz v9, :cond_26

    .line 955
    .line 956
    :try_start_26
    invoke-virtual {v9}, Ljava/io/FileOutputStream;->close()V
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_1c

    .line 957
    .line 958
    .line 959
    :catch_1c
    :cond_26
    if-eqz v14, :cond_27

    .line 960
    .line 961
    :try_start_27
    invoke-virtual {v14}, Landroid/media/MediaCodec;->stop()V
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_1d

    .line 962
    .line 963
    .line 964
    :catch_1d
    :cond_27
    if-eqz v14, :cond_28

    .line 965
    .line 966
    :try_start_28
    invoke-virtual {v14}, Landroid/media/MediaCodec;->release()V
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_1e

    .line 967
    .line 968
    .line 969
    :catch_1e
    :cond_28
    :try_start_29
    invoke-virtual/range {v19 .. v19}, Landroid/media/MediaExtractor;->release()V
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_1f

    .line 970
    .line 971
    .line 972
    :catch_1f
    if-nez v10, :cond_29

    .line 973
    .line 974
    if-eqz p1, :cond_29

    .line 975
    .line 976
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 977
    .line 978
    .line 979
    move-result v1

    .line 980
    if-lez v1, :cond_29

    .line 981
    .line 982
    invoke-static/range {p1 .. p1}, Lp/a;->v(Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    :cond_29
    throw v0
.end method

.method public static decodeM4aFile(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lme/yun/silk/AacCodec;->decodeAacFile(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static decodeOggToPcmWithInfo(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)Lme/yun/silk/AacCodec$DecodeResult;
    .locals 1

    .line 1
    invoke-static {p0}, Lme/yun/silk/AacCodec;->isOggOpusFile(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p0, p1, p2}, Lme/yun/silk/AacCodec;->decodeAacFileWithInfo(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)Lme/yun/silk/AacCodec$DecodeResult;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget p2, p0, Lme/yun/silk/AacCodec$DecodeResult;->code:I

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance p2, Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 23
    .line 24
    .line 25
    new-instance p1, Lme/yun/silk/AacCodec$DecodeResult;

    .line 26
    .line 27
    const/16 p2, -0x191

    .line 28
    .line 29
    iget-object p0, p0, Lme/yun/silk/AacCodec$DecodeResult;->audioInfo:Lme/yun/silk/AacCodec$AudioInfo;

    .line 30
    .line 31
    invoke-direct {p1, p2, p0}, Lme/yun/silk/AacCodec$DecodeResult;-><init>(ILme/yun/silk/AacCodec$AudioInfo;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    invoke-virtual {p2, p0, p1}, Lme/yun/silk/SilkCodec;->oggToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    new-instance p2, Lme/yun/silk/AacCodec$DecodeResult;

    .line 40
    .line 41
    new-instance v0, Lme/yun/silk/AacCodec$AudioInfo;

    .line 42
    .line 43
    invoke-static {p0, p3}, Lme/yun/silk/AacCodec;->getMetadataSampleRate(Ljava/lang/String;I)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    const/4 p3, 0x1

    .line 48
    invoke-direct {v0, p0, p3}, Lme/yun/silk/AacCodec$AudioInfo;-><init>(II)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p2, p1, v0}, Lme/yun/silk/AacCodec$DecodeResult;-><init>(ILme/yun/silk/AacCodec$AudioInfo;)V

    .line 52
    .line 53
    .line 54
    return-object p2
.end method

.method public static encodePcmToAac(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    const-string v4, "audio/mp4a-latm"

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    new-instance v5, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v6, "\u5f00\u59cb\u7f16\u7801 AAC: "

    .line 16
    .line 17
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-interface {v3, v5}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    new-instance v5, Ljava/io/File;

    .line 31
    .line 32
    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-nez v6, :cond_2

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    const-string v0, "PCM \u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 44
    .line 45
    invoke-interface {v3, v0}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    const/16 v0, -0x385

    .line 49
    .line 50
    return v0

    .line 51
    :cond_2
    :try_start_0
    invoke-static {v4, v1, v2}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    const-string v7, "bitrate"

    .line 56
    .line 57
    const v8, 0x1f400

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    const-string v7, "aac-profile"

    .line 64
    .line 65
    const/4 v8, 0x2

    .line 66
    invoke-virtual {v6, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    const-string v7, "max-input-size"

    .line 70
    .line 71
    const/16 v8, 0x4000

    .line 72
    .line 73
    invoke-virtual {v6, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    invoke-static {v4}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v7, 0x1

    .line 82
    invoke-virtual {v9, v6, v4, v4, v7}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9}, Landroid/media/MediaCodec;->start()V

    .line 86
    .line 87
    .line 88
    new-instance v4, Ljava/io/RandomAccessFile;

    .line 89
    .line 90
    const-string v6, "r"

    .line 91
    .line 92
    invoke-direct {v4, v0, v6}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, Ljava/io/FileOutputStream;

    .line 96
    .line 97
    move-object/from16 v6, p1

    .line 98
    .line 99
    invoke-direct {v0, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v9}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-virtual {v9}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    new-instance v10, Landroid/media/MediaCodec$BufferInfo;

    .line 111
    .line 112
    invoke-direct {v10}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 116
    .line 117
    .line 118
    move-result-wide v16

    .line 119
    const/4 v5, 0x0

    .line 120
    move v11, v5

    .line 121
    move/from16 v18, v11

    .line 122
    .line 123
    move/from16 v19, v18

    .line 124
    .line 125
    :goto_0
    if-nez v18, :cond_b

    .line 126
    .line 127
    const-wide/16 v12, 0x2710

    .line 128
    .line 129
    if-nez v19, :cond_5

    .line 130
    .line 131
    move-object v14, v10

    .line 132
    invoke-virtual {v9, v12, v13}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    if-ltz v10, :cond_4

    .line 137
    .line 138
    aget-object v15, v6, v10

    .line 139
    .line 140
    invoke-virtual {v15}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 144
    .line 145
    .line 146
    move-result-wide v20

    .line 147
    move-object/from16 p0, v8

    .line 148
    .line 149
    sub-long v7, v16, v20

    .line 150
    .line 151
    long-to-int v7, v7

    .line 152
    const/16 v8, 0x1000

    .line 153
    .line 154
    invoke-static {v8, v7}, Ljava/lang/Math;->min(II)I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    new-array v7, v7, [B

    .line 159
    .line 160
    move-wide/from16 v20, v12

    .line 161
    .line 162
    invoke-virtual {v4, v7}, Ljava/io/RandomAccessFile;->read([B)I

    .line 163
    .line 164
    .line 165
    move-result v12

    .line 166
    if-lez v12, :cond_3

    .line 167
    .line 168
    invoke-virtual {v15, v7, v5, v12}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 169
    .line 170
    .line 171
    int-to-long v7, v11

    .line 172
    const-wide/32 v22, 0x3d090000

    .line 173
    .line 174
    .line 175
    mul-long v7, v7, v22

    .line 176
    .line 177
    move-object/from16 p1, v6

    .line 178
    .line 179
    int-to-long v5, v1

    .line 180
    div-long/2addr v7, v5

    .line 181
    move v5, v11

    .line 182
    const/4 v11, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    move-object v6, v14

    .line 185
    move-wide v13, v7

    .line 186
    move-wide/from16 v7, v20

    .line 187
    .line 188
    invoke-virtual/range {v9 .. v15}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 189
    .line 190
    .line 191
    add-int/lit8 v11, v5, 0x1

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :catch_0
    move-exception v0

    .line 195
    goto/16 :goto_6

    .line 196
    .line 197
    :cond_3
    move-object/from16 p1, v6

    .line 198
    .line 199
    move v5, v11

    .line 200
    move-object v6, v14

    .line 201
    move-wide/from16 v7, v20

    .line 202
    .line 203
    const-wide/16 v13, 0x0

    .line 204
    .line 205
    const/4 v15, 0x4

    .line 206
    const/4 v11, 0x0

    .line 207
    const/4 v12, 0x0

    .line 208
    invoke-virtual/range {v9 .. v15}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 209
    .line 210
    .line 211
    move v11, v5

    .line 212
    const/16 v19, 0x1

    .line 213
    .line 214
    :goto_1
    if-eqz v3, :cond_6

    .line 215
    .line 216
    const-wide/16 v12, 0x0

    .line 217
    .line 218
    cmp-long v5, v16, v12

    .line 219
    .line 220
    if-lez v5, :cond_6

    .line 221
    .line 222
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 223
    .line 224
    .line 225
    move-result-wide v12

    .line 226
    const-wide/16 v14, 0x64

    .line 227
    .line 228
    mul-long/2addr v12, v14

    .line 229
    div-long v12, v12, v16

    .line 230
    .line 231
    long-to-int v5, v12

    .line 232
    const/16 v10, 0x63

    .line 233
    .line 234
    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    invoke-interface {v3, v5}, Lme/yun/silk/AacCodec$AacCallback;->onProgress(I)V

    .line 239
    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_4
    move-object/from16 p1, v6

    .line 243
    .line 244
    move-object v6, v14

    .line 245
    :goto_2
    move-object/from16 p0, v8

    .line 246
    .line 247
    move v5, v11

    .line 248
    move-wide v7, v12

    .line 249
    goto :goto_3

    .line 250
    :cond_5
    move-object/from16 p1, v6

    .line 251
    .line 252
    move-object v6, v10

    .line 253
    goto :goto_2

    .line 254
    :goto_3
    move v11, v5

    .line 255
    :cond_6
    :goto_4
    invoke-virtual {v9, v6, v7, v8}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-ltz v5, :cond_a

    .line 260
    .line 261
    iget v7, v6, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 262
    .line 263
    and-int/lit8 v7, v7, 0x4

    .line 264
    .line 265
    if-eqz v7, :cond_7

    .line 266
    .line 267
    const/16 v18, 0x1

    .line 268
    .line 269
    :cond_7
    iget v7, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 270
    .line 271
    if-lez v7, :cond_8

    .line 272
    .line 273
    aget-object v8, p0, v5

    .line 274
    .line 275
    new-array v10, v7, [B

    .line 276
    .line 277
    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 278
    .line 279
    .line 280
    invoke-static {v1, v2, v7}, Lme/yun/silk/AacCodec;->createAdtsHeader(III)[B

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    invoke-virtual {v0, v7}, Ljava/io/FileOutputStream;->write([B)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v10}, Ljava/io/FileOutputStream;->write([B)V

    .line 288
    .line 289
    .line 290
    :cond_8
    const/4 v7, 0x0

    .line 291
    invoke-virtual {v9, v5, v7}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 292
    .line 293
    .line 294
    :cond_9
    move-object/from16 v8, p0

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_a
    const/4 v7, -0x3

    .line 298
    if-ne v5, v7, :cond_9

    .line 299
    .line 300
    invoke-virtual {v9}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    move-object v8, v5

    .line 305
    :goto_5
    move-object v10, v6

    .line 306
    const/4 v5, 0x0

    .line 307
    const/4 v7, 0x1

    .line 308
    move-object/from16 v6, p1

    .line 309
    .line 310
    goto/16 :goto_0

    .line 311
    .line 312
    :cond_b
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v9}, Landroid/media/MediaCodec;->stop()V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v9}, Landroid/media/MediaCodec;->release()V

    .line 322
    .line 323
    .line 324
    if-eqz v3, :cond_c

    .line 325
    .line 326
    const-string v0, "\u7f16\u7801\u5b8c\u6210"

    .line 327
    .line 328
    invoke-interface {v3, v0}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    const/16 v0, 0x64

    .line 332
    .line 333
    invoke-interface {v3, v0}, Lme/yun/silk/AacCodec$AacCallback;->onProgress(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 334
    .line 335
    .line 336
    :cond_c
    const/16 v22, 0x0

    .line 337
    .line 338
    return v22

    .line 339
    :goto_6
    if-eqz v3, :cond_d

    .line 340
    .line 341
    new-instance v1, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    const-string v2, "\u7f16\u7801\u5f02\u5e38: "

    .line 344
    .line 345
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-interface {v3, v1}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 363
    .line 364
    .line 365
    const/16 v0, -0x386

    .line 366
    .line 367
    return v0
.end method

.method public static encodePcmToM4a(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    const-string v4, "audio/mp4a-latm"

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    new-instance v5, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v6, "\u5f00\u59cb\u7f16\u7801 M4A: "

    .line 16
    .line 17
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-interface {v3, v5}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    new-instance v5, Ljava/io/File;

    .line 31
    .line 32
    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-nez v6, :cond_2

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    const-string v0, "PCM \u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 44
    .line 45
    invoke-interface {v3, v0}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    const/16 v0, -0x38f

    .line 49
    .line 50
    return v0

    .line 51
    :cond_2
    :try_start_0
    invoke-static {v4, v1, v2}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    const-string v7, "bitrate"

    .line 56
    .line 57
    const v8, 0x1f400

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    const-string v7, "aac-profile"

    .line 64
    .line 65
    const/4 v8, 0x2

    .line 66
    invoke-virtual {v6, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    const-string v7, "max-input-size"

    .line 70
    .line 71
    const/16 v8, 0x4000

    .line 72
    .line 73
    invoke-virtual {v6, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    invoke-static {v4}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v7, 0x1

    .line 82
    invoke-virtual {v9, v6, v4, v4, v7}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9}, Landroid/media/MediaCodec;->start()V

    .line 86
    .line 87
    .line 88
    new-instance v4, Landroid/media/MediaMuxer;

    .line 89
    .line 90
    const/4 v6, 0x0

    .line 91
    move-object/from16 v8, p1

    .line 92
    .line 93
    invoke-direct {v4, v8, v6}, Landroid/media/MediaMuxer;-><init>(Ljava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    new-instance v8, Ljava/io/RandomAccessFile;

    .line 97
    .line 98
    const-string v10, "r"

    .line 99
    .line 100
    invoke-direct {v8, v0, v10}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v9}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    new-instance v11, Landroid/media/MediaCodec$BufferInfo;

    .line 112
    .line 113
    invoke-direct {v11}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 117
    .line 118
    .line 119
    move-result-wide v16

    .line 120
    mul-int/lit16 v2, v2, 0x800

    .line 121
    .line 122
    const/4 v5, -0x1

    .line 123
    move/from16 v19, v6

    .line 124
    .line 125
    move/from16 v20, v19

    .line 126
    .line 127
    move/from16 v21, v20

    .line 128
    .line 129
    move-object/from16 v18, v10

    .line 130
    .line 131
    move/from16 v10, v21

    .line 132
    .line 133
    :goto_0
    if-nez v19, :cond_b

    .line 134
    .line 135
    const-wide/16 v12, 0x2710

    .line 136
    .line 137
    if-nez v20, :cond_4

    .line 138
    .line 139
    invoke-virtual {v9, v12, v13}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    if-ltz v14, :cond_4

    .line 144
    .line 145
    aget-object v15, v0, v14

    .line 146
    .line 147
    invoke-virtual {v15}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 151
    .line 152
    .line 153
    move-result-wide v22

    .line 154
    sub-long v12, v16, v22

    .line 155
    .line 156
    long-to-int v12, v12

    .line 157
    invoke-static {v2, v12}, Ljava/lang/Math;->min(II)I

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    new-array v12, v12, [B

    .line 162
    .line 163
    invoke-virtual {v8, v12}, Ljava/io/RandomAccessFile;->read([B)I

    .line 164
    .line 165
    .line 166
    move-result v13

    .line 167
    if-lez v13, :cond_3

    .line 168
    .line 169
    invoke-virtual {v15, v12, v6, v13}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 170
    .line 171
    .line 172
    move-object/from16 v23, v8

    .line 173
    .line 174
    int-to-long v7, v10

    .line 175
    const-wide/32 v24, 0x3d090000

    .line 176
    .line 177
    .line 178
    mul-long v7, v7, v24

    .line 179
    .line 180
    move-wide/from16 v25, v7

    .line 181
    .line 182
    int-to-long v6, v1

    .line 183
    div-long v7, v25, v6

    .line 184
    .line 185
    move-object v6, v11

    .line 186
    const/4 v11, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    move-object/from16 p0, v0

    .line 189
    .line 190
    move v12, v13

    .line 191
    const-wide/16 v0, 0x2710

    .line 192
    .line 193
    move-wide/from16 v27, v7

    .line 194
    .line 195
    move-object v7, v6

    .line 196
    move v6, v10

    .line 197
    move v10, v14

    .line 198
    move-wide/from16 v13, v27

    .line 199
    .line 200
    invoke-virtual/range {v9 .. v15}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 201
    .line 202
    .line 203
    add-int/lit8 v10, v6, 0x1

    .line 204
    .line 205
    goto :goto_1

    .line 206
    :catch_0
    move-exception v0

    .line 207
    goto/16 :goto_4

    .line 208
    .line 209
    :cond_3
    move-object/from16 p0, v0

    .line 210
    .line 211
    move-object/from16 v23, v8

    .line 212
    .line 213
    move v6, v10

    .line 214
    move-object v7, v11

    .line 215
    move v10, v14

    .line 216
    const-wide/16 v0, 0x2710

    .line 217
    .line 218
    const-wide/16 v13, 0x0

    .line 219
    .line 220
    const/4 v15, 0x4

    .line 221
    const/4 v11, 0x0

    .line 222
    const/4 v12, 0x0

    .line 223
    invoke-virtual/range {v9 .. v15}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 224
    .line 225
    .line 226
    move v10, v6

    .line 227
    const/16 v20, 0x1

    .line 228
    .line 229
    :goto_1
    if-eqz v3, :cond_5

    .line 230
    .line 231
    const-wide/16 v11, 0x0

    .line 232
    .line 233
    cmp-long v6, v16, v11

    .line 234
    .line 235
    if-lez v6, :cond_5

    .line 236
    .line 237
    invoke-virtual/range {v23 .. v23}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 238
    .line 239
    .line 240
    move-result-wide v11

    .line 241
    const-wide/16 v13, 0x64

    .line 242
    .line 243
    mul-long/2addr v11, v13

    .line 244
    div-long v11, v11, v16

    .line 245
    .line 246
    long-to-int v6, v11

    .line 247
    const/16 v8, 0x63

    .line 248
    .line 249
    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    invoke-interface {v3, v6}, Lme/yun/silk/AacCodec$AacCallback;->onProgress(I)V

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_4
    move-object/from16 p0, v0

    .line 258
    .line 259
    move-object/from16 v23, v8

    .line 260
    .line 261
    move v6, v10

    .line 262
    move-object v7, v11

    .line 263
    move-wide v0, v12

    .line 264
    move v10, v6

    .line 265
    :cond_5
    :goto_2
    invoke-virtual {v9, v7, v0, v1}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-ltz v0, :cond_9

    .line 270
    .line 271
    iget v1, v7, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 272
    .line 273
    and-int/lit8 v1, v1, 0x4

    .line 274
    .line 275
    if-eqz v1, :cond_6

    .line 276
    .line 277
    const/16 v19, 0x1

    .line 278
    .line 279
    :cond_6
    iget v1, v7, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 280
    .line 281
    if-lez v1, :cond_8

    .line 282
    .line 283
    if-nez v19, :cond_8

    .line 284
    .line 285
    if-nez v21, :cond_7

    .line 286
    .line 287
    invoke-virtual {v9}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-virtual {v4, v1}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    invoke-virtual {v4}, Landroid/media/MediaMuxer;->start()V

    .line 296
    .line 297
    .line 298
    const/16 v21, 0x1

    .line 299
    .line 300
    :cond_7
    aget-object v1, v18, v0

    .line 301
    .line 302
    invoke-virtual {v4, v5, v1, v7}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 303
    .line 304
    .line 305
    :cond_8
    const/4 v1, 0x0

    .line 306
    invoke-virtual {v9, v0, v1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 307
    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_9
    const/4 v1, -0x3

    .line 311
    if-ne v0, v1, :cond_a

    .line 312
    .line 313
    invoke-virtual {v9}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    move-object/from16 v18, v0

    .line 318
    .line 319
    :cond_a
    :goto_3
    move-object/from16 v0, p0

    .line 320
    .line 321
    move/from16 v1, p2

    .line 322
    .line 323
    move-object v11, v7

    .line 324
    move-object/from16 v8, v23

    .line 325
    .line 326
    const/4 v6, 0x0

    .line 327
    const/4 v7, 0x1

    .line 328
    goto/16 :goto_0

    .line 329
    .line 330
    :cond_b
    move-object/from16 v23, v8

    .line 331
    .line 332
    invoke-virtual/range {v23 .. v23}, Ljava/io/RandomAccessFile;->close()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v9}, Landroid/media/MediaCodec;->stop()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v9}, Landroid/media/MediaCodec;->release()V

    .line 339
    .line 340
    .line 341
    if-eqz v21, :cond_c

    .line 342
    .line 343
    invoke-virtual {v4}, Landroid/media/MediaMuxer;->stop()V

    .line 344
    .line 345
    .line 346
    :cond_c
    invoke-virtual {v4}, Landroid/media/MediaMuxer;->release()V

    .line 347
    .line 348
    .line 349
    if-eqz v3, :cond_d

    .line 350
    .line 351
    const-string v0, "\u7f16\u7801\u5b8c\u6210"

    .line 352
    .line 353
    invoke-interface {v3, v0}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    const/16 v0, 0x64

    .line 357
    .line 358
    invoke-interface {v3, v0}, Lme/yun/silk/AacCodec$AacCallback;->onProgress(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 359
    .line 360
    .line 361
    :cond_d
    const/16 v24, 0x0

    .line 362
    .line 363
    return v24

    .line 364
    :goto_4
    if-eqz v3, :cond_e

    .line 365
    .line 366
    new-instance v1, Ljava/lang/StringBuilder;

    .line 367
    .line 368
    const-string v2, "\u7f16\u7801\u5f02\u5e38: "

    .line 369
    .line 370
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-interface {v3, v1}, Lme/yun/silk/AacCodec$AacCallback;->onMessage(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 388
    .line 389
    .line 390
    const/16 v0, -0x390

    .line 391
    .line 392
    return v0
.end method

.method private static flacToAac(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    const-string v0, ".temp.pcm"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    new-instance v1, Lme/yun/silk/SilkCodec;

    .line 8
    .line 9
    invoke-direct {v1}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, Lme/yun/silk/SilkCodec;->flacToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_1
    invoke-static {p0, p2}, Lme/yun/silk/AacCodec;->getMetadataSampleRate(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 p2, 0x1

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {v0, p1, p0, p2, v1}, Lme/yun/silk/AacCodec;->encodePcmToAac(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return p0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p0

    .line 39
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/16 p0, -0x41b

    .line 46
    .line 47
    return p0

    .line 48
    :goto_0
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method private static flacToM4a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    const-string v0, ".temp.pcm"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    new-instance v1, Lme/yun/silk/SilkCodec;

    .line 8
    .line 9
    invoke-direct {v1}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, Lme/yun/silk/SilkCodec;->flacToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_1
    invoke-static {p0, p2}, Lme/yun/silk/AacCodec;->getMetadataSampleRate(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 p2, 0x1

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {v0, p1, p0, p2, v1}, Lme/yun/silk/AacCodec;->encodePcmToM4a(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return p0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p0

    .line 39
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/16 p0, -0x425

    .line 46
    .line 47
    return p0

    .line 48
    :goto_0
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method public static getAudioInfo(Ljava/lang/String;)Lme/yun/silk/AacCodec$AudioInfo;
    .locals 8

    .line 1
    const-string v0, "channel-count"

    .line 2
    .line 3
    const-string v1, "sample-rate"

    .line 4
    .line 5
    new-instance v2, Landroid/media/MediaExtractor;

    .line 6
    .line 7
    invoke-direct {v2}, Landroid/media/MediaExtractor;-><init>()V

    .line 8
    .line 9
    .line 10
    const v3, 0xac44

    .line 11
    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    :try_start_0
    invoke-virtual {v2, p0}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    :goto_0
    invoke-virtual {v2}, Landroid/media/MediaExtractor;->getTrackCount()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-ge p0, v5, :cond_3

    .line 23
    .line 24
    invoke-virtual {v2, p0}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const-string v6, "mime"

    .line 29
    .line 30
    invoke-virtual {v5, v6}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    if-eqz v6, :cond_2

    .line 35
    .line 36
    const-string v7, "audio/"

    .line 37
    .line 38
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    invoke-virtual {v5, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    invoke-virtual {v5, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    move p0, v3

    .line 56
    :goto_1
    invoke-virtual {v5, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {v5, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    move v0, v4

    .line 68
    :goto_2
    invoke-virtual {v2}, Landroid/media/MediaExtractor;->release()V

    .line 69
    .line 70
    .line 71
    new-instance v1, Lme/yun/silk/AacCodec$AudioInfo;

    .line 72
    .line 73
    invoke-direct {v1, p0, v0}, Lme/yun/silk/AacCodec$AudioInfo;-><init>(II)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_2
    add-int/lit8 p0, p0, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-virtual {v2}, Landroid/media/MediaExtractor;->release()V

    .line 81
    .line 82
    .line 83
    new-instance p0, Lme/yun/silk/AacCodec$AudioInfo;

    .line 84
    .line 85
    invoke-direct {p0, v3, v4}, Lme/yun/silk/AacCodec$AudioInfo;-><init>(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :catch_0
    invoke-virtual {v2}, Landroid/media/MediaExtractor;->release()V

    .line 90
    .line 91
    .line 92
    new-instance p0, Lme/yun/silk/AacCodec$AudioInfo;

    .line 93
    .line 94
    invoke-direct {p0, v3, v4}, Lme/yun/silk/AacCodec$AudioInfo;-><init>(II)V

    .line 95
    .line 96
    .line 97
    return-object p0
.end method

.method public static getDuration(Ljava/lang/String;)J
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    .line 3
    .line 4
    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    .line 7
    :try_start_1
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/16 p0, 0x9

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :try_start_2
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 23
    .line 24
    .line 25
    :catch_0
    return-wide v2

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    move-object v0, v1

    .line 28
    goto :goto_0

    .line 29
    :catch_1
    move-object v0, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :try_start_3
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :catchall_1
    move-exception p0

    .line 36
    :goto_0
    if-eqz v0, :cond_1

    .line 37
    .line 38
    :try_start_4
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 39
    .line 40
    .line 41
    :catch_2
    :cond_1
    throw p0

    .line 42
    :catch_3
    :goto_1
    if-eqz v0, :cond_2

    .line 43
    .line 44
    :try_start_5
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 45
    .line 46
    .line 47
    :catch_4
    :cond_2
    :goto_2
    const-wide/16 v0, 0x0

    .line 48
    .line 49
    return-wide v0
.end method

.method public static getErrorMessage(I)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "\u6210\u529f"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 v0, -0x321

    .line 7
    .line 8
    if-lt p0, v0, :cond_1

    .line 9
    .line 10
    const/16 v0, -0x322

    .line 11
    .line 12
    if-gt p0, v0, :cond_1

    .line 13
    .line 14
    const-string p0, "AAC/M4A \u89e3\u7801\u9519\u8bef (\u6587\u4ef6\u8bfb\u53d6\u5931\u8d25)"

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    const/16 v0, -0x323

    .line 18
    .line 19
    if-ne p0, v0, :cond_2

    .line 20
    .line 21
    const-string p0, "AAC/M4A \u89e3\u7801\u9519\u8bef (\u683c\u5f0f\u4e0d\u652f\u6301)"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    const/16 v0, -0x385

    .line 25
    .line 26
    if-lt p0, v0, :cond_3

    .line 27
    .line 28
    const/16 v0, -0x386

    .line 29
    .line 30
    if-gt p0, v0, :cond_3

    .line 31
    .line 32
    const-string p0, "AAC \u7f16\u7801\u9519\u8bef (\u6587\u4ef6\u64cd\u4f5c\u5931\u8d25)"

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_3
    const/16 v0, -0x38f

    .line 36
    .line 37
    if-lt p0, v0, :cond_4

    .line 38
    .line 39
    const/16 v0, -0x390

    .line 40
    .line 41
    if-gt p0, v0, :cond_4

    .line 42
    .line 43
    const-string p0, "M4A \u7f16\u7801\u9519\u8bef (Muxer \u5931\u8d25)"

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    const/16 v0, -0x3e9

    .line 47
    .line 48
    if-lt p0, v0, :cond_5

    .line 49
    .line 50
    const/16 v0, -0x3f1

    .line 51
    .line 52
    if-gt p0, v0, :cond_5

    .line 53
    .line 54
    const-string p0, "Silk \u8f6c AAC/M4A \u9519\u8bef"

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_5
    const/16 v0, -0x3f3

    .line 58
    .line 59
    if-lt p0, v0, :cond_6

    .line 60
    .line 61
    const/16 v0, -0x3f4

    .line 62
    .line 63
    if-gt p0, v0, :cond_6

    .line 64
    .line 65
    const-string p0, "MP3 \u8f6c AAC/M4A \u9519\u8bef"

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_6
    const/16 v0, -0x3fd

    .line 69
    .line 70
    if-lt p0, v0, :cond_7

    .line 71
    .line 72
    const/16 v0, -0x3fe

    .line 73
    .line 74
    if-gt p0, v0, :cond_7

    .line 75
    .line 76
    const-string p0, "WAV \u8f6c AAC/M4A \u9519\u8bef"

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_7
    const/16 v0, -0x407

    .line 80
    .line 81
    if-lt p0, v0, :cond_8

    .line 82
    .line 83
    const/16 v0, -0x40f

    .line 84
    .line 85
    if-gt p0, v0, :cond_8

    .line 86
    .line 87
    const-string p0, "M4A/AAC \u8f6c Silk \u9519\u8bef"

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_8
    const/16 v0, -0x41b

    .line 91
    .line 92
    if-lt p0, v0, :cond_9

    .line 93
    .line 94
    const/16 v0, -0x423

    .line 95
    .line 96
    if-gt p0, v0, :cond_9

    .line 97
    .line 98
    const-string p0, "M4A/AAC \u8f6c AAC \u9519\u8bef"

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_9
    const/16 v0, -0x425

    .line 102
    .line 103
    if-lt p0, v0, :cond_a

    .line 104
    .line 105
    const/16 v0, -0x42d

    .line 106
    .line 107
    if-gt p0, v0, :cond_a

    .line 108
    .line 109
    const-string p0, "M4A/AAC \u8f6c M4A \u9519\u8bef"

    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_a
    const/16 v0, -0x7d0

    .line 113
    .line 114
    if-ne p0, v0, :cond_b

    .line 115
    .line 116
    const-string p0, "M4A/AAC \u8f6c Silk \u9519\u8bef (\u89e3\u7801\u5931\u8d25)"

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_b
    const-string v0, "\u9519\u8bef\u7801: "

    .line 120
    .line 121
    const-string v1, " \u2192 \u672a\u77e5\u9519\u8bef"

    .line 122
    .line 123
    invoke-static {p0, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0
.end method

.method private static getMetadataSampleRate(Ljava/lang/String;I)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    .line 3
    .line 4
    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    .line 7
    :try_start_1
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/16 p0, 0x26

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {p0, p1}, Lme/yun/silk/AacCodec;->validSampleRate(II)I

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :try_start_2
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 33
    .line 34
    .line 35
    :catch_0
    return p0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    move-object v0, v1

    .line 38
    goto :goto_0

    .line 39
    :catch_1
    move-object v0, v1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    :try_start_3
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :catchall_1
    move-exception p0

    .line 46
    :goto_0
    if-eqz v0, :cond_1

    .line 47
    .line 48
    :try_start_4
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 49
    .line 50
    .line 51
    :catch_2
    :cond_1
    throw p0

    .line 52
    :catch_3
    :goto_1
    if-eqz v0, :cond_2

    .line 53
    .line 54
    :try_start_5
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 55
    .line 56
    .line 57
    :catch_4
    :cond_2
    :goto_2
    const p0, 0xac44

    .line 58
    .line 59
    .line 60
    invoke-static {p1, p0}, Lme/yun/silk/AacCodec;->validSampleRate(II)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0
.end method

.method private static getSampleRateIndex(I)I
    .locals 0

    .line 1
    sparse-switch p0, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    return p0

    .line 6
    :sswitch_0
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :sswitch_1
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :sswitch_2
    const/4 p0, 0x2

    .line 11
    return p0

    .line 12
    :sswitch_3
    const/4 p0, 0x3

    .line 13
    return p0

    .line 14
    :sswitch_4
    const/4 p0, 0x5

    .line 15
    return p0

    .line 16
    :sswitch_5
    const/4 p0, 0x6

    .line 17
    return p0

    .line 18
    :sswitch_6
    const/4 p0, 0x7

    .line 19
    return p0

    .line 20
    :sswitch_7
    const/16 p0, 0x8

    .line 21
    .line 22
    return p0

    .line 23
    :sswitch_8
    const/16 p0, 0x9

    .line 24
    .line 25
    return p0

    .line 26
    :sswitch_9
    const/16 p0, 0xa

    .line 27
    .line 28
    return p0

    .line 29
    :sswitch_a
    const/16 p0, 0xb

    .line 30
    .line 31
    return p0

    .line 32
    nop

    .line 33
    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_a
        0x2b11 -> :sswitch_9
        0x2ee0 -> :sswitch_8
        0x3e80 -> :sswitch_7
        0x5622 -> :sswitch_6
        0x5dc0 -> :sswitch_5
        0x7d00 -> :sswitch_4
        0xbb80 -> :sswitch_3
        0xfa00 -> :sswitch_2
        0x15888 -> :sswitch_1
        0x17700 -> :sswitch_0
    .end sparse-switch
.end method

.method private static getWavSampleRate(Ljava/lang/String;I)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 3
    .line 4
    const-string v2, "r"

    .line 5
    .line 6
    invoke-direct {v1, p0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    .line 8
    .line 9
    :try_start_1
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const-wide/16 v4, 0x1c

    .line 14
    .line 15
    cmp-long p0, v2, v4

    .line 16
    .line 17
    if-ltz p0, :cond_0

    .line 18
    .line 19
    const-wide/16 v2, 0x18

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    shl-int/lit8 v0, v0, 0x8

    .line 33
    .line 34
    or-int/2addr p0, v0

    .line 35
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    shl-int/lit8 v0, v0, 0x10

    .line 40
    .line 41
    or-int/2addr p0, v0

    .line 42
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    shl-int/lit8 v0, v0, 0x18

    .line 47
    .line 48
    or-int/2addr p0, v0

    .line 49
    invoke-static {p0, p1}, Lme/yun/silk/AacCodec;->validSampleRate(II)I

    .line 50
    .line 51
    .line 52
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    :try_start_2
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 54
    .line 55
    .line 56
    :catch_0
    return p0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    move-object v0, v1

    .line 59
    goto :goto_0

    .line 60
    :catch_1
    move-object v0, v1

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    :try_start_3
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :catchall_1
    move-exception p0

    .line 67
    :goto_0
    if-eqz v0, :cond_1

    .line 68
    .line 69
    :try_start_4
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 70
    .line 71
    .line 72
    :catch_2
    :cond_1
    throw p0

    .line 73
    :catch_3
    :goto_1
    if-eqz v0, :cond_2

    .line 74
    .line 75
    :try_start_5
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 76
    .line 77
    .line 78
    :catch_4
    :cond_2
    :goto_2
    const p0, 0xac44

    .line 79
    .line 80
    .line 81
    invoke-static {p1, p0}, Lme/yun/silk/AacCodec;->validSampleRate(II)I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    return p0
.end method

.method public static isOggOpusFile(Ljava/lang/String;)Z
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_b

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :try_start_0
    new-instance v2, Ljava/io/RandomAccessFile;

    .line 14
    .line 15
    const-string v3, "r"

    .line 16
    .line 17
    invoke-direct {v2, p0, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    .line 20
    :try_start_1
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    const-wide/16 v5, 0x24

    .line 25
    .line 26
    cmp-long p0, v3, v5

    .line 27
    .line 28
    if-gez p0, :cond_1

    .line 29
    .line 30
    :try_start_2
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 31
    .line 32
    .line 33
    :catch_0
    return v0

    .line 34
    :cond_1
    const/16 p0, 0x1b

    .line 35
    .line 36
    :try_start_3
    new-array p0, p0, [B

    .line 37
    .line 38
    invoke-virtual {v2, p0}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 39
    .line 40
    .line 41
    aget-byte v1, p0, v0

    .line 42
    .line 43
    const/16 v3, 0x4f

    .line 44
    .line 45
    if-ne v1, v3, :cond_9

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    aget-byte v4, p0, v1

    .line 49
    .line 50
    const/16 v5, 0x67

    .line 51
    .line 52
    if-ne v4, v5, :cond_9

    .line 53
    .line 54
    const/4 v4, 0x2

    .line 55
    aget-byte v6, p0, v4

    .line 56
    .line 57
    if-ne v6, v5, :cond_9

    .line 58
    .line 59
    const/4 v5, 0x3

    .line 60
    aget-byte v6, p0, v5

    .line 61
    .line 62
    const/16 v7, 0x53

    .line 63
    .line 64
    if-ne v6, v7, :cond_9

    .line 65
    .line 66
    const/4 v6, 0x4

    .line 67
    aget-byte v7, p0, v6

    .line 68
    .line 69
    if-eqz v7, :cond_2

    .line 70
    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_2
    const/16 v7, 0x1a

    .line 74
    .line 75
    aget-byte p0, p0, v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 76
    .line 77
    const/16 v7, 0xff

    .line 78
    .line 79
    and-int/2addr p0, v7

    .line 80
    if-nez p0, :cond_3

    .line 81
    .line 82
    :try_start_4
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 83
    .line 84
    .line 85
    :catch_1
    return v0

    .line 86
    :cond_3
    :try_start_5
    new-array v8, p0, [B

    .line 87
    .line 88
    invoke-virtual {v2, v8}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 89
    .line 90
    .line 91
    move v9, v0

    .line 92
    move v10, v9

    .line 93
    :goto_0
    if-ge v9, p0, :cond_5

    .line 94
    .line 95
    aget-byte v11, v8, v9

    .line 96
    .line 97
    and-int/2addr v11, v7

    .line 98
    add-int/2addr v10, v11

    .line 99
    if-ge v11, v7, :cond_4

    .line 100
    .line 101
    move p0, v1

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catchall_0
    move-exception p0

    .line 107
    move-object v1, v2

    .line 108
    goto :goto_4

    .line 109
    :catch_2
    move-object v1, v2

    .line 110
    goto :goto_5

    .line 111
    :cond_5
    move p0, v0

    .line 112
    :goto_1
    if-eqz p0, :cond_8

    .line 113
    .line 114
    const/16 p0, 0x8

    .line 115
    .line 116
    if-ge v10, p0, :cond_6

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    new-array p0, p0, [B

    .line 120
    .line 121
    invoke-virtual {v2, p0}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 122
    .line 123
    .line 124
    aget-byte v7, p0, v0

    .line 125
    .line 126
    if-ne v7, v3, :cond_7

    .line 127
    .line 128
    aget-byte v3, p0, v1

    .line 129
    .line 130
    const/16 v7, 0x70

    .line 131
    .line 132
    if-ne v3, v7, :cond_7

    .line 133
    .line 134
    aget-byte v3, p0, v4

    .line 135
    .line 136
    const/16 v4, 0x75

    .line 137
    .line 138
    if-ne v3, v4, :cond_7

    .line 139
    .line 140
    aget-byte v3, p0, v5

    .line 141
    .line 142
    const/16 v4, 0x73

    .line 143
    .line 144
    if-ne v3, v4, :cond_7

    .line 145
    .line 146
    aget-byte v3, p0, v6

    .line 147
    .line 148
    const/16 v4, 0x48

    .line 149
    .line 150
    if-ne v3, v4, :cond_7

    .line 151
    .line 152
    const/4 v3, 0x5

    .line 153
    aget-byte v3, p0, v3

    .line 154
    .line 155
    const/16 v4, 0x65

    .line 156
    .line 157
    if-ne v3, v4, :cond_7

    .line 158
    .line 159
    const/4 v3, 0x6

    .line 160
    aget-byte v3, p0, v3

    .line 161
    .line 162
    const/16 v4, 0x61

    .line 163
    .line 164
    if-ne v3, v4, :cond_7

    .line 165
    .line 166
    const/4 v3, 0x7

    .line 167
    aget-byte p0, p0, v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 168
    .line 169
    const/16 v3, 0x64

    .line 170
    .line 171
    if-ne p0, v3, :cond_7

    .line 172
    .line 173
    move v0, v1

    .line 174
    :cond_7
    :try_start_6
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 175
    .line 176
    .line 177
    :catch_3
    return v0

    .line 178
    :cond_8
    :goto_2
    :try_start_7
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 179
    .line 180
    .line 181
    :catch_4
    return v0

    .line 182
    :cond_9
    :goto_3
    :try_start_8
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    .line 183
    .line 184
    .line 185
    :catch_5
    return v0

    .line 186
    :catchall_1
    move-exception p0

    .line 187
    :goto_4
    if-eqz v1, :cond_a

    .line 188
    .line 189
    :try_start_9
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    .line 190
    .line 191
    .line 192
    :catch_6
    :cond_a
    throw p0

    .line 193
    :catch_7
    :goto_5
    if-eqz v1, :cond_b

    .line 194
    .line 195
    :try_start_a
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_8

    .line 196
    .line 197
    .line 198
    :catch_8
    :cond_b
    :goto_6
    return v0
.end method

.method public static m4aToAac(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lme/yun/silk/AacCodec;->mp4ToAac(Ljava/lang/String;Ljava/lang/String;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static m4aToM4a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lme/yun/silk/AacCodec;->mp4ToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static m4aToPcm(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lme/yun/silk/AacCodec;->decodeAacFile(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public static m4aToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lme/yun/silk/AacCodec;->mp4ToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static mp3ToAac(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    const-string v0, ".temp.pcm"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    new-instance v1, Lme/yun/silk/SilkCodec;

    .line 8
    .line 9
    invoke-direct {v1}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, Lme/yun/silk/SilkCodec;->mp3ToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_1
    invoke-static {p0, p2}, Lme/yun/silk/AacCodec;->getMetadataSampleRate(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 p2, 0x1

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {v0, p1, p0, p2, v1}, Lme/yun/silk/AacCodec;->encodePcmToAac(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return p0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p0

    .line 39
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/16 p0, -0x3f3

    .line 46
    .line 47
    return p0

    .line 48
    :goto_0
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method private static mp3ToM4a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    const-string v0, ".temp.pcm"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    new-instance v1, Lme/yun/silk/SilkCodec;

    .line 8
    .line 9
    invoke-direct {v1}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, Lme/yun/silk/SilkCodec;->mp3ToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_1
    invoke-static {p0, p2}, Lme/yun/silk/AacCodec;->getMetadataSampleRate(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 p2, 0x1

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {v0, p1, p0, p2, v1}, Lme/yun/silk/AacCodec;->encodePcmToM4a(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return p0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p0

    .line 39
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/16 p0, -0x3f4

    .line 46
    .line 47
    return p0

    .line 48
    :goto_0
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method public static mp4ToAac(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    const-string p2, ".temp.pcm"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x0

    .line 8
    :try_start_0
    invoke-static {p0, p2, v0}, Lme/yun/silk/AacCodec;->decodeAacFileWithInfo(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)Lme/yun/silk/AacCodec$DecodeResult;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget v1, p0, Lme/yun/silk/AacCodec$DecodeResult;->code:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    add-int/lit16 v1, v1, -0x7d0

    .line 17
    .line 18
    invoke-static {p2}, Lp/a;->v(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_1
    iget-object p0, p0, Lme/yun/silk/AacCodec$DecodeResult;->audioInfo:Lme/yun/silk/AacCodec$AudioInfo;

    .line 23
    .line 24
    iget p0, p0, Lme/yun/silk/AacCodec$AudioInfo;->sampleRate:I

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-static {p2, p1, p0, v1, v0}, Lme/yun/silk/AacCodec;->encodePcmToAac(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 28
    .line 29
    .line 30
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    invoke-static {p2}, Lp/a;->v(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return p0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception p0

    .line 38
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-static {p2}, Lp/a;->v(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/16 p0, -0x41b

    .line 45
    .line 46
    return p0

    .line 47
    :goto_0
    invoke-static {p2}, Lp/a;->v(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method public static mp4ToM4a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    const-string p2, ".temp.pcm"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x0

    .line 8
    :try_start_0
    invoke-static {p0, p2, v0}, Lme/yun/silk/AacCodec;->decodeAacFileWithInfo(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)Lme/yun/silk/AacCodec$DecodeResult;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget v1, p0, Lme/yun/silk/AacCodec$DecodeResult;->code:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    add-int/lit16 v1, v1, -0x7d0

    .line 17
    .line 18
    invoke-static {p2}, Lp/a;->v(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_1
    iget-object p0, p0, Lme/yun/silk/AacCodec$DecodeResult;->audioInfo:Lme/yun/silk/AacCodec$AudioInfo;

    .line 23
    .line 24
    iget p0, p0, Lme/yun/silk/AacCodec$AudioInfo;->sampleRate:I

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-static {p2, p1, p0, v1, v0}, Lme/yun/silk/AacCodec;->encodePcmToM4a(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 28
    .line 29
    .line 30
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    invoke-static {p2}, Lp/a;->v(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return p0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception p0

    .line 38
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-static {p2}, Lp/a;->v(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/16 p0, -0x425

    .line 45
    .line 46
    return p0

    .line 47
    :goto_0
    invoke-static {p2}, Lp/a;->v(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method public static mp4ToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I
    .locals 9

    .line 1
    const-string v0, ".temp.pcm"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ".temp."

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, ".pcm"

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v0, 0x0

    .line 33
    :try_start_0
    invoke-static {p0, v1, v0}, Lme/yun/silk/AacCodec;->decodeAacFileWithInfo(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/AacCodec$AacCallback;)Lme/yun/silk/AacCodec$DecodeResult;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget v0, p0, Lme/yun/silk/AacCodec$DecodeResult;->code:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    add-int/lit16 v0, v0, -0x7d0

    .line 42
    .line 43
    new-instance p0, Ljava/io/File;

    .line 44
    .line 45
    invoke-direct {p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 49
    .line 50
    .line 51
    new-instance p0, Ljava/io/File;

    .line 52
    .line 53
    invoke-direct {p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 57
    .line 58
    .line 59
    return v0

    .line 60
    :cond_0
    :try_start_1
    iget-object p0, p0, Lme/yun/silk/AacCodec$DecodeResult;->audioInfo:Lme/yun/silk/AacCodec$AudioInfo;

    .line 61
    .line 62
    iget p0, p0, Lme/yun/silk/AacCodec$AudioInfo;->sampleRate:I

    .line 63
    .line 64
    if-eq p0, p3, :cond_2

    .line 65
    .line 66
    invoke-static {v1, v2, p0, p3}, Lme/yun/silk/AacCodec;->resampleMonoPcm16(Ljava/lang/String;Ljava/lang/String;II)Z

    .line 67
    .line 68
    .line 69
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    if-nez p0, :cond_1

    .line 71
    .line 72
    new-instance p0, Ljava/io/File;

    .line 73
    .line 74
    invoke-direct {p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 78
    .line 79
    .line 80
    new-instance p0, Ljava/io/File;

    .line 81
    .line 82
    invoke-direct {p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 86
    .line 87
    .line 88
    const/16 p0, -0x2bd

    .line 89
    .line 90
    return p0

    .line 91
    :cond_1
    move v7, p3

    .line 92
    move-object v4, v2

    .line 93
    goto :goto_0

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    move-object p0, v0

    .line 96
    goto :goto_2

    .line 97
    :catch_0
    move-exception v0

    .line 98
    move-object p0, v0

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    move v7, p0

    .line 101
    move-object v4, v1

    .line 102
    :goto_0
    const/4 v8, 0x1

    .line 103
    move-object v5, p1

    .line 104
    move-object v3, p2

    .line 105
    move v6, p3

    .line 106
    :try_start_2
    invoke-virtual/range {v3 .. v8}, Lme/yun/silk/SilkCodec;->pcmToSilk(Ljava/lang/String;Ljava/lang/String;III)I

    .line 107
    .line 108
    .line 109
    move-result p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    new-instance p1, Ljava/io/File;

    .line 111
    .line 112
    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 116
    .line 117
    .line 118
    new-instance p1, Ljava/io/File;

    .line 119
    .line 120
    invoke-direct {p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 124
    .line 125
    .line 126
    return p0

    .line 127
    :goto_1
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 128
    .line 129
    .line 130
    new-instance p0, Ljava/io/File;

    .line 131
    .line 132
    invoke-direct {p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 136
    .line 137
    .line 138
    new-instance p0, Ljava/io/File;

    .line 139
    .line 140
    invoke-direct {p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 144
    .line 145
    .line 146
    const/16 p0, -0x407

    .line 147
    .line 148
    return p0

    .line 149
    :goto_2
    new-instance p1, Ljava/io/File;

    .line 150
    .line 151
    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 155
    .line 156
    .line 157
    new-instance p1, Ljava/io/File;

    .line 158
    .line 159
    invoke-direct {p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 163
    .line 164
    .line 165
    throw p0
.end method

.method private static oggToAac(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    const-string v0, ".temp.pcm"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lp/a;->v(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    new-instance v1, Lme/yun/silk/SilkCodec;

    .line 11
    .line 12
    invoke-direct {v1}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0, v1, p2}, Lme/yun/silk/AacCodec;->decodeOggToPcmWithInfo(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)Lme/yun/silk/AacCodec$DecodeResult;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget p2, p0, Lme/yun/silk/AacCodec$DecodeResult;->code:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return p2

    .line 27
    :cond_0
    :try_start_1
    iget-object p0, p0, Lme/yun/silk/AacCodec$DecodeResult;->audioInfo:Lme/yun/silk/AacCodec$AudioInfo;

    .line 28
    .line 29
    iget p0, p0, Lme/yun/silk/AacCodec$AudioInfo;->sampleRate:I

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-static {v0, p1, p0, p2, v1}, Lme/yun/silk/AacCodec;->encodePcmToAac(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    new-instance p2, Ljava/io/File;

    .line 40
    .line 41
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_2

    .line 50
    :catch_0
    move-exception p0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return p0

    .line 56
    :goto_1
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    new-instance p0, Ljava/io/File;

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/16 p0, -0x41b

    .line 71
    .line 72
    return p0

    .line 73
    :goto_2
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p0
.end method

.method private static oggToM4a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    const-string v0, ".temp.pcm"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lp/a;->v(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    new-instance v1, Lme/yun/silk/SilkCodec;

    .line 11
    .line 12
    invoke-direct {v1}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0, v1, p2}, Lme/yun/silk/AacCodec;->decodeOggToPcmWithInfo(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)Lme/yun/silk/AacCodec$DecodeResult;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget p2, p0, Lme/yun/silk/AacCodec$DecodeResult;->code:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return p2

    .line 27
    :cond_0
    :try_start_1
    iget-object p0, p0, Lme/yun/silk/AacCodec$DecodeResult;->audioInfo:Lme/yun/silk/AacCodec$AudioInfo;

    .line 28
    .line 29
    iget p0, p0, Lme/yun/silk/AacCodec$AudioInfo;->sampleRate:I

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-static {v0, p1, p0, p2, v1}, Lme/yun/silk/AacCodec;->encodePcmToM4a(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    new-instance p2, Ljava/io/File;

    .line 40
    .line 41
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_2

    .line 50
    :catch_0
    move-exception p0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return p0

    .line 56
    :goto_1
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    new-instance p0, Ljava/io/File;

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/16 p0, -0x425

    .line 71
    .line 72
    return p0

    .line 73
    :goto_2
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p0
.end method

.method public static oggToPcmCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;)I
    .locals 1

    .line 1
    const v0, 0xac44

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1, p2, v0}, Lme/yun/silk/AacCodec;->decodeOggToPcmWithInfo(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)Lme/yun/silk/AacCodec$DecodeResult;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget p0, p0, Lme/yun/silk/AacCodec$DecodeResult;->code:I

    .line 9
    .line 10
    return p0
.end method

.method public static oggToSilkCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I
    .locals 1

    .line 1
    invoke-static {p0}, Lme/yun/silk/AacCodec;->isOggOpusFile(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p0, p1, p3}, Lme/yun/silk/SilkCodec;->oggToSilk(Ljava/lang/String;Ljava/lang/String;I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 18
    .line 19
    .line 20
    invoke-static {p0, p1, p2, p3}, Lme/yun/silk/AacCodec;->mp4ToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    invoke-static {p1}, Lp/a;->v(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/16 p1, -0xaf3

    .line 32
    .line 33
    if-lt p0, p1, :cond_2

    .line 34
    .line 35
    const/16 p1, -0xaf1

    .line 36
    .line 37
    if-gt p0, p1, :cond_2

    .line 38
    .line 39
    const/16 p0, -0x191

    .line 40
    .line 41
    :cond_2
    return p0
.end method

.method public static pcmToAac(Ljava/lang/String;Ljava/lang/String;II)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, p3, v0}, Lme/yun/silk/AacCodec;->encodePcmToAac(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public static pcmToM4a(Ljava/lang/String;Ljava/lang/String;II)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, p3, v0}, Lme/yun/silk/AacCodec;->encodePcmToM4a(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method private static readPcm16([BI)I
    .locals 1

    .line 1
    mul-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    aget-byte p0, p0, p1

    .line 10
    .line 11
    shl-int/lit8 p0, p0, 0x8

    .line 12
    .line 13
    or-int/2addr p0, v0

    .line 14
    int-to-short p0, p0

    .line 15
    return p0
.end method

.method private static resampleMonoPcm16(Ljava/lang/String;Ljava/lang/String;II)Z
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p2, :cond_3

    .line 3
    .line 4
    if-gtz p3, :cond_0

    .line 5
    .line 6
    goto/16 :goto_1

    .line 7
    .line 8
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    const-wide/16 v4, 0x2

    .line 18
    .line 19
    cmp-long p0, v2, v4

    .line 20
    .line 21
    if-ltz p0, :cond_3

    .line 22
    .line 23
    const-wide/32 v4, 0x7ffffffe

    .line 24
    .line 25
    .line 26
    cmp-long p0, v2, v4

    .line 27
    .line 28
    if-lez p0, :cond_1

    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :cond_1
    const-wide/16 v4, -0x2

    .line 33
    .line 34
    and-long/2addr v2, v4

    .line 35
    long-to-int p0, v2

    .line 36
    new-array v2, p0, [B

    .line 37
    .line 38
    new-instance v3, Ljava/io/RandomAccessFile;

    .line 39
    .line 40
    const-string v4, "r"

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :try_start_0
    invoke-virtual {v3, v2}, Ljava/io/RandomAccessFile;->readFully([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    .line 49
    .line 50
    .line 51
    div-int/lit8 p0, p0, 0x2

    .line 52
    .line 53
    int-to-double v3, p0

    .line 54
    int-to-double v5, p3

    .line 55
    mul-double/2addr v3, v5

    .line 56
    int-to-double p2, p2

    .line 57
    div-double/2addr v3, p2

    .line 58
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    long-to-int v1, v3

    .line 63
    const/4 v3, 0x1

    .line 64
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    mul-int/lit8 v4, v1, 0x2

    .line 69
    .line 70
    new-array v4, v4, [B

    .line 71
    .line 72
    div-double/2addr p2, v5

    .line 73
    :goto_0
    if-ge v0, v1, :cond_2

    .line 74
    .line 75
    int-to-double v5, v0

    .line 76
    mul-double/2addr v5, p2

    .line 77
    double-to-int v7, v5

    .line 78
    int-to-double v8, v7

    .line 79
    sub-double/2addr v5, v8

    .line 80
    add-int/lit8 v8, p0, -0x1

    .line 81
    .line 82
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    invoke-static {v2, v9}, Lme/yun/silk/AacCodec;->readPcm16([BI)I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    add-int/2addr v7, v3

    .line 91
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    invoke-static {v2, v7}, Lme/yun/silk/AacCodec;->readPcm16([BI)I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    int-to-double v10, v9

    .line 100
    sub-int/2addr v7, v9

    .line 101
    int-to-double v7, v7

    .line 102
    mul-double/2addr v7, v5

    .line 103
    add-double/2addr v7, v10

    .line 104
    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    .line 105
    .line 106
    .line 107
    move-result-wide v5

    .line 108
    long-to-int v5, v5

    .line 109
    const/16 v6, 0x7fff

    .line 110
    .line 111
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    const/16 v6, -0x8000

    .line 116
    .line 117
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    mul-int/lit8 v6, v0, 0x2

    .line 122
    .line 123
    and-int/lit16 v7, v5, 0xff

    .line 124
    .line 125
    int-to-byte v7, v7

    .line 126
    aput-byte v7, v4, v6

    .line 127
    .line 128
    add-int/2addr v6, v3

    .line 129
    shr-int/lit8 v5, v5, 0x8

    .line 130
    .line 131
    and-int/lit16 v5, v5, 0xff

    .line 132
    .line 133
    int-to-byte v5, v5

    .line 134
    aput-byte v5, v4, v6

    .line 135
    .line 136
    add-int/lit8 v0, v0, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_2
    new-instance p0, Ljava/io/FileOutputStream;

    .line 140
    .line 141
    invoke-direct {p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :try_start_1
    invoke-virtual {p0, v4}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V

    .line 148
    .line 149
    .line 150
    return v3

    .line 151
    :catchall_0
    move-exception p1

    .line 152
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :catchall_1
    move-exception p0

    .line 157
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    .line 158
    .line 159
    .line 160
    throw p0

    .line 161
    :cond_3
    :goto_1
    return v0
.end method

.method public static silkToAac(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, ".temp.pcm"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p2, p0, v0, p3}, Lme/yun/silk/SilkCodec;->silkToPcm(Ljava/lang/String;Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x1

    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-static {v0, p1, p3, p0, p2}, Lme/yun/silk/AacCodec;->encodePcmToAac(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    new-instance p1, Ljava/io/File;

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return p0

    .line 40
    :catch_0
    move-exception p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    .line 43
    .line 44
    const/16 p0, -0x3e9

    .line 45
    .line 46
    return p0
.end method

.method public static silkToM4a(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, ".temp.pcm"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p2, p0, v0, p3}, Lme/yun/silk/SilkCodec;->silkToPcm(Ljava/lang/String;Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x1

    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-static {v0, p1, p3, p0, p2}, Lme/yun/silk/AacCodec;->encodePcmToM4a(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    new-instance p1, Ljava/io/File;

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return p0

    .line 40
    :catch_0
    move-exception p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    .line 43
    .line 44
    const/16 p0, -0x3e9

    .line 45
    .line 46
    return p0
.end method

.method private static validSampleRate(II)I
    .locals 0

    .line 1
    sparse-switch p0, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_0

    .line 5
    .line 6
    return p1

    .line 7
    :cond_0
    const p0, 0xac44

    .line 8
    .line 9
    .line 10
    :sswitch_0
    return p0

    .line 11
    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_0
        0x2b11 -> :sswitch_0
        0x2ee0 -> :sswitch_0
        0x3e80 -> :sswitch_0
        0x5622 -> :sswitch_0
        0x5dc0 -> :sswitch_0
        0x7d00 -> :sswitch_0
        0xac44 -> :sswitch_0
        0xbb80 -> :sswitch_0
        0xfa00 -> :sswitch_0
        0x15888 -> :sswitch_0
        0x17700 -> :sswitch_0
    .end sparse-switch
.end method

.method private static wavToAac(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    const-string v0, ".temp.pcm"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    new-instance v1, Lme/yun/silk/SilkCodec;

    .line 8
    .line 9
    invoke-direct {v1}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, Lme/yun/silk/SilkCodec;->wavToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_1
    invoke-static {p0, p2}, Lme/yun/silk/AacCodec;->getWavSampleRate(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 p2, 0x1

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {v0, p1, p0, p2, v1}, Lme/yun/silk/AacCodec;->encodePcmToAac(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return p0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p0

    .line 39
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/16 p0, -0x3fd

    .line 46
    .line 47
    return p0

    .line 48
    :goto_0
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method private static wavToM4a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    const-string v0, ".temp.pcm"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    new-instance v1, Lme/yun/silk/SilkCodec;

    .line 8
    .line 9
    invoke-direct {v1}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p0, v0}, Lme/yun/silk/SilkCodec;->wavToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    :try_start_1
    invoke-static {p0, p2}, Lme/yun/silk/AacCodec;->getWavSampleRate(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 p2, 0x1

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {v0, p1, p0, p2, v1}, Lme/yun/silk/AacCodec;->encodePcmToM4a(Ljava/lang/String;Ljava/lang/String;IILme/yun/silk/AacCodec$AacCallback;)I

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return p0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p0

    .line 39
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/16 p0, -0x3fe

    .line 46
    .line 47
    return p0

    .line 48
    :goto_0
    invoke-static {v0}, Lp/a;->v(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0
.end method
