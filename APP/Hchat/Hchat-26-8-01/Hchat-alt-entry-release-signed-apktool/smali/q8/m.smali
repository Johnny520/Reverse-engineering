.class public final Lq8/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lh/Hchat/dexkit/DexFinder;

.field public final b:Lq8/o;

.field public final c:Lq8/q;

.field public final d:Lq8/i;

.field public final e:Lg8/i;

.field public final f:Lg1/d;

.field public final g:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public volatile h:Z

.field public volatile i:I

.field public volatile j:Ljava/lang/String;

.field public volatile k:Ljava/lang/String;

.field public volatile l:J


# direct methods
.method public constructor <init>(Lh/Hchat/dexkit/DexFinder;Lq8/o;Lq8/q;Lq8/i;Lg8/i;Lg1/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lq8/m;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    iput-object v0, p0, Lq8/m;->j:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lq8/m;->k:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p1, p0, Lq8/m;->a:Lh/Hchat/dexkit/DexFinder;

    .line 18
    .line 19
    iput-object p2, p0, Lq8/m;->b:Lq8/o;

    .line 20
    .line 21
    iput-object p3, p0, Lq8/m;->c:Lq8/q;

    .line 22
    .line 23
    iput-object p4, p0, Lq8/m;->d:Lq8/i;

    .line 24
    .line 25
    iput-object p5, p0, Lq8/m;->e:Lg8/i;

    .line 26
    .line 27
    iput-object p6, p0, Lq8/m;->f:Lg1/d;

    .line 28
    .line 29
    return-void
.end method

.method public static f(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "#"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static g(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    const-string v0, "Chat_User"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    return-object p0

    .line 17
    :catchall_0
    :cond_1
    :goto_0
    const-string p0, ""

    .line 18
    .line 19
    return-object p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lq8/m;->b:Lq8/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "com.tencent.mm.ui.chatting.ChattingUI"

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    const-string v2, ".ui.chatting."

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    :cond_2
    if-nez v0, :cond_3

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    :try_start_0
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lq8/m;->g(Landroid/content/Intent;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    :goto_1
    const-string v0, ""

    .line 51
    .line 52
    :goto_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_4

    .line 57
    .line 58
    iput-object v0, p0, Lq8/m;->j:Ljava/lang/String;

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_4
    :goto_3
    iget-object v0, p0, Lq8/m;->j:Ljava/lang/String;

    .line 62
    .line 63
    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lq8/m;->e:Lg8/i;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const-string v0, ""

    .line 18
    .line 19
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    :goto_1
    iget-object v0, p0, Lq8/m;->e:Lg8/i;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-static {p2}, Lg8/i;->I(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    :cond_2
    iget-object p2, p0, Lq8/m;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_6

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lk9/b;

    .line 47
    .line 48
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v0, Lk9/r;->a:Lk9/r;

    .line 52
    .line 53
    const-string v0, "enter"

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    sput-boolean v0, Lk9/r;->f:Z

    .line 60
    .line 61
    sget-boolean v1, Lk9/r;->e:Z

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    sget-object v1, Lk9/r;->c:Landroid/content/SharedPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    const-string v2, "home"

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    :try_start_1
    const-string v3, "scope"

    .line 72
    .line 73
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    move-object v1, v2

    .line 81
    :goto_3
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_5

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    new-instance v1, Lk9/q;

    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    invoke-direct {v1, v2, v0}, Lk9/q;-><init>(IZ)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Lk9/r;->p(Lfg/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v2, "\u804a\u5929\u9875\u56de\u8c03\u5931\u8d25: "

    .line 102
    .line 103
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p0, v0}, Lq8/m;->e(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Lq8/m;->j:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-wide v2, p0, Lq8/m;->l:J

    .line 21
    .line 22
    sub-long v2, v0, v2

    .line 23
    .line 24
    const-wide/16 v4, 0x1f4

    .line 25
    .line 26
    cmp-long v2, v2, v4

    .line 27
    .line 28
    if-gez v2, :cond_1

    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :cond_1
    iput-object p1, p0, Lq8/m;->j:Ljava/lang/String;

    .line 32
    .line 33
    iput-wide v0, p0, Lq8/m;->l:J

    .line 34
    .line 35
    const-string v0, "enter"

    .line 36
    .line 37
    invoke-virtual {p0, v0, p1}, Lq8/m;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final d()I
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lq8/m;->a:Lh/Hchat/dexkit/DexFinder;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Lh/Hchat/dexkit/DexFinder;->resolveChatPageApi()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v2

    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "\u804a\u5929\u9875Dex\u89e3\u6790\u5931\u8d25: "

    .line 15
    .line 16
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {p0, v2}, Lq8/m;->e(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v2, v1, Lh/Hchat/dexkit/DexFinder;->chatPageStartMethod:Ljava/lang/reflect/Method;

    .line 34
    .line 35
    const-string v3, "\u804a\u5929\u9875\u542f\u52a8\u65b9\u6cd5Hook: "

    .line 36
    .line 37
    const-string v4, " "

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    :goto_1
    move v2, v0

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    :try_start_1
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    sget-object v6, Lr8/i;->b:Lr8/i;

    .line 48
    .line 49
    new-instance v7, Lq8/l;

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    invoke-direct {v7, p0, v2, v8}, Lq8/l;-><init>(Lq8/m;Ljava/lang/reflect/Method;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v2, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 56
    .line 57
    .line 58
    invoke-static {v2}, Lq8/m;->f(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {p0, v3}, Lq8/m;->e(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    .line 68
    .line 69
    move v2, v5

    .line 70
    goto :goto_2

    .line 71
    :catchall_1
    move-exception v3

    .line 72
    new-instance v6, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v7, "\u804a\u5929\u9875\u542f\u52a8\u65b9\u6cd5Hook\u5931\u8d25: "

    .line 75
    .line 76
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v2}, Lq8/m;->f(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {p0, v2}, Lq8/m;->e(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :goto_2
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->chatPageFragmentEnterMethod:Ljava/lang/reflect/Method;

    .line 105
    .line 106
    const-string v6, "\u804a\u5929\u9875Fragment\u8fdb\u5165\u65b9\u6cd5Hook: "

    .line 107
    .line 108
    if-nez v3, :cond_2

    .line 109
    .line 110
    :goto_3
    move v3, v0

    .line 111
    goto :goto_4

    .line 112
    :cond_2
    :try_start_2
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 113
    .line 114
    .line 115
    sget-object v7, Lr8/i;->b:Lr8/i;

    .line 116
    .line 117
    new-instance v8, Lq8/l;

    .line 118
    .line 119
    const/4 v9, 0x1

    .line 120
    invoke-direct {v8, p0, v3, v9}, Lq8/l;-><init>(Lq8/m;Ljava/lang/reflect/Method;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v3, v8}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 124
    .line 125
    .line 126
    invoke-static {v3}, Lq8/m;->f(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {p0, v6}, Lq8/m;->e(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 135
    .line 136
    .line 137
    move v3, v5

    .line 138
    goto :goto_4

    .line 139
    :catchall_2
    move-exception v6

    .line 140
    new-instance v7, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-string v8, "\u804a\u5929\u9875Fragment\u8fdb\u5165\u65b9\u6cd5Hook\u5931\u8d25: "

    .line 143
    .line 144
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v3}, Lq8/m;->f(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {p0, v3}, Lq8/m;->e(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :goto_4
    add-int/2addr v2, v3

    .line 173
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->chatPageFragmentExitMethod:Ljava/lang/reflect/Method;

    .line 174
    .line 175
    const-string v3, "\u804a\u5929\u9875Fragment\u9000\u51fa\u65b9\u6cd5Hook: "

    .line 176
    .line 177
    if-nez v1, :cond_3

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_3
    :try_start_3
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 181
    .line 182
    .line 183
    sget-object v6, Lr8/i;->b:Lr8/i;

    .line 184
    .line 185
    new-instance v7, Lq8/l;

    .line 186
    .line 187
    const/4 v8, 0x2

    .line 188
    invoke-direct {v7, p0, v1, v8}, Lq8/l;-><init>(Lq8/m;Ljava/lang/reflect/Method;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v6, v1, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 192
    .line 193
    .line 194
    invoke-static {v1}, Lq8/m;->f(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {p0, v3}, Lq8/m;->e(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 203
    .line 204
    .line 205
    move v0, v5

    .line 206
    goto :goto_5

    .line 207
    :catchall_3
    move-exception v3

    .line 208
    new-instance v5, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string v6, "\u804a\u5929\u9875Fragment\u9000\u51fa\u65b9\u6cd5Hook\u5931\u8d25: "

    .line 211
    .line 212
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v1}, Lq8/m;->f(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {p0, v1}, Lq8/m;->e(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :goto_5
    add-int/2addr v2, v0

    .line 240
    return v2
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/m;->f:Lg1/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "[WeChatChatPageApi] "

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
