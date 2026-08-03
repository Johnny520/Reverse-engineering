.class public final Lya/h;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "quick_mark_read"

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
    new-instance p1, Ls8/d;

    .line 5
    .line 6
    const-string v0, "\u62d6\u62fd\u672a\u8bfb\u89d2\u6807\u6216\u52a0\u53f7\u83dc\u5355\u4e00\u952e\u5df2\u8bfb"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "quick_mark_read"

    .line 11
    .line 12
    const-string v3, "\u5feb\u6377\u5df2\u8bfb"

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
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lya/i;->a(Lr8/g;)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lya/g;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    new-instance v2, Ly9/b;

    .line 12
    .line 13
    const-class v0, Lya/h;

    .line 14
    .line 15
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x1

    .line 21
    const/4 v3, 0x2

    .line 22
    const-string v6, "logError"

    .line 23
    .line 24
    const-string v7, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    move-object v4, p0

    .line 28
    invoke-direct/range {v2 .. v10}, Ly9/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, p1, v2}, Lya/g;-><init>(Ljava/lang/ClassLoader;Ly9/b;)V

    .line 32
    .line 33
    .line 34
    iget-boolean v0, v1, Lya/g;->b:Z

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v2, "com.tencent.mm.ui.LauncherUI"

    .line 46
    .line 47
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_0
    const-class v2, Landroid/view/MotionEvent;

    .line 52
    .line 53
    const-string v3, "dispatchTouchEvent"

    .line 54
    .line 55
    const-class v4, Landroid/app/Activity;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {v4, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {p1, v3, v5}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    if-eqz v5, :cond_1

    .line 74
    .line 75
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_1
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    goto :goto_0

    .line 90
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {v4, v3, p1}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    :cond_4
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_5

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_5
    new-instance p1, Lwb/yo;

    .line 117
    .line 118
    const/4 v2, 0x3

    .line 119
    invoke-direct {p1, v1, v2}, Lwb/yo;-><init>(Ljava/lang/Object;I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const/4 v3, 0x0

    .line 127
    const/4 v0, 0x0

    .line 128
    move-object v4, v0

    .line 129
    move v5, v3

    .line 130
    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Ljava/lang/reflect/Method;

    .line 141
    .line 142
    :try_start_0
    sget-object v6, Lr8/i;->b:Lr8/i;

    .line 143
    .line 144
    invoke-virtual {v6, v0, p1}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 145
    .line 146
    .line 147
    add-int/lit8 v6, v5, 0x1

    .line 148
    .line 149
    :try_start_1
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    move v5, v6

    .line 154
    goto :goto_4

    .line 155
    :catchall_0
    move-exception v0

    .line 156
    move v5, v6

    .line 157
    goto :goto_3

    .line 158
    :catchall_1
    move-exception v0

    .line 159
    :goto_3
    new-instance v6, Lsf/f;

    .line 160
    .line 161
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    move-object v0, v6

    .line 165
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    if-eqz v0, :cond_6

    .line 170
    .line 171
    move-object v4, v0

    .line 172
    goto :goto_2

    .line 173
    :cond_7
    if-lez v5, :cond_8

    .line 174
    .line 175
    const/4 v3, 0x1

    .line 176
    :cond_8
    iput-boolean v3, v1, Lya/g;->b:Z

    .line 177
    .line 178
    iget-boolean p1, v1, Lya/g;->b:Z

    .line 179
    .line 180
    if-nez p1, :cond_9

    .line 181
    .line 182
    iget-object p1, v1, Lya/g;->a:Ly9/b;

    .line 183
    .line 184
    const-string v0, "\u5feb\u6377\u5df2\u8bfb\u62d6\u62fdHook\u5b89\u88c5\u5931\u8d25"

    .line 185
    .line 186
    invoke-virtual {p1, v0, v4}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    :cond_9
    :goto_5
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u5feb\u6377\u5df2\u8bfb"

    .line 2
    .line 3
    return-object v0
.end method
