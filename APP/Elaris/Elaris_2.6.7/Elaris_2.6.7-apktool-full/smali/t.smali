.class public final Lt;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt;->a:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const/16 p1, 0x5a

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    const-string v0, "eq_message_guard"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    :try_start_0
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    aget-object v2, v0, v1

    .line 15
    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    aget-object v0, v0, v3

    .line 20
    .line 21
    instance-of v4, v0, [B

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    check-cast v0, [B

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-array v0, v1, [B

    .line 29
    .line 30
    :goto_0
    const-string v4, "trpc.msg.olpush.OlPushService.MsgPush"

    .line 31
    .line 32
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    const-string v5, "trpc.msg.register_proxy.RegisterProxy.InfoSyncPush"

    .line 37
    .line 38
    iget-object p0, p0, Lt;->a:Ljava/lang/ClassLoader;

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    :try_start_1
    invoke-static {p0, v0}, Lc0;->d(Ljava/lang/ClassLoader;[B)Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_c

    .line 52
    .line 53
    invoke-static {p0, v0}, Lc0;->c(Ljava/lang/ClassLoader;[B)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    :goto_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_3

    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_3
    new-instance v6, Ljava/util/HashSet;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    const/4 v8, 0x2

    .line 72
    mul-int/2addr v7, v8

    .line 73
    const/4 v9, 0x4

    .line 74
    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    invoke-direct {v6, v7}, Ljava/util/HashSet;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    move v7, v1

    .line 86
    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-eqz v9, :cond_9

    .line 91
    .line 92
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    check-cast v9, La0;

    .line 97
    .line 98
    iget v10, v9, La0;->a:I

    .line 99
    .line 100
    if-eq v10, v3, :cond_5

    .line 101
    .line 102
    if-ne v10, v8, :cond_4

    .line 103
    .line 104
    :cond_5
    iget-object v10, v9, La0;->b:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v10}, Lc0;->j(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-nez v10, :cond_4

    .line 111
    .line 112
    iget-wide v10, v9, La0;->e:J

    .line 113
    .line 114
    const-wide/16 v12, 0x0

    .line 115
    .line 116
    cmp-long v10, v10, v12

    .line 117
    .line 118
    if-lez v10, :cond_4

    .line 119
    .line 120
    iget-object v10, v9, La0;->c:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v10}, Lc0;->j(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    if-nez v11, :cond_6

    .line 127
    .line 128
    invoke-static {p0}, Lc0;->g(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    if-eqz v10, :cond_6

    .line 137
    .line 138
    move v10, v3

    .line 139
    goto :goto_3

    .line 140
    :cond_6
    move v10, v1

    .line 141
    :goto_3
    if-eqz v10, :cond_7

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    invoke-virtual {v9}, La0;->a()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-nez v10, :cond_8

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_8
    invoke-static {v9}, Lc0;->b(La0;)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 v7, v7, 0x1

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_9
    if-lez v7, :cond_c

    .line 162
    .line 163
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    const/4 v1, 0x0

    .line 168
    if-eqz p0, :cond_b

    .line 169
    .line 170
    invoke-static {v0}, Lc0;->e([B)[B

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    array-length v2, p0

    .line 175
    array-length v0, v0

    .line 176
    if-ge v2, v0, :cond_a

    .line 177
    .line 178
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 179
    .line 180
    aput-object p0, p1, v3

    .line 181
    .line 182
    return-void

    .line 183
    :cond_a
    invoke-virtual {p1, v1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_b
    invoke-virtual {p1, v1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 188
    .line 189
    .line 190
    :cond_c
    :goto_4
    return-void

    .line 191
    :catchall_0
    move-exception p0

    .line 192
    new-instance p1, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v0, "anti-recall push failed: "

    .line 195
    .line 196
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-static {p0}, Lc0;->k(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-void
.end method
