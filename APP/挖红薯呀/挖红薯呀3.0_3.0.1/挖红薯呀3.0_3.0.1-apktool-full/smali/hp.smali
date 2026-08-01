.class public final Lhp;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhp$a;
    }
.end annotation


# static fields
.field public static final a:Lhp;

.field private static final b:Ljava/lang/String; = "DL"

.field private static final c:Ljava/util/concurrent/ExecutorService;

.field private static final d:Lu60;

.field private static volatile e:Z

.field private static f:Lkp;

.field public static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhp;

    .line 2
    .line 3
    invoke-direct {v0}, Lhp;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lhp;->a:Lhp;

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lhp;->c:Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    new-instance v0, Lqn;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, v1}, Lqn;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lx51;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 24
    .line 25
    .line 26
    sput-object v1, Lhp;->d:Lu60;

    .line 27
    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    sput v0, Lhp;->g:I

    .line 31
    .line 32
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final A(Ljava/util/List;Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    if-eqz v4, :cond_2

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    add-int/lit8 v5, v3, 0x1

    .line 19
    .line 20
    if-ltz v3, :cond_1

    .line 21
    .line 22
    check-cast v4, Lhp$a;

    .line 23
    .line 24
    sget-object v6, Lhp;->a:Lhp;

    .line 25
    .line 26
    invoke-virtual {v4}, Lhp$a;->e()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-virtual {v4}, Lhp$a;->f()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-direct {v6, p1, v7, v4, v3}, Lhp;->H(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    :cond_0
    move v3, v5

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {}, Lo30;->A()V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    throw p0

    .line 49
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-ne v2, v0, :cond_3

    .line 54
    .line 55
    sget-object p0, Lhp;->a:Lhp;

    .line 56
    .line 57
    const-string v0, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 58
    .line 59
    invoke-direct {p0, p1, v0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    sget-object v0, Lhp;->a:Lhp;

    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    const-string v3, "\u5df2\u4e0b\u8f7d "

    .line 70
    .line 71
    const-string v4, "/"

    .line 72
    .line 73
    invoke-static {v2, p0, v3, v4}, Lt1;->k(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-direct {v0, p1, p0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    sput-boolean v1, Lhp;->e:Z

    .line 81
    .line 82
    return-void
.end method

.method private static final B(Ljava/util/List;Landroid/content/Context;)V
    .locals 20

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v2, "DL"

    .line 4
    .line 5
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v3, v0

    .line 10
    const-wide/16 v5, 0x64

    .line 11
    .line 12
    mul-long v11, v3, v5

    .line 13
    .line 14
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/4 v0, 0x1

    .line 19
    const/4 v13, 0x0

    .line 20
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    if-eqz v7, :cond_4

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    add-int/lit8 v14, v13, 0x1

    .line 31
    .line 32
    if-ltz v13, :cond_3

    .line 33
    .line 34
    move-object v15, v7

    .line 35
    check-cast v15, Lhp$a;

    .line 36
    .line 37
    sget-object v7, Lhp;->a:Lhp;

    .line 38
    .line 39
    invoke-direct {v7}, Lhp;->X()Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-eqz v8, :cond_0

    .line 44
    .line 45
    move-wide/from16 v16, v5

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_0
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    const-string v9, "Live\u56fe "

    .line 56
    .line 57
    const-string v10, "/"

    .line 58
    .line 59
    invoke-static {v14, v8, v9, v10}, Lt1;->k(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    move-wide/from16 v16, v5

    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    int-to-long v4, v13

    .line 67
    mul-long v4, v4, v16

    .line 68
    .line 69
    move-wide/from16 v18, v4

    .line 70
    .line 71
    move-object v5, v9

    .line 72
    move-object v4, v10

    .line 73
    move-wide/from16 v9, v18

    .line 74
    .line 75
    invoke-direct/range {v7 .. v12}, Lhp;->d0(Ljava/lang/String;JJ)V

    .line 76
    .line 77
    .line 78
    :try_start_0
    invoke-virtual {v15}, Lhp$a;->e()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-virtual {v15}, Lhp$a;->f()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-direct {v7, v1, v8, v9, v13}, Lhp;->H(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-nez v7, :cond_1

    .line 91
    .line 92
    sget-object v0, Llb0;->a:Llb0;

    .line 93
    .line 94
    new-instance v7, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v8, "batch live fail idx="

    .line 100
    .line 101
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v0, v2, v7}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    .line 113
    .line 114
    :goto_1
    move v0, v6

    .line 115
    goto :goto_2

    .line 116
    :catch_0
    move-exception v0

    .line 117
    sget-object v7, Llb0;->a:Llb0;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    new-instance v8, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v9, "batch live exc idx="

    .line 126
    .line 127
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v9, ": "

    .line 134
    .line 135
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v7, v2, v0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_1
    :goto_2
    sget-object v7, Lhp;->a:Lhp;

    .line 150
    .line 151
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    invoke-static {v14, v8, v5, v4}, Lt1;->k(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    int-to-long v4, v14

    .line 160
    mul-long v9, v4, v16

    .line 161
    .line 162
    invoke-direct/range {v7 .. v12}, Lhp;->d0(Ljava/lang/String;JJ)V

    .line 163
    .line 164
    .line 165
    invoke-direct {v7}, Lhp;->X()Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_2

    .line 170
    .line 171
    move v0, v6

    .line 172
    :cond_2
    :goto_3
    move v13, v14

    .line 173
    move-wide/from16 v5, v16

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_3
    invoke-static {}, Lo30;->A()V

    .line 178
    .line 179
    .line 180
    const/4 v0, 0x0

    .line 181
    throw v0

    .line 182
    :cond_4
    const/4 v6, 0x0

    .line 183
    sget-object v2, Lhp;->a:Lhp;

    .line 184
    .line 185
    invoke-direct {v2, v0}, Lhp;->s(Z)V

    .line 186
    .line 187
    .line 188
    if-eqz v0, :cond_5

    .line 189
    .line 190
    const-string v0, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 191
    .line 192
    :goto_4
    invoke-direct {v2, v1, v0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_5
    invoke-direct {v2}, Lhp;->X()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_6

    .line 201
    .line 202
    const-string v0, "\u5df2\u53d6\u6d88\u4e0b\u8f7d"

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_6
    const-string v0, "\u4e0b\u8f7d\u5931\u8d25"

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :goto_5
    sput-boolean v6, Lhp;->e:Z

    .line 209
    .line 210
    return-void
.end method

.method private static final D(Ljava/lang/String;IZLandroid/content/Context;JLjava/lang/String;I)V
    .locals 16

    .line 1
    move/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    move-wide/from16 v3, p4

    .line 6
    .line 7
    const-string v5, "DL"

    .line 8
    .line 9
    const-string v6, "\u4e0b\u8f7d\u5931\u8d25"

    .line 10
    .line 11
    const-string v0, "whs-"

    .line 12
    .line 13
    const-string v7, "img fail HTTP "

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    :try_start_0
    new-instance v9, Ljava/net/URL;

    .line 17
    .line 18
    move-object/from16 v10, p0

    .line 19
    .line 20
    invoke-direct {v9, v10}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast v9, Ljava/net/HttpURLConnection;

    .line 31
    .line 32
    const/16 v10, 0x2710

    .line 33
    .line 34
    invoke-virtual {v9, v10}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 35
    .line 36
    .line 37
    const v10, 0xea60

    .line 38
    .line 39
    .line 40
    invoke-virtual {v9, v10}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 41
    .line 42
    .line 43
    const/4 v10, 0x1

    .line 44
    invoke-virtual {v9, v10}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v9}, Ljava/net/URLConnection;->connect()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 51
    .line 52
    .line 53
    move-result v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    const/16 v12, 0xc8

    .line 55
    .line 56
    const-string v13, "\u5df2\u53d6\u6d88\u4e0b\u8f7d"

    .line 57
    .line 58
    if-eq v11, v12, :cond_3

    .line 59
    .line 60
    :try_start_1
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 61
    .line 62
    .line 63
    sget-object v0, Llb0;->a:Llb0;

    .line 64
    .line 65
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    new-instance v4, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v3, " pos="

    .line 78
    .line 79
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v0, v5, v3}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    if-eqz p2, :cond_1

    .line 93
    .line 94
    sget-object v0, Lhp;->a:Lhp;

    .line 95
    .line 96
    invoke-direct {v0, v8}, Lhp;->s(Z)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v0}, Lhp;->X()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_0

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    move-object v13, v6

    .line 107
    :goto_0
    invoke-direct {v0, v2, v13}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    goto/16 :goto_9

    .line 113
    .line 114
    :catch_0
    move-exception v0

    .line 115
    goto/16 :goto_7

    .line 116
    .line 117
    :cond_1
    sget-object v0, Lhp;->a:Lhp;

    .line 118
    .line 119
    invoke-direct {v0}, Lhp;->X()Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_2

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    move-object v13, v6

    .line 127
    :goto_1
    invoke-direct {v0, v2, v13}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .line 129
    .line 130
    :goto_2
    sput-boolean v8, Lhp;->e:Z

    .line 131
    .line 132
    return-void

    .line 133
    :cond_3
    :try_start_2
    invoke-virtual {v9}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    if-nez v7, :cond_4

    .line 138
    .line 139
    const-string v7, "image/jpeg"

    .line 140
    .line 141
    :cond_4
    sget-object v11, Lhp;->a:Lhp;

    .line 142
    .line 143
    invoke-direct {v11, v7}, Lhp;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    invoke-direct {v11, v7}, Lhp;->S(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-direct {v11, v2}, Lhp;->T(Landroid/content/Context;)Ljava/io/File;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    new-instance v15, Ljava/io/File;

    .line 156
    .line 157
    new-instance v10, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v10, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v0, "-"

    .line 166
    .line 167
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v0, "."

    .line 174
    .line 175
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-direct {v15, v14, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    new-instance v0, Ljava/io/FileOutputStream;

    .line 189
    .line 190
    invoke-direct {v0, v15}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 191
    .line 192
    .line 193
    if-eqz p2, :cond_5

    .line 194
    .line 195
    move-object/from16 v10, p6

    .line 196
    .line 197
    invoke-direct {v11, v9, v0, v10}, Lhp;->r(Ljava/net/HttpURLConnection;Ljava/io/FileOutputStream;Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    goto :goto_4

    .line 202
    :cond_5
    invoke-virtual {v9}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    const/16 v11, 0x2000

    .line 207
    .line 208
    new-array v11, v11, [B

    .line 209
    .line 210
    invoke-virtual {v10, v11}, Ljava/io/InputStream;->read([B)I

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    :goto_3
    const/4 v14, -0x1

    .line 215
    if-eq v12, v14, :cond_6

    .line 216
    .line 217
    invoke-virtual {v0, v11, v8, v12}, Ljava/io/FileOutputStream;->write([BII)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v10, v11}, Ljava/io/InputStream;->read([B)I

    .line 221
    .line 222
    .line 223
    move-result v12

    .line 224
    goto :goto_3

    .line 225
    :cond_6
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 229
    .line 230
    .line 231
    const/4 v0, 0x1

    .line 232
    :goto_4
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 233
    .line 234
    .line 235
    if-nez v0, :cond_9

    .line 236
    .line 237
    invoke-virtual {v15}, Ljava/io/File;->delete()Z

    .line 238
    .line 239
    .line 240
    if-eqz p2, :cond_8

    .line 241
    .line 242
    sget-object v0, Lhp;->a:Lhp;

    .line 243
    .line 244
    invoke-direct {v0, v8}, Lhp;->s(Z)V

    .line 245
    .line 246
    .line 247
    invoke-direct {v0}, Lhp;->X()Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-eqz v3, :cond_7

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_7
    move-object v13, v6

    .line 255
    :goto_5
    invoke-direct {v0, v2, v13}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 256
    .line 257
    .line 258
    :cond_8
    sput-boolean v8, Lhp;->e:Z

    .line 259
    .line 260
    return-void

    .line 261
    :cond_9
    move/from16 v0, p7

    .line 262
    .line 263
    int-to-long v9, v0

    .line 264
    add-long/2addr v3, v9

    .line 265
    :try_start_3
    invoke-virtual {v15, v3, v4}, Ljava/io/File;->setLastModified(J)Z

    .line 266
    .line 267
    .line 268
    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    filled-new-array {v0}, [Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    filled-new-array {v7}, [Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    new-instance v4, Lcp;

    .line 281
    .line 282
    invoke-direct {v4, v8}, Lcp;-><init>(I)V

    .line 283
    .line 284
    .line 285
    invoke-static {v2, v0, v3, v4}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 286
    .line 287
    .line 288
    const-string v0, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 289
    .line 290
    if-eqz p2, :cond_a

    .line 291
    .line 292
    :try_start_4
    sget-object v3, Lhp;->a:Lhp;

    .line 293
    .line 294
    const/4 v4, 0x1

    .line 295
    invoke-direct {v3, v4}, Lhp;->s(Z)V

    .line 296
    .line 297
    .line 298
    invoke-direct {v3, v2, v0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_a
    sget-object v3, Lhp;->a:Lhp;

    .line 303
    .line 304
    invoke-direct {v3, v2, v0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 305
    .line 306
    .line 307
    :goto_6
    sput-boolean v8, Lhp;->e:Z

    .line 308
    .line 309
    return-void

    .line 310
    :goto_7
    :try_start_5
    sget-object v3, Llb0;->a:Llb0;

    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    new-instance v4, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 319
    .line 320
    .line 321
    const-string v7, "img exc pos="

    .line 322
    .line 323
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    const-string v1, ": "

    .line 330
    .line 331
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-virtual {v3, v5, v0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    if-eqz p2, :cond_b

    .line 345
    .line 346
    sget-object v0, Lhp;->a:Lhp;

    .line 347
    .line 348
    invoke-direct {v0, v8}, Lhp;->s(Z)V

    .line 349
    .line 350
    .line 351
    invoke-direct {v0, v2, v6}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    goto :goto_8

    .line 355
    :cond_b
    sget-object v0, Lhp;->a:Lhp;

    .line 356
    .line 357
    invoke-direct {v0, v2, v6}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 358
    .line 359
    .line 360
    :goto_8
    sput-boolean v8, Lhp;->e:Z

    .line 361
    .line 362
    return-void

    .line 363
    :goto_9
    sput-boolean v8, Lhp;->e:Z

    .line 364
    .line 365
    throw v0
.end method

.method private static final E(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    return-void
.end method

.method private static final G(ZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lhp;->a:Lhp;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p3, p4}, Lhp;->J(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lhp;->a:Lhp;

    .line 11
    .line 12
    invoke-direct {v0, p1, p2, p3, p4}, Lhp;->H(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    :goto_0
    if-eqz p2, :cond_2

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lhp;->a:Lhp;

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-direct {p0, p2}, Lhp;->s(Z)V

    .line 24
    .line 25
    .line 26
    const-string p2, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 27
    .line 28
    invoke-direct {p0, p1, p2}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    sget-object p0, Lhp;->a:Lhp;

    .line 33
    .line 34
    const-string p2, "\u5408\u6210\u5b8c\u6210"

    .line 35
    .line 36
    invoke-direct {p0, p1, p2}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    sget-object p2, Lhp;->a:Lhp;

    .line 41
    .line 42
    invoke-direct {p2}, Lhp;->X()Z

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    const/4 p4, 0x0

    .line 47
    if-eqz p3, :cond_3

    .line 48
    .line 49
    if-eqz p0, :cond_4

    .line 50
    .line 51
    invoke-direct {p2, p4}, Lhp;->s(Z)V

    .line 52
    .line 53
    .line 54
    const-string p0, "\u5df2\u53d6\u6d88\u4e0b\u8f7d"

    .line 55
    .line 56
    invoke-direct {p2, p1, p0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    sget-object p3, Llb0;->a:Llb0;

    .line 61
    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, "live fail pos="

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p5

    .line 76
    const-string v0, "DL"

    .line 77
    .line 78
    invoke-virtual {p3, v0, p5}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    invoke-direct {p2, p4}, Lhp;->s(Z)V

    .line 84
    .line 85
    .line 86
    const-string p0, "\u5408\u6210\u5931\u8d25"

    .line 87
    .line 88
    invoke-direct {p2, p1, p0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    return-void
.end method

.method private final H(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 9

    .line 1
    const-string v0, "_live_tmp_"

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lhp;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    add-int/lit8 v3, p4, 0x1

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    :try_start_0
    new-instance v6, Ljava/io/File;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    const-string v8, "live_temp"

    .line 22
    .line 23
    invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-nez v7, :cond_0

    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    move-object v7, v5

    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :catch_0
    move-object v7, v5

    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_0
    :goto_0
    invoke-direct {p0, p2, v6}, Lhp;->O(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-nez p2, :cond_1

    .line 48
    .line 49
    return v4

    .line 50
    :cond_1
    :try_start_1
    new-instance v7, Ljava/io/File;

    .line 51
    .line 52
    new-instance v8, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ".mp4"

    .line 61
    .line 62
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-direct {v7, v6, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 70
    .line 71
    .line 72
    :try_start_2
    invoke-direct {p0, p3, v7}, Lhp;->N(Ljava/lang/String;Ljava/io/File;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0, p1}, Lhp;->U(Landroid/content/Context;)Ljava/io/File;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    const-string p3, ".jpg"

    .line 80
    .line 81
    const-string v0, "whs-live-"

    .line 82
    .line 83
    if-ltz p4, :cond_2

    .line 84
    .line 85
    :try_start_3
    new-instance p4, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v0, "-"

    .line 94
    .line 95
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    goto :goto_3

    .line 109
    :catchall_1
    move-exception p0

    .line 110
    :goto_1
    move-object v5, p2

    .line 111
    goto :goto_4

    .line 112
    :catch_1
    :goto_2
    move-object v5, p2

    .line 113
    goto :goto_5

    .line 114
    :cond_2
    new-instance p4, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    :goto_3
    new-instance p4, Ljava/io/File;

    .line 130
    .line 131
    invoke-direct {p4, p0, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sget-object p0, Lza0;->a:Lza0;

    .line 135
    .line 136
    invoke-virtual {p0, p1, p2, v7, p4}, Lza0;->c(Landroid/content/Context;Ljava/io/File;Ljava/io/File;Ljava/io/File;)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-eqz p0, :cond_3

    .line 141
    .line 142
    invoke-virtual {p4, v1, v2}, Ljava/io/File;->setLastModified(J)Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {p4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    filled-new-array {p3}, [Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    const-string p4, "image/jpeg"

    .line 154
    .line 155
    filled-new-array {p4}, [Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p4

    .line 159
    new-instance v0, Lcp;

    .line 160
    .line 161
    const/4 v1, 0x1

    .line 162
    invoke-direct {v0, v1}, Lcp;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1, p3, p4, v0}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 166
    .line 167
    .line 168
    :cond_3
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 172
    .line 173
    .line 174
    return p0

    .line 175
    :catchall_2
    move-exception p0

    .line 176
    move-object v7, v5

    .line 177
    goto :goto_1

    .line 178
    :catch_2
    move-object v7, v5

    .line 179
    goto :goto_2

    .line 180
    :goto_4
    if-eqz v5, :cond_4

    .line 181
    .line 182
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 183
    .line 184
    .line 185
    :cond_4
    if-eqz v7, :cond_5

    .line 186
    .line 187
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 188
    .line 189
    .line 190
    :cond_5
    throw p0

    .line 191
    :goto_5
    if-eqz v5, :cond_6

    .line 192
    .line 193
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 194
    .line 195
    .line 196
    :cond_6
    if-eqz v7, :cond_7

    .line 197
    .line 198
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 199
    .line 200
    .line 201
    :cond_7
    return v4
.end method

.method private static final I(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final J(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const-string v7, "live exc pos="

    .line 6
    .line 7
    const-string v8, "_live_tmp_"

    .line 8
    .line 9
    move-object/from16 v1, p2

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lhp;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v10

    .line 19
    add-int/lit8 v12, p4, 0x1

    .line 20
    .line 21
    const/4 v13, 0x0

    .line 22
    const/4 v14, 0x0

    .line 23
    :try_start_0
    const-string v1, "\u4e0b\u8f7d\u56fe\u7247..."

    .line 24
    .line 25
    const-wide/16 v2, 0x5

    .line 26
    .line 27
    const-wide/16 v4, 0x64

    .line 28
    .line 29
    invoke-direct/range {v0 .. v5}, Lhp;->d0(Ljava/lang/String;JJ)V

    .line 30
    .line 31
    .line 32
    new-instance v15, Ljava/io/File;

    .line 33
    .line 34
    invoke-virtual {v6}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "live_temp"

    .line 39
    .line 40
    invoke-direct {v15, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {v15}, Ljava/io/File;->mkdirs()Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object v8, v14

    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :catch_0
    move-exception v0

    .line 58
    move-object v8, v14

    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_0
    :goto_0
    invoke-direct {v0, v9, v15}, Lhp;->O(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 62
    .line 63
    .line 64
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-nez v9, :cond_1

    .line 66
    .line 67
    return v13

    .line 68
    :cond_1
    :try_start_1
    invoke-direct {v0}, Lhp;->X()Z

    .line 69
    .line 70
    .line 71
    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 75
    .line 76
    .line 77
    return v13

    .line 78
    :cond_2
    :try_start_2
    const-string v1, "\u4e0b\u8f7d\u56fe\u7247..."

    .line 79
    .line 80
    const-wide/16 v2, 0x1e

    .line 81
    .line 82
    const-wide/16 v4, 0x64

    .line 83
    .line 84
    invoke-direct/range {v0 .. v5}, Lhp;->d0(Ljava/lang/String;JJ)V

    .line 85
    .line 86
    .line 87
    const-string v1, "\u4e0b\u8f7d\u89c6\u9891..."

    .line 88
    .line 89
    const-wide/16 v2, 0x23

    .line 90
    .line 91
    const-wide/16 v4, 0x64

    .line 92
    .line 93
    move-object/from16 v0, p0

    .line 94
    .line 95
    invoke-direct/range {v0 .. v5}, Lhp;->d0(Ljava/lang/String;JJ)V

    .line 96
    .line 97
    .line 98
    new-instance v1, Ljava/io/File;

    .line 99
    .line 100
    new-instance v2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v3, ".mp4"

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-direct {v1, v15, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 118
    .line 119
    .line 120
    move-object/from16 v2, p3

    .line 121
    .line 122
    :try_start_3
    invoke-direct {v0, v2, v1}, Lhp;->N(Ljava/lang/String;Ljava/io/File;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v0}, Lhp;->X()Z

    .line 126
    .line 127
    .line 128
    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 129
    if-eqz v2, :cond_3

    .line 130
    .line 131
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 135
    .line 136
    .line 137
    return v13

    .line 138
    :cond_3
    move-object v2, v1

    .line 139
    :try_start_4
    const-string v1, "\u4e0b\u8f7d\u89c6\u9891..."
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 140
    .line 141
    move-object v4, v2

    .line 142
    const-wide/16 v2, 0x46

    .line 143
    .line 144
    move-object v8, v4

    .line 145
    const-wide/16 v4, 0x64

    .line 146
    .line 147
    :try_start_5
    invoke-direct/range {v0 .. v5}, Lhp;->d0(Ljava/lang/String;JJ)V

    .line 148
    .line 149
    .line 150
    const-string v1, "\u5408\u6210\u4e2d..."

    .line 151
    .line 152
    const-wide/16 v2, 0x4b

    .line 153
    .line 154
    const-wide/16 v4, 0x64

    .line 155
    .line 156
    move-object/from16 v0, p0

    .line 157
    .line 158
    invoke-direct/range {v0 .. v5}, Lhp;->d0(Ljava/lang/String;JJ)V

    .line 159
    .line 160
    .line 161
    invoke-direct/range {p0 .. p1}, Lhp;->U(Landroid/content/Context;)Ljava/io/File;

    .line 162
    .line 163
    .line 164
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 165
    const-string v1, ".jpg"

    .line 166
    .line 167
    const-string v2, "whs-live-"

    .line 168
    .line 169
    if-ltz p4, :cond_4

    .line 170
    .line 171
    :try_start_6
    new-instance v3, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v2, "-"

    .line 180
    .line 181
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    goto :goto_3

    .line 195
    :catchall_1
    move-exception v0

    .line 196
    :goto_1
    move-object v14, v9

    .line 197
    goto/16 :goto_5

    .line 198
    .line 199
    :catch_1
    move-exception v0

    .line 200
    :goto_2
    move-object v14, v9

    .line 201
    goto/16 :goto_4

    .line 202
    .line 203
    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    :goto_3
    new-instance v14, Ljava/io/File;

    .line 219
    .line 220
    invoke-direct {v14, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    sget-object v0, Lza0;->a:Lza0;

    .line 224
    .line 225
    invoke-virtual {v0, v6, v9, v8, v14}, Lza0;->c(Landroid/content/Context;Ljava/io/File;Ljava/io/File;Ljava/io/File;)Z

    .line 226
    .line 227
    .line 228
    move-result v15

    .line 229
    invoke-direct/range {p0 .. p0}, Lhp;->X()Z

    .line 230
    .line 231
    .line 232
    move-result v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 233
    if-eqz v0, :cond_5

    .line 234
    .line 235
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 236
    .line 237
    .line 238
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 239
    .line 240
    .line 241
    return v13

    .line 242
    :cond_5
    if-eqz v15, :cond_6

    .line 243
    .line 244
    :try_start_7
    const-string v1, "\u5408\u6210\u4e2d..."

    .line 245
    .line 246
    const-wide/16 v2, 0x64

    .line 247
    .line 248
    const-wide/16 v4, 0x64

    .line 249
    .line 250
    move-object/from16 v0, p0

    .line 251
    .line 252
    invoke-direct/range {v0 .. v5}, Lhp;->d0(Ljava/lang/String;JJ)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v14, v10, v11}, Ljava/io/File;->setLastModified(J)Z

    .line 256
    .line 257
    .line 258
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    filled-new-array {v0}, [Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    const-string v1, "image/jpeg"

    .line 267
    .line 268
    filled-new-array {v1}, [Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    new-instance v2, Lcp;

    .line 273
    .line 274
    const/4 v3, 0x3

    .line 275
    invoke-direct {v2, v3}, Lcp;-><init>(I)V

    .line 276
    .line 277
    .line 278
    invoke-static {v6, v0, v1, v2}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 279
    .line 280
    .line 281
    :cond_6
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 282
    .line 283
    .line 284
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 285
    .line 286
    .line 287
    return v15

    .line 288
    :catchall_2
    move-exception v0

    .line 289
    move-object v8, v2

    .line 290
    goto :goto_1

    .line 291
    :catch_2
    move-exception v0

    .line 292
    move-object v8, v2

    .line 293
    goto :goto_2

    .line 294
    :catchall_3
    move-exception v0

    .line 295
    move-object v8, v1

    .line 296
    goto :goto_1

    .line 297
    :catch_3
    move-exception v0

    .line 298
    move-object v8, v1

    .line 299
    goto :goto_2

    .line 300
    :catchall_4
    move-exception v0

    .line 301
    move-object v8, v14

    .line 302
    goto :goto_1

    .line 303
    :catch_4
    move-exception v0

    .line 304
    move-object v8, v14

    .line 305
    goto :goto_2

    .line 306
    :goto_4
    :try_start_8
    sget-object v1, Llb0;->a:Llb0;

    .line 307
    .line 308
    const-string v2, "DL"

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    new-instance v3, Ljava/lang/StringBuilder;

    .line 315
    .line 316
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    const-string v4, ": "

    .line 323
    .line 324
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v1, v2, v0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 335
    .line 336
    .line 337
    if-eqz v14, :cond_7

    .line 338
    .line 339
    invoke-virtual {v14}, Ljava/io/File;->delete()Z

    .line 340
    .line 341
    .line 342
    :cond_7
    if-eqz v8, :cond_8

    .line 343
    .line 344
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 345
    .line 346
    .line 347
    :cond_8
    return v13

    .line 348
    :catchall_5
    move-exception v0

    .line 349
    :goto_5
    if-eqz v14, :cond_9

    .line 350
    .line 351
    invoke-virtual {v14}, Ljava/io/File;->delete()Z

    .line 352
    .line 353
    .line 354
    :cond_9
    if-eqz v8, :cond_a

    .line 355
    .line 356
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 357
    .line 358
    .line 359
    :cond_a
    throw v0
.end method

.method private static final K(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final L(Landroid/content/Context;Ljava/lang/String;I)Z
    .locals 10

    .line 1
    const-string v0, "whs-"

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lhp;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    add-int/lit8 v3, p3, 0x1

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    :try_start_0
    new-instance v5, Ljava/net/URL;

    .line 15
    .line 16
    invoke-direct {v5, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p2, Ljava/net/HttpURLConnection;

    .line 27
    .line 28
    const/16 v5, 0x2710

    .line 29
    .line 30
    invoke-virtual {p2, v5}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 31
    .line 32
    .line 33
    const v5, 0xea60

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v5}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 37
    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    invoke-virtual {p2, v5}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/net/URLConnection;->connect()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const/16 v7, 0xc8

    .line 51
    .line 52
    if-eq v6, v7, :cond_0

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 55
    .line 56
    .line 57
    return v4

    .line 58
    :cond_0
    invoke-virtual {p2}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    if-nez v6, :cond_1

    .line 63
    .line 64
    const-string v6, "image/jpeg"

    .line 65
    .line 66
    :cond_1
    invoke-direct {p0, v6}, Lhp;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-direct {p0, v6}, Lhp;->S(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-direct {p0, p1}, Lhp;->T(Landroid/content/Context;)Ljava/io/File;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance v8, Ljava/io/File;

    .line 79
    .line 80
    new-instance v9, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, "-"

    .line 89
    .line 90
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v0, "."

    .line 97
    .line 98
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-direct {v8, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    new-instance v0, Ljava/io/FileOutputStream;

    .line 116
    .line 117
    invoke-direct {v0, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 118
    .line 119
    .line 120
    const/16 v3, 0x2000

    .line 121
    .line 122
    new-array v3, v3, [B

    .line 123
    .line 124
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    :goto_0
    const/4 v9, -0x1

    .line 129
    if-eq v7, v9, :cond_2

    .line 130
    .line 131
    invoke-virtual {v0, v3, v4, v7}, Ljava/io/FileOutputStream;->write([BII)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    goto :goto_0

    .line 139
    :cond_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 146
    .line 147
    .line 148
    int-to-long p2, p3

    .line 149
    add-long/2addr v1, p2

    .line 150
    invoke-virtual {v8, v1, v2}, Ljava/io/File;->setLastModified(J)Z

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    filled-new-array {p0}, [Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    filled-new-array {v6}, [Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    new-instance p3, Lcp;

    .line 166
    .line 167
    const/4 v0, 0x2

    .line 168
    invoke-direct {p3, v0}, Lcp;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-static {p1, p0, p2, p3}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    .line 173
    .line 174
    return v5

    .line 175
    :catch_0
    return v4
.end method

.method private static final M(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final N(Ljava/lang/String;Ljava/io/File;)V
    .locals 3

    .line 1
    new-instance p0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p0, Ljava/net/HttpURLConnection;

    .line 14
    .line 15
    const/16 p1, 0x2710

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 18
    .line 19
    .line 20
    const p1, 0x1d4c0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/net/URLConnection;->connect()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/16 v0, 0xc8

    .line 38
    .line 39
    if-ne p1, v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v0, Ljava/io/FileOutputStream;

    .line 46
    .line 47
    invoke-direct {v0, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 48
    .line 49
    .line 50
    const/16 p2, 0x2000

    .line 51
    .line 52
    new-array p2, p2, [B

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    :goto_0
    const/4 v2, -0x1

    .line 59
    if-eq v1, v2, :cond_0

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-virtual {v0, p2, v2, v1}, Ljava/io/FileOutputStream;->write([BII)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method private final O(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    .locals 5

    .line 1
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 14
    .line 15
    const/16 v0, 0x2710

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 18
    .line 19
    .line 20
    const v0, 0xea60

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/16 v1, 0xc8

    .line 38
    .line 39
    if-eq v0, v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :cond_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    const-string v0, "image/jpeg"

    .line 53
    .line 54
    :cond_1
    invoke-direct {p0, v0}, Lhp;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance v0, Ljava/io/File;

    .line 59
    .line 60
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    new-instance v3, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v4, "temp_"

    .line 67
    .line 68
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, "."

    .line 75
    .line 76
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-direct {v0, p2, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    new-instance p2, Ljava/io/FileOutputStream;

    .line 94
    .line 95
    invoke-direct {p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 96
    .line 97
    .line 98
    const/16 v1, 0x2000

    .line 99
    .line 100
    new-array v1, v1, [B

    .line 101
    .line 102
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    :goto_0
    const/4 v3, -0x1

    .line 107
    if-eq v2, v3, :cond_2

    .line 108
    .line 109
    const/4 v3, 0x0

    .line 110
    invoke-virtual {p2, v1, v3, v2}, Ljava/io/FileOutputStream;->write([BII)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    goto :goto_0

    .line 118
    :cond_2
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 125
    .line 126
    .line 127
    return-object v0
.end method

.method private static final Q(Ljava/lang/String;ZLandroid/content/Context;Ljava/lang/String;J)V
    .locals 10

    .line 1
    const-string v0, "DL"

    .line 2
    .line 3
    const-string v1, "\u4e0b\u8f7d\u5931\u8d25"

    .line 4
    .line 5
    const-string v2, "video fail HTTP "

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    new-instance v4, Ljava/net/URL;

    .line 9
    .line 10
    invoke-direct {v4, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast p0, Ljava/net/HttpURLConnection;

    .line 21
    .line 22
    const/16 v4, 0x2710

    .line 23
    .line 24
    invoke-virtual {p0, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 25
    .line 26
    .line 27
    const v4, 0x493e0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    invoke-virtual {p0, v4}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 35
    .line 36
    .line 37
    const-string v5, "User-Agent"

    .line 38
    .line 39
    const-string v6, "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36"

    .line 40
    .line 41
    invoke-virtual {p0, v5, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v5, "Referer"

    .line 45
    .line 46
    const-string v6, "https://www.xiaohongshu.com/"

    .line 47
    .line 48
    invoke-virtual {p0, v5, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/net/URLConnection;->connect()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 55
    .line 56
    .line 57
    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    const/16 v6, 0xc8

    .line 59
    .line 60
    const-string v7, "\u5df2\u53d6\u6d88\u4e0b\u8f7d"

    .line 61
    .line 62
    if-eq v5, v6, :cond_3

    .line 63
    .line 64
    :try_start_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 65
    .line 66
    .line 67
    sget-object p3, Llb0;->a:Llb0;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    new-instance p4, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p3, v0, p0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    if-eqz p1, :cond_1

    .line 89
    .line 90
    sget-object p0, Lhp;->a:Lhp;

    .line 91
    .line 92
    invoke-direct {p0, v3}, Lhp;->s(Z)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0}, Lhp;->X()Z

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    if-eqz p3, :cond_0

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    move-object v7, v1

    .line 103
    :goto_0
    invoke-direct {p0, p2, v7}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :catchall_0
    move-exception p0

    .line 108
    goto/16 :goto_9

    .line 109
    .line 110
    :catch_0
    move-exception p0

    .line 111
    goto/16 :goto_7

    .line 112
    .line 113
    :cond_1
    sget-object p0, Lhp;->a:Lhp;

    .line 114
    .line 115
    invoke-direct {p0}, Lhp;->X()Z

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    if-eqz p3, :cond_2

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    move-object v7, v1

    .line 123
    :goto_1
    invoke-direct {p0, p2, v7}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    .line 126
    :goto_2
    sput-boolean v3, Lhp;->e:Z

    .line 127
    .line 128
    return-void

    .line 129
    :cond_3
    :try_start_2
    sget-object v2, Lhp;->a:Lhp;

    .line 130
    .line 131
    invoke-direct {v2, p2}, Lhp;->W(Landroid/content/Context;)Ljava/io/File;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    new-instance v6, Ljava/io/File;

    .line 136
    .line 137
    invoke-direct {v6, v5, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    new-instance p3, Ljava/io/FileOutputStream;

    .line 141
    .line 142
    invoke-direct {p3, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 143
    .line 144
    .line 145
    if-eqz p1, :cond_4

    .line 146
    .line 147
    const-string v5, "\u89c6\u9891"

    .line 148
    .line 149
    invoke-direct {v2, p0, p3, v5}, Lhp;->r(Ljava/net/HttpURLConnection;Ljava/io/FileOutputStream;Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result p3

    .line 153
    goto :goto_4

    .line 154
    :cond_4
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    const/16 v5, 0x4000

    .line 159
    .line 160
    new-array v5, v5, [B

    .line 161
    .line 162
    invoke-virtual {v2, v5}, Ljava/io/InputStream;->read([B)I

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    :goto_3
    const/4 v9, -0x1

    .line 167
    if-eq v8, v9, :cond_5

    .line 168
    .line 169
    invoke-virtual {p3, v5, v3, v8}, Ljava/io/FileOutputStream;->write([BII)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v5}, Ljava/io/InputStream;->read([B)I

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    goto :goto_3

    .line 177
    :cond_5
    invoke-virtual {p3}, Ljava/io/FileOutputStream;->close()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 181
    .line 182
    .line 183
    move p3, v4

    .line 184
    :goto_4
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 185
    .line 186
    .line 187
    if-nez p3, :cond_8

    .line 188
    .line 189
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 190
    .line 191
    .line 192
    if-eqz p1, :cond_7

    .line 193
    .line 194
    sget-object p0, Lhp;->a:Lhp;

    .line 195
    .line 196
    invoke-direct {p0, v3}, Lhp;->s(Z)V

    .line 197
    .line 198
    .line 199
    invoke-direct {p0}, Lhp;->X()Z

    .line 200
    .line 201
    .line 202
    move-result p3

    .line 203
    if-eqz p3, :cond_6

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_6
    move-object v7, v1

    .line 207
    :goto_5
    invoke-direct {p0, p2, v7}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 208
    .line 209
    .line 210
    :cond_7
    sput-boolean v3, Lhp;->e:Z

    .line 211
    .line 212
    return-void

    .line 213
    :cond_8
    :try_start_3
    invoke-virtual {v6, p4, p5}, Ljava/io/File;->setLastModified(J)Z

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    filled-new-array {p0}, [Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    const-string p3, "video/mp4"

    .line 225
    .line 226
    filled-new-array {p3}, [Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p3

    .line 230
    new-instance p4, Lcp;

    .line 231
    .line 232
    const/4 p5, 0x5

    .line 233
    invoke-direct {p4, p5}, Lcp;-><init>(I)V

    .line 234
    .line 235
    .line 236
    invoke-static {p2, p0, p3, p4}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 237
    .line 238
    .line 239
    const-string p0, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 240
    .line 241
    if-eqz p1, :cond_9

    .line 242
    .line 243
    :try_start_4
    sget-object p3, Lhp;->a:Lhp;

    .line 244
    .line 245
    invoke-direct {p3, v4}, Lhp;->s(Z)V

    .line 246
    .line 247
    .line 248
    invoke-direct {p3, p2, p0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_9
    sget-object p3, Lhp;->a:Lhp;

    .line 253
    .line 254
    invoke-direct {p3, p2, p0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 255
    .line 256
    .line 257
    :goto_6
    sput-boolean v3, Lhp;->e:Z

    .line 258
    .line 259
    return-void

    .line 260
    :goto_7
    :try_start_5
    sget-object p3, Llb0;->a:Llb0;

    .line 261
    .line 262
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    new-instance p4, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    const-string p5, "video exc: "

    .line 272
    .line 273
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-virtual {p3, v0, p0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    if-eqz p1, :cond_a

    .line 287
    .line 288
    sget-object p0, Lhp;->a:Lhp;

    .line 289
    .line 290
    invoke-direct {p0, v3}, Lhp;->s(Z)V

    .line 291
    .line 292
    .line 293
    invoke-direct {p0, p2, v1}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_a
    sget-object p0, Lhp;->a:Lhp;

    .line 298
    .line 299
    invoke-direct {p0, p2, v1}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 300
    .line 301
    .line 302
    :goto_8
    sput-boolean v3, Lhp;->e:Z

    .line 303
    .line 304
    return-void

    .line 305
    :goto_9
    sput-boolean v3, Lhp;->e:Z

    .line 306
    .line 307
    throw p0
.end method

.method private static final R(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final S(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    sparse-switch p0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :sswitch_0
    const-string p0, "webp"

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "image/webp"

    .line 19
    .line 20
    return-object p0

    .line 21
    :sswitch_1
    const-string p0, "heif"

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string p0, "image/heif"

    .line 31
    .line 32
    return-object p0

    .line 33
    :sswitch_2
    const-string p0, "svg"

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-string p0, "image/svg+xml"

    .line 43
    .line 44
    return-object p0

    .line 45
    :sswitch_3
    const-string p0, "png"

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const-string p0, "image/png"

    .line 55
    .line 56
    return-object p0

    .line 57
    :sswitch_4
    const-string p0, "gif"

    .line 58
    .line 59
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    const-string p0, "image/gif"

    .line 67
    .line 68
    return-object p0

    .line 69
    :sswitch_5
    const-string p0, "bmp"

    .line 70
    .line 71
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_5

    .line 76
    .line 77
    :goto_0
    const-string p0, "image/jpeg"

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_5
    const-string p0, "image/bmp"

    .line 81
    .line 82
    return-object p0

    .line 83
    :sswitch_data_0
    .sparse-switch
        0x17d85 -> :sswitch_5
        0x18fc4 -> :sswitch_4
        0x1b229 -> :sswitch_3
        0x1be64 -> :sswitch_2
        0x30ceda -> :sswitch_1
        0x379f9c -> :sswitch_0
    .end sparse-switch
.end method

.method private final T(Landroid/content/Context;)Ljava/io/File;
    .locals 1

    .line 1
    sget-object p0, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    const-string v0, "\u539f\u56fe_whs"

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lm00$a;->i0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private final U(Landroid/content/Context;)Ljava/io/File;
    .locals 1

    .line 1
    sget-object p0, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    const-string v0, "live \u52a8\u56fe_whs"

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lm00$a;->i0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private final V()Landroid/os/Handler;
    .locals 0

    .line 1
    sget-object p0, Lhp;->d:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/os/Handler;

    .line 8
    .line 9
    return-object p0
.end method

.method private final W(Landroid/content/Context;)Ljava/io/File;
    .locals 1

    .line 1
    sget-object p0, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    const-string v0, "\u89c6\u9891_whs"

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lm00$a;->i0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private final X()Z
    .locals 0

    .line 1
    sget-object p0, Llp;->a:Llp;

    .line 2
    .line 3
    invoke-virtual {p0}, Llp;->d()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method private static final Y()Landroid/os/Handler;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private final Z(Landroid/content/Context;Ljava/lang/String;)V
    .locals 12

    .line 1
    sget-object p0, Llp;->a:Llp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Llp;->f(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    sget-object v0, Lhp;->f:Lkp;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    new-instance v2, Llp$a;

    .line 22
    .line 23
    const/16 v10, 0x18

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    move-object v3, p2

    .line 33
    invoke-direct/range {v2 .. v11}, Llp$a;-><init>(Ljava/lang/String;JJZZILpl;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v2}, Llp;->j(Llp$a;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    move-object v3, p2

    .line 41
    invoke-virtual {p0}, Llp;->i()V

    .line 42
    .line 43
    .line 44
    new-instance p0, Lkp;

    .line 45
    .line 46
    invoke-direct {p0, p1, v3}, Lkp;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object p0, Lhp;->f:Lkp;

    .line 50
    .line 51
    invoke-virtual {p0}, Lkp;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_0
    move-exception v0

    .line 56
    move-object p0, v0

    .line 57
    sget-object p1, Llb0;->a:Llb0;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string p2, "showProgress fail: "

    .line 64
    .line 65
    const-string v0, "DL"

    .line 66
    .line 67
    invoke-static {p2, p0, p1, v0}, Lt1;->s(Ljava/lang/String;Ljava/lang/String;Llb0;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lhp;->I(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final a0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lhp;->V()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lbp;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p1, p2, v1}, Lbp;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lhp;->x(Ljava/util/List;Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final b0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    return-void
.end method

.method public static synthetic c()V
    .locals 0

    .line 1
    invoke-static {}, Lhp;->t()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c0(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    const/16 p0, 0x3f

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x6

    .line 5
    invoke-static {p1, p0, v0, v1}, Lk41;->Y(Ljava/lang/CharSequence;CII)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-ltz p0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/lit8 v2, v2, -0x1

    .line 16
    .line 17
    if-ne p0, v2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    add-int/lit8 p0, p0, 0x1

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string p1, "&"

    .line 31
    .line 32
    filled-new-array {p1}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p0, p1, v1}, Lk41;->e0(Ljava/lang/String;[Ljava/lang/String;I)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    move-object v1, p1

    .line 60
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    const-string v4, "="

    .line 63
    .line 64
    invoke-static {v1, v4, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_3

    .line 79
    .line 80
    const/4 v7, 0x0

    .line 81
    const/16 v8, 0x3e

    .line 82
    .line 83
    const-string v4, "&"

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v6, 0x0

    .line 87
    invoke-static/range {v3 .. v8}, Lye;->O(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsw;I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    new-instance p1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, "?"

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :cond_3
    return-object v2

    .line 113
    :cond_4
    :goto_1
    return-object p1
.end method

.method public static synthetic d(Landroid/content/Context;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lhp;->w(Ljava/util/List;Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d0(Ljava/lang/String;JJ)V
    .locals 10

    .line 1
    sget-object p0, Llp;->a:Llp;

    .line 2
    .line 3
    new-instance v0, Llp$a;

    .line 4
    .line 5
    const/16 v8, 0x18

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x0

    .line 10
    move-object v1, p1

    .line 11
    move-wide v2, p2

    .line 12
    move-wide v4, p4

    .line 13
    invoke-direct/range {v0 .. v9}, Llp$a;-><init>(Ljava/lang/String;JJZZILpl;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Llp;->j(Llp$a;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static synthetic e(Ljava/lang/String;ZLandroid/content/Context;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lhp;->Q(Ljava/lang/String;ZLandroid/content/Context;Ljava/lang/String;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lhp;->R(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Landroid/content/Context;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lhp;->B(Ljava/util/List;Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lhp;->y(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(ZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lhp;->G(ZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lhp;->E(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lhp;->b0(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lhp;->M(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m()Landroid/os/Handler;
    .locals 1

    .line 1
    invoke-static {}, Lhp;->Y()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic n(Ljava/lang/String;IZLandroid/content/Context;JLjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lhp;->D(Ljava/lang/String;IZLandroid/content/Context;JLjava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o(Landroid/content/Context;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lhp;->A(Ljava/util/List;Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic p(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lhp;->K(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final q(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string p0, "heif"

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_6

    .line 9
    .line 10
    const-string v1, "heic"

    .line 11
    .line 12
    invoke-static {p1, v1, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "webp"

    .line 20
    .line 21
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    const-string p0, "png"

    .line 29
    .line 30
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    const-string p0, "gif"

    .line 38
    .line 39
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    const-string p0, "bmp"

    .line 47
    .line 48
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_4
    const-string p0, "svg"

    .line 56
    .line 57
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_5
    const-string p0, "jpg"

    .line 65
    .line 66
    :cond_6
    :goto_0
    return-object p0
.end method

.method private final r(Ljava/net/HttpURLConnection;Ljava/io/FileOutputStream;Ljava/lang/String;)Z
    .locals 24

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/net/URLConnection;->getContentLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    invoke-virtual/range {p1 .. p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/16 v3, 0x2000

    .line 11
    .line 12
    new-array v3, v3, [B

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/io/InputStream;->read([B)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    move-wide v7, v5

    .line 21
    move-wide v9, v7

    .line 22
    :goto_0
    const/4 v11, -0x1

    .line 23
    if-eq v4, v11, :cond_3

    .line 24
    .line 25
    invoke-direct/range {p0 .. p0}, Lhp;->X()Z

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    const/4 v12, 0x0

    .line 30
    if-eqz v11, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p2 .. p2}, Ljava/io/FileOutputStream;->close()V

    .line 36
    .line 37
    .line 38
    return v12

    .line 39
    :cond_0
    move-object/from16 v11, p2

    .line 40
    .line 41
    invoke-virtual {v11, v3, v12, v4}, Ljava/io/FileOutputStream;->write([BII)V

    .line 42
    .line 43
    .line 44
    int-to-long v12, v4

    .line 45
    add-long v16, v7, v12

    .line 46
    .line 47
    sub-long v7, v16, v9

    .line 48
    .line 49
    const-wide/32 v12, 0x40000

    .line 50
    .line 51
    .line 52
    cmp-long v4, v7, v12

    .line 53
    .line 54
    if-lez v4, :cond_2

    .line 55
    .line 56
    cmp-long v4, v0, v5

    .line 57
    .line 58
    if-lez v4, :cond_1

    .line 59
    .line 60
    move-wide/from16 v18, v0

    .line 61
    .line 62
    :goto_1
    move-object/from16 v14, p0

    .line 63
    .line 64
    move-object/from16 v15, p3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    const-wide/16 v7, -0x1

    .line 68
    .line 69
    move-wide/from16 v18, v7

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :goto_2
    invoke-direct/range {v14 .. v19}, Lhp;->d0(Ljava/lang/String;JJ)V

    .line 73
    .line 74
    .line 75
    move-wide/from16 v9, v16

    .line 76
    .line 77
    :cond_2
    invoke-virtual {v2, v3}, Ljava/io/InputStream;->read([B)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    move-wide/from16 v7, v16

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    move-object/from16 v11, p2

    .line 85
    .line 86
    cmp-long v3, v0, v5

    .line 87
    .line 88
    if-lez v3, :cond_4

    .line 89
    .line 90
    move-wide/from16 v20, v0

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    move-wide/from16 v20, v7

    .line 94
    .line 95
    :goto_3
    if-lez v3, :cond_5

    .line 96
    .line 97
    move-wide/from16 v22, v0

    .line 98
    .line 99
    :goto_4
    move-object/from16 v18, p0

    .line 100
    .line 101
    move-object/from16 v19, p3

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_5
    move-wide/from16 v22, v7

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :goto_5
    invoke-direct/range {v18 .. v23}, Lhp;->d0(Ljava/lang/String;JJ)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->close()V

    .line 114
    .line 115
    .line 116
    const/4 v0, 0x1

    .line 117
    return v0
.end method

.method private final s(Z)V
    .locals 11

    .line 1
    sget-object v0, Llp;->a:Llp;

    .line 2
    .line 3
    new-instance v1, Llp$a;

    .line 4
    .line 5
    xor-int/lit8 v8, p1, 0x1

    .line 6
    .line 7
    const/4 v9, 0x7

    .line 8
    const/4 v10, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    move v7, p1

    .line 15
    invoke-direct/range {v1 .. v10}, Llp$a;-><init>(Ljava/lang/String;JJZZILpl;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Llp;->j(Llp$a;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lhp;->V()Landroid/os/Handler;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, Lh3;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-direct {p1, v0}, Lh3;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private static final t()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lhp;->f:Lkp;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lkp;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    sput-object v0, Lhp;->f:Lkp;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception v0

    .line 13
    sget-object v1, Llb0;->a:Llb0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v2, "dismissProgress fail: "

    .line 20
    .line 21
    const-string v3, "DL"

    .line 22
    .line 23
    invoke-static {v2, v0, v1, v3}, Lt1;->s(Ljava/lang/String;Ljava/lang/String;Llb0;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final u(Landroid/content/Context;)V
    .locals 4

    .line 1
    :try_start_0
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v0, 0x1f

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    const-wide/16 v2, 0x1e

    .line 7
    .line 8
    if-lt p0, v0, :cond_0

    .line 9
    .line 10
    const-string p0, "vibrator_manager"

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lf3;->h(Ljava/lang/Object;)Landroid/os/VibratorManager;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lf3;->g(Landroid/os/VibratorManager;)Landroid/os/Vibrator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {v2, v3, v1}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const-string p0, "vibrator"

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast p0, Landroid/os/Vibrator;

    .line 45
    .line 46
    invoke-static {v2, v3, v1}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    :catch_0
    return-void
.end method

.method private static final w(Ljava/util/List;Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_2

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v4, v2, 0x1

    .line 19
    .line 20
    if-ltz v2, :cond_1

    .line 21
    .line 22
    check-cast v3, Ljava/lang/String;

    .line 23
    .line 24
    sget-object v5, Lhp;->a:Lhp;

    .line 25
    .line 26
    invoke-direct {v5, p1, v3, v2}, Lhp;->L(Landroid/content/Context;Ljava/lang/String;I)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    move v0, v1

    .line 33
    :cond_0
    move v2, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {}, Lo30;->A()V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    throw p0

    .line 40
    :cond_2
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Lhp;->a:Lhp;

    .line 43
    .line 44
    const-string v0, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 45
    .line 46
    invoke-direct {p0, p1, v0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    sget-object p0, Lhp;->a:Lhp;

    .line 51
    .line 52
    const-string v0, "\u4e0b\u8f7d\u5931\u8d25"

    .line 53
    .line 54
    invoke-direct {p0, p1, v0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    sput-boolean v1, Lhp;->e:Z

    .line 58
    .line 59
    return-void
.end method

.method private static final x(Ljava/util/List;Landroid/content/Context;)V
    .locals 17

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v2, "DL"

    .line 4
    .line 5
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const/4 v4, 0x1

    .line 10
    move v0, v4

    .line 11
    const/4 v6, 0x0

    .line 12
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v7

    .line 16
    if-eqz v7, :cond_5

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    add-int/lit8 v8, v6, 0x1

    .line 23
    .line 24
    if-ltz v6, :cond_4

    .line 25
    .line 26
    check-cast v7, Ljava/lang/String;

    .line 27
    .line 28
    sget-object v9, Lhp;->a:Lhp;

    .line 29
    .line 30
    invoke-direct {v9}, Lhp;->X()Z

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    if-eqz v10, :cond_0

    .line 35
    .line 36
    :goto_1
    const/4 v0, 0x0

    .line 37
    const/16 v16, 0x0

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_0
    invoke-direct {v9, v7}, Lhp;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v10

    .line 49
    :try_start_0
    new-instance v12, Ljava/net/URL;

    .line 50
    .line 51
    invoke-direct {v12, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    check-cast v7, Ljava/net/HttpURLConnection;

    .line 62
    .line 63
    const/16 v12, 0x2710

    .line 64
    .line 65
    invoke-virtual {v7, v12}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 66
    .line 67
    .line 68
    const v12, 0xea60

    .line 69
    .line 70
    .line 71
    invoke-virtual {v7, v12}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v4}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/net/URLConnection;->connect()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    const/16 v13, 0xc8

    .line 85
    .line 86
    if-eq v12, v13, :cond_1

    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 89
    .line 90
    .line 91
    sget-object v0, Llb0;->a:Llb0;

    .line 92
    .line 93
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    new-instance v9, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v10, "batch img fail HTTP "

    .line 103
    .line 104
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v7, " idx="

    .line 111
    .line 112
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-virtual {v0, v2, v7}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :catch_0
    move-exception v0

    .line 127
    const/16 v16, 0x0

    .line 128
    .line 129
    goto/16 :goto_3

    .line 130
    .line 131
    :cond_1
    invoke-virtual {v7}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    if-nez v12, :cond_2

    .line 136
    .line 137
    const-string v12, "image/jpeg"

    .line 138
    .line 139
    :cond_2
    invoke-direct {v9, v12}, Lhp;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    invoke-direct {v9, v12}, Lhp;->S(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    invoke-direct {v9, v1}, Lhp;->T(Landroid/content/Context;)Ljava/io/File;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    new-instance v15, Ljava/io/File;

    .line 152
    .line 153
    new-instance v4, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    .line 157
    .line 158
    const/16 v16, 0x0

    .line 159
    .line 160
    :try_start_1
    const-string v5, "whs-"

    .line 161
    .line 162
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v5, "-"

    .line 169
    .line 170
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v5, "."

    .line 177
    .line 178
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-direct {v15, v14, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    new-instance v4, Ljava/io/FileOutputStream;

    .line 192
    .line 193
    invoke-direct {v4, v15}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 194
    .line 195
    .line 196
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    new-instance v13, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    const-string v14, "\u56fe\u7247 "

    .line 206
    .line 207
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v14, "/"

    .line 214
    .line 215
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    invoke-direct {v9, v7, v4, v5}, Lhp;->r(Ljava/net/HttpURLConnection;Ljava/io/FileOutputStream;Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-nez v4, :cond_3

    .line 230
    .line 231
    invoke-virtual {v15}, Ljava/io/File;->delete()Z

    .line 232
    .line 233
    .line 234
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 235
    .line 236
    .line 237
    :goto_2
    move/from16 v0, v16

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :catch_1
    move-exception v0

    .line 241
    goto :goto_3

    .line 242
    :cond_3
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 243
    .line 244
    .line 245
    int-to-long v4, v6

    .line 246
    add-long/2addr v10, v4

    .line 247
    invoke-virtual {v15, v10, v11}, Ljava/io/File;->setLastModified(J)Z

    .line 248
    .line 249
    .line 250
    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    filled-new-array {v4}, [Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    filled-new-array {v12}, [Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    new-instance v7, Lcp;

    .line 263
    .line 264
    const/4 v9, 0x4

    .line 265
    invoke-direct {v7, v9}, Lcp;-><init>(I)V

    .line 266
    .line 267
    .line 268
    invoke-static {v1, v4, v5, v7}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 269
    .line 270
    .line 271
    goto :goto_4

    .line 272
    :goto_3
    sget-object v4, Llb0;->a:Llb0;

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    new-instance v5, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    const-string v7, "batch img exc idx="

    .line 281
    .line 282
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    const-string v6, ": "

    .line 289
    .line 290
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v4, v2, v0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    goto :goto_2

    .line 304
    :goto_4
    move v6, v8

    .line 305
    const/4 v4, 0x1

    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :cond_4
    invoke-static {}, Lo30;->A()V

    .line 309
    .line 310
    .line 311
    const/4 v0, 0x0

    .line 312
    throw v0

    .line 313
    :cond_5
    const/16 v16, 0x0

    .line 314
    .line 315
    sget-object v2, Lhp;->a:Lhp;

    .line 316
    .line 317
    invoke-direct {v2, v0}, Lhp;->s(Z)V

    .line 318
    .line 319
    .line 320
    if-eqz v0, :cond_6

    .line 321
    .line 322
    const-string v0, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 323
    .line 324
    :goto_5
    invoke-direct {v2, v1, v0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    goto :goto_6

    .line 328
    :cond_6
    invoke-direct {v2}, Lhp;->X()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_7

    .line 333
    .line 334
    const-string v0, "\u5df2\u53d6\u6d88\u4e0b\u8f7d"

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_7
    const-string v0, "\u4e0b\u8f7d\u5931\u8d25"

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :goto_6
    sput-boolean v16, Lhp;->e:Z

    .line 341
    .line 342
    return-void
.end method

.method private static final y(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final C(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lhp;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v5

    .line 15
    add-int/lit8 v2, p3, 0x1

    .line 16
    .line 17
    const-string p2, "\u56fe\u7247 #"

    .line 18
    .line 19
    invoke-static {p2, v2}, Lt1;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-direct {p0, p1}, Lhp;->u(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    sget-object p2, Llp;->a:Llp;

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Llp;->f(Landroid/content/Context;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    const-string p2, "\u4e0b\u8f7d\u4e2d..."

    .line 35
    .line 36
    invoke-direct {p0, p1, p2}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-direct {p0, p1, v7}, Lhp;->Z(Landroid/content/Context;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object p0, Lhp;->c:Ljava/util/concurrent/ExecutorService;

    .line 44
    .line 45
    new-instance v0, Lep;

    .line 46
    .line 47
    move-object v4, p1

    .line 48
    move v8, p3

    .line 49
    invoke-direct/range {v0 .. v8}, Lep;-><init>(Ljava/lang/String;IZLandroid/content/Context;JLjava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final F(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    add-int/lit8 v6, p4, 0x1

    .line 11
    .line 12
    const-string v0, "Live\u56fe #"

    .line 13
    .line 14
    invoke-static {v0, v6}, Lt1;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0, p1}, Lhp;->u(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Llp;->a:Llp;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Llp;->f(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const-string v0, "\u4e0b\u8f7d\u4e2d..."

    .line 30
    .line 31
    invoke-direct {p0, p1, v0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-direct {p0, p1, v0}, Lhp;->Z(Landroid/content/Context;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sget-object p0, Lhp;->c:Ljava/util/concurrent/ExecutorService;

    .line 39
    .line 40
    new-instance v0, Lfp;

    .line 41
    .line 42
    move-object v2, p1

    .line 43
    move-object v3, p2

    .line 44
    move-object v4, p3

    .line 45
    move v5, p4

    .line 46
    invoke-direct/range {v0 .. v6}, Lfp;-><init>(ZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final P(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-boolean p3, Lhp;->e:Z

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    const-string p2, "\u4e0a\u4e00\u4efb\u52a1\u672a\u5b8c\u6210\uff0c\u8bf7\u7a0d\u540e"

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/4 p3, 0x1

    .line 18
    sput-boolean p3, Lhp;->e:Z

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    new-instance p3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string p4, "whs_video_"

    .line 27
    .line 28
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p4, ".mp4"

    .line 35
    .line 36
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-direct {p0, p1}, Lhp;->u(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    sget-object p3, Llp;->a:Llp;

    .line 47
    .line 48
    invoke-virtual {p3, p1}, Llp;->f(Landroid/content/Context;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    const-string p3, "\u4e0b\u8f7d\u4e2d..."

    .line 55
    .line 56
    invoke-direct {p0, p1, p3}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const-string p3, "\u89c6\u9891"

    .line 61
    .line 62
    invoke-direct {p0, p1, p3}, Lhp;->Z(Landroid/content/Context;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :goto_0
    sget-object p0, Lhp;->c:Ljava/util/concurrent/ExecutorService;

    .line 66
    .line 67
    new-instance v0, Ldp;

    .line 68
    .line 69
    move-object v3, p1

    .line 70
    move-object v1, p2

    .line 71
    invoke-direct/range {v0 .. v6}, Ldp;-><init>(Ljava/lang/String;ZLandroid/content/Context;Ljava/lang/String;J)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final v(Landroid/content/Context;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-boolean v0, Lhp;->e:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const-string p2, "\u4e0a\u4e00\u4efb\u52a1\u672a\u5b8c\u6210\uff0c\u8bf7\u7a0d\u540e"

    .line 19
    .line 20
    invoke-direct {p0, p1, p2}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 v0, 0x1

    .line 25
    sput-boolean v0, Lhp;->e:Z

    .line 26
    .line 27
    invoke-direct {p0, p1}, Lhp;->u(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    sget-object v1, Llp;->a:Llp;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Llp;->f(Landroid/content/Context;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    const-string v0, "\u4e0b\u8f7d\u4e2d..."

    .line 39
    .line 40
    invoke-direct {p0, p1, v0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lhp;->c:Ljava/util/concurrent/ExecutorService;

    .line 44
    .line 45
    new-instance v0, Lgp;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p2, p1, v1}, Lgp;-><init>(Ljava/util/List;Landroid/content/Context;I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const-string v2, "\u56fe\u7247 0/"

    .line 60
    .line 61
    invoke-static {v2, v1}, Lt1;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-direct {p0, p1, v1}, Lhp;->Z(Landroid/content/Context;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lhp;->c:Ljava/util/concurrent/ExecutorService;

    .line 69
    .line 70
    new-instance v1, Lgp;

    .line 71
    .line 72
    invoke-direct {v1, p2, p1, v0}, Lgp;-><init>(Ljava/util/List;Landroid/content/Context;I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final z(Landroid/content/Context;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lhp$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-boolean v0, Lhp;->e:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const-string p2, "\u4e0a\u4e00\u4efb\u52a1\u672a\u5b8c\u6210\uff0c\u8bf7\u7a0d\u540e"

    .line 19
    .line 20
    invoke-direct {p0, p1, p2}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 v0, 0x1

    .line 25
    sput-boolean v0, Lhp;->e:Z

    .line 26
    .line 27
    invoke-direct {p0, p1}, Lhp;->u(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Llp;->a:Llp;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Llp;->f(Landroid/content/Context;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    const-string v0, "\u4e0b\u8f7d\u4e2d..."

    .line 39
    .line 40
    invoke-direct {p0, p1, v0}, Lhp;->a0(Landroid/content/Context;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lhp;->c:Ljava/util/concurrent/ExecutorService;

    .line 44
    .line 45
    new-instance v0, Lgp;

    .line 46
    .line 47
    const/4 v1, 0x2

    .line 48
    invoke-direct {v0, p2, p1, v1}, Lgp;-><init>(Ljava/util/List;Landroid/content/Context;I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    const-string v1, "Live\u56fe 0/"

    .line 60
    .line 61
    invoke-static {v1, v0}, Lt1;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {p0, p1, v0}, Lhp;->Z(Landroid/content/Context;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lhp;->c:Ljava/util/concurrent/ExecutorService;

    .line 69
    .line 70
    new-instance v0, Lgp;

    .line 71
    .line 72
    const/4 v1, 0x3

    .line 73
    invoke-direct {v0, p2, p1, v1}, Lgp;-><init>(Ljava/util/List;Landroid/content/Context;I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
