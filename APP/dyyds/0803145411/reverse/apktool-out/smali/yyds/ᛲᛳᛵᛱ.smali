.class public final synthetic Lyyds/ᛲᛳᛵᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛲᛳᛵᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final ᛲᲈᲁ()V
    .locals 4

    .line 1
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᛸᲇᲇᲈ;

    .line 4
    .line 5
    const-string v0, "fetchFonts result is not OK. ("

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛲᲇᲁᛳ;

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
    invoke-virtual {p0}, Lyyds/ᛸᲇᲇᲈ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛶᛷᲈ;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget v2, v1, Lyyds/ᲈᛶᛷᲈ;->ᲇᲇᲇᛱ:I

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-ne v2, v3, :cond_1

    .line 28
    .line 29
    iget-object v3, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

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
    iget-object v0, p0, Lyyds/ᛸᲇᲇᲈ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 47
    .line 48
    filled-new-array {v1}, [Lyyds/ᲈᛶᛷᲈ;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-static {v0, v2, v3}, Lyyds/ᛵᛲᲁᛲ;->ᛲᲈᲁ(Landroid/content/Context;[Lyyds/ᲈᛶᛷᲈ;I)Landroid/graphics/Typeface;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v2, p0, Lyyds/ᛸᲇᲇᲈ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 58
    .line 59
    iget-object v1, v1, Lyyds/ᲈᛶᛷᲈ;->ᛲᲈᲁ:Landroid/net/Uri;

    .line 60
    .line 61
    invoke-static {v2, v1}, Lyyds/ᲀᲀᛸᛱ;->ᛷᛲᲈᛱ(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 62
    .line 63
    .line 64
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    :try_start_5
    const-string v2, "EmojiCompat.MetadataRepo.create"

    .line 70
    .line 71
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v2, Lyyds/ᛲᛲᲇᲈ;

    .line 75
    .line 76
    invoke-static {v1}, Lyyds/ᲇᛲᲁᛱ;->ᛳᲁᲁᲇ(Ljava/nio/MappedByteBuffer;)Lyyds/ᲁᲀᛳᛶ;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v2, v0, v1}, Lyyds/ᛲᛲᲇᲈ;-><init>(Landroid/graphics/Typeface;Lyyds/ᲁᲀᛳᛶ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 81
    .line 82
    .line 83
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 84
    .line 85
    .line 86
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 90
    .line 91
    monitor-enter v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 92
    :try_start_8
    iget-object v1, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛲᲇᲁᛳ;

    .line 93
    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Lyyds/ᛲᲇᲁᛳ;->ᛲᛳᛶᲁ(Lyyds/ᛲᛲᲇᲈ;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :catchall_3
    move-exception v1

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    :goto_1
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 103
    :try_start_9
    invoke-virtual {p0}, Lyyds/ᛸᲇᲇᲈ;->ᛵᛸᛸᛷ()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :goto_2
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 108
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 109
    :catchall_4
    move-exception v0

    .line 110
    :try_start_c
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 111
    .line 112
    .line 113
    throw v0

    .line 114
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 115
    .line 116
    const-string v1, "Unable to open file."

    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 122
    :catchall_5
    move-exception v0

    .line 123
    :try_start_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 124
    .line 125
    .line 126
    throw v0

    .line 127
    :cond_4
    new-instance v1, Ljava/lang/RuntimeException;

    .line 128
    .line 129
    new-instance v3, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v0, ")"

    .line 138
    .line 139
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 150
    :goto_3
    iget-object v2, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 151
    .line 152
    monitor-enter v2

    .line 153
    :try_start_e
    iget-object v1, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛲᲇᲁᛳ;

    .line 154
    .line 155
    if-eqz v1, :cond_5

    .line 156
    .line 157
    invoke-virtual {v1, v0}, Lyyds/ᛲᲇᲁᛳ;->ᛱᲈᲁ(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :catchall_6
    move-exception p0

    .line 162
    goto :goto_5

    .line 163
    :cond_5
    :goto_4
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 164
    invoke-virtual {p0}, Lyyds/ᛸᲇᲇᲈ;->ᛵᛸᛸᛷ()V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :goto_5
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 169
    throw p0

    .line 170
    :goto_6
    :try_start_10
    monitor-exit v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 171
    throw p0
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lyyds/ᛳᲀᛶᛲ;

    .line 13
    .line 14
    iget-object p0, p0, Lyyds/ᛳᲀᛶᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛸᲀᛵ;

    .line 15
    .line 16
    invoke-virtual {p0}, Lyyds/ᛴᛸᲀᛵ;->ᛲᲈᲁ()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lyyds/ᛵᲀᛷᛷ;

    .line 23
    .line 24
    iget-object v0, p0, Lyyds/ᛵᲀᛷᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲀᛳᛱ;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lyyds/ᛷᲀᛳᛱ;->ᛷᛴᛴᲁ()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iput-object v4, p0, Lyyds/ᛵᲀᛷᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲀᛳᛱ;

    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lyyds/ᛲᛳᛱᛵ;

    .line 37
    .line 38
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛷ;

    .line 39
    .line 40
    const-wide/16 v1, 0x0

    .line 41
    .line 42
    invoke-virtual {p0, v0, v1, v2}, Lyyds/ᛲᛳᛱᛵ;->ᲇᲈᛵᛷ(Lyyds/ᛳᲀᛵᛷ;J)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_2
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lyyds/ᛴᛸᛴᲁ;

    .line 49
    .line 50
    iget-object v0, p0, Lyyds/ᛴᛸᛴᲁ;->ᛱᲈᲁ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 51
    .line 52
    iget v1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲇᲈᛵᛷ:I

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    iput-boolean v3, p0, Lyyds/ᛴᛸᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 57
    .line 58
    sget-object v1, Lyyds/ᛳᛷᛵᛷ;->ON_PAUSE:Lyyds/ᛳᛷᛵᛷ;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ᛲᲈᲁ;->ᲇᲈᛵᛷ(Lyyds/ᛳᛷᛵᛷ;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget v1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲀᛲᛳᲀ:I

    .line 64
    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    iget-boolean v1, p0, Lyyds/ᛴᛸᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 68
    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    sget-object v1, Lyyds/ᛳᛷᛵᛷ;->ON_STOP:Lyyds/ᛳᛷᛵᛷ;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ᛲᲈᲁ;->ᲇᲈᛵᛷ(Lyyds/ᛳᛷᛵᛷ;)V

    .line 74
    .line 75
    .line 76
    iput-boolean v3, p0, Lyyds/ᛴᛸᛴᲁ;->ᲇᲇᲇᛱ:Z

    .line 77
    .line 78
    :cond_2
    return-void

    .line 79
    :pswitch_3
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Lyyds/ᛷᲀᲇᲈ;

    .line 82
    .line 83
    invoke-virtual {p0}, Lyyds/ᛷᲀᲇᲈ;->ᛲᲈᲁ()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_4
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Lyyds/ᛲᛴᲈᲈ;

    .line 90
    .line 91
    iget-object v0, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲈᲈᲀ;

    .line 92
    .line 93
    invoke-interface {v0}, Lyyds/ᛱᛸᲇᛵ;->isAdded()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    invoke-interface {v0}, Lyyds/ᛱᛸᲇᛵ;->isRemoving()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    invoke-interface {v0}, Lyyds/ᛱᛸᲇᛵ;->getActivity()Landroid/app/Activity;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {v1}, Lyyds/ᛴᛶᲀᛲ;->ᛷᲈᲈᲁ(Landroid/app/Activity;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_4
    iget-object v1, p0, Lyyds/ᛲᛴᲈᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛵᛱᛱ;

    .line 118
    .line 119
    iput-object v4, p0, Lyyds/ᛲᛴᲈᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛵᛱᛱ;

    .line 120
    .line 121
    if-eqz v1, :cond_5

    .line 122
    .line 123
    iget-object v2, v1, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v2, Lyyds/ᛴᛲᛷᛸ;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v1, v1, Lyyds/ᛱᛵᛱᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Lyyds/ᲁᛷᲁᛳ;

    .line 133
    .line 134
    invoke-virtual {v1}, Lyyds/ᲁᛷᲁᛳ;->run()V

    .line 135
    .line 136
    .line 137
    :cond_5
    iput-boolean v3, p0, Lyyds/ᛲᛴᲈᲈ;->ᲇᲈᛵᛷ:Z

    .line 138
    .line 139
    invoke-virtual {v0}, Lyyds/ᛷᲈᲈᲀ;->ᛲᲈᲁ()V

    .line 140
    .line 141
    .line 142
    :cond_6
    :goto_0
    return-void

    .line 143
    :pswitch_5
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, Landroid/widget/HorizontalScrollView;

    .line 146
    .line 147
    const/16 v0, 0x42

    .line 148
    .line 149
    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->fullScroll(I)Z

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :pswitch_6
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p0, Landroid/widget/LinearLayout;

    .line 156
    .line 157
    const/4 v0, 0x0

    .line 158
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 159
    .line 160
    .line 161
    const v0, 0x3f6147ae    # 0.88f

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleX(F)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleY(F)V

    .line 168
    .line 169
    .line 170
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 171
    .line 172
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 173
    .line 174
    .line 175
    const-wide v4, -0xaf1ce68a836eL

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    new-array v5, v2, [F

    .line 185
    .line 186
    fill-array-data v5, :array_0

    .line 187
    .line 188
    .line 189
    invoke-static {p0, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    const-wide v5, -0xaf22e68a836eL

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    new-array v6, v2, [F

    .line 203
    .line 204
    fill-array-data v6, :array_1

    .line 205
    .line 206
    .line 207
    invoke-static {p0, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    const-wide v6, -0xaf29e68a836eL

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    new-array v7, v2, [F

    .line 221
    .line 222
    fill-array-data v7, :array_2

    .line 223
    .line 224
    .line 225
    invoke-static {p0, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    const/4 v6, 0x3

    .line 230
    new-array v6, v6, [Landroid/animation/Animator;

    .line 231
    .line 232
    aput-object v4, v6, v1

    .line 233
    .line 234
    aput-object v5, v6, v3

    .line 235
    .line 236
    aput-object p0, v6, v2

    .line 237
    .line 238
    invoke-virtual {v0, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 239
    .line 240
    .line 241
    const-wide/16 v1, 0xb4

    .line 242
    .line 243
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 244
    .line 245
    .line 246
    new-instance p0, Landroid/view/animation/DecelerateInterpolator;

    .line 247
    .line 248
    const/high16 v1, 0x40000000    # 2.0f

    .line 249
    .line 250
    invoke-direct {p0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, p0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :pswitch_7
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast p0, Landroid/widget/ImageView;

    .line 263
    .line 264
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 265
    .line 266
    invoke-virtual {p0}, Landroid/view/View;->getRotation()F

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    const/high16 v1, 0x43b40000    # 360.0f

    .line 271
    .line 272
    rem-float/2addr v0, v1

    .line 273
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotation(F)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :pswitch_8
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast p0, Lyyds/ᲁᲀᛳ;

    .line 280
    .line 281
    invoke-virtual {p0}, Lyyds/ᲁᲀᛳ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :pswitch_9
    invoke-direct {p0}, Lyyds/ᛲᛳᛵᛱ;->ᛲᲈᲁ()V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :pswitch_a
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast p0, Lyyds/ᛵᲀᛳᛸ;

    .line 292
    .line 293
    invoke-virtual {p0}, Lyyds/ᛵᲀᛳᛸ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :pswitch_b
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast p0, Lyyds/ᲀᲁᲀᛷ;

    .line 300
    .line 301
    sget-object v0, Lyyds/ᛸᛵᲈᛷ;->ᲈᲀᛲᲀ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 302
    .line 303
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    sget-object v0, Lyyds/ᛸᛵᲈᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛸᛵᲈᛷ;

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 312
    .line 313
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 314
    .line 315
    .line 316
    sget-object v1, Lyyds/ᛸᛵᲈᛷ;->ᛳᲁᲁᲇ:Ljava/util/Map;

    .line 317
    .line 318
    const-wide v5, -0x393d5e68a836eL

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    monitor-enter v1

    .line 327
    const-wide v5, -0x393e0e68a836eL

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    :try_start_0
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    :cond_7
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    if-eqz v5, :cond_8

    .line 348
    .line 349
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    check-cast v5, Ljava/util/Map$Entry;

    .line 354
    .line 355
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    check-cast v6, Landroid/view/ViewGroup;

    .line 360
    .line 361
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    check-cast v5, Lyyds/ᲀᲁᲀᛷ;

    .line 366
    .line 367
    if-ne v5, p0, :cond_7

    .line 368
    .line 369
    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    .line 371
    .line 372
    goto :goto_1

    .line 373
    :catchall_0
    move-exception p0

    .line 374
    goto/16 :goto_7

    .line 375
    .line 376
    :cond_8
    monitor-exit v1

    .line 377
    sget-object v1, Lyyds/ᛸᛵᲈᛷ;->ᛶᛳᛶᛵ:Ljava/util/Map;

    .line 378
    .line 379
    const-wide v5, -0x393ebe68a836eL

    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    monitor-enter v1

    .line 388
    const-wide v5, -0x393f1e68a836eL

    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    :try_start_1
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    :cond_9
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-eqz v5, :cond_b

    .line 409
    .line 410
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    check-cast v5, Ljava/util/Map$Entry;

    .line 415
    .line 416
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    check-cast v6, Landroid/view/ViewGroup;

    .line 421
    .line 422
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    check-cast v5, Ljava/lang/ref/WeakReference;

    .line 427
    .line 428
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    check-cast v5, Lyyds/ᛷᲀᛶᛵ;

    .line 433
    .line 434
    if-eqz v5, :cond_a

    .line 435
    .line 436
    invoke-virtual {v5}, Lyyds/ᛷᲀᛶᛵ;->ᛲᲈᲁ()Lyyds/ᲇᲁᲁᛱ;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    if-eqz v5, :cond_a

    .line 441
    .line 442
    iget-object v5, v5, Lyyds/ᲇᲁᲁᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲁᲀᛷ;

    .line 443
    .line 444
    goto :goto_3

    .line 445
    :catchall_1
    move-exception p0

    .line 446
    goto :goto_6

    .line 447
    :cond_a
    move-object v5, v4

    .line 448
    :goto_3
    if-ne v5, p0, :cond_9

    .line 449
    .line 450
    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 451
    .line 452
    .line 453
    goto :goto_2

    .line 454
    :cond_b
    monitor-exit v1

    .line 455
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-eqz v1, :cond_d

    .line 464
    .line 465
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    check-cast v1, Landroid/view/ViewGroup;

    .line 470
    .line 471
    sget-object v2, Lyyds/ᛸᛵᲈᛷ;->ᛳᲁᲁᲇ:Ljava/util/Map;

    .line 472
    .line 473
    const-wide v4, -0x393f7e68a836eL

    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    monitor-enter v2

    .line 482
    :try_start_2
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    check-cast v4, Lyyds/ᲀᲁᲀᛷ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 487
    .line 488
    monitor-exit v2

    .line 489
    if-nez v4, :cond_c

    .line 490
    .line 491
    const-wide v4, -0x39402e68a836eL

    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    monitor-enter v2

    .line 500
    const-wide v4, -0x3940de68a836eL

    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    :try_start_3
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 509
    .line 510
    .line 511
    monitor-exit v2

    .line 512
    move-object v4, p0

    .line 513
    goto :goto_5

    .line 514
    :catchall_2
    move-exception p0

    .line 515
    monitor-exit v2

    .line 516
    throw p0

    .line 517
    :cond_c
    :goto_5
    sget-object v2, Lyyds/ᛸᛵᲈᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛸᛵᲈᛷ;

    .line 518
    .line 519
    invoke-virtual {v2, v1, v4, v3, v3}, Lyyds/ᛸᛵᲈᛷ;->ᛱᛳᛶᛳ(Landroid/view/ViewGroup;Lyyds/ᲀᲁᲀᛷ;ZZ)V

    .line 520
    .line 521
    .line 522
    goto :goto_4

    .line 523
    :catchall_3
    move-exception p0

    .line 524
    monitor-exit v2

    .line 525
    throw p0

    .line 526
    :cond_d
    return-void

    .line 527
    :goto_6
    monitor-exit v1

    .line 528
    throw p0

    .line 529
    :goto_7
    monitor-exit v1

    .line 530
    throw p0

    .line 531
    :pswitch_c
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast p0, Lyyds/ᲁᛶᲁᲀ;

    .line 534
    .line 535
    invoke-interface {p0}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    return-void

    .line 539
    :pswitch_d
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast p0, Lyyds/ᛱᛳᛵᛱ;

    .line 542
    .line 543
    iget-object v0, p0, Lyyds/ᛱᛳᛵᛱ;->ᛶᛷᛲᲁ:Lyyds/ᛴᛸᛵᲈ;

    .line 544
    .line 545
    iget-object v5, p0, Lyyds/ᛱᛳᛵᛱ;->ᲇᲇᲇᛱ:Landroid/widget/FrameLayout;

    .line 546
    .line 547
    if-nez v0, :cond_e

    .line 548
    .line 549
    goto/16 :goto_b

    .line 550
    .line 551
    :cond_e
    iget-boolean v6, p0, Lyyds/ᛱᛳᛵᛱ;->ᛷᲈᲈᲁ:Z

    .line 552
    .line 553
    if-eqz v6, :cond_f

    .line 554
    .line 555
    goto/16 :goto_b

    .line 556
    .line 557
    :cond_f
    iput-boolean v3, p0, Lyyds/ᛱᛳᛵᛱ;->ᛷᲈᲈᲁ:Z

    .line 558
    .line 559
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 560
    .line 561
    .line 562
    move-result v6

    .line 563
    if-ge v6, v3, :cond_10

    .line 564
    .line 565
    move v6, v3

    .line 566
    :cond_10
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 567
    .line 568
    .line 569
    move-result v5

    .line 570
    if-ge v5, v3, :cond_11

    .line 571
    .line 572
    move v5, v3

    .line 573
    :cond_11
    invoke-virtual {p0}, Lyyds/ᛱᛳᛵᛱ;->ᲀᛲᛳᲀ()Landroid/graphics/Rect;

    .line 574
    .line 575
    .line 576
    move-result-object v7

    .line 577
    sget-object v8, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 578
    .line 579
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    sget-object v8, Lyyds/ᛷᛳᛲᛳ;->ᲀᛳᲇᛴ:Lyyds/ᛳᲀᛲ;

    .line 583
    .line 584
    sget-object v9, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 585
    .line 586
    const/16 v10, 0x72

    .line 587
    .line 588
    aget-object v9, v9, v10

    .line 589
    .line 590
    invoke-virtual {v8, v9}, Lyyds/ᛳᲀᛲ;->ᛲᲈᲁ(Lyyds/ᲀᛴᛶᲇ;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v8

    .line 594
    check-cast v8, Ljava/lang/String;

    .line 595
    .line 596
    invoke-static {v8}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 597
    .line 598
    .line 599
    move-result-object v8

    .line 600
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v8

    .line 604
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 605
    .line 606
    .line 607
    move-result v9

    .line 608
    if-nez v9, :cond_12

    .line 609
    .line 610
    goto :goto_8

    .line 611
    :cond_12
    const-wide v9, -0xc635e68a836eL

    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v9

    .line 620
    filled-new-array {v9}, [Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v9

    .line 624
    const/4 v10, 0x6

    .line 625
    invoke-static {v8, v9, v10}, Lyyds/ᛲᲇᛸᲇ;->ᛲᲀᛲᛲ(Ljava/lang/String;[Ljava/lang/String;I)Ljava/util/List;

    .line 626
    .line 627
    .line 628
    move-result-object v8

    .line 629
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 630
    .line 631
    .line 632
    move-result v9

    .line 633
    if-eq v9, v2, :cond_13

    .line 634
    .line 635
    goto :goto_8

    .line 636
    :cond_13
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    check-cast v1, Ljava/lang/String;

    .line 641
    .line 642
    invoke-static {v1}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    invoke-static {v1}, Lyyds/ᛳᲇᲁᛳ;->ᛶᛳᛶᛵ(Ljava/lang/String;)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    if-eqz v1, :cond_14

    .line 655
    .line 656
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v3

    .line 660
    check-cast v3, Ljava/lang/String;

    .line 661
    .line 662
    invoke-static {v3}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v3

    .line 670
    invoke-static {v3}, Lyyds/ᛳᲇᲁᛳ;->ᛶᛳᛶᛵ(Ljava/lang/String;)Ljava/lang/Integer;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    if-eqz v3, :cond_14

    .line 675
    .line 676
    new-instance v4, Lkotlin/Pair;

    .line 677
    .line 678
    invoke-direct {v4, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 679
    .line 680
    .line 681
    :cond_14
    :goto_8
    if-eqz v4, :cond_15

    .line 682
    .line 683
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    check-cast v1, Ljava/lang/Number;

    .line 688
    .line 689
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 690
    .line 691
    .line 692
    move-result v1

    .line 693
    goto :goto_9

    .line 694
    :cond_15
    iget v1, v7, Landroid/graphics/Rect;->left:I

    .line 695
    .line 696
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    .line 697
    .line 698
    .line 699
    move-result v3

    .line 700
    sub-int/2addr v3, v6

    .line 701
    div-int/2addr v3, v2

    .line 702
    add-int/2addr v1, v3

    .line 703
    :goto_9
    if-eqz v4, :cond_16

    .line 704
    .line 705
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    check-cast v2, Ljava/lang/Number;

    .line 710
    .line 711
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    goto :goto_a

    .line 716
    :cond_16
    iget v3, v7, Landroid/graphics/Rect;->top:I

    .line 717
    .line 718
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    .line 719
    .line 720
    .line 721
    move-result v4

    .line 722
    sub-int/2addr v4, v5

    .line 723
    div-int/2addr v4, v2

    .line 724
    add-int v2, v4, v3

    .line 725
    .line 726
    :goto_a
    invoke-virtual {p0, v1, v2, v6, v5}, Lyyds/ᛱᛳᛵᛱ;->ᛵᛸᛸᛷ(IIII)Lkotlin/Pair;

    .line 727
    .line 728
    .line 729
    move-result-object p0

    .line 730
    invoke-virtual {p0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    check-cast v1, Ljava/lang/Number;

    .line 735
    .line 736
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 737
    .line 738
    .line 739
    move-result v1

    .line 740
    invoke-virtual {p0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object p0

    .line 744
    check-cast p0, Ljava/lang/Number;

    .line 745
    .line 746
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 747
    .line 748
    .line 749
    move-result p0

    .line 750
    invoke-virtual {v0, v1, p0}, Lyyds/ᛴᛸᛵᲈ;->ᛱᲈᲁ(II)V

    .line 751
    .line 752
    .line 753
    :goto_b
    return-void

    .line 754
    :pswitch_e
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast p0, Lyyds/ᛱᲀᛱᲁ;

    .line 757
    .line 758
    invoke-static {p0}, Lyyds/ᛱᲀᛱᲁ;->ᲇᲈᛵᛷ(Lyyds/ᛱᲀᛱᲁ;)V

    .line 759
    .line 760
    .line 761
    return-void

    .line 762
    :pswitch_f
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast p0, Ljava/util/ArrayList;

    .line 765
    .line 766
    sget-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛶᛸᲀᲁ:Ljava/lang/reflect/Method;

    .line 767
    .line 768
    if-nez v0, :cond_17

    .line 769
    .line 770
    goto/16 :goto_11

    .line 771
    .line 772
    :cond_17
    sget-object v1, Lyyds/ᛶᛵᛵᲀ;->ᛵᲀᲈᛴ:Ljava/lang/reflect/Field;

    .line 773
    .line 774
    if-nez v1, :cond_18

    .line 775
    .line 776
    goto/16 :goto_11

    .line 777
    .line 778
    :cond_18
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 779
    .line 780
    .line 781
    move-result-object p0

    .line 782
    :cond_19
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 783
    .line 784
    .line 785
    move-result v2

    .line 786
    if-eqz v2, :cond_1f

    .line 787
    .line 788
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    check-cast v2, Lkotlin/Pair;

    .line 793
    .line 794
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v3

    .line 798
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v2

    .line 802
    check-cast v2, Lyyds/ᲇᲁᲀᛵ;

    .line 803
    .line 804
    sget-object v5, Lyyds/ᛶᛵᛵᲀ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛵᲀ;

    .line 805
    .line 806
    invoke-static {v3}, Lyyds/ᛶᛵᛵᲀ;->ᛱᛳᲇ(Ljava/lang/Object;)Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 807
    .line 808
    .line 809
    move-result-object v5

    .line 810
    if-eqz v5, :cond_1a

    .line 811
    .line 812
    iget-object v5, v5, Lcom/ss/android/ugc/aweme/comment/model/Comment;->cid:Ljava/lang/String;

    .line 813
    .line 814
    invoke-static {v5}, Lyyds/ᛶᛵᛵᲀ;->ᛷᛲᲈᛱ(Ljava/lang/String;)Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v5

    .line 818
    goto :goto_d

    .line 819
    :cond_1a
    move-object v5, v4

    .line 820
    :goto_d
    iget-object v6, v2, Lyyds/ᲇᲁᲀᛵ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 821
    .line 822
    invoke-static {v5, v6}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    move-result v5

    .line 826
    if-nez v5, :cond_1b

    .line 827
    .line 828
    goto :goto_c

    .line 829
    :cond_1b
    :try_start_4
    iget v5, v2, Lyyds/ᲇᲁᲀᛵ;->ᛵᛸᛸᛷ:I

    .line 830
    .line 831
    invoke-virtual {v1, v3, v5}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 832
    .line 833
    .line 834
    iget-object v5, v2, Lyyds/ᲇᲁᲀᛵ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 835
    .line 836
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v5

    .line 840
    if-nez v5, :cond_1d

    .line 841
    .line 842
    :cond_1c
    move-object v6, v4

    .line 843
    goto :goto_e

    .line 844
    :cond_1d
    sget-object v6, Lyyds/ᛶᛵᛵᲀ;->ᛲᛲᲈᲈ:Ljava/lang/Class;

    .line 845
    .line 846
    if-eqz v6, :cond_1c

    .line 847
    .line 848
    invoke-static {v5, v6}, Lyyds/ᛶᛵᛵᲀ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v6

    .line 852
    goto :goto_e

    .line 853
    :catchall_4
    move-exception v2

    .line 854
    goto :goto_f

    .line 855
    :goto_e
    if-eqz v5, :cond_1e

    .line 856
    .line 857
    if-ne v6, v3, :cond_1e

    .line 858
    .line 859
    iget v2, v2, Lyyds/ᲇᲁᲀᛵ;->ᛵᛸᛸᛷ:I

    .line 860
    .line 861
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    invoke-virtual {v0, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    :cond_1e
    sget-object v2, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 873
    .line 874
    goto :goto_10

    .line 875
    :goto_f
    new-instance v3, Lyyds/ᲈᛵᛵᛴ;

    .line 876
    .line 877
    invoke-direct {v3, v2}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 878
    .line 879
    .line 880
    move-object v2, v3

    .line 881
    :goto_10
    invoke-static {v2}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    if-eqz v2, :cond_19

    .line 886
    .line 887
    sget-object v3, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 888
    .line 889
    const-wide v5, -0x2d3cde68a836eL

    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v5

    .line 898
    invoke-virtual {v3, v5, v2}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 899
    .line 900
    .line 901
    goto :goto_c

    .line 902
    :cond_1f
    :goto_11
    return-void

    .line 903
    :pswitch_10
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 904
    .line 905
    check-cast p0, Lyyds/ᛷᲈᛳᛲ;

    .line 906
    .line 907
    iget-object p0, p0, Lyyds/ᛷᲈᛳᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᛲᲀ;

    .line 908
    .line 909
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᛶᛷᛲᲁ()V

    .line 910
    .line 911
    .line 912
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᲇᲇᲇᛱ()V

    .line 913
    .line 914
    .line 915
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᛲᛴᛳᛲ()V

    .line 916
    .line 917
    .line 918
    return-void

    .line 919
    :pswitch_11
    iget-object p0, p0, Lyyds/ᛲᛳᛵᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 920
    .line 921
    check-cast p0, Lyyds/ᛳᛴᛲᲀ;

    .line 922
    .line 923
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᛶᛷᛲᲁ()V

    .line 924
    .line 925
    .line 926
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᲇᲇᲇᛱ()V

    .line 927
    .line 928
    .line 929
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᛲᛴᛳᛲ()V

    .line 930
    .line 931
    .line 932
    return-void

    .line 933
    :pswitch_data_0
    .packed-switch 0x0
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

    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    :array_1
    .array-data 4
        0x3f6147ae    # 0.88f
        0x3f800000    # 1.0f
    .end array-data

    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    :array_2
    .array-data 4
        0x3f6147ae    # 0.88f
        0x3f800000    # 1.0f
    .end array-data
.end method
