.class public final Lt6;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Lcom/mr/elaris/c;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt6;->a:Lcom/mr/elaris/c;

    .line 2
    .line 3
    const/16 p1, 0x50

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lt6;->a:Lcom/mr/elaris/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-boolean v0, Ls6;->i:Z

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    array-length v1, v0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne v1, v2, :cond_3

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    aget-object v0, v0, v1

    .line 22
    .line 23
    instance-of v1, v0, Landroid/view/View;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    check-cast v0, Landroid/view/View;

    .line 29
    .line 30
    iget-object v1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v2, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    instance-of v3, v2, Ljava/lang/reflect/Method;

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sget-object v3, Lv6;->b:Ljava/util/Map;

    .line 42
    .line 43
    monitor-enter v3

    .line 44
    :try_start_0
    new-instance v4, Lu6;

    .line 45
    .line 46
    check-cast v2, Ljava/lang/reflect/Method;

    .line 47
    .line 48
    invoke-direct {v4, v1, v2}, Lu6;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Method;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    monitor-exit v3

    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p0

    .line 59
    :cond_2
    :goto_0
    :try_start_1
    iget-object p0, p0, Lt6;->a:Lcom/mr/elaris/c;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lcom/mr/elaris/c;->a(Landroid/view/View;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catchall_1
    move-exception p0

    .line 77
    const-string p1, "group-avatar"

    .line 78
    .line 79
    const-string v0, "long-click-callback"

    .line 80
    .line 81
    invoke-static {p1, v0, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    :goto_1
    return-void
.end method
