.class public final Lsa/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Landroid/os/Handler;

.field public volatile f:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lsa/c;->e:Landroid/os/Handler;

    .line 14
    .line 15
    iput-object p1, p0, Lsa/c;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const-string p2, "[Hchat:RedPacketNotifier]"

    .line 24
    .line 25
    :cond_0
    iput-object p2, p0, Lsa/c;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    const-string p3, "Hchat_redpacket_notify_manual_v2"

    .line 34
    .line 35
    :cond_1
    iput-object p3, p0, Lsa/c;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    const-string p4, "Hchat \u7ea2\u5305\u63d0\u9192"

    .line 44
    .line 45
    :cond_2
    iput-object p4, p0, Lsa/c;->d:Ljava/lang/String;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 8

    .line 1
    iget-object v0, p0, Lsa/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/high16 v1, 0x34000000

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    .line 7
    .line 8
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    :try_start_1
    new-instance v4, Landroid/content/ComponentName;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    const-string v6, "com.tencent.mm.ui.LauncherUI"

    .line 18
    .line 19
    invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-object v3, v2

    .line 30
    :catchall_1
    :goto_0
    if-nez v3, :cond_0

    .line 31
    .line 32
    :try_start_2
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 47
    .line 48
    .line 49
    :catchall_2
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v4, 0x1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    :try_start_3
    new-instance v1, Landroid/content/Intent;

    .line 57
    .line 58
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 59
    .line 60
    .line 61
    :try_start_4
    new-instance v5, Landroid/content/ComponentName;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    const-string v7, "com.tencent.mm.ui.chatting.ChattingUI"

    .line 68
    .line 69
    invoke-direct {v5, v6, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    const-string v5, "Chat_User"

    .line 76
    .line 77
    invoke-virtual {v1, v5, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 78
    .line 79
    .line 80
    const-string v5, "Chat_Mode"

    .line 81
    .line 82
    invoke-virtual {v1, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    const-string v5, "finish_direct"

    .line 86
    .line 87
    invoke-virtual {v1, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 88
    .line 89
    .line 90
    const/high16 v5, 0x24000000

    .line 91
    .line 92
    invoke-virtual {v1, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_3
    :cond_1
    move-object v1, v2

    .line 97
    :catchall_4
    :goto_1
    if-eqz v3, :cond_2

    .line 98
    .line 99
    if-eqz v1, :cond_2

    .line 100
    .line 101
    filled-new-array {v3, v1}, [Landroid/content/Intent;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    goto :goto_2

    .line 106
    :cond_2
    if-eqz v1, :cond_3

    .line 107
    .line 108
    filled-new-array {v1}, [Landroid/content/Intent;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    goto :goto_2

    .line 113
    :cond_3
    if-eqz v3, :cond_4

    .line 114
    .line 115
    filled-new-array {v3}, [Landroid/content/Intent;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    goto :goto_2

    .line 120
    :cond_4
    move-object v1, v2

    .line 121
    :goto_2
    if-eqz v1, :cond_9

    .line 122
    .line 123
    array-length v3, v1

    .line 124
    if-nez v3, :cond_5

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_5
    const-wide/32 v2, 0x7fffffff

    .line 128
    .line 129
    .line 130
    :try_start_5
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_7

    .line 135
    .line 136
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result p3

    .line 140
    if-eqz p3, :cond_6

    .line 141
    .line 142
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 143
    .line 144
    .line 145
    move-result-wide p2

    .line 146
    goto :goto_4

    .line 147
    :cond_6
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    :goto_3
    int-to-long p2, p2

    .line 152
    goto :goto_4

    .line 153
    :cond_7
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 154
    .line 155
    .line 156
    move-result p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 157
    goto :goto_3

    .line 158
    :goto_4
    const-wide/32 v5, 0xfffff

    .line 159
    .line 160
    .line 161
    and-long/2addr p2, v5

    .line 162
    shl-long/2addr p2, v4

    .line 163
    const-wide/32 v5, 0x4c000000

    .line 164
    .line 165
    .line 166
    or-long/2addr p2, v5

    .line 167
    if-nez p1, :cond_8

    .line 168
    .line 169
    const/4 v4, 0x0

    .line 170
    :cond_8
    int-to-long v4, v4

    .line 171
    or-long p1, p2, v4

    .line 172
    .line 173
    :goto_5
    and-long/2addr p1, v2

    .line 174
    long-to-int p1, p1

    .line 175
    goto :goto_6

    .line 176
    :catchall_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 177
    .line 178
    .line 179
    move-result-wide p1

    .line 180
    goto :goto_5

    .line 181
    :goto_6
    const/high16 p2, 0xc000000

    .line 182
    .line 183
    invoke-static {v0, p1, v1, p2}, Landroid/app/PendingIntent;->getActivities(Landroid/content/Context;I[Landroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    return-object p1

    .line 188
    :cond_9
    :goto_7
    return-object v2
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZZLjava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move/from16 v3, p6

    .line 8
    .line 9
    move/from16 v4, p10

    .line 10
    .line 11
    const-string v5, " \u901a\u77e5\u5931\u8d25: "

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz p8, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v7, v1, Lsa/c;->e:Landroid/os/Handler;

    .line 24
    .line 25
    new-instance v8, Lrb/g;

    .line 26
    .line 27
    move-object/from16 v9, p3

    .line 28
    .line 29
    invoke-direct {v8, v1, v6, v9}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v7, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    if-nez p7, :cond_2

    .line 36
    .line 37
    goto/16 :goto_9

    .line 38
    .line 39
    :cond_2
    iget-object v7, v1, Lsa/c;->a:Landroid/content/Context;

    .line 40
    .line 41
    const-string v8, "notification"

    .line 42
    .line 43
    invoke-virtual {v7, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, Landroid/app/NotificationManager;

    .line 48
    .line 49
    if-nez v7, :cond_3

    .line 50
    .line 51
    goto/16 :goto_9

    .line 52
    .line 53
    :cond_3
    invoke-virtual {v7}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-nez v8, :cond_4

    .line 58
    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    iget-object v2, v1, Lsa/c;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v2, " \u901a\u77e5\u5931\u8d25: \u5fae\u4fe1\u901a\u77e5\u6743\u9650\u5df2\u5173\u95ed"

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    goto/16 :goto_8

    .line 84
    .line 85
    :cond_4
    new-instance v8, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    iget-object v9, v1, Lsa/c;->c:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v9, "_v"

    .line 96
    .line 97
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    if-eqz v4, :cond_5

    .line 101
    .line 102
    const-string v9, "1"

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    const-string v9, "0"

    .line 106
    .line 107
    :goto_1
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    new-instance v9, Landroid/app/NotificationChannel;

    .line 115
    .line 116
    iget-object v10, v1, Lsa/c;->d:Ljava/lang/String;

    .line 117
    .line 118
    const/4 v11, 0x4

    .line 119
    invoke-direct {v9, v8, v10, v11}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v9, v4}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 123
    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    if-eqz v4, :cond_6

    .line 127
    .line 128
    new-array v11, v11, [J

    .line 129
    .line 130
    fill-array-data v11, :array_0

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    move-object v11, v10

    .line 135
    :goto_2
    invoke-virtual {v9, v11}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v9, v10, v10}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7, v9}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v7, v8}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    if-eqz v9, :cond_7

    .line 149
    .line 150
    invoke-virtual {v9}, Landroid/app/NotificationChannel;->getImportance()I

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    if-nez v9, :cond_7

    .line 155
    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    iget-object v2, v1, Lsa/c;->b:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    iget-object v2, v1, Lsa/c;->d:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v2, "\u901a\u77e5\u6e20\u9053\u5df2\u5173\u95ed"

    .line 175
    .line 176
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_7
    iget-object v9, v1, Lsa/c;->a:Landroid/content/Context;

    .line 188
    .line 189
    invoke-virtual {v9}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    iget v9, v9, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 194
    .line 195
    if-nez v9, :cond_8

    .line 196
    .line 197
    const v9, 0x108009b

    .line 198
    .line 199
    .line 200
    :cond_8
    new-instance v10, Landroid/app/Notification$Builder;

    .line 201
    .line 202
    iget-object v11, v1, Lsa/c;->a:Landroid/content/Context;

    .line 203
    .line 204
    invoke-direct {v10, v11, v8}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    move-object/from16 v8, p5

    .line 208
    .line 209
    invoke-virtual {v1, v3, v2, v8}, Lsa/c;->a(ILjava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    const/4 v12, 0x2

    .line 214
    if-eqz v4, :cond_9

    .line 215
    .line 216
    move v4, v12

    .line 217
    goto :goto_3

    .line 218
    :cond_9
    const/4 v4, 0x0

    .line 219
    :goto_3
    invoke-virtual {v10, v9}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    move-object/from16 v13, p1

    .line 224
    .line 225
    invoke-virtual {v9, v13}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    invoke-virtual {v9, v0}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    invoke-virtual {v9, v0}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 238
    .line 239
    .line 240
    move-result-wide v13

    .line 241
    invoke-virtual {v0, v13, v14}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 258
    .line 259
    .line 260
    if-eqz v11, :cond_a

    .line 261
    .line 262
    invoke-virtual {v10, v11}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 263
    .line 264
    .line 265
    :cond_a
    iget-object v0, v1, Lsa/c;->a:Landroid/content/Context;

    .line 266
    .line 267
    invoke-static {v0, v2}, Ld9/o;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    if-eqz v0, :cond_b

    .line 272
    .line 273
    invoke-virtual {v10, v0}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 274
    .line 275
    .line 276
    :cond_b
    const-wide/32 v13, 0x7fffffff

    .line 277
    .line 278
    .line 279
    :try_start_1
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_c

    .line 284
    .line 285
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 286
    .line 287
    .line 288
    move-result-wide v8

    .line 289
    goto :goto_4

    .line 290
    :cond_c
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    int-to-long v8, v0

    .line 295
    :goto_4
    int-to-long v2, v3

    .line 296
    const-wide/16 v15, 0x3ff

    .line 297
    .line 298
    and-long/2addr v8, v15

    .line 299
    const/16 v0, 0xa

    .line 300
    .line 301
    shl-long/2addr v8, v0

    .line 302
    const-wide/32 v15, 0x4b000000

    .line 303
    .line 304
    .line 305
    or-long/2addr v8, v15

    .line 306
    const-wide/16 v15, 0x3f

    .line 307
    .line 308
    and-long/2addr v2, v15

    .line 309
    const/16 v0, 0x14

    .line 310
    .line 311
    shl-long/2addr v2, v0

    .line 312
    or-long/2addr v2, v8

    .line 313
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 314
    .line 315
    .line 316
    move-result-wide v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 317
    const-wide/32 v15, 0xfffff

    .line 318
    .line 319
    .line 320
    and-long/2addr v8, v15

    .line 321
    or-long/2addr v2, v8

    .line 322
    :goto_5
    and-long/2addr v2, v13

    .line 323
    long-to-int v0, v2

    .line 324
    goto :goto_6

    .line 325
    :catchall_1
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 326
    .line 327
    .line 328
    move-result-wide v2

    .line 329
    goto :goto_5

    .line 330
    :goto_6
    invoke-virtual {v10}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    invoke-virtual {v7, v0, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 335
    .line 336
    .line 337
    if-eqz p9, :cond_11

    .line 338
    .line 339
    :try_start_3
    invoke-static/range {p11 .. p11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-eqz v0, :cond_d

    .line 344
    .line 345
    invoke-static {v12}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    goto :goto_7

    .line 350
    :cond_d
    invoke-virtual/range {p11 .. p11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    const-string v2, "://"

    .line 355
    .line 356
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    if-eqz v2, :cond_e

    .line 361
    .line 362
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    goto :goto_7

    .line 367
    :cond_e
    new-instance v2, Ljava/io/File;

    .line 368
    .line 369
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 373
    .line 374
    .line 375
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 376
    goto :goto_7

    .line 377
    :catchall_2
    :try_start_4
    invoke-static {v12}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    :goto_7
    if-nez v0, :cond_f

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 385
    .line 386
    .line 387
    move-result-wide v2

    .line 388
    iget-wide v6, v1, Lsa/c;->f:J

    .line 389
    .line 390
    sub-long v6, v2, v6

    .line 391
    .line 392
    const-wide/16 v8, 0x4b0

    .line 393
    .line 394
    cmp-long v4, v6, v8

    .line 395
    .line 396
    if-gez v4, :cond_10

    .line 397
    .line 398
    goto :goto_9

    .line 399
    :cond_10
    iput-wide v2, v1, Lsa/c;->f:J

    .line 400
    .line 401
    iget-object v2, v1, Lsa/c;->e:Landroid/os/Handler;

    .line 402
    .line 403
    new-instance v3, Lrb/g;

    .line 404
    .line 405
    invoke-direct {v3, v1, v12, v0}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 409
    .line 410
    .line 411
    goto :goto_9

    .line 412
    :goto_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 413
    .line 414
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 415
    .line 416
    .line 417
    iget-object v3, v1, Lsa/c;->b:Ljava/lang/String;

    .line 418
    .line 419
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-static {v2, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 437
    .line 438
    .line 439
    :cond_11
    :goto_9
    return-void

    .line 440
    nop

    .line 441
    :array_0
    .array-data 8
        0x0
        0xb4
        0x50
        0xb4
    .end array-data
.end method
