.class public final Lkb/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final e:La2/a;

.field public static volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La2/a;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, La2/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkb/a;->e:La2/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "status_text_limit"

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
    const-string v0, "\u5141\u8bb8\u4e2a\u4eba\u72b6\u6001\u8bcd\u8d85\u8fc7 10 \u4e2a\u5b57"

    .line 7
    .line 8
    const-string v1, "entertainment"

    .line 9
    .line 10
    const-string v2, "status_text_limit"

    .line 11
    .line 12
    const-string v3, "\u89e3\u9664\u72b6\u6001\u8bcd\u957f\u5ea6\u9650\u5236"

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
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkb/a;->e:La2/a;

    .line 5
    .line 6
    iget-object v1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 7
    .line 8
    iget-object p1, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    if-eqz p1, :cond_5

    .line 11
    .line 12
    sget-boolean v2, Lkb/a;->f:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    monitor-enter v0

    .line 18
    :try_start_0
    sget-boolean v2, Lkb/a;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :cond_1
    :try_start_1
    const-string v2, "com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2"

    .line 25
    .line 26
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v2, 0x1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    const-string p1, "[Hchat:StatusTextLimit] \u672a\u627e\u5230\u72b6\u6001\u8bcd\u7f16\u8f91\u9875\u7c7b"

    .line 34
    .line 35
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sput-boolean v2, Lkb/a;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :try_start_2
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    const-string p1, "[Hchat:StatusTextLimit] \u672a\u627e\u5230\u72b6\u6001\u8bcd\u7f16\u8f91\u9875\u6784\u9020\u65b9\u6cd5"

    .line 55
    .line 56
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-boolean v2, Lkb/a;->f:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    .line 61
    monitor-exit v0

    .line 62
    return-void

    .line 63
    :cond_3
    :try_start_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 78
    .line 79
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 80
    .line 81
    new-instance v5, Lea/b;

    .line 82
    .line 83
    const/4 v6, 0x4

    .line 84
    const/4 v7, 0x0

    .line 85
    invoke-direct {v5, v1, v6, v7}, Lea/b;-><init>(Landroid/content/Context;IZ)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v3, v5}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_4
    sput-boolean v2, Lkb/a;->f:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 93
    .line 94
    monitor-exit v0

    .line 95
    return-void

    .line 96
    :goto_1
    monitor-exit v0

    .line 97
    throw p1

    .line 98
    :cond_5
    :goto_2
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u89e3\u9664\u72b6\u6001\u8bcd\u957f\u5ea6\u9650\u5236"

    .line 2
    .line 3
    return-object v0
.end method
