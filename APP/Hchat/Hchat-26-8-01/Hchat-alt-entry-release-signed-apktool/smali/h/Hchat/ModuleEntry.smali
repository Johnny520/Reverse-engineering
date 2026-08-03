.class public Lh/Hchat/ModuleEntry;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lde/robv/android/xposed/IXposedHookLoadPackage;


# static fields
.field private static final DEXKIT_BRIDGES:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            ">;"
        }
    .end annotation
.end field

.field private static final DEXKIT_CREATE_LOCK:Ljava/lang/Object;

.field private static final TAG:Ljava/lang/String; = "[Hchat:Entry]"

.field private static final WECHAT_PKG:Ljava/lang/String; = "com.tencent.mm"


# instance fields
.field private final eventBus:Lf8/c;

.field private featureContext:Lr8/g;

.field private featureManager:Lr8/h;

.field private final uiRegistry:Lvb/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/Hchat/ModuleEntry;->DEXKIT_CREATE_LOCK:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lh/Hchat/ModuleEntry;->DEXKIT_BRIDGES:Ljava/util/Map;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lf8/c;->c:Lf8/c;

    .line 5
    .line 6
    iput-object v0, p0, Lh/Hchat/ModuleEntry;->eventBus:Lf8/c;

    .line 7
    .line 8
    sget-object v0, Lvb/c;->a:Lvb/c;

    .line 9
    .line 10
    iput-object v0, p0, Lh/Hchat/ModuleEntry;->uiRegistry:Lvb/c;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lh/Hchat/ModuleEntry;->lambda$installHotUpdateForAttach$2(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/ModuleEntry;->lambda$handleLoadPackage$0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;Landroid/content/Context;Lub/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lh/Hchat/ModuleEntry;->lambda$initModule$4(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;Landroid/content/Context;Lub/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private createDexKitBridge(Ljava/lang/ClassLoader;Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 3

    .line 1
    sget-object p1, Lh/Hchat/ModuleEntry;->DEXKIT_CREATE_LOCK:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    move-object v0, p2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    const-string v0, ""

    .line 9
    .line 10
    :goto_0
    sget-object v1, Lh/Hchat/ModuleEntry;->DEXKIT_BRIDGES:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    monitor-exit p1

    .line 21
    return-object v2

    .line 22
    :catchall_0
    move-exception p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-static {p2}, Lorg/luckypray/dexkit/DexKitBridge;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    monitor-exit p1

    .line 32
    return-object p2

    .line 33
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p2
.end method

.method private createModuleContext(Landroid/content/Context;)Landroid/content/Context;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "h.Hchat"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    return-object p1

    .line 9
    :catchall_0
    const/4 p1, 0x0

    .line 10
    return-object p1
.end method

.method public static synthetic d(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lh/Hchat/ModuleEntry;->lambda$installTabletHookForAttach$3(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lh/Hchat/ModuleEntry;->lambda$installHotUpdateForAttach$1(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic f(Lh/Hchat/ModuleEntry;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lh/Hchat/ModuleEntry;->initModule(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic g(Lh/Hchat/ModuleEntry;Landroid/content/Context;Ljava/lang/ClassLoader;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lh/Hchat/ModuleEntry;->installAppBrandProcessHook(Landroid/content/Context;Ljava/lang/ClassLoader;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic h(Lh/Hchat/ModuleEntry;Landroid/content/Context;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lh/Hchat/ModuleEntry;->installHideBottomBarEarly(Landroid/content/Context;Ljava/lang/ClassLoader;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic i(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lh/Hchat/ModuleEntry;->installHotUpdateForAttach(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private initModule(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 11

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "libdexkit.so"

    .line 10
    .line 11
    const-string v2, "dexkit"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {p1, v0, v1, v2, v3}, Lsb/a;->d(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "libsilk_codec.so"

    .line 26
    .line 27
    const-string v2, "silk_codec"

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-static {p1, v0, v1, v2, v3}, Lsb/a;->d(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, p1}, Lh/Hchat/ModuleEntry;->createModuleContext(Landroid/content/Context;)Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    new-instance v9, Lub/a;

    .line 38
    .line 39
    invoke-direct {v9, p1}, Lub/a;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    new-instance v4, Lca/x;

    .line 43
    .line 44
    const/4 v10, 0x1

    .line 45
    move-object v5, p0

    .line 46
    move-object v7, p1

    .line 47
    move-object v6, p2

    .line 48
    invoke-direct/range {v4 .. v10}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {v4}, Lr8/e;->c(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p1, v0

    .line 57
    new-instance p2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v0, "[Hchat:Entry] \u521d\u59cb\u5316\u5931\u8d25: "

    .line 60
    .line 61
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-static {p2, p1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method private installAppBrandProcessHook(Landroid/content/Context;Ljava/lang/ClassLoader;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Z)V
    .locals 10

    .line 1
    const-string v0, "Hchat_global_config"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "terms_accepted"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_0
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move v1, v2

    .line 19
    :goto_0
    const/4 v3, 0x1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const-string v1, "terms_version"

    .line 23
    .line 24
    :try_start_1
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 29
    .line 30
    .line 31
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    goto :goto_1

    .line 33
    :catchall_1
    move v0, v2

    .line 34
    :goto_1
    if-ne v0, v3, :cond_0

    .line 35
    .line 36
    move v0, v3

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    move v0, v2

    .line 39
    :goto_2
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto/16 :goto_f

    .line 42
    .line 43
    :cond_1
    sget-object v0, Lea/a;->f:La2/a;

    .line 44
    .line 45
    const-string v1, "Hchat_fake_mini_program_base_lib_config"

    .line 46
    .line 47
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v4, "fake_mini_program_base_lib_enable"

    .line 52
    .line 53
    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    const-class v1, Lea/a;

    .line 60
    .line 61
    monitor-enter v1

    .line 62
    :try_start_2
    invoke-virtual {v0, p1, p2}, La2/a;->l(Landroid/content/Context;Ljava/lang/ClassLoader;)Z

    .line 63
    .line 64
    .line 65
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 66
    monitor-exit v1

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    move v0, v3

    .line 70
    goto :goto_3

    .line 71
    :catchall_2
    move-exception p1

    .line 72
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 73
    throw p1

    .line 74
    :cond_2
    move v0, v2

    .line 75
    :goto_3
    sget-object v1, Lga/a;->e:Ljava/util/HashSet;

    .line 76
    .line 77
    const-string v1, "Hchat_skip_mini_program_video_ads_config"

    .line 78
    .line 79
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const-string v4, "skip_mini_program_video_ads_enable"

    .line 84
    .line 85
    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    invoke-static {p1, p2}, La2/a;->k(Landroid/content/Context;Ljava/lang/ClassLoader;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_3

    .line 96
    .line 97
    move v0, v3

    .line 98
    :cond_3
    sget-object v1, Lfa/a;->f:Ljava/util/HashSet;

    .line 99
    .line 100
    const-string v1, "Hchat_skip_global_mini_program_splash_ads_config"

    .line 101
    .line 102
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    const-string v4, "skip_global_mini_program_splash_ads_enable"

    .line 107
    .line 108
    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    if-nez p2, :cond_4

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    new-instance v5, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v1, "@"

    .line 138
    .line 139
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    sget-object v4, Lr8/e;->a:Landroid/os/Handler;

    .line 150
    .line 151
    const-string v4, "skip_global_mini_program_splash_ads:appbrand:"

    .line 152
    .line 153
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const-string v4, "\u5c0f\u7a0b\u5e8f\u5f00\u5c4f\u5e7f\u544a\u5b50\u8fdb\u7a0b Hook"

    .line 158
    .line 159
    sget-object v5, Lr8/c;->h:Lr8/c;

    .line 160
    .line 161
    new-instance v6, Laa/c;

    .line 162
    .line 163
    const/16 v7, 0x8

    .line 164
    .line 165
    invoke-direct {v6, p1, v7, p2}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    const/16 v7, -0x64

    .line 169
    .line 170
    invoke-static {v7, v6, v1, v4, v5}, Lr8/e;->e(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 171
    .line 172
    .line 173
    :cond_5
    :goto_4
    const-string v1, "Hchat_fake_location_config"

    .line 174
    .line 175
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-string v4, "fake_location_enable"

    .line 180
    .line 181
    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_13

    .line 186
    .line 187
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    const-string v1, "Hchat_fake_location_method_cache"

    .line 191
    .line 192
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-static {p1, p2}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    iget-object v4, v4, Ll8/i;->h:Ljava/lang/String;

    .line 201
    .line 202
    const-string v5, "location_callbacks_v1"

    .line 203
    .line 204
    const-string v6, ""

    .line 205
    .line 206
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 207
    .line 208
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    if-eqz v8, :cond_6

    .line 213
    .line 214
    goto/16 :goto_b

    .line 215
    .line 216
    :cond_6
    const-string v8, "cache.key"

    .line 217
    .line 218
    invoke-interface {v1, v8, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    if-nez v8, :cond_7

    .line 223
    .line 224
    move-object v8, v6

    .line 225
    :cond_7
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    if-nez v9, :cond_f

    .line 230
    .line 231
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-eqz v9, :cond_8

    .line 236
    .line 237
    goto/16 :goto_b

    .line 238
    .line 239
    :cond_8
    invoke-virtual {v8, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    if-eqz v9, :cond_9

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_9
    const/16 v9, 0x7c

    .line 247
    .line 248
    invoke-static {v8, v9, v6}, Log/m;->O0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    invoke-static {v4, v9, v6}, Log/m;->O0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    if-nez v9, :cond_f

    .line 261
    .line 262
    invoke-virtual {v8, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    if-eqz v4, :cond_f

    .line 267
    .line 268
    :goto_5
    invoke-interface {v1, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    if-eqz v1, :cond_f

    .line 273
    .line 274
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    const/4 v5, 0x0

    .line 279
    if-nez v4, :cond_a

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_a
    move-object v1, v5

    .line 283
    :goto_6
    if-eqz v1, :cond_f

    .line 284
    .line 285
    new-array v4, v3, [C

    .line 286
    .line 287
    const/16 v6, 0xa

    .line 288
    .line 289
    aput-char v6, v4, v2

    .line 290
    .line 291
    const/4 v6, 0x6

    .line 292
    invoke-static {v1, v4, v6}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    new-instance v7, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    :cond_b
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    if-eqz v4, :cond_f

    .line 310
    .line 311
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    check-cast v4, Ljava/lang/String;

    .line 316
    .line 317
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    if-nez v6, :cond_c

    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_c
    move-object v4, v5

    .line 325
    :goto_8
    if-eqz v4, :cond_e

    .line 326
    .line 327
    :try_start_4
    new-instance v6, Llh/d;

    .line 328
    .line 329
    invoke-direct {v6, v4}, Llh/d;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v6, p2}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 333
    .line 334
    .line 335
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 336
    goto :goto_9

    .line 337
    :catchall_3
    move-exception v4

    .line 338
    new-instance v6, Lsf/f;

    .line 339
    .line 340
    invoke-direct {v6, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 341
    .line 342
    .line 343
    move-object v4, v6

    .line 344
    :goto_9
    nop

    .line 345
    instance-of v6, v4, Lsf/f;

    .line 346
    .line 347
    if-eqz v6, :cond_d

    .line 348
    .line 349
    move-object v4, v5

    .line 350
    :cond_d
    check-cast v4, Ljava/lang/reflect/Method;

    .line 351
    .line 352
    goto :goto_a

    .line 353
    :cond_e
    move-object v4, v5

    .line 354
    :goto_a
    if-eqz v4, :cond_b

    .line 355
    .line 356
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_f
    :goto_b
    new-instance v1, Ljava/util/ArrayList;

    .line 361
    .line 362
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 363
    .line 364
    .line 365
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    :cond_10
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-eqz v5, :cond_11

    .line 374
    .line 375
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    move-object v6, v5

    .line 380
    check-cast v6, Ljava/lang/reflect/Method;

    .line 381
    .line 382
    invoke-static {v6}, Lig/a;->c(Ljava/lang/reflect/Method;)Z

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    if-eqz v6, :cond_10

    .line 387
    .line 388
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    goto :goto_c

    .line 392
    :cond_11
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    if-eqz v4, :cond_12

    .line 397
    .line 398
    goto :goto_d

    .line 399
    :cond_12
    sget-object v4, Lh9/d;->a:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 400
    .line 401
    new-instance v4, Lc9/n1;

    .line 402
    .line 403
    const/4 v5, 0x2

    .line 404
    invoke-direct {v4, v2, v5}, Lc9/n1;-><init>(BI)V

    .line 405
    .line 406
    .line 407
    invoke-static {p1, v1, v4}, Lh9/d;->c(Landroid/content/Context;Ljava/util/ArrayList;Lfg/p;)Z

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    :goto_d
    if-nez v2, :cond_13

    .line 412
    .line 413
    goto :goto_e

    .line 414
    :cond_13
    move v3, v0

    .line 415
    :goto_e
    if-eqz p4, :cond_14

    .line 416
    .line 417
    iget-object v0, p3, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 418
    .line 419
    invoke-static {p1, p2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->installAppBrandProcess(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    :cond_14
    if-eqz v3, :cond_15

    .line 423
    .line 424
    if-eqz p4, :cond_15

    .line 425
    .line 426
    new-instance p1, Ljava/lang/StringBuilder;

    .line 427
    .line 428
    const-string p2, "[Hchat:Entry] \u5c0f\u7a0b\u5e8f\u8fdb\u7a0bHook\u5b89\u88c5\u5931\u8d25: "

    .line 429
    .line 430
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    iget-object p2, p3, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 434
    .line 435
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    :cond_15
    :goto_f
    return-void
.end method

.method private installAppBrandProcessHook(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 8

    .line 446
    :try_start_0
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 447
    const-string v1, "com.tencent.tinker.loader.app.TinkerApplication"

    iget-object v2, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    const-string v3, "onBaseContextAttached"

    const-class v4, Landroid/content/Context;

    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    new-instance v6, Ld8/b;

    const/4 v7, 0x1

    invoke-direct {v6, p0, p1, v7}, Ld8/b;-><init>(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;I)V

    filled-new-array {v4, v5, v5, v6}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object v1

    invoke-virtual {v0, v1}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 448
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[Hchat:Entry] \u5c0f\u7a0b\u5e8f\u8fdb\u7a0b\u65e9\u671f\u5165\u53e3\u5b89\u88c5\u5931\u8d25: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 449
    invoke-static {v0, v1, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 450
    :goto_0
    :try_start_1
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 451
    const-class v1, Landroid/app/Application;

    const-string v2, "onCreate"

    new-instance v3, Ld8/b;

    const/4 v4, 0x2

    invoke-direct {v3, p0, p1, v4}, Ld8/b;-><init>(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;I)V

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p1

    invoke-virtual {v0, p1}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    .line 452
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[Hchat:Entry] \u5c0f\u7a0b\u5e8f\u8fdb\u7a0b\u515c\u5e95\u5165\u53e3\u5b89\u88c5\u5931\u8d25: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    invoke-static {p1, v0, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method private installHideBottomBarEarly(Landroid/content/Context;Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "Hchat_global_config"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "terms_accepted"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_1
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move v1, v2

    .line 19
    :goto_0
    if-eqz v1, :cond_0

    .line 20
    .line 21
    :try_start_2
    const-string v1, "terms_version"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 22
    .line 23
    :try_start_3
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 28
    .line 29
    .line 30
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 31
    goto :goto_1

    .line 32
    :catchall_1
    move v0, v2

    .line 33
    :goto_1
    const/4 v1, 0x1

    .line 34
    if-ne v0, v1, :cond_0

    .line 35
    .line 36
    move v2, v1

    .line 37
    :cond_0
    if-nez v2, :cond_1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    :try_start_4
    invoke-static {p1, p2}, Lu9/c;->k(Landroid/content/Context;Ljava/lang/ClassLoader;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 41
    .line 42
    .line 43
    :goto_2
    return-void

    .line 44
    :catchall_2
    move-exception p1

    .line 45
    new-instance p2, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v0, "[Hchat:Entry] \u9690\u85cf\u5e95\u680f\u65e9\u671fHook\u5931\u8d25: "

    .line 48
    .line 49
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, p2, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private installHideBottomBarEarlyHook(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 8

    .line 1
    :try_start_0
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 2
    .line 3
    const-string v1, "com.tencent.tinker.loader.app.TinkerApplication"

    .line 4
    .line 5
    iget-object v2, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    const-string v3, "onBaseContextAttached"

    .line 8
    .line 9
    const-class v4, Landroid/content/Context;

    .line 10
    .line 11
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    new-instance v6, Ld8/b;

    .line 14
    .line 15
    const/4 v7, 0x5

    .line 16
    invoke-direct {v6, p0, p1, v7}, Ld8/b;-><init>(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;I)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v4, v5, v5, v6}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {v1, v2, v3, p1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "[Hchat:Entry] \u9690\u85cf\u5e95\u680f\u65e9\u671f\u5165\u53e3\u5b89\u88c5\u5931\u8d25: "

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private installHotUpdateEarlyHook(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 8

    .line 1
    :try_start_0
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 2
    .line 3
    const-string v1, "com.tencent.tinker.loader.app.TinkerApplication"

    .line 4
    .line 5
    iget-object v2, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    const-string v3, "onBaseContextAttached"

    .line 8
    .line 9
    const-class v4, Landroid/content/Context;

    .line 10
    .line 11
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    new-instance v6, Ld8/b;

    .line 14
    .line 15
    const/4 v7, 0x3

    .line 16
    invoke-direct {v6, p0, p1, v7}, Ld8/b;-><init>(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;I)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v4, v5, v5, v6}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {v1, v2, v3, p1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "[Hchat:Entry] \u70ed\u66f4\u65b0\u65e9\u671f\u5165\u53e3\u5b89\u88c5\u5931\u8d25: "

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private installHotUpdateForAttach(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    move-object v5, v0

    .line 7
    check-cast v5, Landroid/content/Context;

    .line 8
    .line 9
    const-string v0, "Hchat_global_config"

    .line 10
    .line 11
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v2, "terms_accepted"
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 15
    .line 16
    :try_start_1
    invoke-static {v5, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move v2, v1

    .line 26
    :goto_0
    if-eqz v2, :cond_0

    .line 27
    .line 28
    :try_start_2
    const-string v2, "terms_version"
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 29
    .line 30
    :try_start_3
    invoke-static {v5, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 35
    .line 36
    .line 37
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 38
    goto :goto_1

    .line 39
    :catchall_1
    move v0, v1

    .line 40
    :goto_1
    const/4 v2, 0x1

    .line 41
    if-ne v0, v2, :cond_0

    .line 42
    .line 43
    move v1, v2

    .line 44
    :cond_0
    if-nez v1, :cond_1

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    :try_start_4
    sget-object v0, Lv9/b;->e:Luf/d;

    .line 48
    .line 49
    invoke-static {v5}, Luf/d;->C(Landroid/content/Context;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    :goto_2
    return-void

    .line 56
    :cond_2
    const-string v1, "before"

    .line 57
    .line 58
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    iget-object p1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 65
    .line 66
    invoke-virtual {v0, v5, p1}, Luf/d;->A(Landroid/content/Context;Ljava/lang/ClassLoader;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_2
    move-exception v0

    .line 71
    move-object p1, v0

    .line 72
    goto :goto_3

    .line 73
    :catch_0
    move-exception v0

    .line 74
    move-object p1, v0

    .line 75
    goto :goto_4

    .line 76
    :cond_3
    new-instance v0, Ljava/lang/Thread;

    .line 77
    .line 78
    new-instance v2, Ld8/a;

    .line 79
    .line 80
    const/4 v7, 0x1

    .line 81
    move-object v3, p0

    .line 82
    move-object v6, p1

    .line 83
    move-object v4, p2

    .line 84
    invoke-direct/range {v2 .. v7}, Ld8/a;-><init>(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;I)V

    .line 85
    .line 86
    .line 87
    const-string p1, "Hchat-HotUpdateHook"

    .line 88
    .line 89
    invoke-direct {v0, v2, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :goto_3
    const-string p2, "[Hchat:Entry] \u70ed\u66f4\u65b0\u65e9\u671fHook\u5931\u8d25("

    .line 97
    .line 98
    const-string v0, "): "

    .line 99
    .line 100
    invoke-static {p2, p3, v0}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-static {p1, p2, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :goto_4
    throw p1
.end method

.method private installTabletEarlyHook(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 8

    .line 1
    :try_start_0
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 2
    .line 3
    const-string v1, "com.tencent.tinker.loader.app.TinkerApplication"

    .line 4
    .line 5
    iget-object v2, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    const-string v3, "onBaseContextAttached"

    .line 8
    .line 9
    const-class v4, Landroid/content/Context;

    .line 10
    .line 11
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    new-instance v6, Ld8/b;

    .line 14
    .line 15
    const/4 v7, 0x4

    .line 16
    invoke-direct {v6, p0, p1, v7}, Ld8/b;-><init>(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;I)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v4, v5, v5, v6}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {v1, v2, v3, p1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "[Hchat:Entry] \u5e73\u677f\u6a21\u5f0f\u65e9\u671f\u5165\u53e3\u5b89\u88c5\u5931\u8d25: "

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private installTabletHookForAttach(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    move-object v5, v0

    .line 7
    check-cast v5, Landroid/content/Context;

    .line 8
    .line 9
    const-string v0, "Hchat_global_config"

    .line 10
    .line 11
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v2, "terms_accepted"
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 15
    .line 16
    :try_start_1
    invoke-static {v5, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move v2, v1

    .line 26
    :goto_0
    if-eqz v2, :cond_0

    .line 27
    .line 28
    :try_start_2
    const-string v2, "terms_version"
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 29
    .line 30
    :try_start_3
    invoke-static {v5, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 35
    .line 36
    .line 37
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 38
    goto :goto_1

    .line 39
    :catchall_1
    move v0, v1

    .line 40
    :goto_1
    const/4 v2, 0x1

    .line 41
    if-ne v0, v2, :cond_0

    .line 42
    .line 43
    move v1, v2

    .line 44
    goto :goto_2

    .line 45
    :catchall_2
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    move-object v7, p3

    .line 48
    goto :goto_5

    .line 49
    :cond_0
    :goto_2
    if-nez v1, :cond_1

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    :try_start_4
    sget-object v0, Lmb/a;->e:Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-static {v5}, Loh/h;->F(Landroid/content/Context;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    :goto_3
    return-void

    .line 61
    :cond_2
    new-instance v2, Lca/x;
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 62
    .line 63
    const/4 v8, 0x2

    .line 64
    move-object v3, p0

    .line 65
    move-object v6, p1

    .line 66
    move-object v4, p2

    .line 67
    move-object v7, p3

    .line 68
    :try_start_5
    invoke-direct/range {v2 .. v8}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    invoke-static {v2}, Lr8/e;->c(Ljava/lang/Runnable;)V
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_3
    move-exception v0

    .line 76
    :goto_4
    move-object p1, v0

    .line 77
    goto :goto_5

    .line 78
    :catch_0
    move-exception v0

    .line 79
    move-object p1, v0

    .line 80
    goto :goto_6

    .line 81
    :catchall_4
    move-exception v0

    .line 82
    move-object v7, p3

    .line 83
    goto :goto_4

    .line 84
    :goto_5
    const-string p2, "[Hchat:Entry] \u5e73\u677f\u6a21\u5f0f\u65e9\u671fHook\u5931\u8d25("

    .line 85
    .line 86
    const-string p3, "): "

    .line 87
    .line 88
    invoke-static {p2, v7, p3}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-static {p1, p2, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :goto_6
    throw p1
.end method

.method private isAppBrandProcess(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Z
    .locals 2

    .line 1
    iget-object v0, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string v1, ":appbrand"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method private isMainProcess(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Z
    .locals 1

    .line 1
    iget-object v0, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method private isTinkerClassLoader(Ljava/lang/ClassLoader;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v1, "/tinker/"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    const-string v1, "DelegateLastClassLoader"

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return v0

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 28
    return p1
.end method

.method private isWeChatPackage(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "com.tencent.mm"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public static bridge synthetic j(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lh/Hchat/ModuleEntry;->installTabletHookForAttach(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic k(Lh/Hchat/ModuleEntry;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lh/Hchat/ModuleEntry;->resolveHostClassLoader(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static bridge synthetic l(Lh/Hchat/ModuleEntry;Ljava/lang/Object;)Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/ModuleEntry;->resolveTinkerClassLoader(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$handleLoadPackage$0(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "[Hchat:WechatApi] "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private lambda$initModule$4(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;Landroid/content/Context;Lub/a;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    iget-object v0, v6, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 8
    .line 9
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v1, v3, v6}, Lh/Hchat/ModuleEntry;->resolveHostClassLoader(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/ClassLoader;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-direct {v1, v5, v0}, Lh/Hchat/ModuleEntry;->createDexKitBridge(Ljava/lang/ClassLoader;Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    new-instance v8, Lh/Hchat/dexkit/DexFinder;

    .line 20
    .line 21
    invoke-direct {v8, v7, v5, v3}, Lh/Hchat/dexkit/DexFinder;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    new-instance v11, Lh/Hchat/dexkit/DexBridgeHolder;

    .line 25
    .line 26
    invoke-direct {v11, v7, v8, v5, v0}, Lh/Hchat/dexkit/DexBridgeHolder;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lfb/n0;->a:Ljava/util/Set;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget-object v2, Lfb/n0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    monitor-enter v2

    .line 37
    :try_start_0
    sget-object v0, Lfb/n0;->e:Lfb/j0;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Lfb/j0;->close()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 49
    sput-object v0, Lfb/n0;->e:Lfb/j0;

    .line 50
    .line 51
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v11, v0}, Lg4/a;->w(Lh/Hchat/dexkit/DexBridgeHolder;Landroid/content/Context;)Lfb/j0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v4, Lfb/n0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 63
    .line 64
    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Lfb/j0;

    .line 69
    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    invoke-virtual {v4}, Lfb/j0;->close()V

    .line 73
    .line 74
    .line 75
    :cond_1
    sget-object v4, Lfb/n0;->d:Ljava/util/LinkedHashMap;

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->clear()V

    .line 78
    .line 79
    .line 80
    iget-object v9, v0, Lfb/j0;->j:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v20

    .line 86
    new-instance v10, Ljava/io/File;

    .line 87
    .line 88
    iget-object v12, v0, Lfb/j0;->i:Ljava/lang/String;

    .line 89
    .line 90
    invoke-direct {v10, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance v12, Lfb/m0;

    .line 94
    .line 95
    iget-object v13, v0, Lfb/j0;->j:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v14, v0, Lfb/j0;->i:Ljava/lang/String;

    .line 98
    .line 99
    const-string v15, "current_wechat_apk"

    .line 100
    .line 101
    invoke-virtual {v10}, Ljava/io/File;->length()J

    .line 102
    .line 103
    .line 104
    move-result-wide v16

    .line 105
    invoke-virtual {v10}, Ljava/io/File;->lastModified()J

    .line 106
    .line 107
    .line 108
    move-result-wide v18

    .line 109
    invoke-direct/range {v12 .. v21}, Lfb/m0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v4, v9, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    sget-object v4, Lfb/n0;->a:Ljava/util/Set;

    .line 116
    .line 117
    invoke-static {v0}, Lfb/n0;->E(Lfb/j0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    .line 120
    monitor-exit v2

    .line 121
    new-instance v2, Lr8/g;

    .line 122
    .line 123
    if-eqz p3, :cond_2

    .line 124
    .line 125
    move-object/from16 v4, p3

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    move-object v4, v3

    .line 129
    :goto_1
    iget-object v9, v1, Lh/Hchat/ModuleEntry;->eventBus:Lf8/c;

    .line 130
    .line 131
    iget-object v12, v1, Lh/Hchat/ModuleEntry;->uiRegistry:Lvb/c;

    .line 132
    .line 133
    move-object/from16 v10, p4

    .line 134
    .line 135
    invoke-direct/range {v2 .. v12}, Lr8/g;-><init>(Landroid/content/Context;Landroid/content/Context;Ljava/lang/ClassLoader;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Lorg/luckypray/dexkit/DexKitBridge;Lh/Hchat/dexkit/DexFinder;Lf8/c;Lub/a;Lh/Hchat/dexkit/DexBridgeHolder;Lvb/c;)V

    .line 136
    .line 137
    .line 138
    iput-object v2, v1, Lh/Hchat/ModuleEntry;->featureContext:Lr8/g;

    .line 139
    .line 140
    new-instance v2, Lr8/h;

    .line 141
    .line 142
    invoke-direct {v2}, Lr8/h;-><init>()V

    .line 143
    .line 144
    .line 145
    new-instance v0, Lib/c;

    .line 146
    .line 147
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 151
    .line 152
    .line 153
    new-instance v0, Li8/i;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 159
    .line 160
    .line 161
    new-instance v0, Lc9/g;

    .line 162
    .line 163
    const/4 v3, 0x4

    .line 164
    invoke-direct {v0, v3}, Lc9/g;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 168
    .line 169
    .line 170
    new-instance v0, Lu9/c;

    .line 171
    .line 172
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 176
    .line 177
    .line 178
    new-instance v0, Lb9/a;

    .line 179
    .line 180
    const/4 v4, 0x2

    .line 181
    invoke-direct {v0, v4}, Lb9/a;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 185
    .line 186
    .line 187
    new-instance v0, Ld9/d;

    .line 188
    .line 189
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 193
    .line 194
    .line 195
    new-instance v0, Lbb/e;

    .line 196
    .line 197
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 201
    .line 202
    .line 203
    new-instance v0, Ly9/c;

    .line 204
    .line 205
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 209
    .line 210
    .line 211
    new-instance v0, Lb9/a;

    .line 212
    .line 213
    const/4 v5, 0x6

    .line 214
    invoke-direct {v0, v5}, Lb9/a;-><init>(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 218
    .line 219
    .line 220
    new-instance v0, Lmb/a;

    .line 221
    .line 222
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 226
    .line 227
    .line 228
    new-instance v0, Lua/b;

    .line 229
    .line 230
    invoke-direct {v0}, Lua/b;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 234
    .line 235
    .line 236
    new-instance v0, Lb9/a;

    .line 237
    .line 238
    const/16 v6, 0x8

    .line 239
    .line 240
    invoke-direct {v0, v6}, Lb9/a;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 244
    .line 245
    .line 246
    new-instance v0, Ls8/c;

    .line 247
    .line 248
    invoke-direct {v0}, Ls8/c;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 252
    .line 253
    .line 254
    new-instance v0, Lja/a;

    .line 255
    .line 256
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 260
    .line 261
    .line 262
    new-instance v0, Lv9/b;

    .line 263
    .line 264
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 268
    .line 269
    .line 270
    new-instance v0, Lva/c;

    .line 271
    .line 272
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 276
    .line 277
    .line 278
    new-instance v0, Lb9/a;

    .line 279
    .line 280
    const/16 v7, 0xa

    .line 281
    .line 282
    invoke-direct {v0, v7}, Lb9/a;-><init>(I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 286
    .line 287
    .line 288
    new-instance v0, Lxa/c;

    .line 289
    .line 290
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 294
    .line 295
    .line 296
    new-instance v0, Lya/h;

    .line 297
    .line 298
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 302
    .line 303
    .line 304
    new-instance v0, Lc9/g;

    .line 305
    .line 306
    const/16 v8, 0xe

    .line 307
    .line 308
    invoke-direct {v0, v8}, Lc9/g;-><init>(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 312
    .line 313
    .line 314
    new-instance v0, Lc9/g;

    .line 315
    .line 316
    const/16 v8, 0xb

    .line 317
    .line 318
    invoke-direct {v0, v8}, Lc9/g;-><init>(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 322
    .line 323
    .line 324
    new-instance v0, Lb9/a;

    .line 325
    .line 326
    invoke-direct {v0, v8}, Lb9/a;-><init>(I)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 330
    .line 331
    .line 332
    new-instance v0, Lc9/g;

    .line 333
    .line 334
    const/4 v8, 0x0

    .line 335
    invoke-direct {v0, v8}, Lc9/g;-><init>(I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 339
    .line 340
    .line 341
    new-instance v0, Lc9/g;

    .line 342
    .line 343
    const/16 v9, 0xd

    .line 344
    .line 345
    invoke-direct {v0, v9}, Lc9/g;-><init>(I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 349
    .line 350
    .line 351
    new-instance v0, Lpb/a;

    .line 352
    .line 353
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 357
    .line 358
    .line 359
    new-instance v0, Lma/a;

    .line 360
    .line 361
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 365
    .line 366
    .line 367
    new-instance v0, Lc9/g;

    .line 368
    .line 369
    invoke-direct {v0, v6}, Lc9/g;-><init>(I)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 373
    .line 374
    .line 375
    new-instance v0, Ly8/a;

    .line 376
    .line 377
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 381
    .line 382
    .line 383
    new-instance v0, Ll9/a;

    .line 384
    .line 385
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 389
    .line 390
    .line 391
    new-instance v0, Lc9/g;

    .line 392
    .line 393
    invoke-direct {v0, v5}, Lc9/g;-><init>(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 397
    .line 398
    .line 399
    new-instance v0, Lz8/a;

    .line 400
    .line 401
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 405
    .line 406
    .line 407
    new-instance v0, Lz8/e;

    .line 408
    .line 409
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 413
    .line 414
    .line 415
    new-instance v0, Lc9/g;

    .line 416
    .line 417
    const/4 v5, 0x1

    .line 418
    invoke-direct {v0, v5}, Lc9/g;-><init>(I)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 422
    .line 423
    .line 424
    new-instance v0, Lc9/g;

    .line 425
    .line 426
    const/16 v6, 0xc

    .line 427
    .line 428
    invoke-direct {v0, v6}, Lc9/g;-><init>(I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 432
    .line 433
    .line 434
    new-instance v0, Lb9/a;

    .line 435
    .line 436
    const/4 v6, 0x7

    .line 437
    invoke-direct {v0, v6}, Lb9/a;-><init>(I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 441
    .line 442
    .line 443
    new-instance v0, Lob/f;

    .line 444
    .line 445
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 449
    .line 450
    .line 451
    new-instance v0, Lrb/b;

    .line 452
    .line 453
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 457
    .line 458
    .line 459
    new-instance v0, Lc9/g;

    .line 460
    .line 461
    const/16 v9, 0x9

    .line 462
    .line 463
    invoke-direct {v0, v9}, Lc9/g;-><init>(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 467
    .line 468
    .line 469
    new-instance v0, Lab/c;

    .line 470
    .line 471
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 475
    .line 476
    .line 477
    new-instance v0, Llb/k;

    .line 478
    .line 479
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 483
    .line 484
    .line 485
    new-instance v0, Lc9/g;

    .line 486
    .line 487
    invoke-direct {v0, v6}, Lc9/g;-><init>(I)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 491
    .line 492
    .line 493
    new-instance v0, Lj9/a;

    .line 494
    .line 495
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 499
    .line 500
    .line 501
    new-instance v0, Lb9/a;

    .line 502
    .line 503
    invoke-direct {v0, v8}, Lb9/a;-><init>(I)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 507
    .line 508
    .line 509
    new-instance v0, Lb9/a;

    .line 510
    .line 511
    invoke-direct {v0, v5}, Lb9/a;-><init>(I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 515
    .line 516
    .line 517
    new-instance v0, Lb9/a;

    .line 518
    .line 519
    const/4 v6, 0x3

    .line 520
    invoke-direct {v0, v6}, Lb9/a;-><init>(I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 524
    .line 525
    .line 526
    new-instance v0, Lb9/a;

    .line 527
    .line 528
    invoke-direct {v0, v9}, Lb9/a;-><init>(I)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 532
    .line 533
    .line 534
    new-instance v0, Laa/e;

    .line 535
    .line 536
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 540
    .line 541
    .line 542
    new-instance v0, Lh9/a;

    .line 543
    .line 544
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 548
    .line 549
    .line 550
    new-instance v0, Lm9/a;

    .line 551
    .line 552
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 556
    .line 557
    .line 558
    new-instance v0, Lea/a;

    .line 559
    .line 560
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 564
    .line 565
    .line 566
    new-instance v0, Lga/a;

    .line 567
    .line 568
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 572
    .line 573
    .line 574
    new-instance v0, Lfa/a;

    .line 575
    .line 576
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 580
    .line 581
    .line 582
    new-instance v0, Lka/b;

    .line 583
    .line 584
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 588
    .line 589
    .line 590
    new-instance v0, Lha/i;

    .line 591
    .line 592
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 596
    .line 597
    .line 598
    new-instance v0, Lha/a;

    .line 599
    .line 600
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 604
    .line 605
    .line 606
    new-instance v0, Lha/e;

    .line 607
    .line 608
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 612
    .line 613
    .line 614
    new-instance v0, Lha/l;

    .line 615
    .line 616
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 620
    .line 621
    .line 622
    new-instance v0, Lha/v;

    .line 623
    .line 624
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 628
    .line 629
    .line 630
    new-instance v0, Lha/o;

    .line 631
    .line 632
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 636
    .line 637
    .line 638
    new-instance v0, Lha/a0;

    .line 639
    .line 640
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 644
    .line 645
    .line 646
    new-instance v0, Lb9/a;

    .line 647
    .line 648
    invoke-direct {v0, v3}, Lb9/a;-><init>(I)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 652
    .line 653
    .line 654
    new-instance v0, Lha/e0;

    .line 655
    .line 656
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 660
    .line 661
    .line 662
    new-instance v0, Lc9/g;

    .line 663
    .line 664
    invoke-direct {v0, v6}, Lc9/g;-><init>(I)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 668
    .line 669
    .line 670
    new-instance v0, Lia/u;

    .line 671
    .line 672
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 676
    .line 677
    .line 678
    new-instance v0, Lc9/g;

    .line 679
    .line 680
    const/4 v3, 0x5

    .line 681
    invoke-direct {v0, v3}, Lc9/g;-><init>(I)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 685
    .line 686
    .line 687
    new-instance v0, Lo9/a;

    .line 688
    .line 689
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 693
    .line 694
    .line 695
    new-instance v0, Lq9/b;

    .line 696
    .line 697
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 701
    .line 702
    .line 703
    new-instance v0, Lha/h0;

    .line 704
    .line 705
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 709
    .line 710
    .line 711
    new-instance v0, Lf9/a;

    .line 712
    .line 713
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 717
    .line 718
    .line 719
    new-instance v0, Lg9/a;

    .line 720
    .line 721
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 725
    .line 726
    .line 727
    new-instance v0, Lqb/a;

    .line 728
    .line 729
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 733
    .line 734
    .line 735
    new-instance v0, Lhb/u;

    .line 736
    .line 737
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 741
    .line 742
    .line 743
    new-instance v0, Lca/f;

    .line 744
    .line 745
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 749
    .line 750
    .line 751
    new-instance v0, Ldb/b;

    .line 752
    .line 753
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 757
    .line 758
    .line 759
    new-instance v0, Lb9/a;

    .line 760
    .line 761
    invoke-direct {v0, v3}, Lb9/a;-><init>(I)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 765
    .line 766
    .line 767
    new-instance v0, Lc9/g;

    .line 768
    .line 769
    invoke-direct {v0, v7}, Lc9/g;-><init>(I)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 773
    .line 774
    .line 775
    new-instance v0, Lkb/a;

    .line 776
    .line 777
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 781
    .line 782
    .line 783
    new-instance v0, Ljb/a;

    .line 784
    .line 785
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 789
    .line 790
    .line 791
    new-instance v0, Lr9/a;

    .line 792
    .line 793
    invoke-direct {v0}, Lr8/a;-><init>()V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 797
    .line 798
    .line 799
    new-instance v0, Lc9/g;

    .line 800
    .line 801
    invoke-direct {v0, v4}, Lc9/g;-><init>(I)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v2, v0}, Lr8/h;->a(Lr8/f;)V

    .line 805
    .line 806
    .line 807
    iput-object v2, v1, Lh/Hchat/ModuleEntry;->featureManager:Lr8/h;

    .line 808
    .line 809
    iget-object v3, v1, Lh/Hchat/ModuleEntry;->featureContext:Lr8/g;

    .line 810
    .line 811
    const-string v4, ", error="

    .line 812
    .line 813
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    iget-object v0, v3, Lr8/g;->g:Lub/a;

    .line 817
    .line 818
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    const-string v6, "terms_accepted"

    .line 822
    .line 823
    :try_start_1
    iget-object v7, v0, Lub/a;->a:Landroid/content/Context;

    .line 824
    .line 825
    const-string v9, "Hchat_global_config"

    .line 826
    .line 827
    invoke-static {v7, v9}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 828
    .line 829
    .line 830
    move-result-object v7

    .line 831
    invoke-interface {v7, v6, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 832
    .line 833
    .line 834
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 835
    goto :goto_2

    .line 836
    :catchall_1
    move v6, v8

    .line 837
    :goto_2
    if-eqz v6, :cond_3

    .line 838
    .line 839
    const-string v6, "terms_version"

    .line 840
    .line 841
    :try_start_2
    iget-object v0, v0, Lub/a;->a:Landroid/content/Context;

    .line 842
    .line 843
    const-string v7, "Hchat_global_config"

    .line 844
    .line 845
    invoke-static {v0, v7}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-interface {v0, v6, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 850
    .line 851
    .line 852
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 853
    goto :goto_3

    .line 854
    :catchall_2
    move v0, v8

    .line 855
    :goto_3
    if-ne v0, v5, :cond_3

    .line 856
    .line 857
    move v8, v5

    .line 858
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    .line 859
    .line 860
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 861
    .line 862
    .line 863
    iget-object v0, v2, Lr8/h;->a:Ljava/util/ArrayList;

    .line 864
    .line 865
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 866
    .line 867
    .line 868
    move-result-object v6

    .line 869
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 873
    .line 874
    .line 875
    move-result v0

    .line 876
    if-eqz v0, :cond_5

    .line 877
    .line 878
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    check-cast v0, Lr8/f;

    .line 886
    .line 887
    invoke-static {v0}, Lr8/h;->b(Lr8/f;)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v7

    .line 891
    if-nez v8, :cond_4

    .line 892
    .line 893
    invoke-interface {v0}, Lr8/f;->a()Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v9

    .line 897
    const-string v10, "settings"

    .line 898
    .line 899
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    move-result v9

    .line 903
    if-nez v9, :cond_4

    .line 904
    .line 905
    goto :goto_4

    .line 906
    :cond_4
    :try_start_3
    invoke-interface {v0, v3}, Lr8/f;->d(Lr8/g;)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 910
    .line 911
    .line 912
    goto :goto_4

    .line 913
    :catchall_3
    move-exception v0

    .line 914
    new-instance v9, Ljava/lang/StringBuilder;

    .line 915
    .line 916
    const-string v10, "[Hchat:FeatureManager] onInit \u5931\u8d25: "

    .line 917
    .line 918
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 922
    .line 923
    .line 924
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 925
    .line 926
    .line 927
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 928
    .line 929
    .line 930
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v7

    .line 934
    invoke-static {v7, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 935
    .line 936
    .line 937
    goto :goto_4

    .line 938
    :cond_5
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 939
    .line 940
    .line 941
    move-result-object v5

    .line 942
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    :catchall_4
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 946
    .line 947
    .line 948
    move-result v0

    .line 949
    if-eqz v0, :cond_7

    .line 950
    .line 951
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    move-object v6, v0

    .line 959
    check-cast v6, Lr8/f;

    .line 960
    .line 961
    invoke-static {v6}, Lr8/h;->b(Lr8/f;)Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v7

    .line 965
    :try_start_4
    invoke-interface {v6, v3}, Lr8/f;->b(Lr8/g;)Z

    .line 966
    .line 967
    .line 968
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 969
    if-nez v0, :cond_6

    .line 970
    .line 971
    goto :goto_5

    .line 972
    :catchall_5
    move-exception v0

    .line 973
    const-string v8, "[Hchat:FeatureManager] isEnabled \u68c0\u67e5\u5f02\u5e38\uff0c\u9ed8\u8ba4\u542f\u7528: "

    .line 974
    .line 975
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v8

    .line 979
    invoke-static {v8, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 980
    .line 981
    .line 982
    :cond_6
    :try_start_5
    invoke-interface {v6, v3}, Lr8/f;->c(Lr8/g;)V

    .line 983
    .line 984
    .line 985
    iget-object v0, v2, Lr8/h;->b:Ljava/util/ArrayList;

    .line 986
    .line 987
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 988
    .line 989
    .line 990
    :try_start_6
    iget-object v0, v3, Lr8/g;->f:Lf8/c;

    .line 991
    .line 992
    new-instance v6, Lf8/b;

    .line 993
    .line 994
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v0, v6}, Lf8/c;->b(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 998
    .line 999
    .line 1000
    goto :goto_5

    .line 1001
    :catchall_6
    move-exception v0

    .line 1002
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1003
    .line 1004
    const-string v8, "[Hchat:FeatureManager] \u529f\u80fd\u5b89\u88c5\u5931\u8d25: "

    .line 1005
    .line 1006
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v6

    .line 1022
    invoke-static {v6, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1023
    .line 1024
    .line 1025
    goto :goto_5

    .line 1026
    :cond_7
    sget-object v0, Lr8/e;->a:Landroid/os/Handler;

    .line 1027
    .line 1028
    sget-object v0, Lr8/c;->i:Lr8/c;

    .line 1029
    .line 1030
    invoke-static {v0}, Lr8/e;->a(Lr8/c;)V

    .line 1031
    .line 1032
    .line 1033
    return-void

    .line 1034
    :goto_6
    monitor-exit v2

    .line 1035
    throw v0
.end method

.method private lambda$installHotUpdateForAttach$1(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lh/Hchat/ModuleEntry;->resolveTinkerClassLoader(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p2, p3}, Lh/Hchat/ModuleEntry;->resolveHostClassLoader(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/ClassLoader;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "libdexkit.so"

    .line 25
    .line 26
    const-string v2, "dexkit"

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {p2, v0, v1, v2, v3}, Lsb/a;->d(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    iget-object p3, p3, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 33
    .line 34
    iget-object p3, p3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 35
    .line 36
    invoke-direct {p0, p1, p3}, Lh/Hchat/ModuleEntry;->createDexKitBridge(Ljava/lang/ClassLoader;Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    sget-object v0, Lv9/b;->e:Luf/d;

    .line 41
    .line 42
    invoke-virtual {v0, p3, p1, p2}, Luf/d;->z(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string p3, "[Hchat:Entry] \u70ed\u66f4\u65b0\u540e\u7f6e\u5b89\u88c5\u5931\u8d25: "

    .line 49
    .line 50
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p2, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method private synthetic lambda$installHotUpdateForAttach$2(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 6

    .line 1
    new-instance v0, Ld8/a;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Ld8/a;-><init>(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lr8/e;->c(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private lambda$installTabletHookForAttach$3(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lh/Hchat/ModuleEntry;->resolveTinkerClassLoader(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p2, p3}, Lh/Hchat/ModuleEntry;->resolveHostClassLoader(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/ClassLoader;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    sget-object v0, Lmb/a;->e:Ljava/util/HashSet;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p2, :cond_4

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-static {p2}, Loh/h;->F(Landroid/content/Context;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const-string v1, "Hchat_wechat_tablet_cache"

    .line 29
    .line 30
    invoke-static {p2, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {p2, p1}, Loh/h;->m(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {p1}, Loh/h;->H(Ljava/lang/ClassLoader;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_3

    .line 43
    .line 44
    const-string v3, "pad_method"

    .line 45
    .line 46
    invoke-static {v1, v2, p1, v3}, Loh/h;->K(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    invoke-static {v4, p1}, Loh/h;->C(Ljava/lang/reflect/Method;Ljava/lang/ClassLoader;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2, v3, v4}, Loh/h;->R(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Loh/h;->H(Ljava/lang/ClassLoader;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    :cond_3
    invoke-static {p1}, Loh/h;->G(Ljava/lang/ClassLoader;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_5

    .line 67
    .line 68
    const-string v4, "login_button_method"

    .line 69
    .line 70
    invoke-static {v1, v2, p1, v4}, Loh/h;->K(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    if-eqz v5, :cond_5

    .line 75
    .line 76
    invoke-static {v5, p1}, Loh/h;->B(Ljava/lang/reflect/Method;Ljava/lang/ClassLoader;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v2, v4, v5}, Loh/h;->R(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    :goto_0
    move v3, v0

    .line 84
    :cond_5
    :goto_1
    if-eqz v3, :cond_6

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_6
    const-string v1, "after"

    .line 88
    .line 89
    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p4

    .line 93
    const-string v1, "dexkit"

    .line 94
    .line 95
    const-string v2, "libdexkit.so"

    .line 96
    .line 97
    if-nez p4, :cond_8

    .line 98
    .line 99
    sget-object p1, Lv9/b;->e:Luf/d;

    .line 100
    .line 101
    invoke-static {p2}, Luf/d;->C(Landroid/content/Context;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_7

    .line 106
    .line 107
    :goto_2
    return-void

    .line 108
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {p2, p1, v2, v1, v0}, Lsb/a;->d(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    iget-object p1, p3, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 120
    .line 121
    iget-object p4, p3, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 122
    .line 123
    iget-object p4, p4, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 124
    .line 125
    invoke-direct {p0, p1, p4}, Lh/Hchat/ModuleEntry;->createDexKitBridge(Ljava/lang/ClassLoader;Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iget-object p3, p3, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 130
    .line 131
    invoke-static {p1, p3, p2}, Loh/h;->D(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Landroid/content/Context;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object p4

    .line 139
    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 140
    .line 141
    .line 142
    move-result-object p4

    .line 143
    invoke-static {p2, p4, v2, v1, v0}, Lsb/a;->d(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 144
    .line 145
    .line 146
    iget-object p3, p3, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 147
    .line 148
    iget-object p3, p3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 149
    .line 150
    invoke-direct {p0, p1, p3}, Lh/Hchat/ModuleEntry;->createDexKitBridge(Ljava/lang/ClassLoader;Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    invoke-static {p3, p1, p2}, Loh/h;->D(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Landroid/content/Context;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method private resolveHostClassLoader(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/ClassLoader;
    .locals 2

    .line 1
    iget-object p2, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-object p1, v0

    .line 10
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    :catchall_1
    invoke-direct {p0, p1}, Lh/Hchat/ModuleEntry;->isTinkerClassLoader(Ljava/lang/ClassLoader;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    invoke-direct {p0, v0}, Lh/Hchat/ModuleEntry;->isTinkerClassLoader(Ljava/lang/ClassLoader;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    if-eqz p1, :cond_2

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_2
    if-eqz v0, :cond_3

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_3
    return-object p2
.end method

.method private resolveTinkerClassLoader(Ljava/lang/Object;)Ljava/lang/ClassLoader;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "getClassLoader"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    new-array v2, v2, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {p1, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of v1, p1, Ljava/lang/ClassLoader;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast p1, Ljava/lang/ClassLoader;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :catchall_0
    :cond_0
    return-object v0
.end method


# virtual methods
.method public handleLoadPackage(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lh/Hchat/ModuleEntry;->isWeChatPackage(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, p1}, Lh/Hchat/ModuleEntry;->installHotUpdateEarlyHook(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lh/Hchat/ModuleEntry;->installTabletEarlyHook(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lh/Hchat/ModuleEntry;->isMainProcess(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lh/Hchat/ModuleEntry;->isAppBrandProcess(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lh/Hchat/ModuleEntry;->installAppBrandProcessHook(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    return-void

    .line 32
    :cond_2
    iget-object v0, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 33
    .line 34
    new-instance v1, Lah/a;

    .line 35
    .line 36
    const/16 v2, 0x16

    .line 37
    .line 38
    invoke-direct {v1, v2}, Lah/a;-><init>(I)V

    .line 39
    .line 40
    .line 41
    sget-object v2, Lj8/n;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    const-string v2, "com.tencent.mars.cdn.CdnManager"

    .line 44
    .line 45
    invoke-static {v2, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0, v1}, Lj8/n;->j(Ljava/lang/Class;Lj8/m;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, p1}, Lh/Hchat/ModuleEntry;->installHideBottomBarEarlyHook(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 56
    .line 57
    new-instance v1, Ld8/b;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-direct {v1, p0, p1, v2}, Ld8/b;-><init>(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;I)V

    .line 61
    .line 62
    .line 63
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-class v1, Landroid/app/Application;

    .line 68
    .line 69
    const-string v2, "onCreate"

    .line 70
    .line 71
    invoke-static {v1, v2, p1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {v0, p1}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method
