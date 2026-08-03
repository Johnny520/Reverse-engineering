.class public final Lhb/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhb/r;Lud/a;)V
    .locals 9

    const/4 v0, 0x3

    iput v0, p0, Lhb/r;->a:I

    .line 84
    iget-object v0, p1, Lhb/r;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lud/r;

    .line 85
    iget-object v0, p1, Lhb/r;->c:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lyd/b;

    .line 86
    iget-object v0, p1, Lhb/r;->d:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lze/c;

    .line 87
    iget-object v0, p1, Lhb/r;->g:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/util/Set;

    .line 88
    iget-object p1, p1, Lhb/r;->h:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Ljava/util/List;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v4, p2

    .line 89
    invoke-direct/range {v1 .. v8}, Lhb/r;-><init>(Lud/r;Lyd/b;Lud/a;Lud/a;Lze/c;Ljava/util/Set;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lhb/r;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lhb/r;->b:Ljava/lang/Object;

    .line 69
    iput-object p2, p0, Lhb/r;->c:Ljava/lang/Object;

    .line 70
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 71
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lhb/r;->e:Ljava/lang/Object;

    .line 72
    const-string p1, ""

    iput-object p1, p0, Lhb/r;->g:Ljava/lang/Object;

    .line 73
    sget-object p1, Ltf/t;->g:Ltf/t;

    iput-object p1, p0, Lhb/r;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr8/g;Lia/t;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lhb/r;->a:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lhb/r;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 13
    .line 14
    const-string p2, "Hchat_group_rename_monitor_config"

    .line 15
    .line 16
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iput-object p2, p0, Lhb/r;->c:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance p2, Lbb/l;

    .line 23
    .line 24
    invoke-direct {p2, p1}, Lbb/l;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lhb/r;->e:Ljava/lang/Object;

    .line 35
    .line 36
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lhb/r;->f:Ljava/lang/Object;

    .line 42
    .line 43
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lhb/r;->g:Ljava/lang/Object;

    .line 49
    .line 50
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lhb/r;->h:Ljava/lang/Object;

    .line 56
    .line 57
    new-instance p1, Log/k;

    .line 58
    .line 59
    const-string p2, "\\[AtWx=([^\\]]+)]"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Log/k;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lhb/r;->i:Ljava/lang/Object;

    .line 65
    .line 66
    return-void
.end method

.method public constructor <init>(Lud/r;Lxd/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lhb/r;->a:I

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 92
    iput-object p1, p0, Lhb/r;->b:Ljava/lang/Object;

    .line 93
    iput-object p2, p0, Lhb/r;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lud/r;Lyd/b;Lud/a;Lud/a;)V
    .locals 9

    const/4 v0, 0x3

    iput v0, p0, Lhb/r;->a:I

    .line 74
    new-instance v6, Lze/c;

    invoke-direct {v6, p1}, Lze/c;-><init>(Lud/r;)V

    .line 75
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v8}, Lhb/r;-><init>(Lud/r;Lyd/b;Lud/a;Lud/a;Lze/c;Ljava/util/Set;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lud/r;Lyd/b;Lud/a;Lud/a;Lze/c;Ljava/util/Set;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lhb/r;->a:I

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Lhb/r;->b:Ljava/lang/Object;

    .line 78
    iput-object p2, p0, Lhb/r;->c:Ljava/lang/Object;

    .line 79
    iput-object p3, p0, Lhb/r;->e:Ljava/lang/Object;

    .line 80
    iput-object p4, p0, Lhb/r;->f:Ljava/lang/Object;

    .line 81
    iput-object p5, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 82
    iput-object p6, p0, Lhb/r;->g:Ljava/lang/Object;

    .line 83
    iput-object p7, p0, Lhb/r;->h:Ljava/lang/Object;

    return-void
.end method

.method public static b(Ljava/lang/String;Lq9/f;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p1, Lq9/f;->b:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "%userName%"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v1, v0, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "%groupNickname%"

    .line 11
    .line 12
    iget-object v1, p1, Lq9/f;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "%oldGroupNickname%"

    .line 19
    .line 20
    iget-object v1, p1, Lq9/f;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "%newGroupNickname%"

    .line 27
    .line 28
    iget-object v1, p1, Lq9/f;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "%userWxid%"

    .line 35
    .line 36
    iget-object v1, p1, Lq9/f;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v0, "%realNameTail%"

    .line 43
    .line 44
    iget-object v1, p1, Lq9/f;->f:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v0, "%gender%"

    .line 51
    .line 52
    iget-object v1, p1, Lq9/f;->g:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string v0, "%region%"

    .line 59
    .line 60
    iget-object v1, p1, Lq9/f;->h:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string v0, "%groupName%"

    .line 67
    .line 68
    iget-object v1, p1, Lq9/f;->i:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-string v0, "%time%"

    .line 75
    .line 76
    iget-object p1, p1, Lq9/f;->j:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {p0, v0, p1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method

.method public static f(Ljava/lang/String;Ljava/util/LinkedHashSet;Lb/e;)Ljava/util/Map;
    .locals 8

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lg8/i;->w(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v1

    .line 14
    :goto_0
    sget-object v0, Ltf/u;->g:Ltf/u;

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    move-object p0, v0

    .line 19
    :cond_1
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_3

    .line 33
    .line 34
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/lang/String;

    .line 39
    .line 40
    invoke-interface {p0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v5, v4}, Lhb/r;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    if-eqz p2, :cond_4

    .line 61
    .line 62
    iget-object p0, p2, Lb/e;->i:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move-object p0, v1

    .line 68
    :goto_2
    if-eqz p0, :cond_a

    .line 69
    .line 70
    iget-object p2, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-nez p2, :cond_a

    .line 77
    .line 78
    iget-object p2, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->rawDisplayNames:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v3, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_5

    .line 91
    .line 92
    sget-object p2, Ltf/t;->g:Ltf/t;

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_5
    const-string v4, "\n"

    .line 96
    .line 97
    const-string v5, ";"

    .line 98
    .line 99
    const-string v6, "\u0001"

    .line 100
    .line 101
    const-string v7, "\u0002"

    .line 102
    .line 103
    filled-new-array {v6, v7, v4, v5}, [Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_7

    .line 120
    .line 121
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, Ljava/lang/String;

    .line 126
    .line 127
    filled-new-array {v5}, [Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-static {p2, v5}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-ne v6, v3, :cond_6

    .line 140
    .line 141
    move-object p2, v5

    .line 142
    goto :goto_3

    .line 143
    :cond_7
    invoke-static {p2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    iget-object v4, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 152
    .line 153
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-ne v3, v4, :cond_a

    .line 158
    .line 159
    iget-object p0, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    const/4 v3, 0x0

    .line 166
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-eqz v4, :cond_a

    .line 171
    .line 172
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    add-int/lit8 v5, v3, 0x1

    .line 177
    .line 178
    if-ltz v3, :cond_9

    .line 179
    .line 180
    check-cast v4, Ljava/lang/String;

    .line 181
    .line 182
    invoke-interface {p1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-eqz v6, :cond_8

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    if-nez v6, :cond_8

    .line 193
    .line 194
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    check-cast v3, Ljava/lang/String;

    .line 199
    .line 200
    invoke-static {v3, v4}, Lhb/r;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    :cond_8
    move v3, v5

    .line 208
    goto :goto_4

    .line 209
    :cond_9
    invoke-static {}, La/a;->Q0()V

    .line 210
    .line 211
    .line 212
    throw v1

    .line 213
    :cond_a
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    if-eqz p0, :cond_b

    .line 222
    .line 223
    move-object v1, v2

    .line 224
    :cond_b
    if-nez v1, :cond_c

    .line 225
    .line 226
    return-object v0

    .line 227
    :cond_c
    return-object v1
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "&"

    .line 2
    .line 3
    const-string v1, "&amp;"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "<"

    .line 11
    .line 12
    const-string v1, "&lt;"

    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, ">"

    .line 19
    .line 20
    const-string v1, "&gt;"

    .line 21
    .line 22
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "\""

    .line 27
    .line 28
    const-string v1, "&quot;"

    .line 29
    .line 30
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "\'"

    .line 35
    .line 36
    const-string v1, "&apos;"

    .line 37
    .line 38
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static varargs i([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_3

    .line 5
    .line 6
    aget-object v3, p0, v2

    .line 7
    .line 8
    if-eqz v3, :cond_1

    .line 9
    .line 10
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    move v4, v1

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_1
    const/4 v4, 0x1

    .line 20
    :goto_2
    if-nez v4, :cond_2

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    const/4 v3, 0x0

    .line 27
    :goto_3
    if-nez v3, :cond_4

    .line 28
    .line 29
    const-string p0, ""

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_4
    return-object v3
.end method

.method public static l(Lhb/r;)Lhb/r;
    .locals 8

    .line 1
    new-instance v0, Lhb/r;

    .line 2
    .line 3
    iget-object v1, p0, Lhb/r;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lud/r;

    .line 6
    .line 7
    iget-object v2, p0, Lhb/r;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lyd/b;

    .line 10
    .line 11
    invoke-static {v2}, Lyd/b;->K(Lyd/b;)Lyd/b;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Lhb/r;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lud/a;

    .line 18
    .line 19
    iget-object v4, p0, Lhb/r;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Lud/a;

    .line 22
    .line 23
    iget-object v5, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, Lze/c;

    .line 26
    .line 27
    iget-object v6, p0, Lhb/r;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Ljava/util/Set;

    .line 30
    .line 31
    iget-object p0, p0, Lhb/r;->h:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v7, p0

    .line 34
    check-cast v7, Ljava/util/List;

    .line 35
    .line 36
    invoke-direct/range {v0 .. v7}, Lhb/r;-><init>(Lud/r;Lyd/b;Lud/a;Lud/a;Lze/c;Ljava/util/Set;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v0

    .line 14
    :goto_0
    const-string v1, ""

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    move-object p0, v1

    .line 19
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    move-object v0, p0

    .line 26
    :cond_2
    if-nez v0, :cond_3

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_3
    return-object v0
.end method

.method public static o(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "||"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    move-object v2, v1

    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-lez v2, :cond_2

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    const/4 v2, 0x0

    .line 71
    :goto_2
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    const-string p0, ""

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_4
    sget-object v0, Ljg/d;->g:Ljg/a;

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    sget-object v1, Ljg/d;->g:Ljg/a;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Ljg/a;->g(I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, Ljava/lang/String;

    .line 103
    .line 104
    return-object p0
.end method

.method public static t(Ljava/lang/String;)Ljava/util/Set;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-static {p0, v0, v1}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v2, v1

    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-lez v2, :cond_2

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const/4 v2, 0x0

    .line 72
    :goto_2
    if-eqz v2, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-static {p0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :array_0
    .array-data 2
        0x7cs
        0x2cs
    .end array-data
.end method


# virtual methods
.method public a(Lhb/q;IJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Handler;

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    iput-object v1, p0, Lhb/r;->g:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 10
    .line 11
    iput-object v1, p0, Lhb/r;->h:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v1, p0, Lhb/r;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lhb/o;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    iput-object v1, p0, Lhb/r;->i:Ljava/lang/Object;

    .line 24
    .line 25
    iget v1, p1, Lhb/q;->f:I

    .line 26
    .line 27
    iget-object v2, p1, Lhb/q;->c:Ljava/util/List;

    .line 28
    .line 29
    add-int/2addr v1, p2

    .line 30
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-le v1, p2, :cond_1

    .line 35
    .line 36
    move v1, p2

    .line 37
    :cond_1
    iput v1, p1, Lhb/q;->f:I

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-lt v1, p2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lhb/r;->e(Lhb/q;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    new-instance p2, Lhb/n;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {p2, p0, p1, v1}, Lhb/n;-><init>(Lhb/r;Lhb/q;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p2, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lhb/r;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "group_rename_prompt_type"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, "_"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v3, "global"

    .line 31
    .line 32
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v1, v3

    .line 40
    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const-string v3, "group_rename_both_order"

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-static {v3, v2, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :goto_1
    const-string p1, "text_first"

    .line 54
    .line 55
    invoke-interface {v0, v3, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v0, p1

    .line 63
    :goto_2
    const-string v1, "card_first"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    move-object p1, v1

    .line 72
    :cond_3
    return-object p1
.end method

.method public d(Ljava/lang/String;Lq9/d;)Ljava/lang/String;
    .locals 11

    .line 1
    invoke-virtual {p0, p1, p2}, Lhb/r;->r(Ljava/lang/String;Lq9/d;)Lq9/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lhb/r;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p2, Landroid/content/SharedPreferences;

    .line 8
    .line 9
    const-string v0, "group_rename_notice_text"

    .line 10
    .line 11
    const-string v1, "%oldGroupNickname% \u6539\u540d\u4e3a %newGroupNickname%(%userWxid%)"

    .line 12
    .line 13
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    move-object v1, p2

    .line 20
    :cond_0
    iget-object p2, p1, Lq9/f;->b:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v2, Lsf/e;

    .line 23
    .line 24
    const-string v0, "%userName%"

    .line 25
    .line 26
    invoke-direct {v2, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p2, p1, Lq9/f;->c:Ljava/lang/String;

    .line 30
    .line 31
    new-instance v3, Lsf/e;

    .line 32
    .line 33
    const-string v0, "%groupNickname%"

    .line 34
    .line 35
    invoke-direct {v3, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p2, p1, Lq9/f;->d:Ljava/lang/String;

    .line 39
    .line 40
    new-instance v4, Lsf/e;

    .line 41
    .line 42
    const-string v0, "%oldGroupNickname%"

    .line 43
    .line 44
    invoke-direct {v4, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p2, p1, Lq9/f;->e:Ljava/lang/String;

    .line 48
    .line 49
    new-instance v5, Lsf/e;

    .line 50
    .line 51
    const-string v0, "%newGroupNickname%"

    .line 52
    .line 53
    invoke-direct {v5, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p1, Lq9/f;->f:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v6, Lsf/e;

    .line 59
    .line 60
    const-string v0, "%realNameTail%"

    .line 61
    .line 62
    invoke-direct {v6, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p1, Lq9/f;->g:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v7, Lsf/e;

    .line 68
    .line 69
    const-string v0, "%gender%"

    .line 70
    .line 71
    invoke-direct {v7, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p2, p1, Lq9/f;->h:Ljava/lang/String;

    .line 75
    .line 76
    new-instance v8, Lsf/e;

    .line 77
    .line 78
    const-string v0, "%region%"

    .line 79
    .line 80
    invoke-direct {v8, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p2, p1, Lq9/f;->i:Ljava/lang/String;

    .line 84
    .line 85
    new-instance v9, Lsf/e;

    .line 86
    .line 87
    const-string v0, "%groupName%"

    .line 88
    .line 89
    invoke-direct {v9, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p2, p1, Lq9/f;->j:Ljava/lang/String;

    .line 93
    .line 94
    new-instance v10, Lsf/e;

    .line 95
    .line 96
    const-string v0, "%time%"

    .line 97
    .line 98
    invoke-direct {v10, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    filled-new-array/range {v2 .. v10}, [Lsf/e;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-static {p2}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const-string v2, "%userWxid%"

    .line 114
    .line 115
    invoke-static {v0, v2}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    new-instance v2, Log/k;

    .line 120
    .line 121
    new-instance v3, La9/h;

    .line 122
    .line 123
    const/16 v4, 0x1b

    .line 124
    .line 125
    invoke-direct {v3, v4}, La9/h;-><init>(I)V

    .line 126
    .line 127
    .line 128
    invoke-static {v0, v3}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    new-instance v9, Lo9/e;

    .line 133
    .line 134
    const/16 v0, 0x15

    .line 135
    .line 136
    invoke-direct {v9, v0}, Lo9/e;-><init>(I)V

    .line 137
    .line 138
    .line 139
    const/16 v10, 0x1e

    .line 140
    .line 141
    const-string v6, "|"

    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    const/4 v8, 0x0

    .line 145
    invoke-static/range {v5 .. v10}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-direct {v2, v0}, Log/k;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    new-instance v0, Lb0/s;

    .line 153
    .line 154
    const/16 v3, 0xe

    .line 155
    .line 156
    invoke-direct {v0, p0, p1, p2, v3}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v1, v0}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    return-object p1
.end method

.method public e(Lhb/q;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Handler;

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    iput-object v1, p0, Lhb/r;->g:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 10
    .line 11
    iput-object v1, p0, Lhb/r;->h:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v1, p0, Lhb/r;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lhb/o;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    iput-object v1, p0, Lhb/r;->i:Ljava/lang/Object;

    .line 24
    .line 25
    iget v2, p1, Lhb/q;->e:I

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    iput v2, p1, Lhb/q;->e:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    iput v2, p1, Lhb/q;->f:I

    .line 33
    .line 34
    const/4 v2, -0x1

    .line 35
    iput v2, p1, Lhb/q;->i:I

    .line 36
    .line 37
    iput-object v1, p1, Lhb/q;->j:Lhb/p;

    .line 38
    .line 39
    new-instance v1, Lhb/n;

    .line 40
    .line 41
    const/4 v2, 0x2

    .line 42
    invoke-direct {v1, p0, p1, v2}, Lhb/n;-><init>(Lhb/r;Lhb/q;I)V

    .line 43
    .line 44
    .line 45
    const-wide/16 v2, 0x15e

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public g(Ljava/util/List;Ljava/util/List;Lfg/q;)Lhb/s;
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_4

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v3, v2

    .line 29
    check-cast v3, Lhb/t;

    .line 30
    .line 31
    iget-object v4, v3, Lhb/t;->g:Lk8/t;

    .line 32
    .line 33
    if-nez v4, :cond_3

    .line 34
    .line 35
    iget-object v3, v3, Lhb/t;->h:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/4 v3, 0x0

    .line 45
    goto :goto_2

    .line 46
    :cond_3
    :goto_1
    const/4 v3, 0x1

    .line 47
    :goto_2
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v2, v1}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    new-instance p2, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :cond_6
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_7

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    move-object v3, v2

    .line 102
    check-cast v3, Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_6

    .line 109
    .line 110
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    invoke-static {p2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-static {p2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-ne v1, p1, :cond_9

    .line 131
    .line 132
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_8

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_8
    new-instance p1, Lhb/q;

    .line 140
    .line 141
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-direct {p1, v1, v0, p2, p3}, Lhb/q;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Lfg/q;)V

    .line 153
    .line 154
    .line 155
    iget-object p2, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p2, Landroid/os/Handler;

    .line 158
    .line 159
    new-instance p3, Lhb/n;

    .line 160
    .line 161
    const/4 v0, 0x1

    .line 162
    invoke-direct {p3, p0, p1, v0}, Lhb/n;-><init>(Lhb/r;Lhb/q;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 166
    .line 167
    .line 168
    new-instance p2, Lhb/s;

    .line 169
    .line 170
    new-instance p3, Laa/c;

    .line 171
    .line 172
    const/16 v0, 0xe

    .line 173
    .line 174
    invoke-direct {p3, p0, v0, p1}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-direct {p2, p3}, Lhb/s;-><init>(Lfg/a;)V

    .line 178
    .line 179
    .line 180
    return-object p2

    .line 181
    :cond_9
    :goto_5
    const/4 p1, 0x0

    .line 182
    return-object p1
.end method

.method public j()Lud/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lze/c;

    .line 4
    .line 5
    iget-object v1, v0, Lze/c;->g:Lud/r;

    .line 6
    .line 7
    iget-object v1, v1, Lud/r;->z:Ljava/util/List;

    .line 8
    .line 9
    iget-object v0, v0, Lze/c;->h:Ljava/util/BitSet;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lud/a;

    .line 21
    .line 22
    return-object v0
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lhb/r;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, "_"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_0
    invoke-interface {v0, p2, p3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    return-object p3
.end method

.method public varargs m([Lhb/r;)V
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    iget-object v3, p0, Lhb/r;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lze/c;

    .line 10
    .line 11
    iget-object v4, v2, Lhb/r;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Lze/c;

    .line 14
    .line 15
    iget-object v3, v3, Lze/c;->h:Ljava/util/BitSet;

    .line 16
    .line 17
    iget-object v4, v4, Lze/c;->h:Ljava/util/BitSet;

    .line 18
    .line 19
    invoke-virtual {v3, v4}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lhb/r;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Ljava/util/Set;

    .line 25
    .line 26
    iget-object v4, v2, Lhb/r;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Ljava/util/Set;

    .line 29
    .line 30
    invoke-interface {v3, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 31
    .line 32
    .line 33
    iget-object v2, v2, Lhb/r;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Ljava/util/List;

    .line 36
    .line 37
    iget-object v3, p0, Lhb/r;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 42
    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-void
.end method

.method public p()V
    .locals 6

    .line 1
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->c()Lg8/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    invoke-virtual {v0}, Lg8/d;->g()Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 33
    .line 34
    iget-object v2, v1, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-object v1, v1, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v1}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    new-instance v3, Lo9/e;

    .line 58
    .line 59
    const/16 v4, 0x11

    .line 60
    .line 61
    invoke-direct {v3, v4}, Lo9/e;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v3}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    new-instance v3, Lo9/e;

    .line 69
    .line 70
    const/16 v4, 0x12

    .line 71
    .line 72
    invoke-direct {v3, v4}, Lo9/e;-><init>(I)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Lng/i;

    .line 76
    .line 77
    const/4 v5, 0x1

    .line 78
    invoke-direct {v4, v1, v5, v3}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 79
    .line 80
    .line 81
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-static {v4, v1}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_2

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    iget-object v3, p0, Lhb/r;->e:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 99
    .line 100
    invoke-virtual {v3, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    const/4 v3, 0x0

    .line 104
    invoke-static {v2, v1, v3}, Lhb/r;->f(Ljava/lang/String;Ljava/util/LinkedHashSet;Lb/e;)Ljava/util/Map;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-nez v3, :cond_0

    .line 113
    .line 114
    iget-object v3, p0, Lhb/r;->f:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 117
    .line 118
    invoke-virtual {v3, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    goto :goto_1

    .line 124
    :cond_3
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :goto_1
    new-instance v1, Lsf/f;

    .line 128
    .line 129
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    move-object v0, v1

    .line 133
    :goto_2
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-eqz v0, :cond_4

    .line 138
    .line 139
    iget-object v1, p0, Lhb/r;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, Lia/t;

    .line 142
    .line 143
    const-string v2, "\u9884\u52a0\u8f7d\u7fa4\u6210\u5458\u6539\u540d\u5feb\u7167\u5931\u8d25"

    .line 144
    .line 145
    invoke-virtual {v1, v2, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    :cond_4
    return-void
.end method

.method public q(Ljava/lang/String;)Lq9/g;
    .locals 6

    .line 1
    iget-object v0, p0, Lhb/r;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    const-string v1, "group_rename_template_bindings"

    .line 6
    .line 7
    const-string v2, ""

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    move-object v1, v2

    .line 16
    :cond_0
    invoke-static {v1}, Lx6/d;->S(Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    move-object v5, v3

    .line 36
    check-cast v5, Lq9/h;

    .line 37
    .line 38
    iget-object v5, v5, Lq9/h;->a:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v5, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-object v3, v4

    .line 48
    :goto_0
    check-cast v3, Lq9/h;

    .line 49
    .line 50
    if-eqz v3, :cond_6

    .line 51
    .line 52
    const-string p1, "group_rename_templates"

    .line 53
    .line 54
    invoke-interface {v0, p1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move-object v2, p1

    .line 62
    :goto_1
    invoke-static {v2}, Lx6/d;->U(Ljava/lang/String;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    move-object v1, v0

    .line 81
    check-cast v1, Lq9/g;

    .line 82
    .line 83
    iget-object v1, v1, Lq9/g;->a:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v2, v3, Lq9/h;->c:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    move-object v4, v0

    .line 94
    :cond_5
    check-cast v4, Lq9/g;

    .line 95
    .line 96
    :cond_6
    return-object v4
.end method

.method public r(Ljava/lang/String;Lq9/d;)Lq9/f;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, Lhb/r;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lbb/l;

    .line 10
    .line 11
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    iget-object v6, v2, Lq9/d;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v4, v6}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v6, v5

    .line 26
    :goto_0
    if-eqz v6, :cond_1

    .line 27
    .line 28
    iget-object v7, v6, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object v7, v5

    .line 32
    :goto_1
    if-eqz v6, :cond_2

    .line 33
    .line 34
    iget-object v6, v6, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move-object v6, v5

    .line 38
    :goto_2
    iget-object v8, v2, Lq9/d;->a:Ljava/lang/String;

    .line 39
    .line 40
    filled-new-array {v7, v6, v8}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-static {v6}, Lhb/r;->i([Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    iget-object v6, v2, Lq9/d;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_3

    .line 55
    .line 56
    move-object v13, v11

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    move-object v13, v6

    .line 59
    :goto_3
    iget-object v6, v2, Lq9/d;->c:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_4

    .line 66
    .line 67
    move-object v12, v11

    .line 68
    goto :goto_4

    .line 69
    :cond_4
    move-object v12, v6

    .line 70
    :goto_4
    iget-object v10, v2, Lq9/d;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v3, v10}, Lbb/l;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v15

    .line 76
    if-eqz v4, :cond_5

    .line 77
    .line 78
    invoke-virtual {v4, v8}, Lg8/i;->s(Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    goto :goto_5

    .line 83
    :cond_5
    const/4 v2, 0x0

    .line 84
    :goto_5
    invoke-virtual {v3, v2}, Lbb/l;->d(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v16

    .line 88
    if-eqz v4, :cond_6

    .line 89
    .line 90
    invoke-virtual {v4, v8}, Lg8/i;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    if-eqz v2, :cond_6

    .line 95
    .line 96
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    if-eqz v2, :cond_6

    .line 105
    .line 106
    const-string v3, "\\s+"

    .line 107
    .line 108
    const-string v6, " "

    .line 109
    .line 110
    invoke-static {v3, v2, v6}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    goto :goto_6

    .line 115
    :cond_6
    move-object v2, v5

    .line 116
    :goto_6
    if-nez v2, :cond_7

    .line 117
    .line 118
    const-string v2, ""

    .line 119
    .line 120
    :cond_7
    move-object/from16 v17, v2

    .line 121
    .line 122
    if-eqz v4, :cond_9

    .line 123
    .line 124
    invoke-virtual {v4, v0}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    if-eqz v2, :cond_9

    .line 129
    .line 130
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    if-eqz v2, :cond_9

    .line 135
    .line 136
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-nez v3, :cond_8

    .line 141
    .line 142
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-nez v3, :cond_8

    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_8
    move-object v2, v5

    .line 150
    :goto_7
    if-eqz v2, :cond_9

    .line 151
    .line 152
    move-object/from16 v18, v2

    .line 153
    .line 154
    goto :goto_8

    .line 155
    :cond_9
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    if-eqz v2, :cond_a

    .line 160
    .line 161
    invoke-virtual {v2, v0}, Lg8/d;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-eqz v2, :cond_a

    .line 166
    .line 167
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-nez v3, :cond_a

    .line 172
    .line 173
    move-object v5, v2

    .line 174
    :cond_a
    if-eqz v5, :cond_b

    .line 175
    .line 176
    move-object/from16 v18, v5

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_b
    move-object/from16 v18, v0

    .line 180
    .line 181
    :goto_8
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 182
    .line 183
    const-string v2, "yyyy-MM-dd HH:mm:ss"

    .line 184
    .line 185
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-direct {v0, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 190
    .line 191
    .line 192
    new-instance v2, Ljava/util/Date;

    .line 193
    .line 194
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v19

    .line 201
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    new-instance v9, Lq9/f;

    .line 205
    .line 206
    move-object v14, v12

    .line 207
    invoke-direct/range {v9 .. v19}, Lq9/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-object v9
.end method

.method public s(Lhb/q;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v1, Lhb/r;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lr8/g;

    .line 8
    .line 9
    iget-object v3, v1, Lhb/r;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lab/b;

    .line 12
    .line 13
    iget-object v4, v1, Lhb/r;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Lhb/q;

    .line 16
    .line 17
    if-eq v4, v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_1e

    .line 20
    .line 21
    :cond_0
    iget v4, v2, Lhb/q;->e:I

    .line 22
    .line 23
    iget-object v5, v2, Lhb/q;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget-object v6, v2, Lhb/q;->c:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const-string v8, ""

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    if-lt v4, v7, :cond_2

    .line 35
    .line 36
    iget-object v0, v2, Lhb/q;->d:Lfg/q;

    .line 37
    .line 38
    iget v3, v2, Lhb/q;->g:I

    .line 39
    .line 40
    iget v2, v2, Lhb/q;->h:I

    .line 41
    .line 42
    iput-object v9, v1, Lhb/r;->f:Ljava/lang/Object;

    .line 43
    .line 44
    iput-object v8, v1, Lhb/r;->g:Ljava/lang/Object;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-interface {v0, v3, v2, v4}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-virtual {v1}, Lhb/r;->u()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    iget v4, v2, Lhb/q;->e:I

    .line 66
    .line 67
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Lhb/t;

    .line 72
    .line 73
    iget v5, v2, Lhb/q;->i:I

    .line 74
    .line 75
    iget v7, v2, Lhb/q;->e:I

    .line 76
    .line 77
    const/16 v11, 0x2b

    .line 78
    .line 79
    const/16 v12, 0x3e

    .line 80
    .line 81
    const/16 v13, 0x22

    .line 82
    .line 83
    const/4 v15, 0x1

    .line 84
    if-ne v5, v7, :cond_3

    .line 85
    .line 86
    iget-object v5, v2, Lhb/q;->j:Lhb/p;

    .line 87
    .line 88
    goto/16 :goto_12

    .line 89
    .line 90
    :cond_3
    iget v5, v4, Lhb/t;->b:I

    .line 91
    .line 92
    iget-object v7, v4, Lhb/t;->g:Lk8/t;

    .line 93
    .line 94
    const v16, 0xffff

    .line 95
    .line 96
    .line 97
    and-int v5, v5, v16

    .line 98
    .line 99
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 100
    .line 101
    .line 102
    move-result-object v16

    .line 103
    if-eqz v16, :cond_4

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messages()Lk8/g;

    .line 107
    .line 108
    .line 109
    move-result-object v16

    .line 110
    :goto_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 111
    .line 112
    .line 113
    move-result-object v17

    .line 114
    if-eq v5, v11, :cond_6

    .line 115
    .line 116
    if-eq v5, v12, :cond_6

    .line 117
    .line 118
    :cond_5
    :goto_1
    move-object v9, v8

    .line 119
    goto/16 :goto_8

    .line 120
    .line 121
    :cond_6
    if-eqz v7, :cond_7

    .line 122
    .line 123
    iget-object v9, v7, Lk8/t;->f:Ljava/lang/String;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_7
    const/4 v9, 0x0

    .line 127
    :goto_2
    if-nez v9, :cond_8

    .line 128
    .line 129
    move-object v9, v8

    .line 130
    :cond_8
    iget-object v14, v4, Lhb/t;->e:Ljava/lang/String;

    .line 131
    .line 132
    filled-new-array {v9, v14}, [Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-static {v9}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    new-instance v14, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-static {v9}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    invoke-direct {v14, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    if-eqz v10, :cond_9

    .line 158
    .line 159
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    check-cast v10, Ljava/lang/String;

    .line 164
    .line 165
    invoke-static {v10, v14}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_9
    new-instance v9, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    :cond_a
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    if-eqz v14, :cond_b

    .line 183
    .line 184
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    move-object/from16 v19, v14

    .line 189
    .line 190
    check-cast v19, Ljava/lang/String;

    .line 191
    .line 192
    invoke-static/range {v19 .. v19}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 193
    .line 194
    .line 195
    move-result v19

    .line 196
    if-nez v19, :cond_a

    .line 197
    .line 198
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_b
    invoke-static {v9}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    invoke-static {v9}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    :cond_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v14

    .line 218
    if-eqz v14, :cond_d

    .line 219
    .line 220
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    move-object/from16 v19, v14

    .line 225
    .line 226
    check-cast v19, Ljava/lang/String;

    .line 227
    .line 228
    invoke-static/range {v19 .. v19}, Leh/a;->y(Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result v19

    .line 232
    if-eqz v19, :cond_c

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_d
    const/4 v14, 0x0

    .line 236
    :goto_5
    check-cast v14, Ljava/lang/String;

    .line 237
    .line 238
    if-eqz v14, :cond_e

    .line 239
    .line 240
    new-instance v9, Ljava/io/File;

    .line 241
    .line 242
    invoke-direct {v9, v14}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_e
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    if-eqz v10, :cond_5

    .line 258
    .line 259
    iget-object v10, v10, Lj8/p;->c:Lbb/b;

    .line 260
    .line 261
    if-eqz v10, :cond_5

    .line 262
    .line 263
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    :cond_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v14

    .line 271
    if-eqz v14, :cond_11

    .line 272
    .line 273
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v14

    .line 277
    check-cast v14, Ljava/lang/String;

    .line 278
    .line 279
    invoke-virtual {v10, v14}, Lbb/b;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v14

    .line 283
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 287
    .line 288
    .line 289
    move-result v19

    .line 290
    if-nez v19, :cond_10

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_10
    const/4 v14, 0x0

    .line 294
    :goto_6
    if-eqz v14, :cond_f

    .line 295
    .line 296
    move-object v9, v14

    .line 297
    goto :goto_7

    .line 298
    :cond_11
    const/4 v9, 0x0

    .line 299
    :goto_7
    if-nez v9, :cond_12

    .line 300
    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :cond_12
    :goto_8
    const/16 v10, 0x2f

    .line 304
    .line 305
    if-eq v5, v13, :cond_1b

    .line 306
    .line 307
    if-eq v5, v11, :cond_1c

    .line 308
    .line 309
    if-eq v5, v10, :cond_13

    .line 310
    .line 311
    if-eq v5, v12, :cond_1c

    .line 312
    .line 313
    move-object v9, v8

    .line 314
    goto :goto_b

    .line 315
    :cond_13
    if-eqz v7, :cond_14

    .line 316
    .line 317
    iget-object v9, v7, Lk8/t;->f:Ljava/lang/String;

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_14
    const/4 v9, 0x0

    .line 321
    :goto_9
    if-nez v9, :cond_15

    .line 322
    .line 323
    move-object v9, v8

    .line 324
    :cond_15
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    invoke-static {v9}, Leh/a;->y(Ljava/lang/String;)Z

    .line 333
    .line 334
    .line 335
    move-result v14

    .line 336
    if-nez v14, :cond_1c

    .line 337
    .line 338
    const-string v14, "[0-9a-fA-F]{32}"

    .line 339
    .line 340
    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 341
    .line 342
    .line 343
    move-result-object v14

    .line 344
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v14, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 351
    .line 352
    .line 353
    move-result-object v14

    .line 354
    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    .line 355
    .line 356
    .line 357
    move-result v14

    .line 358
    if-eqz v14, :cond_16

    .line 359
    .line 360
    goto :goto_b

    .line 361
    :cond_16
    if-eqz v7, :cond_17

    .line 362
    .line 363
    iget-object v9, v7, Lk8/t;->c:Ljava/lang/String;

    .line 364
    .line 365
    goto :goto_a

    .line 366
    :cond_17
    const/4 v9, 0x0

    .line 367
    :goto_a
    if-nez v9, :cond_18

    .line 368
    .line 369
    move-object v9, v8

    .line 370
    :cond_18
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 371
    .line 372
    .line 373
    move-result v14

    .line 374
    if-eqz v14, :cond_19

    .line 375
    .line 376
    iget-object v9, v4, Lhb/t;->d:Ljava/lang/String;

    .line 377
    .line 378
    :cond_19
    sget-object v14, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 379
    .line 380
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    const-string v14, "md5"

    .line 384
    .line 385
    invoke-static {v9, v14}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v19

    .line 389
    invoke-static/range {v19 .. v19}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 390
    .line 391
    .line 392
    move-result v20

    .line 393
    if-eqz v20, :cond_1a

    .line 394
    .line 395
    invoke-static {v9, v14}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v9

    .line 399
    goto :goto_b

    .line 400
    :cond_1a
    move-object/from16 v9, v19

    .line 401
    .line 402
    goto :goto_b

    .line 403
    :cond_1b
    iget-object v9, v4, Lhb/t;->h:Ljava/lang/String;

    .line 404
    .line 405
    :cond_1c
    :goto_b
    if-eq v5, v15, :cond_21

    .line 406
    .line 407
    if-eq v5, v13, :cond_20

    .line 408
    .line 409
    if-eq v5, v12, :cond_20

    .line 410
    .line 411
    const/16 v14, 0x2a

    .line 412
    .line 413
    if-eq v5, v14, :cond_21

    .line 414
    .line 415
    if-eq v5, v11, :cond_20

    .line 416
    .line 417
    packed-switch v5, :pswitch_data_0

    .line 418
    .line 419
    .line 420
    :cond_1d
    :goto_c
    const/4 v7, 0x0

    .line 421
    goto :goto_10

    .line 422
    :pswitch_0
    invoke-virtual {v4}, Lhb/t;->a()Z

    .line 423
    .line 424
    .line 425
    move-result v10

    .line 426
    if-nez v10, :cond_1d

    .line 427
    .line 428
    if-eqz v16, :cond_1d

    .line 429
    .line 430
    if-eqz v7, :cond_1e

    .line 431
    .line 432
    iget-object v7, v7, Lk8/t;->c:Ljava/lang/String;

    .line 433
    .line 434
    goto :goto_d

    .line 435
    :cond_1e
    const/4 v7, 0x0

    .line 436
    :goto_d
    if-eqz v7, :cond_1d

    .line 437
    .line 438
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 439
    .line 440
    .line 441
    move-result v7

    .line 442
    if-eqz v7, :cond_1f

    .line 443
    .line 444
    goto :goto_c

    .line 445
    :cond_1f
    :goto_e
    move v7, v15

    .line 446
    goto :goto_10

    .line 447
    :cond_20
    :pswitch_1
    if-eqz v17, :cond_1d

    .line 448
    .line 449
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 450
    .line 451
    .line 452
    move-result v7

    .line 453
    if-nez v7, :cond_1d

    .line 454
    .line 455
    if-eq v5, v10, :cond_1f

    .line 456
    .line 457
    invoke-static {v9}, Leh/a;->y(Ljava/lang/String;)Z

    .line 458
    .line 459
    .line 460
    move-result v7

    .line 461
    if-eqz v7, :cond_1d

    .line 462
    .line 463
    goto :goto_e

    .line 464
    :cond_21
    :pswitch_2
    if-eqz v16, :cond_1d

    .line 465
    .line 466
    if-eqz v7, :cond_22

    .line 467
    .line 468
    iget-object v7, v7, Lk8/t;->c:Ljava/lang/String;

    .line 469
    .line 470
    goto :goto_f

    .line 471
    :cond_22
    const/4 v7, 0x0

    .line 472
    :goto_f
    if-eqz v7, :cond_1d

    .line 473
    .line 474
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 475
    .line 476
    .line 477
    move-result v7

    .line 478
    if-eqz v7, :cond_1f

    .line 479
    .line 480
    goto :goto_c

    .line 481
    :goto_10
    iget v10, v2, Lhb/q;->e:I

    .line 482
    .line 483
    iput v10, v2, Lhb/q;->i:I

    .line 484
    .line 485
    if-eqz v7, :cond_23

    .line 486
    .line 487
    new-instance v7, Lhb/p;

    .line 488
    .line 489
    invoke-direct {v7, v5, v9}, Lhb/p;-><init>(ILjava/lang/String;)V

    .line 490
    .line 491
    .line 492
    move-object v5, v7

    .line 493
    goto :goto_11

    .line 494
    :cond_23
    const/4 v5, 0x0

    .line 495
    :goto_11
    iput-object v5, v2, Lhb/q;->j:Lhb/p;

    .line 496
    .line 497
    :goto_12
    if-eqz v5, :cond_30

    .line 498
    .line 499
    iget v7, v5, Lhb/p;->a:I

    .line 500
    .line 501
    iget v0, v2, Lhb/q;->f:I

    .line 502
    .line 503
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 504
    .line 505
    .line 506
    move-result v9

    .line 507
    if-lt v0, v9, :cond_24

    .line 508
    .line 509
    invoke-virtual/range {p0 .. p1}, Lhb/r;->e(Lhb/q;)V

    .line 510
    .line 511
    .line 512
    return-void

    .line 513
    :cond_24
    iget v0, v2, Lhb/q;->f:I

    .line 514
    .line 515
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    move-object v6, v0

    .line 520
    check-cast v6, Ljava/lang/String;

    .line 521
    .line 522
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->j()Lk8/g;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    if-eqz v0, :cond_25

    .line 534
    .line 535
    goto :goto_13

    .line 536
    :cond_25
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messages()Lk8/g;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    :goto_13
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 541
    .line 542
    .line 543
    move-result-object v9

    .line 544
    iget-object v10, v4, Lhb/t;->g:Lk8/t;

    .line 545
    .line 546
    if-eqz v10, :cond_26

    .line 547
    .line 548
    iget-object v10, v10, Lk8/t;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 549
    .line 550
    move-object/from16 v18, v10

    .line 551
    .line 552
    goto :goto_14

    .line 553
    :catchall_0
    move-exception v0

    .line 554
    goto/16 :goto_18

    .line 555
    .line 556
    :cond_26
    const/16 v18, 0x0

    .line 557
    .line 558
    :goto_14
    if-nez v18, :cond_27

    .line 559
    .line 560
    goto :goto_15

    .line 561
    :cond_27
    move-object/from16 v8, v18

    .line 562
    .line 563
    :goto_15
    iget-object v5, v5, Lhb/p;->b:Ljava/lang/String;

    .line 564
    .line 565
    if-eq v7, v15, :cond_2c

    .line 566
    .line 567
    if-eq v7, v13, :cond_2b

    .line 568
    .line 569
    if-eq v7, v12, :cond_2a

    .line 570
    .line 571
    const/16 v14, 0x2a

    .line 572
    .line 573
    if-eq v7, v14, :cond_29

    .line 574
    .line 575
    if-eq v7, v11, :cond_2a

    .line 576
    .line 577
    packed-switch v7, :pswitch_data_1

    .line 578
    .line 579
    .line 580
    :cond_28
    const/4 v14, 0x0

    .line 581
    goto :goto_17

    .line 582
    :pswitch_3
    if-eqz v0, :cond_28

    .line 583
    .line 584
    :try_start_1
    invoke-virtual {v0, v6, v8}, Lk8/g;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    if-ne v0, v15, :cond_28

    .line 589
    .line 590
    :goto_16
    move v14, v15

    .line 591
    goto :goto_17

    .line 592
    :pswitch_4
    if-eqz v0, :cond_28

    .line 593
    .line 594
    const/16 v4, 0x30

    .line 595
    .line 596
    invoke-virtual {v0, v4, v6, v8}, Lk8/g;->v(ILjava/lang/String;Ljava/lang/String;)Z

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    if-ne v0, v15, :cond_28

    .line 601
    .line 602
    goto :goto_16

    .line 603
    :pswitch_5
    if-eqz v9, :cond_28

    .line 604
    .line 605
    iget-object v0, v9, Lj8/p;->d:Lj8/f;

    .line 606
    .line 607
    invoke-virtual {v0, v6, v5}, Lj8/f;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    if-ne v0, v15, :cond_28

    .line 612
    .line 613
    goto :goto_16

    .line 614
    :cond_29
    if-eqz v0, :cond_28

    .line 615
    .line 616
    const/16 v14, 0x2a

    .line 617
    .line 618
    invoke-virtual {v0, v14, v6, v8}, Lk8/g;->v(ILjava/lang/String;Ljava/lang/String;)Z

    .line 619
    .line 620
    .line 621
    move-result v0

    .line 622
    if-ne v0, v15, :cond_28

    .line 623
    .line 624
    goto :goto_16

    .line 625
    :cond_2a
    if-eqz v9, :cond_28

    .line 626
    .line 627
    iget-object v0, v9, Lj8/p;->c:Lbb/b;

    .line 628
    .line 629
    if-eqz v0, :cond_28

    .line 630
    .line 631
    invoke-virtual {v0, v6, v5}, Lbb/b;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    if-ne v0, v15, :cond_28

    .line 636
    .line 637
    goto :goto_16

    .line 638
    :cond_2b
    if-eqz v9, :cond_28

    .line 639
    .line 640
    iget-object v0, v9, Lj8/p;->b:Lj8/y;

    .line 641
    .line 642
    if-eqz v0, :cond_28

    .line 643
    .line 644
    iget v4, v4, Lhb/t;->i:I

    .line 645
    .line 646
    invoke-virtual {v0, v4, v6, v5}, Lj8/y;->s(ILjava/lang/String;Ljava/lang/String;)Z

    .line 647
    .line 648
    .line 649
    move-result v0

    .line 650
    if-ne v0, v15, :cond_28

    .line 651
    .line 652
    goto :goto_16

    .line 653
    :cond_2c
    if-eqz v0, :cond_28

    .line 654
    .line 655
    invoke-virtual {v0, v6, v8}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    if-ne v0, v15, :cond_28

    .line 660
    .line 661
    goto :goto_16

    .line 662
    :goto_17
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 663
    .line 664
    .line 665
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 666
    goto :goto_19

    .line 667
    :goto_18
    new-instance v4, Lsf/f;

    .line 668
    .line 669
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 670
    .line 671
    .line 672
    move-object v0, v4

    .line 673
    :goto_19
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 674
    .line 675
    .line 676
    move-result-object v4

    .line 677
    if-eqz v4, :cond_2d

    .line 678
    .line 679
    new-instance v5, Ljava/lang/StringBuilder;

    .line 680
    .line 681
    const-string v8, "\u7fa4\u53d1\u52a9\u624b\u6a21\u5757\u53d1\u9001\u5931\u8d25: target="

    .line 682
    .line 683
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    const-string v6, " type="

    .line 690
    .line 691
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v5

    .line 701
    invoke-virtual {v3, v5, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    :cond_2d
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 705
    .line 706
    instance-of v4, v0, Lsf/f;

    .line 707
    .line 708
    if-eqz v4, :cond_2e

    .line 709
    .line 710
    move-object v0, v3

    .line 711
    :cond_2e
    check-cast v0, Ljava/lang/Boolean;

    .line 712
    .line 713
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 714
    .line 715
    .line 716
    move-result v0

    .line 717
    if-eqz v0, :cond_2f

    .line 718
    .line 719
    iget v0, v2, Lhb/q;->g:I

    .line 720
    .line 721
    add-int/2addr v0, v15

    .line 722
    iput v0, v2, Lhb/q;->g:I

    .line 723
    .line 724
    :cond_2f
    const-wide/16 v3, 0x1f4

    .line 725
    .line 726
    invoke-virtual {v1, v2, v15, v3, v4}, Lhb/r;->a(Lhb/q;IJ)V

    .line 727
    .line 728
    .line 729
    return-void

    .line 730
    :cond_30
    iget-object v4, v4, Lhb/t;->g:Lk8/t;

    .line 731
    .line 732
    if-nez v4, :cond_31

    .line 733
    .line 734
    invoke-virtual/range {p0 .. p1}, Lhb/r;->e(Lhb/q;)V

    .line 735
    .line 736
    .line 737
    return-void

    .line 738
    :cond_31
    iget v5, v2, Lhb/q;->f:I

    .line 739
    .line 740
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 741
    .line 742
    .line 743
    move-result v7

    .line 744
    if-lt v5, v7, :cond_32

    .line 745
    .line 746
    invoke-virtual/range {p0 .. p1}, Lhb/r;->e(Lhb/q;)V

    .line 747
    .line 748
    .line 749
    return-void

    .line 750
    :cond_32
    iget v5, v2, Lhb/q;->f:I

    .line 751
    .line 752
    add-int/lit8 v7, v5, 0xa

    .line 753
    .line 754
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 755
    .line 756
    .line 757
    move-result v9

    .line 758
    if-le v7, v9, :cond_33

    .line 759
    .line 760
    move v7, v9

    .line 761
    :cond_33
    invoke-interface {v6, v5, v7}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 762
    .line 763
    .line 764
    move-result-object v5

    .line 765
    invoke-static {v5}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 766
    .line 767
    .line 768
    move-result-object v9

    .line 769
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 770
    .line 771
    .line 772
    move-result-object v5

    .line 773
    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v5

    .line 777
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 778
    .line 779
    .line 780
    iput-object v5, v1, Lhb/r;->g:Ljava/lang/Object;

    .line 781
    .line 782
    iput-object v9, v1, Lhb/r;->h:Ljava/lang/Object;

    .line 783
    .line 784
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 785
    .line 786
    .line 787
    move-result-object v6

    .line 788
    if-eqz v6, :cond_34

    .line 789
    .line 790
    invoke-virtual {v6}, Lq8/o;->a()Landroid/app/Activity;

    .line 791
    .line 792
    .line 793
    move-result-object v6

    .line 794
    goto :goto_1a

    .line 795
    :cond_34
    const/4 v6, 0x0

    .line 796
    :goto_1a
    if-eqz v6, :cond_35

    .line 797
    .line 798
    move-object/from16 v18, v6

    .line 799
    .line 800
    goto :goto_1b

    .line 801
    :cond_35
    const/16 v18, 0x0

    .line 802
    .line 803
    :goto_1b
    if-eqz v18, :cond_36

    .line 804
    .line 805
    move-object/from16 v6, v18

    .line 806
    .line 807
    goto :goto_1c

    .line 808
    :cond_36
    iget-object v6, v0, Lr8/g;->a:Landroid/content/Context;

    .line 809
    .line 810
    :goto_1c
    new-instance v7, Landroid/content/Intent;

    .line 811
    .line 812
    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 813
    .line 814
    .line 815
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 816
    .line 817
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    const-string v10, "com.tencent.mm.ui.transmit.MsgRetransmitUI"

    .line 822
    .line 823
    invoke-virtual {v7, v0, v10}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 824
    .line 825
    .line 826
    if-nez v18, :cond_37

    .line 827
    .line 828
    const/high16 v0, 0x10000000

    .line 829
    .line 830
    invoke-virtual {v7, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 831
    .line 832
    .line 833
    :cond_37
    const-string v0, "Retr_MsgQuickShare"

    .line 834
    .line 835
    invoke-virtual {v7, v0, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 836
    .line 837
    .line 838
    const/4 v13, 0x0

    .line 839
    const/16 v14, 0x3e

    .line 840
    .line 841
    const-string v10, ","

    .line 842
    .line 843
    const/4 v11, 0x0

    .line 844
    const/4 v12, 0x0

    .line 845
    invoke-static/range {v9 .. v14}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    const-string v10, "Select_Conv_User"

    .line 850
    .line 851
    invoke-virtual {v7, v10, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 852
    .line 853
    .line 854
    const-string v0, "custom_send_text"

    .line 855
    .line 856
    invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 857
    .line 858
    .line 859
    const-string v0, "Retr_Msg_Type"

    .line 860
    .line 861
    iget v8, v4, Lk8/t;->d:I

    .line 862
    .line 863
    invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 864
    .line 865
    .line 866
    const-string v0, "Retr_Msg_Id"

    .line 867
    .line 868
    iget-wide v10, v4, Lk8/t;->a:J

    .line 869
    .line 870
    invoke-virtual {v7, v0, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 871
    .line 872
    .line 873
    const-string v0, "Retr_MsgTalker"

    .line 874
    .line 875
    iget-object v8, v4, Lk8/t;->b:Ljava/lang/String;

    .line 876
    .line 877
    invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 878
    .line 879
    .line 880
    const-string v0, "Retr_Msg_content"

    .line 881
    .line 882
    iget-object v8, v4, Lk8/t;->c:Ljava/lang/String;

    .line 883
    .line 884
    invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 885
    .line 886
    .line 887
    const-string v0, "Retr_File_Name"

    .line 888
    .line 889
    iget-object v8, v4, Lk8/t;->f:Ljava/lang/String;

    .line 890
    .line 891
    invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 892
    .line 893
    .line 894
    const-string v0, "Edit_Mode_Sigle_Msg"

    .line 895
    .line 896
    invoke-virtual {v7, v0, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 897
    .line 898
    .line 899
    const-string v0, "Retr_MsgFromScene"

    .line 900
    .line 901
    iget v8, v4, Lk8/t;->e:I

    .line 902
    .line 903
    invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 904
    .line 905
    .line 906
    const-string v0, "Retr_show_success_tips"

    .line 907
    .line 908
    const/4 v8, 0x0

    .line 909
    invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 910
    .line 911
    .line 912
    const-string v0, "Retr_go_to_chattingUI"

    .line 913
    .line 914
    invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 915
    .line 916
    .line 917
    const-string v0, "Retr_start_where_you_are"

    .line 918
    .line 919
    invoke-virtual {v7, v0, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 920
    .line 921
    .line 922
    const-string v0, "scene_from"

    .line 923
    .line 924
    const/16 v8, 0x11

    .line 925
    .line 926
    invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 927
    .line 928
    .line 929
    const-string v0, "hchat_selected_message_send_token"

    .line 930
    .line 931
    invoke-virtual {v7, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 932
    .line 933
    .line 934
    iget v0, v4, Lk8/t;->g:I

    .line 935
    .line 936
    if-lez v0, :cond_38

    .line 937
    .line 938
    const-string v4, "Retr_length"

    .line 939
    .line 940
    invoke-virtual {v7, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 941
    .line 942
    .line 943
    :cond_38
    :try_start_2
    invoke-virtual {v6, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 944
    .line 945
    .line 946
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 947
    .line 948
    goto :goto_1d

    .line 949
    :catchall_1
    move-exception v0

    .line 950
    new-instance v4, Lsf/f;

    .line 951
    .line 952
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 953
    .line 954
    .line 955
    move-object v0, v4

    .line 956
    :goto_1d
    nop

    .line 957
    instance-of v4, v0, Lsf/f;

    .line 958
    .line 959
    if-nez v4, :cond_39

    .line 960
    .line 961
    move-object v4, v0

    .line 962
    check-cast v4, Lsf/n;

    .line 963
    .line 964
    new-instance v4, Lhb/o;

    .line 965
    .line 966
    const/4 v6, 0x0

    .line 967
    invoke-direct {v4, v1, v5, v6}, Lhb/o;-><init>(Lhb/r;Ljava/lang/String;I)V

    .line 968
    .line 969
    .line 970
    iget-object v5, v1, Lhb/r;->d:Ljava/lang/Object;

    .line 971
    .line 972
    check-cast v5, Landroid/os/Handler;

    .line 973
    .line 974
    const-wide/32 v6, 0x1d4c0

    .line 975
    .line 976
    .line 977
    invoke-virtual {v5, v4, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 978
    .line 979
    .line 980
    iput-object v4, v1, Lhb/r;->i:Ljava/lang/Object;

    .line 981
    .line 982
    :cond_39
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    if-eqz v0, :cond_3a

    .line 987
    .line 988
    const-string v4, "\u7fa4\u53d1\u52a9\u624b\u542f\u52a8\u5fae\u4fe1\u91cd\u53d1\u5931\u8d25"

    .line 989
    .line 990
    invoke-virtual {v3, v4, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 994
    .line 995
    .line 996
    move-result v0

    .line 997
    const-wide/16 v3, 0x2ee

    .line 998
    .line 999
    invoke-virtual {v1, v2, v0, v3, v4}, Lhb/r;->a(Lhb/q;IJ)V

    .line 1000
    .line 1001
    .line 1002
    :cond_3a
    :goto_1e
    return-void

    .line 1003
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch

    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    :pswitch_data_1
    .packed-switch 0x2f
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lhb/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lhb/r;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lud/a;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lhb/r;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lud/a;

    .line 22
    .line 23
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "IfInfo: then: "

    .line 28
    .line 29
    const-string v3, ", else: "

    .line 30
    .line 31
    invoke-static {v2, v0, v3, v1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public u()V
    .locals 3

    .line 1
    iget-object v0, p0, Lhb/r;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lhb/q;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lhb/r;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lhb/q;

    .line 17
    .line 18
    iput-object v0, p0, Lhb/r;->f:Ljava/lang/Object;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v1, v0, Lhb/q;->b:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iget-object v2, v0, Lhb/q;->c:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    mul-int/2addr v2, v1

    .line 35
    iput v2, v0, Lhb/q;->h:I

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lhb/r;->s(Lhb/q;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    return-void
.end method
