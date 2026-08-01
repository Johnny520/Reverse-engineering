.class public final Lqy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lqy0;

.field public static final β:Ljava/util/List;

.field public static volatile γ:I

.field public static final δ:Ljava/util/concurrent/ExecutorService;

.field public static final ε:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lqy0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqy0;->α:Lqy0;

    .line 7
    .line 8
    const-string v6, "emoji_download_tree_uri"

    .line 9
    .line 10
    const-string v7, "download_uri"

    .line 11
    .line 12
    const-string v1, "video_download_tree_uri"

    .line 13
    .line 14
    const-string v2, "image_download_tree_uri"

    .line 15
    .line 16
    const-string v3, "animated_download_tree_uri"

    .line 17
    .line 18
    const-string v4, "live_photo_download_tree_uri"

    .line 19
    .line 20
    const-string v5, "audio_download_uri"

    .line 21
    .line 22
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lqy0;->β:Ljava/util/List;

    .line 31
    .line 32
    const/16 v0, 0x3e8

    .line 33
    .line 34
    sput v0, Lqy0;->γ:I

    .line 35
    .line 36
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lqy0;->δ:Ljava/util/concurrent/ExecutorService;

    .line 41
    .line 42
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lqy0;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 48
    .line 49
    const/4 v0, 0x3

    .line 50
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 51
    .line 52
    .line 53
    new-instance v0, Lnq;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    const/4 v2, 0x1

    .line 57
    const/16 v3, 0x3c

    .line 58
    .line 59
    const/high16 v4, 0x3f400000    # 0.75f

    .line 60
    .line 61
    invoke-direct {v0, v3, v4, v1, v2}, Lnq;-><init>(IFZI)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static Α([BI)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/16 v3, 0xc

    .line 7
    .line 8
    if-lt p1, v3, :cond_6

    .line 9
    .line 10
    array-length v4, p0

    .line 11
    if-ge v4, v1, :cond_0

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v4, Ljava/lang/String;

    .line 16
    .line 17
    sget-object v5, Lmf;->γ:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    invoke-direct {v4, p0, v2, v2, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    const-string v5, "ftyp"

    .line 23
    .line 24
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_6

    .line 29
    .line 30
    array-length p1, p0

    .line 31
    if-ge p1, v3, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/String;

    .line 35
    .line 36
    sget-object p1, Lmf;->γ:Ljava/nio/charset/Charset;

    .line 37
    .line 38
    invoke-direct {v0, p0, v1, v2, p1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 39
    .line 40
    .line 41
    :goto_1
    sget-object p0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    sparse-switch p1, :sswitch_data_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :sswitch_0
    const-string p1, "vvic"

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_2

    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :sswitch_1
    const-string p1, "vvi1"

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_2

    .line 76
    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_2
    const-string p0, "image/vvic"

    .line 80
    .line 81
    return-object p0

    .line 82
    :sswitch_2
    const-string p1, "msf1"

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_3

    .line 89
    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :sswitch_3
    const-string p1, "mif1"

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-nez p0, :cond_3

    .line 99
    .line 100
    goto/16 :goto_3

    .line 101
    .line 102
    :cond_3
    const-string p0, "image/heif"

    .line 103
    .line 104
    return-object p0

    .line 105
    :sswitch_4
    const-string p1, "hevx"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-nez p0, :cond_4

    .line 112
    .line 113
    goto/16 :goto_3

    .line 114
    .line 115
    :sswitch_5
    const-string p1, "hevc"

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-nez p0, :cond_4

    .line 122
    .line 123
    goto/16 :goto_3

    .line 124
    .line 125
    :sswitch_6
    const-string p1, "heix"

    .line 126
    .line 127
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-nez p0, :cond_4

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :sswitch_7
    const-string p1, "heic"

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-nez p0, :cond_4

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_4
    const-string p0, "image/heic"

    .line 144
    .line 145
    return-object p0

    .line 146
    :sswitch_8
    const-string p1, "avis"

    .line 147
    .line 148
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-nez p0, :cond_5

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :sswitch_9
    const-string p1, "avif"

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_5

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_5
    const-string p0, "image/avif"

    .line 165
    .line 166
    return-object p0

    .line 167
    :cond_6
    if-lt p1, v1, :cond_c

    .line 168
    .line 169
    array-length v3, p0

    .line 170
    if-ge v3, v1, :cond_7

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_7
    new-instance v0, Ljava/lang/String;

    .line 174
    .line 175
    sget-object v1, Lmf;->γ:Ljava/nio/charset/Charset;

    .line 176
    .line 177
    invoke-direct {v0, p0, v2, v2, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 178
    .line 179
    .line 180
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    const v2, 0x30166c

    .line 185
    .line 186
    .line 187
    if-eq v1, v2, :cond_a

    .line 188
    .line 189
    const v2, 0x33100a

    .line 190
    .line 191
    .line 192
    if-eq v1, v2, :cond_9

    .line 193
    .line 194
    const v2, 0x333b09

    .line 195
    .line 196
    .line 197
    if-eq v1, v2, :cond_8

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_8
    const-string v1, "moov"

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-nez v0, :cond_b

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_9
    const-string v1, "mdat"

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-nez v0, :cond_b

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_a
    const-string v1, "free"

    .line 219
    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_c

    .line 225
    .line 226
    :cond_b
    :goto_3
    const-string p0, "video/mp4"

    .line 227
    .line 228
    return-object p0

    .line 229
    :cond_c
    :goto_4
    invoke-static {p0, p1}, Ljx0;->φ([BI)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    nop

    .line 235
    :sswitch_data_0
    .sparse-switch
        0x2de012 -> :sswitch_9
        0x2de01f -> :sswitch_8
        0x30ced7 -> :sswitch_7
        0x30ceec -> :sswitch_6
        0x30d06a -> :sswitch_5
        0x30d07f -> :sswitch_4
        0x332327 -> :sswitch_3
        0x3348b1 -> :sswitch_2
        0x376ba8 -> :sswitch_1
        0x376bda -> :sswitch_0
    .end sparse-switch
.end method

.method public static final Δ(Ljava/util/concurrent/atomic/AtomicInteger;ILjava/util/concurrent/atomic/AtomicInteger;Landroid/app/Activity;ZLandroid/app/NotificationManager;ILf8;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const-string v0, "/"

    .line 10
    .line 11
    const-string v1, " \u00b7 \u6210\u529f "

    .line 12
    .line 13
    const-string v2, "\u8fdb\u5ea6: "

    .line 14
    .line 15
    invoke-static {v2, p0, v0, p1, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const/4 v0, 0x0

    .line 27
    if-lez p1, :cond_0

    .line 28
    .line 29
    mul-int/lit8 v1, p0, 0x64

    .line 30
    .line 31
    div-int/2addr v1, p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v1, v0

    .line 34
    :goto_0
    const-string v2, "\u6279\u91cf\u4e0b\u8f7d"

    .line 35
    .line 36
    invoke-static {v1, p3, v2, p2}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    if-eqz p4, :cond_3

    .line 40
    .line 41
    new-instance p4, Lx31;

    .line 42
    .line 43
    invoke-direct {p4, p3}, Lx31;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    const p3, 0x1080081

    .line 47
    .line 48
    .line 49
    iget-object v1, p4, Lx31;->ξ:Landroid/app/Notification;

    .line 50
    .line 51
    iput p3, v1, Landroid/app/Notification;->icon:I

    .line 52
    .line 53
    if-eqz p7, :cond_1

    .line 54
    .line 55
    iget-object p3, p7, Lf8;->α:Ljava/lang/String;

    .line 56
    .line 57
    if-nez p3, :cond_2

    .line 58
    .line 59
    :cond_1
    const-string p3, "\u4e3b\u9875\u4f5c\u54c1"

    .line 60
    .line 61
    :cond_2
    const-string p7, "\u6b63\u5728\u6279\u91cf\u4e0b\u8f7d "

    .line 62
    .line 63
    invoke-virtual {p7, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-static {p3}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    iput-object p3, p4, Lx31;->ε:Ljava/lang/CharSequence;

    .line 72
    .line 73
    invoke-static {p2}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iput-object p2, p4, Lx31;->ζ:Ljava/lang/CharSequence;

    .line 78
    .line 79
    iput p1, p4, Lx31;->θ:I

    .line 80
    .line 81
    iput p0, p4, Lx31;->ι:I

    .line 82
    .line 83
    iput-boolean v0, p4, Lx31;->κ:Z

    .line 84
    .line 85
    const/4 p0, 0x2

    .line 86
    invoke-virtual {p4, p0}, Lx31;->γ(I)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x1

    .line 90
    iput-boolean p0, p4, Lx31;->ο:Z

    .line 91
    .line 92
    invoke-virtual {p4}, Lx31;->α()Landroid/app/Notification;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p5, p6, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    return-void
.end method

.method public static Ε(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lux;->π()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "[downoload dev][DOWNLOAD] "

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "DYHelper"

    .line 15
    .line 16
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final Ι(Ljava/util/LinkedHashSet;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "http"

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {p1, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {p1}, Ljx0;->Ζ(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-static {p1}, Lqy0;->з(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method public static Ξ(Landroid/app/Activity;Lf8;Ljava/util/List;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p0}, Lqy0;->Φ(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lqy0;->А(Landroid/content/Context;)Z

    .line 5
    .line 6
    .line 7
    move-result v4

    .line 8
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "\u5171 "

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, " \u9879\uff0c\u51c6\u5907\u4e2d..."

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "\u9009\u62e9\u4e0b\u8f7d"

    .line 32
    .line 33
    invoke-static {p0, v1, v0}, Lqy0;->б(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v2, "\u5f00\u59cb\u4e0b\u8f7d\u5df2\u9009 "

    .line 43
    .line 44
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v0, " \u9879..."

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {p0, v0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Lbf0;

    .line 63
    .line 64
    move-object v2, p0

    .line 65
    move-object v3, p1

    .line 66
    move-object v1, p2

    .line 67
    move-object v5, p3

    .line 68
    invoke-direct/range {v0 .. v5}, Lbf0;-><init>(Ljava/util/List;Landroid/app/Activity;Lf8;ZLjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/16 p0, 0x17

    .line 72
    .line 73
    const-string p1, "dl-selected-media"

    .line 74
    .line 75
    invoke-static {p0, v0, p1}, Lp91;->Ζ(ILp70;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public static Ο(Ljava/lang/String;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;ZLjava/lang/String;Le80;Le80;)V
    .locals 13

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    sget-object v0, Lwx;->α:Lt41;

    .line 3
    .line 4
    invoke-static {p0}, Lqy0;->з(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/16 v0, 0x1e

    .line 9
    .line 10
    invoke-static {p0, v1, v1, v0}, Lwx;->ζ(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lvx;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, v1, Lvx;->δ:Ljava/io/BufferedInputStream;

    .line 15
    .line 16
    iget-wide v7, v1, Lvx;->ζ:J

    .line 17
    .line 18
    move-object v3, p1

    .line 19
    move-object v4, p2

    .line 20
    move/from16 v5, p3

    .line 21
    .line 22
    move-object/from16 v6, p4

    .line 23
    .line 24
    move/from16 v9, p5

    .line 25
    .line 26
    move-object/from16 v10, p6

    .line 27
    .line 28
    move-object/from16 v11, p7

    .line 29
    .line 30
    move-object/from16 v12, p8

    .line 31
    .line 32
    invoke-static/range {v2 .. v12}, Lqy0;->υ(Ljava/io/BufferedInputStream;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;JZLjava/lang/String;Le80;Le80;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lvx;->α()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    move-object p0, v0

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1}, Lvx;->α()V

    .line 44
    .line 45
    .line 46
    :cond_0
    throw p0
.end method

.method public static final Ρ(Landroid/app/Activity;Lf8;Lfv;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {p0}, Lqy0;->Φ(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "\u4e0b\u8f7d\u89c6\u9891"

    .line 5
    .line 6
    const-string v1, "\u6b63\u5728\u8fde\u63a5..."

    .line 7
    .line 8
    invoke-static {p0, v0, v1}, Lqy0;->б(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "\u5f00\u59cb\u4e0b\u8f7d\u89c6\u9891..."

    .line 12
    .line 13
    invoke-static {p0, v0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v7, p2, Lfv;->α:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p0}, Lqy0;->Φ(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    sget-object p2, Lqy0;->α:Lqy0;

    .line 22
    .line 23
    invoke-virtual {p2}, Lqy0;->ж()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-static {p0}, Lqy0;->А(Landroid/content/Context;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    new-instance v1, Lby0;

    .line 32
    .line 33
    move-object v3, p0

    .line 34
    move-object v2, p1

    .line 35
    move-object v5, p3

    .line 36
    invoke-direct/range {v1 .. v7}, Lby0;-><init>(Lf8;Landroid/app/Activity;ILjava/lang/String;ZLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/16 p0, 0x17

    .line 40
    .line 41
    const-string p1, "dl-video-final"

    .line 42
    .line 43
    invoke-static {p0, v1, p1}, Lp91;->Ζ(ILp70;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static Σ(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;ILjava/lang/String;ZLjava/lang/String;Le80;Le80;)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 8
    .line 9
    .line 10
    :cond_0
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    .line 11
    .line 12
    invoke-direct {v3, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    :try_start_1
    sget-object v1, Lqy0;->α:Lqy0;

    .line 16
    .line 17
    move-object v4, p0

    .line 18
    move-object v2, p1

    .line 19
    move v5, p3

    .line 20
    move-object v6, p4

    .line 21
    move/from16 v7, p5

    .line 22
    .line 23
    move-object/from16 v8, p6

    .line 24
    .line 25
    move-object/from16 v9, p7

    .line 26
    .line 27
    move-object/from16 v10, p8

    .line 28
    .line 29
    invoke-virtual/range {v1 .. v10}, Lqy0;->Τ(Ljava/lang/String;Ljava/io/FileOutputStream;Landroid/content/Context;ILjava/lang/String;ZLjava/lang/String;Le80;Le80;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    .line 31
    .line 32
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lpu0;->α:Lpu0;

    .line 36
    .line 37
    invoke-virtual {p0, p2, p1}, Lpu0;->Σ(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p0, v0

    .line 43
    goto :goto_0

    .line 44
    :catchall_1
    move-exception v0

    .line 45
    move-object p0, v0

    .line 46
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 47
    :catchall_2
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    :try_start_4
    invoke-static {v3, p0}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 53
    :goto_0
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 54
    .line 55
    .line 56
    throw p0
.end method

.method public static final Υ(Ljava/util/LinkedHashSet;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "http"

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {p1, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {p1}, Ljx0;->Ζ(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-static {p1}, Lpu0;->Η(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-static {p1}, Lqy0;->з(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method

.method public static Φ(Landroid/content/Context;)V
    .locals 4

    .line 1
    const-string v0, "notification"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/app/NotificationManager;

    .line 11
    .line 12
    const-string v0, "dyhelper_download"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Landroid/app/NotificationChannel;

    .line 21
    .line 22
    const-string v2, "DY Helper \u4e0b\u8f7d"

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-direct {v1, v0, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 26
    .line 27
    .line 28
    const-string v0, "\u4e0b\u8f7d\u8fdb\u5ea6\u901a\u77e5"

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {v1, v0, v0}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public static Χ(J)Ljava/lang/String;
    .locals 5

    .line 1
    const-wide/16 v0, 0x400

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, "B"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    const-wide/32 v0, 0x100000

    .line 26
    .line 27
    .line 28
    cmp-long v0, p0, v0

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    const-string v2, "%.1f"

    .line 32
    .line 33
    if-gez v0, :cond_1

    .line 34
    .line 35
    long-to-double p0, p0

    .line 36
    const-wide/high16 v3, 0x4090000000000000L    # 1024.0

    .line 37
    .line 38
    div-double/2addr p0, v3

    .line 39
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {v2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string p1, "KB"

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_1
    long-to-double p0, p0

    .line 63
    const-wide/high16 v3, 0x4130000000000000L    # 1048576.0

    .line 64
    .line 65
    div-double/2addr p0, v3

    .line 66
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {v2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const-string p1, "MB"

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public static Ψ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, ".jpg"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_11

    .line 21
    .line 22
    const-string v0, ".jpeg"

    .line 23
    .line 24
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto/16 :goto_7

    .line 31
    .line 32
    :cond_0
    const-string v0, ".png"

    .line 33
    .line 34
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    const-string v0, ".webp"

    .line 43
    .line 44
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_2
    const-string v0, ".gif"

    .line 53
    .line 54
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :cond_3
    const-string v0, ".bmp"

    .line 63
    .line 64
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    const-string p0, "image/bmp"

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_4
    const-string v0, ".heic"

    .line 74
    .line 75
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    const-string v0, ".heif"

    .line 83
    .line 84
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_6
    const-string v0, ".avif"

    .line 92
    .line 93
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_7
    const-string v0, ".vvic"

    .line 101
    .line 102
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_10

    .line 107
    .line 108
    const-string v0, "format=vvic"

    .line 109
    .line 110
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_10

    .line 115
    .line 116
    const-string v0, "image_type=vvic"

    .line 117
    .line 118
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_8
    const-string v0, "format=jpeg"

    .line 126
    .line 127
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_11

    .line 132
    .line 133
    const-string v0, "format=jpg"

    .line 134
    .line 135
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_9

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_9
    const-string v0, "format=png"

    .line 143
    .line 144
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    :goto_0
    const-string p0, "image/png"

    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_a
    const-string v0, "format=webp"

    .line 154
    .line 155
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_b

    .line 160
    .line 161
    :goto_1
    const-string p0, "image/webp"

    .line 162
    .line 163
    return-object p0

    .line 164
    :cond_b
    const-string v0, "format=gif"

    .line 165
    .line 166
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_c

    .line 171
    .line 172
    :goto_2
    const-string p0, "image/gif"

    .line 173
    .line 174
    return-object p0

    .line 175
    :cond_c
    const-string v0, "format=heic"

    .line 176
    .line 177
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_d

    .line 182
    .line 183
    :goto_3
    const-string p0, "image/heic"

    .line 184
    .line 185
    return-object p0

    .line 186
    :cond_d
    const-string v0, "format=heif"

    .line 187
    .line 188
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_e

    .line 193
    .line 194
    :goto_4
    const-string p0, "image/heif"

    .line 195
    .line 196
    return-object p0

    .line 197
    :cond_e
    const-string v0, "format=avif"

    .line 198
    .line 199
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-eqz p0, :cond_f

    .line 204
    .line 205
    :goto_5
    const-string p0, "image/avif"

    .line 206
    .line 207
    return-object p0

    .line 208
    :cond_f
    const/4 p0, 0x0

    .line 209
    return-object p0

    .line 210
    :cond_10
    :goto_6
    const-string p0, "image/vvic"

    .line 211
    .line 212
    return-object p0

    .line 213
    :cond_11
    :goto_7
    const-string p0, "image/jpeg"

    .line 214
    .line 215
    return-object p0
.end method

.method public static Ω(Ljava/lang/Iterable;)Ljava/util/List;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static α(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v0

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, ""

    .line 17
    .line 18
    :cond_1
    const-string v1, "http"

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-static {p0, v1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    return-object v0
.end method

.method public static β(Ljava/lang/String;)Z
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Lqy0;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Lmc;

    .line 12
    .line 13
    const/4 v5, 0x4

    .line 14
    invoke-direct {v4, v5, v0, v1}, Lmc;-><init>(IJ)V

    .line 15
    .line 16
    .line 17
    new-instance v5, Lwi;

    .line 18
    .line 19
    const/4 v6, 0x4

    .line 20
    invoke-direct {v5, v4, v6}, Lwi;-><init>(La80;I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v3, v5}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v2, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public static γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lku;->α:Ljava/util/Set;

    .line 2
    .line 3
    const-string v0, "download_name_pattern"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, p0, v0}, Lqy0;->с(ILandroid/content/Context;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-static {p1, p2, p0}, Lku;->α(Lf8;Ljava/lang/String;I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lku;->α:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    const/4 v0, 0x1

    .line 18
    new-array v1, v0, [C

    .line 19
    .line 20
    const/16 v2, 0x2e

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    aput-char v2, v1, v3

    .line 24
    .line 25
    invoke-static {p3, v1}, Lq02;->Е(Ljava/lang/String;[C)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-static {p3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const-string p3, "dat"

    .line 36
    .line 37
    :cond_0
    invoke-static {p2}, Lku;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    const-string p2, "dyhelper_"

    .line 52
    .line 53
    invoke-static {v1, v2, p2}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    :cond_1
    if-gt p1, v0, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    add-int/2addr p0, v0

    .line 61
    const-string p1, "_img"

    .line 62
    .line 63
    invoke-static {p2, p1, p0}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    :goto_0
    const-string p0, "."

    .line 68
    .line 69
    invoke-static {p2, p0, p3}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public static ε(Lf8;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-static {}, Lqy0;->г()Llu;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lf8;->Η:Ljava/util/List;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    sget-object p0, Ljz;->ε:Ljz;

    .line 18
    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v2, v0}, Lkn0;->Η(Ljava/lang/String;Llu;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {v2}, Lln0;->Ω(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast p0, Ljava/lang/Iterable;

    .line 58
    .line 59
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static ζ(Landroid/content/Context;Lf8;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lku;->α:Ljava/util/Set;

    .line 2
    .line 3
    const-string v0, "download_name_pattern"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, p0, v0}, Lqy0;->с(ILandroid/content/Context;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "mp4"

    .line 14
    .line 15
    invoke-static {p1, v0, p0}, Lku;->α(Lf8;Ljava/lang/String;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "_livephoto"

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lku;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/16 p1, 0x64

    .line 34
    .line 35
    invoke-static {p0, p1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide p0

    .line 49
    const-string v0, "livephoto_"

    .line 50
    .line 51
    invoke-static {p0, p1, v0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :cond_0
    return-object p0
.end method

.method public static η(Lf8;)Ljava/util/List;
    .locals 15

    .line 1
    invoke-static {}, Lqy0;->г()Llu;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lf8;->δ:Ljava/util/List;

    .line 9
    .line 10
    sget-object v2, Ljz;->ε:Ljz;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    move-object v1, v2

    .line 15
    :cond_0
    iget-object v3, p0, Lf8;->Ο:Ljava/util/List;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    move-object v3, v2

    .line 20
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const/4 v6, 0x0

    .line 30
    move v7, v6

    .line 31
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    const-string v9, ""

    .line 36
    .line 37
    if-eqz v8, :cond_6

    .line 38
    .line 39
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    add-int/lit8 v10, v7, 0x1

    .line 44
    .line 45
    const/4 v11, 0x0

    .line 46
    if-ltz v7, :cond_5

    .line 47
    .line 48
    check-cast v8, Lqu0;

    .line 49
    .line 50
    invoke-static {v8, v0}, Lkn0;->μ(Lqu0;Llu;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    iget v12, v8, Lqu0;->α:I

    .line 55
    .line 56
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v13

    .line 60
    if-eqz v13, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-static {v12, v1}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    check-cast v11, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v8, v11, v0}, Lkn0;->λ(Lqu0;Ljava/lang/String;Llu;)Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    const/4 v11, 0x1

    .line 74
    invoke-static {v8, v11}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    new-instance v13, Lru0;

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    if-le v14, v11, :cond_3

    .line 85
    .line 86
    const-string v9, "_item"

    .line 87
    .line 88
    invoke-static {v9, v10}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    :cond_3
    invoke-direct {v13, v12, v8, v7, v9}, Lru0;-><init>(ILjava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    move-object v11, v13

    .line 96
    :goto_1
    if-eqz v11, :cond_4

    .line 97
    .line 98
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    :cond_4
    move v7, v10

    .line 102
    goto :goto_0

    .line 103
    :cond_5
    invoke-static {}, Lyh;->х()V

    .line 104
    .line 105
    .line 106
    throw v11

    .line 107
    :cond_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_7

    .line 112
    .line 113
    return-object v4

    .line 114
    :cond_7
    invoke-static {p0, v0}, Lkn0;->π(Lf8;Llu;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_8

    .line 123
    .line 124
    return-object v2

    .line 125
    :cond_8
    new-instance v2, Lru0;

    .line 126
    .line 127
    invoke-static {p0, v0}, Lkn0;->ν(Lf8;Llu;)Ljava/util/ArrayList;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-direct {v2, v6, p0, v1, v9}, Lru0;-><init>(ILjava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v2}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0
.end method

.method public static θ(Lf8;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lf8;->ζ()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lf8;->η()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v1, p0, Lf8;->Η:Ljava/util/List;

    .line 28
    .line 29
    sget-object v2, Ljz;->ε:Ljz;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    move-object v1, v2

    .line 34
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    iget-object v1, p0, Lf8;->γ:Ljava/util/List;

    .line 55
    .line 56
    if-nez v1, :cond_4

    .line 57
    .line 58
    move-object v1, v2

    .line 59
    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_5

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Ljava/lang/String;

    .line 74
    .line 75
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    iget-object v3, p0, Lf8;->δ:Ljava/util/List;

    .line 85
    .line 86
    if-nez v3, :cond_6

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    move-object v2, v3

    .line 90
    :goto_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_7

    .line 99
    .line 100
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v0, v1, v3}, Lkn0;->ο(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_7
    invoke-virtual {p0}, Lf8;->ε()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-static {v0, v1, v2}, Lkn0;->ο(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_8

    .line 122
    .line 123
    iget-object p0, p0, Lf8;->Μ:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v0, v1, p0}, Lkn0;->ο(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    check-cast p0, Ljava/lang/Iterable;

    .line 136
    .line 137
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0
.end method

.method public static final ι(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    invoke-static {p1, p0}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static κ(Landroid/content/Context;Lf8;Lzy0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p4, :cond_1

    .line 2
    .line 3
    invoke-static {p4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p4, 0x0

    .line 11
    :goto_0
    if-eqz p4, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    const-string p4, "dat"

    .line 15
    .line 16
    invoke-static {p0, p1, p4}, Lqy0;->γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p4

    .line 24
    :goto_1
    iget p0, p2, Lzy0;->β:I

    .line 25
    .line 26
    add-int/lit8 p0, p0, 0x1

    .line 27
    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p2, "_"

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lku;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const/16 p1, 0x64

    .line 56
    .line 57
    invoke-static {p0, p1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide p0

    .line 71
    new-instance p4, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p4, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    :cond_2
    return-object p0
.end method

.method public static λ(Lf8;)Ljava/util/ArrayList;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v2, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v3, v0, Lf8;->Ρ:Ljava/util/List;

    .line 14
    .line 15
    iget-object v11, v0, Lf8;->Ο:Ljava/util/List;

    .line 16
    .line 17
    iget-object v12, v0, Lf8;->ζ:Lh8;

    .line 18
    .line 19
    sget-object v13, Ljz;->ε:Ljz;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    move-object v3, v13

    .line 24
    :cond_0
    new-instance v4, Luh0;

    .line 25
    .line 26
    const/16 v5, 0xf

    .line 27
    .line 28
    invoke-direct {v4, v5}, Luh0;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v3, v4}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_3

    .line 40
    .line 41
    new-instance v4, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Lg8;

    .line 61
    .line 62
    invoke-virtual {v6}, Lg8;->γ()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-eqz v6, :cond_1

    .line 67
    .line 68
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    invoke-static {v4}, Lqy0;->Ω(Ljava/lang/Iterable;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    :goto_1
    move-object v14, v4

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    iget-object v4, v0, Lf8;->δ:Ljava/util/List;

    .line 79
    .line 80
    invoke-static {v4}, Lqy0;->Ω(Ljava/lang/Iterable;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    goto :goto_1

    .line 85
    :goto_2
    sget-object v4, Lh8;->η:Lh8;

    .line 86
    .line 87
    const/16 v16, 0x1

    .line 88
    .line 89
    if-eq v12, v4, :cond_9

    .line 90
    .line 91
    invoke-virtual {v0}, Lf8;->λ()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-nez v4, :cond_9

    .line 96
    .line 97
    iget-object v4, v0, Lf8;->Θ:Ljava/lang/Integer;

    .line 98
    .line 99
    if-nez v4, :cond_4

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    const/16 v5, 0x3b

    .line 107
    .line 108
    if-eq v4, v5, :cond_9

    .line 109
    .line 110
    :goto_3
    iget-object v4, v0, Lf8;->Ι:Ljava/lang/String;

    .line 111
    .line 112
    if-eqz v4, :cond_5

    .line 113
    .line 114
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_9

    .line 119
    .line 120
    :cond_5
    invoke-virtual {v0}, Lf8;->ζ()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    if-eqz v4, :cond_6

    .line 125
    .line 126
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_9

    .line 131
    .line 132
    :cond_6
    invoke-virtual {v0}, Lf8;->ε()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-eqz v4, :cond_7

    .line 137
    .line 138
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_9

    .line 143
    .line 144
    :cond_7
    if-eqz v11, :cond_8

    .line 145
    .line 146
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_9

    .line 151
    .line 152
    :cond_8
    const/4 v4, 0x0

    .line 153
    goto :goto_4

    .line 154
    :cond_9
    move/from16 v4, v16

    .line 155
    .line 156
    :goto_4
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    sget-object v17, Laz0;->η:Laz0;

    .line 161
    .line 162
    sget-object v18, Laz0;->ε:Laz0;

    .line 163
    .line 164
    sget-object v19, Laz0;->θ:Laz0;

    .line 165
    .line 166
    const-string v6, " \u9875"

    .line 167
    .line 168
    const-string v7, "\u7b2c "

    .line 169
    .line 170
    if-nez v5, :cond_19

    .line 171
    .line 172
    iget-object v5, v0, Lf8;->θ:Ljava/lang/String;

    .line 173
    .line 174
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    const-string v10, ", structuredPages="

    .line 179
    .line 180
    const-string v8, ", trustedLivePhoto="

    .line 181
    .line 182
    const-string v15, "buildSelectableMediaItems awemeId="

    .line 183
    .line 184
    invoke-static {v9, v15, v5, v10, v8}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-static {v5}, Lqy0;->Ε(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v15

    .line 202
    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_19

    .line 207
    .line 208
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    check-cast v3, Lg8;

    .line 213
    .line 214
    iget-object v5, v3, Lg8;->ι:Li8;

    .line 215
    .line 216
    if-eqz v5, :cond_a

    .line 217
    .line 218
    iget-object v8, v5, Li8;->δ:Ljava/util/List;

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_a
    const/4 v8, 0x0

    .line 222
    :goto_6
    if-nez v8, :cond_b

    .line 223
    .line 224
    move-object v8, v13

    .line 225
    :cond_b
    if-eqz v5, :cond_c

    .line 226
    .line 227
    iget-object v5, v5, Li8;->ζ:Ljava/util/List;

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_c
    const/4 v5, 0x0

    .line 231
    :goto_7
    if-nez v5, :cond_d

    .line 232
    .line 233
    move-object v5, v13

    .line 234
    :cond_d
    invoke-static {v8, v5}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    iget-object v8, v3, Lg8;->ι:Li8;

    .line 239
    .line 240
    if-eqz v8, :cond_e

    .line 241
    .line 242
    iget-object v8, v8, Li8;->ε:Ljava/util/List;

    .line 243
    .line 244
    goto :goto_8

    .line 245
    :cond_e
    const/4 v8, 0x0

    .line 246
    :goto_8
    if-nez v8, :cond_f

    .line 247
    .line 248
    move-object v8, v13

    .line 249
    :cond_f
    invoke-static {v5, v8}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    new-instance v8, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    :cond_10
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    if-eqz v9, :cond_11

    .line 267
    .line 268
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    check-cast v9, Ljava/lang/String;

    .line 273
    .line 274
    invoke-static {v9}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    if-eqz v9, :cond_10

    .line 279
    .line 280
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    goto :goto_9

    .line 284
    :cond_11
    new-instance v5, Ljava/util/HashSet;

    .line 285
    .line 286
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 287
    .line 288
    .line 289
    new-instance v10, Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    if-eqz v9, :cond_13

    .line 303
    .line 304
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    move-object/from16 v21, v9

    .line 309
    .line 310
    check-cast v21, Ljava/lang/String;

    .line 311
    .line 312
    move-object/from16 v22, v1

    .line 313
    .line 314
    invoke-static/range {v21 .. v21}, Lqy0;->к(Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v5, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-eqz v1, :cond_12

    .line 323
    .line 324
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    :cond_12
    move-object/from16 v1, v22

    .line 328
    .line 329
    goto :goto_a

    .line 330
    :cond_13
    move-object/from16 v22, v1

    .line 331
    .line 332
    invoke-virtual {v3}, Lg8;->γ()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-static {v1}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    iget v5, v3, Lg8;->α:I

    .line 341
    .line 342
    if-nez v1, :cond_14

    .line 343
    .line 344
    const-string v8, "null"

    .line 345
    .line 346
    goto :goto_b

    .line 347
    :cond_14
    move-object v8, v1

    .line 348
    :goto_b
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    move-object/from16 v21, v1

    .line 353
    .line 354
    iget-object v1, v3, Lg8;->γ:Ljava/lang/Integer;

    .line 355
    .line 356
    move-object/from16 v23, v2

    .line 357
    .line 358
    iget-object v2, v3, Lg8;->ε:Ljava/lang/Integer;

    .line 359
    .line 360
    move/from16 v24, v4

    .line 361
    .line 362
    const-string v4, ", still="

    .line 363
    .line 364
    move-object/from16 v25, v10

    .line 365
    .line 366
    const-string v10, ", videoCandidates="

    .line 367
    .line 368
    move-object/from16 v26, v11

    .line 369
    .line 370
    const-string v11, "selectable page="

    .line 371
    .line 372
    invoke-static {v5, v11, v4, v8, v10}, La12;->η(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    const-string v5, ", clipType="

    .line 380
    .line 381
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    const-string v1, ", livePhotoType="

    .line 388
    .line 389
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-static {v1}, Lqy0;->Ε(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->isEmpty()Z

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-nez v1, :cond_16

    .line 407
    .line 408
    if-eqz v24, :cond_15

    .line 409
    .line 410
    move-object/from16 v1, v19

    .line 411
    .line 412
    goto :goto_c

    .line 413
    :cond_15
    move-object/from16 v1, v17

    .line 414
    .line 415
    :goto_c
    iget v4, v3, Lg8;->α:I

    .line 416
    .line 417
    add-int/lit8 v2, v4, 0x1

    .line 418
    .line 419
    invoke-static {v7, v2, v6}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    invoke-static/range {v25 .. v25}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    move-object v9, v2

    .line 428
    check-cast v9, Ljava/lang/String;

    .line 429
    .line 430
    move-object v2, v6

    .line 431
    const-string v6, "\u52a8\u56fe"

    .line 432
    .line 433
    move-object/from16 v8, v21

    .line 434
    .line 435
    move-object v3, v13

    .line 436
    move-object v13, v7

    .line 437
    move-object/from16 v7, v21

    .line 438
    .line 439
    move-object/from16 v21, v3

    .line 440
    .line 441
    move-object v3, v1

    .line 442
    move-object v11, v2

    .line 443
    move-object/from16 v1, v22

    .line 444
    .line 445
    move-object/from16 v2, v23

    .line 446
    .line 447
    move-object/from16 v10, v25

    .line 448
    .line 449
    invoke-static/range {v1 .. v10}, Lqy0;->μ(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Laz0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 450
    .line 451
    .line 452
    goto :goto_d

    .line 453
    :cond_16
    move-object v1, v13

    .line 454
    move-object v13, v7

    .line 455
    move-object/from16 v7, v21

    .line 456
    .line 457
    move-object/from16 v21, v1

    .line 458
    .line 459
    move-object v11, v6

    .line 460
    move-object/from16 v1, v22

    .line 461
    .line 462
    move-object/from16 v2, v23

    .line 463
    .line 464
    if-eqz v7, :cond_18

    .line 465
    .line 466
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    if-eqz v4, :cond_17

    .line 471
    .line 472
    goto :goto_d

    .line 473
    :cond_17
    iget v4, v3, Lg8;->α:I

    .line 474
    .line 475
    add-int/lit8 v3, v4, 0x1

    .line 476
    .line 477
    invoke-static {v13, v3, v11}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v5

    .line 481
    const-string v6, "\u56fe\u7247"

    .line 482
    .line 483
    const/4 v9, 0x0

    .line 484
    move-object v8, v7

    .line 485
    move-object/from16 v3, v18

    .line 486
    .line 487
    move-object/from16 v10, v21

    .line 488
    .line 489
    invoke-static/range {v1 .. v10}, Lqy0;->μ(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Laz0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 490
    .line 491
    .line 492
    :cond_18
    :goto_d
    move-object v6, v11

    .line 493
    move-object v7, v13

    .line 494
    move-object/from16 v13, v21

    .line 495
    .line 496
    move/from16 v4, v24

    .line 497
    .line 498
    move-object/from16 v11, v26

    .line 499
    .line 500
    goto/16 :goto_5

    .line 501
    .line 502
    :cond_19
    move/from16 v24, v4

    .line 503
    .line 504
    move-object/from16 v26, v11

    .line 505
    .line 506
    move-object/from16 v21, v13

    .line 507
    .line 508
    move-object v11, v6

    .line 509
    move-object v13, v7

    .line 510
    if-eqz v24, :cond_1f

    .line 511
    .line 512
    if-nez v26, :cond_1a

    .line 513
    .line 514
    move-object/from16 v26, v21

    .line 515
    .line 516
    :cond_1a
    new-instance v3, Ljava/util/ArrayList;

    .line 517
    .line 518
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 519
    .line 520
    .line 521
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    :cond_1b
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 526
    .line 527
    .line 528
    move-result v5

    .line 529
    if-eqz v5, :cond_1e

    .line 530
    .line 531
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v5

    .line 535
    move-object v6, v5

    .line 536
    check-cast v6, Lqu0;

    .line 537
    .line 538
    iget-object v7, v6, Lqu0;->β:Ljava/lang/String;

    .line 539
    .line 540
    if-eqz v7, :cond_1c

    .line 541
    .line 542
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 543
    .line 544
    .line 545
    move-result v7

    .line 546
    if-eqz v7, :cond_1d

    .line 547
    .line 548
    :cond_1c
    iget-object v6, v6, Lqu0;->ε:Ljava/util/List;

    .line 549
    .line 550
    if-eqz v6, :cond_1b

    .line 551
    .line 552
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 553
    .line 554
    .line 555
    move-result v6

    .line 556
    if-eqz v6, :cond_1d

    .line 557
    .line 558
    goto :goto_e

    .line 559
    :cond_1d
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    goto :goto_e

    .line 563
    :cond_1e
    new-instance v4, Luh0;

    .line 564
    .line 565
    const/16 v5, 0x10

    .line 566
    .line 567
    invoke-direct {v4, v5}, Luh0;-><init>(I)V

    .line 568
    .line 569
    .line 570
    invoke-static {v3, v4}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    move-object v15, v3

    .line 575
    goto :goto_f

    .line 576
    :cond_1f
    move-object/from16 v15, v21

    .line 577
    .line 578
    :goto_f
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    if-nez v3, :cond_2c

    .line 583
    .line 584
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 585
    .line 586
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 587
    .line 588
    .line 589
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    if-eqz v5, :cond_21

    .line 598
    .line 599
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    move-object v6, v5

    .line 604
    check-cast v6, Lqu0;

    .line 605
    .line 606
    iget v6, v6, Lqu0;->α:I

    .line 607
    .line 608
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 609
    .line 610
    .line 611
    move-result-object v6

    .line 612
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v7

    .line 616
    if-nez v7, :cond_20

    .line 617
    .line 618
    new-instance v7, Ljava/util/ArrayList;

    .line 619
    .line 620
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 621
    .line 622
    .line 623
    invoke-interface {v3, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    :cond_20
    check-cast v7, Ljava/util/List;

    .line 627
    .line 628
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    goto :goto_10

    .line 632
    :cond_21
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 633
    .line 634
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 635
    .line 636
    .line 637
    move-result v5

    .line 638
    invoke-static {v5}, Lex0;->Κ(I)I

    .line 639
    .line 640
    .line 641
    move-result v5

    .line 642
    invoke-direct {v4, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    check-cast v3, Ljava/lang/Iterable;

    .line 650
    .line 651
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 652
    .line 653
    .line 654
    move-result-object v3

    .line 655
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 656
    .line 657
    .line 658
    move-result v5

    .line 659
    if-eqz v5, :cond_22

    .line 660
    .line 661
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v5

    .line 665
    check-cast v5, Ljava/util/Map$Entry;

    .line 666
    .line 667
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v6

    .line 671
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v5

    .line 675
    check-cast v5, Ljava/util/List;

    .line 676
    .line 677
    invoke-static {v5}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v5

    .line 681
    check-cast v5, Lqu0;

    .line 682
    .line 683
    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    goto :goto_11

    .line 687
    :cond_22
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 688
    .line 689
    .line 690
    move-result-object v3

    .line 691
    check-cast v3, Ljava/lang/Iterable;

    .line 692
    .line 693
    invoke-static {v3}, Lxh;->С(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    check-cast v3, Ljava/lang/Integer;

    .line 698
    .line 699
    if-eqz v3, :cond_23

    .line 700
    .line 701
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    goto :goto_12

    .line 706
    :cond_23
    const/4 v3, -0x1

    .line 707
    :goto_12
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 708
    .line 709
    .line 710
    move-result v5

    .line 711
    add-int/lit8 v3, v3, 0x1

    .line 712
    .line 713
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 714
    .line 715
    .line 716
    move-result v3

    .line 717
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 718
    .line 719
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 720
    .line 721
    .line 722
    const/4 v6, 0x0

    .line 723
    :goto_13
    if-ge v6, v3, :cond_28

    .line 724
    .line 725
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 726
    .line 727
    .line 728
    move-result-object v7

    .line 729
    invoke-virtual {v4, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v7

    .line 733
    check-cast v7, Lqu0;

    .line 734
    .line 735
    if-eqz v7, :cond_26

    .line 736
    .line 737
    invoke-static {}, Lqy0;->г()Llu;

    .line 738
    .line 739
    .line 740
    move-result-object v8

    .line 741
    invoke-static {v7, v8}, Lkn0;->μ(Lqu0;Llu;)Ljava/util/List;

    .line 742
    .line 743
    .line 744
    move-result-object v10

    .line 745
    invoke-static {}, Lqy0;->г()Llu;

    .line 746
    .line 747
    .line 748
    move-result-object v8

    .line 749
    const/4 v9, 0x0

    .line 750
    invoke-static {v7, v9, v8}, Lkn0;->λ(Lqu0;Ljava/lang/String;Llu;)Ljava/util/ArrayList;

    .line 751
    .line 752
    .line 753
    move-result-object v8

    .line 754
    invoke-static {v8}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v8

    .line 758
    check-cast v8, Ljava/lang/String;

    .line 759
    .line 760
    invoke-static {v8}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v8

    .line 764
    if-nez v8, :cond_24

    .line 765
    .line 766
    invoke-static {v6, v14}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v8

    .line 770
    check-cast v8, Ljava/lang/String;

    .line 771
    .line 772
    if-nez v8, :cond_24

    .line 773
    .line 774
    iget-object v8, v7, Lqu0;->δ:Ljava/lang/String;

    .line 775
    .line 776
    invoke-static {v8}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v8

    .line 780
    if-nez v8, :cond_24

    .line 781
    .line 782
    iget-object v7, v7, Lqu0;->γ:Ljava/lang/String;

    .line 783
    .line 784
    invoke-static {v7}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v8

    .line 788
    :cond_24
    move-object v7, v8

    .line 789
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 790
    .line 791
    .line 792
    move-result v8

    .line 793
    if-nez v8, :cond_26

    .line 794
    .line 795
    add-int/lit8 v8, v6, 0x1

    .line 796
    .line 797
    invoke-static {v13, v8, v11}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v8

    .line 801
    invoke-static {v10}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v9

    .line 805
    check-cast v9, Ljava/lang/String;

    .line 806
    .line 807
    move-object/from16 v22, v4

    .line 808
    .line 809
    move v4, v6

    .line 810
    const-string v6, "\u52a8\u56fe"

    .line 811
    .line 812
    move-object/from16 v23, v5

    .line 813
    .line 814
    move-object v5, v8

    .line 815
    move-object v8, v7

    .line 816
    move-object/from16 v27, v19

    .line 817
    .line 818
    move/from16 v19, v3

    .line 819
    .line 820
    move-object/from16 v3, v27

    .line 821
    .line 822
    move-object/from16 v27, v23

    .line 823
    .line 824
    move-object/from16 v23, v15

    .line 825
    .line 826
    move-object/from16 v15, v27

    .line 827
    .line 828
    invoke-static/range {v1 .. v10}, Lqy0;->μ(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Laz0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 829
    .line 830
    .line 831
    move-object/from16 v25, v3

    .line 832
    .line 833
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 834
    .line 835
    .line 836
    move-result-object v3

    .line 837
    invoke-interface {v15, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    :cond_25
    :goto_14
    move-object/from16 v3, v18

    .line 841
    .line 842
    goto :goto_15

    .line 843
    :cond_26
    move-object/from16 v22, v4

    .line 844
    .line 845
    move v4, v6

    .line 846
    move-object/from16 v23, v15

    .line 847
    .line 848
    move-object/from16 v25, v19

    .line 849
    .line 850
    move/from16 v19, v3

    .line 851
    .line 852
    move-object v15, v5

    .line 853
    invoke-static {v4, v14}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    move-object v7, v3

    .line 858
    check-cast v7, Ljava/lang/String;

    .line 859
    .line 860
    if-eqz v7, :cond_25

    .line 861
    .line 862
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 863
    .line 864
    .line 865
    move-result v3

    .line 866
    if-eqz v3, :cond_27

    .line 867
    .line 868
    goto :goto_14

    .line 869
    :cond_27
    add-int/lit8 v6, v4, 0x1

    .line 870
    .line 871
    invoke-static {v13, v6, v11}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v5

    .line 875
    const-string v6, "\u56fe\u7247"

    .line 876
    .line 877
    const/4 v9, 0x0

    .line 878
    move-object v8, v7

    .line 879
    move-object/from16 v3, v18

    .line 880
    .line 881
    move-object/from16 v10, v21

    .line 882
    .line 883
    invoke-static/range {v1 .. v10}, Lqy0;->μ(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Laz0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 884
    .line 885
    .line 886
    :goto_15
    add-int/lit8 v6, v4, 0x1

    .line 887
    .line 888
    move-object/from16 v18, v3

    .line 889
    .line 890
    move-object v5, v15

    .line 891
    move/from16 v3, v19

    .line 892
    .line 893
    move-object/from16 v4, v22

    .line 894
    .line 895
    move-object/from16 v15, v23

    .line 896
    .line 897
    move-object/from16 v19, v25

    .line 898
    .line 899
    goto/16 :goto_13

    .line 900
    .line 901
    :cond_28
    move-object/from16 v23, v15

    .line 902
    .line 903
    move-object/from16 v25, v19

    .line 904
    .line 905
    move-object v15, v5

    .line 906
    invoke-interface/range {v23 .. v23}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 907
    .line 908
    .line 909
    move-result-object v18

    .line 910
    :cond_29
    :goto_16
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 911
    .line 912
    .line 913
    move-result v3

    .line 914
    if-eqz v3, :cond_2b

    .line 915
    .line 916
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v3

    .line 920
    check-cast v3, Lqu0;

    .line 921
    .line 922
    iget v4, v3, Lqu0;->α:I

    .line 923
    .line 924
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 925
    .line 926
    .line 927
    move-result-object v4

    .line 928
    invoke-interface {v15, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 929
    .line 930
    .line 931
    move-result v4

    .line 932
    if-nez v4, :cond_29

    .line 933
    .line 934
    invoke-static {}, Lqy0;->г()Llu;

    .line 935
    .line 936
    .line 937
    move-result-object v4

    .line 938
    invoke-static {v3, v4}, Lkn0;->μ(Lqu0;Llu;)Ljava/util/List;

    .line 939
    .line 940
    .line 941
    move-result-object v10

    .line 942
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 943
    .line 944
    .line 945
    move-result v4

    .line 946
    if-nez v4, :cond_29

    .line 947
    .line 948
    invoke-static {}, Lqy0;->г()Llu;

    .line 949
    .line 950
    .line 951
    move-result-object v4

    .line 952
    const/4 v9, 0x0

    .line 953
    invoke-static {v3, v9, v4}, Lkn0;->λ(Lqu0;Ljava/lang/String;Llu;)Ljava/util/ArrayList;

    .line 954
    .line 955
    .line 956
    move-result-object v4

    .line 957
    invoke-static {v4}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v4

    .line 961
    check-cast v4, Ljava/lang/String;

    .line 962
    .line 963
    invoke-static {v4}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    if-nez v4, :cond_2a

    .line 968
    .line 969
    iget-object v4, v3, Lqu0;->δ:Ljava/lang/String;

    .line 970
    .line 971
    invoke-static {v4}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v4

    .line 975
    if-nez v4, :cond_2a

    .line 976
    .line 977
    iget-object v4, v3, Lqu0;->γ:Ljava/lang/String;

    .line 978
    .line 979
    invoke-static {v4}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v4

    .line 983
    :cond_2a
    move-object v7, v4

    .line 984
    iget v4, v3, Lqu0;->α:I

    .line 985
    .line 986
    add-int/lit8 v3, v4, 0x1

    .line 987
    .line 988
    invoke-static {v13, v3, v11}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v5

    .line 992
    invoke-static {v10}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v3

    .line 996
    move-object v9, v3

    .line 997
    check-cast v9, Ljava/lang/String;

    .line 998
    .line 999
    const-string v6, "\u52a8\u56fe"

    .line 1000
    .line 1001
    move-object v8, v7

    .line 1002
    move-object/from16 v3, v25

    .line 1003
    .line 1004
    invoke-static/range {v1 .. v10}, Lqy0;->μ(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Laz0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 1005
    .line 1006
    .line 1007
    goto :goto_16

    .line 1008
    :cond_2b
    move-object/from16 v11, v25

    .line 1009
    .line 1010
    goto/16 :goto_18

    .line 1011
    .line 1012
    :cond_2c
    move-object/from16 v3, v18

    .line 1013
    .line 1014
    move-object/from16 v25, v19

    .line 1015
    .line 1016
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v15

    .line 1020
    const/4 v4, 0x0

    .line 1021
    :goto_17
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 1022
    .line 1023
    .line 1024
    move-result v5

    .line 1025
    if-eqz v5, :cond_2e

    .line 1026
    .line 1027
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v5

    .line 1031
    add-int/lit8 v6, v4, 0x1

    .line 1032
    .line 1033
    if-ltz v4, :cond_2d

    .line 1034
    .line 1035
    move-object v7, v5

    .line 1036
    check-cast v7, Ljava/lang/String;

    .line 1037
    .line 1038
    invoke-static {v13, v6, v11}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v5

    .line 1042
    move v8, v6

    .line 1043
    const-string v6, "\u56fe\u7247"

    .line 1044
    .line 1045
    const/4 v9, 0x0

    .line 1046
    move v10, v8

    .line 1047
    move-object v8, v7

    .line 1048
    move/from16 v18, v10

    .line 1049
    .line 1050
    move-object/from16 v10, v21

    .line 1051
    .line 1052
    invoke-static/range {v1 .. v10}, Lqy0;->μ(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Laz0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 1053
    .line 1054
    .line 1055
    move/from16 v4, v18

    .line 1056
    .line 1057
    goto :goto_17

    .line 1058
    :cond_2d
    invoke-static {}, Lyh;->х()V

    .line 1059
    .line 1060
    .line 1061
    const/16 v20, 0x0

    .line 1062
    .line 1063
    throw v20

    .line 1064
    :cond_2e
    if-eqz v24, :cond_2b

    .line 1065
    .line 1066
    invoke-static {}, Lqy0;->г()Llu;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v3

    .line 1070
    invoke-static {v0, v3}, Lkn0;->π(Lf8;Llu;)Ljava/util/List;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v10

    .line 1074
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 1075
    .line 1076
    .line 1077
    move-result v3

    .line 1078
    if-nez v3, :cond_2b

    .line 1079
    .line 1080
    invoke-static {v0}, Lkn0;->ι(Lf8;)Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v3

    .line 1084
    invoke-static {v3}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v3

    .line 1088
    if-nez v3, :cond_2f

    .line 1089
    .line 1090
    iget-object v3, v0, Lf8;->Μ:Ljava/lang/String;

    .line 1091
    .line 1092
    invoke-static {v3}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v3

    .line 1096
    if-nez v3, :cond_2f

    .line 1097
    .line 1098
    iget-object v3, v0, Lf8;->Λ:Ljava/lang/String;

    .line 1099
    .line 1100
    invoke-static {v3}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v3

    .line 1104
    if-nez v3, :cond_2f

    .line 1105
    .line 1106
    invoke-static {v14}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v3

    .line 1110
    check-cast v3, Ljava/lang/String;

    .line 1111
    .line 1112
    :cond_2f
    move-object v7, v3

    .line 1113
    invoke-static {v10}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v3

    .line 1117
    move-object v9, v3

    .line 1118
    check-cast v9, Ljava/lang/String;

    .line 1119
    .line 1120
    const/4 v4, 0x0

    .line 1121
    const-string v5, "\u52a8\u56fe"

    .line 1122
    .line 1123
    const-string v6, "\u52a8\u56fe"

    .line 1124
    .line 1125
    move-object v8, v7

    .line 1126
    move-object/from16 v3, v25

    .line 1127
    .line 1128
    invoke-static/range {v1 .. v10}, Lqy0;->μ(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Laz0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 1129
    .line 1130
    .line 1131
    move-object v11, v3

    .line 1132
    :goto_18
    if-eqz v24, :cond_39

    .line 1133
    .line 1134
    iget-object v3, v0, Lf8;->Η:Ljava/util/List;

    .line 1135
    .line 1136
    invoke-static {v3}, Lqy0;->Ω(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v3

    .line 1140
    new-instance v4, Ljava/util/ArrayList;

    .line 1141
    .line 1142
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1143
    .line 1144
    .line 1145
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v3

    .line 1149
    :cond_30
    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1150
    .line 1151
    .line 1152
    move-result v5

    .line 1153
    if-eqz v5, :cond_31

    .line 1154
    .line 1155
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v5

    .line 1159
    move-object v6, v5

    .line 1160
    check-cast v6, Ljava/lang/String;

    .line 1161
    .line 1162
    invoke-static {v6}, Ljx0;->Μ(Ljava/lang/String;)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v6

    .line 1166
    if-nez v6, :cond_30

    .line 1167
    .line 1168
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1169
    .line 1170
    .line 1171
    goto :goto_19

    .line 1172
    :cond_31
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v13

    .line 1176
    const/4 v3, 0x0

    .line 1177
    :goto_1a
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 1178
    .line 1179
    .line 1180
    move-result v4

    .line 1181
    if-eqz v4, :cond_39

    .line 1182
    .line 1183
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v4

    .line 1187
    add-int/lit8 v15, v3, 0x1

    .line 1188
    .line 1189
    if-ltz v3, :cond_38

    .line 1190
    .line 1191
    move-object v9, v4

    .line 1192
    check-cast v9, Ljava/lang/String;

    .line 1193
    .line 1194
    invoke-static {v9}, Ljx0;->Ι(Ljava/lang/String;)Z

    .line 1195
    .line 1196
    .line 1197
    move-result v4

    .line 1198
    if-nez v4, :cond_33

    .line 1199
    .line 1200
    invoke-static {v9}, Ljx0;->Ν(Ljava/lang/String;)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v4

    .line 1204
    if-eqz v4, :cond_32

    .line 1205
    .line 1206
    goto :goto_1b

    .line 1207
    :cond_32
    const/4 v4, 0x0

    .line 1208
    goto :goto_1c

    .line 1209
    :cond_33
    :goto_1b
    move/from16 v4, v16

    .line 1210
    .line 1211
    :goto_1c
    if-eqz v4, :cond_34

    .line 1212
    .line 1213
    move-object v5, v11

    .line 1214
    goto :goto_1d

    .line 1215
    :cond_34
    move-object/from16 v5, v17

    .line 1216
    .line 1217
    :goto_1d
    if-eqz v4, :cond_36

    .line 1218
    .line 1219
    invoke-static {v3, v14}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v4

    .line 1223
    check-cast v4, Ljava/lang/String;

    .line 1224
    .line 1225
    if-nez v4, :cond_35

    .line 1226
    .line 1227
    invoke-static {v14}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v4

    .line 1231
    check-cast v4, Ljava/lang/String;

    .line 1232
    .line 1233
    :cond_35
    move-object v7, v4

    .line 1234
    goto :goto_1e

    .line 1235
    :cond_36
    move-object v7, v9

    .line 1236
    :goto_1e
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 1237
    .line 1238
    .line 1239
    move-result v4

    .line 1240
    add-int/2addr v4, v3

    .line 1241
    const-string v3, "\u52a8\u56fe "

    .line 1242
    .line 1243
    invoke-static {v3, v15}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v3

    .line 1247
    if-ne v5, v11, :cond_37

    .line 1248
    .line 1249
    move-object v8, v7

    .line 1250
    goto :goto_1f

    .line 1251
    :cond_37
    const/4 v8, 0x0

    .line 1252
    :goto_1f
    invoke-static {v9}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v10

    .line 1256
    const-string v6, "\u52a8\u56fe"

    .line 1257
    .line 1258
    move-object/from16 v27, v5

    .line 1259
    .line 1260
    move-object v5, v3

    .line 1261
    move-object/from16 v3, v27

    .line 1262
    .line 1263
    invoke-static/range {v1 .. v10}, Lqy0;->μ(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Laz0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 1264
    .line 1265
    .line 1266
    move v3, v15

    .line 1267
    goto :goto_1a

    .line 1268
    :cond_38
    invoke-static {}, Lyh;->х()V

    .line 1269
    .line 1270
    .line 1271
    const/16 v20, 0x0

    .line 1272
    .line 1273
    throw v20

    .line 1274
    :cond_39
    sget-object v3, Lh8;->ε:Lh8;

    .line 1275
    .line 1276
    if-ne v12, v3, :cond_42

    .line 1277
    .line 1278
    invoke-virtual {v0}, Lf8;->κ()Z

    .line 1279
    .line 1280
    .line 1281
    move-result v3

    .line 1282
    if-nez v3, :cond_42

    .line 1283
    .line 1284
    if-nez v24, :cond_42

    .line 1285
    .line 1286
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 1287
    .line 1288
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v0}, Lf8;->η()Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v4

    .line 1295
    invoke-static {v4}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v4

    .line 1299
    if-nez v4, :cond_3a

    .line 1300
    .line 1301
    goto :goto_20

    .line 1302
    :cond_3a
    invoke-static {v4}, Ljx0;->Ι(Ljava/lang/String;)Z

    .line 1303
    .line 1304
    .line 1305
    move-result v5

    .line 1306
    if-eqz v5, :cond_3b

    .line 1307
    .line 1308
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1309
    .line 1310
    .line 1311
    :cond_3b
    :goto_20
    iget-object v13, v0, Lf8;->γ:Ljava/util/List;

    .line 1312
    .line 1313
    if-nez v13, :cond_3c

    .line 1314
    .line 1315
    move-object/from16 v13, v21

    .line 1316
    .line 1317
    :cond_3c
    new-instance v0, Luh0;

    .line 1318
    .line 1319
    const/16 v4, 0x11

    .line 1320
    .line 1321
    invoke-direct {v0, v4}, Luh0;-><init>(I)V

    .line 1322
    .line 1323
    .line 1324
    invoke-static {v13, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v0

    .line 1328
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v0

    .line 1332
    :cond_3d
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1333
    .line 1334
    .line 1335
    move-result v4

    .line 1336
    if-eqz v4, :cond_3f

    .line 1337
    .line 1338
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v4

    .line 1342
    check-cast v4, Ljava/lang/String;

    .line 1343
    .line 1344
    invoke-static {v4}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v4

    .line 1348
    if-nez v4, :cond_3e

    .line 1349
    .line 1350
    goto :goto_21

    .line 1351
    :cond_3e
    invoke-static {v4}, Ljx0;->Ι(Ljava/lang/String;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v5

    .line 1355
    if-eqz v5, :cond_3d

    .line 1356
    .line 1357
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1358
    .line 1359
    .line 1360
    goto :goto_21

    .line 1361
    :cond_3f
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v10

    .line 1365
    const/4 v3, 0x0

    .line 1366
    :goto_22
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1367
    .line 1368
    .line 1369
    move-result v0

    .line 1370
    if-eqz v0, :cond_42

    .line 1371
    .line 1372
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v0

    .line 1376
    add-int/lit8 v15, v3, 0x1

    .line 1377
    .line 1378
    if-ltz v3, :cond_41

    .line 1379
    .line 1380
    move-object v8, v0

    .line 1381
    check-cast v8, Ljava/lang/String;

    .line 1382
    .line 1383
    if-nez v3, :cond_40

    .line 1384
    .line 1385
    const-string v0, "\u89c6\u9891"

    .line 1386
    .line 1387
    :goto_23
    move-object v4, v0

    .line 1388
    goto :goto_24

    .line 1389
    :cond_40
    const-string v0, "\u89c6\u9891 "

    .line 1390
    .line 1391
    invoke-static {v0, v15}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v0

    .line 1395
    goto :goto_23

    .line 1396
    :goto_24
    const/4 v7, 0x0

    .line 1397
    invoke-static {v8}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v9

    .line 1401
    move-object/from16 v23, v2

    .line 1402
    .line 1403
    sget-object v2, Laz0;->ζ:Laz0;

    .line 1404
    .line 1405
    const-string v5, "\u89c6\u9891"

    .line 1406
    .line 1407
    const/4 v6, 0x0

    .line 1408
    move-object v0, v1

    .line 1409
    move-object/from16 v1, v23

    .line 1410
    .line 1411
    invoke-static/range {v0 .. v9}, Lqy0;->μ(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Laz0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 1412
    .line 1413
    .line 1414
    move-object v2, v1

    .line 1415
    move-object v1, v0

    .line 1416
    move v3, v15

    .line 1417
    goto :goto_22

    .line 1418
    :cond_41
    invoke-static {}, Lyh;->х()V

    .line 1419
    .line 1420
    .line 1421
    const/16 v20, 0x0

    .line 1422
    .line 1423
    throw v20

    .line 1424
    :cond_42
    return-object v2
.end method

.method public static final μ(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Laz0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 11

    .line 1
    invoke-static/range {p7 .. p7}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v7

    .line 5
    invoke-static/range {p6 .. p6}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    move-object v6, v7

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v6, v0

    .line 14
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface/range {p9 .. p9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v2}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    new-instance v1, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v9, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object v3, v2

    .line 70
    check-cast v3, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v3}, Lqy0;->к(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_3

    .line 81
    .line 82
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-static/range {p8 .. p8}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-nez v0, :cond_5

    .line 91
    .line 92
    invoke-static {v9}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/lang/String;

    .line 97
    .line 98
    :cond_5
    move-object v8, v0

    .line 99
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/4 v1, 0x1

    .line 104
    if-eqz v0, :cond_9

    .line 105
    .line 106
    if-eq v0, v1, :cond_7

    .line 107
    .line 108
    const/4 v2, 0x2

    .line 109
    if-eq v0, v2, :cond_7

    .line 110
    .line 111
    const/4 v2, 0x3

    .line 112
    if-ne v0, v2, :cond_6

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    invoke-static {}, Lγ;->κ()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_7
    :goto_3
    if-nez v8, :cond_8

    .line 120
    .line 121
    invoke-static {v9}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Ljava/lang/String;

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_8
    move-object v0, v8

    .line 129
    goto :goto_4

    .line 130
    :cond_9
    move-object v0, v7

    .line 131
    :goto_4
    if-nez v0, :cond_a

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_a
    sget-object v2, Laz0;->ε:Laz0;

    .line 135
    .line 136
    if-eq p2, v2, :cond_b

    .line 137
    .line 138
    invoke-static {v0}, Ljx0;->Μ(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_b

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_b
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v0}, Lqy0;->к(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    new-instance v3, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v2, "|"

    .line 162
    .line 163
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-nez v0, :cond_c

    .line 178
    .line 179
    :goto_5
    return-void

    .line 180
    :cond_c
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_d

    .line 189
    .line 190
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    check-cast v3, Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-static {v3}, Lqy0;->к(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    new-instance v5, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {p0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_d
    new-instance v0, Lzy0;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    add-int/lit8 v3, p0, 0x1

    .line 233
    .line 234
    const/4 v10, 0x0

    .line 235
    move-object v1, p2

    .line 236
    move v2, p3

    .line 237
    move-object v4, p4

    .line 238
    move-object/from16 v5, p5

    .line 239
    .line 240
    invoke-direct/range {v0 .. v10}, Lzy0;-><init>(Laz0;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    return-void
.end method

.method public static ν(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lku;->α:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x1

    .line 12
    new-array v0, v0, [C

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/16 v2, 0x2e

    .line 16
    .line 17
    aput-char v2, v0, v1

    .line 18
    .line 19
    invoke-static {p0, v0}, Lq02;->Е(Ljava/lang/String;[C)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const-string p0, "dat"

    .line 30
    .line 31
    :cond_0
    const-string v0, "comment_emoji"

    .line 32
    .line 33
    invoke-static {v0}, Lku;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    const-string v0, "dyhelper"

    .line 44
    .line 45
    :cond_1
    invoke-static {}, Lku;->η()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, "_"

    .line 58
    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0, v2}, Lq02;->Φ(Ljava/lang/CharSequence;C)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_2
    const-string v1, "."

    .line 77
    .line 78
    invoke-static {v0, v1, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method

.method public static ξ([BI)Ljava/lang/String;
    .locals 4

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, p1, :cond_1

    .line 14
    .line 15
    aget-byte v2, p0, v1

    .line 16
    .line 17
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "%02X"

    .line 31
    .line 32
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, p1, -0x1

    .line 40
    .line 41
    if-eq v1, v2, :cond_0

    .line 42
    .line 43
    const-string v2, " "

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public static ο([BI)Ljava/lang/String;
    .locals 5

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, p1, :cond_4

    .line 14
    .line 15
    aget-byte v2, p0, v1

    .line 16
    .line 17
    and-int/lit16 v2, v2, 0xff

    .line 18
    .line 19
    const/16 v3, 0x20

    .line 20
    .line 21
    if-gt v3, v2, :cond_0

    .line 22
    .line 23
    const/16 v4, 0x7f

    .line 24
    .line 25
    if-ge v2, v4, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/16 v4, 0x80

    .line 29
    .line 30
    if-gt v4, v2, :cond_1

    .line 31
    .line 32
    const/16 v4, 0x100

    .line 33
    .line 34
    if-ge v2, v4, :cond_1

    .line 35
    .line 36
    :goto_1
    int-to-char v2, v2

    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_1
    const/16 v4, 0xa

    .line 42
    .line 43
    if-eq v2, v4, :cond_3

    .line 44
    .line 45
    const/16 v4, 0xd

    .line 46
    .line 47
    if-eq v2, v4, :cond_3

    .line 48
    .line 49
    const/16 v4, 0x9

    .line 50
    .line 51
    if-ne v2, v4, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v2, 0x2e

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public static π(Lky0;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    iget-object v0, p0, Lky0;->γ:Ljava/io/BufferedInputStream;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    :catchall_0
    iget-object p0, p0, Lky0;->β:Lvx;

    .line 10
    .line 11
    invoke-virtual {p0}, Lvx;->α()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static ρ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)V
    .locals 6

    .line 1
    const-string v0, "download_confirm_filename"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lqy0;->р(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {p3, p3}, Lqy0;->σ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p4, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, Lv8;

    .line 19
    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    move-object v4, p3

    .line 24
    move-object v5, p4

    .line 25
    invoke-direct/range {v0 .. v5}, Lv8;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final σ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lku;->α:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    const-string v0, ""

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    move-object p1, v0

    .line 23
    :cond_1
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :cond_2
    invoke-static {p1}, Lku;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/16 v1, 0x2e

    .line 42
    .line 43
    invoke-static {p1, v1, v0}, Lq02;->ц(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 48
    .line 49
    invoke-static {v1, v0, v1}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v1, Lku;->α:Ljava/util/Set;

    .line 54
    .line 55
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-static {p1, p1}, Lq02;->э(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_3
    invoke-static {p1}, Lku;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-static {p0}, Lku;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 86
    .line 87
    .line 88
    move-result-wide p0

    .line 89
    const-string v0, "dyhelper_"

    .line 90
    .line 91
    invoke-static {p0, p1, v0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    :cond_4
    return-object p0

    .line 96
    :cond_5
    return-object p1
.end method

.method public static τ(Landroid/app/Activity;Ljava/lang/String;La80;)V
    .locals 2

    .line 1
    const-string v0, "download_confirm_filename"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lqy0;->р(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Le9;

    .line 15
    .line 16
    const/16 v1, 0x12

    .line 17
    .line 18
    invoke-direct {v0, p0, p1, p2, v1}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static υ(Ljava/io/BufferedInputStream;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;JZLjava/lang/String;Le80;Le80;)V
    .locals 25

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p8

    .line 8
    .line 9
    move-object/from16 v4, p9

    .line 10
    .line 11
    move-object/from16 v5, p10

    .line 12
    .line 13
    const-string v6, "notification"

    .line 14
    .line 15
    invoke-virtual {v0, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast v6, Landroid/app/NotificationManager;

    .line 23
    .line 24
    const/16 v7, 0x2000

    .line 25
    .line 26
    new-array v7, v7, [B

    .line 27
    .line 28
    const-wide/16 v11, 0x0

    .line 29
    .line 30
    const-wide/16 v13, 0x0

    .line 31
    .line 32
    const-wide/16 v15, 0x0

    .line 33
    .line 34
    move-object/from16 v10, p0

    .line 35
    .line 36
    const-wide/16 v17, 0x0

    .line 37
    .line 38
    :goto_0
    :try_start_0
    invoke-virtual {v10, v7}, Ljava/io/InputStream;->read([B)I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    const/4 v9, -0x1

    .line 43
    if-eq v8, v9, :cond_6

    .line 44
    .line 45
    const/4 v9, 0x0

    .line 46
    invoke-virtual {v1, v7, v9, v8}, Ljava/io/OutputStream;->write([BII)V

    .line 47
    .line 48
    .line 49
    int-to-long v9, v8

    .line 50
    add-long/2addr v11, v9

    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v8

    .line 55
    if-eqz p7, :cond_1

    .line 56
    .line 57
    sub-long v21, v8, v13

    .line 58
    .line 59
    const-wide/16 v23, 0x1f4

    .line 60
    .line 61
    cmp-long v10, v21, v23

    .line 62
    .line 63
    if-lez v10, :cond_1

    .line 64
    .line 65
    new-instance v10, Lx31;

    .line 66
    .line 67
    invoke-direct {v10, v0}, Lx31;-><init>(Landroid/content/Context;)V

    .line 68
    .line 69
    .line 70
    iget-object v13, v10, Lx31;->ξ:Landroid/app/Notification;

    .line 71
    .line 72
    const v14, 0x1080081

    .line 73
    .line 74
    .line 75
    iput v14, v13, Landroid/app/Notification;->icon:I

    .line 76
    .line 77
    const-string v13, "\u6b63\u5728\u4e0b\u8f7d"

    .line 78
    .line 79
    invoke-static {v13}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    iput-object v13, v10, Lx31;->ε:Ljava/lang/CharSequence;

    .line 84
    .line 85
    invoke-static/range {p4 .. p4}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object v13

    .line 89
    iput-object v13, v10, Lx31;->ζ:Ljava/lang/CharSequence;

    .line 90
    .line 91
    const/4 v13, 0x2

    .line 92
    invoke-virtual {v10, v13}, Lx31;->γ(I)V

    .line 93
    .line 94
    .line 95
    const/4 v13, 0x1

    .line 96
    iput-boolean v13, v10, Lx31;->ο:Z

    .line 97
    .line 98
    cmp-long v13, p5, v17

    .line 99
    .line 100
    if-lez v13, :cond_0

    .line 101
    .line 102
    const/16 v13, 0x64

    .line 103
    .line 104
    move-object/from16 v21, v7

    .line 105
    .line 106
    move-wide/from16 v22, v8

    .line 107
    .line 108
    int-to-long v7, v13

    .line 109
    mul-long/2addr v7, v11

    .line 110
    div-long v7, v7, p5

    .line 111
    .line 112
    long-to-int v7, v7

    .line 113
    const/4 v8, 0x0

    .line 114
    invoke-static {v7, v8, v13}, Lj81;->μ(III)I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    iput v13, v10, Lx31;->θ:I

    .line 119
    .line 120
    iput v7, v10, Lx31;->ι:I

    .line 121
    .line 122
    iput-boolean v8, v10, Lx31;->κ:Z

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :goto_1
    move-object v2, v0

    .line 126
    goto/16 :goto_6

    .line 127
    .line 128
    :catchall_0
    move-exception v0

    .line 129
    goto :goto_1

    .line 130
    :cond_0
    move-object/from16 v21, v7

    .line 131
    .line 132
    move-wide/from16 v22, v8

    .line 133
    .line 134
    const/4 v8, 0x0

    .line 135
    iput v8, v10, Lx31;->θ:I

    .line 136
    .line 137
    iput v8, v10, Lx31;->ι:I

    .line 138
    .line 139
    const/4 v13, 0x1

    .line 140
    iput-boolean v13, v10, Lx31;->κ:Z

    .line 141
    .line 142
    :goto_2
    invoke-virtual {v10}, Lx31;->α()Landroid/app/Notification;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-virtual {v6, v2, v7}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v13, v22

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_1
    move-object/from16 v21, v7

    .line 153
    .line 154
    move-wide/from16 v22, v8

    .line 155
    .line 156
    :goto_3
    if-eqz v3, :cond_5

    .line 157
    .line 158
    sub-long v8, v22, v15

    .line 159
    .line 160
    const-wide/16 v19, 0x320

    .line 161
    .line 162
    cmp-long v7, v8, v19

    .line 163
    .line 164
    if-lez v7, :cond_5

    .line 165
    .line 166
    if-eqz v4, :cond_2

    .line 167
    .line 168
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    invoke-interface {v4, v7, v8}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    check-cast v7, Ljava/lang/String;

    .line 181
    .line 182
    if-nez v7, :cond_3

    .line 183
    .line 184
    :cond_2
    move-object/from16 v7, p4

    .line 185
    .line 186
    :cond_3
    if-eqz v5, :cond_4

    .line 187
    .line 188
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-interface {v5, v8, v9}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    check-cast v8, Ljava/lang/Number;

    .line 201
    .line 202
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    goto :goto_4

    .line 207
    :cond_4
    const/4 v9, -0x1

    .line 208
    :goto_4
    invoke-static {v9, v0, v3, v7}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    move-object/from16 v10, p0

    .line 212
    .line 213
    move-object/from16 v7, v21

    .line 214
    .line 215
    move-wide/from16 v15, v22

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_5
    move-object/from16 v10, p0

    .line 220
    .line 221
    move-object/from16 v7, v21

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_6
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 226
    .line 227
    .line 228
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 229
    .line 230
    .line 231
    cmp-long v1, p5, v17

    .line 232
    .line 233
    if-lez v1, :cond_8

    .line 234
    .line 235
    cmp-long v1, v11, p5

    .line 236
    .line 237
    if-ltz v1, :cond_7

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_7
    new-instance v0, Ljava/lang/Exception;

    .line 241
    .line 242
    invoke-static {v11, v12}, Lqy0;->Χ(J)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-static/range {p5 .. p6}, Lqy0;->Χ(J)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    const-string v3, "\u4e0b\u8f7d\u4e0d\u5b8c\u6574: "

    .line 251
    .line 252
    const-string v4, "/"

    .line 253
    .line 254
    invoke-static {v3, v1, v4, v2}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_8
    :goto_5
    if-eqz p7, :cond_9

    .line 263
    .line 264
    new-instance v1, Lx31;

    .line 265
    .line 266
    invoke-direct {v1, v0}, Lx31;-><init>(Landroid/content/Context;)V

    .line 267
    .line 268
    .line 269
    const v0, 0x1080082

    .line 270
    .line 271
    .line 272
    iget-object v3, v1, Lx31;->ξ:Landroid/app/Notification;

    .line 273
    .line 274
    iput v0, v3, Landroid/app/Notification;->icon:I

    .line 275
    .line 276
    const-string v0, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 277
    .line 278
    invoke-static {v0}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    iput-object v0, v1, Lx31;->ε:Ljava/lang/CharSequence;

    .line 283
    .line 284
    invoke-static/range {p4 .. p4}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iput-object v0, v1, Lx31;->ζ:Ljava/lang/CharSequence;

    .line 289
    .line 290
    const/16 v0, 0x10

    .line 291
    .line 292
    invoke-virtual {v1, v0}, Lx31;->γ(I)V

    .line 293
    .line 294
    .line 295
    const/4 v13, 0x1

    .line 296
    iput-boolean v13, v1, Lx31;->ο:Z

    .line 297
    .line 298
    invoke-virtual {v1}, Lx31;->α()Landroid/app/Notification;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v6, v2, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 303
    .line 304
    .line 305
    :cond_9
    return-void

    .line 306
    :goto_6
    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 307
    :catchall_1
    move-exception v0

    .line 308
    invoke-static {v1, v2}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 309
    .line 310
    .line 311
    throw v0
.end method

.method public static φ(Ljava/io/File;Ljava/io/File;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-lez v0, :cond_c

    .line 16
    .line 17
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    .line 18
    .line 19
    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/16 p0, 0x9

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    const/16 v1, 0xa

    .line 38
    .line 39
    invoke-static {p0, v1}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_0
    move-wide v4, v2

    .line 54
    :goto_0
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 55
    .line 56
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    const-wide/32 v6, 0x493e0

    .line 67
    .line 68
    .line 69
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    cmp-long v1, v4, v2

    .line 77
    .line 78
    if-lez v1, :cond_1

    .line 79
    .line 80
    const-wide/16 v6, 0x3e8

    .line 81
    .line 82
    mul-long/2addr v4, v6

    .line 83
    const-wide/16 v6, 0x2

    .line 84
    .line 85
    div-long/2addr v4, v6

    .line 86
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    :cond_1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    move-object v4, v1

    .line 102
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_6

    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    check-cast v4, Ljava/lang/Number;

    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    const/4 v6, 0x2

    .line 122
    :try_start_1
    invoke-virtual {v0, v4, v5, v6}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 123
    .line 124
    .line 125
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    goto :goto_1

    .line 127
    :catchall_1
    move-exception v6

    .line 128
    :try_start_2
    new-instance v7, Leo1;

    .line 129
    .line 130
    invoke-direct {v7, v6}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    move-object v6, v7

    .line 134
    :goto_1
    instance-of v7, v6, Leo1;

    .line 135
    .line 136
    if-eqz v7, :cond_3

    .line 137
    .line 138
    move-object v6, v1

    .line 139
    :cond_3
    check-cast v6, Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    .line 141
    if-nez v6, :cond_5

    .line 142
    .line 143
    const/4 v6, 0x3

    .line 144
    :try_start_3
    invoke-virtual {v0, v4, v5, v6}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 145
    .line 146
    .line 147
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 148
    goto :goto_2

    .line 149
    :catchall_2
    move-exception v4

    .line 150
    :try_start_4
    new-instance v5, Leo1;

    .line 151
    .line 152
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    move-object v4, v5

    .line 156
    :goto_2
    instance-of v5, v4, Leo1;

    .line 157
    .line 158
    if-eqz v5, :cond_4

    .line 159
    .line 160
    move-object v4, v1

    .line 161
    :cond_4
    check-cast v4, Landroid/graphics/Bitmap;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_5
    move-object v4, v6

    .line 165
    :goto_3
    if-eqz v4, :cond_2

    .line 166
    .line 167
    :cond_6
    if-eqz v4, :cond_b

    .line 168
    .line 169
    :try_start_5
    new-instance p0, Ljava/io/FileOutputStream;

    .line 170
    .line 171
    invoke-direct {p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 172
    .line 173
    .line 174
    :try_start_6
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 175
    .line 176
    const/16 v5, 0x5f

    .line 177
    .line 178
    invoke-virtual {v4, v1, v5, p0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_9

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 185
    .line 186
    .line 187
    :try_start_7
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 188
    .line 189
    .line 190
    :try_start_8
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    if-nez p0, :cond_7

    .line 195
    .line 196
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 197
    .line 198
    .line 199
    :cond_7
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-eqz p0, :cond_8

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 206
    .line 207
    .line 208
    move-result-wide p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 209
    cmp-long p0, p0, v2

    .line 210
    .line 211
    if-lez p0, :cond_8

    .line 212
    .line 213
    :try_start_9
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 214
    .line 215
    .line 216
    :catchall_3
    return-void

    .line 217
    :cond_8
    :try_start_a
    new-instance p0, Ljava/lang/Exception;

    .line 218
    .line 219
    const-string p1, "\u89c6\u9891\u9996\u5e27 JPEG \u8f93\u51fa\u4e3a\u7a7a"

    .line 220
    .line 221
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 225
    :catchall_4
    move-exception p0

    .line 226
    goto :goto_5

    .line 227
    :catchall_5
    move-exception p1

    .line 228
    goto :goto_4

    .line 229
    :cond_9
    :try_start_b
    new-instance p1, Ljava/lang/Exception;

    .line 230
    .line 231
    const-string v1, "\u89c6\u9891\u9996\u5e27 JPEG \u538b\u7f29\u5931\u8d25"

    .line 232
    .line 233
    invoke-direct {p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 237
    :goto_4
    :try_start_c
    throw p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 238
    :catchall_6
    move-exception v1

    .line 239
    :try_start_d
    invoke-static {p0, p1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 243
    :goto_5
    :try_start_e
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    if-nez p1, :cond_a

    .line 248
    .line 249
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 250
    .line 251
    .line 252
    :cond_a
    throw p0

    .line 253
    :cond_b
    new-instance p0, Ljava/lang/Exception;

    .line 254
    .line 255
    const-string p1, "\u65e0\u6cd5\u4ece\u89c6\u9891\u4e2d\u63d0\u53d6\u53ef\u7528\u5e27"

    .line 256
    .line 257
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 261
    :goto_6
    :try_start_f
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 262
    .line 263
    .line 264
    :catchall_7
    throw p0

    .line 265
    :cond_c
    new-instance p0, Ljava/lang/Exception;

    .line 266
    .line 267
    const-string p1, "\u89c6\u9891\u6587\u4ef6\u4e3a\u7a7a\uff0c\u65e0\u6cd5\u63d0\u53d6\u9996\u5e27"

    .line 268
    .line 269
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw p0
.end method

.method public static χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    invoke-static/range {p3 .. p3}, Lqy0;->л(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-static/range {p2 .. p2}, Lku;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-static/range {p1 .. p1}, Lev;->β(Ljava/lang/String;)Lcv;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    iget-object v0, v5, Lcv;->γ:Ljava/lang/String;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object/from16 v0, p1

    .line 23
    .line 24
    :goto_0
    invoke-static {v0}, Lev;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const/16 v7, 0xa

    .line 29
    .line 30
    const/4 v8, 0x1

    .line 31
    if-eqz v5, :cond_9

    .line 32
    .line 33
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/content/ContentResolver;->getPersistedUriPermissions()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v10, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-eqz v11, :cond_2

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    move-object v12, v11

    .line 64
    check-cast v12, Landroid/content/UriPermission;

    .line 65
    .line 66
    invoke-virtual {v12}, Landroid/content/UriPermission;->isWritePermission()Z

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    if-eqz v12, :cond_1

    .line 71
    .line 72
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto :goto_3

    .line 78
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-static {v10, v7}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    invoke-direct {v0, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    if-eqz v11, :cond_3

    .line 96
    .line 97
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    check-cast v11, Landroid/content/UriPermission;

    .line 102
    .line 103
    invoke-virtual {v11}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    invoke-virtual {v11}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    invoke-static {v0}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 116
    .line 117
    .line 118
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    goto :goto_4

    .line 120
    :goto_3
    new-instance v10, Leo1;

    .line 121
    .line 122
    invoke-direct {v10, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    move-object v0, v10

    .line 126
    :goto_4
    instance-of v10, v0, Leo1;

    .line 127
    .line 128
    if-eqz v10, :cond_4

    .line 129
    .line 130
    sget-object v0, Lnz;->ε:Lnz;

    .line 131
    .line 132
    :cond_4
    check-cast v0, Ljava/util/Set;

    .line 133
    .line 134
    sget-object v10, Lqy0;->β:Ljava/util/List;

    .line 135
    .line 136
    invoke-static {v10}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    new-instance v11, Lkv0;

    .line 141
    .line 142
    invoke-direct {v11, v1, v8}, Lkv0;-><init>(Landroid/content/Context;I)V

    .line 143
    .line 144
    .line 145
    invoke-static {v10, v11}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    new-instance v11, Lθ;

    .line 150
    .line 151
    const/16 v12, 0x1a

    .line 152
    .line 153
    invoke-direct {v11, v12, v0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    new-instance v0, Ly30;

    .line 157
    .line 158
    invoke-direct {v0, v10, v8, v11}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v0}, Lus1;->υ(Lss1;)Lcu;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v10, Lθ;

    .line 166
    .line 167
    const/16 v11, 0x1b

    .line 168
    .line 169
    invoke-direct {v10, v11, v5}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v10}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    new-instance v10, Lx30;

    .line 177
    .line 178
    invoke-direct {v10, v0}, Lx30;-><init>(Ly30;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v10}, Lx30;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-nez v0, :cond_5

    .line 186
    .line 187
    const/4 v0, 0x0

    .line 188
    goto :goto_5

    .line 189
    :cond_5
    invoke-virtual {v10}, Lx30;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v10}, Lx30;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    if-nez v11, :cond_6

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_6
    move-object v11, v0

    .line 201
    check-cast v11, Lly0;

    .line 202
    .line 203
    iget v11, v11, Lly0;->γ:I

    .line 204
    .line 205
    :cond_7
    invoke-virtual {v10}, Lx30;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    move-object v13, v12

    .line 210
    check-cast v13, Lly0;

    .line 211
    .line 212
    iget v13, v13, Lly0;->γ:I

    .line 213
    .line 214
    if-ge v11, v13, :cond_8

    .line 215
    .line 216
    move-object v0, v12

    .line 217
    move v11, v13

    .line 218
    :cond_8
    invoke-virtual {v10}, Lx30;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    if-nez v12, :cond_7

    .line 223
    .line 224
    :goto_5
    check-cast v0, Lly0;

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_9
    const/4 v0, 0x0

    .line 228
    :goto_6
    if-eqz v0, :cond_a

    .line 229
    .line 230
    iget-object v10, v0, Lly0;->α:Landroid/net/Uri;

    .line 231
    .line 232
    invoke-virtual {v10}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v10

    .line 236
    if-nez v10, :cond_c

    .line 237
    .line 238
    :cond_a
    if-nez v5, :cond_b

    .line 239
    .line 240
    invoke-static {v1}, Lyh;->Ρ(Landroid/content/Context;)Landroid/net/Uri;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    if-eqz v10, :cond_b

    .line 245
    .line 246
    invoke-virtual {v10}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    goto :goto_7

    .line 251
    :cond_b
    const/4 v10, 0x0

    .line 252
    :cond_c
    :goto_7
    const-string v11, "_display_name"

    .line 253
    .line 254
    const-string v12, ", mime="

    .line 255
    .line 256
    const-string v13, "DYHelper"

    .line 257
    .line 258
    const-string v14, "/"

    .line 259
    .line 260
    if-eqz v10, :cond_d

    .line 261
    .line 262
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 263
    .line 264
    .line 265
    move-result v15

    .line 266
    if-eqz v15, :cond_e

    .line 267
    .line 268
    :cond_d
    move-object/from16 p3, v6

    .line 269
    .line 270
    goto/16 :goto_13

    .line 271
    .line 272
    :cond_e
    :try_start_1
    invoke-static {v10}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    invoke-static {v1, v10}, Lcw1;->δ(Landroid/content/Context;Landroid/net/Uri;)Lcw1;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    invoke-virtual {v10}, Lcw1;->α()Z

    .line 281
    .line 282
    .line 283
    move-result v15

    .line 284
    if-eqz v15, :cond_1a

    .line 285
    .line 286
    invoke-static {v6}, Lev;->γ(Ljava/lang/String;)Ldv;

    .line 287
    .line 288
    .line 289
    move-result-object v15

    .line 290
    if-eqz v0, :cond_f

    .line 291
    .line 292
    iget-object v15, v0, Lly0;->β:Ljava/lang/String;

    .line 293
    .line 294
    goto :goto_8

    .line 295
    :catchall_1
    move-exception v0

    .line 296
    move-object/from16 p3, v6

    .line 297
    .line 298
    goto/16 :goto_12

    .line 299
    .line 300
    :cond_f
    if-eqz v15, :cond_10

    .line 301
    .line 302
    iget-object v9, v10, Lcw1;->ζ:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v9, Landroid/content/Context;

    .line 305
    .line 306
    iget-object v7, v10, Lcw1;->η:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v7, Landroid/net/Uri;

    .line 309
    .line 310
    invoke-static {v9, v7, v11}, Lbd;->Ν(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    if-eqz v7, :cond_10

    .line 315
    .line 316
    iget-object v9, v15, Ldv;->α:Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result v7

    .line 322
    if-ne v7, v8, :cond_10

    .line 323
    .line 324
    iget-object v15, v15, Ldv;->β:Ljava/lang/String;

    .line 325
    .line 326
    goto :goto_8

    .line 327
    :cond_10
    move-object v15, v6

    .line 328
    :goto_8
    if-eqz v0, :cond_11

    .line 329
    .line 330
    invoke-static {v15}, Lev;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    goto :goto_9

    .line 335
    :cond_11
    invoke-static {v10, v15}, Lqy0;->й(Lcw1;Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    :goto_9
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    if-nez v7, :cond_18

    .line 344
    .line 345
    filled-new-array {v14}, [Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    const/4 v9, 0x6

    .line 350
    invoke-static {v0, v7, v9}, Lq02;->т(Ljava/lang/String;[Ljava/lang/String;I)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    new-instance v9, Ljava/util/ArrayList;

    .line 355
    .line 356
    const/16 v15, 0xa

    .line 357
    .line 358
    invoke-static {v7, v15}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 359
    .line 360
    .line 361
    move-result v15

    .line 362
    invoke-direct {v9, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 363
    .line 364
    .line 365
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v15

    .line 373
    if-eqz v15, :cond_12

    .line 374
    .line 375
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v15

    .line 379
    check-cast v15, Ljava/lang/String;

    .line 380
    .line 381
    invoke-static {v15}, Lku;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v15

    .line 385
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    goto :goto_a

    .line 389
    :cond_12
    new-instance v7, Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object v9

    .line 398
    :cond_13
    :goto_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v15

    .line 402
    if-eqz v15, :cond_14

    .line 403
    .line 404
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v15

    .line 408
    move-object/from16 v16, v15

    .line 409
    .line 410
    check-cast v16, Ljava/lang/String;

    .line 411
    .line 412
    invoke-static/range {v16 .. v16}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 413
    .line 414
    .line 415
    move-result v16

    .line 416
    if-nez v16, :cond_13

    .line 417
    .line 418
    invoke-virtual {v7, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    goto :goto_b

    .line 422
    :cond_14
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v9

    .line 430
    if-eqz v9, :cond_18

    .line 431
    .line 432
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v9

    .line 436
    check-cast v9, Ljava/lang/String;

    .line 437
    .line 438
    invoke-virtual {v10, v9}, Lcw1;->β(Ljava/lang/String;)Lcw1;

    .line 439
    .line 440
    .line 441
    move-result-object v15

    .line 442
    if-eqz v15, :cond_15

    .line 443
    .line 444
    invoke-virtual {v15}, Lcw1;->ε()Z

    .line 445
    .line 446
    .line 447
    move-result v16

    .line 448
    if-eqz v16, :cond_15

    .line 449
    .line 450
    move-object/from16 p3, v6

    .line 451
    .line 452
    move-object v10, v15

    .line 453
    goto :goto_f

    .line 454
    :cond_15
    iget-object v15, v10, Lcw1;->ζ:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v15, Landroid/content/Context;

    .line 457
    .line 458
    iget-object v10, v10, Lcw1;->η:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v10, Landroid/net/Uri;

    .line 461
    .line 462
    const-string v8, "vnd.android.document/directory"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 463
    .line 464
    move-object/from16 p3, v6

    .line 465
    .line 466
    :try_start_2
    invoke-virtual {v15}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    invoke-static {v6, v10, v8, v9}, Landroid/provider/DocumentsContract;->createDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 471
    .line 472
    .line 473
    move-result-object v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 474
    goto :goto_d

    .line 475
    :catch_0
    const/4 v6, 0x0

    .line 476
    :goto_d
    if-eqz v6, :cond_16

    .line 477
    .line 478
    :try_start_3
    new-instance v8, Lcw1;

    .line 479
    .line 480
    const/4 v10, 0x1

    .line 481
    invoke-direct {v8, v15, v10, v6}, Lcw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    goto :goto_e

    .line 485
    :cond_16
    const/4 v8, 0x0

    .line 486
    :goto_e
    if-eqz v8, :cond_17

    .line 487
    .line 488
    move-object v10, v8

    .line 489
    :goto_f
    move-object/from16 v6, p3

    .line 490
    .line 491
    const/4 v8, 0x1

    .line 492
    goto :goto_c

    .line 493
    :cond_17
    new-instance v0, Ljava/lang/Exception;

    .line 494
    .line 495
    new-instance v6, Ljava/lang/StringBuilder;

    .line 496
    .line 497
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 498
    .line 499
    .line 500
    const-string v7, "\u65e0\u6cd5\u5728\u6388\u6743\u76ee\u5f55\u521b\u5efa\u5b50\u76ee\u5f55: "

    .line 501
    .line 502
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v6

    .line 512
    invoke-direct {v0, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    throw v0

    .line 516
    :catchall_2
    move-exception v0

    .line 517
    goto :goto_12

    .line 518
    :cond_18
    move-object/from16 p3, v6

    .line 519
    .line 520
    iget-object v6, v10, Lcw1;->ζ:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v6, Landroid/content/Context;

    .line 523
    .line 524
    iget-object v7, v10, Lcw1;->η:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v7, Landroid/net/Uri;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 527
    .line 528
    :try_start_4
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 529
    .line 530
    .line 531
    move-result-object v8

    .line 532
    invoke-static {v8, v7, v3, v4}, Landroid/provider/DocumentsContract;->createDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 533
    .line 534
    .line 535
    move-result-object v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 536
    goto :goto_10

    .line 537
    :catch_1
    const/4 v7, 0x0

    .line 538
    :goto_10
    if-eqz v7, :cond_19

    .line 539
    .line 540
    :try_start_5
    new-instance v8, Lcw1;

    .line 541
    .line 542
    const/4 v10, 0x1

    .line 543
    invoke-direct {v8, v6, v10, v7}, Lcw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    goto :goto_11

    .line 547
    :cond_19
    const/4 v8, 0x0

    .line 548
    :goto_11
    if-eqz v8, :cond_1b

    .line 549
    .line 550
    new-instance v6, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 553
    .line 554
    .line 555
    const-string v7, "[SAF] name="

    .line 556
    .line 557
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    const-string v7, ", subDir="

    .line 570
    .line 571
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-static {v13, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    iget-object v0, v8, Lcw1;->η:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v0, Landroid/net/Uri;

    .line 587
    .line 588
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    return-object v0

    .line 592
    :cond_1a
    move-object/from16 p3, v6

    .line 593
    .line 594
    :cond_1b
    new-instance v0, Ljava/lang/Exception;

    .line 595
    .line 596
    const-string v6, "\u6388\u6743\u76ee\u5f55\u4e0d\u53ef\u5199\u6216\u65e0\u6cd5\u521b\u5efa\u6587\u4ef6"

    .line 597
    .line 598
    invoke-direct {v0, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 602
    :goto_12
    if-nez v5, :cond_1c

    .line 603
    .line 604
    const-string v6, "SAF \u521b\u5efa\u6587\u4ef6\u5931\u8d25\uff0c\u6539\u7528\u5f53\u524d\u7528\u6237\u7a7a\u95f4 MediaStore"

    .line 605
    .line 606
    invoke-static {v13, v6, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 607
    .line 608
    .line 609
    goto :goto_13

    .line 610
    :cond_1c
    new-instance v1, Ljava/lang/Exception;

    .line 611
    .line 612
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    const-string v3, "\u6a21\u677f\u76ee\u5f55\u6388\u6743\u5df2\u5931\u6548\uff0c\u8bf7\u5728\u4e0b\u8f7d\u8def\u5f84\u8bbe\u7f6e\u4e2d\u91cd\u65b0\u9009\u62e9\u76ee\u5f55: "

    .line 617
    .line 618
    invoke-static {v3, v2}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 623
    .line 624
    .line 625
    throw v1

    .line 626
    :goto_13
    invoke-static/range {p3 .. p3}, Lev;->γ(Ljava/lang/String;)Ldv;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    if-eqz v5, :cond_25

    .line 631
    .line 632
    iget-object v6, v5, Lcv;->β:Ljava/lang/String;

    .line 633
    .line 634
    iget-object v7, v5, Lcv;->γ:Ljava/lang/String;

    .line 635
    .line 636
    iget-object v5, v5, Lcv;->α:Ljava/lang/String;

    .line 637
    .line 638
    const-string v8, "primary"

    .line 639
    .line 640
    invoke-static {v5, v8}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 641
    .line 642
    .line 643
    move-result v5

    .line 644
    if-eqz v5, :cond_1d

    .line 645
    .line 646
    if-nez v0, :cond_25

    .line 647
    .line 648
    :cond_1d
    :try_start_6
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 649
    .line 650
    .line 651
    move-result v0

    .line 652
    if-eqz v0, :cond_1e

    .line 653
    .line 654
    new-instance v0, Ljava/io/File;

    .line 655
    .line 656
    invoke-direct {v0, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    goto :goto_14

    .line 660
    :catchall_3
    move-exception v0

    .line 661
    goto :goto_16

    .line 662
    :cond_1e
    new-instance v0, Ljava/io/File;

    .line 663
    .line 664
    invoke-direct {v0, v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    :goto_14
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 668
    .line 669
    .line 670
    move-result v1

    .line 671
    if-nez v1, :cond_20

    .line 672
    .line 673
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 674
    .line 675
    .line 676
    move-result v1

    .line 677
    if-nez v1, :cond_20

    .line 678
    .line 679
    :cond_1f
    :goto_15
    const/4 v9, 0x0

    .line 680
    goto :goto_19

    .line 681
    :cond_20
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 682
    .line 683
    .line 684
    move-result v1

    .line 685
    if-eqz v1, :cond_1f

    .line 686
    .line 687
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    .line 688
    .line 689
    .line 690
    move-result v1

    .line 691
    if-nez v1, :cond_21

    .line 692
    .line 693
    goto :goto_15

    .line 694
    :cond_21
    new-instance v1, Ljava/io/File;

    .line 695
    .line 696
    invoke-direct {v1, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    if-nez v0, :cond_22

    .line 704
    .line 705
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-nez v0, :cond_22

    .line 710
    .line 711
    goto :goto_15

    .line 712
    :cond_22
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 713
    .line 714
    .line 715
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 716
    goto :goto_17

    .line 717
    :goto_16
    new-instance v1, Leo1;

    .line 718
    .line 719
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 720
    .line 721
    .line 722
    move-object v0, v1

    .line 723
    :goto_17
    instance-of v1, v0, Leo1;

    .line 724
    .line 725
    if-eqz v1, :cond_23

    .line 726
    .line 727
    const/4 v9, 0x0

    .line 728
    goto :goto_18

    .line 729
    :cond_23
    move-object v9, v0

    .line 730
    :goto_18
    check-cast v9, Landroid/net/Uri;

    .line 731
    .line 732
    :goto_19
    if-eqz v9, :cond_24

    .line 733
    .line 734
    return-object v9

    .line 735
    :cond_24
    new-instance v0, Ljava/lang/Exception;

    .line 736
    .line 737
    const-string v1, "\u8def\u5f84 "

    .line 738
    .line 739
    const-string v2, " \u9700\u8981\u5728\u4e0b\u8f7d\u8def\u5f84\u8bbe\u7f6e\u4e2d\u70b9\u51fb\u201c\u9009\u62e9\u76ee\u5f55\u201d\u5b8c\u6210\u6388\u6743"

    .line 740
    .line 741
    invoke-static {v1, v6, v14, v7, v2}, Llz1;->ξ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    throw v0

    .line 749
    :cond_25
    const-string v5, "download_path"

    .line 750
    .line 751
    invoke-static {v1, v5, v13}, Lqy0;->т(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v5

    .line 755
    if-nez v5, :cond_26

    .line 756
    .line 757
    move-object v5, v13

    .line 758
    :cond_26
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 759
    .line 760
    .line 761
    move-result-object v5

    .line 762
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v5

    .line 766
    const/4 v10, 0x1

    .line 767
    new-array v6, v10, [C

    .line 768
    .line 769
    const/4 v7, 0x0

    .line 770
    const/16 v8, 0x2f

    .line 771
    .line 772
    aput-char v8, v6, v7

    .line 773
    .line 774
    invoke-static {v5, v6}, Lq02;->Е(Ljava/lang/String;[C)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    new-array v6, v10, [C

    .line 779
    .line 780
    aput-char v8, v6, v7

    .line 781
    .line 782
    invoke-static {v5, v6}, Lq02;->Д(Ljava/lang/String;[C)Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v5

    .line 786
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 787
    .line 788
    .line 789
    move-result v6

    .line 790
    if-eqz v6, :cond_27

    .line 791
    .line 792
    new-instance v5, Ll91;

    .line 793
    .line 794
    const/4 v6, 0x0

    .line 795
    invoke-direct {v5, v2, v6}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 796
    .line 797
    .line 798
    goto/16 :goto_1a

    .line 799
    .line 800
    :cond_27
    sget-object v15, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 801
    .line 802
    sget-object v16, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    .line 803
    .line 804
    sget-object v17, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 805
    .line 806
    sget-object v18, Landroid/os/Environment;->DIRECTORY_DCIM:Ljava/lang/String;

    .line 807
    .line 808
    sget-object v19, Landroid/os/Environment;->DIRECTORY_MUSIC:Ljava/lang/String;

    .line 809
    .line 810
    sget-object v20, Landroid/os/Environment;->DIRECTORY_DOCUMENTS:Ljava/lang/String;

    .line 811
    .line 812
    filled-new-array/range {v15 .. v20}, [Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v6

    .line 816
    invoke-static {v6}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 817
    .line 818
    .line 819
    move-result-object v6

    .line 820
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 821
    .line 822
    .line 823
    move-result-object v6

    .line 824
    :cond_28
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 825
    .line 826
    .line 827
    move-result v9

    .line 828
    if-eqz v9, :cond_2b

    .line 829
    .line 830
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v9

    .line 834
    check-cast v9, Ljava/lang/String;

    .line 835
    .line 836
    invoke-virtual {v5, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 837
    .line 838
    .line 839
    move-result v10

    .line 840
    if-eqz v10, :cond_29

    .line 841
    .line 842
    new-instance v5, Ll91;

    .line 843
    .line 844
    const/4 v6, 0x0

    .line 845
    invoke-direct {v5, v9, v6}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    goto :goto_1a

    .line 849
    :cond_29
    new-instance v10, Ljava/lang/StringBuilder;

    .line 850
    .line 851
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v10

    .line 864
    const/4 v15, 0x1

    .line 865
    invoke-static {v5, v10, v15}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 866
    .line 867
    .line 868
    move-result v10

    .line 869
    if-eqz v10, :cond_28

    .line 870
    .line 871
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 872
    .line 873
    .line 874
    move-result v2

    .line 875
    add-int/2addr v2, v15

    .line 876
    invoke-virtual {v5, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v2

    .line 880
    new-array v5, v15, [C

    .line 881
    .line 882
    aput-char v8, v5, v7

    .line 883
    .line 884
    invoke-static {v2, v5}, Lq02;->В(Ljava/lang/String;[C)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 889
    .line 890
    .line 891
    move-result v5

    .line 892
    if-nez v5, :cond_2a

    .line 893
    .line 894
    new-instance v5, Ll91;

    .line 895
    .line 896
    invoke-direct {v5, v9, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    goto :goto_1a

    .line 900
    :cond_2a
    new-instance v5, Ll91;

    .line 901
    .line 902
    const/4 v10, 0x0

    .line 903
    invoke-direct {v5, v9, v10}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 904
    .line 905
    .line 906
    goto :goto_1a

    .line 907
    :cond_2b
    new-instance v6, Ll91;

    .line 908
    .line 909
    invoke-direct {v6, v2, v5}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    move-object v5, v6

    .line 913
    :goto_1a
    if-eqz v0, :cond_2c

    .line 914
    .line 915
    iget-object v2, v0, Ldv;->α:Ljava/lang/String;

    .line 916
    .line 917
    goto :goto_1b

    .line 918
    :cond_2c
    iget-object v2, v5, Ll91;->ε:Ljava/lang/Object;

    .line 919
    .line 920
    check-cast v2, Ljava/lang/String;

    .line 921
    .line 922
    :goto_1b
    if-eqz v0, :cond_2d

    .line 923
    .line 924
    iget-object v0, v0, Ldv;->β:Ljava/lang/String;

    .line 925
    .line 926
    invoke-static {v0}, Lev;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    goto :goto_1c

    .line 931
    :cond_2d
    iget-object v0, v5, Ll91;->ζ:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v0, Ljava/lang/String;

    .line 934
    .line 935
    invoke-static {v0}, Lev;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    invoke-static/range {p3 .. p3}, Lev;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object v5

    .line 943
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 944
    .line 945
    .line 946
    move-result v6

    .line 947
    if-eqz v6, :cond_2e

    .line 948
    .line 949
    move-object v0, v5

    .line 950
    goto :goto_1c

    .line 951
    :cond_2e
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 952
    .line 953
    .line 954
    move-result v6

    .line 955
    if-eqz v6, :cond_2f

    .line 956
    .line 957
    goto :goto_1c

    .line 958
    :cond_2f
    invoke-static {v0, v14, v5}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    :goto_1c
    sget-object v5, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    .line 963
    .line 964
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 965
    .line 966
    .line 967
    move-result v5

    .line 968
    if-eqz v5, :cond_30

    .line 969
    .line 970
    sget-object v5, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 971
    .line 972
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    goto/16 :goto_1d

    .line 976
    .line 977
    :cond_30
    sget-object v5, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 978
    .line 979
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 980
    .line 981
    .line 982
    move-result v5

    .line 983
    if-eqz v5, :cond_31

    .line 984
    .line 985
    sget-object v5, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 986
    .line 987
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    goto :goto_1d

    .line 991
    :cond_31
    sget-object v5, Landroid/os/Environment;->DIRECTORY_DCIM:Ljava/lang/String;

    .line 992
    .line 993
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 994
    .line 995
    .line 996
    move-result v5

    .line 997
    if-eqz v5, :cond_32

    .line 998
    .line 999
    sget-object v5, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 1000
    .line 1001
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1002
    .line 1003
    .line 1004
    goto :goto_1d

    .line 1005
    :cond_32
    sget-object v5, Landroid/os/Environment;->DIRECTORY_MUSIC:Ljava/lang/String;

    .line 1006
    .line 1007
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1008
    .line 1009
    .line 1010
    move-result v5

    .line 1011
    if-eqz v5, :cond_33

    .line 1012
    .line 1013
    sget-object v5, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 1014
    .line 1015
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1016
    .line 1017
    .line 1018
    goto :goto_1d

    .line 1019
    :cond_33
    sget-object v5, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 1020
    .line 1021
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1022
    .line 1023
    .line 1024
    move-result v5

    .line 1025
    if-eqz v5, :cond_34

    .line 1026
    .line 1027
    sget-object v5, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 1028
    .line 1029
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1030
    .line 1031
    .line 1032
    goto :goto_1d

    .line 1033
    :cond_34
    sget-object v5, Landroid/os/Environment;->DIRECTORY_DOCUMENTS:Ljava/lang/String;

    .line 1034
    .line 1035
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1036
    .line 1037
    .line 1038
    move-result v5

    .line 1039
    if-eqz v5, :cond_35

    .line 1040
    .line 1041
    sget-object v5, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 1042
    .line 1043
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1044
    .line 1045
    .line 1046
    goto :goto_1d

    .line 1047
    :cond_35
    invoke-static {v3}, Lqy0;->л(Ljava/lang/String;)Ljava/lang/String;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v5

    .line 1051
    const-string v6, "video"

    .line 1052
    .line 1053
    invoke-static {v5, v6, v7}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v6

    .line 1057
    if-eqz v6, :cond_36

    .line 1058
    .line 1059
    sget-object v5, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 1060
    .line 1061
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1062
    .line 1063
    .line 1064
    goto :goto_1d

    .line 1065
    :cond_36
    const-string v6, "image"

    .line 1066
    .line 1067
    invoke-static {v5, v6, v7}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v5

    .line 1071
    if-eqz v5, :cond_37

    .line 1072
    .line 1073
    sget-object v5, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 1074
    .line 1075
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    goto :goto_1d

    .line 1079
    :cond_37
    sget-object v5, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 1080
    .line 1081
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    :goto_1d
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1085
    .line 1086
    .line 1087
    move-result v6

    .line 1088
    if-eqz v6, :cond_38

    .line 1089
    .line 1090
    goto :goto_1e

    .line 1091
    :cond_38
    invoke-static {v2, v14, v0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v2

    .line 1095
    :goto_1e
    new-instance v0, Landroid/content/ContentValues;

    .line 1096
    .line 1097
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v0, v11, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1101
    .line 1102
    .line 1103
    const-string v6, "mime_type"

    .line 1104
    .line 1105
    invoke-virtual {v0, v6, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1106
    .line 1107
    .line 1108
    const-string v6, "relative_path"

    .line 1109
    .line 1110
    invoke-virtual {v0, v6, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1111
    .line 1112
    .line 1113
    const-string v6, "is_pending"

    .line 1114
    .line 1115
    const/4 v10, 0x1

    .line 1116
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v7

    .line 1120
    invoke-virtual {v0, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1121
    .line 1122
    .line 1123
    const-string v6, "[MediaStore] name="

    .line 1124
    .line 1125
    const-string v7, ", path="

    .line 1126
    .line 1127
    invoke-static {v6, v4, v12, v3, v7}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v3

    .line 1131
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v3

    .line 1138
    invoke-static {v13, v3}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v1

    .line 1145
    invoke-virtual {v1, v5, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    if-eqz v0, :cond_39

    .line 1150
    .line 1151
    return-object v0

    .line 1152
    :cond_39
    new-instance v0, Ljava/lang/Exception;

    .line 1153
    .line 1154
    const-string v1, "MediaStore \u63d2\u5165\u5931\u8d25: path="

    .line 1155
    .line 1156
    invoke-static {v1, v2}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v1

    .line 1160
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1161
    .line 1162
    .line 1163
    throw v0
.end method

.method public static ψ(Lqy0;[B)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    array-length p0, p1

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    array-length p0, p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p1, v0, p0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/Exception;

    .line 14
    .line 15
    const-string p1, "BitmapFactory \u89e3\u7801\u5931\u8d25"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0

    .line 21
    :cond_1
    new-instance p0, Ljava/lang/Exception;

    .line 22
    .line 23
    const-string p1, "\u56fe\u7247\u5185\u5bb9\u4e3a\u7a7a"

    .line 24
    .line 25
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p0
.end method

.method public static ω(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "file"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    new-instance p1, Ljava/io/File;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p0, p1, v0, v0}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public static А(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const-string v0, "download_show_notification"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lqy0;->р(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public static Б(Lf8;Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lzk0;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lzk0;-><init>(Lf8;Landroid/app/Activity;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static В(Lf8;)Ljava/util/List;
    .locals 7

    .line 1
    iget-object v0, p0, Lf8;->Ρ:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljz;->ε:Ljz;

    .line 6
    .line 7
    :cond_0
    new-instance v1, Luh0;

    .line 8
    .line 9
    const/16 v2, 0x15

    .line 10
    .line 11
    invoke-direct {v1, v2}, Luh0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x0

    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lg8;

    .line 39
    .line 40
    invoke-virtual {v2}, Lg8;->γ()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    const-string v4, "http"

    .line 47
    .line 48
    const/4 v5, 0x1

    .line 49
    invoke-static {v2, v4, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_2

    .line 54
    .line 55
    move-object v3, v2

    .line 56
    :cond_2
    if-eqz v3, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    invoke-static {v1}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    return-object v3

    .line 77
    :cond_4
    iget-object v1, p0, Lf8;->θ:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v2, p0, Lf8;->Ρ:Ljava/util/List;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    goto :goto_1

    .line 89
    :cond_5
    move v2, v3

    .line 90
    :goto_1
    iget-object p0, p0, Lf8;->δ:Ljava/util/List;

    .line 91
    .line 92
    if-eqz p0, :cond_6

    .line 93
    .line 94
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    const-string v4, ", pageMediaItems="

    .line 103
    .line 104
    const-string v5, ", rawImages="

    .line 105
    .line 106
    const-string v6, "structured image override awemeId="

    .line 107
    .line 108
    invoke-static {v2, v6, v1, v4, v5}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v2, ", selectedImages="

    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, Lqy0;->Ε(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-object v0
.end method

.method public static Г(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static Д(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string p0, "default"

    .line 16
    .line 17
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "download:"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static Е(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "download_show_top_notification"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Lqy0;->р(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {p3}, Lqy0;->Д(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    instance-of v0, p0, Landroid/app/Activity;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p0, Landroid/app/Activity;

    .line 25
    .line 26
    :goto_0
    move-object v6, p0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    goto :goto_0

    .line 30
    :goto_1
    if-nez v6, :cond_2

    .line 31
    .line 32
    :goto_2
    return-void

    .line 33
    :cond_2
    invoke-static {p3}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v5, Lf52;->ζ:Lf52;

    .line 38
    .line 39
    new-instance v0, Ld52;

    .line 40
    .line 41
    const/16 v4, 0x64

    .line 42
    .line 43
    const-wide/16 v7, 0x640

    .line 44
    .line 45
    move-object v2, p1

    .line 46
    move-object v3, p2

    .line 47
    invoke-direct/range {v0 .. v8}, Ld52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILf52;Landroid/app/Activity;J)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object p0, v0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string p2, "DYHelper: \u9876\u90e8\u901a\u77e5 complete \u5931\u8d25: "

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Lux;->ζ(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static Ж(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "download_show_top_notification"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Lqy0;->р(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {p2}, Lqy0;->Д(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const-string v2, "\u4e0b\u8f7d\u5931\u8d25"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    const-string v0, "\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    move-object p1, v0

    .line 24
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    instance-of v1, p0, Landroid/app/Activity;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    check-cast p0, Landroid/app/Activity;

    .line 32
    .line 33
    :goto_0
    move-object v6, p0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const/4 p0, 0x0

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    if-nez v6, :cond_3

    .line 38
    .line 39
    :goto_2
    return-void

    .line 40
    :cond_3
    invoke-static {p2}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_4

    .line 49
    .line 50
    move-object v3, v0

    .line 51
    goto :goto_3

    .line 52
    :cond_4
    move-object v3, p1

    .line 53
    :goto_3
    sget-object v5, Lf52;->η:Lf52;

    .line 54
    .line 55
    new-instance v0, Ld52;

    .line 56
    .line 57
    const/4 v4, -0x1

    .line 58
    const-wide/16 v7, 0x898

    .line 59
    .line 60
    invoke-direct/range {v0 .. v8}, Ld52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILf52;Landroid/app/Activity;J)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    move-object p0, v0

    .line 69
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance p1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string p2, "DYHelper: \u9876\u90e8\u901a\u77e5 error \u5931\u8d25: "

    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Lux;->ζ(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public static а(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, ";"

    .line 2
    .line 3
    invoke-static {p0, v0, p0}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    sparse-switch v0, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :sswitch_0
    const-string v0, "image/png"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :sswitch_1
    const-string v0, "image/jpg"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :sswitch_2
    const-string v0, "image/gif"

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :sswitch_3
    const-string v0, "image/bmp"

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :sswitch_4
    const-string v0, "image/webp"

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_0

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :sswitch_5
    const-string v0, "image/jpeg"

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_1

    .line 84
    .line 85
    :cond_0
    :goto_0
    const/4 p0, 0x0

    .line 86
    return p0

    .line 87
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 88
    return p0

    .line 89
    :sswitch_data_0
    .sparse-switch
        -0x58a7d764 -> :sswitch_5
        -0x58a21830 -> :sswitch_4
        -0x3468a12f -> :sswitch_3
        -0x34688ef0 -> :sswitch_2
        -0x346882d3 -> :sswitch_1
        -0x34686c8b -> :sswitch_0
    .end sparse-switch
.end method

.method public static б(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "download_show_top_notification"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Lqy0;->р(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    :try_start_0
    instance-of v0, p0, Landroid/app/Activity;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p0, Landroid/app/Activity;

    .line 16
    .line 17
    :goto_0
    move-object v5, p0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :goto_1
    if-eqz v5, :cond_2

    .line 22
    .line 23
    sget-object p0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 24
    .line 25
    invoke-static {p1}, Lqy0;->Д(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v0, Lby0;

    .line 34
    .line 35
    const/4 v4, -0x1

    .line 36
    const/4 v6, 0x1

    .line 37
    move-object v2, p1

    .line 38
    move-object v3, p2

    .line 39
    invoke-direct/range {v0 .. v6}, Lby0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/Activity;Z)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_2
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p0, v0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance p1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string p2, "DYHelper: \u9876\u90e8\u901a\u77e5 show \u5931\u8d25: "

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lux;->ζ(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "download_show_top_notification"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Lqy0;->р(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-gez p0, :cond_1

    .line 12
    .line 13
    const/4 p0, -0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/16 v0, 0x64

    .line 16
    .line 17
    mul-int/2addr p0, v0

    .line 18
    :try_start_0
    div-int/2addr p0, v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {p0, v1, v0}, Lj81;->μ(III)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    :goto_0
    sget-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {p2}, Lqy0;->Д(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p1, v0, p2, p3, p0}, Lcom/example/dyhelper/ui/а;->ν(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string p2, "DYHelper: \u9876\u90e8\u901a\u77e5 update \u5931\u8d25: "

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Lux;->ζ(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static г()Llu;
    .locals 17

    .line 1
    new-instance v0, Llu;

    .line 2
    .line 3
    new-instance v1, Lng;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const/16 v8, 0x1d

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    sget-object v3, Lpu0;->α:Lpu0;

    .line 10
    .line 11
    const-class v4, Lpu0;

    .line 12
    .line 13
    const-string v5, "isWatermarkVideoUrl"

    .line 14
    .line 15
    const-string v6, "isWatermarkVideoUrl(Ljava/lang/String;)Z"

    .line 16
    .line 17
    invoke-direct/range {v1 .. v8}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    new-instance v9, Lny0;

    .line 21
    .line 22
    const/4 v15, 0x0

    .line 23
    const/16 v16, 0x0

    .line 24
    .line 25
    const/4 v10, 0x1

    .line 26
    const-class v12, Lpu0;

    .line 27
    .line 28
    const-string v13, "videoUrlWatermarkScore"

    .line 29
    .line 30
    const-string v14, "videoUrlWatermarkScore(Ljava/lang/String;)I"

    .line 31
    .line 32
    move-object v11, v3

    .line 33
    invoke-direct/range {v9 .. v16}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1, v9}, Llu;-><init>(Lng;Lny0;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static д(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "file"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    filled-new-array {p1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p0, p1, v1, v1}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const-string v0, ""

    .line 35
    .line 36
    :cond_1
    const-string v2, "externalstorage.documents"

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static {v0, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_3

    .line 44
    .line 45
    const-string v2, "downloads"

    .line 46
    .line 47
    invoke-static {v0, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance v0, Landroid/content/ContentValues;

    .line 59
    .line 60
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v2, "is_pending"

    .line 64
    .line 65
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1, v0, v1, v1}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    :catchall_0
    :cond_3
    :goto_0
    return-void
.end method

.method public static е(Ljava/lang/String;Lf8;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lf8;->θ:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    if-nez p1, :cond_2

    .line 17
    .line 18
    :cond_1
    const-string p1, "no_aweme"

    .line 19
    .line 20
    :cond_2
    new-instance v5, Lhm;

    .line 21
    .line 22
    const/16 v0, 0x15

    .line 23
    .line 24
    invoke-direct {v5, v0}, Lhm;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const/16 v6, 0x1e

    .line 28
    .line 29
    const-string v1, "|"

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    move-object v0, p2

    .line 35
    invoke-static/range {v0 .. v6}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p0, "|"

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method public static з(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "//"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const-string v0, "https:"

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :cond_0
    const-string v0, "&amp;"

    .line 28
    .line 29
    const-string v1, "&"

    .line 30
    .line 31
    invoke-static {p0, v0, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static и(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string v1, ";"

    .line 5
    .line 6
    invoke-static {p0, v1, p0}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object p0, v0

    .line 31
    :goto_0
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-object p0

    .line 41
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static й(Lcw1;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-static {p1}, Lev;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "/"

    .line 6
    .line 7
    filled-new-array {v0}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-static {p1, v0, v1}, Lq02;->т(Ljava/lang/String;[Ljava/lang/String;I)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    move-object v2, v1

    .line 75
    check-cast v2, Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_1

    .line 82
    .line 83
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 90
    .line 91
    .line 92
    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_7

    .line 97
    .line 98
    invoke-static {v3}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Ljava/lang/String;

    .line 103
    .line 104
    iget-object v0, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Landroid/content/Context;

    .line 107
    .line 108
    iget-object v1, p0, Lcw1;->η:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Landroid/net/Uri;

    .line 111
    .line 112
    const-string v2, "_display_name"

    .line 113
    .line 114
    invoke-static {v0, v1, v2}, Lbd;->Ν(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-nez v0, :cond_3

    .line 119
    .line 120
    const-string v0, ""

    .line 121
    .line 122
    :cond_3
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_4

    .line 127
    .line 128
    invoke-static {p1, v0}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_4

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    sget-object v0, Lev;->α:Ljava/util/List;

    .line 136
    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_5

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_7

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {p1, v1}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_6

    .line 167
    .line 168
    :goto_3
    const/4 p1, 0x0

    .line 169
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_7
    :goto_4
    const/4 v8, 0x0

    .line 174
    const/16 v9, 0x3e

    .line 175
    .line 176
    const-string v4, "/"

    .line 177
    .line 178
    const/4 v5, 0x0

    .line 179
    const/4 v6, 0x0

    .line 180
    const/4 v7, 0x0

    .line 181
    invoke-static/range {v3 .. v9}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0
.end method

.method public static к(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "#"

    .line 10
    .line 11
    invoke-static {p0, v0, p0}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "?"

    .line 16
    .line 17
    invoke-static {p0, v0, p0}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static л(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v1, "image/vvic"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const-string p0, "image/heif"

    .line 22
    .line 23
    :cond_0
    return-object p0
.end method

.method public static м(Landroid/content/Context;ILjava/lang/String;Z)V
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string p3, "notification"

    .line 5
    .line 6
    invoke-virtual {p0, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p3, Landroid/app/NotificationManager;

    .line 14
    .line 15
    new-instance v0, Lx31;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lx31;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    const p0, 0x1080082

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Lx31;->ξ:Landroid/app/Notification;

    .line 24
    .line 25
    iput p0, v1, Landroid/app/Notification;->icon:I

    .line 26
    .line 27
    const-string p0, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 28
    .line 29
    invoke-static {p0}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iput-object p0, v0, Lx31;->ε:Ljava/lang/CharSequence;

    .line 34
    .line 35
    invoke-static {p2}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iput-object p0, v0, Lx31;->ζ:Ljava/lang/CharSequence;

    .line 40
    .line 41
    const/16 p0, 0x10

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Lx31;->γ(I)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    iput-boolean p0, v0, Lx31;->ο:Z

    .line 48
    .line 49
    invoke-virtual {v0}, Lx31;->α()Landroid/app/Notification;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p3, p1, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static н(Landroid/content/Context;Lh41;)Ljava/io/InputStream;
    .locals 4

    .line 1
    iget-object v0, p1, Lh41;->α:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, Lh41;->β:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    new-instance v2, Leo1;

    .line 20
    .line 21
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object v1, v2

    .line 25
    :goto_0
    instance-of v2, v1, Leo1;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    :cond_0
    check-cast v1, Landroid/net/Uri;

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_2
    new-instance p0, Ljava/lang/Exception;

    .line 59
    .line 60
    const-string v0, "\u65e0\u6cd5\u8bfb\u53d6\u5b98\u65b9\u5408\u5e76\u8f93\u51fa: "

    .line 61
    .line 62
    invoke-static {v0, p1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0

    .line 70
    :cond_3
    :goto_1
    new-instance p0, Ljava/io/File;

    .line 71
    .line 72
    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    const-wide/16 v2, 0x0

    .line 86
    .line 87
    cmp-long v0, v0, v2

    .line 88
    .line 89
    if-lez v0, :cond_4

    .line 90
    .line 91
    new-instance p1, Ljava/io/FileInputStream;

    .line 92
    .line 93
    invoke-direct {p1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 94
    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_4
    new-instance p0, Ljava/lang/Exception;

    .line 98
    .line 99
    const-string v0, "\u5b98\u65b9\u5408\u5e76\u8f93\u51fa\u6587\u4ef6\u4e0d\u5b58\u5728\u6216\u4e3a\u7a7a: "

    .line 100
    .line 101
    invoke-static {v0, p1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0
.end method

.method public static о(Ljava/lang/String;)Lky0;
    .locals 18

    .line 1
    const-string v0, "\u54cd\u5e94\u5185\u5bb9\u4e0d\u662f\u56fe\u7247: headerMime="

    .line 2
    .line 3
    const-string v1, "\u65e0\u6cd5\u8bc6\u522b\u56fe\u7247\u683c\u5f0f: sourceMime="

    .line 4
    .line 5
    invoke-static/range {p0 .. p0}, Lqy0;->з(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const/4 v2, 0x0

    .line 10
    const/16 v4, 0x1e

    .line 11
    .line 12
    invoke-static {v3, v2, v2, v4}, Lwx;->ζ(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lvx;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    :try_start_0
    iget-object v2, v4, Lvx;->ε:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2}, Lqy0;->и(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    iget-wide v13, v4, Lvx;->ζ:J

    .line 23
    .line 24
    iget-object v5, v4, Lvx;->δ:Ljava/io/BufferedInputStream;

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/io/BufferedInputStream;->markSupported()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_a

    .line 31
    .line 32
    const/high16 v2, 0x20000

    .line 33
    .line 34
    invoke-virtual {v5, v2}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 35
    .line 36
    .line 37
    const/16 v2, 0x40

    .line 38
    .line 39
    new-array v2, v2, [B

    .line 40
    .line 41
    invoke-virtual {v5, v2}, Ljava/io/InputStream;->read([B)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-lez v6, :cond_9

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/io/BufferedInputStream;->reset()V

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v6}, Ljx0;->φ([BI)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-static/range {p0 .. p0}, Lqy0;->Ψ(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-static {v2, v6}, Lqy0;->ο([BI)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    invoke-static {v2, v6}, Lqy0;->ξ([BI)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v15

    .line 66
    const/4 v11, 0x0

    .line 67
    if-eqz v7, :cond_0

    .line 68
    .line 69
    const-string v12, "text/"

    .line 70
    .line 71
    invoke-static {v7, v12, v11}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const/4 v11, 0x1

    .line 76
    if-eq v12, v11, :cond_8

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :cond_0
    :goto_0
    const-string v11, "application/json"

    .line 83
    .line 84
    invoke-static {v7, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-nez v11, :cond_8

    .line 89
    .line 90
    const-string v11, "{"

    .line 91
    .line 92
    const/4 v12, 0x0

    .line 93
    invoke-static {v10, v11, v12}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    if-nez v11, :cond_8

    .line 98
    .line 99
    const-string v11, "<"

    .line 100
    .line 101
    invoke-static {v10, v11, v12}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-nez v11, :cond_8

    .line 106
    .line 107
    const-string v11, "<html"

    .line 108
    .line 109
    const/4 v12, 0x1

    .line 110
    invoke-static {v10, v11, v12}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 111
    .line 112
    .line 113
    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    if-nez v11, :cond_8

    .line 115
    .line 116
    const-string v0, "image/jpeg"

    .line 117
    .line 118
    const-string v11, "image/"

    .line 119
    .line 120
    if-eqz v8, :cond_1

    .line 121
    .line 122
    move-object/from16 v16, v0

    .line 123
    .line 124
    const/4 v12, 0x0

    .line 125
    :try_start_1
    invoke-static {v8, v11, v12}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const/4 v12, 0x1

    .line 130
    if-ne v0, v12, :cond_2

    .line 131
    .line 132
    move-object/from16 v17, v3

    .line 133
    .line 134
    move-object v12, v8

    .line 135
    const/4 v0, 0x0

    .line 136
    goto :goto_1

    .line 137
    :cond_1
    move-object/from16 v16, v0

    .line 138
    .line 139
    :cond_2
    if-eqz v7, :cond_3

    .line 140
    .line 141
    move-object/from16 v17, v3

    .line 142
    .line 143
    const/4 v0, 0x0

    .line 144
    invoke-static {v7, v11, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-ne v3, v12, :cond_4

    .line 149
    .line 150
    move-object v12, v7

    .line 151
    goto :goto_1

    .line 152
    :cond_3
    move-object/from16 v17, v3

    .line 153
    .line 154
    const/4 v0, 0x0

    .line 155
    :cond_4
    if-nez v9, :cond_5

    .line 156
    .line 157
    move-object/from16 v12, v16

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_5
    move-object v12, v9

    .line 161
    :goto_1
    invoke-static {v12, v11, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_7

    .line 166
    .line 167
    invoke-static {v12}, Lqy0;->а(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    xor-int/lit8 v11, v0, 0x1

    .line 172
    .line 173
    if-nez v0, :cond_6

    .line 174
    .line 175
    move-object/from16 v9, v16

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    move-object v9, v12

    .line 179
    :goto_2
    const-string v0, "jpg"

    .line 180
    .line 181
    invoke-static {v9, v0}, Ljx0;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    new-instance v1, Lky0;

    .line 186
    .line 187
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    move-object v2, v1

    .line 192
    move-object/from16 v16, v10

    .line 193
    .line 194
    move-object/from16 v3, v17

    .line 195
    .line 196
    move-object v10, v0

    .line 197
    invoke-direct/range {v2 .. v16}, Lky0;-><init>(Ljava/lang/String;Lvx;Ljava/io/BufferedInputStream;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    return-object v2

    .line 201
    :cond_7
    new-instance v0, Ljava/lang/Exception;

    .line 202
    .line 203
    invoke-virtual {v1, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v0

    .line 211
    :cond_8
    new-instance v1, Ljava/lang/Exception;

    .line 212
    .line 213
    new-instance v2, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v1

    .line 229
    :cond_9
    new-instance v0, Ljava/lang/Exception;

    .line 230
    .line 231
    const-string v1, "\u8bfb\u53d6\u6587\u4ef6\u5934\u5931\u8d25"

    .line 232
    .line 233
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw v0

    .line 237
    :cond_a
    new-instance v0, Ljava/lang/Exception;

    .line 238
    .line 239
    const-string v1, "\u8f93\u5165\u6d41\u4e0d\u652f\u6301 mark/reset"

    .line 240
    .line 241
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 245
    :goto_3
    invoke-virtual {v4}, Lvx;->α()V

    .line 246
    .line 247
    .line 248
    throw v0
.end method

.method public static р(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "dyhelper_prefs"

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    return p0

    .line 30
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v1, "DYHelper: \u8bfb\u53d6\u5e03\u5c14\u914d\u7f6e\u5931\u8d25 key="

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, ", err="

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lux;->ζ(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return p2
.end method

.method public static с(ILandroid/content/Context;Ljava/lang/String;)I
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1, p2, p0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :catchall_0
    return p0

    .line 16
    :cond_0
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "dyhelper_prefs"

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1, p2, p0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 28
    .line 29
    .line 30
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 31
    return p0

    .line 32
    :catchall_1
    move-exception p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "DYHelper: \u8bfb\u53d6\u6574\u578b\u914d\u7f6e\u5931\u8d25 key="

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p2, ", err="

    .line 48
    .line 49
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lux;->ζ(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return p0
.end method

.method public static т(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    invoke-static {p1, p0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-lez p1, :cond_1

    .line 18
    .line 19
    return-object p0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "dyhelper_prefs"

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    if-nez p0, :cond_2

    .line 38
    .line 39
    :cond_1
    return-object p2

    .line 40
    :cond_2
    return-object p0

    .line 41
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, "DYHelper: \u8bfb\u53d6\u5b57\u7b26\u4e32\u914d\u7f6e\u5931\u8d25 key="

    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p1, ", err="

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Lux;->ζ(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object p2
.end method

.method public static у(Ljava/lang/String;)Lmu;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, ".mp4"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v2, "video/mp4"

    .line 21
    .line 22
    if-nez v0, :cond_a

    .line 23
    .line 24
    const-string v0, "format=mp4"

    .line 25
    .line 26
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_a

    .line 31
    .line 32
    const-string v0, "mime=video/mp4"

    .line 33
    .line 34
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_0
    const-string v0, ".mov"

    .line 43
    .line 44
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_9

    .line 49
    .line 50
    const-string v0, "format=mov"

    .line 51
    .line 52
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_9

    .line 57
    .line 58
    const-string v0, "quicktime"

    .line 59
    .line 60
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_1
    const-string v0, ".gif"

    .line 68
    .line 69
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_8

    .line 74
    .line 75
    const-string v0, "format=gif"

    .line 76
    .line 77
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    const-string v0, ".webp"

    .line 85
    .line 86
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_7

    .line 91
    .line 92
    const-string v0, "format=webp"

    .line 93
    .line 94
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const-string v0, ".png"

    .line 102
    .line 103
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_6

    .line 108
    .line 109
    const-string v0, "format=png"

    .line 110
    .line 111
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_4
    const-string v0, ".jpg"

    .line 119
    .line 120
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_5

    .line 125
    .line 126
    const-string v0, ".jpeg"

    .line 127
    .line 128
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_5

    .line 133
    .line 134
    const-string v0, "format=jpeg"

    .line 135
    .line 136
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_5

    .line 141
    .line 142
    const-string v0, "format=jpg"

    .line 143
    .line 144
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_a

    .line 149
    .line 150
    :cond_5
    const-string v2, "image/jpeg"

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    :goto_0
    const-string v2, "image/png"

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_7
    :goto_1
    const-string v2, "image/webp"

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_8
    :goto_2
    const-string v2, "image/gif"

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_9
    :goto_3
    const-string v2, "video/quicktime"

    .line 163
    .line 164
    :cond_a
    :goto_4
    const-string p0, "video"

    .line 165
    .line 166
    invoke-static {v2, p0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_b

    .line 171
    .line 172
    const-string v0, "mp4"

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_b
    const-string v0, "gif"

    .line 176
    .line 177
    :goto_5
    invoke-static {v2, v0}, Ljx0;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v2, p0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-eqz p0, :cond_c

    .line 186
    .line 187
    sget-object p0, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_c
    sget-object p0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 191
    .line 192
    :goto_6
    new-instance v1, Lmu;

    .line 193
    .line 194
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-direct {v1, v2, v0, p0}, Lmu;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    return-object v1
.end method

.method public static ф(Ldy;ZZ)Lwy;
    .locals 12

    .line 1
    iget-object v0, p0, Ldy;->α:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {v0, v1}, Ljx0;->φ([BI)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Ldy;->β:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {p0}, Lqy0;->Ψ(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const-string v1, "image/jpeg"

    .line 19
    .line 20
    :cond_0
    const-string p0, "jpg"

    .line 21
    .line 22
    invoke-static {v1, p0}, Ljx0;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    array-length v2, v0

    .line 27
    const/high16 v3, 0x20000

    .line 28
    .line 29
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v2, "image/"

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    move-object v2, v1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v2, 0x0

    .line 49
    :goto_0
    if-nez v2, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-object v1, v2

    .line 53
    :goto_1
    const-string v2, ";"

    .line 54
    .line 55
    invoke-static {v1, v2, v1}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 68
    .line 69
    invoke-static {v4, v1, v4}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const-string v6, "image/vvic"

    .line 81
    .line 82
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    const-string v6, "image/heif"

    .line 87
    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    move-object v1, v6

    .line 91
    :cond_3
    new-instance v5, Lwy;

    .line 92
    .line 93
    invoke-static {v1, p0}, Ljx0;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    sget-object v7, Ldz;->ε:Ldz;

    .line 98
    .line 99
    invoke-direct {v5, v1, p0, v7}, Lwy;-><init>(Ljava/lang/String;Ljava/lang/String;Ldz;)V

    .line 100
    .line 101
    .line 102
    if-nez p1, :cond_4

    .line 103
    .line 104
    goto/16 :goto_6

    .line 105
    .line 106
    :cond_4
    const-string p0, "image/webp"

    .line 107
    .line 108
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    const-string v7, "image/gif"

    .line 113
    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    invoke-static {v0}, Lxb;->Ι([B)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    new-instance p0, Lwy;

    .line 123
    .line 124
    const-string p1, "gif"

    .line 125
    .line 126
    sget-object p2, Ldz;->η:Ldz;

    .line 127
    .line 128
    invoke-direct {p0, v7, p1, p2}, Lwy;-><init>(Ljava/lang/String;Ljava/lang/String;Ldz;)V

    .line 129
    .line 130
    .line 131
    return-object p0

    .line 132
    :cond_5
    if-nez p2, :cond_11

    .line 133
    .line 134
    invoke-static {v1, v2, v1}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    const-string v1, "image/png"

    .line 158
    .line 159
    const/4 v2, 0x0

    .line 160
    sparse-switch p2, :sswitch_data_0

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :sswitch_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-nez p0, :cond_6

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_6
    const-string p0, "acTL"

    .line 172
    .line 173
    invoke-static {p0, v0}, Lxb;->ο(Ljava/lang/String;[B)Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    goto/16 :goto_5

    .line 178
    .line 179
    :sswitch_1
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-nez p0, :cond_f

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :sswitch_2
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-nez p0, :cond_7

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_7
    invoke-static {v0}, Lxb;->Ι([B)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    goto/16 :goto_5

    .line 198
    .line 199
    :sswitch_3
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-nez p0, :cond_9

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :sswitch_4
    const-string p0, "image/heic"

    .line 207
    .line 208
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    if-nez p0, :cond_9

    .line 213
    .line 214
    :cond_8
    :goto_2
    move v3, v2

    .line 215
    goto/16 :goto_5

    .line 216
    .line 217
    :cond_9
    array-length p0, v0

    .line 218
    const/16 p1, 0x10

    .line 219
    .line 220
    if-lt p0, p1, :cond_8

    .line 221
    .line 222
    const/4 p0, 0x4

    .line 223
    invoke-static {v0, p0}, Lxb;->κ([BI)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    const-string v4, "ftyp"

    .line 228
    .line 229
    invoke-virtual {p2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result p2

    .line 233
    if-nez p2, :cond_a

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_a
    array-length p2, v0

    .line 237
    const/16 v4, 0x8

    .line 238
    .line 239
    if-ge p2, p0, :cond_b

    .line 240
    .line 241
    const-wide/16 v6, -0x1

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_b
    aget-byte p0, v0, v2

    .line 245
    .line 246
    int-to-long v6, p0

    .line 247
    const-wide/16 v8, 0xff

    .line 248
    .line 249
    and-long/2addr v6, v8

    .line 250
    const/16 p0, 0x18

    .line 251
    .line 252
    shl-long/2addr v6, p0

    .line 253
    aget-byte p0, v0, v3

    .line 254
    .line 255
    int-to-long v10, p0

    .line 256
    and-long/2addr v10, v8

    .line 257
    shl-long/2addr v10, p1

    .line 258
    or-long/2addr v6, v10

    .line 259
    const/4 p0, 0x2

    .line 260
    aget-byte p0, v0, p0

    .line 261
    .line 262
    int-to-long v10, p0

    .line 263
    and-long/2addr v10, v8

    .line 264
    shl-long/2addr v10, v4

    .line 265
    or-long/2addr v6, v10

    .line 266
    const/4 p0, 0x3

    .line 267
    aget-byte p0, v0, p0

    .line 268
    .line 269
    int-to-long v10, p0

    .line 270
    and-long/2addr v8, v10

    .line 271
    or-long/2addr v6, v8

    .line 272
    :goto_3
    const-wide/16 v8, 0x10

    .line 273
    .line 274
    cmp-long p0, v6, v8

    .line 275
    .line 276
    if-ltz p0, :cond_8

    .line 277
    .line 278
    const-wide/32 v8, 0x7fffffff

    .line 279
    .line 280
    .line 281
    cmp-long p0, v6, v8

    .line 282
    .line 283
    if-lez p0, :cond_c

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_c
    array-length p0, v0

    .line 287
    long-to-int p2, v6

    .line 288
    invoke-static {p0, p2}, Ljava/lang/Math;->min(II)I

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    invoke-static {v0, v4}, Lxb;->κ([BI)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p2

    .line 296
    const-string v4, "msf1"

    .line 297
    .line 298
    invoke-virtual {p2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result p2

    .line 302
    if-eqz p2, :cond_d

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_d
    :goto_4
    add-int/lit8 p2, p1, 0x4

    .line 306
    .line 307
    if-gt p2, p0, :cond_8

    .line 308
    .line 309
    invoke-static {v0, p1}, Lxb;->κ([BI)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    if-eqz p1, :cond_e

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_e
    move p1, p2

    .line 321
    goto :goto_4

    .line 322
    :cond_f
    :goto_5
    if-eqz v3, :cond_10

    .line 323
    .line 324
    goto :goto_6

    .line 325
    :cond_10
    new-instance p0, Lwy;

    .line 326
    .line 327
    const-string p1, "png"

    .line 328
    .line 329
    sget-object p2, Ldz;->ζ:Ldz;

    .line 330
    .line 331
    invoke-direct {p0, v1, p1, p2}, Lwy;-><init>(Ljava/lang/String;Ljava/lang/String;Ldz;)V

    .line 332
    .line 333
    .line 334
    return-object p0

    .line 335
    :cond_11
    :goto_6
    return-object v5

    .line 336
    nop

    .line 337
    :sswitch_data_0
    .sparse-switch
        -0x58a8e8f5 -> :sswitch_4
        -0x58a8e8f2 -> :sswitch_3
        -0x58a21830 -> :sswitch_2
        -0x34688ef0 -> :sswitch_1
        -0x34686c8b -> :sswitch_0
    .end sparse-switch
.end method

.method public static х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lγ;->κ()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :pswitch_0
    sget-object p0, Lgv;->λ:Lgv;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_1
    sget-object p0, Lgv;->κ:Lgv;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_2
    sget-object p0, Lgv;->ι:Lgv;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_3
    sget-object p0, Lgv;->θ:Lgv;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_4
    sget-object p0, Lgv;->η:Lgv;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_5
    sget-object p0, Lgv;->ζ:Lgv;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_6
    sget-object p0, Lgv;->ε:Lgv;

    .line 35
    .line 36
    :goto_0
    invoke-static {p1, p2, p0, p4}, Lpd2;->Ξ(Landroid/content/Context;Ljava/lang/Object;Lgv;Ljava/lang/String;)Lfv;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/16 v0, 0x8c

    .line 12
    .line 13
    if-gt p0, v0, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-static {p1, v0}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string p1, "..."

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static я(Landroid/content/Context;)Z
    .locals 3

    .line 1
    const-string v0, "live_photo_merge_after_download"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-static {p0, v0, v1}, Lqy0;->р(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    return p0

    .line 20
    :catchall_0
    invoke-static {p0, v0, v1}, Lqy0;->р(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method


# virtual methods
.method public final Β(Lf8;Landroid/app/Activity;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lqy0;->В(Lf8;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p1, Lf8;->δ:Ljava/util/List;

    .line 14
    .line 15
    :cond_0
    iget-object v1, p1, Lf8;->θ:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v5, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v6}, Lln0;->Ψ(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    const-string v7, "http"

    .line 52
    .line 53
    invoke-static {v6, v7, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_1

    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    invoke-static {v6}, Lln0;->Ω(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-nez v8, :cond_1

    .line 70
    .line 71
    invoke-virtual {v2, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_1

    .line 76
    .line 77
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const-string v2, "DYHelper"

    .line 86
    .line 87
    if-eq v4, v0, :cond_3

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const-string v6, ", raw="

    .line 94
    .line 95
    const-string v7, ", dedup="

    .line 96
    .line 97
    const-string v8, "[MEDIA-DEDUPE] label=all_images, awemeId="

    .line 98
    .line 99
    invoke-static {v4, v8, v1, v6, v7}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v2, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    const-string p0, "\u672a\u627e\u5230\u56fe\u7247\u94fe\u63a5"

    .line 120
    .line 121
    invoke-static {p2, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_4
    invoke-static {p2}, Lyh;->у(Landroid/content/Context;)Liu;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v1, v0, Liu;->β:Ljava/lang/String;

    .line 130
    .line 131
    if-eqz v1, :cond_6

    .line 132
    .line 133
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_5

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_5
    invoke-virtual {v0}, Liu;->α()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_6

    .line 145
    .line 146
    const-string v0, "[DOWNLOAD-STORAGE] \u5f53\u524d\u7a7a\u95f4\u65e0\u53ef\u7528 SAF \u6388\u6743\uff0c\u6539\u7528 MediaStore"

    .line 147
    .line 148
    invoke-static {v2, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_6
    :goto_1
    const-string v0, "jpg"

    .line 152
    .line 153
    invoke-static {p2, p1, v0}, Lqy0;->γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget-object v1, Ljy0;->η:Ljy0;

    .line 162
    .line 163
    invoke-static {p0, p2, p1, v1, v0}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    if-gt p0, v3, :cond_7

    .line 172
    .line 173
    const-string p0, "\u5c06\u4fdd\u5b58 1 \u5f20\u56fe\u7247\u3002"

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_7
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    const-string v0, "\u5c06\u4fdd\u5b58 "

    .line 181
    .line 182
    const-string v1, " \u5f20\u56fe\u7247\uff0c\u6587\u4ef6\u540d\u4f1a\u81ea\u52a8\u8ffd\u52a0 _img1\u3001_img2\u3002"

    .line 183
    .line 184
    invoke-static {v0, p0, v1}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    :goto_2
    iget-object v0, v7, Lfv;->β:Ljava/lang/String;

    .line 189
    .line 190
    new-instance v3, Lti0;

    .line 191
    .line 192
    const/4 v8, 0x1

    .line 193
    move-object v4, p1

    .line 194
    move-object v6, p2

    .line 195
    invoke-direct/range {v3 .. v8}, Lti0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 196
    .line 197
    .line 198
    const-string p1, "\u786e\u8ba4\u56fe\u7247\u6587\u4ef6\u540d"

    .line 199
    .line 200
    invoke-static {v6, p1, p0, v0, v3}, Lqy0;->ρ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)V

    .line 201
    .line 202
    .line 203
    return-void
.end method

.method public final Γ(Lf8;Landroid/app/Activity;)V
    .locals 13

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lf8;->δ()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    if-eqz v5, :cond_0

    .line 12
    .line 13
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    move-object v1, p2

    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_1
    invoke-static {p2}, Lyh;->у(Landroid/content/Context;)Liu;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, v0, Liu;->β:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-virtual {v0}, Liu;->α()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    const-string v0, "DYHelper"

    .line 44
    .line 45
    const-string v1, "[DOWNLOAD-STORAGE] \u5f53\u524d\u7a7a\u95f4\u65e0\u53ef\u7528 SAF \u6388\u6743\uff0c\u6539\u7528 MediaStore"

    .line 46
    .line 47
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_0
    const-string v0, "audio_download_name_pattern"

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-static {v1, p2, v0}, Lqy0;->с(ILandroid/content/Context;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-static {}, Lku;->η()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v3, p1, Lf8;->α:Ljava/lang/String;

    .line 62
    .line 63
    const/16 v4, 0x14

    .line 64
    .line 65
    invoke-static {v3, v4}, Lku;->ζ(Ljava/lang/String;I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    iget-object v4, p1, Lf8;->Β:Ljava/lang/String;

    .line 70
    .line 71
    if-nez v4, :cond_4

    .line 72
    .line 73
    const-string v4, ""

    .line 74
    .line 75
    :cond_4
    const/16 v6, 0x1e

    .line 76
    .line 77
    invoke-static {v4, v6}, Lku;->ζ(Ljava/lang/String;I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iget-object v6, p1, Lf8;->θ:Ljava/lang/String;

    .line 82
    .line 83
    if-nez v6, :cond_5

    .line 84
    .line 85
    const-string v6, "unknown"

    .line 86
    .line 87
    :cond_5
    iget-object v7, p1, Lf8;->Α:Ljava/util/List;

    .line 88
    .line 89
    const-string v8, "mp3"

    .line 90
    .line 91
    const-string v9, ".aac"

    .line 92
    .line 93
    if-eqz v7, :cond_8

    .line 94
    .line 95
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-eqz v10, :cond_6

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    :cond_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-eqz v10, :cond_8

    .line 111
    .line 112
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    check-cast v10, Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v10, v9, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    if-eqz v10, :cond_7

    .line 123
    .line 124
    const-string v7, "aac"

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_8
    :goto_1
    move-object v7, v8

    .line 128
    :goto_2
    const-string v10, "."

    .line 129
    .line 130
    const-string v11, "_"

    .line 131
    .line 132
    if-eqz v0, :cond_c

    .line 133
    .line 134
    const/4 v12, 0x1

    .line 135
    if-eq v0, v12, :cond_b

    .line 136
    .line 137
    const/4 v4, 0x2

    .line 138
    if-eq v0, v4, :cond_a

    .line 139
    .line 140
    const/4 v4, 0x3

    .line 141
    if-eq v0, v4, :cond_9

    .line 142
    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    goto :goto_3

    .line 168
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    goto :goto_3

    .line 193
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    goto :goto_3

    .line 218
    :cond_b
    invoke-static {v3, v11, v4, v11, v2}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0, v10, v7}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    goto :goto_3

    .line 227
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    :goto_3
    invoke-static {v0}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    sget-object v2, Ljy0;->κ:Ljy0;

    .line 256
    .line 257
    invoke-static {p0, p2, p1, v2, v0}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    sget-object p0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 262
    .line 263
    invoke-virtual {v5, p0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-static {p0, v9, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_d

    .line 275
    .line 276
    const-string p0, "audio/aac"

    .line 277
    .line 278
    :goto_4
    move-object v3, p0

    .line 279
    goto :goto_5

    .line 280
    :cond_d
    const-string v0, ".m4a"

    .line 281
    .line 282
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_e

    .line 287
    .line 288
    const-string p0, "audio/mp4"

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_e
    const-string v0, ".ogg"

    .line 292
    .line 293
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-eqz v0, :cond_f

    .line 298
    .line 299
    const-string p0, "audio/ogg"

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_f
    const-string v0, ".wav"

    .line 303
    .line 304
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_10

    .line 309
    .line 310
    const-string p0, "audio/wav"

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_10
    const-string v0, ".flac"

    .line 314
    .line 315
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 316
    .line 317
    .line 318
    move-result p0

    .line 319
    if-eqz p0, :cond_11

    .line 320
    .line 321
    const-string p0, "audio/flac"

    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_11
    const-string p0, "audio/mpeg"

    .line 325
    .line 326
    goto :goto_4

    .line 327
    :goto_5
    invoke-static {v3, v8}, Ljx0;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    iget-object v0, v2, Lfv;->β:Ljava/lang/String;

    .line 332
    .line 333
    invoke-static {v0, v10, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    new-instance v0, Lm90;

    .line 338
    .line 339
    const/4 v6, 0x2

    .line 340
    move-object v4, p1

    .line 341
    move-object v1, p2

    .line 342
    invoke-direct/range {v0 .. v6}, Lm90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 343
    .line 344
    .line 345
    invoke-static {v1, p0, v0}, Lqy0;->τ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :goto_6
    const-string p0, "\u672a\u627e\u5230\u97f3\u9891\u94fe\u63a5"

    .line 350
    .line 351
    invoke-static {v1, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    return-void
.end method

.method public final Ζ(Ljava/io/File;Ljava/lang/String;)V
    .locals 7

    .line 1
    sget-object v0, Lwx;->α:Lt41;

    .line 2
    .line 3
    invoke-static {p2}, Lqy0;->з(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x0

    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    invoke-static {p2, v0, v0, v1}, Lwx;->ζ(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lvx;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    :try_start_0
    iget-object v0, p2, Lvx;->δ:Ljava/io/BufferedInputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    :try_start_1
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    .line 19
    .line 20
    .line 21
    const/16 v2, 0x2000

    .line 22
    .line 23
    :try_start_2
    new-array v2, v2, [B

    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, -0x1

    .line 30
    const/4 v5, 0x0

    .line 31
    if-eq v3, v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v2, v5, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 41
    .line 42
    .line 43
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    :try_start_3
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    .line 45
    .line 46
    .line 47
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    array-length v0, v2

    .line 54
    if-eqz v0, :cond_8

    .line 55
    .line 56
    array-length v0, v2

    .line 57
    const/16 v1, 0x40

    .line 58
    .line 59
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v1, p2, Lvx;->ε:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v1}, Lqy0;->и(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v2, v0}, Ljx0;->φ([BI)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v2, v0}, Lqy0;->ο([BI)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    if-eqz v1, :cond_1

    .line 98
    .line 99
    const-string v4, "text/"

    .line 100
    .line 101
    invoke-static {v1, v4, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    const/4 v6, 0x1

    .line 106
    if-eq v4, v6, :cond_7

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catchall_1
    move-exception p0

    .line 110
    goto/16 :goto_6

    .line 111
    .line 112
    :cond_1
    :goto_1
    const-string v4, "application/json"

    .line 113
    .line 114
    invoke-static {v1, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_7

    .line 119
    .line 120
    const-string v4, "{"

    .line 121
    .line 122
    invoke-static {v0, v4, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-nez v4, :cond_7

    .line 127
    .line 128
    const-string v4, "["

    .line 129
    .line 130
    invoke-static {v0, v4, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_7

    .line 135
    .line 136
    const-string v4, "<"

    .line 137
    .line 138
    invoke-static {v0, v4, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-nez v4, :cond_7

    .line 143
    .line 144
    const-string v4, "<html"

    .line 145
    .line 146
    invoke-static {v0, v4, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 147
    .line 148
    .line 149
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 150
    if-nez v0, :cond_7

    .line 151
    .line 152
    :try_start_5
    invoke-static {p0, v2}, Lqy0;->ψ(Lqy0;[B)Landroid/graphics/Bitmap;

    .line 153
    .line 154
    .line 155
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 156
    :try_start_6
    new-instance v0, Ljava/io/FileOutputStream;

    .line 157
    .line 158
    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 159
    .line 160
    .line 161
    :try_start_7
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 162
    .line 163
    const/16 v2, 0x5f

    .line 164
    .line 165
    invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_4

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 172
    .line 173
    .line 174
    :try_start_8
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 175
    .line 176
    .line 177
    :try_start_9
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-nez v0, :cond_2

    .line 182
    .line 183
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 184
    .line 185
    .line 186
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-eqz p0, :cond_3

    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 193
    .line 194
    .line 195
    move-result-wide p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 196
    const-wide/16 v0, 0x0

    .line 197
    .line 198
    cmp-long p0, p0, v0

    .line 199
    .line 200
    if-lez p0, :cond_3

    .line 201
    .line 202
    invoke-virtual {p2}, Lvx;->α()V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_3
    :try_start_a
    new-instance p0, Ljava/lang/Exception;

    .line 207
    .line 208
    const-string p1, "JPEG \u8f93\u51fa\u4e3a\u7a7a"

    .line 209
    .line 210
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 214
    :catchall_2
    move-exception p1

    .line 215
    goto :goto_3

    .line 216
    :catchall_3
    move-exception p1

    .line 217
    goto :goto_2

    .line 218
    :cond_4
    :try_start_b
    new-instance p1, Ljava/lang/Exception;

    .line 219
    .line 220
    const-string v1, "JPEG \u538b\u7f29\u5931\u8d25"

    .line 221
    .line 222
    invoke-direct {p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 226
    :goto_2
    :try_start_c
    throw p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 227
    :catchall_4
    move-exception v1

    .line 228
    :try_start_d
    invoke-static {v0, p1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 232
    :goto_3
    :try_start_e
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-nez v0, :cond_5

    .line 237
    .line 238
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 239
    .line 240
    .line 241
    :cond_5
    throw p1

    .line 242
    :catchall_5
    move-exception p0

    .line 243
    const-string v0, "image/jpeg"

    .line 244
    .line 245
    invoke-static {v3, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_6

    .line 250
    .line 251
    new-instance p0, Ljava/io/FileOutputStream;

    .line 252
    .line 253
    invoke-direct {p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 254
    .line 255
    .line 256
    :try_start_f
    invoke-virtual {p0, v2}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 257
    .line 258
    .line 259
    :try_start_10
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 260
    .line 261
    .line 262
    invoke-virtual {p2}, Lvx;->α()V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :catchall_6
    move-exception p1

    .line 267
    :try_start_11
    throw p1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 268
    :catchall_7
    move-exception v0

    .line 269
    :try_start_12
    invoke-static {p0, p1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    throw v0

    .line 273
    :cond_6
    new-instance p1, Ljava/lang/Exception;

    .line 274
    .line 275
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    new-instance v0, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    const-string v1, "\u65e0\u6cd5\u89e3\u7801\u56fe\u7247\u7528\u4e8e\u5408\u5e76: "

    .line 285
    .line 286
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw p1

    .line 300
    :cond_7
    new-instance p0, Ljava/lang/Exception;

    .line 301
    .line 302
    new-instance p1, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    const-string v0, "\u54cd\u5e94\u5185\u5bb9\u4e0d\u662f\u56fe\u7247: mime="

    .line 308
    .line 309
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw p0

    .line 323
    :cond_8
    new-instance p0, Ljava/lang/Exception;

    .line 324
    .line 325
    const-string p1, "\u56fe\u7247\u5185\u5bb9\u4e3a\u7a7a"

    .line 326
    .line 327
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    throw p0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 331
    :catchall_8
    move-exception p0

    .line 332
    goto :goto_5

    .line 333
    :goto_4
    :try_start_13
    throw p0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 334
    :catchall_9
    move-exception p1

    .line 335
    :try_start_14
    invoke-static {v1, p0}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 336
    .line 337
    .line 338
    throw p1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 339
    :goto_5
    :try_start_15
    throw p0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 340
    :catchall_a
    move-exception p1

    .line 341
    :try_start_16
    invoke-static {v0, p0}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    throw p1
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    .line 345
    :goto_6
    invoke-virtual {p2}, Lvx;->α()V

    .line 346
    .line 347
    .line 348
    throw p0
.end method

.method public final Η(Landroid/content/Context;Lf8;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v10, p4

    .line 4
    .line 5
    move-object/from16 v0, p8

    .line 6
    .line 7
    const-string v11, "DYHelper"

    .line 8
    .line 9
    const-string v12, "[LIVEPHOTO-ANIM-FAIL] file="

    .line 10
    .line 11
    const-string v2, "[LIVEPHOTO-ANIM-DL] awemeId="

    .line 12
    .line 13
    const/4 v13, 0x0

    .line 14
    :try_start_0
    invoke-static/range {p3 .. p3}, Lqy0;->у(Ljava/lang/String;)Lmu;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v14, v3, Lmu;->γ:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v3, v3, Lmu;->α:Ljava/lang/String;

    .line 21
    .line 22
    move-object/from16 v4, p2

    .line 23
    .line 24
    iget-object v4, v4, Lf8;->θ:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const-string v5, ""

    .line 29
    .line 30
    :goto_0
    move-object/from16 v15, p0

    .line 31
    .line 32
    move-object/from16 v6, p3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object v2, v13

    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_0
    move-object v5, v0

    .line 40
    goto :goto_0

    .line 41
    :goto_1
    invoke-static {v15, v6}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    new-instance v8, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, ", mime="

    .line 54
    .line 55
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v2, ", file="

    .line 62
    .line 63
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v2, ", dir="

    .line 70
    .line 71
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, ", url="

    .line 78
    .line 79
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {v11, v2}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const-string v2, "video/mp4"

    .line 93
    .line 94
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_3

    .line 99
    .line 100
    invoke-static {v6}, Ljx0;->Ν(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_1
    invoke-static {v1, v0, v10, v3, v14}, Lqy0;->χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 108
    .line 109
    .line 110
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0, v9}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-eqz v0, :cond_2

    .line 120
    .line 121
    invoke-virtual {v15}, Lqy0;->ж()I

    .line 122
    .line 123
    .line 124
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    const/4 v8, 0x0

    .line 126
    const/4 v7, 0x0

    .line 127
    const/4 v6, 0x0

    .line 128
    move/from16 v5, p5

    .line 129
    .line 130
    move-object/from16 v4, p7

    .line 131
    .line 132
    move-object v2, v1

    .line 133
    move-object v1, v0

    .line 134
    move-object/from16 v0, p3

    .line 135
    .line 136
    :try_start_2
    invoke-static/range {v0 .. v8}, Lqy0;->Ο(Ljava/lang/String;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;ZLjava/lang/String;Le80;Le80;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 137
    .line 138
    .line 139
    move-object v1, v2

    .line 140
    :try_start_3
    invoke-static {v1, v9}, Lqy0;->д(Landroid/content/Context;Landroid/net/Uri;)V

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :catchall_1
    move-exception v0

    .line 145
    :goto_2
    move-object v2, v13

    .line 146
    move-object v13, v9

    .line 147
    goto :goto_5

    .line 148
    :catchall_2
    move-exception v0

    .line 149
    move-object v1, v2

    .line 150
    goto :goto_2

    .line 151
    :cond_2
    new-instance v0, Ljava/lang/Exception;

    .line 152
    .line 153
    const-string v2, "\u65e0\u6cd5\u6253\u5f00\u8f93\u51fa\u6d41"

    .line 154
    .line 155
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 159
    :cond_3
    :goto_3
    :try_start_4
    const-string v2, "dyhelper_livephoto_anim_"

    .line 160
    .line 161
    const-string v3, ".mp4"

    .line 162
    .line 163
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-static {v2, v3, v4}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 168
    .line 169
    .line 170
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 171
    :try_start_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v15}, Lqy0;->ж()I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    new-instance v8, Lcc;

    .line 179
    .line 180
    const/4 v3, 0x5

    .line 181
    move-object/from16 v5, p7

    .line 182
    .line 183
    invoke-direct {v8, v3, v5}, Lcc;-><init>(ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    new-instance v9, Lig;

    .line 187
    .line 188
    const/16 v3, 0x1a

    .line 189
    .line 190
    invoke-direct {v9, v3}, Lig;-><init>(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 191
    .line 192
    .line 193
    move/from16 v6, p5

    .line 194
    .line 195
    move-object/from16 v7, p6

    .line 196
    .line 197
    move-object v3, v2

    .line 198
    move-object/from16 v2, p3

    .line 199
    .line 200
    :try_start_6
    invoke-static/range {v1 .. v9}, Lqy0;->Σ(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;ILjava/lang/String;ZLjava/lang/String;Le80;Le80;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 201
    .line 202
    .line 203
    move-object/from16 v1, p1

    .line 204
    .line 205
    move-object v2, v3

    .line 206
    move-object v4, v10

    .line 207
    move-object v5, v14

    .line 208
    move-object v3, v0

    .line 209
    move-object v0, v15

    .line 210
    :try_start_7
    invoke-virtual/range {v0 .. v5}, Lqy0;->п(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 211
    .line 212
    .line 213
    move-object v13, v2

    .line 214
    :goto_4
    const/4 v0, 0x1

    .line 215
    if-eqz v13, :cond_4

    .line 216
    .line 217
    invoke-virtual {v13}, Ljava/io/File;->delete()Z

    .line 218
    .line 219
    .line 220
    :cond_4
    return v0

    .line 221
    :catchall_3
    move-exception v0

    .line 222
    move-object v10, v4

    .line 223
    goto :goto_5

    .line 224
    :catchall_4
    move-exception v0

    .line 225
    move-object v2, v3

    .line 226
    goto :goto_5

    .line 227
    :catchall_5
    move-exception v0

    .line 228
    :goto_5
    :try_start_8
    invoke-static {v1, v13}, Lqy0;->ω(Landroid/content/Context;Landroid/net/Uri;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    new-instance v1, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v3, ", err="

    .line 244
    .line 245
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-static {v11, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 256
    .line 257
    .line 258
    if-eqz v2, :cond_5

    .line 259
    .line 260
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 261
    .line 262
    .line 263
    :cond_5
    const/4 v0, 0x0

    .line 264
    return v0

    .line 265
    :catchall_6
    move-exception v0

    .line 266
    if-eqz v2, :cond_6

    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 269
    .line 270
    .line 271
    :cond_6
    throw v0
.end method

.method public final Θ(Landroid/content/Context;Lf8;II)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    const/4 v11, 0x1

    .line 8
    add-int/lit8 v0, p3, 0x1

    .line 9
    .line 10
    new-instance v4, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v12, "/"

    .line 19
    .line 20
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    move/from16 v0, p4

    .line 24
    .line 25
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v13

    .line 32
    iget-object v0, v3, Lf8;->ζ:Lh8;

    .line 33
    .line 34
    sget-object v4, Lh8;->η:Lh8;

    .line 35
    .line 36
    if-eq v0, v4, :cond_0

    .line 37
    .line 38
    invoke-virtual {v3}, Lf8;->λ()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    :cond_0
    move-object v4, v2

    .line 45
    move/from16 v18, v11

    .line 46
    .line 47
    const/16 p4, 0x0

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    goto/16 :goto_10

    .line 51
    .line 52
    :cond_1
    sget-object v4, Lh8;->ε:Lh8;

    .line 53
    .line 54
    sget-object v5, Ljz;->ε:Ljz;

    .line 55
    .line 56
    if-ne v0, v4, :cond_7

    .line 57
    .line 58
    invoke-virtual {v3}, Lf8;->ν()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_7

    .line 63
    .line 64
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Lf8;->η()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v6, v3, Lf8;->θ:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v4, v0}, Lqy0;->Ι(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, v3, Lf8;->γ:Ljava/util/List;

    .line 79
    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    move-object v5, v0

    .line 84
    :goto_0
    new-instance v0, Luh0;

    .line 85
    .line 86
    const/16 v8, 0x12

    .line 87
    .line 88
    invoke-direct {v0, v8}, Luh0;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-static {v5, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_3

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v4, v5}, Lqy0;->Ι(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v1, "DYHelper: [VIDEO-SKIP] \u6279\u91cf\u89c6\u9891\u8df3\u8fc7: awemeId="

    .line 124
    .line 125
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, Lux;->ζ(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const/4 v11, 0x0

    .line 139
    goto/16 :goto_f

    .line 140
    .line 141
    :cond_4
    const-string v0, "mp4"

    .line 142
    .line 143
    invoke-static {v2, v3, v0}, Lqy0;->γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sget-object v5, Ljy0;->ζ:Ljy0;

    .line 152
    .line 153
    invoke-static {v1, v2, v3, v5, v0}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    iget-object v0, v3, Lfv;->β:Ljava/lang/String;

    .line 158
    .line 159
    const-string v5, ".mp4"

    .line 160
    .line 161
    invoke-static {v0, v5}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v16

    .line 165
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v17

    .line 169
    const/4 v0, 0x0

    .line 170
    const/4 v8, 0x0

    .line 171
    :goto_2
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    if-eqz v9, :cond_5

    .line 176
    .line 177
    add-int/2addr v8, v11

    .line 178
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, Ljava/lang/String;

    .line 183
    .line 184
    const-string v9, "dyhelper_batch_video_"

    .line 185
    .line 186
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    invoke-static {v9, v5, v10}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    :try_start_0
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 195
    .line 196
    .line 197
    move-result v10

    .line 198
    invoke-static {v1, v0}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 202
    move/from16 v18, v11

    .line 203
    .line 204
    :try_start_1
    new-instance v11, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 207
    .line 208
    .line 209
    const/16 p4, 0x0

    .line 210
    .line 211
    :try_start_2
    const-string v14, "DYHelper: [VIDEO-DL-BATCH] awemeId="

    .line 212
    .line 213
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v14, ", candidate="

    .line 220
    .line 221
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v10, ", url="

    .line 234
    .line 235
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-static {v7}, Lux;->ζ(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 249
    .line 250
    .line 251
    move-object v7, v5

    .line 252
    :try_start_3
    invoke-virtual {v1}, Lqy0;->ж()I

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    new-instance v10, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string v11, " (\u89c6\u9891)"

    .line 265
    .line 266
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 273
    move-object v11, v4

    .line 274
    move-object v4, v9

    .line 275
    const/4 v9, 0x0

    .line 276
    move-object v14, v6

    .line 277
    move-object v6, v10

    .line 278
    const/4 v10, 0x0

    .line 279
    move/from16 v19, v8

    .line 280
    .line 281
    const/4 v8, 0x0

    .line 282
    move-object v15, v14

    .line 283
    move-object v14, v11

    .line 284
    move/from16 v11, v19

    .line 285
    .line 286
    move-object/from16 v19, v15

    .line 287
    .line 288
    move-object v15, v3

    .line 289
    move-object/from16 v20, v7

    .line 290
    .line 291
    const/4 v7, 0x0

    .line 292
    move-object v3, v0

    .line 293
    :try_start_4
    invoke-static/range {v2 .. v10}, Lqy0;->Σ(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;ILjava/lang/String;ZLjava/lang/String;Le80;Le80;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 294
    .line 295
    .line 296
    move-object v3, v4

    .line 297
    :try_start_5
    iget-object v4, v15, Lfv;->α:Ljava/lang/String;

    .line 298
    .line 299
    sget-object v6, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    .line 300
    .line 301
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 302
    .line 303
    .line 304
    move-object/from16 v2, p1

    .line 305
    .line 306
    move-object/from16 v5, v16

    .line 307
    .line 308
    :try_start_6
    invoke-virtual/range {v1 .. v6}, Lqy0;->п(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 309
    .line 310
    .line 311
    move-object v4, v3

    .line 312
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 313
    .line 314
    .line 315
    move/from16 v11, v18

    .line 316
    .line 317
    goto/16 :goto_f

    .line 318
    .line 319
    :catchall_0
    move-exception v0

    .line 320
    move-object v4, v3

    .line 321
    goto :goto_6

    .line 322
    :catchall_1
    move-exception v0

    .line 323
    move-object/from16 v2, p1

    .line 324
    .line 325
    move-object v4, v3

    .line 326
    :goto_3
    move-object/from16 v5, v16

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :catchall_2
    move-exception v0

    .line 330
    goto :goto_3

    .line 331
    :catchall_3
    move-exception v0

    .line 332
    move-object v15, v3

    .line 333
    move-object v14, v4

    .line 334
    move-object/from16 v19, v6

    .line 335
    .line 336
    move-object/from16 v20, v7

    .line 337
    .line 338
    :goto_4
    move v11, v8

    .line 339
    move-object v4, v9

    .line 340
    move-object/from16 v5, v16

    .line 341
    .line 342
    :goto_5
    const/4 v7, 0x0

    .line 343
    goto :goto_6

    .line 344
    :catchall_4
    move-exception v0

    .line 345
    move-object v15, v3

    .line 346
    move-object v14, v4

    .line 347
    move-object/from16 v20, v5

    .line 348
    .line 349
    move-object/from16 v19, v6

    .line 350
    .line 351
    goto :goto_4

    .line 352
    :catchall_5
    move-exception v0

    .line 353
    move-object v15, v3

    .line 354
    move-object v14, v4

    .line 355
    move-object/from16 v20, v5

    .line 356
    .line 357
    move-object/from16 v19, v6

    .line 358
    .line 359
    move v11, v8

    .line 360
    move-object v4, v9

    .line 361
    move-object/from16 v5, v16

    .line 362
    .line 363
    const/16 p4, 0x0

    .line 364
    .line 365
    goto :goto_5

    .line 366
    :catchall_6
    move-exception v0

    .line 367
    move-object v15, v3

    .line 368
    move-object v14, v4

    .line 369
    move-object/from16 v20, v5

    .line 370
    .line 371
    move-object/from16 v19, v6

    .line 372
    .line 373
    move-object v4, v9

    .line 374
    move/from16 v18, v11

    .line 375
    .line 376
    move-object/from16 v5, v16

    .line 377
    .line 378
    const/16 p4, 0x0

    .line 379
    .line 380
    const/4 v7, 0x0

    .line 381
    move v11, v8

    .line 382
    :goto_6
    :try_start_7
    invoke-virtual {v14}, Ljava/util/AbstractCollection;->size()I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    new-instance v8, Ljava/lang/StringBuilder;

    .line 391
    .line 392
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 393
    .line 394
    .line 395
    const-string v9, "DYHelper: [VIDEO-DL-BATCH-RETRY] \u5019\u9009 "

    .line 396
    .line 397
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    const-string v3, " \u5931\u8d25: "

    .line 410
    .line 411
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    invoke-static {v3}, Lux;->ζ(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 422
    .line 423
    .line 424
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 425
    .line 426
    .line 427
    move-object/from16 v16, v5

    .line 428
    .line 429
    move v8, v11

    .line 430
    move-object v4, v14

    .line 431
    move-object v3, v15

    .line 432
    move/from16 v11, v18

    .line 433
    .line 434
    move-object/from16 v6, v19

    .line 435
    .line 436
    move-object/from16 v5, v20

    .line 437
    .line 438
    goto/16 :goto_2

    .line 439
    .line 440
    :catchall_7
    move-exception v0

    .line 441
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 442
    .line 443
    .line 444
    throw v0

    .line 445
    :cond_5
    const/16 p4, 0x0

    .line 446
    .line 447
    if-eqz v0, :cond_6

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v15

    .line 453
    goto :goto_7

    .line 454
    :cond_6
    const/4 v15, 0x0

    .line 455
    :goto_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 456
    .line 457
    const-string v1, "DYHelper: [VIDEO-DL-BATCH-FAIL] \u5168\u90e8\u5019\u9009\u5931\u8d25: "

    .line 458
    .line 459
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-static {v0}, Lux;->ζ(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    move/from16 v11, p4

    .line 473
    .line 474
    goto/16 :goto_f

    .line 475
    .line 476
    :cond_7
    move/from16 v18, v11

    .line 477
    .line 478
    const/16 p4, 0x0

    .line 479
    .line 480
    const/4 v7, 0x0

    .line 481
    sget-object v4, Lh8;->ζ:Lh8;

    .line 482
    .line 483
    if-ne v0, v4, :cond_d

    .line 484
    .line 485
    invoke-virtual {v3}, Lf8;->κ()Z

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    if-eqz v0, :cond_d

    .line 490
    .line 491
    invoke-static {v3}, Lqy0;->В(Lf8;)Ljava/util/List;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    if-nez v0, :cond_8

    .line 496
    .line 497
    iget-object v0, v3, Lf8;->δ:Ljava/util/List;

    .line 498
    .line 499
    if-nez v0, :cond_8

    .line 500
    .line 501
    move-object v8, v5

    .line 502
    goto :goto_8

    .line 503
    :cond_8
    move-object v8, v0

    .line 504
    :goto_8
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    if-eqz v0, :cond_9

    .line 509
    .line 510
    move/from16 v14, p4

    .line 511
    .line 512
    goto/16 :goto_e

    .line 513
    .line 514
    :cond_9
    const-string v0, "jpg"

    .line 515
    .line 516
    invoke-static {v2, v3, v0}, Lqy0;->γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-static {v0}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    sget-object v4, Ljy0;->η:Ljy0;

    .line 525
    .line 526
    invoke-static {v1, v2, v3, v4, v0}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 527
    .line 528
    .line 529
    move-result-object v9

    .line 530
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 531
    .line 532
    .line 533
    move-result-object v10

    .line 534
    move/from16 v0, p4

    .line 535
    .line 536
    move v11, v0

    .line 537
    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    if-eqz v3, :cond_b

    .line 542
    .line 543
    add-int/lit8 v14, v0, 0x1

    .line 544
    .line 545
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    check-cast v3, Ljava/lang/String;

    .line 550
    .line 551
    :try_start_8
    invoke-static {v3}, Lqy0;->о(Ljava/lang/String;)Lky0;

    .line 552
    .line 553
    .line 554
    move-result-object v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_c

    .line 555
    :try_start_9
    iget-object v4, v9, Lfv;->β:Ljava/lang/String;

    .line 556
    .line 557
    iget-object v5, v3, Lky0;->θ:Ljava/lang/String;

    .line 558
    .line 559
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 560
    .line 561
    .line 562
    move-result v6

    .line 563
    invoke-static {v0, v6, v4, v5}, Lqy0;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    iget-object v4, v9, Lfv;->α:Ljava/lang/String;

    .line 568
    .line 569
    iget-object v5, v3, Lky0;->η:Ljava/lang/String;

    .line 570
    .line 571
    sget-object v6, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 572
    .line 573
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    invoke-static {v2, v4, v0, v5, v6}, Lqy0;->χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 577
    .line 578
    .line 579
    move-result-object v15
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    .line 580
    :try_start_a
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-virtual {v0, v15}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    if-eqz v0, :cond_a

    .line 589
    .line 590
    invoke-virtual {v1}, Lqy0;->ж()I

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 595
    .line 596
    .line 597
    move-result v4

    .line 598
    new-instance v6, Ljava/lang/StringBuilder;

    .line 599
    .line 600
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 604
    .line 605
    .line 606
    :try_start_b
    const-string v7, " (\u56fe\u7247 "

    .line 607
    .line 608
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    const-string v4, ")"

    .line 621
    .line 622
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 629
    move-object v4, v2

    .line 630
    move-object v2, v3

    .line 631
    const/4 v7, 0x0

    .line 632
    move-object v3, v0

    .line 633
    :try_start_c
    invoke-virtual/range {v1 .. v7}, Lqy0;->Κ(Lky0;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;Z)V

    .line 634
    .line 635
    .line 636
    invoke-static {v4, v15}, Lqy0;->д(Landroid/content/Context;Landroid/net/Uri;)V

    .line 637
    .line 638
    .line 639
    add-int/lit8 v11, v11, 0x1

    .line 640
    .line 641
    :goto_a
    move-object/from16 v1, p0

    .line 642
    .line 643
    move-object v2, v4

    .line 644
    move v0, v14

    .line 645
    goto :goto_9

    .line 646
    :catchall_8
    move-exception v0

    .line 647
    move-object v3, v2

    .line 648
    goto :goto_c

    .line 649
    :catchall_9
    move-exception v0

    .line 650
    move-object v4, v2

    .line 651
    move-object v2, v3

    .line 652
    const/4 v7, 0x0

    .line 653
    goto :goto_c

    .line 654
    :catchall_a
    move-exception v0

    .line 655
    move-object v4, v2

    .line 656
    move-object v2, v3

    .line 657
    goto :goto_c

    .line 658
    :cond_a
    move-object v4, v2

    .line 659
    move-object v2, v3

    .line 660
    new-instance v0, Ljava/lang/Exception;

    .line 661
    .line 662
    const-string v1, "\u65e0\u6cd5\u6253\u5f00\u8f93\u51fa\u6d41"

    .line 663
    .line 664
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 668
    :catchall_b
    move-exception v0

    .line 669
    move-object v4, v2

    .line 670
    move-object v2, v3

    .line 671
    :goto_b
    const/4 v15, 0x0

    .line 672
    goto :goto_c

    .line 673
    :catchall_c
    move-exception v0

    .line 674
    move-object v4, v2

    .line 675
    const/4 v3, 0x0

    .line 676
    goto :goto_b

    .line 677
    :goto_c
    invoke-static {v4, v15}, Lqy0;->ω(Landroid/content/Context;Landroid/net/Uri;)V

    .line 678
    .line 679
    .line 680
    invoke-static {v3}, Lqy0;->π(Lky0;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    new-instance v1, Ljava/lang/StringBuilder;

    .line 688
    .line 689
    const-string v2, "DYHelper: [IMG-FAIL] \u6279\u91cf\u56fe\u7247"

    .line 690
    .line 691
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 695
    .line 696
    .line 697
    const-string v2, "\u5931\u8d25: "

    .line 698
    .line 699
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    invoke-static {v0}, Lux;->ζ(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    goto :goto_a

    .line 713
    :cond_b
    if-lez v11, :cond_c

    .line 714
    .line 715
    move/from16 v11, v18

    .line 716
    .line 717
    goto :goto_d

    .line 718
    :cond_c
    move/from16 v11, p4

    .line 719
    .line 720
    :goto_d
    move v14, v11

    .line 721
    :goto_e
    move v11, v14

    .line 722
    :goto_f
    return v11

    .line 723
    :goto_10
    const/4 v5, 0x0

    .line 724
    const/4 v6, 0x0

    .line 725
    move-object/from16 v1, p0

    .line 726
    .line 727
    move-object v2, v4

    .line 728
    move v4, v7

    .line 729
    invoke-virtual/range {v1 .. v6}, Lqy0;->ш(Landroid/content/Context;Lf8;ZLjava/lang/String;Lfv;)Ljava/util/ArrayList;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 734
    .line 735
    .line 736
    move-result v0

    .line 737
    if-nez v0, :cond_d

    .line 738
    .line 739
    return v18

    .line 740
    :cond_d
    return p4
.end method

.method public final Κ(Lky0;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;Z)V
    .locals 13

    .line 1
    move-object/from16 v3, p3

    .line 2
    .line 3
    iget-object v12, p1, Lky0;->β:Lvx;

    .line 4
    .line 5
    iget-object v1, p1, Lky0;->γ:Ljava/io/BufferedInputStream;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v0, p1, Lky0;->ι:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p2}, Lqy0;->З(Lky0;Ljava/io/OutputStream;)V

    .line 12
    .line 13
    .line 14
    if-eqz p6, :cond_1

    .line 15
    .line 16
    const-string p0, "notification"

    .line 17
    .line 18
    invoke-virtual {v3, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast p0, Landroid/app/NotificationManager;

    .line 26
    .line 27
    new-instance p1, Lx31;

    .line 28
    .line 29
    invoke-direct {p1, v3}, Lx31;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p1, Lx31;->ξ:Landroid/app/Notification;

    .line 33
    .line 34
    const v2, 0x1080082

    .line 35
    .line 36
    .line 37
    iput v2, v0, Landroid/app/Notification;->icon:I

    .line 38
    .line 39
    const-string v0, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 40
    .line 41
    invoke-static {v0}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p1, Lx31;->ε:Ljava/lang/CharSequence;

    .line 46
    .line 47
    invoke-static/range {p5 .. p5}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p1, Lx31;->ζ:Ljava/lang/CharSequence;

    .line 52
    .line 53
    const/16 v0, 0x10

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lx31;->γ(I)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p1, Lx31;->ο:Z

    .line 60
    .line 61
    invoke-virtual {p1}, Lx31;->α()Landroid/app/Notification;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    move/from16 v4, p4

    .line 66
    .line 67
    invoke-virtual {p0, v4, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    move/from16 v4, p4

    .line 75
    .line 76
    iget-wide v6, p1, Lky0;->λ:J

    .line 77
    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v11, 0x0

    .line 81
    move-object v2, p2

    .line 82
    move-object/from16 v5, p5

    .line 83
    .line 84
    move/from16 v8, p6

    .line 85
    .line 86
    invoke-static/range {v1 .. v11}, Lqy0;->υ(Ljava/io/BufferedInputStream;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;JZLjava/lang/String;Le80;Le80;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    :cond_1
    :goto_0
    :try_start_1
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    .line 91
    .line 92
    :catchall_1
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 93
    .line 94
    .line 95
    :catchall_2
    invoke-virtual {v12}, Lvx;->α()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :goto_1
    :try_start_3
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 100
    .line 101
    .line 102
    :catchall_3
    :try_start_4
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 103
    .line 104
    .line 105
    :catchall_4
    invoke-virtual {v12}, Lvx;->α()V

    .line 106
    .line 107
    .line 108
    throw p0
.end method

.method public final Λ(Landroid/content/Context;Lf8;Lzy0;ZLjava/lang/String;)Z
    .locals 21

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v10, p3

    .line 6
    .line 7
    const-string v11, "."

    .line 8
    .line 9
    iget-object v0, v10, Lzy0;->ι:Ljava/util/List;

    .line 10
    .line 11
    iget-object v12, v10, Lzy0;->α:Laz0;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v0, v10, Lzy0;->θ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0}, Lyh;->в(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v4}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    new-instance v0, Ljava/util/HashSet;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance v13, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    move-object v5, v4

    .line 81
    check-cast v5, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v5}, Lqy0;->к(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_3

    .line 92
    .line 93
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    const/4 v14, 0x0

    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    return v14

    .line 105
    :cond_5
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    const/4 v15, 0x1

    .line 110
    if-eq v0, v15, :cond_7

    .line 111
    .line 112
    const/4 v1, 0x3

    .line 113
    if-eq v0, v1, :cond_6

    .line 114
    .line 115
    const-string v0, "anim"

    .line 116
    .line 117
    :goto_2
    move-object v1, v0

    .line 118
    goto :goto_3

    .line 119
    :cond_6
    const-string v0, "live"

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_7
    const-string v0, "video"

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :goto_3
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eq v0, v15, :cond_8

    .line 130
    .line 131
    const-string v0, "\u5df2\u9009\u52a8\u56fe"

    .line 132
    .line 133
    :goto_4
    move-object v4, v0

    .line 134
    goto :goto_5

    .line 135
    :cond_8
    const-string v0, "\u5df2\u9009\u89c6\u9891"

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :goto_5
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v16

    .line 142
    const/4 v0, 0x0

    .line 143
    move v5, v14

    .line 144
    :goto_6
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    const-string v7, "DYHelper"

    .line 149
    .line 150
    if-eqz v6, :cond_c

    .line 151
    .line 152
    add-int/2addr v5, v15

    .line 153
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    check-cast v6, Ljava/lang/String;

    .line 158
    .line 159
    :try_start_0
    invoke-static {v6}, Lqy0;->у(Ljava/lang/String;)Lmu;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    const-string v9, "dat"

    .line 164
    .line 165
    invoke-static {v2, v3, v9}, Lqy0;->γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    invoke-static {v9}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 173
    move/from16 v17, v14

    .line 174
    .line 175
    :try_start_1
    sget-object v14, Laz0;->ζ:Laz0;

    .line 176
    .line 177
    if-ne v12, v14, :cond_9

    .line 178
    .line 179
    sget-object v14, Ljy0;->ζ:Ljy0;

    .line 180
    .line 181
    :goto_7
    move/from16 v18, v15

    .line 182
    .line 183
    move-object/from16 v15, p0

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :catchall_0
    move-exception v0

    .line 187
    move-object/from16 v19, v1

    .line 188
    .line 189
    move v14, v5

    .line 190
    move-object/from16 v20, v11

    .line 191
    .line 192
    move/from16 v18, v15

    .line 193
    .line 194
    move-object v15, v4

    .line 195
    :goto_8
    move-object v11, v7

    .line 196
    goto/16 :goto_d

    .line 197
    .line 198
    :cond_9
    sget-object v14, Ljy0;->θ:Ljy0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :goto_9
    :try_start_2
    invoke-static {v15, v2, v3, v14, v9}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    if-nez p5, :cond_a

    .line 206
    .line 207
    iget-object v14, v9, Lfv;->β:Ljava/lang/String;

    .line 208
    .line 209
    goto :goto_b

    .line 210
    :catchall_1
    move-exception v0

    .line 211
    move-object/from16 v19, v1

    .line 212
    .line 213
    :goto_a
    move-object v15, v4

    .line 214
    move v14, v5

    .line 215
    move-object/from16 v20, v11

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_a
    move-object/from16 v14, p5

    .line 219
    .line 220
    :goto_b
    invoke-static {v2, v3, v10, v1, v14}, Lqy0;->κ(Landroid/content/Context;Lf8;Lzy0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    iget-object v8, v8, Lmu;->β:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 225
    .line 226
    move-object/from16 v19, v1

    .line 227
    .line 228
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    iget v8, v10, Lzy0;->γ:I

    .line 247
    .line 248
    new-instance v14, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    move-object/from16 v20, v1

    .line 257
    .line 258
    const-string v1, " "

    .line 259
    .line 260
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    iget-object v9, v9, Lfv;->α:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 271
    .line 272
    move-object v1, v7

    .line 273
    const/4 v7, 0x0

    .line 274
    move v14, v5

    .line 275
    move-object/from16 v5, v20

    .line 276
    .line 277
    move-object/from16 v20, v11

    .line 278
    .line 279
    move-object v11, v1

    .line 280
    move-object v1, v15

    .line 281
    move-object v15, v4

    .line 282
    move-object v4, v6

    .line 283
    move/from16 v6, p4

    .line 284
    .line 285
    :try_start_4
    invoke-virtual/range {v1 .. v9}, Lqy0;->Η(Landroid/content/Context;Lf8;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 286
    .line 287
    .line 288
    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 289
    if-eqz v4, :cond_b

    .line 290
    .line 291
    return v18

    .line 292
    :cond_b
    :goto_c
    move-object/from16 v2, p1

    .line 293
    .line 294
    move-object/from16 v3, p2

    .line 295
    .line 296
    move v5, v14

    .line 297
    move-object v4, v15

    .line 298
    move/from16 v14, v17

    .line 299
    .line 300
    move/from16 v15, v18

    .line 301
    .line 302
    move-object/from16 v1, v19

    .line 303
    .line 304
    move-object/from16 v11, v20

    .line 305
    .line 306
    goto/16 :goto_6

    .line 307
    .line 308
    :catchall_2
    move-exception v0

    .line 309
    goto :goto_d

    .line 310
    :catchall_3
    move-exception v0

    .line 311
    goto :goto_a

    .line 312
    :catchall_4
    move-exception v0

    .line 313
    move-object/from16 v19, v1

    .line 314
    .line 315
    move-object/from16 v20, v11

    .line 316
    .line 317
    move/from16 v17, v14

    .line 318
    .line 319
    move/from16 v18, v15

    .line 320
    .line 321
    move-object v15, v4

    .line 322
    move v14, v5

    .line 323
    goto/16 :goto_8

    .line 324
    .line 325
    :goto_d
    iget-object v1, v10, Lzy0;->δ:Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    const-string v3, " \u5019\u9009 "

    .line 332
    .line 333
    const-string v4, "/"

    .line 334
    .line 335
    const-string v5, "[SELECT-ANIM-RETRY] "

    .line 336
    .line 337
    invoke-static {v14, v5, v1, v3, v4}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    const-string v2, " \u5931\u8d25"

    .line 345
    .line 346
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-static {v11, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 354
    .line 355
    .line 356
    goto :goto_c

    .line 357
    :cond_c
    move-object v11, v7

    .line 358
    move/from16 v17, v14

    .line 359
    .line 360
    const-string v1, "[SELECT-ANIM-FAIL]"

    .line 361
    .line 362
    invoke-static {v11, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 363
    .line 364
    .line 365
    return v17
.end method

.method public final Μ(Landroid/content/Context;Lf8;Lzy0;ZLjava/lang/String;)Z
    .locals 14

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    const-string v7, "DYHelper"

    .line 6
    .line 7
    const-string v4, "."

    .line 8
    .line 9
    const-string v5, "[SELECT-IMG-DL] page="

    .line 10
    .line 11
    iget-object v6, v2, Lzy0;->η:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v6}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    const/4 v8, 0x0

    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    return v8

    .line 21
    :cond_0
    const/4 v9, 0x0

    .line 22
    :try_start_0
    invoke-static {v6}, Lqy0;->о(Ljava/lang/String;)Lky0;

    .line 23
    .line 24
    .line 25
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 26
    :try_start_1
    const-string v11, "dat"

    .line 27
    .line 28
    invoke-static {p1, v1, v11}, Lqy0;->γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    invoke-static {v11}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    sget-object v12, Ljy0;->η:Ljy0;

    .line 37
    .line 38
    invoke-static {p0, p1, v1, v12, v11}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 39
    .line 40
    .line 41
    move-result-object v11

    .line 42
    const-string v12, "image"

    .line 43
    .line 44
    if-nez p5, :cond_1

    .line 45
    .line 46
    iget-object v13, v11, Lfv;->β:Ljava/lang/String;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    move-object v1, v10

    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :cond_1
    move-object/from16 v13, p5

    .line 54
    .line 55
    :goto_0
    invoke-static {p1, v1, v2, v12, v13}, Lqy0;->κ(Landroid/content/Context;Lf8;Lzy0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v12, v10, Lky0;->θ:Ljava/lang/String;

    .line 60
    .line 61
    new-instance v13, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v4, v11, Lfv;->α:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v11, v10, Lky0;->η:Ljava/lang/String;

    .line 82
    .line 83
    sget-object v12, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v4, v1, v11, v12}, Lqy0;->χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4, v9}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    if-eqz v4, :cond_2

    .line 101
    .line 102
    iget v2, v2, Lzy0;->β:I

    .line 103
    .line 104
    invoke-static {p0, v6}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    new-instance v11, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v11, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v2, ", file="

    .line 117
    .line 118
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v2, ", url="

    .line 125
    .line 126
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-static {v7, v2}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    move-object v2, v4

    .line 140
    invoke-virtual {p0}, Lqy0;->ж()I

    .line 141
    .line 142
    .line 143
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    move-object v0, p0

    .line 145
    move-object v3, p1

    .line 146
    move/from16 v6, p4

    .line 147
    .line 148
    move-object v5, v1

    .line 149
    move-object v1, v10

    .line 150
    :try_start_2
    invoke-virtual/range {v0 .. v6}, Lqy0;->Κ(Lky0;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;Z)V

    .line 151
    .line 152
    .line 153
    invoke-static {p1, v9}, Lqy0;->д(Landroid/content/Context;Landroid/net/Uri;)V

    .line 154
    .line 155
    .line 156
    const/4 v0, 0x1

    .line 157
    return v0

    .line 158
    :catchall_1
    move-exception v0

    .line 159
    goto :goto_1

    .line 160
    :cond_2
    move-object v1, v10

    .line 161
    new-instance v0, Ljava/lang/Exception;

    .line 162
    .line 163
    const-string v2, "\u65e0\u6cd5\u6253\u5f00\u8f93\u51fa\u6d41"

    .line 164
    .line 165
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 169
    :catchall_2
    move-exception v0

    .line 170
    move-object v1, v9

    .line 171
    :goto_1
    invoke-static {p1, v9}, Lqy0;->ω(Landroid/content/Context;Landroid/net/Uri;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v1}, Lqy0;->π(Lky0;)V

    .line 175
    .line 176
    .line 177
    const-string v1, "[SELECT-IMG-FAIL]"

    .line 178
    .line 179
    invoke-static {v7, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    return v8
.end method

.method public final Ν(Landroid/content/Context;Lf8;Lzy0;ZLjava/lang/String;)Z
    .locals 20

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    iget-object v3, v0, Lzy0;->ι:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    iget-object v3, v0, Lzy0;->θ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v3}, Lyh;->в(Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v5}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    new-instance v3, Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 55
    .line 56
    .line 57
    new-instance v5, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_4

    .line 71
    .line 72
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    move-object v7, v6

    .line 77
    check-cast v7, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v7}, Lqy0;->к(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_3

    .line 88
    .line 89
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    const/16 v17, 0x0

    .line 98
    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    goto/16 :goto_a

    .line 102
    .line 103
    :cond_5
    iget-object v3, v0, Lzy0;->η:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v3}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    iget-object v3, v0, Lzy0;->ζ:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v3}, Lqy0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v1}, Lqy0;->я(Landroid/content/Context;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    const/4 v7, 0x0

    .line 120
    const/16 v18, 0x1

    .line 121
    .line 122
    if-eqz v4, :cond_c

    .line 123
    .line 124
    :try_start_0
    filled-new-array {v6, v3}, [Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-static {v3}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-static {v3}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-static {v3}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    iget v4, v0, Lzy0;->β:I

    .line 141
    .line 142
    add-int/lit8 v4, v4, 0x1

    .line 143
    .line 144
    new-instance v6, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const-string v8, "_page"

    .line 150
    .line 151
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-nez v6, :cond_6

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_6
    move-object v4, v7

    .line 169
    :goto_2
    if-nez v4, :cond_7

    .line 170
    .line 171
    const-string v4, ""

    .line 172
    .line 173
    :cond_7
    invoke-static {v3}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    move-object v10, v6

    .line 178
    check-cast v10, Ljava/lang/String;

    .line 179
    .line 180
    iget-object v6, v2, Lf8;->α:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v4, v6}, Lqy0;->ι(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    iget-object v8, v2, Lf8;->β:Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {v4, v8}, Lqy0;->ι(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    iget-object v9, v2, Lf8;->θ:Ljava/lang/String;

    .line 193
    .line 194
    if-eqz v9, :cond_8

    .line 195
    .line 196
    invoke-static {v4, v9}, Lqy0;->ι(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    goto :goto_3

    .line 201
    :cond_8
    move-object v4, v7

    .line 202
    :goto_3
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-nez v9, :cond_9

    .line 207
    .line 208
    move-object v9, v3

    .line 209
    move-object v3, v6

    .line 210
    move-object v6, v9

    .line 211
    goto :goto_4

    .line 212
    :cond_9
    move-object v9, v3

    .line 213
    move-object v3, v6

    .line 214
    move-object v6, v7

    .line 215
    :goto_4
    invoke-static {v5}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v11

    .line 219
    check-cast v11, Ljava/lang/String;

    .line 220
    .line 221
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    if-nez v12, :cond_a

    .line 226
    .line 227
    move-object v13, v9

    .line 228
    goto :goto_5

    .line 229
    :cond_a
    move-object v13, v7

    .line 230
    :goto_5
    const v15, -0x40000090    # -1.9999828f

    .line 231
    .line 232
    .line 233
    const/16 v16, 0x1e81

    .line 234
    .line 235
    move-object v9, v7

    .line 236
    move-object v7, v4

    .line 237
    move-object v4, v8

    .line 238
    const/4 v8, 0x0

    .line 239
    const/4 v14, 0x0

    .line 240
    move-object v12, v9

    .line 241
    move-object v9, v11

    .line 242
    move-object v11, v10

    .line 243
    move-object/from16 v19, v12

    .line 244
    .line 245
    move-object v12, v5

    .line 246
    invoke-static/range {v2 .. v16}, Lf8;->γ(Lf8;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;II)Lf8;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    const-string v4, "dat"

    .line 251
    .line 252
    invoke-static {v1, v2, v4}, Lqy0;->γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-static {v4}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    sget-object v5, Ljy0;->ι:Ljy0;

    .line 261
    .line 262
    move-object/from16 v6, p0

    .line 263
    .line 264
    invoke-static {v6, v1, v2, v5, v4}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    const-string v5, "live"

    .line 269
    .line 270
    if-nez p5, :cond_b

    .line 271
    .line 272
    iget-object v7, v4, Lfv;->β:Ljava/lang/String;

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :catchall_0
    move-exception v0

    .line 276
    goto :goto_7

    .line 277
    :cond_b
    move-object/from16 v7, p5

    .line 278
    .line 279
    :goto_6
    invoke-static {v1, v2, v0, v5, v7}, Lqy0;->κ(Landroid/content/Context;Lf8;Lzy0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    const/4 v2, 0x5

    .line 284
    const/4 v12, 0x0

    .line 285
    invoke-static {v4, v12, v0, v12, v2}, Lfv;->α(Lfv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lfv;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    const/4 v4, 0x0

    .line 290
    move-object v2, v3

    .line 291
    move-object v0, v6

    .line 292
    move/from16 v3, p4

    .line 293
    .line 294
    invoke-virtual/range {v0 .. v5}, Lqy0;->э(Landroid/content/Context;Lf8;ZLjava/lang/String;Lfv;)Ljava/util/ArrayList;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    xor-int/lit8 v0, v0, 0x1

    .line 303
    .line 304
    return v0

    .line 305
    :goto_7
    const-string v1, "DYHelper"

    .line 306
    .line 307
    const-string v2, "[SELECT-LIVE-MERGE-FAIL]"

    .line 308
    .line 309
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 310
    .line 311
    .line 312
    return v17

    .line 313
    :cond_c
    move-object v12, v7

    .line 314
    sget-object v1, Laz0;->η:Laz0;

    .line 315
    .line 316
    const/16 v3, 0x3fe

    .line 317
    .line 318
    invoke-static {v0, v1, v12, v3}, Lzy0;->α(Lzy0;Laz0;Ljava/lang/String;I)Lzy0;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    move-object/from16 v1, p1

    .line 323
    .line 324
    move/from16 v4, p4

    .line 325
    .line 326
    move-object/from16 v5, p5

    .line 327
    .line 328
    move-object v7, v0

    .line 329
    move-object/from16 v0, p0

    .line 330
    .line 331
    invoke-virtual/range {v0 .. v5}, Lqy0;->Λ(Landroid/content/Context;Lf8;Lzy0;ZLjava/lang/String;)Z

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    if-eqz v6, :cond_e

    .line 336
    .line 337
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_d

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_d
    sget-object v0, Laz0;->ε:Laz0;

    .line 345
    .line 346
    const/16 v1, 0x3be

    .line 347
    .line 348
    invoke-static {v7, v0, v6, v1}, Lzy0;->α(Lzy0;Laz0;Ljava/lang/String;I)Lzy0;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    move-object/from16 v0, p0

    .line 353
    .line 354
    move-object/from16 v1, p1

    .line 355
    .line 356
    move-object/from16 v2, p2

    .line 357
    .line 358
    move/from16 v4, p4

    .line 359
    .line 360
    move-object/from16 v5, p5

    .line 361
    .line 362
    invoke-virtual/range {v0 .. v5}, Lqy0;->Μ(Landroid/content/Context;Lf8;Lzy0;ZLjava/lang/String;)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    goto :goto_9

    .line 367
    :cond_e
    :goto_8
    move/from16 v0, v17

    .line 368
    .line 369
    :goto_9
    if-nez v8, :cond_10

    .line 370
    .line 371
    if-eqz v0, :cond_f

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_f
    :goto_a
    return v17

    .line 375
    :cond_10
    :goto_b
    return v18
.end method

.method public final Π(Landroid/app/Activity;Lf8;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lyh;->у(Landroid/content/Context;)Liu;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, v0, Liu;->β:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Liu;->α()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const-string v0, "DYHelper"

    .line 29
    .line 30
    const-string v1, "[DOWNLOAD-STORAGE] \u5f53\u524d\u7a7a\u95f4\u65e0\u53ef\u7528 SAF \u6388\u6743\uff0c\u6539\u7528 MediaStore"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    const-string v0, "mp4"

    .line 36
    .line 37
    invoke-static {p1, p2, v0}, Lqy0;->γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, Ljy0;->ζ:Ljy0;

    .line 46
    .line 47
    invoke-static {p0, p1, p2, v1, v0}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget-object v0, p0, Lfv;->β:Ljava/lang/String;

    .line 52
    .line 53
    const-string v1, ".mp4"

    .line 54
    .line 55
    invoke-static {v0, v1}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz p3, :cond_3

    .line 60
    .line 61
    invoke-static {p3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    invoke-static {p3, v0}, Lku;->β(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-static {p1, p2, p0, p3}, Lqy0;->Ρ(Landroid/app/Activity;Lf8;Lfv;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    :goto_1
    new-instance p3, Lmy0;

    .line 77
    .line 78
    invoke-direct {p3, p1, p2, p0}, Lmy0;-><init>(Landroid/app/Activity;Lf8;Lfv;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v0, p3}, Lqy0;->τ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final Τ(Ljava/lang/String;Ljava/io/FileOutputStream;Landroid/content/Context;ILjava/lang/String;ZLjava/lang/String;Le80;Le80;)V
    .locals 22

    .line 1
    const-string v0, "\u54cd\u5e94\u662f\u97f3\u9891\uff0c\u4e0d\u662f\u89c6\u9891: header="

    .line 2
    .line 3
    const-string v1, "video/mp4"

    .line 4
    .line 5
    const-string v2, "\u54cd\u5e94\u4e0d\u662f\u89c6\u9891\uff0c\u7591\u4f3c JSON/HTML: mime="

    .line 6
    .line 7
    const-string v3, "\u54cd\u5e94\u7c7b\u578b\u4e0d\u662f MP4: contentType="

    .line 8
    .line 9
    const-string v4, "\u54cd\u5e94\u662f\u56fe\u7247\uff0c\u4e0d\u662f\u89c6\u9891: header="

    .line 10
    .line 11
    const-string v5, "\u54cd\u5e94\u4e0d\u662f\u53ef\u64ad\u653e MP4: contentType="

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Ljx0;->Ζ(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    if-nez v6, :cond_12

    .line 18
    .line 19
    const/16 v6, 0x1a

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    move-object/from16 v8, p1

    .line 23
    .line 24
    :try_start_0
    invoke-static {v8, v7, v7, v6}, Lwx;->ζ(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lvx;

    .line 25
    .line 26
    .line 27
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 28
    :try_start_1
    iget-object v9, v6, Lvx;->ε:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v9}, Lqy0;->и(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v10

    .line 34
    iget-wide v11, v6, Lvx;->ζ:J

    .line 35
    .line 36
    iget-object v7, v6, Lvx;->δ:Ljava/io/BufferedInputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 37
    .line 38
    :try_start_2
    invoke-virtual {v7}, Ljava/io/BufferedInputStream;->markSupported()Z

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    if-eqz v13, :cond_f

    .line 43
    .line 44
    const/high16 v13, 0x20000

    .line 45
    .line 46
    invoke-virtual {v7, v13}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 47
    .line 48
    .line 49
    const/16 v13, 0x40

    .line 50
    .line 51
    new-array v13, v13, [B

    .line 52
    .line 53
    invoke-virtual {v7, v13}, Ljava/io/InputStream;->read([B)I

    .line 54
    .line 55
    .line 56
    move-result v14

    .line 57
    if-lez v14, :cond_e

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/io/BufferedInputStream;->reset()V

    .line 60
    .line 61
    .line 62
    invoke-static {v13, v14}, Lqy0;->Α([BI)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v15

    .line 66
    invoke-static {v13, v14}, Lqy0;->ο([BI)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v16

    .line 70
    invoke-static/range {v16 .. v16}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 74
    move-object/from16 p0, v6

    .line 75
    .line 76
    :try_start_3
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 80
    move-object/from16 v16, v7

    .line 81
    .line 82
    :try_start_4
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 83
    .line 84
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const-string v7, "#extm3u"

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    invoke-static {v6, v7, v8}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-nez v7, :cond_d

    .line 99
    .line 100
    const-string v7, "{"

    .line 101
    .line 102
    invoke-static {v6, v7, v8}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-nez v7, :cond_c

    .line 107
    .line 108
    const-string v7, "["

    .line 109
    .line 110
    invoke-static {v6, v7, v8}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-nez v7, :cond_c

    .line 115
    .line 116
    const-string v7, "<"

    .line 117
    .line 118
    invoke-static {v6, v7, v8}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-nez v7, :cond_c

    .line 123
    .line 124
    const-string v7, "<html"

    .line 125
    .line 126
    move/from16 v17, v8

    .line 127
    .line 128
    const/4 v8, 0x1

    .line 129
    invoke-static {v6, v7, v8}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 130
    .line 131
    .line 132
    move-result v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 133
    if-nez v6, :cond_c

    .line 134
    .line 135
    const/4 v2, 0x2

    .line 136
    if-lt v14, v2, :cond_1

    .line 137
    .line 138
    :try_start_5
    aget-byte v2, v13, v17

    .line 139
    .line 140
    and-int/lit16 v2, v2, 0xff

    .line 141
    .line 142
    const/16 v6, 0x1f

    .line 143
    .line 144
    if-ne v2, v6, :cond_1

    .line 145
    .line 146
    aget-byte v2, v13, v8

    .line 147
    .line 148
    and-int/lit16 v2, v2, 0xff

    .line 149
    .line 150
    const/16 v6, 0x8b

    .line 151
    .line 152
    if-eq v2, v6, :cond_0

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    .line 156
    .line 157
    const-string v1, "\u54cd\u5e94\u662f gzip \u538b\u7f29\u5185\u5bb9\uff0c\u4e0d\u662f\u53ef\u76f4\u63a5\u64ad\u653e MP4"

    .line 158
    .line 159
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v0

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    move-object/from16 v1, p0

    .line 165
    .line 166
    move-object/from16 v7, v16

    .line 167
    .line 168
    goto/16 :goto_a

    .line 169
    .line 170
    :cond_1
    :goto_0
    if-eqz v10, :cond_3

    .line 171
    .line 172
    const-string v2, "text/"

    .line 173
    .line 174
    move/from16 v6, v17

    .line 175
    .line 176
    invoke-static {v10, v2, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 177
    .line 178
    .line 179
    move-result v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 180
    if-eq v2, v8, :cond_2

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_2
    move-object/from16 v11, v16

    .line 184
    .line 185
    goto/16 :goto_7

    .line 186
    .line 187
    :cond_3
    :goto_1
    :try_start_6
    const-string v2, "application/json"

    .line 188
    .line 189
    invoke-static {v10, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 193
    if-nez v2, :cond_2

    .line 194
    .line 195
    if-eqz v10, :cond_4

    .line 196
    .line 197
    :try_start_7
    const-string v2, "mpegurl"

    .line 198
    .line 199
    const/4 v6, 0x0

    .line 200
    invoke-static {v10, v2, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 204
    if-eq v2, v8, :cond_2

    .line 205
    .line 206
    :cond_4
    const-string v2, "image/"

    .line 207
    .line 208
    if-eqz v10, :cond_5

    .line 209
    .line 210
    const/4 v6, 0x0

    .line 211
    :try_start_8
    invoke-static {v10, v2, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eq v3, v8, :cond_6

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_5
    const/4 v6, 0x0

    .line 219
    :goto_2
    if-eqz v15, :cond_7

    .line 220
    .line 221
    invoke-static {v15, v2, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eq v2, v8, :cond_6

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_6
    new-instance v0, Ljava/lang/Exception;

    .line 229
    .line 230
    new-instance v1, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string v2, " magic="

    .line 239
    .line 240
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v0

    .line 254
    :cond_7
    :goto_3
    if-eqz v10, :cond_9

    .line 255
    .line 256
    const-string v2, "audio/"

    .line 257
    .line 258
    const/4 v6, 0x0

    .line 259
    invoke-static {v10, v2, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-eq v2, v8, :cond_8

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_8
    new-instance v1, Ljava/lang/Exception;

    .line 267
    .line 268
    invoke-virtual {v0, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 276
    :cond_9
    :goto_4
    :try_start_9
    invoke-static {v15, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 280
    if-nez v0, :cond_a

    .line 281
    .line 282
    :try_start_a
    invoke-static {v10, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-nez v0, :cond_a

    .line 287
    .line 288
    const-string v0, "application/octet-stream"

    .line 289
    .line 290
    invoke-static {v10, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_b

    .line 295
    .line 296
    invoke-static/range {p1 .. p1}, Ljx0;->Ν(Ljava/lang/String;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_b

    .line 301
    .line 302
    :cond_a
    move-wide v13, v11

    .line 303
    move-object/from16 v11, v16

    .line 304
    .line 305
    move-wide/from16 v16, v13

    .line 306
    .line 307
    move-object/from16 v12, p2

    .line 308
    .line 309
    move-object/from16 v13, p3

    .line 310
    .line 311
    move/from16 v14, p4

    .line 312
    .line 313
    move-object/from16 v15, p5

    .line 314
    .line 315
    move/from16 v18, p6

    .line 316
    .line 317
    move-object/from16 v19, p7

    .line 318
    .line 319
    move-object/from16 v20, p8

    .line 320
    .line 321
    move-object/from16 v21, p9

    .line 322
    .line 323
    goto :goto_5

    .line 324
    :cond_b
    new-instance v0, Ljava/lang/Exception;

    .line 325
    .line 326
    invoke-static {v13, v14}, Lqy0;->ξ([BI)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    new-instance v2, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const-string v3, ", magic="

    .line 339
    .line 340
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v3, ", head="

    .line 347
    .line 348
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 362
    :goto_5
    :try_start_b
    invoke-static/range {v11 .. v21}, Lqy0;->υ(Ljava/io/BufferedInputStream;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;JZLjava/lang/String;Le80;Le80;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 363
    .line 364
    .line 365
    :try_start_c
    invoke-virtual {v11}, Ljava/io/BufferedInputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 366
    .line 367
    .line 368
    :catchall_1
    invoke-virtual/range {p0 .. p0}, Lvx;->α()V

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    :catchall_2
    move-exception v0

    .line 373
    :goto_6
    move-object/from16 v1, p0

    .line 374
    .line 375
    move-object v7, v11

    .line 376
    goto :goto_a

    .line 377
    :catchall_3
    move-exception v0

    .line 378
    move-object/from16 v11, v16

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :goto_7
    :try_start_d
    new-instance v0, Ljava/lang/Exception;

    .line 382
    .line 383
    new-instance v1, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw v0

    .line 399
    :cond_c
    move-object/from16 v11, v16

    .line 400
    .line 401
    new-instance v0, Ljava/lang/Exception;

    .line 402
    .line 403
    new-instance v1, Ljava/lang/StringBuilder;

    .line 404
    .line 405
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    throw v0

    .line 419
    :cond_d
    move-object/from16 v11, v16

    .line 420
    .line 421
    new-instance v0, Ljava/lang/Exception;

    .line 422
    .line 423
    const-string v1, "\u54cd\u5e94\u662f m3u8 \u64ad\u653e\u5217\u8868\uff0c\u4e0d\u662f MP4"

    .line 424
    .line 425
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v0

    .line 429
    :catchall_4
    move-exception v0

    .line 430
    :goto_8
    move-object v11, v7

    .line 431
    :goto_9
    move-object/from16 v1, p0

    .line 432
    .line 433
    goto :goto_a

    .line 434
    :catchall_5
    move-exception v0

    .line 435
    move-object/from16 p0, v6

    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_e
    move-object/from16 p0, v6

    .line 439
    .line 440
    move-object v11, v7

    .line 441
    new-instance v0, Ljava/lang/Exception;

    .line 442
    .line 443
    const-string v1, "\u89c6\u9891\u5185\u5bb9\u4e3a\u7a7a"

    .line 444
    .line 445
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    throw v0

    .line 449
    :cond_f
    move-object/from16 p0, v6

    .line 450
    .line 451
    move-object v11, v7

    .line 452
    new-instance v0, Ljava/lang/Exception;

    .line 453
    .line 454
    const-string v1, "\u8f93\u5165\u6d41\u4e0d\u652f\u6301 mark/reset"

    .line 455
    .line 456
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 460
    :catchall_6
    move-exception v0

    .line 461
    move-object/from16 p0, v6

    .line 462
    .line 463
    goto :goto_9

    .line 464
    :catchall_7
    move-exception v0

    .line 465
    move-object v1, v7

    .line 466
    :goto_a
    :try_start_e
    invoke-virtual/range {p2 .. p2}, Ljava/io/OutputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 467
    .line 468
    .line 469
    :catchall_8
    :try_start_f
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 470
    :catchall_9
    move-exception v0

    .line 471
    if-eqz v7, :cond_10

    .line 472
    .line 473
    :try_start_10
    invoke-virtual {v7}, Ljava/io/BufferedInputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 474
    .line 475
    .line 476
    :catchall_a
    :cond_10
    if-eqz v1, :cond_11

    .line 477
    .line 478
    invoke-virtual {v1}, Lvx;->α()V

    .line 479
    .line 480
    .line 481
    :cond_11
    throw v0

    .line 482
    :cond_12
    :try_start_11
    invoke-virtual/range {p2 .. p2}, Ljava/io/OutputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 483
    .line 484
    .line 485
    :catchall_b
    new-instance v0, Ljava/lang/Exception;

    .line 486
    .line 487
    invoke-static/range {p0 .. p1}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    const-string v2, "\u5019\u9009\u5730\u5740\u4e0d\u662f\u53ef\u76f4\u63a5\u4fdd\u5b58\u7684 MP4 \u89c6\u9891: "

    .line 492
    .line 493
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    throw v0
.end method

.method public final З(Lky0;Ljava/io/OutputStream;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lky0;->κ:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x2000

    .line 9
    .line 10
    :try_start_0
    new-array v2, v2, [B

    .line 11
    .line 12
    :goto_0
    iget-object v3, p1, Lky0;->γ:Ljava/io/BufferedInputStream;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/io/InputStream;->read([B)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, -0x1

    .line 19
    if-eq v3, v4, :cond_0

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-virtual {v1, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 30
    .line 31
    .line 32
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    array-length v1, v2

    .line 40
    if-eqz v1, :cond_4

    .line 41
    .line 42
    :try_start_1
    invoke-static {p0, v2}, Lqy0;->ψ(Lqy0;[B)Landroid/graphics/Bitmap;

    .line 43
    .line 44
    .line 45
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 46
    :try_start_2
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 47
    .line 48
    const/16 v3, 0x5f

    .line 49
    .line 50
    invoke-virtual {v1, v2, v3, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 57
    .line 58
    .line 59
    :try_start_3
    invoke-interface {p2}, Ljava/io/Closeable;->close()V

    .line 60
    .line 61
    .line 62
    const-string p2, "DYHelper"

    .line 63
    .line 64
    iget-object p1, p1, Lky0;->α:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {p0, p1}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    new-instance p1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v2, "[IMG-TRANSCODE] "

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, " -> image/jpeg, url="

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-nez p0, :cond_1

    .line 103
    .line 104
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 105
    .line 106
    .line 107
    :cond_1
    return-void

    .line 108
    :catchall_1
    move-exception p0

    .line 109
    goto :goto_2

    .line 110
    :catchall_2
    move-exception p0

    .line 111
    goto :goto_1

    .line 112
    :cond_2
    :try_start_4
    new-instance p0, Ljava/lang/Exception;

    .line 113
    .line 114
    const-string p1, "JPEG \u538b\u7f29\u5931\u8d25"

    .line 115
    .line 116
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 120
    :goto_1
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 121
    :catchall_3
    move-exception p1

    .line 122
    :try_start_6
    invoke-static {p2, p0}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 126
    :goto_2
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-nez p1, :cond_3

    .line 131
    .line 132
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 133
    .line 134
    .line 135
    :cond_3
    throw p0

    .line 136
    :catchall_4
    move-exception p0

    .line 137
    new-instance p1, Ljava/lang/Exception;

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    const-string p2, "\u65e0\u6cd5\u89e3\u7801 "

    .line 144
    .line 145
    const-string v1, " \u56fe\u7247\uff0c\u5df2\u8df3\u8fc7: "

    .line 146
    .line 147
    invoke-static {p2, v0, v1, p0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p1

    .line 155
    :cond_4
    new-instance p0, Ljava/lang/Exception;

    .line 156
    .line 157
    const-string p1, "\u56fe\u7247\u5185\u5bb9\u4e3a\u7a7a\uff0c\u65e0\u6cd5\u8f6c\u7801"

    .line 158
    .line 159
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw p0

    .line 163
    :goto_3
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 164
    :catchall_5
    move-exception p1

    .line 165
    invoke-static {v1, p0}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    throw p1
.end method

.method public final И(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "\u89c6\u9891\u53ef\u64ad\u653e\u6821\u9a8c\u5931\u8d25: "

    .line 8
    .line 9
    const-string v4, "\u89c6\u9891\u65e0\u6709\u6548\u5c3a\u5bf8 width="

    .line 10
    .line 11
    const-string v5, "[VIDEO-VALID] ok, mime="

    .line 12
    .line 13
    const-string v6, "MP4 \u65e0\u6cd5\u89e3\u7801\u9996\u5e27\uff0c\u7591\u4f3c\u65e0\u89c6\u9891\u5e27/\u7f16\u7801\u4e0d\u517c\u5bb9/\u7279\u6b8a\u7247\u6bb5: "

    .line 14
    .line 15
    const-string v7, "\u89c6\u9891\u65e0\u6709\u6548\u65f6\u957f duration="

    .line 16
    .line 17
    const-string v8, "\u6587\u4ef6\u4e0d\u662f\u89c6\u9891 mime="

    .line 18
    .line 19
    new-instance v9, Landroid/media/MediaMetadataRetriever;

    .line 20
    .line 21
    invoke-direct {v9}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 22
    .line 23
    .line 24
    move-object/from16 v11, p1

    .line 25
    .line 26
    :try_start_0
    invoke-virtual {v9, v11, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    const/4 v11, 0x0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    :try_start_1
    invoke-virtual {v11}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 32
    .line 33
    .line 34
    move-result-object v11

    .line 35
    const-string v12, "r"

    .line 36
    .line 37
    invoke-virtual {v11, v0, v12}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 38
    .line 39
    .line 40
    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    .line 41
    if-eqz v11, :cond_e

    .line 42
    .line 43
    :try_start_2
    invoke-virtual {v11}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v9, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 48
    .line 49
    .line 50
    :goto_0
    const/16 v0, 0xc

    .line 51
    .line 52
    :try_start_3
    invoke-virtual {v9, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    const/16 v0, 0x9

    .line 57
    .line 58
    invoke-virtual {v9, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 62
    const/16 v15, 0xa

    .line 63
    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    :try_start_4
    invoke-static {v0, v15}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_0

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 73
    .line 74
    .line 75
    move-result-wide v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 76
    move-object/from16 p1, v11

    .line 77
    .line 78
    move-wide/from16 v10, v16

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    move-object v10, v11

    .line 83
    goto/16 :goto_9

    .line 84
    .line 85
    :cond_0
    move-object/from16 p1, v11

    .line 86
    .line 87
    const-wide/16 v10, 0x0

    .line 88
    .line 89
    :goto_1
    const/16 v0, 0x12

    .line 90
    .line 91
    :try_start_5
    invoke-virtual {v9, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-wide/16 v17, 0x0

    .line 96
    .line 97
    const/4 v13, 0x0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    invoke-static {v0, v15}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move v14, v0

    .line 111
    goto :goto_3

    .line 112
    :catchall_2
    move-exception v0

    .line 113
    :goto_2
    move-object/from16 v10, p1

    .line 114
    .line 115
    goto/16 :goto_9

    .line 116
    .line 117
    :cond_1
    move v14, v13

    .line 118
    :goto_3
    const/16 v0, 0x13

    .line 119
    .line 120
    invoke-virtual {v9, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-eqz v0, :cond_2

    .line 125
    .line 126
    invoke-static {v0, v15}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-eqz v0, :cond_2

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    move v15, v0

    .line 137
    goto :goto_4

    .line 138
    :cond_2
    move v15, v13

    .line 139
    :goto_4
    if-eqz v12, :cond_5

    .line 140
    .line 141
    invoke-static {v12}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_3
    const-string v0, "video/"

    .line 149
    .line 150
    invoke-static {v12, v0, v13}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_4

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_4
    new-instance v0, Ljava/lang/Exception;

    .line 158
    .line 159
    invoke-virtual {v8, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 167
    :cond_5
    :goto_5
    cmp-long v0, v10, v17

    .line 168
    .line 169
    if-lez v0, :cond_d

    .line 170
    .line 171
    if-lez v14, :cond_c

    .line 172
    .line 173
    if-lez v15, :cond_c

    .line 174
    .line 175
    const/4 v0, 0x2

    .line 176
    move-wide/from16 v7, v17

    .line 177
    .line 178
    :try_start_6
    invoke-virtual {v9, v7, v8, v0}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 179
    .line 180
    .line 181
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 182
    goto :goto_6

    .line 183
    :catchall_3
    move-exception v0

    .line 184
    :try_start_7
    new-instance v4, Leo1;

    .line 185
    .line 186
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    move-object v0, v4

    .line 190
    :goto_6
    instance-of v4, v0, Leo1;

    .line 191
    .line 192
    if-eqz v4, :cond_6

    .line 193
    .line 194
    const/4 v0, 0x0

    .line 195
    :cond_6
    check-cast v0, Landroid/graphics/Bitmap;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 196
    .line 197
    if-nez v0, :cond_8

    .line 198
    .line 199
    const-wide/32 v7, 0x493e0

    .line 200
    .line 201
    .line 202
    const/4 v0, 0x3

    .line 203
    :try_start_8
    invoke-virtual {v9, v7, v8, v0}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 204
    .line 205
    .line 206
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 207
    goto :goto_7

    .line 208
    :catchall_4
    move-exception v0

    .line 209
    :try_start_9
    new-instance v4, Leo1;

    .line 210
    .line 211
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    move-object v0, v4

    .line 215
    :goto_7
    instance-of v4, v0, Leo1;

    .line 216
    .line 217
    if-eqz v4, :cond_7

    .line 218
    .line 219
    const/16 v16, 0x0

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_7
    move-object/from16 v16, v0

    .line 223
    .line 224
    :goto_8
    move-object/from16 v0, v16

    .line 225
    .line 226
    check-cast v0, Landroid/graphics/Bitmap;

    .line 227
    .line 228
    :cond_8
    if-eqz v0, :cond_b

    .line 229
    .line 230
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-nez v4, :cond_9

    .line 235
    .line 236
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 237
    .line 238
    .line 239
    :cond_9
    const-string v0, "DYHelper"

    .line 240
    .line 241
    invoke-static {v1, v2}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    new-instance v2, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string v4, ", duration="

    .line 254
    .line 255
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-string v4, "ms, size="

    .line 262
    .line 263
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    const-string v4, "x"

    .line 270
    .line 271
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    const-string v4, ", url="

    .line 278
    .line 279
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 290
    .line 291
    .line 292
    :try_start_a
    invoke-virtual {v9}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 293
    .line 294
    .line 295
    :catchall_5
    if-eqz p1, :cond_a

    .line 296
    .line 297
    :try_start_b
    invoke-virtual/range {p1 .. p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 298
    .line 299
    .line 300
    :catchall_6
    :cond_a
    return-void

    .line 301
    :cond_b
    :try_start_c
    new-instance v0, Ljava/lang/Exception;

    .line 302
    .line 303
    invoke-static {v1, v2}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v0

    .line 315
    :cond_c
    new-instance v0, Ljava/lang/Exception;

    .line 316
    .line 317
    new-instance v1, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    const-string v2, " height="

    .line 326
    .line 327
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    throw v0

    .line 341
    :cond_d
    new-instance v0, Ljava/lang/Exception;

    .line 342
    .line 343
    new-instance v1, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 359
    :catchall_7
    move-exception v0

    .line 360
    move-object/from16 p1, v11

    .line 361
    .line 362
    goto/16 :goto_2

    .line 363
    .line 364
    :cond_e
    :try_start_d
    new-instance v0, Ljava/lang/Exception;

    .line 365
    .line 366
    const-string v1, "\u65e0\u6cd5\u6253\u5f00\u89c6\u9891\u6587\u4ef6\u7528\u4e8e\u6821\u9a8c"

    .line 367
    .line 368
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 372
    :catchall_8
    move-exception v0

    .line 373
    const/4 v10, 0x0

    .line 374
    :goto_9
    :try_start_e
    new-instance v1, Ljava/lang/Exception;

    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    new-instance v2, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 396
    :catchall_9
    move-exception v0

    .line 397
    :try_start_f
    invoke-virtual {v9}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    .line 398
    .line 399
    .line 400
    :catchall_a
    if-eqz v10, :cond_f

    .line 401
    .line 402
    :try_start_10
    invoke-virtual {v10}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    .line 403
    .line 404
    .line 405
    :catchall_b
    :cond_f
    throw v0
.end method

.method public final К(Ldy;Ljava/io/OutputStream;Lwy;Ln;)V
    .locals 28

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    const-string v2, "dispose"

    .line 4
    .line 5
    move-object/from16 v0, p1

    .line 6
    .line 7
    iget-object v0, v0, Ldy;->α:[B

    .line 8
    .line 9
    move-object/from16 v3, p3

    .line 10
    .line 11
    iget-object v3, v3, Lwy;->γ:Ldz;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1b

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    if-eq v3, v5, :cond_16

    .line 21
    .line 22
    const/4 v6, 0x2

    .line 23
    if-ne v3, v6, :cond_15

    .line 24
    .line 25
    const-string v3, "getHeight"

    .line 26
    .line 27
    const-string v6, "getWidth"

    .line 28
    .line 29
    const-string v7, "~79044D3538AD43BD286720E4220A28BE7EDE3EA6695F9469A66D98AAFA17B052FD99C508"

    .line 30
    .line 31
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    move-object/from16 v8, p4

    .line 36
    .line 37
    iget-object v8, v8, Ln;->ζ:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v8, Ljava/lang/ClassLoader;

    .line 40
    .line 41
    invoke-static {v7, v5, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    const-class v8, [B

    .line 46
    .line 47
    filled-new-array {v8}, [Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    const-string v9, "create"

    .line 52
    .line 53
    invoke-virtual {v7, v9, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v8, 0x0

    .line 62
    invoke-virtual {v7, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    if-eqz v7, :cond_14

    .line 67
    .line 68
    :try_start_0
    invoke-static {v7, v6}, Ln;->Β(Ljava/lang/Object;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    invoke-static {v7, v3}, Ln;->Β(Ljava/lang/Object;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    const-string v0, "getFrameCount"

    .line 77
    .line 78
    invoke-static {v7, v0}, Ln;->Β(Ljava/lang/Object;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    const-string v0, "getLoopCount"

    .line 83
    .line 84
    invoke-static {v7, v0}, Ln;->Β(Ljava/lang/Object;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    const v11, 0xffff

    .line 89
    .line 90
    .line 91
    const/4 v13, 0x0

    .line 92
    invoke-static {v0, v13, v11}, Lj81;->μ(III)I

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    invoke-static {v12, v9, v10}, Ln;->Θ(III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    .line 97
    .line 98
    .line 99
    :try_start_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v14, "getFrameDurations"

    .line 104
    .line 105
    invoke-virtual {v0, v14, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    instance-of v14, v0, [I

    .line 114
    .line 115
    if-eqz v14, :cond_0

    .line 116
    .line 117
    check-cast v0, [I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    goto :goto_0

    .line 122
    :cond_0
    move-object v0, v8

    .line 123
    goto :goto_1

    .line 124
    :goto_0
    :try_start_2
    new-instance v14, Leo1;

    .line 125
    .line 126
    invoke-direct {v14, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    move-object v0, v14

    .line 130
    :goto_1
    instance-of v14, v0, Leo1;

    .line 131
    .line 132
    if-eqz v14, :cond_1

    .line 133
    .line 134
    move-object v0, v8

    .line 135
    :cond_1
    move-object v14, v0

    .line 136
    check-cast v14, [I

    .line 137
    .line 138
    invoke-static {v1, v12, v9, v11}, Ln;->π(Ljava/io/OutputStream;III)Lt3;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 143
    .line 144
    invoke-static {v12, v9, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-static {v12, v9, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 152
    .line 153
    .line 154
    move-result-object v17

    .line 155
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    const/16 p1, 0x64

    .line 159
    .line 160
    new-instance v4, Landroid/graphics/Canvas;

    .line 161
    .line 162
    invoke-direct {v4, v15}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 163
    .line 164
    .line 165
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 166
    .line 167
    invoke-virtual {v4, v13, v0}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 168
    .line 169
    .line 170
    mul-int v0, v12, v9

    .line 171
    .line 172
    move/from16 p3, v5

    .line 173
    .line 174
    new-array v5, v0, [I

    .line 175
    .line 176
    new-array v8, v0, [I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_a

    .line 177
    .line 178
    move-object/from16 p4, v11

    .line 179
    .line 180
    move v11, v13

    .line 181
    const/4 v0, 0x0

    .line 182
    :goto_2
    if-ge v11, v10, :cond_d

    .line 183
    .line 184
    :try_start_3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    move-object/from16 v18, v5

    .line 189
    .line 190
    const-string v5, "getFrame"

    .line 191
    .line 192
    sget-object v19, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 193
    .line 194
    move/from16 v20, v9

    .line 195
    .line 196
    filled-new-array/range {v19 .. v19}, [Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    invoke-virtual {v13, v5, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    invoke-virtual {v5, v7, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    .line 216
    if-eqz v5, :cond_c

    .line 217
    .line 218
    :try_start_4
    new-instance v21, Lue0;

    .line 219
    .line 220
    const-string v9, "getXOffset"

    .line 221
    .line 222
    invoke-static {v5, v9}, Ln;->Β(Ljava/lang/Object;Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    move-result v22

    .line 226
    const-string v9, "getYOffset"

    .line 227
    .line 228
    invoke-static {v5, v9}, Ln;->Β(Ljava/lang/Object;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result v23

    .line 232
    invoke-static {v5, v6}, Ln;->Β(Ljava/lang/Object;Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    move-result v24

    .line 236
    invoke-static {v5, v3}, Ln;->Β(Ljava/lang/Object;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v25

    .line 240
    const-string v9, "isBlendWithPreviousFrame"

    .line 241
    .line 242
    invoke-static {v5, v9}, Ln;->Α(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 243
    .line 244
    .line 245
    move-result v26

    .line 246
    const-string v9, "shouldDisposeToBackgroundColor"

    .line 247
    .line 248
    invoke-static {v5, v9}, Ln;->Α(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 249
    .line 250
    .line 251
    move-result v27

    .line 252
    invoke-direct/range {v21 .. v27}, Lue0;-><init>(IIIIZZ)V

    .line 253
    .line 254
    .line 255
    move-object/from16 v19, v3

    .line 256
    .line 257
    move-object/from16 v9, v21

    .line 258
    .line 259
    move/from16 v13, v22

    .line 260
    .line 261
    move/from16 v3, v23

    .line 262
    .line 263
    if-eqz v0, :cond_4

    .line 264
    .line 265
    move-object/from16 v21, v6

    .line 266
    .line 267
    iget-boolean v6, v0, Lue0;->ζ:Z

    .line 268
    .line 269
    if-eqz v6, :cond_2

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_2
    const/4 v0, 0x0

    .line 273
    :goto_3
    if-eqz v0, :cond_3

    .line 274
    .line 275
    invoke-virtual {v4}, Landroid/graphics/Canvas;->save()I

    .line 276
    .line 277
    .line 278
    iget v6, v0, Lue0;->α:I

    .line 279
    .line 280
    move/from16 v22, v10

    .line 281
    .line 282
    iget v10, v0, Lue0;->β:I

    .line 283
    .line 284
    move/from16 v23, v11

    .line 285
    .line 286
    iget v11, v0, Lue0;->γ:I

    .line 287
    .line 288
    add-int/2addr v11, v6

    .line 289
    iget v0, v0, Lue0;->δ:I

    .line 290
    .line 291
    add-int/2addr v0, v10

    .line 292
    invoke-virtual {v4, v6, v10, v11, v0}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 293
    .line 294
    .line 295
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 296
    .line 297
    const/4 v6, 0x0

    .line 298
    invoke-virtual {v4, v6, v0}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v4}, Landroid/graphics/Canvas;->restore()V

    .line 302
    .line 303
    .line 304
    goto :goto_7

    .line 305
    :goto_4
    move-object/from16 v23, v15

    .line 306
    .line 307
    :goto_5
    move-object/from16 v9, v17

    .line 308
    .line 309
    goto/16 :goto_c

    .line 310
    .line 311
    :cond_3
    :goto_6
    move/from16 v22, v10

    .line 312
    .line 313
    move/from16 v23, v11

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :catchall_1
    move-exception v0

    .line 317
    goto :goto_4

    .line 318
    :cond_4
    move-object/from16 v21, v6

    .line 319
    .line 320
    goto :goto_6

    .line 321
    :goto_7
    if-nez v26, :cond_5

    .line 322
    .line 323
    invoke-virtual {v4}, Landroid/graphics/Canvas;->save()I

    .line 324
    .line 325
    .line 326
    add-int v0, v13, v24

    .line 327
    .line 328
    add-int v6, v3, v25

    .line 329
    .line 330
    invoke-virtual {v4, v13, v3, v0, v6}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 331
    .line 332
    .line 333
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 334
    .line 335
    const/4 v6, 0x0

    .line 336
    invoke-virtual {v4, v6, v0}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v4}, Landroid/graphics/Canvas;->restore()V

    .line 340
    .line 341
    .line 342
    goto :goto_8

    .line 343
    :cond_5
    const/4 v6, 0x0

    .line 344
    :goto_8
    invoke-static {v5, v9, v4}, Ln;->Δ(Ljava/lang/Object;Lue0;Landroid/graphics/Canvas;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 345
    .line 346
    .line 347
    const/4 v13, 0x0

    .line 348
    move-object v3, v14

    .line 349
    const/4 v14, 0x0

    .line 350
    const/4 v11, 0x0

    .line 351
    move-object v10, v9

    .line 352
    move-object v9, v15

    .line 353
    move v15, v12

    .line 354
    move-object/from16 v6, p4

    .line 355
    .line 356
    move-object/from16 p4, v4

    .line 357
    .line 358
    move/from16 v16, v20

    .line 359
    .line 360
    move/from16 v4, v23

    .line 361
    .line 362
    move-object/from16 v20, v10

    .line 363
    .line 364
    move-object/from16 v10, v18

    .line 365
    .line 366
    :try_start_5
    invoke-virtual/range {v9 .. v16}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 367
    .line 368
    .line 369
    move-object/from16 v23, v9

    .line 370
    .line 371
    move-object v9, v10

    .line 372
    :try_start_6
    invoke-static {v9, v8}, Ljx0;->Ξ([I[I)Ljava/lang/Integer;

    .line 373
    .line 374
    .line 375
    move-result-object v24
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 376
    const/4 v13, 0x0

    .line 377
    const/4 v14, 0x0

    .line 378
    const/4 v11, 0x0

    .line 379
    move v15, v12

    .line 380
    move-object v10, v8

    .line 381
    move-object v8, v9

    .line 382
    move-object/from16 v9, v17

    .line 383
    .line 384
    :try_start_7
    invoke-virtual/range {v9 .. v16}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 385
    .line 386
    .line 387
    if-eqz v3, :cond_7

    .line 388
    .line 389
    if-ltz v4, :cond_6

    .line 390
    .line 391
    array-length v0, v3

    .line 392
    if-ge v4, v0, :cond_6

    .line 393
    .line 394
    aget v0, v3, v4

    .line 395
    .line 396
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    goto :goto_9

    .line 401
    :cond_6
    const/4 v0, 0x0

    .line 402
    :goto_9
    if-eqz v0, :cond_7

    .line 403
    .line 404
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 408
    goto :goto_b

    .line 409
    :catchall_2
    move-exception v0

    .line 410
    goto/16 :goto_c

    .line 411
    .line 412
    :cond_7
    :try_start_8
    const-string v0, "getDurationMs"

    .line 413
    .line 414
    invoke-static {v5, v0}, Ln;->Β(Ljava/lang/Object;Ljava/lang/String;)I

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 422
    goto :goto_a

    .line 423
    :catchall_3
    move-exception v0

    .line 424
    :try_start_9
    new-instance v11, Leo1;

    .line 425
    .line 426
    invoke-direct {v11, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 427
    .line 428
    .line 429
    move-object v0, v11

    .line 430
    :goto_a
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    .line 432
    .line 433
    move-result-object v11

    .line 434
    instance-of v13, v0, Leo1;

    .line 435
    .line 436
    if-eqz v13, :cond_8

    .line 437
    .line 438
    move-object v0, v11

    .line 439
    :cond_8
    check-cast v0, Ljava/lang/Number;

    .line 440
    .line 441
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    :goto_b
    const/16 v11, 0xa

    .line 446
    .line 447
    if-ge v0, v11, :cond_9

    .line 448
    .line 449
    move v0, v11

    .line 450
    :cond_9
    int-to-float v0, v0

    .line 451
    const/high16 v11, 0x41200000    # 10.0f

    .line 452
    .line 453
    div-float/2addr v0, v11

    .line 454
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    iput v0, v6, Lt3;->θ:I

    .line 459
    .line 460
    if-eqz v24, :cond_a

    .line 461
    .line 462
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Number;->intValue()I

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    iput-object v0, v6, Lt3;->ε:Ljava/lang/Integer;

    .line 471
    .line 472
    :cond_a
    invoke-virtual {v6, v9}, Lt3;->α(Landroid/graphics/Bitmap;)Z

    .line 473
    .line 474
    .line 475
    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 476
    if-eqz v0, :cond_b

    .line 477
    .line 478
    :try_start_a
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    const/4 v11, 0x0

    .line 483
    invoke-virtual {v0, v2, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v0, v5, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 488
    .line 489
    .line 490
    :catchall_4
    add-int/lit8 v11, v4, 0x1

    .line 491
    .line 492
    move-object/from16 v4, p4

    .line 493
    .line 494
    move-object v14, v3

    .line 495
    move-object/from16 p4, v6

    .line 496
    .line 497
    move-object v5, v8

    .line 498
    move-object/from16 v17, v9

    .line 499
    .line 500
    move-object v8, v10

    .line 501
    move/from16 v9, v16

    .line 502
    .line 503
    move-object/from16 v3, v19

    .line 504
    .line 505
    move-object/from16 v0, v20

    .line 506
    .line 507
    move-object/from16 v6, v21

    .line 508
    .line 509
    move/from16 v10, v22

    .line 510
    .line 511
    move-object/from16 v15, v23

    .line 512
    .line 513
    const/4 v13, 0x0

    .line 514
    goto/16 :goto_2

    .line 515
    .line 516
    :cond_b
    add-int/lit8 v11, v4, 0x1

    .line 517
    .line 518
    :try_start_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 519
    .line 520
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 521
    .line 522
    .line 523
    const-string v1, "GIF \u7f16\u7801\u5668\u5199\u5165\u7b2c "

    .line 524
    .line 525
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    const-string v1, " \u5e27\u5931\u8d25"

    .line 532
    .line 533
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 541
    .line 542
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 550
    :catchall_5
    move-exception v0

    .line 551
    goto/16 :goto_5

    .line 552
    .line 553
    :catchall_6
    move-exception v0

    .line 554
    move-object/from16 v23, v9

    .line 555
    .line 556
    goto/16 :goto_5

    .line 557
    .line 558
    :goto_c
    :try_start_c
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    const/4 v11, 0x0

    .line 563
    invoke-virtual {v1, v2, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-virtual {v1, v5, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 568
    .line 569
    .line 570
    :catchall_7
    :try_start_d
    throw v0

    .line 571
    :catchall_8
    move-exception v0

    .line 572
    goto/16 :goto_11

    .line 573
    .line 574
    :cond_c
    move v4, v11

    .line 575
    move-object/from16 v23, v15

    .line 576
    .line 577
    move-object/from16 v9, v17

    .line 578
    .line 579
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 580
    .line 581
    add-int/lit8 v11, v4, 0x1

    .line 582
    .line 583
    new-instance v1, Ljava/lang/StringBuilder;

    .line 584
    .line 585
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 586
    .line 587
    .line 588
    const-string v3, "\u5bbf\u4e3b WebP \u7b2c "

    .line 589
    .line 590
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    const-string v3, " \u5e27\u4e3a\u7a7a"

    .line 597
    .line 598
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    throw v0

    .line 609
    :catchall_9
    move-exception v0

    .line 610
    move-object/from16 v23, v15

    .line 611
    .line 612
    move-object/from16 v9, v17

    .line 613
    .line 614
    goto :goto_11

    .line 615
    :cond_d
    move-object/from16 v6, p4

    .line 616
    .line 617
    move-object/from16 v23, v15

    .line 618
    .line 619
    move-object/from16 v9, v17

    .line 620
    .line 621
    iget-boolean v0, v6, Lt3;->ι:Z

    .line 622
    .line 623
    if-nez v0, :cond_e

    .line 624
    .line 625
    const/4 v13, 0x0

    .line 626
    goto :goto_f

    .line 627
    :cond_e
    const/4 v3, 0x0

    .line 628
    iput-boolean v3, v6, Lt3;->ι:Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 629
    .line 630
    :try_start_e
    iget-object v0, v6, Lt3;->κ:Ljava/io/OutputStream;

    .line 631
    .line 632
    const/16 v3, 0x3b

    .line 633
    .line 634
    invoke-virtual {v0, v3}, Ljava/io/OutputStream;->write(I)V

    .line 635
    .line 636
    .line 637
    iget-object v0, v6, Lt3;->κ:Ljava/io/OutputStream;

    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 640
    .line 641
    .line 642
    move/from16 v13, p3

    .line 643
    .line 644
    :goto_d
    const/4 v3, 0x0

    .line 645
    goto :goto_e

    .line 646
    :catch_0
    const/4 v13, 0x0

    .line 647
    goto :goto_d

    .line 648
    :goto_e
    :try_start_f
    iput v3, v6, Lt3;->ζ:I

    .line 649
    .line 650
    const/4 v11, 0x0

    .line 651
    iput-object v11, v6, Lt3;->κ:Ljava/io/OutputStream;

    .line 652
    .line 653
    iput-object v11, v6, Lt3;->λ:Landroid/graphics/Bitmap;

    .line 654
    .line 655
    iput-object v11, v6, Lt3;->μ:[B

    .line 656
    .line 657
    iput-object v11, v6, Lt3;->ν:[B

    .line 658
    .line 659
    iput-object v11, v6, Lt3;->ο:[B

    .line 660
    .line 661
    move/from16 v3, p3

    .line 662
    .line 663
    iput-boolean v3, v6, Lt3;->τ:Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 664
    .line 665
    :goto_f
    if-eqz v13, :cond_11

    .line 666
    .line 667
    :try_start_10
    invoke-virtual/range {v23 .. v23}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 668
    .line 669
    .line 670
    move-result v0

    .line 671
    if-nez v0, :cond_f

    .line 672
    .line 673
    invoke-virtual/range {v23 .. v23}, Landroid/graphics/Bitmap;->recycle()V

    .line 674
    .line 675
    .line 676
    goto :goto_10

    .line 677
    :catchall_a
    move-exception v0

    .line 678
    goto :goto_12

    .line 679
    :cond_f
    :goto_10
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 680
    .line 681
    .line 682
    move-result v0

    .line 683
    if-nez v0, :cond_10

    .line 684
    .line 685
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 686
    .line 687
    .line 688
    :cond_10
    :try_start_11
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    const/4 v11, 0x0

    .line 693
    invoke-virtual {v0, v2, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-virtual {v0, v7, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 698
    .line 699
    .line 700
    :catchall_b
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 701
    .line 702
    .line 703
    return-void

    .line 704
    :cond_11
    :try_start_12
    const-string v0, "GIF \u7f16\u7801\u5668\u7ed3\u675f\u8f93\u51fa\u5931\u8d25"

    .line 705
    .line 706
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 707
    .line 708
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    throw v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 712
    :goto_11
    :try_start_13
    invoke-virtual/range {v23 .. v23}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 713
    .line 714
    .line 715
    move-result v1

    .line 716
    if-nez v1, :cond_12

    .line 717
    .line 718
    invoke-virtual/range {v23 .. v23}, Landroid/graphics/Bitmap;->recycle()V

    .line 719
    .line 720
    .line 721
    :cond_12
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 722
    .line 723
    .line 724
    move-result v1

    .line 725
    if-nez v1, :cond_13

    .line 726
    .line 727
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->recycle()V

    .line 728
    .line 729
    .line 730
    :cond_13
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 731
    :goto_12
    :try_start_14
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    const/4 v11, 0x0

    .line 736
    invoke-virtual {v1, v2, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    invoke-virtual {v1, v7, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 741
    .line 742
    .line 743
    :catchall_c
    throw v0

    .line 744
    :cond_14
    const-string v0, "\u5bbf\u4e3b WebP \u89e3\u7801\u5668\u672a\u521b\u5efa\u52a8\u753b"

    .line 745
    .line 746
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    return-void

    .line 750
    :cond_15
    invoke-static {}, Lγ;->κ()V

    .line 751
    .line 752
    .line 753
    return-void

    .line 754
    :cond_16
    const/16 p1, 0x64

    .line 755
    .line 756
    array-length v2, v0

    .line 757
    if-eqz v2, :cond_1a

    .line 758
    .line 759
    move-object/from16 v2, p0

    .line 760
    .line 761
    :try_start_15
    invoke-static {v2, v0}, Lqy0;->ψ(Lqy0;[B)Landroid/graphics/Bitmap;

    .line 762
    .line 763
    .line 764
    move-result-object v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_e

    .line 765
    :try_start_16
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 766
    .line 767
    move/from16 v3, p1

    .line 768
    .line 769
    invoke-virtual {v2, v0, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 770
    .line 771
    .line 772
    move-result v0

    .line 773
    if-eqz v0, :cond_18

    .line 774
    .line 775
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    if-nez v0, :cond_17

    .line 783
    .line 784
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 785
    .line 786
    .line 787
    :cond_17
    return-void

    .line 788
    :catchall_d
    move-exception v0

    .line 789
    goto :goto_13

    .line 790
    :cond_18
    :try_start_17
    new-instance v0, Ljava/lang/Exception;

    .line 791
    .line 792
    const-string v1, "PNG \u538b\u7f29\u5931\u8d25"

    .line 793
    .line 794
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    .line 798
    :goto_13
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 799
    .line 800
    .line 801
    move-result v1

    .line 802
    if-nez v1, :cond_19

    .line 803
    .line 804
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 805
    .line 806
    .line 807
    :cond_19
    throw v0

    .line 808
    :catchall_e
    move-exception v0

    .line 809
    new-instance v1, Ljava/lang/Exception;

    .line 810
    .line 811
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v2

    .line 815
    const-string v3, "\u65e0\u6cd5\u89e3\u7801\u9759\u6001\u8868\u60c5\uff0c\u65e0\u6cd5\u8f6c\u4e3a PNG: "

    .line 816
    .line 817
    invoke-static {v3, v2}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 822
    .line 823
    .line 824
    throw v1

    .line 825
    :cond_1a
    new-instance v0, Ljava/lang/Exception;

    .line 826
    .line 827
    const-string v1, "\u56fe\u7247\u5185\u5bb9\u4e3a\u7a7a\uff0c\u65e0\u6cd5\u8f6c\u7801"

    .line 828
    .line 829
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    throw v0

    .line 833
    :cond_1b
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 834
    .line 835
    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 836
    .line 837
    .line 838
    const/high16 v0, 0x10000

    .line 839
    .line 840
    :try_start_18
    invoke-static {v2, v1, v0}, Lh62;->Δ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_f

    .line 841
    .line 842
    .line 843
    invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->close()V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 847
    .line 848
    .line 849
    return-void

    .line 850
    :catchall_f
    move-exception v0

    .line 851
    move-object v1, v0

    .line 852
    :try_start_19
    throw v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_10

    .line 853
    :catchall_10
    move-exception v0

    .line 854
    invoke-static {v2, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 855
    .line 856
    .line 857
    throw v0
.end method

.method public final ж()I
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, Lqy0;->γ:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    sput v1, Lqy0;->γ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    monitor-exit p0

    .line 12
    throw v0
.end method

.method public final п(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/io/File;->length()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-lez v0, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :try_start_0
    const-string v1, "video/mp4"

    .line 19
    .line 20
    invoke-static {p1, p3, p4, v1, p5}, Lqy0;->χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-virtual {p3, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    if-eqz p3, :cond_1

    .line 33
    .line 34
    new-instance p5, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-direct {p5, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    .line 38
    .line 39
    const/high16 p2, 0x20000

    .line 40
    .line 41
    :try_start_1
    new-array p2, p2, [B

    .line 42
    .line 43
    :goto_0
    invoke-virtual {p5, p2}, Ljava/io/FileInputStream;->read([B)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-lez v1, :cond_0

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {p3, p2, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-virtual {p3}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    :try_start_2
    invoke-interface {p3}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 60
    .line 61
    .line 62
    :try_start_3
    invoke-virtual {p5}, Ljava/io/FileInputStream;->close()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1, v0, p4}, Lqy0;->И(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v0}, Lqy0;->д(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    goto :goto_3

    .line 74
    :catchall_2
    move-exception p0

    .line 75
    goto :goto_2

    .line 76
    :goto_1
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 77
    :catchall_3
    move-exception p2

    .line 78
    :try_start_5
    invoke-static {p3, p0}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 82
    :goto_2
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 83
    :catchall_4
    move-exception p2

    .line 84
    :try_start_7
    invoke-static {p5, p0}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw p2

    .line 88
    :cond_1
    new-instance p0, Ljava/lang/Exception;

    .line 89
    .line 90
    const-string p2, "\u65e0\u6cd5\u6253\u5f00\u8f93\u51fa\u6d41"

    .line 91
    .line 92
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 96
    :goto_3
    invoke-static {p1, v0}, Lqy0;->ω(Landroid/content/Context;Landroid/net/Uri;)V

    .line 97
    .line 98
    .line 99
    throw p0

    .line 100
    :cond_2
    new-instance p0, Ljava/lang/Exception;

    .line 101
    .line 102
    const-string p1, "\u89c6\u9891\u4e34\u65f6\u6587\u4ef6\u4e3a\u7a7a"

    .line 103
    .line 104
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p0
.end method

.method public final ц(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/io/File;->canRead()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_b

    .line 12
    .line 13
    const/16 v0, 0x40

    .line 14
    .line 15
    new-array v0, v0, [B

    .line 16
    .line 17
    new-instance v1, Ljava/io/FileInputStream;

    .line 18
    .line 19
    invoke-direct {v1, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/io/FileInputStream;->read([B)I

    .line 23
    .line 24
    .line 25
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 26
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 27
    .line 28
    .line 29
    if-lez v2, :cond_a

    .line 30
    .line 31
    invoke-static {v0, v2}, Ljx0;->φ([BI)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    const-string v0, "image/jpeg"

    .line 38
    .line 39
    :cond_0
    const-string v1, "image/"

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static {v0, v1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_9

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    if-eqz p3, :cond_2

    .line 50
    .line 51
    invoke-static {p3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move-object p3, v1

    .line 59
    :goto_0
    if-eqz p3, :cond_2

    .line 60
    .line 61
    new-instance v2, Ljava/io/File;

    .line 62
    .line 63
    invoke-direct {v2, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move-object p3, v1

    .line 72
    :goto_1
    const-string v2, ""

    .line 73
    .line 74
    if-nez p3, :cond_3

    .line 75
    .line 76
    move-object p3, v2

    .line 77
    :cond_3
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    const/16 v4, 0x2e

    .line 85
    .line 86
    invoke-static {v3, v4}, Lq02;->Φ(Ljava/lang/CharSequence;C)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object v3, v1

    .line 94
    :goto_2
    if-nez v3, :cond_5

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    move-object v2, v3

    .line 98
    :goto_3
    invoke-static {p3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    move-object p3, v2

    .line 105
    :cond_6
    invoke-static {p3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    const-string v3, "."

    .line 110
    .line 111
    const-string v4, "jpg"

    .line 112
    .line 113
    if-eqz v2, :cond_7

    .line 114
    .line 115
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 116
    .line 117
    .line 118
    move-result-wide v5

    .line 119
    invoke-static {v0, v4}, Ljx0;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    new-instance v2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v7, "comment_image_"

    .line 126
    .line 127
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    :cond_7
    invoke-static {p3}, Lku;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    invoke-static {p3, p3}, Lq02;->э(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    invoke-static {v0, v4}, Ljx0;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    sget-object v4, Ljy0;->ε:Ljy0;

    .line 156
    .line 157
    invoke-static {p0, p1, v1, v4, p3}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    const-string p3, "\u8bc4\u8bba\u533a\u56fe\u7247"

    .line 162
    .line 163
    invoke-static {p0, p3}, Lpd2;->γ(Lfv;Ljava/lang/String;)Lfv;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    iget-object p3, p0, Lfv;->β:Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {p3, v3, v2}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    :try_start_1
    iget-object p0, p0, Lfv;->α:Ljava/lang/String;

    .line 174
    .line 175
    sget-object v2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-static {p1, p0, p3, v0, v2}, Lqy0;->χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0, v1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 189
    .line 190
    .line 191
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    if-eqz p0, :cond_8

    .line 193
    .line 194
    :try_start_2
    new-instance p3, Ljava/io/FileInputStream;

    .line 195
    .line 196
    invoke-direct {p3, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 197
    .line 198
    .line 199
    const/high16 p2, 0x10000

    .line 200
    .line 201
    :try_start_3
    invoke-static {p3, p0, p2}, Lh62;->Δ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 202
    .line 203
    .line 204
    :try_start_4
    invoke-virtual {p3}, Ljava/io/FileInputStream;->close()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 208
    .line 209
    .line 210
    :try_start_5
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 211
    .line 212
    .line 213
    invoke-static {p1, v1}, Lqy0;->д(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :catchall_0
    move-exception p0

    .line 218
    goto :goto_5

    .line 219
    :catchall_1
    move-exception p2

    .line 220
    goto :goto_4

    .line 221
    :catchall_2
    move-exception p2

    .line 222
    :try_start_6
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 223
    :catchall_3
    move-exception v0

    .line 224
    :try_start_7
    invoke-static {p3, p2}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 225
    .line 226
    .line 227
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 228
    :goto_4
    :try_start_8
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 229
    :catchall_4
    move-exception p3

    .line 230
    :try_start_9
    invoke-static {p0, p2}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    throw p3

    .line 234
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 235
    .line 236
    const-string p2, "\u8bc4\u8bba\u533a\u56fe\u7247\u8f93\u51fa\u6d41\u4e3a\u7a7a"

    .line 237
    .line 238
    invoke-direct {p0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 242
    :goto_5
    invoke-static {p1, v1}, Lqy0;->ω(Landroid/content/Context;Landroid/net/Uri;)V

    .line 243
    .line 244
    .line 245
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 246
    .line 247
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    const-string p3, "\u8bc4\u8bba\u533a\u56fe\u7247\u5199\u5165\u7528\u6237\u4e0b\u8f7d\u8def\u5f84\u5931\u8d25: "

    .line 252
    .line 253
    invoke-static {p3, p2}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    throw p1

    .line 261
    :cond_9
    const-string p0, "\u5bbf\u4e3b\u8bc4\u8bba\u56fe\u7247\u683c\u5f0f\u65e0\u6548: "

    .line 262
    .line 263
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :cond_a
    const-string p0, "\u5bbf\u4e3b\u8bc4\u8bba\u56fe\u7247\u4e34\u65f6\u6587\u4ef6\u4e3a\u7a7a"

    .line 272
    .line 273
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :catchall_5
    move-exception p0

    .line 278
    :try_start_a
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 279
    :catchall_6
    move-exception p1

    .line 280
    invoke-static {v1, p0}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 281
    .line 282
    .line 283
    throw p1

    .line 284
    :cond_b
    const-string p0, "\u5bbf\u4e3b\u8bc4\u8bba\u56fe\u7247\u4e34\u65f6\u6587\u4ef6\u4e0d\u53ef\u8bfb"

    .line 285
    .line 286
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    return-void
.end method

.method public final ч(Landroid/content/Context;Lf8;Lru0;ZLjava/lang/String;Ljava/lang/String;Lfv;)Ljava/util/ArrayList;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move-object/from16 v7, p5

    .line 8
    .line 9
    new-instance v11, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static/range {p1 .. p2}, Lqy0;->ζ(Landroid/content/Context;Lf8;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    if-nez p7, :cond_0

    .line 19
    .line 20
    sget-object v4, Ljy0;->ι:Ljy0;

    .line 21
    .line 22
    move-object/from16 v5, p2

    .line 23
    .line 24
    invoke-static {v1, v2, v5, v4, v3}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    move-object v12, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object/from16 v5, p2

    .line 31
    .line 32
    move-object/from16 v12, p7

    .line 33
    .line 34
    :goto_0
    iget-object v3, v12, Lfv;->β:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v4, v0, Lru0;->δ:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v13, v0, Lru0;->β:Ljava/util/List;

    .line 39
    .line 40
    iget-object v10, v0, Lru0;->γ:Ljava/util/List;

    .line 41
    .line 42
    iget v14, v0, Lru0;->α:I

    .line 43
    .line 44
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    add-int/lit8 v0, v14, 0x1

    .line 51
    .line 52
    const-string v4, "_page"

    .line 53
    .line 54
    invoke-static {v4, v0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lku;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const/16 v15, 0x64

    .line 78
    .line 79
    invoke-static {v0, v15}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_2

    .line 88
    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 90
    .line 91
    .line 92
    move-result-wide v3

    .line 93
    const-string v0, "livephoto_fallback_"

    .line 94
    .line 95
    invoke-static {v3, v4, v0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :cond_2
    move-object v3, v0

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v4, "[LIVEPHOTO-MERGE-DOWNGRADE] page="

    .line 103
    .line 104
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v4, ", reason="

    .line 111
    .line 112
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    move-object/from16 v4, p6

    .line 116
    .line 117
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const-string v4, "DYHelper"

    .line 125
    .line 126
    invoke-static {v4, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    if-eqz v7, :cond_3

    .line 130
    .line 131
    const-string v0, "\u5408\u5e76\u5931\u8d25\uff0c\u964d\u7ea7\u4fdd\u5b58\u539f\u59cb\u8d44\u6e90"

    .line 132
    .line 133
    const/16 v6, 0x5a

    .line 134
    .line 135
    invoke-static {v6, v2, v7, v0}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    const/16 v16, 0x0

    .line 143
    .line 144
    move/from16 v6, v16

    .line 145
    .line 146
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    const-string v9, "/"

    .line 151
    .line 152
    move-object/from16 p7, v10

    .line 153
    .line 154
    const/4 v10, 0x1

    .line 155
    if-eqz v8, :cond_5

    .line 156
    .line 157
    add-int/2addr v6, v10

    .line 158
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    check-cast v8, Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v8}, Lqy0;->у(Ljava/lang/String;)Lmu;

    .line 165
    .line 166
    .line 167
    move-result-object v15

    .line 168
    iget-object v15, v15, Lmu;->β:Ljava/lang/String;

    .line 169
    .line 170
    move/from16 p6, v10

    .line 171
    .line 172
    const-string v10, "_fallback_video."

    .line 173
    .line 174
    invoke-static {v3, v10, v15}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    invoke-interface/range {p7 .. p7}, Ljava/util/List;->size()I

    .line 179
    .line 180
    .line 181
    move-result v15

    .line 182
    move-object/from16 v17, v0

    .line 183
    .line 184
    const-string v0, "\u964d\u7ea7\u89c6\u9891 "

    .line 185
    .line 186
    invoke-static {v6, v15, v0, v9}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    move-object v15, v9

    .line 191
    iget-object v9, v12, Lfv;->α:Ljava/lang/String;

    .line 192
    .line 193
    move-object/from16 v18, v15

    .line 194
    .line 195
    move-object v15, v3

    .line 196
    move-object v3, v5

    .line 197
    move-object v5, v10

    .line 198
    move-object/from16 v10, v18

    .line 199
    .line 200
    move-object/from16 v18, v13

    .line 201
    .line 202
    move-object v13, v4

    .line 203
    move-object v4, v8

    .line 204
    move-object v8, v0

    .line 205
    move v0, v6

    .line 206
    move/from16 v6, p4

    .line 207
    .line 208
    invoke-virtual/range {v1 .. v9}, Lqy0;->Η(Landroid/content/Context;Lf8;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-eqz v4, :cond_4

    .line 213
    .line 214
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_4
    move-object/from16 v5, p2

    .line 219
    .line 220
    move-object/from16 v7, p5

    .line 221
    .line 222
    move-object/from16 v10, p7

    .line 223
    .line 224
    move v6, v0

    .line 225
    move-object v4, v13

    .line 226
    move-object v3, v15

    .line 227
    move-object/from16 v0, v17

    .line 228
    .line 229
    move-object/from16 v13, v18

    .line 230
    .line 231
    const/16 v15, 0x64

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_5
    move-object v15, v3

    .line 235
    move/from16 p6, v10

    .line 236
    .line 237
    move-object/from16 v18, v13

    .line 238
    .line 239
    move-object v13, v4

    .line 240
    move-object v10, v9

    .line 241
    :goto_2
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v17

    .line 245
    :goto_3
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_b

    .line 250
    .line 251
    add-int/lit8 v3, v16, 0x1

    .line 252
    .line 253
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    move-object v4, v0

    .line 258
    check-cast v4, Ljava/lang/String;

    .line 259
    .line 260
    const-string v0, "_fallback_image"

    .line 261
    .line 262
    invoke-virtual {v15, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    const-string v6, "\u964d\u7ea7\u56fe\u7247 "

    .line 271
    .line 272
    invoke-static {v3, v5, v6, v10}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    iget-object v6, v12, Lfv;->α:Ljava/lang/String;

    .line 277
    .line 278
    const-string v7, "[LIVEPHOTO-RAW-IMAGE-FAIL] url="

    .line 279
    .line 280
    const-string v8, "[LIVEPHOTO-RAW-IMAGE-DL] file="

    .line 281
    .line 282
    const/16 v16, 0x0

    .line 283
    .line 284
    :try_start_0
    invoke-static {v4}, Lqy0;->о(Ljava/lang/String;)Lky0;

    .line 285
    .line 286
    .line 287
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_c

    .line 288
    move-object/from16 p2, v0

    .line 289
    .line 290
    :try_start_1
    iget-object v0, v9, Lky0;->κ:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_b

    .line 291
    .line 292
    move/from16 p5, v3

    .line 293
    .line 294
    :try_start_2
    const-string v3, "image/"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_a

    .line 295
    .line 296
    move-object/from16 p7, v5

    .line 297
    .line 298
    move/from16 v5, p6

    .line 299
    .line 300
    :try_start_3
    invoke-static {v0, v3, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 301
    .line 302
    .line 303
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    .line 304
    if-eqz v3, :cond_6

    .line 305
    .line 306
    move-object v3, v0

    .line 307
    goto :goto_4

    .line 308
    :cond_6
    move-object/from16 v3, v16

    .line 309
    .line 310
    :goto_4
    if-nez v3, :cond_7

    .line 311
    .line 312
    :try_start_4
    iget-object v3, v9, Lky0;->η:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :catchall_0
    move-exception v0

    .line 316
    move/from16 v20, p5

    .line 317
    .line 318
    move/from16 v28, v5

    .line 319
    .line 320
    move-object/from16 v26, v10

    .line 321
    .line 322
    move-object/from16 v24, v11

    .line 323
    .line 324
    move-object/from16 v23, v12

    .line 325
    .line 326
    move/from16 v21, v14

    .line 327
    .line 328
    move-object/from16 v19, v15

    .line 329
    .line 330
    move-object/from16 v6, v16

    .line 331
    .line 332
    const/16 v27, 0x64

    .line 333
    .line 334
    move-object v15, v1

    .line 335
    move-object v14, v4

    .line 336
    move-object v11, v7

    .line 337
    goto/16 :goto_b

    .line 338
    .line 339
    :cond_7
    :goto_5
    :try_start_5
    invoke-static {v3}, Lqy0;->л(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    .line 343
    move-object/from16 v19, v7

    .line 344
    .line 345
    :try_start_6
    iget-object v7, v9, Lky0;->θ:Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {v3, v7}, Ljx0;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-static/range {p2 .. p2}, Lku;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 355
    move-object/from16 v20, v10

    .line 356
    .line 357
    const/16 v10, 0x64

    .line 358
    .line 359
    :try_start_7
    invoke-static {v7, v10}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 363
    :try_start_8
    new-instance v10, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    const-string v7, "."

    .line 372
    .line 373
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    sget-object v7, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 384
    .line 385
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    invoke-static {v2, v6, v3, v5, v7}, Lqy0;->χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 389
    .line 390
    .line 391
    move-result-object v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 392
    :try_start_9
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    invoke-virtual {v7, v6}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    if-eqz v7, :cond_8

    .line 401
    .line 402
    invoke-static {v1, v4}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v10
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 406
    :try_start_a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    const-string v8, ", mime="

    .line 415
    .line 416
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    const-string v5, ", sourceMime="

    .line 423
    .line 424
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    const-string v0, ", url="

    .line 431
    .line 432
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-static {v13, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    iget-object v0, v9, Lky0;->γ:Ljava/io/BufferedInputStream;

    .line 446
    .line 447
    move-object v1, v3

    .line 448
    invoke-virtual/range {p0 .. p0}, Lqy0;->ж()I

    .line 449
    .line 450
    .line 451
    move-result v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 452
    move-object v8, v6

    .line 453
    :try_start_b
    iget-wide v5, v9, Lky0;->λ:J
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 454
    .line 455
    move-object v10, v9

    .line 456
    const/4 v9, 0x0

    .line 457
    move-object/from16 v21, v8

    .line 458
    .line 459
    const/4 v8, 0x0

    .line 460
    move-object/from16 v22, v10

    .line 461
    .line 462
    const/4 v10, 0x0

    .line 463
    move-object/from16 v25, v1

    .line 464
    .line 465
    move-object v1, v7

    .line 466
    move-object/from16 v24, v11

    .line 467
    .line 468
    move-object/from16 v23, v12

    .line 469
    .line 470
    move-object/from16 v11, v19

    .line 471
    .line 472
    move-object/from16 v26, v20

    .line 473
    .line 474
    move-object/from16 v12, v21

    .line 475
    .line 476
    const/16 v27, 0x64

    .line 477
    .line 478
    const/16 v28, 0x1

    .line 479
    .line 480
    move/from16 v7, p4

    .line 481
    .line 482
    move/from16 v20, p5

    .line 483
    .line 484
    move/from16 v21, v14

    .line 485
    .line 486
    move-object/from16 v19, v15

    .line 487
    .line 488
    move-object/from16 v15, p0

    .line 489
    .line 490
    move-object v14, v4

    .line 491
    move-object/from16 v4, p7

    .line 492
    .line 493
    :try_start_c
    invoke-static/range {v0 .. v10}, Lqy0;->υ(Ljava/io/BufferedInputStream;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;JZLjava/lang/String;Le80;Le80;)V

    .line 494
    .line 495
    .line 496
    invoke-static {v2, v12}, Lqy0;->д(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 497
    .line 498
    .line 499
    invoke-static/range {v22 .. v22}, Lqy0;->π(Lky0;)V

    .line 500
    .line 501
    .line 502
    move-object/from16 v0, v25

    .line 503
    .line 504
    goto/16 :goto_c

    .line 505
    .line 506
    :catchall_1
    move-exception v0

    .line 507
    move-object v6, v12

    .line 508
    move-object/from16 v9, v22

    .line 509
    .line 510
    goto/16 :goto_b

    .line 511
    .line 512
    :catchall_2
    move-exception v0

    .line 513
    move-object/from16 v22, v9

    .line 514
    .line 515
    move-object/from16 v24, v11

    .line 516
    .line 517
    move-object/from16 v23, v12

    .line 518
    .line 519
    move/from16 v21, v14

    .line 520
    .line 521
    move-object/from16 v11, v19

    .line 522
    .line 523
    move-object/from16 v26, v20

    .line 524
    .line 525
    const/16 v27, 0x64

    .line 526
    .line 527
    const/16 v28, 0x1

    .line 528
    .line 529
    move/from16 v20, p5

    .line 530
    .line 531
    move-object v14, v4

    .line 532
    move-object v12, v8

    .line 533
    move-object/from16 v19, v15

    .line 534
    .line 535
    move-object/from16 v15, p0

    .line 536
    .line 537
    move-object v6, v12

    .line 538
    goto/16 :goto_b

    .line 539
    .line 540
    :catchall_3
    move-exception v0

    .line 541
    move-object/from16 v22, v9

    .line 542
    .line 543
    move-object/from16 v24, v11

    .line 544
    .line 545
    move-object/from16 v23, v12

    .line 546
    .line 547
    move/from16 v21, v14

    .line 548
    .line 549
    move-object/from16 v11, v19

    .line 550
    .line 551
    move-object/from16 v26, v20

    .line 552
    .line 553
    const/16 v27, 0x64

    .line 554
    .line 555
    const/16 v28, 0x1

    .line 556
    .line 557
    move/from16 v20, p5

    .line 558
    .line 559
    move-object v14, v4

    .line 560
    move-object v12, v6

    .line 561
    move-object/from16 v19, v15

    .line 562
    .line 563
    move-object/from16 v15, p0

    .line 564
    .line 565
    goto/16 :goto_b

    .line 566
    .line 567
    :catchall_4
    move-exception v0

    .line 568
    move-object/from16 v22, v9

    .line 569
    .line 570
    move-object/from16 v24, v11

    .line 571
    .line 572
    move-object/from16 v23, v12

    .line 573
    .line 574
    move/from16 v21, v14

    .line 575
    .line 576
    move-object/from16 v11, v19

    .line 577
    .line 578
    move-object/from16 v26, v20

    .line 579
    .line 580
    const/16 v27, 0x64

    .line 581
    .line 582
    const/16 v28, 0x1

    .line 583
    .line 584
    move/from16 v20, p5

    .line 585
    .line 586
    move-object v14, v4

    .line 587
    move-object v12, v6

    .line 588
    move-object/from16 v19, v15

    .line 589
    .line 590
    move-object v15, v1

    .line 591
    goto/16 :goto_b

    .line 592
    .line 593
    :cond_8
    move-object/from16 v22, v9

    .line 594
    .line 595
    move-object/from16 v24, v11

    .line 596
    .line 597
    move-object/from16 v23, v12

    .line 598
    .line 599
    move/from16 v21, v14

    .line 600
    .line 601
    move-object/from16 v11, v19

    .line 602
    .line 603
    move-object/from16 v26, v20

    .line 604
    .line 605
    const/16 v27, 0x64

    .line 606
    .line 607
    const/16 v28, 0x1

    .line 608
    .line 609
    move/from16 v20, p5

    .line 610
    .line 611
    move-object v14, v4

    .line 612
    move-object v12, v6

    .line 613
    move-object/from16 v19, v15

    .line 614
    .line 615
    move-object v15, v1

    .line 616
    :try_start_d
    new-instance v0, Ljava/lang/Exception;

    .line 617
    .line 618
    const-string v1, "\u65e0\u6cd5\u6253\u5f00\u8f93\u51fa\u6d41"

    .line 619
    .line 620
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 624
    :catchall_5
    move-exception v0

    .line 625
    move-object/from16 v22, v9

    .line 626
    .line 627
    move-object/from16 v24, v11

    .line 628
    .line 629
    move-object/from16 v23, v12

    .line 630
    .line 631
    move/from16 v21, v14

    .line 632
    .line 633
    move-object/from16 v11, v19

    .line 634
    .line 635
    move-object/from16 v26, v20

    .line 636
    .line 637
    const/16 v27, 0x64

    .line 638
    .line 639
    :goto_6
    const/16 v28, 0x1

    .line 640
    .line 641
    move/from16 v20, p5

    .line 642
    .line 643
    :goto_7
    move-object v14, v4

    .line 644
    move-object/from16 v19, v15

    .line 645
    .line 646
    move-object v15, v1

    .line 647
    :goto_8
    move-object/from16 v6, v16

    .line 648
    .line 649
    goto/16 :goto_b

    .line 650
    .line 651
    :catchall_6
    move-exception v0

    .line 652
    move-object/from16 v22, v9

    .line 653
    .line 654
    move/from16 v27, v10

    .line 655
    .line 656
    move-object/from16 v24, v11

    .line 657
    .line 658
    move-object/from16 v23, v12

    .line 659
    .line 660
    move/from16 v21, v14

    .line 661
    .line 662
    move-object/from16 v11, v19

    .line 663
    .line 664
    move-object/from16 v26, v20

    .line 665
    .line 666
    goto :goto_6

    .line 667
    :catchall_7
    move-exception v0

    .line 668
    move/from16 v20, p5

    .line 669
    .line 670
    move-object/from16 v22, v9

    .line 671
    .line 672
    move-object/from16 v26, v10

    .line 673
    .line 674
    move-object/from16 v24, v11

    .line 675
    .line 676
    move-object/from16 v23, v12

    .line 677
    .line 678
    move/from16 v21, v14

    .line 679
    .line 680
    move-object/from16 v11, v19

    .line 681
    .line 682
    const/16 v27, 0x64

    .line 683
    .line 684
    const/16 v28, 0x1

    .line 685
    .line 686
    goto :goto_7

    .line 687
    :catchall_8
    move-exception v0

    .line 688
    move/from16 v20, p5

    .line 689
    .line 690
    move-object/from16 v22, v9

    .line 691
    .line 692
    move-object/from16 v26, v10

    .line 693
    .line 694
    move-object/from16 v24, v11

    .line 695
    .line 696
    move-object/from16 v23, v12

    .line 697
    .line 698
    move/from16 v21, v14

    .line 699
    .line 700
    move-object/from16 v19, v15

    .line 701
    .line 702
    const/16 v27, 0x64

    .line 703
    .line 704
    const/16 v28, 0x1

    .line 705
    .line 706
    :goto_9
    move-object v15, v1

    .line 707
    move-object v14, v4

    .line 708
    move-object v11, v7

    .line 709
    goto :goto_8

    .line 710
    :catchall_9
    move-exception v0

    .line 711
    move/from16 v20, p5

    .line 712
    .line 713
    move/from16 v28, v5

    .line 714
    .line 715
    :goto_a
    move-object/from16 v22, v9

    .line 716
    .line 717
    move-object/from16 v26, v10

    .line 718
    .line 719
    move-object/from16 v24, v11

    .line 720
    .line 721
    move-object/from16 v23, v12

    .line 722
    .line 723
    move/from16 v21, v14

    .line 724
    .line 725
    move-object/from16 v19, v15

    .line 726
    .line 727
    const/16 v27, 0x64

    .line 728
    .line 729
    goto :goto_9

    .line 730
    :catchall_a
    move-exception v0

    .line 731
    move/from16 v20, p5

    .line 732
    .line 733
    move/from16 v28, p6

    .line 734
    .line 735
    goto :goto_a

    .line 736
    :catchall_b
    move-exception v0

    .line 737
    move/from16 v28, p6

    .line 738
    .line 739
    move/from16 v20, v3

    .line 740
    .line 741
    goto :goto_a

    .line 742
    :catchall_c
    move-exception v0

    .line 743
    move/from16 v28, p6

    .line 744
    .line 745
    move/from16 v20, v3

    .line 746
    .line 747
    move-object/from16 v26, v10

    .line 748
    .line 749
    move-object/from16 v24, v11

    .line 750
    .line 751
    move-object/from16 v23, v12

    .line 752
    .line 753
    move/from16 v21, v14

    .line 754
    .line 755
    move-object/from16 v19, v15

    .line 756
    .line 757
    const/16 v27, 0x64

    .line 758
    .line 759
    move-object v15, v1

    .line 760
    move-object v14, v4

    .line 761
    move-object v11, v7

    .line 762
    move-object/from16 v6, v16

    .line 763
    .line 764
    move-object v9, v6

    .line 765
    :goto_b
    :try_start_e
    invoke-static {v2, v6}, Lqy0;->ω(Landroid/content/Context;Landroid/net/Uri;)V

    .line 766
    .line 767
    .line 768
    invoke-static {v15, v14}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v1

    .line 772
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    new-instance v3, Ljava/lang/StringBuilder;

    .line 777
    .line 778
    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    const-string v1, ", err="

    .line 785
    .line 786
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    invoke-static {v13, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 797
    .line 798
    .line 799
    invoke-static {v9}, Lqy0;->π(Lky0;)V

    .line 800
    .line 801
    .line 802
    move-object/from16 v0, v16

    .line 803
    .line 804
    :goto_c
    if-eqz v0, :cond_9

    .line 805
    .line 806
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 807
    .line 808
    .line 809
    move-result v1

    .line 810
    if-eqz v1, :cond_a

    .line 811
    .line 812
    :cond_9
    move-object/from16 v1, v24

    .line 813
    .line 814
    goto :goto_d

    .line 815
    :cond_a
    move-object/from16 v1, v24

    .line 816
    .line 817
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    goto :goto_e

    .line 821
    :goto_d
    move-object v11, v1

    .line 822
    move-object v1, v15

    .line 823
    move-object/from16 v15, v19

    .line 824
    .line 825
    move/from16 v16, v20

    .line 826
    .line 827
    move/from16 v14, v21

    .line 828
    .line 829
    move-object/from16 v12, v23

    .line 830
    .line 831
    move-object/from16 v10, v26

    .line 832
    .line 833
    move/from16 p6, v28

    .line 834
    .line 835
    goto/16 :goto_3

    .line 836
    .line 837
    :catchall_d
    move-exception v0

    .line 838
    invoke-static {v9}, Lqy0;->π(Lky0;)V

    .line 839
    .line 840
    .line 841
    throw v0

    .line 842
    :cond_b
    move-object v1, v11

    .line 843
    move/from16 v21, v14

    .line 844
    .line 845
    :goto_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 846
    .line 847
    .line 848
    move-result v0

    .line 849
    if-eqz v0, :cond_c

    .line 850
    .line 851
    new-instance v0, Ljava/lang/StringBuilder;

    .line 852
    .line 853
    const-string v2, "[LIVEPHOTO-MERGE-DOWNGRADE-EMPTY] page="

    .line 854
    .line 855
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    move/from16 v2, v21

    .line 859
    .line 860
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 861
    .line 862
    .line 863
    const-string v2, ", \u6ca1\u6709\u6210\u529f\u964d\u7ea7\u4fdd\u5b58\u4efb\u4f55\u8d44\u6e90"

    .line 864
    .line 865
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-static {v13, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    :cond_c
    return-object v1
.end method

.method public final ш(Landroid/content/Context;Lf8;ZLjava/lang/String;Lfv;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    invoke-static {p1}, Lqy0;->я(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-virtual/range {p0 .. p5}, Lqy0;->э(Landroid/content/Context;Lf8;ZLjava/lang/String;Lfv;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    const-string v1, "DYHelper"

    .line 14
    .line 15
    const-string v2, "[LIVEPHOTO-MERGE-DOWNGRADE-ALL] \u5408\u5e76\u6574\u4f53\u5931\u8d25\uff0c\u964d\u7ea7\u4fdd\u5b58\u539f\u59cb\u8d44\u6e90"

    .line 16
    .line 17
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    if-eqz p4, :cond_0

    .line 21
    .line 22
    const-string v0, "\u5408\u5e76\u5931\u8d25\uff0c\u964d\u7ea7\u4fdd\u5b58\u539f\u59cb\u8d44\u6e90"

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v1, p1, p4, v0}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual/range {p0 .. p5}, Lqy0;->щ(Landroid/content/Context;Lf8;ZLjava/lang/String;Lfv;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    invoke-virtual/range {p0 .. p5}, Lqy0;->щ(Landroid/content/Context;Lf8;ZLjava/lang/String;Lfv;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final щ(Landroid/content/Context;Lf8;ZLjava/lang/String;Lfv;)Ljava/util/ArrayList;
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v7, p4

    .line 8
    .line 9
    invoke-static {v3}, Lqy0;->θ(Lf8;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v10

    .line 13
    iget-object v11, v3, Lf8;->θ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v3}, Lqy0;->ε(Lf8;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {}, Lqy0;->г()Llu;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v3, v4}, Lkn0;->π(Lf8;Llu;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v12

    .line 27
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    .line 47
    .line 48
    const-string v1, "\u672a\u627e\u5230\u65e0\u6c34\u5370\u52a8\u56fe\u8d44\u6e90"

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    :goto_0
    new-instance v13, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-static/range {p1 .. p2}, Lqy0;->ζ(Landroid/content/Context;Lf8;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-nez p5, :cond_2

    .line 64
    .line 65
    sget-object v5, Ljy0;->ι:Ljy0;

    .line 66
    .line 67
    invoke-static {v1, v2, v3, v5, v4}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    move-object v14, v4

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move-object/from16 v14, p5

    .line 74
    .line 75
    :goto_1
    iget-object v15, v14, Lfv;->β:Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    add-int/2addr v5, v4

    .line 86
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    const/4 v8, 0x1

    .line 91
    if-eqz v4, :cond_3

    .line 92
    .line 93
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-nez v4, :cond_3

    .line 98
    .line 99
    move v4, v8

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    const/4 v4, 0x0

    .line 102
    :goto_2
    add-int/2addr v5, v4

    .line 103
    if-ge v5, v8, :cond_4

    .line 104
    .line 105
    move v4, v8

    .line 106
    goto :goto_3

    .line 107
    :cond_4
    move v4, v5

    .line 108
    :goto_3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    const-string v6, " \u5931\u8d25"

    .line 113
    .line 114
    const/16 v16, 0x64

    .line 115
    .line 116
    const-string v9, ", url="

    .line 117
    .line 118
    move/from16 v17, v8

    .line 119
    .line 120
    const-string v8, "."

    .line 121
    .line 122
    move-object/from16 v18, v10

    .line 123
    .line 124
    const-string v10, "DYHelper"

    .line 125
    .line 126
    const/16 v19, 0x0

    .line 127
    .line 128
    move-object/from16 v20, v12

    .line 129
    .line 130
    const-string v12, "/"

    .line 131
    .line 132
    if-nez v5, :cond_a

    .line 133
    .line 134
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v20

    .line 138
    const/4 v5, 0x0

    .line 139
    const/16 v21, 0x0

    .line 140
    .line 141
    :goto_4
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v22

    .line 145
    if-eqz v22, :cond_9

    .line 146
    .line 147
    add-int/lit8 v5, v5, 0x1

    .line 148
    .line 149
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v22

    .line 153
    check-cast v22, Ljava/lang/String;

    .line 154
    .line 155
    move-object/from16 v23, v0

    .line 156
    .line 157
    add-int/lit8 v0, v21, 0x1

    .line 158
    .line 159
    new-instance v1, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    add-int/lit8 v1, v21, 0x1

    .line 178
    .line 179
    if-eqz v7, :cond_6

    .line 180
    .line 181
    mul-int/lit8 v1, v1, 0x64

    .line 182
    .line 183
    move/from16 v24, v1

    .line 184
    .line 185
    move/from16 v1, v17

    .line 186
    .line 187
    if-ge v4, v1, :cond_5

    .line 188
    .line 189
    move/from16 v17, v1

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_5
    move/from16 v17, v4

    .line 193
    .line 194
    :goto_5
    div-int v1, v24, v17

    .line 195
    .line 196
    move/from16 v3, v16

    .line 197
    .line 198
    move/from16 v16, v4

    .line 199
    .line 200
    const/4 v4, 0x0

    .line 201
    invoke-static {v1, v4, v3}, Lj81;->μ(III)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    invoke-static {v1, v2, v7, v0}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_6
    move/from16 v3, v16

    .line 210
    .line 211
    move/from16 v16, v4

    .line 212
    .line 213
    const/4 v4, 0x0

    .line 214
    :goto_6
    invoke-static/range {v22 .. v22}, Lqy0;->у(Ljava/lang/String;)Lmu;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->size()I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    const-string v3, "_anim"

    .line 223
    .line 224
    const/4 v4, 0x1

    .line 225
    if-le v1, v4, :cond_7

    .line 226
    .line 227
    invoke-static {v3, v5}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    :cond_7
    iget-object v0, v0, Lmu;->β:Ljava/lang/String;

    .line 232
    .line 233
    new-instance v1, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->size()I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    const-string v3, "\u52a8\u56fe "

    .line 259
    .line 260
    invoke-static {v5, v1, v3, v12}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    move-object v3, v9

    .line 265
    iget-object v9, v14, Lfv;->α:Ljava/lang/String;

    .line 266
    .line 267
    move/from16 v17, v5

    .line 268
    .line 269
    move-object v5, v0

    .line 270
    move/from16 v0, v17

    .line 271
    .line 272
    move/from16 v17, v16

    .line 273
    .line 274
    move-object/from16 v16, v14

    .line 275
    .line 276
    move/from16 v14, v17

    .line 277
    .line 278
    move-object/from16 v27, v3

    .line 279
    .line 280
    move/from16 v17, v4

    .line 281
    .line 282
    move-object/from16 v26, v6

    .line 283
    .line 284
    move-object/from16 v28, v8

    .line 285
    .line 286
    move-object/from16 v4, v22

    .line 287
    .line 288
    move-object/from16 v3, p2

    .line 289
    .line 290
    move/from16 v6, p3

    .line 291
    .line 292
    move-object v8, v1

    .line 293
    move-object/from16 v22, v10

    .line 294
    .line 295
    const/16 v10, 0x64

    .line 296
    .line 297
    move-object/from16 v1, p0

    .line 298
    .line 299
    invoke-virtual/range {v1 .. v9}, Lqy0;->Η(Landroid/content/Context;Lf8;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-eqz v4, :cond_8

    .line 304
    .line 305
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    :cond_8
    add-int/lit8 v21, v21, 0x1

    .line 309
    .line 310
    move-object/from16 v3, p2

    .line 311
    .line 312
    move v5, v0

    .line 313
    move v4, v14

    .line 314
    move-object/from16 v14, v16

    .line 315
    .line 316
    move-object/from16 v0, v23

    .line 317
    .line 318
    move-object/from16 v6, v26

    .line 319
    .line 320
    move-object/from16 v9, v27

    .line 321
    .line 322
    move-object/from16 v8, v28

    .line 323
    .line 324
    move/from16 v16, v10

    .line 325
    .line 326
    move-object/from16 v10, v22

    .line 327
    .line 328
    goto/16 :goto_4

    .line 329
    .line 330
    :cond_9
    move-object/from16 v28, v8

    .line 331
    .line 332
    move-object/from16 v22, v10

    .line 333
    .line 334
    move/from16 v10, v16

    .line 335
    .line 336
    move-object/from16 v16, v14

    .line 337
    .line 338
    move v14, v4

    .line 339
    move-object v4, v6

    .line 340
    move-object v8, v7

    .line 341
    move-object/from16 v29, v9

    .line 342
    .line 343
    move/from16 v23, v10

    .line 344
    .line 345
    move-object/from16 v24, v11

    .line 346
    .line 347
    move-object/from16 v9, v16

    .line 348
    .line 349
    move/from16 v6, v21

    .line 350
    .line 351
    move-object/from16 v10, v22

    .line 352
    .line 353
    goto/16 :goto_f

    .line 354
    .line 355
    :cond_a
    move-object/from16 v26, v6

    .line 356
    .line 357
    move-object/from16 v28, v8

    .line 358
    .line 359
    move-object/from16 v27, v9

    .line 360
    .line 361
    move-object/from16 v22, v10

    .line 362
    .line 363
    move/from16 v10, v16

    .line 364
    .line 365
    move-object/from16 v16, v14

    .line 366
    .line 367
    move v14, v4

    .line 368
    invoke-interface/range {v20 .. v20}, Ljava/util/Collection;->isEmpty()Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-nez v0, :cond_10

    .line 373
    .line 374
    const/4 v0, 0x0

    .line 375
    add-int/lit8 v0, v0, 0x1

    .line 376
    .line 377
    new-instance v3, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    const/4 v3, 0x0

    .line 396
    add-int/lit8 v3, v3, 0x1

    .line 397
    .line 398
    if-eqz v7, :cond_c

    .line 399
    .line 400
    mul-int/2addr v3, v10

    .line 401
    move/from16 v4, v17

    .line 402
    .line 403
    if-ge v14, v4, :cond_b

    .line 404
    .line 405
    const/4 v8, 0x1

    .line 406
    goto :goto_7

    .line 407
    :cond_b
    move v8, v14

    .line 408
    :goto_7
    div-int/2addr v3, v8

    .line 409
    const/4 v4, 0x0

    .line 410
    invoke-static {v3, v4, v10}, Lj81;->μ(III)I

    .line 411
    .line 412
    .line 413
    move-result v3

    .line 414
    invoke-static {v3, v2, v7, v0}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    :cond_c
    const-string v3, ".mp4"

    .line 418
    .line 419
    invoke-static {v15, v3}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    invoke-interface/range {v20 .. v20}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v21

    .line 427
    move-object/from16 v0, v19

    .line 428
    .line 429
    const/4 v6, 0x0

    .line 430
    :goto_8
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    if-eqz v5, :cond_d

    .line 435
    .line 436
    const/16 v17, 0x1

    .line 437
    .line 438
    add-int/lit8 v5, v6, 0x1

    .line 439
    .line 440
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    check-cast v0, Ljava/lang/String;

    .line 445
    .line 446
    const-string v6, "dyhelper_livephoto_fallback_"

    .line 447
    .line 448
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 449
    .line 450
    .line 451
    move-result-object v8

    .line 452
    invoke-static {v6, v3, v8}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    :try_start_0
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    .line 457
    .line 458
    .line 459
    move-result v8

    .line 460
    invoke-static {v1, v0}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 464
    move/from16 v23, v10

    .line 465
    .line 466
    :try_start_1
    new-instance v10, Ljava/lang/StringBuilder;

    .line 467
    .line 468
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 469
    .line 470
    .line 471
    move-object/from16 p2, v0

    .line 472
    .line 473
    const-string v0, "[LIVEPHOTO-VIDEO-DL] awemeId="

    .line 474
    .line 475
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    const-string v0, ", candidate="

    .line 482
    .line 483
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 493
    .line 494
    .line 495
    move-object/from16 v8, v27

    .line 496
    .line 497
    :try_start_2
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 507
    move-object/from16 v10, v22

    .line 508
    .line 509
    :try_start_3
    invoke-static {v10, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1}, Lqy0;->ж()I

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    new-instance v9, Ljava/lang/StringBuilder;

    .line 520
    .line 521
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 522
    .line 523
    .line 524
    move/from16 v22, v0

    .line 525
    .line 526
    const-string v0, "\u52a8\u56fe\u89c6\u9891\uff1a"

    .line 527
    .line 528
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 538
    move-object/from16 v27, v8

    .line 539
    .line 540
    :try_start_4
    new-instance v8, Lig;

    .line 541
    .line 542
    const/16 v9, 0x12

    .line 543
    .line 544
    invoke-direct {v8, v9}, Lig;-><init>(I)V

    .line 545
    .line 546
    .line 547
    new-instance v9, Lig;

    .line 548
    .line 549
    move-object/from16 v24, v0

    .line 550
    .line 551
    const/16 v0, 0x13

    .line 552
    .line 553
    invoke-direct {v9, v0}, Lig;-><init>(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 554
    .line 555
    .line 556
    move/from16 v1, v22

    .line 557
    .line 558
    move-object/from16 v22, v4

    .line 559
    .line 560
    move v4, v1

    .line 561
    move-object v1, v11

    .line 562
    move v11, v5

    .line 563
    move-object/from16 v5, v24

    .line 564
    .line 565
    move-object/from16 v24, v1

    .line 566
    .line 567
    move-object v1, v2

    .line 568
    move-object/from16 v25, v3

    .line 569
    .line 570
    move-object v3, v6

    .line 571
    move-object/from16 v29, v27

    .line 572
    .line 573
    move-object/from16 v2, p2

    .line 574
    .line 575
    move/from16 v6, p3

    .line 576
    .line 577
    :try_start_5
    invoke-static/range {v1 .. v9}, Lqy0;->Σ(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;ILjava/lang/String;ZLjava/lang/String;Le80;Le80;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 578
    .line 579
    .line 580
    move-object v8, v7

    .line 581
    move-object/from16 v9, v16

    .line 582
    .line 583
    :try_start_6
    iget-object v4, v9, Lfv;->α:Ljava/lang/String;

    .line 584
    .line 585
    sget-object v6, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    .line 586
    .line 587
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 588
    .line 589
    .line 590
    move-object/from16 v1, p0

    .line 591
    .line 592
    move-object/from16 v2, p1

    .line 593
    .line 594
    move-object/from16 v5, v22

    .line 595
    .line 596
    :try_start_7
    invoke-virtual/range {v1 .. v6}, Lqy0;->п(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 600
    .line 601
    .line 602
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 603
    .line 604
    .line 605
    move-object/from16 v4, v26

    .line 606
    .line 607
    goto/16 :goto_e

    .line 608
    .line 609
    :catchall_0
    move-exception v0

    .line 610
    goto/16 :goto_d

    .line 611
    .line 612
    :catchall_1
    move-exception v0

    .line 613
    move-object/from16 v1, p0

    .line 614
    .line 615
    move-object/from16 v2, p1

    .line 616
    .line 617
    move-object/from16 v5, v22

    .line 618
    .line 619
    goto/16 :goto_d

    .line 620
    .line 621
    :catchall_2
    move-exception v0

    .line 622
    move-object v2, v1

    .line 623
    move-object v8, v7

    .line 624
    move-object/from16 v9, v16

    .line 625
    .line 626
    move-object/from16 v5, v22

    .line 627
    .line 628
    move-object/from16 v1, p0

    .line 629
    .line 630
    goto :goto_d

    .line 631
    :catchall_3
    move-exception v0

    .line 632
    move-object/from16 v25, v3

    .line 633
    .line 634
    move-object v3, v6

    .line 635
    move-object v8, v7

    .line 636
    move-object/from16 v24, v11

    .line 637
    .line 638
    move-object/from16 v9, v16

    .line 639
    .line 640
    :goto_9
    move-object/from16 v29, v27

    .line 641
    .line 642
    move v11, v5

    .line 643
    :goto_a
    move-object v5, v4

    .line 644
    goto :goto_d

    .line 645
    :catchall_4
    move-exception v0

    .line 646
    move-object/from16 v25, v3

    .line 647
    .line 648
    move-object v3, v6

    .line 649
    move-object/from16 v29, v8

    .line 650
    .line 651
    move-object/from16 v24, v11

    .line 652
    .line 653
    move-object/from16 v9, v16

    .line 654
    .line 655
    :goto_b
    move v11, v5

    .line 656
    move-object v8, v7

    .line 657
    goto :goto_a

    .line 658
    :catchall_5
    move-exception v0

    .line 659
    move-object/from16 v25, v3

    .line 660
    .line 661
    move-object v3, v6

    .line 662
    move-object/from16 v29, v8

    .line 663
    .line 664
    move-object/from16 v24, v11

    .line 665
    .line 666
    move-object/from16 v9, v16

    .line 667
    .line 668
    move-object/from16 v10, v22

    .line 669
    .line 670
    goto :goto_b

    .line 671
    :catchall_6
    move-exception v0

    .line 672
    move-object/from16 v25, v3

    .line 673
    .line 674
    move-object v3, v6

    .line 675
    move-object v8, v7

    .line 676
    :goto_c
    move-object/from16 v24, v11

    .line 677
    .line 678
    move-object/from16 v9, v16

    .line 679
    .line 680
    move-object/from16 v10, v22

    .line 681
    .line 682
    goto :goto_9

    .line 683
    :catchall_7
    move-exception v0

    .line 684
    move-object/from16 v25, v3

    .line 685
    .line 686
    move-object v3, v6

    .line 687
    move-object v8, v7

    .line 688
    move/from16 v23, v10

    .line 689
    .line 690
    goto :goto_c

    .line 691
    :goto_d
    :try_start_8
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    new-instance v6, Ljava/lang/StringBuilder;

    .line 696
    .line 697
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 698
    .line 699
    .line 700
    const-string v7, "[LIVEPHOTO-VIDEO-RETRY] \u5019\u9009 "

    .line 701
    .line 702
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    move-object/from16 v4, v26

    .line 715
    .line 716
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v6

    .line 723
    invoke-static {v10, v6, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 724
    .line 725
    .line 726
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 727
    .line 728
    .line 729
    move-object/from16 v26, v4

    .line 730
    .line 731
    move-object v4, v5

    .line 732
    move-object v7, v8

    .line 733
    move-object/from16 v16, v9

    .line 734
    .line 735
    move-object/from16 v22, v10

    .line 736
    .line 737
    move v6, v11

    .line 738
    move/from16 v10, v23

    .line 739
    .line 740
    move-object/from16 v11, v24

    .line 741
    .line 742
    move-object/from16 v3, v25

    .line 743
    .line 744
    move-object/from16 v27, v29

    .line 745
    .line 746
    goto/16 :goto_8

    .line 747
    .line 748
    :catchall_8
    move-exception v0

    .line 749
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 750
    .line 751
    .line 752
    throw v0

    .line 753
    :cond_d
    move-object v8, v7

    .line 754
    move/from16 v23, v10

    .line 755
    .line 756
    move-object/from16 v24, v11

    .line 757
    .line 758
    move-object/from16 v9, v16

    .line 759
    .line 760
    move-object/from16 v10, v22

    .line 761
    .line 762
    move-object/from16 v4, v26

    .line 763
    .line 764
    move-object/from16 v29, v27

    .line 765
    .line 766
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->isEmpty()Z

    .line 767
    .line 768
    .line 769
    move-result v3

    .line 770
    if-eqz v3, :cond_f

    .line 771
    .line 772
    new-instance v1, Ljava/lang/Exception;

    .line 773
    .line 774
    if-eqz v0, :cond_e

    .line 775
    .line 776
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v19

    .line 780
    :cond_e
    move-object/from16 v0, v19

    .line 781
    .line 782
    const-string v2, "\u52a8\u56fe\u89c6\u9891\u5168\u90e8\u5019\u9009\u4e0b\u8f7d\u5931\u8d25: "

    .line 783
    .line 784
    invoke-static {v2, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    throw v1

    .line 792
    :cond_f
    :goto_e
    const/4 v0, 0x0

    .line 793
    const/16 v17, 0x1

    .line 794
    .line 795
    add-int/lit8 v6, v0, 0x1

    .line 796
    .line 797
    goto :goto_f

    .line 798
    :cond_10
    move-object v8, v7

    .line 799
    move/from16 v23, v10

    .line 800
    .line 801
    move-object/from16 v24, v11

    .line 802
    .line 803
    move-object/from16 v9, v16

    .line 804
    .line 805
    move-object/from16 v10, v22

    .line 806
    .line 807
    move-object/from16 v4, v26

    .line 808
    .line 809
    move-object/from16 v29, v27

    .line 810
    .line 811
    const/4 v6, 0x0

    .line 812
    :goto_f
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 813
    .line 814
    .line 815
    move-result-object v11

    .line 816
    move/from16 v16, v6

    .line 817
    .line 818
    const/4 v6, 0x0

    .line 819
    :goto_10
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 820
    .line 821
    .line 822
    move-result v0

    .line 823
    if-eqz v0, :cond_15

    .line 824
    .line 825
    add-int/lit8 v3, v6, 0x1

    .line 826
    .line 827
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    check-cast v0, Ljava/lang/String;

    .line 832
    .line 833
    add-int/lit8 v5, v16, 0x1

    .line 834
    .line 835
    new-instance v6, Ljava/lang/StringBuilder;

    .line 836
    .line 837
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 841
    .line 842
    .line 843
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v5

    .line 853
    add-int/lit8 v6, v16, 0x1

    .line 854
    .line 855
    if-eqz v8, :cond_12

    .line 856
    .line 857
    mul-int/lit8 v6, v6, 0x64

    .line 858
    .line 859
    const/4 v7, 0x1

    .line 860
    if-ge v14, v7, :cond_11

    .line 861
    .line 862
    const/4 v7, 0x1

    .line 863
    goto :goto_11

    .line 864
    :cond_11
    move v7, v14

    .line 865
    :goto_11
    div-int/2addr v6, v7

    .line 866
    move-object/from16 p2, v11

    .line 867
    .line 868
    move/from16 v7, v23

    .line 869
    .line 870
    const/4 v11, 0x0

    .line 871
    invoke-static {v6, v11, v7}, Lj81;->μ(III)I

    .line 872
    .line 873
    .line 874
    move-result v6

    .line 875
    invoke-static {v6, v2, v8, v5}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    goto :goto_12

    .line 879
    :cond_12
    move-object/from16 p2, v11

    .line 880
    .line 881
    const/4 v11, 0x0

    .line 882
    :goto_12
    :try_start_9
    invoke-static {v0}, Lqy0;->о(Ljava/lang/String;)Lky0;

    .line 883
    .line 884
    .line 885
    move-result-object v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_16

    .line 886
    :try_start_a
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    .line 887
    .line 888
    .line 889
    move-result v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_15

    .line 890
    const-string v7, "_image"

    .line 891
    .line 892
    const/4 v11, 0x1

    .line 893
    if-le v6, v11, :cond_13

    .line 894
    .line 895
    :try_start_b
    new-instance v6, Ljava/lang/StringBuilder;

    .line 896
    .line 897
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 898
    .line 899
    .line 900
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v7
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 910
    goto :goto_15

    .line 911
    :catchall_9
    move-exception v0

    .line 912
    move-object v1, v2

    .line 913
    :goto_13
    move-object/from16 v22, v9

    .line 914
    .line 915
    move/from16 v20, v14

    .line 916
    .line 917
    move-object/from16 v21, v15

    .line 918
    .line 919
    move-object/from16 v27, v29

    .line 920
    .line 921
    move v14, v3

    .line 922
    move-object v15, v4

    .line 923
    :goto_14
    move-object/from16 v4, v19

    .line 924
    .line 925
    goto/16 :goto_1c

    .line 926
    .line 927
    :cond_13
    :goto_15
    :try_start_c
    iget-object v6, v5, Lky0;->θ:Ljava/lang/String;

    .line 928
    .line 929
    new-instance v11, Ljava/lang/StringBuilder;

    .line 930
    .line 931
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 935
    .line 936
    .line 937
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_15

    .line 938
    .line 939
    .line 940
    move-object/from16 v7, v28

    .line 941
    .line 942
    :try_start_d
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 946
    .line 947
    .line 948
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v11

    .line 952
    iget-object v6, v9, Lfv;->α:Ljava/lang/String;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_14

    .line 953
    .line 954
    move-object/from16 v26, v4

    .line 955
    .line 956
    :try_start_e
    iget-object v4, v5, Lky0;->η:Ljava/lang/String;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_13

    .line 957
    .line 958
    move-object/from16 v28, v7

    .line 959
    .line 960
    :try_start_f
    sget-object v7, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 961
    .line 962
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    invoke-static {v2, v6, v11, v4, v7}, Lqy0;->χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 966
    .line 967
    .line 968
    move-result-object v4
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_12

    .line 969
    :try_start_10
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 970
    .line 971
    .line 972
    move-result-object v6

    .line 973
    invoke-virtual {v6, v4}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 974
    .line 975
    .line 976
    move-result-object v6

    .line 977
    if-eqz v6, :cond_14

    .line 978
    .line 979
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    .line 980
    .line 981
    .line 982
    move-result v7
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_11

    .line 983
    :try_start_11
    iget-object v2, v5, Lky0;->η:Ljava/lang/String;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_10

    .line 984
    .line 985
    move-object/from16 v20, v4

    .line 986
    .line 987
    :try_start_12
    iget-object v4, v5, Lky0;->θ:Ljava/lang/String;

    .line 988
    .line 989
    invoke-static {v1, v0}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    new-instance v1, Ljava/lang/StringBuilder;

    .line 994
    .line 995
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_f

    .line 996
    .line 997
    .line 998
    move-object/from16 v21, v5

    .line 999
    .line 1000
    :try_start_13
    const-string v5, "[LIVEPHOTO-IMAGE-DL] awemeId="

    .line 1001
    .line 1002
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_d

    .line 1003
    .line 1004
    .line 1005
    move-object/from16 v5, v24

    .line 1006
    .line 1007
    :try_start_14
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_e

    .line 1008
    .line 1009
    .line 1010
    move-object/from16 v24, v5

    .line 1011
    .line 1012
    :try_start_15
    const-string v5, ", idx="

    .line 1013
    .line 1014
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1024
    .line 1025
    .line 1026
    const-string v5, ", mime="

    .line 1027
    .line 1028
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1032
    .line 1033
    .line 1034
    const-string v2, ", ext="

    .line 1035
    .line 1036
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_d

    .line 1040
    .line 1041
    .line 1042
    move-object/from16 v2, v29

    .line 1043
    .line 1044
    :try_start_16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    invoke-static {v10, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual/range {p0 .. p0}, Lqy0;->ж()I

    .line 1058
    .line 1059
    .line 1060
    move-result v5

    .line 1061
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    .line 1062
    .line 1063
    .line 1064
    move-result v0

    .line 1065
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1066
    .line 1067
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1068
    .line 1069
    .line 1070
    const-string v4, "\u52a8\u56fe\u56fe\u7247 "

    .line 1071
    .line 1072
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    .line 1088
    move-object/from16 v1, p0

    .line 1089
    .line 1090
    move-object/from16 v4, p1

    .line 1091
    .line 1092
    move/from16 v7, p3

    .line 1093
    .line 1094
    move-object/from16 v27, v2

    .line 1095
    .line 1096
    move-object/from16 v22, v9

    .line 1097
    .line 1098
    move-object/from16 v9, v20

    .line 1099
    .line 1100
    move-object/from16 v2, v21

    .line 1101
    .line 1102
    move/from16 v20, v14

    .line 1103
    .line 1104
    move-object/from16 v21, v15

    .line 1105
    .line 1106
    move-object/from16 v15, v26

    .line 1107
    .line 1108
    move v14, v3

    .line 1109
    move-object v3, v6

    .line 1110
    move-object v6, v0

    .line 1111
    :try_start_17
    invoke-virtual/range {v1 .. v7}, Lqy0;->Κ(Lky0;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;Z)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    .line 1112
    .line 1113
    .line 1114
    move-object v1, v4

    .line 1115
    :try_start_18
    invoke-static {v1, v9}, Lqy0;->д(Landroid/content/Context;Landroid/net/Uri;)V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1119
    .line 1120
    .line 1121
    goto/16 :goto_1d

    .line 1122
    .line 1123
    :catchall_a
    move-exception v0

    .line 1124
    :goto_16
    move-object v5, v2

    .line 1125
    :goto_17
    move-object v4, v9

    .line 1126
    goto/16 :goto_1c

    .line 1127
    .line 1128
    :catchall_b
    move-exception v0

    .line 1129
    move-object v1, v4

    .line 1130
    goto :goto_16

    .line 1131
    :catchall_c
    move-exception v0

    .line 1132
    move-object/from16 v1, p1

    .line 1133
    .line 1134
    move-object/from16 v27, v2

    .line 1135
    .line 1136
    move-object/from16 v22, v9

    .line 1137
    .line 1138
    move-object/from16 v9, v20

    .line 1139
    .line 1140
    move-object/from16 v2, v21

    .line 1141
    .line 1142
    :goto_18
    move/from16 v20, v14

    .line 1143
    .line 1144
    move-object/from16 v21, v15

    .line 1145
    .line 1146
    move-object/from16 v15, v26

    .line 1147
    .line 1148
    move v14, v3

    .line 1149
    goto :goto_16

    .line 1150
    :catchall_d
    move-exception v0

    .line 1151
    move-object/from16 v1, p1

    .line 1152
    .line 1153
    :goto_19
    move-object/from16 v22, v9

    .line 1154
    .line 1155
    move-object/from16 v9, v20

    .line 1156
    .line 1157
    move-object/from16 v2, v21

    .line 1158
    .line 1159
    move-object/from16 v27, v29

    .line 1160
    .line 1161
    goto :goto_18

    .line 1162
    :catchall_e
    move-exception v0

    .line 1163
    move-object/from16 v1, p1

    .line 1164
    .line 1165
    move-object/from16 v24, v5

    .line 1166
    .line 1167
    goto :goto_19

    .line 1168
    :catchall_f
    move-exception v0

    .line 1169
    move-object/from16 v1, p1

    .line 1170
    .line 1171
    move-object v2, v5

    .line 1172
    move-object/from16 v22, v9

    .line 1173
    .line 1174
    move-object/from16 v21, v15

    .line 1175
    .line 1176
    move-object/from16 v9, v20

    .line 1177
    .line 1178
    move-object/from16 v15, v26

    .line 1179
    .line 1180
    move-object/from16 v27, v29

    .line 1181
    .line 1182
    move/from16 v20, v14

    .line 1183
    .line 1184
    move v14, v3

    .line 1185
    goto :goto_17

    .line 1186
    :catchall_10
    move-exception v0

    .line 1187
    move-object/from16 v1, p1

    .line 1188
    .line 1189
    :goto_1a
    move-object v2, v5

    .line 1190
    move-object/from16 v22, v9

    .line 1191
    .line 1192
    move/from16 v20, v14

    .line 1193
    .line 1194
    move-object/from16 v21, v15

    .line 1195
    .line 1196
    move-object/from16 v15, v26

    .line 1197
    .line 1198
    move-object/from16 v27, v29

    .line 1199
    .line 1200
    move v14, v3

    .line 1201
    move-object v9, v4

    .line 1202
    goto/16 :goto_1c

    .line 1203
    .line 1204
    :catchall_11
    move-exception v0

    .line 1205
    move-object v1, v2

    .line 1206
    goto :goto_1a

    .line 1207
    :cond_14
    move-object v1, v2

    .line 1208
    move-object v2, v5

    .line 1209
    move-object/from16 v22, v9

    .line 1210
    .line 1211
    move/from16 v20, v14

    .line 1212
    .line 1213
    move-object/from16 v21, v15

    .line 1214
    .line 1215
    move-object/from16 v15, v26

    .line 1216
    .line 1217
    move-object/from16 v27, v29

    .line 1218
    .line 1219
    move v14, v3

    .line 1220
    move-object v9, v4

    .line 1221
    new-instance v0, Ljava/lang/Exception;

    .line 1222
    .line 1223
    const-string v3, "\u65e0\u6cd5\u6253\u5f00\u8f93\u51fa\u6d41"

    .line 1224
    .line 1225
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    throw v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    .line 1229
    :catchall_12
    move-exception v0

    .line 1230
    move-object v1, v2

    .line 1231
    move-object v2, v5

    .line 1232
    :goto_1b
    move-object/from16 v22, v9

    .line 1233
    .line 1234
    move/from16 v20, v14

    .line 1235
    .line 1236
    move-object/from16 v21, v15

    .line 1237
    .line 1238
    move-object/from16 v15, v26

    .line 1239
    .line 1240
    move-object/from16 v27, v29

    .line 1241
    .line 1242
    move v14, v3

    .line 1243
    goto/16 :goto_14

    .line 1244
    .line 1245
    :catchall_13
    move-exception v0

    .line 1246
    move-object v1, v2

    .line 1247
    move-object v2, v5

    .line 1248
    move-object/from16 v28, v7

    .line 1249
    .line 1250
    goto :goto_1b

    .line 1251
    :catchall_14
    move-exception v0

    .line 1252
    move-object v1, v2

    .line 1253
    move-object v2, v5

    .line 1254
    move-object/from16 v28, v7

    .line 1255
    .line 1256
    goto/16 :goto_13

    .line 1257
    .line 1258
    :catchall_15
    move-exception v0

    .line 1259
    move-object v1, v2

    .line 1260
    move-object v2, v5

    .line 1261
    goto/16 :goto_13

    .line 1262
    .line 1263
    :catchall_16
    move-exception v0

    .line 1264
    move-object v1, v2

    .line 1265
    move-object/from16 v22, v9

    .line 1266
    .line 1267
    move/from16 v20, v14

    .line 1268
    .line 1269
    move-object/from16 v21, v15

    .line 1270
    .line 1271
    move-object/from16 v27, v29

    .line 1272
    .line 1273
    move v14, v3

    .line 1274
    move-object v15, v4

    .line 1275
    move-object/from16 v4, v19

    .line 1276
    .line 1277
    move-object v5, v4

    .line 1278
    :goto_1c
    invoke-static {v1, v4}, Lqy0;->ω(Landroid/content/Context;Landroid/net/Uri;)V

    .line 1279
    .line 1280
    .line 1281
    invoke-static {v5}, Lqy0;->π(Lky0;)V

    .line 1282
    .line 1283
    .line 1284
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    .line 1285
    .line 1286
    .line 1287
    move-result v2

    .line 1288
    const-string v3, "[LIVEPHOTO-IMAGE-FAIL] \u56fe\u7247 "

    .line 1289
    .line 1290
    invoke-static {v3, v14, v12, v2, v15}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v2

    .line 1294
    invoke-static {v10, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1295
    .line 1296
    .line 1297
    :goto_1d
    add-int/lit8 v16, v16, 0x1

    .line 1298
    .line 1299
    move-object/from16 v11, p2

    .line 1300
    .line 1301
    move-object v2, v1

    .line 1302
    move v6, v14

    .line 1303
    move-object v4, v15

    .line 1304
    move/from16 v14, v20

    .line 1305
    .line 1306
    move-object/from16 v15, v21

    .line 1307
    .line 1308
    move-object/from16 v9, v22

    .line 1309
    .line 1310
    move-object/from16 v29, v27

    .line 1311
    .line 1312
    const/16 v17, 0x1

    .line 1313
    .line 1314
    const/16 v23, 0x64

    .line 1315
    .line 1316
    move-object/from16 v1, p0

    .line 1317
    .line 1318
    goto/16 :goto_10

    .line 1319
    .line 1320
    :cond_15
    move-object v1, v2

    .line 1321
    if-eqz v8, :cond_16

    .line 1322
    .line 1323
    const-string v0, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 1324
    .line 1325
    const/16 v10, 0x64

    .line 1326
    .line 1327
    invoke-static {v10, v1, v8, v0}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1328
    .line 1329
    .line 1330
    :cond_16
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1331
    .line 1332
    .line 1333
    move-result v0

    .line 1334
    if-nez v0, :cond_17

    .line 1335
    .line 1336
    return-object v13

    .line 1337
    :cond_17
    new-instance v0, Ljava/lang/Exception;

    .line 1338
    .line 1339
    const-string v1, "\u52a8\u56fe\u8d44\u6e90\u4e0b\u8f7d\u5931\u8d25\uff1a\u6ca1\u6709\u6210\u529f\u4fdd\u5b58\u4efb\u4f55\u6587\u4ef6"

    .line 1340
    .line 1341
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1342
    .line 1343
    .line 1344
    throw v0
.end method

.method public final э(Landroid/content/Context;Lf8;ZLjava/lang/String;Lfv;)Ljava/util/ArrayList;
    .locals 29

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p4

    .line 6
    .line 7
    invoke-static {v2}, Lqy0;->η(Lf8;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v17

    .line 11
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_10

    .line 16
    .line 17
    new-instance v4, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v5, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v18

    .line 31
    const/4 v6, 0x0

    .line 32
    move v0, v6

    .line 33
    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    const-string v8, "DYHelper"

    .line 38
    .line 39
    if-eqz v7, :cond_d

    .line 40
    .line 41
    add-int/lit8 v7, v0, 0x1

    .line 42
    .line 43
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    check-cast v9, Lru0;

    .line 48
    .line 49
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    const/4 v11, 0x1

    .line 54
    if-le v10, v11, :cond_0

    .line 55
    .line 56
    if-eqz v3, :cond_0

    .line 57
    .line 58
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    const-string v11, "\u6b63\u5728\u5408\u5e76\u52a8\u56fe "

    .line 63
    .line 64
    const-string v12, "/"

    .line 65
    .line 66
    invoke-static {v7, v10, v11, v12}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    mul-int/lit8 v0, v0, 0x64

    .line 71
    .line 72
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    div-int/2addr v0, v11

    .line 77
    const/16 v11, 0x64

    .line 78
    .line 79
    invoke-static {v0, v6, v11}, Lj81;->μ(III)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static {v0, v1, v3, v10}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_0
    iget-object v0, v9, Lru0;->δ:Ljava/lang/String;

    .line 87
    .line 88
    move-object v10, v5

    .line 89
    iget-object v5, v9, Lru0;->γ:Ljava/util/List;

    .line 90
    .line 91
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    const/4 v12, 0x0

    .line 96
    if-nez v11, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    move-object v0, v12

    .line 100
    :goto_1
    const-string v19, ""

    .line 101
    .line 102
    if-nez v0, :cond_2

    .line 103
    .line 104
    move-object/from16 v0, v19

    .line 105
    .line 106
    :cond_2
    iget-object v11, v9, Lru0;->β:Ljava/util/List;

    .line 107
    .line 108
    invoke-static {v11}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    check-cast v13, Ljava/lang/String;

    .line 113
    .line 114
    iget-object v14, v2, Lf8;->α:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v0, v14}, Lqy0;->ι(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    iget-object v15, v2, Lf8;->β:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v0, v15}, Lqy0;->ι(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v15

    .line 126
    iget-object v6, v2, Lf8;->θ:Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v6, :cond_3

    .line 129
    .line 130
    invoke-static {v0, v6}, Lqy0;->ι(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    goto :goto_2

    .line 135
    :cond_3
    move-object v0, v12

    .line 136
    :goto_2
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-nez v6, :cond_4

    .line 141
    .line 142
    move-object v6, v11

    .line 143
    goto :goto_3

    .line 144
    :cond_4
    move-object v6, v12

    .line 145
    :goto_3
    invoke-static {v5}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v20

    .line 149
    check-cast v20, Ljava/lang/String;

    .line 150
    .line 151
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v21

    .line 155
    if-nez v21, :cond_5

    .line 156
    .line 157
    :goto_4
    move-object/from16 v21, v4

    .line 158
    .line 159
    move-object v4, v15

    .line 160
    goto :goto_5

    .line 161
    :cond_5
    move-object v11, v12

    .line 162
    goto :goto_4

    .line 163
    :goto_5
    const v15, -0x40000090    # -1.9999828f

    .line 164
    .line 165
    .line 166
    const/16 v22, 0x0

    .line 167
    .line 168
    const/16 v16, 0x1e81

    .line 169
    .line 170
    move-object/from16 v23, v8

    .line 171
    .line 172
    const/4 v8, 0x0

    .line 173
    move-object v3, v14

    .line 174
    const/4 v14, 0x0

    .line 175
    move-object/from16 v24, v10

    .line 176
    .line 177
    move-object v10, v13

    .line 178
    move-object v13, v11

    .line 179
    move-object v11, v10

    .line 180
    move-object/from16 v25, v12

    .line 181
    .line 182
    move-object v12, v5

    .line 183
    move-object v1, v9

    .line 184
    move-object/from16 v9, v20

    .line 185
    .line 186
    move-object/from16 v26, v21

    .line 187
    .line 188
    move-object/from16 v28, v23

    .line 189
    .line 190
    move-object/from16 v27, v24

    .line 191
    .line 192
    move/from16 v20, v7

    .line 193
    .line 194
    move-object v7, v0

    .line 195
    move-object/from16 v0, v25

    .line 196
    .line 197
    invoke-static/range {v2 .. v16}, Lf8;->γ(Lf8;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;II)Lf8;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    iget-object v12, v1, Lru0;->δ:Ljava/lang/String;

    .line 202
    .line 203
    iget v9, v1, Lru0;->α:I

    .line 204
    .line 205
    move-object/from16 v8, p5

    .line 206
    .line 207
    if-eqz p5, :cond_9

    .line 208
    .line 209
    iget-object v2, v8, Lfv;->β:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v12}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-nez v4, :cond_6

    .line 216
    .line 217
    move-object v4, v12

    .line 218
    goto :goto_6

    .line 219
    :cond_6
    move-object v4, v0

    .line 220
    :goto_6
    if-nez v4, :cond_7

    .line 221
    .line 222
    move-object/from16 v4, v19

    .line 223
    .line 224
    :cond_7
    new-instance v5, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-static {v4}, Lku;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-eqz v5, :cond_8

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_8
    move-object v2, v4

    .line 251
    :goto_7
    const/4 v4, 0x5

    .line 252
    invoke-static {v8, v0, v2, v0, v4}, Lfv;->α(Lfv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lfv;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    :cond_9
    move-object v5, v0

    .line 257
    :try_start_0
    sget-object v0, Lj41;->α:Ljava/lang/ClassLoader;

    .line 258
    .line 259
    iget-object v6, v3, Lf8;->θ:Ljava/lang/String;

    .line 260
    .line 261
    iget-object v7, v1, Lru0;->β:Ljava/util/List;

    .line 262
    .line 263
    iget-object v10, v1, Lru0;->γ:Ljava/util/List;

    .line 264
    .line 265
    new-instance v11, Lm3;

    .line 266
    .line 267
    const/4 v0, 0x3

    .line 268
    move-object/from16 v2, p1

    .line 269
    .line 270
    invoke-direct {v11, v2, v3, v5, v0}, Lm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 271
    .line 272
    .line 273
    new-instance v0, Lbf0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 274
    .line 275
    move-object/from16 v4, p4

    .line 276
    .line 277
    move-object v8, v1

    .line 278
    move-object v1, v2

    .line 279
    move-object v2, v3

    .line 280
    move/from16 v3, p3

    .line 281
    .line 282
    :try_start_1
    invoke-direct/range {v0 .. v5}, Lbf0;-><init>(Landroid/content/Context;Lf8;ZLjava/lang/String;Lfv;)V

    .line 283
    .line 284
    .line 285
    move-object/from16 v1, p1

    .line 286
    .line 287
    move-object v2, v6

    .line 288
    move-object v3, v7

    .line 289
    move-object v4, v10

    .line 290
    move-object v5, v11

    .line 291
    move-object v6, v0

    .line 292
    invoke-static/range {v1 .. v6}, Lj41;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lm3;Lbf0;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 296
    move-object/from16 v10, v26

    .line 297
    .line 298
    :try_start_2
    invoke-static {v10, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 299
    .line 300
    .line 301
    move-object/from16 v13, v27

    .line 302
    .line 303
    goto/16 :goto_c

    .line 304
    .line 305
    :catchall_0
    move-exception v0

    .line 306
    goto :goto_9

    .line 307
    :catchall_1
    move-exception v0

    .line 308
    :goto_8
    move-object/from16 v10, v26

    .line 309
    .line 310
    goto :goto_9

    .line 311
    :catchall_2
    move-exception v0

    .line 312
    move-object v8, v1

    .line 313
    goto :goto_8

    .line 314
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    if-nez v1, :cond_a

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    :cond_a
    move-object v7, v1

    .line 325
    const-string v0, "[LIVEPHOTO-MERGE-ITEM-FAIL] page="

    .line 326
    .line 327
    const-string v1, ", suffix="

    .line 328
    .line 329
    const-string v11, ", err="

    .line 330
    .line 331
    invoke-static {v9, v0, v1, v12, v11}, La12;->η(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    move-object/from16 v12, v28

    .line 343
    .line 344
    invoke-static {v12, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    add-int/lit8 v0, v9, 0x1

    .line 348
    .line 349
    new-instance v1, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    const-string v2, "\u7b2c "

    .line 352
    .line 353
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    const-string v0, " \u9875\u5408\u5e76\u5931\u8d25\uff1a"

    .line 360
    .line 361
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    move-object/from16 v13, v27

    .line 372
    .line 373
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-object/from16 v1, p0

    .line 377
    .line 378
    move-object/from16 v2, p1

    .line 379
    .line 380
    move-object/from16 v3, p2

    .line 381
    .line 382
    move/from16 v5, p3

    .line 383
    .line 384
    move-object/from16 v6, p4

    .line 385
    .line 386
    move-object v4, v8

    .line 387
    move-object/from16 v8, p5

    .line 388
    .line 389
    :try_start_3
    invoke-virtual/range {v1 .. v8}, Lqy0;->ч(Landroid/content/Context;Lf8;Lru0;ZLjava/lang/String;Ljava/lang/String;Lfv;)Ljava/util/ArrayList;

    .line 390
    .line 391
    .line 392
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 393
    goto :goto_a

    .line 394
    :catchall_3
    move-exception v0

    .line 395
    new-instance v1, Leo1;

    .line 396
    .line 397
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 398
    .line 399
    .line 400
    move-object v0, v1

    .line 401
    :goto_a
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    if-nez v1, :cond_b

    .line 406
    .line 407
    goto :goto_b

    .line 408
    :cond_b
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    new-instance v1, Ljava/lang/StringBuilder;

    .line 413
    .line 414
    const-string v2, "[LIVEPHOTO-MERGE-FALLBACK-FAIL] page="

    .line 415
    .line 416
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-static {v12, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    sget-object v0, Ljz;->ε:Ljz;

    .line 436
    .line 437
    :goto_b
    check-cast v0, Ljava/util/List;

    .line 438
    .line 439
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    if-nez v1, :cond_c

    .line 444
    .line 445
    invoke-static {v10, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 446
    .line 447
    .line 448
    goto :goto_c

    .line 449
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 450
    .line 451
    const-string v1, "[LIVEPHOTO-MERGE-ITEM-SKIP] page="

    .line 452
    .line 453
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    const-string v1, ", \u5408\u5e76\u5931\u8d25\u4e14\u964d\u7ea7\u4fdd\u5b58\u4e5f\u5931\u8d25"

    .line 460
    .line 461
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-static {v12, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    :goto_c
    move-object/from16 v1, p1

    .line 472
    .line 473
    move-object/from16 v2, p2

    .line 474
    .line 475
    move-object/from16 v3, p4

    .line 476
    .line 477
    move-object v4, v10

    .line 478
    move-object v5, v13

    .line 479
    move/from16 v0, v20

    .line 480
    .line 481
    move/from16 v6, v22

    .line 482
    .line 483
    goto/16 :goto_0

    .line 484
    .line 485
    :cond_d
    move-object v10, v4

    .line 486
    move-object v13, v5

    .line 487
    move-object v12, v8

    .line 488
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-nez v0, :cond_f

    .line 493
    .line 494
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-nez v0, :cond_e

    .line 499
    .line 500
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    new-instance v2, Ljava/lang/StringBuilder;

    .line 509
    .line 510
    const-string v3, "[LIVEPHOTO-MERGE-PARTIAL] saved="

    .line 511
    .line 512
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    const-string v0, ", failed="

    .line 519
    .line 520
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-static {v12, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    :cond_e
    return-object v10

    .line 534
    :cond_f
    new-instance v0, Ljava/lang/Exception;

    .line 535
    .line 536
    const/4 v10, 0x0

    .line 537
    const/16 v11, 0x3e

    .line 538
    .line 539
    const-string v6, "\n"

    .line 540
    .line 541
    const/4 v7, 0x0

    .line 542
    const/4 v8, 0x0

    .line 543
    const/4 v9, 0x0

    .line 544
    move-object v5, v13

    .line 545
    invoke-static/range {v5 .. v11}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    const/16 v2, 0x3e8

    .line 550
    .line 551
    invoke-static {v1, v2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    const-string v2, "\u5168\u90e8\u52a8\u56fe\u5408\u5e76\u5931\u8d25\uff0c\u4e14\u964d\u7ea7\u4fdd\u5b58\u4e5f\u5931\u8d25\u3002\n\n"

    .line 556
    .line 557
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    throw v0

    .line 565
    :cond_10
    new-instance v0, Ljava/lang/Exception;

    .line 566
    .line 567
    const-string v1, "\u5408\u5e76\u52a8\u56fe\u5931\u8d25\uff1a\u672a\u627e\u5230\u53ef\u76f4\u63a5\u4fdd\u5b58\u7684 MP4 \u89c6\u9891\u8d44\u6e90"

    .line 568
    .line 569
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    throw v0
.end method
