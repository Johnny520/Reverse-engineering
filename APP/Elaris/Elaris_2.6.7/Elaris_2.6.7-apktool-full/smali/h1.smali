.class public final Lh1;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    const-string p0, "eq_chat_edge_guard"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_d

    .line 8
    .line 9
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    const/16 v1, 0x64

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/high16 v3, -0x80000000

    .line 16
    .line 17
    :try_start_0
    instance-of v4, p0, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    move-object v4, p0

    .line 22
    check-cast v4, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    :try_start_1
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    move v5, v2

    .line 30
    move v4, v3

    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :catchall_1
    :cond_0
    :goto_0
    :try_start_2
    invoke-static {}, Li5;->i1()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v5, "chatType"

    .line 38
    .line 39
    filled-new-array {v5}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-static {p0, v4, v2, v5}, Lv4;->k(Ljava/lang/Object;Ljava/util/Set;I[Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-static {}, Li5;->i1()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const-string v6, "uinType"

    .line 52
    .line 53
    filled-new-array {v6}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-static {p0, v5, v2, v6}, Lv4;->k(Ljava/lang/Object;Ljava/util/Set;I[Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    const/4 v5, 0x2

    .line 62
    if-eq v4, v5, :cond_3

    .line 63
    .line 64
    if-eq v3, v0, :cond_3

    .line 65
    .line 66
    if-eq v4, v0, :cond_2

    .line 67
    .line 68
    if-eq v4, v1, :cond_2

    .line 69
    .line 70
    if-nez v3, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v5, v2

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    :goto_1
    move v5, v0

    .line 76
    :goto_2
    :try_start_3
    invoke-static {}, Li5;->i1()Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    filled-new-array {v2}, [I

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-static {p0, v2, v6, v7}, Lv4;->c(Ljava/lang/Object;ILjava/util/Set;[I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const/16 v6, 0x2bc

    .line 89
    .line 90
    invoke-static {p0, v6}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string v6, "chattype=2"

    .line 98
    .line 99
    invoke-virtual {p0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-nez v6, :cond_3

    .line 104
    .line 105
    const-string v6, "chattype:2"

    .line 106
    .line 107
    invoke-virtual {p0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-nez v6, :cond_3

    .line 112
    .line 113
    const-string v6, "troop"

    .line 114
    .line 115
    invoke-virtual {p0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-nez v6, :cond_3

    .line 120
    .line 121
    const-string v6, "groupuin"

    .line 122
    .line 123
    invoke-virtual {p0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-nez v6, :cond_3

    .line 128
    .line 129
    const-string v6, "troopuin"

    .line 130
    .line 131
    invoke-virtual {p0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 135
    if-nez p0, :cond_3

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :catchall_2
    move-exception p0

    .line 139
    move v8, v4

    .line 140
    move v4, v3

    .line 141
    move v3, v8

    .line 142
    goto :goto_3

    .line 143
    :cond_3
    move p0, v0

    .line 144
    move v5, p0

    .line 145
    goto :goto_5

    .line 146
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move p0, v4

    .line 150
    move v4, v3

    .line 151
    move v3, p0

    .line 152
    :goto_4
    move p0, v2

    .line 153
    :goto_5
    iget-object v6, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 154
    .line 155
    if-eqz v6, :cond_5

    .line 156
    .line 157
    array-length v7, v6

    .line 158
    if-nez v7, :cond_4

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_4
    aget-object v2, v6, v2

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_5
    :goto_6
    const/4 v2, 0x0

    .line 165
    :goto_7
    iget-object v6, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 166
    .line 167
    instance-of v7, v2, Ljava/lang/Float;

    .line 168
    .line 169
    if-nez v7, :cond_6

    .line 170
    .line 171
    goto :goto_a

    .line 172
    :cond_6
    check-cast v2, Ljava/lang/Float;

    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-nez v7, :cond_d

    .line 183
    .line 184
    const/4 v7, 0x0

    .line 185
    cmpl-float v2, v2, v7

    .line 186
    .line 187
    if-ltz v2, :cond_7

    .line 188
    .line 189
    goto :goto_a

    .line 190
    :cond_7
    if-nez v5, :cond_8

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_8
    if-eqz p0, :cond_9

    .line 194
    .line 195
    goto :goto_9

    .line 196
    :cond_9
    if-eq v4, v0, :cond_c

    .line 197
    .line 198
    if-eq v4, v1, :cond_c

    .line 199
    .line 200
    if-nez v3, :cond_a

    .line 201
    .line 202
    goto :goto_9

    .line 203
    :cond_a
    :goto_8
    if-nez v6, :cond_b

    .line 204
    .line 205
    goto :goto_a

    .line 206
    :cond_b
    :try_start_4
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    const-string v0, "target.chat_right_swipe.drawer_class"

    .line 215
    .line 216
    invoke-static {v0}, Lt2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    const-string v1, "com.tencent.aio.frame.drawer.DrawerFrameViewGroup"

    .line 221
    .line 222
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-nez v1, :cond_c

    .line 227
    .line 228
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 232
    if-eqz p0, :cond_d

    .line 233
    .line 234
    :cond_c
    :goto_9
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    :catchall_3
    :cond_d
    :goto_a
    return-void
.end method
