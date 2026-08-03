.class public final Lbb/e;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lbb/g;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "real_name_tail"

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
    new-instance p1, Laa/g;

    .line 5
    .line 6
    const-string v0, "real_name_tail"

    .line 7
    .line 8
    const-string v1, "\u5b9e\u540d\u5c3e\u5b57"

    .line 9
    .line 10
    const-string v2, "\u7fa4\u804a\u91cc\u81ea\u52a8\u8865\u67e5\u5e76\u663e\u793a\u5b9e\u540d\u5c3e\u5b57"

    .line 11
    .line 12
    const-string v3, "entertainment"

    .line 13
    .line 14
    invoke-direct {p1, v0, v1, v2, v3}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lha/k0;

    .line 21
    .line 22
    const-string v0, "\u7fa4\u6635\u79f0\u81ea\u5b9a\u4e49\u989c\u8272"

    .line 23
    .line 24
    const-string v1, "\u81ea\u5b9a\u4e49\u7fa4\u804a\u6210\u5458\u6635\u79f0\u7684\u989c\u8272\u548c\u7c97\u7ec6"

    .line 25
    .line 26
    const-string v2, "group_nickname_color"

    .line 27
    .line 28
    invoke-direct {p1, v2, v0, v1, v3}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final g(Lr8/g;)V
    .locals 16

    .line 1
    move-object/from16 v9, p1

    .line 2
    .line 3
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v10, Lbb/l;

    .line 7
    .line 8
    iget-object v0, v9, Lr8/g;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-direct {v10, v0}, Lbb/l;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    new-instance v11, Lib/b;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v11, v0, v1}, Lib/b;-><init>(Landroid/content/Context;I)V

    .line 17
    .line 18
    .line 19
    new-instance v12, Lb9/f;

    .line 20
    .line 21
    new-instance v0, Lab/b;

    .line 22
    .line 23
    const-class v13, Lbb/e;

    .line 24
    .line 25
    invoke-static {v13}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v8, 0x3

    .line 31
    const/4 v1, 0x2

    .line 32
    const-string v4, "logFeatureError"

    .line 33
    .line 34
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    move-object/from16 v2, p0

    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v12, v9, v0}, Lb9/f;-><init>(Lr8/g;Lab/b;)V

    .line 43
    .line 44
    .line 45
    new-instance v14, Lbb/k;

    .line 46
    .line 47
    new-instance v0, Lab/b;

    .line 48
    .line 49
    invoke-static {v13}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const/4 v8, 0x4

    .line 54
    const-string v4, "logFeatureError"

    .line 55
    .line 56
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 57
    .line 58
    invoke-direct/range {v0 .. v8}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 59
    .line 60
    .line 61
    new-instance v1, Lbb/c;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v1, v2, v3}, Lbb/c;-><init>(Lbb/e;I)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v14, v10, v12, v0, v1}, Lbb/k;-><init>(Lbb/l;Lb9/f;Lab/b;Lbb/c;)V

    .line 68
    .line 69
    .line 70
    new-instance v12, Lbb/b;

    .line 71
    .line 72
    new-instance v0, Lab/b;

    .line 73
    .line 74
    invoke-static {v13}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const/4 v8, 0x2

    .line 79
    const/4 v1, 0x2

    .line 80
    const-string v4, "logFeatureError"

    .line 81
    .line 82
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 83
    .line 84
    invoke-direct/range {v0 .. v8}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 85
    .line 86
    .line 87
    new-instance v1, Lbb/c;

    .line 88
    .line 89
    const/4 v3, 0x1

    .line 90
    invoke-direct {v1, v2, v3}, Lbb/c;-><init>(Lbb/e;I)V

    .line 91
    .line 92
    .line 93
    invoke-direct {v12, v9, v0, v1}, Lbb/b;-><init>(Lr8/g;Lab/b;Lbb/c;)V

    .line 94
    .line 95
    .line 96
    new-instance v15, Lbb/g;

    .line 97
    .line 98
    new-instance v0, Lab/b;

    .line 99
    .line 100
    invoke-static {v13}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const/4 v8, 0x1

    .line 105
    const/4 v1, 0x2

    .line 106
    const-string v4, "logFeatureError"

    .line 107
    .line 108
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 109
    .line 110
    invoke-direct/range {v0 .. v8}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 111
    .line 112
    .line 113
    move-object v5, v0

    .line 114
    move-object v6, v2

    .line 115
    move-object v1, v9

    .line 116
    move-object v2, v10

    .line 117
    move-object v3, v11

    .line 118
    move-object v4, v14

    .line 119
    move-object v0, v15

    .line 120
    invoke-direct/range {v0 .. v5}, Lbb/g;-><init>(Lr8/g;Lbb/l;Lib/b;Lbb/k;Lab/b;)V

    .line 121
    .line 122
    .line 123
    iput-object v12, v0, Lbb/g;->m:Lbb/b;

    .line 124
    .line 125
    iput-object v0, v6, Lbb/e;->e:Lbb/g;

    .line 126
    .line 127
    new-instance v0, Lab/a;

    .line 128
    .line 129
    const/4 v1, 0x7

    .line 130
    invoke-direct {v0, v6, v1}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    const/16 v1, 0xc

    .line 134
    .line 135
    const-string v3, "real_name_tail"

    .line 136
    .line 137
    const-string v5, "\u5b9e\u540d\u5c3e\u5b57"

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    invoke-static {v1, v0, v3, v5, v7}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 141
    .line 142
    .line 143
    new-instance v0, Lke/h;

    .line 144
    .line 145
    const/4 v1, 0x4

    .line 146
    invoke-direct {v0, v6, v1}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 147
    .line 148
    .line 149
    const-class v1, Lf8/e;

    .line 150
    .line 151
    invoke-virtual {v6, v1, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 152
    .line 153
    .line 154
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->l()Lk8/p;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-eqz v0, :cond_0

    .line 166
    .line 167
    new-instance v1, Lbb/d;

    .line 168
    .line 169
    invoke-direct {v1, v2, v6, v4}, Lbb/d;-><init>(Lbb/l;Lbb/e;Lbb/k;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v6, v0}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_0
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u5b9e\u540d\u5c3e\u5b57"

    .line 2
    .line 3
    return-object v0
.end method
