.class public final Lo9/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "group_leave_monitor"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lr8/g;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lha/k0;

    .line 5
    .line 6
    const-string v0, "\u76d1\u542c\u6210\u5458\u8fdb\u7fa4\u548c\u9000\u7fa4\uff0c\u652f\u6301\u7cfb\u7edf\u6d88\u606f\u548c\u81ea\u52a8\u56de\u590d"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "group_leave_monitor"

    .line 11
    .line 12
    const-string v3, "\u8fdb\u9000\u7fa4\u76d1\u63a7"

    .line 13
    .line 14
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final g(Lr8/g;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v10, Lo9/c;->a:Lo9/c;

    .line 5
    .line 6
    new-instance v1, Lia/t;

    .line 7
    .line 8
    const-class v11, Lo9/a;

    .line 9
    .line 10
    invoke-static {v11}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const/4 v8, 0x0

    .line 15
    const/16 v9, 0xd

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const-string v5, "logError"

    .line 19
    .line 20
    const-string v6, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v3, p0

    .line 24
    invoke-direct/range {v1 .. v9}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 28
    .line 29
    sget-boolean v2, Lo9/c;->b:Z

    .line 30
    .line 31
    const/4 v12, 0x0

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    const-class v2, Ljava/lang/CharSequence;

    .line 36
    .line 37
    const-class v3, Landroid/widget/TextView$BufferType;

    .line 38
    .line 39
    filled-new-array {v2, v3}, [Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-class v3, Landroid/widget/TextView;

    .line 44
    .line 45
    const-string v4, "setText"

    .line 46
    .line 47
    invoke-static {v3, v4, v2}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    const-string v0, "\u9000\u7fa4\u76d1\u63a7 wxid \u9ad8\u4eae Hook \u672a\u627e\u5230"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v12}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    :try_start_0
    sget-object v3, Lr8/i;->b:Lr8/i;

    .line 60
    .line 61
    new-instance v4, Lea/b;

    .line 62
    .line 63
    const/4 v5, 0x5

    .line 64
    const/4 v6, 0x0

    .line 65
    invoke-direct {v4, v0, v5, v6}, Lea/b;-><init>(Landroid/content/Context;IZ)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v2, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    sput-boolean v0, Lo9/c;->b:Z

    .line 73
    .line 74
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    new-instance v2, Lsf/f;

    .line 79
    .line 80
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    move-object v0, v2

    .line 84
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-nez v2, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    const-string v0, "\u9000\u7fa4\u76d1\u63a7 wxid \u9ad8\u4eae Hook \u5b89\u88c5\u5931\u8d25"

    .line 92
    .line 93
    invoke-virtual {v1, v0, v2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 97
    .line 98
    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    .line 99
    .line 100
    :goto_2
    invoke-virtual {v10, p1, v1}, Lo9/c;->b(Lr8/g;Lfg/p;)V

    .line 101
    .line 102
    .line 103
    new-instance v10, Lo9/p;

    .line 104
    .line 105
    new-instance v1, Lia/t;

    .line 106
    .line 107
    invoke-static {v11}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const/4 v8, 0x0

    .line 112
    const/16 v9, 0xe

    .line 113
    .line 114
    const/4 v2, 0x2

    .line 115
    const-string v5, "logError"

    .line 116
    .line 117
    const-string v6, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    move-object v3, p0

    .line 121
    invoke-direct/range {v1 .. v9}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 122
    .line 123
    .line 124
    invoke-direct {v10, p1, v1}, Lo9/p;-><init>(Lr8/g;Lia/t;)V

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->d()Lg8/g;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_3
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomChanges()Lg8/g;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    :goto_3
    if-eqz v0, :cond_4

    .line 146
    .line 147
    new-instance v2, Lna/f;

    .line 148
    .line 149
    const/4 v4, 0x1

    .line 150
    invoke-direct {v2, v10, v4}, Lna/f;-><init>(Ljava/lang/Object;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v2}, Lg8/g;->a(Lg8/f;)La2/a;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {p0, v0}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_4
    const-string v0, "\u7fa4\u804a\u53d8\u66f4 API \u672a\u5c31\u7eea"

    .line 162
    .line 163
    invoke-virtual {v1, v0, v12}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    :goto_4
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageObserve()Lk8/p;

    .line 167
    .line 168
    .line 169
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 170
    goto :goto_5

    .line 171
    :catchall_1
    move-exception v0

    .line 172
    new-instance v2, Lsf/f;

    .line 173
    .line 174
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    move-object v0, v2

    .line 178
    :goto_5
    nop

    .line 179
    instance-of v2, v0, Lsf/f;

    .line 180
    .line 181
    if-eqz v2, :cond_5

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_5
    move-object v12, v0

    .line 185
    :goto_6
    check-cast v12, Lk8/p;

    .line 186
    .line 187
    if-eqz v12, :cond_7

    .line 188
    .line 189
    invoke-virtual {v12}, Lk8/p;->c()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_7

    .line 194
    .line 195
    :try_start_2
    invoke-virtual {v12}, Lk8/p;->b()V

    .line 196
    .line 197
    .line 198
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :catchall_2
    move-exception v0

    .line 202
    new-instance v2, Lsf/f;

    .line 203
    .line 204
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    move-object v0, v2

    .line 208
    :goto_7
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-eqz v0, :cond_6

    .line 213
    .line 214
    const-string v2, "\u9080\u8bf7\u8be6\u60c5\u6d88\u606f\u76d1\u542c\u5b89\u88c5\u5931\u8d25"

    .line 215
    .line 216
    invoke-virtual {v1, v2, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    :cond_6
    new-instance v0, Lna/c;

    .line 220
    .line 221
    const/4 v1, 0x2

    .line 222
    invoke-direct {v0, v10, v1}, Lna/c;-><init>(Ljava/lang/Object;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {p0, v0}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    :cond_7
    invoke-virtual {v10}, Lo9/p;->z()V

    .line 233
    .line 234
    .line 235
    new-instance v0, Lke/h;

    .line 236
    .line 237
    const/16 v1, 0x1c

    .line 238
    .line 239
    invoke-direct {v0, v10, v1}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 240
    .line 241
    .line 242
    const-class v1, Lf8/e;

    .line 243
    .line 244
    invoke-virtual {p0, v1, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 245
    .line 246
    .line 247
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u8fdb\u9000\u7fa4\u76d1\u63a7"

    .line 2
    .line 3
    return-object v0
.end method
