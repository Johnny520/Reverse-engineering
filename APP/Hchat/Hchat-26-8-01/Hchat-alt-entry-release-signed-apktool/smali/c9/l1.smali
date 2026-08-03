.class public final synthetic Lc9/l1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc9/l1;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lc9/l1;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lc9/l1;->c:Landroid/content/Context;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    new-array v2, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v3, v0, Lc9/l1;->a:Ljava/lang/Object;

    .line 10
    .line 11
    const-string v4, "getActivity"

    .line 12
    .line 13
    invoke-static {v3, v4, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v2, "thisActivity"

    .line 21
    .line 22
    new-array v4, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v3, v2, v4}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    instance-of v4, v2, Landroid/app/Activity;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    check-cast v2, Landroid/app/Activity;

    .line 33
    .line 34
    :goto_1
    move-object v4, v2

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    const/4 v2, 0x0

    .line 37
    goto :goto_1

    .line 38
    :goto_2
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    sget-object v2, Lc9/b0;->a:Landroid/os/Handler;

    .line 53
    .line 54
    new-instance v2, Laa/c;

    .line 55
    .line 56
    iget-object v5, v0, Lc9/l1;->c:Landroid/content/Context;

    .line 57
    .line 58
    const/4 v6, 0x6

    .line 59
    invoke-direct {v2, v5, v6, v3}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v3, v0, Lc9/l1;->b:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v4, v3}, Lc9/b0;->c(Landroid/app/Activity;Ljava/lang/String;)Lc9/a;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    if-eqz v5, :cond_2

    .line 72
    .line 73
    iget-object v5, v5, Lc9/a;->b:Ljava/lang/String;

    .line 74
    .line 75
    new-instance v7, Lsf/e;

    .line 76
    .line 77
    const-string v8, "Hchat\u6a21\u5757"

    .line 78
    .line 79
    const-string v9, "\u6253\u5f00 Hchat \u8bbe\u7f6e"

    .line 80
    .line 81
    invoke-direct {v7, v8, v9}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    new-instance v8, Lsf/e;

    .line 85
    .line 86
    const-string v9, "\u6240\u6709\u6d88\u606f\u6807\u4e3a\u5df2\u8bfb"

    .line 87
    .line 88
    const-string v10, "\u6807\u8bb0\u5f53\u524d\u5206\u7ec4\u53ca\u5b50\u5206\u7ec4\u5185\u5168\u90e8\u4f1a\u8bdd"

    .line 89
    .line 90
    invoke-direct {v8, v9, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    new-instance v9, Lsf/e;

    .line 94
    .line 95
    const-string v10, "\u6279\u91cf\u5220\u9664\u6d88\u606f"

    .line 96
    .line 97
    const-string v11, "\u9009\u62e9\u4f1a\u8bdd\u5e76\u6e05\u7a7a\u804a\u5929\u8bb0\u5f55"

    .line 98
    .line 99
    invoke-direct {v9, v10, v11}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    new-instance v10, Lsf/e;

    .line 103
    .line 104
    const-string v11, "\u6d88\u606f\u514d\u6253\u6270"

    .line 105
    .line 106
    const-string v12, "\u5f00\u542f\u5f53\u524d\u5206\u7ec4\u5185\u4f1a\u8bdd\u7684\u5fae\u4fe1\u514d\u6253\u6270"

    .line 107
    .line 108
    invoke-direct {v10, v11, v12}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    new-instance v11, Lsf/e;

    .line 112
    .line 113
    const-string v12, "\u89e3\u9664\u6d88\u606f\u514d\u6253\u6270"

    .line 114
    .line 115
    const-string v13, "\u5173\u95ed\u5f53\u524d\u5206\u7ec4\u5185\u4f1a\u8bdd\u7684\u5fae\u4fe1\u514d\u6253\u6270"

    .line 116
    .line 117
    invoke-direct {v11, v12, v13}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance v12, Lsf/e;

    .line 121
    .line 122
    const-string v13, "\u53d1\u9001"

    .line 123
    .line 124
    const-string v14, "\u5411\u5f53\u524d\u5206\u7ec4\u5185\u4f1a\u8bdd\u6279\u91cf\u53d1\u9001\u6587\u5b57"

    .line 125
    .line 126
    invoke-direct {v12, v13, v14}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    new-instance v13, Lsf/e;

    .line 130
    .line 131
    const-string v14, "\u53d1\u9001\u7fa4\u804a\u9080\u8bf7"

    .line 132
    .line 133
    const-string v15, "\u9009\u62e9\u7fa4\u804a\u5e76\u9080\u8bf7\u5f53\u524d\u5206\u7ec4\u5185\u597d\u53cb"

    .line 134
    .line 135
    invoke-direct {v13, v14, v15}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    new-instance v14, Lsf/e;

    .line 139
    .line 140
    const-string v15, "\u6dfb\u52a0"

    .line 141
    .line 142
    const-string v6, "\u9009\u62e9\u4f1a\u8bdd\u52a0\u5165\u5f53\u524d\u5206\u7ec4"

    .line 143
    .line 144
    invoke-direct {v14, v15, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    new-instance v15, Lsf/e;

    .line 148
    .line 149
    const-string v6, "\u79fb\u51fa"

    .line 150
    .line 151
    const-string v1, "\u5c06\u76f4\u5c5e\u4f1a\u8bdd\u79fb\u56de\u5fae\u4fe1\u9996\u9875"

    .line 152
    .line 153
    invoke-direct {v15, v6, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    new-instance v1, Lsf/e;

    .line 157
    .line 158
    const-string v6, "\u79fb\u81f3"

    .line 159
    .line 160
    const-string v0, "\u5c06\u76f4\u5c5e\u4f1a\u8bdd\u79fb\u5230\u5176\u4ed6\u5206\u7ec4"

    .line 161
    .line 162
    invoke-direct {v1, v6, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    new-instance v0, Lsf/e;

    .line 166
    .line 167
    const-string v6, "\u641c\u7d22"

    .line 168
    .line 169
    move-object/from16 v16, v1

    .line 170
    .line 171
    const-string v1, "\u641c\u7d22\u5f53\u524d\u5206\u7ec4\u53ca\u5b50\u5206\u7ec4\u5185\u4f1a\u8bdd"

    .line 172
    .line 173
    invoke-direct {v0, v6, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    new-instance v1, Lsf/e;

    .line 177
    .line 178
    const-string v6, "\u8bbe\u7f6e"

    .line 179
    .line 180
    move-object/from16 v17, v0

    .line 181
    .line 182
    const-string v0, "\u8bbe\u7f6e\u5f53\u524d\u5206\u7ec4\u7684\u663e\u793a\u65b9\u5f0f"

    .line 183
    .line 184
    invoke-direct {v1, v6, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    move-object/from16 v18, v1

    .line 188
    .line 189
    filled-new-array/range {v7 .. v18}, [Lsf/e;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    new-instance v8, Lc9/r;

    .line 198
    .line 199
    const/4 v0, 0x0

    .line 200
    invoke-direct {v8, v4, v3, v2, v0}, Lc9/r;-><init>(Landroid/app/Activity;Ljava/lang/String;Laa/c;I)V

    .line 201
    .line 202
    .line 203
    new-instance v9, Lbi/c;

    .line 204
    .line 205
    const/4 v0, 0x6

    .line 206
    invoke-direct {v9, v0}, Lbi/c;-><init>(I)V

    .line 207
    .line 208
    .line 209
    const-string v6, ""

    .line 210
    .line 211
    invoke-static/range {v4 .. v9}, Lwb/y2;->W1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;)V

    .line 212
    .line 213
    .line 214
    :cond_2
    const/4 v0, 0x1

    .line 215
    return v0
.end method
