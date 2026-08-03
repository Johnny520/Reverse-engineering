.class public final Lea/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public volatile c:Z

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ll3/w;

    const/16 v1, 0x12

    .line 36
    invoke-direct {v0, v1}, Ll3/w;-><init>(I)V

    .line 37
    iput-object v0, p0, Lea/c;->a:Ljava/lang/Object;

    .line 38
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lea/c;->d:Ljava/lang/Object;

    .line 39
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lea/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr8/g;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lea/c;->a:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string v0, "Hchat_fake_scan_camera_config"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lea/c;->b:Ljava/lang/Object;

    .line 18
    .line 19
    const-string v0, "Hchat_fake_scan_camera_method_cache"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lea/c;->d:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lea/c;->a:Ljava/lang/Object;

    .line 49
    iput-object p2, p0, Lea/c;->d:Ljava/lang/Object;

    .line 50
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 51
    const-string p2, "Hchat_fake_mini_program_host_version_member_cache"

    .line 52
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 53
    iput-object p1, p0, Lea/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr8/g;Lab/b;B)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lea/c;->a:Ljava/lang/Object;

    .line 30
    iput-object p2, p0, Lea/c;->d:Ljava/lang/Object;

    .line 31
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 32
    const-string p2, "Hchat_moments_upload_tail_config"

    .line 33
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lea/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr8/g;Lab/b;Z)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lea/c;->a:Ljava/lang/Object;

    .line 56
    iput-object p2, p0, Lea/c;->d:Ljava/lang/Object;

    .line 57
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 58
    const-string p2, "Hchat_skip_global_mini_program_splash_ads_method_cache"

    .line 59
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 60
    iput-object p1, p0, Lea/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr8/g;Lia/t;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lea/c;->a:Ljava/lang/Object;

    .line 42
    iput-object p2, p0, Lea/c;->d:Ljava/lang/Object;

    .line 43
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 44
    const-string p2, "Hchat_fake_voice_duration_recorder_method_cache"

    .line 45
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 46
    iput-object p1, p0, Lea/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public static b(Ljava/lang/reflect/Constructor;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/16 v1, 0x11

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    aget-object v0, p0, v2

    .line 12
    .line 13
    const-class v1, Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    aget-object v3, p0, v0

    .line 23
    .line 24
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x5

    .line 33
    aget-object v3, p0, v3

    .line 34
    .line 35
    invoke-static {v3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    const/4 v3, 0x6

    .line 42
    aget-object v3, p0, v3

    .line 43
    .line 44
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    invoke-static {v3, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    const/4 v3, 0x7

    .line 53
    aget-object v3, p0, v3

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v6, "com.tencent.mm.plugin.appbrand.report.quality.QualitySession"

    .line 60
    .line 61
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    const/16 v3, 0x8

    .line 68
    .line 69
    aget-object v3, p0, v3

    .line 70
    .line 71
    invoke-static {v3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_0

    .line 76
    .line 77
    const/16 v3, 0x9

    .line 78
    .line 79
    aget-object v3, p0, v3

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v6, "com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer"

    .line 86
    .line 87
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_0

    .line 92
    .line 93
    const/16 v3, 0xa

    .line 94
    .line 95
    aget-object v3, p0, v3

    .line 96
    .line 97
    invoke-static {v3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_0

    .line 102
    .line 103
    const/16 v3, 0xc

    .line 104
    .line 105
    aget-object v3, p0, v3

    .line 106
    .line 107
    invoke-static {v3, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_0

    .line 112
    .line 113
    const/16 v3, 0xd

    .line 114
    .line 115
    aget-object v3, p0, v3

    .line 116
    .line 117
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_0

    .line 122
    .line 123
    const/16 v3, 0xe

    .line 124
    .line 125
    aget-object v3, p0, v3

    .line 126
    .line 127
    invoke-static {v3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_0

    .line 132
    .line 133
    const/16 v1, 0xf

    .line 134
    .line 135
    aget-object v1, p0, v1

    .line 136
    .line 137
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_0

    .line 142
    .line 143
    const/16 v1, 0x10

    .line 144
    .line 145
    aget-object p0, p0, v1

    .line 146
    .line 147
    invoke-static {p0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-eqz p0, :cond_0

    .line 152
    .line 153
    return v0

    .line 154
    :cond_0
    return v2
.end method

.method public static c(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    array-length p0, v0

    .line 19
    const/16 v2, 0xf

    .line 20
    .line 21
    if-eq p0, v2, :cond_0

    .line 22
    .line 23
    array-length p0, v0

    .line 24
    const/16 v2, 0x10

    .line 25
    .line 26
    if-ne p0, v2, :cond_1

    .line 27
    .line 28
    :cond_0
    const-class p0, Landroid/app/Activity;

    .line 29
    .line 30
    aget-object v2, v0, v1

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    aget-object v0, v0, p0

    .line 40
    .line 41
    const-class v2, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    return p0

    .line 50
    :cond_1
    return v1
.end method


# virtual methods
.method public declared-synchronized a(Z)Z
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lea/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lea/c;->f(Z)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    move v2, v0

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    .line 31
    :try_start_2
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 32
    .line 33
    new-instance v5, Lb9/e;

    .line 34
    .line 35
    const/16 v6, 0xc

    .line 36
    .line 37
    invoke-direct {v5, p0, v6}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v3, v5}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 41
    .line 42
    .line 43
    iput-boolean v1, p0, Lea/c;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    move v2, v1

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v3

    .line 48
    :try_start_3
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    new-instance v5, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v6, "[Hchat:FakeScanCamera] \u5b89\u88c5 QBarStringHandler Hook \u5931\u8d25: "

    .line 58
    .line 59
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {v4, v3}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    if-nez v2, :cond_3

    .line 76
    .line 77
    iget-boolean p1, p0, Lea/c;->c:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 78
    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v1, v0

    .line 83
    :cond_3
    :goto_1
    monitor-exit p0

    .line 84
    return v1

    .line 85
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 86
    throw p1
.end method

.method public d()Ljava/lang/reflect/Constructor;
    .locals 14

    .line 1
    iget-object v0, p0, Lea/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lab/b;

    .line 5
    .line 6
    iget-object v0, p0, Lea/c;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr8/g;

    .line 9
    .line 10
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v3, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    invoke-static {v2, v3}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v4, p0, Lea/c;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Landroid/content/SharedPreferences;

    .line 21
    .line 22
    const-string v5, "launch_wxa_app_constructor"

    .line 23
    .line 24
    invoke-static {v4, v2, v3, v5}, Le8/b;->d(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const/4 v7, 0x0

    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    invoke-static {v6}, Lea/c;->b(Ljava/lang/reflect/Constructor;)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-eqz v8, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v6, v7

    .line 39
    :goto_0
    if-eqz v6, :cond_1

    .line 40
    .line 41
    return-object v6

    .line 42
    :cond_1
    :try_start_0
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 43
    .line 44
    new-instance v6, Lch/e;

    .line 45
    .line 46
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v8, Lfh/k;

    .line 50
    .line 51
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v9, "MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122"

    .line 55
    .line 56
    const-string v10, "<init> cgiHash[%d], username[%s] appId[%s] sync[%b] sessionId[%s] instanceId[%s] libVersion[%d], source:%s, launchMode:%d, migrate:%b, fallback:%b"

    .line 57
    .line 58
    filled-new-array {v9, v10}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-virtual {v8, v9}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iput-object v8, v6, Lch/e;->h:Lfh/k;

    .line 66
    .line 67
    invoke-virtual {v0, v6}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v6, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    :cond_2
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lhh/o;

    .line 91
    .line 92
    invoke-virtual {v0}, Lhh/o;->t()Z

    .line 93
    .line 94
    .line 95
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 96
    if-nez v9, :cond_3

    .line 97
    .line 98
    move-object v0, v7

    .line 99
    goto :goto_3

    .line 100
    :cond_3
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0, v3}, Llh/d;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;

    .line 108
    .line 109
    .line 110
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    goto :goto_2

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    :try_start_2
    new-instance v9, Lsf/f;

    .line 114
    .line 115
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    move-object v0, v9

    .line 119
    :goto_2
    nop

    .line 120
    instance-of v9, v0, Lsf/f;

    .line 121
    .line 122
    if-eqz v9, :cond_4

    .line 123
    .line 124
    move-object v0, v7

    .line 125
    :cond_4
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 126
    .line 127
    :goto_3
    if-eqz v0, :cond_2

    .line 128
    .line 129
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :catchall_1
    move-exception v0

    .line 134
    goto :goto_6

    .line 135
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-eqz v6, :cond_7

    .line 149
    .line 150
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    move-object v8, v6

    .line 155
    check-cast v8, Ljava/lang/reflect/Constructor;

    .line 156
    .line 157
    invoke-static {v8}, Lea/c;->b(Ljava/lang/reflect/Constructor;)Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-eqz v8, :cond_6

    .line 162
    .line 163
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_7
    new-instance v3, Ljava/util/HashSet;

    .line 168
    .line 169
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 170
    .line 171
    .line 172
    new-instance v6, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    :cond_8
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    if-eqz v8, :cond_9

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    move-object v9, v8

    .line 192
    check-cast v9, Ljava/lang/reflect/Constructor;

    .line 193
    .line 194
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    invoke-virtual {v3, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    if-eqz v9, :cond_8

    .line 203
    .line 204
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :goto_6
    new-instance v6, Lsf/f;

    .line 209
    .line 210
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    :cond_9
    invoke-static {v6}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-nez v0, :cond_a

    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_a
    const-string v3, "\u5b9a\u4f4d\u5c0f\u7a0b\u5e8f\u542f\u52a8\u8bf7\u6c42\u6784\u9020\u5668\u5931\u8d25"

    .line 221
    .line 222
    invoke-virtual {v1, v3, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 226
    .line 227
    :goto_7
    move-object v8, v6

    .line 228
    check-cast v8, Ljava/util/List;

    .line 229
    .line 230
    invoke-static {v8}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 235
    .line 236
    if-eqz v0, :cond_b

    .line 237
    .line 238
    invoke-static {v4, v2, v5, v0}, Le8/b;->i(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Constructor;)V

    .line 239
    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_b
    const-string v3, "cache.key"

    .line 243
    .line 244
    :try_start_3
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    const-string v9, ""

    .line 249
    .line 250
    invoke-interface {v4, v3, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-nez v4, :cond_c

    .line 259
    .line 260
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    invoke-interface {v4, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 265
    .line 266
    .line 267
    :cond_c
    invoke-interface {v6, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 272
    .line 273
    .line 274
    :catchall_2
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    const/4 v3, 0x1

    .line 279
    if-le v2, v3, :cond_d

    .line 280
    .line 281
    new-instance v12, Le9/h;

    .line 282
    .line 283
    const/4 v2, 0x5

    .line 284
    invoke-direct {v12, v2}, Le9/h;-><init>(I)V

    .line 285
    .line 286
    .line 287
    const/16 v13, 0x1f

    .line 288
    .line 289
    const/4 v9, 0x0

    .line 290
    const/4 v10, 0x0

    .line 291
    const/4 v11, 0x0

    .line 292
    invoke-static/range {v8 .. v13}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    const-string v3, "\u5c0f\u7a0b\u5e8f\u542f\u52a8\u8bf7\u6c42\u6784\u9020\u5668\u5019\u9009\u4e0d\u552f\u4e00: "

    .line 297
    .line 298
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-virtual {v1, v2, v7}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    :cond_d
    :goto_8
    return-object v0
.end method

.method public e()Ljava/lang/reflect/Method;
    .locals 14

    .line 1
    iget-object v0, p0, Lea/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lab/b;

    .line 5
    .line 6
    iget-object v0, p0, Lea/c;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr8/g;

    .line 9
    .line 10
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v3, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    invoke-static {v2, v3}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v4, p0, Lea/c;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Landroid/content/SharedPreferences;

    .line 21
    .line 22
    const-string v5, "private_open_url_method"

    .line 23
    .line 24
    invoke-static {v4, v2, v3, v5}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const/4 v7, 0x0

    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    invoke-static {v6}, Lx6/d;->j(Ljava/lang/reflect/Method;)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-eqz v8, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v6, v7

    .line 39
    :goto_0
    if-eqz v6, :cond_1

    .line 40
    .line 41
    return-object v6

    .line 42
    :cond_1
    :try_start_0
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 43
    .line 44
    new-instance v6, Lch/e;

    .line 45
    .line 46
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v8, Lfh/k;

    .line 50
    .line 51
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v9, "private_openUrl"

    .line 55
    .line 56
    const-string v10, "rawUrl"

    .line 57
    .line 58
    const-string v11, "geta8key_open_webview_appid"

    .line 59
    .line 60
    filled-new-array {v9, v10, v11}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v8, v9}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iput-object v8, v6, Lch/e;->h:Lfh/k;

    .line 68
    .line 69
    invoke-virtual {v0, v6}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v6, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    :cond_2
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lhh/o;

    .line 93
    .line 94
    invoke-virtual {v0}, Lhh/o;->t()Z

    .line 95
    .line 96
    .line 97
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 98
    if-eqz v9, :cond_3

    .line 99
    .line 100
    move-object v0, v7

    .line 101
    goto :goto_3

    .line 102
    :cond_3
    :try_start_1
    invoke-virtual {v0, v3}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 103
    .line 104
    .line 105
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    goto :goto_2

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    :try_start_2
    new-instance v9, Lsf/f;

    .line 109
    .line 110
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    move-object v0, v9

    .line 114
    :goto_2
    nop

    .line 115
    instance-of v9, v0, Lsf/f;

    .line 116
    .line 117
    if-eqz v9, :cond_4

    .line 118
    .line 119
    move-object v0, v7

    .line 120
    :cond_4
    check-cast v0, Ljava/lang/reflect/Method;

    .line 121
    .line 122
    :goto_3
    if-eqz v0, :cond_2

    .line 123
    .line 124
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :catchall_1
    move-exception v0

    .line 129
    goto :goto_6

    .line 130
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_7

    .line 144
    .line 145
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    move-object v8, v6

    .line 150
    check-cast v8, Ljava/lang/reflect/Method;

    .line 151
    .line 152
    invoke-static {v8}, Lx6/d;->j(Ljava/lang/reflect/Method;)Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-eqz v8, :cond_6

    .line 157
    .line 158
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_7
    new-instance v3, Ljava/util/HashSet;

    .line 163
    .line 164
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 165
    .line 166
    .line 167
    new-instance v6, Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :cond_8
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    if-eqz v8, :cond_9

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    move-object v9, v8

    .line 187
    check-cast v9, Ljava/lang/reflect/Method;

    .line 188
    .line 189
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-virtual {v3, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-eqz v9, :cond_8

    .line 198
    .line 199
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 200
    .line 201
    .line 202
    goto :goto_5

    .line 203
    :goto_6
    new-instance v6, Lsf/f;

    .line 204
    .line 205
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    :cond_9
    invoke-static {v6}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-nez v0, :cond_a

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_a
    const-string v3, "\u5b9a\u4f4d\u5c0f\u7a0b\u5e8f\u79c1\u6709\u7f51\u9875\u8df3\u8f6c\u65b9\u6cd5\u5931\u8d25"

    .line 216
    .line 217
    invoke-virtual {v1, v3, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 221
    .line 222
    :goto_7
    move-object v8, v6

    .line 223
    check-cast v8, Ljava/util/List;

    .line 224
    .line 225
    invoke-static {v8}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, Ljava/lang/reflect/Method;

    .line 230
    .line 231
    if-eqz v0, :cond_b

    .line 232
    .line 233
    invoke-static {v4, v2, v5, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 234
    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_b
    const-string v3, "cache.key"

    .line 238
    .line 239
    :try_start_3
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    const-string v9, ""

    .line 244
    .line 245
    invoke-interface {v4, v3, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    if-nez v4, :cond_c

    .line 254
    .line 255
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    invoke-interface {v4, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 260
    .line 261
    .line 262
    :cond_c
    invoke-interface {v6, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 267
    .line 268
    .line 269
    :catchall_2
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    const/4 v3, 0x1

    .line 274
    if-le v2, v3, :cond_d

    .line 275
    .line 276
    new-instance v12, Le9/h;

    .line 277
    .line 278
    const/4 v2, 0x4

    .line 279
    invoke-direct {v12, v2}, Le9/h;-><init>(I)V

    .line 280
    .line 281
    .line 282
    const/16 v13, 0x1f

    .line 283
    .line 284
    const/4 v9, 0x0

    .line 285
    const/4 v10, 0x0

    .line 286
    const/4 v11, 0x0

    .line 287
    invoke-static/range {v8 .. v13}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    const-string v3, "\u5c0f\u7a0b\u5e8f\u79c1\u6709\u7f51\u9875\u8df3\u8f6c\u65b9\u6cd5\u5019\u9009\u4e0d\u552f\u4e00: "

    .line 292
    .line 293
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-virtual {v1, v2, v7}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    :cond_d
    :goto_8
    return-object v0
.end method

.method public f(Z)Ljava/util/List;
    .locals 11

    .line 1
    iget-object v0, p0, Lea/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iget-object v1, p0, Lea/c;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lr8/g;

    .line 8
    .line 9
    iget-object v2, v1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v2, v2, Ll8/i;->h:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v5, 0x0

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v2, v5

    .line 31
    :goto_0
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const-string v4, "|fake_scan_camera_v5_eq_qbar_only"

    .line 34
    .line 35
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object v2, v5

    .line 41
    :goto_1
    const-string v4, ""

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    move-object v2, v4

    .line 46
    :cond_2
    const-string v6, "qbar_string_handler_methods"

    .line 47
    .line 48
    invoke-static {v0, v2, v3, v6}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    new-instance v8, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    :cond_3
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-eqz v9, :cond_4

    .line 66
    .line 67
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    move-object v10, v9

    .line 72
    check-cast v10, Ljava/lang/reflect/Method;

    .line 73
    .line 74
    invoke-static {v10}, Lea/c;->c(Ljava/lang/reflect/Method;)Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-eqz v10, :cond_3

    .line 79
    .line 80
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-nez v7, :cond_5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    move-object v8, v5

    .line 92
    :goto_3
    if-eqz v8, :cond_6

    .line 93
    .line 94
    return-object v8

    .line 95
    :cond_6
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 96
    .line 97
    if-nez p1, :cond_7

    .line 98
    .line 99
    return-object v7

    .line 100
    :cond_7
    const-string p1, "MicroMsg.QBarStringHandler"

    .line 101
    .line 102
    const-string v8, "key_offline_scan_show_tips"

    .line 103
    .line 104
    filled-new-array {p1, v8}, [Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :try_start_0
    iget-object v1, v1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 109
    .line 110
    new-instance v8, Lch/e;

    .line 111
    .line 112
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    new-instance v9, Lfh/k;

    .line 116
    .line 117
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 118
    .line 119
    .line 120
    const/4 v10, 0x2

    .line 121
    invoke-static {p1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    check-cast v10, [Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v9, v10}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iput-object v9, v8, Lch/e;->h:Lfh/k;

    .line 131
    .line 132
    invoke-virtual {v1, v8}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    new-instance v8, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    if-eqz v9, :cond_8

    .line 150
    .line 151
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    check-cast v9, Lhh/o;

    .line 156
    .line 157
    invoke-virtual {v9, v3}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :catchall_0
    move-exception v1

    .line 166
    new-instance v8, Lsf/f;

    .line 167
    .line 168
    invoke-direct {v8, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    :cond_8
    invoke-static {v8}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    if-nez v1, :cond_9

    .line 176
    .line 177
    move-object v7, v8

    .line 178
    goto :goto_5

    .line 179
    :cond_9
    const/16 v3, 0x3f

    .line 180
    .line 181
    invoke-static {p1, v5, v3}, Ltf/l;->F0([Ljava/lang/Object;Lfg/l;I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    const-string v5, "[Hchat:FakeScanCamera] \u7cbe\u786e\u5b9a\u4f4d QBarStringHandler \u5931\u8d25("

    .line 190
    .line 191
    const-string v8, "): "

    .line 192
    .line 193
    invoke-static {v5, p1, v8, v3, v1}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    :goto_5
    check-cast v7, Ljava/util/List;

    .line 197
    .line 198
    new-instance p1, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    :cond_a
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_b

    .line 212
    .line 213
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    move-object v5, v3

    .line 218
    check-cast v5, Ljava/lang/reflect/Method;

    .line 219
    .line 220
    invoke-static {v5}, Lea/c;->c(Ljava/lang/reflect/Method;)Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_a

    .line 225
    .line 226
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_b
    new-instance v1, Ljava/util/HashSet;

    .line 231
    .line 232
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 233
    .line 234
    .line 235
    new-instance v3, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    :cond_c
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    if-eqz v5, :cond_d

    .line 249
    .line 250
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    move-object v7, v5

    .line 255
    check-cast v7, Ljava/lang/reflect/Method;

    .line 256
    .line 257
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-eqz v7, :cond_c

    .line 266
    .line 267
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_d
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-nez p1, :cond_e

    .line 276
    .line 277
    sget-object p1, Le8/b;->a:Le8/b;

    .line 278
    .line 279
    invoke-virtual {p1, v0, v2, v6, v3}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 280
    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_e
    const-string p1, "cache.key"

    .line 284
    .line 285
    :try_start_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-interface {v0, p1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-nez v0, :cond_f

    .line 298
    .line 299
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-interface {v0, p1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 304
    .line 305
    .line 306
    :cond_f
    invoke-interface {v1, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 311
    .line 312
    .line 313
    :catchall_1
    :goto_8
    return-object v3
.end method

.method public g()Ljava/lang/reflect/Method;
    .locals 15

    .line 1
    iget-object v0, p0, Lea/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lia/t;

    .line 5
    .line 6
    iget-object v0, p0, Lea/c;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr8/g;

    .line 9
    .line 10
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v3, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v2, v2, Ll8/i;->h:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v4, p0, Lea/c;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Landroid/content/SharedPreferences;

    .line 26
    .line 27
    const-string v5, "recorder_duration"

    .line 28
    .line 29
    invoke-static {v4, v2, v3, v5}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-nez v9, :cond_0

    .line 43
    .line 44
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    if-nez v9, :cond_0

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    invoke-static {v9, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    if-eqz v9, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move-object v6, v8

    .line 62
    :goto_0
    if-eqz v6, :cond_1

    .line 63
    .line 64
    return-object v6

    .line 65
    :cond_1
    const/4 v6, 0x1

    .line 66
    :try_start_0
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 67
    .line 68
    new-instance v9, Lch/e;

    .line 69
    .line 70
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v10, Lfh/k;

    .line 74
    .line 75
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v11, "MicroMsg.SceneVoice.Recorder"

    .line 79
    .line 80
    const-string v12, "Stop file success: "

    .line 81
    .line 82
    filled-new-array {v11, v12}, [Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    invoke-virtual {v10, v11}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object v10, v9, Lch/e;->h:Lfh/k;

    .line 90
    .line 91
    invoke-virtual {v0, v9}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v9, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    :cond_2
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 115
    .line 116
    :try_start_1
    invoke-virtual {v0, v3}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    goto :goto_2

    .line 125
    :catchall_0
    move-exception v0

    .line 126
    :try_start_2
    new-instance v11, Lsf/f;

    .line 127
    .line 128
    invoke-direct {v11, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    move-object v0, v11

    .line 132
    :goto_2
    nop

    .line 133
    instance-of v11, v0, Lsf/f;

    .line 134
    .line 135
    if-eqz v11, :cond_3

    .line 136
    .line 137
    move-object v0, v8

    .line 138
    :cond_3
    check-cast v0, Ljava/lang/Class;

    .line 139
    .line 140
    if-eqz v0, :cond_2

    .line 141
    .line 142
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :catchall_1
    move-exception v0

    .line 147
    goto/16 :goto_8

    .line 148
    .line 149
    :cond_4
    new-instance v0, Ljava/util/HashSet;

    .line 150
    .line 151
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 152
    .line 153
    .line 154
    new-instance v3, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    :cond_5
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-eqz v10, :cond_6

    .line 168
    .line 169
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    move-object v11, v10

    .line 174
    check-cast v11, Ljava/lang/Class;

    .line 175
    .line 176
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    invoke-virtual {v0, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    if-eqz v11, :cond_5

    .line 185
    .line 186
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    if-eqz v9, :cond_7

    .line 204
    .line 205
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    check-cast v9, Ljava/lang/Class;

    .line 210
    .line 211
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-static {v0, v9}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_7
    new-instance v3, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    :cond_8
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    if-eqz v9, :cond_a

    .line 233
    .line 234
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    move-object v10, v9

    .line 239
    check-cast v10, Ljava/lang/reflect/Method;

    .line 240
    .line 241
    invoke-static {v10}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    if-nez v11, :cond_9

    .line 246
    .line 247
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    if-nez v11, :cond_9

    .line 252
    .line 253
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    invoke-static {v10, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v10

    .line 261
    if-eqz v10, :cond_9

    .line 262
    .line 263
    move v10, v6

    .line 264
    goto :goto_6

    .line 265
    :cond_9
    const/4 v10, 0x0

    .line 266
    :goto_6
    if-eqz v10, :cond_8

    .line 267
    .line 268
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_a
    new-instance v0, Ljava/util/HashSet;

    .line 273
    .line 274
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 275
    .line 276
    .line 277
    new-instance v7, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    :cond_b
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    if-eqz v9, :cond_c

    .line 291
    .line 292
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    move-object v10, v9

    .line 297
    check-cast v10, Ljava/lang/reflect/Method;

    .line 298
    .line 299
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    invoke-virtual {v0, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    if-eqz v10, :cond_b

    .line 308
    .line 309
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 310
    .line 311
    .line 312
    goto :goto_7

    .line 313
    :goto_8
    new-instance v7, Lsf/f;

    .line 314
    .line 315
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    :cond_c
    invoke-static {v7}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    if-nez v0, :cond_d

    .line 323
    .line 324
    goto :goto_9

    .line 325
    :cond_d
    const-string v3, "\u4f2a\u9020\u8bed\u97f3\u65f6\u957f\u5b9a\u4f4d\u5f55\u97f3\u5668\u5931\u8d25"

    .line 326
    .line 327
    invoke-virtual {v1, v3, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 331
    .line 332
    :goto_9
    move-object v9, v7

    .line 333
    check-cast v9, Ljava/util/List;

    .line 334
    .line 335
    invoke-static {v9}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    check-cast v0, Ljava/lang/reflect/Method;

    .line 340
    .line 341
    if-eqz v0, :cond_e

    .line 342
    .line 343
    invoke-static {v4, v2, v5, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 344
    .line 345
    .line 346
    goto :goto_a

    .line 347
    :cond_e
    const-string v3, "cache.key"

    .line 348
    .line 349
    :try_start_3
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    const-string v10, ""

    .line 354
    .line 355
    invoke-interface {v4, v3, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-nez v4, :cond_f

    .line 364
    .line 365
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    invoke-interface {v4, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 370
    .line 371
    .line 372
    :cond_f
    invoke-interface {v7, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 377
    .line 378
    .line 379
    :catchall_2
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    if-le v2, v6, :cond_10

    .line 384
    .line 385
    new-instance v13, Li2/z;

    .line 386
    .line 387
    const/16 v2, 0xc

    .line 388
    .line 389
    invoke-direct {v13, v2}, Li2/z;-><init>(I)V

    .line 390
    .line 391
    .line 392
    const/16 v14, 0x1f

    .line 393
    .line 394
    const/4 v10, 0x0

    .line 395
    const/4 v11, 0x0

    .line 396
    const/4 v12, 0x0

    .line 397
    invoke-static/range {v9 .. v14}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    const-string v3, "\u4f2a\u9020\u8bed\u97f3\u65f6\u957f\u5f55\u97f3\u957f\u5ea6\u65b9\u6cd5\u5019\u9009\u4e0d\u552f\u4e00: "

    .line 402
    .line 403
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-virtual {v1, v2, v8}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    :cond_10
    :goto_a
    return-object v0
.end method

.method public h()Ljava/lang/reflect/Method;
    .locals 14

    .line 1
    iget-object v0, p0, Lea/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lab/b;

    .line 5
    .line 6
    iget-object v0, p0, Lea/c;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr8/g;

    .line 9
    .line 10
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v3, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    invoke-static {v2, v3}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v4, p0, Lea/c;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Landroid/content/SharedPreferences;

    .line 21
    .line 22
    const-string v5, "splash_ad_check_method"

    .line 23
    .line 24
    invoke-static {v4, v2, v3, v5}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const/4 v7, 0x0

    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    invoke-static {v6}, Lf8/i;->b(Ljava/lang/reflect/Method;)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-eqz v8, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v6, v7

    .line 39
    :goto_0
    if-eqz v6, :cond_1

    .line 40
    .line 41
    return-object v6

    .line 42
    :cond_1
    :try_start_0
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 43
    .line 44
    new-instance v6, Lch/e;

    .line 45
    .line 46
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v8, Lfh/k;

    .line 50
    .line 51
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v9, "MicroMsg.AppBrandAdUtils[AppBrandSplashAd]"

    .line 55
    .line 56
    const-string v10, "isAdContact, appId:%s, canShowAd:%s"

    .line 57
    .line 58
    filled-new-array {v9, v10}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-virtual {v8, v9}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iput-object v8, v6, Lch/e;->h:Lfh/k;

    .line 66
    .line 67
    invoke-virtual {v0, v6}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v6, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    :cond_2
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lhh/o;

    .line 91
    .line 92
    invoke-virtual {v0}, Lhh/o;->t()Z

    .line 93
    .line 94
    .line 95
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 96
    if-eqz v9, :cond_3

    .line 97
    .line 98
    move-object v0, v7

    .line 99
    goto :goto_3

    .line 100
    :cond_3
    :try_start_1
    invoke-virtual {v0, v3}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    goto :goto_2

    .line 105
    :catchall_0
    move-exception v0

    .line 106
    :try_start_2
    new-instance v9, Lsf/f;

    .line 107
    .line 108
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    move-object v0, v9

    .line 112
    :goto_2
    nop

    .line 113
    instance-of v9, v0, Lsf/f;

    .line 114
    .line 115
    if-eqz v9, :cond_4

    .line 116
    .line 117
    move-object v0, v7

    .line 118
    :cond_4
    check-cast v0, Ljava/lang/reflect/Method;

    .line 119
    .line 120
    :goto_3
    if-eqz v0, :cond_2

    .line 121
    .line 122
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :catchall_1
    move-exception v0

    .line 127
    goto :goto_6

    .line 128
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v6, :cond_7

    .line 142
    .line 143
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    move-object v8, v6

    .line 148
    check-cast v8, Ljava/lang/reflect/Method;

    .line 149
    .line 150
    invoke-static {v8}, Lf8/i;->b(Ljava/lang/reflect/Method;)Z

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    if-eqz v8, :cond_6

    .line 155
    .line 156
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_7
    new-instance v3, Ljava/util/HashSet;

    .line 161
    .line 162
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 163
    .line 164
    .line 165
    new-instance v6, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    :cond_8
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-eqz v8, :cond_9

    .line 179
    .line 180
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    move-object v9, v8

    .line 185
    check-cast v9, Ljava/lang/reflect/Method;

    .line 186
    .line 187
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-virtual {v3, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    if-eqz v9, :cond_8

    .line 196
    .line 197
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :goto_6
    new-instance v6, Lsf/f;

    .line 202
    .line 203
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    :cond_9
    invoke-static {v6}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-nez v0, :cond_a

    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_a
    const-string v3, "\u5b9a\u4f4d\u5c0f\u7a0b\u5e8f\u5f00\u5c4f\u5e7f\u544a\u8d44\u683c\u65b9\u6cd5\u5931\u8d25"

    .line 214
    .line 215
    invoke-virtual {v1, v3, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 219
    .line 220
    :goto_7
    move-object v8, v6

    .line 221
    check-cast v8, Ljava/util/List;

    .line 222
    .line 223
    invoke-static {v8}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Ljava/lang/reflect/Method;

    .line 228
    .line 229
    if-eqz v0, :cond_b

    .line 230
    .line 231
    invoke-static {v4, v2, v5, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 232
    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_b
    const-string v3, "cache.key"

    .line 236
    .line 237
    :try_start_3
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    const-string v9, ""

    .line 242
    .line 243
    invoke-interface {v4, v3, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-nez v4, :cond_c

    .line 252
    .line 253
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-interface {v4, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 258
    .line 259
    .line 260
    :cond_c
    invoke-interface {v6, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 265
    .line 266
    .line 267
    :catchall_2
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    const/4 v3, 0x1

    .line 272
    if-le v2, v3, :cond_d

    .line 273
    .line 274
    new-instance v12, Le9/h;

    .line 275
    .line 276
    const/16 v2, 0x17

    .line 277
    .line 278
    invoke-direct {v12, v2}, Le9/h;-><init>(I)V

    .line 279
    .line 280
    .line 281
    const/16 v13, 0x1f

    .line 282
    .line 283
    const/4 v9, 0x0

    .line 284
    const/4 v10, 0x0

    .line 285
    const/4 v11, 0x0

    .line 286
    invoke-static/range {v8 .. v13}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    const-string v3, "\u5c0f\u7a0b\u5e8f\u5f00\u5c4f\u5e7f\u544a\u8d44\u683c\u65b9\u6cd5\u5019\u9009\u4e0d\u552f\u4e00: "

    .line 291
    .line 292
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-virtual {v1, v2, v7}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    :cond_d
    :goto_8
    return-object v0
.end method
