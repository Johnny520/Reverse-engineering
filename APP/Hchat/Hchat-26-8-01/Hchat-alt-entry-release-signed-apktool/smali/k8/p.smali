.class public final Lk8/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lk8/k;

.field public final b:Lk8/i;

.field public final c:Lk8/q;

.field public final d:Lg8/a;

.field public final e:Lg1/d;

.field public final f:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public volatile h:Z

.field public volatile i:Z


# direct methods
.method public constructor <init>(Lk8/k;Lk8/i;Lk8/q;Lg8/a;Lg1/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk8/p;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lk8/p;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    iput-object p1, p0, Lk8/p;->a:Lk8/k;

    .line 19
    .line 20
    iput-object p2, p0, Lk8/p;->b:Lk8/i;

    .line 21
    .line 22
    iput-object p3, p0, Lk8/p;->c:Lk8/q;

    .line 23
    .line 24
    iput-object p4, p0, Lk8/p;->d:Lg8/a;

    .line 25
    .line 26
    iput-object p5, p0, Lk8/p;->e:Lg1/d;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Lk8/o;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lk8/p;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lk8/n;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, p1}, Lk8/n;->a(Lk8/o;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v3, "\u6d88\u606f\u89c2\u5bdf\u56de\u8c03\u5931\u8d25: "

    .line 27
    .line 28
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v2, p0, Lk8/p;->e:Lg1/d;

    .line 43
    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    const-string v2, "[WeChatMessageObserveApi] "

    .line 47
    .line 48
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Li8/i;->f(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void
.end method

.method public final declared-synchronized b()V
    .locals 7

    .line 1
    const-string v0, "\u6d88\u606f\u89c2\u5bdf\u5df2\u5b89\u88c5: pb="

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v1, p0, Lk8/p;->a:Lk8/k;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Lk8/k;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    move v1, v3

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    if-eqz v1, :cond_3

    .line 23
    .line 24
    iget-boolean v4, p0, Lk8/p;->h:Z

    .line 25
    .line 26
    if-nez v4, :cond_3

    .line 27
    .line 28
    iget-object v4, p0, Lk8/p;->a:Lk8/k;

    .line 29
    .line 30
    new-instance v5, Lk8/l;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-direct {v5, p0, v6}, Lk8/l;-><init>(Lk8/p;I)V

    .line 34
    .line 35
    .line 36
    iget-object v4, v4, Lk8/k;->d:Lf8/c;

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    const-class v6, Lf8/g;

    .line 41
    .line 42
    invoke-virtual {v4, v6, v5}, Lf8/c;->c(Ljava/lang/Class;Lf8/d;)Lf8/b;

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object v4, p0, Lk8/p;->a:Lk8/k;

    .line 46
    .line 47
    new-instance v5, Lk8/l;

    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    invoke-direct {v5, p0, v6}, Lk8/l;-><init>(Lk8/p;I)V

    .line 51
    .line 52
    .line 53
    iget-object v4, v4, Lk8/k;->d:Lf8/c;

    .line 54
    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    const-class v6, Lf8/h;

    .line 58
    .line 59
    invoke-virtual {v4, v6, v5}, Lf8/c;->c(Ljava/lang/Class;Lf8/d;)Lf8/b;

    .line 60
    .line 61
    .line 62
    :cond_2
    iput-boolean v3, p0, Lk8/p;->h:Z

    .line 63
    .line 64
    :cond_3
    iget-object v4, p0, Lk8/p;->b:Lk8/i;

    .line 65
    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    invoke-virtual {v4}, Lk8/i;->b()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    iget-boolean v4, p0, Lk8/p;->i:Z

    .line 75
    .line 76
    if-nez v4, :cond_4

    .line 77
    .line 78
    iget-object v4, p0, Lk8/p;->b:Lk8/i;

    .line 79
    .line 80
    new-instance v5, Lk8/m;

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    invoke-direct {v5, p0, v6}, Lk8/m;-><init>(Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v5}, Lk8/i;->e(Lk8/h;)La2/a;

    .line 87
    .line 88
    .line 89
    iput-boolean v3, p0, Lk8/p;->i:Z

    .line 90
    .line 91
    :cond_4
    new-instance v4, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, " dbOutgoing="

    .line 100
    .line 101
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lk8/p;->b:Lk8/i;

    .line 105
    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    invoke-virtual {v0}, Lk8/i;->b()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    move v2, v3

    .line 115
    :cond_5
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v1, p0, Lk8/p;->e:Lg1/d;

    .line 123
    .line 124
    if-eqz v1, :cond_6

    .line 125
    .line 126
    const-string v1, "[WeChatMessageObserveApi] "

    .line 127
    .line 128
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    .line 134
    .line 135
    :cond_6
    monitor-exit p0

    .line 136
    return-void

    .line 137
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    throw v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/p;->a:Lk8/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lk8/k;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lk8/p;->b:Lk8/i;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Lk8/i;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_2
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final d(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRedPacket()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_14

    .line 10
    .line 11
    iget-object v0, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lk8/p;->c:Lk8/q;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, Lk8/q;->a(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const-string p1, "transfer"

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    const-string p1, "quote"

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_3
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isPat()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    const-string p1, "pat"

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_4
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isNote()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    const-string p1, "note"

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_5
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isFile()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_6

    .line 66
    .line 67
    const-string p1, "file"

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_6
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isLink()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_7

    .line 75
    .line 76
    const-string p1, "link"

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_7
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isMusic()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_8

    .line 84
    .line 85
    const-string p1, "music"

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_8
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideoNumberVideo()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_9

    .line 93
    .line 94
    const-string p1, "video_number_video"

    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_9
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isShareCard()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_a

    .line 102
    .line 103
    const-string p1, "share_card"

    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_a
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoip()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_b

    .line 111
    .line 112
    const-string p1, "voip"

    .line 113
    .line 114
    return-object p1

    .line 115
    :cond_b
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRecalled()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_c

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_c
    iget v0, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 123
    .line 124
    const/4 v1, 0x1

    .line 125
    if-eq v0, v1, :cond_13

    .line 126
    .line 127
    const/4 v1, 0x3

    .line 128
    if-eq v0, v1, :cond_12

    .line 129
    .line 130
    const/16 v1, 0x22

    .line 131
    .line 132
    if-eq v0, v1, :cond_11

    .line 133
    .line 134
    const/16 v1, 0x2b

    .line 135
    .line 136
    if-eq v0, v1, :cond_10

    .line 137
    .line 138
    const/16 v1, 0x2710

    .line 139
    .line 140
    if-eq v0, v1, :cond_f

    .line 141
    .line 142
    const/16 v1, 0x2712

    .line 143
    .line 144
    if-eq v0, v1, :cond_e

    .line 145
    .line 146
    packed-switch v0, :pswitch_data_0

    .line 147
    .line 148
    .line 149
    if-lez v0, :cond_d

    .line 150
    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v1, "type_"

    .line 154
    .line 155
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget p1, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 159
    .line 160
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1

    .line 168
    :cond_d
    :goto_0
    const-string p1, "unknown"

    .line 169
    .line 170
    return-object p1

    .line 171
    :pswitch_0
    const-string p1, "app"

    .line 172
    .line 173
    return-object p1

    .line 174
    :pswitch_1
    const-string p1, "location"

    .line 175
    .line 176
    return-object p1

    .line 177
    :pswitch_2
    const-string p1, "emoji"

    .line 178
    .line 179
    return-object p1

    .line 180
    :cond_e
    :goto_1
    const-string p1, "recalled"

    .line 181
    .line 182
    return-object p1

    .line 183
    :cond_f
    const-string p1, "system"

    .line 184
    .line 185
    return-object p1

    .line 186
    :cond_10
    const-string p1, "video"

    .line 187
    .line 188
    return-object p1

    .line 189
    :cond_11
    const-string p1, "voice"

    .line 190
    .line 191
    return-object p1

    .line 192
    :cond_12
    const-string p1, "image"

    .line 193
    .line 194
    return-object p1

    .line 195
    :cond_13
    const-string p1, "text"

    .line 196
    .line 197
    return-object p1

    .line 198
    :cond_14
    :goto_2
    const-string p1, "red_packet"

    .line 199
    .line 200
    return-object p1

    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Lk8/n;)La2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/p;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    new-instance p1, La2/a;

    .line 7
    .line 8
    const/16 v0, 0x17

    .line 9
    .line 10
    invoke-direct {p1, v0}, La2/a;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-object p1
.end method
