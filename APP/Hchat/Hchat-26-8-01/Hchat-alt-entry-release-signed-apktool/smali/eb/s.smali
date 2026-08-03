.class public final synthetic Leb/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lf8/d;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lr8/g;


# direct methods
.method public synthetic constructor <init>(Lr8/a;Lr8/g;I)V
    .locals 0

    .line 10
    iput p3, p0, Leb/s;->g:I

    iput-object p2, p0, Leb/s;->h:Lr8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr8/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Leb/s;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Leb/s;->h:Lr8/g;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Leb/s;->g:I

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    sget-object v4, Lr8/c;->j:Lr8/c;

    .line 10
    .line 11
    const-string v5, "\u804a\u5929\u53d1\u9001\u6309\u94ae"

    .line 12
    .line 13
    const-string v6, "shared:send_button"

    .line 14
    .line 15
    iget-object v7, v0, Leb/s;->h:Lr8/g;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Lf8/e;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v1, Lr8/e;->a:Landroid/os/Handler;

    .line 28
    .line 29
    new-instance v1, Lc9/f;

    .line 30
    .line 31
    invoke-direct {v1, v7, v3}, Lc9/f;-><init>(Lr8/g;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v1, v6, v5, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    move-object/from16 v1, p1

    .line 39
    .line 40
    check-cast v1, Lf8/f;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object v2, Lx9/d;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 46
    .line 47
    iget-object v2, v7, Lr8/g;->a:Landroid/content/Context;

    .line 48
    .line 49
    iget-object v4, v1, Lf8/f;->c:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v5, v1, Lf8/f;->b:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v6, v1, Lf8/f;->d:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-nez v7, :cond_5

    .line 60
    .line 61
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-nez v7, :cond_5

    .line 66
    .line 67
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_0

    .line 72
    .line 73
    goto/16 :goto_6

    .line 74
    .line 75
    :cond_0
    iget-object v7, v1, Lf8/f;->e:Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v7, :cond_1

    .line 78
    .line 79
    invoke-static {v3, v7}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-eqz v3, :cond_1

    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    :goto_0
    move v10, v3

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    sget-object v3, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {v6}, Ll8/d;->f(Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    goto :goto_0

    .line 101
    :goto_1
    sget-object v3, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 102
    .line 103
    iget-wide v7, v1, Lf8/f;->f:J

    .line 104
    .line 105
    const-wide/16 v11, 0x0

    .line 106
    .line 107
    cmp-long v9, v7, v11

    .line 108
    .line 109
    if-lez v9, :cond_2

    .line 110
    .line 111
    const-wide/16 v11, 0x3e8

    .line 112
    .line 113
    mul-long/2addr v7, v11

    .line 114
    goto :goto_2

    .line 115
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 116
    .line 117
    .line 118
    move-result-wide v7

    .line 119
    :goto_2
    iget-wide v11, v1, Lf8/f;->g:J

    .line 120
    .line 121
    iget-object v13, v1, Lf8/f;->h:Ljava/lang/String;

    .line 122
    .line 123
    iget-object v14, v1, Lf8/f;->i:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    const/4 v9, 0x0

    .line 129
    invoke-static/range {v4 .. v14}, Ll8/d;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 130
    .line 131
    .line 132
    move-result-object v15

    .line 133
    invoke-static {v15}, Lx9/d;->h(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    iget-object v10, v1, Lf8/f;->a:Ljava/lang/String;

    .line 138
    .line 139
    iget-object v11, v1, Lf8/f;->j:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v15}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_4

    .line 146
    .line 147
    const-string v1, "@chatroom"

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    invoke-static {v4, v1, v7}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-nez v1, :cond_4

    .line 155
    .line 156
    const-string v1, "@im.chatroom"

    .line 157
    .line 158
    invoke-static {v4, v1, v7}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_3

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_3
    :goto_3
    move v12, v7

    .line 166
    move-object v7, v4

    .line 167
    goto :goto_5

    .line 168
    :cond_4
    :goto_4
    const/4 v7, 0x1

    .line 169
    goto :goto_3

    .line 170
    :goto_5
    new-instance v4, Lk8/o;

    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    move-object v8, v5

    .line 174
    const-string v5, "message_block"

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    move-object v9, v6

    .line 178
    move-object v6, v3

    .line 179
    invoke-direct/range {v4 .. v15}, Lk8/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLh/Hchat/hooks/api/model/WeChatMessage;Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v2, v4}, Lx9/d;->c(Landroid/content/Context;Lk8/o;)V

    .line 183
    .line 184
    .line 185
    :cond_5
    :goto_6
    return-void

    .line 186
    :pswitch_1
    move-object/from16 v1, p1

    .line 187
    .line 188
    check-cast v1, Lf8/e;

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    sget-object v1, Lr8/e;->a:Landroid/os/Handler;

    .line 194
    .line 195
    new-instance v1, Lc9/f;

    .line 196
    .line 197
    const/4 v3, 0x5

    .line 198
    invoke-direct {v1, v7, v3}, Lc9/f;-><init>(Lr8/g;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {v2, v1, v6, v5, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_2
    move-object/from16 v1, p1

    .line 206
    .line 207
    check-cast v1, Lf8/e;

    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {v7}, Lc9/g;->k(Lr8/g;)V

    .line 213
    .line 214
    .line 215
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 216
    .line 217
    iget-object v2, v7, Lr8/g;->a:Landroid/content/Context;

    .line 218
    .line 219
    invoke-virtual {v1, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->loadEnabledPluginsWhenReady(Landroid/content/Context;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
