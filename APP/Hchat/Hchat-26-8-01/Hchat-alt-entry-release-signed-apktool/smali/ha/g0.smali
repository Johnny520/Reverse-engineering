.class public final Lha/g0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Landroid/content/SharedPreferences;

.field public volatile d:Z

.field public volatile e:Z

.field public volatile f:Ljava/lang/reflect/Method;


# direct methods
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
    iput-object p1, p0, Lha/g0;->a:Lr8/g;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string v0, "Hchat_original_moments_upload_config"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lha/g0;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    const-string v0, "Hchat_original_moments_upload_method_cache"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lha/g0;->c:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    return-void
.end method

.method public static c(Ljava/lang/reflect/Method;)Z
    .locals 4

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
    move-result-object v1

    .line 9
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v1, "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI"

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    array-length p0, v0

    .line 35
    const/4 v1, 0x3

    .line 36
    if-ne p0, v1, :cond_0

    .line 37
    .line 38
    aget-object p0, v0, v2

    .line 39
    .line 40
    const-class v1, Landroid/content/Intent;

    .line 41
    .line 42
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    aget-object v1, v0, p0

    .line 50
    .line 51
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    aget-object v0, v0, v1

    .line 61
    .line 62
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    return p0

    .line 69
    :cond_0
    return v2
.end method

.method public static d(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    const-string v1, "com.tencent.mm.plugin.sns.storage."

    .line 29
    .line 30
    invoke-static {p0, v2, v1}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    array-length p0, v0

    .line 37
    const/4 v1, 0x2

    .line 38
    if-ne p0, v1, :cond_0

    .line 39
    .line 40
    aget-object p0, v0, v2

    .line 41
    .line 42
    const-class v1, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    aget-object v0, v0, p0

    .line 52
    .line 53
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    return p0

    .line 60
    :cond_0
    return v2
.end method

.method public static e(Ljava/lang/reflect/Method;)Z
    .locals 5

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
    move-result-object v1

    .line 9
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const-string v1, "com.tencent.mm.plugin.sns.storage."

    .line 19
    .line 20
    invoke-static {p0, v3, v1}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    array-length p0, v0

    .line 27
    const/4 v1, 0x4

    .line 28
    if-lt p0, v1, :cond_0

    .line 29
    .line 30
    aget-object p0, v0, v3

    .line 31
    .line 32
    const-class v1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    aget-object v4, v0, p0

    .line 42
    .line 43
    invoke-static {v4, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    aget-object v4, v0, v4

    .line 51
    .line 52
    invoke-static {v4, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    const/4 v1, 0x3

    .line 59
    aget-object v0, v0, v1

    .line 60
    .line 61
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    return p0

    .line 68
    :cond_0
    return v3
.end method


# virtual methods
.method public final varargs a([Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, Lha/g0;->a:Lr8/g;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    new-instance v2, Lch/e;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lfh/k;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    array-length v4, p1

    .line 16
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, [Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v3, v2, Lch/e;->h:Lfh/k;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lhh/o;

    .line 51
    .line 52
    iget-object v4, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    new-instance v2, Lsf/f;

    .line 64
    .line 65
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/4 v1, 0x0

    .line 76
    const/16 v2, 0x3f

    .line 77
    .line 78
    invoke-static {p1, v1, v2}, Ltf/l;->F0([Ljava/lang/Object;Lfg/l;I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-string v2, "[Hchat:OriginalMomentsUpload] DexKit \u7cbe\u786e\u5b9a\u4f4d\u5931\u8d25("

    .line 87
    .line 88
    const-string v3, "): "

    .line 89
    .line 90
    invoke-static {v2, p1, v3, v1, v0}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 94
    .line 95
    :goto_1
    check-cast v2, Ljava/util/List;

    .line 96
    .line 97
    return-object v2
.end method

.method public final declared-synchronized b(Z)Z
    .locals 7

    .line 1
    const-string v0, "[Hchat:OriginalMomentsUpload] \u5b89\u88c5\u670b\u53cb\u5708\u56fe\u7247\u538b\u7f29 Hook \u5931\u8d25: "

    .line 2
    .line 3
    const-string v1, "[Hchat:OriginalMomentsUpload] \u5b89\u88c5\u56fe\u5e93\u8fd4\u56de Hook \u5931\u8d25: "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    invoke-virtual {p0, p1}, Lha/g0;->g(Z)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iput-object v2, p0, Lha/g0;->f:Ljava/lang/reflect/Method;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_4

    .line 17
    :cond_0
    :goto_0
    iget-boolean v2, p0, Lha/g0;->d:Z

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lha/g0;->f(Z)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    :try_start_1
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 29
    .line 30
    new-instance v5, Lha/f0;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-direct {v5, p0, v6}, Lha/f0;-><init>(Lha/g0;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v2, v5}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 37
    .line 38
    .line 39
    iput-boolean v3, p0, Lha/g0;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_1
    move-exception v2

    .line 43
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v5, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1, v2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_1
    iget-boolean v1, p0, Lha/g0;->e:Z

    .line 63
    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lha/g0;->h(Z)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    :try_start_3
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 73
    .line 74
    new-instance v2, Lha/f0;

    .line 75
    .line 76
    const/4 v4, 0x1

    .line 77
    invoke-direct {v2, p0, v4}, Lha/f0;-><init>(Lha/g0;I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, p1, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 81
    .line 82
    .line 83
    iput-boolean v3, p0, Lha/g0;->e:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :catchall_2
    move-exception p1

    .line 87
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0, p1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    :goto_2
    iget-boolean p1, p0, Lha/g0;->d:Z

    .line 107
    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    iget-boolean p1, p0, Lha/g0;->e:Z

    .line 111
    .line 112
    if-eqz p1, :cond_3

    .line 113
    .line 114
    iget-object p1, p0, Lha/g0;->f:Ljava/lang/reflect/Method;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 115
    .line 116
    if-eqz p1, :cond_3

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_3
    const/4 v3, 0x0

    .line 120
    :goto_3
    monitor-exit p0

    .line 121
    return v3

    .line 122
    :goto_4
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 123
    throw p1
.end method

.method public final f(Z)Ljava/lang/reflect/Method;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lha/g0;->i()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/g0;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v2, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v3, p0, Lha/g0;->c:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v4, "image_preview_send"

    .line 12
    .line 13
    invoke-static {v3, v0, v2, v4}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-static {v2}, Lha/g0;->c(Ljava/lang/reflect/Method;)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v2, v5

    .line 28
    :goto_0
    if-eqz v2, :cond_1

    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_1
    if-nez p1, :cond_2

    .line 32
    .line 33
    return-object v5

    .line 34
    :cond_2
    const-string p1, "CropImage_OutputPath_List"

    .line 35
    .line 36
    const-string v2, "key_select_video_list"

    .line 37
    .line 38
    filled-new-array {p1, v2}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :try_start_0
    iget-object v2, v1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 43
    .line 44
    new-instance v6, Lch/e;

    .line 45
    .line 46
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v7, Lfh/k;

    .line 50
    .line 51
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-static {v7, v8}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 59
    .line 60
    .line 61
    iput-object v7, v6, Lch/e;->h:Lfh/k;

    .line 62
    .line 63
    invoke-virtual {v2, v6}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    new-instance v6, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_3

    .line 81
    .line 82
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, Lhh/o;

    .line 87
    .line 88
    iget-object v8, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 89
    .line 90
    invoke-virtual {v7, v8}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception v1

    .line 99
    new-instance v6, Lsf/f;

    .line 100
    .line 101
    invoke-direct {v6, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    invoke-static {v6}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-nez v1, :cond_4

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    const/16 v2, 0x3f

    .line 112
    .line 113
    invoke-static {p1, v5, v2}, Ltf/l;->F0([Ljava/lang/Object;Lfg/l;I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    const-string v6, "[Hchat:OriginalMomentsUpload] DexKit \u5b9a\u4f4d\u5931\u8d25("

    .line 122
    .line 123
    const-string v7, "): "

    .line 124
    .line 125
    invoke-static {v6, p1, v7, v2, v1}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 129
    .line 130
    :goto_2
    check-cast v6, Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_6

    .line 141
    .line 142
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    move-object v2, v1

    .line 147
    check-cast v2, Ljava/lang/reflect/Method;

    .line 148
    .line 149
    invoke-static {v2}, Lha/g0;->c(Ljava/lang/reflect/Method;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_5

    .line 154
    .line 155
    move-object v5, v1

    .line 156
    :cond_6
    check-cast v5, Ljava/lang/reflect/Method;

    .line 157
    .line 158
    if-eqz v5, :cond_7

    .line 159
    .line 160
    invoke-static {v3, v0, v4, v5}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_7
    const-string p1, "cache.key"

    .line 165
    .line 166
    :try_start_1
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    const-string v2, ""

    .line 171
    .line 172
    invoke-interface {v3, p1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-static {v2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-nez v2, :cond_8

    .line 181
    .line 182
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-interface {v2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 187
    .line 188
    .line 189
    :cond_8
    invoke-interface {v1, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 194
    .line 195
    .line 196
    :catchall_1
    :goto_3
    return-object v5
.end method

.method public final g(Z)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lha/g0;->i()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/g0;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lha/g0;->c:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "sns_convert_img_without_zip"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {v1}, Lha/g0;->d(Ljava/lang/reflect/Method;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v4

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    if-nez p1, :cond_2

    .line 32
    .line 33
    return-object v4

    .line 34
    :cond_2
    const-string p1, "MicroMsg.snsMediaStorage"

    .line 35
    .line 36
    const-string v1, "convertImg2WxamWithoutZip origPath:%s OutOfMemoryError! rollback"

    .line 37
    .line 38
    filled-new-array {p1, v1}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Lha/g0;->a([Ljava/lang/String;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v5, v1

    .line 61
    check-cast v5, Ljava/lang/reflect/Method;

    .line 62
    .line 63
    invoke-static {v5}, Lha/g0;->d(Ljava/lang/reflect/Method;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    move-object v4, v1

    .line 70
    :cond_4
    check-cast v4, Ljava/lang/reflect/Method;

    .line 71
    .line 72
    if-eqz v4, :cond_5

    .line 73
    .line 74
    invoke-static {v2, v0, v3, v4}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 75
    .line 76
    .line 77
    return-object v4

    .line 78
    :cond_5
    const-string p1, "cache.key"

    .line 79
    .line 80
    :try_start_0
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v5, ""

    .line 85
    .line 86
    invoke-interface {v2, p1, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-static {v2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_6

    .line 95
    .line 96
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-interface {v2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 101
    .line 102
    .line 103
    :cond_6
    invoke-interface {v1, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    :catchall_0
    return-object v4
.end method

.method public final h(Z)Ljava/lang/reflect/Method;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lha/g0;->i()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/g0;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lha/g0;->c:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "sns_create_pic"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {v1}, Lha/g0;->e(Ljava/lang/reflect/Method;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v4

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    if-nez p1, :cond_2

    .line 32
    .line 33
    return-object v4

    .line 34
    :cond_2
    const-string p1, "SnsCompressResolutionFor4G"

    .line 35
    .line 36
    const-string v1, "SnsCompressResolutionForWifi"

    .line 37
    .line 38
    const-string v5, "MicroMsg.snsMediaStorage"

    .line 39
    .line 40
    const-string v6, "SnsCompressResolutionFor2G"

    .line 41
    .line 42
    const-string v7, "SnsCompressResolutionFor3G"

    .line 43
    .line 44
    filled-new-array {v5, v6, v7, p1, v1}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Lha/g0;->a([Ljava/lang/String;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    move-object v5, v1

    .line 67
    check-cast v5, Ljava/lang/reflect/Method;

    .line 68
    .line 69
    invoke-static {v5}, Lha/g0;->e(Ljava/lang/reflect/Method;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    move-object v4, v1

    .line 76
    :cond_4
    check-cast v4, Ljava/lang/reflect/Method;

    .line 77
    .line 78
    if-eqz v4, :cond_5

    .line 79
    .line 80
    invoke-static {v2, v0, v3, v4}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 81
    .line 82
    .line 83
    return-object v4

    .line 84
    :cond_5
    const-string p1, "cache.key"

    .line 85
    .line 86
    :try_start_0
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v5, ""

    .line 91
    .line 92
    invoke-interface {v2, p1, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {v2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_6

    .line 101
    .line 102
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-interface {v2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 107
    .line 108
    .line 109
    :cond_6
    invoke-interface {v1, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    .line 116
    :catchall_0
    return-object v4
.end method

.method public final i()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lha/g0;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Ll8/i;->h:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, v2

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const-string v1, "|original_moments_upload_v2"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :cond_1
    if-nez v2, :cond_2

    .line 34
    .line 35
    const-string v0, ""

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    return-object v2
.end method
