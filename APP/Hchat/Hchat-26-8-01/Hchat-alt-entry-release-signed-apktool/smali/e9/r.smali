.class public final Le9/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static a(ZZ)Le9/c;
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "__hchat_custom_notification_default_official__"

    .line 4
    .line 5
    :goto_0
    move-object v2, v0

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    if-eqz p0, :cond_1

    .line 8
    .line 9
    const-string v0, "__hchat_custom_notification_default_group__"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const-string v0, "__hchat_custom_notification_default_private__"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :goto_1
    if-eqz p1, :cond_2

    .line 16
    .line 17
    const-string v0, "\u9ed8\u8ba4\u516c\u4f17\u53f7\u901a\u77e5"

    .line 18
    .line 19
    :goto_2
    move-object v4, v0

    .line 20
    goto :goto_3

    .line 21
    :cond_2
    if-eqz p0, :cond_3

    .line 22
    .line 23
    const-string v0, "\u9ed8\u8ba4\u7fa4\u804a\u901a\u77e5"

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_3
    const-string v0, "\u9ed8\u8ba4\u79c1\u804a\u901a\u77e5"

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :goto_3
    new-instance v1, Le9/c;

    .line 30
    .line 31
    const v7, 0x7fffc0

    .line 32
    .line 33
    .line 34
    move-object v3, v2

    .line 35
    move v5, p0

    .line 36
    move v6, p1

    .line 37
    invoke-direct/range {v1 .. v7}, Le9/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public static b(Le9/c;ZZ)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "enabled"

    .line 7
    .line 8
    iget-boolean v2, p0, Le9/c;->f:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "mode"

    .line 14
    .line 15
    iget v2, p0, Le9/c;->g:I

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "vibrate"

    .line 21
    .line 22
    iget-boolean v2, p0, Le9/c;->h:Z

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    const-string v1, "sound"

    .line 28
    .line 29
    iget-boolean v2, p0, Le9/c;->i:Z

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string v1, "markRead"

    .line 35
    .line 36
    iget-boolean v2, p0, Le9/c;->j:Z

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v1, "quickReply"

    .line 42
    .line 43
    iget-boolean v2, p0, Le9/c;->k:Z

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v1, "quoteQuickReply"

    .line 49
    .line 50
    iget-boolean v2, p0, Le9/c;->l:Z

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    const-string v1, "mergeByTalker"

    .line 56
    .line 57
    iget-boolean v2, p0, Le9/c;->m:Z

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    const-string v1, "showDetail"

    .line 63
    .line 64
    iget-boolean v2, p0, Le9/c;->n:Z

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    const-string v1, "ignoreWechatDnd"

    .line 70
    .line 71
    iget-boolean v2, p0, Le9/c;->o:Z

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    const-string v1, "muteEnable"

    .line 77
    .line 78
    iget-boolean v2, p0, Le9/c;->p:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Le9/c;->q:Ljava/lang/String;

    .line 84
    .line 85
    const-string v2, "23:00:00"

    .line 86
    .line 87
    invoke-static {v1, v2}, Le9/r;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v2, "muteStart"

    .line 92
    .line 93
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    .line 95
    .line 96
    iget-object v1, p0, Le9/c;->r:Ljava/lang/String;

    .line 97
    .line 98
    const-string v2, "07:00:00"

    .line 99
    .line 100
    invoke-static {v1, v2}, Le9/r;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const-string v2, "muteEnd"

    .line 105
    .line 106
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    const-string v1, "ringtone"

    .line 110
    .line 111
    iget-object v2, p0, Le9/c;->s:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    const/4 v2, 0x1

    .line 118
    if-eqz p1, :cond_0

    .line 119
    .line 120
    if-nez p2, :cond_0

    .line 121
    .line 122
    iget-boolean v3, p0, Le9/c;->t:Z

    .line 123
    .line 124
    if-eqz v3, :cond_0

    .line 125
    .line 126
    move v3, v2

    .line 127
    goto :goto_0

    .line 128
    :cond_0
    move v3, v1

    .line 129
    :goto_0
    const-string v4, "blockAtAll"

    .line 130
    .line 131
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 132
    .line 133
    .line 134
    if-eqz p1, :cond_1

    .line 135
    .line 136
    if-nez p2, :cond_1

    .line 137
    .line 138
    iget-boolean p0, p0, Le9/c;->u:Z

    .line 139
    .line 140
    if-eqz p0, :cond_1

    .line 141
    .line 142
    move v1, v2

    .line 143
    :cond_1
    const-string p0, "blockAtMe"

    .line 144
    .line 145
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    return-object p0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Le9/r;->h(Ljava/lang/String;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 15
    .line 16
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    if-nez p3, :cond_1

    .line 28
    .line 29
    const-string p3, ""

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast p0, Ljava/lang/Iterable;

    .line 39
    .line 40
    instance-of v0, p0, Ljava/util/Collection;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    move-object v0, p0

    .line 45
    check-cast v0, Ljava/util/Collection;

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_8

    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Ljava/lang/String;

    .line 70
    .line 71
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 72
    .line 73
    invoke-static {v2, v0, v2}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    const/4 v3, 0x1

    .line 82
    if-nez v2, :cond_4

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_6

    .line 89
    .line 90
    invoke-static {p1, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_6

    .line 95
    .line 96
    invoke-static {v0, p1, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_6

    .line 101
    .line 102
    :cond_4
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_5

    .line 107
    .line 108
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_6

    .line 113
    .line 114
    invoke-static {p2, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_6

    .line 119
    .line 120
    invoke-static {v0, p2, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-nez v2, :cond_6

    .line 125
    .line 126
    :cond_5
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_7

    .line 131
    .line 132
    const-string v2, ":"

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-static {p3, v2, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v2, :cond_6

    .line 143
    .line 144
    const-string v2, "\uff1a"

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {p3, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_7

    .line 155
    .line 156
    :cond_6
    move v0, v3

    .line 157
    goto :goto_0

    .line 158
    :cond_7
    move v0, v1

    .line 159
    :goto_0
    if-eqz v0, :cond_3

    .line 160
    .line 161
    return v3

    .line 162
    :cond_8
    :goto_1
    return v1
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p0}, Le9/r;->h(Ljava/lang/String;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ljava/lang/Iterable;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/16 v5, 0x3e

    .line 10
    .line 11
    const-string v1, ","

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Le9/r;->g(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-gez p0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 9
    .line 10
    div-int/lit16 v0, p0, 0xe10

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    div-int/lit8 v1, p0, 0x3c

    .line 17
    .line 18
    rem-int/lit8 v1, v1, 0x3c

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    rem-int/lit8 p0, p0, 0x3c

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const/4 v0, 0x3

    .line 35
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v0, "%02d:%02d:%02d"

    .line 40
    .line 41
    invoke-static {p1, v0, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static f(Ljava/lang/String;ZZZ)Le9/c;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "ignoreWechatDnd"

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static/range {p1 .. p2}, Le9/r;->a(ZZ)Le9/c;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v0, "enabled"

    .line 25
    .line 26
    iget-boolean v4, v3, Le9/c;->f:Z

    .line 27
    .line 28
    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    const-string v0, "mode"

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    const-string v0, "vibrate"

    .line 40
    .line 41
    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    const-string v0, "sound"

    .line 46
    .line 47
    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v12

    .line 51
    const-string v0, "markRead"

    .line 52
    .line 53
    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v13

    .line 57
    const-string v0, "quickReply"

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-virtual {v2, v0, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v14

    .line 64
    const-string v0, "quoteQuickReply"

    .line 65
    .line 66
    invoke-virtual {v2, v0, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 67
    .line 68
    .line 69
    move-result v15

    .line 70
    const-string v0, "mergeByTalker"

    .line 71
    .line 72
    invoke-virtual {v2, v0, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 73
    .line 74
    .line 75
    move-result v16

    .line 76
    const-string v0, "showDetail"

    .line 77
    .line 78
    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 79
    .line 80
    .line 81
    move-result v17

    .line 82
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    invoke-virtual {v2, v1, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    move/from16 v18, v0

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    goto :goto_2

    .line 97
    :cond_1
    move/from16 v18, p3

    .line 98
    .line 99
    :goto_0
    const-string v0, "muteEnable"

    .line 100
    .line 101
    invoke-virtual {v2, v0, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v19

    .line 105
    const-string v0, "muteStart"

    .line 106
    .line 107
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const-string v1, "23:00:00"

    .line 112
    .line 113
    invoke-static {v0, v1}, Le9/r;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v20

    .line 117
    const-string v0, "muteEnd"

    .line 118
    .line 119
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v1, "07:00:00"

    .line 124
    .line 125
    invoke-static {v0, v1}, Le9/r;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v21

    .line 129
    const-string v0, "ringtone"

    .line 130
    .line 131
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v22

    .line 135
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    if-eqz p1, :cond_2

    .line 139
    .line 140
    const-string v0, "blockAtAll"

    .line 141
    .line 142
    invoke-virtual {v2, v0, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    move/from16 v23, v0

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    move/from16 v23, v5

    .line 150
    .line 151
    :goto_1
    if-eqz p1, :cond_3

    .line 152
    .line 153
    const-string v0, "blockAtMe"

    .line 154
    .line 155
    invoke-virtual {v2, v0, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    :cond_3
    move/from16 v24, v5

    .line 160
    .line 161
    const-string v25, ""

    .line 162
    .line 163
    const-string v26, ""

    .line 164
    .line 165
    const/16 v27, 0x1f

    .line 166
    .line 167
    const/4 v4, 0x0

    .line 168
    const/4 v5, 0x0

    .line 169
    const/4 v6, 0x0

    .line 170
    const/4 v7, 0x0

    .line 171
    const/4 v8, 0x0

    .line 172
    invoke-static/range {v3 .. v27}, Le9/c;->a(Le9/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZIZZZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;I)Le9/c;

    .line 173
    .line 174
    .line 175
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    goto :goto_3

    .line 177
    :goto_2
    new-instance v1, Lsf/f;

    .line 178
    .line 179
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    move-object v0, v1

    .line 183
    :goto_3
    invoke-static/range {p1 .. p2}, Le9/r;->a(ZZ)Le9/c;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const/16 v25, 0x0

    .line 188
    .line 189
    const v26, 0x7fbfff

    .line 190
    .line 191
    .line 192
    const/4 v3, 0x0

    .line 193
    const/4 v4, 0x0

    .line 194
    const/4 v5, 0x0

    .line 195
    const/4 v6, 0x0

    .line 196
    const/4 v7, 0x0

    .line 197
    const/4 v8, 0x0

    .line 198
    const/4 v9, 0x0

    .line 199
    const/4 v10, 0x0

    .line 200
    const/4 v11, 0x0

    .line 201
    const/4 v12, 0x0

    .line 202
    const/4 v13, 0x0

    .line 203
    const/4 v14, 0x0

    .line 204
    const/4 v15, 0x0

    .line 205
    const/16 v16, 0x0

    .line 206
    .line 207
    const/16 v18, 0x0

    .line 208
    .line 209
    const/16 v19, 0x0

    .line 210
    .line 211
    const/16 v20, 0x0

    .line 212
    .line 213
    const/16 v21, 0x0

    .line 214
    .line 215
    const/16 v22, 0x0

    .line 216
    .line 217
    const/16 v23, 0x0

    .line 218
    .line 219
    const/16 v24, 0x0

    .line 220
    .line 221
    move/from16 v17, p3

    .line 222
    .line 223
    invoke-static/range {v2 .. v26}, Le9/c;->a(Le9/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZIZZZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;I)Le9/c;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    instance-of v2, v0, Lsf/f;

    .line 228
    .line 229
    if-eqz v2, :cond_4

    .line 230
    .line 231
    move-object v0, v1

    .line 232
    :cond_4
    check-cast v0, Le9/c;

    .line 233
    .line 234
    return-object v0

    .line 235
    :cond_5
    :goto_4
    invoke-static/range {p1 .. p2}, Le9/r;->a(ZZ)Le9/c;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    const/16 v25, 0x0

    .line 240
    .line 241
    const v26, 0x7fbfff

    .line 242
    .line 243
    .line 244
    const/4 v3, 0x0

    .line 245
    const/4 v4, 0x0

    .line 246
    const/4 v5, 0x0

    .line 247
    const/4 v6, 0x0

    .line 248
    const/4 v7, 0x0

    .line 249
    const/4 v8, 0x0

    .line 250
    const/4 v9, 0x0

    .line 251
    const/4 v10, 0x0

    .line 252
    const/4 v11, 0x0

    .line 253
    const/4 v12, 0x0

    .line 254
    const/4 v13, 0x0

    .line 255
    const/4 v14, 0x0

    .line 256
    const/4 v15, 0x0

    .line 257
    const/16 v16, 0x0

    .line 258
    .line 259
    const/16 v18, 0x0

    .line 260
    .line 261
    const/16 v19, 0x0

    .line 262
    .line 263
    const/16 v20, 0x0

    .line 264
    .line 265
    const/16 v21, 0x0

    .line 266
    .line 267
    const/16 v22, 0x0

    .line 268
    .line 269
    const/16 v23, 0x0

    .line 270
    .line 271
    const/16 v24, 0x0

    .line 272
    .line 273
    move/from16 v17, p3

    .line 274
    .line 275
    invoke-static/range {v2 .. v26}, Le9/c;->a(Le9/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZIZZZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;I)Le9/c;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    return-object v0
.end method

.method public static g(Ljava/lang/String;)I
    .locals 4

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

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
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

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
    const-string v0, ":"

    .line 19
    .line 20
    filled-new-array {v0}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p0, v0}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x2

    .line 33
    if-gt v1, v0, :cond_2

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    if-ge v0, v2, :cond_2

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v2}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const/4 v3, 0x1

    .line 56
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v3}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-static {v1, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Ljava/lang/String;

    .line 77
    .line 78
    if-eqz p0, :cond_1

    .line 79
    .line 80
    const/16 v1, 0xa

    .line 81
    .line 82
    invoke-static {v1, p0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-eqz p0, :cond_1

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    :cond_1
    if-ltz v2, :cond_2

    .line 93
    .line 94
    const/16 p0, 0x18

    .line 95
    .line 96
    if-ge v2, p0, :cond_2

    .line 97
    .line 98
    if-ltz v3, :cond_2

    .line 99
    .line 100
    const/16 p0, 0x3c

    .line 101
    .line 102
    if-ge v3, p0, :cond_2

    .line 103
    .line 104
    if-ltz v0, :cond_2

    .line 105
    .line 106
    if-ge v0, p0, :cond_2

    .line 107
    .line 108
    mul-int/lit16 v2, v2, 0xe10

    .line 109
    .line 110
    invoke-static {v3, p0, v2, v0}, Lp/a;->g(IIII)I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    return p0

    .line 115
    :cond_2
    :goto_0
    const/4 p0, -0x1

    .line 116
    return p0
.end method

.method public static h(Ljava/lang/String;)Ljava/util/Set;
    .locals 3

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    const v0, 0xff0c

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x2c

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const v0, 0xff1b

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/16 v0, 0x3b

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/16 v0, 0xa

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    new-array v0, v0, [C

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    aput-char v1, v0, v2

    .line 55
    .line 56
    const/4 v1, 0x6

    .line 57
    invoke-static {p0, v0, v1}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    move-object v2, v1

    .line 110
    check-cast v2, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_2

    .line 117
    .line 118
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    invoke-static {p0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :cond_4
    :goto_2
    sget-object p0, Ltf/v;->g:Ltf/v;

    .line 128
    .line 129
    return-object p0
.end method
