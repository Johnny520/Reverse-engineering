.class public final Ld8/b;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

.field public final synthetic c:Lh/Hchat/ModuleEntry;


# direct methods
.method public synthetic constructor <init>(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;I)V
    .locals 0

    .line 1
    iput p3, p0, Ld8/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ld8/b;->c:Lh/Hchat/ModuleEntry;

    .line 4
    .line 5
    iput-object p2, p0, Ld8/b;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 6
    .line 7
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget v0, p0, Ld8/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget-object v0, v0, v1

    .line 10
    .line 11
    check-cast v0, Landroid/content/Context;

    .line 12
    .line 13
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v1, p0, Ld8/b;->c:Lh/Hchat/ModuleEntry;

    .line 16
    .line 17
    invoke-static {v1, p1}, Lh/Hchat/ModuleEntry;->l(Lh/Hchat/ModuleEntry;Ljava/lang/Object;)Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Ld8/b;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 24
    .line 25
    invoke-static {v1, v0, p1}, Lh/Hchat/ModuleEntry;->k(Lh/Hchat/ModuleEntry;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/ClassLoader;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_0
    invoke-static {v1, v0, p1}, Lh/Hchat/ModuleEntry;->h(Lh/Hchat/ModuleEntry;Landroid/content/Context;Ljava/lang/ClassLoader;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    iget-object v0, p0, Ld8/b;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 34
    .line 35
    const-string v1, "after"

    .line 36
    .line 37
    iget-object v2, p0, Ld8/b;->c:Lh/Hchat/ModuleEntry;

    .line 38
    .line 39
    invoke-static {v2, v0, p1, v1}, Lh/Hchat/ModuleEntry;->j(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    iget-object v0, p0, Ld8/b;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 44
    .line 45
    const-string v1, "after"

    .line 46
    .line 47
    iget-object v2, p0, Ld8/b;->c:Lh/Hchat/ModuleEntry;

    .line 48
    .line 49
    invoke-static {v2, v0, p1, v1}, Lh/Hchat/ModuleEntry;->i(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_2
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Landroid/app/Application;

    .line 56
    .line 57
    iget-object v0, p0, Ld8/b;->c:Lh/Hchat/ModuleEntry;

    .line 58
    .line 59
    iget-object v1, p0, Ld8/b;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 60
    .line 61
    invoke-static {v0, p1, v1}, Lh/Hchat/ModuleEntry;->k(Lh/Hchat/ModuleEntry;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/ClassLoader;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const/4 v3, 0x1

    .line 66
    invoke-static {v0, p1, v2, v1, v3}, Lh/Hchat/ModuleEntry;->g(Lh/Hchat/ModuleEntry;Landroid/content/Context;Ljava/lang/ClassLoader;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Z)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_3
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    aget-object v0, v0, v1

    .line 74
    .line 75
    check-cast v0, Landroid/content/Context;

    .line 76
    .line 77
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object v2, p0, Ld8/b;->c:Lh/Hchat/ModuleEntry;

    .line 80
    .line 81
    invoke-static {v2, p1}, Lh/Hchat/ModuleEntry;->l(Lh/Hchat/ModuleEntry;Ljava/lang/Object;)Ljava/lang/ClassLoader;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v3, p0, Ld8/b;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 86
    .line 87
    if-nez p1, :cond_1

    .line 88
    .line 89
    invoke-static {v2, v0, v3}, Lh/Hchat/ModuleEntry;->k(Lh/Hchat/ModuleEntry;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/ClassLoader;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :cond_1
    invoke-static {v2, v0, p1, v3, v1}, Lh/Hchat/ModuleEntry;->g(Lh/Hchat/ModuleEntry;Landroid/content/Context;Ljava/lang/ClassLoader;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Z)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_4
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, Landroid/app/Application;

    .line 100
    .line 101
    const-string v0, "Hchat_global_config"

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    const-string v1, "terms_accepted"

    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    :try_start_0
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 114
    .line 115
    .line 116
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    goto :goto_0

    .line 118
    :catchall_0
    move v1, v2

    .line 119
    :goto_0
    if-eqz v1, :cond_2

    .line 120
    .line 121
    const-string v1, "terms_version"

    .line 122
    .line 123
    :try_start_1
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 128
    .line 129
    .line 130
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    goto :goto_1

    .line 132
    :catchall_1
    move v0, v2

    .line 133
    :goto_1
    const/4 v1, 0x1

    .line 134
    if-ne v0, v1, :cond_2

    .line 135
    .line 136
    move v2, v1

    .line 137
    :cond_2
    iget-object v0, p0, Ld8/b;->c:Lh/Hchat/ModuleEntry;

    .line 138
    .line 139
    if-eqz v2, :cond_3

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {p1, v1}, Lh/Hchat/crash/g;->g(Landroid/app/Application;Ljava/lang/ClassLoader;)V

    .line 150
    .line 151
    .line 152
    :cond_3
    iget-object v1, p0, Ld8/b;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 153
    .line 154
    invoke-static {v0, p1, v1}, Lh/Hchat/ModuleEntry;->k(Lh/Hchat/ModuleEntry;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/ClassLoader;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static {v0, p1, v2}, Lh/Hchat/ModuleEntry;->h(Lh/Hchat/ModuleEntry;Landroid/content/Context;Ljava/lang/ClassLoader;)V

    .line 159
    .line 160
    .line 161
    new-instance v0, Ljava/lang/Thread;

    .line 162
    .line 163
    new-instance v2, Lac/l;

    .line 164
    .line 165
    const/16 v3, 0x9

    .line 166
    .line 167
    invoke-direct {v2, p0, p1, v1, v3}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 168
    .line 169
    .line 170
    const-string p1, "Hchat-Init"

    .line 171
    .line 172
    invoke-direct {v0, v2, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget v0, p0, Ld8/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    iget-object v0, p0, Ld8/b;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 11
    .line 12
    const-string v1, "before"

    .line 13
    .line 14
    iget-object v2, p0, Ld8/b;->c:Lh/Hchat/ModuleEntry;

    .line 15
    .line 16
    invoke-static {v2, v0, p1, v1}, Lh/Hchat/ModuleEntry;->j(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_2
    iget-object v0, p0, Ld8/b;->b:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 21
    .line 22
    const-string v1, "before"

    .line 23
    .line 24
    iget-object v2, p0, Ld8/b;->c:Lh/Hchat/ModuleEntry;

    .line 25
    .line 26
    invoke-static {v2, v0, p1, v1}, Lh/Hchat/ModuleEntry;->i(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_3
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Landroid/app/Application;

    .line 33
    .line 34
    const-string v0, "Hchat_global_config"

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const-string v1, "terms_accepted"

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    :try_start_0
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move v1, v2

    .line 52
    :goto_0
    if-eqz v1, :cond_0

    .line 53
    .line 54
    const-string v1, "terms_version"

    .line 55
    .line 56
    :try_start_1
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    goto :goto_1

    .line 65
    :catchall_1
    move v0, v2

    .line 66
    :goto_1
    const/4 v1, 0x1

    .line 67
    if-ne v0, v1, :cond_0

    .line 68
    .line 69
    move v2, v1

    .line 70
    :cond_0
    if-eqz v2, :cond_1

    .line 71
    .line 72
    invoke-static {p1}, Lh/Hchat/crash/g;->h(Landroid/app/Application;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
