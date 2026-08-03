.class public final Lra/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll3/l;Lb5/c;Lna/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p2, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lra/c;->f:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p2, Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lra/c;->g:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, Lra/c;->h:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p0, Lra/c;->i:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object p1, p0, Lra/c;->c:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object p3, p0, Lra/c;->d:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object p4, p0, Lra/c;->e:Ljava/lang/Object;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Lh/Hchat/dexkit/DexFinder;Ll3/l;Lna/k;Lm8/c;Lke/h;Lna/b;Lna/b;Lna/b;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput-boolean v0, p0, Lra/c;->a:Z

    .line 43
    iput-boolean v0, p0, Lra/c;->b:Z

    .line 44
    iput-object p1, p0, Lra/c;->c:Ljava/lang/Object;

    .line 45
    iput-object p2, p0, Lra/c;->d:Ljava/lang/Object;

    .line 46
    iput-object p3, p0, Lra/c;->e:Ljava/lang/Object;

    .line 47
    iput-object p4, p0, Lra/c;->f:Ljava/lang/Object;

    .line 48
    iput-object p5, p0, Lra/c;->g:Ljava/lang/Object;

    .line 49
    iput-object p6, p0, Lra/c;->h:Ljava/lang/Object;

    .line 50
    iput-object p7, p0, Lra/c;->i:Ljava/lang/Object;

    .line 51
    iput-object p8, p0, Lra/c;->j:Ljava/lang/Object;

    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->runtime()Li8/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->p()Lo8/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lo8/j;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :catchall_0
    :cond_0
    return-void
.end method

.method public static varargs g(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-nez v0, :cond_6

    .line 8
    .line 9
    array-length v0, p1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v0, :cond_6

    .line 13
    .line 14
    aget-object v4, p1, v3

    .line 15
    .line 16
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-nez v5, :cond_4

    .line 21
    .line 22
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v4, "="

    .line 38
    .line 39
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/16 v5, 0x3f

    .line 47
    .line 48
    invoke-virtual {p0, v5}, Ljava/lang/String;->indexOf(I)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-ltz v5, :cond_1

    .line 53
    .line 54
    add-int/lit8 v5, v5, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move v5, v2

    .line 58
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-ge v5, v6, :cond_4

    .line 63
    .line 64
    const/16 v6, 0x26

    .line 65
    .line 66
    invoke-virtual {p0, v6, v5}, Ljava/lang/String;->indexOf(II)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-gez v6, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    :cond_2
    invoke-virtual {p0, v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_3

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    add-int/2addr v5, v4

    .line 87
    invoke-virtual {p0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    goto :goto_3

    .line 92
    :cond_3
    add-int/lit8 v5, v6, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_0
    :cond_4
    :goto_2
    move-object v4, v1

    .line 96
    :goto_3
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-nez v5, :cond_5

    .line 101
    .line 102
    return-object v4

    .line 103
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_6
    return-object v1
.end method

.method public static t(Ljava/lang/String;JLjava/lang/Runnable;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->runtime()Li8/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->p()Lo8/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0, p1, p2, p3}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    :cond_0
    new-instance p0, Landroid/os/Handler;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lna/a;)V
    .locals 1

    .line 1
    iget-boolean v0, p4, Lna/a;->I:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_3

    .line 6
    .line 7
    :cond_0
    iget-object p4, p4, Lna/a;->J:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-string p4, "\u62a2\u5230\u7ea2\u5305 {amount} \u5143"

    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lra/c;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lb5/c;

    .line 20
    .line 21
    invoke-virtual {v0, p4, p1, p2, p3}, Lb5/c;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_2

    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_2
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_3

    .line 42
    .line 43
    const-string p2, ""

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const-string p2, "sendid"

    .line 47
    .line 48
    const-string p4, "sendId"

    .line 49
    .line 50
    filled-new-array {p2, p4}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-static {p3, p2}, Lra/c;->g(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    if-nez p4, :cond_4

    .line 63
    .line 64
    const-string p3, "sendid:"

    .line 65
    .line 66
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    const-string p2, "msgid"

    .line 72
    .line 73
    const-string p4, "msgId"

    .line 74
    .line 75
    filled-new-array {p2, p4}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-static {p3, p2}, Lra/c;->g(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const-string p4, "channelid"

    .line 84
    .line 85
    const-string v0, "channelId"

    .line 86
    .line 87
    filled-new-array {p4, v0}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p4

    .line 91
    invoke-static {p3, p4}, Lra/c;->g(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p4

    .line 95
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    const-string p2, "url:"

    .line 109
    .line 110
    invoke-static {p2, p3}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    goto :goto_1

    .line 115
    :cond_6
    :goto_0
    const-string p3, "msg:"

    .line 116
    .line 117
    const-string v0, "|channel:"

    .line 118
    .line 119
    invoke-static {p3, p2, v0, p4}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    :goto_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    if-eqz p3, :cond_7

    .line 128
    .line 129
    const/4 p3, 0x1

    .line 130
    goto :goto_2

    .line 131
    :cond_7
    iget-object p3, p0, Lra/c;->i:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p3, Ljava/util/Set;

    .line 134
    .line 135
    invoke-interface {p3, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p3

    .line 139
    if-eqz p3, :cond_8

    .line 140
    .line 141
    const/4 p3, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_8
    iget-object p3, p0, Lra/c;->h:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p3, Ljava/util/Set;

    .line 146
    .line 147
    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p3

    .line 151
    :goto_2
    if-nez p3, :cond_9

    .line 152
    .line 153
    :goto_3
    return-void

    .line 154
    :cond_9
    iget-object p3, p0, Lra/c;->f:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p3, Landroid/os/Handler;

    .line 157
    .line 158
    new-instance p4, Lr8/b;

    .line 159
    .line 160
    const/4 v0, 0x3

    .line 161
    invoke-direct {p4, p0, p2, p1, v0}, Lr8/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lra/c;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ll3/l;

    .line 18
    .line 19
    const-string v2, "hb_fake_packet_receive_enable"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    :try_start_0
    invoke-virtual {v1}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move v1, v3

    .line 32
    :goto_0
    if-eqz v1, :cond_6

    .line 33
    .line 34
    sget-object v1, Lpa/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const-string v2, "@"

    .line 41
    .line 42
    const-string v4, "%40"

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v5, "^[0-9]+@chatroom$"

    .line 51
    .line 52
    invoke-virtual {v1, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    :cond_1
    if-nez v3, :cond_2

    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    move-object v1, p1

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const-string v1, "%40%40"

    .line 72
    .line 73
    invoke-virtual {p1, v4, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v3, "@@"

    .line 78
    .line 79
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    :goto_1
    invoke-static {p1, v1}, Lpa/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_4

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v2, "@chatroom"

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-static {p1, v1}, Lpa/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-nez v3, :cond_5

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-nez v3, :cond_5

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    :cond_5
    const-string v1, "sendusername"

    .line 137
    .line 138
    invoke-static {p2, v1}, Loa/b;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-nez v1, :cond_6

    .line 147
    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-static {p1, p2}, Lpa/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-nez p1, :cond_6

    .line 174
    .line 175
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-nez p1, :cond_6

    .line 180
    .line 181
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    :cond_6
    :goto_2
    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "redpacket_receive_timeout:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lra/c;->c(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "redpacket_open_timeout:"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lra/c;->c(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lra/c;->e:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lna/k;

    .line 38
    .line 39
    iget-object v1, v0, Lna/k;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    if-eqz p1, :cond_3

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/util/Map;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    const-string v3, "nativeurl"

    .line 59
    .line 60
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    instance-of v3, v2, Ljava/lang/String;

    .line 65
    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    check-cast v2, Ljava/lang/String;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    const/4 v2, 0x0

    .line 72
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_2

    .line 77
    .line 78
    iget-object v3, v0, Lna/k;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    invoke-static {v3}, Lgg/x;->b(Ljava/lang/Object;)Ljava/util/Map;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    iget-object v3, v0, Lna/k;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 88
    .line 89
    invoke-static {v3}, Lgg/x;->b(Ljava/lang/Object;)Ljava/util/Map;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    iget-object v3, v0, Lna/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 97
    .line 98
    invoke-static {v3}, Lgg/x;->b(Ljava/lang/Object;)Ljava/util/Map;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    iget-object v3, v0, Lna/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 106
    .line 107
    invoke-static {v3}, Lgg/x;->b(Ljava/lang/Object;)Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    :cond_2
    iget-object v2, v0, Lna/k;->o:Ljava/util/Set;

    .line 115
    .line 116
    invoke-interface {v2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    iget-object v2, v0, Lna/k;->p:Ljava/util/Set;

    .line 120
    .line 121
    invoke-interface {v2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    iget-object v2, v0, Lna/k;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 125
    .line 126
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    iget-object v0, v0, Lna/k;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 130
    .line 131
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    :cond_3
    :goto_1
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    :cond_0
    iget-boolean v0, p0, Lra/c;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lra/c;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/speech/tts/TextToSpeech;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lra/c;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lsa/b;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lra/c;->v(Lsa/b;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lra/c;->s(Lsa/b;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lra/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-boolean v1, p0, Lra/c;->a:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lra/c;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Landroid/speech/tts/TextToSpeech;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lra/c;->e()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-boolean v1, p0, Lra/c;->b:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 v1, 0x1

    .line 25
    iput-boolean v1, p0, Lra/c;->b:Z

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move-object v0, v1

    .line 35
    :goto_0
    new-instance v1, Landroid/speech/tts/TextToSpeech;

    .line 36
    .line 37
    new-instance v2, Lsa/a;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v2, p0, v3}, Lsa/a;-><init>(Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, v0, v2}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lra/c;->j:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    const/4 v1, 0x0

    .line 51
    iput-boolean v1, p0, Lra/c;->b:Z

    .line 52
    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v2, "\u7ea2\u5305\u64ad\u62a5\u521d\u59cb\u5316\u5931\u8d25: "

    .line 56
    .line 57
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p0, v1, v0}, Lra/c;->k(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    const-string v0, "\u521d\u59cb\u5316\u5f02\u5e38"

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lra/c;->q(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public h(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    :try_start_0
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/reflect/Method;

    .line 24
    .line 25
    const-string v3, "onGYNetEnd"

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    array-length v3, v3

    .line 42
    const/4 v4, 0x3

    .line 43
    if-ne v3, v4, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/4 v2, 0x0

    .line 49
    :goto_0
    if-nez v2, :cond_3

    .line 50
    .line 51
    :goto_1
    return v0

    .line 52
    :cond_3
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 53
    .line 54
    new-instance v3, Lra/b;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v3, p0, v4}, Lra/b;-><init>(Lra/c;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 61
    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v2, "Hook\u62c6\u7ea2\u5305\u56de\u8c03\u6210\u529f: "

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v2, " -> "

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p0, p1}, Lra/c;->j(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    const/4 p1, 0x1

    .line 96
    return p1

    .line 97
    :goto_2
    const-string v1, "Hook\u62c6\u7ea2\u5305\u56de\u8c03\u5931\u8d25("

    .line 98
    .line 99
    const-string v2, "): "

    .line 100
    .line 101
    invoke-static {v1, p2, v2}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, p1}, Lra/c;->j(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return v0
.end method

.method public i(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    :try_start_0
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/reflect/Method;

    .line 24
    .line 25
    const-string v3, "onGYNetEnd"

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    array-length v3, v3

    .line 42
    const/4 v4, 0x3

    .line 43
    if-ne v3, v4, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/4 v2, 0x0

    .line 49
    :goto_0
    if-nez v2, :cond_3

    .line 50
    .line 51
    :goto_1
    return v0

    .line 52
    :cond_3
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 53
    .line 54
    new-instance v3, Lra/b;

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-direct {v3, p0, v4}, Lra/b;-><init>(Lra/c;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 61
    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v2, "Hook\u6536\u7ea2\u5305\u56de\u8c03\u6210\u529f: "

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v2, " -> "

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p0, p1}, Lra/c;->j(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    const/4 p1, 0x1

    .line 96
    return p1

    .line 97
    :goto_2
    const-string v1, "Hook\u6536\u7ea2\u5305\u56de\u8c03\u5931\u8d25("

    .line 98
    .line 99
    const-string v2, "): "

    .line 100
    .line 101
    invoke-static {v1, p2, v2}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, p1}, Lra/c;->j(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return v0
.end method

.method public j(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lra/c;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lna/b;

    .line 4
    .line 5
    iget-object v0, v0, Lna/b;->h:Lna/e;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lna/e;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "ERROR "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lra/c;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lna/b;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lna/b;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const-string v0, "[Hchat:RedPacketAnnouncer] "

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1, p2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public l(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    :try_start_0
    invoke-static {p2, p3}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p2

    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "  ctor.newInstance \u5931\u8d25: "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p0, p2}, Lra/c;->j(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    move-object p2, v0

    .line 32
    :goto_0
    if-nez p2, :cond_2

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :try_start_1
    invoke-static {p1, p3}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    :catchall_1
    :goto_1
    move-object p2, v0

    .line 42
    :cond_2
    if-eqz p2, :cond_3

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string p3, "  \u8bf7\u6c42\u5bf9\u8c61\u5df2\u521b\u5efa: "

    .line 53
    .line 54
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p1}, Lra/c;->j(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-object p2
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lra/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll3/l;

    .line 4
    .line 5
    const-string v1, "hb_fake_packet_receive_enable"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move v0, v2

    .line 18
    :goto_0
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :cond_0
    sget-object v0, Lpa/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_8

    .line 29
    .line 30
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x1

    .line 35
    const-string v3, "%40"

    .line 36
    .line 37
    const-string v4, "@"

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v5, "^[0-9]+@chatroom$"

    .line 46
    .line 47
    invoke-virtual {v0, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    move v0, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v0, v2

    .line 56
    :goto_1
    if-nez v0, :cond_2

    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/16 v5, 0x3f

    .line 66
    .line 67
    invoke-virtual {p1, v5}, Ljava/lang/String;->indexOf(I)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-ltz v5, :cond_3

    .line 72
    .line 73
    add-int/2addr v5, v1

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move v5, v2

    .line 76
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-ge v5, v6, :cond_7

    .line 81
    .line 82
    const-string v6, "&"

    .line 83
    .line 84
    invoke-virtual {v0, v6, v5}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;I)I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-gez v6, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    :cond_4
    const-string v7, "="

    .line 95
    .line 96
    invoke-virtual {v0, v7, v5}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;I)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-le v7, v5, :cond_6

    .line 101
    .line 102
    if-ge v7, v6, :cond_6

    .line 103
    .line 104
    add-int/lit8 v7, v7, 0x1

    .line 105
    .line 106
    invoke-virtual {v0, v7, v6}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v5, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    const-string v9, "chatroom"

    .line 119
    .line 120
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-eqz v8, :cond_6

    .line 125
    .line 126
    invoke-virtual {v5, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-nez v8, :cond_6

    .line 135
    .line 136
    invoke-virtual {v5, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_5

    .line 141
    .line 142
    invoke-virtual {p2, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    goto :goto_3

    .line 147
    :cond_5
    move-object v2, p2

    .line 148
    :goto_3
    invoke-virtual {v0, v7, v6, v2}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    sub-int/2addr v2, v5

    .line 160
    add-int/2addr v6, v2

    .line 161
    move v2, v1

    .line 162
    :cond_6
    add-int/lit8 v5, v6, 0x1

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_7
    if-eqz v2, :cond_8

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 171
    :catchall_1
    :cond_8
    :goto_4
    return-object p1
.end method

.method public n(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lra/c;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lna/b;

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const-string v2, "talker"

    .line 10
    .line 11
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v2, v1

    .line 19
    :goto_0
    if-eqz p2, :cond_1

    .line 20
    .line 21
    const-string v1, "nativeurl"

    .line 22
    .line 23
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    move-object v1, p2

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    :cond_1
    iget-object p2, v0, Lna/b;->h:Lna/e;

    .line 31
    .line 32
    iget-object v0, p2, Lna/e;->h:Lbe/k;

    .line 33
    .line 34
    invoke-virtual {p2, v1}, Lna/e;->g(Ljava/lang/String;)Lna/a;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {v0, v2, v1, p1, p2}, Lbe/k;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lna/a;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public o(Lsa/b;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lsa/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lra/c;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public p(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lra/c;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lna/k;

    .line 4
    .line 5
    iget-object v0, v0, Lna/k;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz p1, :cond_4

    .line 9
    .line 10
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v2, v1

    .line 35
    :goto_0
    const/4 v3, 0x1

    .line 36
    if-lt v2, v3, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const-string v4, "openReq"

    .line 40
    .line 41
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    if-nez v8, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    add-int/2addr v2, v3

    .line 49
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, p2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v1, "\u9759\u9ed8\u62c6\u5305\u91cd\u8bd5: sendid="

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, " attempt="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, " reason="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-virtual {p0, p3}, Lra/c;->j(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    new-instance p3, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v0, "redpacket_open_retry:"

    .line 92
    .line 93
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    const-wide/16 v0, 0x4b0

    .line 104
    .line 105
    int-to-long v4, v2

    .line 106
    mul-long/2addr v0, v4

    .line 107
    new-instance v5, Lb9/c;

    .line 108
    .line 109
    const/16 v10, 0x11

    .line 110
    .line 111
    move-object v6, p0

    .line 112
    move-object v9, p1

    .line 113
    move-object v7, p2

    .line 114
    invoke-direct/range {v5 .. v10}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 115
    .line 116
    .line 117
    invoke-static {p3, v0, v1, v5}, Lra/c;->t(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 118
    .line 119
    .line 120
    return v3

    .line 121
    :cond_4
    :goto_1
    return v1
.end method

.method public q(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lra/c;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_3

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lsa/b;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget v4, v3, Lsa/b;->c:I

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    if-lt v4, v5, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Lra/c;->o(Lsa/b;)V

    .line 34
    .line 35
    .line 36
    const-string v3, "\u7ea2\u5305\u64ad\u62a5\u653e\u5f03: "

    .line 37
    .line 38
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-virtual {p0, v3, v4}, Lra/c;->k(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    new-instance v5, Lsa/b;

    .line 48
    .line 49
    iget-object v6, v3, Lsa/b;->a:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v3, v3, Lsa/b;->b:Ljava/lang/String;

    .line 52
    .line 53
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    invoke-direct {v5, v4, v6, v3}, Lsa/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v5}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    iget-object p1, p0, Lra/c;->f:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Landroid/os/Handler;

    .line 73
    .line 74
    new-instance v0, La1/a;

    .line 75
    .line 76
    const/16 v1, 0x1b

    .line 77
    .line 78
    invoke-direct {v0, p0, v1}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    const-wide/16 v1, 0x320

    .line 82
    .line 83
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 84
    .line 85
    .line 86
    :cond_4
    :goto_2
    return-void
.end method

.method public r(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lra/c;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lna/k;

    .line 4
    .line 5
    iget-object v1, v0, Lna/k;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    iget-object v2, v0, Lna/k;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/util/Map;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v1, v3

    .line 37
    :goto_0
    const/4 v4, 0x2

    .line 38
    if-lt v1, v4, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const-string v4, "content"

    .line 42
    .line 43
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    const-string v4, "talker"

    .line 52
    .line 53
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    move-object v8, v4

    .line 58
    check-cast v8, Ljava/lang/String;

    .line 59
    .line 60
    const-string v4, "nativeurl"

    .line 61
    .line 62
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    move-object v9, v2

    .line 67
    check-cast v9, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    :goto_1
    return v3

    .line 76
    :cond_3
    iget-object v2, v0, Lna/k;->o:Ljava/util/Set;

    .line 77
    .line 78
    invoke-interface {v2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    iget-object v0, v0, Lna/k;->p:Ljava/util/Set;

    .line 82
    .line 83
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x1

    .line 87
    add-int/lit8 v10, v1, 0x1

    .line 88
    .line 89
    const-string v1, " attempt="

    .line 90
    .line 91
    const-string v2, " reason="

    .line 92
    .line 93
    const-string v3, "\u9759\u9ed8\u6536\u5305\u91cd\u8bd5: sendid="

    .line 94
    .line 95
    invoke-static {v10, v3, p1, v1, v2}, Leh/a;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p0, p2}, Lra/c;->j(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance p2, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v1, "redpacket_receive_retry:"

    .line 112
    .line 113
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    const-wide/16 v1, 0x384

    .line 124
    .line 125
    int-to-long v3, v10

    .line 126
    mul-long/2addr v3, v1

    .line 127
    new-instance v5, Llb/a;

    .line 128
    .line 129
    move-object v6, p0

    .line 130
    invoke-direct/range {v5 .. v10}, Llb/a;-><init>(Lra/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    invoke-static {p1, v3, v4, v5}, Lra/c;->t(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 134
    .line 135
    .line 136
    return v0
.end method

.method public s(Lsa/b;)V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lra/c;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/speech/tts/TextToSpeech;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    :catchall_0
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lra/c;->j:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Lra/c;->a:Z

    .line 15
    .line 16
    iget v1, p1, Lsa/b;->c:I

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-lt v1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lra/c;->o(Lsa/b;)V

    .line 22
    .line 23
    .line 24
    const-string p1, "\u7ea2\u5305\u64ad\u62a5\u653e\u5f03: speak \u8fd4\u56de\u9519\u8bef"

    .line 25
    .line 26
    invoke-virtual {p0, p1, v0}, Lra/c;->k(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-object v0, p0, Lra/c;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/ArrayDeque;

    .line 33
    .line 34
    new-instance v3, Lsa/b;

    .line 35
    .line 36
    iget-object v4, p1, Lsa/b;->a:Ljava/lang/String;

    .line 37
    .line 38
    iget-object p1, p1, Lsa/b;->b:Ljava/lang/String;

    .line 39
    .line 40
    add-int/2addr v1, v2

    .line 41
    invoke-direct {v3, v1, v4, p1}, Lsa/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lra/c;->f:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Landroid/os/Handler;

    .line 50
    .line 51
    new-instance v0, La1/a;

    .line 52
    .line 53
    const/16 v1, 0x1b

    .line 54
    .line 55
    invoke-direct {v0, p0, v1}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    const-wide/16 v1, 0x320

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public u(Ljava/lang/Object;Ljava/util/HashMap;Ljava/lang/String;)Z
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "requestTalker"

    .line 7
    .line 8
    invoke-virtual {v0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lra/c;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Lna/k;

    .line 14
    .line 15
    iget-object p2, p2, Lna/k;->l:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lra/c;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p3, Lm8/c;

    .line 23
    .line 24
    invoke-virtual {p3, p1}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_0
    const-string p3, "  sendNetworkRequest \u5931\u8d25!"

    .line 33
    .line 34
    invoke-virtual {p0, p3}, Lra/c;->j(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    return p1
.end method

.method public v(Lsa/b;)Z
    .locals 9

    .line 1
    const-string v0, "hchat_redpacket_"

    .line 2
    .line 3
    iget-object v1, p1, Lsa/b;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lra/c;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroid/speech/tts/TextToSpeech;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_3

    .line 11
    .line 12
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    :try_start_0
    new-instance v4, Landroid/os/Bundle;

    .line 21
    .line 22
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v5, "streamType"

    .line 26
    .line 27
    const/4 v6, 0x3

    .line 28
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v5, p0, Lra/c;->j:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Landroid/speech/tts/TextToSpeech;

    .line 38
    .line 39
    new-instance v6, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v5, v1, v3, v4, v0}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/CharSequence;ILandroid/os/Bundle;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    const/4 v1, -0x1

    .line 60
    if-ne v0, v1, :cond_1

    .line 61
    .line 62
    const-string p1, "\u7ea2\u5305\u64ad\u62a5\u5931\u8d25"

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-virtual {p0, p1, v0}, Lra/c;->k(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    return v2

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object p1, p1, Lsa/b;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    return v3

    .line 80
    :cond_2
    iget-object v0, p0, Lra/c;->i:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Ljava/util/Set;

    .line 83
    .line 84
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lra/c;->h:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/util/Set;

    .line 90
    .line 91
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    .line 94
    return v3

    .line 95
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, "\u7ea2\u5305\u64ad\u62a5\u5931\u8d25: "

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p0, v0, p1}, Lra/c;->k(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    return v2

    .line 117
    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Lra/c;->o(Lsa/b;)V

    .line 118
    .line 119
    .line 120
    return v3
.end method

.method public w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    const-string v4, "channelid"

    .line 10
    .line 11
    const-string v5, "msgtype"

    .line 12
    .line 13
    const-string v6, "sendid"

    .line 14
    .line 15
    iget-object v7, v1, Lra/c;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v7, Lm8/c;

    .line 18
    .line 19
    iget-object v8, v1, Lra/c;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v8, Lna/k;

    .line 22
    .line 23
    iget-object v9, v8, Lna/k;->o:Ljava/util/Set;

    .line 24
    .line 25
    const-string v10, "  \u6784\u9020\u8bf7\u6c42: mt="

    .line 26
    .line 27
    const-string v11, "  sendid="

    .line 28
    .line 29
    new-instance v12, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v13, "trySilentReceive \u5f00\u59cb, mode="

    .line 32
    .line 33
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v13, v1, Lra/c;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v13, Ll3/l;

    .line 39
    .line 40
    const-string v14, "hb_grab_mode"

    .line 41
    .line 42
    const/4 v15, 0x1

    .line 43
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v20

    .line 47
    move-object/from16 v16, v13

    .line 48
    .line 49
    :try_start_0
    invoke-virtual/range {v16 .. v16}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 50
    .line 51
    .line 52
    move-result-object v13

    .line 53
    invoke-interface {v13, v14, v15}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 54
    .line 55
    .line 56
    move-result v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move v13, v15

    .line 59
    :goto_0
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v13, " recvClass="

    .line 63
    .line 64
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v13, v1, Lra/c;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v13, Lh/Hchat/dexkit/DexFinder;

    .line 70
    .line 71
    iget-object v14, v13, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyClass:Ljava/lang/Class;

    .line 72
    .line 73
    const/16 v22, 0x0

    .line 74
    .line 75
    if-eqz v14, :cond_0

    .line 76
    .line 77
    move v14, v15

    .line 78
    goto :goto_1

    .line 79
    :cond_0
    move/from16 v14, v22

    .line 80
    .line 81
    :goto_1
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v14, " openClass="

    .line 85
    .line 86
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v14, v13, Lh/Hchat/dexkit/DexFinder;->openLuckyMoneyClass:Ljava/lang/Class;

    .line 90
    .line 91
    if-eqz v14, :cond_1

    .line 92
    .line 93
    move v14, v15

    .line 94
    goto :goto_2

    .line 95
    :cond_1
    move/from16 v14, v22

    .line 96
    .line 97
    :goto_2
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v14, " dispatcher="

    .line 101
    .line 102
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v14, v7, Lm8/c;->c:Ljava/lang/Object;

    .line 106
    .line 107
    if-eqz v14, :cond_2

    .line 108
    .line 109
    move v14, v15

    .line 110
    goto :goto_3

    .line 111
    :cond_2
    move/from16 v14, v22

    .line 112
    .line 113
    :goto_3
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v14, " method="

    .line 117
    .line 118
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v7, v7, Lm8/c;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v7, Ljava/lang/reflect/Method;

    .line 124
    .line 125
    if-eqz v7, :cond_3

    .line 126
    .line 127
    move v7, v15

    .line 128
    goto :goto_4

    .line 129
    :cond_3
    move/from16 v7, v22

    .line 130
    .line 131
    :goto_4
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-virtual {v1, v7}, Lra/c;->j(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v16 .. v16}, Ll3/l;->f()Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-nez v7, :cond_4

    .line 146
    .line 147
    const-string v0, "  \u653e\u5f03: silentGrabEnabled=false"

    .line 148
    .line 149
    invoke-virtual {v1, v0}, Lra/c;->j(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_4
    iget-object v7, v13, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyClass:Ljava/lang/Class;

    .line 154
    .line 155
    if-nez v7, :cond_5

    .line 156
    .line 157
    iget-object v7, v13, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyUnionClass:Ljava/lang/Class;

    .line 158
    .line 159
    if-nez v7, :cond_5

    .line 160
    .line 161
    const-string v0, "  \u653e\u5f03: receiveLuckyMoneyClass=null union=null"

    .line 162
    .line 163
    invoke-virtual {v1, v0}, Lra/c;->j(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_5
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    if-eqz v7, :cond_6

    .line 172
    .line 173
    const-string v0, "  \u653e\u5f03: nu=empty"

    .line 174
    .line 175
    invoke-virtual {v1, v0}, Lra/c;->j(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_6
    :try_start_1
    invoke-static {v3, v6}, Loa/b;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    new-instance v12, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-virtual {v1, v11}, Lra/c;->j(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    if-eqz v11, :cond_7

    .line 203
    .line 204
    goto/16 :goto_f

    .line 205
    .line 206
    :cond_7
    iget-object v11, v8, Lna/k;->q:Ljava/util/Set;

    .line 207
    .line 208
    invoke-interface {v11, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-nez v11, :cond_18

    .line 213
    .line 214
    invoke-interface {v9, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    if-nez v11, :cond_18

    .line 219
    .line 220
    iget-object v11, v8, Lna/k;->p:Ljava/util/Set;

    .line 221
    .line 222
    invoke-interface {v11, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    if-eqz v11, :cond_8

    .line 227
    .line 228
    goto/16 :goto_10

    .line 229
    .line 230
    :cond_8
    invoke-interface {v9, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    if-nez v9, :cond_9

    .line 235
    .line 236
    const-string v0, "  \u653e\u5f03: sendid add\u7ade\u4e89\u5931\u8d25"

    .line 237
    .line 238
    invoke-virtual {v1, v0}, Lra/c;->j(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :catchall_1
    move-exception v0

    .line 243
    goto/16 :goto_11

    .line 244
    .line 245
    :cond_9
    iget-object v9, v8, Lna/k;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 246
    .line 247
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    invoke-virtual {v9, v7, v11}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    invoke-static {v3, v5}, Loa/b;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 259
    .line 260
    .line 261
    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 262
    if-eqz v11, :cond_a

    .line 263
    .line 264
    :catchall_2
    move v9, v15

    .line 265
    goto :goto_5

    .line 266
    :cond_a
    :try_start_2
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 267
    .line 268
    .line 269
    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 270
    :goto_5
    :try_start_3
    invoke-static {v3, v4}, Loa/b;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 275
    .line 276
    .line 277
    move-result v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 278
    if-eqz v12, :cond_b

    .line 279
    .line 280
    :catchall_3
    move v11, v15

    .line 281
    goto :goto_6

    .line 282
    :cond_b
    :try_start_4
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 283
    .line 284
    .line 285
    move-result v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 286
    :goto_6
    :try_start_5
    const-string v12, "headimgurl"

    .line 287
    .line 288
    invoke-static {v0, v12}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    const-string v14, "sendertitle"

    .line 293
    .line 294
    invoke-static {v0, v14}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v14

    .line 298
    invoke-virtual {v1, v3, v2}, Lra/c;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v15

    .line 302
    invoke-static/range {p2 .. p4}, Loa/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    move-object/from16 p1, v12

    .line 307
    .line 308
    const/16 v12, 0x3ed

    .line 309
    .line 310
    if-ne v0, v12, :cond_c

    .line 311
    .line 312
    iget-object v0, v13, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyUnionClass:Ljava/lang/Class;

    .line 313
    .line 314
    if-eqz v0, :cond_c

    .line 315
    .line 316
    const/4 v0, 0x1

    .line 317
    goto :goto_7

    .line 318
    :cond_c
    move/from16 v0, v22

    .line 319
    .line 320
    :goto_7
    new-instance v12, Ljava/util/HashMap;

    .line 321
    .line 322
    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    const-string v6, "content"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 329
    .line 330
    const-string v23, ""

    .line 331
    .line 332
    move-object/from16 v16, v14

    .line 333
    .line 334
    if-eqz p2, :cond_d

    .line 335
    .line 336
    move-object/from16 v14, p2

    .line 337
    .line 338
    goto :goto_8

    .line 339
    :cond_d
    move-object/from16 v14, v23

    .line 340
    .line 341
    :goto_8
    :try_start_6
    invoke-virtual {v12, v6, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    const-string v6, "nativeurl"

    .line 345
    .line 346
    invoke-virtual {v12, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    const-string v6, "requestNativeUrl"

    .line 350
    .line 351
    invoke-virtual {v12, v6, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    const-string v6, "talker"

    .line 355
    .line 356
    invoke-virtual {v12, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    invoke-virtual {v12, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    invoke-virtual {v12, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    const-string v4, "headimg"

    .line 374
    .line 375
    if-eqz p1, :cond_e

    .line 376
    .line 377
    move-object/from16 v5, p1

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_e
    move-object/from16 v5, v23

    .line 381
    .line 382
    :goto_9
    invoke-virtual {v12, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    const-string v4, "nickname"

    .line 386
    .line 387
    if-eqz v16, :cond_f

    .line 388
    .line 389
    move-object/from16 v14, v16

    .line 390
    .line 391
    goto :goto_a

    .line 392
    :cond_f
    move-object/from16 v14, v23

    .line 393
    .line 394
    :goto_a
    invoke-virtual {v12, v4, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    const-string v4, "isUnion"

    .line 398
    .line 399
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    invoke-virtual {v12, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    iget-object v4, v8, Lna/k;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 407
    .line 408
    invoke-virtual {v4, v7, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    new-instance v4, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    const-string v5, " ci="

    .line 420
    .line 421
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    const-string v5, " union="

    .line 428
    .line 429
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    const-string v5, " ctor="

    .line 436
    .line 437
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    iget-object v5, v13, Lh/Hchat/dexkit/DexFinder;->receiveCtor:Ljava/lang/reflect/Constructor;

    .line 441
    .line 442
    if-eqz v5, :cond_10

    .line 443
    .line 444
    const/4 v5, 0x1

    .line 445
    goto :goto_b

    .line 446
    :cond_10
    move/from16 v5, v22

    .line 447
    .line 448
    :goto_b
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    invoke-virtual {v1, v4}, Lra/c;->j(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    if-eqz v0, :cond_12

    .line 459
    .line 460
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 461
    .line 462
    .line 463
    move-result-object v16

    .line 464
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 465
    .line 466
    .line 467
    move-result-object v17

    .line 468
    const-string v21, "v1.0"

    .line 469
    .line 470
    move-object/from16 v18, v7

    .line 471
    .line 472
    move-object/from16 v19, v15

    .line 473
    .line 474
    filled-new-array/range {v16 .. v21}, [Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    iget-object v4, v13, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyUnionClass:Ljava/lang/Class;

    .line 479
    .line 480
    iget-object v5, v13, Lh/Hchat/dexkit/DexFinder;->unionReceiveCtor:Ljava/lang/reflect/Constructor;

    .line 481
    .line 482
    invoke-virtual {v1, v4, v5, v3}, Lra/c;->l(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    if-eqz v3, :cond_11

    .line 487
    .line 488
    invoke-virtual {v1, v3, v12, v2}, Lra/c;->u(Ljava/lang/Object;Ljava/util/HashMap;Ljava/lang/String;)Z

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    if-eqz v2, :cond_11

    .line 493
    .line 494
    const/4 v15, 0x1

    .line 495
    goto :goto_c

    .line 496
    :cond_11
    move/from16 v15, v22

    .line 497
    .line 498
    :goto_c
    move-object/from16 v5, v18

    .line 499
    .line 500
    goto :goto_e

    .line 501
    :cond_12
    move-object/from16 v18, v7

    .line 502
    .line 503
    move-object/from16 v19, v15

    .line 504
    .line 505
    invoke-virtual {v1, v2, v3}, Lra/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    move/from16 v3, v22

    .line 514
    .line 515
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 516
    .line 517
    .line 518
    move-result v4

    .line 519
    if-eqz v4, :cond_14

    .line 520
    .line 521
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    move-object/from16 v22, v4

    .line 526
    .line 527
    check-cast v22, Ljava/lang/String;

    .line 528
    .line 529
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 530
    .line 531
    .line 532
    move-result-object v16

    .line 533
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 534
    .line 535
    .line 536
    move-result-object v17

    .line 537
    const-string v21, "v1.0"

    .line 538
    .line 539
    filled-new-array/range {v16 .. v22}, [Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v4

    .line 543
    move-object/from16 v5, v18

    .line 544
    .line 545
    move-object/from16 v6, v22

    .line 546
    .line 547
    iget-object v7, v13, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyClass:Ljava/lang/Class;

    .line 548
    .line 549
    iget-object v8, v13, Lh/Hchat/dexkit/DexFinder;->receiveCtor:Ljava/lang/reflect/Constructor;

    .line 550
    .line 551
    invoke-virtual {v1, v7, v8, v4}, Lra/c;->l(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v4

    .line 555
    if-eqz v4, :cond_13

    .line 556
    .line 557
    invoke-virtual {v1, v4, v12, v6}, Lra/c;->u(Ljava/lang/Object;Ljava/util/HashMap;Ljava/lang/String;)Z

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    if-eqz v4, :cond_13

    .line 562
    .line 563
    add-int/lit8 v3, v3, 0x1

    .line 564
    .line 565
    :cond_13
    move-object/from16 v18, v5

    .line 566
    .line 567
    goto :goto_d

    .line 568
    :cond_14
    move v15, v3

    .line 569
    goto :goto_c

    .line 570
    :goto_e
    if-gtz v15, :cond_16

    .line 571
    .line 572
    const-string v0, "\u65e0\u6cd5\u521b\u5efa\u6216\u53d1\u9001\u8bf7\u6c42\u5bf9\u8c61"

    .line 573
    .line 574
    invoke-virtual {v1, v5, v0}, Lra/c;->r(Ljava/lang/String;Ljava/lang/String;)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-nez v0, :cond_15

    .line 579
    .line 580
    invoke-virtual {v1, v5}, Lra/c;->d(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    const-string v0, "  \u653e\u5f03: \u65e0\u6cd5\u521b\u5efa\u6216\u53d1\u9001\u8bf7\u6c42\u5bf9\u8c61"

    .line 584
    .line 585
    invoke-virtual {v1, v0}, Lra/c;->j(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    :cond_15
    :goto_f
    return-void

    .line 589
    :cond_16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 592
    .line 593
    .line 594
    const-string v3, "\u9759\u9ed8\u6536\u5305: "

    .line 595
    .line 596
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    const-string v3, " count="

    .line 603
    .line 604
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    if-eqz v0, :cond_17

    .line 611
    .line 612
    const-string v23, " [Union]"

    .line 613
    .line 614
    :cond_17
    move-object/from16 v0, v23

    .line 615
    .line 616
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual {v1, v0}, Lra/c;->j(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    new-instance v0, Ljava/lang/StringBuilder;

    .line 627
    .line 628
    const-string v2, "redpacket_receive_timeout:"

    .line 629
    .line 630
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    new-instance v2, Lra/a;

    .line 641
    .line 642
    const/4 v3, 0x1

    .line 643
    invoke-direct {v2, v1, v5, v3}, Lra/a;-><init>(Lra/c;Ljava/lang/String;I)V

    .line 644
    .line 645
    .line 646
    const-wide/16 v3, 0x1194

    .line 647
    .line 648
    invoke-static {v0, v3, v4, v2}, Lra/c;->t(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 649
    .line 650
    .line 651
    return-void

    .line 652
    :cond_18
    :goto_10
    const-string v0, "  \u653e\u5f03: sendid \u5df2\u5904\u7406\u4e2d"

    .line 653
    .line 654
    invoke-virtual {v1, v0}, Lra/c;->j(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 655
    .line 656
    .line 657
    return-void

    .line 658
    :goto_11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 659
    .line 660
    const-string v3, "ERROR trySilentReceive: "

    .line 661
    .line 662
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v3

    .line 669
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    invoke-virtual {v1, v2}, Lra/c;->j(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 680
    .line 681
    .line 682
    return-void
.end method
