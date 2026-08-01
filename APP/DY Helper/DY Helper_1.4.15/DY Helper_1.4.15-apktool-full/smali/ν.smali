.class public final synthetic Lν;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 11
    iput p1, p0, Lν;->ε:I

    iput-object p2, p0, Lν;->ζ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Lmz1;Lpr;)V
    .locals 0

    .line 1
    const/16 p2, 0xb

    .line 2
    .line 3
    iput p2, p0, Lν;->ε:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lν;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method private final α()V
    .locals 4

    .line 1
    iget-object p0, p0, Lν;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo50;

    .line 4
    .line 5
    const-string v0, "fetchFonts result is not OK. ("

    .line 6
    .line 7
    iget-object v1, p0, Lo50;->δ:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, p0, Lo50;->θ:Lpd2;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    monitor-exit v1

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    invoke-virtual {p0}, Lo50;->γ()Lf60;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget v2, v1, Lf60;->ζ:I

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-ne v2, v3, :cond_1

    .line 28
    .line 29
    iget-object v3, p0, Lo50;->δ:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 32
    :try_start_2
    monitor-exit v3

    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception v0

    .line 35
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 36
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 37
    :catchall_2
    move-exception v0

    .line 38
    goto :goto_3

    .line 39
    :cond_1
    :goto_0
    if-nez v2, :cond_4

    .line 40
    .line 41
    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 42
    .line 43
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lo50;->γ:Li2;

    .line 47
    .line 48
    iget-object v2, p0, Lo50;->α:Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    filled-new-array {v1}, [Lf60;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-static {v2, v0, v3}, Li62;->α(Landroid/content/Context;[Lf60;I)Landroid/graphics/Typeface;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v2, p0, Lo50;->α:Landroid/content/Context;

    .line 63
    .line 64
    iget-object v1, v1, Lf60;->α:Landroid/net/Uri;

    .line 65
    .line 66
    invoke-static {v2, v1}, Lu81;->μ(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 67
    .line 68
    .line 69
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    :try_start_5
    const-string v2, "EmojiCompat.MetadataRepo.create"

    .line 75
    .line 76
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v2, Li0;

    .line 80
    .line 81
    invoke-static {v1}, Lln0;->б(Ljava/nio/MappedByteBuffer;)Lh01;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-direct {v2, v0, v1}, Li0;-><init>(Landroid/graphics/Typeface;Lh01;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 86
    .line 87
    .line 88
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 89
    .line 90
    .line 91
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lo50;->δ:Ljava/lang/Object;

    .line 95
    .line 96
    monitor-enter v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 97
    :try_start_8
    iget-object v1, p0, Lo50;->θ:Lpd2;

    .line 98
    .line 99
    if-eqz v1, :cond_2

    .line 100
    .line 101
    invoke-virtual {v1, v2}, Lpd2;->Ζ(Li0;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catchall_3
    move-exception v1

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    :goto_1
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 108
    :try_start_9
    invoke-virtual {p0}, Lo50;->β()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :goto_2
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 113
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 114
    :catchall_4
    move-exception v0

    .line 115
    :try_start_c
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 116
    .line 117
    .line 118
    throw v0

    .line 119
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 120
    .line 121
    const-string v1, "Unable to open file."

    .line 122
    .line 123
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 127
    :catchall_5
    move-exception v0

    .line 128
    :try_start_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :cond_4
    new-instance v1, Ljava/lang/RuntimeException;

    .line 133
    .line 134
    new-instance v3, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v0, ")"

    .line 143
    .line 144
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 155
    :goto_3
    iget-object v2, p0, Lo50;->δ:Ljava/lang/Object;

    .line 156
    .line 157
    monitor-enter v2

    .line 158
    :try_start_e
    iget-object v1, p0, Lo50;->θ:Lpd2;

    .line 159
    .line 160
    if-eqz v1, :cond_5

    .line 161
    .line 162
    invoke-virtual {v1, v0}, Lpd2;->Ε(Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :catchall_6
    move-exception p0

    .line 167
    goto :goto_5

    .line 168
    :cond_5
    :goto_4
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 169
    invoke-virtual {p0}, Lo50;->β()V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :goto_5
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 174
    throw p0

    .line 175
    :goto_6
    :try_start_10
    monitor-exit v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 176
    throw p0
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lν;->ε:I

    .line 4
    .line 5
    const/4 v4, 0x7

    .line 6
    const/4 v5, 0x5

    .line 7
    const/4 v6, 0x2

    .line 8
    const/4 v7, 0x1

    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v9, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lh52;

    .line 17
    .line 18
    invoke-virtual {v0}, Lh52;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lh52;

    .line 25
    .line 26
    invoke-virtual {v0}, Lh52;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Landroidx/core/view/insets/α;

    .line 33
    .line 34
    iget-object v0, v0, Landroidx/core/view/insets/α;->α:Landroid/view/View;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    check-cast v1, Landroid/view/ViewGroup;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void

    .line 50
    :pswitch_2
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljy1;

    .line 53
    .line 54
    sget-object v1, Lry1;->α:Lry1;

    .line 55
    .line 56
    const-string v2, "\u9700\u8981\u7eed\u671f: "

    .line 57
    .line 58
    const-string v3, "\u6536\u96c6\u5230 "

    .line 59
    .line 60
    const-string v4, "\u7eed\u706b\u7ebf\u7a0b\u542f\u52a8\uff0c\u7b49\u5f85 "

    .line 61
    .line 62
    :try_start_0
    iget v5, v0, Ljy1;->δ:I

    .line 63
    .line 64
    new-instance v10, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v4, " \u79d2"

    .line 73
    .line 74
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {v4}, Lry1;->ю(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget v4, v0, Ljy1;->δ:I

    .line 85
    .line 86
    int-to-long v4, v4

    .line 87
    const-wide/16 v10, 0x3e8

    .line 88
    .line 89
    mul-long/2addr v4, v10

    .line 90
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 94
    .line 95
    .line 96
    move-result v4
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    if-eqz v4, :cond_1

    .line 98
    .line 99
    :goto_0
    sget-object v0, Lry1;->г:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 100
    .line 101
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 102
    .line 103
    .line 104
    goto/16 :goto_2

    .line 105
    .line 106
    :cond_1
    :try_start_1
    const-string v4, "\u706b\u82b1\u6570\u636e"

    .line 107
    .line 108
    new-instance v5, Ltv1;

    .line 109
    .line 110
    invoke-direct {v5, v7}, Ltv1;-><init>(I)V

    .line 111
    .line 112
    .line 113
    const/16 v7, 0x3c

    .line 114
    .line 115
    invoke-static {v7, v5, v4}, Lry1;->ｕ(ILp70;Ljava/lang/String;)Ls62;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    if-nez v4, :cond_2

    .line 120
    .line 121
    const-string v0, "60s \u8d85\u65f6\uff0c\u65e0\u706b\u82b1\u6570\u636e"

    .line 122
    .line 123
    invoke-static {v0}, Lry1;->ю(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    goto/16 :goto_1

    .line 129
    .line 130
    :cond_2
    sget-object v4, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    new-instance v5, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v3, " \u4e2a\u4f1a\u8bdd"

    .line 145
    .line 146
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-static {v3}, Lry1;->ю(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    sget-object v3, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 157
    .line 158
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    if-nez v4, :cond_4

    .line 163
    .line 164
    const-string v4, "IMSdkContext"

    .line 165
    .line 166
    new-instance v5, Ltv1;

    .line 167
    .line 168
    invoke-direct {v5, v6}, Ltv1;-><init>(I)V

    .line 169
    .line 170
    .line 171
    const/16 v6, 0x14

    .line 172
    .line 173
    invoke-static {v6, v5, v4}, Lry1;->ｕ(ILp70;Ljava/lang/String;)Ls62;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    if-nez v4, :cond_3

    .line 181
    .line 182
    sget-object v4, Lry1;->φ:Ljava/lang/ClassLoader;

    .line 183
    .line 184
    if-eqz v4, :cond_3

    .line 185
    .line 186
    invoke-static {v4}, Lry1;->ｓ(Ljava/lang/ClassLoader;)Leo1;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    if-eqz v4, :cond_3

    .line 191
    .line 192
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v4}, Lry1;->ξ(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    const-string v4, "\u4e3b\u52a8\u83b7\u53d6 IMSdkContext \u6210\u529f"

    .line 199
    .line 200
    invoke-static {v4}, Lry1;->ю(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :cond_3
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    if-nez v3, :cond_4

    .line 208
    .line 209
    const-string v0, "IMSdkContext \u4e0d\u53ef\u7528\uff0c\u653e\u5f03\u7eed\u671f"

    .line 210
    .line 211
    invoke-static {v0, v8}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    goto :goto_0

    .line 215
    :cond_4
    const-string v3, "\u53d1\u9001\u6838\u5fc3"

    .line 216
    .line 217
    new-instance v4, Ltv1;

    .line 218
    .line 219
    const/4 v5, 0x3

    .line 220
    invoke-direct {v4, v5}, Ltv1;-><init>(I)V

    .line 221
    .line 222
    .line 223
    const/16 v5, 0x1e

    .line 224
    .line 225
    invoke-static {v5, v4, v3}, Lry1;->ｕ(ILp70;Ljava/lang/String;)Ls62;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    if-nez v3, :cond_5

    .line 230
    .line 231
    const-string v0, "\u53d1\u9001\u6838\u5fc3 30s \u672a\u5c31\u7eea"

    .line 232
    .line 233
    invoke-static {v0}, Lry1;->ю(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :cond_5
    invoke-static {}, Lry1;->Ξ()Ljava/util/ArrayList;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    new-instance v5, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-static {v2}, Lry1;->ю(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    if-eqz v2, :cond_6

    .line 266
    .line 267
    const-string v0, "\u6240\u6709\u706b\u82b1\u4eca\u65e5\u5747\u5df2\u7eed\u671f"

    .line 268
    .line 269
    invoke-static {v0}, Lry1;->ю(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_6
    invoke-virtual {v1, v3, v0}, Lry1;->Ε(Ljava/util/ArrayList;Ljy1;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 275
    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :goto_1
    :try_start_2
    const-string v1, "\u7eed\u706b\u7ebf\u7a0b\u5f02\u5e38"

    .line 280
    .line 281
    invoke-static {v1, v0}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    goto/16 :goto_0

    .line 285
    .line 286
    :catchall_1
    move-exception v0

    .line 287
    goto :goto_3

    .line 288
    :catch_0
    const-string v0, "\u7eed\u706b\u7ebf\u7a0b\u88ab\u4e2d\u65ad"

    .line 289
    .line 290
    invoke-static {v0}, Lry1;->щ(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 291
    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :goto_2
    return-void

    .line 296
    :goto_3
    sget-object v1, Lry1;->г:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 297
    .line 298
    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 299
    .line 300
    .line 301
    throw v0

    .line 302
    :pswitch_3
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Lwi1;

    .line 305
    .line 306
    iget-object v1, v0, Lwi1;->κ:Ljr0;

    .line 307
    .line 308
    iget v2, v0, Lwi1;->ζ:I

    .line 309
    .line 310
    if-nez v2, :cond_7

    .line 311
    .line 312
    iput-boolean v7, v0, Lwi1;->η:Z

    .line 313
    .line 314
    sget-object v2, Lbr0;->ON_PAUSE:Lbr0;

    .line 315
    .line 316
    invoke-virtual {v1, v2}, Ljr0;->δ(Lbr0;)V

    .line 317
    .line 318
    .line 319
    :cond_7
    iget v2, v0, Lwi1;->ε:I

    .line 320
    .line 321
    if-nez v2, :cond_8

    .line 322
    .line 323
    iget-boolean v2, v0, Lwi1;->η:Z

    .line 324
    .line 325
    if-eqz v2, :cond_8

    .line 326
    .line 327
    sget-object v2, Lbr0;->ON_STOP:Lbr0;

    .line 328
    .line 329
    invoke-virtual {v1, v2}, Ljr0;->δ(Lbr0;)V

    .line 330
    .line 331
    .line 332
    iput-boolean v7, v0, Lwi1;->θ:Z

    .line 333
    .line 334
    :cond_8
    return-void

    .line 335
    :pswitch_4
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Ld81;

    .line 338
    .line 339
    iput-boolean v9, v0, Ld81;->μ:Z

    .line 340
    .line 341
    return-void

    .line 342
    :pswitch_5
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, Landroid/widget/ScrollView;

    .line 345
    .line 346
    invoke-virtual {v0, v9, v9}, Landroid/widget/ScrollView;->scrollTo(II)V

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :pswitch_6
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, Lxb0;

    .line 353
    .line 354
    invoke-virtual {v0}, Lxb0;->invoke()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_7
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Landroid/view/Window;

    .line 361
    .line 362
    sget-object v1, Lil0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 363
    .line 364
    :try_start_3
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v0}, Landroid/view/View;->requestApplyInsets()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 369
    .line 370
    .line 371
    :catchall_2
    return-void

    .line 372
    :pswitch_8
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v0, Ljava/lang/Class;

    .line 375
    .line 376
    sget-object v1, Lah0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 377
    .line 378
    :try_start_4
    sget-object v2, Lah0;->α:Landroid/os/Handler;

    .line 379
    .line 380
    invoke-static {}, Lah0;->Θ()Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    if-eqz v2, :cond_9

    .line 385
    .line 386
    invoke-static {v0}, Lah0;->Ε(Ljava/lang/Class;)Z

    .line 387
    .line 388
    .line 389
    invoke-static {}, Lah0;->κ()V

    .line 390
    .line 391
    .line 392
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 393
    .line 394
    new-instance v2, Lfb0;

    .line 395
    .line 396
    invoke-direct {v2, v6}, Lfb0;-><init>(I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 400
    .line 401
    .line 402
    goto :goto_4

    .line 403
    :catchall_3
    move-exception v0

    .line 404
    goto :goto_5

    .line 405
    :cond_9
    :goto_4
    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :goto_5
    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :pswitch_9
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v0, Ldc0;

    .line 416
    .line 417
    new-instance v1, Lum1;

    .line 418
    .line 419
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 420
    .line 421
    .line 422
    new-instance v2, Lp3;

    .line 423
    .line 424
    const/16 v3, 0xe

    .line 425
    .line 426
    invoke-direct {v2, v1, v3, v0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    invoke-static {v2}, Ljc0;->α(Lp70;)Z

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    if-nez v2, :cond_a

    .line 434
    .line 435
    new-instance v1, Lwb0;

    .line 436
    .line 437
    invoke-direct {v1, v0, v5}, Lwb0;-><init>(Ldc0;I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v1}, Ldc0;->β(Lp70;)V

    .line 441
    .line 442
    .line 443
    goto :goto_6

    .line 444
    :cond_a
    iget-object v2, v1, Lum1;->ε:Ljava/lang/Object;

    .line 445
    .line 446
    if-eqz v2, :cond_b

    .line 447
    .line 448
    check-cast v2, Lsb0;

    .line 449
    .line 450
    iget-object v2, v2, Lsb0;->β:Ljava/util/List;

    .line 451
    .line 452
    invoke-virtual {v0, v2}, Ldc0;->γ(Ljava/util/List;)Ljava/util/Map;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    new-instance v3, Lz7;

    .line 457
    .line 458
    invoke-direct {v3, v0, v1, v2, v4}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0, v3}, Ldc0;->β(Lp70;)V

    .line 462
    .line 463
    .line 464
    :goto_6
    return-void

    .line 465
    :cond_b
    const-string v0, "result"

    .line 466
    .line 467
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    throw v8

    .line 471
    :pswitch_a
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v0, Lja0;

    .line 474
    .line 475
    invoke-virtual {v0}, Lja0;->invoke()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    return-void

    .line 479
    :pswitch_b
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v0, Lja0;

    .line 482
    .line 483
    invoke-virtual {v0}, Lja0;->invoke()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    return-void

    .line 487
    :pswitch_c
    invoke-direct {v0}, Lν;->α()V

    .line 488
    .line 489
    .line 490
    return-void

    .line 491
    :pswitch_d
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v0, Lo7;

    .line 494
    .line 495
    invoke-virtual {v0}, Lo7;->invoke()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    return-void

    .line 499
    :pswitch_e
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v0, Lη;

    .line 502
    .line 503
    invoke-virtual {v0}, Lη;->invoke()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    return-void

    .line 507
    :pswitch_f
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v0, Lhb;

    .line 510
    .line 511
    invoke-virtual {v0}, Lhb;->invoke()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    return-void

    .line 515
    :pswitch_10
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v0, Ljava/util/ArrayList;

    .line 518
    .line 519
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v1

    .line 523
    if-nez v1, :cond_c

    .line 524
    .line 525
    return-void

    .line 526
    :cond_c
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    throw v8

    .line 530
    :pswitch_11
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v0, Lxm;

    .line 533
    .line 534
    invoke-static {v0}, Lxm;->β(Lxm;)V

    .line 535
    .line 536
    .line 537
    return-void

    .line 538
    :pswitch_12
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v0, Lwm;

    .line 541
    .line 542
    iget-object v1, v0, Lwm;->ζ:Ljava/lang/Runnable;

    .line 543
    .line 544
    if-eqz v1, :cond_d

    .line 545
    .line 546
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 547
    .line 548
    .line 549
    iput-object v8, v0, Lwm;->ζ:Ljava/lang/Runnable;

    .line 550
    .line 551
    :cond_d
    return-void

    .line 552
    :pswitch_13
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 555
    .line 556
    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 557
    .line 558
    .line 559
    return-void

    .line 560
    :pswitch_14
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v0, Laf0;

    .line 563
    .line 564
    invoke-virtual {v0}, Laf0;->invoke()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    return-void

    .line 568
    :pswitch_15
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 569
    .line 570
    move-object v1, v0

    .line 571
    check-cast v1, Ldj;

    .line 572
    .line 573
    sget-object v0, Lfj;->π:Ljava/util/concurrent/atomic/AtomicReference;

    .line 574
    .line 575
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    if-eq v4, v1, :cond_e

    .line 580
    .line 581
    goto/16 :goto_11

    .line 582
    .line 583
    :cond_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 584
    .line 585
    .line 586
    move-result-wide v10

    .line 587
    iget-object v4, v1, Ldj;->ζ:Ljava/lang/Object;

    .line 588
    .line 589
    monitor-enter v4

    .line 590
    :try_start_5
    iget-wide v12, v1, Ldj;->θ:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_c

    .line 591
    .line 592
    monitor-exit v4

    .line 593
    iget-wide v14, v1, Ldj;->ι:J

    .line 594
    .line 595
    const-wide/16 v16, 0x0

    .line 596
    .line 597
    iget-wide v2, v1, Ldj;->ε:J

    .line 598
    .line 599
    sub-long v2, v10, v2

    .line 600
    .line 601
    const-wide/32 v18, 0xafc8

    .line 602
    .line 603
    .line 604
    cmp-long v2, v2, v18

    .line 605
    .line 606
    if-ltz v2, :cond_f

    .line 607
    .line 608
    move v2, v7

    .line 609
    goto :goto_7

    .line 610
    :cond_f
    move v2, v9

    .line 611
    :goto_7
    const-wide/16 v18, 0x800

    .line 612
    .line 613
    cmp-long v3, v12, v18

    .line 614
    .line 615
    if-ltz v3, :cond_10

    .line 616
    .line 617
    cmp-long v3, v14, v16

    .line 618
    .line 619
    if-lez v3, :cond_10

    .line 620
    .line 621
    sub-long/2addr v10, v14

    .line 622
    const-wide/16 v3, 0x640

    .line 623
    .line 624
    cmp-long v3, v10, v3

    .line 625
    .line 626
    if-ltz v3, :cond_10

    .line 627
    .line 628
    goto :goto_8

    .line 629
    :cond_10
    move v7, v9

    .line 630
    :goto_8
    if-nez v2, :cond_12

    .line 631
    .line 632
    if-eqz v7, :cond_11

    .line 633
    .line 634
    goto :goto_9

    .line 635
    :cond_11
    sget-object v0, Lfj;->α:Lfj;

    .line 636
    .line 637
    sget-object v0, Lfj;->ο:Ljava/util/concurrent/ScheduledExecutorService;

    .line 638
    .line 639
    new-instance v2, Lν;

    .line 640
    .line 641
    const/4 v3, 0x6

    .line 642
    invoke-direct {v2, v3, v1}, Lν;-><init>(ILjava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    const-wide/16 v3, 0x1f4

    .line 646
    .line 647
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 648
    .line 649
    invoke-interface {v0, v2, v3, v4, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 650
    .line 651
    .line 652
    goto/16 :goto_11

    .line 653
    .line 654
    :cond_12
    :goto_9
    sget-object v3, Lfj;->α:Lfj;

    .line 655
    .line 656
    :cond_13
    invoke-virtual {v0, v1, v8}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    if-eqz v3, :cond_1c

    .line 661
    .line 662
    :try_start_6
    iget-object v3, v1, Ldj;->ζ:Ljava/lang/Object;

    .line 663
    .line 664
    monitor-enter v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 665
    :try_start_7
    iget-object v0, v1, Ldj;->η:Ljava/io/BufferedOutputStream;

    .line 666
    .line 667
    if-eqz v0, :cond_14

    .line 668
    .line 669
    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 670
    .line 671
    .line 672
    :catchall_4
    :cond_14
    :try_start_8
    iget-object v0, v1, Ldj;->η:Ljava/io/BufferedOutputStream;

    .line 673
    .line 674
    if-eqz v0, :cond_15

    .line 675
    .line 676
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 677
    .line 678
    .line 679
    :catchall_5
    :cond_15
    :try_start_9
    iput-object v8, v1, Ldj;->η:Ljava/io/BufferedOutputStream;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 680
    .line 681
    :try_start_a
    monitor-exit v3

    .line 682
    iget-object v3, v1, Ldj;->ζ:Ljava/lang/Object;

    .line 683
    .line 684
    monitor-enter v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 685
    :try_start_b
    iget-wide v10, v1, Ldj;->θ:J
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 686
    .line 687
    :try_start_c
    monitor-exit v3

    .line 688
    cmp-long v0, v10, v18

    .line 689
    .line 690
    if-ltz v0, :cond_19

    .line 691
    .line 692
    iget-object v0, v1, Ldj;->γ:Ljava/io/File;

    .line 693
    .line 694
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 695
    .line 696
    .line 697
    move-result v0

    .line 698
    if-nez v0, :cond_16

    .line 699
    .line 700
    goto :goto_c

    .line 701
    :cond_16
    iget-object v0, v1, Ldj;->κ:Lej;

    .line 702
    .line 703
    if-nez v0, :cond_17

    .line 704
    .line 705
    new-instance v0, Lej;

    .line 706
    .line 707
    const v2, 0xac44

    .line 708
    .line 709
    .line 710
    invoke-direct {v0, v2, v6, v6}, Lej;-><init>(III)V

    .line 711
    .line 712
    .line 713
    :cond_17
    iget-object v2, v1, Ldj;->β:Lcj;

    .line 714
    .line 715
    iget-object v3, v2, Lcj;->ε:Ljava/lang/String;

    .line 716
    .line 717
    iget-object v2, v2, Lcj;->α:Ljava/lang/String;

    .line 718
    .line 719
    const-string v4, "wav"

    .line 720
    .line 721
    invoke-static {v3, v2, v4}, Lfj;->β(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    iget-object v3, v1, Ldj;->α:Landroid/content/Context;

    .line 726
    .line 727
    iget-object v4, v1, Ldj;->β:Lcj;

    .line 728
    .line 729
    const-string v6, "audio/wav"

    .line 730
    .line 731
    new-instance v7, Lwa;

    .line 732
    .line 733
    invoke-direct {v7, v1, v5, v0}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    invoke-static {v3, v4, v2, v6, v7}, Lfj;->Ε(Landroid/content/Context;Lcj;Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    if-eqz v0, :cond_18

    .line 741
    .line 742
    iget-object v2, v1, Ldj;->α:Landroid/content/Context;

    .line 743
    .line 744
    new-instance v3, Ljava/lang/StringBuilder;

    .line 745
    .line 746
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 747
    .line 748
    .line 749
    const-string v4, "\u8bc4\u8bba\u8bed\u97f3\u5df2\u4fdd\u5b58\u4e3a WAV: "

    .line 750
    .line 751
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    invoke-static {v2, v0}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 762
    .line 763
    .line 764
    goto :goto_a

    .line 765
    :catchall_6
    move-exception v0

    .line 766
    goto :goto_e

    .line 767
    :cond_18
    :goto_a
    :try_start_d
    iget-object v0, v1, Ldj;->γ:Ljava/io/File;

    .line 768
    .line 769
    :goto_b
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 770
    .line 771
    .line 772
    :catchall_7
    iget-object v0, v1, Ldj;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 773
    .line 774
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 775
    .line 776
    .line 777
    goto/16 :goto_11

    .line 778
    .line 779
    :cond_19
    :goto_c
    :try_start_e
    iget-object v0, v1, Ldj;->γ:Ljava/io/File;

    .line 780
    .line 781
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 782
    .line 783
    .line 784
    if-eqz v2, :cond_1a

    .line 785
    .line 786
    const-string v0, "\uff0c\u5df2\u8d85\u65f6"

    .line 787
    .line 788
    goto :goto_d

    .line 789
    :cond_1a
    const-string v0, ""

    .line 790
    .line 791
    :goto_d
    iget-object v2, v1, Ldj;->α:Landroid/content/Context;

    .line 792
    .line 793
    new-instance v3, Ljava/lang/StringBuilder;

    .line 794
    .line 795
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 796
    .line 797
    .line 798
    const-string v4, "\u672a\u6355\u83b7\u5230\u6709\u6548\u8bed\u97f3"

    .line 799
    .line 800
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    .line 805
    .line 806
    const-string v0, "\uff0c\u8bf7\u91cd\u8bd5"

    .line 807
    .line 808
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    invoke-static {v2, v0}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 816
    .line 817
    .line 818
    :try_start_f
    iget-object v0, v1, Ldj;->γ:Ljava/io/File;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 819
    .line 820
    goto :goto_b

    .line 821
    :catchall_8
    move-exception v0

    .line 822
    :try_start_10
    monitor-exit v3

    .line 823
    throw v0

    .line 824
    :catchall_9
    move-exception v0

    .line 825
    monitor-exit v3

    .line 826
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 827
    :goto_e
    :try_start_11
    iget-object v2, v1, Ldj;->β:Lcj;

    .line 828
    .line 829
    iget-object v2, v2, Lcj;->α:Ljava/lang/String;

    .line 830
    .line 831
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v3

    .line 835
    new-instance v4, Ljava/lang/StringBuilder;

    .line 836
    .line 837
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 838
    .line 839
    .line 840
    const-string v5, "PCM \u4fdd\u5b58 WAV \u5931\u8d25 vid="

    .line 841
    .line 842
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    .line 847
    .line 848
    const-string v2, " err="

    .line 849
    .line 850
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    invoke-static {v2}, Lfj;->φ(Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    iget-object v2, v1, Ldj;->α:Landroid/content/Context;

    .line 864
    .line 865
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    if-eqz v0, :cond_1b

    .line 870
    .line 871
    const/16 v3, 0x28

    .line 872
    .line 873
    invoke-static {v0, v3}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v8

    .line 877
    goto :goto_f

    .line 878
    :catchall_a
    move-exception v0

    .line 879
    goto :goto_10

    .line 880
    :cond_1b
    :goto_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 881
    .line 882
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 883
    .line 884
    .line 885
    const-string v3, "WAV \u4fdd\u5b58\u5931\u8d25: "

    .line 886
    .line 887
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    invoke-static {v2, v0}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 898
    .line 899
    .line 900
    :try_start_12
    iget-object v0, v1, Ldj;->γ:Ljava/io/File;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 901
    .line 902
    goto/16 :goto_b

    .line 903
    .line 904
    :goto_10
    :try_start_13
    iget-object v2, v1, Ldj;->γ:Ljava/io/File;

    .line 905
    .line 906
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 907
    .line 908
    .line 909
    :catchall_b
    iget-object v1, v1, Ldj;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 910
    .line 911
    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 912
    .line 913
    .line 914
    throw v0

    .line 915
    :cond_1c
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v3

    .line 919
    if-eq v3, v1, :cond_13

    .line 920
    .line 921
    :goto_11
    return-void

    .line 922
    :catchall_c
    move-exception v0

    .line 923
    monitor-exit v4

    .line 924
    throw v0

    .line 925
    :pswitch_16
    const-wide/16 v16, 0x0

    .line 926
    .line 927
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 928
    .line 929
    check-cast v0, Landroid/widget/ProgressBar;

    .line 930
    .line 931
    :try_start_14
    sget-object v1, Lkh;->α:Lkh;

    .line 932
    .line 933
    invoke-static {}, Lkh;->η()Lih;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    if-nez v1, :cond_1d

    .line 938
    .line 939
    goto :goto_13

    .line 940
    :cond_1d
    iget-wide v2, v1, Lih;->α:J

    .line 941
    .line 942
    iget-wide v4, v1, Lih;->β:J

    .line 943
    .line 944
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    .line 945
    .line 946
    .line 947
    move-result v1

    .line 948
    cmp-long v6, v2, v16

    .line 949
    .line 950
    if-ltz v6, :cond_20

    .line 951
    .line 952
    cmp-long v6, v4, v16

    .line 953
    .line 954
    if-lez v6, :cond_20

    .line 955
    .line 956
    if-gtz v1, :cond_1e

    .line 957
    .line 958
    goto :goto_12

    .line 959
    :cond_1e
    cmp-long v6, v2, v4

    .line 960
    .line 961
    if-lez v6, :cond_1f

    .line 962
    .line 963
    move-wide v2, v4

    .line 964
    :cond_1f
    long-to-double v2, v2

    .line 965
    long-to-double v4, v4

    .line 966
    div-double/2addr v2, v4

    .line 967
    int-to-double v4, v1

    .line 968
    mul-double/2addr v2, v4

    .line 969
    invoke-static {v2, v3}, Ljx0;->б(D)I

    .line 970
    .line 971
    .line 972
    move-result v2

    .line 973
    invoke-static {v2, v9, v1}, Lj81;->μ(III)I

    .line 974
    .line 975
    .line 976
    move-result v1

    .line 977
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 978
    .line 979
    .line 980
    move-result-object v8

    .line 981
    :cond_20
    :goto_12
    if-eqz v8, :cond_22

    .line 982
    .line 983
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 984
    .line 985
    .line 986
    move-result v1

    .line 987
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 988
    .line 989
    .line 990
    move-result v2

    .line 991
    if-eq v2, v1, :cond_21

    .line 992
    .line 993
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 994
    .line 995
    .line 996
    :cond_21
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 997
    .line 998
    .line 999
    :cond_22
    :goto_13
    sget-object v0, Ls62;->α:Ls62;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    .line 1000
    .line 1001
    goto :goto_14

    .line 1002
    :catchall_d
    move-exception v0

    .line 1003
    new-instance v1, Leo1;

    .line 1004
    .line 1005
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1006
    .line 1007
    .line 1008
    move-object v0, v1

    .line 1009
    :goto_14
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    if-eqz v0, :cond_23

    .line 1014
    .line 1015
    const-string v1, "r2a13f9ab3a7ddc68"

    .line 1016
    .line 1017
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    const-string v2, "rcf05132dbd725a9c"

    .line 1022
    .line 1023
    invoke-static {v2, v0, v1}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1024
    .line 1025
    .line 1026
    :cond_23
    return-void

    .line 1027
    :pswitch_17
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 1028
    .line 1029
    move-object v1, v0

    .line 1030
    check-cast v1, Llh;

    .line 1031
    .line 1032
    sput-object v8, Lug;->Φ:Lν;

    .line 1033
    .line 1034
    sget-object v0, Lkh;->α:Lkh;

    .line 1035
    .line 1036
    sget-object v0, Lkh;->η:Lhh;

    .line 1037
    .line 1038
    if-nez v0, :cond_24

    .line 1039
    .line 1040
    :goto_15
    move-object v0, v8

    .line 1041
    goto :goto_18

    .line 1042
    :cond_24
    iget-object v2, v0, Lhh;->α:Ljava/lang/ref/WeakReference;

    .line 1043
    .line 1044
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    if-nez v2, :cond_25

    .line 1049
    .line 1050
    goto :goto_15

    .line 1051
    :cond_25
    :try_start_15
    iget-object v0, v0, Lhh;->β:Ljava/lang/reflect/Method;

    .line 1052
    .line 1053
    invoke-virtual {v0, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 1058
    .line 1059
    if-eqz v2, :cond_26

    .line 1060
    .line 1061
    check-cast v0, Ljava/lang/Boolean;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_e

    .line 1062
    .line 1063
    goto :goto_17

    .line 1064
    :catchall_e
    move-exception v0

    .line 1065
    goto :goto_16

    .line 1066
    :cond_26
    move-object v0, v8

    .line 1067
    goto :goto_17

    .line 1068
    :goto_16
    new-instance v2, Leo1;

    .line 1069
    .line 1070
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1071
    .line 1072
    .line 1073
    move-object v0, v2

    .line 1074
    :goto_17
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v2

    .line 1078
    if-eqz v2, :cond_27

    .line 1079
    .line 1080
    const-string v3, "rc90e47ff78acb49f"

    .line 1081
    .line 1082
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v2

    .line 1086
    const-string v4, "r9a935a8fa433c578"

    .line 1087
    .line 1088
    invoke-static {v4, v2, v3}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    :cond_27
    instance-of v2, v0, Leo1;

    .line 1092
    .line 1093
    if-eqz v2, :cond_28

    .line 1094
    .line 1095
    move-object v0, v8

    .line 1096
    :cond_28
    check-cast v0, Ljava/lang/Boolean;

    .line 1097
    .line 1098
    :goto_18
    sget-object v2, Lpq;->α:Lpq;

    .line 1099
    .line 1100
    invoke-static {}, Lpq;->β()Lkq;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v2

    .line 1104
    if-eqz v2, :cond_29

    .line 1105
    .line 1106
    iget-object v2, v2, Lkq;->δ:Lmq;

    .line 1107
    .line 1108
    iget-wide v2, v2, Lmq;->δ:J

    .line 1109
    .line 1110
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v2

    .line 1114
    goto :goto_19

    .line 1115
    :cond_29
    move-object v2, v8

    .line 1116
    :goto_19
    sget-object v3, Lug;->λ:Lrf;

    .line 1117
    .line 1118
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1122
    .line 1123
    .line 1124
    iget-object v4, v3, Lrf;->γ:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v4, Llh;

    .line 1127
    .line 1128
    invoke-static {v4, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1129
    .line 1130
    .line 1131
    move-result v4

    .line 1132
    if-nez v4, :cond_2a

    .line 1133
    .line 1134
    goto :goto_1a

    .line 1135
    :cond_2a
    iput-object v8, v3, Lrf;->γ:Ljava/lang/Object;

    .line 1136
    .line 1137
    iget-object v3, v1, Llh;->γ:Ljava/lang/Long;

    .line 1138
    .line 1139
    if-eqz v3, :cond_2b

    .line 1140
    .line 1141
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1142
    .line 1143
    .line 1144
    move-result v3

    .line 1145
    if-nez v3, :cond_2b

    .line 1146
    .line 1147
    goto :goto_1a

    .line 1148
    :cond_2b
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1149
    .line 1150
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1151
    .line 1152
    .line 1153
    move-result v3

    .line 1154
    xor-int/lit8 v9, v3, 0x1

    .line 1155
    .line 1156
    :goto_1a
    const-string v3, "rf9ef3362bd85f5b5"

    .line 1157
    .line 1158
    iget-wide v4, v1, Llh;->α:J

    .line 1159
    .line 1160
    iget-object v6, v1, Llh;->γ:Ljava/lang/Long;

    .line 1161
    .line 1162
    iget-boolean v8, v1, Llh;->δ:Z

    .line 1163
    .line 1164
    iget-object v10, v1, Llh;->β:Ljava/lang/String;

    .line 1165
    .line 1166
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1167
    .line 1168
    const-string v12, "r80aa871f451526f5"

    .line 1169
    .line 1170
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v11, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v0

    .line 1198
    invoke-static {v3, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1199
    .line 1200
    .line 1201
    if-eqz v9, :cond_2c

    .line 1202
    .line 1203
    iget-object v0, v1, Llh;->β:Ljava/lang/String;

    .line 1204
    .line 1205
    const-string v2, "confirmed pause: "

    .line 1206
    .line 1207
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v0

    .line 1211
    iget-boolean v1, v1, Llh;->δ:Z

    .line 1212
    .line 1213
    const/4 v2, 0x4

    .line 1214
    invoke-static {v7, v0, v1, v2}, Ltg;->ι(ZLjava/lang/String;ZI)V

    .line 1215
    .line 1216
    .line 1217
    :cond_2c
    return-void

    .line 1218
    :pswitch_18
    sget-object v1, Lr7;->η:Lr7;

    .line 1219
    .line 1220
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 1221
    .line 1222
    move-object v2, v0

    .line 1223
    check-cast v2, Lp7;

    .line 1224
    .line 1225
    sget-object v0, Lt7;->ε:Lp7;

    .line 1226
    .line 1227
    if-ne v0, v2, :cond_37

    .line 1228
    .line 1229
    iget-object v0, v2, Lp7;->ζ:Lν;

    .line 1230
    .line 1231
    if-nez v0, :cond_2d

    .line 1232
    .line 1233
    goto/16 :goto_1f

    .line 1234
    .line 1235
    :cond_2d
    iput-object v8, v2, Lp7;->ζ:Lν;

    .line 1236
    .line 1237
    sget-boolean v0, Lt7;->ζ:Z

    .line 1238
    .line 1239
    if-eqz v0, :cond_37

    .line 1240
    .line 1241
    sget-boolean v0, Lt7;->η:Z

    .line 1242
    .line 1243
    if-nez v0, :cond_37

    .line 1244
    .line 1245
    iget-boolean v0, v2, Lp7;->η:Z

    .line 1246
    .line 1247
    if-nez v0, :cond_37

    .line 1248
    .line 1249
    iget-boolean v0, v2, Lp7;->θ:Z

    .line 1250
    .line 1251
    if-eqz v0, :cond_2e

    .line 1252
    .line 1253
    goto/16 :goto_1f

    .line 1254
    .line 1255
    :cond_2e
    sget-object v0, Lpq;->α:Lpq;

    .line 1256
    .line 1257
    invoke-static {}, Lpq;->α()Lmq;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v0

    .line 1261
    if-eqz v0, :cond_37

    .line 1262
    .line 1263
    iget-wide v3, v0, Lmq;->δ:J

    .line 1264
    .line 1265
    iget-wide v10, v2, Lp7;->α:J

    .line 1266
    .line 1267
    cmp-long v0, v3, v10

    .line 1268
    .line 1269
    if-nez v0, :cond_37

    .line 1270
    .line 1271
    iget-object v0, v2, Lp7;->δ:Lm7;

    .line 1272
    .line 1273
    if-nez v0, :cond_2f

    .line 1274
    .line 1275
    goto :goto_1f

    .line 1276
    :cond_2f
    const-string v3, "auto_scroll_next_enabled"

    .line 1277
    .line 1278
    invoke-static {v3, v9}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1279
    .line 1280
    .line 1281
    move-result v3

    .line 1282
    if-eqz v3, :cond_37

    .line 1283
    .line 1284
    invoke-static {v0}, Lt7;->γ(Lm7;)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v3

    .line 1288
    if-nez v3, :cond_30

    .line 1289
    .line 1290
    goto :goto_1f

    .line 1291
    :cond_30
    new-instance v3, Lq7;

    .line 1292
    .line 1293
    iget-wide v4, v2, Lp7;->α:J

    .line 1294
    .line 1295
    iget-object v8, v2, Lp7;->β:Ljava/lang/String;

    .line 1296
    .line 1297
    invoke-direct {v3, v4, v5, v8, v0}, Lq7;-><init>(JLjava/lang/String;Lm7;)V

    .line 1298
    .line 1299
    .line 1300
    :try_start_16
    sget-object v0, Lt7;->δ:Lny0;

    .line 1301
    .line 1302
    if-eqz v0, :cond_31

    .line 1303
    .line 1304
    invoke-virtual {v0, v3}, Lny0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v0

    .line 1308
    check-cast v0, Lr7;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_f

    .line 1309
    .line 1310
    goto :goto_1c

    .line 1311
    :catchall_f
    move-exception v0

    .line 1312
    goto :goto_1b

    .line 1313
    :cond_31
    move-object v0, v1

    .line 1314
    goto :goto_1c

    .line 1315
    :goto_1b
    new-instance v3, Leo1;

    .line 1316
    .line 1317
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1318
    .line 1319
    .line 1320
    move-object v0, v3

    .line 1321
    :goto_1c
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v3

    .line 1325
    if-eqz v3, :cond_32

    .line 1326
    .line 1327
    const-string v4, "rca2353f6f44ad78b"

    .line 1328
    .line 1329
    const-string v5, "\u975e\u89c6\u9891\u81ea\u52a8\u4e0b\u6ed1\u56de\u8c03\u5931\u8d25"

    .line 1330
    .line 1331
    invoke-static {v4, v5, v3}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1332
    .line 1333
    .line 1334
    :cond_32
    instance-of v3, v0, Leo1;

    .line 1335
    .line 1336
    if-eqz v3, :cond_33

    .line 1337
    .line 1338
    goto :goto_1d

    .line 1339
    :cond_33
    move-object v1, v0

    .line 1340
    :goto_1d
    check-cast v1, Lr7;

    .line 1341
    .line 1342
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1343
    .line 1344
    .line 1345
    move-result v0

    .line 1346
    if-eqz v0, :cond_36

    .line 1347
    .line 1348
    if-eq v0, v7, :cond_35

    .line 1349
    .line 1350
    if-ne v0, v6, :cond_34

    .line 1351
    .line 1352
    goto :goto_1e

    .line 1353
    :cond_34
    invoke-static {}, Lγ;->κ()V

    .line 1354
    .line 1355
    .line 1356
    goto :goto_1f

    .line 1357
    :cond_35
    iput-boolean v7, v2, Lp7;->η:Z

    .line 1358
    .line 1359
    goto :goto_1f

    .line 1360
    :cond_36
    :goto_1e
    iput-boolean v7, v2, Lp7;->θ:Z

    .line 1361
    .line 1362
    :cond_37
    :goto_1f
    return-void

    .line 1363
    :pswitch_19
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 1364
    .line 1365
    check-cast v0, Lz1;

    .line 1366
    .line 1367
    invoke-virtual {v0}, Lz1;->ζ()Z

    .line 1368
    .line 1369
    .line 1370
    move-result v1

    .line 1371
    iget-object v2, v0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1372
    .line 1373
    if-nez v1, :cond_38

    .line 1374
    .line 1375
    goto/16 :goto_23

    .line 1376
    .line 1377
    :cond_38
    const-string v1, "ContentCapture:changeChecker"

    .line 1378
    .line 1379
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1380
    .line 1381
    .line 1382
    :try_start_17
    invoke-virtual {v2, v7}, Landroidx/compose/ui/platform/AndroidComposeView;->υ(Z)V

    .line 1383
    .line 1384
    .line 1385
    iget-object v1, v0, Lz1;->ο:Ln11;

    .line 1386
    .line 1387
    iget-object v3, v1, Lsm0;->β:[I

    .line 1388
    .line 1389
    iget-object v1, v1, Lsm0;->α:[J

    .line 1390
    .line 1391
    array-length v5, v1

    .line 1392
    sub-int/2addr v5, v6

    .line 1393
    if-ltz v5, :cond_3c

    .line 1394
    .line 1395
    move v6, v9

    .line 1396
    :goto_20
    aget-wide v7, v1, v6

    .line 1397
    .line 1398
    not-long v10, v7

    .line 1399
    shl-long/2addr v10, v4

    .line 1400
    and-long/2addr v10, v7

    .line 1401
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    and-long/2addr v10, v12

    .line 1407
    cmp-long v10, v10, v12

    .line 1408
    .line 1409
    if-eqz v10, :cond_3b

    .line 1410
    .line 1411
    sub-int v10, v6, v5

    .line 1412
    .line 1413
    not-int v10, v10

    .line 1414
    ushr-int/lit8 v10, v10, 0x1f

    .line 1415
    .line 1416
    const/16 v11, 0x8

    .line 1417
    .line 1418
    rsub-int/lit8 v10, v10, 0x8

    .line 1419
    .line 1420
    move v12, v9

    .line 1421
    :goto_21
    if-ge v12, v10, :cond_3a

    .line 1422
    .line 1423
    const-wide/16 v13, 0xff

    .line 1424
    .line 1425
    and-long/2addr v13, v7

    .line 1426
    const-wide/16 v15, 0x80

    .line 1427
    .line 1428
    cmp-long v13, v13, v15

    .line 1429
    .line 1430
    if-gez v13, :cond_39

    .line 1431
    .line 1432
    shl-int/lit8 v13, v6, 0x3

    .line 1433
    .line 1434
    add-int/2addr v13, v12

    .line 1435
    aget v15, v3, v13

    .line 1436
    .line 1437
    invoke-virtual {v0}, Lz1;->ε()Lsm0;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v13

    .line 1441
    invoke-virtual {v13, v15}, Lsm0;->α(I)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v13

    .line 1445
    if-nez v13, :cond_39

    .line 1446
    .line 1447
    iget-object v13, v0, Lz1;->θ:Ljava/util/ArrayList;

    .line 1448
    .line 1449
    new-instance v14, Lbp;

    .line 1450
    .line 1451
    move/from16 p0, v5

    .line 1452
    .line 1453
    iget-wide v4, v0, Lz1;->ξ:J

    .line 1454
    .line 1455
    sget-object v18, Lcp;->ζ:Lcp;

    .line 1456
    .line 1457
    const/16 v19, 0x0

    .line 1458
    .line 1459
    move-wide/from16 v16, v4

    .line 1460
    .line 1461
    invoke-direct/range {v14 .. v19}, Lbp;-><init>(IJLcp;Ly21;)V

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1465
    .line 1466
    .line 1467
    iget-object v4, v0, Lz1;->μ:Lwc;

    .line 1468
    .line 1469
    sget-object v5, Ls62;->α:Ls62;

    .line 1470
    .line 1471
    invoke-interface {v4, v5}, Lqs1;->μ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1472
    .line 1473
    .line 1474
    goto :goto_22

    .line 1475
    :cond_39
    move/from16 p0, v5

    .line 1476
    .line 1477
    :goto_22
    shr-long/2addr v7, v11

    .line 1478
    add-int/lit8 v12, v12, 0x1

    .line 1479
    .line 1480
    const/4 v4, 0x7

    .line 1481
    move/from16 v5, p0

    .line 1482
    .line 1483
    goto :goto_21

    .line 1484
    :cond_3a
    move/from16 p0, v5

    .line 1485
    .line 1486
    if-ne v10, v11, :cond_3c

    .line 1487
    .line 1488
    move/from16 v5, p0

    .line 1489
    .line 1490
    :cond_3b
    if-eq v6, v5, :cond_3c

    .line 1491
    .line 1492
    add-int/lit8 v6, v6, 0x1

    .line 1493
    .line 1494
    const/4 v4, 0x7

    .line 1495
    goto :goto_20

    .line 1496
    :cond_3c
    const-string v1, "ContentCapture:sendAppearEvents"

    .line 1497
    .line 1498
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_11

    .line 1499
    .line 1500
    .line 1501
    :try_start_18
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v1

    .line 1505
    invoke-virtual {v1}, Les1;->α()Lbs1;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v1

    .line 1509
    iget-object v2, v0, Lz1;->π:Lcs1;

    .line 1510
    .line 1511
    invoke-virtual {v0, v1, v2}, Lz1;->λ(Lbs1;Lcs1;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_10

    .line 1512
    .line 1513
    .line 1514
    :try_start_19
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1515
    .line 1516
    .line 1517
    invoke-virtual {v0}, Lz1;->ε()Lsm0;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    invoke-virtual {v0, v1}, Lz1;->β(Lsm0;)V

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v0}, Lz1;->ξ()V

    .line 1525
    .line 1526
    .line 1527
    iput-boolean v9, v0, Lz1;->ρ:Z
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_11

    .line 1528
    .line 1529
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1530
    .line 1531
    .line 1532
    :goto_23
    return-void

    .line 1533
    :catchall_10
    move-exception v0

    .line 1534
    :try_start_1a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1535
    .line 1536
    .line 1537
    throw v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_11

    .line 1538
    :catchall_11
    move-exception v0

    .line 1539
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1540
    .line 1541
    .line 1542
    throw v0

    .line 1543
    :pswitch_1a
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 1544
    .line 1545
    check-cast v0, Ll1;

    .line 1546
    .line 1547
    const-string v1, "measureAndLayout"

    .line 1548
    .line 1549
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1550
    .line 1551
    .line 1552
    :try_start_1b
    iget-object v1, v0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1553
    .line 1554
    invoke-virtual {v1, v7}, Landroidx/compose/ui/platform/AndroidComposeView;->υ(Z)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_13

    .line 1555
    .line 1556
    .line 1557
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1558
    .line 1559
    .line 1560
    const-string v1, "checkForSemanticsChanges"

    .line 1561
    .line 1562
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1563
    .line 1564
    .line 1565
    :try_start_1c
    invoke-virtual {v0}, Ll1;->ν()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_12

    .line 1566
    .line 1567
    .line 1568
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1569
    .line 1570
    .line 1571
    iput-boolean v9, v0, Ll1;->Μ:Z

    .line 1572
    .line 1573
    return-void

    .line 1574
    :catchall_12
    move-exception v0

    .line 1575
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1576
    .line 1577
    .line 1578
    throw v0

    .line 1579
    :catchall_13
    move-exception v0

    .line 1580
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1581
    .line 1582
    .line 1583
    throw v0

    .line 1584
    :pswitch_1b
    iget-object v0, v0, Lν;->ζ:Ljava/lang/Object;

    .line 1585
    .line 1586
    check-cast v0, Landroidx/compose/ui/platform/AbstractComposeView;

    .line 1587
    .line 1588
    sget v1, Landroidx/compose/ui/platform/AbstractComposeView;->ξ:I

    .line 1589
    .line 1590
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AbstractComposeView;->β()V

    .line 1591
    .line 1592
    .line 1593
    return-void

    .line 1594
    nop

    .line 1595
    :pswitch_data_0
    .packed-switch 0x0
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
