.class public final Lme/yun/silk/utils/Conversion$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/yun/silk/utils/Conversion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lgg/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lme/yun/silk/utils/Conversion$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(ILme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;ILme/yun/silk/utils/Conversion$ConversionCallback;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lme/yun/silk/utils/Conversion$Companion;->startTransform$lambda$0(ILme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;ILme/yun/silk/utils/Conversion$ConversionCallback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getErrorMsg(I)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p1, :cond_d

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eq p1, v0, :cond_c

    .line 5
    .line 6
    const/4 v0, -0x2

    .line 7
    if-eq p1, v0, :cond_b

    .line 8
    .line 9
    const/4 v0, -0x3

    .line 10
    if-eq p1, v0, :cond_a

    .line 11
    .line 12
    const/4 v0, -0x4

    .line 13
    if-eq p1, v0, :cond_9

    .line 14
    .line 15
    const/4 v0, -0x5

    .line 16
    if-eq p1, v0, :cond_8

    .line 17
    .line 18
    const/16 v0, -0x3fe

    .line 19
    .line 20
    const-string v1, "\u9519\u8bef\u7801:"

    .line 21
    .line 22
    if-eq p1, v0, :cond_7

    .line 23
    .line 24
    const/16 v0, -0x3fd

    .line 25
    .line 26
    if-eq p1, v0, :cond_7

    .line 27
    .line 28
    const/16 v0, -0x3f4

    .line 29
    .line 30
    if-eq p1, v0, :cond_6

    .line 31
    .line 32
    const/16 v0, -0x3f3

    .line 33
    .line 34
    if-eq p1, v0, :cond_6

    .line 35
    .line 36
    const/16 v0, -0x390

    .line 37
    .line 38
    if-eq p1, v0, :cond_5

    .line 39
    .line 40
    const/16 v0, -0x38f

    .line 41
    .line 42
    if-eq p1, v0, :cond_5

    .line 43
    .line 44
    const/16 v0, -0x386

    .line 45
    .line 46
    if-eq p1, v0, :cond_4

    .line 47
    .line 48
    const/16 v0, -0x385

    .line 49
    .line 50
    if-eq p1, v0, :cond_4

    .line 51
    .line 52
    const/16 v0, -0x25a

    .line 53
    .line 54
    if-eq p1, v0, :cond_3

    .line 55
    .line 56
    const/16 v0, -0x259

    .line 57
    .line 58
    if-eq p1, v0, :cond_3

    .line 59
    .line 60
    const/16 v0, -0x1f6

    .line 61
    .line 62
    if-eq p1, v0, :cond_2

    .line 63
    .line 64
    const/16 v0, -0x1f5

    .line 65
    .line 66
    if-eq p1, v0, :cond_2

    .line 67
    .line 68
    const/16 v0, -0x192

    .line 69
    .line 70
    if-eq p1, v0, :cond_1

    .line 71
    .line 72
    const/16 v0, -0x191

    .line 73
    .line 74
    if-eq p1, v0, :cond_1

    .line 75
    .line 76
    const/16 v0, -0x12e

    .line 77
    .line 78
    if-eq p1, v0, :cond_0

    .line 79
    .line 80
    const/16 v0, -0x12d

    .line 81
    .line 82
    if-eq p1, v0, :cond_0

    .line 83
    .line 84
    sparse-switch p1, :sswitch_data_0

    .line 85
    .line 86
    .line 87
    packed-switch p1, :pswitch_data_0

    .line 88
    .line 89
    .line 90
    const-string v0, " -> \u672a\u77e5\u9519\u8bef"

    .line 91
    .line 92
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :pswitch_0
    const-string v0, " -> PCM \u53c2\u6570\u9519\u8bef"

    .line 98
    .line 99
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :sswitch_0
    const-string p1, "\u9519\u8bef\u7801:-10 -> \u8f93\u51fa\u5fc5\u987b\u662f .silk \u6216 .slk"

    .line 105
    .line 106
    return-object p1

    .line 107
    :sswitch_1
    const-string p1, "\u9519\u8bef\u7801:-11 -> \u8f93\u51fa\u5fc5\u987b\u662f .mp3"

    .line 108
    .line 109
    return-object p1

    .line 110
    :sswitch_2
    const-string p1, "\u9519\u8bef\u7801:-12 -> \u8f93\u51fa\u5fc5\u987b\u662f .pcm \u6216 .raw"

    .line 111
    .line 112
    return-object p1

    .line 113
    :sswitch_3
    const-string p1, "\u9519\u8bef\u7801:-13 -> \u6587\u4ef6\u683c\u5f0f\u4e0e\u65b9\u6cd5\u4e0d\u5339\u914d"

    .line 114
    .line 115
    return-object p1

    .line 116
    :sswitch_4
    const-string v0, " -> Silk \u8f6c MP3 \u6587\u4ef6\u9519\u8bef"

    .line 117
    .line 118
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :sswitch_5
    const-string v0, " -> AAC/M4A \u89e3\u7801\u9519\u8bef (\u6587\u4ef6\u8bfb\u53d6\u5931\u8d25)"

    .line 124
    .line 125
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    return-object p1

    .line 130
    :sswitch_6
    const-string p1, "\u9519\u8bef\u7801:-803 -> AAC/M4A \u89e3\u7801\u9519\u8bef (\u683c\u5f0f\u4e0d\u652f\u6301)"

    .line 131
    .line 132
    return-object p1

    .line 133
    :sswitch_7
    const-string p1, "\u9519\u8bef\u7801:-1001 -> Silk \u8f6c AAC/M4A \u9519\u8bef"

    .line 134
    .line 135
    return-object p1

    .line 136
    :sswitch_8
    const-string p1, "\u9519\u8bef\u7801:-1031 -> AAC/M4A \u8f6c Silk \u9519\u8bef"

    .line 137
    .line 138
    return-object p1

    .line 139
    :sswitch_9
    const-string p1, "\u9519\u8bef\u7801:-1041 -> \u4e2d\u95f4\u8f6c\u6362\u9519\u8bef"

    .line 140
    .line 141
    return-object p1

    .line 142
    :sswitch_a
    const-string p1, "\u9519\u8bef\u7801:-2000 -> M4A/AAC \u8f6c Silk \u9519\u8bef (\u89e3\u7801\u5931\u8d25)"

    .line 143
    .line 144
    return-object p1

    .line 145
    :cond_0
    const-string v0, " -> MP3 \u89e3\u7801\u9519\u8bef"

    .line 146
    .line 147
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    :cond_1
    const-string v0, " -> OGG \u89e3\u7801\u9519\u8bef"

    .line 153
    .line 154
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    return-object p1

    .line 159
    :cond_2
    const-string v0, " -> WAV \u89e3\u7801\u9519\u8bef"

    .line 160
    .line 161
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    return-object p1

    .line 166
    :cond_3
    const-string v0, " -> FLAC \u89e3\u7801\u9519\u8bef"

    .line 167
    .line 168
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    return-object p1

    .line 173
    :cond_4
    const-string v0, " -> AAC/M4A \u7f16\u7801\u9519\u8bef"

    .line 174
    .line 175
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    return-object p1

    .line 180
    :cond_5
    const-string v0, " -> M4A \u7f16\u7801\u9519\u8bef"

    .line 181
    .line 182
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    return-object p1

    .line 187
    :cond_6
    const-string v0, " -> MP3 \u8f6c AAC/M4A \u9519\u8bef"

    .line 188
    .line 189
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    return-object p1

    .line 194
    :cond_7
    const-string v0, " -> WAV \u8f6c AAC/M4A \u9519\u8bef"

    .line 195
    .line 196
    invoke-static {p1, v1, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    return-object p1

    .line 201
    :cond_8
    const-string p1, "\u9519\u8bef\u7801:-5 -> \u8f93\u5165\u5df2\u7ecf\u662f Silk \u683c\u5f0f"

    .line 202
    .line 203
    return-object p1

    .line 204
    :cond_9
    const-string p1, "\u9519\u8bef\u7801:-4 -> \u8f93\u5165\u5df2\u7ecf\u662f PCM \u683c\u5f0f"

    .line 205
    .line 206
    return-object p1

    .line 207
    :cond_a
    const-string p1, "\u9519\u8bef\u7801:-3 -> PCM \u8f6c Silk \u9700\u8981\u989d\u5916\u53c2\u6570"

    .line 208
    .line 209
    return-object p1

    .line 210
    :cond_b
    const-string p1, "\u9519\u8bef\u7801:-2 -> \u4e0d\u652f\u6301\u7684\u97f3\u9891\u683c\u5f0f"

    .line 211
    .line 212
    return-object p1

    .line 213
    :cond_c
    const-string p1, "\u9519\u8bef\u7801:-1 -> \u65e0\u6cd5\u83b7\u53d6\u6587\u4ef6\u6269\u5c55\u540d"

    .line 214
    .line 215
    return-object p1

    .line 216
    :cond_d
    :sswitch_b
    const-string p1, "\u6210\u529f"

    .line 217
    .line 218
    return-object p1

    .line 219
    :sswitch_data_0
    .sparse-switch
        -0x7d0 -> :sswitch_a
        -0x411 -> :sswitch_9
        -0x407 -> :sswitch_8
        -0x3e9 -> :sswitch_7
        -0x323 -> :sswitch_6
        -0x322 -> :sswitch_5
        -0x321 -> :sswitch_5
        -0xca -> :sswitch_4
        -0xc9 -> :sswitch_4
        -0xd -> :sswitch_3
        -0xc -> :sswitch_2
        -0xb -> :sswitch_1
        -0xa -> :sswitch_0
        0x0 -> :sswitch_b
    .end sparse-switch

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    :pswitch_data_0
    .packed-switch -0x2bf
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static final startTransform$lambda$0(ILme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;ILme/yun/silk/utils/Conversion$ConversionCallback;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    const/4 p0, -0x2

    .line 10
    goto :goto_0

    .line 11
    :pswitch_0
    :try_start_0
    invoke-static {p2, p3, p1, p4}, Lme/yun/silk/AacCodec;->m4aToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :pswitch_1
    invoke-static {p2, p3, p1, p4}, Lme/yun/silk/AacCodec;->autoToM4a(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    goto :goto_0

    .line 23
    :pswitch_2
    invoke-static {p2, p3, p1, p4}, Lme/yun/silk/AacCodec;->autoToAac(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    goto :goto_0

    .line 28
    :pswitch_3
    invoke-static {p2, p3, p1}, Lme/yun/silk/AacCodec;->autoToPcmCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    goto :goto_0

    .line 33
    :pswitch_4
    invoke-static {p2, p3, p1, p4}, Lme/yun/silk/AacCodec;->autoToSilkCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p1, p2, p3, p4}, Lme/yun/silk/SilkCodec;->mp3ToSilk(Ljava/lang/String;Ljava/lang/String;I)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p1, p2, p3, p4}, Lme/yun/silk/SilkCodec;->silkToMp3(Ljava/lang/String;Ljava/lang/String;I)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    :goto_0
    if-nez p0, :cond_2

    .line 48
    .line 49
    const/16 p0, 0x64

    .line 50
    .line 51
    invoke-interface {p5, p0}, Lme/yun/silk/utils/Conversion$ConversionCallback;->onProgress(I)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    sget-object p1, Lme/yun/silk/utils/Conversion;->Companion:Lme/yun/silk/utils/Conversion$Companion;

    .line 56
    .line 57
    invoke-direct {p1, p0}, Lme/yun/silk/utils/Conversion$Companion;->getErrorMsg(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {p5, p0}, Lme/yun/silk/utils/Conversion$ConversionCallback;->onMessage(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance p1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string p2, "\u5f02\u5e38: "

    .line 72
    .line 73
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-interface {p5, p0}, Lme/yun/silk/utils/Conversion$ConversionCallback;->onMessage(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final m4aToPcm(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, Lme/yun/silk/AacCodec;->m4aToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final m4aToSilk(Lme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p3, p1, p4}, Lme/yun/silk/AacCodec;->m4aToSilk(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final pcmToAac(Ljava/lang/String;Ljava/lang/String;II)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2, p3, p4}, Lme/yun/silk/AacCodec;->pcmToAac(Ljava/lang/String;Ljava/lang/String;II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final pcmToM4a(Ljava/lang/String;Ljava/lang/String;II)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2, p3, p4}, Lme/yun/silk/AacCodec;->pcmToM4a(Ljava/lang/String;Ljava/lang/String;II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final silkToAac(Lme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p3, p1, p4}, Lme/yun/silk/AacCodec;->silkToAac(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final silkToM4a(Lme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p3, p1, p4}, Lme/yun/silk/AacCodec;->silkToM4a(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final startTransform(Lme/yun/silk/SilkCodec;ILjava/lang/String;Ljava/lang/String;ILme/yun/silk/utils/Conversion$ConversionCallback;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/lang/Thread;

    .line 14
    .line 15
    new-instance v1, Lzg/a;

    .line 16
    .line 17
    move-object v3, p1

    .line 18
    move v2, p2

    .line 19
    move-object v4, p3

    .line 20
    move-object v5, p4

    .line 21
    move v6, p5

    .line 22
    move-object v7, p6

    .line 23
    invoke-direct/range {v1 .. v7}, Lzg/a;-><init>(ILme/yun/silk/SilkCodec;Ljava/lang/String;Ljava/lang/String;ILme/yun/silk/utils/Conversion$ConversionCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 30
    .line 31
    .line 32
    return-void
.end method
