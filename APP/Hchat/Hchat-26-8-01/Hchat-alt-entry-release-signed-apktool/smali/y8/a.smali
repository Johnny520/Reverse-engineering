.class public final Ly8/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "auto_view_original"

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
    const-string v0, "\u6253\u5f00\u804a\u5929\u56fe\u7247\u6216\u89c6\u9891\u65f6\u81ea\u52a8\u67e5\u770b\u539f\u56fe\u6216\u539f\u89c6\u9891"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "auto_view_original"

    .line 11
    .line 12
    const-string v3, "\u81ea\u52a8\u67e5\u770b\u539f\u56fe"

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
    new-instance v1, Ly8/d;

    .line 5
    .line 6
    new-instance v2, Lia/t;

    .line 7
    .line 8
    const-class v0, Ly8/a;

    .line 9
    .line 10
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    const-string v6, "logFeatureError"

    .line 15
    .line 16
    const-string v7, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/16 v10, 0x1d

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    const/4 v8, 0x0

    .line 23
    move-object v4, p0

    .line 24
    invoke-direct/range {v2 .. v10}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, p1, v2}, Ly8/d;-><init>(Lr8/g;Lia/t;)V

    .line 28
    .line 29
    .line 30
    monitor-enter v1

    .line 31
    :try_start_0
    iget-boolean v0, v1, Ly8/d;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    monitor-exit v1

    .line 36
    return-void

    .line 37
    :cond_0
    :try_start_1
    const-string v0, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI"

    .line 38
    .line 39
    iget-object p1, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 40
    .line 41
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 v0, 0x0

    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    const-string v3, "onResume"

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    new-array v5, v4, [Ljava/lang/Class;

    .line 52
    .line 53
    invoke-static {p1, v3, v5}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v5, "onDestroy"

    .line 58
    .line 59
    new-array v4, v4, [Ljava/lang/Class;

    .line 60
    .line 61
    invoke-static {p1, v5, v4}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {v3}, Ly8/d;->a(Ljava/lang/reflect/Method;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    invoke-static {p1}, Ly8/d;->a(Ljava/lang/reflect/Method;)Z

    .line 72
    .line 73
    .line 74
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    if-nez v4, :cond_1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_1
    :try_start_2
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v2, Ly8/b;

    .line 84
    .line 85
    const/4 v4, 0x1

    .line 86
    invoke-direct {v2, v1, v4}, Ly8/b;-><init>(Ly8/d;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v3, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance v2, Ly8/b;

    .line 96
    .line 97
    const/4 v3, 0x2

    .line 98
    invoke-direct {v2, v1, v3}, Ly8/b;-><init>(Ly8/d;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p1, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 102
    .line 103
    .line 104
    const/4 p1, 0x1

    .line 105
    iput-boolean p1, v1, Ly8/d;->i:Z

    .line 106
    .line 107
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    move-object p1, v0

    .line 112
    :try_start_3
    new-instance v0, Lsf/f;

    .line 113
    .line 114
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    move-object p1, v0

    .line 118
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-nez v0, :cond_2

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    iget-object p1, v1, Ly8/d;->a:Lia/t;

    .line 126
    .line 127
    const-string v2, "\u5b89\u88c5\u804a\u5929\u5a92\u4f53\u67e5\u770b\u9875\u9762 Hook \u5931\u8d25"

    .line 128
    .line 129
    invoke-virtual {p1, v2, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 133
    .line 134
    :goto_1
    check-cast p1, Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 135
    .line 136
    monitor-exit v1

    .line 137
    return-void

    .line 138
    :catchall_1
    move-exception v0

    .line 139
    move-object p1, v0

    .line 140
    goto :goto_3

    .line 141
    :cond_3
    :goto_2
    :try_start_4
    const-string p1, "\u804a\u5929\u5a92\u4f53\u67e5\u770b\u9875\u9762\u751f\u547d\u5468\u671f\u5165\u53e3\u4e0d\u5b8c\u6574"

    .line 142
    .line 143
    invoke-virtual {v2, p1, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 144
    .line 145
    .line 146
    monitor-exit v1

    .line 147
    return-void

    .line 148
    :cond_4
    :try_start_5
    const-string p1, "\u672a\u627e\u5230\u804a\u5929\u5a92\u4f53\u67e5\u770b\u9875\u9762: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI"

    .line 149
    .line 150
    invoke-virtual {v2, p1, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 151
    .line 152
    .line 153
    monitor-exit v1

    .line 154
    return-void

    .line 155
    :goto_3
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 156
    throw p1
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u81ea\u52a8\u67e5\u770b\u539f\u56fe"

    .line 2
    .line 3
    return-object v0
.end method
