.class public final Le9/p;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 16

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_6

    .line 13
    .line 14
    const-string v2, "hchat_custom_notification_talker"

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, ""

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    move-object v9, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v9, v2

    .line 27
    :goto_0
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_1
    const-string v2, "hchat_custom_notification_id"

    .line 36
    .line 37
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-virtual {v0, v2, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-string v2, "hchat_custom_notification_reply_msg_id"

    .line 46
    .line 47
    const-wide/16 v4, 0x0

    .line 48
    .line 49
    invoke-virtual {v0, v2, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v11

    .line 53
    const-string v2, "hchat_custom_notification_native_msg_svr_id"

    .line 54
    .line 55
    invoke-virtual {v0, v2, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v13

    .line 59
    const-string v2, "hchat_custom_notification_quote_quick_reply"

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-virtual {v0, v2, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v15

    .line 66
    const-string v2, "h.Hchat.action.CUSTOM_NOTIFICATION_REPLY"

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    invoke-static {v0}, Landroid/app/RemoteInput;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    const-string v1, "hchat_reply_text"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    goto :goto_1

    .line 103
    :cond_2
    const/4 v0, 0x0

    .line 104
    :goto_1
    if-nez v0, :cond_3

    .line 105
    .line 106
    move-object v8, v3

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    move-object v8, v0

    .line 109
    :goto_2
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    :try_start_0
    sget-object v0, Le9/q;->e:Ljava/util/concurrent/ExecutorService;

    .line 121
    .line 122
    new-instance v4, Le9/n;

    .line 123
    .line 124
    move-object/from16 v5, p0

    .line 125
    .line 126
    move-object/from16 v6, p1

    .line 127
    .line 128
    invoke-direct/range {v4 .. v15}, Le9/n;-><init>(Le9/p;Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/content/BroadcastReceiver$PendingResult;JJZ)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v0, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 132
    .line 133
    .line 134
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :catchall_0
    move-exception v0

    .line 138
    new-instance v1, Lsf/f;

    .line 139
    .line 140
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    move-object v0, v1

    .line 144
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_6

    .line 149
    .line 150
    invoke-virtual {v10}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 151
    .line 152
    .line 153
    const-string v1, "[Hchat:CustomNotification] \u5feb\u6377\u56de\u590d\u4efb\u52a1\u63d0\u4ea4\u5931\u8d25: "

    .line 154
    .line 155
    invoke-virtual {v1, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v1, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_5
    const-string v0, "h.Hchat.action.CUSTOM_NOTIFICATION_MARK_READ"

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_6

    .line 170
    .line 171
    sget-object v0, Le9/q;->d:Ljava/util/concurrent/ExecutorService;

    .line 172
    .line 173
    new-instance v1, Le9/o;

    .line 174
    .line 175
    const/4 v2, 0x0

    .line 176
    move-object/from16 v6, p1

    .line 177
    .line 178
    invoke-direct {v1, v6, v9, v7, v2}, Le9/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 179
    .line 180
    .line 181
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 182
    .line 183
    .line 184
    :cond_6
    :goto_4
    return-void
.end method
