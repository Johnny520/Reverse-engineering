.class public final Lvd;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    const-string p0, "eq_unread_full_count"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_3

    .line 8
    .line 9
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    array-length v1, p0

    .line 15
    if-lez v1, :cond_0

    .line 16
    .line 17
    aget-object p0, p0, v0

    .line 18
    .line 19
    instance-of v1, p0, Ljava/lang/Number;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast p0, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    :cond_0
    if-lez v0, :cond_3

    .line 30
    .line 31
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 32
    .line 33
    if-lez v0, :cond_2

    .line 34
    .line 35
    instance-of v1, p0, Landroid/view/View;

    .line 36
    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    sget-object v1, Lxd;->d:Ljava/util/Map;

    .line 41
    .line 42
    check-cast p0, Landroid/view/View;

    .line 43
    .line 44
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 52
    .line 53
    const/4 p1, 0x4

    .line 54
    invoke-static {}, Li5;->i1()Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {p0, v0, p1, v1}, Lxd;->g(Ljava/lang/Object;IILjava/util/Set;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
.end method
