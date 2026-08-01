.class public final Lcom/mr/elaris/u;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Method;

.field public final synthetic b:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/mr/elaris/u;->a:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/mr/elaris/u;->b:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    const/16 p1, 0x46

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    sget-object v0, Lfc;->c:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    move-object v2, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    :try_start_0
    iget-object v2, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 10
    .line 11
    :goto_0
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 16
    sget-object v3, Lfc;->d:Ljava/util/Map;

    .line 17
    .line 18
    monitor-enter v3

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    move-object v0, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :try_start_1
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 24
    .line 25
    :goto_1
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    sget-object v4, Lfc;->e:Ljava/util/Map;

    .line 31
    .line 32
    monitor-enter v4

    .line 33
    :try_start_2
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    move-object v5, v1

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    iget-object v5, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 40
    .line 41
    :goto_2
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v3, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v4

    .line 57
    const-wide/16 v6, 0x28a

    .line 58
    .line 59
    add-long/2addr v4, v6

    .line 60
    sput-wide v4, Lfc;->o:J

    .line 61
    .line 62
    iget-object v4, p0, Lcom/mr/elaris/u;->a:Ljava/lang/reflect/Method;

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v4}, Lfc;->e(Ljava/lang/Class;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {p1, v4}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lfc;->f()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_4

    .line 80
    .line 81
    :goto_3
    return-void

    .line 82
    :cond_4
    const-string p1, "repeater long press menu clicked"

    .line 83
    .line 84
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v0}, Lfc;->b(Landroid/view/View;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, Lcom/mr/elaris/u;->b:Ljava/lang/ClassLoader;

    .line 91
    .line 92
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p0, p1, v2, v3}, Lcom/mr/elaris/MessageRepeater;->repeatFromLongPressMenu(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :catchall_0
    move-exception p0

    .line 101
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    throw p0

    .line 103
    :catchall_1
    move-exception p0

    .line 104
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 105
    throw p0

    .line 106
    :catchall_2
    move-exception p0

    .line 107
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 108
    throw p0
.end method
