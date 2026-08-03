.class public final Lhb/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lab/b;

.field public final c:Landroid/os/Handler;

.field public final d:Landroid/content/SharedPreferences;

.field public final e:Ljava/util/ArrayDeque;

.field public volatile f:Lhb/g;

.field public g:Lhb/i;

.field public h:Ljava/lang/Object;

.field public i:Lb9/c;

.field public volatile j:Z


# direct methods
.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhb/k;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lhb/k;->b:Lab/b;

    .line 10
    .line 11
    new-instance p2, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lhb/k;->c:Landroid/os/Handler;

    .line 21
    .line 22
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 23
    .line 24
    const-string p2, "Hchat_selected_message_method_cache"

    .line 25
    .line 26
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lhb/k;->d:Landroid/content/SharedPreferences;

    .line 31
    .line 32
    new-instance p1, Ljava/util/ArrayDeque;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lhb/k;->e:Ljava/util/ArrayDeque;

    .line 38
    .line 39
    return-void
.end method

.method public static b(Ldb/a;I)Lhb/t;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ldb/a;->a:I

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/16 v4, 0x2f

    .line 9
    .line 10
    const/16 v5, 0x22

    .line 11
    .line 12
    const/16 v6, 0x31

    .line 13
    .line 14
    const/16 v7, 0x2b

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x1

    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    if-eq v2, v9, :cond_4

    .line 21
    .line 22
    const/4 v10, 0x2

    .line 23
    if-eq v2, v10, :cond_3

    .line 24
    .line 25
    const/4 v10, 0x4

    .line 26
    if-eq v2, v10, :cond_2

    .line 27
    .line 28
    const/4 v10, 0x5

    .line 29
    if-eq v2, v10, :cond_1

    .line 30
    .line 31
    const/4 v10, 0x6

    .line 32
    if-eq v2, v10, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v14, v6

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v14, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    move v14, v4

    .line 40
    goto :goto_0

    .line 41
    :cond_3
    move v14, v7

    .line 42
    goto :goto_0

    .line 43
    :cond_4
    move v14, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_5
    move v14, v9

    .line 46
    :goto_0
    iget-object v0, v0, Ldb/a;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_6

    .line 61
    .line 62
    :goto_1
    return-object v8

    .line 63
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v20

    .line 67
    if-eq v14, v3, :cond_8

    .line 68
    .line 69
    if-eq v14, v7, :cond_8

    .line 70
    .line 71
    if-ne v14, v4, :cond_7

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_7
    move-object/from16 v16, v0

    .line 75
    .line 76
    move v12, v14

    .line 77
    goto :goto_3

    .line 78
    :cond_8
    :goto_2
    new-instance v2, Ljava/io/File;

    .line 79
    .line 80
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    new-instance v11, Lk8/t;

    .line 84
    .line 85
    int-to-long v3, v1

    .line 86
    add-long v17, v20, v3

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    const-wide/32 v12, 0x7fffffff

    .line 93
    .line 94
    .line 95
    cmp-long v4, v2, v12

    .line 96
    .line 97
    if-lez v4, :cond_9

    .line 98
    .line 99
    move-wide v2, v12

    .line 100
    :cond_9
    long-to-int v2, v2

    .line 101
    const/4 v13, 0x2

    .line 102
    move v12, v14

    .line 103
    const-string v14, ""

    .line 104
    .line 105
    const-string v15, ""

    .line 106
    .line 107
    move-object/from16 v16, v0

    .line 108
    .line 109
    move/from16 v19, v2

    .line 110
    .line 111
    invoke-direct/range {v11 .. v19}, Lk8/t;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 112
    .line 113
    .line 114
    move-object v8, v11

    .line 115
    :goto_3
    new-instance v11, Lhb/t;

    .line 116
    .line 117
    int-to-long v0, v1

    .line 118
    add-long v0, v20, v0

    .line 119
    .line 120
    const-string v2, ""

    .line 121
    .line 122
    if-eq v12, v9, :cond_a

    .line 123
    .line 124
    if-eq v12, v6, :cond_a

    .line 125
    .line 126
    move-object/from16 v3, v16

    .line 127
    .line 128
    move-object/from16 v16, v2

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_a
    move-object/from16 v3, v16

    .line 132
    .line 133
    :goto_4
    if-ne v12, v7, :cond_b

    .line 134
    .line 135
    move-object/from16 v17, v3

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_b
    move-object/from16 v17, v2

    .line 139
    .line 140
    :goto_5
    if-ne v12, v5, :cond_c

    .line 141
    .line 142
    move-object v2, v3

    .line 143
    :cond_c
    const/16 v24, 0x0

    .line 144
    .line 145
    const/16 v25, 0x600

    .line 146
    .line 147
    const-string v15, ""

    .line 148
    .line 149
    const/16 v22, 0x0

    .line 150
    .line 151
    const/16 v23, 0x0

    .line 152
    .line 153
    move v14, v12

    .line 154
    move-wide/from16 v18, v20

    .line 155
    .line 156
    move-wide v12, v0

    .line 157
    move-object/from16 v21, v2

    .line 158
    .line 159
    move-object/from16 v20, v8

    .line 160
    .line 161
    invoke-direct/range {v11 .. v25}, Lhb/t;-><init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLk8/t;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    return-object v11
.end method

.method public static c(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    add-int/lit8 v4, v1, 0x1

    .line 27
    .line 28
    if-ltz v1, :cond_0

    .line 29
    .line 30
    check-cast v2, Ldb/a;

    .line 31
    .line 32
    invoke-static {v2, v1}, Lhb/k;->b(Ldb/a;I)Lhb/t;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move v1, v4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {}, La/a;->Q0()V

    .line 44
    .line 45
    .line 46
    throw v3

    .line 47
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_2

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_2
    return-object v3
.end method

.method public static e(Lhb/t;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lhb/t;->g:Lk8/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lk8/t;->f:Ljava/lang/String;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    const-string v2, ""

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    move-object v0, v2

    .line 15
    :cond_1
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Leh/a;->y(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_6

    .line 28
    .line 29
    const-string v3, "[0-9a-fA-F]{32}"

    .line 30
    .line 31
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    iget-object v0, p0, Lhb/t;->g:Lk8/t;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v1, v0, Lk8/t;->c:Ljava/lang/String;

    .line 57
    .line 58
    :cond_3
    if-nez v1, :cond_4

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    move-object v2, v1

    .line 62
    :goto_1
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    iget-object v2, p0, Lhb/t;->d:Ljava/lang/String;

    .line 69
    .line 70
    :cond_5
    sget-object p0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const-string p0, "md5"

    .line 76
    .line 77
    invoke-static {v2, p0}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    invoke-static {v2, p0}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_6
    :goto_2
    return-object v0
.end method

.method public static h(Lhb/t;Lhb/g;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhb/t;->d:Ljava/lang/String;

    .line 5
    .line 6
    iget v1, p0, Lhb/t;->b:I

    .line 7
    .line 8
    const v2, 0xffff

    .line 9
    .line 10
    .line 11
    and-int/2addr v1, v2

    .line 12
    const/16 v2, 0x3e

    .line 13
    .line 14
    const/16 v3, 0x31

    .line 15
    .line 16
    const/16 v4, 0x2f

    .line 17
    .line 18
    const/16 v5, 0x2b

    .line 19
    .line 20
    const/16 v6, 0x22

    .line 21
    .line 22
    const/4 v7, 0x3

    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v9, 0x1

    .line 25
    if-eq v1, v9, :cond_1

    .line 26
    .line 27
    if-eq v1, v7, :cond_1

    .line 28
    .line 29
    if-eq v1, v6, :cond_1

    .line 30
    .line 31
    if-eq v1, v5, :cond_1

    .line 32
    .line 33
    if-eq v1, v4, :cond_1

    .line 34
    .line 35
    if-eq v1, v3, :cond_0

    .line 36
    .line 37
    if-eq v1, v2, :cond_1

    .line 38
    .line 39
    move v10, v8

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0}, Lhb/t;->b()Z

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v10, v9

    .line 47
    :goto_0
    if-nez v10, :cond_2

    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_2
    if-eq v1, v9, :cond_c

    .line 52
    .line 53
    if-eq v1, v7, :cond_8

    .line 54
    .line 55
    if-eq v1, v6, :cond_6

    .line 56
    .line 57
    if-eq v1, v5, :cond_5

    .line 58
    .line 59
    if-eq v1, v4, :cond_4

    .line 60
    .line 61
    if-eq v1, v3, :cond_3

    .line 62
    .line 63
    if-eq v1, v2, :cond_5

    .line 64
    .line 65
    goto :goto_5

    .line 66
    :cond_3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    :goto_1
    xor-int/2addr p0, v9

    .line 71
    return p0

    .line 72
    :cond_4
    iget-object p1, p1, Lhb/g;->i:Lhb/f;

    .line 73
    .line 74
    if-eqz p1, :cond_b

    .line 75
    .line 76
    invoke-static {p0}, Lhb/k;->e(Lhb/t;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_b

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    invoke-static {p0}, Lhb/k;->p(Lhb/t;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    goto :goto_1

    .line 96
    :cond_6
    new-instance p1, Ljava/io/File;

    .line 97
    .line 98
    iget-object p0, p0, Lhb/t;->h:Ljava/lang/String;

    .line 99
    .line 100
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_b

    .line 108
    .line 109
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    if-eqz p0, :cond_7

    .line 114
    .line 115
    iget-object p0, p0, Lj8/p;->b:Lj8/y;

    .line 116
    .line 117
    if-eqz p0, :cond_7

    .line 118
    .line 119
    invoke-virtual {p0}, Lj8/y;->a()Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-ne p0, v9, :cond_7

    .line 124
    .line 125
    move p0, v9

    .line 126
    goto :goto_2

    .line 127
    :cond_7
    move p0, v8

    .line 128
    :goto_2
    if-eqz p0, :cond_b

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_8
    new-instance v0, Ljava/io/File;

    .line 132
    .line 133
    iget-object p0, p0, Lhb/t;->g:Lk8/t;

    .line 134
    .line 135
    if-eqz p0, :cond_9

    .line 136
    .line 137
    iget-object p0, p0, Lk8/t;->f:Ljava/lang/String;

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_9
    const/4 p0, 0x0

    .line 141
    :goto_3
    if-nez p0, :cond_a

    .line 142
    .line 143
    const-string p0, ""

    .line 144
    .line 145
    :cond_a
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-eqz p0, :cond_b

    .line 153
    .line 154
    iget-object p0, p1, Lhb/g;->e:Ljava/lang/reflect/Method;

    .line 155
    .line 156
    if-eqz p0, :cond_b

    .line 157
    .line 158
    iget-object p0, p1, Lhb/g;->d:Ljava/lang/Object;

    .line 159
    .line 160
    if-eqz p0, :cond_b

    .line 161
    .line 162
    :goto_4
    return v9

    .line 163
    :cond_b
    :goto_5
    return v8

    .line 164
    :cond_c
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    goto :goto_1
.end method

.method public static j(Ljava/util/List;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

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
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lhb/t;

    .line 23
    .line 24
    iget v1, v0, Lhb/t;->b:I

    .line 25
    .line 26
    const v2, 0xffff

    .line 27
    .line 28
    .line 29
    and-int/2addr v1, v2

    .line 30
    const/16 v2, 0x2f

    .line 31
    .line 32
    if-ne v1, v2, :cond_2

    .line 33
    .line 34
    invoke-static {v0}, Lhb/k;->k(Lhb/t;)Lc8/a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    :goto_0
    if-eqz v0, :cond_1

    .line 44
    .line 45
    const-string p0, "\u65e0\u6cd5\u8bfb\u53d6\u539f\u751f\u7fa4\u53d1\u8868\u60c5"

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method

.method public static k(Lhb/t;)Lc8/a;
    .locals 10

    .line 1
    invoke-static {p0}, Lhb/k;->e(Lhb/t;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

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
    goto/16 :goto_8

    .line 13
    .line 14
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_13

    .line 19
    .line 20
    iget-object v0, v0, Lj8/p;->d:Lj8/f;

    .line 21
    .line 22
    if-eqz v0, :cond_13

    .line 23
    .line 24
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_13

    .line 29
    .line 30
    invoke-virtual {v0}, Lj8/f;->a()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :cond_1
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 39
    .line 40
    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    invoke-virtual {v0}, Lj8/f;->a()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_2

    .line 54
    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_2
    invoke-virtual {v0, v2}, Lj8/f;->e(Ljava/io/File;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    goto/16 :goto_8

    .line 68
    .line 69
    :cond_3
    invoke-virtual {v0, p0}, Lj8/f;->g(Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-nez v3, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0, v2, p0}, Lj8/f;->n(Ljava/io/File;Ljava/lang/String;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p0

    .line 81
    goto/16 :goto_7

    .line 82
    .line 83
    :cond_4
    invoke-static {p0}, Lj8/f;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_5

    .line 92
    .line 93
    goto/16 :goto_8

    .line 94
    .line 95
    :cond_5
    invoke-virtual {v0, p0}, Lj8/f;->g(Ljava/lang/String;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :cond_6
    :goto_0
    if-nez v3, :cond_7

    .line 100
    .line 101
    goto/16 :goto_8

    .line 102
    .line 103
    :cond_7
    const-string v4, "getMd5"

    .line 104
    .line 105
    const-string v5, "field_md5"

    .line 106
    .line 107
    invoke-static {v3, v4, v5}, Lj8/f;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const-string v5, "getSize"

    .line 112
    .line 113
    const-string v6, "field_size"

    .line 114
    .line 115
    const/4 v7, 0x0

    .line 116
    new-array v8, v7, [Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {v3, v5, v8}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    instance-of v8, v5, Ljava/lang/Number;

    .line 123
    .line 124
    if-nez v8, :cond_8

    .line 125
    .line 126
    invoke-static {v3, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    :cond_8
    instance-of v6, v5, Ljava/lang/Number;

    .line 131
    .line 132
    if-eqz v6, :cond_9

    .line 133
    .line 134
    check-cast v5, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    goto :goto_1

    .line 141
    :cond_9
    move v5, v7

    .line 142
    :goto_1
    const-string v6, "getType"

    .line 143
    .line 144
    const-string v8, "field_type"

    .line 145
    .line 146
    new-array v9, v7, [Ljava/lang/Object;

    .line 147
    .line 148
    invoke-static {v3, v6, v9}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    instance-of v9, v6, Ljava/lang/Number;

    .line 153
    .line 154
    if-nez v9, :cond_a

    .line 155
    .line 156
    invoke-static {v3, v8}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    :cond_a
    instance-of v8, v6, Ljava/lang/Number;

    .line 161
    .line 162
    if-eqz v8, :cond_b

    .line 163
    .line 164
    check-cast v6, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    goto :goto_2

    .line 171
    :cond_b
    move v6, v7

    .line 172
    :goto_2
    const-string v8, "getContent"

    .line 173
    .line 174
    const-string v9, "field_content"

    .line 175
    .line 176
    invoke-static {v3, v8, v9}, Lj8/f;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-eqz v8, :cond_c

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_c
    move-object p0, v4

    .line 188
    :goto_3
    if-gtz v5, :cond_f

    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-eqz v4, :cond_f

    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 197
    .line 198
    .line 199
    move-result-wide v4

    .line 200
    const-wide/16 v8, 0x0

    .line 201
    .line 202
    cmp-long v8, v4, v8

    .line 203
    .line 204
    if-gtz v8, :cond_d

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_d
    const-wide/32 v7, 0x7fffffff

    .line 208
    .line 209
    .line 210
    cmp-long v7, v4, v7

    .line 211
    .line 212
    if-lez v7, :cond_e

    .line 213
    .line 214
    const v7, 0x7fffffff

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_e
    long-to-int v7, v4

    .line 219
    :goto_4
    move v5, v7

    .line 220
    :cond_f
    if-gtz v6, :cond_11

    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-eqz v4, :cond_11

    .line 227
    .line 228
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v0, v2}, Lj8/f;->h(Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-eqz v2, :cond_10

    .line 237
    .line 238
    const/4 v2, 0x2

    .line 239
    :goto_5
    move v6, v2

    .line 240
    goto :goto_6

    .line 241
    :cond_10
    const/4 v2, 0x1

    .line 242
    goto :goto_5

    .line 243
    :cond_11
    :goto_6
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-nez v2, :cond_13

    .line 248
    .line 249
    if-lez v5, :cond_13

    .line 250
    .line 251
    if-gtz v6, :cond_12

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_12
    new-instance v2, Lc8/a;

    .line 255
    .line 256
    invoke-direct {v2, v5, p0, v3, v6}, Lc8/a;-><init>(ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 257
    .line 258
    .line 259
    return-object v2

    .line 260
    :goto_7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    const-string v3, "\u51c6\u5907\u7fa4\u53d1\u8868\u60c5\u5f02\u5e38: "

    .line 263
    .line 264
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-virtual {v0, p0}, Lj8/f;->j(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    :cond_13
    :goto_8
    return-object v1
.end method

.method public static p(Lhb/t;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lhb/t;->g:Lk8/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lk8/t;->f:Ljava/lang/String;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    const-string v2, ""

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    move-object v0, v2

    .line 15
    :cond_1
    iget-object p0, p0, Lhb/t;->e:Ljava/lang/String;

    .line 16
    .line 17
    filled-new-array {v0, p0}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v3, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    move-object v4, v3

    .line 74
    check-cast v4, Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-nez v4, :cond_3

    .line 81
    .line 82
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-static {p0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    move-object v4, v3

    .line 109
    check-cast v4, Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v4}, Leh/a;->y(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_5

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    move-object v3, v1

    .line 119
    :goto_3
    check-cast v3, Ljava/lang/String;

    .line 120
    .line 121
    if-eqz v3, :cond_7

    .line 122
    .line 123
    new-instance p0, Ljava/io/File;

    .line 124
    .line 125
    invoke-direct {p0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    return-object p0

    .line 136
    :cond_7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    iget-object v0, v0, Lj8/p;->c:Lbb/b;

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_8
    move-object v0, v1

    .line 146
    :goto_4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-eqz v4, :cond_b

    .line 155
    .line 156
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Ljava/lang/String;

    .line 161
    .line 162
    if-eqz v0, :cond_a

    .line 163
    .line 164
    invoke-virtual {v0, v4}, Lbb/b;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    if-eqz v4, :cond_a

    .line 169
    .line 170
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-nez v5, :cond_a

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_a
    move-object v4, v1

    .line 178
    :goto_5
    if-eqz v4, :cond_9

    .line 179
    .line 180
    move-object v1, v4

    .line 181
    :cond_b
    if-eqz v1, :cond_c

    .line 182
    .line 183
    return-object v1

    .line 184
    :cond_c
    invoke-static {p0}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, Ljava/lang/String;

    .line 189
    .line 190
    if-nez p0, :cond_d

    .line 191
    .line 192
    return-object v2

    .line 193
    :cond_d
    return-object p0
.end method

.method public static q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {p1, p0, p2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lhb/i;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lhb/k;->i:Lb9/c;

    .line 2
    .line 3
    iget-object v1, p0, Lhb/k;->c:Landroid/os/Handler;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lhb/k;->i:Lb9/c;

    .line 12
    .line 13
    iget-object v0, p1, Lhb/i;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget v2, p1, Lhb/i;->e:I

    .line 16
    .line 17
    invoke-static {v2, v0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lhb/j;

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget p2, p1, Lhb/i;->f:I

    .line 28
    .line 29
    iget-object v0, v0, Lhb/j;->b:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    add-int/2addr v0, p2

    .line 36
    iput v0, p1, Lhb/i;->f:I

    .line 37
    .line 38
    :cond_1
    iget p2, p1, Lhb/i;->e:I

    .line 39
    .line 40
    add-int/lit8 p2, p2, 0x1

    .line 41
    .line 42
    iput p2, p1, Lhb/i;->e:I

    .line 43
    .line 44
    new-instance p2, Lhb/e;

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-direct {p2, p0, p1, v0}, Lhb/e;-><init>(Lhb/k;Lhb/i;I)V

    .line 48
    .line 49
    .line 50
    const-wide/16 v2, 0x1f4

    .line 51
    .line 52
    invoke-virtual {v1, p2, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final d(Lhh/o;)Lhb/f;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v0, v0, Lhh/o;->s:Lsf/i;

    .line 4
    .line 5
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lhh/q;

    .line 31
    .line 32
    iget-object v2, v2, Lhh/q;->a:Lhh/l;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v3, v2

    .line 58
    check-cast v3, Lhh/l;

    .line 59
    .line 60
    invoke-virtual {v3}, Lhh/l;->p()Llh/b;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget-object v3, v3, Llh/b;->g:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-nez v4, :cond_1

    .line 71
    .line 72
    new-instance v4, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_1
    check-cast v4, Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_1d

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/util/Map$Entry;

    .line 110
    .line 111
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Ljava/lang/String;

    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Ljava/util/List;

    .line 122
    .line 123
    move-object/from16 v4, p0

    .line 124
    .line 125
    iget-object v5, v4, Lhb/k;->a:Lr8/g;

    .line 126
    .line 127
    iget-object v5, v5, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 128
    .line 129
    invoke-static {v3, v5}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    if-eqz v3, :cond_1c

    .line 134
    .line 135
    const-string v6, "toByteArray"

    .line 136
    .line 137
    const/4 v7, 0x0

    .line 138
    new-array v8, v7, [Ljava/lang/Class;

    .line 139
    .line 140
    invoke-static {v3, v6, v8}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    if-eqz v6, :cond_1c

    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    array-length v8, v8

    .line 154
    const/4 v9, 0x1

    .line 155
    if-nez v8, :cond_4

    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    const-class v10, [B

    .line 162
    .line 163
    invoke-static {v8, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-eqz v8, :cond_4

    .line 168
    .line 169
    move v8, v9

    .line 170
    goto :goto_3

    .line 171
    :cond_4
    move v8, v7

    .line 172
    :goto_3
    if-eqz v8, :cond_5

    .line 173
    .line 174
    move-object v12, v6

    .line 175
    goto :goto_4

    .line 176
    :cond_5
    const/4 v12, 0x0

    .line 177
    :goto_4
    if-eqz v12, :cond_1c

    .line 178
    .line 179
    new-instance v6, Ljava/util/HashSet;

    .line 180
    .line 181
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 182
    .line 183
    .line 184
    new-instance v8, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    :cond_6
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    if-eqz v10, :cond_7

    .line 198
    .line 199
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    move-object v11, v10

    .line 204
    check-cast v11, Lhh/l;

    .line 205
    .line 206
    invoke-virtual {v11}, Lhh/l;->p()Llh/b;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    iget-object v11, v11, Llh/b;->h:Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v6, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    if-eqz v11, :cond_6

    .line 217
    .line 218
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_7
    new-instance v2, Ljava/util/ArrayList;

    .line 223
    .line 224
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    :cond_8
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    if-eqz v8, :cond_9

    .line 236
    .line 237
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    check-cast v8, Lhh/l;

    .line 242
    .line 243
    invoke-virtual {v8}, Lhh/l;->p()Llh/b;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    iget-object v8, v8, Llh/b;->h:Ljava/lang/String;

    .line 248
    .line 249
    invoke-static {v3, v8}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    if-eqz v8, :cond_8

    .line 254
    .line 255
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_9
    new-instance v6, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    :cond_a
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    const-class v11, Ljava/lang/String;

    .line 273
    .line 274
    if-eqz v10, :cond_b

    .line 275
    .line 276
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    move-object v13, v10

    .line 281
    check-cast v13, Ljava/lang/reflect/Field;

    .line 282
    .line 283
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-result-object v13

    .line 287
    invoke-static {v13, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    if-eqz v11, :cond_a

    .line 292
    .line 293
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_b
    new-instance v8, Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    :cond_c
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v13

    .line 310
    if-eqz v13, :cond_d

    .line 311
    .line 312
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v13

    .line 316
    move-object v14, v13

    .line 317
    check-cast v14, Ljava/lang/reflect/Field;

    .line 318
    .line 319
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 324
    .line 325
    invoke-static {v14, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v14

    .line 329
    if-eqz v14, :cond_c

    .line 330
    .line 331
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_d
    new-instance v10, Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    :cond_e
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v13

    .line 348
    if-eqz v13, :cond_10

    .line 349
    .line 350
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v13

    .line 354
    move-object v14, v13

    .line 355
    check-cast v14, Ljava/lang/reflect/Field;

    .line 356
    .line 357
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    move-result-object v15

    .line 361
    invoke-virtual {v15}, Ljava/lang/Class;->isPrimitive()Z

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    if-nez v15, :cond_f

    .line 366
    .line 367
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    move-result-object v15

    .line 371
    invoke-static {v15, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v15

    .line 375
    if-nez v15, :cond_f

    .line 376
    .line 377
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    move-result-object v14

    .line 381
    invoke-virtual {v14}, Ljava/lang/Class;->isArray()Z

    .line 382
    .line 383
    .line 384
    move-result v14

    .line 385
    if-nez v14, :cond_f

    .line 386
    .line 387
    move v14, v9

    .line 388
    goto :goto_a

    .line 389
    :cond_f
    move v14, v7

    .line 390
    :goto_a
    if-eqz v14, :cond_e

    .line 391
    .line 392
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    goto :goto_9

    .line 396
    :cond_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    const/4 v11, 0x2

    .line 401
    if-ne v2, v11, :cond_1c

    .line 402
    .line 403
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    const/4 v13, 0x4

    .line 408
    if-ne v2, v13, :cond_1c

    .line 409
    .line 410
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eq v2, v9, :cond_11

    .line 415
    .line 416
    goto/16 :goto_13

    .line 417
    .line 418
    :cond_11
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    move v3, v7

    .line 427
    const/4 v13, 0x0

    .line 428
    :cond_12
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 429
    .line 430
    .line 431
    move-result v14

    .line 432
    if-eqz v14, :cond_15

    .line 433
    .line 434
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v14

    .line 438
    move-object v15, v14

    .line 439
    check-cast v15, Ljava/lang/reflect/Constructor;

    .line 440
    .line 441
    invoke-virtual {v15}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    move-result-object v15

    .line 445
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    array-length v15, v15

    .line 449
    if-nez v15, :cond_13

    .line 450
    .line 451
    move v15, v9

    .line 452
    goto :goto_c

    .line 453
    :cond_13
    move v15, v7

    .line 454
    :goto_c
    if-eqz v15, :cond_12

    .line 455
    .line 456
    if-eqz v3, :cond_14

    .line 457
    .line 458
    :goto_d
    const/4 v13, 0x0

    .line 459
    goto :goto_e

    .line 460
    :cond_14
    move v3, v9

    .line 461
    move-object v13, v14

    .line 462
    goto :goto_b

    .line 463
    :cond_15
    if-nez v3, :cond_16

    .line 464
    .line 465
    goto :goto_d

    .line 466
    :cond_16
    :goto_e
    check-cast v13, Ljava/lang/reflect/Constructor;

    .line 467
    .line 468
    if-eqz v13, :cond_1c

    .line 469
    .line 470
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    check-cast v2, Ljava/lang/reflect/Field;

    .line 475
    .line 476
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    move v3, v7

    .line 489
    const/4 v14, 0x0

    .line 490
    :cond_17
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 491
    .line 492
    .line 493
    move-result v15

    .line 494
    if-eqz v15, :cond_1a

    .line 495
    .line 496
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v15

    .line 500
    move-object/from16 v16, v15

    .line 501
    .line 502
    check-cast v16, Ljava/lang/reflect/Constructor;

    .line 503
    .line 504
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    array-length v5, v5

    .line 512
    if-nez v5, :cond_18

    .line 513
    .line 514
    move v5, v9

    .line 515
    goto :goto_10

    .line 516
    :cond_18
    move v5, v7

    .line 517
    :goto_10
    if-eqz v5, :cond_17

    .line 518
    .line 519
    if-eqz v3, :cond_19

    .line 520
    .line 521
    :goto_11
    const/4 v14, 0x0

    .line 522
    goto :goto_12

    .line 523
    :cond_19
    move v3, v9

    .line 524
    move-object v14, v15

    .line 525
    goto :goto_f

    .line 526
    :cond_1a
    if-nez v3, :cond_1b

    .line 527
    .line 528
    goto :goto_11

    .line 529
    :cond_1b
    :goto_12
    move-object/from16 v17, v14

    .line 530
    .line 531
    check-cast v17, Ljava/lang/reflect/Constructor;

    .line 532
    .line 533
    if-eqz v17, :cond_1c

    .line 534
    .line 535
    new-instance v2, Lhb/f;

    .line 536
    .line 537
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    check-cast v3, Ljava/lang/reflect/Field;

    .line 542
    .line 543
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v5

    .line 547
    move-object v14, v5

    .line 548
    check-cast v14, Ljava/lang/reflect/Field;

    .line 549
    .line 550
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    move-object v15, v5

    .line 555
    check-cast v15, Ljava/lang/reflect/Field;

    .line 556
    .line 557
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    move-object/from16 v16, v5

    .line 562
    .line 563
    check-cast v16, Ljava/lang/reflect/Field;

    .line 564
    .line 565
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v5

    .line 569
    move-object/from16 v18, v5

    .line 570
    .line 571
    check-cast v18, Ljava/lang/reflect/Field;

    .line 572
    .line 573
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    move-object/from16 v19, v5

    .line 578
    .line 579
    check-cast v19, Ljava/lang/reflect/Field;

    .line 580
    .line 581
    const/4 v5, 0x3

    .line 582
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v5

    .line 586
    move-object/from16 v20, v5

    .line 587
    .line 588
    check-cast v20, Ljava/lang/reflect/Field;

    .line 589
    .line 590
    move-object v10, v2

    .line 591
    move-object v11, v13

    .line 592
    move-object v13, v3

    .line 593
    invoke-direct/range {v10 .. v20}, Lhb/f;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 594
    .line 595
    .line 596
    move-object v5, v10

    .line 597
    goto :goto_14

    .line 598
    :cond_1c
    :goto_13
    const/4 v5, 0x0

    .line 599
    :goto_14
    if-eqz v5, :cond_3

    .line 600
    .line 601
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    goto/16 :goto_2

    .line 605
    .line 606
    :cond_1d
    move-object/from16 v4, p0

    .line 607
    .line 608
    invoke-static {v1}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    check-cast v0, Lhb/f;

    .line 613
    .line 614
    return-object v0
.end method

.method public final f(Ljava/util/List;Ljava/util/List;Lfg/q;)Lhb/s;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lhb/k;->f:Lhb/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :goto_0
    move-object v3, v0

    .line 8
    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {v1}, Lhb/k;->i()Lhb/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iput-object v0, v1, Lhb/k;->f:Lhb/g;

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    :goto_1
    if-eqz v0, :cond_5

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :goto_2
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-static/range {p2 .. p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v5, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_3
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    move-object v6, v5

    .line 71
    check-cast v6, Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-nez v6, :cond_3

    .line 78
    .line 79
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_4
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_5

    .line 96
    .line 97
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_6

    .line 102
    .line 103
    :cond_5
    :goto_5
    const/16 v17, 0x0

    .line 104
    .line 105
    goto/16 :goto_1c

    .line 106
    .line 107
    :cond_6
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_7
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_9

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    check-cast v5, Lhb/t;

    .line 129
    .line 130
    invoke-static {v5, v3}, Lhb/k;->h(Lhb/t;Lhb/g;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_8

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_9
    :goto_6
    new-instance v5, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-static/range {p1 .. p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_1d

    .line 155
    .line 156
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    move-object v7, v0

    .line 161
    check-cast v7, Lhb/t;

    .line 162
    .line 163
    iget v0, v7, Lhb/t;->b:I

    .line 164
    .line 165
    const v8, 0xffff

    .line 166
    .line 167
    .line 168
    and-int/2addr v8, v0

    .line 169
    const/16 v9, 0x2f

    .line 170
    .line 171
    if-ne v8, v9, :cond_a

    .line 172
    .line 173
    invoke-static {v7}, Lhb/k;->k(Lhb/t;)Lc8/a;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    move-object v10, v0

    .line 178
    goto :goto_8

    .line 179
    :cond_a
    const/4 v10, 0x0

    .line 180
    :goto_8
    const/16 v11, 0x22

    .line 181
    .line 182
    if-ne v8, v11, :cond_1a

    .line 183
    .line 184
    new-instance v0, Ljava/io/File;

    .line 185
    .line 186
    iget-object v12, v7, Lhb/t;->h:Ljava/lang/String;

    .line 187
    .line 188
    iget v13, v7, Lhb/t;->i:I

    .line 189
    .line 190
    invoke-direct {v0, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-nez v0, :cond_c

    .line 198
    .line 199
    :cond_b
    :goto_9
    move-object/from16 v18, v6

    .line 200
    .line 201
    :goto_a
    const/4 v14, 0x0

    .line 202
    goto/16 :goto_13

    .line 203
    .line 204
    :cond_c
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-eqz v0, :cond_b

    .line 209
    .line 210
    iget-object v12, v0, Lj8/p;->b:Lj8/y;

    .line 211
    .line 212
    if-eqz v12, :cond_b

    .line 213
    .line 214
    iget-object v0, v7, Lhb/t;->j:Ljava/lang/String;

    .line 215
    .line 216
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    if-nez v14, :cond_f

    .line 221
    .line 222
    iget-object v14, v12, Lj8/y;->a:Lh/Hchat/dexkit/DexFinder;

    .line 223
    .line 224
    iget-object v14, v14, Lh/Hchat/dexkit/DexFinder;->voiceFullPathMethod:Ljava/lang/reflect/Method;

    .line 225
    .line 226
    if-nez v14, :cond_d

    .line 227
    .line 228
    goto :goto_b

    .line 229
    :cond_d
    invoke-virtual {v12, v0}, Lj8/y;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v14

    .line 233
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 234
    .line 235
    .line 236
    move-result v15

    .line 237
    if-nez v15, :cond_f

    .line 238
    .line 239
    invoke-static {v14}, Leh/a;->y(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v14

    .line 243
    if-nez v14, :cond_e

    .line 244
    .line 245
    goto :goto_b

    .line 246
    :cond_e
    new-instance v14, Lj8/x;

    .line 247
    .line 248
    invoke-virtual {v12, v13}, Lj8/y;->i(I)I

    .line 249
    .line 250
    .line 251
    move-result v15

    .line 252
    invoke-direct {v14, v0, v15}, Lj8/x;-><init>(Ljava/lang/String;I)V

    .line 253
    .line 254
    .line 255
    goto :goto_c

    .line 256
    :cond_f
    :goto_b
    const/4 v14, 0x0

    .line 257
    :goto_c
    if-eqz v14, :cond_10

    .line 258
    .line 259
    move-object/from16 v18, v6

    .line 260
    .line 261
    goto/16 :goto_13

    .line 262
    .line 263
    :cond_10
    iget-object v0, v7, Lhb/t;->h:Ljava/lang/String;

    .line 264
    .line 265
    const-string v14, "\u51c6\u5907\u7fa4\u53d1\u8bed\u97f3\u5f02\u5e38: "

    .line 266
    .line 267
    const-string v15, "\u51c6\u5907\u7fa4\u53d1\u8bed\u97f3\u5931\u8d25: \u590d\u5236\u8bed\u97f3\u6587\u4ef6\u5931\u8d25 "

    .line 268
    .line 269
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 270
    .line 271
    .line 272
    move-result v16

    .line 273
    if-nez v16, :cond_b

    .line 274
    .line 275
    invoke-virtual {v12}, Lj8/y;->a()Z

    .line 276
    .line 277
    .line 278
    move-result v16

    .line 279
    if-nez v16, :cond_11

    .line 280
    .line 281
    :goto_d
    goto :goto_9

    .line 282
    :cond_11
    new-instance v11, Ljava/io/File;

    .line 283
    .line 284
    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v11}, Ljava/io/File;->isFile()Z

    .line 288
    .line 289
    .line 290
    move-result v16

    .line 291
    if-nez v16, :cond_12

    .line 292
    .line 293
    goto :goto_d

    .line 294
    :cond_12
    invoke-virtual {v12, v11}, Lj8/y;->p(Ljava/io/File;)Lac/k;

    .line 295
    .line 296
    .line 297
    move-result-object v11

    .line 298
    if-eqz v11, :cond_13

    .line 299
    .line 300
    iget-object v9, v11, Lac/k;->i:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v9, Ljava/io/File;

    .line 303
    .line 304
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 305
    .line 306
    .line 307
    move-result v17

    .line 308
    if-nez v17, :cond_14

    .line 309
    .line 310
    :cond_13
    move-object/from16 v18, v6

    .line 311
    .line 312
    goto/16 :goto_12

    .line 313
    .line 314
    :cond_14
    :try_start_0
    const-string v2, "masssendapp"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 315
    .line 316
    move-object/from16 v18, v6

    .line 317
    .line 318
    :try_start_1
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    move/from16 v19, v13

    .line 323
    .line 324
    iget v13, v11, Lac/k;->h:I

    .line 325
    .line 326
    invoke-static {v13, v6}, Lj8/y;->x(ILjava/lang/String;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    iget-object v13, v12, Lj8/y;->a:Lh/Hchat/dexkit/DexFinder;

    .line 331
    .line 332
    iget-object v13, v13, Lh/Hchat/dexkit/DexFinder;->voiceStartRecordMethod:Ljava/lang/reflect/Method;

    .line 333
    .line 334
    filled-new-array {v2, v6}, [Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    const/4 v6, 0x0

    .line 339
    invoke-static {v13, v6, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    check-cast v2, Ljava/lang/String;

    .line 344
    .line 345
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    if-eqz v6, :cond_15

    .line 350
    .line 351
    const-string v0, "\u51c6\u5907\u7fa4\u53d1\u8bed\u97f3\u5931\u8d25: \u521b\u5efavoiceinfo\u5931\u8d25"

    .line 352
    .line 353
    invoke-virtual {v12, v0}, Lj8/y;->m(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 354
    .line 355
    .line 356
    :goto_e
    invoke-virtual {v11}, Lac/k;->i()V

    .line 357
    .line 358
    .line 359
    goto/16 :goto_a

    .line 360
    .line 361
    :catchall_0
    move-exception v0

    .line 362
    goto :goto_11

    .line 363
    :cond_15
    const/4 v6, 0x1

    .line 364
    :try_start_2
    invoke-virtual {v12, v2, v6}, Lj8/y;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v13

    .line 368
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 369
    .line 370
    .line 371
    move-result v20

    .line 372
    if-eqz v20, :cond_16

    .line 373
    .line 374
    const-string v0, "\u51c6\u5907\u7fa4\u53d1\u8bed\u97f3\u5931\u8d25: \u83b7\u53d6\u8bed\u97f3\u76ee\u6807\u8def\u5f84\u5931\u8d25"

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    goto :goto_e

    .line 380
    :cond_16
    new-instance v6, Ljava/io/File;

    .line 381
    .line 382
    invoke-direct {v6, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v9, v6}, Lj8/y;->e(Ljava/io/File;Ljava/io/File;)Z

    .line 386
    .line 387
    .line 388
    move-result v6

    .line 389
    if-nez v6, :cond_17

    .line 390
    .line 391
    new-instance v0, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v12, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    goto :goto_e

    .line 407
    :cond_17
    if-lez v19, :cond_18

    .line 408
    .line 409
    move/from16 v13, v19

    .line 410
    .line 411
    :goto_f
    const/4 v0, 0x1

    .line 412
    goto :goto_10

    .line 413
    :cond_18
    invoke-static {v0}, Lj8/y;->h(Ljava/lang/String;)I

    .line 414
    .line 415
    .line 416
    move-result v13

    .line 417
    goto :goto_f

    .line 418
    :goto_10
    invoke-static {v0, v13}, Ljava/lang/Math;->max(II)I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    invoke-virtual {v12, v0}, Lj8/y;->i(I)I

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    invoke-virtual {v12, v0, v2}, Lj8/y;->j(ILjava/lang/String;)Z

    .line 427
    .line 428
    .line 429
    move-result v6

    .line 430
    if-nez v6, :cond_19

    .line 431
    .line 432
    const-string v0, "\u51c6\u5907\u7fa4\u53d1\u8bed\u97f3\u5931\u8d25: \u5b8c\u6210voiceinfo\u5931\u8d25"

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    goto :goto_e

    .line 438
    :cond_19
    new-instance v6, Lj8/x;

    .line 439
    .line 440
    invoke-direct {v6, v2, v0}, Lj8/x;-><init>(Ljava/lang/String;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 441
    .line 442
    .line 443
    invoke-virtual {v11}, Lac/k;->i()V

    .line 444
    .line 445
    .line 446
    move-object v14, v6

    .line 447
    goto :goto_13

    .line 448
    :catchall_1
    move-exception v0

    .line 449
    move-object/from16 v18, v6

    .line 450
    .line 451
    :goto_11
    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 452
    .line 453
    invoke-direct {v2, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-virtual {v12, v0}, Lj8/y;->m(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 468
    .line 469
    .line 470
    goto :goto_e

    .line 471
    :catchall_2
    move-exception v0

    .line 472
    invoke-virtual {v11}, Lac/k;->i()V

    .line 473
    .line 474
    .line 475
    throw v0

    .line 476
    :goto_12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    const-string v6, "\u51c6\u5907\u7fa4\u53d1\u8bed\u97f3\u5931\u8d25: \u97f3\u9891\u8f6c\u6362\u5931\u8d25 "

    .line 479
    .line 480
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v12, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    goto/16 :goto_a

    .line 494
    .line 495
    :goto_13
    const/16 v2, 0x2f

    .line 496
    .line 497
    goto :goto_14

    .line 498
    :cond_1a
    move-object/from16 v18, v6

    .line 499
    .line 500
    move v2, v9

    .line 501
    const/4 v14, 0x0

    .line 502
    :goto_14
    if-ne v8, v2, :cond_1b

    .line 503
    .line 504
    if-nez v10, :cond_1b

    .line 505
    .line 506
    goto/16 :goto_5

    .line 507
    .line 508
    :cond_1b
    const/16 v2, 0x22

    .line 509
    .line 510
    if-ne v8, v2, :cond_1c

    .line 511
    .line 512
    if-nez v14, :cond_1c

    .line 513
    .line 514
    goto/16 :goto_5

    .line 515
    .line 516
    :cond_1c
    new-instance v0, Lhb/h;

    .line 517
    .line 518
    invoke-direct {v0, v7, v10, v14}, Lhb/h;-><init>(Lhb/t;Lc8/a;Lj8/x;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-object/from16 v6, v18

    .line 525
    .line 526
    goto/16 :goto_7

    .line 527
    .line 528
    :cond_1d
    iget-object v0, v3, Lhb/g;->g:Ljava/lang/reflect/Method;

    .line 529
    .line 530
    const/4 v2, 0x0

    .line 531
    if-eqz v0, :cond_1e

    .line 532
    .line 533
    new-array v6, v2, [Ljava/lang/Object;

    .line 534
    .line 535
    const/4 v7, 0x0

    .line 536
    invoke-static {v0, v7, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v6

    .line 540
    goto :goto_15

    .line 541
    :cond_1e
    const/4 v6, 0x0

    .line 542
    :goto_15
    if-eqz v6, :cond_20

    .line 543
    .line 544
    iget-object v0, v3, Lhb/g;->h:Ljava/lang/reflect/Method;

    .line 545
    .line 546
    if-eqz v0, :cond_20

    .line 547
    .line 548
    new-array v2, v2, [Ljava/lang/Object;

    .line 549
    .line 550
    invoke-static {v0, v6, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    instance-of v2, v0, Ljava/lang/Number;

    .line 555
    .line 556
    if-eqz v2, :cond_1f

    .line 557
    .line 558
    move-object v6, v0

    .line 559
    check-cast v6, Ljava/lang/Number;

    .line 560
    .line 561
    goto :goto_16

    .line 562
    :cond_1f
    const/4 v6, 0x0

    .line 563
    :goto_16
    if-eqz v6, :cond_20

    .line 564
    .line 565
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 570
    .line 571
    .line 572
    move-result-object v6

    .line 573
    goto :goto_17

    .line 574
    :cond_20
    const/4 v6, 0x0

    .line 575
    :goto_17
    if-eqz v6, :cond_22

    .line 576
    .line 577
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    if-lez v0, :cond_21

    .line 582
    .line 583
    goto :goto_18

    .line 584
    :cond_21
    const/4 v6, 0x0

    .line 585
    :goto_18
    if-eqz v6, :cond_22

    .line 586
    .line 587
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    goto :goto_19

    .line 592
    :cond_22
    const/16 v0, 0x1f4

    .line 593
    .line 594
    :goto_19
    invoke-static {v0, v4}, Ltf/m;->n1(ILjava/util/List;)Ljava/util/ArrayList;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    new-instance v2, Ljava/util/ArrayList;

    .line 599
    .line 600
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    if-eqz v3, :cond_24

    .line 612
    .line 613
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    check-cast v3, Ljava/util/List;

    .line 618
    .line 619
    new-instance v6, Ljava/util/ArrayList;

    .line 620
    .line 621
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 622
    .line 623
    .line 624
    move-result v7

    .line 625
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    :goto_1b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 633
    .line 634
    .line 635
    move-result v8

    .line 636
    if-eqz v8, :cond_23

    .line 637
    .line 638
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v8

    .line 642
    check-cast v8, Lhb/h;

    .line 643
    .line 644
    new-instance v9, Lhb/j;

    .line 645
    .line 646
    iget-object v10, v8, Lhb/h;->a:Lhb/t;

    .line 647
    .line 648
    iget-object v11, v8, Lhb/h;->b:Lc8/a;

    .line 649
    .line 650
    iget-object v8, v8, Lhb/h;->c:Lj8/x;

    .line 651
    .line 652
    invoke-direct {v9, v10, v3, v11, v8}, Lhb/j;-><init>(Lhb/t;Ljava/util/List;Lc8/a;Lj8/x;)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    goto :goto_1b

    .line 659
    :cond_23
    invoke-static {v2, v6}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 660
    .line 661
    .line 662
    goto :goto_1a

    .line 663
    :cond_24
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    if-eqz v0, :cond_25

    .line 668
    .line 669
    goto/16 :goto_5

    .line 670
    .line 671
    :cond_25
    new-instance v0, Lhb/i;

    .line 672
    .line 673
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 674
    .line 675
    .line 676
    move-result-object v3

    .line 677
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v3

    .line 681
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 685
    .line 686
    .line 687
    move-result v5

    .line 688
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 689
    .line 690
    .line 691
    move-result v4

    .line 692
    mul-int/2addr v4, v5

    .line 693
    move-object/from16 v5, p3

    .line 694
    .line 695
    invoke-direct {v0, v3, v2, v4, v5}, Lhb/i;-><init>(Ljava/lang/String;Ljava/util/ArrayList;ILfg/q;)V

    .line 696
    .line 697
    .line 698
    iget-object v2, v1, Lhb/k;->c:Landroid/os/Handler;

    .line 699
    .line 700
    new-instance v3, Lhb/e;

    .line 701
    .line 702
    const/4 v4, 0x0

    .line 703
    invoke-direct {v3, v1, v0, v4}, Lhb/e;-><init>(Lhb/k;Lhb/i;I)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 707
    .line 708
    .line 709
    new-instance v2, Lhb/s;

    .line 710
    .line 711
    new-instance v3, Laa/c;

    .line 712
    .line 713
    const/16 v4, 0xd

    .line 714
    .line 715
    invoke-direct {v3, v1, v4, v0}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    invoke-direct {v2, v3}, Lhb/s;-><init>(Lfg/a;)V

    .line 719
    .line 720
    .line 721
    return-object v2

    .line 722
    :goto_1c
    return-object v17
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lhb/k;->f:Lhb/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lhb/k;->j:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final i()Lhb/g;
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lhb/k;->a:Lr8/g;

    .line 4
    .line 5
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 8
    .line 9
    iget-object v4, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    invoke-static {v2, v4}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v5, v1, Lhb/k;->d:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    const-string v6, "official_mass_send_anchor_v1"

    .line 18
    .line 19
    invoke-static {v5, v2, v4, v6}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v7, 0x1

    .line 24
    const-string v8, ""

    .line 25
    .line 26
    const-string v9, "cache.key"

    .line 27
    .line 28
    sget-object v10, Ltf/t;->g:Ltf/t;

    .line 29
    .line 30
    iget-object v11, v1, Lhb/k;->b:Lab/b;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lhb/k;->l(Ljava/lang/reflect/Method;)Lhb/g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    :goto_0
    move-object v6, v0

    .line 41
    goto/16 :goto_8

    .line 42
    .line 43
    :cond_0
    :try_start_0
    new-instance v0, Lch/e;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v13, Lfh/k;

    .line 49
    .line 50
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v14, "MicroMsg.NetSceneMasSend"

    .line 54
    .line 55
    invoke-static {v14}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v14

    .line 59
    invoke-static {v13, v14}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 60
    .line 61
    .line 62
    iput-object v13, v0, Lch/e;->h:Lfh/k;

    .line 63
    .line 64
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v13, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v14

    .line 77
    :cond_1
    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 88
    .line 89
    :try_start_1
    invoke-virtual {v0, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    goto :goto_2

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    :try_start_2
    new-instance v15, Lsf/f;

    .line 96
    .line 97
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    move-object v0, v15

    .line 101
    :goto_2
    nop

    .line 102
    instance-of v15, v0, Lsf/f;

    .line 103
    .line 104
    if-eqz v15, :cond_2

    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    :cond_2
    check-cast v0, Ljava/lang/reflect/Method;

    .line 108
    .line 109
    if-eqz v0, :cond_1

    .line 110
    .line 111
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    new-instance v13, Lsf/f;

    .line 117
    .line 118
    invoke-direct {v13, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-static {v13}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-eqz v0, :cond_4

    .line 126
    .line 127
    const-string v14, "\u5b9a\u4f4d\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u7f51\u7edc\u7c7b\u5931\u8d25"

    .line 128
    .line 129
    invoke-virtual {v11, v14, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :cond_4
    instance-of v0, v13, Lsf/f;

    .line 133
    .line 134
    if-eqz v0, :cond_5

    .line 135
    .line 136
    move-object v13, v10

    .line 137
    :cond_5
    check-cast v13, Ljava/util/List;

    .line 138
    .line 139
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 140
    .line 141
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    if-eqz v14, :cond_7

    .line 153
    .line 154
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    move-object v15, v14

    .line 159
    check-cast v15, Ljava/lang/reflect/Method;

    .line 160
    .line 161
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v15

    .line 165
    invoke-virtual {v0, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v16

    .line 169
    if-nez v16, :cond_6

    .line 170
    .line 171
    new-instance v12, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-interface {v0, v15, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-object/from16 v16, v12

    .line 180
    .line 181
    :cond_6
    move-object/from16 v12, v16

    .line 182
    .line 183
    check-cast v12, Ljava/util/List;

    .line 184
    .line 185
    invoke-interface {v12, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_7
    new-instance v12, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v13

    .line 206
    if-eqz v13, :cond_c

    .line 207
    .line 208
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v13

    .line 212
    check-cast v13, Ljava/util/Map$Entry;

    .line 213
    .line 214
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v13

    .line 218
    check-cast v13, Ljava/util/List;

    .line 219
    .line 220
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    :cond_9
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v15

    .line 228
    if-eqz v15, :cond_a

    .line 229
    .line 230
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v15

    .line 234
    check-cast v15, Ljava/lang/reflect/Method;

    .line 235
    .line 236
    invoke-virtual {v1, v15}, Lhb/k;->l(Ljava/lang/reflect/Method;)Lhb/g;

    .line 237
    .line 238
    .line 239
    move-result-object v15

    .line 240
    if-eqz v15, :cond_9

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_a
    const/4 v15, 0x0

    .line 244
    :goto_5
    if-eqz v15, :cond_b

    .line 245
    .line 246
    invoke-static {v13}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    new-instance v14, Lsf/e;

    .line 251
    .line 252
    invoke-direct {v14, v13, v15}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_b
    const/4 v14, 0x0

    .line 257
    :goto_6
    if-eqz v14, :cond_8

    .line 258
    .line 259
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_c
    invoke-static {v12}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, Lsf/e;

    .line 268
    .line 269
    if-nez v0, :cond_f

    .line 270
    .line 271
    :try_start_3
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-interface {v5, v9, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    if-nez v3, :cond_d

    .line 284
    .line 285
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-interface {v3, v9, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 290
    .line 291
    .line 292
    :cond_d
    invoke-interface {v0, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 297
    .line 298
    .line 299
    :catchall_2
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-le v0, v7, :cond_e

    .line 304
    .line 305
    const-string v0, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u7f51\u7edc\u7c7b\u5019\u9009\u4e0d\u552f\u4e00"

    .line 306
    .line 307
    const/4 v2, 0x0

    .line 308
    invoke-virtual {v11, v0, v2}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_e
    const/4 v2, 0x0

    .line 313
    :goto_7
    return-object v2

    .line 314
    :cond_f
    iget-object v12, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v12, Ljava/lang/reflect/Method;

    .line 317
    .line 318
    invoke-static {v5, v2, v6, v12}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 319
    .line 320
    .line 321
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v0, Lhb/g;

    .line 324
    .line 325
    goto/16 :goto_0

    .line 326
    .line 327
    :goto_8
    const-string v12, "official_mass_send_emoji_callback_v1"

    .line 328
    .line 329
    invoke-static {v5, v2, v4, v12}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    const-string v13, "official_mass_send_emoji_spec_v1"

    .line 334
    .line 335
    if-eqz v0, :cond_1f

    .line 336
    .line 337
    invoke-interface {v5, v13, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    if-nez v0, :cond_10

    .line 342
    .line 343
    move-object v0, v8

    .line 344
    :cond_10
    new-array v14, v7, [C

    .line 345
    .line 346
    const/16 v16, 0xa

    .line 347
    .line 348
    const/4 v15, 0x0

    .line 349
    aput-char v16, v14, v15

    .line 350
    .line 351
    const/4 v7, 0x6

    .line 352
    invoke-static {v0, v14, v7}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 357
    .line 358
    .line 359
    move-result v14

    .line 360
    const/16 v7, 0x8

    .line 361
    .line 362
    if-eq v14, v7, :cond_13

    .line 363
    .line 364
    :cond_11
    move-object/from16 v19, v10

    .line 365
    .line 366
    :cond_12
    :goto_9
    const/16 v23, 0x0

    .line 367
    .line 368
    goto/16 :goto_12

    .line 369
    .line 370
    :cond_13
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    check-cast v7, Ljava/lang/String;

    .line 375
    .line 376
    invoke-static {v7, v4}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    if-eqz v7, :cond_11

    .line 381
    .line 382
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 383
    .line 384
    .line 385
    move-result-object v14

    .line 386
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object v14

    .line 390
    move/from16 v20, v15

    .line 391
    .line 392
    const/16 v19, 0x0

    .line 393
    .line 394
    :goto_a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v21

    .line 398
    if-eqz v21, :cond_16

    .line 399
    .line 400
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v21

    .line 404
    move-object/from16 v22, v21

    .line 405
    .line 406
    check-cast v22, Ljava/lang/reflect/Constructor;

    .line 407
    .line 408
    invoke-virtual/range {v22 .. v22}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    move-result-object v15

    .line 412
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    array-length v15, v15

    .line 416
    if-nez v15, :cond_15

    .line 417
    .line 418
    if-eqz v20, :cond_14

    .line 419
    .line 420
    :goto_b
    const/16 v19, 0x0

    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_14
    move-object/from16 v19, v21

    .line 424
    .line 425
    const/4 v15, 0x0

    .line 426
    const/16 v20, 0x1

    .line 427
    .line 428
    goto :goto_a

    .line 429
    :cond_15
    const/4 v15, 0x0

    .line 430
    goto :goto_a

    .line 431
    :cond_16
    if-nez v20, :cond_17

    .line 432
    .line 433
    goto :goto_b

    .line 434
    :cond_17
    :goto_c
    move-object/from16 v24, v19

    .line 435
    .line 436
    check-cast v24, Ljava/lang/reflect/Constructor;

    .line 437
    .line 438
    if-eqz v24, :cond_11

    .line 439
    .line 440
    const-string v14, "toByteArray"

    .line 441
    .line 442
    move-object/from16 v19, v10

    .line 443
    .line 444
    const/4 v15, 0x0

    .line 445
    new-array v10, v15, [Ljava/lang/Class;

    .line 446
    .line 447
    invoke-static {v7, v14, v10}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 448
    .line 449
    .line 450
    move-result-object v10

    .line 451
    if-eqz v10, :cond_12

    .line 452
    .line 453
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    move-result-object v14

    .line 457
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    array-length v14, v14

    .line 461
    if-nez v14, :cond_18

    .line 462
    .line 463
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-result-object v14

    .line 467
    const-class v15, [B

    .line 468
    .line 469
    invoke-static {v14, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v14

    .line 473
    if-eqz v14, :cond_18

    .line 474
    .line 475
    move-object/from16 v25, v10

    .line 476
    .line 477
    goto :goto_d

    .line 478
    :cond_18
    const/16 v25, 0x0

    .line 479
    .line 480
    :goto_d
    if-eqz v25, :cond_12

    .line 481
    .line 482
    const/4 v10, 0x1

    .line 483
    invoke-static {v10, v0}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    new-instance v10, Ljava/util/ArrayList;

    .line 488
    .line 489
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 490
    .line 491
    .line 492
    move-result v14

    .line 493
    invoke-direct {v10, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 494
    .line 495
    .line 496
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result v14

    .line 504
    if-eqz v14, :cond_19

    .line 505
    .line 506
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v14

    .line 510
    check-cast v14, Ljava/lang/String;

    .line 511
    .line 512
    invoke-static {v7, v14}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 513
    .line 514
    .line 515
    move-result-object v14

    .line 516
    if-eqz v14, :cond_12

    .line 517
    .line 518
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    goto :goto_e

    .line 522
    :cond_19
    const/4 v15, 0x0

    .line 523
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    check-cast v0, Ljava/lang/reflect/Field;

    .line 528
    .line 529
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    const-class v7, Ljava/lang/String;

    .line 534
    .line 535
    invoke-static {v0, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    if-eqz v0, :cond_12

    .line 540
    .line 541
    const/4 v14, 0x1

    .line 542
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    check-cast v0, Ljava/lang/reflect/Field;

    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 553
    .line 554
    invoke-static {v0, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    if-eqz v0, :cond_12

    .line 559
    .line 560
    const/4 v0, 0x2

    .line 561
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v15

    .line 565
    check-cast v15, Ljava/lang/reflect/Field;

    .line 566
    .line 567
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    move-result-object v15

    .line 571
    invoke-static {v15, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v15

    .line 575
    if-eqz v15, :cond_12

    .line 576
    .line 577
    const/4 v15, 0x4

    .line 578
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v20

    .line 582
    check-cast v20, Ljava/lang/reflect/Field;

    .line 583
    .line 584
    invoke-virtual/range {v20 .. v20}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    move-result-object v15

    .line 588
    invoke-static {v15, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v15

    .line 592
    if-eqz v15, :cond_12

    .line 593
    .line 594
    const/4 v15, 0x5

    .line 595
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v20

    .line 599
    check-cast v20, Ljava/lang/reflect/Field;

    .line 600
    .line 601
    invoke-virtual/range {v20 .. v20}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    move-result-object v15

    .line 605
    invoke-static {v15, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v7

    .line 609
    if-eqz v7, :cond_12

    .line 610
    .line 611
    const/4 v7, 0x6

    .line 612
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v15

    .line 616
    check-cast v15, Ljava/lang/reflect/Field;

    .line 617
    .line 618
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    move-result-object v7

    .line 622
    invoke-static {v7, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    move-result v7

    .line 626
    if-nez v7, :cond_1a

    .line 627
    .line 628
    goto/16 :goto_9

    .line 629
    .line 630
    :cond_1a
    const/4 v7, 0x3

    .line 631
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v14

    .line 635
    check-cast v14, Ljava/lang/reflect/Field;

    .line 636
    .line 637
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    move-result-object v14

    .line 641
    invoke-static {v14}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 642
    .line 643
    .line 644
    move-result-object v14

    .line 645
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 646
    .line 647
    .line 648
    move-result-object v14

    .line 649
    const/4 v15, 0x0

    .line 650
    const/16 v20, 0x0

    .line 651
    .line 652
    :goto_f
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 653
    .line 654
    .line 655
    move-result v23

    .line 656
    if-eqz v23, :cond_1d

    .line 657
    .line 658
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v23

    .line 662
    move-object/from16 v26, v23

    .line 663
    .line 664
    check-cast v26, Ljava/lang/reflect/Constructor;

    .line 665
    .line 666
    invoke-virtual/range {v26 .. v26}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    move-result-object v7

    .line 670
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    array-length v7, v7

    .line 674
    if-nez v7, :cond_1c

    .line 675
    .line 676
    if-eqz v20, :cond_1b

    .line 677
    .line 678
    :goto_10
    const/4 v15, 0x0

    .line 679
    goto :goto_11

    .line 680
    :cond_1b
    move-object/from16 v15, v23

    .line 681
    .line 682
    const/4 v7, 0x3

    .line 683
    const/16 v20, 0x1

    .line 684
    .line 685
    goto :goto_f

    .line 686
    :cond_1c
    const/4 v7, 0x3

    .line 687
    goto :goto_f

    .line 688
    :cond_1d
    if-nez v20, :cond_1e

    .line 689
    .line 690
    goto :goto_10

    .line 691
    :cond_1e
    :goto_11
    move-object/from16 v30, v15

    .line 692
    .line 693
    check-cast v30, Ljava/lang/reflect/Constructor;

    .line 694
    .line 695
    if-eqz v30, :cond_12

    .line 696
    .line 697
    new-instance v23, Lhb/f;

    .line 698
    .line 699
    const/4 v15, 0x0

    .line 700
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v7

    .line 704
    move-object/from16 v26, v7

    .line 705
    .line 706
    check-cast v26, Ljava/lang/reflect/Field;

    .line 707
    .line 708
    const/4 v14, 0x1

    .line 709
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v7

    .line 713
    check-cast v7, Ljava/lang/reflect/Field;

    .line 714
    .line 715
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    move-object/from16 v28, v0

    .line 720
    .line 721
    check-cast v28, Ljava/lang/reflect/Field;

    .line 722
    .line 723
    const/4 v0, 0x3

    .line 724
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    move-object/from16 v29, v0

    .line 729
    .line 730
    check-cast v29, Ljava/lang/reflect/Field;

    .line 731
    .line 732
    const/4 v0, 0x4

    .line 733
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    move-object/from16 v31, v0

    .line 738
    .line 739
    check-cast v31, Ljava/lang/reflect/Field;

    .line 740
    .line 741
    const/4 v0, 0x5

    .line 742
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    move-object/from16 v32, v0

    .line 747
    .line 748
    check-cast v32, Ljava/lang/reflect/Field;

    .line 749
    .line 750
    const/4 v0, 0x6

    .line 751
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    move-object/from16 v33, v0

    .line 756
    .line 757
    check-cast v33, Ljava/lang/reflect/Field;

    .line 758
    .line 759
    move-object/from16 v27, v7

    .line 760
    .line 761
    invoke-direct/range {v23 .. v33}, Lhb/f;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 762
    .line 763
    .line 764
    :goto_12
    if-eqz v23, :cond_20

    .line 765
    .line 766
    move-object/from16 v22, v23

    .line 767
    .line 768
    goto/16 :goto_19

    .line 769
    .line 770
    :cond_1f
    move-object/from16 v19, v10

    .line 771
    .line 772
    :cond_20
    :try_start_4
    new-instance v0, Lch/e;

    .line 773
    .line 774
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 775
    .line 776
    .line 777
    new-instance v7, Lfh/k;

    .line 778
    .line 779
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 780
    .line 781
    .line 782
    const-string v10, "MicroMsg.MassSendFooterEventImpl"

    .line 783
    .line 784
    invoke-static {v10}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 785
    .line 786
    .line 787
    move-result-object v10

    .line 788
    invoke-static {v7, v10}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 789
    .line 790
    .line 791
    iput-object v7, v0, Lch/e;->h:Lfh/k;

    .line 792
    .line 793
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    new-instance v3, Ljava/util/ArrayList;

    .line 798
    .line 799
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 803
    .line 804
    .line 805
    move-result-object v7

    .line 806
    :cond_21
    :goto_13
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 807
    .line 808
    .line 809
    move-result v0

    .line 810
    if-eqz v0, :cond_24

    .line 811
    .line 812
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    move-object v10, v0

    .line 817
    check-cast v10, Lhh/o;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 818
    .line 819
    :try_start_5
    invoke-virtual {v10, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 820
    .line 821
    .line 822
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 823
    goto :goto_14

    .line 824
    :catchall_3
    move-exception v0

    .line 825
    :try_start_6
    new-instance v14, Lsf/f;

    .line 826
    .line 827
    invoke-direct {v14, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 828
    .line 829
    .line 830
    move-object v0, v14

    .line 831
    :goto_14
    nop

    .line 832
    instance-of v14, v0, Lsf/f;

    .line 833
    .line 834
    if-eqz v14, :cond_22

    .line 835
    .line 836
    const/4 v0, 0x0

    .line 837
    :cond_22
    check-cast v0, Ljava/lang/reflect/Method;

    .line 838
    .line 839
    if-eqz v0, :cond_23

    .line 840
    .line 841
    invoke-virtual {v1, v10}, Lhb/k;->d(Lhh/o;)Lhb/f;

    .line 842
    .line 843
    .line 844
    move-result-object v10

    .line 845
    if-eqz v10, :cond_23

    .line 846
    .line 847
    new-instance v14, Lsf/e;

    .line 848
    .line 849
    invoke-direct {v14, v0, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 850
    .line 851
    .line 852
    goto :goto_15

    .line 853
    :cond_23
    const/4 v14, 0x0

    .line 854
    goto :goto_15

    .line 855
    :catchall_4
    move-exception v0

    .line 856
    goto :goto_16

    .line 857
    :goto_15
    if-eqz v14, :cond_21

    .line 858
    .line 859
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 860
    .line 861
    .line 862
    goto :goto_13

    .line 863
    :goto_16
    new-instance v3, Lsf/f;

    .line 864
    .line 865
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 866
    .line 867
    .line 868
    :cond_24
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    if-eqz v0, :cond_25

    .line 873
    .line 874
    const-string v4, "\u5b9a\u4f4d\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u8868\u60c5\u534f\u8bae\u5931\u8d25"

    .line 875
    .line 876
    invoke-virtual {v11, v4, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    :cond_25
    instance-of v0, v3, Lsf/f;

    .line 880
    .line 881
    if-eqz v0, :cond_26

    .line 882
    .line 883
    move-object/from16 v10, v19

    .line 884
    .line 885
    goto :goto_17

    .line 886
    :cond_26
    move-object v10, v3

    .line 887
    :goto_17
    check-cast v10, Ljava/util/List;

    .line 888
    .line 889
    invoke-static {v10}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    check-cast v0, Lsf/e;

    .line 894
    .line 895
    if-nez v0, :cond_29

    .line 896
    .line 897
    :try_start_7
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-interface {v5, v9, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v3

    .line 905
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    move-result v3

    .line 909
    if-nez v3, :cond_27

    .line 910
    .line 911
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 912
    .line 913
    .line 914
    move-result-object v3

    .line 915
    invoke-interface {v3, v9, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 916
    .line 917
    .line 918
    :cond_27
    invoke-interface {v0, v12}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 923
    .line 924
    .line 925
    :catchall_5
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    invoke-interface {v0, v13}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 934
    .line 935
    .line 936
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 937
    .line 938
    .line 939
    move-result v0

    .line 940
    const/4 v14, 0x1

    .line 941
    if-le v0, v14, :cond_28

    .line 942
    .line 943
    const-string v0, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u8868\u60c5\u534f\u8bae\u5019\u9009\u4e0d\u552f\u4e00"

    .line 944
    .line 945
    const/4 v2, 0x0

    .line 946
    invoke-virtual {v11, v0, v2}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    goto :goto_18

    .line 950
    :cond_28
    const/4 v2, 0x0

    .line 951
    :goto_18
    move-object/from16 v22, v2

    .line 952
    .line 953
    goto :goto_19

    .line 954
    :cond_29
    iget-object v3, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 955
    .line 956
    iget-object v0, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 957
    .line 958
    check-cast v0, Ljava/lang/reflect/Method;

    .line 959
    .line 960
    invoke-static {v5, v2, v12, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 961
    .line 962
    .line 963
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    move-object v12, v3

    .line 968
    check-cast v12, Lhb/f;

    .line 969
    .line 970
    iget-object v2, v12, Lhb/f;->a:Ljava/lang/reflect/Constructor;

    .line 971
    .line 972
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v14

    .line 980
    iget-object v2, v12, Lhb/f;->c:Ljava/lang/reflect/Field;

    .line 981
    .line 982
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v15

    .line 986
    iget-object v2, v12, Lhb/f;->d:Ljava/lang/reflect/Field;

    .line 987
    .line 988
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v16

    .line 992
    iget-object v2, v12, Lhb/f;->e:Ljava/lang/reflect/Field;

    .line 993
    .line 994
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object v17

    .line 998
    iget-object v2, v12, Lhb/f;->f:Ljava/lang/reflect/Field;

    .line 999
    .line 1000
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v18

    .line 1004
    iget-object v2, v12, Lhb/f;->h:Ljava/lang/reflect/Field;

    .line 1005
    .line 1006
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v19

    .line 1010
    iget-object v2, v12, Lhb/f;->i:Ljava/lang/reflect/Field;

    .line 1011
    .line 1012
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v20

    .line 1016
    iget-object v2, v12, Lhb/f;->j:Ljava/lang/reflect/Field;

    .line 1017
    .line 1018
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v21

    .line 1022
    filled-new-array/range {v14 .. v21}, [Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v2

    .line 1026
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v14

    .line 1030
    const/16 v18, 0x0

    .line 1031
    .line 1032
    const/16 v19, 0x3e

    .line 1033
    .line 1034
    const-string v15, "\n"

    .line 1035
    .line 1036
    const/16 v16, 0x0

    .line 1037
    .line 1038
    const/16 v17, 0x0

    .line 1039
    .line 1040
    invoke-static/range {v14 .. v19}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v2

    .line 1044
    invoke-interface {v0, v13, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1049
    .line 1050
    .line 1051
    move-object/from16 v22, v12

    .line 1052
    .line 1053
    :goto_19
    iget-object v14, v6, Lhb/g;->a:Ljava/lang/reflect/Constructor;

    .line 1054
    .line 1055
    iget-object v15, v6, Lhb/g;->b:Ljava/lang/reflect/Constructor;

    .line 1056
    .line 1057
    iget-object v0, v6, Lhb/g;->c:Ljava/lang/reflect/Method;

    .line 1058
    .line 1059
    iget-object v2, v6, Lhb/g;->d:Ljava/lang/Object;

    .line 1060
    .line 1061
    iget-object v3, v6, Lhb/g;->e:Ljava/lang/reflect/Method;

    .line 1062
    .line 1063
    iget-object v4, v6, Lhb/g;->f:Ljava/lang/String;

    .line 1064
    .line 1065
    iget-object v5, v6, Lhb/g;->g:Ljava/lang/reflect/Method;

    .line 1066
    .line 1067
    iget-object v6, v6, Lhb/g;->h:Ljava/lang/reflect/Method;

    .line 1068
    .line 1069
    new-instance v13, Lhb/g;

    .line 1070
    .line 1071
    move-object/from16 v16, v0

    .line 1072
    .line 1073
    move-object/from16 v17, v2

    .line 1074
    .line 1075
    move-object/from16 v18, v3

    .line 1076
    .line 1077
    move-object/from16 v19, v4

    .line 1078
    .line 1079
    move-object/from16 v20, v5

    .line 1080
    .line 1081
    move-object/from16 v21, v6

    .line 1082
    .line 1083
    invoke-direct/range {v13 .. v22}, Lhb/g;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lhb/f;)V

    .line 1084
    .line 1085
    .line 1086
    return-object v13
.end method

.method public final l(Ljava/lang/reflect/Method;)Lhb/g;
    .locals 21

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x3

    .line 19
    const/16 v5, 0x2e

    .line 20
    .line 21
    const-string v6, ""

    .line 22
    .line 23
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    const/4 v8, 0x1

    .line 26
    const/4 v9, 0x0

    .line 27
    const/4 v10, 0x0

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    move-object v11, v2

    .line 35
    check-cast v11, Ljava/lang/reflect/Constructor;

    .line 36
    .line 37
    invoke-virtual {v11}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v12

    .line 41
    array-length v13, v12

    .line 42
    if-ne v13, v4, :cond_1

    .line 43
    .line 44
    aget-object v13, v12, v8

    .line 45
    .line 46
    sget-object v14, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-static {v13, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v13

    .line 52
    if-eqz v13, :cond_1

    .line 53
    .line 54
    aget-object v13, v12, v3

    .line 55
    .line 56
    invoke-static {v13, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v13

    .line 60
    if-eqz v13, :cond_1

    .line 61
    .line 62
    aget-object v12, v12, v9

    .line 63
    .line 64
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    invoke-static {v12, v5, v6}, Log/m;->O0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    invoke-virtual {v11}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    invoke-static {v11, v5, v6}, Log/m;->O0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-eqz v11, :cond_1

    .line 89
    .line 90
    move v11, v8

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    move v11, v9

    .line 93
    :goto_0
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    if-eqz v11, :cond_0

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move-object v2, v10

    .line 105
    :goto_1
    move-object v12, v2

    .line 106
    check-cast v12, Ljava/lang/reflect/Constructor;

    .line 107
    .line 108
    if-eqz v12, :cond_2a

    .line 109
    .line 110
    invoke-virtual {v12}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    aget-object v1, v1, v9

    .line 115
    .line 116
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    if-eqz v11, :cond_5

    .line 129
    .line 130
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    move-object v13, v11

    .line 135
    check-cast v13, Ljava/lang/reflect/Constructor;

    .line 136
    .line 137
    invoke-virtual {v13}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v13

    .line 141
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    array-length v13, v13

    .line 145
    if-nez v13, :cond_4

    .line 146
    .line 147
    move v13, v8

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    move v13, v9

    .line 150
    :goto_2
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-eqz v13, :cond_3

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_5
    move-object v11, v10

    .line 162
    :goto_3
    move-object v13, v11

    .line 163
    check-cast v13, Ljava/lang/reflect/Constructor;

    .line 164
    .line 165
    if-eqz v13, :cond_2a

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-static {v2, v5, v6}, Log/m;->O0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-eqz v5, :cond_6

    .line 180
    .line 181
    return-object v10

    .line 182
    :cond_6
    const-string v5, ".z"

    .line 183
    .line 184
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    move-object/from16 v6, p0

    .line 189
    .line 190
    iget-object v11, v6, Lhb/k;->a:Lr8/g;

    .line 191
    .line 192
    iget-object v14, v11, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 193
    .line 194
    invoke-static {v5, v14}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    const-string v14, ".k0"

    .line 199
    .line 200
    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v14

    .line 204
    iget-object v15, v11, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 205
    .line 206
    invoke-static {v14, v15}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    const-string v15, ".a0"

    .line 211
    .line 212
    invoke-virtual {v2, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    iget-object v11, v11, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 217
    .line 218
    invoke-static {v2, v11}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    if-eqz v5, :cond_b

    .line 223
    .line 224
    if-eqz v14, :cond_b

    .line 225
    .line 226
    invoke-static {v14}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v11

    .line 234
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v15

    .line 238
    if-eqz v15, :cond_9

    .line 239
    .line 240
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v15

    .line 244
    move-object/from16 v16, v15

    .line 245
    .line 246
    check-cast v16, Ljava/lang/reflect/Method;

    .line 247
    .line 248
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 249
    .line 250
    .line 251
    move-result v17

    .line 252
    invoke-static/range {v17 .. v17}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 253
    .line 254
    .line 255
    move-result v17

    .line 256
    move/from16 p1, v3

    .line 257
    .line 258
    if-eqz v17, :cond_7

    .line 259
    .line 260
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    array-length v3, v3

    .line 268
    if-nez v3, :cond_7

    .line 269
    .line 270
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-static {v3, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-eqz v3, :cond_7

    .line 279
    .line 280
    move v3, v8

    .line 281
    goto :goto_5

    .line 282
    :cond_7
    move v3, v9

    .line 283
    :goto_5
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-eqz v3, :cond_8

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_8
    move/from16 v3, p1

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_9
    move/from16 p1, v3

    .line 298
    .line 299
    move-object v15, v10

    .line 300
    :goto_6
    check-cast v15, Ljava/lang/reflect/Method;

    .line 301
    .line 302
    if-eqz v15, :cond_a

    .line 303
    .line 304
    new-array v3, v9, [Ljava/lang/Object;

    .line 305
    .line 306
    invoke-static {v15, v10, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    goto :goto_7

    .line 311
    :cond_a
    move-object v3, v10

    .line 312
    :goto_7
    move-object v15, v3

    .line 313
    goto :goto_8

    .line 314
    :cond_b
    move/from16 p1, v3

    .line 315
    .line 316
    move-object v15, v10

    .line 317
    :goto_8
    if-eqz v2, :cond_12

    .line 318
    .line 319
    if-eqz v14, :cond_12

    .line 320
    .line 321
    invoke-static {v14}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    move v11, v9

    .line 330
    move-object v14, v10

    .line 331
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    .line 333
    .line 334
    move-result v16

    .line 335
    if-eqz v16, :cond_10

    .line 336
    .line 337
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v16

    .line 341
    move-object/from16 v17, v16

    .line 342
    .line 343
    check-cast v17, Ljava/lang/reflect/Method;

    .line 344
    .line 345
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 346
    .line 347
    .line 348
    move-result v18

    .line 349
    invoke-static/range {v18 .. v18}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 350
    .line 351
    .line 352
    move-result v18

    .line 353
    if-eqz v18, :cond_c

    .line 354
    .line 355
    move/from16 v18, v4

    .line 356
    .line 357
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    array-length v4, v4

    .line 365
    if-nez v4, :cond_d

    .line 366
    .line 367
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    if-eqz v4, :cond_d

    .line 376
    .line 377
    move v4, v8

    .line 378
    goto :goto_a

    .line 379
    :cond_c
    move/from16 v18, v4

    .line 380
    .line 381
    :cond_d
    move v4, v9

    .line 382
    :goto_a
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    if-eqz v4, :cond_f

    .line 391
    .line 392
    if-eqz v11, :cond_e

    .line 393
    .line 394
    :goto_b
    move-object v14, v10

    .line 395
    goto :goto_c

    .line 396
    :cond_e
    move v11, v8

    .line 397
    move-object/from16 v14, v16

    .line 398
    .line 399
    :cond_f
    move/from16 v4, v18

    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_10
    move/from16 v18, v4

    .line 403
    .line 404
    if-nez v11, :cond_11

    .line 405
    .line 406
    goto :goto_b

    .line 407
    :cond_11
    :goto_c
    check-cast v14, Ljava/lang/reflect/Method;

    .line 408
    .line 409
    goto :goto_d

    .line 410
    :cond_12
    move/from16 v18, v4

    .line 411
    .line 412
    move-object v14, v10

    .line 413
    :goto_d
    if-eqz v2, :cond_19

    .line 414
    .line 415
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    move v3, v9

    .line 424
    move-object v4, v10

    .line 425
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 426
    .line 427
    .line 428
    move-result v11

    .line 429
    if-eqz v11, :cond_17

    .line 430
    .line 431
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v11

    .line 435
    move-object/from16 v16, v11

    .line 436
    .line 437
    check-cast v16, Ljava/lang/reflect/Method;

    .line 438
    .line 439
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 440
    .line 441
    .line 442
    move-result v17

    .line 443
    invoke-static/range {v17 .. v17}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 444
    .line 445
    .line 446
    move-result v17

    .line 447
    if-nez v17, :cond_13

    .line 448
    .line 449
    move/from16 v17, v8

    .line 450
    .line 451
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    move-result-object v8

    .line 455
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    array-length v8, v8

    .line 459
    if-nez v8, :cond_14

    .line 460
    .line 461
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    invoke-static {v8, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v8

    .line 469
    if-eqz v8, :cond_14

    .line 470
    .line 471
    move/from16 v8, v17

    .line 472
    .line 473
    goto :goto_f

    .line 474
    :cond_13
    move/from16 v17, v8

    .line 475
    .line 476
    :cond_14
    move v8, v9

    .line 477
    :goto_f
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 482
    .line 483
    .line 484
    move-result v8

    .line 485
    if-eqz v8, :cond_16

    .line 486
    .line 487
    if-eqz v3, :cond_15

    .line 488
    .line 489
    :goto_10
    move-object v4, v10

    .line 490
    goto :goto_11

    .line 491
    :cond_15
    move-object v4, v11

    .line 492
    move/from16 v3, v17

    .line 493
    .line 494
    move v8, v3

    .line 495
    goto :goto_e

    .line 496
    :cond_16
    move/from16 v8, v17

    .line 497
    .line 498
    goto :goto_e

    .line 499
    :cond_17
    move/from16 v17, v8

    .line 500
    .line 501
    if-nez v3, :cond_18

    .line 502
    .line 503
    goto :goto_10

    .line 504
    :cond_18
    :goto_11
    check-cast v4, Ljava/lang/reflect/Method;

    .line 505
    .line 506
    move-object/from16 v19, v4

    .line 507
    .line 508
    goto :goto_12

    .line 509
    :cond_19
    move/from16 v17, v8

    .line 510
    .line 511
    move-object/from16 v19, v10

    .line 512
    .line 513
    :goto_12
    const-class v2, Ljava/lang/String;

    .line 514
    .line 515
    if-eqz v5, :cond_20

    .line 516
    .line 517
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    move v4, v9

    .line 526
    move-object v5, v10

    .line 527
    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 528
    .line 529
    .line 530
    move-result v8

    .line 531
    if-eqz v8, :cond_1e

    .line 532
    .line 533
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v8

    .line 537
    move-object v11, v8

    .line 538
    check-cast v11, Ljava/lang/reflect/Method;

    .line 539
    .line 540
    move/from16 v16, v9

    .line 541
    .line 542
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    move-result-object v9

    .line 546
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    move-result-object v11

    .line 550
    invoke-static {v11, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v11

    .line 554
    if-eqz v11, :cond_1a

    .line 555
    .line 556
    array-length v11, v9

    .line 557
    move-object/from16 v20, v10

    .line 558
    .line 559
    const/4 v10, 0x4

    .line 560
    if-ne v11, v10, :cond_1b

    .line 561
    .line 562
    aget-object v10, v9, v16

    .line 563
    .line 564
    invoke-static {v10, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v10

    .line 568
    if-eqz v10, :cond_1b

    .line 569
    .line 570
    aget-object v10, v9, v17

    .line 571
    .line 572
    invoke-static {v10, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v10

    .line 576
    if-eqz v10, :cond_1b

    .line 577
    .line 578
    aget-object v10, v9, p1

    .line 579
    .line 580
    invoke-static {v10, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v10

    .line 584
    if-eqz v10, :cond_1b

    .line 585
    .line 586
    aget-object v9, v9, v18

    .line 587
    .line 588
    invoke-static {v9, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v9

    .line 592
    if-eqz v9, :cond_1b

    .line 593
    .line 594
    move/from16 v9, v17

    .line 595
    .line 596
    goto :goto_14

    .line 597
    :cond_1a
    move-object/from16 v20, v10

    .line 598
    .line 599
    :cond_1b
    move/from16 v9, v16

    .line 600
    .line 601
    :goto_14
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 602
    .line 603
    .line 604
    move-result-object v9

    .line 605
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 606
    .line 607
    .line 608
    move-result v9

    .line 609
    if-eqz v9, :cond_1d

    .line 610
    .line 611
    if-eqz v4, :cond_1c

    .line 612
    .line 613
    :goto_15
    move-object/from16 v5, v20

    .line 614
    .line 615
    goto :goto_17

    .line 616
    :cond_1c
    move-object v5, v8

    .line 617
    move/from16 v9, v16

    .line 618
    .line 619
    move/from16 v4, v17

    .line 620
    .line 621
    :goto_16
    move-object/from16 v10, v20

    .line 622
    .line 623
    goto :goto_13

    .line 624
    :cond_1d
    move/from16 v9, v16

    .line 625
    .line 626
    goto :goto_16

    .line 627
    :cond_1e
    move/from16 v16, v9

    .line 628
    .line 629
    move-object/from16 v20, v10

    .line 630
    .line 631
    if-nez v4, :cond_1f

    .line 632
    .line 633
    goto :goto_15

    .line 634
    :cond_1f
    :goto_17
    check-cast v5, Ljava/lang/reflect/Method;

    .line 635
    .line 636
    goto :goto_18

    .line 637
    :cond_20
    move/from16 v16, v9

    .line 638
    .line 639
    move-object/from16 v20, v10

    .line 640
    .line 641
    move-object/from16 v5, v20

    .line 642
    .line 643
    :goto_18
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    move/from16 v3, v16

    .line 652
    .line 653
    move-object/from16 v4, v20

    .line 654
    .line 655
    :cond_21
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 656
    .line 657
    .line 658
    move-result v7

    .line 659
    if-eqz v7, :cond_24

    .line 660
    .line 661
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v7

    .line 665
    move-object v8, v7

    .line 666
    check-cast v8, Ljava/lang/reflect/Method;

    .line 667
    .line 668
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v9

    .line 672
    const-string v10, "onGYNetEnd"

    .line 673
    .line 674
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    move-result v9

    .line 678
    if-eqz v9, :cond_22

    .line 679
    .line 680
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    move-result-object v9

    .line 684
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 685
    .line 686
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result v9

    .line 690
    if-eqz v9, :cond_22

    .line 691
    .line 692
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    move-result-object v8

    .line 696
    array-length v8, v8

    .line 697
    const/4 v9, 0x6

    .line 698
    if-ne v8, v9, :cond_22

    .line 699
    .line 700
    move/from16 v8, v17

    .line 701
    .line 702
    goto :goto_1a

    .line 703
    :cond_22
    move/from16 v8, v16

    .line 704
    .line 705
    :goto_1a
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 706
    .line 707
    .line 708
    move-result-object v8

    .line 709
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 710
    .line 711
    .line 712
    move-result v8

    .line 713
    if-eqz v8, :cond_21

    .line 714
    .line 715
    if-eqz v3, :cond_23

    .line 716
    .line 717
    :goto_1b
    move-object/from16 v4, v20

    .line 718
    .line 719
    goto :goto_1c

    .line 720
    :cond_23
    move-object v4, v7

    .line 721
    move/from16 v3, v17

    .line 722
    .line 723
    goto :goto_19

    .line 724
    :cond_24
    if-nez v3, :cond_25

    .line 725
    .line 726
    goto :goto_1b

    .line 727
    :cond_25
    :goto_1c
    check-cast v4, Ljava/lang/reflect/Method;

    .line 728
    .line 729
    if-eqz v4, :cond_29

    .line 730
    .line 731
    const-string v0, "j"

    .line 732
    .line 733
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 734
    .line 735
    .line 736
    move-result-object v3

    .line 737
    if-eqz v3, :cond_26

    .line 738
    .line 739
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    move-result-object v3

    .line 743
    goto :goto_1d

    .line 744
    :cond_26
    move-object/from16 v3, v20

    .line 745
    .line 746
    :goto_1d
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    move-result v3

    .line 750
    if-eqz v3, :cond_27

    .line 751
    .line 752
    :goto_1e
    move-object/from16 v17, v0

    .line 753
    .line 754
    goto :goto_20

    .line 755
    :cond_27
    const-string v0, "m"

    .line 756
    .line 757
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    if-eqz v1, :cond_28

    .line 762
    .line 763
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    goto :goto_1f

    .line 768
    :cond_28
    move-object/from16 v1, v20

    .line 769
    .line 770
    :goto_1f
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    move-result v1

    .line 774
    if-eqz v1, :cond_29

    .line 775
    .line 776
    goto :goto_1e

    .line 777
    :goto_20
    new-instance v11, Lhb/g;

    .line 778
    .line 779
    const/16 v20, 0x0

    .line 780
    .line 781
    move-object/from16 v16, v5

    .line 782
    .line 783
    move-object/from16 v18, v14

    .line 784
    .line 785
    move-object v14, v4

    .line 786
    invoke-direct/range {v11 .. v20}, Lhb/g;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lhb/f;)V

    .line 787
    .line 788
    .line 789
    return-object v11

    .line 790
    :cond_29
    return-object v20

    .line 791
    :cond_2a
    move-object/from16 v6, p0

    .line 792
    .line 793
    move-object/from16 v20, v10

    .line 794
    .line 795
    return-object v20
.end method

.method public final m(Lhb/i;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    iget-object v0, v1, Lhb/k;->g:Lhb/i;

    .line 6
    .line 7
    if-eq v0, v4, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget v0, v4, Lhb/i;->e:I

    .line 11
    .line 12
    iget-object v2, v4, Lhb/i;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-lt v0, v2, :cond_2

    .line 20
    .line 21
    iget v0, v4, Lhb/i;->f:I

    .line 22
    .line 23
    iget v2, v4, Lhb/i;->c:I

    .line 24
    .line 25
    iget-object v4, v4, Lhb/i;->d:Lfg/q;

    .line 26
    .line 27
    iput-object v3, v1, Lhb/k;->g:Lhb/i;

    .line 28
    .line 29
    iput-object v3, v1, Lhb/k;->h:Ljava/lang/Object;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-interface {v4, v0, v2, v3}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {v1}, Lhb/k;->n()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    iget-object v0, v1, Lhb/k;->f:Lhb/g;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    invoke-virtual {v1, v4, v2}, Lhb/k;->a(Lhb/i;Z)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    iget-object v5, v4, Lhb/i;->b:Ljava/util/ArrayList;

    .line 60
    .line 61
    iget v6, v4, Lhb/i;->e:I

    .line 62
    .line 63
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Lhb/j;

    .line 68
    .line 69
    iget-object v6, v5, Lhb/j;->b:Ljava/util/List;

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    const/16 v11, 0x3e

    .line 73
    .line 74
    const-string v7, ";"

    .line 75
    .line 76
    const/4 v8, 0x0

    .line 77
    const/4 v9, 0x0

    .line 78
    invoke-static/range {v6 .. v11}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    iget-object v7, v5, Lhb/j;->a:Lhb/t;

    .line 83
    .line 84
    iget-object v8, v5, Lhb/j;->b:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    iget-object v9, v5, Lhb/j;->c:Lc8/a;

    .line 91
    .line 92
    iget-object v10, v5, Lhb/j;->d:Lj8/x;

    .line 93
    .line 94
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    iget v12, v7, Lhb/t;->b:I

    .line 99
    .line 100
    iget-object v13, v7, Lhb/t;->g:Lk8/t;

    .line 101
    .line 102
    const v14, 0xffff

    .line 103
    .line 104
    .line 105
    and-int/2addr v12, v14

    .line 106
    move/from16 v16, v14

    .line 107
    .line 108
    const/4 v3, 0x3

    .line 109
    const/16 v18, 0x1

    .line 110
    .line 111
    const-string v14, ""

    .line 112
    .line 113
    if-ne v12, v3, :cond_8

    .line 114
    .line 115
    iget-object v7, v0, Lhb/g;->d:Ljava/lang/Object;

    .line 116
    .line 117
    if-eqz v7, :cond_6

    .line 118
    .line 119
    if-eqz v13, :cond_4

    .line 120
    .line 121
    iget-object v9, v13, Lk8/t;->f:Ljava/lang/String;

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_4
    const/4 v9, 0x0

    .line 125
    :goto_0
    if-nez v9, :cond_5

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_5
    move-object v14, v9

    .line 129
    :goto_1
    iget-object v9, v0, Lhb/g;->e:Ljava/lang/reflect/Method;

    .line 130
    .line 131
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    filled-new-array {v14, v6, v8, v10}, [Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    invoke-static {v9, v7, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    move-object/from16 v21, v5

    .line 148
    .line 149
    const/16 v4, 0x3e

    .line 150
    .line 151
    goto/16 :goto_d

    .line 152
    .line 153
    :cond_6
    move-object/from16 v21, v5

    .line 154
    .line 155
    :cond_7
    const/16 v4, 0x3e

    .line 156
    .line 157
    const/4 v6, 0x0

    .line 158
    goto/16 :goto_d

    .line 159
    .line 160
    :cond_8
    iget-object v3, v0, Lhb/g;->b:Ljava/lang/reflect/Constructor;

    .line 161
    .line 162
    new-array v15, v2, [Ljava/lang/Object;

    .line 163
    .line 164
    invoke-static {v3, v15}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    if-eqz v3, :cond_6

    .line 169
    .line 170
    const/16 v15, 0x2f

    .line 171
    .line 172
    if-ne v12, v15, :cond_a

    .line 173
    .line 174
    iget-object v15, v0, Lhb/g;->i:Lhb/f;

    .line 175
    .line 176
    if-eqz v15, :cond_6

    .line 177
    .line 178
    if-eqz v9, :cond_6

    .line 179
    .line 180
    move/from16 v20, v8

    .line 181
    .line 182
    iget-object v8, v15, Lhb/f;->a:Ljava/lang/reflect/Constructor;

    .line 183
    .line 184
    move-object/from16 v21, v5

    .line 185
    .line 186
    new-array v5, v2, [Ljava/lang/Object;

    .line 187
    .line 188
    invoke-static {v8, v5}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    if-eqz v5, :cond_9

    .line 193
    .line 194
    iget-object v8, v15, Lhb/f;->g:Ljava/lang/reflect/Constructor;

    .line 195
    .line 196
    new-array v1, v2, [Ljava/lang/Object;

    .line 197
    .line 198
    invoke-static {v8, v1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    if-eqz v1, :cond_9

    .line 203
    .line 204
    iget-object v8, v15, Lhb/f;->c:Ljava/lang/reflect/Field;

    .line 205
    .line 206
    iget-object v2, v9, Lc8/a;->d:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v2, Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v8, v5, v2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    iget-object v2, v15, Lhb/f;->d:Ljava/lang/reflect/Field;

    .line 214
    .line 215
    invoke-static {v2, v5, v11}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    iget-object v2, v15, Lhb/f;->e:Ljava/lang/reflect/Field;

    .line 219
    .line 220
    iget v8, v9, Lc8/a;->b:I

    .line 221
    .line 222
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    invoke-static {v2, v5, v8}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    iget-object v2, v15, Lhb/f;->f:Ljava/lang/reflect/Field;

    .line 230
    .line 231
    invoke-static {v2, v5, v1}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    iget-object v1, v15, Lhb/f;->h:Ljava/lang/reflect/Field;

    .line 235
    .line 236
    iget v2, v9, Lc8/a;->c:I

    .line 237
    .line 238
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-static {v1, v5, v2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    iget-object v1, v15, Lhb/f;->i:Ljava/lang/reflect/Field;

    .line 246
    .line 247
    iget-object v2, v9, Lc8/a;->e:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v2, Ljava/lang/String;

    .line 250
    .line 251
    invoke-static {v1, v5, v2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    iget-object v1, v15, Lhb/f;->j:Ljava/lang/reflect/Field;

    .line 255
    .line 256
    invoke-static {v1, v5, v11}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    iget-object v1, v15, Lhb/f;->b:Ljava/lang/reflect/Method;

    .line 260
    .line 261
    const/4 v2, 0x0

    .line 262
    new-array v8, v2, [Ljava/lang/Object;

    .line 263
    .line 264
    invoke-static {v1, v5, v8}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    instance-of v2, v1, [B

    .line 269
    .line 270
    if-eqz v2, :cond_9

    .line 271
    .line 272
    check-cast v1, [B

    .line 273
    .line 274
    goto :goto_2

    .line 275
    :cond_9
    const/4 v1, 0x0

    .line 276
    :goto_2
    if-eqz v1, :cond_7

    .line 277
    .line 278
    :goto_3
    const/16 v2, 0x22

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_a
    move-object/from16 v21, v5

    .line 282
    .line 283
    move/from16 v20, v8

    .line 284
    .line 285
    const/4 v1, 0x0

    .line 286
    goto :goto_3

    .line 287
    :goto_4
    if-eq v12, v2, :cond_10

    .line 288
    .line 289
    const/16 v2, 0x2b

    .line 290
    .line 291
    if-eq v12, v2, :cond_f

    .line 292
    .line 293
    const/16 v2, 0x2f

    .line 294
    .line 295
    if-eq v12, v2, :cond_d

    .line 296
    .line 297
    const/16 v2, 0x3e

    .line 298
    .line 299
    if-eq v12, v2, :cond_f

    .line 300
    .line 301
    if-eqz v13, :cond_b

    .line 302
    .line 303
    iget-object v2, v13, Lk8/t;->c:Ljava/lang/String;

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_b
    const/4 v2, 0x0

    .line 307
    :goto_5
    if-nez v2, :cond_c

    .line 308
    .line 309
    move-object v2, v14

    .line 310
    :cond_c
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    if-eqz v5, :cond_12

    .line 315
    .line 316
    iget-object v2, v7, Lhb/t;->d:Ljava/lang/String;

    .line 317
    .line 318
    goto :goto_9

    .line 319
    :cond_d
    if-eqz v9, :cond_e

    .line 320
    .line 321
    iget-object v2, v9, Lc8/a;->d:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v2, Ljava/lang/String;

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_e
    const/4 v2, 0x0

    .line 327
    :goto_6
    if-nez v2, :cond_12

    .line 328
    .line 329
    :goto_7
    move-object v2, v14

    .line 330
    goto :goto_9

    .line 331
    :cond_f
    invoke-static {v7}, Lhb/k;->p(Lhb/t;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    goto :goto_9

    .line 336
    :cond_10
    if-eqz v10, :cond_11

    .line 337
    .line 338
    iget-object v2, v10, Lj8/x;->b:Ljava/lang/String;

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_11
    const/4 v2, 0x0

    .line 342
    :goto_8
    if-nez v2, :cond_12

    .line 343
    .line 344
    goto :goto_7

    .line 345
    :cond_12
    :goto_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 346
    .line 347
    .line 348
    move-result-wide v8

    .line 349
    iget-wide v4, v7, Lhb/t;->a:J

    .line 350
    .line 351
    const-string v7, "Hchat_"

    .line 352
    .line 353
    const-string v13, "_"

    .line 354
    .line 355
    invoke-static {v8, v9, v7, v13}, Lp/a;->o(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    move-result-object v7

    .line 359
    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    const-string v5, "d"

    .line 367
    .line 368
    invoke-static {v3, v5, v4}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 369
    .line 370
    .line 371
    const/16 v4, 0x68

    .line 372
    .line 373
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    const-string v5, "e"

    .line 378
    .line 379
    invoke-static {v3, v5, v4}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 380
    .line 381
    .line 382
    const-string v4, "f"

    .line 383
    .line 384
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    invoke-static {v3, v4, v5}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 389
    .line 390
    .line 391
    const-wide/16 v4, 0x0

    .line 392
    .line 393
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    const-string v5, "g"

    .line 398
    .line 399
    invoke-static {v3, v5, v4}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 400
    .line 401
    .line 402
    const-string v4, "h"

    .line 403
    .line 404
    invoke-static {v3, v4, v2}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 405
    .line 406
    .line 407
    const-string v4, "i"

    .line 408
    .line 409
    invoke-static {v3, v4, v14}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 410
    .line 411
    .line 412
    iget-object v4, v0, Lhb/g;->f:Ljava/lang/String;

    .line 413
    .line 414
    invoke-static {v3, v4, v6}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 415
    .line 416
    .line 417
    const-string v4, "n"

    .line 418
    .line 419
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    invoke-static {v3, v4, v5}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 424
    .line 425
    .line 426
    const/16 v4, 0x3e

    .line 427
    .line 428
    if-ne v12, v4, :cond_13

    .line 429
    .line 430
    const/16 v5, 0x2b

    .line 431
    .line 432
    goto :goto_a

    .line 433
    :cond_13
    move v5, v12

    .line 434
    :goto_a
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    const-string v6, "o"

    .line 439
    .line 440
    invoke-static {v3, v6, v5}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 441
    .line 442
    .line 443
    const/16 v5, 0x22

    .line 444
    .line 445
    if-ne v12, v5, :cond_14

    .line 446
    .line 447
    if-eqz v10, :cond_14

    .line 448
    .line 449
    iget v5, v10, Lj8/x;->a:I

    .line 450
    .line 451
    goto :goto_b

    .line 452
    :cond_14
    const/4 v5, 0x0

    .line 453
    :goto_b
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    const-string v6, "p"

    .line 458
    .line 459
    invoke-static {v3, v6, v5}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 460
    .line 461
    .line 462
    const-string v5, "q"

    .line 463
    .line 464
    invoke-static {v3, v5, v11}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 465
    .line 466
    .line 467
    if-eqz v1, :cond_15

    .line 468
    .line 469
    array-length v2, v1

    .line 470
    goto :goto_c

    .line 471
    :cond_15
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 472
    .line 473
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    array-length v2, v2

    .line 484
    :goto_c
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    const-string v5, "r"

    .line 489
    .line 490
    invoke-static {v3, v5, v2}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 491
    .line 492
    .line 493
    const-string v2, "s"

    .line 494
    .line 495
    invoke-static {v3, v2, v11}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 496
    .line 497
    .line 498
    const-string v2, "t"

    .line 499
    .line 500
    invoke-static {v3, v2, v11}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 501
    .line 502
    .line 503
    const-string v2, "u"

    .line 504
    .line 505
    invoke-static {v3, v2, v11}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 506
    .line 507
    .line 508
    const-string v2, "v"

    .line 509
    .line 510
    invoke-static {v3, v2, v11}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 511
    .line 512
    .line 513
    const-string v2, "w"

    .line 514
    .line 515
    invoke-static {v3, v2, v14}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 516
    .line 517
    .line 518
    const-string v2, "x"

    .line 519
    .line 520
    invoke-static {v3, v2, v14}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 521
    .line 522
    .line 523
    if-eqz v1, :cond_16

    .line 524
    .line 525
    const-string v2, "y"

    .line 526
    .line 527
    invoke-static {v3, v2, v1}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 528
    .line 529
    .line 530
    :cond_16
    const/4 v1, -0x1

    .line 531
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    const-string v2, "z"

    .line 536
    .line 537
    invoke-static {v3, v2, v1}, Lhb/k;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 538
    .line 539
    .line 540
    move-object v6, v3

    .line 541
    :goto_d
    if-nez v6, :cond_17

    .line 542
    .line 543
    const/4 v2, 0x0

    .line 544
    move-object/from16 v1, p0

    .line 545
    .line 546
    move-object/from16 v4, p1

    .line 547
    .line 548
    invoke-virtual {v1, v4, v2}, Lhb/k;->a(Lhb/i;Z)V

    .line 549
    .line 550
    .line 551
    return-void

    .line 552
    :cond_17
    move-object/from16 v1, p0

    .line 553
    .line 554
    move/from16 v17, v4

    .line 555
    .line 556
    move-object/from16 v3, v21

    .line 557
    .line 558
    move-object/from16 v4, p1

    .line 559
    .line 560
    iget-object v2, v3, Lhb/j;->a:Lhb/t;

    .line 561
    .line 562
    iget v2, v2, Lhb/t;->b:I

    .line 563
    .line 564
    and-int v2, v2, v16

    .line 565
    .line 566
    const/4 v5, 0x3

    .line 567
    if-ne v2, v5, :cond_18

    .line 568
    .line 569
    move/from16 v2, v18

    .line 570
    .line 571
    goto :goto_e

    .line 572
    :cond_18
    const/4 v2, 0x0

    .line 573
    :goto_e
    iget-object v0, v0, Lhb/g;->a:Ljava/lang/reflect/Constructor;

    .line 574
    .line 575
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 576
    .line 577
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    filled-new-array {v6, v7, v2}, [Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    invoke-static {v0, v2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    if-nez v2, :cond_19

    .line 590
    .line 591
    const/4 v6, 0x0

    .line 592
    invoke-virtual {v1, v4, v6}, Lhb/k;->a(Lhb/i;Z)V

    .line 593
    .line 594
    .line 595
    return-void

    .line 596
    :cond_19
    iput-object v2, v1, Lhb/k;->h:Ljava/lang/Object;

    .line 597
    .line 598
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->network()Lm8/a;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    if-eqz v0, :cond_1a

    .line 603
    .line 604
    iget-object v0, v0, Lm8/a;->a:Lm8/c;

    .line 605
    .line 606
    invoke-virtual {v0, v2}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    move/from16 v6, v18

    .line 611
    .line 612
    if-ne v0, v6, :cond_1a

    .line 613
    .line 614
    move v14, v6

    .line 615
    goto :goto_f

    .line 616
    :cond_1a
    const/4 v14, 0x0

    .line 617
    :goto_f
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 618
    .line 619
    .line 620
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 621
    goto :goto_10

    .line 622
    :catchall_0
    move-exception v0

    .line 623
    new-instance v6, Lsf/f;

    .line 624
    .line 625
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 626
    .line 627
    .line 628
    move-object v0, v6

    .line 629
    :goto_10
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 630
    .line 631
    .line 632
    move-result-object v6

    .line 633
    if-eqz v6, :cond_1b

    .line 634
    .line 635
    iget-object v7, v1, Lhb/k;->b:Lab/b;

    .line 636
    .line 637
    const-string v8, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u6d3e\u53d1\u5931\u8d25"

    .line 638
    .line 639
    invoke-virtual {v7, v8, v6}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    :cond_1b
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 643
    .line 644
    instance-of v7, v0, Lsf/f;

    .line 645
    .line 646
    if-eqz v7, :cond_1c

    .line 647
    .line 648
    move-object v0, v6

    .line 649
    :cond_1c
    check-cast v0, Ljava/lang/Boolean;

    .line 650
    .line 651
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    if-nez v0, :cond_1d

    .line 656
    .line 657
    const/4 v6, 0x0

    .line 658
    iput-object v6, v1, Lhb/k;->h:Ljava/lang/Object;

    .line 659
    .line 660
    const/4 v2, 0x0

    .line 661
    invoke-virtual {v1, v4, v2}, Lhb/k;->a(Lhb/i;Z)V

    .line 662
    .line 663
    .line 664
    return-void

    .line 665
    :cond_1d
    new-instance v0, Lb9/c;

    .line 666
    .line 667
    move/from16 v19, v5

    .line 668
    .line 669
    const/4 v5, 0x5

    .line 670
    move/from16 v6, v17

    .line 671
    .line 672
    move/from16 v7, v19

    .line 673
    .line 674
    invoke-direct/range {v0 .. v5}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 675
    .line 676
    .line 677
    iget-object v2, v1, Lhb/k;->c:Landroid/os/Handler;

    .line 678
    .line 679
    iget-object v3, v3, Lhb/j;->a:Lhb/t;

    .line 680
    .line 681
    iget v3, v3, Lhb/t;->b:I

    .line 682
    .line 683
    and-int v3, v3, v16

    .line 684
    .line 685
    if-eq v3, v7, :cond_20

    .line 686
    .line 687
    const/16 v5, 0x22

    .line 688
    .line 689
    if-eq v3, v5, :cond_1f

    .line 690
    .line 691
    const/16 v4, 0x2b

    .line 692
    .line 693
    if-eq v3, v4, :cond_1e

    .line 694
    .line 695
    if-eq v3, v6, :cond_1e

    .line 696
    .line 697
    const-wide/16 v3, 0x7530

    .line 698
    .line 699
    goto :goto_11

    .line 700
    :cond_1e
    const-wide/32 v3, 0x493e0

    .line 701
    .line 702
    .line 703
    goto :goto_11

    .line 704
    :cond_1f
    const-wide/32 v3, 0x15f90

    .line 705
    .line 706
    .line 707
    goto :goto_11

    .line 708
    :cond_20
    const-wide/32 v3, 0x1d4c0

    .line 709
    .line 710
    .line 711
    :goto_11
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 712
    .line 713
    .line 714
    iput-object v0, v1, Lhb/k;->i:Lb9/c;

    .line 715
    .line 716
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lhb/k;->g:Lhb/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lhb/k;->e:Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lhb/i;

    .line 13
    .line 14
    iput-object v0, p0, Lhb/k;->g:Lhb/i;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lhb/k;->m(Lhb/i;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public final o(Ljava/util/List;)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lhb/k;->f:Lhb/g;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, Lhb/t;

    .line 26
    .line 27
    invoke-static {v3, v0}, Lhb/k;->h(Lhb/t;Lhb/g;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lhb/t;

    .line 61
    .line 62
    invoke-virtual {v1}, Lhb/t;->c()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-static {p1}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Lhb/t;

    .line 103
    .line 104
    invoke-virtual {v1}, Lhb/t;->c()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    return-object p1
.end method
