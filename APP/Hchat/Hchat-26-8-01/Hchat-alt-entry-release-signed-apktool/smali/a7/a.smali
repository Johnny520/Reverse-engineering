.class public abstract La7/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static a:Lb7/a;


# direct methods
.method public static A(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, -0x1

    .line 3
    if-ge p0, v1, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const/4 v2, 0x1

    .line 7
    if-ne p0, v1, :cond_1

    .line 8
    .line 9
    return v2

    .line 10
    :cond_1
    and-int/lit16 v1, p0, 0xff

    .line 11
    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    const/16 v3, 0xff

    .line 15
    .line 16
    if-ne v1, v3, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    const v1, 0xff00

    .line 20
    .line 21
    .line 22
    and-int/2addr p0, v1

    .line 23
    if-nez p0, :cond_3

    .line 24
    .line 25
    return v2

    .line 26
    :cond_3
    return v0

    .line 27
    :cond_4
    :goto_0
    return v2
.end method

.method public static final B(IJLjava/lang/String;Z)Ljava/util/List;
    .locals 9

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-static {p3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    new-instance v2, Lna/h;

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    cmp-long v4, p1, v0

    .line 29
    .line 30
    if-gez v4, :cond_2

    .line 31
    .line 32
    move-wide v6, v0

    .line 33
    :goto_0
    move v4, p0

    .line 34
    move-object v5, p3

    .line 35
    move v8, p4

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-wide v6, p1

    .line 38
    goto :goto_0

    .line 39
    :goto_1
    invoke-direct/range {v2 .. v8}, Lna/h;-><init>(Ljava/lang/String;ILjava/lang/String;JZ)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static C(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    const-string v0, "r"

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    .line 38
    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 45
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    .line 47
    .line 48
    :try_start_4
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p1, v0

    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    move-object v2, v0

    .line 57
    :try_start_5
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_2
    move-exception v0

    .line 62
    move-object p1, v0

    .line 63
    :try_start_6
    invoke-virtual {v2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 67
    :goto_1
    :try_start_7
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_3
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    :try_start_8
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 77
    :catch_0
    :cond_1
    return-object v1
.end method

.method public static final F(Ljava/lang/String;)Ljava/util/List;
    .locals 15

    .line 1
    const-string v0, "label"

    .line 2
    .line 3
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    move v4, v3

    .line 27
    :goto_0
    if-lt v4, v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p0, Ljava/lang/Iterable;

    .line 37
    .line 38
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    if-eqz v5, :cond_6

    .line 48
    .line 49
    const-string v6, "targetId"

    .line 50
    .line 51
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-nez v6, :cond_2

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_2
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_3

    .line 90
    .line 91
    move-object v10, v9

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    move-object v10, v6

    .line 94
    :goto_1
    const-string v6, "enabled"

    .line 95
    .line 96
    invoke-virtual {v5, v6, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    const-string v6, "templateId"

    .line 101
    .line 102
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    const-string v6, "customRules"

    .line 110
    .line 111
    invoke-virtual {v5, v6, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    const-string v6, "overrideRule"

    .line 116
    .line 117
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    if-eqz v6, :cond_5

    .line 122
    .line 123
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-eqz v7, :cond_4

    .line 132
    .line 133
    move-object v5, v9

    .line 134
    :cond_4
    invoke-static {v5, v6}, La7/a;->L(Ljava/lang/String;Lorg/json/JSONObject;)Lna/j;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    :goto_2
    move-object v14, v5

    .line 139
    goto :goto_3

    .line 140
    :cond_5
    const/4 v5, 0x0

    .line 141
    goto :goto_2

    .line 142
    :goto_3
    new-instance v7, Lna/i;

    .line 143
    .line 144
    invoke-direct/range {v7 .. v14}, Lna/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLna/j;)V

    .line 145
    .line 146
    .line 147
    invoke-interface {p0, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    .line 149
    .line 150
    :cond_6
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :catchall_0
    :goto_5
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 154
    .line 155
    return-object p0
.end method

.method public static G(Ljava/lang/String;)Ly9/f;
    .locals 6

    .line 1
    invoke-static {p0}, La7/a;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    new-array v2, v0, [C

    .line 15
    .line 16
    const/16 v3, 0x2c

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    aput-char v3, v2, v4

    .line 20
    .line 21
    const/4 v3, 0x6

    .line 22
    invoke-static {p0, v2, v3}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance v2, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_4

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v3}, La7/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-nez v5, :cond_2

    .line 56
    .line 57
    move-object v3, v1

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    :try_start_0
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception v3

    .line 69
    new-instance v5, Lsf/f;

    .line 70
    .line 71
    invoke-direct {v5, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object v3, v5

    .line 75
    :goto_1
    nop

    .line 76
    instance-of v5, v3, Lsf/f;

    .line 77
    .line 78
    if-eqz v5, :cond_3

    .line 79
    .line 80
    move-object v3, v1

    .line 81
    :cond_3
    check-cast v3, Ljava/lang/Integer;

    .line 82
    .line 83
    :goto_2
    if-eqz v3, :cond_1

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    const/4 p0, 0x2

    .line 90
    invoke-static {p0, v2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_5

    .line 99
    .line 100
    :goto_3
    return-object v1

    .line 101
    :cond_5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-ne v1, v0, :cond_6

    .line 106
    .line 107
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, Ljava/lang/Number;

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    new-instance v0, Ly9/f;

    .line 118
    .line 119
    invoke-direct {v0, p0, p0}, Ly9/f;-><init>(II)V

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_6
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, Ljava/lang/Number;

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    new-instance v0, Ly9/f;

    .line 144
    .line 145
    invoke-direct {v0, v1, p0}, Ly9/f;-><init>(II)V

    .line 146
    .line 147
    .line 148
    :goto_4
    return-object v0
.end method

.method public static H(Lac/k;Lac/k;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-static {p0}, La/a;->H0(Lac/k;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v0, :cond_0

    .line 12
    .line 13
    invoke-static {p0, p1}, La7/a;->N(Lac/k;Lac/k;)Lnc/a;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v1
.end method

.method public static I(Lac/k;IZI)J
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    move-wide v3, v0

    .line 5
    move-wide v5, v3

    .line 6
    :goto_0
    if-ge v2, p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lac/k;->K()I

    .line 9
    .line 10
    .line 11
    move-result v5

    .line 12
    int-to-long v5, v5

    .line 13
    mul-int/lit8 v7, v2, 0x8

    .line 14
    .line 15
    shl-long v7, v5, v7

    .line 16
    .line 17
    or-long/2addr v3, v7

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 p0, 0x8

    .line 22
    .line 23
    if-eqz p3, :cond_2

    .line 24
    .line 25
    :goto_1
    if-ge p1, p3, :cond_1

    .line 26
    .line 27
    shl-long/2addr v3, p0

    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    return-wide v3

    .line 32
    :cond_2
    if-eqz p2, :cond_3

    .line 33
    .line 34
    const-wide/16 p2, 0x80

    .line 35
    .line 36
    and-long/2addr p2, v5

    .line 37
    cmp-long p2, p2, v0

    .line 38
    .line 39
    if-eqz p2, :cond_3

    .line 40
    .line 41
    :goto_2
    if-ge p1, p0, :cond_3

    .line 42
    .line 43
    mul-int/lit8 p2, p1, 0x8

    .line 44
    .line 45
    const-wide/16 v0, 0xff

    .line 46
    .line 47
    shl-long p2, v0, p2

    .line 48
    .line 49
    or-long/2addr v3, p2

    .line 50
    add-int/lit8 p1, p1, 0x1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    return-wide v3
.end method

.method public static final J(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

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
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, La7/a;->K(Lorg/json/JSONArray;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    return-object p0

    .line 20
    :catchall_0
    :cond_1
    :goto_0
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 21
    .line 22
    return-object p0
.end method

.method public static K(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 13

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {}, La/a;->E()Luf/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-lt v3, v1, :cond_1

    .line 17
    .line 18
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-eqz v4, :cond_5

    .line 28
    .line 29
    const-string v5, "mode"

    .line 30
    .line 31
    invoke-virtual {v4, v5, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-nez v8, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const-string v5, "content"

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    const-string v5, "id"

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide v5

    .line 70
    new-instance v7, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v5, "_"

    .line 79
    .line 80
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    :cond_4
    move-object v7, v5

    .line 91
    const-string v5, "delayMs"

    .line 92
    .line 93
    const-wide/16 v10, 0x0

    .line 94
    .line 95
    invoke-virtual {v4, v5, v10, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v10

    .line 99
    const-string v5, "random"

    .line 100
    .line 101
    invoke-virtual {v4, v5, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    new-instance v6, Lna/h;

    .line 106
    .line 107
    invoke-direct/range {v6 .. v12}, Lna/h;-><init>(Ljava/lang/String;ILjava/lang/String;JZ)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v6}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :cond_5
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 114
    .line 115
    goto :goto_0
.end method

.method public static L(Ljava/lang/String;Lorg/json/JSONObject;)Lna/j;
    .locals 48

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "replyMode"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v3, "replyText"

    .line 11
    .line 12
    const-string v4, "\u8c22\u8c22\u8001\u677f"

    .line 13
    .line 14
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-string v4, "replyDelayMs"

    .line 19
    .line 20
    const-wide/16 v5, 0x0

    .line 21
    .line 22
    invoke-virtual {v0, v4, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v7

    .line 26
    const-string v4, "replyRandom"

    .line 27
    .line 28
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const-string v9, "replySteps"

    .line 33
    .line 34
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    if-eqz v10, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    invoke-static {v9}, La7/a;->K(Lorg/json/JSONArray;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    :goto_0
    move-object/from16 v29, v9

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v7, v8, v3, v4}, La7/a;->B(IJLjava/lang/String;Z)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    goto :goto_0

    .line 59
    :goto_1
    const-string v9, "groupReplySteps"

    .line 60
    .line 61
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    if-eqz v10, :cond_1

    .line 66
    .line 67
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-static {v9}, La7/a;->K(Lorg/json/JSONArray;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    :goto_2
    move-object/from16 v30, v9

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_1
    const/4 v9, 0x0

    .line 79
    goto :goto_2

    .line 80
    :goto_3
    const-string v9, "notificationConfigured"

    .line 81
    .line 82
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    const-string v12, "announceText"

    .line 87
    .line 88
    const-string v13, "announceEnabled"

    .line 89
    .line 90
    const-string v14, "notifyFailedToastText"

    .line 91
    .line 92
    const-string v15, "notifyFailedText"

    .line 93
    .line 94
    const-string v5, "notifyFailedToastEnabled"

    .line 95
    .line 96
    const-string v6, "notifyFailedSystemEnabled"

    .line 97
    .line 98
    const-string v11, "notifyToastText"

    .line 99
    .line 100
    const-string v2, "notifyText"

    .line 101
    .line 102
    move/from16 v24, v1

    .line 103
    .line 104
    const-string v1, "notifySoundUri"

    .line 105
    .line 106
    move-object/from16 v25, v3

    .line 107
    .line 108
    const-string v3, "notifyVibrateEnabled"

    .line 109
    .line 110
    move/from16 v28, v4

    .line 111
    .line 112
    const-string v4, "notifySoundEnabled"

    .line 113
    .line 114
    move-wide/from16 v26, v7

    .line 115
    .line 116
    const-string v7, "notifyToastEnabled"

    .line 117
    .line 118
    const-string v8, "notifySystemEnabled"

    .line 119
    .line 120
    if-nez v10, :cond_3

    .line 121
    .line 122
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-nez v10, :cond_3

    .line 127
    .line 128
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-nez v10, :cond_3

    .line 133
    .line 134
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    if-nez v10, :cond_3

    .line 139
    .line 140
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    if-nez v10, :cond_3

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-nez v10, :cond_3

    .line 151
    .line 152
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    if-nez v10, :cond_3

    .line 157
    .line 158
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-nez v10, :cond_3

    .line 163
    .line 164
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    if-nez v10, :cond_3

    .line 169
    .line 170
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    if-nez v10, :cond_3

    .line 175
    .line 176
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    if-nez v10, :cond_3

    .line 181
    .line 182
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-nez v10, :cond_3

    .line 187
    .line 188
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-nez v10, :cond_3

    .line 193
    .line 194
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v10

    .line 198
    if-eqz v10, :cond_2

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_2
    const/4 v10, 0x0

    .line 202
    :goto_4
    move-object/from16 v20, v12

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_3
    :goto_5
    const/4 v10, 0x1

    .line 206
    goto :goto_4

    .line 207
    :goto_6
    const-string v12, "\u62a2\u5230\u7ea2\u5305 {amount} \u5143"

    .line 208
    .line 209
    invoke-virtual {v0, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    move-object/from16 v21, v12

    .line 214
    .line 215
    const-string v12, "\u672a\u62a2\u5230\u7ea2\u5305"

    .line 216
    .line 217
    invoke-virtual {v0, v15, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    const-string v15, "id"

    .line 222
    .line 223
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v15

    .line 227
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    move-result v22

    .line 231
    if-eqz v22, :cond_4

    .line 232
    .line 233
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 234
    .line 235
    .line 236
    move-result-wide v22

    .line 237
    invoke-static/range {v22 .. v23}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v15

    .line 241
    :cond_4
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    move-object/from16 v22, v15

    .line 245
    .line 246
    const-string v15, "name"

    .line 247
    .line 248
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v15

    .line 252
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v23

    .line 256
    if-eqz v23, :cond_5

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_5
    move-object/from16 p0, v15

    .line 260
    .line 261
    :goto_7
    const-string v15, "enabled"

    .line 262
    .line 263
    move-object/from16 v23, v13

    .line 264
    .line 265
    const/4 v13, 0x0

    .line 266
    invoke-virtual {v0, v15, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 267
    .line 268
    .line 269
    move-result v15

    .line 270
    const-string v13, "grabMode"

    .line 271
    .line 272
    move/from16 v31, v15

    .line 273
    .line 274
    const/4 v15, 0x1

    .line 275
    invoke-virtual {v0, v13, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 276
    .line 277
    .line 278
    move-result v13

    .line 279
    const-string v15, "delayMode"

    .line 280
    .line 281
    move/from16 v18, v13

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    invoke-virtual {v0, v15, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 285
    .line 286
    .line 287
    move-result v15

    .line 288
    const-string v13, "delayMs"

    .line 289
    .line 290
    move-object/from16 v32, v14

    .line 291
    .line 292
    move/from16 v33, v15

    .line 293
    .line 294
    const-wide/16 v14, 0x0

    .line 295
    .line 296
    invoke-virtual {v0, v13, v14, v15}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 297
    .line 298
    .line 299
    move-result-wide v16

    .line 300
    const-string v13, "randomMinMs"

    .line 301
    .line 302
    invoke-virtual {v0, v13, v14, v15}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 303
    .line 304
    .line 305
    move-result-wide v34

    .line 306
    const-string v13, "randomMaxMs"

    .line 307
    .line 308
    invoke-virtual {v0, v13, v14, v15}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 309
    .line 310
    .line 311
    move-result-wide v13

    .line 312
    const-string v15, "skipSelf"

    .line 313
    .line 314
    move-wide/from16 v36, v13

    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    invoke-virtual {v0, v15, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 318
    .line 319
    .line 320
    move-result v15

    .line 321
    const-string v14, "listMode"

    .line 322
    .line 323
    invoke-virtual {v0, v14, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 324
    .line 325
    .line 326
    move-result v14

    .line 327
    const-string v13, "whitelist"

    .line 328
    .line 329
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v13

    .line 333
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    move-object/from16 v38, v13

    .line 337
    .line 338
    const-string v13, "blacklist"

    .line 339
    .line 340
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v13

    .line 344
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    move-object/from16 v39, v13

    .line 348
    .line 349
    const-string v13, "keywordMode"

    .line 350
    .line 351
    move/from16 v40, v14

    .line 352
    .line 353
    const/4 v14, 0x0

    .line 354
    invoke-virtual {v0, v13, v14}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 355
    .line 356
    .line 357
    move-result v19

    .line 358
    const-string v13, "keywords"

    .line 359
    .line 360
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v13

    .line 364
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    move-object/from16 v41, v13

    .line 368
    .line 369
    const-string v13, "quietEnabled"

    .line 370
    .line 371
    invoke-virtual {v0, v13, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 372
    .line 373
    .line 374
    move-result v13

    .line 375
    const-string v14, "quietStartSecond"

    .line 376
    .line 377
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 378
    .line 379
    .line 380
    move-result v43

    .line 381
    if-eqz v43, :cond_6

    .line 382
    .line 383
    move/from16 v43, v13

    .line 384
    .line 385
    const/4 v13, 0x0

    .line 386
    invoke-virtual {v0, v14, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 387
    .line 388
    .line 389
    move-result v14

    .line 390
    goto :goto_8

    .line 391
    :cond_6
    move/from16 v43, v13

    .line 392
    .line 393
    const/4 v13, 0x0

    .line 394
    const-string v14, "quietStartMinute"

    .line 395
    .line 396
    invoke-virtual {v0, v14, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 397
    .line 398
    .line 399
    move-result v14

    .line 400
    mul-int/lit8 v14, v14, 0x3c

    .line 401
    .line 402
    :goto_8
    const-string v13, "quietEndSecond"

    .line 403
    .line 404
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 405
    .line 406
    .line 407
    move-result v44

    .line 408
    if-eqz v44, :cond_7

    .line 409
    .line 410
    move/from16 v44, v14

    .line 411
    .line 412
    const/4 v14, 0x0

    .line 413
    invoke-virtual {v0, v13, v14}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 414
    .line 415
    .line 416
    move-result v13

    .line 417
    goto :goto_9

    .line 418
    :cond_7
    move/from16 v44, v14

    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    const-string v13, "quietEndMinute"

    .line 422
    .line 423
    invoke-virtual {v0, v13, v14}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 424
    .line 425
    .line 426
    move-result v13

    .line 427
    mul-int/lit8 v13, v13, 0x3c

    .line 428
    .line 429
    :goto_9
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0, v9, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 433
    .line 434
    .line 435
    move-result v9

    .line 436
    invoke-virtual {v0, v8, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    invoke-virtual {v0, v7, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 441
    .line 442
    .line 443
    move-result v7

    .line 444
    invoke-virtual {v0, v4, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 445
    .line 446
    .line 447
    move-result v4

    .line 448
    const-string v10, "notifySoundMode"

    .line 449
    .line 450
    invoke-virtual {v0, v10, v14}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 451
    .line 452
    .line 453
    move-result v10

    .line 454
    invoke-virtual {v0, v3, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v11, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v11

    .line 472
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v6, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 476
    .line 477
    .line 478
    move-result v6

    .line 479
    invoke-virtual {v0, v5, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 480
    .line 481
    .line 482
    move-result v5

    .line 483
    move-object/from16 v42, v1

    .line 484
    .line 485
    move-object/from16 v1, v32

    .line 486
    .line 487
    invoke-static {v12, v1, v12, v0}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    move-object/from16 v32, v1

    .line 492
    .line 493
    move-object/from16 v1, v23

    .line 494
    .line 495
    invoke-virtual {v0, v1, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 496
    .line 497
    .line 498
    move-result v1

    .line 499
    move-object/from16 v14, v20

    .line 500
    .line 501
    move/from16 v20, v1

    .line 502
    .line 503
    move-object v1, v14

    .line 504
    move-object/from16 v14, v21

    .line 505
    .line 506
    invoke-virtual {v0, v1, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v45

    .line 510
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    move/from16 v23, v13

    .line 514
    .line 515
    move-wide/from16 v13, v36

    .line 516
    .line 517
    move/from16 v36, v3

    .line 518
    .line 519
    new-instance v3, Lna/j;

    .line 520
    .line 521
    move-object/from16 v37, v42

    .line 522
    .line 523
    move/from16 v21, v43

    .line 524
    .line 525
    move-object/from16 v42, v12

    .line 526
    .line 527
    move-object/from16 v43, v32

    .line 528
    .line 529
    move/from16 v32, v8

    .line 530
    .line 531
    move/from16 v8, v33

    .line 532
    .line 533
    move/from16 v33, v7

    .line 534
    .line 535
    move/from16 v7, v18

    .line 536
    .line 537
    move-object/from16 v18, v39

    .line 538
    .line 539
    move-object/from16 v39, v11

    .line 540
    .line 541
    move-wide/from16 v11, v34

    .line 542
    .line 543
    move/from16 v34, v4

    .line 544
    .line 545
    move/from16 v35, v10

    .line 546
    .line 547
    move-object/from16 v4, v22

    .line 548
    .line 549
    move/from16 v22, v44

    .line 550
    .line 551
    move/from16 v44, v20

    .line 552
    .line 553
    move-object/from16 v20, v41

    .line 554
    .line 555
    move/from16 v41, v5

    .line 556
    .line 557
    move-object/from16 v5, p0

    .line 558
    .line 559
    move-object/from16 v46, v38

    .line 560
    .line 561
    move-object/from16 v38, v2

    .line 562
    .line 563
    move/from16 v47, v40

    .line 564
    .line 565
    move/from16 v40, v6

    .line 566
    .line 567
    move/from16 v6, v31

    .line 568
    .line 569
    move/from16 v31, v9

    .line 570
    .line 571
    move-wide/from16 v9, v16

    .line 572
    .line 573
    move-object/from16 v17, v46

    .line 574
    .line 575
    move/from16 v16, v47

    .line 576
    .line 577
    invoke-direct/range {v3 .. v45}, Lna/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZIIJJJZILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIIILjava/lang/String;JZLjava/util/List;Ljava/util/List;ZZZZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 578
    .line 579
    .line 580
    return-object v3
.end method

.method public static final M(Ljava/lang/String;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, La/a;->E()Luf/c;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    if-lt v2, v1, :cond_1

    .line 23
    .line 24
    invoke-static {p0}, La/a;->t(Luf/c;)Luf/c;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    add-int/lit8 v4, v2, 0x1

    .line 36
    .line 37
    new-instance v5, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v6, "\u6a21\u677f "

    .line 43
    .line 44
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-static {v4, v3}, La7/a;->L(Ljava/lang/String;Lorg/json/JSONObject;)Lna/j;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {p0, v3}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    :goto_1
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 65
    .line 66
    return-object p0
.end method

.method public static N(Lac/k;Lac/k;)Lnc/a;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lac/k;->K()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    and-int/lit8 v3, v2, 0x1f

    .line 10
    .line 11
    and-int/lit16 v2, v2, 0xe0

    .line 12
    .line 13
    const/4 v4, 0x5

    .line 14
    shr-int/2addr v2, v4

    .line 15
    add-int/lit8 v5, v2, 0x1

    .line 16
    .line 17
    const/4 v6, 0x3

    .line 18
    if-eqz v3, :cond_8

    .line 19
    .line 20
    const/4 v8, 0x6

    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v10, 0x1

    .line 23
    if-eq v3, v8, :cond_7

    .line 24
    .line 25
    const/4 v11, 0x4

    .line 26
    const/4 v12, 0x2

    .line 27
    if-eq v3, v12, :cond_6

    .line 28
    .line 29
    if-eq v3, v6, :cond_5

    .line 30
    .line 31
    if-eq v3, v11, :cond_4

    .line 32
    .line 33
    const/16 v13, 0x10

    .line 34
    .line 35
    const/16 v14, 0x8

    .line 36
    .line 37
    if-eq v3, v13, :cond_3

    .line 38
    .line 39
    const/16 v15, 0x9

    .line 40
    .line 41
    const/16 v6, 0x11

    .line 42
    .line 43
    if-eq v3, v6, :cond_2

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    const v16, 0xffff

    .line 47
    .line 48
    .line 49
    packed-switch v3, :pswitch_data_0

    .line 50
    .line 51
    .line 52
    new-instance v0, Laf/d;

    .line 53
    .line 54
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "Unknown encoded value type: 0x"

    .line 59
    .line 60
    invoke-static {v2, v1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :pswitch_0
    new-instance v0, Lnc/a;

    .line 69
    .line 70
    if-ne v2, v10, :cond_0

    .line 71
    .line 72
    move v9, v10

    .line 73
    :cond_0
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-direct {v0, v12, v1}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_1
    sget-object v0, Lnc/a;->i:Lnc/a;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_2
    new-instance v2, Lnc/a;

    .line 85
    .line 86
    const/16 v3, 0x12

    .line 87
    .line 88
    invoke-static {v0, v1, v9}, Lf/r;->c(Lac/k;Lac/k;Z)Lnc/b;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-direct {v2, v3, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-object v2

    .line 96
    :pswitch_3
    new-instance v2, Lnc/a;

    .line 97
    .line 98
    invoke-static/range {p0 .. p1}, La7/a;->H(Lac/k;Lac/k;)Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-direct {v2, v6, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-object v2

    .line 106
    :pswitch_4
    new-instance v2, Lnc/a;

    .line 107
    .line 108
    invoke-static {v0, v5, v9, v9}, La7/a;->I(Lac/k;IZI)J

    .line 109
    .line 110
    .line 111
    move-result-wide v3

    .line 112
    long-to-int v0, v3

    .line 113
    new-instance v3, Ljf/h;

    .line 114
    .line 115
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    iget-object v4, v1, Lac/k;->j:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v4, Lff/e;

    .line 121
    .line 122
    iget v4, v4, Lff/e;->a:I

    .line 123
    .line 124
    and-int v4, v4, v16

    .line 125
    .line 126
    shl-int/2addr v4, v13

    .line 127
    and-int v5, v0, v16

    .line 128
    .line 129
    or-int/2addr v4, v5

    .line 130
    iput v4, v3, Ljf/h;->a:I

    .line 131
    .line 132
    iput v0, v3, Ljf/h;->f:I

    .line 133
    .line 134
    iput-object v1, v3, Ljf/h;->g:Lac/k;

    .line 135
    .line 136
    const/16 v0, 0xe

    .line 137
    .line 138
    invoke-direct {v2, v0, v3}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-object v2

    .line 142
    :pswitch_5
    new-instance v2, Lnc/a;

    .line 143
    .line 144
    invoke-static {v0, v5, v9, v9}, La7/a;->I(Lac/k;IZI)J

    .line 145
    .line 146
    .line 147
    move-result-wide v3

    .line 148
    long-to-int v0, v3

    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance v3, Ljf/d;

    .line 153
    .line 154
    invoke-direct {v3, v7}, Ljf/d;-><init>(Lf/r;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v3, v0}, Lac/k;->j(Ljf/d;I)I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-virtual {v1, v0}, Lac/k;->y(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iput-object v0, v3, Ljf/d;->b:Ljava/lang/String;

    .line 166
    .line 167
    const/16 v0, 0xd

    .line 168
    .line 169
    invoke-direct {v2, v0, v3}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    return-object v2

    .line 173
    :pswitch_6
    new-instance v2, Lnc/a;

    .line 174
    .line 175
    invoke-static {v0, v5, v9, v9}, La7/a;->I(Lac/k;IZI)J

    .line 176
    .line 177
    .line 178
    move-result-wide v3

    .line 179
    long-to-int v0, v3

    .line 180
    invoke-virtual {v1, v0}, Lac/k;->y(I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const/16 v1, 0xb

    .line 185
    .line 186
    invoke-direct {v2, v1, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    return-object v2

    .line 190
    :pswitch_7
    new-instance v2, Lnc/a;

    .line 191
    .line 192
    invoke-static {v0, v5, v9, v9}, La7/a;->I(Lac/k;IZI)J

    .line 193
    .line 194
    .line 195
    move-result-wide v3

    .line 196
    long-to-int v0, v3

    .line 197
    invoke-virtual {v1, v0}, Lac/k;->v(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const/16 v1, 0xa

    .line 202
    .line 203
    invoke-direct {v2, v1, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    return-object v2

    .line 207
    :pswitch_8
    new-instance v2, Lnc/a;

    .line 208
    .line 209
    invoke-static {v0, v5, v9, v9}, La7/a;->I(Lac/k;IZI)J

    .line 210
    .line 211
    .line 212
    move-result-wide v5

    .line 213
    long-to-int v0, v5

    .line 214
    iget-object v3, v1, Lac/k;->j:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v3, Lff/e;

    .line 217
    .line 218
    iget-object v3, v3, Lff/e;->d:Ljf/e;

    .line 219
    .line 220
    iget v3, v3, Ljf/e;->i:I

    .line 221
    .line 222
    mul-int/2addr v0, v14

    .line 223
    add-int/2addr v0, v3

    .line 224
    invoke-virtual {v1, v0}, Lac/k;->a(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, Lac/k;->L()I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    packed-switch v0, :pswitch_data_1

    .line 232
    .line 233
    .line 234
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const-string v1, "Unknown method handle type: 0x"

    .line 239
    .line 240
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    const/4 v0, 0x0

    .line 248
    return-object v0

    .line 249
    :pswitch_9
    move v4, v15

    .line 250
    goto :goto_0

    .line 251
    :pswitch_a
    const/4 v4, 0x7

    .line 252
    goto :goto_0

    .line 253
    :pswitch_b
    move v4, v14

    .line 254
    goto :goto_0

    .line 255
    :pswitch_c
    move v4, v8

    .line 256
    goto :goto_0

    .line 257
    :pswitch_d
    move v4, v11

    .line 258
    goto :goto_0

    .line 259
    :pswitch_e
    const/4 v4, 0x3

    .line 260
    goto :goto_0

    .line 261
    :pswitch_f
    move v4, v12

    .line 262
    goto :goto_0

    .line 263
    :pswitch_10
    move v4, v10

    .line 264
    :goto_0
    :pswitch_11
    invoke-virtual {v1, v12}, Lac/k;->M(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Lac/k;->L()I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-static {v4}, Lj8/b;->a(I)Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_1

    .line 276
    .line 277
    new-instance v3, Lqc/d;

    .line 278
    .line 279
    new-instance v5, Ljf/d;

    .line 280
    .line 281
    invoke-direct {v5, v7}, Ljf/d;-><init>(Lf/r;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v5, v0}, Lac/k;->j(Ljf/d;I)I

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    invoke-virtual {v1, v0}, Lac/k;->y(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    iput-object v0, v5, Ljf/d;->b:Ljava/lang/String;

    .line 293
    .line 294
    const/4 v0, 0x0

    .line 295
    invoke-direct {v3, v4, v0, v5}, Lqc/d;-><init>(IILjava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    goto :goto_1

    .line 299
    :cond_1
    new-instance v3, Lqc/d;

    .line 300
    .line 301
    new-instance v5, Ljf/h;

    .line 302
    .line 303
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 304
    .line 305
    .line 306
    iget-object v6, v1, Lac/k;->j:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v6, Lff/e;

    .line 309
    .line 310
    iget v6, v6, Lff/e;->a:I

    .line 311
    .line 312
    and-int v6, v6, v16

    .line 313
    .line 314
    shl-int/2addr v6, v13

    .line 315
    and-int v7, v0, v16

    .line 316
    .line 317
    or-int/2addr v6, v7

    .line 318
    iput v6, v5, Ljf/h;->a:I

    .line 319
    .line 320
    iput v0, v5, Ljf/h;->f:I

    .line 321
    .line 322
    iput-object v1, v5, Ljf/h;->g:Lac/k;

    .line 323
    .line 324
    const/4 v0, 0x1

    .line 325
    invoke-direct {v3, v4, v0, v5}, Lqc/d;-><init>(IILjava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    :goto_1
    invoke-direct {v2, v13, v3}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    return-object v2

    .line 332
    :pswitch_12
    new-instance v2, Lnc/a;

    .line 333
    .line 334
    invoke-static {v0, v5, v9, v9}, La7/a;->I(Lac/k;IZI)J

    .line 335
    .line 336
    .line 337
    move-result-wide v3

    .line 338
    long-to-int v0, v3

    .line 339
    invoke-virtual {v1, v0}, Lac/k;->s(I)Ljf/g;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    const/16 v1, 0xf

    .line 344
    .line 345
    invoke-direct {v2, v1, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    return-object v2

    .line 349
    :cond_2
    new-instance v1, Lnc/a;

    .line 350
    .line 351
    invoke-static {v0, v5, v9, v14}, La7/a;->I(Lac/k;IZI)J

    .line 352
    .line 353
    .line 354
    move-result-wide v2

    .line 355
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 356
    .line 357
    .line 358
    move-result-wide v2

    .line 359
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-direct {v1, v15, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    return-object v1

    .line 367
    :cond_3
    new-instance v1, Lnc/a;

    .line 368
    .line 369
    invoke-static {v0, v5, v9, v11}, La7/a;->I(Lac/k;IZI)J

    .line 370
    .line 371
    .line 372
    move-result-wide v2

    .line 373
    long-to-int v0, v2

    .line 374
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-direct {v1, v14, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    return-object v1

    .line 386
    :cond_4
    new-instance v1, Lnc/a;

    .line 387
    .line 388
    invoke-static {v0, v5, v10, v9}, La7/a;->I(Lac/k;IZI)J

    .line 389
    .line 390
    .line 391
    move-result-wide v2

    .line 392
    long-to-int v0, v2

    .line 393
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-direct {v1, v8, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    return-object v1

    .line 401
    :cond_5
    new-instance v1, Lnc/a;

    .line 402
    .line 403
    invoke-static {v0, v5, v9, v9}, La7/a;->I(Lac/k;IZI)J

    .line 404
    .line 405
    .line 406
    move-result-wide v2

    .line 407
    long-to-int v0, v2

    .line 408
    int-to-char v0, v0

    .line 409
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-direct {v1, v4, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    return-object v1

    .line 417
    :cond_6
    new-instance v1, Lnc/a;

    .line 418
    .line 419
    invoke-static {v0, v5, v10, v9}, La7/a;->I(Lac/k;IZI)J

    .line 420
    .line 421
    .line 422
    move-result-wide v2

    .line 423
    long-to-int v0, v2

    .line 424
    int-to-short v0, v0

    .line 425
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-direct {v1, v11, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    return-object v1

    .line 433
    :cond_7
    new-instance v1, Lnc/a;

    .line 434
    .line 435
    invoke-static {v0, v5, v10, v9}, La7/a;->I(Lac/k;IZI)J

    .line 436
    .line 437
    .line 438
    move-result-wide v2

    .line 439
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    const/4 v2, 0x7

    .line 444
    invoke-direct {v1, v2, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    return-object v1

    .line 448
    :cond_8
    new-instance v1, Lnc/a;

    .line 449
    .line 450
    iget-object v0, v0, Lac/k;->i:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 453
    .line 454
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    const/4 v2, 0x3

    .line 463
    invoke-direct {v1, v2, v0}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    return-object v1

    .line 467
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_12
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_11
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public static O(Ljava/lang/Object;)Lia/v;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    const-string v2, "toByteArray"

    .line 8
    .line 9
    invoke-static {p0, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    instance-of v1, p0, [B

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast p0, [B

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p0, v2

    .line 22
    :goto_0
    if-eqz p0, :cond_a

    .line 23
    .line 24
    new-instance v1, Lia/v;

    .line 25
    .line 26
    :cond_1
    array-length v3, p0

    .line 27
    if-ge v0, v3, :cond_2

    .line 28
    .line 29
    invoke-static {p0, v0}, La7/a;->P([BI)Lia/w;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget v3, v0, Lia/w;->b:I

    .line 36
    .line 37
    iget-wide v4, v0, Lia/w;->a:J

    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    ushr-long v6, v4, v0

    .line 41
    .line 42
    long-to-int v0, v6

    .line 43
    const-wide/16 v6, 0x7

    .line 44
    .line 45
    and-long/2addr v4, v6

    .line 46
    long-to-int v4, v4

    .line 47
    if-eqz v4, :cond_8

    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    if-eq v4, v5, :cond_7

    .line 51
    .line 52
    const/4 v6, 0x2

    .line 53
    if-eq v4, v6, :cond_4

    .line 54
    .line 55
    const/4 v0, 0x5

    .line 56
    if-eq v4, v0, :cond_3

    .line 57
    .line 58
    :cond_2
    :goto_1
    move-object v5, v2

    .line 59
    goto :goto_4

    .line 60
    :cond_3
    add-int/lit8 v3, v3, 0x4

    .line 61
    .line 62
    :goto_2
    move v0, v3

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    invoke-static {p0, v3}, La7/a;->P([BI)Lia/w;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    iget v4, v3, Lia/w;->b:I

    .line 71
    .line 72
    iget-wide v6, v3, Lia/w;->a:J

    .line 73
    .line 74
    long-to-int v3, v6

    .line 75
    if-ltz v3, :cond_2

    .line 76
    .line 77
    add-int v6, v4, v3

    .line 78
    .line 79
    array-length v7, p0

    .line 80
    if-le v6, v7, :cond_5

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    if-ne v0, v5, :cond_6

    .line 84
    .line 85
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v5, Ljava/lang/String;

    .line 91
    .line 92
    invoke-direct {v5, p0, v4, v3, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    move v0, v6

    .line 97
    goto :goto_3

    .line 98
    :cond_7
    add-int/lit8 v3, v3, 0x8

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_8
    invoke-static {p0, v3}, La7/a;->P([BI)Lia/w;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    iget v0, v0, Lia/w;->b:I

    .line 108
    .line 109
    :goto_3
    if-ltz v0, :cond_2

    .line 110
    .line 111
    array-length v3, p0

    .line 112
    if-le v0, v3, :cond_1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :goto_4
    if-nez v5, :cond_9

    .line 116
    .line 117
    const-string v5, ""

    .line 118
    .line 119
    :cond_9
    const/4 v0, 0x4

    .line 120
    invoke-static {p0, v0}, La7/a;->Q([BI)Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-eqz v0, :cond_a

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    long-to-int v0, v3

    .line 131
    const/4 v3, 0x7

    .line 132
    invoke-static {p0, v3}, La7/a;->Q([BI)Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-eqz p0, :cond_a

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide v2

    .line 142
    long-to-int p0, v2

    .line 143
    invoke-direct {v1, v5, v0, p0}, Lia/v;-><init>(Ljava/lang/String;II)V

    .line 144
    .line 145
    .line 146
    return-object v1

    .line 147
    :cond_a
    return-object v2
.end method

.method public static P([BI)Lia/w;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide/16 v1, 0x0

    .line 3
    .line 4
    :goto_0
    array-length v3, p0

    .line 5
    if-ge p1, v3, :cond_1

    .line 6
    .line 7
    const/16 v3, 0x40

    .line 8
    .line 9
    if-ge v0, v3, :cond_1

    .line 10
    .line 11
    aget-byte v3, p0, p1

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    and-int/lit8 v4, v3, 0x7f

    .line 16
    .line 17
    int-to-long v4, v4

    .line 18
    shl-long/2addr v4, v0

    .line 19
    or-long/2addr v1, v4

    .line 20
    and-int/lit16 v3, v3, 0x80

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    new-instance p0, Lia/w;

    .line 25
    .line 26
    invoke-direct {p0, v1, v2, p1}, Lia/w;-><init>(JI)V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    add-int/lit8 v0, v0, 0x7

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static Q([BI)Ljava/lang/Long;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :cond_0
    array-length v1, p0

    .line 3
    if-ge v0, v1, :cond_6

    .line 4
    .line 5
    invoke-static {p0, v0}, La7/a;->P([BI)Lia/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    iget v1, v0, Lia/w;->b:I

    .line 12
    .line 13
    iget-wide v2, v0, Lia/w;->a:J

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    ushr-long v4, v2, v0

    .line 17
    .line 18
    long-to-int v0, v4

    .line 19
    const-wide/16 v4, 0x7

    .line 20
    .line 21
    and-long/2addr v2, v4

    .line 22
    long-to-int v2, v2

    .line 23
    if-eqz v2, :cond_4

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    if-eq v2, v0, :cond_3

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    if-eq v2, v0, :cond_2

    .line 30
    .line 31
    const/4 v0, 0x5

    .line 32
    if-eq v2, v0, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    add-int/lit8 v1, v1, 0x4

    .line 36
    .line 37
    :goto_0
    move v0, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p0, v1}, La7/a;->P([BI)Lia/w;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_6

    .line 44
    .line 45
    iget v1, v0, Lia/w;->b:I

    .line 46
    .line 47
    iget-wide v2, v0, Lia/w;->a:J

    .line 48
    .line 49
    long-to-int v0, v2

    .line 50
    add-int/2addr v1, v0

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    add-int/lit8 v1, v1, 0x8

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    invoke-static {p0, v1}, La7/a;->P([BI)Lia/w;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_6

    .line 60
    .line 61
    if-ne v0, p1, :cond_5

    .line 62
    .line 63
    iget-wide p0, v1, Lia/w;->a:J

    .line 64
    .line 65
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_5
    iget v0, v1, Lia/w;->b:I

    .line 71
    .line 72
    :goto_1
    if-ltz v0, :cond_6

    .line 73
    .line 74
    array-length v1, p0

    .line 75
    if-le v0, v1, :cond_0

    .line 76
    .line 77
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 78
    return-object p0
.end method

.method public static R(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-static {p0}, Ly7/a;->f(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const/16 v0, 0x5c

    .line 10
    .line 11
    const/16 v2, 0x2f

    .line 12
    .line 13
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    array-length v0, p0

    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v4, v0, -0x1

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    move-object v7, v1

    .line 31
    move v6, v5

    .line 32
    :goto_0
    if-ge v5, v0, :cond_7

    .line 33
    .line 34
    aget-char v8, p0, v5

    .line 35
    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/16 v9, 0x2e

    .line 43
    .line 44
    if-ne v8, v9, :cond_3

    .line 45
    .line 46
    if-nez v7, :cond_2

    .line 47
    .line 48
    new-instance v7, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const/4 v9, 0x5

    .line 51
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    if-ne v8, v2, :cond_5

    .line 59
    .line 60
    if-ne v5, v4, :cond_4

    .line 61
    .line 62
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    :cond_4
    move-object v7, v1

    .line 66
    goto :goto_1

    .line 67
    :cond_5
    new-instance v3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 70
    .line 71
    .line 72
    if-eqz v7, :cond_6

    .line 73
    .line 74
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-object v7, v1

    .line 82
    :cond_6
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const/4 v6, 0x1

    .line 86
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_7
    if-nez v7, :cond_8

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_8
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    const/4 v2, 0x2

    .line 105
    if-le v0, v2, :cond_9

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_9
    return-object v1
.end method

.method public static S(Landroid/content/Context;Lwb/u2;Z)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v14, p2

    .line 4
    .line 5
    instance-of v1, v0, Landroid/app/Activity;

    .line 6
    .line 7
    const/4 v15, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroid/app/Activity;

    .line 11
    .line 12
    move-object v2, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v2, v15

    .line 15
    :goto_0
    if-eqz v2, :cond_15

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object v0, v15

    .line 29
    :goto_1
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    check-cast v0, Landroid/view/ViewGroup;

    .line 34
    .line 35
    move-object v11, v0

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move-object v11, v15

    .line 38
    :goto_2
    if-eqz v11, :cond_15

    .line 39
    .line 40
    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v12, 0x1

    .line 45
    sub-int/2addr v0, v12

    .line 46
    new-instance v1, Llg/b;

    .line 47
    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v3, -0x1

    .line 50
    invoke-direct {v1, v0, v13, v3}, Llg/b;-><init>(III)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_3
    move-object v4, v1

    .line 67
    check-cast v4, Llg/c;

    .line 68
    .line 69
    iget-boolean v5, v4, Llg/c;->i:Z

    .line 70
    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    invoke-virtual {v4}, Llg/c;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    invoke-virtual {v11, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    :cond_4
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    const-string v5, "Hchat:MiuixSettingsPage"

    .line 105
    .line 106
    if-eqz v4, :cond_5

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    move-object v6, v4

    .line 113
    check-cast v6, Landroid/view/View;

    .line 114
    .line 115
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-static {v6, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_4

    .line 124
    .line 125
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    const v4, 0x7f060042

    .line 138
    .line 139
    .line 140
    if-eqz v1, :cond_9

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Landroid/view/View;

    .line 147
    .line 148
    invoke-virtual {v1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    instance-of v6, v4, Lwb/o6;

    .line 153
    .line 154
    if-eqz v6, :cond_6

    .line 155
    .line 156
    check-cast v4, Lwb/o6;

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_6
    move-object v4, v15

    .line 160
    :goto_6
    if-eqz v4, :cond_7

    .line 161
    .line 162
    iget-object v4, v4, Lwb/o6;->b:Lwb/f6;

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_7
    move-object v4, v15

    .line 166
    :goto_7
    if-eqz v4, :cond_8

    .line 167
    .line 168
    invoke-virtual {v4}, Lwb/f6;->invoke()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_8
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_9
    new-instance v9, Lwb/o6;

    .line 177
    .line 178
    invoke-direct {v9, v14}, Lwb/o6;-><init>(Z)V

    .line 179
    .line 180
    .line 181
    new-instance v10, Lc9/a1;

    .line 182
    .line 183
    const/4 v0, 0x2

    .line 184
    invoke-direct {v10, v0}, Lc9/a1;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-static/range {p1 .. p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-static {v15}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-static {v6}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 200
    .line 201
    .line 202
    move-result-object v16

    .line 203
    new-instance v8, Lgg/u;

    .line 204
    .line 205
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 206
    .line 207
    .line 208
    new-instance v7, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 211
    .line 212
    .line 213
    new-instance v17, Lgg/q;

    .line 214
    .line 215
    invoke-direct/range {v17 .. v17}, Ljava/lang/Object;-><init>()V

    .line 216
    .line 217
    .line 218
    new-instance v6, Lgg/q;

    .line 219
    .line 220
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 221
    .line 222
    .line 223
    move/from16 v18, v4

    .line 224
    .line 225
    move-object v4, v6

    .line 226
    new-instance v6, Lgg/u;

    .line 227
    .line 228
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 229
    .line 230
    .line 231
    move/from16 v19, v3

    .line 232
    .line 233
    new-instance v3, Lwb/f6;

    .line 234
    .line 235
    move-object/from16 v20, v5

    .line 236
    .line 237
    move-object v5, v9

    .line 238
    move-object v9, v11

    .line 239
    const/4 v11, 0x0

    .line 240
    move-object/from16 v21, v15

    .line 241
    .line 242
    move/from16 v13, v18

    .line 243
    .line 244
    move-object/from16 v15, v20

    .line 245
    .line 246
    invoke-direct/range {v3 .. v11}, Lwb/f6;-><init>(Lgg/q;Lwb/o6;Lgg/u;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Lc9/a1;I)V

    .line 247
    .line 248
    .line 249
    move-object/from16 v22, v8

    .line 250
    .line 251
    move-object v8, v4

    .line 252
    move-object/from16 v4, v22

    .line 253
    .line 254
    iput-object v3, v5, Lwb/o6;->b:Lwb/f6;

    .line 255
    .line 256
    if-eqz v14, :cond_a

    .line 257
    .line 258
    new-instance v3, Lwb/f6;

    .line 259
    .line 260
    const/4 v11, 0x1

    .line 261
    move-object/from16 v22, v8

    .line 262
    .line 263
    move-object v8, v4

    .line 264
    move-object/from16 v4, v22

    .line 265
    .line 266
    invoke-direct/range {v3 .. v11}, Lwb/f6;-><init>(Lgg/q;Lwb/o6;Lgg/u;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Lc9/a1;I)V

    .line 267
    .line 268
    .line 269
    move-object/from16 v22, v8

    .line 270
    .line 271
    move-object v8, v4

    .line 272
    move-object/from16 v4, v22

    .line 273
    .line 274
    iput-object v3, v5, Lwb/o6;->c:Lfg/a;

    .line 275
    .line 276
    :cond_a
    move-object v11, v9

    .line 277
    move-object v9, v7

    .line 278
    move-object v7, v8

    .line 279
    move-object v8, v5

    .line 280
    move-object v5, v6

    .line 281
    move-object v6, v4

    .line 282
    move-object v4, v1

    .line 283
    new-instance v1, Lwb/p6;

    .line 284
    .line 285
    move-object v3, v11

    .line 286
    move-object v11, v10

    .line 287
    move-object v10, v3

    .line 288
    move-object/from16 v3, v17

    .line 289
    .line 290
    invoke-direct/range {v1 .. v11}, Lwb/p6;-><init>(Landroid/app/Activity;Lgg/q;Li0/j1;Lgg/u;Lgg/u;Lgg/q;Lwb/o6;Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc9/a1;)V

    .line 291
    .line 292
    .line 293
    move-object v3, v1

    .line 294
    move-object v1, v5

    .line 295
    move-object v5, v8

    .line 296
    move-object v8, v7

    .line 297
    move-object v7, v9

    .line 298
    move-object v9, v10

    .line 299
    move-object v10, v11

    .line 300
    invoke-virtual {v3, v15}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v3, v13, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    sget-object v11, Lwb/ho;->a:Log/k;

    .line 307
    .line 308
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 309
    .line 310
    .line 311
    move-result-object v11

    .line 312
    invoke-virtual {v11}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 313
    .line 314
    .line 315
    move-result-object v11

    .line 316
    iget v11, v11, Landroid/content/res/Configuration;->uiMode:I

    .line 317
    .line 318
    and-int/lit8 v11, v11, 0x30

    .line 319
    .line 320
    const/16 v13, 0x20

    .line 321
    .line 322
    if-ne v11, v13, :cond_b

    .line 323
    .line 324
    const/high16 v11, -0x1000000

    .line 325
    .line 326
    goto :goto_8

    .line 327
    :cond_b
    const/4 v11, -0x1

    .line 328
    :goto_8
    invoke-virtual {v3, v11}, Landroid/view/View;->setBackgroundColor(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v12}, Landroid/view/View;->setClickable(Z)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3, v12}, Landroid/view/View;->setFocusable(Z)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v3, v12}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 338
    .line 339
    .line 340
    new-instance v11, Landroid/view/ViewGroup$LayoutParams;

    .line 341
    .line 342
    const/4 v13, -0x1

    .line 343
    invoke-direct {v11, v13, v13}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v3, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 347
    .line 348
    .line 349
    iput-object v3, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 350
    .line 351
    invoke-static {v9, v10, v10, v10, v10}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 352
    .line 353
    .line 354
    iget-object v3, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 355
    .line 356
    const-string v15, "page"

    .line 357
    .line 358
    if-eqz v3, :cond_14

    .line 359
    .line 360
    check-cast v3, Landroid/widget/FrameLayout;

    .line 361
    .line 362
    invoke-static {v3, v10, v10, v10, v10}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 363
    .line 364
    .line 365
    iget-boolean v3, v10, Lc9/a1;->l:Z

    .line 366
    .line 367
    if-nez v3, :cond_c

    .line 368
    .line 369
    iget-object v3, v10, Lc9/a1;->i:Lp4/t;

    .line 370
    .line 371
    sget-object v11, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 372
    .line 373
    invoke-virtual {v3, v11}, Lp4/t;->F(Landroid/os/Bundle;)V

    .line 374
    .line 375
    .line 376
    iput-boolean v12, v10, Lc9/a1;->l:Z

    .line 377
    .line 378
    :cond_c
    iget-object v3, v10, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 379
    .line 380
    const-string v11, "setCurrentState"

    .line 381
    .line 382
    invoke-virtual {v3, v11}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    sget-object v13, Landroidx/lifecycle/l;->i:Landroidx/lifecycle/l;

    .line 386
    .line 387
    invoke-virtual {v3, v13}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3, v11}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    sget-object v13, Landroidx/lifecycle/l;->j:Landroidx/lifecycle/l;

    .line 394
    .line 395
    invoke-virtual {v3, v13}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v3, v11}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    sget-object v11, Landroidx/lifecycle/l;->k:Landroidx/lifecycle/l;

    .line 402
    .line 403
    invoke-virtual {v3, v11}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 404
    .line 405
    .line 406
    sget-object v3, Lwb/t4;->g:Lwb/t4;

    .line 407
    .line 408
    invoke-static {v3}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    const-string v11, "Hchat_global_config"

    .line 413
    .line 414
    const-string v13, "terms_accepted"

    .line 415
    .line 416
    :try_start_0
    invoke-static {v2, v11}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 417
    .line 418
    .line 419
    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 420
    move-object/from16 p1, v0

    .line 421
    .line 422
    const/4 v0, 0x0

    .line 423
    :try_start_1
    invoke-interface {v12, v13, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 424
    .line 425
    .line 426
    move-result v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 427
    goto :goto_9

    .line 428
    :catchall_0
    move-object/from16 p1, v0

    .line 429
    .line 430
    const/4 v0, 0x0

    .line 431
    :catchall_1
    move v12, v0

    .line 432
    :goto_9
    if-eqz v12, :cond_d

    .line 433
    .line 434
    const-string v12, "terms_version"

    .line 435
    .line 436
    :try_start_2
    invoke-static {v2, v11}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 437
    .line 438
    .line 439
    move-result-object v11

    .line 440
    invoke-interface {v11, v12, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 441
    .line 442
    .line 443
    move-result v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 444
    :goto_a
    const/4 v12, 0x1

    .line 445
    goto :goto_b

    .line 446
    :catchall_2
    move v11, v0

    .line 447
    goto :goto_a

    .line 448
    :goto_b
    if-ne v11, v12, :cond_e

    .line 449
    .line 450
    move v13, v12

    .line 451
    goto :goto_c

    .line 452
    :cond_d
    const/4 v12, 0x1

    .line 453
    :cond_e
    move v13, v0

    .line 454
    :goto_c
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    new-instance v11, Ly1/c1;

    .line 463
    .line 464
    invoke-direct {v11, v2}, Ly1/c1;-><init>(Landroid/app/Activity;)V

    .line 465
    .line 466
    .line 467
    const v13, 0x1020002

    .line 468
    .line 469
    .line 470
    invoke-virtual {v11, v13}, Landroid/view/View;->setId(I)V

    .line 471
    .line 472
    .line 473
    invoke-static {v11, v10, v10, v10, v10}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 474
    .line 475
    .line 476
    sget-object v13, Ly1/r1;->h:Ly1/r1;

    .line 477
    .line 478
    invoke-virtual {v11, v13}, Ly1/a;->setViewCompositionStrategy(Ly1/k2;)V

    .line 479
    .line 480
    .line 481
    move-object v13, v11

    .line 482
    move-object v11, v9

    .line 483
    move-object v9, v7

    .line 484
    move-object v7, v5

    .line 485
    move-object v5, v0

    .line 486
    new-instance v0, Lwb/l6;

    .line 487
    .line 488
    move-object/from16 p0, v16

    .line 489
    .line 490
    move-object/from16 v16, v13

    .line 491
    .line 492
    move-object/from16 v13, p0

    .line 493
    .line 494
    move-object/from16 p0, v15

    .line 495
    .line 496
    move v15, v12

    .line 497
    move-object v12, v3

    .line 498
    move-object v3, v2

    .line 499
    move-object v2, v10

    .line 500
    move-object v10, v6

    .line 501
    move-object v6, v8

    .line 502
    move-object v8, v1

    .line 503
    move-object v1, v4

    .line 504
    move-object/from16 v4, p1

    .line 505
    .line 506
    invoke-direct/range {v0 .. v14}, Lwb/l6;-><init>(Li0/j1;Lc9/a1;Landroid/app/Activity;Li0/j1;Li0/j1;Lgg/q;Lwb/o6;Lgg/u;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Li0/j1;Li0/j1;Z)V

    .line 507
    .line 508
    .line 509
    move-object v4, v1

    .line 510
    move-object v5, v7

    .line 511
    move-object v1, v8

    .line 512
    move-object v7, v9

    .line 513
    move-object v9, v11

    .line 514
    move-object v8, v6

    .line 515
    move-object v6, v10

    .line 516
    move-object v10, v2

    .line 517
    move-object v2, v3

    .line 518
    new-instance v3, Ls0/d;

    .line 519
    .line 520
    const v11, -0x2040feca

    .line 521
    .line 522
    .line 523
    invoke-direct {v3, v11, v0, v15}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 524
    .line 525
    .line 526
    move-object/from16 v13, v16

    .line 527
    .line 528
    invoke-virtual {v13, v3}, Ly1/c1;->setContent(Lfg/p;)V

    .line 529
    .line 530
    .line 531
    iget-object v0, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 532
    .line 533
    if-eqz v0, :cond_13

    .line 534
    .line 535
    check-cast v0, Landroid/widget/FrameLayout;

    .line 536
    .line 537
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 538
    .line 539
    const/4 v11, -0x1

    .line 540
    invoke-direct {v3, v11, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v0, v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 544
    .line 545
    .line 546
    iget-object v0, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 547
    .line 548
    if-eqz v0, :cond_12

    .line 549
    .line 550
    check-cast v0, Landroid/widget/FrameLayout;

    .line 551
    .line 552
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 556
    .line 557
    .line 558
    move-result v0

    .line 559
    if-nez v0, :cond_f

    .line 560
    .line 561
    goto/16 :goto_e

    .line 562
    .line 563
    :cond_f
    new-instance v3, Lwb/q6;

    .line 564
    .line 565
    const/4 v13, 0x0

    .line 566
    move-object v11, v6

    .line 567
    move-object v6, v4

    .line 568
    move-object v4, v11

    .line 569
    move-object v11, v9

    .line 570
    move-object v12, v10

    .line 571
    move-object v9, v5

    .line 572
    move-object v10, v7

    .line 573
    move-object/from16 v5, v17

    .line 574
    .line 575
    move-object v7, v1

    .line 576
    invoke-direct/range {v3 .. v13}, Lwb/q6;-><init>(Lgg/u;Lgg/q;Li0/j1;Lgg/u;Lgg/q;Lwb/o6;Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc9/a1;I)V

    .line 577
    .line 578
    .line 579
    move-object v0, v6

    .line 580
    move-object v6, v4

    .line 581
    move-object v4, v0

    .line 582
    move-object v0, v3

    .line 583
    move-object v5, v9

    .line 584
    move-object v7, v10

    .line 585
    move-object v9, v11

    .line 586
    move-object v10, v12

    .line 587
    new-instance v3, Lwb/q6;

    .line 588
    .line 589
    const/4 v13, 0x1

    .line 590
    move-object v11, v6

    .line 591
    move-object v6, v4

    .line 592
    move-object v4, v11

    .line 593
    move-object v11, v9

    .line 594
    move-object v9, v5

    .line 595
    move-object v10, v7

    .line 596
    move-object/from16 v5, v17

    .line 597
    .line 598
    move-object v7, v1

    .line 599
    invoke-direct/range {v3 .. v13}, Lwb/q6;-><init>(Lgg/u;Lgg/q;Li0/j1;Lgg/u;Lgg/q;Lwb/o6;Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc9/a1;I)V

    .line 600
    .line 601
    .line 602
    move-object v6, v4

    .line 603
    move-object v7, v10

    .line 604
    const-class v1, Landroid/app/Activity;

    .line 605
    .line 606
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    :catchall_3
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 623
    .line 624
    .line 625
    move-result v2

    .line 626
    if-eqz v2, :cond_10

    .line 627
    .line 628
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    check-cast v2, Ljava/lang/Class;

    .line 633
    .line 634
    :try_start_3
    const-string v4, "dispatchKeyEvent"

    .line 635
    .line 636
    invoke-static {v2, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 637
    .line 638
    .line 639
    move-result-object v4

    .line 640
    check-cast v4, Ljava/util/Collection;

    .line 641
    .line 642
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 643
    .line 644
    .line 645
    :catchall_4
    :try_start_4
    const-string v4, "onKeyDown"

    .line 646
    .line 647
    invoke-static {v2, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    check-cast v4, Ljava/util/Collection;

    .line 652
    .line 653
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 654
    .line 655
    .line 656
    :catchall_5
    :try_start_5
    const-string v4, "onKeyUp"

    .line 657
    .line 658
    invoke-static {v2, v4, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 659
    .line 660
    .line 661
    move-result-object v4

    .line 662
    check-cast v4, Ljava/util/Collection;

    .line 663
    .line 664
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 665
    .line 666
    .line 667
    :catchall_6
    :try_start_6
    const-string v4, "onBackPressed"

    .line 668
    .line 669
    invoke-static {v2, v4, v3}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 670
    .line 671
    .line 672
    move-result-object v2

    .line 673
    check-cast v2, Ljava/util/Collection;

    .line 674
    .line 675
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 676
    .line 677
    .line 678
    goto :goto_d

    .line 679
    :cond_10
    :goto_e
    iget-object v0, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 680
    .line 681
    if-eqz v0, :cond_11

    .line 682
    .line 683
    check-cast v0, Landroid/widget/FrameLayout;

    .line 684
    .line 685
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 686
    .line 687
    .line 688
    return-void

    .line 689
    :cond_11
    invoke-static/range {p0 .. p0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    throw v21

    .line 693
    :cond_12
    invoke-static/range {p0 .. p0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    throw v21

    .line 697
    :cond_13
    invoke-static/range {p0 .. p0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    throw v21

    .line 701
    :cond_14
    move-object/from16 p0, v15

    .line 702
    .line 703
    invoke-static/range {p0 .. p0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    throw v21

    .line 707
    :cond_15
    return-void
.end method

.method public static final T(Lgg/q;Lwb/o6;Lgg/u;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Lc9/a1;)V
    .locals 3

    .line 1
    const-string v0, "page"

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    iget-boolean v2, p0, Lgg/q;->g:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_8

    .line 10
    .line 11
    :cond_0
    const/4 v2, 0x1

    .line 12
    iput-boolean v2, p0, Lgg/q;->g:Z

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    iput-object p0, p1, Lwb/o6;->b:Lwb/f6;

    .line 16
    .line 17
    iput-object p0, p1, Lwb/o6;->c:Lfg/a;

    .line 18
    .line 19
    iput-object p0, p2, Lgg/u;->g:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :catchall_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 36
    .line 37
    :try_start_0
    invoke-virtual {p2}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    .line 42
    .line 43
    .line 44
    :try_start_1
    iget-object p1, p4, Lgg/u;->g:Ljava/lang/Object;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    check-cast p1, Landroid/widget/FrameLayout;

    .line 49
    .line 50
    const p2, 0x1020002

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Ly1/c1;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Ly1/a;->f()V

    .line 62
    .line 63
    .line 64
    move-object p1, v1

    .line 65
    goto :goto_2

    .line 66
    :catchall_1
    move-exception p1

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-object p1, p0

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    :goto_1
    new-instance p2, Lsf/f;

    .line 75
    .line 76
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    move-object p1, p2

    .line 80
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    const-string p3, "[Hchat:MiuixSettings] \u9500\u6bc1\u9875\u9762 Composition \u5931\u8d25: "

    .line 91
    .line 92
    invoke-static {p3, p2, p1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    :try_start_2
    iget-object p1, p4, Lgg/u;->g:Ljava/lang/Object;

    .line 96
    .line 97
    if-eqz p1, :cond_7

    .line 98
    .line 99
    check-cast p1, Landroid/widget/FrameLayout;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, p5, :cond_6

    .line 106
    .line 107
    iget-object p1, p4, Lgg/u;->g:Ljava/lang/Object;

    .line 108
    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    check-cast p1, Landroid/widget/FrameLayout;

    .line 112
    .line 113
    invoke-virtual {p5, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :catchall_2
    move-exception p0

    .line 118
    goto :goto_4

    .line 119
    :cond_5
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p0

    .line 123
    :cond_6
    :goto_3
    move-object p1, v1

    .line 124
    goto :goto_5

    .line 125
    :cond_7
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 129
    :goto_4
    new-instance p1, Lsf/f;

    .line 130
    .line 131
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    :goto_5
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-eqz p0, :cond_8

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const-string p2, "[Hchat:MiuixSettings] \u79fb\u9664\u9875\u9762\u5931\u8d25: "

    .line 145
    .line 146
    invoke-static {p2, p1, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    :cond_8
    :try_start_3
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {p5}, Lx6/d;->p(Landroid/view/View;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 156
    .line 157
    .line 158
    move-object p1, v1

    .line 159
    goto :goto_6

    .line 160
    :catchall_3
    move-exception p0

    .line 161
    new-instance p1, Lsf/f;

    .line 162
    .line 163
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :goto_6
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-eqz p0, :cond_9

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    const-string p2, "[Hchat:MiuixSettings] \u6e05\u7406\u9875\u9762 Owner \u5931\u8d25: "

    .line 177
    .line 178
    invoke-static {p2, p1, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    :cond_9
    :try_start_4
    iget-object p0, p6, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 182
    .line 183
    iget-object p1, p0, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 184
    .line 185
    sget-object p2, Landroidx/lifecycle/l;->g:Landroidx/lifecycle/l;

    .line 186
    .line 187
    if-eq p1, p2, :cond_a

    .line 188
    .line 189
    const-string p1, "setCurrentState"

    .line 190
    .line 191
    invoke-virtual {p0, p1}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, p2}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 195
    .line 196
    .line 197
    :cond_a
    iget-object p0, p6, Lc9/a1;->k:Lr3/a;

    .line 198
    .line 199
    invoke-virtual {p0}, Lr3/a;->a()V

    .line 200
    .line 201
    .line 202
    iget-object p0, p6, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 203
    .line 204
    invoke-virtual {p0}, Landroidx/lifecycle/e0;->a()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 205
    .line 206
    .line 207
    goto :goto_7

    .line 208
    :catchall_4
    move-exception p0

    .line 209
    new-instance v1, Lsf/f;

    .line 210
    .line 211
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    :goto_7
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    if-eqz p0, :cond_b

    .line 219
    .line 220
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    const-string p2, "[Hchat:MiuixSettings] \u9500\u6bc1\u9875\u9762 Owner \u5931\u8d25: "

    .line 225
    .line 226
    invoke-static {p2, p1, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    :cond_b
    :goto_8
    return-void
.end method

.method public static U(Lna/j;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "id"

    .line 7
    .line 8
    iget-object v2, p0, Lna/j;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "name"

    .line 14
    .line 15
    iget-object v2, p0, Lna/j;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "enabled"

    .line 21
    .line 22
    iget-boolean v2, p0, Lna/j;->c:Z

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    const-string v1, "grabMode"

    .line 28
    .line 29
    iget v2, p0, Lna/j;->d:I

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string v1, "delayMode"

    .line 35
    .line 36
    iget v2, p0, Lna/j;->e:I

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v1, "delayMs"

    .line 42
    .line 43
    iget-wide v2, p0, Lna/j;->f:J

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v1, "randomMinMs"

    .line 49
    .line 50
    iget-wide v2, p0, Lna/j;->g:J

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    const-string v1, "randomMaxMs"

    .line 56
    .line 57
    iget-wide v2, p0, Lna/j;->h:J

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    const-string v1, "skipSelf"

    .line 63
    .line 64
    iget-boolean v2, p0, Lna/j;->i:Z

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    const-string v1, "listMode"

    .line 70
    .line 71
    iget v2, p0, Lna/j;->j:I

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    const-string v1, "whitelist"

    .line 77
    .line 78
    iget-object v2, p0, Lna/j;->k:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    const-string v1, "blacklist"

    .line 84
    .line 85
    iget-object v2, p0, Lna/j;->l:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    const-string v1, "keywordMode"

    .line 91
    .line 92
    iget v2, p0, Lna/j;->m:I

    .line 93
    .line 94
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    const-string v1, "keywords"

    .line 98
    .line 99
    iget-object v2, p0, Lna/j;->n:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    const-string v1, "quietEnabled"

    .line 105
    .line 106
    iget-boolean v2, p0, Lna/j;->o:Z

    .line 107
    .line 108
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    const-string v1, "quietStartSecond"

    .line 112
    .line 113
    iget v2, p0, Lna/j;->p:I

    .line 114
    .line 115
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 116
    .line 117
    .line 118
    const-string v1, "quietEndSecond"

    .line 119
    .line 120
    iget v2, p0, Lna/j;->q:I

    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    const-string v1, "replyMode"

    .line 126
    .line 127
    iget v2, p0, Lna/j;->r:I

    .line 128
    .line 129
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    const-string v1, "replyText"

    .line 133
    .line 134
    iget-object v2, p0, Lna/j;->s:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    const-string v1, "replyDelayMs"

    .line 140
    .line 141
    iget-wide v2, p0, Lna/j;->t:J

    .line 142
    .line 143
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 144
    .line 145
    .line 146
    const-string v1, "replyRandom"

    .line 147
    .line 148
    iget-boolean v2, p0, Lna/j;->u:Z

    .line 149
    .line 150
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 151
    .line 152
    .line 153
    new-instance v1, Lorg/json/JSONArray;

    .line 154
    .line 155
    iget-object v2, p0, Lna/j;->v:Ljava/util/List;

    .line 156
    .line 157
    invoke-static {v2}, La7/a;->r(Ljava/util/List;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const-string v2, "replySteps"

    .line 165
    .line 166
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    iget-object v1, p0, Lna/j;->w:Ljava/util/List;

    .line 170
    .line 171
    if-eqz v1, :cond_0

    .line 172
    .line 173
    new-instance v2, Lorg/json/JSONArray;

    .line 174
    .line 175
    invoke-static {v1}, La7/a;->r(Ljava/util/List;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const-string v1, "groupReplySteps"

    .line 183
    .line 184
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    :cond_0
    const-string v1, "notificationConfigured"

    .line 188
    .line 189
    iget-boolean v2, p0, Lna/j;->x:Z

    .line 190
    .line 191
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 192
    .line 193
    .line 194
    const-string v1, "notifySystemEnabled"

    .line 195
    .line 196
    iget-boolean v2, p0, Lna/j;->y:Z

    .line 197
    .line 198
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 199
    .line 200
    .line 201
    const-string v1, "notifyToastEnabled"

    .line 202
    .line 203
    iget-boolean v2, p0, Lna/j;->z:Z

    .line 204
    .line 205
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 206
    .line 207
    .line 208
    const-string v1, "notifySoundEnabled"

    .line 209
    .line 210
    iget-boolean v2, p0, Lna/j;->A:Z

    .line 211
    .line 212
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 213
    .line 214
    .line 215
    const-string v1, "notifySoundMode"

    .line 216
    .line 217
    iget v2, p0, Lna/j;->B:I

    .line 218
    .line 219
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 220
    .line 221
    .line 222
    const-string v1, "notifyVibrateEnabled"

    .line 223
    .line 224
    iget-boolean v2, p0, Lna/j;->C:Z

    .line 225
    .line 226
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 227
    .line 228
    .line 229
    const-string v1, "notifySoundUri"

    .line 230
    .line 231
    iget-object v2, p0, Lna/j;->D:Ljava/lang/String;

    .line 232
    .line 233
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 234
    .line 235
    .line 236
    const-string v1, "notifyText"

    .line 237
    .line 238
    iget-object v2, p0, Lna/j;->E:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 241
    .line 242
    .line 243
    const-string v1, "notifyToastText"

    .line 244
    .line 245
    iget-object v2, p0, Lna/j;->F:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 248
    .line 249
    .line 250
    const-string v1, "notifyFailedSystemEnabled"

    .line 251
    .line 252
    iget-boolean v2, p0, Lna/j;->G:Z

    .line 253
    .line 254
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 255
    .line 256
    .line 257
    const-string v1, "notifyFailedToastEnabled"

    .line 258
    .line 259
    iget-boolean v2, p0, Lna/j;->H:Z

    .line 260
    .line 261
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 262
    .line 263
    .line 264
    const-string v1, "notifyFailedText"

    .line 265
    .line 266
    iget-object v2, p0, Lna/j;->I:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 269
    .line 270
    .line 271
    const-string v1, "notifyFailedToastText"

    .line 272
    .line 273
    iget-object v2, p0, Lna/j;->J:Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 276
    .line 277
    .line 278
    const-string v1, "announceEnabled"

    .line 279
    .line 280
    iget-boolean v2, p0, Lna/j;->K:Z

    .line 281
    .line 282
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 283
    .line 284
    .line 285
    const-string v1, "announceText"

    .line 286
    .line 287
    iget-object p0, p0, Lna/j;->L:Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 290
    .line 291
    .line 292
    return-object v0
.end method

.method public static final V(F)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, "NaN"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    cmpg-float p0, p0, v0

    .line 18
    .line 19
    if-gez p0, :cond_1

    .line 20
    .line 21
    const-string p0, "-Infinity"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    const-string p0, "Infinity"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/high16 v1, 0x41200000    # 10.0f

    .line 34
    .line 35
    float-to-double v1, v1

    .line 36
    int-to-double v3, v0

    .line 37
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    double-to-float v1, v1

    .line 42
    mul-float/2addr p0, v1

    .line 43
    float-to-int v2, p0

    .line 44
    int-to-float v3, v2

    .line 45
    sub-float/2addr p0, v3

    .line 46
    const/high16 v3, 0x3f000000    # 0.5f

    .line 47
    .line 48
    cmpl-float p0, p0, v3

    .line 49
    .line 50
    if-ltz p0, :cond_3

    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    :cond_3
    int-to-float p0, v2

    .line 55
    div-float/2addr p0, v1

    .line 56
    if-lez v0, :cond_4

    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_4
    float-to-int p0, p0

    .line 64
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method public static final W(Landroid/content/Context;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Landroid/app/Activity;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Landroid/app/Activity;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p0, v1

    .line 13
    :goto_0
    if-eqz p0, :cond_8

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-object v0, v1

    .line 27
    :goto_1
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    check-cast v0, Landroid/view/ViewGroup;

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move-object v0, v1

    .line 35
    :goto_2
    if-eqz v0, :cond_8

    .line 36
    .line 37
    invoke-static {v0}, La7/a;->s(Landroid/view/ViewGroup;)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const v2, 0x7f060042

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move-object v0, v1

    .line 52
    :goto_3
    instance-of v2, v0, Lwb/o6;

    .line 53
    .line 54
    if-eqz v2, :cond_4

    .line 55
    .line 56
    check-cast v0, Lwb/o6;

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_4
    move-object v0, v1

    .line 60
    :goto_4
    const/4 v2, 0x1

    .line 61
    if-eqz v0, :cond_7

    .line 62
    .line 63
    iget-boolean v3, v0, Lwb/o6;->a:Z

    .line 64
    .line 65
    if-ne v3, v2, :cond_7

    .line 66
    .line 67
    iget-object p0, v0, Lwb/o6;->c:Lfg/a;

    .line 68
    .line 69
    if-eqz p0, :cond_5

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_5
    iget-object p0, v0, Lwb/o6;->b:Lwb/f6;

    .line 73
    .line 74
    :goto_5
    if-eqz p0, :cond_6

    .line 75
    .line 76
    invoke-interface {p0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :cond_6
    return v2

    .line 80
    :cond_7
    new-instance v0, Lwb/u2;

    .line 81
    .line 82
    invoke-direct {v0, v1}, Lwb/u2;-><init>(Lwb/s2;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0, v0, v2}, La7/a;->S(Landroid/content/Context;Lwb/u2;Z)V

    .line 86
    .line 87
    .line 88
    return v2

    .line 89
    :cond_8
    const/4 p0, 0x0

    .line 90
    return p0
.end method

.method public static X(Lud/e;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 8
    .line 9
    sget-object v2, Lmd/a;->f0:Lmd/a;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lmd/e;->D(Lmd/a;)V

    .line 18
    .line 19
    .line 20
    :try_start_1
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 24
    return-object p0

    .line 25
    :catch_1
    move-exception p0

    .line 26
    new-instance p1, Laf/g;

    .line 27
    .line 28
    const-string v0, "Code generation error after restart"

    .line 29
    .line 30
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_0
    new-instance p0, Laf/g;

    .line 35
    .line 36
    const-string p1, "Code generation error"

    .line 37
    .line 38
    invoke-direct {p0, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw p0
.end method

.method public static final a(Ly0/o;Lr/z;Lp/x0;ZLm/p;ZLk/k1;Ly0/e;Lp/i;Ly0/f;Lp/g;Lfg/l;Li0/h0;III)V
    .locals 39

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v5, p2

    move/from16 v4, p3

    move/from16 v0, p5

    move-object/from16 v14, p12

    move/from16 v15, p13

    move/from16 v2, p14

    move/from16 v6, p15

    const v7, 0x37213af3

    .line 1
    invoke-virtual {v14, v7}, Li0/h0;->b0(I)Li0/h0;

    and-int/lit8 v7, v15, 0x6

    if-nez v7, :cond_1

    invoke-virtual {v14, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v15

    goto :goto_1

    :cond_1
    move v7, v15

    :goto_1
    and-int/lit8 v10, v15, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v14, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v7, v10

    :cond_3
    and-int/lit16 v10, v15, 0x180

    if-nez v10, :cond_5

    invoke-virtual {v14, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x100

    goto :goto_3

    :cond_4
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v7, v10

    :cond_5
    and-int/lit16 v10, v15, 0xc00

    const/4 v8, 0x0

    const/16 v18, 0x400

    if-nez v10, :cond_7

    invoke-virtual {v14, v8}, Li0/h0;->g(Z)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_4

    :cond_6
    move/from16 v10, v18

    :goto_4
    or-int/2addr v7, v10

    :cond_7
    and-int/lit16 v10, v15, 0x6000

    if-nez v10, :cond_9

    invoke-virtual {v14, v4}, Li0/h0;->g(Z)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4000

    goto :goto_5

    :cond_8
    const/16 v10, 0x2000

    :goto_5
    or-int/2addr v7, v10

    :cond_9
    const/high16 v10, 0x30000

    and-int/2addr v10, v15

    if-nez v10, :cond_b

    move-object/from16 v10, p4

    invoke-virtual {v14, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_a

    const/high16 v21, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v21, 0x10000

    :goto_6
    or-int v7, v7, v21

    goto :goto_7

    :cond_b
    move-object/from16 v10, p4

    :goto_7
    const/high16 v21, 0x180000

    and-int v22, v15, v21

    if-nez v22, :cond_d

    invoke-virtual {v14, v0}, Li0/h0;->g(Z)Z

    move-result v22

    if-eqz v22, :cond_c

    const/high16 v22, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v22, 0x80000

    :goto_8
    or-int v7, v7, v22

    :cond_d
    const/high16 v22, 0xc00000

    and-int v23, v15, v22

    move-object/from16 v13, p6

    if-nez v23, :cond_f

    invoke-virtual {v14, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_e

    const/high16 v24, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v24, 0x400000

    :goto_9
    or-int v7, v7, v24

    :cond_f
    const/high16 v24, 0x6000000

    and-int v25, v15, v24

    if-nez v25, :cond_10

    const/high16 v25, 0x2000000

    or-int v7, v7, v25

    :cond_10
    and-int/lit16 v8, v6, 0x200

    const/high16 v26, 0x30000000

    if-eqz v8, :cond_11

    or-int v7, v7, v26

    move-object/from16 v11, p7

    goto :goto_b

    :cond_11
    and-int v27, v15, v26

    move-object/from16 v11, p7

    if-nez v27, :cond_13

    invoke-virtual {v14, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_12

    const/high16 v28, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v28, 0x10000000

    :goto_a
    or-int v7, v7, v28

    :cond_13
    :goto_b
    and-int/lit16 v12, v6, 0x400

    if-eqz v12, :cond_14

    or-int/lit8 v16, v2, 0x6

    move-object/from16 v9, p8

    goto :goto_d

    :cond_14
    and-int/lit8 v29, v2, 0x6

    move-object/from16 v9, p8

    if-nez v29, :cond_16

    invoke-virtual {v14, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_15

    const/16 v16, 0x4

    goto :goto_c

    :cond_15
    const/16 v16, 0x2

    :goto_c
    or-int v16, v2, v16

    goto :goto_d

    :cond_16
    move/from16 v16, v2

    :goto_d
    move/from16 v30, v7

    and-int/lit16 v7, v6, 0x800

    if-eqz v7, :cond_17

    or-int/lit8 v16, v16, 0x30

    move/from16 v31, v7

    :goto_e
    move/from16 v7, v16

    goto :goto_10

    :cond_17
    and-int/lit8 v31, v2, 0x30

    if-nez v31, :cond_19

    move/from16 v31, v7

    move-object/from16 v7, p9

    invoke-virtual {v14, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_18

    const/16 v19, 0x20

    goto :goto_f

    :cond_18
    const/16 v19, 0x10

    :goto_f
    or-int v16, v16, v19

    goto :goto_e

    :cond_19
    move/from16 v31, v7

    move-object/from16 v7, p9

    goto :goto_e

    :goto_10
    move/from16 v16, v8

    and-int/lit16 v8, v6, 0x1000

    if-eqz v8, :cond_1b

    or-int/lit16 v7, v7, 0x180

    :cond_1a
    move-object/from16 v6, p10

    goto :goto_12

    :cond_1b
    and-int/lit16 v6, v2, 0x180

    if-nez v6, :cond_1a

    move-object/from16 v6, p10

    invoke-virtual {v14, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1c

    const/16 v20, 0x100

    goto :goto_11

    :cond_1c
    const/16 v20, 0x80

    :goto_11
    or-int v7, v7, v20

    :goto_12
    and-int/lit16 v6, v2, 0xc00

    if-nez v6, :cond_1e

    move-object/from16 v6, p11

    invoke-virtual {v14, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1d

    const/16 v18, 0x800

    :cond_1d
    or-int v7, v7, v18

    goto :goto_13

    :cond_1e
    move-object/from16 v6, p11

    :goto_13
    const v18, 0x12492493

    and-int v2, v30, v18

    const v6, 0x12492492

    const/16 v18, 0x1

    if-ne v2, v6, :cond_20

    and-int/lit16 v2, v7, 0x493

    const/16 v6, 0x492

    if-eq v2, v6, :cond_1f

    goto :goto_14

    :cond_1f
    const/4 v2, 0x0

    goto :goto_15

    :cond_20
    :goto_14
    move/from16 v2, v18

    :goto_15
    and-int/lit8 v6, v30, 0x1

    invoke-virtual {v14, v6, v2}, Li0/h0;->S(IZ)Z

    move-result v2

    if-eqz v2, :cond_57

    invoke-virtual {v14}, Li0/h0;->X()V

    and-int/lit8 v2, v15, 0x1

    const v6, -0xe000001

    const/16 v19, 0x0

    if-eqz v2, :cond_22

    invoke-virtual {v14}, Li0/h0;->B()Z

    move-result v2

    if-eqz v2, :cond_21

    goto :goto_17

    .line 2
    :cond_21
    invoke-virtual {v14}, Li0/h0;->V()V

    and-int v2, v30, v6

    move-object/from16 v13, p9

    move-object/from16 v8, p10

    :goto_16
    move v6, v7

    move-object v7, v9

    move-object v12, v11

    goto :goto_19

    :cond_22
    :goto_17
    and-int v2, v30, v6

    if-eqz v16, :cond_23

    move-object/from16 v11, v19

    :cond_23
    if-eqz v12, :cond_24

    move-object/from16 v9, v19

    :cond_24
    if-eqz v31, :cond_25

    move-object/from16 v6, v19

    goto :goto_18

    :cond_25
    move-object/from16 v6, p9

    :goto_18
    if-eqz v8, :cond_26

    move-object v13, v6

    move v6, v7

    move-object v7, v9

    move-object v12, v11

    move-object/from16 v8, v19

    goto :goto_19

    :cond_26
    move-object/from16 v8, p10

    move-object v13, v6

    goto :goto_16

    :goto_19
    invoke-virtual {v14}, Li0/h0;->q()V

    shr-int/lit8 v16, v2, 0x3

    and-int/lit8 v9, v16, 0xe

    shr-int/lit8 v11, v6, 0x6

    and-int/lit8 v11, v11, 0x70

    or-int/2addr v11, v9

    move/from16 p7, v2

    .line 3
    invoke-static/range {p11 .. p12}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    move-result-object v2

    and-int/lit8 v20, v11, 0xe

    move/from16 p8, v6

    xor-int/lit8 v6, v20, 0x6

    move/from16 p9, v9

    const/4 v9, 0x4

    if-le v6, v9, :cond_27

    .line 4
    invoke-virtual {v14, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_28

    :cond_27
    and-int/lit8 v6, v11, 0x6

    if-ne v6, v9, :cond_29

    :cond_28
    move/from16 v6, v18

    goto :goto_1a

    :cond_29
    const/4 v6, 0x0

    .line 5
    :goto_1a
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v9

    .line 6
    sget-object v11, Li0/l;->a:Li0/e;

    if-nez v6, :cond_2a

    if-ne v9, v11, :cond_2b

    .line 7
    :cond_2a
    new-instance v6, Lr/d;

    .line 8
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v9, Li0/g1;

    const v10, 0x7fffffff

    invoke-direct {v9, v10}, Li0/g1;-><init>(I)V

    .line 10
    iput-object v9, v6, Lr/d;->a:Li0/g1;

    .line 11
    new-instance v9, Li0/g1;

    invoke-direct {v9, v10}, Li0/g1;-><init>(I)V

    .line 12
    iput-object v9, v6, Lr/d;->b:Li0/g1;

    .line 13
    new-instance v9, Lb0/j;

    const/16 v10, 0xb

    invoke-direct {v9, v2, v10}, Lb0/j;-><init>(Li0/a1;I)V

    sget-object v2, Li0/e;->k:Li0/e;

    .line 14
    sget-object v20, Li0/k2;->a:Lb5/c;

    .line 15
    new-instance v10, Li0/x;

    invoke-direct {v10, v9, v2}, Li0/x;-><init>(Lfg/a;Li0/e;)V

    .line 16
    new-instance v9, Lab/e;

    const/16 v15, 0xb

    invoke-direct {v9, v10, v3, v6, v15}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 17
    new-instance v6, Li0/x;

    invoke-direct {v6, v9, v2}, Li0/x;-><init>(Lfg/a;Li0/e;)V

    .line 18
    new-instance v30, Lr/l;

    const/16 v31, 0x0

    const/16 v32, 0x0

    .line 19
    const-class v33, Li0/l2;

    const-string v35, "value"

    const-string v36, "getValue()Ljava/lang/Object;"

    move-object/from16 v34, v6

    invoke-direct/range {v30 .. v36}, Lr/l;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v9, v30

    .line 20
    invoke-virtual {v14, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 21
    :cond_2b
    move-object v2, v9

    check-cast v2, Lr/l;

    shr-int/lit8 v6, p7, 0x9

    and-int/lit8 v9, v6, 0x70

    or-int v9, p9, v9

    and-int/lit8 v10, v9, 0xe

    xor-int/lit8 v10, v10, 0x6

    const/4 v15, 0x4

    if-le v10, v15, :cond_2c

    .line 22
    invoke-virtual {v14, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2d

    :cond_2c
    and-int/lit8 v10, v9, 0x6

    if-ne v10, v15, :cond_2e

    :cond_2d
    move/from16 v10, v18

    goto :goto_1b

    :cond_2e
    const/4 v10, 0x0

    :goto_1b
    and-int/lit8 v20, v9, 0x70

    xor-int/lit8 v15, v20, 0x30

    move-object/from16 p9, v2

    const/16 v2, 0x20

    if-le v15, v2, :cond_2f

    invoke-virtual {v14, v4}, Li0/h0;->g(Z)Z

    move-result v15

    if-nez v15, :cond_30

    :cond_2f
    and-int/lit8 v9, v9, 0x30

    if-ne v9, v2, :cond_31

    :cond_30
    move/from16 v2, v18

    goto :goto_1c

    :cond_31
    const/4 v2, 0x0

    :goto_1c
    or-int/2addr v2, v10

    .line 23
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_32

    if-ne v9, v11, :cond_33

    .line 24
    :cond_32
    new-instance v9, Lr/f;

    invoke-direct {v9, v3, v4}, Lr/f;-><init>(Lr/z;Z)V

    .line 25
    invoke-virtual {v14, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 26
    :cond_33
    move-object v15, v9

    check-cast v15, Lr/f;

    .line 27
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v11, :cond_34

    .line 28
    invoke-static {v14}, Li0/r;->n(Li0/h0;)Lqg/t;

    move-result-object v2

    .line 29
    invoke-virtual {v14, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 30
    :cond_34
    move-object v9, v2

    check-cast v9, Lqg/t;

    .line 31
    sget-object v2, Ly1/h1;->g:Li0/m2;

    .line 32
    invoke-virtual {v14, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v2

    .line 33
    move-object v10, v2

    check-cast v10, Lf1/z;

    .line 34
    sget-object v2, Ly1/h1;->w:Li0/u;

    .line 35
    invoke-virtual {v14, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_35

    .line 37
    sget-object v19, Ls/e1;->a:Ls/h;

    :cond_35
    move-object/from16 v2, v19

    const v19, 0xfff0

    and-int v19, p7, v19

    const/high16 v20, 0x380000

    and-int v6, v6, v20

    or-int v6, v19, v6

    shl-int/lit8 v19, p8, 0x12

    const/high16 v30, 0x1c00000

    and-int v31, v19, v30

    or-int v6, v6, v31

    const/high16 v31, 0xe000000

    and-int v19, v19, v31

    or-int v6, v6, v19

    shl-int/lit8 v19, p8, 0x1b

    const/high16 v32, 0x70000000

    and-int v19, v19, v32

    or-int v6, v6, v19

    and-int/lit8 v19, v6, 0x70

    move-object/from16 p7, v9

    xor-int/lit8 v9, v19, 0x30

    const/16 v0, 0x20

    if-le v9, v0, :cond_36

    .line 38
    invoke-virtual {v14, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_37

    :cond_36
    and-int/lit8 v9, v6, 0x30

    if-ne v9, v0, :cond_38

    :cond_37
    move/from16 v0, v18

    goto :goto_1d

    :cond_38
    const/4 v0, 0x0

    :goto_1d
    and-int/lit16 v9, v6, 0x380

    xor-int/lit16 v9, v9, 0x180

    move/from16 p8, v0

    const/16 v0, 0x100

    if-le v9, v0, :cond_39

    .line 39
    invoke-virtual {v14, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3a

    :cond_39
    and-int/lit16 v9, v6, 0x180

    if-ne v9, v0, :cond_3b

    :cond_3a
    move/from16 v0, v18

    goto :goto_1e

    :cond_3b
    const/4 v0, 0x0

    :goto_1e
    or-int v0, p8, v0

    and-int/lit16 v9, v6, 0x1c00

    xor-int/lit16 v9, v9, 0xc00

    move/from16 p8, v0

    const/16 v0, 0x800

    if-le v9, v0, :cond_3c

    const/4 v9, 0x0

    .line 40
    invoke-virtual {v14, v9}, Li0/h0;->g(Z)Z

    move-result v17

    if-nez v17, :cond_3d

    :cond_3c
    and-int/lit16 v9, v6, 0xc00

    if-ne v9, v0, :cond_3e

    :cond_3d
    move/from16 v9, v18

    goto :goto_1f

    :cond_3e
    const/4 v9, 0x0

    :goto_1f
    or-int v0, p8, v9

    const v9, 0xe000

    and-int/2addr v9, v6

    xor-int/lit16 v9, v9, 0x6000

    move/from16 p8, v0

    const/16 v0, 0x4000

    if-le v9, v0, :cond_3f

    .line 41
    invoke-virtual {v14, v4}, Li0/h0;->g(Z)Z

    move-result v9

    if-nez v9, :cond_40

    :cond_3f
    and-int/lit16 v9, v6, 0x6000

    if-ne v9, v0, :cond_41

    :cond_40
    move/from16 v9, v18

    goto :goto_20

    :cond_41
    const/4 v9, 0x0

    :goto_20
    or-int v0, p8, v9

    const/4 v9, 0x0

    .line 42
    invoke-virtual {v14, v9}, Li0/h0;->d(I)Z

    move-result v17

    or-int v0, v0, v17

    and-int v17, v6, v20

    xor-int v9, v17, v21

    move/from16 p8, v0

    const/high16 v0, 0x100000

    if-le v9, v0, :cond_42

    .line 43
    invoke-virtual {v14, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_43

    :cond_42
    and-int v9, v6, v21

    if-ne v9, v0, :cond_44

    :cond_43
    move/from16 v9, v18

    goto :goto_21

    :cond_44
    const/4 v9, 0x0

    :goto_21
    or-int v0, p8, v9

    and-int v9, v6, v30

    xor-int v9, v9, v22

    move/from16 p8, v0

    const/high16 v0, 0x800000

    if-le v9, v0, :cond_45

    .line 44
    invoke-virtual {v14, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_46

    :cond_45
    and-int v9, v6, v22

    if-ne v9, v0, :cond_47

    :cond_46
    move/from16 v9, v18

    goto :goto_22

    :cond_47
    const/4 v9, 0x0

    :goto_22
    or-int v0, p8, v9

    and-int v9, v6, v31

    xor-int v9, v9, v24

    move/from16 p8, v0

    const/high16 v0, 0x4000000

    if-le v9, v0, :cond_48

    .line 45
    invoke-virtual {v14, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_49

    :cond_48
    and-int v9, v6, v24

    if-ne v9, v0, :cond_4a

    :cond_49
    move/from16 v9, v18

    goto :goto_23

    :cond_4a
    const/4 v9, 0x0

    :goto_23
    or-int v0, p8, v9

    and-int v9, v6, v32

    xor-int v9, v9, v26

    move/from16 p8, v0

    const/high16 v0, 0x20000000

    if-le v9, v0, :cond_4b

    .line 46
    invoke-virtual {v14, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4c

    :cond_4b
    and-int v6, v6, v26

    if-ne v6, v0, :cond_4d

    :cond_4c
    move/from16 v9, v18

    goto :goto_24

    :cond_4d
    const/4 v9, 0x0

    :goto_24
    or-int v0, p8, v9

    .line 47
    invoke-virtual {v14, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    .line 48
    invoke-virtual {v14, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    .line 49
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_4e

    if-ne v6, v11, :cond_4f

    :cond_4e
    move-object v0, v11

    move-object v11, v2

    goto :goto_25

    :cond_4f
    move-object/from16 v10, p9

    move-object v9, v7

    move-object/from16 v19, v8

    move-object/from16 v37, v11

    const/4 v0, 0x4

    goto :goto_26

    .line 50
    :goto_25
    new-instance v2, Lr/o;

    move-object/from16 v9, p7

    move-object/from16 v6, p9

    move-object/from16 v37, v0

    const/4 v0, 0x4

    invoke-direct/range {v2 .. v13}, Lr/o;-><init>(Lr/z;ZLp/x0;Lr/l;Lp/i;Lp/g;Lqg/t;Lf1/z;Ls/h;Ly0/e;Ly0/f;)V

    move-object v10, v6

    move-object v9, v7

    move-object/from16 v19, v8

    .line 51
    invoke-virtual {v14, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    move-object v6, v2

    .line 52
    :goto_26
    move-object v11, v6

    check-cast v11, Lr/o;

    if-eqz p3, :cond_50

    .line 53
    sget-object v2, Lm/p1;->g:Lm/p1;

    :goto_27
    move-object v4, v2

    goto :goto_28

    :cond_50
    sget-object v2, Lm/p1;->h:Lm/p1;

    goto :goto_27

    :goto_28
    if-eqz p5, :cond_56

    const v2, -0x7bcec0e8

    .line 54
    invoke-virtual {v14, v2}, Li0/h0;->a0(I)V

    and-int/lit8 v2, v16, 0xe

    xor-int/lit8 v2, v2, 0x6

    if-le v2, v0, :cond_51

    .line 55
    invoke-virtual {v14, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_52

    :cond_51
    and-int/lit8 v2, v16, 0x6

    if-ne v2, v0, :cond_53

    :cond_52
    move/from16 v8, v18

    :goto_29
    const/4 v0, 0x0

    goto :goto_2a

    :cond_53
    const/4 v8, 0x0

    goto :goto_29

    :goto_2a
    invoke-virtual {v14, v0}, Li0/h0;->d(I)Z

    move-result v2

    or-int v0, v8, v2

    .line 56
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_54

    move-object/from16 v0, v37

    if-ne v2, v0, :cond_55

    .line 57
    :cond_54
    new-instance v2, Lr/g;

    invoke-direct {v2, v3}, Lr/g;-><init>(Lr/z;)V

    .line 58
    invoke-virtual {v14, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 59
    :cond_55
    check-cast v2, Lr/g;

    .line 60
    iget-object v0, v3, Lr/z;->p:Lm/c;

    .line 61
    invoke-static {v2, v0, v4}, Ls/o;->g(Lr/g;Lm/c;Lm/p1;)Ly0/o;

    move-result-object v0

    const/4 v2, 0x0

    .line 62
    invoke-virtual {v14, v2}, Li0/h0;->p(Z)V

    goto :goto_2b

    :cond_56
    const/4 v2, 0x0

    const v0, -0x7bc835d1

    .line 63
    invoke-virtual {v14, v0}, Li0/h0;->a0(I)V

    .line 64
    invoke-virtual {v14, v2}, Li0/h0;->p(Z)V

    .line 65
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 66
    :goto_2b
    iget-object v2, v3, Lr/z;->m:Lr/v;

    .line 67
    invoke-interface {v1, v2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v2

    .line 68
    iget-object v5, v3, Lr/z;->n:Ls/e;

    .line 69
    invoke-interface {v2, v5}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v2

    move/from16 v6, p5

    .line 70
    invoke-static {v2, v10, v15, v4, v6}, Ls/o;->h(Ly0/o;Lr/l;Lr/f;Lm/p1;Z)Ly0/o;

    move-result-object v2

    .line 71
    invoke-interface {v2, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v0

    .line 72
    iget-object v2, v3, Lr/z;->o:Ls/z;

    .line 73
    iget-object v2, v2, Ls/z;->k:Ly0/o;

    .line 74
    invoke-interface {v0, v2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v2

    .line 75
    iget-object v8, v3, Lr/z;->g:Ln/k;

    move-object/from16 v7, p4

    move-object/from16 v5, p6

    .line 76
    invoke-static/range {v2 .. v8}, Lk/n;->s(Ly0/o;Lm/i2;Lm/p1;Lk/k1;ZLm/p;Ln/k;)Ly0/o;

    move-result-object v0

    move-object v8, v3

    .line 77
    iget-object v4, v8, Lr/z;->q:Ls/m0;

    const/4 v7, 0x0

    move-object v3, v0

    move-object v2, v10

    move-object v5, v11

    move-object v6, v14

    .line 78
    invoke-static/range {v2 .. v7}, Ls/o;->a(Lfg/a;Ly0/o;Ls/m0;Lr/o;Li0/h0;I)V

    move-object v11, v12

    move-object v10, v13

    goto :goto_2c

    :cond_57
    move-object v8, v3

    .line 79
    invoke-virtual/range {p12 .. p12}, Li0/h0;->V()V

    move-object/from16 v10, p9

    move-object/from16 v19, p10

    .line 80
    :goto_2c
    invoke-virtual/range {p12 .. p12}, Li0/h0;->t()Li0/r1;

    move-result-object v0

    if-eqz v0, :cond_58

    move-object v2, v0

    new-instance v0, Lr/m;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v12, p11

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v38, v2

    move-object v2, v8

    move-object v8, v11

    move-object/from16 v11, v19

    invoke-direct/range {v0 .. v15}, Lr/m;-><init>(Ly0/o;Lr/z;Lp/x0;ZLm/p;ZLk/k1;Ly0/e;Lp/i;Ly0/f;Lp/g;Lfg/l;III)V

    move-object/from16 v2, v38

    .line 81
    iput-object v0, v2, Li0/r1;->d:Lfg/p;

    :cond_58
    return-void
.end method

.method public static final b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance p1, Log/i;

    .line 10
    .line 11
    invoke-direct {p1, p0, p2}, Log/i;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public static final c(Lgg/q;Li0/j1;Lgg/u;Lgg/u;Lgg/q;Lwb/o6;Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc9/a1;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lgg/q;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lgg/q;->g:Z

    .line 8
    .line 9
    invoke-virtual {p1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lwb/x2;

    .line 14
    .line 15
    instance-of v1, v0, Lwb/u2;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p2, Lgg/u;->g:Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    check-cast v1, Lfg/a;

    .line 24
    .line 25
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-object p6, p3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-nez v0, :cond_2

    .line 31
    .line 32
    move-object v2, p4

    .line 33
    move-object p4, p2

    .line 34
    move-object p2, v2

    .line 35
    move-object v2, p6

    .line 36
    move-object p6, p3

    .line 37
    move-object p3, p5

    .line 38
    move-object p5, v2

    .line 39
    invoke-static/range {p2 .. p8}, La7/a;->T(Lgg/q;Lwb/o6;Lgg/u;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Lc9/a1;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move-object p6, p3

    .line 44
    invoke-static {v0}, Lwb/ho;->C4(Lwb/x2;)Lwb/x2;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p1, p2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object p1, p6, Lgg/u;->g:Ljava/lang/Object;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    check-cast p1, Landroid/widget/FrameLayout;

    .line 56
    .line 57
    new-instance p2, La1/a;

    .line 58
    .line 59
    const/16 p3, 0x1d

    .line 60
    .line 61
    invoke-direct {p2, p0, p3}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    const-string p0, "page"

    .line 69
    .line 70
    invoke-static {p0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    throw p0
.end method

.method public static final d(DDDD)D
    .locals 14

    .line 1
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    .line 2
    .line 3
    mul-double v2, p4, v0

    .line 4
    .line 5
    div-double/2addr v2, p0

    .line 6
    mul-double v4, p2, p2

    .line 7
    .line 8
    mul-double v6, p0, p0

    .line 9
    .line 10
    div-double/2addr v4, v6

    .line 11
    sub-double/2addr v2, v4

    .line 12
    div-double/2addr v2, v0

    .line 13
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 14
    .line 15
    mul-double v8, p2, v4

    .line 16
    .line 17
    mul-double v8, v8, p2

    .line 18
    .line 19
    mul-double v8, v8, p2

    .line 20
    .line 21
    mul-double v10, v6, p0

    .line 22
    .line 23
    div-double/2addr v8, v10

    .line 24
    const-wide/high16 v10, 0x4022000000000000L    # 9.0

    .line 25
    .line 26
    mul-double v10, v10, p2

    .line 27
    .line 28
    mul-double v10, v10, p4

    .line 29
    .line 30
    div-double/2addr v10, v6

    .line 31
    sub-double/2addr v8, v10

    .line 32
    const-wide/high16 v6, 0x403b000000000000L    # 27.0

    .line 33
    .line 34
    mul-double v10, p6, v6

    .line 35
    .line 36
    div-double/2addr v10, p0

    .line 37
    add-double/2addr v10, v8

    .line 38
    div-double/2addr v10, v6

    .line 39
    mul-double v8, v10, v10

    .line 40
    .line 41
    const-wide/high16 v12, 0x4010000000000000L    # 4.0

    .line 42
    .line 43
    div-double/2addr v8, v12

    .line 44
    mul-double v12, v2, v2

    .line 45
    .line 46
    mul-double/2addr v12, v2

    .line 47
    div-double/2addr v12, v6

    .line 48
    add-double/2addr v12, v8

    .line 49
    invoke-static {v12, v13}, Ljava/lang/Math;->sqrt(D)D

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    neg-double v6, v10

    .line 54
    div-double/2addr v6, v4

    .line 55
    add-double v4, v6, v2

    .line 56
    .line 57
    invoke-static {v4, v5}, Ljava/lang/Math;->cbrt(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    sub-double/2addr v6, v2

    .line 62
    invoke-static {v6, v7}, Ljava/lang/Math;->cbrt(D)D

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    add-double/2addr v2, v4

    .line 67
    mul-double/2addr p0, v0

    .line 68
    div-double p0, p2, p0

    .line 69
    .line 70
    sub-double/2addr v2, p0

    .line 71
    return-wide v2
.end method

.method public static final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p0}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static f(Lud/u;)Lqd/m;
    .locals 4

    .line 1
    const-string v0, "java.lang.invoke.MethodHandles.Lookup"

    .line 2
    .line 3
    invoke-static {v0}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "java.lang.invoke.MethodHandles"

    .line 8
    .line 9
    invoke-static {v1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {p0, v1}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "lookup"

    .line 18
    .line 19
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {p0, v1, v2, v3, v0}, Lod/d;->b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v0, Lpd/n;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v0, p0, v1, v2}, Lpd/n;-><init>(Lod/d;II)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static g(Lud/u;Lmc/a;)Lpd/n;
    .locals 6

    .line 1
    invoke-interface {p1}, Lmc/a;->e()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p1}, Lmc/a;->c()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v1, Lme/a;

    .line 14
    .line 15
    const/4 v2, 0x6

    .line 16
    invoke-direct {v1, v2}, Lme/a;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v1}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x1

    .line 30
    add-int/2addr v2, v3

    .line 31
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 38
    .line 39
    .line 40
    const-string p1, "java.lang.invoke.MethodType"

    .line 41
    .line 42
    invoke-static {p1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p0, p1}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v2, "methodType"

    .line 51
    .line 52
    invoke-static {p0, v0, v2, v1, p1}, Lod/d;->b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v0, Lpd/n;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-direct {v0, p1, v3, v2}, Lpd/n;-><init>(Lod/d;II)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lqd/j;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    instance-of v2, v1, Lqd/g;

    .line 85
    .line 86
    if-eqz v2, :cond_0

    .line 87
    .line 88
    new-instance v2, Lpd/j;

    .line 89
    .line 90
    invoke-virtual {v1}, Lqd/j;->o()Lqd/q;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget-object v1, v1, Lqd/q;->i:Lqd/j;

    .line 95
    .line 96
    invoke-static {p0, v1}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    new-instance v4, Lod/c;

    .line 101
    .line 102
    const-string v5, "TYPE"

    .line 103
    .line 104
    invoke-direct {v4, v3, v5, v1}, Lod/c;-><init>(Lod/a;Ljava/lang/String;Lqd/j;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lud/u;->e:Lbe/k;

    .line 108
    .line 109
    invoke-virtual {v1, v4}, Lbe/k;->h(Lod/c;)Lod/c;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const/4 v3, 0x0

    .line 114
    sget-object v4, Lpd/k;->M:Lpd/k;

    .line 115
    .line 116
    invoke-direct {v2, v4, v1, v3}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_0
    new-instance v2, Lpd/c;

    .line 121
    .line 122
    invoke-direct {v2, v1}, Lpd/c;-><init>(Lqd/j;)V

    .line 123
    .line 124
    .line 125
    :goto_1
    invoke-static {v2}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v0, v1}, Lud/p;->I(Lqd/l;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_1
    return-object v0
.end method

.method public static h(Ljava/util/ArrayList;)Ld9/a;
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    const/16 v5, 0x3e

    .line 3
    .line 4
    const-string v1, " "

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string v0, "chatting"

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    sget-object p0, Ld9/a;->g:Ld9/a;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    const-string v0, "conversation"

    .line 35
    .line 36
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    sget-object p0, Ld9/a;->h:Ld9/a;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_1
    const-string v0, "addressui"

    .line 46
    .line 47
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_6

    .line 52
    .line 53
    const-string v0, "contact"

    .line 54
    .line 55
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const-string v0, "profile"

    .line 63
    .line 64
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    sget-object p0, Ld9/a;->j:Ld9/a;

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_3
    const-string v0, "sns"

    .line 74
    .line 75
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    const-string v0, "moments"

    .line 82
    .line 83
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-eqz p0, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    sget-object p0, Ld9/a;->l:Ld9/a;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_5
    :goto_0
    sget-object p0, Ld9/a;->k:Ld9/a;

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_6
    :goto_1
    sget-object p0, Ld9/a;->i:Ld9/a;

    .line 97
    .line 98
    return-object p0
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

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
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    const-string v0, ""

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    move-object p0, v0

    .line 18
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    goto :goto_5

    .line 25
    :cond_2
    const-string v1, "#"

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-static {p0, v1, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :goto_1
    const/4 v3, 0x1

    .line 40
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/4 v5, 0x6

    .line 49
    if-eq v4, v5, :cond_4

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    const/16 v5, 0x8

    .line 56
    .line 57
    if-ne v4, v5, :cond_8

    .line 58
    .line 59
    :cond_4
    move v4, v2

    .line 60
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-ge v4, v5, :cond_a

    .line 65
    .line 66
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    const/16 v6, 0x30

    .line 71
    .line 72
    if-gt v6, v5, :cond_5

    .line 73
    .line 74
    const/16 v6, 0x3a

    .line 75
    .line 76
    if-ge v5, v6, :cond_5

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    const/16 v6, 0x61

    .line 80
    .line 81
    if-gt v6, v5, :cond_6

    .line 82
    .line 83
    const/16 v6, 0x67

    .line 84
    .line 85
    if-ge v5, v6, :cond_6

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    const/16 v6, 0x41

    .line 89
    .line 90
    if-gt v6, v5, :cond_7

    .line 91
    .line 92
    const/16 v6, 0x47

    .line 93
    .line 94
    if-ge v5, v6, :cond_7

    .line 95
    .line 96
    :goto_3
    move v5, v3

    .line 97
    goto :goto_4

    .line 98
    :cond_7
    move v5, v2

    .line 99
    :goto_4
    if-nez v5, :cond_9

    .line 100
    .line 101
    :cond_8
    :goto_5
    return-object v0

    .line 102
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_a
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
.end method

.method public static j(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

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
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    const-string v0, ""

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    move-object p0, v0

    .line 18
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    goto :goto_4

    .line 25
    :cond_2
    const/4 v1, 0x3

    .line 26
    new-array v1, v1, [C

    .line 27
    .line 28
    fill-array-data v1, :array_0

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x6

    .line 32
    invoke-static {p0, v1, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v2}, La7/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_6

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    move-object v3, v2

    .line 89
    check-cast v3, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-lez v3, :cond_5

    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    goto :goto_3

    .line 99
    :cond_5
    const/4 v3, 0x0

    .line 100
    :goto_3
    if-eqz v3, :cond_4

    .line 101
    .line 102
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    const/4 v1, 0x2

    .line 107
    invoke-static {v1, p0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-eqz p0, :cond_7

    .line 116
    .line 117
    :goto_4
    return-object v0

    .line 118
    :cond_7
    const/4 v6, 0x0

    .line 119
    const/16 v7, 0x3e

    .line 120
    .line 121
    const-string v3, ","

    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v5, 0x0

    .line 125
    invoke-static/range {v2 .. v7}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    nop

    .line 131
    :array_0
    .array-data 2
        0x2cs
        0x2ds
        -0xf4s
    .end array-data
.end method

.method public static k(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    const/16 v0, 0xa

    .line 6
    .line 7
    const/16 v1, 0x20

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/16 v0, 0xd

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x9

    .line 26
    .line 27
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const/16 v0, 0x8

    .line 43
    .line 44
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static final l(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Landroid/app/Activity;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Landroid/app/Activity;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p0, v1

    .line 13
    :goto_0
    if-eqz p0, :cond_6

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-object p0, v1

    .line 27
    :goto_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p0, Landroid/view/ViewGroup;

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move-object p0, v1

    .line 35
    :goto_2
    if-eqz p0, :cond_6

    .line 36
    .line 37
    invoke-static {p0}, La7/a;->s(Landroid/view/ViewGroup;)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_6

    .line 42
    .line 43
    const v0, 0x7f060042

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    instance-of v0, p0, Lwb/o6;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    move-object v1, p0

    .line 55
    check-cast v1, Lwb/o6;

    .line 56
    .line 57
    :cond_3
    if-eqz v1, :cond_6

    .line 58
    .line 59
    iget-boolean p0, v1, Lwb/o6;->a:Z

    .line 60
    .line 61
    if-nez p0, :cond_4

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_4
    iget-object p0, v1, Lwb/o6;->c:Lfg/a;

    .line 65
    .line 66
    if-eqz p0, :cond_5

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_5
    iget-object p0, v1, Lwb/o6;->b:Lwb/f6;

    .line 70
    .line 71
    :goto_3
    if-eqz p0, :cond_6

    .line 72
    .line 73
    invoke-interface {p0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_6
    :goto_4
    return-void
.end method

.method public static m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0

    .line 1
    if-nez p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_1
    if-nez p1, :cond_2

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_2
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static n(Lnc/a;)Ljava/lang/Object;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lnc/a;->h:Ljava/lang/Object;

    .line 5
    .line 6
    iget p0, p0, Lnc/a;->g:I

    .line 7
    .line 8
    invoke-static {p0}, Lt3/c;->b(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :goto_0
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_1
    check-cast v0, Ljava/lang/String;

    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    check-cast v0, Ljava/lang/Double;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    sget-object p0, Lqd/j;->h:Lqd/g;

    .line 40
    .line 41
    invoke-static {v0, v1, p0}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_3
    check-cast v0, Ljava/lang/Float;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    int-to-long v0, p0

    .line 57
    sget-object p0, Lqd/j;->g:Lqd/g;

    .line 58
    .line 59
    invoke-static {v0, v1, p0}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :pswitch_4
    check-cast v0, Ljava/lang/Long;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    sget-object p0, Lqd/j;->i:Lqd/g;

    .line 71
    .line 72
    invoke-static {v0, v1, p0}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_5
    check-cast v0, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    int-to-long v0, p0

    .line 84
    sget-object p0, Lqd/j;->b:Lqd/g;

    .line 85
    .line 86
    invoke-static {v0, v1, p0}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_6
    check-cast v0, Ljava/lang/Character;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    int-to-long v0, p0

    .line 98
    sget-object p0, Lqd/j;->f:Lqd/g;

    .line 99
    .line 100
    invoke-static {v0, v1, p0}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :pswitch_7
    check-cast v0, Ljava/lang/Short;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    int-to-long v0, p0

    .line 112
    sget-object p0, Lqd/j;->e:Lqd/g;

    .line 113
    .line 114
    invoke-static {v0, v1, p0}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :pswitch_8
    check-cast v0, Ljava/lang/Byte;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    int-to-long v0, p0

    .line 126
    sget-object p0, Lqd/j;->d:Lqd/g;

    .line 127
    .line 128
    invoke-static {v0, v1, p0}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_9
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {p0, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eqz p0, :cond_1

    .line 140
    .line 141
    new-instance p0, Lqd/n;

    .line 142
    .line 143
    const-wide/16 v0, 0x1

    .line 144
    .line 145
    sget-object v2, Lqd/j;->c:Lqd/g;

    .line 146
    .line 147
    invoke-direct {p0, v0, v1, v2}, Lqd/n;-><init>(JLqd/j;)V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :cond_1
    new-instance p0, Lqd/n;

    .line 152
    .line 153
    sget-object v0, Lqd/j;->c:Lqd/g;

    .line 154
    .line 155
    invoke-direct {p0, v1, v2, v0}, Lqd/n;-><init>(JLqd/j;)V

    .line 156
    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_a
    sget-object p0, Lqd/j;->k:Lqd/e;

    .line 160
    .line 161
    invoke-static {v1, v2, p0}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    nop

    .line 167
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
.end method

.method public static o(Lud/u;Lnc/a;)Lqd/l;
    .locals 6

    .line 1
    iget-object v0, p1, Lnc/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p1, Lnc/a;->g:I

    .line 4
    .line 5
    invoke-static {v1}, Lt3/c;->b(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0xe

    .line 10
    .line 11
    if-eq v2, v3, :cond_3

    .line 12
    .line 13
    const/16 v3, 0xf

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    packed-switch v2, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lj8/b;->w(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, "Unsupported type for raw invoke-custom: "

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v4

    .line 35
    :pswitch_0
    new-instance p0, Lpd/c;

    .line 36
    .line 37
    check-cast v0, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v0}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1}, Lpd/c;-><init>(Lqd/j;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_1
    new-instance p0, Lpd/d;

    .line 52
    .line 53
    check-cast v0, Ljava/lang/String;

    .line 54
    .line 55
    invoke-direct {p0, v0}, Lpd/d;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_2
    check-cast v0, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_0

    .line 70
    .line 71
    const-wide/16 p0, 0x0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const-wide/16 p0, 0x1

    .line 75
    .line 76
    :goto_0
    sget-object v0, Lqd/j;->c:Lqd/g;

    .line 77
    .line 78
    invoke-static {p0, p1, v0}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_3
    invoke-static {p1}, La7/a;->n(Lnc/a;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Lqd/l;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_1
    check-cast v0, Lqc/d;

    .line 91
    .line 92
    invoke-virtual {v0}, Lqc/d;->b()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-static {p1}, Lj8/b;->a(I)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_2

    .line 101
    .line 102
    new-instance p0, Lpd/d;

    .line 103
    .line 104
    iget p1, v0, Lqc/d;->a:I

    .line 105
    .line 106
    packed-switch p1, :pswitch_data_1

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_4
    iget-object p1, v0, Lqc/d;->c:Ljava/lang/Object;

    .line 111
    .line 112
    move-object v4, p1

    .line 113
    check-cast v4, Ljf/d;

    .line 114
    .line 115
    :goto_1
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    const-string v0, "FIELD:"

    .line 120
    .line 121
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {p0, p1}, Lpd/d;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_3

    .line 129
    .line 130
    :cond_2
    invoke-virtual {v0}, Lqc/d;->a()Ljf/h;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, Ljf/h;->a()V

    .line 135
    .line 136
    .line 137
    const-string v1, "java.lang.invoke.MethodHandles.Lookup"

    .line 138
    .line 139
    invoke-static {v1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-static {p0, v1}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v0}, Lqc/d;->b()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    invoke-static {v0}, Lt3/c;->b(I)I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    packed-switch v2, :pswitch_data_2

    .line 156
    .line 157
    .line 158
    invoke-static {v0}, Lj8/b;->v(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const-string v2, "<"

    .line 163
    .line 164
    const-string v3, ">"

    .line 165
    .line 166
    invoke-static {v2, v0, v3}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    goto :goto_2

    .line 171
    :pswitch_5
    const-string v0, "findConstructor"

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :pswitch_6
    const-string v0, "findVirtual"

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :pswitch_7
    const-string v0, "findStatic"

    .line 178
    .line 179
    :goto_2
    const-string v2, "java.lang.invoke.MethodType"

    .line 180
    .line 181
    invoke-static {v2}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    const/4 v3, 0x3

    .line 186
    new-array v3, v3, [Lqd/j;

    .line 187
    .line 188
    sget-object v4, Lqd/j;->l:Lqd/e;

    .line 189
    .line 190
    const/4 v5, 0x0

    .line 191
    aput-object v4, v3, v5

    .line 192
    .line 193
    sget-object v4, Lqd/j;->m:Lqd/e;

    .line 194
    .line 195
    const/4 v5, 0x1

    .line 196
    aput-object v4, v3, v5

    .line 197
    .line 198
    const/4 v4, 0x2

    .line 199
    aput-object v2, v3, v4

    .line 200
    .line 201
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    const-string v3, "java.lang.invoke.MethodHandle"

    .line 206
    .line 207
    invoke-static {v3}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-static {p0, v1, v0, v2, v3}, Lod/d;->b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    new-instance v1, Lpd/n;

    .line 216
    .line 217
    const/4 v2, 0x4

    .line 218
    invoke-direct {v1, v0, v4, v2}, Lpd/n;-><init>(Lod/d;II)V

    .line 219
    .line 220
    .line 221
    invoke-static {p0}, La7/a;->f(Lud/u;)Lqd/m;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v1, v0}, Lud/p;->I(Lqd/l;)V

    .line 226
    .line 227
    .line 228
    new-instance v0, Lpd/c;

    .line 229
    .line 230
    iget-object v2, p1, Ljf/h;->c:Ljava/lang/String;

    .line 231
    .line 232
    invoke-static {v2}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-direct {v0, v2}, Lpd/c;-><init>(Lqd/j;)V

    .line 237
    .line 238
    .line 239
    invoke-static {v0}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v1, v0}, Lud/p;->I(Lqd/l;)V

    .line 244
    .line 245
    .line 246
    new-instance v0, Lpd/d;

    .line 247
    .line 248
    iget-object v2, p1, Ljf/h;->b:Ljava/lang/String;

    .line 249
    .line 250
    invoke-direct {v0, v2}, Lpd/d;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v0}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v1, v0}, Lud/p;->I(Lqd/l;)V

    .line 258
    .line 259
    .line 260
    invoke-static {p0, p1}, La7/a;->g(Lud/u;Lmc/a;)Lpd/n;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-static {p0}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    invoke-virtual {v1, p0}, Lud/p;->I(Lqd/l;)V

    .line 269
    .line 270
    .line 271
    move-object p0, v1

    .line 272
    :goto_3
    invoke-static {p0}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    return-object p0

    .line 277
    :cond_3
    check-cast v0, Lmc/a;

    .line 278
    .line 279
    invoke-static {p0, v0}, La7/a;->g(Lud/u;Lmc/a;)Lpd/n;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-static {p0}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    return-object p0

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
    .end packed-switch

    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    :pswitch_data_2
    .packed-switch 0x4
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public static p(La1/i;Landroid/util/LongSparseArray;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/util/LongSparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/util/LongSparseArray;->keyAt(I)J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    invoke-virtual {p1, v2, v3}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-static {v4}, La1/c;->r(Ljava/lang/Object;)Landroid/view/translation/ViewTranslationResponse;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    invoke-static {v4}, La1/c;->o(Landroid/view/translation/ViewTranslationResponse;)Landroid/view/translation/TranslationResponseValue;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    invoke-static {v4}, La1/c;->s(Landroid/view/translation/TranslationResponseValue;)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, La1/i;->h()Lf/k;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    long-to-int v2, v2

    .line 39
    invoke-virtual {v5, v2}, Lf/k;->b(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lf2/r;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget-object v2, v2, Lf2/r;->a:Lf2/q;

    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    iget-object v2, v2, Lf2/q;->d:Lf2/m;

    .line 52
    .line 53
    sget-object v3, Lf2/l;->l:Lf2/x;

    .line 54
    .line 55
    iget-object v2, v2, Lf2/m;->g:Lf/k0;

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-nez v2, :cond_0

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    :cond_0
    check-cast v2, Lf2/a;

    .line 65
    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    iget-object v2, v2, Lf2/a;->b:Lsf/b;

    .line 69
    .line 70
    check-cast v2, Lfg/l;

    .line 71
    .line 72
    if-eqz v2, :cond_1

    .line 73
    .line 74
    new-instance v3, Li2/g;

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-direct {v3, v4}, Li2/g;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v2, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ljava/lang/Boolean;

    .line 88
    .line 89
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    return-void
.end method

.method public static final q(Ljava/util/List;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v3, v2

    .line 29
    check-cast v3, Lna/i;

    .line 30
    .line 31
    iget-object v2, v3, Lna/i;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-lez v2, :cond_0

    .line 46
    .line 47
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const/4 v8, 0x0

    .line 64
    const/16 v9, 0x7c

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    invoke-static/range {v3 .. v9}, Lna/i;->a(Lna/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)Lna/i;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    check-cast p0, Ljava/lang/Iterable;

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lna/i;

    .line 100
    .line 101
    new-instance v2, Lorg/json/JSONObject;

    .line 102
    .line 103
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 104
    .line 105
    .line 106
    iget-object v3, v1, Lna/i;->b:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v3}, La7/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const-string v4, "id"

    .line 113
    .line 114
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    const-string v3, "targetId"

    .line 118
    .line 119
    iget-object v4, v1, Lna/i;->b:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    const-string v3, "label"

    .line 125
    .line 126
    iget-object v4, v1, Lna/i;->c:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    const-string v3, "enabled"

    .line 132
    .line 133
    iget-boolean v4, v1, Lna/i;->d:Z

    .line 134
    .line 135
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    const-string v3, "templateId"

    .line 139
    .line 140
    iget-object v4, v1, Lna/i;->e:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 143
    .line 144
    .line 145
    const-string v3, "customRules"

    .line 146
    .line 147
    iget-boolean v4, v1, Lna/i;->f:Z

    .line 148
    .line 149
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 150
    .line 151
    .line 152
    iget-object v1, v1, Lna/i;->g:Lna/j;

    .line 153
    .line 154
    if-eqz v1, :cond_2

    .line 155
    .line 156
    const-string v3, "overrideRule"

    .line 157
    .line 158
    invoke-static {v1}, La7/a;->U(Lna/j;)Lorg/json/JSONObject;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    :cond_2
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_3
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    return-object p0
.end method

.method public static final r(Ljava/util/List;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lna/h;

    .line 24
    .line 25
    iget v2, v1, Lna/h;->b:I

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v2, Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v3, v1, Lna/h;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :cond_1
    const-string v4, "id"

    .line 52
    .line 53
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    const-string v3, "mode"

    .line 57
    .line 58
    iget v4, v1, Lna/h;->b:I

    .line 59
    .line 60
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    const-string v3, "content"

    .line 64
    .line 65
    iget-object v4, v1, Lna/h;->c:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    iget-wide v3, v1, Lna/h;->d:J

    .line 71
    .line 72
    const-wide/16 v5, 0x0

    .line 73
    .line 74
    cmp-long v7, v3, v5

    .line 75
    .line 76
    if-gez v7, :cond_2

    .line 77
    .line 78
    move-wide v3, v5

    .line 79
    :cond_2
    const-string v5, "delayMs"

    .line 80
    .line 81
    invoke-virtual {v2, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    const-string v3, "random"

    .line 85
    .line 86
    iget-boolean v1, v1, Lna/h;->e:Z

    .line 87
    .line 88
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    return-object p0
.end method

.method public static s(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    const/4 v1, -0x1

    .line 8
    if-lt v1, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "Hchat:MiuixSettingsPage"

    .line 21
    .line 22
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    goto :goto_0
.end method

.method public static t(Ljava/lang/Object;)Ld9/a;
    .locals 6

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    if-eqz v1, :cond_2

    .line 25
    .line 26
    const-class v3, Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    if-ge v2, v3, :cond_2

    .line 36
    .line 37
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/reflect/Field;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-static {v4, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    if-eqz v4, :cond_0

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    invoke-static {v0}, La7/a;->h(Ljava/util/ArrayList;)Ld9/a;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_3
    sget-object p0, Ld9/a;->l:Ld9/a;

    .line 99
    .line 100
    return-object p0
.end method

.method public static u(B)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v0, 0x2

    .line 6
    if-ne p0, v0, :cond_1

    .line 7
    .line 8
    return v0

    .line 9
    :cond_1
    const/4 v0, 0x3

    .line 10
    if-ne p0, v0, :cond_2

    .line 11
    .line 12
    return v0

    .line 13
    :cond_2
    const/4 v0, 0x4

    .line 14
    if-ne p0, v0, :cond_3

    .line 15
    .line 16
    return v0

    .line 17
    :cond_3
    const/4 v0, 0x5

    .line 18
    if-ne p0, v0, :cond_4

    .line 19
    .line 20
    return v0

    .line 21
    :cond_4
    const/4 v0, 0x6

    .line 22
    if-ne p0, v0, :cond_5

    .line 23
    .line 24
    return v0

    .line 25
    :cond_5
    const/4 v0, 0x7

    .line 26
    if-ne p0, v0, :cond_6

    .line 27
    .line 28
    return v0

    .line 29
    :cond_6
    const/16 v0, 0x8

    .line 30
    .line 31
    if-ne p0, v0, :cond_7

    .line 32
    .line 33
    return v0

    .line 34
    :cond_7
    const/16 v0, 0x9

    .line 35
    .line 36
    if-ne p0, v0, :cond_8

    .line 37
    .line 38
    return v0

    .line 39
    :cond_8
    const/16 v0, 0xa

    .line 40
    .line 41
    if-ne p0, v0, :cond_9

    .line 42
    .line 43
    return v0

    .line 44
    :cond_9
    const/16 v0, 0xb

    .line 45
    .line 46
    if-ne p0, v0, :cond_a

    .line 47
    .line 48
    return v0

    .line 49
    :cond_a
    const/16 v0, 0xc

    .line 50
    .line 51
    if-ne p0, v0, :cond_b

    .line 52
    .line 53
    return v0

    .line 54
    :cond_b
    const/16 v0, 0xd

    .line 55
    .line 56
    if-ne p0, v0, :cond_c

    .line 57
    .line 58
    return v0

    .line 59
    :cond_c
    const/16 v0, 0xe

    .line 60
    .line 61
    if-ne p0, v0, :cond_d

    .line 62
    .line 63
    return v0

    .line 64
    :cond_d
    const/16 v0, 0xf

    .line 65
    .line 66
    if-ne p0, v0, :cond_e

    .line 67
    .line 68
    return v0

    .line 69
    :cond_e
    and-int/lit16 p0, p0, 0xff

    .line 70
    .line 71
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string v0, "Unknown AnnotationEncodeValueType: "

    .line 76
    .line 77
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    return p0
.end method

.method public static v(Lud/e;)Lbc/d;
    .locals 3

    .line 1
    sget-object v0, Lmd/a;->s:Lmd/a;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lbc/d;->a:Lfc/e;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v0, p0, Lud/e;->k:Lud/u;

    .line 15
    .line 16
    iget-object v0, v0, Lud/u;->a:Lbc/g;

    .line 17
    .line 18
    iget v1, v0, Lbc/g;->U:I

    .line 19
    .line 20
    invoke-static {v1}, Lt3/c;->b(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    if-ne v1, v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Lgd/b;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lgd/b;-><init>(Lud/e;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lfd/b;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v1, v0, v2}, Lfd/b;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v1}, La7/a;->X(Lud/e;Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/lang/String;

    .line 45
    .line 46
    new-instance v0, Lfc/e;

    .line 47
    .line 48
    invoke-direct {v0, p0}, Lfc/e;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_1
    const-string p0, "Unknown output format"

    .line 53
    .line 54
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0

    .line 59
    :cond_2
    new-instance v1, Lfd/a;

    .line 60
    .line 61
    invoke-direct {v1, p0, v0}, Lfd/a;-><init>(Lud/e;Lbc/g;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lfd/b;

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    invoke-direct {v0, v1, v2}, Lfd/b;-><init>(Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v0}, La7/a;->X(Lud/e;Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lbc/d;

    .line 75
    .line 76
    return-object p0
.end method

.method public static final w(Landroid/view/View;)Lk3/a;
    .locals 2

    .line 1
    const v0, 0x7f060058

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lk3/a;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lk3/a;

    .line 13
    .line 14
    invoke-direct {v1}, Lk3/a;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-object v1
.end method

.method public static final x(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    const-string p1, "No valid saved state was found for the key \'"

    .line 9
    .line 10
    const-string v0, "\'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."

    .line 11
    .line 12
    invoke-static {p1, p0, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public static final y(Li2/k0;I)Lt2/j;
    .locals 4

    .line 1
    iget-object v0, p0, Li2/k0;->a:Li2/j0;

    .line 2
    .line 3
    iget-object v1, p0, Li2/k0;->b:Li2/o;

    .line 4
    .line 5
    iget-object v2, v0, Li2/j0;->a:Li2/g;

    .line 6
    .line 7
    iget-object v2, v2, Li2/g;->h:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1, p1}, Li2/o;->d(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    add-int/lit8 v3, p1, -0x1

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Li2/o;->d(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eq v2, v3, :cond_2

    .line 29
    .line 30
    :cond_1
    iget-object v0, v0, Li2/j0;->a:Li2/g;

    .line 31
    .line 32
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eq p1, v0, :cond_3

    .line 39
    .line 40
    add-int/lit8 v0, p1, 0x1

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Li2/o;->d(I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eq v2, v0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {p0, p1}, Li2/k0;->a(I)Lt2/j;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, Li2/k0;->h(I)Lt2/j;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static z(ILjava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-static {p1}, La7/a;->O(Ljava/lang/Object;)Lia/v;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget v0, p1, Lia/v;->b:I

    .line 8
    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    iget p0, p1, Lia/v;->c:I

    .line 12
    .line 13
    const/high16 p1, -0x40000000    # -2.0f

    .line 14
    .line 15
    and-int/2addr p0, p1

    .line 16
    const/high16 p1, -0x80000000

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method


# virtual methods
.method public abstract D(Ljava/lang/Throwable;)V
.end method

.method public abstract E(Lhb/c;)V
.end method
