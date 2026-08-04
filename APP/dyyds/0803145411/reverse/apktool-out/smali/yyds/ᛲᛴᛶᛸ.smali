.class public final Lyyds/ᛲᛴᛶᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛳᛶᲁ:Ljava/lang/Object;

.field public static volatile ᛷᲈᲈᲁ:Lyyds/ᛲᛴᛶᛸ;


# instance fields
.field public final ᛱᲈᲁ:Lyyds/ᲇᛳᛱᲀ;

.field public final ᛲᛴᛳᛲ:Lyyds/ᲇᛸᲀᛳ;

.field public final ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final ᛵᛸᛸᛷ:Lyyds/ᲀᛳᛸᛴ;

.field public final ᛶᛷᛲᲁ:I

.field public volatile ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:Lyyds/ᛱᲇᛷᲈ;

.field public final ᲇᲈᛵᛷ:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛲᛴᛶᛸ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lyyds/ᛴᲈᛴᛱ;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    iput v1, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 13
    .line 14
    iget-object v1, p1, Lyyds/ᛲᛵᲀᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lyyds/ᛱᲇᛷᲈ;

    .line 17
    .line 18
    iput-object v1, p0, Lyyds/ᛲᛴᛶᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛱᲇᛷᲈ;

    .line 19
    .line 20
    iget v2, p1, Lyyds/ᛲᛵᲀᛳ;->ᛲᲈᲁ:I

    .line 21
    .line 22
    iput v2, p0, Lyyds/ᛲᛴᛶᛸ;->ᛶᛷᛲᲁ:I

    .line 23
    .line 24
    iget-object p1, p1, Lyyds/ᛲᛵᲀᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lyyds/ᲇᛳᛱᲀ;

    .line 27
    .line 28
    iput-object p1, p0, Lyyds/ᛲᛴᛶᛸ;->ᛱᲈᲁ:Lyyds/ᲇᛳᛱᲀ;

    .line 29
    .line 30
    new-instance p1, Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-direct {p1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lyyds/ᛲᛴᛶᛸ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 40
    .line 41
    new-instance p1, Lyyds/ᲀᛳᛸᛴ;

    .line 42
    .line 43
    invoke-direct {p1}, Lyyds/ᲀᛳᛸᛴ;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lyyds/ᛲᛴᛶᛸ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛳᛸᛴ;

    .line 47
    .line 48
    new-instance p1, Lyyds/ᲇᛸᲀᛳ;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lyyds/ᲇᛸᲀᛳ;-><init>(Lyyds/ᛲᛴᛶᛸ;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲇᛸᲀᛳ;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 60
    .line 61
    .line 62
    if-nez v2, :cond_0

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    :try_start_0
    iput v2, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lyyds/ᛲᛴᛶᛸ;->ᛵᛸᛸᛷ()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_1

    .line 91
    .line 92
    :try_start_1
    new-instance v0, Lyyds/ᛷᲈᲈᛸ;

    .line 93
    .line 94
    invoke-direct {v0, p1}, Lyyds/ᛷᲈᲈᛸ;-><init>(Lyyds/ᲇᛸᲀᛳ;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v1, v0}, Lyyds/ᛱᲇᛷᲈ;->ᛲᲈᲁ(Lyyds/ᛲᲇᲁᛳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :catchall_1
    move-exception p1

    .line 102
    invoke-virtual {p0, p1}, Lyyds/ᛲᛴᛶᛸ;->ᲇᲈᛵᛷ(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    return-void
.end method

.method public static ᛲᲈᲁ()Lyyds/ᛲᛴᛶᛸ;
    .locals 4

    .line 1
    sget-object v0, Lyyds/ᛲᛴᛶᛸ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lyyds/ᛲᛴᛶᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛴᛶᛸ;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    :goto_0
    const-string v3, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object v1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw v1
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛴᛶᛸ;->ᛵᛸᛸᛷ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    const/4 v3, 0x0

    .line 13
    if-eqz v0, :cond_22

    .line 14
    .line 15
    if-ltz p2, :cond_21

    .line 16
    .line 17
    if-ltz p3, :cond_20

    .line 18
    .line 19
    if-gt p2, p3, :cond_1

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, v1

    .line 24
    :goto_1
    if-eqz v0, :cond_1f

    .line 25
    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    return-object v3

    .line 29
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-gt p2, v0, :cond_3

    .line 34
    .line 35
    move v0, v2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    move v0, v1

    .line 38
    :goto_2
    if-eqz v0, :cond_1e

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-gt p3, v0, :cond_4

    .line 45
    .line 46
    move v0, v2

    .line 47
    goto :goto_3

    .line 48
    :cond_4
    move v0, v1

    .line 49
    :goto_3
    if-eqz v0, :cond_1d

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1c

    .line 56
    .line 57
    if-ne p2, p3, :cond_5

    .line 58
    .line 59
    goto/16 :goto_c

    .line 60
    .line 61
    :cond_5
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲇᛸᲀᛳ;

    .line 62
    .line 63
    iget-object p0, p0, Lyyds/ᲇᛸᲀᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Lyyds/ᲀᲈᛶᲈ;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    instance-of v0, p1, Lyyds/ᲇᛲᛴᛵ;

    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    move-object v4, p1

    .line 75
    check-cast v4, Lyyds/ᲇᛲᛴᛵ;

    .line 76
    .line 77
    invoke-virtual {v4}, Lyyds/ᲇᛲᛴᛵ;->ᛲᲈᲁ()V

    .line 78
    .line 79
    .line 80
    :cond_6
    const-class v4, Lyyds/ᛸᲇᛲᲈ;

    .line 81
    .line 82
    if-nez v0, :cond_8

    .line 83
    .line 84
    :try_start_0
    instance-of v5, p1, Landroid/text/Spannable;

    .line 85
    .line 86
    if-eqz v5, :cond_7

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_7
    instance-of v5, p1, Landroid/text/Spanned;

    .line 90
    .line 91
    if-eqz v5, :cond_9

    .line 92
    .line 93
    move-object v5, p1

    .line 94
    check-cast v5, Landroid/text/Spanned;

    .line 95
    .line 96
    add-int/lit8 v6, p2, -0x1

    .line 97
    .line 98
    add-int/lit8 v7, p3, 0x1

    .line 99
    .line 100
    invoke-interface {v5, v6, v7, v4}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-gt v5, p3, :cond_9

    .line 105
    .line 106
    new-instance v3, Lyyds/ᲀᛵᲇᛵ;

    .line 107
    .line 108
    invoke-direct {v3, p1}, Lyyds/ᲀᛵᲇᛵ;-><init>(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    goto :goto_5

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto/16 :goto_b

    .line 114
    .line 115
    :cond_8
    :goto_4
    new-instance v3, Lyyds/ᲀᛵᲇᛵ;

    .line 116
    .line 117
    move-object v5, p1

    .line 118
    check-cast v5, Landroid/text/Spannable;

    .line 119
    .line 120
    invoke-direct {v3, v5}, Lyyds/ᲀᛵᲇᛵ;-><init>(Landroid/text/Spannable;)V

    .line 121
    .line 122
    .line 123
    :cond_9
    :goto_5
    if-eqz v3, :cond_b

    .line 124
    .line 125
    iget-object v5, v3, Lyyds/ᲀᛵᲇᛵ;->ᲇᲈᛵᛷ:Landroid/text/Spannable;

    .line 126
    .line 127
    invoke-interface {v5, p2, p3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, [Lyyds/ᛸᲇᛲᲈ;

    .line 132
    .line 133
    if-eqz v4, :cond_b

    .line 134
    .line 135
    array-length v5, v4

    .line 136
    if-lez v5, :cond_b

    .line 137
    .line 138
    array-length v5, v4

    .line 139
    move v6, v1

    .line 140
    :goto_6
    if-ge v6, v5, :cond_b

    .line 141
    .line 142
    aget-object v7, v4, v6

    .line 143
    .line 144
    iget-object v8, v3, Lyyds/ᲀᛵᲇᛵ;->ᲇᲈᛵᛷ:Landroid/text/Spannable;

    .line 145
    .line 146
    invoke-interface {v8, v7}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    iget-object v9, v3, Lyyds/ᲀᛵᲇᛵ;->ᲇᲈᛵᛷ:Landroid/text/Spannable;

    .line 151
    .line 152
    invoke-interface {v9, v7}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    if-eq v8, p3, :cond_a

    .line 157
    .line 158
    invoke-virtual {v3, v7}, Lyyds/ᲀᛵᲇᛵ;->removeSpan(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_a
    invoke-static {v8, p2}, Ljava/lang/Math;->min(II)I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    invoke-static {v9, p3}, Ljava/lang/Math;->max(II)I

    .line 166
    .line 167
    .line 168
    move-result p3

    .line 169
    add-int/lit8 v6, v6, 0x1

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_b
    if-eq p2, p3, :cond_1a

    .line 173
    .line 174
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-lt p2, v4, :cond_c

    .line 179
    .line 180
    goto/16 :goto_a

    .line 181
    .line 182
    :cond_c
    new-instance v4, Lyyds/ᛷᛸᲇᛷ;

    .line 183
    .line 184
    iget-object v5, p0, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v5, Lyyds/ᛲᛲᲇᲈ;

    .line 187
    .line 188
    iget-object v5, v5, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v5, Lyyds/ᛷᲇᛵᛵ;

    .line 191
    .line 192
    invoke-direct {v4, v5}, Lyyds/ᛷᛸᲇᛷ;-><init>(Lyyds/ᛷᲇᛵᛵ;)V

    .line 193
    .line 194
    .line 195
    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    move v6, v5

    .line 200
    move-object v5, v3

    .line 201
    move v3, v1

    .line 202
    :cond_d
    :goto_7
    move v1, p2

    .line 203
    :cond_e
    :goto_8
    const/16 v7, 0x21

    .line 204
    .line 205
    const/4 v8, 0x2

    .line 206
    const v9, 0x7fffffff

    .line 207
    .line 208
    .line 209
    if-ge p2, p3, :cond_14

    .line 210
    .line 211
    if-ge v3, v9, :cond_14

    .line 212
    .line 213
    invoke-virtual {v4, v6}, Lyyds/ᛷᛸᲇᛷ;->ᛲᲈᲁ(I)I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    if-eq v9, v2, :cond_12

    .line 218
    .line 219
    if-eq v9, v8, :cond_11

    .line 220
    .line 221
    const/4 v8, 0x3

    .line 222
    if-eq v9, v8, :cond_f

    .line 223
    .line 224
    goto :goto_8

    .line 225
    :cond_f
    iget-object v8, v4, Lyyds/ᛷᛸᲇᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᲇᛵᛵ;

    .line 226
    .line 227
    iget-object v8, v8, Lyyds/ᛷᲇᛵᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲈᲁᲁ;

    .line 228
    .line 229
    invoke-virtual {p0, p1, v1, p2, v8}, Lyyds/ᲀᲈᛶᲈ;->ᛵᛶᛲᲀ(Ljava/lang/CharSequence;IILyyds/ᛳᲈᲁᲁ;)Z

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    if-nez v8, :cond_d

    .line 234
    .line 235
    if-nez v5, :cond_10

    .line 236
    .line 237
    new-instance v5, Lyyds/ᲀᛵᲇᛵ;

    .line 238
    .line 239
    new-instance v8, Landroid/text/SpannableString;

    .line 240
    .line 241
    invoke-direct {v8, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 242
    .line 243
    .line 244
    invoke-direct {v5, v8}, Lyyds/ᲀᛵᲇᛵ;-><init>(Landroid/text/Spannable;)V

    .line 245
    .line 246
    .line 247
    :cond_10
    iget-object v8, v4, Lyyds/ᛷᛸᲇᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᲇᛵᛵ;

    .line 248
    .line 249
    iget-object v8, v8, Lyyds/ᛷᲇᛵᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲈᲁᲁ;

    .line 250
    .line 251
    new-instance v9, Lyyds/ᛸᲇᛲᲈ;

    .line 252
    .line 253
    invoke-direct {v9, v8}, Lyyds/ᛸᲇᛲᲈ;-><init>(Lyyds/ᛳᲈᲁᲁ;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v5, v9, v1, p2, v7}, Lyyds/ᲀᛵᲇᛵ;->setSpan(Ljava/lang/Object;III)V

    .line 257
    .line 258
    .line 259
    add-int/lit8 v3, v3, 0x1

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_11
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    add-int/2addr p2, v7

    .line 267
    if-ge p2, p3, :cond_e

    .line 268
    .line 269
    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    goto :goto_8

    .line 274
    :cond_12
    invoke-static {p1, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 275
    .line 276
    .line 277
    move-result p2

    .line 278
    invoke-static {p2}, Ljava/lang/Character;->charCount(I)I

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    add-int/2addr v1, p2

    .line 283
    if-ge v1, p3, :cond_13

    .line 284
    .line 285
    invoke-static {p1, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 286
    .line 287
    .line 288
    move-result p2

    .line 289
    move v6, p2

    .line 290
    :cond_13
    move p2, v1

    .line 291
    goto :goto_8

    .line 292
    :cond_14
    iget p3, v4, Lyyds/ᛷᛸᲇᛷ;->ᛲᲈᲁ:I

    .line 293
    .line 294
    if-ne p3, v8, :cond_17

    .line 295
    .line 296
    iget-object p3, v4, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

    .line 297
    .line 298
    iget-object p3, p3, Lyyds/ᛷᲇᛵᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲈᲁᲁ;

    .line 299
    .line 300
    if-eqz p3, :cond_17

    .line 301
    .line 302
    iget p3, v4, Lyyds/ᛷᛸᲇᛷ;->ᲇᲇᲇᛱ:I

    .line 303
    .line 304
    if-gt p3, v2, :cond_15

    .line 305
    .line 306
    invoke-virtual {v4}, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ()Z

    .line 307
    .line 308
    .line 309
    move-result p3

    .line 310
    if-eqz p3, :cond_17

    .line 311
    .line 312
    :cond_15
    if-ge v3, v9, :cond_17

    .line 313
    .line 314
    iget-object p3, v4, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

    .line 315
    .line 316
    iget-object p3, p3, Lyyds/ᛷᲇᛵᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲈᲁᲁ;

    .line 317
    .line 318
    invoke-virtual {p0, p1, v1, p2, p3}, Lyyds/ᲀᲈᛶᲈ;->ᛵᛶᛲᲀ(Ljava/lang/CharSequence;IILyyds/ᛳᲈᲁᲁ;)Z

    .line 319
    .line 320
    .line 321
    move-result p0

    .line 322
    if-nez p0, :cond_17

    .line 323
    .line 324
    if-nez v5, :cond_16

    .line 325
    .line 326
    new-instance p0, Lyyds/ᲀᛵᲇᛵ;

    .line 327
    .line 328
    invoke-direct {p0, p1}, Lyyds/ᲀᛵᲇᛵ;-><init>(Ljava/lang/CharSequence;)V

    .line 329
    .line 330
    .line 331
    move-object v5, p0

    .line 332
    :cond_16
    iget-object p0, v4, Lyyds/ᛷᛸᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲇᛵᛵ;

    .line 333
    .line 334
    iget-object p0, p0, Lyyds/ᛷᲇᛵᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲈᲁᲁ;

    .line 335
    .line 336
    new-instance p3, Lyyds/ᛸᲇᛲᲈ;

    .line 337
    .line 338
    invoke-direct {p3, p0}, Lyyds/ᛸᲇᛲᲈ;-><init>(Lyyds/ᛳᲈᲁᲁ;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v5, p3, v1, p2, v7}, Lyyds/ᲀᛵᲇᛵ;->setSpan(Ljava/lang/Object;III)V

    .line 342
    .line 343
    .line 344
    :cond_17
    if-eqz v5, :cond_19

    .line 345
    .line 346
    iget-object p0, v5, Lyyds/ᲀᛵᲇᛵ;->ᲇᲈᛵᛷ:Landroid/text/Spannable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 347
    .line 348
    if-eqz v0, :cond_18

    .line 349
    .line 350
    check-cast p1, Lyyds/ᲇᛲᛴᛵ;

    .line 351
    .line 352
    invoke-virtual {p1}, Lyyds/ᲇᛲᛴᛵ;->ᛵᛸᛸᛷ()V

    .line 353
    .line 354
    .line 355
    :cond_18
    return-object p0

    .line 356
    :cond_19
    if-eqz v0, :cond_1c

    .line 357
    .line 358
    :goto_9
    move-object p0, p1

    .line 359
    check-cast p0, Lyyds/ᲇᛲᛴᛵ;

    .line 360
    .line 361
    invoke-virtual {p0}, Lyyds/ᲇᛲᛴᛵ;->ᛵᛸᛸᛷ()V

    .line 362
    .line 363
    .line 364
    return-object p1

    .line 365
    :cond_1a
    :goto_a
    if-eqz v0, :cond_1c

    .line 366
    .line 367
    goto :goto_9

    .line 368
    :goto_b
    if-eqz v0, :cond_1b

    .line 369
    .line 370
    check-cast p1, Lyyds/ᲇᛲᛴᛵ;

    .line 371
    .line 372
    invoke-virtual {p1}, Lyyds/ᲇᛲᛴᛵ;->ᛵᛸᛸᛷ()V

    .line 373
    .line 374
    .line 375
    :cond_1b
    throw p0

    .line 376
    :cond_1c
    :goto_c
    return-object p1

    .line 377
    :cond_1d
    const-string p0, "end should be < than charSequence length"

    .line 378
    .line 379
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    return-object v3

    .line 383
    :cond_1e
    const-string p0, "start should be < than charSequence length"

    .line 384
    .line 385
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    return-object v3

    .line 389
    :cond_1f
    const-string p0, "start should be <= than end"

    .line 390
    .line 391
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    return-object v3

    .line 395
    :cond_20
    const-string p0, "end cannot be negative"

    .line 396
    .line 397
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    return-object v3

    .line 401
    :cond_21
    const-string p0, "start cannot be negative"

    .line 402
    .line 403
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    return-object v3

    .line 407
    :cond_22
    const-string p0, "Not initialized yet"

    .line 408
    .line 409
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    return-object v3
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 19
    .line 20
    .line 21
    return v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Lyyds/ᛲᛴᛶᛸ;->ᛵᛸᛸᛷ()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    :try_start_1
    iput v1, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    iget-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲇᛸᲀᛳ;

    .line 54
    .line 55
    iget-object v0, p0, Lyyds/ᲇᛸᲀᛳ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lyyds/ᛲᛴᛶᛸ;

    .line 58
    .line 59
    :try_start_2
    new-instance v1, Lyyds/ᛷᲈᲈᛸ;

    .line 60
    .line 61
    invoke-direct {v1, p0}, Lyyds/ᛷᲈᲈᛸ;-><init>(Lyyds/ᲇᛸᲀᛳ;)V

    .line 62
    .line 63
    .line 64
    iget-object p0, v0, Lyyds/ᛲᛴᛶᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛱᲇᛷᲈ;

    .line 65
    .line 66
    invoke-interface {p0, v1}, Lyyds/ᛱᲇᛷᲈ;->ᛲᲈᲁ(Lyyds/ᛲᲇᲁᛳ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    invoke-virtual {v0, p0}, Lyyds/ᛲᛴᛶᛸ;->ᲇᲈᛵᛷ(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_3
    const-string p0, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"

    .line 87
    .line 88
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Lyyds/ᛳᛱᛱᛴ;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    iget v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛳᛸᛴ;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lyyds/ᲀᛳᛸᛴ;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_2

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, Lyyds/ᛲᛴᛶᛸ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 30
    .line 31
    new-instance v1, Lyyds/ᛶᲁᛲᛳ;

    .line 32
    .line 33
    iget v2, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 34
    .line 35
    filled-new-array {p1}, [Lyyds/ᛳᛱᛱᛴ;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct {v1, p1, v2, v3}, Lyyds/ᛶᲁᛲᛳ;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    :goto_1
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :goto_2
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 67
    .line 68
    .line 69
    throw p1
.end method

.method public final ᲇᲈᛵᛷ(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    :try_start_0
    iput v1, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    iget-object v1, p0, Lyyds/ᛲᛴᛶᛸ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛳᛸᛴ;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lyyds/ᛲᛴᛶᛸ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛳᛸᛴ;

    .line 24
    .line 25
    invoke-virtual {v1}, Lyyds/ᲀᛳᛸᛴ;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lyyds/ᛲᛴᛶᛸ;->ᲇᲈᛵᛷ:Landroid/os/Handler;

    .line 38
    .line 39
    new-instance v2, Lyyds/ᛶᲁᛲᛳ;

    .line 40
    .line 41
    iget p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 42
    .line 43
    invoke-direct {v2, v0, p0, p1}, Lyyds/ᛶᲁᛲᛳ;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    iget-object p0, p0, Lyyds/ᛲᛴᛶᛸ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 58
    .line 59
    .line 60
    throw p1
.end method
