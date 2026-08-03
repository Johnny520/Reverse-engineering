.class public final synthetic Lb9/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb9/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lha/b0;

    .line 4
    .line 5
    if-eqz p2, :cond_4

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const v1, -0x4d6ada7d

    .line 12
    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const-string v0, "enable"

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    iget-object p2, p1, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 27
    .line 28
    const-string v0, "enable"

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    iget-boolean v0, p1, Lha/b0;->i:Z

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p1, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    monitor-enter v0

    .line 44
    :try_start_0
    iget-object v1, p1, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    monitor-exit v0

    .line 50
    iget-object v0, p1, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 51
    .line 52
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "enabled_at_seconds"

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    const-wide/16 v4, 0x3e8

    .line 63
    .line 64
    div-long/2addr v2, v4

    .line 65
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "notified_ids"

    .line 70
    .line 71
    const-string v2, "[]"

    .line 72
    .line 73
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    monitor-exit v0

    .line 83
    throw p1

    .line 84
    :cond_2
    if-nez p2, :cond_3

    .line 85
    .line 86
    iget-object v0, p1, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 87
    .line 88
    monitor-enter v0

    .line 89
    :try_start_1
    iget-object v1, p1, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    monitor-exit v0

    .line 95
    iget-object v0, p1, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 96
    .line 97
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-string v1, "enabled_at_seconds"

    .line 102
    .line 103
    const-wide/16 v2, 0x0

    .line 104
    .line 105
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v1, "notified_ids"

    .line 110
    .line 111
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :catchall_1
    move-exception p1

    .line 120
    monitor-exit v0

    .line 121
    throw p1

    .line 122
    :cond_3
    :goto_0
    iput-boolean p2, p1, Lha/b0;->i:Z

    .line 123
    .line 124
    :cond_4
    :goto_1
    return-void
.end method

.method private final b(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lu9/h;

    .line 4
    .line 5
    if-eqz p2, :cond_3

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const v1, 0x2a2eb947

    .line 12
    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const-string v0, "hide_wechat_bottom_bar_enable"

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    iget-object p2, p1, Lu9/h;->e:Landroid/content/SharedPreferences;

    .line 27
    .line 28
    const-string v0, "hide_wechat_bottom_bar_enable"

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iget-object v0, p1, Lu9/h;->g:Ljava/util/Map;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    monitor-enter v0

    .line 41
    :try_start_0
    iget-object v1, p1, Lu9/h;->g:Ljava/util/Map;

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/lang/Iterable;

    .line 48
    .line 49
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    monitor-exit v0

    .line 54
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance v2, Lu9/f;

    .line 74
    .line 75
    invoke-direct {v2, p1, v1, p2}, Lu9/f;-><init>(Lu9/h;Landroid/view/View;Z)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_2

    .line 91
    .line 92
    invoke-virtual {v2}, Lu9/f;->invoke()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    new-instance v3, La1/a;

    .line 97
    .line 98
    const/16 v4, 0x1c

    .line 99
    .line 100
    invoke-direct {v3, v2, v4}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    monitor-exit v0

    .line 109
    throw p1

    .line 110
    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 7

    .line 1
    iget v0, p0, Lb9/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lxa/m;

    .line 9
    .line 10
    const-string v0, "quick_contact_edit_enable"

    .line 11
    .line 12
    invoke-static {p2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lxa/m;->b()Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    iget-object p2, p1, Lxa/m;->d:Landroid/os/Handler;

    .line 25
    .line 26
    new-instance v0, Lwb/cr;

    .line 27
    .line 28
    const/4 v1, 0x5

    .line 29
    invoke-direct {v0, p1, v1}, Lwb/cr;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lb9/b;->b(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    iget-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lob/n;

    .line 43
    .line 44
    const-string v0, "text_voice_send_enable"

    .line 45
    .line 46
    invoke-static {p2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    invoke-virtual {p1}, Lob/n;->i()Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-nez p2, :cond_1

    .line 57
    .line 58
    iget-object p1, p1, Lob/n;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void

    .line 64
    :pswitch_2
    const-string p1, "text_speech_enable"

    .line 65
    .line 66
    iget-object v0, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lnb/w;

    .line 69
    .line 70
    iget-object v1, v0, Lnb/w;->b:Landroid/os/Handler;

    .line 71
    .line 72
    const-string v2, "text_speech_play_voice_messages"

    .line 73
    .line 74
    if-eqz p2, :cond_6

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    sparse-switch v3, :sswitch_data_0

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :sswitch_0
    const-string p1, "text_speech_tts_voice"

    .line 85
    .line 86
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :sswitch_1
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_2

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    invoke-virtual {v0}, Lnb/w;->y()Lnb/z;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1, v2}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-nez p1, :cond_6

    .line 109
    .line 110
    new-instance p1, Lnb/e;

    .line 111
    .line 112
    const/4 p2, 0x5

    .line 113
    invoke-direct {p1, v0, p2}, Lnb/e;-><init>(Lnb/w;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :sswitch_2
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-nez p2, :cond_3

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    invoke-virtual {v0}, Lnb/w;->y()Lnb/z;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p2, p1}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-nez p1, :cond_6

    .line 136
    .line 137
    new-instance p1, Lnb/e;

    .line 138
    .line 139
    const/4 p2, 0x4

    .line 140
    invoke-direct {p1, v0, p2}, Lnb/e;-><init>(Lnb/w;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :sswitch_3
    const-string p1, "text_speech_volume_control"

    .line 148
    .line 149
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-nez p1, :cond_4

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_4
    new-instance p1, Lnb/e;

    .line 157
    .line 158
    const/4 p2, 0x6

    .line 159
    invoke-direct {p1, v0, p2}, Lnb/e;-><init>(Lnb/w;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :sswitch_4
    const-string p1, "text_speech_tts_engine"

    .line 167
    .line 168
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-nez p1, :cond_5

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_5
    iget-object p1, v0, Lnb/w;->e:Lnb/e;

    .line 176
    .line 177
    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 181
    .line 182
    .line 183
    :cond_6
    :goto_0
    return-void

    .line 184
    :pswitch_3
    invoke-direct {p0, p1, p2}, Lb9/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :pswitch_4
    iget-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p1, Lha/z;

    .line 191
    .line 192
    iget-object v0, p1, Lha/z;->e:Landroid/os/Handler;

    .line 193
    .line 194
    if-eqz p2, :cond_a

    .line 195
    .line 196
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    const v2, -0x1452f482

    .line 201
    .line 202
    .line 203
    if-eq v1, v2, :cond_8

    .line 204
    .line 205
    const v2, 0x5a47657

    .line 206
    .line 207
    .line 208
    if-eq v1, v2, :cond_7

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_7
    const-string v1, "moments_keyword_block_enable"

    .line 212
    .line 213
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    if-nez p2, :cond_9

    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_8
    const-string v1, "moments_keyword_block_keywords"

    .line 221
    .line 222
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result p2

    .line 226
    if-nez p2, :cond_9

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_9
    iget-object p1, p1, Lha/z;->l:La1/a;

    .line 230
    .line 231
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 235
    .line 236
    .line 237
    :cond_a
    :goto_1
    return-void

    .line 238
    :pswitch_5
    iget-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p1, Lha/m;

    .line 241
    .line 242
    if-eqz p2, :cond_d

    .line 243
    .line 244
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    const v1, -0x4d6ada7d

    .line 249
    .line 250
    .line 251
    if-eq v0, v1, :cond_b

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_b
    const-string v0, "enable"

    .line 255
    .line 256
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result p2

    .line 260
    if-nez p2, :cond_c

    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_c
    invoke-virtual {p1}, Lha/m;->a()V

    .line 264
    .line 265
    .line 266
    :cond_d
    :goto_2
    return-void

    .line 267
    :pswitch_6
    iget-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p1, Lha/k;

    .line 270
    .line 271
    if-eqz p2, :cond_15

    .line 272
    .line 273
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    const v1, -0x4d6ada7d

    .line 278
    .line 279
    .line 280
    if-eq v0, v1, :cond_e

    .line 281
    .line 282
    goto/16 :goto_7

    .line 283
    .line 284
    :cond_e
    const-string v0, "enable"

    .line 285
    .line 286
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result p2

    .line 290
    if-nez p2, :cond_f

    .line 291
    .line 292
    goto/16 :goto_7

    .line 293
    .line 294
    :cond_f
    iget-object p2, p1, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 295
    .line 296
    const-string v0, "enable"

    .line 297
    .line 298
    const/4 v1, 0x0

    .line 299
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 300
    .line 301
    .line 302
    move-result p2

    .line 303
    if-eqz p2, :cond_10

    .line 304
    .line 305
    iget-boolean v0, p1, Lha/k;->i:Z

    .line 306
    .line 307
    if-nez v0, :cond_10

    .line 308
    .line 309
    iget-object v0, p1, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 310
    .line 311
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    const-string v1, "enabled_at_seconds"

    .line 316
    .line 317
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 318
    .line 319
    .line 320
    move-result-wide v2

    .line 321
    const-wide/16 v4, 0x3e8

    .line 322
    .line 323
    div-long/2addr v2, v4

    .line 324
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 329
    .line 330
    .line 331
    goto/16 :goto_6

    .line 332
    .line 333
    :cond_10
    if-nez p2, :cond_14

    .line 334
    .line 335
    iget-object v0, p1, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 336
    .line 337
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    const-string v2, "enabled_at_seconds"

    .line 342
    .line 343
    const-wide/16 v3, 0x0

    .line 344
    .line 345
    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 350
    .line 351
    .line 352
    iget-object v0, p1, Lha/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    check-cast v0, Ljava/lang/Iterable;

    .line 362
    .line 363
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    iget-object v2, p1, Lha/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 368
    .line 369
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    check-cast v2, Ljava/lang/Iterable;

    .line 377
    .line 378
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    if-eqz v3, :cond_11

    .line 387
    .line 388
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    check-cast v3, Ljava/util/concurrent/ScheduledFuture;

    .line 393
    .line 394
    invoke-interface {v3, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 395
    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_11
    iget-object v1, p1, Lha/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 399
    .line 400
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 401
    .line 402
    .line 403
    iget-object v1, p1, Lha/k;->d:Ljava/lang/Object;

    .line 404
    .line 405
    monitor-enter v1

    .line 406
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    :cond_12
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_13

    .line 415
    .line 416
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    check-cast v2, Ljava/lang/String;

    .line 421
    .line 422
    iget-object v3, p1, Lha/k;->f:Ljava/util/LinkedHashMap;

    .line 423
    .line 424
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    check-cast v3, Lha/j;

    .line 429
    .line 430
    if-eqz v3, :cond_12

    .line 431
    .line 432
    iget-wide v3, v3, Lha/j;->a:J

    .line 433
    .line 434
    const-wide v5, 0x7fffffffffffffffL

    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    cmp-long v3, v3, v5

    .line 440
    .line 441
    if-nez v3, :cond_12

    .line 442
    .line 443
    iget-object v3, p1, Lha/k;->f:Ljava/util/LinkedHashMap;

    .line 444
    .line 445
    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 446
    .line 447
    .line 448
    goto :goto_4

    .line 449
    :catchall_0
    move-exception v0

    .line 450
    move-object p1, v0

    .line 451
    goto :goto_5

    .line 452
    :cond_13
    monitor-exit v1

    .line 453
    goto :goto_6

    .line 454
    :goto_5
    monitor-exit v1

    .line 455
    throw p1

    .line 456
    :cond_14
    :goto_6
    iput-boolean p2, p1, Lha/k;->i:Z

    .line 457
    .line 458
    :cond_15
    :goto_7
    return-void

    .line 459
    :pswitch_7
    iget-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast p1, Lha/h;

    .line 462
    .line 463
    if-eqz p2, :cond_1d

    .line 464
    .line 465
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    const v1, -0x4d6ada7d

    .line 470
    .line 471
    .line 472
    if-eq v0, v1, :cond_16

    .line 473
    .line 474
    goto/16 :goto_b

    .line 475
    .line 476
    :cond_16
    const-string v0, "enable"

    .line 477
    .line 478
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result p2

    .line 482
    if-nez p2, :cond_17

    .line 483
    .line 484
    goto/16 :goto_b

    .line 485
    .line 486
    :cond_17
    iget-object p2, p1, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 487
    .line 488
    const-string v0, "enable"

    .line 489
    .line 490
    const/4 v1, 0x0

    .line 491
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 492
    .line 493
    .line 494
    move-result p2

    .line 495
    iget-object v1, p1, Lha/h;->e:Ljava/lang/Object;

    .line 496
    .line 497
    monitor-enter v1

    .line 498
    :try_start_1
    iget-boolean v0, p1, Lha/h;->j:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 499
    .line 500
    if-ne p2, v0, :cond_19

    .line 501
    .line 502
    :cond_18
    :goto_8
    monitor-exit v1

    .line 503
    goto :goto_b

    .line 504
    :cond_19
    :try_start_2
    iget-wide v2, p1, Lha/h;->k:J

    .line 505
    .line 506
    const-wide/16 v4, 0x1

    .line 507
    .line 508
    add-long/2addr v2, v4

    .line 509
    iput-wide v2, p1, Lha/h;->k:J

    .line 510
    .line 511
    iput-boolean p2, p1, Lha/h;->j:Z

    .line 512
    .line 513
    iget-object v0, p1, Lha/h;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 514
    .line 515
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    check-cast v0, Ljava/lang/Iterable;

    .line 523
    .line 524
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    :cond_1a
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    if-eqz v2, :cond_1b

    .line 533
    .line 534
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    check-cast v2, Lha/g;

    .line 539
    .line 540
    iget-object v3, v2, Lha/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 541
    .line 542
    const/4 v4, 0x1

    .line 543
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 544
    .line 545
    .line 546
    iget-object v2, v2, Lha/g;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 547
    .line 548
    if-eqz v2, :cond_1a

    .line 549
    .line 550
    invoke-interface {v2, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 551
    .line 552
    .line 553
    goto :goto_9

    .line 554
    :cond_1b
    iget-object v0, p1, Lha/h;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 555
    .line 556
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 557
    .line 558
    .line 559
    if-eqz p2, :cond_1c

    .line 560
    .line 561
    invoke-virtual {p1}, Lha/h;->a()V

    .line 562
    .line 563
    .line 564
    goto :goto_8

    .line 565
    :catchall_1
    move-exception v0

    .line 566
    move-object p1, v0

    .line 567
    goto :goto_a

    .line 568
    :cond_1c
    iget-object p2, p1, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 569
    .line 570
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 571
    .line 572
    .line 573
    move-result-object p2

    .line 574
    const-string v0, "enabled_at_seconds"

    .line 575
    .line 576
    const-wide/16 v2, 0x0

    .line 577
    .line 578
    invoke-interface {p2, v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 579
    .line 580
    .line 581
    move-result-object p2

    .line 582
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 583
    .line 584
    .line 585
    move-result p2

    .line 586
    if-nez p2, :cond_18

    .line 587
    .line 588
    iget-object p1, p1, Lha/h;->a:Lab/b;

    .line 589
    .line 590
    const-string p2, "\u4fdd\u5b58\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1\u5173\u95ed\u72b6\u6001\u5931\u8d25"

    .line 591
    .line 592
    const/4 v0, 0x0

    .line 593
    invoke-virtual {p1, p2, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 594
    .line 595
    .line 596
    goto :goto_8

    .line 597
    :goto_a
    monitor-exit v1

    .line 598
    throw p1

    .line 599
    :cond_1d
    :goto_b
    return-void

    .line 600
    :pswitch_8
    iget-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast p1, Lha/d;

    .line 603
    .line 604
    if-eqz p2, :cond_25

    .line 605
    .line 606
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    const v1, -0x13f8e49d

    .line 611
    .line 612
    .line 613
    if-eq v0, v1, :cond_1e

    .line 614
    .line 615
    goto/16 :goto_10

    .line 616
    .line 617
    :cond_1e
    const-string v0, "comment_enable"

    .line 618
    .line 619
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-result p2

    .line 623
    if-nez p2, :cond_1f

    .line 624
    .line 625
    goto/16 :goto_10

    .line 626
    .line 627
    :cond_1f
    iget-object p2, p1, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 628
    .line 629
    const-string v0, "comment_enable"

    .line 630
    .line 631
    const/4 v1, 0x0

    .line 632
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 633
    .line 634
    .line 635
    move-result p2

    .line 636
    if-eqz p2, :cond_20

    .line 637
    .line 638
    iget-boolean v0, p1, Lha/d;->i:Z

    .line 639
    .line 640
    if-nez v0, :cond_20

    .line 641
    .line 642
    iget-object v0, p1, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 643
    .line 644
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    const-string v1, "comment_enabled_at_seconds"

    .line 649
    .line 650
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 651
    .line 652
    .line 653
    move-result-wide v2

    .line 654
    const-wide/16 v4, 0x3e8

    .line 655
    .line 656
    div-long/2addr v2, v4

    .line 657
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_f

    .line 665
    .line 666
    :cond_20
    if-nez p2, :cond_24

    .line 667
    .line 668
    iget-object v0, p1, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 669
    .line 670
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    const-string v2, "comment_enabled_at_seconds"

    .line 675
    .line 676
    const-wide/16 v3, 0x0

    .line 677
    .line 678
    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 683
    .line 684
    .line 685
    iget-object v0, p1, Lha/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 686
    .line 687
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    check-cast v0, Ljava/lang/Iterable;

    .line 695
    .line 696
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    iget-object v2, p1, Lha/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 701
    .line 702
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    check-cast v2, Ljava/lang/Iterable;

    .line 710
    .line 711
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 716
    .line 717
    .line 718
    move-result v3

    .line 719
    if-eqz v3, :cond_21

    .line 720
    .line 721
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    check-cast v3, Ljava/util/concurrent/ScheduledFuture;

    .line 726
    .line 727
    invoke-interface {v3, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 728
    .line 729
    .line 730
    goto :goto_c

    .line 731
    :cond_21
    iget-object v1, p1, Lha/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 732
    .line 733
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 734
    .line 735
    .line 736
    iget-object v1, p1, Lha/d;->d:Ljava/lang/Object;

    .line 737
    .line 738
    monitor-enter v1

    .line 739
    :try_start_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    :cond_22
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    if-eqz v2, :cond_23

    .line 748
    .line 749
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v2

    .line 753
    check-cast v2, Ljava/lang/String;

    .line 754
    .line 755
    iget-object v3, p1, Lha/d;->f:Ljava/util/LinkedHashMap;

    .line 756
    .line 757
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v3

    .line 761
    check-cast v3, Lha/b;

    .line 762
    .line 763
    if-eqz v3, :cond_22

    .line 764
    .line 765
    iget-wide v3, v3, Lha/b;->a:J

    .line 766
    .line 767
    const-wide v5, 0x7fffffffffffffffL

    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    cmp-long v3, v3, v5

    .line 773
    .line 774
    if-nez v3, :cond_22

    .line 775
    .line 776
    iget-object v3, p1, Lha/d;->f:Ljava/util/LinkedHashMap;

    .line 777
    .line 778
    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 779
    .line 780
    .line 781
    goto :goto_d

    .line 782
    :catchall_2
    move-exception v0

    .line 783
    move-object p1, v0

    .line 784
    goto :goto_e

    .line 785
    :cond_23
    monitor-exit v1

    .line 786
    goto :goto_f

    .line 787
    :goto_e
    monitor-exit v1

    .line 788
    throw p1

    .line 789
    :cond_24
    :goto_f
    iput-boolean p2, p1, Lha/d;->i:Z

    .line 790
    .line 791
    :cond_25
    :goto_10
    return-void

    .line 792
    :pswitch_9
    iget-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast p1, Lr8/g;

    .line 795
    .line 796
    if-eqz p2, :cond_29

    .line 797
    .line 798
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    const v1, -0x5ff074bf

    .line 803
    .line 804
    .line 805
    if-eq v0, v1, :cond_27

    .line 806
    .line 807
    const v1, -0x5856a73a

    .line 808
    .line 809
    .line 810
    if-eq v0, v1, :cond_26

    .line 811
    .line 812
    goto :goto_11

    .line 813
    :cond_26
    const-string v0, "groups_v1"

    .line 814
    .line 815
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    move-result p2

    .line 819
    if-nez p2, :cond_28

    .line 820
    .line 821
    goto :goto_11

    .line 822
    :cond_27
    const-string v0, "enabled"

    .line 823
    .line 824
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    move-result p2

    .line 828
    if-nez p2, :cond_28

    .line 829
    .line 830
    goto :goto_11

    .line 831
    :cond_28
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 832
    .line 833
    invoke-static {p1}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 834
    .line 835
    .line 836
    :cond_29
    :goto_11
    return-void

    .line 837
    :pswitch_a
    iget-object p1, p0, Lb9/b;->b:Ljava/lang/Object;

    .line 838
    .line 839
    move-object v2, p1

    .line 840
    check-cast v2, Lb9/f;

    .line 841
    .line 842
    if-eqz p2, :cond_30

    .line 843
    .line 844
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 845
    .line 846
    .line 847
    move-result p1

    .line 848
    const v0, 0x495d97ae    # 907642.9f

    .line 849
    .line 850
    .line 851
    if-eq p1, v0, :cond_2b

    .line 852
    .line 853
    const v0, 0x5c6aff42

    .line 854
    .line 855
    .line 856
    if-eq p1, v0, :cond_2a

    .line 857
    .line 858
    goto/16 :goto_16

    .line 859
    .line 860
    :cond_2a
    const-string p1, "chat_time_format"

    .line 861
    .line 862
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    move-result p1

    .line 866
    if-nez p1, :cond_2c

    .line 867
    .line 868
    goto/16 :goto_16

    .line 869
    .line 870
    :cond_2b
    const-string p1, "chat_time_mode"

    .line 871
    .line 872
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    move-result p1

    .line 876
    if-nez p1, :cond_2c

    .line 877
    .line 878
    goto/16 :goto_16

    .line 879
    .line 880
    :cond_2c
    iget-object p1, v2, Lb9/f;->c:Landroid/content/SharedPreferences;

    .line 881
    .line 882
    const-string p2, "chat_time_mode"

    .line 883
    .line 884
    const-string v0, "original"

    .line 885
    .line 886
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object p1

    .line 890
    const-string p2, "hidden"

    .line 891
    .line 892
    const-string v1, "custom"

    .line 893
    .line 894
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v3

    .line 898
    if-eqz v3, :cond_2d

    .line 899
    .line 900
    move-object v4, v1

    .line 901
    goto :goto_12

    .line 902
    :cond_2d
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 903
    .line 904
    .line 905
    move-result p1

    .line 906
    if-eqz p1, :cond_2e

    .line 907
    .line 908
    move-object v4, p2

    .line 909
    goto :goto_12

    .line 910
    :cond_2e
    move-object v4, v0

    .line 911
    :goto_12
    iget-object p1, v2, Lb9/f;->b:Ljava/util/Map;

    .line 912
    .line 913
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    monitor-enter p1

    .line 917
    :try_start_4
    iget-object p2, v2, Lb9/f;->b:Ljava/util/Map;

    .line 918
    .line 919
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 920
    .line 921
    .line 922
    move-result-object p2

    .line 923
    check-cast p2, Ljava/lang/Iterable;

    .line 924
    .line 925
    new-instance v0, Ljava/util/ArrayList;

    .line 926
    .line 927
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 928
    .line 929
    .line 930
    move-result v1

    .line 931
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 932
    .line 933
    .line 934
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 935
    .line 936
    .line 937
    move-result-object p2

    .line 938
    :goto_13
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 939
    .line 940
    .line 941
    move-result v1

    .line 942
    if-eqz v1, :cond_2f

    .line 943
    .line 944
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    check-cast v1, Ljava/util/Map$Entry;

    .line 949
    .line 950
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v3

    .line 954
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    new-instance v5, Lsf/e;

    .line 959
    .line 960
    invoke-direct {v5, v3, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 964
    .line 965
    .line 966
    goto :goto_13

    .line 967
    :catchall_3
    move-exception v0

    .line 968
    move-object p2, v0

    .line 969
    goto :goto_15

    .line 970
    :cond_2f
    monitor-exit p1

    .line 971
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 972
    .line 973
    .line 974
    move-result-object p1

    .line 975
    :goto_14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 976
    .line 977
    .line 978
    move-result p2

    .line 979
    if-eqz p2, :cond_30

    .line 980
    .line 981
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object p2

    .line 985
    check-cast p2, Lsf/e;

    .line 986
    .line 987
    iget-object v0, p2, Lsf/e;->g:Ljava/lang/Object;

    .line 988
    .line 989
    move-object v1, v0

    .line 990
    check-cast v1, Landroid/widget/TextView;

    .line 991
    .line 992
    iget-object p2, p2, Lsf/e;->h:Ljava/lang/Object;

    .line 993
    .line 994
    move-object v3, p2

    .line 995
    check-cast v3, Lb9/d;

    .line 996
    .line 997
    new-instance v0, Lb9/c;

    .line 998
    .line 999
    const/4 v5, 0x0

    .line 1000
    invoke-direct/range {v0 .. v5}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1004
    .line 1005
    .line 1006
    goto :goto_14

    .line 1007
    :goto_15
    monitor-exit p1

    .line 1008
    throw p2

    .line 1009
    :cond_30
    :goto_16
    return-void

    .line 1010
    nop

    .line 1011
    :pswitch_data_0
    .packed-switch 0x0
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

    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    :sswitch_data_0
    .sparse-switch
        -0x637be907 -> :sswitch_4
        -0x5eeacb5d -> :sswitch_3
        -0x56084412 -> :sswitch_2
        -0xf4d7267 -> :sswitch_1
        0x2704d19b -> :sswitch_0
    .end sparse-switch
.end method
